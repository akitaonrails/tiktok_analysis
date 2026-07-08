package com.ss.ugc.android.davinciresource;

import X.C098200Yq;
import X.C09RB;
import X.C13LQ;
import X.C189200o6;
import X.C2188811AlT;
import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.IBuildInModelFinder;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class BuildInModelFinder extends IBuildInModelFinder {
    public static final Companion Companion = new Companion();
    public final Context applicationContext;

    public static final class Companion {
    }

    public BuildInModelFinder(Context context) {
        this.applicationContext = context;
    }

    private final String getNameOfModel(String str) {
        int iLJJJJI = a0.LJJJJI(str, "/", 0, 6);
        int iLastIndexOfRegex = lastIndexOfRegex(str, "_v[0-9]");
        int i = iLJJJJI + 1;
        if (substringSafetyCheck(str, i, iLastIndexOfRegex)) {
            return str.substring(i, iLastIndexOfRegex);
        }
        int iLastIndexOfRegex2 = lastIndexOfRegex(str, "\\.model|_model|\\.dat");
        if (iLastIndexOfRegex2 > 0 && iLastIndexOfRegex2 > iLJJJJI) {
            return str.substring(i, iLastIndexOfRegex2);
        }
        return str.substring(i, str.length());
    }

    private final int getSizeOfModel(String str) {
        int iLastIndexOfRegex;
        if (!a0.LJJIIZI(str, "size", false)) {
            return 0;
        }
        int iLJJJJI = a0.LJJJJI(str, "size", 0, 6);
        if (a0.LJJIIZI(str, "md5", false)) {
            iLastIndexOfRegex = lastIndexOfRegex(str, "_md5");
        } else {
            iLastIndexOfRegex = lastIndexOfRegex(str, "\\.model|_model|\\.dat");
        }
        int i = -1;
        if (iLJJJJI >= iLastIndexOfRegex) {
            return -1;
        }
        try {
            i = CastIntegerProtector.parseInt(str.substring(iLJJJJI + 4, iLastIndexOfRegex));
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    private final String getVersionOfModel(String str) {
        int iLastIndexOfRegex = lastIndexOfRegex(str, "_v[0-9]");
        int iLastIndexOfRegex2 = lastIndexOfRegex(str, "\\.model|_model|\\.dat");
        if (iLastIndexOfRegex > 0) {
            return str.substring(iLastIndexOfRegex + 2, iLastIndexOfRegex2);
        }
        return "1.0";
    }

    public final boolean exists(String str) {
        Object c098200Yq;
        try {
            try {
                AssetManager assets = this.applicationContext.getAssets();
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(BuildInModelFinderKt.joinFileSeperator("model"));
                    sbLIZ.append(str);
                    c098200Yq = assets.open(C2188811AlT.LIZIZ(sbLIZ), 2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                InputStream inputStream = (InputStream) c098200Yq;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return true;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            throw th3;
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IBuildInModelFinder
    public String findModelUri(String str) {
        boolean z;
        Object c098200Yq;
        Object c098200Yq2;
        boolean z2 = true;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "asset://not_found";
        }
        try {
            c098200Yq = str.substring(0, a0.LJJJJI(str, "/", 0, 6));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String strLIZIZ = "";
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        String str2 = (String) c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model");
        if (str2.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('/');
            sbLIZ2.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        Object obj = null;
        try {
            String[] list = this.applicationContext.getAssets().list(strLIZIZ2);
            if (list != null) {
                c098200Yq2 = C13LQ.LJJLL(list);
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        List<String> list2 = (List) obj;
        String nameOfModel = getNameOfModel(str);
        if (list2 != null) {
            for (String str3 : list2) {
                if (Intrinsics.LJFF(getNameOfModel(str3), nameOfModel)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("asset://");
                    sbLIZ3.append(strLIZIZ2);
                    sbLIZ3.append('/');
                    sbLIZ3.append(str3);
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("model/");
        sbLIZ4.append(str);
        if (!exists(C2188811AlT.LIZIZ(sbLIZ4))) {
            return "asset://not_found";
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("asset://model/");
        sbLIZ5.append(str);
        return C2188811AlT.LIZIZ(sbLIZ5);
    }

    private final int lastIndexOfRegex(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        Sequence sequenceFindAll$default = Regex.findAll$default(new Regex(str2), str, 0, 2, null);
        if (!sequenceFindAll$default.iterator().hasNext()) {
            return -1;
        }
        return ((MatchResult) C09RB.LJIIZILJ(sequenceFindAll$default)).LIZIZ().LL;
    }

    private final boolean substringSafetyCheck(String str, int i, int i2) {
        if (a0.LJJJIL(str) || i < 0 || i2 < 0 || i >= i2 || i >= str.length() || i2 > str.length()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IBuildInModelFinder
    public boolean isBuildInModel(String str, String str2, int i) {
        if (str == null || a0.LJJJIL(str) || !exists(str)) {
            return false;
        }
        if (str2 != null && !a0.LJJJIL(str2) && Float.compare(CastFloatProtector.parseFloat(getVersionOfModel(str)), CastFloatProtector.parseFloat(str2)) != 0) {
            return false;
        }
        if (i < 0 || getSizeOfModel(str) == i) {
            return true;
        }
        return false;
    }
}
