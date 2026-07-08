package com.ss.android.ugc.aweme.im.service.impl;

import X.AbstractC1591090rVT;
import X.AbstractC848400XPy;
import X.C0CNO;
import X.C0P0T;
import X.C0XQ7;
import X.C1388190mED;
import X.C1619600sFS;
import X.C1619610sFT;
import X.C19EG;
import X.C2214201BlK;
import X.C869590Y9l;
import X.C876310YZh;
import X.C876340YZk;
import X.EnumC883570YlP;
import android.app.Activity;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class AutoMessageTooltipHelper implements IAutomessageTooltipHelper {
    public static C0P0T LIZJ;
    public static boolean LJ;
    public static boolean LJFF;
    public static final AutoMessageTooltipHelper LIZIZ = new AutoMessageTooltipHelper();
    public static String LIZLLL = "";

    public static final class Service implements IAutomessageTooltipHelper {
        public final /* synthetic */ AutoMessageTooltipHelper LIZIZ = AutoMessageTooltipHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
        public final void LIZLLL() {
            this.LIZIZ.LIZLLL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
        public final void LJFF(List<C869590Y9l> list) {
            this.LIZIZ.LJFF(list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
        public final boolean LIZ() {
            this.LIZIZ.getClass();
            return AutoMessageTooltipHelper.LJFF;
        }

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
        public final void LIZIZ() {
            this.LIZIZ.getClass();
            AutoMessageTooltipHelper.LJFF = true;
        }

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
        public final boolean LIZJ() {
            this.LIZIZ.getClass();
            return AutoMessageTooltipHelper.LJ;
        }

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
        public final void LJ(String str) {
            this.LIZIZ.getClass();
            AutoMessageTooltipHelper.LIZLLL = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
    public final void LIZIZ() {
        LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
    public final void LIZLLL() {
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ON_RECEIVE_SHARER_INFO);
    }

    @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
    public final boolean LIZ() {
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
    public final boolean LIZJ() {
        return LJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
    public final void LJ(String str) {
        LIZLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper
    public final void LJFF(List<C869590Y9l> list) {
        Activity activityLJFF;
        AbstractC1591090rVT abstractC1591090rVTY01;
        View viewLJIJI;
        if (((ArrayList) list).isEmpty() || (activityLJFF = C2214201BlK.LJFF()) == null) {
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF);
        String curUserId = null;
        if (c19egLIZIZ != null && (abstractC1591090rVTY01 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(c19egLIZIZ).y01()) != null && (viewLJIJI = abstractC1591090rVTY01.LJIJI("NOTIFICATION")) != null) {
            boolean z = ((Keva) C1619610sFT.LIZ.getValue()).getBoolean("is_tooltip_displayed", false);
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null) {
                curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
            }
            C0CNO.LIZLLL(0L, new C1619600sFS(viewLJIJI, z, list, curUserId, activityLJFF));
        }
    }
}
