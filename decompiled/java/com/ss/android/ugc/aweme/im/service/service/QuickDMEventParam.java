package com.ss.android.ugc.aweme.im.service.service;

import X.C0S1J;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class QuickDMEventParam implements Parcelable {
    public static final Parcelable.Creator<QuickDMEventParam> CREATOR = new Parcelable.Creator<QuickDMEventParam>() { // from class: X.0SAT
        @Override // android.os.Parcelable.Creator
        public final QuickDMEventParam createFromParcel(Parcel parcel) {
            C0S1J c0s1jValueOf;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                c0s1jValueOf = null;
            } else {
                c0s1jValueOf = C0S1J.valueOf(parcel.readString());
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new QuickDMEventParam(string, string2, string3, string4, string5, string6, c0s1jValueOf, string7, string8, z, z2, z3, string9, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final QuickDMEventParam[] newArray(int i) {
            return new QuickDMEventParam[i];
        }
    };
    public final String authorId;
    public final String enterFrom;
    public final String enterMethod;
    public final String enterPosition;
    public final String followStatus;
    public final String friendsV3TrackScene;
    public final String groupId;
    public final boolean isDetail;
    public final boolean isFriendsV2Feed;
    public final boolean isImmersiveFeed;
    public final String isShowWithEmoji;
    public final boolean needFixStoryEnterPosition;
    public final C0S1J showAction;
    public final String storyFrom;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickDMEventParam)) {
            return false;
        }
        QuickDMEventParam quickDMEventParam = (QuickDMEventParam) obj;
        return Intrinsics.LJFF(this.enterPosition, quickDMEventParam.enterPosition) && Intrinsics.LJFF(this.enterFrom, quickDMEventParam.enterFrom) && Intrinsics.LJFF(this.groupId, quickDMEventParam.groupId) && Intrinsics.LJFF(this.authorId, quickDMEventParam.authorId) && Intrinsics.LJFF(this.followStatus, quickDMEventParam.followStatus) && Intrinsics.LJFF(this.enterMethod, quickDMEventParam.enterMethod) && this.showAction == quickDMEventParam.showAction && Intrinsics.LJFF(this.isShowWithEmoji, quickDMEventParam.isShowWithEmoji) && Intrinsics.LJFF(this.storyFrom, quickDMEventParam.storyFrom) && this.needFixStoryEnterPosition == quickDMEventParam.needFixStoryEnterPosition && this.isImmersiveFeed == quickDMEventParam.isImmersiveFeed && this.isFriendsV2Feed == quickDMEventParam.isFriendsV2Feed && Intrinsics.LJFF(this.friendsV3TrackScene, quickDMEventParam.friendsV3TrackScene) && this.isDetail == quickDMEventParam.isDetail;
    }

    public final int hashCode() {
        String str = this.enterPosition;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterFrom;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authorId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.followStatus;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.enterMethod;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C0S1J c0s1j = this.showAction;
        int iHashCode7 = (((iHashCode6 + (c0s1j == null ? 0 : c0s1j.hashCode())) * 31) + this.isShowWithEmoji.hashCode()) * 31;
        String str7 = this.storyFrom;
        return ((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.needFixStoryEnterPosition)) * 31) + C786410Ut5.Z2(this.isImmersiveFeed)) * 31) + C786410Ut5.Z2(this.isFriendsV2Feed)) * 31) + this.friendsV3TrackScene.hashCode()) * 31) + C786410Ut5.Z2(this.isDetail);
    }

    public final String toString() {
        return "QuickDMEventParam(enterPosition=" + this.enterPosition + ", enterFrom=" + this.enterFrom + ", groupId=" + this.groupId + ", authorId=" + this.authorId + ", followStatus=" + this.followStatus + ", enterMethod=" + this.enterMethod + ", showAction=" + this.showAction + ", isShowWithEmoji=" + this.isShowWithEmoji + ", storyFrom=" + this.storyFrom + ", needFixStoryEnterPosition=" + this.needFixStoryEnterPosition + ", isImmersiveFeed=" + this.isImmersiveFeed + ", isFriendsV2Feed=" + this.isFriendsV2Feed + ", friendsV3TrackScene=" + this.friendsV3TrackScene + ", isDetail=" + this.isDetail + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterPosition);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.groupId);
        parcel.writeString(this.authorId);
        parcel.writeString(this.followStatus);
        parcel.writeString(this.enterMethod);
        C0S1J c0s1j = this.showAction;
        if (c0s1j == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c0s1j.name());
        }
        parcel.writeString(this.isShowWithEmoji);
        parcel.writeString(this.storyFrom);
        parcel.writeInt(this.needFixStoryEnterPosition ? 1 : 0);
        parcel.writeInt(this.isImmersiveFeed ? 1 : 0);
        parcel.writeInt(this.isFriendsV2Feed ? 1 : 0);
        parcel.writeString(this.friendsV3TrackScene);
        parcel.writeInt(this.isDetail ? 1 : 0);
    }

    public static QuickDMEventParam LIZ(QuickDMEventParam quickDMEventParam, String str, C0S1J c0s1j, String str2, int i) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0S1J c0s1j2 = c0s1j;
        String str9 = str2;
        String str10 = str;
        String str11 = null;
        if ((i & 1) != 0) {
            str3 = quickDMEventParam.enterPosition;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = quickDMEventParam.enterFrom;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = quickDMEventParam.groupId;
        } else {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str6 = quickDMEventParam.authorId;
        } else {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str7 = quickDMEventParam.followStatus;
        } else {
            str7 = null;
        }
        if ((i & 32) != 0) {
            str10 = quickDMEventParam.enterMethod;
        }
        if ((i & 64) != 0) {
            c0s1j2 = quickDMEventParam.showAction;
        }
        if ((i & 128) != 0) {
            str8 = quickDMEventParam.isShowWithEmoji;
        } else {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str11 = quickDMEventParam.storyFrom;
        }
        if ((i & 512) != 0) {
            z = quickDMEventParam.needFixStoryEnterPosition;
        } else {
            z = false;
        }
        if ((i & 1024) != 0) {
            z2 = quickDMEventParam.isImmersiveFeed;
        } else {
            z2 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z3 = quickDMEventParam.isFriendsV2Feed;
        } else {
            z3 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = quickDMEventParam.friendsV3TrackScene;
        }
        if ((i & 8192) != 0) {
            z4 = quickDMEventParam.isDetail;
        } else {
            z4 = false;
        }
        return new QuickDMEventParam(str3, str4, str5, str6, str7, str10, c0s1j2, str8, str11, z, z2, z3, str9, z4);
    }

    public /* synthetic */ QuickDMEventParam(String str, String str2, String str3, String str4, String str5, C0S1J c0s1j, String str6, String str7, boolean z, boolean z2, String str8, boolean z3, int i) {
        this(str, str2, str3, str4, str5, null, (i & 64) != 0 ? null : c0s1j, (i & 128) != 0 ? CardStruct.IStatusCode.DEFAULT : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2, false, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i & 8192) != 0 ? false : z3);
    }

    public QuickDMEventParam(String str, String str2, String str3, String str4, String str5, String str6, C0S1J c0s1j, String str7, String str8, boolean z, boolean z2, boolean z3, String str9, boolean z4) {
        this.enterPosition = str;
        this.enterFrom = str2;
        this.groupId = str3;
        this.authorId = str4;
        this.followStatus = str5;
        this.enterMethod = str6;
        this.showAction = c0s1j;
        this.isShowWithEmoji = str7;
        this.storyFrom = str8;
        this.needFixStoryEnterPosition = z;
        this.isImmersiveFeed = z2;
        this.isFriendsV2Feed = z3;
        this.friendsV3TrackScene = str9;
        this.isDetail = z4;
    }
}
