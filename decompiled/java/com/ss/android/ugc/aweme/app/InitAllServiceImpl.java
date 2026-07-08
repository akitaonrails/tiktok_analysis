package com.ss.android.ugc.aweme.app;

import X.AbstractC2214441Bli;
import X.C089F;
import X.C089G;
import X.C0CCZ;
import X.C1514430pVp;
import X.C19254610Um;
import X.C2238381CjE;
import X.C2277881EDy;
import X.C844470XAv;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS95S0000000_19;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.boot.BootFinishHandler;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes29.dex */
public class InitAllServiceImpl extends AbstractC2214441Bli {
    public boolean LIZ;
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LIZLLL() {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
            return;
        }
        I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
        C844470XAv.LIZ.getClass();
        i18nManagerServiceApiLIZ.LIZIZ(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final RegisterLifecycle LJ() {
        return new RegisterLifecycle();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final InstallEventBus LJIIJ() {
        return new InstallEventBus();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final C0CCZ LJIIJJI() {
        return C2277881EDy.LIZIZ.getYoutubeRefreshTask();
    }

    @Override // X.AbstractC2214441Bli, com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJII(final Context context) {
        C19254610Um.LIZIZ.LJJIJIIJIL("init_new_user_hook");
        if (C1514430pVp.LIZLLL().booleanValue()) {
            C089F.LIZ(new C089G(context) { // from class: X.10Un
                @Override // X.C089G
                public final String LIZ(Intent intent, String str) {
                    InitAllServiceImpl initAllServiceImpl = this.LIZ;
                    initAllServiceImpl.getClass();
                    C19254610Um c19254610Um = C19254610Um.LIZIZ;
                    c19254610Um.LJFF();
                    if (!initAllServiceImpl.LIZIZ && intent != null) {
                        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi(IDeepLinkService.class);
                        Objects.requireNonNull(iDeepLinkService);
                        if (TextUtils.equals(iDeepLinkService.LJJLIIIIJ("InitAllServiceImpl#initNewUserHook"), str)) {
                            C10R5 c10r5 = C10R5.LJIIIIZZ;
                            if (C10RS.LIZ().LIZ() && c19254610Um.LJI()) {
                                initAllServiceImpl.LIZIZ = true;
                                return c19254610Um.LJJIFFI(intent).getName();
                            }
                        }
                    }
                    if (!initAllServiceImpl.LIZIZ && intent != null) {
                        IDeepLinkService iDeepLinkService2 = (IDeepLinkService) PluggableExtentionKt.pluggableSpi(IDeepLinkService.class);
                        Objects.requireNonNull(iDeepLinkService2);
                        if (TextUtils.equals(iDeepLinkService2.LJJLIIIJJIZ(), str)) {
                            C10R5 c10r52 = C10R5.LJIIIIZZ;
                            if (C10RS.LIZ().LIZ() && c19254610Um.LJI()) {
                                initAllServiceImpl.LIZIZ = true;
                                return c19254610Um.LJJIIJ(intent).getName();
                            }
                        }
                    }
                    if (initAllServiceImpl.LIZ || intent == null || !TextUtils.equals(MainActivity.class.getName(), str)) {
                        return str;
                    }
                    C10R5 c10r53 = C10R5.LJIIIIZZ;
                    if (!C10RS.LIZ().LIZ()) {
                        return str;
                    }
                    initAllServiceImpl.LIZ = true;
                    if (C104100aN.LIZ().isNewUser()) {
                        BootFinishHandler bootFinishHandler = BootFinishHandler.LL;
                        if (bootFinishHandler.hasMessages(1205)) {
                            bootFinishHandler.removeMessages(1205);
                        }
                    }
                    if (C104100aN.LIZ().isNewUser()) {
                        C823050WQl.LIZIZ().execute(new ARunnableS95S0000000_19(0));
                    }
                    if (C07I0.LIZ() && ((Boolean) C1865860yee.LIZIZ.getValue()).booleanValue()) {
                        return str;
                    }
                    return c19254610Um.LJIIL(intent).getName();
                }
            });
        } else if (C2238381CjE.LIZ()) {
            C089F.LIZ(new C089G() { // from class: X.0cwN
                @Override // X.C089G
                public final String LIZ(Intent intent, String str) {
                    InitAllServiceImpl initAllServiceImpl = this.LIZ;
                    Context context2 = context;
                    if (!initAllServiceImpl.LIZ && intent != null && TextUtils.equals(MainActivity.class.getName(), str)) {
                        initAllServiceImpl.LIZ = true;
                        C1030680cva.LJIIZILJ(intent);
                        if (C1030680cva.LJFF && !C1030680cva.LJIILIIL) {
                            C1030680cva.LJIILIIL = true;
                            C823050WQl.LIZIZ().execute(new ARunnableS116S0100000_16(context2, 24));
                        }
                    }
                    return str;
                }
            });
        } else {
            if (!Keva.getRepo("main_activity_helper").getBoolean("enable_dau_hook", false)) {
                return;
            }
            C089F.LIZ(new C089G() { // from class: X.10Uo
                @Override // X.C089G
                public final String LIZ(Intent intent, String str) {
                    return str;
                }
            });
        }
    }
}
