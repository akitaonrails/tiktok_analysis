package com.ss.android.ugc.tools.infosticker.repository.internal.recent;

import X.AbstractC19484711Kz;
import X.C0PEM;
import X.C1698380uIW;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C407201iA;
import X.EnumC1641470soj;
import X.InterfaceC300801Eo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerRecentCustomListViewModel extends BaseInfoStickerListViewModel<Effect> {
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> wQ2() {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01iB
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<List<Effect>> interfaceC2329309At) {
            }
        });
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> xQ2() throws NoSuchMethodException {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void X1() {
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            List list = (List) this.LL.getValue();
            if (list == null || !(true ^ list.isEmpty())) {
                this.LLILLJJLI.setValue(EnumC1641470soj.LOADING);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), new C1698380uIW(CoroutineExceptionHandler.LJJLIL, this, 1), null, new C407201iA(this, null), 2);
            }
        }
    }
}
