package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot;

import X.C1CNE;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGroupShotUserInfoComponent implements BaseComponent<C1CNE> {
    public static final Parcelable.Creator<AIGroupShotUserInfoComponent> CREATOR = new Parcelable.Creator<AIGroupShotUserInfoComponent>() { // from class: X.1CNH
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotUserInfoComponent createFromParcel(Parcel parcel) {
            return new AIGroupShotUserInfoComponent(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotUserInfoComponent[] newArray(int i) {
            return new AIGroupShotUserInfoComponent[i];
        }
    };
    public final long userId;

    public AIGroupShotUserInfoComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIGroupShotUserInfoComponent) && this.userId == ((AIGroupShotUserInfoComponent) obj).userId;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.userId);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotUserInfoComponent(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userId);
    }

    public /* synthetic */ AIGroupShotUserInfoComponent(int i) {
        this(0L);
    }

    public AIGroupShotUserInfoComponent(long j) {
        this.userId = j;
    }
}
