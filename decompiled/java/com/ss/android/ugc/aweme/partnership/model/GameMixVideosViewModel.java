package com.ss.android.ugc.aweme.partnership.model;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C0KBN;
import X.C0T1R;
import X.C11NZ;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C1882020z4i;
import X.C1885250z9v;
import X.C1885310zA1;
import X.C1885320zA2;
import X.C1885680zAc;
import X.C1885690zAd;
import X.C1886290zBb;
import X.C1886320zBe;
import X.C20600815jK;
import X.C207700r5;
import X.C2189821An6;
import X.C326220Cqa;
import X.C470590Icr;
import X.C627660Ojc;
import X.C687540Qy0;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1616070s9l;
import X.InterfaceC1885100z9g;
import X.InterfaceC1885700zAe;
import X.InterfaceC1891350zJl;
import X.InterfaceC614560O8o;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_station.GameDetailVideosRequest;
import webcast.api.game_station.GameDetailVideosResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class GameMixVideosViewModel extends BaseDetailShareVM<C326220Cqa, C207700r5, C1886290zBb> implements InterfaceC1885100z9g {
    public Function1<? super C1885320zA2, Unit> LLILZLL;
    public Function1<? super String, Unit> LLIZ;
    public InterfaceC1885700zAe LLIZLLLIL;
    public C1886290zBb LLJ;
    public Function0<? extends C11NZ<C470590Icr<GameDetailVideosResponse.ResponseData>>> LLJI;
    public IViewPagerComponentAbility LLJILLL;
    public boolean LLILZIL = true;
    public final String LLJIJIL = "";
    public final String LLJILJIL = "";
    public GameDetailVideosRequest LLJILJILJ = new GameDetailVideosRequest();
    public final C1886320zBe LLJJ = new InterfaceC1616070s9l() { // from class: X.0zBe
        @Override // X.InterfaceC1616160s9u
        public final /* synthetic */ void onBeforePageChange() {
        }

        @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // X.InterfaceC1616070s9l
        public final void onPageScrolledEnd(int i, float f, int i2) {
        }

        @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
        public final void onPageSelected(int i) {
        }

        @Override // X.InterfaceC1616070s9l
        public final void onPageSelected(int i, boolean z) {
        }

        @Override // X.InterfaceC1616070s9l
        public final void onPageUnSelected(C0SZ8 c0sz8) {
        }

        @Override // X.InterfaceC1616160s9u
        public final /* synthetic */ void onScrollToItemStart(int i) {
        }

        @Override // X.InterfaceC1616160s9u
        public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
        }

        @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
        public final void onPageScrolled(int i, float f, int i2) {
            String aid;
            Aweme awemeLJIIIIZZ;
            IViewPagerComponentAbility iViewPagerComponentAbility = this.LL.LLJILLL;
            if (iViewPagerComponentAbility == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null || (aid = awemeLJIIIIZZ.getAid()) == null) {
                aid = "";
            }
            Function1<? super String, Unit> function1 = this.LL.LLIZ;
            if (function1 != null) {
                function1.invoke(aid);
            }
        }
    };

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 60;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326220Cqa(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void unInit() {
        BaseListFragmentPanel baseListFragmentPanel;
        I18nPlayerController i18nPlayerController;
        Aweme awemeLLILLIZIL;
        String aid;
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LLJILLL;
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLJJ);
        }
        this.LLJILLL = null;
        InterfaceC614560O8o interfaceC614560O8o = this.LLILLJJLI;
        if ((interfaceC614560O8o instanceof BaseListFragmentPanel) && (baseListFragmentPanel = (BaseListFragmentPanel) interfaceC614560O8o) != null && (i18nPlayerController = baseListFragmentPanel.LLLLIILL) != null && (awemeLLILLIZIL = i18nPlayerController.LLILLIZIL()) != null && (aid = awemeLLILLIZIL.getAid()) != null) {
            float currentPosition = i18nPlayerController.getCurrentPosition() / i18nPlayerController.LLJLIL(null);
            InterfaceC1885700zAe interfaceC1885700zAe = this.LLIZLLLIL;
            if (interfaceC1885700zAe != null) {
                interfaceC1885700zAe.LIZ(new C1885690zAd(i18nPlayerController.getCurrentPosition(), aid, currentPosition));
            }
        }
        super.unInit();
    }

    @Override // X.InterfaceC1885100z9g
    public final AbstractC329610Cw3<?> G12() {
        return getConfig();
    }

    public final List<InterfaceC1891350zJl> BQ2(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C207700r5(aweme, 0L, this.LLJIJIL, this.LLJILJIL));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1885100z9g
    public final void Et1(C1885310zA1 c1885310zA1) {
        this.LLILZLL = c1885310zA1;
    }

    @Override // X.InterfaceC1885100z9g
    public final C687540Qy0 F51(Context context) {
        return new C687540Qy0(context);
    }

    @Override // X.InterfaceC1885100z9g
    public final void Fl1(C1882020z4i c1882020z4i) {
        this.LLJI = c1882020z4i;
    }

    @Override // X.InterfaceC1885100z9g
    public final void Lz1(C1885680zAc c1885680zAc) {
        this.LLIZLLLIL = c1885680zAc;
    }

    @Override // X.InterfaceC1885100z9g
    public final void gZ0(C1885250z9v c1885250z9v) {
        this.LLIZ = c1885250z9v;
    }

    @Override // X.InterfaceC1885100z9g
    public final void nT1(GameDetailVideosRequest gameDetailVideosRequest) {
        this.LLJILJILJ = gameDetailVideosRequest;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207700r5> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 98));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1886290zBb>> interfaceC1364105Vn) {
        GameDetailVideosRequest gameDetailVideosRequest = this.LLJILJILJ;
        gameDetailVideosRequest.pullScore = 0L;
        gameDetailVideosRequest.pullType = 0;
        return CQ2(true, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = ((C207700r5) it2.next()).LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        IViewPagerComponentAbility iViewPagerComponentAbilityLIZLLL;
        Fragment fragment;
        C207700r5 c207700r5 = (C207700r5) interfaceC1891350zJl;
        if (this.LLJILLL == null) {
            InterfaceC1209780haS interfaceC1209780haS = this.LLILLJJLI;
            if (interfaceC1209780haS != null && (fragment = interfaceC1209780haS.getFragment()) != null) {
                iViewPagerComponentAbilityLIZLLL = C0T1R.LIZLLL(fragment);
            } else {
                iViewPagerComponentAbilityLIZLLL = null;
            }
            this.LLJILLL = iViewPagerComponentAbilityLIZLLL;
            runOnUIThread(new AwS607S0100000_28(this, 116));
        }
        return c207700r5.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(boolean r16, X.InterfaceC1364105Vn r17) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel.CQ2(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        this.LLJILJILJ.pullType = 1;
        return CQ2(false, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1885100z9g
    public final void pQ(Fragment fragment, C20600815jK c20600815jK) {
        AQ2(fragment);
        setListState(c20600815jK);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1886290zBb yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C1886290zBb c1886290zBb = this.LLJ;
        if (c1886290zBb == null) {
            return new C1886290zBb();
        }
        return c1886290zBb;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void DQ2(com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel r12, boolean r13, boolean r14, boolean r15, X.C1886330zBf r16, int r17) {
        /*
            r2 = r16
            r0 = r17 & 8
            if (r0 == 0) goto L7
            r2 = 0
        L7:
            r11 = 0
            kotlin.jvm.functions.Function1<? super X.0zA2, kotlin.Unit> r5 = r12.LLILZLL
            if (r5 == 0) goto L5d
            X.0zA2 r6 = new X.0zA2
            if (r2 == 0) goto L5e
            java.util.List<com.bytedance.android.livesdk.game.model.ItemInfo> r1 = r2.LIZIZ
            if (r1 == 0) goto L5e
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r2.LIZ
            if (r0 != 0) goto L1a
            X.13BV r0 = X.C13BV.INSTANCE
        L1a:
            java.util.List r1 = X.C13LP.LLIILII(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r3 = r1.iterator()
        L2f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r3.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            X.0zA9 r2 = new X.0zA9
            java.lang.Object r1 = r0.getFirst()
            com.bytedance.android.livesdk.game.model.ItemInfo r1 = (com.bytedance.android.livesdk.game.model.ItemInfo) r1
            java.lang.Object r0 = r0.getSecond()
            r2.<init>(r1, r0)
            r4.add(r2)
            goto L2f
        L4e:
            java.util.List r8 = X.C13LP.LLIIII(r4)
            if (r8 == 0) goto L5e
        L54:
            r10 = r15
            r9 = r14
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r5.invoke(r6)
        L5d:
            return
        L5e:
            X.13BV r8 = X.C13BV.INSTANCE
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel.DQ2(com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel, boolean, boolean, boolean, X.0zBf, int):void");
    }
}
