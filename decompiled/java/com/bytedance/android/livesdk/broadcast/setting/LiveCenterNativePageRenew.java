package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_center_native_page_renew")
public final class LiveCenterNativePageRenew {
    public static final int DEFAULT = 0;
    public static final LiveCenterNativePageRenew INSTANCE = new LiveCenterNativePageRenew();

    public final int getDataBoardGridLayout() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? R.layout.h0x : R.layout.h0y;
    }

    public final int getDataBoardLayoutId() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? R.layout.h0w : isEnable() ? R.layout.h11 : R.layout.h0v;
    }

    public final int getDataBoardLinearLayout() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? R.layout.h0z : R.layout.h10;
    }

    public final int getLiveLopLayoutId() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? R.layout.h1d : isEnable() ? R.layout.h1e : R.layout.h1c;
    }

    public final int getPropsLayoutId() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? R.layout.h21 : R.layout.h1m;
    }

    public final int getPunishItemLayoutId() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? R.layout.h1q : isEnable() ? R.layout.h1r : R.layout.h1p;
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_center_native_page_renew", DEFAULT) > 0;
    }

    public final int getFinishedPunishBg() {
        return isEnable() ? R.drawable.ebc : R.drawable.ebb;
    }

    public final int getGrowthLayoutId() {
        return isEnable() ? R.layout.h15 : R.layout.h14;
    }

    public final int getLiveJourneyLayoutId() {
        return isEnable() ? R.layout.h19 : R.layout.h18;
    }

    public final int getLynxLayoutId() {
        return isEnable() ? R.layout.h1g : R.layout.h1f;
    }

    public final int getOnGoingPunishBg() {
        return isEnable() ? R.drawable.eb_ : R.drawable.eba;
    }

    public final int getPlayBookLayoutId() {
        return isEnable() ? R.layout.h1i : R.layout.h1h;
    }

    public final int getPunishLayoutId() {
        return isEnable() ? R.layout.h1s : R.layout.h1n;
    }

    public final int getStatusLayoutId() {
        isEnable();
        return R.layout.h1u;
    }

    public final int getTiktokShopLayoutId() {
        return isEnable() ? R.layout.h1t : R.layout.h1g;
    }

    public final int getTipsLayoutId() {
        return isEnable() ? R.layout.h1w : R.layout.h1v;
    }

    public final int getTitleLayoutId() {
        return isEnable() ? R.layout.h1y : R.layout.h1x;
    }
}
