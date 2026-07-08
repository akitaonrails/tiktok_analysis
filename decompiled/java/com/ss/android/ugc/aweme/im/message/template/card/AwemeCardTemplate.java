package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13LP;
import X.C1496910p3Z;
import X.C1697810uHb;
import X.C18Y8;
import X.C18Y9;
import X.C2237891CiR;
import X.C2240071Clx;
import X.C2240081Cly;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2242511Cpt;
import X.C2242531Cpv;
import X.C2242581Cq0;
import X.C2242631Cq5;
import X.C2243491CrT;
import X.C2244181Csa;
import X.C869590Y9l;
import X.InterfaceC874570YSp;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.HighlightStoryComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import defpackage.BulletinExtraComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AwemeCardTemplate implements BaseTemplate, InterfaceC874570YSp {
    public static final Parcelable.Creator<AwemeCardTemplate> CREATOR = new Parcelable.Creator<AwemeCardTemplate>() { // from class: X.1Cq4
        @Override // android.os.Parcelable.Creator
        public final AwemeCardTemplate createFromParcel(Parcel parcel) {
            TextComponent textComponentCreateFromParcel;
            HighlightStoryComponent highlightStoryComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            VideoCoverComponent videoCoverComponentCreateFromParcel = VideoCoverComponent.CREATOR.createFromParcel(parcel);
            VideoCardFallbackInfoComponent videoCardFallbackInfoComponentCreateFromParcel = VideoCardFallbackInfoComponent.CREATOR.createFromParcel(parcel);
            BaseUserComponent baseUserComponentCreateFromParcel = BaseUserComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel = null;
            } else {
                textComponentCreateFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent = textComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                highlightStoryComponentCreateFromParcel = null;
            } else {
                highlightStoryComponentCreateFromParcel = HighlightStoryComponent.CREATOR.createFromParcel(parcel);
            }
            HighlightStoryComponent highlightStoryComponent = highlightStoryComponentCreateFromParcel;
            BulletinExtraComponent bulletinExtraComponentCreateFromParcel = BulletinExtraComponent.CREATOR.createFromParcel(parcel);
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
            return new AwemeCardTemplate(videoCoverComponentCreateFromParcel, videoCardFallbackInfoComponentCreateFromParcel, baseUserComponentCreateFromParcel, textComponent, highlightStoryComponent, bulletinExtraComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AwemeCardTemplate[] newArray(int i) {
            return new AwemeCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final BaseUserComponent baseUserComponent;
    public final VideoCoverComponent baseVideoComponent;
    public final BulletinExtraComponent bulletinExtraComponent;
    public final VideoCardFallbackInfoComponent fallbackInfo;
    public final HighlightStoryComponent highlightStoryComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final TextComponent topInlineTextComponent;

    public AwemeCardTemplate() {
        this(null, null, null, null, null, null, null, 4095);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeCardTemplate)) {
            return false;
        }
        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) obj;
        return Intrinsics.LJFF(this.baseVideoComponent, awemeCardTemplate.baseVideoComponent) && Intrinsics.LJFF(this.fallbackInfo, awemeCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.baseUserComponent, awemeCardTemplate.baseUserComponent) && Intrinsics.LJFF(this.topInlineTextComponent, awemeCardTemplate.topInlineTextComponent) && Intrinsics.LJFF(this.highlightStoryComponent, awemeCardTemplate.highlightStoryComponent) && Intrinsics.LJFF(this.bulletinExtraComponent, awemeCardTemplate.bulletinExtraComponent) && Intrinsics.LJFF(this.previewHintComponent, awemeCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, awemeCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, awemeCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, awemeCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, awemeCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, awemeCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((this.baseVideoComponent.hashCode() * 31) + this.fallbackInfo.hashCode()) * 31) + this.baseUserComponent.hashCode()) * 31;
        TextComponent textComponent = this.topInlineTextComponent;
        int iHashCode2 = (iHashCode + (textComponent == null ? 0 : textComponent.hashCode())) * 31;
        HighlightStoryComponent highlightStoryComponent = this.highlightStoryComponent;
        int iHashCode3 = (((((((((iHashCode2 + (highlightStoryComponent == null ? 0 : highlightStoryComponent.hashCode())) * 31) + this.bulletinExtraComponent.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode4 = (iHashCode3 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode5 = (iHashCode4 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode5 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    public final String toString() {
        return "AwemeCardTemplate(baseVideoComponent=" + this.baseVideoComponent + ", fallbackInfo=" + this.fallbackInfo + ", baseUserComponent=" + this.baseUserComponent + ", topInlineTextComponent=" + this.topInlineTextComponent + ", highlightStoryComponent=" + this.highlightStoryComponent + ", bulletinExtraComponent=" + this.bulletinExtraComponent + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
    }

    @Override // X.InterfaceC874570YSp
    public final ByteString LIZ() {
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2242581Cq0 c2242581Cq0LIZLLL = LIZLLL();
        C2242631Cq5 c2242631Cq5NewBuilder = c2242581Cq0LIZLLL.newBuilder();
        C2244181Csa c2244181CsaNewBuilder = c2242581Cq0LIZLLL.video.newBuilder();
        c2244181CsaNewBuilder.LJI = null;
        c2244181CsaNewBuilder.LJFF = null;
        c2244181CsaNewBuilder.LJII = null;
        c2242631Cq5NewBuilder.LIZLLL = c2244181CsaNewBuilder.build();
        C2242531Cpv c2242531CpvNewBuilder = c2242581Cq0LIZLLL.user_info.newBuilder();
        c2242531CpvNewBuilder.LJ = null;
        c2242531CpvNewBuilder.LJFF = null;
        c2242531CpvNewBuilder.LJI = null;
        c2242531CpvNewBuilder.LJII = null;
        c2242531CpvNewBuilder.LJIIIIZZ = null;
        c2242531CpvNewBuilder.LJIIIZ = null;
        c2242531CpvNewBuilder.LJIIJ = null;
        c2242631Cq5NewBuilder.LJII = c2242531CpvNewBuilder.build();
        c2241961Cp0.LJFF = c2242631Cq5NewBuilder.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c2241961Cp0.build()));
    }

    public final C2242581Cq0 LIZLLL() {
        ByteString byteStringLIZJ = C1496910p3Z.LIZJ(ByteString.Companion, C2237891CiR.ADAPTER.encode(this.bulletinExtraComponent.LIZ()));
        C2242631Cq5 c2242631Cq5 = new C2242631Cq5();
        c2242631Cq5.LIZLLL = this.baseVideoComponent.LIZIZ();
        c2242631Cq5.LJ = this.previewHintComponent.LIZIZ();
        c2242631Cq5.LJIIJJI = this.baseRequestComponent.LIZ();
        c2242631Cq5.LJI = this.fallbackInfo.LIZIZ();
        c2242631Cq5.LJIIJ = byteStringLIZJ;
        c2242631Cq5.LJII = this.baseUserComponent.LIZ();
        TextComponent textComponent = this.topInlineTextComponent;
        C2240071Clx c2240071ClxBuild = null;
        c2242631Cq5.LJIIIIZZ = textComponent != null ? textComponent.LIZ() : null;
        HighlightStoryComponent highlightStoryComponent = this.highlightStoryComponent;
        if (highlightStoryComponent != null) {
            C2240081Cly c2240081Cly = new C2240081Cly();
            c2240081Cly.LIZLLL = highlightStoryComponent.highlightStoryCollectionId;
            c2240071ClxBuild = c2240081Cly.build();
        }
        c2242631Cq5.LJIIIZ = c2240071ClxBuild;
        return c2242631Cq5.build();
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
        c2241961Cp0.LJFF = LIZLLL();
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

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        String str;
        if (c869590Y9l == null) {
            return false;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI("video_mention", "video_tag", "video_mention_and_tag", "story_mention", "add_story_to_story", "link");
        Map<String, String> ext = c869590Y9l.getExt();
        if (ext != null) {
            str = ext.get("a:src");
        } else {
            str = null;
        }
        return C13LP.LJJJJ(str, listLJIIJJI);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final Map<String, String> Xr(C869590Y9l c869590Y9l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c869590Y9l.getExt());
        if (LIZIZ(c869590Y9l)) {
            linkedHashMap.remove("a:src");
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        if (!LIZIZ(c869590Y9l)) {
            return this;
        }
        TextComponent.Companion.getClass();
        BaseHeaderComponent baseHeaderComponent = new BaseHeaderComponent(C2243491CrT.LIZ());
        BaseFooterComponent.Companion.getClass();
        return LIZJ(this, null, null, null, null, null, null, baseHeaderComponent, BaseFooterComponent.EMPTY_FOOTER_COMPONENT$delegate.getValue(), 1023);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseVideoComponent.writeToParcel(parcel, i);
        this.fallbackInfo.writeToParcel(parcel, i);
        this.baseUserComponent.writeToParcel(parcel, i);
        TextComponent textComponent = this.topInlineTextComponent;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        HighlightStoryComponent highlightStoryComponent = this.highlightStoryComponent;
        if (highlightStoryComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(highlightStoryComponent.highlightStoryCollectionId);
        }
        parcel.writeLong(this.bulletinExtraComponent.exposeCnt);
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
        TextComponent.Companion.getClass();
        return LIZJ(this, null, null, C2243491CrT.LIZ(), previewHintComponent, baseRequestComponent, baseResponseComponent, null, null, 3639);
    }

    public AwemeCardTemplate(VideoCoverComponent videoCoverComponent, VideoCardFallbackInfoComponent videoCardFallbackInfoComponent, BaseUserComponent baseUserComponent, HighlightStoryComponent highlightStoryComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseHeaderComponent baseHeaderComponent, int i) {
        TextComponent textComponentLIZ;
        BulletinExtraComponent bulletinExtraComponentLIZ;
        BaseResponseComponent baseResponseComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        HighlightStoryComponent value = highlightStoryComponent;
        BaseUserComponent baseUserComponentLIZ = baseUserComponent;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent2 = videoCardFallbackInfoComponent;
        VideoCoverComponent videoCoverComponent2 = videoCoverComponent;
        if ((i & 1) != 0) {
            VideoCoverComponent.Companion.getClass();
            videoCoverComponent2 = VideoCoverComponent.EMPTY_VIDEO_COVER;
        }
        if ((i & 2) != 0) {
            VideoCardFallbackInfoComponent.Companion.getClass();
            videoCardFallbackInfoComponent2 = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        if ((i & 4) != 0) {
            BaseUserComponent.Companion.getClass();
            baseUserComponentLIZ = C2242511Cpt.LIZ();
        }
        if ((i & 8) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        } else {
            textComponentLIZ = null;
        }
        if ((i & 16) != 0) {
            HighlightStoryComponent.Companion.getClass();
            value = HighlightStoryComponent.EMPTY_HIGHLIGHT_STORY_COMPONENT$delegate.getValue();
        }
        if ((i & 32) != 0) {
            BulletinExtraComponent.Companion.getClass();
            bulletinExtraComponentLIZ = BulletinExtraComponent.b.LIZ();
        } else {
            bulletinExtraComponentLIZ = null;
        }
        if ((i & 64) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i & 128) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        if ((i & 256) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        this(videoCoverComponent2, videoCardFallbackInfoComponent2, baseUserComponentLIZ, textComponentLIZ, value, bulletinExtraComponentLIZ, previewHintComponentLIZ, baseRequestComponentLIZ, baseResponseComponent, null, (i & 1024) == 0 ? baseHeaderComponent : null, null);
    }

    public static AwemeCardTemplate LIZJ(AwemeCardTemplate awemeCardTemplate, VideoCoverComponent videoCoverComponent, VideoCardFallbackInfoComponent videoCardFallbackInfoComponent, TextComponent textComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i) {
        BaseUserComponent baseUserComponent;
        HighlightStoryComponent highlightStoryComponent;
        BulletinExtraComponent bulletinExtraComponent;
        BaseFooterComponent baseFooterComponent2 = baseFooterComponent;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        VideoCoverComponent videoCoverComponent2 = videoCoverComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent2 = videoCardFallbackInfoComponent;
        TextComponent textComponent2 = textComponent;
        if ((i & 1) != 0) {
            videoCoverComponent2 = awemeCardTemplate.baseVideoComponent;
        }
        if ((i & 2) != 0) {
            videoCardFallbackInfoComponent2 = awemeCardTemplate.fallbackInfo;
        }
        AttachmentComponent attachmentComponent = null;
        if ((i & 4) != 0) {
            baseUserComponent = awemeCardTemplate.baseUserComponent;
        } else {
            baseUserComponent = null;
        }
        if ((i & 8) != 0) {
            textComponent2 = awemeCardTemplate.topInlineTextComponent;
        }
        if ((i & 16) != 0) {
            highlightStoryComponent = awemeCardTemplate.highlightStoryComponent;
        } else {
            highlightStoryComponent = null;
        }
        if ((i & 32) != 0) {
            bulletinExtraComponent = awemeCardTemplate.bulletinExtraComponent;
        } else {
            bulletinExtraComponent = null;
        }
        if ((i & 64) != 0) {
            previewHintComponent2 = awemeCardTemplate.previewHintComponent;
        }
        if ((i & 128) != 0) {
            baseRequestComponent2 = awemeCardTemplate.baseRequestComponent;
        }
        if ((i & 256) != 0) {
            baseResponseComponent2 = awemeCardTemplate.baseResponseComponent;
        }
        if ((i & 512) != 0) {
            attachmentComponent = awemeCardTemplate.attachment;
        }
        if ((i & 1024) != 0) {
            baseHeaderComponent2 = awemeCardTemplate.baseHeaderComponent;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            baseFooterComponent2 = awemeCardTemplate.baseFooterComponent;
        }
        awemeCardTemplate.getClass();
        return new AwemeCardTemplate(videoCoverComponent2, videoCardFallbackInfoComponent2, baseUserComponent, textComponent2, highlightStoryComponent, bulletinExtraComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, attachmentComponent, baseHeaderComponent2, baseFooterComponent2);
    }

    public AwemeCardTemplate(VideoCoverComponent videoCoverComponent, VideoCardFallbackInfoComponent videoCardFallbackInfoComponent, BaseUserComponent baseUserComponent, TextComponent textComponent, HighlightStoryComponent highlightStoryComponent, BulletinExtraComponent bulletinExtraComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.baseVideoComponent = videoCoverComponent;
        this.fallbackInfo = videoCardFallbackInfoComponent;
        this.baseUserComponent = baseUserComponent;
        this.topInlineTextComponent = textComponent;
        this.highlightStoryComponent = highlightStoryComponent;
        this.bulletinExtraComponent = bulletinExtraComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1809;
    }
}
