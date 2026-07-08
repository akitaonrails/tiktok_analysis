package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YFV;
import X.C0YO7;
import X.C1516540pZE;
import com.bytedance.im.core.proto.CheckStatusMessagesRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class CheckStatusMessagesRequestBody extends Message<CheckStatusMessagesRequestBody, C0YO7> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor_type")
    public final C0YFV cursor_type;

    @C09CT("end_cursor")
    public final Long end_cursor;

    @C09CT("expected_ids")
    public final List<Long> expected_ids;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("start_cursor")
    public final Long start_cursor;
    public static final ProtoAdapter<CheckStatusMessagesRequestBody> ADAPTER = new ProtoAdapter<CheckStatusMessagesRequestBody>() { // from class: X.0YO8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CheckStatusMessagesRequestBody decode(ProtoReader protoReader) {
            C0YO7 c0yo7 = new C0YO7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yo7.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0yo7.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0yo7.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yo7.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c0yo7.LJII.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            try {
                                c0yo7.LJIIIIZZ = C0YFV.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0yo7.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yo7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yo7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CheckStatusMessagesRequestBody checkStatusMessagesRequestBody) {
            CheckStatusMessagesRequestBody checkStatusMessagesRequestBody2 = checkStatusMessagesRequestBody;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, checkStatusMessagesRequestBody2.inbox_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, checkStatusMessagesRequestBody2.start_cursor) + protoAdapter2.encodedSizeWithTag(3, checkStatusMessagesRequestBody2.end_cursor) + protoAdapter.encodedSizeWithTag(4, checkStatusMessagesRequestBody2.limit) + protoAdapter2.asRepeated().encodedSizeWithTag(5, checkStatusMessagesRequestBody2.expected_ids) + C0YFV.ADAPTER.encodedSizeWithTag(6, checkStatusMessagesRequestBody2.cursor_type) + checkStatusMessagesRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CheckStatusMessagesRequestBody checkStatusMessagesRequestBody) {
            CheckStatusMessagesRequestBody checkStatusMessagesRequestBody2 = checkStatusMessagesRequestBody;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, checkStatusMessagesRequestBody2.inbox_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, checkStatusMessagesRequestBody2.start_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 3, checkStatusMessagesRequestBody2.end_cursor);
            protoAdapter.encodeWithTag(protoWriter, 4, checkStatusMessagesRequestBody2.limit);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, checkStatusMessagesRequestBody2.expected_ids);
            C0YFV.ADAPTER.encodeWithTag(protoWriter, 6, checkStatusMessagesRequestBody2.cursor_type);
            protoWriter.writeBytes(checkStatusMessagesRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_START_CURSOR = 0L;
    public static final Long DEFAULT_END_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 50;
    public static final C0YFV DEFAULT_CURSOR_TYPE = C0YFV.CURSOR_TYPE_USER_MSG_CHAIN;

    @Override // com.squareup.wire.Message
    public C0YO7 newBuilder() {
        C0YO7 c0yo7 = new C0YO7();
        c0yo7.LIZLLL = this.inbox_type;
        c0yo7.LJ = this.start_cursor;
        c0yo7.LJFF = this.end_cursor;
        c0yo7.LJI = this.limit;
        c0yo7.LJII = C1516540pZE.LIZJ("expected_ids", this.expected_ids);
        c0yo7.LJIIIIZZ = this.cursor_type;
        c0yo7.addUnknownFields(unknownFields());
        return c0yo7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.start_cursor != null) {
            sb.append(", start_cursor=");
            sb.append(this.start_cursor);
        }
        if (this.end_cursor != null) {
            sb.append(", end_cursor=");
            sb.append(this.end_cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        List<Long> list = this.expected_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", expected_ids=");
            sb.append(this.expected_ids);
        }
        if (this.cursor_type != null) {
            sb.append(", cursor_type=");
            sb.append(this.cursor_type);
        }
        sb.replace(0, 2, "CheckStatusMessagesRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public CheckStatusMessagesRequestBody(Integer num, Long l, Long l2, Integer num2, List<Long> list, C0YFV c0yfv) {
        this(num, l, l2, num2, list, c0yfv, ByteString.EMPTY);
    }

    public CheckStatusMessagesRequestBody(Integer num, Long l, Long l2, Integer num2, List<Long> list, C0YFV c0yfv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.start_cursor = l;
        this.end_cursor = l2;
        this.limit = num2;
        this.expected_ids = C1516540pZE.LJFF("expected_ids", list);
        this.cursor_type = c0yfv;
    }
}
