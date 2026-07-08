package com.ss.android.ugc.gamora.recorder.ttsreuse;

import X.AbstractC1252750ihl;
import X.AbstractC21664519qV;
import X.AbstractC2255721DQs;
import X.C004I;
import X.C05WW;
import X.C05YF;
import X.C09R3;
import X.C0CHQ;
import X.C0ETY;
import X.C0FI2;
import X.C0JAI;
import X.C0LCS;
import X.C0MGL;
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
import X.C124G;
import X.C124Q;
import X.C1389880mGw;
import X.C13BV;
import X.C13LE;
import X.C1602160rnK;
import X.C1634100scq;
import X.C1644460stY;
import X.C1664590tQ1;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C1765020w20;
import X.C196925122x;
import X.C19A3;
import X.C1D40;
import X.C1DRG;
import X.C2217381BqS;
import X.C2254451DLv;
import X.C2354709Kn;
import X.C343070Dcf;
import X.C363400EMo;
import X.C385670FAf;
import X.C786410Ut5;
import X.EnumC1647570syZ;
import X.InterfaceC1166920gTK;
import X.InterfaceC1441305kZ;
import X.InterfaceC1628590sTx;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1646950sxZ;
import X.InterfaceC1648020szI;
import X.InterfaceC1648510t05;
import X.InterfaceC1648570t0B;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS14S0400000_5;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class d extends AbstractC2255721DQs<InterfaceC1646950sxZ> implements InterfaceC1646950sxZ, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public String LLJIJIL;
    public ViewGroup LLJILJIL;
    public C196925122x LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0MGL.class, null);
    public final a LLIZ = (a) getDiContainer().LJII(a.class, null);
    public final InterfaceC1648570t0B LLIZLLLIL = (InterfaceC1648570t0B) getDiContainer().LJII(InterfaceC1648570t0B.class, null);
    public final InterfaceC1648020szI LLJ = (InterfaceC1648020szI) getDiContainer().LJII(InterfaceC1648020szI.class, null);
    public final List<Integer> LLJI = new ArrayList();
    public final List<String> LLJJIJI = C1697810uHb.LJIILJJIL(EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), EnumC1647570syZ.RECORD_COMBINE_180.getTag(), EnumC1647570syZ.RECORD_COMBINE_600.getTag(), EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag(), EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag());
    public final List<String> LLJJIJIIJIL = C1697810uHb.LJIILJJIL(EnumC1647570syZ.RECORD_NOW.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(d.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(d.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(d.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJJ = 8;
    }

    public InterfaceC1646950sxZ G2() {
        return this;
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

    @Override // X.InterfaceC1646950sxZ
    public synchronized void vY0() {
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo2;
        List<TtsReuseModel> list2;
        ShortVideoContext shortVideoContext2;
        CreativeModel creativeModel3;
        TtsVoiceInfo ttsVoiceInfo3;
        if (this.LLJJI || this.LLJJIII) {
            return;
        }
        ShortVideoContext shortVideoContext3 = getShortVideoContext();
        if (shortVideoContext3 == null || shortVideoContext3.shootMode != 16) {
            ShortVideoContext shortVideoContext4 = getShortVideoContext();
            if (shortVideoContext4 != null && (creativeModel2 = shortVideoContext4.creativeModel) != null && (ttsVoiceInfo2 = creativeModel2.ttsVoiceInfo) != null && (list2 = ttsVoiceInfo2.ttsReuseParamsOrigin) != null && (shortVideoContext2 = getShortVideoContext()) != null && (creativeModel3 = shortVideoContext2.creativeModel) != null && (ttsVoiceInfo3 = creativeModel3.ttsVoiceInfo) != null) {
                ttsVoiceInfo3.setTtsReuseParams(list2);
            }
            this.LLJJI = true;
            e0 cameraApiComponent = getCameraApiComponent();
            if (cameraApiComponent != null && (shortVideoContext = getShortVideoContext()) != null && (creativeModel = shortVideoContext.creativeModel) != null && (ttsVoiceInfo = creativeModel.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null) {
                for (TtsReuseModel ttsReuseModel : list) {
                    String strLIZIZ = C05WW.LIZ.LIZIZ(ttsReuseModel.textStr, C123100dR.LIZ(ttsReuseModel.streamSpeakerId) ? ttsReuseModel.streamSpeakerId : ttsReuseModel.speakerId);
                    if (strLIZIZ == null || strLIZIZ.length() == 0 || !C2354709Kn.LIZIZ(strLIZIZ)) {
                        break;
                    }
                    int iIntValue = ttsReuseModel.startTime;
                    int i = ttsReuseModel.endTime;
                    int iIntValue2 = i - iIntValue;
                    if (i <= 0) {
                        ShortVideoContext shortVideoContext5 = getShortVideoContext();
                        Pair<Integer, Integer> pairX1 = X1(iIntValue, shortVideoContext5 != null ? Integer.valueOf((int) shortVideoContext5.LJIILIIL()) : null, strLIZIZ);
                        iIntValue = pairX1.getFirst().intValue();
                        iIntValue2 = pairX1.getSecond().intValue();
                    }
                    if (iIntValue2 <= 0 || iIntValue < 0) {
                        return;
                    }
                    int i2 = iIntValue2 + iIntValue;
                    ttsReuseModel.setStartTime(iIntValue);
                    ttsReuseModel.setEndTime(i2);
                    C2254451DLv c2254451DLv = new C2254451DLv();
                    c2254451DLv.LIZ(strLIZIZ);
                    c2254451DLv.LJ(0);
                    c2254451DLv.LJFF(i2 - iIntValue);
                    c2254451DLv.LIZIZ(iIntValue);
                    c2254451DLv.LIZJ(i2);
                    C1D40 c1d40 = C1D40.External;
                    VETrackParams vETrackParams = c2254451DLv.LIZ;
                    vETrackParams.trackPriority = c1d40;
                    this.LLJI.add(Integer.valueOf(cameraApiComponent.wn1(1, vETrackParams)));
                }
            }
        }
    }

    private final C0MGL H2() {
        return (C0MGL) this.LLILZLL.getValue(this, LLJJIJIL[3]);
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLJJIJIL[0]);
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLILZ.getValue(this, LLJJIJIL[1]);
    }

    private final void v3() {
        this.LLIZLLLIL.lC2().LIZ(this, new AObjectS246S0100000_25(this, 639));
        this.LLIZLLLIL.Un1().LIZ(this, new AObjectS246S0100000_25(this, 640));
        this.LLIZLLLIL.yM2().LIZ(this, new AObjectS246S0100000_25(this, 641));
        this.LLJ.getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 642));
    }

    @Override // X.InterfaceC1646950sxZ
    public void SQ() {
        C196925122x c196925122x;
        if (this.LLJJ && (c196925122x = this.LLJILJILJ) != null) {
            ViewGroup viewGroup = this.LLJILJIL;
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(c196925122x, viewGroup);
            }
            this.LLJJ = false;
        }
    }

    public final void T2() {
        this.LLIZLLLIL.me2().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0tGP
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        });
        this.LLJ.getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 637));
    }

    public final void W2() {
        C1389880mGw c1389880mGw = new C1389880mGw(C1664590tQ1.LJII(this));
        c1389880mGw.LJIIIZ("This sound contains text-to-speech");
        c1389880mGw.LJIIJ();
        vY0();
        q3();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLJJIJIL[2]);
    }

    @Override // X.InterfaceC1646950sxZ
    public void hb0() {
        CreativeModel creativeModel;
        TtsVoiceInfo ttsVoiceInfo;
        Iterator<Integer> it2 = this.LLJI.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            e0 cameraApiComponent = getCameraApiComponent();
            if (cameraApiComponent != null) {
                cameraApiComponent.lo1(1, iIntValue);
            }
        }
        this.LLJI.clear();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (ttsVoiceInfo = creativeModel.ttsVoiceInfo) != null) {
            ttsVoiceInfo.setTtsReuseParams(C13BV.INSTANCE);
        }
        this.LLJJI = false;
    }

    private final void q3() {
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1628590sTx.class, new AwS604S0100000_25(this, 409));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1628590sTx.class);
        if (c05yf != null) {
            InterfaceC1628590sTx interfaceC1628590sTx = (InterfaceC1628590sTx) c05yf;
            interfaceC1628590sTx.Wv().LIZ(this, new AObjectS306S0200000_25((Object) interfaceC1628590sTx, (Object) this, (InterfaceC1648570t0B) 21));
            interfaceC1628590sTx.Vk().LIZ(this, new AObjectS246S0100000_25(this, 638));
        }
    }

    public final boolean Z1() {
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        TtsVoiceInfo ttsVoiceInfo;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo2;
        CreativeModel creativeModel3;
        TtsVoiceInfo ttsVoiceInfo3;
        List<TtsReuseModel> list;
        Effect effectLIZJ;
        CreativeModel creativeModel4;
        TtsVoiceInfo ttsVoiceInfo4;
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        List<TtsReuseModel> list2 = (shortVideoContext2 == null || (creativeModel4 = shortVideoContext2.creativeModel) == null || (ttsVoiceInfo4 = creativeModel4.ttsVoiceInfo) == null) ? null : ttsVoiceInfo4.ttsReuseParams;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        ShortVideoContext shortVideoContext3 = getShortVideoContext();
        boolean z = (shortVideoContext3 == null || !shortVideoContext3.mIsFromDraft) && ((shortVideoContext = getShortVideoContext()) == null || !shortVideoContext.cameraComponentModel.isRetakeMode);
        ShortVideoContext shortVideoContext4 = getShortVideoContext();
        if (shortVideoContext4 != null && (creativeModel3 = shortVideoContext4.creativeModel) != null && (ttsVoiceInfo3 = creativeModel3.ttsVoiceInfo) != null && (list = ttsVoiceInfo3.ttsReuseParams) != null) {
            for (TtsReuseModel ttsReuseModel : list) {
                String str = C123100dR.LIZ(ttsReuseModel.streamSpeakerId) ? ttsReuseModel.streamSpeakerId : ttsReuseModel.speakerId;
                C05WW c05ww = C05WW.LIZ;
                String strLIZIZ = c05ww.LIZIZ(ttsReuseModel.textStr, str);
                if (strLIZIZ == null || strLIZIZ.length() == 0 || !C2354709Kn.LIZIZ(strLIZIZ) || (effectLIZJ = c05ww.LIZJ(ttsReuseModel.voiceResId)) == null) {
                    z = false;
                } else {
                    ttsReuseModel.setVoiceEffectId(effectLIZJ.getEffectId());
                }
            }
        }
        if (!z) {
            ShortVideoContext shortVideoContext5 = getShortVideoContext();
            if (shortVideoContext5 != null && (creativeModel2 = shortVideoContext5.creativeModel) != null && (ttsVoiceInfo2 = creativeModel2.ttsVoiceInfo) != null) {
                ttsVoiceInfo2.setTtsReuseParams(C13BV.INSTANCE);
            }
            ShortVideoContext shortVideoContext6 = getShortVideoContext();
            if (shortVideoContext6 != null && (creativeModel = shortVideoContext6.creativeModel) != null && (ttsVoiceInfo = creativeModel.ttsVoiceInfo) != null) {
                ttsVoiceInfo.setTtsReuseParamsOrigin(C13BV.INSTANCE);
            }
        }
        return z;
    }

    @Override // X.InterfaceC1646950sxZ
    public void Zi2() {
        CreativeModel creativeModel;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        TextStickerData textStickerDataW2;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if ((shortVideoContext != null && shortVideoContext.shootMode == 16) || this.LLJJ || this.LLJJIII) {
            return;
        }
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        if (shortVideoContext2 == null || !shortVideoContext2.cameraComponentModel.isRetakeMode) {
            C196925122x c196925122x = this.LLJILJILJ;
            if (c196925122x != null) {
                ViewGroup viewGroup = this.LLJILJIL;
                if (viewGroup != null) {
                    viewGroup.addView(c196925122x);
                }
                this.LLJJ = true;
                return;
            }
            ShortVideoContext shortVideoContext3 = getShortVideoContext();
            TtsReuseModel next = null;
            if (shortVideoContext3 == null || (creativeModel = shortVideoContext3.creativeModel) == null || (ttsVoiceInfo = creativeModel.ttsVoiceInfo) == null || (list = ttsVoiceInfo.ttsReuseParams) == null) {
                return;
            }
            Iterator<TtsReuseModel> it2 = list.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i = next.startTime;
                    do {
                        TtsReuseModel next2 = it2.next();
                        int i2 = next2.startTime;
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it2.hasNext());
                }
            }
            TtsReuseModel ttsReuseModel = next;
            if (ttsReuseModel == null || (textStickerDataW2 = w2(ttsReuseModel)) == null) {
                return;
            }
            this.LLJJ = true;
            m3(textStickerDataW2, new AwS460S0200000_25(this, textStickerDataW2, 21));
        }
    }

    public final void i3() {
        vY0();
        Zi2();
        v3();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventWG;
        C385670FAf<Boolean> c385670FAfA31;
        super.onCreate();
        e0 cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent != null && (c385670FAfA31 = cameraApiComponent.A31()) != null) {
            c385670FAfA31.LIZ(this, new AObjectS246S0100000_25(this, 643));
        }
        C0MGL c0mglH2 = H2();
        if (c0mglH2 == null || (liveEventWG = c0mglH2.wG()) == null) {
            return;
        }
        liveEventWG.LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 644));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        ShortVideoContext shortVideoContext;
        super.onResume();
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        if ((shortVideoContext2 == null || !shortVideoContext2.cameraComponentModel.isRetakeMode) && ((shortVideoContext = getShortVideoContext()) == null || !shortVideoContext.cameraComponentModel.isEditorProRecordMode)) {
            return;
        }
        SQ();
    }

    public final void c3() {
        vY0();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        G2();
        return this;
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

    private final TextStickerData w2(TtsReuseModel ttsReuseModel) {
        Effect effectLIZ = C05WW.LIZ.LIZ(ttsReuseModel.fontResId);
        TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        textStickerData.setGuidanceSticker(true);
        textStickerData.setStartTime(ttsReuseModel.startTime);
        textStickerData.setEndTime(ttsReuseModel.endTime);
        textStickerData.setX(C363400EMo.LIZJ(ttsReuseModel.transformX) * C0JAI.LIZJ(C1664590tQ1.LJII(this)));
        textStickerData.setY(C363400EMo.LIZLLL(ttsReuseModel.transformY) * C0JAI.LIZIZ(C1664590tQ1.LJII(this)));
        textStickerData.setScale(ttsReuseModel.scale);
        textStickerData.setRotation(ttsReuseModel.rotation);
        textStickerData.setTextStr(ttsReuseModel.textStr);
        textStickerData.setBgMode(ttsReuseModel.bgMode);
        textStickerData.setColor(ttsReuseModel.color);
        textStickerData.setAlign(ttsReuseModel.align);
        if (effectLIZ != null) {
            textStickerData.setFontId(effectLIZ.getEffectId());
            textStickerData.setFontPath(effectLIZ.getUnzipPath());
            textStickerData.setFontResId(effectLIZ.getResourceId());
            textStickerData.setFontType(((TextFontStyleData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), effectLIZ.getExtra(), TextFontStyleData.class)).fileName);
            return textStickerData;
        }
        textStickerData.setFontType("default");
        return textStickerData;
    }

    public final void B3(final C196925122x c196925122x) {
        InterfaceC1648510t05 gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.AL1(new AbstractC21664519qV() { // from class: X.0tGQ
                @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                public final boolean onUp(MotionEvent motionEvent) {
                    return c196925122x.LJJIFFI(motionEvent);
                }
            }, 19, 50);
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public final C196925122x o2(TextStickerData textStickerData) {
        return new C196925122x(C1664590tQ1.LJIIIZ(this), new SafeHandler(this.LL), textStickerData, false, new C124G() { // from class: X.0tGR
            @Override // X.C124G
            public final boolean LIZ() {
                return false;
            }
        }, Boolean.FALSE, getDiContainer(), Boolean.TRUE);
    }

    public d(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    private final void m3(TextStickerData textStickerData, Function2<? super TextStickerTextWrap, ? super Integer, Unit> function2) {
        C124Q c124q = new C124Q(C1664590tQ1.LJIIIZ(this), null);
        int visibility = c124q.getVisibility();
        c124q.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c124q);
        int iLIZ = (int) C0JAI.LIZ(32.0f, c124q.getContext());
        int iLIZ2 = (int) C0JAI.LIZ(12.0f, c124q.getContext());
        c124q.setPadding(iLIZ, iLIZ2, iLIZ, iLIZ2);
        c124q.setTextSize(1, textStickerData.getFontSize());
        c124q.setFontType(C0FI2.LJIJJ().LJJ(textStickerData.getFontType()));
        c124q.setAligin(textStickerData.getAlign());
        c124q.setText(textStickerData.getTextStr());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            viewGroup.addView(c124q, layoutParams);
        }
        HandlerHook.viewPost(c124q, new ARunnableS14S0400000_5(c124q, textStickerData, this, function2, 3));
    }

    public final void W1(TextStickerData textStickerData, int i) {
        float fLIZIZ = C0JAI.LIZIZ(C1664590tQ1.LJII(this));
        float y = textStickerData.getY() / fLIZIZ;
        double d = y;
        double d2 = ((double) (i - 1)) * 0.04d;
        double d3 = 0.65d - d2;
        if (d > d3) {
            y = Math.max((float) d3, 0.5f);
        } else {
            double d4 = d2 + 0.18d;
            if (d < d4) {
                y = Math.min((float) d4, 0.5f);
            }
        }
        textStickerData.setY(y * fLIZIZ);
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    private final Pair<Integer, Integer> X1(int i, Integer num, String str) {
        VEUtils.VEAudioFileInfo audioFileInfo;
        Integer numValueOf = null;
        if (str != null && (audioFileInfo = VEUtils.getAudioFileInfo(str)) != null) {
            numValueOf = Integer.valueOf(audioFileInfo.duration);
        }
        if (num == null) {
            if (numValueOf == null) {
                return new Pair<>(-1, -1);
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(numValueOf.intValue() - i));
        }
        if (numValueOf == null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        if (num.intValue() + i <= numValueOf.intValue()) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(Math.max(num.intValue() - i, 0)));
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
