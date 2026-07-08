package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems;

import X.C019F;
import X.C0QSJ;
import X.C1217450hmp;
import X.C127G;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1781580wSi;
import X.C1819190xRN;
import X.C1819250xRT;
import X.C1819260xRU;
import X.C1819280xRW;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C439101nJ;
import X.C500260Jjc;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveBoardsPageSelectorAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public boolean LLJI;
    public C127G LLJIJIL;
    public InterfaceC665370Q7z LLJILJIL;
    public C0QSJ LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveBoardsPageSelectorAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveBoardsPageSelectorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217450hmp(c19719912DlLIZ), new C1819280xRW(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1781580wSi.class, null), checkSupervisorPrepared());
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardPageScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{LiveBoardsPageViewModel.class, new Function0() { // from class: X.0xRS
                        /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r1
                          0x0027: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0004, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() throws java.lang.IllegalAccessException {
                            /*
                                r5 = this;
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageSelectorAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJILJILJ
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJILJIL
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJILJIL = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJILJILJ = r1
                                if (r1 != 0) goto L27
                                r1 = 0
                            L21:
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel r0 = new com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel
                                r0.<init>(r1)
                                return r0
                            L27:
                                java.lang.Class<X.0xKr> r0 = X.InterfaceC1815150xKr.class
                                java.lang.Object r1 = r1.getAbility(r0)
                                X.0xKr r1 = (X.InterfaceC1815150xKr) r1
                                java.lang.Class<X.0xKr> r0 = X.InterfaceC1815150xKr.class
                                X.C687700QyG.LJ(r1, r0)
                                goto L21
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1819240xRS.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.c7q);
        if (((C1781580wSi) this.LLJ.getValue()).LLILLJJLI && MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable() && ((C1781580wSi) this.LLJ.getValue()).LLILZIL) {
            C12ES.LJIILL(0, viewFindViewById);
            TextView textView = (TextView) view.findViewById(R.id.c7r);
            TextView textView2 = (TextView) view.findViewById(R.id.c7s);
            C500260Jjc.LJLIIIL(500L, textView, new C1819250xRT(this));
            C500260Jjc.LJLIIIL(500L, textView2, new C1819260xRU(this));
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xRR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1815950xM9) obj).LLIZ;
                }
            }, null, new C1819190xRN(this, textView, view, textView2), 6);
            return;
        }
        C439101nJ.LJI(viewFindViewById);
    }

    public static void Go(Context context, TextView textView, boolean z) {
        if (z) {
            textView.setBackgroundResource(R.drawable.dmn);
            textView.setTextColor(C20736316Cj.LIZIZ(R.attr.eyv, context));
        } else {
            textView.setBackgroundResource(R.drawable.dmm);
            textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, context));
        }
    }
}
