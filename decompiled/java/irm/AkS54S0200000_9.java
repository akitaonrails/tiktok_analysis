package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0P0T;
import X.C1177570gkV;
import X.C1178910gmf;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1188670h2P;
import X.C1189060h32;
import X.C123100dR;
import X.C1361400lX0;
import X.C1398280mUU;
import X.C1558520qew;
import X.C178200mK;
import X.C1875707Wh;
import X.C1ER1;
import X.C20684815ws;
import X.C2344009Gk;
import X.C629910OnF;
import X.C630110OnZ;
import X.C632130Oqp;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionRecommendNameCell;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.model.MusicSearchHintInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPlayAbility;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility;
import com.ss.android.ugc.aweme.template.assem.TemplateDescAssem;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AkS54S0200000_9 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS54S0200000_9 akS54S0200000_9, View view) {
        ((CollectionRecommendNameCell) akS54S0200000_9.l0).I5("ttls_ai_collection_name_click", ((C1875707Wh) akS54S0200000_9.l1).LLILLJJLI);
        C1875707Wh c1875707Wh = (C1875707Wh) akS54S0200000_9.l1;
        c1875707Wh.LLILLL.invoke(c1875707Wh.LL);
    }

    public static final void LIZ$1(AkS54S0200000_9 akS54S0200000_9, View view) {
        MusicPlayAbility musicPlayAbility;
        MusicDescAssem musicDescAssem = (MusicDescAssem) akS54S0200000_9.l0;
        Music music = (Music) akS54S0200000_9.l1;
        int i = musicDescAssem.op().getState().LL;
        if (i != 1) {
            if (i == 2 && (musicPlayAbility = (MusicPlayAbility) musicDescAssem.LLJZ.getValue()) != null) {
                musicPlayAbility.oS1(music);
                return;
            }
            return;
        }
        MusicPlayAbility musicPlayAbility2 = (MusicPlayAbility) musicDescAssem.LLJZ.getValue();
        if (musicPlayAbility2 == null) {
            return;
        }
        musicPlayAbility2.cz2(music);
    }

    public static final void LIZ$2(AkS54S0200000_9 akS54S0200000_9, View view) {
        String schema;
        String idStr;
        MusicResourceBitStruct musicResourceBitStruct = ((C630110OnZ) akS54S0200000_9.l0).LIZ.musicResourceBitStruct;
        if (musicResourceBitStruct != null && (schema = musicResourceBitStruct.getSchema()) != null) {
            SmartRouter.buildRoute(((MusicDetailNavBarAssem) akS54S0200000_9.l1).getContext(), schema).open();
            Music music = ((C630110OnZ) akS54S0200000_9.l0).LIZ.music;
            String logExtra = null;
            if (music != null) {
                idStr = music.getIdStr();
            } else {
                idStr = null;
            }
            String awemeId = ((MusicDetailNavBarAssem) akS54S0200000_9.l1).getAwemeId();
            MusicResourceBitStruct musicResourceBitStruct2 = ((C630110OnZ) akS54S0200000_9.l0).LIZ.musicResourceBitStruct;
            if (musicResourceBitStruct2 != null) {
                logExtra = musicResourceBitStruct2.getLogExtra();
            }
            C1398280mUU.LIZJ(idStr, awemeId, C178200mK.LIZ(logExtra));
        }
    }

    public static final void LIZ$3(AkS54S0200000_9 akS54S0200000_9, View view) {
        String word;
        String wordId;
        boolean z;
        String imprId;
        String idStr;
        String imprId2;
        MusicSearchHintInfo musicSearchHintInfo;
        MusicSearchHintInfo musicSearchHintInfo2;
        Music music = ((C629910OnF) akS54S0200000_9.l0).LIZ.music;
        String str = "";
        if (music == null || (musicSearchHintInfo2 = music.musicSearchHintInfo) == null || (word = musicSearchHintInfo2.getWord()) == null) {
            word = "";
        }
        Music music2 = ((C629910OnF) akS54S0200000_9.l0).LIZ.music;
        if (music2 == null || (musicSearchHintInfo = music2.musicSearchHintInfo) == null || (wordId = musicSearchHintInfo.getWordId()) == null) {
            wordId = "";
        }
        if (C123100dR.LIZ(word)) {
            LogPbBean logPbBean = ((C629910OnF) akS54S0200000_9.l0).LIZ.logPb;
            if (logPbBean == null || (imprId2 = logPbBean.getImprId()) == null) {
                imprId2 = "";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("words_source", "search_bar_outer");
            c2344009Gk.LJIIIIZZ("words_content", word);
            c2344009Gk.LJIIIIZZ("search_position", "single_song");
            c2344009Gk.LJIIIIZZ("impr_id", imprId2);
            c2344009Gk.LJIIIIZZ("group_id", wordId);
            c2344009Gk.LJIIIIZZ("position_type", "singlesong_searchbox");
            C20684815ws.LJIILLIIL("trending_words_click", c2344009Gk.LIZ);
        }
        String strLLJLILLLLZIIL = C1ER1.LIZIZ.LLJLILLLLZIIL();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk2.LJIIIIZZ("enter_method", "enter");
        c2344009Gk2.LJIIIIZZ("enter_type", "click_singlesong_searchbox");
        c2344009Gk2.LJIIIIZZ("search_keyword", word);
        if (strLLJLILLLLZIIL != null) {
            c2344009Gk2.LJFF("blankpage_id", strLLJLILLLLZIIL);
        }
        C20684815ws.LJIILLIIL("enter_search_blankpage", c2344009Gk2.LIZ);
        C632130Oqp.LIZ.getClass();
        C632130Oqp.LIZJ();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((MusicDetailNavBarAssem) akS54S0200000_9.l1).getContext(), "//search");
        smartRouteBuildRoute.withParam("group_id", ((MusicDetailNavBarAssem) akS54S0200000_9.l1).getAwemeId());
        smartRouteBuildRoute.withParam("in_single_stack", true);
        smartRouteBuildRoute.withParam("search_from", "single_song");
        smartRouteBuildRoute.withParam("enter_from", "single_song");
        smartRouteBuildRoute.withParam("blankpage_enter_from", "single_song");
        if (strLLJLILLLLZIIL != null) {
            smartRouteBuildRoute.withParam("enter_blank_page_id", strLLJLILLLLZIIL);
        }
        if (word.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String imprId3 = null;
        if (z) {
            smartRouteBuildRoute.withParam("set_hint_by_sug_word", true);
        } else {
            smartRouteBuildRoute.withParam("search_hint_word", word);
            smartRouteBuildRoute.withParam("hint_group_id", wordId);
            LogPbBean logPbBean2 = ((C629910OnF) akS54S0200000_9.l0).LIZ.logPb;
            if (logPbBean2 != null) {
                imprId = logPbBean2.getImprId();
            } else {
                imprId = null;
            }
            smartRouteBuildRoute.withParam("hint_imp_id", imprId);
        }
        smartRouteBuildRoute.withParam("blankpage_enter_method", "enter");
        LogPbBean logPbBean3 = ((C629910OnF) akS54S0200000_9.l0).LIZ.logPb;
        if (logPbBean3 != null) {
            imprId3 = logPbBean3.getImprId();
        }
        smartRouteBuildRoute.withParam("preClickImprId", imprId3);
        Music music3 = ((C629910OnF) akS54S0200000_9.l0).LIZ.music;
        if (music3 != null && (idStr = music3.getIdStr()) != null) {
            str = idStr;
        }
        smartRouteBuildRoute.withParam("enter_from_music_id", str);
        smartRouteBuildRoute.open();
    }

    public static final void LIZ$4(AkS54S0200000_9 akS54S0200000_9, View view) {
        String str;
        C1178910gmf c1178910gmf = (C1178910gmf) akS54S0200000_9.l0;
        PoiRevisitCardItem poiRevisitCardItem = (PoiRevisitCardItem) akS54S0200000_9.l1;
        String str2 = poiRevisitCardItem.poiId;
        boolean z = poiRevisitCardItem.LLILLJJLI;
        String str3 = poiRevisitCardItem.keyCategory;
        InterfaceC665370Q7z interfaceC665370Q7z = c1178910gmf.LLJJIJI;
        IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility = null;
        if (interfaceC665370Q7z != null) {
            iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitNavAssemAbility.class, null);
        }
        C1177570gkV c1177570gkV = C1177570gkV.LIZ;
        String str4 = c1178910gmf.LLJJIII;
        c1177570gkV.getClass();
        String strLIZ = C1177570gkV.LIZ(iPoiRevisitNavAssemAbility);
        if (z) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        String str5 = "";
        if (Intrinsics.LJFF(str3, "Others")) {
            str3 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        c2344009Gk.LJFF("enable_location", C1177570gkV.LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", strLIZ);
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_poi_card_list_type", str);
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str2);
        C1189060h32.LJIJJLI(c2344009Gk, "local_service_key_category", str3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(str4));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_poi_card", map, c1185050gwZ);
        C1188670h2P c1188670h2P = C1188670h2P.LIZ;
        Context context = c1178910gmf.getContext();
        if (str2 != null) {
            str5 = str2;
        }
        c1188670h2P.getClass();
        C1188670h2P.LIZLLL(context, str5, "ttls_collection_poi_list_page", "click_poi_card", null, null, null, null);
    }

    public static final void LIZ$5(AkS54S0200000_9 akS54S0200000_9, View view) {
        C0P0T c0p0t = ((TemplateDescAssem) akS54S0200000_9.l0).LLJLIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        TemplateFavoriteViewModel templateFavoriteViewModelSp = ((TemplateDescAssem) akS54S0200000_9.l0).sp();
        C1361400lX0 c1361400lX0 = (C1361400lX0) akS54S0200000_9.l1;
        if (templateFavoriteViewModelSp.LLILZ) {
            SmartRouter.buildRoute(c1361400lX0, "aweme://openShoot?landing_tab=mv&landing_sub_tab=my_favorite&shoot_way=template_favorite&schema_tag=template_schema").open();
        }
    }

    public AkS54S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
