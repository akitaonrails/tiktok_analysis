package com.ss.android.ugc.aweme.mix.manageplaylist;

import X.AbstractC21688119uJ;
import X.C01D1;
import X.C01GW;
import X.C08CX;
import X.C0OM1;
import X.C1165310gQj;
import X.C1169160gWw;
import X.C1208620hYa;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C20684815ws;
import X.C21688219uK;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C445720Hdq;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistViewModel;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import org.greenrobot.eventbus.EventBus;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ManagePlaylistFragmentAssem extends UIListContentAssem<ManagePlaylistViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public C1749280vcc LLJIJIL;
    public final C01GW LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public TuxTextView LLJILLL;
    public final C21688219uK LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManagePlaylistFragmentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/manageplaylist/ManagePlaylistViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManagePlaylistFragmentAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManagePlaylistViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 172), AFwS256S0000000_18.get$arr$(162), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 478));
        this.LLJI = new C1559260qg8(new C723590SZx(this, C445720Hdq.class, "manage_playlist_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLJILJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 171));
        this.LLJJ = new C21688219uK(new AbstractC21688119uJ() { // from class: X.0gUw
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
                    C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                    String str = this.LJ.Lo().LLILLL;
                    String str2 = this.LJ.Lo().LLILZ;
                    c1169160gWw.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("enter_method", str2);
                    C20684815ws.LJIILLIIL("playlist_order_adjust", c2344009Gk.LIZ);
                }
                super.LIZJ(recyclerView, viewHolder);
                if ((viewHolder instanceof InterfaceC1167900gUu) && (interfaceC1167900gUu = (InterfaceC1167900gUu) viewHolder) != null) {
                    interfaceC1167900gUu.LJIIJ();
                }
            }

            @Override // X.AbstractC21688119uJ
            public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                return AbstractC21688119uJ.LJIIIZ(3, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC21688119uJ
            public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                int bindingAdapterPosition;
                InterfaceC1167900gUu interfaceC1167900gUu;
                if (i != 0) {
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
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
                List<InterfaceC1891350zJl> listLJII = this.LJ.Go().getState().LJII();
                int iMin = Math.min(bindingAdapterPosition2, ((ArrayList) listLJII).size() - 1);
                if (bindingAdapterPosition == iMin) {
                    return true;
                }
                C1165310gQj c1165310gQjWQ2 = this.LJ.Jo().wQ2();
                c1165310gQjWQ2.getClass();
                if (bindingAdapterPosition >= 0 && bindingAdapterPosition < ((ArrayList) c1165310gQjWQ2.LJII).size() && iMin >= 0 && iMin < ((ArrayList) c1165310gQjWQ2.LJII).size()) {
                    Collections.swap(c1165310gQjWQ2.LJII, bindingAdapterPosition, iMin);
                    c1165310gQjWQ2.LJI = Math.max(c1165310gQjWQ2.LJI, Math.max(bindingAdapterPosition, iMin));
                    c1165310gQjWQ2.LJFF = true;
                }
                Collections.swap(listLJII, bindingAdapterPosition, iMin);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = this.LJ.Go();
                C20600815jK.LJIIJ(viewOnAttachStateChangeListenerC20604515jvGo.getState(), listLJII);
                AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jvGo.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemMoved(bindingAdapterPosition, iMin);
                }
                List<InterfaceC1891350zJl> listLJII2 = this.LJ.Go().getState().LJII();
                ManagePlaylistViewModel managePlaylistViewModelJo = this.LJ.Jo();
                managePlaylistViewModelJo.withState(new AwS384S0200000_18(managePlaylistViewModelJo, (ManagePlaylistViewModel) listLJII2, (List<C1167940gUy>) 173));
                return true;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                float top = viewHolder.itemView.getTop() + f2;
                float height = viewHolder.itemView.getHeight() + top;
                if (top < 0.0f) {
                    f2 = -viewHolder.itemView.getTop();
                } else if (height > recyclerView.getHeight()) {
                    f2 = recyclerView.getHeight() - viewHolder.itemView.getBottom();
                }
                if (i == 2 && !z) {
                    if (this.LIZJ) {
                        this.LIZJ = false;
                        viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(AbstractC21688119uJ.LIZLLL(recyclerView, 8)).start();
                    }
                    super.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, false);
                    return;
                }
                super.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, z);
                this.LIZJ = true;
            }
        });
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
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    public final C445720Hdq Lo() {
        return (C445720Hdq) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final ManagePlaylistViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (ManagePlaylistViewModel) assemVMLazy.getValue();
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
        onBackPressedDispatcher.LIZ(fragmentLJI, new C1208620hYa(this, 2));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (EventBus.LIZLLL().LJIIJ(Jo())) {
            EventBus.LIZLLL().LJJI(Jo());
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        Iterable iterableLLIIJI;
        super.onStart();
        if (!EventBus.LIZLLL().LJIIJ(Jo())) {
            EventBus.LIZLLL().LJIJJ(Jo());
        }
        ManagePlaylistViewModel managePlaylistViewModelJo = Jo();
        if (managePlaylistViewModelJo.LLILZLL.isEmpty()) {
            iterableLLIIJI = C08CX.INSTANCE;
        } else {
            iterableLLIIJI = C13LP.LLIIJI(managePlaylistViewModelJo.LLILZLL);
            managePlaylistViewModelJo.LLILZLL.clear();
        }
        Iterator it2 = iterableLLIIJI.iterator();
        while (it2.hasNext()) {
            Jo().xQ2((String) it2.next());
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str = Lo().LLILLL;
        String str2 = Lo().LLILZ;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("playlist_manage_page_show", c2344009Gk.LIZ);
        this.LLJIJIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJILJILJ = (ConstraintLayout) view.findViewById(R.id.z0s);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.ybr);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        Context context = getContext();
        if (context != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2439));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131837027);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZLLL = true;
            tuxNavBar.setNavActions(c0om1);
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 39, 42), view.findViewById(R.id.f6f));
        this.LLJJ.LJ(Go());
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gV0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167930gUx) obj).LLILZ;
            }
        }, null, new AwS632S0100000_18(this, 213), 6);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gV1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167930gUx) obj).LLILLL;
            }
        }, this, null, new AwS583S0100000_4(this, 214), new AwS548S0100000_4(this, 418), new AwS597S0100000_18(this, 647), 4, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gV4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167930gUx) obj).LLILLJJLI;
            }
        }, this, null, new AwS597S0100000_18(this, 648), new AwS562S0100000_18(this, 2438), new AwS597S0100000_18(this, 640), 4, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gV2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167930gUx c1167930gUx = (C1167930gUx) obj;
                c1167930gUx.getClass();
                return C627260Oiy.LIZLLL(c1167930gUx);
            }
        }, this, null, new AwS597S0100000_18(this, 641), new AwS562S0100000_18(this, 2435), new AwS597S0100000_18(this, 642), 4, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gV3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167930gUx c1167930gUx = (C1167930gUx) obj;
                c1167930gUx.getClass();
                return C627260Oiy.LIZJ(c1167930gUx);
            }
        }, this, null, new AwS597S0100000_18(this, 643), null, new AwS597S0100000_18(this, 644), 20, null);
        ManagePlaylistViewModel managePlaylistViewModelJo = Jo();
        C1165310gQj c1165310gQjWQ2 = managePlaylistViewModelJo.wQ2();
        String str3 = (String) managePlaylistViewModelJo.LLILLJJLI.getValue();
        String str4 = (String) managePlaylistViewModelJo.LLILLL.getValue();
        String str5 = (String) managePlaylistViewModelJo.LLILZ.getValue();
        MixListResponse mixListResponse = ((C445720Hdq) managePlaylistViewModelJo.LL.getValue()).LLILZIL;
        c1165310gQjWQ2.LIZIZ = str3;
        c1165310gQjWQ2.LIZJ = str4;
        c1165310gQjWQ2.LIZLLL = str5;
        c1165310gQjWQ2.LJ = mixListResponse;
        Jo().refresh();
    }
}
