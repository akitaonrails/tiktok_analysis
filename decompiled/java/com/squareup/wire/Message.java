package com.squareup.wire;

import X.C1496690p3D;
import X.InterfaceC1496780p3M;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient ProtoAdapter<M> adapter;
    public transient int cachedSerializedSize;
    public transient int hashCode;
    public final transient ByteString unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        public transient ByteString LIZ = ByteString.EMPTY;
        public transient C1496690p3D LIZIZ;
        public transient ProtoWriter LIZJ;

        public abstract M build();

        public final void LIZ() {
            if (this.LIZIZ == null) {
                C1496690p3D c1496690p3D = new C1496690p3D();
                this.LIZIZ = c1496690p3D;
                ProtoWriter protoWriter = new ProtoWriter(c1496690p3D);
                this.LIZJ = protoWriter;
                try {
                    protoWriter.writeBytes(this.LIZ);
                    this.LIZ = ByteString.EMPTY;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new AssertionError();
                }
            }
        }

        public final ByteString buildUnknownFields() {
            C1496690p3D c1496690p3D = this.LIZIZ;
            if (c1496690p3D != null) {
                this.LIZ = c1496690p3D.LJIJJ();
                this.LIZIZ = null;
                this.LIZJ = null;
            }
            return this.LIZ;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.LIZ = ByteString.EMPTY;
            C1496690p3D c1496690p3D = this.LIZIZ;
            if (c1496690p3D != null) {
                c1496690p3D.LIZ();
                this.LIZIZ = null;
            }
            this.LIZJ = null;
            return this;
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
            if (byteString.size() > 0) {
                LIZ();
                try {
                    this.LIZJ.writeBytes(byteString);
                    return this;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            LIZ();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.LIZJ, i, obj);
                return this;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError();
            }
        }
    }

    public abstract Builder<M, B> newBuilder();

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.EMPTY : byteString;
    }

    public final Object writeReplace() {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final M withoutUnknownFields() {
        Builder<M, B> builderNewBuilder = newBuilder();
        builderNewBuilder.clearUnknownFields();
        return (M) builderNewBuilder.build();
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(InterfaceC1496780p3M interfaceC1496780p3M) {
        this.adapter.encode(interfaceC1496780p3M, this);
    }

    public final void encode(OutputStream outputStream) {
        this.adapter.encode(outputStream, this);
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter != null) {
            if (byteString != null) {
                this.adapter = protoAdapter;
                this.unknownFields = byteString;
                return;
            }
            throw new NullPointerException("unknownFields == null");
        }
        throw new NullPointerException("adapter == null");
    }
}
