package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C18Y8;
import X.C18Y9;
import X.C2188811AlT;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242631Cq5;
import X.C2243491CrT;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class VideoCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<VideoCardTemplate> CREATOR = new Parcelable.Creator<VideoCardTemplate>() { // from class: X.1Cq7
        @Override // android.os.Parcelable.Creator
        public final VideoCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            VideoCoverComponent videoCoverComponentCreateFromParcel = VideoCoverComponent.CREATOR.createFromParcel(parcel);
            VideoCardFallbackInfoComponent videoCardFallbackInfoComponentCreateFromParcel = VideoCardFallbackInfoComponent.CREATOR.createFromParcel(parcel);
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
            return new VideoCardTemplate(videoCoverComponentCreateFromParcel, videoCardFallbackInfoComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCardTemplate[] newArray(int i) {
            return new VideoCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final VideoCoverComponent baseVideoComponent;
    public final VideoCardFallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    public VideoCardTemplate() {
        this(null, null, null, null, null, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCardTemplate)) {
            return false;
        }
        VideoCardTemplate videoCardTemplate = (VideoCardTemplate) obj;
        return Intrinsics.LJFF(this.baseVideoComponent, videoCardTemplate.baseVideoComponent) && Intrinsics.LJFF(this.fallbackInfo, videoCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.previewHintComponent, videoCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, videoCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, videoCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, videoCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, videoCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, videoCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.baseVideoComponent.hashCode() * 31) + this.fallbackInfo.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode2 = (iHashCode + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode3 = (iHashCode2 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode3 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCardTemplate(baseVideoComponent=");
        sbLIZ.append(this.baseVideoComponent);
        sbLIZ.append(", fallbackInfo=");
        sbLIZ.append(this.fallbackInfo);
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
        C2242631Cq5 c2242631Cq5 = new C2242631Cq5();
        c2242631Cq5.LIZLLL = this.baseVideoComponent.LIZIZ();
        c2242631Cq5.LJ = this.previewHintComponent.LIZIZ();
        c2242631Cq5.LJIIJJI = this.baseRequestComponent.LIZ();
        c2242631Cq5.LJI = this.fallbackInfo.LIZIZ();
        c2241961Cp0.LJFF = c2242631Cq5.build();
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
        String scene;
        VideoCardTemplate videoCardTemplateLIZ = LIZ(this, null, null, null, null, null, 223);
        if (c869590Y9l != null) {
            scene = c869590Y9l.getScene();
        } else {
            scene = null;
        }
        if (Intrinsics.LJFF(scene, "share_live_highlight")) {
            TextComponent.Companion.getClass();
            BaseHeaderComponent baseHeaderComponent = new BaseHeaderComponent(C2243491CrT.LIZ());
            BaseFooterComponent.Companion.getClass();
            return LIZ(videoCardTemplateLIZ, null, null, null, baseHeaderComponent, BaseFooterComponent.EMPTY_FOOTER_COMPONENT$delegate.getValue(), 31);
        }
        return videoCardTemplateLIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseVideoComponent.writeToParcel(parcel, i);
        this.fallbackInfo.writeToParcel(parcel, i);
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
        return LIZ(this, previewHintComponent, baseRequestComponent, baseResponseComponent, null, null, 227);
    }

    public VideoCardTemplate(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i) {
        VideoCoverComponent videoCoverComponent;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent;
        BaseResponseComponent baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        if ((i & 1) != 0) {
            VideoCoverComponent.Companion.getClass();
            videoCoverComponent = VideoCoverComponent.EMPTY_VIDEO_COVER;
        } else {
            videoCoverComponent = null;
        }
        if ((i & 2) != 0) {
            VideoCardFallbackInfoComponent.Companion.getClass();
            videoCardFallbackInfoComponent = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        } else {
            videoCardFallbackInfoComponent = null;
        }
        if ((i & 4) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 8) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        if ((i & 16) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        this(videoCoverComponent, videoCardFallbackInfoComponent, previewHintComponentLIZ, baseRequestComponentLIZ, baseResponseComponent, (i & 32) != 0 ? null : attachmentComponent2, (i & 64) != 0 ? null : baseHeaderComponent2, (i & 128) == 0 ? baseFooterComponent : null);
    }

    public static VideoCardTemplate LIZ(VideoCardTemplate videoCardTemplate, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i) {
        VideoCoverComponent videoCoverComponent;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseFooterComponent baseFooterComponent2 = baseFooterComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        AttachmentComponent attachmentComponent = null;
        if ((i & 1) != 0) {
            videoCoverComponent = videoCardTemplate.baseVideoComponent;
        } else {
            videoCoverComponent = null;
        }
        if ((i & 2) != 0) {
            videoCardFallbackInfoComponent = videoCardTemplate.fallbackInfo;
        } else {
            videoCardFallbackInfoComponent = null;
        }
        if ((i & 4) != 0) {
            previewHintComponent2 = videoCardTemplate.previewHintComponent;
        }
        if ((i & 8) != 0) {
            baseRequestComponent2 = videoCardTemplate.baseRequestComponent;
        }
        if ((i & 16) != 0) {
            baseResponseComponent2 = videoCardTemplate.baseResponseComponent;
        }
        if ((i & 32) != 0) {
            attachmentComponent = videoCardTemplate.attachment;
        }
        if ((i & 64) != 0) {
            baseHeaderComponent2 = videoCardTemplate.baseHeaderComponent;
        }
        if ((i & 128) != 0) {
            baseFooterComponent2 = videoCardTemplate.baseFooterComponent;
        }
        videoCardTemplate.getClass();
        return new VideoCardTemplate(videoCoverComponent, videoCardFallbackInfoComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, attachmentComponent, baseHeaderComponent2, baseFooterComponent2);
    }

    public VideoCardTemplate(VideoCoverComponent videoCoverComponent, VideoCardFallbackInfoComponent videoCardFallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.baseVideoComponent = videoCoverComponent;
        this.fallbackInfo = videoCardFallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1803;
    }
}
