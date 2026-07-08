package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.C011Z;
import X.C0IPD;
import X.C0IPE;
import X.C0IPF;
import X.C0IPG;
import X.C0IPH;
import X.C0IPI;
import X.C13LP;
import X.C1834150xpV;
import X.C466140IPs;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.performance.BroadcastNewStableModeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCenterStatusInfoSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9PCA+KCwnHELIOSISoiZzg6LCIpPWE/ITMpKio9PCA+ZwM6PiAPLCEnLTcfPS4nPTYFJyk8Gy0pLDs=";
    public C0IPH LLJLLL;
    public C0IPE LLJZ;
    public C0IPD LLJZIJLIL;
    public C0IPF LLL;
    public final List<C466140IPs> LLLF = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C0IPI> uS() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterStatusInfoSheet.uS():java.util.List");
    }

    public final void ES() {
        C0IPH c0iph = this.LLJLLL;
        if (c0iph != null) {
            List<C0IPI> listUS = uS();
            List listLLIIII = C13LP.LLIIII(c0iph.LL);
            ((ArrayList) c0iph.LL).clear();
            ((ArrayList) c0iph.LL).addAll(listUS);
            int iMin = Math.min(listLLIIII.size(), listUS.size());
            for (int i = 0; i < iMin; i++) {
                if (!Intrinsics.LJFF(ListProtector.get(listLLIIII, i), ListProtector.get(listUS, i))) {
                    c0iph.notifyItemChanged(i);
                }
            }
        }
        View view = getView();
        if (view != null) {
            GS(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0IP6 wS() {
        /*
            r13 = this;
            X.0IPF r0 = r13.LLL
            r9 = 0
            if (r0 == 0) goto L86
            int r7 = r0.LIZ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto L87
            int r6 = r0.intValue()
        Lf:
            X.0IPE r0 = r13.LLJZ
            if (r0 == 0) goto L84
            int r1 = r0.LIZ
        L15:
            r8 = 1
            if (r0 == 0) goto L82
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto L82
            int r0 = r0.intValue()
        L20:
            X.0IPG r0 = r13.zS(r1, r0)
            java.lang.String r4 = r0.LIZIZ
            X.0IPD r0 = r13.LLJZIJLIL
            if (r0 == 0) goto L7f
            int r1 = r0.LIZ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto L80
            int r0 = r0.intValue()
        L34:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0IPG r0 = r13.yS(r1, r0)
            java.lang.String r3 = r0.LIZIZ
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.0IPG r0 = r13.BS(r7, r0)
            java.lang.String r2 = r0.LIZIZ
            int r0 = r2.length()
            if (r0 <= 0) goto L7d
            r0 = 1
        L52:
            r1 = 0
            if (r0 != 0) goto L56
            r2 = r1
        L56:
            r5[r9] = r2
            boolean r0 = FS(r7, r6)
            if (r0 == 0) goto L65
            r0 = 2131855097(0x7f1186f9, float:1.9343888E38)
            java.lang.String r1 = r13.getString(r0)
        L65:
            r5[r8] = r1
            java.util.List r5 = X.C13LQ.LJIJI(r5)
            java.lang.String r6 = "\n"
            r7 = 0
            r12 = 62
            r8 = r7
            r10 = r7
            r11 = r7
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            X.0IP6 r0 = new X.0IP6
            r0.<init>(r4, r3, r1)
            return r0
        L7d:
            r0 = 0
            goto L52
        L7f:
            r1 = 0
        L80:
            r0 = 5
            goto L34
        L82:
            r0 = 1
            goto L20
        L84:
            r1 = 0
            goto L15
        L86:
            r7 = 0
        L87:
            r6 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterStatusInfoSheet.wS():X.0IP6");
    }

    public final String getEnterFrom() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("arg_enter_from")) == null) ? "" : string;
    }

    public final void GS(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.w1f);
        int i2 = 0;
        if (viewFindViewById != null) {
            if (!((ArrayList) this.LLLF).isEmpty()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.w1g);
        if (viewFindViewById2 != null) {
            if (!(!((ArrayList) this.LLLF).isEmpty())) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    public static boolean FS(int i, int i2) {
        if ((i == 1 || i == 2) && i2 == 6 && BroadcastNewStableModeSetting.INSTANCE.enable()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[PHI: r1
      0x006f: PHI (r1v12 java.lang.String) = (r1v11 java.lang.String), (r1v14 java.lang.String) binds: [B:30:0x006d, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6 A[PHI: r1
      0x00c6: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:52:0x00c4, B:38:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0IPG BS(int r10, java.lang.Integer r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterStatusInfoSheet.BS(int, java.lang.Integer):X.0IPG");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterStatusInfoSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0IPG yS(int r6, java.lang.Integer r7) {
        /*
            r5 = this;
            java.lang.String r2 = ""
            r1 = 2131855068(0x7f1186dc, float:1.9343829E38)
            if (r6 == 0) goto L56
            r0 = 2
            if (r6 == r0) goto L14
            X.0IPG r4 = new X.0IPG
            java.lang.String r0 = r5.getString(r1)
            r4.<init>(r0, r2)
            return r4
        L14:
            X.0IPG r4 = new X.0IPG
            r0 = 2131855064(0x7f1186d8, float:1.934382E38)
            java.lang.String r3 = r5.getString(r0)
            if (r7 == 0) goto L40
            int r1 = r7.intValue()
            r0 = 3
            if (r1 != r0) goto L31
            r0 = 2131855066(0x7f1186da, float:1.9343825E38)
            java.lang.String r0 = r5.getString(r0)
        L2d:
            r4.<init>(r3, r0)
            return r4
        L31:
            int r1 = r7.intValue()
            r0 = 4
            if (r1 != r0) goto L40
            r0 = 2131855065(0x7f1186d9, float:1.9343823E38)
            java.lang.String r0 = r5.getString(r0)
            goto L2d
        L40:
            r2 = 2131855067(0x7f1186db, float:1.9343827E38)
            if (r7 == 0) goto L51
            int r1 = r7.intValue()
            r0 = 5
            if (r1 != r0) goto L51
            java.lang.String r0 = r5.getString(r2)
            goto L2d
        L51:
            java.lang.String r0 = r5.getString(r2)
            goto L2d
        L56:
            X.0IPG r4 = new X.0IPG
            java.lang.String r0 = r5.getString(r1)
            r4.<init>(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterStatusInfoSheet.yS(int, java.lang.Integer):X.0IPG");
    }

    public final C0IPG zS(int i, int i2) {
        String string;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new C0IPG(getString(2131855081), "");
                    }
                    String string2 = getString(2131855070);
                    if (i2 == 1 || i2 != 2) {
                        string = getString(2131855086);
                    } else {
                        string = getString(2131855084);
                    }
                    return new C0IPG(string2, string);
                }
                return new C0IPG(getString(2131855077), getString(2131855088));
            }
            return new C0IPG(getString(2131855078), getString(2131855090));
        }
        return new C0IPG(getString(2131855081), "");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.h68, viewGroup, false);
    }
}
