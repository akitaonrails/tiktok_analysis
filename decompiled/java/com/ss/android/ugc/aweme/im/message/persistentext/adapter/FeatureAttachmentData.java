package com.ss.android.ugc.aweme.im.message.persistentext.adapter;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class FeatureAttachmentData implements Parcelable {
    public static final Parcelable.Creator<FeatureAttachmentData> CREATOR = new Parcelable.Creator<FeatureAttachmentData>() { // from class: X.0ZDx
        @Override // android.os.Parcelable.Creator
        public final FeatureAttachmentData createFromParcel(Parcel parcel) {
            return new FeatureAttachmentData((AttachmentTypeComponent) parcel.readParcelable(FeatureAttachmentData.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readLong(), (TextComponent) parcel.readParcelable(FeatureAttachmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureAttachmentData[] newArray(int i) {
            return new FeatureAttachmentData[i];
        }
    };
    public final TextComponent content;
    public final String id;
    public final long originalCreateTime;
    public final AttachmentTypeComponent type;
    public final long uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public FeatureAttachmentData() {
        long j = 0;
        this((AttachmentTypeComponent) null, (String) (0 == true ? 1 : 0), j, j, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureAttachmentData)) {
            return false;
        }
        FeatureAttachmentData featureAttachmentData = (FeatureAttachmentData) obj;
        return this.type == featureAttachmentData.type && Intrinsics.LJFF(this.id, featureAttachmentData.id) && this.uid == featureAttachmentData.uid && this.originalCreateTime == featureAttachmentData.originalCreateTime && Intrinsics.LJFF(this.content, featureAttachmentData.content);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + C786410Ut5.Y2(this.uid)) * 31) + C786410Ut5.Y2(this.originalCreateTime)) * 31;
        TextComponent textComponent = this.content;
        return iHashCode + (textComponent == null ? 0 : textComponent.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureAttachmentData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", originalCreateTime=");
        sbLIZ.append(this.originalCreateTime);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.id);
        parcel.writeLong(this.uid);
        parcel.writeLong(this.originalCreateTime);
        parcel.writeParcelable(this.content, i);
    }

    public /* synthetic */ FeatureAttachmentData(AttachmentTypeComponent attachmentTypeComponent, String str, long j, long j2, int i) {
        this((i & 1) != 0 ? AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT : attachmentTypeComponent, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (TextComponent) null);
    }

    public FeatureAttachmentData(AttachmentTypeComponent attachmentTypeComponent, String str, long j, long j2, TextComponent textComponent) {
        this.type = attachmentTypeComponent;
        this.id = str;
        this.uid = j;
        this.originalCreateTime = j2;
        this.content = textComponent;
    }
}
