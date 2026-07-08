package com.ss.android.ugc.aweme.im.camera.entrance;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;

/* JADX INFO: loaded from: classes3.dex */
public interface IIMCameraEntranceService {
    boolean LIZLLL(int i, IMUser iMUser, String str);

    IMMessageListProtocol<?> LJ(Fragment fragment);

    IMMessageListProtocol<?> LJFF(Fragment fragment);

    boolean LJI();

    boolean LJII(int i, String str, boolean z);

    boolean LJIIIIZZ(String str, int i, IMUser iMUser, boolean z);

    boolean LJIIIZ(boolean z);
}
