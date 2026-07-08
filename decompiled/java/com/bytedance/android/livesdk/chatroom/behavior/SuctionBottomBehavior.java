package com.bytedance.android.livesdk.chatroom.behavior;

import X.C16BC;
import X.C16G0;
import X.C786410Ut5;
import Y.AAListenerS328S0100000_17;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class SuctionBottomBehavior extends C16BC<View> {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final AFwS254S0000000_17 LJI;
    public final AAListenerS328S0100000_17 LJII;
    public int LJIIIIZZ;

    public SuctionBottomBehavior() {
        this.LIZIZ = true;
        this.LIZLLL = 500L;
        this.LJFF = true;
        this.LJI = AFwS254S0000000_17.get$arr$(42);
        this.LJII = new AAListenerS328S0100000_17(this, 5);
        this.LJIIIIZZ = 1;
    }

    public SuctionBottomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = true;
        this.LIZLLL = 500L;
        this.LJFF = true;
        this.LJI = AFwS254S0000000_17.get$arr$(42);
        this.LJII = new AAListenerS328S0100000_17(this, 5);
        this.LJIIIIZZ = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_suction_bottom_behavior_mode);
        this.LJIIIIZZ = typedArrayObtainStyledAttributes.getInt(R$styleable.ttlive_suction_bottom_behavior_mode_behavior_mode, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZ(int i, View view) {
        if (view.animate() != null && this.LIZJ) {
            view.animate().cancel();
        }
        float translationY = view.getTranslationY() - i;
        if (translationY < (-view.getHeight())) {
            translationY = -view.getHeight();
        } else if (translationY > 0.0f) {
            translationY = 0.0f;
        }
        C786410Ut5.ed(view, translationY);
        this.LJI.getClass();
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        int i2;
        view.layout(0, c16g0.getMeasuredHeight(), view.getMeasuredWidth(), c16g0.getMeasuredHeight() + view.getMeasuredHeight());
        if (this.LIZIZ) {
            if (this.LJFF) {
                view.animate().setDuration(this.LIZLLL).translationY(-view.getMeasuredHeight()).withLayer().setListener(this.LJII).start();
            }
            this.LIZIZ = false;
        } else if (this.LIZJ && this.LIZ != view.getMeasuredHeight()) {
            view.animate().cancel();
            view.animate().setDuration((long) ((Math.abs(view.getMeasuredHeight() + view.getTranslationY()) / view.getMeasuredHeight()) * this.LIZLLL)).setListener(this.LJII).translationY(-view.getMeasuredHeight()).start();
        } else if (this.LIZ == (-((int) view.getTranslationY())) && (i2 = this.LIZ) != 0 && i2 != view.getMeasuredHeight()) {
            C786410Ut5.ed(view, -view.getMeasuredHeight());
        }
        this.LIZ = view.getMeasuredHeight();
        return true;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        if (!this.LJ || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (view2 instanceof RecyclerView) {
            if (this.LJIIIIZZ == 2) {
                RecyclerView recyclerView = (RecyclerView) view2;
                if (((LinearLayoutManager) recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition() != recyclerView.getAdapter().getItemCount() - 1) {
                    return;
                }
            }
            if (((int) view.getTranslationY()) >= 0 && i2 < 0) {
                return;
            }
            if (((int) view.getTranslationY()) <= (-view.getMeasuredHeight()) && i2 > 0) {
                return;
            }
            LIZ(i2, view);
            iArr[1] = i2;
            return;
        }
        if (((int) view.getTranslationY()) >= 0 && i2 < 0) {
            return;
        }
        if (((int) view.getTranslationY()) <= (-view.getMeasuredHeight()) && i2 > 0) {
            return;
        }
        LIZ(i2, view);
        iArr[1] = i2;
    }
}
