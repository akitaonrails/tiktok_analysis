package com.ss.android.ugc.aweme.setting.verification;

import X.AbstractC415370GQl;
import X.C0OM1;
import X.C0WZX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1287440jbi;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C197039127h;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C416260GTw;
import X.C746740TQy;
import X.C786410Ut5;
import X.EnumC124400de;
import X.EnumC335920DEw;
import X.EnumC429080Gs6;
import Y.ACListenerS164S0100000_30;
import Y.ACListenerS166S0100000_32;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes33.dex */
public final class BlueVerificationActivity extends BaseActivity implements SurfaceHolder.Callback, Camera.PreviewCallback {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiPyohHELIOSISMlKi4nISoiZw0/PSAaLD06LiwvKDs6JysNKjs6Piw4MA==";
    public TuxNavBar LL;
    public Camera LLILLJJLI;
    public SurfaceHolder LLILLL;
    public boolean LLILZ;
    public ImageView LLILZIL;
    public ImageView LLILZLL;
    public C1287440jbi LLIZ;
    public C416260GTw LLIZLLLIL;
    public ConstraintLayout LLJ;
    public ConstraintLayout LLJI;
    public C197039127h LLJIJIL;
    public C197039127h LLJILJIL;
    public Uri LLJILJILJ;
    public EnumC124400de LLJILLL = EnumC124400de.DOCUMENT;
    public byte[] LLJJ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        Camera camera = this.LLILLJJLI;
        if (camera == null) {
            return;
        }
        try {
            camera.setPreviewDisplay(this.LLILLL);
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            }
            camera.setDisplayOrientation(90);
            parameters.setRotation(90);
            camera.setParameters(parameters);
            C2204961BRm.LJJJLZIJ(camera, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94RXyEcjXch6i+1BXlFkiLhSIcRkgxCt9zwwp9ct1EibEGwIw/Q==", null));
            this.LLILZ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLLLZI() throws Throwable {
        if (this.LLILZ) {
            try {
                Camera camera = this.LLILLJJLI;
                if (camera != null) {
                    C2204961BRm.LJJJZ(camera, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94RXyEcjXch6i+1BXlFkiLhSIcRkgxCt9zwwp9ct1EibEGwIw/Q==", null));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLILZ = false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        Surface surface;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onResume", true);
        super.onResume();
        try {
            Camera cameraLIZ = C746740TQy.LIZ(0, CertProviderManagerKt.findCert("bpea-studio_take_photo_blue_verfication_cert", 1476788507));
            this.LLILLJJLI = cameraLIZ;
            if (cameraLIZ != null) {
                cameraLIZ.setDisplayOrientation(90);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        SurfaceHolder surfaceHolder = this.LLILLL;
        if (surfaceHolder != null && (surface = surfaceHolder.getSurface()) != null && surface.isValid()) {
            LLLLLZL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() throws Throwable {
        super.onPause();
        LLLLZI();
        Camera camera = this.LLILLJJLI;
        if (camera != null) {
            C746740TQy.LIZIZ(camera, CertProviderManagerKt.findCert("bpea-studio_take_photo_blue_verfication_cert", 1476788507));
        }
        this.LLILLJJLI = null;
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EnumC124400de enumC124400de;
        SurfaceHolder holder;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LLJILJILJ = (Uri) getIntent().getParcelableExtra("output");
        if (getIntent().getFloatExtra("aspect", 1.0f) > 1.0f) {
            enumC124400de = EnumC124400de.ID;
        } else {
            enumC124400de = EnumC124400de.DOCUMENT;
        }
        this.LLJILLL = enumC124400de;
        setContentView(R.layout.fek);
        this.LL = (TuxNavBar) findViewById(R.id.y08);
        ImageView imageView = (ImageView) findViewById(R.id.sjr);
        this.LLILZLL = imageView;
        if (imageView != null) {
            imageView.setBackground(new AbstractC415370GQl() { // from class: X.0GHn
                public final Paint LJ;
                public final C415290GQd LJFF;
                public final Paint LJI;
                public final C415290GQd LJII;

                {
                    Paint paint = new Paint();
                    this.LJ = paint;
                    C415290GQd c415290GQd = new C415290GQd();
                    this.LJFF = c415290GQd;
                    c415290GQd.LIZ(51.0f, 49.0f, 41.5f, Path.Direction.CW);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(3.0f);
                    paint.setColor(-1);
                    this.LIZ.add(paint);
                    Paint paint2 = new Paint();
                    this.LJI = paint2;
                    C415290GQd c415290GQd2 = new C415290GQd();
                    this.LJII = c415290GQd2;
                    c415290GQd2.LIZ(51.0f, 49.0f, 37.0f, Path.Direction.CW);
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setColor(-1);
                    this.LIZ.add(paint2);
                }

                @Override // X.AbstractC415370GQl
                public final void LIZ(Canvas canvas) {
                    LIZIZ(102.0f, 102.0f, canvas);
                    canvas.drawPath(this.LJFF.LIZ, this.LJ);
                    canvas.drawPath(this.LJII.LIZ, this.LJI);
                }
            });
        }
        this.LLILZIL = (ImageView) findViewById(R.id.ddp);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LJIIIIZZ = getString(2131824445);
            c1251150ifB.LIZJ(new AwS574S0100000_30(this, 198));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131827774);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(-16777216);
            c0om1.LIZLLL = false;
            tuxNavBar.setNavActions(c0om1);
        }
        this.LLIZ = (C1287440jbi) findViewById(R.id.wpz);
        this.LLIZLLLIL = (C416260GTw) findViewById(R.id.idj);
        this.LLJ = (ConstraintLayout) findViewById(R.id.m9_);
        this.LLJI = (ConstraintLayout) findViewById(R.id.m97);
        this.LLJILJIL = (C197039127h) findViewById(R.id.upload_button);
        this.LLJIJIL = (C197039127h) findViewById(R.id.te0);
        ImageView imageView2 = this.LLILZLL;
        if (imageView2 != null) {
            C786410Ut5.Q7(imageView2, new ACListenerS166S0100000_32(this, 32));
        }
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(this, 33));
        }
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS164S0100000_30(this, 19));
        }
        EnumC124400de enumC124400de2 = this.LLJILLL;
        if (enumC124400de2 != null) {
            if (enumC124400de2 == EnumC124400de.ID) {
                C416260GTw c416260GTw = this.LLIZLLLIL;
                if (c416260GTw != null) {
                    c416260GTw.setCutoutMode(EnumC429080Gs6.RECTANGLE_374X234);
                }
            } else {
                C416260GTw c416260GTw2 = this.LLIZLLLIL;
                if (c416260GTw2 != null) {
                    c416260GTw2.setCutoutMode(EnumC429080Gs6.SQUARE_374X374);
                }
            }
        }
        C1287440jbi c1287440jbi = this.LLIZ;
        if (c1287440jbi != null && (holder = c1287440jbi.getHolder()) != null) {
            this.LLILLL = holder;
        }
        SurfaceHolder surfaceHolder = this.LLILLL;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
        }
        SurfaceHolder surfaceHolder2 = this.LLILLL;
        if (surfaceHolder2 != null) {
            surfaceHolder2.setType(3);
        }
        Camera camera = this.LLILLJJLI;
        if (camera != null) {
            camera.setPreviewCallback(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.verification.BlueVerificationActivity", "onCreate", false);
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
        Camera.Size next;
        float f;
        Camera camera = this.LLILLJJLI;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        Iterator<Camera.Size> it2 = parameters.getSupportedPictureSizes().iterator();
        Camera.Size next2 = null;
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                Camera.Size size = next;
                int i = size.width * size.height;
                do {
                    Camera.Size next3 = it2.next();
                    Camera.Size size2 = next3;
                    int i2 = size2.width * size2.height;
                    if (i < i2) {
                        next = next3;
                        i = i2;
                    }
                } while (it2.hasNext());
            }
        }
        Camera.Size size3 = next;
        if (size3 != null) {
            parameters.setPictureSize(size3.width, size3.height);
            f = size3.width / size3.height;
        } else {
            f = 1.3333334f;
        }
        Iterator<Camera.Size> it3 = parameters.getSupportedPreviewSizes().iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                Camera.Size size4 = next2;
                float fAbs = Math.abs((size4.width / size4.height) - f);
                do {
                    Camera.Size next4 = it3.next();
                    Camera.Size size5 = next4;
                    float fAbs2 = Math.abs((size5.width / size5.height) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next2 = next4;
                        fAbs = fAbs2;
                    }
                } while (it3.hasNext());
            }
        }
        Camera.Size size6 = next2;
        if (size6 != null) {
            parameters.setPreviewSize(size6.width, size6.height);
            camera.setParameters(parameters);
            C1287440jbi c1287440jbi = this.LLIZ;
            if (c1287440jbi != null) {
                int i3 = size6.height;
                int i4 = size6.width;
                c1287440jbi.LL = i3;
                c1287440jbi.LLILLJJLI = i4;
                c1287440jbi.requestLayout();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) throws Throwable {
        LLLLZI();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        int length;
        if (bArr != null) {
            length = bArr.length;
        } else {
            length = 0;
        }
        BitmapFactory.decodeByteArray(bArr, 0, length);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        LLLLLZL();
    }
}
