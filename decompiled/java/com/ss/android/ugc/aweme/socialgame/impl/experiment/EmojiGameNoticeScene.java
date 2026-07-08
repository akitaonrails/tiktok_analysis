package com.ss.android.ugc.aweme.socialgame.impl.experiment;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiGameNoticeScene implements Serializable {

    @C09CT("first_score_inline_scenes")
    public final List<String> firstScoreScene;

    @C09CT("new_record_inline_scenes")
    public final List<String> newRecordScene;

    public EmojiGameNoticeScene() {
        this(null, null);
    }

    public EmojiGameNoticeScene(List<String> list, List<String> list2) {
        this.firstScoreScene = list;
        this.newRecordScene = list2;
    }
}
