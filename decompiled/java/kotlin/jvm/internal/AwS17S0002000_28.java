package kotlin.jvm.internal;

import X.C09AY;
import X.C104L;
import X.C191819102n;
import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS17S0002000_28 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f961i0;
    public int i1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0002000_28(int i) {
        super(1);
        this.$t = i;
        this.f961i0 = 2131829277;
        this.i1 = 2131829276;
    }

    public static final Object invoke$0(AwS17S0002000_28 awS17S0002000_28, Object obj) {
        int i;
        Context context = (Context) obj;
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZLLL()) {
            i = awS17S0002000_28.f961i0;
        } else {
            i = awS17S0002000_28.i1;
        }
        return context.getString(i);
    }

    public static final Object invoke$1(AwS17S0002000_28 awS17S0002000_28, Object obj) {
        int i;
        Context context = (Context) obj;
        if (C104L.LIZJ()) {
            i = awS17S0002000_28.f961i0;
        } else {
            i = awS17S0002000_28.i1;
        }
        return context.getString(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0002000_28(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f961i0 = i;
        this.i1 = i2;
    }
}
