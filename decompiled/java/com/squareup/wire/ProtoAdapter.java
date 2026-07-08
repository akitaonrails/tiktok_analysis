package com.squareup.wire;

import X.C1496330p2d;
import X.C1496670p3B;
import X.C1496690p3D;
import X.C1496710p3F;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1496620p36;
import X.InterfaceC1496780p3M;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Long> UINT64;
    public final FieldEncoding fieldEncoding;
    public final Class<?> javaType;
    public ProtoAdapter<List<E>> packedAdapter;
    public ProtoAdapter<List<E>> repeatedAdapter;

    public abstract E decode(ProtoReader protoReader);

    public abstract void encode(ProtoWriter protoWriter, E e);

    public abstract int encodedSize(E e);

    public E redact(E e) {
        return null;
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new ProtoAdapter<Boolean>(fieldEncoding, Boolean.class) { // from class: com.squareup.wire.ProtoAdapter.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Boolean bool) {
                return 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader protoReader) throws IOException {
                int varint32 = protoReader.readVarint32();
                if (varint32 == 0) {
                    return Boolean.FALSE;
                }
                if (varint32 == 1) {
                    return Boolean.TRUE;
                }
                throw new IOException(C786410Ut5.j4("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(varint32)}));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Boolean bool) {
                protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
            }
        };
        INT32 = new ProtoAdapter<Integer>(fieldEncoding, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                int iIntValue = num.intValue();
                if (iIntValue >= 0) {
                    return ProtoWriter.LIZ(iIntValue);
                }
                return 10;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                int iIntValue = num.intValue();
                if (iIntValue >= 0) {
                    protoWriter.writeVarint32(iIntValue);
                } else {
                    protoWriter.writeVarint64(iIntValue);
                }
            }
        };
        UINT32 = new ProtoAdapter<Integer>(fieldEncoding, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.LIZ(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                protoWriter.writeVarint32(num.intValue());
            }
        };
        SINT32 = new ProtoAdapter<Integer>(fieldEncoding, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                int varint32 = protoReader.readVarint32();
                return Integer.valueOf((-(varint32 & 1)) ^ (varint32 >>> 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                int iIntValue = num.intValue();
                return ProtoWriter.LIZ((iIntValue >> 31) ^ (iIntValue << 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                int iIntValue = num.intValue();
                protoWriter.writeVarint32((iIntValue >> 31) ^ (iIntValue << 1));
            }
        };
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        ProtoAdapter<Integer> protoAdapter = new ProtoAdapter<Integer>(fieldEncoding2, Integer.class) { // from class: com.squareup.wire.ProtoAdapter.5
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) {
                protoWriter.writeFixed32(num.intValue());
            }
        };
        FIXED32 = protoAdapter;
        SFIXED32 = protoAdapter;
        INT64 = new ProtoAdapter<Long>(fieldEncoding, Long.class) { // from class: com.squareup.wire.ProtoAdapter.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.LIZIZ(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeVarint64(l.longValue());
            }
        };
        UINT64 = new ProtoAdapter<Long>(fieldEncoding, Long.class) { // from class: com.squareup.wire.ProtoAdapter.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return ProtoWriter.LIZIZ(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeVarint64(l.longValue());
            }
        };
        SINT64 = new ProtoAdapter<Long>(fieldEncoding, Long.class) { // from class: com.squareup.wire.ProtoAdapter.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                long varint64 = protoReader.readVarint64();
                return Long.valueOf((-(varint64 & 1)) ^ (varint64 >>> 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                long jLongValue = l.longValue();
                return ProtoWriter.LIZIZ((jLongValue >> 63) ^ (jLongValue << 1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                long jLongValue = l.longValue();
                protoWriter.writeVarint64((jLongValue >> 63) ^ (jLongValue << 1));
            }
        };
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        ProtoAdapter<Long> protoAdapter2 = new ProtoAdapter<Long>(fieldEncoding3, Long.class) { // from class: com.squareup.wire.ProtoAdapter.9
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeFixed64(l.longValue());
            }
        };
        FIXED64 = protoAdapter2;
        SFIXED64 = protoAdapter2;
        FLOAT = new ProtoAdapter<Float>(fieldEncoding2, Float.class) { // from class: com.squareup.wire.ProtoAdapter.10
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Float f) {
                return 4;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Float decode(ProtoReader protoReader) {
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Float f) {
                protoWriter.writeFixed32(Float.floatToIntBits(f.floatValue()));
            }
        };
        DOUBLE = new ProtoAdapter<Double>(fieldEncoding3, Double.class) { // from class: com.squareup.wire.ProtoAdapter.11
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Double d) {
                return 8;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Double decode(ProtoReader protoReader) {
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Double d) {
                protoWriter.writeFixed64(Double.doubleToLongBits(d.doubleValue()));
            }
        };
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new ProtoAdapter<String>(fieldEncoding4, String.class) { // from class: com.squareup.wire.ProtoAdapter.12
            /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
            @Override // com.squareup.wire.ProtoAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int encodedSize(java.lang.String r8) {
                /*
                    r7 = this;
                    int r6 = r8.length()
                    r5 = 0
                    r4 = 0
                L6:
                    if (r5 >= r6) goto L45
                    char r1 = r8.charAt(r5)
                    r0 = 128(0x80, float:1.8E-43)
                    if (r1 < r0) goto L42
                    r0 = 2048(0x800, float:2.87E-42)
                    if (r1 >= r0) goto L19
                    int r4 = r4 + 2
                L16:
                    int r5 = r5 + 1
                    goto L6
                L19:
                    r0 = 55296(0xd800, float:7.7486E-41)
                    if (r1 < r0) goto L3f
                    r3 = 57343(0xdfff, float:8.0355E-41)
                    if (r1 > r3) goto L3f
                    r0 = 56319(0xdbff, float:7.892E-41)
                    if (r1 > r0) goto L42
                    int r2 = r5 + 1
                    if (r2 >= r6) goto L42
                    char r1 = r8.charAt(r2)
                    r0 = 56320(0xdc00, float:7.8921E-41)
                    if (r1 < r0) goto L42
                    char r0 = r8.charAt(r2)
                    if (r0 > r3) goto L42
                    int r4 = r4 + 4
                    r5 = r2
                    goto L16
                L3f:
                    int r4 = r4 + 3
                    goto L16
                L42:
                    int r4 = r4 + 1
                    goto L16
                L45:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.ProtoAdapter.AnonymousClass12.encodedSize(java.lang.String):int");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader protoReader) {
                return protoReader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, String str) {
                protoWriter.writeString(str);
            }
        };
        BYTES = new ProtoAdapter<ByteString>(fieldEncoding4, ByteString.class) { // from class: com.squareup.wire.ProtoAdapter.13
            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader protoReader) {
                return protoReader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString byteString) {
                return byteString.size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ByteString byteString) {
                protoWriter.writeBytes(byteString);
            }
        };
    }

    private ProtoAdapter<List<E>> createPacked() {
        FieldEncoding fieldEncoding = this.fieldEncoding;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            return new ProtoAdapter<List<E>>(fieldEncoding2, List.class) { // from class: com.squareup.wire.ProtoAdapter.14
                @Override // com.squareup.wire.ProtoAdapter
                public List<E> decode(ProtoReader protoReader) {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(List<E> list) {
                    int size = list.size();
                    int iEncodedSize = 0;
                    for (int i = 0; i < size; i++) {
                        iEncodedSize += ProtoAdapter.this.encodedSize(ListProtector.get(list, i));
                    }
                    return iEncodedSize;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public List<E> redact(List<E> list) {
                    return Collections.emptyList();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, List<E> list) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.encode(protoWriter, ListProtector.get(list, i));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSizeWithTag(int i, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return super.encodedSizeWithTag(i, list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) {
                    if (!list.isEmpty()) {
                        super.encodeWithTag(protoWriter, i, list);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new ProtoAdapter<List<E>>(this.fieldEncoding, List.class) { // from class: com.squareup.wire.ProtoAdapter.15
            @Override // com.squareup.wire.ProtoAdapter
            public List<E> decode(ProtoReader protoReader) {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<E> redact(List<E> list) {
                return Collections.emptyList();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, List<E> list) {
                int size = list.size();
                int iEncodedSizeWithTag = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    iEncodedSizeWithTag += ProtoAdapter.this.encodedSizeWithTag(i, ListProtector.get(list, i2));
                }
                return iEncodedSizeWithTag;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i, ListProtector.get(list, i2));
                }
            }
        };
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreatePacked = createPacked();
        this.packedAdapter = protoAdapterCreatePacked;
        return protoAdapterCreatePacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreateRepeated = createRepeated();
        this.repeatedAdapter = protoAdapterCreateRepeated;
        return protoAdapterCreateRepeated;
    }

    public static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        public final ProtoAdapter<K> LIZ;
        public final ProtoAdapter<V> LIZIZ;

        @Override // com.squareup.wire.ProtoAdapter
        public Map.Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map.Entry<K, V> entry) {
            return this.LIZ.encodedSizeWithTag(1, entry.getKey()) + this.LIZIZ.encodedSizeWithTag(2, entry.getValue());
        }

        public MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.LIZ = protoAdapter;
            this.LIZIZ = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map.Entry<K, V> entry) {
            this.LIZ.encodeWithTag(protoWriter, 1, entry.getKey());
            this.LIZIZ.encodeWithTag(protoWriter, 2, entry.getValue());
        }
    }

    public static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        public final MapEntryProtoAdapter<K, V> LIZ;

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> decode(ProtoReader protoReader) {
            long jBeginMessage = protoReader.beginMessage();
            K kDecode = null;
            V vDecode = null;
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    break;
                }
                if (iNextTag != 1) {
                    if (iNextTag == 2) {
                        vDecode = this.LIZ.LIZIZ.decode(protoReader);
                    }
                } else {
                    kDecode = this.LIZ.LIZ.decode(protoReader);
                }
            }
            protoReader.endMessage(jBeginMessage);
            if (kDecode != null) {
                if (vDecode != null) {
                    return Collections.singletonMap(kDecode, vDecode);
                }
                throw new IllegalStateException("Map entry with null value");
            }
            throw new IllegalStateException("Map entry with null key");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> redact(Map<K, V> map) {
            return Collections.emptyMap();
        }

        public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.LIZ = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            int iEncodedSizeWithTag = 0;
            while (it2.hasNext()) {
                iEncodedSizeWithTag += this.LIZ.encodedSizeWithTag(i, it2.next());
            }
            return iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                this.LIZ.encodeWithTag(protoWriter, i, it2.next());
            }
        }
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int iIndexOf = str.indexOf(35);
            String strSubstring = str.substring(0, iIndexOf);
            return (ProtoAdapter) Class.forName(strSubstring).getField(str.substring(iIndexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to access ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls.getName());
            sbLIZ.append("$Builder");
            Class<?> cls2 = Class.forName(C2188811AlT.LIZIZ(sbLIZ));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Field field : cls.getDeclaredFields()) {
                WireField wireField = (WireField) field.getAnnotation(WireField.class);
                if (wireField != null) {
                    linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, cls2));
                }
            }
            return new RuntimeMessageAdapter(cls, cls2, Collections.unmodifiableMap(linkedHashMap));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No builder class found for message type ");
            sbLIZ2.append(cls.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final E decode(byte[] bArr) {
        Preconditions.LIZ(bArr, "bytes == null");
        C1496690p3D c1496690p3D = new C1496690p3D();
        c1496690p3D.LJJJLL(0, bArr, bArr.length);
        return decode(c1496690p3D);
    }

    public final byte[] encode(E e) {
        Preconditions.LIZ(e, "value == null");
        C1496690p3D c1496690p3D = new C1496690p3D();
        try {
            encode(c1496690p3D, e);
            return c1496690p3D.LJZL();
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new AssertionError(e2);
        }
    }

    public String toString(E e) {
        return e.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoAdapter<?> withLabel(WireField.Label label) {
        if (label.LJJLJ()) {
            if (label == WireField.Label.PACKED) {
                return asPacked();
            }
            return asRepeated();
        }
        return this;
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to access ");
            sbLIZ.append(cls.getName());
            sbLIZ.append("#ADAPTER");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public final E decode(InputStream inputStream) {
        Preconditions.LIZ(inputStream, "stream == null");
        return decode(new C1496670p3B(C1496330p2d.LIZJ(inputStream)));
    }

    public static <M extends Message> ProtoAdapter<M> get(M m) {
        return get(m.getClass());
    }

    public final E decode(ByteString byteString) {
        Preconditions.LIZ(byteString, "bytes == null");
        C1496690p3D c1496690p3D = new C1496690p3D();
        byteString.write$jvm(c1496690p3D);
        return decode(c1496690p3D);
    }

    public final E decode(InterfaceC1496620p36 interfaceC1496620p36) {
        Preconditions.LIZ(interfaceC1496620p36, "source == null");
        return decode(new ProtoReader(interfaceC1496620p36));
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        public EnumConstantNotFoundException(int i, Class<?> cls) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown enum tag ");
            sbLIZ.append(i);
            sbLIZ.append(" for ");
            sbLIZ.append(cls.getCanonicalName());
            super(C2188811AlT.LIZIZ(sbLIZ));
            this.value = i;
        }
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.fieldEncoding = fieldEncoding;
        this.javaType = cls;
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public final void encode(OutputStream outputStream, E e) {
        Preconditions.LIZ(e, "value == null");
        Preconditions.LIZ(outputStream, "stream == null");
        C1496710p3F c1496710p3F = new C1496710p3F(C1496330p2d.LIZ(outputStream));
        encode(c1496710p3F, e);
        c1496710p3F.LLFII();
    }

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(e);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.LIZ(iEncodedSize);
        }
        return iEncodedSize + ProtoWriter.LIZ((i << 3) | FieldEncoding.VARINT.LL);
    }

    public final void encode(InterfaceC1496780p3M interfaceC1496780p3M, E e) {
        Preconditions.LIZ(e, "value == null");
        Preconditions.LIZ(interfaceC1496780p3M, "sink == null");
        encode(new ProtoWriter(interfaceC1496780p3M), e);
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e) {
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, this.fieldEncoding);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(encodedSize(e));
        }
        encode(protoWriter, e);
    }
}
