package com.ss.android.ugc.aweme.notice.api.services;

import X.C11NZ;
import X.EnumC624380OeK;
import android.os.Message;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface INoticeCountService {
    int LIZ();

    void LIZJ(Message message);

    void LIZLLL(String str, List list);

    void LJ(int i, EnumC624380OeK enumC624380OeK, boolean z);

    void LJFF(EnumC624380OeK enumC624380OeK, boolean z, int[] iArr);

    int LJI(String str);

    void LJII();

    boolean LJIIIIZZ(EnumC624380OeK enumC624380OeK, boolean z, int[] iArr);

    void LJIIIZ(EntranceKey entranceKey, int i);

    int LJIIJ(int[] iArr, boolean z);

    int LJIIJJI();

    int LJIIL(int i, boolean z);

    NoticeGroupAttrs LJIILIIL(int i);

    void LJIILJJIL(int i, int i2);

    int LJIILL();

    Map<Integer, Integer> LJIILLIIL();

    int LJIIZILJ();

    int LJIJ(EntranceKey entranceKey);

    void LJIJI(int i, boolean z);

    void LJIJJ(EntranceKey entranceKey);

    void LJIJJLI();

    int LJIL();

    int LJJ(int i);

    C11NZ LJJI(NoticeList noticeList);

    void LJJIFFI(EnumC624380OeK enumC624380OeK, int[] iArr);
}
