package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0JLW;
import X.C0ZP4;
import X.C1149804ee;
import X.C1150304ej;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1440005kM;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1822330xWR;
import X.C1826730xdX;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2217381BqS;
import X.C338490DOt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C475510Ikn;
import X.C489600JHy;
import X.C517520KRi;
import X.C518980KWy;
import X.C521290KcR;
import X.C521310KcT;
import X.C521320KcU;
import X.C521330KcV;
import X.C521340KcW;
import X.C521350KcX;
import X.C521360KcY;
import X.C521370KcZ;
import X.C521380Kca;
import X.C521390Kcb;
import X.C521410Kcd;
import X.C521430Kcf;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C930940aKi;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioRevampOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.event.ServiceBioCloseCommand;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceBioFragmentV2 extends BaseFragment implements InterfaceC724530SbT {
    public static final C521430Kcf LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static C1150304ej LLIZLLLIL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLSHELIOS4nISoiZzw2OjMlKiojJDA/Zzw2OjMlKioxISpiJyokPSxiGSwgGyA+PyYwLQclJgkhKSIhLCEnHnc=";
    public final C01GW LL = C452501pT.LIZIZ(new C521320KcU(this));
    public final AssemVMLazy LLILLJJLI;
    public C521380Kca LLILLL;
    public Map<String, String> LLILZ;
    public C1822330xWR LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Kcf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioFragmentV2.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0Kcf
        };
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public PcsServiceBioFragmentV2() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        C521310KcT c521310KcT = new C521310KcT(c19719912DlLIZ);
        C521390Kcb c521390Kcb = new C521390Kcb();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c521310KcT, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C521340KcW(this), c521390Kcb, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c521310KcT, new C521350KcX(this), c521390Kcb, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c521310KcT, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C521360KcY(this), c521390Kcb, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILZ = new LinkedHashMap();
    }

    public final C1822330xWR NR() {
        if (this.LLILZIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1822330xWR.class, null);
            this.LLILZIL = interfaceC1555100qZQLIZIZ != null ? (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZIL;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Integer num;
        C1440005kM.LIZ(new C518980KWy());
        C1822330xWR c1822330xWRNR = NR();
        int iIntValue = (c1822330xWRNR == null || (num = c1822330xWRNR.LLJJL) == null) ? -1 : num.intValue();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(iIntValue, new LinkedHashMap()));
        }
        LLIZLLLIL = null;
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String secUid;
        User owner;
        Long lValueOf;
        String strValueOf;
        boolean z;
        String str;
        boolean z2;
        Long lValueOf2;
        boolean z3;
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, LiveEndEvent.class, new C521330KcV(this));
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.BQ2(this, ServiceBioCloseCommand.class, new C521290KcR(this));
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C521380Kca c521380Kca = this.LLILLL;
        String str2 = "";
        if ((c521380Kca == null || (secUid = c521380Kca.LIZIZ) == null || secUid.length() == 0) && (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null)) {
            secUid = "";
        }
        C521380Kca c521380Kca2 = this.LLILLL;
        if (c521380Kca2 == null || (strValueOf = c521380Kca2.LIZJ) == null || strValueOf.length() == 0) {
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            strValueOf = String.valueOf(lValueOf);
        }
        C521380Kca c521380Kca3 = this.LLILLL;
        if (c521380Kca3 != null) {
            z = c521380Kca3.LIZLLL;
        } else {
            z = false;
        }
        String strLIZJ = this.LLILZ.get("avatar");
        if (strLIZJ == null && (strLIZJ = C0JLW.LIZJ(room)) == null) {
            strLIZJ = "";
        }
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        C521380Kca c521380Kca4 = this.LLILLL;
        if (c521380Kca4 == null || (str = c521380Kca4.LIZ) == null) {
            str = "";
        }
        UserAttr userAttr = UserService.getInstance().user().getCurrentUser().getUserAttr();
        if (userAttr != null) {
            z2 = userAttr.isAdmin;
        } else {
            z2 = false;
        }
        String str3 = this.LLILZ.get("dm_schema");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLILZ.get("form_schema");
        if (str4 != null) {
            str2 = str4;
        }
        String idStr = userLJIJJLI.getIdStr();
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        String strValueOf2 = String.valueOf(lValueOf2);
        C521380Kca c521380Kca5 = this.LLILLL;
        if (c521380Kca5 != null && c521380Kca5.LJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C1822330xWR(str, secUid, strValueOf, z, z2, null, str3, str2, strValueOf2, idStr, strLIZJ, null, 0, z3, Integer.valueOf(hashCode()), 83361824), C1822330xWR.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new C521370KcZ(this), 3);
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        PcsServiceBioVMV2 pcsServiceBioVMV2 = (PcsServiceBioVMV2) assemVMLazy.getValue();
        pcsServiceBioVMV2.LL = C1558360qeg.LJFF(this, null);
        pcsServiceBioVMV2.wQ2(false);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20441214yg.LIZIZ("PcsServiceBioFragmentV2", "onViewCreated");
        PcsGenericLoadingVM pcsGenericLoadingVMDj1 = null;
        if (LivePcsServiceBioRevampOptSetting.INSTANCE.enablePreloadUI()) {
            C1150304ej c1150304ej = LLIZLLLIL;
            if (c1150304ej != null) {
                c1150304ej.LIZIZ(this);
            }
        } else {
            C723850SaN.LIZ(this, false, null, new C1149804ee(this), 3);
        }
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPcsLoadingAbility.class, null);
        if (iPcsLoadingAbility != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(C489600JHy.LIZ, false);
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Kch
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1156510gCX) obj).LL;
            }
        }, null, new C521410Kcd(pcsGenericLoadingVMDj1, this), 6);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(28));
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(28));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext().setTheme(R.style.xx);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g__, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
