package com.ss.android.ugc.aweme.explore.performance.json;

import X.C09CN;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1244080iTm;
import X.C2095008Iq;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreResponseInterceptorFactory implements v {
    public static final Pattern LL = PatternProtector.compile("\"video\"\\s*:\\s*\\{");
    public static final Pattern LLILLJJLI = PatternProtector.compile("\"url_list\"\\s*:\\s*\\[\\s*\"([^\"]+)\"");
    public static final Pattern LLILLL = PatternProtector.compile("\"width\"\\s*:\\s*(\\d+)");
    public static final Pattern LLILZ = PatternProtector.compile("\"height\"\\s*:\\s*(\\d+)");
    public static final Pattern LLILZIL = PatternProtector.compile("\"aweme_id\"\\s*:\\s*\"?(\\d+)\"?");

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ChunkFrontLoadAdapter<T> extends TypeAdapter<T> {
        public final TypeAdapter<T> LIZ;

        public ChunkFrontLoadAdapter(TypeAdapter<T> typeAdapter) {
            this.LIZ = typeAdapter;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0039
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // com.google.gson.TypeAdapter
        public final T read(X.C09CU r5) {
            /*
                r4 = this;
                r3 = 0
                if (r5 != 0) goto L4
                return r3
            L4:
                java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Exception -> L41
                r0 = 16384(0x4000, float:2.2959E-41)
                r1.<init>(r0)     // Catch: java.lang.Exception -> L41
                X.09DL r2 = new X.09DL     // Catch: java.lang.Exception -> L41
                r2.<init>(r1)     // Catch: java.lang.Exception -> L41
                r0 = 1
                r2.LLILZLL = r0     // Catch: java.lang.Throwable -> L31
                LIZ(r5, r2)     // Catch: java.lang.Throwable -> L31
                X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Exception -> L41
                java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L41
                java.util.concurrent.ExecutorService r2 = X.C823050WQl.LIZLLL()     // Catch: java.lang.Exception -> L41
                Y.ARunnableS35S1100000_31 r1 = new Y.ARunnableS35S1100000_31     // Catch: java.lang.Exception -> L41
                r0 = 0
                r1.<init>(r4, r3, r0)     // Catch: java.lang.Exception -> L41
                r2.execute(r1)     // Catch: java.lang.Exception -> L41
                com.google.gson.TypeAdapter<T> r0 = r4.LIZ     // Catch: java.lang.Exception -> L41
                java.lang.Object r0 = r0.fromJson(r3)     // Catch: java.lang.Exception -> L41
                return r0
            L31:
                r1 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L39
                throw r1     // Catch: java.lang.Throwable -> L36
            L36:
                r0 = move-exception
                r3 = r1
                goto L3a
            L39:
                r0 = move-exception
            L3a:
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L39
                X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Exception -> L41
                throw r0     // Catch: java.lang.Exception -> L41
            L41:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.performance.json.ExploreResponseInterceptorFactory.ChunkFrontLoadAdapter.read(X.09CU):java.lang.Object");
        }

        public static void LIZ(C09CU c09cu, C09DL c09dl) throws IOException {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ != null) {
                switch (C09CN.LIZ[c09d6LJJLIIIJ.ordinal()]) {
                    case 1:
                        c09cu.LIZIZ();
                        c09dl.LIZLLL();
                        while (c09cu.LJIIZILJ()) {
                            c09dl.LJIILLIIL(c09cu.LJJJJ());
                            LIZ(c09cu, c09dl);
                        }
                        c09cu.LJII();
                        c09dl.LJII();
                        break;
                    case 2:
                        c09cu.LIZ();
                        c09dl.LIZIZ();
                        while (c09cu.LJIIZILJ()) {
                            LIZ(c09cu, c09dl);
                        }
                        c09cu.LJI();
                        c09dl.LJI();
                        break;
                    case 3:
                        c09dl.LJJJJJ(c09cu.LJJJZ());
                        break;
                    case 4:
                        c09dl.LJIILL(c09cu.LJJJZ());
                        break;
                    case 5:
                        c09dl.LJJJJJL(c09cu.LJJ());
                        break;
                    case 6:
                        c09cu.LJJJJJL();
                        c09dl.LJIJJ();
                        break;
                }
            }
            c09cu.LJJZ();
        }

        public static int LIZJ(String str, Pattern pattern) {
            String strGroup;
            Integer numLJIIJJI;
            Matcher matcher = pattern.matcher(str);
            if (matcher.find() && (strGroup = matcher.group(1)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strGroup)) != null) {
                return numLJIIJJI.intValue();
            }
            return 0;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            this.LIZ.write(c09dl, t);
        }

        public static Integer LIZIZ(int i, String str, String str2) {
            if (i < 0 || i >= str.length() || str.charAt(i) != '{') {
                return null;
            }
            int length = str2.length();
            boolean z = false;
            boolean z2 = false;
            int i2 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (z) {
                    i++;
                    z = false;
                } else if (cCharAt == '\\') {
                    i++;
                    z = true;
                } else {
                    if (cCharAt == '\"') {
                        if (!z2 && i2 == 1) {
                            int i3 = i + length;
                            if (i3 + 1 < str.length()) {
                                int i4 = i + 1;
                                if (str.charAt(i4 + length) == '\"') {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length) {
                                            if (str.charAt(i4 + i5) != str2.charAt(i5)) {
                                                break;
                                            }
                                            i5++;
                                        } else {
                                            int i6 = i3 + 2;
                                            while (i6 < str.length() && C1244080iTm.LJ(str.charAt(i6))) {
                                                i6++;
                                            }
                                            if (i6 < str.length() && str.charAt(i6) == ':') {
                                                do {
                                                    i6++;
                                                    if (i6 >= str.length()) {
                                                        break;
                                                    }
                                                } while (C1244080iTm.LJ(str.charAt(i6)));
                                                int i7 = i6;
                                                while (i7 < str.length() && Character.isDigit(str.charAt(i7))) {
                                                    i7++;
                                                }
                                                if (i7 > i6) {
                                                    return C2095008Iq.LJIIJJI(str.substring(i6, i7));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z2 = !z2;
                    } else if (!z2) {
                        if (cCharAt != '{') {
                            if (cCharAt == '}' && i2 - 1 == 0) {
                                return null;
                            }
                        } else {
                            i2++;
                        }
                    }
                    i++;
                }
            }
            return null;
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        boolean z;
        Class<? super T> rawType = typeToken.getRawType();
        if (!Intrinsics.LJFF(rawType, ExploreAwemeList.class) && !Intrinsics.LJFF(rawType, ExploreTopicAwemeListResponse.class)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (Intrinsics.LJFF(rawType, ExploreAwemeList.class)) {
            return new ChunkFrontLoadAdapter(gson.LJIIJJI(this, typeToken));
        }
        if (!Intrinsics.LJFF(rawType, ExploreTopicAwemeListResponse.class)) {
            return null;
        }
        return new ChunkFrontLoadAdapter(gson.LJIIJJI(this, typeToken));
    }
}
