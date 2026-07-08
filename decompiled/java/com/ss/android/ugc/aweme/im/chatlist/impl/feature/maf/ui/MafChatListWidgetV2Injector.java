package com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C0I0B;
import X.C0Z3K;
import X.C1336205Ku;
import X.C13LE;
import X.C1400340mXo;
import X.C1865650yeJ;
import X.C19719912Dl;
import X.C300720BqY;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.EducateUserMessageSetting;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes15.dex */
public final class MafChatListWidgetV2Injector implements InboxFragmentWidgetInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(MafChatListWidgetV2.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final boolean enable() {
        if (C300720BqY.LIZ() && !C1336205Ku.LIZJ().LIZJ()) {
            User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
            int followerCount = currentUser != null ? currentUser.getFollowerCount() : 0;
            EducateUserMessageSetting.LIZ.getClass();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EducateUserMessageSetting.EducateUserMessageConfig educateUserMessageConfig = EducateUserMessageSetting.LIZIZ;
            EducateUserMessageSetting.EducateUserMessageConfig educateUserMessageConfig2 = (EducateUserMessageSetting.EducateUserMessageConfig) settingsManagerLIZLLL.LJIIIIZZ("tt_dm_educate_muf_user_to_message_config", EducateUserMessageSetting.EducateUserMessageConfig.class, educateUserMessageConfig);
            if (educateUserMessageConfig2 != null) {
                educateUserMessageConfig = educateUserMessageConfig2;
            }
            if (followerCount <= educateUserMessageConfig.maxFollowerCount) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865990yer identity() {
        return C0Z3K.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865650yeJ.LIZ;
    }
}
