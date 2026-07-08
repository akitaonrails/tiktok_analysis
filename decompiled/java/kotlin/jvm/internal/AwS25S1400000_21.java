package kotlin.jvm.internal;

import X.C013C;
import X.C07I8;
import X.C09AY;
import X.C0BKT;
import X.C0CNO;
import X.C0DQF;
import X.C0FNV;
import X.C0ML2;
import X.C0MNH;
import X.C12F5;
import X.C12FB;
import X.C1354600lM2;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1845390y7d;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.C566830MKz;
import X.DialogC1389620mGW;
import X.InterfaceC1381130m2p;
import X.InterfaceC1381790m3t;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.common.feedbacktool.recomword.RecommendWordsFeedbackUtil$openReportPage$2$2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AwS25S1400000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S1400000_21 awS25S1400000_21, Object obj) {
        InterfaceC1381130m2p interfaceC1381130m2p = (InterfaceC1381130m2p) obj;
        interfaceC1381130m2p.LJIIJJI(((InterfaceC1381130m2p) awS25S1400000_21.l1).getReportType());
        interfaceC1381130m2p.LJIIJ(((InterfaceC1381130m2p) awS25S1400000_21.l1).getObjectID());
        interfaceC1381130m2p.LJIIIIZZ(((InterfaceC1381130m2p) awS25S1400000_21.l1).LJ());
        interfaceC1381130m2p.setExtra(((InterfaceC1381130m2p) awS25S1400000_21.l1).getExtra());
        interfaceC1381130m2p.LJIIL(((InterfaceC1381130m2p) awS25S1400000_21.l1).getCommonParams());
        final String str = awS25S1400000_21.s0;
        final C013C c013c = (C013C) awS25S1400000_21.l2;
        interfaceC1381130m2p.LJI(new InterfaceC1381790m3t() { // from class: X.0T8v
            @Override // X.InterfaceC1381790m3t
            public final void LIZ(String str2, Map<String, ? extends Object> map) {
                Object obj2;
                if (Intrinsics.LJFF(str2, "suggestion_report_submit") && map != null && (obj2 = map.get("object_id")) != null && obj2.equals(str)) {
                    c013c.element = true;
                }
            }
        });
        interfaceC1381130m2p.LIZJ(new RecommendWordsFeedbackUtil$openReportPage$2$2((C013C) awS25S1400000_21.l2, (Word) awS25S1400000_21.l3, (Function1) awS25S1400000_21.l4));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS25S1400000_21 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS25S1400000_21.invoke$1(kotlin.jvm.internal.AwS25S1400000_21, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS25S1400000_21 awS25S1400000_21, Object obj) {
        C0ML2 c0ml2 = (C0ML2) obj;
        Function1 function1 = (Function1) awS25S1400000_21.l1;
        if (function1 != null) {
            function1.invoke(c0ml2);
        }
        if (c0ml2 instanceof C566830MKz) {
            C1354600lM2.LIZIZ.put(((C566830MKz) c0ml2).LIZ, (Comment) awS25S1400000_21.l2);
        }
        if (((C0MNH) awS25S1400000_21.l3) == C0MNH.STORY) {
            C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
            Context context = (Context) awS25S1400000_21.l4;
            String str = awS25S1400000_21.s0;
            c1354600lM2.getClass();
            C0CNO.LIZLLL(0L, new AwS151S1100000_2(context, str, 22));
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", "show");
            c2344009Gk.LJIIIIZZ("enter_method", str);
            C20684815ws.LJIILLIIL("comment_to_story_toast", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS25S1400000_21 awS25S1400000_21, Object obj) {
        Dialog dialog = (Dialog) ((C259800zU) awS25S1400000_21.l1).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
        }
        ((C259800zU) awS25S1400000_21.l1).element = null;
        if (Intrinsics.LJFF(C12FB.LIZ, (C12F5) awS25S1400000_21.l2)) {
            if (C07I8.LIZIZ) {
                C0DQF.LJII(C0DQF.LIZ, (View) awS25S1400000_21.l3, 2131829222, null, null, 28);
            } else {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C12F5) awS25S1400000_21.l2).LL);
                if (c19egLIZIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx.LJIIIZ(2131829222);
                    c1389890mGx.LJIIJJI();
                }
            }
            C1845390y7d.LIZIZ((Map) awS25S1400000_21.l4, awS25S1400000_21.s0, "failure_process");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS25S1400000_21 awS25S1400000_21, Object obj) {
        Assembler assembler = (Assembler) obj;
        ((RefactorKeyboardPanelV2) awS25S1400000_21.l1).mp(assembler);
        RefactorKeyboardPanelV2 refactorKeyboardPanelV2 = (RefactorKeyboardPanelV2) awS25S1400000_21.l1;
        refactorKeyboardPanelV2.getClass();
        assembler.RQ2(refactorKeyboardPanelV2, AFwS259S0000000_21.get$arr$(453));
        ((RefactorKeyboardPanelV2) awS25S1400000_21.l1).ip(assembler);
        assembler.RQ2((RefactorKeyboardPanelV2) awS25S1400000_21.l1, AFwS257S0000000_19.get$arr$(796));
        ((RefactorKeyboardPanelV2) awS25S1400000_21.l1).op(assembler);
        RefactorKeyboardPanelV2 refactorKeyboardPanelV22 = (RefactorKeyboardPanelV2) awS25S1400000_21.l1;
        refactorKeyboardPanelV22.getClass();
        if (C0BKT.LIZIZ) {
            assembler.QQ2(refactorKeyboardPanelV22, new AwS598S0100000_19(refactorKeyboardPanelV22, 899));
        }
        if (Intrinsics.LJFF(awS25S1400000_21.s0, "GIFT")) {
            ((RefactorKeyboardPanelV2) awS25S1400000_21.l1).hp(assembler);
            ((C013C) awS25S1400000_21.l3).element = true;
        }
        if (Intrinsics.LJFF(awS25S1400000_21.s0, "MENTION")) {
            ((RefactorKeyboardPanelV2) awS25S1400000_21.l1).kp(assembler);
            ((C013C) awS25S1400000_21.l4).element = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S1400000_21(C259800zU c259800zU, C259800zU<DialogC1389620mGW> c259800zU2, C12F5 c12f5, View view, Map<String, String> map, String str) {
        super(1);
        this.$t = str;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.l3 = c12f5;
        this.l4 = view;
        this.s0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S1400000_21(InterfaceC1381130m2p interfaceC1381130m2p, InterfaceC1381130m2p interfaceC1381130m2p2, String str, C013C c013c, Word word, Function1<? super String, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = interfaceC1381130m2p;
        this.s0 = interfaceC1381130m2p2;
        this.l2 = str;
        this.l3 = c013c;
        this.l4 = word;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1400000_21(RefactorKeyboardPanelV2 refactorKeyboardPanelV2, View view, String str, C013C c013c, C013C c013c2, int i) {
        super(1);
        this.$t = i;
        this.l1 = refactorKeyboardPanelV2;
        this.l2 = view;
        this.s0 = str;
        this.l3 = c013c;
        this.l4 = c013c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1400000_21(CommentRethinkPopup commentRethinkPopup, CommentPublishViewModel commentPublishViewModel, Comment comment, String str, Exception exc, int i) {
        super(1);
        this.$t = i;
        this.l1 = commentRethinkPopup;
        this.l2 = commentPublishViewModel;
        this.l3 = comment;
        this.s0 = str;
        this.l4 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S1400000_21(Function1 function1, Function1<? super C0ML2, Unit> function12, Comment comment, C0MNH c0mnh, Context context, String str) {
        super(1);
        this.$t = str;
        this.l1 = function1;
        this.l2 = function12;
        this.l3 = comment;
        this.l4 = c0mnh;
        this.s0 = context;
    }
}
