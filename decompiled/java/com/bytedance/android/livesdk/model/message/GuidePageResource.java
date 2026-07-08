package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuidePageResource {

    @C09CT("action_type")
    public long actionType;

    @C09CT("icon_style_id")
    public long iconStyleId;

    @C09CT("texts")
    public List<Text> texts = new ArrayList();

    @C09CT("icons")
    public List<ImageModel> icons = new ArrayList();

    @C09CT("animations")
    public List<ImageModel> animations = new ArrayList();

    @C09CT("badges")
    public List<BadgeStruct> badges = new ArrayList();

    @C09CT("button_texts")
    public List<Text> buttonTexts = new ArrayList();
}
