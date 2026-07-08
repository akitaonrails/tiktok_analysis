package com.ss.android.ugc.aweme.internalshare.impl.more.repository;

import X.C11NZ;
import X.C1247660iZY;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface SharePanelRelationSearchApi {
    public static final C1247660iZY LIZ = C1247660iZY.LIZ;

    @InterfaceC1501160pAQ("tiktok/user/relation/search/v1")
    C11NZ<RelationSearchResponse> queryRelationSearchList(@InterfaceC1501070pAH("search_scene") int i, @InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH("search_string") String str2, @InterfaceC1501070pAH("fuzzy_search") int i2, @InterfaceC1501070pAH("partial_matching") int i3, @InterfaceC1501070pAH("mention_type") int i4, @InterfaceC1501070pAH("enter_from") String str3);
}
