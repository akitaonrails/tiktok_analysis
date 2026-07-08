package defpackage;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX INFO: loaded from: classes21.dex */
public final class a2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final a Companion;
        public static final /* synthetic */ b[] LLILLL;
        public static final /* synthetic */ C2254308sP LLILZ;
        public static final b NONE;
        public static final b TOUCH_CANCEL;
        public static final b TOUCH_END;
        public static final b TOUCH_MOVE;
        public static final b TOUCH_START;
        public final int LL;
        public final String LLILLJJLI;

        public static final class a {
        }

        public static InterfaceC2044707zh<b> getEntries() {
            return LLILZ;
        }

        static {
            b bVar = new b("NONE", 0, 0, null);
            NONE = bVar;
            b bVar2 = new b("TOUCH_START", 1, 1, "touchstart");
            TOUCH_START = bVar2;
            b bVar3 = new b("TOUCH_MOVE", 2, 2, "touchmove");
            TOUCH_MOVE = bVar3;
            b bVar4 = new b("TOUCH_END", 3, 3, "touchend");
            TOUCH_END = bVar4;
            b bVar5 = new b("TOUCH_CANCEL", 4, 4, "touchcancel");
            TOUCH_CANCEL = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            LLILLL = bVarArr;
            LLILZ = new C2254308sP(bVarArr);
            Companion = new a();
        }

        public static b[] values() {
            return (b[]) LLILLL.clone();
        }

        public final int getCode() {
            return this.LL;
        }

        public final String getEventName() {
            return this.LLILLJJLI;
        }

        public static b valueOf(String str) {
            return (b) C08FF.LIZ(b.class, str);
        }

        public b(String str, int i, int i2, String str2) {
            this.LL = i2;
            this.LLILLJJLI = str2;
        }
    }
}
