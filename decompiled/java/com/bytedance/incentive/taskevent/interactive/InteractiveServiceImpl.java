package com.bytedance.incentive.taskevent.interactive;

import X.AbstractC1899090zWF;
import X.C01U6;
import X.C1619720sFe;
import X.C1896810zSZ;
import X.C1898870zVt;
import X.C1899010zW7;
import X.C1899020zW8;
import X.C1899030zW9;
import X.C1899040zWA;
import X.C1899080zWE;
import X.C1899180zWO;
import X.InterfaceC1897260zTI;
import X.InterfaceC1898130zUh;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserInfo;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InteractiveServiceImpl implements IInteractiveService {
    public final List<C1899010zW7> LIZIZ = new ArrayList();
    public final List<C1899020zW8> LIZJ = new ArrayList();
    public final List<C1899030zW9> LIZLLL = new ArrayList();
    public final List<C1899040zWA> LJ = new ArrayList();

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final void clear() {
        C01U6.LIZIZ(new C1899180zWO(this));
    }

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final void LIZ(C1896810zSZ c1896810zSZ) {
        String str;
        C1899080zWE c1899080zWE;
        Integer num;
        for (C1899040zWA c1899040zWA : (ArrayList) this.LJ) {
            if (c1899040zWA.LLILLJJLI && C1898870zVt.LIZ(c1896810zSZ, c1899040zWA.LLILZ)) {
                String str2 = c1896810zSZ.LJIIJJI;
                UserInfo userInfo = c1899040zWA.LLIZ;
                if (userInfo != null) {
                    str = userInfo.userId;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str2, str)) {
                    int iIntValue = 1;
                    c1899040zWA.LLIZLLLIL++;
                    c1899040zWA.LLIZ = new UserInfo(c1896810zSZ.LJIIJJI);
                    int i = c1899040zWA.LLIZLLLIL;
                    ReportInstruction reportInstruction = c1899040zWA.LL.reportInstruction;
                    if (reportInstruction != null && (num = reportInstruction.reportBatch) != null) {
                        iIntValue = num.intValue();
                    }
                    if (i >= iIntValue) {
                        TaskEventContent taskEventContentLJIILL = c1899040zWA.LJIILL();
                        c1899040zWA.LJ();
                        if (taskEventContentLJIILL != null && (c1899080zWE = c1899040zWA.LLILLL) != null) {
                            c1899080zWE.LJIIJJI(taskEventContentLJIILL, true, null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != null) {
                            interfaceC1897260zTILIZIZ.LIZ("timed_task_time_up", linkedHashMap);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final void LIZIZ(C1896810zSZ c1896810zSZ) {
        C01U6.LIZIZ(new AwS429S0200000_28(this, c1896810zSZ, 2));
    }

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final void LIZLLL(C1896810zSZ c1896810zSZ) {
        C01U6.LIZIZ(new AwS429S0200000_28(this, c1896810zSZ, 4));
    }

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final boolean LJ(String str) {
        Object next;
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1899090zWF abstractC1899090zWF = (AbstractC1899090zWF) next;
        if (abstractC1899090zWF != null) {
            return abstractC1899090zWF.LLILLJJLI;
        }
        return false;
    }

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final void LJFF(C1896810zSZ c1896810zSZ) {
        C01U6.LIZIZ(new AwS429S0200000_28(this, c1896810zSZ, 3));
    }

    @Override // com.bytedance.touchpoint.api.service.IInteractiveService
    public final void LIZJ(List<InterfaceC1898130zUh> list, List<TaskEvent> list2) {
        C01U6.LIZIZ(new AwS272S0300000_28(this, (InteractiveServiceImpl) list, (List<InterfaceC1898130zUh>) list2, (List<TaskEvent>) 0));
    }
}
