package com.ss.android.ugc.aweme.poi.map.lynxmap;

import X.C1179560gni;
import X.C1179580gnk;
import X.C1179600gnm;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LynxMapElement extends UISimpleView<C1179560gni> {
    public C1179560gni LL;

    public LynxMapElement(s sVar) {
        super(sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1179580gnk LJJIIZI(com.lynx.react.bridge.ReadableMap r37) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.map.lynxmap.LynxMapElement.LJJIIZI(com.lynx.react.bridge.ReadableMap):X.0gnk");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C1179560gni c1179560gni = new C1179560gni(context);
        this.LL = c1179560gni;
        return c1179560gni;
    }

    @InterfaceC1967107nB
    public final void updateDynamicMapData(ReadableMap readableMap, Callback callback) {
        try {
            C1179580gnk c1179580gnkLJJIIZI = LJJIIZI(readableMap);
            boolean zLIZ = C1179600gnm.LIZ(c1179580gnkLJJIIZI);
            C1179560gni c1179560gni = this.LL;
            if (c1179560gni != null) {
                c1179560gni.LIZIZ(zLIZ, c1179580gnkLJJIIZI, this.mContext, new AwS597S0100000_18(callback, 390));
            }
            C1179560gni c1179560gni2 = this.LL;
            if (c1179560gni2 != null) {
                c1179560gni2.setCameraMoveListener$poi_release(new AwS562S0100000_18(this, 1370));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            callback.invoke(4);
        }
    }
}
