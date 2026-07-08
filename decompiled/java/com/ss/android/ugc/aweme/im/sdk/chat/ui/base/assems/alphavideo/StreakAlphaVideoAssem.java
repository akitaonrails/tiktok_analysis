package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo;

import X.C019F;
import X.C06GX;
import X.C06QW;
import X.C0QSJ;
import X.C127G;
import X.C1294120jmU;
import X.C13LE;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1628206Zc;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC1629006Zk;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS378S0100000_2;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.assem.ChatRoomAlphaVideoCommonVM;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.streak.StreakAnimFeature;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakAlphaVideoAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final C1628206Zc LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C1559260qg8 LLJIJIL;
    public C1294120jmU LLJILJIL;
    public FrameLayout LLJILJILJ;
    public InterfaceC1629006Zk LLJILLL;
    public Function1<? super Boolean, Unit> LLJJ;
    public C127G LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StreakAlphaVideoAssem.class, "streakVm", "getStreakVm()Lcom/ss/android/ugc/aweme/im/service/viewmodel/ChatRoomStreakViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(StreakAlphaVideoAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0), new C2217381BqS(StreakAlphaVideoAssem.class, "chatRoomAlphaVideoCommonVM", "getChatRoomAlphaVideoCommonVM()Lcom/ss/android/ugc/aweme/im/lightinteract/api/assem/ChatRoomAlphaVideoCommonVM;", 0)};
        LLJJIJIIJIL = new C1628206Zc();
    }

    public StreakAlphaVideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomStreakViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 414), AFwS229S0000000_2.get$arr$(278), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 415), AFwS229S0000000_2.get$arr$(279), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatRoomAlphaVideoCommonVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 416), AFwS229S0000000_2.get$arr$(280), null, true);
        this.LLJIJIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final void Go() {
        try {
            C1294120jmU c1294120jmU = this.LLJILJIL;
            if (c1294120jmU != null) {
                C1584506Ih.LIZ(c1294120jmU);
                c1294120jmU.LIZLLL();
            }
            FrameLayout frameLayout = this.LLJILJILJ;
            if (frameLayout != null) {
                C1584506Ih.LIZ(frameLayout);
            }
            InterfaceC1629006Zk interfaceC1629006Zk = this.LLJILLL;
            if (interfaceC1629006Zk != null) {
                interfaceC1629006Zk.LJLJJLL();
            }
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            ((ChatRoomAlphaVideoCommonVM) assemVMLazy.getValue()).bc(false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatRoomStreakViewModel.class, new AObjectS378S0100000_2(this, 22)}, defaultViewModelProviderFactory);
                    this.LLJJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Go();
        C1294120jmU c1294120jmU = this.LLJILJIL;
        if (c1294120jmU != null) {
            c1294120jmU.LIZIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C06GX.LIZ()) {
            C06QW c06qw = StreakAnimFeature.LIZ;
            c06qw.getClass();
            if (C06QW.LIZJ.getValue(c06qw, C06QW.LIZIZ[0]) != null) {
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
                C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Ze
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C06PY) obj).LL;
                    }
                }, null, new AwS438S0200000_2(view, this, 8), 6);
                C736680Sv4.LJIIIIZZ(this, this.LLJI.getValue(), new C2217381BqS() { // from class: X.06Zh
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1603006Pk) obj).LL);
                    }
                }, null, new AwS616S0100000_2(this, 41), 6);
            }
        }
    }
}
