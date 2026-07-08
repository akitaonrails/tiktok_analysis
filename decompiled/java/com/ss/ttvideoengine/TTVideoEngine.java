package com.ss.ttvideoengine;

import X.AbstractC1468760oKA;
import X.C0MRO;
import X.C0V1G;
import X.C0WPO;
import X.C0WPP;
import X.C0WPQ;
import X.C0WPS;
import X.C0WPW;
import X.C1309090kAd;
import X.C1309100kAe;
import X.C1309150kAj;
import X.C1309170kAl;
import X.C1466990oHJ;
import X.C1467420oI0;
import X.C1467630oIL;
import X.C1468060oJ2;
import X.C1468070oJ3;
import X.C1468090oJ5;
import X.C1468180oJE;
import X.C1468510oJl;
import X.C1468690oK3;
import X.C1468740oK8;
import X.C1468750oK9;
import X.C1468920oKQ;
import X.C1468940oKS;
import X.C1469110oKj;
import X.C1469120oKk;
import X.C1469160oKo;
import X.C1469180oKq;
import X.C1469200oKs;
import X.C1469210oKt;
import X.C1469220oKu;
import X.C1469230oKv;
import X.C1469260oKy;
import X.C1469270oKz;
import X.C1469370oL9;
import X.C1470240oMY;
import X.C1470430oMr;
import X.C1471660oOq;
import X.C1471820oP6;
import X.C1473400oRe;
import X.C1474520oTS;
import X.C1474720oTm;
import X.C1474760oTq;
import X.C1474810oTv;
import X.C1475120oUQ;
import X.C1475130oUR;
import X.C1475280oUg;
import X.C1475440oUw;
import X.C1475460oUy;
import X.C1475470oUz;
import X.C1475600oVC;
import X.C1475710oVN;
import X.C1475920oVi;
import X.C1476130oW3;
import X.C20511081t;
import X.C2094908Ip;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C650110Pej;
import X.C786410Ut5;
import X.C790030Uyv;
import X.C790040Uyw;
import X.C790230UzF;
import X.C795730VJj;
import X.C797000VOg;
import X.C805420Vie;
import X.EnumC1471520oOc;
import X.EnumC2281151EQn;
import X.InterfaceC1467050oHP;
import X.InterfaceC1467240oHi;
import X.InterfaceC1467390oHx;
import X.InterfaceC1467760oIY;
import X.InterfaceC1467770oIZ;
import X.InterfaceC1467780oIa;
import X.InterfaceC1467890oIl;
import X.InterfaceC1468020oIy;
import X.InterfaceC1468030oIz;
import X.InterfaceC1469360oL8;
import X.InterfaceC1469380oLA;
import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.mediakit.medialoader.AVMDLCopyOperation;
import com.ss.mediakit.medialoader.AVMDLCopyOperationListener;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLFileInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.TraitObject;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ttkmedia.datacenter.common.DCThreadPool;
import cxo.a4;
import cxo.s0;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes24.dex */
public class TTVideoEngine implements InterfaceC1467390oHx {
    public static int[] LJ = null;
    public static boolean LJFF = false;
    public static int LJI = 0;
    public static int LJII = 0;
    public static int LJIIIIZZ = 0;
    public static int LJIIIZ = 0;
    public static int LJIIJ = 0;
    public static boolean LJIIJJI = true;
    public static int LJIIL = 0;
    public static int LJIILIIL = 1;
    public static boolean LJIILJJIL;
    public static volatile boolean LJIILL;
    public static long LJIILLIIL;
    public static int LJIIZILJ;
    public static int LJIJ;
    public final C1466990oHJ LIZ;
    public int LIZIZ;
    public long LIZJ;
    public float LIZLLL;

    @Override // X.InterfaceC1467390oHx
    public synchronized void LJIILL() {
        this.LIZ.LJIILL();
    }

    public synchronized void LJJIJIIJIL() {
        this.LIZ.LLIIL();
    }

    @Override // X.InterfaceC1467390oHx
    public synchronized void release() {
        this.LIZ.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LJJLIIIIJ() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.LJJLIIIIJ():float");
    }

    public static synchronized void LJLJJI() {
    }

    public static void LLIIJI() {
        C805420Vie.LIZ.getClass();
    }

    public static void LLIILZL() {
        C805420Vie.LIZ.getClass();
    }

    @Override // X.InterfaceC1467390oHx
    public final boolean LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIIJZLJL() {
        this.LIZ.LJJIIJZLJL();
    }

    public final void LJJIJIL() {
        this.LIZ.LLIILZL();
    }

    public final String LJJIL() {
        return this.LIZ.LLILLL();
    }

    public final Context LJJJ() {
        return this.LIZ.LJI;
    }

    public final String LJJJI() {
        return this.LIZ.LLILZ();
    }

    public final int LJJJIL() {
        return this.LIZ.LLILZIL();
    }

    public final int LJJJJ() {
        return this.LIZ.LLILZLL();
    }

    public final String LJJJJI() {
        return this.LIZ.Z;
    }

    public final EnumC2281151EQn LJJJJIZL() {
        return this.LIZ.LLIZ();
    }

    public final String LJJJJJ() {
        return this.LIZ.LLIZLLLIL();
    }

    public final int LJJJJL() {
        return this.LIZ.LJLIIL.LJFF;
    }

    public final String LJJJJLL() {
        return this.LIZ.J3;
    }

    public final InterfaceC1467050oHP LJJJJZ() {
        return this.LIZ.LLJIJIL();
    }

    public final int LJJJLIIL() {
        return this.LIZ.LJLIIL.LIZJ;
    }

    public final InterfaceC1467240oHi LJJJLL() {
        return this.LIZ.LLLZIL;
    }

    public final float LJJJZ() {
        return this.LIZ.LLJILJILJ();
    }

    public final InterfaceC1468030oIz LJJL() {
        return this.LIZ.LLJILLL();
    }

    public final int LJJLIIIJ() {
        return this.LIZ.LLJJ();
    }

    public final int LJJLIIIJILLIZJL() {
        return this.LIZ.LJIILL;
    }

    public final Surface LJJLIIIJJI() {
        return this.LIZ.LLJJI();
    }

    public final Surface LJJLIIIJL() {
        return this.LIZ.LJIIL;
    }

    public final InterfaceC1468020oIy LJJLIIIJLJLI() {
        return this.LIZ.LLJJIJIIJIL();
    }

