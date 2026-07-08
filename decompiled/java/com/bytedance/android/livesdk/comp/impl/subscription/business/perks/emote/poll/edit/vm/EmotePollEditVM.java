package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm;

import X.AbstractC492010JRf;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0JQH;
import X.C0JQJ;
import X.C0JRU;
import X.C0UO0;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C1554960qZC;
import X.C1701940uOG;
import X.C176600m4;
import X.C2097608Jq;
import X.C452501pT;
import X.C480460Ism;
import X.C491760JQg;
import X.C491770JQh;
import X.C491800JQk;
import X.C491830JQn;
import X.C500260Jjc;
import X.C510380Jzw;
import X.EnumC510330Jzr;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC491820JQm;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm.EmotePollEditVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository.EmotePollApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.UserEmotePollOptionsResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollEditVM extends AssemViewModel<C491760JQg> implements InterfaceC491820JQm {
    public C0JRU LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0JQJ LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0JQH(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C491770JQh(this));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C491760JQg(0);
    }

    public final C0JQJ vQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C0JQJ c0jqj = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JQJ.class, null)) != null) {
                c0jqj = (C0JQJ) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c0jqj;
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC491820JQm
    public final boolean LJIIJJI() {
        UserEmotePollOptionsResponse.Data data;
        C0JQJ c0jqjVQ2 = vQ2();
        return C176600m4.LIZIZ((c0jqjVQ2 == null || (data = c0jqjVQ2.LLILLL) == null) ? null : Boolean.valueOf(data.hasMore));
    }

    @Override // X.InterfaceC491820JQm
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        Room room;
        User owner;
        String secUid;
        int size;
        C0J1N c0j1n;
        ArrayList<AbstractC492010JRf> arrayList;
        UserEmotePollOptionsResponse.Data data;
        C0JQJ c0jqjVQ2 = vQ2();
        Boolean boolValueOf = null;
        if (c0jqjVQ2 != null && (data = c0jqjVQ2.LLILLL) != null) {
            boolValueOf = Boolean.valueOf(data.hasMore);
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            ((C491800JQk) function1).invoke(new IllegalArgumentException("has more is false"));
            return;
        }
        C0JQJ c0jqjVQ22 = vQ2();
        if (c0jqjVQ22 != null && (room = c0jqjVQ22.LLILLJJLI) != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null && secUid.length() != 0) {
            C0JRU c0jru = this.LL;
            if (c0jru != null && (arrayList = c0jru.LL) != null) {
                size = arrayList.size();
            } else {
                size = 1;
            }
            C480460Ism.LIZ().getClass();
            C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((EmotePollApi) C480460Ism.LIZLLL(EmotePollApi.class)).emotePollOptions(secUid, size - 1, 20L).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "EmotePollEditVM", "user_emote/poll_options", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
            if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
                final C491830JQn c491830JQn = (C491830JQn) function0;
                final C491800JQk c491800JQk = (C491800JQk) function1;
                c0j1n.LIZ(new C09JN() { // from class: X.0JQa
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        EmotePollEditVM emotePollEditVM;
                        C0JRU c0jru2;
                        ArrayList<AbstractC492010JRf> arrayList2;
                        C0JRU c0jru3;
                        C491740JQe c491740JQe;
                        C0JRZ c0jrz;
                        ArrayList<AbstractC492010JRf> arrayList3;
                        ArrayList<AbstractC492010JRf> arrayList4;
                        int iIndexOf;
                        C1C7U.LIZ("EmotePollEditVM@dffb.loadNextPage$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        C0JQJ c0jqjVQ23 = this.LL.vQ2();
                        if (c0jqjVQ23 != null) {
                            c0jqjVQ23.LLILLL = (UserEmotePollOptionsResponse.Data) baseResponse.data;
                        }
                        UserEmotePollOptionsResponse.Data data2 = (UserEmotePollOptionsResponse.Data) baseResponse.data;
                        if (data2 != null && (c0jru2 = (emotePollEditVM = this.LL).LL) != null && (arrayList2 = c0jru2.LL) != null) {
                            C491740JQe c491740JQe2 = (C491740JQe) emotePollEditVM.LLILZIL.getValue();
                            C0JRZ c0jrz2 = c491740JQe2.LIZJ;
                            if (c0jrz2 != null && (arrayList4 = c0jrz2.LL) != null && (iIndexOf = arrayList4.indexOf(c491740JQe2.LIZ)) > 0) {
                                ListProtector.remove(arrayList4, iIndexOf);
                                C0JRZ c0jrz3 = c491740JQe2.LIZJ;
                                if (c0jrz3 != null) {
                                    c0jrz3.notifyItemRemoved(iIndexOf);
                                }
                            }
                            int size2 = arrayList2.size();
                            Iterator<UserEmote> it2 = data2.f1039emotes.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new C491960JRa(it2.next()));
                            }
                            if (data2.hasMore && (c0jrz = (c491740JQe = (C491740JQe) emotePollEditVM.LLILZIL.getValue()).LIZJ) != null && (arrayList3 = c0jrz.LL) != null) {
                                arrayList3.add(c491740JQe.LIZ);
                            }
                            int size3 = arrayList2.size() - size2;
                            if (size3 > 0 && (c0jru3 = emotePollEditVM.LL) != null) {
                                c0jru3.notifyItemRangeInserted(size2, size3);
                            }
                        }
                        c491830JQn.invoke();
                        C1C7U.LIZIZ("EmotePollEditVM@dffb.loadNextPage$1");
                    }
                }, new C09JN() { // from class: X.0JQd
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("EmotePollEditVM@dffb.loadNextPage$2");
                        c491800JQk.invoke(obj);
                        C1C7U.LIZIZ("EmotePollEditVM@dffb.loadNextPage$2");
                    }
                });
                return;
            }
            return;
        }
        ((C491800JQk) function1).invoke(new IllegalArgumentException("secAnchorId is null"));
    }
}
