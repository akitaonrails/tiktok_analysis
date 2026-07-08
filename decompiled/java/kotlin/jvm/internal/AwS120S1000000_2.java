package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C0Y8T;
import X.C0YNP;
import X.C23250099c;
import X.C891120Yxa;
import X.C912600Zr8;
import X.InterfaceC863600XuI;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS120S1000000_2 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1000000_2(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS120S1000000_2 awS120S1000000_2, Object obj, Object obj2) {
        String str;
        final BaseSwitchActionViewModel baseSwitchActionViewModel = (BaseSwitchActionViewModel) obj;
        final boolean z = !baseSwitchActionViewModel.wQ2();
        String str2 = awS120S1000000_2.s0;
        baseSwitchActionViewModel.xQ2(z);
        ILogger.LIZ.getClass();
        ILogger iLoggerLIZ = C912600Zr8.LIZ();
        if (iLoggerLIZ != null) {
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            iLoggerLIZ.LJFF(str2, str, "chat_mute_click", C0I0B.LJFF.LIZIZ());
        }
        C0YNP.LIZIZ(str2).LJIIIIZZ(z, new InterfaceC863600XuI<C0Y8T>() { // from class: X.06ku
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                baseSwitchActionViewModel.xQ2(!z);
                IIMErrorUtils.LIZ.getClass();
                IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                if (iIMErrorUtilsLIZ != null) {
                    C0I0B.LJFF.LIZJ();
                    iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
            @Override // X.InterfaceC863600XuI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(X.C0Y8T r4) {
                /*
                    r3 = this;
                    X.0Y8T r4 = (X.C0Y8T) r4
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel<?> r2 = r1
                    if (r4 == 0) goto L11
                    boolean r1 = r4.isMute()
                    r0 = 1
                    if (r1 != r0) goto L11
                Ld:
                    r2.xQ2(r0)
                    return
                L11:
                    r0 = 0
                    goto Ld
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1698206ku.onSuccess(java.lang.Object):void");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS120S1000000_2 awS120S1000000_2, Object obj, Object obj2) {
        String str;
        BaseSwitchActionViewModel baseSwitchActionViewModel = (BaseSwitchActionViewModel) obj;
        int i = 1;
        boolean z = !baseSwitchActionViewModel.wQ2();
        String str2 = awS120S1000000_2.s0;
        baseSwitchActionViewModel.xQ2(z);
        ILogger.LIZ.getClass();
        ILogger iLoggerLIZ = C912600Zr8.LIZ();
        if (iLoggerLIZ != null) {
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            iLoggerLIZ.LJFF(str2, str, "chat_mute_click", C0I0B.LJFF.LIZIZ());
        }
        if (z) {
            i = 2;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel), null, null, new C891120Yxa(i, str2, null), 3);
        return Unit.LIZ;
    }
}
