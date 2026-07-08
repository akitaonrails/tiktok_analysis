package com.ss.android.ugc.aweme.videoadaption.adaptionhandler;

import X.C2188811AlT;
import X.InterfaceC1874070yrt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FeedScreenContext implements InterfaceC1874070yrt {
    public final float bottomBannerHeight;
    public final float bottomTabHeight;
    public final List<Integer> bottomTypeList;
    public final float screenHeight;
    public final float screenWidth;
    public final float statusBarHeight;
    public final float topTabHeight;
    public final List<Integer> topTypeList;

    public final FeedScreenContext copy(float f, float f2, float f3, float f4, float f5, float f6, List<Integer> list, List<Integer> list2) {
        return new FeedScreenContext(f, f2, f3, f4, f5, f6, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedScreenContext)) {
            return false;
        }
        FeedScreenContext feedScreenContext = (FeedScreenContext) obj;
        return Float.compare(this.statusBarHeight, feedScreenContext.statusBarHeight) == 0 && Float.compare(this.screenWidth, feedScreenContext.screenWidth) == 0 && Float.compare(this.screenHeight, feedScreenContext.screenHeight) == 0 && Float.compare(this.topTabHeight, feedScreenContext.topTabHeight) == 0 && Float.compare(this.bottomBannerHeight, feedScreenContext.bottomBannerHeight) == 0 && Float.compare(this.bottomTabHeight, feedScreenContext.bottomTabHeight) == 0 && Intrinsics.LJFF(this.topTypeList, feedScreenContext.topTypeList) && Intrinsics.LJFF(this.bottomTypeList, feedScreenContext.bottomTypeList);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedScreenContext(statusBarHeight=");
        sbLIZ.append(this.statusBarHeight);
        sbLIZ.append(", screenWidth=");
        sbLIZ.append(this.screenWidth);
        sbLIZ.append(", screenHeight=");
        sbLIZ.append(this.screenHeight);
        sbLIZ.append(", topTabHeight=");
        sbLIZ.append(this.topTabHeight);
        sbLIZ.append(", bottomBannerHeight=");
        sbLIZ.append(this.bottomBannerHeight);
        sbLIZ.append(", bottomTabHeight=");
        sbLIZ.append(this.bottomTabHeight);
        sbLIZ.append(", topTypeList=");
        sbLIZ.append(this.topTypeList);
        sbLIZ.append(", bottomTypeList=");
        sbLIZ.append(this.bottomTypeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.statusBarHeight) * 31) + Float.floatToIntBits(this.screenWidth)) * 31) + Float.floatToIntBits(this.screenHeight)) * 31) + Float.floatToIntBits(this.topTabHeight)) * 31) + Float.floatToIntBits(this.bottomBannerHeight)) * 31) + Float.floatToIntBits(this.bottomTabHeight)) * 31) + this.topTypeList.hashCode()) * 31) + this.bottomTypeList.hashCode();
    }

    @Override // X.InterfaceC1874070yrt
    public float getBottomBannerHeight() {
        return this.bottomBannerHeight;
    }

    @Override // X.InterfaceC1874070yrt
    public float getBottomTabHeight() {
        return this.bottomTabHeight;
    }

    @Override // X.InterfaceC1874070yrt
    public List<Integer> getBottomTypeList() {
        return this.bottomTypeList;
    }

    @Override // X.InterfaceC1874070yrt
    public float getScreenHeight() {
        return this.screenHeight;
    }

    @Override // X.InterfaceC1874070yrt
    public float getScreenWidth() {
        return this.screenWidth;
    }

    @Override // X.InterfaceC1874070yrt
    public float getStatusBarHeight() {
        return this.statusBarHeight;
    }

    @Override // X.InterfaceC1874070yrt
    public float getTopTabHeight() {
        return this.topTabHeight;
    }

    @Override // X.InterfaceC1874070yrt
    public List<Integer> getTopTypeList() {
        return this.topTypeList;
    }

    public FeedScreenContext(float f, float f2, float f3, float f4, float f5, float f6, List<Integer> list, List<Integer> list2) {
        this.statusBarHeight = f;
        this.screenWidth = f2;
        this.screenHeight = f3;
        this.topTabHeight = f4;
        this.bottomBannerHeight = f5;
        this.bottomTabHeight = f6;
        this.topTypeList = list;
        this.bottomTypeList = list2;
    }
}
