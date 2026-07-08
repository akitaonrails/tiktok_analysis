package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01GW;
import X.C1189060h32;
import X.C11VU;
import X.C1206904nr;
import X.C1207004ns;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C1843500y4a;
import X.C20642515q3;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1184330gvP;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailFavoriteBottomAssem extends PoiCollectStatusBaseAssem implements IPoiDetailFavoriteBottomVAbility, InterfaceC1554640qYg {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 918));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 920));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 921));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 919));
    public long LLJLIL;
    public boolean LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dzf;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -997701040) {
            return null;
        }
        return this;
    }

    public final TuxTextView Qp() {
        return (TuxTextView) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility
    public final void LJLIIL() {
        zp().setEnabled(true);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility
    public final void LLILZIL() {
        zp().setEnabled(false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.NM(z, "", null, "click_banner", null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp(boolean r10) {
        /*
            r9 = this;
            boolean r2 = X.C1206904nr.LIZ()
            android.content.Context r0 = r9.getContext()
            java.lang.String r8 = ""
            if (r0 == 0) goto L1d
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L1d
            if (r2 == 0) goto La3
            r0 = 2131844689(0x7f115e51, float:1.9322778E38)
        L17:
            java.lang.String r7 = r1.getString(r0)
            if (r7 != 0) goto L1e
        L1d:
            r7 = r8
        L1e:
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L36
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L36
            if (r2 == 0) goto L9f
            r0 = 2131844688(0x7f115e50, float:1.9322776E38)
        L2f:
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L36
            r8 = r0
        L36:
            android.view.View r3 = r9.zp()
            boolean r0 = r3 instanceof X.C197039127h
            r4 = 0
            if (r0 == 0) goto L9d
            X.127h r3 = (X.C197039127h) r3
        L41:
            r2 = 0
            r5 = 1
            if (r10 == 0) goto L7a
            boolean r0 = r9.LLJLILLLLZIIL
            if (r0 != 0) goto L74
            long r0 = r9.LLJLIL
            long r0 = r0 + r5
            r9.Tp(r0)
        L50:
            if (r3 == 0) goto L73
            r0 = 1
            r3.setButtonVariant(r0)
            r0 = 2130772740(0x7f010304, float:1.7148607E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LJJJLZIJ(r0, r4)
            r3.setText(r7)
        L63:
            r3.LJJJJLI(r2)
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            X.0IDd r1 = new X.0IDd
            r0 = 7
            r1.<init>(r3, r0)
            X.C786410Ut5.x3(r2, r1)
        L73:
            return
        L74:
            long r0 = r9.LLJLIL
            r9.Tp(r0)
            goto L50
        L7a:
            boolean r0 = r9.LLJLILLLLZIIL
            if (r0 == 0) goto L97
            long r0 = r9.LLJLIL
            long r0 = r0 - r5
            r9.Tp(r0)
        L84:
            if (r3 == 0) goto L73
            r3.setButtonVariant(r2)
            r0 = 2130772735(0x7f0102ff, float:1.7148597E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LJJJLZIJ(r0, r4)
            r3.setText(r8)
            goto L63
        L97:
            long r0 = r9.LLJLIL
            r9.Tp(r0)
            goto L84
        L9d:
            r3 = r4
            goto L41
        L9f:
            r0 = 2131844690(0x7f115e52, float:1.932278E38)
            goto L2f
        La3:
            r0 = 2131844691(0x7f115e53, float:1.9322782E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.collectassem.PoiDetailFavoriteBottomAssem.Jp(boolean):void");
    }

    public final void Tp(long j) {
        String strJ4;
        if (j <= 0) {
            C339190DRl.LIZIZ(Qp());
        } else if (Qp().getVisibility() != 0) {
            C339190DRl.LIZLLL(Qp());
        }
        TuxTextView tuxTextViewQp = Qp();
        if (C1206904nr.LIZ()) {
            long j2 = 2147483647L;
            if (j <= 2147483647L) {
                j2 = j;
            }
            strJ4 = C20642515q3.LJ(2131755620, (int) j2, C1843500y4a.LIZIZ(j));
        } else {
            strJ4 = C786410Ut5.j4(u.LJJIFFI(C20642515q3.LJI(2131844692), "%d", "%s", false), Arrays.copyOf(new Object[]{C1843500y4a.LIZIZ(j)}, 1));
        }
        tuxTextViewQp.setText(strJ4);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long jLongValue;
        super.onViewCreated(view);
        if (C1207004ns.LIZ()) {
            zp().setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1207004ns.LIZIZ.LJIIIIZZ))));
            Qp().setSingleLine(false);
            Qp().setMaxLines(2);
        } else {
            zp().setMinimumWidth((int) (C11VU.LJ(getContext()) * 0.4f));
        }
        PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
        if (poiDetailResponseIp != null) {
            Long realFavoriteCnt = poiDetailResponseIp.getRealFavoriteCnt();
            long jLongValue2 = 0;
            if (realFavoriteCnt != null) {
                jLongValue = realFavoriteCnt.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLJLIL = jLongValue;
            this.LLJLILLLLZIIL = C1189060h32.LJIIZILJ(poiDetailResponseIp.isCollected());
            Long realFavoriteCnt2 = poiDetailResponseIp.getRealFavoriteCnt();
            if (realFavoriteCnt2 != null) {
                jLongValue2 = realFavoriteCnt2.longValue();
            }
            Tp(jLongValue2);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final void op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        Long realFavoriteCnt = poiDetailResponse.getRealFavoriteCnt();
        if (realFavoriteCnt != null) {
            Tp(realFavoriteCnt.longValue());
        }
    }
}
