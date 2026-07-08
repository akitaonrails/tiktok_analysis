package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes13.dex */
public class RemindMessage extends AbstractC1136060ffY {

    @C09CT("tips_title")
    public Text bottomTip;

    @C09CT("content")
    public String content;

    @C09CT("display_text")
    public Text illegalText;

    @C09CT("notice_content")
    public Text noticeContent;

    @C09CT("notice_title")
    public Text noticeTitle;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("style")
    public String style;

    @C09CT("tips_url")
    public String tipUrl;

    @C09CT("title")
    public Text title;

    @C09CT("violation_reason")
    public Text violationReason;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public RemindMessage() {
        this.type = C001A.REMIND;
    }
}
