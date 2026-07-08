package com.ss.android.ugc.aweme.experiment.newuser;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes17.dex */
public final class WeakNetCountryGeckoNormalOptSettings {
    public static final GeckoxWeakCountryChannelWhitelistModel LIZ = new GeckoxWeakCountryChannelWhitelistModel();

    public static class GeckoxWeakCountryChannelWhitelistModel {

        @C09CT("enable")
        public boolean enable;

        @C09CT("unloadDays")
        public long unloadDays = 5;

        @C09CT("whiteList")
        public String[] whiteList;
    }

    public static GeckoxWeakCountryChannelWhitelistModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        GeckoxWeakCountryChannelWhitelistModel geckoxWeakCountryChannelWhitelistModel = LIZ;
        GeckoxWeakCountryChannelWhitelistModel geckoxWeakCountryChannelWhitelistModel2 = (GeckoxWeakCountryChannelWhitelistModel) settingsManagerLIZLLL.LJIIIIZZ("geckox_weak_country_channel_whitelist", GeckoxWeakCountryChannelWhitelistModel.class, geckoxWeakCountryChannelWhitelistModel);
        return geckoxWeakCountryChannelWhitelistModel2 != null ? geckoxWeakCountryChannelWhitelistModel2 : geckoxWeakCountryChannelWhitelistModel;
    }
}
