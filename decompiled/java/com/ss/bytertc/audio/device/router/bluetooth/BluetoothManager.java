package com.ss.bytertc.audio.device.router.bluetooth;

import X.C08FF;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.RunnableC2217741Br2;
import X.RunnableC2217751Br3;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.router.device.AudioManagerWrapper;

/* JADX INFO: loaded from: classes35.dex */
public class BluetoothManager {
    public volatile boolean mBluetoothA2dpConnected;
    public AudioDeviceCallback mBluetoothDeviceCallback;
    public volatile boolean mBluetoothHeadsetConnected;
    public int mBluetoothScoRestartTimes;
    public BluetoothDeviceCallback mCallback;
    public Handler mHandler;
    public boolean mInitialized;
    public boolean mScoHasStarted;
    public AudioManagerWrapper mWrapper;
    public ScoState mScoState = ScoState.DISCONNECTED;
    public int mBluetoothScoConnectCheckTimes = -1;

    /* JADX WARN: Removed duplicated region for block: B:8:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean hasBluetoothConnection() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mBluetoothHeadsetConnected     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto La
            boolean r0 = r1.mBluetoothA2dpConnected     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto La
            goto Lc
        La:
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.audio.device.router.bluetooth.BluetoothManager.hasBluetoothConnection():boolean");
    }

    public static /* synthetic */ void lambda$semisugar$bluetoothScoConnectionCheck$0(BluetoothManager bluetoothManager) {
        C1C7U.LIZ("BluetoothManager@b04.bluetoothScoConnectionCheck$3L");
        bluetoothManager.bluetoothScoConnectionCheck();
        C1C7U.LIZIZ("BluetoothManager@b04.bluetoothScoConnectionCheck$3L");
    }

    public static /* synthetic */ void lambda$semisugar$restartBluetoothScoAsyncTask$0(BluetoothManager bluetoothManager) {
        C1C7U.LIZ("BluetoothManager@b04.stopBluetoothSco$2L");
        bluetoothManager.restartBluetoothScoAsyncTask();
        C1C7U.LIZIZ("BluetoothManager@b04.stopBluetoothSco$2L");
    }

    private synchronized void resetBluetoothConnections() {
        this.mBluetoothHeadsetConnected = false;
        this.mBluetoothA2dpConnected = false;
    }

