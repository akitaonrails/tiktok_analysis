package com.bytedance.ies.xelement.overlay;

import X.C1321740kV2;
import X.C1321780kV6;
import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxOverlayViewCaptureHelper {
    public final ArrayList<Dialog> getGlobalOverlayView() {
        ArrayList<Dialog> arrayList = new ArrayList<>();
        Iterator it2 = ((ArrayList) C1321740kV2.LIZ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1321780kV6) it2.next()).LIZIZ);
        }
        return arrayList;
    }
}
