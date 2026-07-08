package com.bytedance.scene.ui;

import X.AnonymousClass1959;
import X.C195B;
import X.C19CA;
import X.C19GS;
import X.C214936199q;
import X.C786410Ut5;
import X.C801600VcU;
import X.InterfaceC1655610tBX;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class SceneContainerActivity extends C19GS {
    public static final List<SceneContainerActivity> LLILLJJLI;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs/Kio9LWs5IGHELIOSEAKyAiLAw8JjEtICE2OgQvPSYlITE1";
    public InterfaceC1655610tBX LL;

    static {
        new HashSet();
        LLILLJJLI = new ArrayList();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.LL.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) LLILLJJLI).remove(this);
    }

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

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    public static C801600VcU<? extends Class<? extends Scene>, Bundle> LLLLLZL(Intent intent) {
        String stringExtra;
        try {
            try {
                stringExtra = intent.getStringExtra("class_name");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            return new C801600VcU<>(Class.forName(stringExtra), C786410Ut5.g3(intent, "arguments"));
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        ((ArrayList) LLILLJJLI).add(this);
        Messenger messenger = (Messenger) getIntent().getParcelableExtra("SingeProcessMessengerHandler");
        if (messenger != null) {
            new C195B(messenger);
            this.LL = C19CA.LIZIZ(this, R.id.content, new C214936199q((Bundle) null, AnonymousClass1959.class), null, false, "LifeCycleFragment", true);
        } else {
            C801600VcU<? extends Class<? extends Scene>, Bundle> c801600VcULLLLLZL = LLLLLZL(getIntent());
            this.LL = C19CA.LIZIZ(this, R.id.content, new C214936199q(c801600VcULLLLLZL.LIZIZ, (Class) c801600VcULLLLLZL.LIZ), null, false, "LifeCycleFragment", true);
        }
    }
}
