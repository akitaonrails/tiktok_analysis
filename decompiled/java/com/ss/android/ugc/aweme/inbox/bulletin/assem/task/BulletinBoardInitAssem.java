package com.ss.android.ugc.aweme.inbox.bulletin.assem.task;

import X.C0OJW;
import X.C0OJX;
import X.C0OPX;
import X.C1150504el;
import X.C2188811AlT;
import X.C622190Oan;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardInitAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Integer num;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"BulletinBoardInitAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        boolean z = C0OJX.LIZIZ() && (num = C0OJW.LIZ.prepareScene) != null && num.intValue() == 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInitByBootFinish:");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C0OPX.LJII("BulletinBoardInitAssem First Feed Completed");
            C0OJX.LIZ = true;
            C622190Oan.LIZ.LJIIIIZZ(C0OJX.LIZ());
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
