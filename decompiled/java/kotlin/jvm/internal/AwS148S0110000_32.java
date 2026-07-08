package kotlin.jvm.internal;

import X.AbstractC21154217qO;
import X.AbstractC21154817qU;
import X.C09AY;
import X.C18VZ;
import X.C18W7;
import X.C196Y;
import X.C2097608Jq;
import X.C21285518Rp;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC21155017qW;
import X.ViewTreeObserverOnScrollChangedListenerC21156017qg;
import android.widget.ProgressBar;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS148S0110000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS148S0110000_32 awS148S0110000_32) {
        AbstractC21154217qO abstractC21154217qO = (AbstractC21154217qO) awS148S0110000_32.l0;
        Pair[] pairArr = new Pair[2];
        boolean z = false;
        pairArr[0] = new Pair("is_pending", Boolean.valueOf(awS148S0110000_32.z1));
        INativePrefetchPopupService iNativePrefetchPopupService = (INativePrefetchPopupService) PluggableExtentionKt.pluggableSpi$default(INativePrefetchPopupService.class, false, false, false, 14, null);
        if (iNativePrefetchPopupService != null && iNativePrefetchPopupService.LIZLLL()) {
            z = true;
        }
        pairArr[1] = new Pair("is_template_prefetch", Boolean.valueOf(z));
        abstractC21154217qO.LJIILIIL(null, "show", null, C2097608Jq.LJIIJ(pairArr), true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS148S0110000_32 awS148S0110000_32) {
        ((C21285518Rp) awS148S0110000_32.l0).LJ(awS148S0110000_32.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS148S0110000_32 awS148S0110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageVisibleChanged[");
        sbLIZ.append(((ViewTreeObserverOnScrollChangedListenerC21156017qg) awS148S0110000_32.l0).LLJIJIL);
        sbLIZ.append("]: (isVisible: ");
        sbLIZ.append(awS148S0110000_32.z1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS148S0110000_32 awS148S0110000_32) {
        C196Y c196y = (C196Y) awS148S0110000_32.l0;
        boolean z = awS148S0110000_32.z1;
        c196y.f3(z, !z);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS148S0110000_32 awS148S0110000_32) {
        int i;
        TuxTextView tuxTextViewS3 = ((C196Y) awS148S0110000_32.l0).S3();
        int i2 = 0;
        if (awS148S0110000_32.z1) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextViewS3);
        ProgressBar progressBarLLJJLIIIJLLLLLLLZ = ((C196Y) awS148S0110000_32.l0).LLJJLIIIJLLLLLLLZ();
        if (!awS148S0110000_32.z1) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, progressBarLLJJLIIIJLLLLLLLZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS148S0110000_32 awS148S0110000_32) {
        if (awS148S0110000_32.z1) {
            C18W7 c18w7 = ((C18VZ) awS148S0110000_32.l0).LLJLIL;
            if (c18w7 != null) {
                C18W7.LIZIZ(c18w7, null, 3);
            }
        } else {
            C18W7 c18w72 = ((C18VZ) awS148S0110000_32.l0).LLJLIL;
            if (c18w72 != null) {
                C18W7.LIZ(c18w72);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS148S0110000_32 awS148S0110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pool dismissOrReleaseBubble[");
        sbLIZ.append(((InterfaceC21155017qW) awS148S0110000_32.l0).getBubbleId());
        sbLIZ.append("]: (notRelease: ");
        sbLIZ.append(awS148S0110000_32.z1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS148S0110000_32 awS148S0110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pool setBubbleVisibility[");
        sbLIZ.append(((InterfaceC21155017qW) awS148S0110000_32.l0).getBubbleId());
        sbLIZ.append("]: (isVisible: ");
        sbLIZ.append(awS148S0110000_32.z1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS148S0110000_32 awS148S0110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble dismissOrRelease[");
        sbLIZ.append(((AbstractC21154817qU) awS148S0110000_32.l0).LLJIJIL);
        sbLIZ.append("]: (notRelease: ");
        sbLIZ.append(awS148S0110000_32.z1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS148S0110000_32 awS148S0110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble setVisibility[");
        sbLIZ.append(((AbstractC21154817qU) awS148S0110000_32.l0).LLJIJIL);
        sbLIZ.append("]: (isVisible: ");
        sbLIZ.append(awS148S0110000_32.z1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS148S0110000_32 awS148S0110000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageRenderCompleted[");
        sbLIZ.append(((ViewTreeObserverOnScrollChangedListenerC21156017qg) awS148S0110000_32.l0).LLJIJIL);
        sbLIZ.append("]: (isRefresh: ");
        sbLIZ.append(awS148S0110000_32.z1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(AbstractC21154217qO abstractC21154217qO, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC21154217qO;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(AbstractC21154817qU abstractC21154817qU, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC21154817qU;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(InterfaceC21155017qW interfaceC21155017qW, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC21155017qW;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(ViewTreeObserverOnScrollChangedListenerC21156017qg viewTreeObserverOnScrollChangedListenerC21156017qg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewTreeObserverOnScrollChangedListenerC21156017qg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(C21285518Rp c21285518Rp, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21285518Rp;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(C18VZ c18vz, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c18vz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0110000_32(C196Y c196y, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c196y;
        this.z1 = z;
    }
}
