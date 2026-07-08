package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241071CnZ;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.AvatarDuoInvitationCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoTaskStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AvatarDuoInvitationCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<AvatarDuoInvitationCardTemplate> CREATOR = new Parcelable.Creator<AvatarDuoInvitationCardTemplate>() { // from class: X.18Yi
        @Override // android.os.Parcelable.Creator
        public final AvatarDuoInvitationCardTemplate createFromParcel(Parcel parcel) {
            Long lValueOf;
            ArrayList arrayList;
            AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            String string = parcel.readString();
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                avatarDuoTaskStatusComponentCreateFromParcel = null;
            } else {
                avatarDuoTaskStatusComponentCreateFromParcel = AvatarDuoTaskStatusComponent.CREATOR.createFromParcel(parcel);
            }
            AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent = avatarDuoTaskStatusComponentCreateFromParcel;
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                attachmentComponentCreateFromParcel = null;
            } else {
                attachmentComponentCreateFromParcel = AttachmentComponent.CREATOR.createFromParcel(parcel);
            }
            AttachmentComponent attachmentComponent = attachmentComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                baseHeaderComponentCreateFromParcel = null;
            } else {
                baseHeaderComponentCreateFromParcel = BaseHeaderComponent.CREATOR.createFromParcel(parcel);
            }
            BaseHeaderComponent baseHeaderComponent = baseHeaderComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                baseFooterComponentCreateFromParcel = BaseFooterComponent.CREATOR.createFromParcel(parcel);
            }
            return new AvatarDuoInvitationCardTemplate(string, lValueOf, arrayList, avatarDuoTaskStatusComponent, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarDuoInvitationCardTemplate[] newArray(int i) {
            return new AvatarDuoInvitationCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final Long creatorUid;
    public final int messageType;
    public final List<Long> participantUidList;
    public final PreviewHintComponent previewHintComponent;
    public final String taskId;
    public final AvatarDuoTaskStatusComponent taskStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarDuoInvitationCardTemplate() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarDuoInvitationCardTemplate)) {
            return false;
        }
        AvatarDuoInvitationCardTemplate avatarDuoInvitationCardTemplate = (AvatarDuoInvitationCardTemplate) obj;
        return Intrinsics.LJFF(this.taskId, avatarDuoInvitationCardTemplate.taskId) && Intrinsics.LJFF(this.creatorUid, avatarDuoInvitationCardTemplate.creatorUid) && Intrinsics.LJFF(this.participantUidList, avatarDuoInvitationCardTemplate.participantUidList) && this.taskStatus == avatarDuoInvitationCardTemplate.taskStatus && Intrinsics.LJFF(this.previewHintComponent, avatarDuoInvitationCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, avatarDuoInvitationCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, avatarDuoInvitationCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, avatarDuoInvitationCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, avatarDuoInvitationCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, avatarDuoInvitationCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.creatorUid;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<Long> list = this.participantUidList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent = this.taskStatus;
        int iHashCode4 = (((((((iHashCode3 + (avatarDuoTaskStatusComponent == null ? 0 : avatarDuoTaskStatusComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode5 = (iHashCode4 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode6 = (iHashCode5 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode6 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarDuoInvitationCardTemplate(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.creatorUid);
        sbLIZ.append(", participantUidList=");
        sbLIZ.append(this.participantUidList);
        sbLIZ.append(", taskStatus=");
        sbLIZ.append(this.taskStatus);
        sbLIZ.append(", previewHintComponent=");
        sbLIZ.append(this.previewHintComponent);
        sbLIZ.append(", baseRequestComponent=");
        sbLIZ.append(this.baseRequestComponent);
        sbLIZ.append(", baseResponseComponent=");
        sbLIZ.append(this.baseResponseComponent);
        sbLIZ.append(", attachment=");
        sbLIZ.append(this.attachment);
        sbLIZ.append(", baseHeaderComponent=");
        sbLIZ.append(this.baseHeaderComponent);
        sbLIZ.append(", baseFooterComponent=");
        sbLIZ.append(this.baseFooterComponent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2241071CnZ c2241071CnZ = new C2241071CnZ();
        c2241071CnZ.LIZLLL = this.taskId;
        c2241071CnZ.LJ = this.creatorUid;
        List<Long> list = this.participantUidList;
        C1516540pZE.LIZ(list);
        c2241071CnZ.LJFF = list;
        c2241071CnZ.LJI = AvatarDuoTaskStatusComponent.INVITE.toProto();
        c2241071CnZ.LJII = this.previewHintComponent.LIZIZ();
        c2241071CnZ.LJIIIIZZ = this.baseRequestComponent.LIZ();
        c2241961Cp0.LJIILLIIL = c2241071CnZ.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c2241961Cp0.build()));
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final AttachmentComponent Hs() {
        return this.attachment;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseResponseComponent Nc() {
        return this.baseResponseComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseFooterComponent dG() {
        return this.baseFooterComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final int getMessageType() {
        return this.messageType;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseHeaderComponent og() {
        return this.baseHeaderComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseRequestComponent rj() {
        return this.baseRequestComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final PreviewHintComponent yo() {
        return this.previewHintComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final Map<String, String> Xr(C869590Y9l c869590Y9l) {
        return c869590Y9l.getExt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskId);
        Long l = this.creatorUid;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<Long> list = this.participantUidList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent = this.taskStatus;
        if (avatarDuoTaskStatusComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatarDuoTaskStatusComponent.writeToParcel(parcel, i);
        }
        this.previewHintComponent.writeToParcel(parcel, i);
        this.baseRequestComponent.queryData.writeToParcel(parcel, i);
        this.baseResponseComponent.writeToParcel(parcel, i);
        AttachmentComponent attachmentComponent = this.attachment;
        if (attachmentComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attachmentComponent.writeToParcel(parcel, i);
        }
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        if (baseHeaderComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseHeaderComponent.text.writeToParcel(parcel, i);
        }
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        if (baseFooterComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseFooterComponent.writeToParcel(parcel, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return new AvatarDuoInvitationCardTemplate(this.taskId, this.creatorUid, this.participantUidList, this.taskStatus, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AvatarDuoInvitationCardTemplate(String str, Long l, List list, AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, int i) {
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent2 = avatarDuoTaskStatusComponent;
        List list2 = list;
        Long l2 = l;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        String str2 = (i & 1) != 0 ? null : str;
        l2 = (i & 2) != 0 ? null : l2;
        list2 = (i & 4) != 0 ? null : list2;
        avatarDuoTaskStatusComponent2 = (i & 8) != 0 ? null : avatarDuoTaskStatusComponent2;
        if ((i & 16) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 32) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(str2, l2, list2, avatarDuoTaskStatusComponent2, previewHintComponentLIZ, baseRequestComponentLIZ, (i & 64) != 0 ? new BaseResponseComponent(0L, 15) : null, null, null, null);
    }

    public AvatarDuoInvitationCardTemplate(String str, Long l, List<Long> list, AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.taskId = str;
        this.creatorUid = l;
        this.participantUidList = list;
        this.taskStatus = avatarDuoTaskStatusComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1815;
    }
}
