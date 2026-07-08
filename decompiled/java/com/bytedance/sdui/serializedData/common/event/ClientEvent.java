package com.bytedance.sdui.serializedData.common.event;

import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.UpdateDataEvent;

/* JADX INFO: loaded from: classes21.dex */
public final class ClientEvent extends AbsSerializedData {
    public TouchEvent LIZ;
    public CustomEvent LIZIZ;
    public AbsSerializedData LIZJ;
    public GlobalEvent LIZLLL;
    public ModuleInvokeCallback LJ;
    public ModuleInvokeCallback LJFF;
    public UpdateViewPortEvent LJI;
    public final long LJII = System.currentTimeMillis();
    public UpdateDataEvent LJIIIIZZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append("touchEvent:");
            sb.append(this.LIZ);
        }
        if (this.LIZIZ != null) {
            sb.append("customEvent:");
            sb.append(this.LIZIZ);
        }
        if (this.LIZJ != null) {
            sb.append("destroyEvent:");
            sb.append(this.LIZJ);
        }
        if (this.LIZLLL != null) {
            sb.append("globalEvent:");
            sb.append(this.LIZLLL);
        }
        if (this.LJ != null) {
            sb.append("moduleCallback:");
            sb.append(this.LJ);
        }
        if (this.LJFF != null) {
            sb.append("jsCallback:");
            sb.append(this.LJFF);
        }
        if (this.LJI != null) {
            sb.append("viewPortEvent:");
            sb.append(this.LJI);
        }
        return sb.toString();
    }
}
