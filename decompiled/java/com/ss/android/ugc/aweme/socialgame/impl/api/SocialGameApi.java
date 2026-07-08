package com.ss.android.ugc.aweme.socialgame.impl.api;

import X.C09CT;
import X.C2188811AlT;
import X.C463701rH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface SocialGameApi {
    public static final C463701rH LIZ = C463701rH.LIZ;

    @InterfaceC1501160pAQ("internal_share/exp_hit_check")
    Object checkExpHit(@InterfaceC1501070pAH("exp_list") String str, @InterfaceC1501070pAH("uid_list") String str2, InterfaceC1364105Vn<? super SocialGameExpHitResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("social_game/get_info")
    Object getEmojiGameNameById(@InterfaceC1501070pAH("game_id_list") String str, @InterfaceC1501070pAH("lang") String str2, InterfaceC1364105Vn<? super SocialGameNameResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("social_game/score/leaderboard")
    Object getLeaderBoard(@InterfaceC1501070pAH("game_id") int i, @InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("uid_scope_list") String str2, InterfaceC1364105Vn<? super SocialGameLeaderBoardResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("social_game/score/submit")
    Object submitScore(@InterfaceC1501050pAF("game_id") Integer num, @InterfaceC1501050pAF("conversation_id") String str, @InterfaceC1501050pAF("group_uid_list") String str2, @InterfaceC1501050pAF("score") Float f, @InterfaceC1501050pAF("emoji_text") String str3, @InterfaceC1501050pAF("sticker_url") String str4, @InterfaceC1501050pAF("emoji_type") Integer num2, @InterfaceC1501050pAF("game_path") String str5, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    public static final class SocialGameExpHitResponse extends BaseResponse {

        @C09CT("uid_hit_info")
        public final Map<String, String> hitInfo;

        public SocialGameExpHitResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SocialGameExpHitResponse) && Intrinsics.LJFF(this.hitInfo, ((SocialGameExpHitResponse) obj).hitInfo);
        }

        public final int hashCode() {
            Map<String, String> map = this.hitInfo;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialGameExpHitResponse(hitInfo=");
            sbLIZ.append(this.hitInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialGameExpHitResponse(Map<String, String> map) {
            this.hitInfo = map;
        }
    }

    public static final class SocialGameLeaderBoardResponse extends BaseResponse {

        @C09CT("leaderboard")
        public final List<SocialGameLeaderBoardItem> leaderboard;

        public SocialGameLeaderBoardResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SocialGameLeaderBoardResponse) && Intrinsics.LJFF(this.leaderboard, ((SocialGameLeaderBoardResponse) obj).leaderboard);
        }

        public final int hashCode() {
            List<SocialGameLeaderBoardItem> list = this.leaderboard;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialGameLeaderBoardResponse(leaderboard=");
            sbLIZ.append(this.leaderboard);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialGameLeaderBoardResponse(List<SocialGameLeaderBoardItem> list) {
            this.leaderboard = list;
        }
    }

    public static final class SocialGameNameResponse extends BaseResponse {

        @C09CT("game_name_map")
        public final Map<String, String> gameNameMap;

        public SocialGameNameResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SocialGameNameResponse) && Intrinsics.LJFF(this.gameNameMap, ((SocialGameNameResponse) obj).gameNameMap);
        }

        public final int hashCode() {
            Map<String, String> map = this.gameNameMap;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialGameNameResponse(gameNameMap=");
            sbLIZ.append(this.gameNameMap);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialGameNameResponse(Map<String, String> map) {
            this.gameNameMap = map;
        }
    }

    public static final class SocialGameLeaderBoardItem {

        @C09CT("score")
        public final Float score;

        @C09CT("uid")
        public final String uid;

        public SocialGameLeaderBoardItem(String str, Float f) {
            this.uid = str;
            this.score = f;
        }
    }
}
