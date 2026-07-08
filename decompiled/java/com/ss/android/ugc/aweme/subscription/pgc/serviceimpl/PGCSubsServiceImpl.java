package com.ss.android.ugc.aweme.subscription.pgc.serviceimpl;

import X.C01GW;
import X.C04TD;
import X.C0HE8;
import X.C0K4C;
import X.C0K52;
import X.C0K6O;
import X.C0K6T;
import X.C0KLQ;
import X.C11NZ;
import X.C452501pT;
import X.C511620K4q;
import X.InterfaceC1487280oo2;
import X.InterfaceC511460K4a;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public class PGCSubsServiceImpl implements PGCSubsService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(187));

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final Fragment LIZ() {
        return C0K4C.LIZ(null, "pgc_sub_space_activity_list_fragment");
    }

    public static PGCSubsService LJIIIZ() {
        Object objLIZ = C04TD.LIZ(PGCSubsService.class, false);
        if (objLIZ != null) {
            return (PGCSubsService) objLIZ;
        }
        if (C04TD.F5 == null) {
            synchronized (PGCSubsService.class) {
                if (C04TD.F5 == null) {
                    C04TD.F5 = new PGCSubsServiceImpl();
                }
            }
        }
        return C04TD.F5;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final C0K6O LIZJ() {
        return (C0K6O) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final Fragment LIZLLL() {
        return new SubSpaceDetailFragment();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final Fragment LJIIIIZZ() {
        return new SubSpaceFeedFragment();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final InterfaceC511460K4a LJFF() {
        return new InterfaceC511460K4a() { // from class: X.0K4p
            @Override // X.InterfaceC511460K4a
            public final boolean isAvailable() {
                return true;
            }

            public static boolean LJII(Uri uri, Context context) {
                Object c098200Yq;
                C511540K4i.LIZ.getClass();
                int i = C511600K4o.LIZ[C511540K4i.LIZ(context, uri, null).ordinal()];
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                if (i == 3) {
                    if (context == null) {
                        return false;
                    }
                    try {
                        SmartRouter.buildRoute(context, uri.toString()).open();
                        c098200Yq = Boolean.TRUE;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = bool;
                    }
                    return ((Boolean) c098200Yq).booleanValue();
                }
                throw new C1954807lC();
            }

            public static final Uri LJIIIIZZ(Uri uri, Map<String, String> map) {
                if (uri == null) {
                    return null;
                }
                Iterator<T> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    uri = C0K51.LJIIIIZZ(uri, (String) entry.getKey(), (String) entry.getValue());
                }
                return uri;
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LJI(Context context, Map map) {
                return C511630K4r.LIZLLL(this, context, map);
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                Uri uriLJIIIIZZ = LJIIIIZZ(uri, map);
                if (uriLJIIIIZZ == null) {
                    return false;
                }
                return LJII(uriLJIIIIZZ, context);
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LIZIZ(Context context, String str, Map<String, String> map) {
                return LJ(context, str, map);
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LIZJ(Context context, String str, Map<String, String> map) {
                return LJ(context, str, map);
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LIZLLL(Context context, String str, Map<String, String> map) {
                return LJ(context, str, map);
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LJ(Context context, String str, Map<String, String> map) {
                Object c098200Yq;
                if (str != null && !a0.LJJJIL(str)) {
                    Object obj = null;
                    if (0 == 0) {
                        try {
                            c098200Yq = LJIIIIZZ(UriProtector.parse(str), map);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj = c098200Yq;
                        }
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            return LJII(uri, context);
                        }
                    }
                }
                return false;
            }

            @Override // X.InterfaceC511460K4a
            public final boolean LJFF(Context context, long j, Map map) {
                return C511630K4r.LIZJ(this, context, j, map);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final InterfaceC511460K4a LJI() {
        return C511620K4q.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final Context wrapWithPgcOverlay(Context context) {
        return C0HE8.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final boolean LJII(Context context, String str, Bundle bundle) {
        C0K52.LIZ(context, str, bundle);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final Fragment LJ(Bundle bundle, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        return C0K6T.LIZ(bundle, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    public final C11NZ<n> getSubscribeInfo(boolean z, String str, boolean z2, String str2, int i) {
        C11NZ<DataResponse<n>> subscribeInfo = C0KLQ.LIZ().getSubscribeInfo(z, str, z2, str2, i);
        if (subscribeInfo != null) {
            return subscribeInfo.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0K63
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((DataResponse) obj).data;
                }
            });
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r14, boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext r20) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.PGCSubsServiceImpl.LIZIZ(android.content.Context, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext):void");
    }
}
