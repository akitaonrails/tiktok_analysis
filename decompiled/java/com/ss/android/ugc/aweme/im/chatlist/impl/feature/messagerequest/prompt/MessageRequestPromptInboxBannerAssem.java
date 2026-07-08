package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.prompt;

import X.C0PEM;
import X.C0YG2;
import X.C0Z4E;
import X.C1308910kAL;
import X.C2252321DDq;
import X.C23250099c;
import X.C637030Oyj;
import X.C637040Oyk;
import X.C637060Oym;
import X.C876470YZx;
import X.C876610YaB;
import X.C878790Ydh;
import X.C882950YkP;
import X.C888640Yta;
import X.C888800Ytq;
import X.EnumC637310OzB;
import X.InterfaceC885550Yob;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptData;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPromptInboxBannerAssem extends InboxBannerAssem implements InterfaceC885550Yob, C0YG2 {
    public C888640Yta LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0YG2
    public final void xf0(C876610YaB c876610YaB) {
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        Function0<Unit> function0;
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        C888640Yta c888640Yta = this.LLILZ;
        if (c888640Yta != null && (function0 = c888640Yta.LJII) != null) {
            function0.invoke();
        }
        C0Z4E.LIZ.getClass();
        C0Z4E.LJIIJ("inbox_banner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ho() {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = getContext();
        c0z4e.getClass();
        C888640Yta c888640YtaLJ = C0Z4E.LJ(context, "inbox_banner");
        if (c888640YtaLJ == null) {
            return;
        }
        this.LLILZ = c888640YtaLJ;
        C2252321DDq c2252321DDq = this.LL;
        EnumC637310OzB enumC637310OzB = EnumC637310OzB.TOP_SHOW;
        String str = "message_request_prompt";
        String str2 = "message_request_prompt";
        String str3 = c888640YtaLJ.LIZ;
        UrlModel urlModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Context context2 = getContext();
        c2252321DDq.setValue(new Pair(enumC637310OzB, new C637060Oym(str, str2, str3, urlModel, new C637040Oyk(R.raw.icon_bell_activation, context2 != null ? C1308910kAL.LIZJ(R.attr.a04, context2) : null), objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, new C637030Oyj(c888640YtaLJ.LIZJ, null), true, new AwS375S0200000_9(this, c888640YtaLJ, 38), objArr == true ? 1 : 0, 9176)));
    }

    @Override // X.InterfaceC885550Yob
    public final void S6() {
        this.LLILZIL = C878790Ydh.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Integer num;
        super.onCreate();
        this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        C0Z4E.LIZ.getClass();
        ((ArrayList) C0Z4E.LIZJ).add(this);
        MessageRequestPromptData messageRequestPromptData = C888800Ytq.LIZLLL().inboxBannerPromptData;
        if (messageRequestPromptData == null || (num = messageRequestPromptData.timing) == null || num.intValue() != 2) {
            return;
        }
        C876470YZx.LIZ().LJIIIZ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        Integer num;
        super.onDestroy();
        C0Z4E.LIZ.getClass();
        ((ArrayList) C0Z4E.LIZJ).remove(this);
        MessageRequestPromptData messageRequestPromptData = C888800Ytq.LIZLLL().inboxBannerPromptData;
        if (messageRequestPromptData == null || (num = messageRequestPromptData.timing) == null || num.intValue() != 2) {
            return;
        }
        C876470YZx.LIZ().LJIIL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        MessageRequestPromptData messageRequestPromptData;
        Integer num;
        Integer num2;
        Function0<Unit> function0;
        super.onResume();
        if (this.LLIZ) {
            C888640Yta c888640Yta = this.LLILZ;
            if (c888640Yta != null && (function0 = c888640Yta.LJFF) != null) {
                function0.invoke();
            }
            this.LLIZ = false;
        }
        if (this.LLILZIL) {
            MessageRequestPromptData messageRequestPromptData2 = C888800Ytq.LIZLLL().inboxBannerPromptData;
            if ((messageRequestPromptData2 == null || (num2 = messageRequestPromptData2.timing) == null || num2.intValue() != 1) && ((messageRequestPromptData = C888800Ytq.LIZLLL().inboxBannerPromptData) == null || (num = messageRequestPromptData.timing) == null || num.intValue() != 0)) {
                return;
            }
            this.LLILZIL = false;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C882950YkP(this, null), 2);
        }
    }

    @Override // X.C0YG2
    public final void I02(List<String> list) {
        if (!list.isEmpty()) {
            ho();
        }
    }
}
