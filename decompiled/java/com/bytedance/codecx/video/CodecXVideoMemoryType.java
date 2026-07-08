package com.bytedance.codecx.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum CodecXVideoMemoryType {
    kUNKNOWN(0),
    kBYTE_MEMORY(1),
    kOPENGL_TEXTURE(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static CodecXVideoMemoryType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return kUNKNOWN;
                }
                return kOPENGL_TEXTURE;
            }
            return kBYTE_MEMORY;
        }
        return kUNKNOWN;
    }

    public static CodecXVideoMemoryType valueOf(String str) {
        return (CodecXVideoMemoryType) C08FF.LIZ(CodecXVideoMemoryType.class, str);
    }

    CodecXVideoMemoryType(int i) {
        this.value = i;
    }
}
