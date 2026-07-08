package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class PreviewCardSignalSystemConfig {

    @C09CT("follow_end_index")
    public int endIndex;

    @C09CT("following_head_enable")
    public boolean followingHeadEnable;

    @C09CT("following_register_index")
    public int followingRegisterIndex;

    @C09CT("fyp_register_index")
    public int fypRegisterIndex;

    @C09CT("keep_loop")
    public boolean keepLoop;

    @C09CT("cover_scene_list")
    public List<String> sceneList;

    @C09CT("follow_start_index")
    public int startIndex;

    @C09CT("subscribe_version")
    public int subscribeVersion;

    public PreviewCardSignalSystemConfig() {
        this(false, false, 0, 0, 0, null, 0, 0, 255, null);
    }

    public PreviewCardSignalSystemConfig(boolean z, boolean z2, int i, int i2, int i3, List<String> list, int i4, int i5) {
        this.followingHeadEnable = z;
        this.keepLoop = z2;
        this.subscribeVersion = i;
        this.fypRegisterIndex = i2;
        this.followingRegisterIndex = i3;
        this.sceneList = list;
        this.startIndex = i4;
        this.endIndex = i5;
    }

    public PreviewCardSignalSystemConfig(boolean z, boolean z2, int i, int i2, int i3, List list, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? false : z2, (i6 & 4) == 0 ? i : 0, (i6 & 8) != 0 ? 5 : i2, (i6 & 16) == 0 ? i3 : 5, (i6 & 32) != 0 ? Collections.singletonList("homepage_follow") : list, (i6 & 64) != 0 ? 25 : i4, (i6 & 128) != 0 ? 20 : i5);
    }
}
