package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PatchLayout {

    @C09CT("anchorZoomLayoutId")
    public String anchorZoomLayoutId;

    @C09CT("divideDataForAndroid")
    public Map<String, ? extends List<? extends RectF>> divideData;

    @C09CT("overlay")
    public Integer isOverlay;

    @C09CT("layoutData")
    public Map<String, ? extends Map<String, LayoutArray>> layoutData;

    @C09CT("layoutId")
    public String layoutId;

    @C09CT("micCount")
    public Integer micCount;

    @C09CT("resolution")
    public Map<String, Resolution> resolutionMap;

    @C09CT("type")
    public String type;

    @C09CT("view_for_audience")
    public Insets viewForAudience;

    @C09CT("view_for_canvas")
    public Insets viewForCanvas;

    @C09CT("view_for_link")
    public Insets viewForLink;

    @C09CT("view_for_pad")
    public Insets viewForPad;

    @C09CT("view_for_search")
    public final Insets viewForSearch;

    @C09CT("zoomLayoutId")
    public String zoomLayoutId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatchLayout)) {
            return false;
        }
        PatchLayout patchLayout = (PatchLayout) obj;
        return Intrinsics.LJFF(this.micCount, patchLayout.micCount) && Intrinsics.LJFF(this.type, patchLayout.type) && Intrinsics.LJFF(this.layoutId, patchLayout.layoutId) && Intrinsics.LJFF(this.zoomLayoutId, patchLayout.zoomLayoutId) && Intrinsics.LJFF(this.anchorZoomLayoutId, patchLayout.anchorZoomLayoutId) && Intrinsics.LJFF(this.viewForLink, patchLayout.viewForLink) && Intrinsics.LJFF(this.viewForCanvas, patchLayout.viewForCanvas) && Intrinsics.LJFF(this.viewForAudience, patchLayout.viewForAudience) && Intrinsics.LJFF(this.viewForPad, patchLayout.viewForPad) && Intrinsics.LJFF(this.viewForSearch, patchLayout.viewForSearch) && Intrinsics.LJFF(this.layoutData, patchLayout.layoutData) && Intrinsics.LJFF(this.divideData, patchLayout.divideData) && Intrinsics.LJFF(this.resolutionMap, patchLayout.resolutionMap) && Intrinsics.LJFF(this.isOverlay, patchLayout.isOverlay);
    }

    public String toString() {
        return "PatchLayout(micCount=" + this.micCount + ", type=" + this.type + ", layoutId=" + this.layoutId + ", zoomLayoutId=" + this.zoomLayoutId + ", anchorZoomLayoutId=" + this.anchorZoomLayoutId + ", viewForLink=" + this.viewForLink + ", viewForCanvas=" + this.viewForCanvas + ", viewForAudience=" + this.viewForAudience + ", viewForPad=" + this.viewForPad + ", viewForSearch=" + this.viewForSearch + ", layoutData=" + this.layoutData + ", divideData=" + this.divideData + ", resolutionMap=" + this.resolutionMap + ", isOverlay=" + this.isOverlay + ')';
    }

    public final Integer isOverlay() {
        return this.isOverlay;
    }

    public final void setAnchorZoomLayoutId(String str) {
        this.anchorZoomLayoutId = str;
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

    public final void setMicCount(Integer num) {
        this.micCount = num;
    }

    public final void setOverlay(Integer num) {
        this.isOverlay = num;
    }

    public final void setResolutionMap(Map<String, Resolution> map) {
        this.resolutionMap = map;
    }

    public final void setType(String str) {
        this.type = str;
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

    public final void setZoomLayoutId(String str) {
        this.zoomLayoutId = str;
    }

    public PatchLayout(Integer num, String str, String str2, String str3, String str4, Insets insets, Insets insets2, Insets insets3, Insets insets4, Insets insets5, Map<String, ? extends Map<String, LayoutArray>> map, Map<String, ? extends List<? extends RectF>> map2, Map<String, Resolution> map3, Integer num2) {
        this.micCount = num;
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
        this.isOverlay = num2;
    }
}
