package com.ss.android.ugc.aweme.pipo.bnpl;

import X.C01GW;
import X.C0FNV;
import X.C1905807dI;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C452501pT;
import X.EnumC743970TGh;
import X.InterfaceC836760Ws6;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class WalletEntryFragmentDF extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSHELIOSB9Kis8JWEEKSkgLDsWJjE+MAkhKSIhLCEnDAM=";
    public long LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 534));

    public final void SR() {
        String string;
        String string2;
        String string3;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                string = arguments.getString(Scene.SCENE_SERVICE);
                try {
                    string2 = arguments.getString("merchant_id");
                    try {
                        string3 = arguments.getString("merchant_user_id");
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                        string3 = "";
                    }
                } catch (Exception e2) {
                    e = e2;
                    string2 = "";
                }
            } else {
                string3 = "";
                string = "";
                string2 = "";
            }
        } catch (Exception e3) {
            e = e3;
            string = "";
            string2 = "";
        }
        Pair[] pairArr = new Pair[4];
        if (string2 == null) {
            string2 = "";
        }
        pairArr[0] = new Pair("merchant_id", string2);
        if (string3 == null) {
            string3 = "";
        }
        pairArr[1] = new Pair("merchant_user_id", string3);
        pairArr[2] = new Pair("timestamp", String.valueOf(System.currentTimeMillis()));
        pairArr[3] = new Pair(Scene.SCENE_SERVICE, string != null ? string : "");
        C1905807dI.LIZ("fp_sdk_df_download_popup_show", C2097608Jq.LJIIZILJ(C2097608Jq.LJIIJ(pairArr)));
        Dialog dialog = (Dialog) this.LLIZLLLIL.getValue();
        if (dialog != null) {
            C0FNV.LIZJ(dialog);
        }
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZIZ(new AwS591S0100000_12(this, 638));
    }

    public final void UR() {
        Intent intent;
        String dataString;
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZJ();
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string = arguments.getString("host");
                if (string != null) {
                    Uri.decode(string);
                } else {
                    string = null;
                }
                String string2 = arguments.getString("enter_from");
                if (string2 == null || string2.length() == 0) {
                    string2 = arguments.getString("source");
                }
                String string3 = arguments.getString("pipo_product_code");
                String string4 = arguments.getString("token");
                String string5 = arguments.getString("merchant_id");
                String string6 = arguments.getString("merchant_user_id");
                String string7 = arguments.getString("need_callback");
                String string8 = arguments.getString("theme");
                String string9 = arguments.getString("previous_page_id");
                if (string9 == null) {
                    string9 = string2;
                }
                String string10 = "";
                String string11 = arguments.getString(Scene.SCENE_SERVICE);
                C19EG activity = getActivity();
                if ((activity == null || (intent = activity.getIntent()) == null || (dataString = intent.getDataString()) == null || (string10 = UriProtector.parse(dataString).buildUpon().clearQuery().appendPath("real").build().toString()) != null) && string10.length() != 0) {
                    SmartRouter.buildRoute(requireContext(), UriProtector.parse(string10).buildUpon().appendQueryParameter("host", Uri.encode(string)).appendQueryParameter("source", string2).appendQueryParameter(Scene.SCENE_SERVICE, string3).appendQueryParameter("token", string4).appendQueryParameter("merchant_id", string5).appendQueryParameter("merchant_user_id", string6).appendQueryParameter("need_callback", string7).appendQueryParameter("theme", string8).appendQueryParameter("previous_page_id", string9).appendQueryParameter("truly_scene", string11).build().toString()).open();
                } else {
                    C19EG activity2 = getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            activity3.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.FOUNDATION)) {
            UR();
        } else {
            this.LLIZ = System.currentTimeMillis();
            SR();
        }
    }
}
