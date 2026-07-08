package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C1954807lC;
import X.C21290218Tk;
import X.C2240721Cn0;
import X.C2241241Cnq;
import X.C2241261Cns;
import X.C2241321Cny;
import X.C2241341Co0;
import X.C2241361Co2;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC2241351Co1;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotPictureComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotTextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetProcessComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class VisualPoetBotCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<VisualPoetBotCardTemplate> CREATOR = new Parcelable.Creator<VisualPoetBotCardTemplate>() { // from class: X.18Yd
        @Override // android.os.Parcelable.Creator
        public final VisualPoetBotCardTemplate createFromParcel(Parcel parcel) {
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            Long lValueOf;
            LinkedHashMap linkedHashMap;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            VisualPoetBotTextComponent visualPoetBotTextComponentCreateFromParcel = VisualPoetBotTextComponent.CREATOR.createFromParcel(parcel);
            VisualPoetBotPictureComponent visualPoetBotPictureComponentCreateFromParcel = VisualPoetBotPictureComponent.CREATOR.createFromParcel(parcel);
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                fallbackInfoComponentCreateFromParcel = null;
            } else {
                fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
            }
            FallbackInfoComponent fallbackInfoComponent = fallbackInfoComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
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
            return new VisualPoetBotCardTemplate(visualPoetBotTextComponentCreateFromParcel, visualPoetBotPictureComponentCreateFromParcel, fallbackInfoComponent, boolValueOf, lValueOf, string, linkedHashMap, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetBotCardTemplate[] newArray(int i) {
            return new VisualPoetBotCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final VisualPoetBotPictureComponent botPictureComponent;
    public final VisualPoetBotTextComponent botTextComponent;
    public final Map<String, String> extra;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType = 1820;
    public final PreviewHintComponent previewHintComponent;
    public final long replyMsgID;
    public final Boolean retried;
    public final String taskId;
    public final Long updateTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetBotCardTemplate)) {
            return false;
        }
        VisualPoetBotCardTemplate visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) obj;
        return Intrinsics.LJFF(this.botTextComponent, visualPoetBotCardTemplate.botTextComponent) && Intrinsics.LJFF(this.botPictureComponent, visualPoetBotCardTemplate.botPictureComponent) && Intrinsics.LJFF(this.fallbackInfo, visualPoetBotCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.retried, visualPoetBotCardTemplate.retried) && Intrinsics.LJFF(this.updateTime, visualPoetBotCardTemplate.updateTime) && Intrinsics.LJFF(this.taskId, visualPoetBotCardTemplate.taskId) && Intrinsics.LJFF(this.extra, visualPoetBotCardTemplate.extra) && Intrinsics.LJFF(this.previewHintComponent, visualPoetBotCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, visualPoetBotCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, visualPoetBotCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, visualPoetBotCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, visualPoetBotCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, visualPoetBotCardTemplate.baseFooterComponent) && this.replyMsgID == visualPoetBotCardTemplate.replyMsgID;
    }

    public final int hashCode() {
        int iHashCode = ((this.botTextComponent.hashCode() * 31) + this.botPictureComponent.hashCode()) * 31;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        int iHashCode2 = (iHashCode + (fallbackInfoComponent == null ? 0 : fallbackInfoComponent.hashCode())) * 31;
        Boolean bool = this.retried;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.updateTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.taskId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int iHashCode6 = (((((((iHashCode5 + (map == null ? 0 : map.hashCode())) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode7 = (iHashCode6 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode8 = (iHashCode7 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return ((iHashCode8 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.replyMsgID);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        return "VisualPoetBotCardTemplate(botTextComponent=" + this.botTextComponent + ", botPictureComponent=" + this.botPictureComponent + ", fallbackInfo=" + this.fallbackInfo + ", retried=" + this.retried + ", updateTime=" + this.updateTime + ", taskId=" + this.taskId + ", extra=" + this.extra + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ", replyMsgID=" + this.replyMsgID + ')';
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        EnumC2241351Co1 enumC2241351Co1;
        C2241321Cny c2241321CnyBuild;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2241261Cns c2241261Cns = new C2241261Cns();
        VisualPoetBotTextComponent visualPoetBotTextComponent = this.botTextComponent;
        visualPoetBotTextComponent.getClass();
        C2240721Cn0 c2240721Cn0 = new C2240721Cn0();
        c2240721Cn0.LIZLLL = visualPoetBotTextComponent.text;
        c2241261Cns.LIZLLL = c2240721Cn0.build();
        VisualPoetBotPictureComponent visualPoetBotPictureComponent = this.botPictureComponent;
        visualPoetBotPictureComponent.getClass();
        C2241341Co0 c2241341Co0 = new C2241341Co0();
        c2241341Co0.LJ = Integer.valueOf(visualPoetBotPictureComponent.progress);
        int i = C21290218Tk.LIZ[visualPoetBotPictureComponent.taskStatusComponent.ordinal()];
        if (i == 1) {
            enumC2241351Co1 = EnumC2241351Co1.TaskStatusCreated;
        } else if (i == 2) {
            enumC2241351Co1 = EnumC2241351Co1.TaskStatusRunning;
        } else if (i == 3) {
            enumC2241351Co1 = EnumC2241351Co1.TaskStatusSuccess;
        } else if (i == 4) {
            enumC2241351Co1 = EnumC2241351Co1.TaskStatusFailed;
        } else {
            if (i != 5) {
                throw new C1954807lC();
            }
            enumC2241351Co1 = EnumC2241351Co1.TaskStatusCancelled;
        }
        c2241341Co0.LJFF = enumC2241351Co1;
        VisualPoetErrorInfoComponent visualPoetErrorInfoComponent = visualPoetBotPictureComponent.errorInfoComponent;
        visualPoetErrorInfoComponent.getClass();
        C2241241Cnq c2241241Cnq = new C2241241Cnq();
        c2241241Cnq.LIZLLL = visualPoetErrorInfoComponent.code;
        c2241241Cnq.LJ = visualPoetErrorInfoComponent.message;
        c2241241Cnq.LJFF = visualPoetErrorInfoComponent.detail;
        c2241341Co0.LJI = c2241241Cnq.build();
        c2241341Co0.LIZLLL = visualPoetBotPictureComponent.pictureStructComponent.LIZ();
        VisualPoetProcessComponent visualPoetProcessComponent = visualPoetBotPictureComponent.taskProgressComponent;
        if (visualPoetProcessComponent != null) {
            C2241361Co2 c2241361Co2 = new C2241361Co2();
            c2241361Co2.LIZLLL = visualPoetProcessComponent.processStart;
            c2241361Co2.LJ = visualPoetProcessComponent.processEnd;
            c2241361Co2.LJFF = visualPoetProcessComponent.estimatedTimeCost;
            c2241361Co2.LJI = visualPoetProcessComponent.stage;
            c2241321CnyBuild = c2241361Co2.build();
        } else {
            c2241321CnyBuild = null;
        }
        c2241341Co0.LJII = c2241321CnyBuild;
        c2241261Cns.LJ = c2241341Co0.build();
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        c2241261Cns.LJIIJ = fallbackInfoComponent != null ? fallbackInfoComponent.LIZ() : null;
        c2241261Cns.LJIIJJI = this.previewHintComponent.LIZIZ();
        c2241261Cns.LJIIL = this.baseRequestComponent.LIZ();
        c2241261Cns.LJIILIIL = this.baseResponseComponent.LIZ();
        c2241261Cns.LJIIIZ = this.retried;
        c2241261Cns.LJII = this.updateTime;
        Map<String, String> map = this.extra;
        C1516540pZE.LIZIZ(map);
        c2241261Cns.LJIIIIZZ = map;
        c2241261Cns.LJI = this.taskId;
        c2241261Cns.LJFF = Long.valueOf(this.replyMsgID);
        c2241961Cp0.LJIJJ = c2241261Cns.build();
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
        parcel.writeString(this.botTextComponent.text);
        this.botPictureComponent.writeToParcel(parcel, i);
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fallbackInfoComponent.writeToParcel(parcel, i);
        }
        Boolean bool = this.retried;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.updateTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.taskId);
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
        parcel.writeLong(this.replyMsgID);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return new VisualPoetBotCardTemplate(this.botTextComponent, this.botPictureComponent, this.fallbackInfo, this.retried, this.updateTime, this.taskId, this.extra, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent, this.replyMsgID);
    }

    public VisualPoetBotCardTemplate(VisualPoetBotTextComponent visualPoetBotTextComponent, VisualPoetBotPictureComponent visualPoetBotPictureComponent, FallbackInfoComponent fallbackInfoComponent, Boolean bool, Long l, String str, Map<String, String> map, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, long j) {
        this.botTextComponent = visualPoetBotTextComponent;
        this.botPictureComponent = visualPoetBotPictureComponent;
        this.fallbackInfo = fallbackInfoComponent;
        this.retried = bool;
        this.updateTime = l;
        this.taskId = str;
        this.extra = map;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.replyMsgID = j;
    }
}
