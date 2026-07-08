package multiverse.data.proto;

import X.C1516540pZE;
import X.C727702sl;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import multiverse.data.proto.BcmStandardEvent;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class BcmStandardEvent extends Message<BcmStandardEvent, C727702sl> {
    public static final ProtoAdapter<BcmStandardEvent> ADAPTER = new ProtoAdapter<BcmStandardEvent>() { // from class: X.02sk
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BcmStandardEvent decode(ProtoReader protoReader) {
            C727702sl c727702sl = new C727702sl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c727702sl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c727702sl.LJ.putAll(this.LIZIZ.decode(protoReader));
                        }
                    } else {
                        c727702sl.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c727702sl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BcmStandardEvent bcmStandardEvent) {
            BcmStandardEvent bcmStandardEvent2 = bcmStandardEvent;
            return this.LIZ.encodedSizeWithTag(1, bcmStandardEvent2.track_param) + this.LIZIZ.encodedSizeWithTag(2, bcmStandardEvent2.chain_param) + bcmStandardEvent2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BcmStandardEvent bcmStandardEvent) {
            BcmStandardEvent bcmStandardEvent2 = bcmStandardEvent;
            this.LIZ.encodeWithTag(protoWriter, 1, bcmStandardEvent2.track_param);
            this.LIZIZ.encodeWithTag(protoWriter, 2, bcmStandardEvent2.chain_param);
            protoWriter.writeBytes(bcmStandardEvent2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public Map<String, String> chain_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public Map<String, String> track_param;

    public BcmStandardEvent() {
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.track_param.hashCode()) * 37) + this.chain_param.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C727702sl newBuilder() {
        C727702sl c727702sl = new C727702sl();
        c727702sl.LIZLLL = C1516540pZE.LIZLLL("track_param", this.track_param);
        c727702sl.LJ = C1516540pZE.LIZLLL("chain_param", this.chain_param);
        c727702sl.addUnknownFields(unknownFields());
        return c727702sl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.track_param.isEmpty()) {
            sb.append(", track_param=");
            sb.append(this.track_param);
        }
        if (!this.chain_param.isEmpty()) {
            sb.append(", chain_param=");
            sb.append(this.chain_param);
        }
        sb.replace(0, 2, "BcmStandardEvent{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BcmStandardEvent)) {
            return false;
        }
        BcmStandardEvent bcmStandardEvent = (BcmStandardEvent) obj;
        if (unknownFields().equals(bcmStandardEvent.unknownFields()) && this.track_param.equals(bcmStandardEvent.track_param) && this.chain_param.equals(bcmStandardEvent.chain_param)) {
            return true;
        }
        return false;
    }

    public BcmStandardEvent(Map<String, String> map, Map<String, String> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public BcmStandardEvent(Map<String, String> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.track_param = C1516540pZE.LJI("track_param", map);
        this.chain_param = C1516540pZE.LJI("chain_param", map2);
    }
}
