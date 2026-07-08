package com.ss.android.ugc.aweme.ui.feed.cell;

import X.C01GW;
import X.C0R6M;
import X.C0RF0;
import X.C0RH4;
import X.C0RH8;
import X.C0RKI;
import X.C0S9P;
import X.C0SUC;
import X.C0T1R;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C2188811AlT;
import X.C297720Bli;
import X.C304280BwI;
import X.C452501pT;
import X.C696330RTb;
import X.C720300SNg;
import X.C721190SQr;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C994010byR;
import X.EnumC452301pR;
import X.InterfaceC713360RyY;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.FlingGestureAbility;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoModeAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoCellGradualComponent;
import com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponentTemp;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPhotosViewHolder extends BaseSimpleFeedViewCell implements IPhotosViewHolderType, CommonCellAbility {
    public final C01GW Y0;
    public final C696330RTb Z0;
    public C0RH8 a1;
    public String b1;
    public final C01GW c1;

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return 6;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean LLZZZIL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void fadeInWidgetContainer() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gq() {
        return "cell_photos";
    }

    public final PhotoViewModelV2 B1() {
        return (PhotoViewModelV2) this.Y0.getValue();
    }

    public final void C1() {
        C721190SQr.LIZ.getClass();
        B1().LQ2();
        if (this.Z0.LLJI == -1) {
            F1(false);
            IAdPhotoModeService iAdPhotoModeServiceZ1 = z1();
            if (iAdPhotoModeServiceZ1 != null) {
                iAdPhotoModeServiceZ1.LJIJJLI(false, System.currentTimeMillis(), null);
            }
        }
    }

    @Override // X.C0RH5
    public FeedVideoAssem LJJLIIIJJIZ() {
        return new FeedPhotoModeAssem(this.f363e0, new AwS555S0100000_11(this, 971), this.C0, this.Z0);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLLLZZ() {
        VideoItemParams videoItemParams = this.LLJILLL;
        if (videoItemParams != null) {
            int i = PhotoCellGradualComponent.LLLIILIL;
            if (C0RKI.LIZ(videoItemParams)) {
                return;
            }
        }
        super.LLLLLLZZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean LLLZ() {
        if (!C0T1R.LJFF(this.LLJJ)) {
            return true;
        }
        boolean z = !B1().LLJJ;
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPhotosViewHolderV2 shouldResumePlayerOnResume resumePlayer: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void eE1() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLJJ
            r2 = 1
            if (r0 == 0) goto L1a
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r0)
            if (r0 != r2) goto L1a
            X.01GW r0 = X.C1096304Qn.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            return
        L1a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLJJ
            if (r0 == 0) goto L25
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r0)
            if (r0 != r2) goto L25
        L24:
            return
        L25:
            X.0RF0 r0 = r3.LLJILJILJ
            java.lang.String r1 = r0.LJIIIZ
            X.01GW r0 = X.C07TO.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.experiment.PhotoModeProfileAreaSwipeModel r0 = (com.ss.android.ugc.aweme.experiment.PhotoModeProfileAreaSwipeModel) r0
            boolean r0 = r0.enableFling
            if (r0 == 0) goto L3c
            boolean r0 = X.C07TO.LIZ(r1)
            if (r0 != 0) goto L3c
            return
        L3c:
            X.0RF0 r0 = r3.LLJILJILJ
            java.lang.String r1 = r0.LJIIIZ
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8b
            X.0RF0 r0 = r3.LLJILJILJ
            int r0 = r0.LJIIJ
            if (r0 != 0) goto L8b
            r1 = 1
        L4f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLJJ
            int r0 = X.C0ST8.LIZJ(r0)
            if (r0 != r2) goto L88
            if (r1 == 0) goto L24
            boolean r0 = X.C0SKM.LIZIZ()
            if (r0 != 0) goto L24
            int r1 = X.C0RHE.LIZ()
            r0 = 6
            if (r1 != r0) goto L24
        L66:
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r3.B1()
            X.002o r0 = r0.getState()
            X.0S9P r0 = (X.C0S9P) r0
            int r1 = r0.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLJJ
            int r0 = X.C0ST8.LIZJ(r0)
            int r0 = r0 - r2
            if (r1 != r0) goto L8d
            boolean r0 = X.C0RHE.LIZJ()
            if (r0 != 0) goto L24
            boolean r0 = X.C0RHE.LIZIZ()
            if (r0 == 0) goto L8d
            return
        L88:
            if (r1 == 0) goto L8d
            goto L66
        L8b:
            r1 = 0
            goto L4f
        L8d:
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r3)
            java.lang.Class<com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility> r0 = com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility.class
            r2 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.main.FlingGestureAbility r0 = (com.ss.android.ugc.aweme.main.FlingGestureAbility) r0
            if (r0 == 0) goto L9f
            r0.eE1()
        L9f:
            boolean r0 = X.C297720Bli.LIZ()
            if (r0 == 0) goto Laf
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r3.n()
        La9:
            if (r0 == 0) goto Lae
            r0.eE1()
        Lae:
            return
        Laf:
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r3)
            java.lang.Class<com.ss.android.ugc.aweme.base.HomePageViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.HomePageViewPagerAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.main.FlingGestureAbility r0 = (com.ss.android.ugc.aweme.main.FlingGestureAbility) r0
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder.eE1():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean l1() {
        if (!C0T1R.LJFF(this.LLJJ)) {
            return false;
        }
        if (C304280BwI.LIZIZ()) {
            IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoModeAbility.class, null);
            return Intrinsics.LJFF(iPhotoModeAbility != null ? Boolean.valueOf(iPhotoModeAbility.Av2()) : ((C0S9P) B1().getState()).LLIZ, Boolean.TRUE);
        }
        Boolean bool = ((C0S9P) B1().getState()).LLIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.cell.BaseSimpleFeedViewCell
    public final C0RH4 p1() {
        return new C0RH4() { // from class: X.0RHB
            public boolean LIZ;

            @Override // X.C0RH4
            public final void LIZIZ() {
            }

            @Override // X.C0RH4
            public final void LJJIIJZLJL() {
                this.LIZ = true;
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    iAdPhotoModeServiceZ1.LJJIII(System.currentTimeMillis());
                }
                this.LIZIZ.EN1();
            }

            @Override // X.C0RH4
            public final void LJJIIZ() {
                this.LIZ = false;
            }

            @Override // X.C0RH4
            public final void LLIIII() {
            }

            @Override // X.C0RH4
            public final void Z1() {
            }

            @Override // X.C0RH4
            public final void LJII() {
                this.LIZIZ.eE1();
            }

            @Override // X.C0RH4
            public final void LJJIII() {
                HomePageViewPagerAbility homePageViewPagerAbilityN;
                PhotoModeImageInfo photoModeImageInfo;
                List<PhotoModeImageUrlModel> imageList;
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                    Aweme aweme = feedPhotosViewHolder.LLJJ;
                    iAdPhotoModeServiceZ1.LJIIZILJ((aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null) ? 0 : imageList.size(), System.currentTimeMillis(), feedPhotosViewHolder.LLJJ);
                    iAdPhotoModeServiceZ1.LJIIJ(null);
                }
                this.LIZIZ.EN1();
                FeedPhotosViewHolder feedPhotosViewHolder2 = this.LIZIZ;
                C0RH8 c0rh8 = feedPhotosViewHolder2.a1;
                if (c0rh8 != null && (homePageViewPagerAbilityN = feedPhotosViewHolder2.n()) != null) {
                    homePageViewPagerAbilityN.yT(c0rh8);
                }
                feedPhotosViewHolder2.a1 = null;
            }

            @Override // X.C0RH4
            public final void LJJJJJL() {
                FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                if (feedPhotosViewHolder.Z0.LLJI == -1) {
                    feedPhotosViewHolder.F1(false);
                    IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                    if (iAdPhotoModeServiceZ1 != null) {
                        iAdPhotoModeServiceZ1.LJIJJLI(false, System.currentTimeMillis(), null);
                    }
                }
            }

            @Override // X.C0RH4
            public final void LLFF() {
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    iAdPhotoModeServiceZ1.LJIJJLI(false, System.currentTimeMillis(), null);
                }
                this.LIZIZ.eE1();
            }

            @Override // X.C0RH4
            public final void onDestroyView() {
                HomePageViewPagerAbility homePageViewPagerAbilityN;
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                    iAdPhotoModeServiceZ1.LJJIII(System.currentTimeMillis());
                    IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                    Fragment fragmentLIZLLL = iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(feedPhotosViewHolder.LLJJIII) : null;
                    if (C1591220rVg.LIZLLL() || fragmentLIZLLL != null) {
                        iAdPhotoModeServiceZ1.LIZ(C1558420qem.LIZIZ(feedPhotosViewHolder));
                    }
                }
                FeedPhotosViewHolder feedPhotosViewHolder2 = this.LIZIZ;
                C0RH8 c0rh8 = feedPhotosViewHolder2.a1;
                if (c0rh8 != null && (homePageViewPagerAbilityN = feedPhotosViewHolder2.n()) != null) {
                    homePageViewPagerAbilityN.yT(c0rh8);
                }
                feedPhotosViewHolder2.a1 = null;
            }

            @Override // X.C0RH4
            public final void onPause() {
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    iAdPhotoModeServiceZ1.LJJIII(System.currentTimeMillis());
                }
                FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) feedPhotosViewHolder.c1.getValue()).LIZJ(feedPhotosViewHolder.LLLLLLLLLL, feedPhotosViewHolder.LLJJ, feedPhotosViewHolder.LLJILJILJ.LJIIIZ, true);
                if (interfaceC1008930cMVLIZJ != null) {
                    interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(false));
                }
            }

            @Override // X.C0RH4
            public final void onResume() {
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    iAdPhotoModeServiceZ1.LJIJJLI(false, System.currentTimeMillis(), null);
                }
                this.LIZIZ.eE1();
                FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) feedPhotosViewHolder.c1.getValue()).LIZJ(feedPhotosViewHolder.LLLLLLLLLL, feedPhotosViewHolder.LLJJ, feedPhotosViewHolder.LLJILJILJ.LJIIIZ, true);
                if (interfaceC1008930cMVLIZJ != null) {
                    interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(true));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0Ias, X.0RH8] */
            @Override // X.C0RH4
            public final void LIZ(String str) {
                int size;
                int size2;
                List<PhotoModeImageUrlModel> imageList;
                PhotoModeImageInfo photoModeImageInfo;
                List<PhotoModeImageUrlModel> imageList2;
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                    iAdPhotoModeServiceZ1.reset();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Aweme aweme = feedPhotosViewHolder.LLJJ;
                    if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList2 = photoModeImageInfo.getImageList()) != null) {
                        size = imageList2.size();
                    } else {
                        size = 0;
                    }
                    iAdPhotoModeServiceZ1.LJIJJLI(true, jCurrentTimeMillis, Integer.valueOf(size));
                    Aweme aweme2 = feedPhotosViewHolder.LLJJ;
                    if (aweme2 != null) {
                        PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
                        if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                            size2 = imageList.size();
                        } else {
                            size2 = 0;
                        }
                        iAdPhotoModeServiceZ1.LJJIJIL(size2, aweme2);
                    }
                    Aweme aweme3 = feedPhotosViewHolder.LLJJ;
                    if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3)) {
                        iAdPhotoModeServiceZ1.LJIIJ(C1558420qem.LIZIZ(feedPhotosViewHolder));
                    }
                }
                final FeedPhotosViewHolder feedPhotosViewHolder2 = this.LIZIZ;
                feedPhotosViewHolder2.getClass();
                final C118300cf c118300cf = new C118300cf();
                c118300cf.element = -1;
                ?? r1 = new InterfaceC469360Ias() { // from class: X.0RH8
                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                        if (i == 1) {
                            if (c118300cf.element != i) {
                                feedPhotosViewHolder2.B1().wQ2();
                                c118300cf.element = i;
                                return;
                            }
                            return;
                        }
                        if (i != 0 || c118300cf.element == i) {
                            return;
                        }
                        feedPhotosViewHolder2.B1().xQ2();
                        c118300cf.element = i;
                    }
                };
                HomePageViewPagerAbility homePageViewPagerAbilityN = feedPhotosViewHolder2.n();
                if (homePageViewPagerAbilityN != 0) {
                    homePageViewPagerAbilityN.Jk1(r1);
                }
                feedPhotosViewHolder2.a1 = r1;
                this.LIZIZ.b1 = str;
            }

            @Override // X.C0RH4
            public final void LJJIL(C0R6M c0r6m) {
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    if (Intrinsics.LJFF(c0r6m.LIZIZ, "HOME")) {
                        iAdPhotoModeServiceZ1.LJIJJLI(false, System.currentTimeMillis(), null);
                    } else {
                        iAdPhotoModeServiceZ1.LJJIII(System.currentTimeMillis());
                    }
                }
            }

            @Override // X.C0RH4
            public final void LJJIZ(C0RHA c0rha) {
                String strCQ2;
                IAdPhotoModeService iAdPhotoModeServiceZ1 = this.LIZIZ.z1();
                if (iAdPhotoModeServiceZ1 != null) {
                    if (c0rha.LIZ) {
                        iAdPhotoModeServiceZ1.LJIJJLI(false, System.currentTimeMillis(), null);
                    } else {
                        iAdPhotoModeServiceZ1.LJJIII(System.currentTimeMillis());
                    }
                }
                FeedPhotosViewHolder feedPhotosViewHolder = this.LIZIZ;
                String str = feedPhotosViewHolder.b1;
                C19EG activity = feedPhotosViewHolder.getActivity();
                if (activity != null) {
                    strCQ2 = C343710Ddh.LIZ(activity).CQ2();
                } else {
                    strCQ2 = null;
                }
                if (Intrinsics.LJFF(str, strCQ2) && c0rha.LIZ && !this.LIZ) {
                    this.LIZIZ.eE1();
                } else {
                    this.LIZIZ.EN1();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void permitEventReport() {
        this.Z0.LLJIJIL = false;
    }

    public final IAdPhotoModeService z1() {
        Aweme aweme = this.LLJJ;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return null;
        }
        return (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
    }

    public final void EN1() {
        FlingGestureAbility flingGestureAbility = (FlingGestureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), DetailFlingGestureAbility.class, null);
        if (flingGestureAbility != null) {
            flingGestureAbility.EN1();
        }
        FlingGestureAbility flingGestureAbilityN = C297720Bli.LIZ() ? n() : (FlingGestureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), HomePageViewPagerAbility.class, null);
        if (flingGestureAbilityN != null) {
            flingGestureAbilityN.EN1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean LLLZZIL() {
        boolean z = !B1().LLJJ;
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPhotosViewHolderV2 shouldPausePlayerOnPause pausePlayer: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        return z;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final int getCurrentPlayPosition() {
        IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoModeAbility.class, null);
        if (iPhotoModeAbility != null) {
            return iPhotoModeAbility.fj1();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final View.OnTouchListener q5() {
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoSlidesAbility.class, null);
        if (iPhotoSlidesAbility != null) {
            return iPhotoSlidesAbility.Hg();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        super.unBind();
    }

    public FeedPhotosViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.Y0 = C737910Sx3.LIZLLL(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(497), EnumC452301pR.SYNCHRONIZED);
        this.Z0 = new C696330RTb(c0rf0.LJIIIZ, C0SUC.LIZ(this.LLLLLLLLLL), 3);
        this.c1 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(222));
    }

    public final void D1(boolean z) {
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPhotosViewHolderV2 onVisibleChanged ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        if (z) {
            F1(false);
            eE1();
            B1().PQ2();
        } else {
            F1(true);
            EN1();
            PhotoViewModelV2.JQ2(B1());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void F0(String str) {
        B1().LLILLJJLI.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(boolean r16) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder.F1(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLZZJLIL(View view) throws Exception {
        FrameLayout frameLayout;
        super.LLZZJLIL(view);
        if (!Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "homepage_friends") && !Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "homepage_follow")) {
            if ((C994010byR.LIZIZ() && Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "homepage_hot")) || (frameLayout = this.LLLLII) == null) {
                return;
            }
            frameLayout.setBackground(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0RDR
    public final void Qi1(Video video) {
        View viewVy1 = Vy1();
        if (viewVy1 != null) {
            C786410Ut5.LJLLLLLL(8, viewVy1);
        }
        VideoCoverComponentTemp videoCoverComponentTemp = this.LLJLLIL;
        if (videoCoverComponentTemp != null) {
            videoCoverComponentTemp.LLJILJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final boolean declineReport(String str) {
        return this.Z0.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final long getSavedDuration(String str) {
        return this.Z0.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void setCurrentPlayPosition(int i) {
        IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoModeAbility.class, null);
        if (iPhotoModeAbility != null) {
            iPhotoModeAbility.kH0(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.cell.BaseSimpleFeedViewCell
    public final void y1(boolean z) {
        super.y1(z);
        if (z) {
            B1().getClass();
            B1().PQ2();
            F1(false);
        } else {
            B1().getClass();
            PhotoViewModelV2.JQ2(B1());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        String str;
        VideoItemParams videoItemParams = this.LLJILLL;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "general_search") && aweme != null) {
            C720300SNg.LIZIZ(aweme);
        }
        B1().LLJJIJIIJIL = aweme;
        super.LJJJJ(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.cell.BaseSimpleFeedViewCell
    public final void s1(boolean z, C0R6M c0r6m) {
        super.s1(z, c0r6m);
        if (z && Intrinsics.LJFF(this.b1, "HOME")) {
            F1(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void saveDuration(long j, String str) {
        this.Z0.LLJILJILJ += j;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void setStartTime(long j, String str) {
        this.Z0.LLILZIL = Long.valueOf(j);
    }
}
