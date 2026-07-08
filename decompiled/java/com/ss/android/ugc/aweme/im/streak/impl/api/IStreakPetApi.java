package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C066Z;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakAcceptShareInfoResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetInfoUpdateResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakShareInfoResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreaksInfoResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreaksPetInvitationAcceptResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreaksPetUpdateResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface IStreakPetApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/pet/share/accept")
    Object acceptStreakShareInvite(@InterfaceC1501100pAK("invite_id") String str, @InterfaceC1501100pAK("uniq_id") String str2, InterfaceC1364105Vn<? super StreakAcceptShareInfoResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/pet/invitation/accept")
    Object acceptStreaksPetInvitation(@InterfaceC1501100pAK("peer_user_id") String str, @InterfaceC1501100pAK("conversation_id") String str2, @InterfaceC1501100pAK("conversation_type") int i, InterfaceC1364105Vn<? super StreaksPetInvitationAcceptResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/pet/delete")
    Object deleteStreaksPet(@InterfaceC1501100pAK("peer_user_id") String str, @InterfaceC1501100pAK("conversation_id") String str2, @InterfaceC1501100pAK("conversation_type") int i, InterfaceC1364105Vn<? super C066Z> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/im/streaks/info")
    Object getStreaksInfo(@InterfaceC1501120pAM("peer_user_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, @InterfaceC1501120pAM("conversation_id") String str3, @InterfaceC1501120pAM("conversation_type") int i, @InterfaceC1501120pAM("server_data_version") String str4, @InterfaceC1501120pAM("push_data_version") String str5, InterfaceC1364105Vn<? super StreaksInfoResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/im/streaks/pet/share/info")
    Object getStreaksShare(InterfaceC1364105Vn<? super StreakShareInfoResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/pet/info/update")
    Object updateStreakPetInfo(@InterfaceC1501100pAK("scene_id") int i, @InterfaceC1501100pAK("scene_request_body") String str, @InterfaceC1501100pAK("conversation_id") String str2, @InterfaceC1501100pAK("conversation_type") int i2, InterfaceC1364105Vn<? super StreakPetInfoUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/pet/update")
    Object updateStreaksPet(@InterfaceC1501100pAK("peer_user_id") String str, @InterfaceC1501100pAK("pet_name") String str2, @InterfaceC1501100pAK("conversation_id") String str3, @InterfaceC1501100pAK("conversation_type") int i, InterfaceC1364105Vn<? super StreaksPetUpdateResponse> interfaceC1364105Vn);
}
