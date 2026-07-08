package defpackage;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface p2 {
    public static final a LIZ = a.LIZ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b BACKGROUND;
        public static final b IMMEDIATE;
        public static final /* synthetic */ b[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;
        public static final b QUEUE;

        public static InterfaceC2044707zh<b> getEntries() {
            return LLILLJJLI;
        }

        static {
            b bVar = new b("QUEUE", 0);
            QUEUE = bVar;
            b bVar2 = new b("IMMEDIATE", 1);
            IMMEDIATE = bVar2;
            b bVar3 = new b("BACKGROUND", 2);
            BACKGROUND = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            LL = bVarArr;
            LLILLJJLI = new C2254308sP(bVarArr);
        }

        public static b[] values() {
            return (b[]) LL.clone();
        }

        public static b valueOf(String str) {
            return (b) C08FF.LIZ(b.class, str);
        }

        public b(String str, int i) {
        }
    }

    Map<String, String> getExt();

    int getOp();

    public static final class a {
        public static final /* synthetic */ a LIZ = new a();

        public static boolean LIZ(Integer num) {
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 1007 || num.intValue() == 15 || num.intValue() == 16) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }
}
