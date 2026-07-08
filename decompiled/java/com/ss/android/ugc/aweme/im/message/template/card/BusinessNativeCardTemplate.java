package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2240911CnJ;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BusinessNativeCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<BusinessNativeCardTemplate> CREATOR = new Parcelable.Creator<BusinessNativeCardTemplate>() { // from class: X.18Yg
        @Override // android.os.Parcelable.Creator
        public final BusinessNativeCardTemplate createFromParcel(Parcel parcel) {
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            String string = parcel.readString();
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                fallbackInfoComponentCreateFromParcel = null;
            } else {
                fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
            }
            FallbackInfoComponent fallbackInfoComponent = fallbackInfoComponentCreateFromParcel;
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
            return new BusinessNativeCardTemplate(string, fallbackInfoComponent, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessNativeCardTemplate[] newArray(int i) {
            return new BusinessNativeCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final String businessNativeInfo;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessNativeCardTemplate() {
        this(null, 0 == true ? 1 : 0, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessNativeCardTemplate)) {
            return false;
        }
        BusinessNativeCardTemplate businessNativeCardTemplate = (BusinessNativeCardTemplate) obj;
        return Intrinsics.LJFF(this.businessNativeInfo, businessNativeCardTemplate.businessNativeInfo) && Intrinsics.LJFF(this.fallbackInfo, businessNativeCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.previewHintComponent, businessNativeCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, businessNativeCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, businessNativeCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, businessNativeCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, businessNativeCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, businessNativeCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = this.businessNativeInfo.hashCode() * 31;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        int iHashCode2 = (((((((iHashCode + (fallbackInfoComponent == null ? 0 : fallbackInfoComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode3 = (iHashCode2 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode4 = (iHashCode3 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode4 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessNativeCardTemplate(businessNativeInfo=");
        sbLIZ.append(this.businessNativeInfo);
        sbLIZ.append(", fallbackInfo=");
        sbLIZ.append(this.fallbackInfo);
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
        C2240911CnJ c2240911CnJ = new C2240911CnJ();
        c2240911CnJ.LIZLLL = this.businessNativeInfo;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        c2240911CnJ.LJFF = fallbackInfoComponent != null ? fallbackInfoComponent.LIZ() : null;
        c2240911CnJ.LJI = this.previewHintComponent.LIZIZ();
        c2240911CnJ.LJII = this.baseRequestComponent.LIZ();
        c2240911CnJ.LJIIIIZZ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJJIII = c2240911CnJ.build();
        AttachmentComponent attachmentComponent = this.attachment;
        c2241961Cp0.LJJIJIIJIL = attachmentComponent != null ? attachmentComponent.LIZ() : null;
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
        parcel.writeString(this.businessNativeInfo);
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fallbackInfoComponent.writeToParcel(parcel, i);
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

    public /* synthetic */ BusinessNativeCardTemplate(String str, BaseRequestComponent baseRequestComponent, int i) {
        PreviewHintComponent previewHintComponentLIZ;
        BaseResponseComponent baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        String str2 = (i & 1) != 0 ? "" : str;
        if ((i & 4) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        } else {
            previewHintComponentLIZ = null;
        }
        if ((i & 8) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        if ((i & 16) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        this(str2, null, previewHintComponentLIZ, baseRequestComponentLIZ, baseResponseComponent, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return new BusinessNativeCardTemplate(this.businessNativeInfo, this.fallbackInfo, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public BusinessNativeCardTemplate(String str, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.businessNativeInfo = str;
        this.fallbackInfo = fallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 2001;
    }
}
