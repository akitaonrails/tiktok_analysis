package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C037B;
import X.C1201710hNR;
import X.C1201790hNZ;
import X.C1272804yU;
import X.C13LE;
import X.C14L0;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719612Di;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C292380Bd6;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1201910hNl;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RegionAllListAssem extends UIContentAssem implements IRegionAllListAbility, InterfaceC1201910hNl, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C14L0 LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1201710hNR.class, "NearbyRegionHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJIJIL;
    public int LLJILJIL;
    public final Map<String, Integer> LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RegionAllListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RegionAllListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2366), AFwS256S0000000_18.get$arr$(805), null, true);
        this.LLJILJILJ = new LinkedHashMap();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1544473409) {
            return null;
        }
        return this;
    }

    public final C1201710hNR Ho() {
        return (C1201710hNR) this.LLJI.getValue();
    }

    public final void Go() {
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        if (viewGroup.indexOfChild(viewOnAttachStateChangeListenerC20604515jv) == -1) {
            ViewGroup viewGroup2 = (ViewGroup) LJJIJL();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
            viewGroup2.addView(viewOnAttachStateChangeListenerC20604515jv2 != null ? viewOnAttachStateChangeListenerC20604515jv2 : null, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.ss.android.ugc.nearby.roaming.IRegionAllListAbility
    public final void hide() {
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        if (viewGroup.indexOfChild(viewOnAttachStateChangeListenerC20604515jv) != -1) {
            FrameLayout frameLayout = (FrameLayout) LJJIJL();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
                viewOnAttachStateChangeListenerC20604515jv2 = null;
            }
            C786410Ut5.LJJJZ(viewOnAttachStateChangeListenerC20604515jv2, frameLayout);
        }
        C14L0 c14l0 = this.LLJ;
        C14L0 c14l02 = c14l0 != null ? c14l0 : null;
        int visibility = c14l02.getVisibility();
        c14l02.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c14l02);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.nearby.roaming.IRegionAllListAbility
    public final void show() {
        Go();
        C14L0 c14l0 = this.LLJ;
        if (c14l0 == null) {
            c14l0 = null;
        }
        int visibility = c14l0.getVisibility();
        c14l0.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c14l0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1891350zJl[] Jo(java.util.List<com.ss.android.ugc.tiktok.location_api.service.LocationRegion> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.roaming.RegionAllListAssem.Jo(java.util.List):X.0zJl[]");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        if (Ho().LL.currentRegion == null && Ho().LL.allRegions == null) {
            z = true;
        } else {
            z = false;
        }
        C14L0 c14l0 = null;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(view.getContext(), null);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(UserCurrentRegionCell.class);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            viewOnAttachStateChangeListenerC20604515jv2 = null;
        }
        viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PopularRegionsCell.class);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
            viewOnAttachStateChangeListenerC20604515jv3 = null;
        }
        viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(RoadMapCell.class);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 == null) {
            viewOnAttachStateChangeListenerC20604515jv4 = null;
        }
        viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(NearbyRegionCell.class);
        C14L0 c14l02 = (C14L0) ((View) view.getParent()).findViewById(R.id.smv);
        this.LLJ = c14l02;
        if (c14l02 == null) {
            c14l02 = null;
        }
        c14l02.setLetterUpdateListener$nearby_release(this);
        if (z) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv5 == null) {
                viewOnAttachStateChangeListenerC20604515jv5 = null;
            }
            C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv5.getState(), new C1201790hNZ(new LocationRegion(-1L, Ho().LL.currentRegionL0Name, null, null, null, null, Ho().LL.currentRegionL0Name, null, Ho().LL.currentRegionL0Code, null)));
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv6 == null) {
                viewOnAttachStateChangeListenerC20604515jv6 = null;
            }
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv6.getState();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1201790hNZ(Ho().LL.currentRegion));
            List<LocationRegion> list = Ho().LL.popularRegions;
            if (list != null) {
                arrayList.add(new C037B(list));
            }
            List<LocationRegion> list2 = Ho().LL.allRegions;
            if (list2 != null) {
                C19719612Di.LJJII(arrayList, Jo(list2));
                this.LLJILJIL = list2.size();
            }
            state.LIZLLL(arrayList, null);
            if (C292380Bd6.LIZ) {
                AssemVMLazy assemVMLazy = this.LLJIJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
                C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hNV
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1201730hNT) obj).LLILZ;
                    }
                }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 204), 4);
            }
        }
        Go();
        if (z) {
            C14L0 c14l03 = this.LLJ;
            if (c14l03 != null) {
                c14l0 = c14l03;
            }
            int visibility = c14l0.getVisibility();
            c14l0.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c14l0);
            return;
        }
        C14L0 c14l04 = this.LLJ;
        if (c14l04 != null) {
            c14l0 = c14l04;
        }
        int visibility2 = c14l0.getVisibility();
        c14l0.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c14l0);
    }

    @Override // X.InterfaceC1201910hNl
    public final void t5(String str) {
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            Integer num = (Integer) ((LinkedHashMap) this.LLJILJILJ).get(str);
            if (num != null && num.intValue() >= 0) {
                iIntValue = num.intValue();
                if (iIntValue < 0) {
                    return;
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
                    viewOnAttachStateChangeListenerC20604515jv2 = null;
                }
                iIntValue = 0;
                for (Object obj : (ArrayList) viewOnAttachStateChangeListenerC20604515jv2.getState().LJII()) {
                    int i = iIntValue + 1;
                    if (iIntValue >= 0) {
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                        if ((interfaceC1891350zJl instanceof C1272804yU) && Intrinsics.LJFF(((C1272804yU) interfaceC1891350zJl).LL, str)) {
                            this.LLJILJILJ.put(str, Integer.valueOf(iIntValue));
                        } else {
                            iIntValue = i;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            linearLayoutManager.scrollToPositionWithOffset(iIntValue, 0);
        }
    }
}
