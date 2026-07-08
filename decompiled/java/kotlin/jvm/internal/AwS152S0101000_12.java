package kotlin.jvm.internal;

import X.C09AY;
import X.C0TFE;
import X.C0THL;
import X.C0TLX;
import X.C0TQG;
import X.C0TQR;
import X.C0UH7;
import X.C0UKC;
import X.C13LE;
import X.C14K9;
import X.C16F5;
import X.C21657819pQ;
import X.C249600xq;
import X.C743540TEq;
import X.C744020TGm;
import X.C767120U7i;
import X.C767210U7r;
import X.C768460UCm;
import X.C769230UFl;
import X.EnumC776090UcR;
import X.InterfaceC744130TGx;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS152S0101000_12 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS152S0101000_12 awS152S0101000_12) {
        ((C769230UFl) awS152S0101000_12.l0).LJI(awS152S0101000_12.i1);
        PreviewFilterStyleWidget previewFilterStyleWidget = (PreviewFilterStyleWidget) C0UKC.LJFF(C13LE.LIZ(PreviewFilterStyleWidget.class));
        if (previewFilterStyleWidget != null) {
            previewFilterStyleWidget.H1(((C767210U7r) ((C769230UFl) awS152S0101000_12.l0).LLIZ).LIZLLL(), ((C769230UFl) awS152S0101000_12.l0).LJFF().LIZLLL());
        }
        C768460UCm.LJFF();
        C769230UFl c769230UFl = (C769230UFl) awS152S0101000_12.l0;
        C767120U7i.LIZJ("FilterGestureDetector#initGesture#onFling", false);
        C767120U7i.LJI(c769230UFl.LL, "FilterGestureDetector#initGesture#onFling", false, false);
        C767120U7i.LIZ("FilterGestureDetector#initGesture#onFling");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS152S0101000_12 awS152S0101000_12) {
        ((C769230UFl) awS152S0101000_12.l0).LJI(awS152S0101000_12.i1);
        PreviewFilterStyleWidget previewFilterStyleWidget = (PreviewFilterStyleWidget) C0UKC.LJFF(C13LE.LIZ(PreviewFilterStyleWidget.class));
        if (previewFilterStyleWidget != null) {
            previewFilterStyleWidget.H1(((C767210U7r) ((C769230UFl) awS152S0101000_12.l0).LLIZ).LIZLLL(), ((C769230UFl) awS152S0101000_12.l0).LJFF().LIZLLL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS152S0101000_12 awS152S0101000_12) {
        Function1<? super Integer, Unit> function1 = ((C0TLX) awS152S0101000_12.l0).LLILZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(awS152S0101000_12.i1));
        }
        return Unit.LIZ;
    }

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
    public static final Object invoke$2(AwS152S0101000_12 awS152S0101000_12) {
        C0TQG c0tqg;
        C0TQR<DATA> c0tqr;
        if (!((C0TQG) awS152S0101000_12.l0).LLLIIIIL() && (c0tqr = (c0tqg = (C0TQG) awS152S0101000_12.l0).LLILLL) != 0) {
            int i = awS152S0101000_12.i1;
            c0tqr.LJJIFFI(i, ListProtector.get(c0tqg.LLILLJJLI, i));
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AwS152S0101000_12 awS152S0101000_12) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(awS152S0101000_12.i1);
        View view = (View) awS152S0101000_12.l0;
        if (view != null) {
            C14K9.LJIILLIIL(view, colorStateListValueOf);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$4(AwS152S0101000_12 awS152S0101000_12) {
        String eventKey;
        if (((LiveHostSettingFragmentSheet) awS152S0101000_12.l0).LLLIIIIL.add(Integer.valueOf(awS152S0101000_12.i1))) {
            C0UH7 c0uh7 = EnumC776090UcR.Companion;
            int i = awS152S0101000_12.i1;
            c0uh7.getClass();
            EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i);
            if (enumC776090UcRLIZ == null || (eventKey = enumC776090UcRLIZ.getEventKey()) == null) {
                eventKey = "";
            }
            LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = (LiveHostSettingFragmentSheet) awS152S0101000_12.l0;
            C249600xq.LIZ("show", eventKey, liveHostSettingFragmentSheet.LLLIZZ, liveHostSettingFragmentSheet.LLJZ, null);
        }
        C21657819pQ c21657819pQRemove = ((LiveHostSettingFragmentSheet) awS152S0101000_12.l0).LLLIIIL.remove(Integer.valueOf(awS152S0101000_12.i1));
        if (c21657819pQRemove != null) {
            c21657819pQRemove.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS152S0101000_12 awS152S0101000_12) {
        C0THL c0thl = C744020TGm.LIZJ;
        if (c0thl != null) {
            c0thl.LJFF(awS152S0101000_12.i1, (Intent) awS152S0101000_12.l0);
        }
        C0THL c0thl2 = C744020TGm.LIZJ;
        if (c0thl2 != null && c0thl2.LIZLLL != null) {
            C744020TGm.LJII();
        } else {
            InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
            if (interfaceC744130TGx != null) {
                interfaceC744130TGx.LJFF(10092);
            }
            C743540TEq.LJJIIJ(true, 10092, 0, "media projection is null");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS152S0101000_12 awS152S0101000_12) {
        if (((GameCastWiredFragmentV2) awS152S0101000_12.l0).isAdded() && ((GameCastWiredFragmentV2) awS152S0101000_12.l0).getContext() != null) {
            C744020TGm.LJIIJ(((GameCastWiredFragmentV2) awS152S0101000_12.l0).getContext());
            GameCastWiredFragmentV2 gameCastWiredFragmentV2 = (GameCastWiredFragmentV2) awS152S0101000_12.l0;
            gameCastWiredFragmentV2.LLILLJJLI = false;
            C16F5 c16f5 = gameCastWiredFragmentV2.LLIZ;
            if (c16f5 != null) {
                C0TFE c0tfe = C0TFE.LIZ;
                Context context = gameCastWiredFragmentV2.getContext();
                int i = awS152S0101000_12.i1;
                c0tfe.getClass();
                c16f5.setText(C0TFE.LJFF(i, context));
            }
            ((GameCastWiredFragmentV2) awS152S0101000_12.l0).NR();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS152S0101000_12 awS152S0101000_12) {
        if (((GameCastWiredFragmentV2) awS152S0101000_12.l0).isAdded() && ((GameCastWiredFragmentV2) awS152S0101000_12.l0).getContext() != null) {
            GameCastWiredFragmentV2 gameCastWiredFragmentV2 = (GameCastWiredFragmentV2) awS152S0101000_12.l0;
            Context context = gameCastWiredFragmentV2.getContext();
            int i = awS152S0101000_12.i1;
            if (!gameCastWiredFragmentV2.LL) {
                C0TFE c0tfe = C0TFE.LIZ;
                AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(gameCastWiredFragmentV2, 284);
                c0tfe.getClass();
                C0TFE.LJIIL(i, context, awS556S0100000_12);
                gameCastWiredFragmentV2.LL = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS152S0101000_12 awS152S0101000_12) {
        if (((GameCastWiredFragment) awS152S0101000_12.l0).isAdded() && ((GameCastWiredFragment) awS152S0101000_12.l0).getContext() != null) {
            C744020TGm.LJIIJ(((GameCastWiredFragment) awS152S0101000_12.l0).getContext());
            GameCastWiredFragment gameCastWiredFragment = (GameCastWiredFragment) awS152S0101000_12.l0;
            gameCastWiredFragment.LLILLJJLI = false;
            C16F5 c16f5 = gameCastWiredFragment.LLIZ;
            if (c16f5 != null) {
                C0TFE c0tfe = C0TFE.LIZ;
                Context context = gameCastWiredFragment.getContext();
                int i = awS152S0101000_12.i1;
                c0tfe.getClass();
                c16f5.setText(C0TFE.LJFF(i, context));
            }
            ((GameCastWiredFragment) awS152S0101000_12.l0).NR();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS152S0101000_12 awS152S0101000_12) {
        if (((GameCastWiredFragment) awS152S0101000_12.l0).isAdded() && ((GameCastWiredFragment) awS152S0101000_12.l0).getContext() != null) {
            GameCastWiredFragment gameCastWiredFragment = (GameCastWiredFragment) awS152S0101000_12.l0;
            Context context = gameCastWiredFragment.getContext();
            int i = awS152S0101000_12.i1;
            if (!gameCastWiredFragment.LL) {
                C0TFE c0tfe = C0TFE.LIZ;
                AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(gameCastWiredFragment, 279);
                c0tfe.getClass();
                C0TFE.LJIIL(i, context, awS556S0100000_12);
                gameCastWiredFragment.LL = true;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(int i, LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = liveHostSettingFragmentSheet;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(C0TLX c0tlx, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0tlx;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(C0TQG c0tqg, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0tqg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(C769230UFl c769230UFl, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c769230UFl;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(GameCastWiredFragment gameCastWiredFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = gameCastWiredFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(GameCastWiredFragmentV2 gameCastWiredFragmentV2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = gameCastWiredFragmentV2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0101000_12(Fragment fragment, Intent intent, int i, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = intent;
    }
}
