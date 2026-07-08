package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C18ZU;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242391Cph;
import X.C2242511Cpt;
import X.C2243491CrT;
import X.C2244301Csm;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PortraitCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<PortraitCardTemplate> CREATOR = new Parcelable.Creator<PortraitCardTemplate>() { // from class: X.1Cpg
        @Override // android.os.Parcelable.Creator
        public final PortraitCardTemplate createFromParcel(Parcel parcel) {
            ImageComponent imageComponentCreateFromParcel;
            BaseUserComponent baseUserComponentCreateFromParcel;
            TextComponent textComponentCreateFromParcel;
            TextComponent textComponentCreateFromParcel2;
            TextComponent textComponentCreateFromParcel3;
            ActionLinkComponent actionLinkComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                imageComponentCreateFromParcel = null;
            } else {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            ImageComponent imageComponent = imageComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                baseUserComponentCreateFromParcel = null;
            } else {
                baseUserComponentCreateFromParcel = BaseUserComponent.CREATOR.createFromParcel(parcel);
            }
            BaseUserComponent baseUserComponent = baseUserComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel = null;
            } else {
                textComponentCreateFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent = textComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel2 = null;
            } else {
                textComponentCreateFromParcel2 = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent2 = textComponentCreateFromParcel2;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel3 = null;
            } else {
                textComponentCreateFromParcel3 = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent3 = textComponentCreateFromParcel3;
            if (parcel.readInt() == 0) {
                actionLinkComponentCreateFromParcel = null;
            } else {
                actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            }
            ActionLinkComponent actionLinkComponent = actionLinkComponentCreateFromParcel;
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
            return new PortraitCardTemplate(imageComponent, baseUserComponent, textComponent, textComponent2, textComponent3, actionLinkComponent, previewHintComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseRequestComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PortraitCardTemplate[] newArray(int i) {
            return new PortraitCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final TextComponent hintTitleComponent;
    public final ImageComponent imageComponent;
    public final ActionLinkComponent linkComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final TextComponent subTitleComponent;
    public final TextComponent titleComponent;
    public final BaseUserComponent userInfoComponent;

    /* JADX WARN: Multi-variable type inference failed */
    public PortraitCardTemplate() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortraitCardTemplate)) {
            return false;
        }
        PortraitCardTemplate portraitCardTemplate = (PortraitCardTemplate) obj;
        return Intrinsics.LJFF(this.imageComponent, portraitCardTemplate.imageComponent) && Intrinsics.LJFF(this.userInfoComponent, portraitCardTemplate.userInfoComponent) && Intrinsics.LJFF(this.titleComponent, portraitCardTemplate.titleComponent) && Intrinsics.LJFF(this.subTitleComponent, portraitCardTemplate.subTitleComponent) && Intrinsics.LJFF(this.hintTitleComponent, portraitCardTemplate.hintTitleComponent) && Intrinsics.LJFF(this.linkComponent, portraitCardTemplate.linkComponent) && Intrinsics.LJFF(this.previewHintComponent, portraitCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseResponseComponent, portraitCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseRequestComponent, portraitCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.attachment, portraitCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, portraitCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, portraitCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        ImageComponent imageComponent = this.imageComponent;
        int iHashCode = (imageComponent == null ? 0 : imageComponent.hashCode()) * 31;
        BaseUserComponent baseUserComponent = this.userInfoComponent;
        int iHashCode2 = (iHashCode + (baseUserComponent == null ? 0 : baseUserComponent.hashCode())) * 31;
        TextComponent textComponent = this.titleComponent;
        int iHashCode3 = (iHashCode2 + (textComponent == null ? 0 : textComponent.hashCode())) * 31;
        TextComponent textComponent2 = this.subTitleComponent;
        int iHashCode4 = (iHashCode3 + (textComponent2 == null ? 0 : textComponent2.hashCode())) * 31;
        TextComponent textComponent3 = this.hintTitleComponent;
        int iHashCode5 = (iHashCode4 + (textComponent3 == null ? 0 : textComponent3.hashCode())) * 31;
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        int iHashCode6 = (((((((iHashCode5 + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode7 = (iHashCode6 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode8 = (iHashCode7 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode8 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        return "PortraitCardTemplate(imageComponent=" + this.imageComponent + ", userInfoComponent=" + this.userInfoComponent + ", titleComponent=" + this.titleComponent + ", subTitleComponent=" + this.subTitleComponent + ", hintTitleComponent=" + this.hintTitleComponent + ", linkComponent=" + this.linkComponent + ", previewHintComponent=" + this.previewHintComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
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
        C2242391Cph c2242391Cph = new C2242391Cph();
        TextComponent textComponent = this.titleComponent;
        c2242391Cph.LJFF = textComponent != null ? textComponent.LIZ() : null;
        TextComponent textComponent2 = this.subTitleComponent;
        c2242391Cph.LJI = textComponent2 != null ? textComponent2.LIZ() : null;
        TextComponent textComponent3 = this.hintTitleComponent;
        c2242391Cph.LJII = textComponent3 != null ? textComponent3.LIZ() : null;
        ImageComponent imageComponent = this.imageComponent;
        c2242391Cph.LIZLLL = imageComponent != null ? imageComponent.LIZIZ() : null;
        BaseUserComponent baseUserComponent = this.userInfoComponent;
        c2242391Cph.LJ = baseUserComponent != null ? baseUserComponent.LIZ() : null;
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        c2242391Cph.LJIIIIZZ = actionLinkComponent != null ? actionLinkComponent.LIZIZ() : null;
        c2242391Cph.LJIIIZ = this.previewHintComponent.LIZIZ();
        c2242391Cph.LJIIJ = this.baseRequestComponent.LIZ();
        c2242391Cph.LJIIJJI = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJIIIIZZ = c2242391Cph.build();
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
        ImageComponent imageComponent = this.imageComponent;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
        BaseUserComponent baseUserComponent = this.userInfoComponent;
        if (baseUserComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseUserComponent.writeToParcel(parcel, i);
        }
        TextComponent textComponent = this.titleComponent;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        TextComponent textComponent2 = this.subTitleComponent;
        if (textComponent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent2.writeToParcel(parcel, i);
        }
        TextComponent textComponent3 = this.hintTitleComponent;
        if (textComponent3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent3.writeToParcel(parcel, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        if (actionLinkComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinkComponent.writeToParcel(parcel, i);
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
        return new PortraitCardTemplate(this.imageComponent, this.userInfoComponent, this.titleComponent, this.subTitleComponent, this.hintTitleComponent, this.linkComponent, previewHintComponent, baseResponseComponent, baseRequestComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PortraitCardTemplate(ImageComponent imageComponent, BaseUserComponent baseUserComponent, TextComponent textComponent, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, int i) {
        TextComponent textComponentLIZ;
        TextComponent textComponentLIZ2;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        ActionLinkComponent actionLinkComponentLIZ = actionLinkComponent;
        TextComponent textComponentLIZ3 = textComponent;
        BaseUserComponent baseUserComponentLIZ = baseUserComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        ImageComponent imageComponentLIZ = imageComponent;
        if ((i & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        if ((i & 2) != 0) {
            BaseUserComponent.Companion.getClass();
            baseUserComponentLIZ = C2242511Cpt.LIZ();
        }
        if ((i & 4) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ3 = C2243491CrT.LIZ();
        }
        if ((i & 8) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        } else {
            textComponentLIZ = null;
        }
        if ((i & 16) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ2 = C2243491CrT.LIZ();
        } else {
            textComponentLIZ2 = null;
        }
        if ((i & 32) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        if ((i & 64) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        BaseResponseComponent baseResponseComponent = (i & 128) != 0 ? new BaseResponseComponent(0L, 15) : null;
        if ((i & 256) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(imageComponentLIZ, baseUserComponentLIZ, textComponentLIZ3, textComponentLIZ, textComponentLIZ2, actionLinkComponentLIZ, previewHintComponentLIZ, baseResponseComponent, baseRequestComponentLIZ, null, null, null);
    }

    public PortraitCardTemplate(ImageComponent imageComponent, BaseUserComponent baseUserComponent, TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.imageComponent = imageComponent;
        this.userInfoComponent = baseUserComponent;
        this.titleComponent = textComponent;
        this.subTitleComponent = textComponent2;
        this.hintTitleComponent = textComponent3;
        this.linkComponent = actionLinkComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1806;
    }
}
