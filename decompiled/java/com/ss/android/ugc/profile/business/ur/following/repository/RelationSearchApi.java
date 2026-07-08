package com.ss.android.ugc.profile.business.ur.following.repository;

import X.C11NZ;
import X.C1247640iZW;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface RelationSearchApi {
    public static final C1247640iZW LIZ = C1247640iZW.LIZ;

    @InterfaceC1501200pAU("tiktok/user/relation/search/v1")
    C11NZ<RelationSearchResponse> queryRelationSearchList(@InterfaceC1501070pAH("search_scene") int i, @InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH("search_string") String str2, @InterfaceC1501070pAH("fuzzy_search") int i2, @InterfaceC1501070pAH("partial_matching") int i3, @InterfaceC1501070pAH("school_id") String str3, @InterfaceC1501070pAH("mention_type") Integer num);
}
