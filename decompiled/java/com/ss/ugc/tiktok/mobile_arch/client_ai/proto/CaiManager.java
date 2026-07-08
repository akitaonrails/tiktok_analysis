package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237541Chs;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiManager extends Message<CaiManager, C2237541Chs> {
    public static final ProtoAdapter<CaiManager> ADAPTER = new ProtoAdapter<CaiManager>() { // from class: X.1Chr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiManager decode(ProtoReader protoReader) {
            C2237541Chs c2237541Chs = new C2237541Chs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237541Chs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2237541Chs.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2237541Chs.LJFF.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c2237541Chs.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2237541Chs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237541Chs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiManager caiManager) {
            CaiManager caiManager2 = caiManager;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiManager2.owner) + protoAdapter.encodedSizeWithTag(2, caiManager2.desc) + protoAdapter.asRepeated().encodedSizeWithTag(3, caiManager2.backup) + protoAdapter.encodedSizeWithTag(4, caiManager2.creator) + caiManager2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiManager caiManager) {
            CaiManager caiManager2 = caiManager;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiManager2.owner);
            protoAdapter.encodeWithTag(protoWriter, 2, caiManager2.desc);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, caiManager2.backup);
            protoAdapter.encodeWithTag(protoWriter, 4, caiManager2.creator);
            protoWriter.writeBytes(caiManager2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
    public List<String> backup;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String creator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String desc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String owner;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.owner.hashCode()) * 37) + this.desc.hashCode()) * 37) + this.backup.hashCode()) * 37;
        String str = this.creator;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237541Chs newBuilder() {
        C2237541Chs c2237541Chs = new C2237541Chs();
        c2237541Chs.LIZLLL = this.owner;
        c2237541Chs.LJ = this.desc;
        c2237541Chs.LJFF = C1516540pZE.LIZJ("backup", this.backup);
        c2237541Chs.LJI = this.creator;
        c2237541Chs.addUnknownFields(unknownFields());
        return c2237541Chs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", desc=");
        sb.append(this.desc);
        if (!this.backup.isEmpty()) {
            sb.append(", backup=");
            sb.append(this.backup);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        sb.replace(0, 2, "CaiManager{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiManager)) {
            return false;
        }
        CaiManager caiManager = (CaiManager) obj;
        if (unknownFields().equals(caiManager.unknownFields()) && this.owner.equals(caiManager.owner) && this.desc.equals(caiManager.desc) && this.backup.equals(caiManager.backup) && C1516540pZE.LJ(this.creator, caiManager.creator)) {
            return true;
        }
        return false;
    }

    public CaiManager(String str, String str2, List<String> list, String str3) {
        this(str, str2, list, str3, ByteString.EMPTY);
    }

    public CaiManager(String str, String str2, List<String> list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.owner = str;
        this.desc = str2;
        this.backup = C1516540pZE.LJFF("backup", list);
        this.creator = str3;
    }
}
