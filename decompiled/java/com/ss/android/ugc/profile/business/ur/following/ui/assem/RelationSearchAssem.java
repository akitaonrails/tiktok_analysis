package com.ss.android.ugc.profile.business.ur.following.ui.assem;

import X.AbstractC1623806Xk;
import X.AbstractC1906720ziY;
import X.AbstractC329610Cw3;
import X.C019F;
import X.C01GW;
import X.C0DLI;
import X.C0I7D;
import X.C0WZX;
import X.C1070190dxJ;
import X.C1076010e6h;
import X.C11NJ;
import X.C1247080iYc;
import X.C1247240iYs;
import X.C1247300iYy;
import X.C1253000iiA;
import X.C1265780j2m;
import X.C1266020j3A;
import X.C13LE;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1637806bA;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749260vca;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C20607315kN;
import X.C2187701Ajg;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452501pT;
import X.C491001vg;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1247200iYo;
import X.EnumC1726100v1E;
import X.InterfaceC1487280oo2;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1266000j38;
import Y.ACListenerS154S0100000_19;
import Y.AObserverS223S0100000_19;
import Y.AfS188S0100000_19;
import Y.AsS46S0100000_19;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchAssem;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationSearchAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public C1749260vca LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public C1749280vcc LLJILJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1266000j38 LLJJ;
    public boolean LLJJI;
    public Integer LLJJIII;
    public Boolean LLJJIJIIJIL;
    public final AssemVMLazy LLJJJ;
    public final C11NJ LLJJJIL;
    public final C1265780j2m LLJJJJ;
    public final C1247080iYc LLJILJILJ = new C1247080iYc();
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(444));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 673));
    public boolean LLJJIJIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RelationSearchAssem.class, "searchVM", "getSearchVM()Lcom/ss/android/ugc/profile/business/ur/following/vm/RelationSearchVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RelationSearchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RelationSearchVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 674), AFwS257S0000000_19.get$arr$(432), null, true);
        this.LLJJJIL = new C11NJ();
        this.LLJJJJ = new C1265780j2m(this, Intrinsics.LJFF(this.LLJJIJIIJIL, Boolean.TRUE), 6);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final RelationSearchVM Go() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (RelationSearchVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        FrameLayout frameLayout;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        this.LLJJJIL.dispose();
        ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38 = this.LLJJ;
        if (viewTreeObserverOnGlobalLayoutListenerC1266000j38 == null || (frameLayout = this.LLIZLLLIL) == null || (viewTreeObserver = frameLayout.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1266000j38);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1266000j38, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1247240iYs.LIZ.getClass();
        C1247240iYs.LIZIZ = 0L;
        C1247240iYs.LIZJ = 0;
        C1247240iYs.LIZLLL = 0;
    }

    public final void Ho(AbstractC1623806Xk<Boolean> abstractC1623806Xk) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            C1749280vcc c1749280vcc = this.LLJILJIL;
            if (c1749280vcc != null) {
                c1749280vcc.LJ();
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            if (!C1247300iYy.LIZ() && (viewOnAttachStateChangeListenerC20604515jv = this.LLJIJIL) != null) {
                C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
                return;
            }
            return;
        }
        if (!(abstractC1623806Xk instanceof C491001vg) && !Intrinsics.LJFF(abstractC1623806Xk.LIZ(), Boolean.TRUE)) {
            if (!(abstractC1623806Xk instanceof C1623606Xi)) {
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv2);
            }
            C1749280vcc c1749280vcc2 = this.LLJILJIL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
                return;
            }
            viewOnAttachStateChangeListenerC20604515jv3.scrollToPosition(0);
            return;
        }
        C1749280vcc c1749280vcc3 = this.LLJILJIL;
        if (c1749280vcc3 != null) {
            c1749280vcc3.setStatus((C1722300uv6) this.LLJJIJI.getValue());
            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv4);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv5 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jv5.scrollToPosition(0);
    }

    public final void Jo(Boolean bool) {
        C0I7D editTextView;
        Editable editableLLLLJI;
        C0I7D editTextView2;
        C0I7D editTextView3;
        boolean z;
        int i;
        this.LLJJIJIIJIL = bool;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            FrameLayout frameLayout = this.LLJ;
            int i2 = 8;
            boolean z2 = true;
            if (frameLayout != null) {
                if (frameLayout.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != zBooleanValue) {
                    if (zBooleanValue) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, frameLayout);
                }
            }
            FrameLayout frameLayout2 = this.LLIZLLLIL;
            boolean z3 = !zBooleanValue;
            if (frameLayout2 != null) {
                if (frameLayout2.getVisibility() != 0) {
                    z2 = false;
                }
                if (z2 != z3) {
                    if (z3) {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, frameLayout2);
                }
            }
            if (!zBooleanValue) {
                if (!C1247300iYy.LIZ()) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    C1749260vca c1749260vca = this.LLJI;
                    if (c1749260vca != null) {
                        editTextView2 = c1749260vca.getEditTextView();
                    } else {
                        editTextView2 = null;
                    }
                    C0DLI.LIZ(c19egLIZ, editTextView2);
                    C1749260vca c1749260vca2 = this.LLJI;
                    if (c1749260vca2 != null && (editTextView3 = c1749260vca2.getEditTextView()) != null) {
                        editTextView3.setCursorVisible(false);
                    }
                }
                C1749260vca c1749260vca3 = this.LLJI;
                if (c1749260vca3 != null && (editTextView = c1749260vca3.getEditTextView()) != null && (editableLLLLJI = C2204961BRm.LLLLJI(editTextView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDmOIvzegUTreHXGGb6uioYevFDEIkKg/mUm2Q4eUHT8RMfDyTWMU=", null))) != null) {
                    editableLLLLJI.clear();
                }
                Go().LLILZ = "";
            }
            this.LLJJJJ.LJFF(bool.booleanValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.ij2);
        this.LLJ = (FrameLayout) view.findViewById(R.id.ue4);
        this.LLJI = (C1749260vca) view.findViewById(R.id.u78);
        final C1749260vca c1749260vca = this.LLJI;
        if (c1749260vca != null) {
            c1749260vca.setSearchBarHeight(EnumC1726100v1E.HIGH);
            c1749260vca.setShowSeparator(false);
            if (Go().wQ2().LLILLL && C1247300iYy.LIZ()) {
                this.LLJJJIL.LIZ(C1070190dxJ.LIZ(c1749260vca.getEditTextView()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS188S0100000_19(this, 0)));
            } else {
                this.LLJJJIL.LIZ(C1070190dxJ.LIZ(c1749260vca.getEditTextView()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0iYu
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        C1247240iYs.LIZ.getClass();
                        C1247240iYs.LIZLLL++;
                        return obj;
                    }
                }).LJIL(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS188S0100000_19(this, 1)));
            }
            c1749260vca.getEditTextView().addTextChangedListener(new C1266020j3A(this, 0));
            c1749260vca.getEditTextView().setOnTouchListener(new View.OnTouchListener() { // from class: X.0iYw
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent != null && motionEvent.getAction() == 1) {
                        c1749260vca.getEditTextView().setCursorVisible(true);
                        RelationSearchAssem relationSearchAssem = this;
                        if (relationSearchAssem.LLJJIJIL) {
                            relationSearchAssem.LLJJIJIL = false;
                            C1247190iYn c1247190iYn = C1247190iYn.LIZ;
                            String enterFrom = relationSearchAssem.Go().getEnterFrom();
                            c1247190iYn.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
                            C20684815ws.LJIILLIIL("fans_following_page_click_search", c2344009Gk.LIZ);
                        }
                    }
                    return false;
                }
            });
            c1749260vca.setOnClickClearListener(new ACListenerS154S0100000_19(this, 4));
            this.LLJJ = new ViewTreeObserverOnGlobalLayoutListenerC1266000j38(c1749260vca, this, 0);
            FrameLayout frameLayout = this.LLIZLLLIL;
            if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38 = this.LLJJ;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1266000j38);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1266000j38, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
        this.LLJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.udr);
        if (Go().wQ2().LLILLL && C1247300iYy.LIZ()) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.LIZJ(this.LLJILJILJ);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.LIZJ((AbstractC1906720ziY) this.LLJILLL.getValue());
            }
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                if (Intrinsics.LJFF(Go().getEnterFrom(), EnumC1247200iYo.FOLLOWING.getMobString())) {
                    viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(SelfFollowRelationSearchCell.class);
                } else {
                    viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(RelationSearchCell.class);
                }
                viewOnAttachStateChangeListenerC20604515jv3.LJIIL((AbstractC329610Cw3) Go().LLILZIL.getValue());
                viewOnAttachStateChangeListenerC20604515jv3.LJII(new C20607315kN() { // from class: X.0iYx
                    @Override // X.C20607315kN
                    public final void LJIIIIZZ() {
                        C20600815jK<InterfaceC1891350zJl> state;
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LL.LLJIJIL;
                        if (viewOnAttachStateChangeListenerC20604515jv4 == null || (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) == null) {
                            return;
                        }
                        state.LJFF(null);
                    }
                });
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.addOnScrollListener(new AsS46S0100000_19(this, 0));
        }
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.uel);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0iYz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1247100iYe) obj).LL;
            }
        }, null, new AwS598S0100000_19(this, 23), new AwS563S0100000_19(this, 6), new AwS598S0100000_19(this, 25), 2, null);
        if (C1247300iYy.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iYf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1247100iYe) obj).LLILLL;
                }
            }, null, new AwS633S0100000_19(this, 3), 6);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iZ0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1247100iYe) obj).LLILLJJLI;
            }
        }, null, new AwS633S0100000_19(this, 5), 6);
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, new AObserverS223S0100000_19(this, 6));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(this, this.LLJJJJ);
        }
    }
}
