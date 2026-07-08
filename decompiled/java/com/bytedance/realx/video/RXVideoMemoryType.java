package com.bytedance.realx.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum RXVideoMemoryType {
    kUNKNOWN(0),
    kBYTE_MEMORY(1),
    kOPENGL_TEXTURE(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static RXVideoMemoryType fromId(int i) {
        if (RXEnumConfig.enableEnumOptimizationStrategy) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 3) {
                        return kOPENGL_TEXTURE;
                    }
                    return null;
                }
                return kBYTE_MEMORY;
            }
            return kUNKNOWN;
        }
        for (RXVideoMemoryType rXVideoMemoryType : values()) {
            if (rXVideoMemoryType.value() == i) {
                return rXVideoMemoryType;
            }
        }
        return null;
    }

    public static RXVideoMemoryType valueOf(String str) {
        return (RXVideoMemoryType) C08FF.LIZ(RXVideoMemoryType.class, str);
    }

    RXVideoMemoryType(int i) {
        this.value = i;
    }
}
