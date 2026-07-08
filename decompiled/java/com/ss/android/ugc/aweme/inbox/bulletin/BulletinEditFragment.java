package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0OPQ;
import X.C0OPX;
import X.C0QSJ;
import X.C1220000hqw;
import X.C1251150ifB;
import X.C13LE;
import X.C1618770sE7;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2095008Iq;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C618910OPh;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC21503819Do;
import X.InterfaceC687730QyJ;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinEditFragment extends BaseFragment implements InterfaceC21503819Do, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArHELIOSZic5JSM2PCwiZw0mJCkpPSY9DSElPQkhKSIhLCEn";
    public long LLIZ;
    public String LLIZLLLIL = "";
    public final C736950SvV LLJ;
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public Pair<String, String> LLJJIJI;
    public Integer LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
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

    public final BulletinEditViewModel SR() {
        return (BulletinEditViewModel) this.LLJ.getValue();
    }

    public final void UR() {
        C0OPQ c0opq = C0OPQ.LIZ;
        long j = this.LLIZ;
        boolean z = SR().LLILZ;
        String str = SR().LLIZLLLIL ? SR().LLIZ : null;
        Map<String, String> map = SR().LLILZIL;
        c0opq.getClass();
        C0OPQ.LJJIJ(j, "close", str, map, z);
        C618910OPh.LIZ.getClass();
        ((LinkedHashMap) C618910OPh.LIZLLL).clear();
    }

    public BulletinEditFragment() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 185);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinEditViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(127);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, c451460Hn6, c451620HnM, c338520DOw);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(this, 187);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_92, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(128), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 186));
        this.LLJJJ = "bulletin_board_page";
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        UR();
        C20277814Wa.LIZIZ(this);
        SR().BQ2(this.LLJILJIL, this.LLJJIII, this.LLJJIJI);
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        this.LLIZ = C0OPX.LIZLLL(getArguments(), "bulletin_board_id");
        SR().LLILZLL = String.valueOf(this.LLIZ);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("previous_page")) == null) {
            string = "";
        }
        this.LLIZLLLIL = string;
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(126));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String second;
        Integer numLJIIJJI;
        String string8;
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("bulletin_template_text");
        } else {
            string = null;
        }
        this.LLJILJIL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("enter_method");
        } else {
            string2 = null;
        }
        this.LLJILJILJ = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("interactive_method");
        } else {
            string3 = null;
        }
        this.LLJILLL = string3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("template_type");
        } else {
            string4 = null;
        }
        this.LLJJ = string4;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string5 = arguments5.getString("task_id");
        } else {
            string5 = null;
        }
        this.LLJJI = string5;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            string6 = arguments6.getString("unique_key");
        } else {
            string6 = null;
        }
        this.LLJJIJIL = string6;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (string7 = arguments7.getString("enter_from")) == null) {
            string7 = "bulletin_board_page";
        }
        this.LLJJJ = string7;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            second = arguments8.getString("inspirational_content");
        } else {
            second = null;
        }
        this.LLJJIJI = ((BulletinProfileViewModel) this.LLJI.getValue()).zQ2(context);
        if (second == null || !(!a0.LJJJIL(second))) {
            Pair<String, String> pair = this.LLJJIJI;
            if (pair != null) {
                second = pair.getSecond();
            } else {
                second = null;
            }
        }
        this.LLJJIII = second;
        ((LinkedHashMap) SR().LLILZIL).clear();
        Map<String, String> map = SR().LLILZIL;
        String str = this.LLJILJILJ;
        if (str == null) {
            str = "write";
        }
        map.put("enter_method", str);
        String str2 = this.LLJILLL;
        if (str2 != null && (!a0.LJJJIL(str2))) {
            SR().LLILZIL.put("interactive_method", str2);
        }
        String str3 = this.LLJJ;
        if (str3 != null && (!a0.LJJJIL(str3))) {
            SR().LLILZIL.put("template_type", str3);
        }
        String str4 = this.LLJJI;
        if (str4 != null && (!a0.LJJJIL(str4))) {
            SR().LLILZIL.put("task_id", str4);
        }
        String str5 = this.LLJJIJIL;
        if (str5 != null && (!a0.LJJJIL(str5))) {
            SR().LLILZIL.put("unique_key", str5);
        }
        if (!a0.LJJJIL(this.LLJJJ)) {
            SR().LLILZIL.put("enter_from", this.LLJJJ);
        }
        SR().LLILZIL.put("is_full_screen", "1");
        SR().LLILZ = false;
        Bundle arguments9 = getArguments();
        if (arguments9 != null && (string8 = arguments9.getString("enable_activity_event")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string8);
        } else {
            numLJIIJJI = null;
        }
        this.LLJJIJIIJIL = numLJIIJJI;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1854));
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJIJIL.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = (TuxNavBar) this.LLJIJIL.getValue();
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(C1618770sE7.LIZ(R.attr.uk));
        }
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 103), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a92, viewGroup, false);
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

    @Override // X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        C19EG activity;
        C20277814Wa.LIZ(this, i, i2, intent);
        if (i2 == 10001 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }
}
