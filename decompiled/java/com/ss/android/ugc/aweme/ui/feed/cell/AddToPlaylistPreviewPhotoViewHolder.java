package com.ss.android.ugc.aweme.ui.feed.cell;

import X.C0RF0;
import X.C1558420qem;
import X.C1558520qew;
import android.view.View;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;

/* JADX INFO: loaded from: classes12.dex */
public final class AddToPlaylistPreviewPhotoViewHolder extends FeedPhotosViewHolder {
    public AddToPlaylistPreviewPhotoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void K(View view, boolean z) {
        super.K(view, z);
        BottomSlideIndicatorAbility bottomSlideIndicatorAbility = (BottomSlideIndicatorAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), BottomSlideIndicatorAbility.class, null);
        if (bottomSlideIndicatorAbility != null) {
            bottomSlideIndicatorAbility.Yv1();
        }
    }
}
