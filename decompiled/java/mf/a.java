package mf;

import X.C098200Yq;
import X.C189200o6;
import X.C2211621BhA;
import X.C2211641BhC;
import X.C788150Uvt;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements View.OnClickListener {
    public final View.OnClickListener LL;

    public a(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference<View> weakReference;
        boolean zLJI = MethodIDManager.LJI(71651);
        C2211641BhC c2211641BhC = null;
        try {
            weakReference = C788150Uvt.LIZ.get(view);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (weakReference != null) {
            view2 = weakReference.get();
            if (view2 == null) {
                view2 = view;
            }
        } else {
            view2 = view;
        }
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view2, null);
        if (c2211641BhCLIZLLL != null && c2211641BhCLIZLLL.LJJIIZ) {
            c2211641BhC = c2211641BhCLIZLLL;
        }
        C2211621BhA.LJ = c2211641BhC;
        View.OnClickListener onClickListener = this.LL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
