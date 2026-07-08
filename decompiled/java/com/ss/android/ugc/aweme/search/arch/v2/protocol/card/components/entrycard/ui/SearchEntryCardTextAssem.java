package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ui;

import X.C07E5;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C683100Qqq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1077300e8m;
import X.ViewTreeObserverOnGlobalLayoutListenerC1077390e8v;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchEntryCardTextAssem extends ReusedUISlotAssem<SearchEntryCardTextAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchEntryCardTextAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/entrycard/viewmodel/SearchEntranceVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchEntryCardTextAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchEntranceVM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 569), AFwS252S0000000_16.get$arr$(336), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev4;
    }

    public final SearchEntranceVM op() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (SearchEntranceVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.niw);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.nj0);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.nie);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ncg);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zf0);
        Context context = view.getContext();
        subscribe(op(), C736820SvI.LIZLLL(), null, new AwS452S0200000_16(linearLayout, tuxTextView, 1));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0d2x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683130Qqt) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS452S0200000_16(context, linearLayout2, 2), 4);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0d2y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683130Qqt) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS452S0200000_16(context, linearLayout3, 3), 4);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0d2z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683130Qqt) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS452S0200000_16(context, linearLayout4, 4), 4);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0d2w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683130Qqt) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(tuxTextView, 36), 4);
        for (LinearLayout linearLayout5 : C1697810uHb.LJIIJJI(linearLayout2, linearLayout3, linearLayout4)) {
            ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v = new ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(linearLayout5, 2);
            if (linearLayout5.isAttachedToWindow()) {
                C786410Ut5.x3(linearLayout5.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077390e8v);
            }
            linearLayout5.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1077300e8m(linearLayout5, viewTreeObserverOnGlobalLayoutListenerC1077390e8v, 0));
        }
    }
}
