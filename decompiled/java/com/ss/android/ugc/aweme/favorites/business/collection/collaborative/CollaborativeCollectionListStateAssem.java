package com.ss.android.ugc.aweme.favorites.business.collection.collaborative;

import X.C019F;
import X.C01GW;
import X.C0HTI;
import X.C1170250gYh;
import X.C1390410mHn;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C288930BUd;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1749320vcg;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public final class CollaborativeCollectionListStateAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollaborativeCollectionListStateAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollaborativeCollectionListStateAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 194), AFwS256S0000000_18.get$arr$(102), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 296));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 295));
    }

    public final VideoCollectionListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (VideoCollectionListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onAwemeListEmptyOrUnEmptyEvent(C1170250gYh c1170250gYh) {
        if (!C288930BUd.LIZ()) {
            return;
        }
        VideoCollectionListViewModel videoCollectionListViewModelGo = Go();
        videoCollectionListViewModelGo.withState(new AwS105S0110000_18(videoCollectionListViewModelGo, !c1170250gYh.LIZ, 17));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        FrameLayout.LayoutParams layoutParams;
        C1749280vcc c1749280vcc = (C1749280vcc) view;
        c1749280vcc.setLayoutVariant(1);
        ViewGroup.LayoutParams layoutParams2 = c1749280vcc.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
        String str = Go().LL;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = null;
        }
        if (!Intrinsics.LJFF(str, curUserId)) {
            final C1390410mHn c1390410mHn = new C1390410mHn(c1749280vcc.getContext(), null, 6);
            c1390410mHn.setId(R.id.z1_);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            C786410Ut5.V6(c1390410mHn, layoutParams3);
            if (c1390410mHn.getParent() == null) {
                c1749280vcc.addView(c1390410mHn);
            }
            c1749280vcc.LIZIZ(c1390410mHn);
            c1749280vcc.LIZ(new InterfaceC1749320vcg() { // from class: X.0gYo
                @Override // X.InterfaceC1749320vcg
                public final void hide() {
                    C786410Ut5.LLLZZIL(c1390410mHn, 4);
                    c1390410mHn.LIZLLL();
                }

                @Override // X.InterfaceC1749320vcg
                public final void show() {
                    C786410Ut5.LLLZZIL(c1390410mHn, 0);
                    c1390410mHn.LIZJ();
                }
            });
        }
        Context context = c1749280vcc.getContext();
        if (C288930BUd.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gYm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1160250gIZ) obj).LLILLJJLI);
                }
            }, null, new AwS454S0200000_18(this, c1749280vcc, 4), 6);
        }
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0gYn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160250gIZ) obj).LL;
            }
        }, null, new AwS227S0300000_18(context, c1749280vcc, this, 22), new AwS562S0100000_18(c1749280vcc, 299), new AwS384S0200000_18(this, c1749280vcc, 52), 2, null);
    }

    public final void Ho(C1749280vcc c1749280vcc, boolean z) {
        Context context = c1749280vcc.getContext();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = context.getString(2131847962);
        if (z) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.f621n2;
            Drawable drawableLIZ = c0hti.LIZ(context);
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJIIIIZZ = context.getString(2131847960);
            c1722300uv6.LJIIIZ = new AwS597S0100000_18(this, 101);
        } else {
            c1722300uv6.LJIIIIZZ = context.getString(2131845456);
        }
        c1749280vcc.setStatus(c1722300uv6);
        c1749280vcc.setButtonTopMargin(C418440Gaw.LIZIZ(24));
    }
}
