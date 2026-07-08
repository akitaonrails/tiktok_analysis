package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.assem;

import X.AbstractC511100K2q;
import X.AbstractC511160K2w;
import X.AnonymousClass0208;
import X.C019F;
import X.C0K4A;
import X.C0K4F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C511240K3e;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import webcast.api.pgc_sub.PGCTopicByCategory;

/* JADX INFO: loaded from: classes8.dex */
public final class PostTopicListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public C0K4F LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostTopicListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/newpost/vm/SubSpaceNewPostVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PostTopicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceNewPostVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 504), AFwS237S0000000_7.get$arr$(226), null, true);
    }

    public final C0K4F Go() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0K4F.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C0K4F) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    public final SubSpaceNewPostVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SubSpaceNewPostVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0K3e, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView recyclerView;
        List<PGCTopicByCategory> list;
        List<PGCTopicByCategory> list2;
        SpaceTopicCategory spaceTopicCategory;
        C0K4A c0k4a;
        C0K4A c0k4a2;
        C0K4A c0k4a3;
        C0K4F c0k4fDQ2;
        C0K4A c0k4a4;
        SpaceTopicCategory spaceTopicCategory2;
        C0K4F c0k4fDQ22;
        C0K4A c0k4a5;
        List<PGCTopicByCategory> list3;
        PGCTopicByCategory pGCTopicByCategory;
        SpaceTopicCategory spaceTopicCategory3;
        C0K4F c0k4fDQ23;
        C0K4A c0k4a6;
        C0K4A c0k4a7;
        super.onViewCreated(view);
        SpaceTopicContent spaceTopicContent = null;
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != 0) {
            SubSpaceNewPostVM subSpaceNewPostVMHo = Ho();
            subSpaceNewPostVMHo.HQ2();
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C0K4F c0k4fDQ24 = subSpaceNewPostVMHo.DQ2();
            if (c0k4fDQ24 != null && (c0k4a7 = c0k4fDQ24.LL) != null) {
                list = c0k4a7.LIZ;
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty() && (c0k4fDQ2 = subSpaceNewPostVMHo.DQ2()) != null && (c0k4a4 = c0k4fDQ2.LL) != null && (spaceTopicCategory2 = c0k4a4.LIZIZ) != null && spaceTopicCategory2.topicCategoryId == 0 && (c0k4fDQ22 = subSpaceNewPostVMHo.DQ2()) != null && (c0k4a5 = c0k4fDQ22.LL) != null && (list3 = c0k4a5.LIZ) != null && (pGCTopicByCategory = (PGCTopicByCategory) ListProtector.get(list3, 0)) != null && (spaceTopicCategory3 = pGCTopicByCategory.topicCategory) != null && (c0k4fDQ23 = subSpaceNewPostVMHo.DQ2()) != null && (c0k4a6 = c0k4fDQ23.LL) != null) {
                c0k4a6.LIZIZ = spaceTopicCategory3;
            }
            C0K4F c0k4fDQ25 = subSpaceNewPostVMHo.DQ2();
            if (c0k4fDQ25 != null && (c0k4a3 = c0k4fDQ25.LL) != null) {
                list2 = c0k4a3.LIZ;
            } else {
                list2 = null;
            }
            C0K4F c0k4fDQ26 = subSpaceNewPostVMHo.DQ2();
            if (c0k4fDQ26 != null && (c0k4a2 = c0k4fDQ26.LL) != null) {
                spaceTopicCategory = c0k4a2.LIZIZ;
            } else {
                spaceTopicCategory = null;
            }
            ArrayList<AbstractC511160K2w> arrayListGQ2 = subSpaceNewPostVMHo.GQ2(list2, spaceTopicCategory);
            ArrayList arrayList = new ArrayList();
            if (arrayListGQ2 != null && (true ^ arrayListGQ2.isEmpty())) {
                arrayList.addAll(arrayListGQ2);
            }
            ?? r2 = new AbstractC511100K2q(arrayList, subSpaceNewPostVMHo, subSpaceNewPostVMHo.DQ2()) { // from class: X.0K3e
                public final SubSpaceNewPostVM LLILLJJLI;
                public final C0K4F LLILLL;

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
                        c0k3v.I5((AbstractC511160K2w) ListProtector.get(this.LL, i), this.LLILLL);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder c0k3v;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == C0K2L.HEADER.getValue()) {
                        c0k3v = new C511310K3l(C786410Ut5.Td(layoutInflaterNe, R.layout.fi8, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.TOPIC.getValue()) {
                        c0k3v = new C0K41(C786410Ut5.Td(layoutInflaterNe, R.layout.fi5, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL.getValue()) {
                        c0k3v = new C0K40(C786410Ut5.Td(layoutInflaterNe, R.layout.fi4, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL_ITEM.getValue()) {
                        c0k3v = new C511360K3q(C786410Ut5.Td(layoutInflaterNe, R.layout.fi3, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.CUSTOM.getValue()) {
                        c0k3v = new C511250K3f(C786410Ut5.Td(layoutInflaterNe, R.layout.fi7, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL_ADD.getValue()) {
                        c0k3v = new C511260K3g(C786410Ut5.Td(layoutInflaterNe, R.layout.fi6, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.DIVIDER.getValue()) {
                        c0k3v = new C0K2P(C786410Ut5.Td(layoutInflaterNe, R.layout.fhs, viewGroup, false));
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

                {
                    this.LLILLJJLI = subSpaceNewPostVMHo;
                    this.LLILLL = c0k4f;
                }
            };
            AssemViewModel.selectSubscribe$default(subSpaceNewPostVMHo, new C2217381BqS() { // from class: X.0Jmc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502070JmX) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS373S0200000_7(subSpaceNewPostVMHo, (C511240K3e) r2, 92), 12, null);
            AssemViewModel.selectSubscribe$default(subSpaceNewPostVMHo, new C2217381BqS() { // from class: X.0Jmd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502070JmX) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS373S0200000_7(subSpaceNewPostVMHo, (C511240K3e) r2, 93), 12, null);
            recyclerView.setAdapter(r2);
            subSpaceNewPostVMHo.LLILZ = r2;
            C0K4F c0k4fDQ27 = subSpaceNewPostVMHo.DQ2();
            if (c0k4fDQ27 != null && (c0k4a = c0k4fDQ27.LL) != null) {
                spaceTopicContent = c0k4a.LIZLLL;
            }
            subSpaceNewPostVMHo.JQ2(spaceTopicContent);
            subSpaceNewPostVMHo.IQ2();
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0JmY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502070JmX) obj).LLILZ;
                }
            }, null, new AwS621S0100000_7(this, 115), 6);
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0JmZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502070JmX) obj).LLILZIL;
                }
            }, null, AnonymousClass0208.get$arr$(65), 6);
        }
    }
}
