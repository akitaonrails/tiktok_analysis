package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems;

import X.C019F;
import X.C0QSJ;
import X.C1161920gLG;
import X.C1217390hmj;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1781580wSi;
import X.C1819320xRa;
import X.C1819330xRb;
import X.C1819410xRj;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C497740JfY;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.DialogC1841380y1A;
import X.EnumC952890au7;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.BoardDslMinMigratableVersionSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageTitleBarAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveBoardsPageTitleBarAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public DialogC1841380y1A LLJI;
    public boolean LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public LiveIconView LLJILJILJ;
    public C127G LLJILLL;
    public InterfaceC665370Q7z LLJJ;
    public C0QSJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveBoardsPageTitleBarAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveBoardsPageTitleBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217390hmj(c19719912DlLIZ), new C1819410xRj(), null, true);
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

    public final void Go() {
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            liveIconView.setIconTintAttr(R.attr.ezq);
        }
        LiveIconView liveIconView2 = this.LLJILJILJ;
        if (liveIconView2 != null) {
            liveIconView2.setEnabled(true);
        }
    }

    public final LiveBoardsPageViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (LiveBoardsPageViewModel) assemVMLazy.getValue();
    }

    public final void Jo() {
        Context context = getContext();
        if (context != null) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Bg0(context, Ho().LLILLL, EnumC952890au7.PREVIEW_BOARD_ICON, null, false, false, null, null, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{LiveBoardsPageViewModel.class, new Function0() { // from class: X.0xRd
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
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageTitleBarAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJJI
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJJ
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJJ = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJJI = r1
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
                            throw new UnsupportedOperationException("Method not decompiled: X.C1819350xRd.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILJIL = (ConstraintLayout) view.findViewById(R.id.c7l);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.c7k);
        this.LLJILJILJ = liveIconView;
        if (liveIconView != null) {
            liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.e9y, liveIconView.getContext()));
            int iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
            liveIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        }
        LiveIconView liveIconView2 = this.LLJILJILJ;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0xRZ
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem = this.LL;
                    Context context = view2.getContext();
                    liveBoardsPageTitleBarAssem.getClass();
                    if (C1152620g6G.LIZJ() < BoardDslMinMigratableVersionSetting.INSTANCE.getValue()) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851348));
                        return;
                    }
                    if (((C1781580wSi) liveBoardsPageTitleBarAssem.LLJ.getValue()).LLILLJJLI && MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                        if (((C1781580wSi) liveBoardsPageTitleBarAssem.LLJ.getValue()).LLILZIL) {
                            Context context2 = liveBoardsPageTitleBarAssem.getContext();
                            if (context2 == null) {
                                return;
                            }
                            DialogC1841380y1A dialogC1841380y1A = liveBoardsPageTitleBarAssem.LLJI;
                            if (dialogC1841380y1A != null && dialogC1841380y1A.isShowing()) {
                                return;
                            }
                            DialogC1841380y1A dialogC1841380y1A2 = new DialogC1841380y1A(context2, liveBoardsPageTitleBarAssem.LLJIJIL, ((C1815950xM9) liveBoardsPageTitleBarAssem.Ho().getState()).LLIZ, new C1819300xRY(liveBoardsPageTitleBarAssem, context));
                            dialogC1841380y1A2.show();
                            C785410UrT.LIZIZ(dialogC1841380y1A2);
                            PopupMonitorServiceImpl.LIZ.getClass();
                            PopupMonitorServiceImpl.LJJJ(dialogC1841380y1A2);
                            C816490W1f.LIZ(dialogC1841380y1A2);
                            dialogC1841380y1A2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0xRi
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    liveBoardsPageTitleBarAssem.LLJI = null;
                                }
                            });
                            liveBoardsPageTitleBarAssem.LLJI = dialogC1841380y1A2;
                            return;
                        }
                        liveBoardsPageTitleBarAssem.Jo();
                        liveBoardsPageTitleBarAssem.Ho().setState(new C1816110xMP());
                        return;
                    }
                    liveBoardsPageTitleBarAssem.Ho().xQ2(context);
                }
            });
        }
        LiveIconView liveIconView3 = this.LLJILJILJ;
        if (liveIconView3 != null) {
            C427690Gpr.LJI(liveIconView3, null);
        }
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezk, getContext());
        ConstraintLayout constraintLayout = this.LLJILJIL;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(iLIZIZ2);
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0xRg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1815950xM9) obj).LLILLJJLI);
            }
        }, null, new C1819320xRa(this), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0xRf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1815950xM9) obj).LL;
            }
        }, null, new C1819330xRb(this, view), 6);
    }
}
