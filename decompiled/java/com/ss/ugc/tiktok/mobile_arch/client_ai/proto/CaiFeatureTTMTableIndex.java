package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1517240paM;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableIndex;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureTTMTableIndex extends Message<CaiFeatureTTMTableIndex, C1517240paM> {
    public static final ProtoAdapter<CaiFeatureTTMTableIndex> ADAPTER = new ProtoAdapter<CaiFeatureTTMTableIndex>() { // from class: X.0paL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTTMTableIndex decode(ProtoReader protoReader) {
            C1517240paM c1517240paM = new C1517240paM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1517240paM.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1517240paM.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1517240paM.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c1517240paM.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517240paM.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTTMTableIndex caiFeatureTTMTableIndex) {
            CaiFeatureTTMTableIndex caiFeatureTTMTableIndex2 = caiFeatureTTMTableIndex;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiFeatureTTMTableIndex2.name) + protoAdapter.asRepeated().encodedSizeWithTag(2, caiFeatureTTMTableIndex2.column_names) + ProtoAdapter.BOOL.encodedSizeWithTag(3, caiFeatureTTMTableIndex2.unique) + caiFeatureTTMTableIndex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTTMTableIndex caiFeatureTTMTableIndex) {
            CaiFeatureTTMTableIndex caiFeatureTTMTableIndex2 = caiFeatureTTMTableIndex;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureTTMTableIndex2.name);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, caiFeatureTTMTableIndex2.column_names);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, caiFeatureTTMTableIndex2.unique);
            protoWriter.writeBytes(caiFeatureTTMTableIndex2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public List<String> column_names;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public Boolean unique;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.column_names.hashCode()) * 37) + this.unique.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1517240paM newBuilder() {
        C1517240paM c1517240paM = new C1517240paM();
        c1517240paM.LIZLLL = this.name;
        c1517240paM.LJ = C1516540pZE.LIZJ("column_names", this.column_names);
        c1517240paM.LJFF = this.unique;
        c1517240paM.addUnknownFields(unknownFields());
        return c1517240paM;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        if (!this.column_names.isEmpty()) {
            sb.append(", column_names=");
            sb.append(this.column_names);
        }
        sb.append(", unique=");
        sb.append(this.unique);
        sb.replace(0, 2, "CaiFeatureTTMTableIndex{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTTMTableIndex)) {
            return false;
        }
        CaiFeatureTTMTableIndex caiFeatureTTMTableIndex = (CaiFeatureTTMTableIndex) obj;
        if (unknownFields().equals(caiFeatureTTMTableIndex.unknownFields()) && this.name.equals(caiFeatureTTMTableIndex.name) && this.column_names.equals(caiFeatureTTMTableIndex.column_names) && this.unique.equals(caiFeatureTTMTableIndex.unique)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTTMTableIndex(String str, List<String> list, Boolean bool) {
        this(str, list, bool, ByteString.EMPTY);
    }

    public CaiFeatureTTMTableIndex(String str, List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.column_names = C1516540pZE.LJFF("column_names", list);
        this.unique = bool;
    }
}
