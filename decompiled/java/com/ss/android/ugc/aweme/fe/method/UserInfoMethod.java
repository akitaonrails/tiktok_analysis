package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1062350dkf;
import X.C10EU;
import X.InterfaceC1041760dDS;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class UserInfoMethod extends BaseCommonJavaMethod {
    public UserInfoMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public UserInfoMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    public final void LIZ(JSONObject jSONObject) {
        boolean zIsPrivateAccount;
        String nickname;
        String uniqueId;
        String secUid;
        String bindPhone;
        String email;
        long j;
        boolean mvThemeRecordMode;
        String strLJJIJ;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        boolean z = false;
        String str = "";
        if (curUser != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            j = CastLongProtector.parseLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            nickname = curUser.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                uniqueId = curUser.getShortId();
            } else {
                uniqueId = curUser.getUniqueId();
            }
            secUid = curUser.getSecUid();
            bindPhone = curUser.getBindPhone();
            email = curUser.getEmail();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            mvThemeRecordMode = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().getMvThemeRecordMode();
            zIsPrivateAccount = curUser.isPrivateAccount();
            z = true;
        } else {
            zIsPrivateAccount = false;
            nickname = "";
            uniqueId = "";
            secUid = "";
            bindPhone = "";
            email = "";
            j = -1;
            mvThemeRecordMode = false;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", nickname);
        jSONObject.put("unique_id", uniqueId);
        jSONObject.put("code", 1);
        jSONObject.put("sec_user_id", secUid);
        jSONObject.put("isSupportMV", mvThemeRecordMode);
        jSONObject.put("isChildMode", C10EU.LJIIIIZZ() ? 1 : 0);
        jSONObject.put("is_private_account", zIsPrivateAccount);
        jSONObject.put("bind_phone", bindPhone);
        jSONObject.put("email", email);
        if (C0XQ7.LJFF() != null && (strLJJIJ = AbstractC848400XPy.LJJIJ()) != null) {
            str = strLJJIJ;
        }
        jSONObject.put("bind_phone_region", str);
        Long lLIZ = C1062350dkf.LIZ(curUser);
        if (lLIZ != null) {
            jSONObject.put("decoration_id", lLIZ.longValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        JSONObject jSONObject2 = new JSONObject();
        LIZ(jSONObject2);
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZIZ(jSONObject2);
        }
    }
}
