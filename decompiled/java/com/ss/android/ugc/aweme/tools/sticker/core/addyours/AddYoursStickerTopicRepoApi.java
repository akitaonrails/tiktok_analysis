package com.ss.android.ugc.aweme.tools.sticker.core.addyours;

import X.C09CT;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public interface AddYoursStickerTopicRepoApi {
    void LIZ(String str, Function0 function0, Function2 function2);

    void LIZIZ(AwS549S0100000_5 awS549S0100000_5, AwS619S0100000_5 awS619S0100000_5);

    public static final class AddYoursAutoSuggestTopicForText {

        @C09CT("text")
        public final String text;

        @C09CT("suggest_topic_type")
        public final Integer type;

        public AddYoursAutoSuggestTopicForText() {
            this(null, null);
        }

        public AddYoursAutoSuggestTopicForText(String str, Integer num) {
            this.text = str;
            this.type = num;
        }
    }

    public static final class AddYoursTopicRecommendInfo {

        @C09CT("add_yours_sticker")
        public final AddYoursStickerStruct addYoursSticker;

        @C09CT("topic_text")
        public final String topicText;

        public AddYoursTopicRecommendInfo(String str, AddYoursStickerStruct addYoursStickerStruct) {
            this.topicText = str;
            this.addYoursSticker = addYoursStickerStruct;
        }
    }

    public static final class RecommendTopicsResult {

        @C09CT("request_text")
        public final String requestText;

        @C09CT("topic_list")
        public final List<AddYoursAutoSuggestTopicForText> topicList;

        public RecommendTopicsResult(String str, List<AddYoursAutoSuggestTopicForText> list) {
            this.requestText = str;
            this.topicList = list;
        }
    }

    public static final class AddYoursTopicRecommendResp {

        @C09CT("topic_recommend")
        public final List<AddYoursTopicRecommendInfo> recommendTopics;

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        public AddYoursTopicRecommendResp() {
            this(null, "", new ArrayList());
        }

        public AddYoursTopicRecommendResp(Integer num, String str, List<AddYoursTopicRecommendInfo> list) {
            this.statusCode = num;
            this.statusMsg = str;
            this.recommendTopics = list;
        }
    }

    public static final class AddYoursSuggestTopic implements Serializable {
        public static final int $stable = 8;

        @C09CT("avatars")
        public final List<AddYoursAvatar> avatars;

        @C09CT("text")
        public final String text;

        @C09CT("topic_id")
        public final Long topicId;

        @C09CT("suggest_topic_type")
        public final Integer type;

        @C09CT("videos_count")
        public final Long videoCount;

        public AddYoursSuggestTopic() {
            this(null, null, null, null, null);
        }

        public final AddYoursSuggestTopic copy(Long l, String str, Integer num, List<AddYoursAvatar> list, Long l2) {
            return new AddYoursSuggestTopic(l, str, num, list, l2);
        }

        public AddYoursSuggestTopic(Long l, String str, Integer num, List<AddYoursAvatar> list, Long l2) {
            this.topicId = l;
            this.text = str;
            this.type = num;
            this.avatars = list;
            this.videoCount = l2;
        }
    }
}
