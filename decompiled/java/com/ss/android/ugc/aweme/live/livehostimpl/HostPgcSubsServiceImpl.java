package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C098200Yq;
import X.C11NZ;
import X.C189200o6;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsServiceDummy;
import com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.PGCSubsServiceImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class HostPgcSubsServiceImpl implements IHostPgcSubsService {
    public static PGCSubsService LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = PGCSubsServiceImpl.LJIIIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (PGCSubsService) c098200Yq;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcSubOnlySpaceDetailFragment() {
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ != null) {
            return pGCSubsServiceLIZ.LIZLLL();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcSubOnlySpaceFragment() {
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ != null) {
            return pGCSubsServiceLIZ.LJIIIIZZ();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcSubSpaceActivityListFragment() {
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ != null) {
            return pGCSubsServiceLIZ.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Context wrapWithPgcOverlay(Context context) {
        Context contextWrapWithPgcOverlay;
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ != null && (contextWrapWithPgcOverlay = pGCSubsServiceLIZ.wrapWithPgcOverlay(context)) != null) {
            return contextWrapWithPgcOverlay;
        }
        return context;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcPrivilegePageFragment(String str, String str2, Bundle bundle) {
        String string = bundle.getString("group_id");
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ != null) {
            return pGCSubsServiceLIZ.LJ(bundle, str, str2, string);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final C11NZ<n> getPgcSubscribeInfo(boolean z, String str, boolean z2, String str2, int i) {
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ != null) {
            return pGCSubsServiceLIZ.getSubscribeInfo(z, str, z2, str2, i);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final boolean openPgcSpotlightPrivilegePopup(Context context, String str, String str2, String str3, boolean z) {
        Uri uri;
        Object c098200Yq;
        PGCSubsService pGCSubsServiceLIZ = LIZ();
        if (pGCSubsServiceLIZ == null || (pGCSubsServiceLIZ instanceof PGCSubsServiceDummy)) {
            return false;
        }
        if (!z) {
            uri = null;
        } else {
            try {
                uri = UriProtector.parse("aweme://pgc_subscription/spotlight?preview_mode=1");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        pGCSubsServiceLIZ.LIZIZ(context, true, str2, str3, str, "", new SubscriptionSceneContext(0L, 0L, str, null, null, str2, null, null, false, false, "spotlight_host", false, null, 0L, 0L, null, null, false, null, uri, 522970));
        c098200Yq = Boolean.TRUE;
        C189200o6.m2constructorimpl(c098200Yq);
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
