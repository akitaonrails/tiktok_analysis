package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C019F;
import X.C1077580e9E;
import X.C127G;
import X.C13LE;
import X.C1584506Ih;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS67S0000000_14;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.report.IChatReportPageViewModelProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import u4.q0;

/* JADX INFO: loaded from: classes15.dex */
public final class ReportTitleBarRightAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public TuxTextView LLJJI;
    public final AssemVMLazy LLJJIII;
    public C127G LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReportTitleBarRightAssem.class, "chatReportPageViewModel", "getChatReportPageViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/report/ChatReportPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReportTitleBarRightAssem() {
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        C019F c019f = C019F.LIZ;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IChatReportPageViewModelProvider.class);
        AwS558S0100000_14 awS558S0100000_14 = (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? null : new AwS558S0100000_14(defaultViewModelProviderFactory, 484);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatReportPageViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 485), AFwS248S0000000_14.get$arr$(125), awS558S0100000_14, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqb;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatReportPageViewModel.class, new AObjectS67S0000000_14(this, 14)}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void hp(boolean z) {
        TuxTextView tuxTextView = null;
        if (z) {
            TuxTextView tuxTextView2 = this.LLJJI;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setTextColorRes(R.attr.a04);
            TuxTextView tuxTextView3 = this.LLJJI;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setEnabled(true);
            return;
        }
        TuxTextView tuxTextView4 = this.LLJJI;
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        tuxTextView4.setTextColorRes(R.attr.a1p);
        TuxTextView tuxTextView5 = this.LLJJI;
        if (tuxTextView5 != null) {
            tuxTextView = tuxTextView5;
        }
        tuxTextView.setEnabled(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.y0g);
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        tuxTextView.setText(2131835749);
        C786410Ut5.h9(tuxTextView, new ACListenerS149S0100000_14(this, 21));
        q0.LJIJ(tuxTextView, new C1077580e9E(0));
        this.LLJJI = tuxTextView;
        View viewFindViewById = view.findViewById(R.id.k2q);
        if (viewFindViewById != null) {
            C1584506Ih.LIZ(viewFindViewById);
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        hp(!((ChatReportPageViewModel) assemVMLazy.getValue()).xQ2().isEmpty());
        C736680Sv4.LJIIIIZZ(this, this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0ZcR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2002907sx) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 16), 6);
    }
}
