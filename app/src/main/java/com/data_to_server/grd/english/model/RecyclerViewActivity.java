package com.data_to_server.grd.english.model;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.data_to_server.grd.english.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Person> persons;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recyclerview_activity);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("to label / mark something", "пометка,ярлык,лейбл", R.drawable.label_mark));
        persons.add(new Person("to pin something on a notice board", "приколоть что-то на доску для заметок", R.drawable.to_pin));
        persons.add(new Person("to tape a box with a duct tape", "замотать коробку скотчем", R.drawable.duct_tape));
        persons.add(new Person("to erase with an eraser","стирать резинкой", R.drawable.eraser));
        persons.add(new Person("to write with a ball point pen", "писать шариковой ручкой", R.drawable.ball_point_pen));
        persons.add(new Person("to fasten with a paper clip", "закреплять скрепкой", R.drawable.paper_clip));
        persons.add(new Person("to put in a ring binder", "папка с кольцами для файлов", R.drawable.ring_binder));
        persons.add(new Person("to correct with a correction fluid", "откорректировать корректором", R.drawable.correction_fluid));
        persons.add(new Person("to cketch in a notepad", "начертить эскиз в записной книжке", R.drawable.sketch));
        persons.add(new Person("to draw a line", "нарисовать линию", R.drawable.line));
        persons.add(new Person("to fold paper", "складывать бумаги", R.drawable.fold_paper));
        persons.add(new Person("to measure something with a ruler", "измерить что-то линейкой", R.drawable.ruler));
        persons.add(new Person("to cut with scissors", "резать с помощью ножниц", R.drawable.scissors));
        persons.add(new Person("to put a picture frame", "поставить в рамку для фото", R.drawable.frame_with_picture));
        persons.add(new Person("to hand out business cards", "раздавать визитки", R.drawable.to_hand_out_business_card));
        persons.add(new Person("to sort papers into folders", " сортировать бумагу в папках", R.drawable.folders));
        persons.add(new Person("to sharpen pencils with a sharpener", "точить карандаши точилкой", R.drawable.pencil_sharpener));
        persons.add(new Person("to_replace_the_ink", "заменить чернила", R.drawable.ink));
        persons.add(new Person("a highlighter", "маркер для выделения", R.drawable.highlighter));
        persons.add(new Person("a glue stick", "клей карандаш", R.drawable.glue_stick));
        persons.add(new Person("a gray cell phone", "серый телефон", R.drawable.gray_cell_phone));
        persons.add(new Person("a green pancil", "зеленый карандаш", R.drawable.green_pencil));
        persons.add(new Person("a purple dictionary", "фиолетовый словарь", R.drawable.purple_dictionary));
        persons.add(new Person("a card", "карточка", R.drawable.card));
        persons.add(new Person("a diary", "дневник", R.drawable.diary));
        persons.add(new Person("to write down with a marker", "записать с маркером /  отметить маркером", R.drawable.merker_write));
        persons.add(new Person("to give handouts", "раздать листовки", R.drawable.handouts));
        persons.add(new Person("to hang a poster", "повесить плакат, постер", R.drawable.to_hang_a_poster));
        persons.add(new Person("rubber bands", "резинки для стягивания", R.drawable.rubber_bunds));
        persons.add(new Person("a clipboard", "планшетка", R.drawable.clipboard));
        persons.add(new Person("a rubber stamp", "резиновы штамп", R.drawable.rubber_stump));
        persons.add(new Person("a hole punch", "дырокол", R.drawable.hole_punch2));
        persons.add(new Person("post-it/sticky notes", "напоминалки", R.drawable.post_it));
        persons.add(new Person("a filing cabinet", "ящик для папок", R.drawable.filling_cabinet));
        persons.add(new Person("an overhead projector", " проектор на потолке ", R.drawable.overhead_projector));
        persons.add(new Person("to seal an envelope", "запечатать конверт", R.drawable.seal_an_envelope));
        persons.add(new Person("to carry in a pencil case", "носить,хранить в пенале", R.drawable.pencil_case));
        persons.add(new Person("to measure with a protractor", "измерять что-то с помощью транспортира", R.drawable.protractor));
        persons.add(new Person("letter opener", "нож для бумаги", R.drawable.letter_opener));
        persons.add(new Person("a spiral notebook", "записная книжка в переплетке", R.drawable.spiral_notebook));
        persons.add(new Person("a daily planer", "Дневной планер ", R.drawable.daily_planner));

        persons.add(new Person("ladder", "Лестница", R.drawable.ladder));
        persons.add(new Person("Equipment", "Оборудование", R.drawable.equipment));
        persons.add(new Person("Fridge", "Холодильник", R.drawable.fridge));
        persons.add(new Person("go_straight", "прямо", R.drawable.go_straight));

        persons.add(new Person("a pedestrian", "пешеход", R.drawable.us));
        persons.add(new Person("to look in the rear-view window", "смотреть в окно заднего вида", R.drawable.us));
        persons.add(new Person("to wipe off the windshield", "вытереть лобовое стекло", R.drawable.us));
        persons.add(new Person("to crash a car", "разбить машину", R.drawable.us));
        persons.add(new Person("to run over somebody", "переехать кого-то", R.drawable.us));
        persons.add(new Person("to start the ignition", "начать зажигание", R.drawable.us));
        persons.add(new Person("to drive too fast for conditions", "ездить слишком быстро для условий движения", R.drawable.us));
        persons.add(new Person("to fasten the seat belt", "пристегнуть ремень безопасности", R.drawable.us));
        persons.add(new Person("to get away with a warning", "отделаться предупреждением", R.drawable.us));
        persons.add(new Person("to slow down", "замедлить, ехать медленнее", R.drawable.us));
        persons.add(new Person("to speed", "мчаться, превышать скорость", R.drawable.us));
        persons.add(new Person("to exceed the speed limit", "превышать разрешенную скорость", R.drawable.us));
        persons.add(new Person("to overtake a car", "обогнать автомобиль", R.drawable.us));
        persons.add(new Person("to get a citation", "получить повестку с требованием оплатить штраф / явиться в суд", R.drawable.us));
        persons.add(new Person("to insure a car", "застраховать автомобиль", R.drawable.us));
        persons.add(new Person("to have a car registration", "иметь регистрацию автомобиля", R.drawable.us));
        persons.add(new Person("to tank at a gas station", "заправлять бак на заправочной станции", R.drawable.us));
        persons.add(new Person("to cross at the pedestrian crossing", "переходить на пешеходном переходе", R.drawable.us));
        persons.add(new Person("to look at the traffic lights", "посмотреть на светофор", R.drawable.us));
        persons.add(new Person("to stop at the junction", "остановиться на пересечении / на перекрестке", R.drawable.us));


        persons.add(new Person("to break the law", "to negotiate a contract", R.drawable.us));
        persons.add(new Person("to negotiate a contract", "заключить контракт", R.drawable.us));
        persons.add(new Person("to file a court case", "подать дело в суд", R.drawable.us));
        persons.add(new Person("to commit / report a crime", "совершить / заявить о преступлении", R.drawable.us));
        persons.add(new Person("to hire a lawyer", "нанимать адвоката", R.drawable.us));
        persons.add(new Person("to be charged with", "обвиняться в / нести ответственность за что-либо", R.drawable.us));
        persons.add(new Person("to appear in court", "предстать перед судом", R.drawable.us));
        persons.add(new Person("to plead innocent / guilty", "признать себя невиновным / виновным", R.drawable.us));
        persons.add(new Person("to be a member of the jury", "быть членом суда присяжных", R.drawable.us));
        persons.add(new Person("to hear a case", "слушать дело", R.drawable.us));
        persons.add(new Person("to object to the statement", "возражать против заявления", R.drawable.us));
        persons.add(new Person("to be charged with robbery", "быть обвиненным в ограблении", R.drawable.us));
        persons.add(new Person("to suspect / question a witness", "подозревать / допрашивать свидетеля", R.drawable.us));
        persons.add(new Person("a court is in session", "суд идет", R.drawable.us));
        persons.add(new Person("to have an alibi", "иметь алиби", R.drawable.us));
        persons.add(new Person("to negotiate a contract", "заключить контракт", R.drawable.us));
        persons.add(new Person("to break the law", "to negotiate a contract", R.drawable.us));

        //Cities and infrastructures
        persons.add(new Person("a road junction", "транспортная развязка", R.drawable.us));
        persons.add(new Person("bustling city life", "шумная городская жизнь", R.drawable.us));
        persons.add(new Person("a city hall", "мэрия", R.drawable.us));
        persons.add(new Person("a city district", "городской округ/ квартал", R.drawable.us));
        persons.add(new Person("a multicultural uptown", "многокультурная окраина", R.drawable.us));
        persons.add(new Person("a cosmopolitan downtown", "многонациональный центр города", R.drawable.us));
        persons.add(new Person("a clean neighborhood", "чистый район", R.drawable.us));
        persons.add(new Person("overloaded roads", "перегруженные дороги", R.drawable.us));
        persons.add(new Person("developed infrastructure", "развитая инфраструктура", R.drawable.us));
        persons.add(new Person("to be open 24 / 7", "работать круглосуточно 7 дней в неделю", R.drawable.us));
        persons.add(new Person("a high rise building", "высотное здание", R.drawable.us));
        persons.add(new Person("tourist attraction", "туристическая достопримечательность", R.drawable.us));
        persons.add(new Person("a must-see", "нужно обязательно осмотреть", R.drawable.us));
        persons.add(new Person("a transportation option", "вариант транспортировки", R.drawable.us));
        persons.add(new Person("a convenient accommodation", "удобное размещение (жилье)", R.drawable.us));
        persons.add(new Person("a fascinating landscape", "увлекательный пейзаж", R.drawable.us));
        persons.add(new Person("an admission fee", "плата за вход", R.drawable.us));
        persons.add(new Person("a sleeping district", "спальный квартал", R.drawable.us));
        persons.add(new Person("inhabitants", "жители", R.drawable.us));
        persons.add(new Person("population", "население", R.drawable.us));

        persons.add(new Person("to accuse somebody of something", "обвинить кого-то в чем-то", R.drawable.us));
        persons.add(new Person("to be convicted", "быть осужденным", R.drawable.us));
        persons.add(new Person("to file a civil case / for divorce", "подать гражданский иск / на развод", R.drawable.us));
        persons.add(new Person("to sue someone", "(подавать в суд на) возбудить иск против кого-то", R.drawable.us));
        persons.add(new Person("a court case", "судебное дело", R.drawable.us));
        persons.add(new Person("to complete paperwork", "завершать оформление документов", R.drawable.us));
        persons.add(new Person("to claim compensation", "требовать компенсацию", R.drawable.us));
        persons.add(new Person("to have the right to", "to claim compensation", R.drawable.us));
        persons.add(new Person("to testify against somebody", "давать показания против кого-то", R.drawable.us));
        persons.add(new Person("common law marriage", "гражданский брак", R.drawable.us));
        persons.add(new Person("to present evidence", "представлять доказательства", R.drawable.us));
        persons.add(new Person("to inherit property", "наследовать имущество", R.drawable.us));
        persons.add(new Person("to rule the case", "вести дело", R.drawable.us));
        persons.add(new Person("to announce a verdict", "объявить приговор", R.drawable.us));
        persons.add(new Person("to settle the dispute", "урегулировать спор", R.drawable.us));
        persons.add(new Person("to protect intellectual property", "защищать интеллектуальную собственность", R.drawable.us));
        persons.add(new Person("проверять справку / рекомендации", "проверять справку / рекомендации", R.drawable.us));
        persons.add(new Person("to resolve disputes", "разрешать споры", R.drawable.us));
        persons.add(new Person("to get something under the contract", "получать что-то по контракту", R.drawable.us));
        persons.add(new Person("to be prejudiced / unprejudiced", "быть предвзятым / непредвзятым", R.drawable.us));
         persons.add(new Person("to terminate a contract", "разорвать контракт", R.drawable.us));
        persons.add(new Person("to be legitimate", "быть законным, иметь юридическую силу", R.drawable.us));
        persons.add(new Person("to forge currency", "подделывать валюту", R.drawable.us));
        persons.add(new Person("a copyright infringement", "нарушение авторских прав", R.drawable.us));
        persons.add(new Person("to hear a testimonial", "слушать показания", R.drawable.us));
        persons.add(new Person("the parties of the contract", "стороны договора", R.drawable.us));
        persons.add(new Person("the conditions and warranties of the contract", "условия и гарантии контракта", R.drawable.us));
        persons.add(new Person("an agency agreement", "договор об оказании агентских услуг", R.drawable.us));
        persons.add(new Person("to file a petition", "подать прошение в суд/ петицию", R.drawable.us));
        persons.add(new Person("арбитражный процесс", "арбитражный процесс", R.drawable.us));
        persons.add(new Person("to be law obedient", "быть законопослушным", R.drawable.us));
        persons.add(new Person("a breach of contract", "нарушение контракта", R.drawable.us));
        persons.add(new Person("a liability", "ответственность", R.drawable.us));
        persons.add(new Person("to be a legally binding contract", "быть юридически обязывающим договором", R.drawable.us));
        persons.add(new Person("to ratify the agreement", "ратифицировать соглашение", R.drawable.us));

   //Accidents and Hospitals

        persons.add(new Person("admissions", "приёмное отделение", R.drawable.us));
        persons.add(new Person("a digestive problem", "проблема с пищеварением", R.drawable.us));
        persons.add(new Person("an ENT specialist / an otolaryngologist", "ЛОР / отоларинголог", R.drawable.us));
        persons.add(new Person("a family doctor", "семейный доктор", R.drawable.us));
        persons.add(new Person("a heart attack", "сердечный приступ", R.drawable.us));
        persons.add(new Person("intensive care unit", "реанимационное отделение", R.drawable.us));
        persons.add(new Person("a migraine", "мигрень", R.drawable.us));
        persons.add(new Person("an optometrist / optician", "оптик", R.drawable.us));
        persons.add(new Person("respiratory disease", "респираторное заболевание", R.drawable.us));
        persons.add(new Person("a serious condition", "серьезное заболевание", R.drawable.us));
        persons.add(new Person("a surgeon", "хирург", R.drawable.us));
        persons.add(new Person("to be back on ones feet", "стать на ноги", R.drawable.us));
        persons.add(new Person("to be prescribed drugs", "иметь прописанные лекарства", R.drawable.us));
        persons.add(new Person("to check vital signs", "проверить показатели жизненно важных функций", R.drawable.us));
        persons.add(new Person("to have appendicitis", "иметь апендицит", R.drawable.us));
        persons.add(new Person("to have high blood pressure", "иметь высокое давление", R.drawable.us));
        persons.add(new Person("to have side effects", "иметь побочные эффекты", R.drawable.us));
        persons.add(new Person("to have spine problems", "иметь проблемы с позвоночником", R.drawable.us));
        persons.add(new Person("to prevent complications", "предотверждать осложнения", R.drawable.us));
        persons.add(new Person("to suffer from a diabetes", "страдать от диабета", R.drawable.us));
        persons.add(new Person("an HIV", "ВИЧ", R.drawable.us));
        persons.add(new Person("a bone fracture", "перелом кости", R.drawable.us));
        persons.add(new Person("to be stung by a bee", "получить пчелиный укус", R.drawable.us));
        persons.add(new Person("to have a concussion", "иметь сотрясение", R.drawable.us));
        persons.add(new Person("to become swollen", "стать опухшим", R.drawable.us));
        persons.add(new Person("to get a black eye", "получить синяк", R.drawable.us));
        persons.add(new Person("to get a lump", "набить шишку", R.drawable.us));
        persons.add(new Person("an acne", "прыщ", R.drawable.us));
        persons.add(new Person("to get indigestion", "получить расстройство желудка", R.drawable.us));
        persons.add(new Person("to get sunburnt", "получить солнечный ожог", R.drawable.us));


        //Dilemmas Problems and Solutions
        persons.add(new Person("to meet the deadline", " уложиться в срок", R.drawable.us));
        persons.add(new Person("a project management", "управление проектами", R.drawable.us));
        persons.add(new Person("to find sponsors", "найти спонсоров", R.drawable.us));
        persons.add(new Person("to fund the project", "финансировать проект", R.drawable.us));
        persons.add(new Person("to make up your mind", "принимать решение / решаться на что-либо", R.drawable.us));
        persons.add(new Person("to sort the problem out", "уладить проблему", R.drawable.us));
        persons.add(new Person("to ask for expert advice", "попросить консультацию экспертов", R.drawable.us));
        persons.add(new Person("to talk something over", "обговорить что-либо", R.drawable.us));
        persons.add(new Person("to think over something", "обдумать что-то", R.drawable.us));
        persons.add(new Person("to think of doing something", "думать о том, чтобы что-то сделать", R.drawable.us));
        persons.add(new Person("to think straight", "хорошо соображать", R.drawable.us));
        persons.add(new Person("to think for yourself", "думать за себя / самостоятельно", R.drawable.us));
        persons.add(new Person("I don´t think so", "я так не думаю", R.drawable.us));
        persons.add(new Person("to be broken down", "быть разбитым", R.drawable.us));
        persons.add(new Person("to need recharging", "", R.drawable.us));
        persons.add(new Person("to be out of order", "выйти из строя, не работать", R.drawable.us));
        persons.add(new Person("to need fixing", "нуждаться в ремонте", R.drawable.us));
        persons.add(new Person("to go wrong", "не удасться, пойти не так", R.drawable.us));
        persons.add(new Person("to deal with complaints", "разбираться с жалобами", R.drawable.us));
        persons.add(new Person("to be dissatisfied", "быть неудовлетворенным, недовольным", R.drawable.us));
        persons.add(new Person("to supervise staff", "контролировать сотрудников", R.drawable.us));
        persons.add(new Person("to maintain office equipment", "поддерживать офисное оборудование", R.drawable.us));
        persons.add(new Person("to assign tasks", "поручать задания", R.drawable.us));
        persons.add(new Person("to evaluate staff performance", "оценивать работу персонала", R.drawable.us));
        persons.add(new Person("to get in touch with", "связаться с кем-либо", R.drawable.us));
        persons.add(new Person("to distribute information", "распространять информацию", R.drawable.us));
        persons.add(new Person("to carry out a responsibility", "нести ответсвенность", R.drawable.us));
        persons.add(new Person("to brainstorm the ideas", "провести коллективное обсуждение идей", R.drawable.us));
        persons.add(new Person("to handle requests", "обрабатывать запросы", R.drawable.us));
        persons.add(new Person("to make / deliver a presentation", "сделать / выступать с презентацией", R.drawable.us));
        persons.add(new Person("to hold a business meeting", "проводить деловую встречу", R.drawable.us));
          /*
        persons.add(new Person("to hold a business meeting", "проводить деловую встречу", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));
        persons.add(new Person("Balnk", "рус", R.drawable.us));

*/


    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);//RecyclerView.Adapter
        rv.setAdapter(adapter);
    }
}
