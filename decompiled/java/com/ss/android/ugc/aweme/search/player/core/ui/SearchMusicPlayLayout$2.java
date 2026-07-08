package com.ss.android.ugc.aweme.search.player.core.ui;

import X.C356901a3;
import X.C646200PWg;
import X.C662160PyA;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicPlayLayout$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C662160PyA LL;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public SearchMusicPlayLayout$2(C662160PyA c662160PyA) {
        this.LL = c662160PyA;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        MusicPlayHelper playHelper;
        MusicPlayHelper playHelper2;
        C662160PyA c662160PyA = this.LL;
        Music music = c662160PyA.LLILZIL;
        if (music != null && (((playHelper = c662160PyA.getPlayHelper()) != null && playHelper.yQ2(music.getId())) || ((playHelper2 = c662160PyA.getPlayHelper()) != null && playHelper2.xQ2(music.getId())))) {
            C646200PWg.LJI(c662160PyA);
            MusicPlayHelper playHelper3 = c662160PyA.getPlayHelper();
            if (playHelper3 != null) {
                playHelper3.BQ2(null, false);
            }
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
    }
}
