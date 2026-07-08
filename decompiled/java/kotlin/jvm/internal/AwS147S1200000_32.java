package kotlin.jvm.internal;

import X.AbstractC21274918Nn;
import X.AbstractC21324618cm;
import X.AbstractC21333318eB;
import X.C09AY;
import X.C1018703yb;
import X.C13LE;
import X.C13LP;
import X.C1775130wIJ;
import X.C1778170wND;
import X.C18AO;
import X.C18AZ;
import X.C18KJ;
import X.C18NS;
import X.C18WR;
import X.C19EG;
import X.C21155917qf;
import X.C21156117qh;
import X.C21176017tu;
import X.C21176617u0;
import X.C21270318Lt;
import X.C21271918Mj;
import X.C21284618Rg;
import X.C21292718Uj;
import X.C21325218cs;
import X.C21325818cy;
import X.C21325918cz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.InterfaceC1392640mLO;
import X.InterfaceC1506090pIN;
import X.InterfaceC21284718Rh;
import X.ViewTreeObserverOnGlobalLayoutListenerC21155717qd;
import X.ViewTreeObserverOnScrollChangedListenerC21156017qg;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public class AwS147S1200000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS147S1200000_32 awS147S1200000_32) {
        AbstractC21274918Nn abstractC21274918Nn = (AbstractC21274918Nn) awS147S1200000_32.l1;
        if (abstractC21274918Nn != null) {
            abstractC21274918Nn.LIZIZ(((ECommerceAnchorPanelViewModel) awS147S1200000_32.l2).WQ2(), awS147S1200000_32.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS147S1200000_32 awS147S1200000_32) {
        AbstractC21274918Nn abstractC21274918Nn = (AbstractC21274918Nn) awS147S1200000_32.l1;
        if (abstractC21274918Nn != null) {
            abstractC21274918Nn.LIZIZ(((ECommerceAnchorPanelViewModel) awS147S1200000_32.l2).WQ2(), awS147S1200000_32.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS147S1200000_32 awS147S1200000_32) {
        InterfaceC21284718Rh interfaceC21284718RhLJJIJIL = ((C21284618Rg) awS147S1200000_32.l1).LJJIJIL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        interfaceC21284718RhLJJIJIL.LIZJ(c2344009Gk, awS147S1200000_32.s0, (Aweme) awS147S1200000_32.l2);
        return c2344009Gk.LIZ;
    }

    public static final Object invoke$11(AwS147S1200000_32 awS147S1200000_32) {
        InterfaceC21284718Rh interfaceC21284718RhLJJIJIL = ((C21284618Rg) awS147S1200000_32.l1).LJJIJIL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = awS147S1200000_32.s0;
        Aweme aweme = (Aweme) awS147S1200000_32.l2;
        InterfaceC1392640mLO interfaceC1392640mLO = ((C21284618Rg) awS147S1200000_32.l1).LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strLLIIJI = interfaceC1392640mLO.LLIIJI();
        ((C21284618Rg) awS147S1200000_32.l1).getClass();
        return interfaceC21284718RhLJJIJIL.LJI(c2344009Gk, str, aweme, strLLIIJI, ((C21284618Rg) awS147S1200000_32.l1).LLIZ).LIZ;
    }

    public static final Object invoke$12(AwS147S1200000_32 awS147S1200000_32) throws JSONException {
        ((C21176017tu) awS147S1200000_32.l1).LJIILL();
        Map<String, ? extends Object> mapLJIIL = ((C21176017tu) awS147S1200000_32.l1).LJIIL(null);
        CopyOnWriteArrayList<C21176617u0> copyOnWriteArrayList = (CopyOnWriteArrayList) ((C21176017tu) awS147S1200000_32.l1).LIZLLL.getValue();
        String str = awS147S1200000_32.s0;
        C1775130wIJ c1775130wIJ = (C1775130wIJ) awS147S1200000_32.l2;
        for (C21176617u0 c21176617u0 : copyOnWriteArrayList) {
            if (c21176617u0 != null && Intrinsics.LJFF(c21176617u0.LIZ.LIZ, str) && c1775130wIJ.LJ >= c21176617u0.LIZIZ) {
                c1775130wIJ.LIZLLL(c21176617u0.LIZ, mapLJIIL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS147S1200000_32 awS147S1200000_32) {
        try {
            int i = ((C21325818cy) awS147S1200000_32.l1).LJII;
            ArrayList<AbstractC21333318eB<?>> arrayList = new ArrayList<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                Map<String, AbstractC21324618cm> map = C21325218cs.LIZ;
                AbstractC21333318eB<?> abstractC21333318eBLIZ = C21325218cs.LIZ(awS147S1200000_32.s0, (C21325918cz) awS147S1200000_32.l2, ((C21325818cy) awS147S1200000_32.l1).LIZ, true);
                abstractC21333318eBLIZ.LJJJI();
                arrayList.add(abstractC21333318eBLIZ);
            }
            ((C21325818cy) awS147S1200000_32.l1).LJIIIIZZ = arrayList;
            ((C21325818cy) awS147S1200000_32.l1).LJIIIZ = false;
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        ((C21325818cy) awS147S1200000_32.l1).LJIIIZ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS147S1200000_32 awS147S1200000_32) {
        try {
            int i = ((C21325818cy) awS147S1200000_32.l1).LIZJ;
            ArrayList<AbstractC21333318eB<?>> arrayList = new ArrayList<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                Map<String, AbstractC21324618cm> map = C21325218cs.LIZ;
                arrayList.add(C21325218cs.LIZ(awS147S1200000_32.s0, (C21325918cz) awS147S1200000_32.l2, ((C21325818cy) awS147S1200000_32.l1).LIZ, false));
            }
            ((C21325818cy) awS147S1200000_32.l1).LJ = arrayList;
            ((C21325818cy) awS147S1200000_32.l1).LJFF = false;
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        ((C21325818cy) awS147S1200000_32.l1).LJFF = false;
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS147S1200000_32 awS147S1200000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble onLoadFailed[");
        sbLIZ.append(((C21155917qf) awS147S1200000_32.l1).LLJIJIL);
        sbLIZ.append("]: (code: ");
        sbLIZ.append((Integer) awS147S1200000_32.l2);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(awS147S1200000_32.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS147S1200000_32 awS147S1200000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble onLoadFailed[");
        sbLIZ.append(((ViewTreeObserverOnScrollChangedListenerC21156017qg) awS147S1200000_32.l1).LLJIJIL);
        sbLIZ.append("]: (code: ");
        sbLIZ.append((Integer) awS147S1200000_32.l2);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(awS147S1200000_32.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$17(AwS147S1200000_32 awS147S1200000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble onLoadFailed[");
        sbLIZ.append(((C21156117qh) awS147S1200000_32.l1).LLJIJIL);
        sbLIZ.append("]: (code: ");
        sbLIZ.append((Integer) awS147S1200000_32.l2);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(awS147S1200000_32.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(AwS147S1200000_32 awS147S1200000_32) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS147S1200000_32.s0);
        sbLIZ.append(": fragment: ");
        sbLIZ.append(C13LE.LIZ(((Fragment) awS147S1200000_32.l1).getClass()).LJI());
        sbLIZ.append('#');
        sbLIZ.append(((Fragment) awS147S1200000_32.l1).hashCode());
        sbLIZ.append(" --- frame_id: ");
        C18KJ.LIZ.getClass();
        sbLIZ.append(C18KJ.LIZJ.get((Fragment) awS147S1200000_32.l1));
        if (((C19EG) awS147S1200000_32.l2) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("activity: ");
            sbLIZ2.append(C13LE.LIZ(((C19EG) awS147S1200000_32.l2).getClass()).LJI());
            sbLIZ2.append('#');
            sbLIZ2.append(((C19EG) awS147S1200000_32.l2).hashCode());
            sbLIZ2.append(" --- page_id: ");
            sbLIZ2.append(C18KJ.LIZIZ.get((C19EG) awS147S1200000_32.l2));
            sbLIZ2.append('\n');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS147S1200000_32 awS147S1200000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internal popup onLoadFailed[");
        sbLIZ.append(((ViewTreeObserverOnGlobalLayoutListenerC21155717qd) awS147S1200000_32.l1).LLIZ);
        sbLIZ.append("]: (code: ");
        sbLIZ.append((Integer) awS147S1200000_32.l2);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(awS147S1200000_32.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS147S1200000_32 awS147S1200000_32) {
        Map mapCreateReportParams$default;
        TuxIconView tuxIconView = ((ECommerceAnchorPanelFragment) awS147S1200000_32.l2).LLJLLL;
        TuxAlertBadgeLayout tuxAlertBadgeLayout = null;
        if (tuxIconView == null) {
            mapCreateReportParams$default = null;
        } else {
            mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c92278.d6087", PageFinder.via((View) tuxIconView), null, 4, null);
        }
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        TuxAlertBadgeLayout tuxAlertBadgeLayout2 = ((ECommerceAnchorPanelFragment) awS147S1200000_32.l2).LLJLLIL;
        if (tuxAlertBadgeLayout2 != null) {
            tuxAlertBadgeLayout = tuxAlertBadgeLayout2;
        }
        int count = tuxAlertBadgeLayout.getCount();
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) awS147S1200000_32.l2;
        ProductListModel productListModel = eCommerceAnchorPanelFragment.LLJJIJIL.LLILLJJLI;
        CartBenefitInfo cartBenefitInfo = eCommerceAnchorPanelFragment.LLLIZZ;
        String str = eCommerceAnchorPanelFragment.LLJJ;
        c21271918Mj.getClass();
        C21271918Mj.LJIIJ(count, productListModel, cartBenefitInfo, str, mapCreateReportParams$default);
        SmartRouter.buildRoute(((ECommerceAnchorPanelFragment) awS147S1200000_32.l2).getContext(), awS147S1200000_32.s0).open();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS147S1200000_32 awS147S1200000_32) {
        Map mapCreateReportParams$default;
        TuxAlertBadgeLayout tuxAlertBadgeLayoutLLLZIL = ((EcCommentAnchorPanelActivity) awS147S1200000_32.l2).LLLZIL();
        if (tuxAlertBadgeLayoutLLLZIL != null) {
            mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c92278.d6087", PageFinder.via((View) tuxAlertBadgeLayoutLLLZIL), null, 4, null);
        } else {
            mapCreateReportParams$default = null;
        }
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLZIJ(0, ((EcCommentAnchorPanelActivity) awS147S1200000_32.l2).LLJILLL);
        EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity = (EcCommentAnchorPanelActivity) awS147S1200000_32.l2;
        AwemePruningModel awemePruningModel = ecCommentAnchorPanelActivity.LLJJIII;
        int i = ecCommentAnchorPanelActivity.LLJJIJIIJIL;
        CartBenefitInfo cartBenefitInfo = ecCommentAnchorPanelActivity.LLJLILLLLZIIL;
        List<AnchorProductInfoModel> list = ecCommentAnchorPanelActivity.LLJILLL;
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_cart_entrance_click", new C21270318Lt(i, cartBenefitInfo, mapCreateReportParams$default, anchorProductInfoModel, awemePruningModel, list));
        EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity2 = (EcCommentAnchorPanelActivity) awS147S1200000_32.l2;
        ecCommentAnchorPanelActivity2.LLJJJIL = true;
        SmartRouter.buildRoute(ecCommentAnchorPanelActivity2, awS147S1200000_32.s0).open();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS147S1200000_32 awS147S1200000_32) {
        NativePreloadController nativePreloadController = (NativePreloadController) awS147S1200000_32.l1;
        nativePreloadController.LIZJ(nativePreloadController.LJFF);
        NativePreloadController nativePreloadController2 = (NativePreloadController) awS147S1200000_32.l1;
        if (!nativePreloadController2.LJIIIIZZ) {
            nativePreloadController2.LIZLLL((InterfaceC1506090pIN) awS147S1200000_32.l2, awS147S1200000_32.s0);
            ((NativePreloadController) awS147S1200000_32.l1).LJIIIIZZ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS147S1200000_32 awS147S1200000_32) {
        if (!C21292718Uj.LIZ(((C18WR) awS147S1200000_32.l1).T2(), ((C18WR) awS147S1200000_32.l1).G2(), "use_history", new AwS576S0100000_32((C18WR) awS147S1200000_32.l1, 383), new AwS147S1200000_32((C18WR) awS147S1200000_32.l1, awS147S1200000_32.s0, (AIChatGenNode) awS147S1200000_32.l2, 7), 16)) {
            ((C18WR) awS147S1200000_32.l1).c3(awS147S1200000_32.s0, (AIChatGenNode) awS147S1200000_32.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS147S1200000_32 awS147S1200000_32) {
        ((C18WR) awS147S1200000_32.l1).c3(awS147S1200000_32.s0, (AIChatGenNode) awS147S1200000_32.l2);
        return Boolean.FALSE;
    }

    public static final Object invoke$8(AwS147S1200000_32 awS147S1200000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target: ");
        sbLIZ.append(((C18AZ) awS147S1200000_32.l1).getBtm());
        sbLIZ.append(", rule: ");
        sbLIZ.append(awS147S1200000_32.s0);
        sbLIZ.append(", result: ");
        sbLIZ.append((C1778170wND) awS147S1200000_32.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS147S1200000_32 awS147S1200000_32) {
        return ((C21284618Rg) awS147S1200000_32.l1).LJJIJIL().LJ(new C2344009Gk(), awS147S1200000_32.s0, (Aweme) awS147S1200000_32.l2).LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewTreeObserverOnGlobalLayoutListenerC21155717qd;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C21155917qf c21155917qf, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21155917qf;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(ViewTreeObserverOnScrollChangedListenerC21156017qg viewTreeObserverOnScrollChangedListenerC21156017qg, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewTreeObserverOnScrollChangedListenerC21156017qg;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C21156117qh c21156117qh, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21156117qh;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C21176017tu c21176017tu, String str, C1775130wIJ c1775130wIJ, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21176017tu;
        this.s0 = str;
        this.l2 = c1775130wIJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C18AO c18ao, String str, C1778170wND c1778170wND, int i) {
        super(0);
        this.$t = i;
        this.l1 = c18ao;
        this.s0 = str;
        this.l2 = c1778170wND;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C18NS c18ns, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c18ns;
        this.l2 = eCommerceAnchorPanelViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS147S1200000_32(C21284618Rg c21284618Rg, C21284618Rg<T, S> c21284618Rg2, String str, Aweme aweme) {
        super(0);
        this.$t = aweme;
        this.l1 = c21284618Rg;
        this.s0 = c21284618Rg2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C18WR c18wr, String str, AIChatGenNode aIChatGenNode, int i) {
        super(0);
        this.$t = i;
        this.l1 = c18wr;
        this.s0 = str;
        this.l2 = aIChatGenNode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(C21325818cy c21325818cy, String str, C21325918cz c21325918cz, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21325818cy;
        this.s0 = str;
        this.l2 = c21325918cz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(View view, ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = view;
        this.l2 = eCommerceAnchorPanelFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(View view, EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = view;
        this.l2 = ecCommentAnchorPanelActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(Fragment fragment, C19EG c19eg, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = fragment;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1200000_32(NativePreloadController nativePreloadController, InterfaceC1506090pIN interfaceC1506090pIN, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = nativePreloadController;
        this.l2 = interfaceC1506090pIN;
        this.s0 = str;
    }
}
