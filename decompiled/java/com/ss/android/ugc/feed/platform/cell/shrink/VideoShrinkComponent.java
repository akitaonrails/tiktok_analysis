package com.ss.android.ugc.feed.platform.cell.shrink;

import X.AbstractC1604130rqV;
import X.AbstractC1879030yzt;
import X.AbstractC20570315eP;
import X.C01GW;
import X.C0QSJ;
import X.C1010120cOQ;
import X.C1017180cZo;
import X.C13LE;
import X.C1558520qew;
import X.C1604450rr1;
import X.C1616490sAR;
import X.C1619980sG4;
import X.C16HB;
import X.C19252910Tv;
import X.C20570115eN;
import X.C20570415eQ;
import X.C20570515eR;
import X.C20570615eS;
import X.C20570715eT;
import X.C20571215eY;
import X.C20571315eZ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C266530AcV;
import X.C276200As6;
import X.C294480BgU;
import X.C452501pT;
import X.C523420Kfs;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724270Sb3;
import X.C735370Ssx;
import X.C736580Suu;
import X.C736590Suv;
import X.C736600Suw;
import X.C736610Sux;
import X.C736620Suy;
import X.C736630Suz;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1058490deR;
import X.InterfaceC1554640qYg;
import X.InterfaceC20561815d2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoShrinkComponent extends BaseCellContentComponent<VideoShrinkComponent> implements VideoShrinkAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public AbstractC20570315eP LLJJL;
    public final ValueAnimator LLJLLIL;
    public int LLJLLL;
    public float LLJZ;
    public final C01GW LLJZIJLIL;
    public final boolean LLL;
    public final C01GW LLLF;
    public C20570115eN LLLFF;
    public final C630740Ooa LLLFFI;
    public final C630740Ooa LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public volatile HomeTabAbility LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZ(EnumC452301pR.NONE, new C20571315eZ());
    public final CopyOnWriteArrayList<InterfaceC1058490deR> LLJJLIIIJLLLLLLLZ = new CopyOnWriteArrayList<>();
    public final C01GW LLJL = C452501pT.LIZIZ(new C736630Suz(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C736600Suw(this));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C736590Suv(this));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1287));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoShrinkComponent.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void PE2() {
        this.LLLII = true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2016640377) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final boolean I3() {
        return this.LLJJL != null || ep();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void LJJLIIIIJ() {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LJFF() && c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LIZJ()) {
            kp();
            if (this.LLJLLL == 1) {
                return;
            }
            lp();
            mp(0L, false, true);
            this.LLJLLL = 1;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final boolean dA0() {
        if (this.LLJJL == null) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C1616490sAR.LIZIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
    }

    public final boolean ep() {
        return ((Boolean) this.LLLF.getValue()).booleanValue();
    }

    public final IVideoCellAbility hp() {
        return (IVideoCellAbility) this.LLJL.getValue();
    }

    public final void lp() {
        AbstractC20570315eP abstractC20570315eP = this.LLJJL;
        if (abstractC20570315eP != null) {
            View viewLIZIZ = abstractC20570315eP.LIZIZ();
            if (viewLIZIZ != null) {
                C786410Ut5.Ob(viewLIZIZ, abstractC20570315eP.LJFF);
                C786410Ut5.pc(viewLIZIZ, abstractC20570315eP.LJI);
                C786410Ut5.Jc(viewLIZIZ, ((Number) abstractC20570315eP.LJII.getValue()).floatValue());
                C786410Ut5.ed(viewLIZIZ, abstractC20570315eP.LIZ());
            }
            View view = abstractC20570315eP.LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, abstractC20570315eP.LJFF);
                C786410Ut5.pc(view, abstractC20570315eP.LJI);
                C786410Ut5.Jc(view, ((Number) abstractC20570315eP.LJII.getValue()).floatValue());
                C786410Ut5.ed(view, abstractC20570315eP.LIZ());
            }
        }
    }

    public VideoShrinkComponent() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(100L);
        valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        this.LLJLLIL = valueAnimator;
        this.LLJLLL = 1;
        this.LLJZIJLIL = C452501pT.LIZIZ(new C20570415eQ());
        this.LLL = ((Number) C266530AcV.LIZ.getValue()).intValue() == 0;
        this.LLLF = C452501pT.LIZIZ(new C736580Suu());
        this.LLLFFI = C628500Oky.LIZ(new C736620Suy(this));
        this.LLLFZ = C628500Oky.LIZ(new C736610Sux(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void B4() {
        InterfaceC583650Mup interfaceC583650MupX3;
        View videoView;
        IVideoCellAbility iVideoCellAbilityHp = hp();
        if (iVideoCellAbilityHp == null || (interfaceC583650MupX3 = iVideoCellAbilityHp.x3()) == null || (videoView = interfaceC583650MupX3.getVideoView()) == null) {
            return;
        }
        videoView.addOnLayoutChangeListener(new C16HB(this, 2));
    }

    public final void kp() {
        IVideoCellAbility iVideoCellAbilityHp = hp();
        InterfaceC583650Mup interfaceC583650MupX3 = iVideoCellAbilityHp != null ? iVideoCellAbilityHp.x3() : null;
        IVideoCellAbility iVideoCellAbilityHp2 = hp();
        View viewYy0 = iVideoCellAbilityHp2 != null ? iVideoCellAbilityHp2.yy0() : null;
        IVideoCellAbility iVideoCellAbilityHp3 = hp();
        View viewVy1 = iVideoCellAbilityHp3 != null ? iVideoCellAbilityHp3.Vy1() : null;
        if (interfaceC583650MupX3 == null) {
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feedPlayerView null ");
            C724270Sb3 c724270Sb3 = this.LLJI;
            sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
            abstractC1604130rqV.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLFFI.getValue();
        if (iScreenComponentAbility == null) {
            AbstractC1879030yzt.LIZ(AFwS221S0000000_31.get$arr$(311));
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        if (aweme == null) {
            return;
        }
        lp();
        boolean zLJJIJIL = C735370Ssx.LJJIJIL(aweme);
        if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue() && ip(aweme)) {
            this.LLJJL = new C20570615eS(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility, viewYy0, interfaceC583650MupX3.go1() ? interfaceC583650MupX3.Hk() : null);
            return;
        }
        if (zLJJIJIL) {
            this.LLJJL = new C20570715eT(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility, interfaceC583650MupX3.go1() ? interfaceC583650MupX3.Hk() : null);
        } else if (!this.LLL && !ep()) {
            this.LLJJL = null;
        } else {
            IVideoCellAbility iVideoCellAbilityHp4 = hp();
            this.LLJJL = new C20570515eR(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility, iVideoCellAbilityHp4 != null ? iVideoCellAbilityHp4.by1() : null, interfaceC583650MupX3.go1() ? interfaceC583650MupX3.Hk() : null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        lp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void CS(InterfaceC1058490deR interfaceC1058490deR) {
        this.LLJJLIIIJLLLLLLLZ.remove(interfaceC1058490deR);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void EL(InterfaceC1058490deR interfaceC1058490deR) {
        if (this.LLJJLIIIJLLLLLLLZ.contains(interfaceC1058490deR)) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ.add(interfaceC1058490deR);
    }

    public final boolean ip(Aweme aweme) {
        FakeLandscapeInfo fakeLandscapeInfo;
        Video video = aweme.getVideo();
        if (video == null || (fakeLandscapeInfo = video.getFakeLandscapeInfo()) == null || !fakeLandscapeInfo.isValid() || video.getWidth() * (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft()) <= video.getHeight() * (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1604450rr1 c1604450rr1HE0;
        this.LLLFF = new C20570115eN(this.LLJLLIL, view.findViewById(R.id.val));
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLFFI.getValue();
        if (iScreenComponentAbility != null && (c1604450rr1HE0 = iScreenComponentAbility.HE0()) != null) {
            c1604450rr1HE0.LIZIZ(new InterfaceC20561815d2<ScreenAdaptionResult>() { // from class: X.15eM
                @Override // X.InterfaceC20561815d2
                public final void LIZ(C0RAA c0raa) {
                    int screenInsetByTop;
                    ViewGroup.LayoutParams layoutParams;
                    ScreenAdaptionResult screenAdaptionResult = (ScreenAdaptionResult) c0raa;
                    C20570115eN c20570115eN = this.LIZ.LLLFF;
                    if (c20570115eN != null) {
                        if (screenAdaptionResult != null) {
                            screenInsetByTop = screenAdaptionResult.getScreenInsetByTop();
                        } else {
                            screenInsetByTop = 0;
                        }
                        View view2 = c20570115eN.LIZIZ;
                        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                            layoutParams.height = screenInsetByTop;
                            View view3 = c20570115eN.LIZIZ;
                            if (view3 != null) {
                                C786410Ut5.W5(view3, layoutParams);
                            }
                        }
                        c20570115eN.LIZJ = screenInsetByTop;
                    }
                }
            }, true, false);
        }
        final CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLLFZ.getValue();
        if (cellAdaptionComponentAbility != null) {
            cellAdaptionComponentAbility.aW0(new InterfaceC20561815d2<VideoAdaptionResult>() { // from class: X.15eL
                @Override // X.InterfaceC20561815d2
                public final void LIZ(C0RAA c0raa) {
                    int top;
                    C20570115eN c20570115eN = this.LIZ.LLLFF;
                    if (c20570115eN != null) {
                        AdaptionPaddingValues adaptionPaddingValuesN81 = cellAdaptionComponentAbility.n81();
                        boolean z = false;
                        if (adaptionPaddingValuesN81 != null) {
                            top = adaptionPaddingValuesN81.getTop();
                        } else {
                            top = 0;
                        }
                        if (C293840BfS.LIZLLL) {
                            int i = c20570115eN.LIZJ;
                            if (1 <= i && i <= top) {
                                z = true;
                            }
                            c20570115eN.LIZLLL = z;
                        }
                    }
                }
            }, true);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC583650Mup interfaceC583650MupX3;
        View viewYy0;
        View viewVy1;
        View viewBy1;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (!ep()) {
            IVideoCellAbility iVideoCellAbilityHp = hp();
            View viewHk = null;
            if (iVideoCellAbilityHp != null) {
                interfaceC583650MupX3 = iVideoCellAbilityHp.x3();
            } else {
                interfaceC583650MupX3 = null;
            }
            IVideoCellAbility iVideoCellAbilityHp2 = hp();
            if (iVideoCellAbilityHp2 != null) {
                viewYy0 = iVideoCellAbilityHp2.yy0();
            } else {
                viewYy0 = null;
            }
            IVideoCellAbility iVideoCellAbilityHp3 = hp();
            if (iVideoCellAbilityHp3 != null) {
                viewVy1 = iVideoCellAbilityHp3.Vy1();
            } else {
                viewVy1 = null;
            }
            if (interfaceC583650MupX3 == null) {
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feedPlayerView null ");
                sbLIZ.append(videoItemParams2.getAweme().getAid());
                abstractC1604130rqV.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLFFI.getValue();
            if (iScreenComponentAbility == null) {
                AbstractC1879030yzt.LIZ(AFwS221S0000000_31.get$arr$(495));
                return;
            }
            CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJLIL.getValue();
            if (cellAdaptionComponentAbility == null || cellAdaptionComponentAbility.dj2() == null) {
                AbstractC1879030yzt.LIZ(AFwS221S0000000_31.get$arr$(494));
            }
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme == null) {
                return;
            }
            lp();
            boolean zLJJIJIL = C735370Ssx.LJJIJIL(aweme);
            if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue() && ip(aweme)) {
                if (interfaceC583650MupX3.go1()) {
                    viewHk = interfaceC583650MupX3.Hk();
                }
                this.LLJJL = new C20570615eS(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility, viewYy0, viewHk);
            } else if (zLJJIJIL) {
                if (interfaceC583650MupX3.go1()) {
                    viewHk = interfaceC583650MupX3.Hk();
                }
                aweme = aweme;
                this.LLJJL = new C20570715eT(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility, viewHk);
            } else if (this.LLL) {
                IVideoCellAbility iVideoCellAbilityHp4 = hp();
                if (iVideoCellAbilityHp4 != null) {
                    viewBy1 = iVideoCellAbilityHp4.by1();
                } else {
                    viewBy1 = null;
                }
                if (interfaceC583650MupX3.go1()) {
                    viewHk = interfaceC583650MupX3.Hk();
                }
                this.LLJJL = new C20570515eR(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility, viewBy1, viewHk);
            } else {
                this.LLJJL = null;
            }
            ((AbstractC1604130rqV) this.LLJJJJLIIL.getValue()).LJIIJ("[onBind] " + this.LLJJL + ' ' + C1616490sAR.LIZIZ(aweme) + ' ' + ((Boolean) this.LLJZIJLIL.getValue()).booleanValue() + ' ' + this.LLL, aweme);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility, com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final void t1(int i, int i2) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C1616490sAR.LIZIZ(((VideoItemParams) obj).getAweme())) {
            return;
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onBottomSheetStateChanged] ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i2 == 1) {
            lp();
            mp(0L, false, true);
        }
        if (i == 2) {
            if (i2 == 4) {
                mp(0L, false, false);
            }
        } else {
            CommentService.LIZ.getClass();
            long jLLIILZL = ((long) C523420Kfs.LIZ().LLIILZL()) - 100;
            if (jLLIILZL < 0) {
                jLLIILZL = 150;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    mp(jLLIILZL, false, false);
                }
            } else {
                if (ep()) {
                    kp();
                }
                mp(0L, true, false);
            }
        }
        this.LLJLLL = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x004a, PHI: r1
      0x003e: PHI (r1v2 X.0QSJ) = (r1v1 X.0QSJ), (r1v4 X.0QSJ) binds: [B:12:0x0022, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:9:0x001c, B:11:0x0020, B:13:0x0024, B:15:0x0028, B:16:0x002e, B:20:0x0046, B:21:0x0048, B:19:0x003e), top: B:155:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mp(long r24, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkComponent.mp(long, boolean, boolean):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility, com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final void ob(float f, float f2, C20571215eY c20571215eY) {
        Object obj;
        boolean z;
        boolean z2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (!C1616490sAR.LIZIZ(aweme)) {
            return;
        }
        if (aweme.isAd()) {
            if (C1010120cOQ.LJIJI(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && C1017180cZo.LJJII(awemeRawAd)) {
                    z = true;
                } else {
                    z = false;
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && C1017180cZo.LJJIII(awemeRawAd2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    boolean z3 = c20571215eY.LJI;
                    boolean z4 = c20571215eY.LJFF;
                    if ((!C276200As6.LIZ() || !z4) && (!C276200As6.LIZ() || !z3)) {
                        return;
                    }
                }
            } else {
                boolean z5 = c20571215eY.LJI;
                boolean z6 = c20571215eY.LJFF;
                if ((C294480BgU.LIZ() < 1 || !z6) && (C294480BgU.LIZ() < 2 || !z5)) {
                    return;
                }
            }
        }
        if (f2 <= 0.0f) {
            return;
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ().LJFF()) {
            this.LLLII = true;
        }
        AbstractC20570315eP abstractC20570315eP = this.LLJJL;
        if (abstractC20570315eP != null) {
            abstractC20570315eP.LJFF(f, f2, this.LLLII, c20571215eY);
        }
        if (this.LLJJL != null) {
            Iterator<InterfaceC1058490deR> it2 = this.LLJJLIIIJLLLLLLLZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(f, f2);
            }
        }
        this.LLLII = false;
        if (f > 0.0f && f == f2) {
            this.LLJZ = f;
        }
    }
}
