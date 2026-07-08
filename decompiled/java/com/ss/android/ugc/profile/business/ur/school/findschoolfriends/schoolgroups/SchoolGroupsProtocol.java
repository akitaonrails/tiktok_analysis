package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups;

import X.C0XQ7;
import X.C338000DMw;
import X.EnumC1236520iHa;
import X.EnumC338610DPf;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolGroupsProtocol extends FindSchoolFriendsTabProtocol {
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final int LJ() {
        return 2131828312;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final boolean LIZJ() {
        UserCampusService userCampusService;
        C338000DMw c338000DMwLJFF;
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null || curUserId.length() <= 0 || (userCampusService = (UserCampusService) PluggableExtentionKt.pluggableSpi$default(UserCampusService.class, false, false, false, 14, null)) == null || (c338000DMwLJFF = userCampusService.LJFF(curUserId)) == null) {
            return false;
        }
        return Intrinsics.LJFF(c338000DMwLJFF.LIZJ, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final EnumC1236520iHa LIZLLL() {
        return EnumC1236520iHa.GROUP;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final EnumC338610DPf LJFF() {
        return EnumC338610DPf.GROUP;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final PowerViewPagerFragmentItem<?> LIZ(int i) {
        return new SchoolGroupsListTabFragmentData(i);
    }
}
