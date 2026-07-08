package com.ss.android.ugc.aweme.ogc.news.anchor.producer;

import X.C01GW;
import X.C08JS;
import X.C098200Yq;
import X.C11K6;
import X.C11K9;
import X.C11NZ;
import X.C11S5;
import X.C11W0;
import X.C123100dR;
import X.C13BV;
import X.C189200o6;
import X.C19393010u0;
import X.C19513311Vz;
import X.C19651111uX;
import X.C19651211uY;
import X.C19651311uZ;
import X.C19651811ue;
import X.C19652011ug;
import X.C19652211ui;
import X.C19652411uk;
import X.C19652811uo;
import X.C19652911up;
import X.C19654511v5;
import X.C452501pT;
import X.C790060Uyy;
import X.EnumC19367210pq;
import X.EnumC19513211Vy;
import X.EnumC19651411ua;
import X.InterfaceC0148002o;
import X.InterfaceC1487280oo2;
import X.InterfaceC420801kM;
import Y.ACallableS21S1000000_3;
import Y.AfS178S0100000_9;
import Y.AfS188S0100000_19;
import Y.AfS195S0100000_26;
import Y.AfS54S1100000_29;
import Y.AkS46S1000000_29;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.NewsAnchorPublishPageConfig;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.Status;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS112S1200000_29;
import kotlin.jvm.internal.AwS113S1000000_29;
import kotlin.jvm.internal.AwS144S1200000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes30.dex */
public final class NewsAnchorPublishViewModel extends AssemViewModel<C19654511v5> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(104));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(105));
    public final C19651211uY<C19652211ui> LLILLL = new C19651211uY<>(new AwS573S0100000_29(this, 171));
    public final C19651211uY<C19652811uo> LLILZ = new C19651211uY<>(new AwS573S0100000_29(this, 169));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 170));
    public NewsAnchorPublishPageConfig LLILZLL = NewsAnchorPublishPageConfig.LIZ;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C19654511v5(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.NewsAnchorPublishPageConfig r0 = r5.LLILZLL
            java.lang.Boolean r0 = r0.isCustomTitle
            r2 = 0
            if (r0 == 0) goto L5a
            boolean r0 = r0.booleanValue()
        Lb:
            r4 = 1
            if (r0 == 0) goto L3e
            X.11uY<X.11ui> r0 = r5.LLILLL
            java.lang.Object r3 = r0.LIZ()
            X.11ui r3 = (X.C19652211ui) r3
            if (r3 == 0) goto L34
            boolean r0 = r3.LIZIZ
            if (r0 == r4) goto L3e
            java.lang.String r0 = r3.LIZ
            if (r0 == 0) goto L58
            int r0 = r0.length()
            if (r0 != 0) goto L58
            X.11uY<X.11ui> r0 = r5.LLILLL
            X.0NJD<X.11ua> r0 = r0.LIZLLL
            java.lang.Object r1 = r0.LIZ()
            X.11ua r0 = X.EnumC19651411ua.FINISHED
            if (r1 == r0) goto L3e
            if (r3 != 0) goto L58
        L34:
            X.11uY<X.11ui> r0 = r5.LLILLL
            X.0NJD<X.11ua> r0 = r0.LIZLLL
            java.lang.Object r0 = r0.LIZ()
            if (r0 != 0) goto L58
        L3e:
            r3 = 1
        L3f:
            X.11uY<X.11uo> r0 = r5.LLILZ
            java.lang.Object r0 = r0.LIZ()
            X.11uo r0 = (X.C19652811uo) r0
            if (r0 == 0) goto L4e
            boolean r0 = r0.LIZIZ
            if (r0 != r4) goto L4e
            r2 = 1
        L4e:
            kotlin.jvm.internal.AwS9S0020000_29 r1 = new kotlin.jvm.internal.AwS9S0020000_29
            r0 = 0
            r1.<init>(r2, r3, r0)
            r5.setState(r1)
            return
        L58:
            r3 = 0
            goto L3f
        L5a:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishViewModel.yQ2():void");
    }

    public final void vQ2(C19652411uk c19652411uk) {
        Fragment fragment;
        Integer numValueOf;
        EnumC19513211Vy enumC19513211Vy;
        String string;
        Object c098200Yq;
        String string2;
        Boolean boolValueOf;
        String string3;
        String string4;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Object c098200Yq2;
        boolean zBooleanValue;
        String str;
        Context context;
        Context context2;
        int i = C19393010u0.LIZ[c19652411uk.LIZ.ordinal()];
        Object obj = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Object obj2 = c19652411uk.LIZIZ;
                    if ((obj2 instanceof Context) && (context2 = (Context) obj2) != null) {
                        C790060Uyy.LIZLLL((C19651111uX) this.LLILZIL.getValue());
                        C790060Uyy.LJ(context2);
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj3 = c19652411uk.LIZIZ;
            if (!(obj3 instanceof Context) || (context = (Context) obj3) == null) {
                return;
            }
            C790060Uyy.LIZIZ(context);
            C790060Uyy.LIZJ((C19651111uX) this.LLILZIL.getValue());
            return;
        }
        Object obj4 = c19652411uk.LIZIZ;
        if (!(obj4 instanceof Fragment) || (fragment = (Fragment) obj4) == null) {
            return;
        }
        Bundle arguments = fragment.getArguments();
        C11W0 c11w0 = EnumC19513211Vy.Companion;
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("action"));
        } else {
            numValueOf = null;
        }
        c11w0.getClass();
        EnumC19513211Vy[] enumC19513211VyArrValues = EnumC19513211Vy.values();
        int length = enumC19513211VyArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                enumC19513211Vy = enumC19513211VyArrValues[i2];
                int type = enumC19513211Vy.getType();
                if (numValueOf != null && type == numValueOf.intValue()) {
                    break;
                } else {
                    i2++;
                }
            } else {
                enumC19513211Vy = EnumC19513211Vy.ADD;
                break;
            }
        }
        if (arguments == null) {
            string = null;
        } else {
            try {
                string = arguments.getString("icon");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (UrlModel) C08JS.LIZ(string, UrlModel.class);
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        UrlModel urlModel = (UrlModel) c098200Yq;
        if (arguments != null) {
            string2 = arguments.getString("content");
            boolValueOf = Boolean.valueOf(arguments.getBoolean("already_added"));
            string3 = arguments.getString("title");
            string4 = arguments.getString("link");
            boolValueOf2 = Boolean.valueOf(arguments.getBoolean("custom_title"));
            boolValueOf3 = Boolean.valueOf(arguments.getBoolean("is_editing_post"));
        } else {
            string2 = null;
            boolValueOf = null;
            string3 = null;
            string4 = null;
            boolValueOf2 = null;
            boolValueOf3 = null;
        }
        C19513311Vz c19513311Vz = new C19513311Vz(enumC19513211Vy, null, urlModel, string2, boolValueOf, string3, string4, boolValueOf2, boolValueOf3, 2);
        try {
            c098200Yq2 = (NewsAnchorPublishPageConfig) C08JS.LIZ(c19513311Vz.LIZLLL, NewsAnchorPublishPageConfig.class);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        NewsAnchorPublishPageConfig newsAnchorPublishPageConfig = (NewsAnchorPublishPageConfig) obj;
        if (newsAnchorPublishPageConfig == null) {
            newsAnchorPublishPageConfig = NewsAnchorPublishPageConfig.LIZ;
        }
        this.LLILZLL = newsAnchorPublishPageConfig;
        Boolean bool = c19513311Vz.LJIIIIZZ;
        Boolean bool2 = Boolean.TRUE;
        this.LLIZ = Intrinsics.LJFF(bool, bool2);
        Boolean bool3 = this.LLILZLL.isCustomTitle;
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        } else {
            zBooleanValue = false;
        }
        String str2 = c19513311Vz.LJI;
        if (!Intrinsics.LJFF(c19513311Vz.LJFF, this.LLILZLL.defaultTitle) && Intrinsics.LJFF(c19513311Vz.LJII, bool2)) {
            str = c19513311Vz.LJFF;
        } else {
            str = "";
        }
        setState(new C19651311uZ(zBooleanValue, c19513311Vz, this, str, str2));
        if (C123100dR.LIZ(str)) {
            xQ2(new C19652011ug(EnumC19367210pq.TITLE_CHANGE, str, true, false));
        }
        if (!C123100dR.LIZ(str2)) {
            return;
        }
        wQ2(new C19652011ug(EnumC19367210pq.LINK_CHANGE, str2, true, false));
    }

    public final void wQ2(C19652011ug c19652011ug) {
        String string;
        long j;
        InterfaceC420801kM interfaceC420801kMLJJLL;
        EnumC19651411ua enumC19651411uaLIZ;
        C19651211uY<C19652811uo> c19651211uY = this.LLILZ;
        CharSequence charSequence = c19652011ug.LIZIZ;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (c19652011ug.LIZLLL && Intrinsics.LJFF(c19651211uY.LIZIZ.LIZ(), string) && (enumC19651411uaLIZ = c19651211uY.LIZLLL.LIZ()) != null && enumC19651411uaLIZ != EnumC19651411ua.PENDING) {
            return;
        }
        final C19652911up c19652911up = (C19652911up) this.LLILLJJLI.getValue();
        final List list = this.LLILZLL.blockDomains;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        boolean z = c19652011ug.LIZJ;
        AwS144S1200000_29 awS144S1200000_29 = new AwS144S1200000_29(this, c19651211uY, string, 4);
        AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29((C19651211uY) c19651211uY, (C19651211uY<C19652811uo>) this, (NewsAnchorPublishViewModel) 22);
        AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29((C19651211uY) c19651211uY, (C19651211uY<C19652811uo>) this, (NewsAnchorPublishViewModel) 12);
        c19652911up.getClass();
        awS144S1200000_29.invoke();
        if (string.length() == 0) {
            interfaceC420801kMLJJLL = null;
            awS395S0200000_29.invoke(null);
        } else {
            final String strLIZIZ = C19651811ue.LIZIZ(string);
            C11K9 c11k9LJJJJZ = C11NZ.LJJJJZ(Boolean.TRUE);
            if (z) {
                j = 0;
            } else {
                j = 2;
            }
            interfaceC420801kMLJJLL = c11k9LJJJJZ.LJJI(j, TimeUnit.SECONDS).LJJIJIIJIL(new AfS178S0100000_9(awS430S0200000_29, 71)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.11uc
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Uri uri = UriProtector.parse(strLIZIZ);
                    AwS113S1000000_29 awS113S1000000_29 = new AwS113S1000000_29(strLIZIZ, 7);
                    if (((Boolean) obj).booleanValue()) {
                        String scheme = uri.getScheme();
                        if (scheme != null && scheme.length() != 0) {
                            C19652911up c19652911up2 = c19652911up;
                            String host = uri.getHost();
                            c19652911up2.getClass();
                            if (host != null && a0.LJJIIZI(host, e3.d, false) && !u.LJJIIJZLJL(host, e3.d, false) && !u.LJIIZILJ(host, e3.d, false)) {
                                List listLJJLIIIJ = a0.LJJLIIIJ(host, new char[]{'.'}, false, 0, 6);
                                if (listLJJLIIIJ.size() >= 2) {
                                    Iterator it2 = listLJJLIIIJ.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str = (String) it2.next();
                                            if (str.length() == 0 || !((Pattern) c19652911up2.LIZ.getValue()).matcher(str).matches()) {
                                                break;
                                            }
                                        } else {
                                            String path = uri.getPath();
                                            if (path != null && path.length() != 0) {
                                                List<String> list2 = list;
                                                String str2 = strLIZIZ;
                                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                                    for (String str3 : list2) {
                                                        Locale locale = Locale.ROOT;
                                                        if (a0.LJJIIZI(str2.toLowerCase(locale), str3.toLowerCase(locale), false)) {
                                                            return new C19652811uo(strLIZIZ, false, new Status("3004089", C20467080b.LIZIZ(2131826550)), false);
                                                        }
                                                    }
                                                }
                                                return awS113S1000000_29.invoke();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return new C19652811uo(strLIZIZ, false, new Status("3004090", C20467080b.LIZIZ(2131826549)), false);
                    }
                    return awS113S1000000_29.invoke();
                }
            }).LJJJ(new AkS46S1000000_29(strLIZIZ, 3), false).LJJLL(new AfS195S0100000_26(awS395S0200000_29, 7), new AfS54S1100000_29(strLIZIZ, awS395S0200000_29, 1));
        }
        c19651211uY.LIZJ.LIZIZ(interfaceC420801kMLJJLL);
    }

    public final void xQ2(C19652011ug c19652011ug) {
        final String string;
        final int iIntValue;
        long j;
        InterfaceC420801kM interfaceC420801kMLJJLL;
        EnumC19651411ua enumC19651411uaLIZ;
        C19651211uY<C19652211ui> c19651211uY = this.LLILLL;
        CharSequence charSequence = c19652011ug.LIZIZ;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (c19652011ug.LIZLLL && Intrinsics.LJFF(c19651211uY.LIZIZ.LIZ(), string) && (enumC19651411uaLIZ = c19651211uY.LIZLLL.LIZ()) != null && enumC19651411uaLIZ != EnumC19651411ua.PENDING) {
            return;
        }
        Object value = this.LLILLJJLI.getValue();
        Integer num = this.LLILZLL.titleMaximumLength;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 35;
        }
        boolean z = c19652011ug.LIZJ;
        AwS144S1200000_29 awS144S1200000_29 = new AwS144S1200000_29(this, c19651211uY, string, 5);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 168);
        AwS112S1200000_29 awS112S1200000_29 = new AwS112S1200000_29(this, c19651211uY, string, 4);
        value.getClass();
        awS144S1200000_29.invoke();
        if (string.length() == 0) {
            awS112S1200000_29.invoke(new C19652211ui(""));
            interfaceC420801kMLJJLL = null;
        } else {
            C11K6 c11k6LJJJJI = C11NZ.LJJJJI(new ACallableS21S1000000_3(string, 10));
            if (z) {
                j = 0;
            } else {
                j = 2;
            }
            interfaceC420801kMLJJLL = c11k6LJJJJI.LJJI(j, TimeUnit.SECONDS).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.11ub
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    if (C19651811ue.LIZ(string)) {
                        return new C19652211ui(C19651811ue.LIZIZ(string), false, new AbstractC19651711ud() { // from class: X.11ul
                            {
                                EnumC1153560g7m enumC1153560g7m = EnumC1153560g7m.ERROR;
                            }
                        });
                    }
                    if (string.length() == iIntValue) {
                        return new C19652211ui(C19651811ue.LIZIZ(string), true, new AbstractC19651711ud() { // from class: X.11un
                            {
                                EnumC1153560g7m enumC1153560g7m = EnumC1153560g7m.WARNING;
                            }
                        });
                    }
                    if (string.length() > iIntValue) {
                        return new C19652211ui(C19651811ue.LIZIZ(string), false, new AbstractC19651711ud() { // from class: X.11um
                            {
                                EnumC1153560g7m enumC1153560g7m = EnumC1153560g7m.ERROR;
                            }
                        });
                    }
                    return new C19652211ui(C19651811ue.LIZIZ(string));
                }
            }).LJJIJIIJIL(new AfS178S0100000_9(awS573S0100000_29, 72)).LJJJ(new AkS46S1000000_29(string, 4), false).LJL(C11S5.LIZ()).LJJLL(new AfS188S0100000_19(awS112S1200000_29, 84), new AfS54S1100000_29(string, awS112S1200000_29, 2));
        }
        c19651211uY.LIZJ.LIZIZ(interfaceC420801kMLJJLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0149, code lost:
    
        r6.put("domain_pending_review", java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145 A[PHI: r0
      0x0145: PHI (r0v35 java.lang.String) = (r0v34 java.lang.String), (r0v38 java.lang.String) binds: [B:55:0x0142, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(X.AbstractC19652111uh r31) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishViewModel.zQ2(X.11uh):void");
    }
}
