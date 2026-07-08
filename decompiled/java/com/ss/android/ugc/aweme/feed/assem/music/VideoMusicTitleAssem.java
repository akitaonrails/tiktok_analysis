package com.ss.android.ugc.aweme.feed.assem.music;

import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C07PC;
import X.C098200Yq;
import X.C09MT;
import X.C09R3;
import X.C09RF;
import X.C09RG;
import X.C09RH;
import X.C0BAC;
import X.C0C64;
import X.C0CCT;
import X.C0H1U;
import X.C0P0X;
import X.C0P11;
import X.C0P1J;
import X.C0P1K;
import X.C0P1L;
import X.C0P1M;
import X.C0P1N;
import X.C0P1P;
import X.C0P1Q;
import X.C0P1U;
import X.C0P1Y;
import X.C0P2Y;
import X.C0PEM;
import X.C0R93;
import X.C0RD6;
import X.C0RJN;
import X.C0RPN;
import X.C0RR7;
import X.C123100dR;
import X.C1360330lVH;
import X.C1389300mG0;
import X.C1398450mUl;
import X.C1398490mUp;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1589640rT8;
import X.C1599640rjG;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1744700vVE;
import X.C1848410yCV;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1A5L;
import X.C2041907zF;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2140508a3;
import X.C2140808a6;
import X.C21459118yT;
import X.C2189821An6;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2487409ou;
import X.C269330Ah1;
import X.C277080AtW;
import X.C297140Bkm;
import X.C300940Bqu;
import X.C300980Bqy;
import X.C418440Gaw;
import X.C452501pT;
import X.C608480Ntm;
import X.C608490Ntn;
import X.C609250Nv1;
import X.C609260Nv2;
import X.C610010NwF;
import X.C631050Op5;
import X.C631060Op6;
import X.C631070Op7;
import X.C631140OpE;
import X.C631280OpS;
import X.C631290OpT;
import X.C631320OpW;
import X.C632780Ors;
import X.C633020OsG;
import X.C637820P0a;
import X.C637830P0b;
import X.C637840P0c;
import X.C637850P0d;
import X.C637860P0e;
import X.C637870P0f;
import X.C637880P0g;
import X.C637890P0h;
import X.C637910P0j;
import X.C637930P0l;
import X.C637940P0m;
import X.C637950P0n;
import X.C637960P0o;
import X.C637970P0p;
import X.C637990P0r;
import X.C638000P0s;
import X.C638010P0t;
import X.C638020P0u;
import X.C638030P0v;
import X.C638040P0w;
import X.C638050P0x;
import X.C638060P0y;
import X.C638070P0z;
import X.C638110P1d;
import X.C652090Phv;
import X.C690870R8b;
import X.C693770RJf;
import X.C694180RKu;
import X.C694320RLi;
import X.C695730RQt;
import X.C698920RbG;
import X.C699500RcC;
import X.C700450Rdj;
import X.C708910RrN;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC587920N4c;
import X.EnumC631120OpC;
import X.EnumC631300OpU;
import X.EnumC631330OpX;
import X.EnumC700430Rdh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC698960RbK;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import avg.f;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.artistprofile.VideoMusicCacheDataVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.cell.FriendsV3CellTrackAbility;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AppleMusicToken;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.FusedMusic;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDiscoveryInfo;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicPromoTagInfo;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes10.dex */
public class VideoMusicTitleAssem extends BaseCellSlotComponent<VideoMusicTitleAssem> implements MusicTitleAbility, ComponentPriorityProtocol, C0RPN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C638000P0s(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C637990P0r(this));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 131));
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public TuxIconView LLLII;
    public C21459118yT LLLIIII;
    public TuxTextView LLLIIIIL;
    public LinearLayout LLLIIIL;
    public TuxTextView LLLIIL;
    public ImageView LLLIILIL;
    public TuxTextView LLLIL;
    public LinearLayout LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public C637880P0g LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public C638040P0w LLLLIILL;
    public Integer LLLLIILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoMusicTitleAssem.class, "musicTitleVM", "getMusicTitleVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicTitleVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoMusicTitleAssem.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(VideoMusicTitleAssem.class, "videoMusicCacheDataVM", "getVideoMusicCacheDataVM()Lcom/ss/android/ugc/aweme/feed/assem/music/artistprofile/VideoMusicCacheDataVM;", 0);
        c09r3.getClass();
        LLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public VideoMusicTitleAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoMusicTitleVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new C09RH(c19719912DlLIZ), null, new C0P1J());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoMusicBaseVM.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), null, c1637906bB, new C09RF(c19719912DlLIZ2), null, new C0P1Q());
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(new C0P11());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(VideoMusicCacheDataVM.class);
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ, new C09RG(c19719912DlLIZ3), null, new C0P1K());
        this.LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0P1L());
        this.LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C0P1M());
        this.LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C0P1N());
        this.LLLI = C452501pT.LIZIZ(new C638010P0t(this));
        this.LLLJL = C452501pT.LIZIZ(new C0P1P());
        this.LLLL = C452501pT.LIZIZ(new C637870P0f(this));
        this.LLLLII = C452501pT.LIZIZ(new C637930P0l(this));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new C637960P0o(this));
        this.LLLLIIL = C452501pT.LIZIZ(new C09MT(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_music_info";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_6;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, VideoCellScope.class, this, InteractInfoMusicTitleAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility
    public final boolean Ao0() {
        if (((Number) C269330Ah1.LIZ.getValue()).intValue() == 0) {
            return Gp();
        }
        MusicCapsuleConfig musicCapsuleConfig = C1398490mUp.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        Context context = getContext();
        VideoMusicCacheDataVM videoMusicCacheDataVMFq = fq();
        C724270Sb3 c724270Sb32 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        Integer num = videoMusicCacheDataVMFq.LLILLJJLI.get(aid);
        C724270Sb3 c724270Sb33 = this.LLJI;
        return C1398490mUp.LIZIZ(aweme, context, num) || pq();
    }

    public final void Fp() {
        LinearLayout.LayoutParams layoutParams;
        C698920RbG c698920RbGRy0;
        C698920RbG c698920RbGRy02;
        C698920RbG c698920RbGRy03;
        C698920RbG c698920RbGRy04;
        C698920RbG c698920RbGRy05;
        C698920RbG c698920RbGRy06;
        LinearLayout linearLayout = this.LLLIIIL;
        ViewParent parent = linearLayout != null ? linearLayout.getParent() : null;
        if (parent instanceof C708910RrN) {
            C708910RrN c708910RrN = (C708910RrN) parent;
            ViewGroup.LayoutParams layoutParams2 = c708910RrN.getLayoutParams();
            if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
                return;
            }
            int i = layoutParams.bottomMargin;
            this.LLLLIILLL = Integer.valueOf(i);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (!Gq(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                Bq(c708910RrN, layoutParams);
                return;
            }
            if (i > 0) {
                C0RJN c0rjnLIZIZ = jm().LIZIZ();
                C19EG c19egLIZ = c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZ() : null;
                C724270Sb3 c724270Sb32 = this.LLJI;
                String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme(), str)) {
                    C638040P0w c638040P0w = this.LLLLIILL;
                    if (c638040P0w != null) {
                        InteractAreaCommonAbility interactAreaCommonAbilityUp = Up();
                        if (interactAreaCommonAbilityUp != null && (c698920RbGRy06 = interactAreaCommonAbilityUp.Ry0()) != null) {
                            c698920RbGRy06.LIZIZ(this.LLLIIL, c638040P0w);
                        }
                        InteractAreaCommonAbility interactAreaCommonAbilityUp2 = Up();
                        if (interactAreaCommonAbilityUp2 != null && (c698920RbGRy05 = interactAreaCommonAbilityUp2.Ry0()) != null) {
                            c698920RbGRy05.LIZIZ(this.LLLIILIL, c638040P0w);
                        }
                        InteractAreaCommonAbility interactAreaCommonAbilityUp3 = Up();
                        if (interactAreaCommonAbilityUp3 != null && (c698920RbGRy04 = interactAreaCommonAbilityUp3.Ry0()) != null) {
                            c698920RbGRy04.LIZIZ(this.LLLILZ, c638040P0w);
                        }
                        InteractAreaCommonAbility interactAreaCommonAbilityUp4 = Up();
                        if (interactAreaCommonAbilityUp4 != null && (c698920RbGRy03 = interactAreaCommonAbilityUp4.Ry0()) != null) {
                            c698920RbGRy03.LIZIZ(this.LLLIIII, c638040P0w);
                        }
                        InteractAreaCommonAbility interactAreaCommonAbilityUp5 = Up();
                        if (interactAreaCommonAbilityUp5 != null && (c698920RbGRy02 = interactAreaCommonAbilityUp5.Ry0()) != null) {
                            c698920RbGRy02.LIZIZ(this.LLLIIIIL, c638040P0w);
                        }
                        InteractAreaCommonAbility interactAreaCommonAbilityUp6 = Up();
                        if (interactAreaCommonAbilityUp6 == null || (c698920RbGRy0 = interactAreaCommonAbilityUp6.Ry0()) == null) {
                            return;
                        }
                        c698920RbGRy0.LIZIZ(this.LLLIL, c638040P0w);
                        return;
                    }
                    return;
                }
                layoutParams.bottomMargin = 0;
                C786410Ut5.i7(c708910RrN, layoutParams);
                TuxTextView tuxTextView = this.LLLIIL;
                if (tuxTextView != null) {
                    Bp(i, tuxTextView);
                }
                ImageView imageView = this.LLLIILIL;
                if (imageView != null) {
                    Bp(i, imageView);
                }
                LinearLayout linearLayout2 = this.LLLILZ;
                if (linearLayout2 != null) {
                    Bp(i, linearLayout2);
                }
                C21459118yT c21459118yT = this.LLLIIII;
                if (c21459118yT != null) {
                    Bp(i, c21459118yT);
                }
                TuxTextView tuxTextView2 = this.LLLIIIIL;
                if (tuxTextView2 != null) {
                    Bp(i, tuxTextView2);
                }
                TuxIconView tuxIconView = this.LLLII;
                if (tuxIconView != null) {
                    Bp(i, tuxIconView);
                }
                TuxTextView tuxTextView3 = this.LLLIL;
                if (tuxTextView3 != null) {
                    Bp(i, tuxTextView3);
                }
                TuxTextView tuxTextView4 = this.LLLIIL;
                if (tuxTextView4 != null) {
                    C632780Ors.LIZ(tuxTextView4, 0, 0, 0, i);
                }
                ImageView imageView2 = this.LLLIILIL;
                if (imageView2 != null) {
                    C632780Ors.LIZ(imageView2, 0, 0, 0, i);
                }
                LinearLayout linearLayout3 = this.LLLILZ;
                if (linearLayout3 != null) {
                    C632780Ors.LIZ(linearLayout3, 0, 0, 0, i);
                }
                C21459118yT c21459118yT2 = this.LLLIIII;
                if (c21459118yT2 != null) {
                    C632780Ors.LIZ(c21459118yT2, 0, 0, 0, i);
                }
                TuxTextView tuxTextView5 = this.LLLIIIIL;
                if (tuxTextView5 != null) {
                    C632780Ors.LIZ(tuxTextView5, 0, 0, 0, i);
                }
                TuxTextView tuxTextView6 = this.LLLIL;
                if (tuxTextView6 != null) {
                    C632780Ors.LIZ(tuxTextView6, 0, 0, 0, i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Gp() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.Gp():boolean");
    }

    public final MusicETBusinessModule Qp() {
        C2189821An6 c2189821An6;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String playlistPreviousPage = null;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
        }
        return C652090Phv.LJ(str, playlistPreviousPage) ? MusicETBusinessModule.SEARCH : MusicETBusinessModule.FEED;
    }

    public final VideoEventDispatchViewModel Tp() {
        return (VideoEventDispatchViewModel) this.LLLFZ.getValue();
    }

    public final InteractAreaCommonAbility Up() {
        return (InteractAreaCommonAbility) this.LLJLLL.getValue();
    }

    public final VideoMusicBaseVM Vp() {
        return (VideoMusicBaseVM) this.LLL.getValue(this, LLLLIL[1]);
    }

    public final int Wp() {
        return ((Number) this.LLLLIIL.getValue()).intValue();
    }

    public final VideoMusicTitleVM Xp() {
        return (VideoMusicTitleVM) this.LLJZIJLIL.getValue(this, LLLLIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        if (((Boolean) C277080AtW.LIZ.getValue()).booleanValue()) {
            if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 44));
                return;
            }
            C2041907zF.LIZJ(this.LLLIIII);
            C21459118yT c21459118yT = this.LLLIIII;
            if (c21459118yT != null) {
                c21459118yT.LIZIZ();
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public void ep() {
        Dq(new C637820P0a(this));
    }

    public final VideoMusicCacheDataVM fq() {
        return (VideoMusicCacheDataVM) this.LLLF.getValue(this, LLLLIL[2]);
    }

    public final boolean jq() {
        return ((Boolean) this.LLLLII.getValue()).booleanValue();
    }

    public final boolean lq() {
        return ((Boolean) this.LLLL.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00da A[PHI: r2
      0x00da: PHI (r2v8 java.lang.String) = (r2v0 java.lang.String), (r2v10 java.lang.String) binds: [B:22:0x0054, B:27:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected() {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.onPageSelected():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0248, code lost:
    
        if (X.C10IT.LJIIIZ(((com.ss.android.ugc.aweme.feed.model.VideoItemParams) (r0 != null ? r0.LL : null)).getAweme()) != false) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean pq() {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.pq():boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:590:0x07a4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x07fb, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x085c  */
    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.lifecycle.LifecycleOwner, com.bytedance.assem.arch.reused.ReusedAssem, com.bytedance.assem.arch.reused.ReusedUIAssem, com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Rt1() {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.Rt1():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility
    public final boolean ez1() {
        View viewLJJIJL = LJJIJL();
        return viewLJJIJL != null && viewLJJIJL.getVisibility() == 0;
    }

    public final Boolean kq() {
        FriendsV3CellTrackAbility friendsV3CellTrackAbility;
        C0RJN c0rjnLIZIZ;
        C690870R8b c690870R8bJm = jm();
        if (!Intrinsics.LJFF(C1389300mG0.LIZIZ((c690870R8bJm == null || (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) == null) ? null : c0rjnLIZIZ.LJ), "friends_v3_feeds") || (friendsV3CellTrackAbility = (FriendsV3CellTrackAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FriendsV3CellTrackAbility.class, null)) == null) {
            return null;
        }
        return Boolean.valueOf(friendsV3CellTrackAbility.If2());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        LinearLayout.LayoutParams layoutParams;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        C19EG c19egLIZ = c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZ() : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str)) {
            C01GW c01gw = C694320RLi.LIZ;
            C694320RLi.LIZ(LJJIJL(), null);
        }
        LinearLayout linearLayout = this.LLLIIIL;
        ViewParent parent = linearLayout != null ? linearLayout.getParent() : null;
        C01GW<Integer> c01gw2 = ConstraintSizeVM.LL;
        this.LLLLIILLL = Integer.valueOf(C693770RJf.LIZIZ());
        if (parent instanceof C708910RrN) {
            C708910RrN c708910RrN = (C708910RrN) parent;
            ViewGroup.LayoutParams layoutParams2 = c708910RrN.getLayoutParams();
            if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
                return;
            }
            Bq(c708910RrN, layoutParams);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public static boolean Iq(Aweme aweme) {
        String str;
        MusicPromoTagInfo musicPromoTagInfo = aweme.getMusicPromoTagInfo();
        if (aweme.isAd() || musicPromoTagInfo == null || (str = musicPromoTagInfo.text) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean Jq(VideoItemParams videoItemParams) {
        String aid;
        Aweme aweme;
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        C631140OpE.LIZ.getClass();
        EnumC631120OpC enumC631120OpCLIZ = C631140OpE.LIZ(videoItemParams);
        C0P0X c0p0x = null;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C610010NwF c610010NwFLIZIZ = c633020OsG.LIZIZ(enumC631120OpCLIZ, aid);
        if (c610010NwFLIZIZ != null) {
            c0p0x = c610010NwFLIZIZ.LIZJ;
        }
        if (c0p0x == C0P0X.BIG) {
            return true;
        }
        return false;
    }

    public static Pair aq(Music music) {
        boolean z;
        List<FusedMusic> list;
        FusedMusic next;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        MusicFusion musicFusion;
        if (music != null && (musicFusion = music.getMusicFusion()) != null && C631290OpT.LIZ(musicFusion)) {
            z = true;
        } else {
            z = false;
        }
        Music music2 = null;
        if (z) {
            MusicFusion musicFusion2 = music.getMusicFusion();
            if (musicFusion2 != null && (list = musicFusion2.fusedMusicInfos) != null) {
                Iterator<FusedMusic> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Music music3 = next.music;
                        if (music3 != null && (tT2DSPSongInfos = music3.getTT2DSPSongInfos()) != null && !tT2DSPSongInfos.isEmpty()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                FusedMusic fusedMusic = next;
                if (fusedMusic != null) {
                    music2 = fusedMusic.music;
                }
            }
            return new Pair(music2, music);
        }
        return new Pair(music, null);
    }

    public final void Dq(final Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C2487409ou.LIZJ(new Runnable() { // from class: X.08a7
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoMusicTitleAssem@8443.sam$java_lang_Runnable$0");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoMusicTitleAssem@8443.sam$java_lang_Runnable$0");
                }
            });
        }
    }

    public final void Eq(int i) {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null && c724270Sb3.LL != null && LJJIJL() != null) {
            if (Gp()) {
                Dq(new C638070P0z(this));
            } else {
                Dq(new C638030P0v(this, i));
            }
        }
    }

    public final void Fq(String str) {
        TuxTextView tuxTextView = this.LLLIIIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        C21459118yT c21459118yT = this.LLLIIII;
        if (c21459118yT != null) {
            c21459118yT.setText(str);
        }
    }

    public final boolean Gq(Aweme aweme) {
        if (!Mq(aweme) && !Nq(aweme) && !iq(aweme, C631280OpS.LIZ(aweme)) && !Kq(aweme) && !Iq(aweme)) {
            return false;
        }
        return true;
    }

    public final List<MusicOwnerInfo> Jp(String str) {
        List<MusicOwnerInfo> list = fq().LL.get(str);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Kq(Aweme aweme) {
        String str;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        VideoMusicTitleVM videoMusicTitleVMXp = Xp();
        videoMusicTitleVMXp.getClass();
        C631140OpE c631140OpE = C631140OpE.LIZ;
        VideoItemParams item = videoMusicTitleVMXp.getItem();
        String playlistPreviousPage = null;
        if (item != null) {
            str = item.mEventType;
        } else {
            str = null;
        }
        VideoItemParams item2 = videoMusicTitleVMXp.getItem();
        if (item2 != null && (baseFeedPageParams = item2.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
        }
        c631140OpE.getClass();
        return C633020OsG.LIZIZ.LJJJ(aweme, C631140OpE.LIZIZ(str, playlistPreviousPage), ((C0P1Y) videoMusicTitleVMXp.getState()).LL);
    }

    public final boolean Mq(Aweme aweme) {
        Object obj;
        C0P1U.LIZ.getClass();
        if (((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LJIIIZ(aweme) && !aweme.isAd() && !C729510SjV.LJJIJIL(aweme) && !lq() && !AwemeExtKt.isPhotoMode(aweme)) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C0R93.LIZLLL(((VideoItemParams) obj).mEventType)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Nq(Aweme aweme) {
        String str;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        VideoMusicTitleVM videoMusicTitleVMXp = Xp();
        videoMusicTitleVMXp.getClass();
        C631140OpE c631140OpE = C631140OpE.LIZ;
        VideoItemParams item = videoMusicTitleVMXp.getItem();
        String playlistPreviousPage = null;
        if (item != null) {
            str = item.mEventType;
        } else {
            str = null;
        }
        VideoItemParams item2 = videoMusicTitleVMXp.getItem();
        if (item2 != null && (baseFeedPageParams = item2.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
        }
        c631140OpE.getClass();
        return C633020OsG.LIZIZ.LIZJ(aweme, C631140OpE.LIZIZ(str, playlistPreviousPage));
    }

    public final boolean Pq(VideoItemParams videoItemParams) {
        Aweme aweme;
        String aid;
        String playlistPreviousPage;
        C2189821An6 c2189821An6;
        Xp().getClass();
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (aid = aweme.getAid()) != null) {
            C631140OpE c631140OpE = C631140OpE.LIZ;
            String str = videoItemParams.mEventType;
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
            } else {
                playlistPreviousPage = null;
            }
            c631140OpE.getClass();
            return C633020OsG.LIZIZ.LJJJJZ(C631140OpE.LIZIZ(str, playlistPreviousPage), aid);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qq(com.ss.android.ugc.aweme.music.model.Music r20) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.Qq(com.ss.android.ugc.aweme.music.model.Music):void");
    }

    @Override // X.C0RPN
    public final boolean Sc(View view) {
        return Intrinsics.LJFF(view, LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_component_clickable", new C637970P0p(this));
    }

    /* JADX WARN: Type inference failed for: r1v73, types: [X.0P0w] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Object obj;
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility;
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        Eq(0);
        if (C0RR7.LIZ()) {
            this.LLLLIILL = new InterfaceC698960RbK() { // from class: X.0P0w
                public final Rect LIZ;

                @Override // X.InterfaceC698960RbK
                public final String LIZIZ() {
                    return "music";
                }

                {
                    C01GW c01gw = C694320RLi.LIZ;
                    this.LIZ = new Rect(0, 0, 0, C694320RLi.LIZJ);
                }

                @Override // X.InterfaceC698960RbK
                public final Rect LIZ() {
                    return this.LIZ;
                }
            };
        }
        this.LLLIIII = (C21459118yT) getContentView().findViewById(R.id.ox6);
        this.LLLIIIIL = (TuxTextView) getContentView().findViewById(R.id.oxa);
        this.LLLII = (TuxIconView) getContentView().findViewById(R.id.ovk);
        this.LLLIIIL = (LinearLayout) getContentView().findViewById(R.id.nfh);
        this.LLLIIL = (TuxTextView) getContentView().findViewById(R.id.p7i);
        this.LLLIILIL = (ImageView) getContentView().findViewById(R.id.osx);
        this.LLLIL = (TuxTextView) getContentView().findViewById(R.id.ow7);
        this.LLLILZ = (LinearLayout) getContentView().findViewById(R.id.oso);
        TuxTextView tuxTextView = this.LLLIIIIL;
        if (tuxTextView != null) {
            setComponentClickStatusExperimental(tuxTextView, EnumC700430Rdh.POSITIVE);
        }
        TuxTextView tuxTextView2 = this.LLLIIIIL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new View.OnClickListener() { // from class: X.0P18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.qq(view2);
                }
            });
        }
        C2271391DvN.LIZ(this.LLLIIIIL, (C1A5L) C2271381DvM.LLIIIJ.getValue());
        C21459118yT c21459118yT = this.LLLIIII;
        if (c21459118yT != null) {
            setComponentClickStatusExperimental(c21459118yT, EnumC700430Rdh.POSITIVE);
        }
        C21459118yT c21459118yT2 = this.LLLIIII;
        if (c21459118yT2 != null) {
            View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0P19
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.qq(view2);
                }
            };
            if (C1848410yCV.LIZ) {
                fVar = new f(fVar);
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c21459118yT2);
            }
            c21459118yT2.setOnClickListener(aVar);
        }
        C2271391DvN.LIZ(this.LLLIIII, (C1A5L) C2271381DvM.LLIIIL.getValue());
        TuxIconView tuxIconView2 = this.LLLII;
        if (tuxIconView2 != null) {
            setComponentClickStatusExperimental(tuxIconView2, EnumC700430Rdh.POSITIVE);
        }
        TuxIconView tuxIconView3 = this.LLLII;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new View.OnClickListener() { // from class: X.0P0Z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VideoMusicBaseVM videoMusicBaseVMVp = this.LL.Vp();
                    Context context = view2.getContext();
                    int id = view2.getId();
                    VideoMusicTitleAssem videoMusicTitleAssem = this.LL;
                    videoMusicBaseVMVp.DQ2(new C1398450mUl(context, id, videoMusicTitleAssem.LLLJ, videoMusicTitleAssem.lq(), C1589640rT8.LIZIZ.t2(C724240Sb0.LJI(this.LL)), C729510SjV.LJJIJIL(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme()), false, null, this.LL.kq(), 1804));
                }
            });
        }
        C2271391DvN.LIZ(this.LLLII, (C1A5L) C2271381DvM.LLIIIZ.getValue());
        if (C300980Bqy.LIZ() && (tuxIconView = this.LLLII) != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = Wp();
                layoutParams.height = Wp();
                C786410Ut5.W5(tuxIconView, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        boolean z = true;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "marquee_title_opt", true, false) || C0CCT.LIZ()) {
            z = false;
        }
        this.LLLILZJ = z;
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RC8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LL;
            }
        }, C736820SvI.LIZLLL(), new C637860P0e(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0P1Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0RFV) obj2).LL;
            }
        }, C736820SvI.LIZLLL(), new C637850P0d(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0P1C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0RFV) obj2).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C637840P0c(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0P1E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0RFV) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C638110P1d(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0Nky
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, C736820SvI.LJ(), new C608490Ntn(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0NzK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, C736820SvI.LJ(), new C638020P0u(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0R9c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLJJIJIL;
            }
        }, C736820SvI.LJ(), new C638060P0y(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0NzL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0RFV) obj2).LLJJIII;
            }
        }, null, new C631320OpW(), 6);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0P14
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C0P1Y) obj2).LLILZ);
            }
        }, null, new C637940P0m(), 6);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0P15
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C0P1Y) obj2).LLILZIL);
            }
        }, null, new C637910P0j(), 6);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0P16
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C0P1Y) obj2).LLILZLL);
            }
        }, null, new C637950P0n(), 6);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0P10
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C0P1Y) obj2).LLILLJJLI);
            }
        }, null, new C638050P0x(), 6);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0P12
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0P1Y) obj2).LL;
            }
        }, null, new C637890P0h(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0P17
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJJI;
            }
        }, null, new C631070Op7(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0P1H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJJL;
            }
        }, null, new C631060Op6(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0P1A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJL;
            }
        }, null, new C631050Op5(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0P1B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJLIL;
            }
        }, null, new C637830P0b(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0NtZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJLILLLLZIIL;
            }
        }, null, new C609250Nv1(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0NtX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJLL;
            }
        }, null, new C609260Nv2(), 6);
        C736680Sv4.LJIIIIZZ(this, Tp(), new C2217381BqS() { // from class: X.0NtV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJLLIL;
            }
        }, null, new C608480Ntm(), 6);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C07PC.LIZ(((VideoItemParams) obj).mEventType)) {
            TuxIconView tuxIconView4 = this.LLLII;
            if (tuxIconView4 != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tuxIconView4.getLayoutParams();
                layoutParams2.gravity = 16;
                layoutParams2.bottomMargin = 0;
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C786410Ut5.M6(tuxIconView4, layoutParams2);
                C786410Ut5.x5(tuxIconView4, 0.6f);
            }
            TuxTextView tuxTextView3 = this.LLLIIL;
            if (tuxTextView3 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) tuxTextView3.getLayoutParams();
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                C786410Ut5.R6(tuxTextView3, layoutParams3);
                tuxTextView3.setTuxFont(82);
            }
            ImageView imageView = this.LLLIILIL;
            if (imageView != null) {
                C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), imageView);
            }
            TuxTextView tuxTextView4 = this.LLLIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(82);
            }
            LinearLayout linearLayout = this.LLLILZ;
            if (linearLayout != null) {
                C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), linearLayout);
                TuxTextView tuxTextView5 = (TuxTextView) linearLayout.findViewById(R.id.osp);
                TuxIconView tuxIconView5 = (TuxIconView) linearLayout.findViewById(R.id.osn);
                tuxIconView5.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
                tuxIconView5.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
                tuxTextView5.setTuxFont(82);
            }
        }
        if ((LowScreenOptimizeAB.LJ() || C695730RQt.LIZ()) && (interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) this.LLJZ.getValue()) != null) {
            interactInfoAreaAttachAbility.Z92(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if ((!C300940Bqu.LIZIZ() && ((Number) C0BAC.LIZ.getValue()).intValue() == 1 && !Gq(videoItemParams.getAweme()) && C1398490mUp.LIZ.leftStrategy == 0) || C729510SjV.LJJJI(videoItemParams.getAweme())) {
            return false;
        }
        return super.ur(videoItemParams);
    }

    public final void qq(View view) {
        Object obj;
        boolean zLJI = MethodIDManager.LJI(72083);
        VideoMusicBaseVM videoMusicBaseVMVp = Vp();
        Context context = view.getContext();
        int id = view.getId();
        boolean z = this.LLLJ;
        boolean zLq = lq();
        boolean zT2 = C1589640rT8.LIZIZ.t2(C724240Sb0.LJI(this));
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        videoMusicBaseVMVp.DQ2(new C1398450mUl(context, id, z, zLq, zT2, C729510SjV.LJJIJIL(((VideoItemParams) obj).getAweme()), false, "click_name", kq(), 780));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r12) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public final void yq(boolean z) {
        Fragment fragment;
        Fragment fragment2;
        Object obj;
        Aweme aweme;
        String str;
        String aid;
        Aweme aweme2;
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        try {
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            C690870R8b c690870R8bJm = jm();
            Object obj2 = null;
            if (c690870R8bJm != null && (c0rjnLIZIZ2 = c690870R8bJm.LIZIZ()) != null) {
                fragment = c0rjnLIZIZ2.LJ;
            } else {
                fragment = null;
            }
            boolean zT2 = c1589640rT8.t2(fragment);
            C690870R8b c690870R8bJm2 = jm();
            if (c690870R8bJm2 != null && (c0rjnLIZIZ = c690870R8bJm2.LIZIZ()) != null) {
                fragment2 = c0rjnLIZIZ.LJ;
            } else {
                fragment2 = null;
            }
            String strLIZIZ = C1389300mG0.LIZIZ(fragment2);
            if ((zT2 || C123100dR.LIZ(strLIZIZ)) && LJJIJL().getVisibility() == 0) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                if (videoItemParams != null) {
                    aweme = videoItemParams.getAweme();
                } else {
                    aweme = null;
                }
                boolean zLJJIJIL = C729510SjV.LJJIJIL(aweme);
                if (z && Intrinsics.LJFF(strLIZIZ, "friends_v3_feeds")) {
                    return;
                }
                if (zLJJIJIL) {
                    str = "story";
                } else {
                    str = "post";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("story_type", str);
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                VideoItemParams videoItemParams2 = (VideoItemParams) obj2;
                if (videoItemParams2 == null || (aweme2 = videoItemParams2.getAweme()) == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
                C1599640rjG.LIZIZ.Ou(c2344009Gk, new C1360330lVH(strLIZIZ, null, null, kq(), 6));
                C20684815ws.LJIILLIIL("friends_music_anchor_show", c2344009Gk.LIZ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void zq(boolean z) {
        Object obj;
        Object obj2;
        String str;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String mid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        HashMap map = new HashMap();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str2 = ((VideoItemParams) obj2).mEventType;
        if (str2 == null) {
            str2 = "'";
        }
        map.put("enter_from", str2);
        Music music = aweme.getMusic();
        if (music != null) {
            mid = music.getMid();
        }
        map.put("music_id", mid);
        map.put("group_id", aweme.getAid());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("music_new_show", str);
        map.put("location", "name");
        C20684815ws.LJIILLIIL("new_release_show", map);
    }

    public static void Bp(int i, View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof FrameLayout) && (view2 = (View) parent) != null) {
            C0H1U.LJII(i, view2);
        }
    }

    public final void Aq(boolean z, boolean z2) {
        Object obj;
        String metaAlbumId;
        Object obj2;
        TT2DspAlbumInfo tT2DspAlbumInfo;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        TT2DspAlbumInfo tT2DspAlbumInfo2;
        boolean z3;
        Object obj7;
        TT2DspAlbumInfo tT2DspAlbumInfo3;
        boolean z4;
        Object obj8;
        Object obj9;
        Music music;
        String aid;
        String string;
        EnumC631330OpX enumC631330OpX;
        Object obj10;
        Object obj11;
        String idStr;
        Object obj12;
        MatchedSoundInfo matchedSongInfo;
        TT2DspAlbumInfo tT2DspAlbumInfo4;
        TT2DspAlbumInfo tT2DspAlbumInfo5 = null;
        if (C2140508a3.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2140808a6(this, z, z2, null), 3);
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        MusicDiscoveryInfo musicDiscoveryInfo = ((VideoItemParams) obj).getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo == null || (tT2DspAlbumInfo4 = musicDiscoveryInfo.tt2DspAlbumInfo) == null || (metaAlbumId = tT2DspAlbumInfo4.getMetaAlbumId()) == null) {
            metaAlbumId = "";
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        MusicDiscoveryInfo musicDiscoveryInfo2 = ((VideoItemParams) obj2).getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo2 != null) {
            tT2DspAlbumInfo = musicDiscoveryInfo2.tt2DspAlbumInfo;
        } else {
            tT2DspAlbumInfo = null;
        }
        DspPlatform dspPlatformLJJIZ = c633020OsG.LJJIZ(tT2DspAlbumInfo);
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        String str = ((VideoItemParams) obj3).mEventType;
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        String str2 = ((VideoItemParams) obj4).mEventType;
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        Aweme aweme = ((VideoItemParams) obj5).getAweme();
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj6 = c724270Sb36.LL;
        } else {
            obj6 = null;
        }
        MusicDiscoveryInfo musicDiscoveryInfo3 = ((VideoItemParams) obj6).getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo3 != null) {
            tT2DspAlbumInfo2 = musicDiscoveryInfo3.tt2DspAlbumInfo;
        } else {
            tT2DspAlbumInfo2 = null;
        }
        DspPlatform dspPlatformLJJIZ2 = c633020OsG.LJJIZ(tT2DspAlbumInfo2);
        DspPlatform dspPlatform = DspPlatform.UNKNOWN;
        if (dspPlatformLJJIZ2 != dspPlatform) {
            z3 = true;
        } else {
            z3 = false;
        }
        C724270Sb3 c724270Sb37 = this.LLJI;
        if (c724270Sb37 != null) {
            obj7 = c724270Sb37.LL;
        } else {
            obj7 = null;
        }
        MusicDiscoveryInfo musicDiscoveryInfo4 = ((VideoItemParams) obj7).getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo4 != null) {
            tT2DspAlbumInfo3 = musicDiscoveryInfo4.tt2DspAlbumInfo;
        } else {
            tT2DspAlbumInfo3 = null;
        }
        if (c633020OsG.LJJIZ(tT2DspAlbumInfo3) != dspPlatform) {
            z4 = true;
        } else {
            z4 = false;
        }
        C724270Sb3 c724270Sb38 = this.LLJI;
        if (c724270Sb38 != null) {
            obj8 = c724270Sb38.LL;
        } else {
            obj8 = null;
        }
        Music music2 = ((VideoItemParams) obj8).getAweme().getMusic();
        C724270Sb3 c724270Sb39 = this.LLJI;
        if (c724270Sb39 != null) {
            obj9 = c724270Sb39.LL;
        } else {
            obj9 = null;
        }
        MusicDiscoveryInfo musicDiscoveryInfo5 = ((VideoItemParams) obj9).getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo5 != null) {
            tT2DspAlbumInfo5 = musicDiscoveryInfo5.tt2DspAlbumInfo;
        }
        int size = c633020OsG.LJJLIIIJJI(music2, tT2DspAlbumInfo5, null, null).size();
        String id = null;
        Boolean boolValueOf = Boolean.valueOf(z3);
        Boolean boolValueOf2 = Boolean.valueOf(z4);
        Integer numValueOf = Integer.valueOf(size);
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (aweme != null) {
            string = Integer.valueOf(aweme.getAwemeType()).toString();
        } else {
            string = null;
        }
        PreSaveLogData preSaveLogData = new PreSaveLogData(dspPlatformLJJIZ, str2, str, aweme, music, aid, string, null, metaAlbumId, boolValueOf, boolValueOf2, numValueOf, null, null);
        if (z) {
            c633020OsG.LIZ(preSaveLogData);
        } else if (z2) {
            c633020OsG.LJJLIIIJLLLLLLLZ(preSaveLogData);
        }
        if (z) {
            enumC631330OpX = EnumC631330OpX.PRESAVE_SHOW;
        } else {
            enumC631330OpX = EnumC631330OpX.PRESAVE_CLICK;
        }
        int value = enumC631330OpX.getValue();
        int value2 = EnumC631300OpU.TT_TO_DSP.getValue();
        C724270Sb3 c724270Sb310 = this.LLJI;
        if (c724270Sb310 != null) {
            obj10 = c724270Sb310.LL;
        } else {
            obj10 = null;
        }
        String aid2 = ((VideoItemParams) obj10).getAweme().getAid();
        C724270Sb3 c724270Sb311 = this.LLJI;
        if (c724270Sb311 != null) {
            obj11 = c724270Sb311.LL;
        } else {
            obj11 = null;
        }
        Music music3 = ((VideoItemParams) obj11).getAweme().getMusic();
        if (music3 != null) {
            idStr = music3.getIdStr();
        } else {
            idStr = null;
        }
        C724270Sb3 c724270Sb312 = this.LLJI;
        if (c724270Sb312 != null) {
            obj12 = c724270Sb312.LL;
        } else {
            obj12 = null;
        }
        Music music4 = ((VideoItemParams) obj12).getAweme().getMusic();
        if (music4 != null && (matchedSongInfo = music4.getMatchedSongInfo()) != null) {
            id = matchedSongInfo.getId();
        }
        c633020OsG.LJJJZ(new ReportData(value, value2, aid2, idStr, id, null, metaAlbumId));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bq(X.C708910RrN r6, android.widget.LinearLayout.LayoutParams r7) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.Bq(X.0RrN, android.widget.LinearLayout$LayoutParams):void");
    }

    @Override // X.C0RPN
    public final void Cm(int i, View view) {
        C19EG c19egLIZ;
        Object obj;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        Object obj2 = null;
        if (c0rjnLIZIZ != null) {
            c19egLIZ = c0rjnLIZIZ.LIZ();
        } else {
            c19egLIZ = null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str = ((VideoItemParams) obj).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) obj2).getAweme(), str)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        Fp();
    }

    public final void Ep(Music music, EnumC631120OpC enumC631120OpC) {
        TT2DSPSongInfo tT2DSPSongInfo;
        TT2DSPSongInfo next;
        Object obj;
        DspPlatform dspPlatform;
        if (music == null) {
            return;
        }
        DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
        List<TT2DSPSongInfo> tT2DSPSongInfos = music.getTT2DSPSongInfos();
        if (tT2DSPSongInfos == null) {
            return;
        }
        Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
        while (true) {
            tT2DSPSongInfo = null;
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = next.dspPlatform;
                int value = dspPlatformLJIILJJIL.getValue();
                if (num != null && num.intValue() == value) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TT2DSPSongInfo tT2DSPSongInfo2 = next;
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        String strLJIILL = c633020OsG.LJIILL(dspPlatformLJIILJJIL);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        AddSongContextData addSongContextDataIp = Ip((VideoItemParams) obj, music, enumC631120OpC, dspPlatformLJIILJJIL, false);
        DspPlatform dspPlatform2 = DspPlatform.UNKNOWN;
        if (dspPlatformLJIILJJIL == dspPlatform2) {
            List<DspPlatform> listLJJLIIIJJI = c633020OsG.LJJLIIIJJI(null, null, null, null);
            if (listLJJLIIIJJI.size() != 1 && Xp().LLILLJJLI == dspPlatform2) {
                vq(addSongContextDataIp, tT2DSPSongInfos);
                return;
            }
            if (listLJJLIIIJJI.size() == 1) {
                dspPlatform = (DspPlatform) ListProtector.get(listLJJLIIIJJI, 0);
            } else {
                dspPlatform = Xp().LLILLJJLI;
            }
            Iterator<TT2DSPSongInfo> it3 = tT2DSPSongInfos.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TT2DSPSongInfo next2 = it3.next();
                Integer num2 = next2.dspPlatform;
                int value2 = dspPlatform.getValue();
                if (num2 != null && num2.intValue() == value2) {
                    tT2DSPSongInfo = next2;
                    break;
                }
            }
            TT2DSPSongInfo tT2DSPSongInfo3 = tT2DSPSongInfo;
            if (tT2DSPSongInfo3 != null && dspPlatform.getNeedAuth()) {
                C633020OsG.LIZIZ.LJIIIIZZ(addSongContextDataIp, listLJJLIIIJJI);
                tq(addSongContextDataIp, tT2DSPSongInfo3, dspPlatform);
                return;
            } else {
                vq(addSongContextDataIp, tT2DSPSongInfos);
                return;
            }
        }
        if (tT2DSPSongInfo2 == null) {
            vq(addSongContextDataIp, tT2DSPSongInfos);
            return;
        }
        if (strLJIILL.length() == 0) {
            if (C297140Bkm.LIZ()) {
                c633020OsG.LJJIIZI(C724240Sb0.LIZ(this), C724240Sb0.LJI(this), addSongContextDataIp, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo2), false);
                return;
            }
            switch (C0P2Y.LIZ[dspPlatformLJIILJJIL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    tq(addSongContextDataIp, tT2DSPSongInfo2, dspPlatformLJIILJJIL);
                    break;
                default:
                    vq(addSongContextDataIp, tT2DSPSongInfos);
                    break;
            }
            return;
        }
        c633020OsG.LJJIIZI(C724240Sb0.LIZ(this), C724240Sb0.LJI(this), addSongContextDataIp, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo2), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final TTToDspLogExtra dq(VideoItemParams videoItemParams, Music music) {
        Map<String, String> mapLJ;
        ?? LJ;
        Map<String, String> logExtraMap;
        TTToDspLogExtra tTToDspLogExtra = new TTToDspLogExtra();
        MusicDiscoveryInfo musicDiscoveryInfo = videoItemParams.getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo == null || (mapLJ = musicDiscoveryInfo.getTTToDspLogExtraMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (music != null && (logExtraMap = music.getLogExtraMap()) != null) {
            LJ = new LinkedHashMap();
            for (Map.Entry<String, String> entry : logExtraMap.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "meta_song_matched_type")) {
                    LJ.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        tTToDspLogExtra.append(C2097608Jq.LJIIL(mapLJ, LJ));
        return tTToDspLogExtra;
    }

    public final boolean iq(Aweme aweme, Music music) {
        Object obj;
        String str;
        Object obj2;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C631140OpE c631140OpE = C631140OpE.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String playlistPreviousPage = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) obj2;
        if (videoItemParams2 != null && (baseFeedPageParams = videoItemParams2.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
        }
        c631140OpE.getClass();
        return C633020OsG.LIZIZ.LJJLIL(aweme, C631140OpE.LIZIZ(str, playlistPreviousPage), music);
    }

    public final void vq(AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        C633020OsG.LIZIZ.LJJZ(C724240Sb0.LJI(this), addSongContextData, DspSheetType.SELECT_DSP, list, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wq(com.ss.android.ugc.aweme.feed.model.VideoItemParams r36, java.lang.Integer r37) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.wq(com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.Integer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xq(com.ss.android.ugc.aweme.feed.model.VideoItemParams r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.xq(com.ss.android.ugc.aweme.feed.model.VideoItemParams, boolean):void");
    }

    public final void tq(AddSongContextData addSongContextData, TT2DSPSongInfo tT2DSPSongInfo, DspPlatform dspPlatform) {
        String str;
        AppleMusicToken appleMusicToken;
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        List<String> listLJIIL = C1697810uHb.LJIIL(tT2DSPSongInfo.songId);
        EnumC587920N4c enumC587920N4c = EnumC587920N4c.DIRECTLY_AUTH;
        DspAuthToken dspAuthToken = tT2DSPSongInfo.token;
        if (dspAuthToken != null && (appleMusicToken = dspAuthToken.appleMusicToken) != null) {
            str = appleMusicToken.developToken;
        } else {
            str = null;
        }
        c633020OsG.LJJJJZI(c19egLIZ, fragmentLJI, addSongContextData, dspPlatform, listLJIIL, enumC587920N4c, str, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.music.model.AddSongContextData Ip(com.ss.android.ugc.aweme.feed.model.VideoItemParams r39, com.ss.android.ugc.aweme.music.model.Music r40, X.EnumC631120OpC r41, com.ss.android.ugc.aweme.music.model.DspPlatform r42, boolean r43) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.Ip(com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.aweme.music.model.Music, X.0OpC, com.ss.android.ugc.aweme.music.model.DspPlatform, boolean):com.ss.android.ugc.aweme.music.model.AddSongContextData");
    }
}
