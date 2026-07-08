package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import X.C0R55;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsInteractStickerWidget extends LifecycleOwnerWidget implements C0R55 {
    public abstract void LJIILL(float f);

    public abstract InteractStickerViewModel LJIILLIIL();

    public abstract void LJIIZILJ(Aweme aweme);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
