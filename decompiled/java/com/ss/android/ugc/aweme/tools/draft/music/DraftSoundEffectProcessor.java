package com.ss.android.ugc.aweme.tools.draft.music;

import X.C0MYK;
import X.C0MYU;
import X.C1637890six;
import X.C543670LTx;
import X.C570670MZt;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftSoundEffectProcessor implements GenericLifecycleObserver {
    public final AwemeDraft LL;
    public C0MYU LLILLJJLI;
    public final List<SoundEffect> LLILLL = new ArrayList();
    public final List<C570670MZt> LLILZ = new ArrayList();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILLJJLI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public DraftSoundEffectProcessor(AwemeDraft awemeDraft, C0MYK c0myk) {
        this.LL = awemeDraft;
        this.LLILLJJLI = c0myk;
    }

    public static void LIZ(int i, String str, List list) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("is_sound_effect", Boolean.TRUE);
        c543670LTx.LIZ.put("errorDesc", str);
        c543670LTx.LIZ.put("sound_effect", list.toString());
        C1637890six.LJ("draft_music_permission_check_rate", i, c543670LTx.LJ());
    }
}
