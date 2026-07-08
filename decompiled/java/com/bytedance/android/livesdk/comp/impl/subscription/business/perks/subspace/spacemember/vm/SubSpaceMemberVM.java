package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.vm;

import X.C01GW;
import X.C0212005a;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C11RD;
import X.C11S5;
import X.C1554960qZC;
import X.C1701940uOG;
import X.C176600m4;
import X.C2097608Jq;
import X.C452501pT;
import X.C480460Ism;
import X.C502570JnL;
import X.C502780Jng;
import X.C502790Jnh;
import X.C502890Jnr;
import X.C510380Jzw;
import X.EnumC510330Jzr;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC503850JpP;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.vm.SubSpaceMemberVM;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.SpaceMemberInfo;
import webcast.api.sub.SpaceMembersResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceMemberVM extends AssemViewModel<C0212005a> implements InterfaceC503850JpP {
    public InterfaceC665370Q7z LL;
    public boolean LLILLJJLI;
    public C502790Jnh LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C502780Jng(this));
    public C502570JnL LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0212005a(0);
    }

    public final C502790Jnh wQ2() {
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C502790Jnh.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C502790Jnh) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC503850JpP
    public final boolean LJIIJJI() {
        C502890Jnr c502890Jnr;
        Boolean bool;
        C502790Jnh c502790JnhWQ2 = wQ2();
        return (c502790JnhWQ2 == null || (c502890Jnr = c502790JnhWQ2.LL) == null || (bool = c502890Jnr.LIZIZ) == null || !C176600m4.LIZIZ(bool)) ? false : true;
    }

    @Override // X.InterfaceC503850JpP
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        vQ2(false, function0, function1);
    }

    public final void vQ2(final boolean z, final Function0 function0, final Function1 function1) {
        long jLongValue;
        C502790Jnh c502790JnhWQ2;
        C502890Jnr c502890Jnr;
        Long l;
        String secUid = UserService.getInstance().user().getCurrentUser().getSecUid();
        if (!z && (c502790JnhWQ2 = wQ2()) != null && (c502890Jnr = c502790JnhWQ2.LL) != null && (l = c502890Jnr.LIZ) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C480460Ism.LIZ().getClass();
        C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getSpaceMembers(secUid, jLongValue), EnumC510330Jzr.GENERAL, "SubSpaceMemberVM", "sub/space/members", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this));
        if (c0j1n != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jnf
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C502890Jnr c502890Jnr2;
                    C502890Jnr c502890Jnr3;
                    C1C7U.LIZ("SubSpaceMemberVM@ed44.fetchMembers$1");
                    function0.invoke();
                    SpaceMembersResponse.ResponseData responseData = (SpaceMembersResponse.ResponseData) ((BaseResponse) obj).data;
                    if (responseData != null) {
                        SubSpaceMemberVM subSpaceMemberVM = this;
                        boolean z2 = z;
                        Function0<Unit> function02 = function0;
                        C502790Jnh c502790JnhWQ22 = subSpaceMemberVM.wQ2();
                        if (c502790JnhWQ22 != null && (c502890Jnr3 = c502790JnhWQ22.LL) != null) {
                            c502890Jnr3.LIZIZ = Boolean.valueOf(responseData.hasMore);
                        }
                        C502790Jnh c502790JnhWQ23 = subSpaceMemberVM.wQ2();
                        if (c502790JnhWQ23 != null && (c502890Jnr2 = c502790JnhWQ23.LL) != null) {
                            c502890Jnr2.LIZ = Long.valueOf(responseData.offset);
                        }
                        C502570JnL c502570JnL = subSpaceMemberVM.LLILZIL;
                        if (c502570JnL != null) {
                            ArrayList<AbstractC503810JpL> arrayList = c502570JnL.LL;
                            if (z2) {
                                arrayList.clear();
                            } else {
                                ((C502870Jnp) subSpaceMemberVM.LLILZ.getValue()).LIZIZ();
                            }
                            int size = arrayList.size();
                            Iterator<SpaceMemberInfo> it2 = responseData.membersList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new C502690JnX(it2.next()));
                            }
                            if (C176600m4.LIZIZ(Boolean.valueOf(responseData.hasMore))) {
                                arrayList.add(((C502870Jnp) subSpaceMemberVM.LLILZ.getValue()).LIZ);
                            }
                            int size2 = arrayList.size() - size;
                            if (size2 > 0) {
                                c502570JnL.notifyItemRangeInserted(size, size2);
                            }
                        }
                        function02.invoke();
                    }
                    C1C7U.LIZIZ("SubSpaceMemberVM@ed44.fetchMembers$1");
                }
            }, new C09JN() { // from class: X.00Qe
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceMemberVM@ed44.fetchMembers$2");
                    function1.invoke(obj);
                    C1C7U.LIZIZ("SubSpaceMemberVM@ed44.fetchMembers$2");
                }
            });
        }
    }
}
