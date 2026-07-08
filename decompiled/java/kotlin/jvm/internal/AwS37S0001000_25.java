package kotlin.jvm.internal;

import X.C09AY;
import X.C0LCS;
import X.C1657020tDo;
import X.C1663960tP0;
import X.C1672500tcm;
import X.C1687320u0g;
import X.C1690930u6V;
import X.C375830EoP;
import X.InterfaceC1679550to9;
import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS37S0001000_25 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f993i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0001000_25(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f993i0 = i;
    }

    public static final Object invoke$0(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
        return changeDuetLayoutState.copy(changeDuetLayoutState.effect, new C0LCS<>(Integer.valueOf(awS37S0001000_25.f993i0)), changeDuetLayoutState.exitDuetMode);
    }

    public static final Object invoke$1(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        return C1657020tDo.LIZ((C1657020tDo) obj, null, 0, 0, null, null, false, null, null, null, null, null, new C375830EoP(Integer.valueOf(awS37S0001000_25.f993i0)), null, null, 14335);
    }

    public static final Object invoke$2(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        return C1663960tP0.LIZ((C1663960tP0) obj, null, false, false, false, false, null, null, null, null, null, awS37S0001000_25.f993i0, 6143);
    }

    public static final Object invoke$3(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        return C1663960tP0.LIZ((C1663960tP0) obj, null, false, false, false, false, null, null, null, null, null, awS37S0001000_25.f993i0, 6143);
    }

    public static final Object invoke$4(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        FrameLayout frameLayout = new FrameLayout((Context) obj);
        frameLayout.setId(awS37S0001000_25.f993i0);
        return frameLayout;
    }

    public static final Object invoke$5(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        C1687320u0g c1687320u0g = (C1687320u0g) obj;
        int i = c1687320u0g.LLILZIL;
        int i2 = awS37S0001000_25.f993i0;
        if (i != i2) {
            return C1687320u0g.LIZ(c1687320u0g, null, null, false, null, i2, null, 47);
        }
        return c1687320u0g;
    }

    public static final Object invoke$6(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJIILIIL(true);
        interfaceC1679550to9.LJLJL(new C1672500tcm(new AwS70S0001000_25(awS37S0001000_25.f993i0, 0)));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJIILIIL(true);
        interfaceC1679550to9.LJLJL(new C1672500tcm(new AwS70S0001000_25(awS37S0001000_25.f993i0, 1)));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS37S0001000_25 awS37S0001000_25, Object obj) {
        return Integer.valueOf(((C1690930u6V) obj).LIZ - awS37S0001000_25.f993i0);
    }
}
