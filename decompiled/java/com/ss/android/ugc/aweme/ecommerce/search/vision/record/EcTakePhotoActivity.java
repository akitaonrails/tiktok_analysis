package com.ss.android.ugc.aweme.ecommerce.search.vision.record;

import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0A5L;
import X.C0CHQ;
import X.C0H9H;
import X.C0L4Z;
import X.C0QSJ;
import X.C0R1P;
import X.C0TVI;
import X.C0VSJ;
import X.C0ZP4;
import X.C1018703yb;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C1205704nf;
import X.C1255704vj;
import X.C12ES;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1390920mIc;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C144800gw;
import X.C144900gx;
import X.C14K9;
import X.C14KQ;
import X.C1508090pLb;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559040qfm;
import X.C168Q;
import X.C1697810uHb;
import X.C16BC;
import X.C1770850wBP;
import X.C1780100wQK;
import X.C1878350yyn;
import X.C1906580ziK;
import X.C19471811Ga;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19775812Yy;
import X.C19F0;
import X.C19ME;
import X.C1A32;
import X.C1A33;
import X.C1A34;
import X.C1A3B;
import X.C1A3X;
import X.C1A66;
import X.C1ER1;
import X.C20742216Eq;
import X.C21505619Eg;
import X.C216500sV;
import X.C216600sW;
import X.C2173111A2z;
import X.C2217381BqS;
import X.C2409809cO;
import X.C2484209oO;
import X.C275000AqA;
import X.C275210AqV;
import X.C285810BId;
import X.C293710BfF;
import X.C299020Bno;
import X.C299110Bnx;
import X.C309120C9u;
import X.C335910DEv;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C531650Kt9;
import X.C634750Ov3;
import X.C673150Qan;
import X.C675840Qf8;
import X.C675940QfI;
import X.C675950QfJ;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C971740bOW;
import X.DialogInterfaceOnDismissListenerC2189651Amp;
import X.EnumC1153060g6y;
import X.EnumC1270990jBB;
import X.EnumC335920DEw;
import X.GestureDetectorOnGestureListenerC19290210dQ;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1464200oCo;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1760590vur;
import X.InterfaceC1780750wRN;
import X.InterfaceC19675911yX;
import X.InterfaceC2183551Acz;
import X.InterfaceC2186091Ah5;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC971750bOX;
import Y.AObserverS235S0100000_33;
import Y.AfS179S0100000_10;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ttve.log.TELog2ClientInvoker;
import com.ss.android.ugc.aweme.ab.ECPhotoSearchTakePhotoOptConfig;
import com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchGuideConfigExperiment;
import com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchShootingPageOptConfigs;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendProduct;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.EcPermissionVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.IEcPermissionAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IVESDKAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.privacy.CreativeCertService;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;
import com.zhiliaoapp.musically.R;
import g1c.AjS73S0100000_33;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS147S1100000_33;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS468S0200000_33;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS59S0100100_33;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS682S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class EcTakePhotoActivity extends BaseActivity implements SurfaceHolder.Callback, IEcPreviewViewAbility, IEcPermissionAbility, IVESDKAbility, InterfaceC724530SbT, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSHELIOSQ+Kid9Piw/ICA9ZjcpKiAhLGsJKhsyIyAcISAnJwQvPSYlITE1";
    public ConstraintLayout LL;
    public FrameLayout LLILLJJLI;
    public View LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public LinearLayout LLJIJIL;
    public C20742216Eq LLJILJIL;
    public FrameLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public GestureDetectorOnGestureListenerC19290210dQ LLJJ;
    public TuxIconView LLJJI;
    public LinearLayout LLJJIII;
    public LinearLayout LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public SurfaceView LLJJJIL;
    public VECameraCapture LLJJJJ;
    public VERecorder LLJJJJJIL;
    public VEDisplaySettings LLJJJJLIIL;
    public PhotoSearchEnterParams LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public TuxSheet LLJLILLLLZIIL;
    public long LLJLLIL;
    public long LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public long LLL;
    public boolean LLLFFI;
    public ArrayList<File> LLLFZ;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public C19F0<Intent> LLLIIIL;
    public final AssemVMLazy LLLIIL;
    public boolean LLLIILIL;
    public C0R1P LLLIL;
    public C11JF LLLILZ;
    public final C01GW LLLILZJ;
    public C1559040qfm LLLILZLLLI;
    public int LLLIZZ;
    public final C01GW LLLJ;
    public final AObserverS235S0100000_33 LLLJIL;
    public boolean LLLJL;
    public float LLLL;
    public volatile IEcQRCodeScanAbility LLLLII;
    public IEcQRCodeScanAbility LLLLIIIILLL;
    public InterfaceC665370Q7z LLLLIIL;
    public C0QSJ LLLLIILL;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2058));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2056));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2060));
    public final VECameraSettings.CAMERA_FACING_ID LLJLL = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
    public boolean LLLF = true;
    public boolean LLLFF = true;
    public int LLLI = -1;
    public boolean LLLII = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcTakePhotoActivity.class, "permissionVM", "getPermissionVM()Lcom/ss/android/ugc/aweme/ecommerce/search/vision/record/permission/EcPermissionVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EcTakePhotoActivity.class, "qrCodeScanAbility", "getQrCodeScanAbility()Lcom/ss/android/ugc/aweme/ecommerce/search/vision/record/qrcode/IEcQRCodeScanAbility;", 0);
        c09r3.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility
    public final void AI1() {
        IEcExtendAlbumAbility iEcExtendAlbumAbility = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI(this, null), IEcExtendAlbumAbility.class, null);
        if (iEcExtendAlbumAbility != null) {
            iEcExtendAlbumAbility.dismiss();
        }
        r("album_extend_slide", AFwS239S0000000_8.get$arr$(46));
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == IEcQRCodeScanAbility.class) {
            this.LLLLIIIILLL = (IEcQRCodeScanAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{EcTakePhotoScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == IEcQRCodeScanAbility.class) {
            return this.LLLLIIIILLL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcTakePhotoScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcTakePhotoScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1090228589 || iHashCode == -472434776 || iHashCode == 831810521) {
            return this;
        }
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == IEcQRCodeScanAbility.class) {
            this.LLLLIIIILLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void LLLLLZL() {
        SurfaceHolder holder;
        SurfaceHolder holder2;
        SurfaceHolder holder3;
        SurfaceView surfaceView = this.LLJJJIL;
        if (surfaceView != null && (holder3 = surfaceView.getHolder()) != null) {
            holder3.removeCallback(this);
        }
        SurfaceView surfaceView2 = this.LLJJJIL;
        if (surfaceView2 != null) {
            C786410Ut5.LJLLLLLL(0, surfaceView2);
        }
        FrameLayout frameLayoutLLLZ = LLLZ();
        if (frameLayoutLLLZ != null && frameLayoutLLLZ.getChildCount() == 0) {
            this.LLJJJIL = new SurfaceView(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            SurfaceView surfaceView3 = this.LLJJJIL;
            if (surfaceView3 != null) {
                C786410Ut5.U5(surfaceView3, layoutParams);
            }
            FrameLayout frameLayoutLLLZ2 = LLLZ();
            if (frameLayoutLLLZ2 != null) {
                frameLayoutLLLZ2.addView(this.LLJJJIL);
            }
        }
        SurfaceView surfaceView4 = this.LLJJJIL;
        if (surfaceView4 != null && (holder2 = surfaceView4.getHolder()) != null) {
            holder2.setFixedSize(((Number) this.LLJL.getValue()).intValue(), ((Number) this.LLJLIL.getValue()).intValue());
        }
        SurfaceView surfaceView5 = this.LLJJJIL;
        if (surfaceView5 == null || (holder = surfaceView5.getHolder()) == null) {
            return;
        }
        holder.addCallback(this);
    }

    public final String[] LLLLZIL() {
        return (String[]) this.LLLJ.getValue();
    }

    public final TuxIconView LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cln);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ConstraintLayout LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final EcPhotoSearchAlbumVM LLLLZLLLI() {
        return (EcPhotoSearchAlbumVM) this.LLJJJ.getValue();
    }

    public final FrameLayout LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i4n);
            this.LLJJIJIIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i8j);
            this.LLJIJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final GestureDetectorOnGestureListenerC19290210dQ LLLZLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuv);
            this.LLJJ = (GestureDetectorOnGestureListenerC19290210dQ) callbackFindViewById;
        }
        return (GestureDetectorOnGestureListenerC19290210dQ) callbackFindViewById;
    }

    public final LinearLayout LLLZZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ne2);
            this.LLJJIII = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout LLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q9l);
            this.LLILLJJLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final EcPermissionVM LLZLI() {
        AssemVMLazy assemVMLazy = this.LLLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILLL;
        return (EcPermissionVM) assemVMLazy.getValue();
    }

    public final TuxTextView LLZLLLL() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qd5);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView LLZZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qd6);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout LLZZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qd8);
            this.LLJJIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility LLZZZIL() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility r0 = r4.LLLLII
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility r0 = r4.LLLLII     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLLIILL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLIIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLLIIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoScope> r1 = com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLLIILL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility> r0 = com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLLII = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity.LLZZZIL():com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility
    public final void N3() {
        t("extend_album");
        IEcExtendAlbumAbility iEcExtendAlbumAbility = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI(this, null), IEcExtendAlbumAbility.class, null);
        if (iEcExtendAlbumAbility != null) {
            iEcExtendAlbumAbility.dismiss();
        }
        r("album_extend_slide", AFwS239S0000000_8.get$arr$(47));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.IEcPermissionAbility
    public final void Pr() {
        C19741112Lp.LIZ.getClass();
        Intent intentLIZJ = C19741112Lp.LIZJ(this);
        C19F0<Intent> c19f0 = this.LLLIIIL;
        if (c19f0 != null) {
            c19f0.LIZ(intentLIZJ);
        }
    }

    public final void T() {
        VECameraCapture vECameraCapture = this.LLJJJJ;
        if (vECameraCapture != null) {
            vECameraCapture.LJJI(true, null);
        }
        VERecorder vERecorder = this.LLJJJJJIL;
        if (vERecorder != null) {
            C1A33 c1a33 = new InterfaceC2183551Acz() { // from class: X.1A33
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                }
            };
            C2484209oO.LJI("VERecorder", "stopPreviewAsync");
            k kVar = vERecorder.LIZIZ;
            kVar.LJJLI = c1a33;
            kVar.LJJJJ(true);
        }
        IEcQRCodeScanAbility iEcQRCodeScanAbilityLLZZZIL = LLZZZIL();
        if (iEcQRCodeScanAbilityLLZZZIL != null) {
            iEcQRCodeScanAbilityLLZZZIL.lA1();
        }
        U(false);
    }

    public final TuxIconView f() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zm4);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView g() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zm5);
            this.LLJILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView h() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zpb);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView i() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zpc);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void j() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.y40);
            this.LLJJI = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.I7(new AjS73S0100000_33(this, 0), viewFindViewById);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity.l():void");
    }

    public final boolean o() {
        return ((Boolean) this.LLLILZJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onResume", true);
        super.onResume();
        if (this.LLLII) {
            C1A3X.LIZ.getClass();
            if (C1A3X.LIZJ(this) && !this.LLLIILIL) {
                N();
            }
        }
        if (this.LLLF) {
            PhotoSearchEnterParams photoSearchEnterParams = this.LLJJL;
            C675840Qf8.LIZ("enter_record", "on_resume", null, (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null) ? null : Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType), null, new AwS612S0100000_33(this, 55), 500);
        }
        this.LLLIILIL = false;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onResume", false);
    }

    public final void u() {
        SurfaceHolder holder;
        SurfaceView surfaceView = this.LLJJJIL;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this);
        }
        FrameLayout frameLayoutLLLZ = LLLZ();
        if (frameLayoutLLLZ != null) {
            C786410Ut5.LJJJJIZL(frameLayoutLLLZ);
        }
        SurfaceView surfaceView2 = this.LLJJJIL;
        if (surfaceView2 != null) {
            C786410Ut5.LJLLLLLL(8, surfaceView2);
        }
    }

    public EcTakePhotoActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcPermissionVM.class);
        this.LLLIIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 171), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2057), AFwS279S0000000_33.get$arr$(96));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 172));
        this.LLLILZLLLI = new C1559040qfm(0, ECSearchPhotoSearchShootingPageOptConfigs.LIZ(), ECSearchPhotoSearchShootingPageOptConfigs.LIZJ());
        this.LLLJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(270));
        this.LLLJIL = new AObserverS235S0100000_33(this, 2);
        this.LLLL = -1.0f;
    }

    public final void M() {
        if ((o() && (C144900gx.LIZ() || C144800gw.LIZ())) || (o() && C1ER1.LIZIZ.LJLLJ())) {
            C339190DRl.LIZIZ(LLZLLLL());
            C339190DRl.LIZIZ(LLZZ());
        } else if (o() || !(C285810BId.LIZ() || ((ECSearchPhotoSearchShootingPageOptConfigs.ShootingPageOptConfig) ECSearchPhotoSearchShootingPageOptConfigs.LIZIZ.getValue()).showBottomText)) {
            C337180DJs.LIZJ(LLZLLLL());
            C339190DRl.LIZIZ(LLZZ());
        } else {
            C339190DRl.LIZIZ(LLZLLLL());
            C337180DJs.LIZJ(LLZZ());
        }
    }

    public final void N() {
        u();
        LLLLLZL();
        VECameraCapture vECameraCapture = this.LLJJJJ;
        if (vECameraCapture != null) {
            vECameraCapture.LJ(CertProviderManagerKt.findCert("bpea-photo_search_only_request_open_camera_reconstruct", 1476788487));
        }
        VERecorder vERecorder = this.LLJJJJJIL;
        if (vERecorder != null) {
            vERecorder.LJJJI(null, new InterfaceC2183551Acz() { // from class: X.1A2v
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                    IEcQRCodeScanAbility iEcQRCodeScanAbilityLLZZZIL = this.LIZ.LLZZZIL();
                    if (iEcQRCodeScanAbilityLLZZZIL != null) {
                        iEcQRCodeScanAbilityLLZZZIL.CF1();
                    }
                }
            });
        }
    }

    public final void V() {
        if (o()) {
            C339190DRl.LIZIZ(i());
            C339190DRl.LIZIZ(h());
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), LLLZIL());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility
    public final boolean Vp1() {
        return o();
    }

    public final void n() {
        C1A32 c1a32;
        this.LLJLLL = System.currentTimeMillis();
        C1A66.LIZIZ();
        if (((Boolean) C0A5L.LIZ.getValue()).booleanValue()) {
            C0CHQ.LIZ().LJJ();
        } else {
            C1A66.LIZJ(this, C786410Ut5.W3().getAbsolutePath());
        }
        C1A66.LJFF((byte) 7);
        C971740bOW.LIZ = new InterfaceC971750bOX() { // from class: X.1A36
            @Override // X.InterfaceC971750bOX
            public final void LIZ(int i, String str) {
            }
        };
        TELog2ClientInvoker.nativeInit();
        TELog2ClientInvoker.nativeSetIsToLogcat(true);
        if (Intrinsics.LJFF("oneplus", Build.BRAND.toLowerCase(Locale.ROOT))) {
            c1a32 = new C1A32(720, 1280);
        } else if (((ECPhotoSearchTakePhotoOptConfig) C1A34.LIZIZ.getValue()).isAdjustPreviewSize) {
            int iLIZ = C1508090pLb.LIZ();
            if (iLIZ == 1) {
                c1a32 = new C1A32(540, 960);
            } else if (iLIZ != 2) {
                C1A32.Companion.getClass();
                c1a32 = new C1A32(C14KQ.LJIIIIZZ(this), C14KQ.LJ(this) - C14KQ.LIZLLL(this));
            } else {
                c1a32 = new C1A32(720, 1280);
            }
        } else {
            C1A32.Companion.getClass();
            c1a32 = new C1A32(C14KQ.LJIIIIZZ(this), C14KQ.LJ(this) - C14KQ.LIZLLL(this));
        }
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE2);
        HashMap<EnumC1270990jBB, Cert> map = new HashMap<>();
        map.put(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA, CreativeCertService.LIZ().getExceptionCloseCameraCert());
        builder.setCameraPrivacyCertMap(map);
        builder.setPreviewSize(c1a32.width, c1a32.height);
        builder.setCameraFacing(this.LLJLL);
        VECameraSettings vECameraSettingsBuild = builder.build();
        VECameraCapture vECameraCapture = new VECameraCapture();
        this.LLJJJJ = vECameraCapture;
        vECameraCapture.LLIZLLLIL = new InterfaceC2186091Ah5() { // from class: X.1A2x
            @Override // X.InterfaceC2186111Ah7
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC2186111Ah7
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2186091Ah5
            public final void onError(int i, String str) {
            }

            @Override // X.InterfaceC2186091Ah5
            public final void onInfo(int i, int i2, String str) {
                Integer numValueOf;
                PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
                if (i == 3) {
                    VECameraCapture vECameraCapture2 = this.LIZ.LLJJJJ;
                    if (vECameraCapture2 != null) {
                        vECameraCapture2.LLJILJIL.queryZoomAbility(vECameraCapture2, true);
                    }
                    this.LIZ.LLL = System.currentTimeMillis();
                    EcTakePhotoActivity ecTakePhotoActivity = this.LIZ;
                    if (!ecTakePhotoActivity.LLJJLIIIJLLLLLLLZ) {
                        ecTakePhotoActivity.LLJJLIIIJLLLLLLLZ = true;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Long lValueOf = Long.valueOf(jCurrentTimeMillis - this.LIZ.LLJLLIL);
                        PhotoSearchEnterParams photoSearchEnterParams = this.LIZ.LLJJL;
                        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
                            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
                        } else {
                            numValueOf = null;
                        }
                        C675840Qf8.LIZ("enter_page", "take_photo", lValueOf, numValueOf, null, new AwS59S0100100_33(jCurrentTimeMillis, this.LIZ, 1), 496);
                    }
                }
            }
        };
        vECameraCapture.LLIZ = new InterfaceC1780750wRN() { // from class: X.1A31
            @Override // X.InterfaceC1780750wRN
            public final void LIZLLL(float f, int i, boolean z) {
            }

            @Override // X.InterfaceC1780750wRN
            public final void LJII() {
            }

            @Override // X.InterfaceC1780750wRN
            public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
                this.LIZ.LLLL = f;
            }
        };
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        vECameraCapture.LJIIL(applicationContext, vECameraSettingsBuild);
        C0VSJ c0vsj = new C0VSJ(getFilesDir(), "ve_test");
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            c0vsj.mkdirs();
        }
        String absolutePath = c0vsj.getAbsolutePath();
        VEPreviewSettings.Builder builder2 = new VEPreviewSettings.Builder();
        if (o() && (C144900gx.LIZ() || C144800gw.LIZ())) {
            builder2.setGraphMode(EnumC1153060g6y.QR_CODE_GRAPH);
        }
        VEPreviewSettings vEPreviewSettingsBuild = builder2.build();
        getApplicationContext();
        VERecorder vERecorder = new VERecorder(absolutePath);
        this.LLJJJJJIL = vERecorder;
        vERecorder.LIZ(new InterfaceC1464200oCo() { // from class: X.1A37
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str) {
                EcTakePhotoActivity ecTakePhotoActivity;
                VERecorder vERecorder2;
                if (i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mic audio delay:");
                    sbLIZ.append(i2);
                    sbLIZ.append("ms");
                    C2484209oO.LJI("Recorder", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
                    EcTakePhotoActivity ecTakePhotoActivity2 = this.LL;
                    VEDisplaySettings.Builder builder3 = new VEDisplaySettings.Builder();
                    builder3.setFitMode(EnumC1778840wOI.SCALE_MODE_CENTER_CROP);
                    ecTakePhotoActivity2.LLJJJJLIIL = builder3.build();
                    EcTakePhotoActivity ecTakePhotoActivity3 = this.LL;
                    VERecorder vERecorder3 = ecTakePhotoActivity3.LLJJJJJIL;
                    if (vERecorder3 != null) {
                        vERecorder3.LJJI(ecTakePhotoActivity3.LLJJJJLIIL);
                    }
                    if (((ECPhotoSearchTakePhotoOptConfig) C1A34.LIZIZ.getValue()).isOptVEInternal && (vERecorder2 = (ecTakePhotoActivity = this.LL).LLJJJJJIL) != null) {
                        vERecorder2.LJJIZ(ecTakePhotoActivity.LLJJJJ);
                    }
                }
            }
        });
        this.LLJJJJLIIL = new VEDisplaySettings.Builder().build();
        VERecorder vERecorder2 = this.LLJJJJJIL;
        if (vERecorder2 != null) {
            vERecorder2.LJIILIIL(((ECPhotoSearchTakePhotoOptConfig) C1A34.LIZIZ.getValue()).isOptVEInternal ? null : this.LLJJJJ, new C1780100wQK(1).LIZ(), new VEAudioEncodeSettings.Builder().Build(), vEPreviewSettingsBuild, false);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.LLLI = 0;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() throws JSONException {
        String str;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        C0R1P c0r1p;
        super.onDestroy();
        VECameraCapture vECameraCapture = this.LLJJJJ;
        if (vECameraCapture != null) {
            vECameraCapture.LJJIII();
        }
        VERecorder vERecorder = this.LLJJJJJIL;
        if (vERecorder != null) {
            vERecorder.LJIILJJIL();
        }
        C1A3B c1a3bLIZ = C1A3B.LIZ();
        if (c1a3bLIZ.LIZ) {
            c1a3bLIZ.LIZ = false;
        }
        Integer numValueOf = null;
        C1558520qew.LJIIJJI(C1558360qeg.LJI(this, null), IEcPreviewViewAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJI(this, null), IEcPermissionAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJI(this, null), IVESDKAbility.class, null);
        try {
            ArrayList<File> arrayList = this.LLLFZ;
            if (arrayList != null) {
                Iterator<File> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().delete();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (o() && (c0r1p = this.LLLIL) != null) {
            v(C0R1P.LIZ(c0r1p, 0L, (System.currentTimeMillis() - c0r1p.LIZ) + c0r1p.LIZIZ, 5));
        }
        this.LLLIL = null;
        C11JF c11jf = this.LLLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLLILZ = null;
        PhotoSearchEnterParams photoSearchEnterParams = this.LLJJL;
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams3.rootEnterFromType);
        }
        C675840Qf8.LIZ("enter_record", "on_destory", null, numValueOf, null, new AwS612S0100000_33(this, 53), 500);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Scene.SCENE_SERVICE, "leave");
            linkedHashMap.put("page_name", "photo_search_record");
            linkedHashMap.put("duration", Long.valueOf(this.LLL - this.LLJLLIL));
            PhotoSearchEnterParams photoSearchEnterParams2 = this.LLJJL;
            linkedHashMap.put("root_enter_from_type", Integer.valueOf((photoSearchEnterParams2 == null || (photoSearchBusinessEnterParams2 = photoSearchEnterParams2.businessParams) == null) ? -1 : photoSearchBusinessEnterParams2.rootEnterFromType));
            PhotoSearchEnterParams photoSearchEnterParams3 = this.LLJJL;
            if (photoSearchEnterParams3 == null || (photoSearchBusinessEnterParams = photoSearchEnterParams3.businessParams) == null || (str = photoSearchBusinessEnterParams.enterMethod) == null) {
                str = "error";
            }
            linkedHashMap.put("enter_method", str);
            linkedHashMap.put("last_state", Integer.valueOf(this.LLLIZZ));
            C1018703yb.LIZIZ("rd_tiktokec_search_trace", linkedHashMap);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (C1205704nf.LIZ()) {
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZJ.clear();
            C675950QfJ.LIZLLL.clear();
        }
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        super.onPause();
        T();
        if (this.LLLF) {
            this.LLLF = false;
            int i = this.LLLI;
            String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "on_pause" : "on_pause_jump" : "on_pause_exception" : "on_pause_icon" : "on_pause_back";
            PhotoSearchEnterParams photoSearchEnterParams = this.LLJJL;
            C675840Qf8.LIZ("enter_record", str, null, (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null) ? null : Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType), null, new AwS612S0100000_33(this, 54), 500);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.LLLIL == null) {
            this.LLLIL = new C0R1P(System.currentTimeMillis(), "return");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        u();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IVESDKAbility
    public final VERecorder Jz0() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility
    public final PhotoSearchEnterParams j80() {
        return this.LLJJL;
    }

    public final void K(AlbumPreviewFragment albumPreviewFragment) {
        C16BC c16bcLJJIIZ;
        BottomSheetBehavior<?> bottomSheetBehavior;
        TuxSheetBehavior<?> tuxSheetBehavior;
        int iLIZJ = C418440Gaw.LIZJ(this);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIJI = albumPreviewFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LIZIZ(iLIZJ, iLIZJ);
        c1390920mIc.LJIIIIZZ(2);
        c1390920mIc.LIZ.LLJJIJIIJIL = false;
        if (((Number) C216500sV.LIZ.getValue()).intValue() == 0 && (c16bcLJJIIZ = C1255704vj.LIZ().LJJIIZ()) != null) {
            if (C299110Bnx.LIZ()) {
                if ((c16bcLJJIIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJJIIZ) != null) {
                    c1390920mIc.LIZ.LLLIIIIL = tuxSheetBehavior;
                }
            } else if ((c16bcLJJIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJJIIZ) != null) {
                c1390920mIc.LIZ.LLLIIII = bottomSheetBehavior;
            }
        }
        DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp = new DialogInterfaceOnDismissListenerC2189651Amp(this, 4);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC2189651Amp;
        this.LLJLILLLLZIIL = tuxSheet2;
        tuxSheet2.show(getSupportFragmentManager(), "photo_search");
    }

    public final void U(boolean z) {
        if (z) {
            VECameraCapture vECameraCapture = this.LLJJJJ;
            if (vECameraCapture != null) {
                vECameraCapture.LJJLIIIIJ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH);
            }
            C786410Ut5.LJLLLLLL(8, f());
            C786410Ut5.LJLLLLLL(0, g());
            return;
        }
        VECameraCapture vECameraCapture2 = this.LLJJJJ;
        if (vECameraCapture2 != null) {
            vECameraCapture2.LJJLIIIIJ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF);
        }
        C786410Ut5.LJLLLLLL(8, g());
        C786410Ut5.LJLLLLLL(0, f());
    }

    public final void W(boolean z) {
        if (!z && !ECSearchPhotoSearchShootingPageOptConfigs.LIZIZ() && !o()) {
            C339190DRl.LIZIZ(LLLZZIL());
            return;
        }
        C337180DJs.LIZJ(LLLZZIL());
        if (!this.LLLJL) {
            this.LLLJL = true;
            r("photo_search_upload_button_show", new AwS612S0100000_33(this, 219));
        }
        C786410Ut5.I7(new AjS73S0100000_33(this, 1), LLLZZIL());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.IEcPermissionAbility
    public final void nb0(AwS468S0200000_33 awS468S0200000_33) {
        C1A3X c1a3x = C1A3X.LIZ;
        c1a3x.getClass();
        if (!C1A3X.LIZIZ(this)) {
            String[] strArrLLLLZIL = LLLLZIL();
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-photo_search_request_album_permission");
            AwS468S0200000_33 awS468S0200000_332 = new AwS468S0200000_33(this, awS468S0200000_33, 8);
            c1a3x.getClass();
            C1A3X.LJ(this, strArrLLLLZIL, tokenCertWith, awS468S0200000_332);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Integer numValueOf;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        String str;
        String str2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        C19ME c19me;
        LinearLayout linearLayoutLLLZZIL;
        TuxIconView tuxIconView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams4;
        String stringExtra;
        String str3;
        ConstraintLayout constraintLayoutLLLLZLLIL;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onCreate", true);
        if (!((Boolean) C275000AqA.LIZ.getValue()).booleanValue()) {
            setTheme(R.style.xu);
        }
        super.onCreate(bundle);
        this.LLJZ = System.currentTimeMillis();
        C1A3X.LIZ.getClass();
        if (C1A3X.LIZJ(this) && ((ECPhotoSearchTakePhotoOptConfig) C1A34.LIZIZ.getValue()).isEarlyInitVE) {
            this.LLLIILIL = true;
        }
        if (this.LLLIILIL) {
            n();
            N();
        }
        setContentView(R.layout.bqc);
        if (Build.VERSION.SDK_INT >= 35 && (constraintLayoutLLLLZLLIL = LLLLZLLIL()) != null) {
            C14K9.LJIJJ(constraintLayoutLLLLZLLIL, new C0TVI() { // from class: X.0rsJ
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        if (this.LLLIILIL) {
            LLLLLZL();
        }
        C19471811Ga.LIZ.getClass();
        this.LLLIIII = C19471811Ga.LIZ();
        LLLLZLLLI();
        Serializable serializableExtra = getIntent().getSerializableExtra("photo_search_enter_param");
        Integer numValueOf2 = null;
        if (serializableExtra != null && (serializableExtra instanceof PhotoSearchEnterParams)) {
            PhotoSearchEnterParams photoSearchEnterParams2 = (PhotoSearchEnterParams) serializableExtra;
            this.LLJJL = photoSearchEnterParams2;
            PhotoSearchLogEnterParams photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams;
            if ((photoSearchLogEnterParams2 == null || (str3 = photoSearchLogEnterParams2.photoSearchModule) == null || str3.length() == 0) && (photoSearchEnterParams = this.LLJJL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
                photoSearchLogEnterParams.setPhotoSearchModule("visual_search");
            }
            PhotoSearchEnterParams photoSearchEnterParams3 = this.LLJJL;
            if (photoSearchEnterParams3 != null && (photoSearchBusinessEnterParams4 = photoSearchEnterParams3.businessParams) != null) {
                try {
                    stringExtra = getIntent().getStringExtra("source_btm_token");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                photoSearchBusinessEnterParams4.setSourceBtmToken(stringExtra);
            }
        }
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLLLLZLLLI = LLLLZLLLI();
        if (ecPhotoSearchAlbumVMLLLLZLLLI != null) {
            ecPhotoSearchAlbumVMLLLLZLLLI.LLILZIL = o();
        }
        this.LLJLLIL = getIntent().getLongExtra("intent_value_time_call_tools_api", 0L);
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        tuxImmersionBar.LJFF(-16777216);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        C1558520qew.LJII(C1558360qeg.LJI(this, null), this, IEcPreviewViewAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJI(this, null), this, IEcPermissionAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJI(this, null), this, IVESDKAbility.class, null, null);
        this.LLLIIIL = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.1A30
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                this.LIZ.LLZLI().wQ2(this.LIZ, true);
            }
        });
        int i = 4;
        if (o() && C309120C9u.LIZ().enable != 0) {
            int iLIZLLL = (C418440Gaw.LIZLLL(this) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))) / 4;
            this.LLLILZLLLI = new C1559040qfm(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)) + ((int) (((double) iLIZLLL) * C309120C9u.LIZ().showingPicRows)) + (C309120C9u.LIZ().showingPicRows > ((int) C309120C9u.LIZ().showingPicRows) ? (int) C309120C9u.LIZ().showingPicRows : ((int) C309120C9u.LIZ().showingPicRows) - 1), true, true);
        } else {
            C1559040qfm c1559040qfm = this.LLLILZLLLI;
            this.LLLILZLLLI = new C1559040qfm((int) (((double) C12ES.LJIIIIZZ(this)) * 0.19d), c1559040qfm.LLILLJJLI, c1559040qfm.LLILLL);
        }
        C723850SaN.LIZIZ(this, new AwS603S0100000_24(this, 62));
        LLZLI().wQ2(this, false);
        C736680Sv4.LJIIIIZZ(this, LLZLI(), new C2217381BqS() { // from class: X.1A2D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LL);
            }
        }, null, new AwS647S0100000_33(this, 46), 6);
        C736680Sv4.LJIIIZ(this, LLZLI(), new C2217381BqS() { // from class: X.1A2K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.1A2F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LLILLL);
            }
        }, null, new AwS682S0100000_33(this, 12), 12);
        int i2 = 2;
        if (o() && (linearLayoutLLLZZIL = LLLZZIL()) != null && (tuxIconView = (TuxIconView) linearLayoutLLLZZIL.findViewById(R.id.lyv)) != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (!o()) {
                    i = 2;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                if (marginLayoutParams.bottomMargin != iLIZIZ || marginLayoutParams.width != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) || marginLayoutParams.height != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) {
                    marginLayoutParams.bottomMargin = iLIZIZ;
                    marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    C786410Ut5.M6(tuxIconView, marginLayoutParams);
                }
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, linearLayoutLLLZZIL.getChildCount());
                ArrayList arrayList = new ArrayList();
                C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    View childAt = linearLayoutLLLZZIL.getChildAt(it2.nextInt());
                    if (childAt != null) {
                        arrayList.add(childAt);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof TuxTextView) {
                        arrayList2.add(obj);
                    }
                }
                TextView textView = (TextView) C13LP.LJJJLL(arrayList2);
                if (textView != null) {
                    textView.setShadowLayer(C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(1), 520093696);
                }
            }
        }
        C1A3X c1a3x = C1A3X.LIZ;
        c1a3x.getClass();
        if (!C1A3X.LIZLLL(this, new String[]{"android.permission.CAMERA"})) {
            if (((Boolean) C275000AqA.LIZ.getValue()).booleanValue()) {
                C337180DJs.LIZJ(LLLLZLLIL());
                C337180DJs.LIZJ(LLZ());
                View viewFindViewById = this.LLILLL;
                if (viewFindViewById == null) {
                    viewFindViewById = findViewById(R.id.q9i);
                    this.LLILLL = viewFindViewById;
                }
                C337180DJs.LIZJ(viewFindViewById);
                if (ECSearchPhotoSearchShootingPageOptConfigs.LIZIZ() || o()) {
                    LLLLZI(LLLLZLL(), true);
                    LLLLZI(f(), true);
                    View viewFindViewById2 = this.LLILZLL;
                    if (viewFindViewById2 == null) {
                        viewFindViewById2 = findViewById(R.id.zm7);
                        this.LLILZLL = (TuxTextView) viewFindViewById2;
                    }
                    LLLLZI(viewFindViewById2, true);
                    LLLLZI(h(), true);
                    LLLLZI(i(), true);
                    C337180DJs.LIZJ(LLLZIL());
                    ViewGroup.LayoutParams layoutParams2 = LLZ().getLayoutParams();
                    if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                        View viewFindViewById3 = this.LLJILJIL;
                        if (viewFindViewById3 == null) {
                            viewFindViewById3 = findViewById(R.id.jr0);
                            this.LLJILJIL = (C20742216Eq) viewFindViewById3;
                        }
                        c19me.bottomToBottom = viewFindViewById3.getId();
                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                        C786410Ut5.a6(LLZ(), c19me);
                    }
                }
                M();
                j();
                V();
                if (!C1A3X.LIZJ(this)) {
                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-photo_search_request_camera_permission");
                    AwS647S0100000_33 awS647S0100000_33 = new AwS647S0100000_33(this, 47);
                    c1a3x.getClass();
                    C1A3X.LJ(this, new String[]{"android.permission.CAMERA"}, tokenCertWith, awS647S0100000_33);
                }
            } else {
                TokenCert tokenCertWith2 = TokenCert.Companion.with("bpea-photo_search_only_reuqest_camera_permission_record_reconstruct");
                AwS647S0100000_33 awS647S0100000_332 = new AwS647S0100000_33(this, 7);
                c1a3x.getClass();
                C1A3X.LJ(this, new String[]{"android.permission.CAMERA"}, tokenCertWith2, awS647S0100000_332);
            }
        } else {
            C786410Ut5.LJLLLLLL(0, LLLLZLLIL());
            this.LLLFFI = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            PhotoSearchEnterParams photoSearchEnterParams4 = this.LLJJL;
            if (photoSearchEnterParams4 != null && (photoSearchBusinessEnterParams = photoSearchEnterParams4.businessParams) != null) {
                numValueOf = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
            } else {
                numValueOf = null;
            }
            C675840Qf8.LIZ("enter_record", "on_created", null, numValueOf, null, new AwS59S0100100_33(jCurrentTimeMillis, this, 0), 500);
        }
        c1a3x.getClass();
        boolean zLIZLLL = C1A3X.LIZLLL(this, new String[]{"android.permission.CAMERA"});
        boolean zLIZLLL2 = C1A3X.LIZLLL(this, LLLLZIL());
        boolean zLIZ = C1A3X.LIZ(this);
        if (zLIZLLL2) {
            str = "full access";
            i2 = 1;
        } else if (zLIZ) {
            str = "limit access";
        } else {
            str = "not allow";
            i2 = 0;
        }
        r("photo_search_page_view", new C2173111A2z(i2, zLIZLLL, str));
        this.LLLIL = new C0R1P(System.currentTimeMillis(), "enter");
        this.LLLILZ = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS179S0100000_10(this, 17));
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PhotoSearchEnterParams photoSearchEnterParams5 = this.LLJJL;
        if (photoSearchEnterParams5 != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams5.businessParams) != null) {
            str2 = photoSearchBusinessEnterParams3.sourceBtmToken;
        } else {
            str2 = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b8516", str2);
        C634750Ov3 c634750Ov3 = C634750Ov3.LIZ;
        PhotoSearchEnterParams photoSearchEnterParams6 = this.LLJJL;
        if (photoSearchEnterParams6 != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams6.businessParams) != null) {
            numValueOf2 = Integer.valueOf(photoSearchBusinessEnterParams2.rootEnterFromType);
        }
        c634750Ov3.getClass();
        C634750Ov3.LIZJ(numValueOf2);
        if (o() && ((Number) C216600sW.LIZ.getValue()).intValue() == 1) {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            TuxIconView tuxIconViewLLLLZLL = LLLLZLL();
            if (tuxIconViewLLLLZLL != null) {
                tuxIconViewLLLLZLL.setIconRes(R.raw.icon_magnifying_glass_fill);
            }
            TuxIconView tuxIconViewLLLLZLL2 = LLLLZLL();
            if (tuxIconViewLLLLZLL2 != null) {
                tuxIconViewLLLLZLL2.setTintColorRes(R.attr.z_);
            }
            TuxIconView tuxIconViewLLLLZLL3 = LLLLZLL();
            if (tuxIconViewLLLLZLL3 != null) {
                tuxIconViewLLLLZLL3.setIconWidth(iLIZIZ2);
            }
            TuxIconView tuxIconViewLLLLZLL4 = LLLLZLL();
            if (tuxIconViewLLLLZLL4 != null) {
                tuxIconViewLLLLZLL4.setIconHeight(iLIZIZ2);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.LLLI = 3;
    }

    public final void setPermissionGuideBackgroundFromXml(View view) {
        this.LLILLL = view;
    }

    @Override // X.C19FO, android.app.Activity
    public final void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        VERecorder vERecorder = this.LLJJJJJIL;
        if (vERecorder != null) {
            vERecorder.LIZJ(surfaceHolder.getSurface());
        }
    }

    public final void t(String str) {
        ISysRecommendAbility iSysRecommendAbility;
        if (!C275210AqV.LIZ()) {
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLLLLZLLLI = LLLLZLLLI();
            if (ecPhotoSearchAlbumVMLLLLZLLLI != null) {
                ecPhotoSearchAlbumVMLLLLZLLLI.wQ2(this, new AwS147S1100000_33(this, str, 0));
                return;
            }
            return;
        }
        AlbumPreviewFragment albumPreviewFragment = new AlbumPreviewFragment();
        PhotoSearchEnterParams photoSearchEnterParams = this.LLJJL;
        C1559040qfm c1559040qfm = this.LLLILZLLLI;
        C19775812Yy c19775812Yy = new C19775812Yy(this, 1);
        C0L4Z c0l4z = new C0L4Z(this, str);
        albumPreviewFragment.LLJILJILJ = photoSearchEnterParams;
        albumPreviewFragment.LLJILLL = str;
        albumPreviewFragment.LLJILJIL = c19775812Yy;
        albumPreviewFragment.LLJIJIL = c0l4z;
        albumPreviewFragment.LLJJIJI = c1559040qfm;
        K(albumPreviewFragment);
        this.LLLII = false;
        T();
        if (!this.LLLIIII && ECSearchPhotoSearchGuideConfigExperiment.LIZ().enable && ECSearchPhotoSearchGuideConfigExperiment.LIZ().style == 1 && (iSysRecommendAbility = (ISysRecommendAbility) C1558520qew.LIZ(C1558360qeg.LJI(this, null), ISysRecommendAbility.class, null)) != null) {
            iSysRecommendAbility.dismiss();
        }
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLLLLZLLLI2 = LLLLZLLLI();
        if (ecPhotoSearchAlbumVMLLLLZLLLI2 == null) {
            return;
        }
        ecPhotoSearchAlbumVMLLLLZLLLI2.wQ2(this, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[PHI: r11
      0x003d: PHI (r11v2 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:16:0x003b, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(X.C0R1P r13) throws org.json.JSONException {
        /*
            r12 = this;
            long r0 = r13.LIZIZ
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L9c
            long r3 = r13.LIZ
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L9c
            X.1A3X r3 = X.C1A3X.LIZ
            java.lang.String r2 = "android.permission.CAMERA"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r3.getClass()
            boolean r6 = X.C1A3X.LIZLLL(r12, r2)
            java.lang.String[] r2 = r12.LLLLZIL()
            boolean r3 = X.C1A3X.LIZLLL(r12, r2)
            boolean r2 = X.C1A3X.LIZ(r12)
            if (r3 == 0) goto L9f
            r5 = 1
        L2c:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r3 = r12.LLJJL
            java.lang.String r10 = ""
            if (r3 == 0) goto L3a
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r2 = r3.logParams
            if (r2 == 0) goto L3a
            java.lang.String r11 = r2.searchEntrance
            if (r11 != 0) goto L3d
        L3a:
            r11 = r10
            if (r3 == 0) goto L46
        L3d:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r2 = r3.logParams
            if (r2 == 0) goto L46
            java.lang.String r2 = r2.searchEntrance
            if (r2 == 0) goto L46
            r10 = r2
        L46:
            r4 = 0
            if (r3 == 0) goto L9d
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r2 = r3.logParams
            if (r2 == 0) goto L9d
            java.lang.String r9 = r2.middlePageId
        L4f:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r5 = r13.LIZJ
            com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService r3 = com.ss.android.ugc.aweme.ecommerce.search.EComModelSearchDependencyService.LJ()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "search_entrance"
            r2.put(r0, r11)
            java.lang.String r1 = "current_page"
            java.lang.String r0 = "search_blankpage"
            r2.put(r1, r0)
            java.lang.String r1 = "photo_search_module"
            java.lang.String r0 = "visual_search"
            r2.put(r1, r0)
            java.lang.String r0 = "enter_from"
            r2.put(r0, r10)
            java.lang.String r0 = "impr_id"
            r2.put(r0, r9)
            java.lang.String r0 = "duration"
            r2.put(r0, r8)
            java.lang.String r0 = "album_authorized"
            r2.put(r0, r7)
            java.lang.String r0 = "camera_authorized"
            r2.put(r0, r6)
            java.lang.String r0 = "enter_type"
            r2.put(r0, r5)
            java.lang.String r0 = "photo_search_middle_stay_duration"
            r3.LIZIZ(r0, r2, r4, r4)
        L9c:
            return
        L9d:
            r9 = r4
            goto L4f
        L9f:
            if (r2 == 0) goto La3
            r5 = 2
            goto L2c
        La3:
            r5 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity.v(X.0R1P):void");
    }

    public final void w(JSONObject jSONObject) {
        int i;
        C1A3X.LIZ.getClass();
        boolean zLIZLLL = C1A3X.LIZLLL(this, new String[]{"android.permission.CAMERA"});
        boolean zLIZLLL2 = C1A3X.LIZLLL(this, LLLLZIL());
        boolean zLIZ = C1A3X.LIZ(this);
        if (zLIZLLL2) {
            i = 1;
        } else if (zLIZ) {
            i = 2;
        } else {
            i = 0;
        }
        jSONObject.put("camera_authorized", zLIZLLL ? 1 : 0);
        jSONObject.put("album_authorized", i);
        jSONObject.put("button_name", "upload");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1A2u] */
    public static void L(final EcTakePhotoActivity ecTakePhotoActivity, List list) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i;
        ecTakePhotoActivity.getClass();
        if (!list.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = ecTakePhotoActivity.LLZZLLIL().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            IEcExtendAlbumAbility iEcExtendAlbumAbility = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI(ecTakePhotoActivity, null), IEcExtendAlbumAbility.class, null);
            if (iEcExtendAlbumAbility != 0) {
                iEcExtendAlbumAbility.JB1(list, null);
                iEcExtendAlbumAbility.sS1(new InterfaceC19675911yX() { // from class: X.1A2u
                    @Override // X.InterfaceC19675911yX
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC19675911yX
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC19675911yX
                    public final void LIZJ() {
                        ViewGroup.MarginLayoutParams marginLayoutParams2;
                        ViewGroup.LayoutParams layoutParams2 = this.LIZ.LLZZLLIL().getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            if (marginLayoutParams2 != null) {
                                marginLayoutParams2.bottomMargin = i;
                            }
                        } else {
                            marginLayoutParams2 = null;
                        }
                        C786410Ut5.m6(this.LIZ.LLZZLLIL(), marginLayoutParams2);
                        IEcQRCodeScanAbility iEcQRCodeScanAbilityLLZZZIL = this.LIZ.LLZZZIL();
                        if (iEcQRCodeScanAbilityLLZZZIL != null) {
                            iEcQRCodeScanAbilityLLZZZIL.VR0(0);
                        }
                    }

                    @Override // X.InterfaceC19675911yX
                    public final void LIZLLL(int i2) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2;
                        ViewGroup.LayoutParams layoutParams2 = this.LIZ.LLZZLLIL().getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            if (marginLayoutParams2 != null) {
                                marginLayoutParams2.bottomMargin = i + i2;
                            }
                        } else {
                            marginLayoutParams2 = null;
                        }
                        C786410Ut5.m6(this.LIZ.LLZZLLIL(), marginLayoutParams2);
                        IEcQRCodeScanAbility iEcQRCodeScanAbilityLLZZZIL = this.LIZ.LLZZZIL();
                        if (iEcQRCodeScanAbilityLLZZZIL != null) {
                            iEcQRCodeScanAbilityLLZZZIL.VR0(i2);
                        }
                    }
                });
                iEcExtendAlbumAbility.show(0);
                ecTakePhotoActivity.r("album_extend_show", null);
            }
        }
    }

    public static void LLLLZI(View view, boolean z) {
        if (z) {
            C786410Ut5.T4(view, 0.34f);
            C337180DJs.LIZJ(view);
            view.setClickable(false);
        } else {
            C786410Ut5.T4(view, 1.0f);
            C337180DJs.LIZJ(view);
            view.setClickable(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility
    public final void Jh1(int i, MediaModel mediaModel) {
        p(mediaModel.LJFF(), PageType.ALBUM, "choose_album_extend_panel", null, null, null);
        r("album_photo_click", new AwS23S0001000_8(i, 13));
    }

    public final void r(String str, Function1<? super JSONObject, Unit> function1) {
        C675940QfI.LIZJ(str, this.LLJJL, function1);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility
    public final void yn1(SysRecommendFeedItem sysRecommendFeedItem, PageType pageType, String str) {
        String str2;
        String str3;
        List<Image> list;
        Image image;
        List<String> urls;
        SysRecommendProduct sysRecommendProduct = sysRecommendFeedItem.product;
        if (sysRecommendProduct == null || (list = sysRecommendProduct.images) == null || (image = (Image) C13LP.LJJJLZIJ(0, list)) == null || (urls = image.getUrls()) == null || (str2 = (String) C13LP.LJJJLZIJ(0, urls)) == null) {
            str2 = "";
        }
        SysRecommendProduct sysRecommendProduct2 = sysRecommendFeedItem.product;
        if (sysRecommendProduct2 != null) {
            str3 = sysRecommendProduct2.productId;
        } else {
            str3 = null;
        }
        p(str2, pageType, str, str3, null, null);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        VERecorder vERecorder = this.LLJJJJJIL;
        if (vERecorder != null) {
            vERecorder.LIZJ(surfaceHolder.getSurface());
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r34, com.ss.android.ugc.aweme.shortvideo.model.PageType r35, java.lang.String r36, java.lang.String r37, android.graphics.Bitmap r38, java.lang.Long r39) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity.p(java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.PageType, java.lang.String, java.lang.String, android.graphics.Bitmap, java.lang.Long):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
