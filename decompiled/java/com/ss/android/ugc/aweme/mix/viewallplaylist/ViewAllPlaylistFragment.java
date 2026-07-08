package com.ss.android.ugc.aweme.mix.viewallplaylist;

import X.AbstractC329610Cw3;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0T0P;
import X.C1164000gOc;
import X.C1164150gOr;
import X.C1164330gP9;
import X.C1167770gUh;
import X.C1169360gXG;
import X.C11NJ;
import X.C11S5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C14EU;
import X.C15438062q;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C20607315kN;
import X.C445550HdZ;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS111S0300000_18;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class ViewAllPlaylistFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWElISA7KCHELIOSM/OCktMCM6OzFiHyY2PwQgJR8/KTwgIDwnDjctLiI2JjE=";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C1749280vcc LLJ;
    public int LLJI;
    public String LLJIJIL;
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.navArg(this, AFwS206S0000000_18.get$arr$(217));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(218));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 698));

    public final ViewAllPlaylistFragmentArg UR() {
        return (ViewAllPlaylistFragmentArg) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        ((C11NJ) this.LLJILJIL.getValue()).LJ();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String str = this.LLJIJIL;
        if (str != null) {
            WR(str);
            this.LLJIJIL = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final List<C445550HdZ> SR(MixListResponse mixListResponse) {
        Integer numValueOf;
        List<MixStruct> mixList = mixListResponse.getMixList();
        if (mixList != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(mixList, 10));
            for (MixStruct mixStruct : mixList) {
                String mixName = mixStruct.getMixName();
                UrlModel icon = mixStruct.getIcon();
                MixStatisStruct statis = mixStruct.getStatis();
                if (statis != null) {
                    numValueOf = Integer.valueOf(statis.getTotal());
                } else {
                    numValueOf = null;
                }
                arrayList.add(new C445550HdZ(mixName, icon, numValueOf, mixStruct.mixId, mixStruct.getLastAddVideoTimestamp(), UR().getUid(), UR().getSecUid(), UR().getEnterFrom(), mixStruct.getMixLabel(), 512));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final void WR(String str) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            Pair pairVR = VR(str, viewOnAttachStateChangeListenerC20604515jv);
            Integer num = (Integer) pairVR.getFirst();
            C445550HdZ c445550HdZ = (C445550HdZ) pairVR.getSecond();
            if (num != null && c445550HdZ != null) {
                C11NJ c11nj = (C11NJ) this.LLJILJIL.getValue();
                MixFeedApi.LIZ.getClass();
                MixFeedApi mixFeedApiLIZ = C1169360gXG.LIZ();
                String str2 = c445550HdZ.LLILZLL;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = c445550HdZ.LLIZ;
                if (str4 != null) {
                    str3 = str4;
                }
                c11nj.LIZ(mixFeedApiLIZ.getMixDetail(str, str2, str3, false, true, false, null, null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS111S0300000_18(viewOnAttachStateChangeListenerC20604515jv, num, c445550HdZ, 1), new AfS181S0100000_12(this, 132)));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(214));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistDeleteEvent(C1164330gP9 c1164330gP9) {
        Integer num;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (num = (Integer) VR(c1164330gP9.LIZIZ, viewOnAttachStateChangeListenerC20604515jv).getFirst()) == null) {
            return;
        }
        C20600815jK.LJIILIIL(viewOnAttachStateChangeListenerC20604515jv.getState(), num.intValue());
        this.LLJI++;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistDetailRequestedEvent(C1164000gOc c1164000gOc) {
        this.LLJIJIL = c1164000gOc.LIZ;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistLatestDetailEvent(C1164150gOr c1164150gOr) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            Pair pairVR = VR(c1164150gOr.LIZ, viewOnAttachStateChangeListenerC20604515jv);
            Integer num = (Integer) pairVR.getFirst();
            C445550HdZ c445550HdZ = (C445550HdZ) pairVR.getSecond();
            if (num != null && c445550HdZ != null) {
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILJJIL(num.intValue(), new C445550HdZ(c1164150gOr.LIZIZ, c1164150gOr.LIZJ, c1164150gOr.LIZLLL, c445550HdZ.LLILZ, c1164150gOr.LJ, c445550HdZ.LLILZLL, c445550HdZ.LLIZ, c445550HdZ.LLIZLLLIL, c445550HdZ.LLJ, 512));
                this.LLJIJIL = null;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistRenameEvent(C0T0P c0t0p) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            Pair pairVR = VR(c0t0p.LIZIZ, viewOnAttachStateChangeListenerC20604515jv);
            Integer num = (Integer) pairVR.getFirst();
            C445550HdZ c445550HdZ = (C445550HdZ) pairVR.getSecond();
            if (num != null && c445550HdZ != null && !Intrinsics.LJFF(c0t0p.LIZ, c445550HdZ.LL)) {
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILJJIL(num.intValue(), new C445550HdZ(c0t0p.LIZ, c445550HdZ.LLILLJJLI, c445550HdZ.LLILLL, c445550HdZ.LLILZ, c445550HdZ.LLILZIL, c445550HdZ.LLILZLL, c445550HdZ.LLIZ, c445550HdZ.LLIZLLLIL, c445550HdZ.LLJ, 512));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRemoveFeedFromMixDetailPage(C1167770gUh c1167770gUh) {
        WR(c1167770gUh.LIZIZ);
    }

    public static Pair VR(String str, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        Iterator it2 = ((ArrayList) viewOnAttachStateChangeListenerC20604515jv.getState().LJII()).iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if ((interfaceC1891350zJl instanceof C445550HdZ) && Intrinsics.LJFF(((C445550HdZ) interfaceC1891350zJl).LLILZ, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        int iIntValue = numValueOf.intValue();
        if (iIntValue >= 0 && iIntValue < viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ()) {
            z = true;
        }
        InterfaceC1891350zJl interfaceC1891350zJl2 = null;
        if (z) {
            InterfaceC1891350zJl interfaceC1891350zJlLJI = viewOnAttachStateChangeListenerC20604515jv.getState().LJI(numValueOf.intValue());
            if (interfaceC1891350zJlLJI instanceof C445550HdZ) {
                interfaceC1891350zJl2 = interfaceC1891350zJlLJI;
            }
        } else {
            numValueOf = null;
        }
        return new Pair(numValueOf, interfaceC1891350zJl2);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJ = (C1749280vcc) view.findViewById(R.id.w28);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 699));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(R.string.nww);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(true);
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ViewAllPlaylistListCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJII(new C20607315kN() { // from class: X.0gUj
                @Override // X.C20607315kN
                public final void LJIIIIZZ() {
                    C1749280vcc c1749280vcc = this.LL.LLJ;
                    if (c1749280vcc == null) {
                        c1749280vcc = null;
                    }
                    c1749280vcc.LJ();
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
                    C1749280vcc c1749280vcc2 = this.LL.LLJ;
                    C786410Ut5.LLLZLZ(c1749280vcc2 != null ? c1749280vcc2 : null, 0);
                }

                @Override // X.C20607315kN
                public final void LJII(Exception exc) {
                    C1749280vcc c1749280vcc = this.LL.LLJ;
                    C1749280vcc c1749280vcc2 = null;
                    if (c1749280vcc == null) {
                        c1749280vcc = null;
                    }
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C1893080zMY.LIZ(c1722300uv6, new AwS562S0100000_18(this.LL, OppoPermissionPopupMaskDelayExp.DEFAULT));
                    c1749280vcc.setStatus(c1722300uv6);
                    C1749280vcc c1749280vcc3 = this.LL.LLJ;
                    if (c1749280vcc3 != null) {
                        c1749280vcc2 = c1749280vcc3;
                    }
                    C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
                }

                @Override // X.C20607315kN
                public final void LJIIIZ(boolean z) {
                    C1749280vcc c1749280vcc = null;
                    if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() == 0) {
                        C1749280vcc c1749280vcc2 = this.LL.LLJ;
                        if (c1749280vcc2 == null) {
                            c1749280vcc2 = null;
                        }
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1893080zMY.LJFF(c1722300uv6, new AwS562S0100000_18(this.LL, 701));
                        c1749280vcc2.setStatus(c1722300uv6);
                        C1749280vcc c1749280vcc3 = this.LL.LLJ;
                        if (c1749280vcc3 != null) {
                            c1749280vcc = c1749280vcc3;
                        }
                        C786410Ut5.LLLZLZ(c1749280vcc, 0);
                        C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
                        return;
                    }
                    C1749280vcc c1749280vcc4 = this.LL.LLJ;
                    if (c1749280vcc4 != null) {
                        c1749280vcc = c1749280vcc4;
                    }
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) this.LLJILJILJ.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dx4, viewGroup, false);
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
