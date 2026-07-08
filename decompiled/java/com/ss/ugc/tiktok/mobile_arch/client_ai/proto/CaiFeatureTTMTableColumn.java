package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1517260paO;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableColumn;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureTTMTableColumn extends Message<CaiFeatureTTMTableColumn, C1517260paO> {
    public static final ProtoAdapter<CaiFeatureTTMTableColumn> ADAPTER = new ProtoAdapter<CaiFeatureTTMTableColumn>() { // from class: X.0paN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTTMTableColumn decode(ProtoReader protoReader) {
            C1517260paO c1517260paO = new C1517260paO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1517260paO.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1517260paO.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1517260paO.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517260paO.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTTMTableColumn caiFeatureTTMTableColumn) {
            CaiFeatureTTMTableColumn caiFeatureTTMTableColumn2 = caiFeatureTTMTableColumn;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiFeatureTTMTableColumn2.name) + ProtoAdapter.INT32.encodedSizeWithTag(2, caiFeatureTTMTableColumn2.column_type) + caiFeatureTTMTableColumn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTTMTableColumn caiFeatureTTMTableColumn) {
            CaiFeatureTTMTableColumn caiFeatureTTMTableColumn2 = caiFeatureTTMTableColumn;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiFeatureTTMTableColumn2.name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, caiFeatureTTMTableColumn2.column_type);
            protoWriter.writeBytes(caiFeatureTTMTableColumn2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer column_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.column_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1517260paO newBuilder() {
        C1517260paO c1517260paO = new C1517260paO();
        c1517260paO.LIZLLL = this.name;
        c1517260paO.LJ = this.column_type;
        c1517260paO.addUnknownFields(unknownFields());
        return c1517260paO;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", column_type=");
        sb.append(this.column_type);
        sb.replace(0, 2, "CaiFeatureTTMTableColumn{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTTMTableColumn)) {
            return false;
        }
        CaiFeatureTTMTableColumn caiFeatureTTMTableColumn = (CaiFeatureTTMTableColumn) obj;
        if (unknownFields().equals(caiFeatureTTMTableColumn.unknownFields()) && this.name.equals(caiFeatureTTMTableColumn.name) && this.column_type.equals(caiFeatureTTMTableColumn.column_type)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTTMTableColumn(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public CaiFeatureTTMTableColumn(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.column_type = num;
    }
}
