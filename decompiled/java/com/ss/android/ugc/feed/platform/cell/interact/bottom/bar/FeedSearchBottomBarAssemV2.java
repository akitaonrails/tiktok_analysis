package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C0PEM;
import X.C0PM7;
import X.C0PYD;
import X.C0Q3E;
import X.C0QE4;
import X.C0QFY;
import X.C1107204Us;
import X.C1200530hLX;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1A5L;
import X.C1DFK;
import X.C1ER1;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2296808zG;
import X.C23118094a;
import X.C419910GdJ;
import X.C688270QzB;
import X.C688420QzQ;
import X.C688440QzS;
import X.C688460QzU;
import X.C688480QzW;
import X.C688490QzX;
import X.C688500QzY;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C739870T0n;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ACListenerS43S0201000_10;
import Y.ATListenerS338S0200000_10;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.experiment.FeedBarAheadConfig;
import com.ss.android.ugc.aweme.feed.experiment.FeedBarSmartConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig;
import com.ss.android.ugc.aweme.search.model.SearchFeedbackSuggestWordMeta;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedSearchBottomBarAssemV2 extends BaseCellSlotComponent<FeedSearchBottomBarAssemV2> implements FeedBarSearchAbility, InterfaceC1554640qYg {
    public ConstraintLayout LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxIconView LLJZ;
    public TuxTextView LLJZIJLIL;
    public long LLLF;
    public boolean LLLFF;
    public float LLLFFI;
    public float LLLFZ;
    public int LLLI;
    public long LLLIIII;
    public int LLLIIIL;
    public long LLLIIL;
    public C1DFK LLLIILIL;
    public final String LLLIL;
    public final C01GW LLLILZ;
    public C688480QzW LLLILZJ;
    public boolean LLLILZLLLI;
    public final boolean LLLIZZ;
    public final boolean LLLJ;
    public final int LLLJIL;
    public final int LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public final FeedSearchBottomBarAssemV2$descExpandModeProtocol$1 LLLLIIIILLL;
    public String LLL = "";
    public boolean LLLII = true;
    public boolean LLLIIIIL = true;

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final C0QFY Cc1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void IE1() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5i;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void TD() {
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final boolean Tq1() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void Vr0(int i, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final C688270QzB Vx() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final int YY0() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void g2() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1205224947) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final boolean u62() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final C0QE4 Og0() {
        View viewFindViewById;
        String imprId;
        String aid;
        LogPbBean logPbBean;
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout == null || (viewFindViewById = constraintLayout.findViewById(R.id.ubf)) == null || !viewFindViewById.isShown()) {
            return null;
        }
        int i = FeedSearchBottomBarAssemTriggerV2.LLJLIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = C688460QzU.LIZIZ(0, (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        String str2 = "";
        if (aweme == null || (logPbBean = aweme.getLogPbBean()) == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str2 = aid;
        }
        return new C0QE4(str, imprId, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final List<SearchFeedbackSuggestWordMeta> ar() {
        View viewFindViewById;
        String imprId;
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout == null || (viewFindViewById = constraintLayout.findViewById(R.id.ubf)) == null || !viewFindViewById.isShown()) {
            return null;
        }
        String str = this.LLLILZJ.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        LogPbBean logPbBean = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getLogPbBean();
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        return Collections.singletonList(new SearchFeedbackSuggestWordMeta(str, "related_search_anchor_v2", imprId, aid, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final void pw2() {
        String tabName;
        C2189821An6 c2189821An6;
        String tabName2;
        C2189821An6 c2189821An62;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((C0PYD) C0Q3E.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()).Y30().LIZJ()).LLJ) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null);
            if (videoItemParams.getAweme() != null) {
                int i = FeedSearchBottomBarAssemTriggerV2.LLJLIL;
                C688480QzW c688480QzWLIZIZ = C688460QzU.LIZIZ(0, videoItemParams);
                if (c688480QzWLIZIZ.LIZ.length() != 0) {
                    if (C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends").contains(videoItemParams.mEventType)) {
                        C1ER1.LIZIZ.LLLLLIL(videoItemParams.getAweme().getGroupId(), videoItemParams.getAweme().getAid());
                    }
                    String str = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL;
                    if (Intrinsics.LJFF("1", c688480QzWLIZIZ.LJ)) {
                        C1ER1 c1er1 = C1ER1.LIZIZ;
                        Aweme aweme = videoItemParams.getAweme();
                        String str2 = videoItemParams.mEventType;
                        String str3 = c688480QzWLIZIZ.LIZIZ;
                        String str4 = c688480QzWLIZIZ.LIZ;
                        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
                        if (baseFeedPageParams == null || (c2189821An62 = baseFeedPageParams.param) == null || (tabName2 = c2189821An62.getTabName()) == null) {
                            tabName2 = "";
                        }
                        String strValueOf = String.valueOf(0);
                        String groupId = videoItemParams.getAweme().getGroupId();
                        c1er1.LJJLIIIJ(aweme, null, str2, str3, str4, tabName2, strValueOf, groupId != null ? groupId : "", str, "");
                    } else {
                        C1ER1 c1er12 = C1ER1.LIZIZ;
                        Aweme aweme2 = videoItemParams.getAweme();
                        String str5 = videoItemParams.mEventType;
                        String str6 = c688480QzWLIZIZ.LIZIZ;
                        String str7 = c688480QzWLIZIZ.LIZ;
                        BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
                        if (baseFeedPageParams2 == null || (c2189821An6 = baseFeedPageParams2.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                            tabName = "";
                        }
                        String strValueOf2 = String.valueOf(0);
                        String groupId2 = videoItemParams.getAweme().getGroupId();
                        String str8 = groupId2 != null ? groupId2 : "";
                        PromotionInfo promotionInfo = c688480QzWLIZIZ.LIZLLL;
                        String str9 = c688480QzWLIZIZ.LJFF;
                        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688480QzWLIZIZ.LIZ()));
                        if (strLIZLLL == null) {
                            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1er12.LLLLLLZ(aweme2, str5, str6, str7, tabName, CardStruct.IStatusCode.DEFAULT, strValueOf2, str8, str, promotionInfo, str9, strLIZLLL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "related_search_anchor_v2");
                    }
                }
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme();
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2$descExpandModeProtocol$1] */
    public FeedSearchBottomBarAssemV2() {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLLIILIL = c1dfkLIZ;
        C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
        this.LLLIL = "feedbar_ahead";
        this.LLLILZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS241S0000000_10.get$arr$(391));
        this.LLLILZJ = new C688480QzW();
        C688490QzX.LIZ.getClass();
        C01GW c01gw = C688490QzX.LIZJ;
        this.LLLIZZ = ((FeedBarAheadConfig) c01gw.getValue()).enableAheadPrefetch;
        C688440QzS.LIZ.getClass();
        C01GW c01gw2 = C688440QzS.LIZJ;
        this.LLLJ = ((FeedBarSmartConfig) c01gw2.getValue()).enableSmartPrefetch;
        this.LLLJIL = ((FeedBarSmartConfig) c01gw2.getValue()).playProgress;
        this.LLLJL = ((FeedBarAheadConfig) c01gw.getValue()).playProgress;
        this.LLLLIIIILLL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2$descExpandModeProtocol$1
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.Co();
        C688420QzQ.LIZIZ.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, "create_view");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLLLIIIILLL));
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final Boolean iL0() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility
    public final Boolean zm0() {
        return Boolean.FALSE;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentListPageDialogPopUpEvent(C739870T0n c739870T0n) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(((VideoItemParams) obj).getAweme().getAid(), c739870T0n.LIZJ) && c739870T0n.LIZ == 0) {
            pw2();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJLLIL = (ConstraintLayout) view.findViewById(R.id.ht1);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.ubf);
        this.LLJZ = (TuxIconView) view.findViewById(R.id.f812u71);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.saw);
        view.findViewById(R.id.e3k);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLILZ.getValue(), new C2217381BqS() { // from class: X.0NzH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIII;
            }
        }, null, AFwS293S0000000_10.get$arr$(54), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLILZ.getValue(), new C2217381BqS() { // from class: X.0R7u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS293S0000000_10.get$arr$(39), 6);
        C2271391DvN.LIZ(this.LLJLLIL, (C1A5L) C2271381DvM.LJJZZIII.getValue());
        C688420QzQ.LIZIZ.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, "view_created");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String promotionText;
        Integer numValueOf;
        Integer numLIZJ;
        String tabName;
        int iIntValue;
        Context context;
        C2189821An6 c2189821An6;
        Integer numValueOf2;
        Integer numLIZJ2;
        Integer numLIZJ3;
        String promotionText2;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        VideoItemParams videoItemParams2 = videoItemParams;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        this.LLLL = false;
        C688420QzQ.LIZIZ.LIZIZ();
        int i = FeedSearchBottomBarAssemTriggerV2.LLJLIL;
        C688480QzW c688480QzWLIZIZ = C688460QzU.LIZIZ(0, videoItemParams2);
        this.LLLILZJ = c688480QzWLIZIZ;
        this.LLLILZLLLI = C688460QzU.LIZ(videoItemParams2, c688480QzWLIZIZ);
        boolean z = true;
        if (Intrinsics.LJFF("1", this.LLLILZJ.LJ)) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.G(videoItemParams2.getAweme().getAid(), true);
            c1er1.LLII(this.LLLILZJ.LIZ, videoItemParams2.getAweme().getAid());
        }
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            boolean z2 = this.LLLILZLLLI;
            C688480QzW c688480QzW = this.LLLILZJ;
            if (z2 && !Intrinsics.LJFF("1", c688480QzW.LJ)) {
                C786410Ut5.LL(0, constraintLayout);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.ubf);
                TuxIconView tuxIconView = null;
                if (textView != null && (commentSuggestWordList = videoItemParams2.getAweme().getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
                    for (SuggestWordStruct suggestWordStruct : suggestWords) {
                        if (suggestWordStruct != null) {
                            scene = suggestWordStruct.getScene();
                        } else {
                            scene = null;
                        }
                        if (Intrinsics.LJFF(scene, "feed_bar")) {
                            textView.setText(new SpannableStringBuilder().append((CharSequence) suggestWordStruct.getHintText()).append((CharSequence) this.LLLILZJ.LIZ));
                        }
                    }
                }
                PromotionInfo promotionInfo = this.LLLILZJ.LIZLLL;
                if (promotionInfo != null) {
                    promotionText = promotionInfo.getPromotionText();
                } else {
                    promotionText = null;
                }
                if (C123100dR.LIZ(promotionText)) {
                    TuxTextView tuxTextView2 = this.LLJZIJLIL;
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    }
                    TuxTextView tuxTextView3 = this.LLJZIJLIL;
                    if (tuxTextView3 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        PromotionInfo promotionInfo2 = this.LLLILZJ.LIZLLL;
                        if (promotionInfo2 != null) {
                            promotionText2 = promotionInfo2.getPromotionText();
                        } else {
                            promotionText2 = null;
                        }
                        tuxTextView3.setText(spannableStringBuilder.append((CharSequence) promotionText2));
                    }
                }
                ConstraintLayout constraintLayout2 = this.LLJLLIL;
                if (constraintLayout2 != null) {
                    tuxIconView = (TuxIconView) constraintLayout2.findViewById(R.id.ekg);
                }
                boolean zLIZ = this.LLLILZJ.LIZ();
                int iIntValue2 = R.attr.ee;
                if (zLIZ) {
                    if (((Number) C1107204Us.LIZ.getValue()).intValue() != 1) {
                        z = false;
                    }
                    if (z) {
                        Context context2 = getContext();
                        int iIntValue3 = R.attr.ny;
                        if (context2 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.ny, context2)) != null) {
                            iIntValue3 = numLIZJ3.intValue();
                        }
                        TuxTextView tuxTextView4 = this.LLJLLL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTextColor(iIntValue3);
                        }
                        if (tuxIconView != null) {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_color_arrow_broken_line_up_fill_ltr;
                            tuxIconView.setTuxIcon(c419910GdJ);
                        }
                        TuxIconView tuxIconView2 = this.LLJZ;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setTintColor(iIntValue3);
                        }
                    } else {
                        Context context3 = getContext();
                        if (context3 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context3)) != null) {
                            iIntValue2 = numLIZJ2.intValue();
                        }
                        TuxTextView tuxTextView5 = this.LLJLLL;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setTextColor(iIntValue2);
                        }
                        if (tuxIconView != null) {
                            C419910GdJ c419910GdJ2 = new C419910GdJ();
                            c419910GdJ2.LIZ = R.raw.icon_color_arrow_broken_line_up_fill_ltr;
                            Context context4 = getContext();
                            if (context4 == null || (numValueOf2 = C1308910kAL.LIZJ(R.attr.zi, context4)) == null) {
                                numValueOf2 = Integer.valueOf(R.attr.zi);
                            }
                            c419910GdJ2.LIZLLL = numValueOf2;
                            tuxIconView.setTuxIcon(c419910GdJ2);
                        }
                        TuxIconView tuxIconView3 = this.LLJZ;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setTintColor(iIntValue2);
                        }
                    }
                } else {
                    Context context5 = getContext();
                    if (context5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context5)) != null) {
                        iIntValue2 = numLIZJ.intValue();
                    }
                    TuxTextView tuxTextView6 = this.LLJLLL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setTextColor(iIntValue2);
                    }
                    if (tuxIconView != null) {
                        C419910GdJ c419910GdJ3 = new C419910GdJ();
                        c419910GdJ3.LIZ = R.raw.icon_magnifying_glass_fill;
                        Context context6 = getContext();
                        if (context6 == null || (numValueOf = C1308910kAL.LIZJ(R.attr.zi, context6)) == null) {
                            numValueOf = Integer.valueOf(R.attr.zi);
                        }
                        c419910GdJ3.LIZLLL = numValueOf;
                        tuxIconView.setTuxIcon(c419910GdJ3);
                    }
                    TuxIconView tuxIconView4 = this.LLJZ;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setTintColor(iIntValue2);
                    }
                }
                BaseFeedPageParams baseFeedPageParams = videoItemParams2.baseFeedPageParams;
                if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                    tabName = "";
                }
                this.LLL = tabName;
                ConstraintLayout constraintLayout3 = this.LLJLLIL;
                if (constraintLayout3 != null && (context = constraintLayout3.getContext()) != null) {
                    iIntValue = Integer.valueOf(ViewConfiguration.get(context).getScaledTouchSlop()).intValue();
                } else {
                    iIntValue = 0;
                }
                this.LLLI = iIntValue;
                C688500QzY.LIZ.getClass();
                this.LLLI = iIntValue / ((PressedPrefetchConfig) C688500QzY.LIZJ.getValue()).touchSlopRatio;
                ConstraintLayout constraintLayout4 = this.LLJLLIL;
                if (constraintLayout4 != null) {
                    constraintLayout4.setOnTouchListener(new ATListenerS338S0200000_10(this, videoItemParams2, 7));
                }
                ConstraintLayout constraintLayout5 = this.LLJLLIL;
                if (constraintLayout5 != null) {
                    C786410Ut5.Y7(constraintLayout5, new ACListenerS43S0201000_10(0, videoItemParams2, this, 4));
                }
            } else {
                C786410Ut5.LL(8, constraintLayout);
            }
        }
        C688420QzQ.LIZIZ.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, "bind");
    }

    public static Bundle Fp(VideoItemParams videoItemParams, C688480QzW c688480QzW) {
        String imprId;
        C2189821An6 c2189821An6;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("in_single_stack", "true", bundle);
        C786410Ut5.LJJJI("keyword", c688480QzW.LIZ, bundle);
        bundle.putBoolean("set_hint_by_sug_word", true);
        C786410Ut5.LJJJI("is_feed_liked", String.valueOf(videoItemParams.getAweme().isLike()), bundle);
        C786410Ut5.LJJJI("is_feed_collected", String.valueOf(AwemeExtKt.isCollected(videoItemParams.getAweme())), bundle);
        C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(AwemeBizExtKt.isCommentClicked(videoItemParams.getAweme())), bundle);
        C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(AwemeBizExtKt.isForwardClicked(videoItemParams.getAweme())), bundle);
        C786410Ut5.LJJJI("search_position", videoItemParams.mEventType, bundle);
        C786410Ut5.LJJJI("back_flag", "1", bundle);
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        String tabName = null;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            tabName = c2189821An6.getTabName();
        }
        C786410Ut5.LJJJI("tab_name", tabName, bundle);
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688480QzW.LIZ()));
        if (strLIZLLL == null) {
            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_from_sensitive_words", strLIZLLL, bundle);
        LogPbBean logPbBean = videoItemParams.getAweme().getLogPbBean();
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            C786410Ut5.LJJJI("preClickImprId", imprId, bundle);
        }
        if (!C1ER1.LIZIZ.LLIIIILZ(videoItemParams.mEventType)) {
            C786410Ut5.LJJJI("is_from_video", "1", bundle);
        }
        C786410Ut5.LJJJI("group_id", videoItemParams.getAweme().getAid(), bundle);
        C786410Ut5.LJJJI("enter_from", videoItemParams.mEventType, bundle);
        C786410Ut5.LJJJI("enter_method", "related_search_anchor_v2", bundle);
        PromotionInfo promotionInfo = c688480QzW.LIZLLL;
        if (promotionInfo != null) {
            String promotionText = promotionInfo.getPromotionText();
            if (C123100dR.LIZ(promotionText) && promotionText != null) {
                C786410Ut5.LJJIZ(bundle, "extraLogParams", C786410Ut5.J3(new JSONObject().put("from_promotion_text", promotionText).put("from_promotion_type", promotionInfo.getPromotionType())));
            }
        }
        C786410Ut5.LJJJI("penetrate_info", c688480QzW.LJFF, bundle);
        return bundle;
    }

    public final void Bp(VideoItemParams videoItemParams, C688480QzW c688480QzW) {
        Context context;
        this.LLLF = System.currentTimeMillis();
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c1er1.z(c688480QzW.LIZ);
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            context = constraintLayout.getContext();
        } else {
            context = null;
        }
        c1er1.LLLIIIIL(context, Fp(videoItemParams, c688480QzW));
    }

    public final void Ep(VideoItemParams videoItemParams, C688480QzW c688480QzW) {
        Context context;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            context = constraintLayout.getContext();
        } else {
            context = null;
        }
        c1er1.v(context, this.LLLIL, Fp(videoItemParams, c688480QzW));
    }
}
