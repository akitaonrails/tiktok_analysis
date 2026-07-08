package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class RecommendSensitiveWordResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("prompt")
        public CommentFlaggedPrompt prompt;

        @C09CT("sensitive_word_prompt")
        public SensitiveWordPromptForNewUser sensitiveWordPrompt;

        @C09CT("word_list")
        public List<String> wordList = new ArrayList();
    }
}
