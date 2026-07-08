package com.ss.android.ugc.aweme.api.component.videoshrink;

import X.AbstractC1604130rqV;
import X.AbstractC20571115eX;
import X.C01GW;
import X.C0A78;
import X.C1022620cia;
import X.C1558520qew;
import X.C1619980sG4;
import X.C20571215eY;
import X.C2188811AlT;
import X.C452501pT;
import X.C497820Jfg;
import X.C628500Oky;
import X.C630740Ooa;
import X.C735370Ssx;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC689860R4e;
import Y.AUListenerS261S0100000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ad.feed.component.videoshrink.ICommerceVideoShrinkAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes12.dex */
public final class CommerceVideoShrinkAbilityComponent extends BaseCellContentComponent<CommerceVideoShrinkAbilityComponent> implements ICommerceVideoShrinkAbility, InterfaceC1554640qYg {
    public AbstractC20571115eX LLJJL;
    public final ValueAnimator LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public View LLJLLIL;
    public final C630740Ooa LLJLLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS198S0000000_11.get$arr$(47));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 77));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 75));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 74));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1355104774) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final boolean I3() {
        return ((Boolean) C0A78.LIZ.getValue()).booleanValue() && this.LLJJL != null;
    }

    public final void ep() {
        AbstractC20571115eX abstractC20571115eX = this.LLJJL;
        if (abstractC20571115eX != null) {
            float f = abstractC20571115eX.LJ;
            float fLIZ = 0.0f;
            float f2 = 1.0f;
            if (f <= 0.0f || f > 10.0f) {
                f = 1.0f;
            }
            float f3 = abstractC20571115eX.LJFF;
            if (f3 > 0.0f && f3 <= 10.0f) {
                f2 = f3;
            }
            if (abstractC20571115eX.LIZ() >= -2000.0f && abstractC20571115eX.LIZ() <= 2000.0f) {
                fLIZ = abstractC20571115eX.LIZ();
            }
            View videoView = abstractC20571115eX.LIZIZ.getVideoView();
            if (videoView != null) {
                C786410Ut5.Ob(videoView, f);
                C786410Ut5.pc(videoView, f2);
                C786410Ut5.ed(videoView, fLIZ);
            }
            View view = abstractC20571115eX.LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, f);
                C786410Ut5.pc(view, f2);
                C786410Ut5.ed(view, fLIZ);
            }
        }
    }

    public CommerceVideoShrinkAbilityComponent() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(100L);
        valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        this.LLJLILLLLZIIL = valueAnimator;
        this.LLJLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(87));
        this.LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 76));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ep();
        ((AbstractC1604130rqV) this.LLJJJJLIIL.getValue()).LJIIIZ("onHolderUnselected");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        C1022620cia.LJ("CommerceShrinkComponent", "on in active");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        View viewFindViewById = view.findViewById(R.id.val);
        int iLIZJ = 0;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        } else {
            viewFindViewById = null;
        }
        this.LLJLLIL = viewFindViewById;
        Context context = getContext();
        if (context != null) {
            iLIZJ = C497820Jfg.LIZJ(context);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = iLIZJ;
            View view3 = this.LLJLLIL;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        final InterfaceC583650Mup interfaceC583650MupX3;
        final Aweme aweme;
        AbstractC20571115eX abstractC20571115eX;
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        VideoItemParams videoItemParams2 = videoItemParams;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        final View viewVy1 = null;
        if (iVideoCellAbility != null) {
            interfaceC583650MupX3 = iVideoCellAbility.x3();
        } else {
            interfaceC583650MupX3 = null;
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iVideoCellAbility2 != null) {
            viewVy1 = iVideoCellAbility2.Vy1();
        }
        if (interfaceC583650MupX3 == null) {
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feedPlayerView null ");
            sbLIZ.append(videoItemParams2.getAweme().getAid());
            abstractC1604130rqV.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        final IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLJLLL.getValue();
        if (iScreenComponentAbility == null || (aweme = videoItemParams2.getAweme()) == null) {
            return;
        }
        ep();
        boolean zLJJIJIL = C735370Ssx.LJJIJIL(aweme);
        if (((Boolean) this.LLJLL.getValue()).booleanValue() && (video = aweme.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null && fakeLandscapeInfo.isValid() && video.getWidth() * (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft()) > video.getHeight() * (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop())) {
            abstractC20571115eX = new AbstractC20571115eX(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility) { // from class: X.15eU
                public final C01GW LJIIIIZZ;
                public float LJIIJ;
                public float LJIIJJI;
                public boolean LJIILIIL;
                public final C01GW LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(387));
                public final boolean LJIIL = C0BXF.LIZ();

                @Override // X.AbstractC20571115eX
                public final void LIZJ(float f, float f2, boolean z) {
                    View videoView;
                    ViewGroup viewGroupZt1;
                    RectF rectF;
                    View videoView2;
                    if ((!this.LJIILIIL || z) && (videoView = this.LIZIZ.getVideoView()) != null && (viewGroupZt1 = this.LIZIZ.zt1()) != null) {
                        this.LJIILIIL = true;
                        Video video2 = this.LIZ.getVideo();
                        if (video2 != null) {
                            FakeLandscapeInfo fakeLandscapeInfo2 = video2.getFakeLandscapeInfo();
                            int height = videoView.getHeight();
                            int height2 = viewGroupZt1.getHeight();
                            PillarBoxVideoInfo pillarBoxVideoInfo = video2.getPillarBoxVideoInfo();
                            if (pillarBoxVideoInfo == null) {
                                rectF = new RectF(fakeLandscapeInfo2.getLeft(), fakeLandscapeInfo2.getTop(), fakeLandscapeInfo2.getRight(), fakeLandscapeInfo2.getBottom());
                            } else {
                                RectF rectFLIZIZ = C1074904Ih.LIZIZ(pillarBoxVideoInfo);
                                float left = fakeLandscapeInfo2.getLeft();
                                float f3 = rectFLIZIZ.left;
                                if (left < f3) {
                                    left = f3;
                                }
                                float top = fakeLandscapeInfo2.getTop();
                                float f4 = rectFLIZIZ.top;
                                if (top < f4) {
                                    top = f4;
                                }
                                float right = fakeLandscapeInfo2.getRight();
                                float f5 = rectFLIZIZ.right;
                                if (right > f5) {
                                    right = f5;
                                }
                                float bottom = fakeLandscapeInfo2.getBottom();
                                float f6 = rectFLIZIZ.bottom;
                                if (bottom > f6) {
                                    bottom = f6;
                                }
                                rectF = new RectF(left, top, right, bottom);
                            }
                            float f7 = rectF.bottom;
                            float f8 = rectF.top;
                            this.LJIIJ = (f7 - f8) * height;
                            this.LJIIJJI = ((f7 + f8) / 2.0f) * height2;
                        }
                    }
                    ViewGroup viewGroupZt12 = this.LIZIZ.zt1();
                    if (viewGroupZt12 == null || (videoView2 = this.LIZIZ.getVideoView()) == null) {
                        return;
                    }
                    int height3 = (viewGroupZt12.getHeight() - viewGroupZt12.getPaddingTop()) - viewGroupZt12.getPaddingBottom();
                    float f9 = this.LJIIJ;
                    float f10 = height3;
                    float fLIZIZ = (f10 - (f2 - C14LC.LJIILLIIL)) - LIZIZ();
                    if (f9 != 0.0f && f2 != 0.0f) {
                        float fLIZLLL = fLIZIZ / f9;
                        if (!this.LJIIL) {
                            fLIZLLL = C13LZ.LIZLLL(fLIZLLL, 0.0f, 1.0f);
                        }
                        float f11 = f / f2;
                        float f12 = 1;
                        float f13 = ((fLIZLLL - f12) * f11) + 1.0f;
                        float f14 = this.LJIIJJI;
                        float fLIZ = LIZ() - ((((f14 + (((f10 / 2.0f) - f14) * (f12 - fLIZLLL))) - (fLIZIZ / 2.0f)) - LIZIZ()) * f11);
                        C786410Ut5.Ob(videoView2, f13);
                        C786410Ut5.pc(videoView2, f13);
                        C786410Ut5.ed(videoView2, fLIZ);
                        View view = this.LIZJ;
                        if (view != null) {
                            C786410Ut5.Ob(view, f13);
                            C786410Ut5.pc(view, f13);
                            C786410Ut5.ed(view, fLIZ);
                        }
                        if (f11 == 1.0f || f11 == 0.0f) {
                            ((AbstractC1604130rqV) this.LJIIIZ.getValue()).LJIIIZ("fakelandscape " + f13 + ' ' + videoView2.getTranslationY() + ' ' + f9 + ' ' + fLIZIZ + ' ' + f2);
                        }
                    }
                }

                {
                    this.LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(interfaceC583650MupX3, 1378));
                }
            };
        } else if (zLJJIJIL) {
            abstractC20571115eX = new AbstractC20571115eX(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility) { // from class: X.15eW
                public final C01GW LJIIIIZZ;
                public final C01GW LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(389));
                public final boolean LJIIJ = C0BXF.LIZ();
                public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(388));
                public float LJIIL;
                public float LJIILIIL;
                public boolean LJIILJJIL;

                @Override // X.AbstractC20571115eX
                public final void LIZJ(float f, float f2, boolean z) {
                    View videoView;
                    ViewGroup viewGroupZt1;
                    View videoView2;
                    if ((!this.LJIILJJIL || z) && (videoView = this.LIZIZ.getVideoView()) != null && (viewGroupZt1 = this.LIZIZ.zt1()) != null) {
                        this.LJIILJJIL = true;
                        int height = videoView.getHeight();
                        int height2 = viewGroupZt1.getHeight();
                        Video video2 = this.LIZ.getVideo();
                        if (video2 != null) {
                            PillarBoxVideoInfo pillarBoxVideoInfo = video2.getPillarBoxVideoInfo();
                            if (((Boolean) this.LJIIJJI.getValue()).booleanValue() && pillarBoxVideoInfo != null && C1074904Ih.LIZ(pillarBoxVideoInfo)) {
                                RectF rectFLIZIZ = C1074904Ih.LIZIZ(pillarBoxVideoInfo);
                                float f3 = rectFLIZIZ.bottom;
                                float f4 = rectFLIZIZ.top;
                                float f5 = height;
                                this.LJIIL = (f3 - f4) * f5;
                                this.LJIILIIL = (((f3 + f4) * f5) / 2.0f) + ((height2 - height) / 2.0f);
                            } else {
                                this.LJIIL = height;
                                this.LJIILIIL = height2 / 2.0f;
                            }
                        }
                    }
                    ViewGroup viewGroupZt12 = this.LIZIZ.zt1();
                    if (viewGroupZt12 == null || (videoView2 = this.LIZIZ.getVideoView()) == null) {
                        return;
                    }
                    int height3 = viewGroupZt12.getHeight();
                    float f6 = this.LJIIL;
                    if (f2 > 0.0f && f6 > 0.0f) {
                        float f7 = height3;
                        float fLIZIZ = (f7 - (f2 - C14LC.LJIILLIIL)) - LIZIZ();
                        float fLIZLLL = fLIZIZ / f6;
                        if (!this.LJIIJ) {
                            fLIZLLL = C13LZ.LIZLLL(fLIZLLL, 0.0f, 1.0f);
                        }
                        float f8 = this.LJIILIIL;
                        float f9 = 1;
                        float fLIZIZ2 = ((f8 + (((f7 / 2.0f) - f8) * (f9 - fLIZLLL))) - (fLIZIZ / 2.0f)) - LIZIZ();
                        float f10 = f / f2;
                        float f11 = ((fLIZLLL - f9) * f10) + 1.0f;
                        float fLIZ = LIZ() - (fLIZIZ2 * f10);
                        C786410Ut5.Ob(videoView2, f11);
                        C786410Ut5.pc(videoView2, f11);
                        C786410Ut5.ed(videoView2, fLIZ);
                        View view = this.LIZJ;
                        if (view != null) {
                            C786410Ut5.Ob(view, f11);
                            C786410Ut5.pc(view, f11);
                            C786410Ut5.ed(view, fLIZ);
                        }
                        if (f10 == 1.0f || f10 == 0.0f) {
                            ((AbstractC1604130rqV) this.LJIIIZ.getValue()).LJIIIZ("landscape " + f11 + ' ' + videoView2.getTranslationY() + ' ' + f6 + ' ' + fLIZIZ + ' ' + f2);
                        }
                    }
                }

                {
                    this.LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(interfaceC583650MupX3, 1379));
                }
            };
        } else {
            abstractC20571115eX = new AbstractC20571115eX(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility) { // from class: X.15eV
                public final C01GW LJIIIIZZ;
                public final C01GW LJIIIZ;
                public final boolean LJIIJ;
                public final C01GW LJIIJJI;
                public boolean LJIIL;
                public float LJIILIIL;
                public float LJIILJJIL;

                @Override // X.AbstractC20571115eX
                public final void LIZJ(float f, float f2, boolean z) {
                    View videoView;
                    ViewGroup viewGroupZt1;
                    ViewGroup viewGroupZt12;
                    if ((!this.LJIIL || z) && (videoView = this.LIZIZ.getVideoView()) != null && (viewGroupZt1 = this.LIZIZ.zt1()) != null) {
                        this.LJIIL = true;
                        int height = videoView.getHeight();
                        int height2 = viewGroupZt1.getHeight();
                        Video video2 = this.LIZ.getVideo();
                        if (video2 != null) {
                            PillarBoxVideoInfo pillarBoxVideoInfo = video2.getPillarBoxVideoInfo();
                            if (((Boolean) this.LJIIJJI.getValue()).booleanValue() && pillarBoxVideoInfo != null && C1074904Ih.LIZ(pillarBoxVideoInfo)) {
                                RectF rectFLIZIZ = C1074904Ih.LIZIZ(pillarBoxVideoInfo);
                                float f3 = rectFLIZIZ.bottom;
                                float f4 = rectFLIZIZ.top;
                                this.LJIILIIL = (f3 - f4) * height;
                                this.LJIILJJIL = ((f3 + f4) / 2.0f) * height2;
                            } else {
                                this.LJIILIIL = height;
                                this.LJIILJJIL = height2 / 2.0f;
                            }
                        }
                    }
                    View videoView2 = this.LIZIZ.getVideoView();
                    if (videoView2 == null || (viewGroupZt12 = this.LIZIZ.zt1()) == null) {
                        return;
                    }
                    int height3 = (viewGroupZt12.getHeight() - viewGroupZt12.getPaddingTop()) - viewGroupZt12.getPaddingBottom();
                    float f5 = this.LJIILIIL;
                    int i = C14LC.LJIILLIIL;
                    if (f5 > 0.0f && f2 > 0.0f) {
                        float f6 = height3;
                        float f7 = f2 - i;
                        if (f7 < 0.0f) {
                            f7 = 0.0f;
                        }
                        float fLIZIZ = (f6 - f7) - LIZIZ();
                        if (this.LJIIJ) {
                            fLIZIZ *= 1.3333334f;
                        }
                        float f8 = fLIZIZ / f5;
                        float f9 = this.LJIILJJIL;
                        float f10 = 1;
                        float fLIZIZ2 = ((f9 + (((f6 / 2.0f) - f9) * (f10 - f8))) - (fLIZIZ / 2.0f)) - LIZIZ();
                        if (this.LJIIJ) {
                            fLIZIZ2 *= 1.1666666f;
                        }
                        float f11 = f / f2;
                        float f12 = f10 + ((f8 - f10) * f11);
                        float fLIZ = LIZ() - ((LIZ() + fLIZIZ2) * f11);
                        C786410Ut5.Ob(videoView2, f12);
                        C786410Ut5.pc(videoView2, f12);
                        C786410Ut5.ed(videoView2, fLIZ);
                        View view = this.LIZJ;
                        if (view != null) {
                            C786410Ut5.Ob(view, f12);
                            C786410Ut5.pc(view, f12);
                            C786410Ut5.ed(view, fLIZ);
                        }
                        if (f11 == 1.0f || f11 == 0.0f) {
                            ((AbstractC1604130rqV) this.LJIIIZ.getValue()).LJIIIZ("portrait " + f12 + ' ' + videoView2.getTranslationY() + ' ' + fLIZIZ + ' ' + fLIZIZ2 + ' ' + LIZ() + ' ' + f2);
                        }
                    }
                }

                {
                    PillarBoxVideoInfo pillarBoxVideoInfo;
                    super(aweme, interfaceC583650MupX3, viewVy1, iScreenComponentAbility);
                    this.LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(interfaceC583650MupX3, 1380));
                    this.LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(391));
                    this.LJIIJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(390));
                    if (C287450BOl.LIZ()) {
                        Video video2 = aweme.getVideo();
                        boolean z = false;
                        if (video2 != null && video2.getWidth() != 0 && (((pillarBoxVideoInfo = video2.getPillarBoxVideoInfo()) == null || !C1074904Ih.LIZ(pillarBoxVideoInfo)) && video2.getHeight() / video2.getWidth() >= 1.3333334f)) {
                            z = true;
                        }
                        this.LJIIJ = z;
                    }
                }
            };
        }
        this.LLJJL = abstractC20571115eX;
        AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onBind] ");
        sbLIZ2.append(this.LLJJL);
        sbLIZ2.append(' ');
        sbLIZ2.append(((Boolean) this.LLJLL.getValue()).booleanValue());
        abstractC1604130rqV2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final void t1(int i, int i2) {
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJJJLIIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onBottomSheetStateChanged] ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i2 == 1) {
            ep();
            hp(this, false, true, 0L, 4);
        }
        if (i == 2) {
            if (i2 == 4) {
                hp(this, false, false, 0L, 6);
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                hp(this, false, false, 150L, 2);
                return;
            }
            hp(this, true, false, 0L, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.VideoCommonShrinkAbility
    public final void ob(float f, float f2, C20571215eY c20571215eY) {
        AbstractC20571115eX abstractC20571115eX;
        if (f2 > 0.0f && (abstractC20571115eX = this.LLJJL) != null) {
            abstractC20571115eX.LIZJ(f, f2, false);
        }
    }

    public static void hp(CommerceVideoShrinkAbilityComponent commerceVideoShrinkAbilityComponent, boolean z, boolean z2, long j, int i) {
        float f;
        InterfaceC689860R4e interfaceC689860R4eK9;
        long j2 = j;
        boolean z3 = z2;
        if ((i & 2) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            j2 = 0;
        }
        if (commerceVideoShrinkAbilityComponent.LLJJL != null) {
            ValueAnimator valueAnimatorClone = commerceVideoShrinkAbilityComponent.LLJLILLLLZIIL.clone();
            valueAnimatorClone.setStartDelay(j2);
            ICellCleanAbility iCellCleanAbility = (ICellCleanAbility) commerceVideoShrinkAbilityComponent.LLJLIL.getValue();
            if (iCellCleanAbility != null) {
                iCellCleanAbility.Xk(valueAnimatorClone, "commerce_shrink", z, true, true, z3);
            }
            IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) commerceVideoShrinkAbilityComponent.LLJL.getValue();
            if (iFeedCleanAbility != null) {
                iFeedCleanAbility.Xk(valueAnimatorClone, "commerce_shrink", z, z3, true, false);
            }
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) commerceVideoShrinkAbilityComponent.LLJJLIIIJLLLLLLLZ.getValue();
            if (iVideoCellAbility != null && (interfaceC689860R4eK9 = iVideoCellAbility.K9()) != null) {
                interfaceC689860R4eK9.LLJJ(z, true);
            }
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) commerceVideoShrinkAbilityComponent.LLJJJJLIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[toggleClean] ");
            sbLIZ.append(z);
            sbLIZ.append(" immediately: ");
            sbLIZ.append(z3);
            abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            boolean z4 = !z;
            float f2 = 1.0f;
            if (z3) {
                if (z4) {
                    f2 = 0.0f;
                }
                View view = commerceVideoShrinkAbilityComponent.LLJLLIL;
                if (view != null) {
                    C786410Ut5.T4(view, f2);
                    return;
                }
                return;
            }
            float[] fArr = new float[2];
            if (z4) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            if (z4) {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setDuration(commerceVideoShrinkAbilityComponent.LLJLILLLLZIIL.getDuration());
            valueAnimatorOfFloat.setInterpolator(commerceVideoShrinkAbilityComponent.LLJLILLLLZIIL.getInterpolator());
            valueAnimatorOfFloat.setStartDelay(j2);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS261S0100000_11(commerceVideoShrinkAbilityComponent, 11));
            valueAnimatorOfFloat.start();
        }
    }
}
