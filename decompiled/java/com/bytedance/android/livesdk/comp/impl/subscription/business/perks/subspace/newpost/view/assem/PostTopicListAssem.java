package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem;

import X.AbstractC502430Jn7;
import X.AbstractC503810JpL;
import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C441301nf;
import X.C501810Jm7;
import X.C501820Jm8;
import X.C501850JmB;
import X.C501860JmC;
import X.C501870JmD;
import X.C501880JmE;
import X.C502220Jmm;
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
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.TopicByCategory;

/* JADX INFO: loaded from: classes8.dex */
public final class PostTopicListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public C501810Jm7 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostTopicListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/newpost/vm/SubSpaceNewPostVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PostTopicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceNewPostVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C501850JmB(c19719912DlLIZ), new C501860JmC(), null, true);
    }

    public final C501810Jm7 Go() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C501810Jm7.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C501810Jm7) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    public final SubSpaceNewPostVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SubSpaceNewPostVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Jn3, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView recyclerView;
        List<TopicByCategory> list;
        C501820Jm8 c501820Jm8;
        C501820Jm8 c501820Jm82;
        List<TopicByCategory> list2;
        C501810Jm7 c501810Jm7XQ2;
        C501820Jm8 c501820Jm83;
        List<TopicByCategory> list3;
        TopicByCategory topicByCategory;
        SpaceTopicCategory spaceTopicCategory;
        C501810Jm7 c501810Jm7XQ22;
        C501820Jm8 c501820Jm84;
        super.onViewCreated(view);
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != 0) {
            SubSpaceNewPostVM subSpaceNewPostVMHo = Ho();
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C501810Jm7 c501810Jm7XQ23 = subSpaceNewPostVMHo.xQ2();
            if (c501810Jm7XQ23 != null && (c501820Jm82 = c501810Jm7XQ23.LL) != null && (list2 = c501820Jm82.LIZ) != null && !list2.isEmpty() && (c501810Jm7XQ2 = subSpaceNewPostVMHo.xQ2()) != null && (c501820Jm83 = c501810Jm7XQ2.LL) != null && (list3 = c501820Jm83.LIZ) != null && (topicByCategory = (TopicByCategory) ListProtector.get(list3, 0)) != null && (spaceTopicCategory = topicByCategory.topicCategory) != null && (c501810Jm7XQ22 = subSpaceNewPostVMHo.xQ2()) != null && (c501820Jm84 = c501810Jm7XQ22.LL) != null) {
                c501820Jm84.LIZIZ = spaceTopicCategory;
            }
            C501810Jm7 c501810Jm7XQ24 = subSpaceNewPostVMHo.xQ2();
            if (c501810Jm7XQ24 != null && (c501820Jm8 = c501810Jm7XQ24.LL) != null) {
                list = c501820Jm8.LIZ;
            } else {
                list = null;
            }
            ArrayList<AbstractC503810JpL> arrayListYQ2 = subSpaceNewPostVMHo.yQ2(list, null);
            ArrayList arrayList = new ArrayList();
            if (arrayListYQ2 != null && arrayListYQ2.size() > 0) {
                arrayList.addAll(arrayListYQ2);
            }
            ?? r1 = new AbstractC502430Jn7(arrayList, subSpaceNewPostVMHo, subSpaceNewPostVMHo.xQ2()) { // from class: X.0Jn3
                public final SubSpaceNewPostVM LLILLJJLI;
                public final C501810Jm7 LLILLL;

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
                        c502700JnY.I5((AbstractC503810JpL) ListProtector.get(this.LL, i), this.LLILLL);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder c502700JnY;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == EnumC503250JoR.HEADER.getValue()) {
                        c502700JnY = new C502380Jn2(C786410Ut5.Td(layoutInflaterNe, R.layout.hpe, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.TOPIC.getValue()) {
                        c502700JnY = new C502360Jn0(C786410Ut5.Td(layoutInflaterNe, R.layout.hpb, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL.getValue()) {
                        c502700JnY = new C502320Jmw(C786410Ut5.Td(layoutInflaterNe, R.layout.hpa, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL_ITEM.getValue()) {
                        c502700JnY = new C502300Jmu(C786410Ut5.Td(layoutInflaterNe, R.layout.hp_, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.CUSTOM.getValue()) {
                        c502700JnY = new C502160Jmg(C786410Ut5.Td(layoutInflaterNe, R.layout.hpd, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL_ADD.getValue()) {
                        c502700JnY = new C502270Jmr(C786410Ut5.Td(layoutInflaterNe, R.layout.hpc, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.DIVIDER.getValue()) {
                        c502700JnY = new C502410Jn5(C786410Ut5.Td(layoutInflaterNe, R.layout.hoz, viewGroup, false));
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

                {
                    this.LLILLJJLI = subSpaceNewPostVMHo;
                    this.LLILLL = c501810Jm7;
                }
            };
            AssemViewModel.selectSubscribe$default(subSpaceNewPostVMHo, new C2217381BqS() { // from class: X.0JmT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502060JmW) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), null, null, new C502220Jmm(subSpaceNewPostVMHo, r1), 12, null);
            AssemViewModel.selectSubscribe$default(subSpaceNewPostVMHo, new C2217381BqS() { // from class: X.0JmV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502060JmW) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), null, null, new C501880JmE(subSpaceNewPostVMHo, r1), 12, null);
            recyclerView.setAdapter(r1);
            subSpaceNewPostVMHo.LLILLL = r1;
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0JmQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502060JmW) obj).LLILZ;
                }
            }, null, new C501870JmD(this), 6);
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0JmR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C502060JmW) obj).LLILZIL;
                }
            }, null, new C441301nf(), 6);
        }
    }
}
