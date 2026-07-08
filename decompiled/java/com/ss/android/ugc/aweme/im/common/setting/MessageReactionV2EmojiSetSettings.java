package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MessageReactionV2EmojiSetSettings {
    public static final MessageReactionV2EmojiSetModel LIZ = new MessageReactionV2EmojiSetModel(C1697810uHb.LJIIJJI("❤️", "😂", "🥰", "😭", "😳", "👍"), C1697810uHb.LJIIJJI("❤️", "😂", "😡", "😭", "👍", "🤔", "🎉", "🤗", "😳", "😱", "🤪", "🙈"), C1697810uHb.LJIIJJI("❤️", "😂", "😠", "😢", "😮", "🙏", "👍", "🙈", "🤪", "🎉", "🤔", "🙈"), C1697810uHb.LJIIJJI("😂", "❤️", "🎉", "😭", "🙏", "👍", "👎", "😠", "🤔", "😮", "🙈", "🤪"), C1697810uHb.LJIIJJI("❤️", "😂", "😡", "😭", "👍", "🤔", "🎉", "🤗", "😳", "😱", "🤪", "🙈"), C1697810uHb.LJIIJJI("❤️", "😂", "😭", "👍", "😡", "🤔", "😳", "😱", "🤗", "🙈", "🤪", "🎉"));

    public static final class MessageReactionV2EmojiSetModel {

        @C09CT("reaction_emoji_set_default")
        public final List<String> reactionEmojiSetDefault;

        @C09CT("reaction_emoji_set_v1")
        public final List<String> reactionEmojiSetV1;

        @C09CT("reaction_emoji_set_v2")
        public final List<String> reactionEmojiSetV2;

        @C09CT("reaction_emoji_set_v3")
        public final List<String> reactionEmojiSetV3;

        @C09CT("reaction_emoji_set_v4")
        public final List<String> reactionEmojiSetV4;

        @C09CT("reaction_emoji_set_v5")
        public final List<String> reactionEmojiSetV5;

        public MessageReactionV2EmojiSetModel(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
            this.reactionEmojiSetDefault = list;
            this.reactionEmojiSetV1 = list2;
            this.reactionEmojiSetV2 = list3;
            this.reactionEmojiSetV3 = list4;
            this.reactionEmojiSetV4 = list5;
            this.reactionEmojiSetV5 = list6;
        }
    }
}
