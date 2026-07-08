package com.ss.android.ugc.aweme.ecommerce.mall.ui;

import X.C07B9;
import X.C09JN;
import X.C0PEM;
import X.C0XQ7;
import X.C1008603wy;
import X.C1150504el;
import X.C11NJ;
import X.C123100dR;
import X.C1570720qyc;
import X.C1767950w6j;
import X.C1767960w6k;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC1570770qyh;
import X.InterfaceC420801kM;
import X.InterfaceC586170Myt;
import X.RunnableC1570790qyj;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallMainActivityAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public final class MallMainActivityAssem extends BaseMainContainerAssem {
    public static boolean LLILLL;
    public static String LLILZ;
    public final C11NJ LL = new C11NJ();
    public boolean LLILLJJLI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MallMainActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        LLILZ = null;
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11NJ c11nj = this.LL;
        if (c11nj != null) {
            c11nj.dispose();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        try {
            if (!((Boolean) C07B9.LIZ.getValue()).booleanValue() || LLILLL) {
                return;
            }
            LLILLL = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1570720qyc(this, null), 3);
            C0XQ7.LJ();
            C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0qyi
                @Override // X.InterfaceC586170Myt
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    MallMainActivityAssem.LLILLL = false;
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MallMainActivityAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C823050WQl.LIZJ().execute(new RunnableC1570790qyj(this, EnumC1570770qyh.COLD_LAUNCH));
        InterfaceC420801kM interfaceC420801kMLJJLJLI = C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0qyg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MallMainActivityAssem@49df.addAppBackgroundObserver$1");
                if (((Boolean) obj).booleanValue()) {
                    MallMainActivityAssem mallMainActivityAssem = this.LL;
                    mallMainActivityAssem.LLILLJJLI = true;
                    C823050WQl.LIZJ().execute(new RunnableC1570790qyj(mallMainActivityAssem, EnumC1570770qyh.ENTER_BACKGROUND));
                } else {
                    MallMainActivityAssem mallMainActivityAssem2 = this.LL;
                    if (mallMainActivityAssem2.LLILLJJLI) {
                        mallMainActivityAssem2.LLILLJJLI = false;
                        C823050WQl.LIZJ().execute(new RunnableC1570790qyj(mallMainActivityAssem2, EnumC1570770qyh.HOT_LAUNCH));
                    }
                }
                C1C7U.LIZIZ("MallMainActivityAssem@49df.addAppBackgroundObserver$1");
            }
        });
        C11NJ c11nj = this.LL;
        if (c11nj != null) {
            c11nj.LIZ(interfaceC420801kMLJJLJLI);
        }
        C1767960w6k c1767960w6k = C1767960w6k.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1767960w6k.getClass();
        C1767960w6k.LIZIZ = jCurrentTimeMillis;
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onRestoreInstanceState(Bundle bundle) {
        String string;
        super.onRestoreInstanceState(bundle);
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        HashMap map = new HashMap();
        if (bundle == null || (string = bundle.getString("previousTag")) == null) {
            string = "";
        }
        map.put("previous_tag", string);
        C1008603wy.LIZ(map, new Pair("mall_extra_info", LLILZ));
        map.put("is_from_router", Integer.valueOf(C123100dR.LIZ(LLILZ) ? 1 : 0));
        c1767950w6j.getClass();
        C1767950w6j.LJIJ("main_activity_restore_instance", map);
    }
}
