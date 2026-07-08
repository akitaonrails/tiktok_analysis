package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.view.assem;

import X.AbstractC502430Jn7;
import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C16FZ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C491870JQr;
import X.C502810Jnj;
import X.C502820Jnk;
import X.C502830Jnl;
import X.C502840Jnm;
import X.C502850Jnn;
import X.C502860Jno;
import X.C502870Jnp;
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
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.vm.SubSpaceMemberVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import webcast.api.sub.SpaceMemberInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceMemberListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public FrameLayout LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpaceMemberListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/spacemember/vm/SubSpaceMemberVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpaceMemberListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceMemberVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C502820Jnk(c19719912DlLIZ), new C502860Jno(), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new C502850Jnn());
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
        ((SubSpaceMemberVM) assemVMLazy.getValue()).vQ2(true, new C502840Jnm(this), new C502810Jnj(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0JnL, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (FrameLayout) view.findViewById(R.id.nlo);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vrv);
        if (recyclerView != 0) {
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            final SubSpaceMemberVM subSpaceMemberVM = (SubSpaceMemberVM) assemVMLazy.getValue();
            final ArrayList arrayList = new ArrayList();
            ?? r2 = new AbstractC502430Jn7(arrayList, subSpaceMemberVM) { // from class: X.0JnL
                public final SubSpaceMemberVM LLILLJJLI;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC503810JpL) ListProtector.get(this.LL, i)).LIZJ().getValue();
                }

                {
                    this.LLILLJJLI = subSpaceMemberVM;
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
                    RecyclerView.ViewHolder c502700JnY;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == EnumC503250JoR.MEMBER.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hpm, viewGroup, false);
                        final SubSpaceMemberVM subSpaceMemberVM2 = this.LLILLJJLI;
                        c502700JnY = new C502700JnY(viewTd, subSpaceMemberVM2) { // from class: X.0JnV
                            public final View LL;
                            public final SubSpaceMemberVM LLILLJJLI;
                            public final TextView LLILLL;
                            public final C1324720kZq LLILZ;
                            public final C0KVZ LLILZIL;
                            public final TextView LLILZLL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = subSpaceMemberVM2;
                                this.LLILLL = (TextView) viewTd.findViewById(R.id.o60);
                                this.LLILZ = (C1324720kZq) viewTd.findViewById(R.id.bh2);
                                this.LLILZIL = (C0KVZ) viewTd.findViewById(R.id.bqd);
                                this.LLILZLL = (TextView) viewTd.findViewById(R.id.wi5);
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C502690JnX c502690JnX;
                                int i2;
                                if ((abstractC503810JpL instanceof C502690JnX) && (c502690JnX = (C502690JnX) abstractC503810JpL) != null) {
                                    C502680JnW.LIZ(0, this.LLILLL, this.LLILLJJLI.LLILLJJLI);
                                    String strLIZ = C0KVU.LIZ(c502690JnX.LIZ.userInfo);
                                    if (strLIZ != null) {
                                        this.LLILLL.setText(strLIZ);
                                    }
                                    C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), c502690JnX.LIZ.userInfo, this.LLILZ);
                                    C0KVZ c0kvz = this.LLILZIL;
                                    SpaceMemberInfo spaceMemberInfo = c502690JnX.LIZ;
                                    C502700JnY.S5(c0kvz, spaceMemberInfo.badgeList, spaceMemberInfo.userInfo);
                                    if (c502690JnX.LIZ.subStartTimeSec == 0) {
                                        C786410Ut5.LJLLLLLL(8, this.LLILZLL);
                                    } else {
                                        C786410Ut5.LJLLLLLL(0, this.LLILZLL);
                                        try {
                                            String str = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(c502690JnX.LIZ.subStartTimeSec));
                                            TextView textView = this.LLILZLL;
                                            if (this.LLILLJJLI.LLILLJJLI) {
                                                i2 = 2131856640;
                                            } else {
                                                i2 = 2131844282;
                                            }
                                            textView.setText(C786410Ut5.j4(C497740JfY.LJIJI(i2), Arrays.copyOf(new Object[]{str}, 1)));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                    this.LLILLL.requestLayout();
                                    N5(this.LL, c502690JnX.LIZ.userInfo, null, null);
                                }
                            }
                        };
                    } else if (i == EnumC503250JoR.LOAD_MORE.getValue()) {
                        c502700JnY = new C502580JnM(C786410Ut5.Td(layoutInflaterNe, R.layout.hp3, viewGroup, false));
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
            subSpaceMemberVM.LLILZIL = r2;
            ((C502870Jnp) subSpaceMemberVM.LLILZ.getValue()).LIZ(recyclerView);
        }
        hp();
        ((C491870JQr) this.LLJJIJI.getValue()).LIZIZ(view, new C502830Jnl(this));
    }
}
