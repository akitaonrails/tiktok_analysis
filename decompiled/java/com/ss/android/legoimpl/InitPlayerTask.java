package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C0X35;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerInitService;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC20234614Fk
public class InitPlayerTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitPlayerTask";
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

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0X35.LIZ("application_player_kit_init_preload", false);
        IPlayerInitService iPlayerInitService = (IPlayerInitService) PluggableExtentionKt.pluggableSpi(IPlayerInitService.class);
        if (iPlayerInitService != null) {
            iPlayerInitService.LJ();
        }
        C0X35.LJIIJJI("application_player_kit_init_preload", false);
    }
}
