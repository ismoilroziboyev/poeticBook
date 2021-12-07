package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service;

import java.util.ArrayList;
import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.HeaderAndFooterModel;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;

public class LoadData {


    public static HeaderAndFooterModel getSozboshi() {
        return new HeaderAndFooterModel("So’zboshi", "muqaddima", "\tAssalomu alaykum, Qadrligim!\n" +
                "So’zboshi o’rnida O’tkir Hoshimovning “Dunyoning ishlari” qissasidan parchani qo’llamoqchiman:\n" +
                "\n" +
                "“Esingizdami, oyi, siz bir marta, atigi bir marta, o’shandayam, hazillashib: “Meniyam kitob qilib yozsang-chi, o’g’lim” degandingiz. Men: “Sizning nimangizni kitob qilaman, oyi?” degan edim. Xafa bo’lmang, men hazillashgan edim. Mana, o’sha kitob. Yo’q, uni men yozganim yo’q. Uni siz yozgansiz. Men uni qog’ozga tushirib, odamlarga tarqatdim, xolos. Men uni dunyodagi hamma onalar o’qishini xohlayman. Bilaman, dunyodagi hamma onalar yaxshi. Shunday bo’lsa ham, ularning hammasi sizga o’xshashini xohlayman.”...\n" +
                "\n" +
                "“Dunyoning ishlari” qissasi meni juda ilhomlantirdi va shu kabi shoh asar nomini ilk to’plamimga berishga qaror qildim. \n" +
                "\n" + "Usmonxon Hamidov\n");
    }


    public static HeaderAndFooterModel getXotima() {
        return new HeaderAndFooterModel("Xotima", "xotima", "\tQadrligim, siz bilan sanoqli daqiqalar ichra birga bo’ldik degan umiddaman.\n" +
                "Bu kitob men uchun qadrli. Chunki bu to’plamda xotiralar yashirin.\n" +
                "Balki, she’r shuning uchun yozilar?\n" +
                "Men barcha ijod ahli kabi bu to’plamni yakunlamoqchi emasman.\n" +
                "Chunki, bir xillik odatiy munosabatlarni buzadi!\n" +
                "Sevgi haqida ko’plab she’rlar yozdim. Shungami ko’pchilik menga “Sevgi nima?” degan savol bilan murojaat qiladi. Sizningcha sevgi nima?\n" +
                "Men esa sizga sevgi nimaligini bugun aytishga qaror qildim.\n" +
                "Sevgi nima?\n" +
                "Sevgi - baxt! Bo‘lmagan gap! Men ko‘rdim, sevgan qanday dard chekkanligini, sevilganning ham o‘ziga yarasha azoblarini...\n" +
                "Sevgi - dard! Bu ham noto‘g‘ri fikr. Sevib uning har bir so‘zlaridan quvonyapgan oshiqni ko‘rdim. Aldanayotganiga qaramay sevib yashayotgan laylini ko‘rdim...\n" +
                "Sevgi - ro‘yo! Unda Farhod va Shirin, Otabek va Kumushlar qayerdan keldi?\n" +
                "Sevgi mavjud deydigan birodarim, sevdingizmi?\n" +
                "Nechtasini?\n" +
                "Nima uchun?\n" +
                "Qachongacha?\n" +
                "Undan nima xohlaysiz?\n" +
                "Javoblaringiz aniqmi?\n" +
                "Baribir adashdingiz, hamma savolga to‘g‘ri javob berishni iloji yo‘q...\n" +
                "Undan siz kamida sizni sevishini xohlaysiz, chin oshiq esa hech narsa kutmay sevadi... Agar siz shunday javob berdingiz ham deylik, qachongacha degan savolimga nima deb javob berdiz? Qachongacha buni faqat Alloh biladi! \n" +
                "ALLOH buyukdir! U yaratgan bu muxabbat sevgi ham buyuk tuyg‘u! Uni qanday xohishlarga, hislarga adashtirmang! Sevgi har kimga ham berilmaydi, sevish uchun yurak kerak!\n" +
                "Siz sevasiz, u sevmaydimi?\n" +
                "Uni sog‘indingizmi? U sizniki bo‘lishini xohlaysizmi? Allohdan so‘rang! Chunki Allohgina faqat yuraklarga tuyg‘ularni solib qo‘ya oladi! \n" +
                "Siz sevasiz, u ham sevadimi? Yana uning panohini Allohdan so‘rang! Allohdan boshqa kim sizga panoh bo‘la oladi? Allohdan so‘rang! Uning har bir qadamida farishtalar asrasin! Unga iymon so‘rang, zero, u ham sizni Allohdan so‘rasin! Sizni faqat musulmonligingiz uchun sevsin! Sevgan insoningizni ehtiyot qiling! Allohdan so‘rang! Har bir ishiga omad, zafar, agar u dunyodagi eng yuraksiz inson bo‘lsa ham Allohning bir amri bilan, u sevadi. Seving! Lekin xech kimni va xech narsa Allohdan ko‘proq sevmang! Alloh aytadi: \"Usiz yasholmayman dema, usiz ham yashataman!\" \n" +
                "Allohdan so‘radingiz, bermayaptimi? Demak, bu siz uchun ziyonligini bilib turibdi! Albatta, Alloh suygan bandalariga eng yaxshisini beradi!\n" +
                "Shu mening xulosam.\n" +
                "Shu so’zlarimini xotima o’rnida qabul qilasiz degan umiddaman.\n" +
                "Xech qachon taslim bo’lmang. Orzularingiz va maqsadlaringizga intilib yashang.\n" +
                "Chunki, Bizni kutar biz kutgan kunlar!\n" +
                "\n" +
                "E’tiboringiz uchun tashakkur.\n\n\n");
    }


