package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle;

import X.AbstractC1538740q92;
import X.C1036960d5i;
import X.C1D62;
import X.C1D65;
import X.C1D66;
import X.C1D6C;
import X.EnumC1067640dtC;
import X.InterfaceC1541990qEH;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: loaded from: classes36.dex */
public final class SparkLifecycleProducer extends AbstractC1538740q92 implements ILifecycleProducer {
    public C1D65 LLILLJJLI;
    public boolean LLILLL;

    public SparkLifecycleProducer() {
        super(0);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LIZ() {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJJZ() {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
    }

    @Override // X.AbstractC1537870q7d
    public final C1036960d5i LJLIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        return null;
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZI() {
        C1D65 c1d65 = this.LLILLJJLI;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6C.ON_FIRST_DRAW, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LJJIJL(C1D62 c1d62) {
        SparkContext sparkContext;
        this.LLILLJJLI = c1d62;
        C1D66 c1d66 = c1d62.LIZ;
        if (c1d66 != null && (sparkContext = c1d66.LJFF) != null) {
            sparkContext.LJJIJIIJIL(this);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1D65 c1d65;
        if (!this.LLILLL && (c1d65 = this.LLILLJJLI) != null) {
            c1d65.LIZ(C1D6C.ON_LOAD_FINISH, null, null);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        C1D65 c1d65 = this.LLILLJJLI;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6C.ON_RUNTIME_READY, null, null);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LLILLL = true;
        C1D65 c1d65 = this.LLILLJJLI;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6C.ON_LOAD_FAILED, null, null);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1D65 c1d65 = this.LLILLJJLI;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6C.ON_LOAD_START, null, null);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJL(String str, byte[] bArr) {
        C1D65 c1d65 = this.LLILLJJLI;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6C.ON_RESOURCE_FINISH, null, null);
        }
    }
}
