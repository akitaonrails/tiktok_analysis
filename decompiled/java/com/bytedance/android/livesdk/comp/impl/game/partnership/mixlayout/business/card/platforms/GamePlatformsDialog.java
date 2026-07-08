package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms;

import X.C09RB;
import X.C09RD;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C1834150xpV;
import X.C1880070z1Z;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1881340z3c;
import X.InterfaceC1883030z6L;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms.GamePlatformsDialog;
import com.bytedance.android.livesdk.game.model.GameStationSupportPlatformInfo;
import com.bytedance.android.livesdk.game.model.JumpLinkInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class GamePlatformsDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITHELIOSViJCYrJCQ1JjonZic5OiY9LTY/ZywyOiFiOSMyPCMjOyIgZgItJCoDJCQ4LyAhJTYIIC4/JyI=";
    public final InterfaceC1883030z6L LLJLLL;
    public final List<GameStationSupportPlatformInfo> LLJZ;
    public ViewGroup LLJZIJLIL;

    public GamePlatformsDialog() {
        this(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean uS() {
        /*
            r3 = this;
            X.0z6L r0 = r3.LLJLLL
            r2 = 0
            if (r0 == 0) goto L35
            X.0z3c r0 = r0.LIZJ()
            if (r0 == 0) goto L35
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            if (r1 == 0) goto L35
            X.0z3c r0 = r1.LIZ
            java.lang.String r1 = r1.LIZIZ
            if (r0 == 0) goto L3a
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L24
            r1 = r2
        L24:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L3a
            java.lang.String r0 = "scene"
            java.lang.Object r1 = r1.get(r0)
        L2e:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L33
            r2 = r1
        L33:
            java.lang.Integer r2 = (java.lang.Integer) r2
        L35:
            boolean r0 = X.C1884080z82.LIZ(r2)
            return r0
        L3a:
            r1 = r2
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms.GamePlatformsDialog.uS():boolean");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = true;
        sheetOptions.dimBehindType = 1;
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ;
        InterfaceC1883030z6L interfaceC1883030z6L = this.LLJLLL;
        if (interfaceC1883030z6L != null) {
            interfaceC1881340z3cLIZJ = interfaceC1883030z6L.LIZJ();
        } else {
            interfaceC1881340z3cLIZJ = null;
        }
        C1880070z1Z.LJII(interfaceC1881340z3cLIZJ, "available_platforms", "close", C2097608Jq.LJ());
    }

    public GamePlatformsDialog(InterfaceC1883030z6L interfaceC1883030z6L, List<GameStationSupportPlatformInfo> list) {
        this.LLJLLL = interfaceC1883030z6L;
        this.LLJZ = list;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        View view2;
        int childCount;
        String str;
        super.onViewCreated(view, bundle);
        if (uS()) {
            View viewFindViewById = view.findViewById(R.id.esw);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.ehx);
            }
            View viewFindViewById2 = view.findViewById(R.id.cov);
            if (viewFindViewById2 != null) {
                C500260Jjc.LJIILIIL(viewFindViewById2);
            }
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0z1w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.LL.close(1);
                }
            }, view.findViewById(R.id.cri));
        } else {
            View viewFindViewById3 = view.findViewById(R.id.cri);
            if (viewFindViewById3 != null) {
                C500260Jjc.LJIILIIL(viewFindViewById3);
            }
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0z1x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.LL.close(1);
                }
            }, view.findViewById(R.id.cov));
        }
        this.LLJZIJLIL = (ViewGroup) view.findViewById(R.id.b8n);
        List<GameStationSupportPlatformInfo> list = this.LLJZ;
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ = null;
        if (list != null) {
            for (final GameStationSupportPlatformInfo gameStationSupportPlatformInfo : list) {
                ViewGroup viewGroup2 = this.LLJZIJLIL;
                if (viewGroup2 != null) {
                    childCount = viewGroup2.getChildCount();
                } else {
                    childCount = 0;
                }
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.gmd, null, false);
                ((TextView) viewTd.findViewById(R.id.tv_platforms)).setText(gameStationSupportPlatformInfo.platformName);
                View viewFindViewById4 = viewTd.findViewById(R.id.k3w);
                if (viewFindViewById4 != null) {
                    if (C1834150xpV.LJI(getContext())) {
                        str = gameStationSupportPlatformInfo.platformIconDark;
                    } else {
                        str = gameStationSupportPlatformInfo.platformIconLight;
                    }
                    C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
                    url.LJIL = true;
                    url.LJJI(viewFindViewById4);
                }
                C786410Ut5.T7((TextView) viewTd.findViewById(R.id.cwj), new View.OnClickListener() { // from class: X.0z1n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        InterfaceC1881340z3c interfaceC1881340z3cLIZJ2;
                        InterfaceC1881340z3c interfaceC1881340z3cLIZJ3;
                        C1883340z6q c1883340z6qLJIILJJIL;
                        InterfaceC1880940z2y interfaceC1880940z2y;
                        GamePlatformsDialog gamePlatformsDialog = this.LL;
                        GameStationSupportPlatformInfo gameStationSupportPlatformInfo2 = gameStationSupportPlatformInfo;
                        gamePlatformsDialog.getClass();
                        JumpLinkInfo jumpLinkInfo = gameStationSupportPlatformInfo2.jumpLinkInfo;
                        if (jumpLinkInfo != null) {
                            InterfaceC1883030z6L interfaceC1883030z6L = gamePlatformsDialog.LLJLLL;
                            InterfaceC1881340z3c interfaceC1881340z3cLIZJ4 = null;
                            if (interfaceC1883030z6L != null) {
                                interfaceC1881340z3cLIZJ2 = interfaceC1883030z6L.LIZJ();
                            } else {
                                interfaceC1881340z3cLIZJ2 = null;
                            }
                            C1880070z1Z.LJII(interfaceC1881340z3cLIZJ2, "available_platforms", "view", C2097908Jt.LIZJ(new Pair("platforms_name", C1880070z1Z.LIZJ(gameStationSupportPlatformInfo2.platformType))));
                            InterfaceC1883030z6L interfaceC1883030z6L2 = gamePlatformsDialog.LLJLLL;
                            if (interfaceC1883030z6L2 != null) {
                                interfaceC1881340z3cLIZJ4 = interfaceC1883030z6L2.LIZJ();
                            }
                            C1880070z1Z.LJIIIZ(interfaceC1881340z3cLIZJ4, C1880070z1Z.LIZJ(gameStationSupportPlatformInfo2.platformType));
                            InterfaceC1883030z6L interfaceC1883030z6L3 = gamePlatformsDialog.LLJLLL;
                            if (interfaceC1883030z6L3 != null && (interfaceC1881340z3cLIZJ3 = interfaceC1883030z6L3.LIZJ()) != null && (c1883340z6qLJIILJJIL = interfaceC1881340z3cLIZJ3.LJIILJJIL()) != null && (interfaceC1880940z2y = (InterfaceC1880940z2y) c1883340z6qLJIILJJIL.LIZ(InterfaceC1880940z2y.class)) != null) {
                                InterfaceC1880710z2b.LIZ.getClass();
                                interfaceC1880940z2y.LJII(new C1880160z1i(jumpLinkInfo, 9), new C1880240z1q(), new C1880250z1r());
                            }
                        }
                    }
                });
                ViewGroup viewGroup3 = this.LLJZIJLIL;
                if (viewGroup3 != null) {
                    viewGroup3.addView(viewTd);
                }
                if (childCount > 0) {
                    C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), viewTd);
                }
            }
        }
        if (uS() && (viewGroup = this.LLJZIJLIL) != null && (view2 = (View) C09RB.LJIJ(new C09RD(viewGroup))) != null) {
            C500260Jjc.LJJLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), view2);
        }
        InterfaceC1883030z6L interfaceC1883030z6L = this.LLJLLL;
        if (interfaceC1883030z6L != null) {
            interfaceC1881340z3cLIZJ = interfaceC1883030z6L.LIZJ();
        }
        C1880070z1Z.LJIIIZ(interfaceC1881340z3cLIZJ, "available_platforms");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gmc, viewGroup, false);
    }
}
