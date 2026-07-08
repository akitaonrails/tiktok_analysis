package kotlin.jvm.internal;

import X.AbstractC856710XjB;
import X.C09AY;
import X.C0BWP;
import X.C0Y7P;
import X.C0YC9;
import X.C0YWZ;
import X.C1428470nHB;
import X.C1664590tQ1;
import X.C1843500y4a;
import X.C19EG;
import X.C201955140j;
import X.C856820XjM;
import X.C869590Y9l;
import X.C902920ZbW;
import X.C907110ZiH;
import X.C913140Zs0;
import X.InterfaceC859350XnR;
import X.InterfaceC913650Zsp;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedShareSimpleProtocol;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS99S0201000_14 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        Pair<Boolean, Boolean> value;
        Rect rect = (Rect) obj;
        int i = awS99S0201000_14.i2;
        if (i != 4) {
            if (i == 17) {
                StoryEditToolbarComponent storyEditToolbarComponent = (StoryEditToolbarComponent) awS99S0201000_14.l0;
                if (storyEditToolbarComponent.m3(i, storyEditToolbarComponent.getViewModel().E90().getValue()) && C0BWP.LIZ()) {
                    ((StoryEditToolbarComponent) awS99S0201000_14.l0).W1((Function0) awS99S0201000_14.l1, rect);
                } else {
                    ((StoryEditToolbarComponent) awS99S0201000_14.l0).E3((Function0) awS99S0201000_14.l1, rect);
                }
            }
        } else if (((StoryEditToolbarComponent) awS99S0201000_14.l0).LLILZ.getValue() == null || ((value = ((StoryEditToolbarComponent) awS99S0201000_14.l0).LLILZ.getValue()) != null && value.getFirst().booleanValue())) {
            ((StoryEditToolbarComponent) awS99S0201000_14.l0).getActivity();
            C1428470nHB.LJLLI(((StoryEditToolbarComponent) awS99S0201000_14.l0).G2());
            C1428470nHB.LLIIIJ(((StoryEditToolbarComponent) awS99S0201000_14.l0).G2());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C907110ZiH) awS99S0201000_14.l0).B3((InterfaceC859350XnR) awS99S0201000_14.l1);
        } else {
            C201955140j.LIZ("audioCopyrightDetectInEdit -> show Authorize Dialog");
            C856820XjM c856820XjM = C856820XjM.LIZ;
            C907110ZiH c907110ZiH = (C907110ZiH) awS99S0201000_14.l0;
            AbstractC856710XjB abstractC856710XjB = c907110ZiH.LLJJJ;
            VideoPublishEditModel videoPublishEditModelI3 = c907110ZiH.i3();
            c856820XjM.getClass();
            C856820XjM.LIZ(abstractC856710XjB, videoPublishEditModelI3, 0);
            C907110ZiH c907110ZiH2 = (C907110ZiH) awS99S0201000_14.l0;
            c907110ZiH2.LLILLJJLI.LJIIIIZZ(((C19EG) C1664590tQ1.LJII(c907110ZiH2)).getSupportFragmentManager(), C1664590tQ1.LJIIIIZZ((C907110ZiH) awS99S0201000_14.l0), ((C907110ZiH) awS99S0201000_14.l0).i3(), ((C907110ZiH) awS99S0201000_14.l0).LLILLJJLI.LIZIZ(), new AwS154S0101000_14((C907110ZiH) awS99S0201000_14.l0, awS99S0201000_14.i2, 0), new AwS154S0101000_14((C907110ZiH) awS99S0201000_14.l0, awS99S0201000_14.i2, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        return ((Context) obj).getResources().getQuantityString(awS99S0201000_14.i2, ((Number) awS99S0201000_14.l0).intValue(), ((UnifiedShareSimpleProtocol) awS99S0201000_14.l1).LLILZLL.LJFF(C1843500y4a.LIZIZ(((Number) awS99S0201000_14.l0).longValue())));
    }

    public static final Object invoke$3(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        ((InterfaceC913650Zsp) obj).LJJIIJZLJL((Activity) awS99S0201000_14.l0, (C913140Zs0) awS99S0201000_14.l1, awS99S0201000_14.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        ((C0YWZ) obj).LJIJJ((List) awS99S0201000_14.l0, awS99S0201000_14.i2, (C0Y7P) awS99S0201000_14.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        ((C0YWZ) obj).LJJJLL(awS99S0201000_14.i2, (C0YC9) awS99S0201000_14.l1, (C869590Y9l) awS99S0201000_14.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS99S0201000_14 awS99S0201000_14, Object obj) {
        ((Assembler) obj).QQ2((UIAssem) awS99S0201000_14.l0, new AwS122S0101000_14(awS99S0201000_14.i2, (C902920ZbW) awS99S0201000_14.l1, 3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0201000_14(UIAssem uIAssem, C902920ZbW c902920ZbW, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.i2 = R.id.t0e;
        this.l1 = c902920ZbW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0201000_14(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c869590Y9l;
        this.l1 = c0yc9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS99S0201000_14(int i, int i2, StoryEditToolbarComponent storyEditToolbarComponent, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = storyEditToolbarComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0201000_14(int i, Number number, UnifiedShareSimpleProtocol unifiedShareSimpleProtocol, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = number;
        this.l1 = unifiedShareSimpleProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0201000_14(C907110ZiH c907110ZiH, InterfaceC859350XnR interfaceC859350XnR, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c907110ZiH;
        this.l1 = interfaceC859350XnR;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0201000_14(Activity activity, C913140Zs0 c913140Zs0, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = activity;
        this.l1 = c913140Zs0;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS99S0201000_14(List list, List<C869590Y9l> list2, int i, C0Y7P c0y7p) {
        super(1);
        this.$t = c0y7p;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
