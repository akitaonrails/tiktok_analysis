package com.ss.android.ugc.aweme.im.sharepanel.impl.relations.viewmodel;

import X.AbstractC1368180lhw;
import X.C0IA9;
import X.C0IAA;
import X.C0IAH;
import X.InterfaceC1368140lhs;
import X.InterfaceC328360Cu2;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final class RelationViewModel extends ViewModel implements InterfaceC328360Cu2<IMContact>, InterfaceC1368140lhs {
    public static final /* synthetic */ int LLILZ = 0;
    public final AbstractC1368180lhw LL;
    public final MutableLiveData<C0IAH<List<IMContact>>> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<C0IAH<Pair<List<IMContact>, String>>> LLILLL = new MutableLiveData<>();

    public RelationViewModel(AbstractC1368180lhw abstractC1368180lhw) {
        this.LL = abstractC1368180lhw;
    }

    @Override // X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        this.LLILLJJLI.setValue(new C0IAA(th));
    }

    @Override // X.InterfaceC1368140lhs
    public final void tm2(Throwable th) {
        this.LLILLL.setValue(new C0IAA(th));
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
        this.LLILLJJLI.setValue(new C0IAA(th));
    }

    @Override // X.InterfaceC1368140lhs
    public final void qN2(String str, List list) {
        this.LLILLL.setValue(new C0IA9(new Pair(list, str)));
    }

    @Override // X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        this.LLILLJJLI.setValue(new C0IA9(list));
    }

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
        this.LLILLJJLI.setValue(new C0IA9(this.LL.data()));
    }

    @Override // X.InterfaceC1368140lhs
    public final void bK(List<IMContact> list, String str, Integer num, Double d, Double d2) {
        qN2(str, list);
    }
}
