package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model;

import X.C09CT;
import X.C0PL2;
import X.C0PLT;
import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EComSearchStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchMixFeedBase extends C0PLT implements InterfaceC594520NTm {

    @C09CT("author_live_info")
    public final SingleLive authorLiveInfo;

    @C09CT("card_title")
    public String cardTitle;

    @C09CT("doc_type")
    public Integer docType;

    @C09CT("type")
    public int feedType;

    @C09CT("feedback_type")
    public String feedbackType;
    public C0PL2 insertType;

    @C09CT("multi_ad_card")
    public SearchInflowMultiAdCardStruct multiAdCard;

    @C09CT("single_product_card")
    public final EComSearchStruct productStruct;

    @C09CT("provider_doc_id_str")
    public String providerDocIdStr;

    @C09CT("rank")
    public int rank = -1;

    @C09CT("shop_card")
    public EComShopCardStruct shopCard;

    @C09CT("single_live")
    public final SingleLive singleLive;
    public Integer universalRank;

    public abstract Set<String> getAdCidList();

    public String getImprId() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.feedType), this.feedbackType, this.singleLive, this.authorLiveInfo, this.shopCard, this.productStruct, this.multiAdCard});
    }

    public boolean isCustomContent() {
        return false;
    }

    public final boolean isAdOrContainAd() {
        Set<String> adCidList = getAdCidList();
        return !(adCidList == null || adCidList.isEmpty());
    }

    @Override // X.C0PLT
    public int getFeedType() {
        return this.feedType;
    }

    public final C0PL2 getInsertType() {
        return this.insertType;
    }

    public final int getRawFeedType() {
        return this.feedType;
    }

    public final Integer getUniversalRank() {
        return this.universalRank;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(cls2, cls)) {
            return false;
        }
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) obj;
        if (!Intrinsics.LJFF(this.feedbackType, searchMixFeedBase.feedbackType) || !Intrinsics.LJFF(this.singleLive, searchMixFeedBase.singleLive) || !Intrinsics.LJFF(this.authorLiveInfo, searchMixFeedBase.authorLiveInfo) || !Intrinsics.LJFF(this.shopCard, searchMixFeedBase.shopCard) || !Intrinsics.LJFF(this.productStruct, searchMixFeedBase.productStruct) || !Intrinsics.LJFF(this.multiAdCard, searchMixFeedBase.multiAdCard)) {
            return false;
        }
        return true;
    }

    @Override // X.C0PLT
    public void setFeedType(int i) {
        this.feedType = i;
    }

    public final void setInsertType(C0PL2 c0pl2) {
        this.insertType = c0pl2;
    }

    public final void setUniversalRank(Integer num) {
        this.universalRank = num;
    }
}