    public static Chapter getfirstChapter() {
        Chapter chapter = new Chapter("Kechiring onam", new ArrayList<>(), R.drawable.kechiring_onam_image);

        List<Poet> poetList = new ArrayList<>();

        poetList.add(new Poet("Dunyoning ishlari", "Dunyoning ishlari qiziq-da qarang,\n" +
                "Ko’zim to’la yosh yozyapman arang,\n" +
                "Hammasi bir-bir o’tadi ko’zdan,\n" +
                "Seni shoir qilgan aslida onang.\n" +
                "\n" +
                "Oymomo haqida qo’shiqlar qani?\n" +
                "Qabristonda bobo ovutar mani,\n" +
                "Eslayman o’sha afsonalarni,\n" +
                "Tushimda kelibsiz, meni ko’rgani.\n" +
                "\n" +
                "Dunyo ishlaridan kech qolsam uyga,\n" +
                "Kutardi onam, dili har kuyda,\n" +
                "O’ylardi, bolam, tinch, omonmi?\n" +
                "Ko’ziga uyqu kelmaydi shunga.\n" +
                "\n" +
                "Onam aytgan cho’pchaklar qani?\n" +
                "Akamga mehribon qilgandir mani?\n" +
                "Yig’laydi siz deb Nilu ham bugun,\n" +
                "Zebi xolam keldi, sizni ko’rgani.\n\n" +
                "Kavkazga bordim, do’stlarim bilan,\n" +
                "Gilam paypoq oldim, pullarim bilan,\n" +
                "Uyda yo’qligiz tushdi yodimga,\n" +
                "Ko’z yoshim artaman qo’llarim bilan.\n" +
                "\n" +
                "Bitta suratingiz topolmayapman,\n" +
                "Sizdek mehribon bo’lolmayapman,\n" +
                "Xiyonat qilmoqda, do’stlarim menga,\n" +
                "Dardlarim xech kimga aytolmayapman.\n" +
                "\n" +
                "Dardkashim edingiz, dardingiz edim,\n" +
                "Gunohkor edingiz, gardingiz edim,\n" +
                "Men uchun kuyunchak edi-ya onam,\n" +
                "Parvona edingiz, beparvo edim.\n" +
                "\n" +
                "Bahor qabristondan uyg’onmoqdadir,\n" +
                "Qayerdadir alla yangramoqdadir,\n" +
                "Yurakdan bir iltijo sachramoqdadir:\n" +
                "Dunyoning ishlari qiziq-da qarang.\n", false, R.drawable.dunyoning_ishlari, "Kechiring onam"));

        poetList.add(new Poet("Baxtim – Onam", "She’rlar yozdim dasta-yu dasta,\n" +
                "Dillar yayrar, yuraklar xasta,\n" +
                "Yozolmadim umri menga payvasta,\n" +
                "Yurakdan kelar ko’zyoshim asta.\n" +
                "\n" +
                "Tugamas sizdan behisob qarzim,\n" +
                "Ko’targan sho’xlig-u fig’oni arzim,\n" +
                "Meni ma’yusim, yuragi darzim,\n" +
                "E’zozlash sizni farzandlik farzim.\n" +
                "\n" +
                "Siz meni gulshanim, mehri daryoyim,\n" +
                "Yonimda, yodimda, kelmas parvoyim,\n" +
                "Endi eshitadi, kimlar da’voyim,\n" +
                "Kechirarmikin, u meni xatoyim.\n" +
                "\n" +
                "Jannatim, volidam, mening panohim,\n" +
                "Baxtim – Onam, doim asra Allohim.\n", false, R.drawable.baxtim_onam, "Kechiring onam"));

        poetList.add(new Poet("Onamni ko’rgani boraman", "Yurakdan chiqqan bir so’zim,\n" +
                "Qay tomon ketayin, bir o’zim,\n" +
                "Yoshlarga to’ldi-ku oh, ko’zim,\n" +
                "So’ramang, qayerga, qay tomon,\n" +
                "Onamni ko’rgani boraman.\n" +
                "\n" +
                "Tushimga kiribdi kechasi,\n" +
                "Yodimda yoshlikning kulchasi,\n" +
                "Ketyapman, mozorning yo’lchasi,\n" +
                "Sog’indim, jannatim, ey, yomon,\n" +
                "Onamni ko’rgani boraman.\n" +
                "\n" +
                "Bormabman tiriklik chog’izda,\n" +
                "“Sevaman” so’zlarim og’izda,\n" +
                "Yig’laganim ne endi yo’g’izda,\n" +
                "Sog’indim, Jannatim, ey, yomon,\n" +
                "Onamni ko’rgani boraman.\n", false, R.drawable.onamni_korgani_boraman, "Kechiring onam"));

        poetList.add(new Poet("Kechiring onam", "Yoshlikning zavqida sho’xliklar qilib,\n" +
                "Hayot lazzati deb muhabbat tuyib,\n" +
                "Yuraveribman, eh, ona, qizlarni suyib,\n" +
                "Sizni o’ylamabman, mening yagonam,\n" +
                "Dilingiz og’ritdim, kechiring onam.\n" +
                "\n" +
                "Do’stlarim: “Yur!” desa ketaveribman,\n" +
                "Ko’chada daydib, yuraveribman,\n" +
                "Oyog’ingiz bosishga yaramabman, oh,\n" +
                "Sizni o’ylamabman, mening yagonam,\n" +
                "Dilingiz og’ritdim, kechiring onam.\n" +
                "\n" +
                "Bilsam, onam tunda kelishim kutar,\n" +
                "Bilsam, onam buyuk bo’lishim kutar,\n" +
                "Bilsam, onam doim qo’limdan tutar,\n" +
                "Mana, endi qo’lingizdan tutaman, onam,\n" +
                "Meni kechiring, kechiring onam.\n", false, R.drawable.kechiring_onam, "Kechiring onam"));

        chapter.setPoetList(poetList);
        return chapter;
    }


    public static Chapter getSecondChapter() {
        Chapter chapter = new Chapter("Aminmisiz unutganizga?", new ArrayList<>(), R.drawable.aminmisiz_unutganizga);

        List<Poet> poetList = new ArrayList<>();

        poetList.add(new Poet("Yig’lamang o’lsam", "Tushdek o’tgan umrimdan tushdek ketsam,\n" +
                "Nahot, hayotdan baxt ko’rmay o’tsam,\n" +
                "Hayot so’ngida shunday she’r bitsam,\n" +
                "Ey, dunyo, yig’lama, yig’lama o’lsam.\n" +
                "\n" +
                "Bu besh kunlik hayotda o’lim haq ekan,\n" +
                "Bir kun kelib, bir kafan senga naqd ekan,\n" +
                "Bilganim hayotda yashash baxt ekan,\n" +
                "Ey, do’stim, yig’lama, yig’lama o’lsam.\n" +
                "\n" +
                "Armon bo’ldi baxt menga, ey, Gulim,\n" +
                "Sevgim saqlolmadim ayirdi o’lim,\n" +
                "Sevgimizdan qurmadik bir bog’i so’lim,\n" +
                "Ey, sevgim, yig’lama, yig’lama o’lsam.\n" +
                "\n" +
                "O’lganimda qabrimga tosh qo’ymang sira,\n" +
                "O’lganimda bu osmonlar tortganda xira,\n" +
                "Yig’lasa chindan yig’lar onam men deya,\n" +
                "Ey, onam, yig’lamang, yig’lamang o’lsam.\n", false, R.drawable.yiglamang_olsam, "Aminmisiz unutganizga?"));

        poetList.add(new Poet("Baxt tilayman", "Bugun xuddi qalblarning so’ngi kuni,\n" +
                "Bugun barcha so’zlar chiqar ko’ngildan,\n" +
                "Endi mensiz sizga baxtning buguni,\n" +
                "Bugun sizga baxt tilayman chin dildan.\n" +
                "\n" +
                "Oq libosda ketyapsiz ko’z o’ngimda,\n" +
                "Bugun bir armonsiz ko’nglimda,\n" +
                "Gulim, yig’lama, bir bor kulgin-da,\n" +
                "Bugun sizga baxt tilayman chin dildan.\n", false, R.drawable.baxt_tilayman, "Aminmisiz unutganizga?"));

        poetList.add(new Poet("Gulim", "Hayotdan charchab, hayolga cho’mib,\n" +
                "Yoningda jufti haloling bo’lib,\n" +
                "Shamollar tunda derazang qo’nib,\n" +
                "Eslatsa meni, yig’lama Gulim.\n" +
                "\n" +
                "Shamollar ketib, ketsa bo’ronlar,\n" +
                "Yurakdan titrab kelsa armonlar,\n" +
                "Bariga sabab o’sha yolg’onlar,\n" +
                "Eslatsa meni, yig’lama Gulim.\n" +
                "\n" +
                "Unut meni, o’chir yurakdan,\n" +
                "Balki endi senga kerakman,\n" +
                "Mana endi senga ertakman,\n" +
                "Eslasang meni, yig’lama Gulim.\n", false, R.drawable.gulim, "Aminmisiz unutganizga?"));

        poetList.add(new Poet("Aminmisiz unutganizga?\n(26-oktabr.2019 yil)", "Kecha mensiz yasholmagan qiz,\n" +
                "Ketmoqdasiz bugun, bugun siz,\n" +
                "O’ylamasdan endi yashaysiz,\n" +
                "Aminmisiz unutganizga?\n" +
                "\n" +
                "Unutish oson ekan bilmabmiz,\n" +
                "“Shuncha yashab bir bor sevmabmiz”\n" +
                "Shu gaplarni bizga aytgan siz,\n" +
                "Aminmisiz unutganizga?\n" +
                "\n" +
                "Yig’lama, ko’z yoshlar yurak tig’laydi,\n" +
                "Qachon o’laman hech kim bilmaydi,\n" +
                "Yig’lasa qabrim uzra bir qiz yig’laydi,\n" +
                "Aminmisiz unutganizga?\n", false, R.drawable.aminmisiz_unutgganizga, "Aminmisiz unutganizga?"));

        chapter.setPoetList(poetList);
        return chapter;
    }

