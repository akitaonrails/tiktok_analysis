package com.ss.android.ugc.aweme.creative.model.story.stickercreate;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryStreakModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<StoryStreakModel> CREATOR = new Parcelable.Creator<StoryStreakModel>() { // from class: X.0msr
        @Override // android.os.Parcelable.Creator
        public final StoryStreakModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            int i = parcel.readInt();
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
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new StoryStreakModel(i, string, z, z2, i2, arrayList, parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryStreakModel[] newArray(int i) {
            return new StoryStreakModel[i];
        }
    };

    @C09CT("avatar_list")
    public List<? extends UrlModel> avatarList;

    @C09CT("can_show_multi_info")
    public boolean canShowMultiInfo;

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("group_days")
    public int groupDays;

    @C09CT("group_name")
    public String groupName;

    @C09CT("is_fake_level")
    public boolean isFakeLevel;

    @C09CT("member_cont")
    public int memberCount;

    @C09CT("message_count")
    public int messageCount;

    @C09CT("streak_level")
    public int streakLevel;

    public StoryStreakModel() {
        this(-1, null, false, true, 0, null, null, 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.streakLevel);
        parcel.writeString(this.conversationId);
        parcel.writeInt(this.isFakeLevel ? 1 : 0);
        parcel.writeInt(this.canShowMultiInfo ? 1 : 0);
        parcel.writeInt(this.memberCount);
        List<? extends UrlModel> list = this.avatarList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends UrlModel> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeString(this.groupName);
        parcel.writeInt(this.messageCount);
        parcel.writeInt(this.groupDays);
    }

    public final List<UrlModel> getAvatarList() {
        return this.avatarList;
    }

    public final boolean getCanShowMultiInfo() {
        return this.canShowMultiInfo;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getGroupDays() {
        return this.groupDays;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final int getStreakLevel() {
        return this.streakLevel;
    }

    public final boolean isFakeLevel() {
        return this.isFakeLevel;
    }

    public final void setAvatarList(List<? extends UrlModel> list) {
        this.avatarList = list;
    }

    public final void setCanShowMultiInfo(boolean z) {
        this.canShowMultiInfo = z;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setFakeLevel(boolean z) {
        this.isFakeLevel = z;
    }

    public final void setGroupDays(int i) {
        this.groupDays = i;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setMemberCount(int i) {
        this.memberCount = i;
    }

    public final void setMessageCount(int i) {
        this.messageCount = i;
    }

    public final void setStreakLevel(int i) {
        this.streakLevel = i;
    }

    public StoryStreakModel(int i, String str, boolean z, boolean z2, int i2, List<? extends UrlModel> list, String str2, int i3, int i4) {
        this.streakLevel = i;
        this.conversationId = str;
        this.isFakeLevel = z;
        this.canShowMultiInfo = z2;
        this.memberCount = i2;
        this.avatarList = list;
        this.groupName = str2;
        this.messageCount = i3;
        this.groupDays = i4;
    }
}
