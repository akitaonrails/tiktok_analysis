package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.AnonymousClass0801;
import X.C01GW;
import X.C0C1K;
import X.C0CHQ;
import X.C0CNO;
import X.C0IKQ;
import X.C0L07;
import X.C0LAB;
import X.C0LG8;
import X.C0MBA;
import X.C1411580mpw;
import X.C1429380nIe;
import X.C1429950nJZ;
import X.C1429980nJc;
import X.C1436840nUg;
import X.C1440005kM;
import X.C1440340naK;
import X.C1441530ncF;
import X.C1442110ndB;
import X.C1443560nfW;
import X.C1444920nhi;
import X.C1448140nmu;
import X.C1448710nnp;
import X.C1448790nnx;
import X.C1448840no2;
import X.C1449260noi;
import X.C1449420noy;
import X.C1458410o3T;
import X.C1459710o5Z;
import X.C14EU;
import X.C14LN;
import X.C1514430pVp;
import X.C15M8;
import X.C15R5;
import X.C1621770sIx;
import X.C1624360sN8;
import X.C1624570sNT;
import X.C1630980sXo;
import X.C1642810sqt;
import X.C1645790svh;
import X.C1649700t20;
import X.C1649710t21;
import X.C1649720t22;
import X.C1650020t2W;
import X.C1650090t2d;
import X.C1653040t7O;
import X.C1653550t8D;
import X.C1654320t9S;
import X.C1655580tBU;
import X.C1655670tBd;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1688700u2u;
import X.C1699250uJv;
import X.C18L3;
import X.C19771112Xd;
import X.C19EH;
import X.C19GS;
import X.C1A66;
import X.C1C7U;
import X.C1DI6;
import X.C1DMD;
import X.C1DPV;
import X.C1DPW;
import X.C1DRG;
import X.C1DS1;
import X.C20102013l4;
import X.C201955140j;
import X.C20246714Kb;
import X.C20622515mp;
import X.C20684815ws;
import X.C21142717oX;
import X.C214871197d;
import X.C2188811AlT;
import X.C2208841Bcg;
import X.C2265108u9;
import X.C2475009mu;
import X.C2495709qF;
import X.C298010BmB;
import X.C298060BmG;
import X.C306720C0o;
import X.C524780Ki4;
import X.C539630LEj;
import X.C539710LEr;
import X.C540290LGx;
import X.C565610MGh;
import X.C576210Mip;
import X.C579670MoP;
import X.C778450UgF;
import X.C786410Ut5;
import X.C804290Vgp;
import X.C804330Vgt;
import X.C855640XhS;
import X.C856140XiG;
import X.C860560XpO;
import X.C863370Xtv;
import X.EnumC1399820mWy;
import X.EnumC1429920nJW;
import X.EnumC1584370rKd;
import X.EnumC194317110p;
import X.EnumC2249681D3m;
import X.EnumC804170Vgd;
import X.EnumC805430Vif;
import X.InterfaceC1399800mWw;
import X.InterfaceC1621970sJH;
import X.InterfaceC1622600sKI;
import X.InterfaceC1624140sMm;
import X.InterfaceC1635410sex;
import X.InterfaceC1642910sr3;
import X.InterfaceC1644770su3;
import X.InterfaceC1648570t0B;
import X.InterfaceC1648870t0f;
import X.InterfaceC1650180t2m;
import X.InterfaceC1650230t2r;
import X.InterfaceC2177841ALe;
import X.InterfaceC2254001DKc;
import X.InterfaceC2254081DKk;
import X.ProgressDialogC1399790mWv;
import Y.ALAdapterS5S0100000_8;
import Y.AObjectS246S0100000_25;
import Y.AObjectS399S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS125S0100000_25;
import Y.ARunnableS87S0000000_8;
import Y.ARunnableS99S0200000_30;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ayh.i5;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.record.ExteriorRecordPageFactoryImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorRecordPageFactory;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.b;
import com.ss.android.ugc.aweme.shortvideo.ui.kg;
import com.ss.android.ugc.aweme.shortvideo.ui.task.CacheChooseMediaViewHolderTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.shortvideo.ui.task.g;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jgp.h;
import jgp.k;
import jgp.t;
import jgp.u;
import jgp.w;
import joo.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS391S0200000_25;
import l5a.a;
import lnn.q;
import lth.o;
import mn3.e0;
import nv7.c0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes26.dex */
public class ExteriorVideoRecordScene extends TikTokCameraBaseGroupScene implements InterfaceC1650180t2m, IPreDownloadMusic {
    public static final /* synthetic */ int LLLLLJLJLL = 0;
    public C1DRG LLJZIJLIL;
    public ShortVideoContext LLL;
    public InterfaceC2177841ALe LLLFF;
    public FrameLayout LLLFFI;
    public FrameLayout LLLFZ;
    public View LLLI;
    public FrameLayout LLLIIII;
    public List<String> LLLIIIIL;
    public Effect LLLIIIL;
    public boolean LLLIIL;
    public x2 LLLIILIL;
    public MvChoosePhotoScene LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public FrameLayout LLLILZLLLI;
    public volatile boolean LLLIZZ;
    public int LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public long LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public final C1650090t2d LLLLIIL;
    public NavigationScene LLLLIILL;
    public kg LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public IBinderWrapper LLLLJ;
    public RecordPageOptionalConfig LLLLJI;
    public e0 LLLLL;
    public InterfaceC1648570t0B LLLLLIL;
    public InterfaceC1621970sJH LLLLLILLIL;
    public q LLLLLJIL;
    public final SafeHandler LLLF = new SafeHandler(this);
    public ProgressDialogC1399790mWv LLLII = null;

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLZL() {
        this.LLLIL = null;
    }

    @Override // X.InterfaceC1452540nu0
    public final void LLLJIL() {
        View view = this.LLLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLLL() {
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLLLLIL;
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.V2(false);
        }
    }

    public final q LLLLZIL() {
        if (this.LLLLLJIL == null) {
            this.LLLLLJIL = (q) this.LLJZIJLIL.LJIIL(null, q.class);
        }
        return this.LLLLLJIL;
    }

    public final void LLLZIIL() {
        this.LLLLL.St2().rh(new C1DMD(new C579670MoP(this.LLL.cameraComponentModel.mWorkspace)), this.LLL.cameraComponentModel.mWorkspace.LJ().getAbsolutePath());
        this.LLLLL.js2();
    }