    public static Chapter getThirdChapter() {
        Chapter chapter = new Chapter("Ishonmay qo’ydim", new ArrayList<>(), R.drawable.ishonmay_qoydim);

        List<Poet> poetList = new ArrayList<>();

        poetList.add(new Poet("Chortoqsoy", "Yo’limning boshisan... Manzilim so’ngi,\n" +
                "Men uchun yo’q buni o’ng-u so’lgi,\n" +
                "Nochorman bugun, oqma ortiq, soy,\n" +
                "Sevgi tugadi, oqma Chortoqsoy.\n" +
                "\n" +
                "Sen ayirding o’rtamizni ayt nega?\n" +
                "Suzar edim qarshi turib oqinga,\n" +
                "Oqma ular tomon, oqma ortiq, soy,\n" +
                "Dardim a’yon-ku, oqma Chortoqsoy.\n" +
                "\n" +
                "Umrim o’tdi yo’lingda, yoningda edim,\n" +
                "Edim qalbing, vujuding edim,\n" +
                "O’ldirishdi vujuding, oqma ortiq, soy,\n" +
                "Oqsang, ortga oqqin, oqqin, Chortoqsoy.\n" +
                "\n" +
                "Bugun shoiringni kimlardir tanir,\n" +
                "Kimlardir yomonlar, qaysidir g’anim,\n" +
                "Oqayotgan suvdan yoshim ortiq, soy,\n" +
                "Meni kechir, do’stim Chortoqsoy.\n", false, R.drawable.chortoqsoy, "Ishonmay qo’ydim"));

        poetList.add(new Poet("Qadrimga yig’layman", "Qadrimga yig’layman, qadrimga xolos,\n" +
                "Ko’p arzon sotilgan, sevgimga xolos,\n" +
                "Sevgi-ku mayliga topilar desam,\n" +
                "Do’stlar ham tortirgan azob-ku xolos.\n" +
                "\n" +
                "Baxt bersa so’zidan har bir yaqining,\n" +
                "Dard ketsa ko’zidan har bir yaqining,\n" +
                "Nafi tegmay senga xech koringda,\n" +
                "Gard yetsa o’zidan har bir yaqining.\n" +
                "\n" +
                "Qadrimga yig’layman, qadrimga xolos,\n" +
                "Men yuzsiz bo’lmabman shugina aybim,\n" +
                "Qadrimga yig’layman, qadrimga xolos,\n" +
                "Yuzsizlar ko’rib og’riydi qalbim.\n", false, R.drawable.qadrimga_yiglayman, "Ishonmay qo’ydim"));

        poetList.add(new Poet("She’r yozganimga ham ancha bo’libdi", "Hayolni hayotga qo’yib bo’lmaydi,\n" +
                "Ham sevib, ham o’qib yurib bo’lmaydi,\n" +
                "Baribir hayotga yurak to’ymaydi,\n" +
                "She’r yozganimga ham ancha bo’libdi.\n" +
                "\n" +
                "Kunlar o’tibdi-da bekor, beso’roq,\n" +
                "Yurak ko’nibdi-da bir oydan ko’proq,\n" +
                "Sog’inib sog’indim, labimda titroq,\n" +
                "She’r yozganimga ham ancha bo’libdi.\n" +
                "\n" +
                "Kimdir gapiradi, balki ortimdan,\n" +
                "Sen ham chiqmay qo’yding, yana oldimdan,\n" +
                "Balki chiqqandir,u balki yodimdan,\n" +
                "She’r yozganimga ham ancha bo’libdi.\n" +
                "\n" +
                "O’z yo’lizda yuring g’amimni yemang,\n" +
                "Yolg’onlarim soting, sevmaydi demang,\n" +
                "Sevmaydi desalar ishonib yurmang,\n" +
                "She’r yozganimga ham ancha bo’libdi.\n", false, R.drawable.ancha_bolibdi_sher_yozganimga, "Ishonmay qo’ydim"));

        poetList.add(new Poet("Yuzimga solmang", "Tug’ildim, berildi qo’limga qalam,\n" +
                "Qog’ozga yumalar birma bir alam,\n" +
                "Men uchun yaralgan mening Lolam,\n" +
                "Aybim shoirligim, yuzimga solmang.\n" +
                "\n" +
                "She’rlarim she’rmasdir, she’rlar oldida,\n" +
                "Vujudim sher – g’ururi yerlar oldida,\n" +
                "“Ishonma sevgiga” derlar oldida,\n" +
                "Aybim sevganligim, yuzimga solmang.\n" +
                "\n" +
                "Qaro tunlarning qarosi bu – tun,\n" +
                "Yurakka yig’ilsa yarosi butun,\n" +
                "Ko’zimning nurin adosi bugun,\n" +
                "Aybim kichikligim, yuzimga solmang.\n" +
                " \n" +
                "Bilmadim, aybim ko’p, sanasam gunohlarimni,\n" +
                "Mirzo Bobur aytar, tunda ushlab yanoqlarimni:\n" +
                "“Undan ko’ra oson, tugat sanoqlarimni,\n" +
                "Aybim shoirligim, yuzimga solmang.\n" +
                "\n" +
                "She’rlar, she’rlarim dardimga malham,\n" +
                "Yetkazgan kuniga baxtimga alham,\n" +
                "Yig’lamang, men deb, rostiga sal ham,\n" +
                "Aybim erkaligim, yuzimga solmang.\n", false, R.drawable.yuzimga_solmang, "Ishonmay qo’ydim"));

        poetList.add(new Poet("Ishonmay qo’ydim", "So‘zlari yolg‘onim keldizmi yana?\n" +
                "Mayin shamollarim esdizmi yana?\n" +
                "Sevgi gulshanimda kezdizmi yana?\n" +
                "Men o‘sha sevgiga ishonmay qo‘ydim.\n" +
                "\n" +
                "Do‘stlarim yonimda yodimda ediz,\n" +
                "Kerak paytda dardu g‘amimni yediz,\n" +
                "Bugun yana bugun yonimga keldiz,\n" +
                "Men o‘sha do‘stlikka ishonmay qo‘ydim.\n" +
                "\n" +
                "Xech narsa xohlamas bu qalbim meni,\n" +
                "Endi sog‘inmaydi, sog‘inmas seni,\n" +
                "Yuragim chidolmas seni sevgani,\n" +
                "Men o‘sha mehringga ishonmay qo‘ydim.\n" +
                "\n" +
                "Shuni kutganding-a, men bilib qoldim,\n" +
                "Men shu, shu nafratga ishonib qoldim,\n" +
                "Sen ketding... men ojiz, men o‘zim qoldim,\n" +
                "Men o‘sha quvonchga ishonmay qo‘ydim.\n" +
                "\n" +
                "Baxtli bo‘lamanda, Baxtliman derdim, \n" +
                "Men o‘sha Usmonxon, o‘zimni yerdim,\n" +
                "Men yashab... Yoshlikdan hozirga keldim,\n" +
                "Men o‘sha ertakka ishonmay qo‘ydim.\n" +
                "\n" +
                "Maqsadlarim yo‘q... Orzularim tamom,\n" +
                "Hammasi yangitdan boshlanar hamon,\n" +
                "Ammo yuragimda qolyapti armon,\n" +
                "Men o‘sha sevgiga ishonmay qo‘ydim!\n", false, R.drawable.ishonmay_qoydim, "Ishonmay qo’ydim"));

        poetList.add(new Poet("“Do’st”ga maktublar", "                     I\n" +
                "Kelganda omading kulma birovga,\n" +
                "Qor deb ishonma yog‘gan qirovga,\n" +
                "Bu hayot yolg‘oni yulduzla cheksiz,\n" +
                "Lek ko‘ngil qo‘ydim munis hilolga.\n" +
                "\n" +
                "Hilol nima dog‘ tushmagan oymi-yo,\n" +
                "O‘rtamizni ayro qilgan bu soymi-yo,\n" +
                "Men bilmadim bilolmadim ey ko‘ngil,\n" +
                "Shunchalar ham yuraklari tormi-yo!\n" +
                "                       II\n" +
                "Yurakning butuni to‘liq uradi,\n" +
                "Yarim yuragim seni so‘radi,\n" +
                "Ayt yurakka nima deb aytay,\n" +
                "Tomirda qon ham yolg‘on yuradi.\n" +
                "\n" +
                "Sog‘inib entikib yig‘laydi yurak,\n" +
                "Og‘riydi dil yig‘iku ermak,\n" +
                "Qaniydi borolsa seni ko‘rgani,\n" +
                "Farhodni sevgisi bo‘lolsa o‘rnak.\n" +
                "\n" +
                "Ostonangdan o‘tolmay bir qadam,\n" +
                "Qo‘rquvdan muzlaydi tik tanam,\n" +
                "Ishonmaysan, mening dardimga,\n" +
                "Shunisi... shunisi qiladi alam.\n" +
                "                     III\n" +
                "Rameo sevganday sevaman hali,\n" +
                "Farhoddayin toshni o‘yaman hali,\n" +
                "Tohir kabi daryo oqaman hali,\n" +
                "Men seni shunday, shunday sevaman.\n" +
                "\n" +
                "Otelloni rashkidan rashkim ziyoda,\n" +
                "Mayliga dunyosin kezay piyoda,\n" +
                "Kezib yuray izlab cho‘lu biyoda,\n" +
                "Men seni shunday shunday sevaman.\n", false, R.drawable.dostga_maktublar, "Ishonmay qo’ydim"));

        poetList.add(new Poet("To’rtliklar", "Qani endi vaqtni ortga qaytara olsam,\n" +
                "Qaytadan tug’ilib, qayta sevolsam,\n" +
                "Adashmay, qoqilmay hayot yo’limda,\n" +
                "Qaniydi sevilib, siz deb yonolsam.\n" +
                "***\n" +
                "Zeriksang hayotdan, to’ysang joningdan,\n" +
                "Ko’rgin kelmasa, eh, bu olamlarni,\n" +
                "O’yla, nima naf tomchi qoningdan,\n" +
                "O’ylagin, atrofindagi odamlarni.\n" +
                "***\n" +
                "Ertaga entikkan qalblar uchrashar,\n" +
                "Sog’inchdan pinxona, lablar titrashar,\n" +
                "Ertani kelishin kutdim qanchalar,\n" +
                "Ertaga sevgimiz qalblar so’zlashar.\n" +
                "***\n" +
                "Bu kunchalik baxtiyor bo’lmadim bu yil,\n" +
                "Bu kunni unutmas, bu qalbdagi titroq,\n" +
                "Balki sevolmagan, bu kunchalik ko’ngil,\n" +
                "Sevdim bugun qayta-yu, dillarda so’roq.\n" +
                "***\n" +
                "Orzu edi unga yetishish,\n" +
                "Armon bo’ldi baxtga erishish,\n" +
                "Eh, g’unchasin ochmagan chechak,\n" +
                "Bugun darddan yig’lar kelinchak.\n" +
                "***\n" +
                "Og‘ir kunlarimni og‘iri bugun,\n" +
                "Oxirgi visol bu oxirgi kun,\n" +
                "Hayronman bergan bu kimga jazosi,\n" +
                "Ishongim kelmaydi... Bu dard havosi.\n" +
                "***\n" +
                "Osmonda bulutlar rostligin aytib,\n" +
                "Yomg‘ir tomchilari ko‘zyoshim artib,\n" +
                "Hazilmi rostmi bu ishongim kelmas,\n" +
                "Yurakdan tonggacha bu azob yelmas.\n" +
                "***\n" +
                "Osmonga termulib oydan so‘rayman,\n" +
                "Yulduzlar uxlagach oyni o‘rayman,\n" +
                "Oy aytadi sevaman men ham,\n" +
                "Boshimda ne bo‘lsa shundan ko‘ray man!\n", false, R.drawable.tortliklar, "Ishonmay qo’ydim"));

        chapter.setPoetList(poetList);
        return chapter;
    }

