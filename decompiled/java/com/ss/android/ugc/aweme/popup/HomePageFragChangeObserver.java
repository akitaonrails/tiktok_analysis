package com.ss.android.ugc.aweme.popup;

import X.C0TGV;
import X.InterfaceC20660615sy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class HomePageFragChangeObserver {
    public static final HomePageFragChangeObserver LIZ = new HomePageFragChangeObserver();
    public static final ConcurrentHashMap<Integer, InterfaceC20660615sy> LIZIZ = new ConcurrentHashMap<>();
    public static int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(final Fragment fragment, final String str) {
        InterfaceC20660615sy interfaceC20660615sy;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_dynamic_popup_when_page_change", false) && fragment != 0 && fragment.getContext() != null) {
            int iHashCode = fragment.hashCode();
            fragment.getLifecycle().addObserver(new HomePageFragChangeObserver$triggerShowDynamicPopup$1(iHashCode));
            if (!(fragment instanceof InterfaceC20660615sy)) {
                ConcurrentHashMap<Integer, InterfaceC20660615sy> concurrentHashMap = LIZIZ;
                if (!concurrentHashMap.containsKey(Integer.valueOf(iHashCode))) {
                    concurrentHashMap.put(Integer.valueOf(iHashCode), new InterfaceC20660615sy(fragment, str) { // from class: X.0TGW
                        public final Fragment LL;
                        public final String LLILLJJLI;

                        @Override // X.InterfaceC20658015sY
                        public final String getSceneId() {
                            return "home_page";
                        }

                        @Override // X.InterfaceC20660615sy
                        public final boolean t2() {
                            return true;
                        }

                        @Override // X.InterfaceC20658015sY
                        public final boolean Xu() {
                            if (this.LL.isDetached() || !this.LL.isAdded() || this.LL.getActivity() == null || !IMainSAFLifecycleKt.requireMainSAFLifecycle(this.LL.requireActivity(), null, false).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                                return false;
                            }
                            return C1058550deX.LIZIZ(this.LL.requireActivity(), this.LLILLJJLI);
                        }

                        @Override // X.InterfaceC20658015sY
                        public final C688120Qyw i2() {
                            if (this.LL.isDetached() || !this.LL.isAdded() || this.LL.getActivity() == null) {
                                return null;
                            }
                            return new C688120Qyw(this.LL.requireContext(), IMainSAFLifecycleKt.requireMainSAFLifecycle(this.LL.requireActivity(), null, false), null);
                        }

                        {
                            this.LL = fragment;
                            this.LLILLJJLI = str;
                        }
                    });
                }
                ConcurrentHashMap<Integer, InterfaceC20660615sy> concurrentHashMap2 = LIZIZ;
                if (concurrentHashMap2.containsKey(Integer.valueOf(iHashCode))) {
                    interfaceC20660615sy = concurrentHashMap2.get(Integer.valueOf(iHashCode));
                } else {
                    return;
                }
            } else {
                interfaceC20660615sy = (InterfaceC20660615sy) fragment;
            }
            if (interfaceC20660615sy != null) {
                ISpecActService.LIZ.getClass();
                C0TGV.LIZ().LJJJI(interfaceC20660615sy, str, 101, true);
            }
        }
    }
}
