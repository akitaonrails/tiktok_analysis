package com.bytedance.android.livesdk.sheet;

import X.C011Z;
import X.C092O;
import X.C0WZX;
import X.C1119920fFW;
import X.C1697810uHb;
import X.C16FS;
import X.C20743716Ff;
import X.C21532619Oq;
import X.C2204961BRm;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C513200KAs;
import X.C786410Ut5;
import X.C933010aO3;
import X.C933070aO9;
import X.C933100aOC;
import X.C933130aOF;
import X.C933150aOH;
import X.C935250aRf;
import X.C935260aRg;
import X.C935270aRh;
import X.InterfaceC1106030et7;
import X.InterfaceC933880aPS;
import Y.ACListenerS133S0200000_31;
import Y.ACListenerS148S0100000_13;
import Y.ACListenerS162S0100000_28;
import Y.ACListenerS165S0100000_31;
import Y.ACListenerS41S0210000_12;
import Y.ACListenerS89S1100000_28;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public class SheetDemoFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/HELIOSLSR9Oy0pLDt9Gy0pLDsXLSgjDz0yLygpJzs=";
    public C21532619Oq LLJLLL;
    public C21532619Oq LLJZ;
    public C21532619Oq LLJZIJLIL;
    public LiveEditText LLL;
    public LiveIconView LLLF;
    public LinearLayout LLLFF;
    public C21532619Oq LLLFFI;
    public LiveEditText LLLFZ;
    public LiveIconView LLLI;
    public LiveEditText LLLII;
    public LiveIconView LLLIIII;
    public C21532619Oq LLLIIIIL;
    public LiveEditText LLLIIIL;
    public LiveIconView LLLIIL;
    public C21532619Oq LLLIILIL;
    public LiveEditText LLLIL;
    public LiveIconView LLLILZ;
    public C16FS LLLILZJ;
    public LiveEditText LLLILZLLLI;
    public LiveIconView LLLIZZ;
    public C16FS LLLJ;
    public C16FS LLLJIL;
    public C16FS LLLJL;
    public C16FS LLLL;
    public C16FS LLLLII;
    public C16FS LLLLIIIILLL;
    public C16FS LLLLIIL;
    public C16FS LLLLIILL;
    public LiveEditText LLLLIILLL;
    public LiveIconView LLLLIL;
    public LinearLayout LLLLILI;
    public C21532619Oq LLLLJ;
    public C16FS LLLLJI;
    public LinearLayout LLLLL;
    public LiveEditText LLLLLIL;
    public LiveIconView LLLLLILLIL;
    public LinearLayout LLLLLJIL;
    public C21532619Oq LLLLLJLJLL;
    public C16FS LLLLLL;
    public LinearLayout LLLLLLIL;
    public LiveEditText LLLLLLJ;
    public LiveIconView LLLLLLL;
    public C16FS LLLLLLLLL;
    public C16FS LLLLLLLLLL;
    public LinearLayout LLLLLLLZIL;
    public LinearLayout LLLLLLZ;
    public C20743716Ff LLLLLLZZ;
    public C20743716Ff LLLLLZ;
    public C20743716Ff LLLLLZIL;
    public C20743716Ff LLLLLZL;
    public C20743716Ff LLLLZ;
    public C20743716Ff LLLLZI;
    public C20743716Ff LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public int LLLLZLLIL = -1;
    public final ArrayList<TextIconItem> LLLZI = new ArrayList<>();
    public final ArrayList<TextIconItem> LLLZIIL = new ArrayList<>();
    public final ArrayList<TextIconItem> LLLZIL = new ArrayList<>();

    public void clearFromXmlViewCache() {
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = null;
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = null;
        this.LLLLIILL = null;
        this.LLLLIILLL = null;
        this.LLLLIL = null;
        this.LLLLILI = null;
        this.LLLLJ = null;
        this.LLLLJI = null;
        this.LLLLL = null;
        this.LLLLLIL = null;
        this.LLLLLILLIL = null;
        this.LLLLLJIL = null;
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
        this.LLLLLLIL = null;
        this.LLLLLLJ = null;
        this.LLLLLLL = null;
        this.LLLLLLLLL = null;
        this.LLLLLLLLLL = null;
        this.LLLLLLLZIL = null;
        this.LLLLLLZ = null;
        this.LLLLLLZZ = null;
        this.LLLLLZ = null;
        this.LLLLLZIL = null;
        this.LLLLLZL = null;
        this.LLLLZ = null;
        this.LLLLZI = null;
        this.LLLLZIL = null;
    }

    public final Bundle ES() {
        Bundle bundle = new Bundle();
        View viewFindViewById = this.LLLLLZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.v9w) : null;
            this.LLLLLZIL = (C20743716Ff) viewFindViewById;
        }
        bundle.putBoolean("show_back_icon", ((CompoundButton) viewFindViewById).isChecked());
        View viewFindViewById2 = this.LLLLLZL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.v_3) : null;
            this.LLLLLZL = (C20743716Ff) viewFindViewById2;
        }
        bundle.putBoolean("show_close_icon", ((CompoundButton) viewFindViewById2).isChecked());
        View viewFindViewById3 = this.LLLLZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.ffm) : null;
            this.LLLLZ = (C20743716Ff) viewFindViewById3;
        }
        bundle.putBoolean("dark_theme", ((CompoundButton) viewFindViewById3).isChecked());
        View viewFindViewById4 = this.LLJZ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            viewFindViewById4 = view4 != null ? view4.findViewById(R.id.cdl) : null;
            this.LLJZ = (C21532619Oq) viewFindViewById4;
        }
        Object tag = viewFindViewById4.getTag();
        bundle.putInt("bottom_function_style", Intrinsics.LJFF(tag, Integer.valueOf(R.id.cdj)) ? 0 : Intrinsics.LJFF(tag, Integer.valueOf(R.id.cdk)) ? 1 : -1);
        View viewFindViewById5 = this.LLJZIJLIL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            viewFindViewById5 = view5 != null ? view5.findViewById(R.id.jj7) : null;
            this.LLJZIJLIL = (C21532619Oq) viewFindViewById5;
        }
        Object tag2 = viewFindViewById5.getTag();
        bundle.putInt("header_function_type", Intrinsics.LJFF(tag2, Integer.valueOf(R.id.jj5)) ? 1 : Intrinsics.LJFF(tag2, Integer.valueOf(R.id.jj6)) ? 2 : 0);
        View viewFindViewById6 = this.LLLLZI;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            viewFindViewById6 = view6 != null ? view6.findViewById(R.id.v9x) : null;
            this.LLLLZI = (C20743716Ff) viewFindViewById6;
        }
        bundle.putBoolean("bottom_function_visible_when_keyboard_show", ((CompoundButton) viewFindViewById6).isChecked());
        C786410Ut5.LJJJI("title", String.valueOf(C2204961BRm.LLLFZ(eT(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+CJ3BkpTmROkVZc0Yf6clHtkSTh04Yk=", null))), bundle);
        C786410Ut5.LJJJI("subtitle", String.valueOf(C2204961BRm.LLLFZ(VS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+CJ3BkpTmROkVZc0Yf6clHtkSTh04Yk=", null))), bundle);
        C786410Ut5.LJJIL(bundle, "tab_items", this.LLLZI);
        C786410Ut5.LJJJI("start_text", String.valueOf(C2204961BRm.LLLFZ(US(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+CJ3BkpTmROkVZc0Yf6clHtkSTh04Yk=", null))), bundle);
        C786410Ut5.LJJJI("end_text", String.valueOf(C2204961BRm.LLLFZ(GS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+CJ3BkpTmROkVZc0Yf6clHtkSTh04Yk=", null))), bundle);
        C786410Ut5.LJJIL(bundle, "start_icon_items", this.LLLZIIL);
        C786410Ut5.LJJIL(bundle, "end_icon_items", this.LLLZIL);
        View view7 = this.LLLLZIL;
        if (view7 == null) {
            View view8 = getView();
            View viewFindViewById7 = view8 != null ? view8.findViewById(R.id.uqi) : null;
            this.LLLLZIL = (C20743716Ff) viewFindViewById7;
            view7 = viewFindViewById7;
        }
        bundle.putBoolean("showSeparator", ((CompoundButton) view7).isChecked());
        return bundle;
    }

    public final C21532619Oq FS() {
        View viewFindViewById = this.LLLLLJLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h4u) : null;
            this.LLLLLJLJLL = (C21532619Oq) viewFindViewById;
        }
        return (C21532619Oq) viewFindViewById;
    }

    public final LiveEditText GS() {
        View viewFindViewById = this.LLLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h56) : null;
            this.LLLLLIL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final C21532619Oq HS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jld) : null;
            this.LLJLLL = (C21532619Oq) viewFindViewById;
        }
        return (C21532619Oq) viewFindViewById;
    }

    public final LiveEditText JS() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nr1) : null;
            this.LLLILZLLLI = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final SheetOptions NS() {
        SheetOptions sheetOptions = new SheetOptions();
        if (!Intrinsics.LJFF(HS().getTag(), -1)) {
            Object tag = HS().getTag();
            if (Intrinsics.LJFF(tag, Integer.valueOf(R.id.jlc))) {
                sheetOptions.LIZ(0, null);
            } else if (Intrinsics.LJFF(tag, Integer.valueOf(R.id.jlb))) {
                sheetOptions.LIZ(1, null);
            }
        }
        View viewFindViewById = this.LLLLLLZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ios) : null;
            this.LLLLLLZZ = (C20743716Ff) viewFindViewById;
        }
        sheetOptions.fullscreenEnabled = ((CompoundButton) viewFindViewById).isChecked();
        View view2 = this.LLLLLZ;
        if (view2 == null) {
            View view3 = getView();
            View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.id2) : null;
            this.LLLLLZ = (C20743716Ff) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        sheetOptions.isHeaderFloating = ((CompoundButton) view2).isChecked();
        return sheetOptions;
    }

    public final LiveEditText PS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u1j) : null;
            this.LLLIL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final LiveEditText QS() {
        View viewFindViewById = this.LLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vsb) : null;
            this.LLLII = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final C21532619Oq RS() {
        View viewFindViewById = this.LLLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vyp) : null;
            this.LLLLJ = (C21532619Oq) viewFindViewById;
        }
        return (C21532619Oq) viewFindViewById;
    }

    public final LiveEditText US() {
        View viewFindViewById = this.LLLLIILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vzm) : null;
            this.LLLLIILLL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final LiveEditText VS() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wm8) : null;
            this.LLLFZ = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final C21532619Oq XS() {
        View viewFindViewById = this.LLLFFI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wy9) : null;
            this.LLLFFI = (C21532619Oq) viewFindViewById;
        }
        return (C21532619Oq) viewFindViewById;
    }

    public final LinearLayout YS() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.x0m) : null;
            this.LLLFF = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LiveEditText ZS() {
        View viewFindViewById = this.LLLLLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.x0o) : null;
            this.LLLLLLJ = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return !this.LLLLZLLLI ? 1 : 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        int i = this.LLLLZLLIL;
        if (i == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "By creating a TikTok Promote you agree to TikTok's ");
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, 0, spannableStringBuilder.length(), 33, 400);
            spannableStringBuilder.append((CharSequence) "Terms");
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - 5, spannableStringBuilder.length(), 33, 500);
            spannableStringBuilder.append((CharSequence) " and ");
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - 5, spannableStringBuilder.length(), 33, 400);
            spannableStringBuilder.append((CharSequence) "Advertising Terms of Service");
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - 28, spannableStringBuilder.length(), 33, 500);
            c500060JjI.LIZIZ = spannableStringBuilder;
            c500060JjI.LIZJ = 0;
            c500060JjI.LIZ(C1697810uHb.LJIIJJI(new C510160Jza("Learn more", R.style.a82, new C092O() { // from class: X.14x2
                @Override // X.C092O
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), new C510160Jza("Turn on", R.style.a7b, new C092O() { // from class: X.14x3
                @Override // X.C092O
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            })));
        } else if (i == 1) {
            c500060JjI.LIZJ = 1;
            c500060JjI.LIZ(C1697810uHb.LJIIJJI(new C510160Jza("Button", R.style.a7b, new C092O() { // from class: X.14x4
                @Override // X.C092O
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), new C510160Jza("Not interested", R.style.a7c, new C092O() { // from class: X.14x5
                @Override // X.C092O
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            })));
        }
        return this.LLJJIJI;
    }

    public final LiveEditText eT() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y1b) : null;
            this.LLL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public boolean fT() {
        return !this.LLLZ;
    }

    public final void gT() {
        if (this.LLLZIL.isEmpty()) {
            View view = this.LLLLLLIL;
            if (view == null) {
                View view2 = getView();
                View viewFindViewById = view2 != null ? view2.findViewById(R.id.h57) : null;
                this.LLLLLLIL = (LinearLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJZL(0, (LinearLayout) view);
            return;
        }
        View viewFindViewById2 = this.LLLLLLIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            viewFindViewById2 = view3 != null ? view3.findViewById(R.id.h57) : null;
            this.LLLLLLIL = (LinearLayout) viewFindViewById2;
        }
        C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById2);
        GS().setText((CharSequence) null);
    }

    public final void hT() {
        if (this.LLLZIIL.isEmpty()) {
            View view = this.LLLLL;
            if (view == null) {
                View view2 = getView();
                View viewFindViewById = view2 != null ? view2.findViewById(R.id.vzn) : null;
                this.LLLLL = (LinearLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJZL(0, (LinearLayout) view);
            return;
        }
        View viewFindViewById2 = this.LLLLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            viewFindViewById2 = view3 != null ? view3.findViewById(R.id.vzn) : null;
            this.LLLLL = (LinearLayout) viewFindViewById2;
        }
        C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById2);
        US().setText((CharSequence) null);
    }

    public final void iT() {
        if (this.LLLZI.isEmpty()) {
            View viewFindViewById = this.LLLLLLLZIL;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.y1z) : null;
                this.LLLLLLLZIL = (LinearLayout) viewFindViewById;
            }
            C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById);
            View view2 = this.LLLLLLZ;
            if (view2 == null) {
                View view3 = getView();
                View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.wme) : null;
                this.LLLLLLZ = (LinearLayout) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C786410Ut5.LJZL(0, (LinearLayout) view2);
            return;
        }
        View viewFindViewById3 = this.LLLLLLLZIL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            viewFindViewById3 = view4 != null ? view4.findViewById(R.id.y1z) : null;
            this.LLLLLLLZIL = (LinearLayout) viewFindViewById3;
        }
        C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById3);
        View viewFindViewById4 = this.LLLLLLZ;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            viewFindViewById4 = view5 != null ? view5.findViewById(R.id.wme) : null;
            this.LLLLLLZ = (LinearLayout) viewFindViewById4;
        }
        C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById4);
        eT().setText((CharSequence) null);
        VS().setText((CharSequence) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1119170fEJ gS() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.sheet.SheetDemoFragment.gS():X.0fEJ");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        if (this.LLLLZLL) {
            return C011Z.LIZ.LJ();
        }
        return C513200KAs.LIZ(context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final boolean isLight(Context context) {
        return !this.LLLLZLL;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            arguments.getBoolean("show_back_icon", true);
            arguments.getBoolean("show_close_icon", false);
            this.LLLLZLL = arguments.getBoolean("dark_theme", false);
            this.LLLLZLLIL = arguments.getInt("bottom_function_style", -1);
            this.LLLLZLLLI = arguments.getBoolean("bottom_function_visible_when_keyboard_show", false);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (parcelableArrayList = arguments2.getParcelableArrayList("tab_items")) == null || parcelableArrayList.isEmpty()) {
            z = true;
        }
        this.LLLZ = !z;
    }

    public final void zS(final Function2<? super Integer, ? super String, Unit> function2) {
        C935250aRf c935250aRf = new C935250aRf();
        C933010aO3 c933010aO3 = new C933010aO3();
        c933010aO3.LIZ(R.raw.icon_chevron_left_offset_ltr, requireContext());
        c933010aO3.LIZ = "Back";
        c933010aO3.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRp
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_chevron_left_offset_ltr), "Back");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO3));
        C933010aO3 c933010aO32 = new C933010aO3();
        c933010aO32.LIZ(R.raw.icon_x_mark_small, requireContext());
        c933010aO32.LIZ = "Close";
        c933010aO32.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRw
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_x_mark_small), "Close");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO32));
        C933010aO3 c933010aO33 = new C933010aO3();
        c933010aO33.LIZ(R.raw.icon_bookmark, requireContext());
        c933010aO33.LIZ = "Bookmark";
        c933010aO33.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRv
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_bookmark), "Bookmark");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO33));
        C933010aO3 c933010aO34 = new C933010aO3();
        c933010aO34.LIZ(R.raw.icon_paperplane, requireContext());
        c933010aO34.LIZ = "Paperplane";
        c933010aO34.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRq
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_paperplane), "Paperplane");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO34));
        C933010aO3 c933010aO35 = new C933010aO3();
        c933010aO35.LIZ(R.raw.icon_house_play, requireContext());
        c933010aO35.LIZ = "House play";
        c933010aO35.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRr
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_house_play), "House play");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO35));
        C933010aO3 c933010aO36 = new C933010aO3();
        c933010aO36.LIZ(R.raw.icon_star_ring, requireContext());
        c933010aO36.LIZ = "Star ring";
        c933010aO36.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRs
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_star_ring), "Star ring");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO36));
        C933010aO3 c933010aO37 = new C933010aO3();
        c933010aO37.LIZ(R.raw.icon_heart, requireContext());
        c933010aO37.LIZ = "Heart";
        c933010aO37.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRt
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_heart), "Heart");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO37));
        C933010aO3 c933010aO38 = new C933010aO3();
        c933010aO38.LIZ(R.raw.icon_misc, requireContext());
        c933010aO38.LIZ = "Misc";
        c933010aO38.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRn
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_misc), "Misc");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO38));
        C933010aO3 c933010aO39 = new C933010aO3();
        c933010aO39.LIZ(R.raw.icon_magnifying_glass, requireContext());
        c933010aO39.LIZ = "Magnifying glass";
        c933010aO39.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRu
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_magnifying_glass), "Magnifying glass");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO39));
        C933010aO3 c933010aO310 = new C933010aO3();
        c933010aO310.LIZ(R.raw.icon_live, requireContext());
        c933010aO310.LIZ = "LIVE";
        c933010aO310.LIZJ = new InterfaceC933880aPS() { // from class: X.0XRo
            @Override // X.InterfaceC933880aPS
            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                function2.invoke(Integer.valueOf(R.raw.icon_live), "LIVE");
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
        };
        c935250aRf.LIZ(new C933070aO9(c933010aO310));
        C935260aRg c935260aRg = new C935260aRg(c935250aRf);
        C935270aRh c935270aRh = new C935270aRh(requireContext());
        if (!TextUtils.isEmpty("Cancel")) {
            C933100aOC c933100aOC = new C933100aOC();
            c933100aOC.LIZ = "Cancel";
            c935270aRh.LIZLLL = new C933150aOH(c933100aOC);
        }
        List<C933130aOF> list = c935260aRg.LIZIZ;
        if (list != null && !list.isEmpty()) {
            ((ArrayList) c935270aRh.LIZJ).add(c935260aRg);
        }
        C786410Ut5.F4(c935270aRh.LIZ());
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (fT()) {
            C21532619Oq c21532619OqHS = HS();
            getClass();
            wS(c21532619OqHS, true, null);
            View viewFindViewById = this.LLJZ;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.cdl);
                } else {
                    viewFindViewById = null;
                }
                this.LLJZ = (C21532619Oq) viewFindViewById;
            }
            getClass();
            wS((C21532619Oq) viewFindViewById, false, null);
            View viewFindViewById3 = this.LLJZIJLIL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.jj7);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJZIJLIL = (C21532619Oq) viewFindViewById3;
            }
            getClass();
            wS((C21532619Oq) viewFindViewById3, false, null);
            LiveEditText liveEditTextET = eT();
            View viewFindViewById4 = this.LLLF;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.y0o);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLLF = (LiveIconView) viewFindViewById4;
            }
            uS(liveEditTextET, (LiveIconView) viewFindViewById4, new AwS610S0100000_31(this, 104));
            LiveEditText liveEditTextVS = VS();
            View viewFindViewById5 = this.LLLI;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.wm2);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLLI = (LiveIconView) viewFindViewById5;
            }
            uS(liveEditTextVS, (LiveIconView) viewFindViewById5, new AwS610S0100000_31(this, 105));
            LiveEditText liveEditTextZS = ZS();
            View viewFindViewById6 = this.LLLLLLL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.x0n);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLLLLLL = (LiveIconView) viewFindViewById6;
            }
            uS(liveEditTextZS, (LiveIconView) viewFindViewById6, null);
            View viewFindViewById7 = this.LLLLLLLLL;
            if (viewFindViewById7 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById7 = view7.findViewById(R.id.x0p);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLLLLLLLL = (C16FS) viewFindViewById7;
            }
            C786410Ut5.h8((C16FS) viewFindViewById7, new ACListenerS165S0100000_31(this, 187));
            C21532619Oq c21532619OqXS = XS();
            GradientDrawable gradientDrawable = new GradientDrawable();
            int iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
            gradientDrawable.setSize(iLIZIZ, iLIZIZ);
            c21532619OqXS.setDividerDrawable(gradientDrawable);
            View viewFindViewById8 = this.LLLLLLLLLL;
            if (viewFindViewById8 == null) {
                View view8 = getView();
                if (view8 != null) {
                    viewFindViewById8 = view8.findViewById(R.id.x0l);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLLLLLLLLL = (C16FS) viewFindViewById8;
            }
            C786410Ut5.h8((C16FS) viewFindViewById8, new ACListenerS165S0100000_31(this, 188));
            LiveEditText liveEditTextUS = US();
            View viewFindViewById9 = this.LLLLIL;
            if (viewFindViewById9 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById9 = view9.findViewById(R.id.vzl);
                } else {
                    viewFindViewById9 = null;
                }
                this.LLLLIL = (LiveIconView) viewFindViewById9;
            }
            uS(liveEditTextUS, (LiveIconView) viewFindViewById9, new AwS592S0100000_13(this, 78));
            C21532619Oq c21532619OqRS = RS();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(4.0f);
            gradientDrawable2.setSize(iLIZIZ2, iLIZIZ2);
            c21532619OqRS.setDividerDrawable(gradientDrawable2);
            View viewFindViewById10 = this.LLLLJI;
            if (viewFindViewById10 == null) {
                View view10 = getView();
                if (view10 != null) {
                    viewFindViewById10 = view10.findViewById(R.id.vyn);
                } else {
                    viewFindViewById10 = null;
                }
                this.LLLLJI = (C16FS) viewFindViewById10;
            }
            C786410Ut5.h8((C16FS) viewFindViewById10, new ACListenerS148S0100000_13(this, 43));
            LiveEditText liveEditTextGS = GS();
            View viewFindViewById11 = this.LLLLLILLIL;
            if (viewFindViewById11 == null) {
                View view11 = getView();
                if (view11 != null) {
                    viewFindViewById11 = view11.findViewById(R.id.h54);
                } else {
                    viewFindViewById11 = null;
                }
                this.LLLLLILLIL = (LiveIconView) viewFindViewById11;
            }
            uS(liveEditTextGS, (LiveIconView) viewFindViewById11, new AwS592S0100000_13(this, 77));
            C21532619Oq c21532619OqFS = FS();
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            int iLIZIZ3 = (int) C497740JfY.LIZIZ(4.0f);
            gradientDrawable3.setSize(iLIZIZ3, iLIZIZ3);
            c21532619OqFS.setDividerDrawable(gradientDrawable3);
            View viewFindViewById12 = this.LLLLLL;
            if (viewFindViewById12 == null) {
                View view12 = getView();
                if (view12 != null) {
                    viewFindViewById12 = view12.findViewById(R.id.h4r);
                } else {
                    viewFindViewById12 = null;
                }
                this.LLLLLL = (C16FS) viewFindViewById12;
            }
            C786410Ut5.h8((C16FS) viewFindViewById12, new ACListenerS148S0100000_13(this, 42));
            LiveEditText liveEditTextQS = QS();
            View viewFindViewById13 = this.LLLIIII;
            if (viewFindViewById13 == null) {
                View view13 = getView();
                if (view13 != null) {
                    viewFindViewById13 = view13.findViewById(R.id.vsa);
                } else {
                    viewFindViewById13 = null;
                }
                this.LLLIIII = (LiveIconView) viewFindViewById13;
            }
            uS(liveEditTextQS, (LiveIconView) viewFindViewById13, null);
            View viewFindViewById14 = this.LLLIIIIL;
            if (viewFindViewById14 == null) {
                View view14 = getView();
                if (view14 != null) {
                    viewFindViewById14 = view14.findViewById(R.id.vsc);
                } else {
                    viewFindViewById14 = null;
                }
                this.LLLIIIIL = (C21532619Oq) viewFindViewById14;
            }
            wS((C21532619Oq) viewFindViewById14, true, new AwS610S0100000_31(this, 106));
            View viewFindViewById15 = this.LLLIIIL;
            if (viewFindViewById15 == null) {
                View view15 = getView();
                if (view15 != null) {
                    viewFindViewById15 = view15.findViewById(R.id.vsh);
                } else {
                    viewFindViewById15 = null;
                }
                this.LLLIIIL = (LiveEditText) viewFindViewById15;
            }
            LiveEditText liveEditText = (LiveEditText) viewFindViewById15;
            View viewFindViewById16 = this.LLLIIL;
            if (viewFindViewById16 == null) {
                View view16 = getView();
                if (view16 != null) {
                    viewFindViewById16 = view16.findViewById(R.id.vsg);
                } else {
                    viewFindViewById16 = null;
                }
                this.LLLIIL = (LiveIconView) viewFindViewById16;
            }
            uS(liveEditText, (LiveIconView) viewFindViewById16, null);
            View viewFindViewById17 = this.LLLIILIL;
            if (viewFindViewById17 == null) {
                View view17 = getView();
                if (view17 != null) {
                    viewFindViewById17 = view17.findViewById(R.id.vsi);
                } else {
                    viewFindViewById17 = null;
                }
                this.LLLIILIL = (C21532619Oq) viewFindViewById17;
            }
            wS((C21532619Oq) viewFindViewById17, true, new AwS610S0100000_31(this, 107));
            LiveEditText liveEditTextPS = PS();
            View viewFindViewById18 = this.LLLILZ;
            if (viewFindViewById18 == null) {
                View view18 = getView();
                if (view18 != null) {
                    viewFindViewById18 = view18.findViewById(R.id.u1i);
                } else {
                    viewFindViewById18 = null;
                }
                this.LLLILZ = (LiveIconView) viewFindViewById18;
            }
            uS(liveEditTextPS, (LiveIconView) viewFindViewById18, null);
            String strLIZIZ = InterfaceC1106030et7.n7.LIZIZ();
            if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ)) {
                PS().setText(strLIZIZ);
                PS().setSelection(strLIZIZ.length());
            }
            View viewFindViewById19 = this.LLLILZJ;
            if (viewFindViewById19 == null) {
                View view19 = getView();
                if (view19 != null) {
                    viewFindViewById19 = view19.findViewById(R.id.u1k);
                } else {
                    viewFindViewById19 = null;
                }
                this.LLLILZJ = (C16FS) viewFindViewById19;
            }
            C786410Ut5.h8((C16FS) viewFindViewById19, new ACListenerS165S0100000_31(this, 51));
            LiveEditText liveEditTextJS = JS();
            View viewFindViewById20 = this.LLLIZZ;
            if (viewFindViewById20 == null) {
                View view20 = getView();
                if (view20 != null) {
                    viewFindViewById20 = view20.findViewById(R.id.nr0);
                } else {
                    viewFindViewById20 = null;
                }
                this.LLLIZZ = (LiveIconView) viewFindViewById20;
            }
            uS(liveEditTextJS, (LiveIconView) viewFindViewById20, null);
            View viewFindViewById21 = this.LLLJ;
            if (viewFindViewById21 == null) {
                View view21 = getView();
                if (view21 != null) {
                    viewFindViewById21 = view21.findViewById(R.id.pwk);
                } else {
                    viewFindViewById21 = null;
                }
                this.LLLJ = (C16FS) viewFindViewById21;
            }
            C786410Ut5.h8((C16FS) viewFindViewById21, new ACListenerS133S0200000_31(view, this, 5));
            View viewFindViewById22 = this.LLLJIL;
            if (viewFindViewById22 == null) {
                View view22 = getView();
                if (view22 != null) {
                    viewFindViewById22 = view22.findViewById(R.id.p3k);
                } else {
                    viewFindViewById22 = null;
                }
                this.LLLJIL = (C16FS) viewFindViewById22;
            }
            C786410Ut5.h8((C16FS) viewFindViewById22, new ACListenerS133S0200000_31(view, this, 6));
            String strValueOf = String.valueOf(C2204961BRm.LLLFZ(QS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+CJ3BkpTmROkVZc0Yf6clHtkSTh04Yk=", null)));
            if (a0.LJJJIL(strValueOf)) {
                strValueOf = "";
            }
            View viewFindViewById23 = this.LLLJL;
            if (viewFindViewById23 == null) {
                View view23 = getView();
                if (view23 != null) {
                    viewFindViewById23 = view23.findViewById(R.id.vsl);
                } else {
                    viewFindViewById23 = null;
                }
                this.LLLJL = (C16FS) viewFindViewById23;
            }
            C786410Ut5.h8((C16FS) viewFindViewById23, new ACListenerS89S1100000_28(this, strValueOf, 0));
            View viewFindViewById24 = this.LLLL;
            if (viewFindViewById24 == null) {
                View view24 = getView();
                if (view24 != null) {
                    viewFindViewById24 = view24.findViewById(R.id.vsd);
                } else {
                    viewFindViewById24 = null;
                }
                this.LLLL = (C16FS) viewFindViewById24;
            }
            C786410Ut5.h8((C16FS) viewFindViewById24, new ACListenerS162S0100000_28(this, 14));
            View viewFindViewById25 = this.LLLLII;
            if (viewFindViewById25 == null) {
                View view25 = getView();
                if (view25 != null) {
                    viewFindViewById25 = view25.findViewById(R.id.vsk);
                } else {
                    viewFindViewById25 = null;
                }
                this.LLLLII = (C16FS) viewFindViewById25;
            }
            C786410Ut5.h8((C16FS) viewFindViewById25, new ACListenerS162S0100000_28(this, 15));
            View viewFindViewById26 = this.LLLLIIIILLL;
            if (viewFindViewById26 == null) {
                View view26 = getView();
                if (view26 != null) {
                    viewFindViewById26 = view26.findViewById(R.id.vsj);
                } else {
                    viewFindViewById26 = null;
                }
                this.LLLLIIIILLL = (C16FS) viewFindViewById26;
            }
            C786410Ut5.h8((C16FS) viewFindViewById26, new ACListenerS162S0100000_28(this, 16));
            View viewFindViewById27 = this.LLLLIIL;
            if (viewFindViewById27 == null) {
                View view27 = getView();
                if (view27 != null) {
                    viewFindViewById27 = view27.findViewById(R.id.nqz);
                } else {
                    viewFindViewById27 = null;
                }
                this.LLLLIIL = (C16FS) viewFindViewById27;
            }
            C786410Ut5.h8((C16FS) viewFindViewById27, new ACListenerS133S0200000_31(view, this, 7));
            View view28 = this.LLLLIILL;
            if (view28 == null) {
                View view29 = getView();
                if (view29 != null) {
                    viewFindViewById2 = view29.findViewById(R.id.nqy);
                }
                this.LLLLIILL = (C16FS) viewFindViewById2;
                view28 = viewFindViewById2;
            }
            C786410Ut5.h8((C16FS) view28, new ACListenerS133S0200000_31(view, this, 8));
        }
    }

    public static void uS(LiveEditText liveEditText, final LiveIconView liveIconView, final Function1 function1) {
        liveEditText.addTextChangedListener(new TextWatcher() { // from class: X.01Ep
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View view = liveIconView;
                int i4 = 0;
                if (charSequence == null || a0.LJJJIL(charSequence)) {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, view);
                Function1<CharSequence, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(charSequence);
                }
            }
        });
        C786410Ut5.I7(new ACListenerS148S0100000_13(liveEditText, 41), liveIconView);
    }

    public static void wS(C21532619Oq c21532619Oq, boolean z, Function1 function1) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
        gradientDrawable.setSize(iLIZIZ, iLIZIZ);
        c21532619Oq.setDividerDrawable(gradientDrawable);
        int childCount = c21532619Oq.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C786410Ut5.I7(new ACListenerS41S0210000_12(function1, c21532619Oq, z, 1), c21532619Oq.getChildAt(i));
        }
    }

    public final View BS(final TextIconItem textIconItem, Function2<? super TextIconItem, ? super View, Unit> function2, final Function2<? super TextIconItem, ? super View, Unit> function22) {
        final View viewSd = C786410Ut5.Sd(R.layout.gvu, getLayoutInflater(), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.l45);
        LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.l2a);
        View viewFindViewById = viewSd.findViewById(R.id.fkv);
        String str = textIconItem.text;
        if (str != null) {
            textView.setText(str);
            C786410Ut5.LLIL(textView, 0);
        }
        Integer num = textIconItem.id;
        if (num != null) {
            liveIconView.setIcon(num.intValue());
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0W8o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function22.invoke(textIconItem, viewSd);
            }
        }, viewFindViewById);
        function2.invoke(textIconItem, viewSd);
        return viewSd;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.LLLZ) {
            return C786410Ut5.Td(layoutInflater, R.layout.c9u, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.d8l, viewGroup, false);
    }
}
