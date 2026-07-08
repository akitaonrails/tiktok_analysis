package com.ss.android.ugc.aweme.poi.creator;

import X.AbstractC1202400hOY;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HTI;
import X.C0KFD;
import X.C1192290h8F;
import X.C1197250hGF;
import X.C1197260hGG;
import X.C1198600hIQ;
import X.C1200940hMC;
import X.C1207450hWh;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C19741112Lp;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC687820QyS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorPromoteStoresBodyAssem extends UIListContentAssem<PoiCreatorVM> {
    public C1749280vcc LLIZLLLIL;
    public final List<String> LLJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ();
    public final List<Boolean> LLJI = new ArrayList();
    public final List<Boolean> LLJIJIL = new ArrayList();
    public final C736950SvV LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LJIILJJIL = true;
        return c20603715jn;
    }

    public final void Lo() {
        if (!(!((ArrayList) this.LLJIJIL).contains(Boolean.TRUE))) {
            Pair pairLIZLLL = C1198600hIQ.LIZLLL();
            C1207450hWh.LIZ.LJIIL("poi", "add_location", (AbstractC1202400hOY) pairLIZLLL.getFirst(), (AbstractC1202400hOY) pairLIZLLL.getSecond(), new InterfaceC687820QyS() { // from class: X.0hGH
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        return;
                    }
                    PoiCreatorVM poiCreatorVMJo = this.LIZ.Jo();
                    double d = locationData.latitude;
                    double d2 = locationData.longitude;
                    boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
                    poiCreatorVMJo.LLILLL = d;
                    poiCreatorVMJo.LLILZ = d2;
                    poiCreatorVMJo.LLILZIL = zLJIL;
                    this.LIZ.Jo().xQ2(null);
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                    if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        return;
                    }
                    PoiCreatorVM poiCreatorVMJo = this.LIZ.Jo();
                    boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
                    poiCreatorVMJo.LLILLL = 0.0d;
                    poiCreatorVMJo.LLILZ = 0.0d;
                    poiCreatorVMJo.LLILZIL = zLJIL;
                    this.LIZ.Jo().xQ2(null);
                }
            }, -1L);
            return;
        }
        PoiCreatorVM poiCreatorVMJo = Jo();
        boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
        poiCreatorVMJo.LLILLL = 0.0d;
        poiCreatorVMJo.LLILZ = 0.0d;
        poiCreatorVMJo.LLILZIL = zLJIL;
        Jo().xQ2(null);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final PoiCreatorVM Jo() {
        return (PoiCreatorVM) this.LLJILJIL.getValue();
    }

    public PoiCreatorPromoteStoresBodyAssem() {
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL();
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(307);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(333), new AwS562S0100000_18((AbstractC738140SxQ) this, 983), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 980));
    }

    public final void Oo() {
        C786410Ut5.LLF(8, Go());
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLIZLLLIL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        c1749280vcc2.setLayoutVariant(0);
        C1749280vcc c1749280vcc3 = this.LLIZLLLIL;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        c1749280vcc3.setTopMargin(C418440Gaw.LIZIZ(Float.valueOf(127.0f)));
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context = getContext();
        TokenCert tokenCertWith = C1198600hIQ.LJII() ? TokenCert.Companion.with("bpea-poi_creator_promote_stores_turn_on_for_precise") : TokenCert.Companion.with("bpea-poi_creator_promote_stores_turn_on");
        c1200940hMC.getClass();
        boolean zLIZ = C1200940hMC.LIZ(context, tokenCertWith);
        boolean zLIZIZ = C1200940hMC.LIZIZ(Go().getContext());
        if (zLIZ && !zLIZIZ) {
            C1749280vcc c1749280vcc4 = this.LLIZLLLIL;
            if (c1749280vcc4 == null) {
                c1749280vcc4 = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_map_pin;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            C1749280vcc c1749280vcc5 = this.LLIZLLLIL;
            if (c1749280vcc5 == null) {
                c1749280vcc5 = null;
            }
            c1722300uv6.LJI = c1749280vcc5.getContext().getString(2131829998);
            C1749280vcc c1749280vcc6 = this.LLIZLLLIL;
            c1722300uv6.LJIIIIZZ = (c1749280vcc6 != null ? c1749280vcc6 : null).getContext().getString(2131829997);
            c1722300uv6.LJIIIZ = new AwS597S0100000_18(this, 283);
            c1749280vcc4.setStatus(c1722300uv6);
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.qu;
            Drawable drawableLIZ = c0hti.LIZ(context2);
            C1749280vcc c1749280vcc7 = this.LLIZLLLIL;
            C1749280vcc c1749280vcc8 = c1749280vcc7 != null ? c1749280vcc7 : null;
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            c1722300uv62.LIZJ = 1;
            c1722300uv62.LIZ = drawableLIZ;
            c1722300uv62.LJI = context2.getString(2131836908);
            c1722300uv62.LJIIIIZZ = context2.getString(2131836907);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(343));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147));
            c1722300uv62.LIZLLL = iLIZIZ;
            c1722300uv62.LJ = iLIZIZ2;
            c1749280vcc8.setStatus(c1722300uv62);
        }
    }

    public final void So() {
        C786410Ut5.LLF(8, Go());
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLIZLLLIL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        c1749280vcc2.setLayoutVariant(1);
        C1749280vcc c1749280vcc3 = this.LLIZLLLIL;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        c1749280vcc3.setTopMargin(C418440Gaw.LIZIZ(Float.valueOf(139.0f)));
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.qi;
            Drawable drawableLIZ = c0hti.LIZ(context);
            C1749280vcc c1749280vcc4 = this.LLIZLLLIL;
            C1749280vcc c1749280vcc5 = c1749280vcc4 != null ? c1749280vcc4 : null;
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LIZJ = 1;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = context.getString(2131857691);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(343));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1749280vcc5.setStatus(c1722300uv6);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Context context = getContext();
        if (context != null) {
            ((ArrayList) this.LLJI).clear();
            List<Boolean> list = this.LLJI;
            List<String> list2 = this.LLJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (String str : list2) {
                C19741112Lp.LIZ.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
            ((ArrayList) list).addAll(arrayList);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            ((ArrayList) this.LLJIJIL).clear();
            List<Boolean> list = this.LLJIJIL;
            List<String> list2 = this.LLJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (String str : list2) {
                C19741112Lp.LIZ.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
            ((ArrayList) list).addAll(arrayList);
        }
        ArrayList<Pair> arrayList2 = (ArrayList) C13LP.LLIILII(this.LLJIJIL, this.LLJI);
        if (arrayList2.isEmpty()) {
            return;
        }
        for (Pair pair : arrayList2) {
            if (((Boolean) pair.getFirst()).booleanValue() != ((Boolean) pair.getSecond()).booleanValue()) {
                Lo();
                return;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = (C1749280vcc) LJJIJL().findViewById(R.id.s_r);
        Go().LJIILJJIL(PoiCreatorPromoteStoresCell.class);
        Go().setItemAnimator(null);
        C1192290h8F.LIZ(this, "poi_influencer_list", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 280));
        Context context = getContext();
        if (context != null) {
            List<Boolean> list = this.LLJI;
            List<String> list2 = this.LLJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (String str : list2) {
                C19741112Lp.LIZ.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
            }
            ((ArrayList) list).addAll(arrayList);
            ((ArrayList) this.LLJIJIL).addAll(this.LLJI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onViewCreated] currentPermissionsStatus=");
            sbLIZ.append(this.LLJIJIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        PoiCreatorVM poiCreatorVMJo = Jo();
        C1197250hGF c1197250hGF = new C2217381BqS() { // from class: X.0hGF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1197360hGQ c1197360hGQ = (C1197360hGQ) obj;
                c1197360hGQ.getClass();
                return C627260Oiy.LIZLLL(c1197360hGQ);
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = false;
        AssemViewModel.asyncSubscribe$default(poiCreatorVMJo, c1197250hGF, this, c1770850wBP, new AwS597S0100000_18(this, 281), null, new AwS597S0100000_18(this, 282), 16, null);
        PoiCreatorVM poiCreatorVMJo2 = Jo();
        C1197260hGG c1197260hGG = new C2217381BqS() { // from class: X.0hGG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1197360hGQ c1197360hGQ = (C1197360hGQ) obj;
                c1197360hGQ.getClass();
                return C627260Oiy.LIZJ(c1197360hGQ);
            }
        };
        C1770850wBP c1770850wBP2 = new C1770850wBP();
        c1770850wBP2.LIZ = true;
        AssemViewModel.asyncSubscribe$default(poiCreatorVMJo2, c1197260hGG, this, c1770850wBP2, AFwS256S0000000_18.get$arr$(332), null, new AwS597S0100000_18(this, 279), 16, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0hGI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197360hGQ) obj).LLJILJILJ;
            }
        }, this, null, AFwS256S0000000_18.get$arr$(330), new AwS562S0100000_18(this, 981), AFwS256S0000000_18.get$arr$(331), 4, null);
        Go().addOnItemTouchListener(new C0KFD() { // from class: X.0hJ4
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                C443160HZi.LIZ.getClass();
                KeyboardUtils.LIZIZ(recyclerView);
                return false;
            }
        });
        Lo();
    }
}
