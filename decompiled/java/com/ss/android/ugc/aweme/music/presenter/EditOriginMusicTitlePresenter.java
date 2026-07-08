package com.ss.android.ugc.aweme.music.presenter;

import X.C09CT;
import X.C11NZ;
import X.C11S5;
import X.C1266240j3W;
import X.C1701940uOG;
import X.InterfaceC1239340iM8;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes20.dex */
public final class EditOriginMusicTitlePresenter {
    public final InterfaceC1239340iM8 LIZ;

    public static final class AlterMusicTitleModel {

        @C09CT("status_msg")
        public String statusMsg;

        @C09CT("status_code")
        public int status_code;
    }

    public interface MusicTitleApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/music/update/")
        C11NZ<AlterMusicTitleModel> alterMusicTitle(@InterfaceC1501050pAF("music_id") String str, @InterfaceC1501050pAF("title") String str2);
    }

    public EditOriginMusicTitlePresenter(InterfaceC1239340iM8 interfaceC1239340iM8) {
        this.LIZ = interfaceC1239340iM8;
    }

    public final void LIZ(String str, String str2) {
        ((MusicTitleApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(MusicTitleApi.class)).alterMusicTitle(str, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1266240j3W(this, 0));
    }
}
