package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C09YA;
import X.C0QQK;
import X.C0QQO;
import X.C1381440m3K;
import X.C1ER1;
import X.InterfaceC0148002o;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRelatedSuggestionVM extends AssemViewModel<C0QQO> {
    public Aweme LLILLL;
    public boolean LLILZ;
    public String LL = "";
    public String LLILLJJLI = "";
    public final IAccountUserService LLILZIL = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
    public final C09YA LLILZLL = new C09YA(this, new AwS554S0100000_10(this, 791));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0QQO(false, false, false);
    }

    public final void vQ2(Context context, final View view) {
        final Aweme aweme = this.LLILLL;
        if (aweme == null) {
            return;
        }
        setState(AFwS241S0000000_10.get$arr$(354));
        C0QQK c0qqk = C0QQK.LIZ;
        final String str = this.LL;
        final String str2 = this.LLILLJJLI;
        final boolean z = this.LLILZ;
        c0qqk.getClass();
        C1381440m3K c1381440m3K = new C1381440m3K(context);
        c1381440m3K.LIZ(new String[]{context.getResources().getString(2131847200), context.getResources().getString(2131847202), context.getResources().getString(2131847199), context.getResources().getString(2131847201)}, new DialogInterface.OnClickListener() { // from class: X.0QQI
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str3;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                str3 = "undefined";
                            } else {
                                str3 = "others";
                            }
                        } else {
                            str3 = "Inappropriate content";
                        }
                    } else {
                        str3 = "Unrelated content";
                    }
                } else {
                    str3 = "Not interested";
                }
                C0QQK c0qqk2 = C0QQK.LIZ;
                Aweme aweme2 = aweme;
                String str4 = str;
                String str5 = str2;
                boolean z2 = z;
                c0qqk2.getClass();
                C0QQK.LIZ(aweme2, str3, str4, str5, z2);
                dialogInterface.dismiss();
                C786410Ut5.LJLLLLLL(8, view);
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131822172);
                c1389890mGx.LJIIJJI();
                SearchRelatedSuggestionVM searchRelatedSuggestionVM = this;
                Aweme aweme3 = aweme;
                C0QQP c0qqp = (C0QQP) searchRelatedSuggestionVM.LLILZLL.getValue().getOperator();
                if (c0qqp.LL.isLogin() && C0BQY.LIZ()) {
                    Keva keva = C1959707lz.LIZ;
                    String curUserId = c0qqp.LL.getCurUserId();
                    if (!TextUtils.isEmpty(aweme3.getAid()) && !TextUtils.isEmpty(curUserId)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(curUserId);
                        sbLIZ.append(aweme3.getAid());
                        C1959707lz.LIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                    }
                }
                searchRelatedSuggestionVM.setState(AFwS241S0000000_10.get$arr$(453));
            }
        });
        c1381440m3K.LIZ.LIZ.LJIILIIL = new DialogInterface.OnCancelListener() { // from class: X.0QQL
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0QQK c0qqk2 = C0QQK.LIZ;
                Aweme aweme2 = aweme;
                String str3 = str;
                String str4 = str2;
                boolean z2 = z;
                c0qqk2.getClass();
                C0QQK.LIZ(aweme2, "cancel", str3, str4, z2);
                SearchRelatedSuggestionVM searchRelatedSuggestionVM = this;
                searchRelatedSuggestionVM.getClass();
                searchRelatedSuggestionVM.setState(AFwS241S0000000_10.get$arr$(452));
            }
        };
        C0QQK.LIZIZ(aweme, str, str2, z);
        c1381440m3K.LIZIZ();
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c1er1.LLJJJJJIL(-1L, "comment_related_search", true);
        c1er1.LLLJ("cancel", this.LL, "LONG_PRESS");
    }
}
