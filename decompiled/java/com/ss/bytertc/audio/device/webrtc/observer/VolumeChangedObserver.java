package com.ss.bytertc.audio.device.webrtc.observer;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class VolumeChangedObserver {
    public VolumeBroadcastReceiver mVolumeBroadcastReceiver;
    public OnVolumeChangedListener onVolumeChangedListener;

    public interface OnVolumeChangedListener {
        void onVolumeChanged(int i, int i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void unregisterReceiver() {
        /*
            r3 = this;
            r2 = 0
            android.content.Context r1 = com.bytedance.realx.base.ContextUtils.getApplicationContext()     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L20
            com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver$VolumeBroadcastReceiver r0 = r3.mVolumeBroadcastReceiver     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L20
            if (r0 == 0) goto Le
            X.C786410Ut5.LJJIFFI(r1, r0)     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L20
            r3.mVolumeBroadcastReceiver = r2     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L20
        Le:
            com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver$OnVolumeChangedListener r0 = r3.onVolumeChangedListener
            if (r0 == 0) goto L1d
            goto L1b
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L20
            com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver$OnVolumeChangedListener r0 = r3.onVolumeChangedListener
            if (r0 == 0) goto L1d
        L1b:
            r3.onVolumeChangedListener = r2
        L1d:
            r3.mVolumeBroadcastReceiver = r2
            return
        L20:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver$OnVolumeChangedListener r0 = r3.onVolumeChangedListener
            if (r0 == 0) goto L2a
            r3.onVolumeChangedListener = r2
        L2a:
            r3.mVolumeBroadcastReceiver = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver.unregisterReceiver():void");
    }

    private void registerVolumeChangeAction() throws Exception {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        this.mVolumeBroadcastReceiver = new VolumeBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        C786410Ut5.LJIJJ(applicationContext, this.mVolumeBroadcastReceiver, intentFilter);
    }

    public void release() {
        unregisterReceiver();
        this.onVolumeChangedListener = null;
    }

    public class VolumeBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public VolumeBroadcastReceiver() {
        }

        public void com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
            VolumeChangedObserver volumeChangedObserver = VolumeChangedObserver.this;
            if (volumeChangedObserver.onVolumeChangedListener != null && "android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                try {
                    int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
                    if (intExtra == 3 || intExtra == 0 || intExtra == 6) {
                        volumeChangedObserver.onVolumeChangedListener.onVolumeChanged(intExtra, intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }

        public static void com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(VolumeBroadcastReceiver volumeBroadcastReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                volumeBroadcastReceiver.com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver__onReceive$___twin___(context, intent);
            } else {
                C2408409cA.LIZ();
                volumeBroadcastReceiver.com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(VolumeBroadcastReceiver volumeBroadcastReceiver, Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            com_ss_bytertc_audio_device_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(volumeBroadcastReceiver, context, intent);
        }
    }

    public VolumeChangedObserver(OnVolumeChangedListener onVolumeChangedListener) throws Exception {
        this.onVolumeChangedListener = onVolumeChangedListener;
        registerVolumeChangeAction();
    }
}
