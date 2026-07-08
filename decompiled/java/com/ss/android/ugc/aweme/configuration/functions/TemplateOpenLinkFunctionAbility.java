package com.ss.android.ugc.aweme.configuration.functions;

import X.C010U;
import X.C09CT;
import X.C1227904rF;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class TemplateOpenLinkFunctionAbility implements C010U {

    public static final class KV {

        @C09CT("key")
        public final String key;

        @C09CT("value")
        public final String value;

        public KV() {
            this("", "");
        }

        public KV(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    @Override // X.C010U
    public final String getName() {
        return "template_open_link";
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility.ReplaceParams r7) {
        /*
            java.lang.String r5 = r7.templateLink
            java.util.List<com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility$KV> r0 = r7.kvList
            java.util.Iterator r7 = r0.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r6 = r7.next()
            com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility$KV r6 = (com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility.KV) r6
            java.lang.String r2 = r6.value
            int r1 = r2.hashCode()
            r0 = -1916689255(0xffffffff8dc1a499, float:-1.1934169E-30)
            if (r1 == r0) goto L50
            r0 = 395812716(0x17979f6c, float:9.79839E-25)
            if (r1 == r0) goto L3d
            r0 = 1658402779(0x62d937db, float:2.0034841E21)
            if (r1 != r0) goto L8
            java.lang.String r0 = "#tts_campaign_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8
            java.lang.String r3 = X.C10SR.LIZ()
        L35:
            if (r3 == 0) goto L8
        L37:
            java.lang.String r0 = r6.key
            kotlin.text.u.LJJII(r5, r0, r3)
            goto L8
        L3d:
            java.lang.String r0 = "#priority_region"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8
            java.lang.String r1 = X.C2222691Bz1.LIZ()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toLowerCase(r0)
            goto L35
        L50:
            java.lang.String r0 = "#tts_product_ids"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8
            java.util.List r2 = X.C10SR.LIZLLL()
            r1 = 0
            if (r2 == 0) goto L99
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L99
            java.util.Iterator r4 = r2.iterator()
            java.lang.String r3 = "&top_product_ids="
        L6b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L89
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = "%2C"
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L89:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            r1 = 1
            goto L6b
        L99:
            java.lang.String r3 = ""
            goto L37
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility.LIZIZ(com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility$ReplaceParams):java.lang.String");
    }

    @Override // X.C010U
    public final void LIZ(String str) {
        if (str != null && str.length() != 0) {
            C1227904rF.LIZ.getClass();
            LIZIZ((ReplaceParams) C1227904rF.LIZIZ(str, ReplaceParams.class));
        }
    }

    public static final class ReplaceParams {

        @C09CT("kv_list")
        public final List<KV> kvList;

        @C09CT("template_link")
        public final String templateLink;

        public ReplaceParams() {
            this(null, null, 3, null);
        }

        public ReplaceParams(String str, List<KV> list) {
            this.templateLink = str;
            this.kvList = list;
        }

        public ReplaceParams(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
