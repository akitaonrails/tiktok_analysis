package com.ss.android.ugc.aweme.tako.botpage.actionbar;

import X.AbstractC1863890ybT;
import X.C019F;
import X.C09R3;
import X.C0R2Q;
import X.C13LE;
import X.C13MK;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C21657619pO;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C436680HAk;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC21657319pL;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnScrollChangedListenerC21657119pJ;
import Y.ARunnableS133S0100000_33;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBottomBarAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoDisplayViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public abstract class TakoBottomBarAssem<T extends InterfaceC21657319pL> extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public FrameLayout LLJJI;
    public C436680HAk LLJJIII;
    public LinearLayout LLJJIJI;
    public final List<AbstractC1863890ybT<T>> LLJJIJIIJIL = new ArrayList();
    public T LLJJIJIL;
    public C21657619pO LLJJJ;
    public boolean LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public volatile boolean LLJL;
    public final ViewTreeObserverOnScrollChangedListenerC21657119pJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoBottomBarAssem.class, "speechViewModel", "getSpeechViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoSpeechViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoBottomBarAssem.class, "photoDisplayViewModel", "getPhotoDisplayViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoPhotoDisplayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoBottomBarAssem.class, "fragmentViewModel", "getFragmentViewModel()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.19pJ] */
    public TakoBottomBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSpeechViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ, 3298), AFwS279S0000000_33.get$arr$(235), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoPhotoDisplayViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ2, 3299), AFwS279S0000000_33.get$arr$(236), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ3, 3300), AFwS279S0000000_33.get$arr$(237), null, true);
        this.LLJLIL = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: X.19pJ
            public final /* synthetic */ TakoBottomBarAssem<T> LL;

            {
                this.LL = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                TakoBottomBarAssem<T> takoBottomBarAssem = this.LL;
                C436680HAk c436680HAk = takoBottomBarAssem.LLJJIII;
                if (c436680HAk != null) {
                    HandlerHook.viewPost(c436680HAk, new ARunnableS133S0100000_33(takoBottomBarAssem, 81));
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fk8;
    }

    public final void hp() {
        LinearLayout linearLayout;
        View viewTd;
        ViewTreeObserver viewTreeObserver;
        if (!this.LLJL) {
            this.LLJL = true;
            FrameLayout frameLayout = this.LLJJI;
            if (frameLayout != null && (viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.fjy, null, false)) != null) {
                frameLayout.addView(viewTd);
                C436680HAk c436680HAk = (C436680HAk) viewTd.findViewById(R.id.x3n);
                this.LLJJIII = c436680HAk;
                if (c436680HAk != null && (viewTreeObserver = c436680HAk.getViewTreeObserver()) != null) {
                    ViewTreeObserverOnScrollChangedListenerC21657119pJ viewTreeObserverOnScrollChangedListenerC21657119pJ = this.LLJLIL;
                    viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21657119pJ);
                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21657119pJ, ViewTreeObserver.OnScrollChangedListener.class);
                }
                this.LLJJIJI = (LinearLayout) viewTd.findViewById(R.id.x3m);
            }
        }
        LinearLayout linearLayout2 = this.LLJJIJI;
        if (C0R2Q.LIZ(linearLayout2 != null ? Integer.valueOf(linearLayout2.getChildCount()) : null) > 0 && (linearLayout = this.LLJJIJI) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (true ^ ((ArrayList) this.LLJJIJIIJIL).isEmpty()) {
            kp(false);
            for (View view : (ArrayList) this.LLJJIJIIJIL) {
                LinearLayout linearLayout3 = this.LLJJIJI;
                if (linearLayout3 != null) {
                    linearLayout3.addView(view);
                }
            }
        } else {
            C436680HAk c436680HAk2 = this.LLJJIII;
            if (c436680HAk2 != null) {
                int visibility = c436680HAk2.getVisibility();
                c436680HAk2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c436680HAk2);
            }
        }
        C436680HAk c436680HAk3 = this.LLJJIII;
        if (c436680HAk3 != null) {
            HandlerHook.viewPost(c436680HAk3, new ARunnableS133S0100000_33(this, 73));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C13MK.LIZLLL(new AwS577S0100000_33((TakoBottomBarAssem) this, 3297));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(final T r7) {
        /*
            r6 = this;
            X.0HAk r4 = r6.LLJJIII
            if (r4 == 0) goto L43
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L62
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L62
            r5 = 0
            if (r7 == 0) goto L44
            boolean r1 = r7.isActive()
            r0 = 1
            if (r1 != r0) goto L44
        L1a:
            r3 = 0
            if (r0 == 0) goto L46
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r5)
            r4.setBackground(r0)
            X.19pO r2 = new X.19pO
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility> r0 = com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility r0 = (com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility) r0
            if (r0 == 0) goto L39
            X.15jv r3 = r0.cM()
        L39:
            java.util.List<X.0ybT<T extends X.19pL>> r0 = r6.LLJJIJIIJIL
            r2.<init>(r3, r4, r0)
            r6.LLJJJ = r2
            r2.LIZJ(r7)
        L43:
            return
        L44:
            r0 = 0
            goto L1a
        L46:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            android.content.Context r1 = r4.getContext()
            r0 = 2131100556(0x7f06038c, float:1.7813497E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L59
            int r5 = r0.intValue()
        L59:
            r2.<init>(r5)
            r4.setBackground(r2)
            r6.LLJJJ = r3
            return
        L62:
            X.19pK r0 = new X.19pK
            r0.<init>()
            r4.addOnLayoutChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBottomBarAssem.ip(X.19pL):void");
    }

    public final void kp(boolean z) {
        C436680HAk c436680HAk;
        C436680HAk c436680HAk2;
        T t = this.LLJJIJIL;
        if (t != null && t.isActive()) {
            C436680HAk c436680HAk3 = this.LLJJIII;
            if (c436680HAk3 != null && c436680HAk3.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, c436680HAk3);
            }
            if (z && (c436680HAk2 = this.LLJJIII) != null) {
                HandlerHook.viewPost(c436680HAk2, new ARunnableS133S0100000_33(this, 81));
                return;
            }
            return;
        }
        if (!this.LLJJJIL && !this.LLJJL) {
            if (this.LLJJLIIIJLLLLLLLZ) {
                C436680HAk c436680HAk4 = this.LLJJIII;
                if (c436680HAk4 == null || c436680HAk4.getVisibility() == 8) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, c436680HAk4);
                return;
            }
            C436680HAk c436680HAk5 = this.LLJJIII;
            if (c436680HAk5 != null && c436680HAk5.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, c436680HAk5);
            }
            if (!z || (c436680HAk = this.LLJJIII) == null) {
                return;
            }
            HandlerHook.viewPost(c436680HAk, new ARunnableS133S0100000_33(this, 81));
            return;
        }
        C436680HAk c436680HAk6 = this.LLJJIII;
        if (c436680HAk6 == null || c436680HAk6.getVisibility() == 8) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, c436680HAk6);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (FrameLayout) view.findViewById(R.id.x5i);
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        ((TakoFragmentViewModel) assemVMLazy.getValue()).wQ2(new AwS612S0100000_33(this, (TakoBottomBarAssem<InterfaceC21657319pL>) 148));
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0yMs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1855260yNY) obj).LLILLJJLI);
            }
        }, null, new AwS647S0100000_33(this, (TakoBottomBarAssem<InterfaceC21657319pL>) 35), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.08qz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2003607t4) obj).LL);
            }
        }, null, new AwS647S0100000_33(this, (TakoBottomBarAssem<InterfaceC21657319pL>) 34), 6);
    }
}
