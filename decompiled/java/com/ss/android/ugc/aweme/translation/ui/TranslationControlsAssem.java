package com.ss.android.ugc.aweme.translation.ui;

import X.AbstractC738140SxQ;
import X.C017O;
import X.C01GW;
import X.C0QSJ;
import X.C0RD6;
import X.C0RDX;
import X.C0RJN;
import X.C0RR7;
import X.C0SCU;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19EG;
import X.C1AV3;
import X.C2180521AVm;
import X.C2217381BqS;
import X.C23250099c;
import X.C299210Bo7;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C693770RJf;
import X.C694180RKu;
import X.C694320RLi;
import X.C699500RcC;
import X.C700450Rdj;
import X.C704300Rjw;
import X.C704310Rjx;
import X.C704320Rjy;
import X.C704330Rjz;
import X.C704340Rk0;
import X.C704350Rk1;
import X.C704400Rk6;
import X.C704420Rk8;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.translation.delegates.TranslationControlsAbility;
import com.ss.android.ugc.aweme.translation.service.ITranslationExService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class TranslationControlsAssem extends BaseCellSlotComponent<TranslationControlsAssem> implements ComponentPriorityProtocol, TranslationControlsAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public FrameLayout LLJZIJLIL;
    public boolean LLLFF;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C704350Rk1(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C704330Rjz(this));
    public final C01GW LLJZ = C452501pT.LIZIZ(new C704340Rk0(this));
    public final C704420Rk8 LLL = new C704420Rk8(this);
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C704400Rk6());
    public final TranslationControlsAssem$descExpandModeProtocol$1 LLLFFI = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem$descExpandModeProtocol$1
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TranslationControlsAssem.class, "translationStatusViewModel", "getTranslationStatusViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_see_translation";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9n;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TranslationStatusScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TranslationStatusScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TranslationStatusScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1116860028) {
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final InteractAreaCommonAbility Bp() {
        return (InteractAreaCommonAbility) this.LLJLLL.getValue();
    }

    @Override // X.C0RJL
    public final boolean oh() {
        ITranslationExService iTranslationExService = (ITranslationExService) PluggableExtentionKt.pluggableSpi$default(ITranslationExService.class, false, false, false, 14, null);
        if (iTranslationExService == null) {
            return true;
        }
        iTranslationExService.LIZ();
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        Aweme aweme = videoItemParams != null ? videoItemParams.getAweme() : null;
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, false)) {
            C1558520qew.LIZLLL(this);
        }
        C1554610qYd.LIZJ((InterfaceC665370Q7z) this.LLJLLIL.getValue(), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLLFFI));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        C19EG c19egLIZ = c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZ() : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str)) {
            C01GW c01gw = C694320RLi.LIZ;
            C694320RLi.LIZ(LJJIJL(), null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        View viewLJJIJL = LJJIJL();
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        C426750GoL.LJIIIZ(viewLJJIJL, null, null, null, Integer.valueOf(i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 23);
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            C426750GoL.LJIIIZ(frameLayout, null, null, null, 0, false, 23);
        }
    }

    public final void Ep(boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        } else {
            C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(1, "Feed", null, "translation_controls"));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_component_clickable", new C704320Rjy(this));
    }

    @Override // com.ss.android.ugc.aweme.translation.delegates.TranslationControlsAbility
    public final void gh(boolean z) {
        Object obj;
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, false)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C704310Rjx(this, z, null), 3);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(0, getContentView());
        this.LLJZIJLIL = (FrameLayout) getContentView().findViewById(R.id.yj5);
        C723830SaL.LIZ(this, null, new C704300Rjw(this));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C19EG c19egLIZ;
        InteractAreaCommonAbility interactAreaCommonAbilityBp;
        VideoItemParams videoItemParams2 = videoItemParams;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            c19egLIZ = c0rjnLIZIZ.LIZ();
        } else {
            c19egLIZ = null;
        }
        if (C0RR7.LIZIZ(c19egLIZ, videoItemParams2.getAweme(), videoItemParams2.mEventType)) {
            C01GW c01gw = C694320RLi.LIZ;
            View viewLJJIJL = LJJIJL();
            C01GW<Integer> c01gw2 = ConstraintSizeVM.LL;
            C694320RLi.LIZIZ(C693770RJf.LIZ(), viewLJJIJL, true);
        }
        if (C017O.LIZ()) {
            C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
            Aweme aweme = videoItemParams2.getAweme();
            c299210Bo7.getClass();
            if (C299210Bo7.LIZ(aweme, false)) {
                this.LLLFF = false;
                Ep(false);
            }
        }
        if (C0SCU.LIZIZ(videoItemParams2.getAweme())) {
            C299210Bo7 c299210Bo72 = C299210Bo7.LIZ;
            Aweme aweme2 = videoItemParams2.getAweme();
            c299210Bo72.getClass();
            if (!C299210Bo7.LIZ(aweme2, false) && (interactAreaCommonAbilityBp = Bp()) != null) {
                interactAreaCommonAbilityBp.zB1(this);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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
}
