package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YT5;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetMediaUploadConfigResponseBody;
import com.bytedance.im.core.proto.MediaUploadConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMediaUploadConfigResponseBody extends Message<GetMediaUploadConfigResponseBody, C0YT5> {
    public static final ProtoAdapter<GetMediaUploadConfigResponseBody> ADAPTER = new ProtoAdapter<GetMediaUploadConfigResponseBody>() { // from class: X.0YT4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMediaUploadConfigResponseBody decode(ProtoReader protoReader) {
            C0YT5 c0yt5 = new C0YT5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yt5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yt5.LIZLLL.add(MediaUploadConfig.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yt5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMediaUploadConfigResponseBody getMediaUploadConfigResponseBody) {
            GetMediaUploadConfigResponseBody getMediaUploadConfigResponseBody2 = getMediaUploadConfigResponseBody;
            return MediaUploadConfig.ADAPTER.asRepeated().encodedSizeWithTag(1, getMediaUploadConfigResponseBody2.configs) + getMediaUploadConfigResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMediaUploadConfigResponseBody getMediaUploadConfigResponseBody) {
            GetMediaUploadConfigResponseBody getMediaUploadConfigResponseBody2 = getMediaUploadConfigResponseBody;
            MediaUploadConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMediaUploadConfigResponseBody2.configs);
            protoWriter.writeBytes(getMediaUploadConfigResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("configs")
    public final List<MediaUploadConfig> configs;

    @Override // com.squareup.wire.Message
    public C0YT5 newBuilder() {
        C0YT5 c0yt5 = new C0YT5();
        c0yt5.LIZLLL = C1516540pZE.LIZJ("configs", this.configs);
        c0yt5.addUnknownFields(unknownFields());
        return c0yt5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MediaUploadConfig> list = this.configs;
        if (list != null && !list.isEmpty()) {
            sb.append(", configs=");
            sb.append(this.configs);
        }
        sb.replace(0, 2, "GetMediaUploadConfigResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMediaUploadConfigResponseBody(List<MediaUploadConfig> list) {
        this(list, ByteString.EMPTY);
    }

    public GetMediaUploadConfigResponseBody(List<MediaUploadConfig> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.configs = C1516540pZE.LJFF("configs", list);
    }
}
