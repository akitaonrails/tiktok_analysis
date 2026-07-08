package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C0H89;
import X.C0QSJ;
import X.C653660PkS;
import X.C659520Ptu;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import X.InterfaceC738070SxJ;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoHolderVM extends AssemViewModelWithItem<C0H89, C659520Ptu> implements InterfaceC738070SxJ<C0H89, C659520Ptu>, C0QSJ, InterfaceC1146704e9 {
    public boolean LL;
    public C653660PkS LLILLJJLI;
    public ISearchContextAbility LLILLL;
    public ISearchVideoHolderAbility LLILZ;
    public List<InterfaceC687730QyJ> LLILZIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ISearchVideoHolderAbility.class) {
            this.LLILZ = (ISearchVideoHolderAbility) obj;
            C687700QyG.LJFF(this, this.LLILZIL, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchVideoScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ISearchVideoHolderAbility.class) {
            return this.LLILZ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVideoScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVideoScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ISearchVideoHolderAbility.class) {
            this.LLILZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLILZIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0H89(null, null);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLILZIL == null) {
            this.LLILZIL = new ArrayList();
        }
        ((ArrayList) this.LLILZIL).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC738070SxJ
    public final C659520Ptu state2ItemAccept(InterfaceC0148002o interfaceC0148002o, C659520Ptu c659520Ptu) {
        return c659520Ptu;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, C659520Ptu c659520Ptu, List list) {
        return new C0H89(null, null);
    }
}
