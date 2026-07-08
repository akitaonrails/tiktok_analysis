package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2243081Cqo;
import X.C2243101Cqq;
import X.C2243111Cqr;
import X.C2243121Cqs;
import X.C2244301Csm;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ImageCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<ImageCardTemplate> CREATOR = new Parcelable.Creator<ImageCardTemplate>() { // from class: X.1Cqi
        @Override // android.os.Parcelable.Creator
        public final ImageCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            ImageCardTitleBar imageCardTitleBarCreateFromParcel = ImageCardTitleBar.CREATOR.createFromParcel(parcel);
            ActionLinkComponent actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(VideoCoverComponent.CREATOR.createFromParcel(parcel));
            }
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
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
            return new ImageCardTemplate(imageCardTitleBarCreateFromParcel, actionLinkComponentCreateFromParcel, arrayList, previewHintComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseRequestComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageCardTemplate[] newArray(int i) {
            return new ImageCardTemplate[i];
        }
    };
    public final ActionLinkComponent actionLinkComponent;
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final ImageCardTitleBar titleBar;
    public final List<VideoCoverComponent> videoCoversComponentList;

    public ImageCardTemplate() {
        this(null, null, null, null, null, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCardTemplate)) {
            return false;
        }
        ImageCardTemplate imageCardTemplate = (ImageCardTemplate) obj;
        return Intrinsics.LJFF(this.titleBar, imageCardTemplate.titleBar) && Intrinsics.LJFF(this.actionLinkComponent, imageCardTemplate.actionLinkComponent) && Intrinsics.LJFF(this.videoCoversComponentList, imageCardTemplate.videoCoversComponentList) && Intrinsics.LJFF(this.previewHintComponent, imageCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseResponseComponent, imageCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseRequestComponent, imageCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.attachment, imageCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, imageCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, imageCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.titleBar.hashCode() * 31) + this.actionLinkComponent.hashCode()) * 31) + this.videoCoversComponentList.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31;
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
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageCardTemplate(titleBar=");
        sbLIZ.append(this.titleBar);
        sbLIZ.append(", actionLinkComponent=");
        sbLIZ.append(this.actionLinkComponent);
        sbLIZ.append(", videoCoversComponentList=");
        sbLIZ.append(this.videoCoversComponentList);
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
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        C2243081Cqo c2243081CqoLIZIZ = null;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2243101Cqq c2243101Cqq = new C2243101Cqq();
        ImageCardTitleBar imageCardTitleBar = this.titleBar;
        imageCardTitleBar.getClass();
        C2243111Cqr c2243111Cqr = new C2243111Cqr();
        c2243111Cqr.LIZLLL = imageCardTitleBar.leftImage.LIZIZ();
        c2243111Cqr.LJ = imageCardTitleBar.title.LIZ();
        c2243111Cqr.LJFF = imageCardTitleBar.subtitle.LIZ();
        ButtonComponent buttonComponent = imageCardTitleBar.rightButton;
        if (buttonComponent != null) {
            C2243121Cqs c2243121Cqs = new C2243121Cqs();
            c2243121Cqs.LIZLLL = buttonComponent.text.LIZ();
            c2243121Cqs.LJFF = buttonComponent.linkComponent.LIZIZ();
            c2243081CqoLIZIZ = c2243121Cqs.build();
        }
        c2243111Cqr.LJI = c2243081CqoLIZIZ;
        c2243101Cqq.LIZLLL = c2243111Cqr.build();
        List<VideoCoverComponent> list = this.videoCoversComponentList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<VideoCoverComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZIZ());
        }
        C1516540pZE.LIZ(arrayList);
        c2243101Cqq.LJ = arrayList;
        c2243101Cqq.LJFF = this.actionLinkComponent.LIZIZ();
        c2243101Cqq.LJI = this.previewHintComponent.LIZIZ();
        c2243101Cqq.LJII = this.baseRequestComponent.LIZ();
        c2243101Cqq.LJIIIIZZ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LIZLLL = c2243101Cqq.build();
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
        this.titleBar.writeToParcel(parcel, i);
        this.actionLinkComponent.writeToParcel(parcel, i);
        List<VideoCoverComponent> list = this.videoCoversComponentList;
        parcel.writeInt(list.size());
        Iterator<VideoCoverComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
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
        return LIZ(this, null, previewHintComponent, baseResponseComponent, baseRequestComponent, 455);
    }

    public ImageCardTemplate(ImageCardTitleBar imageCardTitleBar, ActionLinkComponent actionLinkComponent, List list, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, int i) {
        BaseResponseComponent baseResponseComponent;
        ImageCardTitleBar value = imageCardTitleBar;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        List list2 = list;
        ActionLinkComponent actionLinkComponentLIZ = actionLinkComponent;
        if ((i & 1) != 0) {
            ImageCardTitleBar.Companion.getClass();
            value = ImageCardTitleBar.EMPTY_IMAGE_CARD_TITLE_BAR$delegate.getValue();
        }
        if ((i & 2) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        list2 = (i & 4) != 0 ? C13BV.INSTANCE : list2;
        if ((i & 8) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 16) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        if ((i & 32) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(value, actionLinkComponentLIZ, list2, previewHintComponentLIZ, baseResponseComponent, baseRequestComponentLIZ, null, null, null);
    }

    public static ImageCardTemplate LIZ(ImageCardTemplate imageCardTemplate, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, int i) {
        ImageCardTitleBar imageCardTitleBar;
        List<VideoCoverComponent> list;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        ActionLinkComponent actionLinkComponent2 = actionLinkComponent;
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 1) != 0) {
            imageCardTitleBar = imageCardTemplate.titleBar;
        } else {
            imageCardTitleBar = null;
        }
        if ((i & 2) != 0) {
            actionLinkComponent2 = imageCardTemplate.actionLinkComponent;
        }
        if ((i & 4) != 0) {
            list = imageCardTemplate.videoCoversComponentList;
        } else {
            list = null;
        }
        if ((i & 8) != 0) {
            previewHintComponent2 = imageCardTemplate.previewHintComponent;
        }
        if ((i & 16) != 0) {
            baseResponseComponent2 = imageCardTemplate.baseResponseComponent;
        }
        if ((i & 32) != 0) {
            baseRequestComponent2 = imageCardTemplate.baseRequestComponent;
        }
        if ((i & 64) != 0) {
            attachmentComponent = imageCardTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((i & 128) != 0) {
            baseHeaderComponent = imageCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 256) != 0) {
            baseFooterComponent = imageCardTemplate.baseFooterComponent;
        }
        imageCardTemplate.getClass();
        return new ImageCardTemplate(imageCardTitleBar, actionLinkComponent2, list, previewHintComponent2, baseResponseComponent2, baseRequestComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent);
    }

    public ImageCardTemplate(ImageCardTitleBar imageCardTitleBar, ActionLinkComponent actionLinkComponent, List<VideoCoverComponent> list, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.titleBar = imageCardTitleBar;
        this.actionLinkComponent = actionLinkComponent;
        this.videoCoversComponentList = list;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1801;
    }
}
