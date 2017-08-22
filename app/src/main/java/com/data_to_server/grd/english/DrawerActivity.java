package com.data_to_server.grd.english;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.data_to_server.grd.english.view.ScreenOne;
import com.data_to_server.grd.english.view.ScreenThree;

public class DrawerActivity extends AppCompatActivity {

    private String[] mScreenTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(com.data_to_server.grd.english.R.layout.activity_drawer);

        mTitle = mDrawerTitle = getTitle();//CharSequence
        mScreenTitles = getResources().getStringArray(com.data_to_server.grd.english.R.array.screen_array);
        mDrawerLayout = (DrawerLayout) findViewById(com.data_to_server.grd.english.R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(com.data_to_server.grd.english.R.id.drawer_list);

        // Настраиваем адаптер для списка в drawer меню:(берутся значения с массива и кладутся в список)
        mDrawerList.setAdapter(new ArrayAdapter<String>(this, com.data_to_server.grd.english.R.layout.nav_draw, mScreenTitles));

        // Настраиваем слушателя нажатий по пунктам списка меню:
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        // Активируем кнопку Home в панели Action Bar:
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //конструктор ActionBarDrawerToggle ~?
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, com.data_to_server.grd.english.R.drawable.ic_drawer,
                com.data_to_server.grd.english.R.string.drawer_open, /* Описание открытого меню  */
                com.data_to_server.grd.english.R.string.drawer_close /* Описание закрытого меню */
        )

        {
            // Вызывается, когда Navigation Drawer находится в полностью открытом состоянии,
            // устанавлииваем соответствующий заголовок на панели:
            public void onDrawerOpened(View drawerView) {
                getSupportActionBar().setTitle(mDrawerTitle);
                supportInvalidateOptionsMenu();
            }

            // Вызывается, когда Navigation Drawer находится в полностью закрытом состоянии,
            // устанавлииваем соответствующий заголовок на панели:
            public void onDrawerClosed(View view) {
                getSupportActionBar().setTitle(mTitle);
                supportInvalidateOptionsMenu();
            }
        };

        // Настраиваем переключатель состояния DrawerListener:
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        // При первом запуске приложения настраиваем запуск и отображение первого фрагмента:
        if (savedInstanceState == null) {
            selectItem(0);
        }
    }// End  onCreate()

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Заполняем меню:
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(com.data_to_server.grd.english.R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        // При открытом боковом меню, скрываем остальные элементы, не относящиеся к нему:
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
        menu.findItem(com.data_to_server.grd.english.R.id.action_search).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        // Настраиваем действие кнопки поиска:
        switch(item.getItemId()) {
            case com.data_to_server.grd.english.R.id.action_search:

                // Показываем Toast сообщение о поиске:
                Toast.makeText(this, com.data_to_server.grd.english.R.string.action_search, Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // Настраиваем слушателя нажатий по пунктам меню списка в Navigation Drawer:
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    // Выполняем переключения между выбираемыми фрагментами:
    private void selectItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new ScreenOne();
                break;
            case 1:
              //  fragment = new ScreenTwo();

                Intent intent = new Intent(this,com.data_to_server.grd.english.model.RecyclerViewActivity.class);
                startActivity(intent);
                break;
            case 2:
                fragment = new ScreenThree();
                break;
            default:
                break;
        }

        // Выполняем смену фрагмента:
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(com.data_to_server.grd.english.R.id.frame_for_drawer, fragment).commit();

            // Выделяем выбранный пункт, обновляем заглавие, закрываем drawer панель:
            mDrawerList.setItemChecked(position, true);
            setTitle(mScreenTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);

        } else {
            // В случае проблем высвечиваем ошибку
            Log.e(this.getClass().getName(), "Произошла ошибка!");
        }
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }

    // При спользовании ActionBarDrawerToggle, нужно вызывать методы onPostCreate() и onConfigurationChanged():
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Синхронизиет состояние переключателя после действия onRestoreInstanceState
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Передает любые изменения конфигурации в  drawer переключатель
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
}
