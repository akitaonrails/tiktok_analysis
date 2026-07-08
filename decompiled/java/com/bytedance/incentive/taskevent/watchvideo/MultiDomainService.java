package com.bytedance.incentive.taskevent.watchvideo;

import X.C01U6;
import X.C1898970zW3;
import X.C1898980zW4;
import X.C1898990zW5;
import X.C1899160zWM;
import X.InterfaceC1898130zUh;
import X.InterfaceC1898200zUo;
import X.InterfaceC1898430zVB;
import X.InterfaceC1898470zVF;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS156S0400000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class MultiDomainService implements IMultiDomainService {
    public final List<C1898990zW5> LIZ = new ArrayList();

    @Override // com.bytedance.touchpoint.api.service.IMultiDomainService
    public final void clear() {
        C01U6.LIZIZ(new C1899160zWM(this));
    }

    @Override // com.bytedance.touchpoint.api.service.IMultiDomainService
    public final InterfaceC1898200zUo LIZJ() {
        return C1898980zW4.LIZ;
    }

    @Override // com.bytedance.touchpoint.api.service.IMultiDomainService
    public final InterfaceC1898430zVB LIZLLL() {
        return C1898970zW3.LIZ;
    }

    public static BaseTaskEventTimerPendantManager LIZ(Integer num, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (num != null && iIntValue == num.intValue()) {
                Object value = entry.getValue();
                if (value instanceof BaseTaskEventTimerPendantManager) {
                    return (BaseTaskEventTimerPendantManager) value;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.touchpoint.api.service.IMultiDomainService
    public final void LIZIZ(List<InterfaceC1898130zUh> list, List<TaskEvent> list2, Map<Integer, InterfaceC1898470zVF<TaskEvent>> map) {
        C01U6.LIZIZ(new AwS156S0400000_28(this, (MultiDomainService) list, (List<InterfaceC1898130zUh>) list2, (List<TaskEvent>) map, (Map<Integer, InterfaceC1898470zVF<TaskEvent>>) 0));
    }
}
