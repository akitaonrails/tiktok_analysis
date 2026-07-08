package com.ss.android.ugc.aweme.im.message.template.card;

import X.C0NZT;
import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241031CnV;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.OnboardingCardTemplate;
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
public final class OnboardingCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<OnboardingCardTemplate> CREATOR = new Parcelable.Creator<OnboardingCardTemplate>() { // from class: X.18Yk
        @Override // android.os.Parcelable.Creator
        public final OnboardingCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            long j = parcel.readLong();
            C0NZT c0nztValueOf = C0NZT.valueOf(parcel.readString());
            int i = parcel.readInt();
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
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
            return new OnboardingCardTemplate(j, c0nztValueOf, i, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingCardTemplate[] newArray(int i) {
            return new OnboardingCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final int messageType;
    public final C0NZT onboardingCardStatus;
    public final PreviewHintComponent previewHintComponent;
    public final long targetUID;

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingCardTemplate() {
        this(0L, (C0NZT) null, (PreviewHintComponent) (0 == true ? 1 : 0), (BaseRequestComponent) (0 == true ? 1 : 0), (BaseResponseComponent) (0 == true ? 1 : 0), (AttachmentComponent) (0 == true ? 1 : 0), (BaseHeaderComponent) (0 == true ? 1 : 0), (BaseFooterComponent) (0 == true ? 1 : 0), 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingCardTemplate)) {
            return false;
        }
        OnboardingCardTemplate onboardingCardTemplate = (OnboardingCardTemplate) obj;
        return this.targetUID == onboardingCardTemplate.targetUID && this.onboardingCardStatus == onboardingCardTemplate.onboardingCardStatus && this.messageType == onboardingCardTemplate.messageType && Intrinsics.LJFF(this.previewHintComponent, onboardingCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, onboardingCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, onboardingCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, onboardingCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, onboardingCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, onboardingCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.targetUID) * 31) + this.onboardingCardStatus.hashCode()) * 31) + this.messageType) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
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
        sbLIZ.append("OnboardingCardTemplate(targetUID=");
        sbLIZ.append(this.targetUID);
        sbLIZ.append(", onboardingCardStatus=");
        sbLIZ.append(this.onboardingCardStatus);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.messageType);
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
        C2241031CnV c2241031CnV = new C2241031CnV();
        c2241031CnV.LIZLLL = Long.valueOf(this.targetUID);
        c2241031CnV.LJ = this.onboardingCardStatus;
        c2241031CnV.LJFF = this.previewHintComponent.LIZIZ();
        c2241031CnV.LJI = this.baseRequestComponent.LIZ();
        c2241031CnV.LJII = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJJI = c2241031CnV.build();
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
        parcel.writeLong(this.targetUID);
        parcel.writeString(this.onboardingCardStatus.name());
        parcel.writeInt(this.messageType);
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
        return new OnboardingCardTemplate(this.targetUID, this.onboardingCardStatus, this.messageType, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OnboardingCardTemplate(long j, C0NZT c0nzt, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i) {
        int i2;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        C0NZT c0nzt2 = c0nzt;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        long j2 = (i & 1) != 0 ? 0L : j;
        c0nzt2 = (i & 2) != 0 ? C0NZT.ONBOARDING_CARD_STATUS_UNKNOWN : c0nzt2;
        if ((i & 4) != 0) {
            i2 = 1824;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 16) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(j2, c0nzt2, i2, previewHintComponentLIZ, baseRequestComponentLIZ, (i & 32) != 0 ? new BaseResponseComponent(0L, 15) : baseResponseComponent2, (i & 64) != 0 ? null : attachmentComponent2, (i & 128) != 0 ? null : baseHeaderComponent2, (i & 256) == 0 ? baseFooterComponent : null);
    }

    public OnboardingCardTemplate(long j, C0NZT c0nzt, int i, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.targetUID = j;
        this.onboardingCardStatus = c0nzt;
        this.messageType = i;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
