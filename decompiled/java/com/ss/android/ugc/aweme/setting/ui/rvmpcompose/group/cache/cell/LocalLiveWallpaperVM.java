package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell;

import X.C0WZX;
import X.C1701330uNH;
import X.C1928607gy;
import X.C2014807us;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2413209cw;
import X.InterfaceC0148002o;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalLiveWallpaperVM extends BaseCellSettingsVM<C2014807us> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        Integer num;
        C1928607gy c1928607gy = new C1928607gy(this);
        C2413209cw.LIZ.getClass();
        IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
        if (iWallpaperServiceApiLIZ != null) {
            iWallpaperServiceApiLIZ.LJ();
            num = 2131858405;
        } else {
            num = null;
        }
        return new C2014807us(num, c1928607gy, new AwS617S0100000_3(this, 52));
    }

    public final void vQ2(Context context, String str) {
        Intent intentLJIIIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("live_photo_manage", c2344009Gk.LIZ);
        C2413209cw.LIZ.getClass();
        IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
        if (iWallpaperServiceApiLIZ != null && (intentLJIIIZ = iWallpaperServiceApiLIZ.LJIIIZ(context)) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLJIIIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLJIIIZ, context);
            C2204961BRm.LJJJJJL(context, intentLJIIIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuCtjTYRy5/09WyX5gSio7DBR/xl7oUqiEB70rPkvc7BmxLkefleDV4kqjzCFc+gQvWw==", null));
        }
    }
}
