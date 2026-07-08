package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.player.audio;

import android.media.MediaPlayer;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class EcAudioPlayer implements GenericLifecycleObserver {
    public static final HashMap<LifecycleOwner, EcAudioPlayer> LLILZIL = new HashMap<>();
    public final LifecycleOwner LL;
    public final HashMap<String, MediaPlayer> LLILLJJLI = new HashMap<>();
    public final LinkedList<MediaPlayer> LLILLL = new LinkedList<>();
    public boolean LLILZ;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLILZ = true;
        Iterator<Map.Entry<String, MediaPlayer>> it2 = this.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getValue().pause();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLILZ = false;
        Iterator<Map.Entry<String, MediaPlayer>> it2 = this.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getValue().start();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    public final void LIZIZ() {
        Iterator<Map.Entry<String, MediaPlayer>> it2 = this.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getValue().release();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLILLJJLI.clear();
        Iterator<MediaPlayer> it3 = this.LLILLL.iterator();
        while (it3.hasNext()) {
            try {
                it3.next().release();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        this.LLILLL.clear();
        LLILZIL.remove(this.LL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZIZ();
    }

    public EcAudioPlayer(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void LIZJ(String str) {
        if (str != null && str.length() != 0) {
            if (this.LLILLJJLI.get(str) != null) {
                MediaPlayer mediaPlayer = this.LLILLJJLI.get(str);
                if (mediaPlayer != null) {
                    try {
                        mediaPlayer.stop();
                        this.LLILLL.addLast(mediaPlayer);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LLILLJJLI.remove(str);
                return;
            }
            return;
        }
        for (Map.Entry<String, MediaPlayer> entry : this.LLILLJJLI.entrySet()) {
            try {
                entry.getValue().stop();
                this.LLILLL.addLast(entry.getValue());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        this.LLILLJJLI.clear();
    }

    public final void LIZ(final String str, String str2, boolean z) throws IOException {
        MediaPlayer mediaPlayerPollFirst = this.LLILLJJLI.get(str);
        if (mediaPlayerPollFirst == null && (mediaPlayerPollFirst = this.LLILLL.pollFirst()) == null) {
            mediaPlayerPollFirst = new MediaPlayer();
            mediaPlayerPollFirst.setAudioStreamType(3);
        }
        this.LLILLJJLI.put(str, mediaPlayerPollFirst);
        try {
            mediaPlayerPollFirst.reset();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        mediaPlayerPollFirst.setDataSource(str2);
        mediaPlayerPollFirst.setLooping(z);
        mediaPlayerPollFirst.prepareAsync();
        mediaPlayerPollFirst.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.12Nu
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                if (!this.LL.LLILZ) {
                    mediaPlayer.start();
                }
            }
        });
        if (!z) {
            mediaPlayerPollFirst.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.12Nt
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    this.LL.LLILLJJLI.remove(str);
                    this.LL.LLILLL.addLast(mediaPlayer);
                }
            });
        }
    }
}
