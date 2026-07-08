package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class PrivilegeAdvanceMessage extends AbstractC1136060ffY {

    @C09CT("background")
    public ImageModel background;

    @C09CT("control")
    public DisplayControl control;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("notify")
    public RoomNotifyMessage notify;

    @C09CT("privilege_log_extra")
    public PrivilegeLogExtra privilegeLogExtra;

    @C09CT("right_icon")
    public ImageModel rightIcon;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("sub_type")
    public String subType;

    public PrivilegeAdvanceMessage() {
        this.type = C001A.PRIVILEGE_ADVANCE_MESSAGE;
        this.scene = "";
        this.subType = "";
    }
}
