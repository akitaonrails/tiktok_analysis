package com.ss.android.ugc.aweme.feed;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C04VQ;
import X.C07CX;
import X.C0DR7;
import X.C0DR8;
import X.C0S48;
import X.C0S4O;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C255650A0d;
import X.C296800BkE;
import X.C305280Bxu;
import X.C418440Gaw;
import X.C452501pT;
import X.C732240Snu;
import X.C732250Snv;
import X.C732270Snx;
import X.C732280Sny;
import X.C814420VxA;
import X.InterfaceC20343114ir;
import X.ViewOnTouchListenerC736230SuL;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoViewCellRootView extends C732240Snu implements InterfaceC20343114ir {
    public ViewOnTouchListenerC736230SuL LL;
    public Function1<? super MotionEvent, Boolean> LLILLJJLI;
    public Function1<? super MotionEvent, Boolean> LLILLL;
    public View.OnTouchListener LLILZ;
    public final C01GW LLILZIL;
    public final String LLILZLL;
    public final C01GW LLIZ;

    public VideoViewCellRootView(Context context) {
        this(context, null, 6);
    }

    public VideoViewCellRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final AbstractC1604130rqV getLogs() {
        return (AbstractC1604130rqV) this.LLIZ.getValue();
    }

    private final SecureRandom getSecureRandom() {
        return (SecureRandom) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC20343114ir
    public final boolean LIZIZ() {
        C732280Sny.LIZ.getClass();
        return !C732280Sny.LIZ(this);
    }

    public final void LIZJ() {
        C01GW c01gw = C255650A0d.LIZ;
        if (((Number) c01gw.getValue()).floatValue() > 0.0f) {
            if (getSecureRandom().nextFloat() <= ((Number) c01gw.getValue()).floatValue()) {
                C0S4O.LIZIZ(C0S4O.LIZ, C0S48.ENTRY_ERROR_BLACK_CHECK, 6);
            }
        }
    }

    @Override // X.InterfaceC20343114ir
    public final List LIZ(boolean z) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArr[0]);
            sbLIZ.append('/');
            sbLIZ.append(iArr[1]);
            return C1697810uHb.LJIIJJI(String.valueOf(getTranslationX()), String.valueOf(getTranslationY()), C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(iArr[0]);
        sbLIZ2.append('/');
        sbLIZ2.append(iArr[1]);
        return C1697810uHb.LJIIJJI(String.valueOf(getTranslationX()), String.valueOf(getTranslationY()), C2188811AlT.LIZIZ(sbLIZ2), String.valueOf(getX()), String.valueOf(getY()), String.valueOf(getScaleX()), String.valueOf(getScaleY()), String.valueOf(getPaddingLeft()), String.valueOf(getPaddingTop()), String.valueOf(getPaddingRight()), String.valueOf(getPaddingBottom()));
    }

    @Override // X.C732240Snu, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Boolean> function1;
        ViewOnTouchListenerC736230SuL viewOnTouchListenerC736230SuL;
        if (C305280Bxu.LIZ() && (viewOnTouchListenerC736230SuL = this.LL) != null && viewOnTouchListenerC736230SuL.onTouch(this, motionEvent)) {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (C296800BkE.LIZ() != 0 && (function1 = this.LLILLJJLI) != null && function1.invoke(motionEvent).booleanValue()) {
            requestDisallowInterceptTouchEvent(true);
            return super.dispatchTouchEvent(motionEvent);
        }
        Function1<? super MotionEvent, Boolean> function12 = this.LLILLL;
        if (function12 != null && function12.invoke(motionEvent).booleanValue()) {
            requestDisallowInterceptTouchEvent(true);
            return super.dispatchTouchEvent(motionEvent);
        }
        View.OnTouchListener onTouchListener = this.LLILZ;
        if (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (C04VQ.LIZ() && f < 1.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Alpha changed to: ");
            sbLIZ.append(f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            getLogs().LJIIIZ(strLIZIZ);
            Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
            LIZJ();
        }
    }

    public final void setDiggIconCallback(Function1<? super MotionEvent, Boolean> function1) {
        this.LLILLL = function1;
    }

    public final void setEdgeSpeedupListener(ViewOnTouchListenerC736230SuL viewOnTouchListenerC736230SuL) {
        this.LL = viewOnTouchListenerC736230SuL;
    }

    public final void setPenalTouchListener(View.OnTouchListener onTouchListener) {
        this.LLILZ = onTouchListener;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        if (C04VQ.LIZ() && f != 1.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ScaleX changed to: ");
            sbLIZ.append(f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            getLogs().LJIIIZ(strLIZIZ);
            Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
            LIZJ();
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        if (C04VQ.LIZ() && f != 1.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ScaleY changed to: ");
            sbLIZ.append(f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            getLogs().LJIIIZ(strLIZIZ);
            Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
            LIZJ();
        }
    }

    public final void setShareIconCallback(Function1<? super MotionEvent, Boolean> function1) {
        this.LLILLJJLI = function1;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        if (C04VQ.LIZ() && Math.abs(f) >= C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TranslationX changed to: ");
            sbLIZ.append(f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            getLogs().LJIIIZ(strLIZIZ);
            Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
            LIZJ();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (C04VQ.LIZ() && Math.abs(f) >= C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TranslationY changed to: ");
            sbLIZ.append(f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            getLogs().LJIIIZ(strLIZIZ);
            Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
            LIZJ();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (C04VQ.LIZ() && i != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Visibility changed to: ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            getLogs().LJIIIZ(strLIZIZ);
            Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
            LIZJ();
        }
    }

    public VideoViewCellRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZIL = C452501pT.LIZIZ(new C732270Snx());
        this.LLILZLL = "VideoViewCellRootView";
        this.LLIZ = C452501pT.LIZIZ(new C732250Snv(this));
        if (((Number) C07CX.LIZ.getValue()).intValue() >= 1) {
            C07CX.LIZ(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0DR8.LJLLILLLL.getClass();
        if (C0DR7.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (C04VQ.LIZ()) {
            if (Math.abs(i) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))) || Math.abs(i2) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))) || Math.abs(i3) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))) || Math.abs(i4) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT)))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Padding changed to: ");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append(i3);
                sbLIZ.append(", ");
                sbLIZ.append(i4);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                getLogs().LJIIIZ(strLIZIZ);
                Npth.reportBizException(this.LLILZLL, new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
                LIZJ();
            }
        }
    }
}
