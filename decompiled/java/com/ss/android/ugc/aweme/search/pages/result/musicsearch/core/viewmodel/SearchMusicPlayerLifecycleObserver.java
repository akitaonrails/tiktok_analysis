package com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.viewmodel;

import X.C19574011i6;
import X.C19EG;
import X.C679340Qkm;
import X.C786410Ut5;
import X.ProgressDialogC1397770mTf;
import Y.AObserverS231S0100000_29;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* JADX INFO: loaded from: classes30.dex */
public class SearchMusicPlayerLifecycleObserver implements GenericLifecycleObserver {
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public MusicPlayHelper LLILLL;
    public ProgressDialogC1397770mTf LLILZ;
    public final AObserverS231S0100000_29 LLILZIL = new AObserverS231S0100000_29(this, 70);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        MusicPlayHelper musicPlayHelper = (MusicPlayHelper) C679340Qkm.LIZIZ(this.LLILLJJLI, this.LL).get(MusicPlayHelper.class);
        this.LLILLL = musicPlayHelper;
        NextLiveData<C19574011i6> nextLiveData = musicPlayHelper.LLILZLL;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragment = this.LLILLJJLI;
        C19EG c19eg = this.LL;
        sAFHelper.getClass();
        nextLiveData.observe(SAFHelper.LJJIIZ(fragment, c19eg), this.LLILZIL, false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        ProgressDialogC1397770mTf progressDialogC1397770mTf = this.LLILZ;
        if (progressDialogC1397770mTf != null) {
            C786410Ut5.LJIILL(progressDialogC1397770mTf);
        }
        this.LLILZ = null;
        MusicPlayHelper musicPlayHelper = this.LLILLL;
        if (musicPlayHelper != null) {
            musicPlayHelper.LLILZLL.removeObserver(this.LLILZIL);
        }
    }

    public SearchMusicPlayerLifecycleObserver(C19EG c19eg, Fragment fragment) {
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
    }
}
