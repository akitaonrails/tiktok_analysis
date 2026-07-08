package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C0OJ0;
import X.C0OSB;
import X.C0P4H;
import X.C1220000hqw;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C1618770sE7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C617210OIt;
import X.C617240OIw;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617170OIp;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSwitchCell extends PowerCell<C617210OIt> {
    public final C736950SvV LL;
    public C127K LLILLJJLI;
    public C127A LLILLL;
    public C617210OIt LLILZ;
    public C0OJ0 LLILZIL;

    public final void I5() {
        BulletinFunctionSetting bulletinFunctionSetting;
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            C617210OIt c617210OIt = this.LLILZ;
            c127a.LJIILJJIL(!((c617210OIt == null || (bulletinFunctionSetting = c617210OIt.LL) == null || bulletinFunctionSetting.status != 0) ? false : true));
        }
        C127A c127a2 = this.LLILLL;
        if (c127a2 != null) {
            c127a2.LJIIJJI(false);
        }
    }

    public BulletinSwitchCell() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 805);
        this.LL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(337), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8h, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LLILLJJLI = c127k;
        C127A c127a = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLL = c127a;
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        int type;
        String strLIZJ;
        BulletinFunctionSetting bulletinFunctionSetting;
        View viewFindViewById;
        int i;
        int i2;
        int i3;
        View viewFindViewById2;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        C617210OIt c617210OIt = (C617210OIt) interfaceC1891350zJl;
        this.LLILZ = c617210OIt;
        this.LLILZIL = c617210OIt.LLILZ;
        int i4 = 0;
        if (list.isEmpty()) {
            C127K c127k = this.LLILLJJLI;
            if (c127k != null && (viewFindViewById2 = c127k.findViewById(R.id.dlh)) != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
                C0OJ0 c0oj0 = this.LLILZIL;
                Float fValueOf4 = null;
                if (c0oj0 != null) {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj0.LIZ)));
                } else {
                    fValueOf = null;
                }
                c384050F3z.LJIIIIZZ = fValueOf;
                C0OJ0 c0oj02 = this.LLILZIL;
                if (c0oj02 != null) {
                    fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj02.LIZIZ)));
                } else {
                    fValueOf2 = null;
                }
                c384050F3z.LJIIIZ = fValueOf2;
                C0OJ0 c0oj03 = this.LLILZIL;
                if (c0oj03 != null) {
                    fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj03.LIZJ)));
                } else {
                    fValueOf3 = null;
                }
                c384050F3z.LJIIJ = fValueOf3;
                C0OJ0 c0oj04 = this.LLILZIL;
                if (c0oj04 != null) {
                    fValueOf4 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj04.LIZLLL)));
                }
                c384050F3z.LJIIJJI = fValueOf4;
                viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
            }
            C127K c127k2 = this.LLILLJJLI;
            if (c127k2 != null && (viewFindViewById = c127k2.findViewById(R.id.dlh)) != null) {
                C0OJ0 c0oj05 = this.LLILZIL;
                if (c0oj05 != null) {
                    i = c0oj05.LIZ;
                    i2 = c0oj05.LIZIZ;
                    i3 = c0oj05.LIZJ;
                    i4 = c0oj05.LIZLLL;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                }
                C0OSB.LIZLLL(viewFindViewById, i, i2, i3, i4);
            }
            C127K c127k3 = this.LLILLJJLI;
            if (c127k3 != null) {
                C617210OIt c617210OIt2 = this.LLILZ;
                if (c617210OIt2 != null && (bulletinFunctionSetting = c617210OIt2.LL) != null) {
                    type = bulletinFunctionSetting.functionType;
                } else {
                    type = EnumC617170OIp.UNKNOWN.getType();
                }
                if (type == EnumC617170OIp.SHOW_CHANNEL_IN_PROFILE.getType()) {
                    strLIZJ = C1618770sE7.LIZJ(2131828111);
                } else {
                    strLIZJ = "";
                }
                c127k3.setTitle(strLIZJ);
                I5();
                C127A c127a = this.LLILLL;
                if (c127a != null) {
                    c127a.LJIILLIIL(new C0P4H(this, c127k3, 3));
                    return;
                }
                return;
            }
            return;
        }
        if (!(ListProtector.get(list, 0) instanceof C617240OIw)) {
            return;
        }
        I5();
    }
}
