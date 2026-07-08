package xbk;

import X.C01GW;
import X.C1286570jaJ;
import X.C1621410sIN;
import X.C1621480sIU;
import X.C1660560tJW;
import X.C19EG;
import X.C19GS;
import X.C1DHW;
import X.C1DHX;
import X.C1DIF;
import X.C1DIT;
import X.C1DKV;
import X.C1DLS;
import X.C1DMD;
import X.C204584153m;
import X.C20750516Hv;
import X.C2253301DHk;
import X.C452501pT;
import X.C650110Pej;
import X.EnumC2249691D3n;
import X.InterfaceC1437720nW6;
import X.InterfaceC1623210sLH;
import X.InterfaceC1631630sYr;
import X.InterfaceC1645720sva;
import X.InterfaceC1652760t6w;
import X.InterfaceC1652830t73;
import X.InterfaceC1660820tJw;
import X.InterfaceC1660900tK4;
import X.InterfaceC1673870tez;
import X.InterfaceC20520115Rf;
import X.InterfaceC2173471A4j;
import X.InterfaceC2186241AhK;
import X.InterfaceC2240011Clr;
import X.InterfaceC2253331DHn;
import X.InterfaceC2253811DJj;
import X.InterfaceC2253831DJl;
import X.InterfaceC2253851DJn;
import X.InterfaceC2254001DKc;
import X.InterfaceC2254011DKd;
import X.InterfaceC2254021DKe;
import X.InterfaceC2254051DKh;
import X.InterfaceC2254061DKi;
import X.InterfaceC2254081DKk;
import Y.AObjectS377S0100000_35;
import Y.AObjectS409S0100000_35;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes36.dex */
public final class f implements InterfaceC2254081DKk {
    public final LifecycleOwner LL;
    public final InterfaceC2254021DKe LLILLJJLI;
    public final Function0<InterfaceC20520115Rf> LLILLL;
    public final InterfaceC2253831DJl LLILZ;
    public final Function0<InterfaceC2254061DKi> LLILZIL;
    public final Function0<Context> LLILZLL;
    public final Function0<Boolean> LLIZ;
    public final Function1<Boolean, Unit> LLIZLLLIL;
    public final InterfaceC2253811DJj LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 422));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 421));
    public LifecycleOwner LLJILJIL;
    public C1DKV LLJILJILJ;
    public final C204584153m LLJILLL;
    public final CopyOnWriteArrayList<InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>> LLJJ;
    public final C20750516Hv LLJJI;
    public volatile boolean LLJJIII;
    public boolean LLJJIJI;

    @Override // X.InterfaceC2254081DKk
    public final Runnable getDataSourceVideoCompleteListener() {
        return null;
    }

    public final InterfaceC2254051DKh LIZIZ() {
        return (InterfaceC2254051DKh) this.LLJIJIL.getValue();
    }

    public final InterfaceC2254011DKd LIZJ() {
        return (InterfaceC2254011DKd) this.LLJI.getValue();
    }

    @Override // X.InterfaceC2254081DKk
    public final InterfaceC1660820tJw getAudioController() {
        return this.LLILLJJLI.getAudioController();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getBackCameraPos() {
        return this.LLILLJJLI.getCameraController().X3().LJI();
    }

    @Override // X.InterfaceC2254081DKk
    public final C1DHX getCameraController() {
        return this.LLILLJJLI.getCameraController();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getCameraPosition() {
        return this.LLILLJJLI.getCameraController().getCameraPosition();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getCameraPreviewHeight() {
        return this.LLILLJJLI.getCameraController().getCameraPreviewHeight();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getCameraPreviewWidth() {
        return this.LLILLJJLI.getCameraController().getCameraPreviewWidth();
    }

    @Override // X.InterfaceC2254081DKk
    public final List<Integer> getCameraZoomList() {
        return this.LLILLJJLI.getCameraController().getCameraZoomList();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getCurrentCameraType() {
        return this.LLILLJJLI.getCameraController().getCurrentCameraType();
    }

    @Override // X.InterfaceC2254081DKk
    public final InterfaceC1645720sva getEffectController() {
        return this.LLILLJJLI.getEffectController();
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean getExposureCompensationEnable() {
        return this.LLJJIJI && getCameraECInfo() != null && getCameraController().isSupportedExposureCompensation();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getFPS() {
        return this.LLJILLL.LL;
    }

    @Override // X.InterfaceC2254081DKk
    public final int getFlashMode() {
        return this.LLILLJJLI.getCameraController().getFlashMode();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getFrontCameraPos() {
        return this.LLILLJJLI.getCameraController().X3().LIZIZ();
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean getHasSetFocusAreas() {
        return this.LLILLJJLI.getCameraController().getHasSetFocusAreas();
    }

    @Override // X.InterfaceC2254081DKk
    public final long getInitRecorderTime() {
        return this.LLILLJJLI.LJIIJ().getInitRecorderTime();
    }

    @Override // X.InterfaceC2254081DKk
    public final float getMaxCameraZoom() {
        return this.LLILLJJLI.getCameraController().LJFF();
    }

    @Override // X.InterfaceC2254081DKk
    public final InterfaceC2254001DKc getMediaController() {
        return this.LLILLJJLI.getMediaController();
    }

    @Override // X.InterfaceC2254081DKk
    public final C1DKV getRecordContext() {
        C1DKV c1dkv = this.LLJILJILJ;
        if (c1dkv == null) {
            return null;
        }
        return c1dkv;
    }

    @Override // X.InterfaceC2254081DKk
    public final InterfaceC20520115Rf getViewFunction() {
        return this.LLILLL.invoke();
    }

    @Override // X.InterfaceC2254081DKk
    public final void init() {
        this.LLILLJJLI.LJIIJ().LJIIIIZZ();
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean Bh() {
        return getCameraController().e4();
    }

    @Override // X.InterfaceC2254081DKk
    public final void E0() {
        LIZIZ().E0();
    }

    @Override // X.InterfaceC2254081DKk
    public final void I0() {
        LIZJ().I0();
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean I4() {
        return getMediaController().I4();
    }

    @Override // X.InterfaceC2254081DKk
    public final void LJLL() {
        getMediaController().LJLL();
    }

    @Override // X.InterfaceC2254081DKk
    public final void M0() {
        LIZIZ().M0();
    }

    @Override // X.InterfaceC2254081DKk
    public final void R4() {
        getMediaController().R4();
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean fh() {
        return getCameraController().X3().LIZ();
    }

    @Override // X.InterfaceC2254081DKk
    public final C1286570jaJ getCameraECInfo() {
        return getCameraController().getCameraECInfo();
    }

    @Override // X.InterfaceC2254081DKk
    public final String getCameraTypeString() {
        return getCameraController().getCameraTypeString();
    }

    @Override // X.InterfaceC2254081DKk
    public final VEDisplaySettings getDisplayingSettings() {
        return getMediaController().s1();
    }

    @Override // X.InterfaceC2254081DKk
    public final long getEndFrameTimeUS() {
        return Math.max(getMediaController().getEndFrameTimeUS(), 0L);
    }

    @Override // X.InterfaceC2254081DKk
    public final VEMapBufferInfo getIntermediatePathFromEffect() {
        getMediaController().getIntermediatePathFromEffect();
        return null;
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean getIsExposureSeekBarShowing() {
        return LIZIZ().getIsExposureSeekBarShowing();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getLastFlashMode() {
        return getCameraController().getLastFlashMode();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getLastRecordFrameNum() {
        return getMediaController().getLastRecordFrameNum();
    }

    @Override // X.InterfaceC2254081DKk
    public final int getNextFlashMode() {
        return getCameraController().getNextFlashMode();
    }

    @Override // X.InterfaceC2254081DKk
    public final long getSegmentAudioLength() {
        return getMediaController().getSegmentAudioLength();
    }

    @Override // X.InterfaceC2254081DKk
    public final float[] getSuggestVolume() {
        return getMediaController().getSuggestVolume();
    }

    @Override // X.InterfaceC2254081DKk
    public final void jh() {
        LIZJ().jh();
    }

    @Override // X.InterfaceC2254081DKk
    public final void lk() {
        getEffectController().lk();
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean n() {
        return getCameraController().X3().n();
    }

    @Override // X.InterfaceC2254081DKk
    public final void ph() {
        if (getCameraController().N4() == 1) {
            getCameraController().L4(0);
            getCameraController().h4(C1DIT.BACK_PRIMARY);
        } else {
            getCameraController().L4(1);
            getCameraController().h4(C1DIT.FRONT_PRIMARY);
        }
    }

    @Override // X.InterfaceC2254081DKk
    public final void t1() {
        getMediaController().t1();
    }

    @Override // X.InterfaceC2254081DKk
    public final LifecycleOwner getLifecycleOwner() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC2254081DKk
    public final InterfaceC2253831DJl oh() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC2254081DKk
    public final void Dh(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super String, ? super VERecorder, Unit> interfaceC1631630sYr) {
        this.LLJJ.remove(interfaceC1631630sYr);
    }

    @Override // X.InterfaceC2254081DKk
    public final void E4(boolean z) {
        getMediaController().E4(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void G0(InterfaceC1437720nW6 interfaceC1437720nW6) {
        LIZJ().G0(interfaceC1437720nW6);
    }

    @Override // X.InterfaceC2254081DKk
    public final void H4(Function1<? super Integer, Unit> function1) {
        getMediaController().H4(function1);
    }

    @Override // X.InterfaceC2254081DKk
    public final void J0(boolean z) {
        LIZIZ().J0(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean K(boolean z) {
        return getCameraController().X3().K(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void K0(InterfaceC2253851DJn interfaceC2253851DJn) {
        LIZJ().K0(interfaceC2253851DJn);
    }

    @Override // X.InterfaceC2254081DKk
    public final void K4(C1DLS c1dls) {
        getMediaController().K4(c1dls);
    }

    @Override // X.InterfaceC2254081DKk
    public final void L0(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super String, ? super VERecorder, Unit> interfaceC1631630sYr) {
        this.LLJJ.add(interfaceC1631630sYr);
    }

    @Override // X.InterfaceC2254081DKk
    public final void LIZ(int i) {
        getCameraController().LIZ(i);
    }

    @Override // X.InterfaceC2254081DKk
    public final void LJLJLLL(Surface surface) {
        getMediaController().LJLJLLL(surface);
    }

    @Override // X.InterfaceC2254081DKk
    public final void M2(boolean z) {
        getCameraController().M2(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void N0(InterfaceC2253851DJn interfaceC2253851DJn) {
        LIZJ().N0(interfaceC2253851DJn);
    }

    @Override // X.InterfaceC2254081DKk
    public final boolean N4(String str) {
        return getMediaController().N4(str);
    }

    @Override // X.InterfaceC2254081DKk
    public final void O3(int i) {
        getCameraController().O3(i);
    }

    @Override // X.InterfaceC2254081DKk
    public final void O4(C1DLS c1dls) {
        getMediaController().O4(c1dls);
    }

    @Override // X.InterfaceC2254081DKk
    public final void Qa(boolean z) {
        getEffectController().Qa(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void R3(int i) {
        getCameraController().R3(i);
    }

    @Override // X.InterfaceC2254081DKk
    public final void Ra(boolean z) {
        getEffectController().Ra(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void U3(Cert cert) {
        getCameraController().U3(cert);
    }

    @Override // X.InterfaceC2254081DKk
    public final void enableAudio(boolean z) {
        getMediaController().enableAudio(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void enableEffect(boolean z) {
        getEffectController().enableEffect(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void gh(AwS604S0100000_25 awS604S0100000_25) {
        LIZJ().gh(awS604S0100000_25);
    }

    @Override // X.InterfaceC2254081DKk
    public final void hh(InterfaceC2186241AhK interfaceC2186241AhK) {
        LIZJ().hh(interfaceC2186241AhK);
    }

    @Override // X.InterfaceC2254081DKk
    public final void ih(InterfaceC1652830t73 interfaceC1652830t73) {
        LIZJ().ih(interfaceC1652830t73);
    }

    @Override // X.InterfaceC2254081DKk
    public final void kh(InterfaceC2186241AhK interfaceC2186241AhK) {
        LIZJ().kh(interfaceC2186241AhK);
    }

    @Override // X.InterfaceC2254081DKk
    public final void lh(InterfaceC1652830t73 interfaceC1652830t73) {
        LIZJ().lh(interfaceC1652830t73);
    }

    @Override // X.InterfaceC2254081DKk
    public final void mh(InterfaceC1437720nW6 interfaceC1437720nW6) {
        LIZJ().mh(interfaceC1437720nW6);
    }

    @Override // X.InterfaceC2254081DKk
    public final void mk(InterfaceC1623210sLH interfaceC1623210sLH) {
        getEffectController().mk(interfaceC1623210sLH);
    }

    @Override // X.InterfaceC2254081DKk
    public final void pauseEffectAudio(boolean z) {
        getEffectController().pauseEffectAudio(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void qh(C650110Pej c650110Pej) {
        getEffectController().Wn();
    }

    @Override // X.InterfaceC2254081DKk
    public final void setARCoreParam(boolean z) {
        new VEARCoreParam().setEnableARCore(z);
        getEffectController().ko();
    }

    @Override // X.InterfaceC2254081DKk
    public final void setAudioCaptureDevice(C1621480sIU c1621480sIU) {
        getAudioController().LJ().setAudioDevice(c1621480sIU);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setAudioDevice(boolean z) {
        this.LLILZ.LIZIZ().LIZIZ.getClass();
    }

    @Override // X.InterfaceC2254081DKk
    public final void setBodyBeautyLevel(int i) {
        getCameraController().setBodyBeautyLevel(i);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setCameraPreviewSizeInterface(C1DIF c1dif) {
        getCameraController().setCameraPreviewSizeInterface(c1dif);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setCloseCameraListener(Function0<Unit> function0) {
        getCameraController().E4(function0);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr) {
        getCameraController().setControllerCallback(interfaceC2240011Clr);
        getMediaController().setControllerCallback(interfaceC2240011Clr);
        getAudioController().setControllerCallback(interfaceC2240011Clr);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setDataSourceVideoCompleteListener(Runnable runnable) {
        this.LLILLJJLI.LJ().LIZIZ(runnable);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setDetectInterval(int i) {
        getEffectController().setDetectInterval(i);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setDeviceRotation(int i) {
        getCameraController().Q3();
    }

    @Override // X.InterfaceC2254081DKk
    public final void setDuetSupportChangeLayout(boolean z) {
        this.LLJ.LIZJ();
    }

    @Override // X.InterfaceC2254081DKk
    public final void setExposureCompensation(int i) {
        getCameraController().setExposureCompensation(i);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setExposureCompensationEnable(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC2254081DKk
    public final void setExposureSeekBarProgress(float f) {
        LIZIZ().setExposureSeekBarProgress(f);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setFilter(String str) {
        getEffectController().setFilter(str);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setHandDetectLowpower(boolean z) {
        getEffectController().setHandDetectLowpower(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLJILJIL = lifecycleOwner;
    }

    @Override // X.InterfaceC2254081DKk
    public final void setMusicPath(String str) {
        getMediaController().w5();
    }

    @Override // X.InterfaceC2254081DKk
    public final void setRecordMaxDuration(long j) {
        getMediaController().setRecordMaxDuration(j);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setRecordMode(EnumC2249691D3n enumC2249691D3n) {
        getCameraController().setRecordMode(enumC2249691D3n);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setSATZoomListener(InterfaceC1673870tez interfaceC1673870tez) {
        getCameraController().setSATZoomListener(interfaceC1673870tez);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setSensitiveApiCallback(InterfaceC1660900tK4 interfaceC1660900tK4) {
        getCameraController().setSensitiveApiCallback(interfaceC1660900tK4);
        getAudioController().setSensitiveApiCallback(interfaceC1660900tK4);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setUseAudioGraph(boolean z) {
        getAudioController().LIZIZ();
    }

    @Override // X.InterfaceC2254081DKk
    public final void wh(boolean z) {
        this.LLILZIL.invoke().LIZJ(z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void xh(C1621410sIN c1621410sIN) {
        getAudioController().LJII(c1621410sIN);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setAudioDevice(C1621480sIU c1621480sIU) {
        getAudioController().setAudioDevice(c1621480sIU);
    }

    @Override // X.InterfaceC2254081DKk
    public final int Ch(C19GS c19gs, InterfaceC1652760t6w interfaceC1652760t6w) {
        getMediaController().B5();
        return 0;
    }

    @Override // X.InterfaceC2254081DKk
    public final void F4(Function1 function1, boolean z) {
        getMediaController().F4(function1, z);
    }

    @Override // X.InterfaceC2254081DKk
    public final void H0(int i, int i2) {
        LIZIZ().H0(i, i2);
    }

    @Override // X.InterfaceC2254081DKk
    public final void S4(Function0 function0, Function1 function1) {
        getMediaController().S4(function0, function1);
    }

    @Override // X.InterfaceC2254081DKk
    public final void nh(float f, float f2) {
        LIZIZ().nh(f, f2);
    }

    @Override // X.InterfaceC2254081DKk
    public final void rh(C1DMD c1dmd, String str) {
        this.LLILLJJLI.LJIIJ().LJII(c1dmd);
    }

    @Override // X.InterfaceC2254081DKk
    public final void setRenderCacheString(String str, String str2) {
        getEffectController().setRenderCacheString(str, str2);
    }

    @Override // X.InterfaceC2254081DKk
    public final void th(Cert cert, boolean z) {
        if (this.LLJJIII != z) {
            this.LLJJIII = z;
            getMediaController().X4(cert, z);
        }
    }

    @Override // X.InterfaceC2254081DKk
    public final int uh(C19EG c19eg, InterfaceC1652760t6w interfaceC1652760t6w) {
        getMediaController().U4();
        return 0;
    }

    @Override // X.InterfaceC2254081DKk
    public final void zh(C1DKV c1dkv, C2253301DHk c2253301DHk) {
        this.LLJILJILJ = c1dkv;
        this.LLILLJJLI.LJIILIIL().L0(this.LLJJI);
    }

    @Override // X.InterfaceC2254081DKk
    public final void Ah(Surface surface, String str, Function1<? super Integer, Unit> function1) {
        getMediaController().b5(surface, function1);
    }

    @Override // X.InterfaceC2254081DKk
    public final void LJLJL(int i, int i2, InterfaceC2173471A4j interfaceC2173471A4j) {
        getEffectController().LJLJL(i, i2, interfaceC2173471A4j);
    }

    @Override // X.InterfaceC2254081DKk
    public final void P4(String str, double d, Function1<? super Integer, Unit> function1) {
        getMediaController().P4(str, d, function1);
    }

    @Override // X.InterfaceC2254081DKk
    public final void nk(String[] strArr, double[] dArr, boolean[] zArr) {
        getEffectController().nk(strArr, dArr, zArr);
    }

    @Override // X.InterfaceC2254081DKk
    public final int n4(String str, int i, int i2, Function1<? super Integer, Unit> function1) {
        getMediaController().n4(str, i, i2, function1);
        return 0;
    }

    @Override // X.InterfaceC2254081DKk
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        getEffectController().sendEffectMsg(i, j, j2, str);
    }

    @Override // X.InterfaceC2254081DKk
    public final void sh(C1660560tJW c1660560tJW, Function1 function1, final InterfaceC2253331DHn interfaceC2253331DHn, Cert cert) {
        G0(new InterfaceC1437720nW6() { // from class: X.1DKg
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str) {
                if (i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
                    C0CNO.LIZLLL(0L, new AwS579S0100000_35(interfaceC2253331DHn, 423));
                    this.LL.mh(this);
                } else {
                    if (i != VEInfo.TE_INFO_FIRST_FRAME_AFTER_SURFACE_CHANGED) {
                        return;
                    }
                    C0CNO.LIZLLL(300L, new AwS579S0100000_35(interfaceC2253331DHn, 424));
                    this.LL.mh(this);
                }
            }
        });
        getCameraController().y4(c1660560tJW, function1);
    }

    @Override // X.InterfaceC2254081DKk
    public final void vh(long j, long j2, long j3, int i, String str, boolean z) {
        G4(str, j, j2, z, false, false, i, j3);
    }

    @Override // X.InterfaceC2254081DKk
    public final void yh(double d, boolean z, float f, int i, int i2, AwS581S0100000_2 awS581S0100000_2) {
        getMediaController().Q5(d, awS581S0100000_2);
    }

    @Override // X.InterfaceC2254081DKk
    public final void F0(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, Function1<? super Integer, Unit> function1, boolean z2) {
        getMediaController().F0(str, i, i2, z, compressFormat, function1, z2);
    }

    public f(LifecycleOwner lifecycleOwner, C1DHW c1dhw, AObjectS409S0100000_35 aObjectS409S0100000_35, InterfaceC2253831DJl interfaceC2253831DJl, AObjectS409S0100000_35 aObjectS409S0100000_352, AObjectS409S0100000_35 aObjectS409S0100000_353, AObjectS409S0100000_35 aObjectS409S0100000_354, AObjectS377S0100000_35 aObjectS377S0100000_35) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c1dhw;
        this.LLILLL = aObjectS409S0100000_35;
        this.LLILZ = interfaceC2253831DJl;
        this.LLILZIL = aObjectS409S0100000_352;
        this.LLILZLL = aObjectS409S0100000_353;
        this.LLIZ = aObjectS409S0100000_354;
        this.LLIZLLLIL = aObjectS377S0100000_35;
        this.LLJ = c1dhw.LJ();
        this.LLJILJIL = lifecycleOwner;
        C204584153m c204584153m = new C204584153m();
        this.LLJILLL = c204584153m;
        CopyOnWriteArrayList<InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(c204584153m);
        this.LLJJ = copyOnWriteArrayList;
        this.LLJJI = new C20750516Hv(this, 4);
    }

    @Override // X.InterfaceC2254081DKk
    public final void G4(String str, long j, long j2, boolean z, boolean z2, boolean z3, int i, long j3) {
        getMediaController().G4(str, j, j2, z, z2, z3, i, j3);
    }
}
