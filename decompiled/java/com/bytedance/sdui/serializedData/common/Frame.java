package com.bytedance.sdui.serializedData.common;

import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.operations.HostOperation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class Frame extends AbsSerializedData {
    public long LIZ;
    public List<HostOperation> LIZIZ;

    public final String toString() {
        return String.valueOf(this.LIZIZ);
    }
}
