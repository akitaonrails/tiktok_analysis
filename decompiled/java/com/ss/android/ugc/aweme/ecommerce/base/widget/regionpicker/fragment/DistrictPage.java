package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC1744400vUk;
import X.AbstractC21674919sB;
import X.AnonymousClass0317;
import X.AnonymousClass0488;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C0H1U;
import X.C1058220de0;
import X.C1120604Zw;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1743280vSw;
import X.C1744390vUj;
import X.C1744410vUl;
import X.C1748720vbi;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C452501pT;
import X.C786410Ut5;
import X.C948503nH;
import X.C960203pA;
import Y.ACListenerS90S0300000_26;
import Y.ARunnableS37S0101000_26;
import Y.ATListenerS458S0100000_26;
import Y.AsS35S0200000_26;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressDistrictPageSearchBarConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS4S1210100_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictPage extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZzHELIOSg6LCIpPWEhLSIlJiEjISYnLD19LjctLiI2JjFiDSYgPDclKjsDKSIp";
    public final boolean LL;
    public RecyclerView LLILLJJLI;
    public RecyclerView LLILLL;
    public C1749280vcc LLILZ;
    public final C01GW LLILZIL;
    public final BPEAHandler LLILZLL;
    public final C1744390vUj LLIZ;
    public final String LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public DistrictPage() {
        this(false);
    }

    public final RecyclerView NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y9) : null;
            this.LLILLL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final RecyclerView PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C1749280vcc RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w0t) : null;
            this.LLILZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final DistrictVm SR() {
        return (DistrictVm) this.LLILZIL.getValue();
    }

    public final int OR() {
        return requireFragmentManager().LJJLIIIJL().indexOf(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        PR().setAdapter(null);
        NR().setAdapter(null);
        List<Fragment> listLJJLIIIJL = getFragmentManager().LJJLIIIJL();
        int iLJIIJ = C1697810uHb.LJIIJ(listLJJLIIIJL);
        if (!listLJJLIIIJL.contains(this)) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS37S0101000_26(this, iLJIIJ, 3));
        } else if (Intrinsics.LJFF(this, C13LP.LJJLIIIJJI(listLJJLIIIJL))) {
            SR().xQ2(iLJIIJ, "return");
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    public DistrictPage(boolean z) {
        this.LL = z;
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 604));
        this.LLILZLL = new BPEAHandler(Looper.getMainLooper());
        C1744390vUj c1744390vUj = new C1744390vUj();
        c1744390vUj.setHasStableIds(true);
        this.LLIZ = c1744390vUj;
        this.LLIZLLLIL = "";
    }

    public final void MR(int i) {
        AbstractC1744400vUk abstractC1744400vUk = (AbstractC1744400vUk) PR().getAdapter();
        if (i < abstractC1744400vUk.getItemCount()) {
            abstractC1744400vUk.LLLIILIL(i);
        }
    }

    public final boolean Pp(Map<String, String> map) {
        List<District> list;
        List<District> list2;
        if (RR().getVisibility() == 0 && RR().LLJIJIL) {
            return false;
        }
        DistrictData districtData = ((District) ListProtector.get(SR().LLILLJJLI, OR())).response;
        Integer numValueOf = null;
        if (districtData != null && (list2 = districtData.districts) != null) {
            numValueOf = Integer.valueOf(list2.size());
        }
        HashMap map2 = (HashMap) map;
        map2.put("content_list_size", String.valueOf(numValueOf));
        if (RR().getVisibility() == 0) {
            map2.put("blank_type", "error_status");
            return true;
        }
        DistrictData districtData2 = ((District) ListProtector.get(SR().LLILLJJLI, OR())).response;
        if (districtData2 != null && (list = districtData2.districts) != null && !list.isEmpty()) {
            if (PR().getChildCount() > 0 && PR().getHeight() > 0) {
                return false;
            }
            map2.put("blank_type", "empty_view");
            return true;
        }
        map2.put("blank_type", "empty_data_list");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object WR(X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage.WR(X.05Vn):java.lang.Object");
    }

    public final void ZR(boolean z) {
        if (z) {
            View view = getView();
            if (view != null) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        view2.setImportantForAccessibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0vUl, X.19ry, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        ((AbstractC21674919sB) NR().getItemAnimator()).LLIZ = false;
        NR().setAdapter(this.LLIZ);
        NR().setNestedScrollingEnabled(false);
        NR().setHasFixedSize(true);
        final AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 261);
        ?? r3 = new AbstractC1744400vUk<District>(awS605S0100000_26) { // from class: X.0vUl
            {
                super((Function2) new AwS640S0100000_26(awS605S0100000_26, 132), true);
            }

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                if (LLLFZ(i).showIndex) {
                    return R.layout.amd;
                }
                return R.layout.ama;
            }

            @Override // X.AbstractC21673619ry
            public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
                this.LLILZLL = recyclerView;
            }

            @Override // X.AbstractC1744400vUk
            /* JADX INFO: renamed from: LLLIIIIL */
            public final void onBindViewHolder(C1744440vUo c1744440vUo, int i) {
                boolean z2;
                int iIntValue;
                int iIntValue2;
                String str;
                View view2 = c1744440vUo.itemView;
                if (i < getItemCount() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C03J8.LIZ(view2, z2);
                District districtLLLFZ = LLLFZ(i);
                Context context = c1744440vUo.itemView.getContext();
                if (districtLLLFZ.showIndex) {
                    TextView textView = (TextView) c1744440vUo.itemView.findViewById(R.id.kkr);
                    if (Intrinsics.LJFF(districtLLLFZ.index, e3.e)) {
                        str = "#";
                    } else {
                        str = districtLLLFZ.index;
                    }
                    textView.setText(str);
                    q0.LJIJI(c1744440vUo.itemView.findViewById(R.id.kkr), true);
                }
                int i2 = C20094413jq.LJIIZILJ;
                View viewFindViewById = c1744440vUo.itemView.findViewById(R.id.l0q);
                C1397760mTe c1397760mTe = new C1397760mTe();
                c1397760mTe.LJIIIZ = new AwS132S0101000_26(i, this, 11);
                c1397760mTe.LIZ = String.valueOf(districtLLLFZ.name);
                q0.LJIJ(viewFindViewById, c1397760mTe.LIZ());
                ((TextView) c1744440vUo.itemView.findViewById(R.id.l0q)).setText(districtLLLFZ.name);
                TextView textView2 = (TextView) c1744440vUo.itemView.findViewById(R.id.l0q);
                int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
                int[] iArr2 = new int[2];
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                iArr2[0] = iIntValue;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                iArr2[1] = iIntValue2;
                textView2.setTextColor(new ColorStateList(iArr, iArr2));
                if (i == this.LLILZIL) {
                    ((TuxTextView) c1744440vUo.itemView.findViewById(R.id.l0q)).setTuxFont(42);
                    ((TextView) c1744440vUo.itemView.findViewById(R.id.l0q)).setSelected(true);
                } else {
                    ((TuxTextView) c1744440vUo.itemView.findViewById(R.id.l0q)).setTuxFont(41);
                    ((TextView) c1744440vUo.itemView.findViewById(R.id.l0q)).setSelected(false);
                }
                final View viewFindViewById2 = c1744440vUo.itemView.findViewById(R.id.l0q);
                final int i3 = 500;
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                AddressDistrictPageSearchBarConfig addressDistrictPageSearchBarConfig = C1744260vUW.LIZ;
                AddressDistrictPageSearchBarConfig addressDistrictPageSearchBarConfig2 = (AddressDistrictPageSearchBarConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_sa_address_opt2", AddressDistrictPageSearchBarConfig.class, addressDistrictPageSearchBarConfig);
                if (addressDistrictPageSearchBarConfig2 != null) {
                    addressDistrictPageSearchBarConfig = addressDistrictPageSearchBarConfig2;
                }
                final boolean z3 = addressDistrictPageSearchBarConfig.enable;
                final ACListenerS90S0300000_26 aCListenerS90S0300000_26 = new ACListenerS90S0300000_26(this, c1744440vUo, districtLLLFZ, 10);
                final Boolean bool = Boolean.TRUE;
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0vUn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int iIntValue3;
                        boolean zBooleanValue;
                        View view4 = viewFindViewById2;
                        Integer num = i3;
                        if (num != null) {
                            iIntValue3 = num.intValue();
                        } else {
                            iIntValue3 = LSPassThroughRecordSizeConfig.DEFAULT;
                        }
                        Boolean bool2 = bool;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        } else {
                            zBooleanValue = true;
                        }
                        C1744700vVE.LIZ(view4, iIntValue3, zBooleanValue, z3, aCListenerS90S0300000_26);
                    }
                }, viewFindViewById2);
            }

            @Override // X.AbstractC1744400vUk, X.AbstractC21673619ry
            public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                onBindViewHolder((C1744440vUo) viewHolder, i);
            }
        };
        PR().setAdapter(r3);
        PR().addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, requireContext()), 0, 0.0f, 2));
        PR().setOnTouchListener(new ATListenerS458S0100000_26(this, 1));
        PR().addOnScrollListener(new AsS35S0200000_26(this, r3, 1));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IPerformanceOptDependencyService.class.getName();
            if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
        }
        ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_select_region").LIZIZ(PR());
        C948503nH.LJIIIIZZ(this, new C1743280vSw(this, null));
        this.LLIZ.LLIZLLLIL = new AwS392S0200000_26(this, (C1744410vUl) r3, 50);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object VR(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District r18, boolean r19, X.InterfaceC1364105Vn<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage.VR(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aS(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData r10, int r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage.aS(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData, int, X.05Vn):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZJ = C0H1U.LIZJ(R.layout.ame, viewGroup, false);
        } else {
            viewLIZJ = null;
        }
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }

    public final void UR(long j, Integer num, Long l, boolean z) {
        if (SR().LLJJLIIIJLLLLLLLZ) {
            return;
        }
        SR().LLJJLIIIJLLLLLLLZ = z;
        View view = getView();
        if (view != null) {
            C1748720vbi.LIZLLL(view, new AnonymousClass0488(), new AwS4S1210100_26(j, num, l, z, 0));
        }
    }
}
