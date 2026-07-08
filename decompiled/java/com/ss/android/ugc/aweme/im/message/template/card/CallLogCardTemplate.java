package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2240991CnR;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC901220ZXc;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.CallLogCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CallLogCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<CallLogCardTemplate> CREATOR = new Parcelable.Creator<CallLogCardTemplate>() { // from class: X.18Yl
        @Override // android.os.Parcelable.Creator
        public final CallLogCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            long j = parcel.readLong();
            EnumC901220ZXc enumC901220ZXcValueOf = EnumC901220ZXc.valueOf(parcel.readString());
            long j2 = parcel.readLong();
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
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
            return new CallLogCardTemplate(j, enumC901220ZXcValueOf, j2, previewHintComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseRequestComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CallLogCardTemplate[] newArray(int i) {
            return new CallLogCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final long callDurationMs;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final EnumC901220ZXc roomMemberStatus;
    public final long roomMemberUid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CallLogCardTemplate() {
        long j = 0;
        this(j, null, j, 0 == true ? 1 : 0, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallLogCardTemplate)) {
            return false;
        }
        CallLogCardTemplate callLogCardTemplate = (CallLogCardTemplate) obj;
        return this.roomMemberUid == callLogCardTemplate.roomMemberUid && this.roomMemberStatus == callLogCardTemplate.roomMemberStatus && this.callDurationMs == callLogCardTemplate.callDurationMs && Intrinsics.LJFF(this.previewHintComponent, callLogCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseResponseComponent, callLogCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseRequestComponent, callLogCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.attachment, callLogCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, callLogCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, callLogCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.roomMemberUid) * 31) + this.roomMemberStatus.hashCode()) * 31) + C786410Ut5.Y2(this.callDurationMs)) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode = (iY2 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode2 = (iHashCode + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode2 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallLogCardTemplate(roomMemberUid=");
        sbLIZ.append(this.roomMemberUid);
        sbLIZ.append(", roomMemberStatus=");
        sbLIZ.append(this.roomMemberStatus);
        sbLIZ.append(", callDurationMs=");
        sbLIZ.append(this.callDurationMs);
        sbLIZ.append(", previewHintComponent=");
        sbLIZ.append(this.previewHintComponent);
        sbLIZ.append(", baseResponseComponent=");
        sbLIZ.append(this.baseResponseComponent);
        sbLIZ.append(", baseRequestComponent=");
        sbLIZ.append(this.baseRequestComponent);
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
        AttachmentComponent attachmentComponent = this.attachment;
        c2241961Cp0.LJJIJIIJIL = attachmentComponent != null ? attachmentComponent.LIZ() : null;
        C2240991CnR c2240991CnR = new C2240991CnR();
        c2240991CnR.LIZLLL = Long.valueOf(this.roomMemberUid);
        c2240991CnR.LJ = this.roomMemberStatus;
        c2240991CnR.LJFF = Long.valueOf(this.callDurationMs);
        c2240991CnR.LJI = this.previewHintComponent.LIZIZ();
        c2240991CnR.LJIIIIZZ = this.baseRequestComponent.LIZ();
        c2240991CnR.LJIIIZ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJJ = c2240991CnR.build();
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
        parcel.writeLong(this.roomMemberUid);
        parcel.writeString(this.roomMemberStatus.name());
        parcel.writeLong(this.callDurationMs);
        this.previewHintComponent.writeToParcel(parcel, i);
        this.baseResponseComponent.writeToParcel(parcel, i);
        this.baseRequestComponent.queryData.writeToParcel(parcel, i);
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
        return new CallLogCardTemplate(this.roomMemberUid, this.roomMemberStatus, this.callDurationMs, previewHintComponent, baseResponseComponent, baseRequestComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public /* synthetic */ CallLogCardTemplate(long j, EnumC901220ZXc enumC901220ZXc, long j2, PreviewHintComponent previewHintComponent, int i) {
        BaseResponseComponent baseResponseComponent;
        long j3 = j2;
        EnumC901220ZXc enumC901220ZXc2 = enumC901220ZXc;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        long j4 = (i & 1) != 0 ? 0L : j;
        enumC901220ZXc2 = (i & 2) != 0 ? EnumC901220ZXc.MemberStatusUnknown : enumC901220ZXc2;
        j3 = (i & 4) != 0 ? 0L : j3;
        if ((i & 8) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        BaseRequestComponent baseRequestComponentLIZ = null;
        if ((i & 16) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        if ((i & 32) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(j4, enumC901220ZXc2, j3, previewHintComponentLIZ, baseResponseComponent, baseRequestComponentLIZ, null, null, null);
    }

    public CallLogCardTemplate(long j, EnumC901220ZXc enumC901220ZXc, long j2, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.roomMemberUid = j;
        this.roomMemberStatus = enumC901220ZXc;
        this.callDurationMs = j2;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1823;
    }
}
