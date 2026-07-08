package com.bytedance.android.livesdk.activity.quiz.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuizStatistics {

    @C09CT("option_count")
    public List<OptionCountItem> optionCount = C13BV.INSTANCE;

    public static final class OptionCountItem {

        @C09CT("count")
        public int count;

        @C09CT("option_id")
        public String optionId = "";
    }
}
