package com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite;

import X.C1130540fWe;
import X.C1145100fu8;
import X.C1148910g0H;
import X.C13LE;
import X.C15438062q;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C497740JfY;
import X.C500980Jkm;
import X.C723850SaN;
import X.C724750Sbp;
import X.EnumC1131030fXR;
import X.EnumC1148880g0E;
import X.InterfaceC2217461Bqa;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS131S1100000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftFavoriteDialogFragment extends LiveDialogFragment {
    public static final C1130540fWe LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPWExKTYpZy0mOywiLDwgHELIOSZiElKCM8L2s6e2E1KTMjOyYnLWsLICknDiQ6Jj06PCAIIC4/JyIKOy40JSAiPQ==";
    public final AssemVMLazy LL;
    public LinkedList<C1148910g0H> LLILLJJLI;
    public LinkedList<C1148910g0H> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public EnumC1131030fXR LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fWe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftFavoriteDialogFragment.class, "favoriteViewModel", "getFavoriteViewModel()Lcom/bytedance/android/livesdk/gift/base/business/dialog/v2/favorite/GiftFavoriteViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0fWe
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gny);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = (int) (((double) C497740JfY.LJIILLIIL()) * 0.7d);
        c500980Jkm.LJ = false;
        return c500980Jkm;
    }

    public GiftFavoriteDialogFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftFavoriteViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS561S0100000_17(c19719912DlLIZ, 134), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS561S0100000_17((HasDefaultViewModelProviderFactory) this, 135), AFwS254S0000000_17.get$arr$(44));
        this.LLIZ = EnumC1131030fXR.GIFT;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            C1145100fu8.LIZ(window2);
            window2.addFlags(Integer.MIN_VALUE);
            window2.setStatusBarColor(-16777216);
            window2.setNavigationBarColor(-16777216);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        if (this.LLILZLL) {
            str = "featured_area";
        } else {
            str = "frequently_used_area";
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        AssemViewModel value = assemVMLazy.getValue();
        LinkedList<C1148910g0H> linkedList = this.LLILLJJLI;
        if (linkedList == null) {
            linkedList = null;
        }
        LinkedList<C1148910g0H> linkedList2 = this.LLILLL;
        if (linkedList2 == null) {
            linkedList2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viewmodel init， ");
        sbLIZ.append(linkedList.size());
        C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ));
        if (linkedList.size() >= 4) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedList2, 10));
            Iterator<C1148910g0H> it2 = linkedList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(C1148910g0H.LIZ(it2.next(), null, true, 895));
            }
            linkedList2 = new LinkedList<>(arrayList);
        }
        linkedList2.addFirst(new C1148910g0H((String) null, (ImageModel) null, (Integer) null, (Long) null, EnumC1148880g0E.PLACEHOLDER, (Integer) null, false, (String) null, (Gift.SchemeInfo) null, 1007));
        GiftFavoriteViewModel.wQ2(linkedList);
        value.setState(new AwS383S0200000_17(linkedList, linkedList2, (LinkedList<C1148910g0H>) 118));
        C723850SaN.LIZ(this, false, null, new AwS131S1100000_17(this, str, 0), 3);
    }
}
