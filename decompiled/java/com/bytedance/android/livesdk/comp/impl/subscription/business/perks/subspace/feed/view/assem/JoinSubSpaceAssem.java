package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C019J;
import X.C019K;
import X.C055S;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C506250JtH;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.JoinSubSpaceAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinSubSpaceAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(JoinSubSpaceAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public JoinSubSpaceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055S(c19719912DlLIZ), new C506250JtH(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hpf;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JtL
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
            }
        }, view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JtO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILZIL;
            }
        }, null, new C019J(view), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0Jtf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLIZ;
            }
        }, null, new C019K(view), 6);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jt6
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                String str;
                if (view2 != null) {
                    AssemVMLazy assemVMLazy2 = this.LLILZ.LLJJI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = JoinSubSpaceAssem.LLJJIII;
                    final SubSpaceFeedVM subSpaceFeedVM = (SubSpaceFeedVM) assemVMLazy2.getValue();
                    final C506310JtN c506310JtN = new C506310JtN();
                    final C506170Jt9 c506170Jt9 = new C506170Jt9(this.LLILZ);
                    C504510JqT c504510JqTVQ2 = subSpaceFeedVM.vQ2();
                    if (c504510JqTVQ2 != null && (str = c504510JqTVQ2.LLILZ) != null) {
                        C480460Ism.LIZ().getClass();
                        C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).joinSpace(str), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/join", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceFeedVM));
                        if (c0j1n != null) {
                            c0j1n.LIZ(new C09JN() { // from class: X.0Jt5
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    HomePageInfo homePageInfo;
                                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.joinSpace$1");
                                    c506310JtN.invoke();
                                    subSpaceFeedVM.setState(new C506190JtB());
                                    C504450JqN c504450JqNWQ2 = subSpaceFeedVM.wQ2();
                                    C504510JqT c504510JqTVQ22 = subSpaceFeedVM.vQ2();
                                    if (c504510JqTVQ22 != null) {
                                        homePageInfo = c504510JqTVQ22.LLILZLL;
                                    } else {
                                        homePageInfo = null;
                                    }
                                    c504450JqNWQ2.LIZLLL("join_space", homePageInfo, subSpaceFeedVM.zQ2());
                                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.joinSpace$1");
                                }
                            }, new C09JN() { // from class: X.07y1
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.joinSpace$2");
                                    c506170Jt9.invoke(obj);
                                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.joinSpace$2");
                                }
                            });
                        }
                    }
                }
            }
        }, view.findViewById(R.id.crf));
        view.findViewById(R.id.m0e).setOnTouchListener(new View.OnTouchListener() { // from class: X.0JtD
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C766270U4b.LIZLLL(2131844332);
                return true;
            }
        });
    }
}
