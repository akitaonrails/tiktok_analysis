package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C049Y;
import X.C098200Yq;
import X.C1018703yb;
import X.C1407130mil;
import X.C1407140mim;
import X.C1745480vWU;
import X.C1748720vbi;
import X.C1761290vvz;
import X.C1761430vwD;
import X.C1761440vwE;
import X.C1766690w4h;
import X.C189200o6;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.EnumC1407150min;
import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AjS3S1200000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS3S1200000_26 ajS3S1200000_26, View view) {
        if (view != null) {
            C1745480vWU.LJ(((AddressEditViewModel) ((DeliveryInstructionViewHolder) ajS3S1200000_26.l1).LLJJI.getValue()).LLJJIJIL, "delivery_instructions", C2097908Jt.LIZJ(new Pair("button_type", ajS3S1200000_26.s0)), null, 4);
            JediViewModel jediViewModel = (JediViewModel) ((DeliveryInstructionViewHolder) ajS3S1200000_26.l1).LLJJI.getValue();
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26((DeliveryInstructionInfo) ajS3S1200000_26.l2, 158);
            jediViewModel.getClass();
            jediViewModel.setState(new AwS605S0100000_26(awS605S0100000_26, (Function1<? super String, Unit>) 851));
        }
    }

    public static final void LIZ$1(AjS3S1200000_26 ajS3S1200000_26, View view) {
        if (view != null) {
            ((C1766690w4h) ajS3S1200000_26.l1).setQuitType("next");
            TuxSheet tuxSheet = ((C1766690w4h) ajS3S1200000_26.l1).LLILZLL;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
            try {
                SmartRouter.buildRoute(((C1766690w4h) ajS3S1200000_26.l1).getContext(), ajS3S1200000_26.s0).open();
                Map map = (Map) ajS3S1200000_26.l2;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("entrance_name", "order_center_shoptab_diversion_guide"));
                mapLJIIJ.putAll(map);
                C1018703yb.LIZIZ("tiktokec_entrance_click", mapLJIIJ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(g1c.AjS3S1200000_26 r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS3S1200000_26.LIZ$2(g1c.AjS3S1200000_26, android.view.View):void");
    }

    public static final void LIZ$3(AjS3S1200000_26 ajS3S1200000_26, View view) {
        EnumC1407150min enumC1407150min;
        GalleryViewerViewModel galleryViewerViewModel;
        View rootView;
        if (view != null && (enumC1407150min = ((C1761290vvz) ajS3S1200000_26.l1).LJJI) != null) {
            int i = C1407130mil.LIZ[enumC1407150min.ordinal()];
            if (i != 1 && i != 2) {
                return;
            }
            GalleryViewerViewModel galleryViewerViewModel2 = ((C1761440vwE) ajS3S1200000_26.l2).LLILLJJLI;
            if (galleryViewerViewModel2 != null) {
                String strValueOf = String.valueOf(((C1761290vvz) ajS3S1200000_26.l1).LIZ);
                C1761440vwE c1761440vwE = (C1761440vwE) ajS3S1200000_26.l2;
                View view2 = c1761440vwE.LLJI;
                if (view2 != null) {
                    rootView = view2.getRootView();
                } else {
                    rootView = null;
                }
                galleryViewerViewModel2.DQ2(strValueOf, c1761440vwE, rootView);
            }
            C1761440vwE c1761440vwE2 = (C1761440vwE) ajS3S1200000_26.l2;
            View view3 = c1761440vwE2.LLJI;
            if (view3 == null || (galleryViewerViewModel = c1761440vwE2.LLILLJJLI) == null || galleryViewerViewModel.LLILLL == null) {
                return;
            }
            C1748720vbi.LIZLLL(view3, new C049Y(), new AwS76S1000000_26(ajS3S1200000_26.s0, 47));
        }
    }

    public static final void LIZ$4(AjS3S1200000_26 ajS3S1200000_26, View view) {
        EnumC1407150min enumC1407150min;
        GalleryViewerViewModel galleryViewerViewModel;
        View rootView;
        if (view != null && (enumC1407150min = ((C1761290vvz) ajS3S1200000_26.l1).LJJI) != null) {
            int i = C1407140mim.LIZ[enumC1407150min.ordinal()];
            if (i != 1 && i != 2) {
                return;
            }
            GalleryViewerViewModel galleryViewerViewModel2 = ((C1761430vwD) ajS3S1200000_26.l2).LLILLJJLI;
            if (galleryViewerViewModel2 != null) {
                String strValueOf = String.valueOf(((C1761290vvz) ajS3S1200000_26.l1).LIZ);
                C1761430vwD c1761430vwD = (C1761430vwD) ajS3S1200000_26.l2;
                View view2 = c1761430vwD.LLILZ;
                if (view2 != null) {
                    rootView = view2.getRootView();
                } else {
                    rootView = null;
                }
                galleryViewerViewModel2.DQ2(strValueOf, c1761430vwD, rootView);
            }
            C1761430vwD c1761430vwD2 = (C1761430vwD) ajS3S1200000_26.l2;
            View view3 = c1761430vwD2.LLILZ;
            if (view3 == null || (galleryViewerViewModel = c1761430vwD2.LLILLJJLI) == null || galleryViewerViewModel.LLILLL == null) {
                return;
            }
            C1748720vbi.LIZLLL(view3, new C049Y(), new AwS76S1000000_26(ajS3S1200000_26.s0, 47));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS3S1200000_26(Object obj, String str, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
