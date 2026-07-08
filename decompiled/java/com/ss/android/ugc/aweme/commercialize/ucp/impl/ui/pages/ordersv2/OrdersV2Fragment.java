package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.AbstractC333850D6x;
import X.C01GW;
import X.C098200Yq;
import X.C0D52;
import X.C0D6U;
import X.C0D70;
import X.C0D71;
import X.C0D82;
import X.C0DC5;
import X.C0DC6;
import X.C0HTI;
import X.C0PEM;
import X.C0TVI;
import X.C13BV;
import X.C13LE;
import X.C14K9;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C332170D0l;
import X.C332710D2n;
import X.C333750D6n;
import X.C333760D6o;
import X.C333780D6q;
import X.C336720DHy;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C481090Itn;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class OrdersV2Fragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjHELIOSZiwhOSN9PSxiOS40LTZiJj03LTc/P319BzcoLD0gHncKOy40JSAiPQ==";
    public C0DC6 LL;
    public final ViewModelLazy LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;

    public final OrdersV2ViewModel MR() {
        return (OrdersV2ViewModel) this.LLILLJJLI.getValue();
    }

    public final void NR() {
        List list;
        RecyclerView recyclerView;
        C333760D6o c333760D6o;
        if (this.LLILZIL) {
            String str = this.LLILZ;
            if (str == null) {
                this.LLILZIL = false;
                return;
            }
            Object value = MR().LLILLJJLI.getValue();
            if (!(value instanceof C333760D6o) || (c333760D6o = (C333760D6o) value) == null || (list = c333760D6o.LIZ) == null) {
                list = C13BV.INSTANCE;
            }
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC333850D6x abstractC333850D6x = (AbstractC333850D6x) it2.next();
                if ((abstractC333850D6x instanceof C0D6U) && Intrinsics.LJFF(((C0D6U) abstractC333850D6x).LIZ.getStableDisplayId(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() < 0) {
                this.LLILZ = null;
                this.LLILZIL = false;
                return;
            }
            this.LLILZ = null;
            this.LLILZIL = false;
            C0DC6 c0dc6 = this.LL;
            if (c0dc6 == null || (recyclerView = c0dc6.LLILZIL) == null) {
                return;
            }
            recyclerView.scrollToPosition(numValueOf.intValue());
        }
    }

    public final void PR() {
        if (this.LLILLL || MR().yQ2() == null) {
            return;
        }
        C0D52.LIZ.getClass();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_from", "inbox"));
        JSONObject jSONObject = null;
        if (mapLIZJ != null && (!mapLIZJ.isEmpty())) {
            jSONObject = new JSONObject(mapLIZJ);
        }
        C20684815ws.LJIJ("order_ucp_order_detail_show", jSONObject);
        this.LLILLL = true;
    }

    public OrdersV2Fragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS548S0100000_4(new AwS548S0100000_4((Fragment) this, 93), (Function0<Unit>) 94));
        this.LLILLJJLI = C336720DHy.LIZ(this, C13LE.LIZ(OrdersV2ViewModel.class), new AwS548S0100000_4(c01gwLIZ, 95), new AwS405S0200000_4((Function0) null, c01gwLIZ, 13), new AwS405S0200000_4(this, c01gwLIZ, 14));
        this.LLILZLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 91));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        MR().GQ2(true);
    }

    public final void OR(C0DC6 c0dc6) {
        Drawable drawableLIZ;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = getString(2131857451);
        c1722300uv6.LJIIIIZZ = getString(2131857450);
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            drawableLIZ = c0hti.LIZ(context);
        } else {
            drawableLIZ = null;
        }
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJIIIZ = new AwS583S0100000_4(this, 51);
        c0dc6.LLIZ.setStatus(c1722300uv6);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object serializableExtra;
        Intent intent;
        super.onViewCreated(view, bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entry context -> ");
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("ucp_entry_context", C332710D2n.class);
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("ucp_entry_context");
                if (!(serializableExtra2 instanceof C332710D2n)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (C332710D2n) serializableExtra2;
            }
        } else {
            serializableExtra = null;
        }
        sbLIZ.append(serializableExtra);
        C2188811AlT.LIZIZ(sbLIZ);
        final C0DC6 c0dc6 = this.LL;
        if (c0dc6 == null) {
            return;
        }
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        c0dc6.LLILZIL.setLayoutManager(linearLayoutManager);
        c0dc6.LLILZIL.setAdapter((AbstractC21673619ry) this.LLILZLL.getValue());
        c0dc6.LLILZIL.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0D72
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                if (i2 <= 0) {
                    return;
                }
                if (linearLayoutManager.getChildCount() + linearLayoutManager.findFirstVisibleItemPosition() >= linearLayoutManager.getItemCount() - 3) {
                    this.MR().CQ2();
                }
            }
        });
        c0dc6.LLILZLL.setOnRefreshListener(new AwS548S0100000_4(this, 92));
        OR(c0dc6);
        final int paddingTop = c0dc6.LLIZLLLIL.LL.getPaddingTop();
        final int i = c0dc6.LLIZLLLIL.LL.getLayoutParams().height;
        final int paddingTop2 = c0dc6.LLILLL.getPaddingTop();
        final int paddingBottom = c0dc6.LLILZIL.getPaddingBottom();
        C14K9.LJIJJ(c0dc6.LL, new C0TVI() { // from class: X.0DD7
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                ConstraintLayout constraintLayout = c0dc6.LLIZLLLIL.LL;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.height = i + c20244914JjLIZ.LIZIZ;
                C786410Ut5.m6(constraintLayout, layoutParams);
                ConstraintLayout constraintLayout2 = c0dc6.LLIZLLLIL.LL;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), paddingTop + c20244914JjLIZ.LIZIZ, c0dc6.LLIZLLLIL.LL.getPaddingRight(), c0dc6.LLIZLLLIL.LL.getPaddingBottom());
                C481090Itn c481090Itn = c0dc6.LLILZLL;
                c481090Itn.setPadding(c481090Itn.getPaddingLeft(), c0dc6.LLILZLL.getPaddingTop(), c0dc6.LLILZLL.getPaddingRight(), c20244914JjLIZ.LIZLLL);
                LinearLayout linearLayout = c0dc6.LLILLL;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), paddingTop2, c0dc6.LLILLL.getPaddingRight(), c0dc6.LLILLL.getPaddingBottom());
                RecyclerView recyclerView = c0dc6.LLILZIL;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), c0dc6.LLILZIL.getPaddingTop(), c0dc6.LLILZIL.getPaddingRight(), paddingBottom);
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(c0dc6.LL);
        c0dc6.LLIZLLLIL.LLILLL.setText(getString(2131857434));
        C786410Ut5.LJLLLLLL(8, c0dc6.LLIZLLLIL.LLILZ);
        c0dc6.LLILZ.setText(getString(2131857433));
        C786410Ut5.h9(c0dc6.LLILLJJLI, new ACListenerS139S0100000_4(this, 18));
        TuxIconView tuxIconView = c0dc6.LLIZLLLIL.LLILLJJLI;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_ltr;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.a9(c0dc6.LLIZLLLIL.LLILLJJLI, new ACListenerS139S0100000_4(this, 19));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C0D70(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C333780D6q(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C0D71(this, null), 3);
        OrdersV2ViewModel ordersV2ViewModelMR = MR();
        ordersV2ViewModelMR.getClass();
        if (C332170D0l.LIZLLL()) {
            ordersV2ViewModelMR.LLIZLLLIL = true;
            ordersV2ViewModelMR.wQ2();
            return;
        }
        if (ordersV2ViewModelMR.LLIZLLLIL) {
            OrderSnapshotV2 orderSnapshotV2 = ordersV2ViewModelMR.LLJI;
            if (orderSnapshotV2 == null && (orderSnapshotV2 = ordersV2ViewModelMR.LLJ) == null) {
                return;
            }
            ordersV2ViewModelMR.LLJI = orderSnapshotV2;
            ordersV2ViewModelMR.LLJJ = false;
            ordersV2ViewModelMR.xQ2(orderSnapshotV2, true);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("restoreBaseSnapshotIfNeeded: restoredCount=");
            List list = orderSnapshotV2.items;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            sbLIZ2.append(list.size());
            sbLIZ2.append(", loadedMore=");
            sbLIZ2.append(ordersV2ViewModelMR.LLJIJIL.size());
            sbLIZ2.append(", cursor=");
            sbLIZ2.append(ordersV2ViewModelMR.LLJILJIL);
            sbLIZ2.append(", hasMore=");
            sbLIZ2.append(ordersV2ViewModelMR.LLJILJILJ);
            C0D82.LIZIZ("OrdersV2ViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        ordersV2ViewModelMR.LLIZLLLIL = true;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(ordersV2ViewModelMR), C0PEM.LIZJ, null, new C333750D6n(ordersV2ViewModelMR, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3u, viewGroup, false);
        int i = R.id.ucp_orders_disclaimer_action;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_orders_disclaimer_action, viewTd);
        if (tuxTextView != null) {
            i = R.id.ucp_orders_disclaimer_container;
            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_orders_disclaimer_container, viewTd);
            if (linearLayout != null) {
                i = R.id.ucp_orders_disclaimer_text;
                TextView textView = (TextView) C1616006Uk.LIZ(R.id.ucp_orders_disclaimer_text, viewTd);
                if (textView != null) {
                    i = R.id.ucp_orders_list;
                    RecyclerView recyclerView = (RecyclerView) C1616006Uk.LIZ(R.id.ucp_orders_list, viewTd);
                    if (recyclerView != null) {
                        i = R.id.ucp_orders_refresh_layout;
                        C481090Itn c481090Itn = (C481090Itn) C1616006Uk.LIZ(R.id.ucp_orders_refresh_layout, viewTd);
                        if (c481090Itn != null) {
                            i = R.id.ucp_orders_status_view;
                            C1749280vcc c1749280vcc = (C1749280vcc) C1616006Uk.LIZ(R.id.ucp_orders_status_view, viewTd);
                            if (c1749280vcc != null) {
                                i = R.id.ucp_orders_topbar;
                                View viewLIZ = C1616006Uk.LIZ(R.id.ucp_orders_topbar, viewTd);
                                if (viewLIZ != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                                    C0DC6 c0dc6 = new C0DC6(constraintLayout, tuxTextView, linearLayout, textView, recyclerView, c481090Itn, c1749280vcc, C0DC5.LIZ(viewLIZ));
                                    constraintLayout.setLayoutDirection(3);
                                    constraintLayout.setTextDirection(5);
                                    this.LL = c0dc6;
                                    try {
                                        ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                                        ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                                        constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                        C19EG activity = getActivity();
                                        if (activity instanceof C19GS) {
                                            c19gs = (C19GS) activity;
                                        } else {
                                            c19gs = null;
                                        }
                                        C1685300txQ.LIZ(c19gs);
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                        return constraintLayout;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                        return constraintLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
