package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1DBE;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class BatchSetConversationSettingInfoResponseBody extends Message<BatchSetConversationSettingInfoResponseBody, C1DBE> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("failed_list")
    public final List<SetConversationSettingInfoResponseBody> failed_list;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("success_list")
    public final List<SetConversationSettingInfoResponseBody> success_list;
    public static final ProtoAdapter<BatchSetConversationSettingInfoResponseBody> ADAPTER = new ProtoAdapter<BatchSetConversationSettingInfoResponseBody>() { // from class: X.1DBD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchSetConversationSettingInfoResponseBody decode(ProtoReader protoReader) {
            C1DBE c1dbe = new C1DBE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dbe.LIZLLL.add(SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c1dbe.LJ.add(SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c1dbe.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1dbe.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1dbe.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1dbe.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dbe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody) {
            BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody2 = batchSetConversationSettingInfoResponseBody;
            ProtoAdapter<SetConversationSettingInfoResponseBody> protoAdapter = SetConversationSettingInfoResponseBody.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, batchSetConversationSettingInfoResponseBody2.success_list) + protoAdapter.asRepeated().encodedSizeWithTag(2, batchSetConversationSettingInfoResponseBody2.failed_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, batchSetConversationSettingInfoResponseBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(4, batchSetConversationSettingInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, batchSetConversationSettingInfoResponseBody2.check_message) + protoAdapter2.encodedSizeWithTag(6, batchSetConversationSettingInfoResponseBody2.extra_info) + batchSetConversationSettingInfoResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody) {
            BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody2 = batchSetConversationSettingInfoResponseBody;
            ProtoAdapter<SetConversationSettingInfoResponseBody> protoAdapter = SetConversationSettingInfoResponseBody.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, batchSetConversationSettingInfoResponseBody2.success_list);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, batchSetConversationSettingInfoResponseBody2.failed_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, batchSetConversationSettingInfoResponseBody2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, batchSetConversationSettingInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 5, batchSetConversationSettingInfoResponseBody2.check_message);
            protoAdapter2.encodeWithTag(protoWriter, 6, batchSetConversationSettingInfoResponseBody2.extra_info);
            protoWriter.writeBytes(batchSetConversationSettingInfoResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C1DBE newBuilder() {
        C1DBE c1dbe = new C1DBE();
        c1dbe.LIZLLL = C1516540pZE.LIZJ("success_list", this.success_list);
        c1dbe.LJ = C1516540pZE.LIZJ("failed_list", this.failed_list);
        c1dbe.LJFF = this.status;
        c1dbe.LJI = this.check_code;
        c1dbe.LJII = this.check_message;
        c1dbe.LJIIIIZZ = this.extra_info;
        c1dbe.addUnknownFields(unknownFields());
        return c1dbe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<SetConversationSettingInfoResponseBody> list = this.success_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", success_list=");
            sb.append(this.success_list);
        }
        List<SetConversationSettingInfoResponseBody> list2 = this.failed_list;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", failed_list=");
            sb.append(this.failed_list);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        sb.replace(0, 2, "BatchSetConversationSettingInfoResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchSetConversationSettingInfoResponseBody(List<SetConversationSettingInfoResponseBody> list, List<SetConversationSettingInfoResponseBody> list2, Integer num, Long l, String str, String str2) {
        this(list, list2, num, l, str, str2, ByteString.EMPTY);
    }

    public BatchSetConversationSettingInfoResponseBody(List<SetConversationSettingInfoResponseBody> list, List<SetConversationSettingInfoResponseBody> list2, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_list = C1516540pZE.LJFF("success_list", list);
        this.failed_list = C1516540pZE.LJFF("failed_list", list2);
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
