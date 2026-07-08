package com.ss.bytertc.audio.device.router;

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
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.router.bluetooth.BluetoothDeviceCallback;
import com.ss.bytertc.audio.device.router.bluetooth.BluetoothDeviceInfo;
import com.ss.bytertc.audio.device.router.bluetooth.BluetoothManager;
import com.ss.bytertc.audio.device.router.device.AudioManagerWrapper;
import com.ss.bytertc.audio.device.router.device.AudioModeHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes35.dex */
public class AudioRouteDeviceManager extends BroadcastReceiver implements BluetoothDeviceCallback {
    public volatile BluetoothDeviceInfo mBluetoothA2dpInfo;
    public volatile BluetoothDeviceInfo mBluetoothHeadsetInfo;
    public IAudioRouteCallback mCallback;
    public boolean mEnableAutoTest;
    public volatile boolean mEnableUsbAudioRouteOptimization;
    public int mInitDeviceState;
    public IntentFilter mIntentFilter;
    public volatile String mLastHeadsetPlugAddress;
    public volatile String mLastHeadsetPlugPortName;
    public volatile UsbDevice mUsbHeadsetDevice;
    public String mWiredHeadsetDevice;
    public AudioManagerWrapper mWrapper;
    public volatile boolean registered;
    public int currentRouting = -1;
    public BluetoothManager mBluetoothManager = new BluetoothManager(this);

    private synchronized BluetoothDeviceInfo getBluetoothA2dpInfo() {
        return this.mBluetoothA2dpInfo;
    }

    private synchronized BluetoothDeviceInfo getBluetoothHeadsetInfo() {
        return this.mBluetoothHeadsetInfo;
    }

    private synchronized UsbDevice getUsbHeadsetDevice() {
        return this.mUsbHeadsetDevice;
    }

    private String routingDeviceType2Text(int i) {
        return i != -1 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 64 ? i != 1 ? i != 2 ? "device-NA" : "device-speaker" : "device-earpiece" : "device-bt-sco" : "device-usb-headset" : "device-bt-a2dp" : "device-bt-headset" : "device-wired-headset" : "device-unknown";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public int release() {
        int i;
        this.mCallback = null;
        BluetoothManager bluetoothManager = this.mBluetoothManager;
        if (bluetoothManager != null) {
            bluetoothManager.release();
            this.mBluetoothManager = null;
        }
        if (unregisterReceiver() != 0) {
            Logging.e("AudioRouteDeviceManager", "unregisterReceiver failed.");
            i = -1;
        } else {
            i = 0;
        }
        this.mIntentFilter = null;
        this.mInitDeviceState = 0;
        setUsbHeadsetDevice(null);
        this.mWiredHeadsetDevice = null;
        this.mLastHeadsetPlugPortName = null;
        this.mLastHeadsetPlugAddress = null;
        this.currentRouting = -1;
        setBluetoothHeadsetInfo(null);
        setBluetoothA2dpInfo(null);
        return i;
    }

    private boolean initUsbHeadset() {
        UsbManager usbManager;
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null || (usbManager = (UsbManager) C786410Ut5.H2(applicationContext, "usb")) == null) {
                return false;
            }
            HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
            Iterator<String> it2 = deviceList.keySet().iterator();
            while (it2.hasNext()) {
                UsbDevice usbDevice = deviceList.get(it2.next());
                if (hasAudioForUsbDevice(usbDevice)) {
                    setUsbHeadsetDevice(usbDevice);
                    Logging.e("AudioRouteDeviceManager", "initUsbHeadset finished.");
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("AudioRouteDeviceManager", "initUsbHeadset failed.", th);
        }
        return false;
    }

    private int unregisterReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        if (!this.registered) {
            return 0;
        }
        this.registered = false;
        try {
            C786410Ut5.LJJIFFI(applicationContext, this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("AudioRouteDeviceManager", "unregisterReceiver failed.", e);
        }
        if (this.mEnableAutoTest) {
            try {
                LocalBroadcastManager.LIZ(applicationContext).LIZLLL(this);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                Logging.e("AudioRouteDeviceManager", "LocalBroadcastManager.unregisterReceiver failed.", e2);
            }
        }
        clearAbortBroadcast();
        return 0;
    }

    public String getRenderDeviceName() {
        int i = this.currentRouting;
        if (i == 1) {
            return "earpiece";
        }
        if (i == 2) {
            return "built-in speaker";
        }
        if (i == 4) {
            String str = this.mWiredHeadsetDevice;
            return str != null ? str : "failed_wired-headset";
        }
        if (i == 8) {
            BluetoothDeviceInfo bluetoothHeadsetInfo = getBluetoothHeadsetInfo();
            return (bluetoothHeadsetInfo == null || !bluetoothHeadsetInfo.isConnected()) ? "bluetooth-headset-disconnected" : bluetoothHeadsetInfo.getDeviceName();
        }
        if (i == 16) {
            BluetoothDeviceInfo bluetoothA2dpInfo = getBluetoothA2dpInfo();
            return (bluetoothA2dpInfo == null || !bluetoothA2dpInfo.isConnected()) ? "bluetooth-a2dp-disconnected" : bluetoothA2dpInfo.getDeviceName();
        }
        if (i != 32) {
            return "failed_device_name";
        }
        UsbDevice usbHeadsetDevice = getUsbHeadsetDevice();
        return usbHeadsetDevice != null ? usbHeadsetDevice.getDeviceName() : "failed_usb-headset";
    }

    public void restartBluetoothSco() {
        BluetoothManager bluetoothManager = this.mBluetoothManager;
        if (bluetoothManager != null) {
            bluetoothManager.restartBluetoothSco();
        }
    }

    private AudioManagerWrapper ensureAudioManagerWrapper() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        if (this.mWrapper == null) {
            this.mWrapper = AudioManagerWrapper.create(applicationContext);
        }
        return this.mWrapper;
    }

