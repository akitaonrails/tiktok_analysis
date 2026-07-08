package com.ss.android.ugc.aweme.choosemusic.cutmusic;

import X.C15JE;
import X.C15JH;
import X.C19EG;
import X.C786410Ut5;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS42S0101000_31;
import android.media.MediaPlayer;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;

/* JADX INFO: loaded from: classes32.dex */
public class CutMusicRepeartPlayer implements GenericLifecycleObserver {
    public MediaPlayer LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public ARunnableS42S0101000_31 LLILZ;
    public C15JH LLILZLL;
    public C15JE LLIZLLLIL;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS131S0100000_31 LLIZ = new ARunnableS131S0100000_31(this, 50);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            resume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.LL.pause();
            }
            this.LL.stop();
            this.LL.release();
            this.LL = null;
        }
        this.LLILZIL.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LLILZIL.removeCallbacksAndMessages(null);
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.LL.pause();
        }
        this.LLILZIL.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            this.LL.start();
        }
        C786410Ut5.LJJZZIII(this.LLILZIL, this.LLIZ);
        C786410Ut5.LJJZZIII(this.LLILZIL, this.LLILZ);
    }

    public final void LIZ(int i) {
        this.LLILLJJLI = i;
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.LL.pause();
        }
        ARunnableS42S0101000_31 aRunnableS42S0101000_31 = this.LLILZ;
        if (aRunnableS42S0101000_31 != null) {
            this.LLILZIL.removeCallbacks(aRunnableS42S0101000_31);
        }
        this.LLILZ = new ARunnableS42S0101000_31(i, this, 8);
        this.LL.seekTo(i);
        C786410Ut5.LJLIIL(this.LLILLL, this.LLILZIL, this.LLILZ);
        this.LL.start();
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLIZ;
        if (aRunnableS131S0100000_31 != null) {
            this.LLILZIL.removeCallbacks(aRunnableS131S0100000_31);
        }
        C786410Ut5.LJJZZIII(this.LLILZIL, this.LLIZ);
    }

    public CutMusicRepeartPlayer(C19EG c19eg, String str, int i, Fragment fragment) {
        this.LLILLL = i;
        fragment.getLifecycle().addObserver(this);
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(c19eg, UriProtector.parse(str));
        this.LL = mediaPlayerCreate;
        if (mediaPlayerCreate != null) {
            mediaPlayerCreate.setAudioStreamType(3);
            this.LL.setDisplay(null);
            this.LL.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.15JI
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    CutMusicRepeartPlayer cutMusicRepeartPlayer = this.LL;
                    C15JH c15jh = cutMusicRepeartPlayer.LLILZLL;
                    if (c15jh != null) {
                        c15jh.LIZIZ++;
                    }
                    cutMusicRepeartPlayer.LIZ(cutMusicRepeartPlayer.LLILLJJLI);
                }
            });
        }
    }
}
