package com.ss.android.ugc.profile.business.ur.ui;

import X.C01GW;
import X.C0FNV;
import X.C0HZQ;
import X.C0PEM;
import X.C0VSJ;
import X.C0WYJ;
import X.C0WZX;
import X.C0XIR;
import X.C10I2;
import X.C1202420hOa;
import X.C1232140iAW;
import X.C1232410iAx;
import X.C1233040iBy;
import X.C1245180iVY;
import X.C1250680ieQ;
import X.C1255030ilR;
import X.C12ES;
import X.C1308910kAL;
import X.C1322200kVm;
import X.C1324405Gg;
import X.C1354920lMY;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13LP;
import X.C1697810uHb;
import X.C189K;
import X.C18JV;
import X.C19388110tD;
import X.C1954807lC;
import X.C19739112Kv;
import X.C19739412Ky;
import X.C19741912Lx;
import X.C19HG;
import X.C20012913Sd;
import X.C20684815ws;
import X.C21508119Ff;
import X.C21509219Fq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2354709Kn;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C452501pT;
import X.C785410UrT;
import X.C786410Ut5;
import X.C817503Hh;
import X.C830320Whi;
import X.DialogC1389620mGW;
import X.EnumC040100Ch;
import X.EnumC1254860ilA;
import X.EnumC19388010tC;
import X.EnumC335920DEw;
import X.EnumC992830bwX;
import X.InterfaceC1232420iAy;
import X.InterfaceC1255040ilS;
import X.InterfaceC21509619Fu;
import Y.ACListenerS166S0100000_32;
import Y.ATListenerS464S0100000_32;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS72S1000000_22;

