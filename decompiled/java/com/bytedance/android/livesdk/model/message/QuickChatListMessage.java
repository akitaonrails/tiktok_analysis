package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuickChatListMessage extends AbstractC1136060ffY {

    @C09CT("content_list")
    public List<QuickChatContent> contentList;

    @C09CT("duration")
    public long duration;

    @C09CT("priority")
    public long priority;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    public QuickChatListMessage() {
        this.type = C001A.QUICK_CHAT_LIST_MESSAGE;
    }
}
