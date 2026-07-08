package com.ss.android.ugc.aweme;

import X.C0RF0;
import X.C1331670kl3;
import X.C426600Go6;
import X.C729980SkG;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTextViewHolder extends VideoViewCell {
    public Aweme T0;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gq() {
        return "cell_text";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return TextUtils.equals("homepage_hot", this.LLJILJILJ.LJIIIZ) ? 2 : 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final Aweme hm() {
        Aweme aweme = this.T0;
        return aweme == null ? getAweme() : aweme;
    }

    public FeedTextViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.T0 = aweme;
        super.LJI(C729980SkG.LIZLLL(aweme));
        C786410Ut5.LJLLLLLL(8, this.LLLII);
        C426600Go6.LIZ(this.LLLF);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final C1331670kl3 i(Video video) {
        C1331670kl3 c1331670kl3I = super.i(video);
        c1331670kl3I.LJIL = Bitmap.Config.ARGB_8888;
        return c1331670kl3I;
    }
}
