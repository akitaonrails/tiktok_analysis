package tt_c2pa_sdk.proto;

import X.C2227971CHz;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncReturnX0b7c3c1d607dee34;
import tt_c2pa_sdk.proto.TtC2paNetworkResponse;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncReturnX0b7c3c1d607dee34 extends Message<FuncReturnX0b7c3c1d607dee34, C2227971CHz> {
    public static final ProtoAdapter<FuncReturnX0b7c3c1d607dee34> ADAPTER = new ProtoAdapter<FuncReturnX0b7c3c1d607dee34>() { // from class: X.1CHy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncReturnX0b7c3c1d607dee34 decode(ProtoReader protoReader) {
            C2227971CHz c2227971CHz = new C2227971CHz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227971CHz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227971CHz.LIZLLL = TtC2paNetworkResponse.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227971CHz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee34) {
            FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee342 = funcReturnX0b7c3c1d607dee34;
            return TtC2paNetworkResponse.ADAPTER.encodedSizeWithTag(1, funcReturnX0b7c3c1d607dee342.ret) + funcReturnX0b7c3c1d607dee342.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee34) {
            FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee342 = funcReturnX0b7c3c1d607dee34;
            TtC2paNetworkResponse.ADAPTER.encodeWithTag(protoWriter, 1, funcReturnX0b7c3c1d607dee342.ret);
            protoWriter.writeBytes(funcReturnX0b7c3c1d607dee342.unknownFields());
        }
    };

    @WireField(adapter = "tt_c2pa_sdk.proto.TtC2paNetworkResponse#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public TtC2paNetworkResponse ret;

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
    public C2227971CHz newBuilder() {
        C2227971CHz c2227971CHz = new C2227971CHz();
        c2227971CHz.LIZLLL = this.ret;
        c2227971CHz.addUnknownFields(unknownFields());
        return c2227971CHz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX0b7c3c1d607dee34{");
        sb.append('}');
        return sb.toString();
    }

    public FuncReturnX0b7c3c1d607dee34(TtC2paNetworkResponse ttC2paNetworkResponse) {
        this(ttC2paNetworkResponse, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncReturnX0b7c3c1d607dee34)) {
            return false;
        }
        FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee34 = (FuncReturnX0b7c3c1d607dee34) obj;
        if (unknownFields().equals(funcReturnX0b7c3c1d607dee34.unknownFields()) && this.ret.equals(funcReturnX0b7c3c1d607dee34.ret)) {
            return true;
        }
        return false;
    }

    public FuncReturnX0b7c3c1d607dee34(TtC2paNetworkResponse ttC2paNetworkResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = ttC2paNetworkResponse;
    }
}
