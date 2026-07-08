package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2244741CtU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MediaURLStruct extends Message<MediaURLStruct, C2244741CtU> {
    public static final long serialVersionUID = 0;

    @C09CT("codec")
    public final String codec;

    @C09CT("display_type")
    public final String display_type;

    @C09CT("duration")
    public final Long duration;

    @C09CT("height")
    public final Integer height;

    @C09CT("name")
    public final String name;

    @C09CT("size")
    public final Long size;

    @C09CT("url_list")
    public final List<String> url_list;

    @C09CT("video_model")
    public final String video_model;

    @C09CT("width")
    public final Integer width;
    public static final ProtoAdapter<MediaURLStruct> ADAPTER = new ProtoAdapter<MediaURLStruct>() { // from class: X.1CtT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MediaURLStruct decode(ProtoReader protoReader) {
            C2244741CtU c2244741CtU = new C2244741CtU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                switch (iNextTag) {
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        c2244741CtU.LJI = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 21:
                                        c2244741CtU.LJII = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 22:
                                        c2244741CtU.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 23:
                                        c2244741CtU.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                        c2244741CtU.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 25:
                                        c2244741CtU.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    default:
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2244741CtU.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        break;
                                }
                            } else {
                                c2244741CtU.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2244741CtU.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c2244741CtU.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244741CtU.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MediaURLStruct mediaURLStruct) {
            MediaURLStruct mediaURLStruct2 = mediaURLStruct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, mediaURLStruct2.display_type) + protoAdapter.asRepeated().encodedSizeWithTag(2, mediaURLStruct2.url_list) + protoAdapter.encodedSizeWithTag(3, mediaURLStruct2.video_model);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(20, mediaURLStruct2.width) + protoAdapter2.encodedSizeWithTag(21, mediaURLStruct2.height);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(22, mediaURLStruct2.duration) + protoAdapter3.encodedSizeWithTag(23, mediaURLStruct2.size) + protoAdapter.encodedSizeWithTag(24, mediaURLStruct2.name) + protoAdapter.encodedSizeWithTag(25, mediaURLStruct2.codec) + mediaURLStruct2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MediaURLStruct mediaURLStruct) {
            MediaURLStruct mediaURLStruct2 = mediaURLStruct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, mediaURLStruct2.display_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, mediaURLStruct2.url_list);
            protoAdapter.encodeWithTag(protoWriter, 3, mediaURLStruct2.video_model);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 20, mediaURLStruct2.width);
            protoAdapter2.encodeWithTag(protoWriter, 21, mediaURLStruct2.height);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 22, mediaURLStruct2.duration);
            protoAdapter3.encodeWithTag(protoWriter, 23, mediaURLStruct2.size);
            protoAdapter.encodeWithTag(protoWriter, 24, mediaURLStruct2.name);
            protoAdapter.encodeWithTag(protoWriter, 25, mediaURLStruct2.codec);
            protoWriter.writeBytes(mediaURLStruct2.unknownFields());
        }
    };
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Long DEFAULT_DURATION = 0L;
    public static final Long DEFAULT_SIZE = 0L;

    @Override // com.squareup.wire.Message
    public C2244741CtU newBuilder() {
        C2244741CtU c2244741CtU = new C2244741CtU();
        c2244741CtU.LIZLLL = this.display_type;
        c2244741CtU.LJ = C1516540pZE.LIZJ("url_list", this.url_list);
        c2244741CtU.LJFF = this.video_model;
        c2244741CtU.LJI = this.width;
        c2244741CtU.LJII = this.height;
        c2244741CtU.LJIIIIZZ = this.duration;
        c2244741CtU.LJIIIZ = this.size;
        c2244741CtU.LJIIJ = this.name;
        c2244741CtU.LJIIJJI = this.codec;
        c2244741CtU.addUnknownFields(unknownFields());
        return c2244741CtU;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.display_type != null) {
            sb.append(", display_type=");
            sb.append(this.display_type);
        }
        List<String> list = this.url_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.video_model != null) {
            sb.append(", video_model=");
            sb.append(this.video_model);
        }
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
        sb.replace(0, 2, "MediaURLStruct{");
        sb.append('}');
        return sb.toString();
    }

    public MediaURLStruct(String str, List<String> list, String str2, Integer num, Integer num2, Long l, Long l2, String str3, String str4) {
        this(str, list, str2, num, num2, l, l2, str3, str4, ByteString.EMPTY);
    }

    public MediaURLStruct(String str, List<String> list, String str2, Integer num, Integer num2, Long l, Long l2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.display_type = str;
        this.url_list = C1516540pZE.LJFF("url_list", list);
        this.video_model = str2;
        this.width = num;
        this.height = num2;
        this.duration = l;
        this.size = l2;
        this.name = str3;
        this.codec = str4;
    }
}
