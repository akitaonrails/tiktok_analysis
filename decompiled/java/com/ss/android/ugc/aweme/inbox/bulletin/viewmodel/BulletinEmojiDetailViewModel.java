package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C09R9;
import X.C0OZL;
import X.C13LE;
import X.C1559260qg8;
import X.C622710Obd;
import X.C622890Obv;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC622800Obm;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiTab;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiViewDetailResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailViewModel extends AssemViewModel<C622710Obd> implements InterfaceC622800Obm {
    public static long LLILZLL;
    public static final /* synthetic */ int LLIZ = 0;
    public BulletinEmojiViewDetailResponse LLILLL;
    public BulletinEmojiTab LLILZIL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C622890Obv.class));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C0OZL.class, "BulletinEmojiDetailSheetHierarchyData"), true);
    public final Map<String, List<User>> LLILZ = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C622710Obd(0);
    }

    @Override // X.InterfaceC622800Obm
    public final Map<String, List<User>> Hj0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC622800Obm
    public final BulletinEmojiViewDetailResponse bX() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailViewModel.onRefresh(X.05Vn):java.lang.Object");
    }
}