    public static Chapter getFourthChapter() {
        Chapter chapter = new Chapter("Seni sevuvchini menga yor qil, Rab", new ArrayList<>(), R.drawable.seni_sevuvchiga_yor_qil);

        List<Poet> poetList = new ArrayList<>();

        poetList.add(new Poet("Hayollar", "Bo‘sh tursam hayollar senga ketadi,\n" +
                "Hayollar bir zumga baxtli etadi,\n" +
                "Seni sog‘inib, eh, charchadi yurak,\n" +
                "Bir marta, bir marta ko‘rsam yetadi.\n" +
                "\n" +
                "Senga aytolmagan so‘zlarim qancha,\n" +
                "Qancha maktublarim senga yetguncha,\n" +
                "Qalbimni tubida qolib ketadi,\n" +
                "Bugun uchrashaylik quyosh botguncha.\n" +
                "\n" +
                "Hayollarga kelar har xil tuyg‘ular,\n" +
                "Tuyg‘ularda quvonch bo‘lar qayg‘ular,\n" +
                "Yodimda ilk bora seni ko‘rganim,\n" +
                "Ko‘rganimda seni shirin kulgular.\n" +
                "\n" +
                "Senga aytilmagan so‘zlarim qancha,\n" +
                "Qancha orzularim, senga yetguncha,\n" +
                "Qalbimdan istadi seni ko‘zlarim,\n" +
                "Bahorda ochilgan, ey, sadaf, g‘uncha!\n", false, R.drawable.hayollar, "Seni sevuvchini menga yor qil, Rab"));

        poetList.add(new Poet("Mening dardim", "Kimdir yuzida kulgu, kimdadir ko’zyosh,\n" +
                "Yoshlar sababi har ne bo’ladi?\n" +
                "Kimdir kuyadir, kimdir alamda,\n" +
                "Mening dardimni kim ham biladi.\n" +
                "\n" +
                "Yuragim og’riydi, o’ylasam uni,\n" +
                "O’ylamay bo’lmaydi, o’sha “telba”ni,\n" +
                "Oy ham yig’lar so’ylasam shuni,\n" +
                "Kim ham biladi, mening dardimni.\n" +
                "\n" +
                "Lablaring titraydi gapira olmas,\n" +
                "Gapirsin, seni kim yig’lata oldi,\n" +
                "Ko’zlaring yig’laydi, yashira olmas,\n" +
                "Yuraklar dardimdan ezilib qoldi.\n", false, R.drawable.mening_dardlarim, "Seni sevuvchini menga yor qil, Rab"));

        poetList.add(new Poet("Sog’insa yurak", "Atigi besh kunni dardi tatiydi, \n" +
                "Besh kun besh soniya o‘tsa qaniydi,\n" +
                "Endi shoir yoshin kim ham artiydi,\n" +
                "Entikib, og‘rinib, sog‘insa yurak...\n" +
                "\n" +
                "Yurak, yurak, yuragimni,\n" +
                "Taftin olib ketganmiding,\n" +
                "Yurak, yurak, yuragimga\n" +
                "Qaytaman deb aytganmiding.\n" +
                "\n" +
                "Bahorning gulini shamol aldaydi,\n" +
                "Gunohning xunini amal aldaydi,\n" +
                "Yuragim dardini tanam aldaydi,\n" +
                "Entikib, og‘rinib, sog‘insa yurak...\n" +
                "\n" +
                "Entiksa, chalg‘itdim surating bilan,\n" +
                "Og‘rinsa, yupatdim hurmating bilan,\n" +
                "Sog‘insa, eslatdim suhbating bilan,\n" +
                "Entikib, og‘rinib, sog‘insa yurak!\n", false, R.drawable.soginsa_yurak, "Seni sevuvchini menga yor qil, Rab"));

        poetList.add(new Poet("Olis orzularim", "Mayda qadamlarni unutganim yo‘q,\n" +
                "Mayda alamlarga ko‘nikkanim yo‘q,\n" +
                "Sizga she‘r yozgani eringanim yo‘q,\n" +
                "Olis orzularim sizga yetaman!\n" +
                "\n" +
                "Osmonlar qaridan yiroq qalbingiz,\n" +
                "Yerlarning tubidan uzoq dardingiz,\n" +
                "Hali ko‘p ko‘p mendan mendan qarzingiz,\n" +
                "Olis orzularim sizga yetaman!\n" +
                "\n" +
                "Biringiz omad zafarsiz menga,\n" +
                "Biringiz baxt saodat menga,\n" +
                "Baridan o‘zingiz keraksiz menga,\n" +
                "Olis orzularim sizga yetaman!\n" +
                "\n" +
                "Sizni tasvirlashga she’rlarim kamdir,\n" +
                "Sizga erishmasam ko‘zlarim namdir,\n" +
                "Sizni sevib sizla o‘lsamdir,\n" +
                "Olis orzularim sizga yetaman!\n", false, R.drawable.olis_orzularim, "Seni sevuvchini menga yor qil, Rab"));


        poetList.add(new Poet("Seni sevuvchini menga yor qil, Rab", "Har kuni soʻrayman sendan shuni man,\n" +
                "Ertalab duoda, qiblamga qarab,\n" +
                "U ham soʻrasin sendan shuni ayt,\n" +
                "Seni seni sevuvchini menga yor qil, Rab!\n" +
                "\n" +
                "Sen sevganidan u oʻzgaga boqmas,\n" +
                "Qoʻllari duoda savobing tilab,\n" +
                "Mendan uyalib yuzimga boqmas,\n" +
                "Seni sevuvchini menga yor qil, Rab!\n" +
                "\n" +
                "Qoʻllari Qurʼoni Karimda turgan,\n" +
                "Har bir namozin namozga ulab,\n" +
                "Qoʻlida doimo tasbehi yurgan,\n" +
                "Seni sevuvchini menga yor qil, Rab!\n" +
                "\n" +
                "Sochlari uzun xech kim koʻrmagan,\n" +
                "Har yon uni farishtang oʻrab,\n" +
                "Yuzlari birorta boʻyoq koʻrmagan,\n" +
                "Seni sevuvchini menga yor qil, Rab!\n\n" +
                "Qaro tun... Uygʻonib, oy tomon qarab,\n" +
                "Qoʻrqib yuragimni bir hadik oʻrab,\n" +
                "Namozim tugatib, duoda soʻrab,\n" +
                "Seni sevuvchini menga yor qil, Rab.\n" +
                "\n" +
                "Qoʻlida bir tasbeh, dilida hayo,\n" +
                "Yoʻlida nur yonar, tilida ziyo,\n" +
                "Har kuni duoda soʻrar tilda-yo:\n" +
                "Seni sevuvchini menga yor qil, Rab.\n", false, R.drawable.seni_sevuvchiga_yor_qil, "Seni sevuvchini menga yor qil, Rab"));


        poetList.add(new Poet("Pinxonalar", "Qalblarda yashirin,qalblarda qolar,\n" +
                "Qalblardan otashin termulib olar,\n" +
                "Aytolmas, aytmadi hech qachon ular,\n" +
                "Dardlari yurakda pinxona ular.\n" +
                "\n" +
                "Pinxon, xatto, sevish, kulishlari ham,\n" +
                "Dardlari pinxona, yurishlari ham,\n" +
                "Pinxona ketmasin, o’lishlari ham,\n" +
                "Dardlari yurakda pinxona ular.\n" +
                "\n" +
                "Nafratin yurakka joylagan,\n" +
                "Ajalin bemahal chorlagan,\n" +
                "Yuragida xech sabr qolmagan,\n" +
                "Dardlari yurakda pinxona ular.\n", false, R.drawable.pinxonalar, "Seni sevuvchini menga yor qil, Rab"));


        chapter.setPoetList(poetList);
        return chapter;
    }


