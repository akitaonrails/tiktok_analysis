package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell;

import X.C03H5;
import X.C07DY;
import X.C0PE2;
import X.C0QSJ;
import X.C13DV;
import X.C1558420qem;
import X.C1558520qew;
import X.C1697820uHc;
import X.C641750PFd;
import X.C641780PFg;
import X.C645110PSb;
import X.C646070PVt;
import X.C646080PVu;
import X.C646120PVy;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC641760PFe;
import X.InterfaceC645100PSa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS219S0300000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchCardBaseCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, ITEM extends InterfaceC645100PSa> extends AssemPowerCell<ASSEM, ITEM> implements C0QSJ, InterfaceC1146704e9 {
    public SearchContextAbilityImpl LLIZ;
    public C641750PFd LLIZLLLIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.C0SMN
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void SN1(int i, ITEM item) {
        SearchBaseFragment searchBaseFragmentMK0;
        SearchContextAbilityImpl searchContextAbilityImpl;
        P5(item);
        if (this.LLIZ != null && this.LLIZLLLIL != null) {
            if (item == null) {
                return;
            }
        } else {
            if (item == null) {
                return;
            }
            C646080PVu c646080PVuLIZJ = null;
            ISearchPageListAbility iSearchPageListAbility = (ISearchPageListAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), ISearchPageListAbility.class, null);
            if (iSearchPageListAbility != null && (searchBaseFragmentMK0 = iSearchPageListAbility.MK0()) != null) {
                if (C07DY.LIZ()) {
                    C0PE2 c0pe2LIZ = C645110PSb.LIZ(searchBaseFragmentMK0);
                    if (c0pe2LIZ != null) {
                        CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = C646070PVt.LIZ;
                        c646080PVuLIZJ = C646070PVt.LIZJ(c0pe2LIZ.hashCode(), new WeakReference(c0pe2LIZ));
                    }
                    searchContextAbilityImpl = new SearchContextAbilityImpl(9, this.itemView, searchBaseFragmentMK0, new C646120PVy(this.itemView.hashCode(), searchBaseFragmentMK0.hashCode()), c646080PVuLIZJ, Integer.valueOf(searchBaseFragmentMK0.hashCode()), null);
                } else {
                    searchContextAbilityImpl = new SearchContextAbilityImpl(121, this.itemView, searchBaseFragmentMK0, null, null, null, null);
                }
                this.LLIZ = searchContextAbilityImpl;
                C641780PFg c641780PFg = InterfaceC641760PFe.LIZ;
                AwS219S0300000_10 awS219S0300000_10 = new AwS219S0300000_10(this, item, searchContextAbilityImpl, 20);
                c641780PFg.getClass();
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                awS219S0300000_10.invoke(c13dvLIZIZ);
                this.LLIZLLLIL = new C641750PFd(C1697820uHc.LIZ(c13dvLIZIZ));
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C641750PFd c641750PFd = this.LLIZLLLIL;
        if (c641750PFd != null) {
            c641750PFd.LIZ(interfaceC665370Q7zLIZIZ, item.LLIIIILZ(), item);
        }
    }
}
