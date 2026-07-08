package com.ss.android.ugc.aweme.subscription.pgc.host;

import X.C098200Yq;
import X.C0K52;
import X.C0K54;
import X.C10E1;
import X.C10ET;
import X.C10EW;
import X.C189200o6;
import X.C19EG;
import X.C2097608Jq;
import X.C2214201BlK;
import X.C511720K5a;
import X.C512250K7b;
import X.C786410Ut5;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcHostActionAdapter implements PgcHostAction {
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction
    public final Activity getTopActivity() {
        return C2214201BlK.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction
    public final Context getTopContext() {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            return activityLJFF;
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction
    public final boolean LIZIZ(Context context, Bundle bundle) {
        String string;
        String str;
        if (Intrinsics.LJFF("aweme://live/container", "aweme://live/container")) {
            if ((context != null || (context = getTopContext()) != null) && (string = bundle.getString("fragment_type")) != null) {
                switch (string.hashCode()) {
                    case -1914165584:
                        if (string.equals("pgc_privilege_page")) {
                            str = "pgc_privilege_page_fragment";
                        }
                        break;
                    case -786846363:
                        if (string.equals("pgc_sub_only_space")) {
                            str = "pgc_sub_only_space_fragment";
                        }
                        break;
                    case -372605845:
                        if (string.equals("pgc_sub_only_space_detail")) {
                            str = "pgc_sub_only_space_detail_fragment";
                        }
                        break;
                    case 1114097123:
                        if (string.equals("pgc_sub_space_activity_list")) {
                            str = "pgc_sub_space_activity_list_fragment";
                        }
                        break;
                    default:
                        return false;
                }
                Bundle bundle2 = new Bundle(bundle);
                String string2 = bundle.getString("enter_from");
                if ((string2 == null || string2.length() == 0 || string2 == null) && (string2 = bundle.getString("enter_from_merge")) == null) {
                    string2 = "";
                }
                C786410Ut5.LJJJI("enter_from", string2, bundle2);
                C0K52.LIZ(context, str, bundle2);
                return true;
            }
            return false;
        }
        return C0K54.LIZ().LJ(context, "aweme://live/container", C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction
    public final void LIZ(C19EG c19eg, Uri.Builder builder, Bundle bundle) {
        if (builder == null) {
            return;
        }
        try {
            ComplianceServiceProvider.LJJ().report(c19eg, builder, bundle);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.host.PgcHostAction
    public final void LIZJ(int i, String str, String str2, String str3, String str4, int i2, View view, final C512250K7b c512250K7b, final C511720K5a c511720K5a) {
        Object c098200Yq;
        Activity activityLJFF;
        ILiveOuterService iLiveOuterServiceQ4;
        Context context = null;
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null) {
                c098200Yq = iLiveOuterServiceQ4.M4();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C10E1 c10e1 = (C10E1) c098200Yq;
        if (c10e1 == null) {
            return;
        }
        if (view != null) {
            context = view.getContext();
        }
        if ((!(context instanceof Activity) || (activityLJFF = (Activity) context) == null) && (activityLJFF = C2214201BlK.LJFF()) == null) {
            return;
        }
        User user = new User();
        user.setUid(str2);
        user.setUniqueId(str3);
        user.setFollowStatus(i);
        user.setLivePushNotificationStatus(i2);
        user.setSecUid(str4);
        user.setNickname(str);
        c10e1.LJIILL(new C10ET(user, activityLJFF, "", "others_homepage", null, null, null, null, true, new C10EW() { // from class: X.0K7c
            public final /* synthetic */ String LIZJ = "";

            @Override // X.C10EW
            public final C10EF LIZIZ() {
                C512250K7b c512250K7b2 = c512250K7b;
                return new C10EF(c512250K7b2.LIZ, c512250K7b2.LIZIZ, c512250K7b2.LIZJ, c512250K7b2.LIZLLL, c512250K7b2.LJ);
            }

            @Override // X.C10EW
            public final void LIZJ() {
                InterfaceC512270K7d interfaceC512270K7d = c511720K5a;
                if (interfaceC512270K7d != null) {
                    interfaceC512270K7d.LIZIZ();
                }
            }

            @Override // X.C10EW
            public final String LIZLLL() {
                return this.LIZJ;
            }

            @Override // X.C10EW
            public final void LJ(int i3, int i4) {
                InterfaceC512270K7d interfaceC512270K7d;
                if (i3 == 4 && (interfaceC512270K7d = c511720K5a) != null) {
                    interfaceC512270K7d.LIZ(i4);
                }
            }
        }, null, 1264));
    }
}
