package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C09AY;
import X.C0PEM;
import X.C0XQ7;
import X.C1574740r56;
import X.C1575290r5z;
import X.C23250099c;
import X.C2450909j1;
import X.C426601lI;
import X.C636770OyJ;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC912680ZrG;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.vibefeed.feed.component.VibeRetentionComponent;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedInteractViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS27S2200000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS27S2200000_24 awS27S2200000_24, Object obj) {
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        String str = awS27S2200000_24.s0;
        String str2 = awS27S2200000_24.s1;
        EnumC912680ZrG enumC912680ZrG = (EnumC912680ZrG) awS27S2200000_24.l2;
        c1575290r5z.getClass();
        C1575290r5z.LJI(str, str2, "leave_popup", "leave", enumC912680ZrG);
        C2450909j1.LIZJ(new AwS568S0100000_24((VibeRetentionComponent) awS27S2200000_24.l3, 1498));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S2200000_24 awS27S2200000_24, Object obj) {
        String str;
        VibeFeedMenuAssem vibeFeedMenuAssem = (VibeFeedMenuAssem) awS27S2200000_24.l2;
        DialogC1389620mGW dialogC1389620mGW = vibeFeedMenuAssem.LLJIJIL;
        if (dialogC1389620mGW != null) {
            C786410Ut5.J4(dialogC1389620mGW);
        } else {
            Context context = vibeFeedMenuAssem.getContext();
            if (context != null) {
                DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(context);
                dialogC1389620mGW2.LJJLIIJ(true);
                vibeFeedMenuAssem.LLJIJIL = dialogC1389620mGW2;
                C786410Ut5.J4(dialogC1389620mGW2);
            }
        }
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        String str2 = awS27S2200000_24.s0;
        String str3 = awS27S2200000_24.s1;
        EnumC912680ZrG enumC912680ZrG = (EnumC912680ZrG) awS27S2200000_24.l3;
        c1575290r5z.getClass();
        C1575290r5z.LJI(str2, str3, "turn_off_popup", "turn_off", enumC912680ZrG);
        AssemVMLazy assemVMLazy = ((VibeFeedMenuAssem) awS27S2200000_24.l2).LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VibeFeedMenuAssem.LLJILJIL;
        VibeFeedInteractViewModel vibeFeedInteractViewModel = (VibeFeedInteractViewModel) assemVMLazy.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C636770OyJ c636770OyJGo = ((VibeFeedMenuAssem) awS27S2200000_24.l2).Go();
        if (c636770OyJGo == null || (str = c636770OyJGo.LLILLJJLI) == null) {
            str = "";
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(vibeFeedInteractViewModel), C0PEM.LIZJ, null, new C426601lI(vibeFeedInteractViewModel, curUserId, str, awS27S2200000_24.s0, (EnumC912680ZrG) awS27S2200000_24.l3, new C1574740r56((VibeFeedMenuAssem) awS27S2200000_24.l2), null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S2200000_24(VibeFeedMenuAssem vibeFeedMenuAssem, String str, String str2, EnumC912680ZrG enumC912680ZrG, int i) {
        super(1);
        this.$t = i;
        this.l2 = vibeFeedMenuAssem;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = enumC912680ZrG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S2200000_24(String str, String str2, EnumC912680ZrG enumC912680ZrG, VibeRetentionComponent vibeRetentionComponent, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = enumC912680ZrG;
        this.l3 = vibeRetentionComponent;
    }
}
