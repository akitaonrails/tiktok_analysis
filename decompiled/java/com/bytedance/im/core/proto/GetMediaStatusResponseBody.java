package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CGU;
import X.C1CGW;
import X.EnumC870720YDu;
import com.bytedance.im.core.proto.GetMediaStatusResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetMediaStatusResponseBody extends Message<GetMediaStatusResponseBody, C1CGW> {
    public static final ProtoAdapter<GetMediaStatusResponseBody> ADAPTER = new ProtoAdapter<GetMediaStatusResponseBody>() { // from class: X.1CGV
        public final ProtoAdapter<Map<String, GetMediaStatusResponseBody.MediaStatusInfo>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, GetMediaStatusResponseBody.MediaStatusInfo.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMediaStatusResponseBody decode(ProtoReader protoReader) {
            C1CGW c1cgw = new C1CGW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cgw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cgw.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMediaStatusResponseBody getMediaStatusResponseBody) {
            GetMediaStatusResponseBody getMediaStatusResponseBody2 = getMediaStatusResponseBody;
            return this.LIZ.encodedSizeWithTag(1, getMediaStatusResponseBody2.results) + getMediaStatusResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMediaStatusResponseBody getMediaStatusResponseBody) {
            GetMediaStatusResponseBody getMediaStatusResponseBody2 = getMediaStatusResponseBody;
            this.LIZ.encodeWithTag(protoWriter, 1, getMediaStatusResponseBody2.results);
            protoWriter.writeBytes(getMediaStatusResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("results")
    public final Map<String, MediaStatusInfo> results;

    public static final class MediaStatusInfo extends Message<MediaStatusInfo, C1CGU> {
        public static final ProtoAdapter<MediaStatusInfo> ADAPTER = new ProtoAdapter<MediaStatusInfo>() { // from class: X.1CGT
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final GetMediaStatusResponseBody.MediaStatusInfo decode(ProtoReader protoReader) {
                C1CGU c1cgu = new C1CGU();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cgu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cgu.LJ = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c1cgu.LIZLLL = EnumC870720YDu.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cgu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1cgu.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(GetMediaStatusResponseBody.MediaStatusInfo mediaStatusInfo) {
                GetMediaStatusResponseBody.MediaStatusInfo mediaStatusInfo2 = mediaStatusInfo;
                return EnumC870720YDu.ADAPTER.encodedSizeWithTag(1, mediaStatusInfo2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, mediaStatusInfo2.id) + mediaStatusInfo2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, GetMediaStatusResponseBody.MediaStatusInfo mediaStatusInfo) {
                GetMediaStatusResponseBody.MediaStatusInfo mediaStatusInfo2 = mediaStatusInfo;
                EnumC870720YDu.ADAPTER.encodeWithTag(protoWriter, 1, mediaStatusInfo2.type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaStatusInfo2.id);
                protoWriter.writeBytes(mediaStatusInfo2.unknownFields());
            }
        };
        public static final EnumC870720YDu DEFAULT_TYPE = EnumC870720YDu.IMG;
        public static final long serialVersionUID = 0;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("type")
        public final EnumC870720YDu type;

        @Override // com.squareup.wire.Message
        public C1CGU newBuilder() {
            C1CGU c1cgu = new C1CGU();
            c1cgu.LIZLLL = this.type;
            c1cgu.LJ = this.id;
            c1cgu.addUnknownFields(unknownFields());
            return c1cgu;
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
            sb.replace(0, 2, "MediaStatusInfo{");
            sb.append('}');
            return sb.toString();
        }

        public MediaStatusInfo(EnumC870720YDu enumC870720YDu, String str) {
            this(enumC870720YDu, str, ByteString.EMPTY);
        }

        public MediaStatusInfo(EnumC870720YDu enumC870720YDu, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = enumC870720YDu;
            this.id = str;
        }
    }

    @Override // com.squareup.wire.Message
    public C1CGW newBuilder() {
        C1CGW c1cgw = new C1CGW();
        c1cgw.LIZLLL = C1516540pZE.LIZLLL("results", this.results);
        c1cgw.addUnknownFields(unknownFields());
        return c1cgw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, MediaStatusInfo> map = this.results;
        if (map != null && !map.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        sb.replace(0, 2, "GetMediaStatusResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMediaStatusResponseBody(Map<String, MediaStatusInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMediaStatusResponseBody(Map<String, MediaStatusInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.results = C1516540pZE.LJI("results", map);
    }
}
