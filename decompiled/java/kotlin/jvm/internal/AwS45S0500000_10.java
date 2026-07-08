package kotlin.jvm.internal;

import X.AbstractC642430PHt;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C09AY;
import X.C0ID4;
import X.C0NMY;
import X.C0PCX;
import X.C0PH8;
import X.C0PHI;
import X.C0PHT;
import X.C0PSG;
import X.C0Q9J;
import X.C1331660kl2;
import X.C1602160rnK;
import X.C20248814Kw;
import X.C238400w2;
import X.C259800zU;
import X.C284460BCy;
import X.C291001Au;
import X.C5185020h;
import X.C643520PLy;
import X.C651290Pgd;
import X.C654210PlL;
import X.C662160PyA;
import X.C683220Qr2;
import X.C684120QsU;
import X.C786410Ut5;
import X.EnumC654070Pl7;
import X.EnumC654440Pli;
import X.InterfaceC594520NTm;
import X.InterfaceC642370PHn;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.gson.h;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMusicInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS45S0500000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS45S0500000_10 awS45S0500000_10, Object obj) {
        boolean z = C0Q9J.LIZ;
        C684120QsU.LJFF((View) awS45S0500000_10.l0, (SearchFeedbackOptionalDetailFragment) awS45S0500000_10.l1, (C683220Qr2) awS45S0500000_10.l2, (FeedbackMultipleChoice) awS45S0500000_10.l3, (String) obj, (Function1) awS45S0500000_10.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0500000_10 awS45S0500000_10, Object obj) {
        C643520PLy c643520PLy = (C643520PLy) awS45S0500000_10.l0;
        c643520PLy.LIZIZ((h) obj, c643520PLy.LJFF.LJIIIZ(c643520PLy.LJIIJ), (Set) awS45S0500000_10.l1, (Set) awS45S0500000_10.l2, (Function1) awS45S0500000_10.l3, (Function1) awS45S0500000_10.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S0500000_10 awS45S0500000_10, Object obj) {
        AbstractC642430PHt abstractC642430PHt = (AbstractC642430PHt) obj;
        List<SearchMixFeed> list = (List) awS45S0500000_10.l0;
        InterfaceC642370PHn interfaceC642370PHn = (InterfaceC642370PHn) awS45S0500000_10.l1;
        C0PCX c0pcx = (C0PCX) awS45S0500000_10.l2;
        C0PSG c0psg = (C0PSG) awS45S0500000_10.l3;
        C0PHT c0pht = (C0PHT) awS45S0500000_10.l4;
        for (SearchMixFeed searchMixFeed : list) {
            C0PHI config = null;
            ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = C0PH8.LJFF(searchMixFeed, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), true);
            if (iSearchCardProtocolLJFF != null) {
                config = iSearchCardProtocolLJFF.getConfig();
            }
            if (interfaceC642370PHn != null && interfaceC642370PHn.LIZ(searchMixFeed)) {
                interfaceC642370PHn.LIZIZ(abstractC642430PHt, searchMixFeed);
            } else if (searchMixFeed.awemePoolAwemeList != null) {
                abstractC642430PHt.LIZ(new AwS589S0100000_10(searchMixFeed, 433));
            } else if (config != null) {
                abstractC642430PHt.LIZ(new AwS219S0300000_10(config, (C0PHI<InterfaceC594520NTm>) searchMixFeed, (SearchMixFeed) c0pcx, (C0PCX) 18));
            } else {
                abstractC642430PHt.LIZ(new AwS108S0400000_10(searchMixFeed, c0pcx, c0psg, c0pht, 3));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object, java.lang.String] */
    public static /* bridge */ /* synthetic */ Object invoke$3(AwS45S0500000_10 awS45S0500000_10, Object obj) {
        final EntityCardTitle entityCardTitle;
        boolean z;
        final Music music;
        SearchTopBarStruct searchTopBarStruct = (SearchTopBarStruct) ((C291001Au) obj).LIZ;
        if (searchTopBarStruct != null && (entityCardTitle = searchTopBarStruct.topCardInfo) != null) {
            entityCardTitle.tryGetMobParams();
            ?? pictureUrl = entityCardTitle.getPictureUrl();
            final EnumC654440Pli enumC654440Pli = EnumC654440Pli.COMMON;
            if (pictureUrl != 0 && pictureUrl.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i = 8;
            if (z) {
                C786410Ut5.LLZZ((RadiusLayout) awS45S0500000_10.l0, 8);
            } else {
                SearchMusicInfo searchMusicInfo = entityCardTitle.musicInfo;
                if (searchMusicInfo != null) {
                    music = searchMusicInfo.toMusic();
                } else {
                    music = null;
                }
                C662160PyA c662160PyA = (C662160PyA) awS45S0500000_10.l1;
                if (c662160PyA != null) {
                    if (entityCardTitle.titleStyle == EnumC654070Pl7.MUSIC.getType() && music != null) {
                        i = 0;
                    }
                    int visibility = c662160PyA.getVisibility();
                    c662160PyA.setVisibility(i);
                    C1602160rnK.LIZIZ(visibility, i, c662160PyA);
                }
                RadiusLayout radiusLayout = (RadiusLayout) awS45S0500000_10.l0;
                final C654210PlL c654210PlL = (C654210PlL) awS45S0500000_10.l3;
                final C662160PyA c662160PyA2 = (C662160PyA) awS45S0500000_10.l1;
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0PlO
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.view.View r18) {
                        /*
                            Method dump skipped, instruction units count: 482
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C654240PlO.LIZ(android.view.View):void");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, radiusLayout);
                C786410Ut5.LLZZ((RadiusLayout) awS45S0500000_10.l0, 0);
                if (!Intrinsics.LJFF(pictureUrl, ((C259800zU) awS45S0500000_10.l2).element)) {
                    C1331660kl2.LJIIIZ(pictureUrl).LJJIIJ(new C0ID4((ImageView) awS45S0500000_10.l4, (RadiusLayout) awS45S0500000_10.l0, 3));
                }
                ((C259800zU) awS45S0500000_10.l2).element = pictureUrl;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS45S0500000_10 awS45S0500000_10, Object obj) {
        AwS372S0200000_6 awS372S0200000_6;
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        c20248814Kw.LIZ = new AwS411S0200000_10((View) awS45S0500000_10.l1, (Function0) awS45S0500000_10.l0, 82);
        c20248814Kw.LIZIZ(new C5185020h(c238400w2, 43));
        c20248814Kw.LIZ(new AwS108S0400000_10(c238400w2, (C238400w2) awS45S0500000_10.l2, (C259800zU<SearchRefreshPredictMobCanShowVM>) awS45S0500000_10.l3, (Function0<? extends Map<String, String>>) awS45S0500000_10.l4, (Function0<? extends Map<String, String>>) 5));
        if (((Boolean) C284460BCy.LIZ.getValue()).booleanValue()) {
            awS372S0200000_6 = new AwS372S0200000_6((View) awS45S0500000_10.l1, (C259800zU) awS45S0500000_10.l2, 76);
        } else {
            awS372S0200000_6 = null;
        }
        C20248814Kw.LIZJ(c20248814Kw, true, true, 0.0f, 0, null, awS372S0200000_6, null, 84);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0500000_10(C643520PLy c643520PLy, Set set, Set set2, AwS589S0100000_10 awS589S0100000_10, AwS589S0100000_10 awS589S0100000_102, int i) {
        super(1);
        this.$t = i;
        this.l0 = c643520PLy;
        this.l1 = set;
        this.l2 = set2;
        this.l3 = awS589S0100000_10;
        this.l4 = awS589S0100000_102;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0500000_10(View view, View view2, SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment, C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice, Function1<? super C683220Qr2, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = searchFeedbackOptionalDetailFragment;
        this.l3 = c683220Qr2;
        this.l4 = feedbackMultipleChoice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0500000_10(RadiusLayout radiusLayout, RadiusLayout radiusLayout2, C662160PyA c662160PyA, C259800zU<String> c259800zU, C654210PlL c654210PlL, ImageView imageView) {
        super(1);
        this.$t = imageView;
        this.l0 = radiusLayout;
        this.l1 = radiusLayout2;
        this.l2 = c662160PyA;
        this.l3 = c259800zU;
        this.l4 = c654210PlL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0500000_10(List list, List<? extends SearchMixFeed> list2, InterfaceC642370PHn interfaceC642370PHn, C0PCX c0pcx, C0PSG c0psg, C0PHT c0pht) {
        super(1);
        this.$t = c0pht;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = interfaceC642370PHn;
        this.l3 = c0pcx;
        this.l4 = c0psg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0500000_10(Function0 function0, Function0<String> function02, View view, C259800zU<SearchRefreshPredictMobCanShowVM> c259800zU, Function0<? extends Map<String, String>> function03, Function0<? extends Map<String, String>> function04) {
        super(1);
        this.$t = function04;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = view;
        this.l3 = c259800zU;
        this.l4 = function03;
    }
}
