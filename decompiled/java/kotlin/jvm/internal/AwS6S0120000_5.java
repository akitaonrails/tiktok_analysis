package kotlin.jvm.internal;

import X.C09AY;
import X.C0FHM;
import X.C349430Dmv;
import X.C358790E4v;
import X.C359480E7m;
import X.C372140EiS;
import X.C373910ElJ;
import X.C385430F9h;
import X.C385490F9n;
import X.EnumC373860ElE;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS6S0120000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0120000_5 awS6S0120000_5, Object obj) {
        return C373910ElJ.LIZ((C373910ElJ) obj, null, (EnumC373860ElE) awS6S0120000_5.l0, awS6S0120000_5.z1, null, awS6S0120000_5.z2, 105);
    }

    public static final Object invoke$1(AwS6S0120000_5 awS6S0120000_5, Object obj) {
        C0FHM c0fhm;
        C385430F9h c385430F9h = (C385430F9h) obj;
        List list = (List) awS6S0120000_5.l0;
        C0FHM c0fhm2 = C0FHM.GONE;
        if (!awS6S0120000_5.z1 && !awS6S0120000_5.z2) {
            c0fhm = C0FHM.VISIBLE;
        } else {
            c0fhm = c0fhm2;
        }
        return C385430F9h.LIZ(c385430F9h, null, null, list, null, c0fhm2, c0fhm, null, null, null, null, null, 0L, 4043);
    }

    public static final Object invoke$2(AwS6S0120000_5 awS6S0120000_5, Object obj) {
        return C372140EiS.LIZ((C372140EiS) obj, null, 0, false, new C349430Dmv((NLEModel) awS6S0120000_5.l0, awS6S0120000_5.z1), null, null, null, null, null, null, null, Boolean.valueOf(awS6S0120000_5.z2), 4087);
    }

    public static final Object invoke$3(AwS6S0120000_5 awS6S0120000_5, Object obj) {
        C359480E7m c359480E7m = (C359480E7m) obj;
        boolean z = true;
        boolean z2 = !awS6S0120000_5.z1;
        if (awS6S0120000_5.z2 || ((C358790E4v) awS6S0120000_5.l0).LJIIJ.invoke().booleanValue()) {
            z = false;
        }
        return C359480E7m.LIZ(c359480E7m, false, false, false, false, false, false, false, z2, z, false, false, false, false, false, null, false, false, false, false, false, false, 4193535);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0120000_5(EnumC373860ElE enumC373860ElE, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC373860ElE;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0120000_5(NLEModel nLEModel, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = nLEModel;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S0120000_5(List list, List<C385490F9n> list2, boolean z, boolean z2) {
        super(1);
        this.$t = z2 ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0120000_5(boolean z, boolean z2, C358790E4v c358790E4v, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = c358790E4v;
    }
}
