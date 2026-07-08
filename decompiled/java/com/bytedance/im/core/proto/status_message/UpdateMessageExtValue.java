package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C0YW8;
import X.C1516540pZE;
import com.bytedance.im.core.proto.status_message.UpdateMessageExtValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateMessageExtValue extends Message<UpdateMessageExtValue, C0YW8> {
    public static final ProtoAdapter<UpdateMessageExtValue> ADAPTER = new ProtoAdapter<UpdateMessageExtValue>() { // from class: X.0YW7
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessageExtValue decode(ProtoReader protoReader) {
            C0YW8 c0yw8 = new C0YW8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yw8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yw8.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yw8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateMessageExtValue updateMessageExtValue) {
            UpdateMessageExtValue updateMessageExtValue2 = updateMessageExtValue;
            return this.LIZ.encodedSizeWithTag(1, updateMessageExtValue2.extensions) + updateMessageExtValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessageExtValue redact(UpdateMessageExtValue updateMessageExtValue) {
            C0YW8 c0yw8NewBuilder = updateMessageExtValue.newBuilder();
            c0yw8NewBuilder.clearUnknownFields();
            return c0yw8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateMessageExtValue updateMessageExtValue) {
            UpdateMessageExtValue updateMessageExtValue2 = updateMessageExtValue;
            this.LIZ.encodeWithTag(protoWriter, 1, updateMessageExtValue2.extensions);
            protoWriter.writeBytes(updateMessageExtValue2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("extensions")
    public final Map<String, String> extensions;

    @Override // com.squareup.wire.Message
    public C0YW8 newBuilder() {
        C0YW8 c0yw8 = new C0YW8();
        c0yw8.LIZLLL = C1516540pZE.LIZLLL("extensions", this.extensions);
        c0yw8.addUnknownFields(unknownFields());
        return c0yw8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = this.extensions;
        if (map != null && !map.isEmpty()) {
            sb.append(", extensions=");
            sb.append(this.extensions);
        }
        sb.replace(0, 2, "UpdateMessageExtValue{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateMessageExtValue(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public UpdateMessageExtValue(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extensions = C1516540pZE.LJI("extensions", map);
    }
}
