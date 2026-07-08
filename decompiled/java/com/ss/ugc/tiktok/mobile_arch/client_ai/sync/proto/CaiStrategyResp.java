package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1516540pZE;
import X.C2223761C1u;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackage;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyResp extends Message<CaiStrategyResp, C2223761C1u> {
    public static final ProtoAdapter<CaiStrategyResp> ADAPTER = new ProtoAdapter<CaiStrategyResp>() { // from class: X.1C1t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyResp decode(ProtoReader protoReader) {
            C2223761C1u c2223761C1u = new C2223761C1u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        if (iNextTag != 3) {
                            if (iNextTag != 4) {
                                if (iNextTag != 5) {
                                    if (iNextTag != 6) {
                                        if (iNextTag != 255) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2223761C1u.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c2223761C1u.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c2223761C1u.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c2223761C1u.LJI.add(ProtoAdapter.STRING.decode(protoReader));
                                }
                            } else {
                                c2223761C1u.LJFF.add(CaiStrategyPackage.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2223761C1u.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c2223761C1u.LIZLLL.add(CaiScene.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223761C1u.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyResp caiStrategyResp) {
            CaiStrategyResp caiStrategyResp2 = caiStrategyResp;
            int iEncodedSizeWithTag = CaiScene.ADAPTER.asRepeated().encodedSizeWithTag(2, caiStrategyResp2.scene_updates);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, caiStrategyResp2.scene_deletes) + CaiStrategyPackage.ADAPTER.asRepeated().encodedSizeWithTag(4, caiStrategyResp2.package_updates) + protoAdapter.asRepeated().encodedSizeWithTag(5, caiStrategyResp2.package_deletes) + ProtoAdapter.INT32.encodedSizeWithTag(6, caiStrategyResp2.update_type) + protoAdapter.encodedSizeWithTag(255, caiStrategyResp2.cookie) + caiStrategyResp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyResp caiStrategyResp) {
            CaiStrategyResp caiStrategyResp2 = caiStrategyResp;
            CaiScene.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, caiStrategyResp2.scene_updates);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, caiStrategyResp2.scene_deletes);
            CaiStrategyPackage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, caiStrategyResp2.package_updates);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, caiStrategyResp2.package_deletes);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, caiStrategyResp2.update_type);
            protoAdapter.encodeWithTag(protoWriter, 255, caiStrategyResp2.cookie);
            protoWriter.writeBytes(caiStrategyResp2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 255)
    public String cookie;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    public List<String> package_deletes;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackage#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public List<CaiStrategyPackage> package_updates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
    public List<String> scene_deletes;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiScene#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<CaiScene> scene_updates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 6)
    public Integer update_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.scene_updates.hashCode()) * 37) + this.scene_deletes.hashCode()) * 37) + this.package_updates.hashCode()) * 37) + this.package_deletes.hashCode()) * 37) + this.update_type.hashCode()) * 37;
        String str = this.cookie;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2223761C1u newBuilder() {
        C2223761C1u c2223761C1u = new C2223761C1u();
        c2223761C1u.LIZLLL = C1516540pZE.LIZJ("scene_updates", this.scene_updates);
        c2223761C1u.LJ = C1516540pZE.LIZJ("scene_deletes", this.scene_deletes);
        c2223761C1u.LJFF = C1516540pZE.LIZJ("package_updates", this.package_updates);
        c2223761C1u.LJI = C1516540pZE.LIZJ("package_deletes", this.package_deletes);
        c2223761C1u.LJII = this.update_type;
        c2223761C1u.LJIIIIZZ = this.cookie;
        c2223761C1u.addUnknownFields(unknownFields());
        return c2223761C1u;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.scene_updates.isEmpty()) {
            sb.append(", scene_updates=");
            sb.append(this.scene_updates);
        }
        if (!this.scene_deletes.isEmpty()) {
            sb.append(", scene_deletes=");
            sb.append(this.scene_deletes);
        }
        if (!this.package_updates.isEmpty()) {
            sb.append(", package_updates=");
            sb.append(this.package_updates);
        }
        if (!this.package_deletes.isEmpty()) {
            sb.append(", package_deletes=");
            sb.append(this.package_deletes);
        }
        sb.append(", update_type=");
        sb.append(this.update_type);
        if (this.cookie != null) {
            sb.append(", cookie=");
            sb.append(this.cookie);
        }
        sb.replace(0, 2, "CaiStrategyResp{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyResp)) {
            return false;
        }
        CaiStrategyResp caiStrategyResp = (CaiStrategyResp) obj;
        if (unknownFields().equals(caiStrategyResp.unknownFields()) && this.scene_updates.equals(caiStrategyResp.scene_updates) && this.scene_deletes.equals(caiStrategyResp.scene_deletes) && this.package_updates.equals(caiStrategyResp.package_updates) && this.package_deletes.equals(caiStrategyResp.package_deletes) && this.update_type.equals(caiStrategyResp.update_type) && C1516540pZE.LJ(this.cookie, caiStrategyResp.cookie)) {
            return true;
        }
        return false;
    }

    public CaiStrategyResp(List<CaiScene> list, List<String> list2, List<CaiStrategyPackage> list3, List<String> list4, Integer num, String str) {
        this(list, list2, list3, list4, num, str, ByteString.EMPTY);
    }

    public CaiStrategyResp(List<CaiScene> list, List<String> list2, List<CaiStrategyPackage> list3, List<String> list4, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene_updates = C1516540pZE.LJFF("scene_updates", list);
        this.scene_deletes = C1516540pZE.LJFF("scene_deletes", list2);
        this.package_updates = C1516540pZE.LJFF("package_updates", list3);
        this.package_deletes = C1516540pZE.LJFF("package_deletes", list4);
        this.update_type = num;
        this.cookie = str;
    }
}
