package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote;

import X.C098200Yq;
import X.C189200o6;
import X.C19EH;
import X.C491550JPl;
import X.C491620JPs;
import X.C500980Jkm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class SuggestEmotePageSheet extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExHELIOSPTYlJyogO2s8LD04O2spJCAnLWs/PCg0LTY4LCI8PCBiGjo0LyA/PQo+JzEpGS40LRYkLCon";
    public final boolean LL = true;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gly);
        c500980Jkm.LIZJ = R.style.ahk;
        if (!this.LL) {
            c500980Jkm.LJI = 0.0f;
        }
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 60;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("sec_user_id");
            String string2 = arguments.getString("show_entrance");
            String string3 = arguments.getString("anchor_id");
            String string4 = arguments.getString("upload_user_type");
            C491550JPl c491550JPl = SuggestEmotePageFragment.LLJI;
            String str = "";
            if (string == null) {
                string = "";
            }
            if (string2 == null) {
                string2 = "";
            }
            if (string3 == null) {
                string3 = "";
            }
            if (string4 != null) {
                str = string4;
            }
            C491620JPs c491620JPs = new C491620JPs(this);
            c491550JPl.getClass();
            SuggestEmotePageFragment suggestEmotePageFragmentLIZ = C491550JPl.LIZ(string, string2, string3, str, c491620JPs, true);
            try {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, suggestEmotePageFragmentLIZ, null);
                c19ehLJIIJ.LJIIL();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
