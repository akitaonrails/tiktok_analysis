package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C1062340dke;
import X.C1062350dkf;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BulletUserInfoMethod extends BaseBridgeMethod {
    public static final C1062340dke Companion = new Object() { // from class: X.0dke
    };
    public EnumC1051570dTH access;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public BulletUserInfoMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "uniUserInfo";
        this.access = EnumC1051570dTH.PROTECT;
    }

    public final void getUserInfo(JSONObject jSONObject) throws JSONException {
        String uniqueId;
        long j;
        String str;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        boolean z = false;
        String str2 = "";
        if (curUser == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            uniqueId = "";
            j = -1;
            str = "";
        } else {
            j = CastLongProtector.parseLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            String nickname = curUser.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            try {
                if (TextUtils.isEmpty(curUser.getUniqueId())) {
                    uniqueId = curUser.getShortId();
                } else {
                    uniqueId = curUser.getUniqueId();
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                uniqueId = "";
            }
            String secUid = curUser.getSecUid();
            if (secUid != null) {
                str2 = secUid;
            }
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            z = true;
            str = str2;
            str2 = nickname;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", str2);
        jSONObject.put("unique_id", uniqueId);
        jSONObject.put("code", 1);
        jSONObject.put("sec_user_id", str);
        Long lLIZ = C1062350dkf.LIZ(curUser);
        if (lLIZ != null) {
            jSONObject.put("decoration_id", lLIZ.longValue());
        }
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        getUserInfo(jSONObject2);
        interfaceC1019840ce6.onSuccess(jSONObject2);
    }
}
