package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.C01GW;
import X.C061S;
import X.C1077410e8x;
import X.C1077420e8y;
import X.C1187610h0h;
import X.C1187980h1I;
import X.C1203130hPj;
import X.C1203140hPk;
import X.C1203200hPq;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2255108sX;
import X.C339190DRl;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1203170hPn;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageTagAssem;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageTagAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C061S.class, "PoiPostPageHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1184));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1183));
    public final Map<Integer, PoiListApi.PostTag> LLJIJIL = new LinkedHashMap();
    public PoiListApi.PostTag LLJILJIL;
    public C1203130hPj LLJILJILJ;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        C1187610h0h c1187610h0h;
        Integer num;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        PageFinder pageFinderVia;
        super.onViewCreated(view);
        C1203130hPj c1203130hPj = (C1203130hPj) view.findViewById(R.id.r6t);
        this.LLJILJILJ = c1203130hPj;
        if (c1203130hPj != null) {
            c1203130hPj.setHorizontalMargin(16);
        }
        List list = (List) this.LLJI.getValue();
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!(!z)) {
            C339190DRl.LIZIZ(this.LLJILJILJ);
        } else {
            C1203130hPj c1203130hPj2 = this.LLJILJILJ;
            if (c1203130hPj2 != null) {
                C339190DRl.LIZLLL(c1203130hPj2);
            }
            ((LinkedHashMap) this.LLJIJIL).clear();
            ArrayList arrayList = new ArrayList();
            List<PoiListApi.PostTag> list2 = (List) this.LLJI.getValue();
            if (list2 != null) {
                int i = 0;
                for (PoiListApi.PostTag postTag : list2) {
                    String str = postTag.tagName;
                    if (str != null && str.length() != 0) {
                        arrayList.add(new C1203140hPk(postTag.tagName, null, 14));
                        this.LLJIJIL.put(Integer.valueOf(i), postTag);
                        int i2 = i + 1;
                        C1187980h1I c1187980h1I = C1187980h1I.LIZ;
                        Fragment fragmentLJI = C724240Sb0.LJI(this);
                        if (fragmentLJI != null) {
                            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
                        } else {
                            interfaceC665370Q7zLJFF = null;
                        }
                        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                        if (fragmentLJI2 != null) {
                            pageFinderVia = PageFinder.via(fragmentLJI2);
                        } else {
                            pageFinderVia = null;
                        }
                        String str2 = postTag.tagCode;
                        c1187980h1I.getClass();
                        C1187980h1I.LIZIZ(interfaceC665370Q7zLJFF, pageFinderVia, str2, i);
                        i = i2;
                    }
                }
            }
            C1203130hPj c1203130hPj3 = this.LLJILJILJ;
            if (c1203130hPj3 != null) {
                c1203130hPj3.setChips(arrayList);
            }
            C061S c061s = (C061S) this.LLIZLLLIL.getValue();
            if (c061s != null && (c1187610h0h = c061s.LL) != null && (num = c1187610h0h.selectedTagIndex) != null && ((LinkedHashMap) this.LLJIJIL).get(num) != null) {
                this.LLJILJIL = (PoiListApi.PostTag) ((LinkedHashMap) this.LLJIJIL).get(num);
                C1203130hPj c1203130hPj4 = this.LLJILJILJ;
                if (c1203130hPj4 != null) {
                    c1203130hPj4.LIZ(num.intValue(), true, C1203200hPq.LIZ);
                }
                PoiPostPageShareVM poiPostPageShareVM = (PoiPostPageShareVM) this.LLJ.getValue();
                if (poiPostPageShareVM != null) {
                    poiPostPageShareVM.IQ2((PoiListApi.PostTag) ((LinkedHashMap) this.LLJIJIL).get(num));
                }
            }
        }
        C1203130hPj c1203130hPj5 = this.LLJILJILJ;
        if (c1203130hPj5 != null) {
            c1203130hPj5.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0h21
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i3, boolean z2, AbstractC1203190hPp abstractC1203190hPp) {
                    InterfaceC665370Q7z interfaceC665370Q7zLJFF2;
                    PageFinder pageFinderVia2;
                    if (!Intrinsics.LJFF(abstractC1203190hPp, C1203210hPr.LIZ)) {
                        return;
                    }
                    PoiListApi.PostTag postTag2 = (PoiListApi.PostTag) ((LinkedHashMap) this.LIZ.LLJIJIL).get(Integer.valueOf(i3));
                    if (postTag2 != null && z2) {
                        PoiPostPageTagAssem poiPostPageTagAssem = this.LIZ;
                        poiPostPageTagAssem.LLJILJIL = postTag2;
                        C1187980h1I c1187980h1I2 = C1187980h1I.LIZ;
                        Fragment fragmentLJI3 = C724240Sb0.LJI(poiPostPageTagAssem);
                        String str3 = null;
                        if (fragmentLJI3 != null) {
                            interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI3, null);
                        } else {
                            interfaceC665370Q7zLJFF2 = null;
                        }
                        Fragment fragmentLJI4 = C724240Sb0.LJI(this.LIZ);
                        if (fragmentLJI4 != null) {
                            pageFinderVia2 = PageFinder.via(fragmentLJI4);
                        } else {
                            pageFinderVia2 = null;
                        }
                        PoiListApi.PostTag postTag3 = this.LIZ.LLJILJIL;
                        if (postTag3 != null) {
                            str3 = postTag3.tagCode;
                        }
                        c1187980h1I2.getClass();
                        C1187980h1I.LIZ(interfaceC665370Q7zLJFF2, pageFinderVia2, str3, i3);
                        PoiPostPageShareVM poiPostPageShareVM2 = (PoiPostPageShareVM) this.LIZ.LLJ.getValue();
                        if (poiPostPageShareVM2 != null) {
                            poiPostPageShareVM2.IQ2(this.LIZ.LLJILJIL);
                        }
                        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) this.LIZ.LLJ.getValue();
                        if (assemSingleListViewModel != null) {
                            assemSingleListViewModel.manualListRefresh();
                        }
                    }
                }
            });
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI3, null);
            IPoiPostPageTagClickAbility iPoiPostPageTagClickAbility = new IPoiPostPageTagClickAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageTagAssem$initAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.post.assem.IPoiPostPageTagClickAbility
                public final void LJLIIL() {
                    RecyclerView recyclerView;
                    C1203130hPj c1203130hPj6 = this.LL.LLJILJILJ;
                    if (c1203130hPj6 != null) {
                        c1203130hPj6.setClickable(true);
                    }
                    C1203130hPj c1203130hPj7 = this.LL.LLJILJILJ;
                    if (c1203130hPj7 == null || (recyclerView = c1203130hPj7.getRecyclerView()) == null) {
                        return;
                    }
                    Iterator it2 = new C1077420e8y(recyclerView, 9).iterator();
                    while (true) {
                        C1077410e8x c1077410e8x = (C1077410e8x) it2;
                        if (!c1077410e8x.hasNext()) {
                            return;
                        } else {
                            ((View) c1077410e8x.next()).setClickable(true);
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.post.assem.IPoiPostPageTagClickAbility
                public final void LLILZIL() {
                    RecyclerView recyclerView;
                    C1203130hPj c1203130hPj6 = this.LL.LLJILJILJ;
                    if (c1203130hPj6 != null) {
                        c1203130hPj6.setClickable(false);
                    }
                    C1203130hPj c1203130hPj7 = this.LL.LLJILJILJ;
                    if (c1203130hPj7 == null || (recyclerView = c1203130hPj7.getRecyclerView()) == null) {
                        return;
                    }
                    Iterator it2 = new C1077420e8y(recyclerView, 8).iterator();
                    while (true) {
                        C1077410e8x c1077410e8x = (C1077410e8x) it2;
                        if (!c1077410e8x.hasNext()) {
                            return;
                        } else {
                            ((View) c1077410e8x.next()).setClickable(false);
                        }
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, IPoiPostPageTagClickAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF2, iPoiPostPageTagClickAbility, IPoiPostPageTagClickAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiPostPageTagClickAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiPostPageTagClickAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiPostPageTagClickAbility.class.getClassLoader(), new Class[]{IPoiPostPageTagClickAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance, IPoiPostPageTagClickAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.post.assem.IPoiPostPageTagClickAbility");
            }
        }
    }
}
