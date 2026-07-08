package com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode;

import X.C01GW;
import X.C06W0;
import X.C098200Yq;
import X.C0HTI;
import X.C11GO;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1685300txQ;
import X.C1767406w4;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1620106Vz;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS106S0200000_2;
import Y.AObserverS206S0100000_2;
import Y.ARunnableS102S0100000_2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS496S0200000_2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC836760Ws6
public final class CreatorCareModeNewDesignFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s4Jzx9KyohJCo9PDYtLyonMWsvOyHELIOSoyPCo+ZywyOiAhJis2ZgY+LC4nJzcPKD02BSooLAE2PwEpOiY0JgM+KCg+LSs4";
    public TuxNavBar LLIZ;
    public TuxTextView LLIZLLLIL;
    public ImageView LLJ;
    public C127K LLJI;
    public C127K LLJIJIL;
    public TuxTextView LLJILJIL;
    public C197039127h LLJILJILJ;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS229S0000000_2.get$arr$(548), "enter_scene", Integer.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS229S0000000_2.get$arr$(547), "enter_from", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS229S0000000_2.get$arr$(549), "is_folded", Boolean.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS229S0000000_2.get$arr$(550), "hide_filter_all", Boolean.class);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 902));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 904));

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("action", "quit");
        Boolean value = VR().LL.getValue();
        Boolean bool = Boolean.TRUE;
        pairArr[1] = new Pair("care_mode_status", Intrinsics.LJFF(value, bool) ? "on" : "off");
        pairArr[2] = new Pair("filter_all_status", Intrinsics.LJFF(VR().LLILLJJLI.getValue(), bool) ? "on" : "off");
        C20684815ws.LJIILLIIL("cmt_care_mode_page_click", C2097608Jq.LJIIIIZZ(pairArr));
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hgb) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C127K UR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hx8) : null;
            this.LLJIJIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final CreatorCareModeNewDesignViewModel VR() {
        return (CreatorCareModeNewDesignViewModel) this.LLJJIJIL.getValue();
    }

    public final boolean WR() {
        Boolean bool = (Boolean) this.LLJJI.getValue();
        return bool != null ? bool.booleanValue() : (this.LLJJIJI.getValue() == EnumC1620106Vz.FILTER_ALL_POPUP || this.LLJJIJI.getValue() == EnumC1620106Vz.FILTER_ALL_BANNER || this.LLJJIJI.getValue() == EnumC1620106Vz.FILTER_ALL_INBOX) ? false : true;
    }

    public final String getEnterMethod() {
        String str = (String) this.LLJJ.getValue();
        if (str != null) {
            return str;
        }
        EnumC1620106Vz enumC1620106Vz = (EnumC1620106Vz) this.LLJJIJI.getValue();
        if (enumC1620106Vz != null) {
            switch (C06W0.LIZ[enumC1620106Vz.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    return "filter_all_inbox";
                case 2:
                    return "filter_all_popup";
                case 3:
                    return "filter_all_banner";
                case 4:
                case 5:
                    return "delete";
                case 6:
                    return "dislike";
                case 7:
                    return "vul_creator_inbox";
                case 8:
                    return "vul_creator_banner";
                case BdTuring.TYPE_ECAF /* 9 */:
                    return "care_mode_on_banner";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return "report_submit";
                case BdTuring.TYPE_EMAIL /* 11 */:
                    return "old_inbox_schema";
            }
        }
        return "";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS229S0000000_2.get$arr$(551));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C11GO c11go;
        Object obj;
        C11GO c11go2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 903));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.LJIIZILJ(false);
        tuxNavBar.setNavBackground(0);
        View viewFindViewById3 = this.LLIZLLLIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.jkv);
            } else {
                viewFindViewById3 = null;
            }
            this.LLIZLLLIL = (TuxTextView) viewFindViewById3;
        }
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById3;
        tuxTextView.LJJJJI(24.0f);
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView, new ARunnableS102S0100000_2(tuxTextView, 39));
        View viewFindViewById4 = this.LLJ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.jjg);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJ = (ImageView) viewFindViewById4;
        }
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.wk;
        ((ImageView) viewFindViewById4).setImageDrawable(c0hti.LIZ(requireContext()));
        View viewFindViewById5 = this.LLJI;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.wtv);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJI = (C127K) viewFindViewById5;
        }
        C127K c127k = (C127K) viewFindViewById5;
        MutableLiveData<Boolean> mutableLiveData = VR().LL;
        C127M accessory = c127k.getAccessory();
        if ((accessory instanceof C127A) && (c11go2 = (C11GO) accessory) != null) {
            c11go2.LJIILLIIL(new C1767406w4(this, mutableLiveData, 1));
        }
        mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS206S0100000_2(c127k, 18));
        View viewFindViewById6 = this.LLJI;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.wtv);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJI = (C127K) viewFindViewById6;
        }
        ((C127K) viewFindViewById6).LJ(true, true);
        Object value = this.LLJJIII.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool)) {
            C127K c127kUR = UR();
            if (c127kUR != null) {
                C786410Ut5.LLZLL(c127kUR, 8);
            }
            TuxTextView tuxTextViewSR = SR();
            if (tuxTextViewSR != null) {
                C786410Ut5.LLLLZLL(tuxTextViewSR, 8);
            }
        } else {
            C127K c127kUR2 = UR();
            MutableLiveData<Boolean> mutableLiveData2 = VR().LLILLJJLI;
            C127M accessory2 = c127kUR2.getAccessory();
            if ((accessory2 instanceof C127A) && (c11go = (C11GO) accessory2) != null) {
                c11go.LJIILLIIL(new C1767406w4(this, mutableLiveData2, 2));
            }
            mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS206S0100000_2(c127kUR2, 19));
            UR().LJ(true, true);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("privacy_setting_filter_all_new_version", false)) {
                C127K c127kUR3 = UR();
                if (c127kUR3 != null) {
                    c127kUR3.setTitle(getString(2131829159));
                }
                C127K c127kUR4 = UR();
                if (c127kUR4 != null) {
                    c127kUR4.setSubtitle(getString(2131829046));
                }
            }
            if (WR()) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZ = R.raw.icon_chevron_down_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, SR().getContext());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(2131830111));
                spannableStringBuilder.append((CharSequence) "*");
                int length = spannableStringBuilder.length();
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, length - 1, length, 17);
                SR().setText(spannableStringBuilder);
                C786410Ut5.LLZLL(UR(), 8);
                TuxTextView tuxTextViewSR2 = SR();
                C786410Ut5.h9(tuxTextViewSR2, new ACListenerS106S0200000_2(tuxTextViewSR2, this, 8));
            } else {
                SR().setText(getString(2131830112));
                C786410Ut5.LLZLL(UR(), 0);
            }
        }
        View view7 = this.LLJILJILJ;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById2 = view8.findViewById(R.id.tzc);
            }
            this.LLJILJILJ = (C197039127h) viewFindViewById2;
            view7 = viewFindViewById2;
        }
        C197039127h c197039127h = (C197039127h) view7;
        C786410Ut5.I7(new AbS496S0200000_2(this, c197039127h, 2), c197039127h);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_method", getEnterMethod());
        pairArr[1] = new Pair("more_protection_tool_fold_status", String.valueOf(WR() ? 1 : 0));
        String str = "on";
        if (Intrinsics.LJFF(VR().LL.getValue(), bool)) {
            obj = "on";
        } else {
            obj = "off";
        }
        pairArr[2] = new Pair("care_mode_status", obj);
        if (!Intrinsics.LJFF(VR().LLILLJJLI.getValue(), bool)) {
            str = "off";
        }
        pairArr[3] = new Pair("filter_all_status", str);
        C20684815ws.LJIILLIIL("cmt_care_mode_page_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ahl, viewGroup, false);
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
