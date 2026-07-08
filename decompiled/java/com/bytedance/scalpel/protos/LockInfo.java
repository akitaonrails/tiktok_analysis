package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C9L;
import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class LockInfo extends Message<LockInfo, C1C9L> {
    public static final ProtoAdapter<LockInfo> ADAPTER = new ProtoAdapter<LockInfo>() { // from class: X.1C9K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LockInfo decode(ProtoReader protoReader) {
            return new C1C9L().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(LockInfo lockInfo) {
            LockInfo lockInfo2 = lockInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, lockInfo2.waiterStack) + protoAdapter.encodedSizeWithTag(2, lockInfo2.ownerThread) + protoAdapter.encodedSizeWithTag(3, lockInfo2.ownerStack) + TimeInfo.ADAPTER.encodedSizeWithTag(4, lockInfo2.timeInfo) + protoAdapter.encodedSizeWithTag(5, lockInfo2.extra) + MethodStack.ADAPTER.encodedSizeWithTag(6, lockInfo2.stack) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, lockInfo2.timeStampRange) + lockInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, LockInfo lockInfo) {
            LockInfo lockInfo2 = lockInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, lockInfo2.waiterStack);
            protoAdapter.encodeWithTag(protoWriter, 2, lockInfo2.ownerThread);
            protoAdapter.encodeWithTag(protoWriter, 3, lockInfo2.ownerStack);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 4, lockInfo2.timeInfo);
            protoAdapter.encodeWithTag(protoWriter, 5, lockInfo2.extra);
            MethodStack.ADAPTER.encodeWithTag(protoWriter, 6, lockInfo2.stack);
            TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, lockInfo2.timeStampRange);
            protoWriter.writeBytes(lockInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    @C09CT("extra")
    public String extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    @C09CT("owner_stack")
    public String ownerStack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    @C09CT("owner_thread")
    public String ownerThread;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 6)
    @C09CT("stack")
    public MethodStack stack;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    @C09CT("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @C09CT("time_stamp_range")
    public TimeStampRange timeStampRange;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("waiter_stack")
    public String waiterStack;

    @Override // com.squareup.wire.Message
    public C1C9L newBuilder() {
        C1C9L c1c9l = new C1C9L();
        c1c9l.LIZLLL = this.waiterStack;
        c1c9l.LJ = this.ownerThread;
        c1c9l.LJFF = this.ownerStack;
        c1c9l.LJI = this.timeInfo;
        c1c9l.LJII = this.extra;
        c1c9l.LJIIIIZZ = this.stack;
        c1c9l.LJIIIZ = this.timeStampRange;
        c1c9l.addUnknownFields(unknownFields());
        return c1c9l;
    }

    public LockInfo(String str, String str2, String str3, TimeInfo timeInfo, String str4, MethodStack methodStack, TimeStampRange timeStampRange, ByteString byteString) {
        super(ADAPTER, byteString);
        this.waiterStack = str;
        this.ownerThread = str2;
        this.ownerStack = str3;
        this.timeInfo = timeInfo;
        this.extra = str4;
        this.stack = methodStack;
        this.timeStampRange = timeStampRange;
    }
}
