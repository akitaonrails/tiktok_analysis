package tt_c2pa_sdk.proto;

import X.C1CI7;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncReturnXe4439ef9481e6022;
import tt_c2pa_sdk.proto.TtC2paCheckCertResult;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncReturnXe4439ef9481e6022 extends Message<FuncReturnXe4439ef9481e6022, C1CI7> {
    public static final ProtoAdapter<FuncReturnXe4439ef9481e6022> ADAPTER = new ProtoAdapter<FuncReturnXe4439ef9481e6022>() { // from class: X.1CI6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncReturnXe4439ef9481e6022 decode(ProtoReader protoReader) {
            C1CI7 c1ci7 = new C1CI7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ci7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ci7.LIZLLL = TtC2paCheckCertResult.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ci7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncReturnXe4439ef9481e6022 funcReturnXe4439ef9481e6022) {
            FuncReturnXe4439ef9481e6022 funcReturnXe4439ef9481e60222 = funcReturnXe4439ef9481e6022;
            return TtC2paCheckCertResult.ADAPTER.encodedSizeWithTag(1, funcReturnXe4439ef9481e60222.ret) + funcReturnXe4439ef9481e60222.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncReturnXe4439ef9481e6022 funcReturnXe4439ef9481e6022) {
            FuncReturnXe4439ef9481e6022 funcReturnXe4439ef9481e60222 = funcReturnXe4439ef9481e6022;
            TtC2paCheckCertResult.ADAPTER.encodeWithTag(protoWriter, 1, funcReturnXe4439ef9481e60222.ret);
            protoWriter.writeBytes(funcReturnXe4439ef9481e60222.unknownFields());
        }
    };

    @WireField(adapter = "tt_c2pa_sdk.proto.TtC2paCheckCertResult#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public TtC2paCheckCertResult ret;

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
    public C1CI7 newBuilder() {
        C1CI7 c1ci7 = new C1CI7();
        c1ci7.LIZLLL = this.ret;
        c1ci7.addUnknownFields(unknownFields());
        return c1ci7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnXe4439ef9481e6022{");
        sb.append('}');
        return sb.toString();
    }

    public FuncReturnXe4439ef9481e6022(TtC2paCheckCertResult ttC2paCheckCertResult) {
        this(ttC2paCheckCertResult, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncReturnXe4439ef9481e6022)) {
            return false;
        }
        FuncReturnXe4439ef9481e6022 funcReturnXe4439ef9481e6022 = (FuncReturnXe4439ef9481e6022) obj;
        if (unknownFields().equals(funcReturnXe4439ef9481e6022.unknownFields()) && this.ret.equals(funcReturnXe4439ef9481e6022.ret)) {
            return true;
        }
        return false;
    }

    public FuncReturnXe4439ef9481e6022(TtC2paCheckCertResult ttC2paCheckCertResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = ttC2paCheckCertResult;
    }
}
