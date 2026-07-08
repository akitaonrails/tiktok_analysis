package kotlin.jvm.internal;

import X.C09AY;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C940470aa5;
import X.EnumC918990a1R;
import X.InterfaceC937900aVw;
import X.InterfaceC940230aZh;
import X.InterfaceC940380aZw;
import X.InterfaceC954180awC;
import X.ViewTreeObserverOnGlobalLayoutListenerC940540aaC;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS19S1110000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS19S1110000_15 awS19S1110000_15) {
        InterfaceC937900aVw interfaceC937900aVw;
        ViewTreeObserver viewTreeObserver;
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dropup layout container source:");
        sbLIZ.append(awS19S1110000_15.s0);
        sbLIZ.append(" destroy:");
        sbLIZ.append(awS19S1110000_15.z2);
        C940470aa5.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        Object obj = ((C940470aa5) awS19S1110000_15.l1).LLJ;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C786410Ut5.Jc(view, 0.0f);
        }
        FrameLayout frameLayout = ((C940470aa5) awS19S1110000_15.l1).LLIZLLLIL;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC940540aaC viewTreeObserverOnGlobalLayoutListenerC940540aaC = ((C940470aa5) awS19S1110000_15.l1).LLJL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC940540aaC);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC940540aaC, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C940470aa5 c940470aa5 = (C940470aa5) awS19S1110000_15.l1;
        InterfaceC937900aVw interfaceC937900aVw2 = c940470aa5.LLIZ;
        if (interfaceC937900aVw2 != null) {
            interfaceC937900aVw2.LJLJLJ(c940470aa5);
        }
        if (awS19S1110000_15.z2 && (interfaceC937900aVw = ((C940470aa5) awS19S1110000_15.l1).LLIZ) != null) {
            interfaceC937900aVw.LJIJ(awS19S1110000_15.s0);
        }
        InterfaceC940230aZh interfaceC940230aZh = ((C940470aa5) awS19S1110000_15.l1).LLJJJIL;
        if (interfaceC940230aZh != null) {
            interfaceC940230aZh.LJ(EnumC918990a1R.NORMAL.getBusinessType());
        }
        if (awS19S1110000_15.z2) {
            InterfaceC940380aZw interfaceC940380aZw = ((C940470aa5) awS19S1110000_15.l1).LL;
            if (interfaceC940380aZw != null) {
                interfaceC940380aZw.release();
            }
            ((C940470aa5) awS19S1110000_15.l1).LL = null;
        }
        ((C940470aa5) awS19S1110000_15.l1).LLILLL.set(false);
        ((C940470aa5) awS19S1110000_15.l1).LLJLIL.LIZ();
        ((C940470aa5) awS19S1110000_15.l1).LLJJL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S1110000_15 awS19S1110000_15) {
        C915980Zwa.LJII().LJJIIZ(awS19S1110000_15.s0, ((InterfaceC954180awC) awS19S1110000_15.l1).LJ(awS19S1110000_15.s0));
        if (awS19S1110000_15.z2) {
            C766270U4b.LIZLLL(2131842786);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS19S1110000_15 awS19S1110000_15) {
        ((VoiceChatWatchWidget) awS19S1110000_15.l1).H1(awS19S1110000_15.s0, awS19S1110000_15.z2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1110000_15(C940470aa5 c940470aa5, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c940470aa5;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1110000_15(InterfaceC954180awC interfaceC954180awC, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC954180awC;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1110000_15(VoiceChatWatchWidget voiceChatWatchWidget, boolean z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = voiceChatWatchWidget;
        this.z2 = z;
        this.s0 = str;
    }
}
