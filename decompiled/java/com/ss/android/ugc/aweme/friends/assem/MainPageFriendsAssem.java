package com.ss.android.ugc.aweme.friends.assem;

import X.C0PEM;
import X.C1070740dyC;
import X.C1075960e6c;
import X.C1076010e6h;
import X.C1076020e6i;
import X.C1388190mED;
import X.C14EU;
import X.C1590970rVH;
import X.C23250099c;
import X.C295940Biq;
import X.C757530Tnb;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class MainPageFriendsAssem extends BaseMainPageFragmentAssem {
    public C1070740dyC LLILLJJLI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1070740dyC c1070740dyC = this.LLILLJJLI;
        if (c1070740dyC != null) {
            EventBus.LIZLLL().LJJI(c1070740dyC);
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1070740dyC c1070740dyC = this.LLILLJJLI;
        if (c1070740dyC == null || TextUtils.isEmpty(c1070740dyC.LIZ)) {
            return;
        }
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        if (c1076010e6h.LJ()) {
            if (C295940Biq.LIZ()) {
                if (C1075960e6c.LIZIZ.LIZIZ()) {
                    c1076010e6h.LJJ();
                }
            } else if (c1076010e6h.LJIILLIIL()) {
                c1076010e6h.LJJ();
            } else {
                c1076010e6h.LJI(c1070740dyC.LIZ);
            }
        }
        c1070740dyC.LIZ = "";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    public final void O9(ViewGroup viewGroup) {
        this.LLILLJJLI = new C1070740dyC();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPermissionPopupEvent(C1076020e6i c1076020e6i) {
        Context context;
        LifecycleCoroutineScope lifecycleScope;
        c1076020e6i.getClass();
        if (Intrinsics.LJFF("publish", "publish") && (context = getContext()) != null) {
            LifecycleOwner lifecycleOwnerLIZ = C1590970rVH.LIZ(this);
            if ((lifecycleOwnerLIZ != null || (lifecycleOwnerLIZ = C1388190mED.LIZIZ(context)) != null) && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C757530Tnb(context, "publish", null), 2);
            }
        }
    }
}
