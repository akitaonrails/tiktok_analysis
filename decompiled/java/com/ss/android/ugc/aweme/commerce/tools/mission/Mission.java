package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.C09CT;
import X.C19459111Bd;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class Mission implements Parcelable, Serializable {

    @C09CT("challenges")
    public final List<String> challengeNames;

    @C09CT("customized_statement")
    public List<String> customizedStatement;

    @C09CT("enable_hashtag_sticker")
    public boolean enableHashtagSticker;

    @C09CT("enable_image_sticker")
    public boolean enableImageSticker;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("image_sticker")
    public MissionImageSticker imageSticker;

    @C09CT("is_challenge_toasted")
    public boolean isChallengeToasted;

    @C09CT("is_duet")
    public boolean isDuet;

    @C09CT("is_music_toasted")
    public boolean isMusicToasted;

    @C09CT("is_user_toasted")
    public boolean isUserToasted;

    @C09CT("mentioned_user")
    public List<MissionUser> mentionedUsers;

    @C09CT("mission_id")
    public final String missionId;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("is_sticker_toasted")
    public boolean userEverChoseDifferentSticker;
    public static final C19459111Bd Companion = new C19459111Bd();
    public static final Parcelable.Creator<Mission> CREATOR = new Parcelable.Creator<Mission>() { // from class: X.11Bc
        @Override // android.os.Parcelable.Creator
        public final Mission createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList arrayList;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            MissionImageSticker missionImageStickerCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MissionUser.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                missionImageStickerCreateFromParcel = MissionImageSticker.CREATOR.createFromParcel(parcel);
            }
            MissionImageSticker missionImageSticker = missionImageStickerCreateFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new Mission(string, string2, z, string3, z2, arrayListCreateStringArrayList, z3, arrayList, z4, string4, missionImageSticker, z5, z6, z7, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Mission[] newArray(int i) {
            return new Mission[i];
        }
    };

    public Mission() {
        this(null, null, false, null, true, null, true, null, true, null, null, false, false, false, null);
    }

    public static final Mission newInstanceForMusic(String str, String str2, String str3) {
        Companion.getClass();
        return C19459111Bd.LIZ(str, str2, str3);
    }

    public final Mission copy(String str, String str2, boolean z, String str3, boolean z2, List<String> list, boolean z3, List<MissionUser> list2, boolean z4, String str4, MissionImageSticker missionImageSticker, boolean z5, boolean z6, boolean z7, List<String> list3) {
        return new Mission(str, str2, z, str3, z2, list, z3, list2, z4, str4, missionImageSticker, z5, z6, z7, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mission)) {
            return false;
        }
        Mission mission = (Mission) obj;
        return Intrinsics.LJFF(this.missionId, mission.missionId) && Intrinsics.LJFF(this.stickerId, mission.stickerId) && this.userEverChoseDifferentSticker == mission.userEverChoseDifferentSticker && Intrinsics.LJFF(this.musicId, mission.musicId) && this.isMusicToasted == mission.isMusicToasted && Intrinsics.LJFF(this.challengeNames, mission.challengeNames) && this.isChallengeToasted == mission.isChallengeToasted && Intrinsics.LJFF(this.mentionedUsers, mission.mentionedUsers) && this.isUserToasted == mission.isUserToasted && Intrinsics.LJFF(this.enterFrom, mission.enterFrom) && Intrinsics.LJFF(this.imageSticker, mission.imageSticker) && this.enableHashtagSticker == mission.enableHashtagSticker && this.enableImageSticker == mission.enableImageSticker && this.isDuet == mission.isDuet && Intrinsics.LJFF(this.customizedStatement, mission.customizedStatement);
    }

    public int hashCode() {
        String str = this.missionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stickerId;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.userEverChoseDifferentSticker)) * 31;
        String str3 = this.musicId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.isMusicToasted)) * 31;
        List<String> list = this.challengeNames;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.isChallengeToasted)) * 31;
        List<MissionUser> list2 = this.mentionedUsers;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.isUserToasted)) * 31;
        String str4 = this.enterFrom;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MissionImageSticker missionImageSticker = this.imageSticker;
        int iHashCode7 = (((((((iHashCode6 + (missionImageSticker == null ? 0 : missionImageSticker.hashCode())) * 31) + C786410Ut5.Z2(this.enableHashtagSticker)) * 31) + C786410Ut5.Z2(this.enableImageSticker)) * 31) + C786410Ut5.Z2(this.isDuet)) * 31;
        List<String> list3 = this.customizedStatement;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "Mission(missionId=" + this.missionId + ", stickerId=" + this.stickerId + ", userEverChoseDifferentSticker=" + this.userEverChoseDifferentSticker + ", musicId=" + this.musicId + ", isMusicToasted=" + this.isMusicToasted + ", challengeNames=" + this.challengeNames + ", isChallengeToasted=" + this.isChallengeToasted + ", mentionedUsers=" + this.mentionedUsers + ", isUserToasted=" + this.isUserToasted + ", enterFrom=" + this.enterFrom + ", imageSticker=" + this.imageSticker + ", enableHashtagSticker=" + this.enableHashtagSticker + ", enableImageSticker=" + this.enableImageSticker + ", isDuet=" + this.isDuet + ", customizedStatement=" + this.customizedStatement + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.missionId);
        parcel.writeString(this.stickerId);
        parcel.writeInt(this.userEverChoseDifferentSticker ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.isMusicToasted ? 1 : 0);
        parcel.writeStringList(this.challengeNames);
        parcel.writeInt(this.isChallengeToasted ? 1 : 0);
        List<MissionUser> list = this.mentionedUsers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MissionUser> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isUserToasted ? 1 : 0);
        parcel.writeString(this.enterFrom);
        MissionImageSticker missionImageSticker = this.imageSticker;
        if (missionImageSticker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            missionImageSticker.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enableHashtagSticker ? 1 : 0);
        parcel.writeInt(this.enableImageSticker ? 1 : 0);
        parcel.writeInt(this.isDuet ? 1 : 0);
        parcel.writeStringList(this.customizedStatement);
    }

    public final List<String> getChallengeNames() {
        return this.challengeNames;
    }

    public final List<String> getCustomizedStatement() {
        return this.customizedStatement;
    }

    public final boolean getEnableHashtagSticker() {
        return this.enableHashtagSticker;
    }

    public final boolean getEnableImageSticker() {
        return this.enableImageSticker;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final MissionImageSticker getImageSticker() {
        return this.imageSticker;
    }

    public final List<MissionUser> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final boolean getUserEverChoseDifferentSticker() {
        return this.userEverChoseDifferentSticker;
    }

    public final boolean isChallengeToasted() {
        return this.isChallengeToasted;
    }

    public final boolean isDuet() {
        return this.isDuet;
    }

    public final boolean isMusicToasted() {
        return this.isMusicToasted;
    }

    public final boolean isUserToasted() {
        return this.isUserToasted;
    }

    public final void setChallengeToasted(boolean z) {
        this.isChallengeToasted = z;
    }

    public final void setCustomizedStatement(List<String> list) {
        this.customizedStatement = list;
    }

    public final void setDuet(boolean z) {
        this.isDuet = z;
    }

    public final void setEnableHashtagSticker(boolean z) {
        this.enableHashtagSticker = z;
    }

    public final void setEnableImageSticker(boolean z) {
        this.enableImageSticker = z;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setImageSticker(MissionImageSticker missionImageSticker) {
        this.imageSticker = missionImageSticker;
    }

    public final void setMentionedUsers(List<MissionUser> list) {
        this.mentionedUsers = list;
    }

    public final void setMusicToasted(boolean z) {
        this.isMusicToasted = z;
    }

    public final void setUserEverChoseDifferentSticker(boolean z) {
        this.userEverChoseDifferentSticker = z;
    }

    public final void setUserToasted(boolean z) {
        this.isUserToasted = z;
    }

    public Mission(String str, String str2, boolean z, String str3, boolean z2, List<String> list, boolean z3, List<MissionUser> list2, boolean z4, String str4, MissionImageSticker missionImageSticker, boolean z5, boolean z6, boolean z7, List<String> list3) {
        this.missionId = str;
        this.stickerId = str2;
        this.userEverChoseDifferentSticker = z;
        this.musicId = str3;
        this.isMusicToasted = z2;
        this.challengeNames = list;
        this.isChallengeToasted = z3;
        this.mentionedUsers = list2;
        this.isUserToasted = z4;
        this.enterFrom = str4;
        this.imageSticker = missionImageSticker;
        this.enableHashtagSticker = z5;
        this.enableImageSticker = z6;
        this.isDuet = z7;
        this.customizedStatement = list3;
    }
}
