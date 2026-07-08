package defpackage;

import X.C08FF;
import X.C2097608Jq;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class i2 {
    public final HashMap<a, List<InboxWidget>> LIZ = C2097608Jq.LJI(new Pair(a.FREQUENCY_BLOCKING, new ArrayList()), new Pair(a.MAIN_NOT_READY, new ArrayList()));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a FREQUENCY_BLOCKING;
        public static final /* synthetic */ a[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;
        public static final a MAIN_NOT_READY;

        public static InterfaceC2044707zh<a> getEntries() {
            return LLILLJJLI;
        }

        static {
            a aVar = new a("FREQUENCY_BLOCKING", 0);
            FREQUENCY_BLOCKING = aVar;
            a aVar2 = new a("MAIN_NOT_READY", 1);
            MAIN_NOT_READY = aVar2;
            a[] aVarArr = {aVar, aVar2};
            LL = aVarArr;
            LLILLJJLI = new C2254308sP(aVarArr);
        }

        public static a[] values() {
            return (a[]) LL.clone();
        }

        public static a valueOf(String str) {
            return (a) C08FF.LIZ(a.class, str);
        }

        public a(String str, int i) {
        }
    }
}
