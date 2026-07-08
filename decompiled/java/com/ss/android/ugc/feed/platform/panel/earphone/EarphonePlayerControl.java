package com.ss.android.ugc.feed.platform.panel.earphone;

import X.C01GW;
import X.C0BX3;
import X.C0C2A;
import X.C1857207Pe;
import X.C2180201AUg;
import X.C2188811AlT;
import X.C2217791Br7;
import X.C2217801Br8;
import X.C452501pT;
import X.C722880SXe;
import X.C722900SXg;
import X.C786410Ut5;
import X.InterfaceC2217831BrB;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class EarphonePlayerControl implements IEarphonePlayerControlService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C2180201AUg());
    public boolean LIZIZ = LJIIIIZZ();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 96));

    public final Object LJII() {
        return this.LIZJ.getValue();
    }

    public final boolean LJIIIIZZ() {
        AudioDeviceInfo[] devices;
        AudioManager audioManager = (AudioManager) this.LIZ.getValue();
        if (audioManager != null && (devices = audioManager.getDevices(2)) != null) {
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (((List) C1857207Pe.LIZ.getValue()).contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final boolean LIZIZ() {
        if (LJIIIIZZ()) {
            return !this.LIZIZ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final boolean LJ() {
        return C0BX3.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LIZ(Context context) throws Exception {
        BroadcastReceiver broadcastReceiver;
        AudioDeviceCallback audioDeviceCallback;
        C722880SXe.LIZ().LJIIIZ("registered earphone audio device callback/broadcast receiver");
        if (C0C2A.LIZ()) {
            AudioManager audioManager = (AudioManager) this.LIZ.getValue();
            if (audioManager != null) {
                Object objLJII = LJII();
                if (objLJII instanceof C2217791Br7) {
                    audioDeviceCallback = (AudioDeviceCallback) objLJII;
                } else {
                    audioDeviceCallback = null;
                }
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
                return;
            }
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        Object objLJII2 = LJII();
        if (objLJII2 instanceof C2217801Br8) {
            broadcastReceiver = (BroadcastReceiver) objLJII2;
        } else {
            broadcastReceiver = null;
        }
        C786410Ut5.LJIL(context, broadcastReceiver, intentFilter, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LIZLLL(boolean z) {
        this.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LJFF(Context context) {
        C722880SXe.LIZ().LJIIIZ("unregistered earphone audio device callback/broadcast receiver");
        BroadcastReceiver broadcastReceiver = null;
        AudioDeviceCallback audioDeviceCallback = null;
        if (C0C2A.LIZ()) {
            AudioManager audioManager = (AudioManager) this.LIZ.getValue();
            if (audioManager != null) {
                Object objLJII = LJII();
                if (objLJII instanceof C2217791Br7) {
                    audioDeviceCallback = (AudioDeviceCallback) objLJII;
                }
                audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
                return;
            }
            return;
        }
        Object objLJII2 = LJII();
        if (objLJII2 instanceof C2217801Br8) {
            broadcastReceiver = (BroadcastReceiver) objLJII2;
        }
        C786410Ut5.LJJIFFI(context, broadcastReceiver);
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LIZJ(String str, boolean z) {
        C2217801Br8 c2217801Br8;
        C2217791Br7 c2217791Br7;
        C722900SXg c722900SXgLIZ = C722880SXe.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio disconnected, scenario: ");
        sbLIZ.append(str);
        sbLIZ.append(", isPausedByDisconnection is updated to: ");
        sbLIZ.append(z);
        c722900SXgLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C0C2A.LIZ()) {
            Object objLJII = LJII();
            if ((objLJII instanceof C2217791Br7) && (c2217791Br7 = (C2217791Br7) objLJII) != null) {
                c2217791Br7.LIZ().put(str, Boolean.valueOf(z));
                return;
            }
            return;
        }
        Object objLJII2 = LJII();
        if (!(objLJII2 instanceof C2217801Br8) || (c2217801Br8 = (C2217801Br8) objLJII2) == null) {
            return;
        }
        c2217801Br8.LIZIZ().put(str, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LJI(LifecycleOwner lifecycleOwner, final InterfaceC2217831BrB interfaceC2217831BrB) {
        C2217801Br8 c2217801Br8;
        C2217791Br7 c2217791Br7;
        String scenario = interfaceC2217831BrB.getScenario();
        C722900SXg c722900SXgLIZ = C722880SXe.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scenario: ");
        sbLIZ.append(scenario);
        sbLIZ.append(", add earphone callback");
        c722900SXgLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C0C2A.LIZ()) {
            Object objLJII = LJII();
            if ((objLJII instanceof C2217791Br7) && (c2217791Br7 = (C2217791Br7) objLJII) != null) {
                ((Set) c2217791Br7.LIZIZ.getValue()).add(interfaceC2217831BrB);
                if (c2217791Br7.LIZ().get(interfaceC2217831BrB.getScenario()) == null) {
                    c2217791Br7.LIZ().put(interfaceC2217831BrB.getScenario(), Boolean.FALSE);
                }
            }
        } else {
            Object objLJII2 = LJII();
            if ((objLJII2 instanceof C2217801Br8) && (c2217801Br8 = (C2217801Br8) objLJII2) != null) {
                ((Set) c2217801Br8.LIZIZ.getValue()).add(interfaceC2217831BrB);
                if (c2217801Br8.LIZIZ().get(interfaceC2217831BrB.getScenario()) == null) {
                    c2217801Br8.LIZIZ().put(interfaceC2217831BrB.getScenario(), Boolean.FALSE);
                }
            }
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl$addCallback$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C2217801Br8 c2217801Br82;
                C2217791Br7 c2217791Br72;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    String scenario2 = interfaceC2217831BrB.getScenario();
                    C722900SXg c722900SXgLIZ2 = C722880SXe.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("scenario: ");
                    sbLIZ2.append(scenario2);
                    sbLIZ2.append(", automatically removed earphone callback on destroy");
                    c722900SXgLIZ2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (C0C2A.LIZ()) {
                        Object objLJII3 = this.LJII();
                        if ((objLJII3 instanceof C2217791Br7) && (c2217791Br72 = (C2217791Br7) objLJII3) != null) {
                            InterfaceC2217831BrB interfaceC2217831BrB2 = interfaceC2217831BrB;
                            ((Set) c2217791Br72.LIZIZ.getValue()).remove(interfaceC2217831BrB2);
                            c2217791Br72.LIZ().remove(interfaceC2217831BrB2.getScenario());
                            return;
                        }
                        return;
                    }
                    Object objLJII4 = this.LJII();
                    if (!(objLJII4 instanceof C2217801Br8) || (c2217801Br82 = (C2217801Br8) objLJII4) == null) {
                        return;
                    }
                    InterfaceC2217831BrB interfaceC2217831BrB3 = interfaceC2217831BrB;
                    ((Set) c2217801Br82.LIZIZ.getValue()).remove(interfaceC2217831BrB3);
                    c2217801Br82.LIZIZ().remove(interfaceC2217831BrB3.getScenario());
                }
            }
        });
    }
}
