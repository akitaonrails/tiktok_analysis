package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC848400XPy;
import X.C09R9;
import X.C0OZL;
import X.C0XQ7;
import X.C13LE;
import X.C1559260qg8;
import X.C340320DVu;
import X.C621500OZg;
import X.C622890Obv;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC622800Obm;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiActionUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailListViewModel extends AssemListViewModel<C340320DVu, C621500OZg, String> {
    public final InterfaceC622800Obm LL;
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C622890Obv.class));
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C0OZL.class, "BulletinEmojiDetailSheetHierarchyData"), true);
    public final String LLILZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public int LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C340320DVu(0);
    }

    public BulletinEmojiDetailListViewModel(InterfaceC622800Obm interfaceC622800Obm) {
        this.LL = interfaceC622800Obm;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C621500OZg> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 205));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r16) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final List<C621500OZg> wQ2(List<BulletinEmojiActionUser> list) {
        boolean z;
        String str;
        ArrayList arrayList = new ArrayList();
        Map<String, List<User>> mapHj0 = this.LL.Hj0();
        C0OZL c0ozl = (C0OZL) this.LLILLL.getValue();
        if (c0ozl != null && (str = c0ozl.LLILLL) != null && u.LJIJI(str, "All", true)) {
            z = true;
        } else {
            z = false;
        }
        if (list != null) {
            for (BulletinEmojiActionUser bulletinEmojiActionUser : list) {
                User user = bulletinEmojiActionUser.actionUser;
                if (user != null) {
                    List<User> list2 = mapHj0.get(bulletinEmojiActionUser.actionEmoji);
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<User> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().getUid(), user.getUid())) {
                                break;
                            }
                        }
                    }
                    String str2 = bulletinEmojiActionUser.actionEmoji;
                    if (str2 == null) {
                        str2 = "";
                    }
                    boolean zLJFF = Intrinsics.LJFF(user.getUid(), this.LLILZ);
                    int i = this.LLILZIL;
                    this.LLILZIL = i + 1;
                    arrayList.add(new C621500OZg(user, str2, zLJFF, z, i));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r15, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r16) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }
}
