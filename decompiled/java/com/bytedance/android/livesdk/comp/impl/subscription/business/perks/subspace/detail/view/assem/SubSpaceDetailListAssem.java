package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem;

import X.AbstractC502430Jn7;
import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C1161920gLG;
import X.C11RD;
import X.C11S5;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C16FZ;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C480460Ism;
import X.C491870JQr;
import X.C502870Jnp;
import X.C503370Jod;
import X.C504060Jpk;
import X.C504070Jpl;
import X.C504350JqD;
import X.C504760Jqs;
import X.C504860Jr2;
import X.C504880Jr4;
import X.C504890Jr5;
import X.C504990JrF;
import X.C505010JrH;
import X.C505230Jrd;
import X.C505450Jrz;
import X.C505470Js1;
import X.C505510Js5;
import X.C510380Jzw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC510330Jzr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.CommentSendReq;
import webcast.api.sub.CommentSendResp;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailListAssem extends UISlotAssem implements SubSpaceDetailAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C504880Jr4 LLJJIII;
    public FrameLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceDetailListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubSpaceDetailListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C504990JrF(c19719912DlLIZ), new C505470Js1(), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C504350JqD());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hod;
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

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailAbility
    public final void LJJLI() {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Fcommunity-guidelines&height=484&gravity=bottom&radius=8&type=popup&show_mask=1&mask_bg_color=00000099&use_spark=1");
    }

    public final C504880Jr4 ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504880Jr4.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
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
            C16FZ c16fz = new C16FZ(context, null);
            FrameLayout frameLayout2 = this.LLJJIJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(c16fz);
            }
        }
        FrameLayout frameLayout3 = this.LLJJIJI;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
    }

    public final void hp() {
        String str;
        LJ();
        final SubSpaceDetailVM subSpaceDetailVMKp = kp();
        final C505510Js5 c505510Js5 = new C505510Js5(this);
        final C504060Jpk c504060Jpk = new C504060Jpk(this);
        C504880Jr4 c504880Jr4VQ2 = subSpaceDetailVMKp.vQ2();
        if (c504880Jr4VQ2 != null) {
            long j = c504880Jr4VQ2.LLILZ;
            C504880Jr4 c504880Jr4VQ22 = subSpaceDetailVMKp.vQ2();
            if (c504880Jr4VQ22 == null || (str = c504880Jr4VQ22.LLJIJIL) == null) {
                return;
            }
            C504880Jr4 c504880Jr4VQ23 = subSpaceDetailVMKp.vQ2();
            long j2 = c504880Jr4VQ23 != null ? c504880Jr4VQ23.LLILZIL : 0L;
            C504880Jr4 c504880Jr4VQ24 = subSpaceDetailVMKp.vQ2();
            int i = c504880Jr4VQ24 != null ? c504880Jr4VQ24.LLILZLL : 0;
            C480460Ism.LIZ().getClass();
            C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getPostDetail(j, str, j2, i), EnumC510330Jzr.GENERAL, "SubSpaceDetailVM", "sub/space/post/detail", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceDetailVMKp));
            if (c0j1n != null) {
                c0j1n.LIZ(new C09JN() { // from class: X.0Jqt
                    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
                    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
                    /* JADX WARN: Removed duplicated region for block: B:111:0x019e  */
                    /* JADX WARN: Removed duplicated region for block: B:118:0x01b8  */
                    /* JADX WARN: Removed duplicated region for block: B:125:0x01c8  */
                    /* JADX WARN: Removed duplicated region for block: B:133:0x01de  */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x020f  */
                    /* JADX WARN: Removed duplicated region for block: B:191:0x02e7  */
                    /* JADX WARN: Removed duplicated region for block: B:192:0x02ea  */
                    /* JADX WARN: Removed duplicated region for block: B:193:0x02ed  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r14) {
                        /*
                            Method dump skipped, instruction units count: 752
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C504770Jqt.accept(java.lang.Object):void");
                    }
                }, new C09JN() { // from class: X.07xt
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubSpaceDetailVM@ca2c.fetchDetailPage$2");
                        c504060Jpk.invoke(obj);
                        C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.fetchDetailPage$2");
                    }
                });
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), SubSpaceDetailAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0JoM, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C504760Jqs c504760Jqs;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, SubSpaceDetailAbility.class, null, null);
        }
        this.LLJJIJI = (FrameLayout) view.findViewById(R.id.nlo);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fqs);
        if (recyclerView != 0 && (c504760Jqs = kp().LLILZ) != null) {
            ?? r2 = new AbstractC502430Jn7(new ArrayList(), c504760Jqs.LL, c504760Jqs.LLILLJJLI) { // from class: X.0JoM
                public final SubSpaceDetailVM LLILLJJLI;
                public final C504880Jr4 LLILLL;

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
                    if (i == EnumC503250JoR.TOPIC.getValue()) {
                        c502700JnY = new C503170JoJ(C786410Ut5.Td(layoutInflaterNe, R.layout.hos, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL.getValue()) {
                        c502700JnY = new C503150JoH(C786410Ut5.Td(layoutInflaterNe, R.layout.hot, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL_ITEM.getValue()) {
                        c502700JnY = new C503630Jp3(C786410Ut5.Td(layoutInflaterNe, R.layout.hp5, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.DETAIL_COMMENT_CATEGORY.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hor, viewGroup, false);
                        c502700JnY = new C502700JnY(viewTd) { // from class: X.0JoO
                            public final View LL;
                            public final C16F5 LLILLJJLI;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (C16F5) viewTd.findViewById(R.id.rj9);
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C503240JoQ c503240JoQ;
                                if ((abstractC503810JpL instanceof C503240JoQ) && (c503240JoQ = (C503240JoQ) abstractC503810JpL) != null) {
                                    this.LLILLJJLI.setText(c503240JoQ.LIZ);
                                }
                            }
                        };
                    } else if (i == EnumC503250JoR.COMMENT.getValue()) {
                        c502700JnY = new C503440Jok(C786410Ut5.Td(layoutInflaterNe, R.layout.f917hon, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.SUB_COMMENT.getValue()) {
                        c502700JnY = new C503450Jol(C786410Ut5.Td(layoutInflaterNe, R.layout.hoq, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.REPLY_SEE_MORE.getValue()) {
                        c502700JnY = new C504840Jr0(C786410Ut5.Td(layoutInflaterNe, R.layout.hop, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.LOAD_MORE.getValue()) {
                        c502700JnY = new C502580JnM(C786410Ut5.Td(layoutInflaterNe, R.layout.hp3, viewGroup, false));
                    } else if (i == EnumC503250JoR.EMPTY.getValue()) {
                        final View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.hoo, viewGroup, false);
                        c502700JnY = new C502700JnY(viewTd2) { // from class: X.0JoN
                            public final View LL;

                            {
                                super(viewTd2);
                                this.LL = viewTd2;
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C503230JoP c503230JoP;
                                ViewGroup.LayoutParams layoutParams;
                                if ((abstractC503810JpL instanceof C503230JoP) && (c503230JoP = (C503230JoP) abstractC503810JpL) != null && (layoutParams = this.LL.getLayoutParams()) != null) {
                                    layoutParams.height = c503230JoP.LIZ;
                                    C786410Ut5.W5(this.LL, layoutParams);
                                    this.LL.requestLayout();
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

                {
                    this.LLILLJJLI = subSpaceDetailVM;
                    this.LLILLL = c504880Jr4;
                }
            };
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(r2);
            c504760Jqs.LLILLL = r2;
            ((C502870Jnp) c504760Jqs.LLILZIL.getValue()).LIZ(recyclerView);
            c504760Jqs.LLILZ = recyclerView;
        }
        hp();
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Js0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLILZLL;
            }
        }, null, new C504860Jr2(this), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Jry
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLIZ;
            }
        }, null, new C503370Jod(this), 6);
        C723850SaN.LIZLLL(this, new C505230Jrd(this));
        ((C491870JQr) this.LLJJIJIIJIL.getValue()).LIZIZ(view, new C504070Jpl(this));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailAbility
    public final void sendComment(CommentSendReq commentSendReq) {
        String str;
        LJ();
        final SubSpaceDetailVM subSpaceDetailVMKp = kp();
        final C505450Jrz c505450Jrz = new C505450Jrz(this);
        final C505010JrH c505010JrH = new C505010JrH(this);
        C480460Ism.LIZ().getClass();
        C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).sendComment(commentSendReq), EnumC510330Jzr.GENERAL, "SubSpaceDetailVM", "sub/space/comment/send", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceDetailVMKp));
        if (c0j1n != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jqu
                @Override // X.C09JN
                public final void accept(Object obj) {
                    SpaceCommentItem spaceCommentItem;
                    C503200JoM c503200JoM;
                    ArrayList<AbstractC503810JpL> arrayList;
                    SpaceCommentItem spaceCommentItem2;
                    ArrayList<AbstractC503810JpL> arrayList2;
                    SpaceCommentItem spaceCommentItem3;
                    C503200JoM c503200JoM2;
                    ArrayList<AbstractC503810JpL> arrayList3;
                    int size;
                    C1C7U.LIZ("SubSpaceDetailVM@ca2c.sendComment$1");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    SubSpaceDetailVM subSpaceDetailVM = subSpaceDetailVMKp;
                    CommentSendResp.ResponseData responseData = (CommentSendResp.ResponseData) c470590Icr.data;
                    SpacePost spacePost = null;
                    if (responseData != null && (spaceCommentItem = responseData.comment) != null) {
                        C504760Jqs c504760Jqs = subSpaceDetailVM.LLILZ;
                        if (c504760Jqs != null) {
                            c504760Jqs.LJII();
                            if (spaceCommentItem.commentType == EnumC504930Jr9.COMMENT.getValue()) {
                                C503200JoM c503200JoM3 = c504760Jqs.LLILLL;
                                if (c503200JoM3 != null && (arrayList3 = c503200JoM3.LL) != null) {
                                    Iterator<AbstractC503810JpL> it2 = arrayList3.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        AbstractC503810JpL next = it2.next();
                                        if ((next instanceof C503240JoQ) && ((C503240JoQ) next).LIZIZ == EnumC504960JrC.RECENT) {
                                            if (i >= 0) {
                                                C504880Jr4 c504880Jr4 = c504760Jqs.LLILLJJLI;
                                                if (c504880Jr4 != null) {
                                                    spacePost = c504880Jr4.LLILLL;
                                                }
                                                size = i + 1;
                                                ListProtector.add(arrayList3, size, new C504910Jr7(spaceCommentItem, spacePost));
                                                C503200JoM c503200JoM4 = c504760Jqs.LLILLL;
                                                if (c503200JoM4 != null) {
                                                    c503200JoM4.notifyItemInserted(size);
                                                }
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    C504880Jr4 c504880Jr42 = c504760Jqs.LLILLJJLI;
                                    if (c504880Jr42 != null) {
                                        spacePost = c504880Jr42.LLILLL;
                                    }
                                    arrayList3.add(new C504910Jr7(spaceCommentItem, spacePost));
                                    C503200JoM c503200JoM5 = c504760Jqs.LLILLL;
                                    if (c503200JoM5 != null) {
                                        c503200JoM5.notifyItemRangeInserted(arrayList3.size() - 1, 1);
                                    }
                                    size = arrayList3.size() - 1;
                                    RecyclerView recyclerView = c504760Jqs.LLILZ;
                                    if (recyclerView != null) {
                                        recyclerView.smoothScrollToPosition(size);
                                    }
                                }
                            } else if ((spaceCommentItem.commentType == EnumC504930Jr9.REPLY.getValue() || spaceCommentItem.commentType == EnumC504930Jr9.REPLY_TO_REPLY.getValue()) && (c503200JoM = c504760Jqs.LLILLL) != null && (arrayList = c503200JoM.LL) != null) {
                                ListIterator<AbstractC503810JpL> listIterator = arrayList.listIterator(arrayList.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        break;
                                    }
                                    AbstractC503810JpL abstractC503810JpLPrevious = listIterator.previous();
                                    if ((abstractC503810JpLPrevious instanceof C504910Jr7) && (spaceCommentItem2 = spaceCommentItem.replyCommentInfo) != null && ((C504910Jr7) abstractC503810JpLPrevious).LIZLLL() == spaceCommentItem2.commentId) {
                                        int iNextIndex = listIterator.nextIndex();
                                        if (iNextIndex >= 0) {
                                            C504880Jr4 c504880Jr43 = c504760Jqs.LLILLJJLI;
                                            if (c504880Jr43 != null) {
                                                spacePost = c504880Jr43.LLILLL;
                                            }
                                            int i2 = iNextIndex + 1;
                                            ListProtector.add(arrayList, i2, new C504910Jr7(spaceCommentItem, spacePost));
                                            C503200JoM c503200JoM6 = c504760Jqs.LLILLL;
                                            if (c503200JoM6 != null) {
                                                c503200JoM6.notifyItemInserted(i2);
                                            }
                                            RecyclerView recyclerView2 = c504760Jqs.LLILZ;
                                            if (recyclerView2 != null) {
                                                recyclerView2.smoothScrollToPosition(i2);
                                            }
                                            C503200JoM c503200JoM7 = c504760Jqs.LLILLL;
                                            if (c503200JoM7 != null && (arrayList2 = c503200JoM7.LL) != null) {
                                                ListIterator<AbstractC503810JpL> listIterator2 = arrayList2.listIterator(arrayList2.size());
                                                while (true) {
                                                    if (!listIterator2.hasPrevious()) {
                                                        break;
                                                    }
                                                    AbstractC503810JpL abstractC503810JpLPrevious2 = listIterator2.previous();
                                                    if ((abstractC503810JpLPrevious2 instanceof C504920Jr8) && (spaceCommentItem3 = spaceCommentItem.replyCommentInfo) != null && ((C504920Jr8) abstractC503810JpLPrevious2).LIZLLL() == spaceCommentItem3.commentId) {
                                                        int iNextIndex2 = listIterator2.nextIndex();
                                                        if (iNextIndex2 >= 0 && (c503200JoM2 = c504760Jqs.LLILLL) != null) {
                                                            c503200JoM2.notifyItemChanged(iNextIndex2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        subSpaceDetailVM.getClass();
                    }
                    subSpaceDetailVMKp.setState(new C504980JrE(c470590Icr));
                    c505450Jrz.invoke();
                    C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.sendComment$1");
                }
            }, new C09JN() { // from class: X.07xu
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceDetailVM@ca2c.sendComment$2");
                    c505010JrH.invoke(obj);
                    C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.sendComment$2");
                }
            });
        }
        C504890Jr5 c504890Jr5WQ2 = subSpaceDetailVMKp.wQ2();
        int i = commentSendReq.commentType;
        if (i == 0) {
            str = "comment";
        } else if (i == 1) {
            str = "reply";
        } else if (i == 2) {
            str = "reply_to_reply";
        } else {
            str = "";
        }
        c504890Jr5WQ2.LIZIZ(str);
    }
}
