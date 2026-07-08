package tt_c2pa_sdk.proto;

import X.C2224021C2u;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;
import tt_c2pa_sdk.proto.__molten_ffi_placeholder;

/* JADX INFO: loaded from: classes35.dex */
public final class __molten_ffi_placeholder extends Message<__molten_ffi_placeholder, C2224021C2u> {
    public static final ProtoAdapter<__molten_ffi_placeholder> ADAPTER = new ProtoAdapter<__molten_ffi_placeholder>() { // from class: X.1C2t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final __molten_ffi_placeholder decode(ProtoReader protoReader) {
            C2224021C2u c2224021C2u = new C2224021C2u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224021C2u.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224021C2u.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(__molten_ffi_placeholder __molten_ffi_placeholderVar) {
            return __molten_ffi_placeholderVar.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, __molten_ffi_placeholder __molten_ffi_placeholderVar) {
            protoWriter.writeBytes(__molten_ffi_placeholderVar.unknownFields());
        }
    };

    public __molten_ffi_placeholder() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224021C2u newBuilder() {
        C2224021C2u c2224021C2u = new C2224021C2u();
        c2224021C2u.addUnknownFields(unknownFields());
        return c2224021C2u;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "__molten_ffi_placeholder{");
        sb.append('}');
        return sb.toString();
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public __molten_ffi_placeholder(ByteString byteString) {
        super(ADAPTER, byteString);
    }

    public boolean equals(Object obj) {
        return obj instanceof __molten_ffi_placeholder;
    }
}
