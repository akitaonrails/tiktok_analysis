package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals;

import X.C01GW;
import X.C03U5;
import X.C1054104Ah;
import X.C1069304Gd;
import X.C11XJ;
import X.C11XN;
import X.C11XO;
import X.C1388190mED;
import X.C13LE;
import X.C1751490vgB;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C19EG;
import X.C2260531Ddr;
import X.C418440Gaw;
import X.C452501pT;
import X.C736702uD;
import X.EnumC1779080wOg;
import X.InterfaceC1010403xG;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS279S0300000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class SeaPdpCouponsViewHolder extends AbsFullSpanVH<C736702uD> implements InterfaceC1010403xG {
    public static final SimpleDateFormat LLJJLIIIJLLLLLLLZ;
    public static final float LLJL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final long LLJJJJ;
    public final HashMap<String, Long> LLJJJJJIL;
    public final LinkedList<C1751490vgB> LLJJJJLIIL;
    public final C01GW LLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        LLJJLIIIJLLLLLLLZ = simpleDateFormat;
        LLJL = C418440Gaw.LIZIZ(4);
    }

    public final C1069304Gd d6() {
        return (C1069304Gd) this.LLJJL.getValue();
    }

    public final SeaPdpViewModel e6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpCouponsViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.avy, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 61));
        this.LLJJJJ = 1000L;
        this.LLJJJJJIL = new HashMap<>();
        this.LLJJJJLIIL = new LinkedList<>();
        this.LLJJL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(105));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1010403xG
    public final void LJLI(long j) {
        EnumC1779080wOg enumC1779080wOg;
        C736702uD c736702uD = (C736702uD) this.LLILLJJLI;
        if (c736702uD.LJ.size() == 1) {
            enumC1779080wOg = EnumC1779080wOg.SHOW_ONE_COUPONS;
        } else if (c736702uD.LJ.size() > 1) {
            enumC1779080wOg = EnumC1779080wOg.SHOW_DOUBLE_COUPONS;
        } else {
            enumC1779080wOg = EnumC1779080wOg.HIDE_ITEM;
        }
        int i = C11XO.LIZ[enumC1779080wOg.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (this.LLJJJ && q6(j, (Voucher) ListProtector.get(((C736702uD) this.LLILLJJLI).LJ, 0), (C11XJ) this.itemView.findViewById(R.id.mk7))) {
                this.LLJJJ = false;
            }
            if (this.LLJJJIL && q6(j, (Voucher) ListProtector.get(((C736702uD) this.LLILLJJLI).LJ, 1), (C11XJ) this.itemView.findViewById(R.id.tli))) {
                this.LLJJJIL = false;
            }
            if (!this.LLJJJ && !this.LLJJJIL) {
                e6().ES2(this);
                return;
            }
            return;
        }
        if (q6(j, (Voucher) ListProtector.get(((C736702uD) this.LLILLJJLI).LJ, 0), (C11XJ) this.itemView.findViewById(R.id.pm0))) {
            e6().ES2(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Voucher f6(C11XJ c11xj) {
        boolean z;
        List<Voucher> list = ((C736702uD) this.LLILLJJLI).LJ;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (Intrinsics.LJFF(c11xj, this.itemView.findViewById(R.id.pm0))) {
            return (Voucher) ListProtector.get(((C736702uD) this.LLILLJJLI).LJ, 0);
        }
        if (Intrinsics.LJFF(c11xj, this.itemView.findViewById(R.id.mk7))) {
            if (((C736702uD) this.LLILLJJLI).LJ.size() <= 1) {
                return null;
            }
            return (Voucher) ListProtector.get(((C736702uD) this.LLILLJJLI).LJ, 0);
        }
        if (!Intrinsics.LJFF(c11xj, this.itemView.findViewById(R.id.tli)) || ((C736702uD) this.LLILLJJLI).LJ.size() <= 1) {
            return null;
        }
        return (Voucher) ListProtector.get(((C736702uD) this.LLILLJJLI).LJ, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h6(Voucher voucher) {
        if (voucher != null) {
            C1054104Ah c1054104Ah = e6().LLJLIL;
            if (c1054104Ah != null) {
                int iIndexOf = ((C736702uD) this.LLILLJJLI).LJ.indexOf(voucher) + 1;
                e6();
                C1054104Ah.LJIILL(c1054104Ah, voucher, "coupons", iIndexOf);
            }
            if (this.itemView.getContext() instanceof C19EG) {
                e6().LLLLLJIL.LIZJ(this.itemView.getContext(), ((C736702uD) this.LLILLJJLI).LIZJ, C2260531Ddr.LIZ(voucher), "coupon");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0856  */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder.rr(java.lang.Object):void");
    }

    public final void c6(Voucher voucher, C11XN c11xn) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            C03U5.LIZ(new AwS279S0300000_35(this, voucher, c11xn, 0), c19egLIZIZ, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i6(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher r13, X.C11XJ r14, int r15) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder.i6(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher, X.11XJ, int):void");
    }

    public final boolean q6(long j, Voucher voucher, C11XJ c11xj) {
        Long usableEndTime = voucher.getUsableEndTime();
        if (usableEndTime != null) {
            long jLongValue = (usableEndTime.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j;
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            if (0 <= jLongValue && jLongValue < 86400001) {
                c11xj.setDiscountTime(LLJJLIIIJLLLLLLLZ.format(Long.valueOf(jLongValue)));
            }
            if (jLongValue == 0) {
                SeaPdpViewModel.vS2(e6(), false, true, null, false, false, 252);
                return true;
            }
        }
        return false;
    }
}
