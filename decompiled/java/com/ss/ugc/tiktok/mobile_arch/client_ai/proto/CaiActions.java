package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1C09;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActions;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiActions extends Message<CaiActions, C1C09> {
    public static final ProtoAdapter<CaiActions> ADAPTER = new ProtoAdapter<CaiActions>() { // from class: X.1C08
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiActions decode(ProtoReader protoReader) {
            C1C09 c1c09 = new C1C09();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c09.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c09.LIZLLL.add(CaiAction.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c09.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiActions caiActions) {
            CaiActions caiActions2 = caiActions;
            return CaiAction.ADAPTER.asRepeated().encodedSizeWithTag(1, caiActions2.actions) + caiActions2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiActions caiActions) {
            CaiActions caiActions2 = caiActions;
            CaiAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, caiActions2.actions);
            protoWriter.writeBytes(caiActions2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<CaiAction> actions;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.actions.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C09 newBuilder() {
        C1C09 c1c09 = new C1C09();
        c1c09.LIZLLL = C1516540pZE.LIZJ("actions", this.actions);
        c1c09.addUnknownFields(unknownFields());
        return c1c09;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        sb.replace(0, 2, "CaiActions{");
        sb.append('}');
        return sb.toString();
    }

    public CaiActions(List<CaiAction> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiActions)) {
            return false;
        }
        CaiActions caiActions = (CaiActions) obj;
        if (unknownFields().equals(caiActions.unknownFields()) && this.actions.equals(caiActions.actions)) {
            return true;
        }
        return false;
    }

    public CaiActions(List<CaiAction> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.actions = C1516540pZE.LJFF("actions", list);
    }
}
