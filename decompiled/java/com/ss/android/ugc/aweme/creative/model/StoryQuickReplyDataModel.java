package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.StoryQuickReplyDataModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoryQuickReplyDataModel implements Parcelable {
    public static final Parcelable.Creator<StoryQuickReplyDataModel> CREATOR = new Parcelable.Creator<StoryQuickReplyDataModel>() { // from class: X.02tu
        @Override // android.os.Parcelable.Creator
        public final StoryQuickReplyDataModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            String string = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new StoryQuickReplyDataModel(i, string, j, j2, arrayListCreateStringArrayList, i2, z, parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryQuickReplyDataModel[] newArray(int i) {
            return new StoryQuickReplyDataModel[i];
        }
    };

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("cover")
    public final List<String> cover;

    @C09CT("expire_at")
    public final long expireAt;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_story")
    public final boolean isStory;

    @C09CT("origin_aid")
    public final long originAid;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("type")
    public final int type;

    @C09CT("uid")
    public final long uid;

    public StoryQuickReplyDataModel() {
        this(0, null, 0L, 0L, null, 0, false, 0, 0L, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryQuickReplyDataModel)) {
            return false;
        }
        StoryQuickReplyDataModel storyQuickReplyDataModel = (StoryQuickReplyDataModel) obj;
        return this.type == storyQuickReplyDataModel.type && Intrinsics.LJFF(this.id, storyQuickReplyDataModel.id) && this.uid == storyQuickReplyDataModel.uid && this.originAid == storyQuickReplyDataModel.originAid && Intrinsics.LJFF(this.cover, storyQuickReplyDataModel.cover) && this.awemeType == storyQuickReplyDataModel.awemeType && this.isStory == storyQuickReplyDataModel.isStory && this.status == storyQuickReplyDataModel.status && this.expireAt == storyQuickReplyDataModel.expireAt;
    }

    public final int hashCode() {
        return (((((((((((((((this.type * 31) + this.id.hashCode()) * 31) + C786410Ut5.Y2(this.uid)) * 31) + C786410Ut5.Y2(this.originAid)) * 31) + this.cover.hashCode()) * 31) + this.awemeType) * 31) + C786410Ut5.Z2(this.isStory)) * 31) + this.status) * 31) + C786410Ut5.Y2(this.expireAt);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryQuickReplyDataModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", originAid=");
        sbLIZ.append(this.originAid);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.isStory);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", expireAt=");
        sbLIZ.append(this.expireAt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.id);
        parcel.writeLong(this.uid);
        parcel.writeLong(this.originAid);
        parcel.writeStringList(this.cover);
        parcel.writeInt(this.awemeType);
        parcel.writeInt(this.isStory ? 1 : 0);
        parcel.writeInt(this.status);
        parcel.writeLong(this.expireAt);
    }

    public StoryQuickReplyDataModel(int i, String str, long j, long j2, List<String> list, int i2, boolean z, int i3, long j3) {
        this.type = i;
        this.id = str;
        this.uid = j;
        this.originAid = j2;
        this.cover = list;
        this.awemeType = i2;
        this.isStory = z;
        this.status = i3;
        this.expireAt = j3;
    }

    public StoryQuickReplyDataModel(int i, String str, long j, long j2, List list, int i2, boolean z, int i3, long j3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0L : j, (i4 & 8) != 0 ? 0L : j2, (i4 & 16) != 0 ? C13BV.INSTANCE : list, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? false : z, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) == 0 ? j3 : 0L);
    }
}
