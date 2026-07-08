package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum RemoteAudioStateChangeReason {
    REMOTE_AUDIO_STATE_CHANGE_REASON_INTERNAL(0),
    REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
    REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
    REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
    REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.RemoteAudioStateChangeReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason;

        static {
            int[] iArr = new int[RemoteAudioStateChangeReason.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason = iArr;
            try {
                iArr[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_CONGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_MUTED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_UNMUTED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_UNMUTED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_OFFLINE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[ordinal()]) {
            case 1:
                return "kRemoteAudioReasonInternal";
            case 2:
                return "kRemoteAudioReasonNetworkCongestion";
            case 3:
                return "kRemoteAudioReasonNetworkRecovery";
            case 4:
                return "kRemoteAudioReasonLocalMuted";
            case 5:
                return "kRemoteAudioReasonLocalUnmuted";
            case 6:
                return "kRemoteAudioReasonRemoteMuted";
            case 7:
                return "kRemoteAudioReasonRemoteUnmuted";
            case 8:
                return "kRemoteAudioReasonRemoteOffline";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static RemoteAudioStateChangeReason fromId(int i) {
        for (RemoteAudioStateChangeReason remoteAudioStateChangeReason : values()) {
            if (remoteAudioStateChangeReason.value() == i) {
                return remoteAudioStateChangeReason;
            }
        }
        return null;
    }

    public static RemoteAudioStateChangeReason valueOf(String str) {
        return (RemoteAudioStateChangeReason) C08FF.LIZ(RemoteAudioStateChangeReason.class, str);
    }

    RemoteAudioStateChangeReason(int i) {
        this.value = i;
    }
}
