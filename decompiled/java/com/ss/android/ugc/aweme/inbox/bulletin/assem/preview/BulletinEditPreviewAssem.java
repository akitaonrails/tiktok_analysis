package com.ss.android.ugc.aweme.inbox.bulletin.assem.preview;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C019F;
import X.C0DTR;
import X.C0HUY;
import X.C0HV5;
import X.C0OLV;
import X.C0OSF;
import X.C0OWL;
import X.C0OWM;
import X.C0P43;
import X.C11JF;
import X.C1220000hqw;
import X.C12ES;
import X.C1308910kAL;
import X.C1342130l1v;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19746312Np;
import X.C19746412Nq;
import X.C21647019ng;
import X.C2217381BqS;
import X.C296830BkH;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C620650OVz;
import X.C621560OZm;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.EnumC19746112Nn;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditPreviewAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEditPreviewAssem extends UISlotAssem implements BulletinEditPreviewAbility, InterfaceC623330Ocd, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.EDIT_PREVIEW;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public TuxSkeletonLayout LLJJJ;
    public TuxIconView LLJJJIL;
    public SmartImageView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public C11JF LLJL;
    public boolean LLJLIL;
    public final C0P43 LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinEditPreviewAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a8m;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1755292354) {
            return null;
        }
        return this;
    }

    public BulletinEditPreviewAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 465);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(265), new AwS553S0100000_9((AbstractC738140SxQ) this, 468), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 467), AFwS240S0000000_9.get$arr$(264), null, true);
        this.LLJLILLLLZIIL = new C0P43(this, 0);
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
    }

    public final void hp() {
        Context context = LJJIJL().getContext();
        if (context == null) {
            return;
        }
        new C21647019ng(context, LJJIJL(), new C19746312Np(EnumC19746112Nn.POP, new C621560OZm(new C1342130l1v(8.0f), new C1342130l1v(10.0f)), C1697810uHb.LJIIJJI(new C19746412Nq("translationY", new C0HV5(-28.0f, 0.0f)), new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)))), false).LJI(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C11JF c11jf = this.LLJL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditPreviewAbility
    public final void UJ1(int i) {
        GradientDrawable gradientDrawable;
        Context context = getContext();
        if (context == null) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, contextThemeWrapper);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLJJJIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, contextThemeWrapper);
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxTextView tuxTextView2 = this.LLJJJJLIIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue2);
            }
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, contextThemeWrapper);
        if (numLIZJ3 != null) {
            int iIntValue3 = numLIZJ3.intValue();
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.ag5);
            if ((drawableLIZIZ instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableLIZIZ) != null) {
                gradientDrawable.setColor(iIntValue3);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        C0DTR.LIZIZ(LJJIJL());
        ViewGroup.LayoutParams layoutParams = null;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        this.LLJJJ = (TuxSkeletonLayout) view.findViewById(R.id.rq6);
        this.LLJJJIL = (TuxIconView) view.findViewById(R.id.rrr);
        this.LLJJJJ = (SmartImageView) view.findViewById(R.id.rq7);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.rq9);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.rq8);
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJJJ;
        if (tuxSkeletonLayout != null) {
            layoutParams = tuxSkeletonLayout.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C296830BkH.LIZ()) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            TuxSkeletonLayout tuxSkeletonLayout2 = this.LLJJJ;
            if (tuxSkeletonLayout2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxSkeletonLayout2);
                tuxSkeletonLayout2.setLayoutParams(marginLayoutParams);
            }
        }
        TuxSkeletonLayout tuxSkeletonLayout3 = this.LLJJJ;
        if (tuxSkeletonLayout3 != null) {
            C786410Ut5.I7(new AkS81S0100000_9(this, 4), tuxSkeletonLayout3);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0OTI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C620540OVo) obj).LLIZ;
            }
        }, null, new AwS623S0100000_9(this, 58), 6);
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    public final void ip(C0OSF c0osf, C0OWM c0owm) {
        if ((c0owm == C0OWM.HIDE && c0osf != C0OSF.FULL_SCREEN) || !this.LLJLIL) {
            if (LJJIJL().getVisibility() != 8) {
                C0DTR.LIZIZ(LJJIJL());
            }
        } else {
            if (LJJIJL().getVisibility() == 0) {
                return;
            }
            C12ES.LJIILL(0, LJJIJL());
            hp();
            BulletinEditInputAbility bulletinEditInputAbility = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputAbility.class, null);
            if (bulletinEditInputAbility == null) {
                return;
            }
            bulletinEditInputAbility.qC1();
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        if (enumC617880OLi != EnumC617880OLi.COMPLETE) {
            return;
        }
        ip(c620650OVz.LIZLLL, c620650OVz.LIZIZ);
    }
}
