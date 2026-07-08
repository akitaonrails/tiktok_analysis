package com.ss.android.ugc.tiktok.addyours.collection;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C614960OAc;
import X.C615070OAn;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursCollectionListAssem extends BaseFavoriteListAssem<C614960OAc, C615070OAn, Long> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursCollectionListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/addyours/collection/AddYoursCollectionListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddYoursCollectionListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursCollectionListVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1626), AFwS240S0000000_9.get$arr$(680), null, true);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem
    public final AssemListViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String Go() {
        String string;
        Context context = getContext();
        return (context == null || (string = context.getString(2131825095)) == null) ? "" : string;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String Ho() {
        String string;
        Context context = getContext();
        return (context == null || (string = context.getString(2131825096)) == null) ? "" : string;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOo = Oo();
        viewOnAttachStateChangeListenerC20604515jvOo.LJIILJJIL(AddYoursCollectionCell.class);
        viewOnAttachStateChangeListenerC20604515jvOo.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvOo.getContext(), 1, false));
    }
}
