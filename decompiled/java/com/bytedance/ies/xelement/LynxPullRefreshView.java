package com.bytedance.ies.xelement;

import X.C19QY;
import X.C19QZ;
import X.C21576119cF;
import X.C21576919cN;
import X.C21578019cY;
import X.C2188811AlT;
import X.EnumC21577619cU;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC21578119cZ;
import X.InterfaceC21578219ca;
import X.RunnableC21577519cT;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import j27.s;

/* JADX INFO: loaded from: classes34.dex */
public class LynxPullRefreshView extends UIGroup<C21576919cN> {
    public static final /* synthetic */ int LLIZ = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;

    public LynxPullRefreshView() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @InterfaceC1967107nB
    public void autoStartRefresh(ReadableMap readableMap) {
        this.LLILZIL = false;
        C21576919cN c21576919cN = (C21576919cN) this.mView;
        if (c21576919cN.LLLLLLL == EnumC21577619cU.None && c21576919cN.LJIIJ(c21576919cN.LLJJLIIIJLLLLLLLZ)) {
            RunnableC21577519cT runnableC21577519cT = new RunnableC21577519cT(c21576919cN);
            c21576919cN.setViceState(EnumC21577619cU.Refreshing);
            runnableC21577519cT.run();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        boolean z = true;
        this.LL = true;
        this.LLILLJJLI = true;
        C21576119cF c21576119cF = new C21576119cF(context, this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create SmartRefreshLayout: ");
        sbLIZ.append(this);
        sbLIZ.append(", ");
        sbLIZ.append(c21576119cF);
        LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
        c21576119cF.LLJJLIIIJLLLLLLLZ = this.LL;
        boolean z2 = this.LLILLJJLI;
        c21576119cF.LLLIILIL = true;
        c21576119cF.LLJL = z2;
        c21576119cF.LLLILZJ = new InterfaceC21578219ca() { // from class: X.19hH
            @Override // X.InterfaceC21578219ca
            public final void LJFF() {
                C1298720jtu c1298720jtu;
                LynxPullRefreshView lynxPullRefreshView = this.LL;
                int i = LynxPullRefreshView.LLIZ;
                s sVar = lynxPullRefreshView.mContext;
                if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                    C1289960jfm c1289960jfm = new C1289960jfm(lynxPullRefreshView.getSign(), "startrefresh");
                    c1289960jfm.LIZIZ(Boolean.valueOf(lynxPullRefreshView.LLILZIL), "isManual");
                    c1298720jtu.LIZIZ(c1289960jfm);
                }
                lynxPullRefreshView.LLILZIL = true;
            }
        };
        c21576119cF.LLLILZLLLI = new InterfaceC21578119cZ() { // from class: X.19hI
            @Override // X.InterfaceC21578119cZ
            public final void LJJIIJ() {
                C1298720jtu c1298720jtu;
                LynxPullRefreshView lynxPullRefreshView = this.LL;
                int i = LynxPullRefreshView.LLIZ;
                s sVar = lynxPullRefreshView.mContext;
                if (sVar == null || (c1298720jtu = sVar.LLIZ) == null) {
                    return;
                }
                c1298720jtu.LIZIZ(new C1298700jts(lynxPullRefreshView.getSign(), "startloadmore"));
            }
        };
        if (!z2) {
            z = false;
        }
        c21576119cF.LLJL = z;
        c21576119cF.LLLIZZ = new C21578019cY() { // from class: X.0jfn
            @Override // X.InterfaceC21577819cW
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC21577819cW
            public final void LJ() {
            }

            @Override // X.InterfaceC21577819cW
            public final void LJI() {
                C1298720jtu c1298720jtu;
                LynxPullRefreshView lynxPullRefreshView = this.LL;
                s sVar = lynxPullRefreshView.mContext;
                if (sVar == null || (c1298720jtu = sVar.LLIZ) == null) {
                    return;
                }
                c1298720jtu.LIZIZ(new C1298700jts(lynxPullRefreshView.getSign(), "headerreleased"));
            }

            @Override // X.InterfaceC21577819cW
            public final void LJIIIZ() {
                C1298720jtu c1298720jtu;
                LynxPullRefreshView lynxPullRefreshView = this.LL;
                s sVar = lynxPullRefreshView.mContext;
                if (sVar == null || (c1298720jtu = sVar.LLIZ) == null) {
                    return;
                }
                c1298720jtu.LIZIZ(new C1298700jts(lynxPullRefreshView.getSign(), "footerreleased"));
            }

            @Override // X.InterfaceC21577819cW
            public final void LIZLLL(boolean z3, float f) {
                C1298720jtu c1298720jtu;
                C1298720jtu c1298720jtu2;
                LynxPullRefreshView lynxPullRefreshView = this.LL;
                s sVar = lynxPullRefreshView.mContext;
                if (sVar != null && (c1298720jtu2 = sVar.LLIZ) != null) {
                    C1289960jfm c1289960jfm = new C1289960jfm(lynxPullRefreshView.getSign(), "headeroffset");
                    c1289960jfm.LIZIZ(Boolean.valueOf(z3), "isDragging");
                    c1289960jfm.LIZIZ(Float.valueOf(f), "offsetPercent");
                    c1298720jtu2.LIZIZ(c1289960jfm);
                }
                LynxPullRefreshView lynxPullRefreshView2 = this.LL;
                s sVar2 = lynxPullRefreshView2.mContext;
                if (sVar2 != null && (c1298720jtu = sVar2.LLIZ) != null) {
                    C1289960jfm c1289960jfm2 = new C1289960jfm(lynxPullRefreshView2.getSign(), "headershow");
                    c1289960jfm2.LIZIZ(Boolean.valueOf(z3), "isDragging");
                    c1289960jfm2.LIZIZ(Float.valueOf(f), "offsetPercent");
                    c1298720jtu.LIZIZ(c1289960jfm2);
                }
            }

            @Override // X.InterfaceC21577819cW
            public final void LJIILLIIL(boolean z3, float f) {
                C1298720jtu c1298720jtu;
                LynxPullRefreshView lynxPullRefreshView = this.LL;
                s sVar = lynxPullRefreshView.mContext;
                if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                    C1289960jfm c1289960jfm = new C1289960jfm(lynxPullRefreshView.getSign(), "footeroffset");
                    c1289960jfm.LIZIZ(Boolean.valueOf(z3), "isDragging");
                    c1289960jfm.LIZIZ(Float.valueOf(f), "offsetPercent");
                    c1298720jtu.LIZIZ(c1289960jfm);
                }
            }
        };
        return c21576119cF;
    }

