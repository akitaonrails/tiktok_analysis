package com.ss.android.ugc.tiktok.pns.privacy.setting.dm;

import X.C104L;
import X.C106T;
import X.C106V;
import X.C107X;
import X.C1388190mED;
import X.C1913430ztN;
import X.C19EG;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.dm.vm.GuideInboxSettingsVM;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxNotificationRouter implements IRouteAction {
    public static final C107X Companion = new Object() { // from class: X.107X
    };

    private final void openInboxNotification(C19EG c19eg, Bundle bundle) {
        String string;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        int i;
        int i2;
        String str;
        if (bundle == null || (string = bundle.getString("page_tag")) == null) {
            string = "direct_message_permission_inbox";
        }
        if (Intrinsics.LJFF(string, "dm_guide_modify_inbox_permission_popup")) {
            GuideInboxSettingsVM guideInboxSettingsVM = (GuideInboxSettingsVM) new ViewModelProvider(c19eg).get(GuideInboxSettingsVM.class);
            mutableLiveData2 = guideInboxSettingsVM.LL;
            mutableLiveData3 = guideInboxSettingsVM.LLILLJJLI;
            mutableLiveData = guideInboxSettingsVM.LLILLL;
            i = 2131828198;
            i2 = 2131828197;
            str = "message_request_banner";
        } else {
            C106T.LIZ.getClass();
            PrivacyUserSettingDataViewModel privacyUserSettingDataViewModelLIZIZ = C106T.LIZIZ(c19eg, "dm_setting_friends", "dm_setting_friends");
            mutableLiveData = null;
            if (privacyUserSettingDataViewModelLIZIZ != null) {
                mutableLiveData2 = privacyUserSettingDataViewModelLIZIZ.LLILLL;
            } else {
                mutableLiveData2 = null;
            }
            PrivacyUserSettingDataViewModel privacyUserSettingDataViewModelLIZIZ2 = C106T.LIZIZ(c19eg, "dm_setting_potential_connection", "dm_setting_potential_connection");
            if (privacyUserSettingDataViewModelLIZIZ2 != null) {
                mutableLiveData3 = privacyUserSettingDataViewModelLIZIZ2.LLILLL;
            } else {
                mutableLiveData3 = null;
            }
            PrivacyUserSettingDataViewModel privacyUserSettingDataViewModelLIZIZ3 = C106T.LIZIZ(c19eg, "dm_setting_others", "dm_setting_others");
            if (privacyUserSettingDataViewModelLIZIZ3 != null) {
                mutableLiveData = privacyUserSettingDataViewModelLIZIZ3.LLILLL;
            }
            i = 2131830783;
            i2 = 2131830781;
            str = "inbox_popup";
        }
        C104L.LIZ(c19eg, string, new C1913430ztN(c19eg, bundle, i, i2, str, mutableLiveData2, mutableLiveData3, mutableLiveData, string));
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        C19EG c19egLIZIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C106V.LIZ.LIZ();
            openInboxNotification(c19egLIZIZ, bundle);
        }
        return null;
    }
}
