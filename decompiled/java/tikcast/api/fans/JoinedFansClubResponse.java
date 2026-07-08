package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.CurrentSuperFanContract;

/* JADX INFO: loaded from: classes28.dex */
public final class JoinedFansClubResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class FansClub {

        @C09CT("anchor")
        public User anchor;

        @C09CT("current_contract_info")
        public CurrentSuperFanContract currentContractInfo;

        @C09CT("current_relation_months")
        public int currentRelationMonths;

        @C09CT("fans_club_name")
        public String fansClubName = "";

        @C09CT("fans_level")
        public long fansLevel;

        @C09CT("is_super_fan")
        public boolean isSuperFan;

        @C09CT("room_id")
        public long roomId;
    }

    public static final class ResponseData {

        @C09CT("fans_clubs")
        public List<FansClub> fansClubs = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public long nextOffset;

        @C09CT("total")
        public long total;
    }
}
