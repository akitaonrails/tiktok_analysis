package com.ss.android.ugc.aweme.shortvideo.ui.component;

import X.C092O;
import X.C0ABZ;
import X.C0AC9;
import X.C0ASS;
import X.C0AT9;
import X.C0BNF;
import X.C0BNG;
import X.C0C64;
import X.C0CHQ;
import X.C0IKQ;
import X.C0LAB;
import X.C0LG8;
import X.C0LH8;
import X.C0WZX;
import X.C12ES;
import X.C1439190nYT;
import X.C1445850njD;
import X.C1448790nnx;
import X.C1452420nto;
import X.C1499900p8O;
import X.C1624550sNR;
import X.C1637890six;
import X.C1638720skI;
import X.C1643880ssc;
import X.C1645090suZ;
import X.C1651700t5E;
import X.C1655760tBm;
import X.C1656740tDM;
import X.C1658290tFr;
import X.C1660530tJT;
import X.C1660540tJU;
import X.C1660560tJW;
import X.C1660690tJj;
import X.C1661480tL0;
import X.C1784280wX4;
import X.C1894607bU;
import X.C19573611i2;
import X.C196998125s;
import X.C19731412Hw;
import X.C19GS;
import X.C1A64;
import X.C1C7U;
import X.C1DI3;
import X.C1DI4;
import X.C1DKV;
import X.C1DLQ;
import X.C1DPV;
import X.C1DPW;
import X.C1DPX;
import X.C1DRG;
import X.C20102213l6;
import X.C201955140j;
import X.C201967140v;
import X.C20622515mp;
import X.C2177921ALm;
import X.C2187101Aii;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2216131BoR;
import X.C2216141BoS;
import X.C2216161BoU;
import X.C2219091BtD;
import X.C2252941DGa;
import X.C2253081DGo;
import X.C2253401DHu;
import X.C2254091DKl;
import X.C2265108u9;
import X.C2298108zT;
import X.C2341909Fp;
import X.C2477509nJ;
import X.C2484209oO;
import X.C262960ASg;
import X.C263090ASt;
import X.C280780AzU;
import X.C290870Baf;
import X.C385670FAf;
import X.C524780Ki4;
import X.C537670L6v;
import X.C538770LBb;
import X.C540290LGx;
import X.C543670LTx;
import X.C560530Lyd;
import X.C578100Mls;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C857540XkW;
import X.EnumC1448590nnd;
import X.EnumC1641610sox;
import X.EnumC1660550tJV;
import X.EnumC19367310pr;
import X.EnumC1985407q8;
import X.InterfaceC1463990oCT;
import X.InterfaceC1622160sJa;
import X.InterfaceC1625720sPK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1656270tCb;
import X.InterfaceC2177841ALe;
import X.InterfaceC2187111Aij;
import X.InterfaceC2208871Bcj;
import X.InterfaceC2253001DGg;
import X.InterfaceC2253331DHn;
import X.InterfaceC2253441DHy;
import X.InterfaceC2253451DHz;
import X.InterfaceC2253521DIg;
import X.InterfaceC2254081DKk;
import X.InterfaceC2342209Fs;
import Y.AObjectS130S0000000_35;
import Y.AObjectS409S0100000_35;
import Y.AObjectS82S0000000_35;
import Y.ARunnableS135S0100000_35;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.Surface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import bnj.a;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.creation.FFDEventReport;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.performance.OpenCameraStep;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.record.k2;
import com.ss.android.ugc.aweme.shortvideo.record.o2;
import com.ss.android.ugc.aweme.shortvideo.record.v1;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.component.b1;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitorV2;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenCameraLatencyMonitor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import dtj.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS152S0201000_35;
import lth.o;
import mn3.e0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public class b1 extends C2253401DHu<e0> implements e0 {
    public bck.u d;
    public CreativeInfo e;
    public FFDEventReport f;
    public boolean g;
    public final C560530Lyd<Unit> h;
    public final C560530Lyd<Unit> i;
    public final h0<EnumC1448590nnd> j;
    public final MutableLiveData<Boolean> k;
    public boolean l;
    public boolean m;
    public Bundle n;
    public boolean o;
    public final C560530Lyd<Unit> p;
    public boolean q;
    public final Handler r;
    public Runnable s;
    public long t;
    public InterfaceC2253001DGg u;
    public boolean v;
    public boolean w;

    public static /* synthetic */ boolean lf(C1452420nto c1452420nto) {
        c1452420nto.getClass();
        return C1452420nto.LIZ();
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public boolean Tc2(boolean z) {
        return false;
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public boolean WE1(boolean z, boolean z2) {
        return false;
    }

    private void Ae() {
        File fileLJ = this.LLLIL.mWorkspace.LJ();
        if (fileLJ.exists()) {
            if (!fileLJ.exists() || !fileLJ.isDirectory()) {
                return;
            }
            if (fileLJ.listFiles() != null && fileLJ.listFiles().length != 0) {
                return;
            }
        }
        for (int i = 0; i < this.LLLIL.LIZIZ().size(); i++) {
            St2().S4(null, null);
        }
    }

    private void Ee() {
        C1DPV c1dpv = C1DPV.LIZIZ;
        sd0(false, c1dpv.LIZJ(C1DPX.OPEN_CAMERA_MULTI_WINDOW_TOP_PAUSED, EnumC1641610sox.USER_OPERATION));
        Al2(false, c1dpv.LIZIZ(C1DPW.OPEN_CAMERA_MULTI_WINDOW_TOP_RESUMED, null));
    }

    private JSONObject Fe() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("audio", false);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    private void tf() {
        this.i.LJIIJ(Unit.LIZ);
    }

    private void xf() {
        this.p.LJIIJ(Unit.LIZ);
    }

    private void ze() {
        Runnable runnable = this.s;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
            this.s = null;
        }
    }

    @Override // X.C2254071DKj
    public void Cb() {
        C201955140j.LIZJ(C201967140v.LIZIZ, "resetAllPlayStatus() called");
        super.Cb();
        C1439190nYT.LIZJ();
    }

    @Override // X.C2253401DHu
    public boolean Mc() {
        if (this.q) {
            return false;
        }
        return C2477509nJ.LIZ();
    }

    @Override // X.C2254071DKj
    public C1DKV T4() {
        return new o2(((InterfaceC1622160sJa) this.LL.LJII(InterfaceC1622160sJa.class, null)).LIZ(), this.LLLIL, super.T4());
    }

    @Override // mn3.e0
    public void XB() {
        if (this.LLLLLL.LJJIJIIJI) {
            a aVarNc = Nc();
            this.LLLLIIL.LIZ();
            C1DI4 c1di4 = C1DI4.LIZ;
            aVarNc.LIZIZ(C1DI4.LJII());
        }
    }

    @Override // X.C2254071DKj
    public void da() {
        if (C1448790nnx.LIZIZ) {
            C1448790nnx.LIZIZ = false;
            C1448790nnx.LIZJ("camera_success");
        }
    }

    @Override // mn3.e0
    public EnumC1448590nnd kR1() {
        return this.j.LIZJ();
    }

    @Override // mn3.e0
    public C1655760tBm qd1() {
        this.d.LIZIZ.getClass();
        return new C1655760tBm();
    }

    @Override // X.C2254071DKj
    public void s7() {
        C201955140j.LIZJ(C201967140v.LIZIZ, "initDuetAndReaction() called");
        Ae();
        super.s7();
    }

    @Override // X.C2254071DKj
    public void u7() {
        C201955140j.LIZJ(C201967140v.LIZIZ, "initMediaProcess() called");
        super.u7();
    }

    private void mf() {
        C2253081DGo c2253081DGoIU1 = IU1();
        ((ArrayList) c2253081DGoIU1.LIZ).add(this.u);
    }

    private void sf() {
        int currentCameraType = u92().getCameraController().getCurrentCameraType();
        if (currentCameraType != -1 && currentCameraType == VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit.ordinal() && this.g) {
            this.g = false;
            this.h.LJIIJ(Unit.LIZ);
        }
    }

    @Override // X.C2254071DKj
    public void C5() {
        super.C5();
        C201955140j.LIZJ(C201967140v.LIZIZ, "closeWavFile() called");
    }

    @Override // X.C2254071DKj
    public void E5() {
        super.E5();
        C201955140j.LIZJ(C201967140v.LIZIZ, "lackPermission() called");
        C1637890six.LJ("checkPermission", 1, Fe());
    }

    @Override // X.C2254071DKj
    public void H5() {
        super.H5();
        C524780Ki4.LIZ.step("av_camera_open_init", "camera open start");
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void P6() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            return;
        }
        super.P6();
    }

    @Override // X.C2254071DKj
    public void R5() {
        super.R5();
        C524780Ki4.LIZ.end("av_video_record_change_camera", "changeCamera#onFirstFrame");
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void S6() {
        super.S6();
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: ");
        sbLIZ.append(this.LLZLLIL);
        sbLIZ.append(" isOpenCameraSuccess: ");
        sbLIZ.append(this.LLZZ);
        sbLIZ.append(" cameraClosedByLive: ");
        sbLIZ.append(this.l);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C2254071DKj
    public void cb() {
        super.cb();
        C524780Ki4.LIZ.end(CameraFirstFramePerformanceMonitorV2.INSTANCE, "effect frame available");
    }

    @Override // mn3.e0
    public C1660560tJW dq2() {
        return C1661480tL0.LIZ(zA2());
    }

    @Override // X.C2254071DKj
    public void o7() {
        super.o7();
        if (this.LLLIL.LJIIJJI()) {
            C201955140j.LIZJ(C201967140v.LIZIZ, "initDuet() called");
        }
    }

    @Override // X.C2254071DKj
    public void oa() {
        super.oa();
        C2265108u9.LIZ("extract_shot", "extracting_frame");
    }

    @Override // X.C2254071DKj, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        u92().getCameraController().u4(new InterfaceC1631620sYq() { // from class: X.1DLF
            @Override // X.InterfaceC1631620sYq
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return b1.gf(this.LL, (Integer) obj, (Integer) obj2, (String) obj3);
            }
        });
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_CREATE);
    }

    @Override // X.C2253401DHu, X.C2254071DKj, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_DESTROY);
        C2253081DGo c2253081DGoIU1 = IU1();
        ((ArrayList) c2253081DGoIU1.LIZ).remove(this.u);
        this.r.removeCallbacksAndMessages(null);
        this.s = null;
    }

    @Override // X.C2253401DHu, X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_PAUSE);
    }

    @Override // X.C2253401DHu, X.C2254071DKj, X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.t = SystemClock.elapsedRealtime();
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_RESUME);
        if (!this.m) {
            u92().getCameraController().j4();
        }
        if (this.m) {
            this.m = false;
        }
        this.w = true;
    }

    @Override // X.C2253401DHu, X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        ze();
    }

    @Override // X.C2254071DKj
    public void pa() {
        super.pa();
        C2265108u9.LIZJ();
    }

    @Override // mn3.e0
    public int zA2() {
        C1DKV recordContext = getRecordContext();
        return recordContext instanceof o2 ? ((o2) recordContext).LIZ : C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false);
    }

    public bck.u Be() {
        return this.d;
    }

    @Override // mn3.e0
    public /* bridge */ /* synthetic */ InterfaceC2177841ALe Gz0() {
        return this.d;
    }

    @Override // mn3.e0
    public boolean J61() {
        return this.l;
    }

    @Override // mn3.e0
    public LiveEvent<Unit> XJ2() {
        return this.p;
    }

    @Override // mn3.e0
    public LiveEvent<Unit> cI() {
        return this.h;
    }

    @Override // mn3.e0
    public LiveData<Boolean> ci0() {
        return this.k;
    }

    @Override // mn3.e0
    public C385670FAf<EnumC1448590nnd> dk() {
        return this.j;
    }

    @Override // mn3.e0
    public boolean fU1() {
        return this.o;
    }

    @Override // mn3.e0
    public LiveEvent<Unit> j42() {
        return this.i;
    }

    public static Unit Je(C1DRG c1drg) {
        C2216161BoU.LIZ(((Activity) c1drg.LJII(C19GS.class, null)).getApplication(), (Gson) new C196998125s().LIZ.getValue(), o.LJJIFFI).LIZIZ(C2216141BoS.LIZ.get());
        SettingsManager.LIZLLL().getClass();
        VERuntime.getInstance().setEffectJsonConfig(SettingsManager.LJI("effect_sdk_config_settings", ""));
        return Unit.LIZ;
    }

    public static /* synthetic */ List Pe(k2 k2Var) {
        return C1658290tFr.LIZ(k2Var.LJ.LIZIZ());
    }

    public static Unit Te(InterfaceC2254081DKk interfaceC2254081DKk) {
        SettingsManager.LIZLLL().getClass();
        interfaceC2254081DKk.enableEffect(SettingsManager.LIZ("enable_use_effect", true));
        return Unit.LIZ;
    }

    public static /* synthetic */ Unit ef(b1 b1Var) {
        C20622515mp.LJIIIZ(b1Var.LLLIIII);
        return null;
    }

    public static /* synthetic */ Unit ff(b1 b1Var) {
        C20622515mp.LJIIIZ(b1Var.LLLIIII);
        return null;
    }

    public static /* synthetic */ void hf(b1 b1Var) {
        C1C7U.LIZ("TikTokCameraCoreComponent@875b.onTopResumedActivityChanged$1L");
        b1Var.s = null;
        b1Var.Ee();
        C1C7U.LIZIZ("TikTokCameraCoreComponent@875b.onTopResumedActivityChanged$1L");
    }

    @Override // X.C2254071DKj
    public void Ga(int i) {
        CreativeInfo creativeInfo = this.e;
        if (creativeInfo != null) {
            this.d.LIZ.setRenderCacheString("CreationID", creativeInfo.getCreationId());
        }
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNativeInitCallBack() called with: ret = [");
        sbLIZ.append(i);
        sbLIZ.append(e3.f);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        if (u7.LJ()) {
            C1637890six.LJ("aweme_camera_preview_init_fail", 0, null);
        }
        super.Ga(i);
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void N5(int i) {
        super.N5(i);
        this.f.cameraErrorCode = 0;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("useVERecoder", Boolean.TRUE);
        C1637890six.LJ("aweme_open_camera_error_rate", 0, c543670LTx.LJ());
        C524780Ki4.LIZ.step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void N6(Surface surface) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: ");
        sbLIZ.append(this.LLZLLIL);
        sbLIZ.append(" isOpenCameraSuccess: ");
        sbLIZ.append(this.LLZZ);
        sbLIZ.append(" cameraClosedByLive: ");
        sbLIZ.append(this.l);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        C543670LTx c543670LTx = new C543670LTx();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("w = ");
        sbLIZ2.append(getPreviewView().getWidth());
        sbLIZ2.append("   h = ");
        sbLIZ2.append(getPreviewView().getHeight());
        c543670LTx.LIZ.put("camera_surface_view_size", C2188811AlT.LIZIZ(sbLIZ2));
        C1637890six.LIZIZ("zoom_info_log", c543670LTx.LJ());
        super.N6(surface);
    }

    @Override // mn3.e0
    public void QN2(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void S5(int i) {
        if (!this.v) {
            C857540XkW.LIZ(System.currentTimeMillis() - this.n.getLong("extra_start_record_time", 0L), this.n.getString("shoot_way"), this.e.getCreationId(), "open_camera", this.n.getString("enter_from"));
            this.v = true;
        }
        C524780Ki4.LIZ.step("av_camera_open_init", "camera open success");
        super.S5(i);
        this.f.cameraErrorCode = 0;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("useVERecoder", Boolean.TRUE);
        C1637890six.LJ("aweme_open_camera_error_rate", 0, c543670LTx.LJ());
    }

    @Override // mn3.e0
    public void eZ1(FilterBean filterBean) {
        String str;
        bck.u uVar = this.d;
        if (filterBean == null) {
            filterBean = uVar.LIZJ;
        }
        if (filterBean != null) {
            uVar.getClass();
            if (C1643880ssc.LJ(filterBean)) {
                String str2 = uVar.LJIIIIZZ;
                if (str2 != null && (str = uVar.LJIIIZ) != null) {
                    uVar.LJIIIZ(1.0f, str2, str);
                    uVar.LJFF(uVar.LJIIIIZZ, uVar.LJIIIZ);
                    uVar.LJIIIIZZ = null;
                    uVar.LJIIIZ = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new ComposerInfo(C1643880ssc.LIZIZ(filterBean, 0.0f), filterBean.getExtra(), filterBean.getId(), ""));
                    uVar.LIZ.LJJLIIIJILLIZJL(arrayList);
                }
                uVar.LIZJ = null;
                return;
            }
            uVar.LIZIZ.LIZ.setFilter("");
            return;
        }
        uVar.LIZIZ.LIZ.setFilter("");
    }

    @Override // X.C2254071DKj
    public void ma(long j) {
        super.ma(j);
        if (u7.LIZ() && !u7.LIZJ()) {
            return;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "duration");
        C2341909Fp.LIZ("tool_performance_record_fetch_frames", c0lab.LIZ);
    }

    @Override // X.C2253401DHu, X.InterfaceC1650230t2r
    public void openCamera(Cert cert) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG openCamera cameraClosedByLive: ");
        sbLIZ.append(this.l);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        super.openCamera(cert);
        this.l = false;
    }

    @Override // X.C2254071DKj
    public void ra(int i) {
        int memoryClass;
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNativeInitCallBack() called with: ret = [");
        sbLIZ.append(i);
        sbLIZ.append(e3.f);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        super.ra(i);
        C1439190nYT.LIZJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentWidth:");
        sbLIZ2.append(this.LLLJL);
        sbLIZ2.append("    currentHeight:");
        sbLIZ2.append(this.LLLL);
        sbLIZ2.append("      availableMem:");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        try {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            C19GS c19gs = this.LLLIIII;
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(c19gs, "activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhOEqRdlk2Y=", null));
            sbLIZ3.append(Formatter.formatFileSize(c19gs, memoryInfo.availMem));
            sbLIZ3.append(" currentPIDMem:");
            Context contextO3 = C786410Ut5.O3(this.LLLIIII);
            ActivityManager activityManager2 = (ActivityManager) C786410Ut5.H2(contextO3, "activity");
            if ((contextO3.getApplicationInfo().flags & 1048576) != 0) {
                memoryClass = activityManager2.getLargeMemoryClass();
            } else {
                memoryClass = activityManager2.getMemoryClass();
            }
            sbLIZ3.append(Formatter.formatFileSize(contextO3, memoryClass * 1024 * 1024));
            sbLIZ3.append("hasUsedMem:");
            sbLIZ3.append(Formatter.formatFileSize(C786410Ut5.M3(this.LLLIIII.getApplication()), ((ActivityManager) C786410Ut5.H2(r6, "activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPrivateDirty() * 1024));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C201967140v.LIZIZ, "onNativeInitFail AVUtils error", e);
        }
        C201955140j.LJIIJ(C201967140v.LIZIZ, "onNativeInitFail", new Exception("init failed detail: " + strLIZIZ));
        if (u7.LJ()) {
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(i));
            c543670LTx.LIZ.put("errorDesc", "");
            c543670LTx.LIZ.put("exception", strLIZIZ);
            C1637890six.LJ("aweme_camera_preview_init_fail", 1, c543670LTx.LJ());
        }
        C1448790nnx.LIZ("camera_error", "3", "native init failed , ve result = " + i);
    }

    @Override // X.C2254071DKj
    public void u6(float f) {
        super.u6(f);
        C543670LTx c543670LTx = new C543670LTx();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" size = ");
        sbLIZ.append(f);
        c543670LTx.LIZ.put("camera_zoom_size", C2188811AlT.LIZIZ(sbLIZ));
        C1637890six.LIZIZ("zoom_info_log", c543670LTx.LJ());
    }

    @Override // mn3.e0
    public void vg(boolean z) {
        C19GS c19gs;
        if (((Boolean) C0AC9.LIZ.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 29 && (c19gs = this.LLLIIII) != null && c19gs.isInMultiWindowMode()) {
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TikTokCameraCoreComponent onTopResumedActivityChanged isTop=");
            sbLIZ.append(z);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                ze();
            } else if (SystemClock.elapsedRealtime() - this.t > 500) {
                ze();
                ARunnableS135S0100000_35 aRunnableS135S0100000_35 = new ARunnableS135S0100000_35(this, 18);
                this.s = aRunnableS135S0100000_35;
                C786410Ut5.LJLIIL(500L, this.r, aRunnableS135S0100000_35);
            }
        }
    }

    @Override // X.C2254071DKj
    public void Ba(File file, int i) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("error_code", Integer.valueOf(i));
        c543670LTx.LIZIZ(Integer.valueOf(this.LLLIL.LIZIZ().size()), "segment_count");
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it2 = this.LLLIL.LIZIZ().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getDuration());
            sb.append(",");
        }
        if (sb.length() == 0) {
            c543670LTx.LIZLLL("video_durations", "");
        } else {
            c543670LTx.LIZLLL("video_durations", sb.substring(0, sb.length() - 1));
        }
        c543670LTx.LIZJ(Long.valueOf(this.LLLIL.mTotalRecordingTime), "total_duration");
        c543670LTx.LIZLLL("path", file.getPath());
        if (file.isDirectory()) {
            c543670LTx.LIZLLL("file_path", C1894607bU.LIZ(file.list()));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this.n.getInt("record_from", 0));
        c543670LTx.LIZLLL("enter_from", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        C1637890six.LIZIZ("aweme_draft_edit_error", jSONObjectLJ);
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C786410Ut5.J3(jSONObjectLJ));
        sbLIZ2.append(" RestoreType: ");
        sbLIZ2.append(this.LLLIL.mRestoreType);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ2));
        super.Ba(file, i);
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public void Kg1(float f, float f2) {
        if (f < 0.0f) {
            return;
        }
        this.LLLLZLLIL.LIZIZ(f / (f2 - C12ES.LIZJ(225.0f, this.LLLIIII)));
    }

    @Override // mn3.e0
    public void Mu0(Boolean bool, Boolean bool2) {
        boolean z = false;
        if (bool == null) {
            if (!this.w) {
                return;
            }
            this.w = false;
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue() || this.LLLIL.LJII()) {
            z = true;
        }
        St2().pauseEffectAudio(z);
        St2().Ra(z);
    }

    @Override // mn3.e0
    public void OG2(int i, EnumC1448590nnd enumC1448590nnd) {
        C1660560tJW c1660560tJW;
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokCameraCoreComponent onCameraModeTypeChanged,type:");
        sbLIZ.append(i);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        C1DKV recordContext = getRecordContext();
        if (recordContext instanceof o2) {
            o2 o2Var = (o2) recordContext;
            o2Var.LIZ = i;
            InterfaceC2253521DIg interfaceC2253521DIgLJIIZILJ = o2Var.LJIIZILJ();
            if ((interfaceC2253521DIgLJIIZILJ instanceof C1660560tJW) && (c1660560tJW = (C1660560tJW) interfaceC2253521DIgLJIIZILJ) != null) {
                c1660560tJW.LIZ = i;
            }
        }
        this.j.LJII(enumC1448590nnd);
    }

    @Override // mn3.e0
    public void VE(int i, int i2) {
        this.LLLIILIL.LJIILL(i, i2);
    }

    @Override // X.C2254071DKj
    public void Ya(int i, String str) {
        super.Ya(i, str);
        lgo.a.LIZIZ.recordService().LJII();
    }

    @Override // X.C2253401DHu, X.InterfaceC1650230t2r
    public void aJ0(boolean z, Cert cert) {
        super.aJ0(z, cert);
        this.l = true;
    }

    @Override // X.C2254071DKj
    public void d6(int i, int i2) {
        if (!this.LLLLII) {
            C543670LTx c543670LTx = new C543670LTx();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("w = ");
            sbLIZ.append(i);
            sbLIZ.append("   h = ");
            sbLIZ.append(i2);
            c543670LTx.LIZ.put("camera_preview_size", C2188811AlT.LIZIZ(sbLIZ));
            C1637890six.LIZIZ("zoom_info_log", c543670LTx.LJ());
        }
        super.d6(i, i2);
    }

    @Override // mn3.e0
    public void lo1(int i, int i2) {
        int iLJJIIJ = this.LLLIILIL.LIZIZ.LJJIIJ(i, i2, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeTrack, ret = ");
        sbLIZ.append(iLJJIIJ);
        sbLIZ.append(", trackIndex = ");
        sbLIZ.append(i2);
        sbLIZ.append(", type = ");
        sbLIZ.append(i);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C2253401DHu, X.InterfaceC1650230t2r
    public void openCamera(Cert cert, boolean z) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG openCamera cameraClosedByLive: ");
        sbLIZ.append(this.l);
        sbLIZ.append(", ignoreShowSurfaceView: ");
        sbLIZ.append(z);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        super.openCamera(cert, z);
        this.l = false;
    }

    @Override // mn3.e0
    public void rM(FilterBean filterBean, Float f) {
        float fFloatValue;
        bck.u uVar = this.d;
        if (f == null) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = f.floatValue();
        }
        uVar.getClass();
        if (filterBean != null) {
            if (C1643880ssc.LJ(filterBean)) {
                String filterFolder = filterBean.getFilterFolder();
                String strLJ = uVar.LJ();
                if (strLJ != null) {
                    String str = uVar.LJIIIIZZ;
                    if (str != null) {
                        if (uVar.LJIIIZ != null) {
                            if (str.equals(filterFolder)) {
                                uVar.LJIIIZ(1.0f, uVar.LJIIIIZZ, uVar.LJIIIZ);
                                uVar.LJFF(uVar.LJIIIZ);
                            } else if (uVar.LJIIIZ.equals(filterFolder)) {
                                uVar.LJIIIZ(0.0f, uVar.LJIIIIZZ, uVar.LJIIIZ);
                                uVar.LJFF(uVar.LJIIIIZZ);
                            } else {
                                uVar.LJFF(uVar.LJIIIIZZ, uVar.LJIIIZ);
                                uVar.LIZ.i2(new ArrayList(), bck.u.LIZ(filterBean, fFloatValue), 500);
                            }
                        } else if (!str.equals(filterFolder) || uVar.LJII != 1.0f) {
                            uVar.LJFF(uVar.LJIIIIZZ);
                            uVar.LIZ.i2(new ArrayList(), bck.u.LIZ(filterBean, fFloatValue), 500);
                        }
                    } else {
                        String str2 = uVar.LJIIIZ;
                        if (str2 != null) {
                            if (!str2.equals(filterFolder) || uVar.LJII != 0.0f) {
                                uVar.LJFF(uVar.LJIIIZ);
                                uVar.LIZ.i2(new ArrayList(), bck.u.LIZ(filterBean, fFloatValue), 500);
                            }
                        } else if (strLJ.equals(filterFolder)) {
                            uVar.LIZ.vo(filterFolder, fFloatValue);
                        } else {
                            uVar.LIZ.i2(bck.u.LIZ(uVar.LIZJ, 0.0f), bck.u.LIZ(filterBean, fFloatValue), 500);
                        }
                    }
                } else {
                    uVar.LIZ.i2(new ArrayList(), bck.u.LIZ(filterBean, fFloatValue), 500);
                }
                uVar.LIZJ = filterBean;
                uVar.LJIIIIZZ = null;
                uVar.LJIIIZ = null;
                return;
            }
            uVar.LIZIZ.LIZ.setFilter(filterBean.getFilterFolder(), fFloatValue);
        }
    }

    @Override // X.C2254071DKj
    public void sa(int i, int i2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [");
        sbLIZ.append(i);
        sbLIZ.append(e3.f);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        super.sa(i, i2);
        CameraComponentModel cameraComponentModel = this.LLLIL;
        if (cameraComponentModel.mRestoreType == 0) {
            int i3 = cameraComponentModel.mHardEncode;
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
            editorEdit.putInt("hard_encode", i3);
            C1499900p8O.LIZ(editorEdit);
        }
        C0CHQ.LIZ().LJJIIZI().LIZJ(i2);
    }

    @Override // X.C2253401DHu, X.InterfaceC1650230t2r
    public void sd0(boolean z, Cert cert) {
        this.o = false;
        super.sd0(z, cert);
    }

    @Override // mn3.e0
    public void wb2(float f, float f2) {
        float fLIZJ;
        if (C1660530tJT.LIZLLL(zA2()) == EnumC1448590nnd.RATIO_3_4) {
            fLIZJ = C578100Mls.LIZJ(this.LLLIIII);
        } else {
            fLIZJ = 0.0f;
        }
        GK(f, f2 - fLIZJ);
    }

    @Override // mn3.e0
    public int wn1(int i, VETrackParams vETrackParams) {
        int iLJII = this.LLLIILIL.LIZIZ.LJII(i, vETrackParams, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addTrack, ret = ");
        sbLIZ.append(iLJII);
        sbLIZ.append(", type = ");
        sbLIZ.append(i);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        return iLJII;
    }

    @Override // mn3.e0
    public void CT(int i, int i2, boolean z) {
        int iLJJIIZI = this.LLLIILIL.LIZIZ.LJJJ.LJJIIZI(i, i2, 0, -1, -1L, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPlayTrack ret= ");
        sbLIZ.append(iLJJIIZI);
        sbLIZ.append(" trackIndex = ");
        sbLIZ.append(i);
        sbLIZ.append(" trackType = ");
        sbLIZ.append(i2);
        sbLIZ.append(" loop = ");
        sbLIZ.append(z);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C2253401DHu, X.InterfaceC1650230t2r
    public int Cd(boolean z, Cert cert, String str) {
        return super.Cd(z, cert, str);
    }

    @Override // X.C2254071DKj
    public void D5(int i, int i2, double d) {
        super.D5(i, i2, d);
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initWavFile() called with: sampleRate = [");
        sbLIZ.append(i);
        sbLIZ.append("], channels = [");
        sbLIZ.append(i2);
        sbLIZ.append("], speed = [");
        sbLIZ.append(d);
        sbLIZ.append(e3.f);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C2254071DKj
    public void Da(String[] strArr, double[] dArr, boolean[] zArr) {
        super.Da(strArr, dArr, zArr);
        ClientCherEffectParam clientCherEffectParam = this.LLLIL.veCherEffectParam;
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        if (clientCherEffectParam != null) {
            editorEdit.putString("ve_cher_effect_param", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), clientCherEffectParam));
        } else {
            editorEdit.remove("ve_cher_effect_param");
        }
        C1499900p8O.LIZ(editorEdit);
    }

    @Override // mn3.e0
    public void Hi2(int i, int i2, long j) {
        this.LLLIILIL.LJIJI(i, i2, j);
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void M5(int i, int i2, String str) {
        super.M5(i, i2, str);
        this.f.cameraErrorCode = i2;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("useVERecoder", Boolean.TRUE);
        c543670LTx.LIZ.put("errorDesc", str);
        C1637890six.LJ("aweme_open_camera_error_rate", i2, c543670LTx.LJ());
    }

    @Override // X.C2253401DHu, X.C2254071DKj
    public void U5(int i, int i2, String str) {
        super.U5(i, i2, str);
        this.f.cameraErrorCode = i2;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("useVERecoder", Boolean.TRUE);
        c543670LTx.LIZ.put("errorDesc", str);
        C1637890six.LJ("aweme_open_camera_error_rate", i2, c543670LTx.LJ());
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public int cd0(pyl.q qVar, Cert cert, String str) {
        C524780Ki4.LIZ.start("av_video_record_change_camera", "switchFrontRearCamera");
        return super.cd0(qVar, cert, str);
    }

    @Override // X.C2254071DKj
    public void m6(boolean z, float f, List<Integer> list) {
        super.m6(z, f, list);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("isDragEnable", Boolean.valueOf(z));
        c543670LTx.LIZ.put("mMaxZoom", Float.valueOf(f));
        c543670LTx.LIZ.put("mCameraZoomList", Boolean.valueOf(C0IKQ.LIZIZ(list)));
        C1637890six.LIZIZ("zoom_info_log", c543670LTx.LJ());
    }

    @Override // X.C2253401DHu, X.InterfaceC1650230t2r
    public void ow1(boolean z, Cert cert, boolean z2) {
        super.ow1(z, cert, z2);
        this.o = true;
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public void wr1(C1645090suZ c1645090suZ, C1645090suZ c1645090suZ2, float f) {
        float fAbs;
        float fAbs2;
        String str;
        String str2;
        String str3;
        String str4;
        bck.u uVar = this.d;
        uVar.getClass();
        if (c1645090suZ != null && c1645090suZ2 != null) {
            boolean zLJ = C1643880ssc.LJ(c1645090suZ.LIZ);
            boolean zLJ2 = C1643880ssc.LJ(c1645090suZ2.LIZ);
            if (f < 0.0f) {
                fAbs = Math.abs(f);
            } else {
                fAbs = 1.0f - f;
            }
            if (zLJ && zLJ2) {
                if (f < 0.0f) {
                    fAbs2 = Math.abs(f);
                } else {
                    fAbs2 = 1.0f - f;
                }
                if (Math.abs(f) < 0.05f) {
                    if (f <= 0.0f) {
                        fAbs2 = 0.0f;
                    } else {
                        fAbs2 = 1.0f;
                    }
                }
                if (uVar.LJII != fAbs2) {
                    String filterFolder = c1645090suZ.LIZ.getFilterFolder();
                    String filterFolder2 = c1645090suZ2.LIZ.getFilterFolder();
                    String strLJ = uVar.LJ();
                    if (uVar.LJIIIIZZ == null && uVar.LJIIIZ == null) {
                        if (Objects.equals(strLJ, filterFolder)) {
                            uVar.LJIIIIZZ = strLJ;
                        } else if (Objects.equals(strLJ, filterFolder2)) {
                            uVar.LJIIIZ = strLJ;
                        }
                    }
                    if (!Objects.equals(uVar.LJIIIIZZ, filterFolder) && (str3 = uVar.LJIIIIZZ) != null) {
                        float f2 = uVar.LJII;
                        if (f2 > 0.0f && f2 < 1.0f && (str4 = uVar.LJIIIZ) != null) {
                            uVar.LJIIIZ(0.0f, str3, str4);
                            uVar.LJII = 0.0f;
                        }
                        uVar.LJFF(uVar.LJIIIIZZ);
                        uVar.LJIIIIZZ = null;
                    }
                    if (!Objects.equals(uVar.LJIIIZ, filterFolder2) && (str = uVar.LJIIIZ) != null) {
                        float f3 = uVar.LJII;
                        if (f3 > 0.0f && f3 < 1.0f && (str2 = uVar.LJIIIIZZ) != null) {
                            uVar.LJIIIZ(1.0f, str2, str);
                            uVar.LJII = 1.0f;
                        }
                        uVar.LJFF(uVar.LJIIIZ);
                        uVar.LJIIIZ = null;
                    }
                    if (uVar.LJIIIIZZ == null) {
                        uVar.LIZ.n0(bck.u.LIZ(c1645090suZ.LIZ, c1645090suZ.LIZIZ), 500);
                        uVar.LJIIIIZZ = filterFolder;
                    }
                    if (uVar.LJIIIZ == null) {
                        uVar.LIZ.n0(bck.u.LIZ(c1645090suZ2.LIZ, c1645090suZ2.LIZIZ), 500);
                        uVar.LJIIIZ = filterFolder2;
                    }
                    uVar.LJIIIZ(fAbs2, uVar.LJIIIIZZ, uVar.LJIIIZ);
                    if (fAbs2 == 0.0f) {
                        if (uVar.LJIIIIZZ != null) {
                            uVar.LJFF(filterFolder);
                            uVar.LJIIIIZZ = null;
                        }
                        uVar.LIZJ = c1645090suZ2.LIZ;
                    }
                    if (fAbs2 == 1.0f) {
                        if (uVar.LJIIIZ != null) {
                            uVar.LJFF(filterFolder2);
                            uVar.LJIIIZ = null;
                        }
                        uVar.LIZJ = c1645090suZ.LIZ;
                    }
                    uVar.LJII = fAbs2;
                    return;
                }
                return;
            }
            uVar.LIZ.ro(C1638720skI.LJ(c1645090suZ.LIZ), C1638720skI.LJ(c1645090suZ2.LIZ), fAbs, c1645090suZ.LIZIZ, c1645090suZ2.LIZIZ);
        }
    }

    public static /* synthetic */ Unit gf(b1 b1Var, Integer num, Integer num2, String str) {
        if (num.intValue() == 2 || num.intValue() == 1) {
            b1Var.xf();
            b1Var.sf();
        }
        if (num.intValue() == 1) {
            b1Var.tf();
            return null;
        }
        return null;
    }

    @Override // X.C2254071DKj
    public void V9(boolean z, int i, int i2, String str) {
        boolean zLIZ = C0LH8.LIZ.LIZ(this.LLLIIII, this.n);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraOpenFailed : errorCode,");
        sbLIZ.append(i2);
        sbLIZ.append("msg :");
        sbLIZ.append(str);
        sbLIZ.append(" permission : ");
        sbLIZ.append(zLIZ);
        C1448790nnx.LIZ("camera_error", "3", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            C1A64.LIZ.LIZ(this.LLLIIII);
            return;
        }
        if (this.n.containsKey("exterior_record_model") && ((ExteriorRecordModel) this.n.getParcelable("exterior_record_model")).recordPageType.getType() == C0LG8.PHOTO_SEARCH.getType()) {
            C540290LGx.LIZ.LJIIL(this.LLLIIII, new AObjectS409S0100000_35(this, 11), new String[]{"android.permission.CAMERA"});
            return;
        }
        C540290LGx.LIZ.LJIIJJI(this.LLLIIII, new AObjectS409S0100000_35(this, 12));
    }

    public b1(C1DRG c1drg, CameraComponentModel cameraComponentModel, CreativeInfo creativeInfo, Effect effect, boolean z) {
        this(c1drg, cameraComponentModel, new C1651700t5E((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null)), creativeInfo, false, null, effect, z, null);
    }

    @Override // X.C2254071DKj
    public void J6(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String strLIZIZ;
        super.J6(i, z, z2, f, list);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("cameraType", Integer.valueOf(i));
        c543670LTx.LIZ.put("supportZoom", Boolean.valueOf(z));
        c543670LTx.LIZ.put("supportSmooth", Boolean.valueOf(z2));
        c543670LTx.LIZ.put("maxZoom", Float.valueOf(f));
        if (C0IKQ.LIZIZ(list)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(ListProtector.get(list, 0));
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = " ";
        }
        c543670LTx.LIZ.put("ratios", strLIZIZ);
        C1637890six.LIZIZ("zoom_info_log", c543670LTx.LJ());
    }

    public static Unit Re(C1DRG c1drg, int i, ShortVideoContext shortVideoContext, InterfaceC1622160sJa interfaceC1622160sJa, boolean z, k2 k2Var) {
        long j;
        ((Activity) c1drg.LJII(C19GS.class, null)).getApplication();
        if (new C19731412Hw("").LJIL()) {
            j = 1;
        } else {
            j = 0;
        }
        k2Var.LIZLLL = j;
        k2Var.LJ = C1661480tL0.LIZ(i);
        v1 v1Var = k2Var.LJIIJ;
        String str = v1Var.LIZJ;
        String str2 = v1Var.LIZIZ;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            k2Var.LJIIJ.LJFF = C1656740tDM.LIZJ();
        }
        k2Var.LJIIJJI.LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "use_enhance_volume", true, false);
        if (shortVideoContext.creativeModel.recordDowngradeModel.bitrate != null) {
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TikTokCameraCoreComponent downgrade_sticker_preview_resolution_tag resolution = ");
            sbLIZ.append(shortVideoContext.cameraComponentModel.mVideoWidth);
            sbLIZ.append("x");
            sbLIZ.append(shortVideoContext.cameraComponentModel.mVideoHeight);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TikTokCameraCoreComponent downgrade_sticker_preview_resolution_tag bitrate = ");
            sbLIZ2.append(shortVideoContext.creativeModel.recordDowngradeModel.bitrate);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ2));
            k2Var.LJIIL = new Pair<>(Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoWidth), Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoHeight));
            k2Var.LJIIJJI.LIZJ = shortVideoContext.creativeModel.recordDowngradeModel.bitrate.floatValue() * 4.0f;
        } else {
            k2Var.LJIIJJI.LIZJ = AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate() * 4.0f;
        }
        k2Var.LJIIJJI.LJ = AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality();
        k2Var.LJIIJJI.LIZLLL = C1784280wX4.LIZIZ();
        k2Var.LJIILIIL = C290870Baf.LIZ();
        k2Var.LJIJ = ((Number) C280780AzU.LIZ.getValue()).intValue();
        k2Var.LJIJJ = C0BNF.LIZ();
        k2Var.LJIJJLI = interfaceC1622160sJa.LIZIZ();
        k2Var.LJIL = C0BNG.LIZ();
        if (((Boolean) C0AT9.LIZ.getValue()).booleanValue() && (shortVideoContext.LJIIIZ() == null || shortVideoContext.LJIIIZ().isEmpty())) {
            z2 = true;
        }
        k2Var.LJJ = z2;
        k2Var.LJJI = z;
        k2Var.LJJIFFI = new AObjectS409S0100000_35(k2Var, 9);
        k2Var.LJJII = new AObjectS82S0000000_35(0);
        k2Var.LJJIII = new AObjectS82S0000000_35(0);
        return Unit.LIZ;
    }

    @Override // X.C2254071DKj
    public void K6(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - C19573611i2.LIZ;
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open camera to first frame cost = ");
        sbLIZ.append(jCurrentTimeMillis);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_FIRST_FRAME);
        j jVar = C524780Ki4.LIZ;
        jVar.step(CameraFirstFramePerformanceMonitorV2.INSTANCE, "camera frame available");
        jVar.end(OpenCameraLatencyMonitor.INSTANCE, OpenCameraStep.CAMERA_FIRST_FRAME.getStepName());
        super.K6(eGLContext, i, i2, i3, i4, j);
    }

    public b1(C1DRG c1drg, CameraComponentModel cameraComponentModel, CreativeInfo creativeInfo, InterfaceC2253451DHz interfaceC2253451DHz, Effect effect, boolean z, C092O<C2254091DKl> c092o) {
        this(c1drg, cameraComponentModel, new C1651700t5E((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null)), creativeInfo, true, interfaceC2253451DHz, effect, z, c092o);
    }

    @Override // mn3.e0
    public void zr1(int i, int i2, Function1<? super VECameraSettings.Builder, Unit> function1, VEVideoEncodeSettings vEVideoEncodeSettings, Cert cert, Function0<Unit> function0, final Function1<? super Boolean, Unit> function12) {
        EnumC1448590nnd enumC1448590nndLIZLLL = C1660530tJT.LIZLLL(i);
        EnumC1448590nnd enumC1448590nndLIZLLL2 = C1660530tJT.LIZLLL(i2);
        OG2(i2, enumC1448590nndLIZLLL2);
        VECameraSettings.CAMERA_MODE_TYPE camera_mode_typeLIZIZ = C1660530tJT.LIZIZ(i);
        VECameraSettings.CAMERA_MODE_TYPE camera_mode_typeLIZIZ2 = C1660530tJT.LIZIZ(i2);
        C1660540tJU c1660540tJULIZ = C1661480tL0.LIZ(i2);
        int[] iArrLJIIIIZZ = c1660540tJULIZ.LJIIIIZZ();
        St2().getMediaController().t5(new VESize(iArrLJIIIIZZ[0], iArrLJIIIIZZ[1]));
        St2().getMediaController().O5(vEVideoEncodeSettings);
        if (camera_mode_typeLIZIZ == camera_mode_typeLIZIZ2 && enumC1448590nndLIZLLL == enumC1448590nndLIZLLL2) {
            function12.invoke(Boolean.TRUE);
        } else {
            St2().sh(c1660540tJULIZ, function1, new InterfaceC2253331DHn() { // from class: X.1DKu
                @Override // X.InterfaceC2253331DHn
                public final void LIZIZ(int i3) {
                    function12.invoke(Boolean.TRUE);
                }

                @Override // X.InterfaceC2253331DHn
                public final void LIZ(int i3, int i4, String str) {
                    function12.invoke(Boolean.FALSE);
                }
            }, cert);
            function0.invoke();
        }
    }

    public static void Ve(final C1DRG c1drg, CameraComponentModel cameraComponentModel, C092O c092o, final boolean z, InterfaceC2187111Aij interfaceC2187111Aij, boolean z2, CreativeInfo creativeInfo, C2254091DKl c2254091DKl) {
        EnumC1985407q8 enumC1985407q8;
        boolean z3;
        boolean z4;
        boolean z5;
        Integer numLIZ;
        Effect effect = null;
        Bundle bundleLIZ = C537670L6v.LIZ(c1drg, (Activity) c1drg.LJII(Activity.class, null));
        final ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
        final InterfaceC1622160sJa interfaceC1622160sJa = (InterfaceC1622160sJa) c1drg.LJII(InterfaceC1622160sJa.class, null);
        final int iLIZ = interfaceC1622160sJa.LIZ();
        EnumC1448590nnd enumC1448590nndLIZLLL = C1660530tJT.LIZLLL(iLIZ);
        boolean zLIZ = C1660530tJT.LIZ(iLIZ);
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokCameraCoreComponent init camera with cameraSpec:");
        sbLIZ.append(iLIZ);
        sbLIZ.append(",ratio:");
        sbLIZ.append(enumC1448590nndLIZLLL);
        sbLIZ.append(",encodingMP4:");
        sbLIZ.append(zLIZ);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        cameraComponentModel.enableRecordingMp4 = C1660530tJT.LIZ(iLIZ);
        c1drg.LJIIJ(InterfaceC1625720sPK.class);
        c2254091DKl.LIZ.LIZ = new AObjectS409S0100000_35(c1drg, 13);
        if (c092o != null) {
            c092o.accept(c2254091DKl);
        }
        c2254091DKl.LIZ.LIZIZ = new Function1() { // from class: X.1DL7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.Re(c1drg, iLIZ, shortVideoContext, interfaceC1622160sJa, z, (k2) obj);
            }
        };
        c2254091DKl.LJIJJLI = new InterfaceC1656270tCb() { // from class: X.1DKt
            @Override // X.InterfaceC1656270tCb
            public final void LIZ() {
            }

            @Override // X.InterfaceC1656270tCb
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1656270tCb
            public final void LIZJ() {
            }
        };
        if (((Boolean) C262960ASg.LIZ.getValue()).booleanValue()) {
            enumC1985407q8 = EnumC1985407q8.STAGE_CONSTRUCT;
        } else {
            enumC1985407q8 = EnumC1985407q8.STAGE_ON_CREATE;
        }
        c2254091DKl.LIZJ = enumC1985407q8;
        c2254091DKl.LIZIZ = new AObjectS130S0000000_35(6);
        if (c2254091DKl.LJJ == null && interfaceC2187111Aij != null) {
            c2254091DKl.LJJ = new C2187101Aii(interfaceC2187111Aij);
        }
        if (bundleLIZ != null) {
            effect = (Effect) bundleLIZ.getParcelable("first_sticker");
        }
        if (z2) {
            c2254091DKl.LJJIJ = true;
        }
        if (((Boolean) C0ABZ.LIZ.getValue()).booleanValue() && (numLIZ = C1624550sNR.LIZ(effect)) != null) {
            c2254091DKl.LIZLLL = numLIZ;
            c2254091DKl.LJ = true;
        }
        if (bundleLIZ != null && bundleLIZ.containsKey("extra_camera_facing")) {
            c2254091DKl.LIZLLL = Integer.valueOf(bundleLIZ.getInt("extra_camera_facing", 1));
            bundleLIZ.remove("extra_camera_facing");
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_soft_encode_acc", true) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        c2254091DKl.LJFF = z3;
        SettingsManager.LIZLLL().getClass();
        c2254091DKl.LJI = SettingsManager.LIZ("shoot_page_pause_render_when_leaving", false);
        SettingsManager.LIZLLL().getClass();
        c2254091DKl.LJIIIIZZ = SettingsManager.LIZ("enable_large_gesture_detect_model", true);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("close_vframe_upload", 0) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        c2254091DKl.LJIIIZ = z4;
        SettingsManager.LIZLLL().getClass();
        c2254091DKl.LJIIJ = SettingsManager.LIZ("enable_hq_vframe", false);
        c2254091DKl.LJIIJJI = ((Number) C263090ASt.LIZ.getValue()).intValue();
        c2254091DKl.LJIIL = "extract_shot";
        CreativeInfo creativeInfo2 = C1445850njD.LIZ;
        c2254091DKl.LJIILIIL = new C2298108zT(creativeInfo);
        c2254091DKl.LJIILL = 200L;
        SettingsManager.LIZLLL().getClass();
        c2254091DKl.LJIILLIIL = SettingsManager.LIZ("enable_arcore", false);
        DuetContext duetContext = cameraComponentModel.duetContext;
        String str = duetContext.duetVideoPath;
        String str2 = duetContext.duetAudioPath;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || !C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_pre_set_surface", true, false)) {
            z5 = false;
        } else {
            z5 = true;
        }
        c2254091DKl.LJII = z5;
        if (!TextUtils.equals(shortVideoContext.shootWay, "social_avatar")) {
            C2252941DGa c2252941DGa = c2254091DKl.LJIJJ;
            AFwS218S0000000_29 aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(432);
            c2252941DGa.getClass();
            c2254091DKl.LJIJJ = new C2252941DGa(aFwS218S0000000_29);
        }
        c2254091DKl.LJJI = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_surface_view_visible", true, false);
        c2254091DKl.LJJII = new InterfaceC2208871Bcj() { // from class: X.1Bci
            public final InterfaceC2208871Bcj LIZ = C2209021Bcy.LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;

            {
                boolean z6 = C0CHQ.LIZ().getAccountService().LIZ() || !C0CHQ.LIZ().getAccountService().isLogin();
                this.LIZIZ = z6;
                boolean zLIZIZ = C2208851Bch.LIZIZ();
                this.LIZJ = zLIZIZ;
                if (z6) {
                    C201955140j.LIZIZ("CameraAntiShakeV1", " -> initialize: The user is not logged in or in FTC mode");
                }
                if (zLIZIZ) {
                    C201955140j.LIZIZ("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v2");
                }
                if (!LIZIZ() || zLIZIZ) {
                    return;
                }
                C201955140j.LIZIZ("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v1");
            }

            @Override // X.InterfaceC2208871Bcj
            public final boolean LIZIZ() {
                return C2208851Bch.LIZ() || C2208851Bch.LIZIZ();
            }

            @Override // X.InterfaceC2208871Bcj
            public final boolean LIZ(Context context, C1DHX c1dhx) {
                if (this.LIZIZ) {
                    return false;
                }
                if (this.LIZJ) {
                    return true;
                }
                return this.LIZ.LIZ(context, c1dhx);
            }
        };
        if (C1660530tJT.LIZIZ(iLIZ) == VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE && cameraComponentModel.enterRecordWithSticker) {
            c2254091DKl.LJJIFFI = new C1DLQ(C0C64.LJIILLIIL().LJIJ(31744, 7, "creative_tools_fps_degradation_min", true), C0C64.LJIILLIIL().LJIJ(31744, 30, "creative_tools_fps_degradation_max", true));
        }
        c2254091DKl.LJJIIJ = ((Boolean) C0ASS.LIZ.getValue()).booleanValue();
        c2254091DKl.LJJIIZ = new AwS152S0201000_35(iLIZ, shortVideoContext, c2254091DKl, 0);
    }

    public b1(final C1DRG c1drg, final CameraComponentModel cameraComponentModel, final InterfaceC2187111Aij interfaceC2187111Aij, final CreativeInfo creativeInfo, final boolean z, InterfaceC2253451DHz interfaceC2253451DHz, Effect effect, final boolean z2, final C092O<C2254091DKl> c092o) {
        C1660690tJj c1660690tJj = new C1DI3() { // from class: X.0tJj
            public static final int LIZIZ;
            public static final int LIZJ;

            static {
                C1443590nfZ c1443590nfZ = o.LJIIJJI;
                c1443590nfZ.LIZ();
                LIZIZ = c1443590nfZ.LIZ;
                C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
                c1443590nfZ2.LIZ();
                LIZJ = c1443590nfZ2.LIZIZ;
            }

            @Override // X.C1DI3
            public final void LIZ() {
                C1DI4 c1di4 = C1DI4.LIZ;
            }

            @Override // X.C1DI3
            public final int getVideoHeight() {
                return LIZJ;
            }

            @Override // X.C1DI3
            public final int getVideoWidth() {
                return LIZIZ;
            }
        };
        C1A64 c1a64 = C1A64.LIZ;
        C092O c092o2 = new C092O() { // from class: X.1DKz
            @Override // X.C092O
            public final void accept(Object obj) {
                b1.Ve(c1drg, cameraComponentModel, c092o, z2, interfaceC2187111Aij, z, creativeInfo, (C2254091DKl) obj);
            }
        };
        o.LJFF(C2216131BoR.LIZ());
        super(c1drg, cameraComponentModel, interfaceC2187111Aij, c1660690tJj, c1a64, c092o2, new InterfaceC2253441DHy() { // from class: X.15j0
            @Override // X.InterfaceC2253441DHy
            public final C2253311DHl LIZ() {
                return new C2253311DHl();
            }

            @Override // X.InterfaceC2253441DHy
            public final boolean isAppBackground() {
                return C19712912At.LIZ.LIZJ();
            }
        }, interfaceC2253451DHz, effect);
        this.g = true;
        this.h = new C560530Lyd<>();
        this.i = new C560530Lyd<>();
        this.k = new MutableLiveData<>(Boolean.FALSE);
        this.l = false;
        this.m = true;
        this.o = false;
        this.p = new C560530Lyd<>();
        this.q = false;
        this.r = new BPEAHandler(Looper.getMainLooper());
        this.s = null;
        this.t = 0L;
        this.u = new InterfaceC2253001DGg() { // from class: X.0tJo
            @Override // X.InterfaceC2253001DGg
            public final void LIZ(C2253021DGi c2253021DGi) {
                boolean z3;
                if (c2253021DGi.LIZIZ.LIZ == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.LIZ.Mu0(Boolean.valueOf(!z3), Boolean.valueOf(!z3));
            }
        };
        this.w = false;
        this.n = C537670L6v.LIZ(c1drg, (Activity) c1drg.LJII(Activity.class, null));
        this.e = creativeInfo;
        this.d = new bck.u(V21(), this.LLLIILIL, new C2177921ALm(this));
        this.q = ((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null)).creativeModel.initialModel.recordPageOptionalConfig != null;
        this.f = ((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null)).creativeModel.ffdEventReport;
        mf();
        InterfaceC1625720sPK interfaceC1625720sPK = (InterfaceC1625720sPK) c1drg.LJIIL(null, InterfaceC1625720sPK.class);
        if (interfaceC1625720sPK != null) {
            interfaceC1625720sPK.pi0(new AObjectS409S0100000_35(this, 10));
        }
        this.j = new C538770LBb(C1660530tJT.LIZLLL(zA2()));
    }
}
