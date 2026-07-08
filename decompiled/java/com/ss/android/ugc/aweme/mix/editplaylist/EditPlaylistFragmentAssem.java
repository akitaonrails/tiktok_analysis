package com.ss.android.ugc.aweme.mix.editplaylist;

import X.AbstractC21688119uJ;
import X.AnonymousClass0208;
import X.C01D1;
import X.C01GW;
import X.C0DRA;
import X.C0OM1;
import X.C1165050gQJ;
import X.C1167410gU7;
import X.C1167470gUD;
import X.C1167550gUL;
import X.C1169160gWw;
import X.C1208620hYa;
import X.C1209040hZG;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1365870leD;
import X.C13LE;
import X.C14EU;
import X.C14K9;
import X.C1559260qg8;
import X.C1599690rjL;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C1CRB;
import X.C20097313kJ;
import X.C20603715jn;
import X.C20684815ws;
import X.C21688219uK;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1208750hYn;
import Y.ARunnableS118S0100000_18;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlaylistFragmentAssem extends UIListContentAssem<EditPlaylistViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public C197039127h LLJIJIL;
    public C197039127h LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public C1749280vcc LLJILLL;
    public TuxNavBar LLJJ;
    public C1CRB LLJJI;
    public ConstraintLayout LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public boolean LLJJJ;
    public ViewOnLayoutChangeListenerC1208750hYn LLJJJIL;
    public Drawable LLJJJJ;
    public Drawable LLJJJJJIL;
    public Drawable LLJJJJLIIL;
    public Drawable LLJJL;
    public Drawable LLJJLIIIJLLLLLLLZ;
    public Drawable LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Integer LLJLL;
    public Integer LLJLLIL;
    public Integer LLJLLL;
    public final int LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditPlaylistFragmentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/editplaylist/EditPlaylistViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditPlaylistFragmentAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditPlaylistViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 510), AFwS256S0000000_18.get$arr$(152), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 509));
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1167550gUL.class, "edit_playlist_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = PlaylistEditPageLoadingFooterCell.class;
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    public final C1167550gUL Oo() {
        return (C1167550gUL) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final EditPlaylistViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (EditPlaylistViewModel) assemVMLazy.getValue();
    }

    public final boolean Zo() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LLJJJ) {
            return true;
        }
        View view = this.LLJJIJIL;
        if (view == null || (viewHolderFindViewHolderForAdapterPosition = Go().findViewHolderForAdapterPosition(0)) == null) {
            return false;
        }
        View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
        if (view2.getHeight() <= 0 || view2.getBottom() <= 0 || view2.getTop() >= Go().getHeight()) {
            return false;
        }
        TuxNavBar tuxNavBar = this.LLJJ;
        int iMax = Math.max(tuxNavBar != null ? tuxNavBar.getBottom() : 0, Go().getTop() + view2.getBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.height != iMax) {
            marginLayoutParams.height = iMax;
            C786410Ut5.W5(view, marginLayoutParams);
        }
        if (view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LLJJJ = true;
        return true;
    }

    public final void Vo() {
        View view;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C0DRA.LIZ(c19egLIZ.getWindow(), false);
        View viewFindViewById = c19egLIZ.findViewById(R.id.iiv);
        Object parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            view.setFitsSystemWindows(false);
            if (view.getPaddingTop() != 0) {
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
            C20097313kJ.LIZJ(view);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
        }
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZ);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZ, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJ(true);
        tuxImmersionBar.LIZLLL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Fragment fragmentLJI;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        onBackPressedDispatcher.LIZ(fragmentLJI, new C1208620hYa(this, 0));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(Jo());
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        EventBus.LIZLLL().LJIJJ(Jo());
        EventBus.LIZLLL().LJIJJ(this);
        if (((C1167470gUD) Jo().getState()).LLILZIL == 1) {
            Vo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Lo(View view) {
        if (((C1167470gUD) Jo().getState()).LLILZIL != 1) {
            return;
        }
        Vo();
        if (this.LLJLILLLLZIIL) {
            return;
        }
        this.LLJLILLLLZIIL = true;
        view.setFitsSystemWindows(false);
        C14K9.LJIJJ(view, new C1209040hZG(this, 2));
        C20097313kJ.LIZJ(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void No(View view) {
        ViewGroup viewGroup;
        Drawable background;
        Drawable background2;
        Drawable background3;
        if (((C1167470gUD) Jo().getState()).LLILZIL != 1) {
            return;
        }
        Drawable background4 = null;
        if (!this.LLJLIL) {
            this.LLJLIL = true;
            this.LLJJJJ = view.getBackground();
            TuxNavBar tuxNavBar = this.LLJJ;
            if (tuxNavBar != null) {
                background = tuxNavBar.getBackground();
            } else {
                background = null;
            }
            this.LLJJJJJIL = background;
            C1CRB c1crb = this.LLJJI;
            if (c1crb != null) {
                background2 = c1crb.getBackground();
            } else {
                background2 = null;
            }
            this.LLJJJJLIIL = background2;
            this.LLJJL = Go().getBackground();
            C1749280vcc c1749280vcc = this.LLJILJILJ;
            if (c1749280vcc != null) {
                background3 = c1749280vcc.getBackground();
            } else {
                background3 = null;
            }
            this.LLJJLIIIJLLLLLLLZ = background3;
            C1749280vcc c1749280vcc2 = this.LLJILLL;
            if (c1749280vcc2 != null) {
                background4 = c1749280vcc2.getBackground();
            }
            this.LLJL = background4;
        }
        int iIntValue = -1;
        if (this.LLJJIJIL == null && (view instanceof ConstraintLayout) && (viewGroup = (ViewGroup) view) != null) {
            View view2 = new View(viewGroup.getContext());
            C19ME c19me = new C19ME(-1, 0);
            c19me.topToTop = 0;
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            C786410Ut5.W5(view2, c19me);
            C786410Ut5.LJLLLLLL(8, view2);
            this.LLJJIJIL = view2;
            viewGroup.addView(view2, 0);
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.csw);
            C786410Ut5.LJLLLLLL(8, view3);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        view.setBackgroundColor(iIntValue);
        TuxNavBar tuxNavBar2 = this.LLJJ;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setBackgroundColor(0);
        }
        C1CRB c1crb2 = this.LLJJI;
        if (c1crb2 != null) {
            c1crb2.setBackgroundColor(0);
        }
        Go().setBackgroundColor(0);
        C1749280vcc c1749280vcc3 = this.LLJILJILJ;
        if (c1749280vcc3 != null) {
            c1749280vcc3.setBackgroundColor(0);
        }
        C1749280vcc c1749280vcc4 = this.LLJILLL;
        if (c1749280vcc4 != null) {
            c1749280vcc4.setBackgroundColor(0);
        }
        if (this.LLJJJIL == null) {
            ViewOnLayoutChangeListenerC1208750hYn viewOnLayoutChangeListenerC1208750hYn = new ViewOnLayoutChangeListenerC1208750hYn(this, 0);
            this.LLJJJIL = viewOnLayoutChangeListenerC1208750hYn;
            Go().addOnLayoutChangeListener(viewOnLayoutChangeListenerC1208750hYn);
        }
        HandlerHook.viewPost(Go(), new ARunnableS118S0100000_18(this, 23));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        Fragment fragmentLJI;
        C19EG activity;
        Window window;
        View decorView;
        if (TextUtils.equals(c1365870leD.LIZLLL, "mix_videos") && (fragmentLJI = C724240Sb0.LJI(this)) != null && (activity = fragmentLJI.getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            int i = rect.bottom;
            View view = this.LLJJIJI;
            if (view != null) {
                view.getGlobalVisibleRect(rect);
                IMSharePanelApi.LIZ.getClass();
                C1599690rjL.LIZ().getShareService().LJJIIJZLJL(fragmentLJI, c1365870leD, i - rect.bottom);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long j;
        String str;
        long j2;
        String str2;
        int i;
        String str3;
        String str4;
        C1167550gUL c1167550gULWQ2;
        String str5;
        boolean z;
        String str6;
        super.onViewCreated(view);
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str7 = Oo().LLILZ;
        String str8 = Oo().LLILLL;
        String str9 = Oo().LL;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str7);
        c2344009Gk.LJIIIIZZ("enter_method", str8);
        c2344009Gk.LJIIIIZZ("playlist_id", str9);
        C20684815ws.LJIILLIIL("playlist_edit_page_show", c2344009Gk.LIZ);
        String str10 = Oo().LLILZ;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", str10);
        c2344009Gk2.LJIIIIZZ("enter_method", "manage_video");
        C20684815ws.LJIILLIIL("enter_playlist_reorder_page", c2344009Gk2.LIZ);
        this.LLJILJIL = (C197039127h) view.findViewById(R.id.ad0);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.t5w);
        this.LLJJIJIIJIL = view.findViewById(R.id.gon);
        this.LLJILJILJ = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJJIII = (ConstraintLayout) view.findViewById(R.id.z0s);
        this.LLJJIJI = view.findViewById(R.id.cgo);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.h3n);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIIZZ = c1749280vcc.getContext().getString(2131837021);
        c1749280vcc.setStatus(c1722300uv6);
        this.LLJILLL = c1749280vcc;
        this.LLJJI = (C1CRB) view.findViewById(R.id.p1z);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS419S0200000_18(tuxNavBar, this, 156));
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZJ(new AwS419S0200000_18(tuxNavBar, this, 157));
        c0om1.LIZIZ(c1251150ifB2);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        this.LLJJ = tuxNavBar;
        new C21688219uK(new AbstractC21688119uJ() { // from class: X.0gUr
            public boolean LIZJ;
            public int LIZLLL = -1;

            @Override // X.AbstractC21688119uJ
            public final boolean LJII() {
                return false;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILL() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC21688119uJ
            public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                InterfaceC1167900gUu interfaceC1167900gUu;
                if (viewHolder.getBindingAdapterPosition() != this.LIZLLL) {
                    C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
                    String str11 = this.LJ.Oo().LLILZ;
                    String str12 = this.LJ.Oo().LLILLL;
                    c1169160gWw2.getClass();
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("enter_from", str11);
                    c2344009Gk3.LJIIIIZZ("enter_method", str12);
                    C20684815ws.LJIILLIIL("reorder_playlist", c2344009Gk3.LIZ);
                }
                super.LIZJ(recyclerView, viewHolder);
                if ((viewHolder instanceof InterfaceC1167900gUu) && (interfaceC1167900gUu = (InterfaceC1167900gUu) viewHolder) != null) {
                    interfaceC1167900gUu.LJIIJ();
                }
            }

            @Override // X.AbstractC21688119uJ
            public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (!(C13LP.LJJJLZIJ(viewHolder.getBindingAdapterPosition(), this.LJ.Go().getState().LJII()) instanceof C1166810gT9)) {
                    return 0;
                }
                return AbstractC21688119uJ.LJIIIZ(3, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC21688119uJ
            public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i2) {
                int bindingAdapterPosition;
                InterfaceC1167900gUu interfaceC1167900gUu;
                if (i2 != 0) {
                    if (viewHolder != 0) {
                        bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                    } else {
                        bindingAdapterPosition = -1;
                    }
                    this.LIZLLL = bindingAdapterPosition;
                    if ((viewHolder instanceof InterfaceC1167900gUu) && (interfaceC1167900gUu = (InterfaceC1167900gUu) viewHolder) != null) {
                        interfaceC1167900gUu.LJIIZILJ();
                    }
                }
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                String str11;
                int i2;
                C1166810gT9 c1166810gT9;
                C1166810gT9 c1166810gT92;
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
                List<InterfaceC1891350zJl> listLJII = this.LJ.Go().getState().LJII();
                int iMin = Math.min(bindingAdapterPosition2, ((ArrayList) listLJII).size() - 1);
                if (bindingAdapterPosition == iMin) {
                    return true;
                }
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(bindingAdapterPosition, listLJII);
                Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(iMin, listLJII);
                int i3 = 0;
                if (!(objLJJJLZIJ instanceof C1166810gT9) || !(objLJJJLZIJ2 instanceof C1166810gT9)) {
                    return false;
                }
                Object obj = ListProtector.get(listLJII, bindingAdapterPosition);
                String str12 = null;
                if ((obj instanceof C1166810gT9) && (c1166810gT92 = (C1166810gT9) obj) != null) {
                    str11 = c1166810gT92.LL;
                } else {
                    str11 = null;
                }
                Object obj2 = ListProtector.get(listLJII, iMin);
                if ((obj2 instanceof C1166810gT9) && (c1166810gT9 = (C1166810gT9) obj2) != null) {
                    str12 = c1166810gT9.LL;
                }
                EditPlaylistViewModel editPlaylistViewModelJo = this.LJ.Jo();
                if (str11 != null && str12 != null && !Intrinsics.LJFF(str11, str12)) {
                    C1167410gU7 c1167410gU7XQ2 = editPlaylistViewModelJo.xQ2();
                    List listLJLIL = C13LP.LJLIL(c1167410gU7XQ2.LJIIZILJ, c1167410gU7XQ2.LJIILIIL);
                    ArrayList arrayList = (ArrayList) listLJLIL;
                    Iterator it2 = arrayList.iterator();
                    int i4 = 0;
                    while (true) {
                        i2 = -1;
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), str11)) {
                                break;
                            }
                            i4++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(((Aweme) it3.next()).getAid(), str12)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                    Object obj3 = ListProtector.get(listLJLIL, i4);
                    if (i4 < ((ArrayList) c1167410gU7XQ2.LJIILIIL).size()) {
                        ListProtector.set(c1167410gU7XQ2.LJIILIIL, i4, ListProtector.get(listLJLIL, i2));
                    } else {
                        ListProtector.set(c1167410gU7XQ2.LJIIZILJ, i4 - ((ArrayList) c1167410gU7XQ2.LJIILIIL).size(), ListProtector.get(listLJLIL, i2));
                    }
                    if (i2 < ((ArrayList) c1167410gU7XQ2.LJIILIIL).size()) {
                        ListProtector.set(c1167410gU7XQ2.LJIILIIL, i2, obj3);
                    } else {
                        ListProtector.set(c1167410gU7XQ2.LJIIZILJ, i2 - ((ArrayList) c1167410gU7XQ2.LJIILIIL).size(), obj3);
                    }
                    c1167410gU7XQ2.LJIIJ = true;
                }
                EditPlaylistViewModel editPlaylistViewModelJo2 = this.LJ.Jo();
                if (str11 == null) {
                    str11 = "";
                }
                int iYQ2 = editPlaylistViewModelJo2.yQ2(str11);
                EditPlaylistViewModel editPlaylistViewModelJo3 = this.LJ.Jo();
                if (str12 == null) {
                    str12 = "";
                }
                int iYQ22 = editPlaylistViewModelJo3.yQ2(str12);
                Collections.swap(listLJII, bindingAdapterPosition, iMin);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = this.LJ.Go();
                C20600815jK.LJIIJ(viewOnAttachStateChangeListenerC20604515jvGo.getState(), listLJII);
                AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jvGo.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemMoved(bindingAdapterPosition, iMin);
                }
                AbstractC21673619ry adapter2 = viewOnAttachStateChangeListenerC20604515jvGo.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(bindingAdapterPosition, Integer.valueOf(iYQ22));
                }
                AbstractC21673619ry adapter3 = viewOnAttachStateChangeListenerC20604515jvGo.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyItemChanged(iMin, Integer.valueOf(iYQ2));
                }
                List<InterfaceC1891350zJl> listLJII2 = this.LJ.Go().getState().LJII();
                EditPlaylistViewModel editPlaylistViewModelJo4 = this.LJ.Jo();
                editPlaylistViewModelJo4.withState(new AwS384S0200000_18(editPlaylistViewModelJo4, (EditPlaylistViewModel) listLJII2, (List<? extends InterfaceC1891350zJl>) 297));
                return true;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i2, boolean z2) {
                int iFindFirstVisibleItemPosition;
                int bottom;
                int iLIZIZ;
                float height;
                LinearLayoutManager linearLayoutManager;
                float top = viewHolder.itemView.getTop() + f2;
                float height2 = viewHolder.itemView.getHeight() + top;
                RecyclerView.LayoutManager layoutManager = this.LJ.Go().getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    iFindFirstVisibleItemPosition = -1;
                }
                if (C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, this.LJ.Go().getState().LJII()) instanceof C1166810gT9) {
                    iLIZIZ = 0;
                } else {
                    View childAt = recyclerView.getChildAt(0);
                    if (childAt != null) {
                        bottom = childAt.getBottom();
                    } else {
                        bottom = 0;
                    }
                    iLIZIZ = bottom - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
                float f3 = iLIZIZ;
                if (top < f3) {
                    height = f3 - viewHolder.itemView.getTop();
                } else if (height2 > recyclerView.getHeight()) {
                    height = recyclerView.getHeight() - viewHolder.itemView.getBottom();
                } else {
                    height = f2;
                }
                if (i2 == 2 && !z2) {
                    if (this.LIZJ) {
                        this.LIZJ = false;
                        viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(AbstractC21688119uJ.LIZLLL(recyclerView, 8)).start();
                    }
                    super.LJIIJ(canvas, recyclerView, viewHolder, f, height, i2, false);
                    return;
                }
                super.LJIIJ(canvas, recyclerView, viewHolder, f, height, i2, z2);
                this.LIZJ = true;
            }
        }).LJ(Go());
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 64, 42), c197039127h);
        }
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 65, 42), c197039127h2);
        }
        EditPlaylistViewModel editPlaylistViewModelJo = Jo();
        C1167550gUL c1167550gULWQ22 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ22 != null) {
            j = c1167550gULWQ22.LLILZLL;
        } else {
            j = 0;
        }
        editPlaylistViewModelJo.LLILZIL = j;
        editPlaylistViewModelJo.setState(new AwS597S0100000_18(editPlaylistViewModelJo, 1108));
        C1167410gU7 c1167410gU7XQ2 = editPlaylistViewModelJo.xQ2();
        String str11 = (String) editPlaylistViewModelJo.LLILLJJLI.getValue();
        String str12 = "";
        if (str11 == null) {
            str11 = "";
        }
        String str13 = (String) editPlaylistViewModelJo.LLILLL.getValue();
        if (str13 == null) {
            str13 = "";
        }
        C1167550gUL c1167550gULWQ23 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ23 == null || (str = c1167550gULWQ23.LL) == null) {
            str = "";
        }
        C1167550gUL c1167550gULWQ24 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ24 != null) {
            j2 = c1167550gULWQ24.LLILZLL;
        } else {
            j2 = 0;
        }
        C1167550gUL c1167550gULWQ25 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ25 == null || (str2 = c1167550gULWQ25.LLILLJJLI) == null) {
            str2 = "";
        }
        C1167550gUL c1167550gULWQ26 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ26 != null) {
            i = c1167550gULWQ26.LLIZ;
        } else {
            i = 0;
        }
        C1167550gUL c1167550gULWQ27 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ27 != null) {
            str3 = c1167550gULWQ27.LLILZ;
        } else {
            str3 = null;
        }
        C1167550gUL c1167550gULWQ28 = editPlaylistViewModelJo.wQ2();
        if (c1167550gULWQ28 != null) {
            str4 = c1167550gULWQ28.LLILLL;
        } else {
            str4 = null;
        }
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(editPlaylistViewModelJo, 1109);
        c1167410gU7XQ2.LIZIZ = str11;
        c1167410gU7XQ2.LIZJ = str13;
        c1167410gU7XQ2.LIZLLL = str;
        c1167410gU7XQ2.LJ = j2;
        c1167410gU7XQ2.LJFF = (int) j2;
        c1167410gU7XQ2.LIZ = str2;
        c1167410gU7XQ2.LJIIIIZZ = i;
        c1167410gU7XQ2.LJI = str3;
        c1167410gU7XQ2.LJII = str4;
        c1167410gU7XQ2.LJIIIZ = awS597S0100000_18;
        if (!editPlaylistViewModelJo.LLILZLL && (c1167550gULWQ2 = editPlaylistViewModelJo.wQ2()) != null && (str5 = c1167550gULWQ2.LL) != null && (c1167550gULWQ2.LLILZLL <= 0 || c1167550gULWQ2.LLIZ == 0 || (str6 = c1167550gULWQ2.LLILLJJLI) == null || str6.length() == 0 || c1167550gULWQ2.LLILZIL == null)) {
            editPlaylistViewModelJo.LLILZLL = true;
            C1167410gU7 c1167410gU7XQ22 = editPlaylistViewModelJo.xQ2();
            String str14 = (String) editPlaylistViewModelJo.LLILLJJLI.getValue();
            if (str14 == null) {
                str14 = "";
            }
            String str15 = (String) editPlaylistViewModelJo.LLILLL.getValue();
            if (str15 != null) {
                str12 = str15;
            }
            if (c1167550gULWQ2.LLILZIL == null) {
                z = true;
            } else {
                z = false;
            }
            AwS597S0100000_18 awS597S0100000_182 = new AwS597S0100000_18(editPlaylistViewModelJo, 1111);
            AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(1049);
            c1167410gU7XQ22.LJJII.getClass();
            C1165050gQJ.LIZIZ(str5, str14, str12, z, awS597S0100000_182, aFwS256S0000000_18);
        }
        Lo(view);
        No(view);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gUI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLJ;
            }
        }, this, null, new AwS588S0100000_9(this, 694), new AwS553S0100000_9(this, 1862), new AwS597S0100000_18(this, 1110), 4, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1167470gUD) obj).LLILZIL);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 318), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1167470gUD) obj).LLJI);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 319), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1167470gUD) obj).LLILZ);
            }
        }, null, new AwS632S0100000_18(this, 47), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167470gUD c1167470gUD = (C1167470gUD) obj;
                c1167470gUD.getClass();
                return C627260Oiy.LIZ(c1167470gUD);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 317), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLIZLLLIL;
            }
        }, null, AnonymousClass0208.get$arr$(78), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 320), 4);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gUR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167470gUD c1167470gUD = (C1167470gUD) obj;
                c1167470gUD.getClass();
                return C627260Oiy.LIZLLL(c1167470gUD);
            }
        }, this, null, new AwS597S0100000_18(this, 1114), new AwS562S0100000_18(this, 2750), new AwS597S0100000_18(this, 1122), 4, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gUS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167470gUD c1167470gUD = (C1167470gUD) obj;
                c1167470gUD.getClass();
                return C627260Oiy.LIZJ(c1167470gUD);
            }
        }, this, null, new AwS597S0100000_18(this, 1124), null, new AwS597S0100000_18(this, 1125), 20, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gUU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167470gUD c1167470gUD = (C1167470gUD) obj;
                c1167470gUD.getClass();
                return C627260Oiy.LIZIZ(c1167470gUD);
            }
        }, this, null, new AwS597S0100000_18(this, 1128), null, new AwS597S0100000_18(this, 1129), 20, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 48), 4);
        C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.0gUJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLJILJILJ;
            }
        }, new C2217381BqS() { // from class: X.0gUK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS667S0100000_18(this, 43), 8);
        Jo().manualListRefresh();
    }
}
