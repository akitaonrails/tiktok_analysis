package com.lynx.tasm.behavior.ui.frame;

import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1312290kFn;
import X.EnumC1300260jwO;
import X.InterfaceC1312240kFi;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class FrameShadowNode extends CustomLayoutShadowNode implements InterfaceC1312240kFi {
    public int LJIL;
    public int LJJ;

    @Override // X.InterfaceC1312240kFi
    public final void LIZJ(C1312290kFn c1312290kFn, C1312260kFk c1312260kFk) {
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJ() {
        LJI(this);
        super.LJ();
    }

    @Override // X.InterfaceC1312240kFi
    public final C1312250kFj LIZ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        float f;
        float f2;
        C1312250kFj c1312250kFj;
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("input_width", String.valueOf(c1312230kFh.LIZ));
            map.put("input_height", String.valueOf(c1312230kFh.LIZJ));
            map.put("input_width_mode", c1312230kFh.LIZIZ.name());
            map.put("input_height_mode", c1312230kFh.LIZLLL.name());
            TraceEvent.LIZJ("FrameShadowNode.measure", map);
        }
        int i = this.LJIL;
        if (i == 0 && this.LJJ == 0) {
            c1312250kFj = new C1312250kFj(c1312230kFh.LIZ, c1312230kFh.LIZJ);
        } else {
            EnumC1300260jwO enumC1300260jwO = c1312230kFh.LIZIZ;
            EnumC1300260jwO enumC1300260jwO2 = EnumC1300260jwO.EXACTLY;
            if (enumC1300260jwO == enumC1300260jwO2) {
                f = c1312230kFh.LIZ;
            } else {
                f = i;
            }
            if (c1312230kFh.LIZLLL == enumC1300260jwO2) {
                f2 = c1312230kFh.LIZJ;
            } else {
                f2 = this.LJJ;
            }
            c1312250kFj = new C1312250kFj(f, f2);
        }
        if (TraceController.isTracingStarted()) {
            HashMap map2 = new HashMap();
            map2.put("width", String.valueOf(c1312250kFj.LIZ[0]));
            map2.put("height", String.valueOf(c1312250kFj.LIZ[1]));
            TraceEvent.LJIIIIZZ("FrameShadowNode.measure", map2);
        }
        return c1312250kFj;
    }
}
