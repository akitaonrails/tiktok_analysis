package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC1495350p13;
import X.AbstractC1497700p4q;
import X.AbstractC1497730p4t;
import X.AbstractC1497770p4x;
import X.AbstractC1498040p5O;
import X.AbstractC1498350p5t;
import X.C08VH;
import X.C1494660ozw;
import X.C1494790p09;
import X.C1495360p14;
import X.C1497220p44;
import X.C1497690p4p;
import X.C1497740p4u;
import X.C1497760p4w;
import X.C1497780p4y;
import X.C1497800p50;
import X.C2188811AlT;
import X.C740700T3s;
import X.C786410Ut5;
import X.RunnableC1497670p4n;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS34S0101000_23;
import Y.ARunnableS6S2200000_23;
import Y.ARunnableS92S0200000_23;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.impl.w0;
import com.ttnet.org.chromium.net.o0;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes24.dex */
public final class CronetUrlRequest extends w0 {
    public final boolean LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final Object LJFF = new Object();
    public final CronetUrlRequestContext LJI;
    public final Executor LJII;
    public final List<String> LJIIIIZZ;
    public final C1497690p4p LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public String LJIILIIL;
    public final HeadersList LJIILJJIL;
    public final Collection<Object> LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final int LJIJI;
    public final boolean LJIJJ;
    public final int LJIJJLI;
    public final C1495360p14 LJIL;
    public final long LJJ;
    public final AbstractC1497770p4x LJJI;
    public CronetUploadDataStream LJJIFFI;
    public C1497220p44 LJJII;
    public AbstractC1497730p4t LJJIII;
    public C1494660ozw LJJIIJ;
    public String LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public long LJJIJIL;
    public int LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public long LJJIZ;
    public long LJJJ;
    public int LJJJI;
    public long LJJJIL;
    public long LJJJJ;
    public long LJJJJI;
    public long LJJJJIZL;
    public long LJJJJJ;
    public long LJJJJJL;
    public RunnableC1497670p4n LJJJJL;

