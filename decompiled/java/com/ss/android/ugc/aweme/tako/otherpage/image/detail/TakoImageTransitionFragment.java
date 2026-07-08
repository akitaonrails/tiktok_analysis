package com.ss.android.ugc.aweme.tako.otherpage.image.detail;

import X.AbstractC2361009My;
import X.C01GW;
import X.C020Y;
import X.C03IT;
import X.C098200Yq;
import X.C0DSB;
import X.C1251150ifB;
import X.C12F2;
import X.C12F3;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LQ;
import X.C1685300txQ;
import X.C1687490u0x;
import X.C1862330yYx;
import X.C189200o6;
import X.C19723912Ez;
import X.C19772512Xr;
import X.C19EG;
import X.C19GS;
import X.C19HU;
import X.C20600815jK;
import X.C2097608Jq;
import X.C384050F3z;
import X.C419910GdJ;
import X.C425260Glw;
import X.C452501pT;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tako.botpage.components.action.cell.TakoActionCell;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoImageTransitionFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpZyHELIOSY+KSIpZys2PCQlJWEHKS4jACIyLyAYOy49Oyw4ICA9DjctLiI2JjE=";
    public TuxNavBar LLIZ;
    public C19HU LLIZLLLIL;
    public ImageView LLJ;
    public String[] LLJIJIL;
    public HashMap<String, String> LLJILJIL;
    public boolean LLJILJILJ;
    public List<String> LLJILLL;
    public String LLJJ;
    public Bitmap LLJJI;
    public final C12F3 LLJI = new C12F3();
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(234));

    public final void SR() {
        C19HU c19hu;
        Context context = getContext();
        if (context == null || (c19hu = this.LLIZLLLIL) == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
        c19hu.setImageDrawable(c384050F3z.LIZ(context));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IScreenshotService iScreenshotService = (IScreenshotService) this.LLJJIII.getValue();
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        IScreenshotService iScreenshotService;
        super.onResume();
        final HashMap<String, String> map = this.LLJILJIL;
        if (map == null || (iScreenshotService = (IScreenshotService) this.LLJJIII.getValue()) == null) {
            return;
        }
        String str = map.get("message_id");
        if (str == null) {
            str = "";
        }
        iScreenshotService.LJI(str, new AbstractC2361009My() { // from class: X.0DQD
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
                String str7 = map.get("message_id");
                pairArr[5] = new Pair("message_id", str7 != null ? str7 : "");
                return C2097608Jq.LJIIIIZZ(pairArr);
            }
        });
    }

    public final void nG(String str) {
        String str2;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        HashMap<String, String> map = this.LLJILJIL;
        if (map != null) {
            str2 = map.get("message_id");
        } else {
            str2 = null;
        }
        C1862330yYx.LJLJJL(c1862330yYx, map, str, "ai_drawing", null, str2, null, 104);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String[] stringArray;
        Serializable serializable;
        HashMap<String, String> map;
        String string;
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(475));
        Bundle arguments = getArguments();
        ArrayList<String> stringArrayList = null;
        if (arguments != null) {
            stringArray = arguments.getStringArray("image_url");
        } else {
            stringArray = null;
        }
        this.LLJIJIL = stringArray;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("image_mob_params");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            map = (HashMap) serializable;
        } else {
            map = null;
        }
        this.LLJILJIL = map;
        Bundle arguments3 = getArguments();
        boolean z = false;
        if (arguments3 != null) {
            z = arguments3.getBoolean("aigc_image", false);
        }
        this.LLJILJILJ = z;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string = arguments4.getString("tako_transition_name", null);
        } else {
            string = null;
        }
        this.LLJJ = string;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            stringArrayList = arguments5.getStringArrayList("post_hashtag");
        }
        this.LLJILLL = stringArrayList;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ImageView imageView;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.x8j);
        this.LLIZ = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
        }
        TuxNavBar tuxNavBar2 = this.LLIZ;
        if (tuxNavBar2 != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_arrow_left_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZJ(new AwS573S0100000_29(this, 509));
            tuxNavBar2.LIZIZ(c1251150ifB);
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxNavBar tuxNavBar3 = this.LLIZ;
            if (tuxNavBar3 != null) {
                tuxNavBar3.setNavBackground(iIntValue);
            }
        }
        this.LLIZLLLIL = (C19HU) view.findViewById(R.id.x8i);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.x8m);
        this.LLJ = imageView2;
        String str8 = this.LLJJ;
        if (str8 != null) {
            if (imageView2 != null) {
                imageView2.setTransitionName(str8);
            }
            C19HU c19hu = this.LLIZLLLIL;
            if (c19hu != null) {
                C786410Ut5.LJLLLLLL(4, c19hu);
            }
        }
        if (this.LLJJ == null && (imageView = this.LLJ) != null) {
            C0DSB.LIZIZ(imageView);
        }
        String[] strArr = this.LLJIJIL;
        if (strArr != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(C13LQ.LJJLL(strArr)));
            c1331670kl3LJIIJ.LJJIJLIJ(this);
            c1331670kl3LJIIJ.LJJII(new C19772512Xr(this, 1));
        }
        C12F3 c12f3 = this.LLJI;
        new AwS608S0100000_29(this, 284).invoke(c12f3.LIZIZ);
        C12F2.LIZ(c12f3, new C020Y(view, this, 24), new C020Y(view, this, 25), false, null);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoActionCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
        for (C19723912Ez c19723912Ez : this.LLJI.LIZ) {
            C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv.getState(), new C425260Glw(c19723912Ez.LIZJ, Integer.valueOf(c19723912Ez.LIZLLL), c19723912Ez.LJ, new AwS608S0100000_29(c19723912Ez, 285), c19723912Ez.LJII, c19723912Ez.LJIIIIZZ, c19723912Ez.LJIIJJI));
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        HashMap<String, String> map = this.LLJILJIL;
        if (map != null) {
            str = map.get("message_id");
        } else {
            str = null;
        }
        C1862330yYx.LJLJJLL(20, c1862330yYx, "ai_drawing", null, str, map);
        Lifecycle lifecycle = getLifecycle();
        Pair[] pairArr = new Pair[7];
        HashMap<String, String> map2 = this.LLJILJIL;
        if (map2 != null) {
            str2 = map2.get("enter_from");
        } else {
            str2 = null;
        }
        String str9 = "";
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("enter_from", str2);
        HashMap<String, String> map3 = this.LLJILJIL;
        if (map3 == null || (str3 = map3.get("enter_method")) == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("enter_method", str3);
        HashMap<String, String> map4 = this.LLJILJIL;
        if (map4 == null || (str4 = map4.get("process_id")) == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("process_id", str4);
        HashMap<String, String> map5 = this.LLJILJIL;
        if (map5 == null || (str5 = map5.get("sub_process_id")) == null) {
            str5 = "";
        }
        pairArr[3] = new Pair("sub_process_id", str5);
        HashMap<String, String> map6 = this.LLJILJIL;
        if (map6 == null || (str6 = map6.get("bot_id")) == null) {
            str6 = "";
        }
        pairArr[4] = new Pair("bot_id", str6);
        HashMap<String, String> map7 = this.LLJILJIL;
        if (map7 != null && (str7 = map7.get("url")) != null) {
            str9 = str7;
        }
        pairArr[5] = new Pair("url", str9);
        pairArr[6] = new Pair("page_type", "image");
        C1687490u0x c1687490u0x = new C1687490u0x(lifecycle, C2097608Jq.LJIIIIZZ(pairArr));
        if (lifecycle != null) {
            lifecycle.addObserver(new TakoDetailPageStayDuration$track$1(c1687490u0x));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fof, viewGroup, false);
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
