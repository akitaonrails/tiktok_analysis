package com.ss.android.ugc.aweme.mediaplayer;

import X.C1452200ntS;
import X.C15O7;
import X.C19764212Um;
import X.C19764312Un;
import X.C19774412Yk;
import X.C19774512Yl;
import X.ExecutorC2206508kh;
import X.InterfaceC19764112Ul;
import Y.ACallableS432S0100000_29;
import Y.AObserverS231S0100000_29;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes30.dex */
public class MediaPlayerModule implements TextureView.SurfaceTextureListener, GenericLifecycleObserver {
    public String LL;
    public final InterfaceC19764112Ul LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final C19764212Um LLILZLL;
    public TextureView.SurfaceTextureListener LLIZ;
    public final MutableLiveData<C19764312Un> LLIZLLLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        this.LLILLJJLI.pause();
        this.LLIZLLLIL.postValue(new C19764312Un(3, true));
    }

    public final void LIZIZ() {
        if (this.LLILLL || this.LLILZ) {
            return;
        }
        this.LLILLJJLI.resume();
        this.LLIZLLLIL.postValue(new C19764312Un(4, true));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LLILLJJLI.pause();
        this.LLILLJJLI.stop();
        this.LLILLJJLI.release();
        this.LLIZLLLIL.postValue(new C19764312Un(6, true));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        LIZIZ();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.LLILLJJLI.stop();
        this.LLIZLLLIL.postValue(new C19764312Un(5, true));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLIZ;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLIZ;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public MediaPlayerModule(C1452200ntS c1452200ntS, C19764212Um c19764212Um) {
        MutableLiveData<C19764312Un> mutableLiveData = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData;
        this.LLILLJJLI = c1452200ntS;
        this.LLILZLL = c19764212Um;
        mutableLiveData.observeForever(new AObserverS231S0100000_29(this, 125));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLIZ;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        C15O7 c15o7LIZJ = C15O7.LIZJ(new ACallableS432S0100000_29(this, 5));
        C19774512Yl c19774512Yl = new C19774512Yl(this, 13);
        ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
        c15o7LIZJ.LJ(c19774512Yl, executorC2206508kh, null).LIZLLL(new C19774412Yk(this, surfaceTexture, 5)).LJ(new C19774512Yl(this, 14), executorC2206508kh, null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLIZ;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
