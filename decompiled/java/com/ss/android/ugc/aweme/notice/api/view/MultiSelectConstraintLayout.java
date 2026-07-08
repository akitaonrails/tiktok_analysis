package com.ss.android.ugc.aweme.notice.api.view;

import X.C0Z9D;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes30.dex */
public final class MultiSelectConstraintLayout extends ConstraintLayout implements C0Z9D {
    public boolean LL;
    public final MultiSelectConstraintLayout LLILLJJLI;

    public MultiSelectConstraintLayout() {
        throw null;
    }

    @Override // X.C0Z9D
    public final boolean LLLIIL() {
        return this.LL;
    }

    @Override // X.C0Z9D
    public ViewGroup getWrapper() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            TouchDelegate touchDelegate = getTouchDelegate();
            setTouchDelegate(null);
            try {
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                setTouchDelegate(touchDelegate);
                return zOnTouchEvent;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                setTouchDelegate(touchDelegate);
                throw th;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.C0Z9D
    public void setMultiSelectMode(boolean z) {
        this.LL = z;
    }

    public MultiSelectConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = this;
    }
}
