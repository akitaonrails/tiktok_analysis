package com.bytedance.hybrid.spark.raven.component;

import X.C1043010dFT;
import X.C1161800gL4;
import X.C1161870gLB;
import X.C1558520qew;
import X.C2211631BhB;
import X.C724270Sb3;
import X.InterfaceC1161620gKm;
import X.InterfaceC1161810gL5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseRavenReusedComponent<T extends BaseComponentData> extends ReusedUISlotAssem<BaseRavenReusedComponent<T>> implements InterfaceC1161810gL5<T>, InterfaceC712990Rxx<T> {
    public View LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC1161810gL5
    public final String S2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((BaseComponentData) (c724270Sb3 != null ? c724270Sb3.LL : null)).instanceId;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1161870gLB c1161870gLBBr;
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 56));
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ == null || (c1161870gLBBr = interfaceC1161620gKmLIZ.Br()) == null) {
            return;
        }
        c1161870gLBBr.LJFF(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 57));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 58));
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 55));
    }

    @Override // X.InterfaceC1161810gL5
    public final InterfaceC1161620gKm sH() {
        return C1161800gL4.LIZ(this);
    }

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
        C1161870gLB c1161870gLBBr;
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ != null && (c1161870gLBBr = interfaceC1161620gKmLIZ.Br()) != null) {
            c1161870gLBBr.LIZIZ(this);
        }
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 60));
    }

    public void fm1() {
        C1161800gL4.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C1161870gLB c1161870gLBBr;
        C1161870gLB c1161870gLBBr2;
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ != null && (c1161870gLBBr2 = interfaceC1161620gKmLIZ.Br()) != null) {
            c1161870gLBBr2.LIZJ(this);
        }
        this.LLJJLIIIJLLLLLLLZ = view;
        InterfaceC1161620gKm interfaceC1161620gKmLIZ2 = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ2 != null && (c1161870gLBBr = interfaceC1161620gKmLIZ2.Br()) != null) {
            c1161870gLBBr.LJ(this, view);
        }
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 59));
        C2211631BhB.LJ(view, new AwS597S0100000_18((BaseRavenReusedComponent) this, 52));
    }

    public void op(T t) {
        C1161870gLB c1161870gLBBr;
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C1161800gL4.LIZJ(this, view, C1558520qew.LJIIL(this));
        }
        new C1043010dFT();
        C1043010dFT.LIZ("raven_reused_component", new AwS562S0100000_18((BaseRavenReusedComponent) this, 54));
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ != null && (c1161870gLBBr = interfaceC1161620gKmLIZ.Br()) != null) {
            c1161870gLBBr.LIZ(this, t);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
