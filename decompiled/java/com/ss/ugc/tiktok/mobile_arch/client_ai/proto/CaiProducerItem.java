package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237721CiA;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiProducerItem;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiProducerItem extends Message<CaiProducerItem, C2237721CiA> {
    public static final ProtoAdapter<CaiProducerItem> ADAPTER = new ProtoAdapter<CaiProducerItem>() { // from class: X.1Ci9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiProducerItem decode(ProtoReader protoReader) {
            C2237721CiA c2237721CiA = new C2237721CiA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237721CiA.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2237721CiA.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2237721CiA.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2237721CiA.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c2237721CiA.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2237721CiA.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 253:
                                    c2237721CiA.LJIIIZ = CaiManager.ADAPTER.decode(protoReader);
                                    break;
                                case 254:
                                    c2237721CiA.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 255:
                                    c2237721CiA.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237721CiA.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237721CiA.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiProducerItem caiProducerItem) {
            CaiProducerItem caiProducerItem2 = caiProducerItem;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiProducerItem2.producer_key) + protoAdapter.encodedSizeWithTag(2, caiProducerItem2.producer_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, caiProducerItem2.source_type) + protoAdapter2.encodedSizeWithTag(4, caiProducerItem2.producer_status) + protoAdapter.encodedSizeWithTag(5, caiProducerItem2.description) + ProtoAdapter.BOOL.encodedSizeWithTag(6, caiProducerItem2.is_sync) + CaiManager.ADAPTER.encodedSizeWithTag(253, caiProducerItem2.manage);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(254, caiProducerItem2.created_timestamp) + protoAdapter3.encodedSizeWithTag(255, caiProducerItem2.updated_timestamp) + caiProducerItem2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiProducerItem caiProducerItem) {
            CaiProducerItem caiProducerItem2 = caiProducerItem;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiProducerItem2.producer_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiProducerItem2.producer_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, caiProducerItem2.source_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, caiProducerItem2.producer_status);
            protoAdapter.encodeWithTag(protoWriter, 5, caiProducerItem2.description);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, caiProducerItem2.is_sync);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 253, caiProducerItem2.manage);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 254, caiProducerItem2.created_timestamp);
            protoAdapter3.encodeWithTag(protoWriter, 255, caiProducerItem2.updated_timestamp);
            protoWriter.writeBytes(caiProducerItem2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 254)
    public Long created_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 6)
    public Boolean is_sync;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 253)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String producer_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String producer_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public Integer producer_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer source_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 255)
    public Long updated_timestamp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.producer_key.hashCode()) * 37) + this.producer_name.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.producer_status.hashCode()) * 37) + this.description.hashCode()) * 37) + this.is_sync.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode2 = ((((iHashCode + (caiManager != null ? caiManager.hashCode() : 0)) * 37) + this.created_timestamp.hashCode()) * 37) + this.updated_timestamp.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237721CiA newBuilder() {
        C2237721CiA c2237721CiA = new C2237721CiA();
        c2237721CiA.LIZLLL = this.producer_key;
        c2237721CiA.LJ = this.producer_name;
        c2237721CiA.LJFF = this.source_type;
        c2237721CiA.LJI = this.producer_status;
        c2237721CiA.LJII = this.description;
        c2237721CiA.LJIIIIZZ = this.is_sync;
        c2237721CiA.LJIIIZ = this.manage;
        c2237721CiA.LJIIJ = this.created_timestamp;
        c2237721CiA.LJIIJJI = this.updated_timestamp;
        c2237721CiA.addUnknownFields(unknownFields());
        return c2237721CiA;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", producer_key=");
        sb.append(this.producer_key);
        sb.append(", producer_name=");
        sb.append(this.producer_name);
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", producer_status=");
        sb.append(this.producer_status);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", is_sync=");
        sb.append(this.is_sync);
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.append(", created_timestamp=");
        sb.append(this.created_timestamp);
        sb.append(", updated_timestamp=");
        sb.append(this.updated_timestamp);
        sb.replace(0, 2, "CaiProducerItem{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiProducerItem)) {
            return false;
        }
        CaiProducerItem caiProducerItem = (CaiProducerItem) obj;
        if (unknownFields().equals(caiProducerItem.unknownFields()) && this.producer_key.equals(caiProducerItem.producer_key) && this.producer_name.equals(caiProducerItem.producer_name) && this.source_type.equals(caiProducerItem.source_type) && this.producer_status.equals(caiProducerItem.producer_status) && this.description.equals(caiProducerItem.description) && this.is_sync.equals(caiProducerItem.is_sync) && C1516540pZE.LJ(this.manage, caiProducerItem.manage) && this.created_timestamp.equals(caiProducerItem.created_timestamp) && this.updated_timestamp.equals(caiProducerItem.updated_timestamp)) {
            return true;
        }
        return false;
    }

    public CaiProducerItem(String str, String str2, Integer num, Integer num2, String str3, Boolean bool, CaiManager caiManager, Long l, Long l2) {
        this(str, str2, num, num2, str3, bool, caiManager, l, l2, ByteString.EMPTY);
    }

    public CaiProducerItem(String str, String str2, Integer num, Integer num2, String str3, Boolean bool, CaiManager caiManager, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.producer_key = str;
        this.producer_name = str2;
        this.source_type = num;
        this.producer_status = num2;
        this.description = str3;
        this.is_sync = bool;
        this.manage = caiManager;
        this.created_timestamp = l;
        this.updated_timestamp = l2;
    }
}
