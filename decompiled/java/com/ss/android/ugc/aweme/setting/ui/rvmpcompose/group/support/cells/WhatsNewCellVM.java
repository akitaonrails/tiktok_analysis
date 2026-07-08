package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C0WZX;
import X.C1701330uNH;
import X.C1927107gj;
import X.C2015207uw;
import X.C2204961BRm;
import X.C844470XAv;
import X.InterfaceC0148002o;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.spi.IWhatsNewService;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class WhatsNewCellVM extends BaseCellSettingsVM<C2015207uw> {
    public final boolean LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2015207uw(new C1927107gj(this), new AwS617S0100000_3(this, 11));
    }

    public WhatsNewCellVM() {
        C844470XAv.LIZ.getClass();
        this.LL = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
    }

    public final void vQ2(Context context) {
        IWhatsNewService iWhatsNewService;
        String strLIZ;
        if (this.LL && (iWhatsNewService = (IWhatsNewService) PluggableExtentionKt.pluggableSpi$default(IWhatsNewService.class, false, false, false, 14, null)) != null && (strLIZ = iWhatsNewService.LIZ()) != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(strLIZ));
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuCtjTYRy5/09WyX5gSio7DBR/1kr7SqLYEPYkN8fq+M4bsh6cB+inz0NDhaqoiQ==", null));
        }
    }
}
