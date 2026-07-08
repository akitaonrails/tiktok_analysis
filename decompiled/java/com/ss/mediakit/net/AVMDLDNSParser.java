package com.ss.mediakit.net;

import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLDNSParser {
    public static AVMDLCustomHTTPDNSParser mCustomHttpDNSParser = null;
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalEnableBackUpIp = 0;
    public static int mGlobalEnableDNSLog = 0;
    public static int mGlobalEnableParallel = 0;
    public static int mGlobalEnableRefresh = 0;
    public static int mGlobalForceExpiredTime = 0;
    public static String mGlobalGoogleDNSParseHost = "";
    public static int mGlobalMainType = 0;
    public static String mGlobalOwnDNSParseHost = "";
    public static volatile AVMDLDNSParser mInstance;
    public static AVMDLNetClientMaker mNetClientMaker;
    public Handler mHandler;
    public int mRefCount;
    public int mState;
    public HandlerThread mThread;
    public int mType;
    public int mTimeOut = 5;
    public Lock mLock = new ReentrantLock();
    public Map<String, AVMDLHostProcessor> mProcessors = new HashMap();

    public void release() {
    }

    public static AVMDLDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new AVMDLDNSParser();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public static AVMDLNetClient getNetClient() {
        AVMDLNetClient netClient;
        synchronized (AVMDLDNSParser.class) {
            try {
                AVMDLNetClientMaker aVMDLNetClientMaker = mNetClientMaker;
                netClient = aVMDLNetClientMaker != null ? aVMDLNetClientMaker.getNetClient() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return netClient == null ? new AVMDLHTTPNetwork() : netClient;
    }

    public static void processHijack() {
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----process hijack old dnsmain:%d back:%d", new Object[]{Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)}));
        int i = mGlobalMainType;
        if (i == 0) {
            mGlobalMainType = mGlobalBackType;
            mGlobalBackType = i;
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****process hijack new dnsmain:%d back:%d", new Object[]{Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)}));
    }

    public AVMDLDNSParser() {
        HandlerThread handlerThread = new HandlerThread("AVMDLDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new BPEAHandler(C786410Ut5.W2(this.mThread)) { // from class: com.ss.mediakit.net.AVMDLDNSParser.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AVMDLDNSInfo aVMDLDNSInfo;
                C1C7U.LIZ("AVMDLDNSParser@6d77.<init>$1");
                if (HandlerHook.getMessageObj(message.obj) != null) {
                    aVMDLDNSInfo = (AVMDLDNSInfo) HandlerHook.getMessageObj(message.obj);
                } else {
                    aVMDLDNSInfo = null;
                }
                Locale locale = Locale.US;
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
                int i = message.what;
                switch (i) {
                    case 2:
                        AVMDLDNSParser.this.proccessFailMsg(i, aVMDLDNSInfo);
                        break;
                    case 3:
                        AVMDLDNSParser.this.proccessSucMsg(i, aVMDLDNSInfo);
                        break;
                    case 4:
                        AVMDLDNSParser.this.proccessPreParseMsg(i, aVMDLDNSInfo);
                        break;
                    case 6:
                        AVMDLDNSParser.this.processBackupParseMsg(i, aVMDLDNSInfo);
                        break;
                    case 7:
                        AVMDLDNSParser.this.processBatchParseMsg(i, aVMDLDNSInfo);
                        break;
                    case 8:
                        AVMDLDNSParser.this.processDNSTypeChangedParseMsg(i, aVMDLDNSInfo);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        AVMDLDNSParser.this.processPreDNSRequestsMsg(i, aVMDLDNSInfo);
                        break;
                }
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
                C1C7U.LIZIZ("AVMDLDNSParser@6d77.<init>$1");
            }
        };
    }

    public static int getIntValue(int i) {
        int i2;
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----get value for key:%d", new Object[]{Integer.valueOf(i)}));
        synchronized (AVMDLDNSParser.class) {
            try {
                if (i == 10) {
                    i2 = mGlobalForceExpiredTime;
                } else {
                    switch (i) {
                        case 0:
                            i2 = mGlobalMainType;
                            break;
                        case 1:
                            i2 = mGlobalBackType;
                            break;
                        case 2:
                            i2 = mGlobalDefaultExpiredTime;
                            break;
                        case 3:
                            i2 = mGlobalBackUpDelayedTime;
                            break;
                        case 4:
                            i2 = mGlobalEnableParallel;
                            break;
                        case 5:
                            i2 = mGlobalEnableBackUpIp;
                            break;
                        case 6:
                            i2 = mGlobalEnableRefresh;
                            break;
                        case 7:
                            i2 = mGlobalEnableDNSLog;
                            break;
                        default:
                            i2 = Integer.MIN_VALUE;
                            break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****get value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        return i2;
    }

    private void reportLog(AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && mGlobalEnableDNSLog > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_type", "mdl_dns_log");
                jSONObject.put("dns_type", aVMDLDNSInfo.mType);
                jSONObject.put("ip_list", aVMDLDNSInfo.mIpList);
                AVMDLDataLoader.getInstance().onLogInfo(15, 0, C786410Ut5.J3(jSONObject));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    private void sendBatchParseMsg(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, strArr, (String) null, 0L, (String) null);
            Message message = new Message();
            message.what = 7;
            message.obj = aVMDLDNSInfo;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "send msg for batch parse", new Object[0]));
            C786410Ut5.LJLJJL(this.mHandler, message);
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", "hosts null not need do batch parse");
    }

    public static void setClientMaker(AVMDLNetClientMaker aVMDLNetClientMaker) {
        synchronized (AVMDLDNSParser.class) {
            if (aVMDLNetClientMaker != null) {
                try {
                    mNetClientMaker = aVMDLNetClientMaker;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void setCustomHttpDNSParser(AVMDLCustomHTTPDNSParser aVMDLCustomHTTPDNSParser) {
        synchronized (AVMDLDNSParser.class) {
            try {
                Locale locale = Locale.US;
                int i = 1;
                Object[] objArr = new Object[1];
                if (aVMDLCustomHTTPDNSParser == null) {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "set custom http dns parser:%d", objArr));
                if (aVMDLCustomHTTPDNSParser != null) {
                    mCustomHttpDNSParser = aVMDLCustomHTTPDNSParser;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void doParseHosts(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            int length = strArr.length;
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    if (IPCache.getInstance().get(strArr[i]) != null) {
                        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "for host:%s has dns info not need do batch parse", new Object[]{strArr[i]}));
                        strArr[i] = null;
                        length--;
                    } else {
                        this.mLock.lock();
                        try {
                            if (this.mProcessors.get(strArr[i]) != null) {
                                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "for host:%s has processor not need do batch parse", new Object[]{strArr[i]}));
                                strArr[i] = null;
                                length--;
                            }
                            this.mLock.unlock();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.mLock.unlock();
                            throw th;
                        }
                    }
                }
            }
            if (length == 0) {
                AVMDLLog.d("AVMDLDNSParser", "has no hosts need do batch parse");
                return;
            } else {
                sendBatchParseMsg(strArr);
                return;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", "hosts is null, not need do batch host parse");
    }

    private void removeListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        if (!TextUtils.isEmpty(str) && aVMDLDNSParserListener != null) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "---remove listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor != null) {
                    AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "remove listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.remove(aVMDLDNSParserListener);
                    if (aVMDLHostProcessor.mListeners.size() == 0) {
                        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "listeners empty for processors", new Object[0]));
                    }
                }
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****end remove listener", new Object[0]));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
    }

    private void sendPreParseMsg(String str, long j) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            if (mGlobalEnableRefresh > 0) {
                AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0L, (String) null);
                Message message = new Message();
                message.what = 4;
                message.obj = aVMDLDNSInfo;
                long j2 = j + 3000;
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "send preparse for host:%s delayTime:%d", new Object[]{aVMDLDNSInfo.mHost, Long.valueOf(j2)}));
                C786410Ut5.LJLJLJ(this.mHandler, message, j2);
                return;
            }
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", "host is null or delayTimeMs invalid,not support preparse");
    }

    public static void setIntValue(int i, int i2) {
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        synchronized (AVMDLDNSParser.class) {
            try {
                if (i != 10) {
                    switch (i) {
                        case 0:
                            mGlobalMainType = i2;
                            break;
                        case 1:
                            mGlobalBackType = i2;
                            break;
                        case 2:
                            mGlobalDefaultExpiredTime = i2;
                            break;
                        case 3:
                            mGlobalBackUpDelayedTime = i2;
                            break;
                        case 4:
                            mGlobalEnableParallel = i2;
                            break;
                        case 5:
                            mGlobalEnableBackUpIp = i2;
                            break;
                        case 6:
                            mGlobalEnableRefresh = i2;
                            break;
                        case 7:
                            mGlobalEnableDNSLog = i2;
                            break;
                    }
                } else {
                    mGlobalForceExpiredTime = i2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setStringValue(int i, String str) {
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "****set value:%s for key:%d", new Object[]{str, Integer.valueOf(i)}));
        synchronized (AVMDLDNSParser.class) {
            try {
                if (i != 8) {
                    if (i == 9 && !TextUtils.isEmpty(str)) {
                        mGlobalGoogleDNSParseHost = str;
                    }
                } else if (!TextUtils.isEmpty(str)) {
                    mGlobalOwnDNSParseHost = str;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void postDNSInfoRefreshMsg(String str, int i) {
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(i, str, (String) null, 0L, (String) null);
        Message message = new Message();
        message.what = 8;
        message.obj = aVMDLDNSInfo;
        C786410Ut5.LJLJJL(this.mHandler, message);
    }

    public void postParseHostMsg(String str, int i) {
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(i, str, (String) null, 0L, (String) null);
        Message message = new Message();
        message.what = 5;
        message.obj = aVMDLDNSInfo;
        C786410Ut5.LJLJJL(this.mHandler, message);
    }

    public void prepareResolve(String[] strArr, int i) {
        if (strArr != null && strArr.length != 0) {
            if (i != -1 && i != 0 && i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[MIO-DNS] prepare resolve msg fail, un support type ");
                sbLIZ.append(i);
                AVMDLLog.d("AVMDLDNSParser", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo();
            aVMDLDNSInfo.mHosts = strArr;
            aVMDLDNSInfo.mType = i;
            Message message = new Message();
            message.what = 9;
            message.obj = aVMDLDNSInfo;
            C786410Ut5.LJLJJL(this.mHandler, message);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[MIO-DNS] prepare resolve msg send, hosts:");
            sbLIZ2.append(TextUtils.join(",", strArr));
            sbLIZ2.append(", type:");
            sbLIZ2.append(i);
            AVMDLLog.d("AVMDLDNSParser", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", "[MIO-DNS] prepare resolve msg fail, info or hosts is null");
    }

    public void proccessFailMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && aVMDLDNSInfo.mHost != null) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
                if (aVMDLHostProcessor != null && aVMDLHostProcessor.isValidSourceId(aVMDLDNSInfo.mId)) {
                    aVMDLHostProcessor.processResult(i, aVMDLDNSInfo);
                    if (aVMDLHostProcessor.isEnd()) {
                        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "processor end, notify result", new Object[0]));
                        for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                            if (aVMDLDNSParserListener != null) {
                                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "listener:%s oncompletion fail", new Object[]{aVMDLDNSParserListener}));
                                aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, null, 0L, null, aVMDLDNSInfo.mType);
                            }
                        }
                        aVMDLHostProcessor.mListeners.clear();
                        this.mProcessors.remove(aVMDLDNSInfo.mHost);
                    } else {
                        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "processor is not end", new Object[0]));
                    }
                }
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "****end proc fail msg what", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "proc fail msg  fail, info or host is null", new Object[0]));
    }

    public void proccessPreParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        long j;
        if (mGlobalEnableRefresh <= 0) {
            AVMDLLog.d("AVMDLDNSParser", "not support preparse");
            return;
        }
        if (aVMDLDNSInfo != null && aVMDLDNSInfo.mHost != null) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----proc pre parse msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
            AVMDLDNSInfo aVMDLDNSInfo2 = IPCache.getInstance().get(aVMDLDNSInfo.mHost);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[2];
            objArr[0] = aVMDLDNSInfo2;
            if (aVMDLDNSInfo2 == null) {
                j = -1;
            } else {
                j = aVMDLDNSInfo2.mExpiredTime;
            }
            objArr[1] = Long.valueOf(j);
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "cache:%s expiredT:%d", objArr));
            if (aVMDLDNSInfo2 == null || aVMDLDNSInfo2.mExpiredTime < jCurrentTimeMillis) {
                AVMDLLog.d("AVMDLDNSParser", "add host for preparse");
                addListenerInternal(aVMDLDNSInfo.mHost, null, aVMDLDNSInfo.mType);
            }
            AVMDLLog.d("AVMDLDNSParser", "****proc pre parse msg what:%d host:%s");
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "proc pre msg  fail, info or host is null", new Object[0]));
    }

    public void proccessSucMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        HashMap<AVMDLDNSParserListener, Integer> map;
        if (aVMDLDNSInfo != null && aVMDLDNSInfo.mHost != null) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
                if (aVMDLHostProcessor != null && (map = aVMDLHostProcessor.mListeners) != null) {
                    for (AVMDLDNSParserListener aVMDLDNSParserListener : map.keySet()) {
                        if (aVMDLDNSParserListener != null) {
                            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "listener:%s oncompletion suc", new Object[]{aVMDLDNSParserListener}));
                            aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
                        }
                    }
                    aVMDLHostProcessor.mListeners.clear();
                    this.mProcessors.remove(aVMDLDNSInfo.mHost);
                    AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "remove all listeners and remove host", new Object[0]));
                }
                sendPreParseMsg(aVMDLDNSInfo.mHost, aVMDLDNSInfo.mExpiredTime - System.currentTimeMillis());
                reportLog(aVMDLDNSInfo);
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "****end proc suc msg", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "proc suc msg  fail, info or host is null", new Object[0]));
    }

    public void processBackupParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && aVMDLDNSInfo.mHost != null) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
                if (aVMDLHostProcessor != null) {
                    AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
                    aVMDLHostProcessor.processMsg(i, aVMDLDNSInfo);
                } else {
                    AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****get processor null for host:%s", new Object[]{aVMDLDNSInfo.mHost}));
                }
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****end proc parser msg", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "proc parser msg  fail, info or host is null", new Object[0]));
    }

    public void processBatchParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        String[] strArr;
        if (aVMDLDNSInfo != null && (strArr = aVMDLDNSInfo.mHosts) != null && strArr.length != 0) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----proc batch parse msg what:%d", new Object[]{Integer.valueOf(i)}));
            if (mGlobalEnableParallel <= 0 && mGlobalMainType != 2) {
                new LocalDNSHosts(aVMDLDNSInfo.mHosts, this.mHandler).start();
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****end proc batch parser msg", new Object[0]));
                return;
            }
            try {
                new HTTPDNSHosts(aVMDLDNSInfo.mHosts, null, 2, this.mHandler).start();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Locale locale2 = Locale.US;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse end create httpdnshosts fail");
                sbLIZ.append(e);
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale2, C2188811AlT.LIZIZ(sbLIZ), new Object[0]));
                return;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "proc parser msg  fail, info or host is null", new Object[0]));
    }

    public void processDNSTypeChangedParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && aVMDLDNSInfo.mHost != null) {
            Locale locale = Locale.US;
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "----proc dnstype change parse msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
            this.mLock.lock();
            try {
                getInstance().addHost(aVMDLDNSInfo.mHost, null, aVMDLDNSInfo.mType);
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****end proc main parse msg", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(Locale.US, "proc main parse msg  fail, info or host is null", new Object[0]));
    }

    public void processPreDNSRequestsMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        String[] strArr;
        if (aVMDLDNSInfo != null && (strArr = aVMDLDNSInfo.mHosts) != null && strArr.length != 0) {
            int i2 = aVMDLDNSInfo.mType;
            if (i2 == -1) {
                i2 = mGlobalMainType;
            }
            if (i2 == 2) {
                try {
                    new HTTPDNSHosts(strArr, null, 2, this.mHandler).start();
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[MIO-DNS] pre dns requests msg fail, create http dns hosts fail");
                    sbLIZ.append(e);
                    AVMDLLog.d("AVMDLDNSParser", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
            }
            if (i2 == 0) {
                new LocalDNSHosts(strArr, this.mHandler).start();
            }
            AVMDLLog.d("AVMDLDNSParser", "[MIO-DNS] pre dns requests msg end");
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", "[MIO-DNS] pre dns requests msg fail, info or hosts is null");
    }

    public void removeHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        removeListenerInternal(str, aVMDLDNSParserListener);
    }

    public void setBackUpIP(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0L, (String) null));
        }
    }

    private void addListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener, int i) {
        boolean z;
        int i2 = i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "---add listener:%s for host:%s dnstype:%d", new Object[]{aVMDLDNSParserListener, str, Integer.valueOf(i2)}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "get processor:%s", new Object[]{aVMDLHostProcessor}));
            int i3 = mGlobalMainType;
            int i4 = mGlobalBackType;
            if (i2 != 2 && i2 != 3) {
                i2 = i3;
            } else {
                i4 = 0;
            }
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "mainType:%d backType:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}));
            if (aVMDLHostProcessor == null) {
                aVMDLHostProcessor = new AVMDLHostProcessor(str, this.mHandler, i2, i4, mGlobalBackUpDelayedTime, mGlobalEnableParallel);
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "create processor:%s", new Object[]{aVMDLHostProcessor}));
                z = true;
            } else {
                z = false;
            }
            if (aVMDLDNSParserListener != null && !aVMDLHostProcessor.mListeners.containsKey(aVMDLDNSParserListener)) {
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "add listener", new Object[0]));
                aVMDLHostProcessor.mListeners.put(aVMDLDNSParserListener, 1);
            }
            this.mProcessors.put(str, aVMDLHostProcessor);
            if (z) {
                AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "new processor implement parse", new Object[0]));
                aVMDLHostProcessor.processMsg(5, new AVMDLDNSInfo(i2, str, (String) null, 0L, (String) null));
            }
            this.mLock.unlock();
            AVMDLLog.d("AVMDLDNSParser", C786410Ut5.k4(locale, "****end add listener", new Object[0]));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mLock.unlock();
            throw th;
        }
    }

    public static void updateDNSInfo(HashMap<String, String> map, int i, int i2) {
        if (map == null) {
            return;
        }
        if (i2 != 0 && i2 != 2 && i2 != 5) {
            return;
        }
        if (i <= 0) {
            i = mGlobalDefaultExpiredTime;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + (((long) i) * 1000);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo();
            aVMDLDNSInfo.mHost = entry.getKey();
            aVMDLDNSInfo.mIpList = entry.getValue();
            aVMDLDNSInfo.mType = i2;
            aVMDLDNSInfo.mExpiredTime = jCurrentTimeMillis;
            aVMDLDNSInfo.mTTL = i;
            IPCache.getInstance().put(aVMDLDNSInfo.mHost, aVMDLDNSInfo);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MIO-DNS] update dns info, host = ");
            sbLIZ.append(aVMDLDNSInfo.mHost);
            sbLIZ.append(" type = ");
            sbLIZ.append(aVMDLDNSInfo.mType);
            sbLIZ.append(" iplist = ");
            sbLIZ.append(aVMDLDNSInfo.mIpList);
            sbLIZ.append(" ttl = ");
            sbLIZ.append(aVMDLDNSInfo.mTTL);
            AVMDLLog.d("AVMDLDNSParser", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void updateFeedDNSInfo(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            long jCurrentTimeMillis = System.currentTimeMillis() + (((long) mGlobalDefaultExpiredTime) * 1000);
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(5, str, str2, jCurrentTimeMillis, (String) null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("server iplist from feed, host = ");
            sbLIZ.append(str);
            sbLIZ.append(", type = ");
            sbLIZ.append(5);
            sbLIZ.append(", iplist = ");
            sbLIZ.append(str2);
            sbLIZ.append(", expiredTimeMs = ");
            sbLIZ.append(jCurrentTimeMillis);
            AVMDLLog.d("AVMDLDNSParser", C2188811AlT.LIZIZ(sbLIZ));
            IPCache.getInstance().put(str, aVMDLDNSInfo);
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", "ip direct info invalid");
    }

    public void addHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener, int i) {
        addListenerInternal(str, aVMDLDNSParserListener, i);
    }

    public static void updateDNSInfo(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(10, str, str2, (j + ((long) mGlobalDefaultExpiredTime)) * 1000, (String) null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("server iplist, host = ");
            sbLIZ.append(str);
            sbLIZ.append(" type = ");
            sbLIZ.append(10);
            sbLIZ.append(" iplist = ");
            sbLIZ.append(str2);
            AVMDLLog.d("AVMDLDNSParser", C2188811AlT.LIZIZ(sbLIZ));
            IPCache.getInstance().put(str, aVMDLDNSInfo);
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", "ip direct info invalid");
    }
}
