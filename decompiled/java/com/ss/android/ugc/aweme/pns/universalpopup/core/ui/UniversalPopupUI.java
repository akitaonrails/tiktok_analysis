package com.ss.android.ugc.aweme.pns.universalpopup.core.ui;

import X.C01GW;
import X.C10UZ;
import X.C452501pT;
import X.InterfaceC1085710eML;
import X.InterfaceC1914540zvA;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public abstract class UniversalPopupUI extends Fragment {
    public boolean LLILLJJLI;
    public InterfaceC1085710eML LLILLL;
    public Map<String, InterfaceC1914540zvA> LLILZ;
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final int LLILZIL = 4097;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 505));

    public Map<String, Object> OR() {
        return null;
    }

    public abstract void RR(Map<String, String> map, StyleExtra styleExtra);

    public abstract void SR(SpannableStringBuilder spannableStringBuilder, String str);

    public abstract void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17);

    public abstract void VR(String str, String str2);

    public abstract void WR(String str);

    public final UniversalPopup PR() {
        return (UniversalPopup) this.LLILZLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        InterfaceC1085710eML interfaceC1085710eML = this.LLILLL;
        if (interfaceC1085710eML != null) {
            interfaceC1085710eML.Ay();
        }
    }

    public int MR() {
        return this.LLILZIL;
    }

    public final String NR(String str, String str2) {
        if (C10UZ.LIZLLL(requireContext()) && (!a0.LJJJIL(str2))) {
            return str2;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:30:0x00b9, B:31:0x00bb, B:33:0x00e5, B:39:0x00f3, B:40:0x00f9, B:44:0x0105, B:45:0x0107, B:48:0x011e, B:50:0x014f, B:51:0x015a, B:52:0x015d, B:24:0x0082, B:25:0x008f, B:27:0x0095, B:28:0x00af), top: B:76:0x0082 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
