package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot;

import X.C2188811AlT;
import X.C2237221ChM;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionCoordinateComponent;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotMentionCoordinateComponent implements BaseComponent<C2237221ChM> {
    public static final Parcelable.Creator<AIGroupShotMentionCoordinateComponent> CREATOR = new Parcelable.Creator<AIGroupShotMentionCoordinateComponent>() { // from class: X.0Zqx
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotMentionCoordinateComponent createFromParcel(Parcel parcel) {
            return new AIGroupShotMentionCoordinateComponent(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotMentionCoordinateComponent[] newArray(int i) {
            return new AIGroupShotMentionCoordinateComponent[i];
        }
    };
    public final double x;
    public final double y;

    public AIGroupShotMentionCoordinateComponent() {
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
        if (!(obj instanceof AIGroupShotMentionCoordinateComponent)) {
            return false;
        }
        AIGroupShotMentionCoordinateComponent aIGroupShotMentionCoordinateComponent = (AIGroupShotMentionCoordinateComponent) obj;
        return Double.compare(this.x, aIGroupShotMentionCoordinateComponent.x) == 0 && Double.compare(this.y, aIGroupShotMentionCoordinateComponent.y) == 0;
    }

    public final int hashCode() {
        return (C786410Ut5.X2(this.x) * 31) + C786410Ut5.X2(this.y);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotMentionCoordinateComponent(x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.x);
        parcel.writeDouble(this.y);
    }

    public /* synthetic */ AIGroupShotMentionCoordinateComponent(int i) {
        this(0.0d, 0.0d);
    }

    public AIGroupShotMentionCoordinateComponent(double d, double d2) {
        this.x = d;
        this.y = d2;
    }
}
