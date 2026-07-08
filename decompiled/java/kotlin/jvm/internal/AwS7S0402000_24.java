package kotlin.jvm.internal;

import X.C09AY;
import X.C1571200qzO;
import X.C1571220qzQ;
import X.C1591480rW6;
import X.C1591980rWu;
import X.C1592080rX4;
import X.C1592450rXf;
import X.C1592520rXm;
import X.C1592730rY7;
import X.C1954807lC;
import X.C2188811AlT;
import X.C592330NLb;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC1571190qzN;
import X.EnumC1582650rHr;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightToolbarIconBridgeViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformer;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS7S0402000_24 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS7S0402000_24 awS7S0402000_24, Object obj) {
        C592330NLb c592330NLb;
        C1592450rXf c1592450rXf;
        int i;
        Drawable drawable;
        Drawable drawable2;
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        float f = ((C817403Hg) awS7S0402000_24.l0).element;
        if (Intrinsics.LJFF((C1592080rX4) awS7S0402000_24.l1, c1592080rX4)) {
            C1592450rXf c1592450rXf2 = ((TabAnimationTransformer) awS7S0402000_24.l2).LLILLJJLI;
            if (c1592450rXf2 != null) {
                c1592450rXf2.setSelectedTabIndicatorColor(awS7S0402000_24.i4);
            }
            f = 1.0f;
        }
        TextView customTextView = c1592080rX4.getCustomTextView();
        boolean z = true;
        if (customTextView != null) {
            int i2 = awS7S0402000_24.i4;
            EnumC1571190qzN enumC1571190qzN = (EnumC1571190qzN) awS7S0402000_24.l3;
            C1592080rX4 c1592080rX42 = (C1592080rX4) awS7S0402000_24.l1;
            int i3 = awS7S0402000_24.i5;
            customTextView.setTextColor(i2);
            C786410Ut5.S4(f, customTextView);
            if ((C1591480rW6.LIZ() == 2 || C1591480rW6.LIZ() == 3) && enumC1571190qzN == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(customTextView, !Intrinsics.LJFF(c1592080rX4, c1592080rX42));
            } else {
                customTextView.setShadowLayer(C1592730rY7.LIZ(), 0.0f, C1592730rY7.LIZIZ(), i3);
            }
        }
        ImageView customImageView = c1592080rX4.getCustomImageView();
        CharSequence text = null;
        if (customImageView != null) {
            EnumC1571190qzN enumC1571190qzN2 = (EnumC1571190qzN) awS7S0402000_24.l3;
            TabAnimationTransformer tabAnimationTransformer = (TabAnimationTransformer) awS7S0402000_24.l2;
            C1592080rX4 c1592080rX43 = (C1592080rX4) awS7S0402000_24.l1;
            if (enumC1571190qzN2 != null && (i = C1571200qzO.LIZ[enumC1571190qzN2.ordinal()]) != -1) {
                if (i != 1) {
                    if (i == 2) {
                        C1591980rWu tab = c1592080rX4.getTab();
                        if (tab != null && tab.LJIIIIZZ != null) {
                            C1591980rWu tab2 = c1592080rX4.getTab();
                            if (tab2 != null) {
                                drawable2 = tab2.LJIIIIZZ;
                            } else {
                                drawable2 = null;
                            }
                            customImageView.setImageDrawable(drawable2);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1591980rWu tab3 = c1592080rX4.getTab();
                    if (tab3 != null && tab3.LJII != null) {
                        C1591980rWu tab4 = c1592080rX4.getTab();
                        if (tab4 != null) {
                            drawable = tab4.LJII;
                        } else {
                            drawable = null;
                        }
                        customImageView.setImageDrawable(drawable);
                    }
                }
            }
            C1591980rWu tab5 = c1592080rX4.getTab();
            if (tab5 != null && (c592330NLb = tab5.LJIIIZ) != null && (c1592450rXf = tabAnimationTransformer.LLILLJJLI) != null) {
                if (enumC1571190qzN2 != EnumC1571190qzN.DARK) {
                    z = false;
                }
                C1592450rXf.LJJI(c1592450rXf, c1592080rX43, c592330NLb, z, null, false, 12);
            }
            C786410Ut5.V4(customImageView, f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTabThemeInternal:");
        TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null) {
            text = mCustomTextView$homepage_common_release.getText();
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0206 A[LOOP:3: B:99:0x0200->B:101:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0247 A[LOOP:5: B:109:0x0241->B:111:0x0247, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266 A[LOOP:6: B:113:0x0260->B:115:0x0266, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029f A[LOOP:7: B:119:0x0299->B:121:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c0 A[LOOP:8: B:124:0x02ba->B:126:0x02c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ea A[LOOP:9: B:128:0x02e4->B:130:0x02ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037c A[LOOP:10: B:150:0x0376->B:152:0x037c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc A[PHI: r25
      0x01bc: PHI (r25v1 boolean) = (r25v0 boolean), (r25v5 boolean) binds: [B:84:0x01b8, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7 A[LOOP:2: B:95:0x01e1->B:97:0x01e7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS7S0402000_24 r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S0402000_24.invoke$1(kotlin.jvm.internal.AwS7S0402000_24, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS7S0402000_24 awS7S0402000_24, Object obj) {
        C592330NLb c592330NLb;
        C1592450rXf c1592450rXf;
        int i;
        Drawable drawable;
        Drawable drawable2;
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        float f = ((C817403Hg) awS7S0402000_24.l0).element;
        if (Intrinsics.LJFF((C1592080rX4) awS7S0402000_24.l1, c1592080rX4)) {
            C1592450rXf c1592450rXf2 = ((TabAnimationTransformerV2) awS7S0402000_24.l2).LLILLL;
            if (c1592450rXf2 != null) {
                c1592450rXf2.setSelectedTabIndicatorColor(awS7S0402000_24.i4);
            }
            f = 1.0f;
        }
        TextView customTextView = c1592080rX4.getCustomTextView();
        if (customTextView != null) {
            int i2 = awS7S0402000_24.i4;
            EnumC1571190qzN enumC1571190qzN = (EnumC1571190qzN) awS7S0402000_24.l3;
            C1592080rX4 c1592080rX42 = (C1592080rX4) awS7S0402000_24.l1;
            int i3 = awS7S0402000_24.i5;
            C786410Ut5.S4(f, customTextView);
            customTextView.setTextColor(i2);
            if ((C1591480rW6.LIZ() == 2 || C1591480rW6.LIZ() == 3) && enumC1571190qzN == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(customTextView, !Intrinsics.LJFF(c1592080rX4, c1592080rX42));
            } else {
                customTextView.setShadowLayer(C1592730rY7.LIZ(), 0.0f, C1592730rY7.LIZIZ(), i3);
            }
        }
        ImageView customImageView = c1592080rX4.getCustomImageView();
        CharSequence text = null;
        if (customImageView != null) {
            EnumC1571190qzN enumC1571190qzN2 = (EnumC1571190qzN) awS7S0402000_24.l3;
            C1592080rX4 c1592080rX43 = (C1592080rX4) awS7S0402000_24.l1;
            TabAnimationTransformerV2 tabAnimationTransformerV2 = (TabAnimationTransformerV2) awS7S0402000_24.l2;
            C1591980rWu tab = c1592080rX4.getTab();
            boolean z = false;
            if (tab != null && tab.LIZ()) {
                C786410Ut5.V4(customImageView, f);
            }
            if (enumC1571190qzN2 != null && (i = C1571220qzQ.LIZ[enumC1571190qzN2.ordinal()]) != -1) {
                if (i != 1) {
                    if (i == 2) {
                        C1591980rWu tab2 = c1592080rX4.getTab();
                        if (tab2 != null && tab2.LJIIIIZZ != null) {
                            C1591980rWu tab3 = c1592080rX4.getTab();
                            if (tab3 != null) {
                                drawable2 = tab3.LJIIIIZZ;
                            } else {
                                drawable2 = null;
                            }
                            customImageView.setImageDrawable(drawable2);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1591980rWu tab4 = c1592080rX4.getTab();
                    if (tab4 != null && tab4.LJII != null) {
                        C1591980rWu tab5 = c1592080rX4.getTab();
                        if (tab5 != null) {
                            drawable = tab5.LJII;
                        } else {
                            drawable = null;
                        }
                        customImageView.setImageDrawable(drawable);
                    }
                }
            }
            boolean zLJFF = Intrinsics.LJFF(c1592080rX4, c1592080rX43);
            C1591980rWu tab6 = c1592080rX4.getTab();
            if (tab6 != null && (c592330NLb = tab6.LJIIIZ) != null && (c1592450rXf = tabAnimationTransformerV2.LLILLL) != null) {
                if (enumC1571190qzN2 == EnumC1571190qzN.DARK) {
                    z = true;
                }
                C1592450rXf.LJJI(c1592450rXf, c1592080rX43, c592330NLb, z, Boolean.valueOf(zLJFF), false, 8);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTabThemeInternal:");
        TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null) {
            text = mCustomTextView$homepage_common_release.getText();
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0402000_24(C817403Hg c817403Hg, C1592080rX4 c1592080rX4, TabAnimationTransformer tabAnimationTransformer, int i, EnumC1571190qzN enumC1571190qzN, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c817403Hg;
        this.l1 = c1592080rX4;
        this.l2 = tabAnimationTransformer;
        this.i4 = i;
        this.l3 = enumC1571190qzN;
        this.i5 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0402000_24(C817403Hg c817403Hg, C1592080rX4 c1592080rX4, TabAnimationTransformerV2 tabAnimationTransformerV2, int i, EnumC1571190qzN enumC1571190qzN, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c817403Hg;
        this.l1 = c1592080rX4;
        this.l2 = tabAnimationTransformerV2;
        this.i4 = i;
        this.l3 = enumC1571190qzN;
        this.i5 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0402000_24(FeedSkylightToolbarIconBridgeViewModel feedSkylightToolbarIconBridgeViewModel, FeedSkylightToolbarIconBridgeViewModel feedSkylightToolbarIconBridgeViewModel2, Context context, List<? extends InterfaceC1891350zJl> list, EnumC1582650rHr enumC1582650rHr, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = feedSkylightToolbarIconBridgeViewModel;
        this.l1 = feedSkylightToolbarIconBridgeViewModel2;
        this.l2 = context;
        this.l3 = list;
        this.i4 = enumC1582650rHr;
        this.i5 = i;
    }
}