    @InterfaceC1967107nB
    public void finishLoadMore(ReadableMap readableMap) {
        boolean z = readableMap.getBoolean("has_more", true);
        if (z) {
            if (!this.LLILZ) {
                ((C21576919cN) this.mView).LJIILL(false);
            }
            C21576919cN c21576919cN = (C21576919cN) this.mView;
            c21576919cN.getClass();
            c21576919cN.LJII(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - c21576919cN.LLLLLLLLLL))), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) << 16, false);
        } else {
            C21576919cN c21576919cN2 = (C21576919cN) this.mView;
            c21576919cN2.getClass();
            c21576919cN2.LJII(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - c21576919cN2.LLLLLLLLLL))), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) << 16, true);
        }
        this.LLILZ = z;
    }

    @InterfaceC1967107nB
    public void finishRefresh(ReadableMap readableMap) {
        C21576919cN c21576919cN = (C21576919cN) this.mView;
        c21576919cN.getClass();
        c21576919cN.LJIIIIZZ(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - c21576919cN.LLLLLLLLLL))), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) << 16, Boolean.FALSE, true);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        return new FrameLayout.LayoutParams(-1, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeChild: ");
        sbLIZ.append(lynxBaseUI);
        sbLIZ.append(" -> ");
        sbLIZ.append(this);
        LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "detect-scrollchild")
    public final void setDetectScrollChild(boolean z) {
        this.LLILLL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-auto-loadmore")
    public final void setEnableAutoLoadMore(boolean z) {
        ((C21576919cN) this.mView).LLLF = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-loadmore")
    public final void setEnableLoadMore(boolean z) {
        this.LLILLJJLI = z;
        C21576919cN c21576919cN = (C21576919cN) this.mView;
        if (c21576919cN != null) {
            c21576919cN.LLLIILIL = true;
            c21576919cN.LLJL = z;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-refresh")
    public final void setEnableRefresh(boolean z) {
        this.LL = z;
        C21576919cN c21576919cN = (C21576919cN) this.mView;
        if (c21576919cN != null) {
            c21576919cN.LLJJLIIIJLLLLLLLZ = z;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "setting-flag")
    public final void setSetingsFlag(int i) {
        this.LLILZLL = i;
    }

    public LynxPullRefreshView(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = true;
        this.LLILLJJLI = true;
        this.LLILZ = true;
        this.LLILZIL = true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertChild: ");
        sbLIZ.append(lynxBaseUI);
        sbLIZ.append(" -> ");
        sbLIZ.append(this);
        sbLIZ.append(" at ");
        sbLIZ.append(i);
        LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
        onInsertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxRefreshHeader) {
            C19QZ c19qz = new C19QZ(this.mContext);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19qz);
            c19qz.setLayoutParams(layoutParams);
            c19qz.addView(((LynxUI) lynxBaseUI).mView, new FrameLayout.LayoutParams(-1, -2));
            ((C21576919cN) this.mView).LJIJ(c19qz);
            return;
        }
        if (lynxBaseUI instanceof LynxRefreshFooter) {
            C19QY c19qy = new C19QY(this.mContext);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19qy);
            c19qy.setLayoutParams(layoutParams2);
            c19qy.addView(((LynxUI) lynxBaseUI).mView, new FrameLayout.LayoutParams(-1, -2));
            ((C21576919cN) this.mView).LJIIZILJ(c19qy);
            return;
        }
        if (lynxBaseUI instanceof LynxUI) {
            ((C21576919cN) this.mView).LJIILLIIL(((LynxUI) lynxBaseUI).mView);
            return;
        }
        LynxError lynxError = new LynxError(229800, "x-refresh-view Only supports three types of children: x-refresh-header, x-refresh-footer and non-flatten child ui as the refresh content.", "", "error");
        s sVar = this.mContext;
        if (sVar == null) {
            return;
        }
        sVar.LJIILLIIL(lynxError);
    }
}
