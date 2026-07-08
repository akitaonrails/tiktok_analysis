package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestData {

    @C09CT("is_multi_guest")
    public boolean isMultiGuest;

    @C09CT("multi_guest_banner")
    public MultiGuestBanner multiGuestBanner;

    @C09CT("room_stats")
    public List<RoomStat> roomStats = new ArrayList();

    @C09CT("rank_list")
    public List<MultiGuestRank> rankList = new ArrayList();
}
