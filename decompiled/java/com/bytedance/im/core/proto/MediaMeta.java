package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YCI;
import com.bytedance.im.core.proto.MediaMeta;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MediaMeta extends Message<MediaMeta, C0YCI> {
    public static final long serialVersionUID = 0;

    @C09CT("codec")
    public final String codec;

    @C09CT("duration")
    public final Long duration;

    @C09CT("height")
    public final Integer height;

    @C09CT("name")
    public final String name;

    @C09CT("size")
    public final Long size;

    @C09CT("width")
    public final Integer width;
    public static final ProtoAdapter<MediaMeta> ADAPTER = new ProtoAdapter<MediaMeta>() { // from class: X.0YCJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MediaMeta decode(ProtoReader protoReader) {
            C0YCI c0yci = new C0YCI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yci.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0yci.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c0yci.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yci.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0yci.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c0yci.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yci.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yci.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MediaMeta mediaMeta) {
            MediaMeta mediaMeta2 = mediaMeta;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, mediaMeta2.width) + protoAdapter.encodedSizeWithTag(2, mediaMeta2.height);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, mediaMeta2.duration) + protoAdapter2.encodedSizeWithTag(4, mediaMeta2.size);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, mediaMeta2.name) + protoAdapter3.encodedSizeWithTag(6, mediaMeta2.codec) + mediaMeta2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MediaMeta mediaMeta) {
            MediaMeta mediaMeta2 = mediaMeta;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, mediaMeta2.width);
            protoAdapter.encodeWithTag(protoWriter, 2, mediaMeta2.height);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, mediaMeta2.duration);
            protoAdapter2.encodeWithTag(protoWriter, 4, mediaMeta2.size);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 5, mediaMeta2.name);
            protoAdapter3.encodeWithTag(protoWriter, 6, mediaMeta2.codec);
            protoWriter.writeBytes(mediaMeta2.unknownFields());
        }
    };
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Long DEFAULT_DURATION = 0L;
    public static final Long DEFAULT_SIZE = 0L;

    @Override // com.squareup.wire.Message
    public C0YCI newBuilder() {
        C0YCI c0yci = new C0YCI();
        c0yci.LIZLLL = this.width;
        c0yci.LJ = this.height;
        c0yci.LJFF = this.duration;
        c0yci.LJI = this.size;
        c0yci.LJII = this.name;
        c0yci.LJIIIIZZ = this.codec;
        c0yci.addUnknownFields(unknownFields());
        return c0yci;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.codec != null) {
            sb.append(", codec=");
            sb.append(this.codec);
        }
        sb.replace(0, 2, "MediaMeta{");
        sb.append('}');
        return sb.toString();
    }

    public MediaMeta(Integer num, Integer num2, Long l, Long l2, String str, String str2) {
        this(num, num2, l, l2, str, str2, ByteString.EMPTY);
    }

    public MediaMeta(Integer num, Integer num2, Long l, Long l2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = num;
        this.height = num2;
        this.duration = l;
        this.size = l2;
        this.name = str;
        this.codec = str2;
    }
}
