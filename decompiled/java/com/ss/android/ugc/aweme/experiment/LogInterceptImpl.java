package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C08JS;
import X.C1118704Zd;
import X.C1487805s4;
import X.C1488205s8;
import X.C15438062q;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.C786410Ut5;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class LogInterceptImpl implements ILogInterceptApi {
    public final List<C1488205s8> LIZ;
    public final HandlerThread LIZIZ;
    public BPEAHandler LIZJ;
    public boolean LIZLLL;
    public final Map<String, ApplogDegradeInfoList> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map] */
    public LogInterceptImpl() {
        ?? LJ;
        List<C1488205s8> listSingletonList = Collections.singletonList(C1488205s8.LIZJ);
        this.LIZ = listSingletonList;
        this.LIZIZ = new HandlerThread("AppLogInterceptorThread");
        this.LJ = new LinkedHashMap();
        this.LJFF = C452501pT.LIZIZ(new C1487805s4());
        this.LJI = C452501pT.LIZIZ(new C1118704Zd(this));
        for (C1488205s8 c1488205s8 : listSingletonList) {
            if (((Boolean) c1488205s8.LIZIZ.getValue()).booleanValue()) {
                Map<String, ApplogDegradeInfoList> map = this.LJ;
                String string = c1488205s8.LIZ().getString(C1488205s8.LJFF, "");
                if (string.length() == 0) {
                    LJ = C2097608Jq.LJ();
                } else {
                    try {
                        List list = (List) C08JS.LIZIZ().LJIIIIZZ(string, new TypeToken<List<? extends ApplogDegradeInfoList>>() { // from class: X.05s7
                        }.getType());
                        if (list != null) {
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                            LJ = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
                            for (Object obj : list) {
                                String str = ((ApplogDegradeInfoList) obj).event;
                                if (str == null) {
                                    str = "";
                                }
                                LJ.put(str, obj);
                            }
                        } else {
                            LJ = C2097608Jq.LJ();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJ = C2097608Jq.LJ();
                    }
                }
                map.putAll((Map<? extends String, ? extends ApplogDegradeInfoList>) LJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZ(String str) {
        boolean z = false;
        if (!((Boolean) this.LJI.getValue()).booleanValue()) {
            return false;
        }
        ApplogDegradeInfoList applogDegradeInfoList = (ApplogDegradeInfoList) ((LinkedHashMap) this.LJ).get(str);
        if (((Number) this.LJFF.getValue()).longValue() < 0 || applogDegradeInfoList == null) {
            return false;
        }
        if (((Number) this.LJFF.getValue()).longValue() < applogDegradeInfoList.sampling * 100) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZIZ(final String str, JSONObject jSONObject) {
        if (!((Boolean) this.LJI.getValue()).booleanValue() || str == null || jSONObject == null) {
            return false;
        }
        ApplogDegradeInfoList applogDegradeInfoList = (ApplogDegradeInfoList) ((LinkedHashMap) this.LJ).get(str);
        if (((Number) this.LJFF.getValue()).longValue() < 0 || applogDegradeInfoList == null) {
            return false;
        }
        Set<String> set = applogDegradeInfoList.cuttingProperties;
        if (set != null && !set.isEmpty()) {
            for (String str2 : set) {
                if (str2 != null) {
                    jSONObject.remove(str2);
                }
            }
        }
        if (((Number) this.LJFF.getValue()).longValue() < applogDegradeInfoList.sampling * 100) {
            return false;
        }
        if (applogDegradeInfoList.transferStorage) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                this.LIZIZ.start();
                this.LIZJ = new BPEAHandler(C786410Ut5.W2(this.LIZIZ));
            }
            final String strJ3 = C786410Ut5.J3(jSONObject);
            BPEAHandler bPEAHandler = this.LIZJ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.05s6
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LogInterceptImpl@6819.transferStorage$1");
                        try {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, strJ3);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LogInterceptImpl@6819.transferStorage$1");
                    }
                });
            }
        }
        return true;
    }
}
