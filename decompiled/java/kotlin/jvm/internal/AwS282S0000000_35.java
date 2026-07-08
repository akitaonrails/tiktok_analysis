package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC2277271EBp;
import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS282S0000000_35 extends C09AY implements Function1 {
    public final int $t;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS282S0000000_35 awS282S0000000_35, Object obj) {
        ((InterfaceC2277271EBp) obj).LJJIJIL();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS282S0000000_35 awS282S0000000_35, Object obj) {
        ((InterfaceC2277271EBp) obj).LJJIJLIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS282S0000000_35 awS282S0000000_35, Object obj) {
        ((InterfaceC2277271EBp) obj).LJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS282S0000000_35 awS282S0000000_35, Object obj) {
        ((InterfaceC2277271EBp) obj).LJJIIJZLJL();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS282S0000000_35 awS282S0000000_35, Object obj) {
        ((InterfaceC2277271EBp) obj).LJJJ();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS282S0000000_35 awS282S0000000_35, Object obj) {
        ((InterfaceC2277271EBp) obj).LJJIJIIJIL();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0000000_35(String str, SurfaceView surfaceView, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0000000_35(String str, String str2, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS282S0000000_35(int i, int i2, SurfaceView surfaceView, String str, int i3) {
        super(1);
        this.$t = i3;
    }
}
