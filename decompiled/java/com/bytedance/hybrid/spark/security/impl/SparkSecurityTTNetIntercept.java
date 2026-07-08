package com.bytedance.hybrid.spark.security.impl;

import X.C0X52;
import X.C13LQ;
import X.C1494230ozF;
import X.C2175508fh;
import X.C837650WtX;
import X.InterfaceC1494070oyz;
import X.InterfaceC1904907d9;
import X.InterfaceC837660WtY;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityTTNetIntercept implements InterfaceC1904907d9 {
    public static final Set<String> LL = C13LQ.LJLIIL(new String[]{"jsb/fetch", "LynxNetwork"});

    public SparkSecurityTTNetIntercept() {
        C837650WtX c837650WtX = new InterfaceC837660WtY() { // from class: X.0WtX
            @Override // X.InterfaceC837660WtY
            public final C1494320ozO LIZ(C1494600ozq c1494600ozq, int i) {
                JSONObject jSONObject;
                T t = c1494600ozq.LIZJ;
                if (t != 0 && (jSONObject = t.LJIJJLI) != null && jSONObject.optBoolean("gecko_cdn_write") && (i < 200 || i >= 400)) {
                    return new C1494320ozO(true);
                }
                return new C1494320ozO(false);
            }
        };
        InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
        synchronized (C1494230ozF.class) {
            if (C1494230ozF.LJIJ != null) {
                return;
            }
            C1494230ozF.LJIJ = c837650WtX;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0459 A[SYNTHETIC] */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r41) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.security.impl.SparkSecurityTTNetIntercept.intercept(X.0X0l):X.0X52");
    }

    public static C0X52 LIZ(List list, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            T t = c0x52.LIZIZ;
            C2175508fh c2175508fh = c0x52.LIZ;
            C2175508fh c2175508fh2 = new C2175508fh(c2175508fh.LIZ, c2175508fh.LIZIZ, c2175508fh.LIZJ, list, c2175508fh.LJ);
            C2175508fh c2175508fh3 = c0x52.LIZ;
            c2175508fh2.LJFF = c2175508fh3.LJFF;
            c2175508fh2.LJI = c2175508fh3.LJI;
            return C0X52.LIZLLL(t, c2175508fh2);
        }
        TypedInput typedInput = c0x52.LIZJ;
        C2175508fh c2175508fh4 = c0x52.LIZ;
        C2175508fh c2175508fh5 = new C2175508fh(c2175508fh4.LIZ, c2175508fh4.LIZIZ, c2175508fh4.LIZJ, list, c2175508fh4.LJ);
        C2175508fh c2175508fh6 = c0x52.LIZ;
        c2175508fh5.LJFF = c2175508fh6.LJFF;
        c2175508fh5.LJI = c2175508fh6.LJI;
        return C0X52.LIZIZ(typedInput, c2175508fh5);
    }
}
