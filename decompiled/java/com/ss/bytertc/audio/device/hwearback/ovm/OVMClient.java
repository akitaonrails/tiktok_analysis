package com.ss.bytertc.audio.device.hwearback.ovm;

import X.C1C7U;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.base.ManufacturerChecker;
import com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes35.dex */
public class OVMClient {
    public static volatile OVMClient sClient;
    public OVMAuthManager.AuthCallback mAuthCallback;
    public Context mContext;
    public boolean mIsSupport;
    public OVMKaraokeMediaHelper mMediaHelper;
    public boolean mNeedDestroyWhenRelease;
    public int mAuthResultCode = -2;
    public OperateStorage mStorage = new OperateStorage();
    public OVMAuthManager.AuthCallback mInitCallback = new OVMAuthManager.AuthCallback() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient.1
        @Override // com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager.AuthCallback
        public void onResult(int i) {
            OVMClient oVMClient = OVMClient.this;
            if (oVMClient.mAuthResultCode == -2) {
                oVMClient.mAuthResultCode = i;
                OVMAuthManager.AuthCallback authCallback = oVMClient.mAuthCallback;
                if (authCallback != null) {
                    authCallback.onResult(i);
                }
            }
        }
    };
    public boolean mIsHeadsetConnected = false;
    public OVMAuthManager.AuthCallback mRestartAuthCallback = new OVMAuthManager.AuthCallback() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient.2
        @Override // com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager.AuthCallback
        public void onResult(int i) {
            OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRestartListener result: ");
            sbLIZ.append(i);
            Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
            OVMAuthManager.getInstance().removeCallback(this);
            OVMClient oVMClient = OVMClient.this;
            oVMClient.postHandler.removeCallbacks(oVMClient.restoreParamsRunnable);
            OVMClient oVMClient2 = OVMClient.this;
            if (oVMClient2.mStorage.isKTVDeviceOpen && i == 1001 && (oVMKaraokeMediaHelperLockMediaHelper = oVMClient2.lockMediaHelper()) != null) {
                Logging.i("OVMClient", "openKTVDevice duration restart.");
                oVMKaraokeMediaHelperLockMediaHelper.openKTVDevice();
                OVMClient oVMClient3 = OVMClient.this;
                C786410Ut5.LJLIIL(200L, oVMClient3.postHandler, oVMClient3.restoreParamsRunnable);
            }
        }
    };
    public Handler postHandler = new BPEAHandler(Looper.getMainLooper());
    public Runnable restartRunnable = new Runnable() { // from class: X.1Br4
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    };
    public Runnable restoreParamsRunnable = new Runnable() { // from class: X.1Br5
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$1();
        }
    };
    public BroadcastReceiver headsetPlugReceiver = new BroadcastReceiver() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public static Bundle INVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }

        public static Object INVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        public void com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3__onReceive$___twin___(Context context, Intent intent) {
            boolean z;
            int i;
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                Logging.e("OVMClient", "action is null");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceive: ");
            sbLIZ.append(intent);
            Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
            Bundle bundleINVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
            if (bundleINVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
                for (String str : bundleINVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.keySet()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(": ");
                    sbLIZ2.append(INVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str));
                    Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                boolean z2 = true;
                if (intent.getIntExtra("state", -99) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                OVMClient oVMClient = OVMClient.this;
                if (oVMClient.mIsHeadsetConnected == z) {
                    z2 = false;
                }
                oVMClient.mIsHeadsetConnected = z;
                if (!z2) {
                    Logging.i("OVMClient", "headset plug not changed, ignore");
                    return;
                }
                if (z) {
                    Logging.i("OVMClient", "need restart media helper");
                    if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP) {
                        i = 2500;
                    } else {
                        i = 200;
                    }
                    OVMClient.this.restartKTVDevice(i);
                    return;
                }
                oVMClient.clearRestartRunner();
                OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = OVMClient.this.lockMediaHelper();
                if (oVMKaraokeMediaHelperLockMediaHelper == null || !OVMClient.this.mStorage.isKTVDeviceOpen) {
                    return;
                }
                Logging.i("OVMClient", "closeKTVDevice and feedback with unplug headset");
                oVMKaraokeMediaHelperLockMediaHelper.setPlayFeedbackParam(0);
                oVMKaraokeMediaHelperLockMediaHelper.closeKTVDevice();
            }
        }

        public static void com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass3 anonymousClass3, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                anonymousClass3.com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3__onReceive$___twin___(context, intent);
            } else {
                C2408409cA.LIZ();
                anonymousClass3.com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3__onReceive$___twin___(context, intent);
            }
        }

        public static void com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass3 anonymousClass3, Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            com_ss_bytertc_audio_device_hwearback_ovm_OVMClient$3_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass3, context, intent);
        }
    };

    public synchronized void closeKTVDevice() {
        Logging.i("OVMClient", "closeKTVDevice");
        this.mStorage.isKTVDeviceOpen = true;
        clearRestartRunner();
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.closeKTVDevice();
        }
    }

    public synchronized void openKTVDevice() {
        Logging.i("OVMClient", "openKTVDevice");
        this.mStorage.isKTVDeviceOpen = true;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.openKTVDevice();
        }
    }

    public synchronized void resetKTVParamsAndUpdate() {
        Logging.i("OVMClient", "resetKTVParamsAndUpdate");
        this.mStorage.reset();
        C786410Ut5.LJLIIL(200L, this.postHandler, this.restoreParamsRunnable);
    }

    /* JADX INFO: renamed from: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$audio$device$base$ManufacturerChecker$Type;

        static {
            int[] iArr = new int[ManufacturerChecker.Type.values().length];
            $SwitchMap$com$ss$bytertc$audio$device$base$ManufacturerChecker$Type = iArr;
            try {
                iArr[ManufacturerChecker.Type.OP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$audio$device$base$ManufacturerChecker$Type[ManufacturerChecker.Type.VO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static class OperateStorage {
        public int equalizerTypeParam;
        public boolean isKTVDeviceOpen;
        public int listenRecordSameParam;
        public int micVolumeParam;
        public int mixSoundTypeParam;
        public int playFeedbackParam;

        public void reset() {
            this.listenRecordSameParam = 0;
            this.playFeedbackParam = 0;
            this.micVolumeParam = 6;
            this.mixSoundTypeParam = 0;
            this.equalizerTypeParam = 0;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isKTVDeviceOpen: ");
            sbLIZ.append(this.isKTVDeviceOpen);
            sbLIZ.append(", recordSame: ");
            sbLIZ.append(this.listenRecordSameParam);
            sbLIZ.append(", playFeedback: ");
            sbLIZ.append(this.playFeedbackParam);
            sbLIZ.append(", micVolume: ");
            sbLIZ.append(this.micVolumeParam);
            sbLIZ.append(", mix: ");
            sbLIZ.append(this.mixSoundTypeParam);
            sbLIZ.append(", eq: ");
            sbLIZ.append(this.equalizerTypeParam);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public OperateStorage() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("OVMClient@b0ad.<init>$1L");
        Logging.i("OVMClient", "restart media helper");
        if (!isSupported() || !this.mStorage.isKTVDeviceOpen) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("restart with error, return: ");
            sbLIZ.append(isSupported());
            sbLIZ.append(", ");
            sbLIZ.append(this.mStorage.isKTVDeviceOpen);
            Logging.e("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("OVMClient@b0ad.<init>$1L");
            return;
        }
        int i = AnonymousClass4.$SwitchMap$com$ss$bytertc$audio$device$base$ManufacturerChecker$Type[ManufacturerChecker.getManufacturerType().ordinal()];
        if (i == 1) {
            initMediaHelper(this.mRestartAuthCallback);
        } else if (i == 2) {
            OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
            if (this.mStorage.isKTVDeviceOpen && oVMKaraokeMediaHelperLockMediaHelper != null) {
                Logging.i("OVMClient", "closeKTVDevice duration restart.");
                oVMKaraokeMediaHelperLockMediaHelper.openKTVDevice();
                restoreParams(oVMKaraokeMediaHelperLockMediaHelper);
            }
        }
        C1C7U.LIZIZ("OVMClient@b0ad.<init>$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        C1C7U.LIZ("OVMClient@b0ad.<init>$2L");
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null && this.mStorage.isKTVDeviceOpen) {
            Logging.i("OVMClient", "openKTVDevice duration restore params.");
            restoreParams(oVMKaraokeMediaHelperLockMediaHelper);
        }
        C1C7U.LIZIZ("OVMClient@b0ad.<init>$2L");
    }

    private void registerHeadsetPlugEvent() {
        if (this.mIsSupport && this.mContext != null && needRegisterHeadsetPlug()) {
            Logging.i("OVMClient", "registerHeadsetPlug");
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                this.mIsHeadsetConnected = C786410Ut5.LJIJJ(this.mContext, this.headsetPlugReceiver, intentFilter).getIntExtra("state", -99) == 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Logging.e("OVMClient", "registerReceiver error", th);
            }
        }
    }

    private void unRegisterHeadsetPlugEvent() {
        if (this.mContext == null || !needRegisterHeadsetPlug()) {
            return;
        }
        Logging.i("OVMClient", "unregisterHeadsetPlug");
        try {
            C786410Ut5.LJJIFFI(this.mContext, this.headsetPlugReceiver);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMClient", "unregisterReceiver error", th);
        }
    }

    public void clearRestartRunner() {
        this.postHandler.removeCallbacks(this.restartRunnable);
        this.postHandler.removeCallbacks(this.restoreParamsRunnable);
    }

    public boolean isSupportedAndAuth() {
        return this.mIsSupport && this.mAuthResultCode == 1001;
    }

    public OVMKaraokeMediaHelper lockMediaHelper() {
        if (this.mIsSupport) {
            return this.mMediaHelper;
        }
        return null;
    }

    public void release() {
        Logging.i("OVMClient", "release()");
        OVMAuthManager.getInstance().removeCallback(this.mInitCallback);
        OVMAuthManager.getInstance().removeCallback(this.mRestartAuthCallback);
        unRegisterHeadsetPlugEvent();
        clearRestartRunner();
        if (this.mNeedDestroyWhenRelease) {
            synchronized (OVMClient.class) {
                try {
                    Logging.i("OVMClient", "clear sClient");
                    if (sClient == this) {
                        sClient = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private boolean needRegisterHeadsetPlug() {
        ManufacturerChecker.Type manufacturerType = ManufacturerChecker.getManufacturerType();
        return manufacturerType == ManufacturerChecker.Type.OP || manufacturerType == ManufacturerChecker.Type.VO;
    }

    public String getKaraokeSupportParameters() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        return oVMKaraokeMediaHelperLockMediaHelper != null ? oVMKaraokeMediaHelperLockMediaHelper.getKaraokeSupportParameters() : "";
    }

    public int getListenRecordSame() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper == null) {
            return 0;
        }
        oVMKaraokeMediaHelperLockMediaHelper.getListenRecordSame();
        return 0;
    }

    public int getMicVolParam() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.getMicVolParam();
        }
        return 0;
    }

    public int getPlayFeedbackParam() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.getPlayFeedbackParam();
        }
        return 0;
    }

    public int getVersion() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.getVersion();
        }
        return -1;
    }

    public boolean isDeviceSupportKaraoke() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.isDeviceSupportKaraoke();
        }
        return false;
    }

    public boolean isSupported() {
        return this.mIsSupport;
    }

    public OVMClient(Context context) {
        this.mNeedDestroyWhenRelease = ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP;
        this.mContext = C786410Ut5.N3(context);
        initClient(context);
    }

    private void initClient(Context context) {
        boolean z;
        Logging.i("OVMClient", "initClient");
        boolean z2 = false;
        this.mIsSupport = false;
        OperateStorage operateStorage = this.mStorage;
        operateStorage.isKTVDeviceOpen = false;
        operateStorage.reset();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        initMediaHelper(this.mInitCallback);
        if (this.mMediaHelper != null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsSupport = z;
        if (z) {
            if (isDeviceSupportKaraoke() && isAppSupportKaraoke(context.getPackageName()) && getVersion() >= 10000) {
                z2 = true;
            }
            this.mIsSupport = z2;
        }
        registerHeadsetPlugEvent();
    }

    private void initMediaHelper(OVMAuthManager.AuthCallback authCallback) {
        try {
            OVMKaraokeMediaHelper oVMKaraokeMediaHelperCreate = OVMKaraokeMediaHelper.create(this.mContext);
            this.mMediaHelper = oVMKaraokeMediaHelperCreate;
            if (oVMKaraokeMediaHelperCreate != null) {
                OVMAuthManager.getInstance().addCallback(authCallback);
                OVMAuthManager.getInstance().startAuth(this.mContext, "MEDIA_CLIENT");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMClient", "init media helper error", th);
        }
    }

    public static OVMClient initialize(Context context) {
        if (sClient == null) {
            synchronized (OVMClient.class) {
                try {
                    Context contextN3 = C786410Ut5.N3(context);
                    if (sClient == null) {
                        sClient = new OVMClient(contextN3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sClient;
    }

    private void restoreParams(OVMKaraokeMediaHelper oVMKaraokeMediaHelper) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restore params: ");
        sbLIZ.append(this.mStorage.toString());
        Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
        oVMKaraokeMediaHelper.setPlayFeedbackParam(this.mStorage.playFeedbackParam);
        oVMKaraokeMediaHelper.setListenRecordSame(this.mStorage.listenRecordSameParam);
        oVMKaraokeMediaHelper.setMicVolParam(this.mStorage.micVolumeParam);
        oVMKaraokeMediaHelper.setEqualizerType(this.mStorage.equalizerTypeParam);
        oVMKaraokeMediaHelper.setMixerSoundType(this.mStorage.mixSoundTypeParam);
    }

    public boolean isAppSupportKaraoke(String str) {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.isAppSupportKaraoke(str);
        }
        return false;
    }

    public void restartKTVDevice(int i) {
        clearRestartRunner();
        C786410Ut5.LJLIIL(i, this.postHandler, this.restartRunnable);
    }

    public synchronized void setAuthCallback(OVMAuthManager.AuthCallback authCallback) {
        this.mAuthCallback = authCallback;
        int i = this.mAuthResultCode;
        if (i != -2 && authCallback != null) {
            authCallback.onResult(i);
        }
    }

    public void setEqualizerType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEqualizerType: ");
        sbLIZ.append(i);
        Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
        this.mStorage.equalizerTypeParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setEqualizerType(i);
        }
    }

    public void setListenRecordSame(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setListenRecordSame: ");
        sbLIZ.append(i);
        Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
        this.mStorage.listenRecordSameParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setListenRecordSame(i);
        }
    }

    public void setMicVolParam(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMicVolParam: ");
        sbLIZ.append(i);
        Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
        this.mStorage.micVolumeParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setMicVolParam(i);
        }
    }

    public void setMixerSoundType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMixerSoundType: ");
        sbLIZ.append(i);
        Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
        this.mStorage.mixSoundTypeParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setMixerSoundType(i);
        }
    }

    public void setPlayFeedbackParam(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayFeedbackParam: ");
        sbLIZ.append(i);
        Logging.i("OVMClient", C2188811AlT.LIZIZ(sbLIZ));
        this.mStorage.playFeedbackParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setPlayFeedbackParam(i);
        }
    }
}
