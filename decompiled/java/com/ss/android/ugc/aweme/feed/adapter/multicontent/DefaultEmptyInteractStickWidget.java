package com.ss.android.ugc.aweme.feed.adapter.multicontent;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;

/* JADX INFO: loaded from: classes12.dex */
public final class DefaultEmptyInteractStickWidget extends AbsInteractStickerWidget {
    @Override // X.C0R55
    public final void LIZ() {
    }

    @Override // X.C0R55
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LJIILL(float f) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LJIIZILJ(Aweme aweme) {
    }

    @Override // X.C0R55
    public final void onDestroyView() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final InteractStickerViewModel LJIILLIIL() {
        return new InteractStickerViewModel();
    }
}
