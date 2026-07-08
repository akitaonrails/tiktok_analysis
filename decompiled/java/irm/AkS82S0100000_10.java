package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0PL0;
import X.C0PXJ;
import X.C0Q21;
import X.C0Q24;
import X.C1507790pL7;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C2818017g;
import X.C631370Opb;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C658080Pra;
import X.C664000Q2s;
import X.C665210Q7j;
import X.C668340QJk;
import X.C684940Qto;
import X.C724270Sb3;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingInsiteItemAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.IPovLandingPageFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.FoldableSectionHeaderAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.TakoSugCardItemAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong.SearchViralSongCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong.ViralSongCard;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AkS82S0100000_10 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) throws JSONException {
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

    public AkS82S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS82S0100000_10 akS82S0100000_10, View view) throws JSONException {
        String searchId;
        String searchResultId;
        String str;
        String searchResultId2;
        String searchId2;
        String strLIZ;
        String str2;
        String string;
        String searchId3;
        String strLIZLLL;
        String searchResultId3;
        C664000Q2s c664000Q2s;
        ProductGroup productGroup;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(((C0Q21) akS82S0100000_10.l0).LIZ);
        BcmParams bcmParams = new BcmParams();
        C0Q24 c0q24 = ((C0Q21) akS82S0100000_10.l0).LIZJ;
        String str3 = "";
        if (c0q24 == null || (searchId = c0q24.getSearchId()) == null) {
            searchId = "";
        }
        bcmParams.put("search_id", searchId);
        C0Q24 c0q242 = ((C0Q21) akS82S0100000_10.l0).LIZJ;
        if (c0q242 == null || (searchResultId = c0q242.getSearchResultId()) == null) {
            searchResultId = "";
        }
        bcmParams.put("search_result_id", searchResultId);
        String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c7013.d29458", pageFinderVia, bcmParams);
        if (strCreateJumpSourceBtmToken == null) {
            strCreateJumpSourceBtmToken = "";
        }
        SearchUser searchUser = ((C0Q21) akS82S0100000_10.l0).LIZIZ;
        String rank = null;
        if (searchUser != null && (productGroup = searchUser.productGroup) != null) {
            str = productGroup.schema;
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        C0Q24 c0q243 = ((C0Q21) akS82S0100000_10.l0).LIZJ;
        if (c0q243 == null || (searchResultId2 = c0q243.getSearchResultId()) == null) {
            searchResultId2 = "";
        }
        jSONObject.put("search_result_id", searchResultId2);
        C0Q24 c0q244 = ((C0Q21) akS82S0100000_10.l0).LIZJ;
        if (c0q244 == null || (searchId2 = c0q244.getSearchId()) == null) {
            searchId2 = "";
        }
        jSONObject.put("search_id", searchId2);
        C0Q24 c0q245 = ((C0Q21) akS82S0100000_10.l0).LIZJ;
        if (c0q245 == null || (strLIZ = c0q245.LIZ()) == null) {
            strLIZ = "";
        }
        jSONObject.put("last_from_group_id", strLIZ);
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("enter_method", "user_card");
        jSONObject.put("start_click_time", System.currentTimeMillis());
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view2 = ((C0Q21) akS82S0100000_10.l0).LIZ;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view2);
        if (c650960Pg6LJI != null && (c664000Q2s = c650960Pg6LJI.searchCommonModel) != null) {
            str2 = c664000Q2s.enterFrom;
        } else {
            str2 = null;
        }
        jSONObject.put("search_entrance", str2);
        jSONObject.put("source_previous_page", "general_search");
        jSONObject.put("source_page_type", "general_search");
        Uri uriLIZ = C2818017g.LIZ(str, strCreateJumpSourceBtmToken, jSONObject, new HashMap());
        if (uriLIZ == null || (string = uriLIZ.toString()) == null) {
            string = "";
        }
        C0Q21 c0q21 = (C0Q21) akS82S0100000_10.l0;
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(5);
        c0q21.getClass();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from", "general_search");
        C0Q24 c0q246 = c0q21.LIZJ;
        if (c0q246 == null || (searchId3 = c0q246.getSearchId()) == null) {
            searchId3 = "";
        }
        jSONObject2.put("search_id", searchId3);
        C0Q24 c0q247 = c0q21.LIZJ;
        if (c0q247 != null && (searchResultId3 = c0q247.getSearchResultId()) != null) {
            str3 = searchResultId3;
        }
        jSONObject2.put("search_result_id", str3);
        jSONObject2.put("token_type", "hot_user");
        C0Q24 c0q248 = c0q21.LIZJ;
        if (c0q248 != null) {
            strLIZLLL = c0q248.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        jSONObject2.put("search_keyword", strLIZLLL);
        C0Q24 c0q249 = c0q21.LIZJ;
        if (c0q249 != null) {
            rank = c0q249.getRank();
        }
        jSONObject2.put("rank", rank);
        aFwS241S0000000_10.invoke(jSONObject2);
        PageFinder pageFinderVia2 = PageFinder.via(c0q21.LIZ);
        c1507790pL7.getClass();
        C1507790pL7.LJ("search_result_click", jSONObject2, "a2270.b6880.c7013.d29458", pageFinderVia2);
        C0Q21.LIZ((C0Q21) akS82S0100000_10.l0, "tiktokec_showcase_entrance_click");
        SmartRouter.buildRoute(((C0Q21) akS82S0100000_10.l0).LIZ.getContext(), string).open();
    }

    public static final void LIZ$1(AkS82S0100000_10 akS82S0100000_10, View view) {
        IImageLandingPageAbility iImageLandingPageAbility = (IImageLandingPageAbility) ((ImageLandingInsiteItemAssem) akS82S0100000_10.l0).LLJJLIIIJLLLLLLLZ.getValue();
        if (iImageLandingPageAbility != null) {
            iImageLandingPageAbility.oy1(((C658080Pra) C631370Opb.LIZ((ImageLandingInsiteItemAssem) akS82S0100000_10.l0)).LL);
        }
    }

    public static final void LIZ$2(AkS82S0100000_10 akS82S0100000_10, View view) {
        boolean z;
        Map<String, String> mapLJ;
        int iYz1;
        int iCm0;
        String str;
        Object obj;
        String str2 = ((C684940Qto) C631370Opb.LIZ((FoldableSectionHeaderAssem) akS82S0100000_10.l0)).LL;
        if (str2 != null) {
            FoldableSectionHeaderAssem foldableSectionHeaderAssem = (FoldableSectionHeaderAssem) akS82S0100000_10.l0;
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp = foldableSectionHeaderAssem.Ap();
            if (iPovLandingPageFragmentAbilityAp != null && iPovLandingPageFragmentAbilityAp.MQ1(str2)) {
                z = true;
            } else {
                z = false;
            }
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp2 = foldableSectionHeaderAssem.Ap();
            if (iPovLandingPageFragmentAbilityAp2 != null) {
                iPovLandingPageFragmentAbilityAp2.jp0(str2, !z);
            }
            foldableSectionHeaderAssem.Bp(!z);
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp3 = foldableSectionHeaderAssem.Ap();
            if (iPovLandingPageFragmentAbilityAp3 == null || (mapLJ = iPovLandingPageFragmentAbilityAp3.LLLFZ()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp4 = foldableSectionHeaderAssem.Ap();
            if (iPovLandingPageFragmentAbilityAp4 != null) {
                iYz1 = iPovLandingPageFragmentAbilityAp4.yz1();
            } else {
                iYz1 = 0;
            }
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp5 = foldableSectionHeaderAssem.Ap();
            if (iPovLandingPageFragmentAbilityAp5 != null) {
                iCm0 = iPovLandingPageFragmentAbilityAp5.cm0();
            } else {
                iCm0 = 0;
            }
            if (z) {
                str = "click_unfold";
            } else {
                str = "click_fold";
            }
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("button_type", str);
            pairArr[1] = new Pair("is_page", "1");
            pairArr[2] = new Pair("total_section_num", String.valueOf(iYz1));
            pairArr[3] = new Pair("default_opened_section_num", String.valueOf(iCm0));
            C724270Sb3 c724270Sb3 = foldableSectionHeaderAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            pairArr[4] = new Pair("section_number", String.valueOf(((C684940Qto) obj).LLILZ));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C0PXJ.LIZ.getClass();
            C0PXJ.LJIIL(mapLJ, mapLJIIIIZZ);
        }
    }

    public static final void LIZ$3(AkS82S0100000_10 akS82S0100000_10, View view) {
        Object obj;
        String str;
        SearchViralSongCardAssem searchViralSongCardAssem = (SearchViralSongCardAssem) akS82S0100000_10.l0;
        C2344009Gk c2344009GkTp = searchViralSongCardAssem.tp();
        c2344009GkTp.LJIIIIZZ("position", "search_result_page");
        C724270Sb3 c724270Sb3 = searchViralSongCardAssem.LLJI;
        String str2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ViralSongCard viralSongCard = ((C0PL0) obj).LL.getViralSongCard();
        if (viralSongCard != null) {
            str2 = viralSongCard.musicId;
        }
        c2344009GkTp.LJIIIIZZ("music_id", str2);
        C20684815ws.LJIILLIIL("view_full_chart_click", c2344009GkTp.LIZ);
        SettingsManager.LIZLLL().getClass();
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(SettingsManager.LJI("music_chart_url_roma_redirect", "aweme://roma_redirect/?spark_page=music_charts&roma_group_key=spark_page_music_charts&roma_page_key=p")).buildUpon().appendQueryParameter("enter_from", "general_search").appendQueryParameter(Scene.SCENE_SERVICE, "search_viral_song_card");
        ViralSongCard viralSongCard2 = ((C0PL0) C631370Opb.LIZ((SearchViralSongCardAssem) akS82S0100000_10.l0)).LL.getViralSongCard();
        if (viralSongCard2 == null || (str = viralSongCard2.musicId) == null) {
            str = "";
        }
        SmartRouter.buildRoute(((SearchViralSongCardAssem) akS82S0100000_10.l0).getContext(), builderAppendQueryParameter.appendQueryParameter("music_id", str).appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis())).build().toString()).open();
    }

    public static final void LIZ$4(AkS82S0100000_10 akS82S0100000_10, View view) {
        ((C668340QJk) akS82S0100000_10.l0).I5();
    }

    public static final void LIZ$5(AkS82S0100000_10 akS82S0100000_10, View view) {
        Function0<Unit> function0;
        C665210Q7j c665210Q7j = ((TakoSugCardItemAssem) akS82S0100000_10.l0).LLJLILLLLZIIL;
        if (c665210Q7j != null && (function0 = c665210Q7j.LLILZIL) != null) {
            function0.invoke();
        }
    }
}
