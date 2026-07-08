package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C18ZU;
import X.C2237891CiR;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242161CpK;
import X.C2242241CpS;
import X.C2242251CpT;
import X.C2244301Csm;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import defpackage.BulletinExtraComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PictureCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<PictureCardTemplate> CREATOR = new Parcelable.Creator<PictureCardTemplate>() { // from class: X.1CpJ
        @Override // android.os.Parcelable.Creator
        public final PictureCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            Parcelable.Creator<ImageComponent> creator = ImageComponent.CREATOR;
            ImageComponent imageComponentCreateFromParcel = creator.createFromParcel(parcel);
            ImageComponent imageComponentCreateFromParcel2 = creator.createFromParcel(parcel);
            PictureCardFallbackInfoComponent pictureCardFallbackInfoComponentCreateFromParcel = PictureCardFallbackInfoComponent.CREATOR.createFromParcel(parcel);
            ActionLinkComponent actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            BulletinExtraComponent bulletinExtraComponentCreateFromParcel = BulletinExtraComponent.CREATOR.createFromParcel(parcel);
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
            return new PictureCardTemplate(imageComponentCreateFromParcel, imageComponentCreateFromParcel2, pictureCardFallbackInfoComponentCreateFromParcel, actionLinkComponentCreateFromParcel, bulletinExtraComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureCardTemplate[] newArray(int i) {
            return new PictureCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final BulletinExtraComponent bulletinExtraComponent;
    public final PictureCardFallbackInfoComponent fallbackInfo;
    public final ImageComponent imageComponent;
    public final ActionLinkComponent linkInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final ImageComponent thumbnailComponent;

    public PictureCardTemplate() {
        this(null, null, null, null, 2047);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictureCardTemplate)) {
            return false;
        }
        PictureCardTemplate pictureCardTemplate = (PictureCardTemplate) obj;
        return Intrinsics.LJFF(this.imageComponent, pictureCardTemplate.imageComponent) && Intrinsics.LJFF(this.thumbnailComponent, pictureCardTemplate.thumbnailComponent) && Intrinsics.LJFF(this.fallbackInfo, pictureCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.linkInfo, pictureCardTemplate.linkInfo) && Intrinsics.LJFF(this.bulletinExtraComponent, pictureCardTemplate.bulletinExtraComponent) && Intrinsics.LJFF(this.previewHintComponent, pictureCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, pictureCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, pictureCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, pictureCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, pictureCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, pictureCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.imageComponent.hashCode() * 31) + this.thumbnailComponent.hashCode()) * 31) + this.fallbackInfo.hashCode()) * 31) + this.linkInfo.hashCode()) * 31) + this.bulletinExtraComponent.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode2 = (iHashCode + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode3 = (iHashCode2 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode3 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    public final String toString() {
        return "PictureCardTemplate(imageComponent=" + this.imageComponent + ", thumbnailComponent=" + this.thumbnailComponent + ", fallbackInfo=" + this.fallbackInfo + ", linkInfo=" + this.linkInfo + ", bulletinExtraComponent=" + this.bulletinExtraComponent + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
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
        ByteString byteStringLIZJ = C1496910p3Z.LIZJ(c1496910p3Z, C2237891CiR.ADAPTER.encode(this.bulletinExtraComponent.LIZ()));
        C2242241CpS c2242241CpS = new C2242241CpS();
        c2242241CpS.LIZLLL = this.imageComponent.LIZIZ();
        c2242241CpS.LJ = this.thumbnailComponent.LIZIZ();
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent = this.fallbackInfo;
        pictureCardFallbackInfoComponent.getClass();
        C2242251CpT c2242251CpT = new C2242251CpT();
        c2242251CpT.LIZLLL = pictureCardFallbackInfoComponent.image.LIZIZ();
        c2242251CpT.LJ = pictureCardFallbackInfoComponent.text.LIZ();
        c2242251CpT.LJFF = pictureCardFallbackInfoComponent.linkInfo.LIZIZ();
        c2242241CpS.LJII = c2242251CpT.build();
        c2242241CpS.LJIIJ = byteStringLIZJ;
        c2242241CpS.LJFF = this.previewHintComponent.LIZIZ();
        c2242241CpS.LJIIJJI = this.baseRequestComponent.LIZ();
        c2242241CpS.LJI = this.linkInfo.LIZIZ();
        c2241961Cp0.LJ = c2242241CpS.build();
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

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return LIZ(this, null, null, null, null, null, 1791);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.imageComponent.writeToParcel(parcel, i);
        this.thumbnailComponent.writeToParcel(parcel, i);
        this.fallbackInfo.writeToParcel(parcel, i);
        this.linkInfo.writeToParcel(parcel, i);
        parcel.writeLong(this.bulletinExtraComponent.exposeCnt);
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
        AttachmentComponent attachmentComponent;
        if (C2242161CpK.LIZ(this)) {
            attachmentComponent = null;
        } else {
            attachmentComponent = this.attachment;
        }
        return LIZ(this, null, previewHintComponent, baseRequestComponent, baseResponseComponent, attachmentComponent, 1567);
    }

    public PictureCardTemplate(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, int i) {
        ImageComponent imageComponentLIZ;
        ImageComponent imageComponentLIZ2;
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent;
        ActionLinkComponent actionLinkComponentLIZ;
        BulletinExtraComponent bulletinExtraComponentLIZ;
        BaseResponseComponent baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        if ((i & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        } else {
            imageComponentLIZ = null;
        }
        if ((i & 2) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ2 = C18ZU.LIZ();
        } else {
            imageComponentLIZ2 = null;
        }
        if ((i & 4) != 0) {
            PictureCardFallbackInfoComponent.Companion.getClass();
            pictureCardFallbackInfoComponent = PictureCardFallbackInfoComponent.EMPTY_FALLBACK;
        } else {
            pictureCardFallbackInfoComponent = null;
        }
        if ((i & 8) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        } else {
            actionLinkComponentLIZ = null;
        }
        if ((i & 16) != 0) {
            BulletinExtraComponent.Companion.getClass();
            bulletinExtraComponentLIZ = BulletinExtraComponent.b.LIZ();
        } else {
            bulletinExtraComponentLIZ = null;
        }
        if ((i & 32) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 64) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        if ((i & 128) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        this(imageComponentLIZ, imageComponentLIZ2, pictureCardFallbackInfoComponent, actionLinkComponentLIZ, bulletinExtraComponentLIZ, previewHintComponentLIZ, baseRequestComponentLIZ, baseResponseComponent, (i & 256) != 0 ? null : attachmentComponent2, (i & 512) != 0 ? null : baseHeaderComponent2, null);
    }

    public static PictureCardTemplate LIZ(PictureCardTemplate pictureCardTemplate, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, int i) {
        ImageComponent imageComponent;
        ImageComponent imageComponent2;
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent;
        BulletinExtraComponent bulletinExtraComponent;
        BaseHeaderComponent baseHeaderComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        ActionLinkComponent actionLinkComponent2 = actionLinkComponent;
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 1) != 0) {
            imageComponent = pictureCardTemplate.imageComponent;
        } else {
            imageComponent = null;
        }
        if ((i & 2) != 0) {
            imageComponent2 = pictureCardTemplate.thumbnailComponent;
        } else {
            imageComponent2 = null;
        }
        if ((i & 4) != 0) {
            pictureCardFallbackInfoComponent = pictureCardTemplate.fallbackInfo;
        } else {
            pictureCardFallbackInfoComponent = null;
        }
        if ((i & 8) != 0) {
            actionLinkComponent2 = pictureCardTemplate.linkInfo;
        }
        if ((i & 16) != 0) {
            bulletinExtraComponent = pictureCardTemplate.bulletinExtraComponent;
        } else {
            bulletinExtraComponent = null;
        }
        if ((i & 32) != 0) {
            previewHintComponent2 = pictureCardTemplate.previewHintComponent;
        }
        if ((i & 64) != 0) {
            baseRequestComponent2 = pictureCardTemplate.baseRequestComponent;
        }
        if ((i & 128) != 0) {
            baseResponseComponent2 = pictureCardTemplate.baseResponseComponent;
        }
        if ((i & 256) != 0) {
            attachmentComponent2 = pictureCardTemplate.attachment;
        }
        if ((i & 512) != 0) {
            baseHeaderComponent = pictureCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 1024) != 0) {
            baseFooterComponent = pictureCardTemplate.baseFooterComponent;
        }
        pictureCardTemplate.getClass();
        return new PictureCardTemplate(imageComponent, imageComponent2, pictureCardFallbackInfoComponent, actionLinkComponent2, bulletinExtraComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, attachmentComponent2, baseHeaderComponent, baseFooterComponent);
    }

    public PictureCardTemplate(ImageComponent imageComponent, ImageComponent imageComponent2, PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent, ActionLinkComponent actionLinkComponent, BulletinExtraComponent bulletinExtraComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.imageComponent = imageComponent;
        this.thumbnailComponent = imageComponent2;
        this.fallbackInfo = pictureCardFallbackInfoComponent;
        this.linkInfo = actionLinkComponent;
        this.bulletinExtraComponent = bulletinExtraComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1802;
    }
}
