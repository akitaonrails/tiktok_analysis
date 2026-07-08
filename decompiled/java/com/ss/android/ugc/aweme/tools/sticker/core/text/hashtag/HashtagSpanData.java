package com.ss.android.ugc.aweme.tools.sticker.core.text.hashtag;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.sticker.core.text.hashtag.HashtagSpanData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class HashtagSpanData extends CharacterStyle implements Parcelable {

    @C09CT("hashtag_id")
    public String hashtagId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("text")
    public String text;
    public static final Parcelable.Creator<HashtagSpanData> CREATOR = new Parcelable.Creator<HashtagSpanData>() { // from class: X.0FM9
        @Override // android.os.Parcelable.Creator
        public final HashtagSpanData createFromParcel(Parcel parcel) {
            return new HashtagSpanData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HashtagSpanData[] newArray(int i) {
            return new HashtagSpanData[i];
        }
    };
    public static final int $stable = 8;

    public HashtagSpanData() {
        this(null, "", "", 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HashtagSpanData)) {
            return false;
        }
        HashtagSpanData hashtagSpanData = (HashtagSpanData) obj;
        return Intrinsics.LJFF(this.text, hashtagSpanData.text) && Intrinsics.LJFF(this.hashtagId, hashtagSpanData.hashtagId) && Intrinsics.LJFF(this.stickerId, hashtagSpanData.stickerId) && this.status == hashtagSpanData.status;
    }

    public final int hashCode() {
        String str = this.text;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.hashtagId.hashCode()) * 31) + this.stickerId.hashCode()) * 31) + this.status;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HashtagSpanData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", hashtagId=");
        sbLIZ.append(this.hashtagId);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.hashtagId);
        parcel.writeString(this.stickerId);
        parcel.writeInt(this.status);
    }

    public HashtagSpanData(String str, String str2, String str3, int i) {
        this.text = str;
        this.hashtagId = str2;
        this.stickerId = str3;
        this.status = i;
    }
}
