package tt_c2pa_sdk.proto;

import X.C1CCT;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsX913809d0daa224e7;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncParamsX913809d0daa224e7 extends Message<FuncParamsX913809d0daa224e7, C1CCT> {
    public static final ProtoAdapter<FuncParamsX913809d0daa224e7> ADAPTER = new ProtoAdapter<FuncParamsX913809d0daa224e7>() { // from class: X.1CCS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncParamsX913809d0daa224e7 decode(ProtoReader protoReader) {
            C1CCT c1cct = new C1CCT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cct.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cct.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cct.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncParamsX913809d0daa224e7 funcParamsX913809d0daa224e7) {
            FuncParamsX913809d0daa224e7 funcParamsX913809d0daa224e72 = funcParamsX913809d0daa224e7;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, funcParamsX913809d0daa224e72.tmp_dir_path) + funcParamsX913809d0daa224e72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncParamsX913809d0daa224e7 funcParamsX913809d0daa224e7) {
            FuncParamsX913809d0daa224e7 funcParamsX913809d0daa224e72 = funcParamsX913809d0daa224e7;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, funcParamsX913809d0daa224e72.tmp_dir_path);
            protoWriter.writeBytes(funcParamsX913809d0daa224e72.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String tmp_dir_path;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.tmp_dir_path.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CCT newBuilder() {
        C1CCT c1cct = new C1CCT();
        c1cct.LIZLLL = this.tmp_dir_path;
        c1cct.addUnknownFields(unknownFields());
        return c1cct;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", tmp_dir_path=");
        sb.append(this.tmp_dir_path);
        sb.replace(0, 2, "FuncParamsX913809d0daa224e7{");
        sb.append('}');
        return sb.toString();
    }

    public FuncParamsX913809d0daa224e7(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncParamsX913809d0daa224e7)) {
            return false;
        }
        FuncParamsX913809d0daa224e7 funcParamsX913809d0daa224e7 = (FuncParamsX913809d0daa224e7) obj;
        if (unknownFields().equals(funcParamsX913809d0daa224e7.unknownFields()) && this.tmp_dir_path.equals(funcParamsX913809d0daa224e7.tmp_dir_path)) {
            return true;
        }
        return false;
    }

    public FuncParamsX913809d0daa224e7(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tmp_dir_path = str;
    }
}
