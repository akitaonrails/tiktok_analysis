package wh6;

import X.AbstractC879060Ye8;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0HZQ;
import X.C0I0B;
import X.C0WZX;
import X.C0Y8T;
import X.C0ZFW;
import X.C1218000hni;
import X.C1218270ho9;
import X.C1224280hxq;
import X.C1225440hzi;
import X.C1225450hzj;
import X.C1227130i2R;
import X.C1229100i5c;
import X.C1230940i8a;
import X.C1259990itR;
import X.C1261650iw7;
import X.C127K;
import X.C1461005nk;
import X.C1717506o1;
import X.C2204961BRm;
import X.C5183020f;
import X.C786410Ut5;
import X.C894390Z6v;
import X.EnumC1217990hnh;
import X.EnumC1219960hqs;
import X.EnumC1222430hur;
import X.EnumC1261560ivy;
import X.EnumC356410DyB;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.RemoveMemberAssem;
import com.ss.android.ugc.aweme.detailpage.audit.assem.AuditRequestBottomAssem;
import com.ss.android.ugc.aweme.detailpage.audit.view.AuditRequestCell;
import com.ss.android.ugc.aweme.detailpage.manageadmin.assem.ManageAdminListAssem;
import com.ss.android.ugc.aweme.detailpage.manageadmin.view.ManageAdminCell;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.ss.android.ugc.aweme.fangroup.view.FanGroupAssemCell;
import com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSearchBarAssem;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AbS509S0200000_19 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            FanGroupListViewModel fanGroupListViewModelUp = ((FanGroupAssemCell) abS509S0200000_19.l0).up();
            C1230940i8a c1230940i8a = (C1230940i8a) abS509S0200000_19.l1;
            fanGroupListViewModelUp.getClass();
            fanGroupListViewModelUp.setState(new AwS598S0100000_19(c1230940i8a, 515));
        }
    }

    public static final void LIZ$1(AbS509S0200000_19 abS509S0200000_19, View view) {
        C894390Z6v c894390Z6v;
        EnumC1222430hur enumC1222430hur;
        int i;
        if (view == null) {
            return;
        }
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_member_remove", new Pair[]{new Pair("enter_from", "group_management"), new Pair("enter_method", "group_management_cell")}, C0I0B.LJFF.LIZIZ());
        RemoveMemberAssem removeMemberAssem = (RemoveMemberAssem) abS509S0200000_19.l0;
        Context context = ((C127K) abS509S0200000_19.l1).getContext();
        removeMemberAssem.getClass();
        C1229100i5c c1229100i5c = C1229100i5c.LIZ;
        if (C1229100i5c.LJII(((C1717506o1) removeMemberAssem.LLIZLLLIL.getValue()).LL)) {
            AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(context, 38);
            if (C1229100i5c.LIZ(((C1717506o1) removeMemberAssem.LLIZLLLIL.getValue()).LL) == EnumC1219960hqs.SUBSCRIPTION) {
                i = 2131830180;
            } else {
                i = 2131830181;
            }
            c894390Z6v = new C894390Z6v(context.getString(i), context.getString(2131830182), context.getString(2131831126), context.getString(2131830190), awS597S0100000_18);
        } else {
            c894390Z6v = new C894390Z6v(context.getString(2131835228), context.getString(2131830182), context.getString(2131831126), context.getString(2131830190), new AwS585S0100000_6(context, 26));
        }
        String str = ((C1717506o1) removeMemberAssem.LLIZLLLIL.getValue()).LL;
        if (c1229100i5c.LJIIJJI(((C1717506o1) removeMemberAssem.LLIZLLLIL.getValue()).LL)) {
            enumC1222430hur = EnumC1222430hur.TOP;
        } else {
            enumC1222430hur = EnumC1222430hur.NONE;
        }
        C1225440hzi c1225440hzi = new C1225440hzi(context, str, enumC1222430hur, context.getString(2131831430), new C5183020f(context, 19), c894390Z6v);
        C1227130i2R.LIZ.getClass();
        C1227130i2R.LJ(context, c1225440hzi);
    }

    public static final void LIZ$10(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ((AuditRequestCell) abS509S0200000_19.l0).I5().EQ2(((AuditRequestCell) abS509S0200000_19.l0).itemView.getContext(), (C1218000hni) abS509S0200000_19.l1);
        }
    }

    public static final void LIZ$11(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ManageAdminViewModel manageAdminViewModelGo = ((ManageAdminListAssem) abS509S0200000_19.l0).Go();
            Context context = ((View) abS509S0200000_19.l1).getContext();
            List<C1218270ho9> list = manageAdminViewModelGo.getState().LL;
            ArrayList arrayList = new ArrayList();
            Iterator<C1218270ho9> it2 = list.iterator();
            while (it2.hasNext()) {
                String uid = it2.next().LL.getUid();
                if (uid != null) {
                    arrayList.add(uid);
                }
            }
            C0Y8T c0y8tLJ = ((AbstractC879060Ye8) manageAdminViewModelGo.LLILLJJLI.getValue()).LJ();
            int iLJFF = C0ZFW.LIZ.LJFF(c0y8tLJ) - C1461005nk.LIZ.LIZLLL(c0y8tLJ);
            if (iLJFF < 0) {
                iLJFF = 0;
            }
            C1225450hzj c1225450hzj = new C1225450hzj(context, manageAdminViewModelGo.vQ2().LL, iLJFF, arrayList);
            C1227130i2R.LIZ.getClass();
            C1227130i2R.LJ(context, c1225450hzj);
        }
    }

    public static final void LIZ$12(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((ManageAdminCell) abS509S0200000_19.l0).itemView.getContext(), "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", ((C1218270ho9) abS509S0200000_19.l1).LL.getUid());
            smartRouteBuildRoute.withParam("sec_user_id", ((C1218270ho9) abS509S0200000_19.l1).LL.getSecUid());
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$2(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ((AuditRequestBottomAssem) abS509S0200000_19.l0).hp().EQ2(((View) abS509S0200000_19.l1).getContext(), null);
        }
    }

    public static final void LIZ$3(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ((AuditRequestBottomAssem) abS509S0200000_19.l0).hp().vQ2(((View) abS509S0200000_19.l1).getContext(), EnumC1217990hnh.APPROVE);
        }
    }

    public static final void LIZ$4(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ((AbsRecUserCell) abS509S0200000_19.l0).i6(EnumC1261560ivy.CLICK_CELL, (C1261650iw7) abS509S0200000_19.l1);
            ((AbsRecUserCell) abS509S0200000_19.l0).h6((C1261650iw7) abS509S0200000_19.l1);
        }
    }

    public static final void LIZ$5(AbS509S0200000_19 abS509S0200000_19, View view) {
        Editable editableLLJILLL;
        if (view != null) {
            ((C1224280hxq) ((SelectorSearchBarAssem) abS509S0200000_19.l0).LLJI.getValue()).LJII().LJIIIZ(EnumC356410DyB.CLEAR);
            C786410Ut5.LLLLLLZZ((TuxIconView) abS509S0200000_19.l1, 8);
            EditText editTextXv = ((SelectorSearchBarAssem) abS509S0200000_19.l0).Xv();
            if (editTextXv != null && (editableLLJILLL = C2204961BRm.LLJILLL(editTextXv, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baShbtHN0zySrf45VYJsYKArxOuSyOQ5QFtVfbs0376qVTGj9zkePY6amPFdL/1FJV9Rc5bq7g==", null))) != null) {
                editableLLJILLL.clear();
            }
            TuxIconView tuxIconView = (TuxIconView) abS509S0200000_19.l1;
            tuxIconView.setContentDescription(tuxIconView.getContext().getString(2131823352));
            ((SelectorSearchBarAssem) abS509S0200000_19.l0).Lo();
        }
    }

    public static final void LIZ$6(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            C1259990itR c1259990itR = (C1259990itR) abS509S0200000_19.l0;
            if (c1259990itR.LLJI != null) {
                Integer num = c1259990itR.LLILZIL;
                if (num != null && num.intValue() == 1) {
                    C0HZQ c0hzq = ((C1259990itR) abS509S0200000_19.l0).LLJ;
                    if (c0hzq != null) {
                        c0hzq.setChecked(true ^ c0hzq.isChecked());
                        return;
                    }
                    return;
                }
                ShareVideoPanelViewModel shareVideoPanelViewModel = (ShareVideoPanelViewModel) ((C1259990itR) abS509S0200000_19.l0).LLJJI.getValue();
                if (shareVideoPanelViewModel == null) {
                    return;
                }
                C1259990itR c1259990itR2 = (C1259990itR) abS509S0200000_19.l0;
                shareVideoPanelViewModel.vQ2(c1259990itR2.LLJI, (View) abS509S0200000_19.l1, c1259990itR2.LLJIJIL, c1259990itR2.LLILLL, c1259990itR2.LL);
            }
        }
    }

    public static final void LIZ$7(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((AuditRequestCell) abS509S0200000_19.l0).itemView.getContext(), "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", ((C1218000hni) abS509S0200000_19.l1).LL.LIZIZ);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$8(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ((AuditRequestCell) abS509S0200000_19.l0).I5().DQ2(((C1218000hni) abS509S0200000_19.l1).LL.LIZLLL, !((CompoundButton) ((AuditRequestCell) abS509S0200000_19.l0).LL.getValue()).isChecked());
        }
    }

    public static final void LIZ$9(AbS509S0200000_19 abS509S0200000_19, View view) {
        if (view != null) {
            ((AuditRequestCell) abS509S0200000_19.l0).I5().wQ2(((AuditRequestCell) abS509S0200000_19.l0).itemView.getContext(), EnumC1217990hnh.APPROVE, (C1218000hni) abS509S0200000_19.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS509S0200000_19(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
