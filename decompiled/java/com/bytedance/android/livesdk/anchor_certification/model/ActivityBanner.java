package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBanner {

    @C09CT("description")
    public Text description;

    @C09CT("image")
    public ImageModel image;

    @C09CT("title")
    public Text title;

    @C09CT("schema")
    public String schema = "";

    @C09CT("in_live_schema")
    public String inLiveSchema = "";
}
