package com.ss.android.ugc.tiktok.location.utils;

import X.C020W;
import X.C1207400hWc;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1798550wu5;
import X.C20489080x;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiExpLocationPopupManager$getLifecycleEventObserver$1 implements LifecycleEventObserver {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C1207520hWo LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        String str;
        String str2;
        ILocationBaseServiceForMT iLocationBaseServiceForMT;
        if (event == Lifecycle.Event.ON_RESUME && C1207450hWh.LIZ.LJII(0, this.LL)) {
            if (C1798550wu5.LIZIZ.LJIJI(this.LL) == 2 && (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) != null) {
                iLocationBaseServiceForMT.LIZIZ(true);
            }
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            C1207520hWo c1207520hWo = this.LLILLJJLI;
            String str3 = null;
            if (c1207520hWo != null) {
                str = c1207520hWo.LIZ;
                str2 = c1207520hWo.LIZIZ;
                str3 = c1207520hWo.LIZLLL;
            } else {
                str = null;
                str2 = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
            C020W c020w = new C020W(this.LL, this.LLILLJJLI, 19);
            c1207400hWc.getClass();
            C1207400hWc.LJIILJJIL(1, jCurrentTimeMillis, str, str2, str3, c020w);
            C20489080x.LIZ.getClass();
            C20489080x.LIZLLL().storeBoolean("location_permission_is_allow", true);
            this.LLILZ.invoke();
            ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
        }
    }

    public PoiExpLocationPopupManager$getLifecycleEventObserver$1(Context context, C1207520hWo c1207520hWo, long j, Function0<Unit> function0) {
        this.LL = context;
        this.LLILLJJLI = c1207520hWo;
        this.LLILLL = j;
        this.LLILZ = function0;
    }
}
