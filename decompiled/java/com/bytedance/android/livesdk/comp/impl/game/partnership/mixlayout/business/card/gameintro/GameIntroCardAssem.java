package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.AbstractC738140SxQ;
import X.C0QSJ;
import X.C1155600gB4;
import X.C127G;
import X.C13LE;
import X.C13LP;
import X.C1558820qfQ;
import X.C1570070qxZ;
import X.C16F5;
import X.C1883060z6O;
import X.C1884770z99;
import X.C1884780z9A;
import X.C1884790z9B;
import X.C1884870z9J;
import X.C19263510Xx;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1881340z3c;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseAssem;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardScope;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class GameIntroCardAssem extends MixCardBaseAssem<GameInfoCardModel, C1884770z99> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public static final int LLLF;
    public final AssemVMLazy LLJJJIL;
    public C16F5 LLJJJJ;
    public C16F5 LLJJJJJIL;
    public C16F5 LLJJJJLIIL;
    public C16F5 LLJJL;
    public ViewPager LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public final String LLJLL;
    public C127G LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameIntroCardAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/game/partnership/mixlayout/business/card/gameintro/GameIntroViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLL = (int) C497740JfY.LIZIZ(11.0f);
        LLLF = (int) C497740JfY.LIZIZ(20.0f);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gn0;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixCardScope.class});
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(MixCardScope.class);
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseAssem
    public final void kp() {
        View view = this.LLJJI;
        this.LLJJLIIIJLLLLLLLZ = view != null ? (ViewPager) view.findViewById(R.id.kwz) : null;
        View view2 = this.LLJJI;
        this.LLJJJJ = view2 != null ? (C16F5) view2.findViewById(R.id.zre) : null;
        View view3 = this.LLJJI;
        this.LLJJJJJIL = view3 != null ? (C16F5) view3.findViewById(R.id.tv_see_more) : null;
        View view4 = this.LLJJI;
        this.LLJJJJLIIL = view4 != null ? (C16F5) view4.findViewById(R.id.zi4) : null;
        View view5 = this.LLJJI;
        this.LLJJL = view5 != null ? (C16F5) view5.findViewById(R.id.zrf) : null;
        InterfaceC1881340z3c interfaceC1881340z3cVQ2 = ip().vQ2();
        if (interfaceC1881340z3cVQ2 == null) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0z9E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1884770z99) obj).LL;
            }
        }, null, new C1884780z9A(this, interfaceC1881340z3cVQ2), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0z9F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1884770z99) obj).LLILLJJLI;
            }
        }, null, new C1884790z9B(this), 6);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseAssem
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final GameIntroViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (GameIntroViewModel) assemVMLazy.getValue();
    }

    public GameIntroCardAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameIntroViewModel.class);
        C1558820qfQ c1558820qfQ = new C1558820qfQ(c19719912DlLIZ);
        C1884870z9J c1884870z9J = new C1884870z9J();
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, c1558820qfQ, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1570070qxZ(this), c1884870z9J, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJJIL = assemVMLazy;
        this.LLJL = C497740JfY.LJIJI(2131851993);
        this.LLJLIL = C497740JfY.LJIJI(2131851995);
        this.LLJLILLLLZIIL = C497740JfY.LJIJI(2131851994);
        this.LLJLL = C497740JfY.LJIJI(2131841781);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GameIntroViewModel.class, new Function0() { // from class: X.0z9I
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
                                com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroCardAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJZ
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJLLL
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJLLL = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardScope> r0 = com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJZ = r1
                                if (r1 != 0) goto L27
                                r1 = 0
                            L21:
                                com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroViewModel r0 = new com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroViewModel
                                r0.<init>(r1)
                                return r0
                            L27:
                                java.lang.Class<X.0z9G> r0 = X.InterfaceC1884840z9G.class
                                java.lang.Object r1 = r1.getAbility(r0)
                                X.0z9G r1 = (X.InterfaceC1884840z9G) r1
                                java.lang.Class<X.0z9G> r0 = X.InterfaceC1884840z9G.class
                                X.C687700QyG.LJ(r1, r0)
                                goto L21
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1884860z9I.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mp() {
        String str;
        C16F5 c16f5;
        GameStationGameInfo gameStationGameInfo;
        if (!op()) {
            C16F5 c16f52 = this.LLJJJJJIL;
            if (c16f52 != null) {
                C500260Jjc.LJIILIIL(c16f52);
                return;
            }
            return;
        }
        C16F5 c16f53 = this.LLJJJJ;
        if (c16f53 != null) {
            c16f53.setMaxLines(3);
        }
        C16F5 c16f54 = this.LLJJJJ;
        if (c16f54 != null) {
            c16f54.setEllipsize(TextUtils.TruncateAt.END);
        }
        C16F5 c16f55 = this.LLJJJJJIL;
        if (c16f55 != null) {
            C500260Jjc.LLFFF(c16f55);
        }
        String strLIZIZ = C19263510Xx.LIZIZ();
        GameInfoCardModel gameInfoCardModel = ((C1884770z99) ip().getState()).LL;
        if (gameInfoCardModel == null || (gameStationGameInfo = gameInfoCardModel.gameInfo) == null || (str = gameStationGameInfo.displayedLanguage) == null) {
            str = "";
        }
        if (!Intrinsics.LJFF(strLIZIZ, str) || (c16f5 = this.LLJJJJLIIL) == null) {
            return;
        }
        C500260Jjc.LJIILIIL(c16f5);
    }

    public final boolean op() {
        C1883060z6O c1883060z6OLJIIJJI;
        Boolean bool;
        InterfaceC1881340z3c interfaceC1881340z3cVQ2 = ip().vQ2();
        return (interfaceC1881340z3cVQ2 == null || (c1883060z6OLJIIJJI = interfaceC1881340z3cVQ2.LJIIJJI()) == null || (bool = c1883060z6OLJIIJJI.LLILZLL) == null || !bool.booleanValue() || TextUtils.equals(((C1155600gB4) ip().LLILLJJLI.getValue()).LLILLL.LIZ.LIZIZ, "about")) ? false : true;
    }

    public final String tp(String str) {
        if (op()) {
            List<String> listLJJJJIZL = a0.LJJJJIZL(a0.LJLIIIL(str).toString());
            ArrayList arrayList = new ArrayList();
            for (String str2 : listLJJJJIZL) {
                if (!a0.LJJJIL(str2)) {
                    arrayList.add(str2);
                }
            }
            return C13LP.LJJLIIIJ(arrayList, "\n", null, null, 0, null, null, 62);
        }
        return str;
    }
}
