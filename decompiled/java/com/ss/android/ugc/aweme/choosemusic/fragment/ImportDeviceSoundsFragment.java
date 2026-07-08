package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C0HTI;
import X.C0OM1;
import X.C0P6P;
import X.C0PEM;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390410mHn;
import X.C15GO;
import X.C15GR;
import X.C15GU;
import X.C15HO;
import X.C15HP;
import X.C15IK;
import X.C15KL;
import X.C15KM;
import X.C1722300uv6;
import X.C197039127h;
import X.C20448614zs;
import X.C20449014zw;
import X.C20491015Ga;
import X.C23250099c;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817503Hh;
import X.EnumC20491915Gj;
import X.InterfaceC1258040iqI;
import X.InterfaceC196862120m;
import X.InterfaceC20492315Gn;
import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ImportDeviceSoundsFragment extends BaseMusicListFragment<C20448614zs> implements C15GU<C20448614zs>, C0P6P, InterfaceC1258040iqI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5OiYwHELIOSZiM+KCg+LSs4ZwY+OCo+PQs2PiwvLBw8PSsoOgkhKSIhLCEn";
    public TuxNavBar LLJJIII;
    public C197039127h LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public C1390410mHn LLJJIJIL;
    public final ArrayList<MusicModel> LLJJJ = new ArrayList<>();
    public final ArrayList<MusicModel> LLJJJIL = new ArrayList<>();
    public final Keva LLJJJJ = Keva.getRepo("device_sounds_repo");
    public int LLJJJJJIL;

    @Override // X.C15GU
    public final void LJIJ() {
    }

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "device_sounds_list_data";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String OR() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean PR() {
        return false;
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "device_sounds_list_load_more_status";
    }

    @Override // X.C15GU
    public final void b1() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getLayoutId() {
        return R.layout.bm1;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getPageType() {
        return 16;
    }

    @Override // X.C15GU
    public final void refreshData() {
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "device_sounds_list_status";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if (interfaceC20492315Gn != 0) {
            interfaceC20492315Gn.showLoadMoreLoading();
        }
        aS();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        Object obj = this.LLIZLLLIL;
        if (obj == null) {
            return null;
        }
        return ((C15GR) obj).LIZIZ;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ki4) : null;
            this.LLJJIJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1390410mHn WR() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nkm) : null;
            this.LLJJIJIL = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final LinearLayout ZR() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nkn) : null;
            this.LLJJIJIIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final void aS() {
        if (this.LLJJJJJIL == 0) {
            LinearLayout linearLayoutZR = ZR();
            if (linearLayoutZR != null) {
                C786410Ut5.LJZL(0, linearLayoutZR);
            }
            C1390410mHn c1390410mHnWR = WR();
            if (c1390410mHnWR != null) {
                c1390410mHnWR.LIZJ();
            }
        } else {
            LinearLayout linearLayoutZR2 = ZR();
            if (linearLayoutZR2 != null) {
                C786410Ut5.LJZL(8, linearLayoutZR2);
            }
        }
        Context context = getContext();
        if (context != null) {
            InterfaceC196862120m interfaceC196862120m = new InterfaceC196862120m() { // from class: X.15Hs
                @Override // X.InterfaceC196862120m
                public final void onFailed() {
                    C1524805y2.LIZIZ(0L, new AwS575S0100000_31(this.LIZ, 339));
                    this.LIZ.bS(new ArrayList(), false);
                }

                @Override // X.InterfaceC196862120m
                public final void onSuccess(List<? extends MusicModel> list) {
                    C1524805y2.LIZIZ(0L, new AwS575S0100000_31(this.LIZ, 335));
                    ImportDeviceSoundsFragment importDeviceSoundsFragment = this.LIZ;
                    importDeviceSoundsFragment.LLJJJJJIL += 50;
                    importDeviceSoundsFragment.bS(list, true);
                }
            };
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C15KL(false, context, this.LLJJJJJIL, 50, interfaceC196862120m, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20494515Hj
    public final /* bridge */ /* synthetic */ void LLIIL(C15HP c15hp) {
        LLIIL(c15hp);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(View view) {
        String string;
        String string2;
        String string3;
        C20491015Ga c20491015Ga = new C20491015Ga(getContext(), view, this, 2131838158, this, this, this.LLJJI, EnumC20491915Gj.DEVICE_SOUNDS, this.LLJILLL);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.pp;
        Drawable drawableLIZ = c0hti.LIZ(requireContext());
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZ = drawableLIZ;
        Context context = getContext();
        if (context == null || (string = context.getString(2131825021)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(318));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        C1722300uv6 c1722300uv62 = new C1722300uv6();
        C0HTI c0hti2 = new C0HTI();
        c0hti2.LIZ = R.drawable.pp;
        Drawable drawableLIZ2 = c0hti2.LIZ(requireContext());
        c1722300uv62.LIZJ = 0;
        c1722300uv62.LIZ = drawableLIZ2;
        Context context2 = getContext();
        if (context2 == null || (string2 = context2.getString(2131825031)) == null) {
            string2 = "";
        }
        c1722300uv62.LJI = string2;
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(318));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147));
        c1722300uv62.LIZLLL = iLIZIZ3;
        c1722300uv62.LJ = iLIZIZ4;
        Context context3 = getContext();
        if (context3 == null || (string3 = context3.getString(2131825029)) == null) {
            string3 = "";
        }
        c1722300uv62.LJIIIIZZ = string3;
        c1722300uv62.LJIIIZ = new AwS397S0200000_31(this, c20491015Ga, 42);
        c20491015Ga.LJIIIIZZ(this);
        c20491015Ga.LJII(this);
        c20491015Ga.LJIILIIL = c1722300uv6;
        c20491015Ga.LJIIJ(new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL)));
        C15HO c15ho = new C15HO("change_music_page", "device_upload", "", C15IK.LIZ);
        c15ho.LJIILIIL = "your_sounds";
        c20491015Ga.LJIIIZ(c15ho);
        c20491015Ga.LIZLLL(new C15GO() { // from class: X.15Hw
            @Override // X.C15GO
            public final void LIZ() {
                this.LIZ.LJJIFFI();
            }
        }, 5);
        if (!this.LLJJJJ.getBoolean("user_allowed_scan_device_sounds", false)) {
            c20491015Ga.LIZJ.setStatus(c1722300uv62);
            C786410Ut5.LLLZLZ(c20491015Ga.LIZJ, 0);
            return c20491015Ga;
        }
        C786410Ut5.LLLZLZ(c20491015Ga.LIZJ, 8);
        return c20491015Ga;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* JADX INFO: renamed from: SR */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIL(X.C15HP r7) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment.LLIIL(X.15HP):void");
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void bS(Collection collection, boolean z) {
        boolean z2;
        C20449014zw c20449014zw = new C20449014zw();
        if (z) {
            this.LLILZLL.zQ2(0, "device_sounds_list_status");
            this.LLJJJ.addAll(collection);
            c20449014zw.LIZIZ("list_data", C15KM.LIZIZ(this.LLJJJ));
            if (collection.size() >= 50) {
                z2 = true;
            } else {
                z2 = false;
            }
            c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(z2));
            c20449014zw.LIZIZ("action_type", 1);
            this.LLILZLL.zQ2(c20449014zw, "device_sounds_list_data");
        } else {
            this.LLILZLL.zQ2(1, "device_sounds_list_status");
        }
        if (this.LLJJJ.isEmpty()) {
            C197039127h c197039127hVR = VR();
            if (c197039127hVR != null) {
                C786410Ut5.LLLLLLJ(c197039127hVR, 8);
                return;
            }
            return;
        }
        C197039127h c197039127hVR2 = VR();
        if (c197039127hVR2 == null) {
            return;
        }
        C786410Ut5.LLLLLLJ(c197039127hVR2, 0);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.getRootView().findViewById(R.id.exx);
        View viewFindViewById2 = null;
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C497820Jfg.LIZJ(view.getContext());
        }
        View view2 = this.LLJJIII;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.y08);
            }
            this.LLJJIII = (TuxNavBar) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 66));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = view.getContext().getString(2131826444);
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) view2).setNavActions(c0om1);
        C197039127h c197039127hVR = VR();
        if (c197039127hVR != null) {
            c197039127hVR.setSupportClickWhenDisable(true);
        }
        C197039127h c197039127hVR2 = VR();
        if (c197039127hVR2 != null) {
            C786410Ut5.U8(c197039127hVR2, new ACListenerS131S0200000_29(this, view, 7));
        }
        if (this.LLJJJJ.getBoolean("user_allowed_scan_device_sounds", false)) {
            aS();
            C197039127h c197039127hVR3 = VR();
            if (c197039127hVR3 != null) {
                C786410Ut5.LLLLLLJ(c197039127hVR3, 0);
                return;
            }
            return;
        }
        C197039127h c197039127hVR4 = VR();
        if (c197039127hVR4 == null) {
            return;
        }
        C786410Ut5.LLLLLLJ(c197039127hVR4, 8);
    }
}
