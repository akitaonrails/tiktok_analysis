package kotlin.jvm.internal;

import X.AbstractC1463010oAt;
import X.C09AY;
import X.C0C64;
import X.C0CHQ;
import X.C0EYU;
import X.C0M81;
import X.C1390380mHk;
import X.C1414130mu3;
import X.C1414450muZ;
import X.C1414930mvL;
import X.C1428520nHG;
import X.C1433290nOx;
import X.C1434730nRH;
import X.C1446540nkK;
import X.C1446590nkP;
import X.C1459800o5i;
import X.C1459880o5q;
import X.C1459900o5s;
import X.C1459960o5y;
import X.C1459970o5z;
import X.C1460230o6P;
import X.C1460250o6R;
import X.C1463020oAu;
import X.C1463170oB9;
import X.C1664590tQ1;
import X.C19EG;
import X.C201955140j;
import X.C2188811AlT;
import X.C288480BSk;
import X.C354270Duj;
import X.InterfaceC1417640mzi;
import X.InterfaceC1452170ntP;
import X.InterfaceC1460000o62;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS139S0110000_22 extends C09AY implements Function0 {
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
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS139S0110000_22 awS139S0110000_22) {
        ((InterfaceC1417640mzi) awS139S0110000_22.l0).LIZIZ(awS139S0110000_22.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS139S0110000_22 awS139S0110000_22) {
        ((Function1) awS139S0110000_22.l0).invoke(Boolean.valueOf(awS139S0110000_22.z1));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS139S0110000_22 awS139S0110000_22) {
        C1434730nRH c1434730nRH = (C1434730nRH) awS139S0110000_22.l0;
        return C1433290nOx.LIZ(c1434730nRH.LJIIIZ.LIZ, awS139S0110000_22.z1, false, new AwS566S0100000_22(c1434730nRH, 965));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS139S0110000_22 r23) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS139S0110000_22.invoke$11(kotlin.jvm.internal.AwS139S0110000_22):java.lang.Object");
    }

    public static final Object invoke$2(AwS139S0110000_22 awS139S0110000_22) {
        boolean z;
        C1463170oB9 c1463170oB9 = AbstractC1463010oAt.LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSceneTime,isPanelShowing:");
        sbLIZ.append(((C1463020oAu) awS139S0110000_22.l0).LLJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        C1463020oAu c1463020oAu = (C1463020oAu) awS139S0110000_22.l0;
        if (awS139S0110000_22.z1 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_sound_sync_not_replay", true, false)) {
            z = false;
        } else {
            z = true;
        }
        C1463020oAu.Z7(c1463020oAu, false, z);
        ((C1463020oAu) awS139S0110000_22.l0).L7();
        if (!((C1463020oAu) awS139S0110000_22.l0).LLJI) {
            ((C1463020oAu) awS139S0110000_22.l0).H2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS139S0110000_22 awS139S0110000_22) {
        PublishProgressDialogAddHelper publishProgressDialogAddHelper = PublishProgressDialogAddHelper.LIZ;
        C19EG c19eg = (C19EG) awS139S0110000_22.l0;
        boolean z = awS139S0110000_22.z1;
        AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(166);
        publishProgressDialogAddHelper.getClass();
        PublishProgressDialogAddHelper.LJIIIIZZ(c19eg, aFwS210S0000000_22, z, false, false);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS139S0110000_22 awS139S0110000_22) {
        ((C1446540nkK) awS139S0110000_22.l0).o2().Tx(true);
        if (awS139S0110000_22.z1) {
            Activity activityLJII = C1664590tQ1.LJII((C1446540nkK) awS139S0110000_22.l0);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131838193);
            C1390380mHk.LIZ(activityLJII, 3043, creativeToastBuilder);
        }
        if (((C1446540nkK) awS139S0110000_22.l0).w2().getOrigin() != 1) {
            C1446590nkP.LIZ.storeBoolean("audio_music_sound", true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS139S0110000_22 awS139S0110000_22) {
        ((C0M81) awS139S0110000_22.l0).LJFF(2131846555, false);
        if (awS139S0110000_22.z1) {
            C0M81 c0m81 = (C0M81) awS139S0110000_22.l0;
            c0m81.LJI(false, true, true, "clickPopupFromEdit", new AwS566S0100000_22(c0m81, 521), new AwS566S0100000_22((C0M81) awS139S0110000_22.l0, 522));
        } else {
            ((C0M81) awS139S0110000_22.l0).LJ();
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$6(AwS139S0110000_22 awS139S0110000_22) {
        if (!awS139S0110000_22.z1) {
            C1460250o6R c1460250o6R = (C1460250o6R) awS139S0110000_22.l0;
            c1460250o6R.LLILLJJLI.hide(c1460250o6R.LLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS139S0110000_22 awS139S0110000_22) {
        C0CHQ.LIZ().LJI().LIZJ().LJFF(((C1460230o6P) awS139S0110000_22.l0).getEditModel(), "postInEditPage");
        if (awS139S0110000_22.z1) {
            C1460230o6P c1460230o6P = (C1460230o6P) awS139S0110000_22.l0;
            c1460230o6P.getClass();
            c1460230o6P.LLLLLILLIL(new AwS566S0100000_22(c1460230o6P, 582), false, true);
        } else {
            View view = ((C1460230o6P) awS139S0110000_22.l0).LLJILJIL;
            if (view == null) {
                view = null;
            }
            view.performClick();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS139S0110000_22 awS139S0110000_22) {
        boolean z;
        boolean z2;
        C1459970o5z.LLJLLL.getClass();
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        C201955140j.LIZLLL(c1459900o5s, "EditTitleBarScene", "NLE Editor OnChange");
        if (C288480BSk.LIZ && !C1459800o5i.LIZ(((C1459970o5z) awS139S0110000_22.l0).LLLLJ())) {
            ((C1459970o5z) awS139S0110000_22.l0).LLLLILI().Ux(2, awS139S0110000_22.z1);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_autocut_tool_bar_checkmark", true, false)) {
            C1414930mvL c1414930mvL = C1414930mvL.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLJ = ((C1459970o5z) awS139S0110000_22.l0).LLLLJ();
            c1414930mvL.getClass();
            if (!C1414930mvL.LJIIJ(videoPublishEditModelLLLLJ) && !C1459800o5i.LIZ(((C1459970o5z) awS139S0110000_22.l0).LLLLJ())) {
                ((C1459970o5z) awS139S0110000_22.l0).LLLLILI().Ux(21, ((C1459970o5z) awS139S0110000_22.l0).LLLLJ().isCurrentAutoCutMode());
            }
        }
        ((C1459970o5z) awS139S0110000_22.l0).LLLLJ();
        if (C1428520nHG.LJJLIIIJLLLLLLLZ()) {
            C1459970o5z c1459970o5z = (C1459970o5z) awS139S0110000_22.l0;
            c1459970o5z.LLLLLLIL(C1414450muZ.LIZ(c1459970o5z.LLLLJ()));
        }
        InterfaceC1460000o62 interfaceC1460000o62LLLLILI = ((C1459970o5z) awS139S0110000_22.l0).LLLLILI();
        if (!awS139S0110000_22.z1 && !((C1459970o5z) awS139S0110000_22.l0).LLLLJ().isCurrentAutoCutMode()) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1460000o62LLLLILI.ut0(26, z);
        C1414930mvL c1414930mvL2 = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLJ2 = ((C1459970o5z) awS139S0110000_22.l0).LLLLJ();
        c1414930mvL2.getClass();
        if (C1414930mvL.LJIIJ(videoPublishEditModelLLLLJ2)) {
            C1459970o5z c1459970o5z2 = (C1459970o5z) awS139S0110000_22.l0;
            c1459970o5z2.getClass();
            if (!C1459800o5i.LIZ(c1459970o5z2.LLLLJ())) {
                InterfaceC1452170ntP value = c1459970o5z2.LLLLIL().g().getValue();
                boolean zLJIILJJIL = C1414450muZ.LJIILJJIL(value, c1459970o5z2.LLLLJ());
                boolean zLIZIZ = C0EYU.LIZIZ(c1459970o5z2.LLLLJ(), null, value);
                if (zLJIILJJIL && C1414450muZ.LIZ(c1459970o5z2.LLLLJ())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewEditToolbarScene -> run in main thread: ");
                sbLIZ.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
                sbLIZ.append("；useTemplate = ");
                sbLIZ.append(zLJIILJJIL);
                C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
                C354270Duj.LIZJ(0L, new C1459880o5q(zLJIILJJIL, c1459970o5z2, value, z2, zLIZIZ));
            }
        }
        ((C1459970o5z) awS139S0110000_22.l0).LLLLLZ();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS139S0110000_22 awS139S0110000_22) {
        if (C288480BSk.LIZ && !C1459800o5i.LIZ(((C1459960o5y) awS139S0110000_22.l0).LLLLILI())) {
            ((C1459960o5y) awS139S0110000_22.l0).LLLLIL().Ux(2, awS139S0110000_22.z1);
        }
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_autocut_tool_bar_checkmark", true, false)) {
            C1414930mvL c1414930mvL = C1414930mvL.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLILI = ((C1459960o5y) awS139S0110000_22.l0).LLLLILI();
            c1414930mvL.getClass();
            if (!C1414930mvL.LJIIJ(videoPublishEditModelLLLLILI)) {
                ((C1459960o5y) awS139S0110000_22.l0).LLLLIL().Ux(21, ((C1459960o5y) awS139S0110000_22.l0).LLLLILI().isCurrentAutoCutMode());
            }
        }
        InterfaceC1460000o62 interfaceC1460000o62LLLLIL = ((C1459960o5y) awS139S0110000_22.l0).LLLLIL();
        if (awS139S0110000_22.z1 || ((C1459960o5y) awS139S0110000_22.l0).LLLLILI().isCurrentAutoCutMode()) {
            z = false;
        }
        interfaceC1460000o62LLLLIL.ut0(26, z);
        C1414930mvL c1414930mvL2 = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLILI2 = ((C1459960o5y) awS139S0110000_22.l0).LLLLILI();
        c1414930mvL2.getClass();
        if (C1414930mvL.LJIIJ(videoPublishEditModelLLLLILI2)) {
            C1459960o5y c1459960o5y = (C1459960o5y) awS139S0110000_22.l0;
            c1459960o5y.getClass();
            if (!C1459800o5i.LIZ(c1459960o5y.LLLLILI())) {
                InterfaceC1452170ntP value = c1459960o5y.LLLLIILL().g().getValue();
                boolean zLJIILJJIL = C1414450muZ.LJIILJJIL(value, c1459960o5y.LLLLILI());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewEditToolbarScene -> run in main thread: ");
                sbLIZ.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
                sbLIZ.append("；useTemplate = ");
                sbLIZ.append(zLJIILJJIL);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C354270Duj.LIZJ(0L, new AwS101S0210000_22(c1459960o5y, zLJIILJJIL, value, 6));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C0M81 c0m81, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0m81;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1414130mu3 c1414130mu3, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1414130mu3;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(InterfaceC1417640mzi interfaceC1417640mzi, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1417640mzi;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1434730nRH c1434730nRH, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1434730nRH;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1446540nkK c1446540nkK, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1446540nkK;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1459960o5y c1459960o5y, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1459960o5y;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1459970o5z c1459970o5z, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1459970o5z;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1460230o6P c1460230o6P, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1460230o6P;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C1463020oAu c1463020oAu, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1463020oAu;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(C19EG c19eg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S0110000_22(Function1 function1, Function1<? super Boolean, Unit> function12, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0110000_22(boolean z, C1460250o6R c1460250o6R, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1460250o6R;
    }
}
