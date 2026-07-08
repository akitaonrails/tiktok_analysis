package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot;

import X.C2237861CiO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionCoordinateComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionInfoComponent;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotMentionInfoComponent implements BaseComponent<C2237861CiO> {
    public static final Parcelable.Creator<AIGroupShotMentionInfoComponent> CREATOR = new Parcelable.Creator<AIGroupShotMentionInfoComponent>() { // from class: X.0Zqw
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotMentionInfoComponent createFromParcel(Parcel parcel) {
            return new AIGroupShotMentionInfoComponent(parcel.readLong(), parcel.readString(), AIGroupShotMentionCoordinateComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotMentionInfoComponent[] newArray(int i) {
            return new AIGroupShotMentionInfoComponent[i];
        }
    };
    public final AIGroupShotMentionCoordinateComponent coordinate;
    public final String nickname;
    public final long userId;

    public AIGroupShotMentionInfoComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userId);
        parcel.writeString(this.nickname);
        this.coordinate.writeToParcel(parcel, i);
    }

    public /* synthetic */ AIGroupShotMentionInfoComponent(int i) {
        this(0L, "", new AIGroupShotMentionCoordinateComponent(0));
    }

    public AIGroupShotMentionInfoComponent(long j, String str, AIGroupShotMentionCoordinateComponent aIGroupShotMentionCoordinateComponent) {
        this.userId = j;
        this.nickname = str;
        this.coordinate = aIGroupShotMentionCoordinateComponent;
    }
}
