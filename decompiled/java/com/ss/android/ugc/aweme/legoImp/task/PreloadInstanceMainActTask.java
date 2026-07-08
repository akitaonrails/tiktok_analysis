package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass0716;
import X.C036E;
import X.C073M;
import X.C07OX;
import X.C0CCZ;
import X.C0CL7;
import X.C0VZ0;
import X.C0W9I;
import X.C1029590ctp;
import X.C1045340dJE;
import X.C1076010e6h;
import X.C14LC;
import X.C1589740rTI;
import X.C1591410rVz;
import X.C1608090rwt;
import X.C1785606z0;
import X.C1827607Du;
import X.C1960207m4;
import X.C1961107mD;
import X.C21610619ho;
import X.C2259011DbP;
import X.C2274271E0b;
import X.C2277881EDy;
import X.C2279461EKa;
import X.C309640CBu;
import X.C309690CBz;
import X.C710360Rti;
import X.C711750Rvx;
import X.C733510Spx;
import X.C799890VZj;
import X.C799900VZk;
import X.C804440Vh4;
import X.C823050WQl;
import X.C828070We5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes25.dex */
public class PreloadInstanceMainActTask extends PreloadInstanceTask {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadInstanceMainActTask";
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !AnonymousClass0716.LIZIZ();
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        OptValue optValueLIZ;
        Integer num;
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3589), C1785606z0.LIZ())) {
            boolean z = C710360Rti.LIZ;
        }
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3576), C1785606z0.LIZ())) {
            int i = C0CL7.LIZ;
        }
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3600), C1785606z0.LIZ())) {
            try {
                C1960207m4.LIZ(C1961107mD.LIZ(Choreographer.class, "mHandler"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3599), C1785606z0.LIZ())) {
            C828070We5 c828070We5 = C733510Spx.LIZ;
        }
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3585), C1785606z0.LIZ())) {
            boolean z2 = C14LC.LJIIIZ;
            C14LC c14lc = C309690CBz.LIZ;
        }
        if (((Boolean) C07OX.LIZIZ.getValue()).booleanValue()) {
            C799900VZk.LIZ.getClass();
            new C799890VZj().LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceMainActTask.1
                @Override // X.InterfaceC800080Va2
                public final /* synthetic */ List finalizedBy() {
                    return null;
                }

                @Override // X.InterfaceC800080Va2
                public final String key() {
                    return "PreloadInstanceMainActTask$1";
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
                public final /* synthetic */ int targetProcess() {
                    return C0VZ0.LIZ();
                }

                @Override // X.InterfaceC800080Va2
                public final /* synthetic */ EnumC799980VZs triggerType() {
                    return C0VZ0.LIZIZ(this);
                }

                @Override // X.C0CCZ
                public final EnumC799870VZh type() {
                    return EnumC799870VZh.BOOT_FINISH;
                }

                @Override // X.InterfaceC308150C6b
                public final void run(Context context2) {
                    PreloadInstanceMainActTask preloadInstanceMainActTask = PreloadInstanceMainActTask.this;
                    C0W9I.LIZIZ(context2);
                    preloadInstanceMainActTask.getClass();
                }
            });
        } else {
            C0W9I.LIZIZ(context);
        }
        String str = DetailActivity._pnsPageId;
        String str2 = CrossPlatformActivity._pnsPageId;
        try {
            if (!((Boolean) AnonymousClass0716.LJIIJ.getValue()).booleanValue()) {
                new C1591410rVz(context);
                new C21610619ho(context, null);
                new TuxTextView(context);
                new MainFragment();
                new FeedRecommendFragment();
                C804440Vh4 c804440Vh4 = C036E.LIZ;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1029590ctp.LJI();
        ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);
        ((IStickerService) ServiceManager.get().getService(IStickerService.class)).LIZ();
        new WidgetManager();
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        C1045340dJE.LJIJI();
        if (((Boolean) C2279461EKa.LJIIIIZZ.getValue()).booleanValue()) {
            ServiceManager.get().getService(ISpecActService.class);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        }
        if (((Boolean) C2274271E0b.LIZLLL.getValue()).booleanValue()) {
            C823050WQl.LIZIZ();
        }
        if (((Boolean) C2259011DbP.LIZLLL.getValue()).booleanValue()) {
            C711750Rvx.LIZJ.getValue();
        }
        if (((Boolean) C073M.LIZIZ.getValue()).booleanValue()) {
            C1608090rwt.LIZIZ.LIZ();
        }
        if (((Boolean) C309640CBu.LIZIZ.getValue()).booleanValue()) {
            try {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LIZ();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        if (((Boolean) C309640CBu.LIZJ.getValue()).booleanValue() && (optValueLIZ = C1589740rTI.LIZ()) != null && (num = optValueLIZ.isEnableSlideParamsOpt) != null) {
            num.intValue();
        }
        if (((Boolean) C309640CBu.LIZLLL.getValue()).booleanValue()) {
            ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        }
    }
}
