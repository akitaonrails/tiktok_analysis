package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class EducateUserMessageSetting {
    public static final EducateUserMessageSetting LIZ = new EducateUserMessageSetting();
    public static final EducateUserMessageConfig LIZIZ = new EducateUserMessageConfig(400, 3);

    public static final class EducateUserMessageConfig {

        @C09CT("max_chat_count")
        public final int maxChatCount;

        @C09CT("max_follower_count")
        public final int maxFollowerCount;

        public EducateUserMessageConfig() {
            this(400, 3);
        }

        public EducateUserMessageConfig(int i, int i2) {
            this.maxFollowerCount = i;
            this.maxChatCount = i2;
        }
    }
}
