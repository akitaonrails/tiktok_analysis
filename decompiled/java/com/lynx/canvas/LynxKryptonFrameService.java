package com.lynx.canvas;

import X.C1288360jdC;
import X.InterfaceC1285170jY3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class LynxKryptonFrameService extends b {
    public final ArrayList<InterfaceC1285170jY3> LIZ = new ArrayList<>();
    public final ArrayList<InterfaceC1285170jY3> LIZIZ = new ArrayList<>();
    public long LIZJ;

    private native long nativeCreateFrameService(long j);

    private native void nativeDestroyFrameService(long j);

    private native void nativeDoRegisterBeforeVSyncEndListener(long j);

    private native void nativeDoRequestVSync(long j);

    @Override // com.lynx.canvas.b
    public final void LIZJ(long j) {
    }

    @Override // a17.a0
    public final void onDestroy() {
        long j = this.LIZJ;
        if (j != 0) {
            nativeDestroyFrameService(j);
            this.LIZJ = 0L;
        }
    }

    public LynxKryptonFrameService(long j) {
        this.LIZJ = nativeCreateFrameService(j);
    }

    @Override // com.lynx.canvas.b
    public final void LIZ(C1288360jdC c1288360jdC) {
        this.LIZIZ.add(c1288360jdC);
        nativeDoRegisterBeforeVSyncEndListener(this.LIZJ);
    }

    @Override // com.lynx.canvas.b
    public final void LIZIZ(InterfaceC1285170jY3 interfaceC1285170jY3) {
        this.LIZ.add(interfaceC1285170jY3);
        nativeDoRequestVSync(this.LIZJ);
    }

    public void OnBeforeVSyncEnd(long j) {
        Iterator<InterfaceC1285170jY3> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().doFrame(j);
        }
    }

    public void OnVSync(long j) {
        ArrayList arrayList = new ArrayList(this.LIZ);
        this.LIZ.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1285170jY3) it2.next()).doFrame(j);
        }
    }
}
