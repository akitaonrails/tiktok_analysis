package com.bytedance.touchpoint.core.shortdrama;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C01U6;
import X.C0A4I;
import X.C0J3E;
import X.C1220000hqw;
import X.C13LE;
import X.C1619720sFe;
import X.C1894700zPA;
import X.C1898110zUf;
import X.C1898160zUk;
import X.C1898460zVE;
import X.C1898700zVc;
import X.C2178808gE;
import X.C274780Apo;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC452301pR;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.Status;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.data.parser.notify.ShortDramaViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ShortDramaTimerPendantManager extends BaseTaskEventTimerPendantManager {
    public static final C01GW<ShortDramaTimerPendantManager> LLJJJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS217S0000000_28.get$arr$(60));

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIILJJIL() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final String LJIILL() {
        return "drama";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIJLIJ() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLJ() {
        LJJJLZIJ(false, true);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(ShortDramaViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(18), null, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final TimerPendant LJIIZILJ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return (TimerPendant) C2178808gE.LIZ().LJ(83);
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIJI() {
        C1898460zVE c1898460zVEPop;
        try {
            if (this.LLILZLL.size() <= 0 || (c1898460zVEPop = this.LLILZLL.pop()) == null) {
                return;
            }
            LJIIJ(c1898460zVEPop.LIZIZ, c1898460zVEPop.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIJJ() {
        try {
            this.LLILZLL.add(new C1898460zVE(this.LL, this.LLILLJJLI));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIJJLI() {
        try {
            Iterator<C1898460zVE> it2 = this.LLILZLL.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ, this.LLILLJJLI)) {
                    it2.remove();
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIJIIJIL() {
        C1898700zVc c1898700zVc;
        if (((Boolean) C0A4I.LIZ.getValue()).booleanValue() && (c1898700zVc = this.LLIZ) != null) {
            c1898700zVc.setClientControlCloseable(true);
        }
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            abstractC1896090zRP.LJJJIL(this.LLIZ);
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final String LJJJ() {
        String str;
        IWatchVideoService.LIZ.getClass();
        IWatchVideoService iWatchVideoServiceLIZ = C1898160zUk.LIZ();
        if (iWatchVideoServiceLIZ != null) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent == null || (str = taskEvent.taskEventKey) == null) {
                str = "";
            }
            String strLIZ = iWatchVideoServiceLIZ.LIZ(str);
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return "";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJJL() {
        String str;
        if (((Boolean) C0A4I.LIZ.getValue()).booleanValue()) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent != null && (str = taskEvent.taskEventKey) != null) {
                C1898110zUf.LL.getClass();
                C1898110zUf.LJIILJJIL(str);
            }
            if (((Boolean) C274780Apo.LIZ.getValue()).booleanValue()) {
                C01U6.LIZIZ(new AwS572S0100000_28(this, 716));
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final Integer LJJLIIIJJIZ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return C2178808gE.LIZ().LIZIZ(83);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJZ() {
        ReportInstruction reportInstruction;
        Integer num;
        Integer num2;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            int iIntValue = (taskEvent == null || (num2 = taskEvent.LIZJ) == null) ? 0 : num2.intValue();
            TaskEvent taskEvent2 = this.LLJJIJIIJIL;
            int iIntValue2 = (taskEvent2 == null || (reportInstruction = taskEvent2.reportInstruction) == null || (num = reportInstruction.reportBatch) == null) ? 20 : num.intValue();
            if (iIntValue < 0 || iIntValue2 < 0 || iIntValue > iIntValue2 || c1898700zVc.LLJJIJIL > iIntValue) {
                return;
            }
            C786410Ut5.LLLLLILLIL(c1898700zVc.getProgressBarTimerView(), 0);
            c1898700zVc.LLJJIJIL = iIntValue;
            c1898700zVc.getProgressBarTimerView().LIZ(iIntValue / iIntValue2);
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final boolean LJJJJZ() {
        Status status;
        if (!LJJ() || !this.LLIZLLLIL) {
            return false;
        }
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        return (Intrinsics.LJFF((taskEvent == null || (status = taskEvent.status) == null) ? null : status.status, "finished") || this.LLJILLL) ? false : true;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final boolean LJJIJ() {
        return this.LLJILLL;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLIIIJ(TaskEvent taskEvent) {
        Integer num;
        TimeInfo timeInfo;
        C1898110zUf c1898110zUf = C1898110zUf.LL;
        DisplayInfo displayInfo = taskEvent.displayInfo;
        if (displayInfo != null && (timeInfo = displayInfo.timeInfo) != null) {
            num = timeInfo.timerLaunchPlayId;
        } else {
            num = null;
        }
        c1898110zUf.getClass();
        if (C1898110zUf.LJIIL(num)) {
            return;
        }
        super.LJJLIIIJ(taskEvent);
    }
}
