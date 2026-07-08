package com.ss.android.ugc.aweme.shortvideo.cameraspec;

import X.AbstractC1653180t7c;
import X.C09R3;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1443590nfZ;
import X.C1461700o8m;
import X.C1646160swI;
import X.C1649140t16;
import X.C1649150t17;
import X.C1649170t19;
import X.C1653070t7R;
import X.C1653090t7T;
import X.C1664770tQJ;
import X.C19A3;
import X.C1DRG;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C565600MGg;
import X.C578880Mn8;
import X.EnumC1285050jXr;
import X.EnumC1448590nnd;
import X.EnumC1647570syZ;
import X.InterfaceC1645840svm;
import X.InterfaceC1648020szI;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterpolatorC420870Ger;
import Y.AAListenerS335S0100000_25;
import Y.AObjectS246S0100000_25;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import nv7.c0;

/* JADX INFO: loaded from: classes26.dex */
public final class v extends C1649170t19 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public String LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(v.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(v.class, "liveApiComponent", "getLiveApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/live/LiveApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(v.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(v.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLLII = 8;
    }

    @Override // X.C1649170t19
    public boolean F4(String str, String str2) {
        return false;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLL.getValue(this, LLLI[0]);
    }

    private final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.LLLFFI.getValue(this, LLLI[3]);
    }

    private final InterfaceC1645840svm getLiveApiComponent() {
        return (InterfaceC1645840svm) this.LLLF.getValue(this, LLLI[1]);
    }

    private final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LLLFF.getValue(this, LLLI[2]);
    }

    @Override // X.C1649170t19, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 147));
    }

    @Override // X.C1649170t19
    public boolean D5(String str) {
        AbstractC1653180t7c abstractC1653180t7c;
        C1653090t7T c1653090t7TFindBottomTabByTag = Op().findBottomTabByTag(str);
        if (c1653090t7TFindBottomTabByTag == null || (abstractC1653180t7c = c1653090t7TFindBottomTabByTag.LIZIZ) == null || !abstractC1653180t7c.LLLLIIIILLL()) {
            return false;
        }
        return true;
    }

    @Override // X.C1649170t19
    public AnimatorSet H5(C1649150t17 c1649150t17) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new InterpolatorC420870Ger(0.25d, 0.1d, 0.1d));
        animatorSet.addListener(new AAListenerS335S0100000_25(c1649150t17, 1));
        return animatorSet;
    }

    @Override // X.C1649170t19
    public boolean K6(String str) {
        if (!C13LP.LJJJJ(str, C13LQ.LJLIIL(new String[]{EnumC1647570syZ.LIVE.getTag(), EnumC1647570syZ.AI_SELF.getTag()})) || !D5(str)) {
            return false;
        }
        return true;
    }

    @Override // X.C1649170t19
    public String t5(String str) {
        if (str == null) {
            return null;
        }
        if (Intrinsics.LJFF(str, EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag()) && this.LLJL == 16) {
            return EnumC1647570syZ.RECORD_NOW.getTag();
        }
        return str;
    }

    public v(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1645840svm.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
    }

    @Override // X.C1649170t19
    public boolean C5(String str, String str2) {
        EnumC1285050jXr enumC1285050jXrLIZ;
        EnumC1285050jXr enumC1285050jXrLIZ2 = null;
        if (str != null) {
            C1653070t7R.Companion.getClass();
            enumC1285050jXrLIZ = C1649140t16.LIZ(str);
        } else {
            enumC1285050jXrLIZ = null;
        }
        if (str2 != null) {
            C1653070t7R.Companion.getClass();
            enumC1285050jXrLIZ2 = C1649140t16.LIZ(str2);
        }
        if (enumC1285050jXrLIZ != enumC1285050jXrLIZ2) {
            return true;
        }
        return false;
    }

    @Override // X.C1649170t19
    public float M5(View view, C1649150t17 c1649150t17) {
        int i;
        if (c1649150t17.LIZIZ == EnumC1448590nnd.RATIO_9_16) {
            c0 c0Var = c0.LIZ;
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            int i2 = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            c0Var.q2(i2, c1443590nfZ2.LIZIZ, view);
            return C418440Gaw.LIZIZ(Float.valueOf(20.0f));
        }
        C1646160swI c1646160swI = EnumC1647570syZ.Companion;
        String str = c1649150t17.LIZLLL;
        c1646160swI.getClass();
        if (C1646160swI.LIZIZ(str)) {
            C578880Mn8.LIZ(view);
            i = view.getLayoutParams().width;
        } else if (Intrinsics.LJFF(c1649150t17.LIZLLL, EnumC1647570syZ.PHOTO_SWAP.getTag())) {
            C1461700o8m.LIZIZ(view);
            i = view.getLayoutParams().width;
        } else {
            return 0.0f;
        }
        return i * 0.08f;
    }

    @Override // X.C1649170t19
    public float N5(View view, C1649150t17 c1649150t17) {
        int i;
        if (c1649150t17.LIZJ == EnumC1448590nnd.RATIO_9_16) {
            c0 c0Var = c0.LIZ;
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            int i2 = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            c0Var.q2(i2, c1443590nfZ2.LIZIZ, view);
            if (!Intrinsics.LJFF(c1649150t17.LJ, EnumC1647570syZ.LIVE.getTag())) {
                return C418440Gaw.LIZIZ(Float.valueOf(20.0f));
            }
            return 0.0f;
        }
        C1646160swI c1646160swI = EnumC1647570syZ.Companion;
        String str = c1649150t17.LJ;
        c1646160swI.getClass();
        if (C1646160swI.LIZIZ(str)) {
            C578880Mn8.LIZ(view);
            i = view.getLayoutParams().width;
        } else if (Intrinsics.LJFF(c1649150t17.LJ, EnumC1647570syZ.PHOTO_SWAP.getTag())) {
            C1461700o8m.LIZIZ(view);
            i = view.getLayoutParams().width;
        } else {
            return 0.0f;
        }
        return i * 0.08f;
    }

    @Override // X.C1649170t19
    public boolean E5(EnumC1448590nnd enumC1448590nnd, EnumC1448590nnd enumC1448590nnd2, String str, String str2) {
        return super.E5(enumC1448590nnd, enumC1448590nnd2, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    @Override // X.C1649170t19
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U5(java.lang.String r6, X.EnumC1448590nnd r7, boolean r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1647670syj
            if (r0 == 0) goto L67
            r4 = r9
            X.0syj r4 = (X.C1647670syj) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L59
            if (r0 != r3) goto L6d
            java.lang.Object r6 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            X.0syZ r0 = X.EnumC1647570syZ.LIVE
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L4a
            X.0MGg r0 = r5.getComponentizationConfig()
            r1 = 0
            if (r0 == 0) goto L4f
            boolean r0 = r0.LIZ
            if (r0 != r3) goto L4f
            X.0svm r0 = r5.getLiveApiComponent()
            if (r0 == 0) goto L4a
            r0.YC2(r3, r1)
        L4a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L4f:
            com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene r0 = r5.getRootScene()
            if (r0 == 0) goto L4a
            r0.LLLLLZ(r3, r1)
            goto L4a
        L59:
            X.C155000ia.LIZIZ(r2)
            r4.LL = r6
            r4.LLILZ = r3
            java.lang.Object r2 = super.U5(r6, r7, r8, r4)
            if (r2 != r1) goto L24
            return r1
        L67:
            X.0syj r4 = new X.0syj
            r4.<init>(r5, r9)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cameraspec.v.U5(java.lang.String, X.0nnd, boolean, X.05Vn):java.lang.Object");
    }
}
