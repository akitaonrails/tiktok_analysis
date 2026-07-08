package tikcast.api.privilege.creator_points;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CreatorPointsTileRecordsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("tile_records")
        public List<TileRecord> tileRecords = new ArrayList();

        @C09CT("redeemed_records")
        public List<RedeemedRecord> redeemedRecords = new ArrayList();
    }
}
