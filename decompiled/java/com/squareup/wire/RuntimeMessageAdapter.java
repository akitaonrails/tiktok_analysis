package com.squareup.wire;

import X.C1516540pZE;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends ProtoAdapter<M> {
    public final Class<M> LIZ;
    public final Class<B> LIZIZ;
    public final Map<Integer, FieldBinding<M, B>> LIZJ;

    public int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) {
        ProtoAdapter<?> protoAdapterLJ;
        try {
            B bNewInstance = this.LIZIZ.newInstance();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldBinding<M, B> fieldBinding = this.LIZJ.get(Integer.valueOf(iNextTag));
                    if (fieldBinding != null) {
                        try {
                            if (!fieldBinding.LIZ.isEmpty()) {
                                protoAdapterLJ = fieldBinding.LIZ();
                            } else {
                                protoAdapterLJ = fieldBinding.LJ();
                            }
                            Object objDecode = protoAdapterLJ.decode(protoReader);
                            if (fieldBinding.label.LJJLJ()) {
                                ((List) fieldBinding.LIZJ(bNewInstance)).add(objDecode);
                            } else if (!fieldBinding.LIZ.isEmpty()) {
                                ((Map) fieldBinding.LIZJ(bNewInstance)).putAll((Map) objDecode);
                            } else {
                                fieldBinding.LIZLLL(bNewInstance, objDecode);
                            }
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            bNewInstance.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        bNewInstance.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return (M) bNewInstance.build();
                }
            }
        } catch (IllegalAccessException | InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new AssertionError(e2);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int iEncodedSizeWithTag = 0;
        for (FieldBinding<M, B> fieldBinding : this.LIZJ.values()) {
            Object objLIZIZ = fieldBinding.LIZIZ(m);
            if (objLIZIZ != null) {
                iEncodedSizeWithTag += fieldBinding.LIZ().encodedSizeWithTag(fieldBinding.tag, objLIZIZ);
            }
        }
        int size = iEncodedSizeWithTag + m.unknownFields().size();
        m.cachedSerializedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RuntimeMessageAdapter) && ((RuntimeMessageAdapter) obj).LIZ == this.LIZ) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M m) {
        Message.Builder<M, B> builderNewBuilder = m.newBuilder();
        for (FieldBinding<M, B> fieldBinding : this.LIZJ.values()) {
            if (fieldBinding.redacted && fieldBinding.label == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException(C786410Ut5.j4("Field '%s' in %s is required and cannot be redacted.", new Object[]{fieldBinding.name, this.javaType.getName()}));
            }
            boolean zIsAssignableFrom = Message.class.isAssignableFrom(fieldBinding.LJ().javaType);
            if (!fieldBinding.redacted) {
                if (zIsAssignableFrom) {
                    if (fieldBinding.label.LJJLJ()) {
                        if (fieldBinding.label.LJJLJ()) {
                            C1516540pZE.LJIIIZ((List) fieldBinding.LIZJ(builderNewBuilder), fieldBinding.LJ());
                        }
                    }
                }
            }
            Object objLIZJ = fieldBinding.LIZJ(builderNewBuilder);
            if (objLIZJ != null) {
                fieldBinding.LIZLLL(builderNewBuilder, fieldBinding.LIZ().redact(objLIZJ));
            }
        }
        builderNewBuilder.clearUnknownFields();
        return (M) builderNewBuilder.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding<M, B> fieldBinding : this.LIZJ.values()) {
            Object objLIZIZ = fieldBinding.LIZIZ(m);
            if (objLIZIZ != null) {
                sb.append(", ");
                sb.append(fieldBinding.name);
                sb.append('=');
                if (fieldBinding.redacted) {
                    objLIZIZ = "██";
                }
                sb.append(objLIZIZ);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.getSimpleName());
        sbLIZ.append('{');
        sb.replace(0, 2, C2188811AlT.LIZIZ(sbLIZ));
        sb.append('}');
        return sb.toString();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, M m) {
        for (FieldBinding<M, B> fieldBinding : this.LIZJ.values()) {
            Object objLIZIZ = fieldBinding.LIZIZ(m);
            if (objLIZIZ != null) {
                fieldBinding.LIZ().encodeWithTag(protoWriter, fieldBinding.tag, objLIZIZ);
            }
        }
        protoWriter.writeBytes(m.unknownFields());
    }

    public RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.LIZ = cls;
        this.LIZIZ = cls2;
        this.LIZJ = map;
    }
}
