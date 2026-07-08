package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class CapsuleMessage extends AbstractC1136060ffY {

    @C09CT("biz_params")
    public CapsuleBizParams bizParams;

    @C09CT("button_text")
    public Text buttonText;

    @C09CT("type")
    public int capsuleType;

    @C09CT("desc")
    public Text desc;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("report_action")
    public boolean reportAction;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("schema")
    public String schema;

    @C09CT("skip_fc")
    public boolean skipFc;

    @C09CT("style")
    public int style;

    @C09CT("sub_scene")
    public String subScene;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.desc != null;
    }

    public CapsuleMessage() {
        this.type = C001A.CAPSULE_MESSAGE;
        this.scene = "";
        this.subScene = "";
    }
}
