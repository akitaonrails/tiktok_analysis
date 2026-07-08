package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YUT;
import X.C872750YLp;
import android.os.Parcelable;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ReferenceInfo extends AndroidMessage<ReferenceInfo, C872750YLp> {
    public static final ProtoAdapter<ReferenceInfo> ADAPTER;
    public static final Parcelable.Creator<ReferenceInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID;
    public static final C0YUT DEFAULT_REFERENCED_MESSAGE_STATUS;
    public static final Long DEFAULT_REF_MESSAGE_TYPE;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX;
    public static final Long DEFAULT_ROOT_MESSAGE_ID;
    public static final Long DEFAULT_SENDER;
    public static final long serialVersionUID = 0;

    @C09CT("fallback_text")
    public final String fallback_text;

    @C09CT("hint")
    public final String hint;

    @C09CT("ref_message_type")
    public final Long ref_message_type;

    @C09CT("referenced_message_id")
    public final Long referenced_message_id;

    @C09CT("referenced_message_scene")
    public final String referenced_message_scene;

    @C09CT("referenced_message_status")
    public final C0YUT referenced_message_status;

    @C09CT("root_message_conv_index")
    public final Long root_message_conv_index;

    @C09CT("root_message_id")
    public final Long root_message_id;

    @C09CT("sender")
    public final Long sender;

    static {
        ProtoAdapter<ReferenceInfo> protoAdapter = new ProtoAdapter<ReferenceInfo>() { // from class: X.0YLo
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final ReferenceInfo decode(ProtoReader protoReader) {
                C872750YLp c872750YLp = new C872750YLp();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                c872750YLp.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 2:
                                c872750YLp.LJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c872750YLp.LJFF = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                try {
                                    c872750YLp.LJI = C0YUT.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c872750YLp.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                break;
                            case 5:
                                c872750YLp.LJII = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                c872750YLp.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                c872750YLp.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 8:
                                c872750YLp.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c872750YLp.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c872750YLp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c872750YLp.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(ReferenceInfo referenceInfo) {
                ReferenceInfo referenceInfo2 = referenceInfo;
                ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
                int iEncodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, referenceInfo2.referenced_message_id);
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter3.encodedSizeWithTag(2, referenceInfo2.hint) + protoAdapter2.encodedSizeWithTag(3, referenceInfo2.ref_message_type) + C0YUT.ADAPTER.encodedSizeWithTag(4, referenceInfo2.referenced_message_status) + protoAdapter2.encodedSizeWithTag(5, referenceInfo2.root_message_id) + protoAdapter2.encodedSizeWithTag(6, referenceInfo2.root_message_conv_index) + protoAdapter2.encodedSizeWithTag(7, referenceInfo2.sender) + protoAdapter3.encodedSizeWithTag(8, referenceInfo2.referenced_message_scene) + protoAdapter3.encodedSizeWithTag(9, referenceInfo2.fallback_text) + referenceInfo2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, ReferenceInfo referenceInfo) {
                ReferenceInfo referenceInfo2 = referenceInfo;
                ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(protoWriter, 1, referenceInfo2.referenced_message_id);
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(protoWriter, 2, referenceInfo2.hint);
                protoAdapter2.encodeWithTag(protoWriter, 3, referenceInfo2.ref_message_type);
                C0YUT.ADAPTER.encodeWithTag(protoWriter, 4, referenceInfo2.referenced_message_status);
                protoAdapter2.encodeWithTag(protoWriter, 5, referenceInfo2.root_message_id);
                protoAdapter2.encodeWithTag(protoWriter, 6, referenceInfo2.root_message_conv_index);
                protoAdapter2.encodeWithTag(protoWriter, 7, referenceInfo2.sender);
                protoAdapter3.encodeWithTag(protoWriter, 8, referenceInfo2.referenced_message_scene);
                protoAdapter3.encodeWithTag(protoWriter, 9, referenceInfo2.fallback_text);
                protoWriter.writeBytes(referenceInfo2.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        CREATOR = AndroidMessage.newCreator(protoAdapter);
        DEFAULT_REFERENCED_MESSAGE_ID = 0L;
        DEFAULT_REF_MESSAGE_TYPE = 0L;
        DEFAULT_REFERENCED_MESSAGE_STATUS = C0YUT.AVAILABLE;
        DEFAULT_ROOT_MESSAGE_ID = 0L;
        DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
        DEFAULT_SENDER = 0L;
    }

    @Override // com.squareup.wire.Message
    public C872750YLp newBuilder() {
        C872750YLp c872750YLp = new C872750YLp();
        c872750YLp.LIZLLL = this.referenced_message_id;
        c872750YLp.LJ = this.hint;
        c872750YLp.LJFF = this.ref_message_type;
        c872750YLp.LJI = this.referenced_message_status;
        c872750YLp.LJII = this.root_message_id;
        c872750YLp.LJIIIIZZ = this.root_message_conv_index;
        c872750YLp.LJIIIZ = this.sender;
        c872750YLp.LJIIJ = this.referenced_message_scene;
        c872750YLp.LJIIJJI = this.fallback_text;
        c872750YLp.addUnknownFields(unknownFields());
        return c872750YLp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", referenced_message_id=");
        sb.append(this.referenced_message_id);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", ref_message_type=");
        sb.append(this.ref_message_type);
        sb.append(", referenced_message_status=");
        sb.append(this.referenced_message_status);
        if (this.root_message_id != null) {
            sb.append(", root_message_id=");
            sb.append(this.root_message_id);
        }
        if (this.root_message_conv_index != null) {
            sb.append(", root_message_conv_index=");
            sb.append(this.root_message_conv_index);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.referenced_message_scene != null) {
            sb.append(", referenced_message_scene=");
            sb.append(this.referenced_message_scene);
        }
        if (this.fallback_text != null) {
            sb.append(", fallback_text=");
            sb.append(this.fallback_text);
        }
        sb.replace(0, 2, "ReferenceInfo{");
        sb.append('}');
        return sb.toString();
    }

    public ReferenceInfo(Long l, String str, Long l2, C0YUT c0yut, Long l3, Long l4, Long l5, String str2, String str3) {
        this(l, str, l2, c0yut, l3, l4, l5, str2, str3, ByteString.EMPTY);
    }

    public ReferenceInfo(Long l, String str, Long l2, C0YUT c0yut, Long l3, Long l4, Long l5, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.referenced_message_id = l;
        this.hint = str;
        this.ref_message_type = l2;
        this.referenced_message_status = c0yut;
        this.root_message_id = l3;
        this.root_message_conv_index = l4;
        this.sender = l5;
        this.referenced_message_scene = str2;
        this.fallback_text = str3;
    }
}
