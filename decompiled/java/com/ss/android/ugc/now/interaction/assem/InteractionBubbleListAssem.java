package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C1352940lJM;
import X.C1352950lJN;
import X.C1353820lKm;
import X.C1354020lL6;
import X.C13LE;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1353800lKk;
import X.InterfaceC1353990lL3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewTreeObserverOnScrollChangedListenerC1353790lKj;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionBubbleListAssem extends ReusedUISlotAssem<InteractionBubbleListAssem> implements InterfaceC712990Rxx<InterfaceC1353990lL3> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C1559260qg8 LLJLIL;
    public final C736950SvV LLJLILLLLZIIL;
    public EnumC1353800lKk LLJLL;
    public final ViewTreeObserverOnScrollChangedListenerC1353790lKj LLJLLIL;
    public C1352950lJN LLJLLL;
    public View LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InteractionBubbleListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/now/interaction/assem/InteractionBubbleListVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ctl;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [X.0lKj] */
    public InteractionBubbleListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionBubbleListVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 1105);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(293);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS565S0100000_21, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((AbstractC738140SxQ) this, 1106), aFwS259S0000000_21, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJLIIIJLLLLLLLZ = assemVMLazy;
        this.LLJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1104));
        this.LLJLIL = new C1559260qg8(new C723590SZx(this, NowFeedMobHierarchyData.class, null), checkSupervisorPrepared());
        this.LLJLILLLLZIIL = new C736950SvV(C13LE.LIZ(InteractionSyncVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(294), new AwS565S0100000_21((AbstractC738140SxQ) this, 1107), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLL = EnumC1353800lKk.NONE;
        this.LLJLLIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0lKj
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                String aid;
                Aweme aweme;
                if (this.LL.LJJIJL().getVisibility() == 0) {
                    Rect rect = new Rect();
                    View viewLJJIJL = this.LL.LJJIJL();
                    if (viewLJJIJL.isAttachedToWindow()) {
                        viewLJJIJL.getGlobalVisibleRect(rect);
                    }
                    if (rect.top < (this.LL.getContext() != null ? C497820Jfg.LIZ(r0) : 0) * 1.0f && rect.bottom > 0.0f) {
                        View viewLJJIJL2 = this.LL.LJJIJL();
                        if (viewLJJIJL2.isAttachedToWindow()) {
                            viewLJJIJL2.getLocalVisibleRect(rect);
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168));
                        if (iLIZIZ < 0 || rect.bottom - rect.top != iLIZIZ) {
                            return;
                        }
                        this.LL.up().setState(new AwS34S0010000_21(true, 11));
                        return;
                    }
                    InterfaceC1353860lKq interfaceC1353860lKq = (InterfaceC1353860lKq) C631370Opb.LIZ(this.LL);
                    if (interfaceC1353860lKq == null || (aweme = interfaceC1353860lKq.getAweme()) == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    Map<String, Set<String>> map = C07ME.LIZ;
                    if (map.containsKey(aid)) {
                        map.remove(aid);
                    }
                    this.LL.up().setState(new AwS34S0010000_21(false, 11));
                }
            }
        };
    }

    public final NowFeedMobHierarchyData sp() {
        return (NowFeedMobHierarchyData) this.LLJLIL.getValue();
    }

    public final C1354020lL6 tp() {
        return (C1354020lL6) this.LLJL.getValue();
    }

    public final InteractionBubbleListVM up() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (InteractionBubbleListVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C786410Ut5.E3(LJJIJL().getViewTreeObserver(), this.LLJLLIL);
    }

    public final User getUser() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
    }

    public final int op() {
        int iFindLastVisibleItemPosition;
        if (tp().getState().LJIIIIZZ() == 0 || !LJJIJL().isShown() || !(tp().getLayoutManager() instanceof LinearLayoutManager) || (iFindLastVisibleItemPosition = ((LinearLayoutManager) tp().getLayoutManager()).findLastVisibleItemPosition()) < 0) {
            return 0;
        }
        int headerCount = (iFindLastVisibleItemPosition - tp().getHeaderCount()) + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert pos = ");
        sbLIZ.append(headerCount);
        C2188811AlT.LIZIZ(sbLIZ);
        return tp().getState().LJIIIIZZ() < headerCount ? tp().getState().LJIIIIZZ() : headerCount;
    }

    public final void zp() {
        InteractionBubbleListVM interactionBubbleListVMUp = up();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1353820lKm c1353820lKm = (C1353820lKm) interactionBubbleListVMUp.vmDispatcher.getState();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        c1353820lKm.getClass();
        List<InterfaceC1891350zJl> list = c1353820lKm.getListState().LLILZ;
        if (list != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof LikeItem) {
                    LikeItem likeItem = (LikeItem) interfaceC1891350zJl;
                    if (likeItem.getUser().getUid() != null) {
                        if (linkedHashSet2.contains(likeItem.getUser().getUid())) {
                            linkedHashSet.add(interfaceC1891350zJl);
                        } else {
                            linkedHashSet2.add(likeItem.getUser().getUid());
                        }
                    }
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            C20600815jK.LJIIL(tp().getState(), (LikeItem) it2.next());
        }
        C736680Sv4.LJIJJ(up(), new AwS600S0100000_21(this, 194));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1354020lL6 c1354020lL6Tp = tp();
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c1354020lL6Tp.setListConfig(c20603715jn);
        final InteractionBubbleListVM interactionBubbleListVMUp = up();
        interactionBubbleListVMUp.setListState(tp().getState());
        tp().LJIIL((AbstractC329610Cw3) new C2217401BqU(interactionBubbleListVMUp) { // from class: X.0lKs
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        tp().LJIILJJIL(BubbleCommentCell.class, BubbleReactionCell.class);
        up().setState(new AwS600S0100000_21(sp(), 317));
        if (this.LLJLLL == null) {
            Integer nowFeedType = sp().getNowFeedType();
            if (nowFeedType != null) {
                nowFeedType.intValue();
            }
            this.LLJLLL = new C1352950lJN();
        }
        C1352950lJN c1352950lJN = this.LLJLLL;
        View viewLIZ = null;
        if (c1352950lJN != null) {
            C1354020lL6 c1354020lL6Tp2 = tp();
            C724240Sb0.LIZ(this);
            viewLIZ = C1352940lJM.LIZIZ.LIZ(R.layout.ctj, c1354020lL6Tp2.getContext(), null, c1354020lL6Tp2);
            c1352950lJN.LIZ = (C427660Gpo) viewLIZ.findViewById(R.id.bh8);
            c1352950lJN.LIZIZ = (TuxTextView) viewLIZ.findViewById(R.id.p0a);
            c1352950lJN.LIZJ = (TuxTextView) viewLIZ.findViewById(R.id.fmb);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(ColorProtector.parseColor("#9903BAF3"));
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            viewLIZ.setBackground(c384050F3z.LIZ(c1354020lL6Tp2.getContext()));
            c1352950lJN.LIZLLL = viewLIZ;
        }
        this.LLJZ = viewLIZ;
        AssemViewModel.asyncSubscribe$default(up(), new C2217381BqS() { // from class: X.0hpW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1353820lKm c1353820lKm = (C1353820lKm) obj;
                c1353820lKm.getClass();
                return C627260Oiy.LIZLLL(c1353820lKm);
            }
        }, null, new AwS600S0100000_21(this, 197), new AwS565S0100000_21(this, 1405), new AwS600S0100000_21(this, 198), 2, null);
        AssemViewModel.asyncSubscribe$default(up(), new C2217381BqS() { // from class: X.0hpV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1353820lKm c1353820lKm = (C1353820lKm) obj;
                c1353820lKm.getClass();
                return C627260Oiy.LIZJ(c1353820lKm);
            }
        }, null, new AwS600S0100000_21(this, 199), AFwS209S0000000_21.get$arr$(525), new AwS600S0100000_21(this, 200), 2, null);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0lKp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1353820lKm) obj).LLILZ);
            }
        }, null, AFwS305S0000000_21.get$arr$(74), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0lKn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1353820lKm) obj).LLILZIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(75), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0hnz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1353820lKm) obj).LLILZLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(76), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0lKo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1353820lKm c1353820lKm = (C1353820lKm) obj;
                c1353820lKm.getClass();
                return C627260Oiy.LIZ(c1353820lKm);
            }
        }, null, AFwS305S0000000_21.get$arr$(77), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0lJE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getLikeState();
            }
        }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(78), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0lJC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getCommentPublishState();
            }
        }, null, AFwS305S0000000_21.get$arr$(79), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0lKi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getCommentDeleteState();
            }
        }, null, AFwS305S0000000_21.get$arr$(80), 6);
        C786410Ut5.z3(LJJIJL().getViewTreeObserver(), this.LLJLLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC1353990lL3 r23) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1353990lL3 interfaceC1353990lL3) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1353990lL3 interfaceC1353990lL3) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp(boolean r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            X.0Sb3 r0 = r5.LLJI
            r2 = 0
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.LL
        L7:
            X.0lKq r0 = (X.InterfaceC1353860lKq) r0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.comment.model.InteractionBubbles r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getInteractionBubbles(r0)
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r1 = r0.cacheState
        L19:
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r0 = com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.NO_CACHE
            if (r1 == r0) goto L6e
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L73
            java.lang.Object r0 = r0.LL
        L23:
            X.0lKq r0 = (X.InterfaceC1353860lKq) r0
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.comment.model.InteractionBubbles r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getInteractionBubbles(r0)
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r1 = r0.cacheState
        L35:
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r0 = com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.COMMENT_CACHE
            if (r1 == r0) goto L6e
            com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM r4 = r5.up()
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L43
            java.lang.Object r2 = r0.LL
        L43:
            X.0lKq r2 = (X.InterfaceC1353860lKq) r2
            if (r2 == 0) goto L6f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            if (r0 == 0) goto L6f
            boolean r0 = r0.isLike()
            r3 = 1
            if (r0 != r3) goto L6f
        L54:
            com.ss.android.ugc.aweme.profile.model.User r2 = r5.getUser()
            kotlin.jvm.internal.AwS107S0110000_21 r1 = new kotlin.jvm.internal.AwS107S0110000_21
            r0 = 4
            r1.<init>(r2, r3, r0)
            r4.withState(r1)
            com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM r2 = r5.up()
            kotlin.jvm.internal.AwS72S0210000_21 r1 = new kotlin.jvm.internal.AwS72S0210000_21
            r0 = 4
            r1.<init>(r7, r5, r6, r0)
            X.C736680Sv4.LJIJJ(r2, r1)
        L6e:
            return
        L6f:
            r3 = 0
            goto L54
        L71:
            r1 = r2
            goto L35
        L73:
            r0 = r2
            goto L23
        L75:
            r1 = r2
            goto L19
        L77:
            r0 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem.yp(boolean, java.lang.Boolean):void");
    }
}
