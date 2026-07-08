package com.ss.android.ugc.aweme.social.creation.edit;

import X.AbstractC1453750nvx;
import X.AnonymousClass0801;
import X.C01GW;
import X.C0CHW;
import X.C0FGC;
import X.C0FI2;
import X.C0FQX;
import X.C0L2P;
import X.C0LE3;
import X.C0MBA;
import X.C0MGE;
import X.C0MJ8;
import X.C0MT8;
import X.C0MWS;
import X.C122T;
import X.C12WG;
import X.C1402610mbT;
import X.C1403010mc7;
import X.C1411560mpu;
import X.C1414930mvL;
import X.C1429980nJc;
import X.C1432260nNI;
import X.C1439740nZM;
import X.C1440005kM;
import X.C1447800nmM;
import X.C1450870nrJ;
import X.C1453840nw6;
import X.C1454460nx6;
import X.C1456290o03;
import X.C1457310o1h;
import X.C1458410o3T;
import X.C1459710o5Z;
import X.C14EU;
import X.C15M9;
import X.C15MA;
import X.C1640590snJ;
import X.C1650090t2d;
import X.C1653260t7k;
import X.C1655390tBB;
import X.C1656650tDD;
import X.C1662160tM6;
import X.C19565911gn;
import X.C199Y;
import X.C19EG;
import X.C19EH;
import X.C1B4F;
import X.C1DRG;
import X.C201955140j;
import X.C20622515mp;
import X.C20684815ws;
import X.C214798194i;
import X.C2198841B3y;
import X.C2344009Gk;
import X.C298330Bmh;
import X.C299100Bnw;
import X.C337180DJs;
import X.C363500EMy;
import X.C385670FAf;
import X.C452501pT;
import X.C524780Ki4;
import X.C538320L9i;
import X.C560320LyI;
import X.C560380LyO;
import X.C560470LyX;
import X.C579950Mor;
import X.C786410Ut5;
import X.C856140XiG;
import X.C860470XpF;
import X.C863370Xtv;
import X.EnumC1429920nJW;
import X.EnumC560450LyV;
import X.InterfaceC1446740nke;
import X.InterfaceC1452360nti;
import X.InterfaceC1452540nu0;
import X.InterfaceC1455230nyL;
import X.InterfaceC1455850nzL;
import X.InterfaceC1456650o0d;
import X.InterfaceC1456720o0k;
import X.InterfaceC1457660o2G;
import X.InterfaceC2180241AUk;
import X.InterfaceC2217461Bqa;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.service.IStoryAlbumEnterEditTimingService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import joo.f;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import l5a.a;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialVideoEditContainerScene extends VideoPublishEditContainerScene implements InterfaceC524950KiL, C0MGE, C0MWS, InterfaceC1452540nu0 {
    public VideoPublishEditModel LLJLILLLLZIIL;
    public InterfaceC1456650o0d LLJLL;
    public C1439740nZM LLJZ;
    public C1DRG LLJZIJLIL;
    public AbstractC1453750nvx LLL;
    public InterfaceC1446740nke LLLF;
    public InterfaceC1455850nzL LLLFF;
    public InterfaceC1456720o0k LLLFFI;
    public InterfaceC1452360nti LLLFZ;
    public ViewGroup LLLI;
    public ViewGroup LLLII;
    public SurfaceView LLLIIII;
    public boolean LLLIIIIL;
    public int LLLIIIL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(173));
    public final ArrayList<InterfaceC484050IyZ> LLJLLIL = new ArrayList<>();
    public final ArrayList<InterfaceC362610EJn> LLJLLL = new ArrayList<>();
    public final String LLLIIL = "";
    public final C01GW LLLIILIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(174));
    public final C1456290o03 LLLIL = C1456290o03.LL;

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return null;
    }

    @Override // X.InterfaceC1452540nu0
    public final void LLLJIL() {
        C337180DJs.LIZ(this.LLLIIII);
    }

    public final InterfaceC2180241AUk LLLLLLL() {
        C385670FAf<InterfaceC2180241AUk> c385670FAfAz2;
        InterfaceC1455850nzL interfaceC1455850nzL = this.LLLFF;
        if (interfaceC1455850nzL == null || (c385670FAfAz2 = interfaceC1455850nzL.az2()) == null) {
            return null;
        }
        return c385670FAfAz2.LIZJ();
    }

    public final boolean LLLLLLLLLL() {
        Activity activity = this.mActivity;
        if (activity == null || !(activity instanceof C199Y)) {
            return false;
        }
        Bundle argumentsSafely = getArgumentsSafely();
        if (argumentsSafely == null) {
            argumentsSafely = new Bundle();
        }
        return C0L2P.LIZ(argumentsSafely);
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() {
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        String str = videoPublishEditModel.commerceData;
        if (str != null) {
            C1440005kM.LIZ(new AnonymousClass0801(str));
        } else {
            VideoPublishEditModel videoPublishEditModel2 = this.LLJLILLLLZIIL;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            if (s.LJIIIIZZ(videoPublishEditModel2.creativeModel.pugcTemplateData.isFromCreateTemplate)) {
                C1440005kM.LIZ(new AnonymousClass0801(null));
            }
        }
        if (LLLLLLLLLL()) {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLJL();
                if (isLastScene()) {
                    requireActivity().finish();
                } else {
                    if (C20622515mp.LJ(this) != null) {
                        setResult(0, null);
                    }
                    if (Intrinsics.LJFF(navigationSceneLIZ.LLLLIIIILLL(), this)) {
                        LJLL(false);
                        C560320LyI c560320LyI = new C560320LyI();
                        c560320LyI.LIZ = new C214798194i();
                        navigationSceneLIZ.LLLLLLIL(c560320LyI.LIZ());
                    } else {
                        navigationSceneLIZ.remove(this);
                    }
                }
            }
        } else {
            super.finish();
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LLJLILLLLZIIL;
        VideoPublishEditModel videoPublishEditModel4 = videoPublishEditModel3 != null ? videoPublishEditModel3 : null;
        a.LIZIZ.LIZ(videoPublishEditModel4.getCreationId());
        C1440005kM.LIZ(new C0MT8(videoPublishEditModel4, SocialVideoEditContainerScene.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nm() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene.nm():void");
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        AbstractC1453750nvx abstractC1453750nvx;
        InterfaceC2180241AUk interfaceC2180241AUkLLLLLLL;
        C1DRG c1drgLLLLLILLIL;
        InterfaceC1457660o2G interfaceC1457660o2G;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        FragmentManager supportFragmentManager2;
        C19EG c19eg = (C19EG) this.mActivity;
        Fragment fragmentLJJJJZ = (c19eg == null || (supportFragmentManager2 = c19eg.getSupportFragmentManager()) == null) ? null : supportFragmentManager2.LJJJJZ(R.id.tp8);
        if (fragmentLJJJJZ != null) {
            C19EG c19eg2 = (C19EG) this.mActivity;
            if (c19eg2 != null && (supportFragmentManager = c19eg2.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZ);
                c19ehLJIIJ.LJIIIZ();
            }
            return true;
        }
        if (C299100Bnw.LIZ()) {
            Iterator<InterfaceC362610EJn> it2 = this.LLJLLL.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        AbstractC1453750nvx abstractC1453750nvx2 = this.LLL;
        if (abstractC1453750nvx2 == null || abstractC1453750nvx2.LLLLLILLIL() == null || !((abstractC1453750nvx = this.LLL) == null || (c1drgLLLLLILLIL = abstractC1453750nvx.LLLLLILLIL()) == null || (interfaceC1457660o2G = (InterfaceC1457660o2G) c1drgLLLLLILLIL.LJIIL(null, InterfaceC1457660o2G.class)) == null || !interfaceC1457660o2G.KP2())) {
            return true;
        }
        if (C0CHW.LIZ()) {
            AbstractC1453750nvx abstractC1453750nvx3 = this.LLL;
            if (abstractC1453750nvx3 != null) {
                abstractC1453750nvx3.LLLLIIIILLL();
                return true;
            }
        } else if (LLLLLLL() != null && (interfaceC2180241AUkLLLLLLL = LLLLLLL()) != null) {
            interfaceC2180241AUkLLLLLLL.KV0();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C1656650tDD.LIZJ("edit");
        InterfaceC1452360nti interfaceC1452360nti = this.LLLFZ;
        if (interfaceC1452360nti != null) {
            interfaceC1452360nti.i9(null);
        }
        super.onDestroyView();
        C856140XiG.LIZIZ("publish");
        if (C0FQX.LIZIZ) {
            C0FQX.LIZIZ = false;
        } else {
            C1403010mc7.LIZ.getMusicService().Xk(new InterfaceC1455230nyL() { // from class: X.0nzX
                @Override // X.InterfaceC1455230nyL
                public final MusicBuzModel LIZIZ() {
                    VideoPublishEditModel videoPublishEditModel = this.LIZ.LLJLILLLLZIIL;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    return videoPublishEditModel.creativeModel.musicBuzModel;
                }

                @Override // X.InterfaceC1455230nyL
                public final void LIZ(AVMusic aVMusic) {
                    VideoPublishEditModel videoPublishEditModel = this.LIZ.LLJLILLLLZIIL;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    C1452640nuA.LJII(aVMusic, false, videoPublishEditModel.creativeModel.musicBuzModel);
                }
            });
            C1403010mc7.LIZ.getMusicService().dl();
            C1458410o3T.LJIIJJI(false);
        }
        C1459710o5Z.LJIIJJI = true;
        C0FI2.LJIJJ();
        C0FI2.LJIJJLI("editor_pro_font_panel");
        C1640590snJ.LIZ.getClass();
        ((ArrayList) C1640590snJ.LIZIZ).clear();
        C524780Ki4.LIZ.leave(requireActivity(), "video_edit");
        f fVar = f.LIZ;
        Activity activityRequireActivity = requireActivity();
        fVar.getClass();
        f.LIZ(activityRequireActivity);
        C863370Xtv.LIZ("normal").LJFF("at_edit_page");
        C15MA c15ma = C15MA.LL;
        if (C15MA.LIZLLL()) {
            C15M9 c15m9 = C15MA.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
            c15m9.LIZ(Boolean.FALSE);
            c15ma.setInCommercialSoundPage(false);
        }
        C0FI2.LJIJJ().LJIIIIZZ = null;
        C0FI2.LJIJJLI("editor_pro_font_panel").LJIIIIZZ = null;
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (C1453840nw6.LJFF(videoPublishEditModel)) {
            SocialEditLayoutPreloadApi socialEditLayoutPreloadApi = (SocialEditLayoutPreloadApi) PluggableExtentionKt.pluggableSpi$default(SocialEditLayoutPreloadApi.class, false, false, false, 14, null);
            if (socialEditLayoutPreloadApi != null) {
                socialEditLayoutPreloadApi.clearCache();
            }
        } else {
            ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadServiceForEditPage.class, false, false, false, 14, null);
            if (iLayoutPreloadServiceForEditPage != null) {
                iLayoutPreloadServiceForEditPage.clearCache();
            }
        }
        C1414930mvL.LIZ.getClass();
        C1414930mvL.LIZIZ = null;
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "FixSegmentsEmptyCrashHelper", "clearOriginSegmentsList");
        C538320L9i.LIZ.clear();
        C363500EMy.LIZ.getClass();
        C363500EMy.LJIIIIZZ = null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        String string;
        C201955140j.LIZJ(C1662160tM6.LIZIZ, "VEVideoPublishEditActivity onResume");
        super.onResume();
        C1656650tDD.LIZLLL("edit");
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        videoPublishEditModel.setCompileFinished(false);
        VideoPublishEditModel videoPublishEditModel2 = this.LLJLILLLLZIIL;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        if (C1453840nw6.LIZLLL(videoPublishEditModel2)) {
            C12WG.LIZJ(this, new ARunnableS108S0100000_8(this, 65));
        }
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SocialVideoEditContainerScene onResume");
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.EDIT;
        VideoPublishEditModel videoPublishEditModel3 = this.LLJLILLLLZIIL;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        C560380LyO.LJIIZILJ(enumC560450LyV, null, videoPublishEditModel3);
        C560380LyO.LJIILLIIL(new C560470LyX(enumC560450LyV, System.currentTimeMillis()));
        VideoPublishEditModel videoPublishEditModel4 = this.LLJLILLLLZIIL;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        C1432260nNI.LIZ(videoPublishEditModel4);
        if (C298330Bmh.LIZ()) {
            C524780Ki4.LIZ.end("av_video_edit", "onResume");
        } else {
            C524780Ki4.LIZ.step("av_video_edit", "onResume");
        }
        this.LLLIIIIL = true;
        InterfaceC2180241AUk interfaceC2180241AUkLLLLLLL = LLLLLLL();
        if (interfaceC2180241AUkLLLLLLL != null) {
            interfaceC2180241AUkLLLLLLL.jn0(false);
        }
        VEMem.getInstance().uploadVirtualMemSize(2);
        Bundle bundle = this.mArguments;
        long j = bundle != null ? bundle.getLong("extra_start_enter_edit_page", 0L) : 0L;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("extra_start_enter_edit_reason")) != null && TextUtils.equals(string, "click_next")) {
            C1650090t2d c1650090t2d = (C1650090t2d) this.LLLIILIL.getValue();
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            VideoPublishEditModel videoPublishEditModel5 = this.LLJLILLLLZIIL;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            c1650090t2d.LIZ(videoPublishEditModel5.getPreviewInfo().getPreviewVideoLength(), jCurrentTimeMillis, "click_record_next", true);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.getBoolean("click_next_in_album_time", false)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            VideoPublishEditModel videoPublishEditModel6 = this.LLJLILLLLZIIL;
            if (videoPublishEditModel6 == null) {
                videoPublishEditModel6 = null;
            }
            C1653260t7k.LIZLLL(null, jCurrentTimeMillis2, videoPublishEditModel6.getPreviewInfo().getPreviewVideoLength(), "click_next_in_album");
        }
        VideoPublishEditModel videoPublishEditModel7 = this.LLJLILLLLZIIL;
        if (videoPublishEditModel7 == null) {
            videoPublishEditModel7 = null;
        }
        a.LIZIZ.LIZIZ(videoPublishEditModel7.getCreationId(), new C1429980nJc(EnumC1429920nJW.ENTER_EDIT, videoPublishEditModel7, null), this.mActivity);
        kF(this.LLLIL);
        Lifecycle lifecycle = getLifecycle();
        IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class);
        Activity activityRequireActivity = requireActivity();
        VideoPublishEditModel videoPublishEditModel8 = this.LLJLILLLLZIIL;
        String str = (videoPublishEditModel8 == null ? null : videoPublishEditModel8).mShootWay;
        if (videoPublishEditModel8 == null) {
            videoPublishEditModel8 = null;
        }
        String enterFrom = videoPublishEditModel8.getEnterFrom();
        VideoPublishEditModel videoPublishEditModel9 = this.LLJLILLLLZIIL;
        lifecycle.addObserver(iComplianceBusinessService.LJJJJLI(activityRequireActivity, 2131833819, str, enterFrom, (videoPublishEditModel9 != null ? videoPublishEditModel9 : null).getCreationId(), null));
        C12WG.LIZLLL(this, new ARunnableS122S0100000_22(this, 45), 300L);
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService = (IStoryAlbumEnterEditTimingService) this.LLJLIL.getValue();
        if (iStoryAlbumEnterEditTimingService != null) {
            iStoryAlbumEnterEditTimingService.LIZ();
        }
    }

    @Override // X.InterfaceC1452540nu0
    public final void r7() {
        C337180DJs.LIZJ(this.LLLIIII);
    }

    public SocialVideoEditContainerScene() {
        C19565911gn.LIZ();
        C122T.LIZ();
        if (!C1411560mpu.LIZIZ) {
            C0FGC.LIZ(2);
        }
    }

    public final boolean LLLLLLJ() {
        Bundle argumentsSafely = getArgumentsSafely();
        if (argumentsSafely == null) {
            argumentsSafely = new Bundle();
        }
        if (!C0L2P.LIZ(argumentsSafely)) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        return !C1453840nw6.LIZLLL(videoPublishEditModel);
    }

    @Override // X.AbstractC214814194y
    public final int getFinishAnimationType() {
        return C1655390tBB.LIZ(getArgumentsSafely(), null);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SocialVideoEditContainerScene onPause");
        j jVar = C524780Ki4.LIZ;
        Activity activityRequireActivity = requireActivity();
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        String str = (videoPublishEditModel == null ? null : videoPublishEditModel).mShootWay;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        jVar.pause(activityRequireActivity, "video_edit", str, videoPublishEditModel.getCreationId());
        C860470XpF.LIZ("tool_edit_page_load");
        VEMem.getInstance().uploadVirtualMemSize(3);
        b8(this.LLLIL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getMMusicPath())) {
            VideoPublishEditModel videoPublishEditModel2 = this.LLJLILLLLZIIL;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            if (videoPublishEditModel2.getMCurMusicLength() <= 0) {
                VideoPublishEditModel videoPublishEditModel3 = this.LLJLILLLLZIIL;
                if (videoPublishEditModel3 == null) {
                    videoPublishEditModel3 = null;
                }
                IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
                VideoPublishEditModel videoPublishEditModel4 = this.LLJLILLLLZIIL;
                if (videoPublishEditModel4 == null) {
                    videoPublishEditModel4 = null;
                }
                videoPublishEditModel3.setMCurMusicLength(musicService.getMusicDuration(videoPublishEditModel4.getMMusicPath()));
            }
        }
        VideoPublishEditModel videoPublishEditModel5 = this.LLJLILLLLZIIL;
        C1402610mbT.LJJJ(videoPublishEditModel5 != null ? videoPublishEditModel5 : null);
        C19EG c19eg = (C19EG) this.mActivity;
        if (c19eg != null) {
            C01GW c01gw = BrightnessManager.LIZ;
            BrightnessManager.LIZ(c19eg, this, C1457310o1h.LIZ);
        }
        C337180DJs.LIZJ(this.LLLI);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final boolean LLLLLIL() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJLLL, 0, interfaceC362610EJn);
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        C337180DJs.LIZ(this.LLLI);
        if (z) {
            LLLJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene
    public final void LLLLLLIL(int i) {
        InterfaceC1452360nti interfaceC1452360nti = this.LLLFZ;
        if (interfaceC1452360nti != null) {
            interfaceC1452360nti.i9(Integer.valueOf(i));
            return;
        }
        ViewGroup viewGroup = this.LLLI;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i);
        }
        ViewGroup viewGroup2 = this.LLLII;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundColor(i);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJLLIL.add(interfaceC484050IyZ);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        InterfaceC1456650o0d interfaceC1456650o0d = this.LLJLL;
        if (interfaceC1456650o0d != null) {
            interfaceC1456650o0d.S3(z);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJLLIL.remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJLLL.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJLLL.add(interfaceC362610EJn);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r35) {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene.onActivityCreated(android.os.Bundle):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C0MBA c0mba) {
        finish();
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        InterfaceC1456650o0d interfaceC1456650o0d = this.LLJLL;
        if (interfaceC1456650o0d != null) {
            interfaceC1456650o0d.p2(z);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C579950Mor c579950Mor) {
        finish();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LLLLLJLJLL(int i, int i2) {
        InterfaceC1456650o0d interfaceC1456650o0d = this.LLJLL;
        if (interfaceC1456650o0d != null) {
            interfaceC1456650o0d.LIZ(i, i2);
        }
        if (!C1454460nx6.LIZ()) {
            C1450870nrJ.LJI = Integer.valueOf(i);
            C1450870nrJ.LJII = Integer.valueOf(i2);
        }
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        CustomStickerInfo customStickerInfo;
        if (intent == null) {
            return;
        }
        if (i == 10004 && i2 == -1 && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
            Effect effect = (Effect) intent.getParcelableExtra("custom_sticker");
            if (effect == null || (customStickerInfo = (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info")) == null) {
                return;
            }
            AbstractC1453750nvx abstractC1453750nvx = this.LLL;
            if (abstractC1453750nvx != null) {
                abstractC1453750nvx.LLLLLLLLLL(effect, customStickerInfo);
            }
        }
        Iterator<InterfaceC484050IyZ> it2 = this.LLJLLIL.iterator();
        while (it2.hasNext() && !it2.next().onActivityResult(i, i2, intent)) {
        }
    }

    public final void LLLLLLLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, C1B4F c1b4f, String str8, String str9) {
        int i;
        if (Intrinsics.LJFF(str8, "image")) {
            i = 1;
        } else {
            i = 2;
        }
        C2344009Gk c2344009GkLIZ = C2198841B3y.LIZ(str3, str4, c1b4f, str5, str6, str7, i, -1, str9);
        c2344009GkLIZ.LJIIIIZZ("enter_from", "video_edit_page");
        VideoPublishEditModel videoPublishEditModel = this.LLJLILLLLZIIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c2344009GkLIZ.LJFF("creation_id", videoPublishEditModel.getCreationId());
        if (str2 != null) {
            c2344009GkLIZ.LJFF("music_id", str2);
        }
        C20684815ws.LJIILLIIL(str, c2344009GkLIZ.LIZ);
    }
}
