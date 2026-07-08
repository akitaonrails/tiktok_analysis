package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237761CiE;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTemplate;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiFeatureTemplate extends Message<CaiFeatureTemplate, C2237761CiE> {
    public static final ProtoAdapter<CaiFeatureTemplate> ADAPTER = new ProtoAdapter<CaiFeatureTemplate>() { // from class: X.1CiD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTemplate decode(ProtoReader protoReader) {
            C2237761CiE c2237761CiE = new C2237761CiE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 253) {
                        switch (iNextTag) {
                            case 1:
                                c2237761CiE.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c2237761CiE.LJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c2237761CiE.LJFF = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c2237761CiE.LJI = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c2237761CiE.LJII = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c2237761CiE.LJIIIIZZ.add(CaiAppVersion.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                c2237761CiE.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2237761CiE.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c2237761CiE.LJIIJ = CaiManager.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237761CiE.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTemplate caiFeatureTemplate) {
            CaiFeatureTemplate caiFeatureTemplate2 = caiFeatureTemplate;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiFeatureTemplate2.template_key) + protoAdapter.encodedSizeWithTag(2, caiFeatureTemplate2.template_name) + protoAdapter.encodedSizeWithTag(3, caiFeatureTemplate2.template_description) + protoAdapter.encodedSizeWithTag(4, caiFeatureTemplate2.template_content) + protoAdapter.encodedSizeWithTag(5, caiFeatureTemplate2.template_example) + CaiAppVersion.ADAPTER.asRepeated().encodedSizeWithTag(6, caiFeatureTemplate2.app_versions) + ProtoAdapter.INT32.encodedSizeWithTag(7, caiFeatureTemplate2.template_status) + CaiManager.ADAPTER.encodedSizeWithTag(253, caiFeatureTemplate2.manage) + caiFeatureTemplate2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTemplate caiFeatureTemplate) {
            CaiFeatureTemplate caiFeatureTemplate2 = caiFeatureTemplate;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureTemplate2.template_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiFeatureTemplate2.template_name);
            protoAdapter.encodeWithTag(protoWriter, 3, caiFeatureTemplate2.template_description);
            protoAdapter.encodeWithTag(protoWriter, 4, caiFeatureTemplate2.template_content);
            protoAdapter.encodeWithTag(protoWriter, 5, caiFeatureTemplate2.template_example);
            CaiAppVersion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, caiFeatureTemplate2.app_versions);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, caiFeatureTemplate2.template_status);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 253, caiFeatureTemplate2.manage);
            protoWriter.writeBytes(caiFeatureTemplate2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public List<CaiAppVersion> app_versions;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 253)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String template_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String template_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public String template_example;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String template_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String template_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 7)
    public Integer template_status;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.template_key.hashCode()) * 37) + this.template_name.hashCode()) * 37) + this.template_description.hashCode()) * 37) + this.template_content.hashCode()) * 37) + this.template_example.hashCode()) * 37) + this.app_versions.hashCode()) * 37) + this.template_status.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode2 = iHashCode + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237761CiE newBuilder() {
        C2237761CiE c2237761CiE = new C2237761CiE();
        c2237761CiE.LIZLLL = this.template_key;
        c2237761CiE.LJ = this.template_name;
        c2237761CiE.LJFF = this.template_description;
        c2237761CiE.LJI = this.template_content;
        c2237761CiE.LJII = this.template_example;
        c2237761CiE.LJIIIIZZ = C1516540pZE.LIZJ("app_versions", this.app_versions);
        c2237761CiE.LJIIIZ = this.template_status;
        c2237761CiE.LJIIJ = this.manage;
        c2237761CiE.addUnknownFields(unknownFields());
        return c2237761CiE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", template_key=");
        sb.append(this.template_key);
        sb.append(", template_name=");
        sb.append(this.template_name);
        sb.append(", template_description=");
        sb.append(this.template_description);
        sb.append(", template_content=");
        sb.append(this.template_content);
        sb.append(", template_example=");
        sb.append(this.template_example);
        if (!this.app_versions.isEmpty()) {
            sb.append(", app_versions=");
            sb.append(this.app_versions);
        }
        sb.append(", template_status=");
        sb.append(this.template_status);
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.replace(0, 2, "CaiFeatureTemplate{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTemplate)) {
            return false;
        }
        CaiFeatureTemplate caiFeatureTemplate = (CaiFeatureTemplate) obj;
        if (unknownFields().equals(caiFeatureTemplate.unknownFields()) && this.template_key.equals(caiFeatureTemplate.template_key) && this.template_name.equals(caiFeatureTemplate.template_name) && this.template_description.equals(caiFeatureTemplate.template_description) && this.template_content.equals(caiFeatureTemplate.template_content) && this.template_example.equals(caiFeatureTemplate.template_example) && this.app_versions.equals(caiFeatureTemplate.app_versions) && this.template_status.equals(caiFeatureTemplate.template_status) && C1516540pZE.LJ(this.manage, caiFeatureTemplate.manage)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTemplate(String str, String str2, String str3, String str4, String str5, List<CaiAppVersion> list, Integer num, CaiManager caiManager) {
        this(str, str2, str3, str4, str5, list, num, caiManager, ByteString.EMPTY);
    }

    public CaiFeatureTemplate(String str, String str2, String str3, String str4, String str5, List<CaiAppVersion> list, Integer num, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.template_key = str;
        this.template_name = str2;
        this.template_description = str3;
        this.template_content = str4;
        this.template_example = str5;
        this.app_versions = C1516540pZE.LJFF("app_versions", list);
        this.template_status = num;
        this.manage = caiManager;
    }
}
