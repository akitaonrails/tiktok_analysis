package com.ss.android.ugc.aweme.topic.book.detail.vm;

import X.AbstractC316870CbV;
import X.C0O14;
import X.C0O1B;
import X.C14EU;
import X.C2189821An6;
import X.C607950Nsv;
import X.C622680Oba;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C737030Svd;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BookVideoListVM extends BaseDetailShareVM<C0O14, C607950Nsv, C0O1B> {
    public String LLILZIL;
    public String LLILZLL;
    public C0O1B LLIZ = new C0O1B(null);
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 46;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0O14(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C607950Nsv> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 395));
    }

    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Bundle bundle;
        String str;
        Bundle bundle2 = c737030Svd.LIZJ;
        if (bundle2 != null) {
            String str2 = null;
            try {
                Object obj = bundle2.get("page_id");
                if (obj != null && (bundle = c737030Svd.LIZJ) != null) {
                    try {
                        Object obj2 = bundle.get("book_id");
                        if (obj2 != null && (str = this.LLILZIL) != null && this.LLILZLL != null && c737030Svd.LIZ == 21 && Intrinsics.LJFF(str, obj2)) {
                            String str3 = this.LLILZLL;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (Intrinsics.LJFF(str2, obj)) {
                                Object obj3 = c737030Svd.LIZIZ;
                                if (obj3 instanceof Aweme) {
                                    Iterator it2 = ((ArrayList) getAwemeList()).iterator();
                                    int i = 0;
                                    while (it2.hasNext()) {
                                        if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), ((Aweme) obj3).getAid())) {
                                            if (i > 0) {
                                                setState(new AwS24S0001000_9(i, 9));
                                                return;
                                            }
                                            return;
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (OutOfMemoryError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C0O1B>> interfaceC1364105Vn) {
        return onLoadMore(new C0O1B(null), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C607950Nsv) it2.next()).LLILLJJLI.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C607950Nsv) interfaceC1891350zJl).LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: BQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C0O1B r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C0O1B>> r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM.onLoadMore(X.0O1B, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C0O1B yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLIZ;
    }
}
