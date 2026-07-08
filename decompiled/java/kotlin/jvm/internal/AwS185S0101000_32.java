package kotlin.jvm.internal;

import X.C09AY;
import X.C1254970ilL;
import X.C19DJ;
import android.content.Intent;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public class AwS185S0101000_32 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS185S0101000_32(int i, Intent intent, int i2) {
        super(2);
        this.$t = i2;
        this.i1 = i;
        this.l0 = intent;
    }

    public static final Object invoke$0(AwS185S0101000_32 awS185S0101000_32, Object obj, Object obj2) {
        ((C1254970ilL) obj).LIZIZ.u1(awS185S0101000_32.i1, (Intent) awS185S0101000_32.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS185S0101000_32 awS185S0101000_32, Object obj, Object obj2) {
        boolean zBooleanValue;
        Boolean bool = (Boolean) obj2;
        C19DJ c19dj = ((C1254970ilL) obj).LIZIZ;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (c19dj.xM()) {
            if (c19dj.onKeyDown(awS185S0101000_32.i1, (KeyEvent) awS185S0101000_32.l0) || zBooleanValue) {
                z = true;
            }
            zBooleanValue = z;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS185S0101000_32(int i, KeyEvent keyEvent, int i2) {
        super(2);
        this.$t = i2;
        this.i1 = i;
        this.l0 = keyEvent;
    }
}
