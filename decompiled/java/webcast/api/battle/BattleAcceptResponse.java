package webcast.api.battle;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleAcceptResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_last_accept")
        public boolean isLastAccept;
    }
}
