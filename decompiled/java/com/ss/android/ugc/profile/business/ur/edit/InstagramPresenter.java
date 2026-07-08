package com.ss.android.ugc.profile.business.ur.edit;

import X.C09UZ;
import X.C0CQT;
import X.C0XQ7;
import X.C1232050iAN;
import X.C1232060iAO;
import X.C1232140iAW;
import X.C1436405jm;
import X.C1440005kM;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C851480Xak;
import X.C878800Ydi;
import X.EnumC1216840hlq;
import X.EnumC1216940hm0;
import X.InterfaceC1242760iRe;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC21614319iP;
import X.InterfaceC2174708fZ;
import Y.ARunnableS24S1100000_19;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.lobby.auth.AuthResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class InstagramPresenter implements WeakHandler.IHandler, InterfaceC21614319iP {
    public static final String LLIZ = Api.LIZ + "/aweme/v1/instagram/bind/";
    public InterfaceC1242760iRe LL;
    public C19EG LLILLJJLI;
    public boolean LLILZLL;
    public final InstagramApi LLILZIL = (InstagramApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InstagramApi.class);
    public final WeakHandler LLILLL = new WeakHandler(this);
    public final IAccountUserService LLILZ = C0XQ7.LJFF();

    public interface InstagramApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR
        ListenableFuture<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map);
    }

    @Override // X.InterfaceC21614319iP
    public final void LLLLJ(AuthResult authResult) {
        String message;
        InterfaceC1242760iRe interfaceC1242760iRe = this.LL;
        if (interfaceC1242760iRe == null) {
            return;
        }
        String errorStage = "redirect_and_get_token";
        if (!authResult.mIsSuccessful) {
            interfaceC1242760iRe.aB0(null);
            C851480Xak c851480Xak = authResult.mErrorCause;
            if (c851480Xak != null) {
                message = c851480Xak.getMessage();
                errorStage = c851480Xak.getErrorStage();
            } else {
                message = "Lobby failed and no error info available";
            }
            LIZ(message, errorStage);
            return;
        }
        String string = authResult.mBundle.getString("code");
        if (!TextUtils.isEmpty(string)) {
            C09UZ.LIZ(new ARunnableS24S1100000_19(this, string, 0));
        } else {
            this.LL.aB0(null);
            LIZ("Authorization code is missing", "redirect_and_get_token");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        if (this.LL == null) {
            return;
        }
        if (!(HandlerHook.getMessageObj(message.obj) instanceof Exception) && HandlerHook.getMessageObj(message.obj) != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof UserResponse) {
                user = ((UserResponse) HandlerHook.getMessageObj(message.obj)).getUser();
            } else {
                user = (User) HandlerHook.getMessageObj(message.obj);
            }
            this.LL.aB0(user.getInsId());
            int i = message.what;
            if (i == 6) {
                this.LLILZ.LJJ(user.getInsId());
                C1440005kM.LIZ(new C1436405jm(false));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("platform", "instagram");
                C20684815ws.LJIILLIIL("social_account_unbind_success", c2344009Gk.LIZ);
                C1232140iAW c1232140iAW = C1232140iAW.LIZ;
                C1232050iAN c1232050iAN = new C1232050iAN("click_save", EnumC1216940hm0.SOCIAL_ACCOUNT_UNBIND);
                c1232050iAN.LJIIIIZZ = EnumC1216840hlq.INSTAGRAM;
                C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
                c1232140iAW.getClass();
                C1232140iAW.LJ(c1232060iAO);
                return;
            }
            if (i == 112) {
                this.LLILZ.LJIL(user);
                C1440005kM.LIZ(new C1436405jm(false));
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("platform", "instagram");
                C20684815ws.LJIILLIIL("social_account_bind_success", c2344009Gk2.LIZ);
                C1232140iAW c1232140iAW2 = C1232140iAW.LIZ;
                C1232050iAN c1232050iAN2 = new C1232050iAN("click_save", EnumC1216940hm0.SOCIAL_ACCOUNT_BIND);
                c1232050iAN2.LJIIIIZZ = EnumC1216840hlq.INSTAGRAM;
                C1232060iAO c1232060iAO2 = new C1232060iAO(c1232050iAN2);
                c1232140iAW2.getClass();
                C1232140iAW.LJ(c1232060iAO2);
                return;
            }
        }
        if (message.what == 6) {
            this.LL.Qy0();
        } else {
            LIZ("Failed to retrieve data from TikTok server", "sycn_user_info");
            this.LL.aB0(null);
        }
    }

    public final void LIZ(String str, String str2) {
        String string;
        String str3 = C878800Ydi.LIZ;
        C19EG c19eg = this.LLILLJJLI;
        if (a0.LJJIIZI(str, "Login flow cancelled", false)) {
            string = c19eg.getString(2131850169, C878800Ydi.LIZIZ);
        } else if (a0.LJJIIZI(str, "No intent data received", false)) {
            String str4 = C878800Ydi.LIZIZ;
            string = c19eg.getString(2131850170, str4, str4);
        } else if (a0.LJJIIZI(str, "network not available", false)) {
            string = c19eg.getString(2131829438);
        } else {
            string = c19eg.getString(2131850171, C878800Ydi.LIZIZ);
        }
        InterfaceC1242760iRe interfaceC1242760iRe = this.LL;
        if (interfaceC1242760iRe != null) {
            interfaceC1242760iRe.u32(string);
        }
        if (this.LLILZLL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("platform", "instagram");
            c2344009Gk.LJIIIIZZ("error_desc", str);
            c2344009Gk.LJIIIIZZ("error_code", str2);
            C20684815ws.LJIILLIIL("social_account_bind_failure", c2344009Gk.LIZ);
        }
    }
}
