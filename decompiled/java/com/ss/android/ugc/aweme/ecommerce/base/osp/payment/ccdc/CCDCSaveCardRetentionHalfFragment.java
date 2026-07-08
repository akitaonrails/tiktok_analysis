package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C098200Yq;
import X.C0H1U;
import X.C0H9H;
import X.C0OM1;
import X.C1018703yb;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C890103dr;
import X.EnumC884003cs;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CashierSheetContent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ContentBlock;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCSaveCardRetentionHalfFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs8HELIOSKDY+LSs4ZywwLCZiCgwXCxYtPyoQKTcoGyonLSs4ICA9ACQgLwkhKSIhLCEn";
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public CashierSheetContent LLILZIL;
    public Function1<? super EnumC884003cs, Unit> LLILZLL;
    public boolean LLIZ;

    public final C197039127h MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tzc) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = "";
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_fill_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c1251150ifB.LIZIZ(c419910GdJ);
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1049));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Context context;
        List<DialogButton> list;
        DialogButton dialogButton;
        List<DialogButton> list2;
        DialogButton dialogButton2;
        List<ContentBlock> list3;
        String uri;
        int iIntValue;
        Image icon;
        super.onViewCreated(view, bundle);
        CashierSheetContent cashierSheetContent = this.LLILZIL;
        View viewFindViewById = null;
        if (cashierSheetContent != null) {
            str = cashierSheetContent.title;
        } else {
            str = null;
        }
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.tzd);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (TuxTextView) viewFindViewById2;
        }
        ((TextView) viewFindViewById2).setText(str);
        CashierSheetContent cashierSheetContent2 = this.LLILZIL;
        if (cashierSheetContent2 != null && (list3 = cashierSheetContent2.content) != null) {
            for (ContentBlock contentBlock : list3) {
                View viewFindViewById3 = this.LLILLJJLI;
                if (viewFindViewById3 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById3 = view3.findViewById(R.id.nc4);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLILLJJLI = (LinearLayout) viewFindViewById3;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
                Icon icon2 = contentBlock.prefixIcon;
                String str4 = "";
                if (icon2 == null || (icon = icon2.getIcon()) == null || (uri = icon.getUri()) == null) {
                    uri = "";
                }
                String str5 = contentBlock.text;
                if (str5 != null) {
                    str4 = str5;
                }
                LinearLayout linearLayout = new LinearLayout(getContext());
                SmartImageView smartImageView = new SmartImageView(linearLayout.getContext());
                C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
                smartImageView.setBackgroundColor(0);
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(uri);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LIZLLL);
                linearLayout.addView(smartImageView);
                TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2, 1.0f));
                tuxTextView.setText(str4);
                tuxTextView.setTuxFont(41);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, tuxTextView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                tuxTextView.setTextColor(iIntValue);
                C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), tuxTextView);
                C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), tuxTextView);
                tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxTextView.setGravity(16);
                linearLayout.addView(tuxTextView);
                viewGroup.addView(linearLayout);
            }
        }
        CashierSheetContent cashierSheetContent3 = this.LLILZIL;
        if (cashierSheetContent3 != null && (list2 = cashierSheetContent3.dialogButtons) != null && (dialogButton2 = (DialogButton) ListProtector.get(list2, 0)) != null) {
            str2 = dialogButton2.text;
        } else {
            str2 = null;
        }
        MR().setText(str2);
        CashierSheetContent cashierSheetContent4 = this.LLILZIL;
        if (cashierSheetContent4 != null && (list = cashierSheetContent4.dialogButtons) != null && (dialogButton = (DialogButton) ListProtector.get(list, 1)) != null) {
            str3 = dialogButton.text;
        } else {
            str3 = null;
        }
        View viewFindViewById4 = this.LLILZ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.pam);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById4;
        }
        ((TextView) viewFindViewById4).setText(str3);
        if (this.LLIZ && (context = getContext()) != null) {
            MR().LJJJJL(new AwS580S0100000_1(context, 599));
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 84), MR());
        View view5 = this.LLILZ;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.pam);
            }
            this.LLILZ = (TuxTextView) viewFindViewById;
            view5 = viewFindViewById;
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 86), view5);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("page_name")) == null) {
            string = "ccdc_card_info";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C890103dr.LIZ.getClass();
        linkedHashMap.putAll(C890103dr.LIZJ);
        linkedHashMap.put("page_name", string);
        linkedHashMap.put("popup_name", "save_this_card");
        linkedHashMap.put("option_type", "payment_type");
        C1018703yb.LIZIZ("tiktokec_popup_show", linkedHashMap);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aqb, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
