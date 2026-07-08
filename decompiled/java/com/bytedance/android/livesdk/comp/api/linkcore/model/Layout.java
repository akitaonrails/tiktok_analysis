package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import X.C13LP;
import X.C2188811AlT;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class Layout {

    @C09CT("anchorZoomLayoutId")
    public String anchorZoomLayoutId;
    public String businessType;

    @C09CT("divideDataForAndroid")
    public Map<String, ? extends List<? extends RectF>> divideData;
    public final boolean isNormalType;

    @C09CT("overlay")
    public Integer isOverlay;

    @C09CT("layoutData")
    public Map<String, ? extends Map<String, LayoutArray>> layoutData;

    @C09CT("layoutId")
    public String layoutId;

    @C09CT("micCount")
    public int micCount;
    public Map<String, PatchLayout> patches;

    @C09CT("resolution")
    public Map<String, Resolution> resolutionMap;
    public int scene;

    @C09CT("type")
    public String type;
    public int version;

    @C09CT("view_for_audience")
    public Insets viewForAudience;

    @C09CT("view_for_canvas")
    public Insets viewForCanvas;

    @C09CT("view_for_link")
    public Insets viewForLink;

    @C09CT("view_for_pad")
    public Insets viewForPad;

    @C09CT("view_for_search")
    public Insets viewForSearch;

    @C09CT("zoomLayoutId")
    public String zoomLayoutId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return this.micCount == layout.micCount && Intrinsics.LJFF(this.type, layout.type) && Intrinsics.LJFF(this.layoutId, layout.layoutId) && Intrinsics.LJFF(this.zoomLayoutId, layout.zoomLayoutId) && Intrinsics.LJFF(this.anchorZoomLayoutId, layout.anchorZoomLayoutId) && Intrinsics.LJFF(this.viewForLink, layout.viewForLink) && Intrinsics.LJFF(this.viewForCanvas, layout.viewForCanvas) && Intrinsics.LJFF(this.viewForAudience, layout.viewForAudience) && Intrinsics.LJFF(this.viewForPad, layout.viewForPad) && Intrinsics.LJFF(this.viewForSearch, layout.viewForSearch) && Intrinsics.LJFF(this.layoutData, layout.layoutData) && Intrinsics.LJFF(this.divideData, layout.divideData) && Intrinsics.LJFF(this.resolutionMap, layout.resolutionMap) && this.scene == layout.scene && this.version == layout.version && this.isNormalType == layout.isNormalType && Intrinsics.LJFF(this.businessType, layout.businessType) && Intrinsics.LJFF(this.patches, layout.patches) && Intrinsics.LJFF(this.isOverlay, layout.isOverlay);
    }

    public String toString() {
        return "Layout(micCount=" + this.micCount + ", type=" + this.type + ", layoutId=" + this.layoutId + ", zoomLayoutId=" + this.zoomLayoutId + ", anchorZoomLayoutId=" + this.anchorZoomLayoutId + ", viewForLink=" + this.viewForLink + ", viewForCanvas=" + this.viewForCanvas + ", viewForAudience=" + this.viewForAudience + ", viewForPad=" + this.viewForPad + ", viewForSearch=" + this.viewForSearch + ", layoutData=" + this.layoutData + ", divideData=" + this.divideData + ", resolutionMap=" + this.resolutionMap + ", scene=" + this.scene + ", version=" + this.version + ", isNormalType=" + this.isNormalType + ", businessType=" + this.businessType + ", patches=" + this.patches + ", isOverlay=" + this.isOverlay + ')';
    }

    public final boolean isFixedType() {
        return Intrinsics.LJFF(this.type, "fix");
    }

    public final boolean isFloatType() {
        return Intrinsics.LJFF(this.type, "float");
    }

    public final boolean isNormalType() {
        return this.isNormalType;
    }

    public final Integer isOverlay() {
        return this.isOverlay;
    }

    private final LayoutArray getLayoutByFixPos(int i) {
        Map<String, LayoutArray> map;
        LayoutArrayList layoutMaskConfigListByOnlineMicCount = getLayoutMaskConfigListByOnlineMicCount(1);
        if (layoutMaskConfigListByOnlineMicCount != null && (map = layoutMaskConfigListByOnlineMicCount.indexLayoutArrayMap) != null) {
            return map.get(String.valueOf(i));
        }
        return null;
    }

    public final boolean dslEqual(Layout layout) {
        if (layout != null && layout.scene == this.scene && layout.version == this.version && Intrinsics.LJFF(layout.layoutId, this.layoutId)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList getLayoutMaskConfigListByOnlineMicCount(int r6) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>> r0 = r5.layoutData
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L40
            com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList r4 = new com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList
            java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>> r0 = r5.layoutData
            java.util.List r0 = X.C2097808Js.LJIL(r0)
            r3 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r2 = r0.getSecond()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Map<java.lang.String, ? extends java.util.List<? extends android.graphics.RectF>> r1 = r5.divideData
            if (r1 == 0) goto L3a
            java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>> r0 = r5.layoutData
            java.util.List r0 = X.C2097808Js.LJIL(r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L3c
        L3a:
            X.13BV r0 = X.C13BV.INSTANCE
        L3c:
            r4.<init>(r2, r0)
            return r4
        L40:
            java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray>> r1 = r5.layoutData
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r4 = 99
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            java.lang.Object r3 = r1.get(r0)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L7c
            com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList r2 = new com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList
            java.util.Map<java.lang.String, ? extends java.util.List<? extends android.graphics.RectF>> r1 = r5.divideData
            if (r1 == 0) goto L76
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L78
        L76:
            X.13BV r0 = X.C13BV.INSTANCE
        L78:
            r2.<init>(r3, r0)
            return r2
        L7c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.api.linkcore.model.Layout.getLayoutMaskConfigListByOnlineMicCount(int):com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList");
    }

    public final String getTargetLayoutData(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.layoutData.size() == 1) {
                return (String) ListProtector.get(C13LP.LLIIII(this.layoutData.keySet()), 0);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('c');
            sbLIZ.append(iIntValue);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public final void setAnchorZoomLayoutId(String str) {
        this.anchorZoomLayoutId = str;
    }

    public final void setBusinessType(String str) {
        this.businessType = str;
    }

    public final void setDivideData(Map<String, ? extends List<? extends RectF>> map) {
        this.divideData = map;
    }

    public final void setLayoutData(Map<String, ? extends Map<String, LayoutArray>> map) {
        this.layoutData = map;
    }

    public final void setLayoutId(String str) {
        this.layoutId = str;
    }

    public final void setMicCount(int i) {
        this.micCount = i;
    }

    public final void setOverlay(Integer num) {
        this.isOverlay = num;
    }

    public final void setPatches(Map<String, PatchLayout> map) {
        this.patches = map;
    }

    public final void setResolutionMap(Map<String, Resolution> map) {
        this.resolutionMap = map;
    }

    public final void setScene(int i) {
        this.scene = i;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setViewForAudience(Insets insets) {
        this.viewForAudience = insets;
    }

    public final void setViewForCanvas(Insets insets) {
        this.viewForCanvas = insets;
    }

    public final void setViewForLink(Insets insets) {
        this.viewForLink = insets;
    }

    public final void setViewForPad(Insets insets) {
        this.viewForPad = insets;
    }

    public final void setViewForSearch(Insets insets) {
        this.viewForSearch = insets;
    }

    public final void setZoomLayoutId(String str) {
        this.zoomLayoutId = str;
    }

    public final LayoutArray getLayoutByPosAndSize(int i, int i2) {
        Map<String, LayoutArray> map;
        if (isFixedType()) {
            return getLayoutByFixPos(i + 1);
        }
        LayoutArrayList layoutMaskConfigListByOnlineMicCount = getLayoutMaskConfigListByOnlineMicCount(i2);
        if (layoutMaskConfigListByOnlineMicCount != null && (map = layoutMaskConfigListByOnlineMicCount.indexLayoutArrayMap) != null) {
            return map.get(String.valueOf(i + 1));
        }
        return null;
    }

    public Layout(int i, String str, String str2, String str3, String str4, Insets insets, Insets insets2, Insets insets3, Insets insets4, Insets insets5, Map<String, ? extends Map<String, LayoutArray>> map, Map<String, ? extends List<? extends RectF>> map2, Map<String, Resolution> map3, int i2, int i3, boolean z, String str5, Map<String, PatchLayout> map4, Integer num) {
        this.micCount = i;
        this.type = str;
        this.layoutId = str2;
        this.zoomLayoutId = str3;
        this.anchorZoomLayoutId = str4;
        this.viewForLink = insets;
        this.viewForCanvas = insets2;
        this.viewForAudience = insets3;
        this.viewForPad = insets4;
        this.viewForSearch = insets5;
        this.layoutData = map;
        this.divideData = map2;
        this.resolutionMap = map3;
        this.scene = i2;
        this.version = i3;
        this.isNormalType = z;
        this.businessType = str5;
        this.patches = map4;
        this.isOverlay = num;
    }
}
