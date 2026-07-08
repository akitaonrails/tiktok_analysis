package com.bytedance.touchpoint.ui.pendant;

import X.AbstractC1896090zRP;
import X.AbstractC1899790zXN;
import X.C01GW;
import X.C01U6;
import X.C0BIU;
import X.C0BIV;
import X.C0SVC;
import X.C12ES;
import X.C1619720sFe;
import X.C1879340z0O;
import X.C1894320zOY;
import X.C1894330zOZ;
import X.C1894690zP9;
import X.C1896850zSd;
import X.C1896890zSh;
import X.C1897750zU5;
import X.C1899490zWt;
import X.C1899620zX6;
import X.C1899650zX9;
import X.C1899710zXF;
import X.C1899810zXP;
import X.C1C7U;
import X.C2179971ATj;
import X.C2261111Den;
import X.C274850Apv;
import X.C452501pT;
import X.C710890RuZ;
import X.C786410Ut5;
import X.InterfaceC1896860zSe;
import X.InterfaceC1898910zVx;
import X.InterfaceC420801kM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS62S1200000_28;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.NormalPendant;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS108S0210000_35;
import kotlin.jvm.internal.AwS23S1110000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SpecActWidget implements InterfaceC1896860zSe, View.OnClickListener, View.OnLongClickListener {
    public static final Companion Companion = new Companion();
    public boolean closeManually;
    public Integer foldScrollBaselineAfterDragUnfold;
    public boolean hasInitShow;
    public boolean isNormalPendantExit;
    public boolean isNormalPendantFolded;
    public boolean isPromotionStatus;
    public View.OnClickListener onClickListener;
    public C1894690zP9 pendant;
    public InterfaceC420801kM rewardAnimloopDisposable;
    public ViewGroup rootLayout;
    public boolean showStatus;
    public Bubble showingLongBubble;
    public C1899490zWt specActStaticView;
    public int status;
    public boolean timerCloseManually;
    public int timerPendantStatus;
    public String curTab = "ForYou";
    public final C01GW keva$delegate = C452501pT.LIZIZ(new SpecActWidget$keva$2());
    public boolean isFirstExpose = true;
    public boolean canFoldTimer = true;

    public static final class Companion {
    }

    public void dateChangeWhenTiming() {
    }

    public boolean hasBubbleShow() {
        return false;
    }

    @Override // X.InterfaceC1896860zSe
    public boolean isNormalBubbleShouldShow() {
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }

    public void showPetPendant() {
        this.showStatus = true;
    }

    private final Keva getKeva() {
        return (Keva) this.keva$delegate.getValue();
    }

    private final void handleNormalShrinkState() {
        NormalPendant normalPendant;
        C1894690zP9 c1894690zP9 = this.pendant;
        if (c1894690zP9 == null || (normalPendant = c1894690zP9.LIZ) == null || normalPendant.dismissAfterSeconds <= 0) {
            return;
        }
        C1899810zXP c1899810zXP = C710890RuZ.LIZ;
        c1899810zXP.LIZ.storeInt("life_times", c1899810zXP.LIZ.getInt("life_times", 0) + 1);
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            HandlerHook.viewPostDelay(c1899490zWt, new Runnable() { // from class: com.bytedance.touchpoint.ui.pendant.SpecActWidget.handleNormalShrinkState.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SpecActWidget@1eb9.handleNormalShrinkState$1");
                    com_bytedance_touchpoint_ui_pendant_SpecActWidget$handleNormalShrinkState$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("SpecActWidget@1eb9.handleNormalShrinkState$1");
                }

                public final void com_bytedance_touchpoint_ui_pendant_SpecActWidget$handleNormalShrinkState$1__run$___twin___() {
                    SpecActWidget.this.hideNormalPendant();
                    SpecActWidget.this.isNormalPendantExit = true;
                }

                public static void com_bytedance_touchpoint_ui_pendant_SpecActWidget$handleNormalShrinkState$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_touchpoint_ui_pendant_SpecActWidget$handleNormalShrinkState$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, ((long) normalPendant.dismissAfterSeconds) * 1000);
        }
    }

    public final Context getContext() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJIIJJI();
        }
        return null;
    }

    public final View getCurrentView() {
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt == null || c1899490zWt.getVisibility() != 0) {
            return null;
        }
        return this.specActStaticView;
    }

    @Override // X.InterfaceC1896860zSe
    public String getLandPage() {
        NormalPendant normalPendant;
        C1894690zP9 c1894690zP9 = this.pendant;
        return (c1894690zP9 == null || (normalPendant = c1894690zP9.LIZ) == null || normalPendant.clickAction != 1) ? "" : "start_watch_video";
    }

    @Override // X.InterfaceC1896860zSe
    public int getNormalPendantSubType() {
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            return c1899490zWt.getNormalPendantSubType();
        }
        return 1;
    }

    public void hideNormalPendant() {
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            C786410Ut5.i2(c1899490zWt, 8);
        }
        this.showStatus = false;
    }

    @Override // X.InterfaceC1896860zSe
    public boolean isBound() {
        C1899490zWt c1899490zWt;
        return (this.rootLayout == null || (c1899490zWt = this.specActStaticView) == null || c1899490zWt.getParent() == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    @Override // X.InterfaceC1896860zSe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isPendantShowing() {
        /*
            r3 = this;
            int r0 = r3.status
            r2 = 0
            if (r0 != 0) goto L19
            X.0zWt r1 = r3.specActStaticView
            if (r1 == 0) goto L35
            boolean r0 = r3.isNormalPendantFolded
            if (r0 == 0) goto L25
            boolean r0 = r1.LLLILZLLLI
            if (r0 == 0) goto L22
            boolean r0 = r1.LLLIILIL
            if (r0 != 0) goto L19
            boolean r0 = r1.LLLIIIL
            if (r0 == 0) goto L35
        L19:
            r1 = 1
        L1a:
            boolean r0 = r3.showStatus
            if (r0 == 0) goto L21
            if (r1 == 0) goto L21
            r2 = 1
        L21:
            return r2
        L22:
            boolean r1 = r1.LLLIIIL
            goto L1a
        L25:
            boolean r0 = r1.LLLILZJ
            if (r0 == 0) goto L32
            boolean r0 = r1.LLLIIL
            if (r0 != 0) goto L19
            boolean r0 = r1.LLLIIIIL
            if (r0 == 0) goto L35
            goto L19
        L32:
            boolean r1 = r1.LLLIIIIL
            goto L1a
        L35:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.ui.pendant.SpecActWidget.isPendantShowing():boolean");
    }

    @Override // X.InterfaceC1896860zSe
    public boolean normalPendantIsFold() {
        C1899490zWt c1899490zWt = this.specActStaticView;
        return c1899490zWt != null && c1899490zWt.getStaticPendantIsFold();
    }

    public void resetPendantTranslation() {
        resetViewTranslation(this.specActStaticView);
    }

    public void showNormalPendant() {
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            C786410Ut5.i2(c1899490zWt, 0);
        }
        this.showStatus = true;
    }

    @Override // X.InterfaceC1896860zSe
    public void tryRegisterViewToFeedCleanAbility() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            abstractC1896090zRP.LJJJIL(this.specActStaticView);
        }
    }

    @Override // X.InterfaceC1896860zSe
    public void clear() {
        unbind();
        this.specActStaticView = null;
        this.showStatus = false;
        this.isNormalPendantFolded = false;
        this.foldScrollBaselineAfterDragUnfold = null;
        this.timerPendantStatus = 0;
    }

    public void unbind() {
        if (isBound()) {
            this.rootLayout = null;
            C1899490zWt c1899490zWt = this.specActStaticView;
            if (c1899490zWt == null || c1899490zWt.getParent() == null) {
                return;
            }
            C1899490zWt c1899490zWt2 = this.specActStaticView;
            C786410Ut5.LJJJLZIJ(this.specActStaticView, (ViewGroup) (c1899490zWt2 != null ? c1899490zWt2.getParent() : null));
        }
    }

    public final boolean getCanFoldTimer() {
        return this.canFoldTimer;
    }

    public final boolean getCloseManually() {
        return this.closeManually;
    }

    @Override // X.InterfaceC1896860zSe
    public Bubble getCurrentBubble() {
        return this.showingLongBubble;
    }

    public final Bubble getShowingLongBubble() {
        return this.showingLongBubble;
    }

    public final boolean getTimerCloseManually() {
        return this.timerCloseManually;
    }

    public final int getTimerPendantStatus() {
        return this.timerPendantStatus;
    }

    @Override // X.InterfaceC1896860zSe
    public boolean isClosedByManually() {
        return this.closeManually;
    }

    private final void mobBubbleShow(Bubble bubble) {
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        int i = bubble.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strValueOf = String.valueOf(bubble.bubbleType);
        if (strValueOf == null) {
            strValueOf = "";
        }
        linkedHashMap.put("sub_type", strValueOf);
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
        Integer num = bubble.LIZJ;
        c1894320zOY.getClass();
        C1894320zOY.LJIJJ(i, linkedHashMap, num, null, null, "");
    }

    private final void resetViewTranslation(View view) {
        if (view != null) {
            if (view.getTranslationX() == 0.0f && view.getTranslationY() == 0.0f) {
                return;
            }
            C786410Ut5.Jc(view, 0.0f);
            C786410Ut5.ed(view, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0 A[Catch: Exception -> 0x00ee, PHI: r2
      0x00c0: PHI (r2v7 java.lang.String) = (r2v2 java.lang.String), (r2v8 java.lang.String) binds: [B:67:0x00bb, B:69:0x00be] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00ee, blocks: (B:66:0x00b9, B:70:0x00c0, B:77:0x00cc, B:80:0x00dd, B:81:0x00ea, B:74:0x00c7), top: B:93:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4 A[PHI: r2
      0x00c4: PHI (r2v3 java.lang.String) = (r2v7 java.lang.String), (r2v8 java.lang.String) binds: [B:71:0x00c2, B:69:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7 A[Catch: Exception -> 0x00ee, PHI: r1 r2
      0x00c7: PHI (r1v12 java.lang.String) = (r1v9 java.lang.String), (r1v13 java.lang.String) binds: [B:73:0x00c5, B:71:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r2v6 java.lang.String) = (r2v3 java.lang.String), (r2v7 java.lang.String) binds: [B:73:0x00c5, B:71:0x00c2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00ee, blocks: (B:66:0x00b9, B:70:0x00c0, B:77:0x00cc, B:80:0x00dd, B:81:0x00ea, B:74:0x00c7), top: B:93:0x00b9 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0zX4] */
    @Override // X.InterfaceC1896860zSe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void activateWidget(final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.ui.pendant.SpecActWidget.activateWidget(kotlin.jvm.functions.Function1):void");
    }

    @Override // X.InterfaceC1896860zSe
    public void bind(ViewGroup viewGroup) {
        if (isBound()) {
            return;
        }
        Context context = getContext();
        this.rootLayout = viewGroup;
        if (this.specActStaticView == null && context != null) {
            final C1899490zWt c1899490zWt = new C1899490zWt(context);
            c1899490zWt.setId(R.id.yge);
            if (C0BIU.LIZ() && c1899490zWt.getImageLayout() != null && c1899490zWt.getSmallImageLayout() != null) {
                FrameLayout imageLayout = c1899490zWt.getImageLayout();
                if (imageLayout != null) {
                    C786410Ut5.O7(imageLayout, this);
                }
                FrameLayout smallImageLayout = c1899490zWt.getSmallImageLayout();
                if (smallImageLayout != null) {
                    C786410Ut5.O7(smallImageLayout, this);
                }
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    abstractC1896090zRP.LJ(c1899490zWt.getImageLayout());
                }
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP2 != null) {
                    abstractC1896090zRP2.LJ(c1899490zWt.getSmallImageLayout());
                }
            } else {
                C786410Ut5.pb(c1899490zWt, this);
            }
            C786410Ut5.I7(this, c1899490zWt.getLongBubbleLayout());
            C1619720sFe c1619720sFe2 = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP3 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
            if (abstractC1896090zRP3 != null) {
                abstractC1896090zRP3.LJ(c1899490zWt);
            }
            AbstractC1896090zRP abstractC1896090zRP4 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
            if (abstractC1896090zRP4 != null) {
                abstractC1896090zRP4.LJ(c1899490zWt.getLongBubbleLayout());
            }
            c1899490zWt.setSubViewListener(new InterfaceC1898910zVx() { // from class: com.bytedance.touchpoint.ui.pendant.SpecActWidget$bind$1$1
                @Override // X.InterfaceC1898910zVx
                public void closeViewClick() {
                    if (this.this$0.isBound()) {
                        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                        String str = this.this$0.isNormalPendantFolded ? "fold" : "unfold";
                        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                        int iLJIILJJIL = C1894330zOZ.LIZ().LJIILJJIL();
                        String strValueOf = String.valueOf(c1899490zWt.getNormalPendantSubType());
                        Map mapLIZJ = C1896850zSd.LIZJ();
                        c1894320zOY.getClass();
                        C1894320zOY.LJIIJ(iLJIILJJIL, "close", str, strValueOf, mapLIZJ);
                        this.this$0.setCloseManually(true);
                        this.this$0.showOrHidePendant(false, false);
                        C710890RuZ.LIZ.LJFF("not_show_before_stamp");
                    }
                }

                @Override // X.InterfaceC1898910zVx
                public void onNormalPendantUnFolded() {
                    SpecActWidget specActWidget = this.this$0;
                    specActWidget.isNormalPendantFolded = false;
                    C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                    specActWidget.foldScrollBaselineAfterDragUnfold = Integer.valueOf(C1894330zOZ.LIZ().LJIILJJIL());
                    this.this$0.updateNormalPendantTopMargin(false);
                }
            });
            C786410Ut5.i2(c1899490zWt, 8);
            AbstractC1899790zXN abstractC1899790zXN = new AbstractC1899790zXN() { // from class: com.bytedance.touchpoint.ui.pendant.SpecActWidget$bind$1$2
                @Override // X.AbstractC1899790zXN
                public void onExpose(View view, String str) {
                    this.this$0.onNormalPendantExpose(view, str);
                }
            };
            C1896890zSh c1896890zSh = (C1896890zSh) c1619720sFe2.LIZ(1);
            if (c1896890zSh != null) {
                c1896890zSh.LJIIJJI(c1899490zWt, "normal_pendant", abstractC1899790zXN);
            }
            this.specActStaticView = c1899490zWt;
        }
        C1899490zWt c1899490zWt2 = this.specActStaticView;
        ViewParent parent = null;
        if (c1899490zWt2 != null && c1899490zWt2.getParent() != null) {
            C1899490zWt c1899490zWt3 = this.specActStaticView;
            if (c1899490zWt3 != null) {
                parent = c1899490zWt3.getParent();
            }
            C786410Ut5.LJJJLZIJ(this.specActStaticView, (ViewGroup) parent);
        }
        if ((viewGroup instanceof FrameLayout) || (viewGroup instanceof RelativeLayout)) {
            viewGroup.addView(this.specActStaticView);
        }
        tryRegisterViewToFeedCleanAbility();
        updateNormalPendantTopMargin(this.isNormalPendantFolded);
    }

    public void hideShapeBubble(boolean z) {
        this.showingLongBubble = null;
    }

    @Override // X.InterfaceC1896860zSe
    public void monitorShowingDialogCount(boolean z) {
        if (z) {
            C1899490zWt c1899490zWt = this.specActStaticView;
            if (c1899490zWt != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1899490zWt);
                c1899490zWt.setAlpha(0.5f);
                return;
            }
            return;
        }
        C1899490zWt c1899490zWt2 = this.specActStaticView;
        if (c1899490zWt2 == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1899490zWt2);
        c1899490zWt2.setAlpha(1.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void setCanFoldTimer(boolean z) {
        this.canFoldTimer = z;
    }

    public final void setCloseManually(boolean z) {
        this.closeManually = z;
    }

    @Override // X.InterfaceC1896860zSe
    public void setCurTab(String str) {
        this.curTab = str;
    }

    public void setDragForbidden(boolean z) {
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            c1899490zWt.setDragForbidden(z);
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override // X.InterfaceC1896860zSe
    public void setPendant(C1894690zP9 c1894690zP9) {
        this.pendant = c1894690zP9;
    }

    public final void setShowingLongBubble(Bubble bubble) {
        this.showingLongBubble = bubble;
    }

    public final void setTimerCloseManually(boolean z) {
        this.timerCloseManually = z;
    }

    public final void setTimerPendantStatus(int i) {
        this.timerPendantStatus = i;
    }

    @Override // X.InterfaceC1896860zSe
    public void showAntiFraudBubble(Bubble bubble) {
        this.showingLongBubble = bubble;
    }

    @Override // X.InterfaceC1896860zSe
    public void showClickTipBubble(String str) {
        ViewGroup.LayoutParams layoutParams;
        int iLIZJ;
        int i;
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            if (c1899490zWt.LLJLLIL == null) {
                c1899490zWt.LLJLL = c1899490zWt.findViewById(R.id.v8s);
                TextView textView = (TextView) c1899490zWt.findViewById(R.id.v8t);
                c1899490zWt.LLJLLIL = textView;
                if (textView != null) {
                    textView.setTextColor(C0SVC.LIZIZ(C0SVC.LIZ, "#FF1DD765"));
                }
            }
            TextView textView2 = c1899490zWt.LLJLLIL;
            if (textView2 != null) {
                textView2.setText(str);
            }
            View view = c1899490zWt.LLJLL;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (str.length() <= 11) {
                iLIZJ = (int) C12ES.LIZJ(80.0f, c1899490zWt.getContext());
                i = 1;
            } else {
                iLIZJ = (int) C12ES.LIZJ(300.0f, c1899490zWt.getContext());
                i = 0;
            }
            if (layoutParams != null) {
                layoutParams.width = iLIZJ;
            }
            View view2 = c1899490zWt.LLJLL;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams);
            }
            TextView textView3 = c1899490zWt.LLJLLIL;
            if (textView3 != null) {
                layoutParams2 = textView3.getLayoutParams();
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.gravity = i;
            TextView textView4 = c1899490zWt.LLJLLIL;
            if (textView4 != null) {
                C786410Ut5.g6(textView4, layoutParams3);
            }
            View view3 = c1899490zWt.LLJLL;
            if (view3 != null) {
                C1899710zXF c1899710zXF = new C1899710zXF(c1899490zWt, view3);
                c1899710zXF.LIZ.setCanDrag(false);
                C786410Ut5.LJLLLLLL(4, c1899710zXF.LIZIZ);
                HandlerHook.viewPostDelay(c1899710zXF.LIZIZ, new ARunnableS128S0100000_28(c1899710zXF, 85), 100L);
            }
        }
    }

    @Override // X.InterfaceC1896860zSe
    public void showReminderBubble(Bubble bubble) {
        this.showingLongBubble = bubble;
    }

    public final void updateNormalPendantTopMargin(boolean z) {
        C01U6.LIZIZ(new AwS572S0100000_28(this, 42));
    }

    public void handleNormalPendantFrequency(boolean z, boolean z2) {
        if (!z || !z2) {
            hideNormalPendant();
        }
    }

    @Override // X.InterfaceC1896860zSe
    public boolean isOverDismissCount(int i, int i2) {
        if (i2 > 0 && i2 + C1896850zSd.LJ(this.pendant) <= i) {
            return true;
        }
        return false;
    }

    public final void onNormalPendantExpose(View view, String str) {
        C1879340z0O c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(1);
        if (c1879340z0OLIZ != null && (c1879340z0OLIZ instanceof C1897750zU5)) {
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            if (C1894330zOZ.LIZ().LJJIJIIJIL()) {
                C1894330zOZ.LIZ().LJJIIZI();
            }
            handleNormalShrinkState();
        }
    }

    public void showCountdownShapeBubble(Bubble bubble, String str) {
        this.showingLongBubble = bubble;
    }

    @Override // X.InterfaceC1896860zSe
    public void showOrHidePendant(boolean z, boolean z2) {
        boolean z3;
        C1879340z0O c1879340z0OLIZ;
        if (!isBound()) {
            return;
        }
        if (this.showStatus == z && this.isPromotionStatus == z2 && this.hasInitShow) {
            return;
        }
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null && c1899490zWt.getVisibility() == 0 && this.hasInitShow) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.showStatus = z;
        this.isPromotionStatus = z2;
        if (z2) {
            this.closeManually = false;
            this.timerCloseManually = false;
        }
        if (!z) {
            if (z3 && C274850Apv.LIZ()) {
                C1899490zWt c1899490zWt2 = this.specActStaticView;
                if (c1899490zWt2 != null) {
                    C01U6.LIZLLL(new AwS429S0200000_28(new AwS572S0100000_28(this, 41), c1899490zWt2, 143));
                    return;
                }
                return;
            }
            C1899490zWt c1899490zWt3 = this.specActStaticView;
            if (c1899490zWt3 == null) {
                return;
            }
            C786410Ut5.i2(c1899490zWt3, 8);
            return;
        }
        if (!this.hasInitShow) {
            this.hasInitShow = true;
        }
        if (C274850Apv.LIZ()) {
            C1899490zWt c1899490zWt4 = this.specActStaticView;
            if (c1899490zWt4 != null) {
                if (!C274850Apv.LIZ()) {
                    C786410Ut5.i2(c1899490zWt4, 0);
                } else {
                    C01U6.LIZLLL(new AwS572S0100000_28(c1899490zWt4, 1011));
                }
            }
        } else {
            C1899490zWt c1899490zWt5 = this.specActStaticView;
            if (c1899490zWt5 != null) {
                C786410Ut5.i2(c1899490zWt5, 0);
            }
        }
        if (isPendantShowing() && ((c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(1)) == null || !(c1879340z0OLIZ instanceof C1897750zU5))) {
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            C1894330zOZ.LIZ().LJJIIZI();
        }
        if (this.isPromotionStatus && normalPendantIsFold()) {
            C1899490zWt c1899490zWt6 = this.specActStaticView;
            if (c1899490zWt6 != null) {
                c1899490zWt6.LJIJJ();
            }
            this.isNormalPendantFolded = false;
            this.foldScrollBaselineAfterDragUnfold = null;
            updateNormalPendantTopMargin(false);
        }
    }

    @Override // X.InterfaceC1896860zSe
    public void showNormalLongBubble(String str, String str2, Bubble bubble) {
        C1899650zX9 c1899650zX9;
        this.showingLongBubble = bubble;
        C1899490zWt c1899490zWt = this.specActStaticView;
        if (c1899490zWt != null) {
            c1899490zWt.LLJZ = c1899490zWt.findViewById(R.id.nq2);
            c1899490zWt.LLJZIJLIL = (TextView) c1899490zWt.findViewById(R.id.nq4);
            View viewFindViewById = c1899490zWt.findViewById(R.id.e2f);
            c1899490zWt.LLL = viewFindViewById;
            if (bubble.bubbleType == 2 && viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            TextView textView = c1899490zWt.LLJZIJLIL;
            if (textView != null) {
                textView.setShadowLayer(1.0f, 0.0f, 3.0f, C0SVC.LIZIZ(C0SVC.LIZ, "#4D000000"));
            }
            View view = c1899490zWt.LLL;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS62S1200000_28(c1899490zWt, bubble, str2, 3), view);
            }
            TextView textView2 = c1899490zWt.LLJZIJLIL;
            if (textView2 != null) {
                textView2.setText(str);
            }
            View view2 = c1899490zWt.LLJZ;
            if (view2 != null) {
                c1899650zX9 = new C1899650zX9(c1899490zWt, c1899490zWt.getLongBubbleLayout(), view2, bubble.showDuration);
            } else {
                c1899650zX9 = null;
            }
            c1899490zWt.LLLJ = c1899650zX9;
            if (c1899650zX9 != null) {
                C786410Ut5.LJLLLLLL(4, c1899650zX9.LIZIZ);
                HandlerHook.viewPostDelay(c1899650zX9.LIZIZ, new ARunnableS128S0100000_28(c1899650zX9, 80), 100L);
            }
        }
    }

    @Override // X.InterfaceC1896860zSe
    public void showNormalShapeBubble(Bubble bubble, boolean z, Function0<Unit> function0) {
        this.showingLongBubble = bubble;
    }

    @Override // X.InterfaceC1896860zSe
    public void showV1Bubble(String str, String str2, Bubble bubble) {
        this.showingLongBubble = bubble;
    }

    @Override // X.InterfaceC1896860zSe
    public void tryFoldNormalPendant(int i, String str, int i2, boolean z) {
        NormalPendant normalPendant;
        C1894690zP9 c1894690zP9 = this.pendant;
        if (c1894690zP9 != null && (normalPendant = c1894690zP9.LIZ) != null && normalPendant.shrinkAfter != 0 && !this.isNormalPendantFolded) {
            Integer num = this.foldScrollBaselineAfterDragUnfold;
            if (num != null) {
                if (i < num.intValue() + i2) {
                    return;
                }
            } else if (i < i2 + C1896850zSd.LJ(c1894690zP9)) {
                return;
            }
            this.isNormalPendantFolded = true;
            this.foldScrollBaselineAfterDragUnfold = null;
            updateNormalPendantTopMargin(true);
            C1899490zWt c1899490zWt = this.specActStaticView;
            if (c1899490zWt != null) {
                boolean zLIZIZ = C1899620zX6.LIZIZ(c1899490zWt.getContext());
                C1899490zWt c1899490zWt2 = this.specActStaticView;
                if (c1899490zWt2 != null) {
                    c1899490zWt2.LLJLILLLLZIIL = true;
                    C01U6.LIZIZ(new AwS572S0100000_28(c1899490zWt2, 1024));
                    c1899490zWt2.setCanDrag(C0BIV.LIZ());
                    c1899490zWt2.setCloseViewStatus(z);
                    c1899490zWt2.LLLIIII = z;
                    C786410Ut5.LJLLLLLL(8, c1899490zWt2.getLongBubbleLayout());
                    c1899490zWt2.getTransitionAnimator().LIZIZ();
                    C2261111Den transitionAnimator = c1899490zWt2.getTransitionAnimator();
                    AwS23S1110000_28 awS23S1110000_28 = new AwS23S1110000_28(c1899490zWt2, str, zLIZIZ, 1);
                    transitionAnimator.getClass();
                    C01U6.LIZLLL(new AwS108S0210000_35(transitionAnimator, zLIZIZ, awS23S1110000_28, 1));
                }
            }
        }
    }

    public void showShapeBubble(Bubble bubble, String str, String str2, String str3, boolean z) {
        this.showingLongBubble = bubble;
    }
}
