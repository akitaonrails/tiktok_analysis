package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlexImageModel extends ImageModel {

    @C09CT("flex_setting")
    public List<Long> flexSetting;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;
}
