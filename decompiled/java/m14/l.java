package m14;

import X.AbstractC1489540org;
import X.AbstractC1489560ori;
import X.C09FF;
import X.C1490230osn;
import X.C2104008Mc;
import X.C2188811AlT;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class l {
    public static volatile l LJIIL;
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public Context LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public final AtomicLong LIZJ = new AtomicLong(0);
    public final List<AbstractC1489540org> LIZLLL = new ArrayList();
    public final ReentrantReadWriteLock LJ = new ReentrantReadWriteLock();
    public final List<C09FF> LJFF = new ArrayList();
    public final ReentrantReadWriteLock LJI = new ReentrantReadWriteLock();
    public final AtomicInteger LJII = new AtomicInteger(0);
    public final AtomicLong LJIIIIZZ = new AtomicLong(0);
    public final ConcurrentMap<String, String> LJIIIZ = new ConcurrentHashMap();
    public String LJIIJ;
    public String LJIIJJI;

    public static l LJ() {
        if (LJIIL == null) {
            synchronized (l.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new l();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public final int LIZIZ() {
        return this.LJII.get();
    }

    public final long LIZJ() {
        return this.LJIIIIZZ.get();
    }

    public static void LJFF(Context context) {
        JSONObject jSONObjectOptJSONObject;
        if (C2104008Mc.LIZJ(context) && !LJIILIIL.get()) {
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "ttnet_tnc_config");
            boolean z = sharedPreferencesLIZJ.getBoolean("is_full_config", false);
            String string = sharedPreferencesLIZJ.getString("tnc_config_str", null);
            String string2 = sharedPreferencesLIZJ.getString("ttnet_tnc_etag", null);
            String string3 = sharedPreferencesLIZJ.getString("ttnet_tnc_abtest", null);
            try {
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    if (!z || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
                        jSONObjectOptJSONObject = jSONObject;
                    }
                    LJ().LJI(0, System.currentTimeMillis(), string2, string3, jSONObjectOptJSONObject);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIILIIL.set(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:11:0x0043->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m14.e LIZ(m14.m r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m14.l.LIZ(m14.m):m14.e");
    }

    public final String LIZLLL(String str) {
        String protocol;
        if (!TextUtils.isEmpty(str) && !str.contains("/network/get_network") && !str.contains("/get_domains/v5") && !str.contains("/ies/speed")) {
            String host = null;
            try {
                URL url = new URL(str);
                protocol = url.getProtocol();
                try {
                    host = url.getHost();
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                th = th2;
                protocol = null;
            }
            if (!TextUtils.isEmpty(protocol) && (("http".equals(protocol) || "https".equals(protocol)) && !TextUtils.isEmpty(host))) {
                ConcurrentMap<String, String> concurrentMap = this.LJIIIZ;
                if (concurrentMap != null && ((ConcurrentHashMap) concurrentMap).containsKey(host)) {
                    String str2 = (String) ((ConcurrentHashMap) this.LJIIIZ).get(host);
                    if (TextUtils.isEmpty(str2)) {
                        return str;
                    }
                    Logger.debug();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(protocol);
                    sbLIZ.append("://");
                    sbLIZ.append(host);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(protocol);
                    sbLIZ2.append("://");
                    sbLIZ2.append(str2);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    if (str.startsWith(strLIZIZ)) {
                        str = str.replaceFirst(strLIZIZ, strLIZIZ2);
                    }
                    Logger.debug();
                    return str;
                }
                Logger.debug();
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[LOOP:0: B:17:0x004e->B:22:0x0061, LOOP_START, PHI: r3
      0x004e: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:16:0x004c, B:22:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(org.json.JSONObject r21) {
        /*
            r20 = this;
            java.lang.String r0 = "action"
            r2 = r21
            java.lang.String r6 = r2.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.String r1 = "act_priority"
            r0 = -1
            int r8 = r2.optInt(r1, r0)
            if (r8 >= 0) goto L19
            return
        L19:
            java.lang.String r0 = "param"
            org.json.JSONObject r7 = r2.optJSONObject(r0)
            if (r7 != 0) goto L22
            return
        L22:
            java.lang.String r0 = "lifecycle"
            java.lang.String r1 = r2.optString(r0)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            r3 = 0
            if (r0 == 0) goto L64
            r9 = 0
        L33:
            r11 = r9
        L34:
            java.lang.String r0 = "rule_id"
            int r0 = r2.optInt(r0)
            long r13 = (long) r0
            java.lang.String r0 = "sign"
            java.lang.String r15 = r2.optString(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "request_method"
            org.json.JSONArray r5 = r2.optJSONArray(r0)
            if (r5 == 0) goto L8f
        L4e:
            int r0 = r5.length()
            if (r3 >= r0) goto L8f
            java.lang.String r4 = r5.optString(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L61
            r1.add(r4)
        L61:
            int r3 = r3 + 1
            goto L4e
        L64:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = X.C2089508Gn.LIZJ(r1, r5)
            r4 = 1
            if (r0 != r4) goto L8c
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L8c
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            goto L34
        L8c:
            r9 = -1
            goto L33
        L8f:
            java.lang.String r0 = "set_req_priority"
            int r19 = r2.optInt(r0, r8)
            r2 = r20
            java.util.concurrent.atomic.AtomicLong r0 = r2.LIZJ
            long r16 = r0.get()
            r18 = r1
            X.0ori r1 = X.AbstractC1489560ori.LIZ(r6, r7, r8, r9, r11, r13, r15, r16, r18, r19)
            boolean r0 = r1 instanceof X.AbstractC1489540org
            if (r0 == 0) goto Lae
            java.util.List<X.0org> r0 = r2.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m14.l.LJII(org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(org.json.JSONObject r18) {
        /*
            r17 = this;
            java.lang.String r1 = "act_priority"
            r0 = -1
            r2 = r18
            int r5 = r2.optInt(r1, r0)
            if (r5 >= 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "param"
            org.json.JSONObject r4 = r2.optJSONObject(r0)
            if (r4 != 0) goto L15
            return
        L15:
            java.lang.String r0 = "lifecycle"
            java.lang.String r1 = r2.optString(r0)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r6 = 0
        L25:
            r8 = r6
        L26:
            java.lang.String r3 = "delay"
            r10 = 0
            java.lang.String r12 = ""
            r1 = r17
            java.util.concurrent.atomic.AtomicLong r0 = r1.LIZJ
            long r13 = r0.get()
            r15 = 0
            r16 = 0
            X.0ori r2 = X.AbstractC1489560ori.LIZ(r3, r4, r5, r6, r8, r10, r12, r13, r15, r16)
            boolean r0 = r2 instanceof X.C09FF
            if (r0 == 0) goto L46
            java.util.List<X.09FF> r0 = r1.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
        L46:
            return
        L47:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r0 = X.C2089508Gn.LIZJ(r1, r3)
            r2 = 1
            if (r0 != r2) goto L70
            int r1 = r3.size()
            r0 = 2
            if (r1 != r0) goto L70
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            goto L26
        L70:
            r6 = -1
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: m14.l.LJIIIIZZ(org.json.JSONObject):void");
    }

    public final void LJI(int i, long j, String str, String str2, JSONObject jSONObject) {
        boolean z;
        Logger.debug();
        this.LJII.set(i);
        this.LJIIJ = str;
        this.LJIIJJI = str2;
        this.LJIIIIZZ.set(j);
        int iOptInt = jSONObject.optInt("ignore_retrofit_slash_enabled_v2", -1);
        boolean z2 = true;
        if (iOptInt >= -1) {
            if (iOptInt == 1) {
                z = true;
            } else {
                z = false;
            }
            C1490230osn.LJIILIIL.set(z);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("request_delay_actions");
        try {
            this.LJI.writeLock().lock();
            ((ArrayList) this.LJFF).clear();
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        LJIIIIZZ(jSONObjectOptJSONObject);
                    }
                }
            }
            if (!((ArrayList) this.LJFF).isEmpty()) {
                Collections.sort(this.LJFF, new Comparator<AbstractC1489560ori>() { // from class: X.0orj
                    @Override // java.util.Comparator
                    public final int compare(AbstractC1489560ori abstractC1489560ori, AbstractC1489560ori abstractC1489560ori2) {
                        return abstractC1489560ori.LJIIIZ - abstractC1489560ori2.LJIIIZ;
                    }
                });
            }
            this.LJI.writeLock().unlock();
            Logger.debug();
            int iOptInt2 = jSONObject.optInt("ttnet_url_dispatcher_enabled", -1);
            if (iOptInt2 >= 0) {
                AtomicBoolean atomicBoolean = this.LIZIZ;
                if (iOptInt2 != 1) {
                    z2 = false;
                }
                atomicBoolean.set(z2);
            }
            long jOptInt = jSONObject.optInt("ttnet_dispatch_actions_epoch", -1);
            if (jOptInt == this.LIZJ.get()) {
                Logger.debug();
                return;
            }
            this.LIZJ.set(jOptInt);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ttnet_dispatch_actions");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            try {
                this.LJ.writeLock().lock();
                ((ArrayList) this.LIZLLL).clear();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        LJII(jSONObjectOptJSONObject2);
                    }
                }
                if (!((ArrayList) this.LIZLLL).isEmpty()) {
                    Collections.sort(this.LIZLLL, new Comparator<AbstractC1489560ori>() { // from class: X.0orj
                        @Override // java.util.Comparator
                        public final int compare(AbstractC1489560ori abstractC1489560ori, AbstractC1489560ori abstractC1489560ori2) {
                            return abstractC1489560ori.LJIIIZ - abstractC1489560ori2.LJIIIZ;
                        }
                    });
                }
                this.LJ.writeLock().unlock();
                Logger.debug();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJ.writeLock().unlock();
                Logger.debug();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJI.writeLock().unlock();
            Logger.debug();
            throw th2;
        }
    }
}
