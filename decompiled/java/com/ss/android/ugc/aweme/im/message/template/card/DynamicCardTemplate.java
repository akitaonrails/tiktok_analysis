package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242061CpA;
import X.C2242071CpB;
import X.C2242091CpD;
import X.C2242111CpF;
import X.C2242121CpG;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
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
public final class DynamicCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<DynamicCardTemplate> CREATOR = new Parcelable.Creator<DynamicCardTemplate>() { // from class: X.18Ye
        @Override // android.os.Parcelable.Creator
        public final DynamicCardTemplate createFromParcel(Parcel parcel) {
            DynamicInfoComponent dynamicInfoComponentCreateFromParcel;
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                dynamicInfoComponentCreateFromParcel = null;
            } else {
                dynamicInfoComponentCreateFromParcel = DynamicInfoComponent.CREATOR.createFromParcel(parcel);
            }
            DynamicInfoComponent dynamicInfoComponent = dynamicInfoComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                fallbackInfoComponentCreateFromParcel = null;
            } else {
                fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
            }
            FallbackInfoComponent fallbackInfoComponent = fallbackInfoComponentCreateFromParcel;
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
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
            return new DynamicCardTemplate(dynamicInfoComponent, fallbackInfoComponent, previewHintComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseRequestComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicCardTemplate[] newArray(int i) {
            return new DynamicCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final DynamicInfoComponent dynamicInfo;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicCardTemplate)) {
            return false;
        }
        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) obj;
        return Intrinsics.LJFF(this.dynamicInfo, dynamicCardTemplate.dynamicInfo) && Intrinsics.LJFF(this.fallbackInfo, dynamicCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.previewHintComponent, dynamicCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseResponseComponent, dynamicCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseRequestComponent, dynamicCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.attachment, dynamicCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, dynamicCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, dynamicCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        DynamicInfoComponent dynamicInfoComponent = this.dynamicInfo;
        int iHashCode = (dynamicInfoComponent == null ? 0 : dynamicInfoComponent.hashCode()) * 31;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        int iHashCode2 = (((((((iHashCode + (fallbackInfoComponent == null ? 0 : fallbackInfoComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31;
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
        sbLIZ.append("DynamicCardTemplate(dynamicInfo=");
        sbLIZ.append(this.dynamicInfo);
        sbLIZ.append(", fallbackInfo=");
        sbLIZ.append(this.fallbackInfo);
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
        C2242071CpB c2242071CpBBuild;
        C2242091CpD c2242091CpDBuild;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2242061CpA c2242061CpA = new C2242061CpA();
        DynamicInfoComponent dynamicInfoComponent = this.dynamicInfo;
        if (dynamicInfoComponent != null) {
            C2242111CpF c2242111CpF = new C2242111CpF();
            c2242111CpF.LIZLLL = dynamicInfoComponent.cardKey;
            c2242111CpF.LJ = dynamicInfoComponent.schema;
            c2242111CpF.LJFF = dynamicInfoComponent.cardTemplate;
            c2242111CpF.LJIIJJI = dynamicInfoComponent.rawData;
            c2242111CpF.LJI = dynamicInfoComponent.businessType;
            c2242111CpF.LJII = dynamicInfoComponent.businessId;
            c2242111CpF.LJIIIIZZ = Integer.valueOf(dynamicInfoComponent.defaultHeight);
            c2242111CpF.LJIIIZ = Integer.valueOf(dynamicInfoComponent.defaultWidth);
            DynamicUiLocationType dynamicUiLocationType = dynamicInfoComponent.uiLocationType;
            c2242111CpF.LJIIJ = dynamicUiLocationType != null ? dynamicUiLocationType.toProto() : null;
            Map<String, String> map = dynamicInfoComponent.bizParams;
            C1516540pZE.LIZIZ(map);
            c2242111CpF.LJIIL = map;
            DynamicCardClientInfoComponent dynamicCardClientInfoComponent = dynamicInfoComponent.dynamicCardClientInfo;
            if (dynamicCardClientInfoComponent != null) {
                C2242121CpG c2242121CpG = new C2242121CpG();
                c2242121CpG.LJ = dynamicCardClientInfoComponent.resourceId;
                c2242121CpG.LIZLLL = dynamicCardClientInfoComponent.resourceType;
                c2242121CpG.LJFF = dynamicCardClientInfoComponent.resourceCoverUrl;
                c2242091CpDBuild = c2242121CpG.build();
            } else {
                c2242091CpDBuild = null;
            }
            c2242111CpF.LJIILIIL = c2242091CpDBuild;
            c2242071CpBBuild = c2242111CpF.build();
        } else {
            c2242071CpBBuild = null;
        }
        c2242061CpA.LIZLLL = c2242071CpBBuild;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        c2242061CpA.LJ = fallbackInfoComponent != null ? fallbackInfoComponent.LIZ() : null;
        c2242061CpA.LJFF = this.previewHintComponent.LIZIZ();
        c2242061CpA.LJI = this.baseRequestComponent.LIZ();
        c2242061CpA.LJII = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJJII = c2242061CpA.build();
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

    public /* synthetic */ DynamicCardTemplate(DynamicInfoComponent dynamicInfoComponent) {
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseResponseComponent baseResponseComponent = new BaseResponseComponent(0L, 15);
        BaseRequestComponent.Companion.getClass();
        this(dynamicInfoComponent, null, previewHintComponentLIZ, baseResponseComponent, C18Y8.LIZ(), null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final Map<String, String> Xr(C869590Y9l c869590Y9l) {
        return c869590Y9l.getExt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DynamicInfoComponent dynamicInfoComponent = this.dynamicInfo;
        if (dynamicInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicInfoComponent.writeToParcel(parcel, i);
        }
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fallbackInfoComponent.writeToParcel(parcel, i);
        }
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
        return new DynamicCardTemplate(this.dynamicInfo, this.fallbackInfo, previewHintComponent, baseResponseComponent, baseRequestComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public DynamicCardTemplate(DynamicInfoComponent dynamicInfoComponent, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.dynamicInfo = dynamicInfoComponent;
        this.fallbackInfo = fallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 2000;
    }
}
