package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RankListTabInfo {

    @C09CT("supported_version")
    public long supportedVersion;

    @C09CT("tabs")
    public List<RankTabInfo> tabs = new ArrayList();
}
