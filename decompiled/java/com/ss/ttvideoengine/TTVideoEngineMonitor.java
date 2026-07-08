package com.ss.ttvideoengine;

import X.C1466990oHJ;
import X.C1467470oI5;
import X.C1468160oJC;
import X.C1468170oJD;
import X.C1469050oKd;
import X.C1469060oKe;
import X.C1469070oKf;
import X.C1471660oOq;
import X.C1474810oTv;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS123S0100000_23;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngineMonitor;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes24.dex */
public final class TTVideoEngineMonitor {
    public static volatile boolean enableCheck;
    public static volatile TTVideoEngineMonitor instance;
    public final Context mContext;
    public C1469050oKd mCrosstalkReceiver;
    public Handler mainHandler;
    public HashMap<String, C1469060oKe> allEngineWrapper = new HashMap<>();
    public int playingCount = 0;
    public HashMap<String, C1469070oKf> playingLivePLayerInfos = new HashMap<>();

    public static /* synthetic */ void lambda$semisugar$crosstalkCheck$0(TTVideoEngineMonitor tTVideoEngineMonitor) {
        C1C7U.LIZ("TTVideoEngineMonitor@9813.postRunCrosstalkCheck$1L");
        tTVideoEngineMonitor.crosstalkCheck();
        C1C7U.LIZIZ("TTVideoEngineMonitor@9813.postRunCrosstalkCheck$1L");
    }

    public synchronized void postRunCrosstalkCheck() {
        if (this.mainHandler == null) {
            this.mainHandler = new BPEAHandler(Looper.getMainLooper());
        }
        C786410Ut5.LJLIIL(((Number) C1474810oTv.H4.getValue()).intValue(), this.mainHandler, new ARunnableS123S0100000_23(this, 77));
    }

