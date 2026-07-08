package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem;

import X.C019F;
import X.C019Z;
import X.C055A;
import X.C06V8;
import X.C0DXR;
import X.C0JRZ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class EmotePollOptionsAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollOptionsAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/detail/vm/EmotePollDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollOptionsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollDetailVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055A(c19719912DlLIZ), new C06V8(), null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0JRW, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C500260Jjc.LJIILIIL(LJJIJL());
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Cj3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C316840CbS) obj).LLILLJJLI;
            }
        }, null, new C019Z(), 6);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.h1f);
        if (recyclerView != 0) {
            EmotePollDetailVM emotePollDetailVM = (EmotePollDetailVM) this.LLIZLLLIL.getValue();
            ?? r2 = new C0JRZ(new ArrayList(), emotePollDetailVM) { // from class: X.0JRW
                public final EmotePollDetailVM LLILLJJLI;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC492010JRf) ListProtector.get(this.LL, i)).LIZ().getValue();
                }

                {
                    this.LLILLJJLI = emotePollDetailVM;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C491980JRc c491980JRc;
                    if ((viewHolder instanceof C491980JRc) && (c491980JRc = (C491980JRc) viewHolder) != null) {
                        c491980JRc.I5((AbstractC492010JRf) ListProtector.get(this.LL, i), this.LLILLJJLI.wQ2());
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder c491980JRc;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == C0JRX.OPTION_VOTE.getValue()) {
                        c491980JRc = new C492030JRh(C786410Ut5.Td(layoutInflaterNe, R.layout.gvl, viewGroup, false), this.LLILLJJLI);
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
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r2);
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            recyclerView.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.06We
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int itemCount;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition < itemCount - 1) {
                        rect.bottom = this.LL;
                    } else {
                        rect.bottom = 0;
                    }
                }
            });
            emotePollDetailVM.LLILLL = r2;
        }
        EmotePollDetailAbility emotePollDetailAbility = (EmotePollDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), EmotePollDetailAbility.class, null);
        if (emotePollDetailAbility != null) {
            emotePollDetailAbility.pN1();
        }
    }
}
