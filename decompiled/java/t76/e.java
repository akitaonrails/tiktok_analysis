package t76;

import X.AbstractC1317090kNX;
import X.AbstractC1585810rMx;
import X.C1298420jtQ;
import X.C1314730kJj;
import X.C1317070kNV;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdui.components.list.a;
import com.bytedance.sdui.render.tasm.utils.DisplayMetricsHolder;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public class e extends AbstractC1585810rMx {
    public final C1298420jtQ LL;
    public final RecyclerView LLILLJJLI;
    public int LLILLL;
    public final com.bytedance.sdui.components.list.a LLILZLL;
    public int LLIZLLLIL;
    public final int LLILZ = 50;
    public int LLILZIL = 50;
    public boolean LLIZ = true;
    public int LLJ = 1;

    public final void LJJIZ(int i) {
        if ((this.LLILLL & 8) == 0) {
            return;
        }
        C1314730kJj c1314730kJj = new C1314730kJj(this.LLILZLL.LLJJ, "scrollstatechange");
        c1314730kJj.LIZJ(Integer.valueOf(i), "state");
        this.LL.LIZJ(c1314730kJj);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        C1317070kNV c1317070kNV;
        HashSet<Integer> hashSet;
        com.bytedance.sdui.components.list.a aVar = this.LLILZLL;
        AbstractC1317090kNX abstractC1317090kNX = aVar.LLILZ;
        if (abstractC1317090kNX != null && (c1317070kNV = abstractC1317090kNX.LLILZ) != null && (hashSet = c1317070kNV.LJIIJJI) != null) {
            hashSet.add(Integer.valueOf(aVar.LLJJ));
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LJJIZ(3);
                    this.LLILZLL.LJJL(2);
                    return;
                }
                return;
            }
            this.LLIZ = false;
            LJJIZ(2);
            this.LLILZLL.LJJL(1);
            return;
        }
        LJJIZ(1);
        this.LLILZLL.LJJL(0);
    }

    public final void LJJIJIIJIL(int i, int i2) {
        if (!this.LLIZ && i2 == 0) {
            if (i > 0) {
                LJJIL(4, 0, this.LLIZLLLIL, 0, 0, "scrolltolower");
                this.LLIZ = true;
            } else {
                if (i >= 0) {
                    return;
                }
                this.LLIZLLLIL = 0;
                LJJIL(2, 0, 0, 0, 0, "scrolltoupper");
                this.LLIZ = true;
            }
        }
    }

    public e(C1298420jtQ c1298420jtQ, a.C0008a c0008a, com.bytedance.sdui.components.list.a aVar) {
        this.LL = c1298420jtQ;
        this.LLILLJJLI = c0008a;
        c0008a.addOnScrollListener(this);
        this.LLILZLL = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    @Override // X.AbstractC1585810rMx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t76.e.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void LJJIL(int i, int i2, int i3, int i4, int i5, String str) {
        if ((i & this.LLILLL) != 0) {
            C1314730kJj c1314730kJj = new C1314730kJj(this.LLILZLL.LLJJ, str);
            if (DisplayMetricsHolder.LIZIZ() != null) {
                float f = DisplayMetricsHolder.LIZIZ().density;
                float f2 = 0 / f;
                c1314730kJj.LIZJ(Float.valueOf(f2), "scrollLeft");
                c1314730kJj.LIZJ(Float.valueOf(i3 / f), "scrollTop");
                c1314730kJj.LIZJ(Float.valueOf(f2), "deltaX");
                c1314730kJj.LIZJ(Float.valueOf(f2), "deltaY");
            }
            this.LL.LIZJ(c1314730kJj);
        }
    }
}
