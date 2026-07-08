package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeSubscriptionInfo {

    @C09CT("scenario_text")
    public String scenarioText = "";

    @C09CT("sub_eligibility")
    public int subEligibility;

    @C09CT("sub_info")
    public SubInfo subInfo;

    @C09CT("sub_scenario")
    public int subScenario;

    @C09CT("subscribe_permission")
    public SubscribePermission subscribePermission;

    @C09CT("subscriber_count")
    public int subscriberCount;
}
