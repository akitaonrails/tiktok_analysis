package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecentCommunityUpgradeInfo {

    @C09CT("event")
    public CommunityUpgradeEvent event;

    @C09CT("unlocked_decorations")
    public List<CommunityDecorationInfo> unlockedDecorations = new ArrayList();

    @C09CT("unlocked_slot")
    public CommunitySlotInfo unlockedSlot;
}
