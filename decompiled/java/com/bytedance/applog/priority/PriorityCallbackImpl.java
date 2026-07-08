package com.bytedance.applog.priority;

import X.C0NBM;
import X.C20223814Bg;
import X.C21655119oz;
import X.C2176401AFq;
import X.C2188811AlT;
import X.C2200271B9l;
import X.C2209791BeD;
import X.C2209901BeO;
import X.C2209921BeQ;
import X.C2210031Beb;
import X.C2210101Bei;
import X.C2210151Ben;
import X.C2210751Bfl;
import X.C2210791Bfp;
import X.C2210851Bfv;
import X.C23066092a;
import X.C786410Ut5;
import X.C804420Vh2;
import X.EnumC21646419na;
import X.EnumC2176421AFs;
import X.EnumC2176431AFt;
import X.EnumC2210021Bea;
import X.EnumC2210521BfO;
import X.InterfaceC2211401Bgo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class PriorityCallbackImpl implements PriorityCallback {
    public static final List<String> loggerTags = Collections.singletonList("PriorityCallbackImpl");
    public final C2209901BeO appLogInstance;

    @Override // com.bytedance.applog.priority.PriorityCallback
    public String getHeaderJson() {
        this.appLogInstance.LJJZZI.LJFF(0, loggerTags, "****** priority callback get header json...", new Object[0]);
        JSONObject header = this.appLogInstance.getHeader();
        if (header == null) {
            return null;
        }
        if (this.appLogInstance.LJIILLIIL != null) {
            C2210791Bfp.LIZ(header);
        }
        return C786410Ut5.J3(header);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean isMonitorEnabled() {
        return this.appLogInstance.LJJJJLI.LL.LIZIZ;
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean isNetworkAvailable() {
        return C804420Vh2.LJFF(this.appLogInstance.LJIIJ);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean isStageEnabled() {
        return this.appLogInstance.LJJJJLI.LJFF();
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public String isolateKey() {
        EnumC2210521BfO enumC2210521BfO = this.appLogInstance.LJJJZ;
        return (!this.appLogInstance.LJJJLZIJ || enumC2210521BfO == null) ? "" : enumC2210521BfO.getKey();
    }

    public PriorityCallbackImpl(C2209901BeO c2209901BeO) {
        this.appLogInstance = c2209901BeO;
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean allowIsolateReport(String str, String str2) {
        EnumC2210521BfO enumC2210521BfOFromKey;
        InterfaceC2211401Bgo interfaceC2211401Bgo = this.appLogInstance.LJJL;
        if (!this.appLogInstance.LJJJLZIJ || interfaceC2211401Bgo == null || (enumC2210521BfOFromKey = EnumC2210521BfO.fromKey(str)) == null) {
            return true;
        }
        C2210851Bfv c2210851Bfv = (C2210851Bfv) interfaceC2211401Bgo;
        if (enumC2210521BfOFromKey != EnumC2210521BfO.USER_ID) {
            return true;
        }
        return c2210851Bfv.LIZ.LIZJ(str2);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorError(String str, String str2) {
        if (!isMonitorEnabled()) {
            return;
        }
        this.appLogInstance.LJJJJLI.LJI(str, new Throwable(str2), true);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorIncreaseStats(String str, int i) {
        this.appLogInstance.LJJJJLI.LIZ(i, str);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void printLog(int i, String str) {
        if (!this.appLogInstance.LLLII()) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    this.appLogInstance.LJJZZI.LJIIIZ(0, loggerTags, str, new Object[0]);
                    return;
                } else {
                    this.appLogInstance.LJJZZI.LJIIZILJ(loggerTags, str, null, new Object[0]);
                    return;
                }
            }
            this.appLogInstance.LJJZZI.LJ(0, loggerTags, str, new Object[0]);
            return;
        }
        this.appLogInstance.LJJZZI.LJFF(0, loggerTags, str, new Object[0]);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public PriorityHttpResponse doHttpPost(String str, byte[] bArr, Pair<String, String> pair) {
        Object objValueOf;
        InterfaceC2211401Bgo interfaceC2211401Bgo;
        PriorityHttpResponse priorityHttpResponse;
        String str2;
        byte[] bArrLIZJ = bArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2209901BeO c2209901BeO = this.appLogInstance;
        C2209791BeD c2209791BeD = c2209901BeO.LJJZZI;
        List<String> list = loggerTags;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (c2209901BeO.LLLII()) {
            objValueOf = new String(bArrLIZJ);
        } else {
            objValueOf = Integer.valueOf(bArrLIZJ.length);
        }
        objArr[1] = objValueOf;
        c2209791BeD.LJFF(0, list, "****** priority callback do http post, url: {}, buffer: {}", objArr);
        HashMap map = new HashMap();
        if (this.appLogInstance.LJJJJZI != null) {
            try {
                C2210751Bfl c2210751BflLIZ = ((C2210151Ben) this.appLogInstance.LJJJJZI).LIZ(bArrLIZJ);
                bArrLIZJ = c2210751BflLIZ.LIZ;
                map.putAll(c2210751BflLIZ.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.appLogInstance.LJJZZI.LJIIZILJ(loggerTags, "****** log compress toBytes failed", th, new Object[0]);
                this.appLogInstance.LJJJJLI.LIZIZ(EnumC2210021Bea.COMPRESS_ERROR_COUNT, 1);
            }
        }
        if (this.appLogInstance.LJIL) {
            bArrLIZJ = this.appLogInstance.LJFF.LIZJ.LIZJ(bArrLIZJ);
            map.remove("Content-Encoding");
            map.put("Content-Type", "application/octet-stream;tt-data=a");
        }
        if (this.appLogInstance.LJJJLZIJ) {
            interfaceC2211401Bgo = this.appLogInstance.LJJL;
            if (interfaceC2211401Bgo != null) {
                ((C2210851Bfv) interfaceC2211401Bgo).LIZ.LIZ();
            }
        } else {
            interfaceC2211401Bgo = null;
        }
        C2209901BeO c2209901BeO2 = this.appLogInstance;
        String strLIZ = c2209901BeO2.LJ.LIZ(c2209901BeO2.LJIIJ, str);
        try {
            if (pair != null) {
                byte[] bArrLIZ = this.appLogInstance.getNetClient().LIZ(strLIZ, map, bArrLIZJ);
                byte[] bArrLIZIZ = C20223814Bg.LIZIZ(pair.getFirst(), pair.getSecond(), bArrLIZ);
                if (bArrLIZIZ != null && bArrLIZIZ.length != 0) {
                    str2 = new String(C20223814Bg.LJ(bArrLIZIZ));
                } else {
                    str2 = new String(bArrLIZ);
                }
            } else {
                str2 = this.appLogInstance.getNetClient().post(strLIZ, map, bArrLIZJ);
            }
            if (C2200271B9l.LJII(str2)) {
                priorityHttpResponse = new PriorityHttpResponse(200, "", str2);
            } else {
                priorityHttpResponse = new PriorityHttpResponse(0, "response empty", null);
            }
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                if (th2 instanceof C23066092a) {
                    C23066092a c23066092a = th2;
                    int responseCode = c23066092a.getResponseCode();
                    String message = c23066092a.getMessage();
                    C2209791BeD c2209791BeD2 = this.appLogInstance.LJJZZI;
                    List<String> list2 = loggerTags;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("****** send resultCode: ");
                    sbLIZ.append(responseCode);
                    c2209791BeD2.LJIIZILJ(list2, C2188811AlT.LIZIZ(sbLIZ), th2, new Object[0]);
                    priorityHttpResponse = new PriorityHttpResponse(responseCode, message, null);
                } else {
                    priorityHttpResponse = new PriorityHttpResponse(0, th2.toString(), null);
                }
                C2209921BeQ c2209921BeQ = this.appLogInstance.LJJJJLI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("send priority log error, url: ");
                sbLIZ2.append(str);
                c2209921BeQ.LJI(C2188811AlT.LIZIZ(sbLIZ2), new Throwable(priorityHttpResponse.toString()), true);
                if (interfaceC2211401Bgo != null) {
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                if (interfaceC2211401Bgo != null) {
                    ((C2210851Bfv) interfaceC2211401Bgo).LIZ();
                }
                throw th3;
            }
        }
        if (interfaceC2211401Bgo != null) {
            ((C2210851Bfv) interfaceC2211401Bgo).LIZ();
        }
        this.appLogInstance.LJJZZI.LJIIIZ(0, loggerTags, "****** priority request cost {}ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return priorityHttpResponse;
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorLatency(int i, int i2, int i3) throws Throwable {
        EnumC2176431AFt enumC2176431AFt;
        if (!isMonitorEnabled()) {
            return;
        }
        C2209921BeQ c2209921BeQ = this.appLogInstance.LJJJJLI;
        EnumC2176421AFs enumC2176421AFsFromLabel = EnumC2176421AFs.fromLabel(i2);
        C2210031Beb c2210031Beb = c2209921BeQ.LL;
        if (c2210031Beb.LIZIZ && c2210031Beb.LJFF) {
            C2209791BeD.LJIJJ().LJIIIZ(8, C2209921BeQ.LLJILJILJ, "onLatency {} -> {}", Integer.valueOf(i), Integer.valueOf(i3));
            C0NBM c0nbm = c2209921BeQ.LLILZIL;
            c0nbm.getClass();
            if (i3 <= 1) {
                enumC2176431AFt = EnumC2176431AFt.l_0_1;
            } else if (i3 <= 10) {
                enumC2176431AFt = EnumC2176431AFt.l_1_10;
            } else if (i3 <= 20) {
                enumC2176431AFt = EnumC2176431AFt.l_10_20;
            } else if (i3 <= 30) {
                enumC2176431AFt = EnumC2176431AFt.l_20_30;
            } else if (i3 <= 40) {
                enumC2176431AFt = EnumC2176431AFt.l_30_40;
            } else if (i3 <= 50) {
                enumC2176431AFt = EnumC2176431AFt.l_40_50;
            } else if (i3 <= 60) {
                enumC2176431AFt = EnumC2176431AFt.l_50_60;
            } else if (i3 <= 120) {
                enumC2176431AFt = EnumC2176431AFt.l_60_120;
            } else {
                enumC2176431AFt = EnumC2176431AFt.l_120_;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("_");
            sbLIZ.append(enumC2176421AFsFromLabel.toString());
            sbLIZ.append("_");
            sbLIZ.append(enumC2176431AFt.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            synchronized (c0nbm.LIZIZ) {
                try {
                    try {
                        try {
                            try {
                                C2176401AFq c2176401AFq = (C2176401AFq) ((ConcurrentHashMap) c0nbm.LIZIZ).get(strLIZIZ);
                                if (c2176401AFq == null) {
                                    try {
                                        try {
                                            c2176401AFq = new C2176401AFq();
                                            try {
                                                c2176401AFq.LIZLLL = enumC2176431AFt;
                                                try {
                                                    c2176401AFq.LIZJ = enumC2176421AFsFromLabel;
                                                    try {
                                                        c2176401AFq.LIZIZ = i;
                                                        try {
                                                            try {
                                                                try {
                                                                    ((ConcurrentHashMap) c0nbm.LIZIZ).put(strLIZIZ, c2176401AFq);
                                                                    try {
                                                                        try {
                                                                            c2176401AFq.LIZ++;
                                                                            try {
                                                                                return;
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                } else {
                                    c2176401AFq.LIZ++;
                                    return;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                    }
                } catch (Throwable th15) {
                    th = th15;
                }
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th16) {
                            th = th16;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorStage(String str, String str2, int i, int i2, String str3, String str4, long j) {
        if (!isStageEnabled()) {
            return;
        }
        C2210101Bei.LIZJ(this.appLogInstance.LJJJJLI, EnumC21646419na.fromLabel(str), new C21655119oz(str2, i, str3, str4, j, EnumC2176421AFs.fromLabel(i2)));
    }
}
