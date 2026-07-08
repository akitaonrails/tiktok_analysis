package com.bytedance.hybrid.spark.raven.component;

import X.C1163080gN8;
import X.C19719912Dl;
import X.C631370Opb;
import X.C723830SaL;
import android.view.View;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.util.UUID;
import kotlin.jvm.internal.AwS227S0300000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class RavenDynamicGlueReusedUISlotAssem<T extends BaseComponentData> extends BaseRavenReusedComponent<T> {
    public final C1163080gN8<T> LLJL = new C1163080gN8<>(null);
    public boolean LLJLIL;

    public abstract C19719912Dl sp(BaseComponentData baseComponentData);

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenReusedComponent
    public final void fm1() {
        this.LLJL.LLILLJJLI.setValue(UUID.randomUUID().toString());
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenReusedComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        this.LLJL.LLILLL.setValue(UUID.randomUUID().toString());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        Integer numValueOf;
        BaseComponentData baseComponentData = (BaseComponentData) obj;
        super.op(baseComponentData);
        this.LLJL.LLILZ = Integer.valueOf(C631370Opb.LIZIZ(this));
        this.LLJL.LL.setValue((T) baseComponentData);
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (!this.LLJLIL && numValueOf != null && numValueOf.intValue() != -1) {
            this.LLJLIL = true;
            C723830SaL.LIZ(this, null, new AwS227S0300000_18((RavenDynamicGlueReusedUISlotAssem) this, (RavenDynamicGlueReusedUISlotAssem<BaseComponentData>) baseComponentData, (BaseComponentData) numValueOf, (Integer) 42));
        }
    }
}
