package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C1DPZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.StickerMobParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class StickerMobParams implements Serializable, Parcelable {

    @C09CT("creationId")
    public String creationId;

    @C09CT("customCutoutModelType")
    public int customCutoutModelType;

    @C09CT("customStickerEntrance")
    public String customStickerEntrance;

    @C09CT("isCrop")
    public boolean isCrop;

    @C09CT("isCutout")
    public boolean isCutout;

    @C09CT("panelPosition")
    public int panelPosition;

    @C09CT("propId")
    public String propId;

    @C09CT("selectFrom")
    public String selectFrom;

    @C09CT("shootWay")
    public String shootWay;

    @C09CT("stickerType")
    public String stickerType;

    @C09CT("tabName")
    public String tabName;
    public static final C1DPZ Companion = new Object() { // from class: X.1DPZ
    };
    public static final Parcelable.Creator<StickerMobParams> CREATOR = new Parcelable.Creator<StickerMobParams>() { // from class: X.1DPY
        @Override // android.os.Parcelable.Creator
        public final StickerMobParams createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new StickerMobParams(string, string2, i, string3, string4, string5, string6, z, z2, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StickerMobParams[] newArray(int i) {
            return new StickerMobParams[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.selectFrom);
        parcel.writeString(this.stickerType);
        parcel.writeInt(this.panelPosition);
        parcel.writeString(this.tabName);
        parcel.writeString(this.creationId);
        parcel.writeString(this.propId);
        parcel.writeString(this.shootWay);
        parcel.writeInt(this.isCutout ? 1 : 0);
        parcel.writeInt(this.isCrop ? 1 : 0);
        parcel.writeString(this.customStickerEntrance);
        parcel.writeInt(this.customCutoutModelType);
    }

    public StickerMobParams() {
        this("", "", -1, "", "", "", "", false, false, "", -1);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getCustomCutoutModelType() {
        return this.customCutoutModelType;
    }

    public final String getCustomStickerEntrance() {
        return this.customStickerEntrance;
    }

    public final int getPanelPosition() {
        return this.panelPosition;
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getSelectFrom() {
        return this.selectFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStickerType() {
        return this.stickerType;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final boolean isCrop() {
        return this.isCrop;
    }

    public final boolean isCutout() {
        return this.isCutout;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setCrop(boolean z) {
        this.isCrop = z;
    }

    public final void setCustomCutoutModelType(int i) {
        this.customCutoutModelType = i;
    }

    public final void setCustomStickerEntrance(String str) {
        this.customStickerEntrance = str;
    }

    public final void setCutout(boolean z) {
        this.isCutout = z;
    }

    public final void setPanelPosition(int i) {
        this.panelPosition = i;
    }

    public final void setPropId(String str) {
        this.propId = str;
    }

    public final void setSelectFrom(String str) {
        this.selectFrom = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStickerType(String str) {
        this.stickerType = str;
    }

    public final void setTabName(String str) {
        this.tabName = str;
    }

    public StickerMobParams(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, int i2) {
        this.selectFrom = str;
        this.stickerType = str2;
        this.panelPosition = i;
        this.tabName = str3;
        this.creationId = str4;
        this.propId = str5;
        this.shootWay = str6;
        this.isCutout = z;
        this.isCrop = z2;
        this.customStickerEntrance = str7;
        this.customCutoutModelType = i2;
    }
}
