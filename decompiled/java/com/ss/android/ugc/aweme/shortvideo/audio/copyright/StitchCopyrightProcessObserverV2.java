package com.ss.android.ugc.aweme.shortvideo.audio.copyright;

import X.C10JC;
import X.C10JH;
import X.C10JI;
import Y.AObserverS230S0100000_28;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class StitchCopyrightProcessObserverV2 implements GenericLifecycleObserver {
    public final Scene LL;
    public final C10JI LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final Function0<Unit> LLILZ;
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>(Boolean.FALSE);
    public final AwS572S0100000_28 LLILZLL = new AwS572S0100000_28(this, 920);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$tools_publish_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$tools_publish_release() {
        this.LLILZIL.observe(this.LL, new AObserverS230S0100000_28(this, 44));
    }

    public StitchCopyrightProcessObserverV2(VideoPublishContainerScene videoPublishContainerScene, C10JI c10ji, C10JC c10jc, C10JH c10jh) {
        this.LL = videoPublishContainerScene;
        this.LLILLJJLI = c10ji;
        this.LLILLL = c10jc;
        this.LLILZ = c10jh;
        videoPublishContainerScene.getLifecycle().addObserver(this);
    }
}
