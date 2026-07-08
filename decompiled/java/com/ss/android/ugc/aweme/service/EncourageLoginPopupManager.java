package com.ss.android.ugc.aweme.service;

import X.AbstractC20660015ss;
import X.C04TD;
import X.C1239560iMU;
import X.C1388190mED;
import X.C13LQ;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C306400Bzi;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EncourageLoginPopupManager implements IEncourageLogInService {
    public boolean LIZ;
    public final String LIZIZ = "homepage_hot";
    public String LIZJ = "";
    public final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"chat_head", "chat_list", "chat_merge", "chat"});

    public static IEncourageLogInService LIZJ() {
        Object objLIZ = C04TD.LIZ(IEncourageLogInService.class, false);
        if (objLIZ != null) {
            return (IEncourageLogInService) objLIZ;
        }
        if (C04TD.a4 == null) {
            synchronized (IEncourageLogInService.class) {
                if (C04TD.a4 == null) {
                    C04TD.a4 = new EncourageLoginPopupManager();
                }
            }
        }
        return C04TD.a4;
    }

    @Override // com.ss.android.ugc.aweme.service.IEncourageLogInService
    public final void LIZIZ(final C19EG c19eg) {
        if (!this.LIZ || !C13LQ.LJLIIL(new String[]{"BR", "MX", "CO"}).contains(((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase()) || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            return;
        }
        if (((Keva) C1239560iMU.LIZ.getValue()).getLong("key_last_show_time", 0L) + 259200000 >= System.currentTimeMillis()) {
            return;
        }
        final AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 640);
        PopupManager.LJIJI(new AbstractC20660015ss<Dialog>(c19eg, awS598S0100000_19) { // from class: X.0TSJ
            public final C19EG LL;
            public final Function1<C19EG, Dialog> LLILLJJLI;
            public final int LLILLL = 206;

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg2 = this.LL;
                return new C688120Qyw(c19eg2, c19eg2, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                return this.LLILLJJLI.invoke(this.LL);
            }

            {
                this.LL = c19eg;
                this.LLILLJJLI = awS598S0100000_19;
            }
        }, true);
    }

    public final void LIZLLL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LIZJ);
        C20684815ws.LJIILLIIL("login_notify_pop_up", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.IEncourageLogInService
    public final void LIZ(Context context, String str, String str2) {
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && (C1388190mED.LIZ(context) instanceof C19EG) && !TextUtils.isEmpty(str) && !this.LIZLLL.contains(str) && C306400Bzi.LIZ() == 0) {
            this.LIZ = true;
            this.LIZJ = str2;
        } else {
            this.LIZ = false;
        }
    }
}
