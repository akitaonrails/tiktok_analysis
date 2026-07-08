package com.ss.android.vesdk;

import X.C2188811AlT;
import X.EnumC1463710oC1;
import X.EnumC1463790oC9;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class VEUserConfig {
    public Map<EnumC1463710oC1, VEUserConfigItem<?>> configItems = new HashMap();

    public static class VEUserConfigItem<T> {
        public EnumC1463790oC9 dataType;
        public EnumC1463710oC1 id;
        public T value;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEUserConfigItem{dataType=");
            sbLIZ.append(this.dataType);
            sbLIZ.append(", value=");
            sbLIZ.append(this.value);
            sbLIZ.append(", id=");
            sbLIZ.append(this.id);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EnumC1463790oC9 getDataType() {
            return this.dataType;
        }

        public T getValue() {
            return this.value;
        }

        public VEUserConfigItem(EnumC1463710oC1 enumC1463710oC1, T t) {
            if (t instanceof Boolean) {
                this.dataType = EnumC1463790oC9.BOOLEAN;
            } else if (t instanceof Integer) {
                this.dataType = EnumC1463790oC9.INTEGER;
            } else {
                throw new IllegalArgumentException("illegal value type");
            }
            this.id = enumC1463710oC1;
            this.value = t;
        }
    }

    public EnumC1463710oC1[] getConfigIDs() {
        Set<EnumC1463710oC1> setKeySet = this.configItems.keySet();
        EnumC1463710oC1[] enumC1463710oC1Arr = new EnumC1463710oC1[setKeySet.size()];
        setKeySet.toArray(enumC1463710oC1Arr);
        return enumC1463710oC1Arr;
    }

    public VEUserConfigItem<?>[] getConfigItems() {
        Collection<VEUserConfigItem<?>> collectionValues = this.configItems.values();
        VEUserConfigItem<?>[] vEUserConfigItemArr = new VEUserConfigItem[collectionValues.size()];
        collectionValues.toArray(vEUserConfigItemArr);
        return vEUserConfigItemArr;
    }

    public VEUserConfig addConfig(VEUserConfigItem<?> vEUserConfigItem) {
        this.configItems.put(vEUserConfigItem.id, vEUserConfigItem);
        return this;
    }

    public VEUserConfigItem<?> getConfigItem(EnumC1463710oC1 enumC1463710oC1) {
        return this.configItems.get(enumC1463710oC1);
    }
}
