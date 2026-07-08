package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.pollist.view.assem;

import X.AbstractC511100K2q;
import X.C019F;
import X.C01GW;
import X.C0K31;
import X.C1390410mHn;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C511510K4f;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PollMemberListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public FrameLayout LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PollMemberListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/pollist/vm/SubSpacePollMemberVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PollMemberListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpacePollMemberVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 512), AFwS237S0000000_7.get$arr$(230), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(183));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh5;
    }

    public final void hp() {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = this.LLJJIII;
            if (frameLayout != null && frameLayout.getChildCount() == 0) {
                int i = (int) (36 * context.getResources().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                layoutParams.gravity = 17;
                C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
                C786410Ut5.V6(c1390410mHn, layoutParams);
                c1390410mHn.LIZJ();
                FrameLayout frameLayout2 = this.LLJJIII;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c1390410mHn, layoutParams);
                }
            }
            FrameLayout frameLayout3 = this.LLJJIII;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        ((SubSpacePollMemberVM) assemVMLazy.getValue()).vQ2(true, new AwS551S0100000_7(this, 510), new AwS586S0100000_7(this, 310));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0K3O, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (FrameLayout) view.findViewById(R.id.nlo);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vrv);
        if (recyclerView != 0) {
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            final SubSpacePollMemberVM subSpacePollMemberVM = (SubSpacePollMemberVM) assemVMLazy.getValue();
            final ArrayList arrayList = new ArrayList();
            ?? r2 = new AbstractC511100K2q(arrayList, subSpacePollMemberVM) { // from class: X.0K3O
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC511160K2w) ListProtector.get(this.LL, i)).LIZJ().getValue();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C0K3V c0k3v;
                    if ((viewHolder instanceof C0K3V) && (c0k3v = (C0K3V) viewHolder) != null) {
                        c0k3v.I5((AbstractC511160K2w) ListProtector.get(this.LL, i), null);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    C0K3V c0k3v;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == C0K2L.MEMBER.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.fia, viewGroup, false);
                        c0k3v = new C0K3V(viewTd) { // from class: X.0K3P
                            public final View LL;
                            public final TextView LLILLJJLI;
                            public final C417410GYh LLILLL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.o60);
                                this.LLILLL = (C417410GYh) viewTd.findViewById(R.id.bh2);
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                C0K3T c0k3t;
                                if ((abstractC511160K2w instanceof C0K3T) && (c0k3t = (C0K3T) abstractC511160K2w) != null) {
                                    String strLIZ = C0K7S.LIZ(c0k3t.LIZ);
                                    if (strLIZ != null) {
                                        this.LLILLJJLI.setText(strLIZ);
                                    }
                                    C511410K3v.LIZ(this.LLILLL, c0k3t.LIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                                }
                            }
                        };
                    } else {
                        c0k3v = new C0K3V(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c0k3v.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c0k3v.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c0k3v.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c0k3v.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c0k3v.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c0k3v.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c0k3v.getClass().getName();
                    return c0k3v;
                }
            };
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r2);
            subSpacePollMemberVM.LLILZ = r2;
            ((C0K31) subSpacePollMemberVM.LLILLL.getValue()).LIZ(recyclerView);
        }
        hp();
        ((C511510K4f) this.LLJJIJI.getValue()).LIZIZ(view, new AwS551S0100000_7(this, 511));
    }
}
