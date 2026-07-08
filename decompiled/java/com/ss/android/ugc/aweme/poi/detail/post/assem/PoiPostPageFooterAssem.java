package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.C061S;
import X.C1184530gvj;
import X.C1185410gx9;
import X.C1187610h0h;
import X.C1188530h2B;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2255108sX;
import X.C337180DJs;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS211S0300000_2;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageFooterAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C061S.class, "PoiPostPageHierarchyData"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e66;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1187610h0h c1187610h0h;
        boolean zBooleanValue;
        String name;
        String address;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String collectInfo;
        Boolean boolIsCollected;
        super.onViewCreated(view);
        C061S c061s = (C061S) this.LLJJI.getValue();
        C1185410gx9 c1185410gx9 = null;
        Object[] objArr = 0;
        if (c061s != null && (c1187610h0h = c061s.LL) != null) {
            String str = c1187610h0h.poiId;
            PoiListApi.PoiDetailResponse poiDetailResponse = c1187610h0h.poiDetailResponse;
            if (poiDetailResponse != null && (boolIsCollected = poiDetailResponse.isCollected()) != null) {
                zBooleanValue = boolIsCollected.booleanValue();
            } else {
                zBooleanValue = false;
            }
            int i = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            PoiListApi.PoiDetailResponse poiDetailResponse2 = c1187610h0h.poiDetailResponse;
            if (poiDetailResponse2 != null) {
                name = poiDetailResponse2.getName();
            } else {
                name = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponse3 = c1187610h0h.poiDetailResponse;
            if (poiDetailResponse3 != null) {
                address = poiDetailResponse3.getAddress();
            } else {
                address = null;
            }
            C1185410gx9 c1185410gx92 = c1187610h0h.poiDetailParams;
            if (c1185410gx92 != null) {
                initialEnterFrom = c1185410gx92.getInitialEnterFrom();
            } else {
                initialEnterFrom = null;
            }
            C1185410gx9 c1185410gx93 = c1187610h0h.poiDetailParams;
            if (c1185410gx93 != null) {
                initialEnterMethod = c1185410gx93.getInitialEnterMethod();
            } else {
                initialEnterMethod = null;
            }
            C1185410gx9 c1185410gx94 = c1187610h0h.poiDetailParams;
            if (c1185410gx94 != null) {
                initialPoiFromGroupId = c1185410gx94.getInitialPoiFromGroupId();
            } else {
                initialPoiFromGroupId = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponse4 = c1187610h0h.poiDetailResponse;
            if (poiDetailResponse4 != null) {
                collectInfo = poiDetailResponse4.getCollectInfo();
            } else {
                collectInfo = null;
            }
            C723850SaN.LIZLLL(this, new AwS211S0300000_2(this, new C1184530gvj(str, zBooleanValue, i, name, address, (boolean) (objArr3 == true ? 1 : 0), new C1188530h2B(null, "bottom_operate_btn", null, 0, null, null, null, null, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, collectInfo, new LinkedHashMap(), null, null, null, null, new LinkedHashMap()), c1185410gx9, (Boolean) (objArr == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), 1956), c1187610h0h, 0));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiPostPageFooterAbility iPoiPostPageFooterAbility = new IPoiPostPageFooterAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageFooterAssem.onViewCreated.1
                @Override // com.ss.android.ugc.aweme.poi.detail.post.assem.IPoiPostPageFooterAbility
                public final void kf() {
                    C337180DJs.LIZ(PoiPostPageFooterAssem.this.LJJIJL());
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.post.assem.IPoiPostPageFooterAbility
                public final void qb() {
                    C337180DJs.LIZJ(PoiPostPageFooterAssem.this.LJJIJL());
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiPostPageFooterAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiPostPageFooterAbility, IPoiPostPageFooterAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiPostPageFooterAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiPostPageFooterAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiPostPageFooterAbility.class.getClassLoader(), new Class[]{IPoiPostPageFooterAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiPostPageFooterAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.post.assem.IPoiPostPageFooterAbility");
            }
        }
    }
}
