package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0RJN;
import X.C0S9L;
import X.C0SB1;
import X.C0SFT;
import X.C0SKO;
import X.C0SMY;
import X.C0XQ7;
import X.C1389300mG0;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C582980Mtk;
import X.C687700QyG;
import X.C720210SMx;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC717030SAr;
import X.InterfaceC717040SAs;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoLayoutComponent extends BaseCellContentComponent<FeedPhotoLayoutComponent> implements InterfaceC717030SAr, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(512));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1005));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1004));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1006));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1002));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1003));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1001));
    public final FeedPhotoLayoutComponent LLJLLIL = this;
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(226));
    public boolean LLJZ = true;
    public volatile InterfaceC717040SAs LLJZIJLIL;
    public volatile InterfaceC696720RUo LLL;
    public volatile C0S9L LLLF;
    public InterfaceC665370Q7z LLLFF;
    public C0QSJ LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedPhotoLayoutComponent.class, "viewPagerSpec", "getViewPagerSpec()Lcom/ss/android/ugc/aweme/ability/IPhotoViewPagerSpec;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FeedPhotoLayoutComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FeedPhotoLayoutComponent.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    @Override // X.InterfaceC717030SAr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0SFT Sj() {
        /*
            r10 = this;
            X.0SFT r4 = new X.0SFT
            android.content.Context r5 = r10.getContext()
            X.0Sb3 r0 = r10.LLJI
            r3 = 0
            if (r0 == 0) goto L65
            java.lang.Object r0 = r0.LL
        Ld:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.getAweme()
            X.01GW r0 = r10.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility r0 = (com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility) r0
            if (r0 == 0) goto L63
            boolean r0 = r0.Ao0()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 != r7) goto L63
        L26:
            X.0SSk r2 = X.C721640SSk.LIZ
            X.01GW r0 = r10.LLJJJJLIIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = (com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2) r0
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = r0.LLILLL
            X.01GW r0 = r10.LLJL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility r0 = (com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility) r0
            r2.getClass()
            boolean r8 = X.C721640SSk.LJIIZILJ(r1, r0)
            X.0Sb3 r0 = r10.LLJI
            if (r0 == 0) goto L47
            java.lang.Object r3 = r0.LL
        L47:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r3 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.getAweme()
            X.01GW r0 = r10.LLJJJJLIIL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.ext_power_list.AssemViewModelWithItem r0 = (com.bytedance.ext_power_list.AssemViewModelWithItem) r0
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            boolean r9 = X.C721640SSk.LJIIL(r1, r0)
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L63:
            r7 = 0
            goto L26
        L65:
            r0 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoLayoutComponent.Sj():X.0SFT");
    }

    public final C0QSJ ep() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLFFI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLFF;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLFF = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
        this.LLLFFI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC717040SAs hp() {
        InterfaceC717040SAs interfaceC717040SAs;
        InterfaceC717040SAs interfaceC717040SAs2 = this.LLJZIJLIL;
        if (interfaceC717040SAs2 == null) {
            synchronized (this) {
                interfaceC717040SAs2 = this.LLJZIJLIL;
                if (interfaceC717040SAs2 == null) {
                    C0QSJ c0qsjEp = ep();
                    if (c0qsjEp != null) {
                        interfaceC717040SAs = (InterfaceC717040SAs) c0qsjEp.getAbility(InterfaceC717040SAs.class);
                        C687700QyG.LJ(interfaceC717040SAs, InterfaceC717040SAs.class);
                    } else {
                        interfaceC717040SAs = null;
                    }
                    this.LLJZIJLIL = interfaceC717040SAs;
                    return interfaceC717040SAs;
                }
            }
        }
        return interfaceC717040SAs2;
    }

    public final boolean ie() {
        InterfaceC696720RUo interfaceC696720RUo = this.LLL;
        if (interfaceC696720RUo == null) {
            synchronized (this) {
                interfaceC696720RUo = this.LLL;
                if (interfaceC696720RUo == null) {
                    C0QSJ c0qsjEp = ep();
                    if (c0qsjEp != null) {
                        interfaceC696720RUo = (InterfaceC696720RUo) c0qsjEp.getAbility(InterfaceC696720RUo.class);
                        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
                    } else {
                        interfaceC696720RUo = null;
                    }
                    this.LLL = interfaceC696720RUo;
                }
            }
        }
        return interfaceC696720RUo.ie();
    }

    public final boolean ip() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mPageType != 1000) {
            return false;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        return Intrinsics.LJFF(AwemeExtKt.getAuthorUid(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme()), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
    }

    @Override // X.InterfaceC717030SAr
    public final FeedContentLayoutInfo w6() {
        C0SFT c0sftSj = Sj();
        C720210SMx c720210SMx = C0SMY.LIZ;
        Context context = getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
        C724270Sb3 c724270Sb33 = this.LLJI;
        return C0SMY.LIZIZ(context, C0SKO.LIZ(aweme, str, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).isMyProfile), null, null, hp().getMeasuredHeight(), c0sftSj, false, ie(), (InteractAreaCommonAbility) this.LLJLIL.getValue(), (BottomBarPriorityAbility) this.LLJL.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    @Override // X.InterfaceC717030SAr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, android.graphics.Rect> Z(int r27) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoLayoutComponent.Z(int):kotlin.Pair");
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).unbindAbility(this.LLJLLIL, InterfaceC717030SAr.class);
    }

    @Override // X.InterfaceC717030SAr
    public final void hk(Integer num) {
        if (ip() || ie()) {
            return;
        }
        C736680Sv4.LJIJJLI((AssemViewModel) this.LLJJJJLIIL.getValue(), new AwS377S0200000_11(this, num, 68));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0SB1 c0sb1 = (C0SB1) this.LLJLLL.getValue();
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        c0sb1.getClass();
        if (c0rjnLIZIZ != null && (C1389300mG0.LJII(c0rjnLIZIZ) || C1389300mG0.LJIJJ(c0rjnLIZIZ))) {
            c0sb1.LIZ = true;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0S9z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(152), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0SA0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(153), 4);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).bindAbility(this.LLJLLIL, InterfaceC717030SAr.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C0SB1 c0sb1 = (C0SB1) this.LLJLLL.getValue();
        String str = videoItemParams2.mEventType;
        Aweme aweme = videoItemParams2.getAweme();
        c0sb1.getClass();
        if (aweme != null && (AwemeExtKt.isAdTraffic(aweme) || !C582980Mtk.LIZIZ(aweme))) {
            return;
        }
        c0sb1.LIZIZ = str;
        c0sb1.LIZJ = aweme;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        C0SB1 c0sb1 = (C0SB1) this.LLJLLL.getValue();
        c0sb1.LIZJ = null;
        c0sb1.LIZIZ = null;
        c0sb1.LIZLLL.clear();
        c0sb1.LJ.clear();
    }
}
