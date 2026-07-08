package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C485430J1x;
import X.C661350Pwr;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724760Sbq;
import X.ViewOnLongClickListenerC2325301G0i;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoModeRelatedSearchUiAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoModeRelatedSearchUiAssem.class, "vmAssem", "getVmAssem()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/rs/core/model/SearchRelatedSuggestionVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PhotoModeRelatedSearchUiAssem() {
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        InterfaceC724760Sbq interfaceC724760Sbq = (iPostModeService == null || !iPostModeService.LJJ()) ? C01D1.LIZ : C485430J1x.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchRelatedSuggestionVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760Sbq, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 892), AFwS283S0000000_35.get$arr$(80), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.1Dhr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QQO) obj).LL);
            }
        }, null, new AwS649S0100000_35(this, 19), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.1Dht
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QQO) obj).LLILLJJLI);
            }
        }, null, new AwS624S0100000_10(this, 102), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.1Dhv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QQO) obj).LLILLL);
            }
        }, null, new AwS624S0100000_10(this, 103), 6);
    }

    public final SearchRelatedSuggestionVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (SearchRelatedSuggestionVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Jo(Go().getState().LL, Go());
        boolean z = Go().getState().LLILLJJLI;
        if (so()) {
            if (z) {
                C661350Pwr.LIZJ(LJJIJL());
            } else {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
            }
        }
    }

    public final void Ho(View view, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        Context context = view.getContext();
        if (context != null) {
            if (so()) {
                C786410Ut5.T4(LJJIJL(), 0.2f);
            }
            searchRelatedSuggestionVM.vQ2(context, view);
        }
    }

    public final void Jo(boolean z, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        if (!so()) {
            return;
        }
        if (z) {
            LJJIJL().findViewById(R.id.m37).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(this, searchRelatedSuggestionVM, 0));
            LJJIJL().findViewById(R.id.jwr).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(this, searchRelatedSuggestionVM, 1));
            LJJIJL().findViewById(R.id.jws).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(this, searchRelatedSuggestionVM, 2));
            LJJIJL().findViewById(R.id.m6p).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(this, searchRelatedSuggestionVM, 3));
            return;
        }
        LJJIJL().findViewById(R.id.g21).setLongClickable(false);
        LJJIJL().findViewById(R.id.m6p).setOnLongClickListener(new View.OnLongClickListener() { // from class: X.1Dhx
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return false;
            }
        });
        LJJIJL().findViewById(R.id.m6p).setLongClickable(false);
    }
}
