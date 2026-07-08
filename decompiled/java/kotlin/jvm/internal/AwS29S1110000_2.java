package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1500305u5;
import X.C1500405u6;
import X.C19EG;
import X.C23250099c;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS29S1110000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS29S1110000_2 awS29S1110000_2, Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19eg = (C19EG) awS29S1110000_2.l1;
        if (c19eg != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1500305u5(awS29S1110000_2.s0, awS29S1110000_2.z2, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S1110000_2 awS29S1110000_2, Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19eg = (C19EG) awS29S1110000_2.l1;
        if (c19eg != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1500405u6(awS29S1110000_2.s0, awS29S1110000_2.z2, null), 2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1110000_2(C19EG c19eg, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19eg;
        this.s0 = str;
        this.z2 = z;
    }
}
