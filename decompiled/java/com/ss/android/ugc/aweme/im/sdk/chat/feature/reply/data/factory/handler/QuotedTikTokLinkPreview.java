package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.data.factory.handler;

import X.C09CT;
import X.C0I5U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.data.factory.handler.QuotedTikTokLinkPreview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedTikTokLinkPreview implements Parcelable {

    @C09CT("isStory")
    public final boolean isStory;

    @C09CT("refAuthorUserName")
    public final String refAuthorUserName;

    @C09CT("refAvatarUid")
    public final String refAvatarUid;

    @C09CT("refAvatarUrl")
    public final String refAvatarUrl;

    @C09CT("refVideoId")
    public final String refVideoId;

    @C09CT("refVideoUrl")
    public final String refVideoUrl;
    public static final C0I5U Companion = new Object() { // from class: X.0I5U
    };
    public static final Parcelable.Creator<QuotedTikTokLinkPreview> CREATOR = new Parcelable.Creator<QuotedTikTokLinkPreview>() { // from class: X.0I5S
        @Override // android.os.Parcelable.Creator
        public final QuotedTikTokLinkPreview createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new QuotedTikTokLinkPreview(string, string2, string3, string4, string5, z);
        }

        @Override // android.os.Parcelable.Creator
        public final QuotedTikTokLinkPreview[] newArray(int i) {
            return new QuotedTikTokLinkPreview[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotedTikTokLinkPreview)) {
            return false;
        }
        QuotedTikTokLinkPreview quotedTikTokLinkPreview = (QuotedTikTokLinkPreview) obj;
        return Intrinsics.LJFF(this.refVideoId, quotedTikTokLinkPreview.refVideoId) && Intrinsics.LJFF(this.refVideoUrl, quotedTikTokLinkPreview.refVideoUrl) && Intrinsics.LJFF(this.refAvatarUrl, quotedTikTokLinkPreview.refAvatarUrl) && Intrinsics.LJFF(this.refAvatarUid, quotedTikTokLinkPreview.refAvatarUid) && Intrinsics.LJFF(this.refAuthorUserName, quotedTikTokLinkPreview.refAuthorUserName) && this.isStory == quotedTikTokLinkPreview.isStory;
    }

    public final int hashCode() {
        return (((((((((this.refVideoId.hashCode() * 31) + this.refVideoUrl.hashCode()) * 31) + this.refAvatarUrl.hashCode()) * 31) + this.refAvatarUid.hashCode()) * 31) + this.refAuthorUserName.hashCode()) * 31) + C786410Ut5.Z2(this.isStory);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedTikTokLinkPreview(refVideoId=");
        sbLIZ.append(this.refVideoId);
        sbLIZ.append(", refVideoUrl=");
        sbLIZ.append(this.refVideoUrl);
        sbLIZ.append(", refAvatarUrl=");
        sbLIZ.append(this.refAvatarUrl);
        sbLIZ.append(", refAvatarUid=");
        sbLIZ.append(this.refAvatarUid);
        sbLIZ.append(", refAuthorUserName=");
        sbLIZ.append(this.refAuthorUserName);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.isStory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.refVideoId);
        parcel.writeString(this.refVideoUrl);
        parcel.writeString(this.refAvatarUrl);
        parcel.writeString(this.refAvatarUid);
        parcel.writeString(this.refAuthorUserName);
        parcel.writeInt(this.isStory ? 1 : 0);
    }

    public QuotedTikTokLinkPreview(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.refVideoId = str;
        this.refVideoUrl = str2;
        this.refAvatarUrl = str3;
        this.refAvatarUid = str4;
        this.refAuthorUserName = str5;
        this.isStory = z;
    }
}
