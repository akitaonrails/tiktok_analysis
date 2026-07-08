package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C0C8Z;
import X.C0R1M;
import com.ss.android.ugc.aweme.search.smartsearch.model.RectangleF;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class VisualSearchResultPageModel implements Serializable {
    public final String apiControlInfo;

    @C09CT("bitmap_byte_array_preload_key")
    public final String bitmapByteArrayPreloadKey;

    @C09CT("bitmap_compress_scene")
    public final C0R1M bitmapCompressScene;
    public final Integer disableEcomContentType;
    public final boolean enableCircleMiddlePage;
    public final float initialScreenRatio;
    public final boolean needJumpToShop;
    public final boolean needJumpToShopWithoutMMOD;

    @C09CT("rectangle")
    public final RectangleF rectangle;
    public final boolean showMMODRectFromCircle;
    public final boolean showQuestionIcon;
    public final boolean supportAutoPlay;
    public final boolean supportVisualHistory;
    public final String visualSearchAboutPageKey;

    public VisualSearchResultPageModel() {
        this(true, C0C8Z.COMMON.getValue(), false, false, true, null, true, 0.6f, false, null, null, null, null, true);
    }

    public final VisualSearchResultPageModel copy(boolean z, String str, boolean z2, boolean z3, boolean z4, RectangleF rectangleF, boolean z5, float f, boolean z6, Integer num, String str2, String str3, C0R1M c0r1m, boolean z7) {
        return new VisualSearchResultPageModel(z, str, z2, z3, z4, rectangleF, z5, f, z6, num, str2, str3, c0r1m, z7);
    }

    public VisualSearchResultPageModel(boolean z, String str, boolean z2, boolean z3, boolean z4, RectangleF rectangleF, boolean z5, float f, boolean z6, Integer num, String str2, String str3, C0R1M c0r1m, boolean z7) {
        this.showQuestionIcon = z;
        this.visualSearchAboutPageKey = str;
        this.needJumpToShop = z2;
        this.needJumpToShopWithoutMMOD = z3;
        this.supportVisualHistory = z4;
        this.rectangle = rectangleF;
        this.showMMODRectFromCircle = z5;
        this.initialScreenRatio = f;
        this.enableCircleMiddlePage = z6;
        this.disableEcomContentType = num;
        this.apiControlInfo = str2;
        this.bitmapByteArrayPreloadKey = str3;
        this.bitmapCompressScene = c0r1m;
        this.supportAutoPlay = z7;
    }
}
