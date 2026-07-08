package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2243601Cre;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioElementTypeComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioComponent implements BaseComponent<C2243601Cre> {
    public static final Parcelable.Creator<MixStudioComponent> CREATOR = new Parcelable.Creator<MixStudioComponent>() { // from class: X.0HsQ
        @Override // android.os.Parcelable.Creator
        public final MixStudioComponent createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            MixStudioElementTypeComponent mixStudioElementTypeComponentCreateFromParcel = MixStudioElementTypeComponent.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new MixStudioComponent(string, string2, string3, j, i, mixStudioElementTypeComponentCreateFromParcel, lValueOf, string4, lValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MixStudioComponent[] newArray(int i) {
            return new MixStudioComponent[i];
        }
    };
    public final String elementId;
    public final MixStudioElementTypeComponent elementType;
    public final String elementUri;
    public final String elementUrl;
    public final String emojiElement;
    public final long materialStickerId;
    public final int materialStickerType;
    public final String promptText;
    public final String remixeeNickname;
    public final Long remixeeUid;
    public final String remixerNickname;
    public final Long remixerUid;
    public final String textElement;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStudioComponent)) {
            return false;
        }
        MixStudioComponent mixStudioComponent = (MixStudioComponent) obj;
        return Intrinsics.LJFF(this.textElement, mixStudioComponent.textElement) && Intrinsics.LJFF(this.emojiElement, mixStudioComponent.emojiElement) && Intrinsics.LJFF(this.promptText, mixStudioComponent.promptText) && this.materialStickerId == mixStudioComponent.materialStickerId && this.materialStickerType == mixStudioComponent.materialStickerType && this.elementType == mixStudioComponent.elementType && Intrinsics.LJFF(this.remixerUid, mixStudioComponent.remixerUid) && Intrinsics.LJFF(this.remixerNickname, mixStudioComponent.remixerNickname) && Intrinsics.LJFF(this.remixeeUid, mixStudioComponent.remixeeUid) && Intrinsics.LJFF(this.remixeeNickname, mixStudioComponent.remixeeNickname) && Intrinsics.LJFF(this.elementId, mixStudioComponent.elementId) && Intrinsics.LJFF(this.elementUri, mixStudioComponent.elementUri) && Intrinsics.LJFF(this.elementUrl, mixStudioComponent.elementUrl);
    }

    public final int hashCode() {
        String str = this.textElement;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.emojiElement;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promptText;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.materialStickerId)) * 31) + this.materialStickerType) * 31) + this.elementType.hashCode()) * 31;
        Long l = this.remixerUid;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.remixerNickname;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.remixeeUid;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.remixeeNickname;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.elementId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.elementUri;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.elementUrl;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "MixStudioComponent(textElement=" + this.textElement + ", emojiElement=" + this.emojiElement + ", promptText=" + this.promptText + ", materialStickerId=" + this.materialStickerId + ", materialStickerType=" + this.materialStickerType + ", elementType=" + this.elementType + ", remixerUid=" + this.remixerUid + ", remixerNickname=" + this.remixerNickname + ", remixeeUid=" + this.remixeeUid + ", remixeeNickname=" + this.remixeeNickname + ", elementId=" + this.elementId + ", elementUri=" + this.elementUri + ", elementUrl=" + this.elementUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textElement);
        parcel.writeString(this.emojiElement);
        parcel.writeString(this.promptText);
        parcel.writeLong(this.materialStickerId);
        parcel.writeInt(this.materialStickerType);
        this.elementType.writeToParcel(parcel, i);
        Long l = this.remixerUid;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.remixerNickname);
        Long l2 = this.remixeeUid;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.remixeeNickname);
        parcel.writeString(this.elementId);
        parcel.writeString(this.elementUri);
        parcel.writeString(this.elementUrl);
    }

    public MixStudioComponent(String str, String str2, String str3, long j, int i, MixStudioElementTypeComponent mixStudioElementTypeComponent, Long l, String str4, Long l2, String str5, String str6, String str7, String str8) {
        this.textElement = str;
        this.emojiElement = str2;
        this.promptText = str3;
        this.materialStickerId = j;
        this.materialStickerType = i;
        this.elementType = mixStudioElementTypeComponent;
        this.remixerUid = l;
        this.remixerNickname = str4;
        this.remixeeUid = l2;
        this.remixeeNickname = str5;
        this.elementId = str6;
        this.elementUri = str7;
        this.elementUrl = str8;
    }
}
