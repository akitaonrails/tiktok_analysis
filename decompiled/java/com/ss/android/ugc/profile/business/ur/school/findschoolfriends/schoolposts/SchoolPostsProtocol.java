package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts;

import X.C289690BXb;
import X.EnumC1236520iHa;
import X.EnumC338610DPf;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolPostsProtocol extends FindSchoolFriendsTabProtocol {
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final int LJ() {
        return 2131845003;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final boolean LIZJ() {
        return C289690BXb.LIZ();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final EnumC1236520iHa LIZLLL() {
        return EnumC1236520iHa.POST;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final EnumC338610DPf LJFF() {
        return EnumC338610DPf.POST;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsTabProtocol
    public final PowerViewPagerFragmentItem<?> LIZ(int i) {
        return new SchoolPostsListTabFragmentData(i);
    }
}
