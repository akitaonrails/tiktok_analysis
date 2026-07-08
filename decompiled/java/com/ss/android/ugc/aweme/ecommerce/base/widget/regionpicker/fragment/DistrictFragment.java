package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC1250290idn;
import X.AbstractC1744400vUk;
import X.C01GW;
import X.C036A;
import X.C049X;
import X.C098200Yq;
import X.C09AY;
import X.C0H1U;
import X.C0I7D;
import X.C0OM1;
import X.C0WZX;
import X.C1007103wj;
import X.C10510049c;
import X.C10511049d;
import X.C1058220de0;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1427310nFJ;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1743200vSo;
import X.C1743220vSq;
import X.C1744190vUP;
import X.C1744200vUQ;
import X.C1744210vUR;
import X.C1744250vUV;
import X.C1744260vUW;
import X.C1744270vUX;
import X.C1744290vUZ;
import X.C1744300vUa;
import X.C1744320vUc;
import X.C1744420vUm;
import X.C1744460vUq;
import X.C1745180vW0;
import X.C1747730va7;
import X.C1747750va9;
import X.C1747770vaB;
import X.C1747870vaL;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749260vca;
import X.C1756030vnV;
import X.C189200o6;
import X.C19719612Di;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C1AF0;
import X.C1C7U;
import X.C2204961BRm;
import X.C2371409Qy;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.C927503jt;
import X.C948503nH;
import X.EnumC1070180dxI;
import X.InterfaceC1737690vJv;
import X.InterfaceC1744370vUh;
import X.InterfaceC1744450vUp;
import X.InterfaceC1744490vUt;
import X.InterfaceC1748810vbr;
import X.InterfaceC21506019Ek;
import X.InterfaceC747600TUg;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnFocusChangeListenerC1775860wJU;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS160S0100000_26;
import Y.AObserverS228S0100000_26;
import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressDistrictPageSearchBarConfig;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import g1c.AjS70S0100000_26;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS107S0201000_26;
import kotlin.jvm.internal.AwS10S0101100_26;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS28S0202000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS57S0100100_26;
import kotlin.jvm.internal.AwS5S2100100_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictFragment extends ECAnimDowngradeFragment implements InterfaceC1737690vJv, InterfaceC1744450vUp, InterfaceC1744490vUt<District> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZzg6LCHELIOSIpPWEhLSIlJiEjISYnLD19LjctLiI2JjFiDSYgPDclKjsVOiQrJCo9PA==";
    public RecyclerView LL;
    public LinearLayout LLILLJJLI;
    public C1744250vUV LLILLL;
    public RecyclerView LLILZ;
    public TuxNavBar LLILZIL;
    public ConstraintLayout LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public FrameLayout LLJIJIL;
    public FrameLayout LLJILJIL;
    public View LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public C1749260vca LLJJ;
    public TuxSpinner LLJJI;
    public TuxTextView LLJJIII;
    public KeyBoardVisibilityUtil LLJJIJI;
    public C1744460vUq<District> LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public District LLJJLIIIJLLLLLLLZ;
    public List<C1744320vUc<District>> LLJL;
    public C1744270vUX LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Integer LLJLLIL;
    public Integer LLJLLL;
    public final DistrictFragment$handler$1 LLJZ;
    public Function2<? super List<Region>, ? super AddressBase, Unit> LLJZIJLIL;
    public Function0<Unit> LLL;
    public C09AY LLLF;
    public Function1<? super List<Region>, Unit> LLLFF;
    public long LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public C1744320vUc<District> LLLII;
    public boolean LLLIIII;
    public long LLLIIIIL;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 603));
    public final C1744210vUR LLJJJJLIIL = new InterfaceC1744450vUp() { // from class: X.0vUR
        @Override // X.InterfaceC1744450vUp
        public final void LJJIJIIJIL() {
        }

        @Override // X.InterfaceC1744450vUp
        public final void A2(String str) {
            List listSingletonList;
            List<District> list = this.LL.mS().LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                String str2 = ((District) it2.next()).geoNameId;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(str2);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList2);
            if (objLJJJLZIJ == null || (listSingletonList = Collections.singletonList(objLJJJLZIJ)) == null) {
                listSingletonList = C13BV.INSTANCE;
            }
            Integer num = this.LL.LLJLLIL;
            Address.Companion.getClass();
            SearchDistrictRequest searchDistrictRequest = new SearchDistrictRequest(1, listSingletonList, str, num, Address.SEARCH_GEOS, C1747870vaL.LIZ);
            DistrictFragment districtFragment = this.LL;
            C948503nH.LJIIIIZZ(districtFragment, new C1744280vUY(searchDistrictRequest, districtFragment, str, null));
        }

        @Override // X.InterfaceC1744450vUp
        public final void p(View view, boolean z, String str) {
            int length;
            String str2;
            int length2 = 0;
            if (z) {
                DistrictFragment districtFragment = this.LL;
                if (str != null) {
                    length2 = str.length();
                }
                districtFragment.LLLFZ = length2;
                this.LL.LLLFFI = SystemClock.elapsedRealtime();
                C1748720vbi.LIZLLL(view, new C10510049c(), new AwS605S0100000_26(this.LL, 741));
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            DistrictFragment districtFragment2 = this.LL;
            long j = jElapsedRealtime - districtFragment2.LLLFFI;
            if (str != null) {
                length = str.length();
            } else {
                length = -districtFragment2.LLLFZ;
            }
            if (length > 0) {
                str2 = "add";
            } else if (length < 0) {
                str2 = "del";
            } else {
                str2 = "";
            }
            C1748720vbi.LIZLLL(view, new C10511049d(), new AwS5S2100100_26(j, str2, str, this.LL, 2));
            this.LL.LLLI = false;
        }
    };
    public final C1744190vUP LLJJL = new InterfaceC1744490vUt<District>() { // from class: X.0vUP
        @Override // X.InterfaceC1744490vUt
        public final void lD() {
        }

        @Override // X.InterfaceC1744490vUt
        public final void W2(int i) {
            DistrictFragment districtFragment = this.LL;
            districtFragment.LLLIIII = false;
            if (districtFragment.LLLIIIIL != 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                DistrictFragment districtFragment2 = this.LL;
                long j = jElapsedRealtime - districtFragment2.LLLIIIIL;
                View view = districtFragment2.getView();
                if (view != null) {
                    C1748720vbi.LIZLLL(view, new C1747750va9(), new AwS10S0101100_26(i, j, this.LL, 1));
                }
                this.LL.LLLIIIIL = 0L;
            }
        }

        @Override // X.InterfaceC1744490vUt
        public final void EC(C1744320vUc<District> c1744320vUc, int i, int i2) {
            DistrictPage districtPage;
            DistrictData districtData;
            List<District> list;
            String str;
            View childAt;
            DistrictData districtData2;
            List<District> list2;
            District district;
            DistrictFragment districtFragment = this.LL;
            districtFragment.LLLI = true;
            districtFragment.LLLII = c1744320vUc;
            View view = districtFragment.getView();
            if (view != null) {
                C1748720vbi.LIZLLL(view, new C1747730va7(), new AwS28S0202000_26(i, i2, this.LL, c1744320vUc, 1));
            }
            ((ArrayList) this.LL.mS().LLJJJIL).clear();
            District district2 = c1744320vUc.LIZ;
            ArrayList arrayList = new ArrayList();
            District district3 = (District) C13LP.LJJJLZIJ(0, this.LL.mS().LLILLJJLI);
            if (district3 != null && (districtData2 = district3.response) != null && (list2 = districtData2.districts) != null && (district = (District) C13LP.LJJJLZIJ(0, list2)) != null) {
                DistrictFragment districtFragment2 = this.LL;
                if (Intrinsics.LJFF(district.districtKey, "region")) {
                    ListProtector.add(districtFragment2.mS().LLJJJIL, 0, district);
                    arrayList.add(new Region(district.name, district.geoNameId, district.code, district.districtKey, district.longitude, district.latitude, null));
                }
            }
            if (Intrinsics.LJFF(district2.hasNextLevel, Boolean.FALSE)) {
                List<District> list3 = district2.parRegions;
                if (list3 != null) {
                    for (District district4 : list3) {
                        arrayList.add(new Region(district4.name, district4.geoNameId, district4.code, district4.districtKey, district4.longitude, district4.latitude, null));
                    }
                }
                arrayList.add(new Region(district2.name, district2.geoNameId, district2.code, district2.districtKey, district2.longitude, district2.latitude, null));
                this.LL.bS().invoke(arrayList, district2.addressBase);
                return;
            }
            Object objLJJJJZI = C13LP.LJJJJZI(this.LL.getChildFragmentManager().LJJLIIIJL());
            if (objLJJJJZI instanceof DistrictPage) {
                districtPage = (DistrictPage) objLJJJJZI;
            } else {
                districtPage = null;
            }
            List<District> list4 = district2.parRegions;
            if (list4 != null) {
                DistrictFragment districtFragment3 = this.LL;
                for (District district5 : list4) {
                    district5.code = null;
                    ((ArrayList) districtFragment3.mS().LLJJJIL).add(district5);
                }
            }
            district2.code = null;
            ((ArrayList) this.LL.mS().LLJJJIL).add(district2);
            if (districtPage != null) {
                this.LL.mS().getClass();
                C1744700vVE.LJIIJJI(0, districtPage);
            }
            if (this.LL.mS().vQ2().LLILZIL != 0) {
                this.LL.mS().LLJJJJJIL = true;
                this.LL.mS().vQ2().LLLI(C1697810uHb.LJIILJJIL(((District) ListProtector.get(this.LL.mS().LLJJJIL, 0)).name));
                RecyclerView recyclerViewGS = this.LL.gS();
                if (recyclerViewGS != null && (childAt = recyclerViewGS.getChildAt(0)) != null) {
                    childAt.performClick();
                }
                this.LL.PR();
                return;
            }
            District district6 = (District) C13LP.LJJJLZIJ(0, this.LL.mS().LLILLJJLI);
            if (district6 != null && (districtData = district6.response) != null && (list = districtData.districts) != null) {
                DistrictFragment districtFragment4 = this.LL;
                int i3 = 0;
                for (District district7 : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        String str2 = district7.geoNameId;
                        District district8 = (District) C13LP.LJJJLZIJ(0, districtFragment4.mS().LLJJJIL);
                        if (district8 != null) {
                            str = district8.geoNameId;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str2, str) && districtPage != null) {
                            RecyclerView recyclerViewPR = districtPage.PR();
                            if (recyclerViewPR != null) {
                                HandlerHook.viewPost(recyclerViewPR, new ARunnableS95S0200000_26(districtFragment4, districtPage, 44));
                            }
                            if (districtPage != null) {
                                districtPage.MR(i3);
                            }
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            this.LL.PR();
        }
    };
    public long LLJLL = System.currentTimeMillis();

    static {
        new C1007103wj();
    }

    @Override // X.InterfaceC1744450vUp
    public final void LJJIJIIJIL() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final boolean MR() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "select_region";
    }

    @Override // X.InterfaceC1744490vUt
    public final void lD() {
    }

    public final void PR() {
        C0I7D editTextView;
        C0I7D editTextView2;
        C1744460vUq<District> c1744460vUq = this.LLJJIJIL;
        if (c1744460vUq != null) {
            c1744460vUq.getSearchEditFromXml().setText("");
        }
        try {
            Context context = getContext();
            InputMethodManager inputMethodManager = (InputMethodManager) (context != null ? C786410Ut5.H2(context, "input_method") : null);
            View view = getView();
            inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "DistrictFragment.closeSearchBox");
        }
        C1744460vUq<District> c1744460vUq2 = this.LLJJIJIL;
        if (c1744460vUq2 != null) {
            c1744460vUq2.clearFocus();
        }
        C1749260vca c1749260vcaCS = cS();
        if (c1749260vcaCS != null && (editTextView2 = c1749260vcaCS.getEditTextView()) != null) {
            editTextView2.setText("");
        }
        C1749260vca c1749260vcaCS2 = cS();
        if (c1749260vcaCS2 == null || (editTextView = c1749260vcaCS2.getEditTextView()) == null) {
            return;
        }
        editTextView.clearFocus();
    }

    public final C1744250vUV SR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iip) : null;
            this.LLILLL = (C1744250vUV) viewFindViewById;
        }
        return (C1744250vUV) viewFindViewById;
    }

    public final TuxIconView UR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jy7) : null;
            this.LLJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final View VR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.no4) : null;
            this.LLJILJILJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final ConstraintLayout WR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.no5) : null;
            this.LLJILLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxSpinner ZR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.no6) : null;
            this.LLJJI = (TuxSpinner) viewFindViewById;
        }
        return (TuxSpinner) viewFindViewById;
    }

    public final LinearLayout aS() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p9y) : null;
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final Function2<List<Region>, AddressBase, Unit> bS() {
        Function2 function2 = this.LLJZIJLIL;
        if (function2 != null) {
            return function2;
        }
        return null;
    }

    public final C1749260vca cS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u58) : null;
            this.LLJJ = (C1749260vca) viewFindViewById;
        }
        return (C1749260vca) viewFindViewById;
    }

    public final RecyclerView dS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u5b) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final RecyclerView gS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.x0k) : null;
            this.LLILZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final TuxNavBar hS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xzl) : null;
            this.LLILZIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final TuxTextView iS() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z38) : null;
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView kS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z7m) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final DistrictVm mS() {
        return (DistrictVm) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0vUR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0vUP] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$handler$1] */
    public DistrictFragment() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LLJZ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                String string;
                List listSingletonList;
                C1C7U.LIZ("DistrictFragment@520d.handler$1");
                if (message.what == 1) {
                    DistrictFragment districtFragment = this.LL;
                    if (districtFragment.cS().getEditTextView().hasFocus()) {
                        Editable editableLLLLJI = C2204961BRm.LLLLJI(districtFragment.cS().getEditTextView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LQRh/Q5yecw1sHAjas4jycaZEkmdbR+2P13KWXNf7OtwsnEeOV4JY7vDPY2SQ==", null));
                        if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
                            string = "";
                        }
                        if (DistrictFragment.nS(string)) {
                            List<District> list = districtFragment.mS().LLILLJJLI;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator it2 = ((ArrayList) list).iterator();
                            while (it2.hasNext()) {
                                String str = ((District) it2.next()).geoNameId;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList.add(str);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (((String) obj).length() > 0) {
                                    arrayList2.add(obj);
                                }
                            }
                            Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList2);
                            if (objLJJJLZIJ == null || (listSingletonList = Collections.singletonList(objLJJJLZIJ)) == null) {
                                listSingletonList = C13BV.INSTANCE;
                            }
                            C948503nH.LJIIIIZZ(districtFragment, new C1744290vUZ(new SearchDistrictRequest(3, listSingletonList, string, districtFragment.LLJLLIL, null, C1747870vaL.LIZ), districtFragment, string, null));
                        } else {
                            districtFragment.qS(false, false);
                            districtFragment.oS(true);
                        }
                    } else {
                        districtFragment.qS(false, false);
                        districtFragment.oS(true);
                    }
                }
                C1C7U.LIZIZ("DistrictFragment@520d.handler$1");
            }
        };
    }

    public final void RR() {
        C12ES.LJIILL(0, ZR());
        C0H1U.LIZIZ(kS());
        C0H1U.LIZIZ(UR());
        this.LLJLL = System.currentTimeMillis();
        AwS675S0100000_26 awS675S0100000_26 = new AwS675S0100000_26(this, 2);
        CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
        try {
            C1745180vW0.LIZ(null, awS675S0100000_26);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        PopupWindow popupWindow;
        if (!isAdded()) {
            return false;
        }
        if (getChildFragmentManager().LJLJJI()) {
            return true;
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJJIJI;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZIZ(keyBoardVisibilityUtil.LL.getDecorView().findFocus());
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil2 = this.LLJJIJI;
        if (keyBoardVisibilityUtil2 != null && keyBoardVisibilityUtil2.LIZJ()) {
            KeyBoardVisibilityUtil keyBoardVisibilityUtil3 = this.LLJJIJI;
            if (keyBoardVisibilityUtil3 != null) {
                keyBoardVisibilityUtil3.LIZIZ(keyBoardVisibilityUtil3.LL.getDecorView().findFocus());
            }
            return true;
        }
        C1744460vUq<District> c1744460vUq = this.LLJJIJIL;
        if (c1744460vUq != null && (popupWindow = c1744460vUq.LLILZ.LJII) != null && popupWindow.isShowing()) {
            C1744460vUq<District> c1744460vUq2 = this.LLJJIJIL;
            if (c1744460vUq2 != null) {
                c1744460vUq2.LLILZ.LIZIZ();
            }
            return true;
        }
        int iLJIIJ = C1697810uHb.LJIIJ(getChildFragmentManager().LJJLIIIJL());
        if (iLJIIJ <= 0 || ((ArrayList) mS().LLJJJIL).size() != 0) {
            return false;
        }
        int i = iLJIIJ - 1;
        mS().LLILZLL = i;
        mS().xQ2(iLJIIJ, "return");
        ((DistrictPage) ListProtector.get(getChildFragmentManager().LJJLIIIJL(), i)).ZR(true);
        getChildFragmentManager().LJLLILLLL();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        gS().setAdapter(null);
        super.onDestroyView();
        PR();
        removeCallbacksAndMessages(null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mS().wQ2().LIZLLL = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C036A.LIZIZ()) {
            mS().xQ2(C1697810uHb.LJIIJ(getChildFragmentManager().LJJLIIIJL()), "close");
        }
    }

    public static boolean nS(String str) {
        if (str == null || a0.LJJJIL(str) || str.length() < 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1744450vUp
    public final void A2(String str) {
        List listSubList = ((ArrayList) mS().LLILLJJLI).subList(0, getChildFragmentManager().LJJLIIIJL().size());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listSubList.iterator();
        while (it2.hasNext()) {
            String str2 = ((District) it2.next()).geoNameId;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        C948503nH.LJIIIIZZ(this, new C1744300vUa(new RegionRequest((String[]) arrayList2.toArray(new String[0]), mS().LLILLL, mS().LLJJIJI, str, null, this.LLJLLIL, null, C1747870vaL.LIZ), this, str, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        DistrictPage districtPage;
        boolean zPp = false;
        try {
            List<Fragment> listLJJLIIIJL = getChildFragmentManager().LJJLIIIJL();
            Fragment fragment = listLJJLIIIJL.get(Math.min(C1697810uHb.LJIIJ(listLJJLIIIJL), C1697810uHb.LJIIJ(mS().LLILLJJLI)));
            if (!(fragment instanceof DistrictPage) || (districtPage = (DistrictPage) fragment) == null) {
                return false;
            }
            zPp = districtPage.Pp(map);
            return zPp;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return zPp;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this, 254));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", new AwS605S0100000_26(this, 255));
    }

    @Override // X.InterfaceC1744490vUt
    public final void W2(int i) {
        this.LLLIIII = false;
        if (this.LLLIIIIL != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLLIIIIL;
            View view = getView();
            if (view != null) {
                C1748720vbi.LIZLLL(view, new C1747750va9(), new AwS10S0101100_26(i, jElapsedRealtime, this, 0));
            }
            this.LLLIIIIL = 0L;
        }
    }

    public final void oS(boolean z) {
        if (z) {
            C12ES.LJIILL(0, SR());
            C12ES.LJIILL(0, gS());
        } else {
            C0H1U.LIZIZ(SR());
            C0H1U.LIZIZ(gS());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C1756030vnV.LIZ(this);
        mS().LLJJL = SystemClock.elapsedRealtime();
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("source_btm_token");
        } else {
            string = null;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b2395", string);
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [X.0vUX, com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter] */
    /* JADX WARN: Type inference failed for: r5v22, types: [X.0vUm] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List<String> list;
        String str;
        Integer numValueOf;
        Object obj2;
        String str2;
        String string;
        int iIntValue;
        String string2;
        ViewGroup viewGroup;
        Integer numLIZJ;
        Window window;
        Integer numLIZJ2;
        LaneParams laneParamsLIZIZ;
        LaneParams laneParamsLIZIZ2;
        Object obj3;
        String str3;
        Type type;
        Bundle arguments = getArguments();
        mG(view, null);
        OR(view, null, null);
        C19719612Di.LJJI(arguments.getParcelableArrayList("current_selected_region_list"), mS().LLILLJJLI);
        mS().LL = arguments.getInt("level_count", Integer.MAX_VALUE);
        mS().LLILLL = arguments.getParcelableArrayList("order_skus");
        DistrictVm districtVmMS = mS();
        try {
            obj = arguments.get("pre_selection_geoname_ids");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if (obj != null) {
            if (!(obj instanceof List)) {
                obj3 = null;
            } else {
                obj3 = obj;
            }
            list = (List) obj3;
            if (list == null) {
                if (obj instanceof String) {
                    str3 = (String) obj;
                } else {
                    str3 = null;
                }
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
                    } else {
                        type = new TypeToken<List<? extends String>>() { // from class: X.0vSr
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str3, type);
                    if (!(objFromJson instanceof List)) {
                        objFromJson = null;
                    }
                    list = (List) objFromJson;
                } catch (s e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    list = null;
                }
            }
        } else {
            list = null;
        }
        districtVmMS.LLILZ = list;
        mS().LLJJIJIIJIL = arguments.getString("location", mS().LLJJIJIIJIL);
        DistrictVm districtVmMS2 = mS();
        Object objLIZIZ = C1748730vbj.LIZIZ(this, "location");
        if (!(objLIZIZ instanceof String) || (str = (String) objLIZIZ) == null) {
            str = mS().LLJJIJIIJIL;
        }
        districtVmMS2.LLJJIJIIJIL = str;
        DistrictVm districtVmMS3 = mS();
        String string3 = arguments.getString("district_type");
        if (string3 != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(string3));
        } else {
            numValueOf = null;
        }
        districtVmMS3.LLJJIII = numValueOf;
        DistrictVm districtVmMS4 = mS();
        String string4 = arguments.getString("search_district_type");
        if (string4 == null) {
            string4 = "2";
        }
        districtVmMS4.LLJJIJI = Integer.valueOf(CastIntegerProtector.parseInt(string4));
        mS().LLJJIJIL = Integer.valueOf(arguments.getInt("is_with_delivery_info"));
        mS().LLJJJ = this.LLJJJJ;
        DistrictVm districtVmMS5 = mS();
        int i = this.LLJLLIL;
        if (i == null) {
            i = 0;
        }
        districtVmMS5.LLJJJJLIIL = i;
        mS().LLJI = arguments.getBoolean("needSearchBox", false);
        mS().LLJIJIL = arguments.getBoolean("needStandaloneSearch", false);
        mS().LLJILJIL = arguments.getBoolean("needLocate", false);
        DistrictVm districtVmMS6 = mS();
        arguments.getString("country_geo_name_id");
        districtVmMS6.getClass();
        this.LLJJJ = arguments.getString("page_info");
        String string5 = arguments.getString("previous_page");
        if (string5 != null && string5.length() != 0) {
            mS().LLJJ = string5;
            mS().LLJJI = string5;
        }
        DistrictVm districtVmMS7 = mS();
        String str4 = this.LLJJJ;
        String str5 = mS().LLJJIJIIJIL;
        if (str5 == null) {
            str5 = "unKnown";
        }
        String string6 = arguments.getString("previous_page");
        InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
        if (interfaceC1748810vbrLIZ != null && (laneParamsLIZIZ2 = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ, "lib_track_builtin_lane_business")) != null) {
            obj2 = laneParamsLIZIZ2.get((Object) "entrance_info");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Integer num = mS().LLJJIJIL;
        boolean z = this.LLJJJJJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1748810vbr interfaceC1748810vbrLIZ2 = C1748730vbj.LIZ(view);
        if (interfaceC1748810vbrLIZ2 != null && (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ2, "lib_track_builtin_lane_business")) != null) {
            Object obj4 = laneParamsLIZIZ.get((Object) "biz_type");
            if (obj4 != null) {
                linkedHashMap.put("biz_type", obj4);
            }
            Object obj5 = laneParamsLIZIZ.get((Object) "product_id");
            if (obj5 != null) {
                linkedHashMap.put("product_id", obj5);
            }
            Object obj6 = laneParamsLIZIZ.get((Object) "ttf_page_type");
            if (obj6 != null) {
                linkedHashMap.put("ttf_page_type", obj6);
            }
        }
        districtVmMS7.LLIZLLLIL = new C1744200vUQ(str4, str5, str2, string6, num, z, linkedHashMap, this.LLJLLL);
        mS().LLJILLL = arguments.getBoolean("if_auto_locate", false);
        mS().wQ2().LJ = mS().LLJILLL;
        TuxNavBar tuxNavBarHS = hS();
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        Context context = getContext();
        if (context != null) {
            string = context.getString(2131823332);
        } else {
            string = null;
        }
        c1251150ifB.LJIIIIZZ = string;
        c1251150ifB.LIZIZ = Unit.LIZ;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 602));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om1.LJ(abstractC1250290idnArr);
        Context context2 = getContext();
        if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.c3, context2)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        c0om1.LIZLLL = true;
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        Context context3 = getContext();
        if (context3 != null) {
            string2 = context3.getString(2131823173);
        } else {
            string2 = null;
        }
        c1251150ifB2.LJIIIIZZ = string2;
        Function0<Unit> function0 = this.LLL;
        if (function0 == null) {
            function0 = null;
        }
        c1251150ifB2.LIZJ(function0);
        abstractC1250290idnArr2[0] = c1251150ifB2;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        tuxNavBarHS.setNavActions(c0om1);
        mS().LLIZ.observe(getViewLifecycleOwner(), new AObserverS228S0100000_26(this, 0));
        DistrictVm districtVmMS8 = mS();
        final AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 258);
        districtVmMS8.LLILZIL = new AbstractC1744400vUk<String>(awS605S0100000_26) { // from class: X.0vUm
            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i2) {
                return R.layout.amc;
            }

            {
                super(new AwS617S0100000_3(awS605S0100000_26, 47), 2);
            }

            @Override // X.AbstractC21673619ry
            public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
                this.LLILZLL = recyclerView;
            }

            @Override // X.AbstractC1744400vUk
            /* JADX INFO: renamed from: LLLIIIIL */
            public final void onBindViewHolder(C1744440vUo c1744440vUo, int i2) {
                int iIntValue2;
                int iIntValue3;
                super.onBindViewHolder(c1744440vUo, i2);
                Context context4 = c1744440vUo.itemView.getContext();
                int i3 = C20094413jq.LJIIZILJ;
                View view2 = c1744440vUo.itemView;
                C1397760mTe c1397760mTe = new C1397760mTe();
                c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                c1397760mTe.LIZJ = null;
                C20094813ju.LIZ(view2, c1397760mTe.LIZ());
                ((TextView) c1744440vUo.itemView.findViewById(R.id.p09)).setText(LLLFZ(i2));
                TextView textView = (TextView) c1744440vUo.itemView.findViewById(R.id.p09);
                int i4 = 0;
                int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
                int[] iArr2 = new int[2];
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context4);
                if (numLIZJ3 != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                iArr2[0] = iIntValue2;
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, context4);
                if (numLIZJ4 != null) {
                    iIntValue3 = numLIZJ4.intValue();
                } else {
                    iIntValue3 = 0;
                }
                iArr2[1] = iIntValue3;
                textView.setTextColor(new ColorStateList(iArr, iArr2));
                View viewFindViewById = c1744440vUo.itemView.findViewById(R.id.kl2);
                if (i2 != this.LLILZIL) {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, viewFindViewById);
            }

            @Override // X.AbstractC1744400vUk, X.AbstractC21673619ry
            public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                onBindViewHolder((C1744440vUo) viewHolder, i2);
            }
        };
        C1744420vUm c1744420vUmVQ2 = mS().vQ2();
        List listLJJJJIZL = C13LP.LJJJJIZL(mS().LLILLJJLI, 1);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJIZL, 10));
        Iterator it2 = listLJJJJIZL.iterator();
        while (it2.hasNext()) {
            arrayList.add(((District) it2.next()).name);
        }
        c1744420vUmVQ2.LLLI(arrayList);
        mS().LLILZLL = C1697810uHb.LJIIJ(mS().LLILLJJLI) - 1;
        gS().setAdapter(mS().vQ2());
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AddressDistrictPageSearchBarConfig addressDistrictPageSearchBarConfig = C1744260vUW.LIZ;
        AddressDistrictPageSearchBarConfig addressDistrictPageSearchBarConfig2 = (AddressDistrictPageSearchBarConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_sa_address_opt2", AddressDistrictPageSearchBarConfig.class, addressDistrictPageSearchBarConfig);
        if (addressDistrictPageSearchBarConfig2 != null) {
            addressDistrictPageSearchBarConfig = addressDistrictPageSearchBarConfig2;
        }
        boolean z2 = addressDistrictPageSearchBarConfig.enable;
        if (z2) {
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.ycz);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (FrameLayout) viewFindViewById;
            }
            viewGroup = (ViewGroup) viewFindViewById;
        } else {
            View viewFindViewById2 = this.LLJILJIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.u56);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJIL = (FrameLayout) viewFindViewById2;
            }
            viewGroup = (ViewGroup) viewFindViewById2;
        }
        if (!mS().LLJI && !z2) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        } else {
            C786410Ut5.LJLLLLLL(0, viewGroup);
            Context context4 = getContext();
            if (context4 != null) {
                C1744460vUq<District> c1744460vUq = new C1744460vUq<>(context4);
                C426750GoL.LJIIL(c1744460vUq, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
                c1744460vUq.setBackground(C800330VaR.LIZIZ(c1744460vUq.getContext(), R.drawable.b3z));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1744460vUq);
                c1744460vUq.setLayoutParams(layoutParams);
                this.LLJJIJIL = c1744460vUq;
                c1744460vUq.setSearchLenLimit(1);
                viewGroup.addView(this.LLJJIJIL);
                if (z2) {
                    C1744460vUq<District> c1744460vUq2 = this.LLJJIJIL;
                    if (c1744460vUq2 != null) {
                        c1744460vUq2.LIZIZ(this.LLJJJJLIIL);
                    }
                } else {
                    C1744460vUq<District> c1744460vUq3 = this.LLJJIJIL;
                    if (c1744460vUq3 != null) {
                        c1744460vUq3.LIZIZ(this);
                    }
                }
                mS().LLJILJILJ.observe(this, new AObserverS228S0100000_26(this, 9));
                View view4 = getView();
                if (view4 != null) {
                    C1748720vbi.LIZLLL(view4, new C1747770vaB(), new AwS605S0100000_26(this, 739));
                }
            }
        }
        if (mS().LLJILJIL) {
            C12ES.LJIILL(0, VR());
            C12ES.LJIILL(0, WR());
            if (C1745180vW0.LJFF()) {
                RR();
            }
        } else {
            C0H1U.LIZIZ(VR());
            C0H1U.LIZIZ(WR());
        }
        if (mS().LLJIJIL) {
            C0H1U.LIZIZ(hS());
            C0H1U.LIZIZ(viewGroup);
            View viewFindViewById3 = this.LLJIJIL;
            if (viewFindViewById3 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById3 = view5.findViewById(R.id.ycz);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJIJIL = (FrameLayout) viewFindViewById3;
            }
            C0H1U.LIZIZ(viewFindViewById3);
            View viewFindViewById4 = this.LLJILJIL;
            if (viewFindViewById4 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById4 = view6.findViewById(R.id.u56);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILJIL = (FrameLayout) viewFindViewById4;
            }
            C0H1U.LIZIZ(viewFindViewById4);
            C12ES.LJIILL(0, cS());
            mS().LLJILJILJ.observe(this, new AObserverS228S0100000_26(this, 10));
            C19ME c19me = (C19ME) gS().getLayoutParams();
            c19me.topToBottom = WR().getId();
            C786410Ut5.p6(gS(), c19me);
            cS().setOnClickClearListener(new ACListenerS160S0100000_26(this, 70));
            View view7 = getView();
            if (view7 != null) {
                C1748720vbi.LIZLLL(view7, new C049X(), AFwS268S0000000_26.get$arr$(667));
            }
        } else {
            C12ES.LJIILL(0, hS());
            C12ES.LJIILL(0, viewGroup);
            C0H1U.LIZIZ(cS());
            C0H1U.LIZIZ(VR());
            C0H1U.LIZIZ(WR());
        }
        getChildFragmentManager().LJFF(new InterfaceC21506019Ek() { // from class: X.0vUT
            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeCancelled() {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z3) {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z3) {
            }

            @Override // X.InterfaceC21506019Ek
            public final void onBackStackChanged() {
                int iLJIIJ = C1697810uHb.LJIIJ(this.LL.getChildFragmentManager().LJJLIIIJL());
                this.LL.mS().vQ2().LLLIILIL(iLJIIJ);
                this.LL.hS().LJJ(new AwS132S0101000_26(iLJIIJ, this.LL, 3), Unit.LIZ);
            }
        });
        C948503nH.LJIIIIZZ(this, new C1743200vSo(this, null));
        View viewFindViewById5 = this.LLILZLL;
        if (viewFindViewById5 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById5 = view8.findViewById(R.id.dvy);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZLL = (ConstraintLayout) viewFindViewById5;
        }
        viewFindViewById5.setClickable(true);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            this.LLJJIJI = new KeyBoardVisibilityUtil(getLifecycle(), window, view, null, new AwS640S0100000_26(this, 29));
        }
        SR().setOnInterceptTouchEventListener(new InterfaceC1744370vUh() { // from class: X.0vUU
            @Override // X.InterfaceC1744370vUh
            public final boolean LJI() {
                return ((ArrayList) this.LIZ.mS().LLJJJIL).size() > 0;
            }
        });
        AwS605S0100000_26 awS605S0100000_262 = new AwS605S0100000_26(this, 259);
        View viewFindViewById6 = this.LLIZ;
        if (viewFindViewById6 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById6 = view9.findViewById(R.id.jy2);
            } else {
                viewFindViewById6 = null;
            }
            this.LLIZ = (TuxIconView) viewFindViewById6;
        }
        C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_262, 17), viewFindViewById6);
        View viewFindViewById7 = this.LLIZLLLIL;
        if (viewFindViewById7 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById7 = view10.findViewById(R.id.z4m);
            } else {
                viewFindViewById7 = null;
            }
            this.LLIZLLLIL = (TuxTextView) viewFindViewById7;
        }
        C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_262, 18), viewFindViewById7);
        C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_262, 19), UR());
        C786410Ut5.I7(new AjS44S0200000_26(this, view, 6), kS());
        C1749260vca c1749260vcaCS = cS();
        C1427310nFJ c1427310nFJ = new C1427310nFJ();
        c1427310nFJ.LIZIZ(EnumC1070180dxI.SECONDARY);
        c1427310nFJ.LJI = R.raw.icon_arrow_left_ltr;
        TuxIconView tuxIconView = c1427310nFJ.LJII;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_arrow_left_ltr);
        }
        c1427310nFJ.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(new AwS605S0100000_26(this, 743), (Function1<? super View, Unit>) 261);
        c1427310nFJ.LJFF = aCListenerS154S0100000_19;
        TuxIconView tuxIconView2 = c1427310nFJ.LJII;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, aCListenerS154S0100000_19);
        }
        c1749260vcaCS.setStartAction(c1427310nFJ);
        cS().getEditTextView().addTextChangedListener(new C927503jt() { // from class: X.0vUS
            @Override // X.C927503jt, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                String string7;
                DistrictFragment districtFragment = this.LL;
                if (charSequence != null) {
                    string7 = charSequence.toString();
                } else {
                    string7 = null;
                }
                districtFragment.getClass();
                if (DistrictFragment.nS(string7)) {
                    DistrictFragment districtFragment2 = this.LL;
                    districtFragment2.LLJZ.removeMessages(1);
                    districtFragment2.LLJZ.sendEmptyMessageDelayed(1, 10L);
                } else {
                    this.LL.qS(false, false);
                    this.LL.oS(true);
                }
                if (charSequence != null && charSequence.length() != 0) {
                    DistrictFragment districtFragment3 = this.LL;
                    if (!districtFragment3.LLJLILLLLZIIL) {
                        districtFragment3.LLJLILLLLZIIL = true;
                        View view11 = districtFragment3.getView();
                        if (view11 != null) {
                            C1748720vbi.LIZLLL(view11, new C049X(), AFwS268S0000000_26.get$arr$(670));
                        }
                    }
                }
            }
        });
        cS().getEditTextView().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 11));
        dS().setLayoutManager(new LinearLayoutManager(getContext()));
        dS().setVerticalScrollBarEnabled(false);
        Context context5 = getContext();
        if (context5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context5)) != null) {
            dS().addItemDecoration(new C1058220de0(numLIZJ.intValue(), 0, 0.0f, 6));
        }
        ?? r1 = new SearchResultAdapter() { // from class: X.0vUX
            @Override // com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter
            public final int LLLFZ() {
                return R.layout.ay6;
            }
        };
        this.LLJLIL = r1;
        r1.LLILLL = new InterfaceC747600TUg() { // from class: X.0vUO
            @Override // X.InterfaceC747600TUg
            public final void LIZ(int i2) {
                C1744320vUc<District> c1744320vUc;
                DistrictPage districtPage;
                DistrictData districtData;
                List<District> list2;
                String str6;
                View childAt;
                DistrictData districtData2;
                List<District> list3;
                District district;
                List<C1744320vUc<District>> list4 = this.LIZ.LLJL;
                if (list4 != null && (c1744320vUc = (C1744320vUc) C13LP.LJJJLZIJ(i2, list4)) != null && c1744320vUc.LJ) {
                    this.LIZ.oS(true);
                    this.LIZ.qS(false, false);
                    DistrictFragment districtFragment = this.LIZ;
                    districtFragment.LLLI = true;
                    districtFragment.LLLII = c1744320vUc;
                    View view11 = districtFragment.getView();
                    if (view11 != null) {
                        C1748720vbi.LIZLLL(view11, new C1747730va7(), new AwS107S0201000_26(i2, (int) this.LIZ, (DistrictFragment) c1744320vUc, (C1744320vUc<District>) 4));
                    }
                    ((ArrayList) this.LIZ.mS().LLJJJIL).clear();
                    District district2 = c1744320vUc.LIZ;
                    ArrayList arrayList2 = new ArrayList();
                    District district3 = (District) C13LP.LJJJLZIJ(0, this.LIZ.mS().LLILLJJLI);
                    if (district3 != null && (districtData2 = district3.response) != null && (list3 = districtData2.districts) != null && (district = (District) C13LP.LJJJLZIJ(0, list3)) != null) {
                        DistrictFragment districtFragment2 = this.LIZ;
                        if (Intrinsics.LJFF(district.districtKey, "region")) {
                            ListProtector.add(districtFragment2.mS().LLJJJIL, 0, district);
                            arrayList2.add(new Region(district.name, district.geoNameId, district.code, district.districtKey, district.longitude, district.latitude, null));
                        }
                    }
                    if (Intrinsics.LJFF(district2.hasNextLevel, Boolean.FALSE)) {
                        List<District> list5 = district2.parRegions;
                        if (list5 != null) {
                            for (District district4 : list5) {
                                arrayList2.add(new Region(district4.name, district4.geoNameId, district4.code, district4.districtKey, district4.longitude, district4.latitude, null));
                            }
                        }
                        arrayList2.add(new Region(district2.name, district2.geoNameId, district2.code, district2.districtKey, district2.longitude, district2.latitude, null));
                        this.LIZ.bS().invoke(arrayList2, district2.addressBase);
                        return;
                    }
                    Object objLJJJJZI = C13LP.LJJJJZI(this.LIZ.getChildFragmentManager().LJJLIIIJL());
                    if (objLJJJJZI instanceof DistrictPage) {
                        districtPage = (DistrictPage) objLJJJJZI;
                    } else {
                        districtPage = null;
                    }
                    List<District> list6 = district2.parRegions;
                    if (list6 != null) {
                        DistrictFragment districtFragment3 = this.LIZ;
                        for (District district5 : list6) {
                            district5.code = null;
                            ((ArrayList) districtFragment3.mS().LLJJJIL).add(district5);
                        }
                    }
                    district2.code = null;
                    ((ArrayList) this.LIZ.mS().LLJJJIL).add(district2);
                    if (districtPage != null) {
                        this.LIZ.mS().getClass();
                        C1744700vVE.LJIIJJI(0, districtPage);
                    }
                    if (this.LIZ.mS().vQ2().LLILZIL != 0) {
                        this.LIZ.mS().LLJJJJJIL = true;
                        this.LIZ.mS().vQ2().LLLI(C1697810uHb.LJIILJJIL(((District) ListProtector.get(this.LIZ.mS().LLJJJIL, 0)).name));
                        RecyclerView recyclerViewGS = this.LIZ.gS();
                        if (recyclerViewGS != null && (childAt = recyclerViewGS.getChildAt(0)) != null) {
                            childAt.performClick();
                        }
                        this.LIZ.PR();
                        return;
                    }
                    District district6 = (District) C13LP.LJJJLZIJ(0, this.LIZ.mS().LLILLJJLI);
                    if (district6 != null && (districtData = district6.response) != null && (list2 = districtData.districts) != null) {
                        DistrictFragment districtFragment4 = this.LIZ;
                        int i3 = 0;
                        for (District district7 : list2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                String str7 = district7.geoNameId;
                                District district8 = (District) C13LP.LJJJLZIJ(0, districtFragment4.mS().LLJJJIL);
                                if (district8 != null) {
                                    str6 = district8.geoNameId;
                                } else {
                                    str6 = null;
                                }
                                if (Intrinsics.LJFF(str7, str6) && districtPage != null) {
                                    RecyclerView recyclerViewPR = districtPage.PR();
                                    if (recyclerViewPR != null) {
                                        HandlerHook.viewPost(recyclerViewPR, new ARunnableS95S0200000_26(districtFragment4, districtPage, 45));
                                    }
                                    if (districtPage != null) {
                                        districtPage.MR(i3);
                                    }
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                }
            }
        };
        dS().setAdapter(this.LLJLIL);
    }

    public final void qS(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                RecyclerView recyclerViewDS = dS();
                if (recyclerViewDS != null) {
                    C12ES.LJIILL(0, recyclerViewDS);
                }
                LinearLayout linearLayoutAS = aS();
                if (linearLayoutAS != null) {
                    C0H1U.LIZIZ(linearLayoutAS);
                    return;
                }
                return;
            }
            RecyclerView recyclerViewDS2 = dS();
            if (recyclerViewDS2 != null) {
                C0H1U.LIZIZ(recyclerViewDS2);
            }
            LinearLayout linearLayoutAS2 = aS();
            if (linearLayoutAS2 == null) {
                return;
            }
            C12ES.LJIILL(0, linearLayoutAS2);
            return;
        }
        RecyclerView recyclerViewDS3 = dS();
        if (recyclerViewDS3 != null) {
            C0H1U.LIZIZ(recyclerViewDS3);
        }
        LinearLayout linearLayoutAS3 = aS();
        if (linearLayoutAS3 != null) {
            C0H1U.LIZIZ(linearLayoutAS3);
        }
        this.LLLIIII = false;
        if (this.LLLIIIIL == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLLIIIIL;
        View view = getView();
        if (view != null) {
            C1748720vbi.LIZLLL(view, new C1747750va9(), new AwS57S0100100_26(jElapsedRealtime, this, 1));
        }
        this.LLLIIIIL = 0L;
    }

    @Override // X.InterfaceC1744490vUt
    public final void EC(C1744320vUc<District> c1744320vUc, int i, int i2) {
        AddressBase addressBase;
        List<District> list;
        District district;
        List<District> list2;
        AddressBase addressBase2;
        List<District> list3;
        District district2;
        this.LLLI = true;
        this.LLLII = c1744320vUc;
        View view = getView();
        if (view != null) {
            C1748720vbi.LIZLLL(view, new C1747730va7(), new AwS28S0202000_26(i, i2, this, c1744320vUc, 0));
        }
        int iLJIIJ = C1697810uHb.LJIIJ(getChildFragmentManager().LJJLIIIJL());
        if (iLJIIJ >= ((ArrayList) mS().LLILLJJLI).size()) {
            return;
        }
        String str = null;
        if (c1744320vUc.LIZ.multilevelDistricts != null) {
            int i3 = iLJIIJ + 1;
            if (((ArrayList) mS().LLILLJJLI).size() > i3) {
                ((ArrayList) mS().LLILLJJLI).subList(i3, ((ArrayList) mS().LLILLJJLI).size()).clear();
            }
            Object obj = ListProtector.get(mS().LLILLJJLI, 0);
            ((ArrayList) mS().LLILLJJLI).clear();
            ((ArrayList) mS().LLILLJJLI).add(obj);
            List<District> list4 = c1744320vUc.LIZ.multilevelDistricts;
            if (list4 != null) {
                for (District district3 : list4) {
                    C13LP.LL(mS().LLILLJJLI, 1);
                    ((ArrayList) mS().LLILLJJLI).add(district3);
                }
            }
            List<District> listLJJJJIZL = C13LP.LJJJJIZL(mS().LLILLJJLI, 1);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJIZL, 10));
            for (District district4 : listLJJJJIZL) {
                arrayList.add(new Region(district4.name, district4.geoNameId, district4.code, district4.districtKey, district4.longitude, district4.latitude, null));
            }
            DistrictData districtData = ((District) ListProtector.get(mS().LLILLJJLI, iLJIIJ)).response;
            Function2<List<Region>, AddressBase, Unit> function2BS = bS();
            District district5 = (District) C13LP.LJJLIIIJL(mS().LLILLJJLI);
            if (district5 != null) {
                addressBase2 = district5.addressBase;
            } else {
                addressBase2 = null;
            }
            function2BS.invoke(arrayList, addressBase2);
            C1744200vUQ c1744200vUQWQ2 = mS().wQ2();
            if (districtData != null && (list3 = districtData.districts) != null && (district2 = (District) C13LP.LJJJLZIJ(0, list3)) != null) {
                str = district2.districtKey;
            }
            c1744200vUQWQ2.LIZ("save", str);
            PR();
            return;
        }
        DistrictPage districtPage = (DistrictPage) ListProtector.get(getChildFragmentManager().LJJLIIIJL(), iLJIIJ);
        DistrictData districtData2 = ((District) ListProtector.get(mS().LLILLJJLI, iLJIIJ)).response;
        if (districtData2 != null && (list2 = districtData2.districts) != null) {
            int i4 = 0;
            for (District district6 : list2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    if (Intrinsics.LJFF(district6.geoNameId, c1744320vUc.LIZ.geoNameId)) {
                        districtPage.MR(i4);
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        int i6 = iLJIIJ + 1;
        if (((ArrayList) mS().LLILLJJLI).size() <= i6) {
            ((ArrayList) mS().LLILLJJLI).add(c1744320vUc.LIZ);
        } else if (!Intrinsics.LJFF(((District) ListProtector.get(mS().LLILLJJLI, i6)).geoNameId, c1744320vUc.LIZ.geoNameId)) {
            ((ArrayList) mS().LLILLJJLI).subList(i6, ((ArrayList) mS().LLILLJJLI).size()).clear();
            ((ArrayList) mS().LLILLJJLI).add(c1744320vUc.LIZ);
        }
        List<District> listLJJJJIZL2 = C13LP.LJJJJIZL(mS().LLILLJJLI, 1);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJIZL2, 10));
        for (District district7 : listLJJJJIZL2) {
            arrayList2.add(new Region(district7.name, district7.geoNameId, district7.code, district7.districtKey, district7.longitude, district7.latitude, null));
        }
        DistrictData districtData3 = ((District) ListProtector.get(mS().LLILLJJLI, iLJIIJ)).response;
        if (districtData3 != null && Intrinsics.LJFF(districtData3.hasNextLevel, Boolean.TRUE) && iLJIIJ < mS().LL) {
            C1744420vUm c1744420vUmVQ2 = mS().vQ2();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Region) it2.next()).name);
            }
            c1744420vUmVQ2.LLLI(arrayList3);
            C1744420vUm c1744420vUmVQ22 = mS().vQ2();
            if (arrayList2.size() <= i6) {
                i6 = -1;
            }
            c1744420vUmVQ22.LLLIILIL(i6);
            C948503nH.LJIIIIZZ(this, new C1743220vSq(this, iLJIIJ, null));
        } else {
            Function2<List<Region>, AddressBase, Unit> function2BS2 = bS();
            District district8 = (District) C13LP.LJJLIIIJL(mS().LLILLJJLI);
            if (district8 != null) {
                addressBase = district8.addressBase;
            } else {
                addressBase = null;
            }
            function2BS2.invoke(arrayList2, addressBase);
            C1744200vUQ c1744200vUQWQ22 = mS().wQ2();
            if (districtData3 != null && (list = districtData3.districts) != null && (district = (District) C13LP.LJJJLZIJ(0, list)) != null) {
                str = district.districtKey;
            }
            c1744200vUQWQ22.LIZ("save", str);
        }
        PR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZJ = C0H1U.LIZJ(R.layout.am8, viewGroup, false);
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

    @Override // X.InterfaceC1744450vUp
    public final void p(View view, boolean z, String str) {
        int length;
        String str2;
        int length2 = 0;
        if (z) {
            if (str != null) {
                length2 = str.length();
            }
            this.LLLFZ = length2;
            this.LLLFFI = SystemClock.elapsedRealtime();
            View view2 = getView();
            if (view2 != null) {
                C1748720vbi.LIZLLL(view2, new C10510049c(), new AwS605S0100000_26(this, 256));
                return;
            }
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLLFFI;
        if (str != null) {
            length = str.length();
        } else {
            length = -this.LLLFZ;
        }
        if (length > 0) {
            str2 = "add";
        } else if (length < 0) {
            str2 = "del";
        } else {
            str2 = "";
        }
        View view3 = getView();
        if (view3 != null) {
            C1748720vbi.LIZLLL(view3, new C10511049d(), new AwS5S2100100_26(jElapsedRealtime, str2, str, this, 0));
        }
        this.LLLI = false;
    }
}
