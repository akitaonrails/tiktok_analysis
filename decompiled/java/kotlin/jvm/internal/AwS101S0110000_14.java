package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.C09AY;
import X.C0Y8T;
import X.C0YWZ;
import X.C0ZE8;
import X.C0ZHA;
import X.C1250280idm;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1516540pZE;
import X.C190Z;
import X.C23250099c;
import X.C857660Xki;
import X.C861800XrO;
import X.C867980Y3g;
import X.C878360Yd0;
import X.C878660YdU;
import X.C897370ZIh;
import X.C905250ZfH;
import X.C905260ZfI;
import X.InterfaceC897380ZIi;
import android.widget.TextView;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.messagelist.MessageListAndRelatedUIContentAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.msg.VibeMessageListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS101S0110000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        ((VibeMessageListViewModel) awS101S0110000_14.l0).setState(new AwS29S0010000_14(awS101S0110000_14.z1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        IMUserArchiveSettings iMUserArchiveSettings = (IMUserArchiveSettings) obj;
        if (iMUserArchiveSettings != null && Intrinsics.LJFF(iMUserArchiveSettings.autoArchiveInactiveConversation, Boolean.TRUE)) {
            List list = (List) awS101S0110000_14.l0;
            if (!awS101S0110000_14.z1) {
                list = null;
            }
            C23250099c.LIZLLL(C878360Yd0.LIZ(), null, null, new C878660YdU(list, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Function1) awS101S0110000_14.l0).invoke(Boolean.valueOf(zBooleanValue));
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJFF(C0ZHA.INTRO_PANEL, awS101S0110000_14.z1, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if (abstractC1250290idn instanceof C1251150ifB) {
            ((C1251150ifB) abstractC1250290idn).LIZLLL = awS101S0110000_14.z1;
        } else if (abstractC1250290idn instanceof C1250280idm) {
            ((TextView) ((BioEnrollFragment) awS101S0110000_14.l0).LLILZLL.getValue()).setEnabled(awS101S0110000_14.z1);
        } else if (abstractC1250290idn instanceof C1250300ido) {
            ((C1250300ido) abstractC1250290idn).LJ = awS101S0110000_14.z1;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        Assembler assembler = (Assembler) obj;
        if (awS101S0110000_14.z1) {
            assembler.QQ2((MessageListAndRelatedUIContentAssem) awS101S0110000_14.l0, AFwS248S0000000_14.get$arr$(220));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        return C190Z.LJFF((C190Z) obj, 0, false, false, new C861800XrO(C857660Xki.LIZIZ(((C905250ZfH) awS101S0110000_14.l0).O4(), ((C905250ZfH) awS101S0110000_14.l0).P4())), awS101S0110000_14.z1, 319);
    }

    public static final Object invoke$5(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        return C190Z.LJFF((C190Z) obj, 0, false, false, new C861800XrO(C857660Xki.LIZIZ(((C905260ZfI) awS101S0110000_14.l0).O4(), ((C905260ZfI) awS101S0110000_14.l0).P4())), awS101S0110000_14.z1, 319);
    }

    public static final Object invoke$6(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        ((C0YWZ) obj).LJJJIL((List) awS101S0110000_14.l0, awS101S0110000_14.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        C867980Y3g c867980Y3g = (C867980Y3g) obj;
        c867980Y3g.LJII = Boolean.valueOf(awS101S0110000_14.z1);
        Map<String, String> map = (Map) awS101S0110000_14.l0;
        C1516540pZE.LIZIZ(map);
        c867980Y3g.LJIILIIL = map;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Function1) awS101S0110000_14.l0).invoke(Boolean.valueOf(zBooleanValue));
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJFF(C0ZHA.INBOX_TITLE, awS101S0110000_14.z1, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS101S0110000_14 awS101S0110000_14, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Function1) awS101S0110000_14.l0).invoke(Boolean.valueOf(zBooleanValue));
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJFF(C0ZHA.CHAT, awS101S0110000_14.z1, zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(C905250ZfH c905250ZfH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c905250ZfH;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(C905260ZfI c905260ZfI, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c905260ZfI;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(VibeMessageListViewModel vibeMessageListViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = vibeMessageListViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0110000_14(List list, List<C0Y8T> list2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(AFwS229S0000000_2 aFwS229S0000000_2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = aFwS229S0000000_2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(AwS593S0100000_14 awS593S0100000_14, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS593S0100000_14;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(boolean z, BioEnrollFragment bioEnrollFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = bioEnrollFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0110000_14(boolean z, MessageListAndRelatedUIContentAssem messageListAndRelatedUIContentAssem, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = messageListAndRelatedUIContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0110000_14(boolean z, boolean z2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
