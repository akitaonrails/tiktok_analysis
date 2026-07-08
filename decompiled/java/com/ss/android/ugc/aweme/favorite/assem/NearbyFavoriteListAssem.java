package com.ss.android.ugc.aweme.favorite.assem;

import X.C019F;
import X.C01GW;
import X.C1172110gbh;
import X.C1192290h8F;
import X.C1201930hNn;
import X.C13LE;
import X.C14EU;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20603715jn;
import X.C20684815ws;
import X.C2217381BqS;
import X.C452501pT;
import X.C614900O9w;
import X.C622680Oba;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1157530gEB;
import X.InterfaceC1207490hWl;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.favorite.NearbyFavoriteListViewModel;
import com.ss.android.ugc.aweme.favorite.NearbyFavoriteMobParams;
import com.ss.android.ugc.aweme.favorite.NearbyFavoritePageParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFavoriteListAssem extends UIListContentAssem<NearbyFavoriteListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public NearbyFavoriteMobParams LLJ;
    public NearbyFavoritePageParams LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyFavoriteListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/favorite/NearbyFavoriteListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NearbyFavoriteListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NearbyFavoriteListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 424), AFwS256S0000000_18.get$arr$(81), null, true);
        this.LLJIJIL = true;
        this.LLJILJIL = "favorite_places";
        this.LLJILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(186));
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 422));
        this.LLJJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 423));
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 224));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final NearbyFavoriteListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (NearbyFavoriteListViewModel) assemVMLazy.getValue();
    }

    public final void No() {
        EnumC1157530gEB scene;
        String enterFrom;
        if (this.LLJIJIL) {
            NearbyFavoritePageParams nearbyFavoritePageParams = this.LLJI;
            if (nearbyFavoritePageParams == null || (scene = nearbyFavoritePageParams.getScene()) == null) {
                scene = EnumC1157530gEB.NORMAL_LIST;
            }
            if (scene == EnumC1157530gEB.RE_VISIT) {
                C1201930hNn c1201930hNn = C1201930hNn.LIZ;
                String str = this.LLJILJIL;
                c1201930hNn.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "homepage_nearby");
                linkedHashMap.put("enter_method", "favorite_poi_carousel");
                if (str != null) {
                    linkedHashMap.put("displayed_items", str);
                }
                C20684815ws.LJIILLIIL("enter_favourite_places", linkedHashMap);
                return;
            }
            C1201930hNn c1201930hNn2 = C1201930hNn.LIZ;
            NearbyFavoriteMobParams nearbyFavoriteMobParams = this.LLJ;
            if (nearbyFavoriteMobParams == null || (enterFrom = nearbyFavoriteMobParams.getEnterFrom()) == null) {
                enterFrom = "";
            }
            c1201930hNn2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("enter_from", enterFrom);
            linkedHashMap2.put("enter_method", "favorite_poi_toast");
            C20684815ws.LJIILLIIL("enter_favourite_places", linkedHashMap2);
        }
    }

    public final void Oo() {
        C1749280vcc c1749280vcc;
        C1722300uv6 c1722300uv6 = (C1722300uv6) this.LLJJI.getValue();
        if (c1722300uv6 != null && (c1749280vcc = this.LLJILJILJ) != null) {
            c1749280vcc.setStatus(c1722300uv6);
        }
        this.LLJILJIL = "no_favorite_explore_nearby";
        C786410Ut5.LLF(8, Go());
        C1749280vcc c1749280vcc2 = this.LLJILJILJ;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
    }

    public final void retry() {
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C1749280vcc c1749280vcc2 = this.LLJILJILJ;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        C786410Ut5.LLF(8, Go());
        Jo().manualListRefresh();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, context);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        String str;
        C1172110gbh c1172110gbh;
        LinearLayoutManager linearLayoutManager;
        String str2;
        C1172110gbh c1172110gbh2;
        if (c614900O9w.LIZ) {
            if (((ArrayList) Go().getState().LJII()).isEmpty()) {
                C786410Ut5.LLF(0, Go());
                C1749280vcc c1749280vcc = this.LLJILJILJ;
                if (c1749280vcc != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                }
            }
            ArrayList arrayList = (ArrayList) Go().getState().LJII();
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            if (it2 != null) {
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if ((next instanceof C1172110gbh) && (c1172110gbh2 = (C1172110gbh) next) != null) {
                        str2 = c1172110gbh2.LLILLL;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, c614900O9w.LIZIZ)) {
                        it2.remove();
                        z = true;
                    }
                }
            }
            if (z) {
                Go().getState().LJIIJJI(arrayList, null);
            }
            C20600815jK.LIZIZ(Go().getState(), 0, new C1172110gbh(c614900O9w.LIZJ, c614900O9w.LIZLLL, c614900O9w.LIZIZ, 56));
            RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                HandlerHook.viewPost(Go(), new ARunnableS118S0100000_18(this, 9));
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) Go().getState().LJII();
        Iterator it3 = arrayList2.iterator();
        if (it3 != null) {
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if ((next2 instanceof C1172110gbh) && (c1172110gbh = (C1172110gbh) next2) != null) {
                    str = c1172110gbh.LLILLL;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, c614900O9w.LIZIZ)) {
                    it3.remove();
                }
            }
        }
        Go().getState().LJIIJJI(arrayList2, null);
        if (((ArrayList) Go().getState().LJII()).isEmpty()) {
            Oo();
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NearbyFavoriteMobParams nearbyFavoriteMobParams;
        super.onViewCreated(view);
        this.LLJILJILJ = (C1749280vcc) view.findViewById(R.id.w28);
        Go().LJIILJJIL(NearbyFavoriteListCell.class);
        NearbyFavoritePageParams nearbyFavoritePageParams = null;
        C1192290h8F.LIZ(this, "poi_collections_in_other_page", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 696));
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gbf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1172070gbd c1172070gbd = (C1172070gbd) obj;
                c1172070gbd.getClass();
                return C627260Oiy.LIZLLL(c1172070gbd);
            }
        }, null, new AwS597S0100000_18(this, 697), AFwS206S0000000_18.get$arr$(667), new AwS597S0100000_18(this, 699), 2, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gbg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1172070gbd c1172070gbd = (C1172070gbd) obj;
                c1172070gbd.getClass();
                return C627260Oiy.LIZJ(c1172070gbd);
            }
        }, null, AFwS256S0000000_18.get$arr$(857), AFwS206S0000000_18.get$arr$(668), new AwS597S0100000_18(this, 701), 2, null);
        NearbyFavoritePageParams nearbyFavoritePageParamsCopy = null;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", NearbyFavoriteMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            nearbyFavoriteMobParams = (NearbyFavoriteMobParams) interfaceC1555100qZQLIZIZ.getSource();
        } else {
            nearbyFavoriteMobParams = null;
        }
        this.LLJ = nearbyFavoriteMobParams;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", NearbyFavoritePageParams.class, null);
        if (interfaceC1555100qZQLIZIZ2 != null) {
            nearbyFavoritePageParams = (NearbyFavoritePageParams) interfaceC1555100qZQLIZIZ2.getSource();
        }
        this.LLJI = nearbyFavoritePageParams;
        NearbyFavoriteListViewModel nearbyFavoriteListViewModelJo = Jo();
        NearbyFavoritePageParams nearbyFavoritePageParams2 = this.LLJI;
        if (nearbyFavoritePageParams2 != null) {
            nearbyFavoritePageParamsCopy = nearbyFavoritePageParams2.copy(nearbyFavoritePageParams2.categoryResponse, nearbyFavoritePageParams2.scene);
        }
        nearbyFavoriteListViewModelJo.LLILZ = nearbyFavoritePageParamsCopy;
        retry();
    }
}
