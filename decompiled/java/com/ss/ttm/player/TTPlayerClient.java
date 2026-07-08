package com.ss.ttm.player;

import X.AbstractC1467000oHK;
import X.AbstractC1470440oMs;
import X.AbstractC1470990oNl;
import X.C0X35;
import X.C1285320jYI;
import X.C1467280oHm;
import X.C1470940oNg;
import X.C1471010oNn;
import X.C1471030oNp;
import X.C1472750oQb;
import X.C1698530uIl;
import X.C1698940uJQ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1467800oIc;
import X.InterfaceC1467810oId;
import X.InterfaceC1467820oIe;
import X.InterfaceC1470080oMI;
import X.InterfaceC1470100oMK;
import X.InterfaceC1470110oML;
import X.InterfaceC1470890oNb;
import X.InterfaceC1470900oNc;
import X.InterfaceC1470910oNd;
import X.InterfaceC1470920oNe;
import X.InterfaceC1470930oNf;
import X.InterfaceC1471110oNx;
import X.SurfaceHolderCallbackC1470880oNa;
import Y.ACallableS428S0100000_23;
import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ttm.net.AVResolver;
import com.ss.ttm.player.TTPlayerClient;
import com.tts.oecverify.BdTuring;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes24.dex */
public class TTPlayerClient extends AbstractC1470440oMs implements Handler.Callback, InterfaceC1470890oNb {
    public static final /* synthetic */ int LLLI = 0;
    public InterfaceC1470080oMI LL;
    public SurfaceHolder LLILLJJLI;
    public Surface LLILLL;
    public Surface LLILZ;
    public Context LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public final SurfaceHolderCallbackC1470880oNa LLJI;
    public boolean LLJIJIL;
    public volatile boolean LLJILJIL;
    public final ReentrantReadWriteLock.ReadLock LLJJIII;
    public final ReentrantReadWriteLock.WriteLock LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1470940oNg LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public final StringBuilder LLJJJJJIL;
    public int LLJJJJLIIL;
    public BPEAHandler LLJJL;
    public InterfaceC1470920oNe LLJJLIIIJLLLLLLLZ;
    public InterfaceC1470910oNd LLJL;
    public InterfaceC1470930oNf LLJLIL;
    public InterfaceC1470900oNc LLJLILLLLZIIL;
    public InterfaceC1470100oMK LLJLL;
    public InterfaceC1467810oId LLJLLIL;
    public InterfaceC1467800oIc LLJLLL;
    public InterfaceC1470110oML LLJZ;
    public InterfaceC1467820oIe LLJZIJLIL;
    public final HashMap<Integer, Integer> LLL;
    public boolean LLLF;
    public int LLLFF;
    public volatile int LLLFFI;
    public C1471010oNn LLLFZ;
    public boolean LLIZLLLIL = true;
    public final LinkedList<String> LLJ = new LinkedList<>();
    public int LLJILJILJ = -1;
    public final Object LLJILLL = new Object();
    public final ReentrantLock LLJJ = new ReentrantLock();
    public final ReentrantLock LLJJI = new ReentrantLock();

