package com.ss.android.ugc.aweme.im.sdk.chat.data.dto;

import X.C0I82;
import X.C0IBH;
import X.C13BV;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface QuotedMessageInfo extends Parcelable {
    public static final C0I82 Companion = C0I82.LIZ;

    public static final class QuotedBusinessNativeCardTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedBusinessNativeCardTemplateInfo> CREATOR = new Parcelable.Creator<QuotedBusinessNativeCardTemplateInfo>() { // from class: X.0I4q
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo createFromParcel(Parcel parcel) {
                return new QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedBusinessNativeCardTemplateInfo[i];
            }
        };
        public final String quotePreviewText;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuotedBusinessNativeCardTemplateInfo) && Intrinsics.LJFF(this.quotePreviewText, ((QuotedBusinessNativeCardTemplateInfo) obj).quotePreviewText);
        }

        public final int hashCode() {
            return this.quotePreviewText.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedBusinessNativeCardTemplateInfo(quotePreviewText=");
            sbLIZ.append(this.quotePreviewText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.quotePreviewText);
        }

        public QuotedBusinessNativeCardTemplateInfo() {
            this("");
        }

        public QuotedBusinessNativeCardTemplateInfo(String str) {
            this.quotePreviewText = str;
        }
    }

    public static final class QuotedMarkdownTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedMarkdownTemplateInfo> CREATOR = new Parcelable.Creator<QuotedMarkdownTemplateInfo>() { // from class: X.0I3Y
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedMarkdownTemplateInfo createFromParcel(Parcel parcel) {
                return new QuotedMessageInfo.QuotedMarkdownTemplateInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedMarkdownTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedMarkdownTemplateInfo[i];
            }
        };
        public final String quotePreviewText;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuotedMarkdownTemplateInfo) && Intrinsics.LJFF(this.quotePreviewText, ((QuotedMarkdownTemplateInfo) obj).quotePreviewText);
        }

        public final int hashCode() {
            return this.quotePreviewText.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedMarkdownTemplateInfo(quotePreviewText=");
            sbLIZ.append(this.quotePreviewText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.quotePreviewText);
        }

        public QuotedMarkdownTemplateInfo() {
            this("");
        }

        public QuotedMarkdownTemplateInfo(String str) {
            this.quotePreviewText = str;
        }
    }

    public static final class QuotedPhotoTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedPhotoTemplateInfo> CREATOR = new Parcelable.Creator<QuotedPhotoTemplateInfo>() { // from class: X.0I4L
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedPhotoTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                return new QuotedMessageInfo.QuotedPhotoTemplateInfo(arrayListCreateStringArrayList, i, i2, string, z, z2, j, z3, z4, z5);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedPhotoTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedPhotoTemplateInfo[i];
            }
        };
        public final int height;
        public final boolean isForceMask;
        public final boolean isNudeMask;
        public final boolean isPhotoSwapMask;
        public final boolean isSendBySelf;
        public final String photoId;
        public final long photoMsgCreateAt;
        public final boolean shouldShowAsUnavailable;
        public final List<String> urlList;
        public final int width;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedPhotoTemplateInfo)) {
                return false;
            }
            QuotedPhotoTemplateInfo quotedPhotoTemplateInfo = (QuotedPhotoTemplateInfo) obj;
            return Intrinsics.LJFF(this.urlList, quotedPhotoTemplateInfo.urlList) && this.height == quotedPhotoTemplateInfo.height && this.width == quotedPhotoTemplateInfo.width && Intrinsics.LJFF(this.photoId, quotedPhotoTemplateInfo.photoId) && this.isNudeMask == quotedPhotoTemplateInfo.isNudeMask && this.shouldShowAsUnavailable == quotedPhotoTemplateInfo.shouldShowAsUnavailable && this.photoMsgCreateAt == quotedPhotoTemplateInfo.photoMsgCreateAt && this.isForceMask == quotedPhotoTemplateInfo.isForceMask && this.isSendBySelf == quotedPhotoTemplateInfo.isSendBySelf && this.isPhotoSwapMask == quotedPhotoTemplateInfo.isPhotoSwapMask;
        }

        public final int hashCode() {
            return (((((((((((((((((this.urlList.hashCode() * 31) + this.height) * 31) + this.width) * 31) + this.photoId.hashCode()) * 31) + C786410Ut5.Z2(this.isNudeMask)) * 31) + C786410Ut5.Z2(this.shouldShowAsUnavailable)) * 31) + C786410Ut5.Y2(this.photoMsgCreateAt)) * 31) + C786410Ut5.Z2(this.isForceMask)) * 31) + C786410Ut5.Z2(this.isSendBySelf)) * 31) + C786410Ut5.Z2(this.isPhotoSwapMask);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedPhotoTemplateInfo(urlList=");
            sbLIZ.append(this.urlList);
            sbLIZ.append(", height=");
            sbLIZ.append(this.height);
            sbLIZ.append(", width=");
            sbLIZ.append(this.width);
            sbLIZ.append(", photoId=");
            sbLIZ.append(this.photoId);
            sbLIZ.append(", isNudeMask=");
            sbLIZ.append(this.isNudeMask);
            sbLIZ.append(", shouldShowAsUnavailable=");
            sbLIZ.append(this.shouldShowAsUnavailable);
            sbLIZ.append(", photoMsgCreateAt=");
            sbLIZ.append(this.photoMsgCreateAt);
            sbLIZ.append(", isForceMask=");
            sbLIZ.append(this.isForceMask);
            sbLIZ.append(", isSendBySelf=");
            sbLIZ.append(this.isSendBySelf);
            sbLIZ.append(", isPhotoSwapMask=");
            sbLIZ.append(this.isPhotoSwapMask);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.urlList);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
            parcel.writeString(this.photoId);
            parcel.writeInt(this.isNudeMask ? 1 : 0);
            parcel.writeInt(this.shouldShowAsUnavailable ? 1 : 0);
            parcel.writeLong(this.photoMsgCreateAt);
            parcel.writeInt(this.isForceMask ? 1 : 0);
            parcel.writeInt(this.isSendBySelf ? 1 : 0);
            parcel.writeInt(this.isPhotoSwapMask ? 1 : 0);
        }

        public QuotedPhotoTemplateInfo() {
            this(C13BV.INSTANCE, 0, 0, "", false, false, -1L, false, false, false);
        }

        public QuotedPhotoTemplateInfo(List<String> list, int i, int i2, String str, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
            this.urlList = list;
            this.height = i;
            this.width = i2;
            this.photoId = str;
            this.isNudeMask = z;
            this.shouldShowAsUnavailable = z2;
            this.photoMsgCreateAt = j;
            this.isForceMask = z3;
            this.isSendBySelf = z4;
            this.isPhotoSwapMask = z5;
        }
    }

    public static final class QuotedQuickLiveReactionVideoTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedQuickLiveReactionVideoTemplateInfo> CREATOR = new Parcelable.Creator<QuotedQuickLiveReactionVideoTemplateInfo>() { // from class: X.0I3i
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo(arrayListCreateStringArrayList, i, i2, string, z, z2, j, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedQuickLiveReactionVideoTemplateInfo[i];
            }
        };
        public final int height;
        public final boolean isForceMask;
        public final boolean isNudeMask;
        public final boolean isSendBySelf;
        public final long photoMsgCreateAt;
        public final boolean shouldShowAsUnavailable;
        public final List<String> urlList;
        public final String videoId;
        public final int width;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedQuickLiveReactionVideoTemplateInfo)) {
                return false;
            }
            QuotedQuickLiveReactionVideoTemplateInfo quotedQuickLiveReactionVideoTemplateInfo = (QuotedQuickLiveReactionVideoTemplateInfo) obj;
            return Intrinsics.LJFF(this.urlList, quotedQuickLiveReactionVideoTemplateInfo.urlList) && this.height == quotedQuickLiveReactionVideoTemplateInfo.height && this.width == quotedQuickLiveReactionVideoTemplateInfo.width && Intrinsics.LJFF(this.videoId, quotedQuickLiveReactionVideoTemplateInfo.videoId) && this.isNudeMask == quotedQuickLiveReactionVideoTemplateInfo.isNudeMask && this.shouldShowAsUnavailable == quotedQuickLiveReactionVideoTemplateInfo.shouldShowAsUnavailable && this.photoMsgCreateAt == quotedQuickLiveReactionVideoTemplateInfo.photoMsgCreateAt && this.isForceMask == quotedQuickLiveReactionVideoTemplateInfo.isForceMask && this.isSendBySelf == quotedQuickLiveReactionVideoTemplateInfo.isSendBySelf;
        }

        public final int hashCode() {
            return (((((((((((((((this.urlList.hashCode() * 31) + this.height) * 31) + this.width) * 31) + this.videoId.hashCode()) * 31) + C786410Ut5.Z2(this.isNudeMask)) * 31) + C786410Ut5.Z2(this.shouldShowAsUnavailable)) * 31) + C786410Ut5.Y2(this.photoMsgCreateAt)) * 31) + C786410Ut5.Z2(this.isForceMask)) * 31) + C786410Ut5.Z2(this.isSendBySelf);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedQuickLiveReactionVideoTemplateInfo(urlList=");
            sbLIZ.append(this.urlList);
            sbLIZ.append(", height=");
            sbLIZ.append(this.height);
            sbLIZ.append(", width=");
            sbLIZ.append(this.width);
            sbLIZ.append(", videoId=");
            sbLIZ.append(this.videoId);
            sbLIZ.append(", isNudeMask=");
            sbLIZ.append(this.isNudeMask);
            sbLIZ.append(", shouldShowAsUnavailable=");
            sbLIZ.append(this.shouldShowAsUnavailable);
            sbLIZ.append(", photoMsgCreateAt=");
            sbLIZ.append(this.photoMsgCreateAt);
            sbLIZ.append(", isForceMask=");
            sbLIZ.append(this.isForceMask);
            sbLIZ.append(", isSendBySelf=");
            sbLIZ.append(this.isSendBySelf);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.urlList);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
            parcel.writeString(this.videoId);
            parcel.writeInt(this.isNudeMask ? 1 : 0);
            parcel.writeInt(this.shouldShowAsUnavailable ? 1 : 0);
            parcel.writeLong(this.photoMsgCreateAt);
            parcel.writeInt(this.isForceMask ? 1 : 0);
            parcel.writeInt(this.isSendBySelf ? 1 : 0);
        }

        public QuotedQuickLiveReactionVideoTemplateInfo() {
            this(C13BV.INSTANCE, 0, 0, "", false, false, -1L, false, false);
        }

        public QuotedQuickLiveReactionVideoTemplateInfo(List<String> list, int i, int i2, String str, boolean z, boolean z2, long j, boolean z3, boolean z4) {
            this.urlList = list;
            this.height = i;
            this.width = i2;
            this.videoId = str;
            this.isNudeMask = z;
            this.shouldShowAsUnavailable = z2;
            this.photoMsgCreateAt = j;
            this.isForceMask = z3;
            this.isSendBySelf = z4;
        }
    }

    public static final class QuotedVideoTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedVideoTemplateInfo> CREATOR = new Parcelable.Creator<QuotedVideoTemplateInfo>() { // from class: X.0I3k
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedVideoTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new QuotedMessageInfo.QuotedVideoTemplateInfo(arrayListCreateStringArrayList, i, i2, string, z, z2, j, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedVideoTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedVideoTemplateInfo[i];
            }
        };
        public final int height;
        public final boolean isForceMask;
        public final boolean isNudeMask;
        public final boolean isSendBySelf;
        public final long photoMsgCreateAt;
        public final boolean shouldShowAsUnavailable;
        public final List<String> urlList;
        public final String videoId;
        public final int width;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedVideoTemplateInfo)) {
                return false;
            }
            QuotedVideoTemplateInfo quotedVideoTemplateInfo = (QuotedVideoTemplateInfo) obj;
            return Intrinsics.LJFF(this.urlList, quotedVideoTemplateInfo.urlList) && this.height == quotedVideoTemplateInfo.height && this.width == quotedVideoTemplateInfo.width && Intrinsics.LJFF(this.videoId, quotedVideoTemplateInfo.videoId) && this.isNudeMask == quotedVideoTemplateInfo.isNudeMask && this.shouldShowAsUnavailable == quotedVideoTemplateInfo.shouldShowAsUnavailable && this.photoMsgCreateAt == quotedVideoTemplateInfo.photoMsgCreateAt && this.isForceMask == quotedVideoTemplateInfo.isForceMask && this.isSendBySelf == quotedVideoTemplateInfo.isSendBySelf;
        }

        public final int hashCode() {
            return (((((((((((((((this.urlList.hashCode() * 31) + this.height) * 31) + this.width) * 31) + this.videoId.hashCode()) * 31) + C786410Ut5.Z2(this.isNudeMask)) * 31) + C786410Ut5.Z2(this.shouldShowAsUnavailable)) * 31) + C786410Ut5.Y2(this.photoMsgCreateAt)) * 31) + C786410Ut5.Z2(this.isForceMask)) * 31) + C786410Ut5.Z2(this.isSendBySelf);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedVideoTemplateInfo(urlList=");
            sbLIZ.append(this.urlList);
            sbLIZ.append(", height=");
            sbLIZ.append(this.height);
            sbLIZ.append(", width=");
            sbLIZ.append(this.width);
            sbLIZ.append(", videoId=");
            sbLIZ.append(this.videoId);
            sbLIZ.append(", isNudeMask=");
            sbLIZ.append(this.isNudeMask);
            sbLIZ.append(", shouldShowAsUnavailable=");
            sbLIZ.append(this.shouldShowAsUnavailable);
            sbLIZ.append(", photoMsgCreateAt=");
            sbLIZ.append(this.photoMsgCreateAt);
            sbLIZ.append(", isForceMask=");
            sbLIZ.append(this.isForceMask);
            sbLIZ.append(", isSendBySelf=");
            sbLIZ.append(this.isSendBySelf);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.urlList);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
            parcel.writeString(this.videoId);
            parcel.writeInt(this.isNudeMask ? 1 : 0);
            parcel.writeInt(this.shouldShowAsUnavailable ? 1 : 0);
            parcel.writeLong(this.photoMsgCreateAt);
            parcel.writeInt(this.isForceMask ? 1 : 0);
            parcel.writeInt(this.isSendBySelf ? 1 : 0);
        }

        public QuotedVideoTemplateInfo() {
            this(C13BV.INSTANCE, 0, 0, "", false, false, -1L, false, false);
        }

        public QuotedVideoTemplateInfo(List<String> list, int i, int i2, String str, boolean z, boolean z2, long j, boolean z3, boolean z4) {
            this.urlList = list;
            this.height = i;
            this.width = i2;
            this.videoId = str;
            this.isNudeMask = z;
            this.shouldShowAsUnavailable = z2;
            this.photoMsgCreateAt = j;
            this.isForceMask = z3;
            this.isSendBySelf = z4;
        }
    }

    public static final class QuotedCallLogTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedCallLogTemplateInfo> CREATOR = new Parcelable.Creator<QuotedCallLogTemplateInfo>() { // from class: X.0I4r
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedCallLogTemplateInfo createFromParcel(Parcel parcel) {
                return new QuotedMessageInfo.QuotedCallLogTemplateInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedCallLogTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedCallLogTemplateInfo[i];
            }
        };
        public final String status;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuotedCallLogTemplateInfo) && Intrinsics.LJFF(this.status, ((QuotedCallLogTemplateInfo) obj).status);
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedCallLogTemplateInfo(status=");
            sbLIZ.append(this.status);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.status);
        }

        public QuotedCallLogTemplateInfo(String str) {
            this.status = str;
        }
    }

    public static final class QuotedTextInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedTextInfo> CREATOR = new Parcelable.Creator<QuotedTextInfo>() { // from class: X.0I3Q
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedTextInfo createFromParcel(Parcel parcel) {
                boolean z;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuotedMessageInfo.QuotedTextInfo(z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedTextInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedTextInfo[i];
            }
        };
        public final boolean isViolated;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuotedTextInfo) && this.isViolated == ((QuotedTextInfo) obj).isViolated;
        }

        public final int hashCode() {
            return C786410Ut5.Z2(this.isViolated);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedTextInfo(isViolated=");
            sbLIZ.append(this.isViolated);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isViolated ? 1 : 0);
        }

        public QuotedTextInfo(boolean z) {
            this.isViolated = z;
        }
    }

    public static final class QuotedVoiceMessageTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedVoiceMessageTemplateInfo> CREATOR = new Parcelable.Creator<QuotedVoiceMessageTemplateInfo>() { // from class: X.0I4s
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedVoiceMessageTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuotedMessageInfo.QuotedVoiceMessageTemplateInfo(z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedVoiceMessageTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedVoiceMessageTemplateInfo[i];
            }
        };
        public final boolean available;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuotedVoiceMessageTemplateInfo) && this.available == ((QuotedVoiceMessageTemplateInfo) obj).available;
        }

        public final int hashCode() {
            return C786410Ut5.Z2(this.available);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedVoiceMessageTemplateInfo(available=");
            sbLIZ.append(this.available);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.available ? 1 : 0);
        }

        public QuotedVoiceMessageTemplateInfo(boolean z) {
            this.available = z;
        }
    }

    public static final class QuotedDynamicCardTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedDynamicCardTemplateInfo> CREATOR = new Parcelable.Creator<QuotedDynamicCardTemplateInfo>() { // from class: X.0I4I
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedDynamicCardTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                DynamicCardClientInfoComponent dynamicCardClientInfoComponent = (DynamicCardClientInfoComponent) parcel.readParcelable(QuotedMessageInfo.QuotedDynamicCardTemplateInfo.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuotedMessageInfo.QuotedDynamicCardTemplateInfo(dynamicCardClientInfoComponent, z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedDynamicCardTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedDynamicCardTemplateInfo[i];
            }
        };
        public final DynamicCardClientInfoComponent clientInfo;
        public final boolean isUnavailable;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedDynamicCardTemplateInfo)) {
                return false;
            }
            QuotedDynamicCardTemplateInfo quotedDynamicCardTemplateInfo = (QuotedDynamicCardTemplateInfo) obj;
            return Intrinsics.LJFF(this.clientInfo, quotedDynamicCardTemplateInfo.clientInfo) && this.isUnavailable == quotedDynamicCardTemplateInfo.isUnavailable;
        }

        public final int hashCode() {
            DynamicCardClientInfoComponent dynamicCardClientInfoComponent = this.clientInfo;
            return ((dynamicCardClientInfoComponent == null ? 0 : dynamicCardClientInfoComponent.hashCode()) * 31) + C786410Ut5.Z2(this.isUnavailable);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedDynamicCardTemplateInfo(clientInfo=");
            sbLIZ.append(this.clientInfo);
            sbLIZ.append(", isUnavailable=");
            sbLIZ.append(this.isUnavailable);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.clientInfo, i);
            parcel.writeInt(this.isUnavailable ? 1 : 0);
        }

        public QuotedDynamicCardTemplateInfo(DynamicCardClientInfoComponent dynamicCardClientInfoComponent, boolean z) {
            this.clientInfo = dynamicCardClientInfoComponent;
            this.isUnavailable = z;
        }
    }

    public static final class QuotedCommentTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedCommentTemplateInfo> CREATOR = new Parcelable.Creator<QuotedCommentTemplateInfo>() { // from class: X.0I3a
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedCommentTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuotedMessageInfo.QuotedCommentTemplateInfo(z, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedCommentTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedCommentTemplateInfo[i];
            }
        };
        public final String commentAuthorUsername;
        public final String commentText;
        public final boolean isCommentAvailable;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedCommentTemplateInfo)) {
                return false;
            }
            QuotedCommentTemplateInfo quotedCommentTemplateInfo = (QuotedCommentTemplateInfo) obj;
            return this.isCommentAvailable == quotedCommentTemplateInfo.isCommentAvailable && Intrinsics.LJFF(this.commentAuthorUsername, quotedCommentTemplateInfo.commentAuthorUsername) && Intrinsics.LJFF(this.commentText, quotedCommentTemplateInfo.commentText);
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.isCommentAvailable) * 31) + this.commentAuthorUsername.hashCode()) * 31) + this.commentText.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedCommentTemplateInfo(isCommentAvailable=");
            sbLIZ.append(this.isCommentAvailable);
            sbLIZ.append(", commentAuthorUsername=");
            sbLIZ.append(this.commentAuthorUsername);
            sbLIZ.append(", commentText=");
            sbLIZ.append(this.commentText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isCommentAvailable ? 1 : 0);
            parcel.writeString(this.commentAuthorUsername);
            parcel.writeString(this.commentText);
        }

        public QuotedCommentTemplateInfo(boolean z, String str, String str2) {
            this.isCommentAvailable = z;
            this.commentAuthorUsername = str;
            this.commentText = str2;
        }
    }

    public static final class QuotedGreetingCardTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedGreetingCardTemplateInfo> CREATOR = new Parcelable.Creator<QuotedGreetingCardTemplateInfo>() { // from class: X.0I4z
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedGreetingCardTemplateInfo createFromParcel(Parcel parcel) {
                C0IBH c0ibhValueOf;
                boolean z;
                if (parcel.readInt() == 0) {
                    c0ibhValueOf = null;
                } else {
                    c0ibhValueOf = C0IBH.valueOf(parcel.readString());
                }
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuotedMessageInfo.QuotedGreetingCardTemplateInfo(c0ibhValueOf, string, z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedGreetingCardTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedGreetingCardTemplateInfo[i];
            }
        };
        public final String festiveId;
        public final boolean isViolated;
        public final C0IBH status;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedGreetingCardTemplateInfo)) {
                return false;
            }
            QuotedGreetingCardTemplateInfo quotedGreetingCardTemplateInfo = (QuotedGreetingCardTemplateInfo) obj;
            return this.status == quotedGreetingCardTemplateInfo.status && Intrinsics.LJFF(this.festiveId, quotedGreetingCardTemplateInfo.festiveId) && this.isViolated == quotedGreetingCardTemplateInfo.isViolated;
        }

        public final int hashCode() {
            C0IBH c0ibh = this.status;
            return ((((c0ibh == null ? 0 : c0ibh.hashCode()) * 31) + this.festiveId.hashCode()) * 31) + C786410Ut5.Z2(this.isViolated);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedGreetingCardTemplateInfo(status=");
            sbLIZ.append(this.status);
            sbLIZ.append(", festiveId=");
            sbLIZ.append(this.festiveId);
            sbLIZ.append(", isViolated=");
            sbLIZ.append(this.isViolated);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C0IBH c0ibh = this.status;
            if (c0ibh == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(c0ibh.name());
            }
            parcel.writeString(this.festiveId);
            parcel.writeInt(this.isViolated ? 1 : 0);
        }

        public QuotedGreetingCardTemplateInfo(C0IBH c0ibh, String str, boolean z) {
            this.status = c0ibh;
            this.festiveId = str;
            this.isViolated = z;
        }
    }

    public static final class QuotedRepostTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedRepostTemplateInfo> CREATOR = new Parcelable.Creator<QuotedRepostTemplateInfo>() { // from class: X.0I4o
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedRepostTemplateInfo createFromParcel(Parcel parcel) {
                return new QuotedMessageInfo.QuotedRepostTemplateInfo((RepostCardStatusComponent) parcel.readParcelable(QuotedMessageInfo.QuotedRepostTemplateInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedRepostTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedRepostTemplateInfo[i];
            }
        };
        public final String awemeId;
        public final List<String> repostCover;
        public final RepostCardStatusComponent repostStatus;
        public final String repostText;
        public final String repostUid;
        public final String reposterName;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedRepostTemplateInfo)) {
                return false;
            }
            QuotedRepostTemplateInfo quotedRepostTemplateInfo = (QuotedRepostTemplateInfo) obj;
            return this.repostStatus == quotedRepostTemplateInfo.repostStatus && Intrinsics.LJFF(this.reposterName, quotedRepostTemplateInfo.reposterName) && Intrinsics.LJFF(this.repostText, quotedRepostTemplateInfo.repostText) && Intrinsics.LJFF(this.repostCover, quotedRepostTemplateInfo.repostCover) && Intrinsics.LJFF(this.awemeId, quotedRepostTemplateInfo.awemeId) && Intrinsics.LJFF(this.repostUid, quotedRepostTemplateInfo.repostUid);
        }

        public final int hashCode() {
            return (((((((((this.repostStatus.hashCode() * 31) + this.reposterName.hashCode()) * 31) + this.repostText.hashCode()) * 31) + this.repostCover.hashCode()) * 31) + this.awemeId.hashCode()) * 31) + this.repostUid.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedRepostTemplateInfo(repostStatus=");
            sbLIZ.append(this.repostStatus);
            sbLIZ.append(", reposterName=");
            sbLIZ.append(this.reposterName);
            sbLIZ.append(", repostText=");
            sbLIZ.append(this.repostText);
            sbLIZ.append(", repostCover=");
            sbLIZ.append(this.repostCover);
            sbLIZ.append(", awemeId=");
            sbLIZ.append(this.awemeId);
            sbLIZ.append(", repostUid=");
            sbLIZ.append(this.repostUid);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.repostStatus, i);
            parcel.writeString(this.reposterName);
            parcel.writeString(this.repostText);
            parcel.writeStringList(this.repostCover);
            parcel.writeString(this.awemeId);
            parcel.writeString(this.repostUid);
        }

        public QuotedRepostTemplateInfo(RepostCardStatusComponent repostCardStatusComponent, String str, String str2, List<String> list, String str3, String str4) {
            this.repostStatus = repostCardStatusComponent;
            this.reposterName = str;
            this.repostText = str2;
            this.repostCover = list;
            this.awemeId = str3;
            this.repostUid = str4;
        }
    }

    public static final class QuotedAIGroupPhotoTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedAIGroupPhotoTemplateInfo> CREATOR = new Parcelable.Creator<QuotedAIGroupPhotoTemplateInfo>() { // from class: X.0I4P
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string = parcel.readString();
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo(z, arrayListCreateStringArrayList, i, i2, string, j, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedAIGroupPhotoTemplateInfo[i];
            }
        };
        public final int height;
        public final boolean isHidden;
        public final boolean isSendBySelf;
        public final String photoId;
        public final long photoMsgCreateAt;
        public final List<String> urlList;
        public final int width;

        public QuotedAIGroupPhotoTemplateInfo() {
            this(false, C13BV.INSTANCE, 0, 0, "", -1L, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedAIGroupPhotoTemplateInfo)) {
                return false;
            }
            QuotedAIGroupPhotoTemplateInfo quotedAIGroupPhotoTemplateInfo = (QuotedAIGroupPhotoTemplateInfo) obj;
            return this.isHidden == quotedAIGroupPhotoTemplateInfo.isHidden && Intrinsics.LJFF(this.urlList, quotedAIGroupPhotoTemplateInfo.urlList) && this.height == quotedAIGroupPhotoTemplateInfo.height && this.width == quotedAIGroupPhotoTemplateInfo.width && Intrinsics.LJFF(this.photoId, quotedAIGroupPhotoTemplateInfo.photoId) && this.photoMsgCreateAt == quotedAIGroupPhotoTemplateInfo.photoMsgCreateAt && this.isSendBySelf == quotedAIGroupPhotoTemplateInfo.isSendBySelf;
        }

        public final int hashCode() {
            return (((((((((((C786410Ut5.Z2(this.isHidden) * 31) + this.urlList.hashCode()) * 31) + this.height) * 31) + this.width) * 31) + this.photoId.hashCode()) * 31) + C786410Ut5.Y2(this.photoMsgCreateAt)) * 31) + C786410Ut5.Z2(this.isSendBySelf);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QuotedAIGroupPhotoTemplateInfo(isHidden=");
            sbLIZ.append(this.isHidden);
            sbLIZ.append(", urlList=");
            sbLIZ.append(this.urlList);
            sbLIZ.append(", height=");
            sbLIZ.append(this.height);
            sbLIZ.append(", width=");
            sbLIZ.append(this.width);
            sbLIZ.append(", photoId=");
            sbLIZ.append(this.photoId);
            sbLIZ.append(", photoMsgCreateAt=");
            sbLIZ.append(this.photoMsgCreateAt);
            sbLIZ.append(", isSendBySelf=");
            sbLIZ.append(this.isSendBySelf);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isHidden ? 1 : 0);
            parcel.writeStringList(this.urlList);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
            parcel.writeString(this.photoId);
            parcel.writeLong(this.photoMsgCreateAt);
            parcel.writeInt(this.isSendBySelf ? 1 : 0);
        }

        public QuotedAIGroupPhotoTemplateInfo(boolean z, List<String> list, int i, int i2, String str, long j, boolean z2) {
            this.isHidden = z;
            this.urlList = list;
            this.height = i;
            this.width = i2;
            this.photoId = str;
            this.photoMsgCreateAt = j;
            this.isSendBySelf = z2;
        }
    }

    public static final class QuotedStickerSetTemplateInfo implements QuotedMessageInfo {
        public static final Parcelable.Creator<QuotedStickerSetTemplateInfo> CREATOR = new Parcelable.Creator<QuotedStickerSetTemplateInfo>() { // from class: X.0Htc
            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedStickerSetTemplateInfo createFromParcel(Parcel parcel) {
                Long lValueOf;
                Integer numValueOf;
                boolean z;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Integer numValueOf2 = null;
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                MixStudioComponent mixStudioComponent = (MixStudioComponent) parcel.readParcelable(QuotedMessageInfo.QuotedStickerSetTemplateInfo.class.getClassLoader());
                AvatarDuoInfoComponent avatarDuoInfoComponent = (AvatarDuoInfoComponent) parcel.readParcelable(QuotedMessageInfo.QuotedStickerSetTemplateInfo.class.getClassLoader());
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new QuotedMessageInfo.QuotedStickerSetTemplateInfo(arrayListCreateStringArrayList, string, string2, string3, string4, string5, string6, lValueOf, numValueOf, numValueOf2, mixStudioComponent, avatarDuoInfoComponent, i, i2, z);
            }

            @Override // android.os.Parcelable.Creator
            public final QuotedMessageInfo.QuotedStickerSetTemplateInfo[] newArray(int i) {
                return new QuotedMessageInfo.QuotedStickerSetTemplateInfo[i];
            }
        };
        public final AvatarDuoInfoComponent avatarDuoComponent;
        public final Integer creationScene;
        public final String expression;
        public final boolean isFlip;
        public final MixStudioComponent mixStudioInfo;
        public final Long originalStickerId;
        public final String ownerUid;
        public final String setId;
        public final int stickerHeight;
        public final String stickerId;
        public final String stickerType;
        public final Integer stickerVariant;
        public final int stickerWidth;
        public final String typingRecommendationStickerId;
        public final List<String> urlList;

        public QuotedStickerSetTemplateInfo() {
            this((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, (MixStudioComponent) null, (AvatarDuoInfoComponent) null, 0, 0, 32767);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotedStickerSetTemplateInfo)) {
                return false;
            }
            QuotedStickerSetTemplateInfo quotedStickerSetTemplateInfo = (QuotedStickerSetTemplateInfo) obj;
            return Intrinsics.LJFF(this.urlList, quotedStickerSetTemplateInfo.urlList) && Intrinsics.LJFF(this.stickerType, quotedStickerSetTemplateInfo.stickerType) && Intrinsics.LJFF(this.setId, quotedStickerSetTemplateInfo.setId) && Intrinsics.LJFF(this.stickerId, quotedStickerSetTemplateInfo.stickerId) && Intrinsics.LJFF(this.ownerUid, quotedStickerSetTemplateInfo.ownerUid) && Intrinsics.LJFF(this.expression, quotedStickerSetTemplateInfo.expression) && Intrinsics.LJFF(this.typingRecommendationStickerId, quotedStickerSetTemplateInfo.typingRecommendationStickerId) && Intrinsics.LJFF(this.originalStickerId, quotedStickerSetTemplateInfo.originalStickerId) && Intrinsics.LJFF(this.creationScene, quotedStickerSetTemplateInfo.creationScene) && Intrinsics.LJFF(this.stickerVariant, quotedStickerSetTemplateInfo.stickerVariant) && Intrinsics.LJFF(this.mixStudioInfo, quotedStickerSetTemplateInfo.mixStudioInfo) && Intrinsics.LJFF(this.avatarDuoComponent, quotedStickerSetTemplateInfo.avatarDuoComponent) && this.stickerWidth == quotedStickerSetTemplateInfo.stickerWidth && this.stickerHeight == quotedStickerSetTemplateInfo.stickerHeight && this.isFlip == quotedStickerSetTemplateInfo.isFlip;
        }

        public final int hashCode() {
            int iHashCode = ((((((((this.urlList.hashCode() * 31) + this.stickerType.hashCode()) * 31) + this.setId.hashCode()) * 31) + this.stickerId.hashCode()) * 31) + this.ownerUid.hashCode()) * 31;
            String str = this.expression;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.typingRecommendationStickerId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.originalStickerId;
            int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.creationScene;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.stickerVariant;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            MixStudioComponent mixStudioComponent = this.mixStudioInfo;
            int iHashCode7 = (iHashCode6 + (mixStudioComponent == null ? 0 : mixStudioComponent.hashCode())) * 31;
            AvatarDuoInfoComponent avatarDuoInfoComponent = this.avatarDuoComponent;
            return ((((((iHashCode7 + (avatarDuoInfoComponent != null ? avatarDuoInfoComponent.hashCode() : 0)) * 31) + this.stickerWidth) * 31) + this.stickerHeight) * 31) + C786410Ut5.Z2(this.isFlip);
        }

        public final String toString() {
            return "QuotedStickerSetTemplateInfo(urlList=" + this.urlList + ", stickerType=" + this.stickerType + ", setId=" + this.setId + ", stickerId=" + this.stickerId + ", ownerUid=" + this.ownerUid + ", expression=" + this.expression + ", typingRecommendationStickerId=" + this.typingRecommendationStickerId + ", originalStickerId=" + this.originalStickerId + ", creationScene=" + this.creationScene + ", stickerVariant=" + this.stickerVariant + ", mixStudioInfo=" + this.mixStudioInfo + ", avatarDuoComponent=" + this.avatarDuoComponent + ", stickerWidth=" + this.stickerWidth + ", stickerHeight=" + this.stickerHeight + ", isFlip=" + this.isFlip + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.urlList);
            parcel.writeString(this.stickerType);
            parcel.writeString(this.setId);
            parcel.writeString(this.stickerId);
            parcel.writeString(this.ownerUid);
            parcel.writeString(this.expression);
            parcel.writeString(this.typingRecommendationStickerId);
            Long l = this.originalStickerId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Integer num = this.creationScene;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.stickerVariant;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeParcelable(this.mixStudioInfo, i);
            parcel.writeParcelable(this.avatarDuoComponent, i);
            parcel.writeInt(this.stickerWidth);
            parcel.writeInt(this.stickerHeight);
            parcel.writeInt(this.isFlip ? 1 : 0);
        }

        public QuotedStickerSetTemplateInfo(List list, String str, String str2, String str3, String str4, String str5, String str6, Long l, Integer num, Integer num2, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, int i, int i2, int i3) {
            this((List<String>) ((i3 & 1) != 0 ? C13BV.INSTANCE : list), (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? str4 : "", (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? null : l, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? null : mixStudioComponent, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? avatarDuoInfoComponent : null, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) : i, (i3 & 8192) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) : i2, false);
        }

        public QuotedStickerSetTemplateInfo(List<String> list, String str, String str2, String str3, String str4, String str5, String str6, Long l, Integer num, Integer num2, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, int i, int i2, boolean z) {
            this.urlList = list;
            this.stickerType = str;
            this.setId = str2;
            this.stickerId = str3;
            this.ownerUid = str4;
            this.expression = str5;
            this.typingRecommendationStickerId = str6;
            this.originalStickerId = l;
            this.creationScene = num;
            this.stickerVariant = num2;
            this.mixStudioInfo = mixStudioComponent;
            this.avatarDuoComponent = avatarDuoInfoComponent;
            this.stickerWidth = i;
            this.stickerHeight = i2;
            this.isFlip = z;
        }
    }
}
