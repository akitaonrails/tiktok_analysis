package com.ss.android.ugc.aweme.feed.interest.card;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PEM;
import X.C0RUJ;
import X.C1287390jbd;
import X.C1287400jbe;
import X.C12BD;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1735500vGO;
import X.C197039127h;
import X.C19719912Dl;
import X.C1DFH;
import X.C20632315oP;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C421980Gge;
import X.C426750GoL;
import X.C437001my;
import X.C452070Ho5;
import X.C452501pT;
import X.C487350J9h;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1287420jbg;
import X.EnumC1486960onW;
import X.InterfaceC1473950oSX;
import X.InterfaceC1483820oiS;
import X.InterfaceC1486910onR;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Surface;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class InterestCardCellComponent extends BaseCellContentComponent<InterestCardCellComponent> implements InterfaceC1483820oiS, C0RUJ {
    public static final C12BD LLLFFI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public static final C1287390jbd LLLI;
    public Aweme LLJJJJLIIL;
    public final IInterestReselectionService LLJJL = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null);
    public IViewPagerComponentAbility LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public View LLJLIL;
    public ViewStub LLJLILLLLZIIL;
    public View LLJLL;
    public C1287400jbe LLJLLIL;
    public boolean LLJLLL;
    public FrameLayout LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxIconView LLL;
    public C1735500vGO LLLF;
    public final C01GW LLLFF;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.12BD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InterestCardCellComponent.class, "cardVM", "getCardVM()Lcom/ss/android/ugc/aweme/feed/interest/card/InterestCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFFI = new Object() { // from class: X.12BD
        };
        LLLI = new C1287390jbd(2.0f, 0.0f, (List) null, (List) null, Color.rgb(0, 0, 0), Color.rgb(65, 90, 96), Color.rgb(0, 0, 0), Color.rgb(0, 0, 0), Color.rgb(6, 31, 37), 1.0f, 0.0f, 28);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "interests_reselection_card_cell";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    public final InterestCardViewModel ep() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (InterestCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    public final boolean hp() {
        if (this.LLJJL == null) {
            return false;
        }
        return ip();
    }

    public final boolean ip() {
        C12BD c12bd = LLLFFI;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c12bd.getClass();
        return aweme != null && aweme.getAwemeType() == 601;
    }

    public InterestCardCellComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterestCardViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 407);
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(37);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 408), aFwS273S0000000_29, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJL = assemVMLazy;
        this.LLLFF = C452501pT.LIZIZ(new AwS567S0100000_23(this, 96));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        IInterestReselectionService iInterestReselectionService;
        String strLJJLIIIJ;
        List<InterestTag> listLJJ;
        if (hp() && (iInterestReselectionService = this.LLJJL) != null) {
            int size = ep().LLILLL.size();
            InterestCardViewModel interestCardViewModelEp = ep();
            IInterestReselectionService iInterestReselectionService2 = interestCardViewModelEp.LL;
            if (iInterestReselectionService2 == null || (listLJJ = iInterestReselectionService2.LJJ()) == null) {
                strLJJLIIIJ = "";
            } else {
                List listLLIIII = C13LP.LLIIII(interestCardViewModelEp.LLILLL);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLLIIII) {
                    if (((Number) obj).intValue() < listLJJ.size()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((InterestTag) ListProtector.get(listLJJ, ((Number) it2.next()).intValue())).id);
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            }
            iInterestReselectionService.LJFF(size, "homepage_hot", strLJJLIIIJ);
            IInterestReselectionService iInterestReselectionService3 = this.LLJJL;
            if (iInterestReselectionService3 != null) {
                iInterestReselectionService3.LJIJ(false);
            }
            kp(EnumC1486960onW.PAUSE);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        if (hp()) {
            View view = this.LLJLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C1287400jbe c1287400jbe = this.LLJLLIL;
            if (c1287400jbe != null) {
                c1287400jbe.onPause();
            }
            Boolean boolValueOf = null;
            this.LLJLLIL = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("interestCardInflatedView.visible: ");
            View view2 = this.LLJLL;
            if (view2 != null) {
                boolValueOf = Boolean.valueOf(view2.getVisibility() == 0);
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", shaderView: ");
            sbLIZ.append(this.LLJLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
            kp(EnumC1486960onW.STOP);
        }
    }

    public final void Sh() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C437001my(activityLIZ, null), 2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        if (!hp()) {
            return;
        }
        kp(EnumC1486960onW.PAUSE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        if (!hp()) {
            return;
        }
        kp(EnumC1486960onW.START);
    }

    public final void kp(EnumC1486960onW enumC1486960onW) {
        if (ip()) {
            ((InterfaceC1486910onR) this.LLLFF.getValue()).LIZ(enumC1486960onW);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = view.findViewById(R.id.view_rootview);
        this.LLJLILLLLZIIL = (ViewStub) view.findViewById(R.id.kwq);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        List<InterestTag> listLLIIII;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Float fValueOf;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Float fValueOf2;
        Integer numValueOf7;
        C1735500vGO c1735500vGO;
        TuxIconView tuxIconView;
        FrameLayout frameLayout;
        Integer numValueOf8;
        Integer numValueOf9;
        Integer numValueOf10;
        C1287400jbe c1287400jbe;
        View viewFindViewById;
        ViewStub viewStub;
        View viewLJLLLL;
        Float fValueOf3 = null;
        if (!hp()) {
            View view = this.LLJLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C1287400jbe c1287400jbe2 = this.LLJLLIL;
            if (c1287400jbe2 != null) {
                c1287400jbe2.onPause();
            }
            this.LLJLLIL = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interestCardInflatedView: ");
        sbLIZ.append(this.LLJLL);
        C2188811AlT.LIZIZ(sbLIZ);
        int iLJJIFFI = 0;
        if (this.LLJLL == null && (viewStub = this.LLJLILLLLZIIL) != null && viewStub.getParent() != null) {
            try {
                ViewStub viewStub2 = this.LLJLILLLLZIIL;
                if (viewStub2 != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub2);
                } else {
                    viewLJLLLL = null;
                }
                this.LLJLL = viewLJLLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onBind");
                sbLIZ2.append(" -> inflate interestCardViewStub successfully: ");
                sbLIZ2.append(this.LLJLL);
                C2188811AlT.LIZIZ(sbLIZ2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onBind");
                sbLIZ3.append(" -> failed to inflate ViewStub: ");
                sbLIZ3.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
                IInterestReselectionService iInterestReselectionService = this.LLJJL;
                if (iInterestReselectionService != null) {
                    iInterestReselectionService.LJ(2, "homepage_hot");
                }
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onBind");
            sbLIZ4.append(" -> no need to inflate interestCardViewStub");
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (this.LLJLL == null) {
            View view2 = this.LLJLIL;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.l0c);
            } else {
                viewFindViewById = null;
            }
            this.LLJLL = viewFindViewById;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("onBind");
            sbLIZ5.append(" -> try to find interestCardInflatedView if inflation doesn't work");
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            this.LLJZIJLIL = (TuxTextView) view3.findViewById(R.id.l0b);
            View view4 = this.LLJLL;
            if (view4 != null) {
                c1735500vGO = (C1735500vGO) view4.findViewById(R.id.l0a);
            } else {
                c1735500vGO = null;
            }
            this.LLLF = c1735500vGO;
            View view5 = this.LLJLL;
            if (view5 != null) {
                tuxIconView = (TuxIconView) view5.findViewById(R.id.l0e);
            } else {
                tuxIconView = null;
            }
            this.LLL = tuxIconView;
            View view6 = this.LLJLL;
            if (view6 != null) {
                frameLayout = (FrameLayout) view6.findViewById(R.id.l0_);
            } else {
                frameLayout = null;
            }
            this.LLJZ = frameLayout;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("after bindInflatedViews: section=");
            sbLIZ6.append(this.LLLF);
            sbLIZ6.append(" vis=");
            C1735500vGO c1735500vGO2 = this.LLLF;
            if (c1735500vGO2 != null) {
                numValueOf8 = Integer.valueOf(c1735500vGO2.getVisibility());
            } else {
                numValueOf8 = null;
            }
            sbLIZ6.append(numValueOf8);
            sbLIZ6.append(" w=");
            C1735500vGO c1735500vGO3 = this.LLLF;
            if (c1735500vGO3 != null) {
                numValueOf9 = Integer.valueOf(c1735500vGO3.getWidth());
            } else {
                numValueOf9 = null;
            }
            sbLIZ6.append(numValueOf9);
            sbLIZ6.append(" h=");
            C1735500vGO c1735500vGO4 = this.LLLF;
            if (c1735500vGO4 != null) {
                numValueOf10 = Integer.valueOf(c1735500vGO4.getHeight());
            } else {
                numValueOf10 = null;
            }
            sbLIZ6.append(numValueOf10);
            C2188811AlT.LIZIZ(sbLIZ6);
            this.LLJJLIIIJLLLLLLLZ = (IViewPagerComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IViewPagerComponentAbility.class, null);
            C1735500vGO c1735500vGO5 = this.LLLF;
            if (c1735500vGO5 != null) {
                c1735500vGO5.setOnSubmitListener(new AwS608S0100000_29(this, 630));
            }
            if (this.LLJLLIL == null) {
                View view7 = this.LLJLL;
                if (view7 != null) {
                    c1287400jbe = (C1287400jbe) view7.findViewById(R.id.l0d);
                } else {
                    c1287400jbe = null;
                }
                this.LLJLLIL = c1287400jbe;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("find and assign shaderView: ");
                sbLIZ7.append(this.LLJLLIL);
                C2188811AlT.LIZIZ(sbLIZ7);
            }
            C1287400jbe c1287400jbe3 = this.LLJLLIL;
            if (c1287400jbe3 != null) {
                if (!this.LLJLLL) {
                    c1287400jbe3.LIZ(EnumC1287420jbg.SpinDiffuse, LLLI);
                    c1287400jbe3.setZOrderMediaOverlay(false);
                    c1287400jbe3.LIZJ();
                    this.LLJLLL = true;
                } else {
                    c1287400jbe3.onResume();
                }
                C786410Ut5.LLLZIIL(c1287400jbe3, 0);
            }
            TuxTextView tuxTextView = this.LLJZIJLIL;
            if (tuxTextView != null) {
                tuxTextView.setElevation(C418440Gaw.LIZIZ(10));
            }
            C1735500vGO c1735500vGO6 = this.LLLF;
            if (c1735500vGO6 != null) {
                c1735500vGO6.setElevation(C418440Gaw.LIZIZ(10));
            }
            TuxIconView tuxIconView2 = this.LLL;
            if (tuxIconView2 != null) {
                tuxIconView2.setElevation(C418440Gaw.LIZIZ(10));
            }
            try {
                if (view3.getVisibility() == 8) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("toggle visibility from: ");
                    sbLIZ8.append("onBind");
                    C2188811AlT.LIZIZ(sbLIZ8);
                    C786410Ut5.LJLLLLLL(0, view3);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("Failed to set visibility from: ");
                sbLIZ9.append("onBind");
                sbLIZ9.append(", ");
                sbLIZ9.append(e2.getMessage());
                C2188811AlT.LIZIZ(sbLIZ9);
            }
        } else {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("interestCardInflatedView is null, cannot set visibility from: ");
            sbLIZ10.append("onBind");
            C2188811AlT.LIZIZ(sbLIZ10);
            IInterestReselectionService iInterestReselectionService2 = this.LLJJL;
            if (iInterestReselectionService2 != null) {
                iInterestReselectionService2.LJ(2, "homepage_hot");
            }
        }
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("card root: vis=");
        View view8 = this.LLJLL;
        if (view8 != null) {
            numValueOf = Integer.valueOf(view8.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ11.append(numValueOf);
        sbLIZ11.append(", h=");
        View view9 = this.LLJLL;
        if (view9 != null) {
            numValueOf2 = Integer.valueOf(view9.getHeight());
        } else {
            numValueOf2 = null;
        }
        sbLIZ11.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ11);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("titleView: vis=");
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            numValueOf3 = Integer.valueOf(tuxTextView2.getVisibility());
        } else {
            numValueOf3 = null;
        }
        sbLIZ12.append(numValueOf3);
        sbLIZ12.append(", alpha=");
        TuxTextView tuxTextView3 = this.LLJZIJLIL;
        if (tuxTextView3 != null) {
            fValueOf = Float.valueOf(tuxTextView3.getAlpha());
        } else {
            fValueOf = null;
        }
        sbLIZ12.append(fValueOf);
        sbLIZ12.append(", h=");
        TuxTextView tuxTextView4 = this.LLJZIJLIL;
        if (tuxTextView4 != null) {
            numValueOf4 = Integer.valueOf(tuxTextView4.getHeight());
        } else {
            numValueOf4 = null;
        }
        sbLIZ12.append(numValueOf4);
        C2188811AlT.LIZIZ(sbLIZ12);
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("sectionView: vis=");
        C1735500vGO c1735500vGO7 = this.LLLF;
        if (c1735500vGO7 != null) {
            numValueOf5 = Integer.valueOf(c1735500vGO7.getVisibility());
        } else {
            numValueOf5 = null;
        }
        sbLIZ13.append(numValueOf5);
        sbLIZ13.append(", h=");
        C1735500vGO c1735500vGO8 = this.LLLF;
        if (c1735500vGO8 != null) {
            numValueOf6 = Integer.valueOf(c1735500vGO8.getHeight());
        } else {
            numValueOf6 = null;
        }
        sbLIZ13.append(numValueOf6);
        sbLIZ13.append(", a=");
        C1735500vGO c1735500vGO9 = this.LLLF;
        if (c1735500vGO9 != null) {
            fValueOf2 = Float.valueOf(c1735500vGO9.getAlpha());
        } else {
            fValueOf2 = null;
        }
        sbLIZ13.append(fValueOf2);
        C2188811AlT.LIZIZ(sbLIZ13);
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("shaderView: vis=");
        C1287400jbe c1287400jbe4 = this.LLJLLIL;
        if (c1287400jbe4 != null) {
            numValueOf7 = Integer.valueOf(c1287400jbe4.getVisibility());
        } else {
            numValueOf7 = null;
        }
        sbLIZ14.append(numValueOf7);
        sbLIZ14.append(", z=");
        C1287400jbe c1287400jbe5 = this.LLJLLIL;
        if (c1287400jbe5 != null) {
            fValueOf3 = Float.valueOf(c1287400jbe5.getZ());
        }
        sbLIZ14.append(fValueOf3);
        C2188811AlT.LIZIZ(sbLIZ14);
        IInterestReselectionService iInterestReselectionService3 = this.LLJJL;
        if (iInterestReselectionService3 != null && iInterestReselectionService3.LIZIZ()) {
            TuxTextView tuxTextView5 = this.LLJZIJLIL;
            if (tuxTextView5 != null) {
                C426750GoL.LJIIIZ(tuxTextView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
                C426750GoL.LJIIL(tuxTextView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))), null, 26);
                tuxTextView5.setTuxFont(23);
            }
            C1735500vGO c1735500vGO10 = this.LLLF;
            if (c1735500vGO10 != null) {
                c1735500vGO10.LLIZ = true;
                C426750GoL.LJIIIZ(c1735500vGO10, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, null, false, 29);
                C20632315oP c20632315oP = c1735500vGO10.LL;
                if (c20632315oP != null) {
                    C426750GoL.LJIIIZ(c20632315oP, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
                }
                C421980Gge c421980Gge = c1735500vGO10.LLILLJJLI;
                if (c421980Gge != null) {
                    C426750GoL.LJIIIZ(c421980Gge, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 24);
                }
                C197039127h c197039127h = c1735500vGO10.LLILLL;
                if (c197039127h != null) {
                    c197039127h.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
                    C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 24);
                }
                c1735500vGO10.requestLayout();
            }
            TuxIconView tuxIconView3 = this.LLL;
            if (tuxIconView3 != null) {
                C426750GoL.LJIIIZ(tuxIconView3, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49))), false, 23);
            }
        }
        C736680Sv4.LJIIIZ(this, ep(), new C2217381BqS() { // from class: X.0gLR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1155490gAt) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.0gMA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1155490gAt) obj).LLILLJJLI);
            }
        }, null, new C487350J9h(), 12);
        InterestCardViewModel interestCardViewModelEp = ep();
        IInterestReselectionService iInterestReselectionService4 = interestCardViewModelEp.LL;
        if (iInterestReselectionService4 == null) {
            listLLIIII = C13BV.INSTANCE;
        } else {
            List<InterestTag> listLJJ = iInterestReselectionService4.LJJ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJ, 10));
            for (InterestTag interestTag : listLJJ) {
                String str = interestTag.id;
                arrayList.add(new InterestTag(str, interestTag.text, Boolean.valueOf(C13LP.LJJJJ(str, interestCardViewModelEp.LLILLJJLI))));
            }
            listLLIIII = C13LP.LLIIII(arrayList);
        }
        IInterestReselectionService iInterestReselectionService5 = this.LLJJL;
        if (iInterestReselectionService5 != null) {
            iLJJIFFI = iInterestReselectionService5.LJJIFFI();
        }
        C1735500vGO c1735500vGO11 = this.LLLF;
        if (c1735500vGO11 != null && this.LLJJL != null) {
            c1735500vGO11.setInterestTags(listLLIIII);
            c1735500vGO11.setOnTagSelectListener(new AwS643S0100000_29(this, 93));
            c1735500vGO11.setCurrentIndex(iLJJIFFI);
            c1735500vGO11.setPageIndexListener(new AwS602S0100000_23(this, 50));
        }
        kp(EnumC1486960onW.INIT);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        IInterestReselectionService iInterestReselectionService = this.LLJJL;
        if (iInterestReselectionService == null) {
            return;
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        iInterestReselectionService.LJI(aid);
        if (!hp()) {
            return;
        }
        this.LLJJL.LJIILLIIL();
        this.LLJJL.LJIJ(true);
        kp(EnumC1486960onW.START);
    }
}
