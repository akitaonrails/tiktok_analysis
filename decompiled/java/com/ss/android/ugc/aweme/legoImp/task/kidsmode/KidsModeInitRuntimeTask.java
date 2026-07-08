package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsModeInitRuntimeTask implements C0CCZ {
    public final Application LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeInitRuntimeTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    public KidsModeInitRuntimeTask(Application application) {
        this.LL = application;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        this.LL.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi$default(IKidsCommonService.class, false, false, false, 14, null);
        if (iKidsCommonService != null) {
            iKidsCommonService.LIZJ();
        }
    }
}
