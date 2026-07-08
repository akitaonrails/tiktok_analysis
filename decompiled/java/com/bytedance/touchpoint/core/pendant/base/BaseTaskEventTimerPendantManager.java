package com.bytedance.touchpoint.core.pendant.base;

import X.C01GW;
import X.C01U6;
import X.C1898110zUf;
import X.C1898440zVC;
import X.C1898700zVc;
import X.C1899450zWp;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.StartCondition;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseTaskEventTimerPendantManager extends BaseTimerPendantManager<TaskEvent> {
    public TaskEvent LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C1898440zVC());
    public Long LLJJJ;
    public String LLJJJIL;

    public abstract Integer LJJLIIIJJIZ();

    public void LJJLIIJ(TaskEvent taskEvent) {
    }

    public void LJJLJ() {
    }

    public void LJJLJLI() {
    }

    public boolean LJJLL() {
        return true;
    }

    public void LJJZ() {
    }

    public void LJJZZI(Bubble bubble, String str) {
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public void LJIILJJIL() {
        C1898110zUf c1898110zUf = C1898110zUf.LL;
        Integer numLJJLIIIJJIZ = LJJLIIIJJIZ();
        c1898110zUf.getClass();
        C01U6.LIZIZ(new AwS556S0100000_12(numLJJLIIIJJIZ, 701));
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJJIII() {
        C1898110zUf c1898110zUf = C1898110zUf.LL;
        Integer numLJJLIIIJJIZ = LJJLIIIJJIZ();
        String str = this.LLJJJIL;
        c1898110zUf.getClass();
        if (numLJJLIIIJJIZ != null) {
            numLJJLIIIJJIZ.intValue();
            C01U6.LIZIZ(new AwS143S1200000_28(this, numLJJLIIIJJIZ, str, 6));
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final String LJJIZ() {
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (taskEvent != null) {
            return taskEvent.taskEventKey;
        }
        return null;
    }

    public void LJJLIIIJILLIZJL() {
        StartCondition startCondition;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null) {
            int i = this.LLJ;
            c1898700zVc.LLJJIJIL = 0;
            c1898700zVc.getProgressBarTimerView().LIZ(0.0f);
            if (i != 2) {
                c1898700zVc.getCoinTextView().setText(CardStruct.IStatusCode.DEFAULT);
            }
            c1898700zVc.LJJIJIL();
        }
        LJJJJLL(0, LJJLIIIJLJLI());
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (Intrinsics.LJFF((taskEvent == null || (startCondition = taskEvent.startCondition) == null) ? null : startCondition.startMode, "manual")) {
            C1898110zUf c1898110zUf = C1898110zUf.LL;
            Integer numLJJLIIIJJIZ = LJJLIIIJJIZ();
            c1898110zUf.getClass();
            if (C1898110zUf.LJIIL(numLJJLIIIJJIZ)) {
                this.LLIZLLLIL = false;
                LJJJZ();
            }
        }
    }

    public void LJJLIIIJJI() {
        String str;
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (taskEvent != null && (str = taskEvent.taskEventKey) != null) {
            C1898110zUf.LL.getClass();
            C1898110zUf.LJIILIIL(str, false);
        }
        this.LLJILLL = false;
        LJJJLZIJ(true, true);
    }

    public final boolean LJJLIIIJLJLI() {
        ProgressInfo progressInfo;
        Boolean bool;
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (taskEvent == null || (progressInfo = taskEvent.progressInfo) == null || (bool = progressInfo.claimable) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void LJJLIIIJ(TaskEvent taskEvent) {
        String str;
        TimeInfo timeInfo;
        Boolean bool;
        C1898700zVc c1898700zVc;
        if (!LJJ()) {
            return;
        }
        this.LLJJIJIIJIL = taskEvent;
        if (this.LLIZLLLIL) {
            return;
        }
        C1898700zVc c1898700zVc2 = this.LLIZ;
        boolean zBooleanValue = false;
        if (c1898700zVc2 != null) {
            c1898700zVc2.LLJJIJIL = 0;
            c1898700zVc2.getProgressBarTimerView().LIZ(0.0f);
            c1898700zVc2.getCoinTextView().setText(CardStruct.IStatusCode.DEFAULT);
            c1898700zVc2.LJJIJIL();
        }
        C1898700zVc c1898700zVc3 = this.LLIZ;
        if (c1898700zVc3 != null) {
            C786410Ut5.j2(c1898700zVc3, 0);
        }
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        String str2 = null;
        if (timerPendant != null) {
            str = timerPendant.breathLottieName;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0 && (c1898700zVc = this.LLIZ) != null) {
            c1898700zVc.LLJJL = true;
            if (c1898700zVc.getVisibility() == 0 && c1898700zVc.LLJL) {
                C786410Ut5.LLLLLIL(c1898700zVc.getLottieView(), 8);
                C786410Ut5.LLLLLIL(c1898700zVc.getBreathLottieView(), 0);
                C1899450zWp.LIZIZ(c1898700zVc.getBreathLottieView(), Integer.MAX_VALUE);
            }
        }
        C1898700zVc c1898700zVc4 = this.LLIZ;
        if (c1898700zVc4 != null) {
            ProgressInfo progressInfo = taskEvent.progressInfo;
            if (progressInfo != null && (bool = progressInfo.claimable) != null) {
                zBooleanValue = bool.booleanValue();
            }
            c1898700zVc4.setClaimable(zBooleanValue);
        }
        this.LLIZLLLIL = true;
        LJJLIIJ(taskEvent);
        LJJJZ();
        LJJZ();
        DisplayInfo displayInfo = taskEvent.displayInfo;
        if (displayInfo != null && (timeInfo = displayInfo.timeInfo) != null) {
            str2 = timeInfo.status;
        }
        this.LLJI = String.valueOf(str2);
    }

    public String LJJLIIIJL(Context context) {
        return context.getString(2131858111);
    }

    public String LJJLIIIJLLLLLLLZ(Context context) {
        return context.getString(2131858110);
    }

    public final void LJJZZIII(String str) {
        String str2;
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (taskEvent != null) {
            str2 = taskEvent.taskEventKey;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            LJJJJLI();
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public void LJJJLZIJ(boolean z, boolean z2) {
        TaskEvent taskEvent;
        super.LJJJLZIJ(z, z2);
        if (LJJIJ()) {
            C1898700zVc c1898700zVc = this.LLIZ;
            if (c1898700zVc != null) {
                C786410Ut5.j2(c1898700zVc, 8);
                return;
            }
            return;
        }
        if (z && LJJLL() && (taskEvent = this.LLJJIJIIJIL) != null) {
            LJJJJ(taskEvent);
        }
    }
}
