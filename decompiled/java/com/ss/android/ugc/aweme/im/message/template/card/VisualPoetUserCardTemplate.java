package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C2241741Coe;
import X.C2241751Cof;
import X.C2241761Cog;
import X.C2241831Con;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetSystemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetUserComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class VisualPoetUserCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<VisualPoetUserCardTemplate> CREATOR = new Parcelable.Creator<VisualPoetUserCardTemplate>() { // from class: X.18Yc
        @Override // android.os.Parcelable.Creator
        public final VisualPoetUserCardTemplate createFromParcel(Parcel parcel) {
            VisualPoetSystemComponent visualPoetSystemComponentCreateFromParcel;
            boolean z;
            boolean z2;
            LinkedHashMap linkedHashMap;
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            VisualPoetUserComponent visualPoetUserComponentCreateFromParcel = VisualPoetUserComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                visualPoetSystemComponentCreateFromParcel = null;
            } else {
                visualPoetSystemComponentCreateFromParcel = VisualPoetSystemComponent.CREATOR.createFromParcel(parcel);
            }
            VisualPoetSystemComponent visualPoetSystemComponent = visualPoetSystemComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                fallbackInfoComponentCreateFromParcel = null;
            } else {
                fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
            }
            FallbackInfoComponent fallbackInfoComponent = fallbackInfoComponentCreateFromParcel;
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
            return new VisualPoetUserCardTemplate(visualPoetUserComponentCreateFromParcel, visualPoetSystemComponent, z, z2, linkedHashMap, fallbackInfoComponent, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetUserCardTemplate[] newArray(int i) {
            return new VisualPoetUserCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final Map<String, String> extra;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType = 1819;
    public final PreviewHintComponent previewHintComponent;
    public final VisualPoetSystemComponent systemContentComponent;
    public final boolean systemContentInvisible;
    public final VisualPoetUserComponent userContentComponent;
    public final boolean userContentInvisible;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetUserCardTemplate)) {
            return false;
        }
        VisualPoetUserCardTemplate visualPoetUserCardTemplate = (VisualPoetUserCardTemplate) obj;
        return Intrinsics.LJFF(this.userContentComponent, visualPoetUserCardTemplate.userContentComponent) && Intrinsics.LJFF(this.systemContentComponent, visualPoetUserCardTemplate.systemContentComponent) && this.userContentInvisible == visualPoetUserCardTemplate.userContentInvisible && this.systemContentInvisible == visualPoetUserCardTemplate.systemContentInvisible && Intrinsics.LJFF(this.extra, visualPoetUserCardTemplate.extra) && Intrinsics.LJFF(this.fallbackInfo, visualPoetUserCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.previewHintComponent, visualPoetUserCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, visualPoetUserCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, visualPoetUserCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, visualPoetUserCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, visualPoetUserCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, visualPoetUserCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = this.userContentComponent.hashCode() * 31;
        VisualPoetSystemComponent visualPoetSystemComponent = this.systemContentComponent;
        int iHashCode2 = (((((iHashCode + (visualPoetSystemComponent == null ? 0 : visualPoetSystemComponent.hashCode())) * 31) + C786410Ut5.Z2(this.userContentInvisible)) * 31) + C786410Ut5.Z2(this.systemContentInvisible)) * 31;
        Map<String, String> map = this.extra;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        int iHashCode4 = (((((((iHashCode3 + (fallbackInfoComponent == null ? 0 : fallbackInfoComponent.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
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
        return "VisualPoetUserCardTemplate(userContentComponent=" + this.userContentComponent + ", systemContentComponent=" + this.systemContentComponent + ", userContentInvisible=" + this.userContentInvisible + ", systemContentInvisible=" + this.systemContentInvisible + ", extra=" + this.extra + ", fallbackInfo=" + this.fallbackInfo + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        C2241761Cog c2241761CogBuild;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2241741Coe c2241741Coe = new C2241741Coe();
        VisualPoetUserComponent visualPoetUserComponent = this.userContentComponent;
        visualPoetUserComponent.getClass();
        C2241831Con c2241831Con = new C2241831Con();
        c2241831Con.LIZLLL = visualPoetUserComponent.text;
        List<VisualPoetPictureStructComponent> list = visualPoetUserComponent.images;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<VisualPoetPictureStructComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        C1516540pZE.LIZ(arrayList);
        c2241831Con.LJ = arrayList;
        c2241831Con.LJFF = visualPoetUserComponent.promptUri;
        c2241741Coe.LIZLLL = c2241831Con.build();
        VisualPoetSystemComponent visualPoetSystemComponent = this.systemContentComponent;
        if (visualPoetSystemComponent != null) {
            C2241751Cof c2241751Cof = new C2241751Cof();
            c2241751Cof.LIZLLL = visualPoetSystemComponent.text;
            VisualPoetPictureStructComponent visualPoetPictureStructComponent = visualPoetSystemComponent.image;
            c2241751Cof.LJ = visualPoetPictureStructComponent != null ? visualPoetPictureStructComponent.LIZ() : null;
            c2241761CogBuild = c2241751Cof.build();
        } else {
            c2241761CogBuild = null;
        }
        c2241741Coe.LJ = c2241761CogBuild;
        c2241741Coe.LJI = Boolean.valueOf(this.systemContentInvisible);
        c2241741Coe.LJFF = Boolean.valueOf(this.userContentInvisible);
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        c2241741Coe.LJIIIIZZ = fallbackInfoComponent != null ? fallbackInfoComponent.LIZ() : null;
        c2241741Coe.LJIIIZ = this.previewHintComponent.LIZIZ();
        c2241741Coe.LJIIJ = this.baseRequestComponent.LIZ();
        c2241741Coe.LJIIJJI = this.baseResponseComponent.LIZ();
        Map<String, String> map = this.extra;
        C1516540pZE.LIZIZ(map);
        c2241741Coe.LJII = map;
        c2241961Cp0.LJIJI = c2241741Coe.build();
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
        this.userContentComponent.writeToParcel(parcel, i);
        VisualPoetSystemComponent visualPoetSystemComponent = this.systemContentComponent;
        if (visualPoetSystemComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            visualPoetSystemComponent.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.userContentInvisible ? 1 : 0);
        parcel.writeInt(this.systemContentInvisible ? 1 : 0);
        Map<String, String> map = this.extra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fallbackInfoComponent.writeToParcel(parcel, i);
        }
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
        return LIZ(this, false, false, previewHintComponent, baseRequestComponent, baseResponseComponent, 3647);
    }

    public static VisualPoetUserCardTemplate LIZ(VisualPoetUserCardTemplate visualPoetUserCardTemplate, boolean z, boolean z2, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        VisualPoetUserComponent visualPoetUserComponent;
        VisualPoetSystemComponent visualPoetSystemComponent;
        Map<String, String> map;
        FallbackInfoComponent fallbackInfoComponent;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        boolean z3 = z2;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        boolean z4 = z;
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 1) != 0) {
            visualPoetUserComponent = visualPoetUserCardTemplate.userContentComponent;
        } else {
            visualPoetUserComponent = null;
        }
        if ((i & 2) != 0) {
            visualPoetSystemComponent = visualPoetUserCardTemplate.systemContentComponent;
        } else {
            visualPoetSystemComponent = null;
        }
        if ((i & 4) != 0) {
            z4 = visualPoetUserCardTemplate.userContentInvisible;
        }
        if ((i & 8) != 0) {
            z3 = visualPoetUserCardTemplate.systemContentInvisible;
        }
        if ((i & 16) != 0) {
            map = visualPoetUserCardTemplate.extra;
        } else {
            map = null;
        }
        if ((i & 32) != 0) {
            fallbackInfoComponent = visualPoetUserCardTemplate.fallbackInfo;
        } else {
            fallbackInfoComponent = null;
        }
        if ((i & 64) != 0) {
            previewHintComponent2 = visualPoetUserCardTemplate.previewHintComponent;
        }
        if ((i & 128) != 0) {
            baseRequestComponent2 = visualPoetUserCardTemplate.baseRequestComponent;
        }
        if ((i & 256) != 0) {
            baseResponseComponent2 = visualPoetUserCardTemplate.baseResponseComponent;
        }
        if ((i & 512) != 0) {
            attachmentComponent = visualPoetUserCardTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((i & 1024) != 0) {
            baseHeaderComponent = visualPoetUserCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            baseFooterComponent = visualPoetUserCardTemplate.baseFooterComponent;
        }
        visualPoetUserCardTemplate.getClass();
        return new VisualPoetUserCardTemplate(visualPoetUserComponent, visualPoetSystemComponent, z4, z3, map, fallbackInfoComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent);
    }

    public VisualPoetUserCardTemplate(VisualPoetUserComponent visualPoetUserComponent, VisualPoetSystemComponent visualPoetSystemComponent, boolean z, boolean z2, Map<String, String> map, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.userContentComponent = visualPoetUserComponent;
        this.systemContentComponent = visualPoetSystemComponent;
        this.userContentInvisible = z;
        this.systemContentInvisible = z2;
        this.extra = map;
        this.fallbackInfo = fallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
