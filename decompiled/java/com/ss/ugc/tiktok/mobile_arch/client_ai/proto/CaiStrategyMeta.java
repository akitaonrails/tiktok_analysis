package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237601Chy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyMeta;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyMeta extends Message<CaiStrategyMeta, C2237601Chy> {
    public static final ProtoAdapter<CaiStrategyMeta> ADAPTER = new ProtoAdapter<CaiStrategyMeta>() { // from class: X.1Chx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyMeta decode(ProtoReader protoReader) {
            C2237601Chy c2237601Chy = new C2237601Chy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                switch (iNextTag) {
                                    case 252:
                                        c2237601Chy.LJI = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 253:
                                        c2237601Chy.LJII = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 254:
                                        c2237601Chy.LJIIIIZZ.add(CaiTag.ADAPTER.decode(protoReader));
                                        break;
                                    case 255:
                                        c2237601Chy.LJIIIZ = CaiManager.ADAPTER.decode(protoReader);
                                        break;
                                    default:
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2237601Chy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        break;
                                }
                            } else {
                                c2237601Chy.LJFF.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c2237601Chy.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c2237601Chy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237601Chy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyMeta caiStrategyMeta) {
            CaiStrategyMeta caiStrategyMeta2 = caiStrategyMeta;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiStrategyMeta2.key) + protoAdapter.asRepeated().encodedSizeWithTag(2, caiStrategyMeta2.package_ids) + protoAdapter.asRepeated().encodedSizeWithTag(3, caiStrategyMeta2.binded_features);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(252, caiStrategyMeta2.created_timestamp) + protoAdapter2.encodedSizeWithTag(253, caiStrategyMeta2.updated_timestamp) + CaiTag.ADAPTER.asRepeated().encodedSizeWithTag(254, caiStrategyMeta2.tags) + CaiManager.ADAPTER.encodedSizeWithTag(255, caiStrategyMeta2.manage) + caiStrategyMeta2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyMeta caiStrategyMeta) {
            CaiStrategyMeta caiStrategyMeta2 = caiStrategyMeta;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategyMeta2.key);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, caiStrategyMeta2.package_ids);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, caiStrategyMeta2.binded_features);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 252, caiStrategyMeta2.created_timestamp);
            protoAdapter2.encodeWithTag(protoWriter, 253, caiStrategyMeta2.updated_timestamp);
            CaiTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 254, caiStrategyMeta2.tags);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 255, caiStrategyMeta2.manage);
            protoWriter.writeBytes(caiStrategyMeta2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
    public List<String> binded_features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 252)
    public Long created_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String key;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 255)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public List<String> package_ids;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag#ADAPTER", label = WireField.Label.REPEATED, tag = 254)
    public List<CaiTag> tags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 253)
    public Long updated_timestamp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.package_ids.hashCode()) * 37) + this.binded_features.hashCode()) * 37;
        Long l = this.created_timestamp;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.updated_timestamp;
        int iHashCode3 = (((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.tags.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode4 = iHashCode3 + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2237601Chy newBuilder() {
        C2237601Chy c2237601Chy = new C2237601Chy();
        c2237601Chy.LIZLLL = this.key;
        c2237601Chy.LJ = C1516540pZE.LIZJ("package_ids", this.package_ids);
        c2237601Chy.LJFF = C1516540pZE.LIZJ("binded_features", this.binded_features);
        c2237601Chy.LJI = this.created_timestamp;
        c2237601Chy.LJII = this.updated_timestamp;
        c2237601Chy.LJIIIIZZ = C1516540pZE.LIZJ("tags", this.tags);
        c2237601Chy.LJIIIZ = this.manage;
        c2237601Chy.addUnknownFields(unknownFields());
        return c2237601Chy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (!this.package_ids.isEmpty()) {
            sb.append(", package_ids=");
            sb.append(this.package_ids);
        }
        if (!this.binded_features.isEmpty()) {
            sb.append(", binded_features=");
            sb.append(this.binded_features);
        }
        if (this.created_timestamp != null) {
            sb.append(", created_timestamp=");
            sb.append(this.created_timestamp);
        }
        if (this.updated_timestamp != null) {
            sb.append(", updated_timestamp=");
            sb.append(this.updated_timestamp);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.replace(0, 2, "CaiStrategyMeta{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyMeta)) {
            return false;
        }
        CaiStrategyMeta caiStrategyMeta = (CaiStrategyMeta) obj;
        if (unknownFields().equals(caiStrategyMeta.unknownFields()) && this.key.equals(caiStrategyMeta.key) && this.package_ids.equals(caiStrategyMeta.package_ids) && this.binded_features.equals(caiStrategyMeta.binded_features) && C1516540pZE.LJ(this.created_timestamp, caiStrategyMeta.created_timestamp) && C1516540pZE.LJ(this.updated_timestamp, caiStrategyMeta.updated_timestamp) && this.tags.equals(caiStrategyMeta.tags) && C1516540pZE.LJ(this.manage, caiStrategyMeta.manage)) {
            return true;
        }
        return false;
    }

    public CaiStrategyMeta(String str, List<String> list, List<String> list2, Long l, Long l2, List<CaiTag> list3, CaiManager caiManager) {
        this(str, list, list2, l, l2, list3, caiManager, ByteString.EMPTY);
    }

    public CaiStrategyMeta(String str, List<String> list, List<String> list2, Long l, Long l2, List<CaiTag> list3, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.package_ids = C1516540pZE.LJFF("package_ids", list);
        this.binded_features = C1516540pZE.LJFF("binded_features", list2);
        this.created_timestamp = l;
        this.updated_timestamp = l2;
        this.tags = C1516540pZE.LJFF("tags", list3);
        this.manage = caiManager;
    }
}
