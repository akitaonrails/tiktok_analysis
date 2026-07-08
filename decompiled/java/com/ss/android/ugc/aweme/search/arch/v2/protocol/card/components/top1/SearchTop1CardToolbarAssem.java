package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1;

import X.C01GW;
import X.C1247530iZL;
import X.C1559260qg8;
import X.C19EG;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C665230Q7l;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS501S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTop1CardToolbarAssem extends ReusedUISlotAssem<SearchTop1CardToolbarAssem> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C665230Q7l.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 255));
    public final int LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final List<C1247530iZL> LLJLL = new ArrayList();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 254));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 253));
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(149));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.evb;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String op() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.SearchTop1CardToolbarAssem.op():java.lang.String");
    }

    public final C665230Q7l sp() {
        return (C665230Q7l) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.y8s);
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
        if (tuxIconView != null) {
            C427690Gpr.LJI(tuxIconView, null);
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragmentLJI, c19egLIZ);
        if (fragmentManagerLJIILJJIL == null || C724240Sb0.LIZ(this) == null) {
            return;
        }
        TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AbS501S0200000_10(this, fragmentManagerLJIILJJIL, 0), tuxIconView2);
        }
        TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView3 != null) {
            HandlerHook.viewPost(tuxIconView3, new ARunnableS110S0100000_10(this, 37));
        }
    }
}
