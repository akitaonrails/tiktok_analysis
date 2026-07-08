package com.bytedance.ies.sdk.widgets;

import X.AbstractC813200VvC;
import X.C09R7;
import X.C13IQ;
import X.C13LE;
import X.C903300Zc8;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class CellDataChannelProvider {
    public final Fragment fragment;
    public final int rootHashCode;
    public final C13IQ<DataChannel> viewModelClass = C13LE.LIZ(DataChannel.class);
    public final Function0<String> keyFactory = new AwS561S0100000_17(this, 254);
    public final Function0<ViewModelProvider.Factory> factoryProducer = AFwS205S0000000_17.get$arr$(110);

    private final DataChannel newViewModel() {
        final ViewModelStore viewModelStore;
        ViewModelProvider.Factory factoryInvoke = this.factoryProducer.invoke();
        try {
            viewModelStore = this.fragment.getViewModelStore();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            viewModelStore = new ViewModelStore();
            FragmentManager fragmentManager = this.fragment.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.LJZL(new AbstractC813200VvC() { // from class: com.bytedance.ies.sdk.widgets.CellDataChannelProvider$newViewModel$store$1
                    @Override // X.AbstractC813200VvC
                    public void onFragmentDestroyed(FragmentManager fragmentManager2, Fragment fragment) {
                        super.onFragmentDestroyed(fragmentManager2, fragment);
                        viewModelStore.clear();
                    }
                }, false);
            }
        }
        return (DataChannel) new ViewModelProvider(viewModelStore, factoryInvoke, C903300Zc8.LIZJ).get(this.keyFactory.invoke(), C09R7.LIZ(this.viewModelClass));
    }

    public final DataChannel getValue() {
        return newViewModel();
    }

    public CellDataChannelProvider(int i, Fragment fragment) {
        this.rootHashCode = i;
        this.fragment = fragment;
    }
}
