package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1LoadMoreStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FusionCard implements Serializable {
    public transient Map<String, ? extends Aweme> awemeMap;

    @C09CT("global_item_list")
    public final List<Aweme> globalItemList;

    @C09CT("global_ref_source")
    public final List<RefSource> globalRefSource;

    @C09CT("landing_page")
    public final FusionPage landingPage;

    @C09CT("load_more_struct")
    public final Top1LoadMoreStruct loadMoreStruct;

    @C09CT("middle_page")
    public final FusionPage middlePage;

    @C09CT("result_page")
    public final FusionPage resultPage;

    public FusionCard() {
        this(null, null, null, null, null, null);
    }

    public final FusionCard copy(FusionPage fusionPage, FusionPage fusionPage2, FusionPage fusionPage3, List<? extends Aweme> list, List<RefSource> list2, Top1LoadMoreStruct top1LoadMoreStruct) {
        return new FusionCard(fusionPage, fusionPage2, fusionPage3, list, list2, top1LoadMoreStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FusionCard)) {
            return false;
        }
        FusionCard fusionCard = (FusionCard) obj;
        return Intrinsics.LJFF(this.resultPage, fusionCard.resultPage) && Intrinsics.LJFF(this.landingPage, fusionCard.landingPage) && Intrinsics.LJFF(this.middlePage, fusionCard.middlePage) && Intrinsics.LJFF(this.globalItemList, fusionCard.globalItemList) && Intrinsics.LJFF(this.globalRefSource, fusionCard.globalRefSource) && Intrinsics.LJFF(this.loadMoreStruct, fusionCard.loadMoreStruct);
    }

    public int hashCode() {
        FusionPage fusionPage = this.resultPage;
        int iHashCode = (fusionPage == null ? 0 : fusionPage.hashCode()) * 31;
        FusionPage fusionPage2 = this.landingPage;
        int iHashCode2 = (iHashCode + (fusionPage2 == null ? 0 : fusionPage2.hashCode())) * 31;
        FusionPage fusionPage3 = this.middlePage;
        int iHashCode3 = (iHashCode2 + (fusionPage3 == null ? 0 : fusionPage3.hashCode())) * 31;
        List<Aweme> list = this.globalItemList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<RefSource> list2 = this.globalRefSource;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Top1LoadMoreStruct top1LoadMoreStruct = this.loadMoreStruct;
        return iHashCode5 + (top1LoadMoreStruct != null ? top1LoadMoreStruct.hashCode() : 0);
    }

    public final boolean hasNimbleCard() {
        List<FusionBlock> list;
        FusionPage fusionPage = this.resultPage;
        if (fusionPage == null || (list = fusionPage.blocks) == null || list.isEmpty()) {
            return false;
        }
        Iterator<FusionBlock> it2 = list.iterator();
        while (it2.hasNext()) {
            String layoutName = it2.next().getLayoutName();
            if (layoutName != null && layoutName.length() != 0) {
                return true;
            }
        }
        return false;
    }

    public final Aweme findAwemeById(String str) {
        Map<String, ? extends Aweme> map;
        if (str == null || (map = this.awemeMap) == null) {
            return null;
        }
        return map.get(str);
    }

    public final List<Aweme> findAwemeByIds(List<? extends Object> list) {
        Aweme aweme;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Map<String, ? extends Aweme> map = this.awemeMap;
                if (map != null && (aweme = map.get(String.valueOf(obj))) != null) {
                    arrayList.add(aweme);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final void setAwemeMap(Map<String, ? extends Aweme> map) {
        this.awemeMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FusionCard(FusionPage fusionPage, FusionPage fusionPage2, FusionPage fusionPage3, List<? extends Aweme> list, List<RefSource> list2, Top1LoadMoreStruct top1LoadMoreStruct) {
        this.resultPage = fusionPage;
        this.landingPage = fusionPage2;
        this.middlePage = fusionPage3;
        this.globalItemList = list;
        this.globalRefSource = list2;
        this.loadMoreStruct = top1LoadMoreStruct;
    }
}
