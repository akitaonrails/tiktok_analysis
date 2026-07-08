package com.ss.android.ugc.aweme.explore.common;

import X.AbstractC21673619ry;
import X.C15WG;
import X.C1AF0;
import X.C21673319rv;
import X.C21673919s1;
import X.C786410Ut5;
import X.C799570VYd;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public final CopyOnWriteArrayList<C15WG> LLJJJJLIIL;
    public AbstractC21673619ry<?> LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public ExploreStaggeredGridLayoutManager(int i) {
        super(i, 1);
        this.LLJJJJLIIL = new CopyOnWriteArrayList<>();
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        Iterator<C15WG> it2 = this.LLJJJJLIIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry<?> abstractC21673619ry, AbstractC21673619ry<?> abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
        this.LLJJL = abstractC21673619ry2;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            LJJIJ(c21673319rv, c21673919s1, true);
        } catch (IllegalArgumentException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            AbstractC21673619ry<?> abstractC21673619ry = this.LLJJL;
            if (abstractC21673619ry != null) {
                AbstractC21673619ry<?> abstractC21673619ry2 = this.LLJJL;
                if (abstractC21673619ry2 != null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(abstractC21673619ry2.getClass().getName());
                    illegalArgumentException.initCause(e);
                    e = illegalArgumentException;
                }
                C1AF0.LJFF(e, abstractC21673619ry.getClass().getName());
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            AbstractC21673619ry<?> abstractC21673619ry3 = this.LLJJL;
            if (abstractC21673619ry3 != null) {
                AbstractC21673619ry<?> abstractC21673619ry4 = this.LLJJL;
                if (abstractC21673619ry4 != null) {
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(abstractC21673619ry4.getClass().getName());
                    indexOutOfBoundsException.initCause(e);
                    e = indexOutOfBoundsException;
                }
                C1AF0.LJFF(e, abstractC21673619ry3.getClass().getName());
            }
        } catch (NullPointerException e3) {
            TryCatchGuardChecker.doCheck(e3);
            AbstractC21673619ry<?> abstractC21673619ry5 = this.LLJJL;
            if (abstractC21673619ry5 != null) {
                C1AF0.LJFF(e3, abstractC21673619ry5.getClass().getName());
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS103S0100000_3(abstractC21673619ry5, 144));
            }
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return scrollBy(i, c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return scrollBy(i, c21673319rv, c21673919s1);
        } catch (IllegalArgumentException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            AbstractC21673619ry<?> abstractC21673619ry = this.LLJJL;
            if (abstractC21673619ry != null) {
                AbstractC21673619ry<?> abstractC21673619ry2 = this.LLJJL;
                if (abstractC21673619ry2 != null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(abstractC21673619ry2.getClass().getName());
                    illegalArgumentException.initCause(e);
                    e = illegalArgumentException;
                }
                C1AF0.LJFF(e, abstractC21673619ry.getClass().getName());
                return 0;
            }
            return 0;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            AbstractC21673619ry<?> abstractC21673619ry3 = this.LLJJL;
            if (abstractC21673619ry3 != null) {
                AbstractC21673619ry<?> abstractC21673619ry4 = this.LLJJL;
                if (abstractC21673619ry4 != null) {
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(abstractC21673619ry4.getClass().getName());
                    indexOutOfBoundsException.initCause(e);
                    e = indexOutOfBoundsException;
                }
                C1AF0.LJFF(e, abstractC21673619ry3.getClass().getName());
                return 0;
            }
            return 0;
        } catch (NullPointerException e3) {
            TryCatchGuardChecker.doCheck(e3);
            AbstractC21673619ry<?> abstractC21673619ry5 = this.LLJJL;
            if (abstractC21673619ry5 != null) {
                C1AF0.LJFF(e3, abstractC21673619ry5.getClass().getName());
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS103S0100000_3(abstractC21673619ry5, 144));
                return 0;
            }
            return 0;
        }
    }

    public ExploreStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLJJJJLIIL = new CopyOnWriteArrayList<>();
        this.LLJJLIIIJLLLLLLLZ = true;
    }
}
