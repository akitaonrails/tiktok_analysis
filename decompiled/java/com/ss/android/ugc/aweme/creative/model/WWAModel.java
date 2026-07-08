package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.WWAModel;

/* JADX INFO: loaded from: classes23.dex */
public final class WWAModel implements Parcelable {
    public static final Parcelable.Creator<WWAModel> CREATOR = new Parcelable.Creator<WWAModel>() { // from class: X.0nme
        @Override // android.os.Parcelable.Creator
        public final WWAModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new WWAModel(z, string, string2, string3, z2, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WWAModel[] newArray(int i) {
            return new WWAModel[i];
        }
    };

    @C09CT("back_url")
    public String backUrl;

    @C09CT("campaign_id")
    public String campaignId;

    @C040H
    public boolean completedEvent;

    @C040H
    public boolean isFromCCTemplate;

    @C09CT("show_story_button")
    public boolean showStoryButton;

    @C09CT("source_platform_channel")
    public String sourcePlatformChannel;

    @C040H
    public String textSticker;

    public WWAModel() {
        this(false, null, null, null, true, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.completedEvent ? 1 : 0);
        parcel.writeString(this.campaignId);
        parcel.writeString(this.sourcePlatformChannel);
        parcel.writeString(this.backUrl);
        parcel.writeInt(this.showStoryButton ? 1 : 0);
        parcel.writeInt(this.isFromCCTemplate ? 1 : 0);
        parcel.writeString(this.textSticker);
    }

    public WWAModel(boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4) {
        this.completedEvent = z;
        this.campaignId = str;
        this.sourcePlatformChannel = str2;
        this.backUrl = str3;
        this.showStoryButton = z2;
        this.isFromCCTemplate = z3;
        this.textSticker = str4;
    }
}
