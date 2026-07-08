package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C0X2A;
import X.C10EU;
import X.C14EU;
import X.C1AF0;
import X.C20684815ws;
import X.C484220Iyq;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralTTOCollaborationtProtocol extends BioStructuralBABaseProtocol<BizBaseData> implements GenericLifecycleObserver {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_tto_collaboration";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        if (this.LLJI) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String uid;
        String nickname;
        String uid2;
        String str;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        try {
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            String nickname2 = null;
            if (profileCommonInfoLJIILIIL != null && (userProfileInfo2 = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null) {
                uid = userProfileInfo2.getUid();
            } else {
                uid = null;
            }
            ProfileCommonInfo profileCommonInfoLJIILIIL2 = LJIILIIL();
            if (profileCommonInfoLJIILIIL2 != null && (userProfileInfo = profileCommonInfoLJIILIIL2.getUserProfileInfo()) != null) {
                nickname = userProfileInfo.getNickname();
            } else {
                nickname = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            String str2 = C0X2A.LIZJ;
            User userLIZ = C10EU.LIZ();
            if (userLIZ != null) {
                uid2 = userLIZ.getUid();
            } else {
                uid2 = null;
            }
            User userLIZ2 = C10EU.LIZ();
            if (userLIZ2 != null) {
                nickname2 = userLIZ2.getNickname();
            }
            if (Intrinsics.LJFF(uid, uid2)) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clicker_tt_uid", uid);
            jSONObject.put("clicker_handle_name", nickname);
            jSONObject.put("click_time", jCurrentTimeMillis);
            jSONObject.put("clicker_region", str2);
            jSONObject.put("creator_tt_uid", uid2);
            jSONObject.put("creator_handle_name", nickname2);
            jSONObject.put("profile_page_type", str);
            C20684815ws.LJIJ("profile_tto_entrance_click", jSONObject);
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("profileTTO send event error");
            return false;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFEPageEditSuccess(C484220Iyq c484220Iyq) {
        String strOptString;
        IProfilePlatformVM iProfilePlatformVM;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("eventName");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF("tto_profile_entrance_change", strOptString) && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
            iProfilePlatformVM.CQ2("tto refreshData");
        }
    }
}
