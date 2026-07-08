package com.ss.android.ugc.aweme.comment.commentlist.util;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class DonationStickerAnchorExtra implements Serializable {
    public static final int $stable = 8;

    @C09CT("icon_url_list")
    public final List<UrlModel> iconUrlList;

    public DonationStickerAnchorExtra() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DonationStickerAnchorExtra(List<? extends UrlModel> list) {
        this.iconUrlList = list;
    }
}
