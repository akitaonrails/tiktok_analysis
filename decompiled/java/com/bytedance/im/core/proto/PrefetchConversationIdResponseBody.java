package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YS3;
import X.C1516540pZE;
import X.EnumC868900Y6u;
import com.bytedance.im.core.proto.PrefetchConversationIdResponseBody;
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
public final class PrefetchConversationIdResponseBody extends Message<PrefetchConversationIdResponseBody, C0YS3> {
    public static final long serialVersionUID = 0;

    @C09CT("capacity")
    public final Integer capacity;

    @C09CT("conversation_short_ids")
    public final List<Long> conversation_short_ids;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final EnumC868900Y6u status;

    @C09CT("threshold")
    public final Integer threshold;
    public static final ProtoAdapter<PrefetchConversationIdResponseBody> ADAPTER = new ProtoAdapter<PrefetchConversationIdResponseBody>() { // from class: X.0YS2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PrefetchConversationIdResponseBody decode(ProtoReader protoReader) {
            C0YS3 c0ys3 = new C0YS3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0ys3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c0ys3.LJI = EnumC868900Y6u.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c0ys3.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c0ys3.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c0ys3.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0ys3.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ys3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PrefetchConversationIdResponseBody prefetchConversationIdResponseBody) {
            PrefetchConversationIdResponseBody prefetchConversationIdResponseBody2 = prefetchConversationIdResponseBody;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, prefetchConversationIdResponseBody2.conversation_short_ids);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, prefetchConversationIdResponseBody2.capacity) + protoAdapter.encodedSizeWithTag(3, prefetchConversationIdResponseBody2.threshold) + EnumC868900Y6u.ADAPTER.encodedSizeWithTag(4, prefetchConversationIdResponseBody2.status) + prefetchConversationIdResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PrefetchConversationIdResponseBody prefetchConversationIdResponseBody) {
            PrefetchConversationIdResponseBody prefetchConversationIdResponseBody2 = prefetchConversationIdResponseBody;
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, prefetchConversationIdResponseBody2.conversation_short_ids);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, prefetchConversationIdResponseBody2.capacity);
            protoAdapter.encodeWithTag(protoWriter, 3, prefetchConversationIdResponseBody2.threshold);
            EnumC868900Y6u.ADAPTER.encodeWithTag(protoWriter, 4, prefetchConversationIdResponseBody2.status);
            protoWriter.writeBytes(prefetchConversationIdResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CAPACITY = 0;
    public static final Integer DEFAULT_THRESHOLD = 0;
    public static final EnumC868900Y6u DEFAULT_STATUS = EnumC868900Y6u.READ_ONLY;

    @Override // com.squareup.wire.Message
    public C0YS3 newBuilder() {
        C0YS3 c0ys3 = new C0YS3();
        c0ys3.LIZLLL = C1516540pZE.LIZJ("conversation_short_ids", this.conversation_short_ids);
        c0ys3.LJ = this.capacity;
        c0ys3.LJFF = this.threshold;
        c0ys3.LJI = this.status;
        c0ys3.addUnknownFields(unknownFields());
        return c0ys3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_short_ids=");
            sb.append(this.conversation_short_ids);
        }
        if (this.capacity != null) {
            sb.append(", capacity=");
            sb.append(this.capacity);
        }
        if (this.threshold != null) {
            sb.append(", threshold=");
            sb.append(this.threshold);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        sb.replace(0, 2, "PrefetchConversationIdResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public PrefetchConversationIdResponseBody(List<Long> list, Integer num, Integer num2, EnumC868900Y6u enumC868900Y6u) {
        this(list, num, num2, enumC868900Y6u, ByteString.EMPTY);
    }

    public PrefetchConversationIdResponseBody(List<Long> list, Integer num, Integer num2, EnumC868900Y6u enumC868900Y6u, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_ids = C1516540pZE.LJFF("conversation_short_ids", list);
        this.capacity = num;
        this.threshold = num2;
        this.status = enumC868900Y6u;
    }
}
