package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class MuteRuleAddResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("mute_rule")
        public MuteRule muteRule;
    }
}
