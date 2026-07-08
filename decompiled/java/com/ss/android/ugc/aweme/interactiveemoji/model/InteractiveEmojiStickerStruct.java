package com.ss.android.ugc.aweme.interactiveemoji.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.interactiveemoji.model.InteractiveEmojiStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InteractiveEmojiStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<InteractiveEmojiStickerStruct> CREATOR = new Parcelable.Creator<InteractiveEmojiStickerStruct>() { // from class: X.11mk
        @Override // android.os.Parcelable.Creator
        public final InteractiveEmojiStickerStruct createFromParcel(Parcel parcel) {
            return new InteractiveEmojiStickerStruct(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InteractiveEmojiStickerStruct[] newArray(int i) {
            return new InteractiveEmojiStickerStruct[i];
        }
    };

    @C09CT("android_ver")
    public String androidVer;

    @C09CT("emoji_content")
    public String emojiContent;

    @C09CT("ios_ver")
    public String iosVer;

    public final InteractiveEmojiStickerStruct copy(String str, String str2, String str3) {
        return new InteractiveEmojiStickerStruct(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractiveEmojiStickerStruct)) {
            return false;
        }
        InteractiveEmojiStickerStruct interactiveEmojiStickerStruct = (InteractiveEmojiStickerStruct) obj;
        return Intrinsics.LJFF(this.emojiContent, interactiveEmojiStickerStruct.emojiContent) && Intrinsics.LJFF(this.androidVer, interactiveEmojiStickerStruct.androidVer) && Intrinsics.LJFF(this.iosVer, interactiveEmojiStickerStruct.iosVer);
    }

    public int hashCode() {
        return (((this.emojiContent.hashCode() * 31) + this.androidVer.hashCode()) * 31) + this.iosVer.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractiveEmojiStickerStruct(emojiContent=");
        sbLIZ.append(this.emojiContent);
        sbLIZ.append(", androidVer=");
        sbLIZ.append(this.androidVer);
        sbLIZ.append(", iosVer=");
        sbLIZ.append(this.iosVer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.emojiContent);
        parcel.writeString(this.androidVer);
        parcel.writeString(this.iosVer);
    }

    public InteractiveEmojiStickerStruct() {
        this("", CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
    }

    public final String getAndroidVer() {
        return this.androidVer;
    }

    public final String getEmojiContent() {
        return this.emojiContent;
    }

    public final String getIosVer() {
        return this.iosVer;
    }

    public InteractiveEmojiStickerStruct(String str, String str2, String str3) {
        this.emojiContent = str;
        this.androidVer = str2;
        this.iosVer = str3;
    }
}
