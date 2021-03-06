package pro.tmedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TIvaykin on 04.03.2017.
 */
public class CardService {
    static int id = 0;
    List<Card> allCards = new ArrayList<>();
    public CardService() {

        createCard("ПРОГРАММА \"ТЫ ПРЕДПРИНИМАТЕЛЬ\"",
                "Цель программы - популяризация предпринимательства в молодежной среде и образовательно-консультационная помощь начинающим предпринимателям. Мероприятия программы реализуются в 65 регионах России",
                "Необходимо заполнить анкету на участие в программе «Ты — предприниматель» - Хабаровский край. Заполнить анкету.\n" +
                        "Пройти тестирование можно после регистрации на официальном сайте http://kontur-test.ru. Ориентировочное время тестирования 45-60 минут.\n" +
                        "Обучение проходит по заранее согласованному плану. Длительность обучения 72 часа. План обучения будет опубликован на сайте программы molpred27.ru, а также в группе Вконтакте.\n",
                "Г. ХАБАРОВСК, УЛ. ГОГОЛЯ Д. 21Б, ОФИС 302\n" +
                        "E-MAIL: K932526@GMAIL.COM\n" +
                        "ТЕЛ.: +7(4212) 93-25-26\n" +
                        "           +7(4212) 30-91-69\n" +
                        "http://molpred27.ru/about\n", Card.types.event);


        createCard("ПРОГРАММА \"ПРЕАКТУМ\"",
                "Преактум - это сообщество, которое объединяет учащихся, сотрудников вузов и представителей бизнеса и помогает им сообща реализовать проекты, меняющие жизнь людей к лучшему.",
                "Главный элемент программы «Преактум» — это проектные команды, которые создаются на базе российских университетов и состоят из студентов. Эти команды самостоятельно разрабатывают и реализуют проекты, направленные на улучшение жизни людей и решение экономических, социальных и экологических проблем. При этом участники команд должны сами определить масштаб и количество проектов, их направление и сроки реализации. Проекты «Преактум»-команд могут быть как коммерческими (приносящими прибыль), так и социальными.",
                "Г. Москва, Ленинградский проспект 31А/1\n" +
                        "E-MAIL: info@preactum.ru\n" +
                        "ТЕЛ.: +7 (495) 150-40-74     \n" +
                        "http://preactum.ru/about/\n", Card.types.event);
        createCard("Грант от КЦСП",
                "Сумма субсидии (гранта) составляет не более 300 тыс. рублей на одного начинающего субъекта малого предпринимательства – получателя субсидии (гранта). Субсидии (гранты) предоставляются при условии софинансирования начинающим субъектом малого предпринимательства расходов на реализацию бизнес-проекта в размере не менее 15 процентов от суммы получаемой субсидии (гранта), которые не подлежит возмещению.",
                "· заявка на получение государственной поддержки; \n" +
                        "·  копия паспорта индивидуального предпринимателя (учредителя(ей) юридического лица); \n" +
                        "· выписка из реестра акционеров, выданную не ранее чем за десять дней на дату подачи заявки на получение государственной поддержки (для акционерных обществ); \n" +
                        "·  справка за подписью руководителя СМСП; \n" +
                        "· анкета СМСП ; \n" +
                        "· копия(и) документа(ов), подтверждающего(их) отнесение СМСП к приоритетной группе (в случае наличия); \n" +
                        "· в случае если в состав учредителей СМСП входит юридическое лицо с долей в уставном капитале превышающей 25 процентов, то СМСП представляет справку за подписью руководителя юридического лица и выписку из реестра акционеров, выданную не ранее чем за десять календарных дней на дату подачи заявки на получение государственной поддержки (для акционерных обществ). \n" +
                        "· копия документа о прохождении (индивидуальным предпринимателем или учредителем (лями) юридического лица) краткосрочного курса обучения основам предпринимательской деятельности или копию диплома о высшем юридическом и (или) экономическом образовании (профильной переподготовки); \n" +
                        "· бизнес-проект;  \n" +
                        "· копии документов, подтверждающих фактические произведенные затраты, связанные с началом предпринимательской деятельности в размере не менее 15 процентов от запрашиваемой суммы субсидии (гранта), или выписку с банковского счета начинающего субъекта малого предпринимательства, подтверждающую наличие на расчетном счете средств на реализацию бизнес-проекта в размере не менее 15 процентов от запрашиваемой суммы субсидии (гранта); \n" +
                        "· доверенность на право подачи от имени СМСП документов в случае подачи документов через уполномоченного представителя.\n",
                "Г. Хабаровск, ул. Дзержинского, 41\n" +
                        "e-mail:info@kcsp27.ru\n" +
                        "Адрес: 680030, Хабаровск, ул. Дзержинского, 41\n" +
                        "Время работы: 9:00 – 18:00 (обед с 13:00 до 14:00), выходной суббота и воскресенье\n" +
                        "телефон/факс: +7 (4212) 47-44-20\n" +
                        "http://www.kcsp27.ru/services/Grantynachinayushchimpredprinimatelyam/\n", Card.types.grant);
        createCard("Грант \"Молодежный бизнес проект\"",
                "Участниками конкурса являются\n" +
                        "1. Субъекты малого и среднего предпринимательства, осуществляющие свою предпринимательскую деятельность на территории города Хабаровска, учредителями которых являются жители города Хабаровска в возрасте до 30 лет включительно.\n" +
                        "Победители данной категории участников  получают 90 тыс. рублей на реализацию своего проекта.\n" +
                        "2. Учащиеся, студенты образовательных учреждений, слушатели курсов по основам предпринимательства, являющиеся жителями города Хабаровска в возрасте до 35 лет включительно.\n" +
                        "Победители данной категории участников  получают 50 тыс. рублей на реализацию своего проекта.\n",
                "1. Производство продукции производственно-технического назначения и товаров народного потребления.\n" +
                        "2. Предоставление услуг населению.\n" +
                        "Сроки прима документов на участие в конкурсе с 05 февраля по 05 апреля 2017 года\n" +
                        "Заявки для участия в конкурсе претенденты подают в управление по делам молодежи и социальным вопросам администрации города Хабаровска по адресу: 680013, г. Хабаровск, ул. Ленинградская, д. 30 каб. 206 (тел.: 40-89-94).\n" +
                        "Заявка на участие в конкурсе включает в себя следующие документы:\n" +
                        "- заявление об участии в конкурсе (в свободной форме);\n" +
                        "- копию паспорта гражданина Российской Федерации (2, 3-я страницы, страница с указанием места жительства);\n" +
                        "- информационную справку за подписью участника конкурса с отражением показателей в соответствии с Положением о конкурсе;\n" +
                        "- справку из образовательного учреждения, выданную не ранее чем за 60 дней на дату подачи заявления, и (или) копию свидетельства (диплома) о прохождении курса по основам предпринимательства (для участников конкурса, перечисленных в п. 1 (при наличии));\n" +
                        "- справку из банка, подтверждающую наличие расчетного счета;\n" +
                        "- бизнес-план проекта, по которому ранее не был предоставлен грант, субсидия либо премия за победу в аналогичном конкурсе, проводимом администрацией города Хабаровска.\n",
                "Заявки для участия в конкурсе претенденты подают в управление по делам молодежи и социальным вопросам администрации города Хабаровска по адресу: 680013, г. Хабаровск, ул. Ленинградская, д. 30 каб. 206 (тел.: 40-89-94).\n" +
                        "http://www.svoedelo27.ru/news/administraciya-goroda-habarovska-obyavlyaet-o-nachale-priema-dokumentov-na-uchastie-v-konkurse\n", Card.types.grant);
        createCard("Микрозаем \"СТАРТ\"",
                "•\tДля начинающего бизнеса\n" +
                        "•\tСрок до 36 месяцев\n" +
                        "•\tМаксимальная сумма займа до 700 000 руб.\n",
                "СРОК РЕГИСТРАЦИИ БИЗНЕСА\tдо 12 мес.\n" +
                        "СУММА ЗАЙМА\tдо 700 000 рублей\n" +
                        "СРОК ЗАЙМА\tдо 24 месяцев\tдо 36 месяцев\n" +
                        "ПРОЦЕНТНАЯ СТАВКА\t8,25 %\t9,5 %\n",
                "г. Хабаровск, ул. Запарина д. 51, 2 этаж\n" +
                        "+7 (4212) 752-777\n" +
                        "+7 (4212) 752-775\n" +
                        "Email: mail@fond27.ru\n" +
                        "Горячая линия о мерах поддержки предпринимателей:\n" +
                        "8 800 000 00 00 (звонок бесплатный)\n" +
                        "http://www.fond27.ru/conditions/13/\n", Card.types.debt);
        /*createCard("",
                "",
                "",
                "");*/
    }

    private void createCard(String name, String description, String conditions, String contacts, Card.types type) {
        Card card;
        card = new Card();
        card.setId(id++);
        card.setName(name);
        card.setDescription(description);
        card.setConditions(conditions);
        card.setContacts(contacts);
        card.setCity(Card.cities.khabarovsk);
        card.setType(type);
        allCards.add(card);
    }

    // returns a list of all users
    public List<Card> getAllCards() {
        return allCards;
    }

}
