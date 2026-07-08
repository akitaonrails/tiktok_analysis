package ttpobfuscated;

import X.C08KC;
import X.C098200Yq;
import X.C09AY;
import X.C13LN;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C189200o6;
import X.C2107108Nh;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class q4 {

    public final class a extends C09AY implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public final class b extends C09AY implements Function1<Byte, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final CharSequence a(byte b) {
            return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return a(b.byteValue());
        }
    }

    public static final byte[] a(String str) {
        if (str.length() % 2 == 0) {
            List listLJLJL = C13LN.LJLJL(2, str);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLJL, 10));
            for (String str2 : (ArrayList) listLJLJL) {
                CharsKt__CharJVMKt.checkRadix(16);
                arrayList.add(Byte.valueOf((byte) CastIntegerProtector.parseInt(str2, 16)));
            }
            return C13LP.LLFF(arrayList);
        }
        "Must have an even length".toString();
        throw new IllegalStateException("Must have an even length");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0026
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final java.lang.String b(java.lang.String r4) {
        /*
            ttpobfuscated.q4$a r0 = ttpobfuscated.q4.a.a
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r3 = 0
            if (r0 == 0) goto L36
            java.net.URL r0 = r0.getResource(r4)
            if (r0 == 0) goto L36
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.InputStream r2 = r0.openStream()
            byte[] r0 = X.C2106208My.LIZIZ(r2)     // Catch: java.lang.Throwable -> L1e
            goto L2e
        L1e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            r3 = r1
            goto L27
        L26:
            r0 = move-exception
        L27:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L26
            X.C2107108Nh.LIZ(r2, r3)
            throw r0
        L2e:
            X.C2107108Nh.LIZ(r2, r3)
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1)
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.q4.b(java.lang.String):java.lang.String");
    }

    public static final String a(byte[] bArr) {
        return C13LQ.LJJIJIL(bArr, "", b.a);
    }

    public static final Object a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.get(str);
        }
        return null;
    }

    public static final Boolean b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject, str));
        }
        return null;
    }

    public static final Integer c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, str));
        }
        return null;
    }

    public static final JSONArray d(JSONObject jSONObject, String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                c098200Yq = jSONObject.getJSONArray(str);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (JSONArray) obj;
    }

    public static final JSONObject e(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
        }
        return null;
    }

    public static final String f(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return JSONObjectProtectorUtils.getString(jSONObject, str);
        }
        return null;
    }

    public static final String a(Context context, String str, Charset charset) {
        Reader inputStreamReader = new InputStreamReader(context.getAssets().open(str), charset);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String strLIZJ = C08KC.LIZJ(inputStreamReader);
            C2107108Nh.LIZ(inputStreamReader, null);
            return strLIZJ;
        } finally {
        }
    }

    public static /* synthetic */ String a(Context context, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(context, str, charset);
    }
}
