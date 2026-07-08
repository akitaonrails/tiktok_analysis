package com.ugc.android.clientai.lang.response;

import X.C015J;
import X.C09CT;
import X.C13LP;
import X.C892860Z0y;
import com.ugc.android.clientai.lang.message.Message;
import com.ugc.android.clientai.lang.response.ChatCompletionResponse;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatCompletionResponse {
    public static final C892860Z0y Companion = new Object() { // from class: X.0Z0y
        public static ChatCompletionResponse LIZ(String str, String str2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Message.Companion.getClass();
            return new ChatCompletionResponse(jCurrentTimeMillis, false, Collections.singletonList(new ChatCompletionResponse.Choice(new Message(Message.Role.ASSISTANT, str, null), str2, true, null)), null);
        }
    };

    @C09CT("choices")
    public final List<Choice> choices;

    @C09CT("created")
    public final long created;

    @C09CT("isStream")
    public final boolean isStream;
    public final transient C015J usage;

    public final boolean isStop() {
        Choice choice = (Choice) C13LP.LJJLIIIJL(this.choices);
        if (choice != null) {
            return choice.finish;
        }
        return true;
    }

    public final List<Choice> getChoices() {
        return this.choices;
    }

    public final long getCreated() {
        return this.created;
    }

    public final C015J getUsage() {
        return this.usage;
    }

    public final boolean isStream() {
        return this.isStream;
    }

    public static final class Choice {

        @C09CT("delta")
        public final Message delta;

        @C09CT("finish")
        public final boolean finish;

        @C09CT("finishReason")
        public final String finishReason;

        @C09CT("message")
        public final Message message;

        public Choice() {
            this(null, null, true, null);
        }

        public Choice(Message message, String str, boolean z, Message message2) {
            this.message = message;
            this.finishReason = str;
            this.finish = z;
            this.delta = message2;
        }
    }

    public ChatCompletionResponse(long j, boolean z, List<Choice> list, C015J c015j) {
        this.created = j;
        this.isStream = z;
        this.choices = list;
        this.usage = c015j;
    }
}
