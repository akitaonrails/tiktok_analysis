package com.ss.android.ugc.aweme.aigc.aiplayground;

import X.C0LAB;
import X.C0LSZ;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes6.dex */
public interface IAIPlaygroundMobService {
    String LIZ(boolean z);

    void LIZIZ(CreativeModel creativeModel, String str, String str2);

    AIGenerationType LIZJ(VideoPublishEditModel videoPublishEditModel);

    void LIZLLL(String str, CreativeModel creativeModel);

    void LJ(CreativeModel creativeModel, String str, String str2, String str3, String str4, String str5);

    void LJFF(String str, CreativeModel creativeModel);

    void LJI(CreativeModel creativeModel, C0LSZ c0lsz);

    void LJII(CreativeModel creativeModel);

    void LJIIIIZZ(String str, CreativeModel creativeModel);

    C0LAB LJIIIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab);

    void LJIIJ(int i, String str, String str2, String str3);

    void LJIIJJI(int i, String str, String str2, String str3);
}
