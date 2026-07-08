package com.bytedance.android.livesdk.adminsetting.comment.filter;

import X.C01C5;
import X.C01GW;
import X.C0IJT;
import X.C0KXJ;
import X.C1119170fEJ;
import X.C1119920fFW;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C23250099c;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C488010JBv;
import X.C488020JBw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521550Kcr;
import X.C635860Owq;
import X.C751260TdU;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFilterCommentSettingFragmentNew extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZiYjJCHELIOSI2JjFiLyY/PCA+ZwM6PiAKICMnLTcPJiI+LSs4GionPCwiLgkhKSIhLCEnBiA7";
    public final String LLJLLL;
    public final C01GW LLJZ;
    public C751260TdU LLJZIJLIL;
    public final C01GW LLL;
    public LinearLayout LLLF;
    public LinearLayout LLLFF;
    public View LLLFFI;
    public LiveIconView LLLFZ;
    public View LLLI;

    public LiveFilterCommentSettingFragmentNew() {
        this(null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842728));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public LiveFilterCommentSettingFragmentNew(String str) {
        this.LLJLLL = str;
        this.LLJZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 22));
        this.LLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 21));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        String string;
        String string2;
        super.onViewStateRestored(bundle);
        Room room = (Room) this.LLJZ.getValue();
        if (room != null) {
            room.getId();
        }
        boolean zBooleanValue = ((Boolean) this.LLL.getValue()).booleanValue();
        View view = getView();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("trigger")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("entry")) != null) {
            str = string2;
        }
        this.LLJZIJLIL = new C751260TdU(zBooleanValue, view, string, str, C475510Ikn.LJ(this), this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C488010JBv(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View viewFindViewById;
        LiveIconView liveIconView;
        View viewFindViewById2;
        String str;
        UserAttr userAttrLIZ;
        Map<Integer, Integer> map;
        Integer num;
        String string;
        LinearLayout linearLayout3;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            view2.findViewById(R.id.ni2);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.findViewById(R.id.ngk);
        }
        View view4 = getView();
        TextView textView = null;
        if (view4 != null) {
            linearLayout = (LinearLayout) view4.findViewById(R.id.nc0);
        } else {
            linearLayout = null;
        }
        this.LLLF = linearLayout;
        View view5 = getView();
        if (view5 != null) {
            linearLayout2 = (LinearLayout) view5.findViewById(R.id.nh3);
        } else {
            linearLayout2 = null;
        }
        this.LLLFF = linearLayout2;
        View view6 = getView();
        if (view6 != null) {
            viewFindViewById = view6.findViewById(R.id.nh4);
        } else {
            viewFindViewById = null;
        }
        this.LLLFFI = viewFindViewById;
        View view7 = getView();
        if (view7 != null) {
            liveIconView = (LiveIconView) view7.findViewById(R.id.k16);
        } else {
            liveIconView = null;
        }
        this.LLLFZ = liveIconView;
        View view8 = getView();
        if (view8 != null) {
            view8.findViewById(R.id.nsj);
        }
        View view9 = getView();
        if (view9 != null) {
            view9.findViewById(R.id.mi5);
        }
        View view10 = getView();
        if (view10 != null) {
            view10.findViewById(R.id.mi4);
        }
        View view11 = getView();
        if (view11 != null) {
            view11.findViewById(R.id.mi3);
        }
        View view12 = getView();
        if (view12 != null) {
            viewFindViewById2 = view12.findViewById(R.id.bmy);
        } else {
            viewFindViewById2 = null;
        }
        this.LLLI = viewFindViewById2;
        View view13 = getView();
        if (view13 != null) {
            textView = (TextView) view13.findViewById(R.id.tv_show_in_feed_hint);
        }
        if (textView != null) {
            String str2 = "";
            String strLJIJJ = C497740JfY.LJIJJ(2131834612, "");
            if (strLJIJJ == null) {
                strLJIJJ = "";
            }
            String strLJIJI = C497740JfY.LJIJI(2131834613);
            if (strLJIJI != null) {
                str2 = strLJIJI;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJJ);
            sbLIZ.append(str2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C1119920fFW.LJ(getContext(), spannableString, 0, strLJIJJ.length(), 17, 8, 400);
            C1119920fFW.LJ(getContext(), spannableString, strLJIJJ.length(), spannableString.length(), 17, 8, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex5, getContext())), 0, spannableString.length(), 17);
            C786410Ut5.p2(spannableString, new C521550Kcr(this, 1), strLJIJJ.length(), spannableString.length(), 17);
            textView.setText(spannableString);
            textView.setLinksClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
        if (this.LLJL != null) {
            C500260Jjc.LJIILIIL(view.findViewById(R.id.i69));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("entry")) != null && Intrinsics.LJFF(string, "autosuggest_comment_filter") && (linearLayout3 = this.LLLF) != null) {
            linearLayout3.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.c90, getContext()));
        }
        LiveIconView liveIconView2 = this.LLLFZ;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS142S0100000_7(this, 19));
        }
        LiveIconView liveIconView3 = this.LLLFZ;
        if (liveIconView3 != null) {
            C635860Owq.LIZ.LIZJ(5, liveIconView3);
        }
        View view14 = this.LLLI;
        if (view14 != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 2), view14);
        }
        if (C01C5.LIZ(C475510Ikn.LJ(this))) {
            LinearLayout linearLayout4 = this.LLLFF;
            if (linearLayout4 != null) {
                C500260Jjc.LJIILIIL(linearLayout4);
            }
            View view15 = this.LLLFFI;
            if (view15 != null) {
                C500260Jjc.LJIILIIL(view15);
            }
            if (C488020JBw.LIZ((Room) this.LLJZ.getValue()) && (userAttrLIZ = C0KXJ.LIZ()) != null && (map = userAttrLIZ.adminPermissions) != null && (num = map.get(14)) != null && num.intValue() == 1) {
                LinearLayout linearLayout5 = this.LLLFF;
                if (linearLayout5 != null) {
                    C500260Jjc.LLFFF(linearLayout5);
                }
                View view16 = this.LLLFFI;
                if (view16 != null) {
                    C500260Jjc.LLFFF(view16);
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_filter_comments_view");
        c474500IjALIZ.LJIL();
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fx9, viewGroup, false);
    }
}
