package com.ss.bytertc.audio.device.router;

import X.C2188811AlT;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes35.dex */
public class AudioRouteController implements IAudioRouteCallback {
    public static int EVENT_ONLY_LOG = 0;
    public static int EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE = 1;
    public int currentRouting = -1;
    public boolean isMediaMode = true;
    public ReadWriteLock lock;
    public AudioRouteDeviceManager mAudioRouteDeviceManager;
    public boolean mEnableAutoTest;
    public boolean mEnableUsbAudioRouteOptimization;
    public long nativeAudioRouteControllerPtr;
    public Lock rLock;
    public Lock wLock;

    private native void onDeviceEvent(long j, int i, boolean z);

    private native void onRouteEvent(long j, int i, int i2);

    private String getCaptureDeviceName() {
        this.rLock.lock();
        try {
            String captureDeviceName = this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getCaptureDeviceName();
            this.rLock.unlock();
            return captureDeviceName;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    private String getRenderDeviceName() {
        this.rLock.lock();
        try {
            String renderDeviceName = this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getRenderDeviceName();
            this.rLock.unlock();
            return renderDeviceName;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    private String getSessionInfo() {
        this.rLock.lock();
        try {
            String sessionInfo = this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getSessionInfo();
            this.rLock.unlock();
            return sessionInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    private int release() {
        int iRelease;
        this.wLock.lock();
        Logging.i("AudioRouteController", "release begin");
        try {
            this.nativeAudioRouteControllerPtr = 0L;
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                iRelease = audioRouteDeviceManager.release();
                this.mAudioRouteDeviceManager = null;
            } else {
                iRelease = 0;
            }
            this.currentRouting = -1;
            this.isMediaMode = true;
            Logging.i("AudioRouteController", "release end");
            this.wLock.unlock();
            return iRelease;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.i("AudioRouteController", "release end");
            this.wLock.unlock();
            throw th;
        }
    }

    private void restartBluetoothSco() {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                this.rLock.unlock();
                return;
            }
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                audioRouteDeviceManager.restartBluetoothSco();
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    public AudioRouteController(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.rLock = reentrantReadWriteLock.readLock();
        this.wLock = this.lock.writeLock();
        this.mEnableAutoTest = false;
        this.mEnableUsbAudioRouteOptimization = false;
        this.nativeAudioRouteControllerPtr = j;
        this.mAudioRouteDeviceManager = new AudioRouteDeviceManager(this);
    }

    private int init(boolean z, boolean z2) {
        this.rLock.lock();
        this.mEnableAutoTest = z;
        this.mEnableUsbAudioRouteOptimization = z2;
        try {
            if (this.nativeAudioRouteControllerPtr != 0 && initAudioRouteDeviceManager(z, z2) == 0) {
                int deviceState = this.mAudioRouteDeviceManager.getDeviceState();
                this.rLock.unlock();
                return deviceState;
            }
            this.rLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    private int initAudioRouteDeviceManager(boolean z, boolean z2) {
        int iInit = this.mAudioRouteDeviceManager.init(z, z2);
        if (iInit != 0) {
            release();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init failed. code: ");
            sbLIZ.append(iInit);
            Logging.e("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iInit;
    }

    private int setAudioRoute(int i, boolean z) {
        int i2;
        this.rLock.lock();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioRoute, begin, routing: ");
        sbLIZ.append(i);
        sbLIZ.append(", isMediaMode: ");
        sbLIZ.append(z);
        Logging.i("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setAudioRoute, end, routing: ");
                sbLIZ2.append(i);
                sbLIZ2.append(", isMediaMode: ");
                sbLIZ2.append(z);
                Logging.i("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ2));
                this.rLock.unlock();
                return -5;
            }
            this.isMediaMode = z;
            int audioRoute = this.mAudioRouteDeviceManager.setAudioRoute(i, z);
            if (audioRoute == 0) {
                i2 = i;
            } else {
                i2 = this.currentRouting;
            }
            this.currentRouting = i2;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setAudioRoute, end, routing: ");
            sbLIZ3.append(i);
            sbLIZ3.append(", isMediaMode: ");
            sbLIZ3.append(z);
            Logging.i("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ3));
            this.rLock.unlock();
            return audioRoute;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("setAudioRoute, end, routing: ");
            sbLIZ4.append(i);
            sbLIZ4.append(", isMediaMode: ");
            sbLIZ4.append(z);
            Logging.i("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ4));
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.audio.device.router.IAudioRouteCallback
    public void onDeviceEvent(int i, boolean z) {
        this.rLock.lock();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDeviceEvent, begin, deviceType: ");
        sbLIZ.append(i);
        sbLIZ.append(", connected: ");
        sbLIZ.append(z);
        Logging.i("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                Logging.i("AudioRouteController", "onDeviceEvent, end");
                this.rLock.unlock();
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onDeviceEvent(Java) deviceType:");
            sbLIZ2.append(i);
            sbLIZ2.append(", connected:");
            sbLIZ2.append(z);
            Logging.e("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ2));
            onDeviceEvent(this.nativeAudioRouteControllerPtr, i, z);
            Logging.i("AudioRouteController", "onDeviceEvent, end");
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.i("AudioRouteController", "onDeviceEvent, end");
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.audio.device.router.IAudioRouteCallback
    public void onRouteEvent(int i, int i2, String str) {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                this.rLock.unlock();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRouteEvent-");
            sbLIZ.append(i);
            sbLIZ.append(":");
            sbLIZ.append(i2);
            sbLIZ.append(":");
            sbLIZ.append(str);
            Logging.e("AudioRouteController", C2188811AlT.LIZIZ(sbLIZ));
            onRouteEvent(this.nativeAudioRouteControllerPtr, i, i2);
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }
}
