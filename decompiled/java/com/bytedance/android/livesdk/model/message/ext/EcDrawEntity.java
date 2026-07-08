package com.bytedance.android.livesdk.model.message.ext;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class EcDrawEntity {

    @C09CT("activity_id")
    public long activityId;

    @C09CT("incentive_image")
    public ImageModel incentiveImage;

    @C09CT("incentive_record_id")
    public long incentiveRecordId;

    @C09CT("draw_type")
    public int type = 1;

    @C09CT("sub_type")
    public int subType = 1;

    @C09CT("schema")
    public String schema = "";
}
