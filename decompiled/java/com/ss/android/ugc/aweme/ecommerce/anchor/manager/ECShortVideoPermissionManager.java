package com.ss.android.ugc.aweme.ecommerce.anchor.manager;

import X.AnonymousClass0317;
import X.AnonymousClass0956;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C09CT;
import X.C0C64;
import X.C0PEM;
import X.C1120604Zw;
import X.C189200o6;
import X.C1AQS;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C594250NSl;
import X.InterfaceC19511711Vj;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermission;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ECShortVideoPermissionManager implements InterfaceC19511711Vj {
    public static final ECShortVideoPermissionManager LIZ = new ECShortVideoPermissionManager();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(82));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(81));
    public static AnchorPublishPermission LIZLLL;
    public static AnchorPublishPermission LJ;
    public static AnchorPublishPermission LJFF;
    public static AnchorPublishPermission LJI;
    public static AnonymousClass0956 LJII;

    static {
        LJFF();
    }

    @Override // X.InterfaceC19511711Vj
    public final AnchorPublishPermission LIZ() {
        AnchorPublishPermission anchorPublishPermission = LJFF;
        if (anchorPublishPermission != null) {
            return anchorPublishPermission;
        }
        AnchorPublishPermission anchorPublishPermission2 = LIZLLL;
        if (anchorPublishPermission2 == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = anchorPublishPermission2.enableAnchor || C0C64.LJIILLIIL().LJIIIZ(31744, "ec_anchor_creator_photo_mode_enable", true, false);
        if (!anchorPublishPermission2.enableMultiAnchor && C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_video_publish_add_anchor_force_single", true) != 0) {
            z = false;
        }
        return new AnchorPublishPermission(z2, z, anchorPublishPermission2.enableShopAnchor);
    }

    @Override // X.InterfaceC19511711Vj
    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJII = null;
        LIZLLL = null;
        LJ = null;
        LJFF = null;
        LJI = null;
    }

    @Override // X.InterfaceC19511711Vj
    public final AnchorPublishPermission LIZLLL() {
        AnchorPublishPermission anchorPublishPermission = LJI;
        return anchorPublishPermission == null ? LJ : anchorPublishPermission;
    }

    public static String LJ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        if (userId == null || userId.length() == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(userId);
        sbLIZ.append("_kECSVCreatorPermissionCacheKey");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF() {
        String strLJ = LJ();
        if (strLJ != null) {
            LIZ.getClass();
            String string = ((Keva) LIZIZ.getValue()).getString(strLJ, "");
            if (string.length() > 0) {
                try {
                    PermissionCacheWrapper permissionCacheWrapper = (PermissionCacheWrapper) ((Gson) LIZJ.getValue()).LJII(string, PermissionCacheWrapper.class);
                    LIZLLL = permissionCacheWrapper.photomode;
                    LJ = permissionCacheWrapper.video;
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    @Override // X.InterfaceC19511711Vj
    public final void LIZJ() {
        LJFF();
        AnonymousClass0956 anonymousClass0956 = LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        LJII = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C594250NSl(null), 3);
    }

    public static final class PermissionCacheWrapper {

        @C09CT("photomode")
        public final AnchorPublishPermission photomode;

        @C09CT("video")
        public final AnchorPublishPermission video;

        public PermissionCacheWrapper(AnchorPublishPermission anchorPublishPermission, AnchorPublishPermission anchorPublishPermission2) {
            this.photomode = anchorPublishPermission;
            this.video = anchorPublishPermission2;
        }
    }
}
