package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.view.assem;

import X.AbstractC502430Jn7;
import X.C019F;
import X.C01GW;
import X.C12970055s;
import X.C13LE;
import X.C1637806bA;
import X.C16FZ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C491870JQr;
import X.C502870Jnp;
import X.C502950Jnx;
import X.C502960Jny;
import X.C502970Jnz;
import X.C502980Jo0;
import X.C502990Jo1;
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
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class PollMemberListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public FrameLayout LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PollMemberListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/pollist/vm/SubSpacePollMemberVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PollMemberListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpacePollMemberVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12970055s(c19719912DlLIZ), new C502990Jo1(), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new C502980Jo0());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hob;
    }

    public final void hp() {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = this.LLJJIII;
            if (frameLayout != null && frameLayout.getChildCount() == 0) {
                C16FZ c16fz = new C16FZ(context, null);
                FrameLayout frameLayout2 = this.LLJJIII;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c16fz);
                }
            }
            FrameLayout frameLayout3 = this.LLJJIII;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        ((SubSpacePollMemberVM) assemVMLazy.getValue()).vQ2(true, new C502970Jnz(this), new C502950Jnx(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0JnH, X.19ry] */
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
            ?? r2 = new AbstractC502430Jn7(arrayList, subSpacePollMemberVM) { // from class: X.0JnH
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC503810JpL) ListProtector.get(this.LL, i)).LIZJ().getValue();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C502700JnY c502700JnY;
                    if ((viewHolder instanceof C502700JnY) && (c502700JnY = (C502700JnY) viewHolder) != null) {
                        c502700JnY.I5((AbstractC503810JpL) ListProtector.get(this.LL, i), null);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    C502700JnY c502700JnY;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == EnumC503250JoR.MEMBER.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hph, viewGroup, false);
                        c502700JnY = new C502700JnY(viewTd) { // from class: X.0JnI
                            public final View LL;
                            public final TextView LLILLJJLI;
                            public final C1324720kZq LLILLL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.o60);
                                this.LLILLL = (C1324720kZq) viewTd.findViewById(R.id.bh2);
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C502550JnJ c502550JnJ;
                                if ((abstractC503810JpL instanceof C502550JnJ) && (c502550JnJ = (C502550JnJ) abstractC503810JpL) != null) {
                                    String strLIZ = C0KVU.LIZ(c502550JnJ.LIZ);
                                    if (strLIZ != null) {
                                        this.LLILLJJLI.setText(strLIZ);
                                    }
                                    C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), c502550JnJ.LIZ, this.LLILLL);
                                }
                            }
                        };
                    } else {
                        c502700JnY = new C502700JnY(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c502700JnY.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c502700JnY.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c502700JnY.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c502700JnY.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c502700JnY.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c502700JnY.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c502700JnY.getClass().getName();
                    return c502700JnY;
                }
            };
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r2);
            subSpacePollMemberVM.LLILZ = r2;
            ((C502870Jnp) subSpacePollMemberVM.LLILLL.getValue()).LIZ(recyclerView);
        }
        hp();
        ((C491870JQr) this.LLJJIJI.getValue()).LIZIZ(view, new C502960Jny(this));
    }
}
