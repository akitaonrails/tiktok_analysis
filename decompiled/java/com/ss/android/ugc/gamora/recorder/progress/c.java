package com.ss.android.ugc.gamora.recorder.progress;

import X.AbstractC2255721DQs;
import X.C013C;
import X.C01GW;
import X.C05YF;
import X.C0LF1;
import X.C0TBG;
import X.C11NJ;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1443960ngA;
import X.C1608660rxo;
import X.C1618440sDa;
import X.C1621950sJF;
import X.C1631190sY9;
import X.C1647390syH;
import X.C1648520t06;
import X.C1648560t0A;
import X.C1649650t1v;
import X.C1664770tQJ;
import X.C19A3;
import X.C19EG;
import X.C1DRG;
import X.C21408218qG;
import X.C2217381BqS;
import X.C300060BpU;
import X.C330830Cy1;
import X.C366700EZg;
import X.C375780EoK;
import X.C385670FAf;
import X.C418440Gaw;
import X.C443120HZe;
import X.C452501pT;
import X.C531060KsC;
import X.C538770LBb;
import X.C539900LFk;
import X.C560530Lyd;
import X.C579080MnS;
import X.C694200RKw;
import X.C694210RKx;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1648530t07;
import X.EnumC452301pR;
import X.InterfaceC1621970sJH;
import X.InterfaceC1624950sO5;
import X.InterfaceC1630630sXF;
import X.InterfaceC1638550sk1;
import X.InterfaceC1647420syK;
import X.InterfaceC1648020szI;
import X.InterfaceC1648050szL;
import X.InterfaceC1648510t05;
import X.InterfaceC1648550t09;
import X.InterfaceC1648570t0B;
import X.InterfaceC1648590t0D;
import X.InterfaceC1648710t0P;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652190t61;
import X.InterfaceC1731706qJ;
import X.InterfaceC21645719nT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC576020MiW;
import X.ViewOnTouchListenerC1648690t0N;
import Y.AObjectS244S0100000_18;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.AObserverS227S0100000_25;
import android.animation.Animator;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nows.experiment.AIGCPhotoGenerationOptimization;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class c extends AbstractC2255721DQs<InterfaceC1630630sXF> implements InterfaceC1630630sXF, InterfaceC379610EuV {
    public static final C1648560t0A LLLILZJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public static final int LLLIZZ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1630630sXF LLILZ = this;
    public final C560530Lyd<Unit> LLILZIL = new C560530Lyd<>();
    public final h0<Boolean> LLILZLL;
    public final h0<Boolean> LLIZ;
    public final h0<Long> LLIZLLLIL;
    public final h0<Long> LLJ;
    public final h0<Boolean> LLJI;
    public final h0<Boolean> LLJIJIL;
    public final h0<Pair<List<TimeSpeedModelExtension>, Long>> LLJILJIL;
    public final h0<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJILJILJ;
    public final h0<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJILLL;
    public final h0<Long> LLJJ;
    public final h0<Boolean> LLJJI;
    public final h0<Boolean> LLJJIII;
    public final C538770LBb<Integer> LLJJIJI;
    public final h0<Integer> LLJJIJIIJIL;
    public final h0<RetakeVideoContext> LLJJIJIL;
    public final h0<Pair<List<TimeSpeedModelExtension>, Long>> LLJJJ;
    public final h0<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1648510t05 LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public boolean LLLF;
    public Animator LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final C11NJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final List<InterfaceC576020MiW<Boolean, Boolean>> LLLIIIIL;
    public final C01GW LLLIIIL;
    public boolean LLLIIL;
    public final C01GW LLLIILIL;
    public boolean LLLIL;
    public final C01GW LLLILZ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P4() {
        /*
            r2 = this;
            r0 = 1
            r2.e4(r0)
            boolean r0 = r2.H3()
            if (r0 != 0) goto Lc0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJJIII(r0)
            if (r0 != 0) goto Lc0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJIIIZ(r0)
            if (r0 != 0) goto Lc0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJIL(r0)
            if (r0 != 0) goto Lb0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJJIIZ(r0)
            if (r0 != 0) goto L41
            X.0nk1 r1 = X.C1446350nk1.LIZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            r1.getClass()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJIILIIL(r0)
            if (r0 == 0) goto Lb0
        L41:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r0 = r0.initialModel
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig r0 = r0.recordPageOptionalConfig
            if (r0 != 0) goto Lb0
            X.0t07 r0 = X.EnumC1648530t07.STORY
        L4f:
            r2.LZ1(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r1 = X.C539900LFk.LIZ(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = r0.LJJJ()
            if (r0 != 0) goto La2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = r0.LJJIL()
            if (r0 != 0) goto La2
            if (r1 != 0) goto La2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJJIII(r0)
            if (r0 != 0) goto La2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJIIIZ(r0)
            if (r0 != 0) goto La2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = r0.LJJIIZI()
            if (r0 != 0) goto La2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = r0.LJJIJ()
            if (r0 != 0) goto La2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = X.C1649780t28.LIZ(r0)
            if (r0 == 0) goto La6
        La2:
            r0 = 0
            r2.F4(r0)
        La6:
            com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0 r1 = r2.iq()
            java.lang.Class<X.0LF1> r0 = X.C0LF1.class
            r1.va0(r0)
            return
        Lb0:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
            boolean r0 = X.C578110Mlt.LIZIZ(r0)
            if (r0 == 0) goto Lbd
            X.0t07 r0 = X.EnumC1648530t07.PHOTO
            goto L4f
        Lbd:
            X.0t07 r0 = X.EnumC1648530t07.DEFAULT
            goto L4f
        Lc0:
            X.0t07 r0 = X.EnumC1648530t07.PHOTO
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.progress.c.P4():void");
    }

    public final void Q3() {
        YY1(false);
        LZ1(EnumC1648530t07.DEFAULT);
        Hn(3, false);
        hF2(true, false);
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig == null || recordPageOptionalConfig.recordBottomTabConfig == null) {
            Y60(true);
        } else {
            C1443960ngA.LJIIJ(getShortVideoContext());
        }
        e4(false);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0t0A] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(c.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(c.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(c.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(c.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(c.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0), new C2217381BqS(c.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new C2217381BqS(c.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(c.class, "gameApiComponent", "getGameApiComponent()Lcom/ss/android/ugc/aweme/sticker/GameStickerApiComponent;", 0), new C2217381BqS(c.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(c.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C2217381BqS(c.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(c.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new C2217381BqS(c.class, "recordConflictsManagementApi", "getRecordConflictsManagementApi()Lcom/ss/android/ugc/aweme/shortvideo/conflicts/RecordConflictsManagementApi;", 0), new C2217381BqS(c.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0), new C2217381BqS(c.class, "resetRecordSegmentsAction", "getResetRecordSegmentsAction()Landroidx/lifecycle/MutableLiveData;", 0)};
        LLLILZJ = new Object() { // from class: X.0t0A
        };
        LLLIZZ = 8;
    }

    private final C1631190sY9 H2() {
        return (C1631190sY9) this.LLLII.getValue(this, LLLILZLLLI[13]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLJLIL.getValue(this, LLLILZLLLI[5]);
    }

    private final InterfaceC1652190t61 getRecordPermissionApiComponent() {
        return (InterfaceC1652190t61) this.LLJZIJLIL.getValue(this, LLLILZLLLI[11]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJLLL.getValue(this, LLLILZLLLI[9]);
    }

    private final MutableLiveData<Boolean> q3() {
        return (MutableLiveData) this.LLLIIII.getValue(this, LLLILZLLLI[14]);
    }

    private final long v3() {
        return ((Number) this.LLLIILIL.getValue()).longValue();
    }

    public final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJL.getValue(this, LLLILZLLLI[2]);
    }

    public final InterfaceC1638550sk1 T2() {
        return (InterfaceC1638550sk1) this.LLLILZ.getValue();
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLILZLLLI[3]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJJJJJIL.getValue(this, LLLILZLLLI[1]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJJJ.getValue(this, LLLILZLLLI[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJLILLLLZIIL.getValue(this, LLLILZLLLI[6]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJZ.getValue(this, LLLILZLLLI[10]);
    }

    public final InterfaceC1648590t0D i3() {
        return (InterfaceC1648590t0D) this.LLL.getValue(this, LLLILZLLLI[12]);
    }

    public final e0 iq() {
        return (e0) this.LLJL.getValue(this, LLLILZLLLI[4]);
    }

    public final f m3() {
        return (f) this.LLLIIIL.getValue();
    }

    public final C19EG o2() {
        return (C19EG) this.LLJLLIL.getValue(this, LLLILZLLLI[8]);
    }

    public final InterfaceC1624950sO5 w2() {
        return (InterfaceC1624950sO5) this.LLJLL.getValue(this, LLLILZLLLI[7]);
    }

    private final void E3() {
        q stickerApiComponent;
        C385670FAf<String> c385670FAfJP0;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        LiveEvent<C443120HZe<Integer, Integer, Intent>> liveEventLLZIL;
        a planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (liveEventLLZIL = planCUIApiComponent.LLZIL()) != null) {
            liveEventLLZIL.LIZ(this, new AObjectS246S0100000_25(this, 471));
        }
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null && (bottomTabIndexChangeEvent = interfaceC1648020szIOp.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 473));
        }
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) != null) {
            c385670FAfJP0.LIZ(this, new AObjectS246S0100000_25(this, 475));
        }
        iq().fx().LIZ(this, new AObjectS246S0100000_25(this, 476));
        if (AIGCPhotoGenerationOptimization.INSTANCE.isEnabled() && (stickerApiComponent = getStickerApiComponent()) != null) {
            stickerApiComponent.gO2().LIZ(this, new AObjectS306S0200000_25((Object) this, (Object) stickerApiComponent, (InterfaceC1648570t0B) 17));
            stickerApiComponent.mH1().LIZ(this, new AObjectS246S0100000_25(this, 479));
            stickerApiComponent.f82().LIZ(this, new AObjectS246S0100000_25(this, 480));
        }
        MutableLiveData<Boolean> mutableLiveDataQ3 = q3();
        if (mutableLiveDataQ3 != null) {
            mutableLiveDataQ3.observe(this, new AObserverS227S0100000_25(this, 57));
        }
    }

    private final void o4() {
        if (getShortVideoContext().LJJJJL()) {
            View view = m3().LLLIILIL;
            C786410Ut5.T4(view != null ? view : null, 0.2f);
        } else {
            View view2 = m3().LLLIILIL;
            C786410Ut5.T4(view2 != null ? view2 : null, 1.0f);
        }
    }

    public final long B3() {
        Integer numValueOf;
        if (getShortVideoContext().LJJJJLL()) {
            return 3000L;
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return getShortVideoContext().cameraComponentModel.mRetakeDuration;
        }
        if (getShortVideoContext().cameraComponentModel.editorProRecordUsedForPip) {
            return 0L;
        }
        if (!C539900LFk.LIZ(getShortVideoContext())) {
            return v3();
        }
        ShortVideoContext shortVideoContext = getShortVideoContext();
        ArrayList<VideoTemplateSlot> templateSlots = shortVideoContext.creativeModel.templateData.getCameraSlotModel().getTemplateSlots();
        int slotIndex = shortVideoContext.creativeModel.templateData.getCameraSlotModel().getSlotIndex();
        return (templateSlots == null || templateSlots.size() <= 0 || slotIndex >= templateSlots.size() || slotIndex < 0 || (numValueOf = Integer.valueOf((int) (((VideoTemplateSlot) ListProtector.get(templateSlots, slotIndex)).getDuration() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)))) == null) ? v3() : numValueOf.intValue();
    }

    public final boolean H3() {
        return C1443960ngA.LJIIL(getShortVideoContext());
    }

    public final void O3() {
        P4();
        Hn(3, false);
    }

    public final boolean O4() {
        return (C330830Cy1.LIZ() && C1443960ngA.LJIIIZ(getShortVideoContext())) ? false : true;
    }

    @Override // X.InterfaceC1649820t2C
    public void T5() {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        int i = viewOnTouchListenerC1648690t0N.LLJI;
        if (i == 1 || i == 4 || i == 12) {
            viewOnTouchListenerC1648690t0N.LJFF(2);
            viewOnTouchListenerC1648690t0N.invalidate();
        } else if (i == 10 || i == 9) {
            viewOnTouchListenerC1648690t0N.LJFF(11);
            viewOnTouchListenerC1648690t0N.invalidate();
        } else if (i == 3 || i == 2) {
            viewOnTouchListenerC1648690t0N.LJFF(4);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfL00;
        C385670FAf<Integer> c385670FAfCx2;
        C385670FAf<Boolean> c385670FAfCP1;
        LiveEvent<Boolean> liveEventFU0;
        C385670FAf<Boolean> c385670FAfRS;
        LiveData<Boolean> liveDataJ41;
        LiveEvent<Unit> liveEventIq0;
        super.onCreate();
        getRecordAdapterApi().xw1(this);
        this.LLILLJJLI.add(this.LLILLL, m3(), "LighteningControlProgressScene");
        this.LLILZLL.LIZ(this, new AObjectS244S0100000_18(this, 21));
        this.LLIZ.LIZ(this, new AObjectS246S0100000_25(this, 477));
        getRecordAdapterApi().eX1().LIZ(this, new AObjectS246S0100000_25(this, 478));
        if (C1621950sJF.LIZ()) {
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (liveEventIq0 = stickerApiComponent.Iq0()) != null) {
                liveEventIq0.LIZ(this, new AObjectS244S0100000_18(this, 20));
            }
            iq().isRecording().LIZ(this, new AObjectS246S0100000_25(this, 481));
            q stickerApiComponent2 = getStickerApiComponent();
            if (stickerApiComponent2 != null && (liveDataJ41 = stickerApiComponent2.j41()) != null) {
                liveDataJ41.observe(this, new AObserverS227S0100000_25(this, 58));
            }
        }
        a planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (c385670FAfRS = planCUIApiComponent.RS()) != null) {
            c385670FAfRS.LIZ(this, new AObjectS246S0100000_25(this, 482));
        }
        a planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null && (liveEventFU0 = planCUIApiComponent2.FU0()) != null) {
            liveEventFU0.LIZ(this, new AObjectS246S0100000_25(this, 484));
        }
        iq().xk1().LJ(this, new AObjectS246S0100000_25(this, 486));
        iq().xM2().LIZ(this, new AObjectS246S0100000_25(this, 483));
        iq().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 485));
        iq().lC2().LIZ(this, new AObjectS246S0100000_25(this, 487));
        iq().Bp2().LIZ(this, new AObjectS246S0100000_25(this, 488));
        iq().Xs1().LIZ(this, new AObjectS246S0100000_25(this, 489));
        iq().EE1().LIZ(this, new AObjectS246S0100000_25(this, 490));
        iq().zx2().LIZ(this, new AObjectS246S0100000_25(this, 491));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 492));
        }
        iq().nZ().LIZ(this, new AObjectS246S0100000_25(this, 493));
        if (getShortVideoContext().LJJJJLL()) {
            long j = getShortVideoContext().cameraComponentModel.mMaxDuration;
            StitchParams stitchParams = getShortVideoContext().stitchContext.stitchParams;
            iq().ht1(new C531060KsC(j + (stitchParams != null ? Long.valueOf(stitchParams.getDuration()) : null).longValue()));
            long jLJII = getShortVideoContext().LJII();
            C1649650t1v c1649650t1vLIZJ = iq().xk1().LIZJ();
            Z4(jLJII, c1649650t1vLIZJ != null ? c1649650t1vLIZJ.LIZJ : null);
        } else {
            iq().ht1(new C531060KsC(getShortVideoContext().cameraComponentModel.mMaxDuration));
        }
        getCameraApiComponent().bu2().LIZ(this, new AObjectS246S0100000_25(this, 494));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 495));
        getCameraApiComponent().xF1().LIZ(this, new AObjectS246S0100000_25(this, 496));
        iq().Y91().LIZ(this, new AObjectS246S0100000_25(this, 497));
        iq().kT0().LIZ(this, new AObjectS246S0100000_25(this, 498));
        this.LLJJI.LIZ(this, new AObjectS244S0100000_18(this, 22));
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c385670FAfCx2 = interfaceC1638550sk1Gq.Cx2()) != null) {
            c385670FAfCx2.LIZ(this, new AObjectS244S0100000_18(this, 19));
        }
        iq().Ia0().LIZ(this, new AObjectS246S0100000_25(this, 470));
        iq().yM2().LIZ(this, new AObjectS246S0100000_25(this, 472));
        iq().lC2().LIZ(this, new AObjectS246S0100000_25(this, 474));
        if (getShortVideoContext().LJI().size() > 0 && getShortVideoContext().LJII() > 0) {
            C013C c013c = new C013C();
            InterfaceC1652190t61 recordPermissionApiComponent = getRecordPermissionApiComponent();
            if (recordPermissionApiComponent != null && (c385670FAfL00 = recordPermissionApiComponent.L00()) != null) {
                c385670FAfL00.LIZ(this, new AObjectS306S0200000_25((Object) this, (Object) c013c, (InterfaceC1648570t0B) 16));
            }
        }
        E3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().xw1(null);
        this.LLLI.dispose();
        Animator animator = this.LLLFF;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.InterfaceC1649820t2C
    public boolean EZ0() {
        return this.LLLIL;
    }

    public C560530Lyd<Unit> G2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1630630sXF
    public /* bridge */ /* synthetic */ C385670FAf HC() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1649820t2C
    public /* bridge */ /* synthetic */ C385670FAf JR0() {
        return this.LLIZ;
    }

    public h0<Boolean> W2() {
        return this.LLJJI;
    }

    public InterfaceC1630630sXF Z1() {
        return this.LLILZ;
    }

    public h0<Boolean> c3() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1649820t2C
    public /* bridge */ /* synthetic */ LiveEvent v32() {
        return this.LLILZIL;
    }

    private final void e4(boolean z) {
        f fVarM3 = m3();
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = fVarM3.LLLIIL;
        C21408218qG c21408218qG = null;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setCombineTakePhoto(z);
        C21408218qG c21408218qG2 = fVarM3.LLLFF;
        if (c21408218qG2 != null) {
            c21408218qG = c21408218qG2;
        }
        c21408218qG.setCombineTakePhoto(z);
    }

    public final void F4(boolean z) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setEnablePressRecording(z);
    }

    public final void FY0(int i) {
        if (this.LLLFZ && i == 0) {
            return;
        }
        f fVarM3 = m3();
        if (((IAigcStateHolder) fVarM3.LLLLL.getValue()).LIZIZ().LJI() == 0 || Intrinsics.LJFF(((IAigcStateHolder) fVarM3.LLLLL.getValue()).LIZIZ().LJI(), C0TBG.LIZ)) {
            View view = fVarM3.LLLIL;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC1630630sXF
    public void GK0(boolean z) {
        View view = m3().LLLFZ;
        if (view == null) {
            view = null;
        }
        C375780EoK.LIZIZ(view, z);
    }

    public final void H4(long j) {
        this.LLIZLLLIL.LJII(Long.valueOf(j));
    }

    @Override // X.InterfaceC1630630sXF
    public void JP1(InterfaceC576020MiW<Boolean, Boolean> interfaceC576020MiW) {
        if (this.LLLIIIIL.contains(interfaceC576020MiW)) {
            this.LLLIIIIL.remove(interfaceC576020MiW);
        }
    }

    public final void K4(boolean z) {
        this.LLJIJIL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1630630sXF
    public void LZ1(EnumC1648530t07 enumC1648530t07) {
        f fVarM3 = m3();
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = fVarM3.LLLIIL;
        C21408218qG c21408218qG = null;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setPhotoIdleStyle(enumC1648530t07);
        int iIntValue = 0;
        if (C1648520t06.LIZ[enumC1648530t07.ordinal()] == 1) {
            if (C1608660rxo.LIZ) {
                ColorConfig colorConfig = C1618440sDa.LIZIZ.LJJIJLIJ().LIZ().LIZJ;
                if (colorConfig.isShader) {
                    C21408218qG c21408218qG2 = fVarM3.LLLFF;
                    if (c21408218qG2 == null) {
                        c21408218qG2 = null;
                    }
                    C694200RKw c694200RKwLIZ = C694210RKx.LIZ(colorConfig, c21408218qG2.getContext());
                    if (c694200RKwLIZ != null) {
                        C21408218qG c21408218qG3 = fVarM3.LLLFF;
                        if (c21408218qG3 == null) {
                            c21408218qG3 = null;
                        }
                        int[] iArr = c694200RKwLIZ.LIZ;
                        float[] fArr = c694200RKwLIZ.LIZIZ;
                        c21408218qG3.LLLIIII = iArr;
                        c21408218qG3.LLLIIIIL = fArr;
                        Paint paint = c21408218qG3.LLILZIL;
                        if (paint != null) {
                            paint.setShader(new LinearGradient(0.0f, 0.0f, c21408218qG3.getWidth(), c21408218qG3.getHeight(), iArr, fArr, Shader.TileMode.CLAMP));
                        }
                    }
                } else {
                    Integer num = colorConfig.singleColor;
                    if (num != null) {
                        C21408218qG c21408218qG4 = fVarM3.LLLFF;
                        if (c21408218qG4 == null) {
                            c21408218qG4 = null;
                        }
                        int iIntValue2 = Integer.valueOf(C694210RKx.LIZIZ(c21408218qG4.getContext(), num)).intValue();
                        C21408218qG c21408218qG5 = fVarM3.LLLFF;
                        if (c21408218qG5 == null) {
                            c21408218qG5 = null;
                        }
                        c21408218qG5.setProgressColor(iIntValue2);
                    }
                }
            } else {
                C21408218qG c21408218qG6 = fVarM3.LLLFF;
                if (c21408218qG6 == null) {
                    c21408218qG6 = null;
                }
                Paint paint2 = c21408218qG6.LLILZIL;
                if (paint2 != null) {
                    paint2.setShader(null);
                }
                C21408218qG c21408218qG7 = fVarM3.LLLFF;
                if (c21408218qG7 == null) {
                    c21408218qG7 = null;
                }
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a09, fVarM3.requireSceneContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                c21408218qG7.setProgressColor(iIntValue);
            }
        } else {
            C21408218qG c21408218qG8 = fVarM3.LLLFF;
            if (c21408218qG8 == null) {
                c21408218qG8 = null;
            }
            Paint paint3 = c21408218qG8.LLILZIL;
            if (paint3 != null) {
                paint3.setShader(null);
            }
            C21408218qG c21408218qG9 = fVarM3.LLLFF;
            if (c21408218qG9 == null) {
                c21408218qG9 = null;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, fVarM3.requireSceneContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            c21408218qG9.setProgressColor(iIntValue);
        }
        C21408218qG c21408218qG10 = fVarM3.LLLFF;
        if (c21408218qG10 != null) {
            c21408218qG = c21408218qG10;
        }
        c21408218qG.LLILZ.setStrokeCap(Paint.Cap.ROUND);
        c21408218qG.LLILZIL.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // X.InterfaceC1649820t2C
    public void Qb(RetakeVideoContext retakeVideoContext) {
        this.LLJJIJIL.LJII(retakeVideoContext);
    }

    @Override // X.InterfaceC1649820t2C
    public void Rk(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        this.LLJJJ.LJII(pair);
    }

    public final void T4(boolean z) {
        Class<Object> cls;
        e4(false);
        LZ1(EnumC1648530t07.DEFAULT);
        e0 e0VarIq = iq();
        if (!z && !C539900LFk.LIZ(getShortVideoContext())) {
            cls = C579080MnS.class;
        } else {
            cls = C0LF1.class;
        }
        e0VarIq.va0(cls);
    }

    @Override // X.InterfaceC1649820t2C
    public void U22(MotionEvent motionEvent) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1649820t2C
    public void V2(boolean z) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setEnabled(z);
    }

    public final void W1(boolean z) {
        InterfaceC1638550sk1 interfaceC1638550sk1T2;
        InterfaceC1638550sk1 interfaceC1638550sk1T22;
        if (z) {
            InterfaceC1638550sk1 interfaceC1638550sk1T23 = T2();
            if (interfaceC1638550sk1T23 != null && interfaceC1638550sk1T23.hy() && (interfaceC1638550sk1T22 = T2()) != null) {
                interfaceC1638550sk1T22.U7(-C366700EZg.LIZ(42.0d));
                return;
            }
            return;
        }
        InterfaceC1638550sk1 interfaceC1638550sk1T24 = T2();
        if (interfaceC1638550sk1T24 == null || !interfaceC1638550sk1T24.hy() || (interfaceC1638550sk1T2 = T2()) == null) {
            return;
        }
        interfaceC1638550sk1T2.U7(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    @Override // X.InterfaceC1649820t2C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W9(boolean r6) {
        /*
            r5 = this;
            X.0sY9 r0 = r5.H2()
            boolean r0 = X.C1631200sYA.LIZ(r0)
            r2 = 0
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L70
            r0 = 4
            java.lang.String[] r3 = new java.lang.String[r0]
            X.0syZ r0 = X.EnumC1647570syZ.LIVE
            java.lang.String r0 = r0.getTag()
            r3[r1] = r0
            X.0syZ r0 = X.EnumC1647570syZ.AI_SELF
            java.lang.String r0 = r0.getTag()
            r3[r4] = r0
            X.0syZ r0 = X.EnumC1647570syZ.TEMPLATES
            java.lang.String r1 = r0.getTag()
            r0 = 2
            r3[r0] = r1
            X.0syZ r0 = X.EnumC1647570syZ.EDITOR_TAB
            java.lang.String r1 = r0.getTag()
            r0 = 3
            r3[r0] = r1
            X.0szI r0 = r5.Op()
            if (r0 == 0) goto L40
            X.0t7r r0 = r0.getCurrentBottomTabItemBeforeOnTabChanged()
            if (r0 == 0) goto L40
            java.lang.String r2 = r0.LIZIZ
        L40:
            int r0 = X.C13LQ.LJJIJIIJI(r2, r3)
            if (r0 < 0) goto L6e
            r0 = 1
        L47:
            if (r6 == 0) goto L8d
            if (r0 != 0) goto L8d
        L4b:
            java.util.List<X.0MiW<java.lang.Boolean, java.lang.Boolean>> r0 = r5.LLLIIIIL
            java.util.Iterator r2 = r0.iterator()
        L51:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()
            X.0MiW r1 = (X.InterfaceC576020MiW) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r0 = r1.LIZ(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            return
        L6e:
            r0 = 0
            goto L47
        L70:
            X.0szI r0 = r5.Op()
            if (r0 == 0) goto L7e
            X.0t7r r0 = r0.getCurrentBottomTabItemBeforeOnTabChanged()
            if (r0 == 0) goto L7e
            java.lang.String r2 = r0.LIZIZ
        L7e:
            X.0syZ r0 = X.EnumC1647570syZ.LIVE
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r6 == 0) goto L8d
            if (r0 != 0) goto L8d
            goto L4b
        L8d:
            r4 = 0
            goto L4b
        L8f:
            com.bytedance.als.h0<java.lang.Boolean> r1 = r5.LLIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.LJII(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.progress.c.W9(boolean):void");
    }

    @Override // X.InterfaceC1630630sXF
    public void Y60(boolean z) {
        this.LLLF = z;
        m3().LLLILZLLLI(z);
    }

    @Override // X.InterfaceC1649820t2C
    public void YY1(boolean z) {
        InterfaceC1648050szL interfaceC1648050szL;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.LJIIJ();
        if (z) {
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = m3().LLLIIL;
            if (viewOnTouchListenerC1648690t0N2 == null) {
                viewOnTouchListenerC1648690t0N2 = null;
            }
            viewOnTouchListenerC1648690t0N2.LJIIL();
        }
        if (C300060BpU.LIZ() && (interfaceC1648050szL = (InterfaceC1648050szL) getDiContainer().LJIIL(null, InterfaceC1648050szL.class)) != null) {
            interfaceC1648050szL.Mc0();
        }
    }

    @Override // X.InterfaceC1630630sXF
    public void a60(InterfaceC576020MiW<Boolean, Boolean> interfaceC576020MiW) {
        if (!this.LLLIIIIL.contains(interfaceC576020MiW)) {
            this.LLLIIIIL.add(interfaceC576020MiW);
        }
    }

    @Override // X.InterfaceC1630630sXF
    public void aD(int i) {
        f fVarM3 = m3();
        ViewGroup viewGroup = fVarM3.LLLIIIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(i, viewGroup);
        View view = fVarM3.LLLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void d5(C1649650t1v c1649650t1v) {
        if (c1649650t1v.LIZJ != null) {
            if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
                qd(new C443120HZe<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ), c1649650t1v.LIZJ));
                return;
            } else {
                zc(new C443120HZe<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ), c1649650t1v.LIZJ));
                return;
            }
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            Rk(new Pair<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ)));
        } else {
            vr(new Pair<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ)));
        }
    }

    @Override // X.InterfaceC1649820t2C
    public void dd(boolean z) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.LLLLLL = z;
    }

    @Override // X.InterfaceC1630630sXF
    public void dd1(boolean z) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setDisableExpandAnimation(z);
    }

    public final void eg2(boolean z) {
        this.LLLIL = z;
        View view = m3().LLLIL;
        if (view == null) {
            view = null;
        }
        view.setSelected(z);
    }

    @Override // X.InterfaceC1630630sXF
    public void lZ0(Function1<? super ViewOnTouchListenerC1648690t0N, Unit> function1) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        function1.invoke(viewOnTouchListenerC1648690t0N);
    }

    @Override // X.InterfaceC1630630sXF
    public void nL1(InterfaceC1648550t09 interfaceC1648550t09) {
        InterfaceC1648550t09 interfaceC1648550t092;
        boolean zLIZIZ;
        f fVarM3 = m3();
        if (interfaceC1648550t09 == null) {
            interfaceC1648550t092 = fVarM3.LLLIIII;
        } else {
            interfaceC1648550t092 = interfaceC1648550t09;
        }
        fVarM3.LLLII = interfaceC1648550t092;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = fVarM3.LLLIIL;
        InterfaceC1648710t0P interfaceC1648710t0PLIZ = null;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        if (interfaceC1648550t092 != null) {
            interfaceC1648710t0PLIZ = interfaceC1648550t092.LIZ();
        }
        viewOnTouchListenerC1648690t0N.setRecordListener(interfaceC1648710t0PLIZ);
        if (interfaceC1648550t09 != null) {
            zLIZIZ = interfaceC1648550t09.LIZIZ();
        } else {
            zLIZIZ = false;
        }
        this.LLLFFI = zLIZIZ;
    }

    @Override // X.InterfaceC1649820t2C
    public void qd(C443120HZe<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> c443120HZe) {
        this.LLJJJIL.LJII(c443120HZe);
    }

    @Override // X.InterfaceC1649820t2C
    public void so(int i) {
        this.LLJJIJIIJIL.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1649820t2C
    public void tv(int i) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.LJIIIZ(i);
    }

    @Override // X.InterfaceC1649820t2C
    public void vr(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        this.LLJILJIL.LJII(pair);
    }

    public final void y31(int i) {
        if (this.LLLFZ && i == 0) {
            return;
        }
        View view = m3().LLLIILIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void z4(int i) {
        y31(i);
        FY0(i);
        if (i == 0) {
            o4();
        }
    }

    @Override // X.InterfaceC1649820t2C
    public void zc(C443120HZe<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> c443120HZe) {
        this.LLJILJILJ.LJII(c443120HZe);
    }

    @Override // X.InterfaceC1630630sXF
    public void zn1(Function1<? super MotionEvent, Boolean> function1) {
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setExternalTouchEventHandler(function1);
    }

    @Override // X.InterfaceC1649820t2C
    public void Hn(int i, boolean z) {
        boolean z2;
        f fVarM3 = m3();
        if (fVarM3.LLJILJILJ.LJJJJZ() && !fVarM3.LLJILJILJ.LJJIJIIJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ = C539900LFk.LIZ(fVarM3.LLJILJILJ);
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = fVarM3.LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.LJIILJJIL(i, z, z2, zLIZ);
    }

    public final void Z4(long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        int duration = 0;
        if (getShortVideoContext().LJJJJLL() && (timeSpeedModelExtension != null || (timeSpeedModelExtension = getShortVideoContext().stitchContext.stitchClip) != null)) {
            duration = timeSpeedModelExtension.getDuration();
        }
        this.LLJJ.LJII(Long.valueOf(j + ((long) duration)));
    }

    @Override // X.InterfaceC1649820t2C
    public void hF2(boolean z, boolean z2) {
        if (z2) {
            vr(new Pair<>(C13BV.INSTANCE, 0L));
        }
        this.LLILZLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1649820t2C
    public void tq2(boolean z, boolean z2) {
        View view;
        View view2;
        boolean z3 = !z;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = m3().LLLIIL;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = null;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.setShouldDrawInnerCircleInIdle(z3);
        f fVarM3 = m3();
        if (z) {
            ViewGroup viewGroup = fVarM3.LLLIIIL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            Object parent = viewGroup.getParent();
            if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
                view2.setElevation(-2.0f);
            }
            if (((Boolean) fVarM3.LLLLJI.getValue()).booleanValue()) {
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N3 = fVarM3.LLLIIL;
                if (viewOnTouchListenerC1648690t0N3 == null) {
                    viewOnTouchListenerC1648690t0N3 = null;
                }
                ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC1648690t0N3.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N4 = fVarM3.LLLIIL;
                if (viewOnTouchListenerC1648690t0N4 == null) {
                    viewOnTouchListenerC1648690t0N4 = null;
                }
                C786410Ut5.n7(viewOnTouchListenerC1648690t0N4, layoutParams);
            }
        } else {
            ViewGroup viewGroup2 = fVarM3.LLLIIIL;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            Object parent2 = viewGroup2.getParent();
            if ((parent2 instanceof ViewGroup) && (view = (View) parent2) != null) {
                view.setElevation(0.0f);
            }
            if (((Boolean) fVarM3.LLLLJI.getValue()).booleanValue()) {
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N5 = fVarM3.LLLIIL;
                if (viewOnTouchListenerC1648690t0N5 == null) {
                    viewOnTouchListenerC1648690t0N5 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = viewOnTouchListenerC1648690t0N5.getLayoutParams();
                layoutParams2.width = fVarM3.LLLLJ;
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N6 = fVarM3.LLLIIL;
                if (viewOnTouchListenerC1648690t0N6 == null) {
                    viewOnTouchListenerC1648690t0N6 = null;
                }
                C786410Ut5.n7(viewOnTouchListenerC1648690t0N6, layoutParams2);
            }
        }
        if (z2) {
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N7 = m3().LLLIIL;
            if (viewOnTouchListenerC1648690t0N7 != null) {
                viewOnTouchListenerC1648690t0N2 = viewOnTouchListenerC1648690t0N7;
            }
            viewOnTouchListenerC1648690t0N2.setShouldDrawRing(z3);
        }
    }

    public c(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        Boolean bool = Boolean.TRUE;
        this.LLILZLL = new h0<>(bool);
        this.LLIZ = new h0<>(bool);
        this.LLIZLLLIL = new h0<>(0L);
        this.LLJ = new h0<>(0L);
        this.LLJI = new h0<>(bool);
        this.LLJIJIL = new h0<>(bool);
        this.LLJILJIL = new h0<>(null);
        this.LLJILJILJ = new h0<>(null);
        this.LLJILLL = new h0<>(null);
        this.LLJJ = new h0<>(0L);
        Boolean bool2 = Boolean.FALSE;
        this.LLJJI = new h0<>(bool2);
        this.LLJJIII = new h0<>(bool2);
        this.LLJJIJI = new C538770LBb<>(0);
        this.LLJJIJIIJIL = new h0<>(-1);
        this.LLJJIJIL = new h0<>(null);
        this.LLJJJ = new h0<>(null);
        this.LLJJJIL = new h0<>(null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
        this.LLJJJJLIIL = (InterfaceC1648510t05) getDiContainer().LJIIL(null, InterfaceC1648510t05.class);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1624950sO5.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648590t0D.class, null);
        this.LLLI = new C11NJ();
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), MutableLiveData.class, "reset_record_segments_action");
        this.LLLIIIIL = new ArrayList();
        this.LLLIIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 587));
        this.LLLIILIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(292));
        this.LLLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 586));
    }

    @Override // X.InterfaceC1649820t2C
    public void ZG(MotionEvent motionEvent, float f, float f2) {
        f fVarM3 = m3();
        if (motionEvent == null) {
            fVarM3.getClass();
            return;
        }
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = fVarM3.LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            return;
        }
        viewOnTouchListenerC1648690t0N.getClass();
        viewOnTouchListenerC1648690t0N.LLIZ = f2;
        viewOnTouchListenerC1648690t0N.onTouchEvent(motionEvent);
    }

    public final f X1(InterfaceC1650230t2r interfaceC1650230t2r, InterfaceC1648570t0B interfaceC1648570t0B, InterfaceC1647420syK interfaceC1647420syK, ShortVideoContext shortVideoContext, C385670FAf<Long> c385670FAf, C385670FAf<Long> c385670FAf2, C385670FAf<Boolean> c385670FAf3, C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> c385670FAf4, C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf5, C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf6, C385670FAf<Integer> c385670FAf7, C385670FAf<RetakeVideoContext> c385670FAf8, C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> c385670FAf9, C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf10, C385670FAf<Boolean> c385670FAf11, C385670FAf<Boolean> c385670FAf12, C385670FAf<Boolean> c385670FAf13, C385670FAf<ScaleGestureDetector> c385670FAf14, C385670FAf<InterfaceC21645719nT> c385670FAf15, C385670FAf<Long> c385670FAf16, h0<Boolean> h0Var, C538770LBb<Integer> c538770LBb, q qVar, InterfaceC1648590t0D interfaceC1648590t0D) {
        return new f(interfaceC1650230t2r, interfaceC1648570t0B, interfaceC1647420syK, shortVideoContext, c385670FAf, c385670FAf2, c385670FAf3, c385670FAf4, c385670FAf5, c385670FAf6, c385670FAf7, c385670FAf8, c385670FAf9, c385670FAf10, c385670FAf11, c385670FAf12, c385670FAf13, c385670FAf14, c385670FAf15, c385670FAf16, h0Var, c538770LBb, getPlanCUIApiComponent(), this.LLILZIL, qVar, interfaceC1648590t0D, getDiContainer());
    }
}