    public static Chapter getFifthChapter() {
        Chapter chapter = new Chapter("Intiho", new ArrayList<>(), R.drawable.intiho_image);

        List<Poet> poetList = new ArrayList<>();

        poetList.add(new Poet("Nasihat", "Sevgiga ishonmang, ishonmang xech ham,\n" +
                "Undan qoladigani ko’zlardagi nam,\n" +
                "Sevib nima naf ko’rasiz do’stginam,\n" +
                "Sevmang, sevaversin o’shalar mayli.\n" +
                "\n" +
                "Sizga nima kim kim bilan yuradi,\n" +
                "Qaysi yigit qaysi uyda turadi,\n" +
                "Eh, qizlarjon, hali davri keladi,\n" +
                "Sevmang, sevaversin o’shalar mayli.\n" +
                "\n" +
                "Hali siz o’n sakkizga kirmadiz,\n" +
                "Turmush mushtlarini hali bilmadiz,\n" +
                "O’n gulizni bir g’unchasin ko’rmadiz,\n" +
                "Sevmang, sevaversin o’shalar mayli.\n" +
                "\n" +
                "Sevmang, sevaversin, ko’ngli qoladi,\n" +
                "Sizdan kechib, erta boshqa topadi,\n" +
                "Yurib-yurib bir qizchani oladi,\n" +
                "Sevmang, sevaversin o’shalar mayli.\n" +
                "\n" +
                "Hayot sizniki, xato sizniki,\n" +
                "Kelajakda baxt, omad sizniki,\n" +
                "Chin dildan xohlab niyat qilsangiz,\n" +
                "Farishtali uydan bir baxt sizniki.\n", false, R.drawable.nasihat, "Intiho"));

        poetList.add(new Poet("Alloh asraydi (Do’stlarimga)", "Yuragim yonizda hotirjam,\n" +
                "Doimo siz bilan teng yursam,\n" +
                "Mayliga siz uchun jon bersam,\n" +
                "Do’stim sizni Alloh asraydi.\n" +
                "\n" +
                "O’tgan sinovdan har xil chog’larda,\n" +
                "Quvlashib yurganmiz tog’larda,\n" +
                "Qizlarni kutibmiz bog’larda,\n" +
                "Do’stim bizni Alloh asraydi.\n" +
                "\n" +
                "Ba’zi boy jo’jalar kerilgan,\n" +
                "Yerdan qanot patlari terilgan,\n" +
                "Bizga bu kuch – Allohdan berilgan,\n" +
                "Do’stim bizni Alloh asraydi.\n" +
                "\n" +
                "Biz shunday kuchmiz, har ishda,\n" +
                "O’qishda, urishda, tashvishda,\n" +
                "Muhammad ummatimiz – shu rishta,\n" +
                "Do’stim bizni Alloh asraydi.\n", false, R.drawable.alloh_asraydi, "Intiho"));

        poetList.add(new Poet("Singlimga", "Ko’zyoshning dardini kulgu yengadi,\n" +
                "Insonning baxtini tuyg’u yengadi,\n" +
                "Yig’lama, singlim, ne dard kelsa-da,\n" +
                "Gunohning taftini qayg’u yengadi.\n" +
                "\n" +
                "Kulguning ortida qayg’u yashirin,\n" +
                "Oylarga aytarkan, tunlari sirin,\n" +
                "Yig’lagan singlim, ovutar oy ham,\n" +
                "Ko’ngilga olma, keyin hayot shirin.\n" +
                "\n" +
                "Shirin hayotingda davron keladi,\n" +
                "Bir kun unda ham armon keladi,\n" +
                "Shunda singlisiga haval-la boqib,\n" +
                "Shoir yuragida darmon yeladi.\n", false, R.drawable.singlimga, "Intiho"));

        poetList.add(new Poet("Inson", "Oʻzicha haq olamda inson,\n" +
                "Olamda yak odamda inson,\n" +
                "Eng yaxshi, eng tuban ham shu,\n" +
                "Boshlangan Odam Atodan inson.\n" +
                "\n" +
                "Xatodan boshlandi xatodan umri,\n" +
                "Shayton ham insondan xayrondir umri,\n" +
                "Qayoqqa ketyapsan ey, Odamizot,\n" +
                "Qaytar dunyo bu Xudoning amri.\n", false, R.drawable.inson, "Intiho"));

        poetList.add(new Poet("Pul o’lsin", "Pul o’lsin-a, pul o’lsin,\n" +
                "Og’ritarlar, shu deb dil,\n" +
                "Pul bo’lmay nomi o’lsin,\n" +
                "Pul deb chiqar xatto til.\n" +
                "\n" +
                "Pul deb ayol koʻchada,\n" +
                "Pul deb bola yigʻlaydi,\n" +
                "Nomi oʻchgur oʻsha pul,\n" +
                "Yigʻlatmasa qoʻymaydi.\n" +
                "\n" +
                "Nochor, qarzdor bari pul,\n" +
                "Pul deb soʻrar Allohdan,\n" +
                "Ba'zi bekor nobakor,\n" +
                "Panoh soʻrar insondan.\n" +
                "\n" +
                "Pulni yaratdi inson,\n" +
                "Pulsiz qanday yashagan?\n" +
                "Yasholmaydi hozir gar\n" +
                "Pul boʻlmasa nogahon.\n" +
                "\n" +
                "Pul oʻlsin, mehrsiz qilgan,\n" +
                "Sevgiga ham xaridor,\n" +
                "Pul oʻlsin, doʻsting boʻlgan,\n" +
                "Oʻlsang oʻsha pul bekor.\n\n" +
                "Qanday zamonlar keldi,\n" +
                "Bari pulga taqalar,\n" +
                "Pul uchun uka aka\n" +
                "Bir birini yoqalar...\n" +
                "\n" +
                "Dollar, yevro, bari pul,\n" +
                "Odamzot xech to’ymaydi,\n" +
                "Yoqsa bo’lar bari – kul,\n" +
                "Lekin shunisin bilmaydi.\n" +
                "\n" +
                "Iloj qilsa shu pulni\n" +
                "Olib ketsa qabrga,\n" +
                "Pora qilarmi pulni,\n" +
                "Savob qilmagan, axir.\n" +
                "\n" +
                "Mol dunyoni quvdi u,\n" +
                "Besh kunligin unutdi,\n" +
                "Bugun xammol yuvdi u,\n" +
                "Boyligini bo’lindi...\n" +
                "\n" +
                "Pul o’lsin-a, pul o’lsin,\n" +
                "Og’ritarlar, shu deb dil,\n" +
                "Pul bo’lmay nomi o’lsin,\n" +
                "Pul deb chiqar xatto til.\n", false, R.drawable.pul_olsin, "Intiho"));

        poetList.add(new Poet("Tug’ilgan kunimda", "Bugun bir ajib his yuragim ezar,\n" +
                "Yana bir yoshim o’tib bormoqda,\n" +
                "Yurakda yangilik shamolday kezar,\n" +
                "Umr daryo kabi shirin oqmoqda.\n" +
                "\n" +
                "Nelar bo’lmadi bu yillar ichra,\n" +
                "Yig’ladim, kuldim, kunlarim o’tdi,\n" +
                "Har bir xazon, behuda kecha,\n" +
                "Ba’zida savoblar qo’limni tutdi.\n" +
                "\n" +
                "Shu bir yil, har xil sovg’alar,\n" +
                "Har buni azob ba’zida shodlik,\n" +
                "Qalbimda gohida sevgi yo’rg’alar,\n" +
                "Lekin, har kunim, turar bedodlik.\n", false, R.drawable.tugilgan_kunim, "Intiho"));


        poetList.add(new Poet("Intiho", "O’ylama, hayot – o’yin, tugamas chiziq,\n" +
                "O’yinning ham oxiri yomon bo’ladi,\n" +
                "Inson umri so’ngin o’ylamas qiziq,\n" +
                "Hamma o’lgan odam omon bo’ladi.\n" +
                "\n" +
                "Tirilar birma-bir murda-yu ruh,\n" +
                "Aytadi: “Men gunoh qilmadim!”\n" +
                "Gunoh qilmasmi, odam umrida,\n" +
                "Har bir qadamin gunoh bo’ladi.\n" +
                "\n" +
                "Ko’radi, yashab savob qilmabdi,\n" +
                "Yuribdi besabab, bezori, beor,\n" +
                "Shuncha yashab saboq bilmabdi,\n" +
                "Yashagan hayoti o’yin beayov.\n", false, R.drawable.intiho_image, "Intiho"));

        chapter.setPoetList(poetList);
        return chapter;
    }


