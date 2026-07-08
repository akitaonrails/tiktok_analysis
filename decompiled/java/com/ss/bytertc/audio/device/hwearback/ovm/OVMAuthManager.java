package com.ss.bytertc.audio.device.hwearback.ovm;

import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.base.ManufacturerChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class OVMAuthManager extends BPEAHandler {
    public static final Uri authUri = UriProtector.parse("content://com.oplus.ocs.out.OpenCapabilityThirdProvider/oplus");
    public static volatile OVMAuthManager sInstance;
    public List<AuthCallback> listenerList;
    public Messenger mAuthMessenger;
    public int mAuthResultCode;
    public Runnable notifyResultRunnable;

    public interface AuthCallback {
        void onResult(int i);
    }

    public static class CommonStatusCodes {
    }

    public static OVMAuthManager getInstance() {
        if (sInstance == null) {
            synchronized (OVMAuthManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new OVMAuthManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        ArrayList arrayList;
        C1C7U.LIZ("OVMAuthManager@5735.<init>$1L");
        synchronized (this) {
            try {
                arrayList = new ArrayList(this.listenerList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AuthCallback) it2.next()).onResult(this.mAuthResultCode);
        }
        C1C7U.LIZIZ("OVMAuthManager@5735.<init>$1L");
    }

    private void notifyResult() {
        if (this.mAuthResultCode != -2) {
            removeCallbacks(this.notifyResultRunnable);
            postDelayed(this.notifyResultRunnable, 200L);
        }
    }

    public OVMAuthManager() {
        super(Looper.getMainLooper());
        this.mAuthResultCode = -2;
        this.mAuthMessenger = new Messenger(this);
        this.listenerList = new ArrayList();
        this.notifyResultRunnable = new Runnable() { // from class: X.0WKT
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$new$0();
            }
        };
    }

    public synchronized void addCallback(AuthCallback authCallback) {
        if (!this.listenerList.contains(authCallback)) {
            this.listenerList.add(authCallback);
        }
        notifyResult();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C1C7U.LIZ("OVMAuthManager@5735.handleMessage");
        super.handleMessage(message);
        synchronized (this) {
            try {
                Bundle data = message.getData();
                if (data == null) {
                    Logging.e("OVMAuthManager", "handleMessage get bundle is null");
                    C1C7U.LIZIZ("OVMAuthManager@5735.handleMessage");
                } else {
                    this.mAuthResultCode = data.getInt("result_code");
                    notifyResult();
                    C1C7U.LIZIZ("OVMAuthManager@5735.handleMessage");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public synchronized void removeCallback(AuthCallback authCallback) {
        this.listenerList.remove(authCallback);
    }

    public void startAuth(Context context, String str) throws Throwable {
        if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIIZ(bundle, this.mAuthMessenger.getBinder(), "callback");
            this.mAuthResultCode = -2;
            try {
                C2204961BRm.LJJIJL(context.getContentResolver(), authUri, "auth", str, bundle, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquA0Kz8HsnP/dvdtY=", null));
                return;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                Logging.i("OVMAuthManager", "url is not exist, do not need auth ");
                this.mAuthResultCode = -3;
                notifyResult();
                return;
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                Logging.e("OVMAuthManager", "auth error " + e2.toString());
                this.mAuthResultCode = -1;
                notifyResult();
                return;
            }
        }
        Logging.e("OVMAuthManager", "no need to auth");
        this.mAuthResultCode = 1001;
        notifyResult();
    }
}
