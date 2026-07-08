package com.ss.bduploader.net;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes24.dex */
public class BDUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    public static BDUploadDNSParser mInstance;
    public Handler mHandler;
    public int mRefCount;
    public int mState;
    public HandlerThread mThread;
    public int mType;
    public int mTimeOut = 5;
    public Lock mLock = new ReentrantLock();
    public Map<String, BDUploadHostProcessor> mProcessors = new HashMap();

    public void release() {
    }

    public static BDUploadDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (BDUploadDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new BDUploadDNSParser();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public BDUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread("BDUploadDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new BPEAHandler(C786410Ut5.W2(this.mThread)) { // from class: com.ss.bduploader.net.BDUploadDNSParser.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                BDUploadDNSInfo bDUploadDNSInfo;
                C1C7U.LIZ("BDUploadDNSParser@9e8.<init>$1");
                if (HandlerHook.getMessageObj(message.obj) != null) {
                    bDUploadDNSInfo = (BDUploadDNSInfo) HandlerHook.getMessageObj(message.obj);
                } else {
                    bDUploadDNSInfo = null;
                }
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            BDUploadDNSParser.this.proccessSucMsg(i, bDUploadDNSInfo);
                        }
                    } else {
                        BDUploadDNSParser.this.proccessFailMsg(i, bDUploadDNSInfo);
                    }
                } else {
                    BDUploadDNSParser.this.processParseMsg(i, bDUploadDNSInfo);
                }
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
                C1C7U.LIZIZ("BDUploadDNSParser@9e8.<init>$1");
            }
        };
    }

    private void addListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("---add listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("get processor:%s", new Object[]{bDUploadHostProcessor}));
            if (bDUploadHostProcessor == null) {
                bDUploadHostProcessor = new BDUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("create processor:%s", new Object[]{bDUploadHostProcessor}));
                z = true;
            } else {
                z = false;
            }
            if (bDUploadDNSParserListener != null && !bDUploadHostProcessor.mListeners.containsKey(bDUploadDNSParserListener)) {
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("add listener", new Object[0]));
                bDUploadHostProcessor.mListeners.put(bDUploadDNSParserListener, 1);
            }
            this.mProcessors.put(str, bDUploadHostProcessor);
            if (z) {
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("new processor implement parse", new Object[0]));
                bDUploadHostProcessor.processMsg(0, new BDUploadDNSInfo(mGlobalMainType, str, null, 0L, null));
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****end add listener", new Object[0]));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mLock.unlock();
            throw th;
        }
    }

    private void removeListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        if (!TextUtils.isEmpty(str) && bDUploadDNSParserListener != null) {
            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("---remove listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("get processor:%s", new Object[]{bDUploadHostProcessor}));
                if (bDUploadHostProcessor != null) {
                    BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("remove listener", new Object[0]));
                    bDUploadHostProcessor.mListeners.remove(bDUploadDNSParserListener);
                    if (bDUploadHostProcessor.mListeners.size() == 0) {
                        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("listeners empty remove host from processors", new Object[0]));
                        this.mProcessors.remove(str);
                    }
                }
                this.mLock.unlock();
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public static void setIntValue(int i, int i2) {
        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        mGlobalBackUpDelayedTime = i2;
                        return;
                    }
                    return;
                }
                mGlobalDefaultExpiredTime = i2;
                return;
            }
            mGlobalBackType = i2;
            return;
        }
        mGlobalMainType = i2;
    }

    public void addHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        addListenerInternal(str, bDUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(i, str, null, 0L, null);
        Message message = new Message();
        message.what = 0;
        message.obj = bDUploadDNSInfo;
        C786410Ut5.LJLJJL(this.mHandler, message);
    }

    public void proccessFailMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo != null && bDUploadDNSInfo.mHost != null) {
            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
                if (bDUploadHostProcessor != null && bDUploadHostProcessor.isValidSourceId(bDUploadDNSInfo.mId)) {
                    bDUploadHostProcessor.processResult(i, bDUploadDNSInfo);
                    if (bDUploadHostProcessor.isEnd()) {
                        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("processor end, notify result", new Object[0]));
                        for (BDUploadDNSParserListener bDUploadDNSParserListener : bDUploadHostProcessor.mListeners.keySet()) {
                            if (bDUploadDNSParserListener != null) {
                                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("listener:%s oncompletion fail", new Object[]{bDUploadDNSParserListener}));
                                bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, null, 0L, null);
                            }
                        }
                        bDUploadHostProcessor.mListeners.clear();
                        this.mProcessors.remove(bDUploadDNSInfo.mHost);
                    } else {
                        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("processor is not end", new Object[0]));
                    }
                }
                this.mLock.unlock();
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****end proc fail msg what", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("proc fail msg  fail, info or host is null", new Object[0]));
    }

    public void proccessSucMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        HashMap<BDUploadDNSParserListener, Integer> map;
        if (bDUploadDNSInfo != null && bDUploadDNSInfo.mHost != null) {
            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
                if (bDUploadHostProcessor != null && (map = bDUploadHostProcessor.mListeners) != null) {
                    for (BDUploadDNSParserListener bDUploadDNSParserListener : map.keySet()) {
                        if (bDUploadDNSParserListener != null) {
                            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("listener:%s oncompletion suc", new Object[]{bDUploadDNSParserListener}));
                            bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, bDUploadDNSInfo.mIpList, bDUploadDNSInfo.mExpiredTime, null);
                        }
                    }
                    bDUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(bDUploadDNSInfo.mHost);
                    BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("remove all listeners and remove host", new Object[0]));
                }
                this.mLock.unlock();
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****end proc suc msg", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("proc suc msg  fail, info or host is null", new Object[0]));
    }

    public void processParseMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo != null && bDUploadDNSInfo.mHost != null) {
            BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
                if (bDUploadHostProcessor != null) {
                    BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("----get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
                    bDUploadHostProcessor.processMsg(i, bDUploadDNSInfo);
                } else {
                    BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****get processor null for host:%s", new Object[]{bDUploadDNSInfo.mHost}));
                }
                this.mLock.unlock();
                BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("****end proc parser msg", new Object[0]));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
        BDUploadLog.d("BDUploadDNSParser", C786410Ut5.j4("proc parser msg  fail, info or host is null", new Object[0]));
    }

    public void removeHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        removeListenerInternal(str, bDUploadDNSParserListener);
    }
}
