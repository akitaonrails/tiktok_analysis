package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui;

import X.C01GW;
import X.C06TB;
import X.C0QSJ;
import X.C0ZSW;
import X.C0ZSX;
import X.C0ZW2;
import X.C0ZW7;
import X.C1196320hEk;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331770klD;
import X.C1332060klg;
import X.C1332130kln;
import X.C1483380ohk;
import X.C1611360s2A;
import X.C1848410yCV;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1249220ic4;
import X.InterfaceC1616630sAf;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC713360RyY;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewModelStoreOwner;
import avg.f;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailPageScope;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.MediaGridCellLongPressAbility;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import mf.a;

/* JADX INFO: loaded from: classes25.dex */
public final class DetailMediaCell extends PowerCell<C0ZW7> implements InterfaceC713360RyY, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(196));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 644));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatDetailPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.co0;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
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

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1611360s2A c1611360s2A;
        int iLIZIZ;
        InterfaceC1616630sAf interfaceC1616630sAfLIZLLL;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI;
        final C0ZW7 c0zw7 = (C0ZW7) interfaceC1891350zJl;
        super.onBindItemView(c0zw7);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            C1483380ohk.LIZ.getClass();
            ITabletService iTabletService = C1483380ohk.LIZIZ;
            if (iTabletService != null && (interfaceC1616630sAfLIZLLL = iTabletService.LIZLLL()) != null && (interfaceC1249220ic4LJI = interfaceC1616630sAfLIZLLL.LJI()) != null) {
                iLIZIZ = interfaceC1249220ic4LJI.LJJIJ(3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(174)), this.itemView.getContext());
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(174));
            }
            layoutParams.height = iLIZIZ;
        }
        View view = this.itemView;
        UrlModel urlModel = null;
        if ((view instanceof C1611360s2A) && (c1611360s2A = (C1611360s2A) view) != null) {
            c1611360s2A.e0(c0zw7.LLILZ, c0zw7.LLIZLLLIL);
            C0ZW2<UrlModel> c0zw2 = c0zw7.LLILZLL;
            if (c0zw2 != null) {
                urlModel = c0zw2.LIZIZ;
            }
            C0ZSW c0zsw = c0zw7.LLJ;
            boolean z = false;
            c1611360s2A.LLJ = false;
            C786410Ut5.LJLLLLLL(8, c1611360s2A.LLILLJJLI);
            int i = C0ZSX.LIZ[c0zsw.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.DEFAULT);
                    int width = (int) (((double) c1611360s2A.LL.getWidth()) * 0.7d);
                    int height = (int) (((double) c1611360s2A.LL.getHeight()) * 0.7d);
                    c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
                    c1331670kl3LJIIIIZZ.LJIIIZ = height;
                    c1331670kl3LJIIIIZZ.LJJ(c1611360s2A.LL);
                    C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "im_detail_page_aweme_media", c1611360s2A.LLJI, false, null, null, null, 60);
                } else {
                    C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    C1332130kln.LIZJ(c1331670kl3LJIIIIZZ2, C06TB.DEFAULT);
                    int width2 = (int) (((double) c1611360s2A.LL.getWidth()) * 0.7d);
                    int height2 = (int) (((double) c1611360s2A.LL.getHeight()) * 0.7d);
                    c1331670kl3LJIIIIZZ2.LJIIIIZZ = width2;
                    c1331670kl3LJIIIIZZ2.LJIIIZ = height2;
                    c1331670kl3LJIIIIZZ2.LJJIFFI = new C1332060klg(25, 3, 0);
                    c1331670kl3LJIIIIZZ2.LJJ(c1611360s2A.LL);
                    C1332130kln.LJFF(c1331670kl3LJIIIIZZ2, "im_detail_page_aweme_media", c1611360s2A.LLJI, false, null, null, null, 60);
                    C786410Ut5.LJLLLLLL(0, c1611360s2A.LLILLJJLI);
                }
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                C1332130kln.LIZJ(c1331670kl3LJIIIIZZ3, C06TB.DEFAULT);
                int width3 = (int) (((double) c1611360s2A.LL.getWidth()) * 0.7d);
                int height3 = (int) (((double) c1611360s2A.LL.getHeight()) * 0.7d);
                c1331670kl3LJIIIIZZ3.LJIIIIZZ = width3;
                c1331670kl3LJIIIIZZ3.LJIIIZ = height3;
                c1331670kl3LJIIIIZZ3.LJJIJIL(new C1331770klD());
                c1331670kl3LJIIIIZZ3.LJJ(c1611360s2A.LL);
                C1332130kln.LJFF(c1331670kl3LJIIIIZZ3, "im_detail_page_aweme_media", c1611360s2A.LLJI, false, null, null, null, 60);
                C786410Ut5.LJLLLLLL(0, c1611360s2A.LLILLJJLI);
            }
            if (c0zw7.LLILLL == 1803) {
                z = true;
            }
            c1611360s2A.setPlayButtonVisible(z);
            View.OnClickListener aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(c0zw7, 63);
            if (C1848410yCV.LIZ) {
                aCListenerS149S0100000_14 = new f(aCListenerS149S0100000_14);
            }
            a aVar = new a(aCListenerS149S0100000_14);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1611360s2A);
            }
            c1611360s2A.setOnClickListener(aVar);
            c1611360s2A.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0s2B
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    ViewParent parent;
                    ViewParent parent2 = view2.getParent();
                    if (parent2 != null && (parent = parent2.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    MediaGridCellLongPressAbility mediaGridCellLongPressAbility = (MediaGridCellLongPressAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this.LL), MediaGridCellLongPressAbility.class, null);
                    if (mediaGridCellLongPressAbility != null) {
                        return mediaGridCellLongPressAbility.Vj1(c0zw7.LLILLJJLI, view2);
                    }
                    return false;
                }
            });
        }
    }
}
