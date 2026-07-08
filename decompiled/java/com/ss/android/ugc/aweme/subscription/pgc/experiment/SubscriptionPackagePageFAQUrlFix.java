package com.ss.android.ugc.aweme.subscription.pgc.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
public final class SubscriptionPackagePageFAQUrlFix {
    public static final int $stable = 0;
    public static final boolean isEnabled;
    public static final SubscriptionPackagePageFAQUrlFix INSTANCE = new SubscriptionPackagePageFAQUrlFix();
    public static final boolean DEFAULT = true;

    static {
        SettingsManager.LIZLLL().getClass();
        isEnabled = SettingsManager.LIZ("pgc_subscription_package_page_faq_url_fix", true);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isEnabled() {
        return isEnabled;
    }
}
