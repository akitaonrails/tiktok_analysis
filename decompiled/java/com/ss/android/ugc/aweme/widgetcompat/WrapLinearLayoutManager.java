package com.ss.android.ugc.aweme.widgetcompat;

import X.AbstractC21673619ry;
import X.C15O7;
import X.C201955140j;
import X.C21673319rv;
import X.C21673919s1;
import Y.ACallableS426S0100000_21;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes22.dex */
public class WrapLinearLayoutManager extends LinearLayoutManager {
    public AbstractC21673619ry LL;

    public WrapLinearLayoutManager(Context context) {
        super(context);
    }

    public static void LJIIL(AbstractC21673619ry abstractC21673619ry) {
        if (abstractC21673619ry == null) {
            return;
        }
        C15O7.LIZIZ(new ACallableS426S0100000_21(abstractC21673619ry, 5), C15O7.LJIIIIZZ, null);
    }

    public final IndexOutOfBoundsException LJIILIIL(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.LL != null) {
            IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.LL.getClass().getName());
            indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
            return indexOutOfBoundsException2;
        }
        return indexOutOfBoundsException;
    }

    public WrapLinearLayoutManager(Context context, int i) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
        this.LL = abstractC21673619ry2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IllegalArgumentException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            if (this.LL != null) {
                String name = this.LL.getClass().getName();
                if (this.LL != null) {
                    e = new IllegalArgumentException(this.LL.getClass().getName(), e);
                }
                C201955140j.LJI(name, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LL != null) {
                C201955140j.LJI(this.LL.getClass().getName(), LJIILIIL(e2));
            }
        } catch (NullPointerException e3) {
            TryCatchGuardChecker.doCheck(e3);
            if (this.LL != null) {
                C201955140j.LJI(this.LL.getClass().getName(), e3);
                LJIIL(this.LL);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LL != null) {
                C201955140j.LJI(this.LL.getClass().getName(), LJIILIIL(e));
                return 0;
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LL != null) {
                C201955140j.LJI(this.LL.getClass().getName(), LJIILIIL(e));
            }
            return 0;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LL != null) {
                C201955140j.LJI(this.LL.getClass().getName(), e2);
                LJIIL(this.LL);
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.onFocusSearchFailed(view, i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LL != null) {
                C201955140j.LJI(this.LL.getClass().getName(), LJIILIIL(e));
                return null;
            }
            return null;
        }
    }
}
