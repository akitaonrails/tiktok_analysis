package com.ss.android.ugc.aweme.ecommerce.anchor.service;

import X.AnonymousClass0317;
import X.C034S;
import X.C1038610d8N;
import X.C1120604Zw;
import X.C1344705Ob;
import X.C1345605Ok;
import X.C1508320pLy;
import X.C18LB;
import X.C18LC;
import X.C18LD;
import X.C18N9;
import X.C19512111Vn;
import X.C1AQS;
import X.C20295214b8;
import X.C20738716Dh;
import X.C20739116Dl;
import X.C21271918Mj;
import X.C21272518Mp;
import X.C23271099x;
import X.C948503nH;
import X.InterfaceC1350220lEy;
import X.InterfaceC1508380pM4;
import X.InterfaceC1752840viM;
import X.InterfaceC1757230vpR;
import X.InterfaceC19511711Vj;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.manager.ECShortVideoPermissionManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.EcomVideoOptAB;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS235S0300000_26;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceVideoService implements IECommerceVideoService {
    public C18LD LIZ;
    public View LIZIZ;
    public ViewGroup LIZJ;
    public String LIZLLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("creator_bo_toggle_video", 0) == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LJIIIIZZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("creator_bc_toggle_video", 0) == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LJIIIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_sv_enable_photo_mode_permission_fix", true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final InterfaceC19511711Vj LJIIJ() {
        IECommerceAnchorService iECommerceAnchorService;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_fetch_b_side_permissions_from_api", false) && (iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null)) != null && iECommerceAnchorService.LJJIZ()) {
            return ECShortVideoPermissionManager.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final InterfaceC1350220lEy LIZIZ() {
        return C21271918Mj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LIZ(Aweme aweme) {
        return C18N9.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LIZLLL(String str) throws JSONException {
        boolean zBooleanValue;
        Map<String, Boolean> map = C1344705Ob.LIZ;
        if (map.containsKey(str)) {
            Boolean bool = (Boolean) ((LinkedHashMap) map).get(str);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
            C1345605Ok.LIZ(1, zBooleanValue);
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }
        if (((EcomVideoOptAB.EcVideoOptConfig) EcomVideoOptAB.LIZIZ.getValue()).ecVideoSRPredictEnable) {
            C1345605Ok.LIZ(2, false);
        }
        C1345605Ok.LIZ(0, false);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.18LD] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LIZJ(View view, InterfaceC1752840viM interfaceC1752840viM, String str) {
        boolean z;
        C21272518Mp.LIZ.getClass();
        if (!C21272518Mp.LIZIZ || interfaceC1752840viM == null || interfaceC1752840viM.nb() == null || interfaceC1752840viM.LJJIJL() == null || this.LIZIZ == null) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new Object() { // from class: X.18LD
            };
        }
        try {
            IECommerceService iECommerceService = (IECommerceService) ServiceManager.get().getService(IECommerceService.class);
            Context context = view.getContext();
            String str2 = this.LIZLLL;
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            ViewGroup viewGroup = this.LIZJ;
            anchorBizUtils.getClass();
            if (viewGroup != null) {
                Rect rect = new Rect();
                if (!viewGroup.getLocalVisibleRect(rect) || rect.bottom - rect.top <= viewGroup.getHeight() / 2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            iECommerceService.doNewCartAnimation(context, null, str2, z, 0, interfaceC1752840viM.nb(), this.LIZJ, interfaceC1752840viM.LJJIJL(), new AwS235S0300000_26(this, interfaceC1752840viM, view, str, 51));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LJFF(View view, ViewGroup viewGroup, String str) {
        this.LIZIZ = view;
        this.LIZJ = viewGroup;
        this.LIZLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LJI(Fragment fragment, LifecycleOwner lifecycleOwner, List list, C19512111Vn c19512111Vn) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        long j;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        if (userId != null) {
            j = CastLongProtector.parseLong(userId);
        } else {
            j = 0;
        }
        C948503nH.LJ(lifecycleOwner, C23271099x.INSTANCE, new C20295214b8(j, list, this, c19512111Vn, fragment, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final InterfaceC1757230vpR LJIIJJI(Fragment fragment, FrameLayout frameLayout, C20739116Dl c20739116Dl, boolean z, C1038610d8N c1038610d8N) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ec_sv_picture_in_picture_enable", true)) {
            return null;
        }
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ != null && interfaceC1508380pM4LIZ.LIZLLL() == -1) {
            return null;
        }
        return new C20738716Dh(fragment, frameLayout, c20739116Dl, z, c1038610d8N);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LJII(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        C18LB next;
        Iterator<C18LB> it2 = C18LC.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ(str, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C18LB c18lb = next;
        if (c18lb != null) {
            c18lb.LIZIZ(uri, z);
        }
    }
}
