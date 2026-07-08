package com.ss.android.ugc.aweme.social.sendtodm;

import X.AbstractC1453750nvx;
import X.AbstractC2255721DQs;
import X.C01GW;
import X.C05YF;
import X.C09R3;
import X.C0ETY;
import X.C0I0B;
import X.C0LAB;
import X.C13DA;
import X.C13LE;
import X.C1403850mdT;
import X.C1428470nHB;
import X.C1428620nHQ;
import X.C1431800nMY;
import X.C1431840nMc;
import X.C1432260nNI;
import X.C1440005kM;
import X.C1446760nkg;
import X.C1456770o0p;
import X.C1599690rjL;
import X.C1664770tQJ;
import X.C19EG;
import X.C1DRG;
import X.C20622515mp;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C545820Lau;
import X.C564410MBr;
import X.C572310McX;
import X.C573570MeZ;
import X.InterfaceC1428690nHX;
import X.InterfaceC1429470nIn;
import X.InterfaceC1431860nMe;
import X.InterfaceC1446740nke;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455360nyY;
import X.InterfaceC1455590nyv;
import X.InterfaceC1455610nyx;
import X.InterfaceC1455680nz4;
import X.InterfaceC1731706qJ;
import X.InterfaceC20619215mI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS17S1300000_22;
import Y.ARunnableS26S1200000_22;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.services.dm.DMCreativeMobConstants;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS457S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import rlf.a;

