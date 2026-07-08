package com.ss.android.ugc.feed.platform.cell;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HHT;
import X.C0QSJ;
import X.C0R7I;
import X.C0R7J;
import X.C0R9T;
import X.C0R9V;
import X.C0R9W;
import X.C0R9X;
import X.C0R9Y;
import X.C0RDX;
import X.C0RIG;
import X.C0RIJ;
import X.C0RIK;
import X.C0RIL;
import X.C0RIM;
import X.C0RIN;
import X.C0RIT;
import X.C0RJN;
import X.C0RPZ;
import X.C0RQA;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1AV2;
import X.C2217381BqS;
import X.C293910BfZ;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C690430R6j;
import X.C692070RCr;
import X.C692090RCt;
import X.C693570RIl;
import X.C693720RJa;
import X.C698300RaG;
import X.C698980RbM;
import X.C699000RbO;
import X.C708910RrN;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C726240SeE;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC706820Ro0;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC699030RbR;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.feed.platform.ab.NarrowScreenOptConfig;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class RootCellComponent extends BaseCellContentComponent<RootCellComponent> implements RootCellCommonAbility, InterfaceC699030RbR, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C690430R6j LLJJJJLIIL;
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0RIK());
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C0RIL());
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoShareViewModel.class), new C0RIN());
    public final LinkedHashMap<String, View> LLJLIL = new LinkedHashMap<>();
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public C692090RCt LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RootCellComponent.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RootCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -647875625) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final Integer Ia() {
        AdaptionPaddingValues adaptionPaddingValuesNs0;
        Integer numIa;
        if (!C293910BfZ.LIZIZ) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
            if (iVideoCellAbility != null) {
                return iVideoCellAbility.Ia();
            }
            return null;
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJLLL.getValue();
        int top = 0;
        int iIntValue = (iVideoCellAbility2 == null || (numIa = iVideoCellAbility2.Ia()) == null) ? 0 : numIa.intValue();
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJLLIL.getValue();
        if (cellAdaptionComponentAbility != null && (adaptionPaddingValuesNs0 = cellAdaptionComponentAbility.Ns0()) != null) {
            top = adaptionPaddingValuesNs0.getTop();
        }
        return Integer.valueOf(iIntValue + top);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Vu() {
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJLLL.getValue();
        if (iVideoCellAbility != null) {
            iVideoCellAbility.Vu();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final Integer br() {
        AdaptionPaddingValues adaptionPaddingValuesNs0;
        Integer numBr;
        if (!C293910BfZ.LIZIZ) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
            if (iVideoCellAbility != null) {
                return iVideoCellAbility.br();
            }
            return null;
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJLLL.getValue();
        int top = 0;
        int iIntValue = (iVideoCellAbility2 == null || (numBr = iVideoCellAbility2.br()) == null) ? 0 : numBr.intValue();
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJLLIL.getValue();
        if (cellAdaptionComponentAbility != null && (adaptionPaddingValuesNs0 = cellAdaptionComponentAbility.Ns0()) != null) {
            top = adaptionPaddingValuesNs0.getTop();
        }
        return Integer.valueOf(iIntValue + top);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C01GW c01gw = C692070RCr.LIZ;
        this.LLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "RootCellComponent", "iterateBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZ(this.LLL, String.valueOf(jm().hashCode()), null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void H() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).H();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).LJLLLL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final String ds0() {
        return String.valueOf(jm().hashCode());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).onDestroyView();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) this.LLJZIJLIL.getValue();
        if (iFeedDebugService != null) {
            iFeedDebugService.LJJIIJ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    public RootCellComponent(C690430R6j c690430R6j) {
        this.LLJJJJLIIL = c690430R6j;
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C0RIG(c19719912DlLIZ), null, new C0RIM());
        this.LLJLL = C452501pT.LIZIZ(new C0R9T(this));
        this.LLJLLIL = C452501pT.LIZIZ(new C0R7I(this));
        this.LLJLLL = C452501pT.LIZIZ(new C0R7J(this));
        this.LLJZ = C452501pT.LIZIZ(new C0R9X(this));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(252));
    }

    @Override // X.InterfaceC699030RbR
    public final void Bb(String str) {
        Object obj;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null && !c0rjnLIZIZ.LJFF) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (TextUtils.equals(((VideoItemParams) obj).getAweme().getAid(), str)) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLJJL.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(new C0R9W(str));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Ew2(ViewGroup viewGroup) {
        C0RIJ.LIZ(viewGroup, (ViewGroup) LJJIJL(), C1558520qew.LJIIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility != null) {
            iVideoCellAbility.H8(onGlobalLayoutListener);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Me(boolean z) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractAreaCommonAbility.class, null);
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Me(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Q5(String str) {
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJLLL.getValue();
        if (iVideoCellAbility != null) {
            iVideoCellAbility.Q5(str);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void bE1(int i) {
        LLLI(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void eO2(int i) {
        LJLIIIL(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility != null) {
            iVideoCellAbility.ek(onGlobalLayoutListener);
        }
    }

    public final void hp(String str) {
        InteractBottomBarAbility interactBottomBarAbility = (InteractBottomBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractBottomBarAbility.class, null);
        if (interactBottomBarAbility != null) {
            interactBottomBarAbility.M40(str);
        }
        InteractBottomBarAbility interactBottomBarAbility2 = (InteractBottomBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractBottomBarAbility.class, null);
        if (interactBottomBarAbility2 != null) {
            interactBottomBarAbility2.WG(str);
        }
    }

    public final void ip(C0RQA c0rqa) {
        int i = C0RIT.LIZ[c0rqa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((VideoPlayViewModel) this.LLJJLIIIJLLLLLLLZ.getValue()).zQ2();
                    return;
                }
                throw new C1954807lC();
            }
            ((VideoPlayViewModel) this.LLJJLIIIJLLLLLLLZ.getValue()).xQ2(4);
            ((VideoShareViewModel) this.LLJL.getValue()).zQ2();
            return;
        }
        ((VideoPlayViewModel) this.LLJJLIIIJLLLLLLLZ.getValue()).yQ2(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final View jD(String str) {
        return this.LLJLIL.get(str);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void mL0(ViewGroup viewGroup) {
        Object obj;
        InteractCommonLogicAbility interactCommonLogicAbility;
        C708910RrN c708910RrN;
        InteractCommonLogicAbility interactCommonLogicAbility2;
        C708910RrN c708910RrN2;
        TextView textView;
        String string;
        Resources resources;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        ViewGroup viewGroup2 = (ViewGroup) LJJIJL();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (viewGroup != null) {
            if (AwemeExtKt.isScheduleVideo(aweme)) {
                if (AwemeExtKt.isScheduleVideo(aweme) && (textView = (TextView) viewGroup.findViewById(R.id.tv_schedule_time)) != null) {
                    Context context = viewGroup.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        string = resources.getString(2131846842, C0RIJ.LIZ.format(Long.valueOf(aweme.getScheduleTime() * 1000)));
                    } else {
                        string = null;
                    }
                    textView.setText(string);
                }
                C786410Ut5.LJLZ(0, viewGroup);
                TuxTextView tuxTextView = (TuxTextView) C726240SeE.LIZIZ(viewGroup2, null, R.id.tv_schedule_video_watermark, R.id.vs_tv_schedule_video_watermark);
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                View viewFindViewById = viewGroup2.findViewById(R.id.tv_schedule_video_watermark);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
                View viewFindViewById2 = viewGroup2.findViewById(R.id.fu8);
                if ((viewFindViewById2 instanceof C708910RrN) && (c708910RrN2 = (C708910RrN) viewFindViewById2) != null) {
                    c708910RrN2.setGroupClickable(false);
                }
                if (interfaceC665370Q7zLJIIL != null && (interactCommonLogicAbility2 = (InteractCommonLogicAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, InteractCommonLogicAbility.class, null)) != null) {
                    interactCommonLogicAbility2.cl1(false);
                }
                View viewFindViewById3 = viewGroup2.findViewById(R.id.fu8);
                if ((viewFindViewById3 instanceof C708910RrN) && (c708910RrN = (C708910RrN) viewFindViewById3) != null) {
                    c708910RrN.setHintTextRes(2131846845);
                }
                if (interfaceC665370Q7zLJIIL != null && (interactCommonLogicAbility = (InteractCommonLogicAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, InteractCommonLogicAbility.class, null)) != null) {
                    interactCommonLogicAbility.NF1();
                    return;
                }
                return;
            }
            C0RIJ.LIZ(viewGroup, viewGroup2, interfaceC665370Q7zLJIIL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "RootCellComponent", "onViewCreated");
        C723830SaL.LIZ(this, null, new C0R9V(this));
        CellConfigurationProtocol cellConfigurationProtocol = (CellConfigurationProtocol) this.LLJLL.getValue();
        if (cellConfigurationProtocol != null) {
            cellConfigurationProtocol.NS1(this, this.LLJJJJLIIL.LL);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0R9d
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, new C0R9Y(), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RFK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILZ;
                }
            }, null, AFwS294S0000000_11.get$arr$(196), 6);
            C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
            return;
        }
        "No configuration matching the CellScene!".toString();
        throw new IllegalArgumentException("No configuration matching the CellScene!");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void p(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).p(i);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ((C698980RbM) this.LLJZ.getValue()).LIZ(new C699000RbO(0, videoItemParams.getAweme().getAid()));
        if (!C693570RIl.LIZIZ()) {
            NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) C693570RIl.LIZIZ.getValue();
            if (narrowScreenOptConfig == null) {
                narrowScreenOptConfig = C693570RIl.LIZJ;
            }
            int i = narrowScreenOptConfig.adaptionTarget;
            NarrowScreenOptConfig.Companion.getClass();
            if (i != NarrowScreenOptConfig.ONLY_NARROW) {
                return;
            }
        }
        ConstraintSizeVM constraintSizeVM = (ConstraintSizeVM) this.LLJLILLLLZIIL.getValue(this, LLLF[0]);
        constraintSizeVM.getClass();
        constraintSizeVM.withState(new C693720RJa(constraintSizeVM));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final View Qg(String str, boolean z) {
        View view;
        if (!TextUtils.isEmpty(str)) {
            if (this.LLJLIL.containsKey(str)) {
                view = this.LLJLIL.get(str);
            } else {
                C708910RrN c708910RrN = new C708910RrN(LJJIJL().getContext(), null);
                C786410Ut5.i7(c708910RrN, new ViewGroup.MarginLayoutParams(-1, -2));
                String str2 = C0RPZ.LJIIJJI;
                c708910RrN.setId(R.id.elw);
                C786410Ut5.W(c708910RrN, 8);
                this.LLJLIL.put(str, c708910RrN);
                view = c708910RrN;
            }
            if (z && view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            return view;
        }
        throw new IllegalStateException("BaseCellPlaceHolderComponent slotView's tag must not be null. ");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }

    public final void ep(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList2 = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
        AssemSupervisor assemSupervisorLJ2 = C724240Sb0.LJ(this);
        if (assemSupervisorLJ2 != null && (copyOnWriteArrayList = assemSupervisorLJ2.LLJILLL) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                if (abstractC738140SxQ2 instanceof BaseContainer) {
                    arrayList2.add(abstractC738140SxQ2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((BaseContainer) it3.next()).ep(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void bd2(EnumC706820Ro0 enumC706820Ro0, boolean z, C698300RaG c698300RaG, C1AV2 c1av2) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractAreaCommonAbility.class, null);
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Xz2(enumC706820Ro0, z, c698300RaG, false, c1av2);
        }
    }
}
