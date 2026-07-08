package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C872680YLi;
import X.EnumC870720YDu;
import com.bytedance.im.core.proto.MediaInfo;
import com.bytedance.im.core.proto.MediaURLStruct;
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
public final class MediaInfo extends Message<MediaInfo, C872680YLi> {
    public static final ProtoAdapter<MediaInfo> ADAPTER = new ProtoAdapter<MediaInfo>() { // from class: X.0YLh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MediaInfo decode(ProtoReader protoReader) {
            C872680YLi c872680YLi = new C872680YLi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 20) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c872680YLi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c872680YLi.LJI.add(MediaURLStruct.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c872680YLi.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c872680YLi.LJ = EnumC870720YDu.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c872680YLi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c872680YLi.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c872680YLi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MediaInfo mediaInfo) {
            MediaInfo mediaInfo2 = mediaInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, mediaInfo2.id) + EnumC870720YDu.ADAPTER.encodedSizeWithTag(2, mediaInfo2.type) + protoAdapter.encodedSizeWithTag(3, mediaInfo2.decrypt_key) + MediaURLStruct.ADAPTER.asRepeated().encodedSizeWithTag(20, mediaInfo2.url_info_list) + mediaInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MediaInfo mediaInfo) {
            MediaInfo mediaInfo2 = mediaInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, mediaInfo2.id);
            EnumC870720YDu.ADAPTER.encodeWithTag(protoWriter, 2, mediaInfo2.type);
            protoAdapter.encodeWithTag(protoWriter, 3, mediaInfo2.decrypt_key);
            MediaURLStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, mediaInfo2.url_info_list);
            protoWriter.writeBytes(mediaInfo2.unknownFields());
        }
    };
    public static final EnumC870720YDu DEFAULT_TYPE = EnumC870720YDu.IMG;
    public static final long serialVersionUID = 0;

    @C09CT("decrypt_key")
    public final String decrypt_key;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final EnumC870720YDu type;

    @C09CT("url_info_list")
    public final List<MediaURLStruct> url_info_list;

    @Override // com.squareup.wire.Message
    public C872680YLi newBuilder() {
        C872680YLi c872680YLi = new C872680YLi();
        c872680YLi.LIZLLL = this.id;
        c872680YLi.LJ = this.type;
        c872680YLi.LJFF = this.decrypt_key;
        c872680YLi.LJI = C1516540pZE.LIZJ("url_info_list", this.url_info_list);
        c872680YLi.addUnknownFields(unknownFields());
        return c872680YLi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.decrypt_key != null) {
            sb.append(", decrypt_key=");
            sb.append(this.decrypt_key);
        }
        List<MediaURLStruct> list = this.url_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", url_info_list=");
            sb.append(this.url_info_list);
        }
        sb.replace(0, 2, "MediaInfo{");
        sb.append('}');
        return sb.toString();
    }

    public MediaInfo(String str, EnumC870720YDu enumC870720YDu, String str2, List<MediaURLStruct> list) {
        this(str, enumC870720YDu, str2, list, ByteString.EMPTY);
    }

    public MediaInfo(String str, EnumC870720YDu enumC870720YDu, String str2, List<MediaURLStruct> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = enumC870720YDu;
        this.decrypt_key = str2;
        this.url_info_list = C1516540pZE.LJFF("url_info_list", list);
    }
}
