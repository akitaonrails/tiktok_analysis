package com.bytedance.touchpoint.core.pendant.videodetail;

import X.C01GW;
import X.C0J3E;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C1894700zPA;
import X.C2178808gE;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.data.parser.notify.DetailTaskEventPendantViewModel;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class DetailTaskEventPendantManager extends BaseTaskEventTimerPendantManager {
    public static final C01GW<DetailTaskEventPendantManager> LLJJJJJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(59));
    public Integer LLJJJJ;

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIILJJIL() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final String LJIILL() {
        return "video_detail";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(DetailTaskEventPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(17), null, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final TimerPendant LJIIZILJ() {
        if (this.LLJJJJ == null) {
            return null;
        }
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        Integer num = this.LLJJJJ;
        return (TimerPendant) c1894700zPALIZ.LJI(62, num != null ? num.intValue() : 0);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final Integer LJJLIIIJJIZ() {
        return this.LLJJJJ;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity activityLIZ;
        if (view != null && (context = view.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && !activityLIZ.isFinishing()) {
            activityLIZ.finish();
        }
    }
}
