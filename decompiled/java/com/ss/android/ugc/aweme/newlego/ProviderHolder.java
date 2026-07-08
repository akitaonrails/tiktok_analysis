package com.ss.android.ugc.aweme.newlego;

import X.C1BX4;
import X.C1BX6;
import X.C1BXT;

/* JADX INFO: loaded from: classes35.dex */
public class ProviderHolder {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void collectTask(String str, String str2, C1BXT c1bxt) {
        int iHashCode = str.hashCode();
        if (iHashCode != 184840563) {
            if (iHashCode == 1512830027 && str.equals("boot_finish_provider_v2")) {
                switch (str2.hashCode()) {
                    case 2528:
                        if (str2.equals("P0")) {
                            C1BX6.p0Run(c1bxt);
                        }
                        break;
                    case 2529:
                        if (str2.equals("P1")) {
                            C1BX6.p1Run(c1bxt);
                        }
                        break;
                    case 2530:
                        if (str2.equals("P2")) {
                            C1BX6.p2Run(c1bxt);
                        }
                        break;
                    case 2531:
                        if (str2.equals("P3")) {
                            C1BX6.p3Run(c1bxt);
                        }
                        break;
                }
            }
            return;
        }
        if (str.equals("startup_provider")) {
            switch (str2.hashCode()) {
                case -1905290496:
                    if (str2.equals("afterOnAttach")) {
                        C1BX4.afterOnAttach(c1bxt);
                    }
                    break;
                case -1850325577:
                    if (str2.equals("afterOnCreate")) {
                        C1BX4.afterOnCreate(c1bxt);
                    }
                    break;
                case 3059615:
                    if (str2.equals("core")) {
                        C1BX4.core(c1bxt);
                    }
                    break;
                case 934399409:
                    if (str2.equals("onMainActivityFocus")) {
                        C1BX4.onMainActivityFocus(c1bxt);
                    }
                    break;
                case 991151364:
                    if (str2.equals("onAttach")) {
                        C1BX4.onAttach(c1bxt);
                    }
                    break;
            }
        }
    }
}
