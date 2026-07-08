package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CC1;
import com.bytedance.im.core.proto.Config;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class Config extends Message<Config, C1CC1> {
    public static final ProtoAdapter<Config> ADAPTER = new ProtoAdapter<Config>() { // from class: X.1CC0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Config decode(ProtoReader protoReader) {
            C1CC1 c1cc1 = new C1CC1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cc1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cc1.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cc1.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cc1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(Config config) {
            Config config2 = config;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, config2.conf_name) + protoAdapter.encodedSizeWithTag(2, config2.conf_value) + config2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, Config config) {
            Config config2 = config;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, config2.conf_name);
            protoAdapter.encodeWithTag(protoWriter, 2, config2.conf_value);
            protoWriter.writeBytes(config2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conf_name")
    public final String conf_name;

    @C09CT("conf_value")
    public final String conf_value;

    @Override // com.squareup.wire.Message
    public C1CC1 newBuilder() {
        C1CC1 c1cc1 = new C1CC1();
        c1cc1.LIZLLL = this.conf_name;
        c1cc1.LJ = this.conf_value;
        c1cc1.addUnknownFields(unknownFields());
        return c1cc1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conf_name != null) {
            sb.append(", conf_name=");
            sb.append(this.conf_name);
        }
        if (this.conf_value != null) {
            sb.append(", conf_value=");
            sb.append(this.conf_value);
        }
        sb.replace(0, 2, "Config{");
        sb.append('}');
        return sb.toString();
    }

    public Config(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Config(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conf_name = str;
        this.conf_value = str2;
    }
}
