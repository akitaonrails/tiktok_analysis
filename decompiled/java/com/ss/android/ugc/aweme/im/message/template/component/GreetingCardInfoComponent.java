package com.ss.android.ugc.aweme.im.message.template.component;

import X.C0IBH;
import X.C2188811AlT;
import X.C2243191Cqz;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GreetingCardInfoComponent implements BaseComponent<C2243191Cqz> {
    public static final Parcelable.Creator<GreetingCardInfoComponent> CREATOR = new Parcelable.Creator<GreetingCardInfoComponent>() { // from class: X.0ZnU
        @Override // android.os.Parcelable.Creator
        public final GreetingCardInfoComponent createFromParcel(Parcel parcel) {
            return new GreetingCardInfoComponent(parcel.readString(), parcel.readString(), parcel.readString(), C0IBH.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GreetingCardInfoComponent[] newArray(int i) {
            return new GreetingCardInfoComponent[i];
        }
    };
    public final String contentText;
    public final String festiveId;
    public final String receiverText;
    public final String senderText;
    public final C0IBH status;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreetingCardInfoComponent)) {
            return false;
        }
        GreetingCardInfoComponent greetingCardInfoComponent = (GreetingCardInfoComponent) obj;
        return Intrinsics.LJFF(this.senderText, greetingCardInfoComponent.senderText) && Intrinsics.LJFF(this.receiverText, greetingCardInfoComponent.receiverText) && Intrinsics.LJFF(this.contentText, greetingCardInfoComponent.contentText) && Intrinsics.LJFF(this.festiveId, greetingCardInfoComponent.festiveId) && this.status == greetingCardInfoComponent.status;
    }

    public final int hashCode() {
        return (((((((this.senderText.hashCode() * 31) + this.receiverText.hashCode()) * 31) + this.contentText.hashCode()) * 31) + this.festiveId.hashCode()) * 31) + this.status.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GreetingCardInfoComponent(senderText=");
        sbLIZ.append(this.senderText);
        sbLIZ.append(", receiverText=");
        sbLIZ.append(this.receiverText);
        sbLIZ.append(", contentText=");
        sbLIZ.append(this.contentText);
        sbLIZ.append(", festiveId=");
        sbLIZ.append(this.festiveId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.senderText);
        parcel.writeString(this.receiverText);
        parcel.writeString(this.contentText);
        parcel.writeString(this.festiveId);
        parcel.writeString(this.status.name());
    }

    public GreetingCardInfoComponent(String str, String str2, String str3, C0IBH c0ibh, String str4) {
        this.senderText = str;
        this.receiverText = str2;
        this.contentText = str3;
        this.festiveId = str4;
        this.status = c0ibh;
    }
}
