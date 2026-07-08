package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C019F;
import X.C01GW;
import X.C0Z3O;
import X.C0Z3Q;
import X.C13LE;
import X.C1637806bA;
import X.C1889140zGC;
import X.C1889180zGG;
import X.C1889200zGI;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C461720I8s;
import X.C687700QyG;
import X.C724750Sbp;
import X.C898680ZNi;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxSortWidgetContainer;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class InboxEntranceSortWidgetContainer extends InboxSortWidgetContainer implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public final Keva LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxEntranceSortWidgetContainer.class, "inboxBannerViewModel", "getInboxBannerViewModel()Lcom/ss/android/ugc/aweme/notification/banner/InboxBannerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxEntranceSortWidgetContainer() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxBannerViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1055), AFwS248S0000000_14.get$arr$(296), null, true);
        this.LLJJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(278));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceWidgetContainer:");
        sbLIZ.append(C461720I8s.LIZIZ());
        this.LLJJI = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InboxFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        ArrayList arrayList = new ArrayList();
        Map mapLJI = C1889140zGC.LIZ.LJI(this);
        C1889180zGG c1889180zGG = (C1889180zGG) mapLJI.get(C898680ZNi.LIZIZ);
        if (c1889180zGG != null && c1889180zGG.LIZLLL) {
            arrayList.add(c1889180zGG);
            c1889180zGG.LJ = C1889200zGI.LIZ;
        }
        C1889180zGG c1889180zGG2 = (C1889180zGG) mapLJI.get(C0Z3Q.LIZIZ);
        if (c1889180zGG2 != null && c1889180zGG2.LIZLLL) {
            arrayList.add(c1889180zGG2);
        }
        C1889180zGG c1889180zGG3 = (C1889180zGG) mapLJI.get(C0Z3O.LIZIZ);
        if (c1889180zGG3 != null && c1889180zGG3.LIZLLL) {
            arrayList.add(c1889180zGG3);
        }
        return arrayList;
    }
}
