package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner;

import X.C0O2M;
import X.C1134410fct;
import X.C1134900fdg;
import X.EnumC1134460fcy;
import X.EnumC1144180fse;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskProgressViewModel extends AssemViewModel<C0O2M> {
    public final TouchPointAbility LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0O2M(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner.TaskProgressViewModel.wQ2():void");
    }

    public TaskProgressViewModel(TouchPointAbility touchPointAbility) {
        this.LL = touchPointAbility;
    }

    public static EnumC1144180fse vQ2(C1134410fct c1134410fct) {
        if (C1134900fdg.LIZIZ(c1134410fct)) {
            return EnumC1144180fse.CURRENT;
        }
        if (c1134410fct.LIZJ() == EnumC1134460fcy.TASK_EXIT) {
            return EnumC1144180fse.COMPLETED;
        }
        if (c1134410fct.LIZJ() == EnumC1134460fcy.TASK_ENTER) {
            return EnumC1144180fse.UPCOMING;
        }
        return EnumC1144180fse.UPCOMING;
    }
}
