package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem;

import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C504490JqR;
import X.C504500JqS;
import X.C504510JqT;
import X.C504540JqW;
import X.C504550JqX;
import X.C504560JqY;
import X.C504700Jqm;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedEmptyAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public C504510JqT LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedEmptyAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C504540JqW(c19719912DlLIZ), new C504700Jqm(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hoi;
    }

    public final C504510JqT hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504510JqT.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceFeedVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    public final void kp(final View view) {
        int iIntValue;
        Integer num;
        if (!ip().xQ2()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            C504510JqT c504510JqTHp = hp();
            if (c504510JqTHp != null && (num = c504510JqTHp.LLIZLLLIL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            layoutParams.topMargin = iIntValue;
            C786410Ut5.W5(view, layoutParams);
            view.requestLayout();
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0JqO
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ArrayList<AbstractC503810JpL> arrayList;
                    Integer numValueOf;
                    ArrayList<AbstractC503810JpL> arrayList2;
                    ArrayList<AbstractC503810JpL> arrayList3;
                    SubSpaceFeedVM subSpaceFeedVMIp = this.ip();
                    int height = view.getHeight();
                    C503760JpG c503760JpG = subSpaceFeedVMIp.LLILZIL;
                    if (c503760JpG != null) {
                        C503260JoS c503260JoS = c503760JpG.LLILLL;
                        if (c503260JoS != null && (arrayList3 = c503260JoS.LL) != null) {
                            Iterator<AbstractC503810JpL> it2 = arrayList3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                AbstractC503810JpL next = it2.next();
                                if (next instanceof C503230JoP) {
                                    if (next == null) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            C503260JoS c503260JoS2 = c503760JpG.LLILLL;
                            if (c503260JoS2 != null && (arrayList2 = c503260JoS2.LL) != null) {
                                arrayList2.add(new C503230JoP(height));
                            }
                            C503260JoS c503260JoS3 = c503760JpG.LLILLL;
                            if (c503260JoS3 != null && (arrayList = c503260JoS3.LL) != null && (numValueOf = Integer.valueOf(arrayList.size())) != null) {
                                numValueOf.intValue();
                                C503260JoS c503260JoS4 = c503760JpG.LLILLL;
                                if (c503260JoS4 != null) {
                                    c503260JoS4.notifyItemInserted(numValueOf.intValue() - 1);
                                }
                            }
                        }
                    }
                    C786410Ut5.C3(view.getViewTreeObserver(), this);
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, view);
        ip().CQ2();
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jqk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new C504560JqY(view, this), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JtW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C504550JqX(view, this), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jtc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new C504500JqS(view, this), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jta
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new C504490JqR(view, this), 4);
    }
}
