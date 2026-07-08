package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.C1486540omq;
import X.C1BWL;
import X.C2214201BlK;
import X.EnumC1335310kqv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AfS133S0000000_9;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerInitService;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class NewUserVodInitTask implements C0CCZ {
    public static NewUserVodInitTask LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NewUserVodInitTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static NewUserVodInitTask LIZ() {
        if (LL == null) {
            LL = new NewUserVodInitTask();
        }
        return LL;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1150504el.LIZ().LIZLLL("method_init_player_kit_duration", false);
        AVMDLDataLoader.initApplicationContext(C1BWL.LIZ());
        TTVideoEngine.LLFII(13005, 1);
        TTVideoEngine.LLFII(737, 1);
        TTVideoEngine.LLFII(2038, 1);
        TTVideoEngine.LLFII(2040, EnumC1335310kqv.EXTREME_LOW.getValue());
        C1486540omq.LIZ();
        IPlayerInitService iPlayerInitService = (IPlayerInitService) PluggableExtentionKt.pluggableSpi(IPlayerInitService.class);
        if (iPlayerInitService != null) {
            iPlayerInitService.LIZJ();
        }
        C1150504el.LIZ().LJI("method_init_player_kit_duration", false);
        C2214201BlK.LIZLLL().LJJLJLI(new AfS133S0000000_9(1));
    }
}