    public final void LLLZIL() {
        if (Build.VERSION.SDK_INT < 28 || getWindow().getDecorView().getRootWindowInsets() != null) {
            InterfaceC2254001DKc mediaController = this.LLLLL.St2().getMediaController();
            float f = C20246714Kb.LIZ;
            mediaController.k5(C20246714Kb.LIZ((ViewGroup.MarginLayoutParams) this.LLLI.getLayoutParams(), getWindow(), this.LLLLII));
        }
    }

    public final boolean LLLZLL() {
        ShortVideoContext shortVideoContext = this.LLL;
        return (shortVideoContext.mToLive || shortVideoContext.mToStatus || (shortVideoContext.enterMvThemeEffect != null) || C306720C0o.LIZ()) ? false : true;
    }

    public final void LLLZLZ() {
        if (this.LLLII == null) {
            this.LLLII = C576210Mip.LIZ(requireAppCompatActivity(), EnumC1399820mWy.VISIBLE_AFTER_5S, new InterfaceC1399800mWw() { // from class: X.0tBi
                @Override // X.InterfaceC1399800mWw
                public final void LIZ() {
                }
            });
        }
        this.LLLII.setMessage(getString(2131848034));
        this.LLLII.setCancelable(false);
        this.LLLII.setIndeterminate(true);
        C786410Ut5.O4(this.LLLII);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String getCreationId() {
        ShortVideoContext shortVideoContext = this.LLL;
        if (shortVideoContext != null) {
            return shortVideoContext.getCreationId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final IPreDownloadMusic.PreDownloadMusicData getPreDownloadMusicData() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIL;
        return (mvChoosePhotoScene == null || mvChoosePhotoScene.mActivity == null) ? new IPreDownloadMusic.PreDownloadMusicData(null, null) : mvChoosePhotoScene.getPreDownloadMusicData();
    }

    @Override // X.AbstractC214814194y
    public final int getStartAnimationType() {
        int i = this.mArguments.getInt("translation_type", 0);
        return Arrays.asList(3, 7, 8, 9, 1, 6).contains(Integer.valueOf(i)) ? i : super.getStartAnimationType();
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final boolean isReEnterChoosePhoto() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIL;
        if (mvChoosePhotoScene != null) {
            return mvChoosePhotoScene.isReEnterChoosePhoto();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
        ShortVideoContext shortVideoContext = this.LLL;
        if (shortVideoContext != null) {
            c0 c0Var = c0.LIZ;
            View view = this.LLLI;
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            c0Var.q2(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    @Override // X.AbstractC214814194y
    public final void onAttachedToWindow() {
        if (this.LLL.mToLive) {
            return;
        }
        LLLZIL();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        RecordPageOptionalConfig recordPageOptionalConfig;
        this.LLJLLL.LIZIZ("video_record_activity_resume");
        C1650020t2W c1650020t2W = C1650020t2W.LIZIZ;
        C201955140j.LIZJ(c1650020t2W, "JSBVideoRecordScene => onResume start");
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "ExteriorVideoRecordScene onResume");
        if (this.LLL.mIsFromDraft) {
            if (LLLLZLLLI()) {
                C0CNO.LIZJ(180L, new ARunnableS87S0000000_8(0));
            } else {
                C1440005kM.LIZ(new C0MBA());
            }
        }
        this.LLLILZJ = true;
        if (this.mArguments.getBoolean("extra_editor_pro_to_record", false)) {
            this.LLLLLILLIL.Ud1(true);
        }
        if (this.LLLILZ) {
            InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
            requireAppCompatActivity();
            o.LJJI.getClass();
            interfaceC1624140sMm.getClass();
            this.LLLILZ = false;
        }
        if (u7.LJ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ(Scene.SCENE_SERVICE, "resume_record");
            c0lab.LJ("shoot_way", this.LLL.shootWay);
            c0lab.LJ("creation_id", this.LLL.getCreationId());
            c0lab.LJ("enter_from", this.LLL.enterFrom);
            C1699250uJv.LLILLL.getClass();
            c0lab.LIZIZ(0L, "dalvikPss");
            c0lab.LIZIZ(0L, "nativePss");
            c0lab.LIZIZ(0L, "otherPss");
            c0lab.LIZIZ(0L, "totalPss");
            C20684815ws.LJIILLIIL("av_memory_log", c0lab.LIZ);
        }
        C201955140j.LIZJ(c1650020t2W, "JSBVideoRecordScene => onResume end");
        int i = (this.LLL == null || (recordPageOptionalConfig = this.LLLLJI) == null) ? -1 : recordPageOptionalConfig.exteriorRecordPageType;
        if (i == C0LG8.PHOTO_SEARCH.getType() || i == C0LG8.AIGC.getType()) {
            C540290LGx.LIZ.LJIIL(requireAppCompatActivity(), new AObjectS399S0100000_25(this, 10), new String[]{"android.permission.CAMERA"});
        } else {
            C540290LGx.LIZ.LJIIJJI(requireAppCompatActivity(), new AObjectS399S0100000_25(this, 11));
        }
        VEMem.getInstance().uploadVirtualMemSize(0);
        long j = this.mArguments.getLong("extra_start_record_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLIZIZ = C1442110ndB.LIZ() ? C1448840no2.LIZIZ(j, jCurrentTimeMillis) : 0L;
        C1650090t2d c1650090t2d = this.LLLLIIL;
        c1650090t2d.getClass();
        c1650090t2d.LIZ(-1, jCurrentTimeMillis - (j + jLIZIZ), "click_plus", true);
        ShortVideoContext shortVideoContext = this.LLL;
        if (shortVideoContext != null) {
            ArrayList arrayList = new ArrayList(C1624570sNT.LIZIZ(shortVideoContext.presetEffectId));
            List<String> list = this.LLLIIIIL;
            if (list != null) {
                arrayList.addAll(list);
            }
            a.LIZIZ.LIZIZ(shortVideoContext.getCreationId(), new C1429980nJc(EnumC1429920nJW.ENTER_RECORD, shortVideoContext, Arrays.asList(new C1429950nJZ(arrayList, shortVideoContext.creativeModel.commerceModel.getMission() != null ? shortVideoContext.creativeModel.commerceModel.getMission().getMissionId() : "", shortVideoContext.creativeModel.commerceModel.getRecordChallenge() != null ? shortVideoContext.creativeModel.commerceModel.getRecordChallenge() : null))), getAppCompatActivity());
        }
        this.LLJLLL.LIZ("video_record_activity_resume");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        if (this.LLLLJ != null) {
            C786410Ut5.LJJIJL(this.mArguments, C539710LEr.LIZ(this.LLL), this.LLLLJ);
            this.LLLLJ = null;
        }
        this.LLJLLL.LIZIZ("video_record_activity_start");
        super.onStart();
        RecordTaskManager.LIZ(new jgp.q(), C298010BmB.LIZ());
        C01GW c01gw = BrightnessManager.LIZ;
        BrightnessManager.LIZ(requireAppCompatActivity(), this, C1655670tBd.LIZ);
        this.LLJLLL.LIZ("video_record_activity_start");
    }

    @Override // X.InterfaceC1452540nu0
    public final void r7() {
        View view = this.LLLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public ExteriorVideoRecordScene() {
        new C565610MGh();
        this.LLLILZ = false;
        this.LLLILZJ = false;
        this.LLLIZZ = true;
        this.LLLJL = false;
        this.LLLL = -1L;
        new ArrayList();
        this.LLLLIIL = new C1650090t2d();
        this.LLLLIILL = null;
        this.LLLLIILLL = null;
        this.LLLLIL = false;
        this.LLLLILI = false;
        this.LLLLJI = null;
        disableSupportRestore();
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LLIIZ() {
        return (FrameLayout) findViewById(R.id.szh);
    }

    public final void LLLLZ() {
        x2 x2Var;
        if (isFinishing()) {
            return;
        }
        C524780Ki4.LIZ.step("av_video_record_init", "addFragment");
        C201955140j.LIZJ(C1650020t2W.LIZIZ, "addFragment PlanC");
        kg kgVar = this.LLLLIILLL;
        if (kgVar != null && (x2Var = this.LLLIILIL) != null && kgVar.isAdded(x2Var)) {
            this.LLLLIILLL.remove(this.LLLIILIL);
        }
        final OptionalComponents optionalComponents = new OptionalComponents(false, false, false);
        RecordPageOptionalConfig recordPageOptionalConfig = this.LLLLJI;
        if (recordPageOptionalConfig != null) {
            optionalComponents = recordPageOptionalConfig.optionalComponents;
        }
        x2 x2Var2 = new x2(this.LLL, this.mArguments, this.LLJZIJLIL, new InterfaceC1642910sr3() { // from class: X.0squ
            @Override // X.InterfaceC1642910sr3
            public final void LIZ(C19A3 c19a3) {
                ExteriorRecordPageFactory exteriorRecordPageFactory;
                OptionalComponents optionalComponents2 = optionalComponents;
                Object objLIZ = C04TD.LIZ(ExteriorRecordPageFactory.class, false);
                if (objLIZ != null) {
                    exteriorRecordPageFactory = (ExteriorRecordPageFactory) objLIZ;
                } else {
                    if (C04TD.q3 == null) {
                        synchronized (ExteriorRecordPageFactory.class) {
                            if (C04TD.q3 == null) {
                                C04TD.q3 = new ExteriorRecordPageFactoryImpl();
                            }
                        }
                    }
                    exteriorRecordPageFactory = C04TD.q3;
                }
                exteriorRecordPageFactory.LIZ(c19a3, optionalComponents2);
            }
        });
        this.LLLIILIL = x2Var2;
        x2Var2.LLJJ = new ARunnableS125S0100000_25(this, 33);
        kg kgVar2 = this.LLLLIILLL;
        if (kgVar2 != null) {
            kgVar2.LLLLIILL(x2Var2);
        }
    }

    public final boolean LLLLZLLLI() {
        if (!C20622515mp.LJII() || C20622515mp.LJ(this) == null) {
            return this.mActivity instanceof SAAActivity;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.InterfaceC2077908Cb
    public final Analysis getAnalysis() {
        if (super.getAnalysis() == null) {
            return super.getAnalysis();
        }
        HashMap map = new HashMap();
        map.put("creation_id", this.LLL.getCreationId());
        map.put("is_story_shoot", CardStruct.IStatusCode.DEFAULT);
        Analysis analysis = super.getAnalysis();
        analysis.setExtraMap(map);
        return analysis;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        RecordPageOptionalConfig recordPageOptionalConfig;
        super.onDestroyView();
        if (!this.LLLJIL && (recordPageOptionalConfig = this.LLLLJI) != null) {
            C539630LEj c539630LEj = C539630LEj.LIZ;
            String str = recordPageOptionalConfig.previousPage;
            String str2 = this.LLL.shootWay;
            Boolean bool = Boolean.TRUE;
            c539630LEj.getClass();
            C539630LEj.LJII(8, str, str2, true, null, bool);
        }
        C1624360sN8.LIZ.clear();
        C1624360sN8.LIZIZ.clear();
        C1653040t7O.LIZ.LJ();
        C1436840nUg c1436840nUg = new C1436840nUg(requireAppCompatActivity());
        if (c1436840nUg.LIZJ().getBoolean("is_first_enter_record_page", true)) {
            c1436840nUg.LJ();
        }
        C1645790svh c1645790svh = C1645790svh.LIZJ;
        c1645790svh.LIZIZ = null;
        InterfaceC1635410sex interfaceC1635410sex = c1645790svh.LIZ;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.destroy();
        }
        c1645790svh.LIZ = null;
        o.LJI.dl();
        C1458410o3T.LJIIJJI(false);
        this.LLLIILIL = null;
        C856140XiG.LIZIZ("editor");
        C2475009mu.LJ(C0L07.LIZ.getSecond());
        C0L07.LIZ = new Pair<>(null, null);
        C786410Ut5.LJLILLLLZI(C1699250uJv.LLILLL.LL, 1);
        o.LJIILL.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIIIIZZ();
        C1448790nnx.LIZ = false;
        C1448790nnx.LIZIZ = false;
        C1448790nnx.LIZJ = false;
        C0CHQ.LIZ().getPublishService().LIZ();
        AVCommerceServiceImpl.LJIIJ().LIZJ();
        C524780Ki4.LIZ.leave(requireAppCompatActivity(), "record");
        C2265108u9.LIZIZ();
        C863370Xtv.LIZ("normal").LJFF("at_shoot_page");
        C1DPV.LIZIZ.LIZ.getClass();
        C1DI6.LIZIZ = null;
    }

    @Override // X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        this.LLLL = System.currentTimeMillis();
        LLLZI(this.LLLLL.qF1().getValue());
        if (C298060BmG.LIZ()) {
            requireActivity().runOnUiThread(new ARunnableS125S0100000_25(this, 28));
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "ExteriorVideoRecordScene onPause");
        this.LLLILZJ = false;
        j jVar = C524780Ki4.LIZ;
        C19GS c19gsRequireAppCompatActivity = requireAppCompatActivity();
        ShortVideoContext shortVideoContext = this.LLL;
        jVar.pause(c19gsRequireAppCompatActivity, "record", shortVideoContext.shootWay, shortVideoContext.getCreationId());
        oh.LJ("tool_record_enter");
        VEMem.getInstance().uploadVirtualMemSize(1);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        LLLLLLL();
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LJLLLL() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1650180t2m
    public final InterfaceC2177841ALe LLIZLLLIL() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final InterfaceC1650230t2r LLLLLLLLL() {
        return this.LLLLL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final NavigationScene LLLLLLLLLL() {
        return this.LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final x2 LLLLLLZ() {
        return this.LLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final ShortVideoContext LLLLLLZZ() {
        return this.LLL;
    }

    public static void LLLZ(ExteriorVideoRecordScene exteriorVideoRecordScene) {
        C1C7U.LIZ("ExteriorVideoRecordScene@35a2.onActivityCreated$3L");
        exteriorVideoRecordScene.getClass();
        new DefaultGesturePresenter(exteriorVideoRecordScene.requireAppCompatActivity(), exteriorVideoRecordScene, null, exteriorVideoRecordScene.LLLILZLLLI).LJIIL(new r1k.a(exteriorVideoRecordScene.LLLLL.St2().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) exteriorVideoRecordScene.LLLLL.fF2().getLayoutParams())), 1, 100);
        C1C7U.LIZIZ("ExteriorVideoRecordScene@35a2.onActivityCreated$3L");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLLJ(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LLLIL = mvChoosePhotoScene;
    }

    public final <T> T LLLLZLL(Class<T> cls) {
        x2 x2Var = this.LLLIILIL;
        if (x2Var == null || x2Var.getDiContainer() == null) {
            return null;
        }
        return (T) this.LLLIILIL.getDiContainer().LJIIL(null, cls);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLIL(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene.LLLLZLLIL(android.os.Bundle):void");
    }

    public final void LLLZI(C1448140nmu c1448140nmu) {
        String effectId;
        String name;
        long jLIZIZ;
        String enName;
        String id;
        String str;
        String str2;
        HashMap<String, String> map;
        TTSVoiceModel tTSVoiceModel;
        String str3;
        if (!this.LLLJIL && this.LLLL >= 0 && this.LLLJL) {
            long j = c1448140nmu.LIZJ;
            final long j2 = c1448140nmu.LIZ;
            final long j3 = c1448140nmu.LIZIZ;
            this.LLLJIL = true;
            FilterBean filterBeanLIZJ = ((InterfaceC1644770su3) this.LLJZIJLIL.LJII(InterfaceC1644770su3.class, null)).i70().LIZJ();
            Effect effect = this.LLL.enterMvThemeEffect;
            if (effect == null) {
                effectId = "";
                name = "";
            } else {
                effectId = effect.getEffectId();
                name = effect.getName();
            }
            long j4 = this.mArguments.getLong("extra_start_record_time", 0L);
            if (C1442110ndB.LIZ()) {
                jLIZIZ = C1448840no2.LIZIZ(j4, this.LLLL);
            } else {
                jLIZIZ = 0;
            }
            long j5 = j4 + jLIZIZ;
            long j6 = j - j5;
            long j7 = j2 - j5;
            int i = this.mArguments.getInt("sdk_load_ve_so_status", -1);
            long j8 = this.mArguments.getLong("preload_ve_so_cost_time", -1L);
            int i2 = this.mArguments.getInt("preload_ve_so_task_status", -1);
            long j9 = this.mArguments.getLong("extra_decompress_time", -10086L);
            C1650020t2W c1650020t2W = C1650020t2W.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("So decompress: VideoRecordNewActivity, decompress time:");
            sbLIZ.append(j9);
            C201955140j.LIZJ(c1650020t2W, C2188811AlT.LIZIZ(sbLIZ));
            boolean z = this.LLL.creativeModel.recordMobModel.isColdStart;
            long j10 = this.mArguments.getLong("effect_download_duration", -1L);
            long j11 = this.mArguments.getLong("music_download_duration", -1L);
            long j12 = this.mArguments.getLong("video_download_duration", -1L);
            long j13 = this.LLLL - j5;
            final C0LAB c0lab = new C0LAB();
            c0lab.LIZ(i, "sdk_load_ve_so_status");
            c0lab.LIZ(i2, "preload_ve_so_task_status");
            c0lab.LIZIZ(j8, "preload_ve_so_cost_time");
            c0lab.LIZIZ(j9, "extra_decompress_time");
            c0lab.LIZIZ(j7, "first_frame_duration");
            c0lab.LIZIZ(Math.max(j7, j13), "first_frame_duration_new");
            c0lab.LIZIZ(j13, "enter_anim_complete_duration");
            c0lab.LIZIZ(j6, "first_ui_frame_duration");
            c0lab.LIZIZ(j3 - j2, "effect_first_frame_duration");
            c0lab.LIZIZ(j3 - j5, "total_first_frame_duration");
            c0lab.LJ("shoot_way", this.LLL.shootWay);
            c0lab.LJ("enter_from", this.LLL.enterFrom);
            c0lab.LJ("creation_id", this.LLL.getCreationId());
            c0lab.LJFF("cold_start", z);
            c0lab.LIZIZ(j10, "effect_download_duration");
            c0lab.LIZIZ(j11, "music_download_duration");
            c0lab.LIZIZ(j12, "video_download_duration");
            c0lab.LJ("camera_type", C1621770sIx.LIZ(this.LLLLL.St2().getCurrentCameraType()));
            boolean zLIZ = C0C1K.LIZ();
            C21142717oX.LIZIZ(c0lab, !zLIZ);
            if (zLIZ) {
                C860560XpO.LIZ(c0lab);
            }
            new C1448710nnp(null, null, this.LLJZIJLIL, null, this.LLLLL, null).LIZIZ(c0lab, new Function0() { // from class: X.0tBI
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    C0LAB c0lab2 = c0lab;
                    long j14 = j3;
                    long j15 = j2;
                    C303380Buq.LIZ("tool_performance_record_first_frame", c0lab2.LIZ);
                    j jVar = C524780Ki4.LIZ;
                    jVar.getClass();
                    if (C298320Bmg.LIZ()) {
                        HashMap map2 = new HashMap();
                        C0LAB c0lab3 = new C0LAB();
                        c0lab3.LIZIZ(j14 - j15, "effect_first_frame_duration");
                        map2.put("tool_performance_record_first_frame", c0lab3.LIZ);
                        if (j.LIZ()) {
                            C786410Ut5.LJJZZIII(jVar.LLILLL, new ARunnableS99S0200000_30(jVar, map2, 5));
                        }
                    }
                    return Unit.LIZ;
                }
            });
            if (C1DS1.LIZJ && !((Boolean) C1DS1.LJIIL.getValue()).booleanValue() && j13 > ((Number) C1DS1.LJIILJJIL.getValue()).longValue()) {
                C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.IC, EnumC804170Vgd.IC_FIRST_FRAME));
            }
            C0LAB c0lab2 = new C0LAB();
            if (filterBeanLIZJ == null) {
                enName = "";
            } else {
                enName = filterBeanLIZJ.getEnName();
            }
            c0lab2.LJ("filter_name", enName);
            if (filterBeanLIZJ != null) {
                id = filterBeanLIZJ.getId();
            } else {
                id = "-1";
            }
            c0lab2.LJ("filter_id", id);
            c0lab2.LJ("mv_id", effectId);
            c0lab2.LJ("mv_name", name);
            c0lab2.LJFF("cold_start", z);
            c0lab2.LIZLLL(C20102013l4.LIZJ("av_video_record_init").getFirst(), "app_mem_use");
            c0lab2.LIZLLL(C20102013l4.LIZJ("av_video_record_init").getSecond(), "availble_mem");
            c0lab2.LIZIZ(this.mArguments.getLong("extra_start_record_download_res_time", 0L), "download_res_time");
            StitchParams stitchParams = this.LLL.stitchContext.stitchParams;
            String str4 = "1";
            if (stitchParams != null && stitchParams.isThroughStitchChain()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab2.LJ("is_through_stitch_button", str);
            c0lab2.LJ("camera_type", C1621770sIx.LIZ(this.LLLLL.St2().getCurrentCameraType()));
            c0lab2.LJI(new C15M8().LJFF("action_originated_from"));
            if ("self_shoot".equals(this.LLL.shootWay)) {
                c0lab2.LJ("enter_from", "video_shoot_page");
            } else {
                c0lab2.LJ("enter_from", this.LLL.enterFrom);
            }
            int i3 = this.LLL.draftId;
            if (i3 != 0) {
                c0lab2.LIZ(i3, "draft_id");
            }
            if (!TextUtils.isEmpty(this.LLL.clientId)) {
                c0lab2.LJ("channel", this.LLL.clientId);
            }
            if (!TextUtils.isEmpty(this.LLL.mShareId)) {
                c0lab2.LJ("open_platform_share_id", this.LLL.mShareId);
            }
            if (this.LLL.creativeModel.loadMusicAndEffectModel.loadAfterRecord) {
                c0lab2.LJ("enter_method", "long_press_music_publish");
                String str5 = this.LLL.creativeModel.loadMusicAndEffectModel.musicId;
                if (str5 == null) {
                    str5 = "";
                }
                c0lab2.LJ("music_id", str5);
                c0lab2.LJ("shoot_entrance", "single_song");
            }
            ShareKitPanel shareKitPanel = this.LLL.creativeFlowData.getShareKitPanel();
            if (shareKitPanel != null) {
                c0lab2.LIZLLL(shareKitPanel.getShareMediaType(), "share_media_type");
                c0lab2.LJ("effect_resource_id", shareKitPanel.getEffectResourceId());
                c0lab2.LJ("share_panel_option", shareKitPanel.getSharePanelOption());
                c0lab2.LJ("channel", shareKitPanel.getClientKey());
            }
            if (!TextUtils.isEmpty(this.LLL.newDraftId)) {
                c0lab2.LJ("new_draft_id", this.LLL.newDraftId);
                if (this.LLL.draftToEditFrom == 0) {
                    c0lab2.LJ("enter_method", "click_back_button");
                    str3 = "general_draft_list";
                } else {
                    str3 = null;
                }
                c0lab2.LJ("draft_way", str3);
            }
            c0lab2.LIZ(C778450UgF.LIZ(getAppCompatActivity()), "brightness");
            if (j5 > 0 && j7 > 0) {
                c0lab2.LIZIZ(j7, "duration");
            }
            if (TextUtils.equals(this.LLL.enterFrom, "super_entrance")) {
                c0lab2.LIZ(1, "is_special_icon");
            }
            if ("story".equals(this.LLL.shootWay)) {
                c0lab2.LJ("shoot_entrance", "story");
                c0lab2.LJ("enter_method", this.LLL.enterMethod);
            }
            if ("anchor_combine_tts".equals(this.LLL.shootWay) && (tTSVoiceModel = this.LLL.ttsVoiceModel) != null) {
                c0lab2.LJ("tone_list", tTSVoiceModel.getEffectId());
            }
            c0lab2.LJ("shoot_page", "video_shoot_page");
            c0lab2.LIZ(this.LLL.mDuetFromDuetButton, "is_from_duet_button");
            int stitchVideoDuration = 0;
            if (this.LLL.LJJJJI()) {
                c0lab2.LIZ(1, "is_restore_crash");
                if (C0CHQ.LIZ().LJIIJ().LJIIJJI()) {
                    c0lab2.LJ("enter_method", "click_continue_popup");
                } else {
                    c0lab2.LJ("enter_method", "click_back_button");
                }
            } else {
                c0lab2.LIZ(0, "is_restore_crash");
            }
            if (this.LLL.cameraComponentModel.mRestoreType == 1) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab2.LJ("is_draft", str2);
            c0lab2.LJ("camera", C1449260noi.LIZIZ(this.LLLLL.LJLJJLL()));
            c0lab2.LIZ(C0CHQ.LIZ().getPublishService().LJJJJJL(), "publish_cnt");
            if (!this.LLL.creativeFlowData.isThroughAnchor()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab2.LJ("is_through_anchor", str4);
            if (TextUtils.equals(this.LLL.shootWay, "duet")) {
                c0lab2.LIZ(this.LLL.duetVideoDuration, "duet_video_duration");
            } else if (TextUtils.equals(this.LLL.shootWay, "stitch")) {
                StitchParams stitchParams2 = this.LLL.stitchContext.stitchParams;
                if (stitchParams2 != null) {
                    stitchVideoDuration = stitchParams2.getStitchVideoDuration();
                }
                c0lab2.LIZ(stitchVideoDuration, "stitch_video_duration");
            }
            if (TextUtils.equals(this.LLL.shootWay, "friends_effect")) {
                c0lab2.LJ("enter_method", this.LLL.enterMethod);
                HashMap<String, HashMap<String, String>> map2 = this.LLL.extraEventParams;
                if (map2 != null && map2.get("friends_effect") != null && (map = map2.get("friends_effect")) != null) {
                    c0lab2.LJ("from_user_id", map.get("from_user_id"));
                }
            }
            if (TextUtils.equals(this.LLL.shootWay, "chat_shoot")) {
                c0lab2.LJ("enter_method", "click");
            }
            RecordPageOptionalConfig recordPageOptionalConfig = this.LLLLJI;
            if (recordPageOptionalConfig != null) {
                c0lab2.LJ("previous_page", recordPageOptionalConfig.previousPage);
            }
            C21142717oX.LIZIZ(c0lab2, true);
            C1411580mpw.LIZ("enter_video_shoot_page");
            C1440340naK.LIZ(c0lab2, this.LLL.creativeModel.propFromGroupModel);
            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZJ(new C1449420noy(this.LLL.getCreationId(), this.LLL.shootWay, C1443560nfW.LJIIIIZZ(), null), c0lab2);
            if (u7.LJ() || u7.LIZJ()) {
                C0LAB c0lab3 = new C0LAB();
                c0lab3.LJFF("is_4k_enable", C2495709qF.LIZ());
                C20684815ws.LJIILLIIL("tool_performance_4k_video_import", c0lab3.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.component.a aVarLLLLILI;
        this.LLLLII = z;
        x2 x2Var = this.LLLIILIL;
        if (x2Var != null && (aVarLLLLILI = x2Var.LLLLILI()) != null) {
            aVarLLLLILI.gX1(z);
        }
        LLLZIL();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLL.actionDownTime = System.currentTimeMillis();
            InterfaceC1648870t0f interfaceC1648870t0f = (InterfaceC1648870t0f) LLLLZLL(InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f != null) {
                interfaceC1648870t0f.dismissSuperEntranceEvent();
            }
            InterfaceC1648870t0f interfaceC1648870t0f2 = (InterfaceC1648870t0f) LLLLZLL(InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f2 != null) {
                interfaceC1648870t0f2.dismissUploadPopEntranceEvent();
            }
            InterfaceC1648870t0f interfaceC1648870t0f3 = (InterfaceC1648870t0f) LLLLZLL(InterfaceC1648870t0f.class);
            if (interfaceC1648870t0f3 != null) {
                interfaceC1648870t0f3.dismissLivePopupEvent();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        long j;
        String creationId;
        int i;
        byte b;
        int i2;
        if (this.mArguments == null) {
            LLLLLL();
            return;
        }
        j jVar = C524780Ki4.LIZ;
        jVar.enter(requireAppCompatActivity(), "record");
        oh.LIZIZ("tool_record_enter", i5.LIZIZ(), i5.LIZ(), null);
        if (!LLLLZLLLI()) {
            f fVar = f.LIZ;
            C19GS c19gsRequireAppCompatActivity = requireAppCompatActivity();
            Intent intent = requireActivity().getIntent();
            fVar.getClass();
            f.LIZJ(c19gsRequireAppCompatActivity, intent, bundle);
        }
        LLLLZLLIL(bundle);
        C1650020t2W c1650020t2W = C1650020t2W.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JSBVideoRecordScene => onCreate start, creation: ");
        sbLIZ.append(this.LLL.getCreationId());
        sbLIZ.append(" shootway: ");
        sbLIZ.append(this.LLL.shootWay);
        C201955140j.LIZJ(c1650020t2W, C2188811AlT.LIZIZ(sbLIZ));
        jVar.step("av_video_record_init", "init recorderModule start");
        if (this.LLLLILI) {
            C15R5.LJI.LJIIIIZZ(requireAppCompatActivity());
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLL.creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.getDuration() > 0) {
                this.LLL.LJJLIIIJ(aVMusicExtractAVMusic.getDuration());
            }
        }
        o.LIZLLL();
        RecordPageOptionalConfig recordPageOptionalConfig = this.LLLLJI;
        if (recordPageOptionalConfig != null) {
            OptionalComponents optionalComponents = recordPageOptionalConfig.optionalComponents;
            C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(144));
            C1664590tQ1.LIZLLL(this, "ExteriorVideoRecordScene", false, new AwS374S0200000_8(this, optionalComponents, 44), 2);
            C1664600tQ2.LIZ(this, "ExteriorVideoRecordScene", new AwS391S0200000_25(this, optionalComponents, 60));
            C1642810sqt.LIZ(C1664600tQ2.LJ(this), "record_activity");
        }
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        this.LLJZIJLIL = c1drg;
        this.LLLLL = (e0) c1drg.LJII(e0.class, null);
        this.LLLLLIL = (InterfaceC1648570t0B) this.LLJZIJLIL.LJII(InterfaceC1648570t0B.class, null);
        this.LLLLLILLIL = (InterfaceC1621970sJH) this.LLJZIJLIL.LJII(InterfaceC1621970sJH.class, null);
        this.LLLFF = this.LLLLL.Gz0();
        this.LLLI = this.LLLLL.getPreviewView();
        boolean zLIZ = new C1653550t8D(this.LLL).LIZ();
        SafeHandler safeHandler = this.LLLF;
        ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 34);
        if (zLIZ) {
            j = 2000;
        } else {
            j = 0;
        }
        safeHandler.postDelayed(aRunnableS125S0100000_25, j);
        if (zLIZ) {
            this.LLLLL.PR(C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_ECOMMERCE_FIRST, EnumC2249681D3m.SHOOT), true);
        }
        this.LLLLL.A31().LIZ(this, new AObjectS246S0100000_25(this, 169));
        this.LLLLL.PB(new C1441530ncF());
        this.LLLLL.qF1().observe(this, new AObserverS227S0100000_25(this, 13));
        InterfaceC2254081DKk interfaceC2254081DKkSt2 = this.LLLLL.St2();
        if (this.LLL.getCreationId() == null) {
            creationId = "";
        } else {
            creationId = this.LLL.getCreationId();
        }
        interfaceC2254081DKkSt2.setControllerCallback(new C19771112Xd(creationId, this.LLL.creativeModel.audioAlgorithmModel));
        this.LLLLLIL.yK0().LIZ(this, new AObjectS246S0100000_25(this, 170));
        jVar.step("av_video_record_init", "init recorderModule end");
        o.LJIL.LJIIJ().LIZ();
        C1429380nIe.LIZ = false;
        jVar.step("av_video_record_init", "onCreate");
        if (!this.mArguments.getBoolean("need_refresh_filter_data", false)) {
            RecordTaskManager.LIZ(new jgp.q(), C298010BmB.LIZ());
        }
        RecordTaskManager.LIZ(new w(requireAppCompatActivity()), false);
        RecordTaskManager.LIZ(new u(), false);
        C0CHQ.LIZ().isDebugConfigOpen();
        C14LN.LIZ(requireAppCompatActivity(), this, C1655670tBd.LIZ);
        super.onActivityCreated(bundle);
        RecordPageOptionalConfig recordPageOptionalConfig2 = this.LLLLJI;
        if (recordPageOptionalConfig2 != null) {
            C539630LEj c539630LEj = C539630LEj.LIZ;
            String str = recordPageOptionalConfig2.previousPage;
            String str2 = this.LLL.shootWay;
            Boolean bool = Boolean.TRUE;
            c539630LEj.getClass();
            C539630LEj.LJII(7, str, str2, true, null, bool);
        }
        getWindow().addFlags(128);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.LLLJ = i;
        if (!C1688700u2u.LIZ(requireAppCompatActivity())) {
            C201955140j.LIZJ(c1650020t2W, "RecordConditionCheck.check() false");
            finish();
            return;
        }
        kg kgVar = new kg();
        this.LLLLIILLL = kgVar;
        NavigationScene navigationSceneLIZ = C214871197d.LIZ(kgVar);
        this.LLLLIILL = navigationSceneLIZ;
        add(R.id.szh, navigationSceneLIZ, "VideoRecordContainerScene");
        if (C1655580tBU.LIZ()) {
            b = 15;
        } else {
            b = 7;
        }
        C1A66.LJFF(b);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.video_record_new_scene_root);
        this.LLLFFI = frameLayout;
        View viewFindViewById = frameLayout.findViewById(R.id.szg);
        if (this.mArguments.getBoolean("exterior_fix_background_flash", false)) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            FrameLayout frameLayout2 = this.LLLFFI;
            try {
                TypedValue typedValue = new TypedValue();
                requireContext().getTheme().resolveAttribute(R.attr.e1, typedValue, true);
                i2 = typedValue.data;
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                i2 = -16777216;
            }
            frameLayout2.setBackgroundColor(i2);
        } else {
            viewFindViewById.animate().alpha(0.0f).setDuration(200L).setListener(new ALAdapterS5S0100000_8(viewFindViewById, 3)).start();
        }
        if (!this.LLLLIIIILLL) {
            HandlerHook.viewPost(this.LLLFFI, new ARunnableS108S0100000_8(this, 19));
        }
        if (this.LLL.creativeModel.loadMusicAndEffectModel.netUnavailableMusic) {
            HandlerHook.viewPost(this.LLLFFI, new ARunnableS108S0100000_8(this, 21));
        }
        this.LLLFZ = (FrameLayout) findViewById(R.id.mg3);
        C0CHQ.LIZ().LJIJJ().LJFF(requireActivity(), new AObjectS399S0100000_25(this, 5));
        if (this.LLLLIL) {
            C524780Ki4.LIZ.step("av_video_record_init", "init stickerModule start");
            l0 l0Var = (l0) this.LLJZIJLIL.LJIIL(null, l0.class);
            if (l0Var != null) {
                l0Var.jL(new InterfaceC1622600sKI() { // from class: X.0svn
                    @Override // X.InterfaceC1622600sKI
                    public final boolean LIZ() {
                        if (this.LIZ.LLL == null) {
                            return false;
                        }
                        return !C580130Mp9.LIZ(r0.LJI());
                    }

                    @Override // X.InterfaceC1622600sKI
                    public final boolean LIZIZ() {
                        InterfaceC1648570t0B interfaceC1648570t0B;
                        x2 x2Var = this.LIZ.LLLIILIL;
                        if (x2Var == null || x2Var.LLLLIILL() == null || (interfaceC1648570t0B = this.LIZ.LLLLLIL) == null) {
                            return true;
                        }
                        return interfaceC1648570t0B.Jv2().LIZJ().booleanValue();
                    }

                    @Override // X.InterfaceC1622600sKI
                    public final void LJJIJIIJIL() {
                        this.LIZ.LLLLLIL.Db2("sticker stop record");
                    }
                });
                this.LLLLLIL.yM2().LIZ(this, new AObjectS246S0100000_25(l0Var, 167));
                List<Fragment> listLJJLIIIJL = C20622515mp.LJIILL(requireAppCompatActivity(), this).LJJLIIIJL();
                if (C0IKQ.LIZIZ(listLJJLIIIJL)) {
                    listLJJLIIIJL.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Fragment fragment : listLJJLIIIJL) {
                        if (Boolean.valueOf(fragment instanceof AbstractStickerFragment).booleanValue()) {
                            arrayList.add(fragment);
                        }
                    }
                    if (C0IKQ.LIZIZ(arrayList)) {
                        C19EH c19ehLJIIJ = C20622515mp.LJIILL(requireAppCompatActivity(), this).LJIIJ();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
                        }
                        c19ehLJIIJ.LJIIJ();
                    }
                }
                C524780Ki4.LIZ.step("av_video_record_init", "init stickerModule end");
            }
            this.LLLF.post(new ARunnableS125S0100000_25(this, 31));
        }
        RecordTaskManager.LIZ(new h(), false);
        C1444920nhi.LIZLLL(this.LLL);
        o.LIZJ.getClass();
        C1514430pVp.LJFF(EnumC1584370rKd.valueOf("SHOOT"));
        getLifecycle().addObserver(new AudioFocusManager(this));
        this.LLLILZLLLI = (FrameLayout) findViewById(R.id.mb4);
        if (this.mArguments.getInt("translation_type", 0) == 1 && ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            C19GS c19gsRequireAppCompatActivity2 = requireAppCompatActivity();
            FrameLayout frameLayout3 = this.LLLILZLLLI;
            if (LLLZLL()) {
                C18L3 c18l3 = new C18L3(c19gsRequireAppCompatActivity2);
                C1649700t20.LIZ = true;
                c18l3.LIZ(R.layout.vy, frameLayout3, new C1649710t21(c19gsRequireAppCompatActivity2, frameLayout3));
            }
        } else {
            C1649720t22.LIZ(requireAppCompatActivity(), this.LLLILZLLLI, LLLZLL(), !((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI(), this.LLJZIJLIL);
        }
        this.LLLF.post(new ARunnableS125S0100000_25(this, 31));
        C1459710o5Z.LJIIJJI = true;
        C201955140j.LIZJ(C1650020t2W.LIZIZ, "JSBVideoRecordScene => onCreate end");
        C1448790nnx.LIZ = true;
        C1448790nnx.LIZIZ = true;
        C1448790nnx.LIZJ = true;
        if (this.LLLLIL) {
            RecordTaskManager.LIZ(new t(), false);
            RecordTaskManager.LIZ(new b(), false);
            requireAppCompatActivity();
            RecordTaskManager.LIZ(new com.ss.android.ugc.aweme.shortvideo.ui.task.f(), false);
        }
        RecordTaskManager.LIZ(new g(requireAppCompatActivity(), this), false);
        RecordTaskManager.LIZ(new PreloadMediaDataTask(getLifecycle(), requireAppCompatActivity(), this, EnumC194317110p.P0), false);
        RecordTaskManager.LIZ(new CacheChooseMediaViewHolderTask(requireAppCompatActivity(), getLifecycle(), this), false);
        RecordTaskManager.LIZ(new k(), false);
        C524780Ki4.LIZ.step("av_video_record_init", "onCreate end");
        this.LLLLL.LE(false);
        if (C306720C0o.LIZ()) {
            LLLLZ();
            this.LLLIZZ = false;
        }
        CreativeDurationExtra creativeDurationExtra = this.LLL.creativeFlowData.getCreativeDurationExtra();
        if (creativeDurationExtra.getStartTime() == 0) {
            creativeDurationExtra.setStartTime(System.currentTimeMillis());
        }
        C863370Xtv.LIZ("normal").LJI("at_shoot_page", false);
        if (this.LLLLIL) {
            String string = this.mArguments.getString("session");
            String string2 = this.mArguments.getString("host_uid");
            String string3 = this.mArguments.getString("host_name");
            if (string != null && this.LLLIIIL != null) {
                LLLLZIL().bG0().LIZLLL(this.LLLIIIL);
                this.LLL.LJJLIIIJL(true);
                SharedARModel sharedARModel = this.LLL.sharedARModel;
                if (sharedARModel != null) {
                    sharedARModel.setSharedARSessionId(string);
                    sharedARModel.setSharedARMultiPlayerUserName(string3);
                    sharedARModel.setSharedARMultiPlayerUserId(string2);
                    LLLZLZ();
                }
            }
            LLLLZIL().bG0().LIZ().observe(this, new AObserverS227S0100000_25(this, 12));
        }
        this.LLLF.post(new ARunnableS108S0100000_8(this, 20));
        C2208841Bcg.LIZ(C0CHQ.LIZ);
        this.LLJLLL.LIZ("video_record_activity_create");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y, X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.LLLJ;
        int i2 = configuration.screenWidthDp;
        if (i != i2) {
            this.LLLJ = i2;
            c0 c0Var = c0.LIZ;
            View view = this.LLLI;
            CameraComponentModel cameraComponentModel = this.LLL.cameraComponentModel;
            c0Var.q2(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public void onEvent(AnonymousClass0801 anonymousClass0801) {
        String str = anonymousClass0801.LIZ;
        if (str != null) {
            this.LLL.extraSession.commerceData = str;
        }
        C855640XhS.LIZ(this.LLL.creativeModel);
    }

    @Override // X.AbstractC214814194y
    public final void onNewIntent(Intent intent) {
        Bundle extras = null;
        if (!LLLLZLLLI()) {
            f fVar = f.LIZ;
            C19GS c19gsRequireAppCompatActivity = requireAppCompatActivity();
            fVar.getClass();
            f.LIZJ(c19gsRequireAppCompatActivity, intent, null);
        }
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        processNewArguments(extras);
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C786410Ut5.LJJIJL(bundle, "save_state_short_video_context", this.LLL);
        this.LLLLJ = (IBinderWrapper) this.mArguments.getParcelable(C539710LEr.LIZ(this.LLL));
        this.mArguments.remove(C539710LEr.LIZ(this.LLL));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.component.a aVarLLLLILI;
        x2 x2Var = this.LLLIILIL;
        if (x2Var != null && (aVarLLLLILI = x2Var.LLLLILI()) != null) {
            aVarLLLLILI.H90(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    @Override // X.AbstractC214814194y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean processNewArguments(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene.processNewArguments(android.os.Bundle):boolean");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    @C14EU(sticky = true)
    public void receiveToast(C1630980sXo c1630980sXo) {
        if (TextUtils.equals(c1630980sXo.LIZ, "sticker_unlocked")) {
            this.LLLILZ = true;
            if (this.LLLILZJ && !c1630980sXo.LIZJ) {
                InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
                requireAppCompatActivity();
                o.LJJI.getClass();
                interfaceC1624140sMm.getClass();
                this.LLLILZ = false;
            }
            EventBus.LIZLLL().LJIL(c1630980sXo);
        }
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsReEnterChoosePhoto(boolean z) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIL;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.setIsReEnterChoosePhoto(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLZ(boolean z, boolean z2) {
        ShortVideoContext shortVideoContext;
        if (z && (shortVideoContext = this.LLL) != null) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            final int i = cameraComponentModel.mVideoWidth;
            final int i2 = cameraComponentModel.mVideoHeight;
            HandlerHook.viewPost(this.LLLI, new Runnable() { // from class: X.0tBQ
                @Override // java.lang.Runnable
                public final void run() {
                    ExteriorVideoRecordScene exteriorVideoRecordScene = this.LL;
                    int i3 = i;
                    int i4 = i2;
                    exteriorVideoRecordScene.getClass();
                    C1C7U.LIZ("ExteriorVideoRecordScene@35a2.notAdaptLiveFullScreen$1L");
                    C537820L7k.LIZIZ(exteriorVideoRecordScene.LLLI, i3, i4);
                    C1C7U.LIZIZ("ExteriorVideoRecordScene@35a2.notAdaptLiveFullScreen$1L");
                }
            });
        }
        if (z2) {
            View view = this.LLLI;
            if (view != null) {
                C786410Ut5.Ob(view, 1.0f);
                C786410Ut5.pc(this.LLLI, 1.0f);
            }
            LLLLLJIL();
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LLLLLLIL();
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.kn, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsChangeMusicDownloadSuccess(boolean z, MusicModel musicModel, String str) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIL;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.setIsChangeMusicDownloadSuccess(true, musicModel, str);
        }
    }
}
