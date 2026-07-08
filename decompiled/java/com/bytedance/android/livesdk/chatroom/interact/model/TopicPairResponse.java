package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TopicPairResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("pair_id")
        public long pairId;

        @C09CT("rival_avatars")
        public List<ImageModel> rivalAvatars = new ArrayList();

        @C09CT("setting")
        public Setting setting;

        public static final class Setting {

            @C09CT("expect_succ_sec")
            public long expectSuccSec;

            @C09CT("timeout_sec")
            public long timeoutSec;
        }
    }
}