    public static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
    }

    private void onCanceled() {
        C740700T3s.LIZ(this.LJJIIJZLJL);
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 55);
        LJIL();
        LJJIJIIJI(aRunnableS123S0100000_23);
    }

    private void onNativeAdapterDestroyed() {
        synchronized (this.LJFF) {
            try {
                if (this.LJJIII == null) {
                    return;
                }
                ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 56);
                try {
                    LJIL();
                    this.LJII.execute(aRunnableS123S0100000_23);
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C08VH.LIZ("Exception posting task to executor", e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZIZ() {
        synchronized (this.LJFF) {
            try {
                if (this.LIZIZ == 0) {
                    return;
                }
                N.MjbEhTZs(this.LIZIZ, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZJ() {
        C740700T3s.LIZ(this.LJJIIJZLJL);
        synchronized (this.LJFF) {
            try {
                if (this.LIZIZ == 0) {
                    return;
                }
                N.M3xsE8SK(this.LIZIZ, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZLLL() {
        synchronized (this.LJFF) {
            try {
                if (LJJIIJZLJL() || !this.LIZJ) {
                    return;
                }
                LJJII(2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJFF() {
        synchronized (this.LJFF) {
            try {
                if (!this.LIZLLL) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.LIZLLL = false;
                if (LJJIIJZLJL()) {
                    return;
                }
                N.MhCyx70S(this.LIZIZ, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.ttnet.org.chromium.net.impl.CronetUrlRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIILJJIL() throws Throwable {
        ?? r3;
        synchronized (this.LJFF) {
            try {
                LJJIFFI();
                try {
                    try {
                        try {
                            try {
                                this.LIZIZ = N.MnXVOzVo(this, this.LJI.LJJL(), this.LJIIJ, this.LJIIJJI, this.LJJIIZ, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIIL, this.LJJ);
                                this.LJI.LIZJ.incrementAndGet();
                                if (this.LJIILIIL != null && !N.MfdvbiJC(this.LIZIZ, this, this.LJIILIIL)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Invalid http method ");
                                    sbLIZ.append(this.LJIILIIL);
                                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                                }
                                boolean z = false;
                                for (Map.Entry<String, String> entry : this.LJIILJJIL) {
                                    if (entry.getKey().equalsIgnoreCase("Content-Type") && !entry.getValue().isEmpty()) {
                                        z = true;
                                    }
                                    if (entry.getKey().equalsIgnoreCase("Tt-Map-Key") && !entry.getValue().isEmpty()) {
                                        this.LJJIIJZLJL = entry.getValue();
                                    }
                                    if (!N.MtJFji5x(this.LIZIZ, this, entry.getKey(), entry.getValue())) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("Invalid header ");
                                        sbLIZ2.append(entry.getKey());
                                        sbLIZ2.append("=");
                                        sbLIZ2.append(entry.getValue());
                                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                }
                                N.M4C6WZaz(this.LIZIZ, this, this.LJJIIZI, this.LJJIJ, this.LJJIJIIJI);
                                N.MaFGwSbC(this.LIZIZ, this, this.LJJIJIIJIL);
                                long j = 0;
                                if (this.LJJIJIL > 0) {
                                    long j2 = this.LIZIZ;
                                    N.ML2WrLQ6(j2, this, this.LJJIJIL);
                                    j = j2;
                                }
                                long j3 = j;
                                if (this.LJJIJL > 0) {
                                    long j4 = this.LIZIZ;
                                    N.MC7pScOk(j4, this, this.LJJIJL);
                                    j3 = j4;
                                }
                                r3 = j3;
                                if (this.LJJIJLIJ != null) {
                                    r3 = j3;
                                    if (this.LJJIL != null) {
                                        long j5 = this.LIZIZ;
                                        N.Mor7A21H(j5, this, this.LJJIJLIJ, this.LJJIL);
                                        r3 = j5;
                                    }
                                }
                                CronetUploadDataStream cronetUploadDataStream = this.LJJIFFI;
                                if (cronetUploadDataStream == null) {
                                    this.LIZJ = true;
                                    String str = this.LJJIIJZLJL;
                                    if (str != null && !TextUtils.isEmpty(str)) {
                                        ((ConcurrentHashMap) C740700T3s.LIZ).put(str, this);
                                    }
                                    N.Mv2a151P(this.LIZIZ, this);
                                    return;
                                }
                                try {
                                    if (!z) {
                                        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                    }
                                    this.LIZJ = true;
                                    cronetUploadDataStream.LJIIIZ(new Runnable() { // from class: X.0p4l
                                        public final void LIZ() {
                                            this.LL.LJJIFFI.LJII();
                                            synchronized (this.LL.LJFF) {
                                                try {
                                                    if (this.LL.LJJIIJZLJL()) {
                                                        return;
                                                    }
                                                    CronetUrlRequest cronetUrlRequest = this.LL;
                                                    cronetUrlRequest.LJJIFFI.LIZLLL(cronetUrlRequest.LIZIZ);
                                                    CronetUrlRequest cronetUrlRequest2 = this.LL;
                                                    String str2 = cronetUrlRequest2.LJJIIJZLJL;
                                                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                                                        ((ConcurrentHashMap) C740700T3s.LIZ).put(str2, cronetUrlRequest2);
                                                    }
                                                    N.Mv2a151P(cronetUrlRequest2.LIZIZ, cronetUrlRequest2);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    throw th;
                                                }
                                            }
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("CronetUrlRequest@8822.start$2");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("CronetUrlRequest@8822.start$2");
                                        }
                                    });
                                } catch (RuntimeException e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    LJJII(r3);
                                    throw e;
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            r3 = 1;
                            TryCatchGuardChecker.doCheck(e);
                            LJJII(r3);
                            throw e;
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        r3 = 1;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void LJIL() {
        if (this.LJJJJI != -1) {
            long jNanoTime = System.nanoTime();
            this.LJJJJIZL = jNanoTime;
            if (this.LJJJJJ == -1) {
                this.LJJJJJ = 0L;
            }
            this.LJJJJJ += jNanoTime - this.LJJJJI;
            this.LJJJJI = -1L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0p4w] */
    public final C1497760p4w LJJ() {
        Map<String, List<String>> mapEmptyMap;
        boolean z;
        long length;
        long length2;
        C1497220p44 c1497220p44 = this.LJJII;
        if (c1497220p44 != null) {
            mapEmptyMap = c1497220p44.LIZ();
            z = this.LJJII.LIZLLL;
        } else {
            mapEmptyMap = Collections.emptyMap();
            z = false;
        }
        long jLongValue = this.LJJIIJ.LJIILLIIL.longValue();
        if (!z || jLongValue != 0) {
            HeadersList headersList = this.LJIILJJIL;
            if (headersList == null) {
                length = 0;
            } else {
                length = 0;
                for (Map.Entry<String, String> entry : headersList) {
                    String key = entry.getKey();
                    if (key != null) {
                        length += (long) key.length();
                    }
                    if (entry.getValue() != null) {
                        length += (long) entry.getValue().length();
                    }
                }
            }
            Math.max(0L, jLongValue - length);
        }
        long jLongValue2 = this.LJJIIJ.LJIIZILJ.longValue();
        if (!z || jLongValue2 != 0) {
            if (mapEmptyMap == null) {
                length2 = 0;
            } else {
                length2 = 0;
                for (Map.Entry<String, List<String>> entry2 : mapEmptyMap.entrySet()) {
                    String key2 = entry2.getKey();
                    if (key2 != null) {
                        length2 += (long) key2.length();
                    }
                    if (entry2.getValue() != null) {
                        Iterator<String> it2 = entry2.getValue().iterator();
                        while (it2.hasNext()) {
                            length2 += (long) it2.next().length();
                        }
                    }
                }
            }
            Math.max(0L, jLongValue2 - length2);
        }
        if (C1494660ozw.LIZ(this.LJJIIJ.LIZ) == null || C1494660ozw.LIZ(this.LJJIIJ.LJIIJJI) == null) {
            Duration.ofSeconds(0L);
        } else {
            Duration.ofMillis(C1494660ozw.LIZ(this.LJJIIJ.LJIIJJI).getTime() - C1494660ozw.LIZ(this.LJJIIJ.LIZ).getTime());
        }
        if (C1494660ozw.LIZ(this.LJJIIJ.LIZ) == null || C1494660ozw.LIZ(this.LJJIIJ.LJIIL) == null) {
            Duration.ofSeconds(0L);
        } else {
            Duration.ofMillis(C1494660ozw.LIZ(this.LJJIIJ.LJIIL).getTime() - C1494660ozw.LIZ(this.LJJIIJ.LIZ).getTime());
        }
        return new Object() { // from class: X.0p4w
        };
    }

    public final void LJJI() {
        if (this.LIZ) {
            return;
        }
        if (C786410Ut5.u3() == this.LJI.LJ) {
            throw new C1497780p4y();
        }
    }

    public final void LJJIFFI() {
        synchronized (this.LJFF) {
            try {
                if (this.LIZJ || LJJIIJZLJL()) {
                    throw new IllegalStateException("Request is already started.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJJIIJZLJL() {
        return this.LIZJ && this.LIZIZ == 0;
    }

    public final void LJJIIZ() {
        if (this.LJJIIJ != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    AbstractC1497770p4x abstractC1497770p4x = this.LJJI;
                    LJJ();
                    abstractC1497770p4x.LIZIZ();
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C08VH.LIZ("Error while trying to log CronetTrafficInfo: ", e);
                }
            }
            C1494660ozw c1494660ozw = this.LJJIIJ;
            long j = this.LJJJIL;
            long j2 = this.LJJJJ;
            long j3 = this.LJJJJIZL;
            long j4 = this.LJJJJJ;
            long j5 = this.LJJJJJL;
            c1494660ozw.LJJIIZ = j;
            c1494660ozw.LJJIIZI = j2;
            c1494660ozw.LJJIJ = j3;
            c1494660ozw.LJJIJIIJI = j4;
            c1494660ozw.LJJIJIIJIL = j5;
            final C1494790p09 c1494790p09 = new C1494790p09(this.LJIILL, c1494660ozw);
            CronetUrlRequestContext cronetUrlRequestContext = this.LJI;
            synchronized (cronetUrlRequestContext.LJII) {
                try {
                    if (!((HashMap) cronetUrlRequestContext.LJIILJJIL).isEmpty()) {
                        for (C1495360p14 c1495360p14 : new ArrayList(((HashMap) cronetUrlRequestContext.LJIILJJIL).values())) {
                            try {
                                c1495360p14.getExecutor().execute(new ARunnableS92S0200000_23(c1495360p14, c1494790p09, 37));
                            } catch (RejectedExecutionException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C08VH.LIZ("Exception posting task to executor", e2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1495360p14 c1495360p142 = this.LJIL;
            if (c1495360p142 != null) {
                try {
                    c1495360p142.getExecutor().execute(new Runnable() { // from class: X.0p15
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CronetUrlRequest@8822.maybeReportMetrics$1");
                            try {
                                onRequestFinished(c1494790p09);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CronetUrlRequest@8822.maybeReportMetrics$1");
                        }
                    });
                } catch (RejectedExecutionException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C08VH.LIZ("Exception posting task to executor", e3);
                }
            }
        }
    }

    private void onSucceeded(long j) {
        this.LJJII.LJI.set(j);
        C740700T3s.LIZ(this.LJJIIJZLJL);
        Runnable runnable = new Runnable() { // from class: X.0p4m
            public final void LIZ() {
                synchronized (this.LL.LJFF) {
                    try {
                        if (this.LL.LJJIIJZLJL()) {
                            return;
                        }
                        this.LL.LJJII(0);
                        try {
                            CronetUrlRequest cronetUrlRequest = this.LL;
                            cronetUrlRequest.LJIIIZ.LJFF(cronetUrlRequest, cronetUrlRequest.LJJII);
                            this.LL.LJJIIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C08VH.LIZ("Exception in onSucceeded method", e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CronetUrlRequest@8822.onSucceeded$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CronetUrlRequest@8822.onSucceeded$1");
            }
        };
        LJIL();
        LJJIJIIJI(runnable);
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJI(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.isDirect()) {
                synchronized (this.LJFF) {
                    try {
                        if (this.LJ) {
                            this.LJ = false;
                            if (LJJIIJZLJL()) {
                                return;
                            }
                            this.LJJJIL++;
                            long jNanoTime = System.nanoTime();
                            this.LJJJJI = jNanoTime;
                            if (this.LJJJJ == -1) {
                                this.LJJJJ = jNanoTime;
                            }
                            long j = this.LJJJJIZL;
                            if (j != -1) {
                                if (this.LJJJJJL == -1) {
                                    this.LJJJJJL = 0L;
                                }
                                this.LJJJJJL += jNanoTime - j;
                            }
                            if (N.MJbYA4in(this.LIZIZ, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                                return;
                            }
                            this.LJ = true;
                            LJIL();
                            throw new IllegalArgumentException("Unable to call native read");
                        }
                        throw new IllegalStateException("Unexpected read attempt.");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJII(long j) {
        this.LJJIZ = j;
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIIZ(int i) {
        this.LJJJI = i;
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIJ(int i) {
        this.LJJIIZ = i;
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIJJI(int i) {
        this.LJJIJL = i | this.LJJIJL;
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIL(long j) {
        this.LJJJ = j;
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIILIIL(long j) {
        synchronized (this.LJFF) {
            try {
                this.LJJIJIL = j;
                if (this.LIZIZ != 0) {
                    N.ML2WrLQ6(this.LIZIZ, this, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIILLIIL(String str) {
        LJJIFFI();
        if (str != null) {
            this.LJIILIIL = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIIZILJ(int i) {
        this.LJJIJIIJIL = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJ(int i) {
        this.LJJIIZI = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJI(int i) {
        this.LJJIJ = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJJ(int i) {
        this.LJJIJIIJI = i;
    }

    public final void LJJII(int i) {
        boolean z;
        if (this.LIZIZ == 0) {
            return;
        }
        this.LJI.LIZJ.decrementAndGet();
        long j = this.LIZIZ;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        N.MIb9tt7_(j, this, z);
        this.LIZIZ = 0L;
    }

    public final void LJJIII(AbstractC1497730p4t abstractC1497730p4t) {
        synchronized (this.LJFF) {
            try {
                if (LJJIIJZLJL()) {
                    return;
                }
                this.LJJIII = abstractC1497730p4t;
                LJJII(1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIIJ(final o0.c cVar) {
        o0.c cVar2 = new o0.c(cVar) { // from class: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener
            public final o0.c LIZ;

            {
                this.LIZ = cVar;
            }

            @Override // com.ttnet.org.chromium.net.o0.c
            public final void onStatus(int i) {
                this.LIZ.onStatus(i);
            }
        };
        synchronized (this.LJFF) {
            try {
                if (this.LIZIZ != 0) {
                    N.MmSvKAJE(this.LIZIZ, this, cVar2);
                } else {
                    LJJIJIIJI(new ARunnableS123S0100000_23(cVar2, 54));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIIZI(Exception exc) {
        C1497800p50 c1497800p50 = new C1497800p50("Exception received from UrlRequest.Callback", exc);
        C08VH.LIZ("Exception in CalledByNative method", exc);
        LJJIII(c1497800p50);
    }

    public final void LJJIJ(Throwable th) {
        C08VH.LIZ("Exception in upload method", th);
        synchronized (this.LJFF) {
            try {
                if (this.LIZIZ == 0) {
                    return;
                }
                N.MzKjGz9N(this.LIZIZ, this);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJJIJIIJI(Runnable runnable) {
        try {
            this.LJII.execute(runnable);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C08VH.LIZ("Exception posting task to executor", e);
            LJJIII(new C1497740p4u("Exception posting task to executor", e));
        }
    }

    private String[] addSecurityFactor(String str, String[] strArr) {
        Map<String, String> mapOnCallToAddSecurityFactor;
        HashMap map = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            map.put(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]);
        }
        AbstractC1498350p5t abstractC1498350p5t = this.LJI.LJJIIJZLJL;
        if (abstractC1498350p5t == null || (mapOnCallToAddSecurityFactor = abstractC1498350p5t.onCallToAddSecurityFactor(str, map)) == null) {
            return null;
        }
        String[] strArr2 = new String[mapOnCallToAddSecurityFactor.size() * 2];
        for (Map.Entry<String, String> entry : mapOnCallToAddSecurityFactor.entrySet()) {
            strArr2[i] = entry.getKey();
            strArr2[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr2;
    }

    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        LJJIJIIJI(new ARunnableS34S0101000_23(versionSafeCallbacks$UrlRequestStatusListener, i, 4));
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZ(String str, String str2) {
        synchronized (this.LJFF) {
            try {
                if (this.LIZIZ == 0) {
                    return;
                }
                N.M2jrbUOP(this.LIZIZ, this, str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJ(String str, Throwable th) {
        LJJIII(new C1497740p4u(str, th));
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIIIZZ(String str, String str2) {
        this.LJJIJLIJ = str;
        this.LJJIL = str2;
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIILL(String str, String str2) {
        LJJIFFI();
        if (str != null) {
            if (str2 != null) {
                this.LJIILJJIL.add(new AbstractMap.SimpleImmutableEntry(str, str2));
                return;
            }
            throw new NullPointerException("Invalid header value.");
        }
        throw new NullPointerException("Invalid header name.");
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJJLI(AbstractC1498040p5O abstractC1498040p5O, Executor executor) {
        if (abstractC1498040p5O != null) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = "POST";
            }
            this.LJJIFFI = new CronetUploadDataStream(abstractC1498040p5O, executor, this);
            return;
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C1497220p44 c1497220p44 = this.LJJII;
        if (c1497220p44 != null) {
            c1497220p44.LJI.set(j);
        }
        C740700T3s.LIZ(this.LJJIIJZLJL);
        if (i != 10 && i != 3) {
            switch (i) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    i = 9;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    i = 10;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    i = 11;
                    break;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown error code: ");
                    sbLIZ.append(i);
                    C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                    break;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Exception in CronetUrlRequest: ");
            sbLIZ2.append(str);
            LJJIII(new NetworkExceptionImpl(C2188811AlT.LIZIZ(sbLIZ2), i, i2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Exception in CronetUrlRequest: ");
        sbLIZ3.append(str);
        LJJIII(new o0(C2188811AlT.LIZIZ(sbLIZ3), i, i2, i3));
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.LJJII.LJI.set(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.LJJJJL == null) {
                this.LJJJJL = new RunnableC1497670p4n(this);
            }
            byteBuffer.position(i2 + i);
            this.LJJJJL.LL = byteBuffer;
            LJIL();
            LJJIJIIJI(this.LJJJJL);
            return;
        }
        LJJIII(new C1497740p4u("ByteBuffer modified externally during read", null));
    }

    public final C1497220p44 LJJIJIIJIL(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new C1497220p44(new ArrayList(this.LJIIIIZZ), i, str, headersList, z, str2, str3, j);
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j, final String str4) {
        this.LJJII = LJJIJIIJIL(i, str, strArr, z, str2, str3, j);
        LJJIJIIJI(new Runnable() { // from class: X.0p4o
            public final void LIZ() {
                this.LLILLJJLI.LJJI();
                synchronized (this.LLILLJJLI.LJFF) {
                    try {
                        if (this.LLILLJJLI.LJJIIJZLJL()) {
                            return;
                        }
                        CronetUrlRequest cronetUrlRequest = this.LLILLJJLI;
                        cronetUrlRequest.LJ = true;
                        try {
                            cronetUrlRequest.LJIIIZ.LJ(cronetUrlRequest, cronetUrlRequest.LJJII, str4);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LLILLJJLI.LJJIIZI(e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CronetUrlRequest@8822.onResponseStarted$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CronetUrlRequest@8822.onResponseStarted$1");
            }
        });
    }

    private void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j, String str5) {
        C1497220p44 c1497220p44LJJIJIIJIL = LJJIJIIJIL(i, str2, strArr, z, str3, str4, j);
        this.LJJII = c1497220p44LJJIJIIJIL;
        ((ArrayList) this.LJIIIIZZ).add(str);
        LJJIJIIJI(new ARunnableS6S2200000_23(c1497220p44LJJIJIIJIL, str, this, str5, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0p4p] */
    public CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, final AbstractC1497700p4q abstractC1497700p4q, Executor executor, boolean z, boolean z2, int i2, boolean z3, int i3, final AbstractC1495350p13 abstractC1495350p13, long j) {
        ArrayList arrayList = new ArrayList();
        this.LJIIIIZZ = arrayList;
        this.LJIILJJIL = new HeadersList();
        this.LJJJIL = 0L;
        this.LJJJJ = -1L;
        this.LJJJJI = -1L;
        this.LJJJJIZL = -1L;
        this.LJJJJJ = -1L;
        this.LJJJJJL = -1L;
        if (str != null) {
            if (abstractC1497700p4q != null) {
                if (executor != null) {
                    this.LIZ = false;
                    this.LJI = cronetUrlRequestContext;
                    this.LJJI = cronetUrlRequestContext.LJJJ;
                    this.LJIIJ = str;
                    arrayList.add(str);
                    int i4 = 1;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                i4 = 4;
                                if (i == 4) {
                                    i4 = 5;
                                }
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                    this.LJIIJJI = i4;
                    this.LJIIIZ = new AbstractC1497700p4q(abstractC1497700p4q) { // from class: X.0p4p
                        public final AbstractC1497700p4q LIZ;

                        {
                            this.LIZ = abstractC1497700p4q;
                        }

                        @Override // X.AbstractC1497700p4q
                        public final void LIZ(w0 w0Var, AbstractC1497330p4F abstractC1497330p4F) {
                            this.LIZ.LIZ(w0Var, abstractC1497330p4F);
                        }

                        @Override // X.AbstractC1497700p4q
                        public final void LJFF(w0 w0Var, AbstractC1497330p4F abstractC1497330p4F) {
                            this.LIZ.LJFF(w0Var, abstractC1497330p4F);
                        }

                        @Override // X.AbstractC1497700p4q
                        public final void LIZIZ(w0 w0Var, AbstractC1497330p4F abstractC1497330p4F, AbstractC1497730p4t abstractC1497730p4t) {
                            this.LIZ.LIZIZ(w0Var, abstractC1497330p4F, abstractC1497730p4t);
                        }

                        @Override // X.AbstractC1497700p4q
                        public final void LIZJ(w0 w0Var, AbstractC1497330p4F abstractC1497330p4F, ByteBuffer byteBuffer) {
                            this.LIZ.LIZJ(w0Var, abstractC1497330p4F, byteBuffer);
                        }

                        @Override // X.AbstractC1497700p4q
                        public final void LJ(w0 w0Var, C1497220p44 c1497220p44, String str2) {
                            this.LIZ.LJ(w0Var, c1497220p44, str2);
                        }

                        @Override // X.AbstractC1497700p4q
                        public final void LIZLLL(w0 w0Var, AbstractC1497330p4F abstractC1497330p4F, String str2, String str3) {
                            this.LIZ.LIZLLL(w0Var, abstractC1497330p4F, str2, str3);
                        }
                    };
                    this.LJII = executor;
                    this.LJIILL = null;
                    this.LJIILLIIL = z;
                    this.LJIIZILJ = false;
                    this.LJIJ = z2;
                    this.LJIJI = i2;
                    this.LJIJJ = z3;
                    this.LJIJJLI = i3;
                    this.LJIL = abstractC1495350p13 != null ? new AbstractC1495350p13(abstractC1495350p13) { // from class: X.0p14
                        public final AbstractC1495350p13 LIZ;

                        @Override // X.AbstractC1495350p13
                        public final Executor getExecutor() {
                            return this.LIZ.getExecutor();
                        }

                        {
                            super(abstractC1495350p13.getExecutor());
                            this.LIZ = abstractC1495350p13;
                        }

                        @Override // X.AbstractC1495350p13
                        public final void onRequestFinished(AbstractC1494840p0E abstractC1494840p0E) {
                            this.LIZ.onRequestFinished(abstractC1494840p0E);
                        }
                    } : 0;
                    this.LJIIL = 0;
                    this.LJJ = j;
                    return;
                }
                throw new NullPointerException("Executor is required");
            }
            throw new NullPointerException("Listener is required");
        }
        throw new NullPointerException("URL is required");
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16, long j17, String str2, String str3, String str4, String str5, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        synchronized (this.LJFF) {
            try {
                if (this.LJJIIJ == null) {
                    C1494660ozw c1494660ozw = new C1494660ozw(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, str, j16, j17, str2, str3, this.LJJIZ, this.LJJJ, this.LJJJI, z2, z3, i);
                    this.LJJIIJ = c1494660ozw;
                    c1494660ozw.LJJIIJZLJL = str5;
                } else {
                    throw new IllegalStateException("Metrics collection should only happen once.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
