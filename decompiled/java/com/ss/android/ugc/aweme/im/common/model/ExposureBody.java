package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.saas.host.api.im.model.GroupRecShowInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class ExposureBody {

    @C09CT("action")
    public final int action;

    @C09CT("group_rec_show_info")
    public final GroupRecShowInfo groupRecShowInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public ExposureBody() {
        this(-1, -1, null);
    }

    public ExposureBody(int i, int i2, GroupRecShowInfo groupRecShowInfo) {
        this.scene = i;
        this.action = i2;
        this.groupRecShowInfo = groupRecShowInfo;
    }
}
