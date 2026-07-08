package com.ss.android.ugc.aweme.mix.manageplaylist;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0T0P;
import X.C1164110gOn;
import X.C1164330gP9;
import X.C1165050gQJ;
import X.C1165310gQj;
import X.C1165730gRP;
import X.C1167740gUe;
import X.C1167770gUh;
import X.C1167930gUx;
import X.C1167940gUy;
import X.C1167950gUz;
import X.C1169360gXG;
import X.C11S5;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1559260qg8;
import X.C1623706Xj;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C2286608xc;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.C445720Hdq;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC420801kM;
import Y.AfS154S0200000_18;
import Y.AfS185S0100000_16;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class ManagePlaylistViewModel extends AssemListViewModel<C1167930gUx, C1167940gUy, Long> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C445720Hdq.class, (Class<Object>) "manage_playlist_hierarchy_data_key", (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 571));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 570));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 569));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(204));
    public final Set<String> LLILZLL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1167930gUx(0);
    }

    public final C1165310gQj wQ2() {
        return (C1165310gQj) this.LLILZIL.getValue();
    }

    public final void refresh() {
        C1165310gQj c1165310gQjWQ2 = wQ2();
        c1165310gQjWQ2.LIZ = 0;
        c1165310gQjWQ2.LJFF = false;
        c1165310gQjWQ2.LJI = -1;
        c1165310gQjWQ2.LJ = null;
        ((ArrayList) c1165310gQjWQ2.LJII).clear();
        c1165310gQjWQ2.LJIIIIZZ.clear();
        manualListRefresh();
    }

    public final void vQ2() {
        if (!wQ2().LJFF) {
            setStateImmediate(AFwS256S0000000_18.get$arr$(163));
            return;
        }
        if (((C1167930gUx) this.vmDispatcher.getState()).LLILLL instanceof C1623706Xj) {
            return;
        }
        setStateImmediate(AFwS256S0000000_18.get$arr$(164));
        C1165310gQj c1165310gQjWQ2 = wQ2();
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 568);
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 153);
        if (c1165310gQjWQ2.LJFF) {
            c1165310gQjWQ2.LJFF = false;
            MixFeedApi.LIZ.getClass();
            MixFeedApi mixFeedApiLIZ = C1169360gXG.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            ArrayList arrayList = (ArrayList) c1165310gQjWQ2.LJII;
            sbLIZ.append(C13LP.LJJLIIIJ(arrayList.subList(0, Math.min(c1165310gQjWQ2.LJI + 1, arrayList.size())), ",", null, null, 0, null, null, 62));
            sbLIZ.append(']');
            InterfaceC420801kM interfaceC420801kMLJJIIZ = mixFeedApiLIZ.reorderMixList(C2188811AlT.LIZIZ(sbLIZ)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS185S0100000_16(awS562S0100000_18, 57), new AfS154S0200000_18(awS597S0100000_18, c1165310gQjWQ2, 30));
            if (interfaceC420801kMLJJIIZ != null) {
                disposeOnClear(interfaceC420801kMLJJIIZ);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1167940gUy> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 154));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistCreateEvent(C1167740gUe c1167740gUe) {
        String str;
        if (c1167740gUe.LIZ != null) {
            setState(AFwS256S0000000_18.get$arr$(165));
            C1165310gQj c1165310gQjWQ2 = wQ2();
            AwS667S0100000_18 awS667S0100000_18 = new AwS667S0100000_18(this, 8);
            AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 155);
            String str2 = c1165310gQjWQ2.LIZIZ;
            if (str2 != null && (str = c1165310gQjWQ2.LIZJ) != null) {
                c1165310gQjWQ2.LJIIIZ.LIZLLL(str2, str, 0L, null, Boolean.FALSE, new C1164110gOn(awS597S0100000_18, c1165310gQjWQ2, awS667S0100000_18), awS597S0100000_18);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistDeleteEvent(C1164330gP9 c1164330gP9) {
        withState(new AwS384S0200000_18(this, c1164330gP9, 60));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistEditEvent(C1167950gUz c1167950gUz) {
        String str = c1167950gUz.LIZ;
        if (str.length() != 0) {
            this.LLILZLL.add(str);
        }
        withState(new AwS384S0200000_18(c1167950gUz, this, 61));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistRenameEvent(C0T0P c0t0p) {
        withState(new AwS384S0200000_18(c0t0p, this, 62));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        C1165310gQj c1165310gQjWQ2 = wQ2();
        MixListResponse mixListResponse = c1165310gQjWQ2.LJ;
        if (mixListResponse != null) {
            c1165310gQjWQ2.LJ = null;
            List<C1167940gUy> listLIZ = c1165310gQjWQ2.LIZ(mixListResponse.getMixList());
            List<String> list = c1165310gQjWQ2.LJII;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator<C1167940gUy> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                String str = it2.next().LLILZ;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            ((ArrayList) list).addAll(arrayList);
            if (mixListResponse.getHasMore()) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Long lLJFF = C2286608xc.LJFF(mixListResponse.getCursor());
                c317290CcB.getClass();
                return new C323380Cm0(null, lLJFF, listLIZ);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(listLIZ);
        }
        return c1165310gQjWQ2.LIZIZ(0L, interfaceC1364105Vn);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRemoveFeedFromMixDetailPage(C1167770gUh c1167770gUh) {
        xQ2(c1167770gUh.LIZIZ);
    }

    public final void xQ2(String str) {
        String str2;
        C1165310gQj c1165310gQjWQ2 = wQ2();
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 156);
        String str3 = c1165310gQjWQ2.LIZIZ;
        if (str3 != null && (str2 = c1165310gQjWQ2.LIZJ) != null) {
            c1165310gQjWQ2.LJIIIZ.getClass();
            C1165050gQJ.LIZIZ(str, str3, str2, true, awS597S0100000_18, null);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return wQ2().LIZIZ(l.longValue(), interfaceC1364105Vn);
    }
}
