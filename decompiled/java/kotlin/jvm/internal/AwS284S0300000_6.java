package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0FDW;
import X.C0FDZ;
import X.C0HLC;
import X.C0IDJ;
import X.C118300cf;
import X.C259800zU;
import X.C291001Au;
import X.C387270FGj;
import X.C435980H7s;
import X.C448200Hhq;
import X.C650450PfH;
import X.C659520Ptu;
import X.C680810Qn9;
import X.C806303Cz;
import X.InterfaceC1631630sYr;
import X.InterfaceC1680500tpg;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.animation.AnimatorSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframeAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoCommentVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS284S0300000_6 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS284S0300000_6 awS284S0300000_6, Object obj, Object obj2) {
        C435980H7s c435980H7s = new C435980H7s((Aweme) awS284S0300000_6.l0, (List) awS284S0300000_6.l1);
        C650450PfH.LIZ(c435980H7s, null, (Aweme) awS284S0300000_6.l0, (ISearchContextAbility) ((SearchDetailKeyframeAnchorAssem) awS284S0300000_6.l2).LLL.getValue(), true);
        c435980H7s.LJIILJJIL();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS284S0300000_6 awS284S0300000_6, Object obj, Object obj2) {
        Integer num;
        SearchVideoCommentAssem searchVideoCommentAssem = (SearchVideoCommentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            num = (Integer) c291001Au.LIZ;
        } else {
            num = null;
        }
        if (searchVideoCommentAssem.cp().getState().LL != null && num != null) {
            if (num.intValue() == 0) {
                if (((C118300cf) awS284S0300000_6.l0).element == 1) {
                    ((AnimatorSet) awS284S0300000_6.l1).cancel();
                    ((AnimatorSet) awS284S0300000_6.l2).start();
                    ((C118300cf) awS284S0300000_6.l0).element = 0;
                }
            } else if (num.intValue() == 1 && ((C118300cf) awS284S0300000_6.l0).element == 0) {
                ((AnimatorSet) awS284S0300000_6.l2).cancel();
                ((AnimatorSet) awS284S0300000_6.l1).start();
                ((C118300cf) awS284S0300000_6.l0).element = 1;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS284S0300000_6 awS284S0300000_6, Object obj, Object obj2) {
        final Aweme aweme;
        final Comment comment;
        SearchVideoCommentVM searchVideoCommentVMCp = ((SearchVideoCommentAssem) awS284S0300000_6.l0).cp();
        TuxTextView tuxTextView = (TuxTextView) awS284S0300000_6.l1;
        String str = (String) ((C259800zU) awS284S0300000_6.l2).element;
        C659520Ptu c659520Ptu = searchVideoCommentVMCp.LL;
        if (c659520Ptu != null && (aweme = c659520Ptu.LL) != null && (comment = searchVideoCommentVMCp.LLILLL) != null) {
            C680810Qn9<C448200Hhq> c680810Qn9 = new C680810Qn9<C448200Hhq>(comment, aweme) { // from class: X.0Hhq
            };
            searchVideoCommentVMCp.vQ2(c680810Qn9, tuxTextView);
            c680810Qn9.LJIIZILJ("show_text", str);
            c680810Qn9.LJIIZILJ("show_text_length", String.valueOf(str.length()));
            c680810Qn9.LJIILJJIL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS284S0300000_6 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828367(0x7f111e8f, float:1.9289673E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            X.0FGj r0 = (X.C387270FGj) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            X.0FGj r3 = (X.C387270FGj) r3
            java.lang.Object r2 = r9.l1
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L66
        L5d:
            kotlin.jvm.internal.AwS249S0300000_5 r7 = new kotlin.jvm.internal.AwS249S0300000_5
            r0 = 3
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L66:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131828369(0x7f111e91, float:1.9289677E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L99
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La3
        L99:
            kotlin.jvm.internal.AwS550S0100000_6 r7 = new kotlin.jvm.internal.AwS550S0100000_6
            r0 = 762(0x2fa, float:1.068E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La3:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS284S0300000_6.invoke$3(kotlin.jvm.internal.AwS284S0300000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS284S0300000_6 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828367(0x7f111e8f, float:1.9289673E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            X.0FDZ r0 = (X.C0FDZ) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            X.0FDW r0 = (X.C0FDW) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            X.0FDZ r3 = (X.C0FDZ) r3
            java.lang.Object r2 = r9.l1
            X.0FDW r2 = (X.C0FDW) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS249S0300000_5 r7 = new kotlin.jvm.internal.AwS249S0300000_5
            r0 = 10
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131828369(0x7f111e91, float:1.9289677E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS550S0100000_6 r7 = new kotlin.jvm.internal.AwS550S0100000_6
            r0 = 878(0x36e, float:1.23E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La4:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS284S0300000_6.invoke$4(kotlin.jvm.internal.AwS284S0300000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS284S0300000_6 awS284S0300000_6, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((InterfaceC1631630sYr) awS284S0300000_6.l0).invoke(((C05P1) awS284S0300000_6.l1).getValue(), ((C0HLC) ((C05P1) awS284S0300000_6.l2).getValue()).LIZIZ, interfaceC1680500tpg, 8);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS284S0300000_6 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131834114(0x7f113502, float:1.930133E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r4 = r6.LJJIIJ(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS407S0200000_6 r8 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 85
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131834113(0x7f113501, float:1.9301327E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r3 = r6.LJJIIJ(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l2
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS407S0200000_6 r8 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 86
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS284S0300000_6.invoke$6(kotlin.jvm.internal.AwS284S0300000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS284S0300000_6 awS284S0300000_6, Object obj, Object obj2) {
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((ViewOnAttachStateChangeListenerC20631115oD) awS284S0300000_6.l0).getViewItemOperator().getState().LIZLLL(list, null);
        C806303Cz c806303Cz = (C806303Cz) awS284S0300000_6.l1;
        if (c806303Cz != null) {
            c806303Cz.setDotCount(list.size());
        }
        ((ViewOnAttachStateChangeListenerC20631115oD) awS284S0300000_6.l0).registerOnPageChangeCallback(new C0IDJ((C806303Cz) awS284S0300000_6.l1, 2));
        ((Function1) awS284S0300000_6.l2).invoke(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS284S0300000_6(C118300cf c118300cf, AnimatorSet animatorSet, AnimatorSet animatorSet2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = animatorSet;
        this.l2 = animatorSet2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS284S0300000_6(C0FDZ c0fdz, C0FDZ c0fdz2, C0FDW c0fdw, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c0fdz;
        this.l1 = c0fdz2;
        this.l2 = c0fdw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS284S0300000_6(C387270FGj c387270FGj, C387270FGj c387270FGj2, Effect effect, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c387270FGj;
        this.l1 = c387270FGj2;
        this.l2 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS284S0300000_6(InterfaceC1631630sYr interfaceC1631630sYr, C05P0 c05p0, C05P0 c05p02, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1631630sYr;
        this.l1 = c05p0;
        this.l2 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS284S0300000_6(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, C806303Cz c806303Cz, AwS393S0200000_27 awS393S0200000_27, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20631115oD;
        this.l1 = c806303Cz;
        this.l2 = awS393S0200000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS284S0300000_6(Aweme aweme, SearchDetailKeyframeAnchorAssem searchDetailKeyframeAnchorAssem, List list, int i) {
        super(2);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = list;
        this.l2 = searchDetailKeyframeAnchorAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS284S0300000_6(SearchVideoCommentAssem searchVideoCommentAssem, SearchVideoCommentAssem searchVideoCommentAssem2, TuxTextView tuxTextView, C259800zU<String> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = searchVideoCommentAssem;
        this.l1 = searchVideoCommentAssem2;
        this.l2 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS284S0300000_6(Function0 function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        super(2);
        this.$t = function04;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function03;
    }
}
