package com.bytedance.touchpoint.core.pendant.feed.lite;

import X.C01GW;
import X.C0J3E;
import X.C1220000hqw;
import X.C13LE;
import X.C1894700zPA;
import X.C1898700zVc;
import X.C1898770zVj;
import X.C2178808gE;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC452301pR;
import android.content.Context;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.Status;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.data.parser.notify.LiteFeedTimerPendantViewModel;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public final class LiteFeedTimerPendantManger extends FeedTimerPendantManger {
    public static final C01GW<LiteFeedTimerPendantManger> LLJLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS217S0000000_28.get$arr$(58));
    public final int LLJLILLLLZIIL = 28;
    public final String LLJLL = "LiteFeedTimerPendantManger";
    public final String LLJLLIL = "feed";

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIJLIJ() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(LiteFeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(16), null, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final Integer LJJLIIIJJIZ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return C2178808gE.LIZ().LIZIZ(77);
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger
    /* JADX INFO: renamed from: LJLIIIL */
    public final TimerPendant LJIIZILJ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return (TimerPendant) C2178808gE.LIZ().LJ(77);
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final /* bridge */ /* synthetic */ TimerPendant LJIIZILJ() {
        return LJIIZILJ();
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final String LJIILL() {
        return this.LLJLLIL;
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger
    public final int LJLI() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger
    public final String LJLIIL() {
        return this.LLJLL;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final C1898700zVc LJJJJIZL(Context context) {
        return new C1898770zVj(context);
    }

    @Override // com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger, com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLIIIJ(TaskEvent taskEvent) throws JSONException {
        String str;
        C1898700zVc c1898700zVc;
        super.LJJLIIIJ(taskEvent);
        Status status = taskEvent.status;
        if (status != null) {
            str = status.status;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "finished") && (c1898700zVc = this.LLIZ) != null) {
            c1898700zVc.LLJJIJIL = 0;
            c1898700zVc.getProgressBarTimerView().LIZ(1.0f);
        }
    }
}
