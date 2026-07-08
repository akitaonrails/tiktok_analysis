package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C0OJ0;
import X.C0OJ6;
import X.C0OJ8;
import X.C0OJ9;
import X.C0OSB;
import X.C0P4H;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1954807lC;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C604750Nnl;
import X.C786410Ut5;
import X.EnumC604980No8;
import X.EnumC617170OIp;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinChildSwitchCell extends PowerCell<C0OJ6> {
    public C127K LL;
    public C127A LLILLJJLI;
    public C0OJ6 LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        String strI5;
        super.onViewAttachedToWindow();
        C0OJ6 c0oj6 = this.LLILLL;
        if (c0oj6 == null || (str = c0oj6.LLIZ) == null || (strI5 = I5(c0oj6)) == null) {
            return;
        }
        C604750Nnl c604750Nnl = C604750Nnl.LIZ;
        boolean z = c0oj6.LLILZ == C0OJ9.ON;
        c604750Nnl.getClass();
        C604750Nnl.LIZJ(null, str, strI5, "bulletin_board_detail_page", z);
    }

    public static String I5(C0OJ6 c0oj6) {
        Integer num = c0oj6.LLILLL;
        int type = EnumC617170OIp.AUTO_SHARE_LIVE_ROOM_TO_BULLETIN_BOARD.getType();
        if (num != null && num.intValue() == type) {
            return "live_card";
        }
        int type2 = EnumC617170OIp.AUTO_SHARE_LIVE_EVENT_TO_BULLETIN_BOARD.getType();
        if (num != null && num.intValue() == type2) {
            return "live_event";
        }
        int type3 = EnumC617170OIp.AUTO_SHARE_POSTS_TO_BULLETIN_BOARD.getType();
        if (num != null && num.intValue() == type3) {
            return "post";
        }
        int type4 = EnumC604980No8.BULLETIN_SETTING_TYPE_CHANNEL_ALLOW_DOWNLOAD_VIDEO.getType();
        if (num != null && num.intValue() == type4) {
            return "allow_download";
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C127A c127a;
        int i;
        View viewFindViewById;
        int i2;
        int i3;
        int i4;
        int i5;
        View viewFindViewById2;
        int i6;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        C127K c127k;
        C0OJ6 c0oj6 = (C0OJ6) interfaceC1891350zJl;
        super.onBindItemView(c0oj6);
        this.LLILLL = c0oj6;
        C127K c127k2 = this.LL;
        if (c127k2 != null) {
            c127k2.setTitle(c0oj6.LL);
        }
        C127K c127k3 = this.LL;
        if (c127k3 != null) {
            c127k3.setSubtitle(c0oj6.LLILLJJLI);
        }
        C127K c127k4 = this.LL;
        if (c127k4 != null) {
            c127k4.setCellEnabled(c0oj6.LLJILJIL);
        }
        C127K c127k5 = this.LL;
        int i7 = 0;
        if (c127k5 != null && (viewFindViewById2 = c127k5.findViewById(R.id.dlh)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            C0OJ6 item = getItem();
            if (item != null && item.LLJIJIL && (c127k = this.LL) != null && c127k.getCellEnabled()) {
                i6 = R.attr.a0b;
            } else {
                i6 = R.attr.zo;
            }
            c384050F3z.LIZIZ = Integer.valueOf(i6);
            C0OJ0 c0oj0 = c0oj6.LLJI;
            Float fValueOf4 = null;
            if (c0oj0 != null) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj0.LIZ)));
            } else {
                fValueOf = null;
            }
            c384050F3z.LJIIIIZZ = fValueOf;
            C0OJ0 c0oj02 = c0oj6.LLJI;
            if (c0oj02 != null) {
                fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj02.LIZIZ)));
            } else {
                fValueOf2 = null;
            }
            c384050F3z.LJIIIZ = fValueOf2;
            C0OJ0 c0oj03 = c0oj6.LLJI;
            if (c0oj03 != null) {
                fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj03.LIZJ)));
            } else {
                fValueOf3 = null;
            }
            c384050F3z.LJIIJ = fValueOf3;
            C0OJ0 c0oj04 = c0oj6.LLJI;
            if (c0oj04 != null) {
                fValueOf4 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj04.LIZLLL)));
            }
            c384050F3z.LJIIJJI = fValueOf4;
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
        }
        C127K c127k6 = this.LL;
        if (c127k6 != null && (viewFindViewById = c127k6.findViewById(R.id.dlh)) != null) {
            C0OJ0 c0oj05 = c0oj6.LLJI;
            if (c0oj05 != null) {
                i2 = c0oj05.LIZ;
                i3 = c0oj05.LIZIZ;
                i4 = c0oj05.LIZJ;
                i5 = c0oj05.LIZLLL;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            C0OSB.LIZLLL(viewFindViewById, i2, i3, i4, i5);
        }
        C127A c127a2 = this.LLILLJJLI;
        if (c127a2 != null) {
            c127a2.LJIIJJI(false);
        }
        int i8 = C0OJ8.LIZ[c0oj6.LLILZ.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                C127A c127a3 = this.LLILLJJLI;
                if (c127a3 != null) {
                    c127a3.LJIILJJIL(false);
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            C127A c127a4 = this.LLILLJJLI;
            if (c127a4 != null) {
                c127a4.LJIILJJIL(true);
            }
        }
        C127K c127k7 = this.LL;
        if ((c127k7 == null || !c127k7.getCellEnabled()) && (c127a = this.LLILLJJLI) != null) {
            c127a.LJIILJJIL(false);
        }
        C127A c127a5 = this.LLILLJJLI;
        if (c127a5 != null) {
            c127a5.LJIILLIIL(new C0P4H(this, c0oj6, 0));
        }
        C127A c127a6 = this.LLILLJJLI;
        if (c127a6 != null) {
            c127a6.LJI(new AwS410S0200000_9(c0oj6, this, 3));
        }
        View view = this.itemView;
        C0OJ0 c0oj06 = c0oj6.LLJI;
        if (c0oj06 != null) {
            i = c0oj06.LJ;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        C0OJ0 c0oj07 = c0oj6.LLJI;
        if (c0oj07 != null) {
            i7 = c0oj07.LJFF;
        }
        C426750GoL.LJIIIZ(view, null, numValueOf, null, Integer.valueOf(i7), false, 21);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8i, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LL = c127k;
        C127A c127a = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLJJLI = c127a;
        return viewTd;
    }
}
