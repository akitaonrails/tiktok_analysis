package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DSB;
import X.C1163410gNf;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1840790y0D;
import X.C1854150yLl;
import X.C1854470yMH;
import X.C1857750yRZ;
import X.C1864540ycW;
import X.C19719912Dl;
import X.C20600815jK;
import X.C21673919s1;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2247871CyX;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C814420VxA;
import X.EnumC1854500yMK;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS38S0101000_27;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.actionbarsug.TakoActionBarSugItemCell;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class ImageShortcutsAssem extends UISlotAssem implements IImageShortcutsAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 686));
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public Balloon LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImageShortcutsAssem.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ImageShortcutsAssem.class, "skillLabelViewModel", "getSkillLabelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/skilllabel/TakoInputSkillLabelViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ImageShortcutsAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(194));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2303), AFwS269S0000000_27.get$arr$(196), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(195));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoInputSkillLabelViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2304), AFwS269S0000000_27.get$arr$(197), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpb;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 68085687) {
            return null;
        }
        return this;
    }

    public final BottomInputViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.IImageShortcutsAbility
    public final void Yd0(boolean z) {
        int size;
        C1854150yLl c1854150yLl = hp().getState().LLILLJJLI;
        boolean z2 = true;
        if (c1854150yLl != null && c1854150yLl.LL == 2) {
            List<C1854470yMH> list = hp().getState().LLJIJIL;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (!z || size <= 0) {
                z2 = false;
            }
            xp2(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.IImageShortcutsAbility
    public final void en(List<C1854470yMH> list) {
        boolean z;
        boolean z2;
        boolean z3;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        hp().setState(new AwS606S0100000_27(list, (List<TakoActiveBotItem>) 343));
        if (hp().vQ2() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!((ArrayList) list).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state2.LJIILL(list, null);
            }
            z3 = true;
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state.LJFF(null);
            }
            z3 = false;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C1854470yMH) it2.next()).LLJILJIL == EnumC1854500yMK.AUTO_SEND_PROMPT) {
                    break;
                }
            } else {
                z = z3;
                break;
            }
        }
        xp2(z);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LinearLayoutManager linearLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.a1y);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C1163410gNf.LIZ.getClass();
            if (C1163410gNf.LIZJ()) {
                ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    C426750GoL.LJIIJ(marginLayoutParams, viewOnAttachStateChangeListenerC20604515jv.getContext(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, 0, 32);
                }
            }
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            if (C1163410gNf.LIZJ()) {
                final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
                linearLayoutManager = new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.ImageShortcutsAssem$onViewCreated$1$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollHorizontally() {
                        return false;
                    }

                    @Override // androidx.recyclerview.widget.LinearLayoutManager
                    public final void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
                        iArr[1] = 9999;
                    }
                };
            } else {
                linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false);
            }
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoActionBarSugItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864540ycW(0));
            C1857750yRZ.LJIIJ(0, viewOnAttachStateChangeListenerC20604515jv);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJJIJIIJIL = viewOnAttachStateChangeListenerC20604515jv;
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0yN3
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1854530yMN) obj).LLILLJJLI = (TakoStandardRatio) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 39), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217371BqR() { // from class: X.0yN4
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LLILLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1854530yMN) obj).LLILLL = (ConvertStyleItem) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 40), 4);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJI.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.aC2(new AwS606S0100000_27(this, 196));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.IImageShortcutsAbility
    public final void xp2(boolean z) {
        if (z) {
            C0DSB.LIZJ(LJJIJL());
        } else {
            C0DSB.LIZIZ(LJJIJL());
        }
    }

    public final void ip(C1854470yMH c1854470yMH, C1854470yMH c1854470yMH2) {
        int iIndexOf;
        List<C1854470yMH> list = hp().getState().LLJIJIL;
        if (list != null && (iIndexOf = list.indexOf(c1854470yMH)) >= 0) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                if (state != null) {
                    state.LJIILJJIL(iIndexOf, c1854470yMH2);
                }
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS38S0101000_27(iIndexOf, viewOnAttachStateChangeListenerC20604515jv, 1));
            }
            hp().setState(new AwS393S0200000_27(c1854470yMH, c1854470yMH2, 78));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.IImageShortcutsAbility
    public final void Gr(List list, TakoStandardRatio takoStandardRatio, int i, AwS606S0100000_27 awS606S0100000_27, AwS571S0100000_27 awS571S0100000_27) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jv.findViewHolderForAdapterPosition(i)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
            C1840790y0D c1840790y0D = new C1840790y0D(context);
            c1840790y0D.LIZ(list, takoStandardRatio);
            c1840790y0D.setOnRatioSelected(new AwS393S0200000_27(awS606S0100000_27, this, 145));
            Balloon balloonLIZ = C2247871CyX.LIZ(C2247871CyX.LIZ, context, c1840790y0D, true, R.attr.uk, null, true, new AwS428S0200000_27(awS571S0100000_27, this, 98), null, null, 6556);
            this.LLJJIJIL = balloonLIZ;
            balloonLIZ.LJIILIIL(0, 0, view);
        }
    }
}
