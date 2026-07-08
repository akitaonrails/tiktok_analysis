package com.ss.android.ugc.aweme.video.preload;

import X.AbstractRunnableC1485140oka;
import X.C0NI4;
import X.C0NKB;
import X.C1472310oPt;
import X.C1474810oTv;
import X.C1475150oUT;
import X.C1475410oUt;
import X.C1476730oX1;
import X.C1477400oY6;
import X.C1478190oZN;
import X.C1478300oZY;
import X.C1485170okd;
import X.C1485620olM;
import X.C1EJO;
import X.C2262431Dgv;
import X.C786410Ut5;
import X.InterfaceC1475290oUh;
import X.InterfaceC1475300oUi;
import X.InterfaceC1475840oVa;
import X.InterfaceC1482870ogv;
import X.InterfaceC1485260okm;
import X.InterfaceC1485650olP;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class VideoPreloadManager implements InterfaceC1482870ogv {
    public static volatile boolean LJI;
    public InterfaceC1485260okm LIZ;
    public Map<String, String> LIZJ;
    public C1485170okd LIZLLL;
    public BPEAHandler LJFF;
    public final LruCache<String, Long> LJ = new LruCache<>(1048576);
    public final C1478300oZY LIZIZ = C1478190oZN.LIZ();

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ int LJJIJIL() {
        return -1;
    }

    public final synchronized InterfaceC1485650olP LJJLJ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C1485170okd();
        }
        return this.LIZLLL;
    }

    public final synchronized Handler LJJLJLI() {
        if (this.LJFF == null) {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            this.LJFF = new BPEAHandler(C786410Ut5.W2(handlerThread));
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC1482870ogv, X.InterfaceC1488150opR
    public void LIZ() {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okz
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LL.LJJZ().LIZ();
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIJ() {
        LJJI(C1485620olM.LIZ);
    }

    public final InterfaceC1485260okm LJJZ() {
        InterfaceC1485260okm interfaceC1485260okm = this.LIZ;
        if (interfaceC1485260okm != null) {
            return interfaceC1485260okm;
        }
        synchronized (this) {
            try {
                if (this.LIZ == null) {
                    InterfaceC1485260okm interfaceC1485260okmLIZ = ((C1485170okd) LJJLJ()).LIZ(this.LIZIZ.getExperiment().PreloadTypeExperiment(), this.LIZIZ);
                    this.LIZ = interfaceC1485260okmLIZ;
                    interfaceC1485260okmLIZ.LJJJJJ();
                    Map<String, String> map = this.LIZJ;
                    if (map != null) {
                        this.LIZ.LJJIJL(map);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC1482870ogv
    public void clearCache() {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol0
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LL.LJJZ().clearCache();
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJIIJ() {
        return LJJZ().LJIIJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIIJJI() {
        return LJJZ().LJIIJJI();
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJIJJ() {
        return LJJZ().LJIJJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIJJLI() {
        boolean zLJIJJLI = LJJZ().LJIJJLI();
        LJI = true;
        return zLJIJJLI;
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJII() {
        return LJJZ().LJJII();
    }

    @Override // X.InterfaceC1482870ogv
    public final Map LJJIJIIJI() {
        return LJJZ().LJJIJIIJI();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJJJI() {
        return LJJZ().LJJJJI();
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJJJJ() {
        return LJJZ().LJJJJJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final File getCacheDir() {
        return LJJZ().LJJLIIIJILLIZJL();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJILLIZJL() {
        return LJI;
    }

    public static void LJJLIL(SimVideoUrlModel simVideoUrlModel) {
        if (!C1474810oTv.LJJLIIIIJ() && simVideoUrlModel != null) {
            if (simVideoUrlModel.getHitBitrate() == null) {
                simVideoUrlModel.setHitBitrate(C1477400oY6.LJJJJI.LJIJI(simVideoUrlModel.getSourceId()));
            }
            if (simVideoUrlModel.getHitDashVideoBitrate() == null) {
                simVideoUrlModel.setHitDashVideoBitrate(C1477400oY6.LJJJJI.LJIJJLI(simVideoUrlModel.getSourceId()));
            }
            if (simVideoUrlModel.getHitDashAudioBitrate() == null) {
                simVideoUrlModel.setHitDashAudioBitrate(C1477400oY6.LJJJJI.LJIJJ(simVideoUrlModel.getSourceId()));
            }
            if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
                simVideoUrlModel.setDashVideoId(C1477400oY6.LJJJJI.LJIIJJI(simVideoUrlModel.getSourceId()));
            }
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LIZIZ(InterfaceC1475300oUi interfaceC1475300oUi) {
        if (interfaceC1475300oUi == null) {
            return;
        }
        if (!this.LIZIZ.getExperiment().enableMDLInitDelay()) {
            LJIJJLI();
        }
        if (this.LIZ != null) {
            LJJZ().LIZIZ(interfaceC1475300oUi);
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final List<C2262431Dgv> LIZJ(SimVideoUrlModel simVideoUrlModel) {
        return LJJZ().LIZJ(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LIZLLL(InterfaceC1475300oUi interfaceC1475300oUi) {
        if (interfaceC1475300oUi == null) {
            return;
        }
        if (!this.LIZIZ.getExperiment().enableMDLInitDelay()) {
            LJIJJLI();
        }
        if (this.LIZ != null) {
            LJJZ().LIZLLL(interfaceC1475300oUi);
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJ(final boolean z) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol9
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJ(z);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJI(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol8
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJI(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJII(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol3
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJII(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        if (isCache(simVideoUrlModel) && LJJZ().LJIIIIZZ(simVideoUrlModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIILIIL(InterfaceC1475290oUh interfaceC1475290oUh) {
        LJJZ().LJIILIIL(interfaceC1475290oUh);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIILL(String str) {
        return LJJZ().LJIILL(str);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIZILJ(final boolean z) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olA
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJIIZILJ(z);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIL(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okv
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJIL(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJ(SimVideoUrlModel simVideoUrlModel) {
        LJJLIL(simVideoUrlModel);
        return LJJZ().LJJ(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJI(InterfaceC1475290oUh interfaceC1475290oUh) {
        LJJZ().LJJI(interfaceC1475290oUh);
    }

    @Override // X.InterfaceC1482870ogv
    public final List<C1EJO> LJJIIJZLJL(SimVideoUrlModel simVideoUrlModel) {
        return LJJZ().LJJIIJZLJL(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIIZ(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol6
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJIIZ(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJIJ(String str) {
        return LJJZ().LJJIJ(str);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJIIJIL(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol1
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJIJIIJIL(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJL(final Map<String, String> map) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0oko
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                VideoPreloadManager videoPreloadManager = this.LLILLJJLI;
                if (videoPreloadManager.LIZ == null) {
                    videoPreloadManager.LIZJ = map;
                    return false;
                }
                videoPreloadManager.LJJZ().LJJIJL(map);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJLIJ(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okx
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJIJLIJ(str);
                return true;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                return LJJZ().LJJLIIIJJI(simVideoUrlModel);
            }
            return LJJZ().LJJLIIIJL(simVideoUrlModel.getBitRatedRatioUri());
        }
        return -1L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJ(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0oky
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJ(str);
                return true;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJIL(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol2
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJIL(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJJJL(SimVideoUrlModel simVideoUrlModel) {
        LJJLIL(simVideoUrlModel);
        return LJJZ().LJJJJL(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJLI(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol5
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJJLI(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJLL(boolean z) {
        LJJZ().LJJJJLL(z);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJZ(final SimVideoUrlModel simVideoUrlModel) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0oks
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJJZ(simVideoUrlModel);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final C2262431Dgv LJJJJZI(SimVideoUrlModel simVideoUrlModel) {
        return LJJZ().LJJJJZI(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJLIIL(final boolean z) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olB
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJLIIL(z);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJLZIJ(final SimVideoUrlModel simVideoUrlModel) {
        if (C1474810oTv.LJJIIJZLJL()) {
            return;
        }
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okZ
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                if (this.LLILLJJLI.LJ.get(simVideoUrlModel.getUri()) != null) {
                    this.LLILLJJLI.getClass();
                    C1475000oUE.LJIIIIZZ().monitorStatusRate("aweme_media_play_stastics_log", 0, null);
                    return false;
                }
                this.LLILLJJLI.getClass();
                C1475000oUE.LJIIIIZZ().monitorStatusRate("aweme_media_play_stastics_log", 1, null);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJZ(final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol7
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJZ(str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJL(final JSONObject jSONObject) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olD
            public final /* synthetic */ int LL = 57017;

            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLL.LJJZ().LJJLIIIJ(this.LL, jSONObject);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJ(final List list) {
        return LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olE
            public final /* synthetic */ int LLILLJJLI = Integer.MAX_VALUE;

            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                return this.LLILLL.LJJZ().LJJLIIIJLJLI(this.LLILLJJLI, list);
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJLIIIJJI(SimVideoUrlModel simVideoUrlModel) {
        return LJJJJL(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIIJJIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            LJJZ().LJJLIIIJLLLLLLLZ(simVideoUrlModel);
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIIJL(final C1476730oX1 c1476730oX1) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0oku
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLJJLI.LJJZ().LJJJLL(c1476730oX1);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJLLLLLLLZ(SimVideoUrlModel simVideoUrlModel) {
        return LJJJLL(simVideoUrlModel, 0);
    }

    public final boolean LJJZZI(AbstractRunnableC1485140oka abstractRunnableC1485140oka) {
        if (!C1472310oPt.LIZ && ((Boolean) C1474810oTv.P.getValue()).booleanValue()) {
            if (LJJLJLI() == null) {
                return true;
            }
            C786410Ut5.LJJZZIII(LJJLJLI(), abstractRunnableC1485140oka);
            return true;
        }
        C1478300oZY c1478300oZY = this.LIZIZ;
        if (c1478300oZY != null && c1478300oZY.useSyncPreloadStyle()) {
            if (LJJLJLI() == null) {
                return true;
            }
            C786410Ut5.LJJZZIII(LJJLJLI(), abstractRunnableC1485140oka);
            return true;
        }
        return abstractRunnableC1485140oka.LIZ();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        LJJLIL(simVideoUrlModel);
        return LJJZ().isCache(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJFF(SimVideoUrlModel simVideoUrlModel, long j) {
        LJJLIL(simVideoUrlModel);
        return LJJZ().LJFF(simVideoUrlModel, j);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIILJJIL(final long j, boolean z) {
        if (z) {
            LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olC
                @Override // X.AbstractRunnableC1485140oka
                public final boolean LIZ() {
                    this.LLILLJJLI.LJJZ().LJIILJJIL(j, true);
                    return false;
                }
            });
            return -1L;
        }
        return LJJZ().LJIILJJIL(j, false);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIJI(SimBitRate simBitRate, boolean z) {
        return LJJZ().LJIJI(simBitRate, z);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJIIJ(String str, String str2) {
        return LJJZ().LJJIIJ(str, str2);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIIZI(final String str, final List list) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olG
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLL.LJJZ().LJJIIZI(str, list);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIL(final SimVideoUrlModel simVideoUrlModel, final C0NI4 c0ni4) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okp
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLL.LJJZ().LJJIL(simVideoUrlModel, c0ni4);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJI(final String str, final String str2) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okw
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLL.LJJZ().LJJJI(str, str2);
                return true;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJJJ(SimBitRate simBitRate, boolean z) {
        return LJJZ().LJJJJ(simBitRate, z);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJIZL(final int i, final String str) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0ol4
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILLL.LJJZ().LJJJJIZL(i, str);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJJLL(SimVideoUrlModel simVideoUrlModel, int i) {
        return LJJLL(simVideoUrlModel, i, C0NKB.LIZIZ);
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJIII(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        return LJJZ().LJJIII(simVideoUrlModel, str, strArr);
    }

    public final boolean LJJLL(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb) {
        return LJJLIIIJLJLI(simVideoUrlModel, i, c0nkb, null);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIJ(final String str, final List list, final boolean z, final boolean z2) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0olF
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILZIL.LJJZ().LJIJ(str, list, z, z2);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJLJLI(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb, C1475410oUt c1475410oUt) {
        return LJJLI(simVideoUrlModel, i, c0nkb, c1475410oUt, null, 0, null, 0);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIIZ(final String str, final String str2, final boolean z, final boolean z2, final InterfaceC1475840oVa interfaceC1475840oVa) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okt
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILZLL.LJJZ().LJIIIZ(str, str2, z, z2, interfaceC1475840oVa);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public void LJIIL(String str, long j, long j2, int i, byte[] bArr) {
        LJJZ().LJIIL(str, j, j2, i, bArr);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIFFI(final SimVideoUrlModel simVideoUrlModel, final String str, final boolean z, final boolean z2, final InterfaceC1475840oVa interfaceC1475840oVa) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okq
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILZLL.LJJZ().LJJIFFI(simVideoUrlModel, str, z, z2, interfaceC1475840oVa);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJJL(final SimVideoUrlModel simVideoUrlModel, final String str, final boolean z, final long j, final InterfaceC1475840oVa interfaceC1475840oVa) {
        LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okr
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                this.LLILZLL.LJJZ().LJJJJJL(simVideoUrlModel, str, z, j, interfaceC1475840oVa);
                return false;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIIJ(SimVideoUrlModel simVideoUrlModel, int i, List list, int i2, List list2, int i3) {
        return LJJLI(simVideoUrlModel, i, C0NKB.LIZIZ, null, list, i2, list2, i3);
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLI(final SimVideoUrlModel simVideoUrlModel, final int i, final C0NKB c0nkb, final C1475410oUt c1475410oUt, final List list, final int i2, final List list2, final int i3) {
        if (!C1475150oUT.LIZIZ(simVideoUrlModel)) {
            return false;
        }
        return LJJZZI(new AbstractRunnableC1485140oka() { // from class: X.0okn
            @Override // X.AbstractRunnableC1485140oka
            public final boolean LIZ() {
                List list3;
                List list4;
                this.LLJ.LJIJJLI();
                boolean zLJJJLZIJ = this.LLJ.LJJZ().LJJJLZIJ(simVideoUrlModel, Math.max(i, 0), c0nkb, c1475410oUt);
                boolean zLJJLIIIJLJLI = this.LLJ.LJJZ().LJJLIIIJLJLI(i2, list);
                boolean zLJJLI = this.LLJ.LJJZ().LJJLI(i3, list2);
                if (zLJJJLZIJ) {
                    this.LLJ.LJ.put(simVideoUrlModel.getUri(), 0L);
                }
                if (zLJJLIIIJLJLI && (list4 = list) != null && !list4.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                if (zLJJLI && (list3 = list2) != null && !list3.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
                return zLJJJLZIJ || zLJJLIIIJLJLI || zLJJLI;
            }
        });
    }
}
