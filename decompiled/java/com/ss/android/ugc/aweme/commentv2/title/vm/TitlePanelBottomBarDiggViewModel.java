package com.ss.android.ugc.aweme.commentv2.title.vm;

import X.AbstractC848400XPy;
import X.C0R7N;
import X.C0SYJ;
import X.C0SYK;
import X.C0SYL;
import X.C0SYN;
import X.C0WIY;
import X.C0XQ7;
import X.C1354920lMY;
import X.C1440005kM;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344809Gs;
import X.C723600SZy;
import X.C734550Srd;
import X.C735080SsU;
import X.C737030Svd;
import X.C737370SwB;
import X.C737390SwD;
import X.C740470T2v;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC734510SrZ;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.HashMap;
import kotlin.jvm.internal.AwS0S0010100_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TitlePanelBottomBarDiggViewModel extends AssemViewModel<C0SYL> implements InterfaceC734510SrZ {
    public Aweme LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final C734550Srd LLILZLL;
    public final C1559260qg8 LLIZ;
    public final C1559260qg8 LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0SYL(0);
    }

    public final C0SYJ vQ2() {
        C0SYJ c0syj = (C0SYJ) this.LLIZ.getValue();
        return c0syj == null ? new C0SYJ((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127) : c0syj;
    }

    public TitlePanelBottomBarDiggViewModel() {
        C734550Srd c734550Srd = new C734550Srd();
        this.LLILZLL = c734550Srd;
        this.LLIZ = new C1559260qg8(new C723600SZy(this, C0SYJ.class, null), true);
        this.LLIZLLLIL = new C1559260qg8(new C723600SZy(this, C0R7N.class, null), true);
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = this;
    }

    @Override // X.InterfaceC734510SrZ
    public final void KE(Exception exc) {
        int i;
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C0SYK(this, null), 3);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        T t = this.LLILZLL.LL;
        if (t != 0 && ((C737390SwD) t).LL == 1) {
            i = 2131830649;
        } else {
            i = 2131857729;
        }
        C1354920lMY.LIZLLL(contextLIZ, exc, i);
    }

    public final void LLILLL(Aweme aweme) {
        long diggCount;
        int userDigg;
        AwemeStatistics statistics;
        this.LL = aweme;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        this.LLILLL = diggCount;
        this.LLILZ = diggCount;
        boolean z = false;
        if (aweme != null) {
            userDigg = aweme.getUserDigg();
        } else {
            userDigg = 0;
        }
        this.LLILZIL = userDigg;
        if (aweme != null && aweme.getUserDigg() == 1) {
            z = true;
        }
        setState(new AwS0S0010100_11(xQ2(aweme, z), z, 1));
    }

    @Override // X.InterfaceC734510SrZ
    public final void oP1(C0WIY<String, Integer> c0wiy) {
        Integer num;
        Integer num2;
        String str = null;
        if (c0wiy != null) {
            str = c0wiy.LIZ;
        }
        C737030Svd c737030Svd = new C737030Svd(13, str);
        Bundle bundle = new Bundle();
        if (c0wiy == null || (num = c0wiy.LIZIZ) == null) {
            num = -1;
        }
        bundle.putInt("user_digged", num.intValue());
        c737030Svd.LIZJ = bundle;
        C1440005kM.LIZ(c737030Svd);
        if (c0wiy != null && (num2 = c0wiy.LIZIZ) != null) {
            num2.intValue();
            String str2 = c0wiy.LIZ;
            if (str2 != null) {
                C1440005kM.LIZ(new C0SYN(str2));
            }
        }
    }

    public final long xQ2(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LLILLJJLI = z;
            if (z) {
                if (this.LLILZIL == 1) {
                    if (this.LLILZ < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LLILZ = 1L;
                    }
                    return this.LLILZ;
                }
                return this.LLILZ + 1;
            }
            if (this.LLILZIL == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LLILZ - 1;
            }
            return this.LLILZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDiggView when aweme is null:");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2344809Gs.LIZLLL(6, "TitlePanelBottomBarDiggViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return 0L;
    }

    public final void wQ2(int i, Aweme aweme, String str) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (i != 0) {
                if (i == 1) {
                    C740470T2v.LJ(C740470T2v.LIZ() + 1);
                    aweme.setUserDigg(1);
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        statistics.setDiggCount(this.LLILLL);
                    }
                    C1440005kM.LIZ(new C737030Svd(13, (Object) 0));
                    return;
                }
                return;
            }
            int iLIZ = C740470T2v.LIZ() - 1;
            if (iLIZ < 0) {
                iLIZ = 0;
            }
            C740470T2v.LJ(iLIZ);
            aweme.setUserDigg(0);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                statistics2.setDiggCount(this.LLILLL);
            }
            C1440005kM.LIZ(new C737030Svd(13, (Object) 1));
            return;
        }
        HashMap map = new HashMap();
        map.put("aweme_id", str);
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ("eventType")));
        C735080SsU.LIZJ("eventType", null, map);
        this.LLILZLL.LIZJ(map);
    }
}
