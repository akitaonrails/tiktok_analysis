package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C098200Yq;
import X.C0PM7;
import X.C0Q3E;
import X.C0QQU;
import X.C0R12;
import X.C1010120cOQ;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1200530hLX;
import X.C123100dR;
import X.C13LE;
import X.C1558520qew;
import X.C1741890vQh;
import X.C1821107Bh;
import X.C1827007Do;
import X.C189200o6;
import X.C1ER1;
import X.C2189821An6;
import X.C2371409Qy;
import X.C2399609ak;
import X.C259800zU;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662860PzI;
import X.C688190Qz3;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC688220Qz6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AdFeedSearchBottomBarAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.VideoSearchCacheVM;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class AjS21S0300000_10 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [T, com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r3v42 */
    public static final void LIZ$0(AjS21S0300000_10 ajS21S0300000_10, View view) {
        Object obj;
        Object obj2;
        Object obj3;
        String groupId;
        String str;
        Object obj4;
        Object obj5;
        String wordsLabel;
        String qrecJsonInfo;
        Object obj6;
        String tabName;
        ?? r3;
        String strLIZJ;
        String str2;
        Type type;
        LinkedHashMap linkedHashMap;
        String imprId;
        C2189821An6 c2189821An6;
        InterfaceC688220Qz6 interfaceC688220Qz6LJJI;
        Object obj7;
        Word wordRecord;
        Word wordRecord2;
        if (view != null) {
            AdFeedSearchBottomBarAssem adFeedSearchBottomBarAssem = (AdFeedSearchBottomBarAssem) ajS21S0300000_10.l0;
            adFeedSearchBottomBarAssem.getClass();
            C1ER1 c1er1 = C1ER1.LIZIZ;
            C724270Sb3 c724270Sb3 = adFeedSearchBottomBarAssem.LLJI;
            Context context = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            C724270Sb3 c724270Sb32 = adFeedSearchBottomBarAssem.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String str3 = ((VideoItemParams) obj2).mEventType;
            C688190Qz3 c688190Qz3 = adFeedSearchBottomBarAssem.LLJZIJLIL;
            String str4 = c688190Qz3.LIZLLL;
            String str5 = c688190Qz3.LIZJ;
            String str6 = adFeedSearchBottomBarAssem.LLLFFI;
            C724270Sb3 c724270Sb33 = adFeedSearchBottomBarAssem.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj3).getAweme();
            if (aweme2 == null || (groupId = aweme2.getGroupId()) == null) {
                groupId = "";
            }
            C0PM7 c0pm7 = (C0PM7) C0Q3E.LJI().uF().LIZJ();
            if (c0pm7 == null || (str = c0pm7.LLILLL) == null) {
                str = "";
            }
            C688190Qz3 c688190Qz32 = adFeedSearchBottomBarAssem.LLJZIJLIL;
            PromotionInfo promotionInfo = c688190Qz32.LJFF;
            String str7 = c688190Qz32.LJII;
            String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688190Qz32.LIZJ()));
            if (strLIZLLL == null) {
                strLIZLLL = CardStruct.IStatusCode.DEFAULT;
            }
            C688190Qz3 c688190Qz33 = adFeedSearchBottomBarAssem.LLJZIJLIL;
            String str8 = c688190Qz33.LJIIIIZZ;
            String str9 = c688190Qz33.LJ;
            String str10 = c688190Qz33.LJIIIZ;
            C724270Sb3 c724270Sb34 = adFeedSearchBottomBarAssem.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            Integer numValueOf = Integer.valueOf(((VideoItemParams) obj4).mPageType);
            String strValueOf = String.valueOf(adFeedSearchBottomBarAssem.LLJZIJLIL.LIZ.size());
            VideoSearchCacheVM videoSearchCacheVMBp = adFeedSearchBottomBarAssem.Bp();
            C724270Sb3 c724270Sb35 = adFeedSearchBottomBarAssem.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            String strValueOf2 = String.valueOf(videoSearchCacheVMBp.wQ2(((VideoItemParams) obj5).getAweme().getAid()));
            WordStruct wordStruct = adFeedSearchBottomBarAssem.LLJZIJLIL.LIZIZ;
            if (wordStruct != null && (wordRecord2 = wordStruct.getWordRecord()) != null) {
                wordsLabel = wordRecord2.getWordsLabel();
            } else {
                wordsLabel = null;
            }
            WordStruct wordStruct2 = adFeedSearchBottomBarAssem.LLJZIJLIL.LIZIZ;
            if (wordStruct2 != null && (wordRecord = wordStruct2.getWordRecord()) != null) {
                qrecJsonInfo = wordRecord.getQrecJsonInfo();
            } else {
                qrecJsonInfo = null;
            }
            c1er1.LLLLIL(aweme, str3, str4, str5, str6, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, groupId, str, promotionInfo, str7, strLIZLLL, str8, str9, str10, numValueOf, strValueOf, strValueOf2, null, null, null, null, null, wordsLabel, null, null, null, null, null, qrecJsonInfo, "ad_related_search_anchor_v2");
            C0R12 c0r12 = C0R12.LIZIZ;
            if (c0r12 != null && (interfaceC688220Qz6LJJI = c0r12.LJJI()) != null) {
                C724270Sb3 c724270Sb36 = adFeedSearchBottomBarAssem.LLJI;
                if (c724270Sb36 != null) {
                    obj7 = c724270Sb36.LL;
                } else {
                    obj7 = null;
                }
                interfaceC688220Qz6LJJI.LJ(((VideoItemParams) obj7).getAweme(), "feed_bar", C0QQU.CLICK);
            }
            AdFeedSearchBottomBarAssem adFeedSearchBottomBarAssem2 = (AdFeedSearchBottomBarAssem) ajS21S0300000_10.l0;
            VideoItemParams videoItemParams = (VideoItemParams) ajS21S0300000_10.l1;
            C688190Qz3 c688190Qz34 = (C688190Qz3) ajS21S0300000_10.l2;
            adFeedSearchBottomBarAssem2.getClass();
            Bundle bundle = new Bundle();
            C724270Sb3 c724270Sb37 = adFeedSearchBottomBarAssem2.LLJI;
            if (c724270Sb37 != null) {
                obj6 = c724270Sb37.LL;
            } else {
                obj6 = null;
            }
            String strLJII = C1010120cOQ.LJII(((VideoItemParams) obj6).getAweme());
            if (strLJII == null) {
                strLJII = "";
            }
            C786410Ut5.LJJJI("search_ad_extra_context", strLJII, bundle);
            C786410Ut5.LJJJI("in_single_stack", "true", bundle);
            C786410Ut5.LJJJI("keyword", c688190Qz34.LIZJ, bundle);
            bundle.putBoolean("set_hint_by_sug_word", true);
            C786410Ut5.LJJJI("is_feed_liked", String.valueOf(videoItemParams.getAweme().isLike()), bundle);
            C786410Ut5.LJJJI("is_feed_collected", String.valueOf(AwemeExtKt.isCollected(videoItemParams.getAweme())), bundle);
            C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(AwemeBizExtKt.isCommentClicked(videoItemParams.getAweme())), bundle);
            C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(AwemeBizExtKt.isForwardClicked(videoItemParams.getAweme())), bundle);
            C786410Ut5.LJJJI("search_position", videoItemParams.mEventType, bundle);
            C786410Ut5.LJJJI("back_flag", "1", bundle);
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                tabName = c2189821An6.getTabName();
            } else {
                tabName = null;
            }
            C786410Ut5.LJJJI("tab_name", tabName, bundle);
            String strLIZLLL2 = C1200530hLX.LIZLLL(Boolean.valueOf(c688190Qz34.LIZJ()));
            if (strLIZLLL2 == null) {
                strLIZLLL2 = CardStruct.IStatusCode.DEFAULT;
            }
            C786410Ut5.LJJJI("is_from_sensitive_words", strLIZLLL2, bundle);
            LogPbBean logPbBean = videoItemParams.getAweme().getLogPbBean();
            if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
                C786410Ut5.LJJJI("preClickImprId", imprId, bundle);
            }
            if (!c1er1.LLIIIILZ(videoItemParams.mEventType)) {
                C786410Ut5.LJJJI("is_from_video", "1", bundle);
            }
            C786410Ut5.LJJJI("group_id", videoItemParams.getAweme().getAid(), bundle);
            C786410Ut5.LJJJI("enter_from", videoItemParams.mEventType, bundle);
            C786410Ut5.LJJJI("enter_method", "ad_related_search_anchor_v2", bundle);
            String str11 = c688190Qz34.LJ;
            if (C123100dR.LIZ(str11) && str11 != null) {
                C786410Ut5.LJJJI("words_extra_type", str11, bundle);
            }
            C786410Ut5.LJJJI("penetrate_info", c688190Qz34.LJII, bundle);
            C259800zU c259800zU = new C259800zU();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (C1821107Bh.LIZIZ) {
                try {
                    String str12 = c688190Qz34.LJII;
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJ(n.class));
                        } else {
                            type = new TypeToken<n>() { // from class: X.0Qz0
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str12, type);
                        if (!(objLJIIIIZZ instanceof n)) {
                            objLJIIIIZZ = null;
                        }
                        r3 = (n) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        r3 = 0;
                    }
                    c259800zU.element = r3;
                    if (r3 == 0) {
                        strLIZJ = null;
                    } else {
                        strLIZJ = C2399609ak.LIZJ(r3, "sug_user_id");
                    }
                    if (!C123100dR.LIZ(strLIZJ) || strLIZJ == null) {
                        str2 = null;
                    } else {
                        str2 = (String) linkedHashMap2.put("sug_user_id", strLIZJ);
                    }
                    C189200o6.m2constructorimpl(str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            String strF = C1ER1.LIZIZ.f((n) c259800zU.element, c688190Qz34.LJII);
            if (C123100dR.LIZ(strF)) {
                linkedHashMap2.put("poi_card_id_list", strF);
            }
            if (!linkedHashMap2.isEmpty()) {
                try {
                    C786410Ut5.LJJJI("extraRequestParams", C1741890vQh.LJIIIIZZ(linkedHashMap2), bundle);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
            Map<String, String> mapLLLLLZ = C1ER1.LIZIZ.LLLLLZ(c688190Qz34.LJII);
            if (mapLLLLLZ != null) {
                linkedHashMap = new LinkedHashMap(mapLLLLLZ);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            if (!linkedHashMap.isEmpty()) {
                try {
                    C786410Ut5.LJJJI("suggest_word_mob_extra", C1741890vQh.LJIIIIZZ(linkedHashMap), bundle);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            C786410Ut5.LJJJI("is_display_sevensplit_screen", CardStruct.IStatusCode.DEFAULT, bundle);
            ViewGroup viewGroup = adFeedSearchBottomBarAssem2.LLJLLIL;
            if (viewGroup != null) {
                context = viewGroup.getContext();
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//search");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.withParam("search_saf", C1827007Do.LIZ());
            smartRouteBuildRoute.withParam("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken("c6053.d42994", PageFinder.via(adFeedSearchBottomBarAssem2.LJJIJL()), null));
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$1(AjS21S0300000_10 ajS21S0300000_10, View view) throws JSONException {
        String str;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        if (view != null) {
            View view2 = (View) ajS21S0300000_10.l0;
            C661010PwJ c661010PwJ = ((EcStoreLiveV2Assem) ajS21S0300000_10.l1).LLJZIJLIL;
            if (c661010PwJ == null || (searchMixFeedBase = c661010PwJ.LL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str = eComShopCardStruct.docId) == null) {
                str = "";
            }
            C662810PzD.LIZJ(view2, str);
            ((EcStoreLiveV2Assem) ajS21S0300000_10.l1).zp(false, (AddressCardProducts) ajS21S0300000_10.l2, 0);
            C662860PzI.LJIIIZ(((EcStoreLiveV2Assem) ajS21S0300000_10.l1).LLJZIJLIL, (AddressCardProducts) ajS21S0300000_10.l2, 0, C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS21S0300000_10.l1), "a2270.b6880.c3812.d4738_w6322_i0", PageFinder.via((View) ajS21S0300000_10.l0), true);
            C661010PwJ c661010PwJ2 = ((EcStoreLiveV2Assem) ajS21S0300000_10.l1).LLJZIJLIL;
            C662860PzI.LJI(PageFinder.via((View) ajS21S0300000_10.l0), C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS21S0300000_10.l1), (AddressCardProducts) ajS21S0300000_10.l2, c661010PwJ2, "a2270.b6880.c3812.d4738_w6322_i0");
            C662860PzI.LJII(((EcStoreLiveV2Assem) ajS21S0300000_10.l1).LLJZIJLIL, (AddressCardProducts) ajS21S0300000_10.l2, 0, C1558520qew.LJIIL((EcStoreLiveV2Assem) ajS21S0300000_10.l1), "a2270.b6880.c3812.d4738_w6322_i0", PageFinder.via((View) ajS21S0300000_10.l0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS21S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
