package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem;

import X.C019F;
import X.C055B;
import X.C0JRZ;
import X.C13LE;
import X.C1558520qew;
import X.C1586106Ix;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2867019d;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartVM;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class EmotePollStartOptionsAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollStartOptionsAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/start/vm/EmotePollStartVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollStartOptionsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollStartVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055B(c19719912DlLIZ), new C1586106Ix(), null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0JRV, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C500260Jjc.LJIILIIL(LJJIJL());
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06JM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C06JN) obj).LLILLJJLI;
            }
        }, null, new C2867019d(), 6);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.h1f);
        if (recyclerView != 0) {
            EmotePollStartVM emotePollStartVM = (EmotePollStartVM) this.LLIZLLLIL.getValue();
            ?? r2 = new C0JRZ(new ArrayList(), emotePollStartVM) { // from class: X.0JRV
                public final EmotePollStartVM LLILLJJLI;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC492010JRf) ListProtector.get(this.LL, i)).LIZ().getValue();
                }

                {
                    this.LLILLJJLI = emotePollStartVM;
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
                    C491980JRc c491980JRc;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == C0JRX.OPTION_START.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.gvn, viewGroup, false);
                        c491980JRc = new C491980JRc(viewTd) { // from class: X.0JRb
                            public final View LL;
                            public final TextView LLILLJJLI;
                            public final C1324720kZq LLILLL;
                            public final C19R6 LLILZ;
                            public final View LLILZIL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.zz2);
                                this.LLILLL = (C1324720kZq) viewTd.findViewById(R.id.bh2);
                                this.LLILZ = (C19R6) viewTd.findViewById(R.id.h16);
                                this.LLILZIL = viewTd.findViewById(R.id.rfa);
                            }

                            @Override // X.C491980JRc
                            public final void I5(AbstractC492010JRf abstractC492010JRf, InterfaceC2753014t interfaceC2753014t) {
                                C491960JRa c491960JRa;
                                String nickName;
                                int iIntValue;
                                Integer numLIZJ;
                                if ((abstractC492010JRf instanceof C491960JRa) && (c491960JRa = (C491960JRa) abstractC492010JRf) != null) {
                                    TextView textView = this.LLILLJJLI;
                                    User user = c491960JRa.LIZ.userInfo;
                                    if (user == null || (nickName = user.getNickName()) == null) {
                                        nickName = "";
                                    }
                                    textView.setText(nickName);
                                    C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), c491960JRa.LIZ.userInfo, this.LLILLL);
                                    C491980JRc.L5(c491960JRa.LIZ, this.LLILZ);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
                                    gradientDrawable.setColor(C446980Hfs.LIZ(this.LL.getContext(), android.R.color.transparent));
                                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
                                    Context context = this.LL.getContext();
                                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c5y, context)) != null) {
                                        iIntValue = numLIZJ.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    gradientDrawable.setStroke(iLIZIZ, iIntValue);
                                    this.LLILZIL.setBackground(gradientDrawable);
                                }
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
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r2);
            emotePollStartVM.LL = r2;
        }
        EmotePollStartAbility emotePollStartAbility = (EmotePollStartAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), EmotePollStartAbility.class, null);
        if (emotePollStartAbility != null) {
            emotePollStartAbility.rp1();
        }
    }
}
