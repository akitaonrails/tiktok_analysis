package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.music;

import X.C01GW;
import X.C0GU2;
import X.C0RM8;
import X.C1210704oT;
import X.C1245160iVW;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1340910kzx;
import X.C1398930mVX;
import X.C13LE;
import X.C1609930rzr;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C264010AWh;
import X.C337180DJs;
import X.C418440Gaw;
import X.C428600GrK;
import X.C438710HIf;
import X.C452501pT;
import X.C608420Ntg;
import X.C608450Ntj;
import X.C706480RnS;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725080ScM;
import X.C729510SjV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.InterfaceC1331800klG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC427850Gq7;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.BaseMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class StoryMusicCoverComponent extends BaseMusicCoverAssem<StoryMusicCoverComponent> implements InterfaceC427850Gq7 {
    public static final C1398930mVX LLLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 830));
    public C0GU2 LLL;
    public FrameLayout LLLF;
    public SmartImageView LLLFF;
    public TuxIconView LLLFFI;
    public final C01GW LLLFZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mVX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryMusicCoverComponent.class, "musicCoverVM", "getMusicCoverVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicCoverVM;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLI = new Object() { // from class: X.0mVX
        };
    }

    public StoryMusicCoverComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoMusicCoverVM.class);
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 832), null, AFwS259S0000000_21.get$arr$(227));
        this.LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(228));
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdn;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 831);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_music_cover", true, awS565S0100000_21);
    }

    public final void Up() {
        String eventType;
        C1398930mVX c1398930mVX = LLLI;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).baseFeedPageParams;
        C2189821An6 c2189821An6 = baseFeedPageParams != null ? baseFeedPageParams.param : null;
        c1398930mVX.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("story_type", C729510SjV.LJJ(aweme) ? "story" : "post");
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("enter_position", c2189821An6 != null ? C1609930rzr.LJIL(c2189821An6) : null);
        c2344009Gk.LJIIIIZZ("enter_method", "click_cover");
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        c2344009Gk.LJIIIIZZ("relation_enter_method", C729510SjV.LJJ(aweme) ? "story_immersive_anchor" : "post_immersive_anchor");
        C20684815ws.LJIILLIIL("story_music_anchor_show", c2344009Gk.LIZ);
    }

    public final int Qp() {
        return C1210704oT.LIZIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(23.5d))) : (int) getContentView().getResources().getDimension(R.dimen.ahw);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        if (C1210704oT.LIZIZ()) {
            C786410Ut5.LJLLLLLL(0, getContentView());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        if (C1210704oT.LIZIZ()) {
            C786410Ut5.LJLLLLLL(8, getContentView());
        }
    }

    public final void Tp(UrlModel urlModel) {
        Object obj;
        Object obj2;
        Object obj3;
        String uri;
        UrlModel avatarThumb;
        Object obj4;
        final boolean zLJFF = false;
        Object obj5 = null;
        if (C438710HIf.LIZ(urlModel).isEmpty()) {
            C337180DJs.LIZ(this.LLL);
            C337180DJs.LIZJ(this.LLLFFI);
            C608450Ntj c608450Ntj = C608450Ntj.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj4 = c724270Sb3.LL;
            } else {
                obj4 = null;
            }
            Aweme aweme = ((VideoItemParams) obj4).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj5 = c724270Sb32.LL;
            }
            String str = ((VideoItemParams) obj5).mEventType;
            c608450Ntj.getClass();
            C608450Ntj.LJFF(str, C608450Ntj.LIZLLL(aweme), aweme, false, false);
            return;
        }
        if (urlModel != null) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            User author = ((VideoItemParams) obj2).getAweme().getAuthor();
            if (author != null && C1245160iVW.LIZ(author)) {
                String uri2 = urlModel.getUri();
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                } else {
                    obj3 = null;
                }
                User author2 = ((VideoItemParams) obj3).getAweme().getAuthor();
                if (author2 != null && (avatarThumb = author2.getAvatarThumb()) != null) {
                    uri = avatarThumb.getUri();
                } else {
                    uri = null;
                }
                zLJFF = Intrinsics.LJFF(uri2, uri);
            }
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        int iQp = Qp();
        int iQp2 = Qp();
        c1331670kl3LJIIIIZZ.LJIIIIZZ = iQp;
        c1331670kl3LJIIIIZZ.LJIIIZ = iQp2;
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.RGB_565;
        c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIIZZ.LJJ(this.LLLFF);
        c1331670kl3LJIIIIZZ.LJJIJIL(new InterfaceC1331800klG() { // from class: X.0I7a
            @Override // X.InterfaceC1331800klG
            public final String getKey() {
                return "music_cover_adaption_for_social_avatar";
            }

            @Override // X.InterfaceC1331800klG
            public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
                try {
                    if (zLJFF && bitmap != null) {
                        if (c0i7n == null) {
                            return null;
                        }
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        C1331870klN c1331870klNLIZ = ((C1331760klC) c0i7n).LIZ(width, height, bitmap.getConfig());
                        Bitmap bitmap2 = c1331870klNLIZ.getBitmap();
                        Matrix matrix = new Matrix();
                        matrix.setScale(1.27f, 1.27f, width / 2.0f, height / 2.0f);
                        new Canvas(bitmap2).drawBitmap(bitmap, matrix, null);
                        return c1331870klNLIZ;
                    }
                    if (c0i7n == null) {
                        return null;
                    }
                    return ((C1331760klC) c0i7n).LIZIZ(bitmap);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (c0i7n == null) {
                        return null;
                    }
                    return ((C1331760klC) c0i7n).LIZIZ(bitmap);
                }
            }

            @Override // X.InterfaceC1331800klG
            public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
                return LIZIZ(bitmap, c0i7n);
            }
        });
        C608450Ntj c608450Ntj2 = C608450Ntj.LIZ;
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj = c724270Sb35.LL;
        } else {
            obj = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj5 = c724270Sb36.LL;
        }
        String str2 = ((VideoItemParams) obj5).mEventType;
        c608450Ntj2.getClass();
        c1331670kl3LJIIIIZZ.LJJJIL = new C608420Ntg(aweme2, str2);
        c1331670kl3LJIIIIZZ.LJIIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iIntValue2;
        super.onViewCreated(view);
        this.LLLF = (FrameLayout) view.findViewById(R.id.w9g);
        this.LLL = (C0GU2) view.findViewById(R.id.w9h);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.otv);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        this.LLLFF = smartImageView;
        this.LLLFFI = (TuxIconView) view.findViewById(R.id.p_u);
        if (C1210704oT.LIZIZ()) {
            FrameLayout frameLayout = this.LLLF;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(30.0d)));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(30.0d)));
                    C786410Ut5.W5(frameLayout, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            SmartImageView smartImageView2 = this.LLLFF;
            if (smartImageView2 != null) {
                ViewGroup.LayoutParams layoutParams2 = smartImageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(23.5d)));
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(23.5d)));
                    layoutParams3.gravity = 8388659;
                    layoutParams3.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.25d)));
                    layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.25d)));
                    C786410Ut5.W5(smartImageView2, layoutParams3);
                    C1331070kk5 hierarchy = smartImageView2.getHierarchy();
                    if (hierarchy != null) {
                        C1331100kk8 c1331100kk8 = new C1331100kk8();
                        c1331100kk8.LJII(C418440Gaw.LIZIZ(8));
                        c1331100kk8.LJ(C418440Gaw.LIZIZ(Double.valueOf(2.25d)), -1);
                        hierarchy.LJJIII(c1331100kk8);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            C0GU2 c0gu2 = this.LLL;
            if (c0gu2 != null) {
                c0gu2.setSwapMode(true);
            }
        }
        FrameLayout frameLayout2 = this.LLLF;
        if (frameLayout2 != null) {
            q0.LJIJ(frameLayout2, new C1340910kzx());
        }
        SmartImageView smartImageView3 = this.LLLFF;
        if (smartImageView3 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, (Context) this.LLJZIJLIL.getValue());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            smartImageView3.setPlaceholderImage(new ColorDrawable(iIntValue));
            C1331070kk5 hierarchy2 = smartImageView3.getHierarchy();
            if (hierarchy2 != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a01, (Context) this.LLJZIJLIL.getValue());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                hierarchy2.LJIJ(new ColorDrawable(iIntValue2), 5);
            }
        }
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1657);
        if (((Number) C264010AWh.LIZ.getValue()).intValue() == 1) {
            C725080ScM.LIZ().execute(new ARunnableS106S0100000_6((Object) awS553S0100000_9, 135));
        } else {
            awS553S0100000_9.invoke();
        }
        Gp(this.LLLF, null, false, false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (C1210704oT.LIZIZ()) {
            jm();
            return C0RM8.LIZ(videoItemParams);
        }
        return this.LLJLILLLLZIIL.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[PHI: r9
      0x00b0: PHI (r9v1 com.ss.android.ugc.aweme.base.model.UrlModel) = (r9v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r9v2 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:29:0x007a, B:42:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r11 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r11
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.getAweme()
            com.ss.android.ugc.aweme.music.model.Music r3 = X.C631280OpS.LIZ(r0)
            boolean r0 = com.ss.android.ugc.aweme.feed.assem.music.BaseMusicCoverAssem.Fp(r3)
            if (r0 != 0) goto L2a
            X.0GU2 r0 = r10.LLL
            X.C337180DJs.LIZ(r0)
            com.bytedance.tux.icon.TuxIconView r0 = r10.LLLFFI
            X.C337180DJs.LIZJ(r0)
        L1a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.getAweme()
            com.ss.android.ugc.aweme.music.model.Music r1 = r0.getMusic()
            if (r1 == 0) goto L29
            android.widget.FrameLayout r0 = r10.LLLF
            com.ss.android.ugc.aweme.feed.assem.music.BaseMusicCoverAssem.Ip(r0, r1)
        L29:
            return
        L2a:
            X.0GU2 r0 = r10.LLL
            X.C337180DJs.LIZJ(r0)
            com.bytedance.tux.icon.TuxIconView r0 = r10.LLLFFI
            X.C337180DJs.LIZ(r0)
            r9 = 0
            if (r3 == 0) goto L5e
            com.ss.android.ugc.aweme.music.model.MusicFusion r4 = r3.getMusicFusion()
            if (r4 == 0) goto L5f
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r0 = r4.fusedMusicInfos
            if (r0 == 0) goto L5f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.music.model.FusedMusic r0 = (com.ss.android.ugc.aweme.music.model.FusedMusic) r0
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.music
            if (r0 == 0) goto L4a
            r2.add(r0)
            goto L4a
        L5e:
            r4 = r9
        L5f:
            X.13BV r2 = X.C13BV.INSTANCE
        L61:
            java.lang.Object r2 = X.C13LP.LJJJLL(r2)
            com.ss.android.ugc.aweme.music.model.Music r2 = (com.ss.android.ugc.aweme.music.model.Music) r2
            r1 = 1
            if (r4 == 0) goto L7a
            boolean r0 = X.C631290OpT.LIZ(r4)
            if (r0 != r1) goto L7a
            if (r2 == 0) goto L7a
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.getCoverThumb()
            r10.Tp(r0)
            goto L1a
        L7a:
            if (r3 == 0) goto Lb0
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicDetailService> r4 = com.ss.android.ugc.aweme.music.service.IMusicDetailService.class
            r5 = 0
            r8 = 14
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r0 = (com.ss.android.ugc.aweme.music.service.IMusicDetailService) r0
            if (r0 == 0) goto Lac
            boolean r0 = r0.LIZ(r3)
            if (r0 != r1) goto Lac
            com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo r0 = r3.getMatchedPGCSoundInfo()
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCoverMedium()
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo r0 = r3.getMatchedPGCSoundInfo()
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r0.getCoverMedium()
        La7:
            r10.Tp(r9)
            goto L1a
        Lac:
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r3.getCoverThumb()
        Lb0:
            r10.Tp(r9)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.music.StoryMusicCoverComponent.tp(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C0GU2 c0gu2 = this.LLL;
        if (c0gu2 != null) {
            c0gu2.invalidate();
        }
    }
}
