package com.ss.android.ugc.aweme.image.phototemplate.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class Extra {

    @C09CT("photo_template_ai_task_id")
    public final String aiTaskId;

    @C09CT("generate_new_image")
    public final boolean generateNewImage;

    @C09CT("photo_template_operation_task_id")
    public final String operationTaskId;

    @C09CT("tt_prop_id")
    public final String propId;

    public Extra() {
        this(false, null, null, null);
    }

    public Extra(boolean z, String str, String str2, String str3) {
        this.generateNewImage = z;
        this.propId = str;
        this.aiTaskId = str2;
        this.operationTaskId = str3;
    }
}
