package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.common;

import X.C510280Jzm;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeSheetOptions implements Parcelable {
    public static final C510280Jzm Companion = new Object() { // from class: X.0Jzm
    };
    public boolean closePerceptible;
    public int closeTintColor;
    public boolean closeTintColorSet;
    public float expandedHeightRatio;
    public boolean isFullscreenEnabled;
    public boolean isHeaderFloating;
    public boolean navigateUpPerceptible;
    public int navigateUpTintColor;
    public boolean navigateUpTintColorSet;
    public int height = -1;
    public int maxHeight = -1;
    public int expandedHeight = -1;
    public boolean draggable = true;
    public int sheetStyle = 0;
    public float heightRatio = 0.0f;
    public float maxHeightRatio = 0.6f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sheetStyle);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.heightRatio);
        parcel.writeInt(this.maxHeight);
        parcel.writeFloat(this.maxHeightRatio);
        parcel.writeByte(this.draggable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFullscreenEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.closePerceptible ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.navigateUpPerceptible ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.navigateUpTintColor);
        parcel.writeInt(this.closeTintColor);
        parcel.writeByte(this.navigateUpTintColorSet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.closeTintColorSet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isHeaderFloating ? (byte) 1 : (byte) 0);
    }
}
