package com.ss.android.ugc.aweme.im.message.template.card;

import X.C0IBD;
import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C18ZU;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C2243581Crc;
import X.C2243601Cre;
import X.C2243641Cri;
import X.C2243651Crj;
import X.C2243661Crk;
import X.C2243721Crq;
import X.C2243751Crt;
import X.C2243771Crv;
import X.C2243791Crx;
import X.C2243851Cs3;
import X.C2244191Csb;
import X.C869590Y9l;
import X.EnumC19365810pc;
import X.EnumC2240681Cmw;
import X.EnumC2243731Crr;
import X.EnumC2243761Cru;
import X.InterfaceC874570YSp;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MixStudioComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class StickerTemplate implements BaseTemplate, InterfaceC874570YSp {
    public final AttachmentComponent attachment;
    public final AvatarDuoInfoComponent avatarDuoInfoComponent;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final List<EnumC2243731Crr> blockedActions;
    public final StickerCardFallbackInfoComponent fallbackInfo;
    public final ImageComponent imageComponent;
    public final String lightInteractionName;
    public final int messageType;
    public final MixStudioComponent mixStudioInfoComponent;
    public final PreviewHintComponent previewHintComponent;
    public final int stickerCreateScene;
    public final int stickerVariant;
    public final UserInfoComponent userInfo;
    public static final C2243851Cs3 Companion = new Object() { // from class: X.1Cs3
    };
    public static final Parcelable.Creator<StickerTemplate> CREATOR = new Parcelable.Creator<StickerTemplate>() { // from class: X.1CrU
        @Override // android.os.Parcelable.Creator
        public final StickerTemplate createFromParcel(Parcel parcel) {
            UserInfoComponent userInfoComponentCreateFromParcel;
            MixStudioComponent mixStudioComponentCreateFromParcel;
            AvatarDuoInfoComponent avatarDuoInfoComponentCreateFromParcel;
            ArrayList arrayList;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            ImageComponent imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            StickerCardFallbackInfoComponent stickerCardFallbackInfoComponentCreateFromParcel = StickerCardFallbackInfoComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                userInfoComponentCreateFromParcel = null;
            } else {
                userInfoComponentCreateFromParcel = UserInfoComponent.CREATOR.createFromParcel(parcel);
            }
            UserInfoComponent userInfoComponent = userInfoComponentCreateFromParcel;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                mixStudioComponentCreateFromParcel = null;
            } else {
                mixStudioComponentCreateFromParcel = MixStudioComponent.CREATOR.createFromParcel(parcel);
            }
            MixStudioComponent mixStudioComponent = mixStudioComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                avatarDuoInfoComponentCreateFromParcel = null;
            } else {
                avatarDuoInfoComponentCreateFromParcel = AvatarDuoInfoComponent.CREATOR.createFromParcel(parcel);
            }
            AvatarDuoInfoComponent avatarDuoInfoComponent = avatarDuoInfoComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(EnumC2243731Crr.valueOf(parcel.readString()));
                }
            }
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
            return new StickerTemplate(imageComponentCreateFromParcel, stickerCardFallbackInfoComponentCreateFromParcel, userInfoComponent, string, i, i2, mixStudioComponent, avatarDuoInfoComponent, arrayList, attachmentComponent, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerTemplate[] newArray(int i) {
            return new StickerTemplate[i];
        }
    };

    public StickerTemplate() {
        this(null, null, null, 0, 0, null, null, null, null, null, null, null, 32767);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerTemplate)) {
            return false;
        }
        StickerTemplate stickerTemplate = (StickerTemplate) obj;
        return Intrinsics.LJFF(this.imageComponent, stickerTemplate.imageComponent) && Intrinsics.LJFF(this.fallbackInfo, stickerTemplate.fallbackInfo) && Intrinsics.LJFF(this.userInfo, stickerTemplate.userInfo) && Intrinsics.LJFF(this.lightInteractionName, stickerTemplate.lightInteractionName) && this.stickerCreateScene == stickerTemplate.stickerCreateScene && this.stickerVariant == stickerTemplate.stickerVariant && Intrinsics.LJFF(this.mixStudioInfoComponent, stickerTemplate.mixStudioInfoComponent) && Intrinsics.LJFF(this.avatarDuoInfoComponent, stickerTemplate.avatarDuoInfoComponent) && Intrinsics.LJFF(this.blockedActions, stickerTemplate.blockedActions) && Intrinsics.LJFF(this.attachment, stickerTemplate.attachment) && Intrinsics.LJFF(this.previewHintComponent, stickerTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, stickerTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, stickerTemplate.baseResponseComponent) && Intrinsics.LJFF(this.baseHeaderComponent, stickerTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, stickerTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((this.imageComponent.hashCode() * 31) + this.fallbackInfo.hashCode()) * 31;
        UserInfoComponent userInfoComponent = this.userInfo;
        int iHashCode2 = (iHashCode + (userInfoComponent == null ? 0 : userInfoComponent.hashCode())) * 31;
        String str = this.lightInteractionName;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.stickerCreateScene) * 31) + this.stickerVariant) * 31;
        MixStudioComponent mixStudioComponent = this.mixStudioInfoComponent;
        int iHashCode4 = (iHashCode3 + (mixStudioComponent == null ? 0 : mixStudioComponent.hashCode())) * 31;
        AvatarDuoInfoComponent avatarDuoInfoComponent = this.avatarDuoInfoComponent;
        int iHashCode5 = (iHashCode4 + (avatarDuoInfoComponent == null ? 0 : avatarDuoInfoComponent.hashCode())) * 31;
        List<EnumC2243731Crr> list = this.blockedActions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode7 = (((((((iHashCode6 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode8 = (iHashCode7 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode8 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    public final String toString() {
        return "StickerTemplate(imageComponent=" + this.imageComponent + ", fallbackInfo=" + this.fallbackInfo + ", userInfo=" + this.userInfo + ", lightInteractionName=" + this.lightInteractionName + ", stickerCreateScene=" + this.stickerCreateScene + ", stickerVariant=" + this.stickerVariant + ", mixStudioInfoComponent=" + this.mixStudioInfoComponent + ", avatarDuoInfoComponent=" + this.avatarDuoInfoComponent + ", blockedActions=" + this.blockedActions + ", attachment=" + this.attachment + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
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
        C2243581Crc c2243581CrcLIZLLL = LIZLLL();
        C2243661Crk c2243661CrkNewBuilder = c2243581CrcLIZLLL.newBuilder();
        C2244191Csb c2244191CsbNewBuilder = c2243581CrcLIZLLL.sticker.newBuilder();
        C13BV c13bv = C13BV.INSTANCE;
        c2244191CsbNewBuilder.getClass();
        C1516540pZE.LIZ(c13bv);
        c2244191CsbNewBuilder.LJ = c13bv;
        c2243661CrkNewBuilder.LIZLLL = c2244191CsbNewBuilder.build();
        C2243771Crv c2243771CrvNewBuilder = c2243581CrcLIZLLL.sticker_creator_user_info.newBuilder();
        c2243771CrvNewBuilder.LJFF = null;
        c2243661CrkNewBuilder.LJI = c2243771CrvNewBuilder.build();
        c2241961Cp0.LJII = c2243661CrkNewBuilder.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c2241961Cp0.build()));
    }

    public final boolean LIZJ() {
        return this.fallbackInfo.placeholder.iconType == IconTypeComponent.DEFAULT;
    }

    public final C2243581Crc LIZLLL() {
        C2243641Cri c2243641CriBuild;
        C2243601Cre c2243601CreBuild;
        ArrayList arrayList;
        C2243661Crk c2243661Crk = new C2243661Crk();
        c2243661Crk.LIZLLL = this.imageComponent.LIZIZ();
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent = this.fallbackInfo;
        stickerCardFallbackInfoComponent.getClass();
        C2243791Crx c2243791Crx = new C2243791Crx();
        c2243791Crx.LIZLLL = stickerCardFallbackInfoComponent.placeholder.LIZIZ();
        c2243661Crk.LJFF = c2243791Crx.build();
        UserInfoComponent userInfoComponent = this.userInfo;
        C2243651Crj c2243651CrjBuild = null;
        if (userInfoComponent != null) {
            C2243771Crv c2243771Crv = new C2243771Crv();
            c2243771Crv.LIZLLL = Long.valueOf(userInfoComponent.userId);
            c2243771Crv.LJ = userInfoComponent.nickName;
            c2243771Crv.LJFF = userInfoComponent.avatarThumb.LIZIZ();
            c2243641CriBuild = c2243771Crv.build();
        } else {
            c2243641CriBuild = null;
        }
        c2243661Crk.LJI = c2243641CriBuild;
        c2243661Crk.LJ = this.previewHintComponent.LIZIZ();
        c2243661Crk.LJIILL = this.baseRequestComponent.LIZ();
        AttachmentComponent attachmentComponent = this.attachment;
        c2243661Crk.LJII = attachmentComponent != null ? attachmentComponent.LIZ() : null;
        c2243661Crk.LJIIIIZZ = this.lightInteractionName;
        c2243661Crk.LJIIIZ = C0IBD.fromValue(this.stickerCreateScene);
        c2243661Crk.LJIIL = EnumC2243761Cru.fromValue(this.stickerVariant);
        MixStudioComponent mixStudioComponent = this.mixStudioInfoComponent;
        if (mixStudioComponent != null) {
            C2243721Crq c2243721Crq = new C2243721Crq();
            c2243721Crq.LIZLLL = mixStudioComponent.textElement;
            c2243721Crq.LJ = mixStudioComponent.emojiElement;
            c2243721Crq.LJFF = mixStudioComponent.promptText;
            c2243721Crq.LJI = Long.valueOf(mixStudioComponent.materialStickerId);
            c2243721Crq.LJII = EnumC2240681Cmw.fromValue(mixStudioComponent.materialStickerType);
            c2243721Crq.LJIIIIZZ = mixStudioComponent.elementType.toProto();
            c2243721Crq.LJIIIZ = mixStudioComponent.remixerUid;
            c2243721Crq.LJIIJ = mixStudioComponent.remixerNickname;
            c2243721Crq.LJIIJJI = mixStudioComponent.remixeeUid;
            c2243721Crq.LJIIL = mixStudioComponent.remixeeNickname;
            c2243721Crq.LJIILIIL = mixStudioComponent.elementId;
            c2243721Crq.LJIILJJIL = mixStudioComponent.elementUri;
            c2243721Crq.LJIILL = mixStudioComponent.elementUrl;
            c2243601CreBuild = c2243721Crq.build();
        } else {
            c2243601CreBuild = null;
        }
        c2243661Crk.LJIIJJI = c2243601CreBuild;
        List<EnumC2243731Crr> list = this.blockedActions;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<EnumC2243731Crr> it2 = list.iterator();
            while (it2.hasNext()) {
                EnumC19365810pc enumC19365810pcFromValue = EnumC19365810pc.fromValue(it2.next().getValue());
                if (enumC19365810pcFromValue != null) {
                    arrayList.add(enumC19365810pcFromValue);
                }
            }
        } else {
            arrayList = null;
        }
        C1516540pZE.LIZ(arrayList);
        c2243661Crk.LJIILIIL = arrayList;
        AvatarDuoInfoComponent avatarDuoInfoComponent = this.avatarDuoInfoComponent;
        if (avatarDuoInfoComponent != null) {
            C2243751Crt c2243751Crt = new C2243751Crt();
            List<Long> list2 = avatarDuoInfoComponent.userIdList;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Long> it3 = list2.iterator();
            while (it3.hasNext()) {
                long jLongValue = it3.next().longValue();
                C2243771Crv c2243771Crv2 = new C2243771Crv();
                c2243771Crv2.LIZLLL = Long.valueOf(jLongValue);
                arrayList2.add(c2243771Crv2.build());
            }
            C1516540pZE.LIZ(arrayList2);
            c2243751Crt.LIZLLL = arrayList2;
            c2243651CrjBuild = c2243751Crt.build();
        }
        c2243661Crk.LJIIJ = c2243651CrjBuild;
        return c2243661Crk.build();
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
        c2241961Cp0.LJII = LIZLLL();
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
        MixStudioComponent mixStudioComponent;
        MixStudioComponent mixStudioComponent2 = this.mixStudioInfoComponent;
        if (mixStudioComponent2 != null) {
            mixStudioComponent = new MixStudioComponent(mixStudioComponent2.textElement, mixStudioComponent2.emojiElement, mixStudioComponent2.promptText, mixStudioComponent2.materialStickerId, mixStudioComponent2.materialStickerType, mixStudioComponent2.elementType, null, null, null, null, mixStudioComponent2.elementId, mixStudioComponent2.elementUri, mixStudioComponent2.elementUrl);
        } else {
            mixStudioComponent = null;
        }
        return LIZIZ(this, null, null, mixStudioComponent, null, null, null, 23999);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.imageComponent.writeToParcel(parcel, i);
        this.fallbackInfo.placeholder.writeToParcel(parcel, i);
        UserInfoComponent userInfoComponent = this.userInfo;
        if (userInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userInfoComponent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.lightInteractionName);
        parcel.writeInt(this.stickerCreateScene);
        parcel.writeInt(this.stickerVariant);
        MixStudioComponent mixStudioComponent = this.mixStudioInfoComponent;
        if (mixStudioComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mixStudioComponent.writeToParcel(parcel, i);
        }
        AvatarDuoInfoComponent avatarDuoInfoComponent = this.avatarDuoInfoComponent;
        if (avatarDuoInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatarDuoInfoComponent.writeToParcel(parcel, i);
        }
        List<EnumC2243731Crr> list = this.blockedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<EnumC2243731Crr> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().name());
            }
        }
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
        return LIZIZ(this, null, null, null, previewHintComponent, baseRequestComponent, baseResponseComponent, 25599);
    }

    public static StickerTemplate LIZIZ(StickerTemplate stickerTemplate, ImageComponent imageComponent, StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent, MixStudioComponent mixStudioComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        UserInfoComponent userInfoComponent;
        String str;
        int i2;
        AvatarDuoInfoComponent avatarDuoInfoComponent;
        List<EnumC2243731Crr> list;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        ImageComponent imageComponent2 = imageComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        MixStudioComponent mixStudioComponent2 = mixStudioComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent2 = stickerCardFallbackInfoComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        if ((i & 1) != 0) {
            imageComponent2 = stickerTemplate.imageComponent;
        }
        if ((i & 2) != 0) {
            stickerCardFallbackInfoComponent2 = stickerTemplate.fallbackInfo;
        }
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 4) != 0) {
            userInfoComponent = stickerTemplate.userInfo;
        } else {
            userInfoComponent = null;
        }
        if ((i & 8) != 0) {
            str = stickerTemplate.lightInteractionName;
        } else {
            str = null;
        }
        int i3 = 0;
        if ((i & 16) != 0) {
            i2 = stickerTemplate.stickerCreateScene;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = stickerTemplate.stickerVariant;
        }
        if ((i & 64) != 0) {
            mixStudioComponent2 = stickerTemplate.mixStudioInfoComponent;
        }
        if ((i & 128) != 0) {
            avatarDuoInfoComponent = stickerTemplate.avatarDuoInfoComponent;
        } else {
            avatarDuoInfoComponent = null;
        }
        if ((i & 256) != 0) {
            list = stickerTemplate.blockedActions;
        } else {
            list = null;
        }
        if ((i & 512) != 0) {
            attachmentComponent = stickerTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((i & 1024) != 0) {
            previewHintComponent2 = stickerTemplate.previewHintComponent;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            baseRequestComponent2 = stickerTemplate.baseRequestComponent;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            baseResponseComponent2 = stickerTemplate.baseResponseComponent;
        }
        if ((i & 8192) != 0) {
            baseHeaderComponent = stickerTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 16384) != 0) {
            baseFooterComponent = stickerTemplate.baseFooterComponent;
        }
        stickerTemplate.getClass();
        return new StickerTemplate(imageComponent2, stickerCardFallbackInfoComponent2, userInfoComponent, str, i2, i3, mixStudioComponent2, avatarDuoInfoComponent, list, attachmentComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, baseHeaderComponent, baseFooterComponent);
    }

    public StickerTemplate(ImageComponent imageComponent, UserInfoComponent userInfoComponent, String str, int i, int i2, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, List list, AttachmentComponent attachmentComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseHeaderComponent baseHeaderComponent, int i3) {
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent;
        BaseResponseComponent baseResponseComponent;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        int value = i2;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        AvatarDuoInfoComponent avatarDuoInfoComponent2 = avatarDuoInfoComponent;
        ImageComponent imageComponentLIZ = imageComponent;
        List list2 = list;
        MixStudioComponent mixStudioComponent2 = mixStudioComponent;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        String str2 = str;
        int i4 = i;
        UserInfoComponent userInfoComponent2 = userInfoComponent;
        if ((i3 & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        if ((i3 & 2) != 0) {
            StickerCardFallbackInfoComponent.Companion.getClass();
            stickerCardFallbackInfoComponent = StickerCardFallbackInfoComponent.EMPTY_FALLBACK;
        } else {
            stickerCardFallbackInfoComponent = null;
        }
        if ((i3 & 4) != 0) {
            UserInfoComponent.Companion.getClass();
            userInfoComponent2 = UserInfoComponent.EMPTY_USER_INFO;
        }
        str2 = (i3 & 8) != 0 ? null : str2;
        i4 = (i3 & 16) != 0 ? 0 : i4;
        value = (i3 & 32) != 0 ? EnumC2243761Cru.StickerVariant_Unknown.getValue() : value;
        mixStudioComponent2 = (i3 & 64) != 0 ? null : mixStudioComponent2;
        avatarDuoInfoComponent2 = (i3 & 128) != 0 ? null : avatarDuoInfoComponent2;
        list2 = (i3 & 256) != 0 ? C13BV.INSTANCE : list2;
        attachmentComponent2 = (i3 & 512) != 0 ? null : attachmentComponent2;
        if ((i3 & 1024) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        } else {
            baseResponseComponent = null;
        }
        this(imageComponentLIZ, stickerCardFallbackInfoComponent, userInfoComponent2, str2, i4, value, mixStudioComponent2, avatarDuoInfoComponent2, list2, attachmentComponent2, previewHintComponentLIZ, baseRequestComponentLIZ, baseResponseComponent, (i3 & 8192) != 0 ? null : baseHeaderComponent2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickerTemplate(ImageComponent imageComponent, StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent, UserInfoComponent userInfoComponent, String str, int i, int i2, MixStudioComponent mixStudioComponent, AvatarDuoInfoComponent avatarDuoInfoComponent, List<? extends EnumC2243731Crr> list, AttachmentComponent attachmentComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.imageComponent = imageComponent;
        this.fallbackInfo = stickerCardFallbackInfoComponent;
        this.userInfo = userInfoComponent;
        this.lightInteractionName = str;
        this.stickerCreateScene = i;
        this.stickerVariant = i2;
        this.mixStudioInfoComponent = mixStudioComponent;
        this.avatarDuoInfoComponent = avatarDuoInfoComponent;
        this.blockedActions = list;
        this.attachment = attachmentComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 1805;
    }
}
