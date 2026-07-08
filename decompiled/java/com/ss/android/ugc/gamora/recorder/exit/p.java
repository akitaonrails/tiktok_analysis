package com.ss.android.ugc.gamora.recorder.exit;

import X.AbstractC1252750ihl;
import X.AbstractC2255721DQs;
import X.C004I;
import X.C013C;
import X.C01GW;
import X.C05YF;
import X.C09R3;
import X.C0BRW;
import X.C0C64;
import X.C0CHW;
import X.C0LAB;
import X.C0LCS;
import X.C0MGL;
import X.C0V0I;
import X.C1170060gYO;
import X.C1171740gb6;
import X.C11DL;
import X.C11E5;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EE;
import X.C11EF;
import X.C123100dR;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LE;
import X.C1411580mpw;
import X.C1431840nMc;
import X.C1441190nbh;
import X.C1444920nhi;
import X.C1448140nmu;
import X.C1455930nzT;
import X.C1457570o27;
import X.C1457700o2K;
import X.C1462480oA2;
import X.C1462510oA5;
import X.C1590810rV1;
import X.C1602160rnK;
import X.C1622090sJT;
import X.C1623740sM8;
import X.C1624010sMZ;
import X.C1634100scq;
import X.C1637850sit;
import X.C1644460stY;
import X.C1645380sv2;
import X.C1655760tBm;
import X.C1655770tBn;
import X.C1655810tBr;
import X.C1655820tBs;
import X.C1655860tBw;
import X.C1655870tBx;
import X.C1655880tBy;
import X.C1655890tBz;
import X.C1655900tC0;
import X.C1655910tC1;
import X.C1658150tFd;
import X.C1659640tI2;
import X.C1660680tJi;
import X.C1664770tQJ;
import X.C1765020w20;
import X.C190N;
import X.C19292410dm;
import X.C19A3;
import X.C19EG;
import X.C1AF0;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C301590Brx;
import X.C380260EvY;
import X.C385220F8m;
import X.C385670FAf;
import X.C418740GbQ;
import X.C452501pT;
import X.C537670L6v;
import X.C539900LFk;
import X.C560530Lyd;
import X.C579800Moc;
import X.C579810Mod;
import X.C580090Mp5;
import X.C580200MpG;
import X.C770750ULh;
import X.C786410Ut5;
import X.C800330VaR;
import X.C855490XhD;
import X.C857370XkF;
import X.InterfaceC1166920gTK;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625470sOv;
import X.InterfaceC1626180sQ4;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1644770su3;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1649820t2C;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652190t61;
import X.InterfaceC1655620tBY;
import X.InterfaceC1655780tBo;
import X.InterfaceC1655950tC5;
import X.InterfaceC1655960tC6;
import X.InterfaceC1655970tC7;
import X.InterfaceC1656000tCA;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2257101DWa;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC560310LyH;
import X.InterfaceC569060MTo;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AObjectS244S0100000_18;
import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS108S0100000_8;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.creation.FFDEventReport;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.aigc.AigcStateHolder;
import com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.tools.draft.IDraftSavedPushService;
import com.ss.android.ugc.gamora.recorder.exit.p;
import com.ss.android.ugc.gamora.recorder.experiment.PostToFriendsConfig;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS671S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import lth.o;
import org.greenrobot.eventbus.EventBus;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public final class p extends AbstractC2255721DQs<C0MGL> implements InterfaceC1166920gTK, C0MGL, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C0MGL LLILLL = this;
    public final h0<Drawable> LLILZ = new h0<>(null);
    public final h0<Pair<Float, Float>> LLILZIL = new h0<>(null);
    public final C560530Lyd<Pair<String, Boolean>> LLILZLL = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLIZ = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLIZLLLIL = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLJ = new C560530Lyd<>();
    public final C19EG LLJI = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final ShortVideoContext LLJIJIL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1650230t2r LLJILJIL = (InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), ln3.a.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649820t2C.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final IAigcStateHolder LLJJJJ = AigcStateHolder.LIZLLL();
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC560310LyH.class, null);
    public final InterfaceC1731706qJ LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
    public final C560530Lyd<Unit> LLJJL;
    public final LiveEvent<Unit> LLJJLIIIJLLLLLLLZ;
    public final List<InterfaceC1655970tC7> LLJL;
    public final C1655770tBn LLJLIL;
    public final C560530Lyd<Unit> LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C580090Mp5 LLJLLL;
    public boolean LLJZ;
    public long LLJZIJLIL;
    public final C01GW LLL;
    public final C1655900tC0 LLLF;
    public long LLLFF;
    public long LLLFFI;
    public boolean LLLFZ;
    public long LLLI;
    public final C1455930nzT LLLII;

    public final void Z4() {
        this.LLJZ = true;
        rlf.a.LIZ.LIZJ(this.LLJIJIL, "save_draft");
        ShortVideoContext shortVideoContext = this.LLJIJIL;
        shortVideoContext.creativeModel.draftInfoModel.saveDraftScene = "clickPopupFromRecord";
        shortVideoContext.getClass();
        if (this.LLJIJIL.duetFromUser == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DuetUser -> current is draft: ");
            sbLIZ.append(this.LLJIJIL.creativeModel.draftInfoModel.isDraft);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C201955140j.LIZ("DuetUser -> RecordExitComponent -> realSaveDraft -> duetFromUser is null");
            C1AF0.LIZJ("DuetUser -> RecordExitComponent -> realSaveDraft -> duetFromUser is null");
        }
        this.LLJ.LJIIJ(Unit.LIZ);
        if (this.LLJILJIL instanceof mn3.e0) {
            fs2(new AwS587S0100000_8(this, 457));
        }
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(p.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(p.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(p.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(p.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(p.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(p.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(p.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(p.class, "recordControlProgressComponent", "getRecordControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(p.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(p.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(p.class, "aigcGenerationApi", "getAigcGenerationApi()Lcom/ss/android/ugc/gamora/recorder/sticker/aigc/AIGCGenerationApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(p.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12};
        LLLIIIIL = 8;
    }

    private final C1645380sv2 H3() {
        return (C1645380sv2) this.LLJJJIL.getValue(this, LLLIIII[9]);
    }

    private final InterfaceC1649820t2C O3() {
        return (InterfaceC1649820t2C) this.LLJJIJIL.getValue(this, LLLIIII[7]);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJIII.getValue(this, LLLIIII[4]);
    }

    private final InterfaceC560310LyH T2() {
        return (InterfaceC560310LyH) this.LLJJJJJIL.getValue(this, LLLIIII[10]);
    }

    private final C1623740sM8 W2() {
        return (C1623740sM8) this.LLJLL.getValue();
    }

    private final InterfaceC1652190t61 e4() {
        return (InterfaceC1652190t61) this.LLJJI.getValue(this, LLLIIII[3]);
    }

    private final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.LLJJIJI.getValue(this, LLLIIII[5]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJJ.getValue(this, LLLIIII[8]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJJ.getValue(this, LLLIIII[2]);
    }

    private final ln3.a m3() {
        return (ln3.a) this.LLJJIJIIJIL.getValue(this, LLLIIII[6]);
    }

    private final x1 v3() {
        return (x1) this.LLL.getValue();
    }

    public final void O() {
        this.LLJIJIL.creativeModel.draftInfoModel.saveDraftScene = "clickPopupFromRecord";
        if (o.LJIIZILJ.isLogin()) {
            Z4();
        } else {
            C1655820tBs.LIZ(this.LLJI, "video_shoot_page", "click_save_draft_popup", new InterfaceC1655960tC6() { // from class: X.0tC4
                @Override // X.InterfaceC1655960tC6
                public final void LIZ() {
                }

                @Override // X.InterfaceC1655960tC6
                public final void onSuccess() {
                    this.LIZ.Z4();
                }
            });
        }
    }

    public final InterfaceC1655780tBo Q3() {
        return (InterfaceC1655780tBo) this.LLJLLIL.getValue();
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJILLL.getValue(this, LLLIIII[1]);
    }

    public final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LLJJJJLIIL.getValue(this, LLLIIII[11]);
    }

    public final e0 iq() {
        return (e0) this.LLJILJILJ.getValue(this, LLLIIII[0]);
    }

    public final void t5() {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(this.LLJI);
        c1397620mTQ.LJFF(2131848040, new AwS604S0100000_25(this, 357));
        c1397620mTQ.LJII(2131830038, AFwS266S0000000_25.get$arr$(283));
        C1397580mTM c1397580mTM = new C1397580mTM(this.LLJI);
        c1397580mTM.LJFF(2131848042);
        c1397580mTM.LIZ(2131848041);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    private final boolean G2() {
        if (!C301590Brx.LIZ() || !C0BRW.LIZ() || !this.LLJIJIL.mIsFromDraft) {
            return false;
        }
        Q3().closeRecording();
        return true;
    }

    private final boolean W1() {
        InterfaceC1649820t2C interfaceC1649820t2CO3 = O3();
        if (interfaceC1649820t2CO3 == null || !interfaceC1649820t2CO3.EZ0() || C539900LFk.LIZ(this.LLJIJIL) || this.LLJIJIL.LJJJJIZL()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.LLJIJIL;
        return (shortVideoContext.cameraComponentModel.isEditorProRecordMode || C539900LFk.LJI(shortVideoContext)) ? false : true;
    }

    private final void X1() {
        IFundraiserService iFundraiserServiceLJIILL = ComplianceServiceProvider.LJIILL();
        if (iFundraiserServiceLJIILL == null || !iFundraiserServiceLJIILL.LIZ()) {
            return;
        }
        iFundraiserServiceLJIILL.LJIIIZ();
    }

    public final void F4() {
        C385670FAf<InterfaceC1644770su3> c385670FAfTn2;
        InterfaceC1644770su3 interfaceC1644770su3LIZJ;
        C385670FAf<ln3.a> c385670FAfEx;
        ln3.a aVarLIZJ;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            C1624010sMZ.LJII(stickerApiComponent, null);
        }
        if (C1622090sJT.LIZ(H3())) {
            InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
            if (recordAdapterApi != null && (c385670FAfEx = recordAdapterApi.ex()) != null && (aVarLIZJ = c385670FAfEx.LIZJ()) != null) {
                aVarLIZJ.Yz1(false);
            }
            InterfaceC1647420syK recordAdapterApi2 = getRecordAdapterApi();
            if (recordAdapterApi2 != null && (c385670FAfTn2 = recordAdapterApi2.tn2()) != null && (interfaceC1644770su3LIZJ = c385670FAfTn2.LIZJ()) != null) {
                interfaceC1644770su3LIZJ.yL2(true, "build_in");
            }
        } else {
            ln3.a aVarM3 = m3();
            if (aVarM3 != null) {
                aVarM3.Yz1(false);
            }
            InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
            if (filterApiComponent != null) {
                filterApiComponent.yL2(true, "build_in");
            }
        }
        this.LLJILJIL.ls();
        this.LLIZ.LJIIJ(Unit.LIZ);
        this.LLJILJIL.NF(s.NORMAL);
        iq().xP1(true, false, true);
        this.LLJIJIL.isDuetMode = false;
        Op().showAllTabsAndExitDuetMode();
        Op().showBottomTab(true);
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null) {
            C1624010sMZ.LJII(stickerApiComponent2, null);
        }
        Op().setCurrentTab("record_mode_duet", true, 0, false);
        JediViewModel jediViewModelLIZ = C1659640tI2.LIZLLL(this.LL).LIZ(ChangeDuetLayoutViewModel.class);
        jediViewModelLIZ.getClass();
        jediViewModelLIZ.setState(AFwS266S0000000_25.get$arr$(120));
        VERecorder vERecorderLIZIZ = this.LLJILJIL.u92().LIZIZ();
        vERecorderLIZIZ.LJIIL().LJIJJLI(0, new String[0], new String[0]);
        vERecorderLIZIZ.LIZIZ(VERecordMode.DEFAULT);
        Bundle bundle = this.LLJIJIL.nonDuetModeBundle;
        if (bundle != null) {
            C786410Ut5.LJJJI("enter_from", "duet_mode_to_normal", bundle);
            InterfaceC569060MTo interfaceC569060MToLIZ = C1660680tJi.LIZ();
            C19EG c19eg = this.LLJI;
            Intent intent = new Intent();
            intent.putExtras(bundle);
            interfaceC569060MToLIZ.LJIILLIIL(c19eg, intent);
        }
    }

    public final void H4() {
        InterfaceC1626180sQ4 interfaceC1626180sQ4BG0;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1626180sQ4BG0 = stickerApiComponent.bG0()) != null) {
            interfaceC1626180sQ4BG0.LIZIZ();
        }
        this.LLJIJIL.LJJLIIIJL(false);
        getPlanCUIApiComponent().m10(true);
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null) {
            C1624010sMZ.LJII(stickerApiComponent2, null);
        }
        iq().xP1(true, false, true);
        getPlanCUIApiComponent().oL1();
    }

    @Override // X.C0MGL
    public void clear() {
        Q3().LIZ();
    }

    public final void k5() {
        EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
        if (this.LLJILJIL instanceof mn3.e0) {
            fs2(new AwS601S0100000_22(this, 617));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfUn2;
        super.onCreate();
        this.LL.add(R.id.sz5, v3(), "RecordExitScene");
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi != null) {
            recordAdapterApi.bE0(this);
        }
        this.LLJILJIL.bu2().LIZ(this, new AObjectS244S0100000_18(this, 12));
        C1637850sit.LIZ(this, new AwS569S0100000_25(this, 568));
        InterfaceC1652190t61 interfaceC1652190t61E4 = e4();
        if (interfaceC1652190t61E4 != null && (c385670FAfUn2 = interfaceC1652190t61E4.un2()) != null) {
            c385670FAfUn2.LIZ(this, new AObjectS244S0100000_18(this, 13));
        }
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS244S0100000_18(this, 14));
        if (C1462510oA5.LIZ().isOpen) {
            this.LLJLIL.LIZLLL(new C1462480oA2(this.LLJI, this.LL, new AwS566S0100000_22(this, 798), new AwS671S0100000_22(this, 5)));
        }
        Bundle bundleLIZ = C537670L6v.LIZ(getDiContainer(), this.LLJI);
        if (bundleLIZ != null) {
            this.LLLFF = bundleLIZ.getLong("extra_start_record_time", -1L);
        }
        this.LLJILJIL.xF1().LIZ(this, new AObjectS245S0100000_22(this, 257));
        LiveData<C1448140nmu> liveDataQF1 = this.LLJILJIL.qF1();
        getLifecycleOwner();
        liveDataQF1.observe(this, new AObserverS225S0100000_22(this, 143));
        if (C301590Brx.LIZ()) {
            iq().ec().LIZ(this, new AObjectS246S0100000_25(this, 443));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJLIL.destroy();
        TikTokCameraBaseGroupScene rootScene = getRootScene();
        if (rootScene != null) {
            rootScene.LJLLL(this.LLLF);
        }
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi != null) {
            recordAdapterApi.bE0(null);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(true);
            iDMSendToFriendMenuActionHelperLIZ.LIZLLL();
        }
    }

    public C560530Lyd<Unit> B3() {
        return this.LLIZ;
    }

    @Override // X.C0MGL
    public /* bridge */ /* synthetic */ LiveEvent CZ1() {
        return this.LLIZ;
    }

    public C560530Lyd<Unit> E3() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0MGL
    public /* bridge */ /* synthetic */ LiveEvent LLLLIILLL() {
        return this.LLJ;
    }

    @Override // X.C0MGL
    public LiveEvent<Unit> LLLLLZL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C0MGL
    public long Rp1() {
        return this.LLJZIJLIL;
    }

    public C0MGL c3() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    public C560530Lyd<Pair<String, Boolean>> i3() {
        return this.LLILZLL;
    }

    public C560530Lyd<Unit> o4() {
        return this.LLJ;
    }

    @Override // X.C0MGL
    public /* bridge */ /* synthetic */ LiveEvent sI2() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0MGL
    public /* bridge */ /* synthetic */ LiveEvent v2() {
        return this.LLILZLL;
    }

    @Override // X.C0MGL
    public LiveEvent<Unit> wG() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private final boolean H2(String str) {
        if (C301590Brx.LIZ() && this.LLJIJIL.mIsFromDraft) {
            PY1(str);
            Q3().closeRecording();
            return true;
        }
        return false;
    }

    private final void Z1(String str) {
        PY1(str);
        Q3().closeRecording();
        C190N c190n = C190N.LIZIZ;
        if (c190n.LIZIZ() >= 3) {
            c190n.LIZ();
        }
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJLIIIL();
        }
    }

    private final void o2(final Function0<Unit> function0) {
        if (!o.LJIIZILJ.isLogin()) {
            C1655820tBs.LIZ(this.LLJI, "video_shoot_page", "click_save_draft_popup", new InterfaceC1655960tC6() { // from class: X.0tC3
                @Override // X.InterfaceC1655960tC6
                public final void LIZ() {
                }

                @Override // X.InterfaceC1655960tC6
                public final void onSuccess() {
                    function0.invoke();
                }
            });
        } else {
            function0.invoke();
        }
    }

    private final String q3(VideoPublishEditModel videoPublishEditModel) {
        String str = videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath;
        if (!C123100dR.LIZ(str)) {
            return videoPublishEditModel.getVideoCoverPath();
        }
        return str;
    }

    private final void v5(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1622990982) {
                if (iHashCode != 1089339861) {
                    if (iHashCode == 1670544073 && str.equals("click_cross")) {
                        C1590810rV1.LJ("shoot_2_main", "click_back");
                        return;
                    }
                    return;
                }
                if (!str.equals("slide_left")) {
                    return;
                }
                C1590810rV1.LJ("shoot_2_main", "slide_back");
                return;
            }
            if (!str.equals("system_back_button")) {
                return;
            }
            C1590810rV1.LJ("shoot_2_main", C1590810rV1.LIZIZ(this.LLJI));
        }
    }

    @Override // X.C0MGL
    public void BB2(String str) {
        InterfaceC560310LyH interfaceC560310LyHT2 = T2();
        if ((interfaceC560310LyHT2 != null && interfaceC560310LyHT2.onBackPressed()) || this.LLJLIL.LIZJ()) {
            return;
        }
        if (!this.LL.isShowing(v3())) {
            this.LLJIJIL.creativeModel.storyModel.setExitMethod(str);
            Xp1("system_back_button", System.currentTimeMillis());
        } else {
            this.LLILZLL.LJIIJ(new Pair<>(str, Boolean.FALSE));
        }
    }

    @Override // X.C0MGL
    public void FI0(InterfaceC1655970tC7 interfaceC1655970tC7) {
        this.LLJL.add(interfaceC1655970tC7);
    }

    @Override // X.C0MGL
    public void Fz0(InterfaceC1655950tC5 interfaceC1655950tC5) {
        C1655770tBn c1655770tBn = this.LLJLIL;
        if (interfaceC1655950tC5 == null) {
            c1655770tBn.getClass();
        } else {
            c1655770tBn.LIZIZ.remove(interfaceC1655950tC5);
        }
    }

    @Override // X.C0MGL
    public void GN2(boolean z) {
        int i;
        C418740GbQ c418740GbQ = v3().LLJJ;
        if (c418740GbQ != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c418740GbQ.getVisibility();
            c418740GbQ.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c418740GbQ);
        }
    }

    public final void O4(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", this.LLJIJIL.shootWay);
        c0lab.LJ("creation_id", this.LLJIJIL.getCreationId());
        c0lab.LJ("action_type", str);
        C20684815ws.LJIILLIIL("exit_shoot_popup_privacy", c0lab.LIZ);
    }

    public final void P4(Integer num) {
        String uid;
        InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857370XkF.LIZ();
        String uid2 = null;
        if (interfaceC2257101DWaLIZ != null) {
            uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
        } else {
            uid = null;
        }
        boolean zLIZIZ = C857370XkF.LIZIZ(uid);
        if (num != null && num.intValue() == 2 && C1655910tC1.LIZ()) {
            Q3().LJFF(zLIZIZ);
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PostToFriendsConfig postToFriendsConfig = C1655910tC1.LIZ;
        PostToFriendsConfig postToFriendsConfig2 = (PostToFriendsConfig) c0c64LJIILLIIL.LJJII(PostToFriendsConfig.class, postToFriendsConfig, "exit_camera_guide_opt", true);
        if (postToFriendsConfig2 != null) {
            postToFriendsConfig = postToFriendsConfig2;
        }
        if (postToFriendsConfig.showPrivacyDialog && zLIZIZ && num != null && num.intValue() == 2) {
            C19EG c19eg = this.LLJI;
            final C013C c013c = new C013C();
            c013c.element = true;
            C770750ULh c770750ULh = new C770750ULh();
            c770750ULh.LJIILLIIL = true;
            c770750ULh.LJIJ = false;
            c770750ULh.LJ = this.LLJI.getString(2131844922);
            c770750ULh.LJFF = this.LLJI.getString(2131844919);
            c770750ULh.LJI(this.LLJI.getString(2131844920), new AwS234S0300000_25(c013c, this, num, 21));
            c770750ULh.LJII(this.LLJI.getString(2131844921), AFwS266S0000000_25.get$arr$(282));
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            tuxSheet.LLILLL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJLLIL = true;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0tBt
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (c013c.element) {
                        this.O4("click_cancel");
                        c013c.element = true;
                    }
                }
            };
            tuxSheet.show(c19eg.getSupportFragmentManager(), "post to friends tips");
            InterfaceC2257101DWa interfaceC2257101DWaLIZ2 = C857370XkF.LIZ();
            if (interfaceC2257101DWaLIZ2 != null) {
                uid2 = ((C19292410dm) interfaceC2257101DWaLIZ2).getUid();
            }
            C01GW c01gw = C857370XkF.LIZ;
            Keva keva = (Keva) c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uid2);
            sbLIZ.append("_post_to_friends_times");
            int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("exit_camera_privacy_dialog_threshold_times", -1) > 0) {
                Keva keva2 = (Keva) c01gw.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(uid2);
                sbLIZ2.append("_post_to_friends_times");
                keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
            }
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("storeFirstShowLearnMore lastClickPostF:");
            sbLIZ3.append(i);
            C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ3));
            O4("show");
            return;
        }
        T4(num);
    }

    @Override // X.C0MGL
    public void PY1(String str) {
        C1444920nhi.LIZJ(this.LLJIJIL, str, "video_shoot_page", "video_shoot_page");
        C1444920nhi c1444920nhi = C1444920nhi.LIZ;
        ShortVideoContext shortVideoContext = this.LLJIJIL;
        long j = this.LLLFF;
        long j2 = this.LLLFFI;
        c1444920nhi.getClass();
        C1444920nhi.LIZIZ(str, shortVideoContext, j, j2, "video_shoot_page");
        C1411580mpw.LIZIZ = -1L;
        C1411580mpw.LIZJ = "";
        if (this.LLJIJIL.isDuetMode) {
            C855490XhD c855490XhD = C855490XhD.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c855490XhD.getClass();
            C855490XhD.LIZ(jCurrentTimeMillis, "duet_mode_creation", "exit");
            return;
        }
        if (!TextUtils.equals(str, "duet_mode")) {
            return;
        }
        C855490XhD c855490XhD2 = C855490XhD.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c855490XhD2.getClass();
        C855490XhD.LIZ(jCurrentTimeMillis2, "duet_mode_discover", "exit");
    }

    public final void T4(Integer num) {
        o2(new AwS409S0200000_8(this, num, 96));
    }

    @Override // X.C0MGL
    public void TH1(boolean z) {
        if (!C301590Brx.LIZ()) {
            return;
        }
        if (z) {
            this.LLILZ.LJII(C800330VaR.LIZIZ(this.LLJI, R.drawable.bx6));
        } else {
            this.LLILZ.LJII(C800330VaR.LIZIZ(this.LLJI, R.drawable.bx9));
        }
    }

    public final void d5(boolean z) {
        boolean zLJFF;
        C385670FAf<Boolean> c385670FAfUn2;
        InterfaceC1652190t61 interfaceC1652190t61E4 = e4();
        if (interfaceC1652190t61E4 != null && (c385670FAfUn2 = interfaceC1652190t61E4.un2()) != null) {
            zLJFF = Intrinsics.LJFF(c385670FAfUn2.LIZJ(), Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        boolean z2 = !zLJFF;
        C19A3 c19a3 = this.LL;
        if ((z || this.LLJIJIL.LJJJJL()) && z2) {
            C1658150tFd.LJ(c19a3, "RecordExitScene");
        } else {
            C1658150tFd.LIZIZ(c19a3, "RecordExitScene");
        }
    }

    @Override // X.C0MGL
    public void fs2(final Function1<? super VideoPublishEditModel, Unit> function1) {
        InterfaceC1650230t2r interfaceC1650230t2r = this.LLJILJIL;
        if (!(interfaceC1650230t2r instanceof mn3.e0)) {
            return;
        }
        C1655760tBm c1655760tBmQd1 = ((mn3.e0) interfaceC1650230t2r).qd1();
        c1655760tBmQd1.LIZ = this.LLJIJIL.cameraComponentModel.mWorkspace.LIZIZ().getPath();
        c1655760tBmQd1.LIZIZ = this.LLJIJIL.cameraComponentModel.mWorkspace.LIZ().getPath();
        c1655760tBmQd1.LJ = this.LLJILJIL.St2().getMediaController();
        c1655760tBmQd1.LIZLLL = this.LLJIJIL.enableSingleSegmentConcatUseCopy;
        c1655760tBmQd1.LJI = !r1.LJJJJLL();
        c1655760tBmQd1.LJII = VEMem.getInstance().inLowMemMode();
        SettingsManager.LIZLLL().getClass();
        c1655760tBmQd1.LJFF = SettingsManager.LIZ("pre_release_gpu_resource", false);
        c1655760tBmQd1.LIZJ = C580200MpG.LIZ(this.LLJIJIL);
        c1655760tBmQd1.LIZ(new InterfaceC1656000tCA() { // from class: X.0npQ
            @Override // X.InterfaceC1656000tCA
            public final void LIZ(int i, String str, String str2, String str3) {
                boolean z;
                C1463670oBx c1463670oBx;
                String str4;
                StitchParams stitchParams;
                NLEModel nLEModelLIZJ;
                C1463670oBx c1463670oBx2;
                double bgmLoudness;
                double peakLoudness;
                String str5 = str;
                String str6 = str2;
                C524780Ki4.LIZ.step("av_video_edit", "concatEnd");
                C579650MoN c579650MoN = new C579650MoN(str5, str6, str3, i);
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordDataLJFF = p1.LJFF(this.LIZ.LLJIJIL, str3);
                if (multiEditVideoStatusRecordDataLJFF != null && !this.LIZ.LLJIJIL.LJJJJLL()) {
                    Iterator<MultiEditVideoSegmentRecordData> it2 = multiEditVideoStatusRecordDataLJFF.curMultiEditVideoRecordData.segmentDataList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            MultiEditVideoSegmentRecordData next = it2.next();
                            if (next.enable && (str6 = next.audioPath) != null && (str5 = next.videoPath) != null) {
                                break;
                            }
                        } else {
                            str6 = "";
                            str5 = "";
                            break;
                        }
                    }
                    if (str5.length() == 0) {
                        str5 = c579650MoN.LIZ;
                    }
                    if (str6.length() == 0) {
                        str6 = c579650MoN.LIZIZ;
                    }
                }
                p pVar = this.LIZ;
                p1.LJ(pVar.LLJI, pVar.LLJIJIL);
                C580120Mp8 c580120Mp8 = new C580120Mp8();
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar2 = this.LIZ;
                C580100Mp6 c580100Mp6 = new C580100Mp6(c580120Mp8, jCurrentTimeMillis, pVar2.LLJIJIL, pVar2.LLJILJIL.LJLJJLL(), null, multiEditVideoStatusRecordDataLJFF, str5, str6);
                new C1438570nXT("VideoRecordNewActivity");
                p pVar3 = this.LIZ;
                VideoPublishEditModel videoPublishEditModelLJFF = C1438570nXT.LJFF(pVar3.LLJLLL.LIZIZ(c580100Mp6, pVar3.LLJIJIL));
                videoPublishEditModelLJFF.creativeModel.draftInfoModel.fromDraftPopup = true;
                C1428520nHG.LJLI(videoPublishEditModelLJFF);
                C1449720npS c1449720npS = C1449720npS.LIZ;
                float f = 1.0f;
                videoPublishEditModelLJFF.setMusicVolume(1.0f);
                if (videoPublishEditModelLJFF.isMuted()) {
                    f = 0.0f;
                }
                videoPublishEditModelLJFF.setVoiceVolume(f);
                if ((!videoPublishEditModelLJFF.isFastImport() || !videoPublishEditModelLJFF.isStickPointMode()) && !videoPublishEditModelLJFF.isPhotoMvMode() && !videoPublishEditModelLJFF.getSoundSyncFromAnchor()) {
                    MicDataModel micDataModel = videoPublishEditModelLJFF.creativeModel.micDataModel;
                    float f2 = micDataModel.editDefaultVolume;
                    if (f2 != -1.0f && !micDataModel.editVolumeChangeMark) {
                        videoPublishEditModelLJFF.setVoiceVolume(f2);
                    }
                } else {
                    videoPublishEditModelLJFF.setVoiceVolume(0.0f);
                }
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelLJFF.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isMemeSong()) {
                    z = true;
                } else {
                    z = false;
                }
                videoPublishEditModelLJFF.setIsSoundLoop(Boolean.valueOf(z));
                VEPreviewParams vEPreviewParamsLJII = C571500MbE.LJII(videoPublishEditModelLJFF, 0, 0, 7);
                C1441900ncq c1441900ncq = new C1441900ncq();
                c1441900ncq.LIZ = AFwS210S0000000_22.get$arr$(130);
                AbstractC1452680nuE abstractC1452680nuELIZ = C574110MfR.LIZ(videoPublishEditModelLJFF.getVideoEditorType(), c1441900ncq);
                NLEModel nLEModelLIZJ2 = null;
                abstractC1452680nuELIZ.LJJII(null, vEPreviewParamsLJII, null, null);
                NLEEditor nLEEditorLJII = abstractC1452680nuELIZ.LJII(vEPreviewParamsLJII);
                nLEEditorLJII.commit();
                nLEEditorLJII.done();
                abstractC1452680nuELIZ.LJJI(nLEEditorLJII.getModel(), true);
                new Object() { // from class: X.0npR
                }.getClass();
                VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
                if (Intrinsics.LJFF(videoPublishEditModelLJFF.getEnterFrom(), "single_song") && ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJFF() && videoPublishEditModelLJFF.getOrigin() != 1) {
                    MusicBuzModel musicBuzModel = videoPublishEditModelLJFF.creativeModel.musicBuzModel;
                    if (musicBuzModel.musicLength - musicBuzModel.musicStart < abstractC1452680nuELIZ.LJJ().getDuration()) {
                        MusicBuzModel musicBuzModel2 = videoPublishEditModelLJFF.creativeModel.musicBuzModel;
                        musicBuzModel2.musicStart = 0;
                        musicBuzModel2.musicStartFromCut = 0;
                        videoPublishEditModelLJFF.setMMusicStart(0);
                    }
                }
                AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelLJFF.creativeModel.musicBuzModel);
                if (videoPublishEditModelLJFF.isMusic() != 1 || ((videoPublishEditModelLJFF.getRecordMode() != 0 && !videoPublishEditModelLJFF.mIsFromDraft) || u4.LJJIIZ(videoPublishEditModelLJFF) || C1428470nHB.LLIIJI(videoPublishEditModelLJFF) || C1428470nHB.LLIIIZ(videoPublishEditModelLJFF) || C1452150ntN.LJFF(videoPublishEditModelLJFF) || (aVMusicExtractAVMusic2 != null && aVMusicExtractAVMusic2.hasExtendMusicList()))) {
                    if (videoPublishEditModelLJFF.isDraftMusicIllegal()) {
                        if (aVMusicExtractAVMusic2 == null) {
                            vEPreviewMusicParams.isMusicIllegal = true;
                            abstractC1452680nuELIZ.LJIIJJI(vEPreviewMusicParams, null);
                        }
                    } else if (aVMusicExtractAVMusic2 == null && videoPublishEditModelLJFF.isPhotoMvMode()) {
                        abstractC1452680nuELIZ.LJIIJJI(vEPreviewMusicParams, null);
                    }
                } else {
                    vEPreviewMusicParams.mPath = videoPublishEditModelLJFF.getMMusicPath();
                    vEPreviewMusicParams.mInPoint = videoPublishEditModelLJFF.getMMusicStart();
                    vEPreviewMusicParams.bgmDelay = videoPublishEditModelLJFF.getRecordBgmDelay();
                    if (videoPublishEditModelLJFF.getLoudnessBalanceParam() != null) {
                        LoudnessBalanceParam loudnessBalanceParam = videoPublishEditModelLJFF.getLoudnessBalanceParam();
                        double avgLoudness = 0.0d;
                        if (loudnessBalanceParam != null) {
                            bgmLoudness = loudnessBalanceParam.getBgmLoudness();
                        } else {
                            bgmLoudness = 0.0d;
                        }
                        vEPreviewMusicParams.bgmLoudness = bgmLoudness;
                        LoudnessBalanceParam loudnessBalanceParam2 = videoPublishEditModelLJFF.getLoudnessBalanceParam();
                        if (loudnessBalanceParam2 != null) {
                            peakLoudness = loudnessBalanceParam2.getPeakLoudness();
                        } else {
                            peakLoudness = 0.0d;
                        }
                        vEPreviewMusicParams.peakLoudness = peakLoudness;
                        LoudnessBalanceParam loudnessBalanceParam3 = videoPublishEditModelLJFF.getLoudnessBalanceParam();
                        if (loudnessBalanceParam3 != null) {
                            avgLoudness = loudnessBalanceParam3.getAvgLoudness();
                        }
                        vEPreviewMusicParams.avgLoudness = avgLoudness;
                    }
                    vEPreviewMusicParams.mDuration = C141Q.LIZIZ(videoPublishEditModelLJFF.getCurMusicServerLength(), videoPublishEditModelLJFF.getMMusicPath());
                    if (aVMusicExtractAVMusic2 != null && aVMusicExtractAVMusic2.getShootDuration() > 0 && Math.abs(vEPreviewMusicParams.mDuration - aVMusicExtractAVMusic2.getShootDuration()) >= 1000) {
                        vEPreviewMusicParams.mShootDuration = aVMusicExtractAVMusic2.getShootDuration();
                    } else {
                        vEPreviewMusicParams.mShootDuration = vEPreviewMusicParams.mDuration;
                    }
                    if (videoPublishEditModelLJFF.isCurrentAutoCutMode()) {
                        com.ss.android.ugc.aweme.autocut.s.LIZ.getClass();
                        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuELIZ.LJJ();
                        if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx2 = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
                            nLEModelLIZJ = c1463670oBx2.LIZJ();
                        } else {
                            nLEModelLIZJ = null;
                        }
                        long jLJJ = com.ss.android.ugc.aweme.autocut.s.LJJ(nLEModelLIZJ);
                        if (jLJJ > 0) {
                            vEPreviewMusicParams.mShootDuration = (int) jLJJ;
                        }
                    }
                    vEPreviewMusicParams.mVolume = videoPublishEditModelLJFF.getMusicVolume();
                    vEPreviewMusicParams.musicId = videoPublishEditModelLJFF.getMusicId();
                    if (aVMusicExtractAVMusic2 != null) {
                        str4 = aVMusicExtractAVMusic2.musicName;
                    } else {
                        str4 = null;
                    }
                    vEPreviewMusicParams.musicName = str4;
                    vEPreviewMusicParams.soundSpeed = Float.valueOf(videoPublishEditModelLJFF.creativeModel.musicBuzModel.soundSpeed);
                    vEPreviewMusicParams.changeTone = Boolean.valueOf(videoPublishEditModelLJFF.creativeModel.musicBuzModel.changeTone);
                    vEPreviewMusicParams.previewStartTime = videoPublishEditModelLJFF.getPreviewStartTime().floatValue();
                    vEPreviewMusicParams.isFastImport = videoPublishEditModelLJFF.isFastImport();
                    vEPreviewMusicParams.isSoundLoop = videoPublishEditModelLJFF.getIsSoundLoop().booleanValue();
                    if (videoPublishEditModelLJFF.isStitchMode() && (stitchParams = videoPublishEditModelLJFF.getStitchParams()) != null && stitchParams.isPGCMusic() && stitchParams.getMusicStart() >= 0) {
                        long duration = stitchParams.getDuration();
                        vEPreviewMusicParams.muteStart = 0;
                        vEPreviewMusicParams.muteEnd = (int) duration;
                    }
                    if (!C1428470nHB.LLIIIJ(videoPublishEditModelLJFF) || videoPublishEditModelLJFF.isFromCrash() || videoPublishEditModelLJFF.mIsFromDraft) {
                        abstractC1452680nuELIZ.LJIIJJI(vEPreviewMusicParams, null);
                    }
                }
                if (videoPublishEditModelLJFF.isMusic() == 1 && videoPublishEditModelLJFF.getRecordMode() == 1) {
                    videoPublishEditModelLJFF.setMMusicPath(null);
                }
                if (videoPublishEditModelLJFF.isCurrentAutoCutMode() && !videoPublishEditModelLJFF.isFromCrash() && !videoPublishEditModelLJFF.creativeModel.draftInfoModel.isDraft) {
                    C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "TikTokEditPreviewComponent update AutoCut template nledata");
                    AutoCutAnchorModel autoCutAnchorModel = videoPublishEditModelLJFF.creativeModel.autoCutAnchorModel;
                    com.ss.android.ugc.aweme.autocut.s sVar = com.ss.android.ugc.aweme.autocut.s.LIZ;
                    InterfaceC1452170ntP interfaceC1452170ntPLJJ2 = abstractC1452680nuELIZ.LJJ();
                    if ((interfaceC1452170ntPLJJ2 instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ2) != null) {
                        nLEModelLIZJ2 = c1463670oBx.LIZJ();
                    }
                    int value = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
                    sVar.getClass();
                    autoCutAnchorModel.nleData = com.ss.android.ugc.aweme.autocut.s.LJJLIIIJJIZ(nLEModelLIZJ2, value);
                }
                videoPublishEditModelLJFF.setNleData(abstractC1452680nuELIZ.LJJ().Zf());
                function1.invoke(videoPublishEditModelLJFF);
            }
        });
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.C0MGL
    public void lW1(InterfaceC1655950tC5 interfaceC1655950tC5) {
        this.LLJLIL.LIZLLL(interfaceC1655950tC5);
    }

    @Override // X.C0MGL
    public void sa2(long j) {
        this.LLJZIJLIL = j;
    }

    public final void w2(C579810Mod c579810Mod) {
        TikTokCameraBaseGroupScene rootScene;
        TikTokCameraBaseGroupScene rootScene2;
        CameraComponentModel cameraComponentModel = this.LLJIJIL.cameraComponentModel;
        if (!cameraComponentModel.isRetakeMode && cameraComponentModel.isEditorProRecordMode && (rootScene2 = getRootScene()) != null) {
            rootScene2.LLLJIL();
        }
        if (this.LLJIJIL.cameraComponentModel.isRetakeMode && (rootScene = getRootScene()) != null) {
            rootScene.LLLJIL();
        }
        C579800Moc.LIZJ(this.LLJI, c579810Mod, new AwS569S0100000_25(this, 566), new AwS569S0100000_25(this, 567), new AwS569S0100000_25(this, 569), new AwS569S0100000_25(this, 570));
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [X.0tC0] */
    public p(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJJL = c560530Lyd;
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd;
        this.LLJL = new ArrayList();
        this.LLJLIL = new C1655770tBn(new Function2<String, Boolean, Unit>() { // from class: X.0mqq
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(String str, Boolean bool) {
                long jCurrentTimeMillis;
                boolean zBooleanValue = bool.booleanValue();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("exit_method", str);
                c0lab.LJFF("is_intercept", zBooleanValue);
                c0lab.LIZIZ(System.currentTimeMillis() - this.LL.LLLFF, "duration_since_click_shoot");
                if (this.LL.LLLFFI > 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LLLFFI;
                } else {
                    jCurrentTimeMillis = -1;
                }
                c0lab.LIZIZ(jCurrentTimeMillis, "duration_since_shoot_page");
                C20684815ws.LJIILLIIL("creative_exit_intercept", c0lab.LIZ);
                return Unit.LIZ;
            }
        });
        this.LLJLILLLLZIIL = new C560530Lyd<>();
        this.LLJLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(626));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 573));
        this.LLJLLL = (C580090Mp5) getDiContainer().LJII(C580090Mp5.class, null);
        this.LLJZIJLIL = -1L;
        this.LLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2338));
        this.LLLF = new InterfaceC1655620tBY() { // from class: X.0tC0
            @Override // X.InterfaceC1655620tBY
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC1655620tBY
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.InterfaceC1655620tBY
            public final void LJ() {
                this.LIZ.BB2("system_back_button");
            }
        };
        this.LLLFF = -1L;
        this.LLLFFI = -1L;
        this.LLLI = -1L;
        this.LLLII = new C1455930nzT();
    }

    @Override // X.C0MGL
    public boolean IV1(View view, Function0<Unit> function0) {
        Object value;
        boolean z;
        SimpleEffect effectInfo;
        AVChallenge recordChallenge;
        Mission mission;
        String missionId;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        if (this.LLJZ) {
            C201955140j.LIZ("RecordExitComponent -> exitRecordWithAskDialog -> isSavingDraft,so don't show ask dialog");
            return false;
        }
        q stickerApiComponent = getStickerApiComponent();
        C1655810tBr c1655810tBr = null;
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) != null) {
            value = mutableLiveDataLJIJJLI.getValue();
        } else {
            value = null;
        }
        if (value != null) {
            z = true;
        } else {
            z = false;
        }
        C1457570o27 c1457570o27 = C1457570o27.LIZ;
        ShortVideoContext shortVideoContext = this.LLJIJIL;
        c1457570o27.getClass();
        C1457570o27.LIZLLL(shortVideoContext, z);
        String creationId = this.LLJIJIL.getCreationId();
        ShortVideoContext shortVideoContext2 = this.LLJIJIL;
        String str = shortVideoContext2.shootWay;
        long j = this.LLLFF;
        long j2 = this.LLLI;
        FFDEventReport fFDEventReport = shortVideoContext2.creativeModel.ffdEventReport;
        long j3 = fFDEventReport.shootUiFFD;
        int i = fFDEventReport.cameraErrorCode;
        c1457570o27.getClass();
        C1457570o27.LIZIZ("tool_performance_enter_shoot_page_new", creationId, str, j, j2, j3, i, "exit", "", "", "", false, false, false);
        this.LLJLILLLLZIIL.LJIIJ(Unit.LIZ);
        if (this.LLJIJIL.LJJJJL() || C539900LFk.LIZ(this.LLJIJIL)) {
            return false;
        }
        if (G2()) {
            return true;
        }
        boolean zW1 = W1();
        boolean zLJFF = C539900LFk.LJFF(this.LLJIJIL);
        boolean zLIZ = C123100dR.LIZ(this.LLJIJIL.creativeModel.paidContentModel.getCollectionId());
        C1441190nbh c1441190nbhLIZIZ = this.LLJILJIL.pw0().LIZIZ();
        if ((c1441190nbhLIZIZ instanceof Collection) && c1441190nbhLIZIZ.isEmpty()) {
            recordChallenge = this.LLJIJIL.creativeModel.commerceModel.getRecordChallenge();
            c1655810tBr = recordChallenge != null ? new C1655810tBr(this) : new C1655810tBr(this);
        } else {
            for (TimeSpeedModelExtension timeSpeedModelExtension : c1441190nbhLIZIZ) {
                if (timeSpeedModelExtension != null && (effectInfo = timeSpeedModelExtension.getEffectInfo()) != null && effectInfo.isBusinessEffect()) {
                    break;
                }
            }
            recordChallenge = this.LLJIJIL.creativeModel.commerceModel.getRecordChallenge();
            if ((recordChallenge != null || !recordChallenge.isCommerce) && (((mission = this.LLJIJIL.creativeModel.commerceModel.getMission()) == null || (missionId = mission.getMissionId()) == null || missionId.length() == 0) && !zLIZ)) {
            }
        }
        if (this.LLJIJIL.LJJJJLL()) {
            if (!zLJFF && this.LLJIJIL.cameraComponentModel.mRestoreType == 1) {
                function0.invoke();
                return true;
            }
            Q3().LJIIJ(view, zW1, new C1655860tBw(this), new C1655880tBy(this), c1655810tBr);
            return true;
        }
        if (!zLJFF) {
            function0.invoke();
            return true;
        }
        Q3().LJIIIZ(view, zW1, new C1655870tBx(this), new C1655890tBz(this), c1655810tBr);
        return true;
    }

    public final void K4(View view, String str) {
        if (this.LLJLIL.LIZJ()) {
            return;
        }
        if (C0CHW.LIZ() && !d4.LJIL(this.LLJIJIL) && IV1(view, new AwS174S1100000_25(this, str, 9))) {
            return;
        }
        X1();
        yp0(str, System.currentTimeMillis());
    }

    @Override // X.C0MGL
    public void Xp1(String str, long j) {
        if (!this.LLJLIL.LIZ(str)) {
            Z1(str);
        }
    }

    public final void n5(VideoPublishEditModel videoPublishEditModel, AwemeDraft awemeDraft) throws Throwable {
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = new ARunnableS108S0100000_8(this, 91);
        IDraftSavedPushService iDraftSavedPushService = (IDraftSavedPushService) PluggableExtentionKt.pluggableSpi$default(IDraftSavedPushService.class, false, false, false, 14, null);
        if (iDraftSavedPushService != null && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            iDraftSavedPushService.LIZ(awemeDraft, aRunnableS108S0100000_8);
        } else {
            aRunnableS108S0100000_8.run();
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.C0MGL
    public void yp0(String str, long j) {
        Object value;
        boolean z;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        this.LLJIJIL.creativeModel.storyModel.setExitMethod(str);
        if (this.LLJZ) {
            C201955140j.LIZ("RecordExitComponent -> exitRecord -> isSavingDraft, so don't respond");
            return;
        }
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) != null) {
            value = mutableLiveDataLJIJJLI.getValue();
        } else {
            value = null;
        }
        if (value != null) {
            z = true;
        } else {
            z = false;
        }
        C1457570o27 c1457570o27 = C1457570o27.LIZ;
        ShortVideoContext shortVideoContext = this.LLJIJIL;
        c1457570o27.getClass();
        C1457570o27.LIZLLL(shortVideoContext, z);
        String creationId = this.LLJIJIL.getCreationId();
        ShortVideoContext shortVideoContext2 = this.LLJIJIL;
        String str2 = shortVideoContext2.shootWay;
        long j2 = this.LLLFF;
        long j3 = this.LLLI;
        FFDEventReport fFDEventReport = shortVideoContext2.creativeModel.ffdEventReport;
        long j4 = fFDEventReport.shootUiFFD;
        int i = fFDEventReport.cameraErrorCode;
        c1457570o27.getClass();
        C1457570o27.LIZIZ("tool_performance_enter_shoot_page_new", creationId, str2, j2, j3, j4, i, "exit", "", "", "", false, false, false);
        C560530Lyd<Unit> c560530Lyd = this.LLJLILLLLZIIL;
        Unit unit = Unit.LIZ;
        c560530Lyd.LJIIJ(unit);
        sa2(j);
        this.LLJIJIL.creativeModel.recordMobModel.exitRecordTimeMillis = j;
        v5(str);
        if (C539900LFk.LIZ(this.LLJIJIL)) {
            PY1(str);
            Q3().LJII();
            return;
        }
        ShortVideoContext shortVideoContext3 = this.LLJIJIL;
        CameraComponentModel cameraComponentModel = shortVideoContext3.cameraComponentModel;
        if (cameraComponentModel.mRestoreType == 1 && !cameraComponentModel.isRetakeMode && !cameraComponentModel.isEditorProRecordMode && !shortVideoContext3.LJJJJI()) {
            if (!H2(str)) {
                Q3().LJI(new AwS174S1100000_25(this, str, 10));
            }
        } else if (this.LLJIJIL.LJII() == 0) {
            if (this.LLJIJIL.LJJJJL()) {
                t5();
                return;
            }
            ShortVideoContext shortVideoContext4 = this.LLJIJIL;
            if (shortVideoContext4.isDuetMode) {
                PY1(str);
                F4();
                return;
            } else if (shortVideoContext4.LJJJJLL()) {
                Q3().LJ(AFwS214S0000000_25.get$arr$(283), new AwS174S1100000_25(this, str, 11), new AwS174S1100000_25(this, str, 12));
            } else {
                Xp1(str, j);
            }
        } else if (this.LLJIJIL.LJJJJLL()) {
            Q3().LIZIZ(AFwS214S0000000_25.get$arr$(284), new AwS174S1100000_25(this, str, 13), new AwS569S0100000_25(this, 572));
        } else {
            Q3().LIZJ(AFwS214S0000000_25.get$arr$(285), new AwS174S1100000_25(this, str, 14), new AwS569S0100000_25(this, 571));
        }
        this.LLIZLLLIL.LJIIJ(unit);
    }

    public final void z4(View view, String str) {
        if (this.LLJLIL.LIZJ()) {
            return;
        }
        if (C539900LFk.LIZ(this.LLJIJIL) && C0CHW.LIZ() && C539900LFk.LJFF(this.LLJIJIL)) {
            yp0(str, System.currentTimeMillis());
            return;
        }
        if (C539900LFk.LJFF(this.LLJIJIL) && C0CHW.LIZ() && !d4.LJIL(this.LLJIJIL) && IV1(view, new AwS174S1100000_25(this, str, 15))) {
            return;
        }
        if (this.LLJIJIL.LJJJJLL() && C0CHW.LIZ() && !d4.LJIL(this.LLJIJIL) && IV1(view, new AwS174S1100000_25(this, str, 16))) {
            return;
        }
        if (this.LLJIJIL.creativeModel.aigcMetadataModel.isAigcEffect) {
            W2().onEvent(new C1457700o2K(new C0V0I(0)));
        }
        X1();
        yp0(str, System.currentTimeMillis());
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
