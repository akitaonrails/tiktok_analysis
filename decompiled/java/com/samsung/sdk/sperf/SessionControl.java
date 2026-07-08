package com.samsung.sdk.sperf;

import X.C1C7U;
import X.C2179971ATj;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.samsung.android.perfsdkservice.IPerfSDKService;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public class SessionControl {
    public static SessionControl instance;
    public LocalSocket client;
    public DataInputStream in;
    public Object localSocketObject;
    public IPerfSDKService mService;
    public DataOutputStream out;
    public Vector<SPerfListener> perfSDKListerners;
    public LocalServerSocket server;
    public String socketName = "PERFSDK_SOC_" + Long.toString(Double.doubleToLongBits(Math.random()), 36).substring(0, 5);

    public SessionControl() {
        createServer();
        SPerfUtil.log("Make Server for connection with PerfSDK Server");
        this.localSocketObject = getService();
        this.perfSDKListerners = new Vector<>();
    }

    public static SessionControl createInstance() {
        if (instance == null) {
            instance = new SessionControl();
        }
        SessionControl sessionControl = instance;
        if (sessionControl == null || !(sessionControl.getDataInputStream() == null || sessionControl.getDataOutputStream() == null)) {
            return instance;
        }
        instance = null;
        return null;
    }

    private void createServer() {
        new BPEAThread(new Runnable() { // from class: com.samsung.sdk.sperf.SessionControl.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("SessionControl@399d.createServer$1");
                com_samsung_sdk_sperf_SessionControl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("SessionControl@399d.createServer$1");
            }

            public void com_samsung_sdk_sperf_SessionControl$1__run$___twin___() {
                try {
                    SessionControl.this.server = new LocalServerSocket(SessionControl.this.socketName);
                    SessionControl sessionControl = SessionControl.this;
                    sessionControl.client = sessionControl.server.accept();
                    SessionControl.this.in = new DataInputStream(SessionControl.this.client.getInputStream());
                    SessionControl.this.out = new DataOutputStream(SessionControl.this.client.getOutputStream());
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        SessionControl.this.server.close();
                        SessionControl.this.server = null;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        SessionControl.this.server = null;
                    }
                }
            }

            public static void com_samsung_sdk_sperf_SessionControl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_samsung_sdk_sperf_SessionControl$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }).start();
    }

    public void addListerner(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector == null) {
            return;
        }
        vector.add(sPerfListener);
    }

    public Object callback(Object obj) {
        return obj;
    }

    public DataInputStream getDataInputStream() {
        return this.in;
    }

    public DataOutputStream getDataOutputStream() {
        return this.out;
    }

    public void notifyReleaseToListener() {
        Iterator<SPerfListener> it2 = this.perfSDKListerners.iterator();
        while (it2.hasNext()) {
            it2.next().onReleasedByTimeout();
        }
    }

    public void notifyyWarningLevelToListener(int i) {
        Iterator<SPerfListener> it2 = this.perfSDKListerners.iterator();
        while (it2.hasNext()) {
            it2.next().onHighTempWarning(i);
        }
    }

    public boolean removeListener(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector == null) {
            return false;
        }
        return vector.remove(sPerfListener);
    }

    public Object getService() {
        if (this.localSocketObject == null) {
            try {
                IBinder service = ServiceManager.getService("perfsdkservice");
                if (service != null) {
                    this.mService = IPerfSDKService.Stub.asInterface(service);
                    SPerfUtil.log("Get mService Interface");
                }
                IPerfSDKService iPerfSDKService = this.mService;
                if (iPerfSDKService != null) {
                    try {
                        this.localSocketObject = Integer.valueOf(iPerfSDKService.initPerfSDK(this.socketName));
                        String allowedPkgName = this.mService.getAllowedPkgName();
                        if (allowedPkgName != null && allowedPkgName.length() > 0) {
                            Boost.setNativePkgName(allowedPkgName);
                        }
                        SPerfUtil.log("Do initPerfSDK");
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (NoSuchMethodError e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.printStackTrace();
            }
        }
        return this.localSocketObject;
    }
}
