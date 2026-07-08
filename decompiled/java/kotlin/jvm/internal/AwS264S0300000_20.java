package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C1306510k6T;
import X.C1306580k6a;
import X.C1307280k7i;
import X.C1307560k8A;
import X.C1307660k8K;
import X.C1307840k8c;
import X.C20303114cP;
import X.C2188811AlT;
import X.C5185020h;
import X.EnumC1306820k6y;
import X.InterfaceC1307790k8X;
import android.content.Context;
import android.os.PowerManager;
import com.bytedance.android.starship.engine.event.Event;
import com.bytedance.pitaya.api.bean.PTYError;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AwS264S0300000_20 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS264S0300000_20 awS264S0300000_20) {
        ((C05P0) awS264S0300000_20.l0).setValue(Boolean.valueOf(C20303114cP.LJI((Context) awS264S0300000_20.l1, (PowerManager) awS264S0300000_20.l2)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS264S0300000_20 awS264S0300000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run TTM ");
        sbLIZ.append(((InterfaceC1307790k8X) awS264S0300000_20.l0).LIZJ(((C1307560k8A) awS264S0300000_20.l1).LIZ));
        sbLIZ.append(", success: ");
        sbLIZ.append(((C1307660k8K) awS264S0300000_20.l2).LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS264S0300000_20 awS264S0300000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run CEP ");
        sbLIZ.append(((InterfaceC1307790k8X) awS264S0300000_20.l0).LIZJ(((C1307840k8c) awS264S0300000_20.l1).LIZ));
        sbLIZ.append(", success: ");
        sbLIZ.append((Event) awS264S0300000_20.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS264S0300000_20 awS264S0300000_20) {
        C1306510k6T c1306510k6T = C1306510k6T.LIZ;
        EnumC1306820k6y enumC1306820k6y = (EnumC1306820k6y) awS264S0300000_20.l0;
        c1306510k6T.getClass();
        C1306510k6T.LIZJ(enumC1306820k6y);
        C1306580k6a.LJI((EnumC1306820k6y) awS264S0300000_20.l0, (Map) awS264S0300000_20.l1, new AwS634S0100000_20((Function1) awS264S0300000_20.l2, (Function1<? super String, Unit>) 7), new C5185020h((Function1) awS264S0300000_20.l2, (Function1<? super PTYError, Unit>) 55));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS264S0300000_20(EnumC1306820k6y enumC1306820k6y, Map map, AFwS245S0000000_12 aFwS245S0000000_12, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC1306820k6y;
        this.l1 = map;
        this.l2 = aFwS245S0000000_12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS264S0300000_20(C1307280k7i c1307280k7i, C1307560k8A c1307560k8A, C1307660k8K c1307660k8K, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1307280k7i;
        this.l1 = c1307560k8A;
        this.l2 = c1307660k8K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS264S0300000_20(InterfaceC1307790k8X interfaceC1307790k8X, C1307840k8c c1307840k8c, Event event, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1307790k8X;
        this.l1 = c1307840k8c;
        this.l2 = event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS264S0300000_20(Context context, PowerManager powerManager, C05P0 c05p0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = context;
        this.l2 = powerManager;
    }
}
