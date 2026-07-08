package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.C13LP;
import X.C13LQ;
import com.ss.android.ugc.feed.bridge.legacy.banner.IStandardBannerWList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class StandardBannerWList implements IStandardBannerWList {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"bottom_banner_playlist", "bottom_banner_search_rs", "bottom_banner_series_mini_drama"});

    @Override // com.ss.android.ugc.feed.bridge.legacy.banner.IStandardBannerWList
    public final List<String> LIZ() {
        return C13LP.LLIIII(LIZ);
    }
}