/* JADX INFO: loaded from: classes23.dex */
public final class SendToDMComponent extends AbstractC2255721DQs<InterfaceC1431860nMe> implements InterfaceC1431860nMe, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LL;
    public final Activity LLILLJJLI;
    public final Scene LLILLL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455590nyv.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455360nyY.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C1456770o0p.class, null);
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(182));
    public final InterfaceC20619215mI LLJJ = new InterfaceC20619215mI() { // from class: X.0mlA
        @Override // X.InterfaceC20619215mI
        public final void LIZ() {
        }

        @Override // X.InterfaceC20619215mI
        public final void LIZIZ(IMContact iMContact, Fragment fragment) {
        }

        @Override // X.InterfaceC20619215mI
        public final void LIZLLL() {
            SendToDMComponent sendToDMComponent = this.LIZ;
            boolean z = sendToDMComponent.LLJIJIL;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1407540mjQ(this.LIZ, z, z && C1428470nHB.LJLIIL(sendToDMComponent.m3()) && !(C573570MeZ.LIZ() && C1428470nHB.LIZIZ(this.LIZ.m3())), null), 3);
        }

        @Override // X.InterfaceC20619215mI
        public final void LJFF() {
            this.LIZ.m3().creativeModel.editSaveLocalModel.isFromDMPanel = true;
            C1456770o0p c1456770o0pQ3 = this.LIZ.q3();
            if (c1456770o0pQ3 == null || !c1456770o0pQ3.LIZ) {
                this.LIZ.Z1();
            } else {
                InterfaceC1455360nyY interfaceC1455360nyYT2 = this.LIZ.T2();
                if (interfaceC1455360nyYT2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1455360nyYT2.YB0();
            }
            IDMCreativeEditService iDMCreativeEditServiceG2 = this.LIZ.G2();
            if (iDMCreativeEditServiceG2 != null) {
                iDMCreativeEditServiceG2.LJI(0, 0, this.LIZ.m3(), "edit_page_save");
            }
        }

        @Override // X.InterfaceC20619215mI
        public final void LIZJ(Map<String, String> map) {
            IDMCreativeEditService iDMCreativeEditServiceG2 = this.LIZ.G2();
            if (iDMCreativeEditServiceG2 != null) {
                iDMCreativeEditServiceG2.LJFF(this.LIZ.m3(), map);
            }
        }

        @Override // X.InterfaceC20619215mI
        public final void LJ(boolean z) {
            InterfaceC1455610nyx interfaceC1455610nyxW2 = this.LIZ.W2();
            if (interfaceC1455610nyxW2 != null) {
                interfaceC1455610nyxW2.Jf1(z, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // X.InterfaceC20619215mI
        public final void LJI(boolean z) {
            String str;
            a.LIZ.LIZJ(this.LIZ.m3(), "publish");
            EditSaveLocalModel editSaveLocalModel = this.LIZ.m3().creativeModel.editSaveLocalModel;
            ?? r5 = 1;
            r5 = 1;
            editSaveLocalModel.isFromQuickPublish = true;
            editSaveLocalModel.isFromDMPanel = true;
            this.LIZ.m3().creativeModel.editSaveLocalModel.isQuickPostAsStory = z;
            this.LIZ.H2().LLLLJ();
            SendToDMComponent sendToDMComponent = this.LIZ;
            boolean z2 = sendToDMComponent.LLJIJIL;
            if (!z2 || !C1428470nHB.LJLIIL(sendToDMComponent.m3()) || (C573570MeZ.LIZ() && C1428470nHB.LIZIZ(this.LIZ.m3()))) {
                r5 = 0;
            }
            if (!C855610XhP.LIZ() || z) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1407530mjP(this.LIZ, z2, r5, null), 3);
            }
            IDMCreativeEditService iDMCreativeEditServiceG2 = this.LIZ.G2();
            if (iDMCreativeEditServiceG2 != 0) {
                VideoPublishEditModel videoPublishEditModelM3 = this.LIZ.m3();
                if (z) {
                    str = "story_to_save";
                } else {
                    str = "post_to_save";
                }
                iDMCreativeEditServiceG2.LJI(z2 ? 1 : 0, r5, videoPublishEditModelM3, str);
            }
        }

        @Override // X.InterfaceC20619215mI
        public final boolean LJII(TuxSheet tuxSheet) {
            if (C0CHQ.LIZ().getPublishService().LJJLIIIJJIZ(this.LIZ.m3(), true)) {
                this.LIZ.B3(tuxSheet);
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC20619215mI
        public final void LJIIIIZZ(AwS566S0100000_22 awS566S0100000_22) {
            if (this.LIZ.m3().getAILivePhotoModel().LJIIJ() && this.LIZ.o2() != null) {
                InterfaceC1455680nz4 interfaceC1455680nz4O2 = this.LIZ.o2();
                if (interfaceC1455680nz4O2 != null) {
                    interfaceC1455680nz4O2.H51(new AwS566S0100000_22(awS566S0100000_22, 387));
                    return;
                }
                return;
            }
            awS566S0100000_22.invoke();
        }
    };

    @Override // X.InterfaceC1431860nMe
    public String lw() {
        return "SendToDMComponent";
    }

    @Override // X.InterfaceC1431860nMe
    public void p(String str) {
    }

    @Override // X.InterfaceC1431860nMe
    public void uu(String str) {
    }

    public InterfaceC1431860nMe w2() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SendToDMComponent.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SendToDMComponent.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SendToDMComponent.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SendToDMComponent.class, "extraCoverFrameApi", "getExtraCoverFrameApi()Lcom/ss/android/ugc/aweme/port/internal/ExtraCoverFrameService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SendToDMComponent.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(SendToDMComponent.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(SendToDMComponent.class, "editToolBarClickCallbacksApiComponent", "getEditToolBarClickCallbacksApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(SendToDMComponent.class, "socialNewEditConfig", "getSocialNewEditConfig()Lcom/ss/android/ugc/aweme/social/creation/api/edit/exp/SocialNewEditConfig;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJJIII = 8;
    }

    private final InterfaceC1455590nyv c3() {
        return (InterfaceC1455590nyv) this.LLIZ.getValue(this, LLJJI[3]);
    }

    public final IDMCreativeEditService G2() {
        return (IDMCreativeEditService) this.LLJILLL.getValue();
    }

    public final AbstractC1453750nvx H2() {
        return (AbstractC1453750nvx) this.LLILZ.getValue(this, LLJJI[0]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZLL.getValue(this, LLJJI[2]);
    }

    @Override // X.InterfaceC1431860nMe
    public void MA0() {
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().LJ().LIZIZ(null, C0I0B.LJFF.LIZIZ());
    }

    public final InterfaceC1455360nyY T2() {
        return (InterfaceC1455360nyY) this.LLJILJIL.getValue(this, LLJJI[6]);
    }

    public final InterfaceC1455610nyx W2() {
        return (InterfaceC1455610nyx) this.LLIZLLLIL.getValue(this, LLJJI[4]);
    }

    public final VideoPublishEditModel m3() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJI[1]);
    }

    public final InterfaceC1455680nz4 o2() {
        return (InterfaceC1455680nz4) this.LLJ.getValue(this, LLJJI[5]);
    }

    public final C1456770o0p q3() {
        return (C1456770o0p) this.LLJILJILJ.getValue(this, LLJJI[7]);
    }

    public final void v3() {
        String strLJ;
        C1431840nMc c1431840nMc;
        C1446760nkg.LIZ.getClass();
        if (!C1446760nkg.LIZJ() || (strLJ = C1446760nkg.LJ(m3())) == null || (c1431840nMc = (C1431840nMc) EventBus.LIZLLL().LJFF(C1431840nMc.class)) == null) {
            return;
        }
        IMMediaPublishEvent<?> iMMediaPublishEvent = c1431840nMc.LIZ;
        if (iMMediaPublishEvent instanceof IMMediaPublishEvent.DMRecordMediaPublishEvent) {
            IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEvent = (IMMediaPublishEvent.DMRecordMediaPublishEvent) iMMediaPublishEvent;
            String videoCoverPath = dMRecordMediaPublishEvent.getVideoCoverPath();
            if (videoCoverPath == null || videoCoverPath.length() == 0) {
                C1440005kM.LIZIZ(new C1431840nMc(dMRecordMediaPublishEvent.copy(dMRecordMediaPublishEvent.sessionId, dMRecordMediaPublishEvent.editModel, dMRecordMediaPublishEvent.isFromMainPost, true, strLJ, dMRecordMediaPublishEvent.videoCoverSize, dMRecordMediaPublishEvent.isFromDMTextIcon, dMRecordMediaPublishEvent.hasText, dMRecordMediaPublishEvent.systemShareFrom, dMRecordMediaPublishEvent.photoSwapScene, dMRecordMediaPublishEvent.photoSwapPairedMsgId, dMRecordMediaPublishEvent.isFromDMEffectIcon, dMRecordMediaPublishEvent.isHighLightVideo, dMRecordMediaPublishEvent.isFromQuickLiveReact, dMRecordMediaPublishEvent.mobMap)));
            }
        }
    }

    public final void Z1() {
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            H2().LLLLJI();
            return;
        }
        try {
            H2().LLLLJI();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1455610nyx.class, new AwS601S0100000_22(this, 247));
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent.onCreate.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SendToDMComponent sendToDMComponent = SendToDMComponent.this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStateChanged ");
                sbLIZ.append(event);
                sendToDMComponent.uu(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        JY0().ww2().observe(this, new AObserverS225S0100000_22(this, 62));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final InterfaceC20619215mI i3() {
        return this.LLJJ;
    }

    public final void B3(TuxSheet tuxSheet) {
        C19EG c19eg;
        int i;
        Context contextLIZIZ = C545820Lau.LIZIZ(H2());
        if (contextLIZIZ == null) {
            return;
        }
        m3().creativeModel.editSaveLocalModel.isFromDMPanel = true;
        m3().creativeModel.editSaveLocalModel.withSaveTypeOption = true;
        IDMCreativeEditService iDMCreativeEditServiceG2 = G2();
        if (iDMCreativeEditServiceG2 != null) {
            TuxSheet tuxSheetLIZJ = iDMCreativeEditServiceG2.LIZJ(contextLIZIZ, m3(), new AwS566S0100000_22(this, 384), new AwS566S0100000_22(this, 385), new AwS457S0200000_22(this, contextLIZIZ, 3), new AwS601S0100000_22(tuxSheet, 248));
            Scene scene = this.LLILLL;
            Activity activity = this.LLILLJJLI;
            if (activity instanceof C19EG) {
                c19eg = (C19EG) activity;
            } else {
                c19eg = null;
            }
            FragmentManager fragmentManagerLJIIJJI = C20622515mp.LJIIJJI(c19eg, scene);
            if (fragmentManagerLJIIJJI != null) {
                tuxSheetLIZJ.show(fragmentManagerLJIIJJI, "guide posting before save");
            }
            if (C1428470nHB.LJLIIL(m3()) && (!C573570MeZ.LIZ() || !C1428470nHB.LIZIZ(m3()))) {
                i = 1;
            } else {
                i = 0;
            }
            IDMCreativeEditService iDMCreativeEditServiceG22 = G2();
            if (iDMCreativeEditServiceG22 != null) {
                iDMCreativeEditServiceG22.LJI(1, i, m3(), "edit_page_save");
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void E3(boolean z) {
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null) {
            if (z) {
                value.play();
            } else {
                value.pause();
            }
        }
    }

    @Override // X.InterfaceC1431860nMe
    public void tJ0(boolean z) {
        String value;
        int duration;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        String str2;
        LandingModel landingModel;
        LandingModel landingModel2;
        IDMCreativeEditService iDMCreativeEditServiceG2;
        uu("start shareToDM");
        if (z) {
            value = DMCreativeMobConstants.EnterMethod.MAIN_POSTING_CAMERA_ICON.getValue();
        } else {
            value = DMCreativeMobConstants.EnterMethod.DOWNLOAD_SHARE_PANEL_AUTO.getValue();
        }
        IDMCreativeEditService iDMCreativeEditServiceG22 = G2();
        if (iDMCreativeEditServiceG22 != null) {
            VideoPublishEditModel videoPublishEditModelM3 = m3();
            C13DA c13da = new C13DA();
            c13da.put("enter_method", value);
            c13da.put("enter_from", DMCreativeMobConstants.EnterFrom.VIDEO_EDIT_PAGE.getValue());
            iDMCreativeEditServiceG22.LJIIJ(videoPublishEditModelM3, c13da.build());
        }
        Activity activity = this.LLILLJJLI;
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        if (value2 != null) {
            duration = value2.getDuration();
        } else {
            duration = 0;
        }
        if (!jK1(activity, z, duration)) {
            return;
        }
        Map<String, String> mapHh2 = hh2(z, value, new AwS108S0110000_22(this, z, 4));
        String str3 = mapHh2.get("is_text_mode");
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        if (!Intrinsics.LJFF(str3, "1")) {
            IDMCreativeEditService iDMCreativeEditServiceG23 = G2();
            if (iDMCreativeEditServiceG23 != null && iDMCreativeEditServiceG23.LJII(m3()) && (iDMCreativeEditServiceG2 = G2()) != null && iDMCreativeEditServiceG2.LJIIJJI()) {
                z2 = true;
            } else {
                z2 = false;
            }
            IMSharePanelApi.LIZ.getClass();
            InterfaceC1428690nHX interfaceC1428690nHXLIZ = C1599690rjL.LIZ().LIZ();
            Activity activity2 = this.LLILLJJLI;
            String str4 = m3().creativeModel.editSaveLocalModel.flowId;
            IDMCreativeEditService iDMCreativeEditServiceG24 = G2();
            if (iDMCreativeEditServiceG24 != null && iDMCreativeEditServiceG24.LIZ(m3())) {
                z3 = true;
            } else {
                z3 = false;
            }
            IDMCreativeEditService iDMCreativeEditServiceG25 = G2();
            if (iDMCreativeEditServiceG25 != null && iDMCreativeEditServiceG25.LIZIZ(m3())) {
                z4 = true;
            } else {
                z4 = false;
            }
            IDMCreativeEditService iDMCreativeEditServiceG26 = G2();
            if (iDMCreativeEditServiceG26 != null && !iDMCreativeEditServiceG26.LJIIIZ(m3())) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = !z5;
            boolean z8 = this.LLJIJIL;
            IDMCreativeEditService iDMCreativeEditServiceG27 = G2();
            if (iDMCreativeEditServiceG27 != null && iDMCreativeEditServiceG27.LJ(m3())) {
                z6 = true;
            } else {
                z6 = false;
            }
            InterfaceC20619215mI interfaceC20619215mI = this.LLJJ;
            String strLJ = C1403850mdT.LJ(m3());
            String strLIZLLL = C1403850mdT.LIZLLL(m3());
            boolean zLJJZZI = C1428470nHB.LJJZZI(m3());
            CreativeModel creativeModel = m3().creativeModel;
            if (creativeModel != null && (landingModel2 = creativeModel.landingModel) != null) {
                str = landingModel2.landingTab;
            } else {
                str = null;
            }
            boolean zLJFF = Intrinsics.LJFF("editor_tab", str);
            CreativeModel creativeModel2 = m3().creativeModel;
            if (creativeModel2 == null || (landingModel = creativeModel2.landingModel) == null || (str2 = landingModel.dataComeFrom) == null) {
                str2 = "";
            }
            interfaceC1428690nHXLIZ.LIZ(activity2, z, str4, z3, z4, z7, z2, z8, z6, mapHh2, interfaceC20619215mI, false, UUID.randomUUID().toString(), strLJ, strLIZLLL, false, zLJFF, str2, m3().creativeModel.editSaveLocalModel.isBackFromQuickPublish, zLJJZZI, false, new C1428620nHQ(this));
            m3().creativeModel.editSaveLocalModel.isBackFromQuickPublish = false;
        }
    }

    public static String W1(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1431860nMe
    public void Dt0(String str, Function1<? super Bitmap, Unit> function1) {
        C1431800nMY.LIZIZ(str, function1);
    }

    public final IMMediaPublishEvent.DMRecordMediaPublishEvent X1(IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEvent, VideoPublishEditModel videoPublishEditModel) {
        C1446760nkg.LIZ.getClass();
        String strLJ = C1446760nkg.LJ(videoPublishEditModel);
        if (strLJ == null) {
            return dMRecordMediaPublishEvent;
        }
        return dMRecordMediaPublishEvent.copy(dMRecordMediaPublishEvent.sessionId, dMRecordMediaPublishEvent.editModel, dMRecordMediaPublishEvent.isFromMainPost, true, strLJ, dMRecordMediaPublishEvent.videoCoverSize, dMRecordMediaPublishEvent.isFromDMTextIcon, dMRecordMediaPublishEvent.hasText, dMRecordMediaPublishEvent.systemShareFrom, dMRecordMediaPublishEvent.photoSwapScene, dMRecordMediaPublishEvent.photoSwapPairedMsgId, dMRecordMediaPublishEvent.isFromDMEffectIcon, dMRecordMediaPublishEvent.isHighLightVideo, dMRecordMediaPublishEvent.isFromQuickLiveReact, dMRecordMediaPublishEvent.mobMap);
    }

    public SendToDMComponent(C1DRG c1drg, Activity activity, Scene scene) {
        this.LL = c1drg;
        this.LLILLJJLI = activity;
        this.LLILLL = scene;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1431860nMe
    public Map<String, String> hh2(boolean z, String str, Function1<? super Map<String, String>, Unit> function1) {
        int duration;
        boolean z2;
        boolean z3;
        Object[] objArr;
        String str2;
        Object[] objArr2;
        Intent intent;
        Map<String, String> mapLJIILIIL;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        String string;
        Activity activity = this.LLILLJJLI;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null) {
            duration = value.getDuration();
        } else {
            duration = 0;
        }
        if (!jK1(activity, z, duration)) {
            return new LinkedHashMap();
        }
        m3().setShareToDM(true);
        IDMCreativeEditService iDMCreativeEditServiceG2 = G2();
        if (iDMCreativeEditServiceG2 != null && iDMCreativeEditServiceG2.LIZLLL(m3(), H2().LLLLLJIL(), JY0())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJIJIL = z2;
        JY0().RF0();
        boolean zLJJZZI = C1428470nHB.LJJZZI(m3());
        boolean zLLIIIJ = C1428470nHB.LLIIIJ(m3());
        C1432260nNI.LIZ(m3());
        C13DA c13da = new C13DA();
        if (m3().getOriginal() != 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z3) {
            objArr = "1";
        } else {
            objArr = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_shoot_upload", objArr);
        int camera = m3().getCamera();
        String str4 = "";
        if (camera != 0) {
            if (camera != 1) {
                str2 = "";
            } else {
                str2 = "front";
            }
        } else {
            str2 = "back";
        }
        c13da.put("camera", str2);
        String stickerID = m3().getStickerID();
        if (stickerID == null) {
            stickerID = "";
        }
        c13da.put("prop_id", stickerID);
        c13da.put("creation_id", m3().getCreationId());
        c13da.put("enter_from", DMCreativeMobConstants.EnterFrom.VIDEO_EDIT_PAGE.getValue());
        c13da.put("enter_method", str);
        Long l = m3().creativeModel.initialModel.dmCameraModel.effectTriggerMsgSentServerTime;
        if (l != null && (string = l.toString()) != null) {
            c13da.put("effect_trigger_msg_timestamp", string);
        }
        if (zLLIIIJ) {
            objArr2 = "1";
        } else {
            objArr2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_text_mode", objArr2);
        if (m3().getAILivePhotoModel().LJII()) {
            str3 = "1";
        }
        c13da.put("is_ai_alive", str3);
        String strW1 = null;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(m3().creativeModel, m3().getPreviewInfo(), C1428470nHB.LJJZZI(m3()))) {
            c13da.put("is_visual_poet", "1");
        }
        C564410MBr c564410MBr = C564410MBr.LIZ;
        UsageStatus usageStatusLJ = m3().getAILivePhotoModel().LJ();
        c564410MBr.getClass();
        c13da.put("ai_livephoto_status", String.valueOf(C564410MBr.LIZLLL(usageStatusLJ)));
        String str5 = m3().mShootWay;
        if (str5 == null) {
            str5 = "";
        }
        c13da.put("shoot_way", str5);
        String shootEnterMethod = m3().getShootEnterMethod();
        if (shootEnterMethod != null) {
            str4 = shootEnterMethod;
        }
        c13da.put("shoot_enter_method", str4);
        c13da.put("content_source", C1428470nHB.LJIILIIL(m3()));
        c13da.put("is_draft", String.valueOf(C1428470nHB.LJJJZ(m3()) ? 1 : 0));
        C0LAB c0lab = new C0LAB();
        C572310McX.LJ(m3(), c0lab);
        c13da.putAll(c0lab.LIZ);
        IDMCreativeEditService iDMCreativeEditServiceG22 = G2();
        if (iDMCreativeEditServiceG22 != null && (mapLJIILIIL = iDMCreativeEditServiceG22.LJIILIIL(m3())) != null) {
            c13da.putAll(mapLJIILIIL);
        }
        Map<String, String> mapBuild = c13da.build();
        Activity activity2 = this.LLILLJJLI;
        String str6 = null;
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            strW1 = W1(intent, "enter_dm");
        }
        if (Intrinsics.LJFF(strW1, "system_share")) {
            str6 = "video_edit";
        }
        EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
        if (zLJJZZI) {
            uu("start share to dm in image mode");
            H2().LLLLILI(new Runnable() { // from class: X.0nMa
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$1");
                    C1C7U.LIZIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$1");
                }
            }, new ARunnableS26S1200000_22(this, str6, mapBuild, 1));
            return mapBuild;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start share to dm in video mode, cover start time ");
        sbLIZ.append(m3().getVideoCoverStartTm());
        uu(C2188811AlT.LIZIZ(sbLIZ));
        H2().LLLLILI(new Runnable() { // from class: X.0nMb
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$3");
                C1C7U.LIZIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$3");
            }
        }, new ARunnableS17S1300000_22(this, str6, mapBuild, function1, 2));
        return mapBuild;
    }

    @Override // X.InterfaceC1431860nMe
    public boolean jK1(Activity activity, boolean z, int i) {
        return C1431800nMY.LIZ(activity, z, i);
    }
}
