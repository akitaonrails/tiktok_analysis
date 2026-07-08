package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C0I0B;
import X.C1365870leD;
import X.C1369440ljy;
import X.C1370970lmR;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1372790lpN;
import X.C1373440lqQ;
import X.C1374720lsU;
import X.C1377850lxX;
import X.C1599690rjL;
import X.C19EG;
import X.C621180OYa;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C894660Z7w;
import X.EnumC1473605pm;
import X.InterfaceC1366080leY;
import X.InterfaceC1369790lkX;
import X.InterfaceC1493505sz;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IIMShareOpenService;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class IMShareServiceImpl implements IMShareService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final boolean LJIIIZ() {
        IIMShareOpenService iIMShareOpenService = (IIMShareOpenService) PluggableExtentionKt.pluggableSpi$default(IIMShareOpenService.class, false, false, false, 14, null);
        return iIMShareOpenService != null && iIMShareOpenService.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final CopyStreakLinkChannel LJIILIIL() {
        return new CopyStreakLinkChannel();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final List<String> LJJIFFI() {
        IInternalShareApi.LIZ.getClass();
        List<SharePanelItemInfo> listLJIILL = C1370970lmR.LIZ().LIZIZ().LJIILL(null);
        ArrayList arrayList = new ArrayList();
        for (SharePanelItemInfo sharePanelItemInfo : listLJIILL) {
            if (sharePanelItemInfo.idType == EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP.getValue()) {
                arrayList.add(sharePanelItemInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((SharePanelItemInfo) it2.next()).gid));
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final List<Long> getInternalShareSortedUids() {
        IInternalShareApi.LIZ.getClass();
        List<SharePanelItemInfo> listLJIILL = C1370970lmR.LIZ().LIZIZ().LJIILL(null);
        ArrayList arrayList = new ArrayList();
        Iterator<SharePanelItemInfo> it2 = listLJIILL.iterator();
        while (it2.hasNext()) {
            Long l = it2.next().uid;
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LIZJ(List<? extends C869590Y9l> list) {
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LIZJ(list);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJFF(C869590Y9l c869590Y9l) {
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJFF(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJI(String str) {
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().LIZJ().LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final boolean LJII(int i) {
        return C621180OYa.LIZIZ.LJII(i);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIIIIZZ(C869590Y9l c869590Y9l) {
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJIIIIZZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIILL(boolean z) {
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJIL(z);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIJI(int i) {
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJIJI(null, i, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final boolean LJJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        return interfaceC1369790lkX instanceof CopyGroupLinkChannel;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final boolean LJJIIJ(IEvent iEvent) {
        if (iEvent instanceof C1365870leD) {
            C1365870leD c1365870leD = (C1365870leD) iEvent;
            if (Intrinsics.LJFF(c1365870leD.LJ, "group") && Intrinsics.LJFF(c1365870leD.LIZLLL, "group")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LIZ(Context context, BaseSharePackage baseSharePackage) {
        IExternalCreateGroupService iExternalCreateGroupService = (IExternalCreateGroupService) PluggableExtentionKt.pluggableSpi$default(IExternalCreateGroupService.class, false, false, false, 14, null);
        if (iExternalCreateGroupService != null) {
            iExternalCreateGroupService.LIZ(context, baseSharePackage);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LIZIZ(Context context, Bundle bundle) {
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LIZIZ(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final boolean LIZLLL(View view, C869590Y9l c869590Y9l) {
        IMSharePanelApi.LIZ.getClass();
        return C1599690rjL.LIZ().getShareService().LIZLLL(view, c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIIJJI(int i, final AwS53S1000000_2 awS53S1000000_2) {
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJIJI(null, i, new InterfaceC1366080leY() { // from class: X.0ljx
            @Override // X.InterfaceC1366080leY
            public final void LIZ() {
                awS53S1000000_2.invoke(this.getInternalShareSortedUids());
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIIL(Activity activity, C1371590lnR c1371590lnR) {
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJII(activity, c1371590lnR, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIILJJIL(C19EG c19eg, GroupSharePackage groupSharePackage) {
        IMSharePanelApi.LIZ.getClass();
        C786410Ut5.B4(C1599690rjL.LIZ().getShareService().LJJJJZ(c19eg, groupSharePackage, null, null, false, null, false, null, false, true, false, false, null, false, false, false, null));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final TuxSheet LJIIZILJ(Activity activity, C1371590lnR c1371590lnR) {
        C621180OYa.LIZIZ.LJJJIL(c1371590lnR.LJIJJ);
        ShareDependService.LIZ.getClass();
        return ShareDependServiceImpl.LJJJJI().LJII(activity, c1371590lnR, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIJ(C19EG c19eg, C1371600lnS c1371600lnS) {
        C621180OYa.LIZ.LJIILIIL(c19eg, c1371600lnS, false, false);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIJJ(Context context, String str) {
        C1377850lxX c1377850lxX = new C1377850lxX(null, false, 3);
        if (context == null) {
            C0I0B.LJFF.LIZJ();
            context = C894660Z7w.LIZ();
        }
        c1377850lxX.LIZ(str, context, C1369440ljy.LIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIJJLI(C1371600lnS c1371600lnS, Activity activity) {
        C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activity, true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIL(C1371600lnS c1371600lnS, Activity activity) {
        C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activity, true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJJI(int i, final AwS53S1000000_2 awS53S1000000_2) {
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJIJI(null, i, new InterfaceC1366080leY() { // from class: X.0ljw
            @Override // X.InterfaceC1366080leY
            public final void LIZ() {
                awS53S1000000_2.invoke(this.LJJIFFI());
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final SharePackage LJIILLIIL(Context context, Aweme aweme, String str) {
        return C621180OYa.LIZ.LJJJLIIL(7000, context, aweme, "chat", str, "share_post");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final String LJJII(InterfaceC1369790lkX interfaceC1369790lkX, String str, String str2) {
        C1373440lqQ.LIZ.getClass();
        return C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final String LJJIII(int i, String str, String str2, String str3) {
        return C1374720lsU.LIZJ(str, str2, str3, i, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJ(SharePackage sharePackage, IMContact iMContact, long j, InterfaceC1493505sz interfaceC1493505sz, int i) {
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJ(sharePackage, iMContact, j, interfaceC1493505sz, i);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService
    public final void LJIIJ(Activity activity, String str, C1372790lpN c1372790lpN, String str2, String str3) {
        C621180OYa.LIZ.LJIIJ(activity, str, c1372790lpN, str2, str3);
    }
}
