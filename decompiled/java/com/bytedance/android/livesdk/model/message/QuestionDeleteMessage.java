package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class QuestionDeleteMessage extends AbstractC1136060ffY {

    @C09CT("question_id")
    public long questionId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("user_id")
    public long userId;

    public QuestionDeleteMessage() {
        this.type = C001A.QUESTION_DELETE_MESSAGE;
    }
}
