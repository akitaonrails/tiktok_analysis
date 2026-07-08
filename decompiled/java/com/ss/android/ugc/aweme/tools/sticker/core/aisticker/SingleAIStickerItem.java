package com.ss.android.ugc.aweme.tools.sticker.core.aisticker;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C585350MxZ;
import X.EnumC585340MxY;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.aisticker.SingleAIStickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleAIStickerItem implements Parcelable {

    @C09CT("display_url")
    public final String displayUrl;

    @C09CT("download_url")
    public final String downloadUrl;
    public transient boolean isSelected;

    @C09CT("local_path")
    @C0MY0
    public String localPath;

    @C09CT("model")
    public final String model;
    public transient String promptText = "";
    public transient int reversedIndex = -1;

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("style")
    public final String style;

    @C09CT("type")
    public final EnumC585340MxY type;
    public static final C585350MxZ Companion = new C585350MxZ();
    public static final Parcelable.Creator<SingleAIStickerItem> CREATOR = new Parcelable.Creator<SingleAIStickerItem>() { // from class: X.0NLB
        @Override // android.os.Parcelable.Creator
        public final SingleAIStickerItem createFromParcel(Parcel parcel) {
            return new SingleAIStickerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), EnumC585340MxY.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SingleAIStickerItem[] newArray(int i) {
            return new SingleAIStickerItem[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleAIStickerItem)) {
            return false;
        }
        SingleAIStickerItem singleAIStickerItem = (SingleAIStickerItem) obj;
        return Intrinsics.LJFF(this.stickerId, singleAIStickerItem.stickerId) && Intrinsics.LJFF(this.displayUrl, singleAIStickerItem.displayUrl) && Intrinsics.LJFF(this.downloadUrl, singleAIStickerItem.downloadUrl) && Intrinsics.LJFF(this.localPath, singleAIStickerItem.localPath) && Intrinsics.LJFF(this.model, singleAIStickerItem.model) && Intrinsics.LJFF(this.style, singleAIStickerItem.style) && this.type == singleAIStickerItem.type;
    }

    public final int hashCode() {
        return (((((((((((this.stickerId.hashCode() * 31) + this.displayUrl.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.model.hashCode()) * 31) + this.style.hashCode()) * 31) + this.type.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleAIStickerItem(stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", displayUrl=");
        sbLIZ.append(this.displayUrl);
        sbLIZ.append(", downloadUrl=");
        sbLIZ.append(this.downloadUrl);
        sbLIZ.append(", localPath=");
        sbLIZ.append(this.localPath);
        sbLIZ.append(", model=");
        sbLIZ.append(this.model);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.displayUrl);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.localPath);
        parcel.writeString(this.model);
        parcel.writeString(this.style);
        parcel.writeString(this.type.name());
    }

    public SingleAIStickerItem(String str, String str2, String str3, String str4, String str5, String str6, EnumC585340MxY enumC585340MxY) {
        this.stickerId = str;
        this.displayUrl = str2;
        this.downloadUrl = str3;
        this.localPath = str4;
        this.model = str5;
        this.style = str6;
        this.type = enumC585340MxY;
    }
}
