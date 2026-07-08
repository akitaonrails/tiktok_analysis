package com.ss.android.ugc.gamora.recorder.splitshoot;

import X.AbstractC1646250swR;
import X.AbstractC578120Mlu;
import X.C0AR8;
import X.C0GUE;
import X.C0MTD;
import X.C1308910kAL;
import X.C1391600mJi;
import X.C13LE;
import X.C13LZ;
import X.C1428310nGv;
import X.C1442410ndf;
import X.C1631530sYh;
import X.C1646270swT;
import X.C1646310swX;
import X.C1646620sx2;
import X.C1646670sx7;
import X.C1647390syH;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C1DRG;
import X.C201955140j;
import X.C2217381BqS;
import X.C297750Bll;
import X.C385670FAf;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C531650Kt9;
import X.C533930Kwp;
import X.C538770LBb;
import X.C560530Lyd;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC1647570syZ;
import X.InterfaceC1646450swl;
import X.InterfaceC1648570t0B;
import X.InterfaceC1652190t61;
import X.InterfaceC1653420t80;
import X.InterfaceC1653660t8O;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS81S0200000_12;
import Y.ARunnableS90S0200000_21;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import bfk.b0;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import smn.k;

/* JADX INFO: loaded from: classes26.dex */
public final class s extends AbstractC578120Mlu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final C1DRG LLJJJIL;
    public final C560530Lyd<C1647390syH> LLJJJJ;
    public final h0<Integer> LLJJJJJIL;
    public final C385670FAf<Boolean> LLJJJJLIIL;
    public final C385670FAf<Unit> LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final C538770LBb<Integer> LLJL;
    public final List<InterfaceC1646450swl> LLJLIL;
    public final LiveEvent<C1646670sx7> LLJLILLLLZIIL;
    public TabHost LLJLL;
    public C0GUE LLJLLIL;
    public View LLJLLL;
    public final Set<String> LLJZ;
    public final C0AR8 LLJZIJLIL;
    public final C1664740tQG LLL;
    public final SafeHandler LLLF;
    public final AObjectS246S0100000_25 LLLFF;
    public final s LLLFFI;
    public int LLLFZ;
    public final h0<Boolean> LLLI;
    public final int LLLII;
    public final int LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(s.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1646440swk
    public final boolean A70() {
        TabHost tabHost = this.LLJLL;
        if (tabHost == null) {
            tabHost = null;
        }
        return tabHost.LLILZ;
    }

    public final void LLLLIILL() {
        C385670FAf<Boolean> c385670FAfL00;
        if (!C533930Kwp.LIZIZ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            InterfaceC1652190t61 interfaceC1652190t61 = (InterfaceC1652190t61) this.LLL.getValue(this, LLLIIIIL[0]);
            if (interfaceC1652190t61 == null || (c385670FAfL00 = interfaceC1652190t61.L00()) == null) {
                return;
            }
            c385670FAfL00.LIZ(this, new AObjectS246S0100000_25(this, 547));
            return;
        }
        if (this.LLJILLL < 0 || requireActivity().isFinishing()) {
            return;
        }
        C0AR8 c0ar8 = this.LLJZIJLIL;
        if (c0ar8.LIZ.getBoolean("has_enable_shoot_10_min_video_tip_shown", c0ar8.LIZIZ)) {
            return;
        }
        int i = this.LLJILLL;
        C0GUE c0gue = this.LLJLLIL;
        if (c0gue == null) {
            c0gue = null;
        }
        View childAt = c0gue.getChildAt(i);
        int[] iArr = new int[2];
        childAt.getLocationOnScreen(iArr);
        if (iArr[0] > 0) {
            C0GUE c0gue2 = this.LLJLLIL;
            if (c0gue2 == null) {
                c0gue2 = null;
            }
            View childAt2 = c0gue2.getChildAt(this.LLJILLL);
            if (childAt2 != null) {
                C0GUE c0gue3 = this.LLJLLIL;
                C450720Hlu c450720Hlu = new C450720Hlu((c0gue3 != null ? c0gue3 : null).getContext());
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = childAt2;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c1391600mJi.LJIIIIZZ = 50;
                c450720Hlu.LJIIJ(2131825184);
                c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                c450720Hlu.LIZIZ().show();
                this.LLJJJJ.LIZIZ(this.LLLFF);
                this.LLJZIJLIL.LIZ.storeBoolean("has_enable_shoot_10_min_video_tip_shown", true);
            }
        }
    }

    @Override // X.InterfaceC1646440swk
    public final String Wg() {
        String string;
        TabHost tabHost = this.LLJLL;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        } else {
            tabHost2 = tabHost;
        }
        Object objLIZIZ = tabHost2.LIZIZ(tabHost.getCurrentIndex());
        if (objLIZIZ != null && (string = objLIZIZ.toString()) != null) {
            return string;
        }
        C1631530sYh.LIZ.getClass();
        return C1631530sYh.LIZIZ;
    }

    @Override // X.InterfaceC1646440swk
    public final int dW1() {
        TabHost tabHost = this.LLJLL;
        if (tabHost == null) {
            tabHost = null;
        }
        return tabHost.getHeight();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C201955140j.LJIIL("SplitShootScene onDestroyView");
        super.onDestroyView();
    }

    @Override // X.InterfaceC1646440swk
    public final void Bh1() {
        b0 b0Var;
        TextView textView;
        C385670FAf<Boolean> c385670FAfL00;
        if (((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LJIIIIZZ()) {
            return;
        }
        if (!C533930Kwp.LIZIZ(new String[]{"android.permission.CAMERA"})) {
            InterfaceC1652190t61 interfaceC1652190t61 = (InterfaceC1652190t61) this.LLL.getValue(this, LLLIIIIL[0]);
            if (interfaceC1652190t61 == null || (c385670FAfL00 = interfaceC1652190t61.L00()) == null) {
                return;
            }
            c385670FAfL00.LIZ(this, new AObjectS246S0100000_25(this, 548));
            return;
        }
        if (this.LLJJIJIL < 0 || requireActivity().isFinishing()) {
            return;
        }
        C0GUE c0gue = this.LLJLLIL;
        if (c0gue == null) {
            c0gue = null;
        }
        View childAt = c0gue.getChildAt(this.LLJJIJIL);
        if (!(childAt instanceof b0) || (b0Var = (b0) childAt) == null || (textView = b0Var.getTextView()) == null) {
            return;
        }
        C0GUE c0gue2 = this.LLJLLIL;
        HandlerHook.viewPost(c0gue2 != null ? c0gue2 : null, new ARunnableS90S0200000_21(textView, this, 31));
    }

    @Override // X.InterfaceC1646440swk
    public final /* bridge */ /* synthetic */ h0 AC0() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1646440swk
    public final int LLJJJJLIIL() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    public final void LLLLIIIILLL(int i) {
        b0 b0Var;
        TextView textView;
        int iIntValue;
        C0GUE c0gue = this.LLJLLIL;
        if (c0gue == null) {
            c0gue = null;
        }
        int childCount = c0gue.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0GUE c0gue2 = this.LLJLLIL;
            if (c0gue2 == null) {
                c0gue2 = null;
            }
            View childAt = c0gue2.getChildAt(i2);
            if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null && (textView = b0Var.getTextView()) != null) {
                if (i2 == i) {
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    HandlerHook.viewPost(textView, new ARunnableS81S0200000_12(textView, this, 72));
                } else {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, textView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    textView.setShadowLayer(5.0f, 0.0f, 1.0f, iIntValue);
                }
            }
        }
    }

    @Override // X.InterfaceC1646440swk
    public final void setTabSwitchEnabled(boolean z) {
        TabHost tabHost = this.LLJLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setUISwitchEnabled(z);
        tabHost.setScrollEnabled(z);
    }

    @Override // X.InterfaceC1646440swk
    public final void gj(String str, boolean z) {
        Object next;
        TabHost tabHost = this.LLJLL;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        C531650Kt9 it2 = C13LZ.LJIILJJIL(0, tabHost.getTabCount()).iterator();
        while (true) {
            if (it2.LLILLL) {
                next = it2.next();
                int iIntValue = ((Number) next).intValue();
                TabHost tabHost3 = this.LLJLL;
                if (tabHost3 == null) {
                    tabHost3 = null;
                }
                if (Intrinsics.LJFF(tabHost3.LIZIZ(iIntValue), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            TabHost tabHost4 = this.LLJLL;
            if (tabHost4 != null) {
                tabHost2 = tabHost4;
            }
            tabHost2.LJFF(true, num.intValue(), 0, false, z);
        }
    }

    @Override // X.InterfaceC1646440swk
    public final void Yf(boolean z, int i, boolean z2) {
        TabHost tabHost = null;
        if (z2) {
            TabHost tabHost2 = this.LLJLL;
            if (tabHost2 == null) {
                tabHost2 = null;
            } else {
                tabHost = tabHost2;
            }
            tabHost2.LJ(z, tabHost.getLastIndex(), i, true);
            return;
        }
        TabHost tabHost3 = this.LLJLL;
        if (tabHost3 != null) {
            tabHost = tabHost3;
        }
        tabHost.LJFF(z, tabHost.getLastIndex(), i, false, true);
    }

    @Override // X.AbstractC578120Mlu, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int iIntValue;
        int i;
        int i2;
        b0 b0Var;
        C201955140j.LJIIL("SplitShootScene onCreateView");
        ViewGroup viewGroup2 = (ViewGroup) ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("split", getSceneContext(), layoutInflater, R.layout.d93, viewGroup, false);
        TabHost tabHost = (TabHost) viewGroup2.findViewById(R.id.vvc);
        this.LLJLL = tabHost;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        this.LLJLLIL = (C0GUE) tabHost.findViewById(R.id.eqx);
        TabHost tabHost3 = this.LLJLL;
        if (tabHost3 == null) {
            tabHost3 = null;
        }
        View viewFindViewById = tabHost3.findViewById(R.id.vv_);
        this.LLJLLL = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, requireSceneContext());
        final int iIntValue2 = -16777216;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e6, requireSceneContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        Drawable drawable = new Drawable(iIntValue, iLIZIZ, iIntValue2, iLIZIZ2) { // from class: X.0FP4
            public static final /* synthetic */ int LJII = 0;
            public final int LIZ;
            public final int LIZIZ;
            public final float LIZJ = 0.0f;
            public final float LIZLLL = 1.0f;
            public final Paint LJ;
            public final Paint LJFF;
            public RectF LJI;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                RectF rectF = this.LJI;
                int i3 = this.LIZ;
                canvas.drawRoundRect(rectF, i3, i3, this.LJ);
                RectF rectF2 = this.LJI;
                int i4 = this.LIZ;
                canvas.drawRoundRect(rectF2, i4, i4, this.LJFF);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i3) {
                this.LJ.setAlpha(i3);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJ.setColorFilter(colorFilter);
            }

            {
                this.LIZ = iLIZIZ;
                this.LIZIZ = iLIZIZ2;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(0);
                paint.setShadowLayer(iLIZIZ2, 0.0f, 1.0f, iIntValue2);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                this.LJ = paint;
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setColor(iIntValue);
                this.LJFF = paint2;
                this.LJI = new RectF();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i3, int i4, int i5, int i6) {
                super.setBounds(i3, i4, i5, i6);
                int i7 = this.LIZIZ;
                float f = this.LIZJ;
                float f2 = this.LIZLLL;
                this.LJI = new RectF((i3 + i7) - f, (i4 + i7) - f2, (i5 - i7) - f, ((i6 - i7) - f2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            }
        };
        viewFindViewById.setLayerType(1, null);
        viewFindViewById.setBackground(drawable);
        View view = this.LLJLLL;
        if (view == null) {
            view = null;
        }
        C1428310nGv.LJII(view, -1, Integer.valueOf(this.LLLII));
        TabHost tabHost4 = this.LLJLL;
        if (tabHost4 == null) {
            tabHost4 = null;
        }
        tabHost4.setSelectedTextColor(R.attr.ej);
        TabHost tabHost5 = this.LLJLL;
        if (tabHost5 == null) {
            tabHost5 = null;
        }
        tabHost5.setUnselectedTextColor(R.attr.ef);
        TabHost tabHost6 = this.LLJLL;
        if (tabHost6 == null) {
            tabHost6 = null;
        }
        tabHost6.setTabHostGestureListener(new InterfaceC1653660t8O() { // from class: X.0sx0
            @Override // X.InterfaceC1653660t8O
            public final void LIZ() {
                new C1351210lGZ(this.LIZ.requireSceneContext()).LIZIZ(50, 61);
            }

            @Override // X.InterfaceC1653660t8O
            public final void LJI() {
                this.LIZ.LLLI.LJII(Boolean.TRUE);
            }

            @Override // X.InterfaceC1653660t8O
            public final void LJII() {
                b0 b0Var2;
                C0GUE c0gue = this.LIZ.LLJLLIL;
                if (c0gue == null) {
                    c0gue = null;
                }
                int childCount = c0gue.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    C0GUE c0gue2 = this.LIZ.LLJLLIL;
                    if (c0gue2 == null) {
                        c0gue2 = null;
                    }
                    View childAt = c0gue2.getChildAt(i3);
                    if ((childAt instanceof b0) && (b0Var2 = (b0) childAt) != null) {
                        View view2 = this.LIZ.LLJLLL;
                        if (view2 == null) {
                            view2 = null;
                        }
                        int iAbs = Math.abs(C1428310nGv.LJ(view2) - C1428310nGv.LJ(b0Var2));
                        if (iAbs <= b0Var2.getMeasuredWidth() / 2) {
                            TextView textView = b0Var2.getTextView();
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ej, b0Var2.getContext());
                            textView.setTextColor(numLIZJ3 != null ? numLIZJ3.intValue() : -16777216);
                            C786410Ut5.e5(b0Var2, ((b0Var2.getMeasuredWidth() - iAbs) * 2.0f) / b0Var2.getMeasuredWidth());
                            b0Var2.e0();
                        } else if (iAbs <= b0Var2.getMeasuredWidth() / 2 || iAbs > b0Var2.getMeasuredWidth()) {
                            TextView textView2 = b0Var2.getTextView();
                            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ef, b0Var2.getContext());
                            textView2.setTextColor(numLIZJ4 != null ? numLIZJ4.intValue() : -1);
                            TextView textView3 = b0Var2.getTextView();
                            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a1a, b0Var2.getContext());
                            textView3.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ5 != null ? numLIZJ5.intValue() : -16777216);
                            C786410Ut5.e5(b0Var2, 1.0f);
                        } else {
                            TextView textView4 = b0Var2.getTextView();
                            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.ef, b0Var2.getContext());
                            textView4.setTextColor(numLIZJ6 != null ? numLIZJ6.intValue() : -1);
                            TextView textView5 = b0Var2.getTextView();
                            Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.a1a, b0Var2.getContext());
                            textView5.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ7 != null ? numLIZJ7.intValue() : -16777216);
                            C786410Ut5.e5(b0Var2, ((iAbs - (b0Var2.getMeasuredWidth() / 2)) * 2.0f) / b0Var2.getMeasuredWidth());
                        }
                    }
                }
            }

            @Override // X.InterfaceC1653660t8O
            public final void LJIIIIZZ() {
                b0 b0Var2;
                C0GUE c0gue = this.LIZ.LLJLLIL;
                if (c0gue == null) {
                    c0gue = null;
                }
                int childCount = c0gue.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    C0GUE c0gue2 = this.LIZ.LLJLLIL;
                    if (c0gue2 == null) {
                        c0gue2 = null;
                    }
                    View childAt = c0gue2.getChildAt(i3);
                    if ((childAt instanceof b0) && (b0Var2 = (b0) childAt) != null) {
                        C786410Ut5.e5(b0Var2, 1.0f);
                    }
                }
                this.LIZ.LLLI.LJII(Boolean.FALSE);
            }
        });
        Activity activityRequireActivity = requireActivity();
        ArrayList arrayList = new ArrayList();
        int i3 = this.LLJILLL;
        String string = activityRequireActivity.getString(EnumC1647570syZ.RECORD_COMBINE_600.getNameResId());
        C1631530sYh.LIZ.getClass();
        C1646310swX.LIZ(arrayList, new k(new C1646620sx2(i3, string, C1631530sYh.LJ), this, this.LLJJJIL), new AwS569S0100000_25((AbstractC578120Mlu) this, 591));
        C1646310swX.LIZ(arrayList, new k(new C1646620sx2(this.LLJJ, activityRequireActivity.getString(EnumC1647570syZ.RECORD_COMBINE_180.getNameResId()), C1631530sYh.LIZLLL), this, this.LLJJJIL), new AwS569S0100000_25((AbstractC578120Mlu) this, 592));
        C1646310swX.LIZ(arrayList, new k(new C1646620sx2(this.LLJJIJI, activityRequireActivity.getString(EnumC1647570syZ.RECORD_COMBINE.getNameResId()), "record_custom_duration_video"), this, this.LLJJJIL), new AwS569S0100000_25((AbstractC578120Mlu) this, 593));
        C1646310swX.LIZ(arrayList, new k(new C1646620sx2(this.LLJJI, activityRequireActivity.getString(EnumC1647570syZ.RECORD_COMBINE_60.getNameResId()), C1631530sYh.LIZJ), this, this.LLJJJIL), new AwS569S0100000_25((AbstractC578120Mlu) this, 594));
        C1646310swX.LIZ(arrayList, new k(new C1646620sx2(this.LLJJIII, activityRequireActivity.getString(EnumC1647570syZ.RECORD_COMBINE_15.getNameResId()), C1631530sYh.LIZIZ), this, this.LLJJJIL), new AwS569S0100000_25((AbstractC578120Mlu) this, 595));
        int i4 = this.LLJJIJIIJIL;
        if (C297750Bll.LIZ()) {
            i = 2131828279;
        } else {
            i = 2131828278;
        }
        C1646310swX.LIZ(arrayList, new C1646270swT(new C1646620sx2(i4, C0MTD.LIZ(i), EnumC1647570syZ.RECORD_NOW.getTag()), this, this.LLJJJIL), new AwS569S0100000_25((AbstractC578120Mlu) this, 596));
        int i5 = this.LLJJIJIL;
        EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_LIGHTENING_TEXT;
        final C1646620sx2 c1646620sx2 = new C1646620sx2(i5, activityRequireActivity.getString(enumC1647570syZ.getNameResId()), enumC1647570syZ.getTag());
        final C1DRG c1drg = this.LLJJJIL;
        C1646310swX.LIZ(arrayList, new AbstractC1646250swR(c1646620sx2, this, c1drg) { // from class: X.0swQ
            @Override // X.InterfaceC1646450swl
            public final void m5(C1646490swp c1646490swp) {
            }

            @Override // X.InterfaceC1646450swl
            public final void yf(C1646490swp c1646490swp) {
            }
        }, new AwS569S0100000_25((AbstractC578120Mlu) this, 597));
        if (!arrayList.isEmpty()) {
            this.LLJLIL.clear();
            this.LLJLIL.addAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1646620sx2 c1646620sx2YJ1 = ((InterfaceC1646450swl) it2.next()).YJ1();
                int i6 = c1646620sx2YJ1.LIZ;
                String str = c1646620sx2YJ1.LIZIZ;
                String str2 = c1646620sx2YJ1.LIZJ;
                if (C1442410ndf.LIZ() > 0 && (b0Var = SplitShootScenePreloader.INSTANCE.get()) != null) {
                    b0Var.h0(8);
                } else {
                    C0GUE c0gue = this.LLJLLIL;
                    if (c0gue == null) {
                        c0gue = null;
                    }
                    b0Var = new b0(c0gue.getContext(), 0);
                    b0Var.h0(8);
                }
                b0Var.setText(str);
                b0Var.setEnabled(true);
                b0Var.setTag(str2);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(b0Var);
                b0Var.setLayoutParams(layoutParams);
                b0Var.e0();
                C0GUE c0gue2 = this.LLJLLIL;
                if (c0gue2 == null) {
                    c0gue2 = null;
                }
                c0gue2.addView(b0Var, i6);
                this.LLJZ.add(str2);
            }
        }
        TabHost tabHost7 = this.LLJLL;
        if (tabHost7 == null) {
            tabHost7 = null;
        }
        tabHost7.setOnIndexChangedListener(new InterfaceC1653420t80() { // from class: X.0sx1
            @Override // X.InterfaceC1653420t80
            public final void LIZ(int i7, int i8, Object obj, boolean z, boolean z2) {
                TabHost tabHost8 = null;
                InterfaceC1646630sx3 interfaceC1646630sx3 = (InterfaceC1646630sx3) this.LIZ.LLJJJIL.LJIIL(null, InterfaceC1646630sx3.class);
                if (interfaceC1646630sx3 != null) {
                    TabHost tabHost9 = this.LIZ.LLJLL;
                    if (tabHost9 == null) {
                        tabHost9 = null;
                    }
                    interfaceC1646630sx3.fD0(tabHost9);
                }
                TabHost tabHost10 = this.LIZ.LLJLL;
                if (tabHost10 != null) {
                    tabHost8 = tabHost10;
                }
                Object objLIZ = tabHost8.LIZ(i7);
                if (objLIZ != null) {
                    this.LIZ.LLJJJJ.LJIIJ(new C1647390syH(obj, objLIZ, i8, false, z2, true, EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag(), z, false, 264));
                    this.LIZ.LLLLIIIILLL(i7);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        String str3 = this.LLJJLIIIJLLLLLLLZ;
        C1631530sYh.LIZ.getClass();
        if (Intrinsics.LJFF(str3, C1631530sYh.LJ)) {
            i2 = this.LLJILLL;
            if (i2 < 0) {
                i2 = this.LLJJIII;
            }
        } else if (Intrinsics.LJFF(str3, C1631530sYh.LIZLLL)) {
            i2 = this.LLJJ;
            if (i2 < 0) {
                i2 = this.LLJJIII;
            }
        } else if (Intrinsics.LJFF(str3, C1631530sYh.LIZJ)) {
            i2 = this.LLJJI;
        } else if (Intrinsics.LJFF(str3, "record_custom_duration_video")) {
            i2 = this.LLJJIJI;
        } else if (Intrinsics.LJFF(str3, EnumC1647570syZ.RECORD_NOW.getTag())) {
            i2 = this.LLJJIJIIJIL;
        } else {
            i2 = this.LLJJIII;
        }
        TabHost tabHost8 = this.LLJLL;
        if (tabHost8 != null) {
            tabHost2 = tabHost8;
        }
        if (i2 < 0) {
            i2 = this.LLJJIII;
        }
        tabHost2.LJFF(true, i2, 0, false, true);
        this.LLJJJJJIL.LIZ(this, new AObjectS246S0100000_25(this, 543));
        C385670FAf<Boolean> c385670FAf = this.LLJJJJLIIL;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS246S0100000_25(this, 544));
        }
        C385670FAf<Unit> c385670FAf2 = this.LLJJL;
        if (c385670FAf2 != null) {
            c385670FAf2.LIZ(this, new AObjectS246S0100000_25(this, 545));
        }
        this.LLJL.LIZ(this, new AObjectS246S0100000_25(this, 546));
        if (this.LLJILLL > -1) {
            C0AR8 c0ar8 = this.LLJZIJLIL;
            if (!c0ar8.LIZ.getBoolean("has_enable_shoot_10_min_video_tip_shown", c0ar8.LIZIZ)) {
                this.LLJJJJ.LIZ(this, this.LLLFF);
                LLLLIILL();
            }
        }
        LiveEvent<C1646670sx7> liveEvent = this.LLJLILLLLZIIL;
        if (liveEvent != null) {
            liveEvent.LJII(this, Lifecycle.State.CREATED, new AObjectS306S0200000_25((Object) this, (Object) viewGroup, (InterfaceC1648570t0B) 18));
        }
        return viewGroup2;
    }

    @Override // X.InterfaceC1646440swk
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        TabHost tabHost = null;
        if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            TabHost tabHost2 = this.LLJLL;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            if (tabHost2.getCurrentIndex() > 0) {
                TabHost tabHost3 = this.LLJLL;
                if (tabHost3 != null) {
                    tabHost = tabHost3;
                }
                tabHost.LJ(true, tabHost.getCurrentIndex() - 1, 3, true);
            }
            return true;
        }
        if (motionEvent.getX() > motionEvent2.getX() && Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            TabHost tabHost4 = this.LLJLL;
            if (tabHost4 == null) {
                tabHost4 = null;
            }
            int currentIndex = tabHost4.getCurrentIndex();
            TabHost tabHost5 = this.LLJLL;
            if (tabHost5 == null) {
                tabHost5 = null;
            }
            if (currentIndex < tabHost5.getTabCount() - 1) {
                TabHost tabHost6 = this.LLJLL;
                if (tabHost6 != null) {
                    tabHost = tabHost6;
                }
                tabHost.LJ(true, tabHost.getCurrentIndex() + 1, 3, true);
            }
            return true;
        }
        return false;
    }

    public s(ShortVideoContext shortVideoContext, C1DRG c1drg, C560530Lyd<C1647390syH> c560530Lyd, h0<Integer> h0Var, C385670FAf<Boolean> c385670FAf, C385670FAf<Unit> c385670FAf2, String str, C538770LBb<Integer> c538770LBb, List<InterfaceC1646450swl> list, LiveEvent<C1646670sx7> liveEvent) {
        super(shortVideoContext);
        this.LLJJJIL = c1drg;
        this.LLJJJJ = c560530Lyd;
        this.LLJJJJJIL = h0Var;
        this.LLJJJJLIIL = c385670FAf;
        this.LLJJL = c385670FAf2;
        this.LLJJLIIIJLLLLLLLZ = str;
        this.LLJL = c538770LBb;
        this.LLJLIL = list;
        this.LLJLILLLLZIIL = liveEvent;
        this.LLJZ = new LinkedHashSet();
        this.LLJZIJLIL = new C0AR8();
        this.LLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652190t61.class, null);
        this.LLLF = new SafeHandler(this);
        this.LLLFF = new AObjectS246S0100000_25(this, 542);
        this.LLLFFI = this;
        this.LLLI = new h0<>(Boolean.FALSE);
        this.LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        this.LLLIIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }
}
