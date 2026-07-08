package com.bytedance.ies.xelement.viewpager;

import X.C098200Yq;
import X.C1299120juY;
import X.C1319530kRT;
import X.C1319620kRc;
import X.C1336960kta;
import X.C1336970ktb;
import X.C1337000kte;
import X.C1337050ktj;
import X.C189200o6;
import X.C19719512Dh;
import X.C19U0;
import X.C21546519Tz;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1586460rO0;
import X.InterfaceC1967107nB;
import X.ViewOnAttachStateChangeListenerC1339240kxG;
import Y.ACListenerS123S0200000_20;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes21.dex */
public class LynxTabBarView extends UISimpleView<C1319530kRT> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public boolean LL;
    public C1319530kRT LLILLJJLI;
    public float LLILLL;
    public C1337050ktj LLILZ;
    public C19U0 LLILZIL;
    public boolean LLILZLL;
    public final Map<Integer, String> LLIZ;
    public final ArrayList<C1319620kRc> LLIZLLLIL;
    public float LLJ;
    public final C1336960kta LLJI;

    public LynxTabBarView() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public final void LJJIIZI() {
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        C1319530kRT c1319530kRT2 = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        c1319530kRT.addOnTabSelectedListener((InterfaceC1586460rO0) this.LLJI);
        if (this.LLILZLL) {
            return;
        }
        C1336960kta c1336960kta = this.LLJI;
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 == null) {
            c1319530kRT3 = null;
        } else {
            c1319530kRT2 = c1319530kRT3;
        }
        c1336960kta.Oq(c1319530kRT3.getTabAt(c1319530kRT2.getSelectedTabPosition()));
    }

    public final void LJJIJ() {
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        if (c1319530kRT.getBackground() == null) {
            C1319530kRT c1319530kRT2 = this.LLILLJJLI;
            if (c1319530kRT2 == null) {
                c1319530kRT2 = null;
            }
            c1319530kRT2.setBackgroundResource(R.drawable.clf);
            C1319530kRT c1319530kRT3 = this.LLILLJJLI;
            (c1319530kRT3 != null ? c1319530kRT3 : null).getBackground().mutate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        if (this.LLJ > 0.0f) {
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            if (c1319530kRT == null) {
                c1319530kRT = null;
            }
            ViewGroup.LayoutParams layoutParams = c1319530kRT.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C1337000kte.LIZIZ(this.LLJ, this.mContext);
            }
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context != null) {
            C1319530kRT c1319530kRTLIZ = C1336970ktb.LIZ(context);
            this.LLILLJJLI = c1319530kRTLIZ;
            this.LLILZ = new C1337050ktj(this);
            c1319530kRTLIZ.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339240kxG(this, 2));
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            if (c1319530kRT != null) {
                return c1319530kRT;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if ((lynxBaseUI instanceof LynxUI) && (lynxBaseUI instanceof LynxTabbarItem)) {
            this.mChildren.remove(lynxBaseUI);
            ArrayList<C1319620kRc> arrayList = this.LLIZLLLIL;
            LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
            C19719512Dh.LIZ(arrayList).remove(lynxTabbarItem.LLILLL);
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            if (c1319530kRT == null) {
                c1319530kRT = null;
            }
            c1319530kRT.removeTab(lynxTabbarItem.LLILLJJLI);
        }
    }

    @InterfaceC1312540kGC(name = "tab-indicator-top")
    public final void set(float f) {
        LayerDrawable layerDrawable;
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable tabSelectedIndicator = c1319530kRT.getTabSelectedIndicator();
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            layerDrawable.setLayerInset(0, 0, 0, 0, C1337000kte.LIZ(f, this.mContext));
        }
    }

    @InterfaceC1312540kGC(name = "background")
    public final void setBackground(String str) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        LJJIJ();
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        Drawable drawable = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable background = c1319530kRT.getBackground();
        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            drawable = layerDrawable.getDrawable(0);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setColor(C1337000kte.LIZJ(str));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        LJJIJ();
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        Drawable drawable = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable background = c1319530kRT.getBackground();
        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            drawable = layerDrawable.getDrawable(0);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setColor(i);
        }
    }

    @InterfaceC1312540kGC(name = "border-height")
    public final void setBorderHeight(float f) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        LJJIJ();
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        Drawable drawable = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable background = c1319530kRT.getBackground();
        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            drawable = layerDrawable.getDrawable(1);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), C1337000kte.LIZ(f, this.mContext));
        }
    }

    @InterfaceC1312540kGC(name = "border-color")
    public final void setBorderLineColor(String str) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        LJJIJ();
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        Drawable drawable = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable background = c1319530kRT.getBackground();
        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            drawable = layerDrawable.getDrawable(1);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setColor(C1337000kte.LIZJ(str));
        }
    }

    @InterfaceC1312540kGC(name = "border-top")
    public final void setBorderTop(float f) {
        LayerDrawable layerDrawable;
        LJJIJ();
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable background = c1319530kRT.getBackground();
        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            layerDrawable.setLayerInset(0, 0, 0, 0, C1337000kte.LIZ(f, this.mContext));
        }
    }

    @InterfaceC1312540kGC(name = "border-width")
    public final void setBorderWidth(float f) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        LJJIJ();
        int i = (int) (this.mContext.getResources().getDisplayMetrics().widthPixels * (f / 375.0f));
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        Drawable drawable = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable background = c1319530kRT.getBackground();
        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            drawable = layerDrawable.getDrawable(1);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setSize(i, gradientDrawable.getIntrinsicHeight());
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "disable-attach-event")
    public final void setDisableAttachEvent(boolean z) {
        this.LLILZLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LL = map.containsKey("change");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        super.setLynxDirection(i);
        C1319530kRT c1319530kRT = null;
        if (i != 2 && i != 2) {
            C1319530kRT c1319530kRT2 = this.LLILLJJLI;
            if (c1319530kRT2 != null) {
                c1319530kRT = c1319530kRT2;
            }
            c1319530kRT.setLayoutDirection(0);
            return;
        }
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 != null) {
            c1319530kRT = c1319530kRT3;
        }
        c1319530kRT.setLayoutDirection(1);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-force-bind-change-event")
    public final void setOriginChangeEvent(boolean z) {
        if (this.LLILLJJLI != null) {
            LJJIIZI();
        }
    }

    @InterfaceC1312540kGC(name = "tab-height")
    public final void setTabHeight(float f) {
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        C1319530kRT c1319530kRT2 = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        ViewGroup.LayoutParams layoutParams = c1319530kRT.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C1337000kte.LIZ(f, this.mContext);
        }
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 != null) {
            c1319530kRT2 = c1319530kRT3;
        }
        c1319530kRT2.requestLayout();
    }

    @InterfaceC1312540kGC(name = "tab-height-rpx")
    public final void setTabHeightRpx(float f) {
        this.LLJ = f;
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        C1319530kRT c1319530kRT2 = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        ViewGroup.LayoutParams layoutParams = c1319530kRT.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C1337000kte.LIZIZ(this.LLJ, this.mContext);
        }
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 != null) {
            c1319530kRT2 = c1319530kRT3;
        }
        c1319530kRT2.requestLayout();
    }

    @InterfaceC1312540kGC(name = "tab-indicator-color")
    public final void setTabIndicatorColor(String str) {
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        c1319530kRT.setSelectedTabIndicatorColor(C1337000kte.LIZJ(str));
    }

    @InterfaceC1312540kGC(name = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f) {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        C1319530kRT c1319530kRT2 = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable tabSelectedIndicator = c1319530kRT.getTabSelectedIndicator();
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            drawable = layerDrawable.getDrawable(0);
        } else {
            drawable = null;
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), C1337000kte.LIZ(f, this.mContext));
        }
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 != null) {
            c1319530kRT2 = c1319530kRT3;
        }
        c1319530kRT2.requestLayout();
    }

    @InterfaceC1312540kGC(name = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f) {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        C1319530kRT c1319530kRT2 = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable tabSelectedIndicator = c1319530kRT.getTabSelectedIndicator();
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            drawable = layerDrawable.getDrawable(0);
        } else {
            drawable = null;
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setCornerRadius(C1337000kte.LIZ(f, this.mContext));
        }
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 != null) {
            c1319530kRT2 = c1319530kRT3;
        }
        c1319530kRT2.requestLayout();
    }

    @InterfaceC1312540kGC(name = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f) {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        C1319530kRT c1319530kRT2 = null;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        Drawable tabSelectedIndicator = c1319530kRT.getTabSelectedIndicator();
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            drawable = layerDrawable.getDrawable(0);
        } else {
            drawable = null;
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setSize((int) (this.mContext.getResources().getDisplayMetrics().widthPixels * (f / 375.0f)), gradientDrawable.getIntrinsicHeight());
        }
        C1319530kRT c1319530kRT3 = this.LLILLJJLI;
        if (c1319530kRT3 != null) {
            c1319530kRT2 = c1319530kRT3;
        }
        c1319530kRT2.requestLayout();
    }

    @InterfaceC1312540kGC(name = "tab-inter-space")
    public final void setTabInterspace(float f) {
        this.LLILLL = f / 2;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "tab-new-gesture-enable")
    public final void setTabNewGesture(boolean z) {
        C1319530kRT c1319530kRT = this.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        c1319530kRT.setNewGesture(z);
    }

    @InterfaceC1312540kGC(name = "tab-padding-left")
    public final void setTabPaddingLeft(int i) {
        Field declaredField;
        Method declaredMethod;
        try {
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            Object objInvoke = null;
            if (c1319530kRT == null) {
                c1319530kRT = null;
            }
            Class<? super Object> superclass = c1319530kRT.getClass().getSuperclass();
            if (superclass != null) {
                declaredField = superclass.getDeclaredField("contentInsetStart");
            } else {
                declaredField = null;
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
                C1319530kRT c1319530kRT2 = this.LLILLJJLI;
                if (c1319530kRT2 == null) {
                    c1319530kRT2 = null;
                }
                declaredField.set(c1319530kRT2, Integer.valueOf(C1337000kte.LIZ(i, this.mContext)));
            }
            C1319530kRT c1319530kRT3 = this.LLILLJJLI;
            if (c1319530kRT3 == null) {
                c1319530kRT3 = null;
            }
            Class<? super Object> superclass2 = c1319530kRT3.getClass().getSuperclass();
            if (superclass2 != null && (declaredMethod = superclass2.getDeclaredMethod("applyModeAndGravity", new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                C1319530kRT c1319530kRT4 = this.LLILLJJLI;
                if (c1319530kRT4 != null) {
                    objInvoke = c1319530kRT4;
                }
                objInvoke = declaredMethod.invoke(objInvoke, new Object[0]);
            }
            C189200o6.m2constructorimpl(objInvoke);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @InterfaceC1312540kGC(name = "tab-padding-right")
    public final void setTabPaddingRight(int i) {
        Field declaredField;
        try {
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            C1319530kRT c1319530kRT2 = null;
            if (c1319530kRT == null) {
                c1319530kRT = null;
            }
            Class<? super Object> superclass = c1319530kRT.getClass().getSuperclass();
            if (superclass != null && (declaredField = superclass.getDeclaredField("slidingTabIndicator")) != null) {
                declaredField.setAccessible(true);
                C1319530kRT c1319530kRT3 = this.LLILLJJLI;
                if (c1319530kRT3 == null) {
                    c1319530kRT3 = null;
                }
                Object obj = declaredField.get(c1319530kRT3);
                if (obj != null) {
                    LinearLayout linearLayout = (LinearLayout) obj;
                    linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), C1337000kte.LIZ(i, this.mContext), linearLayout.getPaddingBottom());
                    C1319530kRT c1319530kRT4 = this.LLILLJJLI;
                    if (c1319530kRT4 != null) {
                        c1319530kRT2 = c1319530kRT4;
                    }
                    c1319530kRT2.requestLayout();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @InterfaceC1312540kGC(name = "tab-layout-gravity")
    public final void setTablayoutGravity(String str) {
        Class<? super Object> superclass;
        Field declaredField;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        C1319530kRT c1319530kRT = null;
        if (iHashCode != -1364013995) {
            if (iHashCode != 3143043) {
                if (iHashCode == 3317767 && lowerCase.equals("left")) {
                    C1319530kRT c1319530kRT2 = this.LLILLJJLI;
                    if (c1319530kRT2 == null) {
                        c1319530kRT2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = c1319530kRT2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                    }
                    C1319530kRT c1319530kRT3 = this.LLILLJJLI;
                    if (c1319530kRT3 != null) {
                        c1319530kRT = c1319530kRT3;
                    }
                    c1319530kRT.requestLayout();
                    return;
                }
                return;
            }
            if (!lowerCase.equals("fill")) {
                return;
            }
            C1319530kRT c1319530kRT4 = this.LLILLJJLI;
            if (c1319530kRT4 == null) {
                c1319530kRT4 = null;
            }
            c1319530kRT4.setTabMode(1);
            C1319530kRT c1319530kRT5 = this.LLILLJJLI;
            if (c1319530kRT5 == null) {
                c1319530kRT5 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = c1319530kRT5.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -1;
            }
            C1319530kRT c1319530kRT6 = this.LLILLJJLI;
            if (c1319530kRT6 == null) {
                c1319530kRT6 = null;
            }
            c1319530kRT6.setTabGravity(0);
            C1319530kRT c1319530kRT7 = this.LLILLJJLI;
            if (c1319530kRT7 != null) {
                c1319530kRT = c1319530kRT7;
            }
            c1319530kRT.requestLayout();
            return;
        }
        if (!lowerCase.equals("center")) {
            return;
        }
        C1319530kRT c1319530kRT8 = this.LLILLJJLI;
        if (c1319530kRT8 == null) {
            c1319530kRT8 = null;
        }
        c1319530kRT8.setTabGravity(1);
        C1319530kRT c1319530kRT9 = this.LLILLJJLI;
        if (c1319530kRT9 == null) {
            c1319530kRT9 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = c1319530kRT9.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = -1;
        }
        try {
            C1319530kRT c1319530kRT10 = this.LLILLJJLI;
            if (c1319530kRT10 == null) {
                c1319530kRT10 = null;
            }
            superclass = c1319530kRT10.getClass().getSuperclass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (superclass != null && (declaredField = superclass.getDeclaredField("slidingTabIndicator")) != null) {
            declaredField.setAccessible(true);
            C1319530kRT c1319530kRT11 = this.LLILLJJLI;
            if (c1319530kRT11 == null) {
                c1319530kRT11 = null;
            }
            Object obj = declaredField.get(c1319530kRT11);
            if (obj != null) {
                LinearLayout linearLayout = (LinearLayout) obj;
                linearLayout.setGravity(17);
                linearLayout.getLayoutParams().width = -2;
                C189200o6.m2constructorimpl(Unit.LIZ);
                C1319530kRT c1319530kRT12 = this.LLILLJJLI;
                if (c1319530kRT12 != null) {
                    c1319530kRT = c1319530kRT12;
                }
                c1319530kRT.requestLayout();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public LynxTabBarView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILLL = 9.0f;
        this.LLILZLL = true;
        this.LLIZ = new HashMap();
        this.LLIZLLLIL = new ArrayList<>();
        this.LLJ = -1.0f;
        this.LLJI = new C1336960kta(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.19U0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, X.19U0] */
    public final void LJJIJIIJI(int i, int i2) {
        View view;
        View view2;
        C21546519Tz c21546519Tz;
        C21546519Tz c21546519Tz2;
        C19U0 c19u0;
        int size = this.mChildren.size();
        while (i < size) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            C259800zU c259800zU = new C259800zU();
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            View view3 = null;
            if (c1319530kRT == null) {
                c1319530kRT = null;
            }
            ?? tabAt = c1319530kRT.getTabAt(i);
            c259800zU.element = tabAt;
            if (tabAt == 0) {
                C1319530kRT c1319530kRT2 = this.LLILLJJLI;
                if (c1319530kRT2 == null) {
                    c1319530kRT2 = null;
                }
                ?? NewTab = c1319530kRT2.newTab();
                C1319530kRT c1319530kRT3 = this.LLILLJJLI;
                C1319530kRT c1319530kRT4 = c1319530kRT3;
                if (c1319530kRT3 == null) {
                    c1319530kRT4 = 0;
                }
                c1319530kRT4.addTab(NewTab);
                c259800zU.element = NewTab;
            }
            if (lynxBaseUI instanceof LynxTabbarItem) {
                ((LynxTabbarItem) lynxBaseUI).LLILLJJLI = (C19U0) c259800zU.element;
            }
            if (i2 == i && (c19u0 = (C19U0) c259800zU.element) != null) {
                c19u0.LIZIZ();
            }
            C19U0 c19u02 = (C19U0) c259800zU.element;
            if (c19u02 != null) {
                c19u02.LIZLLL((View) ListProtector.get(this.LLIZLLLIL, i));
            }
            C19U0 c19u03 = (C19U0) c259800zU.element;
            if (c19u03 != null && (c21546519Tz2 = c19u03.LJIIIIZZ) != null) {
                c21546519Tz2.setBackgroundColor(0);
            }
            int iLIZ = C1337000kte.LIZ(this.LLILLL, this.mContext);
            C19U0 c19u04 = (C19U0) c259800zU.element;
            if (c19u04 != null) {
                view = c19u04.LJFF;
                view2 = c19u04.LJFF;
            } else {
                view = null;
                view2 = null;
            }
            int paddingTop = view2.getPaddingTop();
            C19U0 c19u05 = (C19U0) c259800zU.element;
            if (c19u05 != null) {
                view3 = c19u05.LJFF;
            }
            view.setPaddingRelative(iLIZ, paddingTop, iLIZ, view3.getPaddingBottom());
            C19U0 c19u06 = (C19U0) c259800zU.element;
            if (c19u06 != null && (c21546519Tz = c19u06.LJIIIIZZ) != null) {
                C786410Ut5.I7(new ACListenerS123S0200000_20(this, c259800zU, 0), c21546519Tz);
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        int i2;
        if ((lynxBaseUI instanceof LynxUI) && (lynxBaseUI instanceof LynxTabbarItem)) {
            LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
            lynxTabbarItem.setParent(this);
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            C1319620kRc c1319620kRc = new C1319620kRc(this.mContext);
            c1319620kRc.setOverflow(lynxTabbarItem.getOverflow());
            c1319620kRc.addView(((LynxUI) lynxBaseUI).mView);
            lynxTabbarItem.LLILLL = c1319620kRc;
            ListProtector.add(this.LLIZLLLIL, i, c1319620kRc);
            if (lynxTabbarItem.getProps().containsKey("tag")) {
                Integer numValueOf = Integer.valueOf(i);
                ((HashMap) this.LLIZ).put(numValueOf, String.valueOf(lynxTabbarItem.getProps().get("tag")));
            }
            if (lynxTabbarItem.LLILZ) {
                i2 = i;
            } else {
                i2 = 0;
            }
            LJJIJIIJI(i, i2);
            C1319530kRT c1319530kRT = this.LLILLJJLI;
            if (c1319530kRT == null) {
                c1319530kRT = null;
            }
            lynxTabbarItem.LL = Integer.valueOf(i);
            lynxTabbarItem.LLILZIL = c1319530kRT;
        }
    }

    @InterfaceC1967107nB
    public final void selectTab(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("index")) {
            int i = readableMap.getInt("index");
            if (i >= 0) {
                C1319530kRT c1319530kRT = this.LLILLJJLI;
                C1319530kRT c1319530kRT2 = null;
                if (c1319530kRT == null) {
                    c1319530kRT = null;
                }
                if (i < c1319530kRT.getTabCount()) {
                    C1319530kRT c1319530kRT3 = this.LLILLJJLI;
                    if (c1319530kRT3 != null) {
                        c1319530kRT2 = c1319530kRT3;
                    }
                    C19U0 tabAt = c1319530kRT2.getTabAt(i);
                    if (tabAt != null) {
                        tabAt.LIZIZ();
                    }
                    javaOnlyMap.put("success", Boolean.TRUE);
                    if (callback != null) {
                        callback.invoke(0, javaOnlyMap);
                        return;
                    }
                    return;
                }
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }
}
