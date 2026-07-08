package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1018150cbN;
import X.C2344809Gs;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class TopViewPreloadTask implements C0CCZ, InterfaceC799590VYf {
    public final List<Aweme> LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TopViewPreloadTask";
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

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    public TopViewPreloadTask(List<Aweme> list) {
        this.LL = list;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2344809Gs.LJ("AwesomeSplashPreloadTask");
        C1018150cbN.LIZJ().LJIIIIZZ(context, this.LL);
    }
}
