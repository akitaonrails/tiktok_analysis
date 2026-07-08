package com.ss.android.ugc.aweme.topic.movie.favorite;

import X.C0O4X;
import X.C0OAT;
import X.C1093704Pn;
import X.C13LE;
import X.C14EU;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C613490O4l;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieFavoritePage extends BaseFavoritePage {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwZiHELIOSgjPyY2ZiMtPyAhITEpZwI8PiwpDy4lJzclPSoDKSIp";
    public final C19719912Dl LLIZ = C13LE.LIZ(MovieFavoritePageAssem.class);
    public final String LLIZLLLIL = "movies";
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MovieFavoritePage.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/movie/favorite/MovieFavoriteListVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final boolean SR() {
        return false;
    }

    public MovieFavoritePage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MovieFavoriteListVM.class);
        this.LLJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS553S0100000_9(c19719912DlLIZ, 1556), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1557), AFwS240S0000000_9.get$arr$(648));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1093704Pn.LIZ.remove(this.LLIZLLLIL);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String UR() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C19719912Dl VR() {
        return this.LLIZ;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectEvent(C613490O4l c613490O4l) {
        Object next;
        TopicRawInfo topicRawInfo = c613490O4l.LIZ;
        if (topicRawInfo != null) {
            Integer num = topicRawInfo.type;
            int type = C0O4X.MOVIE.getType();
            if (num != null && num.intValue() == type) {
                if (c613490O4l.LIZIZ) {
                    AssemVMLazy assemVMLazy = this.LLJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
                    ((AssemListViewModel) assemVMLazy.getValue()).listAddItemAt(0, new C0OAT(topicRawInfo, null, null, null, null, 30));
                    return;
                }
                AssemVMLazy assemVMLazy2 = this.LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
                AssemListViewModel assemListViewModel = (AssemListViewModel) assemVMLazy2.getValue();
                AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(topicRawInfo, 404);
                List<ITEM> listListGetAll = assemListViewModel.listGetAll();
                if (listListGetAll == 0) {
                    return;
                }
                Iterator it2 = listListGetAll.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((Boolean) awS588S0100000_9.invoke(next)).booleanValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0OAT c0oat = (C0OAT) next;
                if (c0oat == null) {
                    return;
                }
                assemListViewModel.listRemoveItem(c0oat);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        C1093704Pn.LIZ.put(this.LLIZLLLIL, new AwS553S0100000_9(this, 1555));
        NR(AFwS240S0000000_9.get$arr$(647));
    }
}
