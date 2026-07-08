package com.ss.android.ugc.aweme;

import X.C1606370ru7;
import X.C294700Bgq;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.detail.ui.saf.WithoutShellDetailSafRootFragment;

/* JADX INFO: loaded from: classes25.dex */
public final class DetailFeedSafServiceImpl implements IDetailFeedSafService {
    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    public final WithoutShellDetailSafRootFragment LIZIZ() {
        return new WithoutShellDetailSafRootFragment();
    }

    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    public final DetailSafRootFragment LJI() {
        return new DetailSafRootFragment();
    }

    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    public final boolean LJ() {
        return C294700Bgq.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LIZ(android.view.View r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L4
            return r3
        L4:
            boolean r0 = X.C294700Bgq.LIZ()
            if (r0 == 0) goto L8f
            android.content.Context r0 = r5.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L2c
            X.198i r2 = r0.LIZLLL()
            if (r2 == 0) goto L2c
        L1a:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment
            if (r0 == 0) goto L8f
            X.0ru7 r0 = X.C1606370ru7.LIZ
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0.getClass()
            boolean r0 = X.C1606370ru7.LIZLLL(r2)
            if (r0 == 0) goto L8f
            return r2
        L2c:
            android.content.Context r0 = r5.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            if (r0 == 0) goto L57
            android.content.Context r0 = r5.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L4a
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L57
        L48:
            r2 = r3
            goto L1a
        L4a:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L48
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L57
            goto L48
        L57:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r5)
            if (r2 == 0) goto L48
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L72
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L67:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L74
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L83
            goto L48
        L72:
            r1 = r3
            goto L67
        L74:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L48
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L83
            goto L48
        L81:
            if (r2 == 0) goto L48
        L83:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L8a
            X.198i r2 = (X.InterfaceC214902198i) r2
            goto L1a
        L8a:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L81
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.DetailFeedSafServiceImpl.LIZ(android.view.View):androidx.fragment.app.Fragment");
    }

    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    public final Fragment LIZJ(Context context) {
        if (context != null && C294700Bgq.LIZ()) {
            Object objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
            if (objLJIIIIZZ instanceof DetailSafRootFragment) {
                Fragment fragment = (Fragment) objLJIIIIZZ;
                C1606370ru7.LIZ.getClass();
                if (C1606370ru7.LIZLLL(fragment)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    public final Fragment LIZLLL(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        return C1606370ru7.LIZIZ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.IDetailFeedSafService
    public final boolean LJFF(Activity activity) {
        return C1606370ru7.LIZJ(activity);
    }
}
