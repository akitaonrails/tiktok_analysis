package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.C01GW;
import X.C0OLV;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.InterfaceC1146704e9;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPageNoSupportAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public C1749280vcc LLIZLLLIL;
    public LinearLayout LLJ;
    public TuxNavBar LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 317));
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[PHI: r1
      0x00f1: PHI (r1v8 android.view.View) = (r1v7 android.view.View), (r1v20 android.view.View) binds: [B:30:0x00db, B:35:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageNoSupportAssem.onViewCreated(android.view.View):void");
    }
}
