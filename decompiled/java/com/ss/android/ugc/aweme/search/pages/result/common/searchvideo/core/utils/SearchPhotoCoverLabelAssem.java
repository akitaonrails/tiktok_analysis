package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils;

import X.C09AY;
import X.C0BYF;
import X.C0R45;
import X.C13LZ;
import X.C1559260qg8;
import X.C1839907In;
import X.C1908520zlS;
import X.C1913107eT;
import X.C19MB;
import X.C294620Bgi;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C640290P9n;
import X.C650240Pew;
import X.C659720PuE;
import X.C659750PuH;
import X.C659790PuL;
import X.C723580SZw;
import X.C770702zh;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.EnumC657080Ppy;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoCoverLabelAssem extends ReusedUIContentAssem<SearchPhotoCoverLabelAssem> implements InterfaceC712990Rxx<C659750PuH> {
    public static final float LLJJL = C418440Gaw.LIZIZ(3);
    public TuxTextView LLJJJJ;
    public C09AY LLJJJJJIL;
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723580SZw(this, C659790PuL.class, null), checkSupervisorPrepared());

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.video_holder_tag_text);
        view.addOnAttachStateChangeListener(new C0R45(this, 12));
        C659790PuL c659790PuL = (C659790PuL) this.LLJJJJLIIL.getValue();
        if (c659790PuL != null && c659790PuL.LL && C0BYF.LIZ()) {
            TuxTextView tuxTextView = this.LLJJJJ;
            ViewParent parent = null;
            if (tuxTextView != null) {
                parent = tuxTextView.getParent();
            }
            if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJI(R.id.video_holder_tag_text, 7);
                c19mb.LJIIIZ(R.id.video_holder_tag_text, 7, R.id.qcw, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                c19mb.LIZIZ(constraintLayout);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        VideoTag videoTag;
        float fLIZIZ;
        int iIntValue;
        Drawable drawableLIZIZ;
        Drawable drawableLIZIZ2;
        int i;
        C659750PuH c659750PuH2 = c659750PuH;
        ?? r0 = this.LLJJJJJIL;
        if (r0 != 0) {
            r0.invoke();
        }
        Video video = c659750PuH2.LL.getVideo();
        if (video != null && (videoTag = video.getVideoTag()) != null && C770702zh.LIZ(videoTag.getTitle())) {
            Integer numLIZ = C640290P9n.LIZ(videoTag.getBackgroundColor());
            Integer numLIZ2 = C640290P9n.LIZ(videoTag.getFontColor());
            if (C650240Pew.LIZ()) {
                C1839907In.LIZ.getClass();
                fLIZIZ = C1839907In.LIZIZ();
            } else {
                Integer numValueOf = Integer.valueOf(C1913107eT.LIZIZ());
                if (numValueOf.intValue() > 0) {
                    fLIZIZ = C418440Gaw.LIZIZ(numValueOf);
                } else {
                    fLIZIZ = LLJJL;
                }
            }
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(videoTag.getTitle());
                if (numLIZ2 != null) {
                    iIntValue = numLIZ2.intValue();
                } else {
                    iIntValue = -1;
                }
                tuxTextView.setTextColor(iIntValue);
                String type = videoTag.getType();
                if (Intrinsics.LJFF(type, EnumC657080Ppy.TRENDING_NORMAL.getType())) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    if (C294620Bgi.LIZIZ) {
                        i = R.raw.icon_arrow_broken_line_up;
                    } else {
                        i = R.raw.icon_fire_3_fill;
                    }
                    c419910GdJ.LIZ = i;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
                    if (tuxTextView.getLayoutDirection() == 1) {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                    } else {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorProtector.parseColor("#FE6B2C"), ColorProtector.parseColor("#FE2C55")});
                    gradientDrawable.setCornerRadius(fLIZIZ);
                    gradientDrawable.setGradientType(0);
                    tuxTextView.setBackground(gradientDrawable);
                } else if (Intrinsics.LJFF(type, EnumC657080Ppy.TRENDING_SAD.getType())) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(10.5d)));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(10.5d)));
                    c419910GdJ2.LIZ = R.raw.icon_candle;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                    TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(tuxTextView.getContext());
                    if (tuxTextView.getLayoutDirection() == 1) {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ2, (Drawable) null);
                    } else {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ2, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorProtector.parseColor("#707070"), ColorProtector.parseColor("#505050")});
                    gradientDrawable2.setCornerRadius(fLIZIZ);
                    gradientDrawable2.setGradientType(0);
                    tuxTextView.setBackground(gradientDrawable2);
                } else if (Intrinsics.LJFF(type, EnumC657080Ppy.POI_DISTANCE.getType())) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(12.0d)));
                    c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(12.0d)));
                    c419910GdJ3.LIZ = R.raw.icon_map_pin_fill;
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
                    TuxIconDrawable tuxIconDrawableLIZ3 = c419910GdJ3.LIZ(tuxTextView.getContext());
                    if (tuxTextView.getLayoutDirection() == 1) {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ3, (Drawable) null);
                    } else {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ3, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.0d))));
                    if (numLIZ != null) {
                        drawableLIZIZ2 = C1908520zlS.LIZIZ(fLIZIZ, numLIZ.intValue());
                    } else {
                        drawableLIZIZ2 = C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.d3u);
                    }
                    tuxTextView.setBackground(drawableLIZIZ2);
                } else {
                    if (numLIZ != null) {
                        int iIntValue2 = numLIZ.intValue();
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        drawableLIZIZ = C1908520zlS.LIZIZ(fLIZIZ, iIntValue2);
                    } else {
                        drawableLIZIZ = C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.d3u);
                    }
                    tuxTextView.setBackground(drawableLIZIZ);
                    C659720PuE c659720PuE = C659720PuE.LIZ;
                    UrlModel iconUrl = videoTag.getIconUrl();
                    c659720PuE.getClass();
                    this.LLJJJJJIL = (C09AY) C659720PuE.LIZLLL(tuxTextView, iconUrl);
                }
                tuxTextView.getBackground().setAlpha((int) (Float.valueOf(C13LZ.LJ(videoTag.getOpacity(), 0, 100) / 100.0f).floatValue() * 255));
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJJJ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