    private String getAndroidOutputRouteInfo() {
        String productName;
        UsbDevice usbHeadsetDevice = getUsbHeadsetDevice();
        int vendorId = usbHeadsetDevice != null ? usbHeadsetDevice.getVendorId() : -1;
        int productId = usbHeadsetDevice != null ? usbHeadsetDevice.getProductId() : -1;
        if (usbHeadsetDevice != null) {
            try {
                productName = usbHeadsetDevice.getProductName();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                productName = "failed_get_product_name";
            }
        } else {
            productName = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{last_port_name:");
        sbLIZ.append(this.mLastHeadsetPlugPortName != null ? this.mLastHeadsetPlugPortName : "(null)");
        sbLIZ.append(", last_address:");
        sbLIZ.append(this.mLastHeadsetPlugAddress != null ? this.mLastHeadsetPlugAddress : "(null)");
        sbLIZ.append(", usb_product_name:");
        if (productName == null) {
            productName = "(null)";
        }
        sbLIZ.append(productName);
        sbLIZ.append(", vid:");
        sbLIZ.append(vendorId);
        sbLIZ.append(", pid:");
        sbLIZ.append(productId);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private boolean initHeadset() {
        Intent intentLJIJJ;
        Context applicationContext = ContextUtils.getApplicationContext();
        return (applicationContext == null || (intentLJIJJ = C786410Ut5.LJIJJ(applicationContext, this, new IntentFilter("android.intent.action.HEADSET_PLUG"))) == null || headsetPlugActionIsFromUsbHeadset(intentLJIJJ) || 1 != intentLJIJJ.getIntExtra("state", -99)) ? false : true;
    }

    private int registerReceiver() throws Exception {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        if (this.registered) {
            return 0;
        }
        this.registered = true;
        C786410Ut5.LJIJJ(applicationContext, this, this.mIntentFilter);
        if (this.mEnableAutoTest) {
            Logging.i("AudioRouteDeviceManager", "register local receiver");
            LocalBroadcastManager.LIZ(applicationContext).LIZIZ(this, new IntentFilter("demoUtils.SendMockAudioRouteChangeNotification"));
        }
        return 0;
    }

    public String getCaptureDeviceName() {
        return getRenderDeviceName();
    }

    public String getSessionInfo() {
        if (ContextUtils.getApplicationContext() == null) {
            return "Context is null";
        }
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            return "AudioManagerWrapper is null";
        }
        if (this.mCallback == null) {
            return "mCallback is null";
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{ Audio State: audio_mode:");
            sbLIZ.append(AudioRouteUtil.modeString(AudioModeHelper.INSTANCE.getAudioMode()));
            sbLIZ.append(", speakerphone:");
            sbLIZ.append(audioManagerWrapperEnsureAudioManagerWrapper.isSpeakerphoneOn(false));
            sbLIZ.append(", headset:");
            sbLIZ.append(audioManagerWrapperEnsureAudioManagerWrapper.isWiredHeadsetOn(false));
            sbLIZ.append(", bt_sco:");
            sbLIZ.append(audioManagerWrapperEnsureAudioManagerWrapper.isBluetoothScoOn(false));
            sbLIZ.append(", output_route:");
            sbLIZ.append(getAndroidOutputRouteInfo());
            sbLIZ.append(" }");
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getSessionInfo failed, exception: ");
            sbLIZ2.append(e.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            Logging.e("AudioRouteDeviceManager", strLIZIZ);
            return strLIZIZ;
        }
    }

    public int getDeviceState() {
        return this.mInitDeviceState;
    }

    public AudioRouteDeviceManager(IAudioRouteCallback iAudioRouteCallback) {
        this.mCallback = iAudioRouteCallback;
    }

    private boolean hasAudioForUsbDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i = 0; i < usbDevice.getConfigurationCount(); i++) {
            UsbConfiguration configuration = usbDevice.getConfiguration(i);
            if (configuration != null) {
                for (int i2 = 0; i2 < configuration.getInterfaceCount(); i2++) {
                    UsbInterface usbInterface = configuration.getInterface(i2);
                    if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean headsetPlugActionIsFromUsbHeadset(Intent intent) {
        String strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "address");
        String strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "portName");
        this.mLastHeadsetPlugPortName = strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2;
        this.mLastHeadsetPlugAddress = strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        int intExtra = intent.getIntExtra("state", -99);
        int intExtra2 = intent.getIntExtra("microphone", -99);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_HEADSET_PLUG info, address: ");
        sbLIZ.append(strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        sbLIZ.append(", portName: ");
        sbLIZ.append(strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
        sbLIZ.append(", connected: ");
        sbLIZ.append(intExtra);
        sbLIZ.append(", hasMic: ");
        sbLIZ.append(intExtra2);
        Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.mEnableUsbAudioRouteOptimization) {
            if (!"".equals(strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra) && !"".equals(strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2) && strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null && (strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.startsWith("USB") || strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.startsWith("usb"))) {
                Logging.e("AudioRouteDeviceManager", "received ACTION_HEADSET_PLUG, may be is a usb device");
                return true;
            }
        } else {
            if (strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null && strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.toLowerCase().contains("usb_audio")) {
                Logging.i("AudioRouteDeviceManager", "headsetPlugActionIsFromUsbHeadset result:false, portName contains usb_audio, treat as wired headset");
                return false;
            }
            if ((strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null && strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.contains("card=") && !strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.contains("card=0;")) || (strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null && (strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.startsWith("USB") || strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.startsWith("usb")))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("received ACTION_HEADSET_PLUG, may be is a usb device, address:");
                sbLIZ2.append(strINVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ2));
                return true;
            }
        }
        Logging.i("AudioRouteDeviceManager", "headsetPlugActionIsFromUsbHeadset result:false, treat as wired headset event");
        return false;
    }

    private synchronized void setBluetoothA2dpInfo(BluetoothDeviceInfo bluetoothDeviceInfo) {
        this.mBluetoothA2dpInfo = bluetoothDeviceInfo;
    }

    private synchronized void setBluetoothHeadsetInfo(BluetoothDeviceInfo bluetoothDeviceInfo) {
        this.mBluetoothHeadsetInfo = bluetoothDeviceInfo;
    }

    private synchronized void setUsbHeadsetDevice(UsbDevice usbDevice) {
        this.mUsbHeadsetDevice = usbDevice;
    }

    @Override // com.ss.bytertc.audio.device.router.bluetooth.BluetoothDeviceCallback
    public void onBluetoothDeviceChanged(BluetoothDeviceInfo bluetoothDeviceInfo) {
        int i;
        if (this.mCallback != null) {
            int profile = bluetoothDeviceInfo.getProfile();
            if (profile != 1) {
                if (profile != 2) {
                    return;
                }
                setBluetoothA2dpInfo(bluetoothDeviceInfo);
                i = 16;
            } else {
                setBluetoothHeadsetInfo(bluetoothDeviceInfo);
                i = 8;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBluetoothDeviceChanged: profile=");
            sbLIZ.append(bluetoothDeviceInfo.getProfile());
            sbLIZ.append(", connected=");
            sbLIZ.append(bluetoothDeviceInfo.isConnected());
            sbLIZ.append(", deviceName=");
            sbLIZ.append(bluetoothDeviceInfo.getDeviceName());
            Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ));
            this.mCallback.onDeviceEvent(i, bluetoothDeviceInfo.isConnected());
        }
    }

    @Override // com.ss.bytertc.audio.device.router.bluetooth.BluetoothDeviceCallback
    public void onBluetoothScoStateChanged(boolean z) {
        if (this.mCallback != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBluetoothScoStateChanged: connected=");
            sbLIZ.append(z);
            Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ));
            this.mCallback.onDeviceEvent(64, z);
        }
    }

    public static String INVOKEVIRTUAL_com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void com_ss_bytertc_audio_device_router_AudioRouteDeviceManager__onReceive$___twin___(Context context, Intent intent) {
        boolean z;
        boolean z2;
        String str;
        IAudioRouteCallback iAudioRouteCallback;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            Logging.e("AudioRouteDeviceManager", "action is null");
            return;
        }
        int intExtra = 32;
        boolean z3 = false;
        int intExtra2 = -1234;
        if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ACTION_USB_DEVICE_ATTACHED:");
            sbLIZ.append(usbDevice);
            Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ));
            if (hasAudioForUsbDevice(usbDevice)) {
                setUsbHeadsetDevice(usbDevice);
                z = true;
            } else {
                z = false;
            }
            z2 = true;
        } else if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
            UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ACTION_USB_DEVICE_DETACHED:");
            sbLIZ2.append(usbDevice2);
            Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ2));
            if (hasAudioForUsbDevice(usbDevice2)) {
                setUsbHeadsetDevice(null);
                z = true;
            } else {
                z = false;
            }
            z2 = false;
        } else {
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                if (headsetPlugActionIsFromUsbHeadset(intent)) {
                    return;
                }
                if (intent.getIntExtra("state", -99) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ACTION_HEADSET_PLUG:");
                if (z2) {
                    str = "connected";
                } else {
                    str = "disconnected";
                }
                sbLIZ3.append(str);
                Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ3));
                if (z2) {
                    this.mWiredHeadsetDevice = "wired-headset";
                } else {
                    this.mWiredHeadsetDevice = null;
                }
                intExtra = 4;
            } else if (action.equals("demoUtils.SendMockAudioRouteChangeNotification")) {
                intExtra = intent.getIntExtra("type", -99);
                if (intent.getIntExtra("state", -99) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                    intExtra = 64;
                    if (intExtra2 != 0) {
                        if (intExtra2 == 1) {
                            Logging.i("AudioRouteDeviceManager", "SCO_AUDIO_STATE_CONNECTED");
                            z = true;
                        }
                        z2 = z;
                    } else {
                        Logging.i("AudioRouteDeviceManager", "SCO_AUDIO_STATE_DISCONNECTED");
                        z2 = false;
                    }
                } else {
                    intExtra = -1;
                }
                z = false;
                z2 = z;
            }
            z = true;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("received action:");
        sbLIZ4.append(action);
        sbLIZ4.append(" state:");
        sbLIZ4.append(intExtra2);
        sbLIZ4.append(" needReport:");
        sbLIZ4.append(z);
        sbLIZ4.append(", mCallback:");
        if (this.mCallback != null) {
            z3 = true;
        }
        sbLIZ4.append(z3);
        sbLIZ4.append(", deviceType:");
        sbLIZ4.append(intExtra);
        sbLIZ4.append(", connectedStatus:");
        sbLIZ4.append(z2);
        Logging.i("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ4));
        if (z && (iAudioRouteCallback = this.mCallback) != null) {
            iAudioRouteCallback.onDeviceEvent(intExtra, z2);
        }
    }

    public int init(boolean z, boolean z2) {
        this.mEnableAutoTest = z;
        this.mEnableUsbAudioRouteOptimization = z2;
        IntentFilter intentFilter = new IntentFilter();
        this.mIntentFilter = intentFilter;
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        this.mIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        this.mIntentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        AudioModeHelper.INSTANCE.init(ContextUtils.getApplicationContext());
        if (initHeadset()) {
            this.mInitDeviceState += 4;
        }
        if (initUsbHeadset()) {
            this.mInitDeviceState += 32;
        }
        if (registerReceiver() != 0) {
            Logging.e("AudioRouteDeviceManager", ": register failed.");
            release();
            return -2;
        }
        return 0;
    }

    public int setAudioRoute(int i, boolean z) {
        int i2;
        AudioManagerWrapper audioManagerWrapperEnsureAudioManagerWrapper = ensureAudioManagerWrapper();
        if (audioManagerWrapperEnsureAudioManagerWrapper == null) {
            Logging.e("AudioRouteDeviceManager", "setAudioRoute failed. AudioManagerWrapper is null.");
            return -2;
        }
        if (this.mCallback == null) {
            Logging.e("AudioRouteDeviceManager", "setAudioRoute failed. mCallback is null.");
            return -6;
        }
        AudioModeHelper audioModeHelper = AudioModeHelper.INSTANCE;
        int audioMode = audioModeHelper.getAudioMode();
        if (z) {
            i2 = 0;
        } else {
            i2 = 3;
        }
        if (i2 != audioMode) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isMediaMode:");
            sbLIZ.append(z);
            sbLIZ.append(", cacheMode:");
            sbLIZ.append(i2);
            sbLIZ.append(", systemMode: ");
            sbLIZ.append(audioMode);
            sbLIZ.append(" not matched with system!!!");
            Logging.e("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ));
            audioModeHelper.setMode(i2);
            audioMode = audioModeHelper.getAudioMode();
        }
        boolean zIsSpeakerphoneOn = audioManagerWrapperEnsureAudioManagerWrapper.isSpeakerphoneOn(false);
        boolean zIsBluetoothScoOn = audioManagerWrapperEnsureAudioManagerWrapper.isBluetoothScoOn(false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setAudioRoute, deviceType: ");
        sbLIZ2.append(routingDeviceType2Text(i));
        sbLIZ2.append(", cacheMode:");
        sbLIZ2.append(i2);
        sbLIZ2.append(", systemMode: ");
        sbLIZ2.append(audioMode);
        sbLIZ2.append(", speakerPhoneOn: ");
        sbLIZ2.append(zIsSpeakerphoneOn);
        sbLIZ2.append(", bluetoothScoOn: ");
        sbLIZ2.append(zIsBluetoothScoOn);
        Logging.e("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (audioMode == 3) {
            if (i == 8) {
                BluetoothManager bluetoothManager = this.mBluetoothManager;
                if (bluetoothManager != null) {
                    bluetoothManager.startBluetoothSco();
                }
            } else {
                BluetoothManager bluetoothManager2 = this.mBluetoothManager;
                if (bluetoothManager2 != null) {
                    bluetoothManager2.stopBluetoothSco();
                }
                if (i == 2) {
                    if (!zIsSpeakerphoneOn) {
                        audioManagerWrapperEnsureAudioManagerWrapper.setSpeakerphoneOn(true);
                    }
                } else {
                    if (i != 1 && i != 4 && i != 32) {
                        if (i == 16) {
                            Logging.e("AudioRouteDeviceManager", "Error: setAudioRoute to a2dp in communication mode");
                            return -7;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("setAudioRoute failed. deviceType(");
                        sbLIZ3.append(routingDeviceType2Text(i));
                        sbLIZ3.append(") invalid.");
                        Logging.e("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ3));
                        return -3;
                    }
                    if (zIsSpeakerphoneOn) {
                        audioManagerWrapperEnsureAudioManagerWrapper.setSpeakerphoneOn(false);
                    }
                }
            }
            this.currentRouting = i;
            return 0;
        }
        if (audioMode == 0) {
            BluetoothManager bluetoothManager3 = this.mBluetoothManager;
            if (bluetoothManager3 != null) {
                bluetoothManager3.stopBluetoothSco();
            }
            if (i == 2) {
                if (!zIsSpeakerphoneOn) {
                    audioManagerWrapperEnsureAudioManagerWrapper.setSpeakerphoneOn(true);
                }
            } else if (i == 1 && zIsSpeakerphoneOn) {
                audioManagerWrapperEnsureAudioManagerWrapper.setSpeakerphoneOn(false);
                return 0;
            }
            return 0;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("mode(");
        sbLIZ4.append(audioMode);
        sbLIZ4.append(") is not support to setAudioRoute");
        Logging.e("AudioRouteDeviceManager", C2188811AlT.LIZIZ(sbLIZ4));
        return -4;
    }

    public static void com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AudioRouteDeviceManager audioRouteDeviceManager, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            audioRouteDeviceManager.com_ss_bytertc_audio_device_router_AudioRouteDeviceManager__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            audioRouteDeviceManager.com_ss_bytertc_audio_device_router_AudioRouteDeviceManager__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AudioRouteDeviceManager audioRouteDeviceManager, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_ss_bytertc_audio_device_router_AudioRouteDeviceManager_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(audioRouteDeviceManager, context, intent);
    }
}
