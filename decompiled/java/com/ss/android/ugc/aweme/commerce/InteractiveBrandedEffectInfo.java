package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class InteractiveBrandedEffectInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<InteractiveBrandedEffectInfo> CREATOR = new Parcelable.Creator<InteractiveBrandedEffectInfo>() { // from class: X.0dlu
        @Override // android.os.Parcelable.Creator
        public final InteractiveBrandedEffectInfo createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new InteractiveBrandedEffectInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final InteractiveBrandedEffectInfo[] newArray(int i) {
            return new InteractiveBrandedEffectInfo[i];
        }
    };

    @C09CT("brand_extra")
    public String brandExtra;

    @C09CT("enable_shake")
    public boolean enableShake;

    @C09CT("enable_tap")
    public boolean enableTap;

    @C09CT("ibe_type")
    public int ibeType;

    @C09CT("sticker_id")
    public String legacyStickerId;

    @C09CT("lynx_schema")
    public String lynxSchema;

    @C09CT("prop_data")
    public String propData;

    @C09CT("prop_id")
    public String stickerId;

    @C09CT("video_interval")
    public VideoInterval videoInterval = new VideoInterval();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final String getStickerId() {
        String str = this.stickerId;
        return str == null ? this.legacyStickerId : str;
    }

    public final String getBrandExtra() {
        return this.brandExtra;
    }

    public final boolean getEnableShake() {
        return this.enableShake;
    }

    public final boolean getEnableTap() {
        return this.enableTap;
    }

    public final int getIbeType() {
        return this.ibeType;
    }

    public final String getLegacyStickerId() {
        return this.legacyStickerId;
    }

    public final String getLynxSchema() {
        return this.lynxSchema;
    }

    public final String getPropData() {
        return this.propData;
    }

    public final VideoInterval getVideoInterval() {
        return this.videoInterval;
    }

    public final void setBrandExtra(String str) {
        this.brandExtra = str;
    }

    public final void setEnableShake(boolean z) {
        this.enableShake = z;
    }

    public final void setEnableTap(boolean z) {
        this.enableTap = z;
    }

    public final void setIbeType(int i) {
        this.ibeType = i;
    }

    public final void setLegacyStickerId(String str) {
        this.legacyStickerId = str;
    }

    public final void setLynxSchema(String str) {
        this.lynxSchema = str;
    }

    public final void setPropData(String str) {
        this.propData = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setVideoInterval(VideoInterval videoInterval) {
        this.videoInterval = videoInterval;
    }
}
