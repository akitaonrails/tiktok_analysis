package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui;

import X.AbstractC681090Qnb;
import X.C01GW;
import X.C098200Yq;
import X.C0BT7;
import X.C0J3D;
import X.C0QER;
import X.C0QLY;
import X.C0QNH;
import X.C0QR7;
import X.C0QSJ;
import X.C0QVQ;
import X.C0QWQ;
import X.C0QWU;
import X.C0QWV;
import X.C0QX8;
import X.C0R4H;
import X.C0WZX;
import X.C10VO;
import X.C123100dR;
import X.C128Y;
import X.C1308910kAL;
import X.C1357120lQ6;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C1947807k4;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C19U1;
import X.C1AF0;
import X.C20587115h7;
import X.C20632315oP;
import X.C20642515q3;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C23250099c;
import X.C306840C1a;
import X.C339190DRl;
import X.C418060GaK;
import X.C418440Gaw;
import X.C427110Gov;
import X.C452501pT;
import X.C616540OGe;
import X.C640270P9l;
import X.C671680QWg;
import X.C671700QWi;
import X.C671720QWk;
import X.C671870QWz;
import X.C672250QYl;
import X.C673150Qan;
import X.C674040QcE;
import X.C674050QcF;
import X.C674320Qcg;
import X.C674380Qcm;
import X.C674620QdA;
import X.C674630QdB;
import X.C679340Qkm;
import X.C680790Qn7;
import X.C687700QyG;
import X.C689810R3z;
import X.C786410Ut5;
import X.C814420VxA;
import X.ChoreographerFrameCallbackC674130QcN;
import X.EnumC671670QWf;
import X.InterfaceC1146704e9;
import X.InterfaceC1173910geb;
import X.InterfaceC1584740rLE;
import X.InterfaceC668720QKw;
import X.InterfaceC668980QLw;
import X.InterfaceC669220QMu;
import X.InterfaceC671770QWp;
import X.InterfaceC674400Qco;
import X.InterfaceC674710QdJ;
import X.InterfaceC687730QyJ;
import X.RunnableC514801zW;
import Y.ACListenerS145S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS17S0201000_10;
import Y.ATListenerS444S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.EcSearchMiddlePagerContainerScope;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcSearchMiddleSearchBarAbility;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddlePagerContainerFragment extends AmeBaseFragment implements IEcSearchMiddlePageContextAbility, IEcSearchMiddleSearchBarAbility, InterfaceC669220QMu, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9JSwoLSHELIOSM2ZiQlZzo6ZgAvGioyOiYkBCY3LCkpGS40LTcPJiEnKSwiLD0VOiQrJCo9PA==";
    public final InterfaceC668720QKw LL;
    public View LLILLJJLI;
    public View LLILLL;
    public TuxIconView LLILZ;
    public C19U1 LLILZIL;
    public View LLILZLL;
    public C418060GaK LLIZ;
    public TuxIconView LLIZLLLIL;
    public EditText LLJ;
    public C1357120lQ6 LLJI;
    public C1357120lQ6 LLJIJIL;
    public LinearLayout LLJILJIL;
    public TuxIconView LLJILJILJ;
    public View LLJILLL;
    public LinearLayout LLJJ;
    public TuxIconView LLJJI;
    public ViewGroup LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public ChoreographerFrameCallbackC674130QcN LLJJIJIL;
    public C427110Gov LLJJJ;
    public C20632315oP LLJJJIL;
    public C0QER LLJJJJ;
    public C0QWQ LLJJJJJIL;
    public C674040QcE LLJJJJLIIL;
    public EcSearchBarAsrHelper LLJJL;
    public final C671700QWi LLJJLIIIJLLLLLLLZ;
    public C674320Qcg LLJL;
    public EcSearchIntermediateViewModelNew LLJLIL;
    public C1361400lX0 LLJLILLLLZIIL;
    public C674380Qcm LLJLL;
    public C0QWU LLJLLIL;
    public C671720QWk LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    public EcSearchMiddlePagerContainerFragment() {
        this(null);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{EcSearchMiddlePagerContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcSearchMiddlePagerContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcSearchMiddlePagerContainerScope.class);
        return arrayList;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility
    public final void DG2() {
        C1357120lQ6 c1357120lQ6;
        C1357120lQ6 c1357120lQ62 = this.LLJI;
        if (c1357120lQ62 == null || c1357120lQ62.getVisibility() != 0 || (c1357120lQ6 = this.LLJI) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c1357120lQ6, new ARunnableS110S0100000_10(this, 187), 200L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC669220QMu MR() {
        /*
            r5 = this;
            X.0QWQ r0 = r5.LLJJJJJIL
            r4 = 0
            if (r0 == 0) goto L2f
            androidx.fragment.app.FragmentManager r3 = X.C0QVQ.LIZ(r5)
            java.util.List<X.0QWf> r1 = r0.LLJIJIL
            X.0QWf r0 = X.EnumC671670QWf.NORMAL
            int r2 = r1.indexOf(r0)
            if (r3 == 0) goto L2f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r0 = 102(0x66, float:1.43E-43)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            androidx.fragment.app.Fragment r1 = r3.LJJJJZI(r0)
        L27:
            boolean r0 = r1 instanceof X.InterfaceC669220QMu
            if (r0 == 0) goto L2e
            r4 = r1
            X.0QMu r4 = (X.InterfaceC669220QMu) r4
        L2e:
            return r4
        L2f:
            r1 = r4
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment.MR():X.0QMu");
    }

    public final boolean NR() {
        return ((Boolean) this.LLL.getValue()).booleanValue();
    }

    public final void PR() {
        int i;
        SearchResultFragmentNew searchResultFragmentNewLJI;
        InterfaceC671770QWp interfaceC671770QWp;
        Editable editableLLZ;
        String string;
        String string2;
        CharSequence hint;
        EcSearchBarAsrHelper ecSearchBarAsrHelper;
        C674630QdB c674630QdB;
        String string3;
        Editable editableLLZ2;
        C20632315oP c20632315oP = this.LLJJJIL;
        boolean z = false;
        int currentItem = c20632315oP != null ? c20632315oP.getCurrentItem() : 0;
        C671870QWz.LIZ.getClass();
        EnumC671670QWf enumC671670QWfLIZ = C671870QWz.LIZ(currentItem);
        if (enumC671670QWfLIZ == null || (i = C671680QWg.LIZ[enumC671670QWfLIZ.ordinal()]) == -1) {
            C1AF0.LIZJ("EcSearchMiddlePagerContainerFragment#onSearchTvAction, error position: " + currentItem);
            return;
        }
        if (i == 1) {
            InterfaceC668720QKw interfaceC668720QKw = this.LL;
            if (interfaceC668720QKw == null || (searchResultFragmentNewLJI = interfaceC668720QKw.LJI()) == null) {
                return;
            }
            searchResultFragmentNewLJI.eT();
            return;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        if (C672250QYl.LIZLLL() && (ecSearchBarAsrHelper = this.LLJJL) != null && (c674630QdB = ecSearchBarAsrHelper.LJ) != null) {
            C1357120lQ6 c1357120lQ6 = this.LLJI;
            if (c1357120lQ6 == null || (editableLLZ2 = C2204961BRm.LLZ(c1357120lQ6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null))) == null || (string3 = editableLLZ2.toString()) == null) {
                string3 = "";
            }
            c674630QdB.LJIILL = string3;
            C674620QdA.LIZJ(c674630QdB);
        }
        C1357120lQ6 c1357120lQ62 = this.LLJI;
        String string4 = (c1357120lQ62 == null || (hint = c1357120lQ62.getHint()) == null) ? null : hint.toString();
        C1357120lQ6 c1357120lQ63 = this.LLJI;
        if (c1357120lQ63 == null || (editableLLZ = C2204961BRm.LLZ(c1357120lQ63, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null))) == null || (string = editableLLZ.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null || string2.length() == 0) {
            z = true;
        } else {
            string4 = string2;
        }
        if (C123100dR.LIZ(string4)) {
            C128Y c128yLLLILZLLLI = this.LLJJJJJIL != null ? C0QWQ.LLLILZLLLI(C0QVQ.LIZ(this), currentItem) : null;
            if (!(c128yLLLILZLLLI instanceof InterfaceC671770QWp) || (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) == null) {
                return;
            }
            interfaceC671770QWp.NQ(z, string4, this.LLJLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9 A[Catch: all -> 0x010f, TryCatch #4 {all -> 0x010f, blocks: (B:4:0x0008, B:6:0x0013, B:8:0x0019, B:10:0x001d, B:11:0x001f, B:13:0x0028, B:15:0x002c, B:16:0x002e, B:18:0x0034, B:20:0x003a, B:22:0x003e, B:23:0x0040, B:25:0x0046, B:50:0x00ae, B:53:0x00b5, B:55:0x00b9, B:64:0x00e0, B:66:0x00e6, B:67:0x00e9, B:63:0x00d5, B:68:0x00ed, B:69:0x00f3, B:73:0x00fd, B:75:0x0103, B:77:0x0109, B:49:0x00a3, B:31:0x005f, B:33:0x0065, B:35:0x0074, B:37:0x0078, B:38:0x0082, B:43:0x0096, B:47:0x009e, B:41:0x008b, B:45:0x009a, B:60:0x00c4, B:61:0x00cc), top: B:153:0x0008, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR() {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment.RR():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility
    public final void rI0() {
        C1357120lQ6 c1357120lQ6 = this.LLJI;
        if (c1357120lQ6 != null) {
            c1357120lQ6.setText("");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility
    public final void wT1() {
        C1357120lQ6 c1357120lQ6 = this.LLJI;
        if (c1357120lQ6 == null || c1357120lQ6.getVisibility() != 0) {
            return;
        }
        KeyboardUtils.LIZIZ(this.LLJI);
        C1357120lQ6 c1357120lQ62 = this.LLJI;
        if (c1357120lQ62 != null) {
            c1357120lQ62.setCursorVisible(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcSearchMiddleSearchBarAbility
    public final boolean yJ2() {
        C674040QcE c674040QcE = this.LLJJJJLIIL;
        return c674040QcE != null && c674040QcE.LIZIZ();
    }

    @Override // X.InterfaceC669220QMu
    public final void Pm() {
        InterfaceC669220QMu interfaceC669220QMuMR = MR();
        if (interfaceC669220QMuMR != null) {
            interfaceC669220QMuMR.Pm();
        }
    }

    @Override // X.InterfaceC669220QMu
    public final int WC() {
        InterfaceC669220QMu interfaceC669220QMuMR = MR();
        if (interfaceC669220QMuMR != null) {
            return interfaceC669220QMuMR.WC();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IEcSearchMiddlePageContextAbility.class, null);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(parentFragment, null), IEcSearchMiddleSearchBarAbility.class, null);
        }
        C674320Qcg c674320Qcg = this.LLJL;
        if (c674320Qcg != null) {
            c674320Qcg.LIZ.LJI(c674320Qcg.LJIIIIZZ);
            c674320Qcg.LIZIZ.removeOnTabSelectedListener((InterfaceC1584740rLE) c674320Qcg.LJIIIZ);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EcSearchMiddlePagerContainerFragment.class.getName());
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcSearchMiddleSearchBarAbility
    public final View JD2() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility
    public final EditText ul0() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0QWi] */
    public EcSearchMiddlePagerContainerFragment(InterfaceC668720QKw interfaceC668720QKw) {
        this.LL = interfaceC668720QKw;
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC674710QdJ() { // from class: X.0QWi
            @Override // X.InterfaceC674710QdJ
            public final void LIZ(C674650QdD c674650QdD) throws Throwable {
                EnumC674020QcC enumC674020QcC;
                Activity activityLIZ;
                Activity activityLIZIZ;
                Editable editableLLZ = null;
                Activity activity = null;
                switch (C674700QdI.LIZ[c674650QdD.LIZ.ordinal()]) {
                    case 1:
                        C674040QcE c674040QcE = this.LIZ.LLJJJJLIIL;
                        if (c674040QcE != null && (enumC674020QcC = c674040QcE.LIZIZ) == EnumC674020QcC.AI_SEARCH) {
                            c674040QcE.LIZ(enumC674020QcC, EnumC674020QcC.AI_SEARCH_RECORDING);
                            return;
                        }
                        return;
                    case 2:
                        C674040QcE c674040QcE2 = this.LIZ.LLJJJJLIIL;
                        if (c674040QcE2 != null && c674040QcE2.LIZIZ.isRecording()) {
                            c674040QcE2.LIZ(c674040QcE2.LIZIZ, EnumC674020QcC.AI_SEARCH_TRANSCRIBING);
                            return;
                        }
                        return;
                    case 3:
                        C1357120lQ6 c1357120lQ6 = this.LIZ.LLJIJIL;
                        if (c1357120lQ6 != null) {
                            c1357120lQ6.setHint(C20642515q3.LJI(2131857237));
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                        StringBuilder sb = new StringBuilder();
                        C1357120lQ6 c1357120lQ62 = this.LIZ.LLJI;
                        if (c1357120lQ62 != null) {
                            editableLLZ = C2204961BRm.LLZ(c1357120lQ62, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null));
                        }
                        sb.append((Object) editableLLZ);
                        sb.append(c674650QdD.LIZJ);
                        String string = sb.toString();
                        C1357120lQ6 c1357120lQ63 = this.LIZ.LLJI;
                        if (c1357120lQ63 != null) {
                            c1357120lQ63.setText(string);
                        }
                        C674630QdB c674630QdB = c674650QdD.LIZIZ;
                        if (c674630QdB != null) {
                            c674630QdB.LJIIL = string;
                        }
                        C674040QcE c674040QcE3 = this.LIZ.LLJJJJLIIL;
                        if (c674040QcE3 != null && c674040QcE3.LIZIZ.isVoiceFlow()) {
                            c674040QcE3.LIZ(c674040QcE3.LIZIZ, EnumC674020QcC.AI_SEARCH);
                            return;
                        }
                        return;
                    case 6:
                        C674040QcE c674040QcE4 = this.LIZ.LLJJJJLIIL;
                        if (c674040QcE4 != null && c674040QcE4.LIZIZ.isVoiceFlow()) {
                            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                            } else {
                                activityLIZ = null;
                            }
                            if (activityLIZ instanceof C19EG) {
                                activity = activityLIZ;
                            }
                            if (activity != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJFF(R.raw.icon_x_mark_circle_fill);
                                c1389890mGx.LJII(R.attr.a1h);
                                c1389890mGx.LJIIIZ(2131857240);
                                c1389890mGx.LJIIJJI();
                            }
                            C674630QdB c674630QdB2 = c674650QdD.LIZIZ;
                            if (c674630QdB2 != null) {
                                c674630QdB2.LJIIJ = 1;
                                c674630QdB2.LJIIJJI = C20642515q3.LJI(2131857240);
                                C674620QdA.LIZLLL(c674630QdB2);
                            }
                        }
                        C674040QcE c674040QcE5 = this.LIZ.LLJJJJLIIL;
                        if (c674040QcE5 != null) {
                            c674040QcE5.LIZJ();
                            return;
                        }
                        return;
                    case 7:
                        C674040QcE c674040QcE6 = this.LIZ.LLJJJJLIIL;
                        if (c674040QcE6 != null) {
                            c674040QcE6.LIZJ();
                            return;
                        }
                        return;
                    default:
                        throw new C1954807lC();
                }
            }

            @Override // X.InterfaceC674710QdJ
            public final void LIZIZ(List<Float> list) {
                C674040QcE c674040QcE = this.LIZ.LLJJJJLIIL;
                if (c674040QcE != null) {
                    c674040QcE.LJ(list);
                }
            }

            @Override // X.InterfaceC674710QdJ
            public final void t3(C674630QdB c674630QdB) {
                InterfaceC671770QWp interfaceC671770QWp;
                EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LIZ;
                C0QWQ c0qwq = ecSearchMiddlePagerContainerFragment.LLJJJJJIL;
                C128Y c128yLLLJ = null;
                if (c0qwq != null) {
                    c128yLLLJ = c0qwq.LLLJ(C0QVQ.LIZ(ecSearchMiddlePagerContainerFragment));
                }
                if ((c128yLLLJ instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLJ) != null) {
                    interfaceC671770QWp.t3(c674630QdB);
                }
            }
        };
        this.LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 38));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 36));
        this.LLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 37));
    }

    public final void OR(String str) {
        View view;
        SearchResultFragmentNew searchResultFragmentNewLJI;
        View view2;
        if (str != null && str.length() != 0) {
            C339190DRl.LIZLLL(this.LLJILJILJ);
            C0QWU c0qwu = this.LLJLLIL;
            LinearLayout linearLayout = this.LLJILJIL;
            EditText editText = this.LLJ;
            if (c0qwu != null && linearLayout != null && editText != null) {
                editText.setPaddingRelative(0, 0, 0, 0);
                C339190DRl.LIZIZ(linearLayout);
            }
            if (NR() && (view2 = this.LLJILLL) != null) {
                C339190DRl.LIZLLL(view2);
            }
        } else {
            C339190DRl.LIZIZ(this.LLJILJILJ);
            RR();
            C339190DRl.LIZLLL(this.LLJILJIL);
            if (NR() && (view = this.LLJILLL) != null) {
                C339190DRl.LIZIZ(view);
            }
        }
        InterfaceC668720QKw interfaceC668720QKw = this.LL;
        if (interfaceC668720QKw != null && (searchResultFragmentNewLJI = interfaceC668720QKw.LJI()) != null) {
            if (str == null) {
                str = "";
            }
            searchResultFragmentNewLJI.ZS(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility
    public final void TW1(C674380Qcm c674380Qcm) {
        this.LLJLL = c674380Qcm;
        C1357120lQ6 c1357120lQ6 = this.LLJI;
        if (c1357120lQ6 != null) {
            c1357120lQ6.setHint(c674380Qcm.LIZJ);
        }
    }

    @Override // X.InterfaceC669220QMu
    public final void cI(SearchSugEntity searchSugEntity) {
        InterfaceC669220QMu interfaceC669220QMuMR = MR();
        if (interfaceC669220QMuMR != null) {
            interfaceC669220QMuMR.cI(searchSugEntity);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility
    public final void ly1(Word word) {
        String strVR;
        EditText editText;
        CharSequence hint;
        SearchResultFragmentNew searchResultFragmentNewLJI;
        InterfaceC668720QKw interfaceC668720QKw = this.LL;
        String string = null;
        if (interfaceC668720QKw != null && (searchResultFragmentNewLJI = interfaceC668720QKw.LJI()) != null) {
            strVR = searchResultFragmentNewLJI.VR();
        } else {
            strVR = null;
        }
        EditText editText2 = this.LLJ;
        if (editText2 != null && (hint = editText2.getHint()) != null) {
            string = hint.toString();
        }
        if (Intrinsics.LJFF(strVR, string) && C123100dR.LIZ(word.getWord()) && (editText = this.LLJ) != null) {
            editText.setHint(word.getWord());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJJJJ = C640270P9l.LIZJ(this, getActivity());
            this.LLJLIL = (EcSearchIntermediateViewModelNew) C679340Qkm.LIZIZ(this, activity).get(EcSearchIntermediateViewModelNew.class);
        }
    }

    @Override // X.InterfaceC669220QMu
    public final void uy(SearchSugEntity searchSugEntity) {
        InterfaceC669220QMu interfaceC669220QMuMR = MR();
        if (interfaceC669220QMuMR != null) {
            interfaceC669220QMuMR.uy(searchSugEntity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0QLY c0qlyLJ;
        View viewLT;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        SearchResultFragmentNew searchResultFragmentNewLJI;
        String strLJJIFFI;
        super.onViewCreated(view, bundle);
        TuxIconView tuxIconView = null;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IEcSearchMiddlePageContextAbility.class, null, null);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(parentFragment, null), this, IEcSearchMiddleSearchBarAbility.class, null, null);
        }
        this.LLILLL = view.findViewById(R.id.gh0);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.ggz);
        this.LLILZIL = (C19U1) view.findViewById(R.id.gh1);
        this.LLILZLL = view.findViewById(R.id.u7c);
        this.LLIZ = (C418060GaK) view.findViewById(R.id.ard);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.kp6);
        this.LLJ = (EditText) view.findViewById(R.id.u9v);
        this.LLJI = (C1357120lQ6) view.findViewById(R.id.ggv);
        this.LLJIJIL = (C1357120lQ6) view.findViewById(R.id.ggu);
        this.LLJILJIL = (LinearLayout) view.findViewById(R.id.jp2);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.cor);
        this.LLJJ = (LinearLayout) view.findViewById(R.id.ng_);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.ggw);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.ggx);
        this.LLJJIJIL = (ChoreographerFrameCallbackC674130QcN) view.findViewById(R.id.ggy);
        this.LLJJJ = (C427110Gov) view.findViewById(R.id.tv_search_textview_enhanced);
        this.LLJJJIL = (C20632315oP) view.findViewById(R.id.ggd);
        C339190DRl.LIZLLL(this.LLILLL);
        final C19U1 c19u1 = this.LLILZIL;
        if (c19u1 != null) {
            c19u1.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0QX2
                @Override // X.InterfaceC1586460rO0
                public final void ih(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    C671870QWz c671870QWz = C671870QWz.LIZ;
                    Context context = c19u1.getContext();
                    c671870QWz.getClass();
                    C671870QWz.LIZJ(context, c19u0, true);
                }

                @Override // X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                    C671870QWz c671870QWz = C671870QWz.LIZ;
                    Context context = c19u1.getContext();
                    c671870QWz.getClass();
                    C671870QWz.LIZJ(context, c19u0, false);
                }
            });
        }
        InterfaceC668720QKw interfaceC668720QKw = this.LL;
        C671870QWz.LIZ.getClass();
        C0QWQ c0qwq = new C0QWQ(interfaceC668720QKw, C671870QWz.LIZIZ(), this);
        this.LLJJJJJIL = c0qwq;
        C20632315oP c20632315oP = this.LLJJJIL;
        if (c20632315oP != null) {
            c20632315oP.setAdapter(c0qwq);
        }
        final C19U1 c19u12 = this.LLILZIL;
        C20632315oP c20632315oP2 = this.LLJJJIL;
        if (c19u12 != null && c20632315oP2 != null) {
            new C20587115h7(c19u12, c20632315oP2, new InterfaceC1173910geb() { // from class: X.0QX1
                @Override // X.InterfaceC1173910geb
                public final void LIZ(C19U0 c19u0, int i) {
                    C671870QWz.LIZ.getClass();
                    String strLJFF = C671870QWz.LJFF((EnumC671670QWf) ListProtector.get(C671870QWz.LIZIZ(), i));
                    c19u0.LJFF(strLJFF);
                    C671870QWz.LIZLLL(this.LIZ.getContext(), c19u0, strLJFF, i, c19u12.getSelectedTabPosition());
                }
            }, 0).LIZ();
            C674320Qcg c674320Qcg = new C674320Qcg(c20632315oP2, c19u12, new InterfaceC674400Qco() { // from class: X.0QWK
                @Override // X.InterfaceC674400Qco
                public final void LIZ(int i, EnumC674310Qcf enumC674310Qcf) throws Throwable {
                    Editable editableLLZ;
                    Editable editableLLZ2;
                    Editable editableLLJILLL;
                    Editable editableLLJILLL2;
                    C674040QcE c674040QcE;
                    EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LIZ;
                    ecSearchMiddlePagerContainerFragment.getClass();
                    C671870QWz.LIZ.getClass();
                    EnumC671670QWf enumC671670QWfLIZ = C671870QWz.LIZ(i);
                    if (enumC671670QWfLIZ != null) {
                        int length = 0;
                        if (C672250QYl.LIZLLL() && (c674040QcE = ecSearchMiddlePagerContainerFragment.LLJJJJLIIL) != null && c674040QcE.LIZIZ.isVoiceFlow()) {
                            EcSearchBarAsrHelper ecSearchBarAsrHelper = ecSearchMiddlePagerContainerFragment.LLJJL;
                            if (ecSearchBarAsrHelper != null) {
                                ecSearchBarAsrHelper.LIZIZ(true);
                            }
                            C674040QcE c674040QcE2 = ecSearchMiddlePagerContainerFragment.LLJJJJLIIL;
                            if (c674040QcE2 != null && c674040QcE2.LIZIZ.isRecording()) {
                                c674040QcE2.LIZ(c674040QcE2.LIZIZ, EnumC674020QcC.AI_SEARCH);
                            }
                        }
                        int i2 = C671680QWg.LIZ[enumC671670QWfLIZ.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                C1357120lQ6 c1357120lQ6 = ecSearchMiddlePagerContainerFragment.LLJI;
                                if (c1357120lQ6 != null) {
                                    EditText editText = ecSearchMiddlePagerContainerFragment.LLJ;
                                    if (editText != null) {
                                        editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null));
                                    } else {
                                        editableLLJILLL2 = null;
                                    }
                                    c1357120lQ6.setText(editableLLJILLL2);
                                }
                                C1357120lQ6 c1357120lQ62 = ecSearchMiddlePagerContainerFragment.LLJI;
                                if (c1357120lQ62 != null) {
                                    EditText editText2 = ecSearchMiddlePagerContainerFragment.LLJ;
                                    if (editText2 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null))) != null) {
                                        length = editableLLJILLL.length();
                                    }
                                    c1357120lQ62.setSelection(length);
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            EditText editText3 = ecSearchMiddlePagerContainerFragment.LLJ;
                            if (editText3 != null) {
                                C1357120lQ6 c1357120lQ63 = ecSearchMiddlePagerContainerFragment.LLJI;
                                if (c1357120lQ63 != null) {
                                    editableLLZ2 = C2204961BRm.LLZ(c1357120lQ63, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null));
                                } else {
                                    editableLLZ2 = null;
                                }
                                editText3.setText(editableLLZ2);
                            }
                            EditText editText4 = ecSearchMiddlePagerContainerFragment.LLJ;
                            if (editText4 != null) {
                                C1357120lQ6 c1357120lQ64 = ecSearchMiddlePagerContainerFragment.LLJI;
                                if (c1357120lQ64 != null && (editableLLZ = C2204961BRm.LLZ(c1357120lQ64, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWjvo42aUnhbg0gCfq3UJ7AUO4GPgr45Ze+LaWzOnDlYm4VC5RxO9g2f3hl40YcRV0JA==", null))) != null) {
                                    length = editableLLZ.length();
                                }
                                editText4.setSelection(length);
                            }
                        }
                    }
                    View view2 = this.LIZ.getView();
                    if (view2 != null) {
                        HandlerHook.viewPost(view2, new ARunnableS17S0201000_10(i, this.LIZ, enumC674310Qcf, 12));
                    }
                }

                @Override // X.InterfaceC674400Qco
                public final void LIZIZ(int i, EnumC674310Qcf enumC674310Qcf) {
                    InterfaceC671770QWp interfaceC671770QWp;
                    EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LIZ;
                    C128Y c128yLLLILZLLLI = null;
                    if (ecSearchMiddlePagerContainerFragment.LLJJJJJIL != null) {
                        c128yLLLILZLLLI = C0QWQ.LLLILZLLLI(C0QVQ.LIZ(ecSearchMiddlePagerContainerFragment), i);
                    }
                    if ((c128yLLLILZLLLI instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) != null) {
                        interfaceC671770QWp.kP(enumC674310Qcf);
                    }
                }

                @Override // X.InterfaceC674400Qco
                public final void LIZJ(final int i, final boolean z, final EnumC674310Qcf enumC674310Qcf) {
                    LiveData liveData;
                    boolean z2;
                    View view2 = this.LIZ.getView();
                    if (view2 != null) {
                        final EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LIZ;
                        HandlerHook.viewPost(view2, new Runnable() { // from class: X.0QWP
                            public final void LIZ() {
                                Fragment fragmentLLLILZLLLI;
                                C128Y c128yLLLILZLLLI;
                                InterfaceC671770QWp interfaceC671770QWp;
                                EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment2 = ecSearchMiddlePagerContainerFragment;
                                C0QWQ c0qwq2 = ecSearchMiddlePagerContainerFragment2.LLJJJJJIL;
                                if (c0qwq2 != null) {
                                    FragmentManager fragmentManagerLIZ = C0QVQ.LIZ(ecSearchMiddlePagerContainerFragment2);
                                    int i2 = i;
                                    boolean z3 = z;
                                    EnumC674310Qcf enumC674310Qcf2 = enumC674310Qcf;
                                    C671870QWz.LIZ.getClass();
                                    EnumC671670QWf enumC671670QWfLIZ = C671870QWz.LIZ(i2);
                                    if (enumC671670QWfLIZ == null || (fragmentLLLILZLLLI = C0QWQ.LLLILZLLLI(fragmentManagerLIZ, c0qwq2.LLJILJIL)) == null || (c128yLLLILZLLLI = C0QWQ.LLLILZLLLI(fragmentManagerLIZ, i2)) == null) {
                                        return;
                                    }
                                    String strCreateJumpSourceBtmToken = null;
                                    if ((c128yLLLILZLLLI instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) != null) {
                                        if (enumC674310Qcf2 == EnumC674310Qcf.SWITCH_TAB) {
                                            int i3 = C671690QWh.LIZ[enumC671670QWfLIZ.ordinal()];
                                            if (i3 == 1) {
                                                strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c61956.d90888", PageFinder.via(fragmentLLLILZLLLI), null);
                                            } else {
                                                if (i3 != 2) {
                                                    throw new C1954807lC();
                                                }
                                                strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c61956.d74728", PageFinder.via(fragmentLLLILZLLLI), null);
                                            }
                                        }
                                        interfaceC671770QWp.ov(strCreateJumpSourceBtmToken, z3);
                                    }
                                    c0qwq2.LLJILJIL = i2;
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$2$2$onPageSelected$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$2$2$onPageSelected$1");
                            }
                        });
                    }
                    if (!z) {
                        EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment2 = this.LIZ;
                        ecSearchMiddlePagerContainerFragment2.getClass();
                        C671870QWz.LIZ.getClass();
                        EnumC671670QWf enumC671670QWfLIZ = C671870QWz.LIZ(i);
                        if (enumC671670QWfLIZ != null) {
                            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = ecSearchMiddlePagerContainerFragment2.LLJLIL;
                            if (ecSearchIntermediateViewModelNew != null && (liveData = (LiveData) ecSearchIntermediateViewModelNew.LLILZ.getValue()) != null) {
                                if (enumC671670QWfLIZ == EnumC671670QWf.AI) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                liveData.setValue(Boolean.valueOf(z2));
                            }
                            C674040QcE c674040QcE = ecSearchMiddlePagerContainerFragment2.LLJJJJLIIL;
                            if (c674040QcE != null) {
                                c674040QcE.LIZLLL(enumC671670QWfLIZ);
                            }
                        }
                    }
                }
            });
            this.LLJL = c674320Qcg;
            c674320Qcg.LIZ();
        }
        Integer numValueOf = Integer.valueOf(C672250QYl.LIZJ().aiPagePreloadDelayTimeMillis);
        if (numValueOf.intValue() >= 0) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0J3D(numValueOf.intValue(), this, null), 3);
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 != null) {
            C10VO.LIZIZ(tuxIconView2);
            C786410Ut5.a9(tuxIconView2, new ACListenerS145S0100000_10(this, 100));
        }
        TuxIconView tuxIconView3 = this.LLIZLLLIL;
        if (tuxIconView3 != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView3.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                C786410Ut5.W5(tuxIconView3, marginLayoutParams);
            }
        }
        C418060GaK c418060GaK = this.LLIZ;
        if (c418060GaK != null) {
            View.OnClickListener aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 101);
            if (C1848410yCV.LIZ) {
                aCListenerS145S0100000_10 = new f(aCListenerS145S0100000_10);
            }
            a aVar = new a(aCListenerS145S0100000_10);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c418060GaK);
            }
            c418060GaK.setOnClickListener(aVar);
        }
        EditText editText = this.LLJ;
        if (editText != null) {
            String str = (String) this.LLJZ.getValue();
            if (str == null && (str = (String) this.LLJZIJLIL.getValue()) == null) {
                str = "";
            }
            editText.setHint(str);
            editText.setFilters(new InputFilter[]{new C1947807k4()});
            editText.addTextChangedListener(new C0R4H(this, 4));
            editText.setOnTouchListener(new ATListenerS444S0100000_10(this, 20));
            editText.setOnEditorActionListener(new C689810R3z(this, 2));
        }
        C1357120lQ6 c1357120lQ6 = this.LLJI;
        if (c1357120lQ6 != null) {
            c1357120lQ6.setFilters(new InputFilter[]{new C1947807k4()});
            String strLJI = C20642515q3.LJI(2131857236);
            if (strLJI != null && (strLJJIFFI = u.LJJIFFI(strLJI, "{{query}}", "", false)) != null) {
                c1357120lQ6.setHint(strLJJIFFI);
            }
            c1357120lQ6.addTextChangedListener(new C0R4H(this, 5));
            c1357120lQ6.setOnTouchListener(new ATListenerS444S0100000_10(this, 21));
            c1357120lQ6.setOnEditorActionListener(new C689810R3z(this, 3));
            c1357120lQ6.setOnPasteListener(new C0QX8() { // from class: X.0QWo
                @Override // X.C0QX8
                public final void LIZ() {
                    InterfaceC671770QWp interfaceC671770QWp;
                    EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LIZ;
                    C0QWQ c0qwq2 = ecSearchMiddlePagerContainerFragment.LLJJJJJIL;
                    C128Y c128yLLLJ = c0qwq2 != null ? c0qwq2.LLLJ(C0QVQ.LIZ(ecSearchMiddlePagerContainerFragment)) : null;
                    if (!(c128yLLLJ instanceof InterfaceC671770QWp) || (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLJ) == null) {
                        return;
                    }
                    interfaceC671770QWp.lO();
                }
            });
        }
        TuxIconView tuxIconView4 = this.LLJILJILJ;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS145S0100000_10(this, 102));
        }
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS145S0100000_10(this, 103));
            C786410Ut5.B5(tuxTextView, 0.0f);
            tuxTextView.setEnabled(false);
            tuxTextView.setClickable(false);
        }
        TuxIconView tuxIconView5 = this.LLJJIJIIJIL;
        if (tuxIconView5 != null) {
            C10VO.LIZIZ(tuxIconView5);
            C786410Ut5.a9(tuxIconView5, new ACListenerS145S0100000_10(this, 104));
        }
        C427110Gov c427110Gov = this.LLJJJ;
        if (c427110Gov != null) {
            C339190DRl.LIZLLL(c427110Gov);
            c427110Gov.setOnTouchListener(new AbstractC681090Qnb() { // from class: X.0QWO
                @Override // X.AbstractC681090Qnb
                public final void LIZLLL(View view2) {
                    C674040QcE c674040QcE = this.LLILLJJLI.LLJJJJLIIL;
                    if (c674040QcE != null && c674040QcE.LIZIZ.isRecording()) {
                        C674040QcE c674040QcE2 = this.LLILLJJLI.LLJJJJLIIL;
                        if (c674040QcE2 != null) {
                            c674040QcE2.LIZ(c674040QcE2.LIZIZ, EnumC674020QcC.AI_SEARCH_TRANSCRIBING);
                        }
                        EcSearchBarAsrHelper ecSearchBarAsrHelper = this.LLILLJJLI.LLJJL;
                        if (ecSearchBarAsrHelper != null) {
                            ecSearchBarAsrHelper.LIZJ();
                            return;
                        }
                        return;
                    }
                    this.LLILLJJLI.PR();
                }

                @Override // X.AbstractC681090Qnb, X.AbstractViewOnTouchListenerC19382810sM, android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int currentItem;
                    int i;
                    SearchResultFragmentNew searchResultFragmentNewLJI2;
                    EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LLILLJJLI;
                    C20632315oP c20632315oP3 = ecSearchMiddlePagerContainerFragment.LLJJJIL;
                    if (c20632315oP3 != null) {
                        currentItem = c20632315oP3.getCurrentItem();
                    } else {
                        currentItem = 0;
                    }
                    C671870QWz.LIZ.getClass();
                    EnumC671670QWf enumC671670QWfLIZ = C671870QWz.LIZ(currentItem);
                    if (enumC671670QWfLIZ != null && (i = C671680QWg.LIZ[enumC671670QWfLIZ.ordinal()]) != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                throw new C1954807lC();
                            }
                        } else {
                            InterfaceC668720QKw interfaceC668720QKw2 = ecSearchMiddlePagerContainerFragment.LL;
                            if (interfaceC668720QKw2 != null && (searchResultFragmentNewLJI2 = interfaceC668720QKw2.LJI()) != null) {
                                searchResultFragmentNewLJI2.fT(motionEvent);
                            }
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EcSearchMiddlePagerContainerFragment#onSearchTvTouch, error position: ");
                        sbLIZ.append(currentItem);
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return super.onTouch(view2, motionEvent);
                }
            });
        }
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout != null) {
            C680790Qn7 c680790Qn7 = C680790Qn7.LIZ;
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 1309);
            c680790Qn7.getClass();
            HandlerHook.viewPost(linearLayout, new RunnableC514801zW(awS554S0100000_10, (Function0<Unit>) 195));
        }
        if (NR()) {
            InterfaceC668720QKw interfaceC668720QKw2 = this.LL;
            if (interfaceC668720QKw2 != null && (searchResultFragmentNewLJI = interfaceC668720QKw2.LJI()) != null) {
                viewLT = searchResultFragmentNewLJI.LT();
            } else {
                viewLT = null;
            }
            if ((viewLT instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLT) != null) {
                ViewParent parent = viewGroup.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(viewGroup, viewGroup2);
                }
                LinearLayout linearLayout2 = this.LLJJ;
                if (linearLayout2 != null) {
                    linearLayout2.addView(viewGroup);
                }
                this.LLJILLL = viewGroup.findViewById(R.id.qdh);
                this.LLJJI = (TuxIconView) viewGroup.findViewById(R.id.qdd);
                View view2 = this.LLJILLL;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        C786410Ut5.W5(view2, marginLayoutParams2);
                    }
                }
                TuxIconView tuxIconView6 = this.LLJJI;
                if (tuxIconView6 != null) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    tuxIconView6.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams3 = tuxIconView6.getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        marginLayoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        marginLayoutParams3.setMarginStart(0);
                        marginLayoutParams3.setMarginEnd(iLIZIZ);
                        C786410Ut5.W5(tuxIconView6, marginLayoutParams3);
                    }
                }
            } else {
                viewGroup = null;
            }
            this.LLJJIII = viewGroup;
            LinearLayout linearLayout3 = this.LLJJ;
            if (linearLayout3 != null) {
                C339190DRl.LIZLLL(linearLayout3);
            }
        }
        LinearLayout linearLayout4 = this.LLJILJIL;
        if (linearLayout4 != null) {
            C680790Qn7 c680790Qn72 = C680790Qn7.LIZ;
            AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10(this, 1308);
            c680790Qn72.getClass();
            HandlerHook.viewPost(linearLayout4, new RunnableC514801zW(awS554S0100000_102, (Function0<Unit>) 195));
        }
        Context context = getContext();
        AwS554S0100000_10 awS554S0100000_103 = new AwS554S0100000_10(this, 1307);
        View view3 = this.LLILZLL;
        C418060GaK c418060GaK2 = this.LLIZ;
        TuxIconView tuxIconView7 = this.LLIZLLLIL;
        EditText editText2 = this.LLJ;
        C1357120lQ6 c1357120lQ62 = this.LLJI;
        C1357120lQ6 c1357120lQ63 = this.LLJIJIL;
        LinearLayout linearLayout5 = this.LLJILJIL;
        TuxIconView tuxIconView8 = this.LLJILJILJ;
        ViewGroup viewGroup3 = this.LLJJIII;
        TuxTextView tuxTextView2 = this.LLJJIJI;
        C427110Gov c427110Gov2 = this.LLJJJ;
        if (C672250QYl.LIZLLL()) {
            tuxIconView = this.LLJJIJIIJIL;
        }
        this.LLJJJJLIIL = new C674040QcE(new C674050QcF(context, awS554S0100000_103, view3, c418060GaK2, tuxIconView7, editText2, c1357120lQ62, c1357120lQ63, linearLayout5, tuxIconView8, viewGroup3, tuxTextView2, c427110Gov2, tuxIconView, this.LLJJIJIL));
        if (C672250QYl.LIZLLL()) {
            EcSearchBarAsrHelper ecSearchBarAsrHelper = new EcSearchBarAsrHelper(getLifecycle(), C0QR7.LJ(this.LLJJJJ));
            ecSearchBarAsrHelper.LIZJ = this.LLJJLIIIJLLLLLLLZ;
            this.LLJJL = ecSearchBarAsrHelper;
        }
        InterfaceC668720QKw interfaceC668720QKw3 = this.LL;
        if (interfaceC668720QKw3 != null && (c0qlyLJ = interfaceC668720QKw3.LJ()) != null) {
            c0qlyLJ.LIZJ = new InterfaceC668980QLw() { // from class: X.0QWr
                @Override // X.InterfaceC668980QLw
                public final EditText LIZ() {
                    return this.LIZ.LLJ;
                }

                @Override // X.InterfaceC668980QLw
                public final void hide() {
                    C339190DRl.LIZIZ(this.LIZ.LLILLJJLI);
                }

                @Override // X.InterfaceC668980QLw
                public final void show() {
                    C339190DRl.LIZLLL(this.LIZ.LLILLJJLI);
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcSearchMiddleSearchBarAbility
    public final void eK(boolean z, C1361400lX0 c1361400lX0, C0QNH c0qnh) {
        C1361400lX0 c1361400lX0LIZ;
        int i;
        int i2;
        int i3;
        int i4;
        GradientDrawable gradientDrawable;
        Drawable background;
        Integer numLIZJ;
        Drawable drawableMutate;
        GradientDrawable gradientDrawable2;
        Drawable background2;
        int i5;
        Integer numLIZJ2;
        Context context = getContext();
        boolean z2 = false;
        Drawable drawableMutate2 = null;
        if (context != null) {
            c1361400lX0LIZ = C1385040m98.LIZ(context, false);
        } else {
            c1361400lX0LIZ = null;
        }
        if (!z) {
            c1361400lX0LIZ = c1361400lX0;
        }
        if (c1361400lX0 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0)) != null) {
            int iIntValue = numLIZJ2.intValue();
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
        }
        C671870QWz c671870QWz = C671870QWz.LIZ;
        C19U1 c19u1 = this.LLILZIL;
        c671870QWz.getClass();
        C671870QWz.LJ(c19u1, c1361400lX0);
        if (c1361400lX0LIZ != null) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZ);
            if (numLIZJ3 != null) {
                int iIntValue2 = numLIZJ3.intValue();
                TuxIconView tuxIconView2 = this.LLIZLLLIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColor(iIntValue2);
                }
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1p, c1361400lX0LIZ);
            if (numLIZJ4 != null) {
                int iIntValue3 = numLIZJ4.intValue();
                TuxIconView tuxIconView3 = this.LLJILJILJ;
                if (tuxIconView3 != null) {
                    tuxIconView3.setTintColor(iIntValue3);
                }
            }
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a02, c1361400lX0LIZ);
            if (numLIZJ5 != null) {
                int iIntValue4 = numLIZJ5.intValue();
                View view = this.LLJILLL;
                if (view != null) {
                    view.setBackgroundColor(iIntValue4);
                }
            }
            if (C0BT7.LIZ()) {
                i5 = R.attr.a1h;
            } else {
                i5 = R.attr.a1j;
            }
            Integer numLIZJ6 = C1308910kAL.LIZJ(i5, c1361400lX0LIZ);
            if (numLIZJ6 != null) {
                int iIntValue5 = numLIZJ6.intValue();
                TuxIconView tuxIconView4 = this.LLJJI;
                if (tuxIconView4 != null) {
                    tuxIconView4.setTintColor(iIntValue5);
                }
            }
            Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZ);
            if (numLIZJ7 != null) {
                int iIntValue6 = numLIZJ7.intValue();
                EditText editText = this.LLJ;
                if (editText != null) {
                    editText.setTextColor(iIntValue6);
                }
            }
            Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.a1k, c1361400lX0LIZ);
            if (numLIZJ8 != null) {
                int iIntValue7 = numLIZJ8.intValue();
                EditText editText2 = this.LLJ;
                if (editText2 != null) {
                    editText2.setHintTextColor(iIntValue7);
                }
            }
        }
        int i6 = C306840C1a.LIZLLL;
        C0QWV.LJFF(this.LLJLLIL, c1361400lX0LIZ, this.LLJILJIL, c0qnh);
        this.LLJLILLLLZIIL = c1361400lX0LIZ;
        C674040QcE c674040QcE = this.LLJJJJLIIL;
        if (c674040QcE != null && c674040QcE.LIZIZ()) {
            z2 = true;
        }
        if (z) {
            i = R.attr.zi;
        } else {
            i = R.attr.br;
        }
        if (z2) {
            i2 = 2131857231;
            i3 = R.attr.au6;
            i4 = R.attr.gs;
        } else {
            i2 = R.string.spp;
            i3 = R.attr.a0o;
            i4 = R.attr.a00;
        }
        if (c1361400lX0LIZ != null && (numLIZJ = C1308910kAL.LIZJ(i, c1361400lX0LIZ)) != null) {
            int iIntValue8 = numLIZJ.intValue();
            View view2 = this.LLILZLL;
            if (view2 != null && (background2 = view2.getBackground()) != null) {
                drawableMutate = background2.mutate();
            } else {
                drawableMutate = null;
            }
            if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable2 = (GradientDrawable) drawableMutate) != null) {
                gradientDrawable2.setColor(iIntValue8);
            }
        }
        C427110Gov c427110Gov = this.LLJJJ;
        if (c427110Gov != null) {
            c427110Gov.setText(C20642515q3.LJI(i2));
        }
        if (c1361400lX0LIZ != null) {
            Integer numLIZJ9 = C1308910kAL.LIZJ(i3, c1361400lX0LIZ);
            if (numLIZJ9 != null) {
                int iIntValue9 = numLIZJ9.intValue();
                C427110Gov c427110Gov2 = this.LLJJJ;
                if (c427110Gov2 != null) {
                    c427110Gov2.setTextColor(iIntValue9);
                }
            }
            Integer numLIZJ10 = C1308910kAL.LIZJ(i4, c1361400lX0LIZ);
            if (numLIZJ10 != null) {
                int iIntValue10 = numLIZJ10.intValue();
                C427110Gov c427110Gov3 = this.LLJJJ;
                if (c427110Gov3 != null && (background = c427110Gov3.getBackground()) != null) {
                    drawableMutate2 = background.mutate();
                }
                if ((drawableMutate2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate2) != null) {
                    gradientDrawable.setColor(iIntValue10);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.brf, viewGroup, false);
        View view = this.LLILLJJLI;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd.findViewById(R.id.gg_);
            if (frameLayout != null) {
                C786410Ut5.LJJJZ(view, frameLayout);
                frameLayout.addView(view);
            }
            View viewFindViewById = viewTd.findViewById(R.id.vy2);
            if (viewFindViewById != null) {
                C339190DRl.LIZIZ(viewFindViewById);
            }
            View viewFindViewById2 = viewTd.findViewById(R.id.h4_);
            if (viewFindViewById2 != null) {
                C339190DRl.LIZIZ(viewFindViewById2);
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC669220QMu
    public final void Y9(int i, SearchSugEntity searchSugEntity, String str, String str2) {
        InterfaceC669220QMu interfaceC669220QMuMR = MR();
        if (interfaceC669220QMuMR != null) {
            interfaceC669220QMuMR.Y9(i, searchSugEntity, str, str2);
        }
    }
}
