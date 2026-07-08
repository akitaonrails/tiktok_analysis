package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.view.frgment;

import X.C019F;
import X.C01D1;
import X.C056K;
import X.C092O;
import X.C0JQ7;
import X.C0JQ8;
import X.C0JQ9;
import X.C0JQA;
import X.C0JQJ;
import X.C1119170fEJ;
import X.C1140304d7;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
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
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm.EmotePollEditVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository.EmotePollApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.interaction.PollStartResponse;
import webcast.api.sub.EmotePollCreateRequest;
import webcast.api.sub.EmotePollCreateResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollEditDialog extends LiveSheetFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyHELIOSogO2s8LD04O2spJCAnLWs8JiM/ZiAoIDt9PiwpPmE1OiIhLCEnZgAhJjs2GCogJQo3ITEIIC4/JyI=";
    public final AssemVMLazy LLJLLL;
    public C0JQJ LLJZ;
    public View LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollEditDialog.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/edit/vm/EmotePollEditVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollEditDialog() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollEditVM.class);
        C056K c056k = new C056K(c19719912DlLIZ);
        C0JQA c0jqa = new C0JQA();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c056k, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JQ7(this), c0jqa, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c056k, new C0JQ8(this), c0jqa, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c056k, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JQ9(this), c0jqa, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131852071), R.style.a7h, new C092O() { // from class: X.0JQD
            @Override // X.C092O
            public final void accept(Object obj) {
                int size;
                ArrayList<Long> arrayList2;
                Long lValueOf;
                Long lValueOf2;
                String str;
                Integer numValueOf;
                String string;
                Room room;
                User owner;
                String secUid;
                long id;
                C0J1N c0j1n;
                ArrayList<Long> arrayList3;
                Room room2;
                Room room3;
                Room room4;
                ArrayList<Long> arrayList4;
                Long lValueOf3;
                Long lValueOf4;
                String str2;
                Integer numValueOf2;
                String string2;
                Room room5;
                Room room6;
                ArrayList<Long> arrayList5;
                C510160Jza c510160Jza = (C510160Jza) obj;
                C0JQJ c0jqjUS = this.LIZ.uS();
                if (c0jqjUS != null && (arrayList5 = c0jqjUS.LLILZ) != null) {
                    size = arrayList5.size();
                } else {
                    size = 0;
                }
                String str3 = null;
                if (size < 2) {
                    C0JQC c0jqc = (C0JQC) this.LIZ.wS().LLILZ.getValue();
                    C0JQJ c0jqjUS2 = this.LIZ.uS();
                    if (c0jqjUS2 != null) {
                        arrayList4 = c0jqjUS2.LLILZ;
                    } else {
                        arrayList4 = null;
                    }
                    c0jqc.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_start_failed_toast");
                    C0JQJ c0jqj = c0jqc.LIZ;
                    if (c0jqj != null && (room6 = c0jqj.LLILLJJLI) != null) {
                        lValueOf3 = Long.valueOf(room6.getOwnerUserId());
                    } else {
                        lValueOf3 = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf3, "anchor_id");
                    C0JQJ c0jqj2 = c0jqc.LIZ;
                    if (c0jqj2 != null && (room5 = c0jqj2.LLILLJJLI) != null) {
                        lValueOf4 = Long.valueOf(room5.getId());
                    } else {
                        lValueOf4 = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf4, "room_id");
                    C0JQJ c0jqj3 = c0jqc.LIZ;
                    if (c0jqj3 != null) {
                        str2 = c0jqj3.LL;
                    } else {
                        str2 = null;
                    }
                    c474500IjALIZ.LJJII(str2, "enter_from");
                    if (arrayList4 != null) {
                        numValueOf2 = Integer.valueOf(arrayList4.size());
                    } else {
                        numValueOf2 = null;
                    }
                    c474500IjALIZ.LJJII(numValueOf2, "poll_emote_options_cnt");
                    if (arrayList4 != null) {
                        string2 = arrayList4.toString();
                    } else {
                        string2 = null;
                    }
                    c474500IjALIZ.LJJII(string2, "poll_emote_options_id_set");
                    c474500IjALIZ.LJJII("insufficient_emote", "fail_reason");
                    C0JQJ c0jqj4 = c0jqc.LIZ;
                    if (c0jqj4 != null) {
                        str3 = c0jqj4.LLILZIL;
                    }
                    c474500IjALIZ.LJJII(str3, "user_type");
                    c474500IjALIZ.LIZ();
                    C766270U4b.LIZLLL(2131852073);
                    return;
                }
                c510160Jza.LIZJ();
                C0JQC c0jqc2 = (C0JQC) this.LIZ.wS().LLILZ.getValue();
                C0JQJ c0jqj5 = c0jqc2.LIZ;
                if (c0jqj5 != null) {
                    arrayList2 = c0jqj5.LLILZ;
                } else {
                    arrayList2 = null;
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_emote_poll_start_click");
                C0JQJ c0jqj6 = c0jqc2.LIZ;
                if (c0jqj6 != null && (room4 = c0jqj6.LLILLJJLI) != null) {
                    lValueOf = Long.valueOf(room4.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ2.LJJII(lValueOf, "anchor_id");
                C0JQJ c0jqj7 = c0jqc2.LIZ;
                if (c0jqj7 != null && (room3 = c0jqj7.LLILLJJLI) != null) {
                    lValueOf2 = Long.valueOf(room3.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ2.LJJII(lValueOf2, "room_id");
                C0JQJ c0jqj8 = c0jqc2.LIZ;
                if (c0jqj8 != null) {
                    str = c0jqj8.LL;
                } else {
                    str = null;
                }
                c474500IjALIZ2.LJJII(str, "enter_from");
                if (arrayList2 != null) {
                    numValueOf = Integer.valueOf(arrayList2.size());
                } else {
                    numValueOf = null;
                }
                c474500IjALIZ2.LJJII(numValueOf, "poll_emote_options_cnt");
                if (arrayList2 != null) {
                    string = arrayList2.toString();
                } else {
                    string = null;
                }
                c474500IjALIZ2.LJJII(string, "poll_emote_options_id_set");
                C0JQJ c0jqj9 = c0jqc2.LIZ;
                if (c0jqj9 != null) {
                    str3 = c0jqj9.LLILZIL;
                }
                c474500IjALIZ2.LJJII(str3, "user_type");
                c474500IjALIZ2.LIZ();
                final EmotePollEditVM emotePollEditVMWS = this.LIZ.wS();
                final C0JQG c0jqg = new C0JQG(this.LIZ);
                final C0JQF c0jqf = new C0JQF(this.LIZ, c510160Jza);
                C0JQJ c0jqjVQ2 = emotePollEditVMWS.vQ2();
                if (c0jqjVQ2 != null && (room = c0jqjVQ2.LLILLJJLI) != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null && secUid.length() != 0) {
                    EmotePollCreateRequest emotePollCreateRequest = new EmotePollCreateRequest();
                    emotePollCreateRequest.secAnchorId = secUid;
                    C0JQJ c0jqjVQ22 = emotePollEditVMWS.vQ2();
                    if (c0jqjVQ22 != null && (room2 = c0jqjVQ22.LLILLJJLI) != null) {
                        id = room2.getId();
                    } else {
                        id = 0;
                    }
                    emotePollCreateRequest.roomId = id;
                    emotePollCreateRequest.userEmoteIds = new LinkedList();
                    C0JQJ c0jqjVQ23 = emotePollEditVMWS.vQ2();
                    if (c0jqjVQ23 != null && (arrayList3 = c0jqjVQ23.LLILZ) != null) {
                        emotePollCreateRequest.userEmoteIds.addAll(arrayList3);
                    }
                    emotePollCreateRequest.durationMs = 300000L;
                    C480460Ism.LIZ().getClass();
                    C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((EmotePollApi) C480460Ism.LIZLLL(EmotePollApi.class)).emotePollCreate(emotePollCreateRequest).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "EmotePollEditVM", "user_emote/create", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
                    if (c11nzLJIILJJIL == null || (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(emotePollEditVMWS))) == null) {
                        return;
                    }
                    c0j1n.LIZ(new C09JN() { // from class: X.0JQE
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            long j;
                            ArrayList<Long> arrayList6;
                            Long lValueOf5;
                            Long lValueOf6;
                            String str4;
                            Integer numValueOf3;
                            String string3;
                            Room room7;
                            Room room8;
                            EmotePollCreateResponse.Data data;
                            PollStartResponse pollStartResponse;
                            PollStartResponse.ResponseData responseData;
                            C1C7U.LIZ("EmotePollEditVM@dffb.create$1");
                            BaseResponse baseResponse = (BaseResponse) obj2;
                            C0JQC c0jqc3 = (C0JQC) emotePollEditVMWS.LLILZ.getValue();
                            if (baseResponse != null && (data = (EmotePollCreateResponse.Data) baseResponse.data) != null && (pollStartResponse = data.resp) != null && (responseData = pollStartResponse.data) != null) {
                                j = responseData.pollId;
                            } else {
                                j = 0;
                            }
                            Long lValueOf7 = Long.valueOf(j);
                            C0JQJ c0jqj10 = c0jqc3.LIZ;
                            String str5 = null;
                            if (c0jqj10 != null) {
                                arrayList6 = c0jqj10.LLILZ;
                            } else {
                                arrayList6 = null;
                            }
                            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_anchor_emote_poll_start_successfully");
                            C0JQJ c0jqj11 = c0jqc3.LIZ;
                            if (c0jqj11 != null && (room8 = c0jqj11.LLILLJJLI) != null) {
                                lValueOf5 = Long.valueOf(room8.getOwnerUserId());
                            } else {
                                lValueOf5 = null;
                            }
                            c474500IjALIZ3.LJJII(lValueOf5, "anchor_id");
                            C0JQJ c0jqj12 = c0jqc3.LIZ;
                            if (c0jqj12 != null && (room7 = c0jqj12.LLILLJJLI) != null) {
                                lValueOf6 = Long.valueOf(room7.getId());
                            } else {
                                lValueOf6 = null;
                            }
                            c474500IjALIZ3.LJJII(lValueOf6, "room_id");
                            c474500IjALIZ3.LJJII(lValueOf7, "poll_id");
                            C0JQJ c0jqj13 = c0jqc3.LIZ;
                            if (c0jqj13 != null) {
                                str4 = c0jqj13.LL;
                            } else {
                                str4 = null;
                            }
                            c474500IjALIZ3.LJJII(str4, "enter_from");
                            if (arrayList6 != null) {
                                numValueOf3 = Integer.valueOf(arrayList6.size());
                            } else {
                                numValueOf3 = null;
                            }
                            c474500IjALIZ3.LJJII(numValueOf3, "poll_emote_options_cnt");
                            if (arrayList6 != null) {
                                string3 = arrayList6.toString();
                            } else {
                                string3 = null;
                            }
                            c474500IjALIZ3.LJJII(string3, "poll_emote_options_id_set");
                            C0JQJ c0jqj14 = c0jqc3.LIZ;
                            if (c0jqj14 != null) {
                                str5 = c0jqj14.LLILZIL;
                            }
                            c474500IjALIZ3.LJJII(str5, "user_type");
                            c474500IjALIZ3.LIZ();
                            c0jqg.invoke();
                            C1C7U.LIZIZ("EmotePollEditVM@dffb.create$1");
                        }
                    }, new C09JN() { // from class: X.07y4
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            C1C7U.LIZ("EmotePollEditVM@dffb.create$2");
                            c0jqf.invoke(obj2);
                            C1C7U.LIZIZ("EmotePollEditVM@dffb.create$2");
                        }
                    });
                    return;
                }
                c0jqf.invoke(new IllegalArgumentException("secAnchorId is null"));
            }
        }));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJJ(2131852074, 0, 3));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C758170Tod(R.attr.ea_, new View.OnClickListener() { // from class: X.0JQ6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long lValueOf;
                Long lValueOf2;
                String str;
                String str2;
                Room room;
                Room room2;
                C0JQC c0jqc = (C0JQC) this.LL.wS().LLILZ.getValue();
                c0jqc.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_faq_click");
                C0JQJ c0jqj = c0jqc.LIZ;
                String str3 = null;
                if (c0jqj != null && (room2 = c0jqj.LLILLJJLI) != null) {
                    lValueOf = Long.valueOf(room2.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                C0JQJ c0jqj2 = c0jqc.LIZ;
                if (c0jqj2 != null && (room = c0jqj2.LLILLJJLI) != null) {
                    lValueOf2 = Long.valueOf(room.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "room_id");
                C0JQJ c0jqj3 = c0jqc.LIZ;
                if (c0jqj3 != null) {
                    str = c0jqj3.LL;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII("emote_poll_selection_page", "event_page");
                C0JQJ c0jqj4 = c0jqc.LIZ;
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

    public final EmotePollEditVM wS() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (EmotePollEditVM) assemVMLazy.getValue();
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
        this.LLJZIJLIL = view.findViewById(R.id.cdn);
        C723850SaN.LIZ(this, false, null, new C1140304d7(this), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gb0, viewGroup, false);
    }
}
