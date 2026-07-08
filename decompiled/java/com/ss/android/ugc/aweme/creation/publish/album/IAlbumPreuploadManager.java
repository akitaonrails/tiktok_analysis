package com.ss.android.ugc.aweme.creation.publish.album;

import X.C1157680gEQ;
import X.C1157720gEU;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface IAlbumPreuploadManager {
    void LIZ(String str, boolean z);

    Object LIZIZ(String str, long j, String str2, InterfaceC1364105Vn interfaceC1364105Vn);

    void LIZJ(String str, String str2);

    void LIZLLL(String str, List<? extends MediaModel> list);

    C1157680gEQ LJ(String str, String str2);

    C1157720gEU LJFF(String str, String str2);

    String LJI(MediaModel mediaModel);

    Object LJII(String str, long j, String str2, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJIIIIZZ(String str, String str2);

    void clearAll();
}
