package com.ss.android.ugc.aweme.comment.audio.util;

import X.C1344030l4z;
import X.C356901a3;
import X.C786410Ut5;
import X.C787400Uug;
import X.InterfaceC787410Uuh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.audio.util.CommentAudioVolumeListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CommentAudioVolumeListener implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final Context LL;
    public final AudioManager LLILLJJLI;
    public C787400Uug LLILLL;
    public InterfaceC787410Uuh LLILZ;
    public int LLILZIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZIZ() {
        C787400Uug c787400Uug = this.LLILLL;
        if (c787400Uug != null) {
            try {
                C786410Ut5.LJJIFFI(this.LL, c787400Uug);
                ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1344030l4z.LIZIZ("CommentAudioVolumeListener", "unregister: failed", e);
            }
            this.LLILLL = null;
        }
        this.LLILZ = null;
    }

    public CommentAudioVolumeListener(Context context) {
        AudioManager audioManager;
        Context contextN3 = C786410Ut5.N3(context);
        this.LL = contextN3;
        Object objH2 = C786410Ut5.H2(contextN3, "audio");
        if (objH2 instanceof AudioManager) {
            audioManager = (AudioManager) objH2;
        } else {
            audioManager = null;
        }
        this.LLILLJJLI = audioManager;
        this.LLILZIL = -1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        LIZIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Uug] */
    public static void LIZ(final CommentAudioVolumeListener commentAudioVolumeListener, InterfaceC787410Uuh interfaceC787410Uuh) {
        int streamVolume;
        commentAudioVolumeListener.LLILZ = interfaceC787410Uuh;
        if (commentAudioVolumeListener.LLILLL == null) {
            commentAudioVolumeListener.LLILLL = new BroadcastReceiver(commentAudioVolumeListener) { // from class: X.0Uug
                public final WeakReference<CommentAudioVolumeListener> LIZ;

                {
                    this.LIZ = new WeakReference<>(commentAudioVolumeListener);
                }

                public final void LIZ(Intent intent) {
                    String action;
                    CommentAudioVolumeListener commentAudioVolumeListener2;
                    AudioManager audioManager;
                    boolean z;
                    if (intent != null) {
                        action = intent.getAction();
                    } else {
                        action = null;
                    }
                    if (Intrinsics.LJFF("android.media.VOLUME_CHANGED_ACTION", action) && (commentAudioVolumeListener2 = this.LIZ.get()) != null && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (audioManager = commentAudioVolumeListener2.LLILLJJLI) != null) {
                        int streamVolume2 = audioManager.getStreamVolume(3);
                        int i = commentAudioVolumeListener2.LLILZIL;
                        if (i != -1 && streamVolume2 != i) {
                            if (streamVolume2 > i) {
                                z = true;
                            } else {
                                z = false;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onVolumeChanged: currentVolume=");
                            sbLIZ.append(streamVolume2);
                            sbLIZ.append(", lastVolume=");
                            sbLIZ.append(commentAudioVolumeListener2.LLILZIL);
                            sbLIZ.append(", isTurnUp=");
                            sbLIZ.append(z);
                            C2188811AlT.LIZIZ(sbLIZ);
                            InterfaceC787410Uuh interfaceC787410Uuh2 = commentAudioVolumeListener2.LLILZ;
                            if (interfaceC787410Uuh2 != null) {
                                interfaceC787410Uuh2.LIZ(streamVolume2, z);
                            }
                        }
                        commentAudioVolumeListener2.LLILZIL = streamVolume2;
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(intent);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            try {
                C786410Ut5.LJIL(commentAudioVolumeListener.LL, commentAudioVolumeListener.LLILLL, intentFilter, null, null);
                C787400Uug c787400Uug = commentAudioVolumeListener.LLILLL;
                if (c787400Uug != null) {
                    LocalBroadcastManager.LIZ(commentAudioVolumeListener.LL).LIZIZ(c787400Uug, intentFilter);
                }
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(commentAudioVolumeListener);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1344030l4z.LIZIZ("CommentAudioVolumeListener", "register: failed", e);
            }
            AudioManager audioManager = commentAudioVolumeListener.LLILLJJLI;
            if (audioManager != null) {
                streamVolume = audioManager.getStreamVolume(3);
            } else {
                streamVolume = -1;
            }
            commentAudioVolumeListener.LLILZIL = streamVolume;
        }
    }
}
