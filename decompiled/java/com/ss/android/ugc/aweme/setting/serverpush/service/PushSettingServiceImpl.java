package com.ss.android.ugc.aweme.setting.serverpush.service;

import X.C08JS;
import X.C1217100hmG;
import X.C1245240iVe;
import X.C1246660iXw;
import X.C15O7;
import X.C2188811AlT;
import Y.ACallableS17S2100000_3;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class PushSettingServiceImpl implements IPushSettingService {
    public Pair<String, ? extends PushSettingDynamicUI> LIZ;
    public Pair<String, C1246660iXw> LIZIZ;

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final PushSettingDynamicUI LIZ() {
        Pair<String, ? extends PushSettingDynamicUI> pair = this.LIZ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            C1245240iVe.LIZ.getClass();
            return pair.getSecond();
        }
        C1245240iVe.LIZ.getClass();
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        Keva kevaLIZ = C1217100hmG.LIZ();
        if (kevaLIZ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_settings_dynamic_ui__");
        sbLIZ.append(currentUserID);
        String string = kevaLIZ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string.isEmpty()) {
            return null;
        }
        return (PushSettingDynamicUI) C08JS.LIZ(string, PushSettingDynamicUI.class);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final C1246660iXw LJ() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String currentUserID = iUserService != null ? iUserService.getCurrentUserID() : null;
        Pair<String, C1246660iXw> pair = this.LIZIZ;
        if (pair == null || !Intrinsics.LJFF(pair.getFirst(), currentUserID)) {
            return null;
        }
        return pair.getSecond();
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final PushSettingDynamicUI LIZIZ() {
        return PushSettingsApiManager.LJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final C1246660iXw LIZLLL() {
        try {
            return PushSettingsApiManager.LJII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1245240iVe c1245240iVe = C1245240iVe.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchImUserVoiceCallSettings failed: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c1245240iVe.getClass();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final PushSettings LJII() {
        return PushSettingsApiManager.LJI();
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final boolean LIZJ(int i) {
        IUserService iUserService;
        String currentUserID;
        C1246660iXw c1246660iXw;
        try {
            boolean zLJIIJ = PushSettingsApiManager.LJIIJ(i);
            if (zLJIIJ && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (currentUserID = iUserService.getCurrentUserID()) != null && !a0.LJJJIL(currentUserID)) {
                Pair<String, C1246660iXw> pair = this.LIZIZ;
                if (pair == null || !Intrinsics.LJFF(pair.getFirst(), currentUserID) || (c1246660iXw = pair.getSecond()) == null) {
                    c1246660iXw = new C1246660iXw(0, 0);
                }
                this.LIZIZ = new Pair<>(currentUserID, new C1246660iXw(i, c1246660iXw.LIZIZ));
            }
            return zLJIIJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1245240iVe c1245240iVe = C1245240iVe.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setImUserVoiceCallInApp failed: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c1245240iVe.getClass();
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final void LJFF(PushSettingDynamicUI pushSettingDynamicUI) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID != null && !a0.LJJJIL(currentUserID)) {
            this.LIZ = new Pair<>(currentUserID, pushSettingDynamicUI);
            AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
            if (accountUserServiceLJIIJ.isLogin()) {
                String curUserId = accountUserServiceLJIIJ.getCurUserId();
                Keva kevaLIZ = C1217100hmG.LIZ();
                if (kevaLIZ != null) {
                    C15O7.LIZJ(new ACallableS17S2100000_3(kevaLIZ, curUserId, C08JS.LIZLLL(pushSettingDynamicUI), 0));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final void LJI(C1246660iXw c1246660iXw) {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null && !a0.LJJJIL(currentUserID)) {
            this.LIZIZ = new Pair<>(currentUserID, c1246660iXw);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService
    public final boolean LJIIIIZZ(int i) {
        IUserService iUserService;
        String currentUserID;
        C1246660iXw c1246660iXw;
        try {
            boolean zLJIIJJI = PushSettingsApiManager.LJIIJJI(i);
            if (zLJIIJJI && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (currentUserID = iUserService.getCurrentUserID()) != null && !a0.LJJJIL(currentUserID)) {
                Pair<String, C1246660iXw> pair = this.LIZIZ;
                if (pair == null || !Intrinsics.LJFF(pair.getFirst(), currentUserID) || (c1246660iXw = pair.getSecond()) == null) {
                    c1246660iXw = new C1246660iXw(0, 0);
                }
                this.LIZIZ = new Pair<>(currentUserID, new C1246660iXw(c1246660iXw.LIZ, i));
            }
            return zLJIIJJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1245240iVe c1245240iVe = C1245240iVe.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setImUserVoiceCallOutApp failed: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c1245240iVe.getClass();
            return false;
        }
    }
}