/* JADX INFO: loaded from: classes33.dex */
public final class CropActivity extends BaseActivity implements InterfaceC1255040ilS, InterfaceC1232420iAy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiHELIOSKzogISspOjx9PTdiPCZ9CzcjOQ4wPCw6IDsq";
    public TuxTextView LL;
    public ConstraintLayout LLILLJJLI;
    public C19739412Ky LLILLL;
    public C19HG LLILZ;
    public C19739112Kv LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public LinearLayout LLJ;
    public C0HZQ LLJI;
    public FrameLayout LLJIJIL;
    public FrameLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public C19739412Ky LLJJ;
    public C19HG LLJJI;
    public C19739112Kv LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public C0HZQ LLJJJJ;
    public String LLJJJJJIL;
    public C1255030ilR LLJJJJLIIL;
    public C1245180iVY LLJJL;
    public C1232410iAx LLJJLIIIJLLLLLLLZ;
    public UrlModel LLJL;
    public String LLJLIL = "";
    public String LLJLILLLLZIIL = "";
    public String LLJLL = "";
    public FrameLayout LLJLLIL;
    public boolean LLJLLL;
    public final String LLJZ;
    public String LLJZIJLIL;
    public boolean LLL;
    public final Set<String> LLLF;
    public final Matrix LLLFF;
    public final float[] LLLFFI;
    public final float[] LLLFZ;
    public boolean LLLI;
    public Bitmap LLLII;
    public Rect LLLIIII;
    public DialogC1389620mGW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public Uri LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final AwS576S0100000_32 LLLLL;

    static {
        new C21508119Ff();
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(String str) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.CropActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.CropActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.CropActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.CropActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZI() {
        DialogC1389620mGW dialogC1389620mGW = this.LLLIIIIL;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        try {
            DialogC1389620mGW dialogC1389620mGW2 = this.LLLIIIIL;
            if (dialogC1389620mGW2 != null) {
                dialogC1389620mGW2.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final int LLLLZLLIL() {
        return ((Number) this.LLLLIILL.getValue()).intValue();
    }

    public final int LLLZ() {
        return ((Number) this.LLLIILIL.getValue()).intValue();
    }

    public final String LLLZIL() {
        return (String) this.LLLLILI.getValue();
    }

    public final boolean LLLZZIL() {
        return ((Boolean) this.LLLL.getValue()).booleanValue();
    }

    public final boolean LLZLI() {
        return ((Boolean) this.LLLLIL.getValue()).booleanValue();
    }

    public final Pair<String, Integer> LLZZZIL() {
        boolean z;
        int iLLLZ = LLLZ();
        C0VSJ c0vsj = iLLLZ != 6 ? iLLLZ != 7 ? new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileHeaderCrop.png") : new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "groupChatCrop.png") : new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "bulletinHeaderCrop.png");
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("clear_storage_available_space_minimum_limitation", 1048576);
        long jLJFF = C0WYJ.LJFF(C1202420hOa.LIZ());
        if (jLJFF < iLJ) {
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            Application applicationLIZ = C1202420hOa.LIZ();
            c1232140iAW.getClass();
            C1232140iAW.LIZJ(applicationLIZ, "saveToFile storage low", null, null, jLJFF, null);
            z = true;
        } else {
            z = false;
        }
        C19HG c19hg = this.LLJJI;
        String absolutePath = null;
        if (c19hg == null) {
            c19hg = null;
        }
        Bitmap bitmap = this.LLLII;
        if (bitmap == null) {
            bitmap = null;
        }
        Pair<Bitmap, Integer> pairLLLLZLLLI = LLLLZLLLI(c19hg, bitmap);
        if (z && pairLLLLZLLLI.getFirst() == null) {
            C1232140iAW c1232140iAW2 = C1232140iAW.LIZ;
            Application applicationLIZ2 = C1202420hOa.LIZ();
            long jLJFF2 = C0WYJ.LJFF(C1202420hOa.LIZ());
            Boolean bool = Boolean.FALSE;
            c1232140iAW2.getClass();
            C1232140iAW.LIZJ(applicationLIZ2, "saveToFile getCropBitmap", null, null, jLJFF2, bool);
        }
        if (pairLLLLZLLLI.getFirst() == null) {
            C1232140iAW c1232140iAW3 = C1232140iAW.LIZ;
            Application applicationLIZ3 = C1202420hOa.LIZ();
            long jLJFF3 = C0WYJ.LJFF(C1202420hOa.LIZ());
            c1232140iAW3.getClass();
            C1232140iAW.LIZJ(applicationLIZ3, "first saveToFile getCropBitmap", null, null, jLJFF3, null);
            C830320Whi c830320Whi = C830320Whi.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCropBitmap freeSpace: ");
            sbLIZ.append(c0vsj.getFreeSpace());
            sbLIZ.append('}');
            C830320Whi.LIZIZ(c830320Whi, null, C2188811AlT.LIZIZ(sbLIZ), null, null, false, 29);
        }
        Bitmap first = pairLLLLZLLLI.getFirst();
        if (first == null) {
            return new Pair<>(null, pairLLLLZLLLI.getSecond());
        }
        boolean zLIZJ = C830320Whi.LIZ.LIZJ(first, c0vsj.getParent(), c0vsj.getName(), true);
        if (z) {
            C1232140iAW c1232140iAW4 = C1232140iAW.LIZ;
            Application applicationLIZ4 = C1202420hOa.LIZ();
            long jLJFF4 = C0WYJ.LJFF(C1202420hOa.LIZ());
            Boolean boolValueOf = Boolean.valueOf(zLIZJ);
            c1232140iAW4.getClass();
            absolutePath = null;
            C1232140iAW.LIZJ(applicationLIZ4, "saveToFile saveBitmapToSD failed", null, null, jLJFF4, boolValueOf);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saveToFile:");
        sbLIZ2.append(zLIZJ ? c0vsj.getAbsolutePath() : "null");
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("saveBitmapToSD status: ");
        sbLIZ3.append(zLIZJ);
        sbLIZ3.append(' ');
        sbLIZ3.append(c0vsj.length());
        C2344809Gs.LIZLLL(4, "CropActivity", C2188811AlT.LIZIZ(sbLIZ3));
        if (zLIZJ) {
            absolutePath = c0vsj.getAbsolutePath();
        }
        return new Pair<>(absolutePath, 2131834205);
    }

    public final void f() {
        DialogC1389620mGW dialogC1389620mGW = this.LLLIIIIL;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LLLIIIIL;
        if (dialogC1389620mGW2 != null) {
            dialogC1389620mGW2.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW2);
        }
        C1389880mGw c1389880mGw = new C1389880mGw(this);
        c1389880mGw.LJ(R.raw.icon_tick_circle);
        c1389880mGw.LJI(R.attr.ee);
        c1389880mGw.LJIIIIZZ(2131858159);
        c1389880mGw.LIZLLL(500L);
        c1389880mGw.LIZJ(this.LLLLL);
        c1389880mGw.LJIIJ();
    }

    public CropActivity() {
        String uri;
        UrlModel avatarThumb = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getAvatarThumb();
        this.LLJZ = (avatarThumb == null || (uri = avatarThumb.getUri()) == null) ? "" : uri;
        this.LLJZIJLIL = "";
        this.LLLF = new LinkedHashSet();
        this.LLLFF = new Matrix();
        this.LLLFFI = new float[9];
        this.LLLFZ = new float[9];
        this.LLLIIIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(109), "extra_min_width", Integer.class);
        this.LLLIIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(108), "extra_min_height", Integer.class);
        this.LLLIILIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(112), "extra_source_type", Integer.class);
        this.LLLILZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(107), "is_oval", Boolean.class);
        this.LLLILZJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(465), "rect_ratio", Float.class);
        this.LLLILZLLLI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(111), "rect_margin", Integer.class);
        this.LLLIZZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(110), "original_url", String.class);
        this.LLLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(106), "extra_need_update_avatar", Boolean.class);
        this.LLLJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(115), "extra_upload_avatar", Boolean.class);
        this.LLLJL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(114), "extra_show_post_to_story", Boolean.class);
        this.LLLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(116), "extra_use_new_ui", Boolean.class);
        this.LLLLII = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(103), "enter_method", String.class);
        this.LLLLIIIILLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(102), "btn_name", String.class);
        this.LLLLIIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(105), "is_from_camera", Boolean.class);
        this.LLLLIILL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(464), "avatar_upload_scene", Integer.class);
        this.LLLLIILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(101), "avatar_upload_track_param", Serializable.class);
        this.LLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS278S0000000_32.get$arr$(104), "is_from_aigc_flow", Boolean.class);
        this.LLLLILI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(113), "path_mode", String.class);
        this.LLLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2439));
        this.LLLLJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(123));
        this.LLLLL = new AwS576S0100000_32(this, 382);
    }

    public final TuxTextView LLLZLZ() {
        if (!LLZLLLL()) {
            return null;
        }
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rm5);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final boolean LLZLLLL() {
        return LLLZ() != 1101 || LLLLZLLIL() == EnumC1254860ilA.SIGNUP.getValue();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C189K c189k = C189K.LIZ;
        boolean zLLZLI = LLZLI();
        String strLLLZIL = LLLZIL();
        C18JV c18jv = C18JV.BACK;
        c189k.getClass();
        C189K.LIZ(zLLZLI, strLLLZIL, c18jv);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (LLLZZIL()) {
            C1250680ieQ.LJIJJLI(C1250680ieQ.LIZ, "photo", C13LP.LLIIII(this.LLLF));
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService().clearEditPageData();
        DialogC1389620mGW dialogC1389620mGW = this.LLLIIIIL;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        this.LLLIIIIL = null;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
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

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) throws Throwable {
        String str;
        C1245180iVY c1245180iVY;
        EnumC992830bwX enumC992830bwX;
        if (!isDestroyed() && !isFinishing() && avatarUri != null && avatarUri.uri != null) {
            Map<String, String> mapLIZ = null;
            String str2 = "";
            if (((Boolean) this.LLLJ.getValue()).booleanValue()) {
                C1245180iVY c1245180iVY2 = this.LLJJL;
                if (c1245180iVY2 != null) {
                    c1245180iVY2.LIZ = avatarUri.uri;
                    if (LLZLI()) {
                        enumC992830bwX = EnumC992830bwX.AIGC_PROFILE;
                    } else {
                        enumC992830bwX = EnumC992830bwX.USER_PROFILE;
                    }
                    c1245180iVY2.LJ = enumC992830bwX;
                }
                if ((LLLLZLLIL() == EnumC1254860ilA.TWO_HEADER.getValue() || LLLLZLLIL() == EnumC1254860ilA.ENLARGE_AVATAR.getValue()) && (c1245180iVY = this.LLJJL) != null) {
                    c1245180iVY.LIZJ = "";
                }
                C1232410iAx c1232410iAx = this.LLJJLIIIJLLLLLLLZ;
                if (c1232410iAx != null) {
                    C1245180iVY c1245180iVY3 = this.LLJJL;
                    if (c1245180iVY3 != null) {
                        mapLIZ = c1245180iVY3.LIZ();
                    }
                    c1232410iAx.LIZIZ(mapLIZ);
                }
                if (LLZLI()) {
                    C0HZQ c0hzq = this.LLJJJJ;
                    if (c0hzq != null && c0hzq.isChecked()) {
                        return;
                    }
                    ((IProfileAIGCService) ServiceManager.get().getService(IProfileAIGCService.class)).LIZ();
                    return;
                }
                return;
            }
            LLLLZI();
            Intent intent = new Intent();
            intent.setData(this.LLLIL);
            String str3 = avatarUri.uri;
            if (str3 == null) {
                str3 = "";
            }
            intent.putExtra("uri", str3);
            List<String> list = avatarUri.urlList;
            if (list != null && (str = (String) C13LP.LJJJLL(list)) != null) {
                str2 = str;
            }
            intent.putExtra("url", str2);
            C2204961BRm.V(this, -1, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4vUMV5iDnFKUFiti", null));
            finish();
        }
    }

    public final void LLLLLZL(String str) {
        DialogC1389620mGW dialogC1389620mGW;
        this.LLLIL = Uri.fromFile(new C0VSJ(str));
        if (((Boolean) this.LLLJIL.getValue()).booleanValue()) {
            DialogC1389620mGW dialogC1389620mGW2 = this.LLLIIIIL;
            if (dialogC1389620mGW2 == null) {
                DialogC1389620mGW dialogC1389620mGW3 = new DialogC1389620mGW(this);
                dialogC1389620mGW3.LJJLJ(2131858177);
                this.LLLIIIIL = dialogC1389620mGW3;
                C0FNV.LIZJ(dialogC1389620mGW3);
            } else if (!dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = this.LLLIIIIL) != null) {
                C786410Ut5.J4(dialogC1389620mGW);
            }
            this.LLJJJJJIL = str;
            C1255030ilR c1255030ilR = this.LLJJJJLIIL;
            if (c1255030ilR != null) {
                c1255030ilR.LIZIZ(str);
            }
            C1255030ilR c1255030ilR2 = this.LLJJJJLIIL;
            if (c1255030ilR2 != null) {
                c1255030ilR2.LJII(LLLZ());
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(new C0VSJ(str)));
        C2204961BRm.V(this, -1, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4vUMV5iDnFKUFiti", null));
        finish();
    }

    public final Bundle LLLLZLL(Function1<? super Bundle, Unit> function1) {
        String str;
        boolean z;
        int iLLLLZLLIL;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("creation_id", UUID.randomUUID().toString(), bundle);
        if (LLZLI()) {
            str = "ai_avatar";
        } else {
            str = "profile_photo";
        }
        C786410Ut5.LJJJI("shoot_way", str, bundle);
        C786410Ut5.LJJJI("enter_from", "personal_homepage", bundle);
        C786410Ut5.LJJJI("origin_avatar_uri", this.LLJZ, bundle);
        C786410Ut5.LJJJI("origin_avatar_url", this.LLJLIL, bundle);
        bundle.putBoolean("is_aivatar", LLZLI());
        C786410Ut5.LJJJI("path_mode", LLLZIL(), bundle);
        C786410Ut5.LJJJI("origin_no_crop_avatar_path", this.LLJZIJLIL, bundle);
        C786410Ut5.LJJJI("cover_avatar_path", this.LLJLL, bundle);
        if (LLLZ() == 0 && (iLLLLZLLIL = LLLLZLLIL()) != EnumC1254860ilA.SIGNUP.getValue() && iLLLLZLLIL != EnumC1254860ilA.PROMPT.getValue() && iLLLLZLLIL != EnumC1254860ilA.ENLARGE_AVATAR.getValue() && (iLLLLZLLIL == EnumC1254860ilA.EDIT_PROFILE.getValue() || iLLLLZLLIL == EnumC1254860ilA.TWO_HEADER.getValue() || iLLLLZLLIL == EnumC1254860ilA.PROFILE.getValue() || LLLLZLLIL() < 0)) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("skip_decorative_info_stickers", z);
        function1.invoke(bundle);
        return bundle;
    }

    public final void LLZ(Intent intent) throws Throwable {
        String stringExtra;
        String stringExtra2;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("new_uri");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
                if (intent == null) {
                    stringExtra2 = null;
                }
                if (stringExtra == null) {
                } else {
                    return;
                }
            }
            try {
                stringExtra2 = intent.getStringExtra("new_url");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
            if (stringExtra == null && stringExtra2 != null) {
                Intent intent2 = new Intent();
                intent2.setData(Uri.fromFile(new C0VSJ(this.LLJZIJLIL)));
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(stringExtra);
                urlModel.setUrlList(Collections.singletonList(stringExtra2));
                intent2.putExtra("path", urlModel);
                intent2.putExtra("dismiss_dialog", true);
                C2204961BRm.V(this, -1, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt4vUMV5iDnFKUFiti", null));
                finish();
            }
        }
    }

    public final void LLZZ(String str) {
        if (str != null && str.length() != 0) {
            Bundle bundleLLLLZLL = LLLLZLL(new AwS146S1100000_32(str, this, 6));
            this.LLJLLL = true;
            IAvatarPublishStoryService.DefaultImpls.openEditPage$default(((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService(), this, bundleLLLLZLL, str, this.LLJZIJLIL, false, new AwS611S0100000_32(this, 191), 16, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006c A[EXC_TOP_SPLITTER, PHI: r3
      0x006c: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v6 java.lang.String) binds: [B:28:0x0067, B:30:0x006a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZZLLIL(boolean r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.CropActivity.LLZZLLIL(boolean):void");
    }

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
        C1245180iVY c1245180iVY;
        String str;
        if (z) {
            C10I2.LIZ.getClass();
            if (!C10I2.LIZ()) {
                C0HZQ c0hzq = this.LLJJJJ;
                if (c0hzq == null) {
                    c0hzq = null;
                }
                if (c0hzq.isChecked() && (c1245180iVY = this.LLJJL) != null && c1245180iVY.LIZ != null) {
                    if (c1245180iVY == null || (str = c1245180iVY.LIZ) == null) {
                        str = "";
                    }
                    IAvatarPublishStoryService.DefaultImpls.publishDirectly$default(((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService(), this, LLLLZLL(new AwS72S1000000_22(str, 11)), false, false, new C19741912Lx(this), 8, null);
                    return;
                }
            }
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.19Fr] */
    public final void g(GradientDrawable gradientDrawable) {
        EnumC040100Ch enumC040100Ch;
        EnumC19388010tC enumC19388010tC;
        if (ComplianceServiceProvider.LJIJJLI().LIZLLL()) {
            enumC040100Ch = EnumC040100Ch.FIRST_PUBLISH;
        } else {
            enumC040100Ch = EnumC040100Ch.NORMAL;
        }
        String str = this.LLJLILLLLZIIL;
        FrameLayout frameLayout = this.LLJLLIL;
        if (LLZLI()) {
            enumC19388010tC = EnumC19388010tC.ROUND_CORNER_RECT;
        } else {
            enumC19388010tC = EnumC19388010tC.DEFAULT;
        }
        C21509219Fq c21509219Fq = new C21509219Fq(str, this, frameLayout, gradientDrawable, enumC19388010tC, new InterfaceC21509619Fu() { // from class: X.19Fr
            @Override // X.InterfaceC21509619Fu
            public final void LIZ() {
                CropActivity cropActivity = this.LIZ;
                cropActivity.LLLLLZL(cropActivity.LLJZIJLIL);
            }

            @Override // X.InterfaceC21509619Fu
            public final void LIZIZ() {
                CropActivity cropActivity = this.LIZ;
                cropActivity.LLZZ(cropActivity.LLJLIL);
            }

            @Override // X.InterfaceC21509619Fu
            public final void LIZJ(boolean z) {
                this.LIZ.i(z, true);
                C1232140iAW c1232140iAW = C1232140iAW.LIZ;
                C0HZQ c0hzq = this.LIZ.LLJJJJ;
                C0HZQ c0hzq2 = null;
                if (c0hzq == null) {
                    c0hzq = null;
                }
                boolean zIsChecked = c0hzq.isChecked();
                c1232140iAW.getClass();
                C1232140iAW.LIZ(zIsChecked);
                Keva keva = C21509519Ft.LIZ;
                C0HZQ c0hzq3 = this.LIZ.LLJJJJ;
                if (c0hzq3 != null) {
                    c0hzq2 = c0hzq3;
                }
                C21509519Ft.LIZ(c0hzq2.isChecked());
            }
        });
        if (enumC040100Ch == EnumC040100Ch.NORMAL) {
            C786410Ut5.LLLLZLL(c21509219Fq.LJIILIIL, 8);
            C786410Ut5.LLLLZLL(c21509219Fq.LJIILJJIL, 8);
        } else {
            C786410Ut5.LJZ(8, c21509219Fq.LJIIIIZZ);
        }
        c21509219Fq.LJIIJ.setChecked(true);
        Uri uriFromFile = Uri.fromFile(new C0VSJ(str));
        frameLayout.addView(c21509219Fq.LIZLLL);
        if (Build.VERSION.SDK_INT >= 35) {
            c21509219Fq.LIZLLL.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.14K8
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Insets insets = windowInsets.getInsets(7);
                    view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                    return windowInsets;
                }
            });
            if (c21509219Fq.LIZLLL.isAttachedToWindow()) {
                c21509219Fq.LIZLLL.requestApplyInsets();
            }
        }
        C1322200kVm.LIZ().LIZJ(uriFromFile);
        c21509219Fq.LJIIJJI.setImageURI(uriFromFile);
        c21509219Fq.LIZLLL.setOnTouchListener(new ATListenerS464S0100000_32(c21509219Fq, 4));
        C1232140iAW.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "profile_photo");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("default_publish_status", "checked");
        C20684815ws.LJIILLIIL("default_publish_window_show", c2344009Gk.LIZ);
        C786410Ut5.E9(c21509219Fq.LJFF, new ACListenerS166S0100000_32(c21509219Fq, 78));
        C786410Ut5.b9(c21509219Fq.LJIIJ, new ACListenerS166S0100000_32(c21509219Fq, 79));
        C786410Ut5.O7(c21509219Fq.LJIIIIZZ, new ACListenerS166S0100000_32(c21509219Fq, 80));
        RemoteImageView remoteImageView = c21509219Fq.LJFF;
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(20));
        remoteImageView.setBackground(gradientDrawable);
        c21509219Fq.LJII.setOnTouchListener(new View.OnTouchListener() { // from class: X.19Fv
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        C786410Ut5.Y7(c21509219Fq.LJII, new View.OnClickListener() { // from class: X.19Fw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        C786410Ut5.a9(c21509219Fq.LJI, new ACListenerS166S0100000_32(c21509219Fq, 81));
        C786410Ut5.h9(c21509219Fq.LJIIIZ, new ACListenerS166S0100000_32(c21509219Fq, 76));
        C786410Ut5.I7(new ACListenerS166S0100000_32(c21509219Fq, 77), c21509219Fq.LIZLLL);
    }

    public final void h(String str) {
        if (LLLZZIL()) {
            C1250680ieQ.LJIJJ(C1250680ieQ.LIZ, "photo", str);
        }
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
        C1354920lMY.LIZJ(this, exc);
        LLLLZI();
    }

    public final void j(int i) {
        if (LLZLLLL()) {
            KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.rsd);
                this.LLJILJILJ = (TuxTextView) callbackFindViewById;
            }
            ((TextView) callbackFindViewById).setTextColor(i);
            KeyEvent.Callback callbackFindViewById2 = this.LLJILLL;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = findViewById(R.id.rqt);
                this.LLJILLL = (TuxIconView) callbackFindViewById2;
            }
            ((TuxIconView) callbackFindViewById2).setTintColor(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0605 A[PHI: r3
      0x0605: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v13 java.lang.String) binds: [B:244:0x0511, B:259:0x055e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0257 A[EXC_TOP_SPLITTER, PHI: r14
      0x0257: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String) binds: [B:100:0x0252, B:102:0x0255] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0221  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.CropActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("change_avatar_normal_post_in_publish_page", false)) {
            LLZ(intent);
        }
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

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        C1354920lMY.LIZJ(this, exc);
        LLLLZI();
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        if (exc instanceof C0XIR) {
            c1389890mGx.LJIIJ(((C0XIR) exc).getErrorMsg());
        } else {
            c1389890mGx.LJIIIZ(2131829445);
        }
        c1389890mGx.LJIIJJI();
    }

    public final Pair<Bitmap, Integer> LLLLZLLLI(C19HG c19hg, Bitmap bitmap) {
        boolean z;
        RectF rectFLIZLLL = c19hg.LIZLLL(null);
        if (this.LLLIIII == null) {
            C2344809Gs.LIZLLL(6, "CropActivity", "getCropBitmap mWindowRect is null");
        }
        if (this.LLLIIII == null) {
            return new Pair<>(bitmap, 2131834205);
        }
        float width = bitmap.getWidth() / rectFLIZLLL.width();
        float height = bitmap.getHeight() / rectFLIZLLL.height();
        int i = (int) ((r5.left - rectFLIZLLL.left) * width);
        if (i < 0) {
            i = 0;
        }
        int i2 = (int) ((r5.top - rectFLIZLLL.top) * height);
        if (i2 < 0) {
            i2 = 0;
        }
        int iWidth = (int) (r5.width() * width);
        int width2 = bitmap.getWidth() - i;
        if (iWidth > width2) {
            iWidth = width2;
        }
        int iHeight = (int) (r5.height() * height);
        int height2 = bitmap.getHeight() - i2;
        if (iHeight > height2) {
            iHeight = height2;
        }
        if (iWidth >= ((Number) this.LLLIIIL.getValue()).intValue() && iHeight >= ((Number) this.LLLIIL.getValue()).intValue()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i2, iWidth, iHeight);
            int width3 = bitmapCreateBitmap.getWidth();
            int width4 = bitmap.getWidth() - i;
            if (width3 <= width4) {
                width4 = width3;
            }
            int height3 = bitmapCreateBitmap.getHeight();
            int height4 = bitmap.getHeight() - i2;
            if (height3 <= height4) {
                height4 = height3;
            }
            int i3 = 0;
            loop0: while (true) {
                if (i3 < width4) {
                    int i4 = height4 - 10;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    while (i4 < height4) {
                        try {
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C2344809Gs.LJI(e);
                        } catch (IllegalStateException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C2344809Gs.LJI(e2);
                        }
                        if (bitmap.getPixel(i + i3, i2 + i4) == bitmapCreateBitmap.getPixel(i3, i4)) {
                            i4++;
                        } else {
                            z = false;
                            break loop0;
                        }
                    }
                    i3++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("crop is successful ");
                sbLIZ.append(width);
                sbLIZ.append(' ');
                sbLIZ.append(height);
                sbLIZ.append(' ');
                sbLIZ.append(i);
                sbLIZ.append(' ');
                sbLIZ.append(i2);
                sbLIZ.append(' ');
                sbLIZ.append(iWidth);
                sbLIZ.append(' ');
                sbLIZ.append(iHeight);
                C2344809Gs.LIZLLL(4, "CropActivity", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i);
                sbLIZ2.append(' ');
                sbLIZ2.append(i2);
                sbLIZ2.append(' ');
                sbLIZ2.append(iWidth);
                sbLIZ2.append(' ');
                sbLIZ2.append(iHeight);
                sbLIZ2.append(' ');
                sbLIZ2.append(bitmap.getWidth());
                sbLIZ2.append(' ');
                sbLIZ2.append(bitmap.getHeight());
                sbLIZ2.append(' ');
                sbLIZ2.append(bitmap.getConfig());
                C2344809Gs.LIZLLL(6, "CropActivity", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return new Pair<>(bitmapCreateBitmap, 2131834205);
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        Application applicationLIZ = C1202420hOa.LIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getCropBitmap image is so small w: ");
        sbLIZ3.append(iWidth);
        sbLIZ3.append(", h: ");
        sbLIZ3.append(iHeight);
        sbLIZ3.append("，mMinCropWidth: ");
        sbLIZ3.append(((Number) this.LLLIIIL.getValue()).intValue());
        sbLIZ3.append(", mMinCropHeight: ");
        sbLIZ3.append(((Number) this.LLLIIL.getValue()).intValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        long jLJFF = C0WYJ.LJFF(C1202420hOa.LIZ());
        c1232140iAW.getClass();
        C1232140iAW.LIZJ(applicationLIZ, strLIZIZ, null, null, jLJFF, null);
        C2344809Gs.LIZLLL(6, "CropActivity", "picture is too small");
        return new Pair<>(null, 2131840047);
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        UrlModel avatarMedium;
        if (user != null) {
            avatarMedium = user.getAvatarMedium();
        } else {
            avatarMedium = null;
        }
        this.LLJL = avatarMedium;
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C1233040iBy c1233040iBy = new C1233040iBy(this);
            c1233040iBy.LIZJ(str);
            c1233040iBy.LIZLLL();
        }
    }

    public final void i(boolean z, boolean z2) {
        TuxTextView tuxTextView = null;
        if (z2) {
            C0HZQ c0hzq = this.LLJJJJ;
            if (c0hzq == null) {
                c0hzq = null;
            }
            c0hzq.setChecked(z);
        }
        C0HZQ c0hzq2 = this.LLJJJJ;
        if (c0hzq2 == null) {
            c0hzq2 = null;
        }
        if (c0hzq2.isChecked()) {
            TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            tuxTextView.setText(getString(2131845017));
            return;
        }
        TuxTextView tuxTextView3 = this.LLJJIJIIJIL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        tuxTextView.setText(tuxTextView.getContext().getString(2131833263));
    }

    public final void LLLLZIL(Bitmap bitmap, GradientDrawable gradientDrawable, EnumC19388010tC enumC19388010tC) {
        int iLJIIJ;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        String absolutePath;
        String absolutePath2;
        String absolutePath3;
        String absolutePath4;
        int[] iArr = C19388110tD.LIZ;
        if (iArr[enumC19388010tC.ordinal()] == 1) {
            iLJIIJ = C12ES.LJIIJ(this) - ((int) C12ES.LIZJ(96.0f, this));
        } else {
            iLJIIJ = (C12ES.LJIIJ(this) * 3) / 5;
        }
        float f = iLJIIJ;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f / bitmapCreateBitmap.getWidth(), f / bitmapCreateBitmap.getHeight());
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
        int i = iArr[enumC19388010tC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                float width = (bitmapCreateBitmap3.getWidth() / 2) - C12ES.LIZJ(1.0f, this);
                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                canvas.drawColor(0);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight());
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                float f2 = 2;
                canvas.drawCircle(bitmapCreateBitmap3.getWidth() / f2, bitmapCreateBitmap3.getHeight() / f2, bitmapCreateBitmap3.getWidth() / f2, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmapCreateBitmap3, rect, rect, paint);
                canvas.drawColor(0);
                Paint paint2 = new Paint();
                paint2.setColor(-1);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                paint2.setStrokeWidth(C12ES.LIZJ(2.0f, this));
                paint2.setAntiAlias(true);
                canvas.drawCircle(bitmapCreateBitmap3.getWidth() / f2, bitmapCreateBitmap3.getHeight() / f2, width, paint2);
            } else {
                throw new C1954807lC();
            }
        } else {
            float fLIZJ = C12ES.LIZJ(32.0f, this);
            bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint3 = new Paint();
            Rect rect2 = new Rect(0, 0, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight());
            paint3.setAntiAlias(true);
            canvas2.drawARGB(0, 0, 0, 0);
            canvas2.drawRoundRect(0.0f, 0.0f, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight(), fLIZJ, fLIZJ, paint3);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(bitmapCreateBitmap3, rect2, rect2, paint3);
            canvas2.drawColor(0);
        }
        if (bitmapCreateBitmap2 == null) {
            bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        int iLJIIJ2 = C12ES.LJIIJ(this);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(this);
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(iLJIIJ2, iLJIIIIZZ, Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap4);
        float f3 = 2;
        String absolutePath5 = null;
        canvas3.drawBitmap(bitmapCreateBitmap2, (iLJIIJ2 / f3) - (bitmapCreateBitmap2.getWidth() / f3), (iLJIIIIZZ / f3) - (bitmapCreateBitmap2.getHeight() / f3), (Paint) null);
        canvas3.drawColor(0);
        bitmapCreateBitmap4.setHasAlpha(true);
        int iLJIIJ3 = C12ES.LJIIJ(this);
        int iLJIIIIZZ2 = C12ES.LJIIIIZZ(this);
        Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(iLJIIJ3, iLJIIIIZZ2, Bitmap.Config.ARGB_8888);
        Canvas canvas4 = new Canvas(bitmapCreateBitmap5);
        gradientDrawable.setBounds(0, 0, canvas4.getWidth(), canvas4.getHeight());
        gradientDrawable.draw(canvas4);
        canvas4.drawBitmap(bitmapCreateBitmap2, (iLJIIJ3 / f3) - (bitmapCreateBitmap2.getWidth() / f3), (iLJIIIIZZ2 / f3) - (bitmapCreateBitmap2.getHeight() / f3), (Paint) null);
        C0VSJ c0vsj = new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileRoundCrop.png");
        C830320Whi c830320Whi = C830320Whi.LIZ;
        boolean zLIZJ = c830320Whi.LIZJ(bitmapCreateBitmap4, c0vsj.getParent(), c0vsj.getName(), true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveToFile:");
        String absolutePath6 = "null";
        if (!zLIZJ) {
            absolutePath = "null";
        } else {
            absolutePath = c0vsj.getAbsolutePath();
        }
        sbLIZ.append(absolutePath);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saveBitmapToSD status: ");
        sbLIZ2.append(zLIZJ);
        sbLIZ2.append(' ');
        sbLIZ2.append(c0vsj.length());
        C2344809Gs.LIZLLL(4, "CropActivity", C2188811AlT.LIZIZ(sbLIZ2));
        if (zLIZJ) {
            absolutePath5 = c0vsj.getAbsolutePath();
        }
        String str = (String) new Pair(absolutePath5, 2131834205).getFirst();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LLJLIL = str;
        C0VSJ c0vsj2 = new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileTransCrop.png");
        boolean zLIZJ2 = c830320Whi.LIZJ(bitmapCreateBitmap2, c0vsj2.getParent(), c0vsj2.getName(), true);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("saveToFile:");
        if (!zLIZJ2) {
            absolutePath2 = "null";
        } else {
            absolutePath2 = c0vsj2.getAbsolutePath();
        }
        sbLIZ3.append(absolutePath2);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("saveBitmapToSD status: ");
        sbLIZ4.append(zLIZJ2);
        sbLIZ4.append(' ');
        sbLIZ4.append(c0vsj2.length());
        C2344809Gs.LIZLLL(4, "CropActivity", C2188811AlT.LIZIZ(sbLIZ4));
        if (zLIZJ2) {
            absolutePath3 = c0vsj2.getAbsolutePath();
        } else {
            absolutePath3 = null;
        }
        String str3 = (String) new Pair(absolutePath3, 2131834205).getFirst();
        if (str3 == null) {
            str3 = "";
        }
        this.LLJLILLLLZIIL = str3;
        C0VSJ c0vsj3 = new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileCoverWithGradient.png");
        boolean zLIZJ3 = c830320Whi.LIZJ(bitmapCreateBitmap5, c0vsj3.getParent(), c0vsj3.getName(), true);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("saveToFile:");
        if (zLIZJ3) {
            absolutePath6 = c0vsj3.getAbsolutePath();
        }
        sbLIZ5.append(absolutePath6);
        C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("saveBitmapToSD status: ");
        sbLIZ6.append(zLIZJ3);
        sbLIZ6.append(' ');
        sbLIZ6.append(c0vsj3.length());
        C2344809Gs.LIZLLL(4, "CropActivity", C2188811AlT.LIZIZ(sbLIZ6));
        if (zLIZJ3) {
            absolutePath4 = c0vsj3.getAbsolutePath();
        } else {
            absolutePath4 = null;
        }
        String str4 = (String) new Pair(absolutePath4, 2131834205).getFirst();
        if (str4 != null) {
            str2 = str4;
        }
        this.LLJLL = str2;
        bitmapCreateBitmap2.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap2);
        bitmapCreateBitmap4.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap4);
        C786410Ut5.LJJJJ(bitmapCreateBitmap5);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i2 == 9) {
            LLZ(intent);
            if (LLZLI()) {
                C20012913Sd c20012913Sd = C20012913Sd.LIZ;
                Application applicationLIZ = C1202420hOa.LIZ();
                c20012913Sd.getClass();
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1324405Gg(applicationLIZ, null), 2);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//main");
                smartRouteBuildRoute.addFlags(536870912);
                smartRouteBuildRoute.addFlags(67108864);
                smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_TAB");
                smartRouteBuildRoute.open();
            }
        }
    }
}
