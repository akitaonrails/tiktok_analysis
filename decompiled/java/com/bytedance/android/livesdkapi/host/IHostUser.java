package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C0J7I;
import X.C19EG;
import X.C750550TcL;
import X.InterfaceC1812170xG3;
import X.InterfaceC1839810xyd;
import X.InterfaceC20311214di;
import X.InterfaceC207238167o;
import X.InterfaceC207239167p;
import X.InterfaceC207240167q;
import X.InterfaceC207241167r;
import X.InterfaceC2262081DgM;
import X.InterfaceC472150IfN;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public interface IHostUser extends C006A {
    public static final int MESSAGE_NICKNAME_DUPLICATE = 20014;
    public static final int MESSAGE_NICKNAME_DUPLICATE_2 = 20041;

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, InterfaceC207239167p interfaceC207239167p);

    void cacheUserBeforeEnterProfile(User user);

    void dismissCaptcha();

    void event(String str, String str2);

    Map<String, String> frameSign(String str, int i);

    List<C750550TcL> getAllFriends();

    InterfaceC2262081DgM getCurUser();

    long getCurUserId();

    String getCurrentRegionCode();

    String getEmail();

    String getTTDisPlayName(String str, String str2);

    boolean interceptOperation(String str);

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMinorMode();

    boolean isNeedProtectMinor();

    boolean isNewUser();

    void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di);

    void login(C19EG c19eg, InterfaceC207241167r interfaceC207241167r, String str, String str2, int i, String str3, String str4, String str5);

    void observeAccountChange(C0J7I c0j7i);

    void onFollowStatusChanged(int i, long j);

    /* bridge */ /* synthetic */ void onInit();

    void popCaptchaV2(Activity activity, String str, InterfaceC207238167o interfaceC207238167o, Fragment fragment);

    void registerCurrentUserUpdateListener(InterfaceC207240167q interfaceC207240167q);

    void registerFollowStatusListener(InterfaceC1839810xyd interfaceC1839810xyd);

    void reportData(String str);

    void requestLivePermission(InterfaceC472150IfN interfaceC472150IfN, String str);

    void unFollowWithConfirm(Activity activity, int i, long j, InterfaceC1812170xG3 interfaceC1812170xG3);
}
