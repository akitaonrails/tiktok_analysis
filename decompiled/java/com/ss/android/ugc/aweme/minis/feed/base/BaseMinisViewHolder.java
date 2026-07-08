package com.ss.android.ugc.aweme.minis.feed.base;

import X.C0RF0;
import X.C0RF2;
import X.C0RGP;
import X.C0SMO;
import com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseMinisViewHolder<P extends C0SMO<P, VideoItemParams>> extends BaseSubViewHolder<P, VideoItemParams> {
    public final C0RF2<P, VideoItemParams> LLJJL;

    public BaseMinisViewHolder(C0RF0 c0rf0, C0RGP c0rgp) {
        super(c0rf0, c0rgp);
        this.LLJJL = c0rgp;
    }
}
