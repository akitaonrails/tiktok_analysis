package kotlin.jvm.internal;

import X.C09AY;
import X.C1207400hWc;
import X.C1207520hWo;
import X.C1208000hXa;
import X.C1208140hXo;
import X.C1798620wuC;
import X.C19514611Wm;
import X.C2188811AlT;
import X.C238400w2;
import X.EnumC1207420hWe;
import X.EnumC1207930hXT;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.i18n.location.control.SystemPermissionRequester$makeLifecycleWatcher$1;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS56S0310000_18 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS56S0310000_18 awS56S0310000_18) {
        EnumC1207930hXT enumC1207930hXT;
        if (awS56S0310000_18.z3) {
            enumC1207930hXT = EnumC1207930hXT.Granted;
        } else {
            enumC1207930hXT = EnumC1207930hXT.Denied;
        }
        C1208000hXa c1208000hXa = new C1208000hXa(enumC1207930hXT, EnumC1207420hWe.OpenSettings, null, (List) awS56S0310000_18.l0, 4);
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestPermissions(new): permissions granted=");
        sbLIZ.append(awS56S0310000_18.z3);
        sbLIZ.append(", dialog dismiss");
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        ((C1208140hXo) awS56S0310000_18.l1).LJFF.LIZIZ(c1208000hXa);
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver((SystemPermissionRequester$makeLifecycleWatcher$1) awS56S0310000_18.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS56S0310000_18 awS56S0310000_18) {
        String str;
        String str2;
        String str3;
        Boolean boolValueOf;
        C19514611Wm c19514611Wm = (C19514611Wm) awS56S0310000_18.l0;
        if (c19514611Wm != null) {
            c19514611Wm.LIZJ();
        }
        ((C238400w2) awS56S0310000_18.l1).element = System.currentTimeMillis();
        if (awS56S0310000_18.z3) {
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            C1207520hWo c1207520hWo = (C1207520hWo) awS56S0310000_18.l2;
            Map<String, ? extends Object> map = null;
            if (c1207520hWo != null) {
                str = c1207520hWo.LIZ;
                str2 = c1207520hWo.LIZIZ;
                str3 = c1207520hWo.LIZLLL;
                boolValueOf = Boolean.valueOf(c1207520hWo.LJFF);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                boolValueOf = null;
            }
            C1207520hWo c1207520hWo2 = (C1207520hWo) awS56S0310000_18.l2;
            if (c1207520hWo2 != null) {
                map = c1207520hWo2.LIZJ;
            }
            c1207400hWc.getClass();
            C1207400hWc.LJIIL(boolValueOf, str, str2, str3, map);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0310000_18(C19514611Wm c19514611Wm, C238400w2 c238400w2, boolean z, C1207520hWo c1207520hWo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19514611Wm;
        this.l1 = c238400w2;
        this.z3 = z;
        this.l2 = c1207520hWo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0310000_18(boolean z, boolean z2, List<? extends Pair<String, ? extends EnumC1207930hXT>> list, C1208140hXo c1208140hXo, SystemPermissionRequester$makeLifecycleWatcher$1 systemPermissionRequester$makeLifecycleWatcher$1) {
        super(0);
        this.$t = systemPermissionRequester$makeLifecycleWatcher$1;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = list;
        this.l2 = c1208140hXo;
    }
}
