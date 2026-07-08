package com.lynx.xelement.overlay;

import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1312290kFn;
import X.EnumC1300260jwO;
import X.InterfaceC1312240kFi;
import android.util.DisplayMetrics;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.utils.DisplayMetricsHolder;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIOverlayShadowNode extends ShadowNode implements InterfaceC1312240kFi {
    public LynxUIOverlayShadowNode() {
        LJI(this);
    }

    @Override // X.InterfaceC1312240kFi
    public final C1312250kFj LIZ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        if (LJIIJ() > 0) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(0);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(this.LJIIL);
                C1312230kFh c1312230kFh2 = new C1312230kFh();
                c1312230kFh2.LIZJ = displayMetricsLIZ.heightPixels;
                c1312230kFh2.LIZ = displayMetricsLIZ.widthPixels;
                EnumC1300260jwO enumC1300260jwO = EnumC1300260jwO.EXACTLY;
                c1312230kFh2.LIZIZ = enumC1300260jwO;
                c1312230kFh2.LIZLLL = enumC1300260jwO;
                ((NativeLayoutNodeRef) shadowNodeLJIIIZ).LJJIIJ(c1312280kFm, c1312230kFh2);
                return new C1312250kFj(0.0f, 0.0f);
            }
        }
        return new C1312250kFj(0.0f, 0.0f);
    }

    @Override // X.InterfaceC1312240kFi
    public final void LIZJ(C1312290kFn c1312290kFn, C1312260kFk c1312260kFk) {
        if (LJIIJ() > 0) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(0);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                ((NativeLayoutNodeRef) shadowNodeLJIIIZ).LJJIII(new C1312260kFk());
            }
        }
    }
}
