package com.ss.android.ugc.aweme.friendstab.ui;

import X.C09A1;
import X.C0N07;
import X.C1072230e0b;
import X.C1072260e0e;
import X.C1072280e0g;
import X.C1072300e0i;
import X.C1075800e6M;
import X.C11NJ;
import X.C14EU;
import X.C2232408os;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C786410Ut5;
import X.EnumC1070340dxY;
import X.EnumC1070410dxf;
import X.InterfaceC497601wk;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsEmptyPageRootVM extends ViewModel {
    public final InterfaceC497601wk LL;
    public FriendsEmptyPageMainSectionVM LLILLJJLI;
    public C0N07 LLILLL;
    public final C11NJ LLILZ;
    public final MutableLiveData<C1072280e0g> LLILZIL;
    public final MutableLiveData LLILZLL;
    public C1075800e6M LLIZ;
    public final List<EnumC1070410dxf> LLIZLLLIL;
    public EnumC1070410dxf LLJ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILZ.LJ();
        EventBus.LIZLLL().LJJI(this);
    }

    public FriendsEmptyPageRootVM() {
        this(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), new C2232408os(C786410Ut5.h4()))));
    }

    public final void vQ2() {
        for (EnumC1070340dxY enumC1070340dxY : EnumC1070340dxY.values()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1072230e0b(enumC1070340dxY, this, null), 3);
        }
    }

    public FriendsEmptyPageRootVM(InterfaceC497601wk interfaceC497601wk) {
        this.LL = interfaceC497601wk;
        this.LLILLL = C0N07.EMPTY_STATE;
        this.LLILZ = new C11NJ();
        MutableLiveData<C1072280e0g> mutableLiveData = new MutableLiveData<>(new C1072280e0g(0));
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        this.LLIZ = new C1075800e6M(null, 7);
        this.LLIZLLLIL = new ArrayList();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onRefreshEvent(C1072300e0i c1072300e0i) {
        wQ2(AFwS252S0000000_16.get$arr$(141));
    }

    public final void wQ2(Function1 function1) {
        C23250099c.LIZLLL(this.LL, null, null, new C1072260e0e(this, function1, null), 3);
    }
}