    public static void initNativeCpuManager() {
        TTPlayer._initCpuManager();
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIJJI() {
        LJJJJLI(false);
        LJJJJZ();
        this.LLJJIJI.lock();
        try {
            C1470940oNg c1470940oNg = this.LLJJJ;
            this.LLJJJ = null;
            this.LLJILJILJ = -1;
            this.LLJJIJI.unlock();
            if (c1470940oNg != null) {
                TTPlayer tTPlayer = c1470940oNg.LIZIZ;
                c1470940oNg.LIZIZ = null;
                tTPlayer.LJIILJJIL();
            }
            SurfaceHolder surfaceHolder = this.LLILLJJLI;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.LLJI);
                this.LLILLJJLI = null;
                this.LLJILJIL = true;
            }
            synchronized (this.LLJILLL) {
                try {
                    BPEAHandler bPEAHandler = this.LLJJL;
                    if (bPEAHandler != null) {
                        bPEAHandler.removeCallbacksAndMessages(null);
                        this.LLJJL = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLILZIL = null;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLJJIJI.unlock();
            throw th2;
        }
    }

    public final void LJJIL() {
        this.LLJILJIL = true;
        SurfaceHolder surfaceHolder = this.LLILLJJLI;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.LLJI);
        }
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJIIL();
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJIZ() {
        this.LLJILJIL = true;
        SurfaceHolder surfaceHolder = this.LLILLJJLI;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.LLJI);
        }
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJIIL();
            }
            this.LLJJIII.unlock();
            new BPEAThread(new ARunnableS123S0100000_23(this, 49)).start();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LIZ() {
        this.LLJJIII.lock();
        try {
            int iLIZJ = LJJIJIIJIL() ? this.LLJJJ.LIZJ(2, 0) : 0;
            this.LLJJIII.unlock();
            return iLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LIZIZ() {
        this.LLJJIII.lock();
        try {
            int iLIZJ = LJJIJIIJIL() ? this.LLJJJ.LIZJ(1, 0) : 0;
            this.LLJJIII.unlock();
            return iLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LJFF() {
        int i;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.getClass();
                i = 1;
            } else {
                i = 0;
            }
            this.LLJJIII.unlock();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LJI() {
        this.LLJJIII.lock();
        try {
            int iLIZJ = LJJIJIIJIL() ? this.LLJJJ.LIZJ(4, 0) : 0;
            this.LLJJIII.unlock();
            return iLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LJII() {
        this.LLJJIII.lock();
        try {
            int iLIZJ = LJJIJIIJIL() ? this.LLJJJ.LIZJ(3, 0) : 0;
            this.LLJJIII.unlock();
            return iLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final boolean LJIIIIZZ() {
        this.LLJJIII.lock();
        try {
            boolean z = false;
            if (LJJIJIIJIL()) {
                if (this.LLJJJ.LIZJ(6, 0) == 1) {
                    z = true;
                }
            }
            this.LLJJIII.unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIIZ() {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJIIJ();
            }
            this.LLJJIII.unlock();
            LJJJJLI(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIJ() {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJIJIIJIL = 0;
                this.LLJ.clear();
                if (this.LLJILJIL) {
                    SurfaceHolder surfaceHolder = this.LLILLJJLI;
                    if (surfaceHolder != null) {
                        this.LLJJJ.LJII(surfaceHolder.getSurface());
                    }
                    this.LLJILJIL = false;
                }
                this.LLLFFI = 0;
                this.LLLFF = 0;
                this.LLJJJ.LIZIZ.LJIIJJI();
                LJJJJLL();
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJI() {
        if (!this.LLIZ) {
            if (this.LLILLJJLI == null) {
                C1285320jYI.LIZLLL(this, "TTPlayerClient", "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.LLIZ = true;
            LJJJJZ();
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIIJ() {
        if (C1472750oQb.LJFF) {
            C0X35.LJIIJJI("player_prerender_duration_after_tryplay", true);
            C0X35.LJIIJJI("player_prerender_real_duration", true);
            C0X35.LJIIJJI("cold_boot_start_to_prepared_end", true);
            C0X35.LJIIJJI("player_prerender_to_onprepared", true);
            C0X35.LIZ("player_prerender_onprepared_to_renderstart", true);
            C0X35.LIZ("player_prerender_onprepared_to_setsurface", true);
            C0X35.LIZ("player_prerender_onprepared_to_first_frame", true);
            C1472750oQb.LJFF = false;
        }
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJJI();
                LJJJJLL();
                this.LLJJIJIL = this.LLJJJ.LIZJ(800, 0);
            }
            this.LLJJIII.unlock();
            LJJJJLI(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIIJZLJL() {
        SurfaceHolder surfaceHolder;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                if (this.LLLF && this.LLLFZ.LIZJ == 1 && (surfaceHolder = this.LLILLJJLI) != null) {
                    surfaceHolder.removeCallback(this.LLJI);
                    this.LLILLJJLI = null;
                    this.LLJJJ.LJII(null);
                    this.LLLF = false;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("testlog: mConnected Cpu ");
                    sbLIZ.append(this.LLLF);
                    C1285320jYI.LIZLLL(this, "TTPlayerClient", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LLJJJ.LIZIZ.LJJJIL();
            }
            this.LLJJIII.unlock();
            LJJJJLI(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final int LJJIIZI() {
        this.LLJJIII.lock();
        try {
            int iLIZJ = LJJIJIIJIL() ? this.LLJJJ.LIZJ(11, 0) : 0;
            this.LLJJIII.unlock();
            return iLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final boolean LJJIJIIJI() {
        this.LLJJIII.lock();
        try {
            boolean z = false;
            if (LJJIJIIJIL()) {
                if (this.LLJJJ.LIZJ(12, 0) == 1) {
                    z = true;
                }
            }
            this.LLJJIII.unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final boolean LJJIJIIJIL() {
        C1470940oNg c1470940oNg = this.LLJJJ;
        return (c1470940oNg == null || c1470940oNg.LIZIZ == null) ? false : true;
    }

    public final int LJJJ() {
        this.LLJJIII.lock();
        int i = -1;
        try {
            try {
                if (LJJIJIIJIL()) {
                    int iLJIILL = this.LLJJJ.LIZIZ.LJIILL();
                    SurfaceHolder surfaceHolder = this.LLILLJJLI;
                    if (surfaceHolder != null && this.LLLFZ.LIZJ == 0) {
                        this.LLJJJ.LJII(surfaceHolder.getSurface());
                    }
                    if (this.LLLFF == 1) {
                        this.LLLFZ = new C1471010oNn();
                        synchronized (this.LLJILLL) {
                            try {
                                this.LLJJL.removeCallbacksAndMessages(null);
                                if (this.LLLFFI == 1) {
                                    LJJIJLIJ(-1, 77, -1, null);
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } else {
                        this.LLJJL.removeCallbacksAndMessages(null);
                    }
                    this.LLJJIJIIJIL = 0;
                    this.LLJ.clear();
                    LJJJJLL();
                    i = iLJIILL;
                } else {
                    i = 0;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset exception");
                sbLIZ.append(e);
                C1285320jYI.LIZLLL(null, "TTPlayerClient", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLJJIII.unlock();
            return i;
        } catch (Throwable th) {
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJJJI() {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.getClass();
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJJJLL() {
        try {
            this.LLJJ.lock();
            this.LLJILJILJ = this.LLJJJ.LIZIZ.LIZLLL(35, -1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reset.mPlayLifeId");
            sbLIZ.append(this.LLJILJILJ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLJJ.isLocked()) {
                this.LLJJ.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLJJ.isLocked()) {
                this.LLJJ.unlock();
            }
            throw th;
        }
    }

    public final void LJJJJZ() {
        SurfaceHolder surfaceHolder = this.LLILLJJLI;
        if (surfaceHolder == null || this.LLLFZ.LIZ != 0) {
            return;
        }
        surfaceHolder.setKeepScreenOn(this.LLIZ && this.LLJIJIL);
    }

    public void setupMediaCodec() {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIZ();
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    static {
        TTVersion.LIZ();
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIIL() {
        LJJJ();
    }

    public static long getDemuxerFactory(int i) {
        return TTPlayer._getDemuxerFactory(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    @Override // X.AbstractC1470440oMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(int r14) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.LJ(int):java.lang.String");
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIILIIL(int i) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLIZLLLIL = false;
                this.LLJJJ.LIZIZ.LJIILLIIL(i);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIILLIIL(boolean z) {
        int i;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                C1470940oNg c1470940oNg = this.LLJJJ;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1470940oNg.getClass();
                try {
                    c1470940oNg.LIZIZ.LJJII(12, i);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJ(boolean z) {
        int i;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                C1470940oNg c1470940oNg = this.LLJJJ;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1470940oNg.LIZIZ.LJJIIJZLJL(i);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJI(InterfaceC1470900oNc interfaceC1470900oNc) {
        this.LLJLILLLLZIIL = interfaceC1470900oNc;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LJFF(13L);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJJ(InterfaceC1470910oNd interfaceC1470910oNd) {
        this.LLJL = interfaceC1470910oNd;
        long[] jArr = {0, 45};
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                int i = 0;
                do {
                    this.LLJJJ.LJFF(jArr[i]);
                    i++;
                } while (i < 2);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIJJLI(InterfaceC1470920oNe interfaceC1470920oNe) {
        this.LLJJLIIIJLLLLLLLZ = interfaceC1470920oNe;
        long[] jArr = {1, 4, 5, 7, 8, 9, 10, 21, 22, 20, 24, 25, 26, 28, 27, 29, 32, 34, 35, 36, 37, 38, 39, 41, 42, 50, 49, 47, 51, 52, 53, 54, 30, 57, 58, 60, 61, 62, 65, 66, 67, 70, 71, 72, 97, 73, 82, 84, 85, 86, 87, 88, 90, 103, 91, 92, 77, 104, 98, 99, 100, 101, 102};
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                int i = 0;
                do {
                    this.LLJJJ.LJFF(jArr[i]);
                    i++;
                } while (i < 63);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIL(InterfaceC1470930oNf interfaceC1470930oNf) {
        this.LLJLIL = interfaceC1470930oNf;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LJFF(2L);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJ(s sVar) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL() && sVar != null) {
                float f = sVar.LIZLLL;
                if (f != -1.0f) {
                    this.LLJJJ.LIZIZ.LJJI(f, 60);
                }
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJII(Surface surface) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLILLL = surface;
                this.LLJJJ.LJII(surface);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJJI(int i) {
        try {
            this.LLJJ.lock();
            InterfaceC1470900oNc interfaceC1470900oNc = this.LLJLILLLLZIIL;
            if (interfaceC1470900oNc != null && i >= this.LLJILJILJ) {
                interfaceC1470900oNc.LIZ(this.LL);
            }
            if (this.LLJJ.isLocked()) {
                this.LLJJ.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLJJ.isLocked()) {
                this.LLJJ.unlock();
            }
            throw th;
        }
    }

    public final void LJJJJ(int i) {
        InterfaceC1467810oId interfaceC1467810oId;
        AbstractC1467000oHK abstractC1467000oHK;
        if (!this.LLIZLLLIL && (interfaceC1467810oId = this.LLJLLIL) != null) {
            this.LLIZLLLIL = true;
            if (i >= this.LLJILJILJ && (abstractC1467000oHK = ((C1467280oHm) interfaceC1467810oId).LIZ.get()) != null) {
                abstractC1467000oHK.LJJJJI();
            }
        }
    }

    public final void LJJJJIZL(FileDescriptor fileDescriptor) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            C1470940oNg c1470940oNg = this.LLJJJ;
            if (c1470940oNg != null) {
                c1470940oNg.LIZIZ.LJJ(parcelFileDescriptorDup.getFd());
            } else if (parcelFileDescriptorDup == null) {
                return;
            }
            parcelFileDescriptorDup.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (parcelFileDescriptorDup != null) {
                parcelFileDescriptorDup.close();
            }
            throw th;
        }
    }

    public final void LJJJJJ(SurfaceHolder surfaceHolder) {
        Surface surface;
        SurfaceHolder surfaceHolder2;
        if (this.LLLFZ.LIZJ != 0 && (surfaceHolder2 = this.LLILLJJLI) == surfaceHolder && surfaceHolder2 != null) {
            return;
        }
        SurfaceHolder surfaceHolder3 = this.LLILLJJLI;
        if (surfaceHolder3 != null) {
            surfaceHolder3.removeCallback(this.LLJI);
        }
        this.LLILLJJLI = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.LLJI);
            surface = this.LLILLJJLI.getSurface();
        } else {
            surface = null;
        }
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LJII(surface);
            }
            this.LLJJIII.unlock();
            LJJJJZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJJJL(C1698530uIl c1698530uIl) {
        this.LLJLL = c1698530uIl;
        long[] jArr = {63, 59, 19, 33, 40, 43, 44, 68, 89, 94, 95, 101, 102, 105};
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                int i = 0;
                do {
                    this.LLJJJ.LJFF(jArr[i]);
                    i++;
                } while (i < 14);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJJJLI(boolean z) {
        this.LLJIJIL = z;
        LJJJJZ();
    }

    public Object getObjectOption(int i) {
        Object objLJFF;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                objLJFF = this.LLJJJ.LIZIZ.LJFF(i);
            } else {
                objLJFF = null;
            }
            this.LLJJIII.unlock();
            return objLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public String getSubtitleContent(int i) {
        String strLJIIIIZZ;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                strLJIIIIZZ = this.LLJJJ.LIZIZ.LJIIIIZZ(i);
            } else {
                strLJIIIIZZ = null;
            }
            this.LLJJIII.unlock();
            return strLJIIIIZZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        if (message.what != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleMessage send message prev.thread id:, ");
            sbLIZ.append(C786410Ut5.u3().getId());
            sbLIZ.append(", what: ");
            sbLIZ.append(message.what);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        int i = message.arg2;
        int i2 = message.what;
        int i3 = message.arg1;
        if (HandlerHook.getMessageObj(message.obj) instanceof String) {
            str = (String) HandlerHook.getMessageObj(message.obj);
        } else {
            str = null;
        }
        LJJIJ(i, i2, i3, str);
        if (message.what != 3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleMessage send message after.thread id:");
            sbLIZ2.append(C786410Ut5.u3().getId());
            sbLIZ2.append(", what: ");
            sbLIZ2.append(message.what);
            C2188811AlT.LIZIZ(sbLIZ2);
            return true;
        }
        return true;
    }

    public void setABRStrategy(ABRStrategy aBRStrategy) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJIJ(aBRStrategy);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setAIBarrageInfo(MaskInfo maskInfo) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJIJI(maskInfo);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJIJJ(audioProcessor);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setLoadControl(LoadControl loadControl) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIII(loadControl);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setMaskInfo(MaskInfo maskInfo) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIIZ(maskInfo);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setNetworkService(InterfaceC1471110oNx interfaceC1471110oNx) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.getClass();
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setSubInfo(SubInfo subInfo) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIJIIJI(subInfo);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0oNa] */
    public TTPlayerClient(Context context, HashMap<Integer, Integer> map) {
        this.LLJILJIL = false;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LLJJIII = reentrantReadWriteLock.readLock();
        this.LLJJIJI = reentrantReadWriteLock.writeLock();
        this.LLJJIJIIJIL = 0;
        this.LLJJIJIL = 0;
        this.LLJJJJJIL = new StringBuilder(1024);
        this.LLJJJJLIIL = -1;
        this.LLL = null;
        this.LLLF = false;
        this.LLLFF = 0;
        this.LLLFFI = 0;
        this.LLLFZ = new C1471010oNn();
        this.LLL = map;
        this.LLJILJIL = false;
        this.LLJI = new SurfaceHolder.Callback(this) { // from class: X.0oNa
            public final InterfaceC1470890oNb LL;

            {
                this.LL = this;
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                InterfaceC1470890oNb interfaceC1470890oNb = this.LL;
                if (interfaceC1470890oNb != null) {
                    TTPlayerClient tTPlayerClient = (TTPlayerClient) interfaceC1470890oNb;
                    tTPlayerClient.LLILLJJLI = surfaceHolder;
                    if (!tTPlayerClient.LLJILJIL && tTPlayerClient.LLLFZ.LIZLLL != 1) {
                        tTPlayerClient.LLJJIII.lock();
                        try {
                            if (tTPlayerClient.LJJIJIIJIL()) {
                                SurfaceHolder surfaceHolder2 = tTPlayerClient.LLILLJJLI;
                                if (surfaceHolder != surfaceHolder2) {
                                    if (surfaceHolder2 != null) {
                                        surfaceHolder2.removeCallback(tTPlayerClient.LLJI);
                                    }
                                    tTPlayerClient.LLILLJJLI = surfaceHolder;
                                    if (surfaceHolder != null) {
                                        surfaceHolder.addCallback(tTPlayerClient.LLJI);
                                    }
                                }
                                tTPlayerClient.LLJJJ.LJII(surfaceHolder.getSurface());
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

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Future futureSubmit;
                InterfaceC1470890oNb interfaceC1470890oNb = this.LL;
                if (interfaceC1470890oNb != null) {
                    TTPlayerClient tTPlayerClient = (TTPlayerClient) interfaceC1470890oNb;
                    if (!tTPlayerClient.LLJILJIL) {
                        if (tTPlayerClient.LLLFZ.LIZIZ > 0) {
                            ACallableS428S0100000_23 aCallableS428S0100000_23 = new ACallableS428S0100000_23(tTPlayerClient, 5);
                            synchronized (C1471820oP6.class) {
                                futureSubmit = C1471820oP6.LIZIZ().submit(aCallableS428S0100000_23);
                            }
                            try {
                                futureSubmit.get(tTPlayerClient.LLLFZ.LIZIZ, TimeUnit.MILLISECONDS);
                                return;
                            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1285320jYI.LIZ(tTPlayerClient, "TTPlayerClient", "set surface time out");
                                return;
                            }
                        }
                        tTPlayerClient.LLJJIII.lock();
                        try {
                            if (tTPlayerClient.LJJIJIIJIL()) {
                                tTPlayerClient.LLJJJ.LJII(null);
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

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                InterfaceC1470890oNb interfaceC1470890oNb = this.LL;
                if (interfaceC1470890oNb != null) {
                    interfaceC1470890oNb.getClass();
                }
            }
        };
        this.LLILZIL = context;
        if (Looper.myLooper() != null) {
            this.LLJJL = new BPEAHandler(this);
        } else {
            this.LLJJL = new BPEAHandler(Looper.getMainLooper(), this);
        }
    }

    public static synchronized TTPlayerClient create(InterfaceC1470080oMI interfaceC1470080oMI, Context context) {
        return create(interfaceC1470080oMI, context, null);
    }

    public static void setGlobalIntOptionForKey(int i, int i2) {
        if (i != 1015) {
            if (i != 1016) {
                if (i != 1356) {
                    if (i != 1365) {
                        if (i != 1388) {
                            if (i != 1390) {
                                if (i != 4316) {
                                    if (i != 1380) {
                                        if (i != 1381) {
                                            if (i != 4329) {
                                                if (i != 4330) {
                                                    switch (i) {
                                                        case 1306:
                                                            x.LJI(44, i2);
                                                            break;
                                                        case 1307:
                                                            x.LJI(45, i2);
                                                            break;
                                                        case 1308:
                                                            x.LJI(47, i2);
                                                            break;
                                                        case 1309:
                                                            x.LJI(51, i2);
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 1367:
                                                                    x.LJI(49, i2);
                                                                    break;
                                                                case 1368:
                                                                    x.LJI(50, i2);
                                                                    break;
                                                                case 1369:
                                                                    x.LJI(53, i2);
                                                                    break;
                                                                case 1370:
                                                                    x.LJI(54, i2);
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 1372:
                                                                            x.LJI(52, i2);
                                                                            break;
                                                                        case 1373:
                                                                            x.LJI(57, i2);
                                                                            break;
                                                                        case 1374:
                                                                            x.LJI(55, i2);
                                                                            break;
                                                                        case 1375:
                                                                            x.LJI(56, i2);
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 1392:
                                                                                    x.LJI(71, i2);
                                                                                    break;
                                                                                case 1393:
                                                                                    x.LJI(1393, i2);
                                                                                    break;
                                                                                case 1394:
                                                                                    x.LJI(1394, i2);
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 1396:
                                                                                            x.LJI(1396, i2);
                                                                                            break;
                                                                                        case 1397:
                                                                                            x.LJI(72, i2);
                                                                                            break;
                                                                                        case 1398:
                                                                                            x.LJI(1398, i2);
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    C1471030oNp.LIZ.LIZLLL(2, i2);
                                                }
                                            } else {
                                                C1471030oNp.LIZ.LIZLLL(1, i2);
                                            }
                                        } else {
                                            x.LJI(68, i2);
                                        }
                                    } else {
                                        x.LJI(62, i2);
                                    }
                                } else if (i2 >= 1 && i2 <= 5) {
                                    DummySurface.LIZ(i2, 1, true);
                                }
                            } else {
                                x.LJI(1390, i2);
                            }
                        } else {
                            x.LJI(69, i2);
                        }
                    } else {
                        x.LJI(48, i2);
                    }
                } else {
                    x.LJI(46, i2);
                }
            } else {
                x.LJI(32, i2);
            }
        } else {
            x.LJI(31, i2);
        }
        if (C1470940oNg.LJI) {
            TTPlayer._setGlobalIntForKey(i, i2);
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LIZJ(int i, int i2) {
        if (i == 5000) {
            return this.LLJJIJIIJIL;
        }
        if (i == 26) {
            return this.LLJJJJLIIL;
        }
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                i2 = this.LLJJJ.LIZJ(i, i2);
            }
            this.LLJJIII.unlock();
            return i2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final long LIZLLL(int i, long j) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                j = this.LLJJJ.LIZIZ.LJ(i, j);
            }
            this.LLJJIII.unlock();
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:37:0x008e, B:39:0x0094), top: B:46:0x008e }] */
    @Override // X.AbstractC1470440oMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.content.Context r4, android.net.Uri r5) throws java.io.IOException {
        /*
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r1 = r5.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            java.lang.String r1 = "settings"
            java.lang.String r0 = r5.getAuthority()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2d
            int r0 = android.media.RingtoneManager.getDefaultType(r5)
            android.net.Uri r5 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r4, r0)
            if (r5 != 0) goto L2d
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r0 = "Can't resolve default ringtone"
            r1.<init>(r0)
            throw r1
        L2d:
            r2 = 0
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch: java.io.IOException -> L46 java.lang.SecurityException -> L4d java.lang.Throwable -> L52
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = X.C09NT.LIZIZ(r1, r5, r0)     // Catch: java.io.IOException -> L46 java.lang.SecurityException -> L4d java.lang.Throwable -> L52
            if (r2 != 0) goto L3b
            return
        L3b:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.io.IOException -> L46 java.lang.SecurityException -> L4d java.lang.Throwable -> L52
            r3.LJJJJIZL(r0)     // Catch: java.io.IOException -> L46 java.lang.SecurityException -> L4d java.lang.Throwable -> L52
            r2.close()
            return
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L61
            goto L5e
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L52
            goto L5c
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L5b
            r2.close()
        L5b:
            throw r0
        L5c:
            if (r2 == 0) goto L61
        L5e:
            r2.close()
        L61:
            java.lang.String r2 = r5.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r2.toLowerCase(r0)
            java.lang.String r0 = "://"
            int r0 = r1.indexOf(r0)
            if (r0 > 0) goto L8b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "file://"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.LLILZLL = r0
        L85:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.LLJJIII
            r0.lock()
            goto L8e
        L8b:
            r3.LLILZLL = r2
            goto L85
        L8e:
            boolean r0 = r3.LJJIJIIJIL()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9d
            X.0oNg r0 = r3.LLJJJ     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r3.LLILZLL     // Catch: java.lang.Throwable -> La3
            com.ss.ttm.player.TTPlayer r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> La3
            r0.LJIL(r1)     // Catch: java.lang.Throwable -> La3
        L9d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.LLJJIII
            r0.unlock()
            return
        La3:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.LLJJIII
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.LJIILJJIL(android.content.Context, android.net.Uri):void");
    }

    @Override // X.AbstractC1470440oMs
    public final void LJIILL(int i, int i2) {
        if (i == 1301) {
            if (Looper.myLooper() != null) {
                this.LLJJL = new BPEAHandler(this);
                return;
            } else {
                this.LLJJL = new BPEAHandler(Looper.getMainLooper(), this);
                return;
            }
        }
        if (i == 41) {
            AVResolver.LJFF = i2;
            return;
        }
        if (i == 5003) {
            this.LLLFZ.LIZ = i2;
            return;
        }
        if (i == 952) {
            this.LLLFZ.LIZIZ = i2;
            return;
        }
        if (i == 1007) {
            this.LLLFZ.LIZJ = i2;
        } else if (i == 1036) {
            this.LLLFZ.LIZLLL = i2;
        } else if (i == 984) {
            if (i2 == 0) {
                i2 = 0;
            } else if (i2 == 1) {
                i2 = 16777216;
            } else if (i2 == 2) {
                i2 = 33554432;
            } else if (i2 != 3 && i2 != 4) {
                if (i2 == 5) {
                    i2 = 50331648;
                } else if (i2 == 6) {
                    i2 = 67108864;
                }
            } else {
                i2 = 34603008;
            }
            C1285320jYI.LJFF = i2;
        } else if (i == 1501) {
            C1285320jYI.LJFF = i2;
        } else if (i == 1513) {
            this.LLLFZ.LJ = i2;
        } else if (i == 1514) {
            this.LLLFZ.LJFF = i2;
        } else if (i == 4012) {
            this.LLLFZ.LJI = i2;
        } else if (i == 48) {
            this.LLLFZ.LJII = i2;
        } else if (i == 1978) {
            if (i2 == 1) {
                i = 48;
                i2 = 2;
            } else {
                i2 = this.LLLFZ.LJII;
                i = 48;
            }
        } else if (i == 35009) {
            this.LLLFF = i2;
        }
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                C1470940oNg c1470940oNg = this.LLJJJ;
                c1470940oNg.getClass();
                try {
                    c1470940oNg.LIZIZ.LJJII(i, i2);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final int LJIIZILJ(int i, long j) {
        int iLJJIIJ;
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                iLJJIIJ = this.LLJJJ.LIZIZ.LJJIIJ(i, j);
            } else {
                iLJJIIJ = -1;
            }
            this.LLJJIII.unlock();
            return iLJJIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIFFI(int i, String str) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIJ(i, str);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1470440oMs
    public final void LJJIII(float f, float f2) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIL(f, f2);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final float LJJIIZ(float f, int i) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                f = this.LLJJJ.LIZIZ.LIZJ(f, i);
            }
            this.LLJJIII.unlock();
            return f;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public final void LJJIJIL(int i, int i2) {
        int i3;
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        if (i != 4) {
            if (i != 5) {
                if (i != 41) {
                    if (i != 42) {
                        if (i != 57) {
                            if (i != 58) {
                                switch (i) {
                                    case 7:
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("handleNotify --------------->>>>>>info rendering start:what:");
                                        sbLIZ.append(i);
                                        sbLIZ.append("");
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        i3 = 3;
                                        break;
                                    case 8:
                                        i3 = 801;
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        i3 = 802;
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        i3 = 901;
                                        break;
                                    default:
                                        switch (i) {
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                i3 = 251658243;
                                                break;
                                            case 21:
                                                i3 = 251658244;
                                                break;
                                            case 22:
                                                i3 = 251658245;
                                                break;
                                            case 23:
                                                i3 = 251658246;
                                                break;
                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                i3 = 251658247;
                                                break;
                                            case 25:
                                                i3 = 251658248;
                                                break;
                                            case 26:
                                                i3 = 251658249;
                                                break;
                                            case 27:
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("handleNotify --------------->>>>>>info video render stall:what:");
                                                sbLIZ2.append(i);
                                                sbLIZ2.append("");
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                                i3 = 251658250;
                                                break;
                                            case 28:
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("handleNotify --------------->>>>>>info audio render stall:what:");
                                                sbLIZ3.append(i);
                                                sbLIZ3.append("");
                                                C2188811AlT.LIZIZ(sbLIZ3);
                                                i3 = 251658251;
                                                break;
                                            case 29:
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("handleNotify --------------->>>>>>info audio rendering start:what:");
                                                sbLIZ4.append(i);
                                                sbLIZ4.append("");
                                                C2188811AlT.LIZIZ(sbLIZ4);
                                                i3 = 251658252;
                                                break;
                                            case 30:
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("handleNotify --------------->>>>>>info ready for display:what:");
                                                sbLIZ5.append(i);
                                                sbLIZ5.append("");
                                                C2188811AlT.LIZIZ(sbLIZ5);
                                                i3 = -268435390;
                                                break;
                                            case 32:
                                                i3 = 251658253;
                                                break;
                                            case 47:
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("handleNotify --------------->>>>>>info preBuffering  start:what:");
                                                sbLIZ6.append(i);
                                                sbLIZ6.append("");
                                                C2188811AlT.LIZIZ(sbLIZ6);
                                                i3 = -268435408;
                                                break;
                                            case 77:
                                                i3 = -268435368;
                                                break;
                                            case 82:
                                                i3 = 82;
                                                break;
                                            case 84:
                                                i3 = -268435383;
                                                break;
                                            case 85:
                                                i3 = -268435376;
                                                break;
                                            case 86:
                                                i3 = -268435375;
                                                break;
                                            case 87:
                                                i3 = -268435374;
                                                break;
                                            case 88:
                                                i3 = -268435373;
                                                break;
                                            case 90:
                                                i3 = -268435372;
                                                break;
                                            case 91:
                                                i3 = -268435371;
                                                break;
                                            case 92:
                                                i3 = -268435370;
                                                break;
                                            case 97:
                                                i3 = -268435369;
                                                break;
                                            case 98:
                                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                sbLIZ7.append("[AudioDucking] handleNotify --------------->>>>>>info audio ducking started:what:");
                                                sbLIZ7.append(i);
                                                sbLIZ7.append(" parameter:");
                                                sbLIZ7.append(i2);
                                                C2188811AlT.LIZIZ(sbLIZ7);
                                                i3 = -268435367;
                                                break;
                                            case 99:
                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                sbLIZ8.append("[AudioDucking] handleNotify --------------->>>>>>info audio ducking read empty:what:");
                                                sbLIZ8.append(i);
                                                sbLIZ8.append(" parameter:");
                                                sbLIZ8.append(i2);
                                                C2188811AlT.LIZIZ(sbLIZ8);
                                                i3 = -268435366;
                                                break;
                                            case 100:
                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                sbLIZ9.append("[AudioDucking] handleNotify --------------->>>>>>info audio ducking stopped:what:");
                                                sbLIZ9.append(i);
                                                sbLIZ9.append(" parameter:");
                                                sbLIZ9.append(i2);
                                                C2188811AlT.LIZIZ(sbLIZ9);
                                                i3 = -268435365;
                                                break;
                                            case 101:
                                                i3 = 101;
                                                break;
                                            case 102:
                                                i3 = 102;
                                                break;
                                            case 103:
                                                i3 = -268435364;
                                                break;
                                            case 104:
                                                i3 = -268435363;
                                                break;
                                            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                                i3 = 16777217;
                                                break;
                                            default:
                                                switch (i) {
                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                        sbLIZ10.append("handleNotify --------------->>>>>>info video demuxer stall:what:");
                                                        sbLIZ10.append(i);
                                                        sbLIZ10.append("");
                                                        C2188811AlT.LIZIZ(sbLIZ10);
                                                        i3 = -268435442;
                                                        break;
                                                    case 35:
                                                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                        sbLIZ11.append("handleNotify --------------->>>>>>info audio demuxer stall:what:");
                                                        sbLIZ11.append(i);
                                                        sbLIZ11.append("");
                                                        C2188811AlT.LIZIZ(sbLIZ11);
                                                        i3 = -268435441;
                                                        break;
                                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                                        sbLIZ12.append("handleNotify --------------->>>>>>info video decode stall:what:");
                                                        sbLIZ12.append(i);
                                                        sbLIZ12.append("");
                                                        C2188811AlT.LIZIZ(sbLIZ12);
                                                        i3 = -268435440;
                                                        break;
                                                    case 37:
                                                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                                        sbLIZ13.append("handleNotify --------------->>>>>>info audio decode stall:what:");
                                                        sbLIZ13.append(i);
                                                        sbLIZ13.append("");
                                                        C2188811AlT.LIZIZ(sbLIZ13);
                                                        i3 = -268435439;
                                                        break;
                                                    case 38:
                                                        i3 = -268435438;
                                                        break;
                                                    case 39:
                                                        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                                        sbLIZ14.append("handleNotify --------------->>>>>>info audio pts back:what:");
                                                        sbLIZ14.append(i);
                                                        sbLIZ14.append("");
                                                        C2188811AlT.LIZIZ(sbLIZ14);
                                                        i3 = -268435437;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 49:
                                                                i3 = -268435392;
                                                                break;
                                                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                                i3 = -268435391;
                                                                break;
                                                            case 51:
                                                                i3 = -268435407;
                                                                break;
                                                            case 52:
                                                                i3 = -268435406;
                                                                break;
                                                            case 53:
                                                                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                                                sbLIZ15.append("handleNotify --------------->>>>>>formater start:what:");
                                                                sbLIZ15.append(i);
                                                                sbLIZ15.append("");
                                                                C2188811AlT.LIZIZ(sbLIZ15);
                                                                i3 = -268435405;
                                                                break;
                                                            case 54:
                                                                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                                                sbLIZ16.append("handleNotify --------------->>>>>>decoder start:what:");
                                                                sbLIZ16.append(i);
                                                                sbLIZ16.append("");
                                                                C2188811AlT.LIZIZ(sbLIZ16);
                                                                i3 = -268435404;
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 60:
                                                                        i3 = -268435400;
                                                                        break;
                                                                    case 61:
                                                                        i3 = -268435401;
                                                                        break;
                                                                    case BaseNotice.CREATOR /* 62 */:
                                                                        i3 = -268435436;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 65:
                                                                                i3 = -268435435;
                                                                                break;
                                                                            case 66:
                                                                                i3 = -268435434;
                                                                                break;
                                                                            case 67:
                                                                                i3 = -268435389;
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 70:
                                                                                        i3 = -268435388;
                                                                                        break;
                                                                                    case 71:
                                                                                        i3 = -268435387;
                                                                                        break;
                                                                                    case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                                                                        i3 = -268435386;
                                                                                        break;
                                                                                    case 73:
                                                                                        i3 = -268435385;
                                                                                        break;
                                                                                    default:
                                                                                        i3 = -1;
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                i3 = -268435402;
                            }
                        } else {
                            i3 = -268435403;
                        }
                    } else {
                        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                        sbLIZ17.append("handleNotify --------------->>>>>>info rtc audio decode stall:what:");
                        sbLIZ17.append(i);
                        sbLIZ17.append("");
                        C2188811AlT.LIZIZ(sbLIZ17);
                        i3 = -268435423;
                    }
                } else {
                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                    sbLIZ18.append("handleNotify --------------->>>>>>info rtc video decode stall:what:");
                    sbLIZ18.append(i);
                    sbLIZ18.append("");
                    C2188811AlT.LIZIZ(sbLIZ18);
                    i3 = -268435424;
                }
            } else {
                StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                sbLIZ19.append("handleNotify --------------->>>>>>info buffering  end:what:");
                sbLIZ19.append(i);
                sbLIZ19.append("");
                C2188811AlT.LIZIZ(sbLIZ19);
                i3 = 702;
            }
        } else {
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append("handleNotify --------------->>>>>>info buffering  start:what:");
            sbLIZ20.append(i);
            sbLIZ20.append("");
            C2188811AlT.LIZIZ(sbLIZ20);
            i3 = 701;
        }
        this.LLJJLIIIJLLLLLLLZ.LIZIZ(this.LL, i3, i2);
    }

    public final void LJJJIL(int i, int i2) {
        try {
            this.LLJJ.lock();
            InterfaceC1470910oNd interfaceC1470910oNd = this.LLJL;
            if (interfaceC1470910oNd != null && i2 >= this.LLJILJILJ) {
                int i3 = this.LLJJIJIIJIL;
                if (i3 == 0) {
                    if (i == 0) {
                        i = -1048575;
                    }
                } else {
                    i = i3;
                }
                interfaceC1470910oNd.LIZLLL(this.LL, i, 0);
            }
            if (this.LLJJ.isLocked()) {
                this.LLJJ.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLJJ.isLocked()) {
                this.LLJJ.unlock();
            }
            throw th;
        }
    }

    public final void LJJJJJL(float f, int i) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJI(f, i);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void seekTo(int i, int i2) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLIZLLLIL = false;
                this.LLJJJ.LIZIZ.LJIIZILJ(i, i2);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public void setTraitObject(int i, TraitObject traitObject) {
        this.LLJJIII.lock();
        try {
            if (LJJIJIIJIL()) {
                this.LLJJJ.LIZIZ.LJJIJIIJIL(i, traitObject);
            }
            this.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIII.unlock();
            throw th;
        }
    }

    public static synchronized TTPlayerClient create(InterfaceC1470080oMI interfaceC1470080oMI, Context context, HashMap<Integer, Integer> map) {
        TTPlayerClient tTPlayerClient;
        TTVersion.LIZ();
        tTPlayerClient = new TTPlayerClient(context, map);
        tTPlayerClient.LLJJJ = AbstractC1470990oNl.LIZ(context, tTPlayerClient, map);
        tTPlayerClient.LL = interfaceC1470080oMI;
        return tTPlayerClient;
    }

    public final void LJJIJL(int i, int i2, String str) {
        if (this.LLJJIJIL != 0) {
            try {
                this.LLJJI.lock();
                if (this.LLJLL != null && str != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onExternInfo, what:");
                    sbLIZ.append(i);
                    sbLIZ.append(", not response, use onExternInfo2");
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZJ();
                    ((C1698530uIl) this.LLJLL).LIZ(i, i2, str);
                }
                this.LLJJI.unlock();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJJI.unlock();
                throw th;
            }
        }
        if (this.LLJLL != null && str != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onExternInfo, what:");
            sbLIZ2.append(i);
            sbLIZ2.append(", not response, use onExternInfo2");
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            ((C1698530uIl) this.LLJLL).LIZ(i, i2, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void LJJIJ(int i, int i2, int i3, String str) {
        AbstractC1467000oHK abstractC1467000oHK;
        AbstractC1467000oHK abstractC1467000oHK2;
        if (i2 != 0) {
            if (i2 != 12) {
                if (i2 != 13) {
                    if (i2 != 94 && i2 != 95) {
                        if (i2 != 47 && i2 != 49) {
                            if (i2 != 77) {
                                if (i2 != 82) {
                                    if (i2 != 1000) {
                                        if (i2 != 20000) {
                                            switch (i2) {
                                                case 32:
                                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                case 35:
                                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 41:
                                                case 42:
                                                    break;
                                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                case 40:
                                                case 43:
                                                case 44:
                                                    break;
                                                case 45:
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 97:
                                                            LJJIJIL(i2, i3);
                                                            return;
                                                        case 98:
                                                        case 99:
                                                        case 100:
                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                            sbLIZ.append("[AudioDucking] handleNotify TTPlayerClient what=");
                                                            sbLIZ.append(i2);
                                                            sbLIZ.append(" parameter:");
                                                            sbLIZ.append(i3);
                                                            C2188811AlT.LIZIZ(sbLIZ);
                                                            LJJIJIL(i2, i3);
                                                            return;
                                                        case 101:
                                                        case 102:
                                                        case 103:
                                                            break;
                                                        case 104:
                                                            LJJIJIL(i2, i3);
                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                            sbLIZ2.append("[ttr_video]:GetBrightness Java:");
                                                            sbLIZ2.append(i3);
                                                            sbLIZ2.append(str);
                                                            C2188811AlT.LIZIZ(sbLIZ2);
                                                            return;
                                                        case 105:
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 2:
                                                                    if (this.LLJLIL == null) {
                                                                        return;
                                                                    }
                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                    sbLIZ3.append("handleNotify --------------->>>>>>Prepared:what:");
                                                                    sbLIZ3.append(i2);
                                                                    sbLIZ3.append(",parameter:");
                                                                    sbLIZ3.append(i3);
                                                                    C2188811AlT.LIZIZ(sbLIZ3);
                                                                    this.LLJLIL.LIZJ(this.LL);
                                                                    return;
                                                                case 3:
                                                                    if (i3 == 100) {
                                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                        sbLIZ4.append("handleNotify -------------->>>>>>>update buffer:what:");
                                                                        sbLIZ4.append(i2);
                                                                        sbLIZ4.append(",parameter:");
                                                                        sbLIZ4.append(i3);
                                                                        C2188811AlT.LIZIZ(sbLIZ4);
                                                                    }
                                                                    InterfaceC1467800oIc interfaceC1467800oIc = this.LLJLLL;
                                                                    if (interfaceC1467800oIc == null || (abstractC1467000oHK = ((C1467280oHm) interfaceC1467800oIc).LIZ.get()) == null) {
                                                                        return;
                                                                    }
                                                                    abstractC1467000oHK.LJJIL(i3);
                                                                    return;
                                                                case 4:
                                                                case 5:
                                                                case 7:
                                                                case 8:
                                                                case BdTuring.TYPE_ECAF /* 9 */:
                                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                                    break;
                                                                case 6:
                                                                    InterfaceC1470110oML interfaceC1470110oML = this.LLJZ;
                                                                    if (interfaceC1470110oML == null) {
                                                                        return;
                                                                    }
                                                                    interfaceC1470110oML.LJ(this.LL, 65535 & i3, i3 >> 16);
                                                                    return;
                                                                default:
                                                                    switch (i2) {
                                                                        case 19:
                                                                            break;
                                                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                        case 21:
                                                                        case 22:
                                                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                                        case 25:
                                                                        case 26:
                                                                        case 27:
                                                                        case 28:
                                                                        case 29:
                                                                        case 30:
                                                                            break;
                                                                        case 23:
                                                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                            sbLIZ5.append("handleNotify --------------->>>>>>IsSARChange:what:");
                                                                            sbLIZ5.append(i2);
                                                                            sbLIZ5.append(",num:");
                                                                            int i4 = 65535 & i3;
                                                                            sbLIZ5.append(i4);
                                                                            sbLIZ5.append(",den:");
                                                                            int i5 = i3 >> 16;
                                                                            sbLIZ5.append(i5);
                                                                            C2188811AlT.LIZIZ(sbLIZ5);
                                                                            InterfaceC1467820oIe interfaceC1467820oIe = this.LLJZIJLIL;
                                                                            if (interfaceC1467820oIe == null || (abstractC1467000oHK2 = ((C1467280oHm) interfaceC1467820oIe).LIZ.get()) == null) {
                                                                                return;
                                                                            }
                                                                            abstractC1467000oHK2.LJJJJ(i4, i5);
                                                                            return;
                                                                        default:
                                                                            switch (i2) {
                                                                                default:
                                                                                    switch (i2) {
                                                                                        case 57:
                                                                                        case 58:
                                                                                        case 60:
                                                                                        case 61:
                                                                                        case BaseNotice.CREATOR /* 62 */:
                                                                                            break;
                                                                                        case 59:
                                                                                        case 63:
                                                                                            break;
                                                                                        default:
                                                                                            switch (i2) {
                                                                                                case 65:
                                                                                                case 66:
                                                                                                case 67:
                                                                                                    break;
                                                                                                case 68:
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i2) {
                                                                                                        case 70:
                                                                                                        case 71:
                                                                                                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                                                                                            break;
                                                                                                        case 73:
                                                                                                            this.LLLF = true;
                                                                                                            LJJIJIL(i2, i3);
                                                                                                            return;
                                                                                                        default:
                                                                                                            switch (i2) {
                                                                                                                case 84:
                                                                                                                case 85:
                                                                                                                case 86:
                                                                                                                case 87:
                                                                                                                case 88:
                                                                                                                case 90:
                                                                                                                case 92:
                                                                                                                    break;
                                                                                                                case 89:
                                                                                                                    break;
                                                                                                                case 91:
                                                                                                                    LJJIJIL(i2, i3);
                                                                                                                    return;
                                                                                                                default:
                                                                                                                    return;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                case 51:
                                                                                case 52:
                                                                                case 53:
                                                                                case 54:
                                                                                    LJJIJIL(i2, i3);
                                                                                    return;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("handleNotify -------------->>>>>>>Completed:what:");
                                            sbLIZ6.append(i2);
                                            sbLIZ6.append(",parameter:");
                                            sbLIZ6.append(i3);
                                            C2188811AlT.LIZIZ(sbLIZ6);
                                            if (this.LLJJIJIIJIL == -2139062143) {
                                                return;
                                            }
                                            this.LLJJIJIIJIL = -2139062143;
                                            this.LLJJIJI.lock();
                                            try {
                                                if (this.LLJJJ != null) {
                                                    this.LLJJJ = null;
                                                    this.LLJJIJI.unlock();
                                                    HashMap<Integer, Integer> map = this.LLL;
                                                    if (map != null && map.get(100).intValue() == 1) {
                                                        this.LLL.put(7, 1);
                                                    } else {
                                                        x.LJI(7, 1);
                                                    }
                                                    LJJJJLI(false);
                                                    LJJJJ(i);
                                                    LJJJIL(i3, i);
                                                    LJJJI(i);
                                                    return;
                                                }
                                                this.LLJJIJI.unlock();
                                                return;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                this.LLJJIJI.unlock();
                                                throw th;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(str)) {
                                    LJJIJIL(i2, i3);
                                    return;
                                } else {
                                    LJJIJL(i2, i3, str);
                                    return;
                                }
                            } else {
                                if (this.LLLFFI != 1) {
                                    return;
                                }
                                this.LLLFFI = 2;
                                LJJIJIL(i2, i3);
                                return;
                            }
                        }
                        LJJIJIL(i2, i3);
                        return;
                    }
                    LJJIJL(i2, i3, str);
                    return;
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("handleNotify -------------->>>>>>>Completed:what:");
                sbLIZ7.append(i2);
                sbLIZ7.append(",parameter:");
                sbLIZ7.append(i3);
                C2188811AlT.LIZIZ(sbLIZ7);
                LJJJJLI(false);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("life:");
                sbLIZ8.append(i);
                sbLIZ8.append(",plifeId:");
                sbLIZ8.append(this.LLJILJILJ);
                C2188811AlT.LIZIZ(sbLIZ8);
                LJJJJ(i);
                LJJJI(i);
                return;
            }
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("handleNotify -------------->>>>>>>update seek complete:what:");
            sbLIZ9.append(i2);
            sbLIZ9.append(",parameter:");
            sbLIZ9.append(i3);
            C2188811AlT.LIZIZ(sbLIZ9);
            LJJJJ(i);
            return;
        }
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("handleNotify -------------->>>>>>>Error:what:");
        sbLIZ10.append(i2);
        sbLIZ10.append(",parameter:");
        sbLIZ10.append(i3);
        C2188811AlT.LIZIZ(sbLIZ10);
        LJJJJLI(false);
        if (i3 == -499989) {
            HashMap<Integer, Integer> map2 = this.LLL;
            if (map2 != null && map2.get(100).intValue() == 1) {
                this.LLL.put(8, 1);
            } else {
                x.LJI(8, 1);
            }
        }
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("life:");
        sbLIZ11.append(i);
        sbLIZ11.append(",plifeId:");
        sbLIZ11.append(this.LLJILJILJ);
        C2188811AlT.LIZIZ(sbLIZ11);
        LJJJJ(i);
        LJJJIL(i3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:7:0x0025, B:9:0x0029, B:10:0x0040, B:15:0x0048, B:16:0x004b, B:19:0x004f, B:22:0x0074, B:24:0x0078, B:26:0x007a, B:27:0x007c, B:31:0x008d, B:43:0x00a2, B:46:0x00ad, B:47:0x00cc, B:36:0x0096, B:39:0x009b, B:44:0x00a8), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:7:0x0025, B:9:0x0029, B:10:0x0040, B:15:0x0048, B:16:0x004b, B:19:0x004f, B:22:0x0074, B:24:0x0078, B:26:0x007a, B:27:0x007c, B:31:0x008d, B:43:0x00a2, B:46:0x00ad, B:47:0x00cc, B:36:0x0096, B:39:0x009b, B:44:0x00a8), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:7:0x0025, B:9:0x0029, B:10:0x0040, B:15:0x0048, B:16:0x004b, B:19:0x004f, B:22:0x0074, B:24:0x0078, B:26:0x007a, B:27:0x007c, B:31:0x008d, B:43:0x00a2, B:46:0x00ad, B:47:0x00cc, B:36:0x0096, B:39:0x009b, B:44:0x00a8), top: B:53:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(int r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.LJJIJLIJ(int, int, int, java.lang.String):void");
    }
}
