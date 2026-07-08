package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1516540pZE;
import X.C1C94;
import X.C2225621C8y;
import com.bytedance.scalpel.protos.BigJankMsg;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.bytedance.scene.Scene;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BigJankMsg extends Message<BigJankMsg, C1C94> {
    public static final ProtoAdapter<BigJankMsg> ADAPTER = new ProtoAdapter<BigJankMsg>() { // from class: X.1C93
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BigJankMsg decode(ProtoReader protoReader) {
            return new C1C94().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BigJankMsg bigJankMsg) {
            BigJankMsg bigJankMsg2 = bigJankMsg;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, bigJankMsg2.methodMapping) + BigJankMsg.MessageDispatch.ADAPTER.asRepeated().encodedSizeWithTag(2, bigJankMsg2.bigJankMsg) + bigJankMsg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BigJankMsg bigJankMsg) {
            BigJankMsg bigJankMsg2 = bigJankMsg;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bigJankMsg2.methodMapping);
            BigJankMsg.MessageDispatch.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, bigJankMsg2.bigJankMsg);
            protoWriter.writeBytes(bigJankMsg2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.scalpel.protos.BigJankMsg$MessageDispatch#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    @C09CT("big_jank_msg")
    public List<MessageDispatch> bigJankMsg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("method_mapping")
    public String methodMapping;

    public static final class MessageDispatch extends Message<MessageDispatch, C2225621C8y> {
        public static final ProtoAdapter<MessageDispatch> ADAPTER = new ProtoAdapter<MessageDispatch>() { // from class: X.1C8z
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final BigJankMsg.MessageDispatch decode(ProtoReader protoReader) {
                return new C2225621C8y().build();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(BigJankMsg.MessageDispatch messageDispatch) {
                BigJankMsg.MessageDispatch messageDispatch2 = messageDispatch;
                int iEncodedSizeWithTag = MethodStack.ADAPTER.asRepeated().encodedSizeWithTag(1, messageDispatch2.stacks) + ProtoAdapter.INT64.encodedSizeWithTag(2, messageDispatch2.intervalTime);
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, messageDispatch2.scene) + PerformanceInfo.ADAPTER.encodedSizeWithTag(4, messageDispatch2.performanceInfo) + TimeInfo.ADAPTER.encodedSizeWithTag(5, messageDispatch2.timeInfo) + protoAdapter.encodedSizeWithTag(6, messageDispatch2.customScene) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, messageDispatch2.timeStampRange) + messageDispatch2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, BigJankMsg.MessageDispatch messageDispatch) {
                BigJankMsg.MessageDispatch messageDispatch2 = messageDispatch;
                MethodStack.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messageDispatch2.stacks);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messageDispatch2.intervalTime);
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(protoWriter, 3, messageDispatch2.scene);
                PerformanceInfo.ADAPTER.encodeWithTag(protoWriter, 4, messageDispatch2.performanceInfo);
                TimeInfo.ADAPTER.encodeWithTag(protoWriter, 5, messageDispatch2.timeInfo);
                protoAdapter.encodeWithTag(protoWriter, 6, messageDispatch2.customScene);
                TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, messageDispatch2.timeStampRange);
                protoWriter.writeBytes(messageDispatch2.unknownFields());
            }
        };
        public static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
        @C09CT("custom_scene")
        public String customScene;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
        @C09CT("interval_time")
        public Long intervalTime;

        @WireField(adapter = "com.bytedance.scalpel.protos.PerformanceInfo#ADAPTER", tag = 4)
        @C09CT("performance_info")
        public PerformanceInfo performanceInfo;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
        @C09CT(Scene.SCENE_SERVICE)
        public String scene;

        @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
        @C09CT("stacks")
        public List<MethodStack> stacks;

        @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", tag = 5)
        @C09CT("time_info")
        public TimeInfo timeInfo;

        @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
        @C09CT("time_stamp_range")
        public TimeStampRange timeStampRange;

        @Override // com.squareup.wire.Message
        public C2225621C8y newBuilder() {
            C2225621C8y c2225621C8y = new C2225621C8y();
            c2225621C8y.LIZLLL = C1516540pZE.LIZJ("stacks", this.stacks);
            c2225621C8y.LJ = this.intervalTime;
            c2225621C8y.LJFF = this.scene;
            c2225621C8y.LJI = this.performanceInfo;
            c2225621C8y.LJII = this.timeInfo;
            c2225621C8y.LJIIIIZZ = this.customScene;
            c2225621C8y.LJIIIZ = this.timeStampRange;
            c2225621C8y.addUnknownFields(unknownFields());
            return c2225621C8y;
        }

        public MessageDispatch(List<MethodStack> list, Long l, String str, PerformanceInfo performanceInfo, TimeInfo timeInfo, String str2, TimeStampRange timeStampRange, ByteString byteString) {
            super(ADAPTER, byteString);
            this.stacks = C1516540pZE.LJFF("stacks", list);
            this.intervalTime = l;
            this.scene = str;
            this.performanceInfo = performanceInfo;
            this.timeInfo = timeInfo;
            this.customScene = str2;
            this.timeStampRange = timeStampRange;
        }
    }

    @Override // com.squareup.wire.Message
    public C1C94 newBuilder() {
        C1C94 c1c94 = new C1C94();
        c1c94.LIZLLL = this.methodMapping;
        c1c94.LJ = C1516540pZE.LIZJ("bigJankMsg", this.bigJankMsg);
        c1c94.addUnknownFields(unknownFields());
        return c1c94;
    }

    public BigJankMsg(String str, List<MessageDispatch> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.methodMapping = str;
        this.bigJankMsg = C1516540pZE.LJFF("bigJankMsg", list);
    }
}
