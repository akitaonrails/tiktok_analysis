package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C13LE;
import X.C14Z2;
import X.C14Z4;
import X.C14Z5;
import X.C14Z7;
import X.C14ZO;
import X.C14ZQ;
import X.C14ZW;
import X.C1558520qew;
import X.C20283314Yd;
import X.C20285214Yw;
import X.C20285414Yy;
import X.C20285514Yz;
import X.C20286614Zk;
import X.C20287114Zp;
import X.C2180521AVm;
import X.C2217381BqS;
import X.C300680BqU;
import X.C692060RCq;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C988000bok;
import X.EnumC20283814Yi;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS318S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class BottomSurveyAssem extends InteractBottomBannerAssem<BottomSurveyAssem> implements ISurveyInteractAbility, InterfaceC1554640qYg {
    public final C01GW LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS274S0000000_30.get$arr$(231));
    public final String LLLFZ = "bottom_banner_survey";
    public final C20285214Yw LLLI = new C20285214Yw();
    public FeedSurvey LLLII;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2141538595) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility
    public final void Qn1() {
        if (getContentView().getVisibility() == 0) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            C2180521AVm.LIZLLL(LJJIJL(), 8, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String Jp() {
        return this.LLLFZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        Object obj;
        C20285214Yw c20285214Yw = this.LLLI;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c20285214Yw.LJ(((VideoItemParams) obj).getAweme(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[PHI: r2
      0x0079: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:28:0x0077, B:26:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig Up(com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig.Builder r10) {
        /*
            r9 = this;
            X.14ZW r0 = X.C14ZW.LIZ
            X.14Z5 r8 = X.C14Z5.BOTTOM
            r0.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.14ZG> r0 = X.C14ZW.LIZIZ
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r0.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L36
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.14ZG r0 = (X.C14ZG) r0
            int r1 = r0.LIZJ
            int r0 = r8.getType()
            if (r1 != r0) goto L1b
            r7.add(r2)
            goto L1b
        L36:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        L3f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            X.14ZG r0 = (X.C14ZG) r0
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r0.LIZIZ
            if (r0 == 0) goto L3f
            r2.add(r0)
            goto L3f
        L53:
            r6.addAll(r2)
            java.lang.Object r0 = X.C13LP.LJJJLL(r6)
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = (com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey) r0
            r9.LLLII = r0
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r0.questions
            if (r0 == 0) goto L99
            r0 = r0[r4]
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.feed.model.survey.Option[] r1 = r0.options
        L6a:
            java.lang.String r3 = ""
            if (r1 == 0) goto L76
            r0 = r1[r4]
            if (r0 == 0) goto L76
            java.lang.String r2 = r0.name
            if (r2 != 0) goto L79
        L76:
            r2 = r3
            if (r1 == 0) goto L82
        L79:
            r0 = r1[r5]
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L82
            r3 = r0
        L82:
            r0 = 2130774636(0x7f010a6c, float:1.7152452E38)
            r10.setIconWithLocalRes(r0)
            r10.setUpdateTitleSync(r4)
            kotlin.jvm.internal.AwS46S2100000_28 r1 = new kotlin.jvm.internal.AwS46S2100000_28
            r0 = 4
            r1.<init>(r2, r3, r9, r0)
            r10.setInteractionWithButton(r1)
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig r0 = r10.build()
            return r0
        L99:
            r1 = 0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem.Up(com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig$Builder):com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean dq(VideoItemParams videoItemParams) {
        boolean zLIZJ;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        String aid = videoItemParams.getAweme().getAid();
        C14Z5 c14z5 = C14Z5.BOTTOM;
        boolean zLIZLLL = c20285414YyLIZ.LIZLLL(c14z5.getType(), aid);
        if (C300680BqU.LIZ()) {
            return C14ZO.LIZ(videoItemParams.getAweme(), C14ZQ.BIND_BANNER, "homepage_hot");
        }
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && C14ZW.LIZLLL(aweme) == c14z5.getType()) {
            Aweme aweme2 = videoItemParams.getAweme();
            if (C20285514Yz.LIZ[C14Z4.LIZ(aweme2).ordinal()] == 3) {
                zLIZJ = C20286614Zk.LIZLLL(aweme2, false);
            } else {
                zLIZJ = C14Z7.LIZJ(aweme2, false);
            }
            if ((zLIZJ || zLIZLLL) && !C692060RCq.LIZ(videoItemParams.getAweme()) && !videoItemParams.getAweme().isAd()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r4
      0x0035: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:16:0x0033, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[PHI: r4
      0x003e: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v3 java.lang.String) binds: [B:16:0x0033, B:18:0x0038, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fq(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            r7 = this;
            super.fq(r8)
            android.view.View r0 = r7.LJJIJL()
            r6 = 0
            X.C786410Ut5.LJLLLLLL(r6, r0)
            X.14ZW r1 = X.C14ZW.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            r1.getClass()
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = X.C14ZW.LJ(r0)
            r7.LLLII = r0
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r0.questions
            if (r0 == 0) goto L71
            r0 = r0[r6]
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.feed.model.survey.Option[] r1 = r0.options
        L26:
            java.lang.String r5 = ""
            if (r1 == 0) goto L32
            r0 = r1[r6]
            if (r0 == 0) goto L32
            java.lang.String r4 = r0.name
            if (r4 != 0) goto L35
        L32:
            r4 = r5
            if (r1 == 0) goto L3e
        L35:
            r0 = 1
            r0 = r1[r0]
            if (r0 == 0) goto L3e
            java.lang.String r3 = r0.name
            if (r3 != 0) goto L3f
        L3e:
            r3 = r5
        L3f:
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig r0 = r7.Qp()
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig$Builder r2 = r0.toBuilder()
            kotlin.jvm.internal.AwS46S2100000_28 r1 = new kotlin.jvm.internal.AwS46S2100000_28
            r0 = 4
            r1.<init>(r4, r3, r7, r0)
            r2.setInteractionWithButton(r1)
            r7.Wp(r2)
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps$Title r1 = new com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps$Title
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r7.LLLII
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r0.questions
            if (r0 == 0) goto L66
            r0 = r0[r6]
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.title
            if (r0 == 0) goto L66
            r5 = r0
        L66:
            r1.<init>(r5)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r7.iq(r0)
            return
        L71:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem.fq(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public final void jq(int i) {
        Question[] questionArr;
        Question question;
        Option[] optionArr;
        Option option;
        Object obj;
        String aid;
        FeedSurvey feedSurvey = this.LLLII;
        String aid2 = null;
        if (feedSurvey != null && (questionArr = feedSurvey.questions) != null && (question = questionArr[0]) != null && (optionArr = question.options) != null && (option = optionArr[i]) != null) {
            C20287114Zp c20287114Zp = C20287114Zp.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
            c20287114Zp.getClass();
            C20287114Zp.LIZJ(enumC20283814Yi.getType(), aweme, new Option[]{option});
            C20285214Yw c20285214Yw = this.LLLI;
            c20285214Yw.getClass();
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme2 = c20285214Yw.LL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aid);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            c20285214Yw.LIZIZ(c20283314YdLIZIZ, enumC20283814Yi, option);
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme3 = c20285214Yw.LL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            }
            c20285414YyLIZ2.LJII(aid2, new C14Z2(C14Z5.BOTTOM.getType(), false));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.14ax
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS318S0000000_30.get$arr$(19), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.14aw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS318S0000000_30.get$arr$(20), 6);
    }
}