    public final int LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJIILIIL();
    }

    public final String LJJLIIJ() {
        return this.LIZ.LLJJJ();
    }

    public final C1470240oMY LJJLIL() {
        return this.LIZ.LLJJJIL();
    }

    public final int LJJLJ() {
        return this.LIZ.LJIILJJIL();
    }

    public final float LJJLJLI() {
        return this.LIZ.LLJJJJ();
    }

    public final int LJJLL() {
        return this.LIZ.LJJIJIIJI();
    }

    public final boolean LJJZ() {
        return this.LIZ.LJZ;
    }

    public final boolean LJJZZI() {
        return this.LIZ.LJJJ;
    }

    public final boolean LJJZZIII() {
        return this.LIZ.LJJIIJ;
    }

    public final boolean LJL() {
        return this.LIZ.LJJIIJZLJL;
    }

    public final boolean LJLI() {
        return this.LIZ.LJLIIL.LJIJ;
    }

    public final boolean LJLIIIL() {
        return this.LIZ.LJLIIL.LJIIJ;
    }

    public final boolean LJLIIL() {
        return this.LIZ.LLJLIL();
    }

    public final boolean LJLIL() {
        return this.LIZ.LLJLILLLLZIIL();
    }

    public final void LJLJI() {
        this.LIZ.j6 = true;
    }

    public final void LJLJJLL() {
        this.LIZ.LLLLJI();
    }

    public final void LJLLJ() {
        this.LIZ.C = true;
    }

    public final void LLILZLL() {
        this.LIZ.i6 = 1;
    }

    public final String[] LLJJJIL() {
        return this.LIZ.LLLZ();
    }

    public final void LLJJJJ() {
        this.LIZ.getClass();
    }

    @Override // X.InterfaceC1467390oHx
    public final boolean isMute() {
        return this.LIZ.isMute();
    }

    @Override // X.InterfaceC1467390oHx
    public void pause() {
        this.LIZ.pause();
    }

    @Override // X.InterfaceC1467390oHx
    public void play() {
        this.LIZ.play();
    }

    @Override // X.InterfaceC1467390oHx
    public final void prepare() {
        this.LIZ.prepare();
    }

    @Override // X.InterfaceC1467390oHx
    public void start() {
        this.LIZ.start();
    }

    @Override // X.InterfaceC1467390oHx
    public void stop() {
        boolean zLJI = MethodIDManager.LJI(71891);
        this.LIZ.stop();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJI(C1475130oUR c1475130oUR) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLIIL.getClass();
            if (c1475130oUR != null) {
                if (dataLoaderHelper.LJJIJLIJ != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dataLoaderHelper);
                    arrayList.add(c1475130oUR);
                    dataLoaderHelper.LJJIJLIJ.LIZ(115, arrayList);
                    return;
                }
                C1475460oUy.LIZ(c1475130oUR, dataLoaderHelper);
                return;
            }
            return;
        }
        if (c1475130oUR == null) {
            return;
        }
        if (dataLoaderHelper.LJJIJLIJ != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(dataLoaderHelper);
            arrayList2.add(c1475130oUR);
            dataLoaderHelper.LJJIJLIJ.LIZ(115, arrayList2);
            return;
        }
        dataLoaderHelper.LJFF(c1475130oUR);
    }

    public static void LJIILJJIL(final C1469210oKt c1469210oKt) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLJJI.getClass();
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", C786410Ut5.j4("copyCache, fileKey: %s, destPath: %s, mForceCopyUnfinished: %b, mWaitIfCaching: %b, minDurationMs: %d", new Object[]{c1469210oKt.LIZ, c1469210oKt.LIZIZ, Boolean.valueOf(c1469210oKt.LIZLLL), Long.valueOf(c1469210oKt.LJ), Long.valueOf(c1469210oKt.LJ)}));
            AVMDLCopyOperation aVMDLCopyOperation = new AVMDLCopyOperation(c1469210oKt.LIZ, c1469210oKt.LIZIZ, c1469210oKt.LIZLLL, c1469210oKt.LIZJ, new AVMDLCopyOperationListener() { // from class: X.0oVd
                @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
                public final void onFileInfo(AVMDLFileInfo aVMDLFileInfo) {
                    InterfaceC1475890oVf interfaceC1475890oVf = c1469210oKt.LJFF;
                    if (interfaceC1475890oVf != null) {
                        C1475880oVe c1475880oVe = new C1475880oVe();
                        c1475880oVe.LIZ = aVMDLFileInfo.mContentLenght;
                        c1475880oVe.LIZIZ = aVMDLFileInfo.mCacheSize;
                        interfaceC1475890oVf.LIZ(c1475880oVe);
                    }
                }

                @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
                public final void onCopyComplete(boolean z, int i2, String str) {
                    InterfaceC1475890oVf interfaceC1475890oVf = c1469210oKt.LJFF;
                    if (interfaceC1475890oVf != null) {
                        interfaceC1475890oVf.onCopyComplete(z, i2, str);
                    }
                }
            });
            aVMDLCopyOperation.mCustomDir = null;
            aVMDLCopyOperation.setMinDurationMs(c1469210oKt.LJ);
            if (dataLoaderHelper.LIZIZ == 0) {
                dataLoaderHelper.LJJ.LIZJ(1);
                try {
                    AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.asyncCopyOperation(aVMDLCopyOperation);
                    }
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                dataLoaderHelper.LJJ.LJFF(1);
                return;
            }
            return;
        }
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("DataLoaderHelper", C786410Ut5.j4("copyCache, fileKey: %s, destPath: %s, mForceCopyUnfinished: %b, mWaitIfCaching: %b, minDurationMs: %d", new Object[]{c1469210oKt.LIZ, c1469210oKt.LIZIZ, Boolean.valueOf(c1469210oKt.LIZLLL), Long.valueOf(c1469210oKt.LJ), Long.valueOf(c1469210oKt.LJ)}));
        AVMDLCopyOperation aVMDLCopyOperation2 = new AVMDLCopyOperation(c1469210oKt.LIZ, c1469210oKt.LIZIZ, c1469210oKt.LIZLLL, c1469210oKt.LIZJ, new AVMDLCopyOperationListener() { // from class: X.0oVc
            @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
            public final void onFileInfo(AVMDLFileInfo aVMDLFileInfo) {
                InterfaceC1475890oVf interfaceC1475890oVf = c1469210oKt.LJFF;
                if (interfaceC1475890oVf != null) {
                    C1475880oVe c1475880oVe = new C1475880oVe();
                    c1475880oVe.LIZ = aVMDLFileInfo.mContentLenght;
                    c1475880oVe.LIZIZ = aVMDLFileInfo.mCacheSize;
                    interfaceC1475890oVf.LIZ(c1475880oVe);
                }
            }

            @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
            public final void onCopyComplete(boolean z, int i3, String str) {
                InterfaceC1475890oVf interfaceC1475890oVf = c1469210oKt.LJFF;
                if (interfaceC1475890oVf != null) {
                    interfaceC1475890oVf.onCopyComplete(z, i3, str);
                }
            }
        });
        aVMDLCopyOperation2.mCustomDir = null;
        aVMDLCopyOperation2.setMinDurationMs(c1469210oKt.LJ);
        if (dataLoaderHelper.LIZIZ == 0) {
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                if (aVMDLDataLoader2 != null) {
                    aVMDLDataLoader2.asyncCopyOperation(aVMDLCopyOperation2);
                }
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
            dataLoaderHelper.LJJ.LJFF(1);
        }
    }

    public static void LJLJLLL(Map map) {
        HashMap map2 = (HashMap) map;
        if (map2.size() > 0) {
            try {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setAppInfo:");
                sbLIZ.append(map.toString());
                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
                C1309170kAl.LIZ = C795730VJj.LJIILIIL(map2.get("appid"));
                C1309170kAl.LIZIZ = (String) map2.get("appname");
                C1309170kAl.LIZJ = (String) map2.get("appchannel");
                C1309170kAl.LIZLLL = (String) map2.get("appversion");
                if (map2.containsKey("screen_height")) {
                    C1309170kAl.LJII = ((Integer) map2.get("screen_height")).intValue();
                }
                if (map2.containsKey("screen_width")) {
                    C1309170kAl.LJI = ((Integer) map2.get("screen_width")).intValue();
                }
                if (map2.containsKey("device_id_secret")) {
                    C1309170kAl.LJIIIIZZ = (String) map2.get("device_id_secret");
                }
                if (map2.containsKey("deviceid")) {
                    C1309170kAl.LJ = (String) map2.get("deviceid");
                }
                if (map2.containsKey("region")) {
                    C1309170kAl.LJFF = (String) map2.get("region");
                }
                C790230UzF.LIZ.LIZIZ(C1309170kAl.LIZ(), map);
                C1309100kAe c1309100kAe = C1309150kAj.LIZ;
                c1309100kAe.LIZIZ();
                c1309100kAe.LJFF();
                if (TextUtils.isEmpty(C1468180oJE.LJJZZIII)) {
                    C1468180oJE.LJJZZIII = C2094908Ip.LIZ(C1309170kAl.LJ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("EngineConfigHelper", e.toString());
            }
        }
    }

    public static void LJLLLLLL(C1475120oUQ c1475120oUQ) {
        C805420Vie.LIZ.LIZ.LIZ = c1475120oUQ;
    }

    public static void LLFZ(C1469270oKz c1469270oKz) {
        C790230UzF.LIZ.LJIL = c1469270oKz;
    }

    public static void LLIFFJFJJ(C1475920oVi c1475920oVi) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.LJJ.LIZJ(0);
        try {
            AVMDLDataLoader.getInstance().setEventListener(c1475920oVi);
            dataLoaderHelper.LJJ.LJFF(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dataLoaderHelper.LJJ.LJFF(0);
            throw th;
        }
    }

    public static void LLIIIZ(C1468510oJl c1468510oJl) {
        C1468070oJ3.LIZ().LIZ.LJ = c1468510oJl;
    }

    public static void LLIIL(ExecutorService executorService) {
        int i = C2187451AjH.LIZ;
        C1471660oOq.LIZJ("TTVideoEngine", "set player threadpool");
        synchronized (C1471820oP6.class) {
            C1471820oP6.LIZ = executorService;
        }
    }

    public static void LLIILII(C1474720oTm c1474720oTm) {
        C1469160oKo c1469160oKo = C790230UzF.LIZ;
        c1469160oKo.LJIILLIIL.lock();
        try {
            if (c1469160oKo.LIZJ == null) {
                c1469160oKo.LIZJ().setAppServer(new C1474760oTq(c1469160oKo));
            }
            c1469160oKo.LIZJ = c1474720oTm;
            c1469160oKo.LJIILLIIL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1469160oKo.LJIILLIIL.unlock();
            throw th;
        }
    }

    public static void LLILIL(C797000VOg c797000VOg) {
        C1469160oKo c1469160oKo = C790230UzF.LIZ;
        c1469160oKo.LJIILLIIL.lock();
        try {
            c1469160oKo.LJFF = c797000VOg;
            c1469160oKo.LJIILLIIL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1469160oKo.LJIILLIIL.unlock();
            throw th;
        }
    }

    public static void LLILL(C1468690oK3 c1468690oK3) {
        C790230UzF.LIZ.LIZIZ = c1468690oK3;
    }

    public static void LLJI(String str) {
        synchronized (C1468740oK8.class) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    C1468750oK9.LJI = str;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LLJJIJIL(int i) {
        LJI = i;
        if (i == 2) {
            C805420Vie.LIZ.LJJJJL(112, 500);
        } else {
            C805420Vie.LIZ.LJJJJL(112, 0);
        }
    }

    public static void LLJJJ(Context context) throws Exception {
        final C1309090kAd c1309090kAd;
        final C1309090kAd c1309090kAd2;
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJJLIIJ.getClass();
            if (context == null) {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("DataLoaderHelper", "set context null");
            } else {
                dataLoaderHelper.LJJ.LIZJ(2);
                try {
                    if (dataLoaderHelper.LJIIJ == null) {
                        C1309100kAe c1309100kAe = C1309150kAj.LIZ;
                        c1309100kAe.LJI(context);
                        if (c1309100kAe.LIZIZ != null && (c1309090kAd2 = c1309100kAe.LIZ) != null) {
                            DCThreadPool.addTask(new Runnable() { // from class: X.0kAh
                                public final /* synthetic */ int LL = 2;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("SettingsManager@6c19.loadLocal$1");
                                    try {
                                        if ((this.LL & 8) > 0) {
                                            c1309090kAd2.LIZ("common");
                                        }
                                        if ((this.LL & 16) > 0) {
                                            c1309090kAd2.LIZ("vod");
                                        }
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("SettingsManager@6c19.loadLocal$1");
                                }
                            });
                        }
                    }
                    dataLoaderHelper.LJIIJ = context;
                    dataLoaderHelper.LJJ.LJFF(2);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("set context end");
                    sbLIZ.append(context);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                } finally {
                }
            }
        } else if (context == null) {
            int i3 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "set context null");
        } else {
            dataLoaderHelper.LJJ.LIZJ(2);
            try {
                if (dataLoaderHelper.LJIIJ == null) {
                    C1309100kAe c1309100kAe2 = C1309150kAj.LIZ;
                    c1309100kAe2.LJI(context);
                    if (c1309100kAe2.LIZIZ != null && (c1309090kAd = c1309100kAe2.LIZ) != null) {
                        DCThreadPool.addTask(new Runnable() { // from class: X.0kAh
                            public final /* synthetic */ int LL = 2;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SettingsManager@6c19.loadLocal$1");
                                try {
                                    if ((this.LL & 8) > 0) {
                                        c1309090kAd.LIZ("common");
                                    }
                                    if ((this.LL & 16) > 0) {
                                        c1309090kAd.LIZ("vod");
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SettingsManager@6c19.loadLocal$1");
                            }
                        });
                    }
                }
                dataLoaderHelper.LJIIJ = context;
                dataLoaderHelper.LJJ.LJFF(2);
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set context end");
                sbLIZ2.append(context);
                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
            } finally {
            }
        }
        try {
            dataLoaderHelper.LJJJJZ();
            TTVideoEngineLog.d("TTVideoEngine", "DataLoader Start");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i5 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("TTVideoEngine", "DataLoader Start Fail");
            throw e;
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LIZLLL(s sVar) {
        this.LIZ.LIZLLL(sVar);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJ(boolean z) {
        this.LIZ.LJ(z);
    }

    public final void LJIIIZ(C0MRO c0mro) {
        this.LIZ.LLIFFJFJJ(c0mro);
    }

    public final void LJIILIIL(EnumC2281151EQn enumC2281151EQn) {
        C1466990oHJ c1466990oHJ = this.LIZ;
        if (enumC2281151EQn == null) {
            c1466990oHJ.getClass();
        } else {
            c1466990oHJ.LJJLIIIIJ(enumC2281151EQn, null);
        }
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJIJ(String str) {
        this.LIZ.LJIJ(str);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJIJI(String str) {
        this.LIZ.LJIJI(str);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJIL(InterfaceC1467050oHP interfaceC1467050oHP) {
        this.LIZ.LJIL(interfaceC1467050oHP);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJII(AudioProcessor audioProcessor) {
        this.LIZ.LJJII(audioProcessor);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIIJ(C1469110oKj c1469110oKj) {
        this.LIZ.LJJIIJ(c1469110oKj);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIIZ(String str) {
        this.LIZ.LJJIIZ(str);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIIZI(C1467630oIL c1467630oIL) {
        C1475710oVN.LIZ();
        this.LIZ.LJJIIZI(c1467630oIL);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIJ(int[] iArr) {
        this.LIZ.LJJIJ(iArr);
    }

    public final float LJJJJLI(int i) {
        return this.LIZ.LLJI(i);
    }

    public final int LJJJJZI(int i) {
        return this.LIZ.LJIIJ(i);
    }

    public final long LJJJLZIJ(int i) {
        return this.LIZ.LLJILJIL(i);
    }

    public final String LJJLIIIJJIZ(int i) {
        return this.LIZ.LLJJIJI(i);
    }

    public final void LJLJJL(C0MRO c0mro) {
        this.LIZ.LLLLIL(c0mro);
    }

    public final void LJLJL(C1469120oKk c1469120oKk) {
        this.LIZ.LLLLL(c1469120oKk);
    }

    public final void LJLLLL(String str) {
        this.LIZ.LLLLLJLJLL(str);
    }

    public final void LJLZ(InterfaceC1467770oIZ interfaceC1467770oIZ) {
        this.LIZ.LLLLLZ = interfaceC1467770oIZ;
    }

    public final void LJZL(String str) {
        this.LIZ.LLLLLLL(str);
    }

    public final void LLFF(String str) {
        this.LIZ.r = str;
    }

    public final void LLFFF(String str) {
        this.LIZ.g6.LJIIJJI = str;
    }

    public final void LLI(a4 a4Var) {
        this.LIZ.LLLLLZL.LLILLJJLI = a4Var;
    }

    public final void LLIIIJ(InterfaceC1467890oIl interfaceC1467890oIl) {
        this.LIZ.LLLLLLZ(interfaceC1467890oIl);
    }

    public final void LLIIIL(AbstractC1468760oKA abstractC1468760oKA) {
        this.LIZ.LLLLLLZZ = abstractC1468760oKA;
    }

    public final void LLILII(int i) {
        this.LIZ.LLLLLZ(i);
    }

    public final void LLILLIZIL(InterfaceC1469380oLA interfaceC1469380oLA) {
        this.LIZ.LLLLLZL.LLILZ = interfaceC1469380oLA;
    }

    public final void LLILLL(C1468920oKQ c1468920oKQ) {
        this.LIZ.LLLLLZIL(c1468920oKQ);
    }

    public void LLILZIL(String str) {
        this.LIZ.LJJJJLL(str);
    }

    public void LLIZ(SurfaceHolder surfaceHolder) {
        this.LIZ.LLLLZ(surfaceHolder);
    }

    public final void LLJ(Surface surface) {
        this.LIZ.LLLLZLL(surface);
    }

    public void LLJIJIL(String str) {
        this.LIZ.LJJJJZ(str);
    }

    public final void LLJILJIL(String str) {
        this.LIZ.LLLLZLLIL(str);
    }

    public final void LLJILJILJ(C1469370oL9 c1469370oL9) {
        this.LIZ.LLLLLZL.LLILLL = c1469370oL9;
    }

    public void LLJILLL(InterfaceC1469360oL8 interfaceC1469360oL8) {
        this.LIZ.LLLLLZL.LL = interfaceC1469360oL8;
    }

    public void LLJJ(InterfaceC1467780oIa interfaceC1467780oIa) {
        this.LIZ.LLLLZLL = interfaceC1467780oIa;
    }

    public final void LLJJI(C1469200oKs c1469200oKs) {
        this.LIZ.LLLLLZL.LL = c1469200oKs;
    }

    public void LLJJIII(InterfaceC1467760oIY interfaceC1467760oIY) {
        this.LIZ.LLLLZIL = interfaceC1467760oIY;
    }

    public final void LLJJIJI(C1470240oMY c1470240oMY) {
        C1475710oVN.LIZ();
        this.LIZ.LJIL(c1470240oMY);
    }

    public final void LLJJIJIIJIL(Map<String, String> map) {
        this.LIZ.LLLLZLLLI(map);
    }

    @Override // X.InterfaceC1467390oHx
    public final void setLooping(boolean z) {
        this.LIZ.setLooping(z);
    }

    @Override // X.InterfaceC1467390oHx
    public void setSurface(Surface surface) {
        this.LIZ.setSurface(surface);
    }

    public TTVideoEngine(Context context, int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, type:");
        sbLIZ.append(i);
        sbLIZ.append(", this:");
        sbLIZ.append(this);
        sbLIZ.append(", version:");
        sbLIZ.append("1.10.291.6-mt");
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = LJJIJIIJI(context, i, null, this);
    }

    public static void LJFF(String str, List list) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        int i = 0;
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLIIIL.getClass();
            if (list != null) {
                if (str == null) {
                    str = C1469230oKv.LIZ.LIZ;
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[preload] add preload  mediaList, size = ");
                sbLIZ.append(list.size());
                sbLIZ.append(", sceneId = ");
                sbLIZ.append(str);
                sbLIZ.append(", mode = ");
                sbLIZ.append(dataLoaderHelper.LJJLIIIJL);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                if (dataLoaderHelper.LJJLIIIJL == 1) {
                    if (dataLoaderHelper.LJJIJLIJ != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(dataLoaderHelper);
                        arrayList.add(list);
                        arrayList.add(str);
                        dataLoaderHelper.LJJIJLIJ.LIZ(119, arrayList);
                        return;
                    }
                    C1475470oUz.LIZIZ(list, str, dataLoaderHelper);
                    return;
                }
                while (i < list.size()) {
                    C1475280oUg c1475280oUg = (C1475280oUg) ListProtector.get(list, i);
                    c1475280oUg.LIZIZ = str;
                    if (!(c1475280oUg instanceof C1475440oUw) && (c1475280oUg instanceof C1475130oUR)) {
                        if (i == list.size() - 1) {
                            ((C1475130oUR) c1475280oUg).LJIL = true;
                        }
                        C1475130oUR c1475130oUR = (C1475130oUR) c1475280oUg;
                        if (C1475470oUz.LIZLLL(c1475130oUR)) {
                            C1475470oUz.LJ(c1475130oUR, c1475130oUR.LIZIZ, dataLoaderHelper);
                        }
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (list == null) {
            return;
        }
        if (str == null) {
            str = C1469230oKv.LIZ.LIZ;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[preload] add preload  mediaList, size = ");
        sbLIZ2.append(list.size());
        sbLIZ2.append(", sceneId = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", mode = ");
        sbLIZ2.append(dataLoaderHelper.LJJLIIIJL);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (dataLoaderHelper.LJJLIIIJL == 1) {
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(dataLoaderHelper);
                arrayList2.add(list);
                arrayList2.add(str);
                dataLoaderHelper.LJJIJLIJ.LIZ(119, arrayList2);
                return;
            }
            dataLoaderHelper.LJ(str, list);
            return;
        }
        while (i < list.size()) {
            C1475280oUg c1475280oUg2 = (C1475280oUg) ListProtector.get(list, i);
            c1475280oUg2.LIZIZ = str;
            if (!(c1475280oUg2 instanceof C1475440oUw) && (c1475280oUg2 instanceof C1475130oUR)) {
                if (i == list.size() - 1) {
                    ((C1475130oUR) c1475280oUg2).LJIL = true;
                }
                C1475130oUR c1475130oUR2 = (C1475130oUR) c1475280oUg2;
                if (C1474810oTv.LJJIFFI()) {
                    dataLoaderHelper.LJLIIIL.getClass();
                    if (C1475470oUz.LIZLLL(c1475130oUR2)) {
                        C1475470oUz.LJ(c1475130oUR2, c1475130oUR2.LIZIZ, dataLoaderHelper);
                    }
                } else if (DataLoaderHelper.LJIIIZ(c1475130oUR2)) {
                    String str2 = c1475130oUR2.LIZIZ;
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLIIIL.getClass();
                        C1475470oUz.LJ(c1475130oUR2, str2, dataLoaderHelper);
                    } else if (dataLoaderHelper.LJJIJLIJ != null) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(dataLoaderHelper);
                        arrayList3.add(c1475130oUR2);
                        arrayList3.add(str2);
                        dataLoaderHelper.LJJIJLIJ.LIZ(111, arrayList3);
                    } else {
                        dataLoaderHelper.LIZLLL(c1475130oUR2, str2);
                    }
                }
            }
            i++;
        }
    }

    public static void LJIIJ(int i, int i2) {
        C790230UzF.LIZ.LIZJ().businessEvent(i, i2);
    }

    public static void LJIIJJI(int i, String str) {
        if (31224 == i) {
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            dataLoaderHelper.getClass();
            if (C1474810oTv.LJJIFFI()) {
                dataLoaderHelper.LJLIIIL.getClass();
                if (dataLoaderHelper.LJJIJLIJ != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dataLoaderHelper);
                    arrayList.add(str);
                    dataLoaderHelper.LJJIJLIJ.LIZ(118, arrayList);
                    return;
                }
                C790230UzF.LIZ.LIZJ().businessEvent(31224, str);
                return;
            }
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(dataLoaderHelper);
                arrayList2.add(str);
                dataLoaderHelper.LJJIJLIJ.LIZ(118, arrayList2);
                return;
            }
            C790230UzF.LIZ.LIZJ().businessEvent(31224, str);
            return;
        }
        C790230UzF.LIZ.LIZJ().businessEvent(i, str);
    }

    public static C1474520oTS LJJIJLIJ(InterfaceC1467050oHP interfaceC1467050oHP, int i) {
        C1474520oTS c1474520oTS = null;
        if (interfaceC1467050oHP != null) {
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            List<C1474520oTS> listLJIILL = interfaceC1467050oHP.LJIILL();
            if (listLJIILL != null && !listLJIILL.isEmpty()) {
                long j = 0;
                for (C1474520oTS c1474520oTS2 : listLJIILL) {
                    if (!z || c1474520oTS2.LJFF() == i) {
                        long jLJJIIJ = C805420Vie.LIZ.LJJIIJ(c1474520oTS2.LIZ(15));
                        if (jLJJIIJ > j) {
                            c1474520oTS = c1474520oTS2;
                            j = jLJJIIJ;
                        }
                    }
                }
            }
        }
        return c1474520oTS;
    }

    public static long LJJIZ(InterfaceC1467050oHP interfaceC1467050oHP, EnumC2281151EQn enumC2281151EQn) {
        long jLJJIIJ = 0;
        if (interfaceC1467050oHP == null || enumC2281151EQn == null) {
            return 0L;
        }
        C1474520oTS c1474520oTSLJIJJLI = interfaceC1467050oHP.LJIJJLI(enumC2281151EQn, 0, null, false);
        if (c1474520oTSLJIJJLI != null) {
            jLJJIIJ = 0 + C805420Vie.LIZ.LJJIIJ(c1474520oTSLJIJJLI.LIZ(15));
        }
        C1474520oTS c1474520oTSLJIJJLI2 = interfaceC1467050oHP.LJIJJLI(enumC2281151EQn, 1, null, true);
        if (c1474520oTSLJIJJLI2 != null) {
            return jLJJIIJ + C805420Vie.LIZ.LJJIIJ(c1474520oTSLJIJJLI2.LIZ(15));
        }
        return jLJJIIJ;
    }

    public static void LJLJLJ(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[strategy] setAlgorithmJson key=");
        sbLIZ.append(i);
        sbLIZ.append(" jsonString");
        sbLIZ.append(str);
        TTVideoEngineLog.d("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        C790230UzF.LIZ.LJIIJ(i, str);
    }

    public static void LLF(int i, float f) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTVideoEngine.setFloatValue key=");
        sbLIZ.append(i);
        sbLIZ.append(" value=");
        sbLIZ.append(f);
        C1471660oOq.LIZJ("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 738) {
            if (i == 739) {
                LJIIJJI(1004, Float.toString(f));
                return;
            }
            return;
        }
        if (f == Float.NaN || f <= 0.0f) {
            return;
        }
        C1469180oKq c1469180oKq = C1469220oKu.LIZ;
        Float fValueOf = Float.valueOf(f);
        if (c1469180oKq.LIZ.containsKey("device_score") && c1469180oKq.LIZ.get("device_score") != null && !c1469180oKq.LIZ.get("device_score").equals(fValueOf)) {
            Iterator<C0V1G> it2 = c1469180oKq.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(fValueOf);
            }
        } else if (!c1469180oKq.LIZ.containsKey("device_score")) {
            Iterator<C0V1G> it3 = c1469180oKq.LIZIZ.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(fValueOf);
            }
        } else {
            TTVideoEngineLog.d("PortraitEngine", "same label");
        }
        c1469180oKq.LIZ.put("device_score", fValueOf);
        C805420Vie.LIZ.LJJJJL(123, (int) (f * 10.0f));
    }

    public static void LLFII(int i, int i2) {
        if (i != 719) {
            if (i != 720) {
                if (i != 960) {
                    if (i != 961) {
                        boolean z = false;
                        if (i != 966) {
                            if (i != 967) {
                                if (i != 4316) {
                                    if (i != 4317) {
                                        switch (i) {
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                C790030Uyv.LIZ.LJII = i2;
                                                C805420Vie.LIZ.LJJJJL(i, i2);
                                                int i3 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("set enablePcdnAuto:");
                                                sbLIZ.append(i2);
                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
                                                break;
                                            case 112:
                                                if (i2 > 0) {
                                                    LJI = 2;
                                                    C805420Vie.LIZ.LJJJJL(112, i2);
                                                } else {
                                                    LJI = 1;
                                                    C805420Vie.LIZ.LJJJJL(112, 0);
                                                }
                                                break;
                                            case 672:
                                                int i4 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("do set static render type, value = ");
                                                sbLIZ2.append(i2);
                                                C1471660oOq.LIZJ("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                                C790030Uyv.LIZ.LIZ = i2;
                                                break;
                                            case 674:
                                                int i5 = C2187451AjH.LIZ;
                                                C1471660oOq.LIZJ("EngineConfigHelper", "enable https for fetch");
                                                C790040Uyw.LIZ = i2;
                                                break;
                                            case 676:
                                                LJIIJ(1002, i2);
                                                break;
                                            case 684:
                                                break;
                                            case 689:
                                                int i6 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("do set static enable cpp opt bvc1, value = ");
                                                sbLIZ3.append(i2);
                                                C1471660oOq.LIZJ("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                                C790030Uyv.LIZ.LJ = i2;
                                                break;
                                            case 702:
                                                C790030Uyv.LIZ.LIZIZ = i2;
                                                int i7 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("set log level:");
                                                sbLIZ4.append(i2);
                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                                break;
                                            case 737:
                                                C790030Uyv.LIZ.LJI = i2;
                                                int i8 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("set lazy load videodec:");
                                                sbLIZ5.append(i2);
                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                                break;
                                            case 748:
                                                LJIIIZ = i2;
                                                if (i2 != 0) {
                                                    C1470430oMr.LJJIFFI(1365, 0);
                                                }
                                                break;
                                            case 964:
                                                LJIIJ = i2;
                                                break;
                                            case 969:
                                                if (i2 == 1) {
                                                    z = true;
                                                }
                                                LJIIJJI = z;
                                                break;
                                            case 1226:
                                                LJIILIIL = i2;
                                                break;
                                            case 1501:
                                                C790030Uyv.LIZ.LIZJ = i2;
                                                int i9 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("set log level percise:");
                                                sbLIZ6.append(i2);
                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ6));
                                                break;
                                            case 1806:
                                                C1470430oMr.LJJIFFI(1309, i2);
                                                break;
                                            case 4102:
                                                C1470430oMr.LJJIFFI(1308, i2);
                                                break;
                                            case 4320:
                                                C1470430oMr.LJJIFFI(1381, i2);
                                                break;
                                            case 4323:
                                                C1470430oMr.LJJIFFI(1388, i2);
                                                break;
                                            case 50006:
                                                C790030Uyv.LIZ.LJIIJJI = i2;
                                                C790230UzF.LIZ.LJIIJJI(i, i2);
                                                break;
                                            case 50142:
                                                C790030Uyv.LIZ.LJIIL = i2;
                                                C790230UzF.LIZ.LJIIJJI(i, i2);
                                                break;
                                            default:
                                                switch (i) {
                                                    case 4306:
                                                        C1470430oMr.LJJIFFI(1372, i2);
                                                        break;
                                                    case 4307:
                                                        C1470430oMr.LJJIFFI(1369, i2);
                                                        break;
                                                    case 4308:
                                                        C1470430oMr.LJJIFFI(1370, i2);
                                                        break;
                                                    case 4309:
                                                        C1470430oMr.LJJIFFI(1374, i2);
                                                        break;
                                                    case 4310:
                                                        C1470430oMr.LJJIFFI(1375, i2);
                                                        break;
                                                    case 4311:
                                                        C1470430oMr.LJJIFFI(1373, i2);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 4329:
                                                                C1470430oMr.LJJIFFI(4329, i2);
                                                                break;
                                                            case 4330:
                                                                C1470430oMr.LJJIFFI(4330, i2);
                                                                break;
                                                            case 4331:
                                                                C1470430oMr.LJJIFFI(1396, i2);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 750:
                                                                        if (i2 != 0 && LJIIIZ == 0) {
                                                                            C1470430oMr.LJJIFFI(1365, 1);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 751:
                                                                        C790030Uyv.LIZ.LJIILJJIL = i2;
                                                                        C805420Vie.LIZ.LJJ.LJI(i2);
                                                                        break;
                                                                    case 752:
                                                                        C790030Uyv.LIZ.LJIILL = i2;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 971:
                                                                                if (i2 == 1) {
                                                                                    z = true;
                                                                                }
                                                                                C1468090oJ5.LJFF = z;
                                                                                int i10 = C2187451AjH.LIZ;
                                                                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                                sbLIZ7.append("TTVideoEngine.sCpuRefreshFix key=");
                                                                                sbLIZ7.append(z);
                                                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ7));
                                                                                break;
                                                                            case 972:
                                                                                if (i2 == 1) {
                                                                                    z = true;
                                                                                }
                                                                                C1468090oJ5.LJI = z;
                                                                                int i11 = C2187451AjH.LIZ;
                                                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                sbLIZ8.append("TTVideoEngine.sUseNativeThread key=");
                                                                                sbLIZ8.append(z);
                                                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ8));
                                                                                break;
                                                                            case 973:
                                                                                LJIIL = i2;
                                                                                int i12 = C2187451AjH.LIZ;
                                                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                                                sbLIZ9.append("TTVideoEngine.sBuryDataOptimizeV2:");
                                                                                sbLIZ9.append(i2);
                                                                                TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ9));
                                                                                break;
                                                                            case 974:
                                                                                if (i2 == 1) {
                                                                                    z = true;
                                                                                }
                                                                                LJIILJJIL = z;
                                                                                break;
                                                                            case 975:
                                                                                C1470430oMr.LJJIFFI(1356, i2);
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 1075:
                                                                                        C790030Uyv.LIZ.LJIJ = i2;
                                                                                        break;
                                                                                    case 1076:
                                                                                        break;
                                                                                    case 1077:
                                                                                        LJIIZILJ = i2;
                                                                                        break;
                                                                                    case 1078:
                                                                                        C20511081t.LJ().LIZ = i2;
                                                                                        break;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 1801:
                                                                                                C1470430oMr.LJJIFFI(1306, i2);
                                                                                                break;
                                                                                            case 1802:
                                                                                                C1470430oMr.LJJIFFI(1307, i2);
                                                                                                break;
                                                                                            case 1803:
                                                                                                C1470430oMr.LJJIFFI(1367, i2);
                                                                                                break;
                                                                                            case 1804:
                                                                                                C1470430oMr.LJJIFFI(1368, i2);
                                                                                                break;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 1808:
                                                                                                        LJIJ = i2;
                                                                                                        C1470430oMr.LJJIFFI(1390, i2);
                                                                                                        break;
                                                                                                    case 1809:
                                                                                                        C1470430oMr.LJJIFFI(1392, i2);
                                                                                                        break;
                                                                                                    case 1810:
                                                                                                        C1470430oMr.LJJIFFI(1393, i2);
                                                                                                        break;
                                                                                                    case 1811:
                                                                                                        C1470430oMr.LJJIFFI(1394, i2);
                                                                                                        break;
                                                                                                    case 1812:
                                                                                                        C1470430oMr.LJJIFFI(1398, i2);
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 4026:
                                                                                                                C790030Uyv.LIZ.LJIIJ = i2;
                                                                                                                break;
                                                                                                            case 4027:
                                                                                                                C790030Uyv.LIZ.LJIIIZ = i2;
                                                                                                                break;
                                                                                                            case 4028:
                                                                                                                C790030Uyv.LIZ.LJIILIIL = i2;
                                                                                                                break;
                                                                                                            default:
                                                                                                                C805420Vie.LIZ.LJJJJL(i, i2);
                                                                                                                if (i != 120) {
                                                                                                                    if (i == 121) {
                                                                                                                        C1469260oKy.LIZIZ = i2;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    C1469260oKy.LIZ = i2;
                                                                                                                }
                                                                                                                C790230UzF.LIZ.LJIIJJI(i, i2);
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
                                                        break;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                    C1470430oMr.LJJIFFI(1380, i2);
                                    return;
                                }
                                C1470430oMr.LJJIFFI(4316, i2);
                                return;
                            }
                            if (i2 > 0) {
                                z = true;
                            }
                            EngineThreadPool.setOptimizeEnabled(z);
                            return;
                        }
                        if (i2 > 0) {
                            z = true;
                        }
                        EngineThreadPool.setOptimizeLock(z);
                        return;
                    }
                    LJIIIIZZ = i2;
                    C1470430oMr.LJJIFFI(1016, i2);
                    return;
                }
                LJII = i2;
                C1470430oMr.LJJIFFI(1015, i2);
                return;
            }
            C790030Uyv.LIZ.LJFF = i2;
            int i13 = C2187451AjH.LIZ;
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("set use realbitrate:");
            sbLIZ10.append(i2);
            TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ10));
            return;
        }
        int i14 = C2187451AjH.LIZ;
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("enable bmf");
        sbLIZ11.append(i2);
        TTVideoEngineLog.d("EngineConfigHelper", C2188811AlT.LIZIZ(sbLIZ11));
    }

    public static void LLIIIILZ(int i, long j) {
        int i2;
        int i3;
        boolean z;
        if (i == 217) {
            C790030Uyv.LIZ.LIZLLL = j;
            return;
        }
        if (i == 745) {
            C790030Uyv.LIZ.LJIIIIZZ = j;
            return;
        }
        boolean z2 = false;
        if (i == 4300) {
            C1468060oJ2 c1468060oJ2 = C790030Uyv.LIZ;
            long[] jArr = c1468060oJ2.LJIILLIIL;
            if (jArr[0] != j) {
                z = true;
            } else {
                z = false;
            }
            jArr[0] = j;
            if (!z) {
                return;
            }
            c1468060oJ2.LJIIZILJ = true;
            return;
        }
        if (i == 4301) {
            C1468060oJ2 c1468060oJ22 = C790030Uyv.LIZ;
            long[] jArr2 = c1468060oJ22.LJIILLIIL;
            if (jArr2[1] != j) {
                z2 = true;
            }
            jArr2[1] = j;
            if (!z2) {
                return;
            }
            c1468060oJ22.LJIIZILJ = true;
            return;
        }
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJJZZIII.getClass();
            dataLoaderHelper.LJJ.LIZJ(1);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setLongValue key = ");
            sbLIZ.append(i);
            sbLIZ.append(", value = ");
            sbLIZ.append(j);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            try {
                try {
                    if (i != 62) {
                        if (i != 1142) {
                            if (i != 1144) {
                                if (i != 1152) {
                                    if (i == 1153) {
                                        dataLoaderHelper.LJIIIZ.mMonitorMinAllowLoadSize = j;
                                    } else {
                                        switch (i) {
                                            case 22:
                                                i3 = 7210;
                                                break;
                                            case 23:
                                                i3 = 7211;
                                                break;
                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                i3 = 7212;
                                                break;
                                            case 25:
                                                i3 = 7213;
                                                break;
                                            case 26:
                                                i3 = 7214;
                                                break;
                                            case 27:
                                                i3 = 7215;
                                                break;
                                            case 28:
                                                i3 = 7338;
                                                break;
                                        }
                                    }
                                } else {
                                    dataLoaderHelper.LJIIIZ.mMonitorTimeInternal = j;
                                }
                            } else {
                                dataLoaderHelper.LJIIIZ.mConnectPoolStragetyValue = j;
                            }
                        } else {
                            dataLoaderHelper.LJIIIZ.mP2PStragetyLevel = j;
                        }
                        i3 = -1;
                    } else {
                        i3 = 1100;
                    }
                    AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.setLongValue(i3, j);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setLongValue failed, key: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", value: ");
                    sbLIZ2.append(j);
                    C1471660oOq.LIZIZ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                }
                dataLoaderHelper.LJJ.LJFF(1);
                return;
            } finally {
            }
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        int i6 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setLongValue key = ");
        sbLIZ3.append(i);
        sbLIZ3.append(", value = ");
        sbLIZ3.append(j);
        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
        try {
            try {
                if (i != 62) {
                    if (i != 1142) {
                        if (i != 1144) {
                            if (i != 1152) {
                                if (i == 1153) {
                                    dataLoaderHelper.LJIIIZ.mMonitorMinAllowLoadSize = j;
                                } else {
                                    switch (i) {
                                        case 22:
                                            i2 = 7210;
                                            break;
                                        case 23:
                                            i2 = 7211;
                                            break;
                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                            i2 = 7212;
                                            break;
                                        case 25:
                                            i2 = 7213;
                                            break;
                                        case 26:
                                            i2 = 7214;
                                            break;
                                        case 27:
                                            i2 = 7215;
                                            break;
                                        case 28:
                                            i2 = 7338;
                                            break;
                                    }
                                }
                            } else {
                                dataLoaderHelper.LJIIIZ.mMonitorTimeInternal = j;
                            }
                        } else {
                            dataLoaderHelper.LJIIIZ.mConnectPoolStragetyValue = j;
                        }
                    } else {
                        dataLoaderHelper.LJIIIZ.mP2PStragetyLevel = j;
                    }
                    i2 = -1;
                } else {
                    i2 = 1100;
                }
                AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                if (aVMDLDataLoader2 != null) {
                    aVMDLDataLoader2.setLongValue(i2, j);
                }
            } finally {
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("setLongValue failed, key: ");
            sbLIZ4.append(i);
            sbLIZ4.append(", value: ");
            sbLIZ4.append(j);
            C1471660oOq.LIZIZ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
        }
        dataLoaderHelper.LJJ.LJFF(1);
    }

    public static void LLIL(Context context, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setReportLogByEngine ");
        sbLIZ.append(z);
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        if (context == null) {
            C1471660oOq.LIZIZ("TTVideoEngine", "setReportLogByEngine context is null");
            return;
        }
        Method method = C0WPO.LIZIZ;
        C0WPO c0wpo = C0WPP.LIZ;
        c0wpo.LIZ = C786410Ut5.N3(context);
        if (z) {
            C805420Vie.LIZ.LJJJJJL(c0wpo);
            C0WPS.instance.setEngineUploader(c0wpo);
        } else {
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            synchronized (dataLoaderHelper) {
                dataLoaderHelper.LJIILJJIL = null;
            }
            C0WPS.instance.setEngineUploader(null);
        }
    }

    public static void LLILLJJLI(int i, String str) {
        if (i > 50000 && i < 60000) {
            C1469160oKo c1469160oKo = C790230UzF.LIZ;
            c1469160oKo.getClass();
            if (c1469160oKo.LIZJ().isLoadLibrarySucceed()) {
                c1469160oKo.LIZJ().setStringValue(i, str);
            } else {
                ((ConcurrentHashMap) c1469160oKo.LJIJJLI).put(Integer.valueOf(i), str);
            }
        }
        C1309100kAe c1309100kAe = C1309150kAj.LIZ;
        C1309100kAe.LJII(i, str);
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        int i2 = 0;
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJL.getClass();
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setStringValue key = ");
            sbLIZ.append(i);
            sbLIZ.append(", value = ");
            sbLIZ.append(str);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                try {
                    switch (i) {
                        case 0:
                            dataLoaderHelper.LJIIIZ.mCacheDir = str;
                            break;
                        case 102:
                            dataLoaderHelper.LJIIIZ.mNetCacheDir = str;
                            break;
                        case 107:
                            AVMDLDNSParser.setStringValue(8, str);
                            break;
                        case 108:
                            AVMDLDNSParser.setStringValue(9, str);
                            break;
                        case 111:
                            dataLoaderHelper.LJIIIZ.mDownloadDir = str;
                            break;
                        case 514:
                            dataLoaderHelper.LJIIIZ.mLiveContainerString = str;
                            break;
                        case 1106:
                            dataLoaderHelper.LJIIIZ.mVdpABTestId = str;
                            break;
                        case 1107:
                            dataLoaderHelper.LJIIIZ.mVdpGroupId = str;
                            break;
                        case 1149:
                            dataLoaderHelper.LJIIIZ.mNetSchedulerConfigStr = str;
                            break;
                        case 1165:
                            dataLoaderHelper.LJIIIZ.mDynamicPreconnectConfigStr = str;
                            break;
                        case 1173:
                            dataLoaderHelper.LJIIIZ.mSpeedEngineSetting = str;
                            break;
                        case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                            dataLoaderHelper.LJIIIZ.mMdlExtensionOptsStr = str;
                            break;
                        case 1502:
                            dataLoaderHelper.LJIIIZ.mTemporaryOptStr = str;
                            break;
                        case 1506:
                        case 1507:
                        case 1508:
                            if (!TextUtils.isEmpty(str)) {
                                if (TextUtils.isEmpty(dataLoaderHelper.LJIIIZ.mCustomUA)) {
                                    dataLoaderHelper.LJIIIZ.mCustomUA = str;
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = dataLoaderHelper.LJIIIZ;
                                    sbLIZ2.append(aVMDLDataLoaderConfigure.mCustomUA);
                                    sbLIZ2.append(",");
                                    sbLIZ2.append(str);
                                    aVMDLDataLoaderConfigure.mCustomUA = C2188811AlT.LIZIZ(sbLIZ2);
                                }
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("cur custom UA");
                            sbLIZ3.append(dataLoaderHelper.LJIIIZ.mCustomUA);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                            break;
                        case 1510:
                            dataLoaderHelper.LJIIIZ.mFileRingBufferOptStr = str;
                            break;
                        case 1511:
                            dataLoaderHelper.LJIIIZ.mN80OptsStr = str;
                            break;
                        case 1512:
                            dataLoaderHelper.LJIIIZ.mMdlTTQuicHeOptsStr = str;
                            break;
                        case 1515:
                            dataLoaderHelper.LJIIIZ.mTTKMNConfigStr = str;
                            break;
                        case 2007:
                            dataLoaderHelper.LJIIIZ.mStoStrategyConfig = str;
                            break;
                        case 2029:
                            dataLoaderHelper.LJIIIZ.mPrecisePreloadConfigStr = str;
                            break;
                        case 2101:
                            dataLoaderHelper.LJIIIZ.mVdpExtGlobalInfo = str;
                            break;
                        case 9002:
                            dataLoaderHelper.LJIIIZ.mSettingsDomain = str;
                            break;
                        case 9003:
                            dataLoaderHelper.LJIIIZ.mDmDomain = str;
                            break;
                        case 9004:
                            dataLoaderHelper.LJIIIZ.mForesightDomain = str;
                            break;
                        case 9005:
                            dataLoaderHelper.LJIIIZ.mDomains = str;
                            break;
                        case 9006:
                            dataLoaderHelper.LJIIIZ.mKeyDomain = str;
                            break;
                        case 9007:
                            dataLoaderHelper.LJIIIZ.mKeyToken = str;
                            break;
                        case 9010:
                            dataLoaderHelper.LJIIIZ.mSocketTraingCenterConfigStr = str;
                            break;
                        case 9012:
                            dataLoaderHelper.LJIIIZ.mP2PConfigStr = str;
                            break;
                        case 9020:
                            String[] strArrSplit = str.split(",");
                            int length = strArrSplit.length;
                            while (i2 < length) {
                                String str2 = strArrSplit[i2];
                                if (!TextUtils.isEmpty(str2)) {
                                    dataLoaderHelper.LJJJLZIJ.add(Integer.valueOf(Integer.parseInt(str2)));
                                }
                                i2++;
                            }
                            break;
                        case 12003:
                            dataLoaderHelper.LJIIIZ.mFileKeyRule = str;
                            break;
                    }
                } finally {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i4 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(e);
            }
            dataLoaderHelper.LJJ.LJFF(1);
        } else {
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("setStringValue key = ");
            sbLIZ4.append(i);
            sbLIZ4.append(", value = ");
            sbLIZ4.append(str);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                try {
                    switch (i) {
                        case 0:
                            dataLoaderHelper.LJIIIZ.mCacheDir = str;
                            break;
                        case 102:
                            dataLoaderHelper.LJIIIZ.mNetCacheDir = str;
                            break;
                        case 107:
                            AVMDLDNSParser.setStringValue(8, str);
                            break;
                        case 108:
                            AVMDLDNSParser.setStringValue(9, str);
                            break;
                        case 111:
                            dataLoaderHelper.LJIIIZ.mDownloadDir = str;
                            break;
                        case 514:
                            dataLoaderHelper.LJIIIZ.mLiveContainerString = str;
                            break;
                        case 1106:
                            dataLoaderHelper.LJIIIZ.mVdpABTestId = str;
                            break;
                        case 1107:
                            dataLoaderHelper.LJIIIZ.mVdpGroupId = str;
                            break;
                        case 1149:
                            dataLoaderHelper.LJIIIZ.mNetSchedulerConfigStr = str;
                            break;
                        case 1165:
                            dataLoaderHelper.LJIIIZ.mDynamicPreconnectConfigStr = str;
                            break;
                        case 1173:
                            dataLoaderHelper.LJIIIZ.mSpeedEngineSetting = str;
                            break;
                        case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                            dataLoaderHelper.LJIIIZ.mMdlExtensionOptsStr = str;
                            break;
                        case 1502:
                            dataLoaderHelper.LJIIIZ.mTemporaryOptStr = str;
                            break;
                        case 1506:
                        case 1507:
                        case 1508:
                            if (!TextUtils.isEmpty(str)) {
                                if (TextUtils.isEmpty(dataLoaderHelper.LJIIIZ.mCustomUA)) {
                                    dataLoaderHelper.LJIIIZ.mCustomUA = str;
                                } else {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure2 = dataLoaderHelper.LJIIIZ;
                                    sbLIZ5.append(aVMDLDataLoaderConfigure2.mCustomUA);
                                    sbLIZ5.append(",");
                                    sbLIZ5.append(str);
                                    aVMDLDataLoaderConfigure2.mCustomUA = C2188811AlT.LIZIZ(sbLIZ5);
                                }
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("cur custom UA");
                            sbLIZ6.append(dataLoaderHelper.LJIIIZ.mCustomUA);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ6));
                            break;
                        case 1510:
                            dataLoaderHelper.LJIIIZ.mFileRingBufferOptStr = str;
                            break;
                        case 1511:
                            dataLoaderHelper.LJIIIZ.mN80OptsStr = str;
                            break;
                        case 1512:
                            dataLoaderHelper.LJIIIZ.mMdlTTQuicHeOptsStr = str;
                            break;
                        case 1515:
                            dataLoaderHelper.LJIIIZ.mTTKMNConfigStr = str;
                            break;
                        case 2007:
                            dataLoaderHelper.LJIIIZ.mStoStrategyConfig = str;
                            break;
                        case 2029:
                            dataLoaderHelper.LJIIIZ.mPrecisePreloadConfigStr = str;
                            break;
                        case 2101:
                            dataLoaderHelper.LJIIIZ.mVdpExtGlobalInfo = str;
                            break;
                        case 9002:
                            dataLoaderHelper.LJIIIZ.mSettingsDomain = str;
                            break;
                        case 9003:
                            dataLoaderHelper.LJIIIZ.mDmDomain = str;
                            break;
                        case 9004:
                            dataLoaderHelper.LJIIIZ.mForesightDomain = str;
                            break;
                        case 9005:
                            dataLoaderHelper.LJIIIZ.mDomains = str;
                            break;
                        case 9006:
                            dataLoaderHelper.LJIIIZ.mKeyDomain = str;
                            break;
                        case 9007:
                            dataLoaderHelper.LJIIIZ.mKeyToken = str;
                            break;
                        case 9010:
                            dataLoaderHelper.LJIIIZ.mSocketTraingCenterConfigStr = str;
                            break;
                        case 9012:
                            dataLoaderHelper.LJIIIZ.mP2PConfigStr = str;
                            break;
                        case 9020:
                            String[] strArrSplit2 = str.split(",");
                            int length2 = strArrSplit2.length;
                            while (i2 < length2) {
                                String str3 = strArrSplit2[i2];
                                if (!TextUtils.isEmpty(str3)) {
                                    dataLoaderHelper.LJJJLZIJ.add(Integer.valueOf(Integer.parseInt(str3)));
                                }
                                i2++;
                            }
                            break;
                        case 12003:
                            dataLoaderHelper.LJIIIZ.mFileKeyRule = str;
                            break;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    int i6 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e2);
                }
                dataLoaderHelper.LJJ.LJFF(1);
            } finally {
            }
        }
        if (i == 122) {
            C0WPW c0wpw = C0WPQ.LIZ;
            c0wpw.LIZ = str;
            C1469160oKo c1469160oKo2 = C790230UzF.LIZ;
            if (c1469160oKo2.LJI()) {
                c1469160oKo2.LIZJ().businessEvent(31207, c0wpw.LIZ);
            }
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LIZ(int i, String str) {
        this.LIZ.LIZ(i, str);
    }

    @Override // X.InterfaceC1467390oHx
    public void LIZIZ(int i, long j) {
        this.LIZ.LIZIZ(i, j);
    }

    @Override // X.InterfaceC1467390oHx
    public void LIZJ(int i, int i2) {
        this.LIZ.LIZJ(i, i2);
    }

    public final void LJIIL(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        this.LIZ.LLIIJI(enumC2281151EQn, map);
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIILLIIL(float f, float f2) {
        this.LIZ.LJIILLIIL(f, f2);
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIJJLI(int i, s0 s0Var) {
        this.LIZ.LJIJJLI(i, s0Var);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJ(int i, TraitObject traitObject) {
        this.LIZ.LJJ(i, traitObject);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJI(int i, String str) {
        C1475710oVN.LIZ();
        this.LIZ.LJJI(i, str);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIFFI(int i, boolean z) {
        this.LIZ.LJJIFFI(i, z);
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJJIII(String str, String str2) {
        this.LIZ.LJJIII(str, str2);
    }

    public final String LJJJJJL(String str, List list) {
        return this.LIZ.LLJ(str, list);
    }

    public final void LJLL(int i, int i2) {
        C1466990oHJ c1466990oHJ = this.LIZ;
        c1466990oHJ.d3 = i;
        c1466990oHJ.e3 = i2;
    }

    public final void LJLLI(String str, String str2) {
        this.LIZ.LLLLLIL(str, str2);
    }

    public final void LJLLILLLL(int i, int i2) {
        this.LIZ.LLLLLILLIL(i, i2);
    }

    public final void LJLLL(EnumC1471520oOc enumC1471520oOc, Object obj) {
        this.LIZ.LLLLLJIL(enumC1471520oOc, obj);
    }

    public final void LJZ(String str, String str2) {
        C1475710oVN.LIZ();
        C1466990oHJ c1466990oHJ = this.LIZ;
        c1466990oHJ.getClass();
        if (!TextUtils.isEmpty(str)) {
            String videoId = c1466990oHJ.LJIL.getVideoId();
            if (!TextUtils.isEmpty(str)) {
                c1466990oHJ.LLLLLLJ(str2, videoId, new String[]{str});
            }
        }
    }

    public final void LL(C650110Pej c650110Pej, String str) {
        this.LIZ.getClass();
    }

    public void LLD(float f, int i) {
        this.LIZ.LLLLLLLLL(f, i);
    }

    public final void LLII(int i, int i2) {
        this.LIZ.LLLLLLLLLL(i, i2);
    }

    public final void LLIIII(int i, long j) {
        this.LIZ.LLLLLLLZIL(i, j);
    }

    public final void LLIIZ(int i, boolean z) {
        C1466990oHJ c1466990oHJ = this.LIZ;
        c1466990oHJ.LLJJJJ = z ? 1 : 0;
        c1466990oHJ.LLJJJJJIL = i;
    }

    public final void LLILZ(int i, Surface surface) {
        this.LIZ.LLLLLZL(i, surface);
    }

    public final void LLIZLLLIL(long j, Surface surface) {
        this.LIZ.LJLLLLLL(j, surface, true);
    }

    public TTVideoEngine(Context context, int i, Map map) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init2, type:");
        sbLIZ.append(i);
        sbLIZ.append(", this:");
        sbLIZ.append(this);
        sbLIZ.append(", version:");
        sbLIZ.append("1.10.291.6-mt");
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = LJJIJIIJI(context, i, map, this);
    }

    public static EnumC2281151EQn LJJIJL(InterfaceC1467050oHP interfaceC1467050oHP, EnumC2281151EQn enumC2281151EQn, int i) {
        C1473400oRe c1473400oRe;
        int iAbs;
        int i2 = 0;
        if (interfaceC1467050oHP != null && enumC2281151EQn != null) {
            int length = EnumC2281151EQn.getAllResolutions().length;
            EnumC2281151EQn[] enumC2281151EQnArrLJJIIZ = interfaceC1467050oHP.LJJIIZ();
            if (enumC2281151EQnArrLJJIIZ != null && enumC2281151EQnArrLJJIIZ.length != 0) {
                int length2 = enumC2281151EQnArrLJJIIZ.length;
                EnumC2281151EQn enumC2281151EQn2 = enumC2281151EQn;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        EnumC2281151EQn enumC2281151EQn3 = enumC2281151EQnArrLJJIIZ[i3];
                        if (enumC2281151EQn3 != null && (iAbs = Math.abs(enumC2281151EQn3.ordinal() - enumC2281151EQn.ordinal())) < length) {
                            if (iAbs == 0) {
                                enumC2281151EQn = enumC2281151EQn3;
                                break;
                            }
                            enumC2281151EQn2 = enumC2281151EQn3;
                            length = iAbs;
                        }
                        i3++;
                    } else {
                        enumC2281151EQn = enumC2281151EQn2;
                        break;
                    }
                }
            }
        } else {
            enumC2281151EQn = EnumC2281151EQn.Standard;
        }
        long j = 0;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    if (interfaceC1467050oHP != null && enumC2281151EQn != null) {
                        if ((interfaceC1467050oHP instanceof C1470240oMY) && (c1473400oRe = ((C1470240oMY) interfaceC1467050oHP).LIZJ) != null) {
                            c1473400oRe.LJIIJJI(245, "{\"select_resolution\":[\"net_target_bitrate\"]}");
                        }
                        List<C1474520oTS> listLJIILL = interfaceC1467050oHP.LJIILL();
                        if (listLJIILL != null && listLJIILL.size() != 0) {
                            C1468070oJ3.LIZ().getClass();
                            double d = C1468070oJ3.LIZJ;
                            if (d > 0.0d) {
                                double d2 = 3.4028234663852886E38d;
                                for (C1474520oTS c1474520oTS : listLJIILL) {
                                    if (c1474520oTS != null) {
                                        double d3 = c1474520oTS.LJIILL;
                                        if (d3 <= d) {
                                            double d4 = d - d3;
                                            if (d4 < d2) {
                                                enumC2281151EQn = c1474520oTS.getResolution();
                                                d2 = d4;
                                            }
                                        }
                                    }
                                }
                                return enumC2281151EQn;
                            }
                            return enumC2281151EQn;
                        }
                        return enumC2281151EQn;
                    }
                    return EnumC2281151EQn.Standard;
                }
                return enumC2281151EQn;
            }
            if (interfaceC1467050oHP != null && enumC2281151EQn != null) {
                EnumC2281151EQn[] enumC2281151EQnArrLJJIIZ2 = interfaceC1467050oHP.LJJIIZ();
                if (enumC2281151EQnArrLJJIIZ2 != null && enumC2281151EQnArrLJJIIZ2.length != 0) {
                    int length3 = enumC2281151EQnArrLJJIIZ2.length;
                    while (i2 < length3) {
                        EnumC2281151EQn enumC2281151EQn4 = enumC2281151EQnArrLJJIIZ2[i2];
                        if (LJJIZ(interfaceC1467050oHP, enumC2281151EQn4) > 0 && enumC2281151EQn4.ordinal() > enumC2281151EQn.ordinal()) {
                            enumC2281151EQn = enumC2281151EQn4;
                        }
                        i2++;
                    }
                    return enumC2281151EQn;
                }
                return enumC2281151EQn;
            }
            return EnumC2281151EQn.Standard;
        }
        if (interfaceC1467050oHP != null && enumC2281151EQn != null) {
            EnumC2281151EQn[] enumC2281151EQnArrLJJIIZ3 = interfaceC1467050oHP.LJJIIZ();
            if (enumC2281151EQnArrLJJIIZ3 != null && enumC2281151EQnArrLJJIIZ3.length != 0) {
                int length4 = enumC2281151EQnArrLJJIIZ3.length;
                while (i2 < length4) {
                    EnumC2281151EQn enumC2281151EQn5 = enumC2281151EQnArrLJJIIZ3[i2];
                    long jLJJIZ = LJJIZ(interfaceC1467050oHP, enumC2281151EQn5);
                    if (jLJJIZ > j) {
                        enumC2281151EQn = enumC2281151EQn5;
                        j = jLJJIZ;
                    }
                    i2++;
                }
                return enumC2281151EQn;
            }
            return enumC2281151EQn;
        }
        return EnumC2281151EQn.Standard;
    }

    @Override // X.InterfaceC1467390oHx
    public final void LJIIZILJ(FileDescriptor fileDescriptor, long j, long j2) {
        this.LIZ.LJIIZILJ(fileDescriptor, j, j2);
    }

    public final void LJZI(String str, String str2, String str3) {
        C1475710oVN.LIZ();
        C1466990oHJ c1466990oHJ = this.LIZ;
        c1466990oHJ.getClass();
        if (!TextUtils.isEmpty(str)) {
            c1466990oHJ.LLLLLLJ(str2, str3, new String[]{str});
        }
    }

    public final void LLIIJLIL(SurfaceControl surfaceControl, int i, int i2) {
        this.LIZ.LLLLLLZZ(surfaceControl, i, i2);
    }

    public static void LJIIIIZZ(long j, String str, String str2, String[] strArr) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJJLIL.getClass();
            if (strArr != null && strArr.length != 0) {
                C1476130oW3.LIZIZ(new C1475600oVC(j, str, str2, strArr), dataLoaderHelper);
                return;
            } else {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "urls invalid.");
                return;
            }
        }
        if (strArr != null && strArr.length != 0) {
            dataLoaderHelper.LJIIZILJ(new C1475600oVC(j, str, str2, strArr));
        } else {
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "urls invalid.");
        }
    }

    public static C1466990oHJ LJJIJIIJI(Context context, int i, Map map, TTVideoEngine tTVideoEngine) {
        Object obj;
        C1467420oI0 c1467420oI0 = new C1467420oI0();
        c1467420oI0.LIZ = context;
        c1467420oI0.LIZLLL = tTVideoEngine;
        c1467420oI0.LIZIZ = map;
        c1467420oI0.LIZJ = i;
        if (map != null && (obj = map.get("enable_looper")) != null && ((Boolean) obj).booleanValue()) {
            return new C1468940oKS(c1467420oI0);
        }
        return new C1466990oHJ(c1467420oI0);
    }

    public static long LJJLI(int i, String str, String str2, String str3) {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure;
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure2;
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        long j = 0;
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLJJI.getClass();
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                if (dataLoaderHelper.LJIIIIZZ != null && ((aVMDLDataLoaderConfigure2 = dataLoaderHelper.LJIIIZ) == null || aVMDLDataLoaderConfigure2.mEnableMissReason != 0)) {
                    if (i == 0) {
                        str = C795730VJj.LJIIJJI(dataLoaderHelper.LJIIJ, str);
                    } else if (i == 1) {
                    }
                    if (str != null) {
                        if (dataLoaderHelper.LJIIIZ.mEnableUseGroupId > 0 && !TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        }
                        long missReason = dataLoaderHelper.LJIIIIZZ.getMissReason(str, str2);
                        if (missReason > 0) {
                            j = missReason;
                        }
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            dataLoaderHelper.LJJ.LJFF(1);
            return j;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            if (dataLoaderHelper.LJIIIIZZ != null && ((aVMDLDataLoaderConfigure = dataLoaderHelper.LJIIIZ) == null || aVMDLDataLoaderConfigure.mEnableMissReason != 0)) {
                if (i == 0) {
                    str = C795730VJj.LJIIJJI(dataLoaderHelper.LJIIJ, str);
                } else if (i == 1) {
                }
                if (str != null) {
                    if (dataLoaderHelper.LJIIIZ.mEnableUseGroupId > 0 && !TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    long missReason2 = dataLoaderHelper.LJIIIIZZ.getMissReason(str, str2);
                    if (missReason2 > 0) {
                        j = missReason2;
                    }
                }
            }
        } finally {
            try {
                TryCatchGuardChecker.doCheck(th);
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(th);
            } finally {
            }
        }
        dataLoaderHelper.LJJ.LJFF(1);
        return j;
    }

    public static void LJII(long j, String str, String str2, String str3, String[] strArr) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJJLIL.getClass();
            if (strArr != null && strArr.length != 0) {
                C1476130oW3.LIZIZ(new C1475600oVC(j, str, str2, str3, strArr), dataLoaderHelper);
                return;
            } else {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "urls invalid.");
                return;
            }
        }
        if (strArr != null && strArr.length != 0) {
            dataLoaderHelper.LJIIZILJ(new C1475600oVC(j, str, str2, str3, strArr));
        } else {
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "urls invalid.");
        }
    }
}
