package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.C01GW;
import X.C0PUV;
import X.C1697810uHb;
import X.C301500Bro;
import X.C452501pT;
import X.C652390PiP;
import X.C653460Pk8;
import X.InterfaceC653510PkD;
import X.InterfaceC665370Q7z;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAwemeCardForUser extends SearchAwemeCardViewHolder implements InterfaceC653510PkD {
    public SearchUser LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final int LJIIJJI() {
        return 65458;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final String LJIILIIL() {
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final String LJIILL() {
        return "hot_user";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final int LJIIL() {
        ProductGroup productGroup;
        List<Product> list;
        SearchUser searchUser = this.LLJILJILJ;
        return (searchUser == null || (productGroup = searchUser.productGroup) == null || (list = productGroup.productList) == null || !(list.isEmpty() ^ true)) ? 0 : 1;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final String LJIILJJIL() {
        User user;
        SearchUser searchUser = this.LLJILJILJ;
        return String.valueOf((searchUser == null || (user = searchUser.user) == null) ? null : user.getUid());
    }

    public final String LJIJJ() {
        ProductGroup productGroup;
        Integer num;
        ProductGroup productGroup2;
        Integer num2;
        SearchUser searchUser = this.LLJILJILJ;
        if (searchUser != null && (productGroup2 = searchUser.productGroup) != null && (num2 = productGroup2.shopType) != null && num2.intValue() == 1) {
            return "window";
        }
        SearchUser searchUser2 = this.LLJILJILJ;
        return (searchUser2 == null || (productGroup = searchUser2.productGroup) == null || (num = productGroup.shopType) == null || num.intValue() != 2) ? "" : "shop";
    }

    @Override // X.InterfaceC653510PkD
    public final Object LLFZ() {
        SearchUser searchUser = this.LLJILJILJ;
        if (searchUser == null) {
            return null;
        }
        return Integer.valueOf(System.identityHashCode(searchUser));
    }

    @Override // X.InterfaceC653510PkD
    public final List<Aweme> getAwemeList() {
        List<Aweme> list;
        SearchUser searchUser = this.LLJILJILJ;
        if (searchUser == null || (list = searchUser.awemeCards) == null) {
            return null;
        }
        if (!C301500Bro.LIZ()) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (!AwemeSaaSExtKt.isLive(aweme)) {
                    arrayList.add(aweme);
                }
            }
            list = arrayList;
        }
        return new ArrayList(list);
    }

    @Override // X.InterfaceC653510PkD
    public final int LJ() {
        List<Aweme> list;
        if (C301500Bro.LIZ()) {
            return 10;
        }
        SearchUser searchUser = this.LLJILJILJ;
        int i = 0;
        if (searchUser != null && (list = searchUser.awemeCards) != null && !list.isEmpty()) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                if (AwemeSaaSExtKt.isLive(it2.next()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return 10 - i;
    }

    @Override // X.InterfaceC653510PkD
    public final List<Aweme> LJI() {
        SearchUser searchUser;
        List<Aweme> list;
        if (C301500Bro.LIZ() || (searchUser = this.LLJILJILJ) == null || (list = searchUser.awemeCards) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (AwemeSaaSExtKt.isLive(aweme)) {
                arrayList.add(aweme);
            }
        }
        return new ArrayList(arrayList);
    }

    @Override // X.InterfaceC653510PkD
    public final boolean LIZJ(Aweme aweme) {
        List<Aweme> awemeList = getAwemeList();
        if (awemeList != null) {
            Iterator<Aweme> it2 = awemeList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(it2.next().getAid(), aweme.getAid())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final void LJIJI(Aweme aweme) {
        List<Aweme> list;
        List listLIZLLL;
        C653460Pk8 c653460Pk8 = (C653460Pk8) this.LLJJI.getValue();
        if (c653460Pk8 != null) {
            AwS624S0100000_10 awS624S0100000_10 = new AwS624S0100000_10(this, 68);
            ContinuousLoadingAwemeList continuousLoadingAwemeListLIZJ = c653460Pk8.LIZJ();
            if (continuousLoadingAwemeListLIZJ != null && (list = continuousLoadingAwemeListLIZJ.awemeList) != null) {
                if (c653460Pk8.LIZIZ.LIZJ(aweme)) {
                    listLIZLLL = null;
                } else {
                    listLIZLLL = c653460Pk8.LIZLLL(aweme, list);
                }
                awS624S0100000_10.invoke(aweme, listLIZLLL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C654760PmE LJIJ(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.Integer r11) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser.LJIJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):X.0PmE");
    }

    public SearchAwemeCardForUser(C652390PiP c652390PiP, LifecycleOwner lifecycleOwner, Function0<? extends InterfaceC665370Q7z> function0) {
        super(c652390PiP, lifecycleOwner, function0);
        this.LLJILLL = "";
        this.LLJJI = C452501pT.LIZIZ(new AwS411S0200000_10(lifecycleOwner, this, 42));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(com.ss.android.ugc.aweme.feed.model.Aweme r12, android.view.View r13, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser.LJIILLIIL(com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C654740PmC LJIIZILJ(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.Integer r11, java.lang.String r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser.LJIIZILJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String, android.view.View):X.0PmC");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder, X.InterfaceC656470Poz
    public final void LJFF(int i, View view, Aweme aweme, List<? extends Aweme> list, boolean z) {
        super.LJFF(i, view, aweme, list, z);
        C0PUV.LIZ(view);
    }
}
