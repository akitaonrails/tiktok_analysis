package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import X.AnonymousClass0956;
import X.C0LAB;
import X.C1201120hMU;
import X.C1205850hU7;
import X.C1320270kSf;
import X.C1322110kVd;
import X.C1325710kbR;
import X.C1637890six;
import X.C21570819bO;
import X.C2341909Fp;
import X.C356901a3;
import X.C568500MRk;
import X.C786410Ut5;
import X.InterfaceC2342209Fs;
import X.InterfaceC525540KjI;
import X.InterfaceC568490MRj;
import X.InterfaceC568550MRp;
import X.InterpolatorC1088790eRJ;
import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewImageScene extends UserVisibleHintGroupScene implements InterfaceC525540KjI {
    public long LLJJIJIL;
    public InterfaceC568490MRj LLJJJ;
    public TikTokMediaModel LLJJJIL;
    public C1322110kVd LLJJJJ;
    public View LLJJJJJIL;
    public ImageView LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public boolean LLJL;
    public boolean LLJLIL;
    public Function1<? super TikTokMediaModel, Unit> LLJLILLLLZIIL;
    public int LLJJIJIIJIL = -1;
    public long LLJJLIIIJLLLLLLLZ = -1;

    @Override // X.InterfaceC525540KjI
    public final UserVisibleHintGroupScene LJI() {
        return this;
    }

    @Override // X.InterfaceC525540KjI
    public final void LJJZZIII() {
    }

    @Override // X.InterfaceC525540KjI
    public final void LLJ() {
    }

    @Override // X.InterfaceC525540KjI
    public final void onBackPress() {
        exit(true);
    }

    @Override // X.InterfaceC525540KjI
    public final void onPageSelected() {
    }

    public final C21570819bO LLLLIILL() {
        C21570819bO c21570819bO = new C21570819bO();
        c21570819bO.LJ = 220L;
        c21570819bO.LJFF = 220L;
        c21570819bO.LJI = 220L;
        c21570819bO.LJII = 220L;
        Pair<PointF, PointF> pair = C568500MRk.LIZ;
        c21570819bO.LIZ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZIZ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZJ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZLLL = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        return c21570819bO;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 == null || !(!anonymousClass0956.isCompleted())) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
    }

    public static final class ImageRequestListener extends C1320270kSf {
        public PreviewImageScene LIZ;

        @Override // X.C1320270kSf, X.InterfaceC1325670kbN
        public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$ImageRequestListener$1, reason: invalid class name */
        public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZJ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZLLL(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                C356901a3.LJ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                C356901a3.LJFF(this, lifecycleOwner);
            }

            public AnonymousClass1() {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZIZ(this, lifecycleOwner);
                ImageRequestListener.this.LIZ = null;
            }
        }

        public ImageRequestListener(PreviewImageScene previewImageScene) {
            Activity activity;
            this.LIZ = previewImageScene;
            if (previewImageScene != null) {
                activity = previewImageScene.mActivity;
            } else {
                activity = null;
            }
            C1205850hU7.LIZ(activity, C1201120hMU.LIZ().leakOptCreativeTools, new AnonymousClass1(), AFwS239S0000000_8.get$arr$(98));
        }

        @Override // X.C1320270kSf, X.InterfaceC1325670kbN
        public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
            PreviewImageScene previewImageScene = this.LIZ;
            if (previewImageScene != null) {
                previewImageScene.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
            }
        }
    }

    @Override // X.InterfaceC525540KjI
    public final void LJLILLLLZI(TikTokMediaModel tikTokMediaModel) {
        this.LLJJJIL = tikTokMediaModel;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        if (z) {
            Function1<? super TikTokMediaModel, Unit> function1 = this.LLJLILLLLZIIL;
            if (function1 != null) {
                function1.invoke(this.LLJJJIL);
                return;
            }
            return;
        }
        InterfaceC568550MRp interfaceC568550MRpLIZ = C568500MRk.LIZ(this.LLJJJJJIL);
        if (interfaceC568550MRpLIZ == null) {
            return;
        }
        interfaceC568550MRpLIZ.reset();
    }

    public final void LLLLIL(boolean z) {
        Integer numValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLJJIJIL;
        long j2 = jCurrentTimeMillis - j;
        long j3 = this.LLJJLIIIJLLLLLLLZ - j;
        if (j3 < 0) {
            j3 = 0;
        }
        C0LAB c0lab = new C0LAB();
        TikTokMediaModel tikTokMediaModel = this.LLJJJIL;
        if (tikTokMediaModel != null) {
            numValueOf = Integer.valueOf(tikTokMediaModel.type);
        } else {
            numValueOf = null;
        }
        c0lab.LJ("content_type", String.valueOf(numValueOf));
        c0lab.LIZIZ(j2, "first_frame_duration");
        if (j3 != 0) {
            j2 = j3;
        }
        c0lab.LIZIZ(j2, "black_frame_duration");
        c0lab.LIZ(this.LLJJIJIIJIL, "content_cnt");
        c0lab.LIZ(isVisible() ? 1 : 0, "is_visible");
        c0lab.LIZ(z ? 1 : 0, "is_success");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_album_preview_first_frame", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void exit(boolean r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene.exit(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onActivityCreated(r7)
            r0 = 2131376292(0x7f0a38a4, float:1.8372756E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.LLJJJJLIIL = r0
            r0 = 2131370562(0x7f0a2242, float:1.8361134E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.0kVd r0 = (X.C1322110kVd) r0
            r6.LLJJJJ = r0
            long r0 = java.lang.System.currentTimeMillis()
            r6.LLJJIJIL = r0
            r0 = 2131374084(0x7f0a3004, float:1.8368277E38)
            android.view.View r0 = r6.requireViewById(r0)
            r6.LLJJJJJIL = r0
            X.0MRn r1 = new X.0MRn
            r1.<init>()
            X.0MRp r0 = X.C568500MRk.LIZ(r0)
            if (r0 == 0) goto L36
            r0.setGestureListener(r1)
        L36:
            X.16Cg r1 = r6.LLJILLL
            androidx.lifecycle.LifecycleRegistry r0 = r1.LL
            if (r0 != 0) goto L43
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.LL = r0
        L43:
            androidx.lifecycle.LifecycleRegistry r1 = r1.LL
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$onActivityCreated$1 r0 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$onActivityCreated$1
            r0.<init>()
            r1.addObserver(r0)
            X.0MRj r0 = r6.LLJJJ
            if (r0 == 0) goto L73
            boolean r0 = r0.LJJI()
            r5 = 1
            if (r0 != r5) goto L73
            X.0MRj r0 = r6.LLJJJ
            if (r0 == 0) goto L5f
            r0.LJII()
        L5f:
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            X.1DFB r3 = X.C0PEM.LIZJ
            X.0Kx9 r2 = new X.0Kx9
            r1 = 0
            r2.<init>(r6, r5, r1)
            r0 = 2
            X.0956 r0 = X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
            r6.LLJJL = r0
            return
        L73:
            r5 = 0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene.onActivityCreated(android.os.Bundle):void");
    }

    public static void LLLLILI(long j, boolean z) throws JSONException {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("time_elapse", j);
        }
        C1637890six.LJ("tool_performance_preview_image_render_time", i, jSONObject);
    }

    @Override // X.InterfaceC525540KjI
    public final void LJJJJLI(int i, InterfaceC568490MRj interfaceC568490MRj) {
        this.LLJJIJIIJIL = i;
        this.LLJJJ = interfaceC568490MRj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Type inference failed for: r0v21, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v23, types: [REQUEST, X.0kbR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLJ(android.net.Uri r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene.LLLLJ(android.net.Uri, java.lang.String, boolean):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!this.LLJL && !this.LLJLIL) {
            i = R.layout.er3;
        } else {
            i = R.layout.er4;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
