package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS52S0310000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS52S0310000_9 awS52S0310000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success: ");
        sbLIZ.append(awS52S0310000_9.z3);
        sbLIZ.append(", error: ");
        sbLIZ.append((PTYError) awS52S0310000_9.l0);
        sbLIZ.append(" outputDataPTY: ");
        sbLIZ.append((PTYTaskData) awS52S0310000_9.l1);
        sbLIZ.append(" packageInfo: ");
        sbLIZ.append((PTYPackageInfo) awS52S0310000_9.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS52S0310000_9 awS52S0310000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success: ");
        sbLIZ.append(awS52S0310000_9.z3);
        sbLIZ.append(", error: ");
        sbLIZ.append((PTYError) awS52S0310000_9.l0);
        sbLIZ.append(" outputDataPTY: ");
        sbLIZ.append((PTYTaskData) awS52S0310000_9.l1);
        sbLIZ.append(" packageInfo: ");
        sbLIZ.append((PTYPackageInfo) awS52S0310000_9.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0310000_9(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = pTYError;
        this.l1 = pTYTaskData;
        this.l2 = pTYPackageInfo;
    }
}
