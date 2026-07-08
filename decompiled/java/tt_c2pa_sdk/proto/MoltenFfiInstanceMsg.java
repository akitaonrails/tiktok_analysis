package tt_c2pa_sdk.proto;

import X.C1CIF;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.MoltenFfiInstanceMsg;

/* JADX INFO: loaded from: classes35.dex */
public final class MoltenFfiInstanceMsg extends Message<MoltenFfiInstanceMsg, C1CIF> {
    public static final ProtoAdapter<MoltenFfiInstanceMsg> ADAPTER = new ProtoAdapter<MoltenFfiInstanceMsg>() { // from class: X.1CIE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MoltenFfiInstanceMsg decode(ProtoReader protoReader) {
            C1CIF c1cif = new C1CIF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cif.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cif.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cif.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cif.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MoltenFfiInstanceMsg moltenFfiInstanceMsg) {
            MoltenFfiInstanceMsg moltenFfiInstanceMsg2 = moltenFfiInstanceMsg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, moltenFfiInstanceMsg2.type_id) + protoAdapter.encodedSizeWithTag(2, moltenFfiInstanceMsg2.instance_id) + moltenFfiInstanceMsg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MoltenFfiInstanceMsg moltenFfiInstanceMsg) {
            MoltenFfiInstanceMsg moltenFfiInstanceMsg2 = moltenFfiInstanceMsg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, moltenFfiInstanceMsg2.type_id);
            protoAdapter.encodeWithTag(protoWriter, 2, moltenFfiInstanceMsg2.instance_id);
            protoWriter.writeBytes(moltenFfiInstanceMsg2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public Long instance_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public Long type_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type_id.hashCode()) * 37) + this.instance_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CIF newBuilder() {
        C1CIF c1cif = new C1CIF();
        c1cif.LIZLLL = this.type_id;
        c1cif.LJ = this.instance_id;
        c1cif.addUnknownFields(unknownFields());
        return c1cif;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type_id=");
        sb.append(this.type_id);
        sb.append(", instance_id=");
        sb.append(this.instance_id);
        sb.replace(0, 2, "MoltenFfiInstanceMsg{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoltenFfiInstanceMsg)) {
            return false;
        }
        MoltenFfiInstanceMsg moltenFfiInstanceMsg = (MoltenFfiInstanceMsg) obj;
        if (unknownFields().equals(moltenFfiInstanceMsg.unknownFields()) && this.type_id.equals(moltenFfiInstanceMsg.type_id) && this.instance_id.equals(moltenFfiInstanceMsg.instance_id)) {
            return true;
        }
        return false;
    }

    public MoltenFfiInstanceMsg(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public MoltenFfiInstanceMsg(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type_id = l;
        this.instance_id = l2;
    }
}
