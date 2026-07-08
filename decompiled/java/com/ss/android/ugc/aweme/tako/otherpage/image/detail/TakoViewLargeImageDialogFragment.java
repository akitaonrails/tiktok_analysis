package com.ss.android.ugc.aweme.tako.otherpage.image.detail;

import X.AbstractC2361009My;
import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C1251150ifB;
import X.C12F2;
import X.C12F3;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1685300txQ;
import X.C1687490u0x;
import X.C1766560w4U;
import X.C1857700yRU;
import X.C1862330yYx;
import X.C189200o6;
import X.C19723912Ez;
import X.C19772412Xq;
import X.C19EG;
import X.C19GS;
import X.C19HU;
import X.C20600815jK;
import X.C2097608Jq;
import X.C425260Glw;
import X.C452501pT;
import X.C5182020e;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tako.botpage.components.action.cell.TakoActionCell;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoViewLargeImageDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpZyY+KSHELIOSIpZys2PCQlJWEHKS4jHyY2PwktOyg2ASgtLioXISQgJigVOiQrJCo9PA==";
    public List<String> LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public List<String> LLILZ;
    public Bitmap LLILZIL;
    public Map<String, String> LLIZ;
    public final C12F3 LLILZLL = new C12F3();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(235));

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IScreenshotService iScreenshotService = (IScreenshotService) this.LLIZLLLIL.getValue();
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        IScreenshotService iScreenshotService;
        super.onResume();
        final Map<String, String> map = this.LLIZ;
        if (map == null || (iScreenshotService = (IScreenshotService) this.LLIZLLLIL.getValue()) == null) {
            return;
        }
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        iScreenshotService.LJI(str, new AbstractC2361009My() { // from class: X.0mQg
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                Pair[] pairArr = new Pair[6];
                String str2 = map.get("enter_from");
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[0] = new Pair("enter_from", str2);
                String str3 = map.get("enter_method");
                if (str3 == null) {
                    str3 = "";
                }
                pairArr[1] = new Pair("enter_method", str3);
                String str4 = map.get("process_id");
                if (str4 == null) {
                    str4 = "";
                }
                pairArr[2] = new Pair("process_id", str4);
                String str5 = map.get("tako_session_id");
                if (str5 == null) {
                    str5 = "";
                }
                pairArr[3] = new Pair("tako_session_id", str5);
                String str6 = map.get("tako_chat_id");
                if (str6 == null) {
                    str6 = "";
                }
                pairArr[4] = new Pair("tako_chat_id", str6);
                String str7 = this.LLILLJJLI;
                pairArr[5] = new Pair("message_id", str7 != null ? str7 : "");
                return C2097608Jq.LJIIIIZZ(pairArr);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIJJI();
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LIZLLL();
        this.LLILZLL.LIZIZ.LIZ.invoke();
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        C1857700yRU c1857700yRU;
        super.onCreate(bundle);
        setStyle(1, R.style.y0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        } else {
            serializable = null;
        }
        if ((serializable instanceof C1857700yRU) && (c1857700yRU = (C1857700yRU) serializable) != null) {
            this.LL = c1857700yRU.urls;
            this.LLILLJJLI = c1857700yRU.msgId;
            this.LLIZ = c1857700yRU.commonParams;
            this.LLILLL = c1857700yRU.isAIGC();
            this.LLILZ = c1857700yRU.hashTags;
        }
        C12F3 c12f3 = this.LLILZLL;
        new AwS608S0100000_29(this, 286).invoke(c12f3.LIZIZ);
        C12F2.LIZ(c12f3, new C5182020e(this, 153), new C5182020e(this, 154), false, null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.LLILZLL.LIZIZ.LIZIZ.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        String str4;
        Object objLJJJLL;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        Context context = tuxNavBar.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxNavBar.setNavBackground(iIntValue);
        tuxNavBar.LJIIZILJ(false);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 510));
        tuxNavBar.LIZIZ(c1251150ifB);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoActionCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
        for (C19723912Ez c19723912Ez : this.LLILZLL.LIZ) {
            C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv.getState(), new C425260Glw(c19723912Ez.LIZJ, Integer.valueOf(c19723912Ez.LIZLLL), c19723912Ez.LJ, new AwS608S0100000_29(c19723912Ez, 287), c19723912Ez.LJII, c19723912Ez.LJIIIIZZ, c19723912Ez.LJIIJJI));
        }
        String str5 = null;
        C1862330yYx.LJLJJLL(20, C1862330yYx.LIZ, "ai_drawing", null, this.LLILLJJLI, this.LLIZ);
        C19HU c19hu = (C19HU) view.findViewById(R.id.x8i);
        List<String> list = this.LL;
        if (list != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
            c1331670kl3LJIIJ.LJJIJLIJ(this);
            c1331670kl3LJIIJ.LJJII(new C19772412Xq(c19hu, this, 0));
        }
        Lifecycle lifecycle = getLifecycle();
        Pair[] pairArr = new Pair[7];
        Map<String, String> map = this.LLIZ;
        if (map != null) {
            str5 = map.get("enter_from");
        }
        Object obj = "";
        if (str5 == null) {
            str5 = "";
        }
        pairArr[0] = new Pair("enter_from", str5);
        Map<String, String> map2 = this.LLIZ;
        if (map2 == null || (str = map2.get("enter_method")) == null) {
            str = "";
        }
        pairArr[1] = new Pair("enter_method", str);
        Map<String, String> map3 = this.LLIZ;
        if (map3 == null || (str2 = map3.get("process_id")) == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("process_id", str2);
        Map<String, String> map4 = this.LLIZ;
        if (map4 == null || (str3 = map4.get("sub_process_id")) == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("sub_process_id", str3);
        Map<String, String> map5 = this.LLIZ;
        if (map5 == null || (str4 = map5.get("bot_id")) == null) {
            str4 = "";
        }
        pairArr[4] = new Pair("bot_id", str4);
        List<String> list2 = this.LL;
        if (list2 != null && (objLJJJLL = C13LP.LJJJLL(list2)) != null) {
            obj = objLJJJLL;
        }
        pairArr[5] = new Pair("url", obj);
        pairArr[6] = new Pair("page_type", "image");
        C1687490u0x c1687490u0x = new C1687490u0x(lifecycle, C2097608Jq.LJIIIIZZ(pairArr));
        if (lifecycle != null) {
            lifecycle.addObserver(new TakoDetailPageStayDuration$track$1(c1687490u0x));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.frt, viewGroup, false);
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
