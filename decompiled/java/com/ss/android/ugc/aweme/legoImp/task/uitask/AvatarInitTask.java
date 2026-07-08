package com.ss.android.ugc.aweme.legoImp.task.uitask;

import X.AbstractC1608810ry3;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1607070rvF;
import X.C1607330rvf;
import X.C1608570rxf;
import X.C1608590rxh;
import X.C1608600rxi;
import X.C1608770rxz;
import X.EnumC2006907tb;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMNonSDKService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AvatarInitTask";
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
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1607070rvF c1607070rvF = C1607070rvF.LIZIZ;
        C1608770rxz.LIZ(c1607070rvF.LJFF());
        C1608770rxz.LIZ(c1607070rvF.LIZLLL());
        C1608770rxz.LIZ(c1607070rvF.LIZ());
        C1608770rxz.LIZ(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U3());
        C1608770rxz.LIZ(((IProfileService) ServiceManager.get().getService(IProfileService.class)).getAvatarProfileAdapter());
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMNonSDKService.class);
        if (objPluggableSpiForReal != null) {
            C1607330rvf c1607330rvfLIZ = ((IIMNonSDKService) objPluggableSpiForReal).LIZ();
            if (!(c1607330rvfLIZ instanceof AbstractC1608810ry3)) {
                c1607330rvfLIZ = null;
            }
            C1608770rxz.LIZ(c1607330rvfLIZ);
            C1608770rxz.LIZ(C1608570rxf.LIZIZ.LIZ());
            C1608770rxz.LIZ(C1608590rxh.LIZIZ.LIZ());
            C1608600rxi c1608600rxi = C1608600rxi.LIZIZ;
            c1608600rxi.LIZ(EnumC2006907tb.DEFAULT_VIDEO_AVATAR, c1608600rxi.LIZIZ());
            C1608770rxz.LIZ(c1607070rvF.LIZIZ());
            C1608770rxz.LIZ(c1607070rvF.LJ());
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
