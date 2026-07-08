package com.bytedance.createx.editor.gesture;

import X.C21645419nQ;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import zoo.b;

/* JADX INFO: loaded from: classes6.dex */
public interface GestureLayout$OnGestureListener {
    boolean E2(C21645419nQ c21645419nQ);

    boolean LIZIZ(MotionEvent motionEvent);

    boolean LIZLLL();

    boolean LJ();

    void LJFF(b bVar);

    boolean LJIIIZ(float f);

    void LJIJJ(MotionEvent motionEvent);

    void LJJIJIIJIL(MotionEvent motionEvent);

    boolean LJJLIIIJLJLI(float f);

    boolean LLLLJI(float f);

    boolean LLLLLLLLL(b bVar, float f, float f2);

    boolean LLLZLZ(b bVar);

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapConfirmed(MotionEvent motionEvent);

    boolean onSingleTapUp(MotionEvent motionEvent);

    void onTouchEvent(MotionEvent motionEvent);

    boolean onUp(MotionEvent motionEvent);
}
