package com.ss.bytertc.audio.device.hwearback;

import X.C08FF;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.realx.base.Logging;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes34.dex */
public abstract class BaseEarback implements IHardWareEarback {
    public final Context context;
    public volatile EarbackState state = EarbackState.IDLE;
    public final WebRtcAudioEarBack webRtcAudioEarBack;

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int close() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close() with state: ");
        sbLIZ.append(this.state);
        Logging.i("BaseEarback", C2188811AlT.LIZIZ(sbLIZ));
        if (this.state != EarbackState.RUNNING) {
            return -2;
        }
        if (!onClose()) {
            return -1;
        }
        changeState(EarbackState.INITIALIZED);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int init() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init() with state: ");
        sbLIZ.append(this.state);
        Logging.i("BaseEarback", C2188811AlT.LIZIZ(sbLIZ));
        if (this.state.ordinal() >= EarbackState.INITIALIZED.ordinal()) {
            this.webRtcAudioEarBack.onHardwareEarbackSupported(isSupport());
        } else if (this.state == EarbackState.INITIALIZING) {
            return 0;
        }
        changeState(EarbackState.INITIALIZING);
        onInit();
        return 0;
    }

    public abstract boolean onClose();

    public abstract void onInit();

    public abstract boolean onIsSupportCall();

    public abstract boolean onOpen();

    public abstract void onRelease();

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int open() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open() with state: ");
        sbLIZ.append(this.state);
        Logging.i("BaseEarback", C2188811AlT.LIZIZ(sbLIZ));
        EarbackState earbackState = this.state;
        EarbackState earbackState2 = EarbackState.RUNNING;
        if (earbackState == earbackState2) {
            return 0;
        }
        if (this.state != EarbackState.INITIALIZED || !isSupport()) {
            return -2;
        }
        if (!onOpen()) {
            return -1;
        }
        changeState(earbackState2);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release() with state: ");
        sbLIZ.append(this.state);
        Logging.i("BaseEarback", C2188811AlT.LIZIZ(sbLIZ));
        EarbackState earbackState = this.state;
        EarbackState earbackState2 = EarbackState.IDLE;
        if (earbackState == earbackState2) {
            return 0;
        }
        onRelease();
        changeState(earbackState2);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        if (this.state.ordinal() < EarbackState.INITIALIZED.ordinal()) {
            return false;
        }
        return onIsSupportCall();
    }

    public EarbackState getState() {
        return this.state;
    }

    public enum EarbackState {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        RUNNING;

        public static EarbackState valueOf(String str) {
            return (EarbackState) C08FF.LIZ(EarbackState.class, str);
        }
    }

    private void changeState(EarbackState earbackState) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeState: ");
        sbLIZ.append(this.state);
        sbLIZ.append(" -> ");
        sbLIZ.append(earbackState);
        Logging.i("BaseEarback", C2188811AlT.LIZIZ(sbLIZ));
        EarbackState earbackState2 = this.state;
        this.state = earbackState;
        if (earbackState2 != earbackState) {
            onStateChanged(earbackState2, earbackState);
        }
    }

    public synchronized void onInitResult(boolean z) {
        EarbackState earbackState;
        boolean z2;
        if (this.state == EarbackState.INITIALIZING) {
            if (z) {
                earbackState = EarbackState.INITIALIZED;
            } else {
                earbackState = EarbackState.IDLE;
            }
            this.state = earbackState;
            WebRtcAudioEarBack webRtcAudioEarBack = this.webRtcAudioEarBack;
            if (z && isSupport()) {
                z2 = true;
            } else {
                z2 = false;
            }
            webRtcAudioEarBack.onHardwareEarbackSupported(z2);
        }
    }

    public BaseEarback(Context context, WebRtcAudioEarBack webRtcAudioEarBack) {
        this.context = context;
        this.webRtcAudioEarBack = webRtcAudioEarBack;
    }

    public synchronized void onStateChanged(EarbackState earbackState, EarbackState earbackState2) {
    }
}
