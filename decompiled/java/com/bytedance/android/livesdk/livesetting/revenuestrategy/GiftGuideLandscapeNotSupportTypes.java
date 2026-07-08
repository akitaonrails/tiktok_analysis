package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C01GW;
import X.C13LQ;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_guide_landscape_not_support_types")
public final class GiftGuideLandscapeNotSupportTypes {
    public static final GiftGuideLandscapeNotSupportTypes INSTANCE = new GiftGuideLandscapeNotSupportTypes();
    public static final String[] DEFAULT = {"gift_guide_live_goal_popup", "gift_guide_user_level_popup", "gift_guide_ug_task_gift_popup", "gift_guide_ug_task_show_popup", "gift_guide_popup_fans_membership_points", "gift_guide_popup_fans_membership_reactivate", "gift_guide_popup_first_recharge", "gift_guide_heartme_task_show_popup"};
    public static final C01GW notSupportTypes$delegate = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(84));

    private final String[] getNotSupportTypes() {
        return (String[]) notSupportTypes$delegate.getValue();
    }

    public final boolean contains(String str) {
        return C13LQ.LJIILLIIL(str, getNotSupportTypes());
    }
}
