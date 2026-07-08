package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class EditPostPushBody implements Serializable {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("edit_id")
    public final String editId;

    @C09CT("edit_post_permission")
    public final EditPostPermission editPostPermission;

    @C09CT("push_scene")
    public final int pushScene;

    public EditPostPushBody(String str, String str2, int i, EditPostPermission editPostPermission) {
        this.awemeId = str;
        this.editId = str2;
        this.pushScene = i;
        this.editPostPermission = editPostPermission;
    }
}
