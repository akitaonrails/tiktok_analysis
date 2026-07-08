package com.ss.android.ugc.profile.business.ur;

import X.C0XQ7;
import X.C1233040iBy;
import X.C1C7U;
import X.InterfaceC1232420iAy;
import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public final class NaviAssetUploadHandler extends BPEAHandler {
    public final Activity LL;
    public final InterfaceC1232420iAy LLILLJJLI;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("NaviAssetUploadHandler@14e.handleMessage");
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            Exception exc = (Exception) HandlerHook.getMessageObj(message.obj);
            int i = message.what;
            if (i == 112) {
                this.LLILLJJLI.JE2(i, exc);
            }
            C1C7U.LIZIZ("NaviAssetUploadHandler@14e.handleMessage");
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof User) {
            LJ(message.what, (User) HandlerHook.getMessageObj(message.obj));
        } else if (HandlerHook.getMessageObj(message.obj) instanceof UserResponse) {
            UserResponse userResponse = (UserResponse) HandlerHook.getMessageObj(message.obj);
            if (userResponse.getAction() == 1) {
                LJFF(userResponse.status_msg, true);
                int i2 = message.what;
                if (i2 == 112) {
                    this.LLILLJJLI.JE2(i2, null);
                }
            } else if (userResponse.getAction() == 2) {
                LJFF(userResponse.status_msg, false);
                int i3 = message.what;
                if (i3 == 112) {
                    this.LLILLJJLI.JE2(i3, null);
                }
            } else {
                LJ(message.what, userResponse.getUser());
            }
        } else if (HandlerHook.getMessageObj(message.obj) instanceof BaseResponse) {
            BaseResponse baseResponse = (BaseResponse) HandlerHook.getMessageObj(message.obj);
            if (baseResponse.status_code != 0) {
                LJFF(baseResponse.status_msg, false);
                int i4 = message.what;
                if (i4 == 112) {
                    this.LLILLJJLI.JE2(i4, null);
                }
            } else {
                LJ(message.what, null);
            }
        }
        C1C7U.LIZIZ("NaviAssetUploadHandler@14e.handleMessage");
    }

    public NaviAssetUploadHandler(Activity activity, InterfaceC1232420iAy interfaceC1232420iAy) {
        super(Looper.getMainLooper());
        this.LL = activity;
        this.LLILLJJLI = interfaceC1232420iAy;
    }

    public final void LJ(int i, User user) {
        if (user == null) {
            if (i != 128) {
                this.LLILLJJLI.JE2(i, null);
            }
        } else if (i == 112) {
            C0XQ7.LJFF().LJIL(user);
            this.LLILLJJLI.Ud0(i, user);
        }
    }

    public final void LJFF(String str, boolean z) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C1233040iBy c1233040iBy = new C1233040iBy(this.LL);
            c1233040iBy.LIZJ(str);
            c1233040iBy.LIZLLL();
        }
    }
}
