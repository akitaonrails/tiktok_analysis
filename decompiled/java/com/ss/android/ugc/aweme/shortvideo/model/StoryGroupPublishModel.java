package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryGroupPublishModel implements Parcelable {
    public static final Parcelable.Creator<StoryGroupPublishModel> CREATOR = new Creator();

    @C09CT("childCount")
    public final int childCount;

    @C09CT("childIndex")
    public final int childIndex;

    @C09CT("failed_count")
    public int failedCount;

    @C09CT("groupId")
    public final String groupId;

    @C09CT("scheduleCount")
    public final int scheduleCount;

    @C09CT("scheduleIndex")
    public final int scheduleIndex;

    public static final class Creator implements Parcelable.Creator<StoryGroupPublishModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoryGroupPublishModel createFromParcel(Parcel parcel) {
            return new StoryGroupPublishModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoryGroupPublishModel[] newArray(int i) {
            return new StoryGroupPublishModel[i];
        }
    }

    public final StoryGroupPublishModel copy(String str, int i, int i2, int i3, int i4, int i5) {
        return new StoryGroupPublishModel(str, i, i2, i3, i4, i5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGroupPublishModel)) {
            return false;
        }
        StoryGroupPublishModel storyGroupPublishModel = (StoryGroupPublishModel) obj;
        return Intrinsics.LJFF(this.groupId, storyGroupPublishModel.groupId) && this.childCount == storyGroupPublishModel.childCount && this.childIndex == storyGroupPublishModel.childIndex && this.scheduleCount == storyGroupPublishModel.scheduleCount && this.scheduleIndex == storyGroupPublishModel.scheduleIndex && this.failedCount == storyGroupPublishModel.failedCount;
    }

    public int hashCode() {
        return (((((((((this.groupId.hashCode() * 31) + this.childCount) * 31) + this.childIndex) * 31) + this.scheduleCount) * 31) + this.scheduleIndex) * 31) + this.failedCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryGroupPublishModel(groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", childCount=");
        sbLIZ.append(this.childCount);
        sbLIZ.append(", childIndex=");
        sbLIZ.append(this.childIndex);
        sbLIZ.append(", scheduleCount=");
        sbLIZ.append(this.scheduleCount);
        sbLIZ.append(", scheduleIndex=");
        sbLIZ.append(this.scheduleIndex);
        sbLIZ.append(", failedCount=");
        sbLIZ.append(this.failedCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.groupId);
        parcel.writeInt(this.childCount);
        parcel.writeInt(this.childIndex);
        parcel.writeInt(this.scheduleCount);
        parcel.writeInt(this.scheduleIndex);
        parcel.writeInt(this.failedCount);
    }

    public StoryGroupPublishModel() {
        this("", 1, 0, 1, 0, 0);
    }

    public final int getChildCount() {
        return this.childCount;
    }

    public final int getChildIndex() {
        return this.childIndex;
    }

    public final int getFailedCount() {
        return this.failedCount;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final int getScheduleCount() {
        return this.scheduleCount;
    }

    public final int getScheduleIndex() {
        return this.scheduleIndex;
    }

    public final void setFailedCount(int i) {
        this.failedCount = i;
    }

    public StoryGroupPublishModel(String str, int i, int i2, int i3, int i4, int i5) {
        this.groupId = str;
        this.childCount = i;
        this.childIndex = i2;
        this.scheduleCount = i3;
        this.scheduleIndex = i4;
        this.failedCount = i5;
    }
}
