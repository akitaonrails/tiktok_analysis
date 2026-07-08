package t76;

import X.AbstractC1317090kNX;
import X.C0KFD;
import X.C1317330kNv;
import X.C1317410kO3;
import X.C1C7U;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdui.components.list.a;
import com.bytedance.sdui.render.bridge.Callback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class f {
    public static int LIZJ = 80;
    public final RecyclerView LIZ;
    public final a LIZIZ;

    public static class a implements Runnable {
        public final WeakReference<RecyclerView> LL;
        public int LLILLL;
        public String LLILZ;
        public int LLILZIL;
        public int LLILZLL;
        public int LLIZ;
        public final C1317330kNv LLJI = new C0KFD() { // from class: X.0kNv
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                this.LL.LLJ = false;
                return false;
            }
        };
        public Callback LLILLJJLI = null;
        public g$b LLIZLLLIL = null;
        public boolean LLJ = false;

        public final void LIZ() {
            int iMin;
            RecyclerView recyclerView = this.LL.get();
            if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
                LIZIZ();
                return;
            }
            if (!this.LLJ) {
                this.LLILLJJLI.invoke(0);
                LIZIZ();
                return;
            }
            int iMin2 = Math.min(this.LLILLL, recyclerView.getLayoutManager().getItemCount() - 1);
            this.LLILLL = iMin2;
            this.LLILLL = Math.max(iMin2, 0);
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    int childCount2 = recyclerView.getChildCount();
                    this.LLILZLL = layoutManager.getItemCount();
                    this.LLIZ = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount2) {
                            break;
                        }
                        g$b g_b = (g$b) recyclerView.getChildAt(i2);
                        int viewLayoutPosition = ((RecyclerView.LayoutParams) g_b.getLayoutParams()).getViewLayoutPosition();
                        this.LLIZ = Math.max(viewLayoutPosition, this.LLIZ);
                        this.LLILZLL = Math.min(viewLayoutPosition, this.LLILZLL);
                        if (viewLayoutPosition == this.LLILLL) {
                            this.LLIZLLLIL = g_b;
                            break;
                        }
                        i2++;
                    }
                    if (this.LLIZLLLIL != null) {
                        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                        int decoratedTop = layoutManager2.getDecoratedTop(this.LLIZLLLIL);
                        int decoratedMeasuredHeight = layoutManager2.getDecoratedMeasuredHeight(this.LLIZLLLIL);
                        int height = layoutManager2.getHeight();
                        int paddingTop = layoutManager2.getPaddingTop();
                        int paddingBottom = (height - paddingTop) - layoutManager2.getPaddingBottom();
                        int i3 = decoratedTop - (TextUtils.equals(this.LLILZ, "middle") ? (this.LLILZIL + paddingTop) + ((paddingBottom - decoratedMeasuredHeight) / 2) : TextUtils.equals(this.LLILZ, "bottom") ? ((this.LLILZIL + paddingTop) + paddingBottom) - decoratedMeasuredHeight : this.LLILZIL + paddingTop);
                        if (i3 == 0) {
                            this.LLILLJJLI.invoke(0);
                        } else {
                            iMin = Math.min(Math.max(Math.abs(i3) / 3, 1), f.LIZJ);
                            if (i3 <= 0) {
                                iMin = -iMin;
                            }
                            if (this.LLIZLLLIL.getHeight() == 0 && iMin == 1) {
                                this.LLILLJJLI.invoke(0);
                            }
                        }
                        LIZIZ();
                        return;
                    }
                    int i4 = this.LLILZLL;
                    int i5 = this.LLILLL;
                    int i6 = i4 > i5 ? -1 : 1;
                    int i7 = this.LLIZ;
                    int i8 = (i7 - i4) + 1;
                    int i9 = i6 == -1 ? i4 - i5 : i5 - i7;
                    int height2 = recyclerView.getHeight();
                    int i10 = (i9 * height2) / i8;
                    if (i9 <= 30 || i10 <= height2 * 10) {
                        iMin = Math.min(height2, f.LIZJ * i9) * i6;
                    } else {
                        int i11 = this.LLILZLL;
                        int i12 = this.LLILLL;
                        recyclerView.scrollToPosition((i11 > i12 ? (i11 - i12) / 2 : (this.LLIZ - i12) / 2) + i12);
                    }
                    if (iMin != 0) {
                        byte b = iMin > 0 ? (byte) 1 : (byte) -1;
                        RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                        int childCount3 = recyclerView.getChildCount();
                        boolean z = recyclerView.findViewHolderForLayoutPosition(0) != null;
                        boolean z2 = recyclerView.findViewHolderForLayoutPosition(layoutManager3.getItemCount() - 1) != null;
                        if ((z && -1 == b) || (z2 && 1 == b)) {
                            int iMin3 = Integer.MAX_VALUE;
                            int iMax = Integer.MIN_VALUE;
                            for (int i13 = 0; i13 < childCount3; i13++) {
                                View childAt = recyclerView.getChildAt(i13);
                                iMin3 = Math.min(layoutManager3.getDecoratedTop(childAt), iMin3);
                                iMax = Math.max(layoutManager3.getDecoratedBottom(childAt), iMax);
                            }
                            int paddingTop2 = layoutManager3.getPaddingTop();
                            int height3 = layoutManager3.getHeight() - layoutManager3.getPaddingBottom();
                            if (z) {
                            }
                        }
                        recyclerView.scrollBy(0, iMin);
                    }
                    this.LLILLJJLI.invoke(4, "can not scroll when come to border");
                    LIZIZ();
                    return;
                }
                g$b g_b2 = (g$b) recyclerView.getChildAt(i);
                if (g_b2.LL != 3 && ((C1317410kO3) recyclerView.getChildViewHolder(g_b2)).LL.LLILLJJLI != null) {
                    break;
                } else {
                    i++;
                }
            }
            HandlerHook.viewPost(recyclerView, this);
        }

        public final void LIZIZ() {
            RecyclerView recyclerView = this.LL.get();
            this.LLJ = false;
            if (recyclerView != null) {
                recyclerView.removeOnItemTouchListener(this.LLJI);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ListScroller$SmoothScroller@fff3.run");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ListScroller$SmoothScroller@fff3.run");
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0kNv] */
        public a(RecyclerView recyclerView) {
            this.LL = new WeakReference<>(recyclerView);
        }
    }

    public f(AbstractC1317090kNX abstractC1317090kNX, a.C0008a c0008a) {
        LIZJ = abstractC1317090kNX.getResources().getDisplayMetrics().densityDpi / 4;
        this.LIZ = c0008a;
        this.LIZIZ = new a(this.LIZ);
    }
}
