package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class IabHistorySaveDetail implements Serializable {
    public static final int $stable = 8;

    @C09CT("iab_ad_info")
    public final AdWebHistoryAdInfo adWebHistoryAdInfo;

    @C09CT("iab_history_infos")
    public final List<AdWebHistoryEntity> adWebHistoryEntities;

    @C09CT("entrance")
    public final String entrance;

    public IabHistorySaveDetail() {
        this(null, null, null);
    }

    public final IabHistorySaveDetail copy(String str, AdWebHistoryAdInfo adWebHistoryAdInfo, List<AdWebHistoryEntity> list) {
        return new IabHistorySaveDetail(str, adWebHistoryAdInfo, list);
    }

    public IabHistorySaveDetail(String str, AdWebHistoryAdInfo adWebHistoryAdInfo, List<AdWebHistoryEntity> list) {
        this.entrance = str;
        this.adWebHistoryAdInfo = adWebHistoryAdInfo;
        this.adWebHistoryEntities = list;
    }
}
