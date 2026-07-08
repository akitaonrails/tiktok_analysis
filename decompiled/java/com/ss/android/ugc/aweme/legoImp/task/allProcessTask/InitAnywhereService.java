package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.anydoor.entry.IAnydoorEntryService;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InitAnywhereService implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAnywhereService";
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return false;
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IAnydoorEntryService iAnydoorEntryService = (IAnydoorEntryService) PluggableExtentionKt.pluggableSpi$default(IAnydoorEntryService.class, false, false, false, 8, null);
        if (iAnydoorEntryService != null) {
            iAnydoorEntryService.isOpen();
        }
    }
}