    private void crosstalkCheck() {
        ArrayList<TTVideoEngine> arrayList;
        HashMap map;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        synchronized (this) {
            try {
                int size = this.playingLivePLayerInfos.size();
                int i = this.playingCount;
                arrayList = null;
                if (i + size >= 2) {
                    if (i > 0) {
                        arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (String str : this.allEngineWrapper.keySet()) {
                            C1469060oKe c1469060oKe = this.allEngineWrapper.get(str);
                            if (c1469060oKe != null) {
                                TTVideoEngine tTVideoEngine = c1469060oKe.LIZ.get();
                                if (tTVideoEngine == null) {
                                    arrayList3.add(str);
                                } else if (c1469060oKe.LIZIZ) {
                                    tTVideoEngine.LIZIZ++;
                                    if (tTVideoEngine.LIZJ <= 0) {
                                        tTVideoEngine.LIZJ = System.currentTimeMillis();
                                    }
                                    arrayList2.add(tTVideoEngine);
                                }
                            }
                        }
                        if (arrayList3.size() > 0) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                this.allEngineWrapper.remove((String) it2.next());
                            }
                        }
                        z2 = true;
                    } else {
                        arrayList2 = null;
                        z2 = false;
                    }
                    if (size > 0) {
                        map = new HashMap(this.playingLivePLayerInfos);
                        z3 = true;
                        arrayList = arrayList2;
                        z = true;
                    } else {
                        map = null;
                        z3 = false;
                        arrayList = arrayList2;
                        z = true;
                    }
                } else {
                    settleAllCrosstalkDuration();
                    map = null;
                    z = false;
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            if ((arrayList != null ? arrayList.size() : 0) + (map != null ? map.size() : 0) < 2) {
                return;
            }
            if (arrayList == null || arrayList.size() <= 0) {
                z2 = false;
            }
            if (map == null || map.size() <= 0) {
                z3 = false;
            }
            ArrayList arrayList4 = new ArrayList();
            String string = UUID.randomUUID().toString();
            if (z2 && arrayList != null && arrayList.size() > 0) {
                Iterator it3 = arrayList.iterator();
                boolean z4 = false;
                while (it3.hasNext()) {
                    C1466990oHJ c1466990oHJ = ((TTVideoEngine) it3.next()).LIZ;
                    c1466990oHJ.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    HashMap mapLLILLIZIL = C1466990oHJ.LLILLIZIL(0, c1466990oHJ.LJ, c1466990oHJ.LJFF, null, c1466990oHJ.r, string);
                    arrayList6.add(mapLLILLIZIL);
                    String strLLILLJJLI = C1466990oHJ.LLILLJJLI(mapLLILLIZIL);
                    if (!TextUtils.isEmpty(strLLILLJJLI)) {
                        arrayList5.add(strLLILLJJLI);
                    }
                    for (TTVideoEngine tTVideoEngine2 : arrayList) {
                        if (!tTVideoEngine2.equals(c1466990oHJ.y5)) {
                            C1466990oHJ c1466990oHJ2 = tTVideoEngine2.LIZ;
                            HashMap mapLLILLIZIL2 = C1466990oHJ.LLILLIZIL(0, c1466990oHJ2.LJ, c1466990oHJ2.LJFF, null, c1466990oHJ2.r, string);
                            arrayList6.add(mapLLILLIZIL2);
                            String strLLILLJJLI2 = C1466990oHJ.LLILLJJLI(mapLLILLIZIL2);
                            if (!TextUtils.isEmpty(strLLILLJJLI2)) {
                                arrayList5.add(strLLILLJJLI2);
                            }
                        }
                    }
                    if (map != null && map.size() > 0) {
                        for (String str2 : map.keySet()) {
                            C1469070oKf c1469070oKf = (C1469070oKf) map.get(str2);
                            if (c1469070oKf != null) {
                                String strLLILLJJLI3 = C1466990oHJ.LLILLJJLI(C1466990oHJ.LLILLIZIL(1, c1469070oKf.LIZ, c1469070oKf.LIZIZ, str2, null, string));
                                if (!TextUtils.isEmpty(strLLILLJJLI3)) {
                                    arrayList5.add(strLLILLJJLI3);
                                }
                            }
                        }
                    } else if (arrayList5.size() >= 2) {
                        C1468160oJC c1468160oJC = c1466990oHJ.LLLZIL;
                        int size2 = arrayList5.size();
                        C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
                        c1468170oJD.U0 = size2;
                        c1468170oJD.V0 = arrayList5;
                        c1468160oJC.LJJ(-2009, true);
                    }
                    C1467470oI5 c1467470oI5 = new C1467470oI5();
                    c1467470oI5.LIZ = "crosstalk_happened";
                    c1467470oI5.LIZJ = arrayList6;
                    c1466990oHJ.LLLFF(c1467470oI5, false);
                    if (z3 && !z4 && arrayList6.size() > 0) {
                        arrayList4.addAll(arrayList6);
                        z4 = true;
                    }
                }
            }
            if (!z3 || map == null || map.size() <= 0) {
                return;
            }
            for (String str3 : map.keySet()) {
                C1469070oKf c1469070oKf2 = (C1469070oKf) map.get(str3);
                if (c1469070oKf2 != null) {
                    arrayList4.add(generateCrosstalkMap(c1469070oKf2.LIZ, c1469070oKf2.LIZIZ, 1, str3));
                }
            }
            String strGenerateCrosstalkCallbackStr = generateCrosstalkCallbackStr(arrayList4);
            if (TextUtils.isEmpty(strGenerateCrosstalkCallbackStr)) {
                return;
            }
            Intent intent = new Intent("com.bytedance.android.vodsdk.player.monitor.ACTION_CROSSTALK_DIDHAPPEN");
            intent.putExtra("crosstalk_info_list", strGenerateCrosstalkCallbackStr);
            try {
                LocalBroadcastManager.LIZ(this.mContext).LIZJ(intent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.w("TTVideoEngineMonitor", e.getMessage());
            }
        }
    }

    public void settleAllCrosstalkDuration() {
        TTVideoEngine tTVideoEngine;
        for (C1469060oKe c1469060oKe : this.allEngineWrapper.values()) {
            if (c1469060oKe != null && (tTVideoEngine = c1469060oKe.LIZ.get()) != null && tTVideoEngine.LIZJ > 0) {
                tTVideoEngine.LIZLLL += System.currentTimeMillis() - tTVideoEngine.LIZJ;
                tTVideoEngine.LIZJ = 0L;
            }
        }
    }

    public void start() {
        if (enableCheck && this.mCrosstalkReceiver == null) {
            registerBroadcastReceiver(this.mContext);
        }
    }

    public void stop() {
        boolean zLJI = MethodIDManager.LJI(71891);
        unregisterBroadcastReceiver(this.mContext);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public TTVideoEngineMonitor(Context context) {
        this.mContext = C786410Ut5.N3(context);
        start();
    }

    public static String generateCrosstalkCallbackStr(ArrayList<HashMap<String, Object>> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            try {
                return new JSONArray((Collection) arrayList).toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static TTVideoEngineMonitor getInstance(Context context) {
        if (instance == null) {
            synchronized (TTVideoEngineMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new TTVideoEngineMonitor(context);
                        int i = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("TTVideoEngineMonitor", "Construct TTVideoEngineMonitor");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return instance;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oKd] */
    private void registerBroadcastReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_PLAYING");
        intentFilter.addAction("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_STOP_OR_RELEASE");
        this.mCrosstalkReceiver = new BroadcastReceiver() { // from class: X.0oKd
            public final void LIZ(Intent intent) {
                String stringExtra;
                C1469070oKf c1469070oKf;
                String stringExtra2;
                TTVideoEngineMonitor tTVideoEngineMonitor;
                boolean z;
                if (TTVideoEngineMonitor.enableCheck && intent != null && !TextUtils.isEmpty(intent.getAction())) {
                    intent.getAction();
                    String stringExtra3 = null;
                    try {
                        stringExtra = intent.getStringExtra("enginehash");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                    if (TextUtils.isEmpty(stringExtra)) {
                        return;
                    }
                    String action = intent.getAction();
                    action.getClass();
                    if (!action.equals("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_STOP_OR_RELEASE")) {
                        if (action.equals("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_PLAYING")) {
                            synchronized (this) {
                                try {
                                    c1469070oKf = this.LIZ.playingLivePLayerInfos.get(stringExtra);
                                } finally {
                                }
                            }
                            if (c1469070oKf != null) {
                                return;
                            }
                            try {
                                stringExtra2 = intent.getStringExtra("tag");
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                stringExtra2 = null;
                            }
                            try {
                                stringExtra3 = intent.getStringExtra("subtag");
                            } catch (Exception th) {
                            }
                            C1469070oKf c1469070oKf2 = new C1469070oKf();
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                c1469070oKf2.LIZ = stringExtra2;
                            }
                            if (!TextUtils.isEmpty(stringExtra3)) {
                                c1469070oKf2.LIZIZ = stringExtra3;
                            }
                            synchronized (this) {
                                try {
                                    this.LIZ.playingLivePLayerInfos.put(stringExtra, c1469070oKf2);
                                    int size = this.LIZ.playingLivePLayerInfos.size();
                                    tTVideoEngineMonitor = this.LIZ;
                                    if (tTVideoEngineMonitor.playingCount + size >= 2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } finally {
                                }
                            }
                            if (z) {
                                tTVideoEngineMonitor.postRunCrosstalkCheck();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    synchronized (this) {
                        try {
                            this.LIZ.playingLivePLayerInfos.remove(stringExtra);
                            int size2 = this.LIZ.playingLivePLayerInfos.size();
                            TTVideoEngineMonitor tTVideoEngineMonitor2 = this.LIZ;
                            if (tTVideoEngineMonitor2.playingCount + size2 < 2) {
                                tTVideoEngineMonitor2.settleAllCrosstalkDuration();
                            }
                        } finally {
                        }
                    }
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        LocalBroadcastManager.LIZ(context).LIZIZ(this.mCrosstalkReceiver, intentFilter);
    }

    private void unregisterBroadcastReceiver(Context context) {
        if (this.mCrosstalkReceiver != null) {
            try {
                LocalBroadcastManager.LIZ(context).LIZLLL(this.mCrosstalkReceiver);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.w("TTVideoEngineMonitor", e.getMessage());
            }
            this.mCrosstalkReceiver = null;
        }
    }

    public void stopObserve(int i) {
        synchronized (this) {
            try {
                HashMap<String, C1469060oKe> map = this.allEngineWrapper;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append("");
                map.remove(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void enableCrosstalkCheck(Context context, boolean z) {
        enableCheck = z;
        getInstance(context);
    }

    public void engineStateChange(int i, boolean z) {
        WeakReference<TTVideoEngine> weakReference;
        TTVideoEngine tTVideoEngine;
        TTVideoEngine tTVideoEngine2;
        if (!TTVideoEngine.LJIIJJI) {
            return;
        }
        boolean z2 = false;
        if (!z) {
            synchronized (this) {
                try {
                    HashMap<String, C1469060oKe> map = this.allEngineWrapper;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append("");
                    C1469060oKe c1469060oKe = map.get(C2188811AlT.LIZIZ(sbLIZ));
                    if (c1469060oKe != null && c1469060oKe.LIZIZ) {
                        c1469060oKe.LIZIZ = false;
                        this.playingCount--;
                        WeakReference<TTVideoEngine> weakReference2 = c1469060oKe.LIZ;
                        if (weakReference2 != null && (tTVideoEngine2 = weakReference2.get()) != null) {
                            int i2 = tTVideoEngine2.LIZIZ;
                            if (i2 > 0) {
                                tTVideoEngine2.LIZIZ = i2 - 1;
                            }
                            if (tTVideoEngine2.LIZJ > 0) {
                                tTVideoEngine2.LIZLLL += System.currentTimeMillis() - tTVideoEngine2.LIZJ;
                                tTVideoEngine2.LIZJ = 0L;
                            }
                        }
                        if (this.playingCount + this.playingLivePLayerInfos.size() < 2) {
                            settleAllCrosstalkDuration();
                        }
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (this) {
            try {
                HashMap<String, C1469060oKe> map2 = this.allEngineWrapper;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i);
                sbLIZ2.append("");
                C1469060oKe c1469060oKe2 = map2.get(C2188811AlT.LIZIZ(sbLIZ2));
                if (c1469060oKe2 != null && (((weakReference = c1469060oKe2.LIZ) == null || (tTVideoEngine = weakReference.get()) == null || !tTVideoEngine.isMute()) && !c1469060oKe2.LIZIZ)) {
                    c1469060oKe2.LIZIZ = true;
                    this.playingCount++;
                    if (this.playingCount + this.playingLivePLayerInfos.size() >= 2) {
                        z2 = true;
                    }
                }
            } finally {
            }
        }
        if (z2) {
            postRunCrosstalkCheck();
        }
    }

    public void startObserve(int i, TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine == null) {
            return;
        }
        C1469060oKe c1469060oKe = new C1469060oKe(tTVideoEngine);
        synchronized (this) {
            try {
                HashMap<String, C1469060oKe> map = this.allEngineWrapper;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append("");
                map.put(C2188811AlT.LIZIZ(sbLIZ), c1469060oKe);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static HashMap<String, Object> generateCrosstalkMap(String str, String str2, int i, String str3) {
        HashMap<String, Object> map = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            map.put("tag", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("subtag", str2);
        }
        map.put("islive", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str3)) {
            map.put("enginehash", str3);
        }
        return map;
    }
}
