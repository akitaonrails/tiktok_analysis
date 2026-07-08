package com.ss.android.ugc.aweme.ecommerce.ug.trending.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomTrendingHostWhiteListModel {

    @C09CT("white_host_list")
    public final List<String> whiteHostList = C1697810uHb.LJ("ec");

    @C09CT("white_path_list")
    public final List<String> whitePathList = C1697810uHb.LJ("/mall");

    public final List<String> getWhiteHostList() {
        return this.whiteHostList;
    }

    public final List<String> getWhitePathList() {
        return this.whitePathList;
    }
}
