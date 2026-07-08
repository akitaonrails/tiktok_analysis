package com.bytedance.im.core.proto;

import X.C09CT;
import X.C872970YMl;
import X.EnumC869400Y8s;
import com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessagesCheckInfoV2RequestBody extends Message<GetMessagesCheckInfoV2RequestBody, C872970YMl> {
    public static final ProtoAdapter<GetMessagesCheckInfoV2RequestBody> ADAPTER = new ProtoAdapter<GetMessagesCheckInfoV2RequestBody>() { // from class: X.0YMm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesCheckInfoV2RequestBody decode(ProtoReader protoReader) {
            C872970YMl c872970YMl = new C872970YMl();
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
                                        c872970YMl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c872970YMl.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c872970YMl.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                try {
                                    c872970YMl.LJFF = EnumC869400Y8s.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c872970YMl.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c872970YMl.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c872970YMl.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c872970YMl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody) {
            GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody2 = getMessagesCheckInfoV2RequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, getMessagesCheckInfoV2RequestBody2.conv_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getMessagesCheckInfoV2RequestBody2.conv_id) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(3, getMessagesCheckInfoV2RequestBody2.conv_type) + protoAdapter.encodedSizeWithTag(4, getMessagesCheckInfoV2RequestBody2.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(5, getMessagesCheckInfoV2RequestBody2.limit) + getMessagesCheckInfoV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody) {
            GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody2 = getMessagesCheckInfoV2RequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, getMessagesCheckInfoV2RequestBody2.conv_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMessagesCheckInfoV2RequestBody2.conv_id);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 3, getMessagesCheckInfoV2RequestBody2.conv_type);
            protoAdapter.encodeWithTag(protoWriter, 4, getMessagesCheckInfoV2RequestBody2.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getMessagesCheckInfoV2RequestBody2.limit);
            protoWriter.writeBytes(getMessagesCheckInfoV2RequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final EnumC869400Y8s DEFAULT_CONV_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conv_id")
    public final String conv_id;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("conv_type")
    public final EnumC869400Y8s conv_type;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    public C872970YMl newBuilder() {
        C872970YMl c872970YMl = new C872970YMl();
        c872970YMl.LIZLLL = this.conv_short_id;
        c872970YMl.LJ = this.conv_id;
        c872970YMl.LJFF = this.conv_type;
        c872970YMl.LJI = this.cursor;
        c872970YMl.LJII = this.limit;
        c872970YMl.addUnknownFields(unknownFields());
        return c872970YMl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conv_id != null) {
            sb.append(", conv_id=");
            sb.append(this.conv_id);
        }
        if (this.conv_type != null) {
            sb.append(", conv_type=");
            sb.append(this.conv_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        sb.replace(0, 2, "GetMessagesCheckInfoV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagesCheckInfoV2RequestBody(Long l, String str, EnumC869400Y8s enumC869400Y8s, Long l2, Integer num) {
        this(l, str, enumC869400Y8s, l2, num, ByteString.EMPTY);
    }

    public GetMessagesCheckInfoV2RequestBody(Long l, String str, EnumC869400Y8s enumC869400Y8s, Long l2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conv_short_id = l;
        this.conv_id = str;
        this.conv_type = enumC869400Y8s;
        this.cursor = l2;
        this.limit = num;
    }
}
