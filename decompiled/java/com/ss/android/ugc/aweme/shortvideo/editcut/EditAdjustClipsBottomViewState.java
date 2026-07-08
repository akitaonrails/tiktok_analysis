package com.ss.android.ugc.aweme.shortvideo.editcut;

import X.C004I;
import X.C0LCS;
import X.C12WF;
import X.C1463610oBr;
import X.C1644450stX;
import X.C529150Kp7;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EditAdjustClipsBottomViewState implements C004I {
    public final C0LCS<List<VideoSegment>> addVideosEvent;
    public final int currentEditIndex;
    public final int currentEditOriginIndex;
    public final int currentTabIndex;
    public final C1644450stX<Integer, VideoSegment> deleteVideoEvent;
    public final Integer editState;
    public final Boolean focusEditMode;
    public final Boolean isMusicSyncMode;
    public final C529150Kp7 modeChangeEvent;
    public final C0LCS<C1463610oBr> restoreEditEvent;
    public final C529150Kp7 restoreMusicSyncEvent;
    public final Float scale;
    public final C529150Kp7 seekDoneEvent;
    public final Float selectTime;
    public final int stickPointStatus;
    public final C1644450stX<Integer, VideoSegment> updateVideoEvent;
    public static final C12WF Companion = new Object() { // from class: X.12WF
    };
    public static final int $stable = 8;

    public EditAdjustClipsBottomViewState() {
        this(0, 0, 1, 1, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final EditAdjustClipsBottomViewState copy(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, C1644450stX<Integer, VideoSegment> c1644450stX, C1644450stX<Integer, VideoSegment> c1644450stX2, C0LCS<C1463610oBr> c0lcs, C0LCS<? extends List<? extends VideoSegment>> c0lcs2, C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73) {
        return new EditAdjustClipsBottomViewState(i, i2, i3, i4, bool, f, f2, num, bool2, c1644450stX, c1644450stX2, c0lcs, c0lcs2, c529150Kp7, c529150Kp72, c529150Kp73);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsBottomViewState)) {
            return false;
        }
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return this.currentEditIndex == editAdjustClipsBottomViewState.currentEditIndex && this.currentEditOriginIndex == editAdjustClipsBottomViewState.currentEditOriginIndex && this.currentTabIndex == editAdjustClipsBottomViewState.currentTabIndex && this.stickPointStatus == editAdjustClipsBottomViewState.stickPointStatus && Intrinsics.LJFF(this.isMusicSyncMode, editAdjustClipsBottomViewState.isMusicSyncMode) && Intrinsics.LJFF(this.scale, editAdjustClipsBottomViewState.scale) && Intrinsics.LJFF(this.selectTime, editAdjustClipsBottomViewState.selectTime) && Intrinsics.LJFF(this.editState, editAdjustClipsBottomViewState.editState) && Intrinsics.LJFF(this.focusEditMode, editAdjustClipsBottomViewState.focusEditMode) && Intrinsics.LJFF(this.deleteVideoEvent, editAdjustClipsBottomViewState.deleteVideoEvent) && Intrinsics.LJFF(this.updateVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent) && Intrinsics.LJFF(this.restoreEditEvent, editAdjustClipsBottomViewState.restoreEditEvent) && Intrinsics.LJFF(this.addVideosEvent, editAdjustClipsBottomViewState.addVideosEvent) && Intrinsics.LJFF(this.modeChangeEvent, editAdjustClipsBottomViewState.modeChangeEvent) && Intrinsics.LJFF(this.seekDoneEvent, editAdjustClipsBottomViewState.seekDoneEvent) && Intrinsics.LJFF(this.restoreMusicSyncEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public int hashCode() {
        int i = ((((((this.currentEditIndex * 31) + this.currentEditOriginIndex) * 31) + this.currentTabIndex) * 31) + this.stickPointStatus) * 31;
        Boolean bool = this.isMusicSyncMode;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.scale;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.selectTime;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.editState;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.focusEditMode;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C1644450stX<Integer, VideoSegment> c1644450stX = this.deleteVideoEvent;
        int iHashCode6 = (iHashCode5 + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C1644450stX<Integer, VideoSegment> c1644450stX2 = this.updateVideoEvent;
        int iHashCode7 = (iHashCode6 + (c1644450stX2 == null ? 0 : c1644450stX2.hashCode())) * 31;
        C0LCS<C1463610oBr> c0lcs = this.restoreEditEvent;
        int iHashCode8 = (iHashCode7 + (c0lcs == null ? 0 : c0lcs.hashCode())) * 31;
        C0LCS<List<VideoSegment>> c0lcs2 = this.addVideosEvent;
        int iHashCode9 = (iHashCode8 + (c0lcs2 == null ? 0 : c0lcs2.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.modeChangeEvent;
        int iHashCode10 = (iHashCode9 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.seekDoneEvent;
        int iHashCode11 = (iHashCode10 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.restoreMusicSyncEvent;
        return iHashCode11 + (c529150Kp73 != null ? c529150Kp73.hashCode() : 0);
    }

    public String toString() {
        return "EditAdjustClipsBottomViewState(currentEditIndex=" + this.currentEditIndex + ", currentEditOriginIndex=" + this.currentEditOriginIndex + ", currentTabIndex=" + this.currentTabIndex + ", stickPointStatus=" + this.stickPointStatus + ", isMusicSyncMode=" + this.isMusicSyncMode + ", scale=" + this.scale + ", selectTime=" + this.selectTime + ", editState=" + this.editState + ", focusEditMode=" + this.focusEditMode + ", deleteVideoEvent=" + this.deleteVideoEvent + ", updateVideoEvent=" + this.updateVideoEvent + ", restoreEditEvent=" + this.restoreEditEvent + ", addVideosEvent=" + this.addVideosEvent + ", modeChangeEvent=" + this.modeChangeEvent + ", seekDoneEvent=" + this.seekDoneEvent + ", restoreMusicSyncEvent=" + this.restoreMusicSyncEvent + ')';
    }

    public final C0LCS<List<VideoSegment>> getAddVideosEvent() {
        return this.addVideosEvent;
    }

    public final int getCurrentEditIndex() {
        return this.currentEditIndex;
    }

    public final int getCurrentEditOriginIndex() {
        return this.currentEditOriginIndex;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final C1644450stX<Integer, VideoSegment> getDeleteVideoEvent() {
        return this.deleteVideoEvent;
    }

    public final Integer getEditState() {
        return this.editState;
    }

    public final Boolean getFocusEditMode() {
        return this.focusEditMode;
    }

    public final C529150Kp7 getModeChangeEvent() {
        return this.modeChangeEvent;
    }

    public final C0LCS<C1463610oBr> getRestoreEditEvent() {
        return this.restoreEditEvent;
    }

    public final C529150Kp7 getRestoreMusicSyncEvent() {
        return this.restoreMusicSyncEvent;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final C529150Kp7 getSeekDoneEvent() {
        return this.seekDoneEvent;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final int getStickPointStatus() {
        return this.stickPointStatus;
    }

    public final C1644450stX<Integer, VideoSegment> getUpdateVideoEvent() {
        return this.updateVideoEvent;
    }

    public final Boolean isMusicSyncMode() {
        return this.isMusicSyncMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditAdjustClipsBottomViewState(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, C1644450stX<Integer, VideoSegment> c1644450stX, C1644450stX<Integer, VideoSegment> c1644450stX2, C0LCS<C1463610oBr> c0lcs, C0LCS<? extends List<? extends VideoSegment>> c0lcs2, C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73) {
        this.currentEditIndex = i;
        this.currentEditOriginIndex = i2;
        this.currentTabIndex = i3;
        this.stickPointStatus = i4;
        this.isMusicSyncMode = bool;
        this.scale = f;
        this.selectTime = f2;
        this.editState = num;
        this.focusEditMode = bool2;
        this.deleteVideoEvent = c1644450stX;
        this.updateVideoEvent = c1644450stX2;
        this.restoreEditEvent = c0lcs;
        this.addVideosEvent = c0lcs2;
        this.modeChangeEvent = c529150Kp7;
        this.seekDoneEvent = c529150Kp72;
        this.restoreMusicSyncEvent = c529150Kp73;
    }
}
