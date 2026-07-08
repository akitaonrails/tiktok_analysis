package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl;

import X.AbstractC1539070q9Z;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1035880d3y;
import X.C1041990dDp;
import X.C1308910kAL;
import X.C1530030puz;
import X.C1697810uHb;
import X.C1886700zCG;
import X.C19EH;
import X.C1AF0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C905703gN;
import X.EnumC1036640d5C;
import X.EnumC335920DEw;
import X.InterfaceC1294060jmO;
import X.InterfaceC20190413zK;
import Y.ARunnableS116S0100000_16;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebSparkActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiITYxOiHELIOSwoZyY+OCliPioxZjYpOzk6KyBiICIjJGsNLRg2KhY8KD04CSY4IDk6PDw=";
    public SparkFragment LL;
    public SparkContext LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        AdWebSparkFragment adWebSparkFragment;
        SparkFragment sparkFragment = this.LL;
        if (sparkFragment == null) {
            sparkFragment = null;
        }
        if ((sparkFragment instanceof AdWebSparkFragment) && (adWebSparkFragment = (AdWebSparkFragment) sparkFragment) != null) {
            adWebSparkFragment.LLLIL(null);
        }
        super.finish();
        overridePendingTransition(0, R.anim.w);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        AdWebSparkFragment adWebSparkFragment;
        String url;
        String awemeId;
        String url2;
        String awemeId2;
        int i = 1;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onCreate", true);
        activityConfiguration(AFwS252S0000000_16.get$arr$(130));
        super.onCreate(bundle);
        overridePendingTransition(R.anim.x, 0);
        setContentView(R.layout.lx);
        C905703gN.LIZ.getClass();
        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
        try {
            stringExtra = getIntent().getStringExtra("SparkContextContainerId");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c1041990dDp.getClass();
        SparkContext sparkContextLIZ = C1041990dDp.LIZ(stringExtra);
        if (sparkContextLIZ == null) {
            sparkContextLIZ = new SparkContext();
        }
        this.LLILLJJLI = sparkContextLIZ;
        HashMap map = new HashMap();
        if (bundle == null) {
            i = 0;
        }
        map.put("isRecreated", Integer.valueOf(i));
        sparkContextLIZ.LJJLIIIJILLIZJL(map);
        SparkContext sparkContext = this.LLILLJJLI;
        if (sparkContext == null) {
            sparkContext = null;
        }
        C1530030puz.LIZIZ("AdWebSparkActivity", "onCreate", sparkContext);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkFragment#");
        SparkContext sparkContext2 = this.LLILLJJLI;
        if (sparkContext2 == null) {
            sparkContext2 = null;
        }
        sbLIZ.append(sparkContext2.containerId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SparkContext sparkContext3 = this.LLILLJJLI;
        if (sparkContext3 == null) {
            sparkContext3 = null;
        }
        C1530030puz.LIZIZ("AdWebSparkActivity", "Create SparkFragment", sparkContext3);
        SparkContext sparkContext4 = this.LLILLJJLI;
        if (sparkContext4 == null) {
            sparkContext4 = null;
        }
        if (TextUtils.isEmpty(sparkContext4.LJIJI())) {
            HashMap map2 = new HashMap();
            map2.put(Scene.SCENE_SERVICE, "ad_Web_spark");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            SparkContext sparkContext5 = this.LLILLJJLI;
            if (sparkContext5 == null) {
                sparkContext5 = null;
            }
            C1035880d3y c1035880d3y = (C1035880d3y) sparkContext5.LJFF(C1035880d3y.class);
            if (c1035880d3y != null) {
                url = c1035880d3y.getUrl();
            } else {
                url = null;
            }
            sbLIZ2.append(url);
            sbLIZ2.append(' ');
            SparkContext sparkContext6 = this.LLILLJJLI;
            if (sparkContext6 == null) {
                sparkContext6 = null;
            }
            C1035880d3y c1035880d3y2 = (C1035880d3y) sparkContext6.LJFF(C1035880d3y.class);
            if (c1035880d3y2 != null) {
                awemeId = c1035880d3y2.getAwemeId();
            } else {
                awemeId = null;
            }
            sbLIZ2.append(awemeId);
            map2.put("schema", C2188811AlT.LIZIZ(sbLIZ2));
            C20684815ws.LJIILLIIL("hybrid_log_report", map2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("adWebSpark url is null");
            SparkContext sparkContext7 = this.LLILLJJLI;
            if (sparkContext7 == null) {
                sparkContext7 = null;
            }
            C1035880d3y c1035880d3y3 = (C1035880d3y) sparkContext7.LJFF(C1035880d3y.class);
            if (c1035880d3y3 != null) {
                url2 = c1035880d3y3.getUrl();
            } else {
                url2 = null;
            }
            sbLIZ3.append(url2);
            SparkContext sparkContext8 = this.LLILLJJLI;
            if (sparkContext8 == null) {
                sparkContext8 = null;
            }
            C1035880d3y c1035880d3y4 = (C1035880d3y) sparkContext8.LJFF(C1035880d3y.class);
            if (c1035880d3y4 != null) {
                awemeId2 = c1035880d3y4.getAwemeId();
            } else {
                awemeId2 = null;
            }
            sbLIZ3.append(awemeId2);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        SparkContext sparkContext9 = this.LLILLJJLI;
        if (sparkContext9 == null) {
            sparkContext9 = null;
        }
        C1035880d3y c1035880d3y5 = (C1035880d3y) sparkContext9.LJFF(C1035880d3y.class);
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        SparkContext sparkContext10 = this.LLILLJJLI;
        if (sparkContext10 == null) {
            sparkContext10 = null;
        }
        String strLJIJI = sparkContext10.LJIJI();
        SparkContext sparkContext11 = this.LLILLJJLI;
        if (sparkContext11 == null) {
            sparkContext11 = null;
        }
        String str = sparkContext11.LJJJ().get("is_ad_jump_url");
        if (str == null) {
            str = "";
        }
        this.LL = (SparkFragment) iAdWebUtils.dv(this, c1035880d3y5, strLJIJI, str, new ARunnableS116S0100000_16((Object) this, 183));
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        SparkFragment sparkFragment = this.LL;
        if (sparkFragment == null) {
            sparkFragment = null;
        }
        c19ehLJIIJ.LIZJ(R.id.a5n, sparkFragment, strLIZIZ);
        c19ehLJIIJ.LJIIJ();
        SparkFragment sparkFragment2 = this.LL;
        if (sparkFragment2 == null) {
            sparkFragment2 = null;
        }
        if ((sparkFragment2 instanceof AdWebSparkFragment) && (adWebSparkFragment = (AdWebSparkFragment) sparkFragment2) != null) {
            adWebSparkFragment.ge(EnumC1036640d5C.PAGE_SELECT);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparkContext sparkContext = this.LLILLJJLI;
        if (sparkContext == null) {
            sparkContext = null;
        }
        InterfaceC20190413zK interfaceC20190413zK = (InterfaceC20190413zK) sparkContext.LJFF(InterfaceC20190413zK.class);
        if (interfaceC20190413zK != null) {
            interfaceC20190413zK.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LLILLJJLI;
        if (sparkContext2 == null) {
            sparkContext2 = null;
        }
        AbstractC1539070q9Z abstractC1539070q9Z = (AbstractC1539070q9Z) sparkContext2.LJFF(AbstractC1539070q9Z.class);
        if (abstractC1539070q9Z != null) {
            do {
                abstractC1539070q9Z.onActivityResult(i, i2, intent);
                AbstractC1539070q9Z next = abstractC1539070q9Z.next();
                if (next != null && (next instanceof AbstractC1539070q9Z)) {
                    abstractC1539070q9Z = next;
                } else {
                    return;
                }
            } while (abstractC1539070q9Z != null);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/aweme/commercialize/hybrid/impl/web/service/impl/AdWebSparkActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMsHj6gj6EX8wzTRorkO+n0dLGoX2tM20X8Tl16TWLBPsr+8+o3cI8KK+EkCToQi8=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        C1886700zCG.LIZ(this, iIntValue, iArr2);
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }
}
