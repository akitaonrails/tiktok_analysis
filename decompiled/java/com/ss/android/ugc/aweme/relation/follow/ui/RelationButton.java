package com.ss.android.ugc.aweme.relation.follow.ui;

import X.C0SY7;
import X.C1908770zlr;
import X.C1908870zm1;
import X.C197039127h;
import X.C427690Gpr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1908740zlo;
import X.InterfaceC1908750zlp;
import X.InterfaceC1908760zlq;
import X.InterfaceC898240ZLq;
import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.friends.service.IFriendSaasService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0101000_28;

/* JADX INFO: loaded from: classes29.dex */
public class RelationButton extends C197039127h implements InterfaceC1908750zlp, InterfaceC1908740zlo {
    public final /* synthetic */ InterfaceC1908740zlo LLLIIIL;
    public final InterfaceC1908740zlo LLLIIL;
    public final InterfaceC1908750zlp LLLIILIL;

    public RelationButton(Context context) {
        this(context, (AttributeSet) null, 0, 14);
    }

    public RelationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
    }

    @Override // X.InterfaceC1908750zlp
    public final void LJJIJIIJIL() {
    }

    @Override // X.InterfaceC1908740zlo
    public Context getCtx() {
        return this.LLLIIIL.getCtx();
    }

    @Override // X.InterfaceC1908740zlo
    public Function1<C0SY7, Unit> getDataChangeListener() {
        return this.LLLIIIL.getDataChangeListener();
    }

    @Override // X.InterfaceC1908740zlo
    public Function1<InterfaceC1364105Vn<? super Boolean>, Object> getFollowClickInterceptor() {
        return this.LLLIIIL.getFollowClickInterceptor();
    }

    @Override // X.InterfaceC1908740zlo
    public Function2<C0SY7, C0SY7, Unit> getFollowClickListener() {
        return this.LLLIIIL.getFollowClickListener();
    }

    @Override // X.InterfaceC1908740zlo
    public Function2<C0SY7, Boolean, Unit> getRequestListener() {
        return this.LLLIIIL.getRequestListener();
    }

    @Override // X.InterfaceC1908740zlo
    public Function0<InterfaceC898240ZLq> getTracker() {
        return this.LLLIIIL.getTracker();
    }

    @Override // X.InterfaceC1908740zlo
    public void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
        this.LLLIIIL.setDataChangeListener(function1);
    }

    @Override // X.InterfaceC1908740zlo
    public void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
        this.LLLIIIL.setFollowClickInterceptor(function1);
    }

    @Override // X.InterfaceC1908740zlo
    public void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
        this.LLLIIIL.setFollowClickListener(function2);
    }

    @Override // X.InterfaceC1908740zlo
    public void setRequestListener(Function2<? super C0SY7, ? super Boolean, Unit> function2) {
        this.LLLIIIL.setRequestListener(function2);
    }

    @Override // X.InterfaceC1908740zlo
    public void setTracker(Function0<? extends InterfaceC898240ZLq> function0) {
        this.LLLIIIL.setTracker(function0);
    }

    @Override // X.InterfaceC1908750zlp
    public final void LIZ() {
        this.LLLIILIL.LIZ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLIILIL.LJJIJIIJIL();
    }

    public final InterfaceC1908740zlo getListener() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1908750zlp
    public final void LLLLZIL(C1908870zm1 c1908870zm1) {
        this.LLLIILIL.LLLLZIL(c1908870zm1);
    }

    @Override // X.C197039127h
    public void setButtonVariant(int i) {
        if (this.LLLIILIL != null) {
            LLILII(i, new AwS166S0101000_28(this, i, 1));
        } else {
            super.setButtonVariant(i);
        }
    }

    @Override // X.InterfaceC1908750zlp
    public final void LLILII(int i, AwS166S0101000_28 awS166S0101000_28) {
        this.LLLIILIL.LLILII(i, awS166S0101000_28);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RelationButton(Context context, AttributeSet attributeSet, int i, int i2) {
        InterfaceC1908760zlq interfaceC1908760zlqLIZ = null;
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? R.attr.xj : i;
        if ((i2 & 8) != 0) {
            IFriendSaasService.LIZ.getClass();
            IFriendSaasService value = C1908770zlr.LIZIZ.getValue();
            if (value != null) {
                interfaceC1908760zlqLIZ = value.LIZ();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this(context, attributeSet, i, interfaceC1908760zlqLIZ);
    }

    public RelationButton(Context context, AttributeSet attributeSet, int i, InterfaceC1908760zlq interfaceC1908760zlq) {
        super(context, attributeSet, i);
        this.LLLIIIL = interfaceC1908760zlq.LIZ(context);
        LJJJJLI(true);
        setMinTextSizePx(12);
        C427690Gpr.LJ(this, 0.0f);
        setEllipsize(null);
        this.LLLIIL = interfaceC1908760zlq.LIZ(context);
        this.LLLIILIL = interfaceC1908760zlq.LIZIZ(this);
    }
}
