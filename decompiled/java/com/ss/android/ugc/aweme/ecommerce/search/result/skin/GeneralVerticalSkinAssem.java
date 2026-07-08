package com.ss.android.ugc.aweme.ecommerce.search.result.skin;

import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C0Q4X;
import X.C0Q7B;
import X.C0QMP;
import X.C0QOD;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1ER1;
import X.C2217381BqS;
import X.C286180BJo;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC1331910klR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.SearchSkinAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility;
import com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class GeneralVerticalSkinAssem extends UIContentAssem implements ISearchSkinBgAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0Q4X.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public SmartImageView LLJI;
    public SmartImageView LLJIJIL;
    public final C01GW LLJILJIL;
    public Function0<Integer> LLJILJILJ;
    public Function0<Unit> LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GeneralVerticalSkinAssem.class, "skinBgVM", "getSkinBgVM()Lcom/ss/android/ugc/aweme/ecommerce/search/result/skin/GeneralVerticalSkinViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GeneralVerticalSkinAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GeneralVerticalSkinViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 109), AFwS241S0000000_10.get$arr$(64), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 108));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    public final boolean nM1() {
        View viewGu;
        try {
            SmartImageView smartImageViewOo = Oo();
            if (smartImageViewOo == null || smartImageViewOo.getVisibility() != 0) {
                SwitchThemeAbility switchThemeAbility = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
                if (switchThemeAbility == null || (viewGu = switchThemeAbility.Gu()) == null || viewGu.getVisibility() != 0) {
                    IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                    C0Q4X c0q4xLo = Lo();
                    if (iEcomSearchService.LJLI(c0q4xLo != null ? c0q4xLo.LLILLJJLI : null, false) == null) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    public final C0Q4X Lo() {
        return (C0Q4X) this.LLIZLLLIL.getValue();
    }

    public final SmartImageView No() {
        View view;
        View view2;
        SmartImageView smartImageView;
        SmartImageView smartImageView2 = this.LLJIJIL;
        if (smartImageView2 != null) {
            return smartImageView2;
        }
        C0Q4X c0q4xLo = Lo();
        if (c0q4xLo != null && (view2 = c0q4xLo.LLILZIL) != null && (smartImageView = (SmartImageView) view2.findViewById(R.id.sb8)) != null) {
            return smartImageView;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (view = fragmentLJI.getView()) == null) {
            return null;
        }
        return (SmartImageView) view.findViewById(R.id.sb8);
    }

    public final SmartImageView Oo() {
        View view;
        View view2;
        SmartImageView smartImageView;
        SmartImageView smartImageView2 = this.LLJI;
        if (smartImageView2 != null) {
            return smartImageView2;
        }
        C0Q4X c0q4xLo = Lo();
        if (c0q4xLo != null && (view2 = c0q4xLo.LLILZIL) != null && (smartImageView = (SmartImageView) view2.findViewById(R.id.cjl)) != null) {
            return smartImageView;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (view = fragmentLJI.getView()) == null) {
            return null;
        }
        return (SmartImageView) view.findViewById(R.id.cjl);
    }

    public final GeneralVerticalSkinViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (GeneralVerticalSkinViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    public final void IF1() {
        View viewLu;
        View viewGu;
        try {
            Zo();
            C0Q4X c0q4xLo = Lo();
            Unit unit = null;
            if ((c0q4xLo != null ? c0q4xLo.LLILZLL : null) == C0Q7B.NORMAL) {
                SwitchThemeAbility switchThemeAbility = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
                if (switchThemeAbility != null && (viewGu = switchThemeAbility.Gu()) != null) {
                    C786410Ut5.LJLLLLLL(8, viewGu);
                }
                SwitchThemeAbility switchThemeAbility2 = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
                if (switchThemeAbility2 != null && (viewLu = switchThemeAbility2.Lu()) != null) {
                    C786410Ut5.LJLLLLLL(8, viewLu);
                }
            }
            SmartImageView smartImageViewNo = No();
            if (smartImageViewNo != null) {
                C786410Ut5.LLFF(8, smartImageViewNo);
            }
            Function0<Unit> function0 = this.LLJILLL;
            if (function0 != null) {
                function0.invoke();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Zo() {
        View viewLe;
        View viewWu;
        View viewLe2;
        View viewWu2;
        try {
            SwitchThemeAbility switchThemeAbility = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
            if (switchThemeAbility != null && (viewWu2 = switchThemeAbility.Wu()) != null) {
                viewWu2.setBackgroundColor(0);
            }
            SwitchThemeAbility switchThemeAbility2 = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
            if (switchThemeAbility2 != null && (viewLe2 = switchThemeAbility2.Le()) != null) {
                viewLe2.setBackgroundColor(0);
            }
            View view = (View) this.LLJILJIL.getValue();
            if (view != null) {
                view.setBackgroundColor(0);
            }
            SmartImageView smartImageViewOo = Oo();
            if (smartImageViewOo != null) {
                smartImageViewOo.setBackgroundColor(0);
            }
            View view2 = (View) this.LLJILJIL.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            SmartImageView smartImageViewOo2 = Oo();
            if (smartImageViewOo2 != null) {
                C786410Ut5.LLFF(8, smartImageViewOo2);
            }
            SwitchThemeAbility switchThemeAbility3 = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
            if (switchThemeAbility3 != null && (viewWu = switchThemeAbility3.Wu()) != null) {
                C786410Ut5.LJLLLLLL(8, viewWu);
            }
            SwitchThemeAbility switchThemeAbility4 = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
            if (switchThemeAbility4 != null && (viewLe = switchThemeAbility4.Le()) != null) {
                C786410Ut5.LJLLLLLL(8, viewLe);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws Throwable {
        super.onDestroy();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLIZ = C946803n0.LIZ(LJJIJL());
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(fragmentLIZ, c19egLIZ);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJJIJLIJ, ISearchSkinBgAbility.class, null);
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws Throwable {
        super.onParentSet();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(fragmentLJI, c19egLIZ);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, this, ISearchSkinBgAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    public final void U10(boolean z) {
        if (!z) {
            SearchSkinAbility searchSkinAbility = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchSkinAbility.class, null);
            if (searchSkinAbility != null) {
                searchSkinAbility.MJ0(false);
                return;
            }
            return;
        }
        SearchSkinAbility searchSkinAbility2 = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchSkinAbility.class, null);
        if (searchSkinAbility2 == null) {
            return;
        }
        searchSkinAbility2.MJ0(true);
    }

    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    public final void WR0(AwS546S0100000_2 awS546S0100000_2) {
        this.LLJILJILJ = awS546S0100000_2;
    }

    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    public final void fT1(boolean z) {
        SmartImageView smartImageViewNo;
        if (z) {
            if (C286180BJo.LIZ() && (smartImageViewNo = No()) != null) {
                C786410Ut5.LLFF(0, smartImageViewNo);
                return;
            }
            return;
        }
        SmartImageView smartImageViewNo2 = No();
        if (smartImageViewNo2 == null) {
            return;
        }
        C786410Ut5.LLFF(8, smartImageViewNo2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            r11 = this;
            r4 = r11
            super.onViewCreated(r12)
            X.0Q4X r0 = r4.Lo()
            r3 = 0
            if (r0 == 0) goto L83
            X.0Q7B r1 = r0.LLILZLL
        Ld:
            X.0Q7B r0 = X.C0Q7B.SIMPLIFIED
            r2 = 1
            if (r1 != r0) goto L59
            X.0Q4X r0 = r4.Lo()
            if (r0 == 0) goto L57
            X.0QER r0 = r0.LLILLJJLI
        L1a:
            boolean r0 = X.C672250QYl.LIZ(r0, r2)
            if (r0 == 0) goto L59
            X.0Q7z r1 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility> r0 = com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility r0 = (com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility) r0
            if (r0 == 0) goto L59
            int r3 = r0.LLLZL()
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinViewModel r2 = r4.So()
            kotlin.jvm.internal.AwS25S0001000_10 r1 = new kotlin.jvm.internal.AwS25S0001000_10
            r0 = 3
            r1.<init>(r3, r0)
            r2.setState(r1)
        L3f:
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinViewModel r5 = r4.So()
            X.0QV5 r6 = new X.C2217381BqS() { // from class: X.0QV5
                static {
                    /*
                        X.0QV5 r0 = new X.0QV5
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0QV5) X.0QV5.LL X.0QV5
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QV5.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0QV6> r3 = X.C0QV6.class
                        java.lang.String r2 = "getSkin()Lcom/ss/android/ugc/aweme/search/result/Skin;"
                        r1 = 0
                        java.lang.String r0 = "skin"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QV5.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0QV6 r2 = (X.C0QV6) r2
                        X.0QOD r0 = r2.LL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QV5.get(java.lang.Object):java.lang.Object");
                }
            }
            X.0QV4 r7 = new X.C2217381BqS() { // from class: X.0QV4
                static {
                    /*
                        X.0QV4 r0 = new X.0QV4
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0QV4) X.0QV4.LL X.0QV4
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QV4.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0QV6> r3 = X.C0QV6.class
                        java.lang.String r2 = "getHeaderHeight()I"
                        r1 = 0
                        java.lang.String r0 = "headerHeight"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QV4.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0QV6 r2 = (X.C0QV6) r2
                        int r0 = r2.LLILLJJLI
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QV4.get(java.lang.Object):java.lang.Object");
                }
            }
            X.0wBP r8 = X.C736820SvI.LIZLLL()
            kotlin.jvm.internal.AwS659S0100000_10 r9 = new kotlin.jvm.internal.AwS659S0100000_10
            r0 = 1
            r9.<init>(r4, r0)
            r10 = 8
            X.C736680Sv4.LJIIIZ(r4, r5, r6, r7, r8, r9, r10)
            return
        L57:
            r0 = r3
            goto L1a
        L59:
            boolean r0 = r12.isLaidOut()
            if (r0 == 0) goto L75
            r0 = 2
            int[] r0 = new int[r0]
            r12.getLocationOnScreen(r0)
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinViewModel r3 = r4.So()
            r2 = r0[r2]
            kotlin.jvm.internal.AwS25S0001000_10 r1 = new kotlin.jvm.internal.AwS25S0001000_10
            r0 = 3
            r1.<init>(r2, r0)
            r3.setState(r1)
            goto L3f
        L75:
            android.view.ViewTreeObserver r2 = r12.getViewTreeObserver()
            X.0R4F r1 = new X.0R4F
            r0 = 0
            r1.<init>(r12, r4, r0)
            X.C786410Ut5.x3(r2, r1)
            goto L3f
        L83:
            r1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x000f, B:10:0x001e, B:12:0x0024, B:14:0x0032, B:16:0x0038, B:18:0x004c, B:19:0x004f, B:21:0x0059, B:22:0x006e, B:24:0x0075, B:26:0x0083, B:27:0x0086, B:29:0x008c, B:30:0x008f, B:32:0x0093, B:45:0x00ab, B:39:0x00a0, B:41:0x00a4, B:53:0x00bb, B:58:0x00e3, B:55:0x00ca, B:57:0x00de, B:48:0x00b1, B:50:0x00b5, B:47:0x00af, B:36:0x009a, B:38:0x009e), top: B:64:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x000f, B:10:0x001e, B:12:0x0024, B:14:0x0032, B:16:0x0038, B:18:0x004c, B:19:0x004f, B:21:0x0059, B:22:0x006e, B:24:0x0075, B:26:0x0083, B:27:0x0086, B:29:0x008c, B:30:0x008f, B:32:0x0093, B:45:0x00ab, B:39:0x00a0, B:41:0x00a4, B:53:0x00bb, B:58:0x00e3, B:55:0x00ca, B:57:0x00de, B:48:0x00b1, B:50:0x00b5, B:47:0x00af, B:36:0x009a, B:38:0x009e), top: B:64:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8 A[PHI: r4
      0x00b8: PHI (r4v4 com.ss.android.ugc.aweme.search.model.Image) = (r4v3 com.ss.android.ugc.aweme.search.model.Image), (r4v6 com.ss.android.ugc.aweme.search.model.Image) binds: [B:49:0x00b3, B:40:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x000f, B:10:0x001e, B:12:0x0024, B:14:0x0032, B:16:0x0038, B:18:0x004c, B:19:0x004f, B:21:0x0059, B:22:0x006e, B:24:0x0075, B:26:0x0083, B:27:0x0086, B:29:0x008c, B:30:0x008f, B:32:0x0093, B:45:0x00ab, B:39:0x00a0, B:41:0x00a4, B:53:0x00bb, B:58:0x00e3, B:55:0x00ca, B:57:0x00de, B:48:0x00b1, B:50:0x00b5, B:47:0x00af, B:36:0x009a, B:38:0x009e), top: B:64:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UI0(X.C0QLM r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem.UI0(X.0QLM, boolean):void");
    }

    public final void Vo(List<String> list, final Function1<? super Bitmap, Unit> function1) {
        final String str;
        if (list != null && (str = (String) C13LP.LJJJLZIJ(0, list)) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJIL(C724240Sb0.LIZ(this));
            c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL.LJJIIJ(new InterfaceC1331910klR() { // from class: X.08zY
                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                }

                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    String strLIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[loadBgImage] onCompleted: bitmap=");
                    if (bitmap != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(bitmap.getWidth());
                        sbLIZ2.append('x');
                        sbLIZ2.append(bitmap.getHeight());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        strLIZIZ = "null";
                    }
                    sbLIZ.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    function1.invoke(bitmap);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[loadBgImage] onFailed: ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.IF1();
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("error_type", "load_image_failed"), new Pair("url", str));
                    c1507790pL7.getClass();
                    C1507790pL7.LIZJ("rd_ec_search_replace_skin", mapLJIIJ);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165 A[Catch: all -> 0x023a, TRY_LEAVE, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017f A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0186 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:27:0x008e, B:30:0x0095, B:32:0x00a3, B:33:0x00a7, B:35:0x00b5, B:36:0x00b9, B:42:0x00cc, B:46:0x00d9, B:48:0x00e3, B:52:0x00ec, B:54:0x00fb, B:55:0x00fd, B:62:0x0109, B:64:0x010d, B:73:0x0121, B:75:0x0125, B:80:0x012e, B:88:0x013e, B:91:0x0146, B:93:0x0154, B:95:0x0159, B:97:0x015e, B:98:0x0161, B:100:0x0165, B:104:0x016e, B:106:0x0172, B:112:0x017f, B:114:0x0183, B:118:0x018c, B:123:0x019d, B:125:0x01a1, B:127:0x01a9, B:128:0x01af, B:130:0x01bf, B:149:0x0236, B:132:0x01d0, B:135:0x01f4, B:137:0x0200, B:139:0x0206, B:144:0x0218, B:145:0x021b, B:147:0x0229, B:148:0x022c, B:115:0x0186, B:117:0x018a, B:107:0x0175, B:109:0x0179, B:143:0x020d, B:70:0x011a, B:72:0x011e, B:65:0x0110, B:67:0x0114), top: B:154:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013b  */
    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O31(X.C0QLM r16, boolean r17, boolean r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem.O31(X.0QLM, boolean, boolean, kotlin.jvm.functions.Function0):void");
    }

    @Override // com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility
    public final void uj0(C0QOD c0qod, SmartImageView smartImageView, SmartImageView smartImageView2, AwS554S0100000_10 awS554S0100000_10) {
        this.LLJI = smartImageView;
        this.LLJIJIL = smartImageView2;
        this.LLJILLL = awS554S0100000_10;
        So().setState(new AwS589S0100000_10(c0qod, 375));
    }

    public final void Go(Bitmap bitmap, View view, Context context, int i, int i2, Function0<Unit> function0) {
        if (bitmap == null) {
            return;
        }
        int i3 = So().getState().LLILLJJLI;
        int width = ((LJJIJL().getWidth() * i2) / i) - i3;
        if (width <= 0) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        ap(bitmap, view, context, i3, width, function0);
    }

    public final void Jo(Bitmap bitmap, SmartImageView smartImageView, Context context, int i, int i2, View view) {
        int height;
        if (bitmap == null) {
            return;
        }
        int i3 = So().getState().LLILLJJLI;
        if (view != null && view.getHeight() > 0) {
            height = view.getHeight();
        } else {
            height = (int) (41 * context.getResources().getDisplayMetrics().density);
            if (height < 1) {
                height = 1;
            }
        }
        int i4 = i3 + height;
        int width = (((LJJIJL().getWidth() * i2) / i) - i3) - height;
        if (width <= 0) {
            return;
        }
        ap(bitmap, smartImageView, context, i4, width, null);
    }

    public final void ap(Bitmap bitmap, View view, Context context, int i, int i2, Function0<Unit> function0) {
        if (bitmap == null) {
            return;
        }
        C0QMP c0qmpLJJJI = C1ER1.LIZIZ.LJJJI(context, bitmap);
        c0qmpLJJJI.LIZJ(0, Integer.valueOf(LJJIJL().getWidth()));
        c0qmpLJJJI.LIZIZ(i, i2);
        view.setBackground(c0qmpLJJJI.LIZ());
        if (function0 != null) {
            function0.invoke();
        }
    }
}
