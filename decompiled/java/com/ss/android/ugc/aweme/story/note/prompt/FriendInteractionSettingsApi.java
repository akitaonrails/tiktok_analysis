package com.ss.android.ugc.aweme.story.note.prompt;

import X.AbstractC19484711Kz;
import X.C0CQT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendInteractionSettingsApi implements IFriendInteractionSettingsApi {
    public static final FriendInteractionSettingsApi LIZIZ = new FriendInteractionSettingsApi();
    public final /* synthetic */ IFriendInteractionSettingsApi LIZ = (IFriendInteractionSettingsApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IFriendInteractionSettingsApi.class);

    @Override // com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsApi
    @InterfaceC1501160pAQ("/tiktok/v1/friend/interaction/settings")
    public AbstractC19484711Kz<FriendInteractionSettings> getFriendInteractionSettings(@InterfaceC1501070pAH("setting_types") String str) {
        return this.LIZ.getFriendInteractionSettings(str);
    }
}
