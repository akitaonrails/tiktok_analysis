package kotlin.jvm.internal;

import X.AbstractC1542200qEc;
import X.C09AY;
import X.C1101780emG;
import X.C1101790emH;
import X.C1119060fE8;
import X.C1119410fEh;
import X.C1140170fmB;
import X.C1151910g57;
import X.C1846800y9u;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C766270U4b;
import X.InterfaceC1136020ffU;
import X.InterfaceC1846850y9z;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.lynx.tasm.LynxViewClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS101S1200000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS101S1200000_17 awS101S1200000_17, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Widget.requestExpandShortTouch onFrequencyControlled -> fail, id=");
        sbLIZ.append(((C1101780emG) awS101S1200000_17.l1).LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(iIntValue);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) awS101S1200000_17.l2;
        C1101780emG c1101780emG = (C1101780emG) awS101S1200000_17.l1;
        function1.invoke(new C1101790emH(c1101780emG.LIZ, c1101780emG.LIZLLL, c1101780emG.LIZJ, awS101S1200000_17.s0, Boolean.FALSE, null, String.valueOf(iIntValue), ((C1101780emG) awS101S1200000_17.l1).LIZIZ, 32));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS101S1200000_17 awS101S1200000_17, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"initial_data\":");
        sbLIZ.append(awS101S1200000_17.s0);
        sbLIZ.append('}');
        sparkContext.initData = C2188811AlT.LIZIZ(sbLIZ);
        AbstractC1542200qEc abstractC1542200qEc = (AbstractC1542200qEc) awS101S1200000_17.l1;
        if (abstractC1542200qEc != null) {
            sparkContext.LJJJJZI(abstractC1542200qEc);
        }
        sparkContext.LJJJJZ(new C1151910g57((LynxViewClient) awS101S1200000_17.l2, 2));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0ffU] */
    public static final Object invoke$2(AwS101S1200000_17 awS101S1200000_17, Object obj) {
        boolean z;
        ?? r5 = (InterfaceC1136020ffU) obj;
        boolean z2 = true;
        if (Intrinsics.LJFF(r5.LJJI().LIZIZ, awS101S1200000_17.s0)) {
            ((C259800zU) awS101S1200000_17.l1).element = r5;
            z = false;
        } else {
            z = true;
            z2 = false;
        }
        C1140170fmB c1140170fmB = (C1140170fmB) awS101S1200000_17.l2;
        c1140170fmB.LIZ(z2, z, false);
        return c1140170fmB;
    }

    public static final Object invoke$3(AwS101S1200000_17 awS101S1200000_17, Object obj) {
        if (((InterfaceC1846850y9z) awS101S1200000_17.l1).LIZIZ(false)) {
            C1119410fEh.LJ((DataChannel) awS101S1200000_17.l2, RankTypeV2.LJIJJLI, awS101S1200000_17.s0, new C1119060fE8());
        } else if (C1846800y9u.LJIILIIL((DataChannel) awS101S1200000_17.l2)) {
            C766270U4b.LIZLLL(2131853012);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S1200000_17(InterfaceC1846850y9z interfaceC1846850y9z, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1846850y9z;
        this.l2 = dataChannel;
        this.s0 = "jsb";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S1200000_17(C1101780emG c1101780emG, C1101780emG c1101780emG2, Function1<? super C1101790emH, Unit> function1, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1101780emG;
        this.l2 = c1101780emG2;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S1200000_17(AbstractC1542200qEc abstractC1542200qEc, LynxViewClient lynxViewClient, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = abstractC1542200qEc;
        this.l2 = lynxViewClient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S1200000_17(String str, String str2, C259800zU<InterfaceC1136020ffU> c259800zU, C1140170fmB c1140170fmB) {
        super(1);
        this.$t = c1140170fmB;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c259800zU;
    }
}
