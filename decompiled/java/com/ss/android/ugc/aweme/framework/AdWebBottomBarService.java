package com.ss.android.ugc.aweme.framework;

import X.C01GW;
import X.C1016940cZQ;
import X.C1035880d3y;
import X.C12ES;
import X.C1533610q0l;
import X.C2248361CzK;
import X.C384050F3z;
import X.C786410Ut5;
import X.InterfaceC1036110d4L;
import X.InterfaceC1036210d4V;
import Y.ACListenerS82S0300000_16;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.ui.IAdWebBottomBarService;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebBottomBarService implements IAdWebBottomBarService {
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.ui.IAdWebBottomBarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1016920cZO LIZIZ(android.content.Context r21, com.bytedance.hybrid.spark.SparkContext r22, float r23) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.framework.AdWebBottomBarService.LIZIZ(android.content.Context, com.bytedance.hybrid.spark.SparkContext, float):X.0cZO");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0H9G, android.view.View, android.view.ViewGroup, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.ui.IAdWebBottomBarService
    public final ViewGroup LIZ(Context context, String str, SparkContext sparkContext, float f, EfficiencyComponents efficiencyComponents) {
        C1035880d3y c1035880d3y;
        InterfaceC1036110d4L interfaceC1036110d4L;
        InterfaceC1036210d4V interfaceC1036210d4V;
        float fLIZJ;
        float fMeasureText;
        Integer numLJ = null;
        if (efficiencyComponents == null) {
            return null;
        }
        if (Intrinsics.LJFF(str, "review_component")) {
            ?? r3 = new FrameLayout(context) { // from class: X.0H9G
                public RadiusLayout LL;
                public LinearLayout LLILLJJLI;
                public TuxTextView LLILLL;
                public TuxIconView LLILZ;
                public TuxTextView LLILZIL;
                public TuxIconView LLILZLL;

                public final LinearLayout getBaLlFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.bmr);
                        this.LLILLJJLI = (LinearLayout) callbackFindViewById;
                    }
                    return (LinearLayout) callbackFindViewById;
                }

                public final RadiusLayout getEfficiencyComponentContainerFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.gxt);
                        this.LL = (RadiusLayout) callbackFindViewById;
                    }
                    return (RadiusLayout) callbackFindViewById;
                }

                public final TuxIconView getLeftIconFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.mk3);
                        this.LLILZ = (TuxIconView) callbackFindViewById;
                    }
                    return (TuxIconView) callbackFindViewById;
                }

                public final TuxTextView getLeftTextFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.ml9);
                        this.LLILZIL = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                public final TuxIconView getRightIconFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.tld);
                        this.LLILZLL = (TuxIconView) callbackFindViewById;
                    }
                    return (TuxIconView) callbackFindViewById;
                }

                public final TuxTextView getRightTextFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.tmi);
                        this.LLILLL = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                {
                    super(context);
                    C786410Ut5.Td(C786410Ut5.ne(context), R.layout.lm, this, true);
                }

                public final void setBaLlFromXml(LinearLayout linearLayout) {
                    this.LLILLJJLI = linearLayout;
                }

                public final void setEfficiencyComponentContainerFromXml(RadiusLayout radiusLayout) {
                    this.LL = radiusLayout;
                }

                public final void setLeftIconFromXml(TuxIconView tuxIconView) {
                    this.LLILZ = tuxIconView;
                }

                public final void setLeftTextFromXml(TuxTextView tuxTextView) {
                    this.LLILZIL = tuxTextView;
                }

                public final void setRightIconFromXml(TuxIconView tuxIconView) {
                    this.LLILZLL = tuxIconView;
                }

                public final void setRightTextFromXml(TuxTextView tuxTextView) {
                    this.LLILLL = tuxTextView;
                }

                public final void LIZ(TuxIconView tuxIconView, String str2) {
                    if (TextUtils.isEmpty(str2)) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                        return;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    if (str2 != null) {
                        try {
                            C01GW c01gw = C2248361CzK.LIZ;
                            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(getContext(), str2);
                            if (c698190Ra5LJFF != null) {
                                tuxIconView.setIconRes(c698190Ra5LJFF.LIZ);
                                Integer num = c698190Ra5LJFF.LIZIZ;
                                if (num != null) {
                                    tuxIconView.setTintColor(num.intValue());
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            };
            if (sparkContext != null) {
                c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            } else {
                c1035880d3y = null;
            }
            float fLIZJ2 = C12ES.LIZJ(24.0f, r3.getContext());
            if (C1533610q0l.LIZIZ(efficiencyComponents.leftIcon)) {
                fLIZJ2 += C12ES.LIZJ(16.0f, r3.getContext());
            }
            if (C1533610q0l.LIZIZ(efficiencyComponents.rightIcon)) {
                fLIZJ2 += C12ES.LIZJ(14.0f, r3.getContext());
            }
            float fIntValue = 0.0f;
            if (C1533610q0l.LIZIZ(efficiencyComponents.leftText)) {
                float fLIZJ3 = fLIZJ2 + C12ES.LIZJ(4.0f, r3.getContext());
                String str2 = efficiencyComponents.leftText;
                String str3 = efficiencyComponents.rightText;
                if (str3 != null && str3.length() != 0) {
                    fLIZJ = C12ES.LIZJ(26.0f, r3.getContext());
                } else {
                    fLIZJ = f - fLIZJ3;
                }
                int i = (int) fLIZJ;
                if (str2 != null && str2.length() != 0) {
                    r3.getLeftTextFromXml().setMaxWidth(i);
                    TuxTextView tuxTextView = new TuxTextView(r3.getContext(), null, 6, 0);
                    tuxTextView.setText(str2);
                    tuxTextView.setTuxFont(42);
                    tuxTextView.setMaxWidth(i);
                    tuxTextView.setMaxLines(1);
                    fMeasureText = tuxTextView.getPaint().measureText(str2);
                } else {
                    fMeasureText = 0.0f;
                }
                fLIZJ2 = fLIZJ3 + fMeasureText;
            }
            if (fLIZJ2 > f) {
                r3.getRightTextFromXml().setMaxWidth(0);
            } else {
                r3.getRightTextFromXml().setMaxWidth((int) (f - fLIZJ2));
            }
            if (sparkContext != null && (interfaceC1036210d4V = (InterfaceC1036210d4V) sparkContext.LJFF(InterfaceC1036210d4V.class)) != null) {
                interfaceC1036210d4V.LJIILIIL();
            }
            if (c1035880d3y != null && !c1035880d3y.isSheetVariantFullScreen() && sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L.LJJJLL();
            }
            C786410Ut5.p9(r3.getEfficiencyComponentContainerFromXml(), new ACListenerS82S0300000_16(r3, sparkContext, efficiencyComponents, 7));
            String str4 = efficiencyComponents.color;
            Integer num = efficiencyComponents.radius;
            if (num != null) {
                fIntValue = num.intValue();
            }
            RadiusLayout efficiencyComponentContainerFromXml = r3.getEfficiencyComponentContainerFromXml();
            try {
                if (!TextUtils.isEmpty(str4)) {
                    if (str4 != null) {
                        C01GW c01gw = C2248361CzK.LIZ;
                        numLJ = C2248361CzK.LJ(r3.getContext(), str4);
                    }
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = numLJ;
                    c384050F3z.LIZJ = Float.valueOf(C12ES.LIZJ(fIntValue, efficiencyComponentContainerFromXml.getContext()));
                    efficiencyComponentContainerFromXml.setBackground(c384050F3z.LIZ(r3.getContext()));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            r3.LIZ(r3.getLeftIconFromXml(), efficiencyComponents.leftIcon);
            if (!TextUtils.isEmpty(efficiencyComponents.leftText)) {
                r3.getLeftTextFromXml().setText(efficiencyComponents.leftText);
            } else {
                C786410Ut5.LLLLZLL(r3.getLeftTextFromXml(), 8);
            }
            if (!TextUtils.isEmpty(efficiencyComponents.rightText)) {
                r3.getRightTextFromXml().setText(efficiencyComponents.rightText);
            } else {
                C786410Ut5.LLLLZLL(r3.getRightTextFromXml(), 8);
            }
            r3.LIZ(r3.getRightIconFromXml(), efficiencyComponents.rightIcon);
            return r3;
        }
        if (Intrinsics.LJFF(str, "ai_component")) {
            C1016940cZQ c1016940cZQ = new C1016940cZQ(context, null, 6);
            c1016940cZQ.LIZ(sparkContext, Float.valueOf(f), efficiencyComponents);
            return c1016940cZQ;
        }
        C1016940cZQ c1016940cZQ2 = new C1016940cZQ(context, null, 6);
        c1016940cZQ2.LIZ(sparkContext, Float.valueOf(f), efficiencyComponents);
        return c1016940cZQ2;
    }
}
