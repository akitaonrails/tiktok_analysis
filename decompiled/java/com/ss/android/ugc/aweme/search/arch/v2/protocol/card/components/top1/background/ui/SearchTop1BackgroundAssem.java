package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui;

import X.C019F;
import X.C01GW;
import X.C07GU;
import X.C0P8Q;
import X.C0PC5;
import X.C0PC6;
import X.C0PPU;
import X.C0QLM;
import X.C0QOE;
import X.C0R4F;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C416190GTp;
import X.C452501pT;
import X.C487280J9a;
import X.C623520Ocw;
import X.C623530Ocx;
import X.C642030PGf;
import X.C661360Pws;
import X.C679340Qkm;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import Y.AObserverS175S0200000_10;
import Y.AObserverS214S0100000_10;
import Y.AsS37S0100000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig;
import com.ss.android.ugc.aweme.search.SearchSkinAbility;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.viewmodel.SearchTop1BgViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTop1BackgroundAssem extends UIContentAssem implements ISearchBackgroundAbility {
    public static final C623530Ocx LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0PC5.class, null), checkSupervisorPrepared());
    public C0R4F LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public SearchBackgroundConfig LLJJ;
    public Drawable LLJJI;
    public C661360Pws LLJJIII;
    public C416190GTp LLJJIJI;
    public C661360Pws LLJJIJIIJIL;
    public C416190GTp LLJJIJIL;
    public C661360Pws LLJJJ;
    public C416190GTp LLJJJIL;
    public C661360Pws LLJJJJ;
    public C416190GTp LLJJJJJIL;
    public int LLJJJJLIIL;
    public View LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C642030PGf LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public long LLJLLIL;
    public final long LLJLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ocx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchTop1BackgroundAssem.class, "backgroundVm", "getBackgroundVm()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/top1/background/viewmodel/SearchTop1BgViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZ = new Object() { // from class: X.0Ocx
        };
    }

    public SearchTop1BackgroundAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchTop1BgViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 258), AFwS241S0000000_10.get$arr$(167), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 260));
        this.LLJILJIL = true;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 257));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 256));
        this.LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 259));
        this.LLJLLL = System.currentTimeMillis();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final SearchTop1BgViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (SearchTop1BgViewModel) assemVMLazy.getValue();
    }

    public final C0PC6 Jo() {
        Function0<Integer> function0;
        View view = this.LLJJL;
        int i = this.LLJILJILJ;
        int i2 = this.LLJILLL;
        C0PC5 c0pc5Lo = Lo();
        return new C0PC6(view, i2, i, (c0pc5Lo == null || (function0 = c0pc5Lo.LLILLL) == null) ? 0 : function0.invoke().intValue());
    }

    public final C0PC5 Lo() {
        return (C0PC5) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    public final void f2() {
        C661360Pws c661360Pws = this.LLJJIII;
        if (c661360Pws != null) {
            c661360Pws.LIZLLL();
        }
        C661360Pws c661360Pws2 = this.LLJJIJIIJIL;
        if (c661360Pws2 != null) {
            c661360Pws2.LIZLLL();
        }
        C661360Pws c661360Pws3 = this.LLJJJ;
        if (c661360Pws3 != null) {
            c661360Pws3.LIZLLL();
        }
        C661360Pws c661360Pws4 = this.LLJJJJ;
        if (c661360Pws4 != null) {
            c661360Pws4.LIZLLL();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C642030PGf c642030PGf = this.LLJL;
        if (c642030PGf != null) {
            C487280J9a.LIZJ(c642030PGf);
        }
        this.LLJL = null;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ISearchBackgroundAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    public final void qy2() {
        View view;
        Integer numLIZJ;
        Integer numLIZJ2;
        View view2 = this.LLJJL;
        int iIntValue = 0;
        if ((!(view2 != null && view2.getId() == R.id.tr2) || !C07GU.LIZ()) && (view = this.LLJJL) != null) {
            view.setBackground(null);
        }
        this.LLJJI = null;
        View view3 = (View) this.LLJLIL.getValue();
        if (view3 != null) {
            view3.setBackground(null);
        }
        View view4 = (View) this.LLJLILLLLZIIL.getValue();
        if (view4 != null) {
            Context context = getContext();
            view4.setBackground(new ColorDrawable((context == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, context)) == null) ? 0 : numLIZJ2.intValue()));
        }
        SearchComponentCenter.TopBarComponent.ISearchTopBarAbility iSearchTopBarAbility = (SearchComponentCenter.TopBarComponent.ISearchTopBarAbility) this.LLJLL.getValue();
        if (iSearchTopBarAbility != null) {
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            iSearchTopBarAbility.eD(new ColorDrawable(iIntValue));
        }
        this.LLJJ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ISearchBackgroundAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    public final C0R4F fQ() {
        return this.LLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(int r28) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem.Go(int):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    public final void Np2(boolean z) {
        boolean z2;
        boolean z3;
        View view;
        Function0<Boolean> function0;
        Function0<Boolean> function02;
        C0PC5 c0pc5Lo = Lo();
        if (c0pc5Lo != null && (function02 = c0pc5Lo.LLILLJJLI) != null && function02.invoke().booleanValue() && z && this.LLJILJIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOrHideBackground, realShow = ");
        sbLIZ.append(z2);
        sbLIZ.append(", show = ");
        sbLIZ.append(z);
        sbLIZ.append(", showBackgroundControl = ");
        C0PC5 c0pc5Lo2 = Lo();
        if (c0pc5Lo2 != null && (function0 = c0pc5Lo2.LLILLJJLI) != null && function0.invoke().booleanValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C07GU.LIZ()) {
            if (z2) {
                Drawable drawable = null;
                SearchSkinAbility searchSkinAbility = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchSkinAbility.class, null);
                if (searchSkinAbility != null) {
                    C0QOE c0qoe = C0QOE.GENERAL;
                    Drawable drawable2 = this.LLJJI;
                    if (drawable2 != null && (view = this.LLJJL) != null && view.getId() == R.id.tr2) {
                        drawable = drawable2;
                    }
                    searchSkinAbility.Z01(c0qoe, new C0QLM(null, null, null, null, null, new C0P8Q(drawable), 31));
                    return;
                }
                return;
            }
            Oo(false);
            return;
        }
        Oo(z2);
    }

    public final void Oo(boolean z) {
        C661360Pws c661360Pws = this.LLJJIII;
        if (c661360Pws != null) {
            c661360Pws.LJII(z);
        }
        C416190GTp c416190GTp = this.LLJJIJI;
        if (c416190GTp != null) {
            c416190GTp.LJII = z;
            c416190GTp.invalidateSelf();
        }
        C661360Pws c661360Pws2 = this.LLJJIJIIJIL;
        if (c661360Pws2 != null) {
            c661360Pws2.LJII(z);
        }
        C416190GTp c416190GTp2 = this.LLJJIJIL;
        if (c416190GTp2 != null) {
            c416190GTp2.LJII = z;
            c416190GTp2.invalidateSelf();
        }
        C661360Pws c661360Pws3 = this.LLJJJ;
        if (c661360Pws3 != null) {
            c661360Pws3.LJII(z);
        }
        C416190GTp c416190GTp3 = this.LLJJJIL;
        if (c416190GTp3 != null) {
            c416190GTp3.LJII = z;
            c416190GTp3.invalidateSelf();
        }
        C661360Pws c661360Pws4 = this.LLJJJJ;
        if (c661360Pws4 != null) {
            c661360Pws4.LJII(z);
        }
        C416190GTp c416190GTp4 = this.LLJJJJJIL;
        if (c416190GTp4 != null) {
            c416190GTp4.LJII = z;
            c416190GTp4.invalidateSelf();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    public final void no1(boolean z) {
        Oo(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0J9f, X.0PGf] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6) {
        /*
            r5 = this;
            super.onViewCreated(r6)
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0PGg r1 = new X.0PGg
            r3 = 0
            r1.<init>(r5, r3)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r2, r3, r1, r0)
            X.0PC5 r0 = r5.Lo()
            if (r0 == 0) goto L83
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig> r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L83
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig r0 = (com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig) r0
            if (r0 == 0) goto L83
            java.lang.Integer r2 = r0.displayPosition
            com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig$DisplayPosition r0 = com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig.DisplayPosition.FROM_SEARCH_BOX
            int r1 = r0.getValue()
            if (r2 == 0) goto L83
            int r0 = r2.intValue()
            if (r0 != r1) goto L83
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            if (r0 == 0) goto L48
            X.19EG r1 = r0.getActivity()
            if (r1 == 0) goto L48
            r0 = 2131373638(0x7f0a2e46, float:1.8367373E38)
            android.view.View r3 = r1.findViewById(r0)
        L48:
            r5.LLJJL = r3
            X.0PGf r0 = r5.LLJL
            if (r0 != 0) goto L82
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L82
            X.19EG r2 = X.C1388190mED.LIZIZ(r0)
            if (r2 == 0) goto L82
            int r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 >= 0) goto L74
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L82
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L82
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L82
            int r0 = r0.screenWidthDp
            r5.LLJJLIIIJLLLLLLLZ = r0
        L74:
            X.0PGf r1 = new X.0PGf
            r1.<init>()
            int r0 = r2.hashCode()
            X.C487280J9a.LIZ(r0, r1)
            r5.LLJL = r1
        L82:
            return
        L83:
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            if (r0 == 0) goto L48
            X.19EG r1 = r0.getActivity()
            if (r1 == 0) goto L48
            r0 = 2131389000(0x7f0a6a48, float:1.839853E38)
            android.view.View r3 = r1.findViewById(r0)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    public final void Lx(C0PPU c0ppu, Fragment fragment) {
        c0ppu.addOnScrollListener(new AsS37S0100000_10(this, 2));
        if (this.LLJ == null) {
            this.LLJ = new C0R4F(this, c0ppu, 2);
        }
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            SearchStartViewModel searchStartViewModel = (SearchStartViewModel) C679340Qkm.LIZIZ(fragment, activity).get(SearchStartViewModel.class);
            SAFHelper.LIZ.getClass();
            LifecycleOwner lifecycleOwnerLJJIIZ = SAFHelper.LJJIIZ(fragment, activity);
            searchStartViewModel.yQ2().observe(lifecycleOwnerLJJIIZ, new AObserverS214S0100000_10(this, 126));
            searchStartViewModel.xQ2().observe(lifecycleOwnerLJJIIZ, new AObserverS175S0200000_10(this, searchStartViewModel, 9));
        }
        C623520Ocw c623520Ocw = C623520Ocw.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLLL;
        c623520Ocw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("search_top1_bg_init_duration", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No(android.graphics.Bitmap r24, androidx.fragment.app.Fragment r25) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem.No(android.graphics.Bitmap, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.ISearchBackgroundAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SE1(androidx.fragment.app.Fragment r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem.SE1(androidx.fragment.app.Fragment, boolean):void");
    }
}
