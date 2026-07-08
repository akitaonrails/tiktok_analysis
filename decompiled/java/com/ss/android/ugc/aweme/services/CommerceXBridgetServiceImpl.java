package com.ss.android.ugc.aweme.services;

import X.AbstractC1549150qPp;
import X.C0DPG;
import X.C1015100cWS;
import X.C1015190cWb;
import X.C1015260cWi;
import X.C1015700cXQ;
import X.C1015770cXX;
import X.C1015820cXc;
import X.C1015990cXt;
import X.C1020530cfD;
import X.C1020570cfH;
import X.C1027670cqj;
import X.C1027680cqk;
import X.C1028110crR;
import X.C1028170crX;
import X.C1028500cs4;
import X.C1035590d3V;
import X.C1036780d5Q;
import X.C1037320d6I;
import X.C1038320d7u;
import X.C1039710dA9;
import X.C1039760dAE;
import X.C1041410dCt;
import X.C1044280dHW;
import X.C1068010dtn;
import X.C1068140du0;
import X.C1395190mPV;
import X.C13LP;
import X.C1466305ob;
import X.C1697810uHb;
import X.C1711840ueE;
import X.C2384409Vy;
import X.C343300Dd2;
import X.C600910NhZ;
import X.C600930Nhb;
import X.C602120NjW;
import X.C602300Njo;
import X.C603230NlJ;
import X.C603310NlR;
import X.C684230Qsf;
import X.C844470XAv;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingXBridgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceXBridgetServiceImpl implements ICommerceXBridgetService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService
    public List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(C1068010dtn.class, C1041410dCt.class, C1027670cqj.class, C1027680cqk.class, C1035590d3V.class, C1028170crX.class, C1395190mPV.class, C600910NhZ.class, C600930Nhb.class, C602120NjW.class, C1020530cfD.class, C1711840ueE.class, C1036780d5Q.class, C603230NlJ.class, C1039760dAE.class, C1039710dA9.class, C1015260cWi.class, C1068140du0.class, C1466305ob.class, C684230Qsf.class, C2384409Vy.class, C1015770cXX.class, C1015700cXQ.class, C1015990cXt.class, C1015820cXc.class, C1015190cWb.class, C1044280dHW.class, C1015100cWS.class, C1020570cfH.class, C1037320d6I.class, C602300Njo.class, C1038320d7u.class, C343300Dd2.class, C0DPG.class, C1028500cs4.class);
        IShoppingXBridgetService iShoppingXBridgetService = (IShoppingXBridgetService) PluggableExtentionKt.pluggableSpi$default(IShoppingXBridgetService.class, false, false, false, 14, null);
        if (iShoppingXBridgetService != null && (listProvideXBridgetIDLMethodList = iShoppingXBridgetService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it2 = listProvideXBridgetIDLMethodList.iterator();
            while (it2.hasNext()) {
                listLJIILJJIL.add(it2.next());
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("get_native_site_custom_data_idl_switch", true)) {
            listLJIILJJIL.add(C1028110crR.class);
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            listLJIILJJIL.add(C603310NlR.class);
        }
        return C13LP.LLIIII(listLJIILJJIL);
    }
}
