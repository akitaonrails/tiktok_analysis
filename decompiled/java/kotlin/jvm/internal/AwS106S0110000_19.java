package kotlin.jvm.internal;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C09AY;
import X.C1215890hkJ;
import X.C1229580i6O;
import X.C1229630i6T;
import X.C1229760i6g;
import X.C1229840i6o;
import X.C1236480iHW;
import X.C1238760iLC;
import X.C1250500ie8;
import X.C1250700ieS;
import X.C1258010iqF;
import X.C1261940iwa;
import X.C1262050iwl;
import X.C1262080iwo;
import X.C1262090iwp;
import X.C1262590ixd;
import X.C1263590izF;
import X.C13LP;
import X.C1607070rvF;
import X.C19323610io;
import X.C291001Au;
import X.C418440Gaw;
import X.C814420VxA;
import X.C849850XVn;
import X.EnumC1164360gPC;
import X.EnumC1250760ieY;
import X.EnumC1261960iwc;
import X.EnumC1262370ixH;
import X.EnumC1262450ixP;
import X.EnumC1262560ixa;
import X.EnumC1606080rte;
import X.InterfaceC1073860e3E;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowingRelationState;
import com.ss.android.ugc.profile.business.ur.school.datasource.GroupSectionInfo;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS106S0110000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        C1229630i6T c1229630i6T = (C1229630i6T) obj;
        if (awS106S0110000_19.z1) {
            return C1229630i6T.LIZ(c1229630i6T, C1229580i6O.LIZ(c1229630i6T.LL, (List) awS106S0110000_19.l0, 6), null, false, null, false, false, null, 126);
        }
        C1229840i6o c1229840i6o = c1229630i6T.LLILLJJLI;
        List list = (List) awS106S0110000_19.l0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C1229760i6g) {
                arrayList.add(obj2);
            }
        }
        return C1229630i6T.LIZ(c1229630i6T, null, new C1229840i6o(arrayList, c1229840i6o.LIZIZ, c1229840i6o.LIZJ), false, null, false, false, null, 125);
    }

    public static final Object invoke$1(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        EnumC1262370ixH enumC1262370ixH;
        C1262590ixd c1262590ixd = (C1262590ixd) obj;
        MufListPageFragment mufListPageFragment = (MufListPageFragment) awS106S0110000_19.l0;
        int iIntValue = 0;
        if (Intrinsics.LJFF(mufListPageFragment.LLJJIJI.getValue(), "relation_tab") && mufListPageFragment.hS() == EnumC1262450ixP.TT_RELATION_PAGE) {
            enumC1262370ixH = EnumC1262370ixH.TT_PERSONAL_PAGE_FRIENDS_LIST;
        } else {
            enumC1262370ixH = (EnumC1262370ixH) ((MufListPageFragment) awS106S0110000_19.l0).LLJJIJIL.getValue();
        }
        c1262590ixd.LIZ = enumC1262370ixH;
        c1262590ixd.LJIILJJIL = Boolean.FALSE;
        if (awS106S0110000_19.z1) {
            EnumC1262370ixH enumC1262370ixH2 = EnumC1262370ixH.FFP_ENTRANCE_FRIEND_LIST;
            c1262590ixd.LIZ = enumC1262370ixH2;
            C1261940iwa.LIZ.getClass();
            EnumC1261960iwc enumC1261960iwcLIZLLL = C1261940iwa.LIZLLL(enumC1262370ixH2);
            if (C1261940iwa.LIZJ(enumC1261960iwcLIZLLL) && !C1261940iwa.LIZ(enumC1261960iwcLIZLLL)) {
                c1262590ixd.LIZJ = 0;
            } else {
                Integer num = (Integer) C1263590izF.LIZLLL.getValue();
                if (num != null) {
                    iIntValue = num.intValue();
                }
                c1262590ixd.LIZJ = iIntValue;
            }
            c1262590ixd.LJIILIIL = EnumC1262560ixa.UNKNOWN;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        return C19323610io.LJJIJL(((C1238760iLC) awS106S0110000_19.l0).LIZIZ(), null, null, awS106S0110000_19.z1, null, null, false, false, null, false, false, null, false, false, 16777199);
    }

    public static final Object invoke$2(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        C1262090iwp c1262090iwp = (C1262090iwp) obj;
        c1262090iwp.LIZ = 101;
        c1262090iwp.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c1262090iwp.LJJI = 202;
        boolean z = false;
        if (awS106S0110000_19.z1) {
            c1262090iwp.LJIIIZ = new C1262080iwo(0);
            c1262090iwp.LJIIIIZZ = new C1262050iwl(2131836020, R.attr.a1h, 43, 0, 0, 0, 0, 0, false, null, false, 8184);
        } else {
            z = false;
            c1262090iwp.LJIIIIZZ = new C1262050iwl(2131845822, 0, 0, 0, 0, 0, 0, 0, false, null, false, 8190);
        }
        c1262090iwp.LJJIII = C1607070rvF.LIZIZ.LJI().LJIIIIZZ(EnumC1606080rte.INBOX_SUGGESTED_ACCOUNT);
        Object value = ((MufListPageFragment) awS106S0110000_19.l0).LLJJIJIL.getValue();
        if (value == EnumC1262370ixH.FIND_FRIENDS || value == EnumC1262370ixH.VERSION_UPDATE || value == EnumC1262370ixH.SUGGESTED_TAB_PAGE || value == EnumC1262370ixH.FRIENDS_TAB_EMPTY) {
            z = true;
        }
        c1262090iwp.LJJJJJ = z;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) obj;
        Function0 function0 = (Function0) awS106S0110000_19.l0;
        if (function0 != null) {
            function0.invoke();
        }
        if (awS106S0110000_19.z1 && Intrinsics.LJFF(abstractDialogInterfaceC1397690mTX.LLIZ, "button_close")) {
            C849850XVn.LIZIZ.LIZJ().LJIJI("93", "popup_close", false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        C291001Au c291001Au;
        C1250700ieS c1250700ieS = (C1250700ieS) obj;
        EnumC1250760ieY enumC1250760ieY = EnumC1250760ieY.HIDE;
        if (awS106S0110000_19.z1) {
            c291001Au = new C291001Au((EnumC1164360gPC) awS106S0110000_19.l0);
        } else {
            c291001Au = null;
        }
        return C1250700ieS.LIZ(c1250700ieS, enumC1250760ieY, null, c291001Au, null, 10);
    }

    public static final Object invoke$5(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        String str;
        View view = (View) obj;
        AwemePagerVM awemePagerVMXp = ((AwemePagerAssem) awS106S0110000_19.l0).Xp();
        Context context = view.getContext();
        if (awS106S0110000_19.z1) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C1258010iqF c1258010iqF = new C1258010iqF(awemePagerVMXp, view, context, str, ((AwemePagerAssem) awS106S0110000_19.l0).Xp().LLILZ, ((AwemePagerAssem) awS106S0110000_19.l0).Xp().LLIZ);
        c1258010iqF.LIZ();
        ((AwemePagerAssem) awS106S0110000_19.l0).LLLFF = c1258010iqF.LLIZLLLIL;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        Integer numValueOf;
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        GroupSectionInfo groupSectionInfo = (GroupSectionInfo) awS106S0110000_19.l0;
        boolean z = awS106S0110000_19.z1;
        Integer num = groupSectionInfo.myCnt;
        Integer numValueOf2 = null;
        if (num != null) {
            numValueOf = Integer.valueOf(num.intValue() + 1);
        } else {
            numValueOf = null;
        }
        groupSectionInfo.setMyCnt(numValueOf);
        if (z) {
            if (groupSectionInfo.othersCnt != null) {
                numValueOf2 = Integer.valueOf(r0.intValue() - 1);
            }
        } else {
            numValueOf2 = groupSectionInfo.othersCnt;
        }
        groupSectionInfo.setOthersCnt(numValueOf2);
        return C1236480iHW.LIZ(c1236480iHW, null, null, null, null, groupSectionInfo, 15);
    }

    public static final Object invoke$7(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        FollowingRelationState followingRelationState = (FollowingRelationState) obj;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        if (!awS106S0110000_19.z1) {
            map.putAll(followingRelationState.getUnreadCountMap());
            arrayList.addAll(followingRelationState.getUnreadUidList());
        }
        List<User> list = ((FollowingItemList) awS106S0110000_19.l0).items;
        if (list != null) {
            for (User user : C13LP.LJJJJLI(list)) {
                if (user.getUnReadVideoInfo() != null && user.getUnReadVideoCount() > 0) {
                    map.put(user.getUid(), Integer.valueOf(user.getUnReadVideoCount()));
                    arrayList.add(user.getUid());
                }
            }
        }
        return followingRelationState.copy(followingRelationState.userId, followingRelationState.secUserId, followingRelationState.isSelf, followingRelationState.recommendList, followingRelationState.jediListState, followingRelationState.isHotsoonHasMore, followingRelationState.vcdCount, followingRelationState.hotsoonText, map, arrayList, followingRelationState.pageToken, followingRelationState.liveSortBy, followingRelationState.listState, followingRelationState.payload, followingRelationState.refresh, followingRelationState.removeUid, followingRelationState.followingListOwner);
    }

    public static final Object invoke$8(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        InterfaceC1073860e3E interfaceC1073860e3E;
        boolean z = ((C1250500ie8) obj).LLILZ;
        boolean z2 = awS106S0110000_19.z1;
        if (z != z2) {
            if (!z2 && (interfaceC1073860e3E = ((UserProfileUserCardVM) awS106S0110000_19.l0).LL) != null) {
                interfaceC1073860e3E.m6();
            }
            ((UserProfileUserCardVM) awS106S0110000_19.l0).setState(new AwS33S0010000_19(awS106S0110000_19.z1, 25));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS106S0110000_19 awS106S0110000_19, Object obj) {
        return C1215890hkJ.LIZ((C1215890hkJ) obj, (UserPronounsInfo) awS106S0110000_19.l0, awS106S0110000_19.z1, false, 4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS106S0110000_19(com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS106S0110000_19.<init>(com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(C1238760iLC c1238760iLC, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1238760iLC;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(FollowingItemList followingItemList, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = followingItemList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(UserPronounsInfo userPronounsInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = userPronounsInfo;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(GroupSectionInfo groupSectionInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = groupSectionInfo;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(AwemePagerAssem awemePagerAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = awemePagerAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0110000_19(Function0 function0, Function0<Unit> function02, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = function0;
        this.z1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(boolean z, EnumC1164360gPC enumC1164360gPC, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = enumC1164360gPC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0110000_19(boolean z, UserProfileUserCardVM userProfileUserCardVM, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = userProfileUserCardVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0110000_19(boolean z, boolean z2, List<? extends InterfaceC1891350zJl> list) {
        super(1);
        this.$t = list;
        this.z1 = z;
        this.l0 = z2;
    }
}
