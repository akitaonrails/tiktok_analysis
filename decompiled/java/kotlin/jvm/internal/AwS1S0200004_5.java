package kotlin.jvm.internal;

import X.C09AY;
import X.C786410Ut5;
import android.graphics.PointF;
import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS1S0200004_5 extends C09AY implements Function0 {
    public final int $t;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS1S0200004_5 awS1S0200004_5) {
        if (Math.abs(awS1S0200004_5.f2) <= Float.MAX_VALUE && Math.abs(awS1S0200004_5.f3) <= Float.MAX_VALUE) {
            ((SurfaceView) awS1S0200004_5.l0).setPivotX(((PointF) awS1S0200004_5.l1).x);
            ((SurfaceView) awS1S0200004_5.l0).setPivotY(((PointF) awS1S0200004_5.l1).y);
            C786410Ut5.Nb((SurfaceView) awS1S0200004_5.l0, awS1S0200004_5.f2);
            C786410Ut5.oc((SurfaceView) awS1S0200004_5.l0, awS1S0200004_5.f3);
            C786410Ut5.dd((SurfaceView) awS1S0200004_5.l0, -awS1S0200004_5.f4);
            C786410Ut5.Ic((SurfaceView) awS1S0200004_5.l0, -awS1S0200004_5.f5);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS1S0200004_5 awS1S0200004_5) {
        if (Math.abs(awS1S0200004_5.f2) <= Float.MAX_VALUE && Math.abs(awS1S0200004_5.f3) <= Float.MAX_VALUE) {
            ((SurfaceView) awS1S0200004_5.l0).setPivotX(((PointF) awS1S0200004_5.l1).x);
            ((SurfaceView) awS1S0200004_5.l0).setPivotY(((PointF) awS1S0200004_5.l1).y);
            C786410Ut5.Nb((SurfaceView) awS1S0200004_5.l0, awS1S0200004_5.f2);
            C786410Ut5.oc((SurfaceView) awS1S0200004_5.l0, awS1S0200004_5.f3);
            C786410Ut5.dd((SurfaceView) awS1S0200004_5.l0, -awS1S0200004_5.f4);
            C786410Ut5.Ic((SurfaceView) awS1S0200004_5.l0, -awS1S0200004_5.f5);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0200004_5(SurfaceView surfaceView, PointF pointF, float f, int i) {
        super(0);
        this.$t = i;
        this.f2 = 1.0f;
        this.f3 = 1.0f;
        this.l0 = surfaceView;
        this.l1 = pointF;
        this.f4 = f;
        this.f5 = 0.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0200004_5(float f, float f2, SurfaceView surfaceView, PointF pointF, float f3, float f4, int i) {
        super(0);
        this.$t = i;
        this.f2 = f;
        this.f3 = f2;
        this.l0 = surfaceView;
        this.l1 = pointF;
        this.f4 = f3;
        this.f5 = f4;
    }
}
