package com.ss.android.ugc.aweme.pipo.hybrid;

import X.C098200Yq;
import X.C168Q;
import X.C1725270uzt;
import X.C1776170wJz;
import X.C189200o6;
import X.C19EH;
import X.C19F0;
import X.C21505619Eg;
import X.C2188811AlT;
import X.InterfaceC1631630sYr;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class SelectContactFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9HELIOSIDwuOyY3ZhYpJSowPAYjJzsyKzEKOy40JSAiPQ==";
    public final Context LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final InterfaceC1631630sYr<String, String, Integer, String, Unit> LLILZIL;
    public boolean LLILZLL;
    public final C19F0<Intent> LLIZ;

    public SelectContactFragment() {
        this(null, null, null, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (!this.LLILZLL) {
            PR(this, "picker_result", "cancel", "-7", "fragment destroyed", null, null, 48);
            MR("", -7, "", false, "fragment destroyed");
        }
        super.onDestroy();
    }

    public final void OR() {
        try {
            if (isAdded()) {
                C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIIZILJ(this);
                c19ehLJIIJ.LJIIJ();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LL != null && this.LLILZIL != null) {
            try {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("vnd.android.cursor.dir/phone_v2");
                this.LLIZ.LIZ(intent);
                PR(this, "picker_launch", "success", null, null, null, null, 60);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("launch_fail_");
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                sbLIZ.append(message);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                PR(this, "picker_launch", "fail", "-5", strLIZIZ, null, null, 48);
                MR("", -5, "", true, strLIZIZ);
                return;
            }
        }
        PR(this, "picker_launch", "fail", "-17", "fragment restored without callback", null, null, 48);
        MR("", -17, "", true, "fragment restored without callback");
    }

    public SelectContactFragment(Context context, String str, String str2, String str3, C1776170wJz c1776170wJz) {
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c1776170wJz;
        this.LLIZ = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.0v0d
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0146
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // X.C168Q
            public final void LIZ(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 454
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1725730v0d.LIZ(java.lang.Object):void");
            }
        });
    }

    public final void MR(String str, Integer num, String str2, boolean z, String str3) {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        try {
            InterfaceC1631630sYr<String, String, Integer, String, Unit> interfaceC1631630sYr = this.LLILZIL;
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(str, str2, num, str3);
            }
            if (z) {
                OR();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                OR();
            }
            throw th;
        }
    }

    public static void PR(SelectContactFragment selectContactFragment, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i) {
        Boolean bool3 = bool;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        Boolean bool4 = null;
        if ((i & 2) != 0) {
            str7 = null;
        }
        if ((i & 4) != 0) {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        if ((i & 32) == 0) {
            bool4 = bool2;
        }
        selectContactFragment.getClass();
        C1725270uzt.LIZ.LJIILJJIL(bool3, bool4, selectContactFragment.LLILLJJLI, selectContactFragment.LLILLL, selectContactFragment.LLILZ, str, str7, "pipo.selectContact", str6, str5);
    }
}
