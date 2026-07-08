package com.ss.videoarch.live.ttquic;

import X.C19350110n5;
import X.C786410Ut5;
import X.InterfaceC19350010n4;
import Y.ARunnableS10S0202000_29;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class TTLogManager implements InterfaceC19350010n4 {
    public static final String TAG = TTLogManager.class.getCanonicalName();
    public static final String[] mAlogEventKey = {"live_client_log_reserved", "live_client_log_request_start", "live_client_log_response", "live_client_log_net_info", "live_client_log_request_end"};
    public InterfaceC19350010n4 mListener;
    public Handler mLogHandler;
    public final Object mLogLock;
    public HandlerThread mLogThread;

    private void deInit() {
        Handler handler = this.mLogHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mLogHandler = null;
        }
        HandlerThread handlerThread = this.mLogThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mLogThread = null;
        }
    }

    private void init() {
        if (this.mLogThread == null) {
            HandlerThread handlerThread = new HandlerThread("ttquic_log_manager");
            this.mLogThread = handlerThread;
            handlerThread.start();
        }
        if (this.mLogHandler == null) {
            this.mLogHandler = new BPEAHandler(C786410Ut5.W2(this.mLogThread));
        }
    }

    public TTLogManager() {
        this.mLogLock = new Object();
        init();
    }

    public static TTLogManager getInstance() {
        return C19350110n5.LIZ;
    }

    public static int sdk_int() {
        return Build.VERSION.SDK_INT;
    }

    public /* synthetic */ TTLogManager(ARunnableS10S0202000_29 aRunnableS10S0202000_29) {
        this();
    }

    public void setLogListener(InterfaceC19350010n4 interfaceC19350010n4) {
        synchronized (this.mLogLock) {
            try {
                this.mListener = interfaceC19350010n4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onAlog(int i, int i2, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        Handler handler = this.mLogHandler;
        if (handler != null && jSONObject != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS10S0202000_29(jSONObject, i, i2, this, 0));
        }
    }

    @Override // X.InterfaceC19350010n4
    public void onMonitoryLog(final int i, final int i2, final String str) {
        Handler handler = this.mLogHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.10n3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TTLogManager@b606.onMonitoryLog$1");
                    try {
                        synchronized (this.LLILZ.mLogLock) {
                            try {
                                InterfaceC19350010n4 interfaceC19350010n4 = this.LLILZ.mListener;
                                if (interfaceC19350010n4 != null) {
                                    interfaceC19350010n4.onMonitoryLog(i, i2, str);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TTLogManager@b606.onMonitoryLog$1");
                }
            });
        }
    }
}
