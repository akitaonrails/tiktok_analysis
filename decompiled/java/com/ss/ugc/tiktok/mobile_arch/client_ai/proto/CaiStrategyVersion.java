package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237741CiC;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageBind;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyVersion extends Message<CaiStrategyVersion, C2237741CiC> {
    public static final ProtoAdapter<CaiStrategyVersion> ADAPTER = new ProtoAdapter<CaiStrategyVersion>() { // from class: X.1CiB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyVersion decode(ProtoReader protoReader) {
            C2237741CiC c2237741CiC = new C2237741CiC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237741CiC.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2237741CiC.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2237741CiC.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2237741CiC.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c2237741CiC.LJII.add(CaiStrategyPackageBind.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c2237741CiC.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2237741CiC.LJIIIZ.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            switch (iNextTag) {
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c2237741CiC.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c2237741CiC.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c2237741CiC.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c2237741CiC.LJIILIIL.add(ProtoAdapter.STRING.decode(protoReader));
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    c2237741CiC.LJIILJJIL.add(ProtoAdapter.STRING.decode(protoReader));
                                    break;
                                case 14:
                                    c2237741CiC.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 15:
                                    c2237741CiC.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    switch (iNextTag) {
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                            c2237741CiC.LJIIZILJ.add(CaiEventStream.ADAPTER.decode(protoReader));
                                            break;
                                        case 21:
                                            c2237741CiC.LJIJ.add(CaiEventStream.ADAPTER.decode(protoReader));
                                            break;
                                        case 22:
                                            c2237741CiC.LJIJI = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        case 23:
                                            c2237741CiC.LJIJJ = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        default:
                                            switch (iNextTag) {
                                                case 252:
                                                    c2237741CiC.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                                                    break;
                                                case 253:
                                                    c2237741CiC.LJIL = ProtoAdapter.INT64.decode(protoReader);
                                                    break;
                                                case 254:
                                                    c2237741CiC.LJJ.add(CaiTag.ADAPTER.decode(protoReader));
                                                    break;
                                                case 255:
                                                    c2237741CiC.LJJI = CaiManager.ADAPTER.decode(protoReader);
                                                    break;
                                                default:
                                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                    c2237741CiC.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237741CiC.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyVersion caiStrategyVersion) {
            CaiStrategyVersion caiStrategyVersion2 = caiStrategyVersion;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiStrategyVersion2.key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, caiStrategyVersion2.version) + protoAdapter.encodedSizeWithTag(3, caiStrategyVersion2.scene) + protoAdapter2.encodedSizeWithTag(4, caiStrategyVersion2.type) + CaiStrategyPackageBind.ADAPTER.asRepeated().encodedSizeWithTag(5, caiStrategyVersion2.binds) + protoAdapter2.encodedSizeWithTag(6, caiStrategyVersion2.libra_flight_id) + protoAdapter.asRepeated().encodedSizeWithTag(7, caiStrategyVersion2.packages) + protoAdapter2.encodedSizeWithTag(9, caiStrategyVersion2.status) + protoAdapter2.encodedSizeWithTag(10, caiStrategyVersion2.gray_limit) + protoAdapter2.encodedSizeWithTag(11, caiStrategyVersion2.gray_condition) + protoAdapter.asRepeated().encodedSizeWithTag(12, caiStrategyVersion2.reviewers) + protoAdapter.asRepeated().encodedSizeWithTag(13, caiStrategyVersion2.platform_reviewers) + protoAdapter.encodedSizeWithTag(14, caiStrategyVersion2.approver) + protoAdapter.encodedSizeWithTag(15, caiStrategyVersion2.platform_approver);
            ProtoAdapter<CaiEventStream> protoAdapter3 = CaiEventStream.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(20, caiStrategyVersion2.android_streams) + protoAdapter3.asRepeated().encodedSizeWithTag(21, caiStrategyVersion2.ios_streams);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(22, caiStrategyVersion2.is_bind_to_existed_libra_flight) + protoAdapter4.encodedSizeWithTag(23, caiStrategyVersion2.same_stream);
            ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(252, caiStrategyVersion2.created_timestamp) + protoAdapter5.encodedSizeWithTag(253, caiStrategyVersion2.updated_timestamp) + CaiTag.ADAPTER.asRepeated().encodedSizeWithTag(254, caiStrategyVersion2.tags) + CaiManager.ADAPTER.encodedSizeWithTag(255, caiStrategyVersion2.manage) + caiStrategyVersion2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyVersion caiStrategyVersion) {
            CaiStrategyVersion caiStrategyVersion2 = caiStrategyVersion;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategyVersion2.key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, caiStrategyVersion2.version);
            protoAdapter.encodeWithTag(protoWriter, 3, caiStrategyVersion2.scene);
            protoAdapter2.encodeWithTag(protoWriter, 4, caiStrategyVersion2.type);
            CaiStrategyPackageBind.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, caiStrategyVersion2.binds);
            protoAdapter2.encodeWithTag(protoWriter, 6, caiStrategyVersion2.libra_flight_id);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, caiStrategyVersion2.packages);
            protoAdapter2.encodeWithTag(protoWriter, 9, caiStrategyVersion2.status);
            protoAdapter2.encodeWithTag(protoWriter, 10, caiStrategyVersion2.gray_limit);
            protoAdapter2.encodeWithTag(protoWriter, 11, caiStrategyVersion2.gray_condition);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 12, caiStrategyVersion2.reviewers);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, caiStrategyVersion2.platform_reviewers);
            protoAdapter.encodeWithTag(protoWriter, 14, caiStrategyVersion2.approver);
            protoAdapter.encodeWithTag(protoWriter, 15, caiStrategyVersion2.platform_approver);
            ProtoAdapter<CaiEventStream> protoAdapter3 = CaiEventStream.ADAPTER;
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 20, caiStrategyVersion2.android_streams);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 21, caiStrategyVersion2.ios_streams);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 22, caiStrategyVersion2.is_bind_to_existed_libra_flight);
            protoAdapter4.encodeWithTag(protoWriter, 23, caiStrategyVersion2.same_stream);
            ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
            protoAdapter5.encodeWithTag(protoWriter, 252, caiStrategyVersion2.created_timestamp);
            protoAdapter5.encodeWithTag(protoWriter, 253, caiStrategyVersion2.updated_timestamp);
            CaiTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 254, caiStrategyVersion2.tags);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 255, caiStrategyVersion2.manage);
            protoWriter.writeBytes(caiStrategyVersion2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public List<CaiEventStream> android_streams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String approver;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageBind#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public List<CaiStrategyPackageBind> binds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 252)
    public Long created_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_EMAIL)
    public Integer gray_condition;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public Integer gray_limit;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = 21)
    public List<CaiEventStream> ios_streams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 22)
    public Boolean is_bind_to_existed_libra_flight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer libra_flight_id;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 255)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 7)
    public List<String> packages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String platform_approver;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = BdTuring.TYPE_SMS_VOICE)
    public List<String> platform_reviewers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public List<String> reviewers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public Boolean same_stream;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_ECAF)
    public Integer status;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag#ADAPTER", label = WireField.Label.REPEATED, tag = 254)
    public List<CaiTag> tags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public Integer type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 253)
    public Long updated_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer version;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.version.hashCode()) * 37;
        String str = this.scene;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.type.hashCode()) * 37) + this.binds.hashCode()) * 37;
        Integer num = this.libra_flight_id;
        int iHashCode3 = (((iHashCode2 + (num != null ? num.hashCode() : 0)) * 37) + this.packages.hashCode()) * 37;
        Integer num2 = this.status;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.gray_limit;
        int iHashCode5 = (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.gray_condition;
        int iHashCode6 = (((((iHashCode5 + (num4 != null ? num4.hashCode() : 0)) * 37) + this.reviewers.hashCode()) * 37) + this.platform_reviewers.hashCode()) * 37;
        String str2 = this.approver;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.platform_approver;
        int iHashCode8 = (((((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.android_streams.hashCode()) * 37) + this.ios_streams.hashCode()) * 37;
        Boolean bool = this.is_bind_to_existed_libra_flight;
        int iHashCode9 = (iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.same_stream;
        int iHashCode10 = (iHashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Long l = this.created_timestamp;
        int iHashCode11 = (iHashCode10 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.updated_timestamp;
        int iHashCode12 = (((iHashCode11 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.tags.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode13 = iHashCode12 + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public C2237741CiC newBuilder() {
        C2237741CiC c2237741CiC = new C2237741CiC();
        c2237741CiC.LIZLLL = this.key;
        c2237741CiC.LJ = this.version;
        c2237741CiC.LJFF = this.scene;
        c2237741CiC.LJI = this.type;
        c2237741CiC.LJII = C1516540pZE.LIZJ("binds", this.binds);
        c2237741CiC.LJIIIIZZ = this.libra_flight_id;
        c2237741CiC.LJIIIZ = C1516540pZE.LIZJ("packages", this.packages);
        c2237741CiC.LJIIJ = this.status;
        c2237741CiC.LJIIJJI = this.gray_limit;
        c2237741CiC.LJIIL = this.gray_condition;
        c2237741CiC.LJIILIIL = C1516540pZE.LIZJ("reviewers", this.reviewers);
        c2237741CiC.LJIILJJIL = C1516540pZE.LIZJ("platform_reviewers", this.platform_reviewers);
        c2237741CiC.LJIILL = this.approver;
        c2237741CiC.LJIILLIIL = this.platform_approver;
        c2237741CiC.LJIIZILJ = C1516540pZE.LIZJ("android_streams", this.android_streams);
        c2237741CiC.LJIJ = C1516540pZE.LIZJ("ios_streams", this.ios_streams);
        c2237741CiC.LJIJI = this.is_bind_to_existed_libra_flight;
        c2237741CiC.LJIJJ = this.same_stream;
        c2237741CiC.LJIJJLI = this.created_timestamp;
        c2237741CiC.LJIL = this.updated_timestamp;
        c2237741CiC.LJJ = C1516540pZE.LIZJ("tags", this.tags);
        c2237741CiC.LJJI = this.manage;
        c2237741CiC.addUnknownFields(unknownFields());
        return c2237741CiC;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", version=");
        sb.append(this.version);
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        sb.append(", type=");
        sb.append(this.type);
        if (!this.binds.isEmpty()) {
            sb.append(", binds=");
            sb.append(this.binds);
        }
        if (this.libra_flight_id != null) {
            sb.append(", libra_flight_id=");
            sb.append(this.libra_flight_id);
        }
        if (!this.packages.isEmpty()) {
            sb.append(", packages=");
            sb.append(this.packages);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.gray_limit != null) {
            sb.append(", gray_limit=");
            sb.append(this.gray_limit);
        }
        if (this.gray_condition != null) {
            sb.append(", gray_condition=");
            sb.append(this.gray_condition);
        }
        if (!this.reviewers.isEmpty()) {
            sb.append(", reviewers=");
            sb.append(this.reviewers);
        }
        if (!this.platform_reviewers.isEmpty()) {
            sb.append(", platform_reviewers=");
            sb.append(this.platform_reviewers);
        }
        if (this.approver != null) {
            sb.append(", approver=");
            sb.append(this.approver);
        }
        if (this.platform_approver != null) {
            sb.append(", platform_approver=");
            sb.append(this.platform_approver);
        }
        if (!this.android_streams.isEmpty()) {
            sb.append(", android_streams=");
            sb.append(this.android_streams);
        }
        if (!this.ios_streams.isEmpty()) {
            sb.append(", ios_streams=");
            sb.append(this.ios_streams);
        }
        if (this.is_bind_to_existed_libra_flight != null) {
            sb.append(", is_bind_to_existed_libra_flight=");
            sb.append(this.is_bind_to_existed_libra_flight);
        }
        if (this.same_stream != null) {
            sb.append(", same_stream=");
            sb.append(this.same_stream);
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
        sb.replace(0, 2, "CaiStrategyVersion{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyVersion)) {
            return false;
        }
        CaiStrategyVersion caiStrategyVersion = (CaiStrategyVersion) obj;
        if (unknownFields().equals(caiStrategyVersion.unknownFields()) && this.key.equals(caiStrategyVersion.key) && this.version.equals(caiStrategyVersion.version) && C1516540pZE.LJ(this.scene, caiStrategyVersion.scene) && this.type.equals(caiStrategyVersion.type) && this.binds.equals(caiStrategyVersion.binds) && C1516540pZE.LJ(this.libra_flight_id, caiStrategyVersion.libra_flight_id) && this.packages.equals(caiStrategyVersion.packages) && C1516540pZE.LJ(this.status, caiStrategyVersion.status) && C1516540pZE.LJ(this.gray_limit, caiStrategyVersion.gray_limit) && C1516540pZE.LJ(this.gray_condition, caiStrategyVersion.gray_condition) && this.reviewers.equals(caiStrategyVersion.reviewers) && this.platform_reviewers.equals(caiStrategyVersion.platform_reviewers) && C1516540pZE.LJ(this.approver, caiStrategyVersion.approver) && C1516540pZE.LJ(this.platform_approver, caiStrategyVersion.platform_approver) && this.android_streams.equals(caiStrategyVersion.android_streams) && this.ios_streams.equals(caiStrategyVersion.ios_streams) && C1516540pZE.LJ(this.is_bind_to_existed_libra_flight, caiStrategyVersion.is_bind_to_existed_libra_flight) && C1516540pZE.LJ(this.same_stream, caiStrategyVersion.same_stream) && C1516540pZE.LJ(this.created_timestamp, caiStrategyVersion.created_timestamp) && C1516540pZE.LJ(this.updated_timestamp, caiStrategyVersion.updated_timestamp) && this.tags.equals(caiStrategyVersion.tags) && C1516540pZE.LJ(this.manage, caiStrategyVersion.manage)) {
            return true;
        }
        return false;
    }

    public CaiStrategyVersion(String str, Integer num, String str2, Integer num2, List<CaiStrategyPackageBind> list, Integer num3, List<String> list2, Integer num4, Integer num5, Integer num6, List<String> list3, List<String> list4, String str3, String str4, List<CaiEventStream> list5, List<CaiEventStream> list6, Boolean bool, Boolean bool2, Long l, Long l2, List<CaiTag> list7, CaiManager caiManager) {
        this(str, num, str2, num2, list, num3, list2, num4, num5, num6, list3, list4, str3, str4, list5, list6, bool, bool2, l, l2, list7, caiManager, ByteString.EMPTY);
    }

    public CaiStrategyVersion(String str, Integer num, String str2, Integer num2, List<CaiStrategyPackageBind> list, Integer num3, List<String> list2, Integer num4, Integer num5, Integer num6, List<String> list3, List<String> list4, String str3, String str4, List<CaiEventStream> list5, List<CaiEventStream> list6, Boolean bool, Boolean bool2, Long l, Long l2, List<CaiTag> list7, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.version = num;
        this.scene = str2;
        this.type = num2;
        this.binds = C1516540pZE.LJFF("binds", list);
        this.libra_flight_id = num3;
        this.packages = C1516540pZE.LJFF("packages", list2);
        this.status = num4;
        this.gray_limit = num5;
        this.gray_condition = num6;
        this.reviewers = C1516540pZE.LJFF("reviewers", list3);
        this.platform_reviewers = C1516540pZE.LJFF("platform_reviewers", list4);
        this.approver = str3;
        this.platform_approver = str4;
        this.android_streams = C1516540pZE.LJFF("android_streams", list5);
        this.ios_streams = C1516540pZE.LJFF("ios_streams", list6);
        this.is_bind_to_existed_libra_flight = bool;
        this.same_stream = bool2;
        this.created_timestamp = l;
        this.updated_timestamp = l2;
        this.tags = C1516540pZE.LJFF("tags", list7);
        this.manage = caiManager;
    }
}
