package com.ss.android.ugc.aweme.internalshare.impl.refactor.vm;

import X.AnonymousClass0950;
import X.AnonymousClass0956;
import X.C01GW;
import X.C06ZN;
import X.C09IC;
import X.C09IR;
import X.C0I1F;
import X.C123100dR;
import X.C1361720lXW;
import X.C1362120lYA;
import X.C1362190lYH;
import X.C1599690rjL;
import X.C1606620ruW;
import X.C2201941BFw;
import X.C2252331DDr;
import X.C23250099c;
import X.C310720CFy;
import X.C452501pT;
import X.EnumC1364450lbv;
import X.InterfaceC0148002o;
import X.InterfaceC1362400lYc;
import X.InterfaceC1365380ldQ;
import android.os.Bundle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ForwardLimitSetting;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareContactListViewModel extends AssemViewModel<C1362190lYH> implements InterfaceC1362400lYc {
    public C1362120lYA LLILLJJLI;
    public AnonymousClass0956 LLILZ;
    public List<? extends IMContact> LLILZIL;
    public C1361720lXW LLILZLL;
    public String LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final AnonymousClass0950 LLJ;
    public EnumC1364450lbv LL = EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 649));

    public final boolean AQ2() {
        SharePackage sharePackage;
        Bundle bundle;
        SharePackage sharePackage2;
        Bundle bundle2;
        C1362120lYA c1362120lYA = this.LLILLJJLI;
        boolean z = (c1362120lYA == null || (sharePackage2 = c1362120lYA.LL) == null || (bundle2 = sharePackage2.extras) == null) ? false : bundle2.getBoolean("comment_direct_share");
        C1362120lYA c1362120lYA2 = this.LLILLJJLI;
        return (getState().LLILLL.isEmpty() ^ true) || z || ((c1362120lYA2 == null || (sharePackage = c1362120lYA2.LL) == null || (bundle = sharePackage.extras) == null) ? false : bundle.getBoolean("show_edit_send_direct_im_share"));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1362190lYH(0);
    }

    public final int xQ2() {
        SharePackage sharePackage;
        Bundle bundle;
        C1362120lYA c1362120lYA = this.LLILLJJLI;
        if (c1362120lYA == null || (sharePackage = c1362120lYA.LL) == null || (bundle = sharePackage.extras) == null) {
            return 0;
        }
        return bundle.getInt("forward_limit_label_category", 0);
    }

    public final int yQ2() {
        C310720CFy c310720CFyLIZIZ;
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpi$default(IAwemeImManager.class, false, false, false, 14, null);
        if (iAwemeImManager == null || iAwemeImManager.getProxy() == null || (c310720CFyLIZIZ = C1606620ruW.LIZIZ()) == null) {
            return 10;
        }
        return c310720CFyLIZIZ.LIZ;
    }

    public ShareContactListViewModel() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    @Override // X.InterfaceC1362400lYc
    public final boolean gr0(C1362190lYH c1362190lYH) {
        String string;
        Set<IMContact> set;
        SharePackage sharePackage;
        Bundle bundle;
        String string2;
        SharePackage sharePackage2;
        Bundle bundle2;
        C1362120lYA c1362120lYA = this.LLILLJJLI;
        String str = "";
        if (c1362120lYA == null || (sharePackage2 = c1362120lYA.LL) == null || (bundle2 = sharePackage2.extras) == null || (string = bundle2.getString("aid")) == null) {
            string = "";
        }
        if (!C123100dR.LIZ(string) || xQ2() <= 0) {
            return false;
        }
        int iLIZ = ForwardLimitSetting.LIZ(xQ2());
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
        C1362120lYA c1362120lYA2 = this.LLILLJJLI;
        if (c1362120lYA2 != null && (sharePackage = c1362120lYA2.LL) != null && (bundle = sharePackage.extras) != null && (string2 = bundle.getString("aid")) != null) {
            str = string2;
        }
        int iLJIIL = shareService.LJIIL(xQ2(), str);
        if (iLIZ < 0) {
            return false;
        }
        if (c1362190lYH == null || (set = c1362190lYH.LLILLL) == null) {
            set = getState().LLILLL;
        }
        int size = set.size();
        if (iLJIIL < 0) {
            if (size >= iLIZ) {
                return true;
            }
            return false;
        }
        if (size >= Math.min(iLIZ, iLJIIL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    public final void wQ2(C0I1F c0i1f) {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C06ZN(this, c0i1f, null), 3);
    }

    @Override // X.InterfaceC1362400lYc
    public final boolean F62(IMContact iMContact, C1362190lYH c1362190lYH) {
        if (c1362190lYH == null) {
            c1362190lYH = getState();
        }
        if (c1362190lYH.LLILZIL) {
            if (iMContact instanceof IMUser) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                int followStatus = ((IMUser) iMContact).getFollowStatus();
                c2201941BFw.getClass();
                if (!C2201941BFw.LIZLLL(followStatus)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1362430lYf zQ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 != 0) goto L15
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 != 0) goto L15
            boolean r0 = r3 instanceof X.C1363190lZt
            if (r0 != 0) goto L15
            X.0lYf r1 = X.EnumC1362430lYf.UNSUPPORTED
        Le:
            boolean r0 = r1.isSuccess()
            if (r0 != 0) goto L40
            return r1
        L15:
            if (r4 == 0) goto L3d
            X.002o r1 = r2.getState()
            X.0lYH r1 = (X.C1362190lYH) r1
            java.util.Set<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r0 = r1.LLILLL
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L3d
            boolean r0 = r2.gr0(r1)
            if (r0 == 0) goto L2e
            X.0lYf r1 = X.EnumC1362430lYf.FORWARD_RESTRICTED
            goto Le
        L2e:
            java.util.Set<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r0 = r1.LLILLL
            int r1 = r0.size()
            int r0 = r2.yQ2()
            if (r1 < r0) goto L3d
            X.0lYf r1 = X.EnumC1362430lYf.MULTI_SELECT_LIMIT
            goto Le
        L3d:
            X.0lYf r1 = X.EnumC1362430lYf.SUCCESS
            goto Le
        L40:
            kotlin.jvm.internal.AwS72S0210000_21 r1 = new kotlin.jvm.internal.AwS72S0210000_21
            r0 = 3
            r1.<init>(r2, r4, r3, r0)
            r2.withState(r1)
            X.0lYf r0 = X.EnumC1362430lYf.SUCCESS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel.zQ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean):X.0lYf");
    }
}
