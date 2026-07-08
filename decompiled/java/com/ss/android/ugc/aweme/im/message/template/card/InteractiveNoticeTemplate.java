package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C2188811AlT;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242021Cp6;
import X.C2242031Cp7;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.InteractiveNoticeTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class InteractiveNoticeTemplate implements BaseTemplate {
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final TextComponent interactiveNotice;
    public final int messageType = 1808;
    public final TextComponent plainNotice;
    public final PreviewHintComponent previewHintComponent;
    public final TextComponent queryContent;
    public final String queryMessageId;
    public static final C2242031Cp7 Companion = new Object() { // from class: X.1Cp7
    };
    public static final Parcelable.Creator<InteractiveNoticeTemplate> CREATOR = new Parcelable.Creator<InteractiveNoticeTemplate>() { // from class: X.1Cp3
        @Override // android.os.Parcelable.Creator
        public final InteractiveNoticeTemplate createFromParcel(Parcel parcel) {
            TextComponent textComponentCreateFromParcel;
            TextComponent textComponentCreateFromParcel2;
            TextComponent textComponentCreateFromParcel3;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
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
            String string = parcel.readString();
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
            return new InteractiveNoticeTemplate(textComponent, textComponent2, textComponent3, string, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InteractiveNoticeTemplate[] newArray(int i) {
            return new InteractiveNoticeTemplate[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractiveNoticeTemplate)) {
            return false;
        }
        InteractiveNoticeTemplate interactiveNoticeTemplate = (InteractiveNoticeTemplate) obj;
        return Intrinsics.LJFF(this.plainNotice, interactiveNoticeTemplate.plainNotice) && Intrinsics.LJFF(this.interactiveNotice, interactiveNoticeTemplate.interactiveNotice) && Intrinsics.LJFF(this.queryContent, interactiveNoticeTemplate.queryContent) && Intrinsics.LJFF(this.queryMessageId, interactiveNoticeTemplate.queryMessageId) && Intrinsics.LJFF(this.previewHintComponent, interactiveNoticeTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, interactiveNoticeTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, interactiveNoticeTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, interactiveNoticeTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, interactiveNoticeTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, interactiveNoticeTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        TextComponent textComponent = this.plainNotice;
        int iHashCode = (textComponent == null ? 0 : textComponent.hashCode()) * 31;
        TextComponent textComponent2 = this.interactiveNotice;
        int iHashCode2 = (iHashCode + (textComponent2 == null ? 0 : textComponent2.hashCode())) * 31;
        TextComponent textComponent3 = this.queryContent;
        int iHashCode3 = (iHashCode2 + (textComponent3 == null ? 0 : textComponent3.hashCode())) * 31;
        String str = this.queryMessageId;
        int iHashCode4 = (((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
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
        sbLIZ.append("InteractiveNoticeTemplate(plainNotice=");
        sbLIZ.append(this.plainNotice);
        sbLIZ.append(", interactiveNotice=");
        sbLIZ.append(this.interactiveNotice);
        sbLIZ.append(", queryContent=");
        sbLIZ.append(this.queryContent);
        sbLIZ.append(", queryMessageId=");
        sbLIZ.append(this.queryMessageId);
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
        C2242021Cp6 c2242021Cp6 = new C2242021Cp6();
        TextComponent textComponent = this.plainNotice;
        c2242021Cp6.LIZLLL = textComponent != null ? textComponent.LIZ() : null;
        TextComponent textComponent2 = this.interactiveNotice;
        c2242021Cp6.LJ = textComponent2 != null ? textComponent2.LIZ() : null;
        TextComponent textComponent3 = this.queryContent;
        c2242021Cp6.LJI = textComponent3 != null ? textComponent3.LIZ() : null;
        c2242021Cp6.LJFF = this.queryMessageId;
        c2242021Cp6.LJIIIIZZ = this.baseRequestComponent.LIZ();
        c2242021Cp6.LJIIIZ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJIIJ = c2242021Cp6.build();
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
        TextComponent textComponent = this.plainNotice;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        TextComponent textComponent2 = this.interactiveNotice;
        if (textComponent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent2.writeToParcel(parcel, i);
        }
        TextComponent textComponent3 = this.queryContent;
        if (textComponent3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.queryMessageId);
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
        return new InteractiveNoticeTemplate(this.plainNotice, this.interactiveNotice, this.queryContent, this.queryMessageId, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public InteractiveNoticeTemplate(TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3, String str, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.plainNotice = textComponent;
        this.interactiveNotice = textComponent2;
        this.queryContent = textComponent3;
        this.queryMessageId = str;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
