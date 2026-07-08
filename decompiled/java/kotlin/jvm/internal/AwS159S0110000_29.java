package kotlin.jvm.internal;

import X.C09AY;
import X.C12QW;
import X.C12QX;
import X.C19754712Qv;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS159S0110000_29 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
    public AwS159S0110000_29(C12QW c12qw, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = c12qw;
        this.z1 = z;
    }

    public static final Object invoke$0(AwS159S0110000_29 awS159S0110000_29, Object obj, Object obj2) {
        return Boolean.valueOf(C12QW.LLZIL((Effect) obj, (C19754712Qv) obj2, awS159S0110000_29.z1));
    }

    public static final Object invoke$1(AwS159S0110000_29 awS159S0110000_29, Object obj, Object obj2) {
        return Boolean.valueOf(C12QX.LLZL((Effect) obj, (C19754712Qv) obj2, awS159S0110000_29.z1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0110000_29(C12QX c12qx, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = c12qx;
        this.z1 = z;
    }
}
