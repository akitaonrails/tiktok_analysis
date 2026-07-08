package com.ss.android.ugc.aweme.ecommerce.base.osp.domain.infra.component;

import X.C030M;
import X.C033N;
import X.C033P;
import X.C035N;
import X.C1954807lC;
import X.C742802vC;
import X.C742902vD;
import X.C743002vE;
import X.C743102vF;
import X.C743302vH;
import X.C755802xI;
import X.C765402yq;
import X.C765802yu;
import X.C766102yx;
import X.C766202yy;
import X.C767802zE;
import X.C770902zj;
import X.C771002zk;
import X.C771102zl;
import X.C771202zm;
import X.C771302zn;
import X.C771402zo;
import X.C771502zp;
import X.C771702zr;
import X.C771802zs;
import X.C771902zt;
import X.C772002zu;
import X.C772202zw;
import X.C772502zz;
import X.C7738030m;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OspCommonService implements IOspCommonService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.domain.infra.component.IOspCommonService
    public final List<C035N<?>> LIZ(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        int i = C033N.LIZ[C033P.LIZ(orderSubmitAssemViewModel.o, orderSubmitAssemViewModel.n).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C743102vF(orderSubmitAssemViewModel));
                        arrayList.add(new C743002vE(orderSubmitAssemViewModel));
                        arrayList.add(new C771002zk(orderSubmitAssemViewModel));
                        arrayList.add(new C771702zr(orderSubmitAssemViewModel));
                        arrayList.add(new C771502zp(orderSubmitAssemViewModel));
                        arrayList.add(new C772202zw(orderSubmitAssemViewModel));
                        arrayList.add(new C771802zs(orderSubmitAssemViewModel));
                        return arrayList;
                    }
                    throw new C1954807lC();
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C770902zj(orderSubmitAssemViewModel));
                arrayList2.add(new C771302zn(orderSubmitAssemViewModel));
                arrayList2.add(new C772002zu(orderSubmitAssemViewModel));
                arrayList2.add(new C742902vD(orderSubmitAssemViewModel));
                arrayList2.add(new C771202zm(orderSubmitAssemViewModel));
                arrayList2.add(new C771902zt(orderSubmitAssemViewModel));
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new C767802zE(orderSubmitAssemViewModel));
            arrayList3.add(new C742802vC(orderSubmitAssemViewModel));
            arrayList3.add(new C755802xI(orderSubmitAssemViewModel));
            arrayList3.add(new C771102zl(orderSubmitAssemViewModel));
            arrayList3.add(new C766102yx(orderSubmitAssemViewModel));
            arrayList3.add(new C030M(orderSubmitAssemViewModel));
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C765802yu(orderSubmitAssemViewModel));
        arrayList4.add(new C766202yy(orderSubmitAssemViewModel));
        arrayList4.add(new C7738030m(orderSubmitAssemViewModel));
        arrayList4.add(new C765402yq(orderSubmitAssemViewModel));
        arrayList4.add(new C743302vH(orderSubmitAssemViewModel));
        arrayList4.add(new C771402zo(orderSubmitAssemViewModel));
        arrayList4.add(new C772502zz(orderSubmitAssemViewModel));
        return arrayList4;
    }
}
