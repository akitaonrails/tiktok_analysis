package com.ss.android.ugc.aweme.services;

import X.AbstractC1549150qPp;
import X.AnonymousClass1506;
import X.C0TR7;
import X.C0TV7;
import X.C0TVQ;
import X.C0XS3;
import X.C1028600csE;
import X.C1049640dQA;
import X.C1196000hEE;
import X.C1196430hEv;
import X.C1367960lha;
import X.C13BV;
import X.C1697810uHb;
import X.C1793800wmQ;
import X.C1793820wmS;
import X.C1800740wxc;
import X.C1879170z07;
import X.C1888090zEV;
import X.C1911710zqb;
import X.C19226910Jv;
import X.C19275310b1;
import X.C1BFM;
import X.C21510119Fz;
import X.C2198461B2m;
import X.C2384509Vz;
import X.C2434509gN;
import X.C634800Ov8;
import X.C747920TVm;
import X.C748270TWv;
import X.C835870Wqf;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MainXBridgeServiceImpl implements IMainXBridgetService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService
    public List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJ;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIILL;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJJIII;
        ArrayList arrayListLJ = C1697810uHb.LJ(C835870Wqf.class, C2384509Vz.class, C2198461B2m.class, C1196430hEv.class, C0TV7.class, C1800740wxc.class, C747920TVm.class, C1888090zEV.class, C21510119Fz.class, C1879170z07.class, C19226910Jv.class, C1196000hEE.class, AnonymousClass1506.class, C1BFM.class, C0TVQ.class, C19275310b1.class, C1911710zqb.class, C748270TWv.class, C2434509gN.class, C0XS3.class, C1793820wmS.class, C1793800wmQ.class, C1028600csE.class, C1049640dQA.class, C0TR7.class, C634800Ov8.class);
        IShortcutService iShortcutService = (IShortcutService) ServiceManager.get().getService(IShortcutService.class);
        if (iShortcutService == null || (listLJ = iShortcutService.LJ()) == null) {
            listLJ = C13BV.INSTANCE;
        }
        arrayListLJ.addAll(listLJ);
        IUgCommonService iUgCommonService = (IUgCommonService) ServiceManager.get().getService(IUgCommonService.class);
        if (iUgCommonService == null || (listLJIILL = iUgCommonService.LJIILL()) == null) {
            listLJIILL = C13BV.INSTANCE;
        }
        arrayListLJ.addAll(listLJIILL);
        IExploreFeedService iExploreFeedService = (IExploreFeedService) ServiceManager.get().getService(IExploreFeedService.class);
        if (iExploreFeedService == null || (listLJJIII = iExploreFeedService.LJJIII()) == null) {
            listLJJIII = C13BV.INSTANCE;
        }
        arrayListLJ.addAll(listLJJIII);
        C1367960lha.LIZ.getClass();
        Class<? extends AbstractC1549150qPp<?, ?>> clsLJJJI = C1367960lha.LIZ().LJJJI();
        if (clsLJJJI != null) {
            arrayListLJ.add(clsLJJJI);
        }
        return arrayListLJ;
    }
}
