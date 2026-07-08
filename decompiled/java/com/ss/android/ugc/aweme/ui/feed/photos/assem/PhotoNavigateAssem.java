package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0AG8;
import X.C0QSJ;
import X.C0RJN;
import X.C0SBF;
import X.C0SNY;
import X.C1220000hqw;
import X.C1389300mG0;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C161N;
import X.C20737116Cr;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2487409ou;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C715860S6e;
import X.C717100SAy;
import X.C720080SMk;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.EnumC721170SQp;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC717030SAr;
import X.InterfaceC717040SAs;
import X.InterfaceC717050SAt;
import Y.ARunnableS111S0100000_11;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoDetailNavigationProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoNavigateAssem extends BaseCellLogicComponent<PhotoNavigateAssem> implements InterfaceC717050SAt, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(520));
    public final C715860S6e LLJJIJIIJIL = new C715860S6e(this);
    public final C01GW LLJJIJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(521));
    public final C736950SvV LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public ARunnableS111S0100000_11 LLJLL;
    public long LLJLLIL;
    public Bitmap LLJLLL;
    public long LLJZ;
    public String LLJZIJLIL;
    public volatile InterfaceC717040SAs LLL;
    public volatile InterfaceC696720RUo LLLF;
    public volatile InterfaceC717030SAr LLLFF;
    public InterfaceC665370Q7z LLLFFI;
    public C0QSJ LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoNavigateAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoNavigateAssem.class, "translationDelegate", "getTranslationDelegate()Lcom/ss/android/ugc/aweme/translation/controller/TranslationDelegate;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PhotoNavigateAssem.class, "viewPagerSpec", "getViewPagerSpec()Lcom/ss/android/ugc/aweme/ability/IPhotoViewPagerSpec;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PhotoNavigateAssem.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PhotoNavigateAssem.class, "photoCellLayoutAbilityDi", "getPhotoCellLayoutAbilityDi()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoCellLayoutAbility;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0013, B:8:0x0015, B:21:0x0034, B:23:0x003a, B:25:0x0043, B:27:0x0049, B:29:0x004f, B:31:0x0068, B:32:0x006b, B:10:0x001f, B:12:0x0023, B:19:0x0031), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap No() {
        /*
            r7 = this;
            r4 = 0
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L79
            long r0 = r7.LLJLLIL     // Catch: java.lang.Exception -> L79
            long r5 = r5 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L1f
            X.0Sb3 r0 = r7.LLJI     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r0.LL     // Catch: java.lang.Exception -> L79
        L15:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r0.mEventType     // Catch: java.lang.Exception -> L79
            boolean r0 = X.C0SO2.LIZ(r0)     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L34
        L1f:
            android.graphics.Bitmap r0 = r7.LLJLLL     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L2c
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Exception -> L79
            if (r0 != 0) goto L2c
            goto L2e
        L2a:
            r0 = r4
            goto L15
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L34
            android.graphics.Bitmap r0 = r7.LLJLLL     // Catch: java.lang.Exception -> L79
            return r0
        L34:
            X.19EG r1 = X.C724240Sb0.LIZ(r7)     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L78
            r0 = 2131388947(0x7f0a6a13, float:1.8398423E38)
            android.view.View r3 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L79
            if (r3 == 0) goto L78
            int r0 = r3.getWidth()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L78
            int r0 = r3.getHeight()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L78
            int r2 = r3.getWidth()     // Catch: java.lang.Exception -> L79
            int r1 = r3.getHeight()     // Catch: java.lang.Exception -> L79
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> L79
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch: java.lang.Exception -> L79
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L79
            r1.<init>(r2)     // Catch: java.lang.Exception -> L79
            android.graphics.drawable.Drawable r0 = r3.getBackground()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L6b
            r0.draw(r1)     // Catch: java.lang.Exception -> L79
        L6b:
            X.C842150X1x.LIZIZ(r1, r3)     // Catch: java.lang.Exception -> L79
            r7.LLJLLL = r2     // Catch: java.lang.Exception -> L79
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L79
            r7.LLJLLIL = r0     // Catch: java.lang.Exception -> L79
            android.graphics.Bitmap r4 = r7.LLJLLL
        L78:
            return r4
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNavigateAssem.No():android.graphics.Bitmap");
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class, VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0RRh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(162), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final C0QSJ Co() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLFZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLFFI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLFFI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
        this.LLLFZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC717030SAr Eo() {
        InterfaceC717030SAr interfaceC717030SAr = this.LLLFF;
        if (interfaceC717030SAr == null) {
            synchronized (this) {
                interfaceC717030SAr = this.LLLFF;
                if (interfaceC717030SAr == null) {
                    C0QSJ c0qsjCo = Co();
                    InterfaceC717030SAr interfaceC717030SAr2 = c0qsjCo != null ? (InterfaceC717030SAr) c0qsjCo.getAbility(InterfaceC717030SAr.class) : null;
                    this.LLLFF = interfaceC717030SAr2;
                    return interfaceC717030SAr2;
                }
            }
        }
        return interfaceC717030SAr;
    }

    public final InterfaceC696720RUo Fo() {
        InterfaceC696720RUo interfaceC696720RUo;
        InterfaceC696720RUo interfaceC696720RUo2 = this.LLLF;
        if (interfaceC696720RUo2 == null) {
            synchronized (this) {
                interfaceC696720RUo2 = this.LLLF;
                if (interfaceC696720RUo2 == null) {
                    C0QSJ c0qsjCo = Co();
                    if (c0qsjCo != null) {
                        interfaceC696720RUo = (InterfaceC696720RUo) c0qsjCo.getAbility(InterfaceC696720RUo.class);
                        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
                    } else {
                        interfaceC696720RUo = null;
                    }
                    this.LLLF = interfaceC696720RUo;
                    return interfaceC696720RUo;
                }
            }
        }
        return interfaceC696720RUo2;
    }

    public final IPhotoSlidesAbility Go() {
        return (IPhotoSlidesAbility) this.LLJJJJLIIL.getValue();
    }

    public final PhotoViewModelV2 Ho() {
        return (PhotoViewModelV2) this.LLJJIJIL.getValue();
    }

    public final VideoDescVM Jo() {
        return (VideoDescVM) this.LLJJIJIIJIL.getValue(this, LLLI[0]);
    }

    public final InterfaceC717040SAs Lo() {
        InterfaceC717040SAs interfaceC717040SAs;
        InterfaceC717040SAs interfaceC717040SAs2 = this.LLL;
        if (interfaceC717040SAs2 == null) {
            synchronized (this) {
                interfaceC717040SAs2 = this.LLL;
                if (interfaceC717040SAs2 == null) {
                    C0QSJ c0qsjCo = Co();
                    if (c0qsjCo != null) {
                        interfaceC717040SAs = (InterfaceC717040SAs) c0qsjCo.getAbility(InterfaceC717040SAs.class);
                        C687700QyG.LJ(interfaceC717040SAs, InterfaceC717040SAs.class);
                    } else {
                        interfaceC717040SAs = null;
                    }
                    this.LLL = interfaceC717040SAs;
                    return interfaceC717040SAs;
                }
            }
        }
        return interfaceC717040SAs2;
    }

    public PhotoNavigateAssem() {
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1034);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(522), new AwS555S0100000_11((AbstractC738140SxQ) this, 1037), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJIL = C161N.LIZIZ.LLIFFJFJJ(this);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1031));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1036));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1033));
        this.LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1032));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1028));
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1029));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1035));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1030));
    }

    @Override // X.InterfaceC717050SAt
    public final void oi() {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoDetailNavigationProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC717050SAt) it2.next()).oi();
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public final int Bo(Aweme aweme) {
        String desc;
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        if (desc == null || desc.length() == 0) {
            return 0;
        }
        return C720080SMk.LIZ(new Regex("@\\S+").replace(desc, "")).length();
    }

    @Override // X.InterfaceC717050SAt
    public final void Qk(EnumC721170SQp enumC721170SQp) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoDetailNavigationProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC717050SAt) it2.next()).Qk(enumC721170SQp);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentBubbleItemClicked(C0SBF c0sbf) {
        Object obj;
        if (c0sbf != null) {
            String str = c0sbf.LIZJ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            String aid = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            }
            if (Intrinsics.LJFF(str, aid) && c0sbf.LJ) {
                C736680Sv4.LJIJJLI(Ho(), new AwS377S0200000_11(this, PostModeEntranceMechanism.RED_BUBBLE, 173));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        C2189821An6 c2189821An6;
        DetailNavArgModel detailNavArgModel;
        Integer numValueOf;
        Integer numValueOf2;
        String strLIZ;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        Integer numValueOf3 = null;
        if (c0rjnLIZIZ != null && (strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ)) != null && !C20737116Cr.LIZJ() && Intrinsics.LJFF(strLIZ, "homepage_hot") && ((Boolean) C0AG8.LIZ.getValue()).booleanValue()) {
            if (SystemClock.elapsedRealtime() - C0SNY.LIZ >= 65000) {
                ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJLL;
                if (aRunnableS111S0100000_11 == null) {
                    aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 200);
                    this.LLJLL = aRunnableS111S0100000_11;
                }
                C786410Ut5.f3(new C717100SAy(aRunnableS111S0100000_11), C2487409ou.LIZIZ().getLooper().getQueue());
            }
            No();
        }
        try {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj).baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
                if (navArgModel == null || (detailNavArgModel = navArgModel.copy(navArgModel.debugParam, navArgModel.takoInnerfeedEntranceGroupId, navArgModel.takoInnerfeedEntranceRank, navArgModel.takoIndex, navArgModel.takoStyle, navArgModel.takoWordsPos, navArgModel.takoItemUniqueId, navArgModel.takoChatId, navArgModel.takoSessionId, navArgModel.takoVideoSessionId, navArgModel.takoVideoFromInner, navArgModel.takoScreenType, navArgModel.takoSessionSource, navArgModel.searchSeekProgress, navArgModel.loadEmptyText, navArgModel.isShowSearchCollectionBottomBar, navArgModel.searchInitPosition, navArgModel.searchTabShowName, navArgModel.searchTabShowCount, navArgModel.vibeExtraParam, navArgModel.followSkylightIndex, navArgModel.followSkylightTotalCount, navArgModel.followSkylightNeedAnim, navArgModel.enterPosition, navArgModel.collectionType, navArgModel.fromStoryToPost, navArgModel.isThumbnailScaleUp, navArgModel.isCoverOverlayTransition, navArgModel.phoneCornerRadius, navArgModel.yCoordinateExplorePage, navArgModel.xCoordinateExplorePage, navArgModel.imageHeight, navArgModel.imageWidth, navArgModel.isMusicChart, navArgModel.searchSource, navArgModel.seamlessToDetail, navArgModel.searchCustomCover, navArgModel.isProfileTabSearch, navArgModel.profileTabSearchId, navArgModel.storyIsFromGroupChatSingleAvatar, navArgModel.enterFollowingInnerContainer, navArgModel.exploreTabID, navArgModel.exploreTabName, navArgModel.fromExplorePage, navArgModel.titleLength, navArgModel.displayedTitleLength, navArgModel.displayedDescriptionLength, navArgModel.displayedDescWithoutHashTagMentionEmojiLength, navArgModel.descWithoutHashTagMentionEmojiLength, navArgModel.cmtToPostSourceGroupId, navArgModel.cmtToPostSourceLinkPosition, navArgModel.friendsV3DetailType, navArgModel.feedDetailClickTime, navArgModel.feedDetailInterceptTime, navArgModel.jsbVideoDetailKey, navArgModel.feedDetailVideoCurrentPosition, navArgModel.forcePopupOfflineModeSheet, navArgModel.offlineModeSheetStyle, navArgModel.startViewId, navArgModel.groupType, navArgModel.chatTypeStr, navArgModel.chatType, navArgModel.message, navArgModel.isFromTrendingHashtag, navArgModel.isStoryDetailForSaf, navArgModel.storyMusicEntrancePageCode, navArgModel.isFromPush, navArgModel.pushType, navArgModel.pushId, navArgModel.shareToStoryAidOfStory, navArgModel.highlightRepostReplyIds, navArgModel.insertRepostUid, navArgModel.innerPushTrackExtra, navArgModel.insertRepostReplyIds, navArgModel.openRepostInput, navArgModel.ttlsLiveExtra, navArgModel.dynamicDetailTitleText, navArgModel.flowChangeToastText, navArgModel.socialEntrance, navArgModel.safAnimDelayMode, navArgModel.safAnimDelayTimeoutMs, navArgModel.showRepostGuideTooltip, navArgModel.pollId, navArgModel.noticeTemplateIdForComment, navArgModel.isShareUnavailableHighlight, navArgModel.followRecommendNavExtra, navArgModel.isFromViewPostEntry, navArgModel.isFromAIRemixChain, navArgModel.aigcOverlabelNotice)) == null) {
                    detailNavArgModel = new DetailNavArgModel("", null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, "", null, null, "", "", "", 0, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Float.valueOf(0.0f), 0, 0, Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, false, false, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, Boolean.FALSE, null, 0, null, null, "", null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null);
                }
                HashMap<String, String> map = Jo().LLJJJJ;
                if (map != null) {
                    String str = map.get("displayed_desc_without_hashtag_mention_emoji_length");
                    if (str != null) {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                    } else {
                        numValueOf = null;
                    }
                    detailNavArgModel.setDisplayedDescWithoutHashTagMentionEmojiLength(numValueOf);
                    String str2 = map.get("displayed_title_length");
                    if (str2 != null) {
                        numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                    } else {
                        numValueOf2 = null;
                    }
                    detailNavArgModel.setDisplayedTitleLength(numValueOf2);
                    String str3 = map.get("displayed_description_length");
                    if (str3 != null) {
                        numValueOf3 = Integer.valueOf(CastIntegerProtector.parseInt(str3));
                    }
                    detailNavArgModel.setDisplayedDescriptionLength(numValueOf3);
                    detailNavArgModel.setDescWithoutHashTagMentionEmojiLength(Integer.valueOf(Bo(aweme)));
                }
                c2189821An6.setDetailFeedNavArgModel(detailNavArgModel);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC717050SAt
    public final void K6(int i, boolean z) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoDetailNavigationProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC717050SAt) it2.next()).K6(i, z);
            }
        }
    }
}
