package com.ss.android.ugc.aweme.im.message.template.component;

import X.C1516540pZE;
import X.C1CUX;
import X.C2188811AlT;
import X.C2242761CqI;
import X.C2242771CqJ;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class AttachmentComponent implements BaseComponent<C2242771CqJ> {
    public static final Parcelable.Creator<AttachmentComponent> CREATOR = new Parcelable.Creator<AttachmentComponent>() { // from class: X.0IBR
        @Override // android.os.Parcelable.Creator
        public final AttachmentComponent createFromParcel(Parcel parcel) {
            boolean z;
            AttachmentTypeComponent attachmentTypeComponentCreateFromParcel = AttachmentTypeComponent.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            UrlStructComponent urlStructComponentCreateFromParcel = UrlStructComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AttachmentComponent(attachmentTypeComponentCreateFromParcel, string, j, j2, urlStructComponentCreateFromParcel, i, z, FallbackStatusComponent.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AttachmentComponent[] newArray(int i) {
            return new AttachmentComponent[i];
        }
    };
    public final int awemeType;
    public final UrlStructComponent cover;
    public final long expireAt;
    public final String id;
    public final boolean isStory;
    public final long originAuthorUid;
    public final FallbackStatusComponent status;
    public final AttachmentTypeComponent type;
    public final long uid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentComponent)) {
            return false;
        }
        AttachmentComponent attachmentComponent = (AttachmentComponent) obj;
        return this.type == attachmentComponent.type && Intrinsics.LJFF(this.id, attachmentComponent.id) && this.uid == attachmentComponent.uid && this.originAuthorUid == attachmentComponent.originAuthorUid && Intrinsics.LJFF(this.cover, attachmentComponent.cover) && this.awemeType == attachmentComponent.awemeType && this.isStory == attachmentComponent.isStory && this.status == attachmentComponent.status && this.expireAt == attachmentComponent.expireAt;
    }

    public final int hashCode() {
        return (((((((((((((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + C786410Ut5.Y2(this.uid)) * 31) + C786410Ut5.Y2(this.originAuthorUid)) * 31) + this.cover.hashCode()) * 31) + this.awemeType) * 31) + C786410Ut5.Z2(this.isStory)) * 31) + this.status.hashCode()) * 31) + C786410Ut5.Y2(this.expireAt);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AttachmentComponent(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", originAuthorUid=");
        sbLIZ.append(this.originAuthorUid);
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

    public final C2242771CqJ LIZ() {
        C2242761CqI c2242761CqI = new C2242761CqI();
        c2242761CqI.LIZLLL = this.type.toProto();
        c2242761CqI.LJ = this.id;
        c2242761CqI.LJFF = Long.valueOf(this.uid);
        c2242761CqI.LJII = Long.valueOf(this.originAuthorUid);
        UrlStructComponent urlStructComponent = this.cover;
        urlStructComponent.getClass();
        C1CUX c1cux = new C1CUX();
        List<String> list = urlStructComponent.url_list;
        C1516540pZE.LIZ(list);
        c1cux.LJ = list;
        c2242761CqI.LJI = c1cux.build();
        c2242761CqI.LJIIIZ = Integer.valueOf(this.awemeType);
        c2242761CqI.LJIIJ = Boolean.valueOf(this.isStory);
        c2242761CqI.LJIIJJI = this.status.toProto();
        c2242761CqI.LJIIL = Long.valueOf(this.expireAt);
        return c2242761CqI.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeLong(this.uid);
        parcel.writeLong(this.originAuthorUid);
        parcel.writeStringList(this.cover.url_list);
        parcel.writeInt(this.awemeType);
        parcel.writeInt(this.isStory ? 1 : 0);
        this.status.writeToParcel(parcel, i);
        parcel.writeLong(this.expireAt);
    }

    public AttachmentComponent(AttachmentTypeComponent attachmentTypeComponent, String str, long j, long j2, UrlStructComponent urlStructComponent, int i, boolean z, FallbackStatusComponent fallbackStatusComponent, long j3) {
        this.type = attachmentTypeComponent;
        this.id = str;
        this.uid = j;
        this.originAuthorUid = j2;
        this.cover = urlStructComponent;
        this.awemeType = i;
        this.isStory = z;
        this.status = fallbackStatusComponent;
        this.expireAt = j3;
    }
}
