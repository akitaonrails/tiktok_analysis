package com.ss.android.ugc.aweme.video.preload;

import X.C0NI4;
import X.C0NKB;
import X.C1474810oTv;
import X.C1474930oU7;
import X.C1475150oUT;
import X.C1475410oUt;
import X.C1476730oX1;
import X.C1477400oY6;
import X.C1478190oZN;
import X.C1478300oZY;
import X.C1485180oke;
import X.C1485620olM;
import X.C1485630olN;
import X.C1EJO;
import X.C2262431Dgv;
import X.C786410Ut5;
import X.InterfaceC1475290oUh;
import X.InterfaceC1475300oUi;
import X.InterfaceC1475840oVa;
import X.InterfaceC1482870ogv;
import X.InterfaceC1485260okm;
import X.InterfaceC1485650olP;
import Y.ARunnableS0S0603000_23;
import Y.ARunnableS0S1201200_23;
import Y.ARunnableS0S1220000_23;
import Y.ARunnableS0S1310100_23;
import Y.ARunnableS0S1320000_23;
import Y.ARunnableS0S2220000_23;
import Y.ARunnableS11S2100000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS29S0201000_23;
import Y.ARunnableS42S0110000_23;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS5S0110100_23;
import Y.ARunnableS6S1101000_23;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class VideoPreloadManagerAsync implements InterfaceC1482870ogv {
    public static volatile boolean LJFF;
    public static volatile boolean LJI;
    public InterfaceC1485260okm LIZ;
    public C1485180oke LIZJ;
    public BPEAHandler LIZLLL;
    public final CopyOnWriteArrayList<C1485630olN> LJ = new CopyOnWriteArrayList<>();
    public final C1478300oZY LIZIZ = C1478190oZN.LIZ();

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ int LJJIJIL() {
        return -1;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ boolean LJJJJI() {
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJLZIJ(SimVideoUrlModel simVideoUrlModel) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJL(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIIJJIZ(SimVideoUrlModel simVideoUrlModel) {
    }

    public final synchronized InterfaceC1485650olP LJJLJ() {
        if (this.LIZJ == null) {
            this.LIZJ = new C1485180oke();
        }
        return this.LIZJ;
    }

    public final synchronized Handler LJJLJLI() {
        if (this.LIZLLL == null) {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            this.LIZLLL = new BPEAHandler(C786410Ut5.W2(handlerThread));
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1482870ogv, X.InterfaceC1488150opR
    public final void LIZ() {
        if (LJFF) {
            LJJLL(new ARunnableS123S0100000_23(this, 216));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS123S0100000_23(this, 218)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIJJLI() {
        if (!LJFF && !LJI) {
            LJI = true;
            LJFF = LJJZZI().LJIJJLI();
            if (LJFF) {
                C1474930oU7.LJIIIIZZ = true;
            }
            for (int i = 0; i < this.LJ.size(); i++) {
                if (this.LJ.get(i) != null && this.LJ.get(i).LIZ != null) {
                    this.LJ.get(i).LIZ.run();
                }
            }
            LJI = false;
        }
        return LJFF;
    }

    @Override // X.InterfaceC1482870ogv
    public final Map LJJIJIIJI() {
        return LJFF ? LJJZZI().LJJIJIIJI() : new LinkedHashMap();
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIJ() {
        LJJI(C1485620olM.LIZ);
    }

    public final InterfaceC1485260okm LJJZZI() {
        InterfaceC1485260okm interfaceC1485260okm = this.LIZ;
        if (interfaceC1485260okm != null) {
            return interfaceC1485260okm;
        }
        synchronized (this) {
            try {
                if (this.LIZ == null) {
                    this.LIZ = ((C1485180oke) LJJLJ()).LIZ(this.LIZIZ.getExperiment().PreloadTypeExperiment(), this.LIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC1482870ogv
    public final void clearCache() {
        if (LJFF) {
            LJJLL(new ARunnableS123S0100000_23(this, 211));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS123S0100000_23(this, 215)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJIIJ() {
        return LJJZZI().LJIIJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIIJJI() {
        return LJJZZI().LJIIJJI();
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJIJJ() {
        return LJJZZI().LJIJJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJII() {
        return LJJZZI().LJJII();
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJJJJ() {
        return LJJZZI().LJJJJJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final File getCacheDir() {
        return LJJZZI().LJJLIIIJILLIZJL();
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJILLIZJL() {
        return LJFF;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LIZIZ(InterfaceC1475300oUi interfaceC1475300oUi) {
        if (interfaceC1475300oUi == null) {
            return;
        }
        LJJZZI().LIZIZ(interfaceC1475300oUi);
    }

    @Override // X.InterfaceC1482870ogv
    public final List<C2262431Dgv> LIZJ(SimVideoUrlModel simVideoUrlModel) {
        return LJJZZI().LIZJ(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LIZLLL(InterfaceC1475300oUi interfaceC1475300oUi) {
        if (interfaceC1475300oUi == null) {
            return;
        }
        LJJZZI().LIZLLL(interfaceC1475300oUi);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJ(boolean z) {
        if (LJFF) {
            LJJLL(new ARunnableS42S0110000_23(this, z, 15));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS42S0110000_23(this, z, 17)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJI(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 45));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 46)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJII(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 44));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 57)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        if (LJFF && isCache(simVideoUrlModel) && LJJZZI().LJIIIIZZ(simVideoUrlModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIILIIL(InterfaceC1475290oUh interfaceC1475290oUh) {
        LJJZZI().LJIILIIL(interfaceC1475290oUh);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIILL(String str) {
        if (LJFF) {
            return LJJZZI().LJIILL(str);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIZILJ(boolean z) {
        if (LJFF) {
            LJJLL(new ARunnableS42S0110000_23(this, z, 23));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS42S0110000_23(this, z, 24)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIL(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 53));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 55)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJ(SimVideoUrlModel simVideoUrlModel) {
        if (LJFF) {
            LJJLIL(simVideoUrlModel);
            return LJJZZI().LJJ(simVideoUrlModel);
        }
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJI(InterfaceC1475290oUh interfaceC1475290oUh) {
        LJJZZI().LJJI(interfaceC1475290oUh);
    }

    @Override // X.InterfaceC1482870ogv
    public final List<C1EJO> LJJIIJZLJL(SimVideoUrlModel simVideoUrlModel) {
        return LJJZZI().LJJIIJZLJL(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIIZ(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 47));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 61)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJIJ(String str) {
        if (LJFF) {
            return LJJZZI().LJJIJ(str);
        }
        return "";
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJIIJIL(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 64));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 65)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJL(Map<String, String> map) {
        if (LJFF) {
            LJJLL(new ARunnableS92S0200000_23(this, map, 148));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS92S0200000_23(this, map, 149)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJLIJ(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 58));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 39)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJIZ(SimVideoUrlModel simVideoUrlModel) {
        if (LJFF && simVideoUrlModel != null) {
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                return LJJZZI().LJJLIIIJJI(simVideoUrlModel);
            }
            return LJJZZI().LJJLIIIJL(simVideoUrlModel.getBitRatedRatioUri());
        }
        return -1L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJ(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 48));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 50)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJIL(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 59));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 62)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJJJL(SimVideoUrlModel simVideoUrlModel) {
        if (LJFF) {
            LJJLIL(simVideoUrlModel);
            return LJJZZI().LJJJJL(simVideoUrlModel);
        }
        return 0;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJLI(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 52));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 54)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJLL(boolean z) {
        if (LJFF) {
            LJJLL(new ARunnableS42S0110000_23(this, z, 19));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS42S0110000_23(this, z, 20)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJZ(SimVideoUrlModel simVideoUrlModel) {
        if (LJFF) {
            LJJLL(new ARunnableS92S0200000_23(this, simVideoUrlModel, 143));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS92S0200000_23(this, simVideoUrlModel, 144)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final C2262431Dgv LJJJJZI(SimVideoUrlModel simVideoUrlModel) {
        return LJJZZI().LJJJJZI(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJLIIL(boolean z) {
        if (LJFF) {
            LJJLL(new ARunnableS42S0110000_23(this, z, 14));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS42S0110000_23(this, z, 16)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJZ(String str) {
        if (LJFF) {
            LJJLL(new ARunnableS28S1100000_23(this, str, 49));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS28S1100000_23(this, str, 51)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJ(List list) {
        if (LJFF) {
            LJJLL(new ARunnableS29S0201000_23(this, list, 8));
            return true;
        }
        this.LJ.add(new C1485630olN(new ARunnableS29S0201000_23(this, list, 9)));
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJLIIIJJI(SimVideoUrlModel simVideoUrlModel) {
        return LJJJJL(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIIJL(C1476730oX1 c1476730oX1) {
        if (LJFF) {
            LJJLL(new ARunnableS92S0200000_23(this, c1476730oX1, 141));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS92S0200000_23(this, c1476730oX1, 142)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJLLLLLLLZ(SimVideoUrlModel simVideoUrlModel) {
        return LJJJLL(simVideoUrlModel, 0);
    }

    public final void LJJLIL(SimVideoUrlModel simVideoUrlModel) {
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

    public final void LJJLL(Runnable runnable) {
        if (LJJLJLI() == null) {
            return;
        }
        C786410Ut5.LJJZZIII(LJJLJLI(), runnable);
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        if (LJFF) {
            LJJLIL(simVideoUrlModel);
            return LJJZZI().isCache(simVideoUrlModel);
        }
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJFF(SimVideoUrlModel simVideoUrlModel, long j) {
        if (LJFF) {
            LJJLIL(simVideoUrlModel);
            return LJJZZI().LJFF(simVideoUrlModel, j);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIILJJIL(long j, boolean z) {
        if (LJFF) {
            LJJLL(new ARunnableS5S0110100_23(this, z, j, 1));
            return -1L;
        }
        this.LJ.add(new C1485630olN(new ARunnableS5S0110100_23(this, z, j, 2)));
        return -1L;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIJI(SimBitRate simBitRate, boolean z) {
        if (LJFF) {
            return LJJZZI().LJIJI(simBitRate, z);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJIIJ(String str, String str2) {
        if (LJFF) {
            return LJJZZI().LJJIIJ(str, str2);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIIZI(String str, List list) {
        if (LJFF) {
            LJJLL(new ARunnableS27S1200000_23(this, list, str, 24));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS27S1200000_23(this, list, str, 25)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIL(SimVideoUrlModel simVideoUrlModel, C0NI4 c0ni4) {
        if (LJFF) {
            LJJLL(new ARunnableS56S0300000_23(c0ni4, this, simVideoUrlModel, 28));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS56S0300000_23(c0ni4, this, simVideoUrlModel, 29)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJI(String str, String str2) {
        if (LJFF) {
            LJJLL(new ARunnableS11S2100000_23(this, str, str2, 17));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS11S2100000_23(this, str, str2, 16)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJJJ(SimBitRate simBitRate, boolean z) {
        if (LJFF) {
            return LJJZZI().LJJJJ(simBitRate, z);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJIZL(int i, String str) {
        if (LJFF) {
            LJJLL(new ARunnableS6S1101000_23(this, i, str, 3));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS6S1101000_23(this, i, str, 4)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJJLL(SimVideoUrlModel simVideoUrlModel, int i) {
        return LJJZ(simVideoUrlModel, i, C0NKB.LIZIZ);
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJIII(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        if (((Boolean) C1474810oTv.f205m3.getValue()).booleanValue()) {
            if (!LJFF) {
                LJIJJLI();
            }
            return LJJZZI().LJJIII(simVideoUrlModel, str, strArr);
        }
        if (LJFF) {
            return LJJZZI().LJJIII(simVideoUrlModel, str, strArr);
        }
        return "";
    }

    public final boolean LJJZ(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb) {
        return LJJLIIIJLJLI(simVideoUrlModel, i, c0nkb, null);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIJ(String str, List list, boolean z, boolean z2) {
        if (LJFF) {
            LJJLL(new ARunnableS0S1220000_23(list, this, z, z2, str, 1));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS0S1220000_23(list, this, z, z2, str, 2)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJLJLI(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb, C1475410oUt c1475410oUt) {
        return LJJLI(simVideoUrlModel, i, c0nkb, c1475410oUt, null, 0, null, 0);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIIZ(String str, String str2, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
        if (LJFF) {
            LJJLL(new ARunnableS0S2220000_23(this, interfaceC1475840oVa, z, z2, str, str2, 2));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS0S2220000_23(this, interfaceC1475840oVa, z, z2, str, str2, 3)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIL(String str, long j, long j2, int i, byte[] bArr) {
        if (LJFF) {
            LJJLL(new ARunnableS0S1201200_23(this, str, j, j2, i, bArr, 1));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS0S1201200_23(this, str, j, j2, i, bArr, 2)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIFFI(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
        if (LJFF) {
            LJJLL(new ARunnableS0S1320000_23(this, simVideoUrlModel, str, z, z2, interfaceC1475840oVa, 0));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS0S1320000_23(this, simVideoUrlModel, str, z, z2, interfaceC1475840oVa, 1)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJJL(SimVideoUrlModel simVideoUrlModel, String str, boolean z, long j, InterfaceC1475840oVa interfaceC1475840oVa) {
        if (LJFF) {
            LJJLL(new ARunnableS0S1310100_23(this, simVideoUrlModel, interfaceC1475840oVa, j, str, z, 2));
        } else {
            this.LJ.add(new C1485630olN(new ARunnableS0S1310100_23(this, simVideoUrlModel, interfaceC1475840oVa, j, str, z, 3)));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIIJ(SimVideoUrlModel simVideoUrlModel, int i, List list, int i2, List list2, int i3) {
        return LJJLI(simVideoUrlModel, i, C0NKB.LIZIZ, null, list, i2, list2, i3);
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLI(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb, C1475410oUt c1475410oUt, List list, int i2, List list2, int i3) {
        if (LJFF) {
            if (!C1475150oUT.LIZIZ(simVideoUrlModel)) {
                return false;
            }
            LJJLL(new ARunnableS0S0603000_23(this, simVideoUrlModel, i, c0nkb, c1475410oUt, list, i2, list2, i3, 1));
            return true;
        }
        this.LJ.add(new C1485630olN(new ARunnableS0S0603000_23(this, simVideoUrlModel, i, c0nkb, c1475410oUt, list, i2, list2, i3, 2)));
        return false;
    }
}
