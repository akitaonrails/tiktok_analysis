package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1517220paK;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTable;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableColumn;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableIndex;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureTTMTable extends Message<CaiFeatureTTMTable, C1517220paK> {
    public static final ProtoAdapter<CaiFeatureTTMTable> ADAPTER = new ProtoAdapter<CaiFeatureTTMTable>() { // from class: X.0paJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTTMTable decode(ProtoReader protoReader) {
            C1517220paK c1517220paK = new C1517220paK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1517220paK.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1517220paK.LJ.add(CaiFeatureTTMTableIndex.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1517220paK.LIZLLL.add(CaiFeatureTTMTableColumn.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517220paK.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTTMTable caiFeatureTTMTable) {
            CaiFeatureTTMTable caiFeatureTTMTable2 = caiFeatureTTMTable;
            return CaiFeatureTTMTableColumn.ADAPTER.asRepeated().encodedSizeWithTag(1, caiFeatureTTMTable2.columns) + CaiFeatureTTMTableIndex.ADAPTER.asRepeated().encodedSizeWithTag(2, caiFeatureTTMTable2.indexs) + caiFeatureTTMTable2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTTMTable caiFeatureTTMTable) {
            CaiFeatureTTMTable caiFeatureTTMTable2 = caiFeatureTTMTable;
            CaiFeatureTTMTableColumn.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, caiFeatureTTMTable2.columns);
            CaiFeatureTTMTableIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, caiFeatureTTMTable2.indexs);
            protoWriter.writeBytes(caiFeatureTTMTable2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableColumn#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<CaiFeatureTTMTableColumn> columns;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableIndex#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<CaiFeatureTTMTableIndex> indexs;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.columns.hashCode()) * 37) + this.indexs.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1517220paK newBuilder() {
        C1517220paK c1517220paK = new C1517220paK();
        c1517220paK.LIZLLL = C1516540pZE.LIZJ("columns", this.columns);
        c1517220paK.LJ = C1516540pZE.LIZJ("indexs", this.indexs);
        c1517220paK.addUnknownFields(unknownFields());
        return c1517220paK;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.columns.isEmpty()) {
            sb.append(", columns=");
            sb.append(this.columns);
        }
        if (!this.indexs.isEmpty()) {
            sb.append(", indexs=");
            sb.append(this.indexs);
        }
        sb.replace(0, 2, "CaiFeatureTTMTable{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTTMTable)) {
            return false;
        }
        CaiFeatureTTMTable caiFeatureTTMTable = (CaiFeatureTTMTable) obj;
        if (unknownFields().equals(caiFeatureTTMTable.unknownFields()) && this.columns.equals(caiFeatureTTMTable.columns) && this.indexs.equals(caiFeatureTTMTable.indexs)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTTMTable(List<CaiFeatureTTMTableColumn> list, List<CaiFeatureTTMTableIndex> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public CaiFeatureTTMTable(List<CaiFeatureTTMTableColumn> list, List<CaiFeatureTTMTableIndex> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.columns = C1516540pZE.LJFF("columns", list);
        this.indexs = C1516540pZE.LJFF("indexs", list2);
    }
}
