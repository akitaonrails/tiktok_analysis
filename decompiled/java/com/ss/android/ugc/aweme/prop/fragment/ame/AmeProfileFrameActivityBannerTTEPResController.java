package com.ss.android.ugc.aweme.prop.fragment.ame;

import X.C0PEM;
import X.C1623606Xi;
import X.C2296808zG;
import X.C23250099c;
import X.C323930Cmt;
import X.C323950Cmv;
import X.C330840Cy2;
import X.C356901a3;
import X.C491001vg;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class AmeProfileFrameActivityBannerTTEPResController implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public View LL;
    public View LLILLJJLI;
    public final ArrayList<Function0<Unit>> LLILLL = new ArrayList<>();
    public AMEPublishCampaignItem LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final String LIZ() {
        String str;
        AMEPublishCampaignItem aMEPublishCampaignItem = this.LLILZ;
        return (aMEPublishCampaignItem == null || (str = aMEPublishCampaignItem.activityId) == null) ? "" : str;
    }

    public final void LIZIZ(Function0<Unit> function0) {
        this.LLILLL.add(function0);
        Object value = C323950Cmv.LIZJ.getValue();
        if ((value instanceof C1623606Xi) || (value instanceof C491001vg)) {
            function0.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C323950Cmv c323950Cmv = C323950Cmv.LIZ;
        if (!(C323950Cmv.LIZJ.getValue() instanceof C1623606Xi)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C323930Cmt(null), 3);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C330840Cy2(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLILLL.clear();
    }
}
