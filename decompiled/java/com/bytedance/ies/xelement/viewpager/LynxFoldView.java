package com.bytedance.ies.xelement.viewpager;

import X.AbstractC1319300kR6;
import X.AbstractC1336950ktZ;
import X.C1319310kR7;
import X.C1319500kRQ;
import X.C1336690kt9;
import X.C16G1;
import X.C16GX;
import X.C19U1;
import X.C786410Ut5;
import X.InterfaceC1319390kRF;
import X.InterfaceC1967107nB;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxFoldView extends BaseLynxFoldView<C1319500kRQ, C1319310kR7> {
    public static final /* synthetic */ int LLJI = 0;
    public final ArrayList<LynxBaseUI> LLIZLLLIL;
    public BPEAHandler LLJ;

    public LynxFoldView() {
        throw null;
    }

    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView
    public final void LJJIJL(C16GX c16gx, int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeAll() {
        this.LLIZLLLIL.clear();
        super.removeAll();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void layoutChildren() {
        super.layoutChildren();
        for (LynxBaseUI lynxBaseUI : this.LLIZLLLIL) {
            if (lynxBaseUI instanceof UIGroup) {
                ((UIGroup) lynxBaseUI).layoutChildren();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        super.measureChildren();
        for (LynxBaseUI lynxBaseUI : this.LLIZLLLIL) {
            if (lynxBaseUI != null) {
                lynxBaseUI.measure();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends X.0kR6<K>, X.0kR7] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        if (context == null) {
            return null;
        }
        this.LL = new AbstractC1319300kR6<C1319500kRQ>(context) { // from class: X.0kR7
            @Override // X.AbstractC1319300kR6
            public int getLayoutIntRes() {
                return R.layout.ibk;
            }

            {
                new LinkedHashMap();
            }

            @Override // X.AbstractC1319300kR6
            public void setScrollEnable(boolean z) {
                setMScrollEnable(z);
                ViewGroup.LayoutParams layoutParams = getMCollapsingToolbarLayout().getLayoutParams();
                if (layoutParams instanceof C16GZ) {
                    if (!z) {
                        ((C16GZ) layoutParams).LIZ = 0;
                    } else {
                        ((C16GZ) layoutParams).LIZ = getMInitScrollFlag();
                    }
                    C21543519Sv mCollapsingToolbarLayout = getMCollapsingToolbarLayout();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(mCollapsingToolbarLayout);
                    mCollapsingToolbarLayout.setLayoutParams(layoutParams);
                }
            }
        };
        LJJIJIL();
        return LJJIJIIJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(null);
            C1319310kR7 c1319310kR7LJJIJIIJIL = LJJIJIIJIL();
            View view = lynxUI.mView;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1319310kR7LJJIJIIJIL, view);
            c1319310kR7LJJIJIIJIL.removeView(view);
            View childAt = LJJIJIIJIL().getAppBarLayout().getChildAt(LJJIJIIJIL().getAppBarLayout().getChildCount() - 1);
            if (childAt instanceof C19U1) {
                C1319500kRQ appBarLayout = LJJIJIIJIL().getAppBarLayout();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(appBarLayout, childAt);
                appBarLayout.removeView(childAt);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxViewPager) {
            Iterator<LynxBaseUI> it2 = lynxBaseUI.getChildren().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LynxBaseUI next = it2.next();
                if (next instanceof LynxTabBarView) {
                    if (next != null) {
                        this.LLIZLLLIL.remove(next);
                    }
                }
            }
        }
        super.removeView(lynxBaseUI);
    }

    public LynxFoldView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLIZLLLIL = new ArrayList<>();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxFoldToolbar) {
                C1319310kR7 c1319310kR7LJJIJIIJIL = LJJIJIIJIL();
                View view = ((LynxUI) lynxBaseUI).mView;
                C786410Ut5.LLILLJJLI(c1319310kR7LJJIJIIJIL.LLJLL, 0);
                c1319310kR7LJJIJIIJIL.LLJLL.setPaddingRelative(0, 0, 0, 0);
                c1319310kR7LJJIJIIJIL.LLJLL.addView(view);
                return;
            }
            if (lynxBaseUI instanceof LynxFoldHeader) {
                C1319310kR7 c1319310kR7LJJIJIIJIL2 = LJJIJIIJIL();
                c1319310kR7LJJIJIIJIL2.LLJLILLLLZIIL.addView(((LynxUI) lynxBaseUI).mView, 0);
                return;
            }
            final C1319310kR7 c1319310kR7LJJIJIIJIL3 = LJJIJIIJIL();
            final View view2 = lynxUI.mView;
            c1319310kR7LJJIJIIJIL3.getClass();
            if (view2 instanceof C1336690kt9) {
                AbstractC1336950ktZ abstractC1336950ktZ = (AbstractC1336950ktZ) view2;
                abstractC1336950ktZ.setTabLayoutUpdateListener$x_element_fold_view_release(new InterfaceC1319390kRF() { // from class: X.0kR8
                    @Override // X.InterfaceC1319390kRF
                    public final void LIZ(C19U1 c19u1, boolean z) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        viewGroup.getClass();
                        if (c19u1 != null) {
                            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, c19u1);
                            viewGroup.removeView(c19u1);
                        }
                        C1319310kR7 c1319310kR7 = c1319310kR7LJJIJIIJIL3;
                        if (c19u1 == null) {
                            c1319310kR7.getClass();
                        } else {
                            int childCount = c1319310kR7.getMAppBarLayout().getChildCount();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= childCount) {
                                    break;
                                }
                                View childAt = c1319310kR7.getMAppBarLayout().getChildAt(i2);
                                if (childAt instanceof C19U1) {
                                    if (childAt != null) {
                                        C1319500kRQ mAppBarLayout = c1319310kR7.getMAppBarLayout();
                                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(mAppBarLayout, childAt);
                                        mAppBarLayout.removeView(childAt);
                                    }
                                } else {
                                    i2++;
                                }
                            }
                            c1319310kR7.LLJLIL.addView(c19u1);
                        }
                        ((AbstractC1319370kRD) findViewById(R.id.b6m)).setIsEnableTabbarDrag(z);
                    }
                });
                if (abstractC1336950ktZ.getMTabLayout() != null) {
                    C19U1 mTabLayout = abstractC1336950ktZ.getMTabLayout();
                    if (mTabLayout != null) {
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(abstractC1336950ktZ, mTabLayout);
                        abstractC1336950ktZ.removeView(mTabLayout);
                    }
                    View mTabLayout2 = abstractC1336950ktZ.getMTabLayout();
                    if (mTabLayout2 != null) {
                        c1319310kR7LJJIJIIJIL3.LLJLIL.addView(mTabLayout2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                }
                C16G1 c16g1 = new C16G1(new ViewGroup.LayoutParams(-1, -1));
                c16g1.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1336950ktZ);
                abstractC1336950ktZ.setLayoutParams(c16g1);
            }
            c1319310kR7LJJIJIIJIL3.addView(view2);
            if (this.LLJ == null) {
                this.LLJ = new BPEAHandler(Looper.getMainLooper());
            }
            BPEAHandler bPEAHandler = this.LLJ;
            if (bPEAHandler == null) {
                return;
            }
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS120S0100000_20(this, 144));
        }
    }

    @InterfaceC1967107nB
    public final void setFoldExpanded(ReadableMap readableMap, Callback callback) throws Throwable {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("expanded")) {
            double d = readableMap.getDouble("expanded", -9999.0d);
            if (d >= 0.0d && d <= 1.0d) {
                if (readableMap.hasKey("enableAnimation") && !readableMap.getBoolean("enableAnimation")) {
                    BaseLynxFoldView.LJJIJ(this, d, 0, 2);
                } else {
                    BaseLynxFoldView.LJJIIZI(this, d, 0, 2);
                }
                javaOnlyMap.put("success", Boolean.TRUE);
            } else {
                javaOnlyMap.put("msg", "expanded value must be 0~1");
            }
        } else {
            javaOnlyMap.put("msg", "no index key");
        }
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }
}
