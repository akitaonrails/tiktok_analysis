package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;

/* JADX INFO: loaded from: classes29.dex */
public interface IConfigService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    IAVSettingsService avsettingsConfig();

    ICacheService cacheConfig();

    IGeofencingService geoFencingConfig();

    void mobUserExitEditAction(String str, String str2);

    IPrivacyConfig privacyConfig();

    IShortVideoConfig shortVideoConfig();

    void updateServerSettings(IESSettingsProxy iESSettingsProxy);

    void userAction(int i);
}
