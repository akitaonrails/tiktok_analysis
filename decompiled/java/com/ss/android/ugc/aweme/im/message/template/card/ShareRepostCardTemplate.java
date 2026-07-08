package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242491Cpr;
import X.C2242501Cps;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareRepostCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<ShareRepostCardTemplate> CREATOR = new Parcelable.Creator<ShareRepostCardTemplate>() { // from class: X.18Ym
        @Override // android.os.Parcelable.Creator
        public final ShareRepostCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            ShareRepostComponent shareRepostComponentCreateFromParcel = ShareRepostComponent.CREATOR.createFromParcel(parcel);
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
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
            return new ShareRepostCardTemplate(shareRepostComponentCreateFromParcel, fallbackInfoComponentCreateFromParcel, i, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareRepostCardTemplate[] newArray(int i) {
            return new ShareRepostCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final ShareRepostComponent shareRepost;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareRepostCardTemplate() {
        this((ShareRepostComponent) null, (FallbackInfoComponent) (0 == true ? 1 : 0), (PreviewHintComponent) (0 == true ? 1 : 0), (BaseRequestComponent) (0 == true ? 1 : 0), (BaseResponseComponent) (0 == true ? 1 : 0), (AttachmentComponent) (0 == true ? 1 : 0), (BaseHeaderComponent) (0 == true ? 1 : 0), (BaseFooterComponent) (0 == true ? 1 : 0), 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareRepostCardTemplate)) {
            return false;
        }
        ShareRepostCardTemplate shareRepostCardTemplate = (ShareRepostCardTemplate) obj;
        return Intrinsics.LJFF(this.shareRepost, shareRepostCardTemplate.shareRepost) && Intrinsics.LJFF(this.fallbackInfo, shareRepostCardTemplate.fallbackInfo) && this.messageType == shareRepostCardTemplate.messageType && Intrinsics.LJFF(this.previewHintComponent, shareRepostCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, shareRepostCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, shareRepostCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, shareRepostCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, shareRepostCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, shareRepostCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.shareRepost.hashCode() * 31) + this.fallbackInfo.hashCode()) * 31) + this.messageType) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
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
        sbLIZ.append("ShareRepostCardTemplate(shareRepost=");
        sbLIZ.append(this.shareRepost);
        sbLIZ.append(", fallbackInfo=");
        sbLIZ.append(this.fallbackInfo);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.messageType);
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
        AttachmentComponent attachmentComponent = this.attachment;
        c2241961Cp0.LJJIJIIJIL = attachmentComponent != null ? attachmentComponent.LIZ() : null;
        C2242501Cps c2242501Cps = new C2242501Cps();
        ShareRepostComponent shareRepostComponent = this.shareRepost;
        shareRepostComponent.getClass();
        C2242491Cpr c2242491Cpr = new C2242491Cpr();
        c2242491Cpr.LIZLLL = shareRepostComponent.repostId;
        c2242491Cpr.LJ = shareRepostComponent.itemId;
        c2242491Cpr.LJFF = shareRepostComponent.itemUserInfo.LIZ();
        c2242491Cpr.LJI = shareRepostComponent.repostUserInfo.LIZ();
        c2242491Cpr.LJII = shareRepostComponent.repostText.LIZ();
        c2242491Cpr.LJIIIIZZ = shareRepostComponent.repostImage.LIZIZ();
        c2242491Cpr.LJIIIZ = shareRepostComponent.status.toProto();
        c2242501Cps.LIZLLL = c2242491Cpr.build();
        c2242501Cps.LJ = this.fallbackInfo.LIZ();
        c2242501Cps.LJFF = this.previewHintComponent.LIZIZ();
        c2242501Cps.LJII = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJIJ = c2242501Cps.build();
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
        this.shareRepost.writeToParcel(parcel, i);
        this.fallbackInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.messageType);
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
        return new ShareRepostCardTemplate(this.shareRepost, this.fallbackInfo, this.messageType, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShareRepostCardTemplate(ShareRepostComponent shareRepostComponent, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i) {
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        FallbackInfoComponent fallbackInfoComponent2 = fallbackInfoComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        ShareRepostComponent shareRepostComponent2 = (i & 1) != 0 ? new ShareRepostComponent(0) : shareRepostComponent;
        fallbackInfoComponent2 = (i & 2) != 0 ? new FallbackInfoComponent(7) : fallbackInfoComponent2;
        int i2 = (i & 4) != 0 ? 1817 : 0;
        if ((i & 8) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 16) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(shareRepostComponent2, fallbackInfoComponent2, i2, previewHintComponentLIZ, baseRequestComponentLIZ, (i & 32) != 0 ? new BaseResponseComponent(0L, 15) : baseResponseComponent2, (i & 64) != 0 ? null : attachmentComponent2, (i & 128) != 0 ? null : baseHeaderComponent2, (i & 256) == 0 ? baseFooterComponent : null);
    }

    public ShareRepostCardTemplate(ShareRepostComponent shareRepostComponent, FallbackInfoComponent fallbackInfoComponent, int i, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.shareRepost = shareRepostComponent;
        this.fallbackInfo = fallbackInfoComponent;
        this.messageType = i;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
