package com.ss.ugc.live.sdk.msg.data;

import X.C1516540pZE;
import X.C2222941BzQ;
import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class SdkUplinkPacket extends AndroidMessage<SdkUplinkPacket, C2222941BzQ> {
    public static final ProtoAdapter<SdkUplinkPacket> ADAPTER;
    public static final Parcelable.Creator<SdkUplinkPacket> CREATOR;
    public static final ByteString DEFAULT_PAYLOAD;
    public static final Long DEFAULT_SERVICEID;
    public static final Integer DEFAULT_STATUSCODE;
    public static final Long DEFAULT_UNIQUEID;
    public static final Integer DEFAULT_UPLINKSTRATEGY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, String> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 6)
    public final ByteString payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> queryParams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long serviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer statusCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String statusMessage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long uniqueID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_ECAF)
    public final Integer uplinkStrategy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String uri;

    static {
        ProtoAdapter<SdkUplinkPacket> protoAdapter = new ProtoAdapter<SdkUplinkPacket>() { // from class: X.1BzR
            public final ProtoAdapter<Map<String, String>> LIZ;
            public final ProtoAdapter<Map<String, String>> LIZIZ;

            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
                this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final SdkUplinkPacket decode(ProtoReader protoReader) {
                C2222941BzQ c2222941BzQ = new C2222941BzQ();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                c2222941BzQ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 2:
                                c2222941BzQ.LJ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 3:
                                c2222941BzQ.LJFF.putAll(this.LIZ.decode(protoReader));
                                break;
                            case 4:
                                c2222941BzQ.LJI.putAll(this.LIZIZ.decode(protoReader));
                                break;
                            case 5:
                                c2222941BzQ.LJII = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c2222941BzQ.LJIIIIZZ = ProtoAdapter.BYTES.decode(protoReader);
                                break;
                            case 7:
                                c2222941BzQ.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                c2222941BzQ.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c2222941BzQ.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2222941BzQ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c2222941BzQ.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(SdkUplinkPacket sdkUplinkPacket) {
                SdkUplinkPacket sdkUplinkPacket2 = sdkUplinkPacket;
                ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
                int iEncodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, sdkUplinkPacket2.uniqueID) + protoAdapter2.encodedSizeWithTag(2, sdkUplinkPacket2.serviceID) + this.LIZ.encodedSizeWithTag(3, sdkUplinkPacket2.queryParams) + this.LIZIZ.encodedSizeWithTag(4, sdkUplinkPacket2.headers);
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter3.encodedSizeWithTag(5, sdkUplinkPacket2.uri) + ProtoAdapter.BYTES.encodedSizeWithTag(6, sdkUplinkPacket2.payload);
                ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
                return iEncodedSizeWithTag2 + protoAdapter4.encodedSizeWithTag(7, sdkUplinkPacket2.statusCode) + protoAdapter3.encodedSizeWithTag(8, sdkUplinkPacket2.statusMessage) + protoAdapter4.encodedSizeWithTag(9, sdkUplinkPacket2.uplinkStrategy) + sdkUplinkPacket2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final SdkUplinkPacket redact(SdkUplinkPacket sdkUplinkPacket) {
                C2222941BzQ c2222941BzQNewBuilder = sdkUplinkPacket.newBuilder();
                c2222941BzQNewBuilder.clearUnknownFields();
                return c2222941BzQNewBuilder.build();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, SdkUplinkPacket sdkUplinkPacket) {
                SdkUplinkPacket sdkUplinkPacket2 = sdkUplinkPacket;
                ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(protoWriter, 1, sdkUplinkPacket2.uniqueID);
                protoAdapter2.encodeWithTag(protoWriter, 2, sdkUplinkPacket2.serviceID);
                this.LIZ.encodeWithTag(protoWriter, 3, sdkUplinkPacket2.queryParams);
                this.LIZIZ.encodeWithTag(protoWriter, 4, sdkUplinkPacket2.headers);
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(protoWriter, 5, sdkUplinkPacket2.uri);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, sdkUplinkPacket2.payload);
                ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
                protoAdapter4.encodeWithTag(protoWriter, 7, sdkUplinkPacket2.statusCode);
                protoAdapter3.encodeWithTag(protoWriter, 8, sdkUplinkPacket2.statusMessage);
                protoAdapter4.encodeWithTag(protoWriter, 9, sdkUplinkPacket2.uplinkStrategy);
                protoWriter.writeBytes(sdkUplinkPacket2.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        CREATOR = AndroidMessage.newCreator(protoAdapter);
        DEFAULT_UNIQUEID = 0L;
        DEFAULT_SERVICEID = 0L;
        DEFAULT_PAYLOAD = ByteString.EMPTY;
        DEFAULT_STATUSCODE = 0;
        DEFAULT_UPLINKSTRATEGY = 0;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.uniqueID;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.serviceID;
        int iHashCode3 = (((((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.queryParams.hashCode()) * 37) + this.headers.hashCode()) * 37;
        String str = this.uri;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.payload;
        int iHashCode5 = (iHashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Integer num = this.statusCode;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.statusMessage;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num2 = this.uplinkStrategy;
        int iHashCode8 = iHashCode7 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2222941BzQ newBuilder() {
        C2222941BzQ c2222941BzQ = new C2222941BzQ();
        c2222941BzQ.LIZLLL = this.uniqueID;
        c2222941BzQ.LJ = this.serviceID;
        c2222941BzQ.LJFF = C1516540pZE.LIZLLL("queryParams", this.queryParams);
        c2222941BzQ.LJI = C1516540pZE.LIZLLL("headers", this.headers);
        c2222941BzQ.LJII = this.uri;
        c2222941BzQ.LJIIIIZZ = this.payload;
        c2222941BzQ.LJIIIZ = this.statusCode;
        c2222941BzQ.LJIIJ = this.statusMessage;
        c2222941BzQ.LJIIJJI = this.uplinkStrategy;
        c2222941BzQ.addUnknownFields(unknownFields());
        return c2222941BzQ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uniqueID != null) {
            sb.append(", uniqueID=");
            sb.append(this.uniqueID);
        }
        if (this.serviceID != null) {
            sb.append(", serviceID=");
            sb.append(this.serviceID);
        }
        Map<String, String> map = this.queryParams;
        if (map != null && !map.isEmpty()) {
            sb.append(", queryParams=");
            sb.append(this.queryParams);
        }
        Map<String, String> map2 = this.headers;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (this.statusCode != null) {
            sb.append(", statusCode=");
            sb.append(this.statusCode);
        }
        if (this.statusMessage != null) {
            sb.append(", statusMessage=");
            sb.append(this.statusMessage);
        }
        if (this.uplinkStrategy != null) {
            sb.append(", uplinkStrategy=");
            sb.append(this.uplinkStrategy);
        }
        sb.replace(0, 2, "SdkUplinkPacket{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkUplinkPacket)) {
            return false;
        }
        SdkUplinkPacket sdkUplinkPacket = (SdkUplinkPacket) obj;
        if (unknownFields().equals(sdkUplinkPacket.unknownFields()) && C1516540pZE.LJ(this.uniqueID, sdkUplinkPacket.uniqueID) && C1516540pZE.LJ(this.serviceID, sdkUplinkPacket.serviceID) && this.queryParams.equals(sdkUplinkPacket.queryParams) && this.headers.equals(sdkUplinkPacket.headers) && C1516540pZE.LJ(this.uri, sdkUplinkPacket.uri) && C1516540pZE.LJ(this.payload, sdkUplinkPacket.payload) && C1516540pZE.LJ(this.statusCode, sdkUplinkPacket.statusCode) && C1516540pZE.LJ(this.statusMessage, sdkUplinkPacket.statusMessage) && C1516540pZE.LJ(this.uplinkStrategy, sdkUplinkPacket.uplinkStrategy)) {
            return true;
        }
        return false;
    }

    public SdkUplinkPacket(Long l, Long l2, Map<String, String> map, Map<String, String> map2, String str, ByteString byteString, Integer num, String str2, Integer num2) {
        this(l, l2, map, map2, str, byteString, num, str2, num2, ByteString.EMPTY);
    }

    public SdkUplinkPacket(Long l, Long l2, Map<String, String> map, Map<String, String> map2, String str, ByteString byteString, Integer num, String str2, Integer num2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.uniqueID = l;
        this.serviceID = l2;
        this.queryParams = C1516540pZE.LJI("queryParams", map);
        this.headers = C1516540pZE.LJI("headers", map2);
        this.uri = str;
        this.payload = byteString;
        this.statusCode = num;
        this.statusMessage = str2;
        this.uplinkStrategy = num2;
    }
}
