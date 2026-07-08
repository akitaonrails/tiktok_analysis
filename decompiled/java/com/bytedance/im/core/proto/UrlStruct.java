package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C904270Zdh;
import com.bytedance.im.core.proto.UrlStruct;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UrlStruct extends Message<UrlStruct, C904270Zdh> {
    public static final long serialVersionUID = 0;

    @C09CT("data_size")
    public final Integer data_size;

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> url_list;

    @C09CT("width")
    public final Integer width;
    public static final ProtoAdapter<UrlStruct> ADAPTER = new ProtoAdapter<UrlStruct>() { // from class: X.0Zdi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UrlStruct decode(ProtoReader protoReader) {
            C904270Zdh c904270Zdh = new C904270Zdh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c904270Zdh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c904270Zdh.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c904270Zdh.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c904270Zdh.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c904270Zdh.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c904270Zdh.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c904270Zdh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UrlStruct urlStruct) {
            UrlStruct urlStruct2 = urlStruct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, urlStruct2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, urlStruct2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, urlStruct2.width) + protoAdapter2.encodedSizeWithTag(4, urlStruct2.height) + protoAdapter2.encodedSizeWithTag(5, urlStruct2.data_size) + urlStruct2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UrlStruct urlStruct) {
            UrlStruct urlStruct2 = urlStruct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, urlStruct2.uri);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, urlStruct2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, urlStruct2.width);
            protoAdapter2.encodeWithTag(protoWriter, 4, urlStruct2.height);
            protoAdapter2.encodeWithTag(protoWriter, 5, urlStruct2.data_size);
            protoWriter.writeBytes(urlStruct2.unknownFields());
        }
    };
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DATA_SIZE = 0;

    @Override // com.squareup.wire.Message
    public C904270Zdh newBuilder() {
        C904270Zdh c904270Zdh = new C904270Zdh();
        c904270Zdh.LIZLLL = this.uri;
        c904270Zdh.LJ = C1516540pZE.LIZJ("url_list", this.url_list);
        c904270Zdh.LJFF = this.width;
        c904270Zdh.LJI = this.height;
        c904270Zdh.LJII = this.data_size;
        c904270Zdh.addUnknownFields(unknownFields());
        return c904270Zdh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        List<String> list = this.url_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.data_size != null) {
            sb.append(", data_size=");
            sb.append(this.data_size);
        }
        sb.replace(0, 2, "UrlStruct{");
        sb.append('}');
        return sb.toString();
    }

    public UrlStruct(String str, List<String> list, Integer num, Integer num2, Integer num3) {
        this(str, list, num, num2, num3, ByteString.EMPTY);
    }

    public UrlStruct(String str, List<String> list, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = C1516540pZE.LJFF("url_list", list);
        this.width = num;
        this.height = num2;
        this.data_size = num3;
    }
}
