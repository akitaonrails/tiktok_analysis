package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2243191Cqz;
import X.C2243211Cr1;
import X.C2243231Cr3;
import X.C2243241Cr4;
import X.C2243251Cr5;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FortuneCookieInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class InteractionCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<InteractionCardTemplate> CREATOR = new Parcelable.Creator<InteractionCardTemplate>() { // from class: X.18ZS
        @Override // android.os.Parcelable.Creator
        public final InteractionCardTemplate createFromParcel(Parcel parcel) {
            FortuneCookieInfoComponent fortuneCookieInfoComponentCreateFromParcel;
            GreetingCardInfoComponent greetingCardInfoComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                fortuneCookieInfoComponentCreateFromParcel = null;
            } else {
                fortuneCookieInfoComponentCreateFromParcel = FortuneCookieInfoComponent.CREATOR.createFromParcel(parcel);
            }
            FortuneCookieInfoComponent fortuneCookieInfoComponent = fortuneCookieInfoComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                greetingCardInfoComponentCreateFromParcel = null;
            } else {
                greetingCardInfoComponentCreateFromParcel = GreetingCardInfoComponent.CREATOR.createFromParcel(parcel);
            }
            GreetingCardInfoComponent greetingCardInfoComponent = greetingCardInfoComponentCreateFromParcel;
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
            return new InteractionCardTemplate(fortuneCookieInfoComponent, greetingCardInfoComponent, previewHintComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseRequestComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InteractionCardTemplate[] newArray(int i) {
            return new InteractionCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final FortuneCookieInfoComponent fortuneCookieInfoComponent;
    public final GreetingCardInfoComponent greetingCardInfoComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionCardTemplate() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionCardTemplate)) {
            return false;
        }
        InteractionCardTemplate interactionCardTemplate = (InteractionCardTemplate) obj;
        return Intrinsics.LJFF(this.fortuneCookieInfoComponent, interactionCardTemplate.fortuneCookieInfoComponent) && Intrinsics.LJFF(this.greetingCardInfoComponent, interactionCardTemplate.greetingCardInfoComponent) && Intrinsics.LJFF(this.previewHintComponent, interactionCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseResponseComponent, interactionCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseRequestComponent, interactionCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.attachment, interactionCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, interactionCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, interactionCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        FortuneCookieInfoComponent fortuneCookieInfoComponent = this.fortuneCookieInfoComponent;
        int iHashCode = (fortuneCookieInfoComponent == null ? 0 : fortuneCookieInfoComponent.hashCode()) * 31;
        GreetingCardInfoComponent greetingCardInfoComponent = this.greetingCardInfoComponent;
        int iHashCode2 = (((((((iHashCode + (greetingCardInfoComponent == null ? 0 : greetingCardInfoComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31;
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
        sbLIZ.append("InteractionCardTemplate(fortuneCookieInfoComponent=");
        sbLIZ.append(this.fortuneCookieInfoComponent);
        sbLIZ.append(", greetingCardInfoComponent=");
        sbLIZ.append(this.greetingCardInfoComponent);
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
        C2243191Cqz c2243191CqzBuild;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        C2243211Cr1 c2243211Cr1Build = null;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2243231Cr3 c2243231Cr3 = new C2243231Cr3();
        GreetingCardInfoComponent greetingCardInfoComponent = this.greetingCardInfoComponent;
        if (greetingCardInfoComponent != null) {
            C2243241Cr4 c2243241Cr4 = new C2243241Cr4();
            c2243241Cr4.LJ = greetingCardInfoComponent.receiverText;
            c2243241Cr4.LJFF = greetingCardInfoComponent.senderText;
            c2243241Cr4.LIZLLL = greetingCardInfoComponent.contentText;
            c2243241Cr4.LJI = greetingCardInfoComponent.status;
            c2243241Cr4.LJII = greetingCardInfoComponent.festiveId;
            c2243191CqzBuild = c2243241Cr4.build();
        } else {
            c2243191CqzBuild = null;
        }
        c2243231Cr3.LJ = c2243191CqzBuild;
        FortuneCookieInfoComponent fortuneCookieInfoComponent = this.fortuneCookieInfoComponent;
        if (fortuneCookieInfoComponent != null) {
            C2243251Cr5 c2243251Cr5 = new C2243251Cr5();
            c2243251Cr5.LIZLLL = fortuneCookieInfoComponent.messageTips;
            c2243251Cr5.LJ = Boolean.valueOf(fortuneCookieInfoComponent.show);
            c2243211Cr1Build = c2243251Cr5.build();
        }
        c2243231Cr3.LIZLLL = c2243211Cr1Build;
        c2243231Cr3.LJFF = this.previewHintComponent.LIZIZ();
        c2243231Cr3.LJI = this.baseRequestComponent.LIZ();
        c2243231Cr3.LJII = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJIILL = c2243231Cr3.build();
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
        FortuneCookieInfoComponent fortuneCookieInfoComponent = this.fortuneCookieInfoComponent;
        if (fortuneCookieInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fortuneCookieInfoComponent.writeToParcel(parcel, i);
        }
        GreetingCardInfoComponent greetingCardInfoComponent = this.greetingCardInfoComponent;
        if (greetingCardInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            greetingCardInfoComponent.writeToParcel(parcel, i);
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
        return LIZ(this, null, previewHintComponent, baseResponseComponent, baseRequestComponent, 227);
    }

    public /* synthetic */ InteractionCardTemplate(FortuneCookieInfoComponent fortuneCookieInfoComponent, GreetingCardInfoComponent greetingCardInfoComponent, PreviewHintComponent previewHintComponent, int i) {
        BaseResponseComponent baseResponseComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        GreetingCardInfoComponent greetingCardInfoComponent2 = greetingCardInfoComponent;
        BaseRequestComponent baseRequestComponentLIZ = null;
        FortuneCookieInfoComponent fortuneCookieInfoComponent2 = (i & 1) != 0 ? null : fortuneCookieInfoComponent;
        greetingCardInfoComponent2 = (i & 2) != 0 ? null : greetingCardInfoComponent2;
        if ((i & 4) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 8) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        if ((i & 16) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(fortuneCookieInfoComponent2, greetingCardInfoComponent2, previewHintComponentLIZ, baseResponseComponent, baseRequestComponentLIZ, null, null, null);
    }

    public static InteractionCardTemplate LIZ(InteractionCardTemplate interactionCardTemplate, FortuneCookieInfoComponent fortuneCookieInfoComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, int i) {
        GreetingCardInfoComponent greetingCardInfoComponent;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        FortuneCookieInfoComponent fortuneCookieInfoComponent2 = fortuneCookieInfoComponent;
        if ((i & 1) != 0) {
            fortuneCookieInfoComponent2 = interactionCardTemplate.fortuneCookieInfoComponent;
        }
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 2) != 0) {
            greetingCardInfoComponent = interactionCardTemplate.greetingCardInfoComponent;
        } else {
            greetingCardInfoComponent = null;
        }
        if ((i & 4) != 0) {
            previewHintComponent2 = interactionCardTemplate.previewHintComponent;
        }
        if ((i & 8) != 0) {
            baseResponseComponent2 = interactionCardTemplate.baseResponseComponent;
        }
        if ((i & 16) != 0) {
            baseRequestComponent2 = interactionCardTemplate.baseRequestComponent;
        }
        if ((i & 32) != 0) {
            attachmentComponent = interactionCardTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((i & 64) != 0) {
            baseHeaderComponent = interactionCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 128) != 0) {
            baseFooterComponent = interactionCardTemplate.baseFooterComponent;
        }
        interactionCardTemplate.getClass();
        return new InteractionCardTemplate(fortuneCookieInfoComponent2, greetingCardInfoComponent, previewHintComponent2, baseResponseComponent2, baseRequestComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent);
    }

    public InteractionCardTemplate(FortuneCookieInfoComponent fortuneCookieInfoComponent, GreetingCardInfoComponent greetingCardInfoComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.fortuneCookieInfoComponent = fortuneCookieInfoComponent;
        this.greetingCardInfoComponent = greetingCardInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1814;
    }
}
