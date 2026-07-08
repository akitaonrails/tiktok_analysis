package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.C01GW;
import X.C1184440gva;
import X.C1188240h1i;
import X.C1189060h32;
import X.C1207004ns;
import X.C1558360qeg;
import X.C1558520qew;
import X.C20642515q3;
import X.C2255108sX;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailPostHeaderAssem extends UISlotAssem {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1219));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1220));
    public boolean LLJJIJI = true;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0j;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, getContentView());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiDetailPostDataChangeAbility iPoiDetailPostDataChangeAbility = new IPoiDetailPostDataChangeAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostHeaderAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostDataChangeAbility
                public final void V02(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
                    boolean z;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModel;
                    String strLJI;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModel2;
                    PoiDetailPostHeaderAssem poiDetailPostHeaderAssem = this.LL;
                    if (!poiDetailPostHeaderAssem.LLJJIJI) {
                        return;
                    }
                    if (poiMergedListResponse != null) {
                        poiDetailPostHeaderAssem.LLJJIJI = false;
                    }
                    if (poiMergedListResponse != null && poiMergedListResponse.hasMultiTab$poi_release()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C786410Ut5.LJLLLLLL(8, this.LL.getContentView());
                        return;
                    }
                    if (poiMergedListResponse != null && poiMergedListResponse.hasMergedList$poi_release()) {
                        C786410Ut5.LJLLLLLL(0, this.LL.getContentView());
                        PoiVideoListSharedViewModel poiVideoListSharedViewModel3 = (PoiVideoListSharedViewModel) this.LL.LLJJIII.getValue();
                        if (poiVideoListSharedViewModel3 != null && poiVideoListSharedViewModel3.FQ2()) {
                            C1189060h32.LJJII(((C1188240h1i) this.LL.LLJJI.getValue()).LLILLJJLI, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                        }
                        PoiDetailPostHeaderAssem poiDetailPostHeaderAssem2 = this.LL;
                        TuxTextView tuxTextView = ((C1188240h1i) poiDetailPostHeaderAssem2.LLJJI.getValue()).LLILLJJLI;
                        if (C1207004ns.LIZ() && ((poiVideoListSharedViewModel2 = (PoiVideoListSharedViewModel) poiDetailPostHeaderAssem2.LLJJIII.getValue()) == null || !poiVideoListSharedViewModel2.HQ2())) {
                            C1184440gva c1184440gva = C1207004ns.LIZIZ;
                            tuxTextView.setTuxFont(23);
                            tuxTextView.setTextSize(c1184440gva.LJI);
                            tuxTextView.setMinTextSize(c1184440gva.LJII);
                            tuxTextView.setMaxLines(1);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                        PoiVideoListSharedViewModel poiVideoListSharedViewModel4 = (PoiVideoListSharedViewModel) poiDetailPostHeaderAssem2.LLJJIII.getValue();
                        if ((poiVideoListSharedViewModel4 != null && poiVideoListSharedViewModel4.HQ2()) || (poiVideoListSharedViewModel = (PoiVideoListSharedViewModel) poiDetailPostHeaderAssem2.LLJJIII.getValue()) == null || !poiVideoListSharedViewModel.FQ2()) {
                            strLJI = C20642515q3.LJI(2131858572);
                        } else {
                            strLJI = C20642515q3.LJI(2131844770);
                        }
                        tuxTextView.setText(strLJI);
                        return;
                    }
                    C786410Ut5.LJLLLLLL(8, this.LL.getContentView());
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiDetailPostDataChangeAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiDetailPostDataChangeAbility, IPoiDetailPostDataChangeAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiDetailPostDataChangeAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiDetailPostDataChangeAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiDetailPostDataChangeAbility.class.getClassLoader(), new Class[]{IPoiDetailPostDataChangeAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiDetailPostDataChangeAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostDataChangeAbility");
            }
        }
    }
}
