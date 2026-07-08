package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.vm;

import X.C005Y;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C11RD;
import X.C11S5;
import X.C1554960qZC;
import X.C1701940uOG;
import X.C2097608Jq;
import X.C452501pT;
import X.C480460Ism;
import X.C502530JnH;
import X.C502900Jns;
import X.C502920Jnu;
import X.C510380Jzw;
import X.EnumC510330Jzr;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC503850JpP;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.PollUserListResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpacePollMemberVM extends AssemViewModel<C005Y> implements InterfaceC503850JpP {
    public static final /* synthetic */ int LLILZIL = 0;
    public InterfaceC665370Q7z LL;
    public C502920Jnu LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C502900Jns(this));
    public C502530JnH LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C005Y(0);
    }

    public final C502920Jnu wQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C502920Jnu.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C502920Jnu) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC503850JpP
    public final boolean LJIIJJI() {
        wQ2();
        return false;
    }

    @Override // X.InterfaceC503850JpP
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        vQ2(false, function0, function1);
    }

    public final void vQ2(boolean z, final Function0 function0, final Function1 function1) {
        SpacePost spacePost;
        SpacePost spacePost2;
        SpacePoll spacePoll;
        SpacePollOption spacePollOption;
        C502920Jnu c502920JnuWQ2 = wQ2();
        if (c502920JnuWQ2 != null && (spacePost = c502920JnuWQ2.LL) != null) {
            long j = spacePost.postId;
            C502920Jnu c502920JnuWQ22 = wQ2();
            if (c502920JnuWQ22 != null && (spacePost2 = c502920JnuWQ22.LL) != null && (spacePoll = spacePost2.pollInfo) != null) {
                long j2 = spacePoll.pollId;
                C502920Jnu c502920JnuWQ23 = wQ2();
                if (c502920JnuWQ23 != null && (spacePollOption = c502920JnuWQ23.LLILLJJLI) != null) {
                    long j3 = spacePollOption.optionId;
                    wQ2();
                    C480460Ism.LIZ().getClass();
                    C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getPollUserList(j, j2, j3, 0L), EnumC510330Jzr.GENERAL, "SubSpacePollMemberVM", "sub/space/poll/user_list", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this));
                    if (c0j1n != null) {
                        c0j1n.LIZ(new C09JN() { // from class: X.0JnK
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubSpacePollMemberVM@daed.fetchMembers$1");
                                function0.invoke();
                                PollUserListResponse.ResponseData responseData = (PollUserListResponse.ResponseData) ((BaseResponse) obj).data;
                                if (responseData != null) {
                                    SubSpacePollMemberVM subSpacePollMemberVM = this;
                                    Function0<Unit> function02 = function0;
                                    C502530JnH c502530JnH = subSpacePollMemberVM.LLILZ;
                                    if (c502530JnH != null) {
                                        ArrayList<AbstractC503810JpL> arrayList = c502530JnH.LL;
                                        arrayList.clear();
                                        int size = arrayList.size();
                                        Iterator<User> it2 = responseData.userList.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(new C502550JnJ(it2.next()));
                                        }
                                        int size2 = arrayList.size() - size;
                                        if (size2 > 0) {
                                            c502530JnH.notifyItemRangeInserted(size, size2);
                                        }
                                    }
                                    function02.invoke();
                                }
                                C1C7U.LIZIZ("SubSpacePollMemberVM@daed.fetchMembers$1");
                            }
                        }, new C09JN() { // from class: X.00Qd
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubSpacePollMemberVM@daed.fetchMembers$2");
                                function1.invoke(obj);
                                C1C7U.LIZIZ("SubSpacePollMemberVM@daed.fetchMembers$2");
                            }
                        });
                    }
                }
            }
        }
    }
}
