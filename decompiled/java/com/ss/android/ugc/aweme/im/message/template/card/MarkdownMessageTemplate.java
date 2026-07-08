package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2240951CnN;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.MarkdownMessageTemplate;
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
public final class MarkdownMessageTemplate implements BaseTemplate {
    public static final Parcelable.Creator<MarkdownMessageTemplate> CREATOR = new Parcelable.Creator<MarkdownMessageTemplate>() { // from class: X.18Yh
        @Override // android.os.Parcelable.Creator
        public final MarkdownMessageTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new MarkdownMessageTemplate(string, string2, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MarkdownMessageTemplate[] newArray(int i) {
            return new MarkdownMessageTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final String context;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final String raw;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkdownMessageTemplate)) {
            return false;
        }
        MarkdownMessageTemplate markdownMessageTemplate = (MarkdownMessageTemplate) obj;
        return Intrinsics.LJFF(this.raw, markdownMessageTemplate.raw) && Intrinsics.LJFF(this.context, markdownMessageTemplate.context) && Intrinsics.LJFF(this.previewHintComponent, markdownMessageTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, markdownMessageTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, markdownMessageTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, markdownMessageTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, markdownMessageTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, markdownMessageTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        String str = this.raw;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.context;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
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
        sbLIZ.append("MarkdownMessageTemplate(raw=");
        sbLIZ.append(this.raw);
        sbLIZ.append(", context=");
        sbLIZ.append(this.context);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public MarkdownMessageTemplate() {
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseRequestComponent.Companion.getClass();
        this("", "", previewHintComponentLIZ, C18Y8.LIZ(), new BaseResponseComponent(0L, 15), null, null, null);
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
        C2240951CnN c2240951CnN = new C2240951CnN();
        c2240951CnN.LIZLLL = this.raw;
        c2240951CnN.LJFF = this.context;
        c2240951CnN.LJ = this.previewHintComponent.LIZIZ();
        c2240951CnN.LJI = this.baseRequestComponent.LIZ();
        c2240951CnN.LJII = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJIL = c2240951CnN.build();
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
        parcel.writeString(this.raw);
        parcel.writeString(this.context);
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
        return new MarkdownMessageTemplate(this.raw, this.context, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public MarkdownMessageTemplate(String str, String str2, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.raw = str;
        this.context = str2;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1822;
    }
}
