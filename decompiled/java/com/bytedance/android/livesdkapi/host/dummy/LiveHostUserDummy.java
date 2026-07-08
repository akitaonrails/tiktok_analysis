package com.bytedance.android.livesdkapi.host.dummy;

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
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public class LiveHostUserDummy implements IHostUser {
    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void bindMobile(Activity activity, String str, String str2, Bundle bundle, InterfaceC207239167p interfaceC207239167p) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void cacheUserBeforeEnterProfile(User user) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void dismissCaptcha() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void event(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final InterfaceC2262081DgM getCurUser() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final long getCurUserId() {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getCurrentRegionCode() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getEmail() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getTTDisPlayName(String str, String str2) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean interceptOperation(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isDeleteByAgeGate() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isLogin() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isMinorMode() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isNeedProtectMinor() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isNewUser() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void login(C19EG c19eg, InterfaceC207241167r interfaceC207241167r, String str, String str2, int i, String str3, String str4, String str5) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void observeAccountChange(C0J7I c0j7i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void onFollowStatusChanged(int i, long j) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void popCaptchaV2(Activity activity, String str, InterfaceC207238167o interfaceC207238167o, Fragment fragment) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerCurrentUserUpdateListener(InterfaceC207240167q interfaceC207240167q) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerFollowStatusListener(InterfaceC1839810xyd interfaceC1839810xyd) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void reportData(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void requestLivePermission(InterfaceC472150IfN interfaceC472150IfN, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unFollowWithConfirm(Activity activity, int i, long j, InterfaceC1812170xG3 interfaceC1812170xG3) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final List<C750550TcL> getAllFriends() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final Map<String, String> frameSign(String str, int i) {
        return new HashMap();
    }
}
