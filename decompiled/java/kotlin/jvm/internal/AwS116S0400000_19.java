package kotlin.jvm.internal;

import X.AbstractC1168350gVd;
import X.AbstractC426530Gnz;
import X.C09AY;
import X.C0P0T;
import X.C0XO0;
import X.C0XPY;
import X.C1238240iKM;
import X.C1243410iSh;
import X.C1247000iYU;
import X.C1249080ibq;
import X.C1253000iiA;
import X.C1261250ivT;
import X.C1261270ivV;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1264320j0Q;
import X.C1266010j39;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1722300uv6;
import X.C1748440vbG;
import X.C19EG;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C426500Gnw;
import X.C450840Hm6;
import X.C451220Hmi;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC1217990hnh;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1261310ivZ;
import X.InterfaceC1263010iyJ;
import X.InterfaceC494301wD;
import Y.ACListenerS25S0500000_19;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserVideoCell;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.profile.business.ur.ProfileNavbarOtherNicknameProtocol;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoOtherNicknameProtocol;
import com.ss.android.ugc.profile.business.ur.platform.NickNameData;
import com.ss.android.ugc.profile.business.ur.relations.ProfileRelationVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public class AwS116S0400000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        int iIntValue;
        int iIntValue2;
        long jLongValue;
        Integer num = (Integer) awS116S0400000_19.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = ((C1249080ibq) awS116S0400000_19.l1).LL;
        }
        Integer num2 = (Integer) awS116S0400000_19.l2;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = ((C1249080ibq) awS116S0400000_19.l1).LLILLJJLI;
        }
        Long l = (Long) awS116S0400000_19.l3;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = ((C1249080ibq) awS116S0400000_19.l1).LLILLL;
        }
        obj.getClass();
        return new C1249080ibq(iIntValue, iIntValue2, jLongValue);
    }

    public static final Object invoke$1(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        ((ProfileRelationVM) awS116S0400000_19.l0).setState(new AwS116S0400000_19((Integer) awS116S0400000_19.l1, (C1249080ibq) obj, (Integer) awS116S0400000_19.l2, (Long) awS116S0400000_19.l3, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, android.widget.EditText] */
    public static final Object invoke$2(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        Context context = (Context) obj;
        C1238240iKM c1238240iKM = new C1238240iKM(context, null, 0);
        EditText editText = c1238240iKM.getEditText();
        InvitePageViewModel invitePageViewModel = (InvitePageViewModel) awS116S0400000_19.l3;
        editText.setHint(context.getString(2131839004));
        editText.addTextChangedListener(new C1266010j39(c1238240iKM, invitePageViewModel, 4));
        C0XPY.LIZ.getClass();
        if (u.LJIJI("US", C0XO0.LIZLLL(C0XPY.LIZ()).LLLIIIL.LJJ, true)) {
            c1238240iKM.setExcludedCountries((List) awS116S0400000_19.l0);
        }
        c1238240iKM.LIZIZ();
        c1238240iKM.setImeOptionForEditText(6);
        ((C259800zU) awS116S0400000_19.l1).element = null;
        ((C259800zU) awS116S0400000_19.l2).element = c1238240iKM.getEditText();
        return c1238240iKM;
    }

    public static final Object invoke$3(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        String str;
        boolean z;
        int iIntValue;
        Integer aliasPermission;
        Integer aliasPermission2;
        C451220Hmi c451220Hmi = (C451220Hmi) obj;
        C450840Hm6 c450840Hm6 = new C450840Hm6();
        User user = (User) awS116S0400000_19.l0;
        ProfileNavbarOtherNicknameProtocol profileNavbarOtherNicknameProtocol = (ProfileNavbarOtherNicknameProtocol) awS116S0400000_19.l1;
        C259800zU c259800zU = (C259800zU) awS116S0400000_19.l2;
        Context context = (Context) awS116S0400000_19.l3;
        c450840Hm6.LIZ = R.raw.icon_pen_fill;
        c450840Hm6.LIZIZ = R.attr.a0r;
        c450840Hm6.LIZJ = C1253000iiA.LIZIZ(C1247000iYU.LJ(user));
        if (C1247000iYU.LIZIZ(user) != null) {
            str = "edit_name";
        } else {
            str = "add_another_username";
        }
        int followStatus = user.getFollowStatus();
        if (C1247000iYU.LIZIZ(user) != null) {
            z = true;
        } else {
            z = false;
        }
        NickNameData nickNameData = (NickNameData) profileNavbarOtherNicknameProtocol.LLJILJIL;
        if (nickNameData != null && (aliasPermission2 = nickNameData.getAliasPermission()) != null) {
            iIntValue = aliasPermission2.intValue();
        } else {
            iIntValue = 0;
        }
        NickNameData nickNameData2 = (NickNameData) profileNavbarOtherNicknameProtocol.LLJILJIL;
        if (nickNameData2 != null) {
            aliasPermission = nickNameData2.getAliasPermission();
        } else {
            aliasPermission = null;
        }
        c450840Hm6.LJFF = new ACListenerS25S0500000_19(c259800zU, new C1243410iSh("others_homepage", "click_nickname_on_top", str, followStatus, z, iIntValue, C1247000iYU.LIZLLL(aliasPermission, Integer.valueOf(user.getFollowStatus())) ? 1 : 0), user, context, profileNavbarOtherNicknameProtocol, 1);
        c451220Hmi.LIZIZ(c450840Hm6);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        C1262090iwp c1262090iwp = (C1262090iwp) obj;
        c1262090iwp.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c1262090iwp.LIZLLL = 203;
        c1262090iwp.LIZ = 101;
        c1262090iwp.LJ = 502;
        AbstractC1168350gVd abstractC1168350gVd = (AbstractC1168350gVd) awS116S0400000_19.l0;
        final C19EG c19eg = (C19EG) awS116S0400000_19.l1;
        final Bundle bundle = (Bundle) awS116S0400000_19.l2;
        abstractC1168350gVd.getClass();
        String string = c19eg.getString(2131834921);
        String string2 = c19eg.getString(2131834920, string);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz() { // from class: X.0TMD
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//friends/invite");
                smartRouteBuildRoute.withParam("enter_from", bundle.getString("enter_from", ""));
                smartRouteBuildRoute.open();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setLinearText(false);
            }
        }, iLJJJ, length, 33);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 33);
        String string3 = c19eg.getString(2131834922);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = string3;
        c1722300uv6.LJIIIIZZ = spannableStringBuilder;
        c1262090iwp.LJIILJJIL = c1722300uv6;
        Integer numValueOf = Integer.valueOf(((Bundle) awS116S0400000_19.l3).getInt("loading_style_key", -1));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        c1262090iwp.LIZIZ = numValueOf;
        c1262090iwp.LJJIII = true;
        c1262090iwp.LJJIIJZLJL = true;
        c1262090iwp.LJJIJIL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        String str;
        boolean z;
        int iIntValue;
        Integer aliasPermission;
        Integer aliasPermission2;
        C451220Hmi c451220Hmi = (C451220Hmi) obj;
        C450840Hm6 c450840Hm6 = new C450840Hm6();
        User user = (User) awS116S0400000_19.l0;
        ProfileInfoOtherNicknameProtocol profileInfoOtherNicknameProtocol = (ProfileInfoOtherNicknameProtocol) awS116S0400000_19.l1;
        C259800zU c259800zU = (C259800zU) awS116S0400000_19.l2;
        Context context = (Context) awS116S0400000_19.l3;
        c450840Hm6.LIZ = R.raw.icon_pen_fill;
        c450840Hm6.LIZIZ = R.attr.a0r;
        c450840Hm6.LIZJ = C1253000iiA.LIZIZ(C1247000iYU.LJ(user));
        if (C1247000iYU.LIZIZ(user) != null) {
            str = "edit_name";
        } else {
            str = "add_another_username";
        }
        int followStatus = user.getFollowStatus();
        if (C1247000iYU.LIZIZ(user) != null) {
            z = true;
        } else {
            z = false;
        }
        NickNameData nickNameData = (NickNameData) profileInfoOtherNicknameProtocol.LLJILJIL;
        if (nickNameData != null && (aliasPermission2 = nickNameData.getAliasPermission()) != null) {
            iIntValue = aliasPermission2.intValue();
        } else {
            iIntValue = 0;
        }
        NickNameData nickNameData2 = (NickNameData) profileInfoOtherNicknameProtocol.LLJILJIL;
        if (nickNameData2 != null) {
            aliasPermission = nickNameData2.getAliasPermission();
        } else {
            aliasPermission = null;
        }
        c450840Hm6.LJFF = new ACListenerS25S0500000_19(c259800zU, new C1243410iSh("others_homepage", "click_nickname_on_top", str, followStatus, z, iIntValue, C1247000iYU.LIZLLL(aliasPermission, Integer.valueOf(user.getFollowStatus())) ? 1 : 0), user, context, profileInfoOtherNicknameProtocol, 2);
        c451220Hmi.LIZIZ(c450840Hm6);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        String str;
        Function0<C1261270ivV> function0;
        C1261270ivV c1261270ivVInvoke;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Aweme aweme = (Aweme) obj;
        RectRecUserVideoCell rectRecUserVideoCell = (RectRecUserVideoCell) awS116S0400000_19.l0;
        InterfaceC494301wD interfaceC494301wD = null;
        try {
            if (!Intrinsics.LJFF(rectRecUserVideoCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = rectRecUserVideoCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner) != null) || (fragmentLIZ = C946803n0.LIZ(rectRecUserVideoCell.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = rectRecUserVideoCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = rectRecUserVideoCell.I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL = null;
                            }
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(rectRecUserVideoCell.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(rectRecUserVideoCell.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                            interfaceC494301wD = interfaceC494301wDLIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wD;
        if (recUserCellTrackAbility == null || (function0 = recUserCellTrackAbility.LL) == null || (c1261270ivVInvoke = function0.invoke()) == null || (str = c1261270ivVInvoke.LIZ) == null) {
            str = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C426500Gnw) awS116S0400000_19.l1).getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("video_from", "[UserCard]_DETAIL");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        smartRouteBuildRoute.withParam("userid", ((C1261860iwS) awS116S0400000_19.l2).getUid());
        smartRouteBuildRoute.withParam("sec_userid", ((C1261860iwS) awS116S0400000_19.l2).getSecUid());
        smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
        smartRouteBuildRoute.withParam("refer", "others_homepage");
        smartRouteBuildRoute.withParam("previous_page", str);
        smartRouteBuildRoute.withParam("matched_friend_strcut", ((C1261860iwS) awS116S0400000_19.l2).getMatchedFriendStruct());
        smartRouteBuildRoute.withParam("is_card", true);
        smartRouteBuildRoute.withParam("follow_recommned_enter_from", str);
        smartRouteBuildRoute.withParam("scene_type", EnumC1260920iuw.CARD.getType());
        smartRouteBuildRoute.open();
        if (recUserCellTrackAbility != null) {
            recUserCellTrackAbility.LIZLLL(recUserCellTrackAbility.LIZ(), (C1261650iw7) awS116S0400000_19.l3, recUserCellTrackAbility.LIZIZ(), EnumC1260930iux.CLICK_COVER);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[LOOP:2: B:20:0x0070->B:22:0x0076, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS116S0400000_19 r8, java.lang.Object r9) {
        /*
            X.0hno r9 = (X.C1218060hno) r9
            X.0Ojc<X.0hni> r0 = r9.LL
            java.util.List<ITEM> r0 = r0.LLILZ
            if (r0 == 0) goto L9c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            kotlin.jvm.internal.AwS598S0100000_19 r2 = new kotlin.jvm.internal.AwS598S0100000_19
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse r1 = (com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse) r1
            r0 = 827(0x33b, float:1.159E-42)
            r2.<init>(r1, r0)
            r0 = 1
            X.C19719612Di.LJJIIJ(r4, r2, r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse r0 = (com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse) r0
            java.util.List<java.lang.Long> r0 = r0.successApplyIds
            int r9 = r0.size()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Iterator r1 = r4.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.next()
            X.0hni r0 = (X.C1218000hni) r0
            boolean r0 = r0.LLILLL
            if (r0 != 0) goto L30
            r5 = 0
        L41:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r4.iterator()
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0hni r0 = (X.C1218000hni) r0
            boolean r0 = r0.LLILLL
            if (r0 == 0) goto L4a
            r3.add(r1)
            goto L4a
        L5f:
            r5 = 1
            goto L41
        L61:
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r6.<init>(r0)
            java.util.Iterator r2 = r3.iterator()
        L70:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r2.next()
            X.0hni r0 = (X.C1218000hni) r0
            X.0ho0 r0 = r0.LL
            long r0 = r0.LIZLLL
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            goto L70
        L88:
            java.lang.Object r3 = r8.l1
            com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel r3 = (com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel) r3
            X.0hng r2 = new X.0hng
            java.lang.Object r7 = r8.l2
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r8.l3
            X.0hnh r8 = (X.EnumC1217990hnh) r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r3.setState(r2)
        L9c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS116S0400000_19.invoke$7(kotlin.jvm.internal.AwS116S0400000_19, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        String str;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) awS116S0400000_19.l0;
        if (iUserCardListAbility != null) {
            C1261860iwS c1261860iwS = (C1261860iwS) awS116S0400000_19.l2;
            C1261270ivV c1261270ivV = (C1261270ivV) awS116S0400000_19.l1;
            C1261250ivT.LIZ.getClass();
            if (c1261270ivV != null) {
                str = c1261270ivV.LIZ;
            } else {
                str = null;
            }
            iUserCardListAbility.eZ(c1261860iwS, str);
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS116S0400000_19.l1;
        if (c1261270ivV2 != null) {
            Integer num = (Integer) awS116S0400000_19.l3;
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261310ivZ enumC1261310ivZ = EnumC1261310ivZ.BLOCK;
            c1261250ivT.getClass();
            C1261250ivT.LIZIZ(enumC1261310ivZ, c1261270ivV2, num);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS116S0400000_19 awS116S0400000_19, Object obj) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS116S0400000_19.l0;
        if (lifecycleOwner != null) {
            C1261860iwS c1261860iwS = (C1261860iwS) awS116S0400000_19.l2;
            C1261250ivT.LIZ.getClass();
            C1261250ivT.LIZLLL(c1261860iwS, lifecycleOwner);
        }
        C1261270ivV c1261270ivV = (C1261270ivV) awS116S0400000_19.l1;
        if (c1261270ivV != null) {
            Integer num = (Integer) awS116S0400000_19.l3;
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261310ivZ enumC1261310ivZ = EnumC1261310ivZ.REPORT;
            c1261250ivT.getClass();
            C1261250ivT.LIZIZ(enumC1261310ivZ, c1261270ivV, num);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(AbstractC1168350gVd abstractC1168350gVd, C19EG c19eg, Bundle bundle, Bundle bundle2, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC1168350gVd;
        this.l1 = c19eg;
        this.l2 = bundle;
        this.l3 = bundle2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(LifecycleOwner lifecycleOwner, C1261270ivV c1261270ivV, C1261860iwS c1261860iwS, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = c1261270ivV;
        this.l2 = c1261860iwS;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(AuditBatchAckResponse auditBatchAckResponse, AuditRequestListViewModel auditRequestListViewModel, Context context, EnumC1217990hnh enumC1217990hnh, int i) {
        super(1);
        this.$t = i;
        this.l0 = auditBatchAckResponse;
        this.l1 = auditRequestListViewModel;
        this.l2 = context;
        this.l3 = enumC1217990hnh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS116S0400000_19(User user, User user2, ProfileNavbarOtherNicknameProtocol profileNavbarOtherNicknameProtocol, C259800zU<C0P0T> c259800zU, Context context) {
        super(1);
        this.$t = context;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = profileNavbarOtherNicknameProtocol;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS116S0400000_19(User user, User user2, ProfileInfoOtherNicknameProtocol profileInfoOtherNicknameProtocol, C259800zU<C0P0T> c259800zU, Context context) {
        super(1);
        this.$t = context;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = profileInfoOtherNicknameProtocol;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(IUserCardListAbility iUserCardListAbility, C1261270ivV c1261270ivV, C1261860iwS c1261860iwS, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l0 = iUserCardListAbility;
        this.l1 = c1261270ivV;
        this.l2 = c1261860iwS;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(RectRecUserVideoCell rectRecUserVideoCell, C426500Gnw c426500Gnw, C1261860iwS c1261860iwS, C1261650iw7 c1261650iw7, int i) {
        super(1);
        this.$t = i;
        this.l0 = rectRecUserVideoCell;
        this.l1 = c426500Gnw;
        this.l2 = c1261860iwS;
        this.l3 = c1261650iw7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(ProfileRelationVM profileRelationVM, Integer num, Integer num2, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileRelationVM;
        this.l1 = num;
        this.l2 = num2;
        this.l3 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0400000_19(Integer num, C1249080ibq c1249080ibq, Integer num2, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = num;
        this.l1 = c1249080ibq;
        this.l2 = num2;
        this.l3 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS116S0400000_19(List list, List<String> list2, C259800zU<C1748440vbG> c259800zU, C259800zU<EditText> c259800zU2, InvitePageViewModel invitePageViewModel) {
        super(1);
        this.$t = invitePageViewModel;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c259800zU;
        this.l3 = c259800zU2;
    }
}
