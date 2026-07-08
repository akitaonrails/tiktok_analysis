package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum MirrorType {
    MIRROR_TYPE_NONE(0),
    MIRROR_TYPE_RENDER(1),
    MIRROR_TYPE_RENDER_AND_ENCODER(3);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == MIRROR_TYPE_NONE ? "kMirrorTypeNone" : this == MIRROR_TYPE_RENDER ? "kMirrorTypeRender" : this == MIRROR_TYPE_RENDER_AND_ENCODER ? "kMirrorTypeRenderAndEncoder" : "";
    }

    public int value() {
        return this.value;
    }

    public static MirrorType fromId(int i) {
        for (MirrorType mirrorType : values()) {
            if (mirrorType.value() == i) {
                return mirrorType;
            }
        }
        return null;
    }

    public static MirrorType valueOf(String str) {
        return (MirrorType) C08FF.LIZ(MirrorType.class, str);
    }

    MirrorType(int i) {
        this.value = i;
    }
}
