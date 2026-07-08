package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C2237661Ci4;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiTag extends Message<CaiTag, C2237661Ci4> {
    public static final ProtoAdapter<CaiTag> ADAPTER = new ProtoAdapter<CaiTag>() { // from class: X.1Ci3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiTag decode(ProtoReader protoReader) {
            C2237661Ci4 c2237661Ci4 = new C2237661Ci4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237661Ci4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2237661Ci4.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2237661Ci4.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2237661Ci4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2237661Ci4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237661Ci4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiTag caiTag) {
            CaiTag caiTag2 = caiTag;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiTag2.tag_key) + protoAdapter.encodedSizeWithTag(2, caiTag2.tag_name) + ProtoAdapter.INT32.encodedSizeWithTag(3, caiTag2.res_type) + protoAdapter.encodedSizeWithTag(4, caiTag2.description) + caiTag2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiTag caiTag) {
            CaiTag caiTag2 = caiTag;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiTag2.tag_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiTag2.tag_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, caiTag2.res_type);
            protoAdapter.encodeWithTag(protoWriter, 4, caiTag2.description);
            protoWriter.writeBytes(caiTag2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer res_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String tag_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String tag_name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.tag_key.hashCode()) * 37) + this.tag_name.hashCode()) * 37) + this.res_type.hashCode()) * 37) + this.description.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237661Ci4 newBuilder() {
        C2237661Ci4 c2237661Ci4 = new C2237661Ci4();
        c2237661Ci4.LIZLLL = this.tag_key;
        c2237661Ci4.LJ = this.tag_name;
        c2237661Ci4.LJFF = this.res_type;
        c2237661Ci4.LJI = this.description;
        c2237661Ci4.addUnknownFields(unknownFields());
        return c2237661Ci4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", tag_key=");
        sb.append(this.tag_key);
        sb.append(", tag_name=");
        sb.append(this.tag_name);
        sb.append(", res_type=");
        sb.append(this.res_type);
        sb.append(", description=");
        sb.append(this.description);
        sb.replace(0, 2, "CaiTag{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiTag)) {
            return false;
        }
        CaiTag caiTag = (CaiTag) obj;
        if (unknownFields().equals(caiTag.unknownFields()) && this.tag_key.equals(caiTag.tag_key) && this.tag_name.equals(caiTag.tag_name) && this.res_type.equals(caiTag.res_type) && this.description.equals(caiTag.description)) {
            return true;
        }
        return false;
    }

    public CaiTag(String str, String str2, Integer num, String str3) {
        this(str, str2, num, str3, ByteString.EMPTY);
    }

    public CaiTag(String str, String str2, Integer num, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tag_key = str;
        this.tag_name = str2;
        this.res_type = num;
        this.description = str3;
    }
}
