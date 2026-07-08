package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C0QW4;
import X.C0QXR;
import X.C0QYL;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1742080vR0;
import X.C672690Qa3;
import X.C672770QaB;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.EnumC671640QWc;
import X.EnumC671980QXk;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC672780QaC;
import Y.ACListenerS77S0300000_10;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feedbar.EcSearchFeedBarAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedEcSearchBottomBarAssem extends BaseCellSlotComponent<FeedEcSearchBottomBarAssem> implements InterfaceC672780QaC, EcSearchFeedBarAbility, InterfaceC1554640qYg {
    public ConstraintLayout LLJLLIL;
    public final FeedEcSearchBottomBarAssem$descExpandModeProtocol$1 LLJLLL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssem$descExpandModeProtocol$1
    };

    @Override // X.C0QY2
    public final void Aj() {
    }

    @Override // X.C0QY2
    public final boolean Gc(C0QYL c0qyl, Function1<? super Boolean, Unit> function1) {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b65;
    }

    @Override // X.C0QY2
    public final void Rm(int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.C0QY2
    public final void dn(AwS589S0100000_10 awS589S0100000_10) {
    }

    @Override // X.C0QY2
    public final void ei(C0QW4 c0qw4) {
    }

    @Override // X.C0QY2
    public final void f7() {
    }

    @Override // X.C0QY2
    public final void fc(Long l) {
    }

    @Override // X.C0QY2
    public final void gw(EnumC671640QWc enumC671640QWc) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 783458328) {
            return null;
        }
        return this;
    }

    @Override // X.C0QY2
    public final void rj() {
    }

    @Override // com.ss.android.ugc.aweme.feedbar.EcSearchFeedBarAbility
    public final void Zx1() {
        View viewFindViewById;
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout == null || (viewFindViewById = constraintLayout.findViewById(R.id.htd)) == null || viewFindViewById.getVisibility() != 0) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme != null) {
            aweme.getAid();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLJLLL));
        C1558520qew.LIZLLL(this);
    }

    @Override // X.C0QY2
    public final EnumC671980QXk getEntranceViewType() {
        return EnumC671980QXk.NONE;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (ConstraintLayout) view.findViewById(R.id.htb);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        EcFeedSuggestWordList ecFeedSuggestWordList;
        List<EcSuggestWordStruct> suggestWords;
        String word;
        EcWordStruct ecWordStruct;
        VideoItemParams videoItemParams2 = videoItemParams;
        int i = FeedEcSearchBottomBarAssemTrigger.LLJL;
        C672770QaB c672770QaBLIZIZ = C672690Qa3.LIZIZ(videoItemParams2);
        boolean zLIZ = C672690Qa3.LIZ(videoItemParams2, c672770QaBLIZIZ);
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            if (zLIZ) {
                C786410Ut5.LL(0, constraintLayout);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.htd);
                if (textView != null && (ecFeedSuggestWordList = videoItemParams2.getAweme().getEcFeedSuggestWordList()) != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
                    for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                        if (ecSuggestWordStruct != null && Intrinsics.LJFF(ecSuggestWordStruct.getScene(), "feed_bar")) {
                            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) ecSuggestWordStruct.getHintText());
                            List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                            if (words != null && (ecWordStruct = (EcWordStruct) ListProtector.get(words, 0)) != null) {
                                word = ecWordStruct.getWord();
                            } else {
                                word = null;
                            }
                            textView.setText(spannableStringBuilderAppend.append((CharSequence) String.valueOf(word)));
                        }
                    }
                }
                C786410Ut5.Y7(constraintLayout, new ACListenerS77S0300000_10((Object) c672770QaBLIZIZ, (View) videoItemParams2, (Map<String, String>) this, (View) 14));
                return;
            }
            C786410Ut5.LL(8, constraintLayout);
        }
    }

    public final void Bp(VideoItemParams videoItemParams, C672770QaB c672770QaB) {
        Context context;
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            context = constraintLayout.getContext();
        } else {
            context = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//search");
        smartRouteBuildRoute.withParam("in_single_stack", true);
        smartRouteBuildRoute.withParam("keyword", c672770QaB.LIZ);
        smartRouteBuildRoute.withParam("group_id", videoItemParams.getAweme().getGroupId());
        smartRouteBuildRoute.withParam("back_flag", 1);
        smartRouteBuildRoute.withParam("enter_from", videoItemParams.mEventType);
        smartRouteBuildRoute.withParam("enter_method", "related_search_anchor_v2");
        EnumC669620QOi enumC669620QOi = EnumC669620QOi.SHOP;
        smartRouteBuildRoute.withParam("target_tab", enumC669620QOi.getTabName());
        smartRouteBuildRoute.withParam("root_enter_from_type", C0QXR.FEED_BOTTOM_BAR.getValue());
        smartRouteBuildRoute.withParam("set_hint_by_sug_word", false);
        smartRouteBuildRoute.withParam("single_tab_type", enumC669620QOi.getTabName());
        smartRouteBuildRoute.withParam("search_hint_word", c672770QaB.LIZ);
        int i = C1742080vR0.LIZ;
        smartRouteBuildRoute.withParam("traffic_source_list", C1742080vR0.LJIIIIZZ(videoItemParams.getAweme()));
        smartRouteBuildRoute.open();
    }
}
