package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C9D;
import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MsgInfo extends Message<MsgInfo, C1C9D> {
    public static final ProtoAdapter<MsgInfo> ADAPTER = new ProtoAdapter<MsgInfo>() { // from class: X.1C9C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MsgInfo decode(ProtoReader protoReader) {
            return new C1C9D().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MsgInfo msgInfo) {
            MsgInfo msgInfo2 = msgInfo;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, msgInfo2.name) + ProtoAdapter.INT32.encodedSizeWithTag(2, msgInfo2.what) + TimeInfo.ADAPTER.encodedSizeWithTag(3, msgInfo2.timeInfo) + msgInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MsgInfo msgInfo) {
            MsgInfo msgInfo2 = msgInfo;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, msgInfo2.name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, msgInfo2.what);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 3, msgInfo2.timeInfo);
            protoWriter.writeBytes(msgInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("name")
    public String name;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    @C09CT("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    @C09CT("what")
    public Integer what;

    @Override // com.squareup.wire.Message
    public C1C9D newBuilder() {
        C1C9D c1c9d = new C1C9D();
        c1c9d.LIZLLL = this.name;
        c1c9d.LJ = this.what;
        c1c9d.LJFF = this.timeInfo;
        c1c9d.addUnknownFields(unknownFields());
        return c1c9d;
    }

    public MsgInfo(String str, Integer num, TimeInfo timeInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.what = num;
        this.timeInfo = timeInfo;
    }
}
