package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237621Ci0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiAppVersion extends Message<CaiAppVersion, C2237621Ci0> {
    public static final ProtoAdapter<CaiAppVersion> ADAPTER = new ProtoAdapter<CaiAppVersion>() { // from class: X.1Chz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiAppVersion decode(ProtoReader protoReader) {
            C2237621Ci0 c2237621Ci0 = new C2237621Ci0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237621Ci0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2237621Ci0.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2237621Ci0.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2237621Ci0.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2237621Ci0.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237621Ci0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiAppVersion caiAppVersion) {
            CaiAppVersion caiAppVersion2 = caiAppVersion;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, caiAppVersion2.app_id) + protoAdapter.encodedSizeWithTag(2, caiAppVersion2.platform) + protoAdapter.encodedSizeWithTag(3, caiAppVersion2.min_app_version_code) + protoAdapter.encodedSizeWithTag(4, caiAppVersion2.max_app_version_code) + caiAppVersion2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiAppVersion caiAppVersion) {
            CaiAppVersion caiAppVersion2 = caiAppVersion;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, caiAppVersion2.app_id);
            protoAdapter.encodeWithTag(protoWriter, 2, caiAppVersion2.platform);
            protoAdapter.encodeWithTag(protoWriter, 3, caiAppVersion2.min_app_version_code);
            protoAdapter.encodeWithTag(protoWriter, 4, caiAppVersion2.max_app_version_code);
            protoWriter.writeBytes(caiAppVersion2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer max_app_version_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer min_app_version_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer platform;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.app_id.hashCode()) * 37) + this.platform.hashCode()) * 37) + this.min_app_version_code.hashCode()) * 37;
        Integer num = this.max_app_version_code;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237621Ci0 newBuilder() {
        C2237621Ci0 c2237621Ci0 = new C2237621Ci0();
        c2237621Ci0.LIZLLL = this.app_id;
        c2237621Ci0.LJ = this.platform;
        c2237621Ci0.LJFF = this.min_app_version_code;
        c2237621Ci0.LJI = this.max_app_version_code;
        c2237621Ci0.addUnknownFields(unknownFields());
        return c2237621Ci0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", min_app_version_code=");
        sb.append(this.min_app_version_code);
        if (this.max_app_version_code != null) {
            sb.append(", max_app_version_code=");
            sb.append(this.max_app_version_code);
        }
        sb.replace(0, 2, "CaiAppVersion{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiAppVersion)) {
            return false;
        }
        CaiAppVersion caiAppVersion = (CaiAppVersion) obj;
        if (unknownFields().equals(caiAppVersion.unknownFields()) && this.app_id.equals(caiAppVersion.app_id) && this.platform.equals(caiAppVersion.platform) && this.min_app_version_code.equals(caiAppVersion.min_app_version_code) && C1516540pZE.LJ(this.max_app_version_code, caiAppVersion.max_app_version_code)) {
            return true;
        }
        return false;
    }

    public CaiAppVersion(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public CaiAppVersion(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = num;
        this.platform = num2;
        this.min_app_version_code = num3;
        this.max_app_version_code = num4;
    }
}
