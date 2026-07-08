package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2239281Ckg;
import X.C2239301Cki;
import X.C2239321Ckk;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiTTMCompileDiagnostic extends Message<CaiTTMCompileDiagnostic, C2239321Ckk> {
    public static final ProtoAdapter<CaiTTMCompileDiagnostic> ADAPTER = new ProtoAdapter<CaiTTMCompileDiagnostic>() { // from class: X.1Ckj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiTTMCompileDiagnostic decode(ProtoReader protoReader) {
            C2239321Ckk c2239321Ckk = new C2239321Ckk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2239321Ckk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2239321Ckk.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2239321Ckk.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2239321Ckk.LJ = CaiTTMCompileDiagnostic.Range.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2239321Ckk.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2239321Ckk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiTTMCompileDiagnostic caiTTMCompileDiagnostic) {
            CaiTTMCompileDiagnostic caiTTMCompileDiagnostic2 = caiTTMCompileDiagnostic;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, caiTTMCompileDiagnostic2.severity) + CaiTTMCompileDiagnostic.Range.ADAPTER.encodedSizeWithTag(2, caiTTMCompileDiagnostic2.range);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, caiTTMCompileDiagnostic2.message) + protoAdapter.encodedSizeWithTag(4, caiTTMCompileDiagnostic2.source) + caiTTMCompileDiagnostic2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiTTMCompileDiagnostic caiTTMCompileDiagnostic) {
            CaiTTMCompileDiagnostic caiTTMCompileDiagnostic2 = caiTTMCompileDiagnostic;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, caiTTMCompileDiagnostic2.severity);
            CaiTTMCompileDiagnostic.Range.ADAPTER.encodeWithTag(protoWriter, 2, caiTTMCompileDiagnostic2.range);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, caiTTMCompileDiagnostic2.message);
            protoAdapter.encodeWithTag(protoWriter, 4, caiTTMCompileDiagnostic2.source);
            protoWriter.writeBytes(caiTTMCompileDiagnostic2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String message;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic$Range#ADAPTER", tag = 2)
    public Range range;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer severity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String source;

    public static final class Range extends Message<Range, C2239301Cki> {
        public static final ProtoAdapter<Range> ADAPTER = new ProtoAdapter<Range>() { // from class: X.1Ckh
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiTTMCompileDiagnostic.Range decode(ProtoReader protoReader) {
                C2239301Cki c2239301Cki = new C2239301Cki();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2239301Cki.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2239301Cki.LJ = CaiTTMCompileDiagnostic.RangeDiscriptor.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2239301Cki.LIZLLL = CaiTTMCompileDiagnostic.RangeDiscriptor.ADAPTER.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c2239301Cki.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiTTMCompileDiagnostic.Range range) {
                CaiTTMCompileDiagnostic.Range range2 = range;
                ProtoAdapter<CaiTTMCompileDiagnostic.RangeDiscriptor> protoAdapter = CaiTTMCompileDiagnostic.RangeDiscriptor.ADAPTER;
                return protoAdapter.encodedSizeWithTag(1, range2.start) + protoAdapter.encodedSizeWithTag(2, range2.end) + range2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiTTMCompileDiagnostic.Range range) {
                CaiTTMCompileDiagnostic.Range range2 = range;
                ProtoAdapter<CaiTTMCompileDiagnostic.RangeDiscriptor> protoAdapter = CaiTTMCompileDiagnostic.RangeDiscriptor.ADAPTER;
                protoAdapter.encodeWithTag(protoWriter, 1, range2.start);
                protoAdapter.encodeWithTag(protoWriter, 2, range2.end);
                protoWriter.writeBytes(range2.unknownFields());
            }
        };

        @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic$RangeDiscriptor#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
        public RangeDiscriptor end;

        @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic$RangeDiscriptor#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
        public RangeDiscriptor start;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.start.hashCode()) * 37) + this.end.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C2239301Cki newBuilder() {
            C2239301Cki c2239301Cki = new C2239301Cki();
            c2239301Cki.LIZLLL = this.start;
            c2239301Cki.LJ = this.end;
            c2239301Cki.addUnknownFields(unknownFields());
            return c2239301Cki;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.replace(0, 2, "Range{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            if (unknownFields().equals(range.unknownFields()) && this.start.equals(range.start) && this.end.equals(range.end)) {
                return true;
            }
            return false;
        }

        public Range(RangeDiscriptor rangeDiscriptor, RangeDiscriptor rangeDiscriptor2) {
            this(rangeDiscriptor, rangeDiscriptor2, ByteString.EMPTY);
        }

        public Range(RangeDiscriptor rangeDiscriptor, RangeDiscriptor rangeDiscriptor2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start = rangeDiscriptor;
            this.end = rangeDiscriptor2;
        }
    }

    public static final class RangeDiscriptor extends Message<RangeDiscriptor, C2239281Ckg> {
        public static final ProtoAdapter<RangeDiscriptor> ADAPTER = new ProtoAdapter<RangeDiscriptor>() { // from class: X.1Ckf
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiTTMCompileDiagnostic.RangeDiscriptor decode(ProtoReader protoReader) {
                C2239281Ckg c2239281Ckg = new C2239281Ckg();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2239281Ckg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2239281Ckg.LJ = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2239281Ckg.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c2239281Ckg.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiTTMCompileDiagnostic.RangeDiscriptor rangeDiscriptor) {
                CaiTTMCompileDiagnostic.RangeDiscriptor rangeDiscriptor2 = rangeDiscriptor;
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                return protoAdapter.encodedSizeWithTag(1, rangeDiscriptor2.line) + protoAdapter.encodedSizeWithTag(2, rangeDiscriptor2.character) + rangeDiscriptor2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiTTMCompileDiagnostic.RangeDiscriptor rangeDiscriptor) {
                CaiTTMCompileDiagnostic.RangeDiscriptor rangeDiscriptor2 = rangeDiscriptor;
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(protoWriter, 1, rangeDiscriptor2.line);
                protoAdapter.encodeWithTag(protoWriter, 2, rangeDiscriptor2.character);
                protoWriter.writeBytes(rangeDiscriptor2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
        public Integer character;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
        public Integer line;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.line.hashCode()) * 37) + this.character.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C2239281Ckg newBuilder() {
            C2239281Ckg c2239281Ckg = new C2239281Ckg();
            c2239281Ckg.LIZLLL = this.line;
            c2239281Ckg.LJ = this.character;
            c2239281Ckg.addUnknownFields(unknownFields());
            return c2239281Ckg;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", line=");
            sb.append(this.line);
            sb.append(", character=");
            sb.append(this.character);
            sb.replace(0, 2, "RangeDiscriptor{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RangeDiscriptor)) {
                return false;
            }
            RangeDiscriptor rangeDiscriptor = (RangeDiscriptor) obj;
            if (unknownFields().equals(rangeDiscriptor.unknownFields()) && this.line.equals(rangeDiscriptor.line) && this.character.equals(rangeDiscriptor.character)) {
                return true;
            }
            return false;
        }

        public RangeDiscriptor(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public RangeDiscriptor(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.line = num;
            this.character = num2;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.severity;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Range range = this.range;
        int iHashCode3 = (iHashCode2 + (range != null ? range.hashCode() : 0)) * 37;
        String str = this.message;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.source;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2239321Ckk newBuilder() {
        C2239321Ckk c2239321Ckk = new C2239321Ckk();
        c2239321Ckk.LIZLLL = this.severity;
        c2239321Ckk.LJ = this.range;
        c2239321Ckk.LJFF = this.message;
        c2239321Ckk.LJI = this.source;
        c2239321Ckk.addUnknownFields(unknownFields());
        return c2239321Ckk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.severity != null) {
            sb.append(", severity=");
            sb.append(this.severity);
        }
        if (this.range != null) {
            sb.append(", range=");
            sb.append(this.range);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        sb.replace(0, 2, "CaiTTMCompileDiagnostic{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiTTMCompileDiagnostic)) {
            return false;
        }
        CaiTTMCompileDiagnostic caiTTMCompileDiagnostic = (CaiTTMCompileDiagnostic) obj;
        if (unknownFields().equals(caiTTMCompileDiagnostic.unknownFields()) && C1516540pZE.LJ(this.severity, caiTTMCompileDiagnostic.severity) && C1516540pZE.LJ(this.range, caiTTMCompileDiagnostic.range) && C1516540pZE.LJ(this.message, caiTTMCompileDiagnostic.message) && C1516540pZE.LJ(this.source, caiTTMCompileDiagnostic.source)) {
            return true;
        }
        return false;
    }

    public CaiTTMCompileDiagnostic(Integer num, Range range, String str, String str2) {
        this(num, range, str, str2, ByteString.EMPTY);
    }

    public CaiTTMCompileDiagnostic(Integer num, Range range, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.severity = num;
        this.range = range;
        this.message = str;
        this.source = str2;
    }
}
