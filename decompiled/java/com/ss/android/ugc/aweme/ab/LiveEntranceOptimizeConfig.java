package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEntranceOptimizeConfig implements Serializable {

    @C09CT("add_avtar_image_disk")
    public final boolean addAvtarImageDisk;

    @C09CT("avtar_image_cache_size")
    public final int avatarImageCacheSize;

    @C09CT("feed_avatar_expand_hot_area")
    public final boolean isFeedAvatarExpandHotArea;

    @C09CT("prepare_after_on_touch")
    public final boolean prepareAfterOnTouch;

    @C09CT("preset_room_info")
    public final boolean presetRoomInfo;

    public LiveEntranceOptimizeConfig() {
        this(false, false, false, false, 1);
    }

    public final boolean isFeedAvatarExpandHotArea() {
        return this.isFeedAvatarExpandHotArea;
    }

    public LiveEntranceOptimizeConfig(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.isFeedAvatarExpandHotArea = z;
        this.presetRoomInfo = z2;
        this.prepareAfterOnTouch = z3;
        this.addAvtarImageDisk = z4;
        this.avatarImageCacheSize = i;
    }
}
