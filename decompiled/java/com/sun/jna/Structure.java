package com.sun.jna;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public abstract class Structure {
    public int actualAlignType;
    public int alignType;
    public Structure[] array;
    public boolean autoRead;
    public boolean autoWrite;
    public String encoding;
    public Pointer memory;
    public final Map<String, NativeStringTracking> nativeStrings;
    public boolean readCalled;
    public int size;
    public int structAlignment;
    public Map<String, StructField> structFields;
    public long typeInfo;
    public TypeMapper typeMapper;
    public static final Logger LOG = Logger.getLogger(Structure.class.getName());
    public static final Map<Class<?>, LayoutInfo> layoutInfo = new WeakHashMap();
    public static final Map<Class<?>, List<String>> fieldOrder = new WeakHashMap();
    public static final ThreadLocal<Map<Pointer, Structure>> reads = new ThreadLocal<Map<Pointer, Structure>>() { // from class: com.sun.jna.Structure.1
        @Override // java.lang.ThreadLocal
        public synchronized Map<Pointer, Structure> initialValue() {
            return new HashMap();
        }
    };
    public static final ThreadLocal<Set<Structure>> busy = new ThreadLocal<Set<Structure>>() { // from class: com.sun.jna.Structure.2
        @Override // java.lang.ThreadLocal
        public synchronized Set<Structure> initialValue() {
            return new StructureSet();
        }
    };
    public static final Pointer PLACEHOLDER_MEMORY = new Pointer(0) { // from class: com.sun.jna.Structure.3
        @Override // com.sun.jna.Pointer
        public Pointer share(long j, long j2) {
            return this;
        }
    };

    public interface ByReference {
    }

    public interface ByValue {
    }

    @FieldOrder({"size", "alignment", "type", "elements"})
    public static class FFIType extends Structure {
        public static final Map<Pointer, FFIType> ffiTypeInfo;
        public static final Map<Class, Map<Integer, FFIType>> typeInfoMap = new WeakHashMap();
        public static final Map<Class, FFIType> unionHelper = new WeakHashMap();
        public short alignment;
        public Pointer elements;
        public size_t size;
        public short type;

        public static class FFITypes {
            public static Pointer ffi_type_double;
            public static Pointer ffi_type_float;
            public static Pointer ffi_type_longdouble;
            public static Pointer ffi_type_pointer;
            public static Pointer ffi_type_sint16;
            public static Pointer ffi_type_sint32;
            public static Pointer ffi_type_sint64;
            public static Pointer ffi_type_sint8;
            public static Pointer ffi_type_uint16;
            public static Pointer ffi_type_uint32;
            public static Pointer ffi_type_uint64;
            public static Pointer ffi_type_uint8;
            public static Pointer ffi_type_void;
        }

        public static class size_t extends IntegerType {
            public static final long serialVersionUID = 1;

            public size_t() {
                this(0L);
            }

            public size_t(long j) {
                super(Native.SIZE_T_SIZE, j);
            }
        }

        static {
            HashMap map = new HashMap();
            ffiTypeInfo = map;
            if (Native.POINTER_SIZE == 0) {
                throw new Error("Native library not initialized");
            }
            Pointer pointer = FFITypes.ffi_type_void;
            if (pointer == null) {
                throw new Error("FFI types not initialized");
            }
            map.put(pointer, Structure.newInstance(FFIType.class, pointer));
            Pointer pointer2 = FFITypes.ffi_type_float;
            map.put(pointer2, Structure.newInstance(FFIType.class, pointer2));
            Pointer pointer3 = FFITypes.ffi_type_double;
            map.put(pointer3, Structure.newInstance(FFIType.class, pointer3));
            Pointer pointer4 = FFITypes.ffi_type_longdouble;
            map.put(pointer4, Structure.newInstance(FFIType.class, pointer4));
            Pointer pointer5 = FFITypes.ffi_type_uint8;
            map.put(pointer5, Structure.newInstance(FFIType.class, pointer5));
            Pointer pointer6 = FFITypes.ffi_type_sint8;
            map.put(pointer6, Structure.newInstance(FFIType.class, pointer6));
            Pointer pointer7 = FFITypes.ffi_type_uint16;
            map.put(pointer7, Structure.newInstance(FFIType.class, pointer7));
            Pointer pointer8 = FFITypes.ffi_type_sint16;
            map.put(pointer8, Structure.newInstance(FFIType.class, pointer8));
            Pointer pointer9 = FFITypes.ffi_type_uint32;
            map.put(pointer9, Structure.newInstance(FFIType.class, pointer9));
            Pointer pointer10 = FFITypes.ffi_type_sint32;
            map.put(pointer10, Structure.newInstance(FFIType.class, pointer10));
            Pointer pointer11 = FFITypes.ffi_type_uint64;
            map.put(pointer11, Structure.newInstance(FFIType.class, pointer11));
            Pointer pointer12 = FFITypes.ffi_type_sint64;
            map.put(pointer12, Structure.newInstance(FFIType.class, pointer12));
            Pointer pointer13 = FFITypes.ffi_type_pointer;
            map.put(pointer13, Structure.newInstance(FFIType.class, pointer13));
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                ((Structure) it2.next()).read();
            }
            Class cls = Void.TYPE;
            Map<Pointer, FFIType> map2 = ffiTypeInfo;
            storeTypeInfo(cls, map2.get(FFITypes.ffi_type_void));
            storeTypeInfo(Void.class, map2.get(FFITypes.ffi_type_void));
            storeTypeInfo(Float.TYPE, map2.get(FFITypes.ffi_type_float));
            storeTypeInfo(Float.class, map2.get(FFITypes.ffi_type_float));
            storeTypeInfo(Double.TYPE, map2.get(FFITypes.ffi_type_double));
            storeTypeInfo(Double.class, map2.get(FFITypes.ffi_type_double));
            storeTypeInfo(Long.TYPE, map2.get(FFITypes.ffi_type_sint64));
            storeTypeInfo(Long.class, map2.get(FFITypes.ffi_type_sint64));
            storeTypeInfo(Integer.TYPE, map2.get(FFITypes.ffi_type_sint32));
            storeTypeInfo(Integer.class, map2.get(FFITypes.ffi_type_sint32));
            storeTypeInfo(Short.TYPE, map2.get(FFITypes.ffi_type_sint16));
            storeTypeInfo(Short.class, map2.get(FFITypes.ffi_type_sint16));
            FFIType fFIType = map2.get(Native.WCHAR_SIZE == 2 ? FFITypes.ffi_type_uint16 : FFITypes.ffi_type_uint32);
            storeTypeInfo(Character.TYPE, fFIType);
            storeTypeInfo(Character.class, fFIType);
            storeTypeInfo(Byte.TYPE, map2.get(FFITypes.ffi_type_sint8));
            storeTypeInfo(Byte.class, map2.get(FFITypes.ffi_type_sint8));
            storeTypeInfo(Pointer.class, map2.get(FFITypes.ffi_type_pointer));
            storeTypeInfo(String.class, map2.get(FFITypes.ffi_type_pointer));
            storeTypeInfo(WString.class, map2.get(FFITypes.ffi_type_pointer));
            storeTypeInfo(Boolean.TYPE, map2.get(FFITypes.ffi_type_uint32));
            storeTypeInfo(Boolean.class, map2.get(FFITypes.ffi_type_uint32));
        }

        public FFIType() {
            this.type = (short) 13;
        }

        public FFIType(Structure structure) {
            Pointer[] pointerArr;
            int i;
            this.type = (short) 13;
            structure.ensureAllocated(true);
            int i2 = 0;
            if (structure instanceof Union) {
                int i3 = 0;
                boolean z = false;
                FFIType fFIType = null;
                for (StructField structField : structure.fields().values()) {
                    FFIType fieldTypeInfo = structure.getFieldTypeInfo(structField);
                    z = isIntegerType(fieldTypeInfo) ? true : z;
                    if (fFIType == null || i3 < (i = structField.size) || (i3 == i && Structure.class.isAssignableFrom(structField.type))) {
                        i3 = structField.size;
                        fFIType = fieldTypeInfo;
                    }
                }
                if (((Platform.isIntel() && Platform.is64Bit() && !Platform.isWindows()) || Platform.isARM() || Platform.isLoongArch()) && z && isFloatType(fFIType)) {
                    FFIType fFIType2 = new FFIType(fFIType);
                    if (fFIType2.size.intValue() == 4) {
                        fFIType2.type = ffiTypeInfo.get(FFITypes.ffi_type_uint32).type;
                    } else if (fFIType2.size.intValue() == 8) {
                        fFIType2.type = ffiTypeInfo.get(FFITypes.ffi_type_uint64).type;
                    }
                    fFIType2.write();
                    fFIType = fFIType2;
                }
                pointerArr = new Pointer[]{fFIType.getPointer(), null};
                unionHelper.put(structure.getClass(), fFIType);
            } else {
                pointerArr = new Pointer[structure.fields().size() + 1];
                Iterator<StructField> it2 = structure.fields().values().iterator();
                while (it2.hasNext()) {
                    pointerArr[i2] = structure.getFieldTypeInfo(it2.next()).getPointer();
                    i2++;
                }
            }
            init(pointerArr);
            write();
        }

        public static FFIType get(Object obj) {
            FFIType typeInfo;
            if (obj == null) {
                synchronized (typeInfoMap) {
                    try {
                        typeInfo = getTypeInfo(Pointer.class, 0);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return typeInfo;
            }
            if (obj instanceof Class) {
                return get(null, (Class) obj);
            }
            return get(obj, obj.getClass());
        }

        private void init(Pointer[] pointerArr) {
            Memory memory = new Memory(Native.POINTER_SIZE * pointerArr.length);
            this.elements = memory;
            memory.write(0L, pointerArr, 0, pointerArr.length);
            write();
        }

        public static boolean isFloatType(FFIType fFIType) {
            Pointer pointer = fFIType.getPointer();
            if (!pointer.equals(FFITypes.ffi_type_float) && !pointer.equals(FFITypes.ffi_type_double)) {
                return false;
            }
            return true;
        }

        public static boolean isIntegerType(FFIType fFIType) {
            Pointer pointer = fFIType.getPointer();
            if (!pointer.equals(FFITypes.ffi_type_uint8) && !pointer.equals(FFITypes.ffi_type_sint8) && !pointer.equals(FFITypes.ffi_type_uint16) && !pointer.equals(FFITypes.ffi_type_sint16) && !pointer.equals(FFITypes.ffi_type_uint32) && !pointer.equals(FFITypes.ffi_type_sint32) && !pointer.equals(FFITypes.ffi_type_uint64) && !pointer.equals(FFITypes.ffi_type_sint64) && !pointer.equals(FFITypes.ffi_type_pointer)) {
                return false;
            }
            return true;
        }

        public FFIType(FFIType fFIType) {
            this.type = (short) 13;
            this.size = fFIType.size;
            this.alignment = fFIType.alignment;
            this.type = fFIType.type;
            this.elements = fFIType.elements;
        }

        public FFIType(Object obj, Class<?> cls) {
            this.type = (short) 13;
            int length = Array.getLength(obj);
            Pointer[] pointerArr = new Pointer[length + 1];
            Pointer pointer = get(null, cls.getComponentType()).getPointer();
            for (int i = 0; i < length; i++) {
                pointerArr[i] = pointer;
            }
            init(pointerArr);
            write();
        }

        public static FFIType get(Object obj, Class<?> cls) {
            int length;
            ToNativeConverter toNativeConverter;
            TypeMapper typeMapper = Native.getTypeMapper(cls);
            if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
                cls = toNativeConverter.nativeType();
            }
            Map<Class, Map<Integer, FFIType>> map = typeInfoMap;
            synchronized (map) {
                try {
                    if (cls.isArray()) {
                        length = Array.getLength(obj);
                    } else {
                        length = 0;
                    }
                    FFIType typeInfo = getTypeInfo(cls, length);
                    if (typeInfo != null) {
                        return typeInfo;
                    }
                    if ((!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(cls)) && !Callback.class.isAssignableFrom(cls)) {
                        if (Structure.class.isAssignableFrom(cls)) {
                            if (obj == null) {
                                obj = Structure.newInstance(cls, Structure.PLACEHOLDER_MEMORY);
                            }
                            if (ByReference.class.isAssignableFrom(cls)) {
                                map.put(cls, map.get(Pointer.class));
                                return map.get(Pointer.class).get(0);
                            }
                            FFIType fFIType = new FFIType((Structure) obj);
                            storeTypeInfo(cls, fFIType);
                            return fFIType;
                        }
                        if (NativeMapped.class.isAssignableFrom(cls)) {
                            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                            return get(nativeMappedConverter.toNative(obj, new ToNativeContext()), nativeMappedConverter.nativeType());
                        }
                        if (cls.isArray()) {
                            FFIType fFIType2 = new FFIType(obj, cls);
                            storeTypeInfo(cls, Array.getLength(obj), fFIType2);
                            return fFIType2;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported type ");
                        sbLIZ.append(cls);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    map.put(cls, map.get(Pointer.class));
                    return map.get(Pointer.class).get(0);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public static FFIType getTypeInfo(Class cls, int i) {
            Map<Integer, FFIType> map = typeInfoMap.get(cls);
            if (map != null) {
                return map.get(Integer.valueOf(i));
            }
            return null;
        }

        public static void storeTypeInfo(Class cls, FFIType fFIType) {
            storeTypeInfo(cls, 0, fFIType);
        }

        public static void storeTypeInfo(Class cls, int i, FFIType fFIType) {
            Map<Class, Map<Integer, FFIType>> map = typeInfoMap;
            synchronized (map) {
                try {
                    Map<Integer, FFIType> map2 = map.get(cls);
                    if (map2 == null) {
                        map2 = new HashMap<>();
                        map.put(cls, map2);
                    }
                    map2.put(Integer.valueOf(i), fFIType);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public @interface FieldOrder {
        String[] value();
    }

    public static class StructureSet extends AbstractCollection<Structure> implements Set<Structure> {
        public int count;
        public Structure[] elements;

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Structure> iterator() {
            int i = this.count;
            Structure[] structureArr = new Structure[i];
            if (i > 0) {
                System.arraycopy(this.elements, 0, structureArr, 0, i);
            }
            return Arrays.asList(structureArr).iterator();
        }

        public Structure[] getElements() {
            return this.elements;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.count;
        }

        private void ensureCapacity(int i) {
            Structure[] structureArr = this.elements;
            if (structureArr == null) {
                this.elements = new Structure[(i * 3) / 2];
            } else {
                if (structureArr.length >= i) {
                    return;
                }
                Structure[] structureArr2 = new Structure[(i * 3) / 2];
                System.arraycopy(structureArr, 0, structureArr2, 0, structureArr.length);
                this.elements = structureArr2;
            }
        }

        private int indexOf(Structure structure) {
            for (int i = 0; i < this.count; i++) {
                Structure structure2 = this.elements[i];
                if (structure == structure2 || (structure.getClass() == structure2.getClass() && structure.size() == structure2.size() && structure.getPointer().equals(structure2.getPointer()))) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Structure structure) {
            if (!contains(structure)) {
                ensureCapacity(this.count + 1);
                Structure[] structureArr = this.elements;
                int i = this.count;
                this.count = i + 1;
                structureArr[i] = structure;
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (indexOf((Structure) obj) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iIndexOf = indexOf((Structure) obj);
            if (iIndexOf != -1) {
                int i = this.count - 1;
                this.count = i;
                if (i >= 0) {
                    Structure[] structureArr = this.elements;
                    structureArr[iIndexOf] = structureArr[i];
                    structureArr[i] = null;
                }
                return true;
            }
            return false;
        }
    }

    public Structure() {
        this(0);
    }

    public void allocateMemory() {
        allocateMemory(false);
    }

    public void ensureAllocated() {
        ensureAllocated(false);
    }

    public static class AutoAllocated extends Memory {
        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("auto-");
            sbLIZ.append(super.toString());
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AutoAllocated(int i) {
            super(i);
            super.clear();
        }
    }

    public static class LayoutInfo {
        public int alignType;
        public int alignment;
        public final Map<String, StructField> fields;
        public int size;
        public TypeMapper typeMapper;
        public boolean variable;

        public LayoutInfo() {
            this.size = -1;
            this.alignment = 1;
            this.fields = Collections.synchronizedMap(new LinkedHashMap());
            this.alignType = 0;
        }
    }

    public static class StructField {
        public FromNativeContext context;
        public Field field;
        public boolean isReadOnly;
        public boolean isVolatile;
        public String name;
        public FromNativeConverter readConverter;
        public Class<?> type;
        public ToNativeConverter writeConverter;
        public int size = -1;
        public int offset = -1;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.name);
            sbLIZ.append(e3.g);
            sbLIZ.append(this.offset);
            sbLIZ.append(e3.e);
            sbLIZ.append(this.size);
            sbLIZ.append("] (");
            sbLIZ.append(this.type);
            sbLIZ.append(")");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    private Class<?> baseClass() {
        return (((this instanceof ByReference) || (this instanceof ByValue)) && Structure.class.isAssignableFrom(getClass().getSuperclass())) ? getClass().getSuperclass() : getClass();
    }

    public static Set<Structure> busy() {
        return busy.get();
    }

    private void layoutChanged() {
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof AutoAllocated) {
                this.memory = null;
            }
            ensureAllocated();
        }
    }

    public static Map<Pointer, Structure> reading() {
        return reads.get();
    }

    public void conditionalAutoRead() {
        if (this.readCalled) {
            return;
        }
        autoRead();
    }

    public List<Field> getFieldList() {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = getClass(); !superclass.equals(Structure.class); superclass = superclass.getSuperclass()) {
            ArrayList arrayList2 = new ArrayList();
            Field[] declaredFields = superclass.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                int modifiers = declaredFields[i].getModifiers();
                if (!Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                    arrayList2.add(declaredFields[i]);
                }
            }
            arrayList.addAll(0, arrayList2);
        }
        return arrayList;
    }

    public List<String> getFieldOrder() {
        LinkedList linkedList = new LinkedList();
        for (Class<?> superclass = getClass(); superclass != Structure.class; superclass = superclass.getSuperclass()) {
            FieldOrder fieldOrder2 = (FieldOrder) superclass.getAnnotation(FieldOrder.class);
            if (fieldOrder2 != null) {
                linkedList.addAll(0, Arrays.asList(fieldOrder2.value()));
            }
        }
        return Collections.unmodifiableList(linkedList);
    }

    public int getStructAlignment() {
        if (this.size == -1) {
            calculateSize(true);
        }
        return this.structAlignment;
    }

    public void read() {
        if (this.memory == PLACEHOLDER_MEMORY) {
            return;
        }
        this.readCalled = true;
        ensureAllocated();
        if (busy().add(this)) {
            boolean z = this instanceof ByReference;
            if (z) {
                reading().put(getPointer(), this);
            }
            try {
                Iterator<StructField> it2 = fields().values().iterator();
                while (it2.hasNext()) {
                    readField(it2.next());
                }
                busy().remove(this);
                if (z && reading().get(getPointer()) == this) {
                    reading().remove(getPointer());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                busy().remove(this);
                if (z && reading().get(getPointer()) == this) {
                    reading().remove(getPointer());
                }
                throw th;
            }
        }
    }

    public String toString() {
        return toString(Boolean.getBoolean("jna.dump_memory"));
    }

    public void write() {
        if (this.memory == PLACEHOLDER_MEMORY) {
            return;
        }
        ensureAllocated();
        if (this instanceof ByValue) {
            getTypeInfo();
        }
        if (busy().add(this)) {
            try {
                for (StructField structField : fields().values()) {
                    if (!structField.isVolatile) {
                        writeField(structField);
                    }
                }
                busy().remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                busy().remove(this);
                throw th;
            }
        }
    }

    private List<String> fieldOrder() {
        List<String> fieldOrder2;
        Class<?> cls = getClass();
        Map<Class<?>, List<String>> map = fieldOrder;
        synchronized (map) {
            try {
                fieldOrder2 = map.get(cls);
                if (fieldOrder2 == null) {
                    fieldOrder2 = getFieldOrder();
                    map.put(cls, fieldOrder2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return fieldOrder2;
    }

    private void initializeFields() {
        for (Field field : getFieldList()) {
            try {
                if (field.get(this) == null) {
                    initializeField(field, field.getType());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception reading field '");
                sbLIZ.append(field.getName());
                sbLIZ.append("' in ");
                sbLIZ.append(getClass());
                throw new Error(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
    }

    private void validateFields() {
        for (Field field : getFieldList()) {
            validateField(field.getName(), field.getType());
        }
    }

    public void autoRead() {
        if (!getAutoRead()) {
            return;
        }
        read();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            Structure[] structureArr = this.array;
            if (i >= structureArr.length) {
                return;
            }
            structureArr[i].autoRead();
            i++;
        }
    }

    public void autoWrite() {
        if (!getAutoWrite()) {
            return;
        }
        write();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            Structure[] structureArr = this.array;
            if (i >= structureArr.length) {
                return;
            }
            structureArr[i].autoWrite();
            i++;
        }
    }

    public void clear() {
        ensureAllocated();
        this.nativeStrings.clear();
        this.memory.clear(size());
    }

    public Pointer getPointer() {
        ensureAllocated();
        return this.memory;
    }

    public Pointer getTypeInfo() {
        Pointer pointer = FFIType.get(this).getPointer();
        cacheTypeInfo(pointer);
        return pointer;
    }

    public int hashCode() {
        return getPointer() != null ? getPointer().hashCode() : getClass().hashCode();
    }

    public int size() {
        ensureAllocated();
        return this.size;
    }

    public Map<String, StructField> fields() {
        return this.structFields;
    }

    public boolean getAutoRead() {
        return this.autoRead;
    }

    public boolean getAutoWrite() {
        return this.autoWrite;
    }

    public String getStringEncoding() {
        return this.encoding;
    }

    public TypeMapper getTypeMapper() {
        return this.typeMapper;
    }

    public static class NativeStringTracking {
        public NativeString peer;
        public final Object value;

        public NativeStringTracking(Object obj) {
            this.value = obj;
        }
    }

    public Structure(TypeMapper typeMapper) {
        this(null, 0, typeMapper);
    }

    private int addPadding(int i) {
        return addPadding(i, this.structAlignment);
    }

    public static void autoRead(Structure[] structureArr) {
        structureArrayCheck(structureArr);
        Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoRead();
            return;
        }
        for (Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoRead();
            }
        }
    }

    public static void autoWrite(Structure[] structureArr) {
        structureArrayCheck(structureArr);
        Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoWrite();
            return;
        }
        for (Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoWrite();
            }
        }
    }

    public static List<String> createFieldsOrder(String str) {
        return Collections.unmodifiableList(Collections.singletonList(str));
    }

    private String format(Class<?> cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(e3.d) + 1);
    }

    public static <T> Constructor<T> getPointerConstructor(Class<T> cls) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(Pointer.class)) {
                return constructor;
            }
        }
        return null;
    }

    public static FFIType getTypeInfo(Object obj) {
        return FFIType.get(obj);
    }

    private void initializeTypeMapper(TypeMapper typeMapper) {
        if (typeMapper == null) {
            typeMapper = Native.getTypeMapper(getClass());
        }
        this.typeMapper = typeMapper;
        layoutChanged();
    }

    public static <T extends Structure> T newInstance(Class<T> cls) {
        T t = (T) Klass.newInstance(cls);
        if (t instanceof ByValue) {
            t.allocateMemory();
        }
        return t;
    }

    public static int size(Class<? extends Structure> cls) {
        return size(cls, null);
    }

    public static <T extends Comparable<T>> List<T> sort(Collection<? extends T> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void structureArrayCheck(Structure[] structureArr) {
        if (ByReference[].class.isAssignableFrom(structureArr.getClass())) {
            return;
        }
        Pointer pointer = structureArr[0].getPointer();
        int size = structureArr[0].size();
        for (int i = 1; i < structureArr.length; i++) {
            if (structureArr[i].getPointer().peer != pointer.peer + ((long) (size * i))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Structure array elements must use contiguous memory (bad backing address at Structure array index ");
                sbLIZ.append(i);
                sbLIZ.append(")");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void validate(Class<? extends Structure> cls) {
        try {
            cls.getConstructor(new Class[0]);
        } catch (NoSuchMethodException | SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No suitable constructor found for class: ");
            sbLIZ.append(cls.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void allocateMemory(int i) {
        if (i == -1) {
            i = calculateSize(false);
            if (i == -1) {
                return;
            }
        } else if (i <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Structure size must be greater than zero: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        Pointer pointer = this.memory;
        if (pointer == null || (pointer instanceof AutoAllocated)) {
            this.memory = autoAllocate(i);
        }
        this.size = i;
    }

    public Memory autoAllocate(int i) {
        return new AutoAllocated(i);
    }

    public void cacheTypeInfo(Pointer pointer) {
        this.typeInfo = pointer.peer;
    }

    public int calculateSize(boolean z) {
        return calculateSize(z, false);
    }

    public boolean dataEquals(Structure structure) {
        return dataEquals(structure, false);
    }

    public void ensureAllocated(boolean z) {
        if (this.memory == null) {
            allocateMemory(z);
            return;
        }
        if (this.size != -1) {
            return;
        }
        int iCalculateSize = calculateSize(true, z);
        this.size = iCalculateSize;
        Pointer pointer = this.memory;
        if (pointer instanceof AutoAllocated) {
            return;
        }
        try {
            this.memory = pointer.share(0L, iCalculateSize);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException("Structure exceeds provided memory bounds", e);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Structure) && obj.getClass() == getClass() && ((Structure) obj).getPointer().equals(getPointer())) {
            return true;
        }
        return false;
    }

    public int fieldOffset(String str) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            return structField.offset;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No such field: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public FFIType getFieldTypeInfo(StructField structField) {
        ToNativeConverter toNativeConverter;
        Class<?> clsNativeType = structField.type;
        Object fieldValue = getFieldValue(structField.field);
        TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(clsNativeType)) != null) {
            clsNativeType = toNativeConverter.nativeType();
            fieldValue = toNativeConverter.toNative(fieldValue, new ToNativeContext());
        }
        return FFIType.get(fieldValue, clsNativeType);
    }

    public Object getFieldValue(Field field) {
        try {
            return field.get(this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception reading field '");
            sbLIZ.append(field.getName());
            sbLIZ.append("' in ");
            sbLIZ.append(getClass());
            throw new Error(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public List<Field> getFields(boolean z) {
        String str;
        List<Field> fieldList = getFieldList();
        HashSet hashSet = new HashSet();
        Iterator<Field> it2 = fieldList.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getName());
        }
        List<String> listFieldOrder = fieldOrder();
        if (listFieldOrder.size() != fieldList.size() && fieldList.size() > 1) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Structure.getFieldOrder() on ");
                sbLIZ.append(getClass());
                if (listFieldOrder.size() < fieldList.size()) {
                    str = " does not provide enough";
                } else {
                    str = " provides too many";
                }
                sbLIZ.append(str);
                sbLIZ.append(" names [");
                sbLIZ.append(listFieldOrder.size());
                sbLIZ.append("] (");
                sbLIZ.append(sort(listFieldOrder));
                sbLIZ.append(") to match declared fields [");
                sbLIZ.append(fieldList.size());
                sbLIZ.append("] (");
                sbLIZ.append(sort(hashSet));
                sbLIZ.append(")");
                throw new Error(C2188811AlT.LIZIZ(sbLIZ));
            }
            return null;
        }
        if (new HashSet(listFieldOrder).equals(hashSet)) {
            sortFields(fieldList, listFieldOrder);
            return fieldList;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Structure.getFieldOrder() on ");
        sbLIZ2.append(getClass());
        sbLIZ2.append(" returns names (");
        sbLIZ2.append(sort(listFieldOrder));
        sbLIZ2.append(") which do not match declared field names (");
        sbLIZ2.append(sort(hashSet));
        sbLIZ2.append(")");
        throw new Error(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public int getNativeSize(Class<?> cls) {
        return getNativeSize(cls, null);
    }

    public Object readField(StructField structField) {
        Object fieldValue;
        int i = structField.offset;
        Class<?> clsNativeType = structField.type;
        FromNativeConverter fromNativeConverter = structField.readConverter;
        if (fromNativeConverter != null) {
            clsNativeType = fromNativeConverter.nativeType();
        }
        Object value = null;
        if (!Structure.class.isAssignableFrom(clsNativeType) && !Callback.class.isAssignableFrom(clsNativeType) && ((!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(clsNativeType)) && !Pointer.class.isAssignableFrom(clsNativeType) && !NativeMapped.class.isAssignableFrom(clsNativeType) && !clsNativeType.isArray())) {
            fieldValue = null;
        } else {
            fieldValue = getFieldValue(structField.field);
        }
        if (clsNativeType == String.class) {
            Pointer pointer = this.memory.getPointer(i);
            if (pointer != null) {
                value = pointer.getString(0L, this.encoding);
            }
        } else {
            value = this.memory.getValue(i, clsNativeType, fieldValue);
        }
        if (fromNativeConverter != null) {
            Object objFromNative = fromNativeConverter.fromNative(value, structField.context);
            if (fieldValue == null || !fieldValue.equals(objFromNative)) {
                fieldValue = objFromNative;
            }
        } else {
            fieldValue = value;
        }
        if (clsNativeType.equals(String.class) || clsNativeType.equals(WString.class)) {
            if (fieldValue != null) {
                NativeStringTracking nativeStringTracking = new NativeStringTracking(fieldValue);
                NativeStringTracking nativeStringTrackingPut = this.nativeStrings.put(structField.name, nativeStringTracking);
                if (nativeStringTrackingPut != null) {
                    nativeStringTracking.peer = nativeStringTrackingPut.peer;
                }
            } else {
                this.nativeStrings.remove(structField.name);
            }
        }
        setFieldValue(structField.field, fieldValue, true);
        return fieldValue;
    }

    public void setAlignType(int i) {
        this.alignType = i;
        if (i == 0 && (i = Native.getStructureAlignment(getClass())) == 0) {
            if (Platform.isWindows()) {
                i = 3;
            } else {
                i = 2;
            }
        }
        this.actualAlignType = i;
        layoutChanged();
    }

    public void setAutoRead(boolean z) {
        this.autoRead = z;
    }

    public void setAutoSynch(boolean z) {
        setAutoRead(z);
        setAutoWrite(z);
    }

    public void setAutoWrite(boolean z) {
        this.autoWrite = z;
    }

    public void setStringEncoding(String str) {
        this.encoding = str;
    }

    public Structure[] toArray(Structure[] structureArr) {
        ensureAllocated();
        Pointer pointer = this.memory;
        if (pointer instanceof AutoAllocated) {
            int length = structureArr.length * size();
            if (((Memory) pointer).size() < length) {
                useMemory(autoAllocate(length));
            }
        }
        structureArr[0] = this;
        int size = size();
        for (int i = 1; i < structureArr.length; i++) {
            Structure structureNewInstance = newInstance((Class<Structure>) getClass(), this.memory.share(i * size, size));
            structureArr[i] = structureNewInstance;
            structureNewInstance.conditionalAutoRead();
        }
        if (!(this instanceof ByValue)) {
            this.array = structureArr;
        }
        return structureArr;
    }

    public String toString(boolean z) {
        return toString(0, true, z);
    }

    public void useMemory(Pointer pointer) {
        useMemory(pointer, 0);
    }

    public void writeField(String str) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            writeField(structField);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No such field: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Structure(int i) {
        this((Pointer) null, i);
    }

    private void allocateMemory(boolean z) {
        allocateMemory(calculateSize(true, z));
    }

    public static List<String> createFieldsOrder(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public Object readField(String str) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            return readField(structField);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No such field: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Structure[] toArray(int i) {
        Structure[] structureArr = (Structure[]) Array.newInstance(getClass(), i);
        toArray(structureArr);
        return structureArr;
    }

    public void writeField(StructField structField) {
        if (structField.isReadOnly) {
            return;
        }
        writeField(structField, getFieldValue(structField.field));
    }

    public Structure(Pointer pointer) {
        this(pointer, 0);
    }

    public Structure(int i, TypeMapper typeMapper) {
        this(null, i, typeMapper);
    }

    private int addPadding(int i, int i2) {
        int i3;
        if (this.actualAlignType != 1 && (i3 = i % i2) != 0) {
            return i + (i2 - i3);
        }
        return i;
    }

    public static List<String> createFieldsOrder(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return Collections.unmodifiableList(arrayList);
    }

    private LayoutInfo deriveLayout(boolean z, boolean z2) {
        Class<?> clsNativeType;
        List<Field> fields = getFields(z);
        if (fields == null) {
            return null;
        }
        LayoutInfo layoutInfo2 = new LayoutInfo();
        layoutInfo2.alignType = this.alignType;
        layoutInfo2.typeMapper = this.typeMapper;
        boolean z3 = true;
        boolean z4 = true;
        int iMax = 0;
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            Class<?> type = field.getType();
            if (type.isArray()) {
                layoutInfo2.variable = z3;
            }
            StructField structField = new StructField();
            structField.isVolatile = Modifier.isVolatile(modifiers);
            boolean zIsFinal = Modifier.isFinal(modifiers);
            structField.isReadOnly = zIsFinal;
            if (zIsFinal) {
                if (Platform.RO_FIELDS) {
                    field.setAccessible(z3);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("This VM does not support read-only fields (field '");
                    sbLIZ.append(field.getName());
                    sbLIZ.append("' within ");
                    sbLIZ.append(getClass());
                    sbLIZ.append(")");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            structField.field = field;
            structField.name = field.getName();
            structField.type = type;
            if (Callback.class.isAssignableFrom(type) && !type.isInterface()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Structure Callback field '");
                sbLIZ2.append(field.getName());
                sbLIZ2.append("' must be an interface");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (type.isArray() && Structure.class.equals(type.getComponentType())) {
                throw new IllegalArgumentException("Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined");
            }
            if (Modifier.isPublic(field.getModifiers())) {
                Object fieldValue = getFieldValue(structField.field);
                if (fieldValue == null && type.isArray()) {
                    if (!z) {
                        return null;
                    }
                    throw new IllegalStateException("Array fields must be initialized");
                }
                if (NativeMapped.class.isAssignableFrom(type)) {
                    NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(type);
                    clsNativeType = nativeMappedConverter.nativeType();
                    structField.writeConverter = nativeMappedConverter;
                    structField.readConverter = nativeMappedConverter;
                    structField.context = new StructureReadContext(this, field);
                } else {
                    TypeMapper typeMapper = this.typeMapper;
                    if (typeMapper != null) {
                        ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(type);
                        FromNativeConverter fromNativeConverter = this.typeMapper.getFromNativeConverter(type);
                        if (toNativeConverter != null) {
                            if (fromNativeConverter != null) {
                                fieldValue = toNativeConverter.toNative(fieldValue, new StructureWriteContext(this, structField.field));
                                if (fieldValue != null) {
                                    clsNativeType = fieldValue.getClass();
                                } else {
                                    clsNativeType = Pointer.class;
                                }
                                structField.writeConverter = toNativeConverter;
                                structField.readConverter = fromNativeConverter;
                                structField.context = new StructureReadContext(this, field);
                            }
                        } else {
                            if (fromNativeConverter != null) {
                            }
                            clsNativeType = type;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Structures require bidirectional type conversion for ");
                        sbLIZ3.append(type);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    clsNativeType = type;
                }
                if (fieldValue == null) {
                    fieldValue = initializeField(structField.field, type);
                }
                try {
                    structField.size = getNativeSize(clsNativeType, fieldValue);
                    int nativeAlignment = getNativeAlignment(clsNativeType, fieldValue, z4);
                    if (nativeAlignment != 0) {
                        layoutInfo2.alignment = Math.max(layoutInfo2.alignment, nativeAlignment);
                        int i = iMax % nativeAlignment;
                        if (i != 0) {
                            iMax += nativeAlignment - i;
                        }
                        if (this instanceof Union) {
                            structField.offset = 0;
                            iMax = Math.max(iMax, structField.size);
                        } else {
                            structField.offset = iMax;
                            iMax += structField.size;
                        }
                        layoutInfo2.fields.put(structField.name, structField);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Field alignment is zero for field '");
                        sbLIZ4.append(structField.name);
                        sbLIZ4.append("' within ");
                        sbLIZ4.append(getClass());
                        throw new Error(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && this.typeMapper == null) {
                        return null;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Invalid Structure field in ");
                    sbLIZ5.append(getClass());
                    sbLIZ5.append(", field name '");
                    sbLIZ5.append(structField.name);
                    sbLIZ5.append("' (");
                    sbLIZ5.append(structField.type);
                    sbLIZ5.append("): ");
                    sbLIZ5.append(e.getMessage());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5), e);
                }
            }
            z4 = false;
            z3 = true;
        }
        if (iMax > 0) {
            int iAddPadding = addPadding(iMax, layoutInfo2.alignment);
            if ((this instanceof ByValue) && !z2) {
                getTypeInfo();
            }
            layoutInfo2.size = iAddPadding;
            return layoutInfo2;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Structure ");
        sbLIZ6.append(getClass());
        sbLIZ6.append(" has unknown or zero size (ensure all fields are public)");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
    }

    private Object initializeField(Field field, Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls) && !ByReference.class.isAssignableFrom(cls)) {
            try {
                Structure structureNewInstance = newInstance((Class<Structure>) cls, PLACEHOLDER_MEMORY);
                setFieldValue(field, structureNewInstance);
                return structureNewInstance;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException("Can't determine size of nested structure", e);
            }
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMapped nativeMappedDefaultValue = NativeMappedConverter.getInstance(cls).defaultValue();
            setFieldValue(field, nativeMappedDefaultValue);
            return nativeMappedDefaultValue;
        }
        return null;
    }

    public static <T extends Structure> T newInstance(Class<T> cls, Pointer pointer) {
        try {
            Constructor pointerConstructor = getPointerConstructor(cls);
            if (pointerConstructor != null) {
                return (T) pointerConstructor.newInstance(pointer);
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Instantiation of ");
            sbLIZ.append(cls);
            sbLIZ.append(" (Pointer) not allowed, is it public?");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Can't instantiate ");
            sbLIZ2.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2), e2);
        } catch (SecurityException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Exception thrown while instantiating an instance of ");
            sbLIZ3.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3), e4);
        }
        T t = (T) newInstance(cls);
        if (pointer != PLACEHOLDER_MEMORY) {
            t.useMemory(pointer);
        }
        return t;
    }

    public static <T extends Structure> int size(Class<T> cls, T t) {
        LayoutInfo layoutInfo2;
        int i;
        Map<Class<?>, LayoutInfo> map = layoutInfo;
        synchronized (map) {
            try {
                layoutInfo2 = map.get(cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (layoutInfo2 == null || layoutInfo2.variable || (i = layoutInfo2.size) == -1) {
            if (t == null) {
                t = (T) newInstance(cls, PLACEHOLDER_MEMORY);
            }
            return t.size();
        }
        return i;
    }

    private void validateField(String str, Class<?> cls) {
        ToNativeConverter toNativeConverter;
        TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
            validateField(str, toNativeConverter.nativeType());
            return;
        }
        if (cls.isArray()) {
            validateField(str, cls.getComponentType());
            return;
        }
        try {
            getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid Structure field in ");
            sbLIZ.append(getClass());
            sbLIZ.append(", field name '");
            sbLIZ.append(str);
            sbLIZ.append("' (");
            sbLIZ.append(cls);
            sbLIZ.append("): ");
            sbLIZ.append(e.getMessage());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    private void writeField(StructField structField, Object obj) {
        NativeString nativeString;
        String strLIZIZ;
        int i = structField.offset;
        Class<?> clsNativeType = structField.type;
        ToNativeConverter toNativeConverter = structField.writeConverter;
        if (toNativeConverter != null) {
            obj = toNativeConverter.toNative(obj, new StructureWriteContext(this, structField.field));
            clsNativeType = toNativeConverter.nativeType();
        }
        if (String.class == clsNativeType || WString.class == clsNativeType) {
            if (obj != null) {
                NativeStringTracking nativeStringTracking = new NativeStringTracking(obj);
                NativeStringTracking nativeStringTrackingPut = this.nativeStrings.put(structField.name, nativeStringTracking);
                if (nativeStringTrackingPut != null && obj.equals(nativeStringTrackingPut.value)) {
                    nativeStringTracking.peer = nativeStringTrackingPut.peer;
                    return;
                }
                if (clsNativeType == WString.class) {
                    nativeString = new NativeString(obj.toString(), true);
                } else {
                    nativeString = new NativeString(obj.toString(), this.encoding);
                }
                nativeStringTracking.peer = nativeString;
                obj = nativeString.getPointer();
            } else {
                this.nativeStrings.remove(structField.name);
            }
        }
        try {
            this.memory.setValue(i, obj, clsNativeType);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Structure field \"");
            sbLIZ.append(structField.name);
            sbLIZ.append("\" was declared as ");
            sbLIZ.append(structField.type);
            if (structField.type == clsNativeType) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" (native type ");
                sbLIZ2.append(clsNativeType);
                sbLIZ2.append(")");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", which is not supported within a Structure");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public int calculateSize(boolean z, boolean z2) {
        LayoutInfo layoutInfoDeriveLayout;
        Class<?> cls = getClass();
        Map<Class<?>, LayoutInfo> map = layoutInfo;
        synchronized (map) {
            try {
                layoutInfoDeriveLayout = map.get(cls);
            } finally {
            }
        }
        if ((layoutInfoDeriveLayout == null || this.alignType != layoutInfoDeriveLayout.alignType || this.typeMapper != layoutInfoDeriveLayout.typeMapper) && (layoutInfoDeriveLayout = deriveLayout(z, z2)) == null) {
            return -1;
        }
        this.structAlignment = layoutInfoDeriveLayout.alignment;
        this.structFields = layoutInfoDeriveLayout.fields;
        if (!layoutInfoDeriveLayout.variable) {
            synchronized (map) {
                try {
                    if (!map.containsKey(cls) || this.alignType != 0 || this.typeMapper != null) {
                        map.put(cls, layoutInfoDeriveLayout);
                    }
                } finally {
                }
            }
        }
        return layoutInfoDeriveLayout.size;
    }

    public boolean dataEquals(Structure structure, boolean z) {
        if (z) {
            structure.getPointer().clear(structure.size());
            structure.write();
            getPointer().clear(size());
            write();
        }
        byte[] byteArray = structure.getPointer().getByteArray(0L, structure.size());
        byte[] byteArray2 = getPointer().getByteArray(0L, size());
        if (byteArray.length != byteArray2.length) {
            return false;
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] != byteArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public int getNativeSize(Class<?> cls, Object obj) {
        return Native.getNativeSize(cls, obj);
    }

    public void setFieldValue(Field field, Object obj) {
        setFieldValue(field, obj, false);
    }

    public void sortFields(List<Field> list, List<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            String str = (String) ListProtector.get(list2, i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (str.equals(((Field) ListProtector.get(list, i2)).getName())) {
                    Collections.swap(list, i, i2);
                    break;
                }
                i2++;
            }
        }
    }

    public void useMemory(Pointer pointer, int i) {
        useMemory(pointer, i, false);
    }

    public Structure(Pointer pointer, int i) {
        this(pointer, i, null);
    }

    public static List<String> createFieldsOrder(List<String> list, String... strArr) {
        return createFieldsOrder(list, (List<String>) Arrays.asList(strArr));
    }

    public static <T extends Structure> T newInstance(Class<T> cls, long j) {
        Pointer pointer;
        try {
            if (j != 0) {
                pointer = new Pointer(j);
            } else {
                pointer = PLACEHOLDER_MEMORY;
            }
            T t = (T) newInstance(cls, pointer);
            if (j != 0) {
                t.conditionalAutoRead();
            }
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LOG.log(Level.WARNING, "JNA: Error creating structure", th);
            return null;
        }
    }

    public void writeField(String str, Object obj) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            setFieldValue(structField.field, obj);
            writeField(structField, obj);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No such field: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public Structure(Pointer pointer, int i, TypeMapper typeMapper) {
        this.size = -1;
        this.nativeStrings = new HashMap(8);
        this.autoRead = true;
        this.autoWrite = true;
        setAlignType(i);
        setStringEncoding(Native.getStringEncoding(getClass()));
        initializeTypeMapper(typeMapper);
        validateFields();
        if (pointer != null) {
            useMemory(pointer, 0, true);
        } else {
            allocateMemory(-1);
        }
        initializeFields();
    }

    private void setFieldValue(Field field, Object obj, boolean z) {
        try {
            field.set(this, obj);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            if (Modifier.isFinal(field.getModifiers())) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("This VM does not support Structures with final fields (field '");
                    sbLIZ.append(field.getName());
                    sbLIZ.append("' within ");
                    sbLIZ.append(getClass());
                    sbLIZ.append(")");
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ), e);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Attempt to write to read-only field '");
                sbLIZ2.append(field.getName());
                sbLIZ2.append("' within ");
                sbLIZ2.append(getClass());
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2), e);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unexpectedly unable to write to field '");
            sbLIZ3.append(field.getName());
            sbLIZ3.append("' within ");
            sbLIZ3.append(getClass());
            throw new Error(C2188811AlT.LIZIZ(sbLIZ3), e);
        }
    }

    private String toString(int i, boolean z, boolean z2) {
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        ensureAllocated();
        String strLineSeparator = System.lineSeparator();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(format(getClass()));
        sbLIZ.append(e3.h);
        sbLIZ.append(getPointer());
        sbLIZ.append(")");
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ);
        if (!(getPointer() instanceof Memory)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ4);
            sbLIZ2.append(" (");
            sbLIZ2.append(size());
            sbLIZ2.append(" bytes)");
            strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String strLIZIZ5 = "";
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ5);
            sbLIZ3.append("  ");
            strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (!z) {
            strLIZIZ = "...}";
        } else {
            Iterator<StructField> it2 = fields().values().iterator();
            strLIZIZ = strLineSeparator;
            while (it2.hasNext()) {
                StructField next = it2.next();
                Object fieldValue = getFieldValue(next.field);
                String str = format(next.type);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(strLIZIZ5);
                String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ4);
                if (!next.type.isArray() || fieldValue == null) {
                    strLIZIZ2 = "";
                } else {
                    str = format(next.type.getComponentType());
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(e3.e);
                    sbLIZ5.append(Array.getLength(fieldValue));
                    sbLIZ5.append(e3.f);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ6);
                sbLIZ6.append(C786410Ut5.j4("  %s %s%s@0x%X", new Object[]{str, next.name, strLIZIZ2, Integer.valueOf(next.offset)}));
                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ6);
                if (fieldValue instanceof Structure) {
                    fieldValue = ((Structure) fieldValue).toString(i + 1, !(fieldValue instanceof ByReference), z2);
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ7);
                sbLIZ7.append("=");
                String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ7);
                if (fieldValue instanceof Long) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strLIZIZ8);
                    sbLIZ8.append(C786410Ut5.j4("0x%08X", new Object[]{fieldValue}));
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ8);
                } else if (fieldValue instanceof Integer) {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(strLIZIZ8);
                    sbLIZ9.append(C786410Ut5.j4("0x%04X", new Object[]{fieldValue}));
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ9);
                } else if (fieldValue instanceof Short) {
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append(strLIZIZ8);
                    sbLIZ10.append(C786410Ut5.j4("0x%02X", new Object[]{fieldValue}));
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ10);
                } else if (fieldValue instanceof Byte) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(strLIZIZ8);
                    sbLIZ11.append(C786410Ut5.j4("0x%01X", new Object[]{fieldValue}));
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ11);
                } else {
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append(strLIZIZ8);
                    sbLIZ12.append(String.valueOf(fieldValue).trim());
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ12);
                }
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append(strLIZIZ3);
                sbLIZ13.append(strLineSeparator);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ13);
                if (!it2.hasNext()) {
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append(strLIZIZ);
                    sbLIZ14.append(strLIZIZ5);
                    sbLIZ14.append("}");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ14);
                }
            }
        }
        if (i == 0 && z2) {
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append(strLIZIZ);
            sbLIZ15.append(strLineSeparator);
            sbLIZ15.append("memory dump");
            sbLIZ15.append(strLineSeparator);
            String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ15);
            byte[] byteArray = getPointer().getByteArray(0L, size());
            for (int i3 = 0; i3 < byteArray.length; i3++) {
                int i4 = i3 % 4;
                if (i4 == 0) {
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append(strLIZIZ9);
                    sbLIZ16.append(e3.e);
                    strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ16);
                }
                byte b = byteArray[i3];
                if (b >= 0 && b < 16) {
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append(strLIZIZ9);
                    sbLIZ17.append(CardStruct.IStatusCode.DEFAULT);
                    strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ17);
                }
                StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                sbLIZ18.append(strLIZIZ9);
                sbLIZ18.append(Integer.toHexString(byteArray[i3] & 255));
                strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ18);
                if (i4 == 3 && i3 < byteArray.length - 1) {
                    StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                    sbLIZ19.append(strLIZIZ9);
                    sbLIZ19.append(e3.f);
                    sbLIZ19.append(strLineSeparator);
                    strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ19);
                }
            }
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append(strLIZIZ9);
            sbLIZ20.append(e3.f);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ20);
        }
        return strLIZIZ4 + " {" + strLIZIZ;
    }

    public static <T extends Structure> T updateStructureByReference(Class<T> cls, T t, Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        if (t != null && pointer.equals(t.getPointer())) {
            t.autoRead();
            return t;
        }
        T t2 = (T) reading().get(pointer);
        if (t2 != null && cls.equals(t2.getClass())) {
            t2.autoRead();
            return t2;
        }
        T t3 = (T) newInstance(cls, pointer);
        t3.conditionalAutoRead();
        return t3;
    }

    public int getNativeAlignment(Class<?> cls, Object obj, boolean z) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            cls = nativeMappedConverter.nativeType();
            obj = nativeMappedConverter.toNative(obj, new ToNativeContext());
        }
        int nativeSize = Native.getNativeSize(cls, obj);
        if (!cls.isPrimitive() && Long.class != cls && Integer.class != cls && Short.class != cls && Character.class != cls && Byte.class != cls && Boolean.class != cls && Float.class != cls && Double.class != cls) {
            if ((!Pointer.class.isAssignableFrom(cls) || Function.class.isAssignableFrom(cls)) && ((!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(cls)) && !Callback.class.isAssignableFrom(cls) && WString.class != cls && String.class != cls)) {
                if (Structure.class.isAssignableFrom(cls)) {
                    if (ByReference.class.isAssignableFrom(cls)) {
                        nativeSize = Native.POINTER_SIZE;
                    } else {
                        if (obj == null) {
                            obj = newInstance(cls, PLACEHOLDER_MEMORY);
                        }
                        nativeSize = ((Structure) obj).getStructAlignment();
                    }
                } else if (cls.isArray()) {
                    nativeSize = getNativeAlignment(cls.getComponentType(), null, z);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Type ");
                    sbLIZ.append(cls);
                    sbLIZ.append(" has unknown native alignment");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                nativeSize = Native.POINTER_SIZE;
            }
        }
        int i = this.actualAlignType;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return Math.min(8, nativeSize);
        }
        if (i != 2) {
            return nativeSize;
        }
        if (z && Platform.isMac() && Platform.isPPC()) {
            return nativeSize;
        }
        int iMin = Math.min(Native.MAX_ALIGNMENT, nativeSize);
        if (z || !Platform.isAIX()) {
            return iMin;
        }
        if (cls != Double.TYPE && cls != Double.class) {
            return iMin;
        }
        return 4;
    }

    public void useMemory(Pointer pointer, int i, boolean z) {
        try {
            this.nativeStrings.clear();
            if ((this instanceof ByValue) && !z) {
                int size = size();
                byte[] bArr = new byte[size];
                pointer.read(0L, bArr, 0, size);
                this.memory.write(0L, bArr, 0, size);
            } else {
                if (this.size == -1) {
                    this.size = calculateSize(false);
                }
                int i2 = this.size;
                if (i2 != -1) {
                    this.memory = pointer.share(i, i2);
                } else {
                    this.memory = pointer.share(i);
                }
            }
            this.array = null;
            this.readCalled = false;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException("Structure exceeds provided memory bounds", e);
        }
    }
}
