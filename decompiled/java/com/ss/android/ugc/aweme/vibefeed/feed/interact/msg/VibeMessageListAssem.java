package com.ss.android.ugc.aweme.vibefeed.feed.interact.msg;

import X.C01GW;
import X.C0DWP;
import X.C0P30;
import X.C13LE;
import X.C1575440r6E;
import X.C2189821An6;
import X.C2217381BqS;
import X.C423520Gj8;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import Y.ALAdapterS1S0300000_6;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeMessageListAssem extends BaseCellSlotComponent<VibeMessageListAssem> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1501));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VibeMessageListViewModel.class), AFwS264S0000000_24.get$arr$(529));
    public C0DWP LLJZ;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.i89;
    }

    public final VibeMessageListViewModel Bp() {
        return (VibeMessageListViewModel) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinearLayoutManager linearLayoutManager;
        super.onViewCreated(view);
        C0DWP c0dwp = (C0DWP) view.findViewById(R.id.vibe_message_list);
        LinearLayoutManager linearLayoutManager2 = null;
        if (c0dwp != null) {
            c0dwp.LLILZLL = new AwS588S0100000_9(this, 27);
            RecyclerView.LayoutManager layoutManager = c0dwp.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.setReverseLayout(true);
                linearLayoutManager2 = linearLayoutManager;
            }
            c0dwp.setLayoutManager(linearLayoutManager2);
            c0dwp.setItemAnimator(new C423520Gj8() { // from class: X.0Gof
                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
                    Object c098200Yq;
                    try {
                        C786410Ut5.ed(viewHolder.itemView, r1.getHeight());
                        C786410Ut5.T4(viewHolder.itemView, 0.0f);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder.itemView.animate();
                        viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(this.LLILLL).setListener(new ALAdapterS1S0300000_6(this, viewHolder, viewPropertyAnimatorAnimate, 2)).start();
                        c098200Yq = Boolean.TRUE;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    if (c098200Yq == null) {
                        super.LJJI(viewHolder);
                    }
                    return true;
                }
            });
            c0dwp.LJIILJJIL(VibeMessageCell.class);
            Bp().setListState(c0dwp.getState());
            c0dwp.LJIIL(Bp().getConfig());
        } else {
            c0dwp = null;
        }
        this.LLJZ = c0dwp;
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Zr7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165820gRY) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(0), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0h5Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165820gRY) obj).LL;
            }
        }, null, new AwS638S0100000_24(view, 10), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String conversationId;
        String eventType;
        C2189821An6 c2189821An6;
        String enterMethodValue;
        C2189821An6 c2189821An62;
        C2189821An6 c2189821An63;
        VideoItemParams videoItemParams2 = videoItemParams;
        VibeMessageListViewModel vibeMessageListViewModelBp = Bp();
        BaseFeedPageParams baseFeedPageParams = videoItemParams2.baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An63 = baseFeedPageParams.param) != null) {
            conversationId = c2189821An63.getConversationId();
        } else {
            conversationId = null;
        }
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        String aid = videoItemParams2.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 15);
        BaseFeedPageParams baseFeedPageParams2 = videoItemParams2.baseFeedPageParams;
        if (baseFeedPageParams2 == null || (c2189821An62 = baseFeedPageParams2.param) == null || (eventType = c2189821An62.getEventType()) == null) {
            eventType = "";
        }
        BaseFeedPageParams baseFeedPageParams3 = videoItemParams2.baseFeedPageParams;
        if (baseFeedPageParams3 != null && (c2189821An6 = baseFeedPageParams3.param) != null && (enterMethodValue = c2189821An6.getEnterMethodValue()) != null) {
            str = enterMethodValue;
        }
        vibeMessageListViewModelBp.LL = conversationId;
        vibeMessageListViewModelBp.LLILLJJLI = aid;
        vibeMessageListViewModelBp.LLILLL = eventType;
        vibeMessageListViewModelBp.LLILZ = str;
        vibeMessageListViewModelBp.LLILZIL = C1575440r6E.LJI(conversationId).sharedFeedType();
        vibeMessageListViewModelBp.LLILZLL.getValue();
        vibeMessageListViewModelBp.LLIZLLLIL = awS568S0100000_24;
        vibeMessageListViewModelBp.LLIZ = C0P30.LIZ().LIZJ(conversationId);
        Bp().manualListRefresh();
    }
}
