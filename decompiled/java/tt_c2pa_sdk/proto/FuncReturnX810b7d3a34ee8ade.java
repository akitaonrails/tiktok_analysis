package tt_c2pa_sdk.proto;

import X.C1CI3;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncReturnX810b7d3a34ee8ade;
import tt_c2pa_sdk.proto.TtC2paResult;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncReturnX810b7d3a34ee8ade extends Message<FuncReturnX810b7d3a34ee8ade, C1CI3> {
    public static final ProtoAdapter<FuncReturnX810b7d3a34ee8ade> ADAPTER = new ProtoAdapter<FuncReturnX810b7d3a34ee8ade>() { // from class: X.1CI2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncReturnX810b7d3a34ee8ade decode(ProtoReader protoReader) {
            C1CI3 c1ci3 = new C1CI3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ci3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ci3.LIZLLL = TtC2paResult.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ci3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncReturnX810b7d3a34ee8ade funcReturnX810b7d3a34ee8ade) {
            FuncReturnX810b7d3a34ee8ade funcReturnX810b7d3a34ee8ade2 = funcReturnX810b7d3a34ee8ade;
            return TtC2paResult.ADAPTER.encodedSizeWithTag(1, funcReturnX810b7d3a34ee8ade2.ret) + funcReturnX810b7d3a34ee8ade2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncReturnX810b7d3a34ee8ade funcReturnX810b7d3a34ee8ade) {
            FuncReturnX810b7d3a34ee8ade funcReturnX810b7d3a34ee8ade2 = funcReturnX810b7d3a34ee8ade;
            TtC2paResult.ADAPTER.encodeWithTag(protoWriter, 1, funcReturnX810b7d3a34ee8ade2.ret);
            protoWriter.writeBytes(funcReturnX810b7d3a34ee8ade2.unknownFields());
        }
    };

    @WireField(adapter = "tt_c2pa_sdk.proto.TtC2paResult#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public TtC2paResult ret;

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
    public C1CI3 newBuilder() {
        C1CI3 c1ci3 = new C1CI3();
        c1ci3.LIZLLL = this.ret;
        c1ci3.addUnknownFields(unknownFields());
        return c1ci3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX810b7d3a34ee8ade{");
        sb.append('}');
        return sb.toString();
    }

    public FuncReturnX810b7d3a34ee8ade(TtC2paResult ttC2paResult) {
        this(ttC2paResult, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncReturnX810b7d3a34ee8ade)) {
            return false;
        }
        FuncReturnX810b7d3a34ee8ade funcReturnX810b7d3a34ee8ade = (FuncReturnX810b7d3a34ee8ade) obj;
        if (unknownFields().equals(funcReturnX810b7d3a34ee8ade.unknownFields()) && this.ret.equals(funcReturnX810b7d3a34ee8ade.ret)) {
            return true;
        }
        return false;
    }

    public FuncReturnX810b7d3a34ee8ade(TtC2paResult ttC2paResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = ttC2paResult;
    }
}
