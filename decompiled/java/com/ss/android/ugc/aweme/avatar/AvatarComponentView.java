package com.ss.android.ugc.aweme.avatar;

import X.C01GW;
import X.C03IT;
import X.C1256520inq;
import X.C1608750rxx;
import X.C1609300ryq;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C814420VxA;
import X.EnumC1256840ioM;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.InterfaceC1256420ing;
import X.InterfaceC1605410rsZ;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607260rvY;
import X.InterfaceC1609290ryp;
import X.InterfaceC438160HGc;
import X.InterfaceC713050Ry3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarComponentView extends RelativeLayout implements InterfaceC1607260rvY {
    public final AttributeSet LL;
    public final int LLILLJJLI;
    public final InterfaceC1607260rvY LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public ViewGroup LLIZ;
    public final C1608750rxx LLIZLLLIL;
    public String LLJ;

    public AvatarComponentView(Context context) {
        this(context, null, 14);
    }

    public AvatarComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    @Override // X.InterfaceC1607260rvY
    public final void LIZ(int i, View.OnClickListener onClickListener) {
        this.LLILLL.LIZ(i, onClickListener);
    }

    @Override // X.InterfaceC1607260rvY
    public final View.OnClickListener LIZIZ(int i) {
        return this.LLILLL.LIZIZ(i);
    }

    @Override // X.InterfaceC1607260rvY
    public final boolean LIZJ() {
        return this.LLILLL.LIZJ();
    }

    @Override // X.InterfaceC1607260rvY
    public final void LIZLLL(int i) {
        this.LLILLL.LIZLLL(i);
    }

    @Override // X.InterfaceC1607260rvY
    public Function2<EnumC1608710rxt, InterfaceC1606880ruw, Unit> getOnNodeClickListener() {
        return this.LLILLL.getOnNodeClickListener();
    }

    public final void onEvent(InterfaceC1256420ing interfaceC1256420ing) {
    }

    @Override // X.InterfaceC1607260rvY
    public void setAvatarComponentView(AvatarComponentView avatarComponentView) {
        this.LLILLL.setAvatarComponentView(avatarComponentView);
    }

    @Override // X.InterfaceC1607260rvY
    public void setOnNodeClickListener(Function2<? super EnumC1608710rxt, ? super InterfaceC1606880ruw, Unit> function2) {
        this.LLILLL.setOnNodeClickListener(function2);
    }

    private final InterfaceC1609290ryp getAvatarDelegate() {
        return (InterfaceC1609290ryp) this.LLILZ.getValue();
    }

    public final C427660Gpo getAvatar() {
        return (C427660Gpo) this.LLILZIL.getValue();
    }

    public final View getRealAvatarView() {
        ViewGroup viewGroup = this.LLIZ;
        return (viewGroup == null || viewGroup.getVisibility() != 0) ? getAvatar() : this.LLIZ;
    }

    public final boolean LJII() {
        return getAvatarDelegate().LIZ();
    }

    public HashMap<EnumC1608710rxt, View> getAvatarDisplayView() {
        return getAvatarDelegate().LIZIZ();
    }

    public final InterfaceC1605410rsZ getAvatarEventAbility() {
        return getAvatarDelegate().LIZJ();
    }

    public final int getAvatarSizeDp() {
        return Math.max(getAvatarDelegate().LJIIIZ(), 0);
    }

    public final int getAvatarSizePx() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Math.max(getAvatarDelegate().LJIIIZ(), 0))));
    }

    public final int getContainerHeightPx() {
        return Math.max(getAvatarDelegate().LJIIL(), 0);
    }

    public final int getContainerWidthPx() {
        return Math.max(getAvatarDelegate().LJIIL(), 0);
    }

    public Map<EnumC1607270rvZ, InterfaceC1606880ruw> getCurrentActiveBusiness() {
        return getAvatarDelegate().LJ();
    }

    public final InterfaceC438160HGc getSocialAvatarAbility() {
        return getAvatarDelegate().LJIIJJI();
    }

    public final AttributeSet getAttrs() {
        return this.LL;
    }

    public final InterfaceC1607260rvY getClickListener() {
        return this.LLILLL;
    }

    public final C1608750rxx getConfig() {
        return this.LLIZLLLIL;
    }

    public final int getDefStyleAttr() {
        return this.LLILLJJLI;
    }

    public final ViewGroup getSocialAvatar() {
        return this.LLIZ;
    }

    public final String getUid() {
        return this.LLJ;
    }

    public final void LJFF(C1608750rxx c1608750rxx) {
        this.LLILLL.setAvatarComponentView(this);
        getAvatarDelegate().LJII(c1608750rxx);
    }

    public final void LJIIJ(C03IT c03it) {
        getAvatarDelegate().LJIJ(c03it);
    }

    public final void LJIIL(AwS598S0100000_19 awS598S0100000_19) {
        getAvatarDelegate().LJIILLIIL(awS598S0100000_19);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        getAvatarDelegate().LJFF(canvas, new AwS425S0200000_24(this, canvas, 6));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        getAvatarDelegate().setLayoutParams(layoutParams);
    }

    public final void setSocialAvatar(ViewGroup viewGroup) {
        this.LLIZ = viewGroup;
    }

    public final void setUid(String str) {
        this.LLJ = str;
    }

    public final void LJIIIZ(EnumC1607270rvZ enumC1607270rvZ, C1256520inq c1256520inq) {
        getAvatarDelegate().LJIIIIZZ(enumC1607270rvZ, c1256520inq);
    }

    public final void LJIIJJI(EnumC1607270rvZ enumC1607270rvZ, Function1<? super InterfaceC1606880ruw, Unit> function1) {
        getAvatarDelegate().LJI(enumC1607270rvZ, function1);
    }

    public final void LJIILIIL(Object obj, EnumC1607270rvZ enumC1607270rvZ) {
        getAvatarDelegate().LJIJI(obj, false, enumC1607270rvZ);
    }

    public final void LJIILJJIL(Integer num, Integer num2) {
        getAvatarDelegate().LJIIJ(num, num2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AvatarComponentView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xh;
        } else {
            i2 = 0;
        }
        InterfaceC1607260rvY interfaceC1607260rvYLIZIZ = (i & 8) != 0 ? C1609300ryq.LIZIZ.LIZIZ() : null;
        super(context, attributeSet, i2);
        this.LL = attributeSet;
        this.LLILLJJLI = i2;
        this.LLILLL = interfaceC1607260rvYLIZIZ;
        this.LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(476));
        this.LLILZIL = C452501pT.LIZIZ(new AwS425S0200000_24(context, this, 57));
        this.LLIZLLLIL = new C1608750rxx();
        try {
            getAvatarDelegate().LIZLLL(context, this);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAvatarView, i2, R.attr.xh);
            getAvatarDelegate().LJIILL(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAvatarView_tux_avatarSize, 64));
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarView__tux_avatarPlaceholderColor, R.attr.bv);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            gradientDrawable.setShape(1);
            getAvatar().setBackground(gradientDrawable);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJI(EnumC1607270rvZ enumC1607270rvZ, EnumC1256840ioM enumC1256840ioM, InterfaceC713050Ry3 interfaceC713050Ry3) {
        getAvatarDelegate().LJIILIIL(enumC1607270rvZ, enumC1256840ioM, interfaceC713050Ry3, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        getAvatarDelegate().onSizeChanged(i, i2, i3, i4);
    }

    public final void LJIIIIZZ(LifecycleOwner lifecycleOwner, Object obj, String str, Function1 function1, boolean z, boolean z2) {
        this.LLJ = str;
        getAvatarDelegate().LJIILJJIL(lifecycleOwner, obj, str, function1, z, z2);
    }
}
