package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class OperateToastMessage extends AbstractC1136060ffY {

    @C09CT("delay_display_duration_millisecond")
    public long delayDuration;

    @C09CT("display_duration_millisecond")
    public long displayDuration;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public OperateToastMessage() {
        this.type = C001A.OPERATE_TOAST_MESSAGE;
        this.scene = "";
    }
}
