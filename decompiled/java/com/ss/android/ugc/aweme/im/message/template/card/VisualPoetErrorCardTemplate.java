package com.ss.android.ugc.aweme.im.message.template.card;

import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C2238711Cjl;
import X.C2238741Cjo;
import X.C2241221Cno;
import X.C2241241Cnq;
import X.C2241251Cnr;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetActionTemplateComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetQuotaComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetTnsComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class VisualPoetErrorCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<VisualPoetErrorCardTemplate> CREATOR = new Parcelable.Creator<VisualPoetErrorCardTemplate>() { // from class: X.18Yf
        @Override // android.os.Parcelable.Creator
        public final VisualPoetErrorCardTemplate createFromParcel(Parcel parcel) {
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            Long lValueOf;
            LinkedHashMap linkedHashMap;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            VisualPoetErrorInfoComponent visualPoetErrorInfoComponentCreateFromParcel = VisualPoetErrorInfoComponent.CREATOR.createFromParcel(parcel);
            VisualPoetTnsComponent visualPoetTnsComponentCreateFromParcel = VisualPoetTnsComponent.CREATOR.createFromParcel(parcel);
            VisualPoetQuotaComponent visualPoetQuotaComponentCreateFromParcel = VisualPoetQuotaComponent.CREATOR.createFromParcel(parcel);
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
            return new VisualPoetErrorCardTemplate(visualPoetErrorInfoComponentCreateFromParcel, visualPoetTnsComponentCreateFromParcel, visualPoetQuotaComponentCreateFromParcel, fallbackInfoComponent, boolValueOf, lValueOf, string, linkedHashMap, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetErrorCardTemplate[] newArray(int i) {
            return new VisualPoetErrorCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final VisualPoetErrorInfoComponent errorInfoComponent;
    public final Map<String, String> extra;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final VisualPoetQuotaComponent quotaComponent;
    public final long replyMsgId;
    public final Boolean retried;
    public final String taskId;
    public final VisualPoetTnsComponent tnsComponent;
    public final Long updateTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetErrorCardTemplate)) {
            return false;
        }
        VisualPoetErrorCardTemplate visualPoetErrorCardTemplate = (VisualPoetErrorCardTemplate) obj;
        return Intrinsics.LJFF(this.errorInfoComponent, visualPoetErrorCardTemplate.errorInfoComponent) && Intrinsics.LJFF(this.tnsComponent, visualPoetErrorCardTemplate.tnsComponent) && Intrinsics.LJFF(this.quotaComponent, visualPoetErrorCardTemplate.quotaComponent) && Intrinsics.LJFF(this.fallbackInfo, visualPoetErrorCardTemplate.fallbackInfo) && Intrinsics.LJFF(this.retried, visualPoetErrorCardTemplate.retried) && Intrinsics.LJFF(this.updateTime, visualPoetErrorCardTemplate.updateTime) && Intrinsics.LJFF(this.taskId, visualPoetErrorCardTemplate.taskId) && Intrinsics.LJFF(this.extra, visualPoetErrorCardTemplate.extra) && Intrinsics.LJFF(this.previewHintComponent, visualPoetErrorCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, visualPoetErrorCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, visualPoetErrorCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, visualPoetErrorCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, visualPoetErrorCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, visualPoetErrorCardTemplate.baseFooterComponent) && this.replyMsgId == visualPoetErrorCardTemplate.replyMsgId;
    }

    public final int hashCode() {
        int iHashCode = ((((this.errorInfoComponent.hashCode() * 31) + this.tnsComponent.hashCode()) * 31) + this.quotaComponent.hashCode()) * 31;
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
        return ((iHashCode8 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.replyMsgId);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        return "VisualPoetErrorCardTemplate(errorInfoComponent=" + this.errorInfoComponent + ", tnsComponent=" + this.tnsComponent + ", quotaComponent=" + this.quotaComponent + ", fallbackInfo=" + this.fallbackInfo + ", retried=" + this.retried + ", updateTime=" + this.updateTime + ", taskId=" + this.taskId + ", extra=" + this.extra + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ", replyMsgId=" + this.replyMsgId + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VisualPoetErrorCardTemplate() {
        VisualPoetErrorInfoComponent.Companion.getClass();
        VisualPoetErrorInfoComponent visualPoetErrorInfoComponent = VisualPoetErrorInfoComponent.EMPTY_VISUAL_POET_ERROR_INFO;
        VisualPoetTnsComponent.Companion.getClass();
        VisualPoetTnsComponent visualPoetTnsComponent = VisualPoetTnsComponent.EMPTY_VISUAL_POET_TNS_COMPONENT;
        VisualPoetQuotaComponent.Companion.getClass();
        VisualPoetQuotaComponent visualPoetQuotaComponent = VisualPoetQuotaComponent.EMPTY_VISUAL_POET_QUOTA;
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseRequestComponent.Companion.getClass();
        this(visualPoetErrorInfoComponent, visualPoetTnsComponent, visualPoetQuotaComponent, null, null, null, null, null, previewHintComponentLIZ, C18Y8.LIZ(), new BaseResponseComponent(0L, 15), null, null, null, 0L);
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
        C2241221Cno c2241221Cno = new C2241221Cno();
        VisualPoetQuotaComponent visualPoetQuotaComponent = this.quotaComponent;
        visualPoetQuotaComponent.getClass();
        C2241251Cnr c2241251Cnr = new C2241251Cnr();
        c2241251Cnr.LIZLLL = visualPoetQuotaComponent.title;
        c2241251Cnr.LJ = visualPoetQuotaComponent.subtitle;
        c2241251Cnr.LJFF = visualPoetQuotaComponent.button_title;
        c2241251Cnr.LJI = visualPoetQuotaComponent.schema;
        c2241251Cnr.LJII = Boolean.valueOf(visualPoetQuotaComponent.button_invisible);
        c2241221Cno.LJ = c2241251Cnr.build();
        VisualPoetTnsComponent visualPoetTnsComponent = this.tnsComponent;
        visualPoetTnsComponent.getClass();
        C2238711Cjl c2238711Cjl = new C2238711Cjl();
        c2238711Cjl.LIZLLL = visualPoetTnsComponent.text;
        List<VisualPoetActionTemplateComponent> list = visualPoetTnsComponent.visualPoetActionTemplateComponent;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (VisualPoetActionTemplateComponent visualPoetActionTemplateComponent : list) {
            visualPoetActionTemplateComponent.getClass();
            C2238741Cjo c2238741Cjo = new C2238741Cjo();
            c2238741Cjo.LIZLLL = visualPoetActionTemplateComponent.key;
            c2238741Cjo.LJ = visualPoetActionTemplateComponent.name;
            c2238741Cjo.LJFF = visualPoetActionTemplateComponent.schema;
            arrayList.add(c2238741Cjo.build());
        }
        C1516540pZE.LIZ(arrayList);
        c2238711Cjl.LJ = arrayList;
        c2241221Cno.LJFF = c2238711Cjl.build();
        VisualPoetErrorInfoComponent visualPoetErrorInfoComponent = this.errorInfoComponent;
        visualPoetErrorInfoComponent.getClass();
        C2241241Cnq c2241241Cnq = new C2241241Cnq();
        c2241241Cnq.LIZLLL = visualPoetErrorInfoComponent.code;
        c2241241Cnq.LJ = visualPoetErrorInfoComponent.message;
        c2241241Cnq.LJFF = visualPoetErrorInfoComponent.detail;
        c2241221Cno.LIZLLL = c2241241Cnq.build();
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        c2241221Cno.LJIIJJI = fallbackInfoComponent != null ? fallbackInfoComponent.LIZ() : null;
        c2241221Cno.LJIIL = this.previewHintComponent.LIZIZ();
        c2241221Cno.LJIILIIL = this.baseRequestComponent.LIZ();
        c2241221Cno.LJIILJJIL = this.baseResponseComponent.LIZ();
        c2241221Cno.LJIIJ = this.retried;
        c2241221Cno.LJIIIIZZ = this.updateTime;
        Map<String, String> map = this.extra;
        C1516540pZE.LIZIZ(map);
        c2241221Cno.LJIIIZ = map;
        c2241221Cno.LJII = this.taskId;
        c2241221Cno.LJI = Long.valueOf(this.replyMsgId);
        c2241961Cp0.LJIJJLI = c2241221Cno.build();
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
        this.errorInfoComponent.writeToParcel(parcel, i);
        this.tnsComponent.writeToParcel(parcel, i);
        this.quotaComponent.writeToParcel(parcel, i);
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
        parcel.writeLong(this.replyMsgId);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return new VisualPoetErrorCardTemplate(this.errorInfoComponent, this.tnsComponent, this.quotaComponent, this.fallbackInfo, this.retried, this.updateTime, this.taskId, this.extra, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent, this.replyMsgId);
    }

    public VisualPoetErrorCardTemplate(VisualPoetErrorInfoComponent visualPoetErrorInfoComponent, VisualPoetTnsComponent visualPoetTnsComponent, VisualPoetQuotaComponent visualPoetQuotaComponent, FallbackInfoComponent fallbackInfoComponent, Boolean bool, Long l, String str, Map<String, String> map, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, long j) {
        this.errorInfoComponent = visualPoetErrorInfoComponent;
        this.tnsComponent = visualPoetTnsComponent;
        this.quotaComponent = visualPoetQuotaComponent;
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
        this.replyMsgId = j;
        this.messageType = 1821;
    }
}
