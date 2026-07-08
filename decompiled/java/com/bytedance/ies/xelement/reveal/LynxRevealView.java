package com.bytedance.ies.xelement.reveal;

import X.C1299120juY;
import X.C19290410dS;
import X.C21586019dq;
import X.C21591519ej;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC21591819em;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.xelement.reveal.LynxRevealView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class LynxRevealView extends UISimpleView<C21591519ej> {
    public C21591519ej LL;
    public boolean LLILLJJLI;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public LynxRevealView(s sVar) {
        super(sVar);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.19eW] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context != null) {
            C21591519ej c21591519ej = new C21591519ej(context);
            this.LL = c21591519ej;
            c21591519ej.LLJJI = 2;
            c21591519ej.LLJIJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            c21591519ej.LLJILJILJ = 1;
            c21591519ej.LLIZ = (int) ((c21591519ej.getContext().getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
            c21591519ej.LLJJIJIL = C21586019dq.LJIIJ(c21591519ej, c21591519ej.LLJJJJ);
            try {
                Field declaredField = C21586019dq.class.getDeclaredField("LJIIZILJ");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    C21586019dq c21586019dq = c21591519ej.LLJJIJIL;
                    final Context context2 = c21591519ej.getContext();
                    final ?? r0 = new Interpolator() { // from class: X.19eW
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            float f2 = f - 1.0f;
                            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                        }
                    };
                    declaredField.set(c21586019dq, new OverScroller(context2, r0) { // from class: X.19eV
                        @Override // android.widget.OverScroller
                        public final void startScroll(int i, int i2, int i3, int i4, int i5) {
                            super.startScroll(i, i2, i3, i4, Math.min(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, i5));
                        }
                    });
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchFieldException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C21586019dq c21586019dq2 = c21591519ej.LLJJIJIL;
            if (c21586019dq2 != null) {
                c21586019dq2.LJIILLIIL = 15;
            }
            c21591519ej.LLJJJ = new C19290410dS(c21591519ej.getContext(), c21591519ej.LLJJJJJIL, null);
            C21591519ej c21591519ej2 = this.LL;
            if (c21591519ej2 == null) {
                c21591519ej2 = null;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21591519ej2);
            c21591519ej2.setLayoutParams(layoutParams);
            C21591519ej c21591519ej3 = this.LL;
            if (c21591519ej3 == null) {
                c21591519ej3 = null;
            }
            c21591519ej3.setSwipeListener(new InterfaceC21591819em() { // from class: X.18hd
                @Override // X.InterfaceC21591819em
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC21591819em
                public final void LIZ() {
                    LynxRevealView lynxRevealView = this.LIZ;
                    if (lynxRevealView.LLILLJJLI) {
                        C1298720jtu c1298720jtu = lynxRevealView.mContext.LLIZ;
                        C1289960jfm c1289960jfm = new C1289960jfm(lynxRevealView.getSign(), "state");
                        c1289960jfm.LIZIZ("opened", "state");
                        c1298720jtu.LIZIZ(c1289960jfm);
                    }
                }

                @Override // X.InterfaceC21591819em
                public final void LLILII() {
                    LynxRevealView lynxRevealView = this.LIZ;
                    if (lynxRevealView.LLILLJJLI) {
                        C1298720jtu c1298720jtu = lynxRevealView.mContext.LLIZ;
                        C1289960jfm c1289960jfm = new C1289960jfm(lynxRevealView.getSign(), "state");
                        c1289960jfm.LIZIZ("closed", "state");
                        c1298720jtu.LIZIZ(c1289960jfm);
                    }
                }
            });
            C21591519ej c21591519ej4 = this.LL;
            if (c21591519ej4 != null) {
                return c21591519ej4;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null && map.containsKey("state")) {
            this.LLILLJJLI = true;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "mode")
    public final void setRevealLayoutMode(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C21591519ej c21591519ej = null;
        if (Intrinsics.LJFF(lowerCase, "normal")) {
            C21591519ej c21591519ej2 = this.LL;
            if (c21591519ej2 != null) {
                c21591519ej = c21591519ej2;
            }
            c21591519ej.setMode$x_element_reveal_view_release(0);
            return;
        }
        if (!Intrinsics.LJFF(lowerCase, "same_level")) {
            return;
        }
        C21591519ej c21591519ej3 = this.LL;
        if (c21591519ej3 != null) {
            c21591519ej = c21591519ej3;
        }
        c21591519ej.setMode$x_element_reveal_view_release(1);
    }

    @InterfaceC1967107nB
    public final void toggleActive(ReadableMap readableMap) {
        C21591519ej c21591519ej;
        C21591519ej c21591519ej2 = null;
        if (readableMap.hasKey("state")) {
            String string = readableMap.getString("state");
            if (Intrinsics.LJFF(string, "close")) {
                C21591519ej c21591519ej3 = this.LL;
                if (c21591519ej3 != null) {
                    c21591519ej2 = c21591519ej3;
                }
                c21591519ej2.LIZIZ(true);
                return;
            }
            if (!Intrinsics.LJFF(string, "open")) {
                return;
            }
            C21591519ej c21591519ej4 = this.LL;
            if (c21591519ej4 != null) {
                c21591519ej2 = c21591519ej4;
            }
            c21591519ej2.LIZJ(true);
            return;
        }
        C21591519ej c21591519ej5 = this.LL;
        if (c21591519ej5 == null) {
            c21591519ej = null;
        } else {
            c21591519ej = c21591519ej5;
        }
        if (c21591519ej.LLJILJIL == 2) {
            if (c21591519ej5 != null) {
                c21591519ej2 = c21591519ej5;
            }
            c21591519ej2.LIZIZ(true);
        } else {
            if (c21591519ej5 != null) {
                c21591519ej2 = c21591519ej5;
            }
            c21591519ej2.LIZJ(true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            C21591519ej c21591519ej = null;
            if (lynxBaseUI instanceof LynxRevealInnerLeft) {
                C21591519ej c21591519ej2 = this.LL;
                if (c21591519ej2 == null) {
                    c21591519ej2 = null;
                }
                c21591519ej2.LIZ(((LynxUI) lynxBaseUI).mView);
                C21591519ej c21591519ej3 = this.LL;
                if (c21591519ej3 != null) {
                    c21591519ej = c21591519ej3;
                }
                c21591519ej.setDragEdge(1);
                return;
            }
            if (lynxBaseUI instanceof LynxRevealInnerRight) {
                C21591519ej c21591519ej4 = this.LL;
                if (c21591519ej4 == null) {
                    c21591519ej4 = null;
                }
                c21591519ej4.LIZ(((LynxUI) lynxBaseUI).mView);
                C21591519ej c21591519ej5 = this.LL;
                if (c21591519ej5 != null) {
                    c21591519ej = c21591519ej5;
                }
                c21591519ej.setDragEdge(2);
                return;
            }
            if (lynxBaseUI instanceof LynxRevealInnerTop) {
                C21591519ej c21591519ej6 = this.LL;
                if (c21591519ej6 == null) {
                    c21591519ej6 = null;
                }
                c21591519ej6.LIZ(((LynxUI) lynxBaseUI).mView);
                C21591519ej c21591519ej7 = this.LL;
                if (c21591519ej7 != null) {
                    c21591519ej = c21591519ej7;
                }
                c21591519ej.setDragEdge(4);
                return;
            }
            if (lynxBaseUI instanceof LynxRevealInnerBottom) {
                C21591519ej c21591519ej8 = this.LL;
                if (c21591519ej8 == null) {
                    c21591519ej8 = null;
                }
                c21591519ej8.LIZ(((LynxUI) lynxBaseUI).mView);
                C21591519ej c21591519ej9 = this.LL;
                if (c21591519ej9 != null) {
                    c21591519ej = c21591519ej9;
                }
                c21591519ej.setDragEdge(8);
                return;
            }
            C21591519ej c21591519ej10 = this.LL;
            if (c21591519ej10 != null) {
                c21591519ej = c21591519ej10;
            }
            View view = lynxUI.mView;
            View view2 = c21591519ej.LL;
            if (view2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c21591519ej, view2);
                c21591519ej.removeView(view2);
            }
            c21591519ej.LL = view;
            c21591519ej.addView(view);
        }
    }
}
