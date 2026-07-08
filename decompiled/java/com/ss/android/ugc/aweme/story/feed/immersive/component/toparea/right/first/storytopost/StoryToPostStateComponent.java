package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.storytopost;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HTT;
import X.C0RF0;
import X.C0RJN;
import X.C0RQI;
import X.C0RSY;
import X.C1220000hqw;
import X.C1390130mHL;
import X.C13LE;
import X.C1558520qew;
import X.C1618440sDa;
import X.C19EG;
import X.C19ME;
import X.C2189821An6;
import X.C2217381BqS;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C693050RGl;
import X.C711940RwG;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737030Svd;
import X.C786410Ut5;
import X.C800330VaR;
import X.EnumC712090RwV;
import X.InterfaceC214902198i;
import X.InterfaceC665370Q7z;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryToPostShareVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryToPostStateComponent extends BaseCellContentComponent<StoryToPostStateComponent> implements StoryToPostStateAbility {
    public final C736950SvV LLJJJJLIIL = new C736950SvV(C13LE.LIZ(StoryToPostShareVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(410), new AwS555S0100000_11((AbstractC738140SxQ) this, 793), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 792));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 795));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 794));
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryToPostStateAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void bp() {
        InterfaceC214902198i interfaceC214902198i;
        C2189821An6 c2189821An6;
        C0HTT<C737030Svd> c0htt;
        if (this.LLJLILLLLZIIL) {
            ep(true);
            C0RF0 c0rf0 = jm().LIZLLL;
            Object objLIZLLL = null;
            if (c0rf0 != null && (c0htt = c0rf0.LIZIZ) != null) {
                EnumC712090RwV enumC712090RwV = EnumC712090RwV.DELETE_ITEM;
                C724270Sb3 c724270Sb3 = this.LLJI;
                c0htt.LLIIL(new C737030Svd(60, new C0RSY(enumC712090RwV, new C693050RGl(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), -1))));
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).baseFeedPageParams;
            if (Intrinsics.LJFF((baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null) ? null : c2189821An6.getFrom(), "STORY_ENTRANCE_ARCHIVE")) {
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                if (iDetailFeedSafService != null) {
                    C0RJN c0rjnLIZIZ = jm().LIZIZ();
                    objLIZLLL = iDetailFeedSafService.LIZLLL(c0rjnLIZIZ != null ? c0rjnLIZIZ.LJ : null);
                }
                if (!(objLIZLLL instanceof InterfaceC214902198i) || (interfaceC214902198i = (InterfaceC214902198i) objLIZLLL) == null) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null) {
                        c19egLIZ.finish();
                    }
                } else {
                    interfaceC214902198i.finish();
                }
            }
        }
        this.LLJLILLLLZIIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryToPostStateAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.storytopost.StoryToPostStateAbility
    public final boolean HJ() {
        return this.LLJLIL;
    }

    public final void ep(boolean z) {
        C711940RwG c711940RwGQc2;
        C2189821An6 c2189821An6;
        String from;
        C2189821An6 c2189821An62;
        C711940RwG c711940RwGQc22;
        if (!z) {
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (feedCollectionViewPagerAbility != null) {
                feedCollectionViewPagerAbility.Es0(C0RQI.LOOP_CURRENT_VIDEO);
            }
            UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLJL.getValue();
            if (userFeedViewPagerAbility != null && (c711940RwGQc22 = userFeedViewPagerAbility.Qc2()) != null) {
                c711940RwGQc22.LIZ(false);
            }
            C1618440sDa.LIZIZ.LJJLIIIIJ(C1558520qew.LJIIL(this), true);
            return;
        }
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        String eventType = null;
        if (baseFeedPageParams != null && (c2189821An62 = baseFeedPageParams.param) != null) {
            eventType = c2189821An62.getEventType();
        }
        String str = "";
        if (eventType == null) {
            eventType = "";
        }
        BaseFeedPageParams baseFeedPageParams2 = jm().LJ;
        if (baseFeedPageParams2 != null && (c2189821An6 = baseFeedPageParams2.param) != null && (from = c2189821An6.getFrom()) != null) {
            str = from;
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility2 = (FeedCollectionViewPagerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (feedCollectionViewPagerAbility2 != null) {
            feedCollectionViewPagerAbility2.Es0(C1618440sDa.LIZIZ.LJJIIJ().LIZLLL(eventType, str));
        }
        UserFeedViewPagerAbility userFeedViewPagerAbility2 = (UserFeedViewPagerAbility) this.LLJL.getValue();
        if (userFeedViewPagerAbility2 != null && (c711940RwGQc2 = userFeedViewPagerAbility2.Qc2()) != null) {
            c711940RwGQc2.LIZ(true);
        }
        C1618440sDa.LIZIZ.LJJLIIIIJ(C1558520qew.LJIIL(this), false);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!this.LLJLL && (view instanceof ViewGroup)) {
            this.LLJLL = true;
            ConstraintLayout constraintLayout = new ConstraintLayout(LJJIJL().getContext());
            C786410Ut5.m6(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
            constraintLayout.setBackground(C800330VaR.LIZIZ(LJJIJL().getContext(), R.color.transparent));
            constraintLayout.setClickable(true);
            constraintLayout.setFocusable(true);
            C1390130mHL c1390130mHL = new C1390130mHL(LJJIJL().getContext(), null, 6);
            ViewGroup viewGroup = (ViewGroup) view;
            c1390130mHL.setMessage(viewGroup.getContext().getString(2131849354));
            C19ME c19me = new C19ME(-2, -2);
            c19me.bottomToBottom = 0;
            c19me.endToEnd = 0;
            c19me.startToStart = 0;
            c19me.topToTop = 0;
            C786410Ut5.W6(c1390130mHL, c19me);
            constraintLayout.addView(c1390130mHL);
            viewGroup.addView(constraintLayout);
        }
        C339190DRl.LIZIZ(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0Rwn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712320Rws) obj).LL;
            }
        }, null, new AwS625S0100000_11(view, 57), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0Rwo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712320Rws) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(130), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
