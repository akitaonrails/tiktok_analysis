package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YHA;
import X.C1516540pZE;
import X.C877100Yay;
import X.EnumC870720YDu;
import com.bytedance.im.core.proto.GetMediaStatusRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMediaStatusRequestBody extends Message<GetMediaStatusRequestBody, C0YHA> {
    public static final ProtoAdapter<GetMediaStatusRequestBody> ADAPTER = new ProtoAdapter<GetMediaStatusRequestBody>() { // from class: X.0YHB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMediaStatusRequestBody decode(ProtoReader protoReader) {
            C0YHA c0yha = new C0YHA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yha.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yha.LIZLLL.add(GetMediaStatusRequestBody.MediaKey.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yha.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMediaStatusRequestBody getMediaStatusRequestBody) {
            GetMediaStatusRequestBody getMediaStatusRequestBody2 = getMediaStatusRequestBody;
            return GetMediaStatusRequestBody.MediaKey.ADAPTER.asRepeated().encodedSizeWithTag(1, getMediaStatusRequestBody2.media_list) + getMediaStatusRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMediaStatusRequestBody getMediaStatusRequestBody) {
            GetMediaStatusRequestBody getMediaStatusRequestBody2 = getMediaStatusRequestBody;
            GetMediaStatusRequestBody.MediaKey.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMediaStatusRequestBody2.media_list);
            protoWriter.writeBytes(getMediaStatusRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("media_list")
    public final List<MediaKey> media_list;

    public static final class MediaKey extends Message<MediaKey, C877100Yay> {
        public static final ProtoAdapter<MediaKey> ADAPTER = new ProtoAdapter<MediaKey>() { // from class: X.0Yax
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final GetMediaStatusRequestBody.MediaKey decode(ProtoReader protoReader) {
                C877100Yay c877100Yay = new C877100Yay();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c877100Yay.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c877100Yay.LJ = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c877100Yay.LIZLLL = EnumC870720YDu.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c877100Yay.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c877100Yay.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(GetMediaStatusRequestBody.MediaKey mediaKey) {
                GetMediaStatusRequestBody.MediaKey mediaKey2 = mediaKey;
                return EnumC870720YDu.ADAPTER.encodedSizeWithTag(1, mediaKey2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, mediaKey2.id) + mediaKey2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, GetMediaStatusRequestBody.MediaKey mediaKey) {
                GetMediaStatusRequestBody.MediaKey mediaKey2 = mediaKey;
                EnumC870720YDu.ADAPTER.encodeWithTag(protoWriter, 1, mediaKey2.type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaKey2.id);
                protoWriter.writeBytes(mediaKey2.unknownFields());
            }
        };
        public static final EnumC870720YDu DEFAULT_TYPE = EnumC870720YDu.IMG;
        public static final long serialVersionUID = 0;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("type")
        public final EnumC870720YDu type;

        @Override // com.squareup.wire.Message
        public C877100Yay newBuilder() {
            C877100Yay c877100Yay = new C877100Yay();
            c877100Yay.LIZLLL = this.type;
            c877100Yay.LJ = this.id;
            c877100Yay.addUnknownFields(unknownFields());
            return c877100Yay;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            sb.replace(0, 2, "MediaKey{");
            sb.append('}');
            return sb.toString();
        }

        public MediaKey(EnumC870720YDu enumC870720YDu, String str) {
            this(enumC870720YDu, str, ByteString.EMPTY);
        }

        public MediaKey(EnumC870720YDu enumC870720YDu, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = enumC870720YDu;
            this.id = str;
        }
    }

    @Override // com.squareup.wire.Message
    public C0YHA newBuilder() {
        C0YHA c0yha = new C0YHA();
        c0yha.LIZLLL = C1516540pZE.LIZJ("media_list", this.media_list);
        c0yha.addUnknownFields(unknownFields());
        return c0yha;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MediaKey> list = this.media_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", media_list=");
            sb.append(this.media_list);
        }
        sb.replace(0, 2, "GetMediaStatusRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMediaStatusRequestBody(List<MediaKey> list) {
        this(list, ByteString.EMPTY);
    }

    public GetMediaStatusRequestBody(List<MediaKey> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.media_list = C1516540pZE.LJFF("media_list", list);
    }
}
