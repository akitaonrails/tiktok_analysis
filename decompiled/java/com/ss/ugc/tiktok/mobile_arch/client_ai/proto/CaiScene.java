package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237581Chw;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiScene extends Message<CaiScene, C2237581Chw> {
    public static final ProtoAdapter<CaiScene> ADAPTER = new ProtoAdapter<CaiScene>() { // from class: X.1Chv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiScene decode(ProtoReader protoReader) {
            C2237581Chw c2237581Chw = new C2237581Chw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 10) {
                        switch (iNextTag) {
                            case 1:
                                c2237581Chw.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c2237581Chw.LJ.add(CaiStrategy.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                c2237581Chw.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                c2237581Chw.LJI.add(CaiEventStream.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                c2237581Chw.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 6:
                                c2237581Chw.LJIIIIZZ.add(CaiEventStream.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                c2237581Chw.LJIIIZ.add(CaiEventStream.ADAPTER.decode(protoReader));
                                break;
                            default:
                                switch (iNextTag) {
                                    case 252:
                                        c2237581Chw.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 253:
                                        c2237581Chw.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 254:
                                        c2237581Chw.LJIILIIL.add(CaiTag.ADAPTER.decode(protoReader));
                                        break;
                                    case 255:
                                        c2237581Chw.LJIILJJIL = CaiManager.ADAPTER.decode(protoReader);
                                        break;
                                    default:
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2237581Chw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        break;
                                }
                                break;
                        }
                    } else {
                        c2237581Chw.LJIIJ.add(CaiAppVersion.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237581Chw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiScene caiScene) {
            CaiScene caiScene2 = caiScene;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiScene2.key) + CaiStrategy.ADAPTER.asRepeated().encodedSizeWithTag(2, caiScene2.strategies) + ProtoAdapter.BOOL.encodedSizeWithTag(3, caiScene2.user_related);
            ProtoAdapter<CaiEventStream> protoAdapter2 = CaiEventStream.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(4, caiScene2.streams) + protoAdapter.asRepeated().encodedSizeWithTag(5, caiScene2.package_ids) + protoAdapter2.asRepeated().encodedSizeWithTag(6, caiScene2.android_streams) + protoAdapter2.asRepeated().encodedSizeWithTag(7, caiScene2.ios_streams) + CaiAppVersion.ADAPTER.asRepeated().encodedSizeWithTag(10, caiScene2.app_versions);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(252, caiScene2.created_timestamp) + protoAdapter3.encodedSizeWithTag(253, caiScene2.updated_timestamp) + CaiTag.ADAPTER.asRepeated().encodedSizeWithTag(254, caiScene2.tags) + CaiManager.ADAPTER.encodedSizeWithTag(255, caiScene2.manage) + caiScene2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiScene caiScene) {
            CaiScene caiScene2 = caiScene;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiScene2.key);
            CaiStrategy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, caiScene2.strategies);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, caiScene2.user_related);
            ProtoAdapter<CaiEventStream> protoAdapter2 = CaiEventStream.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, caiScene2.streams);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, caiScene2.package_ids);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, caiScene2.android_streams);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, caiScene2.ios_streams);
            CaiAppVersion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, caiScene2.app_versions);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 252, caiScene2.created_timestamp);
            protoAdapter3.encodeWithTag(protoWriter, 253, caiScene2.updated_timestamp);
            CaiTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 254, caiScene2.tags);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 255, caiScene2.manage);
            protoWriter.writeBytes(caiScene2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public List<CaiEventStream> android_streams;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public List<CaiAppVersion> app_versions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 252)
    public Long created_timestamp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public List<CaiEventStream> ios_streams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String key;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 255)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    public List<String> package_ids;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategy#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<CaiStrategy> strategies;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public List<CaiEventStream> streams;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag#ADAPTER", label = WireField.Label.REPEATED, tag = 254)
    public List<CaiTag> tags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 253)
    public Long updated_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean user_related;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.strategies.hashCode()) * 37;
        Boolean bool = this.user_related;
        int iHashCode2 = (((((((((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 37) + this.streams.hashCode()) * 37) + this.package_ids.hashCode()) * 37) + this.android_streams.hashCode()) * 37) + this.ios_streams.hashCode()) * 37) + this.app_versions.hashCode()) * 37;
        Long l = this.created_timestamp;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.updated_timestamp;
        int iHashCode4 = (((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.tags.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode5 = iHashCode4 + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2237581Chw newBuilder() {
        C2237581Chw c2237581Chw = new C2237581Chw();
        c2237581Chw.LIZLLL = this.key;
        c2237581Chw.LJ = C1516540pZE.LIZJ("strategies", this.strategies);
        c2237581Chw.LJFF = this.user_related;
        c2237581Chw.LJI = C1516540pZE.LIZJ("streams", this.streams);
        c2237581Chw.LJII = C1516540pZE.LIZJ("package_ids", this.package_ids);
        c2237581Chw.LJIIIIZZ = C1516540pZE.LIZJ("android_streams", this.android_streams);
        c2237581Chw.LJIIIZ = C1516540pZE.LIZJ("ios_streams", this.ios_streams);
        c2237581Chw.LJIIJ = C1516540pZE.LIZJ("app_versions", this.app_versions);
        c2237581Chw.LJIIJJI = this.created_timestamp;
        c2237581Chw.LJIIL = this.updated_timestamp;
        c2237581Chw.LJIILIIL = C1516540pZE.LIZJ("tags", this.tags);
        c2237581Chw.LJIILJJIL = this.manage;
        c2237581Chw.addUnknownFields(unknownFields());
        return c2237581Chw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (!this.strategies.isEmpty()) {
            sb.append(", strategies=");
            sb.append(this.strategies);
        }
        if (this.user_related != null) {
            sb.append(", user_related=");
            sb.append(this.user_related);
        }
        if (!this.streams.isEmpty()) {
            sb.append(", streams=");
            sb.append(this.streams);
        }
        if (!this.package_ids.isEmpty()) {
            sb.append(", package_ids=");
            sb.append(this.package_ids);
        }
        if (!this.android_streams.isEmpty()) {
            sb.append(", android_streams=");
            sb.append(this.android_streams);
        }
        if (!this.ios_streams.isEmpty()) {
            sb.append(", ios_streams=");
            sb.append(this.ios_streams);
        }
        if (!this.app_versions.isEmpty()) {
            sb.append(", app_versions=");
            sb.append(this.app_versions);
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
        sb.replace(0, 2, "CaiScene{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiScene)) {
            return false;
        }
        CaiScene caiScene = (CaiScene) obj;
        if (unknownFields().equals(caiScene.unknownFields()) && this.key.equals(caiScene.key) && this.strategies.equals(caiScene.strategies) && C1516540pZE.LJ(this.user_related, caiScene.user_related) && this.streams.equals(caiScene.streams) && this.package_ids.equals(caiScene.package_ids) && this.android_streams.equals(caiScene.android_streams) && this.ios_streams.equals(caiScene.ios_streams) && this.app_versions.equals(caiScene.app_versions) && C1516540pZE.LJ(this.created_timestamp, caiScene.created_timestamp) && C1516540pZE.LJ(this.updated_timestamp, caiScene.updated_timestamp) && this.tags.equals(caiScene.tags) && C1516540pZE.LJ(this.manage, caiScene.manage)) {
            return true;
        }
        return false;
    }

    public CaiScene(String str, List<CaiStrategy> list, Boolean bool, List<CaiEventStream> list2, List<String> list3, List<CaiEventStream> list4, List<CaiEventStream> list5, List<CaiAppVersion> list6, Long l, Long l2, List<CaiTag> list7, CaiManager caiManager) {
        this(str, list, bool, list2, list3, list4, list5, list6, l, l2, list7, caiManager, ByteString.EMPTY);
    }

    public CaiScene(String str, List<CaiStrategy> list, Boolean bool, List<CaiEventStream> list2, List<String> list3, List<CaiEventStream> list4, List<CaiEventStream> list5, List<CaiAppVersion> list6, Long l, Long l2, List<CaiTag> list7, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.strategies = C1516540pZE.LJFF("strategies", list);
        this.user_related = bool;
        this.streams = C1516540pZE.LJFF("streams", list2);
        this.package_ids = C1516540pZE.LJFF("package_ids", list3);
        this.android_streams = C1516540pZE.LJFF("android_streams", list4);
        this.ios_streams = C1516540pZE.LJFF("ios_streams", list5);
        this.app_versions = C1516540pZE.LJFF("app_versions", list6);
        this.created_timestamp = l;
        this.updated_timestamp = l2;
        this.tags = C1516540pZE.LJFF("tags", list7);
        this.manage = caiManager;
    }
}
