package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
public final class TtlsSparkAppendAllowlistPagesSettings {
    public static final AppendAllowlistPages DEFAULT;
    public static final TtlsSparkAppendAllowlistPagesSettings INSTANCE = new TtlsSparkAppendAllowlistPagesSettings();
    public static final AppendAllowlistPages allowlist;

    static {
        AppendAllowlistPages appendAllowlistPages = new AppendAllowlistPages(null, null, 3, null);
        DEFAULT = appendAllowlistPages;
        AppendAllowlistPages appendAllowlistPages2 = (AppendAllowlistPages) SettingsManager.LIZLLL().LJIIIIZZ("ttls_spark_append_allowlist_pages", AppendAllowlistPages.class, appendAllowlistPages);
        if (appendAllowlistPages2 != null) {
            appendAllowlistPages = appendAllowlistPages2;
        }
        allowlist = appendAllowlistPages;
    }

    public final AppendAllowlistPages getAllowlist() {
        return allowlist;
    }

    public final AppendAllowlistPages getDEFAULT() {
        return DEFAULT;
    }
}
