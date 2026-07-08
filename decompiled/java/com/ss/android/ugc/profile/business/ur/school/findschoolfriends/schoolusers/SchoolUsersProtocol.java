package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.EnumC1236520iHa;
import X.EnumC338610DPf;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolUsersProtocol extends FindSchoolFriendsTabProtocol {
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final int LJ() {
        return 2131828313;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final boolean LIZJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final EnumC1236520iHa LIZLLL() {
        return EnumC1236520iHa.USER;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final EnumC338610DPf LJFF() {
        return EnumC338610DPf.USER;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final PowerViewPagerFragmentItem<?> LIZ(int i) {
        return new SchoolUsersListTabFragmentData(i);
    }
}
