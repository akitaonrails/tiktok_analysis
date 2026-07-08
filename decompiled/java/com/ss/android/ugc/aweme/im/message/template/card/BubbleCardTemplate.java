package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2237891CiR;
import X.C2241891Cot;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2243491CrT;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.BubbleCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import defpackage.BulletinExtraComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BubbleCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<BubbleCardTemplate> CREATOR = new Parcelable.Creator<BubbleCardTemplate>() { // from class: X.1Cos
        @Override // android.os.Parcelable.Creator
        public final BubbleCardTemplate createFromParcel(Parcel parcel) {
            TextComponent textComponentCreateFromParcel;
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel;
            ArrayList arrayList;
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
                fallbackInfoComponentCreateFromParcel = null;
            } else {
                fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
            }
            FallbackInfoComponent fallbackInfoComponent = fallbackInfoComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ActionLinkComponent.CREATOR.createFromParcel(parcel));
                }
            }
            BulletinExtraComponent bulletinExtraComponentCreateFromParcel = BulletinExtraComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                attachmentComponentCreateFromParcel = null;
            } else {
                attachmentComponentCreateFromParcel = AttachmentComponent.CREATOR.createFromParcel(parcel);
            }
            AttachmentComponent attachmentComponent = attachmentComponentCreateFromParcel;
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                baseHeaderComponentCreateFromParcel = null;
            } else {
                baseHeaderComponentCreateFromParcel = BaseHeaderComponent.CREATOR.createFromParcel(parcel);
            }
            BaseHeaderComponent baseHeaderComponent = baseHeaderComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                baseFooterComponentCreateFromParcel = BaseFooterComponent.CREATOR.createFromParcel(parcel);
            }
            return new BubbleCardTemplate(textComponent, fallbackInfoComponent, arrayList, bulletinExtraComponentCreateFromParcel, attachmentComponent, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BubbleCardTemplate[] newArray(int i) {
            return new BubbleCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final BulletinExtraComponent bulletinExtraComponent;
    public final FallbackInfoComponent fallbackInfo;
    public final List<ActionLinkComponent> linkInfoItems;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final TextComponent textComponent;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleCardTemplate)) {
            return false;
        }
        BubbleCardTemplate bubbleCardTemplate = (BubbleCardTemplate) obj;
        return Intrinsics.LJFF(this.textComponent, bubbleCardTemplate.textComponent) && Intrinsics.LJFF(this.fallbackInfo, bubbleCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.linkInfoItems, bubbleCardTemplate.linkInfoItems) && Intrinsics.LJFF(this.bulletinExtraComponent, bubbleCardTemplate.bulletinExtraComponent) && Intrinsics.LJFF(this.attachment, bubbleCardTemplate.attachment) && Intrinsics.LJFF(this.previewHintComponent, bubbleCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, bubbleCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, bubbleCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseHeaderComponent, bubbleCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, bubbleCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        TextComponent textComponent = this.textComponent;
        int iHashCode = (textComponent == null ? 0 : textComponent.hashCode()) * 31;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        int iHashCode2 = (iHashCode + (fallbackInfoComponent == null ? 0 : fallbackInfoComponent.hashCode())) * 31;
        List<ActionLinkComponent> list = this.linkInfoItems;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.bulletinExtraComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode4 = (((((((iHashCode3 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode5 = (iHashCode4 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode5 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleCardTemplate(textComponent=");
        sbLIZ.append(this.textComponent);
        sbLIZ.append(", fallbackInfo=");
        sbLIZ.append(this.fallbackInfo);
        sbLIZ.append(", linkInfoItems=");
        sbLIZ.append(this.linkInfoItems);
        sbLIZ.append(", bulletinExtraComponent=");
        sbLIZ.append(this.bulletinExtraComponent);
        sbLIZ.append(", attachment=");
        sbLIZ.append(this.attachment);
        sbLIZ.append(", previewHintComponent=");
        sbLIZ.append(this.previewHintComponent);
        sbLIZ.append(", baseRequestComponent=");
        sbLIZ.append(this.baseRequestComponent);
        sbLIZ.append(", baseResponseComponent=");
        sbLIZ.append(this.baseResponseComponent);
        sbLIZ.append(", baseHeaderComponent=");
        sbLIZ.append(this.baseHeaderComponent);
        sbLIZ.append(", baseFooterComponent=");
        sbLIZ.append(this.baseFooterComponent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BubbleCardTemplate() {
        TextComponent.Companion.getClass();
        TextComponent textComponentLIZ = C2243491CrT.LIZ();
        C13BV c13bv = C13BV.INSTANCE;
        BulletinExtraComponent.Companion.getClass();
        BulletinExtraComponent bulletinExtraComponentLIZ = BulletinExtraComponent.b.LIZ();
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseRequestComponent.Companion.getClass();
        this(textComponentLIZ, null, c13bv, bulletinExtraComponentLIZ, null, previewHintComponentLIZ, C18Y8.LIZ(), new BaseResponseComponent(0L, 15), null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        ArrayList arrayList;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        ByteString byteStringLIZJ = C1496910p3Z.LIZJ(c1496910p3Z, C2237891CiR.ADAPTER.encode(this.bulletinExtraComponent.LIZ()));
        C2241891Cot c2241891Cot = new C2241891Cot();
        c2241891Cot.LJIIIIZZ = this.baseRequestComponent.LIZ();
        c2241891Cot.LJIIIZ = this.baseResponseComponent.LIZ();
        c2241891Cot.LJFF = this.previewHintComponent.LIZIZ();
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        c2241891Cot.LJI = fallbackInfoComponent != null ? fallbackInfoComponent.LIZ() : null;
        c2241891Cot.LJII = byteStringLIZJ;
        List<ActionLinkComponent> list = this.linkInfoItems;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<ActionLinkComponent> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ());
            }
        } else {
            arrayList = null;
        }
        C1516540pZE.LIZ(arrayList);
        c2241891Cot.LJ = arrayList;
        TextComponent textComponent = this.textComponent;
        c2241891Cot.LIZLLL = textComponent != null ? textComponent.LIZ() : null;
        c2241961Cp0.LJIIJJI = c2241891Cot.build();
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
        TextComponent textComponent = this.textComponent;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fallbackInfoComponent.writeToParcel(parcel, i);
        }
        List<ActionLinkComponent> list = this.linkInfoItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ActionLinkComponent> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeLong(this.bulletinExtraComponent.exposeCnt);
        AttachmentComponent attachmentComponent = this.attachment;
        if (attachmentComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attachmentComponent.writeToParcel(parcel, i);
        }
        this.previewHintComponent.writeToParcel(parcel, i);
        this.baseRequestComponent.queryData.writeToParcel(parcel, i);
        this.baseResponseComponent.writeToParcel(parcel, i);
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
        return new BubbleCardTemplate(this.textComponent, this.fallbackInfo, this.linkInfoItems, this.bulletinExtraComponent, this.attachment, previewHintComponent, baseRequestComponent, baseResponseComponent, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public BubbleCardTemplate(TextComponent textComponent, FallbackInfoComponent fallbackInfoComponent, List<ActionLinkComponent> list, BulletinExtraComponent bulletinExtraComponent, AttachmentComponent attachmentComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.textComponent = textComponent;
        this.fallbackInfo = fallbackInfoComponent;
        this.linkInfoItems = list;
        this.bulletinExtraComponent = bulletinExtraComponent;
        this.attachment = attachmentComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1810;
    }
}
