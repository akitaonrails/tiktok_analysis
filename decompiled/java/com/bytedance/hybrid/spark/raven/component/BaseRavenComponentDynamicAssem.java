package com.bytedance.hybrid.spark.raven.component;

import X.C07ZJ;
import X.C1161800gL4;
import X.C1161870gLB;
import X.C1554960qZC;
import X.C1558520qew;
import X.C2211631BhB;
import X.InterfaceC1161620gKm;
import X.InterfaceC1161890gLD;
import X.InterfaceC2753014t;
import X.InterfaceC665370Q7z;
import Y.AObserverS222S0100000_18;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.data.EventModel;
import java.util.Map;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseRavenComponentDynamicAssem<T extends BaseComponentData> extends RavenDynamicAssem implements InterfaceC1161890gLD<T> {
    public final boolean yK1() {
        return (this instanceof ReusedAssem) || (getParent() instanceof ReusedAssem);
    }

    @Override // X.InterfaceC1161810gL5
    public final T B() {
        InterfaceC1161620gKm interfaceC1161620gKmSH = sH();
        if (interfaceC1161620gKmSH == null) {
            return null;
        }
        String strS2 = S2();
        if (strS2 == null) {
            strS2 = "";
        }
        return (T) interfaceC1161620gKmSH.qw(strS2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        InterfaceC1161620gKm interfaceC1161620gKmLIZ;
        C1161870gLB c1161870gLBBr;
        super.onCreate();
        if (yK1() || (interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this)) == null || (c1161870gLBBr = interfaceC1161620gKmLIZ.Br()) == null) {
            return;
        }
        c1161870gLBBr.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        C1161870gLB c1161870gLBBr;
        C1161870gLB c1161870gLBBr2;
        super.onDestroy();
        if (yK1()) {
            return;
        }
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ != null && (c1161870gLBBr2 = interfaceC1161620gKmLIZ.Br()) != null) {
            c1161870gLBBr2.LIZIZ(this);
        }
        InterfaceC1161620gKm interfaceC1161620gKmLIZ2 = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ2 == null || (c1161870gLBBr = interfaceC1161620gKmLIZ2.Br()) == null) {
            return;
        }
        c1161870gLBBr.LJFF(this);
    }

    @Override // X.InterfaceC1161810gL5
    public final InterfaceC1161620gKm sH() {
        return C1161800gL4.LIZ(this);
    }

    @Override // X.InterfaceC1161810gL5
    public final String S2() {
        return this.assemTagInternal;
    }

    @Override // X.InterfaceC1161890gLD
    public void Ab1(T t) {
        InterfaceC1161620gKm interfaceC1161620gKmLIZ;
        C1161870gLB c1161870gLBBr;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        InterfaceC1161620gKm interfaceC1161620gKmLIZ2 = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ2 != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            final Map<String, EventModel> mapHm = interfaceC1161620gKmLIZ2.Hm(str);
            if (mapHm != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this)) != null) {
                C1554960qZC.LIZ(interfaceC665370Q7zLJIIL, new InterfaceC2753014t(mapHm) { // from class: X.07ZJ
                    public final Map<String, EventModel> LL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C07ZJ) && Intrinsics.LJFF(this.LL, ((C07ZJ) obj).LL);
                    }

                    public final int hashCode() {
                        return this.LL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EventsSource(events=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LL = mapHm;
                    }
                }, C07ZJ.class, "source_default_key");
            }
        }
        if (!yK1() && (interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this)) != null && (c1161870gLBBr = interfaceC1161620gKmLIZ.Br()) != null) {
            c1161870gLBBr.LIZ(this, t);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        InterfaceC1161620gKm interfaceC1161620gKmLIZ;
        C1161870gLB c1161870gLBBr;
        mo127do();
        La(view, C1558520qew.LJIIL(this));
        if (!yK1()) {
            InterfaceC1161620gKm interfaceC1161620gKmLIZ2 = C1161800gL4.LIZ(this);
            String str = "";
            if (interfaceC1161620gKmLIZ2 != null) {
                String str2 = this.assemTagInternal;
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC1161620gKmLIZ2.Ts(str2, this, new AObserverS222S0100000_18(this, 18));
            }
            InterfaceC1161620gKm interfaceC1161620gKmLIZ3 = C1161800gL4.LIZ(this);
            if (interfaceC1161620gKmLIZ3 != null) {
                String str3 = this.assemTagInternal;
                if (str3 != null) {
                    str = str3;
                }
                interfaceC1161620gKmLIZ3.qv(str, this, new AObserverS222S0100000_18(this, 19));
            }
        }
        if (!yK1()) {
            C2211631BhB.LJ(view, new AwS597S0100000_18(this, (InterfaceC1161890gLD<BaseComponentData>) 683));
        }
        if (!yK1() && (interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this)) != null && (c1161870gLBBr = interfaceC1161620gKmLIZ.Br()) != null) {
            c1161870gLBBr.LJ(this, view);
        }
    }

    @Override // X.InterfaceC1161810gL5
    public void La(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1161800gL4.LIZJ(this, view, interfaceC665370Q7z);
    }
}
