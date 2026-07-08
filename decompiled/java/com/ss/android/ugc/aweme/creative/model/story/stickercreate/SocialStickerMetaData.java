package com.ss.android.ugc.aweme.creative.model.story.stickercreate;

import X.C09CT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class SocialStickerMetaData implements Serializable, Parcelable {
    public static final Parcelable.Creator<SocialStickerMetaData> CREATOR = new Parcelable.Creator<SocialStickerMetaData>() { // from class: X.13wR
        @Override // android.os.Parcelable.Creator
        public final SocialStickerMetaData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SocialStickerMetaData(string, string2, string3, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialStickerMetaData[] newArray(int i) {
            return new SocialStickerMetaData[i];
        }
    };

    @C09CT("ext")
    public String ext;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("sticker_panel")
    public String stickerPanel;

    @InterfaceC2270908v5
    @C09CT("sticker_path")
    public String stickerPath;

    @C09CT("version")
    public Integer version;

    public SocialStickerMetaData() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.stickerPath);
        parcel.writeString(this.stickerPanel);
        parcel.writeString(this.stickerId);
        Integer num = this.version;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.ext);
    }

    public final String getExt() {
        return this.ext;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getStickerPanel() {
        return this.stickerPanel;
    }

    public final String getStickerPath() {
        return this.stickerPath;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final void setExt(String str) {
        this.ext = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setStickerPanel(String str) {
        this.stickerPanel = str;
    }

    public final void setStickerPath(String str) {
        this.stickerPath = str;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }

    public SocialStickerMetaData(String str, String str2, String str3, Integer num, String str4) {
        this.stickerPath = str;
        this.stickerPanel = str2;
        this.stickerId = str3;
        this.version = num;
        this.ext = str4;
    }
}
