package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class UnifyTagStyleExpData {

    @C09CT("avatar_size")
    public final int avatarSizeDp;

    @C09CT("enable_all_scenes")
    public final boolean enableAllScene;

    @C09CT("enable_weaken_tag")
    public final boolean enableWeakenTag;

    @C09CT("tag_height")
    public final int heightDp;

    @C09CT("icon_size")
    public final int iconSizeDp;

    @C09CT("support_scenes")
    public final List<String> scenes;

    @C09CT("tag_font")
    public final String textFontProtocol;

    public UnifyTagStyleExpData() {
        this(false, null, 0, null, 0, 0, false, 127, null);
    }

    public UnifyTagStyleExpData(boolean z, List<String> list, int i, String str, int i2, int i3, boolean z2) {
        this.enableAllScene = z;
        this.scenes = list;
        this.heightDp = i;
        this.textFontProtocol = str;
        this.iconSizeDp = i2;
        this.avatarSizeDp = i3;
        this.enableWeakenTag = z2;
    }

    public UnifyTagStyleExpData(boolean z, List list, int i, String str, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? C13BV.INSTANCE : list, (i4 & 4) != 0 ? 20 : i, (i4 & 8) != 0 ? "tux://font?token=P3_SEMIBOLD&from=feed_bottom_tag_style" : str, (i4 & 16) != 0 ? 12 : i2, (i4 & 32) != 0 ? 15 : i3, (i4 & 64) != 0 ? false : z2);
    }
}
