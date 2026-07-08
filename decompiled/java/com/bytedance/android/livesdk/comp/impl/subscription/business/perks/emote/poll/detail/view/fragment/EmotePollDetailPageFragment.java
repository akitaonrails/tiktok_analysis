package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0JR2;
import X.C0JR3;
import X.C0JR4;
import X.C0JR5;
import X.C0JR6;
import X.C0JRE;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollDetailPageFragment extends SubSpaceBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LDHELIOS04O2spJCAnLWs8JiM/ZiEpPS46JGs6ICokZiM+KCg+LSs4Zwo+JzEpGSA/JAEpPS46JBUtLioVOiQrJCo9PA==";
    public final AssemVMLazy LLILZLL;
    public C0JRE LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollDetailPageFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/detail/vm/EmotePollDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollDetailPageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollDetailVM.class);
        C0JR2 c0jr2 = new C0JR2(c19719912DlLIZ);
        C0JR6 c0jr6 = new C0JR6();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jr2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JR3(this), c0jr6, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jr2, new C0JR4(this), c0jr6, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jr2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JR5(this), c0jr6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
    }

    public final C0JRE RR() {
        if (this.LLIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0JRE.class, null);
            this.LLIZ = interfaceC1555100qZQLIZIZ != null ? (C0JRE) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final String OR() {
        return C497740JfY.LJIJI(2131852076);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void NR(LiveIconView liveIconView) {
        C786410Ut5.LLJJIJIL(liveIconView, 8);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0JRE(), C0JRE.class, "source_default_key");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.glg, viewGroup, false);
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
