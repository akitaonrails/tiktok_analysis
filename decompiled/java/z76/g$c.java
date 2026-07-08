package z76;

import X.C1290750jh3;
import X.C1290850jhD;
import X.C1291600jiQ;
import X.InterfaceC1290680jgw;
import Y.ARunnableS89S0200000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
public final class g$c implements InterfaceC1290680jgw {
    public final String LIZ;
    public final /* synthetic */ C1290850jhD LIZIZ;

    @Override // X.InterfaceC1290680jgw
    public final void LIZ(String str) throws JSONException {
        String str2 = this.LIZ;
        if (str2 != null) {
            C1290850jhD c1290850jhD = this.LIZIZ;
            if (Intrinsics.LJFF(str2, c1290850jhD.LLLLZLL) && (!a0.LJJJIL(str))) {
                String str3 = c1290850jhD.LLLLZLL;
                if (str3 == null) {
                    str3 = "";
                }
                c1290850jhD.LJLLJ(1, str, str3);
            }
        }
    }

    @Override // X.InterfaceC1290680jgw
    public final void LIZIZ(C1291600jiQ c1291600jiQ) {
        String str = this.LIZ;
        if (str != null) {
            C1290850jhD c1290850jhD = this.LIZIZ;
            if (Intrinsics.LJFF(str, c1290850jhD.LLLLZLL)) {
                C1290750jh3.LIZLLL(new ARunnableS89S0200000_20(c1291600jiQ, c1290850jhD, 247));
            }
        }
    }

    public g$c(C1290850jhD c1290850jhD, String str) {
        this.LIZIZ = c1290850jhD;
        this.LIZ = str;
    }
}
