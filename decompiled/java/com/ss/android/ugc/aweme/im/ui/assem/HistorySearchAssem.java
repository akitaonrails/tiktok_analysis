package com.ss.android.ugc.aweme.im.ui.assem;

import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C1240980iOm;
import X.C1241040iOs;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1241070iOv;
import X.InterfaceC2217461Bqa;
import X.ViewOnFocusChangeListenerC1265950j33;
import Y.ATListenerS452S0100000_19;
import Y.AsS46S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics;
import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class HistorySearchAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final AsS46S0100000_19 LLJILJIL;
    public final ATListenerS452S0100000_19 LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public final ViewOnFocusChangeListenerC1265950j33 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HistorySearchAssem.class, "resultVM", "getResultVM()Lcom/ss/android/ugc/aweme/im/viewmodel/HistorySearchResultVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HistorySearchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HistorySearchResultVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1516), AFwS257S0000000_19.get$arr$(176), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1514));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1515));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1513));
        this.LLJILJIL = new AsS46S0100000_19(this, 4);
        this.LLJILJILJ = new ATListenerS452S0100000_19(this, 0);
        this.LLJJI = new ViewOnFocusChangeListenerC1265950j33(this, 1);
    }

    public final HistorySearchResultVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (HistorySearchResultVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HistorySearchResultVM historySearchResultVMGo = Go();
        ((ArrayList) historySearchResultVMGo.LLILZLL).remove(this.LLJJI);
        ((RecyclerView) this.LLJI.getValue()).removeOnScrollListener(this.LLJILJIL);
    }

    public final void Ho(C1240980iOm c1240980iOm) {
        IIMChatHistorySearchAnalytics iIMChatHistorySearchAnalytics;
        C1241040iOs c1241040iOs;
        String str = c1240980iOm.LLILZ;
        String str2 = c1240980iOm.LLILZIL;
        EnumC1241070iOv enumC1241070iOv = c1240980iOm.LL;
        if (!Intrinsics.LJFF(this.LLJILLL, str2) && (iIMChatHistorySearchAnalytics = (IIMChatHistorySearchAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMChatHistorySearchAnalytics.class, false, false, false, 14, null)) != null && (c1241040iOs = (C1241040iOs) Go().LLILLL.getValue()) != null && str != null && str2 != null) {
            this.LLJILLL = str2;
            iIMChatHistorySearchAnalytics.LIZ("ttsocial_chat_search_result_page_enter", iIMChatHistorySearchAnalytics.LIZLLL(c1241040iOs.LIZ, str, str2, enumC1241070iOv.getValue(), c1241040iOs.LIZJ, c1241040iOs.LIZIZ, c1241040iOs.LIZLLL), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((RecyclerView) this.LLJI.getValue()).addOnScrollListener(this.LLJILJIL);
        HistorySearchResultVM historySearchResultVMGo = Go();
        ((ArrayList) historySearchResultVMGo.LLILZLL).add(this.LLJJI);
        ((View) this.LLJIJIL.getValue()).setOnTouchListener(this.LLJILJILJ);
        TuxTextView tuxTextView = null;
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iOn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1240980iOm) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 50), 6);
        View viewLJJIJL = LJJIJL();
        FrameLayout frameLayout = null;
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null) {
            tuxTextView = (TuxTextView) viewLJJIJL.findViewById(R.id.udk);
        }
        View viewLJJIJL2 = LJJIJL();
        if ((viewLJJIJL2 instanceof ViewGroup) && viewLJJIJL2 != null) {
            frameLayout = (FrameLayout) viewLJJIJL2.findViewById(R.id.uc5);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iOx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1240980iOm) obj).LLILLJJLI;
            }
        }, null, new AwS455S0200000_19(frameLayout, tuxTextView, 4), 6);
    }
}
