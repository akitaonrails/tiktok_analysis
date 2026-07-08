package com.bytedance.android.livesdk.settings.customtab;

import X.C13LP;
import X.C16FS;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C745370TLr;
import X.C786410Ut5;
import X.InterfaceC745390TLt;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes13.dex */
public class KevaTestDialog extends LiveDialogFragment {
    public static final Gson LLILZ = C19748512Ol.LIZIZ;
    public static C745370TLr LLILZIL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OyHELIOSA4PSY9LzZiKjogPCohPS4xZg4pPy4HLTY4DSYyJCor";
    public InterfaceC745390TLt LL;
    public C16FS LLILLJJLI;
    public LiveEditText LLILLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gx3);
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 17;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    public final void x4() {
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText != null) {
            C500260Jjc.LJIILJJIL(liveEditText);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Class<?> cls;
        Object obj;
        String str;
        Object obj2;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.zsp);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_value);
        LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.hds);
        this.LLILLL = liveEditText;
        C745370TLr c745370TLr = LLILZIL;
        if (c745370TLr != null && (obj2 = c745370TLr.LIZIZ) != null) {
            cls = obj2.getClass();
        } else {
            cls = null;
        }
        Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(String.valueOf(cls), new String[]{e3.d}, 0, 6));
        Object objLJIILL = "";
        if (textView != null) {
            Object[] objArr = new Object[1];
            C745370TLr c745370TLr2 = LLILZIL;
            if (c745370TLr2 == null || (str = c745370TLr2.LIZ) == null) {
                str = "";
            }
            objArr[0] = str;
            textView.setText(C497740JfY.LJIJJ(2131856088, objArr));
        }
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJJ(2131856090, objLJJLIIIJJI));
        }
        C745370TLr c745370TLr3 = LLILZIL;
        if (c745370TLr3 != null && (obj = c745370TLr3.LIZIZ) != null) {
            objLJIILL = obj;
        }
        if (!(objLJIILL instanceof Object[]) && !(objLJIILL instanceof Integer) && !(objLJIILL instanceof Double) && !(objLJIILL instanceof Float) && !(objLJIILL instanceof Long) && !(objLJIILL instanceof Byte) && !(objLJIILL instanceof Character) && !(objLJIILL instanceof Short) && !(objLJIILL instanceof Boolean) && !(objLJIILL instanceof String) && !(objLJIILL instanceof HashMap)) {
            try {
                objLJIILL = LLILZ.LJIILL(objLJIILL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse to json error. value is ");
                sbLIZ.append(objLJIILL);
                C20441214yg.LJ("KevaDebugFragment", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (liveEditText != null) {
            liveEditText.setText(String.valueOf(objLJIILL));
        }
        this.LLILLJJLI = (C16FS) view.findViewById(R.id.cuk);
        C16FS c16fs = (C16FS) view.findViewById(R.id.cny);
        C16FS c16fs2 = this.LLILLJJLI;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS147S0100000_12(this, 367));
        }
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 232));
        }
    }
}