    public static Chapter getSixthChapter() {
        Chapter chapter = new Chapter("Hamma gapiradi, Biz haqimizda", new ArrayList<>(), R.drawable.hamma_gapiradi);

        List<Poet> poetList = new ArrayList<>();

        poetList.add(new Poet("Sevgimizni asra, sevgilim", "Yigit va qiz bir-birlarini juda qattiq sevishar edi. Lekin, yigit bir kuni uchrashuv joyiga kelibdi. Qiz esa yo’q. Shu payt qayerdandir yigitning sinfdoshi paydo bo’libdi. Yigit u sinfdosh qiz bilan o’sha kafeda uzoq gaplashib o’tiribdi. Yoshlik chog’larini eslabdi. Hatto, yigit uchrashuvi borligini ham unutib qo’yibdi. Sinfdosh qiz ketibdi. Yigit esa hisobni to’lagani tursa, boshqa kabinada sevgan qizi yum-yum yig’lar edi. Yigit kelishi bilan o’rnidan turib ketibdi qiz.\n" +
                "Yigit esa tunda qizga xabar jo’natibdi. Yig’layverib ko’zlari qizarib ketgan qiz esa xorg’in ahvolda ushbu maktubni o’qibdi:\n" +
                "\n" +
                "“Yuragingdan nelar oʻtsa-da,\n" +
                "Men deb har kun dardlar yutda-da,\n" +
                "Koʻzlaring yoʻlimda meni kutsa-da,\n" +
                "Sevgimizni asra, sevgilim.\n" +
                "\n" +
                "Aldasalar u qaytmaydi deb,\n" +
                "Ishonchsizlik yuragingni yeb,\n" +
                "Darding boʻlsa ayt oldimga keb,\n" +
                "Sevgimizni asra, sevgilim.\n" +
                "\n" +
                "Tushunmadim, koʻzyoshlar sirin,\n" +
                "Baxtdan edi hayotim shirin,\n" +
                "Oshiqlar azoblarkan bir-birin,\n" +
                "Sevgimizni asra, sevgilim.\n" +
                "\n" +
                "Meni kechir, koʻzyoshlar uchun,\n" +
                "Meni kechir, dard toshlar uchun,\n" +
                "Meni kechir, sevganim uchun,\n" +
                "Sevgimizni asra, Sevgilim.”\n", false, R.drawable.sevigimizni_asra_sevgilim, "Hamma gapiradi, Biz haqimizda"));


        poetList.add(new Poet("Hamma gapiradi, biz haqimizda", "Sevgi. Ajoyib tuyg’u. Lekin hozirgi zamonda bu tuyg’u turli xil bo’lar bo’lmas gaplarni deb buzilib ketyapti. \n" +
                "Yigit va qiz bir-birlariga ko’ngil qo’yishdi. Lekin, yigit do’stlaridan u qiz haqida har xil gaplarni eshitar, azoblanardi. Qizni ham shu haqida so’rab xafa qilibdi. Balki qiz ham xato qilgandir. Lekin, uning o’tmishini so’rashdan ne naf. Baribir u o’tmishni o’zgartira olmagandan keyin. Ey, yigit, sen u qizni sevding. Tushunyapsanmi, u haqidagi har qanday gapga qaramay sevishing, balki, uni o’sha yomon so’zlardan himoya ham qilishing kerak.\n" +
                "Ey, qizaloq. Agarda ko’nglingda boshqa inson bo’lsa-yu, yana birovni, yaqiningni umidvor qilma. U sen uchun hammasidan kechgan bo’lishi mumkin. Sevgini xor qilmang, zero, sevgi sizni xor qilsa, bu yukni ko’tara olmaysiz!\n" +
                "Bu gaplarim kimgadir nafi tegsa hursandman.\n" +
                "O’sha yigit hayollarini jamlabdi-da ushbu maktubni yozibdi:\n" +
                "\n" +
                "“Hamma gapiradi, biz haqimizda:\n" +
                "Sen sevmas ekansan meni umuman,\n" +
                "Sevganing bor ekan mendan ham boshqa,\n" +
                "Uch yil boʻlibdi balki taxminan.\n" +
                "\n" +
                "Hamma gapiradi, biz haqimizda:\n" +
                "Bekorga umidvor qilyapti seni,\n" +
                "Har kuni u bilan birga emishsan,\n" +
                "Ishontirmoqchi boʻlyapti meni.\n" +
                "\t\n" +
                "Qaysi Layli boylik ustun bildi sevgidan,\n" +
                "Yo Kumush ikkitasini sevdimi,\n" +
                "Shirin aldadimi Farhodni bir bor,\n" +
                "Bizni gapirganlar oʻzi sevdimi?\n" +
                "\n" +
                "Bizni gapirishar, tillarida biz,\n" +
                "Yolgʻonlar aytishar, toʻgʻrimi aytgin,\n" +
                "Rost boʻlsa agarda ular soʻzlari,\n" +
                "Iltimos yolgʻondan: yolgʻon deb aytgin.\n" +
                "\n" +
                "\n" +
                "Sevaman baribir, rostmi yolgʻonmi,\n" +
                "Men yolgʻonga oʻrganmaganman.\n" +
                "Qalbimda otilgan baxtmi tug’yonmi?\n" +
                "Men tug’yonga o’rganmaganman.\n" +
                "\n" +
                "Hamma gapiradi biz haqimizda, \n" +
                "Tuhmat toshlaridan bezdiku yurak,\n" +
                "Bilmasa koʻrmasa inson zotiga,\n" +
                "Ayting bu yolgʻonlar nega kerak?\n" +
                "\t\n" +
                "Hamma gapiradi biz haqimizda,\n" +
                "Gapirar uzukka koʻz qoʻygandek.\n" +
                "Havas qiladi, kimdirlar kulib,\n" +
                "Huddi bizlar arpasini bexos oʻrgandek.\n" +
                "\n" +
                "Hamma gapiradi biz haqimizda,\n" +
                "Nimalar deyishmas, nima oʻylashsa,\n" +
                "Axir, ular ham Alloh bandasi,\n" +
                "Javobi bor hali nima soʻylashsa.\n" +
                "\n" +
                "Hamma gapiradi biz haqimizda,\n" +
                "Behuda befoyda sayramang sizlar,\n" +
                "Hali bizni davr kelganda,\n" +
                "Uyatdan jimgina qizarasizlar.\n", false, R.drawable.hamma_gapiradi, "Hamma gapiradi, Biz haqimizda"));

        poetList.add(new Poet("She'r yozish osonmi, shunchalik oson", "Shoirlar dunyosi. Bu o’zgacha dunyo. Bu dunyoni she’r yozmagan odam tushunmaydi. She’r yozish vaqt, joy tanlamaydi. Dard bo’lmasa, she’r befoyda.\n" +
                "She’r yozish oson, shunchalik osonki, yozging kelmaydi.\n" +
                "Men she’riyat haqida o’zim shu she’rni yozgim keldi:\n" +
                "\n" +
                "She'r yozish osonmi, shunchalik oson,\n" +
                "Shunchalik osonki, yozgin kelmaydi,\n" +
                "Topolmaysan she'r, dardinga mosin,\n" +
                "Birovning dardini birov bilmaydi.\n" +
                "\t\n" +
                "Kimdir xohlaydi seni yuraging,\n" +
                "Yoningdan jilmaydi boʻlsa keraging,\n" +
                "Hayotda xech kimga ishonch bermagin,\n" +
                "Shunchalik oson, hayot ermagi.\n", false, R.drawable.sher_yozish_osonmi, "Hamma gapiradi, Biz haqimizda"));

        poetList.add(new Poet("Alloh kechirsin", "Hayotda shunday insonlar borki, ularni kim deb atashni bilmaysan kishi...\n" +
                "Balki nafratdan, balki darddan, balki qiziqishmi, bir insonni sevib, yana to’rt beshtasini aldab yuradi. Nafaqat yigitlar, bu sohada qizlarning natijasi ham ancha yaxshi, afsuski...\n" +
                "Bir qizning dardini shu she’rga joyladim:\n" +
                "\n" +
                "Hayotga insonlar bir bor kelamiz,\n" +
                "Bir bor kelgan bir bor sevamiz,\n" +
                "Birin sevib, birin qoʻyib yurganlar,\n" +
                "Biz hammasini bilamiz.\n" +
                "\t\n" +
                "Sevasiz bizni ham, uni ham bugun,\n" +
                "Ertaga ne boʻlishiz Xudo biladi,\n" +
                "Men-ku kechirarman sizni bir kun,\n" +
                "Alloh kechirsin, shuni tiladim.\n" +
                "\n" +
                "Allohdan qoʻrqaman, sizga ne boʻlsa,\n" +
                "Men oʻzimni kechirolmasman,\n" +
                "Qaniydi yuragizda faqat men boʻlsa,\n" +
                "Sizni yuragimdan oʻchirolmasman.\n" +
                "\n" +
                "Har kuni yigʻlayman sevgimni deya,\n" +
                "Oyga dardlarimni aytib yigʻlayman,\n" +
                "Sizga insofni berar-ku deya,\n" +
                "Faqat, sabrim qachongacha,\n" +
                "Buni bilmayman.\n", false, R.drawable.alloh_kechirsin, "Hamma gapiradi, Biz haqimizda"));

        poetList.add(new Poet("Dard", "Ba’zi insonlar borki, har kuni azob dard chekadi. Lekin o’sha insonni baribir sevaveradi. Bu sevgi – javob kutmaydi, yolg’onlarga chidaydi, umid va sabr qilib kutadi. Bu  sevgi. Shunday sevgi. Lekin bu hammaga ham berilmaydi.\n" +
                "Shunday oshiq yigitlardan biri hammasiga chidab kelmoqda, lekin, u men emas. U balki ertaklardadir. Lekin u osmondagi oyga qarab shu so’zlarni aytmoqda:\n" +
                "\n" +
                "Qachon tugaydi ayting yolgʻonlar,\n" +
                "Bu yolgʻonlardan bezdi-ku yurak,\n" +
                "Umid bermagani yaxshi odamlar,\n" +
                "Sevmasa umid berish, nega kerak?\n" +
                "\t\n" +
                "Nega, nimaga qiynaydi meni,\n" +
                "Yana aldandim shirin soʻzlarga,\n" +
                "Qaniydi qadrimni bilsaydi edi,\n" +
                "Yoshlar kelmoqda duv-duv koʻzlarga.\n" +
                "\n" +
                "Yuragim chulgʻadi bexos bu nafrat,\n" +
                "Yana afsus u tomon kelaveraman,\n" +
                "Dardi ogʻir ekan muxabbat,\n" +
                "Bugun yana uni sevaveraman.\n", false, R.drawable.dard, "Hamma gapiradi, Biz haqimizda"));

        poetList.add(new Poet("So’ngi sahifa", "Yigit va qiz o’rtasida abadiy sevgi bor edi. Yigit esa bir kunda yo’q bo’lib qoldi. Qizning bormagan joyi qolmadi. Uyida ham yo’q. Yigit yo’q edi. \n" +
                "Oradan bir oy o’tgach Hindistondan xabar keldi. Yigit og’ir kasal ekan, davosi topilmabdi. Va o’z kundaligini jo’natib yuboribdi. Qiz kundalikning har bir betida o’z ismini ko’rar ekan, ko’zlaridan yosh arimabdi. Kundalikning so’ngi sahifasida esa shu she’r bor edi:\n" +
                "\n" +
                "Nahot, bizga bugun so’ngi sahifa,\n" +
                "Azoblar tugadi, dardlar tugadi,\n" +
                "Hammasidan kechib, ketyapman bugun,\n" +
                "Quvonchlar tugadi, baxtlar tugadi.\n" +
                "\n" +
                "Yig’laymi endi, sendan ayrilib,\n" +
                "Sen ham yig’laysan men uchun bugun,\n" +
                "O’tmishga boqma endi qayrilib,\n" +
                "Seni tark etaman, sen uchun bugun.\n" +
                "\n" +
                "Sendan iltimos, yangitdan yasha,\n" +
                "Dardim bedavo, so’ngi sahifam.\n" +
                "O’laman dema, men uchun yasha,\n" +
                "Seni sevaman mening soliham.\n" +
                "\n" +
                "Shukr qilaman, Alloh bergan dard,\n" +
                "Allohniki ekan, bu sening jisming,\n" +
                "Umid berib yashagim kelmas,\n" +
                "So’ngi sahifamga yozaman isming.\n", false, R.drawable.songgi_sahifa, "Hamma gapiradi, Biz haqimizda"));

        chapter.setPoetList(poetList);
        return chapter;
    }


    public static List<Chapter> getChaptersList() {
        List<Chapter> chapterList = new ArrayList<>();

        chapterList.add(getfirstChapter());
        chapterList.add(getSecondChapter());
        chapterList.add(getThirdChapter());
        chapterList.add(getFourthChapter());
        chapterList.add(getFifthChapter());
        chapterList.add(getSixthChapter());

        return chapterList;
    }

}
