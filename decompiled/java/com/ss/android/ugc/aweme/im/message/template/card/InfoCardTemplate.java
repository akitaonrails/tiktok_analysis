package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2243331CrD;
import X.C2243391CrJ;
import X.C2243401CrK;
import X.C2243421CrM;
import X.C2243451CrP;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class InfoCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<InfoCardTemplate> CREATOR = new Parcelable.Creator<InfoCardTemplate>() { // from class: X.1Cr9
        @Override // android.os.Parcelable.Creator
        public final InfoCardTemplate createFromParcel(Parcel parcel) {
            InfoCardContentComponent infoCardContentComponentCreateFromParcel;
            VideoCoverComponent videoCoverComponentCreateFromParcel;
            ActionLinkComponent actionLinkComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            InfoCardTitleBarComponent infoCardTitleBarComponentCreateFromParcel = InfoCardTitleBarComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                infoCardContentComponentCreateFromParcel = null;
            } else {
                infoCardContentComponentCreateFromParcel = InfoCardContentComponent.CREATOR.createFromParcel(parcel);
            }
            InfoCardContentComponent infoCardContentComponent = infoCardContentComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                videoCoverComponentCreateFromParcel = null;
            } else {
                videoCoverComponentCreateFromParcel = VideoCoverComponent.CREATOR.createFromParcel(parcel);
            }
            VideoCoverComponent videoCoverComponent = videoCoverComponentCreateFromParcel;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InfoCardButtonComponent.CREATOR.createFromParcel(parcel));
            }
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
            return new InfoCardTemplate(infoCardTitleBarComponentCreateFromParcel, infoCardContentComponent, videoCoverComponent, arrayList, actionLinkComponent, previewHintComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseRequestComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoCardTemplate[] newArray(int i) {
            return new InfoCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final VideoCoverComponent baseVideo;
    public final InfoCardContentComponent cardContent;
    public final InfoCardTitleBarComponent cardTitle;
    public final List<InfoCardButtonComponent> infoCardButtons;
    public final ActionLinkComponent linkInfo;
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
        if (!(obj instanceof InfoCardTemplate)) {
            return false;
        }
        InfoCardTemplate infoCardTemplate = (InfoCardTemplate) obj;
        return Intrinsics.LJFF(this.cardTitle, infoCardTemplate.cardTitle) && Intrinsics.LJFF(this.cardContent, infoCardTemplate.cardContent) && Intrinsics.LJFF(this.baseVideo, infoCardTemplate.baseVideo) && Intrinsics.LJFF(this.infoCardButtons, infoCardTemplate.infoCardButtons) && Intrinsics.LJFF(this.linkInfo, infoCardTemplate.linkInfo) && Intrinsics.LJFF(this.previewHintComponent, infoCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseResponseComponent, infoCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseRequestComponent, infoCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.attachment, infoCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, infoCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, infoCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = this.cardTitle.hashCode() * 31;
        InfoCardContentComponent infoCardContentComponent = this.cardContent;
        int iHashCode2 = (iHashCode + (infoCardContentComponent == null ? 0 : infoCardContentComponent.hashCode())) * 31;
        VideoCoverComponent videoCoverComponent = this.baseVideo;
        int iHashCode3 = (((iHashCode2 + (videoCoverComponent == null ? 0 : videoCoverComponent.hashCode())) * 31) + this.infoCardButtons.hashCode()) * 31;
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        int iHashCode4 = (((((((iHashCode3 + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31;
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
        return "InfoCardTemplate(cardTitle=" + this.cardTitle + ", cardContent=" + this.cardContent + ", baseVideo=" + this.baseVideo + ", infoCardButtons=" + this.infoCardButtons + ", linkInfo=" + this.linkInfo + ", previewHintComponent=" + this.previewHintComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
    }

    public InfoCardTemplate() {
        InfoCardTitleBarComponent infoCardTitleBarComponent = new InfoCardTitleBarComponent(0);
        C13BV c13bv = C13BV.INSTANCE;
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseResponseComponent baseResponseComponent = new BaseResponseComponent(0L, 15);
        BaseRequestComponent.Companion.getClass();
        this(infoCardTitleBarComponent, null, null, c13bv, null, previewHintComponentLIZ, baseResponseComponent, C18Y8.LIZ(), null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        C2243331CrD c2243331CrDBuild;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2243391CrJ c2243391CrJ = new C2243391CrJ();
        InfoCardTitleBarComponent infoCardTitleBarComponent = this.cardTitle;
        infoCardTitleBarComponent.getClass();
        C2243451CrP c2243451CrP = new C2243451CrP();
        c2243451CrP.LIZLLL = infoCardTitleBarComponent.title.LIZ();
        ImageComponent imageComponent = infoCardTitleBarComponent.image;
        c2243451CrP.LJ = imageComponent != null ? imageComponent.LIZIZ() : null;
        c2243391CrJ.LIZLLL = c2243451CrP.build();
        InfoCardContentComponent infoCardContentComponent = this.cardContent;
        if (infoCardContentComponent != null) {
            C2243401CrK c2243401CrK = new C2243401CrK();
            c2243401CrK.LIZLLL = infoCardContentComponent.description.LIZ();
            List<TextComponent> list = infoCardContentComponent.contentList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TextComponent> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ());
            }
            C1516540pZE.LIZ(arrayList);
            c2243401CrK.LJ = arrayList;
            c2243331CrDBuild = c2243401CrK.build();
        } else {
            c2243331CrDBuild = null;
        }
        c2243391CrJ.LJ = c2243331CrDBuild;
        VideoCoverComponent videoCoverComponent = this.baseVideo;
        c2243391CrJ.LJFF = videoCoverComponent != null ? videoCoverComponent.LIZIZ() : null;
        List<InfoCardButtonComponent> list2 = this.infoCardButtons;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (InfoCardButtonComponent infoCardButtonComponent : list2) {
            infoCardButtonComponent.getClass();
            C2243421CrM c2243421CrM = new C2243421CrM();
            c2243421CrM.LIZLLL = infoCardButtonComponent.cardText.LIZ();
            TextComponent textComponent = infoCardButtonComponent.hint;
            c2243421CrM.LJ = textComponent != null ? textComponent.LIZ() : null;
            c2243421CrM.LJFF = infoCardButtonComponent.linkInfo.LIZIZ();
            CardButtonType cardButtonType = infoCardButtonComponent.buttonType;
            c2243421CrM.LJI = cardButtonType != null ? cardButtonType.toProto() : null;
            arrayList2.add(c2243421CrM.build());
        }
        C1516540pZE.LIZ(arrayList2);
        c2243391CrJ.LJI = arrayList2;
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        c2243391CrJ.LJII = actionLinkComponent != null ? actionLinkComponent.LIZIZ() : null;
        c2243391CrJ.LJIIIIZZ = this.baseRequestComponent.LIZ();
        c2243391CrJ.LJIIIZ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJI = c2243391CrJ.build();
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
        this.cardTitle.writeToParcel(parcel, i);
        InfoCardContentComponent infoCardContentComponent = this.cardContent;
        if (infoCardContentComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoCardContentComponent.writeToParcel(parcel, i);
        }
        VideoCoverComponent videoCoverComponent = this.baseVideo;
        if (videoCoverComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCoverComponent.writeToParcel(parcel, i);
        }
        List<InfoCardButtonComponent> list = this.infoCardButtons;
        parcel.writeInt(list.size());
        Iterator<InfoCardButtonComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkInfo;
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
        return LIZ(this, null, previewHintComponent, baseResponseComponent, baseRequestComponent, 1823);
    }

    public static InfoCardTemplate LIZ(InfoCardTemplate infoCardTemplate, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, int i) {
        InfoCardTitleBarComponent infoCardTitleBarComponent;
        InfoCardContentComponent infoCardContentComponent;
        VideoCoverComponent videoCoverComponent;
        List<InfoCardButtonComponent> list;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        ActionLinkComponent actionLinkComponent2 = actionLinkComponent;
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 1) != 0) {
            infoCardTitleBarComponent = infoCardTemplate.cardTitle;
        } else {
            infoCardTitleBarComponent = null;
        }
        if ((i & 2) != 0) {
            infoCardContentComponent = infoCardTemplate.cardContent;
        } else {
            infoCardContentComponent = null;
        }
        if ((i & 4) != 0) {
            videoCoverComponent = infoCardTemplate.baseVideo;
        } else {
            videoCoverComponent = null;
        }
        if ((i & 8) != 0) {
            list = infoCardTemplate.infoCardButtons;
        } else {
            list = null;
        }
        if ((i & 16) != 0) {
            actionLinkComponent2 = infoCardTemplate.linkInfo;
        }
        if ((i & 32) != 0) {
            previewHintComponent2 = infoCardTemplate.previewHintComponent;
        }
        if ((i & 64) != 0) {
            baseResponseComponent2 = infoCardTemplate.baseResponseComponent;
        }
        if ((i & 128) != 0) {
            baseRequestComponent2 = infoCardTemplate.baseRequestComponent;
        }
        if ((i & 256) != 0) {
            attachmentComponent = infoCardTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((i & 512) != 0) {
            baseHeaderComponent = infoCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 1024) != 0) {
            baseFooterComponent = infoCardTemplate.baseFooterComponent;
        }
        infoCardTemplate.getClass();
        return new InfoCardTemplate(infoCardTitleBarComponent, infoCardContentComponent, videoCoverComponent, list, actionLinkComponent2, previewHintComponent2, baseResponseComponent2, baseRequestComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent);
    }

    public InfoCardTemplate(InfoCardTitleBarComponent infoCardTitleBarComponent, InfoCardContentComponent infoCardContentComponent, VideoCoverComponent videoCoverComponent, List<InfoCardButtonComponent> list, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.cardTitle = infoCardTitleBarComponent;
        this.cardContent = infoCardContentComponent;
        this.baseVideo = videoCoverComponent;
        this.infoCardButtons = list;
        this.linkInfo = actionLinkComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1804;
    }
}
