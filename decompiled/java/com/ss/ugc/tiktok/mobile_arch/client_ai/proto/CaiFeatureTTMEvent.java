package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1517160paE;
import X.C1517180paG;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureTTMEvent extends Message<CaiFeatureTTMEvent, C1517180paG> {
    public static final ProtoAdapter<CaiFeatureTTMEvent> ADAPTER = new ProtoAdapter<CaiFeatureTTMEvent>() { // from class: X.0paF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTTMEvent decode(ProtoReader protoReader) {
            C1517180paG c1517180paG = new C1517180paG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 10) {
                        if (iNextTag != 11) {
                            switch (iNextTag) {
                                case 1:
                                    c1517180paG.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c1517180paG.LJ.add(CaiFeatureTTMEvent.relativeField.ADAPTER.decode(protoReader));
                                    break;
                                case 3:
                                    c1517180paG.LJFF = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    c1517180paG.LJI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    c1517180paG.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 6:
                                    c1517180paG.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1517180paG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c1517180paG.LJIIJ = CaiFeatureTTMEliminationStrategy.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1517180paG.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517180paG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTTMEvent caiFeatureTTMEvent) {
            CaiFeatureTTMEvent caiFeatureTTMEvent2 = caiFeatureTTMEvent;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiFeatureTTMEvent2.event_name) + CaiFeatureTTMEvent.relativeField.ADAPTER.asRepeated().encodedSizeWithTag(2, caiFeatureTTMEvent2.relative_field) + protoAdapter.encodedSizeWithTag(3, caiFeatureTTMEvent2.filter) + protoAdapter.encodedSizeWithTag(4, caiFeatureTTMEvent2.aggregated_param) + protoAdapter.encodedSizeWithTag(5, caiFeatureTTMEvent2.alias) + protoAdapter.encodedSizeWithTag(6, caiFeatureTTMEvent2.stream_key) + ProtoAdapter.BOOL.encodedSizeWithTag(10, caiFeatureTTMEvent2.remove) + CaiFeatureTTMEliminationStrategy.ADAPTER.encodedSizeWithTag(11, caiFeatureTTMEvent2.elimination_strategy) + caiFeatureTTMEvent2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTTMEvent caiFeatureTTMEvent) {
            CaiFeatureTTMEvent caiFeatureTTMEvent2 = caiFeatureTTMEvent;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureTTMEvent2.event_name);
            CaiFeatureTTMEvent.relativeField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, caiFeatureTTMEvent2.relative_field);
            protoAdapter.encodeWithTag(protoWriter, 3, caiFeatureTTMEvent2.filter);
            protoAdapter.encodeWithTag(protoWriter, 4, caiFeatureTTMEvent2.aggregated_param);
            protoAdapter.encodeWithTag(protoWriter, 5, caiFeatureTTMEvent2.alias);
            protoAdapter.encodeWithTag(protoWriter, 6, caiFeatureTTMEvent2.stream_key);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, caiFeatureTTMEvent2.remove);
            CaiFeatureTTMEliminationStrategy.ADAPTER.encodeWithTag(protoWriter, 11, caiFeatureTTMEvent2.elimination_strategy);
            protoWriter.writeBytes(caiFeatureTTMEvent2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String aggregated_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String alias;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public CaiFeatureTTMEliminationStrategy elimination_strategy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String event_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String filter;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent$relativeField#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<relativeField> relative_field;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public Boolean remove;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String stream_key;

    public static final class relativeField extends Message<relativeField, C1517160paE> {
        public static final ProtoAdapter<relativeField> ADAPTER = new ProtoAdapter<relativeField>() { // from class: X.0paD
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiFeatureTTMEvent.relativeField decode(ProtoReader protoReader) {
                C1517160paE c1517160paE = new C1517160paE();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                if (iNextTag != 3) {
                                    if (iNextTag != 4) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1517160paE.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1517160paE.LJI = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1517160paE.LJFF = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1517160paE.LJ = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1517160paE.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1517160paE.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiFeatureTTMEvent.relativeField relativefield) {
                CaiFeatureTTMEvent.relativeField relativefield2 = relativefield;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.encodedSizeWithTag(1, relativefield2.field) + protoAdapter.encodedSizeWithTag(2, relativefield2.type) + protoAdapter.encodedSizeWithTag(3, relativefield2.classification_method) + protoAdapter.encodedSizeWithTag(4, relativefield2.alias) + relativefield2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiFeatureTTMEvent.relativeField relativefield) {
                CaiFeatureTTMEvent.relativeField relativefield2 = relativefield;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(protoWriter, 1, relativefield2.field);
                protoAdapter.encodeWithTag(protoWriter, 2, relativefield2.type);
                protoAdapter.encodeWithTag(protoWriter, 3, relativefield2.classification_method);
                protoAdapter.encodeWithTag(protoWriter, 4, relativefield2.alias);
                protoWriter.writeBytes(relativefield2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
        public String alias;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
        public String classification_method;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String field;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
        public String type;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.field.hashCode()) * 37) + this.type.hashCode()) * 37;
            String str = this.classification_method;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.alias;
            int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public C1517160paE newBuilder() {
            C1517160paE c1517160paE = new C1517160paE();
            c1517160paE.LIZLLL = this.field;
            c1517160paE.LJ = this.type;
            c1517160paE.LJFF = this.classification_method;
            c1517160paE.LJI = this.alias;
            c1517160paE.addUnknownFields(unknownFields());
            return c1517160paE;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", field=");
            sb.append(this.field);
            sb.append(", type=");
            sb.append(this.type);
            if (this.classification_method != null) {
                sb.append(", classification_method=");
                sb.append(this.classification_method);
            }
            if (this.alias != null) {
                sb.append(", alias=");
                sb.append(this.alias);
            }
            sb.replace(0, 2, "relativeField{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof relativeField)) {
                return false;
            }
            relativeField relativefield = (relativeField) obj;
            if (unknownFields().equals(relativefield.unknownFields()) && this.field.equals(relativefield.field) && this.type.equals(relativefield.type) && C1516540pZE.LJ(this.classification_method, relativefield.classification_method) && C1516540pZE.LJ(this.alias, relativefield.alias)) {
                return true;
            }
            return false;
        }

        public relativeField(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, ByteString.EMPTY);
        }

        public relativeField(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.field = str;
            this.type = str2;
            this.classification_method = str3;
            this.alias = str4;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.event_name.hashCode()) * 37) + this.relative_field.hashCode()) * 37;
        String str = this.filter;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.aggregated_param;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.alias;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.stream_key;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.remove;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy = this.elimination_strategy;
        int iHashCode7 = iHashCode6 + (caiFeatureTTMEliminationStrategy != null ? caiFeatureTTMEliminationStrategy.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C1517180paG newBuilder() {
        C1517180paG c1517180paG = new C1517180paG();
        c1517180paG.LIZLLL = this.event_name;
        c1517180paG.LJ = C1516540pZE.LIZJ("relative_field", this.relative_field);
        c1517180paG.LJFF = this.filter;
        c1517180paG.LJI = this.aggregated_param;
        c1517180paG.LJII = this.alias;
        c1517180paG.LJIIIIZZ = this.stream_key;
        c1517180paG.LJIIIZ = this.remove;
        c1517180paG.LJIIJ = this.elimination_strategy;
        c1517180paG.addUnknownFields(unknownFields());
        return c1517180paG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", event_name=");
        sb.append(this.event_name);
        if (!this.relative_field.isEmpty()) {
            sb.append(", relative_field=");
            sb.append(this.relative_field);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        if (this.aggregated_param != null) {
            sb.append(", aggregated_param=");
            sb.append(this.aggregated_param);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.stream_key != null) {
            sb.append(", stream_key=");
            sb.append(this.stream_key);
        }
        if (this.remove != null) {
            sb.append(", remove=");
            sb.append(this.remove);
        }
        if (this.elimination_strategy != null) {
            sb.append(", elimination_strategy=");
            sb.append(this.elimination_strategy);
        }
        sb.replace(0, 2, "CaiFeatureTTMEvent{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTTMEvent)) {
            return false;
        }
        CaiFeatureTTMEvent caiFeatureTTMEvent = (CaiFeatureTTMEvent) obj;
        if (unknownFields().equals(caiFeatureTTMEvent.unknownFields()) && this.event_name.equals(caiFeatureTTMEvent.event_name) && this.relative_field.equals(caiFeatureTTMEvent.relative_field) && C1516540pZE.LJ(this.filter, caiFeatureTTMEvent.filter) && C1516540pZE.LJ(this.aggregated_param, caiFeatureTTMEvent.aggregated_param) && C1516540pZE.LJ(this.alias, caiFeatureTTMEvent.alias) && C1516540pZE.LJ(this.stream_key, caiFeatureTTMEvent.stream_key) && C1516540pZE.LJ(this.remove, caiFeatureTTMEvent.remove) && C1516540pZE.LJ(this.elimination_strategy, caiFeatureTTMEvent.elimination_strategy)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTTMEvent(String str, List<relativeField> list, String str2, String str3, String str4, String str5, Boolean bool, CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy) {
        this(str, list, str2, str3, str4, str5, bool, caiFeatureTTMEliminationStrategy, ByteString.EMPTY);
    }

    public CaiFeatureTTMEvent(String str, List<relativeField> list, String str2, String str3, String str4, String str5, Boolean bool, CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_name = str;
        this.relative_field = C1516540pZE.LJFF("relative_field", list);
        this.filter = str2;
        this.aggregated_param = str3;
        this.alias = str4;
        this.stream_key = str5;
        this.remove = bool;
        this.elimination_strategy = caiFeatureTTMEliminationStrategy;
    }
}
