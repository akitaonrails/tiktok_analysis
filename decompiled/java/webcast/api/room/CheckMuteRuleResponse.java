package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class CheckMuteRuleResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("mute_user_cnt")
        public long muteUserCnt;
    }
}
