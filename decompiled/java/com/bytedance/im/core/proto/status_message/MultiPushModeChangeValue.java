package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C1516540pZE;
import X.C875250YVf;
import com.bytedance.im.core.proto.status_message.MultiPushModeChangeValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MultiPushModeChangeValue extends Message<MultiPushModeChangeValue, C875250YVf> {
    public static final ProtoAdapter<MultiPushModeChangeValue> ADAPTER = new ProtoAdapter<MultiPushModeChangeValue>() { // from class: X.0YVe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MultiPushModeChangeValue decode(ProtoReader protoReader) {
            C875250YVf c875250YVf = new C875250YVf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c875250YVf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c875250YVf.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875250YVf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MultiPushModeChangeValue multiPushModeChangeValue) {
            MultiPushModeChangeValue multiPushModeChangeValue2 = multiPushModeChangeValue;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, multiPushModeChangeValue2.conversation_ids) + multiPushModeChangeValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MultiPushModeChangeValue redact(MultiPushModeChangeValue multiPushModeChangeValue) {
            C875250YVf c875250YVfNewBuilder = multiPushModeChangeValue.newBuilder();
            c875250YVfNewBuilder.clearUnknownFields();
            return c875250YVfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MultiPushModeChangeValue multiPushModeChangeValue) {
            MultiPushModeChangeValue multiPushModeChangeValue2 = multiPushModeChangeValue;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, multiPushModeChangeValue2.conversation_ids);
            protoWriter.writeBytes(multiPushModeChangeValue2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_ids")
    public final List<String> conversation_ids;

    @Override // com.squareup.wire.Message
    public C875250YVf newBuilder() {
        C875250YVf c875250YVf = new C875250YVf();
        c875250YVf.LIZLLL = C1516540pZE.LIZJ("conversation_ids", this.conversation_ids);
        c875250YVf.addUnknownFields(unknownFields());
        return c875250YVf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.conversation_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_ids=");
            sb.append(this.conversation_ids);
        }
        sb.replace(0, 2, "MultiPushModeChangeValue{");
        sb.append('}');
        return sb.toString();
    }

    public MultiPushModeChangeValue(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MultiPushModeChangeValue(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_ids = C1516540pZE.LJFF("conversation_ids", list);
    }
}
