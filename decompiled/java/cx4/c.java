package cx4;

import X.C15D7;
import X.C1888060zES;
import X.C21607519hJ;
import X.C786410Ut5;
import X.InterfaceC469360Ias;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS44S0101000_33;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import cx4.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class c extends FrameLayout implements InterfaceC469360Ias {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public final List<View> LLJJL;
    public final C1888060zES LLJJLIIIJLLLLLLLZ;
    public final LinearLayout LLJL;
    public C21607519hJ LLJLIL;
    public InterfaceC469360Ias LLJLILLLLZIIL;
    public boolean LLJLL;
    public final List<LynxUI> LLJLLIL;
    public final ARunnableS133S0100000_33 LLJLLL;
    public Method LLJZ;
    public Field LLJZIJLIL;

    public final void LIZJ() {
        if (this.LLJLIL != null) {
            Iterator it2 = ((ArrayList) this.LLJJL).iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setBackground(LIZ(this.LLJJJIL));
            }
            int i = this.LLJJJJ;
            int i2 = (i < 0 || i >= ((ArrayList) this.LLJJL).size()) ? 0 : this.LLJJJJ;
            if (((ArrayList) this.LLJJL).size() > 0) {
                ((View) ListProtector.get(this.LLJJL, i2)).setBackground(LIZ(this.LLJJJ));
                this.LLJJJJJIL = this.LLJJLIIIJLLLLLLLZ.getCurrentItem();
            }
        }
    }

    public final boolean LIZLLL() {
        return this.LLJLL && this.LLJJ && "normal".equals(this.LLJILJILJ) && ((CopyOnWriteArrayList) this.LLJLLIL).size() == 2;
    }

    public final void LJ() {
        try {
            if (this.LLJZIJLIL == null) {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                this.LLJZIJLIL = declaredField;
                declaredField.setAccessible(true);
            }
            this.LLJZIJLIL.set(this.LLJJLIIIJLLLLLLLZ, Boolean.TRUE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.19hJ] */
    public final void LJII() {
        LJFF(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJILJILJ);
        boolean z = this.LLJJIII;
        this.LLJJIII = z;
        C1888060zES c1888060zES = this.LLJJLIIIJLLLLLLLZ;
        if (c1888060zES != null) {
            c1888060zES.setScrollable(z);
        }
        if (this.LLJLIL == null) {
            this.LLJLIL = new PagerAdapter() { // from class: X.19hJ
                @Override // androidx.viewpager.widget.PagerAdapter
                public final int LJIJJ(Object obj) {
                    return -2;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final boolean LJJIFFI(View view, Object obj) {
                    return view == obj;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int getCount() {
                    c cVar = this.LLILLJJLI;
                    return cVar.LLJJ ? cVar.LL : ((CopyOnWriteArrayList) cVar.LLJLLIL).size();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final float LJIL(int i) {
                    if (this.LLILLJJLI.LLJILJILJ.equals("multi-pages")) {
                        int i2 = this.LLILLJJLI.LLJJJJLIIL;
                        if (i2 == 0) {
                            return 1.0f;
                        }
                        return r0.LLJILJIL / i2;
                    }
                    if (!this.LLILLJJLI.LLJILJILJ.equals("carousel")) {
                        return 1.0f;
                    }
                    return 0.8f;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final Object LJJI(int i, ViewGroup viewGroup) {
                    boolean z2;
                    View view;
                    int iLJIIIZ = this.LLILLJJLI.LJIIIZ(i);
                    c cVar = this.LLILLJJLI;
                    if (((CopyOnWriteArrayList) cVar.LLJLLIL).size() == 0) {
                        view = new View(cVar.getContext());
                    } else {
                        LynxUI lynxUI = (LynxUI) ListProtector.get(cVar.LLJLLIL, iLJIIIZ);
                        View view2 = lynxUI.mView;
                        FrameLayout frameLayout = new FrameLayout(cVar.getContext());
                        if (view2 instanceof ViewGroup) {
                            if (lynxUI.getOverflow() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            frameLayout.setClipChildren(z2);
                        }
                        if (view2.getParent() instanceof ViewGroup) {
                            C786410Ut5.LJJJLZIJ(view2, (ViewGroup) view2.getParent());
                        }
                        if (cVar.LLJLL) {
                            view2.setTag("swiper_lynx_view_tag");
                        }
                        frameLayout.addView(view2);
                        View view3 = new View(cVar.getContext());
                        frameLayout.addView(view3, new FrameLayout.LayoutParams(-1, -1));
                        if (!cVar.LLJJIJI) {
                            view3.setBackgroundColor(cVar.LLJJIJIL);
                            view3.setTag("swiper_item_mask_tag");
                        }
                        view = frameLayout;
                        if (cVar.LLJLL) {
                            frameLayout.setTag(Integer.valueOf(i));
                            view = frameLayout;
                        }
                    }
                    viewGroup.addView(view);
                    return view;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
                    C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
                }
            };
            this.LLJJLIIIJLLLLLLLZ.addOnPageChangeListener(this);
            this.LLJJLIIIJLLLLLLLZ.setAdapter(this.LLJLIL);
        }
        int i = this.LLJJJJ;
        if (i < 0 || i >= ((CopyOnWriteArrayList) this.LLJLLIL).size()) {
            this.LLJJJJ = 0;
        }
        int i2 = this.LLJJ ? (this.LL / 2) + this.LLJJJJ : this.LLJJJJ;
        boolean z2 = this.LLJJIJIIJIL;
        try {
            LJ();
            if (this.LLJZ == null) {
                Class cls = Boolean.TYPE;
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, cls, cls);
                this.LLJZ = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.LLJZ.invoke(this.LLJJLIIIJLLLLLLLZ, Integer.valueOf(i2), Boolean.valueOf(z2), Boolean.TRUE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJLIIIJLLLLLLLZ.setCurrentItem(i2, z2);
        }
        if (this.LLJJI) {
            LJIIIIZZ();
        }
    }

    public final void LJIIIIZZ() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJLLL);
        HandlerHook.viewPostDelay(this, this.LLJLLL, this.LLILZIL);
    }

    public c(Context context) {
        super(context, null, 0);
        this.LL = 5000;
        this.LLILLJJLI = 5;
        this.LLILLL = 20;
        this.LLILZ = 20;
        this.LLILZIL = 5000;
        this.LLILZLL = 500;
        this.LLIZ = 10;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = -1;
        this.LLJIJIL = -1;
        this.LLJILJIL = 1;
        this.LLJILJILJ = "normal";
        this.LLJILLL = true;
        this.LLJJ = true;
        this.LLJJI = true;
        this.LLJJIII = true;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = Color.argb(128, 0, 0, 0);
        this.LLJJJ = Color.argb(255, 255, 255, 255);
        this.LLJJJIL = Color.argb(89, 255, 255, 255);
        this.LLJJJJ = 0;
        this.LLJJJJJIL = 0;
        this.LLJJJJLIIL = 0;
        this.LLJLL = false;
        this.LLJLLIL = new CopyOnWriteArrayList();
        this.LLJLLL = new ARunnableS133S0100000_33(this, 78);
        this.LLJJL = new ArrayList();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ibm, this, true);
        C1888060zES c1888060zES = (C1888060zES) viewTd.findViewById(R.id.br6);
        this.LLJJLIIIJLLLLLLLZ = c1888060zES;
        this.LLJL = (LinearLayout) viewTd.findViewById(R.id.dtf);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            final Context context2 = c1888060zES.getContext();
            declaredField.set(c1888060zES, new Scroller(context2) { // from class: X.19hK
                @Override // android.widget.Scroller
                public final void startScroll(int i, int i2, int i3, int i4) {
                    super.startScroll(i, i2, i3, i4, this.LIZ.LLILZLL);
                }

                @Override // android.widget.Scroller
                public final void startScroll(int i, int i2, int i3, int i4, int i5) {
                    super.startScroll(i, i2, i3, i4, this.LIZ.LLILZLL);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("Banner", e.getMessage());
        }
    }

    public static final GradientDrawable LIZ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public final void LJI(int i) {
        C21607519hJ c21607519hJ;
        this.LLJJJJ = i;
        if (LJIIIZ(this.LLJJLIIIJLLLLLLLZ.getCurrentItem()) == i && (c21607519hJ = this.LLJLIL) != null && c21607519hJ.getCount() > 0) {
            return;
        }
        C21607519hJ c21607519hJ2 = this.LLJLIL;
        if (c21607519hJ2 != null && i < c21607519hJ2.getCount()) {
            HandlerHook.viewPost(this.LLJJLIIIJLLLLLLLZ, new ARunnableS44S0101000_33(i, this, 6));
        } else {
            HandlerHook.viewPostDelay(this.LLJJLIIIJLLLLLLLZ, new ARunnableS128S0100000_28(this, 62), 200L);
        }
    }

    public final int LJIIIZ(int i) {
        if (((CopyOnWriteArrayList) this.LLJLLIL).size() != 0 && this.LLJJ) {
            int i2 = i - (this.LL / 2);
            int iAbs = Math.abs(i2) % ((CopyOnWriteArrayList) this.LLJLLIL).size();
            if (i2 >= 0 || iAbs == 0) {
                return iAbs;
            }
            return ((CopyOnWriteArrayList) this.LLJLLIL).size() - iAbs;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJI) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3 && action != 4) {
                if (action == 0) {
                    HandlerHook.viewRemoveCallbacks(this, this.LLJLLL);
                }
            } else {
                LJIIIIZZ();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        InterfaceC469360Ias interfaceC469360Ias = this.LLJLILLLLZIIL;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageScrollStateChanged(i);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        InterfaceC469360Ias interfaceC469360Ias = this.LLJLILLLLZIIL;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageSelected(LJIIIZ(i));
        }
        if (this.LLJILLL) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LLILLL, this.LLILZ);
            int i2 = this.LLILLJJLI;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.LLILLL, this.LLILZ);
            int i3 = this.LLILLJJLI;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
            int iLJIIIZ = LJIIIZ(this.LLJJJJJIL);
            int iLJIIIZ2 = LJIIIZ(i);
            if (((CopyOnWriteArrayList) this.LLJLLIL).size() == 0) {
                iLJIIIZ2 = 0;
            }
            if (!((ArrayList) this.LLJJL).isEmpty()) {
                List<View> list = this.LLJJL;
                if (iLJIIIZ >= 0 && iLJIIIZ < ((ArrayList) list).size()) {
                    List<View> list2 = this.LLJJL;
                    if (iLJIIIZ2 >= 0 && iLJIIIZ2 < ((ArrayList) list2).size()) {
                        ((View) ListProtector.get(this.LLJJL, iLJIIIZ)).setBackground(LIZ(this.LLJJJIL));
                        C786410Ut5.W5((View) ListProtector.get(this.LLJJL, iLJIIIZ), layoutParams2);
                        ((View) ListProtector.get(this.LLJJL, iLJIIIZ2)).setBackground(LIZ(this.LLJJJ));
                        C786410Ut5.W5((View) ListProtector.get(this.LLJJL, iLJIIIZ2), layoutParams);
                        this.LLJJJJJIL = i;
                    }
                }
            }
        }
    }

    public void setLayerTextureType(int i) {
        this.LLJJLIIIJLLLLLLLZ.setLayerType(i, null);
    }

    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        this.LLJLILLLLZIIL = interfaceC469360Ias;
    }

    public void setOverflow(int i) {
        boolean z = false;
        if (i == 0) {
            this.LLJJLIIIJLLLLLLLZ.setLayerType(0, null);
        } else {
            z = true;
        }
        setClipChildren(z);
    }

    public void setTwoItemCircularSwipe(boolean z) {
        this.LLJLL = z;
    }

    public final void LIZIZ(int i, View view) {
        int iLJIIIZ;
        List<LynxUI> list;
        View view2;
        if ((view instanceof ViewGroup) && view.findViewWithTag("swiper_lynx_view_tag") == null && (iLJIIIZ = LJIIIZ(i)) >= 0 && (list = this.LLJLLIL) != null && ((CopyOnWriteArrayList) list).size() != 0 && iLJIIIZ < ((CopyOnWriteArrayList) this.LLJLLIL).size() && (view2 = ((LynxUI) ListProtector.get(this.LLJLLIL, iLJIIIZ)).mView) != null) {
            if (view2.getParent() instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(view2, (ViewGroup) view2.getParent());
            }
            ((ViewGroup) view).addView(view2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe A[PHI: r5
      0x00fe: PHI (r5v1 android.view.View) = 
      (r5v0 android.view.View)
      (r5v4 android.view.View)
      (r5v4 android.view.View)
      (r5v4 android.view.View)
      (r5v4 android.view.View)
     binds: [B:58:0x00fa, B:26:0x0067, B:28:0x006f, B:30:0x0079, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r8, float r9, int r10) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cx4.c.onPageScrolled(int, float, int):void");
    }

    public final void LJFF(int i, int i2, int i3, String str) {
        int i4;
        C21607519hJ c21607519hJ = this.LLJLIL;
        if (c21607519hJ != null) {
            c21607519hJ.notifyDataSetChanged();
        }
        if (!str.equals("coverflow") && !str.equals("flat-coverflow")) {
            if (str.equals("multi-pages")) {
                this.LLJJLIIIJLLLLLLLZ.setClipToPadding(false);
                int i5 = this.LLJI;
                if (i5 >= 0 && (i4 = this.LLJIJIL) >= 0) {
                    this.LLJJLIIIJLLLLLLLZ.setPadding(i5, 0, i4, 0);
                }
                this.LLJJLIIIJLLLLLLLZ.setPageMargin(i);
                this.LLJJLIIIJLLLLLLLZ.setOffscreenPageLimit(1);
                return;
            }
            this.LLJJLIIIJLLLLLLLZ.setPageMargin(i);
            ViewGroup.LayoutParams layoutParams = this.LLJJLIIIJLLLLLLLZ.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            this.LLJJLIIIJLLLLLLLZ.setOffscreenPageLimit(1);
            this.LLJJLIIIJLLLLLLLZ.setPageTransformer(false, null);
            return;
        }
        this.LLJJLIIIJLLLLLLLZ.setClipToPadding(false);
        int i6 = this.LLJJJJLIIL / 5;
        if (i2 >= 0 && i3 >= 0) {
            this.LLJJLIIIJLLLLLLLZ.setPadding(i2 + i, 0, i3 + i, 0);
        } else {
            this.LLJJLIIIJLLLLLLLZ.setPadding(i6, 0, i6, 0);
        }
        this.LLJJLIIIJLLLLLLLZ.setPageMargin(i);
        this.LLJJLIIIJLLLLLLLZ.setOffscreenPageLimit(2);
        if (!str.equals("coverflow")) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ.setPageTransformer(false, new C15D7() { // from class: X.0eO3
            @Override // X.C15D7
            public final void LIZ(View view, float f) {
                float f2;
                View view2 = (View) view.getParent();
                int left = (view.getLeft() - view2.getPaddingLeft()) - view2.getScrollX();
                int measuredWidth = (view2.getMeasuredWidth() - view2.getPaddingLeft()) - view2.getPaddingRight();
                if (measuredWidth != 0) {
                    f2 = left / measuredWidth;
                } else {
                    f2 = 0.0f;
                }
                float fMin = Math.min(9.0f, Math.max(-9.0f, f2 * 9.0f));
                view.setCameraDistance(1280.0f);
                C786410Ut5.Ib(view, -fMin);
            }
        });
    }
}
