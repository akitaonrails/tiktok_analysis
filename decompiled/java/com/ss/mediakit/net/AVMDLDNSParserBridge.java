package com.ss.mediakit.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLDNSParserBridge implements AVMDLDNSParserListener {
    public static boolean v2Usable = true;
    public String host;
    public String ipList;
    public boolean isFinish;
    public Lock lock = new ReentrantLock();
    public long handle = 0;

    public static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    public static native void _notifyParserResultV2(long j, String str, String str2, long j2, String str3, int i);

    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("****get result:");
            sbLIZ.append(str);
            AVMDLLog.d("AVMDLDNSParserBridge", C2188811AlT.LIZIZ(sbLIZ));
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public void release() {
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLDNSParserBridge", C786410Ut5.k4(locale, "----start release:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0L;
            this.lock.unlock();
            AVMDLLog.d("AVMDLDNSParserBridge", C786410Ut5.k4(locale, "remove host:%s", new Object[]{this.host}));
            AVMDLDNSParser.getInstance().removeHost(this.host, this);
            AVMDLLog.d("AVMDLDNSParserBridge", C786410Ut5.k4(locale, "****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public String getBackUp(String str) {
        String str2;
        AVMDLDNSInfo backUpIp;
        if (AVMDLDNSParser.getIntValue(5) == 1 && (backUpIp = IPCache.getInstance().getBackUpIp(str)) != null) {
            str2 = backUpIp.mIpList;
        } else {
            str2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("****get backup ip result:");
        sbLIZ.append(str2);
        AVMDLLog.d("AVMDLDNSParserBridge", C2188811AlT.LIZIZ(sbLIZ));
        return str2;
    }

    public static void prepareResolve(String str, int i) {
        if (str != null && !str.isEmpty()) {
            AVMDLDNSParser.getInstance().prepareResolve(str.split(","), i);
        } else {
            AVMDLLog.e("AVMDLDNSParserBridge", "[MIO-DNS] prepareResolve hosts is null");
        }
    }

    public int start(long j, String str) {
        int i;
        if (v2Usable && (i = parserResult(j, str, 2, -1)) > 0) {
            return i;
        }
        return parserResult(j, str, 1, -1);
    }

    public static void updateDNSInfo(String str, int i, int i2) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
                AVMDLDNSParser.updateDNSInfo((HashMap<String, String>) map, i, i2);
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[MIO-DNS] updateDNSInfo Failed to parse DNS info JSON: ");
                sbLIZ.append(e.getMessage());
                AVMDLLog.e("AVMDLDNSParserBridge", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        AVMDLLog.e("AVMDLDNSParserBridge", "[MIO-DNS] updateDNSInfo jsonStr is null");
    }

    public int start(long j, String str, int i) {
        int i2;
        if (v2Usable && (i2 = parserResult(j, str, 2, i)) > 0) {
            return i2;
        }
        return parserResult(j, str, 1, i);
    }

    public void triggerRefresh(long j, String str, int i) {
        AVMDLDNSParser.getInstance().postDNSInfoRefreshMsg(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[Catch: UnsatisfiedLinkError -> 0x00f3, all -> 0x014b, TryCatch #0 {UnsatisfiedLinkError -> 0x00f3, blocks: (B:18:0x0096, B:20:0x009e, B:22:0x00cb, B:23:0x00dd), top: B:44:0x0096 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int parserResult(long r22, java.lang.String r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.net.AVMDLDNSParserBridge.parserResult(long, java.lang.String, int, int):int");
    }

    @Override // com.ss.mediakit.net.AVMDLDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3, int i2) {
        if (!this.isFinish && v2Usable) {
            parserResult(i, str, str2, j, str3, i2, 2);
        }
        if (!this.isFinish) {
            parserResult(i, str, str2, j, str3, i2, 1);
        }
    }

    private void parserResult(int i, String str, String str2, long j, String str3, int i2, int i3) {
        String str4;
        int i4 = i2;
        long j2 = j;
        String str5 = str2;
        this.lock.lock();
        try {
            try {
                if (!this.isFinish) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(i);
                    if (TextUtils.isEmpty(str5)) {
                        str4 = "null";
                    } else {
                        str4 = str5;
                    }
                    objArr[1] = str4;
                    objArr[2] = Integer.valueOf(i4);
                    AVMDLLog.d("AVMDLDNSParserBridge", C786410Ut5.k4(locale, "receive completion code:%d result:%s type:%d", objArr));
                    if (TextUtils.isEmpty(str5) && AVMDLDNSParser.getIntValue(5) == 1) {
                        AVMDLLog.d("AVMDLDNSParserBridge", "pare result is null, try get backupip");
                        AVMDLDNSInfo backUpIp = IPCache.getInstance().getBackUpIp(str);
                        if (backUpIp != null) {
                            str5 = backUpIp.mIpList;
                            i4 = backUpIp.mType;
                            AVMDLLog.d("AVMDLDNSParserBridge", C786410Ut5.k4(locale, "get backup ip, result:%s type:%d", new Object[]{str5, Integer.valueOf(i4)}));
                            j2 = 0;
                        }
                    }
                    this.ipList = str5;
                    this.isFinish = true;
                    long j3 = this.handle;
                    if (j3 != 0) {
                        if (i3 == 2) {
                            v2Usable = true;
                            _notifyParserResultV2(j3, str, str5, j2, str3, i4);
                        } else {
                            v2Usable = false;
                            _notifyParserResult(j3, str, str5, j2, str3);
                        }
                    }
                } else {
                    AVMDLLog.d("AVMDLDNSParserBridge", C786410Ut5.k4(Locale.US, "has finished not nedd cur completion code:%d result:%s expiredTime:%d", new Object[]{Integer.valueOf(i), str5, Long.valueOf(j2)}));
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                AVMDLLog.d("AVMDLDNSParserBridge", e.toString());
                if (v2Usable) {
                    v2Usable = false;
                }
                this.isFinish = false;
            }
            this.lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }
}
