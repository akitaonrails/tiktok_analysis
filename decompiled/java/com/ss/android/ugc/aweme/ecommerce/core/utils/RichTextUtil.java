package com.ss.android.ugc.aweme.ecommerce.core.utils;

import X.AnonymousClass0317;
import X.C034S;
import X.C038N;
import X.C03GB;
import X.C098200Yq;
import X.C0H9H;
import X.C0OM1;
import X.C1120604Zw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1331660kl2;
import X.C13LP;
import X.C1541950qED;
import X.C1744700vVE;
import X.C189200o6;
import X.C1AF0;
import X.C1AQS;
import X.C20642515q3;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C419890GdH;
import X.C434230H0z;
import X.C444920HcY;
import X.C679280Qkg;
import X.C770702zh;
import X.C7736030k;
import X.C786410Ut5;
import X.C806503Db;
import X.C808703Dx;
import X.C814420VxA;
import X.C919503ib;
import X.C928203k0;
import X.C958103op;
import X.C960203pA;
import X.InterfaceC1106350etd;
import X.InterfaceC1331910klR;
import X.InterfaceC1542320qEo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy.UserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class RichTextUtil {
    public static final RichTextUtil LIZ = new RichTextUtil();
    public static final List<Integer> LIZIZ = Collections.singletonList(10);

    public static String LIZJ(LogisticLinkRichText logisticLinkRichText) {
        String str;
        String str2 = logisticLinkRichText.template;
        if (str2 != null && str2.length() != 0) {
            StringBuilder sb = new StringBuilder(logisticLinkRichText.template);
            Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
            if (map != null) {
                for (String str3 : map.keySet()) {
                    LogisticLinkText logisticLinkText = map.get(str3);
                    if (logisticLinkText != null && (str = logisticLinkText.text) != null) {
                        C806503Db.LIZ(sb, str3, str);
                    }
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static SpannableStringBuilder LIZIZ(LogisticLinkRichText logisticLinkRichText, final Context context) {
        boolean z;
        String str;
        Integer num;
        String str2 = logisticLinkRichText.template;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(logisticLinkRichText.template);
        Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
        if (map != null) {
            if (context != null && C1744700vVE.LJ(context, null) && C770702zh.LIZ(logisticLinkRichText.textDarkColor)) {
                str = logisticLinkRichText.textDarkColor;
            } else {
                str = logisticLinkRichText.textColor;
            }
            if (str != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(ColorProtector.parseColor(str)), 0, spannableStringBuilder.length(), 17);
            }
            for (String str3 : map.keySet()) {
                final LogisticLinkText logisticLinkText = map.get(str3);
                if (logisticLinkText != null) {
                    String str4 = logisticLinkText.text;
                    if (str4 == null) {
                        str4 = "";
                    }
                    int length = 0;
                    while (true) {
                        int iLJJJ = a0.LJJJ(spannableStringBuilder, str3, length, false, 4);
                        if (iLJJJ <= -1) {
                            break;
                        }
                        length = str3.length() + iLJJJ;
                        LIZ.getClass();
                        if (length <= spannableStringBuilder.length()) {
                            spannableStringBuilder.replace(iLJJJ, length, (CharSequence) str4);
                            length = str4.length() + iLJJJ;
                            Boolean bool = logisticLinkText.isBold;
                            Boolean bool2 = Boolean.TRUE;
                            if (Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(logisticLinkText.isItalic, bool2)) {
                                num = 3;
                            } else if (Intrinsics.LJFF(logisticLinkText.isBold, bool2)) {
                                num = 1;
                            } else {
                                if (Intrinsics.LJFF(logisticLinkText.isItalic, bool2)) {
                                    num = 2;
                                }
                                C786410Ut5.q2(spannableStringBuilder, new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$replaceSpan$1
                                    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        String str5;
                                        if (Intrinsics.LJFF(logisticLinkText.hasUnderscore, Boolean.TRUE)) {
                                            textPaint.setUnderlineText(true);
                                        }
                                        Context context2 = context;
                                        if (context2 != null && C960203pA.LIZIZ(context2) && C770702zh.LIZ(logisticLinkText.darkColor)) {
                                            str5 = logisticLinkText.darkColor;
                                        } else {
                                            str5 = logisticLinkText.color;
                                        }
                                        if (logisticLinkText.color != null) {
                                            textPaint.setColor(ColorProtector.parseColor(str5));
                                        }
                                    }
                                }, iLJJJ, length, 17);
                            }
                            if (num != null) {
                                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(num.intValue()), iLJJJ, length, 17);
                            }
                            C786410Ut5.q2(spannableStringBuilder, new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$replaceSpan$1
                                @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    String str5;
                                    if (Intrinsics.LJFF(logisticLinkText.hasUnderscore, Boolean.TRUE)) {
                                        textPaint.setUnderlineText(true);
                                    }
                                    Context context2 = context;
                                    if (context2 != null && C960203pA.LIZIZ(context2) && C770702zh.LIZ(logisticLinkText.darkColor)) {
                                        str5 = logisticLinkText.darkColor;
                                    } else {
                                        str5 = logisticLinkText.color;
                                    }
                                    if (logisticLinkText.color != null) {
                                        textPaint.setColor(ColorProtector.parseColor(str5));
                                    }
                                }
                            }, iLJJJ, length, 17);
                        }
                    }
                    if (length == 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ecommerce RichText arguments key not in template, key ");
                        sbLIZ.append(str3);
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    public static LinkText LJIIIIZZ(LinkText linkText, long j) {
        String strJ4;
        if (!C770702zh.LIZIZ(linkText.getEndTime())) {
            return linkText;
        }
        long j2 = 60;
        long j3 = (j / 1000) % j2;
        long j4 = (j / 60000) % j2;
        long j5 = (j / 3600000) % ((long) 24);
        long j6 = j / 86400000;
        if (j6 > 0) {
            strJ4 = C786410Ut5.j4("%02d:%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}, 4));
        } else {
            strJ4 = C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}, 3));
        }
        return linkText.copy(strJ4, linkText.format, linkText.endTime, linkText.link, linkText.isThirdPartyLink, linkText.name, linkText.isBold, linkText.hasUnderscore, linkText.color, linkText.darkColor, linkText.textColor, linkText.showArrow, linkText.textRawColor, linkText.hasStrike, linkText.linkTextType, linkText.icon, linkText.textFontType);
    }

    public static SpannableStringBuilder LIZ(LogisticLinkRichText logisticLinkRichText, View view, Function1 function1) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        final String str2;
        Object c098200Yq;
        Context context;
        Context context2;
        String str3;
        String str4 = logisticLinkRichText.template;
        if (str4 != null && str4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        StringBuilder sb = new StringBuilder(logisticLinkRichText.template);
        Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str5 : map.keySet()) {
                LogisticLinkText logisticLinkText = map.get(str5);
                if (logisticLinkText != null && (str3 = logisticLinkText.text) != null) {
                    if (sb.indexOf(str5) != -1) {
                        linkedHashMap.put(str5, logisticLinkText);
                    }
                    C806503Db.LIZ(sb, str5, str3);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            if (view != null && (context2 = view.getContext()) != null && C1744700vVE.LJ(context2, null)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && C770702zh.LIZ(logisticLinkRichText.textDarkColor)) {
                str = logisticLinkRichText.textDarkColor;
            } else {
                str = logisticLinkRichText.textColor;
            }
            if (str != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(ColorProtector.parseColor(str)), 0, spannableStringBuilder.length(), 17);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                entry.getKey();
                final LogisticLinkText logisticLinkText2 = (LogisticLinkText) entry.getValue();
                String str6 = logisticLinkText2.text;
                if (str6 != null) {
                    int iIndexOf = sb.indexOf(str6);
                    int length = str6.length() + iIndexOf;
                    if (iIndexOf >= 0 && length <= sb.length()) {
                        if (view != null && (context = view.getContext()) != null && C1744700vVE.LJ(context, null)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && C770702zh.LIZ(logisticLinkText2.darkColor)) {
                            str2 = logisticLinkText2.darkColor;
                        } else {
                            str2 = logisticLinkText2.color;
                        }
                        C786410Ut5.q2(spannableStringBuilder, new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$build$2$3
                            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                if (Intrinsics.LJFF(logisticLinkText2.hasUnderscore, Boolean.TRUE)) {
                                    textPaint.setUnderlineText(true);
                                }
                                if (logisticLinkText2.color != null) {
                                    textPaint.setColor(ColorProtector.parseColor(str2));
                                }
                            }
                        }, iIndexOf, length, 17);
                        Boolean bool = logisticLinkText2.isBold;
                        if (bool != null && bool.booleanValue()) {
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIndexOf, length, 17);
                        }
                        if (str2 != null) {
                            try {
                                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(Color.parseColor(str2)), iIndexOf, length, 17);
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m1boximpl(c098200Yq);
                        }
                        function1.invoke(new Object() { // from class: X.03Dw
                        });
                    }
                }
            }
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder(sb);
    }

    public static SpannableStringBuilder LJFF(RichTextUtil richTextUtil, Context context, String str, Map map, Integer num, int i) {
        int iIntValue;
        SpannableStringBuilder spannableStringBuilder = null;
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        richTextUtil.getClass();
        if (str != null) {
            spannableStringBuilder = new SpannableStringBuilder(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.attr.a04;
            }
            int iLIZ = C960203pA.LIZ(iIntValue, context);
            if (map != null) {
                for (String str2 : map.keySet()) {
                    String str3 = (String) map.get(str2);
                    if (str3 != null && str3.length() != 0) {
                        int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, 0, false, 6);
                        int length = str2.length() + iLJJJ;
                        if (iLJJJ >= 0 && length <= spannableStringBuilder.length()) {
                            spannableStringBuilder.replace(iLJJJ, length, (CharSequence) str3);
                            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZ), iLJJJ, str3.length() + iLJJJ, 17);
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [T, com.bytedance.tux.navigation.TuxNavBar] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.03Dt] */
    public static void LJII(boolean z, String str, Boolean bool, final Context context, C808703Dx c808703Dx, String str2, String str3, boolean z2, Float f) {
        boolean z3;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z4;
        String name;
        String strLIZIZ;
        boolean z5;
        float fLJIIJ;
        int iLIZ;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strLIZIZ2 = str;
        boolean zBooleanValue = false;
        if (z) {
            if (strLIZIZ2 != null && (u.LJJIIJZLJL(strLIZIZ2, "https://", false) || u.LJJIIJZLJL(strLIZIZ2, "http://", false))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://echybrid?url=");
                sbLIZ.append(strLIZIZ2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            SmartRouter.buildRoute(context, UriProtector.parse(strLIZIZ2).toString()).open();
            return;
        }
        C928203k0.LIZ.getClass();
        if (!Intrinsics.LJFF(str2, "one_step_checkout") && !Intrinsics.LJFF(str2, "one_click_pay") && !Intrinsics.LJFF(str2, "multi_express_checkout")) {
            z3 = false;
        } else {
            z3 = true;
        }
        String str4 = "";
        if (z3) {
            if (strLIZIZ2 == null || strLIZIZ2.length() == 0) {
                return;
            }
            if (!u.LJJIIJZLJL(strLIZIZ2, "https://", false) && !u.LJJIIJZLJL(strLIZIZ2, "http://", false)) {
                strLIZIZ = strLIZIZ2;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("aweme://echybrid?url=");
                sbLIZ2.append(strLIZIZ2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            Uri uri = UriProtector.parse(strLIZIZ);
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hide_policy_nav")) != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (c808703Dx != null && (strLIZIZ = C038N.LIZIZ(c808703Dx.LIZ, strLIZIZ2)) == null) {
                strLIZIZ = "";
            }
            if (z2 && strLIZIZ != null) {
                strLIZIZ = "aweme://webview_popup?use_spark=1&transition_animation=right&" + strLIZIZ.substring(a0.LJJJ(strLIZIZ, "url=", 0, false, 6));
            }
            SparkContext sparkContext = new SparkContext();
            final ?? r6 = new FrameLayout(context) { // from class: X.03Dt
                public TuxNavBar LL;
                public final TuxNavBar LLILLJJLI;

                public final TuxNavBar getTitleBarFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.xzl);
                        this.LL = (TuxNavBar) callbackFindViewById;
                    }
                    return (TuxNavBar) callbackFindViewById;
                }

                public final TuxNavBar getNavBar() {
                    return this.LLILLJJLI;
                }

                {
                    super(context, null, 0);
                    C786410Ut5.LJLLJ(context, R.layout.aub, this);
                    this.LLILLJJLI = getTitleBarFromXml();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C679280Qkg.LIZ(52));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                }

                public final void setTitleBarFromXml(TuxNavBar tuxNavBar) {
                    this.LL = tuxNavBar;
                }
            };
            final C259800zU c259800zU = new C259800zU();
            ?? navBar = r6.getNavBar();
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LJIIIIZZ = C20642515q3.LJI(2131823173);
            c1251150ifB.LIZJ(new AwS545S0100000_1(sparkContext, 1556));
            int dimension = 0;
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = "";
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            c0om1.LIZLLL = true;
            navBar.setNavActions(c0om1);
            c259800zU.element = navBar;
            if (z5) {
                dimension = (int) context.getResources().getDimension(R.dimen.az);
            }
            Integer numLJIIL = C928203k0.LJIIL(f, str2, str3);
            if (numLJIIL != null) {
                iLIZ = numLJIIL.intValue();
            } else {
                if (!Intrinsics.LJFF(str2, "one_step_checkout") && !Intrinsics.LJFF(str2, "multi_express_checkout")) {
                    if (Intrinsics.LJFF(str2, "mini_checkout")) {
                        fLJIIJ = C928203k0.LJIIZILJ() * 0.73f;
                    } else {
                        fLJIIJ = C958103op.LIZIZ();
                    }
                } else {
                    fLJIIJ = C928203k0.LJIIJ();
                }
                iLIZ = (int) fLJIIJ;
            }
            if (!z5) {
                iLIZ -= C679280Qkg.LIZ(52);
            }
            int iLIZIZ = C679280Qkg.LIZIZ(Integer.valueOf(iLIZ));
            if (strLIZIZ != null) {
                str4 = strLIZIZ;
            }
            sparkContext.LJJLIIJ(str4);
            sparkContext.LJJJLZIJ(iLIZIZ, "height");
            sparkContext.LJJJLZIJ(dimension, "radius");
            sparkContext.bizCert = new ThirdPartyBizCert(402685955);
            if (!z5) {
                sparkContext.LJJ(InterfaceC1106350etd.class, new InterfaceC1106350etd() { // from class: X.03Dv
                    @Override // X.InterfaceC1106350etd
                    public final View LIZ() {
                        return r6;
                    }
                });
                sparkContext.LJJLIL(new InterfaceC1542320qEo() { // from class: X.03Du
                    @Override // X.InterfaceC1542320qEo
                    public final void LIZ(String str5) {
                    }

                    @Override // X.InterfaceC1542320qEo
                    public final void LIZJ(String str5, boolean z6) {
                    }

                    @Override // X.InterfaceC1542320qEo
                    public final void LIZIZ(String str5) {
                        if (str5 != null) {
                            TuxNavBar tuxNavBar = c259800zU.element;
                            C1250250idj c1250250idj2 = new C1250250idj();
                            c1250250idj2.LIZJ = str5;
                            tuxNavBar.LJIJJ(c1250250idj2);
                        }
                    }
                });
            }
            if (context == null) {
                return;
            }
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
            return;
        }
        if (c808703Dx != null) {
            strLIZIZ2 = C038N.LIZIZ(c808703Dx.LIZ, strLIZIZ2);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z4);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        if (strLIZIZ2 != null) {
            str4 = strLIZIZ2;
        }
        C03GB c03gb = UserTrustCell.LLJ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        c03gb.getClass();
        iBusinessDependencyService.bulletStart(context, C919503ib.LIZJ(str4, C03GB.LIZ(zBooleanValue)).build().toString(), null, null);
    }

    public static SpannableStringBuilder LIZLLL(final Context context, String str, Map map, Integer num, final int i, final boolean z, final Integer num2, final C808703Dx c808703Dx, final Function1 function1, final String str2, final String str3, final boolean z2, final boolean z3, final Float f, final Function0 function0) {
        int iIntValue;
        List<String> urls;
        String str4;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (num != null) {
            num.intValue();
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), 0, str.length(), 17);
        }
        if (map != null) {
            for (String str5 : map.keySet()) {
                final LinkText linkText = (LinkText) map.get(str5);
                if (linkText != null) {
                    Integer linkTextType = linkText.getLinkTextType();
                    if (linkTextType != null && linkTextType.intValue() == 1 && linkText.getIcon() != null) {
                        int iLJJJ = a0.LJJJ(spannableStringBuilder, str5, 0, false, 6);
                        int length = str5.length() + iLJJJ;
                        if (iLJJJ >= 0 && length <= spannableStringBuilder.length()) {
                            spannableStringBuilder.replace(iLJJJ, length, (CharSequence) " ");
                            int i2 = iLJJJ + 1;
                            Icon icon = linkText.getIcon();
                            Integer viewWidth = icon.getViewWidth();
                            int iIntValue2 = 16;
                            if (viewWidth != null) {
                                iIntValue = viewWidth.intValue();
                            } else {
                                iIntValue = 16;
                            }
                            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                            Integer viewHeight = icon.getViewHeight();
                            if (viewHeight != null) {
                                iIntValue2 = viewHeight.intValue();
                            }
                            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                            final LevelListDrawable levelListDrawable = new LevelListDrawable();
                            levelListDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ2);
                            Image imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(context);
                            if (imageRequireImageForEcDarkMode != null && (urls = imageRequireImageForEcDarkMode.getUrls()) != null && (str4 = (String) C13LP.LJJJLL(urls)) != null) {
                                C1331660kl2.LJIIIZ(str4).LJJII(new InterfaceC1331910klR() { // from class: X.03ED
                                    @Override // X.InterfaceC1331910klR
                                    public final void onCanceled() {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onFailed(Throwable th) {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onProgress(float f2) {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void LIZ(final Bitmap bitmap) {
                                        if (bitmap == null) {
                                            return;
                                        }
                                        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                                        final LevelListDrawable levelListDrawable2 = levelListDrawable;
                                        final Context context2 = context;
                                        final int i3 = iLIZIZ;
                                        final int i4 = iLIZIZ2;
                                        final Function0<Unit> function02 = function0;
                                        C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.03EC
                                            public final void LIZ() {
                                                levelListDrawable2.addLevel(1, 1, new BitmapDrawable(context2.getResources(), bitmap));
                                                levelListDrawable2.setBounds(0, 0, i3, i4);
                                                levelListDrawable2.setLevel(1);
                                                Function0<Unit> function03 = function02;
                                                if (function03 != null) {
                                                    function03.invoke();
                                                }
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ;
                                                C1C7U.LIZ("RichTextUtil@aeba.handleLinkRichText$2$1$1$onCompleted$1");
                                                try {
                                                    LIZ();
                                                } finally {
                                                    if (!zLIZ) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("RichTextUtil@aeba.handleLinkRichText$2$1$1$onCompleted$1");
                                            }
                                        });
                                    }
                                });
                            }
                            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(levelListDrawable, 2), iLJJJ, i2, 17);
                        }
                    } else {
                        String text = linkText.getText();
                        if (text == null) {
                            text = "";
                        }
                        int iLJJJ2 = a0.LJJJ(spannableStringBuilder, str5, 0, false, 6);
                        int length2 = str5.length() + iLJJJ2;
                        if (iLJJJ2 >= 0 && length2 <= spannableStringBuilder.length()) {
                            spannableStringBuilder.replace(iLJJJ2, length2, (CharSequence) text);
                            int length3 = text.length() + iLJJJ2;
                            if (!Intrinsics.LJFF(linkText.isBold(), Boolean.FALSE)) {
                                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ2, length3, 17);
                            }
                            if (Intrinsics.LJFF(linkText.getHasStrike(), Boolean.TRUE)) {
                                C786410Ut5.q2(spannableStringBuilder, new StrikethroughSpan(), iLJJJ2, length3, 17);
                            }
                            if (linkText.getTextFontType() != null) {
                                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(C7736030k.LIZJ(linkText.getTextFontType(), null), false), iLJJJ2, length3, 17);
                                if (LIZIZ.contains(linkText.getTextFontType())) {
                                    RichTextUtil richTextUtil = LIZ;
                                    int iIntValue3 = linkText.getTextFontType().intValue();
                                    richTextUtil.getClass();
                                    if (iIntValue3 == 10) {
                                        C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(8, true), iLJJJ2, length3, 33);
                                        C786410Ut5.q2(spannableStringBuilder, new C434230H0z(C0H9H.LIZIZ(8)), iLJJJ2, length3, 33);
                                    }
                                }
                            }
                            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.038y
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    String link = linkText.getLink();
                                    if (link != null && link.length() != 0 && !z3) {
                                        RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                                        boolean z4 = z;
                                        String link2 = linkText.getLink();
                                        Boolean boolIsThirdPartyLink = linkText.isThirdPartyLink();
                                        Context context2 = context;
                                        C808703Dx c808703Dx2 = c808703Dx;
                                        String str6 = str2;
                                        String str7 = str3;
                                        boolean z5 = z2;
                                        Float f2 = f;
                                        richTextUtil2.getClass();
                                        RichTextUtil.LJII(z4, link2, boolIsThirdPartyLink, context2, c808703Dx2, str6, str7, z5, f2);
                                        Function1<LinkText, Unit> function12 = function1;
                                        if (function12 != null) {
                                            function12.invoke(linkText);
                                            return;
                                        }
                                        return;
                                    }
                                    Function1<LinkText, Unit> function13 = function1;
                                    if (function13 != null) {
                                        function13.invoke(linkText);
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    int iLIZ;
                                    String color;
                                    try {
                                        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
                                        if (numLIZJ != null) {
                                            iLIZ = numLIZJ.intValue();
                                        } else if (linkText.getTextColor() != null) {
                                            iLIZ = C7959038z.LIZ(context, linkText.getTextColor());
                                        } else if (linkText.getTextRawColor() != null) {
                                            if (C1744700vVE.LJ(context, null)) {
                                                color = linkText.getTextRawColor().getDarkColor();
                                            } else {
                                                color = linkText.getTextRawColor().getColor();
                                            }
                                            if (color != null) {
                                                iLIZ = C0HEZ.LIZIZ(color);
                                            } else {
                                                iLIZ = C960203pA.LIZ(R.attr.a1h, context);
                                            }
                                        } else if (linkText.getColor() != null && !C1744700vVE.LJ(context, null)) {
                                            iLIZ = Color.parseColor(linkText.getColor());
                                        } else if (linkText.getDarkColor() != null && C1744700vVE.LJ(context, null)) {
                                            iLIZ = Color.parseColor(linkText.getDarkColor());
                                        } else {
                                            iLIZ = C960203pA.LIZ(R.attr.a1h, context);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        iLIZ = C960203pA.LIZ(R.attr.a1h, context);
                                    }
                                    textPaint.setColor(iLIZ);
                                    Integer num3 = num2;
                                    if (num3 != null) {
                                        int iIntValue4 = num3.intValue();
                                        C444890HcV c444890HcV = new C444890HcV();
                                        c444890HcV.LIZ(iIntValue4);
                                        textPaint.setTypeface(c444890HcV.getTypeface());
                                    }
                                    textPaint.setUnderlineText(Intrinsics.LJFF(linkText.getHasUnderscore(), Boolean.TRUE));
                                }
                            }, iLJJJ2, length3, 17);
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LJ(RichTextUtil richTextUtil, Context context, LinkRichText linkRichText, Integer num, int i, boolean z, Integer num2, C808703Dx c808703Dx, String str, String str2, boolean z2, boolean z3, Float f, AwS545S0100000_1 awS545S0100000_1, Function1 function1, int i2) {
        AwS545S0100000_1 awS545S0100000_12 = awS545S0100000_1;
        Float f2 = f;
        boolean z4 = z2;
        String str3 = str2;
        String str4 = str;
        C808703Dx c808703Dx2 = c808703Dx;
        Integer num3 = num2;
        boolean z5 = z;
        int i3 = i;
        Integer num4 = num;
        Function1 function12 = null;
        if ((i2 & 4) != 0) {
            num4 = null;
        }
        boolean z6 = false;
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        }
        if ((i2 & 32) != 0) {
            num3 = null;
        }
        if ((i2 & 64) != 0) {
            c808703Dx2 = null;
        }
        if ((i2 & 128) != 0) {
            str4 = "normal_checkout";
        }
        if ((i2 & 256) != 0) {
            str3 = null;
        }
        if ((i2 & 512) != 0) {
            z4 = false;
        }
        if ((i2 & 1024) == 0) {
            z6 = z3;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            f2 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            awS545S0100000_12 = null;
        }
        if ((i2 & 8192) == 0) {
            function12 = function1;
        }
        richTextUtil.getClass();
        return LIZLLL(context, linkRichText.template, linkRichText.arguments, num4, i3, z5, num3, c808703Dx2, function12, str4, str3, z4, z6, f2, awS545S0100000_12);
    }
}
