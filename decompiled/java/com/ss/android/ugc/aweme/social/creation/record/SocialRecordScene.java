package com.ss.android.ugc.aweme.social.creation.record;

import X.AbstractC2255721DQs;
import X.AnonymousClass0801;
import X.C01GW;
import X.C0AUG;
import X.C0CHQ;
import X.C0EN3;
import X.C0LE3;
import X.C0MWS;
import X.C0MWV;
import X.C0WZX;
import X.C12VA;
import X.C1529670puP;
import X.C1602160rnK;
import X.C1622250sJj;
import X.C1622260sJk;
import X.C1630980sXo;
import X.C1647120sxq;
import X.C1648640t0I;
import X.C1648660t0K;
import X.C1652290t6B;
import X.C1654320t9S;
import X.C1655290tB1;
import X.C1655670tBd;
import X.C1659630tI1;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1688700u2u;
import X.C1837107Hl;
import X.C19A3;
import X.C1DHX;
import X.C1DIC;
import X.C1DPV;
import X.C1DPW;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C214871197d;
import X.C2204961BRm;
import X.C263650AUx;
import X.C281130B0d;
import X.C452501pT;
import X.C560380LyO;
import X.C560470LyX;
import X.C728010Sh5;
import X.C786410Ut5;
import X.C855640XhS;
import X.C860470XpF;
import X.EnumC560450LyV;
import X.EnumC860460XpE;
import X.InterfaceC1621110sHt;
import X.InterfaceC1624140sMm;
import X.InterfaceC1629550sVV;
import X.InterfaceC1650180t2m;
import X.InterfaceC1650190t2n;
import X.InterfaceC1650230t2r;
import X.InterfaceC1655300tB2;
import X.InterfaceC1655310tB3;
import X.InterfaceC1655330tB5;
import X.InterfaceC1655340tB6;
import X.InterfaceC1916320zy2;
import X.InterfaceC2177841ALe;
import X.InterfaceC2254081DKk;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ayh.i5;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.ExtraSession;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordRootView;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.aweme.social.creation.record.SocialRecordScene;
import com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor;
import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModel;
import com.ss.android.ugc.aweme.utils.oh;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import joo.f;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import ln3.a;
import lnn.q;
import lth.o;
import mn3.e0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes26.dex */
public final class SocialRecordScene extends RecordMonitor implements InterfaceC1650180t2m, IPreDownloadMusic, C0MWS {
    public DisplayManager LLLIIL;
    public C1655290tB1 LLLIILIL;
    public int LLLIL;
    public final C01GW LLLILZ;
    public final h0<Boolean> LLLILZJ;
    public final h0<Boolean> LLLILZLLLI;
    public View LLLIZZ;
    public MvChoosePhotoScene LLLJ;
    public NavigationScene LLLJIL;
    public boolean LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public ViewGroup LLLLIIL;
    public final List<InterfaceC362610EJn> LLLLIILL;
    public final List<InterfaceC484050IyZ> LLLLIILLL;
    public final List<InterfaceC1655330tB5> LLLLIL;
    public final List<InterfaceC1655340tB6> LLLLILI;

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final x2 LLLLLLZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLZ(boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLZL() {
        this.LLLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC1650070t2b
    public final String getTag() {
        return "SocialRecordScene";
    }

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return null;
    }

    @Override // X.InterfaceC1452540nu0
    public final void LLLJIL() {
        View view = this.LLLIZZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final int LLLLZLLLI() {
        Display display = Build.VERSION.SDK_INT >= 30 ? requireAppCompatActivity().getDisplay() : C2204961BRm.LLILZIL(requireAppCompatActivity().getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0Hx7O6R728/OF7l+mN7OwWtzeOLti1Z9z7y+YvHk7ofNUj4=", null));
        if (display != null) {
            return display.getRotation();
        }
        return 0;
    }

    public final C1647120sxq LLLZ() {
        return (C1647120sxq) this.LLLILZ.getValue();
    }

    public final C1652290t6B LLLZIIL() {
        return (C1652290t6B) this.LLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final IPreDownloadMusic.PreDownloadMusicData getPreDownloadMusicData() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLJ;
        if (mvChoosePhotoScene == null || mvChoosePhotoScene.mActivity == null) {
            return new IPreDownloadMusic.PreDownloadMusicData(null, null);
        }
        IPreDownloadMusic.PreDownloadMusicData preDownloadMusicData = mvChoosePhotoScene.getPreDownloadMusicData();
        return preDownloadMusicData == null ? new IPreDownloadMusic.PreDownloadMusicData(null, null) : preDownloadMusicData;
    }

    @Override // X.AbstractC214814194y
    public final int getStartAnimationType() {
        return C0MWV.LIZIZ(this.mArguments);
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final boolean isReEnterChoosePhoto() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLJ;
        return mvChoosePhotoScene != null && mvChoosePhotoScene.isReEnterChoosePhoto();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0tB1, android.hardware.display.DisplayManager$DisplayListener] */
    @Override // com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor, com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        this.LLJLLL.LIZIZ("video_record_activity_resume");
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SocialRecordScene onResume");
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.RECORD;
        C560380LyO.LJIIZILJ(enumC560450LyV, this.LLJZIJLIL, null);
        C560380LyO.LJIILLIIL(new C560470LyX(enumC560450LyV, System.currentTimeMillis()));
        if (this.LLLJL) {
            InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
            requireAppCompatActivity();
            o.LJJI.getClass();
            interfaceC1624140sMm.getClass();
            this.LLLJL = false;
        }
        if (C1837107Hl.LIZ() == 3) {
            LLLZLL();
        }
        this.LLJLLL.LIZ("video_record_activity_resume");
        if (C263650AUx.LIZ()) {
            Object objI2 = C786410Ut5.I2(requireAppCompatActivity(), "display");
            this.LLLIIL = objI2 instanceof DisplayManager ? (DisplayManager) objI2 : null;
            this.LLLIL = LLLLZLLLI();
            ?? r1 = new DisplayManager.DisplayListener() { // from class: X.0tB1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayRemoved(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayChanged(int i) {
                    e0 e0VarLLLLZ;
                    InterfaceC2254081DKk interfaceC2254081DKkSt2;
                    C1DHX cameraController;
                    C1DIC c1dicS4;
                    int iLLLLZLLLI = this.LL.LLLLZLLLI();
                    SocialRecordScene socialRecordScene = this.LL;
                    if (iLLLLZLLLI != socialRecordScene.LLLIL) {
                        socialRecordScene.LLLIL = iLLLLZLLLI;
                        if (C12VA.LIZ().LJIIJJI.invoke().booleanValue() && (e0VarLLLLZ = this.LL.LLLLZ()) != null && (interfaceC2254081DKkSt2 = e0VarLLLLZ.St2()) != null && (cameraController = interfaceC2254081DKkSt2.getCameraController()) != null && (c1dicS4 = cameraController.s4()) != null) {
                            c1dicS4.Q3();
                        }
                    }
                }
            };
            this.LLLIILIL = r1;
            DisplayManager displayManager = this.LLLIIL;
            if (displayManager != 0) {
                displayManager.registerDisplayListener(r1, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        this.LLJLLL.LIZIZ("video_record_activity_start");
        super.onStart();
        if (((Number) C0AUG.LIZ.getValue()).intValue() == 1) {
            C01GW c01gw = BrightnessManager.LIZ;
            BrightnessManager.LIZ(requireAppCompatActivity(), this, C1655670tBd.LIZ);
        }
        this.LLJLLL.LIZ("video_record_activity_start");
    }

    @Override // X.InterfaceC1452540nu0
    public final void r7() {
        View view = this.LLLIZZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public SocialRecordScene() {
        disableSupportRestore();
        this.LLLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(new AwS604S0100000_25(this, 251), 42));
        Boolean bool = Boolean.FALSE;
        this.LLLILZJ = new h0<>(bool);
        this.LLLILZLLLI = new h0<>(bool);
        this.LLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 375));
        this.LLLLII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(189));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 374));
        this.LLLLIILL = new ArrayList();
        this.LLLLIILLL = new ArrayList();
        this.LLLLIL = new ArrayList();
        this.LLLLILI = new ArrayList();
    }

    public static InterfaceC1629550sVV LLLZIL() {
        return C0CHQ.LIZ().getAccountService().LIZ() ? C1622250sJj.LIZ : C1622260sJk.LIZ;
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LLIIZ() {
        return (FrameLayout) findViewById(R.id.szh);
    }

    @Override // X.InterfaceC1650180t2m
    public final InterfaceC2177841ALe LLIZLLLIL() {
        e0 e0VarLLLLZ = LLLLZ();
        if (e0VarLLLLZ != null) {
            return e0VarLLLLZ.Gz0();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final InterfaceC1650230t2r LLLLLLLLL() {
        return LLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final C19A3 LLLLLLLZIL() {
        return LLLZIIL();
    }

    public final C1DRG LLLZI() {
        C1DRG c1drgLJFF = C1664600tQ2.LJ(this).LJFF();
        if (c1drgLJFF != null) {
            return c1drgLJFF;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLZLL() {
        ((InterfaceC1650230t2r) LLLZI().LJII(e0.class, null)).PR(C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_ENTER_SHOOT, null), true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
        InterfaceC1655310tB3 interfaceC1655310tB3LLLLIIIILLL = LLLZIIL().LLLLIIIILLL();
        if (interfaceC1655310tB3LLLLIIIILLL != null) {
            interfaceC1655310tB3LLLLIIIILLL.nm();
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor, X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.LLLILZJ.LJII(Boolean.TRUE);
        if (C1837107Hl.LIZ() == 2) {
            LLLZLL();
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SocialRecordScene onPause");
        ((AbstractC2255721DQs) LLLZI().LJII(e0.class, null)).onPause();
        if (LLLZ().LIZIZ.LJII) {
            C860470XpF.LIZ("tool_record_page_load");
        } else {
            oh.LJ("tool_record_enter");
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        DisplayManager displayManager;
        C1655290tB1 c1655290tB1;
        super.onStop();
        if (!C263650AUx.LIZ() || (displayManager = this.LLLIIL) == null || (c1655290tB1 = this.LLLIILIL) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(c1655290tB1);
        this.LLLIILIL = null;
        this.LLLIIL = null;
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LJLLLL() {
        return this.LLLIIIIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final NavigationScene LLLLLLLLLL() {
        return this.LLLJIL;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor, com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final ShortVideoContext LLLLLLZZ() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLLLIILL, 0, interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC1648600t0E
    public final void LJJIJIL(C1648660t0K c1648660t0K) {
        ((ArrayList) this.LLLLIL).remove(c1648660t0K);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC1648600t0E
    public final void LJJLIIIJILLIZJL(C1648640t0I c1648640t0I) {
        ((ArrayList) this.LLLLILI).add(c1648640t0I);
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        View view;
        VideoRecordRootView videoRecordRootView = this.LLLIIIIL;
        if (videoRecordRootView != null) {
            int visibility = videoRecordRootView.getVisibility();
            videoRecordRootView.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, videoRecordRootView);
        }
        if (z && (view = this.LLLIZZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC1648600t0E
    public final void LLD(C1648640t0I c1648640t0I) {
        ((ArrayList) this.LLLLILI).remove(c1648640t0I);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC1648600t0E
    public final void LLFII(C1648660t0K c1648660t0K) {
        ((ArrayList) this.LLLLIL).add(c1648660t0K);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLLJ(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LLLJ = mvChoosePhotoScene;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLLLIILLL).add(interfaceC484050IyZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        InterfaceC1655310tB3 interfaceC1655310tB3LLLLIIIILLL = LLLZIIL().LLLLIIIILLL();
        if (interfaceC1655310tB3LLLLIIIILLL != null) {
            interfaceC1655310tB3LLLLIIIILLL.S3(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLLLIILLL).remove(interfaceC484050IyZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLLLIILL).remove(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLLLIILL).add(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor, com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View viewFF2;
        VideoRecordRootView videoRecordRootView;
        ShortVideoContext shortVideoContext;
        IComplianceBusinessService iComplianceBusinessService;
        if (!C1688700u2u.LIZ(requireAppCompatActivity())) {
            super.onActivityCreated(bundle);
            C201955140j.LIZJ(C201967140v.LIZIZ, "RecordConditionCheck.check() false");
            finish();
            return;
        }
        LLLLZLL(bundle);
        ShortVideoContext shortVideoContext2 = this.LLJZIJLIL;
        if (shortVideoContext2 != null) {
            shortVideoContext2.shootMode = 29;
            shortVideoContext2.isStoryOrPhotoTab = true;
            shortVideoContext2.isStory = true;
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
            shortVideoContextViewModel.LL = shortVideoContext2;
            shortVideoContextViewModel.wQ2(shortVideoContext2.shootMode);
        }
        if (((Number) C281130B0d.LIZ.getValue()).intValue() == 1 && (shortVideoContext = this.LLJZIJLIL) != null && (iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null)) != null) {
            getLifecycle().addObserver(iComplianceBusinessService.LJJJJLI(requireContext(), 2131833819, shortVideoContext.shootWay, shortVideoContext.enterFrom, shortVideoContext.getCreationId(), new InterfaceC1916320zy2() { // from class: X.0tB4
                @Override // X.InterfaceC1916320zy2
                public final void LIZ() {
                }

                @Override // X.InterfaceC1916320zy2
                public final boolean goBack() {
                    this.LIZ.finish();
                    return true;
                }
            }));
        }
        if (LLLZ().LIZIZ.LJII) {
            C860470XpF.LJII("tool_record_page_load", EnumC860460XpE.COMMON);
        } else {
            oh.LIZJ("tool_record_enter", i5.LIZIZ(), i5.LIZ(), null, EnumC860460XpE.COMMON);
        }
        this.LLJLLL.LIZIZ("video_record_bind_components");
        C1654320t9S.LIZIZ(this, new AwS604S0100000_25(this, 874));
        C1664590tQ1.LIZLLL(this, "SocialRecordScene", false, new AwS604S0100000_25(this, 890), 2);
        C1664600tQ2.LIZ(this, "SocialRecordScene", new AwS604S0100000_25(this, 893));
        InterfaceC1650190t2n interfaceC1650190t2n = (InterfaceC1650190t2n) LLLZI().LJII(e0.class, null);
        interfaceC1650190t2n.St2().wh(false);
        interfaceC1650190t2n.A31().LIZ(this, new AObjectS246S0100000_25(this, 726));
        a aVar = (a) LLLZI().LJIIL(null, a.class);
        if (aVar != null) {
            aVar.AE0(true);
        }
        this.LLJLLL.LIZ("video_record_bind_components");
        if (C1837107Hl.LIZ() == 0) {
            LLLZLL();
        }
        e0 e0VarLLLLZ = LLLLZ();
        if (e0VarLLLLZ != null) {
            viewFF2 = e0VarLLLLZ.fF2();
        } else {
            viewFF2 = null;
        }
        this.LLLIZZ = viewFF2;
        NavigationScene navigationSceneLIZ = C214871197d.LIZ(LLLZIIL());
        this.LLLJIL = navigationSceneLIZ;
        add(R.id.szh, navigationSceneLIZ, "SocialVideoRecordContainerScene");
        super.onActivityCreated(bundle);
        if (C1837107Hl.LIZ() == 1 && (videoRecordRootView = this.LLLIIIIL) != null) {
            videoRecordRootView.setOnDrawnListener(new ARunnableS125S0100000_25(this, 48));
        }
        this.LLLLIIL = (ViewGroup) findViewById(R.id.mg3);
        requireActivity().runOnUiThread(new ARunnableS125S0100000_25(this, 109));
        C0EN3.LIZ();
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ()) {
            C1529670puP c1529670puP = C1529670puP.LIZ;
            c1529670puP.getClass();
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
            if (iMainService == null || iMainService.getAnywhereChannelPath("story_thought_bg_res") == null) {
                c1529670puP.LIZIZ();
            }
        }
        this.LLJLLL.LIZ("video_record_activity_create");
        q qVar = (q) this.LLLII.getValue();
        if (qVar != null) {
            qVar.X90();
            qVar.sv1();
            InterfaceC1621110sHt interfaceC1621110sHtFV = qVar.FV();
            if (interfaceC1621110sHtFV != null) {
                interfaceC1621110sHtFV.init();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y, X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        e0 e0VarLLLLZ;
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        C1DHX cameraController;
        C1DIC c1dicS4;
        if (C263650AUx.LIZ() && C12VA.LIZ().LJIIJJI.invoke().booleanValue() && (e0VarLLLLZ = LLLLZ()) != null && (interfaceC2254081DKkSt2 = e0VarLLLLZ.St2()) != null && (cameraController = interfaceC2254081DKkSt2.getCameraController()) != null && (c1dicS4 = cameraController.s4()) != null) {
            c1dicS4.Q3();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public void onEvent(AnonymousClass0801 anonymousClass0801) {
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext;
        ExtraSession extraSession;
        if (anonymousClass0801 != null && anonymousClass0801.LIZ != null && (shortVideoContext = this.LLJZIJLIL) != null && (extraSession = shortVideoContext.extraSession) != null) {
            extraSession.commerceData = anonymousClass0801.LIZ;
        }
        ShortVideoContext shortVideoContext2 = this.LLJZIJLIL;
        if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null) {
            C855640XhS.LIZ(creativeModel);
        }
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = f.LIZ;
        Context contextRequireContext = requireContext();
        requireAppCompatActivity().getIntent();
        fVar.getClass();
        f.LJII(contextRequireContext, bundle);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        InterfaceC1655310tB3 interfaceC1655310tB3LLLLIIIILLL = LLLZIIL().LLLLIIIILLL();
        if (interfaceC1655310tB3LLLLIIIILLL != null) {
            interfaceC1655310tB3LLLLIIIILLL.p2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void receiveToast(C1630980sXo c1630980sXo) {
        String str;
        if (c1630980sXo != null) {
            str = c1630980sXo.LIZ;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "sticker_unlocked")) {
            this.LLLJL = true;
            EventBus.LIZLLL().LJIL(c1630980sXo);
        }
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsReEnterChoosePhoto(boolean z) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLJ;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.setIsReEnterChoosePhoto(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLLLIILL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLLLIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1655330tB5) it2.next()).onKeyLongPress(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLLLILI).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1655340tB6) it2.next()).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        RecordViewModel recordViewModel = LLLZIIL().LLJJIII;
        if (recordViewModel != null) {
            ((InterfaceC1655300tB2) recordViewModel.LLILLJJLI.getValue(recordViewModel, RecordViewModel.LLJI[0])).xa2();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f9t, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLLLIILLL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsChangeMusicDownloadSuccess(boolean z, MusicModel musicModel, String str) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLJ;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.setIsChangeMusicDownloadSuccess(true, musicModel, str);
        }
    }
}
