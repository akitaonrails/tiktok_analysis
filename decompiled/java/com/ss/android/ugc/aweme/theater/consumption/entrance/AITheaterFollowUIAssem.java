package com.ss.android.ugc.aweme.theater.consumption.entrance;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01GW;
import X.C0B10;
import X.C0B7Z;
import X.C0MXX;
import X.C0MXY;
import X.C0MXZ;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A5L;
import X.C1E3D;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C291001Au;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C548880Lfq;
import X.C548910Lft;
import X.C549430Lgj;
import X.C550740Liq;
import X.C569970MXb;
import X.C569980MXc;
import X.C570060MXk;
import X.C570070MXl;
import X.C570110MXp;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC609120Nuo;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC548750Lfd;
import X.InterfaceC609180Nuu;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Avatar;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.ImageThumb;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterFollowUIAssem extends BaseCellSlotComponent<AITheaterFollowUIAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final InterfaceC1731706qJ LLJLLIL;
    public String LLJLLL;
    public final C01GW LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AITheaterFollowUIAssem.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AITheaterFollowUIAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StatePassingVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS552S0100000_8(c19719912DlLIZ, 409), null, AFwS239S0000000_8.get$arr$(144));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 408));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.nh;
    }

    public final C0MXY Bp() {
        return (C0MXY) this.LLJZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(this, LLJZIJLIL[0]), new C2217381BqS() { // from class: X.0MXj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C570070MXl) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS291S0000000_8.get$arr$(14), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        final boolean z;
        List<CameoInfo> cameoInfo;
        List<CameoInfo> cameoInfo2;
        C0MXZ c569980MXc;
        UserBaseInfo userBaseInfo;
        Avatar avatar;
        ImageThumb imageThumb;
        List<String> urlList;
        Object objLJJJLL;
        C570060MXk c570060MXk;
        String str;
        InterfaceC609180Nuu interfaceC609180Nuu;
        final VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLLL = videoItemParams2.getAweme().getAid();
        if (((Boolean) C0B10.LIZ.getValue()).booleanValue()) {
            C291001Au<C570060MXk> c291001Au = ((C570070MXl) ((AssemViewModel) this.LLJLLIL.getValue(this, LLJZIJLIL[0])).getState()).LL;
            if (c291001Au != null) {
                c570060MXk = c291001Au.LIZ;
                if (c570060MXk != null) {
                    str = c570060MXk.LIZ;
                }
                if (Intrinsics.LJFF(str, this.LLJLLL) && c570060MXk != null) {
                    interfaceC609180Nuu = c570060MXk.LIZIZ;
                    if ((interfaceC609180Nuu instanceof C570110MXp) && ((C570110MXp) interfaceC609180Nuu).LIZ == EnumC609120Nuo.UPVOTE_INFO_NEW_STYLE) {
                        C339190DRl.LIZIZ(Bp());
                        return;
                    }
                }
            } else {
                c570060MXk = null;
            }
            str = null;
            if (Intrinsics.LJFF(str, this.LLJLLL)) {
                interfaceC609180Nuu = c570060MXk.LIZIZ;
                if (interfaceC609180Nuu instanceof C570110MXp) {
                    C339190DRl.LIZIZ(Bp());
                    return;
                }
            }
        }
        if (videoItemParams2.getAweme().getAllowAIRemix() != 1 && !((Boolean) C0B7Z.LIZ.getValue()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        AITheaterInfo aITheaterInfo = videoItemParams2.getAweme().aiTheaterInfo;
        final IAITheaterCreationLauncher.EnterParams enterParams = new IAITheaterCreationLauncher.EnterParams(null, null, C549430Lgj.LIZIZ(videoItemParams2.getAweme()), null, AIGCEntranceInfo.LIZ(C550740Liq.LIZ("remix_feed_post", AIGC.AICreationSceneName.REMIX_FEED_POST.INSTANCE, new AIGC.RefPageName.Custom(videoItemParams2.mEventType), false), null, null, 0, null, null, false, false, false, null, null, videoItemParams2.mEventType, null, null, null, false, false, 1046527), 11, null);
        if (aITheaterInfo != null && (cameoInfo = aITheaterInfo.getCameoInfo()) != null && !cameoInfo.isEmpty()) {
            C786410Ut5.LJLLLLLL(0, Bp());
            if (aITheaterInfo == null || (cameoInfo2 = aITheaterInfo.getCameoInfo()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (CameoInfo cameoInfo3 : cameoInfo2) {
                if (cameoInfo3 != null && (userBaseInfo = cameoInfo3.getUserBaseInfo()) != null && (avatar = userBaseInfo.getAvatar()) != null && (imageThumb = avatar.getImageThumb()) != null && (urlList = imageThumb.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                    arrayList.add(objLJJJLL);
                }
            }
            C0MXX c0mxx = new C0MXX();
            c0mxx.avatars(arrayList);
            if (z) {
                c569980MXc = new C569980MXc();
            } else {
                c569980MXc = C569970MXb.LIZIZ;
            }
            c0mxx.extraViewType(c569980MXc);
            c0mxx.avatarSizeDp(34);
            c0mxx.hollowContentSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            c0mxx.hollowIconSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            c0mxx.hollowOffsetPx(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.37d))), -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.09d))));
            c0mxx.showLimit(3);
            c0mxx.outlineWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c0mxx.overlapSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.53d))));
            c0mxx.build();
            Bp().LIZ(c0mxx);
            C2271391DvN.LIZ(Bp(), (C1A5L) C2271381DvM.S0.getValue());
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0M7b
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    Fragment fragmentLJI;
                    FragmentManager childFragmentManager;
                    C19EG activity;
                    IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
                    if (view != null) {
                        if (z) {
                            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                            C1E3C c1e3c = C1E3C.LJIIIIZZ;
                            InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParams);
                            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(enterParams, 679);
                            c548880Lfq.getClass();
                            C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, awS587S0100000_8);
                            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                            if (fragmentLJI2 != null && (activity = fragmentLJI2.getActivity()) != null) {
                                IAITheaterFeatureService.LIZ.getClass();
                                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                                if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
                                    iAITheaterCreationLauncherLIZ.LJFF(enterParams, activity, false);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C19EG c19egLIZ = C724240Sb0.LIZ(this);
                        if ((c19egLIZ == null || (childFragmentManager = c19egLIZ.getSupportFragmentManager()) == null) && ((fragmentLJI = C724240Sb0.LJI(this)) == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null)) {
                            return;
                        }
                        C561570M0t.LIZ(childFragmentManager, videoItemParams2.getAweme(), videoItemParams2.mEventType);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, Bp());
            if (!z) {
                return;
            }
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C1E3D c1e3d = C1E3D.LJIIIIZZ;
            InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParams);
            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(enterParams, 680);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c1e3d, interfaceC548750LfdLIZ, awS587S0100000_8);
            return;
        }
        C339190DRl.LIZIZ(Bp());
    }
}
