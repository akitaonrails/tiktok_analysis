package com.ss.android.ugc.aweme.internalshare.impl.ui;

import X.C0I0B;
import X.C0ZE7;
import X.C1214160hhW;
import X.C1214170hhX;
import X.C1356590lPF;
import X.C1363070lZh;
import X.C1363110lZl;
import X.C1363150lZp;
import X.C1363160lZq;
import X.C1363350la9;
import X.C1363420laG;
import X.C1364510lc1;
import X.C1364620lcC;
import X.C1365460ldY;
import X.C1370970lmR;
import X.C1388190mED;
import X.C13BV;
import X.C1606620ruW;
import X.C2188811AlT;
import X.C310720CFy;
import X.C786410Ut5;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1910440zoY;
import X.EnumC1910450zoZ;
import X.EnumC994650bzT;
import X.InterfaceC1356390lOv;
import X.InterfaceC1362600lYw;
import X.InterfaceC1363370laB;
import X.InterfaceC1363540laS;
import X.InterfaceC1364650lcF;
import X.InterfaceC1368680lik;
import X.InterfaceC1371520lnK;
import X.InterfaceC1493505sz;
import X.InterfaceC897380ZIi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.view.Widget;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LongPressShareWidget extends Widget implements InterfaceC1356390lOv, InterfaceC1364650lcF, InterfaceC1363370laB, InterfaceC1371520lnK {
    public final C1363070lZh LLILLJJLI;
    public final InterfaceC1362600lYw LLILLL;
    public final Context LLILZ;
    public final SharePanelViewModel LLILZIL;
    public C1214160hhW LLILZLL;
    public RecyclerView LLIZ;
    public C1363420laG LLIZLLLIL;
    public final List<IMContact> LLJ;
    public final C897520ZIw LLJI;
    public final C1363110lZl LLJIJIL;
    public long LLJILJIL;
    public final long LLJILJILJ;

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.common.view.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
    }

    @Override // X.InterfaceC1371520lnK
    public final void LIZ() {
        this.LLJIJIL.LL.setCurrentState(Lifecycle.State.CREATED);
        C897520ZIw c897520ZIw = this.LLJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    public final void LJ() {
        SharePanelViewModel sharePanelViewModel = this.LLILZIL;
        if (sharePanelViewModel.LLJJJJ) {
            return;
        }
        if (sharePanelViewModel.LJIILL().size() == 1) {
            throw null;
        }
        C2188811AlT.LIZ();
        throw null;
    }

    @Override // X.InterfaceC1371520lnK
    public final void dismissDialog() {
        C1363110lZl c1363110lZl = this.LLJIJIL;
        if (c1363110lZl.LL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            c1363110lZl.LL.setCurrentState(Lifecycle.State.DESTROYED);
        }
        C897520ZIw c897520ZIw = this.LLJI;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
    }

    @Override // X.InterfaceC1363370laB
    public final C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(this.LLJIJIL);
        c0ze7.LIZIZ(EnumC1910440zoY.LONG_PRESS_PANEL);
        c0ze7.LIZLLL = this.LLILZIL.LJIIL();
        return c0ze7;
    }

    public final int LIZJ() {
        C310720CFy c310720CFyLIZIZ;
        if (((IAwemeImManager) ServiceManager.get().getService(IAwemeImManager.class)).getProxy() == null || (c310720CFyLIZIZ = C1606620ruW.LIZIZ()) == null) {
            return 10;
        }
        return c310720CFyLIZIZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.common.view.Widget
    public final void onDestroy() {
        getLifecycle().removeObserver(this.LLILZIL);
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
        C1363420laG c1363420laG = this.LLIZLLLIL;
        if (c1363420laG != null) {
            Iterator<IMContact> it2 = c1363420laG.getData().iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), iMContact)) {
                    if (i != -1) {
                        ((ArrayList) c1363420laG.LLIZ).add(Integer.valueOf(i));
                        c1363420laG.notifyItemChanged(i, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public final void LIZIZ(C1365460ldY c1365460ldY) {
        C1214170hhX c1214170hhX;
        this.LLILLJJLI.LIZJ.dismiss();
        this.LLILLL.LJIIJ(this.LLILLJJLI.LIZIZ, "chat_merge");
        String string = this.LLILLJJLI.LIZIZ.extras.getString("author_user_name", "");
        int i = this.LLILLJJLI.LIZIZ.extras.getInt("share_im_limit_tip_type", -1);
        if (i > 0 && !TextUtils.isEmpty(string)) {
            c1214170hhX = new C1214170hhX(string, i, 1);
        } else {
            c1214170hhX = null;
        }
        Set<IMContact> setLJIILL = this.LLILZIL.LJIILL();
        Activity activityLIZ = C1388190mED.LIZ(this.LLILZ);
        if (activityLIZ == null) {
            return;
        }
        InterfaceC1368680lik interfaceC1368680lik = new InterfaceC1368680lik() { // from class: X.0lZF
            @Override // X.InterfaceC1368680lik
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1368680lik
            public final void LJ(IMContact iMContact, int i2, boolean z) {
            }

            @Override // X.InterfaceC1368680lik
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1368680lik
            public final void LJIIIZ(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1368680lik
            public final void LIZ(SharePackage sharePackage) {
                this.LIZ.LLILLL.LJIIL(sharePackage);
            }

            @Override // X.InterfaceC1368680lik
            public final void LIZIZ(HashMap<String, String> map) {
                this.LIZ.LLILLL.LIZIZ(map);
            }

            @Override // X.InterfaceC1368680lik
            public final void LJFF(SharePackage sharePackage) {
                this.LIZ.LLILLL.LJFF(sharePackage);
            }

            @Override // X.InterfaceC1368680lik
            public final void LJI(SharePackage sharePackage) {
                this.LIZ.LLILLL.LJI(sharePackage);
            }

            @Override // X.InterfaceC1368680lik
            public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
                this.LIZ.LLILLL.LIZJ(dialog, sharePackage);
            }

            @Override // X.InterfaceC1368680lik
            public final void LJII(Dialog dialog, SharePackage sharePackage) {
                this.LIZ.LLILLL.LJII(dialog, sharePackage);
            }
        };
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJFF(activityLIZ, this.LLILLJJLI.LIZIZ, c1365460ldY, setLJIILL, true, interfaceC1368680lik, false, c1214170hhX, false, true, null, false, true, null);
        ((ILogger) ServiceManager.get().getService(ILogger.class)).LJ(this.LLILLJJLI.LIZIZ, "long_press", C0I0B.LJFF.LIZIZ());
    }

    public final void LIZLLL(List<? extends IMContact> list) {
        String string;
        InterfaceC1363540laS interfaceC1363540laSE4;
        SharePackage sharePackage;
        Bundle bundle;
        SharePackage sharePackage2;
        Bundle bundle2;
        String string2;
        InterfaceC1363540laS interfaceC1363540laSE42;
        Bundle bundle3;
        if (list != null && list.isEmpty()) {
            RecyclerView recyclerView = this.LLIZ;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
                return;
            }
            return;
        }
        if (this.LLIZLLLIL == null) {
            return;
        }
        C897520ZIw c897520ZIw = this.LLJI;
        Integer numValueOf = null;
        if (c897520ZIw != null) {
            c897520ZIw.LJIIJJI(new C1356590lPF(list, null));
        }
        C1363420laG c1363420laG = this.LLIZLLLIL;
        if (c1363420laG != null) {
            c1363420laG.getData().clear();
            if (list != null && (!list.isEmpty())) {
                if (c1363420laG.LLILZIL != null) {
                    SharePackage sharePackage3 = c1363420laG.LL.LL;
                    if (sharePackage3 != null && (bundle3 = sharePackage3.extras) != null) {
                        string = bundle3.getString("user_type");
                    } else {
                        string = null;
                    }
                    if (!Intrinsics.LJFF(string, "anchor")) {
                        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService != null && (interfaceC1363540laSE42 = iLiveOuterService.E4()) != null && interfaceC1363540laSE42.LJIIIZ()) {
                            c1363420laG.getData().add(new IMContact() { // from class: X.0lZn
                            });
                        }
                        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService2 != null && (interfaceC1363540laSE4 = iLiveOuterService2.E4()) != null && interfaceC1363540laSE4.LIZJ() && (sharePackage = c1363420laG.LL.LL) != null && (bundle = sharePackage.extras) != null && bundle.getBoolean("is_reposted_live") && ((sharePackage2 = c1363420laG.LL.LL) == null || (bundle2 = sharePackage2.extras) == null || (string2 = bundle2.getString("reposted_live_note")) == null || string2.length() == 0)) {
                            c1363420laG.getData().add(new C1363160lZq());
                        }
                    }
                }
                c1363420laG.getData().addAll(list);
                c1363420laG.getData().add(new C1363150lZp(EnumC994650bzT.NORMAL));
            }
            c1363420laG.notifyDataSetChanged();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setData: ");
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", ");
            sbLIZ.append(c1363420laG.getData().size());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1364620lcC c1364620lcC = C1364620lcC.LIZ;
        SharePackage sharePackage4 = this.LLILLJJLI.LIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C1364620lcC.LJIJ(sharePackage4, interfaceC1493505szLIZIZ);
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        this.LLILZIL.LLJJJ = z;
        C1363420laG c1363420laG = this.LLIZLLLIL;
        if (c1363420laG != null) {
            c1363420laG.notifyDataSetChanged();
        }
        LJ();
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        LIZLLL(list);
    }

    public LongPressShareWidget(C1363070lZh c1363070lZh, C1364510lc1 c1364510lc1) {
        boolean z;
        SharePackage sharePackage;
        Bundle bundle;
        this.LLILLJJLI = c1363070lZh;
        this.LLILLL = c1364510lc1;
        Context context = c1363070lZh.LIZ;
        this.LLILZ = context;
        this.LLJ = new ArrayList();
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897520ZIw c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.LONG_PRESS_PANEL, false);
        this.LLJI = c897520ZIwLJI;
        this.LLJIJIL = new C1363110lZl();
        this.LLJILJILJ = 500L;
        create();
        C786410Ut5.LJJJI("enter_method", "long_press", c1363070lZh.LIZIZ.extras);
        List list = c1363070lZh.LJII;
        SharePanelViewModel sharePanelViewModelLIZ = C1363350la9.LIZ(c1363070lZh.LIZIZ, this, (!(list instanceof List) || list == null) ? C13BV.INSTANCE : list, false, false, false, null, null, null, false, false, null, null, null, 16376);
        this.LLILZIL = sharePanelViewModelLIZ;
        getLifecycle().addObserver(sharePanelViewModelLIZ);
        RecyclerView recyclerView = c1363070lZh.LJ;
        if (recyclerView != null) {
            this.LLIZ = recyclerView;
            C1363420laG c1363420laG = new C1363420laG(sharePanelViewModelLIZ, c1364510lc1, context, c897520ZIwLJI, c1363070lZh.LJIIIIZZ);
            this.LLIZLLLIL = c1363420laG;
            RecyclerView recyclerView2 = this.LLIZ;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c1363420laG);
            }
            RecyclerView recyclerView3 = this.LLIZ;
            int i = 1;
            if (recyclerView3 != null) {
                z = false;
                recyclerView3.setLayoutManager(new LinearLayoutManager(context, 1, false));
            } else {
                z = false;
            }
            RecyclerView recyclerView4 = this.LLIZ;
            if (recyclerView4 != null) {
                recyclerView4.setNestedScrollingEnabled(false);
            }
            FrameLayout frameLayout = c1363070lZh.LIZLLL;
            if (frameLayout != null && (sharePackage = sharePanelViewModelLIZ.LL) != null && (bundle = sharePackage.extras) != null) {
                String string = bundle.getString("author_user_name", null);
                int i2 = bundle.getInt("share_im_limit_tip_type", -1);
                if (i2 > 0 && !TextUtils.isEmpty(string)) {
                    if (bundle.getBoolean("is_sub_only_live", z)) {
                        i = 4;
                    } else if (bundle.getInt("share_im_limit_tip_type") == 6) {
                        if (bundle.getLong("live_visible_scope_type") == 1) {
                            i = 5;
                        } else {
                            i = 6;
                        }
                    }
                    C1214160hhW c1214160hhW = new C1214160hhW(context, null);
                    this.LLILZLL = c1214160hhW;
                    c1214160hhW.setWidget(this);
                    frameLayout.addView(this.LLILZLL);
                    C1214160hhW c1214160hhW2 = this.LLILZLL;
                    if (c1214160hhW2 != null) {
                        c1214160hhW2.LJ(new C1214170hhX(string, i2, i));
                    }
                }
            }
        }
        LIZLLL(null);
        sharePanelViewModelLIZ.refresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0201  */
    /* JADX WARN: Type inference failed for: r3v40, types: [T, java.lang.Integer] */
    @Override // X.InterfaceC1356390lOv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean eJ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.ui.LongPressShareWidget.eJ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean):boolean");
    }
}
