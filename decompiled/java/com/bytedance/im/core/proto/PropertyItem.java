package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YVX;
import com.bytedance.im.core.proto.PropertyItem;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class PropertyItem extends Message<PropertyItem, C0YVX> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_extra")
    public final ByteString biz_extra;

    @C09CT("create_time")
    public final Long create_time;

    @C09CT("create_time_micro")
    public final Long create_time_micro;

    @C09CT("idempotent_id")
    public final String idempotent_id;

    @C09CT("sec_uid")
    public final String sec_uid;

    @C09CT("uid")
    public final Long uid;

    @C09CT("value")
    public final String value;
    public static final ProtoAdapter<PropertyItem> ADAPTER = new ProtoAdapter<PropertyItem>() { // from class: X.0YVW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PropertyItem decode(ProtoReader protoReader) {
            C0YVX c0yvx = new C0YVX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yvx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c0yvx.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c0yvx.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yvx.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0yvx.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c0yvx.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c0yvx.LJIIIZ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yvx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yvx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PropertyItem propertyItem) {
            PropertyItem propertyItem2 = propertyItem;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, propertyItem2.uid);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, propertyItem2.sec_uid) + protoAdapter.encodedSizeWithTag(3, propertyItem2.create_time) + protoAdapter2.encodedSizeWithTag(4, propertyItem2.idempotent_id) + protoAdapter2.encodedSizeWithTag(5, propertyItem2.value) + protoAdapter.encodedSizeWithTag(6, propertyItem2.create_time_micro) + ProtoAdapter.BYTES.encodedSizeWithTag(7, propertyItem2.biz_extra) + propertyItem2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PropertyItem propertyItem) {
            PropertyItem propertyItem2 = propertyItem;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, propertyItem2.uid);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, propertyItem2.sec_uid);
            protoAdapter.encodeWithTag(protoWriter, 3, propertyItem2.create_time);
            protoAdapter2.encodeWithTag(protoWriter, 4, propertyItem2.idempotent_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, propertyItem2.value);
            protoAdapter.encodeWithTag(protoWriter, 6, propertyItem2.create_time_micro);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, propertyItem2.biz_extra);
            protoWriter.writeBytes(propertyItem2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_CREATE_TIME_MICRO = 0L;
    public static final ByteString DEFAULT_BIZ_EXTRA = ByteString.EMPTY;

    @Override // com.squareup.wire.Message
    public C0YVX newBuilder() {
        C0YVX c0yvx = new C0YVX();
        c0yvx.LIZLLL = this.uid;
        c0yvx.LJ = this.sec_uid;
        c0yvx.LJFF = this.create_time;
        c0yvx.LJI = this.idempotent_id;
        c0yvx.LJII = this.value;
        c0yvx.LJIIIIZZ = this.create_time_micro;
        c0yvx.LJIIIZ = this.biz_extra;
        c0yvx.addUnknownFields(unknownFields());
        return c0yvx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.create_time_micro != null) {
            sb.append(", create_time_micro=");
            sb.append(this.create_time_micro);
        }
        if (this.biz_extra != null) {
            sb.append(", biz_extra=");
            sb.append(this.biz_extra);
        }
        sb.replace(0, 2, "PropertyItem{");
        sb.append('}');
        return sb.toString();
    }

    public PropertyItem(Long l, String str, Long l2, String str2, String str3, Long l3, ByteString byteString) {
        this(l, str, l2, str2, str3, l3, byteString, ByteString.EMPTY);
    }

    public PropertyItem(Long l, String str, Long l2, String str2, String str3, Long l3, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.uid = l;
        this.sec_uid = str;
        this.create_time = l2;
        this.idempotent_id = str2;
        this.value = str3;
        this.create_time_micro = l3;
        this.biz_extra = byteString;
    }
}
