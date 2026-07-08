package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LiveFestEffectData {

    @C09CT("activity_end_time")
    public long activityEndTime;

    @C09CT("bonus_time_activated")
    public boolean bonusTimeActivated;

    @C09CT("bonus_time_remaining_seconds")
    public long bonusTimeRemainingSeconds;

    @C09CT("on_going")
    public boolean onGoing;

    @C09CT("rank")
    public long rank;

    @C09CT("tracking_info")
    public EventTrackingInfo trackingInfo;

    @C09CT("vault_activated")
    public boolean vaultActivated;

    @C09CT("vault_progress")
    public long vaultProgress;

    @C09CT("vault_remaining_seconds")
    public long vaultRemainingSeconds;

    @C09CT("bonus_id")
    public String bonusId = "";

    @C09CT("vault_id")
    public String vaultId = "";

    @C09CT("effect_state")
    public String effectState = "";

    @C09CT("effect_info")
    public Map<Integer, String> effectInfo = new LinkedHashMap();

    @C09CT("creator_region")
    public String creatorRegion = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
