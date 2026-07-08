package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum AVSyncState {
    AV_SYNC_STATE_STREAM_SYNC_BEGIN(0),
    AV_SYNC_STATE_AUDIO_STREAM_REMOVE(1),
    AV_SYNC_STATE_VIDEO_STREAM_REMOVE(2),
    AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AVSyncState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AVSyncState;

        static {
            int[] iArr = new int[AVSyncState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AVSyncState = iArr;
            try {
                iArr[AVSyncState.AV_SYNC_STATE_STREAM_SYNC_BEGIN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_AUDIO_STREAM_REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_VIDEO_STREAM_REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AVSyncState[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID" : "AV_SYNC_STATE_VIDEO_STREAM_REMOVE" : "AV_SYNC_STATE_AUDIO_STREAM_REMOVE" : "AV_SYNC_STATE_STREAM_SYNC_BEGIN";
    }

    public int value() {
        return this.value;
    }

    public static AVSyncState valueOf(String str) {
        return (AVSyncState) C08FF.LIZ(AVSyncState.class, str);
    }

    AVSyncState(int i) {
        this.value = i;
    }
}
