package com.ss.android.ugc.aweme.poi.detail.container.navbar.popup;

import X.AbstractC1186480gys;
import X.C1178990gmn;
import X.C1180060goW;
import X.C1183700guO;
import X.C1186840gzS;
import X.C339190DRl;
import X.C425810Gmp;
import X.C786410Ut5;
import X.InterfaceC1180270gor;
import X.InterfaceC1181010gq3;
import Y.ARunnableS118S0100000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiScrollingBubble;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderPopTextAssem extends UISlotAssem implements IPoiHeaderPopTextAbility, InterfaceC1180270gor {
    public LinearLayout LLJJI;
    public LinearLayout LLJJIII;
    public C425810Gmp LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C425810Gmp LLJJIJIL;
    public TuxTextView LLJJJ;
    public FrameLayout LLJJJIL;
    public List<PoiScrollingBubble> LLJJJJ;
    public boolean LLJJJJJIL;
    public List<PoiScrollingBubble> LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJL;
    public Animator LLJLIL;
    public Animator LLJLILLLLZIIL;
    public int LLJLLL;
    public final BPEAHandler LLJJLIIIJLLLLLLLZ = new BPEAHandler(Looper.getMainLooper());
    public float LLJLL = 1.0f;
    public final Set<Integer> LLJLLIL = new LinkedHashSet();
    public final ARunnableS118S0100000_18 LLJZ = new ARunnableS118S0100000_18(this, 35);

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e1j;
    }

    public final void kp() {
        this.LLJL = false;
        this.LLJJLIIIJLLLLLLLZ.removeCallbacks(this.LLJZ);
    }

    public final void hp() {
        List<PoiScrollingBubble> list = this.LLJJJJ;
        if (list == null || list.isEmpty() || this.LLJL) {
            return;
        }
        this.LLJJL = -1;
        this.LLJL = true;
        this.LLJJJJLIIL = null;
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C1180060goW.LJIILL(frameLayout, new AwS384S0200000_18(this, (PoiHeaderPopTextAssem) list, (List<PoiScrollingBubble>) 94));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1186840gzS c1186840gzSLw1;
        super.onDestroy();
        kp();
        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
        if (interfaceC1181010gq3LIZIZ == null || (c1186840gzSLw1 = interfaceC1181010gq3LIZIZ.lw1()) == null) {
            return;
        }
        c1186840gzSLw1.LIZJ("SlashScrollPositionEvent", this);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.IPoiHeaderPopTextAbility
    public final void AI(float f) {
        C786410Ut5.T4(LJJIJL(), f);
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        Animator animator;
        if (!(abstractC1186480gys instanceof C1183700guO) || !this.LLJJJJJIL) {
            return;
        }
        if (this.LLJLL < 1.0f || (((animator = this.LLJLILLLLZIIL) != null && animator.isStarted()) || ((C1183700guO) abstractC1186480gys).LL < 1)) {
            if (((C1183700guO) abstractC1186480gys).LL == 0 && this.LLJLL <= 0.0f) {
                Animator animator2 = this.LLJLIL;
                if (animator2 != null && animator2.isStarted()) {
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ip(valueAnimatorOfFloat, false);
                this.LLJLIL = valueAnimatorOfFloat;
                return;
            }
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ip(valueAnimatorOfFloat2, true);
        this.LLJLILLLLZIIL = valueAnimatorOfFloat2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.PoiHeaderPopTextAssem for r7v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.PoiHeaderPopTextAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.IPoiHeaderPopTextAbility
    public final void Ai2(List<PoiScrollingBubble> list, Boolean bool) {
        boolean zBooleanValue;
        this.LLJJJJ = list;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJJJJIL = zBooleanValue;
        if (list != null && !list.isEmpty()) {
            C339190DRl.LIZLLL(LJJIJL());
            hp();
        } else {
            C339190DRl.LIZIZ(LJJIJL());
        }
    }

    public final void ip(ValueAnimator valueAnimator, boolean z) {
        Animator animator;
        Animator animator2;
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS267S0100000_18(this, 4));
        if (z) {
            Animator animator3 = this.LLJLILLLLZIIL;
            if (animator3 != null && animator3.isStarted() && (animator2 = this.LLJLILLLLZIIL) != null) {
                animator2.cancel();
            }
        } else {
            Animator animator4 = this.LLJLIL;
            if (animator4 != null && animator4.isStarted() && (animator = this.LLJLIL) != null) {
                animator.cancel();
            }
        }
        valueAnimator.start();
    }
}
