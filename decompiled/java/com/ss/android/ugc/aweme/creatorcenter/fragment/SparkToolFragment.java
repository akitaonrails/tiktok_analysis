package com.ss.android.ugc.aweme.creatorcenter.fragment;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1910050znv;
import X.C20533215Wg;
import X.C2200821BBo;
import com.bytedance.hybrid.spark.page.SparkFragment;

/* JADX INFO: loaded from: classes29.dex */
public final class SparkToolFragment extends SparkFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nJzcvHELIOSLCEnLTdiLz0yLygpJzt9GzUtOyQHJyogDz0yLygpJzs=";
    public C1910050znv LLJZ;

    @Override // com.bytedance.hybrid.spark.page.SparkFragment
    public final boolean PR() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/creatorcenter/fragment/SparkToolFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6Zp7a0yC3oWQKs1Zp7TrIdXDjNnhsT7atgw2XP5MSjjYiG8/a2UE=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        C1910050znv c1910050znv = this.LLJZ;
        if (c1910050znv != null && z) {
            c1910050znv.LIZ.LLJJ = false;
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SparkToolFragment.class);
        }
    }
}
