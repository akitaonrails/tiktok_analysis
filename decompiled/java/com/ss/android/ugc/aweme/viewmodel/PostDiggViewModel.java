package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC848400XPy;
import X.C0OAD;
import X.C0R7N;
import X.C0SRH;
import X.C0SYJ;
import X.C0SYN;
import X.C0WIY;
import X.C0XPD;
import X.C0XQ7;
import X.C1354920lMY;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C1559260qg8;
import X.C19EG;
import X.C20096413kA;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C23250099c;
import X.C2344809Gs;
import X.C627150Oin;
import X.C717590SCv;
import X.C720640SOo;
import X.C721240SQw;
import X.C723600SZy;
import X.C729980SkG;
import X.C734550Srd;
import X.C735080SsU;
import X.C735280Sso;
import X.C735370Ssx;
import X.C737030Svd;
import X.C737370SwB;
import X.C737390SwD;
import X.C738960Syk;
import X.C740470T2v;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC734510SrZ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.io.PrintStream;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PostDiggViewModel extends AssemViewModel<C0SRH> implements InterfaceC734510SrZ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public long LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final C717590SCv LLILZIL = new C717590SCv(AFwS198S0000000_11.get$arr$(248));
    public final C734550Srd LLILZLL;
    public final C20096413kA LLIZ;
    public Aweme LLIZLLLIL;
    public int LLJ;
    public final C1559260qg8 LLJI;
    public final C1559260qg8 LLJIJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(PostDiggViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0SRH(null);
    }

    public final Context getContext() {
        C717590SCv c717590SCv = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (Context) c717590SCv.LIZ();
    }

    public PostDiggViewModel() {
        C734550Srd c734550Srd = new C734550Srd();
        this.LLILZLL = c734550Srd;
        this.LLIZ = new C20096413kA();
        this.LLJI = new C1559260qg8(new C723600SZy(this, C0SYJ.class, null), true);
        this.LLJIJIL = new C1559260qg8(new C723600SZy(this, C0R7N.class, null), true);
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = this;
    }

    @Override // X.InterfaceC734510SrZ
    public final void KE(Exception exc) {
        int i;
        Aweme aweme = this.LLIZLLLIL;
        if (getContext() != null && aweme != null) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C721240SQw(this, aweme, null), 3);
        }
        Context context = getContext();
        T t = this.LLILZLL.LL;
        if (t != 0 && ((C737390SwD) t).LL == 1) {
            i = 2131830649;
        } else {
            i = 2131857729;
        }
        C1354920lMY.LIZLLL(context, exc, i);
    }

    @Override // X.InterfaceC734510SrZ
    public final void oP1(C0WIY<String, Integer> c0wiy) {
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C720640SOo.LIZ(this));
        sbLIZ.append(" : OnItemDiggSucess");
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        C737030Svd c737030Svd = new C737030Svd(13, c0wiy.LIZ);
        Bundle bundle = new Bundle();
        Integer num = c0wiy.LIZIZ;
        if (num == null) {
            num = -1;
        }
        bundle.putInt("user_digged", num.intValue());
        c737030Svd.LIZJ = bundle;
        C1440005kM.LIZ(c737030Svd);
        Integer num2 = c0wiy.LIZIZ;
        if (num2 != null) {
            num2.intValue();
            String str = c0wiy.LIZ;
            if (str != null) {
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C720640SOo.LIZ(this));
                sbLIZ2.append(" : OnDiggUpdateEvent");
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                C1440005kM.LIZ(new C0SYN(str));
            }
        }
    }

    public final void yQ2(Function2<? super Boolean, ? super Aweme, Unit> function2) {
        C19EG c19egLIZIZ;
        Aweme aweme = this.LLIZLLLIL;
        if (aweme == null) {
            return;
        }
        Activity activityLIZ = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            Context context = getContext();
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            }
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
            C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
            C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin.LIZ);
            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid), c627150Oin.LIZ);
            C0XPD.LIZIZ(activityLIZ, "enterFrom", "click_like", c627150Oin.LIZ, new C738960Syk(this, function2, 3));
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null) {
            if (C0OAD.LIZIZ(aweme) && aweme.getUserDigg() == 0) {
                String strLIZ = C0OAD.LIZ(2131858174, aweme);
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ(strLIZ);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (AwemeExtKt.isDelete(aweme) && aweme.getUserDigg() == 0) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZIZ);
                c1389890mGx2.LJIIIZ(2131858174);
                c1389890mGx2.LJIIJJI();
                return;
            } else if (AwemeExtKt.isProhibited(aweme)) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(c19egLIZIZ);
                c1389890mGx3.LJIIIZ(2131836471);
                c1389890mGx3.LJIIJJI();
                return;
            } else if (C729980SkG.LJIIIIZZ(aweme)) {
                C735280Sso.LIZ.getClass();
                if (C735280Sso.LJFF(aweme)) {
                    C1389890mGx c1389890mGx4 = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx4.LJIIIZ(2131845231);
                    c1389890mGx4.LJIIJJI();
                    return;
                }
            }
        }
        if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
            return;
        }
        if (!this.LLILLJJLI) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LIZJ(aweme) && C735280Sso.LJ(aweme)) {
                function2.invoke(Boolean.FALSE, null);
                return;
            }
        }
        function2.invoke(Boolean.TRUE, aweme);
    }

    public final long zQ2(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LLILLJJLI = z;
            if (z) {
                if (this.LLILZ == 1) {
                    if (this.LLILLL < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LLILLL = 1L;
                    }
                    return this.LLILLL;
                }
                return this.LLILLL + 1;
            }
            if (this.LLILZ == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LLILLL - 1;
            }
            return this.LLILLL;
        }
        String strLIZ = C720640SOo.LIZ(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDiggView when aweme is null:");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2344809Gs.LIZLLL(6, strLIZ, C2188811AlT.LIZIZ(sbLIZ));
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0SYI vQ2(long r5, com.ss.android.ugc.aweme.feed.model.Aweme r7, boolean r8) {
        /*
            r4 = this;
            r1 = 0
            if (r7 == 0) goto L2a
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
        L8:
            if (r7 == 0) goto L28
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isDelete(r7)
            if (r0 != 0) goto L28
            X.1EE2 r0 = X.C1EE2.LIZIZ
            boolean r0 = r0.showEngagementCount()
            if (r0 == 0) goto L28
            r3 = 1
        L19:
            X.0SSk r0 = X.C721640SSk.LIZ
            r0.getClass()
            java.lang.String r1 = X.C721640SSk.LJ(r7, r1)
            X.0SYI r0 = new X.0SYI
            r0.<init>(r1, r8, r3)
            return r0
        L28:
            r3 = 0
            goto L19
        L2a:
            java.lang.String r2 = X.C720640SOo.LIZ(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateDiggView when aweme is null:"
            r1.append(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 6
            X.C2344809Gs.LIZLLL(r0, r2, r1)
            r5 = 0
        L4d:
            r1 = r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel.vQ2(long, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):X.0SYI");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0332 A[PHI: r1
      0x0332: PHI (r1v39 java.lang.String) = (r1v27 java.lang.String), (r1v40 java.lang.String) binds: [B:140:0x0330, B:138:0x032c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0338 A[PHI: r1
      0x0338: PHI (r1v38 java.lang.String) = (r1v27 java.lang.String), (r1v39 java.lang.String) binds: [B:140:0x0330, B:142:0x0336] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fe A[PHI: r1
      0x03fe: PHI (r1v41 java.lang.String) = (r1v25 java.lang.String), (r1v42 java.lang.String) binds: [B:133:0x0320, B:131:0x031c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(com.ss.android.ugc.aweme.model.PostModeDetailParams r32, java.lang.String r33, X.C830490Whz r34) {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel.wQ2(com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.String, X.0Whz):void");
    }

    public final void xQ2(int i, Aweme aweme, String str) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (i != 0) {
                if (i == 1) {
                    C740470T2v.LJ(C740470T2v.LIZ() + 1);
                    aweme.setUserDigg(1);
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        statistics.setDiggCount(this.LL);
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
                statistics2.setDiggCount(this.LL);
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
