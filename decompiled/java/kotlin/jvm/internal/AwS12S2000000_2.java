package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS12S2000000_2 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS12S2000000_2 awS12S2000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateDataActionTypeHandler handleAction, path: ");
        sbLIZ.append(awS12S2000000_2.s0);
        sbLIZ.append(", value : ");
        sbLIZ.append(awS12S2000000_2.s1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S2000000_2 awS12S2000000_2, Object obj) {
        boolean z;
        Effect effect = (Effect) obj;
        if (!Intrinsics.LJFF(effect.getResourceId(), awS12S2000000_2.s0) && !Intrinsics.LJFF(effect.getEffectId(), awS12S2000000_2.s1)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS12S2000000_2 awS12S2000000_2, Object obj) {
        boolean z;
        Effect effect = (Effect) obj;
        if (!Intrinsics.LJFF(effect.getResourceId(), awS12S2000000_2.s0) && !Intrinsics.LJFF(effect.getEffectId(), awS12S2000000_2.s1)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS12S2000000_2 awS12S2000000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData: ");
        sbLIZ.append(awS12S2000000_2.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS12S2000000_2.s1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S2000000_2(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S2000000_2(String str, String str2, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
