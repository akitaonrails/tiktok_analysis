package com.ss.android.ugc.aweme.ui;

import X.AbstractC1604130rqV;
import X.C00AB;
import X.C0AZV;
import X.C128Y;
import X.C1339250kxH;
import X.C1586350rNp;
import X.C1586380rNs;
import X.C1967407nE;
import X.C19EG;
import X.C19EH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1586410rNv;
import X.InterfaceC1593630rZZ;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes25.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public boolean LL;
    public final ArrayList<C1586350rNp> LLILLJJLI;
    public FrameLayout LLILLL;
    public Context LLILZ;
    public FragmentManager LLILZIL;
    public int LLILZLL;
    public TabHost.OnTabChangeListener LLIZ;
    public C1586350rNp LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC1586410rNv LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;

    /* JADX INFO: loaded from: classes21.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1339250kxH(7);
        public String LL;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FragmentTabHost.SavedState{");
            sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
            sbLIZ.append(" curTab=");
            sbLIZ.append(this.LL);
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LL = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.LL);
        }
    }

    public Fragment getCurrentFragment() {
        C1586350rNp c1586350rNp = this.LLIZLLLIL;
        if (c1586350rNp != null) {
            return c1586350rNp.LIZLLL;
        }
        return null;
    }

    @Override // android.widget.TabHost
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public final void LIZIZ() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C19EH c19ehLJIIJ = null;
        for (int i = 0; i < this.LLILLJJLI.size(); i++) {
            C1586350rNp c1586350rNp = (C1586350rNp) ListProtector.get(this.LLILLJJLI, i);
            Fragment fragmentLJJJJZI = this.LLILZIL.LJJJJZI(c1586350rNp.LIZ);
            c1586350rNp.LIZLLL = fragmentLJJJJZI;
            if (fragmentLJJJJZI != null && !fragmentLJJJJZI.isDetached()) {
                if (c1586350rNp.LIZ.equals(currentTabTag)) {
                    this.LLIZLLLIL = c1586350rNp;
                } else {
                    if (c19ehLJIIJ == null) {
                        c19ehLJIIJ = this.LLILZIL.LJIIJ();
                    }
                    c19ehLJIIJ.LJIILIIL(c1586350rNp.LIZLLL);
                }
            }
        }
        this.LLJ = true;
        C19EH c19ehLIZJ = LIZJ(c19ehLJIIJ, currentTabTag);
        if (c19ehLIZJ != null) {
            c19ehLIZJ.LJIIJ();
            this.LLILZIL.LJJJJL();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJ = false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.LLILLL = frameLayout2;
            frameLayout2.setId(this.LLILZLL);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        View view = new View(context);
        view.setBackgroundColor(-16777216);
        C786410Ut5.T4(view, 0.0f);
        view.setId(com.zhiliaoapp.musically.R.id.uxv);
        C786410Ut5.LJLLLLLL(8, view);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LL = getCurrentTabTag();
        return savedState;
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.LL;
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        this.LLILLJJLI = new ArrayList<>();
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.inflatedId}, 0, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String canonicalName;
        C128Y currentFragment = getCurrentFragment();
        C1586380rNs c1586380rNs = C1586380rNs.LIZ;
        if (((Number) C0AZV.LIZ.getValue()).intValue() == 0 && motionEvent != null && (currentFragment instanceof InterfaceC1593630rZZ) && TextUtils.equals("homepage_hot", ((InterfaceC1593630rZZ) currentFragment).f3())) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    float fAbs = Math.abs(C1586380rNs.LIZJ - motionEvent.getRawX());
                    float fAbs2 = Math.abs(C1586380rNs.LIZLLL - motionEvent.getRawY());
                    if (fAbs2 > fAbs && fAbs2 > 300.0f) {
                        View viewLIZIZ = C1967407nE.LIZIZ(this);
                        Integer numValueOf = null;
                        if (viewLIZIZ != null) {
                            canonicalName = viewLIZIZ.getClass().getCanonicalName();
                            numValueOf = Integer.valueOf(viewLIZIZ.getId());
                        } else {
                            canonicalName = null;
                        }
                        if (!TextUtils.equals("com.ss.android.ugc.aweme.common.widget.VerticalViewPager", canonicalName)) {
                            C1586380rNs.LIZ.getClass();
                            ((AbstractC1604130rqV) C1586380rNs.LIZIZ.getValue()).LJIIJJI(new C00AB(viewLIZIZ, canonicalName, numValueOf, fAbs2));
                        }
                    }
                    C1586380rNs.LIZJ = 0.0f;
                    C1586380rNs.LIZLLL = 0.0f;
                }
            } else {
                C1586380rNs.LIZJ = motionEvent.getRawX();
                C1586380rNs.LIZLLL = motionEvent.getRawY();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TabHost, android.view.ViewGroup, android.view.View
    public final void dispatchWindowFocusChanged(boolean z) {
        if (this.LL) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        View childAt = super.getChildAt(i);
        if (childAt == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            C786410Ut5.LJZ(8, frameLayout);
            return frameLayout;
        }
        return childAt;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.LL);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        Fragment fragment;
        try {
            Fragment fragment2 = null;
            if (this.LLJ) {
                C1586350rNp c1586350rNp = this.LLIZLLLIL;
                if (c1586350rNp != null) {
                    fragment = c1586350rNp.LIZLLL;
                } else {
                    fragment = null;
                }
                C19EH c19ehLIZJ = LIZJ(null, str);
                if (c19ehLIZJ != null) {
                    c19ehLIZJ.LJIIJ();
                    this.LLILZIL.LJJJJL();
                }
            } else {
                fragment = null;
            }
            TabHost.OnTabChangeListener onTabChangeListener = this.LLIZ;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            InterfaceC1586410rNv interfaceC1586410rNv = this.LLJI;
            if (interfaceC1586410rNv != null) {
                C1586350rNp c1586350rNp2 = this.LLIZLLLIL;
                if (c1586350rNp2 != null) {
                    fragment2 = c1586350rNp2.LIZLLL;
                }
                if (fragment2 != fragment) {
                    interfaceC1586410rNv.t(str, fragment2, fragment);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.LL = z;
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.LLJILJIL) {
            this.LLJIJIL = z;
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.LLIZ = onTabChangeListener;
    }

    public void setOnTabSwitchListener(InterfaceC1586410rNv interfaceC1586410rNv) {
        this.LLJI = interfaceC1586410rNv;
    }

    public void setSuperOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new ArrayList<>();
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public final C19EH LIZJ(C19EH c19eh, String str) {
        Fragment fragment;
        this.LLJILJIL = true;
        C1586350rNp c1586350rNp = null;
        for (int i = 0; i < this.LLILLJJLI.size(); i++) {
            C1586350rNp c1586350rNp2 = (C1586350rNp) ListProtector.get(this.LLILLJJLI, i);
            if (c1586350rNp2.LIZ.equals(str)) {
                c1586350rNp = c1586350rNp2;
            }
        }
        if (c1586350rNp == null) {
            return null;
        }
        if (this.LLIZLLLIL != c1586350rNp) {
            if (c19eh == null) {
                c19eh = this.LLILZIL.LJIIJ();
            }
            C1586350rNp c1586350rNp3 = this.LLIZLLLIL;
            if (c1586350rNp3 != null && (fragment = c1586350rNp3.LIZLLL) != null) {
                if (this.LLJIJIL) {
                    c19eh.LJIILL(fragment);
                } else {
                    c19eh.LJIILIIL(fragment);
                }
            }
            Fragment fragment2 = c1586350rNp.LIZLLL;
            if (fragment2 == null) {
                Fragment fragmentInstantiate = Fragment.instantiate(this.LLILZ, c1586350rNp.LIZIZ.getName(), c1586350rNp.LIZJ);
                c1586350rNp.LIZLLL = fragmentInstantiate;
                c19eh.LIZJ(this.LLILZLL, fragmentInstantiate, c1586350rNp.LIZ);
            } else if (this.LLJIJIL) {
                if (fragment2.isDetached()) {
                    c19eh.LJIIIIZZ(c1586350rNp.LIZLLL);
                }
                c19eh.LJJIFFI(c1586350rNp.LIZLLL);
            } else {
                c19eh.LJIIIIZZ(fragment2);
            }
            this.LLIZLLLIL = c1586350rNp;
        }
        return c19eh;
    }

    public final void LIZLLL(C19EG c19eg, FragmentManager fragmentManager) {
        super.setup();
        this.LLILZ = c19eg;
        this.LLILZIL = fragmentManager;
        this.LLILZLL = com.zhiliaoapp.musically.R.id.wxd;
        if (this.LLILLL == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.wxd);
            this.LLILLL = frameLayout;
            if (frameLayout == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No tab content FrameLayout found for id ");
                sbLIZ.append(this.LLILZLL);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LLILLL.setId(com.zhiliaoapp.musically.R.id.wxd);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    public final void LIZ(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        final Context context = this.LLILZ;
        tabSpec.setContent(new TabHost.TabContentFactory(context) { // from class: X.0rNt
            public final Context LIZ;

            {
                this.LIZ = context;
            }

            @Override // android.widget.TabHost.TabContentFactory
            public final View createTabContent(String str) {
                View view = new View(this.LIZ);
                view.setMinimumWidth(0);
                view.setMinimumHeight(0);
                return view;
            }
        });
        String tag = tabSpec.getTag();
        C1586350rNp c1586350rNp = new C1586350rNp(bundle, tag, cls);
        if (this.LLJ) {
            Fragment fragmentLJJJJZI = this.LLILZIL.LJJJJZI(tag);
            c1586350rNp.LIZLLL = fragmentLJJJJZI;
            if (fragmentLJJJJZI != null && !fragmentLJJJJZI.isDetached()) {
                C19EH c19ehLJIIJ = this.LLILZIL.LJIIJ();
                c19ehLJIIJ.LJIILIIL(c1586350rNp.LIZLLL);
                c19ehLJIIJ.LJIIJ();
            }
        }
        this.LLILLJJLI.add(c1586350rNp);
        addTab(tabSpec);
    }
}
