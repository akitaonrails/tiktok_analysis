package com.ss.android.ugc.aweme.inbox.bulletin.vscope;

import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface BulletinInteractionAbility extends InterfaceC494301wD {
    boolean AK2();

    void BM1();

    void VL1(View view, BulletinBaseItem bulletinBaseItem, boolean z, boolean z2, BulletinListViewModel bulletinListViewModel, BulletinBaseCell bulletinBaseCell, boolean z3, BulletinBaseCell bulletinBaseCell2);

    void Vh1(View view, BulletinBaseItem bulletinBaseItem, BulletinEmojiAbility bulletinEmojiAbility);

    void pc0(String str, String str2);

    void rE1(String str, String str2, Map<String, String> map);

    boolean v20();
}
