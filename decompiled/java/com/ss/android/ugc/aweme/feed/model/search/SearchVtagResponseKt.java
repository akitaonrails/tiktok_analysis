package com.ss.android.ugc.aweme.feed.model.search;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchVtagResponseKt {
    public static final boolean isBBoxValid(TagBoundBoxStruct tagBoundBoxStruct) {
        if (tagBoundBoxStruct != null && safeFloat(tagBoundBoxStruct.xmin) >= 0.0f && safeFloat(tagBoundBoxStruct.ymin) >= 0.0f && safeFloat(tagBoundBoxStruct.xmax) >= 0.0f && safeFloat(tagBoundBoxStruct.ymax) >= 0.0f && safeFloat(tagBoundBoxStruct.xmin) <= 1.0f && safeFloat(tagBoundBoxStruct.ymin) <= 1.0f && safeFloat(tagBoundBoxStruct.xmax) <= 1.0f && safeFloat(tagBoundBoxStruct.ymax) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final float safeFloat(Float f) {
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }
}
