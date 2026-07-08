package webcast.api.game;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class StartPlayTogetherV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_bulletin_board_conflict")
        public boolean isBulletinBoardConflict;

        @C09CT("play_together_id")
        public String playTogetherId = "";

        @C09CT("review_not_pass_fields")
        public long reviewNotPassFields;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
