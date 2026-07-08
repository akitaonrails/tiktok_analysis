package g1c;

import X.AbstractC212214182y;
import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0317;
import X.AnonymousClass1814;
import X.AnonymousClass1857;
import X.C034S;
import X.C0C64;
import X.C1018703yb;
import X.C1104190eq9;
import X.C1120604Zw;
import X.C123500dV;
import X.C1388190mED;
import X.C15438062q;
import X.C1740590vOb;
import X.C1740600vOc;
import X.C1741480vQ2;
import X.C1766200w3u;
import X.C1768000w6o;
import X.C1768380w7Q;
import X.C1782290wTr;
import X.C182D;
import X.C182F;
import X.C183H;
import X.C183I;
import X.C18LA;
import X.C18NJ;
import X.C18NK;
import X.C18NO;
import X.C18NQ;
import X.C18NR;
import X.C18NU;
import X.C18NZ;
import X.C18OX;
import X.C18PM;
import X.C18PP;
import X.C18PR;
import X.C18PS;
import X.C18PU;
import X.C18PW;
import X.C1954807lC;
import X.C19EG;
import X.C1AQS;
import X.C20337514hx;
import X.C207296169u;
import X.C212201182l;
import X.C212206182q;
import X.C212207182r;
import X.C21269318Lj;
import X.C21271918Mj;
import X.C21272218Mm;
import X.C21272618Mq;
import X.C2344009Gk;
import X.EnumC1780190wQT;
import X.EnumC207181165j;
import X.InterfaceC1392640mLO;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcVideoAnchorPanelActivity;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel.ECommerceShowcaseCommentAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class AjS72S0100000_32 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS72S0100000_32(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C212206182q c212206182q;
        C212207182r c212207182r;
        Map<String, String> contentShowParams;
        boolean zLIZ;
        if (view != null) {
            if (!((C212206182q) ajS72S0100000_32.l0).LJIILJJIL() && (c212207182r = (c212206182q = (C212206182q) ajS72S0100000_32.l0).LLJJI) != null) {
                AbstractC212214182y abstractC212214182y = c212206182q.LLILZ;
                if (abstractC212214182y != null) {
                    contentShowParams = abstractC212214182y.getContentShowParams();
                } else {
                    contentShowParams = null;
                }
                AbstractC212214182y abstractC212214182y2 = ((C212206182q) ajS72S0100000_32.l0).LLILZ;
                if (abstractC212214182y2 != null) {
                    zLIZ = C183H.LIZ(abstractC212214182y2);
                } else {
                    zLIZ = false;
                }
                c212207182r.LJFF(contentShowParams, zLIZ);
            }
            Function1<? super C183I, Unit> function1 = ((C212206182q) ajS72S0100000_32.l0).LLJ;
            if (function1 != null) {
                function1.invoke(new C183I(view, (BcmStandardTrack) null, 4));
            }
        }
    }

    public static final void LIZ$1(AjS72S0100000_32 ajS72S0100000_32, View view) {
        AnonymousClass1857 anonymousClass1857;
        C1766200w3u c1766200w3u;
        if (view != null && (c1766200w3u = (anonymousClass1857 = (AnonymousClass1857) ajS72S0100000_32.l0).LLJJIJIL) != null) {
            c1766200w3u.LIZIZ(view, "button", anonymousClass1857.LLJJIII);
        }
    }

    public static final void LIZ$10(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            ((Function1) ajS72S0100000_32.l0).invoke(view);
        }
    }

    public static final void LIZ$11(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C18PU c18pu;
        BcmParams bcmParams;
        Map<String, ? extends Object> mapLIZ;
        if (view != null) {
            int i = C1782290wTr.LIZ[((C18PS) ajS72S0100000_32.l0).LIZIZ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c18pu = C18PU.BENEFIT_IMPACT_VSA_CARD_BG;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c18pu = C18PU.SMALL_VSA_CARD_BG;
                }
            } else {
                c18pu = C18PU.LARGE_VSA_CARD_BG;
            }
            C18PS c18ps = (C18PS) ajS72S0100000_32.l0;
            EcUgProduct ecUgProduct = c18ps.LLJ;
            if (ecUgProduct != null) {
                int i2 = c18ps.LLIZLLLIL;
                BcmStandardTrackData bcmStandardTrackData = ecUgProduct.bcmStandardTrack;
                if (bcmStandardTrackData != null && (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData)) != null) {
                    bcmParams = new BcmParams();
                    bcmParams.merge(mapLIZ);
                } else {
                    bcmParams = null;
                }
                C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
                Fragment fragment = ((C18PS) ajS72S0100000_32.l0).getFragment();
                c1741480vQ2.getClass();
                ((C18PS) ajS72S0100000_32.l0).LJ(i2, ecUgProduct, C1741480vQ2.LIZ(c18pu, fragment, i2, bcmParams));
            }
        }
    }

    public static final void LIZ$12(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C18PR c18pr;
        EcUgProduct ecUgProduct;
        BcmParams bcmParams;
        Map<String, ? extends Object> mapLIZ;
        if (view != null && (ecUgProduct = (c18pr = (C18PR) ajS72S0100000_32.l0).LLJ) != null) {
            int i = c18pr.LLIZLLLIL;
            BcmStandardTrackData bcmStandardTrackData = ecUgProduct.bcmStandardTrack;
            if (bcmStandardTrackData != null && (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData)) != null) {
                bcmParams = new BcmParams();
                bcmParams.merge(mapLIZ);
            } else {
                bcmParams = null;
            }
            C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
            C18PU c18pu = C18PU.LARGE_VSA_BUTTON;
            Fragment fragment = ((C18PR) ajS72S0100000_32.l0).getFragment();
            c1741480vQ2.getClass();
            ((C18PR) ajS72S0100000_32.l0).LJ(i, ecUgProduct, C1741480vQ2.LIZ(c18pu, fragment, i, bcmParams));
        }
    }

    public static final void LIZ$13(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C18PP c18pp;
        EcUgProduct ecUgProduct;
        BcmParams bcmParams;
        Map<String, ? extends Object> mapLIZ;
        if (view != null && (ecUgProduct = (c18pp = (C18PP) ajS72S0100000_32.l0).LLJ) != null) {
            int i = c18pp.LLIZLLLIL;
            BcmStandardTrackData bcmStandardTrackData = ecUgProduct.bcmStandardTrack;
            if (bcmStandardTrackData != null && (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData)) != null) {
                bcmParams = new BcmParams();
                bcmParams.merge(mapLIZ);
            } else {
                bcmParams = null;
            }
            C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
            C18PU c18pu = C18PU.LARGE_VSA_BUTTON;
            Fragment fragment = ((C18PP) ajS72S0100000_32.l0).getFragment();
            c1741480vQ2.getClass();
            ((C18PP) ajS72S0100000_32.l0).LJ(i, ecUgProduct, C1741480vQ2.LIZ(c18pu, fragment, i, bcmParams));
        }
    }

    public static final void LIZ$14(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C18PP c18pp;
        EcUgProduct ecUgProduct;
        if (view != null && (ecUgProduct = (c18pp = (C18PP) ajS72S0100000_32.l0).LLJ) != null) {
            int i = c18pp.LLIZLLLIL;
            C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
            C18PU c18pu = C18PU.LARGET_VSA_CLOSE;
            Fragment fragment = c18pp.getFragment();
            c1741480vQ2.getClass();
            C1740600vOc c1740600vOcLIZ = C1741480vQ2.LIZ(c18pu, fragment, i, null);
            C18PW c18pw = c18pp.LLILLJJLI;
            if (c18pw != null) {
                c18pw.LJFF();
            }
            C18PM c18pm = C18PM.LIZ;
            EnumC1780190wQT enumC1780190wQT = c18pp.LLILZIL;
            Map<String, String> map = c18pp.LLILLL;
            c18pm.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C18PM.LIZ(linkedHashMap);
            linkedHashMap.put("button_name", "close");
            linkedHashMap.put("entrance_form", enumC1780190wQT.getValue());
            String strLIZIZ = C123500dV.LIZIZ(ecUgProduct.productId);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
            linkedHashMap.put("group_id", C123500dV.LIZIZ(linkedHashMap2.get("group_id")));
            linkedHashMap.put("ad_id", C123500dV.LIZIZ(linkedHashMap2.get("ad_id")));
            linkedHashMap.put("creative_id", C123500dV.LIZIZ(linkedHashMap2.get("creative_id")));
            String strLIZIZ2 = C123500dV.LIZIZ(linkedHashMap2.get("log_id"));
            linkedHashMap.put("request_id", strLIZIZ2);
            linkedHashMap.put("enter_from", C123500dV.LIZIZ(linkedHashMap2.get("enter_from")));
            linkedHashMap.put("track_id", C18PM.LIZJ(i, strLIZIZ2, strLIZIZ));
            Map mapLIZ = C1740590vOb.LIZ(c1740600vOcLIZ);
            if (mapLIZ != null) {
                linkedHashMap.putAll(mapLIZ);
            }
            C1768000w6o.LIZ.getClass();
            C1768000w6o.LIZIZ("tiktokec_button_click", linkedHashMap);
            C207296169u c207296169u = C207296169u.LIZ;
            EnumC207181165j enumC207181165j = EnumC207181165j.CARD_CLOSE_CLICK;
            c207296169u.getClass();
            C207296169u.LIZ(enumC207181165j);
        }
    }

    public static final void LIZ$15(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            if (Intrinsics.LJFF(((AnonymousClass1814) ajS72S0100000_32.l0).LLIZ.getValue(), Boolean.TRUE)) {
                AnonymousClass1814 anonymousClass1814 = (AnonymousClass1814) ajS72S0100000_32.l0;
                anonymousClass1814.i0(anonymousClass1814.LLJJ);
            } else {
                AnonymousClass1814 anonymousClass18142 = (AnonymousClass1814) ajS72S0100000_32.l0;
                anonymousClass18142.j0(anonymousClass18142.LLJJ);
            }
        }
    }

    public static final void LIZ$16(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            AnonymousClass1814 anonymousClass1814 = (AnonymousClass1814) ajS72S0100000_32.l0;
            anonymousClass1814.i0(anonymousClass1814.LLJJ);
        }
    }

    public static final void LIZ$17(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            AnonymousClass1814 anonymousClass1814 = (AnonymousClass1814) ajS72S0100000_32.l0;
            anonymousClass1814.j0(anonymousClass1814.LLJJ);
        }
    }

    public static final void LIZ$18(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            AnonymousClass1814 anonymousClass1814 = (AnonymousClass1814) ajS72S0100000_32.l0;
            anonymousClass1814.j0(anonymousClass1814.LLJJ);
        }
    }

    public static final void LIZ$19(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            AnonymousClass1814 anonymousClass1814 = (AnonymousClass1814) ajS72S0100000_32.l0;
            anonymousClass1814.i0(anonymousClass1814.LLJJ);
        }
    }

    public static final void LIZ$2(AjS72S0100000_32 ajS72S0100000_32, View view) {
        AnonymousClass1857 anonymousClass1857;
        C1766200w3u c1766200w3u;
        if (view != null && (c1766200w3u = (anonymousClass1857 = (AnonymousClass1857) ajS72S0100000_32.l0).LLJJIJIL) != null) {
            c1766200w3u.LIZIZ(view, "other", anonymousClass1857.LLJJIII);
        }
    }

    public static final void LIZ$20(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            Function0<Unit> function0 = ((C18NK) ajS72S0100000_32.l0).LLILLL;
            if (function0 != null) {
                function0.invoke();
            }
            C18NJ c18nj = C18NJ.LIZ;
            Context context = ((C18NK) ajS72S0100000_32.l0).getContext();
            C18NK c18nk = (C18NK) ajS72S0100000_32.l0;
            ECommerceShowcaseCommentAnchorViewModel eCommerceShowcaseCommentAnchorViewModel = c18nk.LLIZ;
            C18NJ.LIZJ(c18nj, context, eCommerceShowcaseCommentAnchorViewModel.LLILZLL, c18nk.LL, eCommerceShowcaseCommentAnchorViewModel.LLILLJJLI, true);
            C18NZ.LIZ.getClass();
            C1018703yb.LIZLLL("tiktok_video_anchor_click", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 17));
            C1018703yb.LIZLLL("tiktokec_shop_entrance_click", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 19));
        }
    }

    public static final void LIZ$21(AjS72S0100000_32 ajS72S0100000_32, View view) {
        int i;
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        boolean z;
        Aweme awemeLJJLIIIJJIZ3;
        Integer second;
        boolean z2;
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        C18NO c18no;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel;
        AnchorProductInfoModel anchorProductInfoModel;
        Aweme awemeLJJLIIIJJIZ4;
        if (view != null) {
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            ProductListModel productListModel = ((C18NO) ajS72S0100000_32.l0).LIZIZ.LLILLJJLI;
            c21272618Mq.getClass();
            anchorBizUtils.getClass();
            if (AnchorBizUtils.LJJJLIIL(productListModel)) {
                i = 0;
            } else {
                i = C18OX.LIZ().anchorPanelStyle;
            }
            Integer numValueOf = Integer.valueOf(i);
            int size = ((C18NO) ajS72S0100000_32.l0).LIZIZ.LLILZIL.size();
            anchorBizUtils.getClass();
            int iLJJJI = AnchorBizUtils.LJJJI(size, numValueOf);
            C21269318Lj c21269318Lj = new C21269318Lj();
            c21269318Lj.LIZ.setPanelStyle(iLJJJI);
            c21269318Lj.LIZ.setPanelClickMethod(2);
            InterfaceC1392640mLO interfaceC1392640mLO = ((C18NO) ajS72S0100000_32.l0).LIZIZ.LL;
            Integer num = null;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            c21269318Lj.LIZ.setEnableMaybeYouLike(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, ((C18NO) ajS72S0100000_32.l0).LIZIZ.LLILZIL, false));
            c21269318Lj.LIZ.setEnableSearchEntrance(true);
            c21269318Lj.LIZ.setEnablePromotionBanner(true);
            InterfaceC1392640mLO interfaceC1392640mLO2 = ((C18NO) ajS72S0100000_32.l0).LIZIZ.LL;
            if (interfaceC1392640mLO2 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ2 = null;
            }
            anchorBizUtils.getClass();
            if (!AnchorBizUtils.LJJJLL(awemeLJJLIIIJJIZ2) ? C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_pdp_full_page_from_anchor", true) == 1 : C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_pdp_full_page_from_anchor_ads", true) == 1) {
                z = true;
            } else {
                z = false;
            }
            c21269318Lj.LIZ.setPanelFullScreen(z);
            c21269318Lj.LIZ.setEnableClaimVoucher(true);
            AnchorPanelConfig anchorPanelConfig = c21269318Lj.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO3 = ((C18NO) ajS72S0100000_32.l0).LIZIZ.LL;
            if (interfaceC1392640mLO3 != null) {
                awemeLJJLIIIJJIZ3 = interfaceC1392640mLO3.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ3 = null;
            }
            ProductListModel productListModelLJJIJL = C21272218Mm.LJJIJL(awemeLJJLIIIJJIZ3, ((C18NO) ajS72S0100000_32.l0).LIZIZ.LL, "video_main_anchor", anchorPanelConfig, "video_main_anchor");
            if (C1388190mED.LIZIZ(((C18NO) ajS72S0100000_32.l0).LIZ.getContext()) != null && (anchorProductInfoModel = (eCommerceAnchorPanelViewModel = (c18no = (C18NO) ajS72S0100000_32.l0).LIZIZ).LLIZ) != null) {
                Context context = c18no.LIZ.getContext();
                C18NO c18no2 = (C18NO) ajS72S0100000_32.l0;
                ViewGroup viewGroup = c18no2.LIZ;
                boolean zLIZJ = C21272618Mq.LIZJ(c18no2.LIZIZ.LLILLJJLI);
                InterfaceC1392640mLO interfaceC1392640mLO4 = ((C18NO) ajS72S0100000_32.l0).LIZIZ.LL;
                if (interfaceC1392640mLO4 != null) {
                    awemeLJJLIIIJJIZ4 = interfaceC1392640mLO4.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ4 = null;
                }
                eCommerceAnchorPanelViewModel.QQ2(context, viewGroup, anchorProductInfoModel, 0, zLIZJ, "c9855.d40179", awemeLJJLIIIJJIZ4);
            }
            HashMap map = new HashMap();
            C18NR c18nr = ((C18NO) ajS72S0100000_32.l0).LIZJ;
            if (c18nr != null && (titleShowStateInfo$ecommerce_video_release = c18nr.getTitleShowStateInfo$ecommerce_video_release()) != null) {
                if (titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue()) {
                    num = 1;
                } else {
                    num = 0;
                }
                second = titleShowStateInfo$ecommerce_video_release.getSecond();
                map.putAll(((C18NO) ajS72S0100000_32.l0).LJI(titleShowStateInfo$ecommerce_video_release.getSecond().intValue(), titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue()));
            } else {
                second = null;
            }
            Map<String, String> mapLIZ = C1104190eq9.LIZ(view, "c9855.d40179");
            C18NO c18no3 = (C18NO) ajS72S0100000_32.l0;
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = c18no3.LIZIZ;
            C18NR c18nr2 = c18no3.LIZJ;
            if (c18nr2 != null && c18nr2.LLJJJIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            eCommerceAnchorPanelViewModel2.LQ2(productListModelLJJIJL, 1, z2, String.valueOf(num), String.valueOf(second), Boolean.valueOf(anchorPanelConfig.enableMaybeYouLike), anchorPanelConfig.panelFullScreen, mapLIZ, map, "pdp");
            ((C18NO) ajS72S0100000_32.l0).LIZIZ.YQ2("a2270.b2878.c9855.d40179");
        }
    }

    public static final void LIZ$22(AjS72S0100000_32 ajS72S0100000_32, View view) {
        ArrayList arrayList;
        String strCf;
        Aweme awemeLJJLIIIJJIZ;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        List<AnchorProductInfoModel> list;
        String string;
        InterfaceC1392640mLO interfaceC1392640mLO;
        if (view != null) {
            C18NQ c18nq = (C18NQ) ajS72S0100000_32.l0;
            AnchorCommonViewModel anchorCommonViewModel = c18nq.LIZJ;
            if (anchorCommonViewModel != null) {
                anchorCommonViewModel.LL = true;
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = c18nq.LIZIZ;
            if (eCommerceAnchorPanelViewModel != null && (interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL) != null) {
                interfaceC1392640mLO.LJJLIIIJJIZ();
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = ((C18NQ) ajS72S0100000_32.l0).LIZIZ;
            String str = "";
            if (eCommerceAnchorPanelViewModel2 != null && (list = eCommerceAnchorPanelViewModel2.LLILZIL) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<AnchorProductInfoModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    Long l = it2.next().extraData.productId;
                    if (l == null || (string = l.toString()) == null) {
                        string = "";
                    }
                    arrayList2.add(string);
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            eCommerceAnchorPanelViewModel.OQ2(arrayList, true, 1, new AwS611S0100000_32((C18NQ) ajS72S0100000_32.l0, 394));
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO2 = ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LL;
            Aweme awemeLJJLIIIJJIZ2 = null;
            if (interfaceC1392640mLO2 != null) {
                strCf = interfaceC1392640mLO2.Cf();
            } else {
                strCf = null;
            }
            InterfaceC1392640mLO interfaceC1392640mLO3 = ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LL;
            if (interfaceC1392640mLO3 != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO3.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            C2344009Gk c2344009GkLJ = c21271918Mj.LJ(false, strCf, awemeLJJLIIIJJIZ, ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LLILZIL, "video_anchor", "ecom_panel");
            if (c2344009GkLJ != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IAnchorDependencyService.class.getName();
                    if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
                }
                if (((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getAnchorMobRefactorExpEnable()) {
                    ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LLJJIJI = c2344009GkLJ;
                }
            }
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            ProductListModel productListModel = ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LLILLJJLI;
            c21272618Mq.getClass();
            boolean zLJIIJJI = C21272618Mq.LJIIJJI(productListModel);
            C18NQ c18nq2 = (C18NQ) ajS72S0100000_32.l0;
            ECommerceAnchorPanelViewModel.NQ2(c18nq2.LIZIZ, c18nq2.LIZ.getContext(), view, null, "ecom_panel", null, Boolean.TRUE, zLJIIJJI, 184);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C18NQ) ajS72S0100000_32.l0).LIZ.getContext());
            if (c19egLIZIZ != null) {
                C21269318Lj c21269318Lj = new C21269318Lj();
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                int size = ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LLILZIL.size();
                anchorBizUtils.getClass();
                c21269318Lj.LIZ.setPanelStyle(AnchorBizUtils.LJJJI(size, 2));
                c21269318Lj.LIZ.setPanelClickMethod(1);
                c21269318Lj.LIZ.setEnableMaybeYouLike(false);
                c21269318Lj.LIZ.setEnablePromotionBanner(true);
                c21269318Lj.LIZ.setEnableSearchEntrance(true);
                c21269318Lj.LIZ.setPanelFullScreen(zLJIIJJI);
                c21269318Lj.LIZ.setEnableClaimVoucher(true);
                AnchorPanelConfig anchorPanelConfig = c21269318Lj.LIZ;
                String strLJ = C18LA.LJ("c20736.d0", ((C18NQ) ajS72S0100000_32.l0).LIZ, null);
                if (strLJ != null) {
                    str = strLJ;
                }
                InterfaceC1392640mLO interfaceC1392640mLO4 = ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LL;
                if (interfaceC1392640mLO4 != null) {
                    awemeLJJLIIIJJIZ2 = interfaceC1392640mLO4.LJJLIIIJJIZ();
                }
                ProductListModel productListModelLJJIJL = C21272218Mm.LJJIJL(awemeLJJLIIIJJIZ2, ((C18NQ) ajS72S0100000_32.l0).LIZIZ.LL, "video_single_anchor", anchorPanelConfig, "video_single_anchor");
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = ((C18NQ) ajS72S0100000_32.l0).LIZIZ;
                AnchorBizUtils.LJJLIL(c19egLIZIZ, productListModelLJJIJL, str, anchorPanelConfig, eCommerceAnchorPanelViewModel3.LL, eCommerceAnchorPanelViewModel3.LLILLL);
            }
        }
    }

    public static final void LIZ$23(AjS72S0100000_32 ajS72S0100000_32, View view) {
        ArrayList arrayList;
        Aweme awemeLJJLIIIJJIZ;
        List<AnchorProductInfoModel> list;
        String string;
        InterfaceC1392640mLO interfaceC1392640mLO;
        if (view != null) {
            C18NU c18nu = (C18NU) ajS72S0100000_32.l0;
            AnchorCommonViewModel anchorCommonViewModel = c18nu.LIZJ;
            if (anchorCommonViewModel != null) {
                anchorCommonViewModel.LL = true;
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = c18nu.LIZIZ;
            if (eCommerceAnchorPanelViewModel != null && (interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL) != null) {
                interfaceC1392640mLO.LJJLIIIJJIZ();
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = ((C18NU) ajS72S0100000_32.l0).LIZIZ;
            String str = "";
            if (eCommerceAnchorPanelViewModel2 != null && (list = eCommerceAnchorPanelViewModel2.LLILZIL) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<AnchorProductInfoModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    Long l = it2.next().extraData.productId;
                    if (l == null || (string = l.toString()) == null) {
                        string = "";
                    }
                    arrayList2.add(string);
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            eCommerceAnchorPanelViewModel.OQ2(arrayList, true, 1, new AwS611S0100000_32((C18NU) ajS72S0100000_32.l0, 395));
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            ProductListModel productListModel = ((C18NU) ajS72S0100000_32.l0).LIZIZ.LLILLJJLI;
            c21272618Mq.getClass();
            boolean zLJIIJJI = C21272618Mq.LJIIJJI(productListModel);
            C18NU c18nu2 = (C18NU) ajS72S0100000_32.l0;
            ECommerceAnchorPanelViewModel.NQ2(c18nu2.LIZIZ, c18nu2.LIZ.getContext(), view, null, "ecom_panel", null, Boolean.TRUE, zLJIIJJI, 184);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C18NU) ajS72S0100000_32.l0).LIZ.getContext());
            if (c19egLIZIZ != null) {
                C21269318Lj c21269318Lj = new C21269318Lj();
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                int size = ((C18NU) ajS72S0100000_32.l0).LIZIZ.LLILZIL.size();
                anchorBizUtils.getClass();
                c21269318Lj.LIZ.setPanelStyle(AnchorBizUtils.LJJJI(size, 2));
                c21269318Lj.LIZ.setEnableSearchEntrance(true);
                c21269318Lj.LIZ.setPanelClickMethod(1);
                InterfaceC1392640mLO interfaceC1392640mLO2 = ((C18NU) ajS72S0100000_32.l0).LIZIZ.LL;
                Aweme awemeLJJLIIIJJIZ2 = null;
                if (interfaceC1392640mLO2 != null) {
                    awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ = null;
                }
                c21269318Lj.LIZ.setEnableMaybeYouLike(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, ((C18NU) ajS72S0100000_32.l0).LIZIZ.LLILZIL, true));
                c21269318Lj.LIZ.setEnablePromotionBanner(true);
                c21269318Lj.LIZ.setPanelFullScreen(zLJIIJJI);
                c21269318Lj.LIZ.setEnableClaimVoucher(true);
                AnchorPanelConfig anchorPanelConfig = c21269318Lj.LIZ;
                String strLJ = C18LA.LJ("c20736.d0", ((C18NU) ajS72S0100000_32.l0).LIZ, null);
                if (strLJ != null) {
                    str = strLJ;
                }
                InterfaceC1392640mLO interfaceC1392640mLO3 = ((C18NU) ajS72S0100000_32.l0).LIZIZ.LL;
                if (interfaceC1392640mLO3 != null) {
                    awemeLJJLIIIJJIZ2 = interfaceC1392640mLO3.LJJLIIIJJIZ();
                }
                ProductListModel productListModelLJJIJL = C21272218Mm.LJJIJL(awemeLJJLIIIJJIZ2, ((C18NU) ajS72S0100000_32.l0).LIZIZ.LL, "video_single_anchor", anchorPanelConfig, "video_single_anchor");
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = ((C18NU) ajS72S0100000_32.l0).LIZIZ;
                AnchorBizUtils.LJJLIL(c19egLIZIZ, productListModelLJJIJL, str, anchorPanelConfig, eCommerceAnchorPanelViewModel3.LL, eCommerceAnchorPanelViewModel3.LLILLL);
            }
        }
    }

    public static final void LIZ$3(AjS72S0100000_32 ajS72S0100000_32, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS72S0100000_32.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$4(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C19EG activity;
        if (view != null) {
            ((ECommerceAnchorPanelFragment) ajS72S0100000_32.l0).dismiss();
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) ajS72S0100000_32.l0;
            if (eCommerceAnchorPanelFragment.LLJJIJIIJIL.panelFullScreen && (eCommerceAnchorPanelFragment.getActivity() instanceof EcVideoAnchorPanelActivity) && (activity = ((ECommerceAnchorPanelFragment) ajS72S0100000_32.l0).getActivity()) != null) {
                activity.finish();
            }
        }
    }

    public static final void LIZ$5(AjS72S0100000_32 ajS72S0100000_32, View view) {
        C19EG activity;
        if (view != null) {
            ((ECommerceAnchorPanelFragment) ajS72S0100000_32.l0).dismiss();
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) ajS72S0100000_32.l0;
            if (eCommerceAnchorPanelFragment.LLJJIJIIJIL.panelFullScreen && (eCommerceAnchorPanelFragment.getActivity() instanceof EcVideoAnchorPanelActivity) && (activity = ((ECommerceAnchorPanelFragment) ajS72S0100000_32.l0).getActivity()) != null) {
                activity.finish();
            }
        }
    }

    public static final void LIZ$6(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            View.OnClickListener closeClickListener = ((C182F) ajS72S0100000_32.l0).getCloseClickListener();
            if (closeClickListener != null) {
                closeClickListener.onClick(view);
            }
            C20337514hx c20337514hx = C20337514hx.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c20337514hx.getClass();
            C20337514hx.LIZJ(jCurrentTimeMillis);
        }
    }

    public static final void LIZ$7(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            View.OnClickListener closeClickListener = ((C182D) ajS72S0100000_32.l0).getCloseClickListener();
            if (closeClickListener != null) {
                closeClickListener.onClick(view);
            }
            C20337514hx c20337514hx = C20337514hx.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c20337514hx.getClass();
            C20337514hx.LIZJ(jCurrentTimeMillis);
        }
    }

    public static final void LIZ$8(AjS72S0100000_32 ajS72S0100000_32, View view) {
        View.OnClickListener closeClickListener;
        if (view != null && (closeClickListener = ((C212201182l) ajS72S0100000_32.l0).getCloseClickListener()) != null) {
            closeClickListener.onClick(view);
        }
    }

    public static final void LIZ$9(AjS72S0100000_32 ajS72S0100000_32, View view) {
        if (view != null) {
            ((Function1) ajS72S0100000_32.l0).invoke(view);
        }
    }
}
