package com.ss.android.ugc.aweme.base.ui;

import X.C1322110kVd;
import X.C1331100kk8;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class RemoteImageView extends C1322110kVd {
    public final CopyOnWriteArrayList<View.OnAttachStateChangeListener> LL;

    public void LIZJ() {
    }

    public final void LIZ() {
        Iterator<View.OnAttachStateChangeListener> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            removeOnAttachStateChangeListener(it2.next());
        }
    }

    public View.OnAttachStateChangeListener getLastStateChangeListener() {
        if (this.LL.isEmpty()) {
            return null;
        }
        return this.LL.get(r1.size() - 1);
    }

    public List<View.OnAttachStateChangeListener> getStateChangeListeners() {
        return this.LL;
    }

    public RemoteImageView(Context context) {
        super(context);
        this.LL = new CopyOnWriteArrayList<>();
        LIZJ();
    }

    @Override // android.view.View
    public final void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        super.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.LL.add(onAttachStateChangeListener);
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.LL.remove(onAttachStateChangeListener);
    }

    public void setCornerRadius(float f) {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(f);
        getHierarchy().LJJIII(c1331100kk8);
    }

    public RemoteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new CopyOnWriteArrayList<>();
        LIZJ();
    }

    public RemoteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new CopyOnWriteArrayList<>();
        LIZJ();
    }
}
