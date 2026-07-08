package com.ss.android.ugc.aweme.template.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0P0T;
import X.C11FU;
import X.C123100dR;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19IN;
import X.C20642515q3;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C627500OjM;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.assem.TemplateDescAssem;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateDetailViewModel;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateDescAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public String LLJJJIL;
    public C0P0T LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C11FU LLJJJJLIIL;
    public TuxTextView LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public C0P0T LLJLIL;
    public TuxSkeletonLayout LLJLILLLLZIIL;
    public TemplateAnchorConfig LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateDescAssem.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/template/viewmodel/TemplateDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TemplateDescAssem.class, "templateFavoriteVM", "getTemplateFavoriteVM()Lcom/ss/android/ugc/aweme/template/viewmodel/TemplateFavoriteViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TemplateDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 288), AFwS240S0000000_9.get$arr$(617), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TemplateFavoriteViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 289), AFwS240S0000000_9.get$arr$(618), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1490));
        this.LLJL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 290));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fug;
    }

    public final Pair<TuxIconDrawable, TuxIconDrawable> op() {
        return (Pair) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final TemplateFavoriteViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (TemplateFavoriteViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel r0 = r4.sp()
            boolean r0 = r0.LLILZ
            if (r0 != 0) goto L9
            return
        L9:
            com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel r0 = r4.sp()
            X.002o r0 = r0.getState()
            X.0Okr r0 = (X.C628430Okr) r0
            boolean r3 = r0.LL
            X.11FU r1 = r4.LLJJJJLIIL
            if (r1 == 0) goto L28
            kotlin.Pair r0 = r4.op()
            if (r3 == 0) goto L48
            java.lang.Object r0 = r0.getSecond()
        L23:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setImageDrawable(r0)
        L28:
            com.bytedance.tux.input.TuxTextView r2 = r4.LLJJL
            if (r2 == 0) goto L40
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L45
            if (r3 == 0) goto L41
            r0 = 2131834039(0x7f1134b7, float:1.9301177E38)
        L37:
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L45
        L3d:
            r2.setText(r0)
        L40:
            return
        L41:
            r0 = 2131834038(0x7f1134b6, float:1.9301175E38)
            goto L37
        L45:
            java.lang.String r0 = ""
            goto L3d
        L48:
            java.lang.Object r0 = r0.getFirst()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.template.assem.TemplateDescAssem.yp():void");
    }

    public final void lp(View view) {
        CharSequence text;
        String string;
        Boolean bool;
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            Object tag = tuxTextView.getTag(R.id.xiq);
            if ((!(tag instanceof Boolean) || (bool = (Boolean) tag) == null || !bool.booleanValue()) && (text = tuxTextView.getText()) != null && (string = text.toString()) != null && tuxTextView.getPaint().measureText(string) > (tuxTextView.getWidth() - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight()) {
                tuxTextView.setTag(R.id.xiq, Boolean.TRUE);
                View viewFindViewById = view.findViewById(R.id.used_count_root);
                if (viewFindViewById != null) {
                    C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, false, 29);
                }
                View viewFindViewById2 = view.findViewById(R.id.xga);
                if (viewFindViewById2 != null) {
                    C426750GoL.LJIIIZ(viewFindViewById2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, false, 29);
                }
                tuxTextView.setTuxFont(43);
            }
        }
    }

    public final TuxIconDrawable mp(boolean z) {
        int i;
        int i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_color_bookmark_shadow;
        } else {
            i = R.raw.icon_bookmark;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        if (z) {
            i2 = R.attr.ny;
        } else {
            i2 = R.attr.a1h;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        Context context = getContext();
        if (context != null) {
            return c419910GdJ.LIZ(context);
        }
        throw new IllegalStateException("context is null");
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        TemplateAnchorConfig templateAnchorConfig;
        Bundle arguments;
        Object serializable;
        mo127do();
        this.LLJJJJJIL = (LinearLayout) view.findViewById(R.id.xgx);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.title);
        this.LLJJIJIIJIL = view.findViewById(R.id.xga);
        String title = null;
        if (C627500OjM.LIZ()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("template_anchor_config", TemplateAnchorConfig.class);
                } else {
                    Object serializable2 = arguments.getSerializable("template_anchor_config");
                    if (!(serializable2 instanceof TemplateAnchorConfig)) {
                        serializable2 = null;
                    }
                    serializable = (TemplateAnchorConfig) serializable2;
                }
                templateAnchorConfig = (TemplateAnchorConfig) serializable;
            } else {
                templateAnchorConfig = null;
            }
            this.LLJLL = templateAnchorConfig;
            TuxSkeletonLayout tuxSkeletonLayout = (TuxSkeletonLayout) view.findViewById(R.id.trb);
            this.LLJLILLLLZIIL = tuxSkeletonLayout;
            if (tuxSkeletonLayout != null) {
                tuxSkeletonLayout.setLoading(true);
            }
            if (this.LLJLL != null) {
                TuxTextView tuxTextView = this.LLJJIJI;
                if (tuxTextView != null) {
                    C339190DRl.LIZLLL(tuxTextView);
                }
                TemplateAnchorConfig templateAnchorConfig2 = this.LLJLL;
                if (templateAnchorConfig2 != null) {
                    title = templateAnchorConfig2.getTitle();
                }
                up(view, title);
                if (sp().LLILZ) {
                    view.findViewById(R.id.m6p).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                }
                lp(view);
            } else {
                TuxTextView tuxTextView2 = this.LLJJIJI;
                if (tuxTextView2 != null) {
                    C339190DRl.LIZIZ(tuxTextView2);
                }
            }
            LinearLayout linearLayout = this.LLJJJJJIL;
            if (linearLayout != null) {
                C786410Ut5.LJLLLLLL(4, linearLayout);
            }
            View view2 = this.LLJJIJIIJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
        }
        if (!sp().LLILZ) {
            View viewFindViewById = view.findViewById(R.id.xgx);
            ViewParent parent = viewFindViewById.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OkZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C628160OkQ) obj).LL;
            }
        }, null, new AwS588S0100000_9(this, 385), null, new AwS375S0200000_9(this, view, 98), 10, null);
    }

    public final void tp(boolean z) {
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJLILLLLZIIL;
        if (tuxSkeletonLayout != null) {
            tuxSkeletonLayout.setLoading(false);
        }
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            C339190DRl.LIZLLL(tuxTextView);
        }
        if (z) {
            LinearLayout linearLayout = this.LLJJJJJIL;
            if (linearLayout != null) {
                C339190DRl.LIZLLL(linearLayout);
            }
            View view = this.LLJJIJIIJIL;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
        }
    }

    public final void up(View view, final String str) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        this.LLJJIJI = tuxTextView;
        if (str == null || str.length() == 0) {
            str = C20642515q3.LJI(2131850087);
        }
        tuxTextView.setText(str);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (C123100dR.LIZ(str)) {
            final TuxTextView tuxTextView2 = this.LLJJIJI;
            if ((tuxTextView2 instanceof TuxTextView) && tuxTextView2 != null && tuxTextView2 != null) {
                C786410Ut5.I7(new C19IN() { // from class: X.0HcD
                    @Override // X.C19IN
                    public final void LIZ(View view2) {
                        TextPaint paint = tuxTextView2.getPaint();
                        paint.setTextSize(tuxTextView2.getTextSize());
                        if (paint.measureText(str) >= tuxTextView2.getWidth() * 2) {
                            final TemplateDescAssem templateDescAssem = this;
                            C0P0T c0p0t = templateDescAssem.LLJJJJ;
                            if (c0p0t != null) {
                                c0p0t.dismiss();
                                return;
                            }
                            TuxTextView tuxTextView3 = tuxTextView2;
                            String str2 = str;
                            C450720Hlu c450720Hlu = new C450720Hlu(tuxTextView3.getContext());
                            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                            c1391600mJi.LIZIZ = tuxTextView3;
                            c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                            c450720Hlu.LJII(R.attr.uj);
                            c450720Hlu.LLILZ = str2;
                            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                            templateDescAssem.LLJJJJ = c0p0tLIZIZ;
                            c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0HcE
                                @Override // X.InterfaceC1340660kzY
                                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                                    templateDescAssem.LLJJJJ = null;
                                }
                            });
                            C0P0T c0p0t2 = templateDescAssem.LLJJJJ;
                            if (c0p0t2 == null) {
                                return;
                            }
                            c0p0t2.show();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                    }
                }, tuxTextView2);
            }
        }
        this.LLJJJIL = str;
    }
}
