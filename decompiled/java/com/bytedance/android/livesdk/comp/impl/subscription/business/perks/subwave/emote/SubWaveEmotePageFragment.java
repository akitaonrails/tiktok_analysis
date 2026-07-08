package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0JTF;
import X.C0JTK;
import X.C0JTM;
import X.C0JTP;
import X.C0JTQ;
import X.C0JTR;
import X.C0JTS;
import X.C0JTT;
import X.C0JUH;
import X.C0JUK;
import X.C0KPJ;
import X.C0QSJ;
import X.C1161920gLG;
import X.C13LE;
import X.C1548820qPI;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C262100zr;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubWaveEmotePageFragment extends BaseFragment implements InterfaceC1141530foN, C0QSJ, InterfaceC1146704e9 {
    public static final C0JTF LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExHELIOSPTYlJyogO2s8LD04O2s/PC0kKTMpZyo+JzEpZxwmKhItPyoWJSo4LB8yLyAKOy40JSAiPQ==";
    public final int LL = 125;
    public final int LLILLJJLI = 126;
    public long LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public final AssemVMLazy LLILZLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JTF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubWaveEmotePageFragment.class, "subWaveEmotePageViewModel", "getSubWaveEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subwave/emote/SubWaveEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0JTF
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SubWaveEmotePageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SubWaveEmotePageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SubWaveEmotePageScope.class);
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

    public SubWaveEmotePageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubWaveEmotePageViewModel.class);
        C0JTK c0jtk = new C0JTK(c19719912DlLIZ);
        C0JTS c0jts = new C0JTS();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jtk, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JTP(this), c0jts, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jtk, new C0JTQ(this), c0jts, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jtk, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JTR(this), c0jts, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
    }

    public final SubWaveEmotePageViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (SubWaveEmotePageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0KPJ.Ze.LJFF((Map<String, Boolean>) NR().LLILLL.getValue());
        C1548820qPI.LJIIIIZZ("sub_emote_suggested_selection", this);
        C1548820qPI.LJIIIIZZ("sub_emote_suggested_selection_showed", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "sub_emote_suggested_selection")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (string = interfaceC1107590evd.getString("emote_list")) != null) {
                SubWaveEmotePageViewModel subWaveEmotePageViewModelNR = NR();
                subWaveEmotePageViewModelNR.withState(new C0JTT(subWaveEmotePageViewModelNR, string));
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "sub_emote_suggested_selection_showed")) {
            return;
        }
        SubWaveEmotePageViewModel subWaveEmotePageViewModelNR2 = NR();
        subWaveEmotePageViewModelNR2.withState(new C0JUH(subWaveEmotePageViewModelNR2));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILLL = arguments.getLong("user_id");
            this.LLILZ = arguments.getString("sec_user_id");
            this.LLILZIL = arguments.getString("enter_from");
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C20736316Cj.LIZIZ(R.attr.c63, getContext()));
        tuxImmersionBarLIZLLL.LIZLLL();
        C723850SaN.LIZ(this, false, null, new C0JTM(this), 3);
        C1548820qPI.LIZLLL("sub_emote_suggested_selection", this);
        C1548820qPI.LIZLLL("sub_emote_suggested_selection_showed", this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && i2 == this.LLILLJJLI && i == this.LL) {
            SubWaveEmotePageViewModel subWaveEmotePageViewModelNR = NR();
            subWaveEmotePageViewModelNR.withState(new C0JUK(((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).CA1(intent, "choose_photo"), subWaveEmotePageViewModelNR));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghj, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
