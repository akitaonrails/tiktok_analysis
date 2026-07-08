package com.ss.android.ugc.aweme.shortvideo;

import X.C01GW;
import X.C452501pT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class DraftMusicAdapter {
    public static final DraftMusicAdapter INSTANCE = new DraftMusicAdapter();
    public static final C01GW gson$delegate = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(136));

    public final Gson getGson() {
        return (Gson) gson$delegate.getValue();
    }

    public final AVMusic transformNewAVMusic(String str) {
        MusicModel musicModel = (MusicModel) GsonProtectorUtils.fromJson(getGson(), str, MusicModel.class);
        if (musicModel.getName() == null) {
            musicModel.getMusicType();
        }
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).aVTransformModelService().transformMusicModel(musicModel);
    }
}
