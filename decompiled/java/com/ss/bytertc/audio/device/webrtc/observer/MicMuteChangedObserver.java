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
import android.media.AudioManager;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class MicMuteChangedObserver {
    public MicMuteBroadCastReceiver mMicMuteBroadCastReceiver;
    public OnMicMuteChangedListener mOnMicMuteChangedListener;

    public interface OnMicMuteChangedListener {
        void onMicMuteChanged(boolean z);
    }

    private void registerReceiver() throws Exception {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        MicMuteBroadCastReceiver micMuteBroadCastReceiver = new MicMuteBroadCastReceiver();
        this.mMicMuteBroadCastReceiver = micMuteBroadCastReceiver;
        C786410Ut5.LJIJJ(applicationContext, micMuteBroadCastReceiver, new IntentFilter("android.media.action.MICROPHONE_MUTE_CHANGED"));
    }

    private void unregisterReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        try {
            MicMuteBroadCastReceiver micMuteBroadCastReceiver = this.mMicMuteBroadCastReceiver;
            if (micMuteBroadCastReceiver != null) {
                C786410Ut5.LJJIFFI(applicationContext, micMuteBroadCastReceiver);
                this.mMicMuteBroadCastReceiver = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void release() {
        unregisterReceiver();
        this.mOnMicMuteChangedListener = null;
    }

    public final class MicMuteBroadCastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public MicMuteBroadCastReceiver() {
        }

        public void com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver__onReceive$___twin___(Context context, Intent intent) {
            OnMicMuteChangedListener onMicMuteChangedListener;
            MicMuteChangedObserver micMuteChangedObserver = MicMuteChangedObserver.this;
            if (context != null && intent != null && micMuteChangedObserver != null && intent.getAction() == "android.media.action.MICROPHONE_MUTE_CHANGED") {
                try {
                    AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
                    if (audioManager != null && (onMicMuteChangedListener = micMuteChangedObserver.mOnMicMuteChangedListener) != null) {
                        onMicMuteChangedListener.onMicMuteChanged(audioManager.isMicrophoneMute());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }

        public static void com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(MicMuteBroadCastReceiver micMuteBroadCastReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                micMuteBroadCastReceiver.com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver__onReceive$___twin___(context, intent);
            } else {
                C2408409cA.LIZ();
                micMuteBroadCastReceiver.com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(MicMuteBroadCastReceiver micMuteBroadCastReceiver, Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            com_ss_bytertc_audio_device_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(micMuteBroadCastReceiver, context, intent);
        }
    }

    public MicMuteChangedObserver(OnMicMuteChangedListener onMicMuteChangedListener) throws Exception {
        this.mOnMicMuteChangedListener = onMicMuteChangedListener;
        registerReceiver();
    }
}
