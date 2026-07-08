package com.ss.android.ugc.aweme.story.model.streaks;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryStreakEnterEditParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryStreakEnterEditParam> CREATOR = new Parcelable.Creator<StoryStreakEnterEditParam>() { // from class: X.0J1v
        @Override // android.os.Parcelable.Creator
        public final StoryStreakEnterEditParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            User user = (User) parcel.readSerializable();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
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
            return new StoryStreakEnterEditParam(string, string2, i, i2, string3, i3, user, string4, z, string5, string6, z2, z3, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryStreakEnterEditParam[] newArray(int i) {
            return new StoryStreakEnterEditParam[i];
        }
    };

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("enter_by_click_post_btn")
    public final boolean enterByClickPostBtn;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("info_desc_font_path")
    public String infoDescFontPath;

    @C09CT("info_number_font_path")
    public String infoNumberFontPath;

    @C09CT("is_fake_level")
    public boolean isFakeLevel;

    @C09CT("is_num_use_effect_font")
    public boolean isNumUseEffectFont;

    @C09CT("message_count")
    public final int messageCount;

    @C09CT("muf_days_count")
    public int mufDaysCount;

    @C09CT("peer_uid")
    public final String peerUid;

    @C09CT("poster_bg_color")
    public int posterBgColor;

    @C09CT("streak_level")
    public int streakLevel;

    @C09CT("streak_user")
    public final User streakUser;

    public StoryStreakEnterEditParam() {
        this("", "", -1, 0, null, 0, new User(), "", true, "", "", false, false, 0);
    }

    public final StoryStreakEnterEditParam copy(String str, String str2, int i, int i2, String str3, int i3, User user, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, int i4) {
        return new StoryStreakEnterEditParam(str, str2, i, i2, str3, i3, user, str4, z, str5, str6, z2, z3, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryStreakEnterEditParam)) {
            return false;
        }
        StoryStreakEnterEditParam storyStreakEnterEditParam = (StoryStreakEnterEditParam) obj;
        return Intrinsics.LJFF(this.enterFrom, storyStreakEnterEditParam.enterFrom) && Intrinsics.LJFF(this.enterMethod, storyStreakEnterEditParam.enterMethod) && this.streakLevel == storyStreakEnterEditParam.streakLevel && this.messageCount == storyStreakEnterEditParam.messageCount && Intrinsics.LJFF(this.conversationId, storyStreakEnterEditParam.conversationId) && this.mufDaysCount == storyStreakEnterEditParam.mufDaysCount && Intrinsics.LJFF(this.streakUser, storyStreakEnterEditParam.streakUser) && Intrinsics.LJFF(this.peerUid, storyStreakEnterEditParam.peerUid) && this.enterByClickPostBtn == storyStreakEnterEditParam.enterByClickPostBtn && Intrinsics.LJFF(this.infoDescFontPath, storyStreakEnterEditParam.infoDescFontPath) && Intrinsics.LJFF(this.infoNumberFontPath, storyStreakEnterEditParam.infoNumberFontPath) && this.isNumUseEffectFont == storyStreakEnterEditParam.isNumUseEffectFont && this.isFakeLevel == storyStreakEnterEditParam.isFakeLevel && this.posterBgColor == storyStreakEnterEditParam.posterBgColor;
    }

    public int hashCode() {
        int iHashCode = ((((((this.enterFrom.hashCode() * 31) + this.enterMethod.hashCode()) * 31) + this.streakLevel) * 31) + this.messageCount) * 31;
        String str = this.conversationId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mufDaysCount) * 31;
        User user = this.streakUser;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        String str2 = this.peerUid;
        return ((((((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.enterByClickPostBtn)) * 31) + this.infoDescFontPath.hashCode()) * 31) + this.infoNumberFontPath.hashCode()) * 31) + C786410Ut5.Z2(this.isNumUseEffectFont)) * 31) + C786410Ut5.Z2(this.isFakeLevel)) * 31) + this.posterBgColor;
    }

    public String toString() {
        return "StoryStreakEnterEditParam(enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", streakLevel=" + this.streakLevel + ", messageCount=" + this.messageCount + ", conversationId=" + this.conversationId + ", mufDaysCount=" + this.mufDaysCount + ", streakUser=" + this.streakUser + ", peerUid=" + this.peerUid + ", enterByClickPostBtn=" + this.enterByClickPostBtn + ", infoDescFontPath=" + this.infoDescFontPath + ", infoNumberFontPath=" + this.infoNumberFontPath + ", isNumUseEffectFont=" + this.isNumUseEffectFont + ", isFakeLevel=" + this.isFakeLevel + ", posterBgColor=" + this.posterBgColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.streakLevel);
        parcel.writeInt(this.messageCount);
        parcel.writeString(this.conversationId);
        parcel.writeInt(this.mufDaysCount);
        parcel.writeSerializable(this.streakUser);
        parcel.writeString(this.peerUid);
        parcel.writeInt(this.enterByClickPostBtn ? 1 : 0);
        parcel.writeString(this.infoDescFontPath);
        parcel.writeString(this.infoNumberFontPath);
        parcel.writeInt(this.isNumUseEffectFont ? 1 : 0);
        parcel.writeInt(this.isFakeLevel ? 1 : 0);
        parcel.writeInt(this.posterBgColor);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final boolean getEnterByClickPostBtn() {
        return this.enterByClickPostBtn;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getInfoDescFontPath() {
        return this.infoDescFontPath;
    }

    public final String getInfoNumberFontPath() {
        return this.infoNumberFontPath;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final int getMufDaysCount() {
        return this.mufDaysCount;
    }

    public final String getPeerUid() {
        return this.peerUid;
    }

    public final int getPosterBgColor() {
        return this.posterBgColor;
    }

    public final int getStreakLevel() {
        return this.streakLevel;
    }

    public final User getStreakUser() {
        return this.streakUser;
    }

    public final boolean isFakeLevel() {
        return this.isFakeLevel;
    }

    public final boolean isNumUseEffectFont() {
        return this.isNumUseEffectFont;
    }

    public final void setFakeLevel(boolean z) {
        this.isFakeLevel = z;
    }

    public final void setInfoDescFontPath(String str) {
        this.infoDescFontPath = str;
    }

    public final void setInfoNumberFontPath(String str) {
        this.infoNumberFontPath = str;
    }

    public final void setMufDaysCount(int i) {
        this.mufDaysCount = i;
    }

    public final void setNumUseEffectFont(boolean z) {
        this.isNumUseEffectFont = z;
    }

    public final void setPosterBgColor(int i) {
        this.posterBgColor = i;
    }

    public final void setStreakLevel(int i) {
        this.streakLevel = i;
    }

    public StoryStreakEnterEditParam(String str, String str2, int i, int i2, String str3, int i3, User user, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, int i4) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.streakLevel = i;
        this.messageCount = i2;
        this.conversationId = str3;
        this.mufDaysCount = i3;
        this.streakUser = user;
        this.peerUid = str4;
        this.enterByClickPostBtn = z;
        this.infoDescFontPath = str5;
        this.infoNumberFontPath = str6;
        this.isNumUseEffectFont = z2;
        this.isFakeLevel = z3;
        this.posterBgColor = i4;
    }
}
