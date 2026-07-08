package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C01GW;
import X.C0MI6;
import X.C0MJJ;
import X.C0MJK;
import X.C0PEM;
import X.C0SY5;
import X.C1DFH;
import X.C20022113Vr;
import X.C20175213ws;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2215201Bmw;
import X.C2215211Bmx;
import X.C23250099c;
import X.C2344009Gk;
import X.C294130Bfv;
import X.C452501pT;
import X.DialogC1390150mHN;
import X.EnumC20175313wt;
import X.EnumC2215301Bn6;
import X.InterfaceC1389630mGX;
import X.InterfaceC2215281Bn4;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS552S0100000_8;
import lth.o;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGCPictureUploadHandler {
    public static boolean LJIILIIL;
    public static AIGCAvatarAuthConfig LJIILJJIL;
    public static final C01GW<C20022113Vr> LJIILL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(122));
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC2215281Bn4 LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final String LJI;
    public final Map<String, HandleResult> LJII = new LinkedHashMap();
    public final Map<String, String> LJIIIIZZ = new LinkedHashMap();
    public List<String> LJIIIZ;
    public Function1<? super List<String>, Unit> LJIIJ;
    public String LJIIJJI;
    public float LJIIL;

    public final List<C0MI6> LJ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            HandleResult handleResult = (HandleResult) ((LinkedHashMap) this.LJII).get(str);
            if (handleResult != null) {
                String str2 = (String) ((LinkedHashMap) this.LJIIIIZZ).get(handleResult.slowPath);
                if (str2 != null) {
                    arrayList.add(LIZIZ(handleResult.cropResult.getBoyProb(), str, handleResult.cropResult.getSkinTone(), str2));
                }
            }
        }
        return arrayList;
    }

    public final void LJI(float f, DialogC1390150mHN dialogC1390150mHN) {
        if (dialogC1390150mHN.isShowing() && f > this.LJIIL) {
            this.LJIIL = f;
            dialogC1390150mHN.LJJLL(f, false);
        }
    }

    public final void LIZJ(Activity activity, List<String> list, Function1<? super List<String>, Unit> function1) {
        LifecycleCoroutineScope lifecycleScope;
        this.LJIIIZ = list;
        this.LJIIJ = function1;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.TOTAL, EnumC20175313wt.START, null, "slow", null, null, 52);
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(activity);
        if (lifecycleOwnerLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2215201Bmw(this, activity, jElapsedRealtime, list, function1, null), 2);
        }
    }

    public final void LJFF(int i, String str, boolean z) {
        C0MJJ c0mjj = C0MJJ.LIZ;
        String str2 = this.LJ;
        String str3 = this.LJIIJJI;
        c0mjj.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str3);
        c2344009Gk.LIZJ(i, C0MJK.PHOTO_SELECT.getValue());
        c2344009Gk.LIZJ(z ? 1 : 0, C0MJK.UPLOAD_SUCCESS.getValue());
        if (str != null && !z) {
            c2344009Gk.LJFF(C0MJK.FAIL_REASON.getValue(), str);
        }
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }

    public static final class HandleResult {
        public static final int $stable = 8;
        public final String bingoPath;
        public final VEFaceDetectCropResult cropResult;
        public final String slowPath;
        public final String smashPath;

        public HandleResult(VEFaceDetectCropResult vEFaceDetectCropResult, String str, String str2, String str3) {
            this.cropResult = vEFaceDetectCropResult;
            this.bingoPath = str;
            this.smashPath = str2;
            this.slowPath = str3;
        }
    }

    public static C0MI6 LIZIZ(float f, String str, int i, String str2) {
        Integer numValueOf;
        if (((Boolean) C294130Bfv.LIZIZ.getValue()).booleanValue()) {
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = null;
        }
        return new C0MI6(str, str2, f, numValueOf, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List<java.lang.String> r16, java.util.Map<java.lang.String, java.lang.String> r17, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler.LJII(java.util.List, java.util.Map, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public final DialogC1390150mHN LIZ(Activity activity, final InterfaceC497601wk interfaceC497601wk, final long j, final int i, final Function0<Unit> function0) {
        DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(activity);
        dialogC1390150mHN.LJJLJLI(activity.getResources().getString(2131820645));
        dialogC1390150mHN.LJJLJ(false);
        dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.1Bmz
            @Override // X.InterfaceC1389630mGX
            public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                C2296808zG.LIZJ(interfaceC497601wk, new CancellationException("User click cancel button"));
                function0.invoke();
                C20175213ws c20175213ws = C20175213ws.LIZ;
                EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.TOTAL;
                EnumC20175313wt enumC20175313wt = EnumC20175313wt.FAIL;
                this.getClass();
                C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, enumC20175313wt, Long.valueOf(SystemClock.elapsedRealtime() - j), "slow", null, "User click cancel", 16);
                this.LJFF(i, "user_tap_cancel", false);
            }
        };
        dialogC1390150mHN.LJJLL(0.0f, false);
        return dialogC1390150mHN;
    }

    public final void LJIIIIZZ(Activity activity, String str, float f, int i, AwS552S0100000_8 awS552S0100000_8) {
        LifecycleCoroutineScope lifecycleScope;
        if (!o.LJIIZILJ.isLogin()) {
            return;
        }
        C0MJJ c0mjj = C0MJJ.LIZ;
        String str2 = this.LIZ;
        String str3 = this.LIZIZ;
        boolean z = this.LJFF;
        String str4 = this.LJI;
        c0mjj.getClass();
        C0MJJ.LJ(str2, str3, str4, z);
        this.LJIIJJI = "record_page";
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.TOTAL, EnumC20175313wt.START, null, "slow", null, null, 52);
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(activity);
        if (lifecycleOwnerLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2215211Bmx(this, activity, jElapsedRealtime, awS552S0100000_8, str, f, i, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0200  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d5 -> B:12:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC497601wk r26, long r27, java.util.List<java.lang.String> r29, android.app.Activity r30, X.DialogC1390150mHN r31, float r32, kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> r33, X.InterfaceC1364105Vn<? super java.lang.Boolean> r34) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler.LIZLLL(X.01wk, long, java.util.List, android.app.Activity, X.0mHN, float, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public AIGCPictureUploadHandler(boolean z, boolean z2, String str, String str2, InterfaceC2215281Bn4 interfaceC2215281Bn4, boolean z3, String str3, boolean z4, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC2215281Bn4;
        this.LIZLLL = z3;
        this.LJ = str3;
        this.LJFF = z4;
        this.LJI = str4;
    }
}
