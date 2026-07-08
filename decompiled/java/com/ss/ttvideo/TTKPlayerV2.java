package com.ss.ttvideo;

import X.AbstractC1469000oKY;
import X.AbstractC1470590oN7;
import X.C1468980oKW;
import X.C1468990oKX;
import X.C1469150oKn;
import X.C1470430oMr;
import X.C1470470oMv;
import X.C1470490oMx;
import X.C1470500oMy;
import X.C1470510oMz;
import X.C1470530oN1;
import X.C1470690oNH;
import X.C1470710oNJ;
import X.C1474810oTv;
import X.C179300mV;
import X.C1C7U;
import X.C2032207xg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1467090oHT;
import X.InterfaceC1467800oIc;
import X.InterfaceC1467810oId;
import X.InterfaceC1467820oIe;
import X.InterfaceC1467950oIr;
import X.InterfaceC1469660oLc;
import X.InterfaceC1470050oMF;
import X.InterfaceC1470060oMG;
import X.InterfaceC1470070oMH;
import X.InterfaceC1470080oMI;
import X.InterfaceC1470110oML;
import X.InterfaceC1470540oN2;
import X.InterfaceC1470600oN8;
import X.InterfaceC1470660oNE;
import X.InterfaceC1470680oNG;
import X.InterfaceC1470720oNK;
import X.InterfaceC1470730oNL;
import X.InterfaceC1470740oNM;
import X.InterfaceC1470750oNN;
import X.InterfaceC1470900oNc;
import X.InterfaceC1470910oNd;
import X.InterfaceC1470920oNe;
import X.InterfaceC1470930oNf;
import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TTPlayerClient;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public class TTKPlayerV2 implements InterfaceC1470660oNE {
    public AbstractC1470590oN7 mContext;
    public Handler mHandler;
    public final C1469150oKn<InterfaceC1467090oHT> mInstanceCounter;
    public InterfaceC1470750oNN mOnKernelReuseListener;
    public C1470490oMx mPauseProcessModule;
    public InterfaceC1470540oN2<InterfaceC1470660oNE> mPool;
    public C1470510oMz mPrepareStartProcessModule;
    public volatile int mRecycleState;
    public C1470500oMy mReleaseProcessModule;
    public InterfaceC1470740oNM mReportModule;
    public InterfaceC1467950oIr mTempForReusePlayer;
    public InterfaceC1469660oLc mValueCenter;

    @Override // X.InterfaceC1467090oHT
    public /* bridge */ /* synthetic */ boolean onMediaPlayerInfo(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
        return true;
    }

    @Override // X.InterfaceC1467090oHT
    public void prepare() {
        prepare(null);
    }

    public void setOnKernelReuseListener(InterfaceC1470750oNN interfaceC1470750oNN) {
    }

    @Override // X.InterfaceC1467090oHT
    public void start() {
        play(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkKeepAlive$0() {
        C1C7U.LIZ("TTKPlayerV2@e594.checkKeepAlive$1L");
        this.mHandler.removeCallbacksAndMessages(null);
        removeFromPool();
        C1C7U.LIZIZ("TTKPlayerV2@e594.checkKeepAlive$1L");
    }

    private void refreshHandler() {
        if (this.mHandler.getLooper() != Looper.myLooper()) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler = new BPEAHandler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            InterfaceC1467950oIr mediaPlayer = getMediaPlayer();
            if (mediaPlayer != null) {
                ((C1470430oMr) mediaPlayer).LIZJ(1301, 1);
            }
        }
    }

    public void doRelease() {
        C1470500oMy c1470500oMy = this.mReleaseProcessModule;
        if (c1470500oMy != null) {
            c1470500oMy.LIZ(c1470500oMy.LIZJ);
            InterfaceC1470060oMG interfaceC1470060oMG = c1470500oMy.LIZJ;
            if (interfaceC1470060oMG != null) {
                interfaceC1470060oMG.release();
            } else if (c1470500oMy.LIZIZ.LJFF() != null) {
                ((C1470430oMr) c1470500oMy.LIZIZ.LJFF()).release();
            }
        }
        this.mInstanceCounter.LIZ.remove(new C2032207xg(this));
    }

    public InterfaceC1467950oIr getMediaPlayer() {
        InterfaceC1469660oLc interfaceC1469660oLc = this.mValueCenter;
        if (interfaceC1469660oLc != null) {
            return interfaceC1469660oLc.LJFF();
        }
        return null;
    }

    @Override // X.InterfaceC1470660oNE
    public InterfaceC1467950oIr initMediaPlayer() {
        InterfaceC1467950oIr interfaceC1467950oIrLJFF = this.mValueCenter.LJFF();
        if (!C1470530oN1.LIZ(this.mContext) || interfaceC1467950oIrLJFF == null) {
            if (((Boolean) C1474810oTv.S1.getValue()).booleanValue() && interfaceC1467950oIrLJFF != null) {
                ((C1470430oMr) interfaceC1467950oIrLJFF).release();
            }
            C1468980oKW c1468980oKW = new C1468980oKW();
            c1468980oKW.LIZ = this.mContext.LIZ();
            interfaceC1467950oIrLJFF = c1468980oKW.LIZ();
        } else {
            refreshHandler();
        }
        this.mValueCenter.LJIIIIZZ(interfaceC1467950oIrLJFF);
        return interfaceC1467950oIrLJFF;
    }

    @Override // X.InterfaceC1470600oN8
    public boolean isRecyclable() {
        return C1470530oN1.LIZIZ(this.mContext);
    }

    @Override // X.InterfaceC1467090oHT
    public void pause() {
        C1470490oMx c1470490oMx = this.mPauseProcessModule;
        if (c1470490oMx != null) {
            c1470490oMx.LIZ(c1470490oMx.LIZJ);
            InterfaceC1470050oMF interfaceC1470050oMF = c1470490oMx.LIZJ;
            if (interfaceC1470050oMF != null) {
                interfaceC1470050oMF.pause();
            } else if (c1470490oMx.LIZIZ.LJFF() != null) {
                ((C1470430oMr) c1470490oMx.LIZIZ.LJFF()).pause();
            }
        }
    }

    public void putToPool() {
        InterfaceC1470540oN2<InterfaceC1470660oNE> interfaceC1470540oN2 = this.mPool;
        if (interfaceC1470540oN2 == null) {
            doRelease();
        } else if (interfaceC1470540oN2.LIZ(this)) {
            checkKeepAlive();
        } else {
            C1470690oNH.LIZ.LIZLLL = 2;
            doRelease();
        }
    }

    public boolean recycle() {
        InterfaceC1470540oN2<InterfaceC1470660oNE> interfaceC1470540oN2 = this.mPool;
        if (interfaceC1470540oN2 == null || !interfaceC1470540oN2.isAvailable()) {
            C1470690oNH.LIZ.LIZLLL = 2;
            doRelease();
            return false;
        }
        if (!C1470530oN1.LIZ(this.mContext)) {
            doRelease();
            putToPool();
            this.mRecycleState = 1;
            return true;
        }
        this.mRecycleState = 3;
        if (resetMediaPlayerForRecycle()) {
            putToPool();
            this.mRecycleState = 2;
            return true;
        }
        doRelease();
        this.mRecycleState = 1;
        return true;
    }

    public void removeFromPool() {
        if (this.mPool.LIZJ(this)) {
            doRelease();
        }
    }

    private void checkKeepAlive() {
        if (C1474810oTv.LLJI().poolKeepAliveMs <= 0) {
            return;
        }
        C786410Ut5.LJLIIL(C1474810oTv.LLJI().poolKeepAliveMs, this.mHandler, new ARunnableS123S0100000_23(this, 50));
    }

    @Override // X.InterfaceC1470660oNE
    public void clearModules() {
        InterfaceC1467950oIr mediaPlayer = getMediaPlayer();
        if (mediaPlayer != null) {
            ((C1470430oMr) mediaPlayer).LIZJ(325, 1);
        }
        if (C1474810oTv.LLJI().enableKernelReuseNullValueCenter) {
            InterfaceC1469660oLc interfaceC1469660oLc = this.mValueCenter;
            if (interfaceC1469660oLc != null) {
                this.mTempForReusePlayer = interfaceC1469660oLc.LJFF();
                this.mValueCenter = null;
            }
            this.mPrepareStartProcessModule = null;
            this.mPauseProcessModule = null;
            this.mReportModule = null;
            this.mReleaseProcessModule = null;
        }
    }

    public void recyclePlugins() {
        InterfaceC1470060oMG interfaceC1470060oMG;
        InterfaceC1470050oMF interfaceC1470050oMF;
        if (C1474810oTv.LLJI().pluginReuseMode == 1) {
            C1470490oMx c1470490oMx = this.mPauseProcessModule;
            if (c1470490oMx != null && (interfaceC1470050oMF = c1470490oMx.LIZJ) != null) {
                interfaceC1470050oMF.recycle();
            }
            C1470500oMy c1470500oMy = this.mReleaseProcessModule;
            if (c1470500oMy == null || (interfaceC1470060oMG = c1470500oMy.LIZJ) == null) {
                return;
            }
            interfaceC1470060oMG.recycle();
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void release() {
        if (getMediaPlayer() == null || !isRecyclable()) {
            doRelease();
        } else {
            recycle();
            recyclePlugins();
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void reset() {
        if (getMediaPlayer() != null) {
            if (C1470530oN1.LIZ(this.mContext)) {
                ((C1470430oMr) getMediaPlayer()).LIZJ(35008, 0);
                ((C1470430oMr) getMediaPlayer()).LIZJ(35009, 0);
            }
            ((C1470430oMr) getMediaPlayer()).reset();
        }
    }

    public boolean resetMediaPlayerForRecycle() {
        InterfaceC1467950oIr mediaPlayer = getMediaPlayer();
        if (mediaPlayer == null) {
            return false;
        }
        unregisterMediaPlayerListener();
        if (((Boolean) C1474810oTv.V1.getValue()).booleanValue()) {
            ((C1470430oMr) mediaPlayer).LIZJ(424, 1);
        }
        C1470430oMr c1470430oMr = (C1470430oMr) mediaPlayer;
        c1470430oMr.LIZJ(35009, 1);
        TTPlayerClient tTPlayerClient = c1470430oMr.LIZ;
        return tTPlayerClient != null && tTPlayerClient.LJJJ() == 0;
    }

    @Override // X.InterfaceC1467090oHT
    public void stop() {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).stop();
        }
        InterfaceC1470740oNM interfaceC1470740oNM = this.mReportModule;
        if (interfaceC1470740oNM != null) {
            C1470470oMv c1470470oMv = (C1470470oMv) interfaceC1470740oNM;
            if (((Boolean) C1474810oTv.f2.getValue()).booleanValue() && c1470470oMv.LIZLLL) {
                AbstractC1469000oKY abstractC1469000oKY = c1470470oMv.LIZIZ;
                if (abstractC1469000oKY instanceof C1468990oKX) {
                    return;
                }
                c1470470oMv.LIZLLL = false;
                InterfaceC1470660oNE interfaceC1470660oNE = abstractC1469000oKY.LIZJ;
                Pair pair = new Pair(C179300mV.LIZ(interfaceC1470660oNE, C179300mV.LIZ), C179300mV.LIZ(interfaceC1470660oNE, C179300mV.LIZIZ));
                Object first = pair.getFirst();
                Object second = pair.getSecond();
                c1470470oMv.LIZIZ.LJII(first, "v_worktime");
                c1470470oMv.LIZIZ.LJII(second, "l_worktime");
            }
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(", ");
        sbLIZ.append(this.mContext.LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void unregisterMediaPlayerListener() {
        InterfaceC1467950oIr mediaPlayer = getMediaPlayer();
        if (mediaPlayer == null) {
            return;
        }
        C1470430oMr c1470430oMr = (C1470430oMr) mediaPlayer;
        c1470430oMr.setOnPreparedListener(null);
        c1470430oMr.setOnInfoListener(null);
        c1470430oMr.LJJIIJ(null);
        c1470430oMr.setOnCompletionListener(null);
        c1470430oMr.setOnErrorListener(null);
        c1470430oMr.LJJIIZI(null);
        c1470430oMr.LJJIJ(null);
        c1470430oMr.LJJIIZ(null);
        c1470430oMr.LJJIIJZLJL(null);
        c1470430oMr.LJJ(null);
    }

    @Override // X.InterfaceC1467090oHT
    public AbstractC1470590oN7 getPlayerContext() {
        return this.mContext;
    }

    @Override // X.InterfaceC1470600oN8
    public int getRecycleState() {
        return this.mRecycleState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TTKPlayerV2(AbstractC1470590oN7 abstractC1470590oN7) {
        final Context contextLIZ = abstractC1470590oN7.LIZ();
        this(abstractC1470590oN7, new AbstractC1469000oKY(contextLIZ) { // from class: X.0oKX
            public final Context LIZLLL;

            @Override // X.AbstractC1469000oKY, X.InterfaceC1469660oLc
            public final InterfaceC1467950oIr LJFF() {
                if (this.LIZ == null) {
                    C1468980oKW c1468980oKW = new C1468980oKW();
                    c1468980oKW.LIZ = this.LIZLLL;
                    this.LIZ = c1468980oKW.LIZ();
                }
                return this.LIZ;
            }

            {
                this.LIZLLL = contextLIZ;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oNJ] */
    public C1470710oNJ getReportLog(int i) {
        InterfaceC1470680oNG interfaceC1470680oNG;
        ?? r1 = new Object() { // from class: X.0oNJ
        };
        C1470510oMz c1470510oMz = this.mPrepareStartProcessModule;
        if (c1470510oMz != null && (interfaceC1470680oNG = c1470510oMz.LIZJ) != null) {
            interfaceC1470680oNG.LIZIZ();
        }
        return r1;
    }

    @Override // X.InterfaceC1470660oNE
    public void play(InterfaceC1470720oNK interfaceC1470720oNK) {
        this.mInstanceCounter.LIZ.putIfAbsent(new C2032207xg<>(this), 1);
        C1470510oMz c1470510oMz = this.mPrepareStartProcessModule;
        if (c1470510oMz != null) {
            InterfaceC1470680oNG interfaceC1470680oNG = c1470510oMz.LIZJ;
            if (interfaceC1470680oNG != null && interfaceC1470720oNK != null) {
                interfaceC1470680oNG.play(interfaceC1470720oNK);
            } else {
                if (c1470510oMz.LIZIZ.LJFF() == null) {
                    return;
                }
                ((C1470430oMr) c1470510oMz.LIZIZ.LJFF()).start();
            }
        }
    }

    @Override // X.InterfaceC1470660oNE
    public void prepare(InterfaceC1470730oNL interfaceC1470730oNL) {
        String strLIZ;
        Map<String, Map<InterfaceC1467090oHT, Long>> map;
        Map<InterfaceC1467090oHT, Long> map2;
        this.mInstanceCounter.LIZ.putIfAbsent(new C2032207xg<>(this), 1);
        C1470510oMz c1470510oMz = this.mPrepareStartProcessModule;
        if (c1470510oMz != null) {
            if (c1470510oMz.LIZ.LIZLLL()) {
                c1470510oMz.LIZ(c1470510oMz.LIZJ);
            }
            InterfaceC1470680oNG interfaceC1470680oNG = c1470510oMz.LIZJ;
            if (interfaceC1470680oNG != null && interfaceC1470730oNL != null) {
                interfaceC1470680oNG.prepare(interfaceC1470730oNL);
            } else if (c1470510oMz.LIZIZ.LJFF() != null) {
                ((C1470430oMr) c1470510oMz.LIZIZ.LJFF()).prepareAsync();
            }
        }
        InterfaceC1470740oNM interfaceC1470740oNM = this.mReportModule;
        if (interfaceC1470740oNM != null) {
            C1470470oMv c1470470oMv = (C1470470oMv) interfaceC1470740oNM;
            if (((Boolean) C1474810oTv.f2.getValue()).booleanValue() && !c1470470oMv.LIZLLL) {
                AbstractC1469000oKY abstractC1469000oKY = c1470470oMv.LIZIZ;
                if (!(abstractC1469000oKY instanceof C1468990oKX)) {
                    c1470470oMv.LIZLLL = true;
                    InterfaceC1470660oNE interfaceC1470660oNE = abstractC1469000oKY.LIZJ;
                    InterfaceC1470070oMH interfaceC1470070oMH = c1470470oMv.LIZJ;
                    if (interfaceC1470070oMH == null || (strLIZ = interfaceC1470070oMH.LIZ()) == null) {
                        strLIZ = "vt";
                    }
                    if (!a0.LJJJIL(strLIZ)) {
                        if (interfaceC1470660oNE.getPlayerContext().LIZLLL()) {
                            map = C179300mV.LIZIZ;
                        } else {
                            map = C179300mV.LIZ;
                        }
                        if (map.get(strLIZ) == null) {
                            map.put(strLIZ, new ConcurrentHashMap());
                        }
                        Map<InterfaceC1467090oHT, Long> map3 = map.get(strLIZ);
                        if ((map3 == null || map3.get(interfaceC1470660oNE) == null) && (map2 = map.get(strLIZ)) != null) {
                            map2.put(interfaceC1470660oNE, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnBufferingUpdateListener(InterfaceC1467800oIc interfaceC1467800oIc) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).LJJIIJ(interfaceC1467800oIc);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnCompletionListener(InterfaceC1470900oNc interfaceC1470900oNc) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).setOnCompletionListener(interfaceC1470900oNc);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnErrorListener(InterfaceC1470910oNd interfaceC1470910oNd) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).setOnErrorListener(interfaceC1470910oNd);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnInfoListener(InterfaceC1470920oNe interfaceC1470920oNe) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).setOnInfoListener(interfaceC1470920oNe);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnPreparedListener(InterfaceC1470930oNf interfaceC1470930oNf) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).setOnPreparedListener(interfaceC1470930oNf);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnSARChangedListener(InterfaceC1467820oIe interfaceC1467820oIe) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).LJJIIZ(interfaceC1467820oIe);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnSeekCompleteListener(InterfaceC1467810oId interfaceC1467810oId) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).LJJIIZI(interfaceC1467810oId);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setOnVideoSizeChangedListener(InterfaceC1470110oML interfaceC1470110oML) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).LJJIJ(interfaceC1470110oML);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1470600oN8
    public void setPool(InterfaceC1470540oN2<? extends InterfaceC1470600oN8> interfaceC1470540oN2) {
        this.mPool = interfaceC1470540oN2;
    }

    @Override // X.InterfaceC1467090oHT
    public void setSurface(Surface surface) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).setSurface(surface);
        }
    }

    public TTKPlayerV2(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        Looper looperMyLooper;
        this.mRecycleState = 1;
        this.mContext = abstractC1470590oN7;
        this.mValueCenter = interfaceC1469660oLc;
        interfaceC1469660oLc.LJI(this);
        this.mPauseProcessModule = new C1470490oMx(this.mContext, this.mValueCenter);
        this.mReleaseProcessModule = new C1470500oMy(this.mContext, this.mValueCenter);
        this.mPrepareStartProcessModule = new C1470510oMz(this.mContext, this.mValueCenter);
        this.mReportModule = new C1470470oMv(this.mContext, this.mValueCenter);
        this.mInstanceCounter = C1470690oNH.LIZ.LJ;
        if (Looper.myLooper() == null) {
            looperMyLooper = Looper.getMainLooper();
        } else {
            looperMyLooper = Looper.myLooper();
        }
        this.mHandler = new BPEAHandler(looperMyLooper);
    }

    public void setDataSource(Context context, Uri uri) {
        if (getMediaPlayer() != null) {
            ((C1470430oMr) getMediaPlayer()).LJIIIIZZ(context, uri);
        }
    }

    @Override // X.InterfaceC1470600oN8
    public void update(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        boolean z;
        int i;
        if (abstractC1470590oN7 != this.mContext) {
            if (abstractC1470590oN7.LIZJ() != this.mContext.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            if (interfaceC1469660oLc != null) {
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                interfaceC1469660oLc.LJII(Integer.valueOf(i), "is_reuse");
            }
        }
        this.mContext = abstractC1470590oN7;
        this.mRecycleState = 1;
        if (interfaceC1469660oLc != null) {
            if (C1470530oN1.LIZ(abstractC1470590oN7) && C1474810oTv.LLJI().enableKernelReuseNullValueCenter) {
                InterfaceC1467950oIr interfaceC1467950oIr = this.mTempForReusePlayer;
                if (interfaceC1467950oIr != null) {
                    interfaceC1469660oLc.LJIIIIZZ(interfaceC1467950oIr);
                    this.mTempForReusePlayer = null;
                }
            } else if (C1470530oN1.LIZ(abstractC1470590oN7) && this.mValueCenter.LJFF() != null) {
                interfaceC1469660oLc.LJIIIIZZ(this.mValueCenter.LJFF());
            }
            this.mValueCenter = interfaceC1469660oLc;
            interfaceC1469660oLc.LJI(this);
        }
        if (C1474810oTv.LLJI().enableKernelReuseNullValueCenter) {
            this.mPauseProcessModule = new C1470490oMx(this.mContext, this.mValueCenter);
            this.mReleaseProcessModule = new C1470500oMy(this.mContext, this.mValueCenter);
            this.mPrepareStartProcessModule = new C1470510oMz(this.mContext, this.mValueCenter);
            this.mReportModule = new C1470470oMv(this.mContext, this.mValueCenter);
        } else {
            this.mPauseProcessModule.LIZIZ(abstractC1470590oN7, interfaceC1469660oLc);
            this.mReleaseProcessModule.LIZIZ(abstractC1470590oN7, interfaceC1469660oLc);
            this.mPrepareStartProcessModule.LIZIZ(abstractC1470590oN7, interfaceC1469660oLc);
            ((C1470470oMv) this.mReportModule).LIZIZ(abstractC1470590oN7, interfaceC1469660oLc);
        }
        this.mHandler.removeCallbacksAndMessages(null);
        refreshHandler();
        InterfaceC1467950oIr mediaPlayer = getMediaPlayer();
        if (mediaPlayer != null && C1470530oN1.LIZ(abstractC1470590oN7)) {
            ((C1470430oMr) mediaPlayer).LIZJ(42732, 1);
        }
    }

    @Override // X.InterfaceC1467090oHT
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        TTPlayerClient tTPlayerClient;
        if (getMediaPlayer() != null && (tTPlayerClient = ((C1470430oMr) getMediaPlayer()).LIZ) != null && uri != null) {
            tTPlayerClient.LJIILJJIL(context, uri);
            if (map != null && map.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(": ");
                    sb.append(entry.getValue());
                    sb.append("\r\n");
                }
                tTPlayerClient.LLJJIII.lock();
                try {
                    if (tTPlayerClient.LJJIJIIJIL()) {
                        tTPlayerClient.LLJJJ.LIZIZ.LJJIJ(20, sb.toString());
                    }
                    tTPlayerClient.LLJJIII.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    tTPlayerClient.LLJJIII.unlock();
                    throw th;
                }
            }
        }
    }
}
