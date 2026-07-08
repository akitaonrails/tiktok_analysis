package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C1954807lC;
import X.C1CNG;
import X.C2237241ChO;
import X.C2237881CiQ;
import X.C2241381Co4;
import X.C2241481CoE;
import X.C2241501CoG;
import X.C2241511CoH;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC2241471CoD;
import X.EnumC2241491CoF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionCoordinateComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotResultComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotTemplateInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGroupShotCardTemplate implements BaseInteractiveTaskTemplate {
    public static final Parcelable.Creator<AIGroupShotCardTemplate> CREATOR = new Parcelable.Creator<AIGroupShotCardTemplate>() { // from class: X.1CoC
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotCardTemplate createFromParcel(Parcel parcel) {
            boolean z;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponentCreateFromParcel = AIGroupShotTemplateInfoComponent.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AIGroupShotUserInfoComponent.CREATOR.createFromParcel(parcel));
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(AIGroupShotResultComponent.CREATOR.createFromParcel(parcel));
            }
            EnumC2241471CoD enumC2241471CoDValueOf = EnumC2241471CoD.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            InlineMessageTipComponent inlineMessageTipComponentCreateFromParcel = InlineMessageTipComponent.CREATOR.createFromParcel(parcel);
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
            return new AIGroupShotCardTemplate(i, string, string2, aIGroupShotTemplateInfoComponentCreateFromParcel, arrayList, arrayList2, enumC2241471CoDValueOf, z, inlineMessageTipComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotCardTemplate[] newArray(int i) {
            return new AIGroupShotCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final String creatorId;
    public final boolean hideCard;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final List<AIGroupShotResultComponent> results;
    public final EnumC2241471CoD status;
    public final String taskId;
    public final AIGroupShotTemplateInfoComponent templateInfo;
    public final InlineMessageTipComponent tip;
    public final List<AIGroupShotUserInfoComponent> userInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGroupShotCardTemplate)) {
            return false;
        }
        AIGroupShotCardTemplate aIGroupShotCardTemplate = (AIGroupShotCardTemplate) obj;
        return this.messageType == aIGroupShotCardTemplate.messageType && Intrinsics.LJFF(this.taskId, aIGroupShotCardTemplate.taskId) && Intrinsics.LJFF(this.creatorId, aIGroupShotCardTemplate.creatorId) && Intrinsics.LJFF(this.templateInfo, aIGroupShotCardTemplate.templateInfo) && Intrinsics.LJFF(this.userInfo, aIGroupShotCardTemplate.userInfo) && Intrinsics.LJFF(this.results, aIGroupShotCardTemplate.results) && this.status == aIGroupShotCardTemplate.status && this.hideCard == aIGroupShotCardTemplate.hideCard && Intrinsics.LJFF(this.tip, aIGroupShotCardTemplate.tip) && Intrinsics.LJFF(this.previewHintComponent, aIGroupShotCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, aIGroupShotCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, aIGroupShotCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, aIGroupShotCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, aIGroupShotCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, aIGroupShotCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.messageType * 31) + this.taskId.hashCode()) * 31) + this.creatorId.hashCode()) * 31) + this.templateInfo.hashCode()) * 31) + this.userInfo.hashCode()) * 31) + this.results.hashCode()) * 31) + this.status.hashCode()) * 31) + C786410Ut5.Z2(this.hideCard)) * 31) + this.tip.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode2 = (iHashCode + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode3 = (iHashCode2 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode3 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        return "AIGroupShotCardTemplate(messageType=" + this.messageType + ", taskId=" + this.taskId + ", creatorId=" + this.creatorId + ", templateInfo=" + this.templateInfo + ", userInfo=" + this.userInfo + ", results=" + this.results + ", status=" + this.status + ", hideCard=" + this.hideCard + ", tip=" + this.tip + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        EnumC2241491CoF enumC2241491CoF;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2241381Co4 c2241381Co4 = new C2241381Co4();
        c2241381Co4.LIZLLL = this.taskId;
        c2241381Co4.LJ = this.creatorId;
        AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent = this.templateInfo;
        aIGroupShotTemplateInfoComponent.getClass();
        C2241511CoH c2241511CoH = new C2241511CoH();
        c2241511CoH.LIZLLL = aIGroupShotTemplateInfoComponent.templateId;
        c2241511CoH.LJFF = aIGroupShotTemplateInfoComponent.templateName;
        c2241511CoH.LJII = aIGroupShotTemplateInfoComponent.templateResId;
        c2241511CoH.LJ = Integer.valueOf(aIGroupShotTemplateInfoComponent.participantCount);
        c2241511CoH.LJI = aIGroupShotTemplateInfoComponent.templateThumbnailUrl;
        c2241381Co4.LJFF = c2241511CoH.build();
        List<AIGroupShotUserInfoComponent> list = this.userInfo;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AIGroupShotUserInfoComponent aIGroupShotUserInfoComponent : list) {
            aIGroupShotUserInfoComponent.getClass();
            C1CNG c1cng = new C1CNG();
            c1cng.LIZLLL = Long.valueOf(aIGroupShotUserInfoComponent.userId);
            arrayList.add(c1cng.build());
        }
        C1516540pZE.LIZ(arrayList);
        c2241381Co4.LJI = arrayList;
        List<AIGroupShotResultComponent> list2 = this.results;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (AIGroupShotResultComponent aIGroupShotResultComponent : list2) {
            aIGroupShotResultComponent.getClass();
            C2241501CoG c2241501CoG = new C2241501CoG();
            c2241501CoG.LIZLLL = aIGroupShotResultComponent.image.LIZIZ();
            List<AIGroupShotMentionInfoComponent> list3 = aIGroupShotResultComponent.mentionInfo;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (AIGroupShotMentionInfoComponent aIGroupShotMentionInfoComponent : list3) {
                aIGroupShotMentionInfoComponent.getClass();
                C2237881CiQ c2237881CiQ = new C2237881CiQ();
                c2237881CiQ.LIZLLL = Long.valueOf(aIGroupShotMentionInfoComponent.userId);
                c2237881CiQ.LJ = aIGroupShotMentionInfoComponent.nickname;
                AIGroupShotMentionCoordinateComponent aIGroupShotMentionCoordinateComponent = aIGroupShotMentionInfoComponent.coordinate;
                aIGroupShotMentionCoordinateComponent.getClass();
                C2237241ChO c2237241ChO = new C2237241ChO();
                c2237241ChO.LIZLLL = Double.valueOf(aIGroupShotMentionCoordinateComponent.x);
                c2237241ChO.LJ = Double.valueOf(aIGroupShotMentionCoordinateComponent.y);
                c2237881CiQ.LJFF = c2237241ChO.build();
                arrayList3.add(c2237881CiQ.build());
            }
            C1516540pZE.LIZ(arrayList3);
            c2241501CoG.LJ = arrayList3;
            arrayList2.add(c2241501CoG.build());
        }
        C1516540pZE.LIZ(arrayList2);
        c2241381Co4.LJII = arrayList2;
        switch (C2241481CoE.LIZ[this.status.ordinal()]) {
            case 1:
                enumC2241491CoF = EnumC2241491CoF.InProgress;
                break;
            case 2:
                enumC2241491CoF = EnumC2241491CoF.Finish;
                break;
            case 3:
                enumC2241491CoF = EnumC2241491CoF.Fail;
                break;
            case 4:
                enumC2241491CoF = EnumC2241491CoF.Recall;
                break;
            case 5:
                enumC2241491CoF = EnumC2241491CoF.Expired;
                break;
            case 6:
                enumC2241491CoF = EnumC2241491CoF.Unsupported;
                break;
            default:
                throw new C1954807lC();
        }
        c2241381Co4.LJIIIIZZ = enumC2241491CoF;
        c2241381Co4.LJIIIZ = Boolean.valueOf(this.hideCard);
        c2241381Co4.LJIIJ = this.tip.LIZ();
        c2241381Co4.LJIIJJI = this.previewHintComponent.LIZIZ();
        c2241381Co4.LJIIL = this.baseRequestComponent.LIZ();
        c2241961Cp0.LJIILIIL = c2241381Co4.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c2241961Cp0.build()));
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final AttachmentComponent Hs() {
        return this.attachment;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate
    public final boolean Jv() {
        return this.hideCard;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseResponseComponent Nc() {
        return this.baseResponseComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate
    public final InlineMessageTipComponent W7() {
        return this.tip;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseFooterComponent dG() {
        return this.baseFooterComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final int getMessageType() {
        return this.messageType;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate
    public final String getTaskId() {
        return this.taskId;
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
        parcel.writeInt(this.messageType);
        parcel.writeString(this.taskId);
        parcel.writeString(this.creatorId);
        this.templateInfo.writeToParcel(parcel, i);
        List<AIGroupShotUserInfoComponent> list = this.userInfo;
        parcel.writeInt(list.size());
        Iterator<AIGroupShotUserInfoComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().userId);
        }
        List<AIGroupShotResultComponent> list2 = this.results;
        parcel.writeInt(list2.size());
        Iterator<AIGroupShotResultComponent> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.status.name());
        parcel.writeInt(this.hideCard ? 1 : 0);
        this.tip.writeToParcel(parcel, i);
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
        return LIZ(this, null, null, false, previewHintComponent, baseRequestComponent, baseResponseComponent, 29183);
    }

    public static AIGroupShotCardTemplate LIZ(AIGroupShotCardTemplate aIGroupShotCardTemplate, List list, EnumC2241471CoD enumC2241471CoD, boolean z, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        int i2;
        String str;
        String str2;
        AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent;
        List<AIGroupShotResultComponent> list2;
        InlineMessageTipComponent inlineMessageTipComponent;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        boolean z2 = z;
        EnumC2241471CoD enumC2241471CoD2 = enumC2241471CoD;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        List list3 = list;
        if ((i & 1) != 0) {
            i2 = aIGroupShotCardTemplate.messageType;
        } else {
            i2 = 0;
        }
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 2) != 0) {
            str = aIGroupShotCardTemplate.taskId;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = aIGroupShotCardTemplate.creatorId;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            aIGroupShotTemplateInfoComponent = aIGroupShotCardTemplate.templateInfo;
        } else {
            aIGroupShotTemplateInfoComponent = null;
        }
        if ((i & 16) != 0) {
            list3 = aIGroupShotCardTemplate.userInfo;
        }
        if ((i & 32) != 0) {
            list2 = aIGroupShotCardTemplate.results;
        } else {
            list2 = null;
        }
        if ((i & 64) != 0) {
            enumC2241471CoD2 = aIGroupShotCardTemplate.status;
        }
        if ((i & 128) != 0) {
            z2 = aIGroupShotCardTemplate.hideCard;
        }
        if ((i & 256) != 0) {
            inlineMessageTipComponent = aIGroupShotCardTemplate.tip;
        } else {
            inlineMessageTipComponent = null;
        }
        if ((i & 512) != 0) {
            previewHintComponent2 = aIGroupShotCardTemplate.previewHintComponent;
        }
        if ((i & 1024) != 0) {
            baseRequestComponent2 = aIGroupShotCardTemplate.baseRequestComponent;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            baseResponseComponent2 = aIGroupShotCardTemplate.baseResponseComponent;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            attachmentComponent = aIGroupShotCardTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((i & 8192) != 0) {
            baseHeaderComponent = aIGroupShotCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 16384) != 0) {
            baseFooterComponent = aIGroupShotCardTemplate.baseFooterComponent;
        }
        aIGroupShotCardTemplate.getClass();
        return new AIGroupShotCardTemplate(i2, str, str2, aIGroupShotTemplateInfoComponent, list3, list2, enumC2241471CoD2, z2, inlineMessageTipComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent);
    }

    public AIGroupShotCardTemplate(int i, String str, String str2, AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent, List<AIGroupShotUserInfoComponent> list, List<AIGroupShotResultComponent> list2, EnumC2241471CoD enumC2241471CoD, boolean z, InlineMessageTipComponent inlineMessageTipComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.messageType = i;
        this.taskId = str;
        this.creatorId = str2;
        this.templateInfo = aIGroupShotTemplateInfoComponent;
        this.userInfo = list;
        this.results = list2;
        this.status = enumC2241471CoD;
        this.hideCard = z;
        this.tip = inlineMessageTipComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
