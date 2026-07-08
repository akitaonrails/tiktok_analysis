package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ReverseExposedEmojiConfig {

    @C09CT("reverse_relation_white_list")
    public final List<Integer> relationWhiteList;

    @C09CT("reverse_all_scene")
    public final int reverseAll;

    public ReverseExposedEmojiConfig() {
        this(0, new ArrayList());
    }

    public ReverseExposedEmojiConfig(int i, List<Integer> list) {
        this.reverseAll = i;
        this.relationWhiteList = list;
    }
}
