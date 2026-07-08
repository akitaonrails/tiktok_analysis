package com.ss.android.ugc.aweme.account.login.prevlogin;

import X.C01GW;
import X.C0XR9;
import X.C1514430pVp;
import X.C1BNE;
import X.C1BWL;
import X.C2252321DDq;
import X.C452501pT;
import X.C7740030o;
import X.EnumC19241510Pl;
import android.app.backup.BackupManager;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PrevLoginPlatformService implements IPrevLoginPlatformService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(166));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(71));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 38));
    public final C2252321DDq LIZLLL = C1BNE.LIZ(Boolean.FALSE);

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final C0XR9 LJFF() {
        CharSequence charSequence;
        C0XR9 c0xr9 = C0XR9.NONE;
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() || (charSequence = (CharSequence) ((LiveData) this.LIZJ.getValue()).getValue()) == null || charSequence.length() == 0 || Intrinsics.LJFF(((LiveData) this.LIZJ.getValue()).getValue(), "none")) {
            return c0xr9;
        }
        String string = LJIIJJI().getString("ab_group", CardStruct.IStatusCode.DEFAULT);
        return Intrinsics.LJFF(string, "1") ? C0XR9.LOGIN_ITEM_SUBTITLE : Intrinsics.LJFF(string, "2") ? C0XR9.LOGIN_ITEM_TOOLTIP : c0xr9;
    }

    public final Keva LJIIJJI() {
        return (Keva) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final MutableLiveData getPlatform() {
        return (MutableLiveData) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final int LIZIZ() {
        return LJFF() == C0XR9.NONE ? 0 : 1;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final boolean LJ() {
        if (!C1514430pVp.LIZLLL().booleanValue() || LJIIJJI().getBoolean("is_et_param_added", false)) {
            return false;
        }
        LJIIJJI().storeBoolean("is_et_param_added", true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[PHI: r5
      0x0041: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:18:0x0039, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII() {
        /*
            r8 = this;
            X.0XO3 r7 = X.C0XGI.LIZIZ()
            r6 = 0
            if (r7 == 0) goto L38
            org.json.JSONObject r1 = r7.LJJII
            if (r1 == 0) goto L38
            java.lang.String r0 = "name"
            java.lang.String r5 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
        L11:
            org.json.JSONObject r1 = r7.LJJII
            if (r1 == 0) goto L3e
            java.lang.String r0 = "connects"
            org.json.JSONArray r4 = r1.optJSONArray(r0)
            if (r4 == 0) goto L3c
            int r3 = r4.length()
            r2 = 0
        L22:
            if (r2 >= r3) goto L3c
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r4, r2)
            java.lang.String r0 = "platform"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L35
            return r1
        L35:
            int r2 = r2 + 1
            goto L22
        L38:
            r5 = r6
            if (r7 == 0) goto L41
            goto L11
        L3c:
            if (r7 == 0) goto L41
        L3e:
            java.lang.String r0 = r7.LJIIIZ
            goto L42
        L41:
            r0 = r6
        L42:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = "mobile"
            return r0
        L4b:
            if (r7 == 0) goto L4f
            java.lang.String r6 = r7.LJIIJ
        L4f:
            boolean r0 = X.C123100dR.LIZ(r6)
            if (r0 == 0) goto L58
            java.lang.String r0 = "email"
            return r0
        L58:
            boolean r0 = X.C123100dR.LIZ(r5)
            if (r0 == 0) goto L62
            java.lang.String r0 = "username"
            return r0
        L62:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService.LJII():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final int LJIIIZ() {
        Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
        while (it2.hasNext()) {
            IPluginService.PluginData next = it2.next();
            if (next.id == EnumC19241510Pl.PREVIOUS_LOGIN_DATA.getValue()) {
                return next != null ? 1 : 0;
            }
        }
        return 0;
    }

    public final Map<Long, String> LJIIL() {
        Map<Long, String> map;
        try {
            map = (Map) C7740030o.LIZ().getGson().LJIIIIZZ(LJIIJJI().getString("uid_to_platform", ""), new TypeToken<Map<Long, String>>() { // from class: X.04aM
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            map = null;
        }
        return map == null ? new LinkedHashMap() : map;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final String LIZ(long j) {
        String str = LJIIL().get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final void LJI(long j) {
        Map<Long, String> mapLJIIL = LJIIL();
        mapLJIIL.remove(Long.valueOf(j));
        LJIIJJI().storeString("uid_to_platform", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), mapLJIIL));
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final void LJIIJ(String str) {
        ((SharedPreferences) this.LIZIZ.getValue()).edit().putString("previous_login_platform", str).apply();
        ((LiveData) this.LIZJ.getValue()).postValue(str);
        BackupManager.dataChanged(C1BWL.LIZ().getPackageName());
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final void LIZLLL(long j, String str) {
        Map<Long, String> mapLJIIL = LJIIL();
        mapLJIIL.put(Long.valueOf(j), str);
        LJIIJJI().storeString("uid_to_platform", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), mapLJIIL));
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final String LJIIIIZZ(Integer num, String str) {
        if (num != null) {
            if (num.intValue() != 2 && num.intValue() != 3) {
                if (num.intValue() == 4) {
                    return "email";
                }
                if (num.intValue() == 5) {
                    return "username";
                }
                if (num.intValue() == 6) {
                    if (str != null) {
                        return str;
                    }
                    return "not_available";
                }
                return "";
            }
            return "mobile";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Integer r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            java.lang.String r1 = "ab_group"
            if (r0 != 0) goto L6f
            java.lang.String r0 = "2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 != 0) goto L6f
            com.bytedance.keva.Keva r0 = r4.LJIIJJI()
            if (r6 != 0) goto L1a
            java.lang.String r6 = "0"
        L1a:
            r0.storeString(r1, r6)
        L1d:
            r3 = 3
            java.lang.String r2 = "none"
            if (r5 == 0) goto L6d
            int r1 = r5.intValue()
            r0 = 2
            if (r1 == r0) goto L6a
            int r0 = r5.intValue()
            if (r0 == r3) goto L6a
            int r1 = r5.intValue()
            r0 = 4
            if (r1 != r0) goto L54
            java.lang.String r7 = "email"
        L38:
            r0 = r7
        L39:
            r4.LJIIJ(r0)
            if (r7 == 0) goto L53
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r2)
            if (r0 != 0) goto L53
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.01RD r1 = new X.01RD
            r0 = 0
            r1.<init>(r4, r0)
            X.C23250099c.LIZLLL(r2, r0, r0, r1, r3)
        L53:
            return
        L54:
            int r1 = r5.intValue()
            r0 = 5
            if (r1 != r0) goto L5f
            java.lang.String r7 = "username"
            goto L38
        L5f:
            int r1 = r5.intValue()
            r0 = 6
            if (r1 != r0) goto L6d
            if (r7 != 0) goto L38
            r0 = r2
            goto L39
        L6a:
            java.lang.String r7 = "mobile"
            goto L38
        L6d:
            r7 = r2
            goto L38
        L6f:
            com.bytedance.keva.Keva r0 = r4.LJIIJJI()
            r0.storeString(r1, r6)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService.LIZJ(java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
