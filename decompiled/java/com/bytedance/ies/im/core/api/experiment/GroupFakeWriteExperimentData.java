package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupFakeWriteExperimentData implements Serializable {

    @C09CT("avatar")
    public final boolean avatar;

    @C09CT("biz_scene")
    public final List<String> bizScene;

    @C09CT("enable_fake_write")
    public final boolean enableFakeWrite;

    public GroupFakeWriteExperimentData() {
        this(false, false, null, 7, null);
    }

    public GroupFakeWriteExperimentData(boolean z, boolean z2, List<String> list) {
        this.enableFakeWrite = z;
        this.avatar = z2;
        this.bizScene = list;
    }

    public GroupFakeWriteExperimentData(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
