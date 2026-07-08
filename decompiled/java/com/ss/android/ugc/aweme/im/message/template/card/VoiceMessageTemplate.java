package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2227671CGv;
import X.C2240891CnH;
import X.C2240901CnI;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.VoiceMessageTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VoiceMessageAudioWaveComponent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class VoiceMessageTemplate implements BaseTemplate {
    public final AttachmentComponent attachment;
    public final VoiceMessageAudioWaveComponent audioWaveComponent;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final FallbackInfoComponent fallbackComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public static final C2240901CnI Companion = new Object() { // from class: X.1CnI
    };
    public static final Parcelable.Creator<VoiceMessageTemplate> CREATOR = new Parcelable.Creator<VoiceMessageTemplate>() { // from class: X.18Yj
        @Override // android.os.Parcelable.Creator
        public final VoiceMessageTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponentCreateFromParcel = VoiceMessageAudioWaveComponent.CREATOR.createFromParcel(parcel);
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
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
            return new VoiceMessageTemplate(voiceMessageAudioWaveComponentCreateFromParcel, fallbackInfoComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceMessageTemplate[] newArray(int i) {
            return new VoiceMessageTemplate[i];
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
        if (!(obj instanceof VoiceMessageTemplate)) {
            return false;
        }
        VoiceMessageTemplate voiceMessageTemplate = (VoiceMessageTemplate) obj;
        return Intrinsics.LJFF(this.audioWaveComponent, voiceMessageTemplate.audioWaveComponent) && Intrinsics.LJFF(this.fallbackComponent, voiceMessageTemplate.fallbackComponent) && Intrinsics.LJFF(this.previewHintComponent, voiceMessageTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, voiceMessageTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, voiceMessageTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, voiceMessageTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, voiceMessageTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, voiceMessageTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.audioWaveComponent.hashCode() * 31) + this.fallbackComponent.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode2 = (iHashCode + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode3 = (iHashCode2 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode3 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceMessageTemplate(audioWaveComponent=");
        sbLIZ.append(this.audioWaveComponent);
        sbLIZ.append(", fallbackComponent=");
        sbLIZ.append(this.fallbackComponent);
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
        C2240891CnH c2240891CnH = new C2240891CnH();
        VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponent = this.audioWaveComponent;
        voiceMessageAudioWaveComponent.getClass();
        C2227671CGv c2227671CGv = new C2227671CGv();
        List<Float> list = voiceMessageAudioWaveComponent.volumeLevels;
        C1516540pZE.LIZ(list);
        c2227671CGv.LIZLLL = list;
        c2227671CGv.LJ = Float.valueOf(voiceMessageAudioWaveComponent.sampleRate);
        c2240891CnH.LIZLLL = c2227671CGv.build();
        c2240891CnH.LJFF = this.previewHintComponent.LIZIZ();
        c2240891CnH.LJI = this.baseRequestComponent.LIZ();
        c2240891CnH.LJII = this.baseResponseComponent.LIZ();
        c2240891CnH.LJ = this.fallbackComponent.LIZ();
        c2241961Cp0.LJIILJJIL = c2240891CnH.build();
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
        AttachmentTypeComponent attachmentTypeComponent;
        AttachmentComponent attachmentComponent = this.attachment;
        if (attachmentComponent != null && ((attachmentTypeComponent = attachmentComponent.type) == AttachmentTypeComponent.ATTACHMENT_TYPE_STORY || (attachmentComponent.isStory && attachmentTypeComponent == AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY))) {
            return new VoiceMessageTemplate(this.audioWaveComponent, this.fallbackComponent, this.previewHintComponent, this.baseRequestComponent, this.baseResponseComponent, (AttachmentComponent) null, this.baseHeaderComponent, this.baseFooterComponent);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.audioWaveComponent.writeToParcel(parcel, i);
        this.fallbackComponent.writeToParcel(parcel, i);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return new VoiceMessageTemplate(this.audioWaveComponent, this.fallbackComponent, previewHintComponent, baseRequestComponent, baseResponseComponent, (AttachmentComponent) null, (BaseHeaderComponent) (0 == true ? 1 : 0), 224);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VoiceMessageTemplate(VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponent, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, int i) {
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        FallbackInfoComponent fallbackInfoComponent2 = (i & 2) != 0 ? new FallbackInfoComponent(7) : fallbackInfoComponent;
        if ((i & 4) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 8) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(voiceMessageAudioWaveComponent, fallbackInfoComponent2, previewHintComponentLIZ, baseRequestComponentLIZ, (i & 16) != 0 ? new BaseResponseComponent(0L, 15) : baseResponseComponent2, (i & 32) != 0 ? null : attachmentComponent2, (i & 64) != 0 ? null : baseHeaderComponent2, (BaseFooterComponent) null);
    }

    public VoiceMessageTemplate(VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponent, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.audioWaveComponent = voiceMessageAudioWaveComponent;
        this.fallbackComponent = fallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1813;
    }
}
