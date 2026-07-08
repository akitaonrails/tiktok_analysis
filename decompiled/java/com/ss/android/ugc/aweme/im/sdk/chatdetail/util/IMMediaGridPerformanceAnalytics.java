package com.ss.android.ugc.aweme.im.sdk.chatdetail.util;

import X.C0I0B;
import X.C20684815ws;
import X.C904420Zdw;
import X.C904470Ze1;
import X.C904480Ze2;
import X.EnumC904370Zdr;
import X.EnumC904450Zdz;
import X.EnumC904460Ze0;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMediaGridPerformanceAnalytics implements IIMMediaGridPerformanceAnalytics {
    public static final IMMediaGridPerformanceAnalytics LIZ = new IMMediaGridPerformanceAnalytics();
    public static final Map<C904480Ze2, Long> LIZIZ = new LinkedHashMap();
    public static final Map<C904480Ze2, Long> LIZJ = new LinkedHashMap();
    public static final Map<C904480Ze2, Long> LIZLLL = new LinkedHashMap();
    public static final Map<C904480Ze2, Long> LJ = new LinkedHashMap();
    public static final Map<C904480Ze2, Long> LJFF = new LinkedHashMap();
    public static final Map<C904480Ze2, C904470Ze1> LJI = new LinkedHashMap();

    public static final class Service implements IIMMediaGridPerformanceAnalytics {
        public final /* synthetic */ IMMediaGridPerformanceAnalytics LIZ = IMMediaGridPerformanceAnalytics.LIZ;

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LIZ(String str) {
            this.LIZ.LIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LIZIZ(String str, EnumC904370Zdr enumC904370Zdr) {
            this.LIZ.LIZIZ(str, enumC904370Zdr);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LIZJ(String str, EnumC904370Zdr enumC904370Zdr) {
            this.LIZ.LIZJ(str, enumC904370Zdr);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LIZLLL(String str, EnumC904370Zdr enumC904370Zdr) {
            this.LIZ.LIZLLL(str, enumC904370Zdr);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LJ(String str, EnumC904370Zdr enumC904370Zdr, boolean z, int i, boolean z2) {
            this.LIZ.LJ(str, enumC904370Zdr, z, i, z2);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final boolean LJFF(String str, EnumC904370Zdr enumC904370Zdr, boolean z) {
            return this.LIZ.LJFF(str, enumC904370Zdr, z);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LJI(String str, EnumC904370Zdr enumC904370Zdr) {
            this.LIZ.LJI(str, enumC904370Zdr);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LJII(String str, EnumC904370Zdr enumC904370Zdr) {
            this.LIZ.LJII(str, enumC904370Zdr);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
        public final void LJIIIIZZ(String str) {
            this.LIZ.LJIIIIZZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LIZ(String str) {
        for (EnumC904450Zdz enumC904450Zdz : EnumC904450Zdz.values()) {
            C904480Ze2 c904480Ze2 = new C904480Ze2(str, enumC904450Zdz);
            LIZIZ.remove(c904480Ze2);
            LIZJ.remove(c904480Ze2);
            LIZLLL.remove(c904480Ze2);
            LJ.remove(c904480Ze2);
            LJFF.remove(c904480Ze2);
            LJI.remove(c904480Ze2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LJIIIIZZ(String str) {
        EnumC904460Ze0 enumC904460Ze0;
        Set setKeySet = ((LinkedHashMap) LJI).keySet();
        ArrayList<C904480Ze2> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (Intrinsics.LJFF(((C904480Ze2) obj).LIZ, str)) {
                arrayList.add(obj);
            }
        }
        for (C904480Ze2 c904480Ze2 : arrayList) {
            C904470Ze1 c904470Ze1Remove = LJI.remove(c904480Ze2);
            if (c904470Ze1Remove != null) {
                String str2 = c904480Ze2.LIZ;
                EnumC904450Zdz enumC904450Zdz = c904470Ze1Remove.LIZ;
                boolean z = c904470Ze1Remove.LIZIZ;
                int i = c904470Ze1Remove.LIZJ;
                boolean z2 = c904470Ze1Remove.LIZLLL;
                if (z) {
                    enumC904460Ze0 = EnumC904460Ze0.GROUP;
                } else {
                    enumC904460Ze0 = EnumC904460Ze0.PRIVATE;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("conversation_id", str2);
                linkedHashMap.put("type", enumC904450Zdz.getEtString());
                linkedHashMap.put("chat_type", enumC904460Ze0.getEtString());
                linkedHashMap.put("media_loaded", String.valueOf(i));
                linkedHashMap.put("has_user_load_all", String.valueOf(z2));
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("ttsocial_chat_detail_media_loaded_all", linkedHashMap);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LIZIZ(String str, EnumC904370Zdr enumC904370Zdr) {
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return;
        }
        LIZJ.put(new C904480Ze2(str, enumC904450ZdzLIZ), Long.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LIZJ(String str, EnumC904370Zdr enumC904370Zdr) {
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return;
        }
        LJ.put(new C904480Ze2(str, enumC904450ZdzLIZ), Long.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LIZLLL(String str, EnumC904370Zdr enumC904370Zdr) {
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return;
        }
        LJFF.put(new C904480Ze2(str, enumC904450ZdzLIZ), Long.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LJI(String str, EnumC904370Zdr enumC904370Zdr) {
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return;
        }
        LIZIZ.put(new C904480Ze2(str, enumC904450ZdzLIZ), Long.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LJII(String str, EnumC904370Zdr enumC904370Zdr) {
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return;
        }
        LIZLLL.put(new C904480Ze2(str, enumC904450ZdzLIZ), Long.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final boolean LJFF(String str, EnumC904370Zdr enumC904370Zdr, boolean z) {
        EnumC904460Ze0 enumC904460Ze0;
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return false;
        }
        C904480Ze2 c904480Ze2 = new C904480Ze2(str, enumC904450ZdzLIZ);
        Map<C904480Ze2, Long> map = LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get(c904480Ze2);
        if (l == null) {
            return false;
        }
        long jLongValue = l.longValue();
        Map<C904480Ze2, Long> map2 = LIZJ;
        Long l2 = (Long) ((LinkedHashMap) map2).get(c904480Ze2);
        if (l2 == null) {
            return false;
        }
        long jLongValue2 = l2.longValue();
        Map<C904480Ze2, Long> map3 = LIZLLL;
        Long l3 = (Long) ((LinkedHashMap) map3).get(c904480Ze2);
        if (l3 == null) {
            return false;
        }
        long jLongValue3 = l3.longValue();
        Map<C904480Ze2, Long> map4 = LJ;
        Long l4 = (Long) ((LinkedHashMap) map4).get(c904480Ze2);
        if (l4 == null) {
            return false;
        }
        long jLongValue4 = l4.longValue();
        Map<C904480Ze2, Long> map5 = LJFF;
        Long l5 = (Long) ((LinkedHashMap) map5).get(c904480Ze2);
        if (l5 != null) {
            long jLongValue5 = l5.longValue();
            if (z) {
                enumC904460Ze0 = EnumC904460Ze0.GROUP;
            } else {
                enumC904460Ze0 = EnumC904460Ze0.PRIVATE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("conversation_id", str);
            linkedHashMap.put("type", enumC904450ZdzLIZ.getEtString());
            linkedHashMap.put("chat_type", enumC904460Ze0.getEtString());
            linkedHashMap.put("init_media_timestamp_ms", String.valueOf(jLongValue));
            linkedHashMap.put("load_memory_timestamp_ms", String.valueOf(jLongValue2));
            linkedHashMap.put("load_ui_timestamp_ms", String.valueOf(jLongValue4));
            linkedHashMap.put("init_ui_timestamp_ms", String.valueOf(jLongValue3));
            linkedHashMap.put("show_ui_timestamp_ms", String.valueOf(jLongValue5));
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            linkedHashMap.put("first_data_loading_ms", String.valueOf(jLongValue2 - jLongValue));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("ttsocial_enter_chat_detail_media_load_perf", linkedHashMap);
            map.remove(c904480Ze2);
            map2.remove(c904480Ze2);
            map3.remove(c904480Ze2);
            map4.remove(c904480Ze2);
            map5.remove(c904480Ze2);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics
    public final void LJ(String str, EnumC904370Zdr enumC904370Zdr, boolean z, int i, boolean z2) {
        EnumC904450Zdz enumC904450ZdzLIZ = C904420Zdw.LIZ(enumC904370Zdr);
        if (enumC904450ZdzLIZ == null) {
            return;
        }
        LJI.put(new C904480Ze2(str, enumC904450ZdzLIZ), new C904470Ze1(enumC904450ZdzLIZ, z, i, z2));
    }
}