    private void bluetoothScoConnectionCheck() {
        if (this.mCallback == null) {
            return;
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "bluetoothScoConnectionCheck failed. AudioManagerWrapper is null.");
            return;
        }
        if (this.mBluetoothScoConnectCheckTimes >= 3 || !hasBluetoothConnection()) {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManagerWrapperEnsureAudioManagerWrapper);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bluetoothScoConnectionCheck stop, time: ");
            sbLIZ.append(this.mBluetoothScoConnectCheckTimes);
            sbLIZ.append(", hasBluetoothConnection: ");
            sbLIZ.append(hasBluetoothConnection());
            Logging.e("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ));
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mScoState = ScoState.FAILED;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacks(new RunnableC2217741Br2(this));
            }
            this.mCallback.onBluetoothScoStateChanged(false);
            return;
        }
        if (audioManagerWrapperEnsureAudioManagerWrapper.isBluetoothScoOn(false)) {
            Logging.i("BluetoothManager", "bluetoothScoConnectionCheck success.");
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mScoState = ScoState.CONNECTED;
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.removeCallbacks(new RunnableC2217741Br2(this));
            }
            BluetoothDeviceCallback bluetoothDeviceCallback = this.mCallback;
            if (bluetoothDeviceCallback != null) {
                bluetoothDeviceCallback.onBluetoothScoStateChanged(true);
                return;
            }
            return;
        }
        this.mBluetoothScoConnectCheckTimes++;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bluetoothScoConnectionCheck failed. retry again, time: ");
        sbLIZ2.append(this.mBluetoothScoConnectCheckTimes);
        Logging.i("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ2));
        startSystemBluetoothSco(audioManagerWrapperEnsureAudioManagerWrapper);
        Handler handler3 = this.mHandler;
        if (handler3 != null) {
            C786410Ut5.LJLIIL(3000L, handler3, new RunnableC2217741Br2(this));
        }
    }

    private AudioManagerWrapper ensureAudioManagerWrapper() {
        if (this.mWrapper == null) {
            synchronized (this) {
                try {
                    if (this.mWrapper == null) {
                        Context applicationContext = ContextUtils.getApplicationContext();
                        if (applicationContext == null) {
                            return null;
                        }
                        this.mWrapper = AudioManagerWrapper.create(applicationContext);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mWrapper;
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        initBluetooth();
        registerBluetoothCallback();
    }

    private void initHandler() {
        this.mHandler = new BPEAHandler(Looper.getMainLooper());
        Logging.i("BluetoothManager", "initHandler success");
    }

    private boolean isScoStarting() {
        return this.mScoState == ScoState.CONNECTING || this.mBluetoothScoConnectCheckTimes >= 0;
    }

    private void registerBluetoothCallback() {
        if (this.mBluetoothDeviceCallback != null) {
            return;
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "registerBluetoothCallback failed: AudioManagerWrapper is null");
            return;
        }
        BluetoothConnectCallback bluetoothConnectCallback = new BluetoothConnectCallback();
        this.mBluetoothDeviceCallback = bluetoothConnectCallback;
        audioManagerWrapperEnsureAudioManagerWrapper.registerAudioDeviceCallback(bluetoothConnectCallback, null);
        Logging.i("BluetoothManager", "AudioDeviceCallback registered for bluetooth monitoring");
    }

    private void restartBluetoothScoAsyncTask() {
        Logging.w("BluetoothManager", "restartBluetoothScoAsyncTask enter.");
        if (!hasBluetoothConnection()) {
            Logging.w("BluetoothManager", "restartBluetoothScoAsyncTask skip, no bluetooth device now.");
            return;
        }
        if (isScoStarting()) {
            Logging.w("BluetoothManager", "restartBluetoothScoAsyncTask skip. sco is starting.");
            return;
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "restartBluetoothScoAsyncTask failed. AudioManagerWrapper is null.");
        } else {
            startSystemBluetoothSco(audioManagerWrapperEnsureAudioManagerWrapper);
            Logging.w("BluetoothManager", "restartBluetoothScoAsyncTask has start bluetooth.");
        }
    }

    private void unregisterBluetoothCallback() {
        if (this.mBluetoothDeviceCallback == null) {
            return;
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper != null) {
            audioManagerWrapperEnsureAudioManagerWrapper.unregisterAudioDeviceCallback(this.mBluetoothDeviceCallback);
            Logging.i("BluetoothManager", "AudioDeviceCallback unregistered");
        }
        this.mBluetoothDeviceCallback = null;
    }

    public void restartBluetoothSco() {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 32) {
            Logging.w("BluetoothManager", "restartBluetoothSco ignored, since android 13 will start bluetooth sco itself after sco disconnected.");
            return;
        }
        Logging.w("BluetoothManager", "restartBluetoothSco enter.");
        if (!hasBluetoothConnection()) {
            Logging.w("BluetoothManager", "restartBluetoothSco skip, no bluetooth device now.");
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.removeCallbacks(new RunnableC2217751Br3(this));
                return;
            }
            return;
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "restartBluetoothSco failed. AudioManagerWrapper is null.");
            return;
        }
        if (isScoStarting()) {
            Logging.w("BluetoothManager", "restartBluetoothSco skip. sco is starting.");
            return;
        }
        int i = this.mBluetoothScoRestartTimes + 1;
        this.mBluetoothScoRestartTimes = i;
        if (i <= 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("restartBluetoothScoAsyncTask, restart time: ");
            sbLIZ.append(this.mBluetoothScoRestartTimes);
            Logging.w("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ));
            if (!audioManagerWrapperEnsureAudioManagerWrapper.isBluetoothScoOn(false) && (handler = this.mHandler) != null) {
                C786410Ut5.LJLIIL(3000L, handler, new RunnableC2217751Br3(this));
            }
        } else {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManagerWrapperEnsureAudioManagerWrapper);
            }
            this.mScoState = ScoState.FAILED;
            BluetoothDeviceCallback bluetoothDeviceCallback = this.mCallback;
            if (bluetoothDeviceCallback != null) {
                bluetoothDeviceCallback.onBluetoothScoStateChanged(false);
            }
        }
        Logging.w("BluetoothManager", "restartBluetoothSco leave.");
    }

    private void initBluetooth() {
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "initBluetooth failed. AudioManager is null.");
            return;
        }
        Logging.i("BluetoothManager", "initBluetooth() with no bluetooth-connect permission.");
        AudioDeviceInfo[] devices = audioManagerWrapperEnsureAudioManagerWrapper.getDevices(2);
        if (devices == null) {
            Logging.e("BluetoothManager", "initBluetooth: getDevices returned null.");
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (!audioDeviceInfo.isSource()) {
                if (7 == audioDeviceInfo.getType()) {
                    z = true;
                } else if (8 == audioDeviceInfo.getType()) {
                    z2 = true;
                }
            }
        }
        if (z) {
            setBluetoothConnection(1, true);
            notifyDeviceStateChange(1, true, "bluetooth-headset");
        }
        if (z2) {
            setBluetoothConnection(2, true);
            notifyDeviceStateChange(2, true, "bluetooth-a2dp");
        }
    }

    public void release() {
        stopBluetoothSco();
        unregisterBluetoothCallback();
        if (hasBluetoothConnection()) {
            Logging.i("BluetoothManager", "release: clearing bluetooth device");
            setBluetoothConnection(1, false);
            setBluetoothConnection(2, false);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        this.mCallback = null;
        this.mInitialized = false;
        resetBluetoothConnections();
    }

    public void startBluetoothSco() {
        if (!hasBluetoothConnection()) {
            Logging.w("BluetoothManager", "startBluetoothSco failed: no bluetooth device connected");
            return;
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "startBluetoothSco failed. AudioManagerWrapper is null.");
            return;
        }
        if (isScoStarting() || audioManagerWrapperEnsureAudioManagerWrapper.isBluetoothScoOn(false)) {
            Logging.w("BluetoothManager", "startBluetoothSco skip: SCO already starting or connected");
            return;
        }
        Logging.i("BluetoothManager", "Starting bluetooth SCO");
        this.mScoState = ScoState.CONNECTING;
        this.mBluetoothScoConnectCheckTimes = 0;
        this.mBluetoothScoRestartTimes = 0;
        startSystemBluetoothSco(audioManagerWrapperEnsureAudioManagerWrapper);
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJLIIL(3000L, handler, new RunnableC2217741Br2(this));
        }
    }

    public void stopBluetoothSco() {
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("BluetoothManager", "stopBluetoothSco failed. AudioManagerWrapper is null.");
            return;
        }
        Logging.i("BluetoothManager", "Stopping bluetooth SCO");
        this.mScoState = ScoState.DISCONNECTED;
        this.mBluetoothScoConnectCheckTimes = -1;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(new RunnableC2217741Br2(this));
            this.mHandler.removeCallbacks(new RunnableC2217751Br3(this));
        }
        if (audioManagerWrapperEnsureAudioManagerWrapper.isBluetoothScoOn(false) || this.mScoHasStarted) {
            stopSystemBluetoothSco(audioManagerWrapperEnsureAudioManagerWrapper);
        }
    }

    public class BluetoothConnectCallback extends AudioDeviceCallback {
        public BluetoothConnectCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("addedDevices: ");
                        sbLIZ.append(type);
                        Logging.i("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ));
                        BluetoothManager.this.setBluetoothConnection(1, true);
                        BluetoothManager bluetoothManager = BluetoothManager.this;
                        bluetoothManager.mBluetoothScoRestartTimes = 0;
                        bluetoothManager.notifyDeviceStateChange(1, true, "bluetooth-headset");
                    } else if (type == 8) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("addedDevices: ");
                        sbLIZ2.append(type);
                        Logging.i("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ2));
                        BluetoothManager.this.setBluetoothConnection(2, true);
                        BluetoothManager.this.notifyDeviceStateChange(2, true, "bluetooth-a2dp");
                    }
                }
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("removedDevices: ");
                        sbLIZ.append(type);
                        Logging.i("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ));
                        BluetoothManager.this.setBluetoothConnection(1, false);
                        BluetoothManager.this.notifyDeviceStateChange(1, false, "bluetooth-headset");
                        return;
                    }
                    if (type == 8) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("removedDevices: ");
                        sbLIZ2.append(type);
                        Logging.i("BluetoothManager", C2188811AlT.LIZIZ(sbLIZ2));
                        BluetoothManager.this.setBluetoothConnection(2, false);
                        BluetoothManager.this.notifyDeviceStateChange(2, false, "bluetooth-a2dp");
                        return;
                    }
                }
            }
        }
    }

    public enum ScoState {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        FAILED;

        public static ScoState valueOf(String str) {
            return (ScoState) C08FF.LIZ(ScoState.class, str);
        }
    }

    public BluetoothManager(BluetoothDeviceCallback bluetoothDeviceCallback) {
        this.mCallback = bluetoothDeviceCallback;
        initHandler();
        init();
    }

    private void startSystemBluetoothSco(AudioManagerWrapper audioManagerWrapper) {
        if (audioManagerWrapper != null) {
            if (audioManagerWrapper.startBluetoothSco()) {
                this.mScoHasStarted = true;
                return;
            }
            return;
        }
        Logging.e("BluetoothManager", "startSystemBluetoothSco skipped, audioManager is null");
    }

    private void stopSystemBluetoothSco(AudioManagerWrapper audioManagerWrapper) {
        if (audioManagerWrapper != null) {
            if (audioManagerWrapper.stopBluetoothSco() && audioManagerWrapper.setBluetoothScoOn(false)) {
                this.mScoHasStarted = false;
                return;
            }
            return;
        }
        Logging.e("BluetoothManager", "stopSystemBluetoothSco skipped, audioManager is null");
    }

    public synchronized void setBluetoothConnection(int i, boolean z) {
        if (i == 1) {
            this.mBluetoothHeadsetConnected = z;
        } else if (i == 2) {
            this.mBluetoothA2dpConnected = z;
        }
    }

    public void notifyDeviceStateChange(int i, boolean z, String str) {
        if (this.mCallback != null) {
            this.mCallback.onBluetoothDeviceChanged(new BluetoothDeviceInfo(i, z, str));
        }
    }
}
