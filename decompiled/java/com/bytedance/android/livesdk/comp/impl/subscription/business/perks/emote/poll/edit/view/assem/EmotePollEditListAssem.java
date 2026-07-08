package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.view.assem;

import X.AbstractC21673619ry;
import X.AbstractC492010JRf;
import X.C019F;
import X.C055G;
import X.C0DXR;
import X.C0IJT;
import X.C0JQC;
import X.C0JQJ;
import X.C0JRU;
import X.C0JRZ;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C176600m4;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C474500IjA;
import X.C491710JQb;
import X.C491740JQe;
import X.C491750JQf;
import X.C491840JQo;
import X.C491960JRa;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm.EmotePollEditVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartAbility;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import webcast.api.sub.UserEmotePollOptionsResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollEditListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public C0JQJ LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollEditListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/edit/vm/EmotePollEditVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollEditListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollEditVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055G(c19719912DlLIZ), new C491840JQo(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hpq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0JRU, X.0JRZ, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0JRZ c0jrz;
        Long lValueOf;
        Long lValueOf2;
        String str;
        Room room;
        Room room2;
        C0JRU c0jru;
        ArrayList<AbstractC492010JRf> arrayList;
        ArrayList<Long> arrayList2;
        ArrayList<Long> arrayList3;
        EmotePollStartAbility emotePollStartAbility;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        UserEmotePollOptionsResponse.Data dataIW1 = null;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JQl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C491760JQg) obj).LLILLL;
            }
        }, null, new C491710JQb(this), 6);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.emw);
        if (recyclerView != 0) {
            EmotePollEditVM emotePollEditVM = (EmotePollEditVM) this.LLJJI.getValue();
            ?? r7 = new C0JRZ(new ArrayList(), emotePollEditVM) { // from class: X.0JRU
                public final EmotePollEditVM LLILLJJLI;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC492010JRf) ListProtector.get(this.LL, i)).LIZ().getValue();
                }

                {
                    this.LLILLJJLI = emotePollEditVM;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C491980JRc c491980JRc;
                    if ((viewHolder instanceof C491980JRc) && (c491980JRc = (C491980JRc) viewHolder) != null) {
                        c491980JRc.I5((AbstractC492010JRf) ListProtector.get(this.LL, i), this.LLILLJJLI.vQ2());
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder c491980JRc;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == C0JRX.OPTION_START.getValue()) {
                        c491980JRc = new C491990JRd(C786410Ut5.Td(layoutInflaterNe, R.layout.gvm, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0JRX.LOAD_MORE.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hp3, viewGroup, false);
                        c491980JRc = new C491980JRc(viewTd) { // from class: X.0JRY
                            public final View LL;
                            public final ViewGroup LLILLJJLI;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (ViewGroup) viewTd.findViewById(R.id.nlo);
                            }

                            @Override // X.C491980JRc
                            public final void I5(AbstractC492010JRf abstractC492010JRf, InterfaceC2753014t interfaceC2753014t) {
                                this.LLILLJJLI.addView(new C16FZ(this.LL.getContext(), null));
                            }
                        };
                    } else {
                        c491980JRc = new C491980JRc(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c491980JRc.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c491980JRc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c491980JRc.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c491980JRc.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c491980JRc.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c491980JRc.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c491980JRc.getClass().getName();
                    return c491980JRc;
                }
            };
            InterfaceC665370Q7z interfaceC665370Q7z = emotePollEditVM.LLILLJJLI;
            String str2 = null;
            if (interfaceC665370Q7z != null && (emotePollStartAbility = (EmotePollStartAbility) C1558520qew.LIZ(interfaceC665370Q7z, EmotePollStartAbility.class, null)) != null) {
                dataIW1 = emotePollStartAbility.iW1();
            }
            C0JQJ c0jqjVQ2 = emotePollEditVM.vQ2();
            if (c0jqjVQ2 != null) {
                c0jqjVQ2.LLILLL = dataIW1;
            }
            if (dataIW1 != null) {
                C0JQJ c0jqjVQ22 = emotePollEditVM.vQ2();
                if (c0jqjVQ22 != null && (arrayList3 = c0jqjVQ22.LLILZ) != null) {
                    arrayList3.clear();
                }
                for (UserEmote userEmote : C13LP.LL(dataIW1.f1039emotes, 3)) {
                    C0JQJ c0jqjVQ23 = emotePollEditVM.vQ2();
                    if (c0jqjVQ23 != null && (arrayList2 = c0jqjVQ23.LLILZ) != null) {
                        arrayList2.add(Long.valueOf(userEmote.emoteId));
                    }
                }
                Iterator<UserEmote> it2 = dataIW1.f1039emotes.iterator();
                while (it2.hasNext()) {
                    r7.LL.add(new C491960JRa(it2.next()));
                }
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r7);
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.03Ij
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    if (recyclerView2.getChildAdapterPosition(view2) == 0) {
                        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                    rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
            });
            emotePollEditVM.LL = r7;
            C491740JQe c491740JQe = (C491740JQe) emotePollEditVM.LLILZIL.getValue();
            c491740JQe.getClass();
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter instanceof C0JRZ) {
                c0jrz = (C0JRZ) adapter;
            } else {
                c0jrz = null;
            }
            c491740JQe.LIZJ = c0jrz;
            recyclerView.addOnScrollListener(c491740JQe.LJ);
            if (dataIW1 != null && C176600m4.LIZIZ(Boolean.valueOf(dataIW1.hasMore)) && (c0jru = emotePollEditVM.LL) != null && (arrayList = c0jru.LL) != null) {
                arrayList.add(((C491740JQe) emotePollEditVM.LLILZIL.getValue()).LIZ);
            }
            C0JRU c0jru2 = emotePollEditVM.LL;
            if (c0jru2 != null) {
                c0jru2.notifyDataSetChanged();
            }
            emotePollEditVM.setState(new C491750JQf());
            C0JQC c0jqc = (C0JQC) emotePollEditVM.LLILZ.getValue();
            c0jqc.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_selection_page_show");
            C0JQJ c0jqj = c0jqc.LIZ;
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
            C0JQJ c0jqj4 = c0jqc.LIZ;
            if (c0jqj4 != null) {
                str2 = c0jqj4.LLILZIL;
            }
            c474500IjALIZ.LJJII(str2, "user_type");
            c474500IjALIZ.LIZ();
        }
    }
}
