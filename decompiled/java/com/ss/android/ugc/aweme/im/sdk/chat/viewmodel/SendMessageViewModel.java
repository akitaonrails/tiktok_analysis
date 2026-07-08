package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AbstractC2252651DEx;
import X.AnonymousClass0956;
import X.C01GW;
import X.C09IR;
import X.C0I35;
import X.C0IA7;
import X.C0IA9;
import X.C0IAC;
import X.C0IAF;
import X.C0IAH;
import X.C0IAJ;
import X.C0IAO;
import X.C0IAQ;
import X.C0PEM;
import X.C13LE;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.C869590Y9l;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class SendMessageViewModel extends AssemViewModel<C0IAJ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public AnonymousClass0956 LLILZ;
    public volatile C0I35 LLILZLL;
    public final AbstractC2252651DEx LL = C0PEM.LIZJ;
    public int LLILLJJLI = 1;
    public long LLILLL = -1;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1578));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SendMessageViewModel.class, "imChatRepositoryProvider", "getImChatRepositoryProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMChatRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0IAJ(0);
    }

    public final void vQ2(long j, String str, Function0 function0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILLL = jCurrentTimeMillis;
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), this.LL, null, new C0IA7(this, str, j, jCurrentTimeMillis, function0, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void xQ2(SendMessageViewModel sendMessageViewModel, CharSequence charSequence, String str, String str2, Map map, C0IAQ c0iaq, String str3, int i) {
        C869590Y9l c869590Y9l;
        C0IA9 c0ia9;
        String str4 = str3;
        String str5 = str2;
        C0IAQ c0iao = c0iaq;
        Map map2 = map;
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            map2 = null;
        }
        if ((i & 128) != 0) {
            c0iao = new C0IAO(null);
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        sendMessageViewModel.getClass();
        if (str != null && str.length() != 0) {
            if (charSequence != null && charSequence.length() != 0 && a0.LJLIIIL(charSequence.toString()).toString().length() != 0) {
                if (charSequence.length() > 6000) {
                    sendMessageViewModel.LLILLJJLI = 2;
                    sendMessageViewModel.setState(new AwS585S0100000_6(sendMessageViewModel, 114));
                    return;
                }
                sendMessageViewModel.setState(new AwS585S0100000_6(charSequence, 115));
                if ((c0iao instanceof C0IAO) && ((C0IAO) c0iao).LIZ == null) {
                    C0IAH<C869590Y9l> c0iah = sendMessageViewModel.getState().LLILLJJLI;
                    if ((c0iah instanceof C0IA9) && (c0ia9 = (C0IA9) c0iah) != null) {
                        c869590Y9l = (C869590Y9l) c0ia9.LIZ;
                    } else {
                        c869590Y9l = null;
                    }
                    c0iao = new C0IAO(c869590Y9l);
                }
                C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
                C23250099c.LIZLLL(C817503Hh.LL, sendMessageViewModel.LL, null, new C0IAC(sendMessageViewModel, charSequence, str, str5, null, c0iao, map2, null, null, str4, c2252331DDrLIZIZ, null), 2);
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(sendMessageViewModel), sendMessageViewModel.LL, null, new C0IAF(c2252331DDrLIZIZ, sendMessageViewModel, null), 2);
                return;
            }
            sendMessageViewModel.LLILLJJLI = 1;
            sendMessageViewModel.setState(new AwS585S0100000_6(sendMessageViewModel, 113));
            return;
        }
        sendMessageViewModel.LLILLJJLI = 3;
        sendMessageViewModel.setState(new AwS585S0100000_6(sendMessageViewModel, 112));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0322  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.lang.CharSequence r30, java.lang.String r31, java.lang.String r32, java.util.List<com.bytedance.ies.im.core.api.model.RichTextInfo> r33, X.C0IAQ r34, java.util.Map<java.lang.String, java.lang.String> r35, java.util.Map<java.lang.String, java.lang.String> r36, java.util.Map<java.lang.String, java.lang.String> r37, java.lang.String r38, X.InterfaceC1364105Vn<? super X.C0IAH<? extends java.lang.Object>> r39) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel.wQ2(java.lang.CharSequence, java.lang.String, java.lang.String, java.util.List, X.0IAQ, java.util.Map, java.util.Map, java.util.Map, java.lang.String, X.05Vn):java.lang.Object");
    }
}
