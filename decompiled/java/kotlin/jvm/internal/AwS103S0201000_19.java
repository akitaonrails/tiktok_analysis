package kotlin.jvm.internal;

import X.AbstractC1261460ivo;
import X.AbstractC1623806Xk;
import X.AbstractC848400XPy;
import X.AbstractDialogInterfaceC1397690mTX;
import X.C05I8;
import X.C09AY;
import X.C0SY7;
import X.C0XGR;
import X.C0XQ7;
import X.C0XWJ;
import X.C1225010hz1;
import X.C1232140iAW;
import X.C1239960iN8;
import X.C1250500ie8;
import X.C1253040iiE;
import X.C1255650imR;
import X.C1261360ive;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1397620mTQ;
import X.C1397650mTT;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C23250099c;
import X.C491001vg;
import X.C491101vh;
import X.C849680XUw;
import X.C894390Z6v;
import X.EnumC1255610imN;
import X.InterfaceC1261750iwH;
import android.app.Activity;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.RelationUserCellAssem;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS103S0201000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        ((InterfaceC1261750iwH) obj).Kk0(new C1261360ive((List) awS103S0201000_19.l0, (C1261860iwS) awS103S0201000_19.l1, awS103S0201000_19.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        UserState userState = (UserState) obj;
        RelationUserCellAssem relationUserCellAssem = (RelationUserCellAssem) awS103S0201000_19.l0;
        C1253040iiE c1253040iiE = (C1253040iiE) awS103S0201000_19.l1;
        int i = awS103S0201000_19.i2;
        relationUserCellAssem.getClass();
        if (c1253040iiE != null) {
            User userM307clone = userState.getUser().m307clone();
            userM307clone.setLivePushNotificationStatus(i);
            if (userM307clone.getFollowStatus() == 0) {
                userM307clone.setLivePushNotificationStatus(2);
            }
            ((IUserService) ServiceManager.get().getService(IUserService.class)).LJ().put(userM307clone.getUid(), userM307clone);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) obj;
        C0XWJ c0xwj = C0XWJ.LIZ;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) awS103S0201000_19.l0;
        C1239960iN8 c1239960iN8 = (C1239960iN8) awS103S0201000_19.l1;
        String str = c1239960iN8.LLILLL;
        String str2 = c1239960iN8.LLILZ;
        boolean zLJFF = Intrinsics.LJFF(abstractDialogInterfaceC1397690mTX.LLIZ, 0);
        c0xwj.getClass();
        C0XGR c0xgr = new C0XGR();
        if (str == null) {
            str = "";
        }
        c0xgr.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("account_type", C849680XUw.LIZ(baseLoginMethod));
        c0xgr.LIZLLL("platform", C849680XUw.LJFF(baseLoginMethod));
        c0xgr.LIZ(zLJFF ? 1 : 0, "is_success");
        C20684815ws.LJIILLIIL("oneclick_remove_account_respond", c0xgr.LIZ);
        if (!Intrinsics.LJFF(abstractDialogInterfaceC1397690mTX.LLIZ, 0)) {
            ((C1239960iN8) awS103S0201000_19.l1).notifyItemChanged(awS103S0201000_19.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        HashMap map = (HashMap) awS103S0201000_19.l0;
        c1232140iAW.getClass();
        C1232140iAW.LJIIJ("click_upload_entrance", "click_edit_profile", map);
        ((C1255650imR) awS103S0201000_19.l1).LIZIZ(awS103S0201000_19.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        ((C1255650imR) awS103S0201000_19.l0).LJFF.LJ(EnumC1255610imN.UPLOAD_PHOTO, (HashMap) awS103S0201000_19.l1);
        ((C1255650imR) awS103S0201000_19.l0).LIZIZ(awS103S0201000_19.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        ((C1255650imR) awS103S0201000_19.l0).LIZ(awS103S0201000_19.i2, (Activity) awS103S0201000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        InterfaceC1261750iwH interfaceC1261750iwH = (InterfaceC1261750iwH) obj;
        if (((C0SY7) awS103S0201000_19.l0) == C0SY7.UNFOLLOW) {
            final C1261860iwS c1261860iwS = ((C1261650iw7) awS103S0201000_19.l1).LLILZIL;
            final int i = awS103S0201000_19.i2;
            interfaceC1261750iwH.Kk0(new AbstractC1261460ivo<C1261860iwS>(i, c1261860iwS) { // from class: X.0ivp
            });
        } else {
            final C1261860iwS c1261860iwS2 = ((C1261650iw7) awS103S0201000_19.l1).LLILZIL;
            final int i2 = awS103S0201000_19.i2;
            interfaceC1261750iwH.Kk0(new AbstractC1261460ivo<C1261860iwS>(i2, c1261860iwS2) { // from class: X.0ivm
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        int iIntValue;
        UserProfileUserCardVM userProfileUserCardVM = (UserProfileUserCardVM) awS103S0201000_19.l0;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) awS103S0201000_19.l1;
        int i = awS103S0201000_19.i2;
        User user = ((C1250500ie8) obj).LLIZLLLIL;
        userProfileUserCardVM.getClass();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            userProfileUserCardVM.setState(new AwS127S0101000_19(userProfileUserCardVM, i, 20));
        } else if (!(abstractC1623806Xk instanceof C491101vh)) {
            Integer num = (Integer) abstractC1623806Xk.LIZ();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (abstractC1623806Xk instanceof C1623606Xi) {
                userProfileUserCardVM.setState(new AwS30S0102000_19(iIntValue, i, userProfileUserCardVM, 1));
            } else if (abstractC1623806Xk instanceof C491001vg) {
                userProfileUserCardVM.setState(new AwS127S0101000_19(userProfileUserCardVM, i, 20));
            } else if (abstractC1623806Xk instanceof C1623706Xj) {
                userProfileUserCardVM.setState(new AwS33S0001000_19(i, 12));
            }
        } else if (user != null && !userProfileUserCardVM.LLILLL) {
            userProfileUserCardVM.LLILLL = true;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(userProfileUserCardVM), null, null, new C05I8(userProfileUserCardVM, user, i, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        ((C1225010hz1) awS103S0201000_19.l0).LJJJJJ((List) awS103S0201000_19.l1, C2097908Jt.LIZJ(new Pair("a:remove_type", "normal")));
        ((C1225010hz1) awS103S0201000_19.l0).LLILZ.LIZ(Integer.valueOf(awS103S0201000_19.i2), "remove");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        ((C1225010hz1) awS103S0201000_19.l0).LJJJJJ((List) awS103S0201000_19.l1, C2097908Jt.LIZJ(new Pair("a:remove_type", "permanent_ban")));
        ((C1225010hz1) awS103S0201000_19.l0).LLILZ.LIZ(Integer.valueOf(awS103S0201000_19.i2), "remove_and_prevent_rejoin");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS103S0201000_19 awS103S0201000_19, Object obj) {
        String str;
        String str2;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C894390Z6v c894390Z6v = (C894390Z6v) ((C1225010hz1) awS103S0201000_19.l0).LLILZLL.getValue();
        String str3 = null;
        if (c894390Z6v != null) {
            str3 = c894390Z6v.LIZJ;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c1397620mTQ.LIZJ(0, str3, new AwS103S0201000_19((C1225010hz1) awS103S0201000_19.l0, (C1225010hz1) awS103S0201000_19.l1, (List<String>) awS103S0201000_19.i2, 7));
        C894390Z6v c894390Z6v2 = (C894390Z6v) ((C1225010hz1) awS103S0201000_19.l0).LLILZLL.getValue();
        if (c894390Z6v2 == null || (str = c894390Z6v2.LIZLLL) == null) {
            str = "";
        }
        c1397620mTQ.LIZJ(2, str, new AwS103S0201000_19((C1225010hz1) awS103S0201000_19.l0, (C1225010hz1) awS103S0201000_19.l1, (List<String>) awS103S0201000_19.i2, 8));
        C894390Z6v c894390Z6v3 = (C894390Z6v) ((C1225010hz1) awS103S0201000_19.l0).LLILZLL.getValue();
        if (c894390Z6v3 != null && (str2 = c894390Z6v3.LJ) != null) {
            str4 = str2;
        }
        c1397620mTQ.LIZJ(1, str4, new AwS127S0101000_19((C1225010hz1) awS103S0201000_19.l0, awS103S0201000_19.i2, 22));
        ((C1397650mTT) ListProtector.get(c1397620mTQ.LJ, 1)).LIZ(AFwS257S0000000_19.get$arr$(749));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0201000_19(C1255650imR c1255650imR, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1255650imR;
        this.i2 = 0;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0201000_19(C1255650imR c1255650imR, HashMap map, int i) {
        super(1);
        this.$t = i;
        this.l0 = map;
        this.l1 = c1255650imR;
        this.i2 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0201000_19(int i, C0SY7 c0sy7, C1261650iw7 c1261650iw7, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0sy7;
        this.l1 = c1261650iw7;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0201000_19(int i, C1255650imR c1255650imR, HashMap map, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1255650imR;
        this.l1 = map;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0201000_19(C1225010hz1 c1225010hz1, C1225010hz1 c1225010hz12, List<String> list, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1225010hz1;
        this.l1 = c1225010hz12;
        this.i2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0201000_19(BaseLoginMethod baseLoginMethod, C1239960iN8 c1239960iN8, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baseLoginMethod;
        this.l1 = c1239960iN8;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0201000_19(UserProfileUserCardVM userProfileUserCardVM, UserProfileUserCardVM userProfileUserCardVM2, AbstractC1623806Xk<Integer> abstractC1623806Xk, int i) {
        super(1);
        this.$t = i;
        this.l0 = userProfileUserCardVM;
        this.l1 = userProfileUserCardVM2;
        this.i2 = abstractC1623806Xk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0201000_19(RelationUserCellAssem relationUserCellAssem, C1253040iiE c1253040iiE, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = relationUserCellAssem;
        this.l1 = c1253040iiE;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0201000_19(List list, List<C1261860iwS> list2, C1261860iwS c1261860iwS, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = c1261860iwS;
    }
}
