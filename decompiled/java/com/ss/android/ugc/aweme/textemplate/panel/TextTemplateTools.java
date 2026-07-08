package com.ss.android.ugc.aweme.textemplate.panel;

import X.C089E;
import X.C08KC;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09CT;
import X.C0CHQ;
import X.C0F4U;
import X.C0FX8;
import X.C0VSJ;
import X.C0VSP;
import X.C11VU;
import X.C13LP;
import X.C189200o6;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C2286708xd;
import X.C23260099m;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1635410sex;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class TextTemplateTools {
    public static final TextTemplateTools LIZ = new TextTemplateTools();
    public static int LIZIZ;
    public static int LIZJ;

    public static final class ContentChild {

        @C09CT("text_params")
        public final ContentTextParams params;

        @C09CT("type")
        public final String type;

        public ContentChild() {
            this("", new ContentTextParams());
        }

        public ContentChild(String str, ContentTextParams contentTextParams) {
            this.type = str;
            this.params = contentTextParams;
        }
    }

    public static final class ContentJson {

        @C09CT("root")
        public final ContentRoot root;

        public ContentJson() {
            this(new ContentRoot(new ArrayList()));
        }

        public ContentJson(ContentRoot contentRoot) {
            this.root = contentRoot;
        }
    }

    public static final class ContentRoot {

        @C09CT("children")
        public final ArrayList<ContentChild> list;

        public ContentRoot() {
            this(new ArrayList());
        }

        public ContentRoot(ArrayList<ContentChild> arrayList) {
            this.list = arrayList;
        }
    }

    public static final class ContentTextParams {

        @C09CT("text")
        public final String text = "";
    }

    public static final class DependItem {

        @C09CT("resource_id")
        public final String id;

        @C09CT("tag")
        public final String panel;

        @C09CT("type")
        public final String type;

        public DependItem() {
            this("", "", "");
        }

        public DependItem(String str, String str2, String str3) {
            this.type = str;
            this.id = str2;
            this.panel = str3;
        }
    }

    public static final class TextTemplateDependResources {

        @C09CT("depend_resource_list")
        public final List<TextTemplateDependResource> dependResourceList;

        public TextTemplateDependResources(List<TextTemplateDependResource> list) {
            this.dependResourceList = list;
        }
    }

    public static String LIZLLL(String str) {
        BufferedReader bufferedReader;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/content.json");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!C2286708xd.LIZJ(strLIZIZ)) {
                return "";
            }
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            Reader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj), Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            Throwable th = null;
            try {
                String strLIZJ = C08KC.LIZJ(bufferedReader);
                C2107108Nh.LIZ(bufferedReader, null);
                for (ContentChild contentChild : ((ContentJson) C0CHQ.LIZ().getGson().LJII(strLIZJ, ContentJson.class)).root.list) {
                    if (Intrinsics.LJFF(contentChild.type, "text")) {
                        return contentChild.params.text;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return "";
            } finally {
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return "";
        }
    }

    public static String LJ(Effect effect) {
        ArrayList<DependItem> arrayList;
        DependItem dependItem;
        String sdkExtra = effect.getSdkExtra();
        if (sdkExtra != null) {
            try {
                TextTemplateExtra textTemplateExtra = (TextTemplateExtra) C0CHQ.LIZ().getGson().LJII(sdkExtra, TextTemplateExtra.class);
                if (textTemplateExtra != null && (arrayList = textTemplateExtra.list) != null && (dependItem = (DependItem) C13LP.LJJJLL(arrayList)) != null) {
                    String str = dependItem.id;
                    if (str != null) {
                        return str;
                    }
                }
                return "";
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        return "";
    }

    public static String LJFF(String str) {
        boolean z;
        Object c098200Yq;
        C0VSJ c0vsj;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            c0vsj = new C0VSJ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            return null;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                File file = (File) c089e.next();
                if (a0.LJJIIZI(file.getName(), ".ttf", false) || a0.LJJIIZI(file.getName(), ".otf", false) || a0.LJJIIZI(file.getName(), ".ttc", false)) {
                    return file.getPath();
                }
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x0096
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LJI(java.lang.String r7) {
        /*
            java.lang.String r6 = ""
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9e
            r1.append(r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "/content.json"
            r1.append(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = X.C2286708xd.LIZJ(r1)     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L19
            return r6
        L19:
            X.0VSJ r3 = new X.0VSJ     // Catch: java.lang.Throwable -> L9e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L9e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9e
            X.0VSP r0 = new X.0VSP     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9e
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L31
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> L9e
            goto L39
        L31:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9e
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L9e
            r2 = r1
        L39:
            r5 = 0
            java.lang.String r0 = X.C08KC.LIZJ(r2)     // Catch: java.lang.Throwable -> L8e
            X.C2107108Nh.LIZ(r2, r5)     // Catch: java.lang.Throwable -> L9e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "root"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L54
            java.lang.String r0 = "children"
            org.json.JSONArray r5 = r1.optJSONArray(r0)     // Catch: java.lang.Throwable -> L9e
        L54:
            if (r5 != 0) goto L57
            return r6
        L57:
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L9e
            r3 = 0
        L5c:
            if (r3 >= r4) goto L88
            org.json.JSONObject r2 = r5.optJSONObject(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "type"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "text"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L85
            java.lang.String r0 = "text_params"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L7f
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L7f
            goto L81
        L7f:
            r0 = 1
            goto L82
        L81:
            r0 = 0
        L82:
            if (r0 != 0) goto L85
            return r1
        L85:
            int r3 = r3 + 1
            goto L5c
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L9e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L9e
            return r6
        L8e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L96
            throw r1     // Catch: java.lang.Throwable -> L93
        L93:
            r0 = move-exception
            r5 = r1
            goto L97
        L96:
            r0 = move-exception
        L97:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L96
            X.C2107108Nh.LIZ(r2, r5)     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        L9e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools.LJI(java.lang.String):java.lang.String");
    }

    public static void LJII(Context context) {
        int iLJ = (int) ((C11VU.LJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) / 3.0f);
        LIZIZ = iLJ;
        LIZJ = (int) (iLJ / 1.69f);
    }

    public static boolean LJIIIIZZ(Effect effect) {
        String sdkExtra = effect.getSdkExtra();
        if (sdkExtra != null) {
            try {
                TextTemplateExtra textTemplateExtra = (TextTemplateExtra) C0CHQ.LIZ().getGson().LJII(sdkExtra, TextTemplateExtra.class);
                if (textTemplateExtra == null) {
                    return false;
                }
                if (!textTemplateExtra.isL8) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        return false;
    }

    public static boolean LJIIIZ(Effect effect) {
        try {
            JSONObject jSONObject = new JSONObject(effect.getExtra());
            if (!jSONObject.optBoolean("new_template", false)) {
                return false;
            }
            if (!Intrinsics.LJFF(jSONObject.optString("template_type", ""), "group")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    public static boolean LJIIJ(Effect effect) {
        try {
            return new JSONObject(effect.getExtra()).optBoolean("new_template", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    public static final class TextTemplateExtra {

        @C09CT("is_from_l8")
        public final boolean isL8;

        @C09CT("depend_resource_list")
        public final ArrayList<DependItem> list;

        /* JADX WARN: Multi-variable type inference failed */
        public TextTemplateExtra() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public TextTemplateExtra(ArrayList<DependItem> arrayList, boolean z) {
            this.list = arrayList;
            this.isL8 = z;
        }

        public /* synthetic */ TextTemplateExtra(ArrayList arrayList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? false : z);
        }
    }

    public static boolean LJIIJJI(Pair pair, Pair pair2) {
        if (((Number) pair.getFirst()).intValue() == ((Number) pair2.getFirst()).intValue() && ((Number) pair.getSecond()).intValue() == ((Number) pair2.getSecond()).intValue()) {
            return true;
        }
        return false;
    }

    public static Object LIZ(InterfaceC1635410sex interfaceC1635410sex, String str, C0F4U c0f4u) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c0f4u));
        interfaceC1635410sex.LIZIZ(str, null, new C0FX8(c23260099m, 0));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c0f4u);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1635410sex r10, java.lang.String r11, java.lang.String r12, X.InterfaceC1364105Vn<? super X.AbstractC387850FIp> r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools.LIZIZ(X.0sex, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final class TextTemplateDependResource {
        public final transient Effect LIZ;

        @C09CT("tag")
        public final String panel;

        @C09CT("resource_id")
        public final String resourceId;

        @C09CT("resource_path")
        public final String resourcePath;

        @C09CT("type")
        public final String type;

        public TextTemplateDependResource(String str, String str2, String str3, String str4, Effect effect) {
            this.type = str;
            this.resourceId = str2;
            this.resourcePath = str3;
            this.panel = str4;
            this.LIZ = effect;
        }
    }

    /* JADX WARN: Path cross not found for [B:69:0x00f7, B:53:0x0150], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b7 -> B:11:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1635410sex r23, com.ss.android.ugc.effectmanager.effect.model.Effect r24, boolean r25, X.InterfaceC1631620sYq<? super com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools.DependItem, ? super java.lang.Long, ? super java.lang.Boolean, kotlin.Unit> r26, kotlin.jvm.functions.Function2<? super com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools.DependItem, ? super java.lang.Long, kotlin.Unit> r27, X.InterfaceC1364105Vn<? super X.AbstractC387820FIm> r28) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools.LIZJ(X.0sex, com.ss.android.ugc.effectmanager.effect.model.Effect, boolean, X.0sYq, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
