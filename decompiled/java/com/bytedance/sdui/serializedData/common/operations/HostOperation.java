package com.bytedance.sdui.serializedData.common.operations;

import com.bytedance.sdui.serializedData.AbsSerializedData;

/* JADX INFO: loaded from: classes21.dex */
public final class HostOperation extends AbsSerializedData {
    public AbsSerializedData LIZ;
    public FontOperation LIZIZ;
    public NodeOperation LIZJ;
    public NodeOperation LIZLLL;
    public LayoutOperation LJ;
    public ExtraOperation LJFF;
    public TreeOperation LJI;
    public TreeOperation LJII;
    public TreeOperation LJIIIIZZ;
    public KeyFrameOperation LJIIIZ;
    public EventAction LJIIJ;
    public UIOperation LJIIJJI;
    public CustomOperation LJIIL;
    public DetailOperation LJIILIIL;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.LIZJ != null) {
            sb.append("C:");
            sb.append(this.LIZJ);
        }
        if (this.LIZLLL != null) {
            sb.append("N:");
            sb.append(this.LIZLLL);
        }
        if (this.LJ != null) {
            sb.append("L:");
            sb.append(this.LJ);
        }
        if (this.LJI != null) {
            sb.append("I:");
            sb.append(this.LJI);
        }
        if (this.LJII != null) {
            sb.append("R:");
            sb.append(this.LJII);
        }
        if (this.LJIIIIZZ != null) {
            sb.append("D:");
            sb.append(this.LJIIIIZZ);
        }
        return sb.toString();
    }
}
