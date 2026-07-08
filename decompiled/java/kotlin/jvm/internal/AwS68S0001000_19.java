package kotlin.jvm.internal;

import X.C09AY;
import X.C0MBB;
import X.C1244960iVC;
import X.C1666390tSv;
import X.C1666680tTO;
import X.C1673210tdv;
import X.C1682520tsw;
import X.C1A46;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.compose.foundation.layout.c;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS68S0001000_19 extends C09AY implements Function2 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1027i0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0001000_19(int i, int i2) {
        super(2);
        this.$t = i2;
        this.f1027i0 = i;
    }

    public static final Object invoke$0(AwS68S0001000_19 awS68S0001000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            float f = 32;
            C1673210tdv.LIZ(c.LJI(C1682520tsw.LJIIL(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), f, 16, f, 0.0f, 8), 20), C0MBB.LIZIZ(awS68S0001000_19.f1027i0, interfaceC1680500tpg), 0, null, false, false, null, false, C1A46.LIZ(R.drawable.bxi, interfaceC1680500tpg, 0), false, null, false, false, null, null, null, null, null, null, null, null, null, null, false, null, interfaceC1680500tpg, 0, 0, 0, 33554172);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS68S0001000_19 awS68S0001000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666680tTO.LIZJ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS68S0001000_19.f1027i0 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS68S0001000_19 awS68S0001000_19, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        int i = rect.left;
        int i2 = awS68S0001000_19.f1027i0;
        rect.left = i - i2;
        rect.top -= i2;
        rect.right += i2;
        rect.bottom += i2;
        return new TouchDelegate(rect, (View) obj2);
    }

    public static final Object invoke$3(AwS68S0001000_19 awS68S0001000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244960iVC.LIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS68S0001000_19.f1027i0 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS68S0001000_19 awS68S0001000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666390tSv.LIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS68S0001000_19.f1027i0 | 1));
        return Unit.LIZ;
    }
}
