package com.zhihu.matisse.internal.ui;

import X.AnonymousClass1475;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C20149313sh;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public class SelectedPreviewActivity extends AnonymousClass1475 {
    public static final String _pnsPageId = "KyohZzU7IS05ZyIyPCw/Oip9ISs4LD09KSliHELIOSPCZ9GyAgLCwnLSEcOyolISA7CCwnITMlPTY=";

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.AnonymousClass1475, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Activity activity;
        super.onCreate(bundle);
        int iIntValue = 0;
        if (!C20149313sh.LIZ.LJIIJ) {
            C0WZX c0wzx = new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD7xn4Xw2VUneGADEFyq1jrUAK+2ggvOWq4oLXzMqO4ZkhWoU=", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {0};
            C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/zhihu/matisse/internal/ui/SelectedPreviewActivity", "setResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/SelectedPreviewActivity", "setResult", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        activity = (Activity) obj;
                    } else {
                        activity = this;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                } else {
                    activity = this;
                }
                activity.setResult(iIntValue);
                c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/SelectedPreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
            }
            finish();
            return;
        }
        ArrayList parcelableArrayList = C786410Ut5.g3(getIntent(), "extra_default_bundle").getParcelableArrayList("state_selection");
        this.LLILZ.LLIZ.addAll(parcelableArrayList);
        this.LLILZ.notifyDataSetChanged();
        if (this.LLILLJJLI.LJFF) {
            this.LLILZIL.setCheckedNum(1);
        } else {
            this.LLILZIL.setChecked(true);
        }
        this.LLJ = 0;
        LLLLZIL((Item) ListProtector.get(parcelableArrayList, 0));
    }
}
