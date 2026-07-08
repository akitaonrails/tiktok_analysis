package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C01GW;
import X.C086I;
import X.C0R6E;
import X.C0R93;
import X.C0R9P;
import X.C0T1R;
import X.C1299020juO;
import X.C1324810kZz;
import X.C1325710kbR;
import X.C1328130kfL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1483410ohn;
import X.C1558520qew;
import X.C1779306xz;
import X.C2344809Gs;
import X.C339190DRl;
import X.C438710HIf;
import X.C452501pT;
import X.C609820Nvw;
import X.C628500Oky;
import X.C630740Ooa;
import X.C692910RFx;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729980SkG;
import X.C745420TLw;
import X.C786410Ut5;
import X.EnumC1334360kpO;
import X.EnumC714850S2h;
import X.InterfaceC665370Q7z;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.sub.component.FeedVideoPlayerViewAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideVideoComponent extends BaseCellContentComponent<StoryGuideVideoComponent> implements StoryVideoAbility {
    public FrameLayout LLJJJJLIIL;
    public SmartImageView LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public ARunnableS78S0200000_9 LLJLILLLLZIIL;
    public boolean LLJL = true;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(314));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(AFwS198S0000000_11.get$arr$(156));
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 679));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS553S0100000_9(this, 1471));

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void G() {
        SmartImageView smartImageView = this.LLJJL;
        if (smartImageView != null) {
            C339190DRl.LIZIZ(smartImageView);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ((Handler) this.LLJLIL.getValue()).removeCallbacksAndMessages(null);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryVideoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void LLI() throws Throwable {
        BaseFeedPlayerView baseFeedPlayerViewE;
        try {
            Context context = getContext();
            if (context != null) {
                C692910RFx.LIZLLL(context);
                ep(this.LLJJL);
                FeedVideoPlayerViewAbility feedVideoPlayerViewAbility = (FeedVideoPlayerViewAbility) this.LLJLLIL.getValue();
                ep((feedVideoPlayerViewAbility == null || (baseFeedPlayerViewE = feedVideoPlayerViewAbility.E()) == null) ? null : baseFeedPlayerViewE.getVideoView());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryVideoAbility.class, null, null);
        }
    }

    public final void Er1(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C1299020juO.LIZLLL(C729980SkG.LIZJ(((VideoItemParams) obj).getAweme()), str);
        if (!this.LLJL) {
            SmartImageView smartImageView = this.LLJJL;
            if (smartImageView != null) {
                C339190DRl.LIZIZ(smartImageView);
                return;
            }
            return;
        }
        SmartImageView smartImageView2 = this.LLJJL;
        if (smartImageView2 != null) {
            C339190DRl.LIZLLL(smartImageView2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void LJJIJIIJI(String str) throws Throwable {
        Object obj;
        Object obj2;
        int width;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Video video;
        UrlModel originCover;
        Video video2;
        Video video3;
        Video video4;
        Video video5;
        this.LLJJLIIIJLLLLLLLZ = true;
        SmartImageView smartImageView = this.LLJJL;
        if (smartImageView != null) {
            C339190DRl.LIZIZ(smartImageView);
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj7 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null && aweme.getVideo() != null) {
            int videoWidth = C1483410ohn.LJLJJI().getVideoWidth();
            int videoHeight = C1483410ohn.LJLJJI().getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
                int height = 0;
                if (aweme2 != null && (video5 = aweme2.getVideo()) != null) {
                    width = video5.getWidth();
                } else {
                    width = 0;
                }
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme3 = ((VideoItemParams) obj3).getAweme();
                if (aweme3 != null && (video4 = aweme3.getVideo()) != null) {
                    height = video4.getHeight();
                }
                int iLIZ = C745420TLw.LIZ(width, height, videoWidth, videoHeight);
                if (iLIZ != 0 && iLIZ <= 1) {
                    C724270Sb3 c724270Sb34 = this.LLJI;
                    if (c724270Sb34 != null) {
                        obj4 = c724270Sb34.LL;
                    } else {
                        obj4 = null;
                    }
                    Aweme aweme4 = ((VideoItemParams) obj4).getAweme();
                    if (aweme4 != null && aweme4.getVideo() != null) {
                        C724270Sb3 c724270Sb35 = this.LLJI;
                        if (c724270Sb35 != null) {
                            obj5 = c724270Sb35.LL;
                        } else {
                            obj5 = null;
                        }
                        Aweme aweme5 = ((VideoItemParams) obj5).getAweme();
                        if (aweme5 != null && (video3 = aweme5.getVideo()) != null) {
                            video3.setWidth(videoWidth);
                        }
                        C724270Sb3 c724270Sb36 = this.LLJI;
                        if (c724270Sb36 != null) {
                            obj6 = c724270Sb36.LL;
                        } else {
                            obj6 = null;
                        }
                        Aweme aweme6 = ((VideoItemParams) obj6).getAweme();
                        if (aweme6 != null && (video2 = aweme6.getVideo()) != null) {
                            video2.setHeight(videoHeight);
                        }
                        C724270Sb3 c724270Sb37 = this.LLJI;
                        if (c724270Sb37 != null) {
                            obj7 = c724270Sb37.LL;
                        }
                        Aweme aweme7 = ((VideoItemParams) obj7).getAweme();
                        if (aweme7 != null && (video = aweme7.getVideo()) != null && (originCover = video.getOriginCover()) != null) {
                            originCover.setWidth(videoWidth);
                            originCover.setHeight(videoHeight);
                        }
                        LLI();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void LLLLIL(Aweme aweme) {
        SmartImageView smartImageView = this.LLJJL;
        if (smartImageView != null) {
            C0R6E.LIZ(smartImageView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[PHI: r1
      0x00bd: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v4 int), (r1v4 int) binds: [B:39:0x008f, B:40:0x0091, B:47:0x00b4, B:48:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideVideoComponent.ep(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onBuffering(boolean z) {
        String str;
        Object obj;
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams == null || (str = baseFeedPageParams.eventType) == null) {
            str = "";
        }
        boolean zLIZLLL = C0R93.LIZLLL(str);
        boolean zLIZIZ = C0R93.LIZIZ(str);
        boolean zLIZ = C0R93.LIZ(str);
        if (zLIZLLL || zLIZIZ || zLIZ) {
            if (z) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                ARunnableS78S0200000_9 aRunnableS78S0200000_9 = new ARunnableS78S0200000_9(this, ((VideoItemParams) obj).getAweme(), 41);
                this.LLJLILLLLZIIL = aRunnableS78S0200000_9;
                C0R9P c0r9p = C0R9P.LIZ;
                AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(this, aRunnableS78S0200000_9, 65);
                c0r9p.getClass();
                C0R9P.LJ(awS410S0200000_9);
                return;
            }
            ARunnableS78S0200000_9 aRunnableS78S0200000_92 = this.LLJLILLLLZIIL;
            if (aRunnableS78S0200000_92 == null) {
                return;
            }
            ((Handler) this.LLJLIL.getValue()).removeCallbacks(aRunnableS78S0200000_92);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onPreparePlay(String str) {
        Er1("onPreparePlay");
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onResumePlay(String str) {
        SmartImageView smartImageView;
        if (this.LLJJLIIIJLLLLLLLZ) {
            SmartImageView smartImageView2 = this.LLJJL;
            if (smartImageView2 != null) {
                C339190DRl.LIZIZ(smartImageView2);
                return;
            }
            return;
        }
        SmartImageView smartImageView3 = this.LLJJL;
        if (smartImageView3 == null || smartImageView3.getVisibility() != 0 || (smartImageView = this.LLJJL) == null) {
            return;
        }
        C339190DRl.LIZIZ(smartImageView);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = (FrameLayout) view.findViewById(R.id.player_view);
        this.LLJJL = (SmartImageView) view.findViewById(R.id.cover);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) throws Throwable {
        Video video;
        UrlModel originCover;
        Object obj;
        C1325710kbR c1325710kbRLIZ;
        this.LLJJLIIIJLLLLLLLZ = false;
        Aweme aweme = videoItemParams.getAweme();
        Object obj2 = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        this.LLJL = true;
        LLI();
        Er1("bindCoverImage");
        if (video != null && video.getPlayAddr() != null && !C086I.LIZIZ(video.getPlayAddr().getUrlList()) && (originCover = video.getOriginCover()) != null && originCover.getUrlList() != null && !originCover.getUrlList().isEmpty()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C1779306xz.LJI(((VideoItemParams) obj).getAweme())) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                if (C729980SkG.LJI(((VideoItemParams) obj2).getAweme())) {
                    SmartImageView smartImageView = this.LLJJL;
                    if (smartImageView != null) {
                        C0R6E.LIZIZ(smartImageView, smartImageView.getContext(), R.drawable.cg7);
                    }
                } else {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getOriginCover()));
                    if (C609820Nvw.LIZ && (!video.getOriginCover().getUrlList().isEmpty()) && (c1325710kbRLIZ = C1325710kbR.LIZ(UriProtector.parse((String) ListProtector.get(video.getOriginCover().getUrlList(), 0)))) != null) {
                        C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                        c1324810kZzLJI.getClass();
                        if (C1328130kfL.LJIILIIL().LJIJJ().LJII(c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ))) {
                            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                        }
                    }
                    SmartImageView smartImageView2 = this.LLJJL;
                    if (smartImageView2 != null) {
                        c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
                        c1331670kl3LJIIIIZZ.LIZLLL("StoryGuideCardVideoCpt");
                        c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    }
                }
                this.LLJL = true;
                return;
            }
            SmartImageView smartImageView3 = this.LLJJL;
            if (smartImageView3 != null) {
                C339190DRl.LIZIZ(smartImageView3);
            }
            this.LLJL = false;
            SmartImageView smartImageView4 = this.LLJJL;
            if (smartImageView4 == null) {
                return;
            }
            C0R6E.LIZIZ(smartImageView4, smartImageView4.getContext(), R.drawable.bb4);
            return;
        }
        SmartImageView smartImageView5 = this.LLJJL;
        if (smartImageView5 == null) {
            return;
        }
        C0R6E.LIZIZ(smartImageView5, smartImageView5.getContext(), R.drawable.cg7);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        IViewPagerComponentAbility iViewPagerComponentAbilityLIZLLL;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iViewPagerComponentAbilityLIZLLL = C0T1R.LIZLLL(fragmentLJI)) != null && iViewPagerComponentAbilityLIZLLL.Mo1(i)) {
            return;
        }
        Er1("onViewHolderSelected");
    }
}
