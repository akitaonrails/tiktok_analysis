package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class DisplayIcons implements Serializable {

    @C09CT("like_icon")
    public final ImageItem likeIcon;

    @C09CT("play_icon")
    public final ImageItem playIcon;

    public DisplayIcons(ImageItem imageItem, ImageItem imageItem2) {
        this.likeIcon = imageItem;
        this.playIcon = imageItem2;
    }
}
