package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class InteractiveUserTask implements Parcelable, Serializable {

    @C09CT("parent_task_id")
    public String parentTaskId;

    @C09CT("room_id")
    public String roomId;

    @C09CT("task_status")
    public Integer taskStatus;

    @C09CT("user_id")
    public String userId;

    @C09CT("user_task_id")
    public String userTaskId;
    public static final Parcelable.Creator<InteractiveUserTask> CREATOR = new Parcelable.Creator<InteractiveUserTask>() { // from class: X.0wPj
        @Override // android.os.Parcelable.Creator
        public final InteractiveUserTask createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new InteractiveUserTask(string, string2, string3, string4, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final InteractiveUserTask[] newArray(int i) {
            return new InteractiveUserTask[i];
        }
    };
    public static final int $stable = 8;

    public InteractiveUserTask() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.userTaskId);
        parcel.writeString(this.parentTaskId);
        parcel.writeString(this.userId);
        parcel.writeString(this.roomId);
        Integer num = this.taskStatus;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final String getParentTaskId() {
        return this.parentTaskId;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Integer getTaskStatus() {
        return this.taskStatus;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserTaskId() {
        return this.userTaskId;
    }

    public final void setParentTaskId(String str) {
        this.parentTaskId = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setTaskStatus(Integer num) {
        this.taskStatus = num;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserTaskId(String str) {
        this.userTaskId = str;
    }

    public InteractiveUserTask(String str, String str2, String str3, String str4, Integer num) {
        this.userTaskId = str;
        this.parentTaskId = str2;
        this.userId = str3;
        this.roomId = str4;
        this.taskStatus = num;
    }
}
