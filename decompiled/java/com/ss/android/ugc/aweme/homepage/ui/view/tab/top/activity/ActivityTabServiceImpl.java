package com.ss.android.ugc.aweme.homepage.ui.view.tab.top.activity;

import X.C0CXN;
import X.C1550600qSA;
import X.C1553670qX7;
import X.C1585070rLl;
import X.C20548215aq;
import X.EnumC1584360rKc;
import X.InterfaceC1583870rJp;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.experiment.TopActivityTabConfig;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.spi.IActivityTabService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class ActivityTabServiceImpl implements IActivityTabService {
    public String LIZ = "";

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final String LJFF() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final String LIZ(String str) {
        String strLJFF;
        C1585070rLl.LIZ.getClass();
        InterfaceC1583870rJp interfaceC1583870rJpLIZJ = C1585070rLl.LIZJ(str);
        if (interfaceC1583870rJpLIZJ == null || (strLJFF = interfaceC1583870rJpLIZJ.LJFF()) == null) {
            return "be_null";
        }
        return strLJFF;
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LIZIZ(Fragment fragment) {
        INearbyFeedService iNearbyFeedService = (INearbyFeedService) PluggableExtentionKt.pluggableSpi$default(INearbyFeedService.class, false, false, false, 14, null);
        if (iNearbyFeedService == null || !iNearbyFeedService.LIZIZ(fragment)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f1, code lost:
    
        if (r4 <= r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(com.ss.android.ugc.aweme.experiment.TopTabItem r18) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.activity.ActivityTabServiceImpl.LIZJ(com.ss.android.ugc.aweme.experiment.TopTabItem):boolean");
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LIZLLL(String str) {
        String strLJFF;
        C1585070rLl.LIZ.getClass();
        InterfaceC1583870rJp interfaceC1583870rJpLIZJ = C1585070rLl.LIZJ("Activity");
        if (interfaceC1583870rJpLIZJ != null) {
            strLJFF = interfaceC1583870rJpLIZJ.LJFF();
        } else {
            strLJFF = null;
        }
        return Intrinsics.LJFF(strLJFF, str);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LJ(TopTabItem topTabItem) {
        TopActivityTabConfig topActivityTabConfig;
        if (topTabItem == null || (topActivityTabConfig = topTabItem.activityConfig) == null) {
            return false;
        }
        return topActivityTabConfig.geckoForceCheck;
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LJI(EnumC1584360rKc enumC1584360rKc) {
        C0CXN.LIZ.getClass();
        return LIZJ(C0CXN.LIZLLL(enumC1584360rKc));
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LJII(TopTabItem topTabItem) {
        TopActivityTabConfig topActivityTabConfig;
        if (topTabItem == null || (topActivityTabConfig = topTabItem.activityConfig) == null) {
            return false;
        }
        C20548215aq c20548215aq = C20548215aq.LIZ;
        String str = topActivityTabConfig.geckoChannel;
        c20548215aq.getClass();
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        return C1550600qSA.LIZ(C1553670qX7.LIZ(), str);
    }
}
