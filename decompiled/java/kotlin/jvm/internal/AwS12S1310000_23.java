package kotlin.jvm.internal;

import X.C09AY;
import X.C1529710puT;
import X.C1533790q13;
import X.C1533880q1C;
import X.C1533900q1E;
import X.C1533910q1F;
import X.C1534020q1Q;
import X.C1534110q1Z;
import X.C1534130q1b;
import X.C1534320q1u;
import X.C1534730q2Z;
import X.C1534880q2o;
import X.C1ATJ;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS12S1310000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S1310000_23 awS12S1310000_23) {
        IPitayaCore iPitayaCoreLIZLLL = ((C1ATJ) awS12S1310000_23.l1).LIZLLL();
        String str = awS12S1310000_23.s0;
        PTYRequestConfig pTYRequestConfig = new PTYRequestConfig(awS12S1310000_23.z4, null);
        final Function0 function0 = (Function0) awS12S1310000_23.l2;
        final Function1 function1 = (Function1) awS12S1310000_23.l3;
        iPitayaCoreLIZLLL.requestUpdate(str, pTYRequestConfig, new PTYPackageCallback() { // from class: com.bytedance.android.live.ai.impl.pitaya.LivePitayaTaskManager$requestPkgByBusinessName$1$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                if (z) {
                    function0.invoke();
                } else {
                    function1.invoke(pTYError);
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S1310000_23 awS12S1310000_23) {
        C1533900q1E c1533900q1E = (C1533900q1E) awS12S1310000_23.l1;
        c1533900q1E.LJ++;
        if (c1533900q1E.LIZLLL && !((C1533900q1E) awS12S1310000_23.l1).LJIILL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyed on async, url:");
            sbLIZ.append(awS12S1310000_23.s0);
            C1533880q1C.LIZJ("ResourceGroup", "fetchResourceAsync", C2188811AlT.LIZIZ(sbLIZ), null, null);
        } else {
            ((C1533900q1E) awS12S1310000_23.l1).LIZIZ((C1533910q1F) awS12S1310000_23.l2, awS12S1310000_23.z4, (Function1) awS12S1310000_23.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS12S1310000_23 awS12S1310000_23) {
        if (awS12S1310000_23.z4) {
            C1534110q1Z c1534110q1Z = (C1534110q1Z) awS12S1310000_23.l1;
            Map<String, String> mapLJ = C2097608Jq.LJ();
            c1534110q1Z.LJI = mapLJ;
            String strLJFF = C1534020q1Q.LJFF(c1534110q1Z.LIZIZ);
            Keva keva = C1534880q2o.LIZ;
            C1529710puT.LIZ.getClass();
            C1534880q2o.LIZIZ(strLJFF, GsonProtectorUtils.toJson(C1529710puT.LIZJ, mapLJ));
        } else {
            Map mapLJ2 = (Map) ((C259800zU) awS12S1310000_23.l2).element;
            if (mapLJ2 == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ2);
            Set set = (Set) awS12S1310000_23.l3;
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.remove(it2.next());
                }
            }
            C1534110q1Z c1534110q1Z2 = (C1534110q1Z) awS12S1310000_23.l1;
            c1534110q1Z2.LJI = linkedHashMap;
            String strLJFF2 = C1534020q1Q.LJFF(c1534110q1Z2.LIZIZ);
            Keva keva2 = C1534880q2o.LIZ;
            C1529710puT.LIZ.getClass();
            C1534880q2o.LIZIZ(strLJFF2, GsonProtectorUtils.toJson(C1529710puT.LIZJ, linkedHashMap));
        }
        if (a0.LJJIIZI(awS12S1310000_23.s0, "?", false)) {
            C1534110q1Z c1534110q1Z3 = (C1534110q1Z) awS12S1310000_23.l1;
            C1534320q1u<C1534110q1Z> c1534320q1u = c1534110q1Z3.LJFF;
            String str = awS12S1310000_23.s0;
            c1534110q1Z3.LIZIZ(C1534130q1b.LIZ(a0.LJJZ(str, "?", str)));
            if (c1534320q1u != null) {
                c1534320q1u.LIZLLL = true;
                C1534730q2Z c1534730q2Z = c1534320q1u.LJ;
                if (c1534730q2Z != null) {
                    c1534730q2Z.LIZ();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1310000_23(C1ATJ c1atj, String str, Function0 function0, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1atj;
        this.s0 = str;
        this.z4 = true;
        this.l2 = function0;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S1310000_23(C1533900q1E c1533900q1E, C1533900q1E c1533900q1E2, String str, C1533910q1F c1533910q1F, boolean z, Function1<? super C1533790q13, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = c1533900q1E;
        this.s0 = c1533900q1E2;
        this.l2 = str;
        this.z4 = c1533910q1F;
        this.l3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S1310000_23(boolean z, boolean z2, C1534110q1Z c1534110q1Z, C259800zU<Map<String, String>> c259800zU, Set<String> set, String str) {
        super(0);
        this.$t = str;
        this.z4 = z;
        this.l1 = z2;
        this.l2 = c1534110q1Z;
        this.l3 = c259800zU;
        this.s0 = set;
    }
}
