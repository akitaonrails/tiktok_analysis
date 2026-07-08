package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC1744400vUk;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C13LP;
import X.C1697810uHb;
import X.C1744200vUQ;
import X.C1744420vUm;
import X.C1744700vVE;
import X.C19EH;
import X.C2252611DEt;
import X.C948503nH;
import X.InterfaceC1364105Vn;
import Y.ARunnableS15S0301000_26;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictVm extends ViewModel {
    public ArrayList<OrderSKUDTO> LLILLL;
    public List<String> LLILZ;
    public C1744420vUm LLILZIL;
    public C1744200vUQ LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final MutableLiveData<String> LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public Integer LLJJIII;
    public Integer LLJJIJI;
    public String LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public boolean LLJJJ;
    public final List<District> LLJJJIL;
    public final int LLJJJJ;
    public boolean LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public long LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public int LL = Integer.MAX_VALUE;
    public final List<District> LLILLJJLI = new ArrayList();
    public int LLILZLL = -1;
    public final MutableLiveData<String> LLIZ = C948503nH.LJIIL("");

    public final C1744420vUm vQ2() {
        C1744420vUm c1744420vUm = this.LLILZIL;
        if (c1744420vUm != null) {
            return c1744420vUm;
        }
        return null;
    }

    public final C1744200vUQ wQ2() {
        C1744200vUQ c1744200vUQ = this.LLIZLLLIL;
        if (c1744200vUQ != null) {
            return c1744200vUQ;
        }
        return null;
    }

    public DistrictVm() {
        new ArrayList();
        this.LLJILJILJ = new MutableLiveData<>("");
        this.LLJJ = "shipping_address";
        this.LLJJI = "shipping_info";
        this.LLJJJIL = new ArrayList();
        this.LLJJJJ = 500;
        this.LLJJL = -1L;
        this.LLJL = 1;
    }

    public final void xQ2(int i, String str) {
        String str2;
        List<District> list;
        District district;
        if (i < ((ArrayList) this.LLILLJJLI).size()) {
            DistrictData districtData = ((District) ListProtector.get(this.LLILLJJLI, i)).response;
            String str3 = null;
            if (districtData != null && (str2 = districtData.titleEn) != null && !a0.LJJJIL(str2)) {
                C1744200vUQ c1744200vUQWQ2 = wQ2();
                DistrictData districtData2 = ((District) ListProtector.get(this.LLILLJJLI, i)).response;
                if (districtData2 != null && (list = districtData2.districts) != null && (district = (District) C13LP.LJJJLZIJ(0, list)) != null) {
                    str3 = district.districtKey;
                }
                c1744200vUQWQ2.LIZJ(str3, str, true);
            }
        }
    }

    public final void yQ2(FragmentManager fragmentManager, int i) {
        DistrictPage districtPage;
        RecyclerView recyclerView;
        int i2 = 0;
        if (i >= 0 && i < ((ArrayList) this.LLILLJJLI).size()) {
            int i3 = -1;
            this.LLILZLL = -1;
            DistrictData districtData = ((District) ListProtector.get(this.LLILLJJLI, i)).response;
            if (districtData != null) {
                String str = districtData.titleEn;
                if (str != null && !a0.LJJJIL(str)) {
                    wQ2().LIZLLL = SystemClock.elapsedRealtime();
                }
                this.LLIZ.setValue(districtData.title);
                int i4 = i + 1;
                RecyclerView recyclerView2 = null;
                if (((ArrayList) this.LLILLJJLI).size() > i4) {
                    if (i >= 0 && i < fragmentManager.LJJLIIIJL().size()) {
                        View view = ((Fragment) ListProtector.get(fragmentManager.LJJLIIIJL(), i)).getView();
                        if (view != null) {
                            recyclerView = (RecyclerView) view.findViewById(R.id.t0h);
                        } else {
                            recyclerView = null;
                        }
                        AbstractC1744400vUk abstractC1744400vUk = (AbstractC1744400vUk) recyclerView.getAdapter();
                        int i5 = abstractC1744400vUk.LLILZIL;
                        if (i5 < 0) {
                            String str2 = ((District) ListProtector.get(this.LLILLJJLI, i4)).geoNameId;
                            Iterator<District> it2 = districtData.districts.iterator();
                            i5 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    if (Intrinsics.LJFF(it2.next().geoNameId, str2)) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    i5 = -1;
                                    break;
                                }
                            }
                        }
                        abstractC1744400vUk.LLLIILIL(i5);
                    } else {
                        return;
                    }
                }
                Fragment fragment = (Fragment) ListProtector.get(fragmentManager.LJJLIIIJL(), i);
                if (C1697810uHb.LJIIJ(this.LLJJJIL) >= i && ((ArrayList) this.LLJJJIL).size() > 0) {
                    View view2 = fragment.getView();
                    if (view2 != null) {
                        recyclerView2 = (RecyclerView) view2.findViewById(R.id.t0h);
                    }
                    AbstractC1744400vUk abstractC1744400vUk2 = (AbstractC1744400vUk) recyclerView2.getAdapter();
                    List<District> list = districtData.districts;
                    if (list != null) {
                        Iterator<District> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(it3.next().geoNameId, ((District) ListProtector.get(this.LLJJJIL, i)).geoNameId)) {
                                i3 = i2;
                                break;
                            }
                            i2++;
                        }
                    } else {
                        i3 = abstractC1744400vUk2.LLILZIL;
                    }
                    if ((fragment instanceof DistrictPage) && (districtPage = (DistrictPage) fragment) != null) {
                        districtPage.MR(i3);
                    }
                    recyclerView2.scrollToPosition(i3);
                    HandlerHook.viewPost(recyclerView2, new ARunnableS15S0301000_26(i, this, fragment, fragmentManager, 2));
                } else {
                    ((ArrayList) this.LLJJJIL).clear();
                    C1744700vVE.LJIIJJI(this.LLJJJJ, fragment);
                }
            }
            if (((ArrayList) this.LLILLJJLI).size() >= 1 && ((ArrayList) this.LLILLJJLI).size() >= i + 1) {
                vQ2().LLLIILIL(i);
            }
        }
    }

    public final Object zQ2(FragmentManager fragmentManager, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        DistrictPage districtPage;
        int size = fragmentManager.LJJLIIIJL().size();
        if (size > 0) {
            Object obj = ListProtector.get(fragmentManager.LJJLIIIJL(), size - 1);
            if ((obj instanceof DistrictPage) && (districtPage = (DistrictPage) obj) != null) {
                districtPage.ZR(false);
            }
        }
        DistrictPage districtPage2 = new DistrictPage(this.LLJJJ);
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJJLI(R.anim.f475bc, R.anim.bd, R.anim.f475bc, R.anim.bd);
        c19ehLJIIJ.LIZIZ(R.id.iip, districtPage2);
        c19ehLJIIJ.LJII(String.valueOf(size));
        c19ehLJIIJ.LJIIJ();
        District district = (District) C13LP.LJJJLZIJ(size - 1, this.LLILLJJLI);
        if (district != null) {
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
            c2252611DEt.LJIJJ();
            district.continuation = c2252611DEt;
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            if (objLJIJ == C099R.LJFF()) {
                return objLJIJ;
            }
        }
        return Unit.LIZ;
    }
}
