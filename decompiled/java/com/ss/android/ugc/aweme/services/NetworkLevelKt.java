package com.ss.android.ugc.aweme.services;

import X.C1411240mpO;
import X.EnumC1661320tKk;

/* JADX INFO: loaded from: classes26.dex */
public final class NetworkLevelKt {
    public static final C1411240mpO defaultNetworkLevel() {
        return new C1411240mpO(EnumC1661320tKk.UNDEFINED, -2);
    }

    public static final boolean isDefault(C1411240mpO c1411240mpO) {
        if (c1411240mpO.LIZ == EnumC1661320tKk.UNDEFINED && c1411240mpO.LIZIZ == -2) {
            return true;
        }
        return false;
    }

    public static final boolean isFake(C1411240mpO c1411240mpO) {
        if (c1411240mpO.LIZ == EnumC1661320tKk.FAKE) {
            return true;
        }
        return false;
    }

    public static final boolean isOffline(C1411240mpO c1411240mpO) {
        if (c1411240mpO.LIZ == EnumC1661320tKk.OFFLINE) {
            return true;
        }
        return false;
    }

    public static final boolean isUnknown(C1411240mpO c1411240mpO) {
        if (c1411240mpO.LIZ == EnumC1661320tKk.UNKNOWN) {
            return true;
        }
        return false;
    }

    public static final boolean isWeak(C1411240mpO c1411240mpO) {
        if (c1411240mpO.LIZ == EnumC1661320tKk.SLOW) {
            return true;
        }
        return false;
    }

    public static final boolean lteOffline(C1411240mpO c1411240mpO) {
        if (c1411240mpO.LIZIZ <= 1) {
            return true;
        }
        return false;
    }

    public static final C1411240mpO obtainNetworkLevelByCombineNqe(int i) {
        switch (i) {
            case -1:
                return new C1411240mpO(EnumC1661320tKk.OFFLINE, i);
            case 0:
                return new C1411240mpO(EnumC1661320tKk.UNKNOWN, i);
            case 1:
            case 2:
                return new C1411240mpO(EnumC1661320tKk.SLOW, i);
            case 3:
                return new C1411240mpO(EnumC1661320tKk.MEDERATE, i);
            case 4:
            case 5:
                return new C1411240mpO(EnumC1661320tKk.EXCELLENT, i);
            default:
                return new C1411240mpO(EnumC1661320tKk.UNDEFINED, i);
        }
    }

    public static final C1411240mpO obtainNetworkLevelByTTNetNqe(int i) {
        if (i == -1) {
            return new C1411240mpO(EnumC1661320tKk.FAKE, i);
        }
        if (i == 0) {
            return new C1411240mpO(EnumC1661320tKk.UNKNOWN, i);
        }
        if (i == 1) {
            return new C1411240mpO(EnumC1661320tKk.OFFLINE, i);
        }
        if (i != 2 && i != 3) {
            if (i >= 4) {
                return new C1411240mpO(EnumC1661320tKk.EXCELLENT, i);
            }
            return new C1411240mpO(EnumC1661320tKk.UNDEFINED, i);
        }
        return new C1411240mpO(EnumC1661320tKk.SLOW, i);
    }
}
