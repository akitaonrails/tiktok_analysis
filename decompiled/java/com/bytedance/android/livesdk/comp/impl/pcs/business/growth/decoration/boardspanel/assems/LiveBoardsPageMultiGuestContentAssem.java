package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems;

import X.AbstractC970120bLu;
import X.C019F;
import X.C0QSJ;
import X.C0UX6;
import X.C1161920gLG;
import X.C1217440hmo;
import X.C127G;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1781580wSi;
import X.C1819150xRJ;
import X.C1819160xRK;
import X.C1819180xRM;
import X.C1819220xRQ;
import X.C1819270xRV;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C439101nJ;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC919090a1b;
import X.EnumC937290aUx;
import X.EnumC952890au7;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
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
public final class LiveBoardsPageMultiGuestContentAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public AbstractC970120bLu LLJI;
    public boolean LLJIJIL;
    public C127G LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveBoardsPageMultiGuestContentAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveBoardsPageMultiGuestContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217440hmo(c19719912DlLIZ), new C1819270xRV(), null, true);
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

    public final LiveBoardsPageViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (LiveBoardsPageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        AbstractC970120bLu abstractC970120bLu = this.LLJI;
        if (abstractC970120bLu != null) {
            abstractC970120bLu.LLLIIIIL();
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{LiveBoardsPageViewModel.class, new Function0() { // from class: X.0xRO
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
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageMultiGuestContentAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJILLL
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJILJILJ
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJILJILJ = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJILLL = r1
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
                            throw new UnsupportedOperationException("Method not decompiled: X.C1819200xRO.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC970120bLu abstractC970120bLuYf1;
        super.onViewCreated(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.oo_);
        if (((C1781580wSi) this.LLJ.getValue()).LLILLJJLI && MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            Context context = view.getContext();
            if (context != null) {
                abstractC970120bLuYf1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Yf1(context, Go().LLILLL, EnumC952890au7.PREVIEW_BOARD_ICON, new C1819180xRM(this), new C1819160xRK(this), new C1819220xRQ(recyclerView));
            } else {
                abstractC970120bLuYf1 = null;
            }
            this.LLJI = abstractC970120bLuYf1;
            if (abstractC970120bLuYf1 != null) {
                abstractC970120bLuYf1.LLLIL(recyclerView);
            }
            if (!((C1781580wSi) this.LLJ.getValue()).LLILZIL) {
                C12ES.LJIILL(0, recyclerView);
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BT1(EnumC937290aUx.BOARD, RedDotExtensionKt.LJIILLIIL(C0UX6.MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE), EnumC919090a1b.CLICK, false);
                if (!this.LLJIJIL) {
                    this.LLJIJIL = true;
                    ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).pO();
                }
            } else {
                C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0xRL
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1815950xM9) obj).LLIZ;
                    }
                }, null, new C1819150xRJ(recyclerView, this), 6);
            }
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BT1(EnumC937290aUx.BOARD, RedDotExtensionKt.LJIILLIIL(C0UX6.MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE), EnumC919090a1b.SHOW, false);
            return;
        }
        C439101nJ.LJI(recyclerView);
    }
}
