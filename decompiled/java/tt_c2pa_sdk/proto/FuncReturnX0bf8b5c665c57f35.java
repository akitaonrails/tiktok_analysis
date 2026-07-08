package tt_c2pa_sdk.proto;

import X.C2226311CBp;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncReturnX0bf8b5c665c57f35;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncReturnX0bf8b5c665c57f35 extends Message<FuncReturnX0bf8b5c665c57f35, C2226311CBp> {
    public static final ProtoAdapter<FuncReturnX0bf8b5c665c57f35> ADAPTER = new ProtoAdapter<FuncReturnX0bf8b5c665c57f35>() { // from class: X.1CBo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncReturnX0bf8b5c665c57f35 decode(ProtoReader protoReader) {
            C2226311CBp c2226311CBp = new C2226311CBp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226311CBp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226311CBp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226311CBp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncReturnX0bf8b5c665c57f35 funcReturnX0bf8b5c665c57f35) {
            FuncReturnX0bf8b5c665c57f35 funcReturnX0bf8b5c665c57f352 = funcReturnX0bf8b5c665c57f35;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, funcReturnX0bf8b5c665c57f352.ret) + funcReturnX0bf8b5c665c57f352.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncReturnX0bf8b5c665c57f35 funcReturnX0bf8b5c665c57f35) {
            FuncReturnX0bf8b5c665c57f35 funcReturnX0bf8b5c665c57f352 = funcReturnX0bf8b5c665c57f35;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, funcReturnX0bf8b5c665c57f352.ret);
            protoWriter.writeBytes(funcReturnX0bf8b5c665c57f352.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226311CBp newBuilder() {
        C2226311CBp c2226311CBp = new C2226311CBp();
        c2226311CBp.LIZLLL = this.ret;
        c2226311CBp.addUnknownFields(unknownFields());
        return c2226311CBp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX0bf8b5c665c57f35{");
        sb.append('}');
        return sb.toString();
    }

    public FuncReturnX0bf8b5c665c57f35(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncReturnX0bf8b5c665c57f35)) {
            return false;
        }
        FuncReturnX0bf8b5c665c57f35 funcReturnX0bf8b5c665c57f35 = (FuncReturnX0bf8b5c665c57f35) obj;
        if (unknownFields().equals(funcReturnX0bf8b5c665c57f35.unknownFields()) && this.ret.equals(funcReturnX0bf8b5c665c57f35.ret)) {
            return true;
        }
        return false;
    }

    public FuncReturnX0bf8b5c665c57f35(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = str;
    }
}
