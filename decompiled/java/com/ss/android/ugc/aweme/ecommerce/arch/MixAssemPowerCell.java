package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C13LE;
import X.C2217401BqU;
import X.C452501pT;
import X.C678470QjN;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MixAssemPowerCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, T extends InterfaceC1891350zJl> extends AssemPowerCell<ASSEM, T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19((MixAssemPowerCell) this, 1071));

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(MixAssemPowerCell.class, "vm", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(MixAssemPowerCell.class, "vm", "<v#1>", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[PHI: r2
      0x0048: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean) binds: [B:25:0x0045, B:12:0x001b, B:14:0x002d, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewAttachedToWindow() {
        /*
            r4 = this;
            super.onViewAttachedToWindow()
            X.0zJl r1 = r4.getItem()
            boolean r0 = r1 instanceof X.AbstractC677840QiM
            if (r0 == 0) goto L43
            X.0QiM r1 = (X.AbstractC677840QiM) r1
            if (r1 == 0) goto L43
            com.ss.android.ugc.aweme.ecommerce.arch.MixStyle r1 = r1.LLILLJJLI
            r3 = 1
            if (r1 == 0) goto L44
            int r0 = r1.column
            if (r0 != r3) goto L44
            r2 = 1
        L19:
            boolean r0 = r1.isDynamicSpanSize
            if (r0 != r3) goto L48
            X.01GW r0 = r4.LLIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel) r0
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.0Qin> r0 = r0.LLJI
            java.lang.Object r0 = r0.getValue()
            X.0Qin r0 = (X.C678110Qin) r0
            if (r0 == 0) goto L48
            int r0 = r0.LIZ
            if (r0 != r3) goto L48
            r1 = 1
        L34:
            android.view.View r0 = r4.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.19tI r0 = (X.C21681819tI) r0
            if (r2 != 0) goto L41
            if (r1 != 0) goto L41
            r3 = 0
        L41:
            r0.LLILLJJLI = r3
        L43:
            return
        L44:
            r2 = 0
            if (r1 == 0) goto L48
            goto L19
        L48:
            r1 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell.onViewAttachedToWindow():void");
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(final T t) {
        super.onBindItemView(t);
        NextLiveData<C678470QjN> nextLiveData = ((MixPageViewModel) this.LLIZ.getValue()).LLIZ;
        getAdapterPosition();
        nextLiveData.setValue((C678470QjN) new Object(t) { // from class: X.0QjN
            public final InterfaceC1891350zJl LIZ;

            {
                this.LIZ = t;
            }
        });
    }
}
