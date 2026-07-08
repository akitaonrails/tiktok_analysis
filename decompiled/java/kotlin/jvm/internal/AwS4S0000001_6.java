package kotlin.jvm.internal;

import X.C09AY;
import X.C0IDA;
import X.C432800Gy6;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS4S0000001_6 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0000001_6(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        ImageView imageView = new ImageView((Context) obj);
        float f = awS4S0000001_6.f0;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C0IDA(f, 0));
        return imageView;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        View view = (View) obj;
        float f = 1;
        C786410Ut5.Ob(view, (awS4S0000001_6.f0 * 0.2f) + f);
        C786410Ut5.pc(view, f + (awS4S0000001_6.f0 * 0.2f));
        C786410Ut5.Ab(view, awS4S0000001_6.f0 * (-10.0f));
        C786410Ut5.Jc(view, (-2) * awS4S0000001_6.f0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        View view = (View) obj;
        float f = 1;
        C786410Ut5.Ob(view, (awS4S0000001_6.f0 * 0.2f) + f);
        C786410Ut5.pc(view, f + (awS4S0000001_6.f0 * 0.2f));
        C786410Ut5.Ab(view, awS4S0000001_6.f0 * (-10.0f));
        C786410Ut5.Jc(view, (-2) * awS4S0000001_6.f0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        C786410Ut5.T4((View) obj, 1.0f - awS4S0000001_6.f0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        C786410Ut5.T4((View) obj, awS4S0000001_6.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        return C432800Gy6.LIZ((C432800Gy6) obj, null, false, awS4S0000001_6.f0, null, 0.0f, null, null, 247);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS4S0000001_6 awS4S0000001_6, Object obj) {
        C786410Ut5.ed((View) obj, awS4S0000001_6.f0);
        return Unit.LIZ;
    }
}
