package kotlin.jvm.internal;

import X.C09AY;
import X.C0L2T;
import X.C534030Kwz;
import X.C536210L1f;
import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS7S0100200_8 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S0100200_8 awS7S0100200_8) {
        return new C536210L1f((Activity) awS7S0100200_8.l0, awS7S0100200_8.j1, awS7S0100200_8.j2);
    }

    public static final Object invoke$1(AwS7S0100200_8 awS7S0100200_8) {
        return new C534030Kwz(((C0L2T) awS7S0100200_8.l0).LL, awS7S0100200_8.j1, awS7S0100200_8.j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0100200_8(C0L2T c0l2t, long j, long j2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0l2t;
        this.j1 = j;
        this.j2 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0100200_8(Activity activity, long j, long j2, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.j1 = j;
        this.j2 = j2;
    }
}
