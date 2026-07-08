package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C1C3N;
import X.C1C3Q;
import X.C2188811AlT;
import X.C2240761Cn4;
import X.C2240851CnD;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C869590Y9l;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.StreamingCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataEntryComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamStatusComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class StreamingCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<StreamingCardTemplate> CREATOR = new Parcelable.Creator<StreamingCardTemplate>() { // from class: X.18Yo
        @Override // android.os.Parcelable.Creator
        public final StreamingCardTemplate createFromParcel(Parcel parcel) {
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(StreamBlockComponent.CREATOR.createFromParcel(parcel));
            }
            StreamStatusComponent streamStatusComponentCreateFromParcel = StreamStatusComponent.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            FallbackInfoComponent fallbackInfoComponentCreateFromParcel = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
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
            return new StreamingCardTemplate(arrayList, streamStatusComponentCreateFromParcel, string, fallbackInfoComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamingCardTemplate[] newArray(int i) {
            return new StreamingCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final List<StreamBlockComponent> blocks;
    public final FallbackInfoComponent fallbackComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final String sendServerMessageId;
    public final StreamStatusComponent streamStatus;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingCardTemplate)) {
            return false;
        }
        StreamingCardTemplate streamingCardTemplate = (StreamingCardTemplate) obj;
        return Intrinsics.LJFF(this.blocks, streamingCardTemplate.blocks) && this.streamStatus == streamingCardTemplate.streamStatus && Intrinsics.LJFF(this.sendServerMessageId, streamingCardTemplate.sendServerMessageId) && Intrinsics.LJFF(this.fallbackComponent, streamingCardTemplate.fallbackComponent) && Intrinsics.LJFF(this.previewHintComponent, streamingCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, streamingCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, streamingCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, streamingCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, streamingCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, streamingCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.blocks.hashCode() * 31) + this.streamStatus.hashCode()) * 31) + this.sendServerMessageId.hashCode()) * 31) + this.fallbackComponent.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
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
        sbLIZ.append("StreamingCardTemplate(blocks=");
        sbLIZ.append(this.blocks);
        sbLIZ.append(", streamStatus=");
        sbLIZ.append(this.streamStatus);
        sbLIZ.append(", sendServerMessageId=");
        sbLIZ.append(this.sendServerMessageId);
        sbLIZ.append(", fallbackComponent=");
        sbLIZ.append(this.fallbackComponent);
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

    public StreamingCardTemplate() {
        C13BV c13bv = C13BV.INSTANCE;
        StreamStatusComponent streamStatusComponent = StreamStatusComponent.UNKNOWN;
        FallbackInfoComponent fallbackInfoComponent = new FallbackInfoComponent(7);
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseRequestComponent.Companion.getClass();
        this(c13bv, streamStatusComponent, "", fallbackInfoComponent, previewHintComponentLIZ, C18Y8.LIZ(), new BaseResponseComponent(0L, 15), null, null, null);
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
        C2240851CnD c2240851CnD = new C2240851CnD();
        List<StreamBlockComponent> list = this.blocks;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (StreamBlockComponent streamBlockComponent : list) {
            streamBlockComponent.getClass();
            C2240761Cn4 c2240761Cn4 = new C2240761Cn4();
            c2240761Cn4.LIZLLL = streamBlockComponent.blockId;
            c2240761Cn4.LJ = streamBlockComponent.replyType.toProto();
            c2240761Cn4.LJFF = streamBlockComponent.type.toProto();
            c2240761Cn4.LJI = streamBlockComponent.content.toProto();
            c2240761Cn4.LJII = streamBlockComponent.action.toProto();
            MetadataComponent metadataComponent = streamBlockComponent.metadata;
            metadataComponent.getClass();
            C1C3N c1c3n = new C1C3N();
            List<MetadataEntryComponent> list2 = metadataComponent.entries;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (MetadataEntryComponent metadataEntryComponent : list2) {
                metadataEntryComponent.getClass();
                C1C3Q c1c3q = new C1C3Q();
                c1c3q.LIZLLL = metadataEntryComponent.key;
                c1c3q.LJ = metadataEntryComponent.value;
                arrayList2.add(c1c3q.build());
            }
            C1516540pZE.LIZ(arrayList2);
            c1c3n.LIZLLL = arrayList2;
            c2240761Cn4.LJIIIIZZ = c1c3n.build();
            arrayList.add(c2240761Cn4.build());
        }
        C1516540pZE.LIZ(arrayList);
        c2240851CnD.LIZLLL = arrayList;
        c2240851CnD.LJ = this.streamStatus.toProto();
        c2240851CnD.LJFF = this.sendServerMessageId;
        c2240851CnD.LJI = this.fallbackComponent.LIZ();
        c2240851CnD.LJII = this.previewHintComponent.LIZIZ();
        c2240851CnD.LJIIIIZZ = this.baseRequestComponent.LIZ();
        c2240851CnD.LJIIIZ = this.baseResponseComponent.LIZ();
        c2241961Cp0.LJJIIJ = c2240851CnD.build();
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
        List<StreamBlockComponent> list = this.blocks;
        parcel.writeInt(list.size());
        Iterator<StreamBlockComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.streamStatus.writeToParcel(parcel, i);
        parcel.writeString(this.sendServerMessageId);
        this.fallbackComponent.writeToParcel(parcel, i);
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
        return new StreamingCardTemplate(this.blocks, this.streamStatus, this.sendServerMessageId, this.fallbackComponent, previewHintComponent, baseRequestComponent, baseResponseComponent, this.attachment, this.baseHeaderComponent, this.baseFooterComponent);
    }

    public StreamingCardTemplate(List<StreamBlockComponent> list, StreamStatusComponent streamStatusComponent, String str, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.blocks = list;
        this.streamStatus = streamStatusComponent;
        this.sendServerMessageId = str;
        this.fallbackComponent = fallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
        this.messageType = 2002;
    }
}
