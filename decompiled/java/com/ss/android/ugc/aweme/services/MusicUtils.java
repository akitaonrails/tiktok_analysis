package com.ss.android.ugc.aweme.services;

import X.C08QA;
import X.C1131404bg;
import X.C2095008Iq;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ability.VEAudioFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicUtils {
    public static final MusicUtils INSTANCE = new MusicUtils();

    public static final MusicModel buildMusicModelFromFile(File file, String str, String str2, boolean z, boolean z2) {
        int iIntValue;
        Integer num;
        Long lLJIILIIL;
        if (!file.exists()) {
            return new MusicModel();
        }
        String extractMusicThumbDir = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().getExtractMusicThumbDir();
        MusicModel musicModel = new MusicModel();
        String str3 = null;
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null && lLJIILIIL.longValue() > 0) {
            musicModel.setLocalMusicId(-lLJIILIIL.longValue());
            musicModel.setId(-lLJIILIIL.longValue());
            musicModel.setMusicId(String.valueOf(-lLJIILIIL.longValue()));
        } else {
            long j = -C1131404bg.LIZ(file.length(), file.getPath(), "", "");
            musicModel.setLocalMusicId(j);
            musicModel.setId(j);
            musicModel.setMusicId(String.valueOf(j));
        }
        if (str == null) {
            str = C08QA.LJIJI(file);
        }
        musicModel.setName(str);
        musicModel.setLocalPath(file.getPath());
        VEAudioFileInfo audioFileInfo = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).vesdkService().getAudioFileInfo(file.getPath());
        if (audioFileInfo != null && (num = audioFileInfo.duration) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        musicModel.setDuration(iIntValue);
        musicModel.setLocalMusicDuration(musicModel.getDuration());
        musicModel.setMusicStatus(1);
        musicModel.setMusicType(3);
        if (z) {
            str3 = extractMusicThumbDir + '/' + C08QA.LJIJI(file) + ".jpg";
        }
        musicModel.setLocalThumbPath(str3);
        musicModel.setDataType(1);
        musicModel.setDateLastModified(Long.valueOf(file.lastModified()));
        musicModel.setCCTemplateLocalMusic(z2);
        return musicModel;
    }
}
