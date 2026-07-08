package tiktok.image.proto;

import X.C0W3B;
import X.C1516540pZE;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import okio.ByteString;
import tiktok.image.proto.ImageHeader;

/* JADX INFO: loaded from: classes35.dex */
public final class ImageHeader extends Message<ImageHeader, C0W3B> {
    public static final ProtoAdapter<ImageHeader> ADAPTER = new ProtoAdapter<ImageHeader>() { // from class: X.1CiN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ImageHeader decode(ProtoReader protoReader) {
            C0W3B c0w3b = new C0W3B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0w3b.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0w3b.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c0w3b.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0w3b.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0w3b.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c0w3b.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c0w3b.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0w3b.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0w3b.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0w3b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0w3b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ImageHeader imageHeader) {
            ImageHeader imageHeader2 = imageHeader;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, imageHeader2.network_quality);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, imageHeader2.network_type) + protoAdapter.encodedSizeWithTag(3, imageHeader2.battery) + ProtoAdapter.INT64.encodedSizeWithTag(4, imageHeader2.memory) + protoAdapter2.encodedSizeWithTag(5, imageHeader2.requestFrom) + protoAdapter2.encodedSizeWithTag(6, imageHeader2.static_format) + protoAdapter2.encodedSizeWithTag(7, imageHeader2.animated_format);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, imageHeader2.supportSuperRes) + protoAdapter3.encodedSizeWithTag(9, imageHeader2.supportMultiBitrate) + imageHeader2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ImageHeader imageHeader) {
            ImageHeader imageHeader2 = imageHeader;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, imageHeader2.network_quality);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, imageHeader2.network_type);
            protoAdapter.encodeWithTag(protoWriter, 3, imageHeader2.battery);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, imageHeader2.memory);
            protoAdapter2.encodeWithTag(protoWriter, 5, imageHeader2.requestFrom);
            protoAdapter2.encodeWithTag(protoWriter, 6, imageHeader2.static_format);
            protoAdapter2.encodeWithTag(protoWriter, 7, imageHeader2.animated_format);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 8, imageHeader2.supportSuperRes);
            protoAdapter3.encodeWithTag(protoWriter, 9, imageHeader2.supportMultiBitrate);
            protoWriter.writeBytes(imageHeader2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String animated_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer battery;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long memory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer network_quality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String network_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String requestFrom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String static_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = BdTuring.TYPE_ECAF)
    public Boolean supportMultiBitrate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public Boolean supportSuperRes;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.network_quality;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.network_type;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num2 = this.battery;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l = this.memory;
        int iHashCode5 = (iHashCode4 + (l != null ? l.hashCode() : 0)) * 37;
        String str2 = this.requestFrom;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.static_format;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.animated_format;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.supportSuperRes;
        int iHashCode9 = (iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.supportMultiBitrate;
        int iHashCode10 = iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public C0W3B newBuilder() {
        C0W3B c0w3b = new C0W3B();
        c0w3b.LIZLLL = this.network_quality;
        c0w3b.LJ = this.network_type;
        c0w3b.LJFF = this.battery;
        c0w3b.LJI = this.memory;
        c0w3b.LJII = this.requestFrom;
        c0w3b.LJIIIIZZ = this.static_format;
        c0w3b.LJIIIZ = this.animated_format;
        c0w3b.LJIIJ = this.supportSuperRes;
        c0w3b.LJIIJJI = this.supportMultiBitrate;
        c0w3b.addUnknownFields(unknownFields());
        return c0w3b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.network_quality != null) {
            sb.append(", network_quality=");
            sb.append(this.network_quality);
        }
        if (this.network_type != null) {
            sb.append(", network_type=");
            sb.append(this.network_type);
        }
        if (this.battery != null) {
            sb.append(", battery=");
            sb.append(this.battery);
        }
        if (this.memory != null) {
            sb.append(", memory=");
            sb.append(this.memory);
        }
        if (this.requestFrom != null) {
            sb.append(", requestFrom=");
            sb.append(this.requestFrom);
        }
        if (this.static_format != null) {
            sb.append(", static_format=");
            sb.append(this.static_format);
        }
        if (this.animated_format != null) {
            sb.append(", animated_format=");
            sb.append(this.animated_format);
        }
        if (this.supportSuperRes != null) {
            sb.append(", supportSuperRes=");
            sb.append(this.supportSuperRes);
        }
        if (this.supportMultiBitrate != null) {
            sb.append(", supportMultiBitrate=");
            sb.append(this.supportMultiBitrate);
        }
        sb.replace(0, 2, "ImageHeader{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageHeader)) {
            return false;
        }
        ImageHeader imageHeader = (ImageHeader) obj;
        if (unknownFields().equals(imageHeader.unknownFields()) && C1516540pZE.LJ(this.network_quality, imageHeader.network_quality) && C1516540pZE.LJ(this.network_type, imageHeader.network_type) && C1516540pZE.LJ(this.battery, imageHeader.battery) && C1516540pZE.LJ(this.memory, imageHeader.memory) && C1516540pZE.LJ(this.requestFrom, imageHeader.requestFrom) && C1516540pZE.LJ(this.static_format, imageHeader.static_format) && C1516540pZE.LJ(this.animated_format, imageHeader.animated_format) && C1516540pZE.LJ(this.supportSuperRes, imageHeader.supportSuperRes) && C1516540pZE.LJ(this.supportMultiBitrate, imageHeader.supportMultiBitrate)) {
            return true;
        }
        return false;
    }

    public ImageHeader(Integer num, String str, Integer num2, Long l, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this(num, str, num2, l, str2, str3, str4, bool, bool2, ByteString.EMPTY);
    }

    public ImageHeader(Integer num, String str, Integer num2, Long l, String str2, String str3, String str4, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.network_quality = num;
        this.network_type = str;
        this.battery = num2;
        this.memory = l;
        this.requestFrom = str2;
        this.static_format = str3;
        this.animated_format = str4;
        this.supportSuperRes = bool;
        this.supportMultiBitrate = bool2;
    }
}
