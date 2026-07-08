package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C0CO3;
import X.C0VU1;
import X.C0XQ7;
import X.C1644806cI;
import X.C291210BbD;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import X.InterfaceC800130Va7;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource$appLifecycleListener$2$1;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarDynamicSettingRequestLegoTask implements InterfaceC800130Va7, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SocialAvatarDynamicSettingRequestLegoTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (C1644806cI.LIZJ() && C291210BbD.LIZ()) {
            SocialAvatarEntranceDynamicDataSource.LL.getClass();
            if (!SocialAvatarEntranceDynamicDataSource.LLILZ.getAndSet(true)) {
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver((SocialAvatarEntranceDynamicDataSource$appLifecycleListener$2$1) SocialAvatarEntranceDynamicDataSource.LLJILJILJ.getValue());
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIILL(SocialAvatarEntranceDynamicDataSource.LLJILJIL);
            }
        }
    }
}
