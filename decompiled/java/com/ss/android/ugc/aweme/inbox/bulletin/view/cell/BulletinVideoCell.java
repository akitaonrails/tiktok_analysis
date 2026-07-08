package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0OOO;
import X.C0OPX;
import X.C0OS8;
import X.C0OV6;
import X.C0OVA;
import X.C1383370m6R;
import X.C13LP;
import X.C214824195i;
import X.C21568919b5;
import X.C2188811AlT;
import X.C296740Bk8;
import X.C418440Gaw;
import X.C619660OSe;
import X.C623650Od9;
import X.C623660OdA;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC1891350zJl;
import X.InterfaceC619800OSs;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinVideoCell extends BulletinBaseCell<C0OOO> {
    public InterfaceC619800OSs LLJLLL;

    public final InterfaceC619800OSs a7() {
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d0c);
        if (C296740Bk8.LIZ()) {
            C0OS8.LIZ.getClass();
            Integer num = C0OS8.LJII().enableVideoBindOpt;
            if (num != null && num.intValue() == 1) {
                return new C623650Od9(viewStub);
            }
        }
        return new C623660OdA(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        super.C6();
        if (this.LLJLLL == null) {
            this.LLJLLL = a7();
            w6();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void v6() {
        super.v6();
        if (this.LLJLLL == null) {
            this.LLJLLL = a7();
            w6();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /* JADX INFO: renamed from: K6 */
    public final void onBindItemView(BulletinBaseItem bulletinBaseItem) {
        C0OOO c0ooo = (C0OOO) bulletinBaseItem;
        super.onBindItemView(c0ooo);
        InterfaceC619800OSs interfaceC619800OSs = this.LLJLLL;
        if (interfaceC619800OSs != null) {
            interfaceC619800OSs.LJIIJJI(c0ooo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final boolean U6(View view) {
        C0OOO c0ooo;
        Aweme aweme;
        String string;
        Long l;
        Long l2;
        Long lValueOf;
        if (!super.U6(view) && (c0ooo = (C0OOO) getItem()) != null && (aweme = c0ooo.LLJI) != null) {
            HashMap map = new HashMap();
            if (((C0OOO) getItem()) != null) {
                map.put("bulletin_item_view_count", C214824195i.LIZIZ.LJIIZILJ(r0.LLILZLL));
            }
            C844470XAv.LIZ.getClass();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
            smartRouteBuildRoute.withParam("enter_from", "bulletin_board_page");
            smartRouteBuildRoute.withParam("feed_param_extra", map);
            smartRouteBuildRoute.withParam("show_view_count", To());
            User user = null;
            if (!To()) {
                BulletinCommonAbility bulletinCommonAbilityA6 = a6();
                if (bulletinCommonAbilityA6 != null) {
                    lValueOf = Long.valueOf(bulletinCommonAbilityA6.Og2());
                } else {
                    lValueOf = null;
                }
                smartRouteBuildRoute.withParam("channel_id", String.valueOf(lValueOf));
            }
            smartRouteBuildRoute.open();
            BulletinListViewModel bulletinListViewModelF6 = f6();
            C0OOO c0ooo2 = (C0OOO) getItem();
            if (c0ooo2 != null && (l2 = c0ooo2.LLJIJIL) != null) {
                string = l2.toString();
            } else {
                string = null;
            }
            BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) getItem();
            C0OOO c0ooo3 = (C0OOO) getItem();
            if (c0ooo3 != null) {
                user = c0ooo3.LLJJIJIIJIL;
            }
            BulletinListViewModel.OQ2(bulletinListViewModelF6, string, "post", bulletinBaseItem, user, null, null, null, null, 240);
            C0OOO c0ooo4 = (C0OOO) getItem();
            if (c0ooo4 != null && (l = c0ooo4.LLJIJIL) != null) {
                f6().WQ2(null, l.longValue(), 8, null, null);
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OOO c0ooo = (C0OOO) interfaceC1891350zJl;
        super.onBindItemView(c0ooo);
        InterfaceC619800OSs interfaceC619800OSs = this.LLJLLL;
        if (interfaceC619800OSs != null) {
            interfaceC619800OSs.LJIIJJI(c0ooo);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void N5(C0OVA c0ova, BulletinBaseItem bulletinBaseItem) {
        C21568919b5 c21568919b5R6 = r6();
        if (c21568919b5R6 != null) {
            C0OV6 c0ov6 = c0ova.LIZ;
            if (c0ov6 != null) {
                c21568919b5R6.setRoundingParams(c0ov6);
            }
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(c21568919b5R6);
            if (To()) {
                if (marginLayoutParamsLJI != null) {
                    marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            } else if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            C786410Ut5.j7(c21568919b5R6, marginLayoutParamsLJI);
        }
        InterfaceC619800OSs interfaceC619800OSs = this.LLJLLL;
        if (interfaceC619800OSs != null) {
            interfaceC619800OSs.LIZ(c0ova.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: b7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OOO c0ooo, List<? extends Object> list) {
        InterfaceC619800OSs interfaceC619800OSs;
        super.onBindItemView(c0ooo, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("payloads bind diff:");
        sbLIZ.append(objLJJJLZIJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (((C619660OSe) objLJJJLZIJ).LIZ && (interfaceC619800OSs = this.LLJLLL) != null) {
            interfaceC619800OSs.LJII(c0ooo);
        }
    }
}
