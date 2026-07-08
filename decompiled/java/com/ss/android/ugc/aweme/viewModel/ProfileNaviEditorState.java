package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C19425510zF;
import X.C19427910zd;
import X.C786410Ut5;
import X.InterfaceC19402510vX;
import X.InterfaceC19403010vc;
import X.InterfaceC19423310yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviEditorState implements C004I {
    public final C19427910zd currentMessage;
    public final InterfaceC19402510vX currentProfileNaviSelectable;
    public final int currentTabIndex;
    public final C19425510zF editCategory;
    public final int fps;
    public final boolean fromAutoCreation;
    public final boolean hasEdited;
    public final boolean isHeadLoaded;
    public final boolean isQuitEditing;
    public final boolean isScanEffectLoaded;
    public final boolean isSceneEffectLoaded;
    public final boolean naviDoneLoading;
    public final List<InterfaceC19403010vc> parentCategoryList;
    public final String scanStickerPath;
    public final String sceneStickerPath;
    public final List<InterfaceC19423310yt> tabList;

    public ProfileNaviEditorState() {
        this(null, 0, null, null, null, null, null, false, false, false, false, false, false, false, 24, null);
    }

    public final ProfileNaviEditorState copy(List<? extends InterfaceC19423310yt> list, int i, List<? extends InterfaceC19403010vc> list2, C19427910zd c19427910zd, String str, String str2, C19425510zF c19425510zF, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, InterfaceC19402510vX interfaceC19402510vX) {
        return new ProfileNaviEditorState(list, i, list2, c19427910zd, str, str2, c19425510zF, z, z2, z3, z4, z5, z6, z7, i2, interfaceC19402510vX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviEditorState)) {
            return false;
        }
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) obj;
        return Intrinsics.LJFF(this.tabList, profileNaviEditorState.tabList) && this.currentTabIndex == profileNaviEditorState.currentTabIndex && Intrinsics.LJFF(this.parentCategoryList, profileNaviEditorState.parentCategoryList) && Intrinsics.LJFF(this.currentMessage, profileNaviEditorState.currentMessage) && Intrinsics.LJFF(this.sceneStickerPath, profileNaviEditorState.sceneStickerPath) && Intrinsics.LJFF(this.scanStickerPath, profileNaviEditorState.scanStickerPath) && Intrinsics.LJFF(this.editCategory, profileNaviEditorState.editCategory) && this.naviDoneLoading == profileNaviEditorState.naviDoneLoading && this.isQuitEditing == profileNaviEditorState.isQuitEditing && this.isScanEffectLoaded == profileNaviEditorState.isScanEffectLoaded && this.isSceneEffectLoaded == profileNaviEditorState.isSceneEffectLoaded && this.hasEdited == profileNaviEditorState.hasEdited && this.fromAutoCreation == profileNaviEditorState.fromAutoCreation && this.isHeadLoaded == profileNaviEditorState.isHeadLoaded && this.fps == profileNaviEditorState.fps && Intrinsics.LJFF(this.currentProfileNaviSelectable, profileNaviEditorState.currentProfileNaviSelectable);
    }

    public int hashCode() {
        List<InterfaceC19423310yt> list = this.tabList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.currentTabIndex) * 31;
        List<InterfaceC19403010vc> list2 = this.parentCategoryList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        C19427910zd c19427910zd = this.currentMessage;
        int iHashCode3 = (iHashCode2 + (c19427910zd == null ? 0 : c19427910zd.hashCode())) * 31;
        String str = this.sceneStickerPath;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scanStickerPath;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C19425510zF c19425510zF = this.editCategory;
        int iHashCode6 = (((((((((((((((((iHashCode5 + (c19425510zF == null ? 0 : c19425510zF.hashCode())) * 31) + C786410Ut5.Z2(this.naviDoneLoading)) * 31) + C786410Ut5.Z2(this.isQuitEditing)) * 31) + C786410Ut5.Z2(this.isScanEffectLoaded)) * 31) + C786410Ut5.Z2(this.isSceneEffectLoaded)) * 31) + C786410Ut5.Z2(this.hasEdited)) * 31) + C786410Ut5.Z2(this.fromAutoCreation)) * 31) + C786410Ut5.Z2(this.isHeadLoaded)) * 31) + this.fps) * 31;
        InterfaceC19402510vX interfaceC19402510vX = this.currentProfileNaviSelectable;
        return iHashCode6 + (interfaceC19402510vX != null ? interfaceC19402510vX.hashCode() : 0);
    }

    public String toString() {
        return "ProfileNaviEditorState(tabList=" + this.tabList + ", currentTabIndex=" + this.currentTabIndex + ", parentCategoryList=" + this.parentCategoryList + ", currentMessage=" + this.currentMessage + ", sceneStickerPath=" + this.sceneStickerPath + ", scanStickerPath=" + this.scanStickerPath + ", editCategory=" + this.editCategory + ", naviDoneLoading=" + this.naviDoneLoading + ", isQuitEditing=" + this.isQuitEditing + ", isScanEffectLoaded=" + this.isScanEffectLoaded + ", isSceneEffectLoaded=" + this.isSceneEffectLoaded + ", hasEdited=" + this.hasEdited + ", fromAutoCreation=" + this.fromAutoCreation + ", isHeadLoaded=" + this.isHeadLoaded + ", fps=" + this.fps + ", currentProfileNaviSelectable=" + this.currentProfileNaviSelectable + ')';
    }

    public final C19427910zd getCurrentMessage() {
        return this.currentMessage;
    }

    public final InterfaceC19402510vX getCurrentProfileNaviSelectable() {
        return this.currentProfileNaviSelectable;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final C19425510zF getEditCategory() {
        return this.editCategory;
    }

    public final int getFps() {
        return this.fps;
    }

    public final boolean getFromAutoCreation() {
        return this.fromAutoCreation;
    }

    public final boolean getHasEdited() {
        return this.hasEdited;
    }

    public final boolean getNaviDoneLoading() {
        return this.naviDoneLoading;
    }

    public final List<InterfaceC19403010vc> getParentCategoryList() {
        return this.parentCategoryList;
    }

    public final String getScanStickerPath() {
        return this.scanStickerPath;
    }

    public final String getSceneStickerPath() {
        return this.sceneStickerPath;
    }

    public final List<InterfaceC19423310yt> getTabList() {
        return this.tabList;
    }

    public final boolean isHeadLoaded() {
        return this.isHeadLoaded;
    }

    public final boolean isQuitEditing() {
        return this.isQuitEditing;
    }

    public final boolean isScanEffectLoaded() {
        return this.isScanEffectLoaded;
    }

    public final boolean isSceneEffectLoaded() {
        return this.isSceneEffectLoaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileNaviEditorState(List<? extends InterfaceC19423310yt> list, int i, List<? extends InterfaceC19403010vc> list2, C19427910zd c19427910zd, String str, String str2, C19425510zF c19425510zF, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, InterfaceC19402510vX interfaceC19402510vX) {
        this.tabList = list;
        this.currentTabIndex = i;
        this.parentCategoryList = list2;
        this.currentMessage = c19427910zd;
        this.sceneStickerPath = str;
        this.scanStickerPath = str2;
        this.editCategory = c19425510zF;
        this.naviDoneLoading = z;
        this.isQuitEditing = z2;
        this.isScanEffectLoaded = z3;
        this.isSceneEffectLoaded = z4;
        this.hasEdited = z5;
        this.fromAutoCreation = z6;
        this.isHeadLoaded = z7;
        this.fps = i2;
        this.currentProfileNaviSelectable = interfaceC19402510vX;
    }
}
