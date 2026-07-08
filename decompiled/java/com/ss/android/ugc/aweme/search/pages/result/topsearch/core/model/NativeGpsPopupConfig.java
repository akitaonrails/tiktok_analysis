package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class NativeGpsPopupConfig implements Serializable {
    public static final long serialVersionUID = 1;

    @C09CT("popup_delay_ms")
    public int popupDelayMs;

    @C09CT("cooldown_after_close_days")
    public int cooldownAfterCloseDays = 7;

    @C09CT("cooldown_upgrade_days")
    public int cooldownUpgradeDays = 30;

    @C09CT("upgrade_threshold")
    public int upgradeThreshold = 3;
}
