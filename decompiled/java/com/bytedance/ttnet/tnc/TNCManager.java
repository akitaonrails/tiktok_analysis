package com.bytedance.ttnet.tnc;

import X.AbstractC1493260oxg;
import X.C036E;
import X.C080U;
import X.C0X52;
import X.C0X9S;
import X.C0XLQ;
import X.C0XLY;
import X.C1490200osk;
import X.C1490210osl;
import X.C1493210oxb;
import X.C1493240oxe;
import X.C1493400oxu;
import X.C1493840oyc;
import X.C1515120pWw;
import X.C1C7U;
import X.C2088908Gh;
import X.C2089008Gi;
import X.C2104008Mc;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C847050XKt;
import X.EnumC1492690owl;
import X.InterfaceC1494080oz0;
import X.InterfaceC847040XKs;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import m14.l;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public final class TNCManager implements InterfaceC1494080oz0 {
    public static TNCManager LJJIII;
    public static String LJJIIJ;
    public long LIZ;
    public volatile long LIZIZ;
    public volatile long LIZJ;
    public volatile long LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public volatile long LJIIIZ;
    public Context LJIIL;
    public C1490200osk LJIILIIL;
    public EnumC1492690owl LIZLLL = EnumC1492690owl.TTCACHE;
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public boolean LJIIJJI = false;
    public volatile int LJIILJJIL = 0;
    public volatile long LJIILL = 0;
    public volatile long LJIILLIIL = 0;
    public int LJIIZILJ = 0;
    public final HashMap<String, Integer> LJIJ = new HashMap<>();
    public final HashMap<String, Integer> LJIJI = new HashMap<>();
    public int LJIJJ = 0;
    public final HashMap<String, Integer> LJIJJLI = new HashMap<>();
    public final HashMap<String, Integer> LJIL = new HashMap<>();
    public boolean LJJ = true;
    public final Handler LJJI = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.ttnet.tnc.TNCManager.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z;
            EnumC1492690owl enumC1492690owl;
            C1C7U.LIZ("TNCManager@91f9.<field>$1");
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                TNCManager tNCManager = TNCManager.this;
                int i = message.arg2;
                tNCManager.getClass();
                if (i != 7) {
                    if (i != 10) {
                        if (i != 20) {
                            if (i != 30) {
                                switch (i) {
                                    case -2:
                                        enumC1492690owl = EnumC1492690owl.TTRESUME;
                                        break;
                                    case -1:
                                        enumC1492690owl = EnumC1492690owl.TTHardCode;
                                        break;
                                    case 0:
                                        enumC1492690owl = EnumC1492690owl.TTCACHE;
                                        break;
                                    case 1:
                                        enumC1492690owl = EnumC1492690owl.TTSERVER;
                                        break;
                                    case 2:
                                        enumC1492690owl = EnumC1492690owl.TTERROR;
                                        break;
                                    case 3:
                                        enumC1492690owl = EnumC1492690owl.TTPOLL;
                                        break;
                                    case 4:
                                        enumC1492690owl = EnumC1492690owl.TTTNC;
                                        break;
                                    default:
                                        enumC1492690owl = EnumC1492690owl.TTSERVER;
                                        break;
                                }
                            } else {
                                enumC1492690owl = EnumC1492690owl.TTCRONETFAILED;
                            }
                        } else {
                            enumC1492690owl = EnumC1492690owl.TTCRONET;
                        }
                    } else {
                        enumC1492690owl = EnumC1492690owl.TTREGION;
                    }
                } else {
                    enumC1492690owl = EnumC1492690owl.PORTRETRY;
                }
                tNCManager.LJ(enumC1492690owl, z);
            }
            C1C7U.LIZIZ("TNCManager@91f9.<field>$1");
        }
    };
    public volatile InterfaceC847040XKs LJJIFFI = null;
    public final C847050XKt LJJII = new C847050XKt(this);

    public static synchronized TNCManager LJI() {
        if (LJJIII == null) {
            LJJIII = new TNCManager();
        }
        return LJJIII;
    }

    @Override // X.InterfaceC1494080oz0
    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("update_time", this.LJ);
            jSONObject2.put("source", this.LIZLLL.mValue);
            jSONObject2.put("cold_start", this.LJFF ? 1 : 0);
            jSONObject2.put("config_updated", this.LJI ? 1 : 0);
            if (!TextUtils.isEmpty(this.LJII)) {
                jSONObject2.put("config", this.LJII);
            }
            if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
                jSONObject2.put("canary", this.LJIIIIZZ);
            }
            jSONObject2.put("local_probe_version", this.LJIILLIIL);
            String str = C1493400oxu.LJIIJ(this.LJIIL).LLJJJJJIL;
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("rules", str);
            }
            C1490200osk c1490200osk = this.LJIILIIL;
            if (c1490200osk != null) {
                c1490200osk.getClass();
                if (!TextUtils.isEmpty("")) {
                    this.LJIILIIL.getClass();
                    if (!TextUtils.isEmpty("")) {
                        this.LJIILIIL.getClass();
                        jSONObject2.put("region", "");
                        this.LJIILIIL.getClass();
                        jSONObject2.put("region_source", "");
                    }
                }
            }
            jSONObject.put("data", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("version", this.LJIILL);
            jSONObject3.put("cmd", this.LJIILJJIL);
            jSONObject3.put("send_time", this.LIZIZ);
            jSONObject3.put("get_time", this.LIZJ);
            jSONObject.put("probe", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("probe_version", this.LJIILLIIL);
            jSONObject4.put("source", this.LIZLLL.mValue);
            jSONObject4.put("start_time", this.LJIIIZ);
            jSONObject.put("request", jSONObject4);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final C1490210osl LJII() {
        C1490200osk c1490200osk = this.LJIILIIL;
        if (c1490200osk != null) {
            return c1490200osk.LIZIZ;
        }
        return null;
    }

    public final void LJIIIIZZ() {
        if (LJII() != null && C2104008Mc.LIZJ(this.LJIIL) && this.LJIIJ.compareAndSet(false, true)) {
            LJIILJJIL(true, 0L, EnumC1492690owl.TTCRONETFAILED);
        }
    }

    public final void LJIILIIL() {
        Logger.debug();
        this.LJIIZILJ = 0;
        this.LJIJ.clear();
        this.LJIJI.clear();
        this.LJIJJ = 0;
        this.LJIJJLI.clear();
        this.LJIL.clear();
    }

    public static void LIZLLL(C2089008Gi c2089008Gi) {
        Map<String, String> mapLJIJ;
        Object tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend != null && (tTNetDepend instanceof AbstractC1493260oxg) && (mapLJIJ = ((AbstractC1493260oxg) tTNetDepend).LJIJ()) != null && !mapLJIJ.isEmpty()) {
            for (Map.Entry<String, String> entry : mapLJIJ.entrySet()) {
                c2089008Gi.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
    }

    public static List LJIIL(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List list = (List) map.get(str);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C080U(str, (String) it2.next()));
                }
            }
        }
        return arrayList;
    }

    public final void LJIIIZ(C0XLY c0xly) {
        int i;
        long j;
        C1490210osl c1490210oslLJII;
        if (c0xly == null || !this.LJJ) {
            return;
        }
        String strLIZ = c0xly.LIZ("tt-idc-switch", null);
        if (TextUtils.isEmpty(strLIZ)) {
            Logger.debug();
            return;
        }
        String[] strArrSplit = strLIZ.split(e3.g);
        if (strArrSplit != null && strArrSplit.length == 2) {
            long jNextInt = 0;
            try {
                i = CastIntegerProtector.parseInt(strArrSplit[0]);
                try {
                    j = CastLongProtector.parseLong(strArrSplit[1]);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    Logger.debug();
                    j = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
            Logger.debug();
            if (j <= this.LJIILL) {
                return;
            }
            this.LJIILJJIL = i;
            this.LJIILL = j;
            this.LIZJ = System.currentTimeMillis();
            C810670Vr7.LIZJ(this.LJIIL, 0, "ttnet_tnc_config").edit().putInt("tnc_probe_cmd", i).putLong("tnc_probe_version", j).apply();
            if (this.LJIILJJIL != 10000 || (c1490210oslLJII = LJII()) == null) {
                return;
            }
            Random random = new Random(System.currentTimeMillis());
            int i2 = c1490210oslLJII.LJIIJ;
            if (i2 > 0) {
                jNextInt = ((long) random.nextInt(i2)) * 1000;
            }
            Logger.debug();
            LJIILJJIL(true, jNextInt, EnumC1492690owl.TTTNC);
            return;
        }
        Logger.debug();
    }

    @Override // X.InterfaceC1494080oz0
    public final synchronized void LIZ(Request request, Exception exc) {
        if (request != null) {
            if (!this.LJJ) {
                return;
            }
            try {
                if (C036E.LIZ.LIZIZ()) {
                    C0XLQ c0xlqUrl = request.url();
                    String str = c0xlqUrl.LIZ;
                    String str2 = c0xlqUrl.LIZLLL;
                    String strLJFF = c0xlqUrl.LJFF();
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    String lowerCase = stringWriter.toString().toLowerCase();
                    if (!"http".equals(str) && !"https".equals(str)) {
                        return;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(lowerCase) && lowerCase.contains("timeout") && lowerCase.contains("time out") && !lowerCase.contains("unreachable")) {
                        C1490210osl c1490210oslLJII = LJII();
                        if (c1490210oslLJII != null && c1490210oslLJII.LIZ) {
                            Map<String, Integer> map = c1490210oslLJII.LIZJ;
                            if (map != null && ((HashMap) map).size() > 0 && ((HashMap) c1490210oslLJII.LIZJ).containsKey(str2)) {
                                Logger.debug();
                                this.LJIIZILJ++;
                                this.LJIJ.put(strLJFF, 0);
                                this.LJIJI.put(str2, 0);
                                if (this.LJIIZILJ >= c1490210oslLJII.LIZLLL && this.LJIJ.size() >= c1490210oslLJII.LJ && this.LJIJI.size() >= c1490210oslLJII.LJFF) {
                                    Logger.debug();
                                    LJIILJJIL(false, 0L, EnumC1492690owl.TTERROR);
                                    LJIILIIL();
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4 A[Catch: all -> 0x00ff, TryCatch #1 {, blocks: (B:5:0x0005, B:10:0x000c, B:12:0x0014, B:14:0x002a, B:18:0x0034, B:22:0x003c, B:26:0x0042, B:28:0x004b, B:30:0x004f, B:31:0x0052, B:33:0x0056, B:35:0x005a, B:37:0x0062, B:39:0x006c, B:45:0x0079, B:47:0x007d, B:49:0x0081, B:54:0x008d, B:56:0x0093, B:58:0x009b, B:61:0x00b4, B:63:0x00d2, B:65:0x00dc, B:67:0x00e6, B:75:0x00fa), top: B:85:0x0005, inners: #0 }] */
    @Override // X.InterfaceC1494080oz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(okhttp3.Request r9, X.C0XLY r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.tnc.TNCManager.LIZIZ(okhttp3.Request, X.0XLY):void");
    }

    public final void LJ(EnumC1492690owl enumC1492690owl, boolean z) {
        C1490210osl c1490210oslLJII = LJII();
        if (c1490210oslLJII == null) {
            return;
        }
        Logger.debug();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!z && this.LIZ + (((long) c1490210oslLJII.LJIIIZ) * 1000) > jElapsedRealtime) {
            Logger.debug();
            return;
        }
        this.LIZ = jElapsedRealtime;
        if (enumC1492690owl == EnumC1492690owl.TTTNC) {
            this.LIZIZ = System.currentTimeMillis();
        }
        C1493400oxu.LJIIJ(this.LJIIL).LJIIIIZZ(enumC1492690owl, false);
    }

    public final boolean LJIIJJI(String str, Map map) {
        if (this.LJJIFFI == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        HashMap map2 = (HashMap) map;
        for (String str2 : map2.keySet()) {
            String str3 = (String) map2.get(str2);
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                arrayList.add(new C080U(str2, str3));
            }
        }
        return this.LJJIFFI.LIZIZ("GET", str, "", arrayList);
    }

    public final void LJIILJJIL(boolean z, long j, EnumC1492690owl enumC1492690owl) {
        if (this.LJJI.hasMessages(10000)) {
            return;
        }
        Message messageObtainMessage = this.LJJI.obtainMessage();
        messageObtainMessage.what = 10000;
        messageObtainMessage.arg1 = z ? 1 : 0;
        messageObtainMessage.arg2 = enumC1492690owl.mValue;
        if (j > 0) {
            C786410Ut5.LJLJLJ(this.LJJI, messageObtainMessage, j);
        } else {
            C786410Ut5.LJLJJL(this.LJJI, messageObtainMessage);
        }
    }

    public final boolean LJFF(Context context, boolean z, EnumC1492690owl enumC1492690owl, String str) {
        List<C080U> list;
        String str2;
        Logger.debug();
        ArrayList arrayList = new ArrayList();
        if (C1493400oxu.LJIIJ(context).LLJJL != null && ((CopyOnWriteArrayList) C1493400oxu.LJIIJ(context).LLJJL).size() != 0) {
            arrayList.addAll(C1493400oxu.LJIIJ(context).LLJJL);
            C1493400oxu.LJIIJ(context).getClass();
            for (String str3 : C1493400oxu.LJIIIZ()) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
        } else {
            C1493400oxu.LJIIJ(context).getClass();
            arrayList.addAll(Arrays.asList(C1493400oxu.LJIIIZ()));
        }
        this.LIZLLL = enumC1492690owl;
        this.LJIIIZ = System.currentTimeMillis();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2089008Gi c2089008Gi = new C2089008Gi("https://" + ((String) it2.next()) + "/get_domains/v5/");
            try {
                c2089008Gi.LIZLLL("abi", Build.SUPPORTED_ABIS[0]);
                c2089008Gi.LIZIZ(enumC1492690owl.mValue, "tnc_src");
                c2089008Gi.LIZLLL("okhttp_version", "4.2.243.57-tiktok");
                if (C1493240oxe.LJI().LJIIJJI) {
                    c2089008Gi.LIZLLL("use_store_region_cookie", "1");
                }
                LIZLLL(c2089008Gi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            HashMap map = new HashMap();
            C1493240oxe c1493240oxeLJI = C1493240oxe.LJI();
            if (c1493240oxeLJI.LJIIJJI && !c1493240oxeLJI.LJII && !TextUtils.isEmpty(c1493240oxeLJI.LJI)) {
                map.put("x-tt-app-init-region", c1493240oxeLJI.LJI);
            }
            boolean z2 = !TextUtils.isEmpty(C1493240oxe.LJI().LIZ);
            if (!TextUtils.isEmpty(str)) {
                map.put("x-tt-tnc-summary", str);
            }
            if (!z) {
                C1493210oxb c1493210oxb = new C1493210oxb();
                c1493210oxb.LIZ = c2089008Gi.LJ();
                c1493210oxb.LIZIZ = true;
                System.currentTimeMillis();
                try {
                    if (!LJIIJJI(c1493210oxb.LIZ, map)) {
                        return false;
                    }
                    HashMap map2 = new HashMap();
                    String strLIZ = C1493840oyc.LIZ(c1493210oxb.LIZ, map, map2, c1493210oxb);
                    String str4 = c1493210oxb.LIZ;
                    if (this.LJJIFFI != null) {
                        if (!this.LJJIFFI.LIZ(str4, strLIZ, LJIIL(map2))) {
                            return false;
                        }
                    }
                    System.currentTimeMillis();
                    this.LJIIIIZZ = c1493210oxb.LJII;
                    this.LJII = c1493210oxb.LJI;
                    if (LJI().LJIIJ(context, enumC1492690owl, strLIZ, c1493210oxb.LJFF, c1493210oxb.LIZLLL, c1493210oxb.LJ, z2)) {
                        return true;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            } else {
                c2089008Gi.LIZIZ(TTNetInit.getTTNetDepend().getAppId(), "aid");
                c2089008Gi.LIZLLL("device_platform", "android");
                if (TTNetInit.getCronetProvider() != null) {
                    c2089008Gi.LIZLLL("version_code", TTNetInit.getCronetProvider().getVersionCode());
                    c2089008Gi.LIZLLL("channel", TTNetInit.getCronetProvider().getChannel());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                String strLJ = c2089008Gi.LJ();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(strLJ, linkedHashMap);
                    String str5 = (String) pairLIZJ.first;
                    String str6 = (String) pairLIZJ.second;
                    INetworkApi iNetworkApi = (INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, str5);
                    if (iNetworkApi != null) {
                        C0X9S<String> c0x9sDoGet = iNetworkApi.doGet(true, -1, str6, linkedHashMap, arrayList2, null);
                        try {
                            C0X52<String> c0x52Execute = c0x9sDoGet.execute();
                            list = c0x52Execute.LIZ.LIZLLL;
                            str2 = c0x52Execute.LIZIZ;
                        } finally {
                            try {
                            } catch (Throwable th3) {
                            }
                        }
                        if (this.LJJIFFI == null || this.LJJIFFI.LIZ(c0x9sDoGet.request().getUrl(), str2, list)) {
                            String strLJIIJJI = C1515120pWw.LJIIJJI("x-ss-etag", list);
                            String strLJIIJJI2 = C1515120pWw.LJIIJJI("x-tt-tnc-abtest", list);
                            String strLJIIJJI3 = C1515120pWw.LJIIJJI("x-tt-tnc-control", list);
                            this.LJII = C1515120pWw.LJIIJJI("x-tt-tnc-config", list);
                            this.LJIIIIZZ = C1515120pWw.LJIIJJI("x-ss-canary", list);
                            if (LJI().LJIIJ(context, enumC1492690owl, str2, strLJIIJJI3, strLJIIJJI, strLJIIJJI2, z2)) {
                                c0x9sDoGet.cancel();
                                return true;
                            }
                            c0x9sDoGet.cancel();
                        } else {
                            c0x9sDoGet.cancel();
                            return false;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return false;
    }

    public final boolean LJIIJ(Context context, EnumC1492690owl enumC1492690owl, String str, String str2, String str3, String str4, boolean z) {
        try {
            Logger.debug();
            if (!TextUtils.isEmpty(str3)) {
                C1493400oxu.LJIIJ(context).LLJJJIL = str3;
            }
            LJI().LJIILIIL.LIZLLL = str4;
            l.LJ().LJIIJJI = str4;
            if (!TextUtils.isEmpty(str2) && str2.equals("1")) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(str);
            ClientKeyManager.LJI().LIZ(str);
            boolean zLJIIL = C1493400oxu.LJIIJ(context).LJIIL(jSONObject, enumC1492690owl, System.currentTimeMillis(), z);
            if (zLJIIL) {
                this.LJ = System.currentTimeMillis();
                if (!this.LJFF) {
                    this.LJFF = true;
                }
                this.LJI = true;
                if (enumC1492690owl == EnumC1492690owl.TTTNC) {
                    this.LJIILLIIL = this.LJIILL;
                }
            }
            return zLJIIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
