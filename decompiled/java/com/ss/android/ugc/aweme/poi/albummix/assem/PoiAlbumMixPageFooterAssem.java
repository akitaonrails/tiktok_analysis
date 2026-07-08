package com.ss.android.ugc.aweme.poi.albummix.assem;

import X.C01GW;
import X.C1184530gvj;
import X.C1185360gx4;
import X.C1185370gx5;
import X.C1185410gx9;
import X.C1188530h2B;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C197039127h;
import X.C2211631BhB;
import X.C2255108sX;
import X.C337180DJs;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixPageFooterAssem extends UISlotAssem {
    public C197039127h LLJJI;
    public ViewGroup LLJJIII;
    public ViewGroup LLJJIJI;
    public View LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL = new C1559260qg8(new C723580SZw(this, C1185370gx5.class, "PoiAlbumMixHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 854));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 853));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dyc;
    }

    public final PoiCurrentSessionInfo hp() {
        PoiCurrentSessionInfo poiCurrentSessionInfo;
        C1185370gx5 c1185370gx5 = (C1185370gx5) this.LLJJIJIL.getValue();
        return (c1185370gx5 == null || (poiCurrentSessionInfo = c1185370gx5.LLIZLLLIL) == null) ? new PoiCurrentSessionInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) : poiCurrentSessionInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object objLJJJLL;
        boolean z;
        String str;
        boolean zBooleanValue;
        super.onViewCreated(view);
        this.LLJJI = (C197039127h) view.findViewById(R.id.azh);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.r2f);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.r2c);
        this.LLJJIJIIJIL = view.findViewById(R.id.qwe);
        List<AnchorComponentInfo> list = hp().anchorModuleList;
        C1185410gx9 c1185410gx9 = null;
        Object[] objArr = 0;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (objLJJJLL != null) {
            z = true;
        } else {
            z = false;
        }
        C1185370gx5 c1185370gx5 = (C1185370gx5) this.LLJJIJIL.getValue();
        if (c1185370gx5 == null || (str = c1185370gx5.LL) == null) {
            str = "";
        }
        Boolean boolIsCollected = hp().isCollected();
        if (boolIsCollected != null) {
            zBooleanValue = boolIsCollected.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C723850SaN.LIZLLL(this, new AwS384S0200000_18(this, new C1184530gvj(str, zBooleanValue, 0, hp().poiName, hp().poiAddress, (boolean) (0 == true ? 1 : 0), new C1188530h2B("album_page", "bottom_operate_btn", null, 0, null, null, null, null, hp().initialPoiEnterFrom, hp().initialPoiEnterMethod, hp().initialPoiFromGroupId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hp().collectInfo, new LinkedHashMap(), null, null, null, null, new LinkedHashMap()), c1185410gx9, (Boolean) (objArr == true ? 1 : 0), !z, 932), 227));
        C337180DJs.LIZ(LJJIJL());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiAlbumMixPageFooterAbility iPoiAlbumMixPageFooterAbility = new IPoiAlbumMixPageFooterAbility() { // from class: com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageFooterAssem.onViewCreated.1
                @Override // com.ss.android.ugc.aweme.poi.albummix.assem.IPoiAlbumMixPageFooterAbility
                public final void jf() {
                    AnchorComponentInfo anchorComponentInfo;
                    PoiAlbumMixPageFooterAssem poiAlbumMixPageFooterAssem = PoiAlbumMixPageFooterAssem.this;
                    poiAlbumMixPageFooterAssem.getClass();
                    C1185360gx4.LIZ.getClass();
                    boolean zLIZ = C1185360gx4.LIZ();
                    if (!Intrinsics.LJFF(poiAlbumMixPageFooterAssem.hp().enableBottomBar, Boolean.TRUE)) {
                        View view2 = poiAlbumMixPageFooterAssem.LLJJIJIIJIL;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(zLIZ ? 0 : 8, view2);
                        }
                        ViewGroup viewGroup = poiAlbumMixPageFooterAssem.LLJJIJI;
                        if (viewGroup != null) {
                            C786410Ut5.LJLZ(8, viewGroup);
                        }
                        ViewGroup viewGroup2 = poiAlbumMixPageFooterAssem.LLJJIII;
                        if (viewGroup2 != null) {
                            C786410Ut5.LJLZ(zLIZ ? 0 : 8, viewGroup2);
                        }
                        C197039127h c197039127h = poiAlbumMixPageFooterAssem.LLJJI;
                        if (c197039127h != null) {
                            C786410Ut5.LLLLLLJ(c197039127h, 8);
                            return;
                        }
                        return;
                    }
                    View view3 = poiAlbumMixPageFooterAssem.LLJJIJIIJIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    ViewGroup viewGroup3 = poiAlbumMixPageFooterAssem.LLJJIJI;
                    if (viewGroup3 != null) {
                        C786410Ut5.LJLZ(0, viewGroup3);
                    }
                    ViewGroup viewGroup4 = poiAlbumMixPageFooterAssem.LLJJIII;
                    if (viewGroup4 != null) {
                        C786410Ut5.LJLZ(zLIZ ? 0 : 8, viewGroup4);
                    }
                    C197039127h c197039127h2 = poiAlbumMixPageFooterAssem.LLJJI;
                    if (c197039127h2 != null) {
                        List<AnchorComponentInfo> list2 = poiAlbumMixPageFooterAssem.hp().anchorModuleList;
                        if (list2 == null || (anchorComponentInfo = (AnchorComponentInfo) C13LP.LJJJLL(list2)) == null) {
                            C786410Ut5.LLLLLLJ(c197039127h2, 8);
                            return;
                        }
                        C786410Ut5.LLLLLLJ(c197039127h2, 0);
                        String str2 = anchorComponentInfo.text;
                        if (str2 == null) {
                            str2 = "";
                        }
                        c197039127h2.setText(str2);
                        C2211631BhB.LJ(c197039127h2, new AwS227S0300000_18(poiAlbumMixPageFooterAssem, anchorComponentInfo, c197039127h2, 54));
                        C786410Ut5.I7(new AkS28S0300000_18(c197039127h2, poiAlbumMixPageFooterAssem, anchorComponentInfo, 16), c197039127h2);
                    }
                }

                @Override // com.ss.android.ugc.aweme.poi.albummix.assem.IPoiAlbumMixPageFooterAbility
                public final void kf() {
                    C337180DJs.LIZ(PoiAlbumMixPageFooterAssem.this.LJJIJL());
                }

                @Override // com.ss.android.ugc.aweme.poi.albummix.assem.IPoiAlbumMixPageFooterAbility
                public final void qb() {
                    C337180DJs.LIZJ(PoiAlbumMixPageFooterAssem.this.LJJIJL());
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiAlbumMixPageFooterAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiAlbumMixPageFooterAbility, IPoiAlbumMixPageFooterAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiAlbumMixPageFooterAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiAlbumMixPageFooterAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiAlbumMixPageFooterAbility.class.getClassLoader(), new Class[]{IPoiAlbumMixPageFooterAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiAlbumMixPageFooterAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.albummix.assem.IPoiAlbumMixPageFooterAbility");
            }
        }
    }
}
