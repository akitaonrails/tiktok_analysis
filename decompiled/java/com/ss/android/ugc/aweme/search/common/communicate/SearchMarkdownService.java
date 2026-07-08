package com.ss.android.ugc.aweme.search.common.communicate;

import X.C0GV2;
import X.C0GV3;
import X.C0R20;
import X.C13LP;
import X.C13LQ;
import X.C1529010ptL;
import X.C1697810uHb;
import X.C1860120yVO;
import X.C1860130yVP;
import X.C1860140yVQ;
import X.C21408418qI;
import X.C21416318rZ;
import X.C21419418s4;
import X.C21432318u9;
import X.C2188811AlT;
import X.C259800zU;
import X.C341990Dav;
import X.C418440Gaw;
import X.C445180Hcy;
import X.C445210Hd1;
import X.C445220Hd2;
import X.C445260Hd6;
import X.C445280Hd8;
import X.C445300HdA;
import X.C445340HdE;
import X.C448880Hiw;
import X.C661350Pwr;
import X.C689240R1u;
import X.C689270R1x;
import X.C814420VxA;
import X.InterfaceC328580CuO;
import X.InterfaceC328600CuQ;
import X.InterfaceC342000Daw;
import Y.AComparatorS509S0100000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.style.LeadingMarginSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;
import io.noties.markwon.core.spans.CustomLinkSpan;
import io.noties.markwon.core.spans.LinkSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS1S0403000_10;
import kotlin.jvm.internal.AwS41S0102000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMarkdownService implements ISearchMarkdownService {
    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final C21419418s4 LIZ(Context context) {
        C689240R1u.LIZ.getClass();
        return C689240R1u.LJ(context, null);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final String LIZIZ(String str) {
        return C1529010ptL.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LIZLLL(Context context) {
        C21432318u9.LIZ.getClass();
        C21432318u9.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final Bitmap LJI(Context context) {
        C689240R1u.LIZ.getClass();
        return (Bitmap) C689240R1u.LJI.invoke(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final C21408418qI LJII(int i, Context context) {
        C689240R1u.LIZ.getClass();
        C689270R1x c689270R1x = new C689270R1x();
        AFwS241S0000000_10 aFwS241S0000000_10 = C689240R1u.LJIILJJIL;
        c689270R1x.LIZLLL = ((Number) aFwS241S0000000_10.invoke(context)).intValue();
        c689270R1x.LIZ = ((Number) aFwS241S0000000_10.invoke(context)).intValue();
        int i2 = C689240R1u.LJJIII;
        c689270R1x.LIZIZ = i2;
        return new C21408418qI(c689270R1x, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)), i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0, C418440Gaw.LIZIZ(15), C418440Gaw.LIZIZ(12), 0.0f, 0.0f, ((Number) C689240R1u.LJIILIIL.invoke(context)).intValue(), new C1860120yVO(), 1, true, false, C689240R1u.LJJIIJ, C689240R1u.LJJIIZ, 1, 0, 2234816);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LJFF(Context context, C1860130yVP c1860130yVP, int i, int i2) {
        C341990Dav.LIZ(c1860130yVP, context, i, i2, null, 8);
    }

    public static void LJIIIZ(int i, C1860140yVQ c1860140yVQ, List list, int i2, int i3, StringBuilder sb) {
        int i4 = i + 1;
        while (i4 < list.size()) {
            int i5 = i4 + 1;
            Object obj = ListProtector.get(list, i4);
            int spanStart = c1860140yVQ.LIZ.getSpanStart(obj);
            int spanEnd = c1860140yVQ.LIZ.getSpanEnd(obj);
            if (spanEnd <= i2) {
                if (!(obj instanceof C445300HdA) && !(obj instanceof C445180Hcy)) {
                    if (!(obj instanceof C445280Hd8)) {
                        if (!list.isEmpty()) {
                            for (Object obj2 : list) {
                                if (c1860140yVQ.LIZ.getSpanStart(obj2) > spanStart || c1860140yVQ.LIZ.getSpanEnd(obj2) < spanEnd || (!(obj2 instanceof C445180Hcy) && !(obj2 instanceof C445300HdA))) {
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                int i6 = i2 - i3;
                int i7 = i6 - 3;
                if (i7 >= 0 && Intrinsics.LJFF(sb.substring(i7, i6), "\n \n")) {
                    sb.replace(i7, i6, "\n");
                    return;
                }
                int i8 = i6 - 2;
                if (i8 < 0 || !Intrinsics.LJFF(sb.substring(i8, i6), "\n\n")) {
                    return;
                }
                sb.replace(i8, i6, "\n");
                return;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LIZJ(CharSequence charSequence, InterfaceC342000Daw interfaceC342000Daw, int i, int i2, StringBuilder sb, boolean z) {
        C1860140yVQ c1860140yVQ;
        String strSubstring;
        String string;
        if ((interfaceC342000Daw instanceof C1860140yVQ) && (c1860140yVQ = (C1860140yVQ) interfaceC342000Daw) != null) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new ArrayList();
            List listLJJLL = C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, charSequence.length(), C448880Hiw.class));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLL) {
                int spanStart = c1860140yVQ.LIZ.getSpanStart(obj);
                if (i <= spanStart && spanStart < i2) {
                    arrayList.add(obj);
                }
            }
            List listLJJLL2 = C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, charSequence.length(), LeadingMarginSpan.class));
            List listLJJLL3 = C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, charSequence.length(), C445260Hd6.class));
            List listLJJLL4 = C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, charSequence.length(), CustomLinkSpan.class));
            List listLJJLL5 = C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, charSequence.length(), C21416318rZ.class));
            List listLJJLL6 = C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, charSequence.length(), C445280Hd8.class));
            ((List) c259800zU.element).addAll(arrayList);
            ((List) c259800zU.element).addAll(listLJJLL2);
            ((List) c259800zU.element).addAll(listLJJLL3);
            ((List) c259800zU.element).addAll(listLJJLL4);
            ((List) c259800zU.element).addAll(listLJJLL5);
            ((List) c259800zU.element).addAll(listLJJLL6);
            ?? arrayList2 = new ArrayList(C13LP.LJLLLL(new AComparatorS509S0100000_10(c1860140yVQ, 0), (Iterable) c259800zU.element));
            c259800zU.element = arrayList2;
            int i3 = 0;
            int spanEnd = 0;
            for (Object obj2 : arrayList2) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (obj2 instanceof C445340HdE) {
                        int spanStart2 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        if (i <= spanStart2 && spanStart2 < i2) {
                            sb.insert(spanStart2 - i, ((C445340HdE) obj2).LLILZIL);
                        }
                    } else if (obj2 instanceof C445300HdA) {
                        int spanStart3 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        if (i <= spanStart3 && spanStart3 < i2) {
                            sb.insert(spanStart3 - i, ((C445300HdA) obj2).LL);
                            C661350Pwr.LJFF(new AwS1S0403000_10(this, i3, c1860140yVQ, c259800zU, spanStart3, i, sb, 0));
                        }
                    } else if (obj2 instanceof C445220Hd2) {
                        int spanStart4 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        if (i <= spanStart4 && spanStart4 < i2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(u.LJJ(((C445220Hd2) obj2).LLILZIL, " "));
                            sbLIZ.append("• ");
                            sb.insert(spanStart4 - i, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else if (obj2 instanceof C445210Hd1) {
                        int spanStart5 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        if (i <= spanStart5 && spanStart5 < i2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(u.LJJ(((C445210Hd1) obj2).LLILLJJLI, " "));
                            sbLIZ2.append("• ");
                            sb.insert(spanStart5 - i, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else if (obj2 instanceof C445180Hcy) {
                        int spanStart6 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        if (i <= spanStart6 && spanStart6 < i2) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(u.LJJ(((C445180Hcy) obj2).LL, " "));
                            sbLIZ3.append("• ");
                            sb.insert(spanStart6 - i, C2188811AlT.LIZIZ(sbLIZ3));
                            C661350Pwr.LJFF(new AwS1S0403000_10(this, i3, c1860140yVQ, c259800zU, spanStart6, i, sb, 1));
                        }
                    } else if (obj2 instanceof CustomLinkSpan) {
                        int spanStart7 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        int spanEnd2 = c1860140yVQ.LIZ.getSpanEnd(obj2);
                        if (i <= spanStart7 && spanStart7 < i2 && spanEnd2 <= i2) {
                            int i5 = spanStart7 - i;
                            int i6 = spanEnd2 - i;
                            if (z) {
                                string = ((LinkSpan) obj2).link;
                            } else {
                                string = charSequence.subSequence(spanStart7, spanEnd2).toString();
                            }
                            sb.replace(i5, i6, string);
                        }
                    } else if (obj2 instanceof C448880Hiw) {
                        int spanStart8 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        spanEnd += c1860140yVQ.LIZ.getSpanEnd(obj2) - spanStart8;
                        C448880Hiw c448880Hiw = (C448880Hiw) obj2;
                        Integer num = c448880Hiw.LLILLJJLI.LJIIL;
                        if (num != null && num.intValue() == 0 && i <= spanStart8 && spanStart8 < i2) {
                            int i7 = spanStart8 - i;
                            sb.delete(i7, i7 + spanEnd);
                            String str = c448880Hiw.LLILLJJLI.LIZ;
                            int i8 = 0;
                            boolean z2 = false;
                            while (true) {
                                if (i8 >= str.length() || str.charAt(i8) != '\n') {
                                    break;
                                }
                                if (!z2) {
                                    i8++;
                                    z2 = true;
                                } else {
                                    do {
                                        i8++;
                                        if (i8 >= str.length()) {
                                            break;
                                        }
                                    } while (str.charAt(i8) == '\n');
                                }
                            }
                            int length = str.length() - 1;
                            boolean z3 = false;
                            while (true) {
                                if (length < 0 || str.charAt(length) != '\n') {
                                    break;
                                }
                                if (!z3) {
                                    length--;
                                    z3 = true;
                                } else {
                                    do {
                                        length--;
                                        if (length < 0) {
                                            break;
                                        }
                                    } while (str.charAt(length) == '\n');
                                }
                            }
                            if (i8 <= length) {
                                strSubstring = str.substring(i8, length + 1);
                            } else {
                                strSubstring = "\n";
                            }
                            sb.insert(i7, strSubstring);
                            spanEnd = 0;
                        }
                    } else if (obj2 instanceof C445260Hd6) {
                        int spanStart9 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        int spanEnd3 = c1860140yVQ.LIZ.getSpanEnd(obj2);
                        if (i <= spanStart9 && spanStart9 < i2 && spanEnd3 <= i2) {
                            sb.replace(spanStart9 - i, spanEnd3 - i, "");
                        }
                    } else if (obj2 instanceof C445280Hd8) {
                        int spanStart10 = c1860140yVQ.LIZ.getSpanStart(obj2);
                        int spanEnd4 = c1860140yVQ.LIZ.getSpanEnd(obj2);
                        if (spanStart10 >= i && spanEnd4 <= i2) {
                            sb.replace(spanStart10 - i, spanEnd4 - i, "");
                            C661350Pwr.LJFF(new AwS41S0102000_10(spanStart10, i, sb, 0));
                        } else if (spanStart10 < i && spanEnd4 > i2) {
                            sb.replace(0, sb.length(), "");
                        } else if (spanStart10 < i && i <= spanEnd4 && spanEnd4 <= i2) {
                            sb.replace(0, spanEnd4 - i, "");
                        } else if (i <= spanStart10 && spanStart10 <= i2 && spanEnd4 > i2) {
                            sb.replace(spanStart10 - i, sb.length(), "");
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LJIIIIZZ(C1860130yVP c1860130yVP, String str, C21419418s4 c21419418s4, InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3) {
        C341990Dav.LIZLLL(c1860130yVP, str, c21419418s4, interfaceC328600CuQ, interfaceC328600CuQ2, c0r20, interfaceC328580CuO, c0gv2, c0gv3, null, false, null, null, 3840);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final C21408418qI LJ(Context context, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i9;
        C689240R1u.LIZ.getClass();
        C689270R1x c689270R1x = new C689270R1x();
        c689270R1x.LIZLLL = i2;
        c689270R1x.LIZ = i3;
        c689270R1x.LIZIZ = i5;
        if (i10 <= 0) {
            i10 = i;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        float fLIZIZ = C418440Gaw.LIZIZ(0);
        return new C21408418qI(c689270R1x, i, i10, i4 + i5, iLIZIZ, i7, i8, C418440Gaw.LIZIZ(15), fLIZIZ, C418440Gaw.LIZIZ(8), f, ((Number) C689240R1u.LJIILIIL.invoke(context)).intValue(), new C1860120yVO(), 0, true, true, C689240R1u.LJJIIJ, C689240R1u.LJJIIZ, 0, i6, 256);
    }
}
