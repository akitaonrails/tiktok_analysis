package com.bytedance.forest.chain.fetchers;

import X.AbstractC1534540q2G;
import X.AbstractC1535150q3F;
import X.C1492150ovt;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1533810q15;
import X.C1533970q1L;
import X.C1534010q1P;
import X.C1535040q34;
import X.C1535110q3B;
import com.bytedance.forest.Forest;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ResourceFetcher {
    public C1533970q1L credit;
    public C1533810q15 errorInfo;
    public String fetcherName;
    public final Forest forest;
    public boolean isFileCommitted;
    public C1492150ovt timer;

    public abstract void cancel();

    public AbstractC1534540q2G fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        return null;
    }

    public abstract void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1);

    public abstract void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13);

    public Pair<InputStream, Boolean> handleException(C1533790q13 c1533790q13, Throwable th) {
        return null;
    }

    public void onBufferClose(C1533790q13 c1533790q13, C1534010q1P c1534010q1P) {
    }

    public void onResponseCorrupted(C1533790q13 c1533790q13) {
    }

    public void onStreamClose(C1533790q13 c1533790q13, InputStream inputStream) {
    }

    public boolean postDeal(C1533790q13 c1533790q13) {
        return true;
    }

    public void writeFile(C1533790q13 c1533790q13) {
    }

    public final String getFetcherName() {
        String str = this.fetcherName;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final C1492150ovt getTimer() {
        C1492150ovt c1492150ovt = this.timer;
        if (c1492150ovt != null) {
            return c1492150ovt;
        }
        return null;
    }

    public final C1533970q1L getCredit() {
        return this.credit;
    }

    public final Forest getForest() {
        return this.forest;
    }

    public final boolean isFileCommitted$forest_release() {
        return this.isFileCommitted;
    }

    public ResourceFetcher(Forest forest) {
        this.forest = forest;
    }

    public final void recordMessage(String str) {
        C1533810q15 c1533810q15 = this.errorInfo;
        if (c1533810q15 == null) {
            c1533810q15 = null;
        }
        c1533810q15.LIZ(getFetcherName(), str);
    }

    public final <Input, Output> void setCorrespondingProcessor(AbstractC1535150q3F<Input, Output> abstractC1535150q3F) {
        C1535040q34 c1535040q34;
        C1533970q1L c1533970q1L = this.credit;
        if (c1533970q1L != null && (c1535040q34 = c1533970q1L.LIZ) != null) {
            c1535040q34.LJIIJJI(abstractC1535150q3F);
        }
    }

    public final void setCredit(C1533970q1L c1533970q1L) {
        this.credit = c1533970q1L;
    }

    public final void setFetcherName(String str) {
        this.fetcherName = str;
    }

    public final void setFileCommitted$forest_release(boolean z) {
        this.isFileCommitted = z;
    }

    public final void setTimer(C1492150ovt c1492150ovt) {
        this.timer = c1492150ovt;
    }

    public final <Input, Output> AbstractC1535150q3F<Input, Output> getCorrespondingProcessor(Class<Input> cls, Class<Output> cls2) {
        C1535040q34 c1535040q34;
        AbstractC1535150q3F<Input, Output> abstractC1535150q3F;
        C1533970q1L c1533970q1L = this.credit;
        if (c1533970q1L != null && (c1535040q34 = c1533970q1L.LIZ) != null) {
            C1535110q3B c1535110q3B = (C1535110q3B) c1535040q34.LIZJ(cls).LIZ();
            if (c1535110q3B != null) {
                HashMap map = c1535110q3B.LIZIZ;
                HashMap map2 = map;
                if (map == null) {
                    map2 = new HashMap();
                }
                c1535110q3B.LIZIZ = map2;
                abstractC1535150q3F = (AbstractC1535150q3F) map2.get(cls2);
            } else {
                abstractC1535150q3F = null;
            }
            if (abstractC1535150q3F instanceof AbstractC1535150q3F) {
                return abstractC1535150q3F;
            }
        }
        return null;
    }

    public final void init(String str, C1533790q13 c1533790q13) {
        this.credit = c1533790q13.LJIJJLI;
        setFetcherName(str);
        setTimer(c1533790q13.LIZJ.LIZ(str));
        this.errorInfo = c1533790q13.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFetcherError(int r5, java.lang.String r6) {
        /*
            r4 = this;
            X.0q15 r0 = r4.errorInfo
            r3 = 0
            if (r0 != 0) goto L6
            r0 = r3
        L6:
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = r4.getFetcherName()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L26
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            if (r2 != 0) goto L28
        L26:
            java.lang.String r2 = ""
        L28:
            X.0q15 r0 = r4.errorInfo
            if (r0 == 0) goto L2d
            r3 = r0
        L2d:
            java.lang.String r1 = r4.getFetcherName()
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r3.LIZIZ(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.chain.fetchers.ResourceFetcher.setFetcherError(int, java.lang.String):void");
    }
}
