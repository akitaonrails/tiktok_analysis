package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem;

import X.AbstractC511100K2q;
import X.C019F;
import X.C01GW;
import X.C0JCK;
import X.C0K31;
import X.C0K3G;
import X.C0K3H;
import X.C0K3S;
import X.C0K4J;
import X.C0K54;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1390410mHn;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C511510K4f;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC499440JiI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import Y.AfS143S0200000_7;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCCommentSendResp;
import webcast.api.pgc_sub.PGCPostDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailListAssem extends UISlotAssem implements SubSpaceDetailAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C0K3S LLJJIII;
    public FrameLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceDetailListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubSpaceDetailListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 476), AFwS237S0000000_7.get$arr$(216), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(181));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh7;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void LJIIL() {
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
    }

    public final C0K3S ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0K3S.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceDetailVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (SubSpaceDetailVM) assemVMLazy.getValue();
    }

    public final void LJ() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            int i = (int) (36 * context.getResources().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
            C786410Ut5.V6(c1390410mHn, layoutParams);
            c1390410mHn.LIZJ();
            FrameLayout frameLayout2 = this.LLJJIJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(c1390410mHn, layoutParams);
            }
        }
        FrameLayout frameLayout3 = this.LLJJIJI;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailAbility
    public final void LJJLI() {
        C0K54.LIZ().LJ(getContext(), "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Fcommunity-guidelines&height=484&gravity=bottom&radius=8&type=popup&show_mask=1&mask_bg_color=00000099&use_spark=1", C2097608Jq.LJ());
    }

    public final void hp() {
        String str;
        C11NZ c11nz;
        LJ();
        SubSpaceDetailVM subSpaceDetailVMKp = kp();
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 473);
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 303);
        C0K3S c0k3sXQ2 = subSpaceDetailVMKp.xQ2();
        if (c0k3sXQ2 != null) {
            long j = c0k3sXQ2.LLILZ;
            C0K3S c0k3sXQ22 = subSpaceDetailVMKp.xQ2();
            if (c0k3sXQ22 == null || (str = c0k3sXQ22.LLJIJIL) == null) {
                return;
            }
            C0K3S c0k3sXQ23 = subSpaceDetailVMKp.xQ2();
            long j2 = c0k3sXQ23 != null ? c0k3sXQ23.LLILZIL : 0L;
            C0K3S c0k3sXQ24 = subSpaceDetailVMKp.xQ2();
            C11NZ<DataResponse<PGCPostDetailResponse.ResponseData>> postDetail = C0K4J.LIZ().getPostDetail(j, str, j2, c0k3sXQ24 != null ? c0k3sXQ24.LLILZLL : 0);
            if (postDetail == null || (c11nz = (C11NZ) C0JCK.LIZ(postDetail, EnumC499440JiI.GENERAL, "SubSpaceDetailVM", "sub/space/post/detail", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceDetailVMKp))) == null) {
                return;
            }
            c11nz.LJJLL(new AfS143S0200000_7((Object) subSpaceDetailVMKp, (EmoteModel) awS551S0100000_7, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 23), new AfS172S0100000_3((Object) awS586S0100000_7, 37));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, SubSpaceDetailAbility.class, null, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailAbility
    public final void n1(PGCCommentSendReq pGCCommentSendReq) {
        String str;
        C11NZ c11nz;
        LJ();
        SubSpaceDetailVM subSpaceDetailVMKp = kp();
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 475);
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 304);
        C11NZ<DataResponse<PGCCommentSendResp.ResponseData>> c11nzN1 = C0K4J.LIZ().n1(pGCCommentSendReq);
        if (c11nzN1 != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzN1, EnumC499440JiI.GENERAL, "SubSpaceDetailVM", "sub/space/comment/send", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceDetailVMKp))) != null) {
            c11nz.LJJLL(new AfS143S0200000_7((Object) subSpaceDetailVMKp, (EmoteModel) awS551S0100000_7, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 24), new AfS172S0100000_3((Object) awS586S0100000_7, 38));
        }
        C0K3H c0k3hYQ2 = subSpaceDetailVMKp.yQ2();
        int i = pGCCommentSendReq.commentType;
        if (i == 0) {
            str = "comment";
        } else if (i == 1) {
            str = "reply";
        } else if (i == 2) {
            str = "reply_to_reply";
        } else {
            str = "";
        }
        c0k3hYQ2.LIZIZ(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0K37, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0K3G c0k3g;
        super.onViewCreated(view);
        this.LLJJIJI = (FrameLayout) view.findViewById(R.id.nlo);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fqs);
        if (recyclerView != 0 && (c0k3g = kp().LLILLL) != null) {
            final ArrayList arrayList = new ArrayList();
            final SubSpaceDetailVM subSpaceDetailVM = c0k3g.LL;
            final C0K3S c0k3s = c0k3g.LLILLJJLI;
            ?? r2 = new AbstractC511100K2q(arrayList, subSpaceDetailVM, c0k3s) { // from class: X.0K37
                public final SubSpaceDetailVM LLILLJJLI;
                public final C0K3S LLILLL;

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
                    if (i == C0K2L.TOPIC.getValue()) {
                        c0k3v = new C0K3E(C786410Ut5.Td(layoutInflaterNe, R.layout.fhl, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL.getValue()) {
                        c0k3v = new C0K38(C786410Ut5.Td(layoutInflaterNe, R.layout.fhm, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL_ITEM.getValue()) {
                        c0k3v = new C0K36(C786410Ut5.Td(layoutInflaterNe, R.layout.fhy, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.DETAIL_COMMENT_CATEGORY.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.fhk, viewGroup, false);
                        c0k3v = new C0K3V(viewTd) { // from class: X.0K39
                            public final View LL;
                            public final TextView LLILLJJLI;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.rj9);
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                C0K3A c0k3a;
                                if ((abstractC511160K2w instanceof C0K3A) && (c0k3a = (C0K3A) abstractC511160K2w) != null) {
                                    this.LLILLJJLI.setText(c0k3a.LIZ);
                                }
                            }
                        };
                    } else if (i == C0K2L.COMMENT.getValue()) {
                        c0k3v = new C0K3R(C786410Ut5.Td(layoutInflaterNe, R.layout.fhg, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.SUB_COMMENT.getValue()) {
                        c0k3v = new C0K3Q(C786410Ut5.Td(layoutInflaterNe, R.layout.fhj, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.REPLY_SEE_MORE.getValue()) {
                        c0k3v = new C0K3L(C786410Ut5.Td(layoutInflaterNe, R.layout.fhi, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.LOAD_MORE.getValue()) {
                        c0k3v = new C510980K2e(C786410Ut5.Td(layoutInflaterNe, R.layout.fhw, viewGroup, false));
                    } else if (i == C0K2L.EMPTY.getValue()) {
                        final View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.fhh, viewGroup, false);
                        c0k3v = new C0K3V(viewTd2) { // from class: X.0K2X
                            public final View LL;

                            {
                                super(viewTd2);
                                this.LL = viewTd2;
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                C0K2N c0k2n;
                                ViewGroup.LayoutParams layoutParams;
                                if ((abstractC511160K2w instanceof C0K2N) && (c0k2n = (C0K2N) abstractC511160K2w) != null && (layoutParams = this.LL.getLayoutParams()) != null) {
                                    layoutParams.height = c0k2n.LIZ;
                                    C786410Ut5.W5(this.LL, layoutParams);
                                    this.LL.requestLayout();
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

                {
                    this.LLILLJJLI = subSpaceDetailVM;
                    this.LLILLL = c0k3s;
                }
            };
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r2);
            c0k3g.LLILLL = r2;
            ((C0K31) c0k3g.LLILZIL.getValue()).LIZ(recyclerView);
            c0k3g.LLILZ = recyclerView;
        }
        hp();
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Jtl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLILZLL;
            }
        }, null, new AwS621S0100000_7(this, 51), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Jtm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLIZ;
            }
        }, null, new AwS621S0100000_7(this, 52), 6);
        C723850SaN.LIZLLL(this, new AwS586S0100000_7(this, 336));
        ((C511510K4f) this.LLJJIJIIJIL.getValue()).LIZIZ(view, new AwS551S0100000_7(this, 474));
    }
}
