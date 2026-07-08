package com.sun.jna;

import X.C2188811AlT;
import com.sun.jna.Structure;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class Union extends Structure {
    public Structure.StructField activeField;

    @Override // com.sun.jna.Structure
    public List<String> getFieldOrder() {
        List<Field> fieldList = getFieldList();
        ArrayList arrayList = new ArrayList(fieldList.size());
        Iterator<Field> it2 = fieldList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getName());
        }
        return arrayList;
    }

    public Union() {
    }

    public Union(Pointer pointer) {
        super(pointer);
    }

    private Structure.StructField findField(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type.isAssignableFrom(cls)) {
                return structField;
            }
        }
        return null;
    }

    public Object getTypedValue(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type == cls) {
                this.activeField = structField;
                read();
                return getFieldValue(this.activeField.field);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No field of type ");
        sbLIZ.append(cls);
        sbLIZ.append(" in ");
        sbLIZ.append(this);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.sun.jna.Structure
    public Object readField(Structure.StructField structField) {
        if (structField == this.activeField || (!Structure.class.isAssignableFrom(structField.type) && !String.class.isAssignableFrom(structField.type) && !WString.class.isAssignableFrom(structField.type))) {
            return super.readField(structField);
        }
        return null;
    }

    public void setType(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type == cls) {
                this.activeField = structField;
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No field of type ");
        sbLIZ.append(cls);
        sbLIZ.append(" in ");
        sbLIZ.append(this);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Object setTypedValue(Object obj) {
        Structure.StructField structFieldFindField = findField(obj.getClass());
        if (structFieldFindField != null) {
            this.activeField = structFieldFindField;
            setFieldValue(structFieldFindField.field, obj);
            return this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No field of type ");
        sbLIZ.append(obj.getClass());
        sbLIZ.append(" in ");
        sbLIZ.append(this);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str) {
        ensureAllocated();
        setType(str);
        super.writeField(str);
    }

    public Union(TypeMapper typeMapper) {
        super(typeMapper);
    }

    @Override // com.sun.jna.Structure
    public Object readField(String str) {
        ensureAllocated();
        setType(str);
        return super.readField(str);
    }

    public void setType(String str) {
        ensureAllocated();
        Structure.StructField structField = fields().get(str);
        if (structField != null) {
            this.activeField = structField;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No field named ");
        sbLIZ.append(str);
        sbLIZ.append(" in ");
        sbLIZ.append(this);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.sun.jna.Structure
    public void writeField(Structure.StructField structField) {
        if (structField == this.activeField) {
            super.writeField(structField);
        }
    }

    public Union(Pointer pointer, int i) {
        super(pointer, i);
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str, Object obj) {
        ensureAllocated();
        setType(str);
        super.writeField(str, obj);
    }

    public Union(Pointer pointer, int i, TypeMapper typeMapper) {
        super(pointer, i, typeMapper);
    }

    @Override // com.sun.jna.Structure
    public int getNativeAlignment(Class<?> cls, Object obj, boolean z) {
        return super.getNativeAlignment(cls, obj, true);
    }
}
