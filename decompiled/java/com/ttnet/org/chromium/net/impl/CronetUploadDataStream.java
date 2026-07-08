package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC1498040p5O;
import X.C08VH;
import X.C1497950p5F;
import X.C2188811AlT;
import X.C786410Ut5;
import X.RunnableC1498080p5S;
import Y.ARunnableS123S0100000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.CronetUploadDataStream;
import com.ttnet.org.chromium.net.n0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes24.dex */
public final class CronetUploadDataStream extends n0 {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final Executor LIZ;
    public final C1497950p5F LIZIZ;
    public final CronetUrlRequest LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public ByteBuffer LJIIIIZZ;
    public long LJIIJ;
    public boolean LJIIL;
    public final RunnableC1498080p5S LJII = new Runnable() { // from class: X.0p5S
        public final void LIZ() {
            synchronized (this.LL.LJIIIZ) {
                try {
                    CronetUploadDataStream cronetUploadDataStream = this.LL;
                    if (cronetUploadDataStream.LJIIJ == 0) {
                        return;
                    }
                    cronetUploadDataStream.LJ(3);
                    CronetUploadDataStream cronetUploadDataStream2 = this.LL;
                    if (cronetUploadDataStream2.LJIIIIZZ == null) {
                        throw new IllegalStateException("Unexpected readData call. Buffer is null");
                    }
                    cronetUploadDataStream2.LJIIJJI = 0;
                    try {
                        cronetUploadDataStream2.LIZJ.LJJI();
                        CronetUploadDataStream cronetUploadDataStream3 = this.LL;
                        cronetUploadDataStream3.LIZIZ.LIZIZ(cronetUploadDataStream3, cronetUploadDataStream3.LJIIIIZZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LL.LJIIIIZZ(e);
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
            C1C7U.LIZ("CronetUploadDataStream@a17b.<field>$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("CronetUploadDataStream@a17b.<field>$1");
        }
    };
    public final Object LJIIIZ = new Object();
    public int LJIIJJI = 3;
    public volatile boolean LJI = false;

    @Override // com.ttnet.org.chromium.net.n0
    public final void LIZJ() {
        synchronized (this.LJIIIZ) {
            try {
                LJ(1);
                this.LJIIJJI = 3;
                this.LJ = this.LIZLLL;
                if (this.LJIIJ == 0) {
                    return;
                }
                N.M3Tck9nA(this.LJIIJ, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        synchronized (this.LJIIIZ) {
            try {
                if (this.LJIIJJI == 0) {
                    this.LJIIL = true;
                } else {
                    if (this.LJIIJ == 0) {
                        return;
                    }
                    N.Mx3T_YwB(this.LJIIJ);
                    this.LJIIJ = 0L;
                    LJIIIZ(new Runnable() { // from class: X.0p5T
                        public final void LIZ() {
                            try {
                                this.LL.LIZJ.LJJI();
                                if (this.LL.LJI) {
                                    return;
                                }
                                this.LL.LIZIZ.close();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C08VH.LIZ("Exception thrown when closing", e);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CronetUploadDataStream@a17b.destroyAdapter$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CronetUploadDataStream@a17b.destroyAdapter$1");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        synchronized (this.LJIIIZ) {
            try {
                if (this.LJIIJJI == 0) {
                    throw new IllegalStateException("Method should not be called when read has not completed.");
                }
                if (this.LJIIL) {
                    LJFF();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII() {
        synchronized (this.LJIIIZ) {
            try {
                this.LJIIJJI = 2;
            } finally {
            }
        }
        try {
            this.LIZJ.LJJI();
            long jLIZ = this.LIZIZ.LIZ();
            this.LIZLLL = jLIZ;
            this.LJ = jLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIIZZ(th);
        }
        synchronized (this.LJIIIZ) {
            try {
                this.LJIIJJI = 3;
            } finally {
            }
        }
    }

    public void rewind() {
        LJIIIZ(new ARunnableS123S0100000_23(this, 53));
    }

    public void onUploadDataStreamDestroyed() {
        LJFF();
    }

    @Override // com.ttnet.org.chromium.net.n0
    public final void LIZ(boolean z) {
        synchronized (this.LJIIIZ) {
            try {
                LJ(0);
                if (this.LJFF == this.LJIIIIZZ.limit()) {
                    if (z && this.LIZLLL >= 0) {
                        throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    }
                    int iPosition = this.LJIIIIZZ.position();
                    long j = this.LJ - ((long) iPosition);
                    this.LJ = j;
                    if (j < 0 && this.LIZLLL >= 0) {
                        throw new IllegalArgumentException(C786410Ut5.j4("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.LIZLLL - this.LJ), Long.valueOf(this.LIZLLL)}));
                    }
                    this.LJIIIIZZ.position(0);
                    this.LJIIIIZZ = null;
                    this.LJIIJJI = 3;
                    LJI();
                    if (this.LJIIJ == 0) {
                        return;
                    }
                    N.MYsxiVBk(this.LJIIJ, this, iPosition, z);
                    return;
                }
                throw new IllegalStateException("ByteBuffer limit changed");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.n0
    public final void LIZIZ(Exception exc) {
        synchronized (this.LJIIIZ) {
            try {
                LJ(1);
                LJIIIIZZ(exc);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(long j) {
        synchronized (this.LJIIIZ) {
            try {
                this.LJIIJ = N.M89UGLMC(this, j, this.LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(int i) {
        if (this.LJIIJJI == i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(i);
        sbLIZ.append(", but was ");
        sbLIZ.append(this.LJIIJJI);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIIZZ(Throwable th) {
        boolean z;
        synchronized (this.LJIIIZ) {
            try {
                int i = this.LJIIJJI;
                if (i != 3) {
                    if (i == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJIIJJI = 3;
                    this.LJIIIIZZ = null;
                    LJI();
                } else {
                    throw new IllegalStateException("There is no read or rewind or length check in progress.");
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (z) {
            try {
                this.LIZIZ.close();
                this.LJI = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08VH.LIZ("Failure closing data provider", e);
            }
        }
        this.LIZJ.LJJIJ(th);
    }

    public final void LJIIIZ(Runnable runnable) {
        try {
            this.LIZ.execute(runnable);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CronetUrlRequest cronetUrlRequest = this.LIZJ;
            if (cronetUrlRequest != null) {
                cronetUrlRequest.LJJIJ(th);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpected request usage, caught in CronetUploadDataStream, caused by ");
            sbLIZ.append(th);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void readData(ByteBuffer byteBuffer) {
        this.LJIIIIZZ = byteBuffer;
        this.LJFF = byteBuffer.limit();
        LJIIIZ(this.LJII);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0p5S] */
    public CronetUploadDataStream(AbstractC1498040p5O abstractC1498040p5O, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.LIZ = executor;
        this.LIZIZ = new C1497950p5F(abstractC1498040p5O);
        this.LIZJ = cronetUrlRequest;
    }
}
