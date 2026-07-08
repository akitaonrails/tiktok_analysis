package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem;

import X.AnonymousClass0208;
import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C511370K3r;
import X.C522030Kdd;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes8.dex */
public final class SpacePostCategoryAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public TextView LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public C511370K3r LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpacePostCategoryAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpacePostCategoryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 833), AFwS237S0000000_7.get$arr$(222), null, true);
    }

    public final C511370K3r Go() {
        if (this.LLJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C511370K3r.class, null);
            this.LLJI = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJI;
    }

    public final SubSpaceFeedVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        TextView textView = (TextView) view.findViewById(R.id.zsh);
        this.LLIZLLLIL = textView;
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS142S0100000_7(this, 249));
        }
        selectSubscribe(Ho(), new C2217381BqS() { // from class: X.0Jue
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0Jua
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0Juc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), null, new C522030Kdd(this, 3));
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jtw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS287S0000000_4.get$arr$(25), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jud
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(38), 4);
    }
}
