package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C01GW;
import X.C0PEM;
import X.C11JF;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C23250099c;
import X.C452501pT;
import X.C636990Oyf;
import X.C637000Oyg;
import X.C723580SZw;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.inbox.banner.InboxPlatformBannerEventProtocol;
import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxPlatformBannerAssem extends InboxBannerAssem {
    public final C1559260qg8 LLILZ = new C1559260qg8(new C723580SZw(this, InboxBannerInfo.class, null), checkSupervisorPrepared());
    public final AwS553S0100000_9 LLILZIL = new AwS553S0100000_9(this, 1363);
    public final AFwS195S0000000_9 LLILZLL = AFwS195S0000000_9.get$arr$(266);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(267));
    public C11JF LLIZLLLIL;

    public final InboxBannerInfo ho() {
        return (InboxBannerInfo) this.LLILZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[PHI: r1
      0x0083: PHI (r1v15 java.lang.String) = (r1v3 java.lang.String), (r1v16 java.lang.String) binds: [B:36:0x0081, B:34:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[PHI: r1
      0x0087: PHI (r1v14 java.lang.String) = (r1v3 java.lang.String), (r1v15 java.lang.String) binds: [B:36:0x0081, B:38:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[PHI: r1
      0x0098: PHI (r1v12 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:45:0x0096, B:43:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[PHI: r1
      0x009c: PHI (r1v11 java.lang.String) = (r1v5 java.lang.String), (r1v12 java.lang.String) binds: [B:45:0x0096, B:47:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.InboxPlatformBannerAssem.onCreate():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        List listLIZIZ;
        InboxBannerInfo inboxBannerInfoHo = ho();
        if (inboxBannerInfoHo != null && (listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), InboxPlatformBannerEventProtocol.class, false)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (Intrinsics.LJFF(((InboxPlatformBannerEventProtocol) obj).LIZ().LIZ, inboxBannerInfoHo.bannerKey)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InboxPlatformBannerEventProtocol) it2.next()).LIZLLL(inboxBannerInfoHo);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C637000Oyg(this, null), 2);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            inboxAbilityCenter$IInboxFragmentAbility.ZE1(this.LLILZLL, this.LLILZIL);
        }
        C11JF c11jf = this.LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZLLLIL = null;
    }

    public final void ko(String str) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C636990Oyf(this, str, null), 2);
    }
}
