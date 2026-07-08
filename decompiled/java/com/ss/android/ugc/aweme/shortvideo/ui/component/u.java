package com.ss.android.ugc.aweme.shortvideo.ui.component;

import X.AbstractC1448380nnI;
import X.AbstractC1627380sS0;
import X.AbstractC1652010t5j;
import X.AbstractC214814194y;
import X.AbstractC2255721DQs;
import X.C013C;
import X.C01GW;
import X.C05YF;
import X.C09HN;
import X.C0C64;
import X.C0CHQ;
import X.C0CNO;
import X.C0FNV;
import X.C0LAB;
import X.C0LDJ;
import X.C0VSJ;
import X.C11NJ;
import X.C11NZ;
import X.C123100dR;
import X.C1281904zx;
import X.C13LE;
import X.C13LP;
import X.C1409940mnI;
import X.C1413430msv;
import X.C1446840nko;
import X.C1448220nn2;
import X.C1448240nn4;
import X.C1448290nn9;
import X.C1448310nnB;
import X.C1448320nnC;
import X.C1448330nnD;
import X.C1448350nnF;
import X.C1448420nnM;
import X.C1448480nnS;
import X.C1448710nnp;
import X.C1448820no0;
import X.C1449000noI;
import X.C1449230nof;
import X.C1449260noi;
import X.C15O7;
import X.C1622090sJT;
import X.C1624200sMs;
import X.C1624570sNT;
import X.C1625940sPg;
import X.C1627370sRz;
import X.C1644050sst;
import X.C1645380sv2;
import X.C1645440sv8;
import X.C1647580sya;
import X.C1648160szW;
import X.C1663400tO6;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C1894607bU;
import X.C1905107dB;
import X.C19475711Hn;
import X.C19EG;
import X.C1D75;
import X.C1DIK;
import X.C1DRG;
import X.C1DS1;
import X.C1ER1;
import X.C201955140j;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21142717oX;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2341909Fp;
import X.C272900Amm;
import X.C272910Amn;
import X.C294160Bfy;
import X.C303380Buq;
import X.C306620C0e;
import X.C385670FAf;
import X.C452501pT;
import X.C524780Ki4;
import X.C533930Kwp;
import X.C537670L6v;
import X.C539900LFk;
import X.C543670LTx;
import X.C741040T5a;
import X.C786410Ut5;
import X.C804290Vgp;
import X.C804330Vgt;
import X.C823050WQl;
import X.C858980Xmq;
import X.C858990Xmr;
import X.C860560XpO;
import X.C991780buq;
import X.CountDownTimerC1448250nn5;
import X.DialogC1390150mHN;
import X.EnumC1448830no1;
import X.EnumC1641380soa;
import X.EnumC804170Vgd;
import X.EnumC805430Vif;
import X.InterfaceC1448230nn3;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625220sOW;
import X.InterfaceC1625470sOv;
import X.InterfaceC1627350sRx;
import X.InterfaceC1627740sSa;
import X.InterfaceC1628590sTx;
import X.InterfaceC1631630sYr;
import X.InterfaceC1637880siw;
import X.InterfaceC1644770su3;
import X.InterfaceC1647420syK;
import X.InterfaceC1647520syU;
import X.InterfaceC1648020szI;
import X.InterfaceC1648570t0B;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2254081DKk;
import X.InterfaceC2342209Fs;
import X.InterfaceC379610EuV;
import X.InterfaceC579060MnQ;
import Y.ACallableS21S1000000_3;
import Y.ACallableS23S1000000_8;
import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import Y.AObjectS25S0310000_22;
import Y.AObjectS305S0200000_22;
import Y.ARunnableS0S2000000_3;
import Y.AfS191S0100000_22;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.audio.IAudioGlitchService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audioservice.service.audioglitch.AudioGlitchService;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectTemplateEffect;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS150S0400000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ln3.a;
import lnn.q;
import mn3.e0;

