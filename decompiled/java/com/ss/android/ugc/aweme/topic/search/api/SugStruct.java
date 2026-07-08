package com.ss.android.ugc.aweme.topic.search.api;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SugStruct {

    @C09CT("content")
    public final String content;

    @C09CT("highlight_pos")
    public final List<Position> highlights;

    @C09CT("topic_info")
    public final TopicRawInfo topicInfo;

    @C09CT("word_record")
    public final Word word;

    /* JADX WARN: Multi-variable type inference failed */
    public SugStruct(TopicRawInfo topicRawInfo, String str, Word word, List<? extends Position> list) {
        this.topicInfo = topicRawInfo;
        this.content = str;
        this.word = word;
        this.highlights = list;
    }
}
