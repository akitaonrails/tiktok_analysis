package com.ss.bytertc.audio.device.router.device;

import X.C08FF;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.router.device.AudioModeHelper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes21.dex */
public enum AudioModeHelper {
    INSTANCE;

    public Context appContext;
    public AudioManager audioManager;
    public boolean isAudioModeSetInvalid;
    public boolean isModeChangeListenerRegistered;
    public int curAudioMode = -2;
    public Handler mainHandler = new BPEAHandler(Looper.getMainLooper());

    public static /* synthetic */ boolean lambda$semisugar$post$0(Handler handler, Runnable runnable) {
        C1C7U.LIZ("AudioModeHelper@5109.init$1L");
        return C786410Ut5.LJJZZIII(handler, runnable);
    }

    public int getAudioMode() {
        int i;
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 31 && (i = this.curAudioMode) != -2) {
            return i;
        }
        try {
            Logging.i("AudioModeHelper", "call audioManager.getMode()");
            int mode = audioManager.getMode();
            if (this.isModeChangeListenerRegistered) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update cache audio mode: ");
                sbLIZ.append(this.curAudioMode);
                Logging.i("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ));
                this.curAudioMode = mode;
            }
            return mode;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getAudioMode with error: ");
            sbLIZ2.append(e.toString());
            Logging.e("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return -2;
        }
    }

    public static AudioModeHelper valueOf(String str) {
        return (AudioModeHelper) C08FF.LIZ(AudioModeHelper.class, str);
    }

    public synchronized void init(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init with: ");
        sbLIZ.append(context);
        Logging.i("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (context != null && this.appContext == null) {
            if (!(context instanceof Application)) {
                context = C786410Ut5.N3(context);
            }
            this.appContext = context;
            try {
                this.audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
                if (Build.VERSION.SDK_INT >= 31) {
                    AudioManager.OnModeChangedListener onModeChangedListener = new AudioManager.OnModeChangedListener() { // from class: com.ss.bytertc.audio.device.router.device.AudioModeHelper.1
                        @Override // android.media.AudioManager.OnModeChangedListener
                        public void onModeChanged(int i) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("on Audio Mode Update: ");
                            sbLIZ2.append(i);
                            Logging.i("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            AudioModeHelper.this.curAudioMode = i;
                        }
                    };
                    Logging.i("AudioModeHelper", "register Mode Change Listener");
                    AudioManager audioManager = this.audioManager;
                    final Handler handler = this.mainHandler;
                    Objects.requireNonNull(handler);
                    audioManager.addOnModeChangedListener(new Executor() { // from class: X.0jfO
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            AudioModeHelper.lambda$semisugar$post$0(handler, runnable);
                        }
                    }, onModeChangedListener);
                    this.isModeChangeListenerRegistered = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("init AudioModeHelper with error:");
                sbLIZ2.append(e.toString());
                Logging.e("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ignore init: ");
        sbLIZ3.append(this.appContext);
        Logging.i("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public int setMode(int i) {
        boolean z;
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            Logging.e("AudioModeHelper", "setMode with null audioManager");
            return -1;
        }
        try {
            if (i == getAudioMode() && !this.isAudioModeSetInvalid) {
                return 0;
            }
            audioManager.setMode(i);
            int mode = audioManager.getMode();
            if (i != mode) {
                z = true;
            } else {
                z = false;
            }
            this.isAudioModeSetInvalid = z;
            this.curAudioMode = mode;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("call audioManager.setMode: ");
            sbLIZ.append(i);
            sbLIZ.append(", newMode: ");
            sbLIZ.append(mode);
            Logging.i("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setMode with error:");
            sbLIZ2.append(e.toString());
            Logging.e("AudioModeHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
    }

    AudioModeHelper() {
    }
}
