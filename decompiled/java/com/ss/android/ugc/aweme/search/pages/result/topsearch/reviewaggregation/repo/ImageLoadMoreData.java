package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.C09CT;
import X.C1227904rF;
import X.C15438062q;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageLoadMoreData implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;
    public List<ImageData> imageDataList;

    @C09CT("image_data_list")
    public final List<Map<?, ?>> imageDataListRawData;

    @C09CT("total")
    public final Integer total;
    public List<? extends Map<?, ?>> validImageListRawData;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<? extends java.util.Map<?, ?>>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List, java.util.List<? extends java.util.Map<?, ?>>] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public final void initProcessImageList() {
        ?? arrayList = this.validImageListRawData;
        ArrayList arrayList2 = null;
        if (arrayList == 0) {
            List<Map<?, ?>> list = this.imageDataListRawData;
            if (list != null) {
                arrayList = new ArrayList();
                for (Map<?, ?> map : list) {
                    if (map != null && (!map.isEmpty())) {
                        arrayList.add(map);
                    }
                }
            } else {
                arrayList = 0;
            }
        }
        this.validImageListRawData = arrayList;
        try {
            List<ImageData> list2 = this.imageDataList;
            if (list2 == null) {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                if (arrayList != 0) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (Map map2 : arrayList) {
                        c1227904rF.getClass();
                        arrayList2.add((ImageData) C1227904rF.LIZIZ(C1227904rF.LJI(map2), ImageData.class));
                    }
                }
                list2 = arrayList2;
            }
            this.imageDataList = list2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void setImageDataList(List<ImageData> list) {
        this.imageDataList = list;
    }

    public final void setValidImageListRawData(List<? extends Map<?, ?>> list) {
        this.validImageListRawData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageLoadMoreData(List<? extends Map<?, ?>> list, List<? extends Aweme> list2, Integer num, Integer num2, Boolean bool) {
        this.imageDataListRawData = list;
        this.awemeList = list2;
        this.total = num;
        this.cursor = num2;
        this.hasMore = bool;
    }
}
