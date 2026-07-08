package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1517200paI;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTable;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureTTMRule extends Message<CaiFeatureTTMRule, C1517200paI> {
    public static final ProtoAdapter<CaiFeatureTTMRule> ADAPTER = new ProtoAdapter<CaiFeatureTTMRule>() { // from class: X.0paH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTTMRule decode(ProtoReader protoReader) {
            C1517200paI c1517200paI = new C1517200paI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1517200paI.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1517200paI.LJ = CaiFeatureTTMEliminationStrategy.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1517200paI.LJFF.add(CaiFeatureTTMEvent.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c1517200paI.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1517200paI.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1517200paI.LJIIIIZZ = CaiFeatureTTMTable.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1517200paI.LJIIIZ.add(CaiEventStream.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c1517200paI.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1517200paI.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1517200paI.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1517200paI.LJIILIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1517200paI.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517200paI.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTTMRule caiFeatureTTMRule) {
            CaiFeatureTTMRule caiFeatureTTMRule2 = caiFeatureTTMRule;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiFeatureTTMRule2.aggregated_param) + CaiFeatureTTMEliminationStrategy.ADAPTER.encodedSizeWithTag(2, caiFeatureTTMRule2.elimination_strategy) + CaiFeatureTTMEvent.ADAPTER.asRepeated().encodedSizeWithTag(3, caiFeatureTTMRule2.events) + protoAdapter.encodedSizeWithTag(4, caiFeatureTTMRule2.filter) + ProtoAdapter.INT32.encodedSizeWithTag(5, caiFeatureTTMRule2.cache_type) + CaiFeatureTTMTable.ADAPTER.encodedSizeWithTag(6, caiFeatureTTMRule2.table) + CaiEventStream.ADAPTER.asRepeated().encodedSizeWithTag(7, caiFeatureTTMRule2.event_streams) + ProtoAdapter.INT64.encodedSizeWithTag(8, caiFeatureTTMRule2.disk_cache_internal) + protoAdapter.encodedSizeWithTag(9, caiFeatureTTMRule2.aggregated_param_alias);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(10, caiFeatureTTMRule2.force_update) + protoAdapter2.encodedSizeWithTag(11, caiFeatureTTMRule2.user_seperated) + caiFeatureTTMRule2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTTMRule caiFeatureTTMRule) {
            CaiFeatureTTMRule caiFeatureTTMRule2 = caiFeatureTTMRule;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureTTMRule2.aggregated_param);
            CaiFeatureTTMEliminationStrategy.ADAPTER.encodeWithTag(protoWriter, 2, caiFeatureTTMRule2.elimination_strategy);
            CaiFeatureTTMEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, caiFeatureTTMRule2.events);
            protoAdapter.encodeWithTag(protoWriter, 4, caiFeatureTTMRule2.filter);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, caiFeatureTTMRule2.cache_type);
            CaiFeatureTTMTable.ADAPTER.encodeWithTag(protoWriter, 6, caiFeatureTTMRule2.table);
            CaiEventStream.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, caiFeatureTTMRule2.event_streams);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, caiFeatureTTMRule2.disk_cache_internal);
            protoAdapter.encodeWithTag(protoWriter, 9, caiFeatureTTMRule2.aggregated_param_alias);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 10, caiFeatureTTMRule2.force_update);
            protoAdapter2.encodeWithTag(protoWriter, 11, caiFeatureTTMRule2.user_seperated);
            protoWriter.writeBytes(caiFeatureTTMRule2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aggregated_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public String aggregated_param_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer cache_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public Long disk_cache_internal;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy#ADAPTER", tag = 2)
    public CaiFeatureTTMEliminationStrategy elimination_strategy;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public List<CaiEventStream> event_streams;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<CaiFeatureTTMEvent> events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String filter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public Boolean force_update;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTable#ADAPTER", tag = 6)
    public CaiFeatureTTMTable table;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = BdTuring.TYPE_EMAIL)
    public Boolean user_seperated;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.aggregated_param;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy = this.elimination_strategy;
        int iHashCode3 = (((iHashCode2 + (caiFeatureTTMEliminationStrategy != null ? caiFeatureTTMEliminationStrategy.hashCode() : 0)) * 37) + this.events.hashCode()) * 37;
        String str2 = this.filter;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.cache_type;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        CaiFeatureTTMTable caiFeatureTTMTable = this.table;
        int iHashCode6 = (((iHashCode5 + (caiFeatureTTMTable != null ? caiFeatureTTMTable.hashCode() : 0)) * 37) + this.event_streams.hashCode()) * 37;
        Long l = this.disk_cache_internal;
        int iHashCode7 = (iHashCode6 + (l != null ? l.hashCode() : 0)) * 37;
        String str3 = this.aggregated_param_alias;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.force_update;
        int iHashCode9 = (iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.user_seperated;
        int iHashCode10 = iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public C1517200paI newBuilder() {
        C1517200paI c1517200paI = new C1517200paI();
        c1517200paI.LIZLLL = this.aggregated_param;
        c1517200paI.LJ = this.elimination_strategy;
        c1517200paI.LJFF = C1516540pZE.LIZJ("events", this.events);
        c1517200paI.LJI = this.filter;
        c1517200paI.LJII = this.cache_type;
        c1517200paI.LJIIIIZZ = this.table;
        c1517200paI.LJIIIZ = C1516540pZE.LIZJ("event_streams", this.event_streams);
        c1517200paI.LJIIJ = this.disk_cache_internal;
        c1517200paI.LJIIJJI = this.aggregated_param_alias;
        c1517200paI.LJIIL = this.force_update;
        c1517200paI.LJIILIIL = this.user_seperated;
        c1517200paI.addUnknownFields(unknownFields());
        return c1517200paI;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aggregated_param != null) {
            sb.append(", aggregated_param=");
            sb.append(this.aggregated_param);
        }
        if (this.elimination_strategy != null) {
            sb.append(", elimination_strategy=");
            sb.append(this.elimination_strategy);
        }
        if (!this.events.isEmpty()) {
            sb.append(", events=");
            sb.append(this.events);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        if (this.cache_type != null) {
            sb.append(", cache_type=");
            sb.append(this.cache_type);
        }
        if (this.table != null) {
            sb.append(", table=");
            sb.append(this.table);
        }
        if (!this.event_streams.isEmpty()) {
            sb.append(", event_streams=");
            sb.append(this.event_streams);
        }
        if (this.disk_cache_internal != null) {
            sb.append(", disk_cache_internal=");
            sb.append(this.disk_cache_internal);
        }
        if (this.aggregated_param_alias != null) {
            sb.append(", aggregated_param_alias=");
            sb.append(this.aggregated_param_alias);
        }
        if (this.force_update != null) {
            sb.append(", force_update=");
            sb.append(this.force_update);
        }
        if (this.user_seperated != null) {
            sb.append(", user_seperated=");
            sb.append(this.user_seperated);
        }
        sb.replace(0, 2, "CaiFeatureTTMRule{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTTMRule)) {
            return false;
        }
        CaiFeatureTTMRule caiFeatureTTMRule = (CaiFeatureTTMRule) obj;
        if (unknownFields().equals(caiFeatureTTMRule.unknownFields()) && C1516540pZE.LJ(this.aggregated_param, caiFeatureTTMRule.aggregated_param) && C1516540pZE.LJ(this.elimination_strategy, caiFeatureTTMRule.elimination_strategy) && this.events.equals(caiFeatureTTMRule.events) && C1516540pZE.LJ(this.filter, caiFeatureTTMRule.filter) && C1516540pZE.LJ(this.cache_type, caiFeatureTTMRule.cache_type) && C1516540pZE.LJ(this.table, caiFeatureTTMRule.table) && this.event_streams.equals(caiFeatureTTMRule.event_streams) && C1516540pZE.LJ(this.disk_cache_internal, caiFeatureTTMRule.disk_cache_internal) && C1516540pZE.LJ(this.aggregated_param_alias, caiFeatureTTMRule.aggregated_param_alias) && C1516540pZE.LJ(this.force_update, caiFeatureTTMRule.force_update) && C1516540pZE.LJ(this.user_seperated, caiFeatureTTMRule.user_seperated)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTTMRule(String str, CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy, List<CaiFeatureTTMEvent> list, String str2, Integer num, CaiFeatureTTMTable caiFeatureTTMTable, List<CaiEventStream> list2, Long l, String str3, Boolean bool, Boolean bool2) {
        this(str, caiFeatureTTMEliminationStrategy, list, str2, num, caiFeatureTTMTable, list2, l, str3, bool, bool2, ByteString.EMPTY);
    }

    public CaiFeatureTTMRule(String str, CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy, List<CaiFeatureTTMEvent> list, String str2, Integer num, CaiFeatureTTMTable caiFeatureTTMTable, List<CaiEventStream> list2, Long l, String str3, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aggregated_param = str;
        this.elimination_strategy = caiFeatureTTMEliminationStrategy;
        this.events = C1516540pZE.LJFF("events", list);
        this.filter = str2;
        this.cache_type = num;
        this.table = caiFeatureTTMTable;
        this.event_streams = C1516540pZE.LJFF("event_streams", list2);
        this.disk_cache_internal = l;
        this.aggregated_param_alias = str3;
        this.force_update = bool;
        this.user_seperated = bool2;
    }
}
