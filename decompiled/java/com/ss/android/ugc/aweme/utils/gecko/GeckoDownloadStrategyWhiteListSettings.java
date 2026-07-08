package com.ss.android.ugc.aweme.utils.gecko;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoDownloadStrategyWhiteListSettings {
    public static final GeckoDownloadStrategyWhiteListModel LIZ = new GeckoDownloadStrategyWhiteListModel();

    public static class GeckoDownloadStrategyWhiteListModel {

        @C09CT("list")
        public List[] list;
    }

    public static class List {

        @C09CT("ak")
        public String ak;

        @C09CT("channels")
        public String[] channels;

        @C09CT("groups")
        public String[] groups;
    }
}
