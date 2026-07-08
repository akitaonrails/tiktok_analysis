package com.ss.android.ugc.aweme.msg;

import X.AbstractC21673619ry;
import X.AbstractC879060Ye8;
import X.C01GW;
import X.C0DU5;
import X.C0DU6;
import X.C0I73;
import X.C0NZR;
import X.C0NZT;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z2N;
import X.C11FW;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13DV;
import X.C13LZ;
import X.C1559260qg8;
import X.C1697820uHc;
import X.C19748212Oi;
import X.C19748312Oj;
import X.C19ME;
import X.C2296808zG;
import X.C23250099c;
import X.C2441009hQ;
import X.C276590Asj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C911500ZpM;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS143S1100000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import wh6.AbS687S0100000_4;
import wh6.AbS708S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class PublicGroupOnboardingCardAssem extends ReusedUISlotAssem<PublicGroupOnboardingCardAssem> implements InterfaceC712990Rxx<C0Z2N> {
    public String LLLF;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 148));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 156));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 155));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 152));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 153));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 154));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 151));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 149));
    public final C19748212Oi LLL = new C19748212Oi();
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 150));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cjs;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLJZIJLIL.getValue();
        if (abstractC879060Ye8 != null) {
            abstractC879060Ye8.LJIILLIIL((C19748312Oj) this.LLLFF.getValue());
        }
        this.LLLF = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        String str = this.LLLF;
        if (str == null) {
            return;
        }
        C11FW.LIZ.getClass();
        C01GW c01gw = C11FW.LIZIZ;
        if (!Intrinsics.LJFF(((Keva) c01gw.getValue()).getString("key_posted_toast_conversation_id", null), str)) {
            ((Keva) c01gw.getValue()).storeString("key_pending_publish_creation_id", null);
            return;
        }
        ((Keva) c01gw.getValue()).storeString("key_posted_toast_conversation_id", null);
        Activity activityLIZIZ = C737910Sx3.LIZIZ(getContentView().getContext());
        if (activityLIZIZ == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.zi);
        c1389890mGx.LJIIIZ(2131829006);
        c1389890mGx.LJIIJJI();
    }

    public final SessionInfo sp() {
        C457780HxI c457780HxI = (C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c457780HxI != null) {
            return c457780HxI.LL;
        }
        return null;
    }

    public final void tp() {
        Integer numLIZ = this.LLL.LIZ();
        if (numLIZ == null) {
            C786410Ut5.LJLLLLLL(4, (View) this.LLJLLIL.getValue());
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJLLL.getValue(), 4);
        } else {
            ((TextView) this.LLJLLL.getValue()).setText(u.LJJIFFI(u.LJJIFFI(getContentView().getContext().getString(2131838709), "{num1}", numLIZ.toString(), false), "{num2}", "2", false));
            TuxTextView tuxTextView = (TuxTextView) this.LLJLLL.getValue();
            C19ME c19me = (C19ME) ((View) this.LLJLLL.getValue()).getLayoutParams();
            c19me.horizontalBias = numLIZ.intValue() / 2;
            C786410Ut5.R6(tuxTextView, c19me);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJLLL.getValue(), 0);
            C786410Ut5.LJLLLLLL(numLIZ.intValue() > 0 ? 0 : 4, (View) this.LLJLLIL.getValue());
        }
        if (this.LLL.LIZIZ) {
            ((TextView) this.LLJLIL.getValue()).setText(2131838708);
            ((TextView) this.LLJLILLLLZIIL.getValue()).setText(2131838706);
        } else {
            ((TextView) this.LLJLIL.getValue()).setText(2131838707);
            ((TextView) this.LLJLILLLLZIIL.getValue()).setText(2131838705);
        }
        boolean z = this.LLL.LIZIZ;
        C786410Ut5.LJLLLLLL(z ? 0 : 8, (View) this.LLJZ.getValue());
        if (z) {
            C786410Ut5.I7(new AbS708S0100000_29(this, 2), (View) this.LLJZ.getValue());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLJZIJLIL.getValue();
        if (abstractC879060Ye8 != null) {
            abstractC879060Ye8.LJIILLIIL((C19748312Oj) this.LLLFF.getValue());
        }
        this.LLLF = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        String conversationId;
        Context context = getContentView().getContext();
        float f = C0I73.LIZ;
        View view2 = (View) this.LLJL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        c384050F3z.LIZJ = Float.valueOf(f);
        view2.setBackground(c384050F3z.LIZ(context));
        View view3 = (View) this.LLJLL.getValue();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zz);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(99));
        view3.setBackground(c384050F3z2.LIZ(context));
        View view4 = (View) this.LLJLLIL.getValue();
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.o5);
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(99));
        view4.setBackground(c384050F3z3.LIZ(context));
        View view5 = (View) this.LLJZ.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(C2441009hQ.LJIIL(iIntValue, 13));
        view5.setBackground(gradientDrawable);
        SessionInfo sessionInfoSp = sp();
        if (sessionInfoSp != null && (conversationId = sessionInfoSp.getConversationId()) != null) {
            C11FW.LIZ.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C911500ZpM(conversationId, null), 3);
        }
    }

    public final boolean op(C0Y8T c0y8t) {
        boolean z;
        boolean z2;
        C19748212Oi c19748212Oi = this.LLL;
        boolean z3 = c19748212Oi.LIZIZ;
        if (z3) {
            AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLJZIJLIL.getValue();
            if (abstractC879060Ye8 != null) {
                abstractC879060Ye8.LJIILLIIL((C19748312Oj) this.LLLFF.getValue());
            }
            return false;
        }
        int i = c19748212Oi.LIZ;
        if (C13LZ.LJ(c0y8t.getMemberCount() - 1, 0, 2) >= 2) {
            z = true;
        } else {
            z = false;
        }
        c19748212Oi.LIZIZ = z;
        int memberCount = c0y8t.getMemberCount();
        c19748212Oi.LIZ = memberCount;
        if (memberCount == i && z3 == c19748212Oi.LIZIZ) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c19748212Oi.LIZIZ) {
            C0NZR.LIZJ(this.LLL.LIZJ, C0NZT.ONBOARDING_CARD_STATUS_FINISH);
        }
        return z2;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0Z2N c0z2n) {
        String conversationId;
        String conversationId2;
        C0Z2N c0z2n2 = c0z2n;
        C869590Y9l c869590Y9l = c0z2n2.LL;
        C0NZT c0nztLIZ = C0NZR.LIZ(c869590Y9l);
        C19748212Oi c19748212Oi = this.LLL;
        c19748212Oi.getClass();
        c19748212Oi.LIZJ = c0z2n2.LL;
        if (c0nztLIZ == C0NZT.ONBOARDING_CARD_STATUS_FINISH) {
            c19748212Oi.LIZIZ = true;
        }
        C0NZR.LIZJ(c869590Y9l, c0nztLIZ);
        SessionInfo sessionInfoSp = sp();
        if (sessionInfoSp != null && (conversationId = sessionInfoSp.getConversationId()) != null) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId);
            if (c0y8tLIZ != null) {
                AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLJZIJLIL.getValue();
                if (abstractC879060Ye8 != null) {
                    abstractC879060Ye8.LJIIJJI((C19748312Oj) this.LLLFF.getValue());
                }
                op(c0y8tLIZ);
            }
            SessionInfo sessionInfoSp2 = sp();
            if (sessionInfoSp2 != null && (conversationId2 = sessionInfoSp2.getConversationId()) != null) {
                RecyclerView recyclerView = (RecyclerView) getContentView().findViewById(R.id.f810tuk);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContentView().getContext()));
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                c13dvLIZIZ.add(new C0DU5(R.raw.icon_person_plus, 2131838711, new AwS143S1100000_29(this, conversationId2, 3)));
                c13dvLIZIZ.add(new C0DU5(R.raw.icon_post, 2131838714, new AwS143S1100000_29(this, conversationId2, 4)));
                if (((Number) C276590Asj.LIZ.getValue()).intValue() == 1) {
                    c13dvLIZIZ.add(new C0DU5(R.raw.icon_bubble_ellipsis_right, 2131838712, new AwS143S1100000_29(this, conversationId2, 5)));
                }
                final List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                recyclerView.setAdapter(new AbstractC21673619ry<C0DU6>(listLIZ) { // from class: X.0DU4
                    public final List<C0DU5> LL;

                    @Override // X.AbstractC21673619ry
                    public final int getItemCount() {
                        return this.LL.size();
                    }

                    {
                        this.LL = listLIZ;
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                        C0DU6 c0du6 = (C0DU6) viewHolder;
                        C0DU5 c0du5 = (C0DU5) ListProtector.get(this.LL, i);
                        c0du6.LL.setIconRes(c0du5.LIZ);
                        c0du6.LLILLJJLI.setText(c0du5.LIZIZ);
                        C786410Ut5.I7(new AbS687S0100000_4(c0du5, 2), c0du6.itemView);
                    }

                    @Override // X.AbstractC21673619ry
                    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                        C0DU6 c0du6 = new C0DU6(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ciw, viewGroup, false));
                        try {
                            View view = c0du6.itemView;
                            if (view != null) {
                                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        c0du6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                        try {
                            if (c0du6.itemView.getParent() != null) {
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(C0DU6.class.getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i);
                                    C1AF0.LIZJ(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) c0du6.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(c0du6.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C2081408Dk.LIZ(e2);
                            C2344809Gs.LIZ(e2);
                        }
                        C20612085q.LIZ = C0DU6.class.getName();
                        return c0du6;
                    }
                });
            }
            tp();
            this.LLLF = conversationId;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0Z2N c0z2n) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0Z2N c0z2n) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
