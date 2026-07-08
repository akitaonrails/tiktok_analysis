package com.bytedance.pipo.stellar.base.adapter;

import X.AbstractC2211791BhR;
import X.C1361400lX0;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1721300utU;
import X.C2211751BhN;
import X.EnumC1720670usT;
import X.InterfaceC1720230url;
import X.InterfaceC1720550usH;
import X.InterfaceC1720700usW;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbility;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class StellarCardAdapter<T extends InterfaceC1720550usH> extends PowerCell<T> implements InterfaceC1720230url<T> {
    public long LL;
    public long LLILLJJLI;
    public Long LLILLL;
    public final int LLILZ = 1471851158;
    public final int LLILZIL = 2094665495;
    public Boolean LLILZLL;
    public Boolean LLIZ;

    public abstract void N5(View view, T t);

    public void P5() {
    }

    public EnumC1720670usT S5() {
        return null;
    }

    public void T5(View view, ViewGroup viewGroup) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public abstract int getLayoutId();

    public final InterfaceC1720700usW R5() {
        StellarCardHostAbility stellarCardHostAbility;
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment == null || (stellarCardHostAbility = (StellarCardHostAbility) C1558520qew.LIZ(C1558360qeg.LJFF(currentFragment, null), StellarCardHostAbility.class, null)) == null) {
            return null;
        }
        return stellarCardHostAbility.ju1(this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.C03K6
    public final Context getContext() {
        Context context = super.getContext();
        return context instanceof C1361400lX0 ? ((ContextWrapper) context).getBaseContext() : context;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0usV
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final float LJI = 0.1f;
            public final int LJII = 1;
            public final C1776070wJp LJIIIIZZ;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJII;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJIIIIZZ;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJI;
            }

            {
                this.LJ = new AwS570S0100000_26((StellarCardAdapter) this, 33);
                this.LJIIIIZZ = new C1776070wJp(this, 0);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public void I5(T t) {
        boolean z;
        Boolean bool;
        if (t.getTheme() == EnumC1720670usT.LIGHT) {
            z = true;
        } else {
            z = false;
        }
        C1721300utU c1721300utU = C1721300utU.LIZ;
        View viewFindViewById = this.itemView.findViewById(this.LLILZIL);
        BackgroundDO backgroundDOLJFF = t.LJFF();
        if (z) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        c1721300utU.getClass();
        C1721300utU.LIZ(viewFindViewById, backgroundDOLJFF, bool);
    }

    public void L5(T t) {
        View viewFindViewById = this.itemView.findViewById(this.LLILZIL);
        if (viewFindViewById != null) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            MarginDO marginDOLJIJJ = t.LJIJJ();
            MarginDO marginDOLJJI = t.LJJI();
            String width = t.getWidth();
            String height = t.getHeight();
            c1721300utU.getClass();
            C1721300utU.LIZLLL(viewFindViewById, marginDOLJIJJ, marginDOLJJI, width, height);
        }
        View viewFindViewById2 = this.itemView.findViewById(this.LLILZ);
        if (viewFindViewById2 != null) {
            C1721300utU c1721300utU2 = C1721300utU.LIZ;
            String width2 = t.getWidth();
            String height2 = t.getHeight();
            c1721300utU2.getClass();
            C1721300utU.LIZLLL(viewFindViewById2, null, null, width2, height2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U5(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r9) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter.onBindItemView(X.0zJl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateItemView(android.view.ViewGroup r10) {
        /*
            r9 = this;
            long r7 = java.lang.System.currentTimeMillis()
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r0 = r10.getContext()
            r3.<init>(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r0 = -2
            r1.<init>(r5, r0)
            X.C786410Ut5.a6(r3, r1)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r0 = r10.getContext()
            r2.<init>(r0)
            r4 = 0
            r2.setClipChildren(r4)
            r2.setClipToPadding(r4)
            int r0 = r9.LLILZIL
            r2.setId(r0)
            X.0utU r1 = X.C1721300utU.LIZ
            android.content.Context r0 = r10.getContext()
            r1.getClass()
            boolean r6 = X.C1721300utU.LJFF(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.LLIZ = r0
            r10.getContext()
            X.0usT r0 = r9.S5()
            if (r0 == 0) goto L67
            int[] r1 = X.C1720660usS.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r5) goto L67
            r0 = 1
            if (r1 == r0) goto L64
            r0 = 2
            if (r1 == r0) goto L9c
            r0 = 3
            if (r1 == r0) goto L66
            r0 = 4
            if (r1 == r0) goto L67
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L64:
            if (r6 != 0) goto L9c
        L66:
            r6 = 1
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.LLILZLL = r0
            X.0lX0 r5 = new X.0lX0
            android.content.Context r1 = r10.getContext()
            int r0 = X.C1385040m98.LIZJ(r6)
            r5.<init>(r1, r0)
            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r5)
            int r0 = r9.getLayoutId()
            android.view.View r1 = X.C786410Ut5.Td(r1, r0, r10, r4)
            r9.T5(r1, r10)
            r2.addView(r1)
            int r0 = r9.LLILZ
            r1.setId(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r7
            r9.LL = r0
            r3.addView(r2)
            return r3
        L9c:
            r6 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter.onCreateItemView(android.view.ViewGroup):android.view.View");
    }
}
