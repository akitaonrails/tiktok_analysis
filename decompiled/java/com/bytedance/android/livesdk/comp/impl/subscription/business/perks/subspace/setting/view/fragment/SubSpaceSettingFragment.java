package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C11RD;
import X.C11S5;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16F5;
import X.C16FZ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C480460Ism;
import X.C491870JQr;
import X.C497740JfY;
import X.C501110Jkz;
import X.C501120Jl0;
import X.C501130Jl1;
import X.C501140Jl2;
import X.C501150Jl3;
import X.C501160Jl4;
import X.C501180Jl6;
import X.C501190Jl7;
import X.C501200Jl8;
import X.C510380Jzw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC510330Jzr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.fragment.SubSpaceSettingFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.vm.SubSpaceSettingVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.view.fragment.SubSpaceMemberListFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SettingsResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceSettingFragment extends SubSpaceBaseFragment {
    public static final C501200Jl8 LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2HELIOSs8LD04O2s/PC0gOCQvLGEgLTE4ICE0ZjMlLDh9LjctLiI2JjFiGjoxGzUtKioALTE4ICE0DjctLiI2JjE=";
    public ConstraintLayout LLILZLL;
    public C16F5 LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public FrameLayout LLJ;
    public final C01GW LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jl8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceSettingFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/setting/vm/SubSpaceSettingVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0Jl8
        };
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void clearFromXmlViewCache() {
        this.LL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    public SubSpaceSettingFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceSettingVM.class);
        C501110Jkz c501110Jkz = new C501110Jkz(c19719912DlLIZ);
        C501190Jl7 c501190Jl7 = new C501190Jl7();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501110Jkz, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C501130Jl1(this), c501190Jl7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501110Jkz, new C501140Jl2(this), c501190Jl7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501110Jkz, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C501150Jl3(this), c501190Jl7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new C501180Jl6());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final String OR() {
        return C497740JfY.LJIJI(this.LLILZ ? 2131856652 : 2131856520);
    }

    public final void RR() {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = this.LLJ;
            if (frameLayout != null && frameLayout.getChildCount() == 0) {
                C16FZ c16fz = new C16FZ(context, null);
                FrameLayout frameLayout2 = this.LLJ;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c16fz);
                }
            }
            FrameLayout frameLayout3 = this.LLJ;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
        }
        C480460Ism.LIZ().getClass();
        C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getSpaceSettings(), EnumC510330Jzr.GENERAL, "SubSpaceSettingFragment", "sub/space/settings", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this));
        if (c0j1n != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jkx
                @Override // X.C09JN
                public final void accept(Object obj) {
                    SpacePost spacePost;
                    C1C7U.LIZ("SubSpaceSettingFragment@f10d.fetchData$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    SettingsResponse.ResponseData responseData = (SettingsResponse.ResponseData) baseResponse.data;
                    if (responseData != null) {
                        final long j = responseData.membersCount;
                        final SubSpaceSettingFragment subSpaceSettingFragment = this.LL;
                        View viewFindViewById = subSpaceSettingFragment.LLIZ;
                        View viewFindViewById2 = null;
                        if (viewFindViewById == null) {
                            View view = subSpaceSettingFragment.getView();
                            if (view != null) {
                                viewFindViewById = view.findViewById(R.id.tv_space_member_count);
                            } else {
                                viewFindViewById = null;
                            }
                            subSpaceSettingFragment.LLIZ = (C16F5) viewFindViewById;
                        }
                        ((TextView) viewFindViewById).setText(C474270Iin.LIZIZ(j));
                        View view2 = subSpaceSettingFragment.LLILZLL;
                        if (view2 == null) {
                            View view3 = subSpaceSettingFragment.getView();
                            if (view3 != null) {
                                viewFindViewById2 = view3.findViewById(R.id.b8r);
                            }
                            subSpaceSettingFragment.LLILZLL = (ConstraintLayout) viewFindViewById2;
                            view2 = viewFindViewById2;
                        }
                        C786410Ut5.Y7((ConstraintLayout) view2, new View.OnClickListener() { // from class: X.0Jl9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                FragmentManager supportFragmentManager;
                                C19EG activity = subSpaceSettingFragment.getActivity();
                                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                                    SubSpaceSettingFragment subSpaceSettingFragment2 = subSpaceSettingFragment;
                                    long j2 = j;
                                    C501220JlA c501220JlA = SubSpaceMemberListFragment.LLIZLLLIL;
                                    int i = subSpaceSettingFragment2.LLILLL;
                                    boolean z = subSpaceSettingFragment2.LLILZ;
                                    c501220JlA.getClass();
                                    SubSpaceMemberListFragment subSpaceMemberListFragment = new SubSpaceMemberListFragment();
                                    subSpaceMemberListFragment.LLIZ = j2;
                                    subSpaceMemberListFragment.LLILZ = z;
                                    C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                                    c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
                                    c19ehLJIIJ.LIZJ(i, subSpaceMemberListFragment, "SubOnlySpaceMemberListFragment");
                                    c19ehLJIIJ.LJII("SubOnlySpaceMemberListFragment");
                                    c19ehLJIIJ.LJIIJ();
                                }
                            }
                        });
                    }
                    SettingsResponse.ResponseData responseData2 = (SettingsResponse.ResponseData) baseResponse.data;
                    if (responseData2 != null && (spacePost = responseData2.previewPost) != null) {
                        AssemVMLazy assemVMLazy = this.LL.LLIZLLLIL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SubSpaceSettingFragment.LLJILJIL;
                        assemVMLazy.getValue().setState(new C1585706It(spacePost));
                    }
                    SubSpaceSettingFragment subSpaceSettingFragment2 = this.LL;
                    FrameLayout frameLayout4 = subSpaceSettingFragment2.LLJ;
                    if (frameLayout4 != null) {
                        C786410Ut5.LJJJJIZL(frameLayout4);
                    }
                    FrameLayout frameLayout5 = subSpaceSettingFragment2.LLJ;
                    if (frameLayout5 != null) {
                        C786410Ut5.LJZ(8, frameLayout5);
                    }
                    C1C7U.LIZIZ("SubSpaceSettingFragment@f10d.fetchData$1");
                }
            }, new C09JN() { // from class: X.0Jky
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceSettingFragment@f10d.fetchData$2");
                    C501540Jlg.LIZJ(this.LL.getContext(), (Throwable) obj);
                    SubSpaceSettingFragment subSpaceSettingFragment = this.LL;
                    FrameLayout frameLayout4 = subSpaceSettingFragment.LLJ;
                    if (frameLayout4 != null) {
                        C786410Ut5.LJJJJIZL(frameLayout4);
                    }
                    FrameLayout frameLayout5 = subSpaceSettingFragment.LLJ;
                    if (frameLayout5 != null) {
                        C786410Ut5.LJZ(8, frameLayout5);
                    }
                    ((C491870JQr) this.LL.LLJI.getValue()).LIZJ(true);
                    C1C7U.LIZIZ("SubSpaceSettingFragment@f10d.fetchData$2");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void NR(LiveIconView liveIconView) {
        C786410Ut5.LLJJIJIL(liveIconView, 8);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.LLJ = (FrameLayout) view.findViewById(R.id.nlo);
        TextView textView = (TextView) view.findViewById(R.id.tv_space_member);
        if (textView != null) {
            if (this.LLILZ) {
                i = 2131856651;
            } else {
                i = 2131856519;
            }
            textView.setText(C497740JfY.LJIJI(i));
        }
        C723850SaN.LIZ(this, false, null, new C501160Jl4(this), 3);
        RR();
        ((C491870JQr) this.LLJI.getValue()).LIZIZ(view, new C501120Jl0(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.glv, viewGroup, false);
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
