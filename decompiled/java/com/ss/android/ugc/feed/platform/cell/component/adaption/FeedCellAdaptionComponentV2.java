package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.AbstractC1604130rqV;
import X.AbstractC1879030yzt;
import X.AbstractC20560715cr;
import X.C01GW;
import X.C0ACI;
import X.C0COP;
import X.C0COV;
import X.C0NC0;
import X.C0PEM;
import X.C0RF0;
import X.C118300cf;
import X.C14LC;
import X.C15438062q;
import X.C1865480ye2;
import X.C1866580yfo;
import X.C19EG;
import X.C20346314jN;
import X.C20346414jO;
import X.C20479115Bl;
import X.C20517115Qb;
import X.C20517815Qi;
import X.C20518015Qk;
import X.C20555015bw;
import X.C20555315bz;
import X.C20555415c0;
import X.C20556315c9;
import X.C20557015cG;
import X.C20557215cI;
import X.C20557415cK;
import X.C20557515cL;
import X.C20557615cM;
import X.C20557915cP;
import X.C20558015cQ;
import X.C20558215cS;
import X.C20558815cY;
import X.C20560315cn;
import X.C20560415co;
import X.C20560515cp;
import X.C20560915ct;
import X.C20561015cu;
import X.C20561115cv;
import X.C2188811AlT;
import X.C23250099c;
import X.C259430AEr;
import X.C259700AFs;
import X.C295540BiC;
import X.C309690CBz;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C520680KbS;
import X.C584070MvV;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C709080Rre;
import X.C709090Rrf;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.EnumC1153720g82;
import X.EnumC1910950zpN;
import X.EnumC20564215dQ;
import X.EnumC584530MwF;
import X.InterfaceC1058490deR;
import X.InterfaceC1564270qoD;
import X.InterfaceC1869707Tz;
import X.InterfaceC20517715Qh;
import X.InterfaceC20561815d2;
import X.InterfaceC20561915d3;
import X.InterfaceC20564415dS;
import X.InterfaceC494301wD;
import X.RunnableC823120WQs;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS64S0300000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionhandler.FeedScreenContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.paramsoperator.VideoProgressAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator.MultiContainerThresholdResultOperator;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams.AdaptionRegularResultOperator;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.component.adaption.strategy.FeedVideoAdaptionStrategyFactory;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class FeedCellAdaptionComponentV2 extends CellAdaptionComponentV2 {
    public static boolean LLLLLL = true;
    public static int LLLLLLIL;
    public static int LLLLLLJ;
    public boolean LLLII;
    public int LLLIIII;
    public C20517815Qi LLLIIIL;
    public boolean LLLIIL;
    public Float LLLIILIL;
    public FeedScreenContext LLLILZJ;
    public C20479115Bl LLLILZLLLI;
    public C20479115Bl LLLIZZ;
    public View LLLJ;
    public View LLLJIL;
    public View LLLJL;
    public View LLLL;
    public View LLLLII;
    public ViewGroup LLLLIIIILLL;
    public View LLLLIIL;
    public C20557615cM LLLLJ;
    public C20557515cL LLLLJI;
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1242));
    public final int LLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)));
    public final int LLLILZ = R.id.video_container_area;
    public final C630740Ooa LLLLIILL = C628500Oky.LIZ(new C20555415c0(this));
    public final C630740Ooa LLLLIILLL = C628500Oky.LIZ(new C20555315bz(this));
    public final C630740Ooa LLLLIL = C628500Oky.LIZ(new C20555015bw(this));
    public final C630740Ooa LLLLILI = C628500Oky.LIZ(new C20558015cQ(this));
    public final C20557015cG LLLLL = new InterfaceC1564270qoD() { // from class: X.15cG
        /* JADX WARN: Type inference failed for: r2v2, types: [X.15cm] */
        @Override // X.InterfaceC1564270qoD
        public final void LIZ(float f, float f2, Float f3) {
            final String str;
            if (!C1568340qum.LIZIZ) {
                return;
            }
            FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2 = this.LIZ;
            C20557615cM c20557615cM = feedCellAdaptionComponentV2.LLLLJ;
            if (c20557615cM == null) {
                C0RF0 c0rf0 = feedCellAdaptionComponentV2.jm().LIZLLL;
                final Fragment fragment = null;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                } else {
                    str = null;
                }
                C0RF0 c0rf02 = feedCellAdaptionComponentV2.jm().LIZLLL;
                if (c0rf02 != null) {
                    fragment = c0rf02.LIZJ;
                }
                c20557615cM = new C20557615cM(new C0T9Y(str, fragment) { // from class: X.15cm
                    public final String LL;
                    public final Fragment LLILLJJLI;

                    public final String getEventType() {
                        return this.LL;
                    }

                    public final Fragment getFragment() {
                        return this.LLILLJJLI;
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = fragment;
                    }
                }, Float.valueOf(-f2), Float.valueOf(0.0f));
                feedCellAdaptionComponentV2.LLLLJ = c20557615cM;
                c20557615cM.LIZIZ(feedCellAdaptionComponentV2.LLLLLJIL, false, true);
            }
            float f4 = f / f2;
            c20557615cM.LJI(f4, new AwS397S0200000_31(this.LIZ, f3, 60));
            FeedCellAdaptionComponentV2 feedCellAdaptionComponentV22 = this.LIZ;
            C20557515cL c20557515cL = feedCellAdaptionComponentV22.LLLLJI;
            if (c20557515cL == null) {
                c20557515cL = new C20557515cL(new AdaptionPaddingValues(0, 0, 0, 0));
                feedCellAdaptionComponentV22.LLLLJI = c20557515cL;
                c20557515cL.LIZIZ(feedCellAdaptionComponentV22.LLLLLJLJLL, false, true);
            }
            c20557515cL.LJI(f4, new AwS610S0100000_31(this.LIZ, 263));
        }
    };
    public final C20557415cK LLLLLIL = new InterfaceC1058490deR() { // from class: X.15cK
        @Override // X.InterfaceC1058490deR
        public final void LIZ(float f, float f2) {
            if (!C293910BfZ.LIZIZ) {
                return;
            }
            FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2 = this.LIZ;
            C20557515cL c20557515cL = feedCellAdaptionComponentV2.LLLLJI;
            if (c20557515cL == null) {
                c20557515cL = new C20557515cL(new AdaptionPaddingValues(0, 0, 0, 0));
                feedCellAdaptionComponentV2.LLLLJI = c20557515cL;
                c20557515cL.LIZIZ(feedCellAdaptionComponentV2.LLLLLJLJLL, false, true);
            }
            c20557515cL.LJI(f / f2, new AwS610S0100000_31(this.LIZ, 259));
        }
    };
    public final C20558815cY LLLLLILLIL = new InterfaceC20561815d2<ScreenAdaptionResult>() { // from class: X.15cY
        @Override // X.InterfaceC20561815d2
        public final void LIZ(C0RAA c0raa) {
            this.LIZ.LLLILZJ = null;
        }
    };
    public final C20557915cP LLLLLJIL = new InterfaceC20561815d2<VideoAdaptionResult>() { // from class: X.15cP
        @Override // X.InterfaceC20561815d2
        public final void LIZ(C0RAA c0raa) {
            this.LIZ.Ep((VideoAdaptionResult) c0raa, "3. progress adaption finish by skylight");
        }
    };
    public final C20558215cS LLLLLJLJLL = new InterfaceC20561815d2<AdaptionPaddingValues>() { // from class: X.15cS
        @Override // X.InterfaceC20561815d2
        public final void LIZ(C0RAA c0raa) {
            this.LIZ.Tp((AdaptionPaddingValues) c0raa);
        }
    };

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final String ip() {
        return "feed_cell_default";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.15Qk, java.lang.Object] */
    public final void Gp() {
        Bitmap bitmapLIZJ;
        final C20517815Qi c20517815Qi = this.LLLIIIL;
        if (c20517815Qi != null) {
            final Aweme awemeKp = kp();
            final AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 260);
            if (awemeKp != null) {
                c20517815Qi.LIZ();
                String groupId = awemeKp.getGroupId();
                if (groupId != null && (bitmapLIZJ = C20517815Qi.LJ.getValue().LIZJ(groupId)) != null) {
                    awS610S0100000_31.invoke(bitmapLIZJ);
                    return;
                }
                c20517815Qi.LIZIZ = true;
                C20517115Qb c20517115Qb = new C20517115Qb();
                c20517815Qi.LIZ = c20517115Qb;
                ?? r3 = new InterfaceC20517715Qh() { // from class: X.15Qk
                    @Override // X.InterfaceC20517715Qh
                    public final void onFail() {
                        c20517815Qi.LIZIZ = false;
                    }

                    @Override // X.InterfaceC20517715Qh
                    public final void LIZLLL(Bitmap bitmap) {
                        c20517815Qi.LIZIZ = false;
                        C20517815Qi.LJ.getValue().LIZLLL(awemeKp.getGroupId(), bitmap);
                        Function1<Bitmap, Unit> function1 = awS610S0100000_31;
                        if (function1 != null) {
                            function1.invoke(bitmap);
                        }
                    }
                };
                if (c20517115Qb.LIZ || c20517115Qb.LIZIZ.get()) {
                    return;
                }
                c20517115Qb.LIZ = true;
                ARunnableS64S0300000_31 aRunnableS64S0300000_31 = new ARunnableS64S0300000_31(new AwS275S0300000_31(awemeKp, (C20518015Qk) r3, c20517115Qb, 41), r3, c20517115Qb, 12);
                if (C295540BiC.LIZIZ) {
                    C823050WQl.LIZJ().submit(aRunnableS64S0300000_31);
                } else {
                    new RunnableC823120WQs((Runnable) aRunnableS64S0300000_31).LIZ();
                }
            }
        }
    }

    public final int Ip() {
        LinearLayout linearLayout = this.LLJZ;
        if (linearLayout != null) {
            return linearLayout.getBottom() + ((int) linearLayout.getTranslationY());
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LLLLIIIILLL;
        if ((viewGroup2 == null || viewGroup2.getChildCount() != 0) && C584070MvV.LIZ() == EnumC584530MwF.DYNAMIC_BLUR && (viewGroup = this.LLLLIIIILLL) != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final AdaptionPaddingValues Ns0() {
        Boolean boolValueOf;
        ScreenAdaptionResult screenAdaptionResult;
        InterfaceC20564415dS interfaceC20564415dS;
        int iLIZJ;
        ScreenAdaptionResult screenAdaptionResult2;
        Aweme awemeKp = kp();
        if (awemeKp != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isPhotoMode(awemeKp) || C0NC0.LIZ(awemeKp));
        } else {
            boolValueOf = null;
        }
        if (C0COV.LIZIZ && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            AbstractC20560715cr abstractC20560715crMp = mp();
            if (abstractC20560715crMp == null || (screenAdaptionResult2 = (ScreenAdaptionResult) abstractC20560715crMp.LLILZ) == null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                iLIZJ = c19egLIZ != null ? C497820Jfg.LIZJ(c19egLIZ) : 0;
            } else {
                iLIZJ = screenAdaptionResult2.getStatusBarHeight();
            }
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            AdaptionPaddingValues adaptionPaddingValues = new AdaptionPaddingValues(0, iLIZJ, 0, 0);
            AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.CONTINUE, new Pair[]{new Pair("msg", AFwS221S0000000_31.get$arr$(486)), new Pair("aweme", new AwS575S0100000_31(this, 1514)), new Pair("adaptionPaddingValues", new AwS575S0100000_31(adaptionPaddingValues, 1515))});
            return adaptionPaddingValues;
        }
        VideoAdaptionResult videoAdaptionResultWB2 = wB2();
        InterfaceC1869707Tz resultOperator = videoAdaptionResultWB2 != null ? videoAdaptionResultWB2.getResultOperator() : null;
        AdaptionPaddingValues paddingValues = (!(resultOperator instanceof InterfaceC20564415dS) || (interfaceC20564415dS = (InterfaceC20564415dS) resultOperator) == null) ? null : interfaceC20564415dS.getPaddingValues();
        if (paddingValues == null) {
            AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.FINISH, new Pair[]{new Pair("msg", new C20560915ct()), new Pair("aweme", new C20346314jN(this)), new Pair("result", new C20560315cn(videoAdaptionResultWB2)), new Pair("adaptionPaddingValues", new C20561115cv())});
            return new AdaptionPaddingValues(0, 0, 0, 0);
        }
        int bottom = paddingValues.getBottom();
        AbstractC20560715cr abstractC20560715crMp2 = mp();
        AdaptionPaddingValues adaptionPaddingValuesCopy = paddingValues.copy(paddingValues.left, paddingValues.top, paddingValues.right, bottom - ((abstractC20560715crMp2 == null || (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715crMp2.LLILZ) == null) ? 0 : screenAdaptionResult.getBottomSpaceHeight()));
        AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.CONTINUE, new Pair[]{new Pair("msg", new C20561015cu()), new Pair("aweme", new C20346414jO(this)), new Pair("result", new C20560415co(videoAdaptionResultWB2)), new Pair("adaptionPaddingValues", new C20560515cp(adaptionPaddingValuesCopy))});
        return adaptionPaddingValuesCopy;
    }

    public final int Qp() {
        C709080Rre c709080Rre = this.LLJLLL;
        if (c709080Rre != null) {
            return c709080Rre.getTop() + ((int) c709080Rre.getTranslationY());
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public InterfaceC20561915d3 hp() {
        List<Float> list = C1866580yfo.LIZ().multi_container_width_threshold;
        List<Float> list2 = C1866580yfo.LIZ().multi_container_width_threshold;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Float> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().floatValue();
            arrayList.add(Float.valueOf(1.0f));
        }
        return new FeedVideoAdaptionStrategyFactory(list, arrayList);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final AdaptionPaddingValues vk1() {
        View view = this.LLLJ;
        int height = view != null ? view.getHeight() : 0;
        View view2 = this.LLLJIL;
        return new AdaptionPaddingValues(0, height, 0, view2 != null ? view2.getHeight() : 0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final void Bp() {
        ViewGroup viewGroup;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator;
        VideoAdaptionResult videoAdaptionResultWB2 = wB2();
        EnumC20564215dQ alignType = null;
        InterfaceC1869707Tz resultOperator = videoAdaptionResultWB2 != null ? videoAdaptionResultWB2.getResultOperator() : null;
        if ((resultOperator instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator = (MultiContainerThresholdResultOperator) resultOperator) != null) {
            alignType = multiContainerThresholdResultOperator.getAlignType();
        }
        if (alignType != EnumC20564215dQ.MATCH_PARENT || (viewGroup = this.LLLLIIIILLL) == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        super.Vo();
        C20557615cM c20557615cM = this.LLLLJ;
        if (c20557615cM != null) {
            c20557615cM.LJ(this.LLLLLJIL);
        }
        C20557515cL c20557515cL = this.LLLLJI;
        if (c20557515cL != null) {
            c20557515cL.LJ(this.LLLLLJLJLL);
        }
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLLLIL.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.qN0(this.LLLLL);
        }
        VideoShrinkAbility videoShrinkAbility = (VideoShrinkAbility) this.LLLLILI.getValue();
        if (videoShrinkAbility != null) {
            videoShrinkAbility.CS(this.LLLLLIL);
        }
        AbstractC20560715cr abstractC20560715crMp = mp();
        if (abstractC20560715crMp != null) {
            abstractC20560715crMp.LJ(this.LLLLLILLIL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean YP0() {
        return Up(kp());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean fk1() {
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator2;
        Video video;
        Video video2;
        Video video3;
        Aweme awemeKp = kp();
        int height = 0;
        if (awemeKp != null && awemeKp.isAd()) {
            return false;
        }
        Aweme awemeKp2 = kp();
        if (awemeKp2 != null && AwemeExtKt.isPhotoMode(awemeKp2)) {
            return false;
        }
        Aweme awemeKp3 = kp();
        if (awemeKp3 != null && (video3 = awemeKp3.getVideo()) != null && video3.getFakeLandscapeInfo() != null) {
            return false;
        }
        Aweme awemeKp4 = kp();
        int width = (awemeKp4 == null || (video2 = awemeKp4.getVideo()) == null) ? 0 : video2.getWidth();
        Aweme awemeKp5 = kp();
        if (awemeKp5 != null && (video = awemeKp5.getVideo()) != null) {
            height = video.getHeight();
        }
        VideoAdaptionResult videoAdaptionResultWB2 = wB2();
        InterfaceC1869707Tz resultOperator = videoAdaptionResultWB2 != null ? videoAdaptionResultWB2.getResultOperator() : null;
        float adjustContainerWidth = (!(resultOperator instanceof MultiContainerThresholdResultOperator) || (multiContainerThresholdResultOperator2 = (MultiContainerThresholdResultOperator) resultOperator) == null) ? 0.0f : multiContainerThresholdResultOperator2.getAdjustContainerWidth();
        VideoAdaptionResult videoAdaptionResultWB22 = wB2();
        InterfaceC1869707Tz resultOperator2 = videoAdaptionResultWB22 != null ? videoAdaptionResultWB22.getResultOperator() : null;
        return C20557215cI.LIZJ(LLLLLLIL, LLLLLLJ, adjustContainerWidth, (!(resultOperator2 instanceof MultiContainerThresholdResultOperator) || (multiContainerThresholdResultOperator = (MultiContainerThresholdResultOperator) resultOperator2) == null) ? 0.0f : multiContainerThresholdResultOperator.getAdjustContainerHeight(), width, height);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final AdaptionPaddingValues n81() {
        VideoAdaptionResult videoAdaptionResultWB2;
        AbstractC20560715cr abstractC20560715crMp;
        ScreenAdaptionResult screenAdaptionResult;
        int top;
        int bottom;
        int left;
        FakeLandscapeInfo fakeLandscapeInfo;
        Aweme awemeKp = kp();
        if (awemeKp == null || AwemeExtKt.isPhotoMode(awemeKp) || (videoAdaptionResultWB2 = wB2()) == null || (abstractC20560715crMp = mp()) == null || (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715crMp.LLILZ) == null) {
            return null;
        }
        AdaptionPaddingValues adaptionPaddingValuesNs0 = Ns0();
        int containerHeight = (screenAdaptionResult.getContainerHeight() - adaptionPaddingValuesNs0.getTop()) - adaptionPaddingValuesNs0.getBottom();
        int containerWidth = (screenAdaptionResult.getContainerWidth() - adaptionPaddingValuesNs0.getLeft()) - adaptionPaddingValuesNs0.getRight();
        Float translateX = videoAdaptionResultWB2.getTranslateX();
        int right = 0;
        int iFloatValue = translateX != null ? (int) translateX.floatValue() : 0;
        Float translateY = videoAdaptionResultWB2.getTranslateY();
        int iFloatValue2 = translateY != null ? (int) translateY.floatValue() : 0;
        int iMax = Math.max(((containerWidth - videoAdaptionResultWB2.getWidth()) / 2) + iFloatValue, 0);
        int iMax2 = Math.max(((containerHeight - videoAdaptionResultWB2.getHeight()) / 2) + iFloatValue2, 0);
        int iMax3 = Math.max(((containerWidth - videoAdaptionResultWB2.getWidth()) / 2) - iFloatValue, 0);
        int iMax4 = Math.max(((containerHeight - videoAdaptionResultWB2.getHeight()) / 2) - iFloatValue2, 0);
        Video video = awemeKp.getVideo();
        if (video == null || (fakeLandscapeInfo = video.getFakeLandscapeInfo()) == null) {
            top = 0;
            bottom = 0;
            left = 0;
        } else {
            top = (int) fakeLandscapeInfo.getTop();
            bottom = (int) fakeLandscapeInfo.getBottom();
            left = (int) fakeLandscapeInfo.getLeft();
            right = (int) fakeLandscapeInfo.getRight();
        }
        return new AdaptionPaddingValues(adaptionPaddingValuesNs0.getLeft() + iMax + left, adaptionPaddingValuesNs0.getTop() + iMax2 + top, adaptionPaddingValuesNs0.getRight() + iMax3 + right, adaptionPaddingValuesNs0.getBottom() + iMax4 + bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1387230mCf tK1() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.tK1():X.0mCf");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        C20479115Bl c20479115Bl = this.LLLIZZ;
        if (c20479115Bl != null) {
            c20479115Bl.LIZ();
        }
        C20479115Bl c20479115Bl2 = this.LLLILZLLLI;
        if (c20479115Bl2 != null) {
            c20479115Bl2.LIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final int Sj0() {
        return this.LLLIIII;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean XG1() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final InterfaceC1058490deR dj2() {
        return this.LLLLLIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final View jj1() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final int lp() {
        return this.LLLILZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Up(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r7 = 0
            r3 = 1
            if (r8 == 0) goto L23
            boolean r0 = r8.isAd()
            if (r0 != r3) goto L10
            boolean r0 = X.C259580AFg.LIZIZ
            if (r0 == 0) goto L22
            if (r8 == 0) goto L23
        L10:
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r8)
            if (r0 == r3) goto L22
            com.ss.android.ugc.aweme.feed.model.Video r0 = r8.getVideo()
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo r0 = r0.getFakeLandscapeInfo()
            if (r0 == 0) goto L23
        L22:
            return r7
        L23:
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r8 == 0) goto L6e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r8.getVideo()
            if (r0 == 0) goto L6e
            int r0 = r0.getHeight()
            float r4 = (float) r0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r8.getVideo()
            if (r0 == 0) goto L6b
            int r0 = r0.getWidth()
            float r0 = (float) r0
        L3e:
            float r4 = r4 / r0
        L3f:
            int r0 = com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLLIL
            float r2 = (float) r0
            float r2 = r2 * r4
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            boolean r0 = r0.LLLIIIIL()
            if (r0 == 0) goto L70
            int r0 = com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLLJ
            float r1 = (float) r0
            int r0 = com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLLIL
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 - r4
            float r0 = java.lang.Math.abs(r1)
            double r3 = (double) r0
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6a
            r7 = 1
        L6a:
            return r7
        L6b:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L3e
        L6e:
            r4 = 0
            goto L3f
        L70:
            float r1 = X.C2554009ze.LIZ()
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L80
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L7f
            r7 = 1
        L7f:
            return r7
        L80:
            float r1 = X.C2554009ze.LIZ()
            r0 = 1048576000(0x3e800000, float:0.25)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto La0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L9f
            int r0 = com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLLJ
            if (r0 <= 0) goto L9f
            float r0 = (float) r0
            float r2 = r2 / r0
            float r1 = (float) r3
            float r0 = X.C2554009ze.LIZ()
            float r1 = r1 - r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9f
            r7 = 1
        L9f:
            return r7
        La0:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L22
            int r0 = com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLLJ
            if (r0 <= 0) goto L22
            float r0 = (float) r0
            float r2 = r2 / r0
            float r1 = (float) r3
            float r0 = X.C2554009ze.LIZ()
            float r1 = r1 - r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L22
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.Up(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    /* JADX INFO: renamed from: Ap */
    public final void tp(VideoItemParams videoItemParams) {
        int screenHeight;
        ScreenAdaptionResult screenAdaptionResult;
        int screenWidth;
        ScreenAdaptionResult screenAdaptionResult2;
        if (C584070MvV.LIZIZ) {
            this.LLLIIII = 0;
            ViewGroup viewGroup = this.LLLLIIIILLL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            ViewGroup viewGroup2 = this.LLLLIIIILLL;
            if (viewGroup2 != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
        }
        super.tp(videoItemParams);
        this.LLLLJI = null;
        this.LLLLJ = null;
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLLLIL.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.qN0(this.LLLLL);
            feedSkylightDrawerLogicAbility.tF1(this.LLLLL);
        }
        Aweme awemeKp = kp();
        if (awemeKp != null && (AwemeExtKt.isPhotoMode(awemeKp) || C0NC0.LIZ(awemeKp))) {
            zp(null);
        }
        if (LLLLLLIL == 0) {
            AbstractC20560715cr abstractC20560715crMp = mp();
            if (abstractC20560715crMp != null && (screenAdaptionResult2 = (ScreenAdaptionResult) abstractC20560715crMp.LLILZ) != null) {
                screenWidth = screenAdaptionResult2.getScreenWidth();
            } else {
                screenWidth = 0;
            }
            LLLLLLIL = screenWidth;
        }
        if (LLLLLLJ == 0) {
            AbstractC20560715cr abstractC20560715crMp2 = mp();
            if (abstractC20560715crMp2 != null && (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715crMp2.LLILZ) != null) {
                screenHeight = screenAdaptionResult.getScreenHeight();
            } else {
                screenHeight = 0;
            }
            LLLLLLJ = screenHeight;
        }
        if (C0COP.LIZIZ && !this.LLLIIL) {
            this.LLLII = false;
            View view = this.LLLLII;
            if (view != null) {
                view.setBackground(null);
            }
            if (Up(videoItemParams.getAweme())) {
                if (C259700AFs.LIZIZ) {
                    LifecycleOwnerExtensionsKt.LIZIZ(this, ((Number) C259700AFs.LIZ.getValue()).intValue(), new ARunnableS100S0200000_31(this, videoItemParams, 35));
                    return;
                }
                C20517815Qi c20517815Qi = this.LLLIIIL;
                if (c20517815Qi == null) {
                    return;
                }
                c20517815Qi.LIZIZ(videoItemParams.getAweme(), new AwS610S0100000_31(this, 262));
            }
        }
    }

    public final void Fp(int i) {
        this.LLLII = true;
        View view = this.LLLLII;
        if (view != null) {
            view.setBackgroundColor(i);
        }
        View view2 = this.LLLJ;
        if (view2 != null) {
            view2.setBackground(null);
        }
        View view3 = this.LLLJIL;
        if (view3 != null) {
            view3.setBackground(null);
        }
        View view4 = this.LLLJL;
        if (view4 != null) {
            view4.setBackground(null);
        }
        View view5 = this.LLLL;
        if (view5 != null) {
            view5.setBackground(null);
        }
    }

    public final VideoProgressAdaptionParams Jp(Float f) {
        ScreenAdaptionResult screenAdaptionResult;
        Integer numValueOf;
        VideoAdaptionResult videoAdaptionResultWB2 = wB2();
        VideoAdaptionResult videoAdaptionResult = null;
        if (videoAdaptionResultWB2 == null) {
            return null;
        }
        AbstractC20560715cr abstractC20560715crMp = mp();
        if (abstractC20560715crMp != null && (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715crMp.LLILZ) != null && (numValueOf = Integer.valueOf(screenAdaptionResult.getContainerHeight())) != null && numValueOf.intValue() > 0) {
            if (f != null) {
                Float.valueOf(0.0f);
                videoAdaptionResult = new VideoAdaptionResult(0, 0, null, f, null);
            } else {
                Float fValueOf = Float.valueOf((videoAdaptionResultWB2.getHeight() / 2.0f) - (numValueOf.intValue() / 2.0f));
                Float.valueOf(0.0f);
                videoAdaptionResult = new VideoAdaptionResult(0, 0, null, fValueOf, null);
            }
        }
        return new VideoProgressAdaptionParams(videoAdaptionResultWB2, videoAdaptionResult);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final void LJJIJIIJI(String str) {
        InterfaceC1869707Tz resultOperator;
        EnumC20564215dQ alignType;
        ScreenAdaptionResult screenAdaptionResult;
        int bottom;
        int bottom2;
        Integer numValueOf;
        C709080Rre c709080Rre;
        LinearLayout linearLayout;
        View videoView;
        View videoView2;
        ViewGroup viewGroup;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator;
        super.LJJIJIIJI(str);
        VideoAdaptionResult videoAdaptionResultWB2 = wB2();
        Integer numValueOf2 = null;
        if (videoAdaptionResultWB2 != null) {
            resultOperator = videoAdaptionResultWB2.getResultOperator();
        } else {
            resultOperator = null;
        }
        if ((resultOperator instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator = (MultiContainerThresholdResultOperator) resultOperator) != null) {
            alignType = multiContainerThresholdResultOperator.getAlignType();
        } else {
            alignType = null;
        }
        if (alignType == EnumC20564215dQ.MATCH_PARENT && (viewGroup = this.LLLLIIIILLL) != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        C118300cf c118300cf = new C118300cf();
        if (this.LLLII) {
            c118300cf.element = 1;
        } else if (C0COP.LIZIZ && Up(kp())) {
            c118300cf.element = -1;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((ViewModel) this.LLJLL.getValue()), C0PEM.LIZJ, null, new C20556315c9(this, c118300cf, null), 2);
        AbstractC20560715cr abstractC20560715crMp = mp();
        if (abstractC20560715crMp != null && (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715crMp.LLILZ) != null) {
            IVideoCellAbility iVideoCellAbilitySp = sp();
            if (iVideoCellAbilitySp != null && (videoView2 = iVideoCellAbilitySp.getVideoView()) != null) {
                bottom = videoView2.getBottom() + ((int) videoView2.getTranslationY());
            } else {
                bottom = 0;
            }
            if (bottom > screenAdaptionResult.getContainerHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) || Ip() > screenAdaptionResult.getContainerHeight() || Qp() > screenAdaptionResult.getContainerHeight()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adaption result invalid: containerHeight=");
                sbLIZ.append(screenAdaptionResult.getContainerHeight());
                sbLIZ.append(" , videoViewBottom=");
                IVideoCellAbility iVideoCellAbilitySp2 = sp();
                if (iVideoCellAbilitySp2 != null && (videoView = iVideoCellAbilitySp2.getVideoView()) != null) {
                    bottom2 = videoView.getBottom() + ((int) videoView.getTranslationY());
                } else {
                    bottom2 = 0;
                }
                sbLIZ.append(bottom2);
                sbLIZ.append(", videoContainerToContainerBottom=");
                sbLIZ.append(Ip());
                sbLIZ.append(", videoVisibleAreaContainerToContainerBottom=");
                sbLIZ.append(Qp());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C709090Rrf c709090Rrf = this.LLJJJJLIIL;
                boolean z = AbstractC1604130rqV.LIZLLL;
                c709090Rrf.LJIIIIZZ(null, "onRenderFirstFrame", strLIZIZ);
                if (Ip() > screenAdaptionResult.getContainerHeight() && (linearLayout = this.LLJZ) != null) {
                    C786410Ut5.hd(linearLayout, 0.0f);
                }
                if (Qp() > screenAdaptionResult.getContainerHeight() && (c709080Rre = this.LLJLLL) != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c709080Rre);
                    c709080Rre.setTranslationY(0.0f);
                }
                EnumC1153720g82 enumC1153720g82 = EnumC1153720g82.INVALID_VIDEO_TOP;
                C709080Rre c709080Rre2 = this.LLJLLL;
                if (c709080Rre2 != null) {
                    numValueOf = Integer.valueOf(c709080Rre2.getWidth());
                } else {
                    numValueOf = null;
                }
                C709080Rre c709080Rre3 = this.LLJLLL;
                if (c709080Rre3 != null) {
                    numValueOf2 = Integer.valueOf(c709080Rre3.getHeight());
                }
                yp(enumC1153720g82, numValueOf, numValueOf2);
            }
        }
        AdaptionPaddingValues adaptionPaddingValuesNs0 = Ns0();
        View view = this.LLLJ;
        if (view != null && view.getHeight() != adaptionPaddingValuesNs0.getTop()) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(307)), new Pair("aweme", new AwS575S0100000_31(this, 1245)), new Pair("height", new AwS575S0100000_31(view, 1246)), new Pair("padding", new AwS575S0100000_31(adaptionPaddingValuesNs0, 1247)));
        }
        View view2 = this.LLLJL;
        if (view2 != null && view2.getHeight() != adaptionPaddingValuesNs0.getTop()) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(308)), new Pair("aweme", new AwS575S0100000_31(this, 1248)), new Pair("height", new AwS575S0100000_31(view2, 1249)), new Pair("padding", new AwS575S0100000_31(adaptionPaddingValuesNs0, 1250)));
        }
        View view3 = this.LLLJIL;
        if (view3 != null && view3.getHeight() != adaptionPaddingValuesNs0.getBottom()) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(309)), new Pair("aweme", new AwS575S0100000_31(this, 1251)), new Pair("height", new AwS575S0100000_31(view3, 1252)), new Pair("padding", new AwS575S0100000_31(adaptionPaddingValuesNs0, 1253)));
        }
        View view4 = this.LLLL;
        if (view4 != null && view4.getHeight() != adaptionPaddingValuesNs0.getBottom()) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(310)), new Pair("aweme", new AwS575S0100000_31(this, 1254)), new Pair("height", new AwS575S0100000_31(view4, 1255)), new Pair("padding", new AwS575S0100000_31(adaptionPaddingValuesNs0, 1256)));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        ViewGroup viewGroup;
        if (C584070MvV.LIZ() == EnumC584530MwF.DYNAMIC_BLUR) {
            ViewGroup viewGroup2 = this.LLLLIIIILLL;
            if ((viewGroup2 != null && viewGroup2.getChildCount() == 0) || (viewGroup = this.LLLLIIIILLL) == null) {
                return;
            }
            C786410Ut5.LJLZ(0, viewGroup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp(com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.Tp(com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLILZLLLI = (C20479115Bl) C520680KbS.LIZ(R.id.video_effective_area, view);
        this.LLLIZZ = (C20479115Bl) C520680KbS.LIZ(R.id.video_obstructed_area, view);
        this.LLLJ = C520680KbS.LIZ(R.id.dlw, view);
        this.LLLJIL = C520680KbS.LIZ(R.id.dlg, view);
        this.LLLJL = C520680KbS.LIZ(R.id.w7w, view);
        this.LLLL = C520680KbS.LIZ(R.id.w7v, view);
        boolean z = C0COP.LIZIZ;
        if (z) {
            this.LLLLII = C520680KbS.LIZ(R.id.long_press_layout, view);
        }
        this.LLLLIIL = C520680KbS.LIZ(R.id.qmw, view);
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLLLIL.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.tF1(this.LLLLL);
        }
        VideoShrinkAbility videoShrinkAbility = (VideoShrinkAbility) this.LLLLILI.getValue();
        if (videoShrinkAbility != null) {
            videoShrinkAbility.EL(this.LLLLLIL);
        }
        AbstractC20560715cr abstractC20560715crMp = mp();
        if (abstractC20560715crMp != null) {
            abstractC20560715crMp.LIZIZ(this.LLLLLILLIL, false, true);
        }
        if (z || C584070MvV.LIZIZ) {
            this.LLLIIIL = new C20517815Qi();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final void zp(VideoAdaptionResult videoAdaptionResult) {
        Object objGI;
        String str;
        EnumC20564215dQ alignType;
        Context context;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator2;
        VideoAdaptionParams videoAdaptionParams;
        float adjustContainerWidth;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator3;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator4;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator5;
        BaseCellContentComponent baseCellContentComponent;
        C690870R8b c690870R8bJm;
        C0RF0 c0rf0;
        BaseFeedPageParams baseFeedPageParams;
        EnumC20564215dQ alignType2;
        float f;
        Video video;
        float width;
        Video video2;
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator6;
        C20557615cM c20557615cM = this.LLLLJ;
        C20557515cL c20557515cL = this.LLLLJI;
        EnumC20564215dQ alignType3 = null;
        VideoProgressAdaptionParams videoProgressAdaptionParamsJp = Jp(null);
        AdaptionPaddingValues adaptionPaddingValuesNs0 = Ns0();
        if (c20557515cL != null) {
            c20557515cL.LIZJ(adaptionPaddingValuesNs0);
        } else {
            Tp(adaptionPaddingValuesNs0);
        }
        if (c20557615cM != null && videoProgressAdaptionParamsJp != null) {
            c20557615cM.LIZJ(videoProgressAdaptionParamsJp);
        } else {
            super.zp(videoAdaptionResult);
        }
        float adjustContainerHeight = 0.0f;
        if (videoAdaptionResult != null && !this.LLLIIL) {
            InterfaceC1869707Tz resultOperator = videoAdaptionResult.getResultOperator();
            if ((resultOperator instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator6 = (MultiContainerThresholdResultOperator) resultOperator) != null) {
                alignType2 = multiContainerThresholdResultOperator6.getAlignType();
            } else {
                alignType2 = null;
            }
            if (alignType2 == EnumC20564215dQ.MATCH_PARENT) {
                Aweme awemeKp = kp();
                if (awemeKp != null && (video = awemeKp.getVideo()) != null) {
                    float height = video.getHeight();
                    Aweme awemeKp2 = kp();
                    if (awemeKp2 != null && (video2 = awemeKp2.getVideo()) != null) {
                        width = video2.getWidth();
                    } else {
                        width = 1.0f;
                    }
                    f = height / width;
                } else {
                    f = 0.0f;
                }
                this.LLLIILIL = Float.valueOf(1.0f - ((f * LLLLLLIL) / (LLLLLLJ - this.LLLIL)));
            } else {
                this.LLLIILIL = Float.valueOf(1.0f - (videoAdaptionResult.getHeight() / (LLLLLLJ - this.LLLIL)));
            }
        }
        if (!this.LLLIIL && videoAdaptionResult != null && C584070MvV.LIZIZ) {
            Aweme awemeKp3 = kp();
            if (awemeKp3 != null) {
                if (!awemeKp3.isAd() && !AwemeExtKt.isPhotoMode(awemeKp3)) {
                    Video video3 = awemeKp3.getVideo();
                    if (video3 != null && video3.getFakeLandscapeInfo() != null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            IVideoCellAbility iVideoCellAbilitySp = sp();
            if (iVideoCellAbilitySp != null) {
                objGI = iVideoCellAbilitySp.gI();
            } else {
                objGI = null;
            }
            if ((objGI instanceof RootCellComponent) && (baseCellContentComponent = (BaseCellContentComponent) objGI) != null && (c690870R8bJm = baseCellContentComponent.jm()) != null && (c0rf0 = c690870R8bJm.LIZLLL) != null && (baseFeedPageParams = c0rf0.LJ) != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                InterfaceC1869707Tz resultOperator2 = videoAdaptionResult.getResultOperator();
                if ((resultOperator2 instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator5 = (MultiContainerThresholdResultOperator) resultOperator2) != null) {
                    alignType = multiContainerThresholdResultOperator5.getAlignType();
                } else {
                    alignType = null;
                }
                if (alignType != EnumC20564215dQ.MATCH_PARENT) {
                    AdaptionPaddingValues adaptionPaddingValuesN81 = n81();
                    if (adaptionPaddingValuesN81 != null) {
                        InterfaceC1869707Tz resultOperator3 = videoAdaptionResult.getResultOperator();
                        if ((resultOperator3 instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator2 = (MultiContainerThresholdResultOperator) resultOperator3) != null && (videoAdaptionParams = multiContainerThresholdResultOperator2.getVideoAdaptionParams()) != null) {
                            InterfaceC1869707Tz resultOperator4 = videoAdaptionResult.getResultOperator();
                            if ((resultOperator4 instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator4 = (MultiContainerThresholdResultOperator) resultOperator4) != null) {
                                adjustContainerWidth = multiContainerThresholdResultOperator4.getAdjustContainerWidth();
                            } else {
                                adjustContainerWidth = 0.0f;
                            }
                            InterfaceC1869707Tz resultOperator5 = videoAdaptionResult.getResultOperator();
                            if ((resultOperator5 instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator3 = (MultiContainerThresholdResultOperator) resultOperator5) != null) {
                                adjustContainerHeight = multiContainerThresholdResultOperator3.getAdjustContainerHeight();
                            }
                            if ((adaptionPaddingValuesN81.getTop() <= 0 && adaptionPaddingValuesN81.getBottom() <= 0) || !C20557215cI.LIZLLL(videoAdaptionParams, LLLLLLIL, LLLLLLJ, adjustContainerWidth, adjustContainerHeight)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (this.LLLIIII == 0) {
                    this.LLLIIII = 1;
                    InterfaceC1869707Tz resultOperator6 = videoAdaptionResult.getResultOperator();
                    if ((resultOperator6 instanceof MultiContainerThresholdResultOperator) && (multiContainerThresholdResultOperator = (MultiContainerThresholdResultOperator) resultOperator6) != null) {
                        alignType3 = multiContainerThresholdResultOperator.getAlignType();
                    }
                    if (alignType3 == EnumC20564215dQ.MATCH_PARENT) {
                        this.LLLIIII = 2;
                    }
                    if (this.LLLLIIIILLL == null && (context = getContext()) != null) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        this.LLLLIIIILLL = frameLayout;
                        C709080Rre c709080Rre = this.LLJLLL;
                        if (c709080Rre != null) {
                            c709080Rre.addView(frameLayout);
                        }
                    }
                    ViewGroup viewGroup = this.LLLLIIIILLL;
                    if (viewGroup != null) {
                        C786410Ut5.LJLZ(0, viewGroup);
                    }
                    if (C0ACI.LIZIZ) {
                        LifecycleOwnerExtensionsKt.LIZIZ(this, ((Number) C0ACI.LIZ.getValue()).intValue(), new ARunnableS131S0100000_31(this, 95));
                    } else {
                        Gp();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final void Ep(VideoAdaptionResult videoAdaptionResult, String str) {
        View view;
        AdaptionRegularResultOperator adaptionRegularResultOperator;
        String str2;
        String str3;
        String str4;
        super.Ep(videoAdaptionResult, str);
        InterfaceC1869707Tz resultOperator = null;
        if (videoAdaptionResult != null) {
            resultOperator = videoAdaptionResult.getResultOperator();
        }
        if ((resultOperator instanceof AdaptionRegularResultOperator) && (adaptionRegularResultOperator = (AdaptionRegularResultOperator) resultOperator) != null && adaptionRegularResultOperator.getNeedSave()) {
            Aweme awemeKp = kp();
            String str5 = "1";
            if (awemeKp != null) {
                if (Intrinsics.LJFF(adaptionRegularResultOperator.isIntextOccludeTab(), Boolean.TRUE)) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                AwemeBizExtKt.setIntextOccludeTab(awemeKp, str2);
                if (Intrinsics.LJFF(adaptionRegularResultOperator.isIntextOccludeInteraction(), Boolean.TRUE)) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                AwemeBizExtKt.setIntextOccludeInteraction(awemeKp, str3);
                if (Intrinsics.LJFF(adaptionRegularResultOperator.isIntextOut(), Boolean.TRUE)) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                AwemeBizExtKt.setIntextOut(awemeKp, str4);
                if (!Intrinsics.LJFF(adaptionRegularResultOperator.isIntextOccludeDesc(), Boolean.TRUE)) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                AwemeBizExtKt.setIntextOccludeDesc(awemeKp, str5);
            }
        }
        if (videoAdaptionResult != null) {
            float fFloatValue = 0.0f;
            if (C259430AEr.LIZIZ) {
                if (videoAdaptionResult.getWidth() >= videoAdaptionResult.getHeight() && (view = this.LLLLIIL) != null) {
                    Float translateY = videoAdaptionResult.getTranslateY();
                    if (translateY != null) {
                        fFloatValue = translateY.floatValue();
                    }
                    C786410Ut5.ed(view, fFloatValue);
                    return;
                }
                return;
            }
            View view2 = this.LLLLIIL;
            if (view2 == null) {
                return;
            }
            Float translateY2 = videoAdaptionResult.getTranslateY();
            if (translateY2 != null) {
                fFloatValue = translateY2.floatValue();
            }
            C786410Ut5.ed(view2, fFloatValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC589490NAd ep(com.ss.android.ugc.aweme.feed.model.Aweme r31, int r32, int r33) {
        /*
            r30 = this;
            boolean r0 = com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLL
            r12 = 0
            if (r0 == 0) goto L8
            com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.LLLLLL = r12
            r12 = 1
        L8:
            r13 = r30
            r13.LLLIIL = r12
            X.0Ooa r0 = r13.LLLLIILLL
            java.lang.Object r11 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility r11 = (com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility) r11
            X.0Ooa r0 = r13.LLLLIILL
            java.lang.Object r10 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility r10 = (com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility) r10
            X.15Bl r14 = r13.LLLIZZ
            X.15Bl r9 = r13.LLLILZLLLI
            X.15cr r20 = r13.mp()
            X.0R8b r0 = r13.jm()
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L30
            java.lang.String r8 = r0.LJIIIZ
            if (r8 != 0) goto L32
        L30:
            java.lang.String r8 = ""
        L32:
            boolean r0 = X.C293910BfZ.LIZIZ
            r1 = 0
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.videoadaption.adaptionhandler.FeedScreenContext r7 = r13.LLLILZJ
            if (r7 != 0) goto L93
            X.15cr r0 = r13.mp()
            if (r0 == 0) goto Lb2
            R extends X.0RAA r0 = r0.LLILZ
            com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult r0 = (com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult) r0
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.experiment.FeedAdaptionMultiContainerSettingsConfig r2 = X.C1866580yfo.LIZ()
            int r1 = r0.getStatusBarHeight()
            float r6 = (float) r1
            X.07eg r1 = X.C1914407eg.LIZ
            r1.getClass()
            int r1 = X.C1914407eg.LIZ()
            float r5 = (float) r1
            int r1 = r0.getAppNavHeight()
            float r4 = (float) r1
            float r26 = r6 + r5
            float r1 = r2.smallest_container_trans_top_by_bottom_tab
            float r1 = r1 * r4
            float r26 = r26 + r1
            float r26 = r26 - r4
            boolean r1 = r0.getShowBottomSpace()
            if (r1 == 0) goto Lad
            java.util.List<java.lang.Integer> r3 = r2.multi_container_top_type_list
            java.util.List<java.lang.Integer> r2 = r2.multi_container_bottom_type_list
        L72:
            int r1 = r0.getScreenWidth()
            float r1 = (float) r1
            int r0 = r0.getScreenHeight()
            float r0 = (float) r0
            com.ss.android.ugc.aweme.videoadaption.adaptionhandler.FeedScreenContext r7 = new com.ss.android.ugc.aweme.videoadaption.adaptionhandler.FeedScreenContext
            r24 = r0
            r25 = r5
            r27 = r4
            r28 = r3
            r29 = r2
            r21 = r7
            r22 = r6
            r23 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r13.LLLILZJ = r7
        L93:
            com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator r15 = new com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator
            r19 = r33
            r18 = r32
            r16 = r31
            r26 = r7
            r24 = r9
            r25 = r8
            r21 = r11
            r22 = r10
            r23 = r14
            r17 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r15
        Lad:
            java.util.List<java.lang.Integer> r3 = r2.multi_container_top_type_list_small
            java.util.List<java.lang.Integer> r2 = r2.multi_container_bottom_type_list_small
            goto L72
        Lb2:
            r7 = r1
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2.ep(com.ss.android.ugc.aweme.feed.model.Aweme, int, int):X.0NAd");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void CX1(Context context, Aweme aweme, View view, View view2, OcrLocation ocrLocation, ViewGroup viewGroup) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[resizeVideoAndCover] aweme:");
        Aweme awemeKp = kp();
        if (awemeKp != null) {
            aid = awemeKp.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Jp(null) != null && this.LLLLJ != null) {
            return;
        }
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 1241);
        ICommonFeedAppDiffProtocol.LIZ.getClass();
        C1865480ye2.LIZ().LJII();
        awS575S0100000_31.invoke();
    }
}
