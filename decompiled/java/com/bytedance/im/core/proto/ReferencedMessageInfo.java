package com.bytedance.im.core.proto;

import X.C09CT;
import X.C870310YCf;
import android.os.Parcelable;
import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ReferencedMessageInfo extends AndroidMessage<ReferencedMessageInfo, C870310YCf> {
    public static final ProtoAdapter<ReferencedMessageInfo> ADAPTER;
    public static final Parcelable.Creator<ReferencedMessageInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX;
    public static final Long DEFAULT_ROOT_MESSAGE_ID;
    public static final long serialVersionUID = 0;

    @C09CT("hint")
    public final String hint;

    @C09CT("referenced_message_id")
    public final Long referenced_message_id;

    @C09CT("root_message_conv_index")
    public final Long root_message_conv_index;

    @C09CT("root_message_id")
    public final Long root_message_id;

    static {
        ProtoAdapter<ReferencedMessageInfo> protoAdapter = new ProtoAdapter<ReferencedMessageInfo>() { // from class: X.0YCe
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final ReferencedMessageInfo decode(ProtoReader protoReader) {
                C870310YCf c870310YCf = new C870310YCf();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                if (iNextTag != 3) {
                                    if (iNextTag != 4) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c870310YCf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c870310YCf.LJI = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c870310YCf.LJFF = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c870310YCf.LJ = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c870310YCf.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c870310YCf.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(ReferencedMessageInfo referencedMessageInfo) {
                ReferencedMessageInfo referencedMessageInfo2 = referencedMessageInfo;
                ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
                return protoAdapter2.encodedSizeWithTag(1, referencedMessageInfo2.referenced_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, referencedMessageInfo2.hint) + protoAdapter2.encodedSizeWithTag(3, referencedMessageInfo2.root_message_id) + protoAdapter2.encodedSizeWithTag(4, referencedMessageInfo2.root_message_conv_index) + referencedMessageInfo2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, ReferencedMessageInfo referencedMessageInfo) {
                ReferencedMessageInfo referencedMessageInfo2 = referencedMessageInfo;
                ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(protoWriter, 1, referencedMessageInfo2.referenced_message_id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, referencedMessageInfo2.hint);
                protoAdapter2.encodeWithTag(protoWriter, 3, referencedMessageInfo2.root_message_id);
                protoAdapter2.encodeWithTag(protoWriter, 4, referencedMessageInfo2.root_message_conv_index);
                protoWriter.writeBytes(referencedMessageInfo2.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        CREATOR = AndroidMessage.newCreator(protoAdapter);
        DEFAULT_REFERENCED_MESSAGE_ID = 0L;
        DEFAULT_ROOT_MESSAGE_ID = 0L;
        DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
    }

    @Override // com.squareup.wire.Message
    public C870310YCf newBuilder() {
        C870310YCf c870310YCf = new C870310YCf();
        c870310YCf.LIZLLL = this.referenced_message_id;
        c870310YCf.LJ = this.hint;
        c870310YCf.LJFF = this.root_message_id;
        c870310YCf.LJI = this.root_message_conv_index;
        c870310YCf.addUnknownFields(unknownFields());
        return c870310YCf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", referenced_message_id=");
        sb.append(this.referenced_message_id);
        sb.append(", hint=");
        sb.append(this.hint);
        if (this.root_message_id != null) {
            sb.append(", root_message_id=");
            sb.append(this.root_message_id);
        }
        if (this.root_message_conv_index != null) {
            sb.append(", root_message_conv_index=");
            sb.append(this.root_message_conv_index);
        }
        sb.replace(0, 2, "ReferencedMessageInfo{");
        sb.append('}');
        return sb.toString();
    }

    public ReferencedMessageInfo(Long l, String str, Long l2, Long l3) {
        this(l, str, l2, l3, ByteString.EMPTY);
    }

    public ReferencedMessageInfo(Long l, String str, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.referenced_message_id = l;
        this.hint = str;
        this.root_message_id = l2;
        this.root_message_conv_index = l3;
    }
}
