package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237781CiG;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTemplateItem;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiFeatureTemplateItem extends Message<CaiFeatureTemplateItem, C2237781CiG> {
    public static final ProtoAdapter<CaiFeatureTemplateItem> ADAPTER = new ProtoAdapter<CaiFeatureTemplateItem>() { // from class: X.1CiF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTemplateItem decode(ProtoReader protoReader) {
            C2237781CiG c2237781CiG = new C2237781CiG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237781CiG.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2237781CiG.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2237781CiG.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2237781CiG.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2237781CiG.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2237781CiG.LJIIIIZZ.add(CaiAppVersion.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c2237781CiG.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 253:
                                    c2237781CiG.LJIIJ = CaiManager.ADAPTER.decode(protoReader);
                                    break;
                                case 254:
                                    c2237781CiG.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 255:
                                    c2237781CiG.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237781CiG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237781CiG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTemplateItem caiFeatureTemplateItem) {
            CaiFeatureTemplateItem caiFeatureTemplateItem2 = caiFeatureTemplateItem;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiFeatureTemplateItem2.template_key) + protoAdapter.encodedSizeWithTag(2, caiFeatureTemplateItem2.template_name) + protoAdapter.encodedSizeWithTag(3, caiFeatureTemplateItem2.template_description) + protoAdapter.encodedSizeWithTag(4, caiFeatureTemplateItem2.template_content) + protoAdapter.encodedSizeWithTag(5, caiFeatureTemplateItem2.template_example) + CaiAppVersion.ADAPTER.asRepeated().encodedSizeWithTag(6, caiFeatureTemplateItem2.app_versions) + ProtoAdapter.INT32.encodedSizeWithTag(7, caiFeatureTemplateItem2.template_status) + CaiManager.ADAPTER.encodedSizeWithTag(253, caiFeatureTemplateItem2.manage);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(254, caiFeatureTemplateItem2.created_timestamp) + protoAdapter2.encodedSizeWithTag(255, caiFeatureTemplateItem2.updated_timestamp) + caiFeatureTemplateItem2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTemplateItem caiFeatureTemplateItem) {
            CaiFeatureTemplateItem caiFeatureTemplateItem2 = caiFeatureTemplateItem;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureTemplateItem2.template_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiFeatureTemplateItem2.template_name);
            protoAdapter.encodeWithTag(protoWriter, 3, caiFeatureTemplateItem2.template_description);
            protoAdapter.encodeWithTag(protoWriter, 4, caiFeatureTemplateItem2.template_content);
            protoAdapter.encodeWithTag(protoWriter, 5, caiFeatureTemplateItem2.template_example);
            CaiAppVersion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, caiFeatureTemplateItem2.app_versions);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, caiFeatureTemplateItem2.template_status);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 253, caiFeatureTemplateItem2.manage);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 254, caiFeatureTemplateItem2.created_timestamp);
            protoAdapter2.encodeWithTag(protoWriter, 255, caiFeatureTemplateItem2.updated_timestamp);
            protoWriter.writeBytes(caiFeatureTemplateItem2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public List<CaiAppVersion> app_versions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 254)
    public Long created_timestamp;

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

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 255)
    public Long updated_timestamp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.template_key.hashCode()) * 37) + this.template_name.hashCode()) * 37) + this.template_description.hashCode()) * 37) + this.template_content.hashCode()) * 37) + this.template_example.hashCode()) * 37) + this.app_versions.hashCode()) * 37) + this.template_status.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode2 = ((((iHashCode + (caiManager != null ? caiManager.hashCode() : 0)) * 37) + this.created_timestamp.hashCode()) * 37) + this.updated_timestamp.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237781CiG newBuilder() {
        C2237781CiG c2237781CiG = new C2237781CiG();
        c2237781CiG.LIZLLL = this.template_key;
        c2237781CiG.LJ = this.template_name;
        c2237781CiG.LJFF = this.template_description;
        c2237781CiG.LJI = this.template_content;
        c2237781CiG.LJII = this.template_example;
        c2237781CiG.LJIIIIZZ = C1516540pZE.LIZJ("app_versions", this.app_versions);
        c2237781CiG.LJIIIZ = this.template_status;
        c2237781CiG.LJIIJ = this.manage;
        c2237781CiG.LJIIJJI = this.created_timestamp;
        c2237781CiG.LJIIL = this.updated_timestamp;
        c2237781CiG.addUnknownFields(unknownFields());
        return c2237781CiG;
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
        sb.append(", created_timestamp=");
        sb.append(this.created_timestamp);
        sb.append(", updated_timestamp=");
        sb.append(this.updated_timestamp);
        sb.replace(0, 2, "CaiFeatureTemplateItem{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTemplateItem)) {
            return false;
        }
        CaiFeatureTemplateItem caiFeatureTemplateItem = (CaiFeatureTemplateItem) obj;
        if (unknownFields().equals(caiFeatureTemplateItem.unknownFields()) && this.template_key.equals(caiFeatureTemplateItem.template_key) && this.template_name.equals(caiFeatureTemplateItem.template_name) && this.template_description.equals(caiFeatureTemplateItem.template_description) && this.template_content.equals(caiFeatureTemplateItem.template_content) && this.template_example.equals(caiFeatureTemplateItem.template_example) && this.app_versions.equals(caiFeatureTemplateItem.app_versions) && this.template_status.equals(caiFeatureTemplateItem.template_status) && C1516540pZE.LJ(this.manage, caiFeatureTemplateItem.manage) && this.created_timestamp.equals(caiFeatureTemplateItem.created_timestamp) && this.updated_timestamp.equals(caiFeatureTemplateItem.updated_timestamp)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTemplateItem(String str, String str2, String str3, String str4, String str5, List<CaiAppVersion> list, Integer num, CaiManager caiManager, Long l, Long l2) {
        this(str, str2, str3, str4, str5, list, num, caiManager, l, l2, ByteString.EMPTY);
    }

    public CaiFeatureTemplateItem(String str, String str2, String str3, String str4, String str5, List<CaiAppVersion> list, Integer num, CaiManager caiManager, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.template_key = str;
        this.template_name = str2;
        this.template_description = str3;
        this.template_content = str4;
        this.template_example = str5;
        this.app_versions = C1516540pZE.LJFF("app_versions", list);
        this.template_status = num;
        this.manage = caiManager;
        this.created_timestamp = l;
        this.updated_timestamp = l2;
    }
}
