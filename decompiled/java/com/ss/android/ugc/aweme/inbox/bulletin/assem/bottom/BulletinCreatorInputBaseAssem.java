package com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C0OQP;
import X.C0OSF;
import X.C0OWC;
import X.C0OWD;
import X.C0OWE;
import X.C0OWM;
import X.C0P4J;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1848410yCV;
import X.C19719912Dl;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C620650OVz;
import X.C623320Occ;
import X.C623350Ocf;
import X.C723580SZw;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import Y.ACListenerS144S0100000_9;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorInputBaseAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinDraftAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import mf.a;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreatorInputBaseAssem extends BulletinBottomBaseAssem implements InterfaceC623330Ocd {
    public final EnumC619890OTb LLJJI = EnumC619890OTb.CREATOR_INPUT_BASE;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public float LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public ValueAnimator LLJLLIL;
    public C0OWC LLJLLL;
    public final C0P4J LLJZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a5y;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public BulletinCreatorInputBaseAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 344);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinEditViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(205);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 346);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJI = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 345);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(206), new AwS553S0100000_9((AbstractC738140SxQ) this, 347), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIL = true;
        this.LLJJJIL = -2;
        this.LLJJJJ = -2;
        this.LLJZ = new C0P4J(this, 1);
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinBottomBaseAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        View viewFindViewById;
        super.onDestroy();
        ValueAnimator valueAnimator = this.LLJLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLLIL = null;
        C0OWC c0owc = this.LLJLLL;
        if (c0owc != null && (viewFindViewById = LJJIJL().findViewById(R.id.etv)) != null) {
            viewFindViewById.removeOnLayoutChangeListener(c0owc);
        }
        this.LLJLLL = null;
        View viewFindViewById2 = LJJIJL().findViewById(R.id.voice_record_panel_root);
        if (viewFindViewById2 != null) {
            viewFindViewById2.removeOnLayoutChangeListener(this.LLJZ);
        }
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        BulletinDraftAbility bulletinDraftAbility = (BulletinDraftAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinDraftAbility.class, null);
        if (bulletinDraftAbility != null) {
            bulletinDraftAbility.O();
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int minimumHeight;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        super.onViewCreated(view);
        C0OWD c0owd = null;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        C0OLV c0olv = (C0OLV) this.LLJJIII.getValue();
        if (c0olv == null || (obj = c0olv.LL) == null) {
            obj = 0L;
        }
        ((BulletinEditViewModel) this.LLJJIJI.getValue()).LLILZLL = obj.toString();
        C723850SaN.LIZLLL(this, new AwS588S0100000_9(this, 42));
        View viewFindViewById3 = LJJIJL().findViewById(R.id.evm);
        if (viewFindViewById3 == null || (viewFindViewById = viewFindViewById3.findViewById(R.id.kse)) == null) {
            viewFindViewById = LJJIJL().findViewById(R.id.kse);
        }
        if (viewFindViewById3 == null || (viewFindViewById2 = viewFindViewById3.findViewById(R.id.es9)) == null) {
            viewFindViewById2 = LJJIJL().findViewById(R.id.es9);
        }
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams4 = (LinearLayout.LayoutParams) layoutParams) != null) {
            this.LLJJJ = layoutParams4.weight;
            this.LLJJJIL = layoutParams4.height;
        }
        if (viewFindViewById2 != null) {
            layoutParams2 = viewFindViewById2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams2) != null) {
            this.LLJJJJ = layoutParams3.height;
            this.LLJJJJJIL = layoutParams3.topMargin;
            this.LLJJJJLIIL = layoutParams3.getMarginStart();
            this.LLJJL = layoutParams3.getMarginEnd();
            this.LLJJLIIIJLLLLLLLZ = layoutParams3.bottomMargin;
        }
        if (viewFindViewById2 != null) {
            minimumHeight = viewFindViewById2.getMinimumHeight();
        } else {
            minimumHeight = 0;
        }
        this.LLJL = minimumHeight;
        View viewFindViewById4 = LJJIJL().findViewById(R.id.voice_record_panel_root);
        if (viewFindViewById4 != null) {
            viewFindViewById4.addOnLayoutChangeListener(this.LLJZ);
        }
        C0OWD c0owd2 = (C0OWD) LJJIJL().findViewById(R.id.trr);
        if (c0owd2 == null) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof C0OWD) && (c0owd = (C0OWD) viewLJJIJL) != null) {
            }
            AssemViewModel.asyncSubscribe$default(this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0OW7
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C0OKY) obj2).LL;
                }
            }, this, null, null, null, new AwS375S0200000_9(this, c0owd, 12), 28, null);
        }
        c0owd = c0owd2;
        View.OnClickListener aCListenerS144S0100000_9 = new ACListenerS144S0100000_9(this, 23);
        if (C1848410yCV.LIZ) {
            aCListenerS144S0100000_9 = new f(aCListenerS144S0100000_9);
        }
        a aVar = new a(aCListenerS144S0100000_9);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0owd);
        }
        c0owd.setOnClickListener(aVar);
        AssemViewModel.asyncSubscribe$default(this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0OW7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0OKY) obj2).LL;
            }
        }, this, null, null, null, new AwS375S0200000_9(this, c0owd, 12), 28, null);
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return kp(c0osf, c0owm);
    }

    public final List<C0OWE> kp(C0OSF c0osf, C0OWM c0owm) {
        View viewFindViewById;
        View viewFindViewById2;
        ArrayList arrayList = new ArrayList();
        View viewFindViewById3 = LJJIJL().findViewById(R.id.esu);
        if (viewFindViewById3 != null && c0owm == C0OWM.HIDE) {
            arrayList.add(new C0OWE(viewFindViewById3, new C623320Occ(0.0f, 0, 8, null, null, null, null, 120)));
        }
        View viewFindViewById4 = LJJIJL().findViewById(R.id.evm);
        if (viewFindViewById4 == null || (viewFindViewById = viewFindViewById4.findViewById(R.id.kse)) == null) {
            viewFindViewById = LJJIJL().findViewById(R.id.kse);
        }
        if (viewFindViewById4 == null || (viewFindViewById2 = viewFindViewById4.findViewById(R.id.es9)) == null) {
            viewFindViewById2 = LJJIJL().findViewById(R.id.es9);
        }
        if (C0OQP.LIZ[c0osf.ordinal()] == 1) {
            if (viewFindViewById != null) {
                arrayList.add(new C0OWE(viewFindViewById, new C623320Occ(1.0f, 0, 0, null, null, null, null, 124)));
            }
            if (viewFindViewById2 != null) {
                arrayList.add(new C0OWE(viewFindViewById2, new C623320Occ(1.0f, -1, 0, null, new C623350Ocf(0, 0, 0, 0), 0, null, 76)));
            }
        } else {
            if (viewFindViewById != null) {
                arrayList.add(new C0OWE(viewFindViewById, new C623320Occ(this.LLJJJ, this.LLJJJIL, 0, null, null, null, null, 124)));
            }
            if (viewFindViewById2 != null) {
                arrayList.add(new C0OWE(viewFindViewById2, new C623320Occ(1.0f, this.LLJJJJ, 0, null, new C623350Ocf(this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLJJLIIIJLLLLLLLZ), Integer.valueOf(this.LLJL), null, 76)));
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.0OWC, android.view.View$OnLayoutChangeListener] */
    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        View viewFindViewById;
        int i;
        int i2 = 1;
        if (c620650OVz.LIZIZ() && enumC617880OLi == EnumC617880OLi.PERFORM) {
            final View viewFindViewById2 = LJJIJL().findViewById(R.id.evm);
            if (viewFindViewById2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(4, viewFindViewById2);
            View viewFindViewById3 = LJJIJL().findViewById(R.id.voice_record_panel_root);
            if (viewFindViewById3 == null) {
                final View viewFindViewById4 = LJJIJL().findViewById(R.id.etv);
                if (viewFindViewById4 != 0) {
                    C0OWC c0owc = this.LLJLLL;
                    if (c0owc != null) {
                        viewFindViewById4.removeOnLayoutChangeListener(c0owc);
                    }
                    ?? r0 = new View.OnLayoutChangeListener() { // from class: X.0OWC
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                            View viewFindViewById5 = this.LL.LJJIJL().findViewById(R.id.voice_record_panel_root);
                            if (viewFindViewById5 != null && viewFindViewById5.getHeight() > 0) {
                                viewFindViewById4.removeOnLayoutChangeListener(this);
                                this.LL.LLJLLL = null;
                                int width = viewFindViewById2.getWidth();
                                int i11 = 1;
                                if (width < 1) {
                                    width = 1;
                                }
                                int i12 = 0;
                                viewFindViewById5.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                int measuredHeight = viewFindViewById5.getMeasuredHeight();
                                if (measuredHeight >= 1) {
                                    i11 = measuredHeight;
                                }
                                BulletinCreatorInputBaseAssem bulletinCreatorInputBaseAssem = this.LL;
                                int height = viewFindViewById2.getHeight();
                                if (height >= 0) {
                                    i12 = height;
                                }
                                bulletinCreatorInputBaseAssem.LLJLIL = i12;
                                viewFindViewById2.getLayoutParams().height = i11;
                                viewFindViewById2.requestLayout();
                                this.LL.LLJLL = i11;
                            }
                        }
                    };
                    this.LLJLLL = r0;
                    viewFindViewById4.addOnLayoutChangeListener(r0);
                    return;
                }
                return;
            }
            int height = viewFindViewById2.getHeight();
            int width = viewFindViewById2.getWidth();
            if (width < 1) {
                width = 1;
            }
            viewFindViewById3.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = viewFindViewById3.getMeasuredHeight();
            if (measuredHeight >= 1) {
                i2 = measuredHeight;
            }
            if (height > 0) {
                this.LLJLIL = height;
                interfaceC617820OLc.He(viewFindViewById2, i2, 250L, false);
            } else {
                this.LLJLIL = 0;
                viewFindViewById2.getLayoutParams().height = i2;
                viewFindViewById2.requestLayout();
            }
            this.LLJLL = i2;
            return;
        }
        if (c620650OVz.LIZIZ() && enumC617880OLi == EnumC617880OLi.COMPLETE) {
            this.LLJLILLLLZIIL = true;
            return;
        }
        if (c620650OVz.LIZLLL() && enumC617880OLi == EnumC617880OLi.PREPARE) {
            View viewFindViewById5 = LJJIJL().findViewById(R.id.evm);
            if (viewFindViewById5 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById5);
            this.LLJLILLLLZIIL = false;
            ValueAnimator valueAnimator = this.LLJLLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLJLLIL = null;
            return;
        }
        if (c620650OVz.LIZLLL() && enumC617880OLi == EnumC617880OLi.PERFORM) {
            View viewFindViewById6 = LJJIJL().findViewById(R.id.evm);
            if (viewFindViewById6 == null || (i = this.LLJLIL) <= 0) {
                return;
            }
            interfaceC617820OLc.He(viewFindViewById6, i, 250L, false);
            return;
        }
        if (c620650OVz.LIZLLL() && enumC617880OLi == EnumC617880OLi.COMPLETE) {
            View viewFindViewById7 = LJJIJL().findViewById(R.id.evm);
            if (viewFindViewById7 == null) {
                return;
            }
            if (viewFindViewById7.getLayoutParams().height != -1) {
                viewFindViewById7.getLayoutParams().height = -1;
                viewFindViewById7.requestLayout();
            }
            this.LLJLIL = 0;
            this.LLJLL = 0;
            return;
        }
        C0OWM c0owm = c620650OVz.LIZ;
        C0OWM c0owm2 = C0OWM.HIDE;
        if (c0owm == c0owm2 || c620650OVz.LIZIZ != c0owm2 || c620650OVz.LIZIZ() || enumC617880OLi != EnumC617880OLi.COMPLETE || (viewFindViewById = LJJIJL().findViewById(R.id.esu)) == null || viewFindViewById.getVisibility() == 8) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }
}
