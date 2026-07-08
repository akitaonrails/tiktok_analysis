package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle;

import X.C006Y;
import X.C1299240juk;
import X.C1316330kMJ;
import X.C1318050kP5;
import X.C1537830q7Z;
import X.C1537910q7h;
import X.C1D62;
import X.C1D65;
import X.C1D66;
import X.C1D6W;
import X.C682050Qp9;
import X.C740670T3p;
import X.InterfaceC1531560pxS;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateBundle;
import j27.s;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class LynxLifecycleProducer extends LynxViewClient implements ILifecycleProducer {
    public C1D65 LL;

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LIZ() {
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC1294040jmM
    public final void LIZJ(s sVar, String str, float f, float f2, C1316330kMJ c1316330kMJ) {
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJ(String str, String str2, int i) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(Map<String, Object> map) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIIZZ() {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI(C1318050kP5 c1318050kP5) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIL(JavaOnlyMap javaOnlyMap) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(C1299240juk c1299240juk) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJI(Map<String, Object> map) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJ(String str) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJI(Set<String> set) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJII(C1318050kP5 c1318050kP5) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIII(C1318050kP5 c1318050kP5) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ() {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZI() {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_DATA_UPDATE, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_FIRST_SCREEN, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_LOAD_SUCCESS, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ() {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_PAGE_UPDATE, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_RUNTIME_READY, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJFF(LynxError lynxError) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_RECEIVED_ERROR, null, new C740670T3p(lynxError));
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIZ(final HashMap<String, Object> map) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_DYNAMIC_COMPONENT_PERF_READY, null, new C006Y(map) { // from class: X.012N
                public final HashMap<String, Object> LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C012N) && Intrinsics.LJFF(this.LIZ, ((C012N) obj).LIZ);
                }

                public final int hashCode() {
                    HashMap<String, Object> map2 = this.LIZ;
                    if (map2 == null) {
                        return 0;
                    }
                    return map2.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DynamicComponentPerfPayload(perf=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = map;
                }
            });
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILIIL(String str) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_LOAD_FAILED, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIZILJ(String str) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_PAGE_START, null, null);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJLI(LynxError lynxError) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_RECEIVED_JS_ERROR, null, new C740670T3p(lynxError));
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIL(LynxError lynxError) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_RECEIVED_JAVA_ERROR, null, new C740670T3p(lynxError));
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJ(LynxError lynxError) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_RECEIVED_NATIVE_ERROR, null, new C740670T3p(lynxError));
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJZLJL(TemplateBundle templateBundle) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_TEMP_BUNDLE_READY, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LJJIJL(C1D62 c1d62) {
        C1537910q7h c1537910q7h;
        SparkContext sparkContext;
        this.LL = c1d62;
        C1D66 c1d66 = c1d62.LIZ;
        InterfaceC1531560pxS interfaceC1531560pxS = null;
        if (c1d66 != null && (sparkContext = c1d66.LJFF) != null) {
            interfaceC1531560pxS = sparkContext.hybridParams;
        }
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(final Map<String, Object> map) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_TIMING_SETUP, null, new C006Y(map) { // from class: X.006X
                public final Map<String, Object> LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C006X) && Intrinsics.LJFF(this.LIZ, ((C006X) obj).LIZ);
                }

                public final int hashCode() {
                    Map<String, Object> map2 = this.LIZ;
                    if (map2 == null) {
                        return 0;
                    }
                    return map2.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TimingSetupPayload(timingInfo=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = map;
                }
            });
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(C1D6W.ON_TIMING_UPDATE, null, new C682050Qp9(map, map2, str));
        }
    }
}