/* JADX INFO: loaded from: classes23.dex */
public final class u extends AbstractC2255721DQs<InterfaceC579060MnQ> implements InterfaceC579060MnQ, InterfaceC379610EuV {
    public static final C1448310nnB LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public static final C01GW<Boolean> LLJLLIL;
    public final C1DRG LL;
    public C1448240nn4 LLJJ;
    public C1448350nnF LLJJIII;
    public C1448350nnF LLJJIJI;
    public long LLJJIJIIJIL;
    public IAudioGlitchService LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final InterfaceC579060MnQ LLILLJJLI = this;
    public final C19EG LLILLL = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final ShortVideoContext LLILZIL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), lnn.q.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1625220sOW.class, null);
    public final C11NJ LLJILJILJ = new C11NJ();
    public final Function1<Float, Unit> LLJILLL = new AwS601S0100000_22(this, 217);
    public final ConcurrentHashMap<String, C1448240nn4> LLJJI = new ConcurrentHashMap<>();
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 344));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 343));
    public final CountDownTimerC1448250nn5 LLJJL = new CountDownTimer() { // from class: X.0nn5
        public float LIZ;

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            DialogC1390150mHN dialogC1390150mHNE3 = this.LIZIZ.E3();
            if (dialogC1390150mHNE3 != null) {
                dialogC1390150mHNE3.LJJLL(99.0f, false);
            }
        }

        {
            super(3000L, 100L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            float fLJIIJ = this.LIZ + C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, 8));
            this.LIZ = fLJIIJ;
            if (fLJIIJ > 100.0f) {
                this.LIZ = 99.0f;
            }
            DialogC1390150mHN dialogC1390150mHNE3 = this.LIZIZ.E3();
            if (dialogC1390150mHNE3 != null) {
                dialogC1390150mHNE3.LJJLL(this.LIZ, false);
            }
        }
    };
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1969));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(162));

    private final boolean d5() {
        return C1697810uHb.LJIIJJI(10, 11, 14, 18).contains(Integer.valueOf(this.LLILZIL.shootMode));
    }

    private final float q3(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0.0f;
        }
        float f = LSPassThroughRecordSizeConfig.DEFAULT;
        return ((j * 8) / f) / (j2 / f);
    }

    public final boolean Z4(int i) {
        return i == 71;
    }

    public final String s7(String str) {
        return str == null ? "-1" : str;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(u.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(u.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(u.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(u.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C2217381BqS(u.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new C2217381BqS(u.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(u.class, "lazyBeautyFilter", "getLazyBeautyFilter()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0), new C2217381BqS(u.class, "stickerMobHelper", "getStickerMobHelper()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0)};
        LLJLIL = new C1448310nnB();
        LLJLL = 8;
        LLJLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1968));
    }

    private final void C5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("prop_type_name", "beauty_filter");
        c0lab.LJ("shoot_way", this.LLILZIL.shootWay);
        c0lab.LJ("creation_id", this.LLILZIL.getCreationId());
        C1448710nnp c1448710nnp = new C1448710nnp(getDiContainer(), getCameraApiComponent(), new C01GW<a>() { // from class: X.0nn7
            @Override // X.C01GW
            public final boolean isInitialized() {
                return true;
            }

            @Override // X.C01GW
            public final a getValue() {
                C385670FAf<a> c385670FAfEx;
                InterfaceC1647420syK interfaceC1647420syK = (InterfaceC1647420syK) this.LL.getDiContainer().LJIIL(null, InterfaceC1647420syK.class);
                if (interfaceC1647420syK == null || (c385670FAfEx = interfaceC1647420syK.ex()) == null) {
                    return null;
                }
                return c385670FAfEx.LIZJ();
            }
        });
        C1448350nnF c1448350nnF = this.LLJJIJI;
        if (c1448350nnF != null) {
            c0lab.LIZIZ(System.currentTimeMillis() - c1448350nnF.LIZ, "duration");
        }
        C23250099c.LIZLLL(c1448710nnp.LLJIJIL, null, null, new C858980Xmq(c1448710nnp, c0lab, new AwS566S0100000_22(c0lab, 345), null), 3);
    }

    private final void E5() {
        C385670FAf<FilterBean> c385670FAfI70;
        if (((Boolean) C272900Amm.LIZ.getValue()).booleanValue()) {
            AObjectS305S0200000_22 aObjectS305S0200000_22 = new AObjectS305S0200000_22(new C013C(), this, 6);
            if (C1622090sJT.LIZ(B3())) {
                whenReady(this, InterfaceC1644770su3.class, new AwS388S0200000_22(this, aObjectS305S0200000_22, 40));
                return;
            }
            InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
            if (filterApiComponent == null || (c385670FAfI70 = filterApiComponent.i70()) == null) {
                return;
            }
            c385670FAfI70.LIZ(this, aObjectS305S0200000_22);
        }
    }

    private final String F4() {
        int i = this.LLILZIL.shootMode;
        if (i == 0) {
            return "click";
        }
        if (i == 1) {
            return "press";
        }
        if (i == 8) {
            return "video";
        }
        if (i == 10) {
            return "video_15";
        }
        if (i == 11) {
            return "video_60";
        }
        switch (i) {
            case 14:
                return "video_180";
            case 15:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "video";
            case 16:
                return "photo";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "video_600";
            default:
                return "";
        }
    }

    private final InterfaceC1625220sOW H4() {
        return (InterfaceC1625220sOW) this.LLJILJIL.getValue(this, LLJLILLLLZIIL[7]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZ.getValue(this, LLJLILLLLZIIL[2]);
    }

    private final boolean n5() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    public final C1645380sv2 B3() {
        return (C1645380sv2) this.LLJIJIL.getValue(this, LLJLILLLLZIIL[6]);
    }

    public final DialogC1390150mHN E3() {
        return (DialogC1390150mHN) this.LLJJJJLIIL.getValue();
    }

    public final a H2() {
        return (a) this.LLJ.getValue(this, LLJLILLLLZIIL[4]);
    }

    public final void N6() {
        ArrayList arrayList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LLILZIL.getCreationId());
        c0lab.LJ("shoot_way", this.LLILZIL.shootWay);
        c0lab.LJ("content_type", "video");
        if (C539900LFk.LJI(this.LLILZIL)) {
            ShortVideoContext shortVideoContext = this.LLILZIL;
            CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel == null || (arrayList = cameraLayoutModel.captureSegments) == null) {
                arrayList = shortVideoContext.cameraComponentModel.mDurings;
            }
        } else {
            arrayList = this.LLILZIL.cameraComponentModel.mDurings;
        }
        c0lab.LJ("prop_list", RecordScene.getStickerIdsByModel(arrayList));
        c0lab.LJ("filter_id_list", this.LLILZIL.cameraComponentModel.recordContext.filterIds.toString());
        c0lab.LIZ(getCameraApiComponent().St2().getFPS(), "fps");
        c0lab.LJFF("reshoot", this.LLILZIL.cameraComponentModel.isRetakeMode);
        c0lab.LIZLLL(c3(), "beautify_used");
        if (C294160Bfy.LIZ()) {
            c0lab.LJ("beautify_info", C1409940mnI.LIZ);
        }
        C20684815ws.LJIILLIIL("video_record_end", c0lab.LIZ);
    }

    public final boolean Q3() {
        return ((Boolean) this.LLJJJJJIL.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6() {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.S6():void");
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLILZLL.getValue(this, LLJLILLLLZIIL[1]);
    }

    public final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[3]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZ.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final lnn.q getStickerApiComponent() {
        return (lnn.q) this.LLJI.getValue(this, LLJLILLLLZIIL[5]);
    }

    public final boolean k5() {
        return ((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k7() {
        InterfaceC1644770su3 filterApiComponent;
        C385670FAf<FilterBean> c385670FAfI70;
        String id;
        String recId;
        String resourceID;
        String musicId;
        String id2;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJ;
        C1449000noI c1449000noI;
        InterfaceC1644770su3 interfaceC1644770su3LIZJ;
        String string;
        C385670FAf<FilterBean> c385670FAfI702;
        FilterBean filterBeanLIZJ;
        C385670FAf<FilterBean> c385670FAfI703;
        FilterBean filterBeanLIZJ2;
        C1D75.LIZ.LIZ.put("record_recording", new C1448330nnD<>("record_recording", Boolean.FALSE));
        String strLJJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIJ(this.LLILZIL.creativeInfo, "", true);
        String creationId = this.LLILZIL.getCreationId();
        if (strLJJIIJ != null && strLJJIIJ.length() != 0) {
            C741040T5a.LIZ.execute(new ARunnableS0S2000000_3(strLJJIIJ, creationId, 0));
        }
        InterfaceC2254081DKk interfaceC2254081DKkSt2 = getCameraApiComponent().St2();
        long endFrameTimeUS = interfaceC2254081DKkSt2.getEndFrameTimeUS();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = endFrameTimeUS / j;
        lnn.q stickerApiComponent = getStickerApiComponent();
        FaceStickerBean faceStickerBeanJr = stickerApiComponent != null ? stickerApiComponent.jr() : null;
        Integer numC3 = c3();
        if (C1448320nnC.LIZ != null && C1448320nnC.LIZIZ != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", this.LLILZIL.LJ().getCreationId());
            c0lab.LJ("content_type", this.LLILZIL.LJ().getContentType());
            c0lab.LJ("content_source", this.LLILZIL.LJ().getContentSource());
            c0lab.LIZ(this.LLILZIL.shootMode, "record_mode");
            c0lab.LIZ(C1448320nnC.LIZ.intValue(), "record_block_tms");
            c0lab.LIZ(C1448320nnC.LIZIZ.intValue(), "record_block_duration");
            c0lab.LIZIZ(interfaceC2254081DKkSt2.getEndFrameTimeUS() / j, "record_duration");
            c0lab.LIZ(1, "is_composer");
            c0lab.LIZLLL(numC3, "beautify_used");
            if (C294160Bfy.LIZ()) {
                c0lab.LJ("beautify_info", C1409940mnI.LJ(K4()));
            }
            if (faceStickerBeanJr == null || (string = Long.valueOf(faceStickerBeanJr.getStickerId()).toString()) == null) {
                string = "";
            }
            c0lab.LJ("prop_id", string);
            if (C1622090sJT.LIZ(B3())) {
                a aVarLIZJ = getRecordAdapterApi().ex().LIZJ();
                c0lab.LIZLLL(aVarLIZJ != null ? Integer.valueOf(aVarLIZJ.C9()) : null, "eyes");
                c0lab.LIZLLL(aVarLIZJ != null ? Integer.valueOf(aVarLIZJ.Kl()) : null, "smooth");
                InterfaceC1644770su3 interfaceC1644770su3LIZJ2 = getRecordAdapterApi().tn2().LIZJ();
                c0lab.LJ("filter_id", s7((interfaceC1644770su3LIZJ2 == null || (c385670FAfI703 = interfaceC1644770su3LIZJ2.i70()) == null || (filterBeanLIZJ2 = c385670FAfI703.LIZJ()) == null) ? null : filterBeanLIZJ2.getId()));
            } else {
                a aVarH2 = H2();
                c0lab.LIZLLL(aVarH2 != null ? Integer.valueOf(aVarH2.C9()) : null, "eyes");
                a aVarH22 = H2();
                c0lab.LIZLLL(aVarH22 != null ? Integer.valueOf(aVarH22.Kl()) : null, "smooth");
                InterfaceC1644770su3 filterApiComponent2 = getFilterApiComponent();
                c0lab.LJ("filter_id", s7((filterApiComponent2 == null || (c385670FAfI702 = filterApiComponent2.i70()) == null || (filterBeanLIZJ = c385670FAfI702.LIZJ()) == null) ? null : filterBeanLIZJ.getId()));
            }
            C20684815ws.LJIILLIIL("video_record_block", c0lab.LIZ);
            C1448320nnC.LIZ = null;
            C1448320nnC.LIZIZ = null;
        }
        String[] strArrO5 = interfaceC2254081DKkSt2.getMediaController().o5();
        Object objValueOf = (strArrO5 == null || strArrO5.length == 0) ? "" : Float.valueOf(q3(v3(strArrO5[strArrO5.length - 1]), j2));
        FilterBean filterBeanLIZJ3 = (!C1622090sJT.LIZ(B3()) ? !((filterApiComponent = getFilterApiComponent()) == null || (c385670FAfI70 = filterApiComponent.i70()) == null) : !((interfaceC1644770su3LIZJ = getRecordAdapterApi().tn2().LIZJ()) == null || (c385670FAfI70 = interfaceC1644770su3LIZJ.i70()) == null)) ? null : c385670FAfI70.LIZJ();
        float fK5 = interfaceC2254081DKkSt2.getMediaController().K5();
        float fP5 = interfaceC2254081DKkSt2.getMediaController().P5();
        float fL4 = interfaceC2254081DKkSt2.getMediaController().L4();
        float f = fL4 - fK5;
        float fU5 = interfaceC2254081DKkSt2.getMediaController().u5(true);
        float fH5 = interfaceC2254081DKkSt2.getMediaController().H5(true, false);
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_add_device_status_to_preview_record_event_tracking", true, false);
        C0LDJ c0ldj = C0LDJ.LIZ;
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LIZIZ(this.LLILZIL.cameraComponentModel.LIZJ(), "source_duration");
        c0lab2.LJ("creation_id", this.LLILZIL.getCreationId());
        c0lab2.LJ("shoot_way", this.LLILZIL.shootWay);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL.cameraComponentModel.mVideoWidth);
        sbLIZ.append('*');
        sbLIZ.append(this.LLILZIL.cameraComponentModel.mVideoHeight);
        c0lab2.LJ("resolution", C2188811AlT.LIZIZ(sbLIZ));
        if (faceStickerBeanJr == null || (id = faceStickerBeanJr.getId()) == null) {
            id = "";
        }
        c0lab2.LJ("effect_id", id);
        if (faceStickerBeanJr == null || (recId = faceStickerBeanJr.getRecId()) == null) {
            recId = "";
        }
        c0lab2.LJ("effect_rec_id", recId);
        c0lab2.LIZLLL(faceStickerBeanJr != null ? Long.valueOf(faceStickerBeanJr.getStickerId()) : "", "effect_sticker_id");
        c0lab2.LJ("filter_id", filterBeanLIZJ3 == null ? "" : s7(filterBeanLIZJ3.getId()));
        c0lab2.LIZ(interfaceC2254081DKkSt2.getMediaController().Z4(), "lag_count");
        c0lab2.LIZ(interfaceC2254081DKkSt2.getMediaController().i5(), "lag_max");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(fK5);
        sbLIZ2.append("");
        c0lab2.LJ("fps", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(fL4);
        sbLIZ3.append("");
        c0lab2.LJ("camera_fps", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(f);
        sbLIZ4.append("");
        c0lab2.LJ("drop_fps", C2188811AlT.LIZIZ(sbLIZ4));
        c0lab2.LIZJ(Float.valueOf(fU5), "average_camera_fps");
        c0lab2.LIZJ(Float.valueOf(interfaceC2254081DKkSt2.getMediaController().J4(true)), "average_exposure_time");
        c0lab2.LIZJ(Float.valueOf(interfaceC2254081DKkSt2.getMediaController().M4(true)), "average_iso");
        c0lab2.LIZJ(Float.valueOf(fH5), "average_render_fps");
        c0lab2.LIZ(interfaceC2254081DKkSt2.getMediaController().j5(), "serious_lag_count");
        c0lab2.LIZ(interfaceC2254081DKkSt2.getMediaController().e5(), "serious_lag_duration");
        c0lab2.LIZLLL(objValueOf, "file_bitrate");
        c0lab2.LJ("bitrate", String.valueOf(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate()));
        c0lab2.LIZ(interfaceC2254081DKkSt2.getMediaController().r5(), "lag_total_duration");
        c0lab2.LIZIZ(j2, "duration");
        c0lab2.LIZIZ(j2, "creation_duration");
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(fP5);
        sbLIZ5.append("");
        c0lab2.LJ("write_fps", C2188811AlT.LIZIZ(sbLIZ5));
        c0lab2.LIZ(interfaceC2254081DKkSt2.getMediaController().q5(), "frame_total");
        c0lab2.LIZJ(Float.valueOf(interfaceC2254081DKkSt2.getMediaController().d5()), "n_camera_frame_interval");
        c0lab2.LIZJ(Float.valueOf(interfaceC2254081DKkSt2.getMediaController().L5()), "n_preview_frame_interval");
        c0lab2.LIZJ(Float.valueOf(interfaceC2254081DKkSt2.getMediaController().s5()), "n_record_frame_interval");
        c0lab2.LJ("camera", C1449260noi.LIZIZ(getCameraApiComponent().LJLJJLL()));
        c0lab2.LIZLLL(numC3, "beautify_used");
        c0lab2.LIZ(1, "is_composer");
        if (C294160Bfy.LIZ()) {
            ComposerBeautyBuriedInfo composerBeautyBuriedInfoK4 = K4();
            c0lab2.LIZ(C1409940mnI.LIZJ(composerBeautyBuriedInfoK4, O4()), "beauty_status");
            c0lab2.LJ("beautify_info", C1409940mnI.LJ(composerBeautyBuriedInfoK4));
        }
        if (faceStickerBeanJr == null || (resourceID = faceStickerBeanJr.getResourceID()) == null) {
            resourceID = "";
        }
        c0lab2.LJ("resource_id", resourceID);
        MusicObject musicObject = this.LLILZIL.creativeModel.musicBuzModel.music;
        if (musicObject == null || (musicId = MusicBeanUtilKt.getMusicId(musicObject)) == null) {
            musicId = "";
        }
        c0lab2.LJ("music_id", musicId);
        c0lab2.LIZLLL(faceStickerBeanJr != null ? faceStickerBeanJr.getProvider() : null, "provider");
        c0lab2.LIZLLL(faceStickerBeanJr != null ? faceStickerBeanJr.getPackageSize() : null, "package_size");
        C1413430msv.LIZJ(c0lab2, interfaceC2254081DKkSt2.getEffectController());
        C21142717oX.LIZIZ(c0lab2, !zLJIIIZ);
        ShortVideoContext shortVideoContext = this.LLILZIL;
        c0ldj.getClass();
        C0LDJ.LIZ(c0lab2, shortVideoContext);
        c0lab2.LIZJ(Float.valueOf(BrightnessManager.LIZLLL()), "brightness");
        c0lab2.LIZJ(Float.valueOf(ToolsBaseLightSensorUtils.INSTANCE.getCurrentLightLevel()), "light_sensor_level");
        if (faceStickerBeanJr != null && (id2 = faceStickerBeanJr.getId()) != null && C123100dR.LIZ(id2)) {
            lnn.q stickerApiComponent2 = getStickerApiComponent();
            c0lab2.LJ("prop_launch_ui_point", (stickerApiComponent2 == null || (interfaceC1624480sNKC0 = stickerApiComponent2.C0()) == null || (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) == null || (mutableLiveDataLJ = interfaceC1625470sOvLJII.LJ()) == null || (c1449000noI = (C1449000noI) mutableLiveDataLJ.getValue()) == null) ? null : c1449000noI.LJII);
        }
        if (zLJIIIZ) {
            C860560XpO.LIZ(c0lab2);
        }
        c0lab2.LIZ(this.LLILZIL.creativeModel.recordDowngradeModel.downgradeLevels, "resolution_downgrade_levels");
        c0lab2.LIZ(this.LLILZIL.creativeModel.recordDowngradeModel.downgradeInputFlags, "downgrade_input_flags");
        String str = this.LLILZIL.creativeModel.recordDowngradeModel.resolution;
        if (str == null) {
            str = "";
        }
        c0lab2.LJ("downgraded_resolution", str);
        C303380Buq.LIZ("tool_performance_video_record", c0lab2.LIZ);
        C524780Ki4.LIZ.recordSingleValuePerfLog("tool_performance_video_record", new AwS566S0100000_22(interfaceC2254081DKkSt2, 348));
        if (C1DS1.LIZJ && fH5 > 0.0f && fH5 < ((Number) C1DS1.LJIILL.getValue()).floatValue()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.IC, EnumC804170Vgd.IC_JANK, null, 0L, 28));
        }
        if (this.LLILZIL.cameraComponentModel.isEditorProRecordMode) {
            return;
        }
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFilesFromShootMode((Scene) getDiContainer().LJIIL(null, AbstractC214814194y.class), Integer.valueOf(this.LLILZIL.shootMode));
    }

    private final void J6() {
        C11NZ<Pair<Effect, C991780buq>> c11nzWJ0;
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        LiveEvent<AbstractC1448380nnI> liveEventPb2;
        lnn.q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (liveEventPb2 = stickerApiComponent.pb2()) != null) {
            liveEventPb2.LIZ(this, new AObjectS245S0100000_22(this, 83));
        }
        lnn.q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (liveEventMa2 = stickerApiComponent2.Ma2()) != null) {
            liveEventMa2.LIZ(this, new AObjectS245S0100000_22(this, 84));
        }
        lnn.q stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 == null || (c11nzWJ0 = stickerApiComponent3.WJ0()) == null) {
            return;
        }
        this.LLJILJILJ.LIZ(c11nzWJ0.LJJLL(new AfS191S0100000_22(this, 12), C09HN.LIZ));
    }

    private final void M5() {
        this.LLJJIJIL = AudioGlitchService.LIZ();
        boolean zLJJLL = this.LLILZIL.LJJLL();
        VERecorder vERecorderLIZIZ = getCameraApiComponent().u92().LIZIZ();
        VEAudioCapture vEAudioCaptureLJ = getCameraApiComponent().St2().oh().getAudioController().LJ();
        getRecordControlApi().cJ0().LIZ(this, new AObjectS25S0310000_22(this, vEAudioCaptureLJ, zLJJLL, vERecorderLIZIZ, 0));
        getRecordControlApi().lC2().LIZ(this, new AObjectS245S0100000_22(this, 88));
        getRecordControlApi().pU1().LIZ(this, new AObjectS25S0310000_22(this, vEAudioCaptureLJ, zLJJLL, vERecorderLIZIZ, 1));
        getRecordControlApi().Vt0().LIZ(this, new AObjectS245S0100000_22(this, 89));
        getRecordControlApi().EP().LIZ(this, new AObjectS245S0100000_22(this, 90));
        getRecordControlApi().yK0().LIZ(this, new AObjectS245S0100000_22(this, 91));
        getCameraApiComponent().vC1().LIZ(this, new AObjectS245S0100000_22(this, 92));
        getRecordControlApi().kT0().LIZ(this, new AObjectS245S0100000_22(this, 93));
        getRecordControlApi().yM2().LIZ(this, new AObjectS245S0100000_22(this, 80));
        getRecordControlApi().Ia0().LIZ(this, new AObjectS245S0100000_22(this, 87));
        this.LLJILJILJ.LIZ(getRecordControlApi().yu0().LJJLL(new AfS191S0100000_22(this, 13), C09HN.LIZ));
    }

    private final void N5() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1627740sSa interfaceC1627740sSaLJIILLIIL;
        C19475711Hn c19475711HnLJ;
        InterfaceC1624480sNK interfaceC1624480sNKC02;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLIZ;
        InterfaceC1624480sNK interfaceC1624480sNKC03;
        InterfaceC1625470sOv interfaceC1625470sOvLJII2;
        MutableLiveData mutableLiveDataLJ;
        lnn.q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1624480sNKC03 = stickerApiComponent.C0()) != null && (interfaceC1625470sOvLJII2 = interfaceC1624480sNKC03.LJII()) != null && (mutableLiveDataLJ = interfaceC1625470sOvLJII2.LJ()) != null) {
            mutableLiveDataLJ.observe(this, new AObjectS245S0100000_22(this, 81));
        }
        lnn.q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (interfaceC1624480sNKC02 = stickerApiComponent2.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC02.LJII()) != null && (mutableLiveDataLIZ = interfaceC1625470sOvLJII.LIZ()) != null) {
            mutableLiveDataLIZ.observe(this, new AObjectS245S0100000_22(this, 82));
        }
        lnn.q stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 == null || (interfaceC1624480sNKC0 = stickerApiComponent3.C0()) == null || (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) == null || (interfaceC1627740sSaLJIILLIIL = stickerRepository.LJIILLIIL()) == null || (c19475711HnLJ = interfaceC1627740sSaLJIILLIIL.LJ()) == null) {
            return;
        }
        this.LLJILJILJ.LIZ(c19475711HnLJ.LJJLL(new AfS191S0100000_22(this, 11), C09HN.LIZ));
    }

    private final InterfaceC1628590sTx T2() {
        return getRecordAdapterApi().NL1().LIZJ();
    }

    private final void T4() {
        DialogC1390150mHN dialogC1390150mHNE3 = E3();
        if (dialogC1390150mHNE3 != null) {
            dialogC1390150mHNE3.LJJLL(0.0f, false);
            C786410Ut5.K4(dialogC1390150mHNE3);
        }
        start();
    }

    private final void W6() {
        getCameraApiComponent().St2().L0(new C1663400tO6(new AwS566S0100000_22(this, 346), new InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>() { // from class: X.0nn1
            @Override // X.InterfaceC1631630sYr
            public final Unit invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
                String string;
                Integer numValueOf;
                Integer numValueOf2;
                Integer numValueOf3;
                String id;
                C385670FAf<FilterBean> c385670FAfI70;
                FilterBean filterBeanLIZJ;
                Integer numValueOf4;
                Integer numValueOf5;
                Integer numValueOf6;
                String id2;
                C385670FAf<FilterBean> c385670FAfI702;
                FilterBean filterBeanLIZJ2;
                FaceStickerBean faceStickerBeanJr;
                int iIntValue = num.intValue();
                num2.intValue();
                VERecorder vERecorder2 = vERecorder;
                if (iIntValue == 1076) {
                    vERecorder2.LIZIZ.getClass();
                    C1448320nnC.LIZJ = 0.0d;
                    vERecorder2.LIZIZ.getClass();
                    C1448320nnC.LIZLLL = 0.0d;
                    vERecorder2.LIZIZ.getClass();
                    C1448320nnC.LJ = 0.0d;
                    vERecorder2.LIZIZ.getClass();
                    C1448320nnC.LJFF = 0.0d;
                    long endFrameTimeUS = this.LL.getCameraApiComponent().St2().getEndFrameTimeUS() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", this.LL.LLILZIL.LJ().getCreationId());
                    c0lab.LJ("content_type", this.LL.LLILZIL.LJ().getContentType());
                    c0lab.LJ("content_source", this.LL.LLILZIL.LJ().getContentSource());
                    c0lab.LIZ(this.LL.LLILZIL.shootMode, "record_mode");
                    c0lab.LIZIZ(endFrameTimeUS, "record_duration");
                    q stickerApiComponent = this.LL.getStickerApiComponent();
                    if (stickerApiComponent == null || (faceStickerBeanJr = stickerApiComponent.jr()) == null || (string = Long.valueOf(faceStickerBeanJr.getStickerId()).toString()) == null) {
                        string = "";
                    }
                    c0lab.LJ("prop_id", string);
                    u uVar = this.LL;
                    if (C1622090sJT.LIZ(uVar.B3())) {
                        a aVarLIZJ = uVar.getRecordAdapterApi().ex().LIZJ();
                        if (aVarLIZJ != null) {
                            numValueOf4 = Integer.valueOf(aVarLIZJ.C9());
                        } else {
                            numValueOf4 = null;
                        }
                        c0lab.LIZLLL(numValueOf4, "eyes");
                        if (aVarLIZJ != null) {
                            numValueOf5 = Integer.valueOf(aVarLIZJ.Kl());
                        } else {
                            numValueOf5 = null;
                        }
                        c0lab.LIZLLL(numValueOf5, "smooth");
                        if (aVarLIZJ != null) {
                            numValueOf6 = Integer.valueOf(aVarLIZJ.Xr());
                        } else {
                            numValueOf6 = null;
                        }
                        c0lab.LIZLLL(numValueOf6, "reshape");
                        InterfaceC1644770su3 interfaceC1644770su3LIZJ = uVar.getRecordAdapterApi().tn2().LIZJ();
                        if (interfaceC1644770su3LIZJ != null && (c385670FAfI702 = interfaceC1644770su3LIZJ.i70()) != null && (filterBeanLIZJ2 = c385670FAfI702.LIZJ()) != null) {
                            id2 = filterBeanLIZJ2.getId();
                        } else {
                            id2 = null;
                        }
                        c0lab.LJ("filter_id", uVar.s7(id2));
                    } else {
                        a aVarH2 = uVar.H2();
                        if (aVarH2 != null) {
                            numValueOf = Integer.valueOf(aVarH2.C9());
                        } else {
                            numValueOf = null;
                        }
                        c0lab.LIZLLL(numValueOf, "eyes");
                        a aVarH22 = uVar.H2();
                        if (aVarH22 != null) {
                            numValueOf2 = Integer.valueOf(aVarH22.Kl());
                        } else {
                            numValueOf2 = null;
                        }
                        c0lab.LIZLLL(numValueOf2, "smooth");
                        a aVarH23 = uVar.H2();
                        if (aVarH23 != null) {
                            numValueOf3 = Integer.valueOf(aVarH23.Xr());
                        } else {
                            numValueOf3 = null;
                        }
                        c0lab.LIZLLL(numValueOf3, "reshape");
                        InterfaceC1644770su3 filterApiComponent = uVar.getFilterApiComponent();
                        if (filterApiComponent != null && (c385670FAfI70 = filterApiComponent.i70()) != null && (filterBeanLIZJ = c385670FAfI70.LIZJ()) != null) {
                            id = filterBeanLIZJ.getId();
                        } else {
                            id = null;
                        }
                        c0lab.LJ("filter_id", uVar.s7(id));
                    }
                    c0lab.LIZLLL(Double.valueOf(C1448320nnC.LIZJ), "record_preview_frame_rate_start");
                    c0lab.LIZLLL(Double.valueOf(C1448320nnC.LIZLLL), "record_preview_frame_rate_end");
                    c0lab.LIZLLL(Double.valueOf(C1448320nnC.LJ), "record_render_frame_time");
                    c0lab.LIZLLL(Double.valueOf(C1448320nnC.LJFF), "record_effect_render_time");
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), C0PEM.LIZJ, null, new C1406930miR(c0lab, this.LL, null), 2);
                }
                return Unit.LIZ;
            }
        }));
    }

    private final InterfaceC1647520syU getInfiniStickerApi() {
        return getRecordAdapterApi().Hl0().LIZJ();
    }

    private final void w2() {
        Object next;
        Effect effect;
        String effect_id;
        if (C272910Amn.LIZ()) {
            if (this.LLJJI.size() > 5) {
                Iterator<T> it2 = this.LLJJI.values().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long j = ((C1448240nn4) next).LIZIZ;
                        do {
                            Object next2 = it2.next();
                            long j2 = ((C1448240nn4) next2).LIZIZ;
                            if (j > j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                C1448240nn4 c1448240nn4 = (C1448240nn4) next;
                if (c1448240nn4 != null && (effect = c1448240nn4.LIZ) != null && (effect_id = effect.getEffect_id()) != null) {
                    this.LLJJI.remove(effect_id);
                }
            }
            LLJLIL.getClass();
            long jCurrentTimeMillis = C1448310nnB.LIZ() ? System.currentTimeMillis() : SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C1448240nn4>> it3 = this.LLJJI.entrySet().iterator();
            while (it3.hasNext()) {
                if (jCurrentTimeMillis - it3.next().getValue().LIZIZ > 30000) {
                    it3.remove();
                }
            }
        }
    }

    private final void x5() {
        LiveEvent<AbstractC1652010t5j> liveEventXR0;
        if (C1622090sJT.LIZ(B3())) {
            whenReady(this, a.class, new AwS601S0100000_22(this, 216));
            return;
        }
        a aVarH2 = H2();
        if (aVarH2 == null || (liveEventXR0 = aVarH2.XR0()) == null) {
            return;
        }
        liveEventXR0.LIZ(this, new AObjectS246S0100000_25(this, 210));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo K4() {
        /*
            r7 = this;
            X.0sv2 r0 = r7.B3()
            boolean r0 = X.C1622090sJT.LIZ(r0)
            if (r0 == 0) goto L33
            X.0syK r0 = r7.getRecordAdapterApi()
            X.0FAf r0 = r0.ex()
            java.lang.Object r0 = r0.LIZJ()
            ln3.a r0 = (ln3.a) r0
            if (r0 == 0) goto L26
            X.12I9 r0 = r0.je()
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo r0 = r0.Ne()
        L24:
            if (r0 != 0) goto L32
        L26:
            com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo r0 = new com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo
            r1 = 0
            r4 = 0
            r5 = 15
            r2 = r1
            r3 = r1
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L32:
            return r0
        L33:
            ln3.a r0 = r7.H2()
            if (r0 == 0) goto L26
            X.12I9 r0 = r0.je()
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo r0 = r0.Ne()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.K4():com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo O4() {
        /*
            r2 = this;
            X.0sv2 r0 = r2.B3()
            boolean r0 = X.C1622090sJT.LIZ(r0)
            if (r0 == 0) goto L2d
            X.0syK r0 = r2.getRecordAdapterApi()
            X.0FAf r0 = r0.ex()
            java.lang.Object r0 = r0.LIZJ()
            ln3.a r0 = (ln3.a) r0
            if (r0 == 0) goto L26
            X.12I9 r0 = r0.je()
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo r1 = r0.Ke()
        L24:
            if (r1 != 0) goto L2c
        L26:
            com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo r1 = new com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo
            r0 = 0
            r1.<init>(r0, r0)
        L2c:
            return r1
        L2d:
            ln3.a r0 = r2.H2()
            if (r0 == 0) goto L26
            X.12I9 r0 = r0.je()
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo r1 = r0.Ke()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.O4():com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo");
    }

    public final void R5() {
        if (d5()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", this.LLILZIL.getCreationId());
            c0lab.LJ("shoot_way", this.LLILZIL.shootWay);
            c0lab.LIZ(C539900LFk.LIZJ(this.LLILZIL) + 1, "current_segment_cnt");
            c0lab.LJ("shoot_tab_name", this.LLILZIL.LJIJJLI());
            ArrayList<String> arrayList = this.LLILZIL.creativeModel.recordData.recordTypeList;
            c0lab.LJ("record_type", arrayList != null ? (String) C13LP.LJJLIIIJL(arrayList) : null);
            String str = this.LLILZIL.creativeModel.commonMobModel.recordResult;
            if (str == null) {
                str = "video";
            }
            c0lab.LJ("record_result", str);
            C20684815ws.LJIILLIIL("record_video_discard", c0lab.LIZ);
        }
    }

    public final Integer c3() {
        if (C1622090sJT.LIZ(B3())) {
            a aVarLIZJ = getRecordAdapterApi().ex().LIZJ();
            if (aVarLIZJ != null) {
                return Integer.valueOf(aVarLIZJ.Ty0());
            }
            return null;
        }
        a aVarH2 = H2();
        if (aVarH2 != null) {
            return Integer.valueOf(aVarH2.Ty0());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0nnE] */
    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        M5();
        W6();
        getCameraApiComponent().tS1().LIZ(this, new AObjectS245S0100000_22(this, 85));
        getCameraApiComponent().h92().LIZ(this, new AObjectS245S0100000_22(this, 86));
        getCameraApiComponent().u92().getCameraController().W3(new C1DIK() { // from class: X.0nnE
            @Override // X.C1DIK
            public final void LIZ() {
                this.LIZ.LLJJJ = System.currentTimeMillis();
            }
        });
        Bundle bundleLIZ = C537670L6v.LIZ(getDiContainer(), this.LLILLL);
        long j = bundleLIZ != null ? bundleLIZ.getLong("extra_start_record_time", 0L) : 0L;
        this.LLJJIII = new C1448350nnF(bundleLIZ != null ? (Effect) bundleLIZ.getParcelable("first_sticker") : null, j);
        this.LLJJIJI = new C1448350nnF(null, j);
        x5();
        E5();
        J6();
        N5();
        if (bundleLIZ != null && bundleLIZ.getBoolean("show_preloading_dialog", false) && C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            T4();
        }
        ToolsBaseLightSensorUtils.INSTANCE.registerLightLevelListener(this.LLJILLL);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJILJILJ.LJ();
        ToolsBaseLightSensorUtils.INSTANCE.unregisterLightLevelListener(this.LLJILLL);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        VERecorder vERecorderLIZIZ = getCameraApiComponent().u92().LIZIZ();
        VEAudioCapture vEAudioCaptureLJ = getCameraApiComponent().St2().oh().getAudioController().LJ();
        IAudioGlitchService iAudioGlitchService = this.LLJJIJIL;
        if (iAudioGlitchService != null) {
            iAudioGlitchService.enableRecordGlitchInShootScene(vEAudioCaptureLJ, false);
        }
        IAudioGlitchService iAudioGlitchService2 = this.LLJJIJIL;
        if (iAudioGlitchService2 != null) {
            iAudioGlitchService2.enablePlayGlitchInShootScene(vERecorderLIZIZ, false);
        }
    }

    public InterfaceC579060MnQ G2() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC579060MnQ
    public long MX() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0nn5] */
    public u(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final int O3(Effect effect) {
        if (C1624570sNT.LJIIL(effect) || !(effect instanceof MobileEffect) || effect.getSource() != 102) {
            return 0;
        }
        return ((MobileEffect) effect).getModerationStatus();
    }

    private final void P6(Effect effect) {
        if (Intrinsics.LJFF(this.LLILZIL.shootWay, "direct_shoot") && effect != null) {
            C15O7.LIZJ(new ACallableS23S1000000_8(effect.getEffectId(), 5));
        }
    }

    private final void U5(C0LAB c0lab) {
        Long lValueOf;
        String str;
        FaceStickerBean faceStickerBeanJr;
        lnn.q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (faceStickerBeanJr = stickerApiComponent.jr()) != null) {
            lValueOf = Long.valueOf(faceStickerBeanJr.getStickerId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        ShortVideoContext shortVideoContext = this.LLILZIL;
        if (shortVideoContext.stickersFromDraftVideos != null && kotlin.text.u.LJIJI(shortVideoContext.shootWay, "draft_again", false) && !TextUtils.isEmpty(strValueOf)) {
            int iIndexOf = TextUtils.indexOf(this.LLILZIL.stickersFromDraftVideos, strValueOf);
            if (iIndexOf != -1) {
                if (iIndexOf != 0) {
                    str = "other";
                } else {
                    str = "first";
                }
            } else {
                str = "not_drafts";
            }
            c0lab.LJ("prop_from", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[PHI: r7
      0x0083: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String), (r7v6 java.lang.String) binds: [B:24:0x0081, B:45:0x00d7, B:44:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void W1(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.W1(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean):void");
    }

    private final String W2(EnumC1448830no1 enumC1448830no1) {
        ShortVideoContext shortVideoContext = this.LLILZIL;
        int i = shortVideoContext.shootMode;
        if (i == 8) {
            return "video";
        }
        if (i != 20 && i != 29) {
            if (i == 10 || i == 11) {
                return "video";
            }
            if (i != 23 && i != 24) {
                switch (i) {
                    case 14:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        return "video";
                    case 15:
                    case 16:
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        break;
                    default:
                        return shortVideoContext.LJ().getContentType();
                }
            }
        }
        if (enumC1448830no1 != EnumC1448830no1.CLICK) {
            return "video";
        }
        return "photo";
    }

    private final String m3(C1448290nn9 c1448290nn9) {
        EnumC1448830no1 enumC1448830no1;
        int i = this.LLILZIL.shootMode;
        if ((i != 16 && i != 20 && i != 29 && i != 23 && i != 24) || ((enumC1448830no1 = c1448290nn9.LIZ) != EnumC1448830no1.CLICK && (enumC1448830no1 != EnumC1448830no1.COUNT_DOWN || c1448290nn9.LIZJ > 0))) {
            return "video";
        }
        return "photo";
    }

    private final boolean t5(Effect effect) {
        if (effect != null) {
            return C1624200sMs.LIZ(effect, "is_greenscreen_tool");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void u6(C0LAB c0lab) {
        C1449000noI c1449000noI;
        lnn.q stickerApiComponent;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1624480sNK interfaceC1624480sNKC02;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        UniqueLiveData uniqueLiveDataLJIILL;
        C1448480nnS c1448480nnS;
        int i;
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC03;
        lnn.q stickerApiComponent2;
        InterfaceC1624480sNK interfaceC1624480sNKC04;
        InterfaceC1624480sNK interfaceC1624480sNKC05;
        InterfaceC1624480sNK interfaceC1624480sNKC06;
        InterfaceC1625470sOv interfaceC1625470sOvLJII2;
        MutableLiveData mutableLiveDataLJ;
        lnn.q stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 != null && stickerApiComponent3.jr() != null) {
            lnn.q stickerApiComponent4 = getStickerApiComponent();
            Effect effectLLILIL2 = null;
            if (stickerApiComponent4 != null && (interfaceC1624480sNKC06 = stickerApiComponent4.C0()) != null && (interfaceC1625470sOvLJII2 = interfaceC1624480sNKC06.LJII()) != null && (mutableLiveDataLJ = interfaceC1625470sOvLJII2.LJ()) != null) {
                c1449000noI = (C1449000noI) mutableLiveDataLJ.getValue();
            } else {
                c1449000noI = null;
            }
            if (c1449000noI == null) {
                lnn.q stickerApiComponent5 = getStickerApiComponent();
                if (stickerApiComponent5 != null) {
                    effectLLILIL = stickerApiComponent5.C0().LLILIL();
                } else {
                    effectLLILIL = null;
                }
                if (!t5(effectLLILIL) && (stickerApiComponent2 = getStickerApiComponent()) != null && (interfaceC1624480sNKC04 = stickerApiComponent2.C0()) != null) {
                    lnn.q stickerApiComponent6 = getStickerApiComponent();
                    if (stickerApiComponent6 != null) {
                        effectLLILIL2 = stickerApiComponent6.C0().LLILIL();
                    }
                    if (C1625940sPg.LJIIL(interfaceC1624480sNKC04, effectLLILIL2)) {
                        lnn.q stickerApiComponent7 = getStickerApiComponent();
                        if (stickerApiComponent7 != null && (interfaceC1624480sNKC05 = stickerApiComponent7.C0()) != null) {
                            c0lab.LIZ(interfaceC1624480sNKC05.LJI() + 1, "prop_impr_position");
                            return;
                        }
                        return;
                    }
                }
                lnn.q stickerApiComponent8 = getStickerApiComponent();
                if (stickerApiComponent8 == null || (interfaceC1624480sNKC03 = stickerApiComponent8.C0()) == null) {
                    return;
                }
                interfaceC1624480sNKC03.LJI();
                c0lab.LJ("prop_impr_position", "");
                return;
            }
            if (c1449000noI.LIZLLL || (stickerApiComponent = getStickerApiComponent()) == null || (interfaceC1624480sNKC0 = stickerApiComponent.C0()) == null || interfaceC1624480sNKC0.LLILIL() == null) {
                return;
            }
            CreativeModel creativeModel = this.LLILZIL.creativeModel;
            AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(296);
            C1449230nof c1449230nof = new C1449230nof(creativeModel, "record_video", new C1281904zx(c0lab));
            aFwS261S0000000_22.invoke(c1449230nof);
            c1449230nof.LIZ();
            Effect effect = c1449000noI.LIZ;
            if (effect != null) {
                c0lab.LJI(C1905107dB.LIZ(effect));
            }
            int i2 = c1449000noI.LIZJ;
            if (i2 >= 0) {
                c0lab.LIZ(i2, "prop_impr_position");
            }
            lnn.q stickerApiComponent9 = getStickerApiComponent();
            if (stickerApiComponent9 == null || (interfaceC1624480sNKC02 = stickerApiComponent9.C0()) == null || (interfaceC1625470sOvLJII = interfaceC1624480sNKC02.LJII()) == null || (uniqueLiveDataLJIILL = interfaceC1625470sOvLJII.LJIILL()) == null || (c1448480nnS = (C1448480nnS) uniqueLiveDataLJIILL.getValue()) == null || (i = c1448480nnS.LIZ) < 0) {
                return;
            }
            c0lab.LJ("prop_tab_order", String.valueOf(i));
        }
    }

    private final long v3(String str) {
        if (str == null || str.length() <= 0) {
            return 0L;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isFile() || c0vsj.length() <= 0) {
            return 0L;
        }
        return c0vsj.length();
    }

    private final String z4(EnumC1448830no1 enumC1448830no1) {
        int i = C1448820no0.LIZ[enumC1448830no1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "countdown";
            }
            return "press";
        }
        return "click";
    }

    public final void H5(Effect effect) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("enter_from", "video_shoot_page");
        String str = this.LLILZIL.shootWay;
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("shoot_way", str);
        pairArr[2] = new Pair("creation_id", this.LLILZIL.getCreationId());
        pairArr[3] = new Pair("content_source", this.LLILZIL.LJ().getContentSource());
        pairArr[4] = new Pair("content_type", this.LLILZIL.LJ().getContentType());
        pairArr[5] = new Pair("tab_name", FaceStickerBean.sCurPropSource);
        pairArr[6] = new Pair("prop_id", effect.getEffectId());
        C2341909Fp.LIZ("light_warn_notice_show", C2097608Jq.LJI(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a8 A[PHI: r8
      0x01a8: PHI (r8v2 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:91:0x01a4, B:56:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P4(X.AbstractC1627380sS0 r13) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.P4(X.0sS0):void");
    }

    public final void S5(C1644050sst c1644050sst) {
        Object objLJJLIIIJL;
        if (!c1644050sst.LJI) {
            return;
        }
        String str = null;
        if (!d5()) {
            ArrayList<String> arrayList = this.LLILZIL.creativeModel.recordData.recordTypeList;
            if (arrayList != null) {
                objLJJLIIIJL = C13LP.LJJLIIIJL(arrayList);
            } else {
                objLJJLIIIJL = null;
            }
            if (Intrinsics.LJFF(objLJJLIIIJL, "press")) {
                return;
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LLILZIL.getCreationId());
        c0lab.LJ("shoot_way", this.LLILZIL.shootWay);
        c0lab.LIZ(C539900LFk.LIZJ(this.LLILZIL), "shooting_segment_cnt");
        c0lab.LJ("shoot_tab_name", this.LLILZIL.LJIJJLI());
        ArrayList<String> arrayList2 = this.LLILZIL.creativeModel.recordData.recordTypeList;
        if (arrayList2 != null) {
            str = (String) C13LP.LJJLIIIJL(arrayList2);
        }
        c0lab.LJ("record_type", str);
        String str2 = this.LLILZIL.creativeModel.commonMobModel.recordResult;
        if (str2 == null) {
            str2 = "video";
        }
        c0lab.LJ("record_result", str2);
        C20684815ws.LJIILLIIL("record_video_pause", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(X.C1448290nn9 r20) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.T6(X.0nn9):void");
    }

    public final void n7(int i) {
        C0CNO.LIZLLL(0L, new C1645440sv8(i, getCameraApiComponent().Ue(), this));
    }

    public final String o4(String str) {
        int i = this.LLILZIL.shootMode;
        if (i != 20 && i != 29 && i != 23) {
            if (i != 24) {
                switch (i) {
                    case 15:
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        break;
                    case 16:
                        break;
                    default:
                        return "video";
                }
            }
            if (getCameraApiComponent().St2().getEndFrameTimeUS() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 1000) {
                return "video";
            }
            return "photo";
        }
        if (!Intrinsics.LJFF(str, "click") && getCameraApiComponent().St2().getEndFrameTimeUS() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 1000) {
            return "video";
        }
        return "photo";
    }

    public final void v5(C1648160szW c1648160szW) {
        if (this.LLILZIL.LJJLL() || this.LLILZIL.LJJJJLL()) {
            int i = c1648160szW.LIZ;
            if (i != 1) {
                if (i == 2) {
                    ShortVideoContext shortVideoContext = this.LLILZIL;
                    shortVideoContext.creativeModel.recordMobModel.microphoneStatus = "off";
                    Z1(shortVideoContext, "off");
                    return;
                }
                return;
            }
            ShortVideoContext shortVideoContext2 = this.LLILZIL;
            shortVideoContext2.creativeModel.recordMobModel.microphoneStatus = "on";
            Z1(shortVideoContext2, "on");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:398:0x08e9 A[PHI: r2 r8
      0x08e9: PHI (r2v69 java.lang.String) = (r2v10 java.lang.String), (r2v70 java.lang.String) binds: [B:397:0x08e7, B:395:0x08df] A[DONT_GENERATE, DONT_INLINE]
      0x08e9: PHI (r8v22 java.lang.String) = (r8v19 java.lang.String), (r8v23 java.lang.String) binds: [B:397:0x08e7, B:395:0x08df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08fe A[PHI: r2
      0x08fe: PHI (r2v12 java.lang.String) = (r2v11 java.lang.String), (r2v68 java.lang.String) binds: [B:399:0x08ee, B:403:0x08fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0973 A[LOOP:0: B:421:0x096d->B:423:0x0973, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c3d  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0cff  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0d07  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0d0a  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0d10  */
    @Override // X.InterfaceC579060MnQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zN2(X.C1448290nn9 r26) {
        /*
            Method dump skipped, instruction units count: 3347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.component.u.zN2(X.0nn9):void");
    }

    private final String H3(ShortVideoContext shortVideoContext, C1448290nn9 c1448290nn9) {
        AVMusic aVMusicMr0;
        String musicId;
        if (!C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            shortVideoContext.creativeModel.recordMobModel.microphoneStatus = "no_permission";
            return "no_permission";
        }
        if (Intrinsics.LJFF(m3(c1448290nn9), "photo")) {
            shortVideoContext.creativeModel.recordMobModel.microphoneStatus = "off";
            return "off";
        }
        if (!shortVideoContext.LJJLL() && !shortVideoContext.LJJJJLL()) {
            InterfaceC1628590sTx interfaceC1628590sTxT2 = T2();
            if (interfaceC1628590sTxT2 != null && (aVMusicMr0 = interfaceC1628590sTxT2.mr0()) != null && (musicId = aVMusicMr0.getMusicId()) != null && musicId.length() != 0) {
                shortVideoContext.creativeModel.recordMobModel.microphoneStatus = "off";
                return "off";
            }
            shortVideoContext.creativeModel.recordMobModel.microphoneStatus = "on";
            return "on";
        }
        String str = shortVideoContext.creativeModel.recordMobModel.microphoneStatus;
        if (str == null) {
            return "";
        }
        return str;
    }

    private final void Z1(ShortVideoContext shortVideoContext, String str) {
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "video");
        c0lab.LJ("content_source", shortVideoContext.LJ().getContentSource());
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("to_status", str);
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("shoot_entrance", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        if (shortVideoContext.mIsFromDraft) {
            str2 = "click_draft";
        } else {
            str2 = "";
        }
        c0lab.LJ("enter_method", str2);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c0lab.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(shortVideoContext.newDraftId)) {
            c0lab.LJ("new_draft_id", shortVideoContext.newDraftId);
        }
        C20684815ws.LJIILLIIL("mute_microphone", c0lab.LIZ);
    }

    private final void d6(int i, boolean z) {
        C1448350nnF c1448350nnF;
        Effect effect;
        int i2;
        int i3;
        int i4;
        if (i != 17 || (c1448350nnF = this.LLJJIII) == null || (effect = c1448350nnF.LIZIZ) == null) {
            return;
        }
        C1448420nnM c1448420nnMZo = getCameraApiComponent().St2().getEffectController().zo();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - c1448350nnF.LIZ, "duration");
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("prop_id", effect.getEffect_id());
        c0lab.LJ("shoot_way", this.LLILZIL.shootWay);
        c0lab.LJ("enter_from", this.LLILZIL.enterFrom);
        c0lab.LJ("enter_method", this.LLILZIL.enterMethod);
        if (c1448420nnMZo != null) {
            i2 = c1448420nnMZo.LIZ;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "lag_count");
        if (c1448420nnMZo != null) {
            i3 = c1448420nnMZo.LIZIZ;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "lag_total_duration");
        if (c1448420nnMZo != null) {
            i4 = c1448420nnMZo.LIZJ;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "sticker_duration");
        if (kotlin.text.u.LJIJI(this.LLILZIL.shootWay, "direct_shoot", false)) {
            c0lab.LJ("type", "plus");
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_prop_reuse_apply_time", c0lab.LIZ);
        this.LLJJIII = null;
    }

    private final void d7(int i, String str) {
        String currentBottomTag;
        InterfaceC1648020szI interfaceC1648020szILIZJ = getRecordAdapterApi().VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            currentBottomTag = interfaceC1648020szILIZJ.getCurrentBottomTag();
        } else {
            currentBottomTag = null;
        }
        if (!C1647580sya.LIZJ(currentBottomTag)) {
            C0CNO.LIZLLL(0L, new AwS566S0100000_22(this, 347));
        }
        if (!C306620C0e.LIZ()) {
            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("resource_name", str);
            interfaceC1637880siwLIZJ.LJIIJJI(i, "3d_sticker_show_rate", c543670LTx.LJ());
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c0lab.LJ("resource_name", str);
            C2341909Fp.LIZ("3d_sticker_show_rate", c0lab.LIZ);
        }
        this.LLJJIJIIJIL = 0L;
    }

    private final String e4(Effect effect, FaceStickerBean faceStickerBean) {
        String effectId;
        if (C1624570sNT.LJIIL(effect)) {
            return "";
        }
        if (faceStickerBean != null) {
            return String.valueOf(faceStickerBean.getStickerId());
        }
        if (effect == null || (effectId = effect.getEffectId()) == null || effectId.length() <= 0) {
            return "";
        }
        return effectId;
    }

    private final String i3(Effect effect, FaceStickerBean faceStickerBean) {
        if (C1624570sNT.LJIIL(effect)) {
            return null;
        }
        if (effect != null) {
            if (C1446840nko.LJ(effect)) {
                return "102";
            }
            if (effect instanceof MobileEffectTemplateEffect) {
                return "101";
            }
        }
        if (faceStickerBean == null) {
            return null;
        }
        return Integer.valueOf(faceStickerBean.getSource()).toString();
    }

    public final void D5(String str, long j) {
        CameraComponentModel cameraComponentModelPw0 = getCameraApiComponent().pw0();
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZLLL("error_type", str);
        c543670LTx.LIZJ(Long.valueOf(j), "error_duration");
        c543670LTx.LIZIZ(Integer.valueOf(cameraComponentModelPw0.mDurings.size()), "segment_count");
        File fileLJ = cameraComponentModelPw0.mWorkspace.LJ();
        if (fileLJ.isDirectory()) {
            c543670LTx.LIZLLL("file_path", C1894607bU.LIZ(fileLJ.list()));
        }
        C0CHQ.LIZ().LIZJ().LJII("aweme_draft_edit_error", c543670LTx.LJ());
    }

    public final void X1(C0LAB c0lab, long j) {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        Long lValueOf;
        C1627370sRz c1627370sRz;
        Integer numValueOf;
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        lnn.q stickerApiComponent = getStickerApiComponent();
        AbstractC1627380sS0 abstractC1627380sS0LJI = null;
        if (stickerApiComponent != null && (liveEventMa2 = stickerApiComponent.Ma2()) != null) {
            abstractC1627380sS0LJI = liveEventMa2.LJI();
        }
        if ((abstractC1627380sS0LJI instanceof C1627370sRz) && (c1627370sRz = (C1627370sRz) abstractC1627380sS0LJI) != null && (numValueOf = Integer.valueOf(c1627370sRz.LJFF)) != null && numValueOf.intValue() > 0) {
            c0lab.LIZ(numValueOf.intValue(), "effect_fetch_time_ms");
        }
        lnn.q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (interfaceC1624480sNKC0 = stickerApiComponent2.C0()) != null && (lValueOf = Long.valueOf(interfaceC1624480sNKC0.LJJIJIIJIL())) != null) {
            c0lab.LIZIZ(j - lValueOf.longValue(), "sdk_processing_time_ms");
        }
    }

    public final void o2(Effect effect, lnn.q qVar) {
        C1448240nn4 c1448240nn4 = new C1448240nn4(effect);
        if (C272910Amn.LIZ()) {
            w2();
            this.LLJJI.put(effect.getEffect_id(), c1448240nn4);
        }
        C0CNO.LIZ(C15O7.LJI, new AwS150S0400000_22(c1448240nn4, qVar, effect, this, 1));
        this.LLJJ = c1448240nn4;
    }

    public final void u7(String str, EnumC1641380soa enumC1641380soa, boolean z) {
        C1448240nn4 c1448240nn4;
        if (C272910Amn.LIZ() && (c1448240nn4 = this.LLJJI.get(str)) != null) {
            int i = C1448820no0.LIZIZ[enumC1641380soa.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c1448240nn4.LIZLLL = z;
                    c1448240nn4.LJ = false;
                    c1448240nn4.LJFF.set(true);
                    return;
                }
                return;
            }
            c1448240nn4.LIZLLL = z;
            c1448240nn4.LJ = true;
            c1448240nn4.LJFF.set(true);
        }
    }

    private final void K6(Effect effect, int i, int i2, int i3, String str) {
        String unzipPath;
        String effectId;
        if (i != 17) {
            return;
        }
        if (i2 == 9) {
            if (i3 == 3) {
                if (effect != null && (effectId = effect.getEffectId()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sticker_id: ");
                    sbLIZ.append(effectId);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    effectId = "";
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
                InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("duration", Long.valueOf(jCurrentTimeMillis));
                interfaceC1637880siwLIZJ.LJII("type_av_sticker_show_time", c543670LTx.LJ());
                InterfaceC1625220sOW interfaceC1625220sOWH4 = H4();
                if (interfaceC1625220sOWH4 != null) {
                    interfaceC1625220sOWH4.LJIIL(jCurrentTimeMillis, effectId);
                }
                if (!C306620C0e.LIZ()) {
                    C0CHQ.LIZ().LIZJ().LJIIJJI(0, "3d_sticker_show_rate", null);
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C0LAB c0lab = new C0LAB();
                    c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    C2341909Fp.LIZ("3d_sticker_show_rate", c0lab.LIZ);
                }
                this.LLJJIJIIJIL = 0L;
                return;
            }
            return;
        }
        if (i2 == 4) {
            if (effect != null) {
                unzipPath = effect.getUnzipPath();
            } else {
                unzipPath = null;
            }
            if (!TextUtils.isEmpty(unzipPath)) {
                C15O7.LIZIZ(new ACallableS21S1000000_3(unzipPath, 2), C823050WQl.LIZLLL(), null);
            }
        } else if (i2 == 3 || i2 == 9 || i2 == 10) {
            return;
        }
        d7(i2, str);
    }

    public final void o7(Effect effect, int i, int i2, int i3, String str) {
        String effectId;
        InterfaceC1448230nn3 interfaceC1448230nn3LJJIIJZLJL = C1ER1.LIZIZ.LJJIIJZLJL();
        String original_effect_id = null;
        if (effect != null) {
            effectId = effect.getEffectId();
            original_effect_id = effect.getOriginal_effect_id();
        } else {
            effectId = null;
        }
        interfaceC1448230nn3LJJIIJZLJL.LJII(effectId, original_effect_id);
        if (i == 17) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            K6(effect, i, i2, i3, str);
            if (i2 == 9) {
                if (i3 == 3) {
                    L6(effect, 17, true, 3, jElapsedRealtime, jCurrentTimeMillis);
                    d6(i, true);
                    cancel();
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_memory_increase_event", true, false)) {
                        P6(effect);
                    }
                }
            } else if (i2 == 10) {
                C5();
            } else if (i2 == 4) {
                L6(effect, 17, false, i3, jElapsedRealtime, jCurrentTimeMillis);
            }
        }
        DialogC1390150mHN dialogC1390150mHNE3 = E3();
        if (dialogC1390150mHNE3 != null) {
            C0FNV.LIZ(dialogC1390150mHNE3);
        }
    }

    private final void L6(Effect effect, int i, boolean z, int i2, long j, long j2) {
        C1448240nn4 c1448240nn4;
        Effect effect2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i != 17) {
            return;
        }
        if (!C272910Amn.LIZ() || effect == null || (c1448240nn4 = this.LLJJI.get(effect.getEffect_id())) == null) {
            c1448240nn4 = this.LLJJ;
        }
        if (c1448240nn4 != null && (effect2 = c1448240nn4.LIZ) != null && effect != null && kotlin.text.u.LJIJI(effect2.getEffect_id(), effect.getEffect_id(), true)) {
            C1448420nnM c1448420nnMZo = getCameraApiComponent().St2().getEffectController().zo();
            C0LAB c0lab = new C0LAB();
            LLJLIL.getClass();
            if (!C1448310nnB.LIZ()) {
                c0lab.LIZIZ(j - c1448240nn4.LIZIZ, "duration");
            }
            if (C272910Amn.LIZ()) {
                if (c1448240nn4.LJFF.get()) {
                    i3 = 0;
                } else if (c1448240nn4.LJI.get()) {
                    i3 = 1;
                } else {
                    i3 = c1448240nn4.LIZJ;
                }
            } else {
                i3 = c1448240nn4.LIZJ;
            }
            C0LDJ c0ldj = C0LDJ.LIZ;
            c0lab.LIZ(i3, "hit_cache");
            c0lab.LIZ(!c1448240nn4.LJ ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c0lab.LIZ(c1448240nn4.LIZLLL ? 1 : 0, "is_auto_download");
            c0lab.LJ("prop_id", c1448240nn4.LIZ.getEffect_id());
            if (c1448420nnMZo != null) {
                i4 = c1448420nnMZo.LIZ;
            } else {
                i4 = 0;
            }
            c0lab.LIZ(i4, "lag_count");
            if (c1448420nnMZo != null) {
                i5 = c1448420nnMZo.LIZIZ;
            } else {
                i5 = 0;
            }
            c0lab.LIZ(i5, "lag_total_duration");
            if (c1448420nnMZo != null) {
                i6 = c1448420nnMZo.LIZJ;
            } else {
                i6 = 0;
            }
            c0lab.LIZ(i6, "sticker_duration");
            c0lab.LIZ(this.LLILZIL.isCarouselOpen ? 1 : 0, "is_from_carousel");
            c0lab.LJ("carousel_type", this.LLILZIL.carouselType);
            c0lab.LJFF("prop_apply_status", z);
            c0lab.LIZ(i2, "prop_apply_status_code");
            c0lab.LIZIZ(c1448240nn4.LIZ.getProvider(), "provider");
            c0lab.LIZIZ(c1448240nn4.LIZ.getPackage_size(), "package_size");
            c0lab.LJ("prop_type_name", "effect");
            ShortVideoContext shortVideoContext = this.LLILZIL;
            c0ldj.getClass();
            C0LDJ.LIZ(c0lab, shortVideoContext);
            C1448710nnp c1448710nnp = new C1448710nnp(getDiContainer(), getCameraApiComponent(), new C01GW<a>() { // from class: X.0nn6
                @Override // X.C01GW
                public final boolean isInitialized() {
                    return true;
                }

                @Override // X.C01GW
                public final a getValue() {
                    C385670FAf<a> c385670FAfEx;
                    InterfaceC1647420syK interfaceC1647420syK = (InterfaceC1647420syK) this.LL.getDiContainer().LJIIL(null, InterfaceC1647420syK.class);
                    if (interfaceC1647420syK == null || (c385670FAfEx = interfaceC1647420syK.ex()) == null) {
                        return null;
                    }
                    return c385670FAfEx.LIZJ();
                }
            });
            C23250099c.LIZLLL(c1448710nnp.LLJIJIL, null, null, new C858990Xmr(c1448710nnp, c0lab, new C1448220nn2(c0lab, c1448240nn4, this, j2), null), 3);
            this.LLJJ = null;
            this.LLJJJJ = false;
            if (C272910Amn.LIZ()) {
                this.LLJJI.remove(effect.getEffect_id());
            }
        }
    }
}
