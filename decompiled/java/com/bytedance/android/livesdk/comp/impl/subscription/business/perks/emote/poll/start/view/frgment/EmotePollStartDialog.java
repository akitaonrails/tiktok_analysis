package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment;

import X.C019F;
import X.C01D1;
import X.C056L;
import X.C092O;
import X.C0JQJ;
import X.C0JQR;
import X.C0JQS;
import X.C0JQT;
import X.C1119170fEJ;
import X.C1140804dC;
import X.C1161304gV;
import X.C13LE;
import X.C1533950q1J;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1588906Jz;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C723850SaN;
import X.C724750Sbp;
import X.C758170Tod;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubscriptionEmoteUrl;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.view.frgment.EmotePollEditDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository.EmotePollApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartVM;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.EmotePollCreateRequest;
import webcast.api.sub.UserEmotePollOptionsResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollStartDialog extends LiveSheetFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogHELIOSO2s8LD04O2spJCAnLWs8JiM/ZjY4KD0nZjMlLDh9LjcrJCo9PGsJJCAnLRUjJSMAPCQ+PQs6KSkjLg==";
    public final AssemVMLazy LLJLLL;
    public C0JQJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollStartDialog.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/start/vm/EmotePollStartVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollStartDialog() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollStartVM.class);
        C056L c056l = new C056L(c19719912DlLIZ);
        C1588906Jz c1588906Jz = new C1588906Jz();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c056l, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JQR(this), c1588906Jz, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c056l, new C0JQS(this), c1588906Jz, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c056l, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JQT(this), c1588906Jz, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131852067), R.style.a85, new C092O() { // from class: X.0JQO
            @Override // X.C092O
            public final void accept(Object obj) {
                Long lValueOf;
                Long lValueOf2;
                String str;
                String str2;
                String str3;
                Room room;
                Room room2;
                C06K0 c06k0WQ2 = this.LIZ.wS().wQ2();
                c06k0WQ2.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_edit_click");
                C0JQJ c0jqj = c06k0WQ2.LIZ;
                if (c0jqj != null && (room2 = c0jqj.LLILLJJLI) != null) {
                    lValueOf = Long.valueOf(room2.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                C0JQJ c0jqj2 = c06k0WQ2.LIZ;
                if (c0jqj2 != null && (room = c0jqj2.LLILLJJLI) != null) {
                    lValueOf2 = Long.valueOf(room.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "room_id");
                C0JQJ c0jqj3 = c06k0WQ2.LIZ;
                if (c0jqj3 != null) {
                    str = c0jqj3.LL;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "enter_from");
                C0JQJ c0jqj4 = c06k0WQ2.LIZ;
                if (c0jqj4 != null) {
                    str2 = c0jqj4.LLILZIL;
                } else {
                    str2 = null;
                }
                c474500IjALIZ.LJJII(str2, "user_type");
                c474500IjALIZ.LIZ();
                C20484615Do c20484615Do = this.LIZ.LLJJIJIL;
                Bundle bundle = new Bundle();
                C0JQJ c0jqjUS = this.LIZ.uS();
                if (c0jqjUS != null) {
                    str3 = c0jqjUS.LL;
                } else {
                    str3 = null;
                }
                C786410Ut5.LJJJI("enter_from", str3, bundle);
                c20484615Do.LJIIIZ(EmotePollEditDialog.class, "sub_emote_poll_edit", null, bundle);
            }
        }));
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131852071), R.style.a7h, new C092O() { // from class: X.0JQK
            @Override // X.C092O
            public final void accept(Object obj) {
                List listLL;
                int size;
                Long lValueOf;
                Long lValueOf2;
                String str;
                Room room;
                User owner;
                String secUid;
                long id;
                C0J1N c0j1n;
                ArrayList<AbstractC492010JRf> arrayList2;
                Room room2;
                Room room3;
                Room room4;
                UserEmotePollOptionsResponse.Data data;
                List<UserEmote> list;
                C510160Jza c510160Jza = (C510160Jza) obj;
                c510160Jza.LIZJ();
                C06K0 c06k0WQ2 = this.LIZ.wS().wQ2();
                C0JQJ c0jqj = c06k0WQ2.LIZ;
                String str2 = null;
                if (c0jqj != null && (data = c0jqj.LLILLL) != null && (list = data.f1039emotes) != null) {
                    listLL = C13LP.LL(list, 3);
                } else {
                    listLL = null;
                }
                if (listLL != null) {
                    size = listLL.size();
                } else {
                    size = 0;
                }
                ArrayList arrayList3 = new ArrayList();
                if (listLL != null) {
                    Iterator it2 = listLL.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Long.valueOf(((UserEmote) it2.next()).emoteId));
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_start_click");
                C0JQJ c0jqj2 = c06k0WQ2.LIZ;
                if (c0jqj2 != null && (room4 = c0jqj2.LLILLJJLI) != null) {
                    lValueOf = Long.valueOf(room4.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                C0JQJ c0jqj3 = c06k0WQ2.LIZ;
                if (c0jqj3 != null && (room3 = c0jqj3.LLILLJJLI) != null) {
                    lValueOf2 = Long.valueOf(room3.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "room_id");
                C0JQJ c0jqj4 = c06k0WQ2.LIZ;
                if (c0jqj4 != null) {
                    str = c0jqj4.LL;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII(Integer.valueOf(size), "poll_emote_options_cnt");
                c474500IjALIZ.LJJII(arrayList3.toString(), "poll_emote_options_id_set");
                C0JQJ c0jqj5 = c06k0WQ2.LIZ;
                if (c0jqj5 != null) {
                    str2 = c0jqj5.LLILZIL;
                }
                c474500IjALIZ.LJJII(str2, "user_type");
                c474500IjALIZ.LIZ();
                final EmotePollStartVM emotePollStartVMWS = this.LIZ.wS();
                final C0JQU c0jqu = new C0JQU(this.LIZ);
                final C0JQQ c0jqq = new C0JQQ(this.LIZ, c510160Jza);
                C0JQJ c0jqjVQ2 = emotePollStartVMWS.vQ2();
                if (c0jqjVQ2 != null && (room = c0jqjVQ2.LLILLJJLI) != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null && secUid.length() != 0) {
                    EmotePollCreateRequest emotePollCreateRequest = new EmotePollCreateRequest();
                    emotePollCreateRequest.secAnchorId = secUid;
                    C0JQJ c0jqjVQ22 = emotePollStartVMWS.vQ2();
                    if (c0jqjVQ22 != null && (room2 = c0jqjVQ22.LLILLJJLI) != null) {
                        id = room2.getId();
                    } else {
                        id = 0;
                    }
                    emotePollCreateRequest.roomId = id;
                    emotePollCreateRequest.userEmoteIds = new LinkedList();
                    C0JRV c0jrv = emotePollStartVMWS.LL;
                    if (c0jrv != null && (arrayList2 = c0jrv.LL) != null) {
                        for (AbstractC492010JRf abstractC492010JRf : arrayList2) {
                            if (abstractC492010JRf instanceof C491960JRa) {
                                emotePollCreateRequest.userEmoteIds.add(Long.valueOf(((C491960JRa) abstractC492010JRf).LIZ.emoteId));
                            }
                        }
                    }
                    emotePollCreateRequest.durationMs = 300000L;
                    C480460Ism.LIZ().getClass();
                    C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((EmotePollApi) C480460Ism.LIZLLL(EmotePollApi.class)).emotePollCreate(emotePollCreateRequest).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "EmotePollStartVM", "user_emote/create", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
                    if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(emotePollStartVMWS))) != null) {
                        c0j1n.LIZ(new C09JN() { // from class: X.0JQI
                            /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
                            @Override // X.C09JN
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void accept(java.lang.Object r10) {
                                /*
                                    Method dump skipped, instruction units count: 209
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C0JQI.accept(java.lang.Object):void");
                            }
                        }, new C09JN() { // from class: X.07y6
                            @Override // X.C09JN
                            public final void accept(Object obj2) {
                                C1C7U.LIZ("EmotePollStartVM@5506.create$2");
                                c0jqq.invoke(obj2);
                                C1C7U.LIZIZ("EmotePollStartVM@5506.create$2");
                            }
                        });
                        return;
                    }
                    return;
                }
                c0jqq.invoke(new IllegalArgumentException("secAnchorId is null"));
            }
        }));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C758170Tod c758170TodWR;
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131852072));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        Bundle arguments = getArguments();
        if (C1533950q1J.LJ(arguments != null ? arguments.getString("navigate_up_page", "") : null) && (c758170TodWR = WR(new View.OnClickListener() { // from class: X.0JQP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                DataChannel dataChannelLJ;
                String str;
                EmotePollStartDialog emotePollStartDialog = this.LL;
                Bundle arguments2 = emotePollStartDialog.getArguments();
                String str2 = "";
                if (arguments2 != null) {
                    string = arguments2.getString("navigate_up_page", "");
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(string, "poll_panel")) {
                    IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
                    if (iRoomFunctionService != null) {
                        iRoomFunctionService.le1();
                        return;
                    }
                    return;
                }
                if (!Intrinsics.LJFF(string, "community") || (dataChannelLJ = C475510Ikn.LJ(emotePollStartDialog)) == null) {
                    return;
                }
                C0JQJ c0jqjUS = emotePollStartDialog.uS();
                if (c0jqjUS != null && (str = c0jqjUS.LL) != null) {
                    str2 = str;
                }
                C0JKJ.LIZ(dataChannelLJ, str2);
            }
        })) != null) {
            arrayList.add(c758170TodWR);
        }
        c1119170fEJ.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C758170Tod(R.attr.dzk, new View.OnClickListener() { // from class: X.0JQM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long lValueOf;
                Long lValueOf2;
                String str;
                long id;
                String secUid;
                String str2;
                Room room;
                User owner;
                Room room2;
                Room room3;
                Room room4;
                Room room5;
                C06K0 c06k0WQ2 = this.LL.wS().wQ2();
                c06k0WQ2.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_settings_history_click");
                C0JQJ c0jqj = c06k0WQ2.LIZ;
                String str3 = null;
                if (c0jqj != null && (room5 = c0jqj.LLILLJJLI) != null) {
                    lValueOf = Long.valueOf(room5.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                C0JQJ c0jqj2 = c06k0WQ2.LIZ;
                if (c0jqj2 != null && (room4 = c0jqj2.LLILLJJLI) != null) {
                    lValueOf2 = Long.valueOf(room4.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "room_id");
                C0JQJ c0jqj3 = c06k0WQ2.LIZ;
                if (c0jqj3 != null) {
                    str = c0jqj3.LL;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "enter_from");
                C0JQJ c0jqj4 = c06k0WQ2.LIZ;
                if (c0jqj4 != null) {
                    str3 = c0jqj4.LLILZIL;
                }
                c474500IjALIZ.LJJII(str3, "user_type");
                c474500IjALIZ.LIZ();
                C495520Jby c495520Jby = new C495520Jby(LiveSubscriptionEmoteUrl.INSTANCE.getValue().getEmotePollResultListHalfScreen());
                C0JQJ c0jqjUS = this.LL.uS();
                long ownerUserId = 0;
                if (c0jqjUS != null && (room3 = c0jqjUS.LLILLJJLI) != null) {
                    id = room3.getId();
                } else {
                    id = 0;
                }
                c495520Jby.LIZIZ(id, "room_id");
                C0JQJ c0jqjUS2 = this.LL.uS();
                if (c0jqjUS2 != null && (room2 = c0jqjUS2.LLILLJJLI) != null) {
                    ownerUserId = room2.getOwnerUserId();
                }
                c495520Jby.LIZIZ(ownerUserId, "anchor_id");
                C0JQJ c0jqjUS3 = this.LL.uS();
                String str4 = "";
                if (c0jqjUS3 == null || (room = c0jqjUS3.LLILLJJLI) == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    secUid = "";
                }
                c495520Jby.LIZJ("sec_anchor_id", secUid);
                C0JQJ c0jqjUS4 = this.LL.uS();
                if (c0jqjUS4 != null && (str2 = c0jqjUS4.LL) != null) {
                    str4 = str2;
                }
                c495520Jby.LIZJ("show_entrance", str4);
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
            }
        }));
        arrayList2.add(new C758170Tod(R.attr.ea_, new View.OnClickListener() { // from class: X.0JQN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long lValueOf;
                Long lValueOf2;
                String str;
                String str2;
                Room room;
                Room room2;
                C06K0 c06k0WQ2 = this.LL.wS().wQ2();
                c06k0WQ2.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_faq_click");
                C0JQJ c0jqj = c06k0WQ2.LIZ;
                String str3 = null;
                if (c0jqj != null && (room2 = c0jqj.LLILLJJLI) != null) {
                    lValueOf = Long.valueOf(room2.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                C0JQJ c0jqj2 = c06k0WQ2.LIZ;
                if (c0jqj2 != null && (room = c0jqj2.LLILLJJLI) != null) {
                    lValueOf2 = Long.valueOf(room.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "room_id");
                C0JQJ c0jqj3 = c06k0WQ2.LIZ;
                if (c0jqj3 != null) {
                    str = c0jqj3.LL;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII("emote_poll_settings_page", "event_page");
                C0JQJ c0jqj4 = c06k0WQ2.LIZ;
                if (c0jqj4 != null) {
                    str3 = c0jqj4.LLILZIL;
                }
                c474500IjALIZ.LJJII(str3, "user_type");
                c474500IjALIZ.LIZ();
                C495520Jby c495520Jby = new C495520Jby(LiveSubscriptionFAQSetting.INSTANCE.getValue().getEmotePollFaq());
                C0JQJ c0jqjUS = this.LL.uS();
                if (c0jqjUS == null || (str2 = c0jqjUS.LL) == null) {
                    str2 = "";
                }
                c495520Jby.LIZJ("show_entrance", str2);
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
            }
        }));
        c1119170fEJ.LJFF = arrayList2;
        return c1119170fEJ;
    }

    public final C0JQJ uS() {
        if (this.LLJZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0JQJ.class, null);
            this.LLJZ = interfaceC1555100qZQLIZIZ != null ? (C0JQJ) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJZ;
    }

    public final EmotePollStartVM wS() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (EmotePollStartVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 2;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0JQJ(), C0JQJ.class, "source_default_key");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        String str;
        Room room;
        String string;
        super.onViewCreated(view, bundle);
        C0JQJ c0jqjUS = uS();
        if (c0jqjUS != null) {
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments != null && (string = arguments.getString("enter_from", "")) != null) {
                str2 = string;
            }
            c0jqjUS.LL = str2;
        }
        C0JQJ c0jqjUS2 = uS();
        if (c0jqjUS2 != null) {
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ == null || (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) == null) {
                room = null;
            }
            c0jqjUS2.LLILLJJLI = room;
        }
        C0JQJ c0jqjUS3 = uS();
        if (c0jqjUS3 != null) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ2));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                str = "anchor";
            } else {
                str = "moderator";
            }
            c0jqjUS3.LLILZIL = str;
        }
        wS().LLILLJJLI = C1558360qeg.LJFF(this, null);
        C723850SaN.LIZ(this, false, null, new C1140804dC(this), 3);
        C723850SaN.LIZ(this, false, null, new C1161304gV(this), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gb1, viewGroup, false);
    }
}
