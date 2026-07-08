package com.ss.android.ugc.aweme.shortvideo.model;

import X.C13LP;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordSceneExtKt {
    public static final String getFilterCategoryKeysByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(127), 30);
    }

    public static final String getFilterDefaultInfoByModel(ShortVideoContext shortVideoContext, ArrayList<TimeSpeedModelExtension> arrayList) {
        String id;
        FilterBean filterBean = shortVideoContext.creativeModel.recordData.defaultFilter;
        if (filterBean != null) {
            id = filterBean.getId();
        } else {
            id = null;
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new AwS72S1000000_22(id, 4), 30);
    }

    public static final String isDefaultFilter(FilterBean filterBean, ShortVideoContext shortVideoContext) {
        String id;
        String id2 = filterBean.getId();
        FilterBean filterBean2 = shortVideoContext.creativeModel.recordData.defaultFilter;
        if (filterBean2 != null) {
            id = filterBean2.getId();
        } else {
            id = null;
        }
        if (Intrinsics.LJFF(id2, id)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final String getFilterDefaultInfoByModel(VideoPublishEditModel videoPublishEditModel, ArrayList<TimeSpeedModelExtension> arrayList) {
        String id;
        FilterBean filterBean = videoPublishEditModel.creativeModel.recordData.defaultFilter;
        if (filterBean != null) {
            id = filterBean.getId();
        } else {
            id = null;
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new AwS72S1000000_22(id, 5), 30);
    }
}
